package fossils.fossils.client.blockentity.model.nigersaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NigersaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart bodyfront;
	private final ModelPart neckbase;
	private final ModelPart neckmiddlebase;
	private final ModelPart neckmiddlefront;
	private final ModelPart neckfront;
	private final ModelPart head;
	private final ModelPart lowerjawbase;
	private final ModelPart lowerjawmiddlebase;
	private final ModelPart lowerjawmiddlefront;
	private final ModelPart lowerjawfront;
	private final ModelPart lowerjawteeth;
	private final ModelPart lowerlip;
	private final ModelPart mouthslope;
	private final ModelPart upperjawbase;
	private final ModelPart upperjawmiddle;
	private final ModelPart upperjawfront;
	private final ModelPart leftupperjawside;
	private final ModelPart leftupperjawside2;
	private final ModelPart leftupperjawside6;
	private final ModelPart rightupperjawside;
	private final ModelPart upperjawteeth;
	private final ModelPart upperjawfront3;
	private final ModelPart leftupperjawside5;
	private final ModelPart rightupperjawside3;
	private final ModelPart upperjawteeth3;
	private final ModelPart upperjawfront2;
	private final ModelPart leftupperjawside3;
	private final ModelPart leftupperjawside4;
	private final ModelPart rightupperjawside2;
	private final ModelPart upperjawteeth2;
	private final ModelPart snoutslope;
	private final ModelPart headslopebase;
	private final ModelPart headslopemiddle;
	private final ModelPart headslopefront;
	private final ModelPart bone;
	private final ModelPart lefteye;
	private final ModelPart righteye;
	private final ModelPart neckflapfront;
	private final ModelPart neckskinfront;
	private final ModelPart neckflapmidfront;
	private final ModelPart neckskinmidfront;
	private final ModelPart neckflapmidbase;
	private final ModelPart neckskinmidbase;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public NigersaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.bodyfront = this.bodymiddle.getChild("bodyfront");
		this.neckbase = this.bodyfront.getChild("neckbase");
		this.neckmiddlebase = this.neckbase.getChild("neckmiddlebase");
		this.neckmiddlefront = this.neckmiddlebase.getChild("neckmiddlefront");
		this.neckfront = this.neckmiddlefront.getChild("neckfront");
		this.head = this.neckfront.getChild("head");
		this.lowerjawbase = this.head.getChild("lowerjawbase");
		this.lowerjawmiddlebase = this.lowerjawbase.getChild("lowerjawmiddlebase");
		this.lowerjawmiddlefront = this.lowerjawmiddlebase.getChild("lowerjawmiddlefront");
		this.lowerjawfront = this.lowerjawmiddlefront.getChild("lowerjawfront");
		this.lowerjawteeth = this.lowerjawfront.getChild("lowerjawteeth");
		this.lowerlip = this.lowerjawfront.getChild("lowerlip");
		this.mouthslope = this.lowerjawmiddlebase.getChild("mouthslope");
		this.upperjawbase = this.head.getChild("upperjawbase");
		this.upperjawmiddle = this.upperjawbase.getChild("upperjawmiddle");
		this.upperjawfront = this.upperjawmiddle.getChild("upperjawfront");
		this.leftupperjawside = this.upperjawfront.getChild("leftupperjawside");
		this.leftupperjawside2 = this.upperjawfront.getChild("leftupperjawside2");
		this.leftupperjawside6 = this.upperjawfront.getChild("leftupperjawside6");
		this.rightupperjawside = this.upperjawfront.getChild("rightupperjawside");
		this.upperjawteeth = this.upperjawfront.getChild("upperjawteeth");
		this.upperjawfront3 = this.upperjawmiddle.getChild("upperjawfront3");
		this.leftupperjawside5 = this.upperjawfront3.getChild("leftupperjawside5");
		this.rightupperjawside3 = this.upperjawfront3.getChild("rightupperjawside3");
		this.upperjawteeth3 = this.upperjawfront3.getChild("upperjawteeth3");
		this.upperjawfront2 = this.upperjawmiddle.getChild("upperjawfront2");
		this.leftupperjawside3 = this.upperjawfront2.getChild("leftupperjawside3");
		this.leftupperjawside4 = this.upperjawfront2.getChild("leftupperjawside4");
		this.rightupperjawside2 = this.upperjawfront2.getChild("rightupperjawside2");
		this.upperjawteeth2 = this.upperjawfront2.getChild("upperjawteeth2");
		this.snoutslope = this.upperjawmiddle.getChild("snoutslope");
		this.headslopebase = this.head.getChild("headslopebase");
		this.headslopemiddle = this.headslopebase.getChild("headslopemiddle");
		this.headslopefront = this.headslopemiddle.getChild("headslopefront");
		this.bone = this.headslopebase.getChild("bone");
		this.lefteye = this.head.getChild("lefteye");
		this.righteye = this.head.getChild("righteye");
		this.neckflapfront = this.neckfront.getChild("neckflapfront");
		this.neckskinfront = this.neckflapfront.getChild("neckskinfront");
		this.neckflapmidfront = this.neckmiddlefront.getChild("neckflapmidfront");
		this.neckskinmidfront = this.neckflapmidfront.getChild("neckskinmidfront");
		this.neckflapmidbase = this.neckmiddlebase.getChild("neckflapmidbase");
		this.neckskinmidbase = this.neckflapmidbase.getChild("neckskinmidbase");
		this.leftArm = this.bodyfront.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.bodyfront.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.2F, 15.0F, -0.0188F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-1.3681F, -3.1611F, -4.8237F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9814F, 4.0455F, 1.405F, 0.4245F, 0.0361F, -0.1708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 135).mirror().addBox(-2.2469F, -0.0281F, -0.0063F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, -5.8551F, 0.9651F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(137, 57).mirror().addBox(-0.5F, -3.0436F, -0.4407F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.424F, -6.0747F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(143, 98).mirror().addBox(-2.2469F, -0.0515F, -2.0069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, -4.6551F, -8.3349F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(137, 64).mirror().addBox(-2.2469F, -0.042F, -2.8914F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, -6.2551F, -5.9349F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-1.2469F, -2.4869F, -5.8645F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, 1.3449F, 0.3651F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 131).mirror().addBox(-0.6118F, 5.6205F, -0.57F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9814F, 4.1455F, -4.795F, 0.0142F, 0.0132F, -0.383F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(71, 135).mirror().addBox(-0.6118F, -0.3718F, 0.4013F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9814F, 4.1455F, -4.795F, -0.1603F, 0.0132F, -0.383F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.7606F, -1.5377F, -1.1661F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9955F, 3.9889F, 1.357F, -0.5934F, 0.0495F, -0.4921F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 87).mirror().addBox(-1.0891F, -6.642F, -6.8629F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9814F, 5.6455F, 1.605F, -0.1165F, 0.0361F, -0.1708F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 114).mirror().addBox(-2.013F, -0.3491F, 0.104F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9814F, 1.5455F, -4.695F, 0.058F, 0.0361F, -0.1708F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(128, 31).mirror().addBox(-2.2469F, -0.1082F, -0.102F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, -6.7551F, -2.8349F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(102, 138).mirror().addBox(-0.5F, -1.0F, -3.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.524F, -5.7747F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(135, 80).mirror().addBox(-2.2469F, -8.6628F, -4.7009F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, 1.3449F, 0.3651F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, -1.9692F, -8.9887F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.5405F, 4.4531F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 135).mirror().addBox(-2.2469F, -0.043F, 0.1199F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2531F, -4.2551F, 3.3651F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 135).addBox(1.2469F, -0.043F, 0.1199F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2531F, -4.2551F, 3.3651F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -1.9692F, -8.9887F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 0.5405F, 4.4531F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(143, 98).addBox(1.2469F, -0.0515F, -2.0069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2531F, -4.6551F, -8.3349F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(137, 64).addBox(1.2469F, -0.042F, -2.8914F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2531F, -6.2551F, -5.9349F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(135, 80).addBox(1.2469F, -8.6628F, -4.7009F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2531F, 1.3449F, 0.3651F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(137, 57).addBox(-0.5F, -3.0436F, -0.4407F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.0F, -1.424F, -6.0747F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(102, 138).addBox(-0.5F, -1.0F, -3.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.524F, -5.7747F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 135).addBox(1.2469F, -0.0281F, -0.0063F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2531F, -5.8551F, 0.9651F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(128, 31).addBox(1.2469F, -0.1082F, -0.102F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2531F, -6.7551F, -2.8349F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 55).addBox(0.3681F, -3.1611F, -4.8237F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9814F, 4.0455F, 1.405F, 0.4245F, -0.0361F, 0.1708F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(111, 114).addBox(1.013F, -0.3491F, 0.104F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9814F, 1.5455F, -4.695F, 0.058F, -0.0361F, 0.1708F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(114, 87).addBox(0.0891F, -6.642F, -6.8629F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9814F, 5.6455F, 1.605F, -0.1165F, -0.0361F, 0.1708F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 83).addBox(-0.2394F, -1.5377F, -1.1661F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9955F, 3.9889F, 1.357F, -0.5934F, -0.0495F, 0.4921F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(71, 135).addBox(-0.3882F, -0.3718F, 0.4013F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.9814F, 4.1455F, -4.795F, -0.1603F, -0.0132F, 0.383F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(53, 131).addBox(-0.3882F, 5.6205F, -0.57F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9814F, 4.1455F, -4.795F, 0.0142F, -0.0132F, 0.383F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 0).addBox(-2.7531F, -2.4869F, -5.8645F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2531F, 1.3449F, 0.3651F, -0.0611F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -2.007F, 0.1001F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 131).addBox(-0.5F, -7.8042F, 8.8314F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 131).addBox(-0.5F, -7.9042F, 5.8314F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 117).addBox(-0.5F, -8.2042F, 0.8314F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 131).addBox(-0.5F, -8.0042F, -2.1686F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3072F, -4.765F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.2583F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = bodymiddle.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-7.5F, -1.8154F, -6.9533F, 15.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0043F, -8.7643F, -0.1396F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r2 = bodymiddle.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(41, 0).addBox(-7.5F, -3.1818F, -6.9437F, 15.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0043F, -1.7643F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bodymiddle.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(152, 146).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6937F, -15.7299F, -0.0463F, -0.1671F, 1.9896F));

		PartDefinition cube_r35 = bodymiddle.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(101, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6937F, -15.7299F, 0.1862F, -0.0255F, 0.8133F));

		PartDefinition cube_r36 = bodymiddle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(122, 134).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6937F, -15.7299F, 0.1676F, 0.0854F, 0.212F));

		PartDefinition cube_r37 = bodymiddle.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(152, 142).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -12.7299F, -0.0037F, -0.0713F, 1.9845F));

		PartDefinition cube_r38 = bodymiddle.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(144, 79).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -12.7299F, 0.1142F, 0.0506F, 0.8124F));

		PartDefinition cube_r39 = bodymiddle.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(139, 139).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -12.7299F, 0.0646F, 0.1069F, 0.2021F));

		PartDefinition cube_r40 = bodymiddle.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(43, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.0937F, -1.1299F, 0.1767F, 0.3272F, 1.7463F));

		PartDefinition cube_r41 = bodymiddle.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(151, 137).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.0937F, -1.1299F, -0.2016F, 0.36F, 0.4849F));

		PartDefinition cube_r42 = bodymiddle.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(142, 152).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.4937F, -4.0299F, 0.1537F, 0.2797F, 1.8615F));

		PartDefinition cube_r43 = bodymiddle.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(104, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.4937F, -4.0299F, -0.1611F, 0.3241F, 0.6207F));

		PartDefinition cube_r44 = bodymiddle.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 154).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.4937F, -4.0299F, -0.3172F, 0.1746F, 0.0082F));

		PartDefinition cube_r45 = bodymiddle.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(125, 152).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8937F, -7.1299F, 0.0877F, 0.1364F, 1.9351F));

		PartDefinition cube_r46 = bodymiddle.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(74, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8937F, -7.1299F, -0.0448F, 0.214F, 0.7389F));

		PartDefinition cube_r47 = bodymiddle.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 145).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8937F, -7.1299F, -0.1601F, 0.1494F, 0.1209F));

		PartDefinition cube_r48 = bodymiddle.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 142).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -9.7299F, -0.0734F, 0.1338F, 0.1855F));

		PartDefinition cube_r49 = bodymiddle.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -9.7299F, 0.0172F, 0.1516F, 0.8026F));

		PartDefinition cube_r50 = bodymiddle.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(122, 152).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2937F, -9.7299F, 0.0524F, 0.0565F, 1.9841F));

		PartDefinition cube_r51 = bodymiddle.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(151, 137).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.0937F, -1.1299F, -0.2016F, -0.36F, -0.4849F));

		PartDefinition cube_r52 = bodymiddle.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(43, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.0937F, -1.1299F, 0.1767F, -0.3272F, -1.7463F));

		PartDefinition cube_r53 = bodymiddle.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 154).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.4937F, -4.0299F, -0.3172F, -0.1746F, -0.0082F));

		PartDefinition cube_r54 = bodymiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(104, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.4937F, -4.0299F, -0.1611F, -0.3241F, -0.6207F));

		PartDefinition cube_r55 = bodymiddle.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(142, 152).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.4937F, -4.0299F, 0.1537F, -0.2797F, -1.8615F));

		PartDefinition cube_r56 = bodymiddle.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(93, 145).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8937F, -7.1299F, -0.1601F, -0.1494F, -0.1209F));

		PartDefinition cube_r57 = bodymiddle.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(74, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8937F, -7.1299F, -0.0448F, -0.214F, -0.7389F));

		PartDefinition cube_r58 = bodymiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(125, 152).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8937F, -7.1299F, 0.0877F, -0.1364F, -1.9351F));

		PartDefinition cube_r59 = bodymiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(122, 134).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6937F, -15.7299F, 0.1676F, -0.0854F, -0.212F));

		PartDefinition cube_r60 = bodymiddle.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(101, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6937F, -15.7299F, 0.1862F, 0.0255F, -0.8133F));

		PartDefinition cube_r61 = bodymiddle.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(152, 146).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6937F, -15.7299F, -0.0463F, 0.1671F, -1.9896F));

		PartDefinition cube_r62 = bodymiddle.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(139, 139).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -12.7299F, 0.0646F, -0.1069F, -0.2021F));

		PartDefinition cube_r63 = bodymiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(144, 79).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -12.7299F, 0.1142F, -0.0506F, -0.8124F));

		PartDefinition cube_r64 = bodymiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(152, 142).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -12.7299F, -0.0037F, 0.0713F, -1.9845F));

		PartDefinition cube_r65 = bodymiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(122, 152).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -9.7299F, 0.0524F, -0.0565F, -1.9841F));

		PartDefinition cube_r66 = bodymiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -9.7299F, 0.0172F, -0.1516F, -0.8026F));

		PartDefinition cube_r67 = bodymiddle.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(10, 142).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2937F, -9.7299F, -0.0734F, -0.1338F, -0.1855F));

		PartDefinition bodymiddle_r3 = bodymiddle.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0629F, 0.9492F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7643F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bodymiddle.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(95, 130).addBox(-0.5F, -7.5707F, 2.8827F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 130).addBox(-0.5F, -7.4707F, -0.1173F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7028F, -4.7293F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bodymiddle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(20, 130).addBox(-0.5F, -7.5363F, -0.1396F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7028F, -7.7293F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bodymiddle.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(127, 129).addBox(-0.5F, -7.091F, -0.2071F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2028F, -10.6293F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bodymiddle.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(135, 47).addBox(-0.5F, -6.618F, 2.9199F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 135).addBox(-0.5F, -6.218F, -0.0801F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8028F, -16.7293F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7957F, -17.7643F, 0.1274F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-11.5F, -0.0922F, 0.1011F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 14.5315F, -6.3199F, -0.3711F, 0.7715F, -0.1886F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-10.4F, -0.0922F, 0.1011F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 14.5315F, -6.3199F, -0.3777F, 0.6387F, -0.1939F));

		PartDefinition bodyfront_r3 = bodyfront.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-9.0F, -0.0922F, 0.1011F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 14.5315F, -6.3199F, -0.3605F, 0.5185F, -0.1607F));

		PartDefinition bodyfront_r4 = bodyfront.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-7.5F, -0.0922F, -0.3989F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 14.5315F, -6.3199F, -0.2951F, 0.4639F, -0.0354F));

		PartDefinition bodyfront_r5 = bodyfront.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(-0.0659F, -0.0189F, -3.8862F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1872F, 7.8377F, -13.8024F, 2.0325F, -0.8009F, -0.7694F));

		PartDefinition cube_r72 = bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(17, 134).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.0572F, -10.3258F, 0.3384F, 0.0476F, 0.0139F));

		PartDefinition cube_r73 = bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(27, 145).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.0572F, -10.3258F, 0.3072F, -0.1518F, 0.5931F));

		PartDefinition cube_r74 = bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(27, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.0572F, -10.3258F, -0.1209F, -0.326F, 1.7984F));

		PartDefinition cube_r75 = bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(27, 130).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6572F, -8.1258F, 0.2872F, 0.0591F, 0.0984F));

		PartDefinition cube_r76 = bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(142, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6572F, -8.1258F, 0.2706F, -0.114F, 0.6852F));

		PartDefinition cube_r77 = bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(153, 17).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.6572F, -8.1258F, -0.0979F, -0.2785F, 1.8788F));

		PartDefinition cube_r78 = bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(17, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2572F, -6.1258F, 0.2531F, 0.0667F, 0.1487F));

		PartDefinition cube_r79 = bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(107, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2572F, -6.1258F, 0.2463F, -0.0888F, 0.74F));

		PartDefinition cube_r80 = bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(153, 6).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.2572F, -6.1258F, -0.0829F, -0.2467F, 1.9273F));

		PartDefinition cube_r81 = bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(43, 125).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8572F, -3.7258F, 0.2189F, 0.0742F, 0.1637F));

		PartDefinition cube_r82 = bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(68, 143).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8572F, -3.7258F, 0.2222F, -0.0635F, 0.7593F));

		PartDefinition cube_r83 = bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.8572F, -3.7258F, -0.0681F, -0.2149F, 1.9414F));

		PartDefinition cube_r84 = bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(14, 131).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2572F, -0.7258F, 0.1333F, 0.0927F, 0.1566F));

		PartDefinition cube_r85 = bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2572F, -0.7258F, 0.1622F, -0.0001F, 0.7612F));

		PartDefinition cube_r86 = bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2572F, -0.7258F, -0.032F, -0.1352F, 1.9351F));

		PartDefinition bodyfront_r6 = bodyfront.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(32, 125).mirror().addBox(-0.5F, -2.3F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0872F, 8.5377F, -11.4024F, 1.09F, -0.8009F, -0.7694F));

		PartDefinition bodyfront_r7 = bodyfront.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(92, 118).mirror().addBox(-0.5F, -2.7662F, -8.3342F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.54F, -4.1804F, 0.587F, -0.052F, 0.1223F));

		PartDefinition bodyfront_r8 = bodyfront.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(116, 124).mirror().addBox(-0.5F, -2.3095F, -5.9762F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 134).mirror().addBox(-0.5F, -1.3095F, -1.9762F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.54F, -4.1804F, 0.7965F, -0.052F, 0.1223F));

		PartDefinition bodyfront_r9 = bodyfront.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(143, 93).mirror().addBox(-0.5F, -0.5142F, -5.0855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.54F, -4.1804F, 0.1158F, -0.052F, 0.1223F));

		PartDefinition bodyfront_r10 = bodyfront.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(128, 15).mirror().addBox(-0.2026F, 1.1992F, 3.5297F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-7.7F, 2.54F, -4.1804F, 1.2434F, 0.0346F, 0.2619F));

		PartDefinition bodyfront_r11 = bodyfront.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(127, 120).mirror().addBox(-0.2026F, 1.6391F, 0.9873F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.7F, 2.54F, -4.1804F, 1.9416F, 0.0346F, 0.2619F));

		PartDefinition bodyfront_r12 = bodyfront.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(128, 6).mirror().addBox(-0.2026F, -0.8479F, 1.1966F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7F, 2.54F, -4.1804F, 1.4529F, 0.0346F, 0.2619F));

		PartDefinition bodyfront_r13 = bodyfront.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(27, 97).mirror().addBox(-0.2026F, -1.5703F, 0.0735F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.7F, 2.54F, -4.1804F, 0.4755F, 0.0346F, 0.2619F));

		PartDefinition bodyfront_r14 = bodyfront.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(27, 97).addBox(-0.7974F, -1.5703F, 0.0735F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.7F, 2.54F, -4.1804F, 0.4755F, -0.0346F, -0.2619F));

		PartDefinition bodyfront_r15 = bodyfront.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(128, 15).addBox(-0.7974F, 1.1992F, 3.5297F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(7.7F, 2.54F, -4.1804F, 1.2434F, -0.0346F, -0.2619F));

		PartDefinition bodyfront_r16 = bodyfront.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(127, 120).addBox(-0.7974F, 1.6391F, 0.9873F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.7F, 2.54F, -4.1804F, 1.9416F, -0.0346F, -0.2619F));

		PartDefinition bodyfront_r17 = bodyfront.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(128, 6).addBox(-0.7974F, -0.8479F, 1.1966F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7F, 2.54F, -4.1804F, 1.4529F, -0.0346F, -0.2619F));

		PartDefinition bodyfront_r18 = bodyfront.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(116, 124).addBox(-0.5F, -2.3095F, -5.9762F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(113, 134).addBox(-0.5F, -1.3095F, -1.9762F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.4F, 2.54F, -4.1804F, 0.7965F, 0.052F, -0.1223F));

		PartDefinition bodyfront_r19 = bodyfront.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(33, 59).addBox(-0.9341F, -0.0189F, -3.8862F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1872F, 7.8377F, -13.8024F, 2.0325F, 0.8009F, 0.7694F));

		PartDefinition bodyfront_r20 = bodyfront.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(32, 125).addBox(-0.5F, -2.3F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0872F, 8.5377F, -11.4024F, 1.09F, 0.8009F, 0.7694F));

		PartDefinition bodyfront_r21 = bodyfront.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(92, 118).addBox(-0.5F, -2.7662F, -8.3342F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.4F, 2.54F, -4.1804F, 0.587F, 0.052F, -0.1223F));

		PartDefinition bodyfront_r22 = bodyfront.addOrReplaceChild("bodyfront_r22", CubeListBuilder.create().texOffs(143, 93).addBox(-0.5F, -0.5142F, -5.0855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.4F, 2.54F, -4.1804F, 0.1158F, 0.052F, -0.1223F));

		PartDefinition bodyfront_r23 = bodyfront.addOrReplaceChild("bodyfront_r23", CubeListBuilder.create().texOffs(126, 114).addBox(-1.5F, -0.9315F, -3.9972F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.5315F, -10.6199F, -0.672F, 0.0F, 0.0F));

		PartDefinition bodyfront_r24 = bodyfront.addOrReplaceChild("bodyfront_r24", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.0922F, 0.1011F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.5315F, -6.3199F, -0.3711F, -0.7715F, 0.1886F));

		PartDefinition bodyfront_r25 = bodyfront.addOrReplaceChild("bodyfront_r25", CubeListBuilder.create().texOffs(0, 44).addBox(-0.6F, -0.0922F, 0.1011F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.5315F, -6.3199F, -0.3777F, -0.6387F, 0.1939F));

		PartDefinition bodyfront_r26 = bodyfront.addOrReplaceChild("bodyfront_r26", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -0.0922F, 0.1011F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.5315F, -6.3199F, -0.3605F, -0.5185F, 0.1607F));

		PartDefinition bodyfront_r27 = bodyfront.addOrReplaceChild("bodyfront_r27", CubeListBuilder.create().texOffs(21, 46).addBox(-0.5F, -0.0922F, -0.3989F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.5315F, -6.3199F, -0.2951F, -0.4639F, 0.0354F));

		PartDefinition bodyfront_r28 = bodyfront.addOrReplaceChild("bodyfront_r28", CubeListBuilder.create().texOffs(120, 71).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.5315F, -8.5199F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bodyfront_r29 = bodyfront.addOrReplaceChild("bodyfront_r29", CubeListBuilder.create().texOffs(78, 11).addBox(-1.0F, -1.5749F, -0.0301F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7111F, -11.8942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(134, 129).addBox(-0.5F, -2.9257F, 8.5077F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 71).addBox(-0.5F, -2.3257F, 5.5077F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 142).addBox(-0.5F, -1.5257F, 3.5077F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 12).addBox(-0.5F, -0.7257F, 1.5077F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 145).addBox(-0.5F, -0.1257F, -0.7923F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1664F, -9.4252F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(27, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.0572F, -10.3258F, -0.1209F, 0.326F, -1.7984F));

		PartDefinition cube_r89 = bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(27, 145).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.0572F, -10.3258F, 0.3072F, 0.1518F, -0.5931F));

		PartDefinition cube_r90 = bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(17, 134).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.0572F, -10.3258F, 0.3384F, -0.0476F, -0.0139F));

		PartDefinition cube_r91 = bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(153, 17).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6572F, -8.1258F, -0.0979F, 0.2785F, -1.8788F));

		PartDefinition cube_r92 = bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(142, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6572F, -8.1258F, 0.2706F, 0.114F, -0.6852F));

		PartDefinition cube_r93 = bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(27, 130).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.6572F, -8.1258F, 0.2872F, -0.0591F, -0.0984F));

		PartDefinition cube_r94 = bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(153, 6).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2572F, -6.1258F, -0.0829F, 0.2467F, -1.9273F));

		PartDefinition cube_r95 = bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(107, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2572F, -6.1258F, 0.2463F, 0.0888F, -0.74F));

		PartDefinition cube_r96 = bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(17, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.2572F, -6.1258F, 0.2531F, -0.0667F, -0.1487F));

		PartDefinition cube_r97 = bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(3, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8572F, -3.7258F, -0.0681F, 0.2149F, -1.9414F));

		PartDefinition cube_r98 = bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(68, 143).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8572F, -3.7258F, 0.2222F, 0.0635F, -0.7593F));

		PartDefinition cube_r99 = bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 125).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.8572F, -3.7258F, 0.2189F, -0.0742F, -0.1637F));

		PartDefinition cube_r100 = bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2572F, -0.7258F, -0.032F, 0.1352F, -1.9351F));

		PartDefinition cube_r101 = bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2572F, -0.7258F, 0.1622F, 0.0001F, -0.7612F));

		PartDefinition cube_r102 = bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(14, 131).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2572F, -0.7258F, 0.1333F, -0.0927F, -0.1566F));

		PartDefinition neckbase = bodyfront.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2592F, -11.4602F, -0.0813F, 0.2134F, -0.0418F));

		PartDefinition neckbase_r1 = neckbase.addOrReplaceChild("neckbase_r1", CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2505F, -10.5942F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neckbase.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(139, 31).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2849F, -1.6162F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neckbase.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(37, 145).addBox(0.0F, -1.9F, -1.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3727F, -4.1496F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r105 = neckbase.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(125, 146).mirror().addBox(-0.9287F, -0.1927F, -0.6927F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.9689F, -1.5714F, 1.1582F, -0.1589F, -0.0722F));

		PartDefinition cube_r106 = neckbase.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(150, 23).mirror().addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.7154F, -5.0458F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r107 = neckbase.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(147, 121).mirror().addBox(-1.4F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, 0.3474F, -5.499F, 1.6593F, -0.0667F, -1.3132F));

		PartDefinition cube_r108 = neckbase.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(143, 103).mirror().addBox(-0.2525F, -0.3192F, -0.5173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.4689F, -6.0714F, 1.42F, -0.1589F, -0.0722F));

		PartDefinition cube_r109 = neckbase.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(20, 141).mirror().addBox(-0.1885F, -1.7085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.7924F, -4.4887F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r110 = neckbase.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(125, 140).mirror().addBox(-0.1885F, -1.7085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.6924F, -7.9887F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r111 = neckbase.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(147, 118).mirror().addBox(-1.4F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, 0.4474F, -8.999F, 1.6593F, -0.0667F, -1.3132F));

		PartDefinition cube_r112 = neckbase.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 142).mirror().addBox(-0.2525F, -0.3192F, -0.5173F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.5689F, -9.5714F, 1.4898F, -0.1589F, -0.0722F));

		PartDefinition cube_r113 = neckbase.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(150, 3).mirror().addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.8154F, -8.5458F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r114 = neckbase.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(20, 141).addBox(-0.8115F, -1.7085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.7924F, -4.4887F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r115 = neckbase.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(125, 146).addBox(-0.0713F, -0.1927F, -0.6927F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.9689F, -1.5714F, 1.1582F, 0.1589F, 0.0722F));

		PartDefinition cube_r116 = neckbase.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(143, 103).addBox(-0.7475F, -0.3192F, -0.5173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.4689F, -6.0714F, 1.42F, 0.1589F, 0.0722F));

		PartDefinition cube_r117 = neckbase.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(147, 121).addBox(-0.6F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, 0.3474F, -5.499F, 1.6593F, 0.0667F, 1.3132F));

		PartDefinition cube_r118 = neckbase.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(150, 23).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.7154F, -5.0458F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r119 = neckbase.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(150, 3).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.8154F, -8.5458F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r120 = neckbase.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(5, 142).addBox(-0.7475F, -0.3192F, -0.5173F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.5689F, -9.5714F, 1.4898F, 0.1589F, 0.0722F));

		PartDefinition cube_r121 = neckbase.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.098F, -1.4656F, 0.0822F, 0.7896F, -1.4553F));

		PartDefinition cube_r122 = neckbase.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(67, 109).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.098F, -1.4656F, 0.8067F, 0.1624F, -0.2809F));

		PartDefinition cube_r123 = neckbase.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(67, 109).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.098F, -1.4656F, 0.8067F, -0.1624F, 0.2809F));

		PartDefinition cube_r124 = neckbase.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(40, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.098F, -1.4656F, 0.0822F, -0.7896F, 1.4553F));

		PartDefinition cube_r125 = neckbase.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(147, 118).addBox(-0.6F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, 0.4474F, -8.999F, 1.6593F, 0.0667F, 1.3132F));

		PartDefinition cube_r126 = neckbase.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(125, 140).addBox(-0.8115F, -1.7085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.6924F, -7.9887F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r127 = neckbase.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(42, 111).addBox(0.0F, -1.5F, -1.2F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2727F, -7.6496F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neckbase.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(87, 83).addBox(-1.0F, -1.1461F, -10.8082F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3505F, -10.6942F, 0.3113F, 0.2179F, 0.0107F));

		PartDefinition cube_r128 = neckmiddlebase.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(147, 84).addBox(0.0F, -1.1F, -0.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5379F, -1.3502F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r129 = neckmiddlebase.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 140).mirror().addBox(-0.2525F, -0.6192F, -0.5173F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.2185F, -2.5772F, 1.612F, -0.1589F, -0.0722F));

		PartDefinition cube_r130 = neckmiddlebase.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.4649F, -1.5516F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r131 = neckmiddlebase.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(147, 89).mirror().addBox(-1.4F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, 0.097F, -2.0048F, 1.6593F, -0.0667F, -1.3132F));

		PartDefinition cube_r132 = neckmiddlebase.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(140, 87).mirror().addBox(-0.1885F, -1.7085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.0429F, -0.9945F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r133 = neckmiddlebase.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(103, 118).mirror().addBox(-0.1885F, -1.7085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.0429F, -4.2945F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r134 = neckmiddlebase.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(147, 81).mirror().addBox(-1.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, 0.097F, -5.3048F, 1.6593F, -0.0667F, -1.3132F));

		PartDefinition cube_r135 = neckmiddlebase.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(110, 149).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.4649F, -4.8516F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r136 = neckmiddlebase.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(142, 47).mirror().addBox(-0.2239F, -1.1629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.6185F, -5.8772F, 1.4724F, -0.1589F, -0.0722F));

		PartDefinition cube_r137 = neckmiddlebase.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(147, 51).mirror().addBox(-1.17F, -0.2769F, -0.5543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, 0.3571F, -9.5945F, 1.661F, -0.2058F, -1.3258F));

		PartDefinition cube_r138 = neckmiddlebase.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-0.1885F, -2.2085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.0429F, -8.2945F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r139 = neckmiddlebase.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(47, 142).mirror().addBox(-0.2239F, -0.8629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.6185F, -9.8772F, 1.4724F, -0.1589F, -0.0722F));

		PartDefinition cube_r140 = neckmiddlebase.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(86, 149).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.4649F, -8.8516F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r141 = neckmiddlebase.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(140, 87).addBox(-0.8115F, -1.7085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.0429F, -0.9945F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r142 = neckmiddlebase.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(147, 89).addBox(-0.6F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, 0.097F, -2.0048F, 1.6593F, 0.0667F, 1.3132F));

		PartDefinition cube_r143 = neckmiddlebase.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 150).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.4649F, -1.5516F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r144 = neckmiddlebase.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(53, 140).addBox(-0.7475F, -0.6192F, -0.5173F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.2185F, -2.5772F, 1.612F, 0.1589F, 0.0722F));

		PartDefinition cube_r145 = neckmiddlebase.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(142, 47).addBox(-0.7761F, -1.1629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.6185F, -5.8772F, 1.4724F, 0.1589F, 0.0722F));

		PartDefinition cube_r146 = neckmiddlebase.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(110, 149).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.4649F, -4.8516F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r147 = neckmiddlebase.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(147, 81).addBox(-0.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, 0.097F, -5.3048F, 1.6593F, 0.0667F, 1.3132F));

		PartDefinition cube_r148 = neckmiddlebase.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(103, 118).addBox(-0.8115F, -1.7085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.0429F, -4.2945F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r149 = neckmiddlebase.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(95, 153).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2951F, -4.1695F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r150 = neckmiddlebase.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 149).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.4649F, -8.8516F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r151 = neckmiddlebase.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(47, 142).addBox(-0.7761F, -0.8629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.6185F, -9.8772F, 1.4724F, 0.1589F, 0.0722F));

		PartDefinition cube_r152 = neckmiddlebase.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(147, 76).addBox(0.0F, -1.1F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2951F, -8.1695F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r153 = neckmiddlebase.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(139, 12).addBox(-0.8115F, -2.2085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.0429F, -8.2945F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r154 = neckmiddlebase.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(147, 51).addBox(-0.83F, -0.2769F, -0.5543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3152F, 0.3571F, -9.5945F, 1.661F, 0.2058F, 1.3258F));

		PartDefinition neckmiddlefront = neckmiddlebase.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(21, 106).addBox(0.0F, -2.2944F, -5.7743F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(147, 71).addBox(0.0F, -2.1944F, -2.0743F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 32).addBox(-1.0F, -0.8454F, -7.013F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3461F, -10.7082F, 0.2412F, 0.4567F, -0.1684F));

		PartDefinition cube_r155 = neckmiddlefront.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(149, 37).mirror().addBox(-0.1885F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.7422F, -1.2992F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r156 = neckmiddlefront.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(111, 142).mirror().addBox(-1.17F, -0.4769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, 0.6578F, -2.5992F, 1.6592F, -0.058F, -1.3125F));

		PartDefinition cube_r157 = neckmiddlefront.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(142, 71).mirror().addBox(-0.2239F, -1.0629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.9191F, -2.8819F, 1.4375F, -0.1589F, -0.0722F));

		PartDefinition cube_r158 = neckmiddlefront.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(149, 42).mirror().addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.7656F, -1.8563F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r159 = neckmiddlefront.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(30, 149).mirror().addBox(-0.1885F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.7422F, -4.9992F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r160 = neckmiddlefront.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(143, 3).mirror().addBox(-0.3811F, -0.4229F, -0.3854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, 0.6578F, -6.2992F, 1.6539F, -0.0655F, -1.2253F));

		PartDefinition cube_r161 = neckmiddlefront.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(42, 142).mirror().addBox(-0.5F, -2.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7173F, 1.3824F, -4.977F, 1.324F, -0.1589F, -0.0722F));

		PartDefinition cube_r162 = neckmiddlefront.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 152).mirror().addBox(-0.8F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0228F, 0.7656F, -5.5563F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r163 = neckmiddlefront.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(149, 42).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.7656F, -1.8563F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r164 = neckmiddlefront.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(142, 71).addBox(-0.7761F, -1.0629F, -0.1208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.9191F, -2.8819F, 1.4375F, 0.1589F, 0.0722F));

		PartDefinition cube_r165 = neckmiddlefront.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(111, 142).addBox(-1.83F, -0.4769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3152F, 0.6578F, -2.5992F, 1.6592F, 0.058F, 1.3125F));

		PartDefinition cube_r166 = neckmiddlefront.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(149, 37).addBox(-0.8115F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.7422F, -1.2992F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r167 = neckmiddlefront.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(70, 152).addBox(-0.2F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0228F, 0.7656F, -5.5563F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r168 = neckmiddlefront.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(42, 142).addBox(-0.5F, -2.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7173F, 1.3824F, -4.977F, 1.324F, 0.1589F, 0.0722F));

		PartDefinition cube_r169 = neckmiddlefront.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(143, 3).addBox(-1.6189F, -0.4229F, -0.3854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3152F, 0.6578F, -6.2992F, 1.6539F, 0.0655F, 1.2253F));

		PartDefinition cube_r170 = neckmiddlefront.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(30, 149).addBox(-0.8115F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.7422F, -4.9992F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neckfront = neckmiddlefront.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(128, 24).addBox(-0.5F, -0.4212F, -4.6931F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3454F, -7.013F, 0.2218F, 0.0511F, -0.0646F));

		PartDefinition cube_r171 = neckfront.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(153, 67).addBox(-0.5152F, -2.2556F, -0.1056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.2714F, -1.6774F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neckfront.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(152, 71).mirror().addBox(-0.2826F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.3825F, -7.6962F, 1.7688F, 0.0329F, -0.1625F));

		PartDefinition cube_r173 = neckfront.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(152, 77).mirror().addBox(-0.7044F, -0.6885F, -1.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.0714F, -3.9774F, 1.5966F, 0.0043F, -0.1658F));

		PartDefinition cube_r174 = neckfront.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(152, 74).mirror().addBox(-0.6604F, -0.6992F, -0.9231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5501F, 0.1862F, -5.9622F, 1.6483F, 0.0129F, -0.1653F));

		PartDefinition cube_r175 = neckfront.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(152, 84).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5228F, 0.7363F, -2.2345F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r176 = neckfront.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(147, 48).mirror().addBox(-1.9843F, -0.9147F, -0.4755F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.3714F, -1.6774F, 1.6657F, -0.2792F, -1.386F));

		PartDefinition cube_r177 = neckfront.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(150, 134).mirror().addBox(-0.5514F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.3825F, -7.6962F, 1.678F, 0.1758F, -1.1852F));

		PartDefinition cube_r178 = neckfront.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(96, 149).mirror().addBox(-0.1344F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.2825F, -7.1962F, 1.704F, -0.0957F, 0.6056F));

		PartDefinition cube_r179 = neckfront.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(150, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2752F, -0.1068F, -5.7943F, 1.6036F, -0.0258F, 0.6117F));

		PartDefinition cube_r180 = neckfront.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(150, 96).mirror().addBox(-0.434F, -0.8078F, -0.1756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.0714F, -3.7774F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r181 = neckfront.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(150, 109).mirror().addBox(-0.434F, -0.8078F, -0.1756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.2714F, -1.6774F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r182 = neckfront.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(144, 38).mirror().addBox(-0.6F, -2.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9173F, 1.3532F, -1.6551F, 1.3157F, -0.2116F, -0.0613F));

		PartDefinition cube_r183 = neckfront.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(7, 151).mirror().addBox(-0.7843F, -0.7147F, -0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0286F, -3.9774F, 1.6127F, 0.0138F, -1.1914F));

		PartDefinition cube_r184 = neckfront.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 149).mirror().addBox(-0.9309F, -0.6399F, -0.5561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.5286F, -4.3774F, 1.2125F, -0.2392F, -0.0272F));

		PartDefinition cube_r185 = neckfront.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 149).mirror().addBox(-0.9784F, -0.9012F, -0.9999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5501F, 0.1862F, -5.9622F, 1.3253F, -0.1207F, -0.0768F));

		PartDefinition cube_r186 = neckfront.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(137, 150).mirror().addBox(-0.717F, -0.7264F, -0.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5501F, 0.1862F, -5.9622F, 1.6321F, 0.0624F, -1.1907F));

		PartDefinition cube_r187 = neckfront.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(150, 113).mirror().addBox(-0.5356F, -0.5847F, -0.4341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.9825F, -7.9962F, 1.4478F, -0.1105F, -0.0909F));

		PartDefinition cube_r188 = neckfront.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(150, 109).addBox(-0.566F, -0.8078F, -0.1756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.2714F, -1.6774F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r189 = neckfront.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(147, 48).addBox(-0.0157F, -0.9147F, -0.4755F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5152F, -0.3714F, -1.6774F, 1.6657F, 0.2792F, 1.386F));

		PartDefinition cube_r190 = neckfront.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(144, 38).addBox(-0.4F, -2.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9173F, 1.3532F, -1.6551F, 1.3157F, 0.2116F, 0.0613F));

		PartDefinition cube_r191 = neckfront.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(152, 84).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5228F, 0.7363F, -2.2345F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r192 = neckfront.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(152, 77).addBox(-0.2956F, -0.6885F, -1.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5152F, -0.0714F, -3.9774F, 1.5966F, -0.0043F, 0.1658F));

		PartDefinition cube_r193 = neckfront.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 149).addBox(-0.0691F, -0.6399F, -0.5561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5152F, 0.5286F, -4.3774F, 1.2125F, 0.2392F, 0.0272F));

		PartDefinition cube_r194 = neckfront.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(7, 151).addBox(-0.2157F, -0.7147F, -0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5152F, 0.0286F, -3.9774F, 1.6127F, -0.0138F, 1.1914F));

		PartDefinition cube_r195 = neckfront.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(150, 96).addBox(-0.566F, -0.8078F, -0.1756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.0714F, -3.7774F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r196 = neckfront.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 153).addBox(-0.5152F, -2.1556F, -0.7056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.0714F, -3.7774F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r197 = neckfront.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(152, 74).addBox(-0.3396F, -0.6992F, -0.9231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5501F, 0.1862F, -5.9622F, 1.6483F, -0.0129F, 0.1653F));

		PartDefinition cube_r198 = neckfront.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(150, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2752F, -0.1068F, -5.7943F, 1.6036F, 0.0258F, -0.6117F));

		PartDefinition cube_r199 = neckfront.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(57, 153).addBox(-0.5501F, -1.9063F, -0.8371F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5501F, 0.1862F, -5.9622F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r200 = neckfront.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(137, 150).addBox(-0.283F, -0.7264F, -0.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5501F, 0.1862F, -5.9622F, 1.6321F, -0.0624F, 1.1907F));

		PartDefinition cube_r201 = neckfront.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(52, 149).addBox(-0.0216F, -0.9012F, -0.9999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5501F, 0.1862F, -5.9622F, 1.3253F, 0.1207F, 0.0768F));

		PartDefinition cube_r202 = neckfront.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 153).addBox(-0.9282F, -1.4885F, -1.2749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2825F, -7.1962F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r203 = neckfront.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(96, 149).addBox(-0.8656F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2825F, -7.1962F, 1.704F, 0.0957F, -0.6056F));

		PartDefinition cube_r204 = neckfront.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(150, 134).addBox(-0.4486F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, 0.3825F, -7.6962F, 1.678F, -0.1758F, 1.1852F));

		PartDefinition cube_r205 = neckfront.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(150, 113).addBox(-0.4644F, -0.5847F, -0.4341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.9825F, -7.9962F, 1.4478F, 0.1105F, 0.0909F));

		PartDefinition cube_r206 = neckfront.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(152, 71).addBox(-0.7174F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.3825F, -7.6962F, 1.7688F, -0.0329F, 0.1625F));

		PartDefinition neckfront_r1 = neckfront.addOrReplaceChild("neckfront_r1", CubeListBuilder.create().texOffs(132, 108).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0788F, -4.6931F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neckfront.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4988F, -8.869F, -0.2859F, 0.1645F, -0.25F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(145, 148).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1062F, -0.0158F, -0.4712F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(130, 148).addBox(-2.5F, -0.0229F, -0.9557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -1.5751F, 0.4656F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(-1.7F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6354F, -0.3301F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(143, 0).mirror().addBox(-1.5F, -0.3512F, -0.6953F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(143, 0).addBox(-0.9F, -0.3512F, -0.6953F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, -0.2188F, 0.3671F, -0.6632F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(142, 141).mirror().addBox(-1.5F, 0.0547F, -0.6834F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(142, 138).mirror().addBox(-1.5F, -0.3416F, -0.6834F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false)
				.texOffs(142, 141).addBox(-0.9F, 0.0547F, -0.6834F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F))
				.texOffs(142, 138).addBox(-0.9F, -0.3416F, -0.6834F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.3F, -2.0188F, -0.2329F, 1.0647F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(141, 114).mirror().addBox(-1.5F, -0.3478F, -0.6729F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false)
				.texOffs(141, 114).addBox(-0.9F, -0.3478F, -0.6729F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.3F, -1.6188F, 0.4671F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(141, 28).mirror().addBox(-1.5F, -0.2095F, -0.7658F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(141, 28).addBox(-0.9F, -0.2095F, -0.7658F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.3F, -2.2188F, -0.7329F, 1.3439F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(147, 45).mirror().addBox(-0.3F, -0.6896F, -0.7491F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.1751F, -0.6344F, 1.5272F, -0.243F, 0.0359F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(35, 151).mirror().addBox(-0.2967F, -0.6781F, -0.7343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -2.1751F, -1.0344F, 1.4988F, -0.3489F, 0.0109F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(151, 32).mirror().addBox(-0.2967F, -1.0541F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -2.1751F, -1.0344F, 1.9002F, -0.3489F, 0.0109F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(151, 54).mirror().addBox(-0.515F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(151, 11).mirror().addBox(-0.685F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.885F, -1.1434F, -0.8442F, 1.1981F, -0.1819F, 0.0178F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(151, 32).addBox(-0.7033F, -1.0541F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -2.1751F, -1.0344F, 1.9002F, 0.3489F, -0.0109F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(87, 141).addBox(-2.0F, -0.9919F, -2.0212F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1751F, -1.4344F, 1.9373F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(147, 45).addBox(-1.7F, -0.6896F, -0.7491F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, -2.1751F, -0.6344F, 1.5272F, 0.243F, -0.0359F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(35, 151).addBox(-0.7033F, -0.6781F, -0.7343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -2.1751F, -1.0344F, 1.4988F, 0.3489F, -0.0109F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(151, 11).addBox(-0.315F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(151, 54).addBox(-0.485F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.885F, -1.1434F, -0.8442F, 1.1981F, 0.1819F, -0.0178F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(141, 24).addBox(-2.0F, -0.9935F, -1.9387F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -2.0751F, -0.4344F, 1.5533F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(148, 106).addBox(-2.5F, -1.2461F, -0.9691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -1.4751F, 0.6656F, 1.0472F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(36, 42).addBox(0.7F, -0.2F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.6354F, -0.3301F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(120, 78).addBox(-2.5F, -0.4F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0F, 0.5322F, -0.7348F, -0.096F, 0.0F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(117, 105).addBox(-2.5F, 0.15F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3725F, -0.2019F, -0.5323F, 0.0F, 0.0F));

		PartDefinition lowerjawbase = head.addOrReplaceChild("lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.1827F, 0.0487F, 0.6196F, 0.0F, 0.0F));

		PartDefinition lowerjawbase_r1 = lowerjawbase.addOrReplaceChild("lowerjawbase_r1", CubeListBuilder.create().texOffs(143, 110).mirror().addBox(-0.11F, -0.6814F, -0.0353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(143, 110).addBox(2.11F, -0.6814F, -0.0353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.51F, 0.4819F, -1.4242F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlebase = lowerjawbase.addOrReplaceChild("lowerjawmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.2F, -1.4F, 0.7217F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront = lowerjawmiddlebase.addOrReplaceChild("lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.3609F, 0.0F, 0.0F));

		PartDefinition lowerjawfront = lowerjawmiddlefront.addOrReplaceChild("lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.0F, -1.0F, -0.2972F, 0.0F, 0.0F));

		PartDefinition lowerjawfront_r1 = lowerjawfront.addOrReplaceChild("lowerjawfront_r1", CubeListBuilder.create().texOffs(152, 0).mirror().addBox(-0.5F, -0.4973F, -0.2491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.435F, 0.0577F, 0.7081F, 0.5061F, 0.0048F));

		PartDefinition lowerjawfront_r2 = lowerjawfront.addOrReplaceChild("lowerjawfront_r2", CubeListBuilder.create().texOffs(145, 151).mirror().addBox(-0.5F, -0.4899F, -0.3516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.435F, 0.0577F, -0.182F, 0.5061F, 0.0048F));

		PartDefinition lowerjawfront_r3 = lowerjawfront.addOrReplaceChild("lowerjawfront_r3", CubeListBuilder.create().texOffs(106, 152).mirror().addBox(-0.5F, -0.4482F, -0.7763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.435F, 0.0577F, 0.1496F, 0.5061F, 0.0048F));

		PartDefinition lowerjawfront_r4 = lowerjawfront.addOrReplaceChild("lowerjawfront_r4", CubeListBuilder.create().texOffs(152, 0).addBox(-0.5F, -0.4973F, -0.2491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.5F, -1.435F, 0.0577F, 0.7081F, -0.5061F, -0.0048F));

		PartDefinition lowerjawfront_r5 = lowerjawfront.addOrReplaceChild("lowerjawfront_r5", CubeListBuilder.create().texOffs(145, 151).addBox(-0.5F, -0.4899F, -0.3516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -1.435F, 0.0577F, -0.182F, -0.5061F, -0.0048F));

		PartDefinition lowerjawfront_r6 = lowerjawfront.addOrReplaceChild("lowerjawfront_r6", CubeListBuilder.create().texOffs(106, 152).addBox(-0.5F, -0.4482F, -0.7763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.5F, -1.435F, 0.0577F, 0.1496F, -0.5061F, -0.0048F));

		PartDefinition lowerjawteeth = lowerjawfront.addOrReplaceChild("lowerjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -1.0F, -0.8491F, 0.0F, 0.0F));

		PartDefinition lowerlip = lowerjawfront.addOrReplaceChild("lowerlip", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.02F, -0.58F, -0.0494F, 0.0F, 0.0F));

		PartDefinition lowerlip_r1 = lowerlip.addOrReplaceChild("lowerlip_r1", CubeListBuilder.create().texOffs(42, 150).mirror().addBox(1.1101F, -0.9694F, -0.4161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-3.06F, -1.2536F, 0.1596F, 0.4156F, 0.1307F, -0.0232F));

		PartDefinition lowerlip_r2 = lowerlip.addOrReplaceChild("lowerlip_r2", CubeListBuilder.create().texOffs(126, 105).mirror().addBox(-0.1616F, -0.6244F, -0.0721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.26F, -1.2536F, 0.3596F, 0.0304F, 1.2564F, -0.1086F));

		PartDefinition lowerlip_r3 = lowerlip.addOrReplaceChild("lowerlip_r3", CubeListBuilder.create().texOffs(90, 152).mirror().addBox(-0.1894F, -0.6258F, -0.5741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.26F, -1.2536F, 0.1596F, -0.0077F, 0.314F, -0.0542F));

		PartDefinition lowerlip_r4 = lowerlip.addOrReplaceChild("lowerlip_r4", CubeListBuilder.create().texOffs(150, 26).mirror().addBox(1.1106F, -0.6258F, -0.5741F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.06F, -1.2536F, 0.1596F, -0.0074F, 0.1394F, -0.0529F));

		PartDefinition lowerlip_r5 = lowerlip.addOrReplaceChild("lowerlip_r5", CubeListBuilder.create().texOffs(42, 150).addBox(-3.1101F, -0.9694F, -0.4161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(3.1F, -1.2536F, 0.1596F, 0.4156F, -0.1307F, 0.0232F));

		PartDefinition lowerlip_r6 = lowerlip.addOrReplaceChild("lowerlip_r6", CubeListBuilder.create().texOffs(150, 100).addBox(-0.5F, -0.6067F, -0.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.0F, -1.6426F, -0.3274F, 0.3665F, 0.0F, 0.0F));

		PartDefinition lowerlip_r7 = lowerlip.addOrReplaceChild("lowerlip_r7", CubeListBuilder.create().texOffs(126, 105).addBox(-0.8384F, -0.6244F, -0.0721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.3F, -1.2536F, 0.3596F, 0.0304F, -1.2564F, 0.1086F));

		PartDefinition lowerlip_r8 = lowerlip.addOrReplaceChild("lowerlip_r8", CubeListBuilder.create().texOffs(90, 152).addBox(-0.8106F, -0.6258F, -0.5741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, -1.2536F, 0.1596F, -0.0077F, -0.314F, 0.0542F));

		PartDefinition lowerlip_r9 = lowerlip.addOrReplaceChild("lowerlip_r9", CubeListBuilder.create().texOffs(150, 26).addBox(-3.1106F, -0.6258F, -0.5741F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1F, -1.2536F, 0.1596F, -0.0074F, -0.1394F, 0.0529F));

		PartDefinition lowerlip_r10 = lowerlip.addOrReplaceChild("lowerlip_r10", CubeListBuilder.create().texOffs(129, 78).addBox(-0.5F, -0.389F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.6426F, -0.3274F, 0.2094F, 0.0F, 0.0F));

		PartDefinition mouthslope = lowerjawmiddlebase.addOrReplaceChild("mouthslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.09F, 0.0F, -2.0F, 0.8491F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r1 = mouthslope.addOrReplaceChild("lowerjawmiddlefront_r1", CubeListBuilder.create().texOffs(85, 152).mirror().addBox(-0.3F, -0.3943F, -2.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2231F, 1.4523F, 0.8544F, -0.7202F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlebase_r1 = mouthslope.addOrReplaceChild("lowerjawmiddlebase_r1", CubeListBuilder.create().texOffs(151, 14).mirror().addBox(-0.2869F, -0.5732F, -0.6604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2231F, 1.4523F, 0.8544F, 0.9599F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r2 = mouthslope.addOrReplaceChild("lowerjawmiddlefront_r2", CubeListBuilder.create().texOffs(146, 67).mirror().addBox(-0.3269F, 0.183F, -1.0347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2231F, 1.4523F, 0.8544F, -1.1694F, 0.0F, 0.0F));

		PartDefinition mouthslope_r1 = mouthslope.addOrReplaceChild("mouthslope_r1", CubeListBuilder.create().texOffs(12, 151).mirror().addBox(-0.2969F, -0.0261F, -0.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(12, 151).mirror().addBox(-0.2969F, -0.0261F, -1.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2231F, 1.4523F, 0.8544F, -1.0647F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r3 = mouthslope.addOrReplaceChild("lowerjawmiddlefront_r3", CubeListBuilder.create().texOffs(85, 152).addBox(-0.7F, -0.3943F, -2.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4031F, 1.4523F, 0.8544F, -0.7202F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlebase_r2 = mouthslope.addOrReplaceChild("lowerjawmiddlebase_r2", CubeListBuilder.create().texOffs(151, 14).addBox(-0.7131F, -0.5732F, -0.6604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4031F, 1.4523F, 0.8544F, 0.9599F, 0.0F, 0.0F));

		PartDefinition lowerjawmiddlefront_r4 = mouthslope.addOrReplaceChild("lowerjawmiddlefront_r4", CubeListBuilder.create().texOffs(146, 67).addBox(-0.6731F, 0.183F, -1.0347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4031F, 1.4523F, 0.8544F, -1.1694F, 0.0F, 0.0F));

		PartDefinition mouthslope_r2 = mouthslope.addOrReplaceChild("mouthslope_r2", CubeListBuilder.create().texOffs(12, 151).addBox(-0.7031F, -0.0261F, -0.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(12, 151).addBox(-0.7031F, -0.0261F, -1.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4031F, 1.4523F, 0.8544F, -1.0647F, 0.0F, 0.0F));

		PartDefinition upperjawbase = head.addOrReplaceChild("upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2897F, -2.5512F, 0.743F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle = upperjawbase.addOrReplaceChild("upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition upperjawmiddle_r1 = upperjawmiddle.addOrReplaceChild("upperjawmiddle_r1", CubeListBuilder.create().texOffs(86, 145).mirror().addBox(-0.1F, -0.4F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3765F, 0.9802F, 1.6685F, -0.0599F, 0.0495F, -0.2881F));

		PartDefinition upperjawmiddle_r2 = upperjawmiddle.addOrReplaceChild("upperjawmiddle_r2", CubeListBuilder.create().texOffs(86, 145).addBox(-0.9F, -0.4F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3765F, 0.9802F, 1.6685F, -0.0599F, -0.0495F, 0.2881F));

		PartDefinition upperjawmiddle_r3 = upperjawmiddle.addOrReplaceChild("upperjawmiddle_r3", CubeListBuilder.create().texOffs(111, 6).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9117F, 1.6761F, -0.1571F, 0.0F, 0.0F));

		PartDefinition upperjawfront = upperjawmiddle.addOrReplaceChild("upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition upperjawfront_r1 = upperjawfront.addOrReplaceChild("upperjawfront_r1", CubeListBuilder.create().texOffs(141, 134).addBox(-0.0649F, -0.0304F, -0.0675F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.45F, 1.6134F, -0.2768F, -0.0315F, 0.1091F));

		PartDefinition leftupperjawside = upperjawfront.addOrReplaceChild("leftupperjawside", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition rightupperjawside_r1 = leftupperjawside.addOrReplaceChild("rightupperjawside_r1", CubeListBuilder.create().texOffs(110, 145).addBox(-0.793F, -0.5986F, -1.998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9092F, -0.8593F, 4.5549F, 0.136F, -0.0689F, 0.1466F));

		PartDefinition leftupperjawside2 = upperjawfront.addOrReplaceChild("leftupperjawside2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition rightupperjawside_r2 = leftupperjawside2.addOrReplaceChild("rightupperjawside_r2", CubeListBuilder.create().texOffs(117, 151).addBox(-0.9608F, -0.7945F, 0.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(145, 144).addBox(-0.4608F, -0.7945F, -0.4925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(139, 19).addBox(-0.7673F, -0.4924F, -0.3925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9092F, -0.8593F, 4.5549F, -0.2816F, 0.1223F, 0.1757F));

		PartDefinition rightupperjawside_r3 = leftupperjawside2.addOrReplaceChild("rightupperjawside_r3", CubeListBuilder.create().texOffs(146, 145).addBox(0.1F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(146, 145).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9626F, -1.1452F, 3.7149F, 2.1588F, 1.3711F, 1.8722F));

		PartDefinition leftupperjawside6 = upperjawfront.addOrReplaceChild("leftupperjawside6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition leftupperjawside_r1 = leftupperjawside6.addOrReplaceChild("leftupperjawside_r1", CubeListBuilder.create().texOffs(117, 151).mirror().addBox(-0.0392F, -0.7945F, 0.7075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(145, 144).mirror().addBox(-0.5392F, -0.7945F, -0.4925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(139, 19).mirror().addBox(-0.2327F, -0.4924F, -0.3925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9092F, -0.8593F, 4.5549F, -0.2816F, -0.1223F, -0.1757F));

		PartDefinition leftupperjawside_r2 = leftupperjawside6.addOrReplaceChild("leftupperjawside_r2", CubeListBuilder.create().texOffs(146, 145).mirror().addBox(-1.1F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(146, 145).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9626F, -1.1452F, 3.7149F, 2.1588F, -1.3711F, -1.8722F));

		PartDefinition rightupperjawside = upperjawfront.addOrReplaceChild("rightupperjawside", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition upperjawteeth = upperjawfront.addOrReplaceChild("upperjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition upperjawteeth_r1 = upperjawteeth.addOrReplaceChild("upperjawteeth_r1", CubeListBuilder.create().texOffs(80, 65).addBox(-0.1834F, -1.4772F, -0.7454F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.15F, 2.5634F, -0.2627F, -0.0611F, 0.0021F));

		PartDefinition upperjawfront3 = upperjawmiddle.addOrReplaceChild("upperjawfront3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition upperjawfront_r2 = upperjawfront3.addOrReplaceChild("upperjawfront_r2", CubeListBuilder.create().texOffs(141, 134).mirror().addBox(-1.9351F, -0.0304F, -0.0675F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.45F, 1.6134F, -0.2768F, 0.0315F, -0.1091F));

		PartDefinition leftupperjawside5 = upperjawfront3.addOrReplaceChild("leftupperjawside5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition leftupperjawside_r3 = leftupperjawside5.addOrReplaceChild("leftupperjawside_r3", CubeListBuilder.create().texOffs(110, 145).mirror().addBox(-0.207F, -0.5986F, -1.998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9092F, -0.8593F, 4.5549F, 0.136F, 0.0689F, -0.1466F));

		PartDefinition rightupperjawside3 = upperjawfront3.addOrReplaceChild("rightupperjawside3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition upperjawteeth3 = upperjawfront3.addOrReplaceChild("upperjawteeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition upperjawteeth_r2 = upperjawteeth3.addOrReplaceChild("upperjawteeth_r2", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-1.8166F, -1.4772F, -0.7454F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.15F, 2.5634F, -0.2627F, 0.0611F, -0.0021F));

		PartDefinition upperjawteeth_r3 = upperjawteeth3.addOrReplaceChild("upperjawteeth_r3", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-0.45F, -0.4836F, -0.4845F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -1.1701F, 2.5795F, -0.2618F, 0.0F, 0.0F));

		PartDefinition upperjawfront2 = upperjawmiddle.addOrReplaceChild("upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition upperjawfront_r3 = upperjawfront2.addOrReplaceChild("upperjawfront_r3", CubeListBuilder.create().texOffs(13, 147).addBox(-0.45F, -1.1677F, -0.453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.05F, 0.7528F, 1.6795F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftupperjawside3 = upperjawfront2.addOrReplaceChild("leftupperjawside3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition leftupperjawside4 = upperjawfront2.addOrReplaceChild("leftupperjawside4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -0.5F, 0.6F, -0.8067F, -0.0424F, -0.3396F));

		PartDefinition rightupperjawside2 = upperjawfront2.addOrReplaceChild("rightupperjawside2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, -0.5F, 0.6F, -0.8067F, 0.0424F, 0.3396F));

		PartDefinition upperjawteeth2 = upperjawfront2.addOrReplaceChild("upperjawteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -0.95F, -0.8067F, 0.0F, 0.0F));

		PartDefinition snoutslope = upperjawmiddle.addOrReplaceChild("snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.0F, -2.0F, 0.7217F, 0.0F, 0.0F));

		PartDefinition snoutslope_r1 = snoutslope.addOrReplaceChild("snoutslope_r1", CubeListBuilder.create().texOffs(57, 150).addBox(-0.0888F, 0.0406F, -0.976F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.9571F, 2.007F, -0.305F, 0.003F, 0.3284F));

		PartDefinition snoutslope_r2 = snoutslope.addOrReplaceChild("snoutslope_r2", CubeListBuilder.create().texOffs(17, 151).addBox(-0.55F, -1.156F, 0.6881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 2.6833F, 0.0895F, -0.2618F, 0.0F, 0.0F));

		PartDefinition headslopebase = head.addOrReplaceChild("headslopebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7103F, -2.5512F, 0.743F, 0.0F, 0.0F));

		PartDefinition headslopebase_r1 = headslopebase.addOrReplaceChild("headslopebase_r1", CubeListBuilder.create().texOffs(20, 147).mirror().addBox(-0.6F, -0.3142F, -1.7626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, -0.8F, 1.6216F, 0.1136F, 0.2929F));

		PartDefinition headslopebase_r2 = headslopebase.addOrReplaceChild("headslopebase_r2", CubeListBuilder.create().texOffs(146, 130).mirror().addBox(-0.5F, -0.4142F, -1.5626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, -0.8F, 0.2967F, 0.1243F, -0.1288F));

		PartDefinition headslopebase_r3 = headslopebase.addOrReplaceChild("headslopebase_r3", CubeListBuilder.create().texOffs(146, 126).mirror().addBox(-0.5F, -0.5632F, -2.9377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, -0.8F, 0.4189F, 0.1243F, -0.1288F));

		PartDefinition headslopebase_r4 = headslopebase.addOrReplaceChild("headslopebase_r4", CubeListBuilder.create().texOffs(146, 126).addBox(-0.5F, -0.5632F, -2.9377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.7F, 0.5F, -0.8F, 0.4189F, -0.1243F, 0.1288F));

		PartDefinition headslopebase_r5 = headslopebase.addOrReplaceChild("headslopebase_r5", CubeListBuilder.create().texOffs(20, 147).addBox(-0.4F, -0.3142F, -1.7626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 0.5F, -0.8F, 1.6216F, -0.1136F, -0.2929F));

		PartDefinition headslopebase_r6 = headslopebase.addOrReplaceChild("headslopebase_r6", CubeListBuilder.create().texOffs(146, 130).addBox(-0.5F, -0.4142F, -1.5626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 0.5F, -0.8F, 0.2967F, -0.1243F, 0.1288F));

		PartDefinition headslopebase_r7 = headslopebase.addOrReplaceChild("headslopebase_r7", CubeListBuilder.create().texOffs(148, 103).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition headslopemiddle = headslopebase.addOrReplaceChild("headslopemiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -3.0F, 0.2335F, 0.0F, 0.0F));

		PartDefinition headslopemiddle_r1 = headslopemiddle.addOrReplaceChild("headslopemiddle_r1", CubeListBuilder.create().texOffs(111, 152).addBox(-0.5F, -0.3F, -0.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.7009F, 0.9068F, 0.0698F, 0.0F, 0.0F));

		PartDefinition headslopemiddle_r2 = headslopemiddle.addOrReplaceChild("headslopemiddle_r2", CubeListBuilder.create().texOffs(101, 152).addBox(-0.5F, -0.3279F, -0.7005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.7009F, 1.3068F, 0.0698F, 0.0F, 0.0F));

		PartDefinition headslopemiddle_r3 = headslopemiddle.addOrReplaceChild("headslopemiddle_r3", CubeListBuilder.create().texOffs(150, 151).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(22, 151).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.7009F, 2.1068F, -0.0349F, 0.0F, 0.0F));

		PartDefinition headslopefront = headslopemiddle.addOrReplaceChild("headslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.522F, 0.0F, 0.0F));

		PartDefinition headslopefront_r1 = headslopefront.addOrReplaceChild("headslopefront_r1", CubeListBuilder.create().texOffs(151, 29).addBox(-0.5F, -0.5033F, 0.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 1.5581F, 0.2767F, -0.3316F, 0.0F, 0.0F));

		PartDefinition headslopefront_r2 = headslopefront.addOrReplaceChild("headslopefront_r2", CubeListBuilder.create().texOffs(30, 145).addBox(-0.5F, -0.4194F, -0.4788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5581F, 0.2767F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = headslopebase.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 0.0F));

		PartDefinition lefteye = head.addOrReplaceChild("lefteye", CubeListBuilder.create(), PartPose.offset(2.12F, -0.3103F, -0.9512F));

		PartDefinition righteye = head.addOrReplaceChild("righteye", CubeListBuilder.create(), PartPose.offset(-2.12F, -0.3103F, -0.9512F));

		PartDefinition neckflapfront = neckfront.addOrReplaceChild("neckflapfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1788F, -6.9931F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinfront = neckflapfront.addOrReplaceChild("neckskinfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.0848F, 0.0F, 0.0F));

		PartDefinition neckflapmidfront = neckmiddlefront.addOrReplaceChild("neckflapmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.2454F, -7.013F, -0.2335F, 0.0F, 0.0F));

		PartDefinition neckskinmidfront = neckflapmidfront.addOrReplaceChild("neckskinmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.5F, -0.0424F, 0.0F, 0.0F));

		PartDefinition neckflapmidbase = neckmiddlebase.addOrReplaceChild("neckflapmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0539F, -11.4082F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinmidbase = neckflapmidbase.addOrReplaceChild("neckskinmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 0.8F, -0.0637F, 0.0F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 10.6027F, -9.9017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftArm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(109, 42).addBox(-1.0F, -1.8785F, 0.0381F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 5.2696F, -1.2167F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftArm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 119).addBox(1.7579F, -1.5555F, -4.5105F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, -0.3304F, 1.0833F, 0.6411F, -0.0742F, 0.2985F));

		PartDefinition cube_r209 = leftArm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(138, 120).addBox(0.7142F, -0.8243F, 0.6712F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6412F, 5.2696F, -2.7167F, 1.5679F, -0.1291F, 0.2797F));

		PartDefinition cube_r210 = leftArm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(71, 97).addBox(-1.0F, -1.5524F, -11.5818F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, 0.9696F, -0.5167F, 1.3439F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 11.6833F, -4.077F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(27, 42).addBox(0.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(32, 117).addBox(0.8113F, -1.5823F, -12.766F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(107, 10).addBox(0.1113F, -0.0823F, -12.866F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 7.9632F, -1.8005F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(120, 6).addBox(-0.8952F, -0.5F, -1.0023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4505F, 3.7089F, 0.1084F, 1.495F, 0.1574F, 1.1198F));

		PartDefinition cube_r213 = leftArm3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(128, 40).addBox(1.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(-1.7F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(132, 0).addBox(-2.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 10.6027F, -9.9017F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightArm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(48, 109).addBox(-2.0F, -1.8785F, 0.0381F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 5.2696F, -1.2167F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(103, 124).addBox(-2.7579F, -1.5555F, -4.5105F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, -0.3304F, 1.0833F, 0.6411F, 0.0742F, -0.2985F));

		PartDefinition cube_r216 = rightArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(139, 6).addBox(-1.7142F, -0.8243F, 0.6712F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.6412F, 5.2696F, -2.7167F, 1.5679F, 0.1291F, -0.2797F));

		PartDefinition cube_r217 = rightArm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(94, 97).addBox(-2.0F, -1.5524F, -11.5818F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, 0.9696F, -0.5167F, 1.3439F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 11.6833F, -4.077F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightArm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(109, 51).addBox(-2.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(117, 97).addBox(-1.8113F, -1.5823F, -12.766F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(107, 21).addBox(-2.1113F, -0.0823F, -12.866F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 7.9632F, -1.8005F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(128, 47).addBox(-0.1048F, -0.5F, -1.0023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4505F, 3.7089F, 0.1084F, 1.495F, -0.1574F, -1.1198F));

		PartDefinition cube_r220 = rightArm3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(129, 87).addBox(-2.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 118).addBox(-2.3F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(102, 132).addBox(1.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(33, 67).addBox(-1.0F, -1.093F, -0.0489F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 6.2F, 0.0774F, -0.087F, -0.0067F));

		PartDefinition tail6_r1 = tail1.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(141, 126).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0941F, 12.4728F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail1.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(96, 141).addBox(-0.5F, -3.4F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2434F, 9.8465F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(134, 139).addBox(-0.5F, -4.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1719F, 7.1015F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(139, 38).addBox(-0.5F, -7.1F, 2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 135).addBox(-0.5F, -7.3F, -0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.093F, 1.0511F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail1.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(122, 147).addBox(0.0F, -2.3F, 4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 150).addBox(0.0F, -0.7F, 6.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 151).addBox(0.0F, -4.0F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6122F, 0.7485F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail6_r2 = tail1.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(130, 151).addBox(0.0F, 0.5F, 3.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 150).addBox(0.0F, -0.5F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 92).addBox(0.0F, -1.5F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0651F, 8.9423F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.8774F, 0.0231F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, 12.7171F, -0.1024F, -0.1736F, 0.0178F));

		PartDefinition tail14_r1 = tail2.addOrReplaceChild("tail14_r1", CubeListBuilder.create().texOffs(148, 18).addBox(-0.5F, -1.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3908F, 17.9753F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail13_r1 = tail2.addOrReplaceChild("tail13_r1", CubeListBuilder.create().texOffs(148, 6).addBox(-0.5F, -3.3F, 6.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 61).addBox(-0.5F, -2.9F, 3.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 55).addBox(-0.5F, -2.7F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 31).addBox(-0.5F, -2.4F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1368F, 8.7827F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail13_r2 = tail2.addOrReplaceChild("tail13_r2", CubeListBuilder.create().texOffs(30, 154).addBox(0.0F, 7.9F, 17.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 154).addBox(0.0F, 6.9F, 15.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 154).addBox(0.0F, 5.7F, 13.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 154).addBox(0.0F, 4.7F, 11.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 154).addBox(0.0F, 3.6F, 9.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 154).addBox(0.0F, 2.7F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 151).addBox(0.0F, 1.1F, 5.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail2.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(63, 143).addBox(-0.5F, -3.4F, 4.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 143).addBox(-0.5F, -3.1F, 1.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 142).addBox(-0.5F, -3.1F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(45, 49).addBox(-1.0F, -0.8812F, -0.1343F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0588F, 18.1182F, -0.0497F, -0.2179F, 0.0108F));

		PartDefinition tail21_r1 = tail3.addOrReplaceChild("tail21_r1", CubeListBuilder.create().texOffs(153, 128).addBox(0.0F, -5.3F, 12.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 128).addBox(0.0F, -4.9F, 10.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 124).addBox(0.0F, -4.3F, 8.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 153).addBox(0.0F, -3.7F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 62).addBox(0.0F, -3.3F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 57).addBox(0.0F, -2.8F, 3.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 150).addBox(0.0F, -2.4F, 1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4496F, -0.1429F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail19_r1 = tail3.addOrReplaceChild("tail19_r1", CubeListBuilder.create().texOffs(154, 60).addBox(0.0F, 15.2F, 29.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 57).addBox(0.0F, 14.1F, 27.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 154).addBox(0.0F, 13.1F, 25.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 51).addBox(0.0F, 12.0F, 23.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 35).addBox(0.0F, 10.1F, 21.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 154).addBox(0.0F, 9.0F, 19.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2716F, -21.8929F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.4589F, -0.052F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, 14.8564F, 0.0648F, -0.392F, -0.0248F));

		PartDefinition tail27_r1 = tail4.addOrReplaceChild("tail27_r1", CubeListBuilder.create().texOffs(138, 126).addBox(0.0F, -9.1F, 25.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 94).addBox(0.0F, -8.5F, 23.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 127).addBox(0.0F, -7.9F, 22.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 154).addBox(0.0F, -7.5F, 20.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 154).addBox(0.0F, -6.9F, 18.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 153).addBox(0.0F, -6.4F, 16.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 153).addBox(0.0F, -5.7F, 14.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.127F, -15.0291F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(78, 26).addBox(-0.5F, -0.6164F, -0.029F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1571F, 13.9274F, 0.0375F, -0.5233F, -0.0187F));

		PartDefinition tail31_r1 = tail5.addOrReplaceChild("tail31_r1", CubeListBuilder.create().texOffs(154, 48).addBox(0.0F, -11.3F, 33.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 45).addBox(0.0F, -10.7F, 31.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 39).addBox(0.0F, -10.2F, 29.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 140).addBox(0.0F, -9.6F, 27.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2841F, -28.9566F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(64, 67).addBox(-0.5F, -0.4618F, 0.0988F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1796F, 12.8562F, 0.0121F, 0.349F, 0.0041F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(48, 97).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.049F, 13.9722F, -0.1293F, 0.2597F, -0.0334F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(71, 108).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.0679F, 9.657F, -0.3485F, 0.2881F, -0.1029F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(92, 108).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0128F, 8.9121F, -0.357F, 0.246F, -0.0906F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 0.625F, -1.6625F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftLeg.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(62, 127).addBox(-1.1F, -2.1399F, -9.866F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftLeg.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 124).addBox(-2.6F, -2.9616F, -0.2301F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.0149F, -0.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftLeg.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(41, 11).addBox(-2.1F, -0.4788F, -0.3396F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, -15.4105F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftLeg.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(64, 119).addBox(-2.5F, -6.6068F, -18.1983F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.8525F, -18.1897F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftLeg3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(132, 94).addBox(-2.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftLeg3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(95, 55).addBox(-2.5F, -4.6261F, -29.6329F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftLeg3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(80, 41).addBox(0.1F, -2.3052F, -29.345F, 2.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0183F, 2.6466F, -12.0539F, 0.0119F, -0.0163F, 0.0386F));

		PartDefinition cube_r228 = leftLeg4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(120, 59).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftLeg4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(111, 108).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftLeg8.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(111, 0).addBox(-4.1915F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4F, 0.625F, -1.6625F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightLeg.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(75, 127).addBox(0.1F, -2.1399F, -9.866F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightLeg.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 124).addBox(-1.4F, -2.9616F, -0.2301F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 2.0149F, -0.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightLeg.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(41, 30).addBox(-0.9F, -0.4788F, -0.3396F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, -15.4105F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightLeg.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(120, 51).addBox(-1.5F, -6.6068F, -18.1983F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.8525F, -18.1897F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightLeg3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(132, 101).addBox(0.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightLeg3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(95, 68).addBox(0.5F, -4.6261F, -29.6329F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightLeg3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(31, 83).addBox(-2.1F, -2.3052F, -29.345F, 2.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0183F, 2.6466F, -12.0539F, -0.2499F, 0.0163F, -0.0386F));

		PartDefinition cube_r238 = rightLeg4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(120, 65).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightLeg4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(114, 81).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightLeg8.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(21, 111).addBox(-3.8085F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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