package fossils.fossils.client.blockentity.model.scelidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ScelidosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart hipsOsteoderms;
	private final ModelPart hipsOsteoderms2;
	private final ModelPart tail;
	private final ModelPart tailOsteoderms;
	private final ModelPart tailOsteoderms2;
	private final ModelPart tail2;
	private final ModelPart tail2Osteoderms;
	private final ModelPart tail2Osteoderms2;
	private final ModelPart tail3;
	private final ModelPart tail3Osteoderms;
	private final ModelPart tail3Osteoderms2;
	private final ModelPart tail4;
	private final ModelPart tail4Osteoderms;
	private final ModelPart tail4Osteoderms2;
	private final ModelPart tail5;
	private final ModelPart tail5Osteoderms;
	private final ModelPart tail5Osteoderms2;
	private final ModelPart body;
	private final ModelPart bodyOsteoderms;
	private final ModelPart bodyOsteoderms2;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart chestOsteoderms;
	private final ModelPart chestOsteoderms2;
	private final ModelPart neck;
	private final ModelPart bipartiteOsteoderm3;
	private final ModelPart bipartiteOsteoderm6;
	private final ModelPart neck2;
	private final ModelPart bipartiteOsteoderm2;
	private final ModelPart bipartiteOsteoderm5;
	private final ModelPart neck3;
	private final ModelPart bipartiteOsteoderm;
	private final ModelPart bipartiteOsteoderm4;
	private final ModelPart head;
	private final ModelPart occipitalhorn;
	private final ModelPart occipitalhorn2;
	private final ModelPart Jaw;

	public ScelidosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.hipsOsteoderms = this.hips.getChild("hipsOsteoderms");
		this.hipsOsteoderms2 = this.hips.getChild("hipsOsteoderms2");
		this.tail = this.hips.getChild("tail");
		this.tailOsteoderms = this.tail.getChild("tailOsteoderms");
		this.tailOsteoderms2 = this.tail.getChild("tailOsteoderms2");
		this.tail2 = this.tail.getChild("tail2");
		this.tail2Osteoderms = this.tail2.getChild("tail2Osteoderms");
		this.tail2Osteoderms2 = this.tail2.getChild("tail2Osteoderms2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail3Osteoderms = this.tail3.getChild("tail3Osteoderms");
		this.tail3Osteoderms2 = this.tail3.getChild("tail3Osteoderms2");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail4Osteoderms = this.tail4.getChild("tail4Osteoderms");
		this.tail4Osteoderms2 = this.tail4.getChild("tail4Osteoderms2");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail5Osteoderms = this.tail5.getChild("tail5Osteoderms");
		this.tail5Osteoderms2 = this.tail5.getChild("tail5Osteoderms2");
		this.body = this.hips.getChild("body");
		this.bodyOsteoderms = this.body.getChild("bodyOsteoderms");
		this.bodyOsteoderms2 = this.body.getChild("bodyOsteoderms2");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.chestOsteoderms = this.chest.getChild("chestOsteoderms");
		this.chestOsteoderms2 = this.chest.getChild("chestOsteoderms2");
		this.neck = this.chest.getChild("neck");
		this.bipartiteOsteoderm3 = this.neck.getChild("bipartiteOsteoderm3");
		this.bipartiteOsteoderm6 = this.neck.getChild("bipartiteOsteoderm6");
		this.neck2 = this.neck.getChild("neck2");
		this.bipartiteOsteoderm2 = this.neck2.getChild("bipartiteOsteoderm2");
		this.bipartiteOsteoderm5 = this.neck2.getChild("bipartiteOsteoderm5");
		this.neck3 = this.neck2.getChild("neck3");
		this.bipartiteOsteoderm = this.neck3.getChild("bipartiteOsteoderm");
		this.bipartiteOsteoderm4 = this.neck3.getChild("bipartiteOsteoderm4");
		this.head = this.neck3.getChild("head");
		this.occipitalhorn = this.head.getChild("occipitalhorn");
		this.occipitalhorn2 = this.head.getChild("occipitalhorn2");
		this.Jaw = this.head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 126).addBox(0.0F, -2.7782F, -0.0519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 5.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(126, 110).addBox(0.0F, -2.6536F, -0.0333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(95, 126).addBox(0.0F, -1.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 126).addBox(0.0F, -1.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 74).mirror().addBox(-1.5F, 1.4F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 106).mirror().addBox(-2.5F, 3.9F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(50, 22).mirror().addBox(-4.5F, 0.3F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 37).mirror().addBox(-2.5F, 0.3F, 2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(50, 22).addBox(1.5F, 0.3F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 106).addBox(1.5F, 3.9F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(99, 37).addBox(1.5F, 0.3F, 2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(106, 74).addBox(0.5F, 1.4F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 39).addBox(-0.5F, 1.4F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(0.5755F, -1.5589F, 3.8801F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 5.3F, 1.2F, -0.919F, -0.0331F, -0.208F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.2977F, -0.7279F, -0.3563F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 5.3F, 1.2F, -0.7321F, 0.0938F, -0.3747F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-0.3599F, -1.0765F, -0.6827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7761F, 5.0555F, 3.5455F, 0.8632F, 0.1445F, -0.3012F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(126, 107).mirror().addBox(-0.5F, -0.027F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 107).addBox(3.5F, -0.027F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.9998F, 0.1784F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 122).mirror().addBox(-1.5F, -3.94F, -1.6646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(45, 122).mirror().addBox(-1.5F, -3.94F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 20).mirror().addBox(-1.5F, -1.94F, -2.0646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(58, 122).addBox(2.5F, -3.94F, -1.6646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(45, 122).addBox(2.5F, -3.94F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 20).addBox(2.5F, -1.94F, -2.0646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 5.4F, 1.6F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 120).mirror().addBox(0.5359F, 3.6976F, 0.0649F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7761F, 5.0555F, 3.5455F, 0.6163F, 0.0144F, -0.1146F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(122, 79).mirror().addBox(-0.3599F, 2.0296F, -0.4295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7761F, 5.0555F, 3.5455F, 0.7236F, 0.1445F, -0.3012F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 120).mirror().addBox(-0.3599F, -0.935F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7761F, 5.0555F, 3.5455F, 0.4618F, 0.1445F, -0.3012F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(119, 53).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8715F, 1.3009F, 5.0913F, -0.332F, 0.0495F, -0.0171F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 119).mirror().addBox(0.0F, 0.0905F, 0.0494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 0.621F, 4.9305F, -0.3659F, 0.4274F, -0.1575F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.6F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8598F, 1.2905F, 0.9943F, 0.2208F, -0.0309F, -0.0485F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(119, 49).mirror().addBox(-0.1398F, -0.0826F, -0.0722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 2.2F, -1.9F, 0.5216F, 0.0087F, -0.2922F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.1819F, -0.4224F, -2.9568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 1.0F, 2.2F, 0.2233F, -0.15F, -0.0755F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(126, 60).mirror().addBox(-0.5F, -1.0946F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(126, 60).addBox(3.5F, -1.0946F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 4.8998F, -0.4216F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 119).mirror().addBox(-1.0F, 1.4691F, -2.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 2.0F, -0.2094F, 0.2443F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(119, 45).mirror().addBox(-1.0224F, 0.4482F, -1.5593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2F, -0.9F, 0.2094F, 0.4712F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(119, 41).mirror().addBox(-1.0224F, -0.1326F, -1.9346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2F, -0.9F, 0.5934F, 0.4712F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(109, 120).mirror().addBox(-1.0F, -2.109F, 1.5157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7F, 5.0F, -1.5882F, -0.2094F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 122).mirror().addBox(-1.0F, -1.5747F, 1.1972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7F, 5.0F, -1.2915F, -0.2094F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(-1.0F, 0.0384F, -0.042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7F, 5.0F, -0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(106, 84).mirror().addBox(-1.0F, -0.0238F, -3.036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 2.0F, 0.192F, 0.2443F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(109, 120).addBox(0.0F, -2.109F, 1.5157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 0.7F, 5.0F, -1.5882F, 0.2094F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 122).addBox(0.0F, -1.5747F, 1.1972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.7F, 5.0F, -1.2915F, 0.2094F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(119, 53).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8715F, 1.3009F, 5.0913F, -0.332F, -0.0495F, 0.0171F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 119).addBox(-1.0F, 0.0905F, 0.0494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.5F, 0.621F, 4.9305F, -0.3659F, -0.4274F, 0.1575F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(114, 93).addBox(0.0F, 0.0384F, -0.042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.7F, 5.0F, -0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(93, 75).addBox(-1.5755F, -1.5589F, 3.8801F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 5.3F, 1.2F, -0.919F, 0.0331F, 0.208F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 0).addBox(-0.7023F, -0.7279F, -0.3563F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.2F, 5.3F, 1.2F, -0.7321F, -0.0938F, 0.3747F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 120).addBox(-1.5359F, 3.6976F, 0.0649F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7761F, 5.0555F, 3.5455F, 0.6163F, -0.0144F, 0.1146F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(122, 79).addBox(-0.6401F, 2.0296F, -0.4295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7761F, 5.0555F, 3.5455F, 0.7236F, -0.1445F, 0.3012F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 22).addBox(-0.6401F, -1.0765F, -0.6827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7761F, 5.0555F, 3.5455F, 0.8632F, -0.1445F, 0.3012F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 120).addBox(-0.6401F, -0.935F, 0.1117F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7761F, 5.0555F, 3.5455F, 0.4618F, -0.1445F, 0.3012F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 119).addBox(0.0F, 1.4691F, -2.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.5F, 2.0F, -0.2094F, -0.2443F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(119, 45).addBox(0.0224F, 0.4482F, -1.5593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 1.2F, -0.9F, 0.2094F, -0.4712F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(119, 49).addBox(-0.8602F, -0.0826F, -0.0722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 2.2F, -1.9F, 0.5216F, -0.0087F, 0.2922F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(119, 41).addBox(0.0224F, -0.1326F, -1.9346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2F, -0.9F, 0.5934F, -0.4712F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 107).addBox(-0.4F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8598F, 1.2905F, 0.9943F, 0.2208F, 0.0309F, 0.0485F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(106, 79).addBox(-0.8181F, -0.4224F, -2.9568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.3F, 1.0F, 2.2F, 0.2233F, 0.15F, 0.0755F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(106, 84).addBox(0.0F, -0.0238F, -3.036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5F, 2.0F, 0.192F, -0.2443F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 2.9F, 2.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 8).addBox(-0.2F, 0.0F, -3.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.238F, -0.1762F, 2.0933F, 0.0007F, -0.0013F, -0.4648F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(82, 37).addBox(-0.4F, -0.9F, -3.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(28, 94).addBox(-0.3F, 2.1F, -1.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 68).addBox(-0.2F, 0.4F, -2.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.306F, 1.8165F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.8906F, 5.8608F, 2.587F, 0.0734F, -0.01F, 0.4749F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(116, 116).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(1.1649F, 5.3928F, -0.4056F, -0.0139F, -0.01F, 0.4749F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 112).addBox(-2.0F, 0.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(34, 110).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.306F, -0.6835F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 102).addBox(-2.0F, -0.7019F, -0.0695F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.206F, 0.2165F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 86).addBox(-2.0F, -3.9F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 108).addBox(-2.0F, -3.9F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.206F, -0.6835F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(112, 110).addBox(-2.8F, 1.9683F, 0.1539F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(94, 114).addBox(-0.2F, 2.7683F, 0.2539F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 107).addBox(-2.8F, 5.9683F, -0.3461F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(99, 68).addBox(-2.8F, -0.0317F, -0.8461F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(38, 61).addBox(0.7412F, 2.1745F, 0.3308F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 8.2932F, 1.4924F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2412F, 4.9683F, -0.712F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 115).addBox(-3.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.9683F, -0.7461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(119, 108).addBox(-3.0F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2F, 2.0683F, 2.0539F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(114, 120).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2F, 2.7683F, 0.2539F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(105, 10).addBox(-2.0F, -0.1142F, -0.7461F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.1458F, 0.9011F, -0.48F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(69, 30).addBox(-3.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.9F, 2.7F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(90, 15).addBox(-0.8F, 0.0F, -3.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.238F, -0.1762F, 2.0933F, 0.0007F, 0.0013F, 0.4648F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 45).addBox(-0.6F, -0.9F, -3.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(41, 94).addBox(-0.7F, 2.1F, -1.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(-0.8F, 0.4F, -2.5F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.306F, 1.8165F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(119, 67).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(-0.8906F, 5.8608F, 2.587F, 0.0734F, 0.01F, -0.4749F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(63, 119).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(-1.1649F, 5.3928F, -0.4056F, -0.0139F, 0.01F, -0.4749F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(112, 54).addBox(0.0F, 0.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(41, 112).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.306F, -0.6835F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(44, 102).addBox(-1.0F, -0.7019F, -0.0695F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.206F, 0.2165F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(108, 36).addBox(0.0F, -3.9F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 108).addBox(0.0F, -3.9F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.206F, -0.6835F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(114, 0).addBox(0.8F, 1.9683F, 0.1539F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(99, 114).addBox(-0.8F, 2.7683F, 0.2539F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 105).addBox(0.8F, 5.9683F, -0.3461F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 100).addBox(0.8F, -0.0317F, -0.8461F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(91, 116).addBox(-1.7412F, 2.1745F, 0.3308F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 8.2932F, 1.4924F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(48, 112).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2412F, 4.9683F, -0.712F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(115, 36).addBox(1.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.9683F, -0.7461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(119, 112).addBox(1.0F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2F, 2.0683F, 2.0539F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(119, 120).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 2.7683F, 0.2539F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(11, 105).addBox(-1.0F, -0.1142F, -0.7461F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.1458F, 0.9011F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 72).addBox(-2.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.6109F, 0.0F, 0.0F));

		PartDefinition hipsOsteoderms = hips.addOrReplaceChild("hipsOsteoderms", CubeListBuilder.create(), PartPose.offset(1.4F, -0.9589F, 5.103F));

		PartDefinition cube_r65 = hipsOsteoderms.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -0.9617F, -0.0069F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = hipsOsteoderms.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 39).addBox(-0.0787F, -1.3105F, -0.0268F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0843F, 0.6505F, -5.0341F, -0.118F, -0.0342F, 0.3052F));

		PartDefinition cube_r67 = hipsOsteoderms.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(91, 83).addBox(-2.1F, 0.4F, -4.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1235F, 0.7023F, -0.7064F, -0.0714F, -0.1243F, -0.465F));

		PartDefinition hipsOsteoderms2 = hips.addOrReplaceChild("hipsOsteoderms2", CubeListBuilder.create(), PartPose.offset(-1.4F, -0.9589F, 5.103F));

		PartDefinition cube_r68 = hipsOsteoderms2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(0.0F, -0.9617F, -0.0069F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = hipsOsteoderms2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(0.0787F, -1.3105F, -0.0268F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0843F, 0.6505F, -5.0341F, -0.118F, 0.0342F, -0.3052F));

		PartDefinition cube_r70 = hipsOsteoderms2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(0.1F, 0.4F, -4.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1235F, 0.7023F, -0.7064F, -0.0714F, 0.1243F, 0.465F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.5171F, -0.0871F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5976F, 7.7784F, -0.0632F, 0.2613F, -0.0164F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 128).addBox(0.0F, -1.3F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5171F, 10.0129F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 128).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4171F, 7.9129F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 128).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4171F, 5.9129F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(104, 126).addBox(0.0F, -2.3F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4171F, 4.0129F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(11, 95).addBox(0.0F, 1.9184F, 7.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 128).addBox(0.0F, 1.6184F, 5.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 18).addBox(0.0F, 1.0184F, 3.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 106).addBox(0.0F, 0.3184F, 1.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 128).addBox(0.0F, -0.5816F, -2.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 128).addBox(0.0F, 0.0184F, -0.1908F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4829F, 1.9129F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(101, 126).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5171F, 1.9129F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 123).addBox(0.0F, -2.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5171F, 0.0129F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tailOsteoderms = tail.addOrReplaceChild("tailOsteoderms", CubeListBuilder.create(), PartPose.offset(1.4F, -3.1171F, 1.6129F));

		PartDefinition cube_r78 = tailOsteoderms.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 94).addBox(0.0F, -0.3F, -2.3F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2179F, 0.0F, 2.4905F, -0.1047F, -0.0873F, 0.0F));

		PartDefinition cube_r79 = tailOsteoderms.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 90).addBox(0.0F, -0.6F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.9F, 8.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tailOsteoderms.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(87, 103).addBox(-7.0041F, -2.0517F, 3.2848F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(33, 100).addBox(-4.6219F, -1.658F, 0.9782F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(98, 100).addBox(2.2698F, -0.4923F, -4.6878F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(98, 100).addBox(-1.2F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6447F, 6.0323F, 1.8054F, -0.0151F, 0.5853F, 0.4205F));

		PartDefinition cube_r81 = tailOsteoderms.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(80, 112).addBox(-1.0338F, -0.2816F, -0.9661F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0546F, 1.3971F, 9.6323F, -0.0211F, 0.603F, -0.5243F));

		PartDefinition cube_r82 = tailOsteoderms.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 103).addBox(-3.6515F, -1.281F, 0.9532F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(85, 98).addBox(2.1931F, -0.8112F, -5.1545F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(85, 98).addBox(-1.3F, -1.1F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2474F, 2.2863F, 2.4897F, 0.093F, 0.6524F, -0.4572F));

		PartDefinition tailOsteoderms2 = tail.addOrReplaceChild("tailOsteoderms2", CubeListBuilder.create(), PartPose.offset(-1.4F, -3.1171F, 1.6129F));

		PartDefinition cube_r83 = tailOsteoderms2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(54, 94).mirror().addBox(0.0F, -0.3F, -2.3F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2179F, 0.0F, 2.4905F, -0.1047F, 0.0873F, 0.0F));

		PartDefinition cube_r84 = tailOsteoderms2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(72, 90).mirror().addBox(0.0F, -0.6F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.9F, 8.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tailOsteoderms2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(87, 103).mirror().addBox(5.0041F, -2.0517F, 3.2848F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 100).mirror().addBox(2.6219F, -1.658F, 0.9782F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 100).mirror().addBox(-4.2698F, -0.4923F, -4.6878F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 100).mirror().addBox(-0.8F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6447F, 6.0323F, 1.8054F, -0.0151F, -0.5853F, -0.4205F));

		PartDefinition cube_r86 = tailOsteoderms2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 112).mirror().addBox(-0.9662F, -0.2816F, -0.9661F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0546F, 1.3971F, 9.6323F, -0.0211F, -0.603F, 0.5243F));

		PartDefinition cube_r87 = tailOsteoderms2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(76, 103).mirror().addBox(1.6515F, -1.281F, 0.9532F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 98).mirror().addBox(-5.1931F, -0.8112F, -5.1545F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 98).mirror().addBox(-1.7F, -1.1F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2474F, 2.2863F, 2.4897F, 0.093F, -0.6524F, 0.4572F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, -0.3782F, -0.0424F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1906F, 10.8833F, 0.0089F, 0.2182F, 0.0019F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(119, 128).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3782F, 6.9576F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(116, 128).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3782F, 4.9576F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(128, 115).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3782F, 2.9576F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(8, 129).addBox(0.0F, 4.6184F, 13.8092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 128).addBox(0.0F, 3.0184F, 11.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 96).addBox(0.0F, 2.5184F, 9.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6735F, -8.9705F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(113, 128).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3782F, 0.9576F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2Osteoderms = tail2.addOrReplaceChild("tail2Osteoderms", CubeListBuilder.create(), PartPose.offset(1.2F, -0.6782F, 7.9576F));

		PartDefinition cube_r93 = tail2Osteoderms.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(57, 85).addBox(-0.4F, -0.5F, -7.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r94 = tail2Osteoderms.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(69, 22).addBox(-1.4099F, -0.1767F, -3.5254F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4565F, 0.681F, -3.5905F, 0.0F, -0.0873F, -0.48F));

		PartDefinition cube_r95 = tail2Osteoderms.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 67).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4565F, 2.3718F, -3.561F, 0.0F, -0.0873F, 0.48F));

		PartDefinition tail2Osteoderms2 = tail2.addOrReplaceChild("tail2Osteoderms2", CubeListBuilder.create(), PartPose.offset(-1.2F, -0.6782F, 7.9576F));

		PartDefinition cube_r96 = tail2Osteoderms2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(0.4F, -0.5F, -7.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r97 = tail2Osteoderms2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-1.5901F, -0.1767F, -3.5254F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4565F, 0.681F, -3.5905F, 0.0F, 0.0873F, 0.48F));

		PartDefinition cube_r98 = tail2Osteoderms2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 67).mirror().addBox(-1.5F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4565F, 2.3718F, -3.561F, 0.0F, 0.0873F, -0.48F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.5288F, -0.061F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(122, 128).addBox(0.0F, -0.9288F, 0.939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 128).addBox(0.0F, -0.9288F, 2.939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 128).addBox(0.0F, -0.8288F, 4.939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 129).addBox(0.0F, -0.7288F, 6.939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1392F, 7.8499F, -0.1485F, -0.0432F, 0.0065F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(45, 129).addBox(0.0F, 6.5184F, 21.8092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 129).addBox(0.0F, 6.1184F, 19.8092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 36).addBox(0.0F, 5.5184F, 17.8092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 129).addBox(0.0F, 5.1184F, 15.8092F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5195F, -16.8214F, 0.3142F, 0.0F, 0.0F));

		PartDefinition tail3Osteoderms = tail3.addOrReplaceChild("tail3Osteoderms", CubeListBuilder.create(), PartPose.offset(0.8072F, -0.7288F, 0.9196F));

		PartDefinition cube_r100 = tail3Osteoderms.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 72).addBox(0.0148F, -0.5F, 0.0112F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0262F, 0.0F));

		PartDefinition cube_r101 = tail3Osteoderms.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(74, 75).addBox(-1.1758F, 0.3482F, -3.4115F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5326F, -0.2292F, 4.0835F, 0.0233F, -0.0561F, -0.4818F));

		PartDefinition cube_r102 = tail3Osteoderms.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 0).addBox(-1.5F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9928F, 1.7119F, 4.4111F, 0.0F, -0.0873F, 0.3927F));

		PartDefinition tail3Osteoderms2 = tail3.addOrReplaceChild("tail3Osteoderms2", CubeListBuilder.create(), PartPose.offset(-0.8072F, -0.7288F, 0.9196F));

		PartDefinition cube_r103 = tail3Osteoderms2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-0.0148F, -0.5F, 0.0112F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r104 = tail3Osteoderms2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.8242F, 0.3482F, -3.4115F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5326F, -0.2292F, 4.0835F, 0.0233F, 0.0561F, 0.4818F));

		PartDefinition cube_r105 = tail3Osteoderms2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9928F, 1.7119F, 4.4111F, 0.0F, 0.0873F, -0.3927F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(63, 57).addBox(-0.5F, -0.4981F, -0.0436F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 8.939F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition tail4Osteoderms = tail4.addOrReplaceChild("tail4Osteoderms", CubeListBuilder.create(), PartPose.offset(1.5F, 1.2019F, 4.4564F));

		PartDefinition cube_r106 = tail4Osteoderms.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 69).addBox(-0.9F, 0.0F, -4.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, -0.0873F, 0.3054F));

		PartDefinition cube_r107 = tail4Osteoderms.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 9).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3218F, -1.8749F, -0.2418F, 0.0435F, -0.035F, -0.3031F));

		PartDefinition cube_r108 = tail4Osteoderms.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 75).addBox(0.0F, -0.5F, -8.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -1.7F, 3.5F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail4Osteoderms2 = tail4.addOrReplaceChild("tail4Osteoderms2", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.2019F, 4.4564F));

		PartDefinition cube_r109 = tail4Osteoderms2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(38, 69).mirror().addBox(-0.1F, 0.0F, -4.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0873F, -0.3054F));

		PartDefinition cube_r110 = tail4Osteoderms2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3218F, -1.8749F, -0.2418F, 0.0435F, 0.035F, 0.3031F));

		PartDefinition cube_r111 = tail4Osteoderms2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(0.0F, -0.5F, -8.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2F, -1.7F, 3.5F, 0.0F, 0.0349F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(25, 27).addBox(-0.5F, -0.5098F, 0.0117F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0019F, 7.8564F, -0.006F, -0.2577F, 0.0465F));

		PartDefinition tail5Osteoderms = tail5.addOrReplaceChild("tail5Osteoderms", CubeListBuilder.create(), PartPose.offset(0.1F, -0.4098F, 9.9117F));

		PartDefinition cube_r112 = tail5Osteoderms.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -0.5F, -9.9F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r113 = tail5Osteoderms.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 12).addBox(-1.0F, 0.1F, -5.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8741F, -0.2966F, -4.4F, 0.0F, -0.0873F, -0.2618F));

		PartDefinition cube_r114 = tail5Osteoderms.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(42, 50).addBox(-0.5F, 0.2F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5127F, 0.1108F, -4.9417F, 0.0341F, -0.0692F, 0.3945F));

		PartDefinition tail5Osteoderms2 = tail5.addOrReplaceChild("tail5Osteoderms2", CubeListBuilder.create(), PartPose.offset(-0.1F, -0.4098F, 9.9117F));

		PartDefinition cube_r115 = tail5Osteoderms2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(0.0F, -0.5F, -9.9F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r116 = tail5Osteoderms2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 12).mirror().addBox(0.0F, 0.1F, -5.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8741F, -0.2966F, -4.4F, 0.0F, 0.0873F, 0.2618F));

		PartDefinition cube_r117 = tail5Osteoderms2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(42, 50).mirror().addBox(-0.5F, 0.2F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5127F, 0.1108F, -4.9417F, 0.0341F, 0.0692F, -0.3945F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1F, -1.0F, -0.0436F, -0.1309F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(64, 126).addBox(-0.5F, -2.608F, 6.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 126).addBox(-0.5F, -2.608F, 4.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 126).addBox(-0.5F, -2.608F, 2.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 55).addBox(-0.5F, -2.608F, 0.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 79).addBox(-1.0F, -0.008F, 0.1135F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.0F, -7.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -12.4269F, -0.101F, 0.4322F, -1.2957F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(121, 26).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -12.4269F, 0.1508F, 0.4183F, -0.7004F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(122, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -12.4269F, 0.3192F, 0.2819F, -0.2191F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.5255F, -10.4269F, -0.0974F, 0.345F, -1.3293F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(121, 4).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.5255F, -10.4269F, 0.1019F, 0.3438F, -0.7535F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(38, 122).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.5255F, -10.4269F, 0.2419F, 0.2368F, -0.2739F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(122, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -8.4269F, 0.1216F, 0.162F, -0.3152F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(109, 102).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -8.4269F, -0.092F, 0.2055F, -1.3453F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(120, 102).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -8.4269F, 0.0287F, 0.2231F, -0.7915F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(125, 34).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1255F, -0.5269F, -0.0801F, -0.1259F, -1.6589F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(22, 122).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1255F, -0.5269F, -0.1334F, -0.0668F, -1.1185F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1255F, -0.5269F, -0.1549F, -0.0228F, -0.6488F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(101, 121).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0255F, -2.5269F, -0.082F, -0.0736F, -1.554F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(121, 99).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0255F, -2.5269F, -0.1081F, -0.021F, -1.0149F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(121, 97).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0255F, -2.5269F, -0.1115F, 0.0066F, -0.5444F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(115, 86).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0745F, -4.5269F, -0.0845F, -0.0038F, -1.5016F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(119, 71).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0745F, -4.5269F, -0.0744F, 0.0402F, -0.9622F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(94, 121).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0745F, -4.5269F, -0.0537F, 0.0458F, -0.4905F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(44, 100).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1745F, -6.5269F, -0.0876F, 0.0834F, -1.4668F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1745F, -6.5269F, -0.032F, 0.1166F, -0.9239F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(121, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1745F, -6.5269F, 0.0188F, 0.0946F, -0.4505F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1255F, -0.5269F, -0.1549F, 0.0228F, 0.6488F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(22, 122).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1255F, -0.5269F, -0.1334F, 0.0668F, 1.1185F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(125, 34).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1255F, -0.5269F, -0.0801F, 0.1259F, 1.6589F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(121, 97).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0255F, -2.5269F, -0.1115F, -0.0066F, 0.5444F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(121, 99).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0255F, -2.5269F, -0.1081F, 0.021F, 1.0149F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(101, 121).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0255F, -2.5269F, -0.082F, 0.0736F, 1.554F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(94, 121).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.0745F, -4.5269F, -0.0537F, -0.0458F, 0.4905F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(119, 71).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.0745F, -4.5269F, -0.0744F, -0.0402F, 0.9622F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(115, 86).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.0745F, -4.5269F, -0.0845F, 0.0038F, 1.5016F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(122, 38).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -12.4269F, 0.3192F, -0.2819F, 0.2191F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(121, 26).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -12.4269F, 0.1508F, -0.4183F, 0.7004F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 37).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -12.4269F, -0.101F, -0.4322F, 1.2957F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(38, 122).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5255F, -10.4269F, 0.2419F, -0.2368F, 0.2739F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(121, 4).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5255F, -10.4269F, 0.1019F, -0.3438F, 0.7535F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 20).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5255F, -10.4269F, -0.0974F, -0.345F, 1.3293F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(120, 102).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -8.4269F, 0.0287F, -0.2231F, 0.7915F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(109, 102).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -8.4269F, -0.092F, -0.2055F, 1.3453F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(122, 36).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -8.4269F, 0.1216F, -0.162F, 0.3152F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(121, 64).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.1745F, -6.5269F, 0.0188F, -0.0946F, 0.4505F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(49, 92).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.1745F, -6.5269F, -0.032F, -0.1166F, 0.9239F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(44, 100).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.1745F, -6.5269F, -0.0876F, -0.0834F, 1.4668F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(126, 66).addBox(-0.5F, -2.7578F, -0.0353F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 126).addBox(-0.5F, -2.7849F, -0.0147F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -11.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(67, 126).addBox(-0.5F, -2.7171F, 0.0253F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -13.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(34, 86).addBox(-1.0F, 2.9F, 0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7F, -13.9F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bodyOsteoderms = body.addOrReplaceChild("bodyOsteoderms", CubeListBuilder.create().texOffs(0, 61).addBox(-3.5681F, -10.5096F, -6.0029F, 0.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F))
				.texOffs(110, 50).addBox(-1.1681F, -5.9016F, -2.5164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(110, 46).addBox(-1.1681F, -5.8016F, -5.6164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offset(5.0681F, 6.5016F, -1.9836F));

		PartDefinition cube_r165 = bodyOsteoderms.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(9, 111).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.4447F, 0.2286F, 0.005F, 0.117F, -0.01F, 0.4749F));

		PartDefinition cube_r166 = bodyOsteoderms.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(103, 110).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.0976F, 0.0155F, -3.4998F, 0.0297F, -0.01F, 0.4749F));

		PartDefinition cube_r167 = bodyOsteoderms.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 110).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.2976F, 0.0155F, -5.4998F, 0.0297F, -0.01F, 0.4749F));

		PartDefinition cube_r168 = bodyOsteoderms.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(103, 29).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.6423F, 0.0441F, -9.4948F, -0.0577F, 0.0771F, 0.4698F));

		PartDefinition cube_r169 = bodyOsteoderms.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(48, 27).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6319F, -1.1016F, -4.0164F, 0.0421F, -0.0113F, 0.2616F));

		PartDefinition cube_r170 = bodyOsteoderms.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 15).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6319F, -2.3016F, -4.0164F, 0.0421F, -0.0113F, 0.2616F));

		PartDefinition cube_r171 = bodyOsteoderms.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -7.0F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6319F, -3.5016F, -4.0164F, 0.0421F, -0.0113F, 0.2616F));

		PartDefinition cube_r172 = bodyOsteoderms.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(110, 67).addBox(-1.0F, -0.9F, -3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1681F, -4.8016F, -7.7164F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r173 = bodyOsteoderms.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(76, 99).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1681F, -5.2176F, -7.552F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bodyOsteoderms.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 110).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1681F, -5.5391F, 1.6158F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bodyOsteoderms.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 60).addBox(-1.5F, 0.4F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1409F, -6.769F, -0.7849F, -0.0178F, 0.0216F, 0.1801F));

		PartDefinition cube_r176 = bodyOsteoderms.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(110, 71).addBox(-0.4F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1612F, -7.136F, -6.6946F, 0.1267F, 0.3479F, -0.4397F));

		PartDefinition cube_r177 = bodyOsteoderms.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, -1.6F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8819F, -6.4805F, -1.599F, 0.0164F, 0.0063F, -0.4743F));

		PartDefinition cube_r178 = bodyOsteoderms.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 52).addBox(-2.1F, -1.6F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1819F, -7.7805F, -1.599F, 0.0164F, 0.0063F, -0.4743F));

		PartDefinition cube_r179 = bodyOsteoderms.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 61).addBox(-1.3F, 0.1F, -2.9F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6319F, -8.3536F, -8.8098F, 0.1195F, 0.088F, -0.4725F));

		PartDefinition cube_r180 = bodyOsteoderms.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 29).addBox(-0.1F, -0.1F, -2.8F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3681F, -9.4352F, -9.0103F, 0.175F, -0.0548F, 0.3006F));

		PartDefinition cube_r181 = bodyOsteoderms.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(15, 91).addBox(1.0F, -0.2F, -0.1F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5681F, -9.2016F, -11.9164F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r182 = bodyOsteoderms.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(19, 61).addBox(0.0F, -0.5F, -4.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4681F, -9.7096F, -1.5029F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bodyOsteoderms2 = body.addOrReplaceChild("bodyOsteoderms2", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(3.5681F, -10.5096F, -6.0029F, 0.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(110, 50).mirror().addBox(-0.8319F, -5.9016F, -2.5164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(110, 46).mirror().addBox(-0.8319F, -5.8016F, -5.6164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offset(-5.0681F, 6.5016F, -1.9836F));

		PartDefinition cube_r183 = bodyOsteoderms2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(9, 111).mirror().addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-0.4447F, 0.2286F, 0.005F, 0.117F, 0.01F, -0.4749F));

		PartDefinition cube_r184 = bodyOsteoderms2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(103, 110).mirror().addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-0.0976F, 0.0155F, -3.4998F, 0.0297F, 0.01F, -0.4749F));

		PartDefinition cube_r185 = bodyOsteoderms2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(94, 110).mirror().addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-0.2976F, 0.0155F, -5.4998F, 0.0297F, 0.01F, -0.4749F));

		PartDefinition cube_r186 = bodyOsteoderms2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-0.6423F, 0.0441F, -9.4948F, -0.0577F, -0.0771F, -0.4698F));

		PartDefinition cube_r187 = bodyOsteoderms2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6319F, -1.1016F, -4.0164F, 0.0421F, 0.0113F, -0.2616F));

		PartDefinition cube_r188 = bodyOsteoderms2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(25, 15).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6319F, -2.3016F, -4.0164F, 0.0421F, 0.0113F, -0.2616F));

		PartDefinition cube_r189 = bodyOsteoderms2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.0F, -7.0F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6319F, -3.5016F, -4.0164F, 0.0421F, 0.0113F, -0.2616F));

		PartDefinition cube_r190 = bodyOsteoderms2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(110, 67).mirror().addBox(-1.0F, -0.9F, -3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1681F, -4.8016F, -7.7164F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r191 = bodyOsteoderms2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1681F, -5.2176F, -7.552F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r192 = bodyOsteoderms2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(63, 110).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1681F, -5.5391F, 1.6158F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r193 = bodyOsteoderms2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(-0.5F, 0.4F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1409F, -6.769F, -0.7849F, -0.0178F, -0.0216F, -0.1801F));

		PartDefinition cube_r194 = bodyOsteoderms2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(110, 71).mirror().addBox(-1.6F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1612F, -7.136F, -6.6946F, 0.1267F, -0.3479F, 0.4397F));

		PartDefinition cube_r195 = bodyOsteoderms2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -1.6F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8819F, -6.4805F, -1.599F, 0.0164F, -0.0063F, 0.4743F));

		PartDefinition cube_r196 = bodyOsteoderms2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(0.1F, -1.6F, -4.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1819F, -7.7805F, -1.599F, 0.0164F, -0.0063F, 0.4743F));

		PartDefinition cube_r197 = bodyOsteoderms2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(84, 61).mirror().addBox(-0.7F, 0.1F, -2.9F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6319F, -8.3536F, -8.8098F, 0.1195F, -0.088F, 0.4725F));

		PartDefinition cube_r198 = bodyOsteoderms2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(0.1F, -0.1F, -2.8F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3681F, -9.4352F, -9.0103F, 0.175F, 0.0548F, -0.3006F));

		PartDefinition cube_r199 = bodyOsteoderms2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-1.0F, -0.2F, -0.1F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5681F, -9.2016F, -11.9164F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r200 = bodyOsteoderms2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(0.0F, -0.5F, -4.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4681F, -9.7096F, -1.5029F, 0.0F, 0.0F, -0.3054F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -12.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(21, 51).mirror().addBox(-0.5F, -0.0395F, -0.2445F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.8576F, -4.4504F, -0.1153F, -0.4387F, 0.1228F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.5F, -0.0395F, -0.2445F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.8576F, -4.4504F, -0.1083F, -0.6123F, 0.1436F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-1.0F, -0.0395F, -0.4445F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.8576F, -4.4504F, -0.1388F, -0.585F, 0.1529F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(101, 57).mirror().addBox(-1.0F, -0.0395F, -0.6445F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.8576F, -4.4504F, 0.1072F, -0.8894F, 0.0942F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(105, 22).mirror().addBox(-0.1F, -1.0F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3708F, 6.5092F, -6.5782F, 0.0635F, -0.3281F, -0.9751F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(105, 16).mirror().addBox(-0.3F, -0.6403F, -1.7791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.4F, -7.0F, 0.2777F, -0.3143F, -0.4228F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-0.5F, -0.423F, -0.1372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 45).addBox(6.3F, -0.423F, -0.1372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 2.5F, -4.9F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-0.5F, -1.0257F, -0.5332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(99, 51).addBox(6.3F, -1.0257F, -0.5332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.4F, 2.9F, -4.3F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.5F, -0.3804F, 0.1142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(17, 82).mirror().addBox(-0.5F, -0.9804F, 0.2142F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(65, 99).addBox(6.3F, -0.3804F, 0.1142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(17, 82).addBox(6.3F, -0.9804F, 0.2142F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.4F, 4.9F, -7.3F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 34).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.2363F, 0.7299F, -1.2479F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(122, 73).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.5975F, 0.5026F, -0.6397F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(126, 71).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.7283F, 0.1896F, -0.2628F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, -0.0529F, 0.6554F, -1.323F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(123, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, 0.5479F, 0.3468F, -0.2004F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, 0.3377F, 0.5752F, -0.6633F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, -0.0804F, 0.5353F, -1.3036F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(121, 30).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, 0.2331F, 0.4925F, -0.6816F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(123, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, 0.4235F, 0.3138F, -0.2059F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(122, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, 0.3537F, 0.2929F, -0.2442F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 12).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, -0.0944F, 0.4666F, -1.3278F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(121, 28).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, 0.1776F, 0.4433F, -0.7241F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(101, 62).mirror().addBox(-1.0F, -0.096F, 1.4846F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(101, 62).addBox(-1.0F, -0.096F, 1.4846F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.0727F, -8.6365F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(21, 51).addBox(-0.5F, -0.0395F, -0.2445F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.8576F, -4.4504F, -0.1153F, 0.4387F, -0.1228F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(82, 53).addBox(-0.5F, -0.0395F, -0.2445F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.8576F, -4.4504F, -0.1083F, 0.6123F, -0.1436F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(90, 22).addBox(0.0F, -0.0395F, -0.4445F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.8576F, -4.4504F, -0.1388F, 0.585F, -0.1529F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 57).addBox(0.0F, -0.0395F, -0.6445F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.8576F, -4.4504F, 0.1072F, 0.8894F, -0.0942F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(128, 25).addBox(0.0F, -1.9571F, -0.0218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(126, 91).addBox(0.0F, -2.2637F, -0.0805F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 126).addBox(0.0F, -2.5205F, -0.0066F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(126, 71).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.7283F, -0.1896F, 0.2628F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(122, 73).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.5975F, -0.5026F, 0.6397F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(103, 34).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.2363F, -0.7299F, 1.2479F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(121, 32).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, 0.3377F, -0.5752F, 0.6633F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(123, 8).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, 0.5479F, -0.3468F, 0.2004F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 18).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, -0.0529F, -0.6554F, 1.323F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(123, 6).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, 0.4235F, -0.3138F, 0.2059F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(121, 30).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, 0.2331F, -0.4925F, 0.6816F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(52, 9).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, -0.0804F, -0.5353F, 1.3036F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(121, 28).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, 0.1776F, -0.4433F, 0.7241F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(31, 12).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, -0.0944F, -0.4666F, 1.3278F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(122, 83).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, 0.3537F, -0.2929F, 0.2442F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(86, 126).addBox(0.0F, -2.7935F, 0.0595F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(105, 22).addBox(-0.9F, -1.0F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3708F, 6.5092F, -6.5782F, 0.0635F, 0.3281F, 0.9751F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(105, 16).addBox(-0.7F, -0.6403F, -1.7791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.4F, 4.4F, -7.0F, 0.2777F, 0.3143F, 0.4228F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, -1.0011F, -0.0163F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, -7.4F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9374F, 5.8803F, -5.9046F, 1.2246F, 0.045F, -0.258F));

		PartDefinition cube_r246 = leftArm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(17, 120).addBox(-1.0F, -2.0F, 0.3F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0236F, 1.8912F, -2.9289F, 0.1876F, 0.6219F, 0.2156F));

		PartDefinition cube_r247 = leftArm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(104, 114).addBox(-1.3913F, -3.283F, 0.0242F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7646F, 3.6497F, -0.8163F, 0.2505F, -0.3452F, 0.0147F));

		PartDefinition cube_r248 = leftArm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 120).addBox(0.0F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2354F, 2.3497F, -0.2163F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftArm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(73, 125).addBox(-1.0F, 0.0182F, -0.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 125).addBox(-1.0F, -0.4818F, -0.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8646F, 0.5497F, -0.4163F, -1.3864F, -0.4886F, 0.1076F));

		PartDefinition cube_r250 = leftArm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(121, 14).addBox(-1.0F, 0.2246F, -0.9172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8646F, 0.5497F, -0.4163F, -0.3915F, -0.4886F, 0.1076F));

		PartDefinition cube_r251 = leftArm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(121, 10).addBox(-1.0F, 0.7213F, -2.3062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8646F, 0.5497F, -0.4163F, 0.5161F, -0.4886F, 0.1076F));

		PartDefinition cube_r252 = leftArm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(57, 69).addBox(0.0F, -3.9F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2354F, 6.5497F, -0.1163F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0397F, 6.5668F, -0.7516F, -1.0375F, 0.2524F, -0.0967F));

		PartDefinition cube_r253 = leftArm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 108).addBox(0.0F, -2.7F, -1.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(58, 108).addBox(0.0F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3266F, 2.8927F, 0.1657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftArm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 125).addBox(-0.7F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.127F, 1.4183F, -0.2155F, -0.1442F, -0.3293F, 0.1524F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(55, 102).addBox(-1.0F, -1.2164F, -3.0763F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4324F, 5.9545F, -0.6483F, 1.866F, 0.1926F, 0.4897F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9374F, 5.8803F, -5.9046F, 1.2683F, -0.045F, 0.258F));

		PartDefinition cube_r255 = rightArm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(33, 120).addBox(-1.0F, -2.0F, 0.3F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0236F, 1.8912F, -2.9289F, 0.1876F, -0.6219F, -0.2156F));

		PartDefinition cube_r256 = rightArm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(7, 115).addBox(-0.6087F, -3.283F, 0.0242F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7646F, 3.6497F, -0.8163F, 0.2505F, 0.3452F, -0.0147F));

		PartDefinition cube_r257 = rightArm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(120, 88).addBox(-1.0F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2354F, 2.3497F, -0.2163F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightArm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(125, 88).addBox(0.0F, 0.0182F, -0.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 125).addBox(0.0F, -0.4818F, -0.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8646F, 0.5497F, -0.4163F, -1.3864F, 0.4886F, -0.1076F));

		PartDefinition cube_r259 = rightArm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(121, 22).addBox(0.0F, 0.2246F, -0.9172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8646F, 0.5497F, -0.4163F, -0.3915F, 0.4886F, -0.1076F));

		PartDefinition cube_r260 = rightArm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(121, 18).addBox(0.0F, 0.7213F, -2.3062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8646F, 0.5497F, -0.4163F, 0.5161F, 0.4886F, -0.1076F));

		PartDefinition cube_r261 = rightArm.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(58, 116).addBox(-1.0F, -3.9F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2354F, 6.5497F, -0.1163F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0397F, 6.5668F, -0.7516F, -1.2993F, -0.2524F, 0.0967F));

		PartDefinition cube_r262 = rightArm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(29, 110).addBox(-1.0F, -2.7F, -1.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(109, 94).addBox(-1.0F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3266F, 2.8927F, 0.1657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightArm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(107, 125).addBox(-0.3F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.127F, 1.4183F, -0.2155F, -0.1442F, 0.3293F, -0.1524F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(105, 0).addBox(0.0F, -1.2164F, -3.0763F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4324F, 5.9545F, -0.6483F, 1.866F, -0.1926F, -0.4897F));

		PartDefinition chestOsteoderms = chest.addOrReplaceChild("chestOsteoderms", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -0.9F));

		PartDefinition cube_r264 = chestOsteoderms.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(85, 90).addBox(1.5F, -0.7891F, -6.3197F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r265 = chestOsteoderms.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -0.2F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5399F, 0.8111F, -2.3876F, 0.4382F, -0.108F, 0.2863F));

		PartDefinition cube_r266 = chestOsteoderms.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(38, 78).addBox(-1.2F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.25F, 2.2175F, -3.3474F, 0.3313F, 0.3042F, -0.4512F));

		PartDefinition cube_r267 = chestOsteoderms.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(109, 116).addBox(-0.5F, -1.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2822F, 4.5614F, -2.365F, 0.0775F, -0.0588F, -0.0266F));

		PartDefinition cube_r268 = chestOsteoderms.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(115, 82).addBox(-1.6F, -0.5F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(116, 104).addBox(-1.6F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3682F, 4.248F, -2.5147F, 0.0778F, 0.1152F, -0.0131F));

		PartDefinition cube_r269 = chestOsteoderms.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(111, 89).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(4.863F, 6.5264F, -5.4021F, -0.0369F, 0.2432F, 0.3818F));

		PartDefinition cube_r270 = chestOsteoderms.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(98, 89).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(4.9657F, 7.4172F, -1.6834F, -0.237F, 0.2022F, 0.424F));

		PartDefinition chestOsteoderms2 = chest.addOrReplaceChild("chestOsteoderms2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -0.9F));

		PartDefinition cube_r271 = chestOsteoderms2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-1.5F, -0.7891F, -6.3197F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chestOsteoderms2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0F, -0.2F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5399F, 0.8111F, -2.3876F, 0.4382F, 0.108F, -0.2863F));

		PartDefinition cube_r273 = chestOsteoderms2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(38, 78).mirror().addBox(-0.8F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.25F, 2.2175F, -3.3474F, 0.3313F, -0.3042F, 0.4512F));

		PartDefinition cube_r274 = chestOsteoderms2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(109, 116).mirror().addBox(-0.5F, -1.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2822F, 4.5614F, -2.365F, 0.0775F, 0.0588F, 0.0266F));

		PartDefinition cube_r275 = chestOsteoderms2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(115, 82).mirror().addBox(0.6F, -0.5F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 104).mirror().addBox(0.6F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3682F, 4.248F, -2.5147F, 0.0778F, -0.1152F, 0.0131F));

		PartDefinition cube_r276 = chestOsteoderms2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(111, 89).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-4.863F, 6.5264F, -5.4021F, -0.0369F, -0.2432F, -0.3818F));

		PartDefinition cube_r277 = chestOsteoderms2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(98, 89).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.0004F)).mirror(false), PartPose.offsetAndRotation(-4.9657F, 7.4172F, -1.6834F, -0.237F, -0.2022F, -0.424F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3F, -7.5F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 114).mirror().addBox(0.2F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5061F, -2.3487F, -1.1732F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(51, 114).addBox(-0.2F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5061F, -2.3487F, -1.1732F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r280 = neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(128, 29).addBox(0.0F, -2.4F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 105).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3496F, -2.9541F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0639F, -1.4837F, 0.1949F, 0.7613F, -1.5017F));

		PartDefinition cube_r282 = neck.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(122, 75).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0639F, -1.4837F, 0.5899F, 0.5458F, -0.8691F));

		PartDefinition cube_r283 = neck.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(128, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0639F, -1.4837F, 0.7385F, 0.2322F, -0.4863F));

		PartDefinition cube_r284 = neck.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(128, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0639F, -1.4837F, 0.7385F, -0.2322F, 0.4863F));

		PartDefinition cube_r285 = neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(74, 83).addBox(-3.0F, -1.5F, -1.2F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5089F, -1.8393F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(122, 75).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0639F, -1.4837F, 0.5899F, -0.5458F, 0.8691F));

		PartDefinition cube_r287 = neck.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(116, 34).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0639F, -1.4837F, 0.1949F, -0.7613F, 1.5017F));

		PartDefinition bipartiteOsteoderm3 = neck.addOrReplaceChild("bipartiteOsteoderm3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8881F, -0.7104F, -2.0107F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r288 = bipartiteOsteoderm3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(112, 60).addBox(-0.6737F, 1.8839F, -0.9512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6119F, 0.1831F, 0.0537F, -0.0853F, -0.0499F, 0.6517F));

		PartDefinition cube_r289 = bipartiteOsteoderm3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(114, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.643F, -0.2218F, 0.3166F, 0.7222F, 0.103F, 1.1295F));

		PartDefinition bipartiteOsteoderm6 = neck.addOrReplaceChild("bipartiteOsteoderm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8881F, -0.7104F, -2.0107F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r290 = bipartiteOsteoderm6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(112, 60).mirror().addBox(-1.3263F, 1.8839F, -0.9512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6119F, 0.1831F, 0.0537F, -0.0853F, 0.0499F, -0.6517F));

		PartDefinition cube_r291 = bipartiteOsteoderm6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(114, 25).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.643F, -0.2218F, 0.3166F, 0.7222F, -0.103F, -1.1295F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3504F, -2.7541F, -0.4505F, -0.49F, -0.3187F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(87, 120).addBox(0.0F, -2.0123F, -0.0426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 94).addBox(-1.5F, -2.0123F, -0.5426F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(33, 105).addBox(-0.5F, -1.0123F, -0.0426F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4056F, -2.6947F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(18, 128).addBox(0.0F, -1.6533F, 0.066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4056F, -0.9947F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(12, 115).mirror().addBox(-0.2F, -2.4F, -1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.7384F, -2.2043F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(12, 115).addBox(0.2F, -2.4F, -1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.7384F, -2.2043F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition bipartiteOsteoderm2 = neck2.addOrReplaceChild("bipartiteOsteoderm2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.16F, 0.7681F, -2.2875F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r296 = bipartiteOsteoderm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 108).addBox(-0.6351F, 1.2836F, -0.52F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.54F, 0.2393F, -0.2592F, -0.0853F, -0.0499F, 0.6517F));

		PartDefinition cube_r297 = bipartiteOsteoderm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(114, 15).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6761F, -0.3264F, 0.0423F, 0.8131F, -0.1118F, 1.0413F));

		PartDefinition bipartiteOsteoderm5 = neck2.addOrReplaceChild("bipartiteOsteoderm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.16F, 0.7681F, -2.2875F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r298 = bipartiteOsteoderm5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-1.3649F, 1.2836F, -0.52F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.54F, 0.2393F, -0.2592F, -0.0853F, 0.0499F, -0.6517F));

		PartDefinition cube_r299 = bipartiteOsteoderm5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(114, 15).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6761F, -0.3264F, 0.0423F, 0.8131F, 0.1118F, -1.0413F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6866F, -2.6915F, 0.6281F, -0.3587F, -0.443F));

		PartDefinition cube_r300 = neck3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(128, 104).addBox(0.0F, -0.9845F, 1.5188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 116).addBox(-1.0F, -0.9845F, 0.8188F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(11, 99).addBox(-0.5F, -0.1845F, -0.4812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.0795F, -3.2718F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm = neck3.addOrReplaceChild("bipartiteOsteoderm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3144F, -1.1915F, -1.934F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r301 = bipartiteOsteoderm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(122, 77).addBox(-0.9784F, 1.0518F, -0.3566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6856F, 0.4369F, 0.0621F, -0.0853F, -0.0499F, 0.6517F));

		PartDefinition cube_r302 = bipartiteOsteoderm.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(121, 60).addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4843F, -1.314F, -0.4161F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r303 = bipartiteOsteoderm.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(34, 82).addBox(0.3237F, -0.4873F, -0.456F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4718F, -0.9467F, 0.0621F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bipartiteOsteoderm4 = neck3.addOrReplaceChild("bipartiteOsteoderm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3144F, -1.1915F, -1.934F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r304 = bipartiteOsteoderm4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(122, 77).mirror().addBox(-1.0216F, 1.0518F, -0.3566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6856F, 0.4369F, 0.0621F, -0.0853F, 0.0499F, -0.6517F));

		PartDefinition cube_r305 = bipartiteOsteoderm4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(121, 60).mirror().addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4843F, -1.314F, -0.4161F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r306 = bipartiteOsteoderm4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(34, 82).mirror().addBox(-0.3237F, -0.4873F, -0.456F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4718F, -0.9467F, 0.0621F, 0.0F, 0.0F, -0.8727F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9795F, -3.1718F, 0.4079F, -0.2308F, -0.0092F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(126, 10).mirror().addBox(-1.5F, 0.0272F, -0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(126, 10).addBox(0.5F, 0.0272F, -0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7476F, 0.3297F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(126, 13).mirror().addBox(-1.5F, -0.0065F, -0.0693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(126, 13).addBox(0.5F, -0.0065F, -0.0693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9476F, 1.0297F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-1.5F, -0.8426F, -0.9951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(121, 0).addBox(0.5F, -0.8426F, -0.9951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.6524F, -0.0703F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(114, 30).mirror().addBox(-0.7195F, -0.2927F, -0.9969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1606F, 0.3707F, -0.5928F, -0.3568F, -0.535F, -0.3498F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(120, 125).mirror().addBox(-0.1896F, -0.8945F, -0.288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5276F, -1.1206F, -2.1114F, 0.2466F, 0.335F, 0.1201F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(110, 125).mirror().addBox(-0.8F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 125).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 125).mirror().addBox(-0.8F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8276F, -1.1206F, -3.7114F, 0.233F, -0.0552F, 0.0244F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(41, 118).mirror().addBox(-0.179F, -0.4297F, -1.7402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4276F, -1.1206F, -4.1114F, 0.5492F, -0.9329F, -0.3266F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(-1.51F, -1.0025F, -0.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 46).addBox(0.51F, -1.0025F, -0.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8476F, -1.5703F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(121, 93).mirror().addBox(-1.51F, -0.004F, -0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(121, 93).addBox(0.51F, -0.004F, -0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.6476F, -0.9703F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(126, 43).mirror().addBox(-1.51F, -0.004F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(126, 43).addBox(0.51F, -0.004F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.6476F, -0.9703F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(126, 19).mirror().addBox(-0.4958F, -0.6836F, -0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, -0.5383F, -2.9669F, 0.0623F, -0.1746F, 0.0347F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(126, 40).mirror().addBox(-0.4983F, -0.7243F, -0.744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, -0.5383F, -2.9669F, 1.4422F, -0.1742F, 0.0236F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(126, 22).mirror().addBox(-0.5113F, -0.2459F, -0.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, -0.5383F, -2.9669F, 0.5521F, -0.1742F, 0.0236F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(43, 126).mirror().addBox(-0.4974F, -0.6796F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, -0.5383F, -2.9669F, 0.4114F, -0.1746F, 0.0347F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-0.6147F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(126, 0).mirror().addBox(-0.7747F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, -0.5383F, -2.9669F, 0.2903F, -0.1742F, 0.0236F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(87, 123).mirror().addBox(-0.51F, -0.0422F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(87, 123).addBox(-0.49F, -0.0422F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 123).addBox(-0.5F, -0.1422F, -0.9128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6244F, -7.3946F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-0.6F, 0.128F, -1.0648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(50, 123).mirror().addBox(-0.6F, 0.128F, -1.5648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1045F)).mirror(false)
				.texOffs(50, 123).addBox(0.0F, 0.128F, -1.5648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1045F))
				.texOffs(28, 91).addBox(0.0F, 0.128F, -1.0648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.3413F, -6.7653F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(26, 115).mirror().addBox(-0.4F, -0.9731F, -1.0387F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 115).addBox(0.8F, -0.9731F, -1.0387F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.5413F, -6.3653F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(114, 10).mirror().addBox(-0.4F, -0.8761F, -2.9526F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 10).addBox(0.8F, -0.8761F, -2.9526F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.2413F, -3.4653F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(73, 105).mirror().addBox(-0.4F, -0.8761F, 0.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 105).addBox(0.8F, -0.8761F, 0.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.2413F, -3.4653F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(123, 104).mirror().addBox(-0.6F, -1.0086F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(123, 104).addBox(0.0F, -1.0086F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, 0.9413F, -2.8653F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(102, 123).mirror().addBox(-0.6F, -1.0211F, 0.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(102, 123).addBox(0.0F, -1.0211F, 0.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 1.0413F, -3.8653F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(92, 123).mirror().addBox(-0.6F, -1.0159F, -0.6727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(92, 123).addBox(0.0F, -1.0159F, -0.6727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, 1.0413F, -4.1653F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(123, 116).mirror().addBox(-0.6F, -1.0036F, -0.8728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(123, 116).addBox(0.0F, -1.0036F, -0.8728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 1.0413F, -4.8653F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(63, 123).mirror().addBox(-0.6F, -0.9695F, -0.8679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(63, 123).addBox(0.0F, -0.9695F, -0.8679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, 1.1413F, -5.7653F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(114, 30).addBox(-0.2805F, -0.2927F, -0.9969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1606F, 0.3707F, -0.5928F, -0.3568F, 0.535F, 0.3498F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(18, 111).addBox(-1.5F, -1.0008F, -1.0625F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3476F, 0.2297F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(126, 49).mirror().addBox(-1.9F, 0.0139F, -0.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(126, 49).addBox(-0.1F, 0.0139F, -0.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(119, 57).addBox(-1.5F, 0.0139F, -0.0576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.9476F, -1.5703F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(48, 126).mirror().addBox(-1.4F, -0.0161F, 0.0369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(48, 126).addBox(0.4F, -0.0161F, 0.0369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(112, 64).addBox(-1.5F, 0.0035F, 0.0369F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0476F, -0.6703F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(110, 42).addBox(-1.5F, -1.2F, 0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.7476F, -2.4703F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(126, 19).addBox(-0.5042F, -0.6836F, -0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 0.0623F, 0.1746F, -0.0347F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(126, 40).addBox(-0.5017F, -0.7243F, -0.744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 1.4422F, 0.1742F, -0.0236F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(126, 0).addBox(-0.2253F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(126, 52).addBox(-0.3853F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 0.2903F, 0.1742F, -0.0236F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(126, 22).addBox(-0.4887F, -0.2459F, -0.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 0.5521F, 0.1742F, -0.0236F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(126, 16).addBox(-0.5144F, -0.5314F, -0.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 0.2369F, 0.1746F, -0.0347F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(43, 126).addBox(-0.5026F, -0.6796F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, -0.5383F, -2.9669F, 0.4114F, 0.1746F, -0.0347F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(120, 125).addBox(-0.8104F, -0.8945F, -0.288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5276F, -1.1206F, -2.1114F, 0.2466F, -0.335F, -0.1201F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(115, 125).addBox(-0.2F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 125).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(110, 125).addBox(-0.2F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8276F, -1.1206F, -3.7114F, 0.233F, 0.0552F, -0.0244F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(41, 118).addBox(-0.821F, -0.4297F, -1.7402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4276F, -1.1206F, -4.1114F, 0.5492F, 0.9329F, 0.3266F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(70, 114).mirror().addBox(0.0F, -0.0819F, 1.0702F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1529F, -4.5327F, 0.2356F, -0.1571F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(124, 85).mirror().addBox(0.0F, 0.0092F, 0.0713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1529F, -4.5327F, 0.3229F, -0.1571F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(98, 105).mirror().addBox(0.0F, -0.9585F, -2.6171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6413F, -1.9653F, -0.231F, -0.187F, 0.0437F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(70, 114).addBox(-1.0F, -0.0819F, 1.0702F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.1529F, -4.5327F, 0.2356F, 0.1571F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(124, 85).addBox(-1.0F, 0.0092F, 0.0713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1529F, -4.5327F, 0.3229F, 0.1571F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(63, 114).addBox(-0.5F, -0.0236F, 0.0278F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4529F, -3.5327F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(38, 124).addBox(-0.5F, 0.0092F, 0.0713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1529F, -4.5327F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(97, 123).addBox(-0.5F, -0.0457F, -0.9034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.2244F, -7.0946F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(22, 124).addBox(-0.5F, -0.0165F, -1.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2756F, -6.1946F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(34, 116).addBox(-0.5F, 0.4064F, -1.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.1709F, -4.4666F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(116, 6).addBox(-0.5F, 0.0064F, -1.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1709F, -4.4666F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(105, 6).addBox(-1.7F, -1.056F, -0.5396F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 0.7413F, -1.9653F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(98, 105).addBox(-1.0F, -0.9585F, -2.6171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 0.6413F, -1.9653F, -0.231F, 0.187F, -0.0437F));

		PartDefinition occipitalhorn = head.addOrReplaceChild("occipitalhorn", CubeListBuilder.create(), PartPose.offset(0.9F, -1.7809F, 0.353F));

		PartDefinition cube_r359 = occipitalhorn.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 126).addBox(-0.2453F, -0.3402F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.1F, -0.8F, 1.0F, 1.0279F, 1.0889F, 0.8212F));

		PartDefinition cube_r360 = occipitalhorn.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(84, 116).addBox(-0.723F, -0.4367F, -1.0008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.1F, -0.3F, 0.1F, 0.4626F, 0.4749F, 0.0723F));

		PartDefinition occipitalhorn2 = head.addOrReplaceChild("occipitalhorn2", CubeListBuilder.create(), PartPose.offset(-0.9F, -1.7809F, 0.353F));

		PartDefinition cube_r361 = occipitalhorn2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-0.7547F, -0.3402F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.8F, 1.0F, 1.0279F, -1.0889F, -0.8212F));

		PartDefinition cube_r362 = occipitalhorn2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 116).mirror().addBox(-0.277F, -0.4367F, -1.0008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3F, 0.1F, 0.4626F, -0.4749F, -0.0723F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8528F, -0.3321F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(27, 127).addBox(-0.5F, -0.0945F, -0.1412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.4502F, -6.6712F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(127, 79).addBox(-0.5F, -0.8186F, -1.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(37, 127).addBox(-0.5F, -0.8186F, -0.8695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6502F, -6.8712F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(22, 127).addBox(-0.5F, -0.9179F, -0.8975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.4502F, -6.1712F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(17, 79).mirror().addBox(-0.3F, 0.0216F, -0.739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 79).addBox(0.3F, 0.0216F, -0.739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7034F, -5.9558F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(65, 94).mirror().addBox(-0.6F, 0.007F, -0.1393F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 94).addBox(0.4F, 0.007F, -0.1393F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6034F, -4.8558F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.8F, -0.0524F, -0.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 124).addBox(-0.2F, -0.0524F, -0.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3034F, -5.0558F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(0.0F, -0.7705F, -0.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, 0.8203F, -0.192F, 0.0F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(114, 98).mirror().addBox(-0.5F, -0.7763F, -1.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(114, 98).addBox(1.5F, -0.7763F, -1.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, 0.7101F, 0.207F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(128, 3).mirror().addBox(0.0F, -0.2471F, -1.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, 0.0524F, -0.192F, 0.0F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(17, 125).mirror().addBox(0.0F, 0.0509F, -1.7166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(124, 122).mirror().addBox(0.0F, 0.0509F, -2.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, -0.2793F, -0.192F, 0.0F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(27, 124).mirror().addBox(0.0F, -1.6217F, -0.3247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, 1.0647F, -0.192F, 0.0F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(124, 119).mirror().addBox(0.0F, -1.68F, -1.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, 0.4538F, -0.192F, 0.0F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(26, 118).mirror().addBox(-0.5F, -0.9654F, -0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(26, 118).addBox(0.1F, -0.9654F, -0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, -0.1034F, -5.2558F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-0.6F, 0.0216F, -0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 9).addBox(0.4F, 0.0216F, -0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.7034F, -5.9558F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(115, 78).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 78).addBox(1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.1101F, -0.393F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(0.0F, -0.665F, -2.3408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0966F, -0.9558F, -0.1396F, -0.192F, 0.0F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.5F, -1.0345F, -0.9822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(0, 127).addBox(0.1F, -1.0345F, -0.9822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.0502F, -5.2712F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(115, 74).mirror().addBox(-0.8F, 0.0191F, -1.9231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(115, 74).addBox(-0.2F, 0.0191F, -1.9231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9034F, -3.1558F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(127, 101).addBox(-1.0F, -0.7705F, -0.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, 0.8203F, 0.192F, 0.0F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(27, 124).addBox(-1.0F, -1.6217F, -0.3247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, 1.0647F, 0.192F, 0.0F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(124, 119).addBox(-1.0F, -1.68F, -1.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, 0.4538F, 0.192F, 0.0F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(128, 3).addBox(-1.0F, -0.2471F, -1.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, 0.0524F, 0.192F, 0.0F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(17, 125).addBox(-1.0F, 0.0509F, -1.7166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(124, 122).addBox(-1.0F, 0.0509F, -2.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, -0.2793F, 0.192F, 0.0F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(10, 126).addBox(-1.0F, -0.665F, -2.3408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.0966F, -0.9558F, -0.1396F, 0.192F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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