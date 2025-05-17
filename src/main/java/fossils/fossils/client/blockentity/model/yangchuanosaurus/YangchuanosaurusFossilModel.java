package fossils.fossils.client.blockentity.model.yangchuanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YangchuanosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbaseflesh;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Noseslope;
	private final ModelPart Foreheadslope;
	private final ModelPart Lowerjaw;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawfrontslope;
	private final ModelPart Lowerteethfront;
	private final ModelPart Lowerteethmiddle;
	private final ModelPart Lowerteethback;
	private final ModelPart Lowerjawmiddleback2;
	private final ModelPart Lowerjawmiddlefront2;
	private final ModelPart Lowerjawfront2;
	private final ModelPart Lowerjawfrontslope2;
	private final ModelPart Lowerteethfront2;
	private final ModelPart Lowerteethmiddle2;
	private final ModelPart Lowerteethback2;
	private final ModelPart Lowerjawmidbaseslope;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;

	public YangchuanosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbaseflesh = this.Bodyfront.getChild("Neckbaseflesh");
		this.Neck1 = this.Neckbaseflesh.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Noseslope = this.Upperjawfront.getChild("Noseslope");
		this.Foreheadslope = this.Noseslope.getChild("Foreheadslope");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Lowerjawmiddleback = this.Lowerjaw.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerjawfrontslope = this.Lowerjawfront.getChild("Lowerjawfrontslope");
		this.Lowerteethfront = this.Lowerjawfront.getChild("Lowerteethfront");
		this.Lowerteethmiddle = this.Lowerjawmiddlefront.getChild("Lowerteethmiddle");
		this.Lowerteethback = this.Lowerjawmiddleback.getChild("Lowerteethback");
		this.Lowerjawmiddleback2 = this.Lowerjaw.getChild("Lowerjawmiddleback2");
		this.Lowerjawmiddlefront2 = this.Lowerjawmiddleback2.getChild("Lowerjawmiddlefront2");
		this.Lowerjawfront2 = this.Lowerjawmiddlefront2.getChild("Lowerjawfront2");
		this.Lowerjawfrontslope2 = this.Lowerjawfront2.getChild("Lowerjawfrontslope2");
		this.Lowerteethfront2 = this.Lowerjawfront2.getChild("Lowerteethfront2");
		this.Lowerteethmiddle2 = this.Lowerjawmiddlefront2.getChild("Lowerteethmiddle2");
		this.Lowerteethback2 = this.Lowerjawmiddleback2.getChild("Lowerteethback2");
		this.Lowerjawmidbaseslope = this.Lowerjaw.getChild("Lowerjawmidbaseslope");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone = this.Neck2.getChild("bone");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.4945F, 3.074F, -0.1485F, 0.0F, -0.0863F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, 0.0F, -12.0F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7855F, 7.2608F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(129, 131).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(129, 131).addBox(2.9F, -1.0F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.7F, 5.7761F, 3.3587F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-0.0667F, 0.0689F, -0.6819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(115, 140).mirror().addBox(-0.0667F, 0.0689F, -0.1819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 8.7359F, 5.1154F, 0.8964F, 0.1586F, -0.1417F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(136, 83).mirror().addBox(0.1F, -3.7F, -3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(136, 83).addBox(3.5F, -3.7F, -3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.3F, 2.9257F, 0.5792F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 115).mirror().addBox(0.1F, 0.3F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(55, 115).addBox(3.5F, 0.3F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, 2.9257F, 0.5792F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(136, 97).mirror().addBox(-0.5F, -1.5F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6873F, 3.8258F, -5.0259F, 1.7467F, 0.084F, 0.5265F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(124, 55).mirror().addBox(-0.0054F, 2.3288F, 0.1603F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1411F, 7.934F, -4.1162F, 0.1222F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(125, 7).mirror().addBox(-0.0054F, -2.5194F, 3.5777F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1411F, 7.934F, -4.1162F, -0.8203F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 130).mirror().addBox(0.2F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 130).addBox(3.4F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 7.6764F, -2.319F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(-0.0054F, 0.0732F, 0.0253F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1411F, 7.934F, -4.1162F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(123, 135).mirror().addBox(0.2869F, -1.7018F, 0.5175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 8.7359F, 5.1154F, -1.4496F, 0.1184F, -0.1694F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 82).mirror().addBox(0.1F, -0.4F, -3.3F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(23, 82).addBox(3.5F, -0.4F, -3.3F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3F, 2.9257F, 0.5792F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(136, 92).mirror().addBox(-0.5F, -0.8F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.8241F, 2.0516F, -6.7504F, 1.1446F, 0.084F, 0.5265F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(121, 36).mirror().addBox(-0.5F, -1.8F, -0.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6873F, 3.8258F, -5.0259F, 2.183F, 0.084F, 0.5265F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 145).mirror().addBox(-0.5F, -1.05F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4285F, 1.5121F, -5.9083F, 0.8828F, 0.084F, 0.5265F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(0.6985F, -5.0849F, -3.455F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1813F, -1.0098F, -4.1346F, 2.5321F, 0.084F, 0.5265F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(97, 121).mirror().addBox(0.6985F, -0.2902F, -2.8797F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1813F, -1.0098F, -4.1346F, 0.6646F, 0.084F, 0.5265F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 107).mirror().addBox(0.5159F, -0.2067F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.1813F, -1.6098F, -0.3346F, 0.1609F, -0.0679F, 0.3959F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-0.4919F, 0.6042F, -2.4059F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, 0.8804F, 5.2995F, 0.0738F, -0.1965F, 0.4202F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-0.4919F, -1.325F, -1.6642F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, 0.8804F, 5.2995F, -0.4585F, -0.1965F, 0.4202F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 94).mirror().addBox(-0.5F, -2.3F, -3.9F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1422F, 1.1981F, 3.1654F, -0.1396F, 0.0F, 0.4014F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-0.4919F, -0.1654F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2787F, 0.8804F, 5.2995F, -0.2403F, -0.1965F, 0.4202F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(123, 21).addBox(-0.5081F, -0.1654F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2787F, 0.8804F, 5.2995F, -0.2403F, 0.1965F, -0.4202F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(17, 94).addBox(-0.5F, -2.3F, -3.9F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1422F, 1.1981F, 3.1654F, -0.1396F, 0.0F, -0.4014F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(97, 107).addBox(-0.5081F, -1.325F, -1.6642F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2787F, 0.8804F, 5.2995F, -0.4585F, 0.1965F, -0.4202F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(93, 21).addBox(-0.5081F, 0.6042F, -2.4059F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2787F, 0.8804F, 5.2995F, 0.0738F, 0.1965F, -0.4202F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(86, 107).addBox(-1.5159F, -0.2067F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.1813F, -1.6098F, -0.3346F, 0.1609F, 0.0679F, -0.3959F));

		PartDefinition cube_r27 = Hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(97, 121).addBox(-1.6985F, -0.2902F, -2.8797F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1813F, -1.0098F, -4.1346F, 0.6646F, -0.084F, -0.5265F));

		PartDefinition cube_r28 = Hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(132, 6).addBox(-1.6985F, -5.0849F, -3.455F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1813F, -1.0098F, -4.1346F, 2.5321F, -0.084F, -0.5265F));

		PartDefinition cube_r29 = Hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(95, 145).addBox(-0.5F, -1.05F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.4285F, 1.5121F, -5.9083F, 0.8828F, -0.084F, -0.5265F));

		PartDefinition cube_r30 = Hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(136, 97).addBox(-0.5F, -1.5F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.6873F, 3.8258F, -5.0259F, 1.7467F, -0.084F, -0.5265F));

		PartDefinition cube_r31 = Hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(121, 36).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6873F, 3.8258F, -5.0259F, 2.183F, -0.084F, -0.5265F));

		PartDefinition cube_r32 = Hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(136, 92).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.8241F, 2.0516F, -6.7504F, 1.1446F, -0.084F, -0.5265F));

		PartDefinition cube_r33 = Hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(141, 0).addBox(-0.9333F, 0.0689F, -0.6819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(115, 140).addBox(-0.9333F, 0.0689F, -0.1819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.8964F, -0.1586F, 0.1417F));

		PartDefinition cube_r34 = Hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(123, 135).addBox(-1.2869F, -1.7018F, 0.5175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.3F, 8.7359F, 5.1154F, -1.4496F, -0.1184F, 0.1694F));

		PartDefinition cube_r35 = Hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 141).addBox(-1.4013F, 3.9468F, -0.1517F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.7581F, -0.0238F, 0.1339F));

		PartDefinition cube_r36 = Hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(141, 78).addBox(-1.4013F, 3.9592F, -0.4059F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.9327F, -0.0238F, 0.1339F));

		PartDefinition cube_r37 = Hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(147, 46).addBox(-1.1348F, 8.0165F, -2.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.9254F, -0.0795F, 0.1362F));

		PartDefinition cube_r38 = Hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 140).addBox(-1.1348F, 6.9363F, 3.0497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.2272F, -0.0795F, 0.1362F));

		PartDefinition cube_r39 = Hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 136).addBox(-1.4013F, 4.1392F, 4.4129F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 0.0164F, -0.0238F, 0.1339F));

		PartDefinition cube_r40 = Hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(145, 87).addBox(-1.4013F, 6.9034F, -1.3367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 1.0636F, -0.0238F, 0.1339F));

		PartDefinition cube_r41 = Hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(9, 123).addBox(-1.4013F, 4.9834F, -7.9682F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(135, 123).addBox(-1.4013F, 6.6834F, -6.9682F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 1.6221F, -0.0238F, 0.1339F));

		PartDefinition cube_r42 = Hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(136, 12).addBox(-1.4013F, 1.6054F, -10.5089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 8.7359F, 5.1154F, 2.1893F, -0.0238F, 0.1339F));

		PartDefinition cube_r43 = Hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 68).addBox(-0.9946F, 0.0732F, 0.0253F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition cube_r44 = Hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(125, 7).addBox(-0.9946F, -2.5194F, 3.5777F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, -0.8203F, 0.0F, 0.1745F));

		PartDefinition cube_r45 = Hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(124, 55).addBox(-0.9946F, 2.3288F, 0.1603F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.1222F, 0.0F, 0.1745F));

		PartDefinition cube_r46 = Hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 130).addBox(-1.2676F, 5.7417F, 2.0033F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(7, 135).addBox(-1.2676F, 5.7417F, 1.0033F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, -0.0191F, -0.0242F, 0.1201F));

		PartDefinition cube_r47 = Hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 135).addBox(-3.1369F, 3.295F, -11.5584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 1.3176F, 0.0061F, -0.0518F));

		PartDefinition cube_r48 = Hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(86, 99).addBox(-3.1369F, 11.6461F, -3.0933F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.3141F, 0.0061F, -0.0518F));

		PartDefinition cube_r49 = Hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(138, 139).addBox(-3.1369F, -11.302F, -5.5646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 3.0455F, 0.0061F, -0.0518F));

		PartDefinition cube_r50 = Hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(147, 43).addBox(-3.1369F, 11.3693F, -4.1709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.3664F, 0.0061F, -0.0518F));

		PartDefinition cube_r51 = Hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(147, 40).addBox(-3.1369F, 9.0512F, 8.3822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, -0.6546F, 0.0061F, -0.0518F));

		PartDefinition cube_r52 = Hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(119, 49).addBox(-3.188F, 12.4134F, -3.0165F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.3175F, 0.0096F, -0.0567F));

		PartDefinition cube_r53 = Hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(147, 37).addBox(-3.188F, 12.0581F, -3.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.6317F, 0.0096F, -0.0567F));

		PartDefinition cube_r54 = Hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(22, 147).addBox(-3.188F, 11.4829F, -4.405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1411F, 7.934F, -4.1162F, 0.8062F, 0.0096F, -0.0567F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(37, 37).addBox(-1.0F, -0.9F, -6.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3F, 1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9306F, -5.2316F, 0.13F, -0.2132F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(68, 0).addBox(-4.0F, 10.9F, 5.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 67).addBox(-3.5F, 13.9F, -1.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(68, 37).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.9F, -8.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(74, 12).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.8447F, -11.2563F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(95, 143).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1611F, -1.8971F, -0.1022F, -0.0689F, -0.6128F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(130, 50).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1611F, -1.8971F, -0.0541F, -0.1107F, -1.1369F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(147, 110).mirror().addBox(-5.7277F, -3.3082F, -0.3891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1611F, -1.8971F, -0.002F, -0.1231F, -1.5761F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(143, 94).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1389F, -4.8971F, -0.0705F, -0.054F, -0.5624F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(130, 40).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1389F, -4.8971F, -0.034F, -0.082F, -1.0865F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(130, 48).mirror().addBox(-8.7277F, -3.3082F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1389F, -4.8971F, 0.0039F, -0.0887F, -1.5244F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(143, 92).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -7.8971F, 0.04F, -0.0017F, -0.5305F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(130, 38).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -7.8971F, 0.0355F, 0.0185F, -1.0538F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(110, 96).mirror().addBox(-11.7277F, -3.3082F, -0.3891F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -7.8971F, 0.0244F, 0.0317F, -1.4901F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(143, 85).mirror().addBox(-1.9575F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -10.7971F, 0.0952F, 0.0245F, -0.5125F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-5.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -10.7971F, 0.0703F, 0.0687F, -1.0348F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(101, 90).mirror().addBox(-12.7277F, -3.3082F, -0.3892F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -10.7971F, 0.0346F, 0.092F, -1.472F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-13.7277F, -3.3082F, -0.3892F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -13.7971F, 0.0435F, 0.1436F, -1.4535F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(130, 4).mirror().addBox(-5.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -13.7971F, 0.1003F, 0.1117F, -1.0147F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(143, 83).mirror().addBox(-1.9575F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4389F, -13.7971F, 0.1425F, 0.0468F, -0.4933F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(147, 110).addBox(4.7277F, -3.3082F, -0.3891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1611F, -1.8971F, -0.002F, 0.1231F, 1.5761F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(130, 50).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1611F, -1.8971F, -0.0541F, 0.1107F, 1.1369F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(95, 143).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1611F, -1.8971F, -0.1022F, 0.0689F, 0.6128F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(130, 48).addBox(4.7277F, -3.3082F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1389F, -4.8971F, 0.0039F, 0.0887F, 1.5244F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(130, 40).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1389F, -4.8971F, -0.034F, 0.082F, 1.0865F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(143, 94).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1389F, -4.8971F, -0.0705F, 0.054F, 0.5624F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(110, 96).addBox(4.7277F, -3.3082F, -0.3891F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -7.8971F, 0.0244F, -0.0317F, 1.4901F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(130, 38).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -7.8971F, 0.0355F, -0.0185F, 1.0538F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(143, 92).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -7.8971F, 0.04F, 0.0017F, 0.5305F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(101, 90).addBox(4.7277F, -3.3082F, -0.3892F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -10.7971F, 0.0346F, -0.092F, 1.472F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(130, 36).addBox(1.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -10.7971F, 0.0703F, -0.0687F, 1.0348F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(143, 85).addBox(-0.0425F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -10.7971F, 0.0952F, -0.0245F, 0.5125F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(143, 83).addBox(-0.0425F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -13.7971F, 0.1425F, -0.0468F, 0.4933F));

		PartDefinition Bodyfront_r29 = Bodymiddle.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(130, 4).addBox(1.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -13.7971F, 0.1003F, -0.1117F, 1.0147F));

		PartDefinition Bodyfront_r30 = Bodymiddle.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(97, 17).addBox(4.7277F, -3.3082F, -0.3892F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4389F, -13.7971F, 0.0435F, -0.1436F, 1.4535F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(48, 78).addBox(-1.0F, 0.9714F, -7.217F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.9484F, -8.3905F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Bodymiddle.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(47, 119).addBox(0.0F, -6.6F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4481F, -2.6915F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Bodymiddle.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(17, 84).addBox(0.0F, -4.6F, 8.6F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7484F, -13.9905F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r3 = Bodymiddle.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(48, 68).addBox(0.0F, -6.1F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.028F, -8.6642F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Bodymiddle.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(78, 124).addBox(0.0F, -5.8545F, -1.9678F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1233F, -9.6432F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r5 = Bodymiddle.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(73, 124).addBox(0.0F, -5.7F, -2.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1593F, -12.6143F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5657F, -15.5012F, 0.1055F, -0.1285F, -0.025F));

		PartDefinition Bodyfront_r31 = Bodyfront.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(57, 124).addBox(0.0F, -5.4828F, 0.0672F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1623F, -2.1525F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r32 = Bodyfront.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(52, 124).addBox(0.0F, -5.3828F, -0.0328F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.04F, -5.0455F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 119).mirror().addBox(-0.5F, 1.2388F, 6.7551F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3034F, -16.6298F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-8.4F, 0.0F, -0.1F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7219F, 13.9608F, -10.0934F, -0.2214F, 0.9897F, -0.1488F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(109, 134).mirror().addBox(-0.5173F, -1.97F, -1.8137F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6611F, 9.7207F, -9.5547F, -0.1716F, -0.0474F, 0.0707F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(108, 7).mirror().addBox(-7.4F, 0.0F, -0.1F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7219F, 13.9608F, -10.0934F, 0.0507F, 0.8907F, 0.1613F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-6.0F, 0.0F, -0.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7226F, 13.9802F, -10.1873F, -0.3532F, 0.87F, 0.1021F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 122).mirror().addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0411F, 13.1287F, -10.8288F, -0.8172F, 0.8948F, 0.1137F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7464F, 0.5825F, -1.0536F, 0.8144F, -0.0578F, 0.0624F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(25, 119).mirror().addBox(-0.4505F, -0.2575F, -1.6779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7778F, 1.9606F, -2.9632F, 0.5353F, -0.0474F, 0.0707F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3888F, 10.5959F, -13.4984F, -1.0278F, -0.1376F, 0.2234F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(142, 120).mirror().addBox(-3.6649F, 0.2629F, -4.8009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2819F, 6.9865F, -9.4685F, 0.311F, -0.8241F, -0.4725F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(97, 134).mirror().addBox(-3.6649F, -2.1768F, -4.3013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2819F, 6.9865F, -9.4685F, 0.8695F, -0.8241F, -0.4725F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(108, 120).mirror().addBox(-3.6649F, -0.1282F, -5.2932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2819F, 6.9865F, -9.4685F, 0.7822F, -0.8241F, -0.4725F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(129, 14).mirror().addBox(-0.7681F, -3.5825F, -2.084F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2819F, 6.9865F, -9.4685F, 1.2566F, -0.1047F, 0.0F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(114, 77).mirror().addBox(-0.7685F, 0.0726F, -3.8476F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3559F, 4.185F, -8.2577F, 0.8273F, -0.0996F, 0.0168F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-0.5173F, -0.9591F, -2.142F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6779F, 3.6606F, -5.9632F, 0.6575F, -0.0461F, 0.0715F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(129, 84).mirror().addBox(-0.5173F, 0.73F, -7.8137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4028F, 3.6606F, -5.9632F, 0.4829F, -0.0474F, 0.0707F));

		PartDefinition Bodyfront_r33 = Bodyfront.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(130, 2).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -11.6959F, 0.203F, 0.2541F, -1.0308F));

		PartDefinition Bodyfront_r34 = Bodyfront.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(79, 143).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -11.6959F, 0.3014F, 0.1204F, -0.5149F));

		PartDefinition Bodyfront_r35 = Bodyfront.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(100, 54).mirror().addBox(-12.7277F, -3.3082F, -0.3891F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -11.6959F, 0.0743F, 0.3155F, -1.4813F));

		PartDefinition Bodyfront_r36 = Bodyfront.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(17, 143).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -9.6959F, 0.2615F, 0.1023F, -0.4495F));

		PartDefinition Bodyfront_r37 = Bodyfront.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -9.6959F, 0.1768F, 0.2187F, -0.9671F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-13.7277F, -3.3082F, -0.3891F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8268F, -9.6959F, 0.0664F, 0.2726F, -1.4138F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(143, 14).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7268F, -7.1959F, 0.1821F, 0.0654F, -0.4387F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(120, 129).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7268F, -7.1959F, 0.1255F, 0.1475F, -0.959F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-13.7277F, -3.3082F, -0.3891F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7268F, -7.1959F, 0.051F, 0.1866F, -1.3999F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(140, 128).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -4.1959F, 0.0873F, 0.0207F, -0.4428F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -4.1959F, 0.0653F, 0.0616F, -0.9653F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-14.7277F, -3.3082F, -0.3891F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -4.1959F, 0.0331F, 0.0834F, -1.4023F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(39, 15).mirror().addBox(-14.7277F, -3.3082F, -0.3891F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -1.1959F, 0.0214F, 0.0145F, -1.4378F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(128, 66).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -1.1959F, 0.0256F, 0.0041F, -1.0015F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(134, 33).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9268F, -1.1959F, 0.0242F, -0.0092F, -0.4781F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(100, 54).addBox(4.7277F, -3.3082F, -0.3891F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -11.6959F, 0.0743F, -0.3155F, 1.4813F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(79, 143).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -11.6959F, 0.3014F, -0.1204F, 0.5149F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(130, 2).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -11.6959F, 0.203F, -0.2541F, 1.0308F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(91, 47).addBox(4.7277F, -3.3082F, -0.3891F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -9.6959F, 0.0664F, -0.2726F, 1.4138F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(130, 0).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -9.6959F, 0.1768F, -0.2187F, 0.9671F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(17, 143).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8268F, -9.6959F, 0.2615F, -0.1023F, 0.4495F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(91, 45).addBox(4.7277F, -3.3082F, -0.3891F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7268F, -7.1959F, 0.051F, -0.1866F, 1.3999F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(120, 129).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7268F, -7.1959F, 0.1255F, -0.1475F, 0.959F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(143, 14).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7268F, -7.1959F, 0.1821F, -0.0654F, 0.4387F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(39, 17).addBox(4.7277F, -3.3082F, -0.3891F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -4.1959F, 0.0331F, -0.0834F, 1.4023F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(129, 90).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -4.1959F, 0.0653F, -0.0616F, 0.9653F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(140, 128).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -4.1959F, 0.0873F, -0.0207F, 0.4428F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(134, 33).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -1.1959F, 0.0242F, 0.0092F, 0.4781F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(128, 66).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -1.1959F, 0.0256F, -0.0041F, 1.0015F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(39, 15).addBox(4.7277F, -3.3082F, -0.3891F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9268F, -1.1959F, 0.0214F, -0.0145F, 1.4378F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(55, 88).addBox(-1.0F, -0.1827F, -4.2328F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3828F, -1.8672F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(109, 134).addBox(-0.4827F, -1.97F, -1.8137F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.6611F, 9.7207F, -9.5547F, -0.1716F, 0.0474F, -0.0707F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(129, 84).addBox(-0.4827F, 0.73F, -7.8137F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4028F, 3.6606F, -5.9632F, 0.4829F, 0.0474F, -0.0707F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(101, 99).addBox(-0.4827F, -0.9591F, -2.142F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6779F, 3.6606F, -5.9632F, 0.6575F, 0.0461F, -0.0715F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(114, 77).addBox(-0.2315F, 0.0726F, -3.8476F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3559F, 4.185F, -8.2577F, 0.8273F, 0.0996F, -0.0168F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(129, 14).addBox(-0.2319F, -3.5825F, -2.084F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2819F, 6.9865F, -9.4685F, 1.2566F, 0.1047F, 0.0F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(108, 120).addBox(2.6649F, -0.1282F, -5.2932F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2819F, 6.9865F, -9.4685F, 0.7822F, 0.8241F, 0.4725F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 134).addBox(2.6649F, -2.1768F, -4.3013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2819F, 6.9865F, -9.4685F, 0.8695F, 0.8241F, 0.4725F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(142, 120).addBox(2.6649F, 0.2629F, -4.8009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2819F, 6.9865F, -9.4685F, 0.311F, 0.8241F, 0.4725F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(110, 107).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3888F, 10.5959F, -13.4984F, -1.0278F, 0.1376F, -0.2234F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 31).addBox(-2.0F, 1.3209F, 10.4435F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.3034F, -19.6298F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(25, 119).addBox(-0.5495F, -0.2575F, -1.6779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7778F, 1.9606F, -2.9632F, 0.5353F, 0.0474F, -0.0707F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.7464F, 0.5825F, -1.0536F, 0.8144F, 0.0578F, -0.0624F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(73, 122).addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0411F, 13.1287F, -10.8288F, -0.8172F, -0.8948F, -0.1137F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(114, 84).addBox(0.0F, 0.0F, -0.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7226F, 13.9802F, -10.1873F, -0.3532F, -0.87F, -0.1021F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(97, 19).addBox(0.4F, 0.0F, -0.1F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7219F, 13.9608F, -10.0934F, -0.2214F, -0.9897F, 0.1488F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(108, 7).addBox(0.4F, 0.0F, -0.1F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7219F, 13.9608F, -10.0934F, 0.0507F, -0.8907F, -0.1613F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(18, 123).addBox(0.0F, -5.2791F, 0.0546F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0825F, -8.0512F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(27, 141).addBox(0.0F, -4.9791F, -0.0454F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0493F, -9.9509F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(120, 140).addBox(0.0F, -4.6791F, -0.0454F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0144F, -11.9506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(74, 21).addBox(-1.0F, 0.9209F, -6.9454F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0172F, -6.0672F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neckbaseflesh = Bodyfront.addOrReplaceChild("Neckbaseflesh", CubeListBuilder.create().texOffs(108, 0).addBox(-0.99F, -0.9018F, -4.0576F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(25, 113).addBox(0.01F, -4.3018F, -3.0576F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.01F, 0.8838F, -12.6609F, -0.6577F, -0.16F, 0.4449F));

		PartDefinition Neckbaseflesh_r1 = Neckbaseflesh.addOrReplaceChild("Neckbaseflesh_r1", CubeListBuilder.create().texOffs(48, 141).addBox(0.0F, -4.0F, -1.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.01F, -0.9018F, -0.0576F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r68 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-1.9575F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, 0.1429F, -2.8351F, 0.7408F, 0.3341F, -0.8034F));

		PartDefinition Bodyfront_r69 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(123, 32).mirror().addBox(-5.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, 0.1429F, -2.8351F, 0.5081F, 0.647F, -1.2842F));

		PartDefinition Bodyfront_r70 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-5.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0571F, -1.0351F, 0.405F, 0.4954F, -1.0783F));

		PartDefinition Bodyfront_r71 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(30, 94).mirror().addBox(-1.9575F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0571F, -1.0351F, 0.587F, 0.2407F, -0.5854F));

		PartDefinition Bodyfront_r72 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-9.7277F, -3.3082F, -0.3891F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0571F, -1.0351F, 0.1391F, 0.6155F, -1.5741F));

		PartDefinition Bodyfront_r73 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(68, 49).addBox(4.7277F, -3.3082F, -0.3891F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0571F, -1.0351F, 0.1391F, -0.6155F, 1.5741F));

		PartDefinition Bodyfront_r74 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(123, 32).addBox(1.6829F, -1.0002F, -0.3892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, 0.1429F, -2.8351F, 0.5081F, -0.647F, 1.2842F));

		PartDefinition Bodyfront_r75 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(0, 121).addBox(-0.0425F, -0.0248F, -0.3892F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, 0.1429F, -2.8351F, 0.7408F, -0.3341F, 0.8034F));

		PartDefinition Bodyfront_r76 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(30, 94).addBox(-0.0425F, -0.0248F, -0.3891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0571F, -1.0351F, 0.587F, -0.2407F, 0.5854F));

		PartDefinition Bodyfront_r77 = Neckbaseflesh.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(60, 97).addBox(1.6829F, -1.0002F, -0.3891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0571F, -1.0351F, 0.405F, -0.4954F, 1.0783F));

		PartDefinition Neck1 = Neckbaseflesh.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.9166F, -3.9756F, -0.3974F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(56, 142).addBox(0.0F, -3.2223F, -1.0582F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8039F, -0.8456F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neck1.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(69, 146).addBox(0.0F, -2.1223F, -0.9582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9138F, -2.9427F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neckbase_r3 = Neck1.addOrReplaceChild("Neckbase_r3", CubeListBuilder.create().texOffs(98, 57).addBox(-1.0F, 0.6777F, -4.9582F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4558F, 0.0898F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r78 = Neck1.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(137, 116).mirror().addBox(-0.7128F, 0.0258F, -0.6859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.8737F, -3.7595F, 1.1276F, 0.6237F, -0.3965F));

		PartDefinition Bodyfront_r79 = Neck1.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(114, 103).mirror().addBox(-5.6302F, -0.334F, -0.6859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.8737F, -3.7595F, 0.7781F, 1.0602F, -0.8506F));

		PartDefinition Bodyfront_r80 = Neck1.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(-0.5868F, -0.1001F, -0.7288F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.8737F, -1.5595F, 1.1192F, 0.6396F, -0.4037F));

		PartDefinition Bodyfront_r81 = Neck1.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-5.4581F, -0.38F, -0.7288F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.8737F, -1.5595F, 0.7509F, 1.0714F, -0.8767F));

		PartDefinition Bodyfront_r82 = Neck1.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(114, 103).addBox(0.6302F, -0.334F, -0.6859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8737F, -3.7595F, 0.7781F, -1.0602F, 0.8506F));

		PartDefinition Bodyfront_r83 = Neck1.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(137, 116).addBox(-0.2872F, 0.0258F, -0.6859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8737F, -3.7595F, 1.1276F, -0.6237F, 0.3965F));

		PartDefinition Bodyfront_r84 = Neck1.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(68, 51).addBox(0.4581F, -0.38F, -0.7288F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8737F, -1.5595F, 0.7509F, -1.0714F, 0.8767F));

		PartDefinition Bodyfront_r85 = Neck1.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(112, 15).addBox(-0.4132F, -0.1001F, -0.7288F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8737F, -1.5595F, 1.1192F, -0.6396F, 0.4037F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(38, 88).addBox(-0.99F, -1.2542F, -6.0513F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(14, 147).addBox(0.0F, -3.1542F, -1.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.7588F, -4.7931F, -0.4118F, -0.4486F, -0.1852F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(83, 124).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1542F, -3.0513F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r2 = Neck2.addOrReplaceChild("Neckmiddlebase_r2", CubeListBuilder.create().texOffs(81, 74).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2542F, -5.0513F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r86 = Neck2.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(147, 104).mirror().addBox(-0.614F, -0.0726F, -0.828F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, -0.3149F, -4.3664F, 1.0266F, 0.6171F, -0.4438F));

		PartDefinition Bodyfront_r87 = Neck2.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(62, 128).mirror().addBox(-4.4954F, -0.3699F, -0.828F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, -0.3149F, -4.3664F, 0.6408F, 1.016F, -0.9575F));

		PartDefinition Bodyfront_r88 = Neck2.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(123, 34).mirror().addBox(-4.3065F, -0.2674F, -0.8977F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, -0.4149F, -2.4664F, 0.4517F, 1.1197F, -1.1322F));

		PartDefinition Bodyfront_r89 = Neck2.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(144, 114).mirror().addBox(-0.5161F, -0.0969F, -0.7456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, -0.3149F, -0.6664F, 1.1448F, 0.7045F, -0.3934F));

		PartDefinition Bodyfront_r90 = Neck2.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(114, 105).mirror().addBox(-5.3985F, -0.3419F, -0.7456F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.89F, -0.3149F, -0.6664F, 0.7216F, 1.138F, -0.9086F));

		PartDefinition Bodyfront_r91 = Neck2.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(62, 128).addBox(0.4954F, -0.3699F, -0.828F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.3149F, -4.3664F, 0.6408F, -1.016F, 0.9575F));

		PartDefinition Bodyfront_r92 = Neck2.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(147, 104).addBox(-0.386F, -0.0726F, -0.828F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.3149F, -4.3664F, 1.0266F, -0.6171F, 0.4438F));

		PartDefinition Bodyfront_r93 = Neck2.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(123, 34).addBox(0.3065F, -0.2674F, -0.8977F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.4149F, -2.4664F, 0.4517F, -1.1197F, 1.1322F));

		PartDefinition Bodyfront_r94 = Neck2.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(147, 102).addBox(-0.6008F, -0.0784F, -0.8977F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.4149F, -2.4664F, 1.0029F, -0.7536F, 0.4674F));

		PartDefinition Bodyfront_r95 = Neck2.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(114, 105).addBox(0.3985F, -0.3419F, -0.7456F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.3149F, -0.6664F, 0.7216F, -1.138F, 0.9086F));

		PartDefinition Bodyfront_r96 = Neck2.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(144, 114).addBox(-0.4839F, -0.0969F, -0.7456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, -0.3149F, -0.6664F, 1.1448F, -0.7045F, 0.3934F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, -0.9215F, -5.76F, 0.2016F, -0.4573F, -0.1513F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(118, 15).addBox(-1.01F, 0.2609F, 1.0952F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1818F, -4.043F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neckfront_r6 = Neck3.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(146, 66).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.4028F, -1.0077F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Neckfront_r7 = Neck3.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(105, 145).addBox(0.0F, -1.6F, -1.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -1.1974F, -1.1442F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r97 = Neck3.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(108, 147).mirror().addBox(-0.7248F, -0.0264F, -0.4112F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.6067F, -3.0064F, 0.6356F, 0.3946F, -0.7345F));

		PartDefinition Bodyfront_r98 = Neck3.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(128, 64).mirror().addBox(-4.6145F, -0.3853F, -0.4112F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.6067F, -3.0064F, 0.3632F, 0.6522F, -1.2653F));

		PartDefinition Bodyfront_r99 = Neck3.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(147, 106).mirror().addBox(-0.7031F, -0.0319F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 0.8067F, -1.1064F, 0.561F, 0.3711F, -0.5832F));

		PartDefinition Bodyfront_r100 = Neck3.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(128, 62).mirror().addBox(-4.593F, -0.3792F, -0.3087F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 0.8067F, -1.1064F, 0.3046F, 0.5968F, -1.1205F));

		PartDefinition Bodyfront_r101 = Neck3.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(128, 64).addBox(0.6145F, -0.3853F, -0.4112F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.89F, 0.6067F, -3.0064F, 0.3632F, -0.6522F, 1.2653F));

		PartDefinition Bodyfront_r102 = Neck3.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(108, 147).addBox(-0.2752F, -0.0264F, -0.4112F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.89F, 0.6067F, -3.0064F, 0.6356F, -0.3946F, 0.7345F));

		PartDefinition Bodyfront_r103 = Neck3.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(128, 62).addBox(0.593F, -0.3792F, -0.3087F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.99F, 0.8067F, -1.1064F, 0.3046F, -0.5968F, 1.1205F));

		PartDefinition Bodyfront_r104 = Neck3.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(147, 106).addBox(-0.2969F, -0.0319F, -0.3087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.99F, 0.8067F, -1.1064F, 0.561F, -0.3711F, 0.5832F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.9437F, -3.3084F, 0.3417F, -0.1143F, -0.0463F));

		PartDefinition Neckfront_r8 = Neck4.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(84, 145).addBox(0.0F, -0.9848F, -2.5737F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 119).addBox(0.0F, -1.9848F, -0.3736F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5619F, -1.8307F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = Neck4.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(45, 97).addBox(-1.0F, -0.8001F, -1.5076F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9888F, -4.1054F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r105 = Neck4.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(147, 108).mirror().addBox(-1.9575F, -0.0248F, -0.3892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0503F, -2.598F, 0.4225F, 0.1115F, -0.918F));

		PartDefinition Bodyfront_r106 = Neck4.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(131, 129).mirror().addBox(-4.6829F, -1.0002F, -0.3892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0503F, -2.598F, 0.3169F, 0.3048F, -1.4164F));

		PartDefinition Bodyfront_r107 = Neck4.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(131, 129).addBox(1.6829F, -1.0002F, -0.3892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.0503F, -2.598F, 0.3169F, -0.3048F, 1.4164F));

		PartDefinition Bodyfront_r108 = Neck4.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(147, 108).addBox(0.9575F, -0.0248F, -0.3892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.0503F, -2.598F, 0.4225F, -0.1115F, 0.918F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(101, 86).addBox(-3.0F, 3.8F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 83).addBox(-3.0F, -3.1473F, -4.8196F, 6.0F, 6.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.8355F, -5.211F, -0.3551F, -0.3211F, -0.3969F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(146, 63).mirror().addBox(-3.0F, -0.725F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(146, 63).addBox(1.95F, -0.725F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -2.6473F, -3.3196F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(64, 146).mirror().addBox(-3.0F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(64, 146).addBox(1.95F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.025F, -3.4011F, -3.211F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(123, 107).addBox(-0.7501F, -0.3125F, -1.8986F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2501F, -2.9237F, -2.3568F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(97, 139).addBox(-0.7501F, -0.6639F, -1.258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2501F, -2.9237F, -2.3568F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(84, 74).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -0.85F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(100, 65).addBox(-6.0F, -1.25F, -0.7F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0F, -1.3751F, -1.1802F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(100, 49).addBox(-3.0F, -2.023F, -1.9999F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.6953F, -2.8972F, -0.096F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 84).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.8F, -0.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 93).addBox(-3.0F, -0.9F, -2.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2585F, 0.2668F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(146, 22).mirror().addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(146, 22).addBox(4.5F, -0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, -0.5646F, -0.2347F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(146, 16).mirror().addBox(-3.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(146, 16).addBox(1.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.8685F, 0.751F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(146, 19).mirror().addBox(-3.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(146, 19).addBox(1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.9272F, 1.5298F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(110, 92).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6328F, 0.4489F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5F, -5.3F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(108, 21).addBox(-2.5F, -2.0F, -0.2F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5525F, -2.6475F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(81, 57).addBox(-3.0F, -6.0F, 0.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.6571F, -3.8429F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(81, 67).addBox(-3.0F, -0.3F, 0.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 7.3638F, -7.8007F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r4 = Upperjawbase.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(101, 78).addBox(-3.0F, -6.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.6311F, -6.8371F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r5 = Upperjawbase.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(101, 70).addBox(-3.0F, -6.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 7.7269F, -5.8417F, -0.096F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r6 = Upperjawbase.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(93, 0).addBox(-3.0F, -6.0F, -2.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 7.6571F, -3.8429F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, -8.0F, -0.3609F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(0, 101).addBox(-2.5F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -6.8205F, -3.6593F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r2 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r2", CubeListBuilder.create().texOffs(110, 30).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -6.2758F, -4.4979F, 0.576F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r3 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r3", CubeListBuilder.create().texOffs(57, 36).addBox(-2.0F, -1.4F, -2.4F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6059F, 0.5332F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r4 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r4", CubeListBuilder.create().texOffs(81, 49).addBox(-2.5F, -0.5F, 0.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -2.3632F, -5.3296F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r5 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r5", CubeListBuilder.create().texOffs(30, 97).addBox(-2.5F, -4.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7395F, -2.3951F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r6 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r6", CubeListBuilder.create().texOffs(97, 9).addBox(-3.0F, -5.0F, -2.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -1.6F, -0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.8F, -0.1274F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(132, 20).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.2995F, -1.722F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(72, 88).addBox(-2.5F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -2.3F, -0.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(90, 128).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5164F, -1.7763F, -0.48F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(62, 15).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9829F, -2.9611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(97, 115).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.0F, -2.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Noseslope = Upperjawfront.addOrReplaceChild("Noseslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -6.0F, -3.0F, 0.8702F, 0.0F, 0.0F));

		PartDefinition Noseslope_r1 = Noseslope.addOrReplaceChild("Noseslope_r1", CubeListBuilder.create().texOffs(7, 107).mirror().addBox(-0.1F, -0.1405F, -0.1951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, 0.0F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r2 = Noseslope.addOrReplaceChild("Noseslope_r2", CubeListBuilder.create().texOffs(73, 115).mirror().addBox(-0.1F, -0.4356F, 1.5677F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, -0.1745F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r3 = Noseslope.addOrReplaceChild("Noseslope_r3", CubeListBuilder.create().texOffs(83, 128).mirror().addBox(-0.1F, -1.3208F, 3.1562F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, -0.4363F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r4 = Noseslope.addOrReplaceChild("Noseslope_r4", CubeListBuilder.create().texOffs(14, 132).mirror().addBox(-0.1F, -1.5836F, 5.0094F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, -0.5236F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r5 = Noseslope.addOrReplaceChild("Noseslope_r5", CubeListBuilder.create().texOffs(55, 105).mirror().addBox(-0.1F, -2.7835F, 4.3475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, -0.7418F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r6 = Noseslope.addOrReplaceChild("Noseslope_r6", CubeListBuilder.create().texOffs(38, 82).mirror().addBox(-0.1F, -0.3608F, 4.0664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.3527F, 2.1932F, -0.3491F, -0.2356F, 0.0F));

		PartDefinition Noseslope_r7 = Noseslope.addOrReplaceChild("Noseslope_r7", CubeListBuilder.create().texOffs(12, 137).mirror().addBox(-0.4887F, -1.0933F, -0.5039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4226F, 4.4637F, 10.5693F, -0.7599F, -0.0281F, -0.1558F));

		PartDefinition Noseslope_r8 = Noseslope.addOrReplaceChild("Noseslope_r8", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-0.4887F, -1.124F, -0.4056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4226F, 4.4637F, 10.5693F, -1.4144F, -0.0281F, -0.1558F));

		PartDefinition Noseslope_r9 = Noseslope.addOrReplaceChild("Noseslope_r9", CubeListBuilder.create().texOffs(42, 125).mirror().addBox(-0.5656F, -1.1562F, -0.9742F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4226F, 4.4637F, 10.5693F, -0.5641F, -0.2007F, 0.017F));

		PartDefinition Noseslope_r10 = Noseslope.addOrReplaceChild("Noseslope_r10", CubeListBuilder.create().texOffs(136, 102).mirror().addBox(-0.1625F, -0.2492F, -0.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(136, 131).mirror().addBox(-0.1625F, 0.3508F, -0.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.4607F, 2.6089F, 8.549F, -0.3456F, -0.191F, -0.0242F));

		PartDefinition Noseslope_r11 = Noseslope.addOrReplaceChild("Noseslope_r11", CubeListBuilder.create().texOffs(136, 135).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.2225F, 3.7362F, 9.2362F, -0.8256F, -0.191F, -0.0242F));

		PartDefinition Noseslope_r12 = Noseslope.addOrReplaceChild("Noseslope_r12", CubeListBuilder.create().texOffs(68, 12).addBox(-0.5113F, -1.124F, -0.4056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4425F, 4.4637F, 10.5693F, -1.4144F, 0.0281F, 0.1558F));

		PartDefinition Noseslope_r13 = Noseslope.addOrReplaceChild("Noseslope_r13", CubeListBuilder.create().texOffs(12, 137).addBox(-0.5113F, -1.0933F, -0.5039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4425F, 4.4637F, 10.5693F, -0.7599F, 0.0281F, 0.1558F));

		PartDefinition Noseslope_r14 = Noseslope.addOrReplaceChild("Noseslope_r14", CubeListBuilder.create().texOffs(42, 125).addBox(-0.4344F, -1.1562F, -0.9742F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4425F, 4.4637F, 10.5693F, -0.5641F, 0.2007F, -0.017F));

		PartDefinition Noseslope_r15 = Noseslope.addOrReplaceChild("Noseslope_r15", CubeListBuilder.create().texOffs(38, 82).addBox(-0.9F, -0.3608F, 4.0664F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, -0.3491F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r16 = Noseslope.addOrReplaceChild("Noseslope_r16", CubeListBuilder.create().texOffs(136, 135).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.2424F, 3.7362F, 9.2362F, -0.8256F, 0.191F, 0.0242F));

		PartDefinition Noseslope_r17 = Noseslope.addOrReplaceChild("Noseslope_r17", CubeListBuilder.create().texOffs(136, 131).addBox(-0.8375F, 0.3508F, -0.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(136, 102).addBox(-0.8375F, -0.2492F, -0.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4807F, 2.6089F, 8.549F, -0.3456F, 0.191F, 0.0242F));

		PartDefinition Noseslope_r18 = Noseslope.addOrReplaceChild("Noseslope_r18", CubeListBuilder.create().texOffs(14, 132).addBox(-0.9F, -1.5836F, 5.0094F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, -0.5236F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r19 = Noseslope.addOrReplaceChild("Noseslope_r19", CubeListBuilder.create().texOffs(55, 105).addBox(-0.9F, -2.7835F, 4.3475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, -0.7418F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r20 = Noseslope.addOrReplaceChild("Noseslope_r20", CubeListBuilder.create().texOffs(83, 128).addBox(-0.9F, -1.3208F, 3.1562F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, -0.4363F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r21 = Noseslope.addOrReplaceChild("Noseslope_r21", CubeListBuilder.create().texOffs(73, 115).addBox(-0.9F, -0.4356F, 1.5677F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, -0.1745F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r22 = Noseslope.addOrReplaceChild("Noseslope_r22", CubeListBuilder.create().texOffs(7, 107).addBox(-0.9F, -0.1405F, -0.1951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.01F, 0.3527F, 2.1932F, 0.0F, 0.2356F, 0.0F));

		PartDefinition Noseslope_r23 = Noseslope.addOrReplaceChild("Noseslope_r23", CubeListBuilder.create().texOffs(64, 123).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.01F, 0.2872F, 1.9981F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Noseslope_r24 = Noseslope.addOrReplaceChild("Noseslope_r24", CubeListBuilder.create().texOffs(123, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.01F, 0.2F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Foreheadslope = Noseslope.addOrReplaceChild("Foreheadslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, 4.0F, -0.5095F, 0.0F, 0.0F));

		PartDefinition Foreheadslope_r1 = Foreheadslope.addOrReplaceChild("Foreheadslope_r1", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-1.0F, -0.1F, 0.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8298F, 0.0576F, 0.1496F, -0.1295F, -0.0195F));

		PartDefinition Foreheadslope_r2 = Foreheadslope.addOrReplaceChild("Foreheadslope_r2", CubeListBuilder.create().texOffs(121, 0).addBox(0.0F, -0.1F, 0.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.8298F, 0.0576F, 0.1496F, 0.1295F, 0.0195F));

		PartDefinition Foreheadslope_r3 = Foreheadslope.addOrReplaceChild("Foreheadslope_r3", CubeListBuilder.create().texOffs(113, 56).addBox(-1.0F, -0.8483F, -8.8299F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 9.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Foreheadslope_r4 = Foreheadslope.addOrReplaceChild("Foreheadslope_r4", CubeListBuilder.create().texOffs(68, 109).addBox(-2.0F, -0.337F, -5.8816F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.25F, 9.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Foreheadslope_r5 = Foreheadslope.addOrReplaceChild("Foreheadslope_r5", CubeListBuilder.create().texOffs(55, 109).addBox(-2.0F, -0.1673F, -3.8926F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 9.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Foreheadslope_r6 = Foreheadslope.addOrReplaceChild("Foreheadslope_r6", CubeListBuilder.create().texOffs(67, 78).addBox(-3.0F, 0.3983F, -1.9F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 26).addBox(-2.5F, -0.0017F, -1.9F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 9.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9122F, 1.2071F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjaw.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(37, 132).mirror().addBox(-0.0116F, -0.9888F, -0.0572F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0116F, 4.3495F, -3.187F, 0.1745F, -0.3927F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjaw.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(0.1595F, -1.1533F, -10.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 1.396F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r3 = Lowerjaw.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(6, 146).mirror().addBox(0.1595F, 1.4259F, -8.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 1.2215F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r4 = Lowerjaw.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(128, 137).mirror().addBox(0.1595F, 6.3341F, -6.8253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.5582F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r5 = Lowerjaw.addOrReplaceChild("Lowerjawback_r5", CubeListBuilder.create().texOffs(146, 3).mirror().addBox(0.1595F, -1.5882F, -8.7594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 1.6142F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r6 = Lowerjaw.addOrReplaceChild("Lowerjawback_r6", CubeListBuilder.create().texOffs(137, 112).mirror().addBox(0.1595F, 4.9226F, -7.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.6979F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r7 = Lowerjaw.addOrReplaceChild("Lowerjawback_r7", CubeListBuilder.create().texOffs(113, 128).mirror().addBox(0.2095F, 7.0199F, -5.2473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.2615F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r8 = Lowerjaw.addOrReplaceChild("Lowerjawback_r8", CubeListBuilder.create().texOffs(146, 6).mirror().addBox(0.2095F, 7.5342F, -0.5791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 133).mirror().addBox(0.2095F, 6.7342F, -2.3791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.3314F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r9 = Lowerjaw.addOrReplaceChild("Lowerjawback_r9", CubeListBuilder.create().texOffs(117, 63).mirror().addBox(0.2095F, 6.1254F, 0.6391F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, -0.105F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r10 = Lowerjaw.addOrReplaceChild("Lowerjawback_r10", CubeListBuilder.create().texOffs(106, 128).mirror().addBox(0.2095F, 6.0386F, -5.4202F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.4884F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r11 = Lowerjaw.addOrReplaceChild("Lowerjawback_r11", CubeListBuilder.create().texOffs(86, 117).mirror().addBox(0.2095F, 7.3034F, -5.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.663F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r12 = Lowerjaw.addOrReplaceChild("Lowerjawback_r12", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(0.2095F, 6.1213F, -4.7604F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.01F, -6.5758F, -2.8155F, 0.1394F, -0.0694F, 0.0075F));

		PartDefinition Lowerjawback_r13 = Lowerjaw.addOrReplaceChild("Lowerjawback_r13", CubeListBuilder.create().texOffs(146, 6).addBox(-1.2095F, 7.5342F, -0.5791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 133).addBox(-1.2095F, 6.7342F, -2.3791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.3314F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r14 = Lowerjaw.addOrReplaceChild("Lowerjawback_r14", CubeListBuilder.create().texOffs(128, 137).addBox(-1.1595F, 6.3341F, -6.8253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.5582F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r15 = Lowerjaw.addOrReplaceChild("Lowerjawback_r15", CubeListBuilder.create().texOffs(6, 146).addBox(-1.1595F, 1.4259F, -8.3938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 1.2215F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r16 = Lowerjaw.addOrReplaceChild("Lowerjawback_r16", CubeListBuilder.create().texOffs(146, 3).addBox(-1.1595F, -1.5882F, -8.7594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 1.6142F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r17 = Lowerjaw.addOrReplaceChild("Lowerjawback_r17", CubeListBuilder.create().texOffs(146, 0).addBox(-1.1595F, -1.1533F, -10.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 1.396F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r18 = Lowerjaw.addOrReplaceChild("Lowerjawback_r18", CubeListBuilder.create().texOffs(137, 112).addBox(-1.1595F, 4.9226F, -7.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.6979F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r19 = Lowerjaw.addOrReplaceChild("Lowerjawback_r19", CubeListBuilder.create().texOffs(113, 128).addBox(-1.2095F, 7.0199F, -5.2473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.2615F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r20 = Lowerjaw.addOrReplaceChild("Lowerjawback_r20", CubeListBuilder.create().texOffs(106, 128).addBox(-1.2095F, 6.0386F, -5.4202F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.4884F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r21 = Lowerjaw.addOrReplaceChild("Lowerjawback_r21", CubeListBuilder.create().texOffs(86, 117).addBox(-1.2095F, 7.3034F, -5.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.663F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r22 = Lowerjaw.addOrReplaceChild("Lowerjawback_r22", CubeListBuilder.create().texOffs(37, 132).addBox(0.0116F, -0.9888F, -0.0572F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0116F, 4.3495F, -3.187F, 0.1745F, 0.3927F, 0.0F));

		PartDefinition Lowerjawback_r23 = Lowerjaw.addOrReplaceChild("Lowerjawback_r23", CubeListBuilder.create().texOffs(117, 63).addBox(-1.2095F, 6.1254F, 0.6391F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, -0.105F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawback_r24 = Lowerjaw.addOrReplaceChild("Lowerjawback_r24", CubeListBuilder.create().texOffs(110, 36).addBox(-1.2095F, 6.1213F, -4.7604F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.01F, -6.5758F, -2.8155F, 0.1394F, 0.0694F, -0.0075F));

		PartDefinition Lowerjawmiddleback = Lowerjaw.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.49F, -6.46F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r1 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r1", CubeListBuilder.create().texOffs(128, 141).addBox(-0.7566F, 2.3508F, -2.4166F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.585F, -3.2948F, -2.502F, -0.0462F, 0.1023F, -0.0492F));

		PartDefinition Lowerjawmiddleback_r2 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r2", CubeListBuilder.create().texOffs(110, 113).addBox(-1.4566F, 3.0197F, -2.8342F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.585F, -3.2948F, -2.502F, 0.0847F, 0.1023F, -0.0492F));

		PartDefinition Lowerjawmiddleback_r3 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r3", CubeListBuilder.create().texOffs(141, 17).addBox(-1.4566F, 2.9066F, 1.4246F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.585F, -3.2948F, -2.502F, -0.0025F, 0.1023F, -0.0492F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 1.3394F, -4.8321F, -0.3623F, 0.0847F, -0.0227F));

		PartDefinition Lowerjawmiddlefront_r1 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmiddlefront_r1", CubeListBuilder.create().texOffs(104, 141).addBox(-0.5147F, 2.1062F, -6.3267F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 123).addBox(-1.2147F, 3.1062F, -6.3267F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.685F, -4.6948F, 2.998F, 0.0867F, 0.113F, -0.0098F));

		PartDefinition Lowerjawmiddlefront_r2 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmiddlefront_r2", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5147F, 3.1523F, -6.9304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 137).addBox(-1.2147F, 4.1523F, -7.1304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.685F, -4.6948F, 2.998F, -0.0878F, 0.113F, -0.0098F));

		PartDefinition Lowerjawmidbaseslope_r1 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmidbaseslope_r1", CubeListBuilder.create().texOffs(136, 17).addBox(-0.3758F, -0.4227F, -1.1899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8484F, 0.0654F, -3.5846F, -0.3319F, 0.1133F, -0.0055F));

		PartDefinition Lowerjawmidbaseslope_r2 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmidbaseslope_r2", CubeListBuilder.create().texOffs(45, 137).addBox(-0.3758F, -0.4594F, -0.279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8484F, 0.0654F, -3.5846F, -0.1574F, 0.1133F, -0.0055F));

		PartDefinition Lowerjawmidbaseslope_r3 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmidbaseslope_r3", CubeListBuilder.create().texOffs(132, 23).addBox(-1.3841F, 4.7737F, -3.911F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.685F, -5.9948F, 1.598F, 0.0166F, 0.1124F, -0.0154F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.35F, -0.1138F, -4.7785F, -0.1278F, 0.0843F, -0.0284F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(145, 139).addBox(-1.1746F, 4.3826F, -9.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 88).addBox(-0.4746F, 3.3826F, -9.108F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(128, 145).addBox(-1.1746F, 4.3826F, -8.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.085F, -4.4848F, 7.898F, -0.1306F, 0.1133F, 0.0047F));

		PartDefinition Lowerjawfrontslope = Lowerjawfront.addOrReplaceChild("Lowerjawfrontslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.49F, 1.2F, -3.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawfrontslope_r1 = Lowerjawfrontslope.addOrReplaceChild("Lowerjawfrontslope_r1", CubeListBuilder.create().texOffs(100, 145).addBox(-1.1249F, 6.3628F, -7.7118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.575F, -5.6848F, 11.598F, -0.3914F, 0.1109F, 0.0239F));

		PartDefinition Lowerjawfrontslope_r2 = Lowerjawfrontslope.addOrReplaceChild("Lowerjawfrontslope_r2", CubeListBuilder.create().texOffs(143, 136).addBox(-1.1249F, 3.6301F, -8.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.575F, -5.6848F, 11.598F, -0.0423F, 0.1109F, 0.0239F));

		PartDefinition Lowerteethfront = Lowerjawfront.addOrReplaceChild("Lowerteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -0.8F, -1.3F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerteethmiddle = Lowerjawmiddlefront.addOrReplaceChild("Lowerteethmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.0F, -2.8F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethback = Lowerjawmiddleback.addOrReplaceChild("Lowerteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.7F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback2 = Lowerjaw.addOrReplaceChild("Lowerjawmiddleback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.49F, -6.46F, 0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r4 = Lowerjawmiddleback2.addOrReplaceChild("Lowerjawmiddleback_r4", CubeListBuilder.create().texOffs(128, 141).mirror().addBox(0.7566F, 2.3508F, -2.4166F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.585F, -3.2948F, -2.502F, -0.0462F, -0.1023F, 0.0492F));

		PartDefinition Lowerjawmiddleback_r5 = Lowerjawmiddleback2.addOrReplaceChild("Lowerjawmiddleback_r5", CubeListBuilder.create().texOffs(110, 113).mirror().addBox(0.4566F, 3.0197F, -2.8342F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.585F, -3.2948F, -2.502F, 0.0847F, -0.1023F, 0.0492F));

		PartDefinition Lowerjawmiddleback_r6 = Lowerjawmiddleback2.addOrReplaceChild("Lowerjawmiddleback_r6", CubeListBuilder.create().texOffs(141, 17).mirror().addBox(0.4566F, 2.9066F, 1.4246F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.585F, -3.2948F, -2.502F, -0.0025F, -0.1023F, 0.0492F));

		PartDefinition Lowerjawmiddlefront2 = Lowerjawmiddleback2.addOrReplaceChild("Lowerjawmiddlefront2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 1.3394F, -4.8321F, -0.3623F, -0.0847F, 0.0227F));

		PartDefinition Lowerjawmiddlefront_r3 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawmiddlefront_r3", CubeListBuilder.create().texOffs(104, 141).mirror().addBox(0.5147F, 2.1062F, -6.3267F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 123).mirror().addBox(0.2147F, 3.1062F, -6.3267F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.685F, -4.6948F, 2.998F, 0.0867F, -0.113F, 0.0098F));

		PartDefinition Lowerjawmiddlefront_r4 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawmiddlefront_r4", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(0.5147F, 3.1523F, -6.9304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 137).mirror().addBox(0.2147F, 4.1523F, -7.1304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.685F, -4.6948F, 2.998F, -0.0878F, -0.113F, 0.0098F));

		PartDefinition Lowerjawmidbaseslope_r4 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawmidbaseslope_r4", CubeListBuilder.create().texOffs(136, 17).mirror().addBox(-0.6242F, -0.4227F, -1.1899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8484F, 0.0654F, -3.5846F, -0.3319F, -0.1133F, 0.0055F));

		PartDefinition Lowerjawmidbaseslope_r5 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawmidbaseslope_r5", CubeListBuilder.create().texOffs(45, 137).mirror().addBox(-0.6242F, -0.4594F, -0.279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8484F, 0.0654F, -3.5846F, -0.1574F, -0.1133F, 0.0055F));

		PartDefinition Lowerjawmidbaseslope_r6 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawmidbaseslope_r6", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(0.3841F, 4.7737F, -3.911F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.685F, -5.9948F, 1.598F, 0.0166F, -0.1124F, 0.0154F));

		PartDefinition Lowerjawfront2 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, -0.1138F, -4.7785F, -0.1278F, -0.0843F, 0.0284F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(145, 139).mirror().addBox(0.1746F, 4.3826F, -9.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(140, 88).mirror().addBox(0.4746F, 3.3826F, -9.108F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 145).mirror().addBox(0.1746F, 4.3826F, -8.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.085F, -4.4848F, 7.898F, -0.1306F, -0.1133F, -0.0047F));

		PartDefinition Lowerjawfrontslope2 = Lowerjawfront2.addOrReplaceChild("Lowerjawfrontslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.49F, 1.2F, -3.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawfrontslope_r3 = Lowerjawfrontslope2.addOrReplaceChild("Lowerjawfrontslope_r3", CubeListBuilder.create().texOffs(100, 145).mirror().addBox(0.1249F, 6.3628F, -7.7118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.575F, -5.6848F, 11.598F, -0.3914F, -0.1109F, -0.0239F));

		PartDefinition Lowerjawfrontslope_r4 = Lowerjawfrontslope2.addOrReplaceChild("Lowerjawfrontslope_r4", CubeListBuilder.create().texOffs(143, 136).mirror().addBox(0.1249F, 3.6301F, -8.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.575F, -5.6848F, 11.598F, -0.0423F, -0.1109F, -0.0239F));

		PartDefinition Lowerteethfront2 = Lowerjawfront2.addOrReplaceChild("Lowerteethfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -0.8F, -1.3F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerteethmiddle2 = Lowerjawmiddlefront2.addOrReplaceChild("Lowerteethmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, -1.0F, -2.8F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethback2 = Lowerjawmiddleback2.addOrReplaceChild("Lowerteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.7F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbaseslope = Lowerjaw.addOrReplaceChild("Lowerjawmidbaseslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 5.0F, -4.2F, 0.0283F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbaseslope_r7 = Lowerjawmidbaseslope.addOrReplaceChild("Lowerjawmidbaseslope_r7", CubeListBuilder.create().texOffs(132, 107).mirror().addBox(0.4583F, 4.8513F, -1.73F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 128).mirror().addBox(0.4583F, 4.1291F, 1.8457F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.575F, -7.8048F, -4.762F, -0.027F, -0.1124F, 0.0154F));

		PartDefinition Lowerjawmidbaseslope_r8 = Lowerjawmidbaseslope.addOrReplaceChild("Lowerjawmidbaseslope_r8", CubeListBuilder.create().texOffs(90, 132).mirror().addBox(0.4583F, 4.6924F, 1.0462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.575F, -7.8048F, -4.762F, -0.2016F, -0.1124F, 0.0154F));

		PartDefinition Lowerjawmidbaseslope_r9 = Lowerjawmidbaseslope.addOrReplaceChild("Lowerjawmidbaseslope_r9", CubeListBuilder.create().texOffs(132, 107).addBox(-1.4583F, 4.8513F, -1.73F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(99, 128).addBox(-1.4583F, 4.1291F, 1.8457F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.595F, -7.8048F, -4.762F, -0.027F, 0.1124F, -0.0154F));

		PartDefinition Lowerjawmidbaseslope_r10 = Lowerjawmidbaseslope.addOrReplaceChild("Lowerjawmidbaseslope_r10", CubeListBuilder.create().texOffs(90, 132).addBox(-1.4583F, 4.6924F, 1.0462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.595F, -7.8048F, -4.762F, -0.2016F, 0.1124F, -0.0154F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.7F, 1.6206F, -15.7724F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(139, 60).addBox(-2.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(52, 138).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.025F, 1.4309F, 4.5561F, -2.6354F, 0.0F, 0.0F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(138, 56).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.025F, 0.8187F, 4.2168F, 3.0805F, 0.0F, 0.0F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(21, 134).addBox(0.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.025F, 2.1761F, 6.0841F, -2.0246F, 0.0F, 0.0F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(114, 70).addBox(0.0F, -0.15F, -3.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-1.025F, 0.1452F, 9.4834F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(33, 138).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.025F, 2.1106F, 8.4601F, -1.3265F, 0.0F, 0.0F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(33, 146).addBox(0.0F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.025F, 1.7983F, 9.0866F, -1.1083F, 0.0F, 0.0F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(76, 133).addBox(0.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.025F, 2.2799F, 7.7809F, -1.6319F, 0.0F, 0.0F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(134, 28).addBox(0.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.025F, -0.5219F, 4.5386F, 2.3824F, 0.0F, 0.0F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(66, 138).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.025F, 0.12F, 4.2595F, 2.7314F, 0.0F, 0.0F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(17, 139).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(139, 23).addBox(0.0F, 0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.025F, -3.2152F, 8.379F, 1.4312F, 0.0F, 0.0F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(121, 113).addBox(0.0F, -0.15F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.025F, -1.7551F, 5.7088F, 2.2078F, 0.0F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(139, 6).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.025F, -3.1056F, 7.6876F, 1.7279F, 0.0F, 0.0F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(73, 138).addBox(0.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.025F, -2.7663F, 7.0754F, 2.0769F, 0.0F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(69, 133).addBox(0.0F, 0.6F, -6.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.142F))
				.texOffs(7, 129).addBox(0.525F, -0.3F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.147F))
				.texOffs(74, 142).addBox(0.525F, -0.8F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.025F, -2.8847F, 14.0679F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(120, 86).addBox(0.0F, -0.95F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.025F, -0.6892F, 9.1463F, 0.384F, 0.0F, 0.0F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(7, 142).addBox(0.0F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.385F, 10.5246F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(51, 146).addBox(0.0F, -1.825F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(69, 142).addBox(0.0F, -1.825F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.3747F, 11.6883F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(64, 142).addBox(0.0F, -0.125F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, 0.0765F, 10.4374F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(83, 134).addBox(0.0F, -1.825F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(146, 52).addBox(-0.3F, -2.925F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(59, 146).addBox(0.025F, -2.925F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.2969F, 11.9981F, -0.096F, 0.0F, 0.0F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(146, 25).addBox(0.0F, -0.925F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5F, -2.5871F, 10.3485F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(51, 142).addBox(0.0F, -1.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.5F, -4.0684F, 11.3087F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(33, 142).addBox(0.0F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.5F, -1.5568F, 9.9633F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(146, 28).addBox(0.0F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.3348F, 10.2897F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(146, 31).addBox(0.0F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, -3.9529F, 10.6183F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(0, 129).addBox(0.0F, -1.5F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.5F, -2.4155F, 11.3946F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(146, 49).addBox(0.0F, -0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, 1.9543F, 15.1834F, -1.0123F, 0.0F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(134, 68).addBox(0.0F, -0.1F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.5F, 2.3992F, 13.9053F, -2.1031F, 0.0F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(134, 73).addBox(0.0F, -1.8F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.5F, 1.5364F, 12.4405F, -1.7977F, 0.0F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(80, 139).addBox(0.0F, -0.2F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.3782F, 14.5049F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(146, 34).addBox(0.0F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.5F, 0.7726F, 15.6292F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(139, 64).addBox(0.0F, -0.2F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.4658F, 15.5318F, -0.6196F, 0.0F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(134, 42).addBox(0.0F, -0.2F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5F, -0.8298F, 15.0617F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(134, 78).addBox(0.0F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, -0.1313F, 12.7742F, -1.9504F, 0.0F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(142, 116).addBox(0.0F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.7677F, 14.4146F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(146, 60).addBox(-0.6533F, 0.0293F, -0.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.4499F, -4.5443F, 13.4155F, 1.806F, 0.9795F, -0.7188F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.7F, 1.6206F, -15.7724F));

		PartDefinition Head_r47 = rightFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(139, 60).mirror().addBox(1.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Head_r48 = rightFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(52, 138).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.025F, 1.4309F, 4.5561F, -2.6354F, 0.0F, 0.0F));

		PartDefinition Head_r49 = rightFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(138, 56).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.025F, 0.8187F, 4.2168F, 3.0805F, 0.0F, 0.0F));

		PartDefinition Head_r50 = rightFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(21, 134).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.025F, 2.1761F, 6.0841F, -2.0246F, 0.0F, 0.0F));

		PartDefinition Head_r51 = rightFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(114, 70).mirror().addBox(-1.0F, -0.15F, -3.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(1.025F, 0.1452F, 9.4834F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r52 = rightFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(33, 138).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.025F, 2.1106F, 8.4601F, -1.3265F, 0.0F, 0.0F));

		PartDefinition Head_r53 = rightFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(33, 146).mirror().addBox(-1.0F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.025F, 1.7983F, 9.0866F, -1.1083F, 0.0F, 0.0F));

		PartDefinition Head_r54 = rightFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(76, 133).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.025F, 2.2799F, 7.7809F, -1.6319F, 0.0F, 0.0F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(134, 28).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.025F, -0.5219F, 4.5386F, 2.3824F, 0.0F, 0.0F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(66, 138).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.025F, 0.12F, 4.2595F, 2.7314F, 0.0F, 0.0F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(17, 139).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(139, 23).mirror().addBox(-1.0F, 0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.025F, -3.2152F, 8.379F, 1.4312F, 0.0F, 0.0F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(121, 113).mirror().addBox(-1.0F, -0.15F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.025F, -1.7551F, 5.7088F, 2.2078F, 0.0F, 0.0F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(139, 6).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.025F, -3.1056F, 7.6876F, 1.7279F, 0.0F, 0.0F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(73, 138).mirror().addBox(-1.0F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.025F, -2.7663F, 7.0754F, 2.0769F, 0.0F, 0.0F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(69, 133).mirror().addBox(-1.0F, 0.6F, -6.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.142F)).mirror(false)
				.texOffs(7, 129).mirror().addBox(-1.525F, -0.3F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(74, 142).mirror().addBox(-1.525F, -0.8F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.025F, -2.8847F, 14.0679F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(120, 86).mirror().addBox(-1.0F, -0.95F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.025F, -0.6892F, 9.1463F, 0.384F, 0.0F, 0.0F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(7, 142).mirror().addBox(-1.0F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.385F, 10.5246F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(51, 146).mirror().addBox(-1.0F, -1.825F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(69, 142).mirror().addBox(-1.0F, -1.825F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.3747F, 11.6883F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(64, 142).mirror().addBox(-1.0F, -0.125F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0765F, 10.4374F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(83, 134).mirror().addBox(-1.0F, -1.825F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(146, 52).mirror().addBox(-0.7F, -2.925F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(59, 146).mirror().addBox(-1.025F, -2.925F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2969F, 11.9981F, -0.096F, 0.0F, 0.0F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(146, 25).mirror().addBox(-1.0F, -0.925F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.5871F, 10.3485F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(51, 142).mirror().addBox(-1.0F, -1.875F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.0684F, 11.3087F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(33, 142).mirror().addBox(-1.0F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.5568F, 9.9633F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(146, 28).mirror().addBox(-1.0F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.3348F, 10.2897F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(146, 31).mirror().addBox(-1.0F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.9529F, 10.6183F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-1.0F, -1.5F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4155F, 11.3946F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(146, 49).mirror().addBox(-1.0F, -0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.9543F, 15.1834F, -1.0123F, 0.0F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(134, 68).mirror().addBox(-1.0F, -0.1F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.3992F, 13.9053F, -2.1031F, 0.0F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(134, 73).mirror().addBox(-1.0F, -1.8F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5364F, 12.4405F, -1.7977F, 0.0F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(80, 139).mirror().addBox(-1.0F, -0.2F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.3782F, 14.5049F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(146, 34).mirror().addBox(-1.0F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7726F, 15.6292F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(139, 64).mirror().addBox(-1.0F, -0.2F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4658F, 15.5318F, -0.6196F, 0.0F, 0.0F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(134, 42).mirror().addBox(-1.0F, -0.2F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8298F, 15.0617F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(134, 78).mirror().addBox(-1.0F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1313F, 12.7742F, -1.9504F, 0.0F, 0.0F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(142, 116).mirror().addBox(-1.0F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.7677F, 14.4146F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(146, 60).mirror().addBox(-0.3467F, 0.0293F, -0.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.4499F, -4.5443F, 13.4155F, 1.806F, -0.9795F, 0.7188F));

		PartDefinition bone = Neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.01F, -1.3238F, -2.9455F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9632F, 10.0744F, -10.536F, 1.0616F, 0.0745F, -0.0818F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(142, 124).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4813F, 4.6111F, 0.3105F, -0.4503F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(123, 142).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4813F, 4.6111F, 0.3105F, -0.2321F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(141, 27).addBox(-0.5F, -2.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.473F, 3.0021F, 0.3801F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftarm1.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(146, 77).addBox(-0.5F, 0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(146, 74).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.473F, 0.1352F, -0.0931F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftarm1.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(72, 146).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.473F, 1.0889F, 0.2076F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftarm1.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(146, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.473F, 0.1352F, -0.0931F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(28, 134).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 5.25F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 138).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.523F, 6.2489F, -0.6839F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(60, 99).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4567F, 4.3953F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9632F, 10.0744F, -10.536F, 1.0616F, -0.0745F, 0.0818F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(12, 143).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4813F, 4.6111F, 0.3105F, -0.4503F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(143, 10).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4813F, 4.6111F, 0.3105F, -0.2321F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(141, 32).addBox(-0.5F, -2.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.473F, 3.0021F, 0.3801F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightarm1.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(146, 99).addBox(-0.5F, 0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(146, 96).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.473F, 0.1352F, -0.0931F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightarm1.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(90, 146).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.473F, 1.0889F, 0.2076F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightarm1.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(146, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.473F, 0.1352F, -0.0931F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(104, 134).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 5.25F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 106).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.523F, 6.2489F, -0.6839F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(73, 99).addBox(0.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4567F, 4.3953F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8638F, 7.9496F, -0.0027F, 0.3515F, -0.1239F));

		PartDefinition Tail7_r1 = Tail1.addOrReplaceChild("Tail7_r1", CubeListBuilder.create().texOffs(135, 139).addBox(0.0F, -3.3F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.145F, 15.2548F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail6_r1 = Tail1.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(112, 139).addBox(0.0F, 2.0716F, 5.2871F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 139).addBox(0.0F, 1.3412F, 3.4252F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 139).addBox(0.0F, 0.6901F, 1.4538F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 139).addBox(0.0F, -0.0403F, -0.4081F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0003F, 5.3593F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(45, 141).addBox(0.0F, -0.3969F, -0.5999F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.191F, 3.5695F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail9_r1 = Tail1.addOrReplaceChild("Tail9_r1", CubeListBuilder.create().texOffs(144, 108).addBox(0.0F, -4.0F, -1.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6413F, 16.0057F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail8_r1 = Tail1.addOrReplaceChild("Tail8_r1", CubeListBuilder.create().texOffs(144, 102).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8346F, 13.0053F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail7_r2 = Tail1.addOrReplaceChild("Tail7_r2", CubeListBuilder.create().texOffs(144, 43).addBox(0.0F, -5.7F, 11.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 44).addBox(0.0F, -5.7F, 9.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 129).addBox(0.0F, -5.7F, 6.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 125).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7469F, -0.1185F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(28, 125).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6527F, 2.895F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Tail4_r2 = Tail1.addOrReplaceChild("Tail4_r2", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-1.9F, 0.5F, -0.1F, 2.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2517F, 0.0032F, 0.0437F, 0.0523F, 0.0023F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(37, 20).addBox(-0.1F, 0.5F, -0.1F, 2.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2517F, 0.0032F, 0.0437F, -0.0523F, -0.0023F));

		PartDefinition Tail2_r2 = Tail1.addOrReplaceChild("Tail2_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.594F, 15.8016F, 0.0798F, 0.134F, -0.0327F));

		PartDefinition Tail15_r1 = Tail2.addOrReplaceChild("Tail15_r1", CubeListBuilder.create().texOffs(41, 144).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3599F, 16.0787F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail14_r1 = Tail2.addOrReplaceChild("Tail14_r1", CubeListBuilder.create().texOffs(38, 144).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5738F, 13.9353F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail13_r1 = Tail2.addOrReplaceChild("Tail13_r1", CubeListBuilder.create().texOffs(144, 37).addBox(0.0F, 7.3716F, 19.2871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 144).addBox(0.0F, 6.5716F, 17.2871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 144).addBox(0.0F, 5.9716F, 15.2871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 143).addBox(0.0F, 5.4716F, 13.2871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 37).addBox(0.0F, 3.8716F, 11.2871F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 141).addBox(0.0F, 3.3716F, 9.2871F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7004F, -10.0407F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail2_r3 = Tail2.addOrReplaceChild("Tail2_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r10 = Tail2.addOrReplaceChild("Neckfront_r10", CubeListBuilder.create().texOffs(59, 149).addBox(0.0F, -1.6858F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3625F, 15.0255F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neckfront_r11 = Tail2.addOrReplaceChild("Neckfront_r11", CubeListBuilder.create().texOffs(51, 149).addBox(0.0F, -1.5858F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4149F, 13.0262F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r12 = Tail2.addOrReplaceChild("Neckfront_r12", CubeListBuilder.create().texOffs(33, 149).addBox(0.0F, -1.7858F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2673F, 11.0216F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r13 = Tail2.addOrReplaceChild("Neckfront_r13", CubeListBuilder.create().texOffs(17, 149).addBox(0.0F, -2.0858F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1197F, 9.0171F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Neckfront_r14 = Tail2.addOrReplaceChild("Neckfront_r14", CubeListBuilder.create().texOffs(11, 147).addBox(0.0F, -2.2727F, 0.0012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0845F, 6.9546F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Neckfront_r15 = Tail2.addOrReplaceChild("Neckfront_r15", CubeListBuilder.create().texOffs(146, 130).addBox(0.0F, -2.5727F, 0.0012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9247F, 4.9385F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Neckfront_r16 = Tail2.addOrReplaceChild("Neckfront_r16", CubeListBuilder.create().texOffs(138, 143).addBox(0.0F, -2.7727F, 0.0013F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8647F, 2.9294F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Neckfront_r17 = Tail2.addOrReplaceChild("Neckfront_r17", CubeListBuilder.create().texOffs(143, 130).addBox(0.0F, -2.8727F, -0.8987F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9414F, 1.8321F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 53).addBox(-1.0F, -0.9057F, -0.0361F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5851F, 17.0004F, 0.0424F, 0.1813F, -0.1214F));

		PartDefinition Tail21_r1 = Tail3.addOrReplaceChild("Tail21_r1", CubeListBuilder.create().texOffs(6, 149).addBox(0.0F, 0.5F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 135).addBox(0.0F, 0.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 148).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6282F, 7.6535F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail18_r1 = Tail3.addOrReplaceChild("Tail18_r1", CubeListBuilder.create().texOffs(123, 146).addBox(0.0F, 0.0F, 3.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 146).addBox(0.0F, -0.5F, 1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 96).addBox(0.0F, -2.0F, -0.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9234F, 1.7144F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Neckfront_r18 = Tail3.addOrReplaceChild("Neckfront_r18", CubeListBuilder.create().texOffs(126, 148).addBox(0.0F, -1.9965F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 148).addBox(0.0F, -1.6965F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 148).addBox(0.0F, -1.5965F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 148).addBox(0.0F, -1.3965F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9184F, 3.9315F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r19 = Tail3.addOrReplaceChild("Neckfront_r19", CubeListBuilder.create().texOffs(30, 148).addBox(0.0F, -1.4965F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8708F, 1.9295F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r20 = Tail3.addOrReplaceChild("Neckfront_r20", CubeListBuilder.create().texOffs(27, 148).addBox(0.0F, -1.4965F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9232F, -0.0698F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, 2.9022F, -0.9F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7472F, 12.8649F, -0.0215F, -0.1309F, 0.0028F));

		PartDefinition Tail26_r1 = Tail4.addOrReplaceChild("Tail26_r1", CubeListBuilder.create().texOffs(148, 9).addBox(0.0F, -0.1F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 147).addBox(0.0F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 147).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6085F, 7.6061F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Tail23_r1 = Tail4.addOrReplaceChild("Tail23_r1", CubeListBuilder.create().texOffs(133, 147).addBox(0.0F, 0.0F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 124).addBox(0.0F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 120).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2511F, 1.4549F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Neckfront_r21 = Tail4.addOrReplaceChild("Neckfront_r21", CubeListBuilder.create().texOffs(149, 112).addBox(0.0F, 0.0F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 149).addBox(0.0F, -0.1F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 149).addBox(0.0F, -0.1F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 149).addBox(0.0F, -0.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 149).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 149).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5413F, 13.7811F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckfront_r22 = Tail4.addOrReplaceChild("Neckfront_r22", CubeListBuilder.create().texOffs(81, 149).addBox(0.0F, -2.0996F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 149).addBox(0.0F, -1.9996F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 149).addBox(0.0F, -1.8996F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 149).addBox(0.0F, -1.6996F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 147).addBox(0.0F, -1.5996F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 116).addBox(0.0F, -1.4996F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 147).addBox(0.0F, -1.4996F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9888F, -0.8351F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(54, 53).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.5F, 13.0F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Tail31_r1 = Tail5.addOrReplaceChild("Tail31_r1", CubeListBuilder.create().texOffs(149, 66).addBox(0.0F, 25.2716F, 55.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 149).addBox(0.0F, 24.3716F, 53.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 149).addBox(0.0F, 23.3716F, 51.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 133).addBox(0.0F, 22.5716F, 49.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5061F, -52.1046F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail27_r1 = Tail5.addOrReplaceChild("Tail27_r1", CubeListBuilder.create().texOffs(48, 147).addBox(0.0F, -0.9F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2479F, 0.3361F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.6099F, 0.1332F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 10.7F, -0.2515F, -0.2228F, 0.1911F));

		PartDefinition Tail34_r1 = Tail6.addOrReplaceChild("Tail34_r1", CubeListBuilder.create().texOffs(69, 130).addBox(0.0F, 27.9716F, 61.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 130).addBox(0.0F, 27.1716F, 59.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 129).addBox(0.0F, 26.1716F, 57.2871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4061F, -62.8046F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.5803F, -0.0233F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0099F, 11.0332F, -0.3584F, -0.2871F, 0.1057F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(15, 105).addBox(-2.0F, -1.595F, -1.6496F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 6.397F, 0.7988F, -0.896F, -0.1847F, -0.2398F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(112, 9).addBox(-2.5F, 5.3028F, -2.1589F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.6918F, -2.4572F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(125, 69).addBox(-2.0F, -0.0409F, 0.028F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.5122F, -2.5244F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(125, 43).addBox(-2.0F, 1.7591F, -0.372F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.6918F, -2.4572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftleg1.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(33, 125).addBox(-2.0F, -0.2022F, -0.0296F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.6918F, -2.4572F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftleg1.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(117, 120).addBox(-2.0F, -0.062F, -1.8779F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.3918F, 0.8428F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.1524F, -2.2584F, 1.4493F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(131, 52).addBox(-2.3F, -0.3883F, 0.1687F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(32, 39).addBox(-1.3F, 1.1117F, 0.1687F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, 0.3439F, 1.2547F, 1.5708F, 1.5533F, 1.5708F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(59, 141).addBox(-2.0999F, 0.8226F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.3439F, 1.2547F, -1.5708F, 1.3788F, -1.5708F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(141, 51).addBox(-0.4099F, 1.1243F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.3439F, 1.2547F, 1.5708F, 1.3265F, 1.5708F));

		PartDefinition Leftshin_r4 = Leftleg2.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(17, 145).addBox(-0.4927F, 0.1196F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, 10.2829F, 2.1686F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition Leftshin_r5 = Leftleg2.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(144, 143).addBox(-4.7927F, 9.2196F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.3439F, 1.2547F, -1.5708F, 1.2392F, -1.5708F));

		PartDefinition Leftshin_r6 = Leftleg2.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(125, 79).addBox(-0.9F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3313F, 12.1556F, 2.2547F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition Leftshin_r7 = Leftleg2.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(130, 112).addBox(-1.1F, -2.7883F, -1.8313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 4.1439F, 1.2547F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition Leftshin_r8 = Leftleg2.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(28, 105).addBox(-1.4F, -4.4883F, -1.8313F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(25, 39).addBox(-1.8F, -4.4883F, -1.8313F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, 0.9547F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r9 = Leftleg2.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(112, 44).addBox(-3.1F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3313F, 1.0556F, 1.2547F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition Leftshin_r10 = Leftleg2.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(125, 74).addBox(0.7F, -2.6883F, -1.8313F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 5.1439F, 2.7547F, -1.5708F, 0.829F, -1.5708F));

		PartDefinition Leftshin_r11 = Leftleg2.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(116, 135).addBox(0.0F, -0.0883F, -1.8313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 10.2439F, 2.7547F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(7, 113).addBox(-0.9F, -0.1292F, -1.6609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 13.9347F, 2.1486F, -1.427F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(91, 31).addBox(-3.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 7.5077F, -1.0845F, 1.6085F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(91, 38).addBox(-3.0F, -0.5F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(35, 105).addBox(-1.0F, -1.595F, -1.6496F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 6.397F, 0.7988F, 0.263F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, 5.3028F, -2.1589F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.6918F, -2.4572F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(127, 92).addBox(0.0F, -0.0409F, 0.028F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.5122F, -2.5244F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(126, 124).addBox(0.0F, 1.7591F, -0.372F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.6918F, -2.4572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightleg1.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(126, 119).addBox(0.0F, -0.2022F, -0.0296F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.6918F, -2.4572F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightleg1.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(64, 115).addBox(0.0F, -0.062F, -1.8779F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 2.3918F, 0.8428F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.1524F, -2.2584F, 0.4398F, 0.0749F, -0.1578F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(120, 131).addBox(-0.7F, -0.3883F, 0.1687F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(81, 109).addBox(0.3F, 1.1117F, 0.1687F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, 0.3439F, 1.2547F, 1.5708F, -1.5533F, -1.5708F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(141, 73).addBox(1.0999F, 0.8226F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3439F, 1.2547F, -1.5708F, -1.3788F, 1.5708F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(141, 68).addBox(-0.5901F, 1.1243F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3439F, 1.2547F, 1.5708F, -1.3265F, -1.5708F));

		PartDefinition Rightshin_r4 = Rightleg2.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(79, 145).addBox(-0.5073F, 0.1196F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, 10.2829F, 2.1686F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition Rightshin_r5 = Rightleg2.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(145, 56).addBox(3.7927F, 9.2196F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3439F, 1.2547F, -1.5708F, -1.2392F, 1.5708F));

		PartDefinition Rightshin_r6 = Rightleg2.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(127, 102).addBox(-1.1F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3313F, 12.1556F, 2.2547F, -1.5708F, -0.8727F, 1.5708F));

		PartDefinition Rightshin_r7 = Rightleg2.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(131, 56).addBox(0.1F, -2.7883F, -1.8313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 4.1439F, 1.2547F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition Rightshin_r8 = Rightleg2.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(0, 107).addBox(0.4F, -4.4883F, -1.8313F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(48, 105).addBox(0.8F, -4.4883F, -1.8313F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 5.6439F, 0.9547F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r9 = Rightleg2.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(114, 98).addBox(-0.9F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3313F, 1.0556F, 1.2547F, -1.5708F, -1.309F, 1.5708F));

		PartDefinition Rightshin_r10 = Rightleg2.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(127, 97).addBox(-2.7F, -2.6883F, -1.8313F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 5.1439F, 2.7547F, -1.5708F, -0.829F, 1.5708F));

		PartDefinition Rightshin_r11 = Rightleg2.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(135, 118).addBox(-1.0F, -0.0883F, -1.8313F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 10.2439F, 2.7547F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(16, 113).addBox(-1.1F, -0.1292F, -1.6609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 13.9347F, 2.1486F, -0.5107F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(72, 92).addBox(-2.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.5077F, -1.0845F, 0.2073F, -0.0456F, 0.2134F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(91, 92).addBox(-2.0F, -0.5F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, -2.5F));

		return LayerDefinition.create(meshdefinition, 152, 152);
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