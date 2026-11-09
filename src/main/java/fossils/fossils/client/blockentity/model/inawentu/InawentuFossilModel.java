package fossils.fossils.client.blockentity.model.inawentu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class InawentuFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart neckbase;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neckmiddlebase;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neckmiddlefront;
	private final ModelPart neck5;
	private final ModelPart neckfront;
	private final ModelPart neckflapfront;
	private final ModelPart neckskinfront;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public InawentuFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.body = this.bodymiddle.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.neckbase = this.chest.getChild("neckbase");
		this.neck = this.neckbase.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neckmiddlebase = this.neck2.getChild("neckmiddlebase");
		this.neck3 = this.neckmiddlebase.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neckmiddlefront = this.neck4.getChild("neckmiddlefront");
		this.neck5 = this.neckmiddlefront.getChild("neck5");
		this.neckfront = this.neck5.getChild("neckfront");
		this.neckflapfront = this.neckfront.getChild("neckflapfront");
		this.neckskinfront = this.neckflapfront.getChild("neckskinfront");
		this.neck6 = this.neckfront.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.lowerjawbase = this.head.getChild("lowerjawbase");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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
		this.bone = this.bodyfront.getChild("bone");
		this.bone3 = this.bodyfront.getChild("bone3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.7364F, 14.2869F, -0.4465F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-4.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 0).addBox(1.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(27, 10).addBox(-1.0F, -2.007F, 0.1001F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 75).addBox(-0.5F, -2.7043F, 0.0314F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(135, 147).addBox(-0.5F, -4.7043F, 0.0314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3072F, -4.765F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(98, 137).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.506F, 1.7945F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(140, 147).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7626F, -0.2197F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(147, 135).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9064F, -1.7128F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(147, 82).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9979F, -3.21F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 136).addBox(-0.5F, -4.8F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4426F, -6.7395F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.1274F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(153, 55).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -4.2299F, 0.0625F, -0.0304F, 1.8501F));

		PartDefinition cube_r9 = bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 139).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -4.2299F, 0.1022F, 0.1274F, 0.6802F));

		PartDefinition cube_r10 = bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 130).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -4.2299F, 0.0101F, 0.1629F, 0.0637F));

		PartDefinition cube_r11 = bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 143).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -2.2299F, -0.0429F, 0.166F, 0.055F));

		PartDefinition cube_r12 = bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -2.2299F, 0.061F, 0.1603F, 0.6743F));

		PartDefinition cube_r13 = bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(153, 59).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1937F, -2.2299F, 0.077F, 0.0199F, 1.85F));

		PartDefinition cube_r14 = bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(153, 51).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.7937F, -0.2299F, -0.1136F, 0.1694F, 0.0432F));

		PartDefinition cube_r15 = bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(115, 137).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.7937F, -0.2299F, 0.0053F, 0.2036F, 0.6642F));

		PartDefinition cube_r16 = bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(153, 63).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.7937F, -0.2299F, 0.0963F, 0.087F, 1.851F));

		PartDefinition cube_r17 = bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(153, 63).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.7937F, -0.2299F, 0.0963F, -0.087F, -1.851F));

		PartDefinition cube_r18 = bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(115, 137).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.7937F, -0.2299F, 0.0053F, -0.2036F, -0.6642F));

		PartDefinition cube_r19 = bodymiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(153, 51).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.7937F, -0.2299F, -0.1136F, -0.1694F, -0.0432F));

		PartDefinition cube_r20 = bodymiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(153, 59).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -2.2299F, 0.077F, -0.0199F, -1.85F));

		PartDefinition cube_r21 = bodymiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 64).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -2.2299F, 0.061F, -0.1603F, -0.6743F));

		PartDefinition cube_r22 = bodymiddle.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(104, 143).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -2.2299F, -0.0429F, -0.166F, -0.055F));

		PartDefinition cube_r23 = bodymiddle.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 130).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -4.2299F, 0.0101F, -0.1629F, -0.0637F));

		PartDefinition cube_r24 = bodymiddle.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 139).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -4.2299F, 0.1022F, -0.1274F, -0.6802F));

		PartDefinition cube_r25 = bodymiddle.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(153, 55).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1937F, -4.2299F, 0.0625F, 0.0304F, -1.8501F));

		PartDefinition cube_r26 = bodymiddle.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -2.0F, -0.1F, 12.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2715F, -2.9885F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bodymiddle.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 8).addBox(-1.0F, -0.0628F, 12.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7642F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bodymiddle.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 131).addBox(-0.5F, -5.1F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1822F, -2.8926F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bodymiddle.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(136, 27).addBox(-0.5F, -4.9F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.211F, -0.8532F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bodymiddle.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(130, 92).addBox(-0.5F, -4.6707F, -0.1173F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7028F, -4.7293F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body = bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6022F, -5.7966F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 73).addBox(-1.0F, -0.0628F, 4.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.205F, -10.9429F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.297F, -0.6085F, -0.2735F, 0.168F, 0.1553F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.297F, -0.6085F, -0.128F, 0.2939F, 0.7704F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(130, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.297F, -0.6085F, 0.1349F, 0.24F, 1.9963F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(97, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.103F, -3.4085F, 0.0842F, 0.1284F, 1.987F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(94, 139).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.103F, -3.4085F, -0.0385F, 0.2078F, 0.7926F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.103F, -3.4085F, -0.1514F, 0.1479F, 0.1745F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.303F, -5.4085F, 0.063F, 0.0805F, 1.9848F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 140).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.303F, -5.4085F, -0.0012F, 0.1704F, 0.7996F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(22, 113).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.303F, -5.4085F, -0.0994F, 0.1386F, 0.182F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(22, 113).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.303F, -5.4085F, -0.0994F, -0.1386F, -0.182F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 140).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.303F, -5.4085F, -0.0012F, -0.1704F, -0.7996F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(100, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.303F, -5.4085F, 0.063F, -0.0805F, -1.9848F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 108).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.103F, -3.4085F, -0.1514F, -0.1479F, -0.1745F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 139).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.103F, -3.4085F, -0.0385F, -0.2078F, -0.7926F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(97, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.103F, -3.4085F, 0.0842F, -0.1284F, -1.987F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 23).addBox(-4.0F, -2.0F, -6.1F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.6264F, -4.1421F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(130, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.297F, -0.6085F, 0.1349F, -0.24F, -1.9963F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(23, 34).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.297F, -0.6085F, -0.128F, -0.2939F, -0.7704F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.297F, -0.6085F, -0.2735F, -0.168F, -0.1553F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(98, 129).addBox(-0.5F, -5.191F, 0.0429F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5532F, -4.1194F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 130).addBox(-0.5F, -4.991F, 0.0179F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.234F, -1.0685F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(135, 89).addBox(-0.5F, -4.418F, 0.0199F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8545F, -6.0516F, -0.6807F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4624F, -6.1204F, 0.1012F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(30, 95).addBox(-3.7735F, 1.1202F, -6.964F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 13.0764F, -7.528F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(79, 116).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.3535F, -2.033F, -0.1107F, 0.1234F, 0.1309F));

		PartDefinition cube_r56 = bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(141, 25).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.3535F, -2.033F, -0.0195F, 0.1644F, 0.747F));

		PartDefinition cube_r57 = bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.3535F, -2.033F, 0.0506F, 0.095F, 1.9342F));

		PartDefinition cube_r58 = bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(38, 108).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.8535F, -4.033F, -0.0759F, 0.1187F, 0.1351F));

		PartDefinition cube_r59 = bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(140, 139).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.8535F, -4.033F, 0.0064F, 0.1407F, 0.7509F));

		PartDefinition cube_r60 = bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(87, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.8535F, -4.033F, 0.0382F, 0.0623F, 1.9332F));

		PartDefinition cube_r61 = bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-7.5F, 0.0F, -0.9F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.8296F, -7.0344F, -0.2585F, 0.1373F, 0.1866F));

		PartDefinition cube_r62 = bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-8.2F, 0.0F, -0.8F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6031F, 14.0438F, -6.4771F, -0.3142F, 0.2211F, 0.0508F));

		PartDefinition cube_r63 = bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-8.6F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5483F, 14.024F, -6.5259F, -0.4111F, 0.355F, 0.0024F));

		PartDefinition cube_r64 = bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-10.1F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 14.005F, -6.5844F, -0.3111F, 0.4902F, -0.0092F));

		PartDefinition cube_r65 = bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-10.7F, 0.0F, -0.6F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 14.005F, -6.5844F, -0.3285F, 0.6007F, -0.0417F));

		PartDefinition cube_r66 = bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 30).addBox(-1.3F, 0.0F, -0.6F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 14.005F, -6.5844F, -0.3285F, -0.6007F, 0.0417F));

		PartDefinition cube_r67 = bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 43).addBox(-0.9F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 14.005F, -6.5844F, -0.3111F, -0.4902F, 0.0092F));

		PartDefinition cube_r68 = bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(71, 40).addBox(-0.4F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5483F, 14.024F, -6.5259F, -0.4111F, -0.355F, -0.0024F));

		PartDefinition cube_r69 = bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 40).addBox(0.2F, 0.0F, -0.8F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6031F, 14.0438F, -6.4771F, -0.3142F, -0.2211F, -0.0508F));

		PartDefinition cube_r70 = bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(86, 59).addBox(-0.5F, 0.0F, -0.9F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.8296F, -7.0344F, -0.2585F, -0.1373F, -0.1866F));

		PartDefinition cube_r71 = bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 91).addBox(-3.2735F, -0.0793F, -3.5022F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 13.0764F, -7.528F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(57, 73).addBox(-1.0F, -1.5749F, 5.9699F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7074F, -11.8013F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 136).addBox(-0.5F, -4.4F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5607F, -2.1765F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(65, 138).addBox(-0.5F, -3.9F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0031F, -4.5375F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(87, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.8535F, -4.033F, 0.0382F, -0.0623F, -1.9332F));

		PartDefinition cube_r76 = bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(140, 139).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.8535F, -4.033F, 0.0064F, -0.1407F, -0.7509F));

		PartDefinition cube_r77 = bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 108).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.8535F, -4.033F, -0.0759F, -0.1187F, -0.1351F));

		PartDefinition cube_r78 = bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(103, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.3535F, -2.033F, 0.0506F, -0.095F, -1.9342F));

		PartDefinition cube_r79 = bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(141, 25).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.3535F, -2.033F, -0.0195F, -0.1644F, -0.747F));

		PartDefinition cube_r80 = bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 116).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.3535F, -2.033F, -0.1107F, -0.1234F, -0.1309F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9562F, -5.2632F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(17, 139).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2199F, -1.2124F, 0.318F, -0.1532F, 0.6965F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(153, 72).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2199F, -1.2124F, -0.1183F, -0.3365F, 1.9026F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(77, 140).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.3199F, -3.2124F, 0.3529F, -0.1799F, 0.6382F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(31, 118).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.3199F, -3.2124F, -0.132F, -0.3781F, 1.8549F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(28, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2199F, -1.2124F, 0.3481F, 0.0522F, 0.1194F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 129).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.3199F, -3.2124F, 0.3915F, 0.0485F, 0.0692F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(45, 129).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.3199F, -3.2124F, 0.3915F, -0.0485F, -0.0692F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(28, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2199F, -1.2124F, 0.3481F, -0.0522F, -0.1194F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(86, 45).addBox(-1.0F, -1.5749F, 0.9699F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4262F, -5.9807F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(136, 9).addBox(-0.5F, -4.2F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2796F, -1.7866F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(31, 118).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.3199F, -3.2124F, -0.132F, 0.3781F, -1.8549F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 140).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.3199F, -3.2124F, 0.3529F, 0.1799F, -0.6382F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(153, 72).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2199F, -1.2124F, -0.1183F, 0.3365F, -1.9026F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(17, 139).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2199F, -1.2124F, 0.318F, 0.1532F, -0.6965F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 138).addBox(-0.5F, -4.1F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6703F, -3.7551F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neckbase = chest.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0393F, -5.1723F, -0.1651F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-0.5075F, -4.7642F, 0.6824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, 1.6637F, -0.179F, 1.4142F, -0.2186F, 0.1571F));

		PartDefinition cube_r97 = neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(135, 96).mirror().addBox(0.0724F, -2.3335F, 0.7235F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3506F, 1.4436F, -0.381F, 1.7048F, -0.1577F, -0.5299F));

		PartDefinition cube_r98 = neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(121, 142).mirror().addBox(-0.675F, -0.3F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(128, 142).mirror().addBox(-0.675F, -0.7F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0502F, -1.7793F, -2.4746F, 1.6775F, -0.0475F, -1.206F));

		PartDefinition cube_r99 = neckbase.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-0.7921F, -1.7689F, 0.7779F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4881F, 1.6637F, -1.979F, 0.9633F, -0.3565F, 0.1637F));

		PartDefinition cube_r100 = neckbase.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(-0.7921F, 2.7444F, 0.9344F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4881F, 1.6637F, -1.979F, 0.911F, -0.3565F, 0.1637F));

		PartDefinition cube_r101 = neckbase.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(142, 0).mirror().addBox(-0.5075F, -4.3334F, -1.0156F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, 1.6637F, -0.179F, 0.4368F, -0.2186F, 0.1571F));

		PartDefinition cube_r102 = neckbase.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.5075F, -1.6871F, -4.3398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, 1.6637F, -0.179F, -0.5406F, -0.2186F, 0.1571F));

		PartDefinition cube_r103 = neckbase.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(145, 147).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0108F, -3.4378F, -4.2874F, 1.5584F, 0.3296F, 0.4879F));

		PartDefinition cube_r104 = neckbase.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(72, 130).mirror().addBox(0.0115F, -2.6085F, 0.9968F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0187F, -1.6578F, -1.6848F, 1.5591F, 0.0242F, 0.4916F));

		PartDefinition cube_r105 = neckbase.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(145, 147).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0108F, -3.4378F, -4.2874F, 1.5584F, -0.3296F, -0.4879F));

		PartDefinition cube_r106 = neckbase.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(72, 130).addBox(-1.0115F, -2.6085F, 0.9968F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0187F, -1.6578F, -1.6848F, 1.5591F, -0.0242F, -0.4916F));

		PartDefinition cube_r107 = neckbase.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(128, 142).addBox(-1.325F, -0.7F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 142).addBox(-1.325F, -0.3F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0502F, -1.7793F, -2.4746F, 1.6775F, 0.0475F, 1.206F));

		PartDefinition cube_r108 = neckbase.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(135, 96).addBox(-3.0724F, -2.3335F, 0.7235F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3506F, 1.4436F, -0.381F, 1.7048F, 0.1577F, 0.5299F));

		PartDefinition cube_r109 = neckbase.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(68, 82).addBox(-0.2079F, 2.7444F, 0.9344F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4881F, 1.6637F, -1.979F, 0.911F, 0.3565F, -0.1637F));

		PartDefinition cube_r110 = neckbase.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 134).addBox(-0.4925F, -1.6871F, -4.3398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.1881F, 1.6637F, -0.179F, -0.5406F, 0.2186F, -0.1571F));

		PartDefinition cube_r111 = neckbase.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(142, 0).addBox(-0.4925F, -4.3334F, -1.0156F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1881F, 1.6637F, -0.179F, 0.4368F, 0.2186F, -0.1571F));

		PartDefinition cube_r112 = neckbase.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(34, 75).addBox(-0.2079F, -1.7689F, 0.7779F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4881F, 1.6637F, -1.979F, 0.9633F, 0.3565F, -0.1637F));

		PartDefinition cube_r113 = neckbase.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 25).addBox(-0.4925F, -4.7642F, 0.6824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1881F, 1.6637F, -0.179F, 1.4142F, 0.2186F, -0.1571F));

		PartDefinition cube_r114 = neckbase.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(84, 62).addBox(-1.0F, -1.0F, 6.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8822F, -11.8196F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neckbase.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(67, 130).addBox(0.0F, -4.5F, -2.8F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0793F, -1.7933F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9335F, -4.912F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 63).addBox(-1.0F, -1.0F, 0.9F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.064F, -7.8066F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(26, 108).addBox(0.0F, -4.1F, -3.8F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5592F, -1.362F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(121, 145).mirror().addBox(-0.3F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, 1.962F, -5.6041F, 1.6221F, -0.2714F, -0.2637F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(132, 69).mirror().addBox(-2.5F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -0.039F, -5.6114F, 1.6672F, -0.0546F, -1.4438F));

		PartDefinition cube_r120 = neck.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 127).mirror().addBox(-0.2525F, -0.4192F, -0.2173F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.645F, 2.3282F, -6.5713F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r121 = neck.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(123, 36).mirror().addBox(-0.6885F, -4.6085F, -0.4032F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, 0.0212F, -1.7011F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r122 = neck.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(144, 25).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.4458F, 1.8735F, -0.2257F, 1.4724F, -0.1589F, -0.0722F));

		PartDefinition cube_r123 = neck.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 148).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8356F, 2.1578F, 2.3292F, 1.3327F, -0.1589F, -0.0722F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(123, 36).addBox(-0.3115F, -4.6085F, -0.4032F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, 0.0212F, -1.7011F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 148).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8356F, 2.1578F, 2.3292F, 1.3327F, 0.1589F, 0.0722F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(144, 25).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.4458F, 1.8735F, -0.2257F, 1.4724F, 0.1589F, 0.0722F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(104, 127).addBox(-0.7475F, -0.4192F, -0.2173F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.645F, 2.3282F, -6.5713F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(132, 69).addBox(-0.5F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -0.039F, -5.6114F, 1.6672F, 0.0546F, 1.4438F));

		PartDefinition cube_r129 = neck.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(121, 145).addBox(-1.7F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3754F, 1.962F, -5.6041F, 1.6221F, 0.2714F, 0.2637F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3849F, -6.6301F, 0.0585F, -0.1283F, -0.0508F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(90, 32).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0732F, -3.895F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(119, 128).mirror().addBox(-0.1885F, -4.3085F, -0.5032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.8696F, -1.2894F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 145).mirror().addBox(-0.2493F, -0.2999F, -0.7858F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(67, 152).mirror().addBox(1.0507F, -0.2999F, -0.8108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8633F, 1.0707F, -5.194F, 1.6244F, -0.1858F, -1.2915F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 103).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 1.5049F, -4.7736F, 1.4361F, -0.1665F, -0.0522F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(25, 146).mirror().addBox(-1.2F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4908F, 1.1777F, -4.7204F, 1.5648F, -0.3095F, -0.4482F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(25, 146).addBox(-0.8F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4908F, 1.1777F, -4.7204F, 1.5648F, 0.3095F, 0.4482F));

		PartDefinition cube_r136 = neck2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(41, 103).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5788F, 1.5049F, -4.7736F, 1.4361F, 0.1665F, 0.0522F));

		PartDefinition cube_r137 = neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(67, 152).addBox(-2.0507F, -0.2999F, -0.8108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 145).addBox(-1.7507F, -0.2999F, -0.7858F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8633F, 1.0707F, -5.194F, 1.6244F, 0.1858F, 1.2915F));

		PartDefinition cube_r138 = neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(119, 128).addBox(-0.8115F, -4.3085F, -0.5032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.8696F, -1.2894F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r139 = neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(118, 135).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.808F, -3.6728F, 0.0087F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neck2.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.03F, -4.9164F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1119F, -6.0185F, 0.096F, -0.0828F, -0.0516F));

		PartDefinition cube_r140 = neckmiddlebase.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 122).addBox(0.0F, -2.3F, -2.9F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1218F, -1.4584F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r141 = neckmiddlebase.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(128, 135).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1563F, 1.5268F, -5.1097F, 1.5422F, -0.1589F, -0.0722F));

		PartDefinition cube_r142 = neckmiddlebase.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(89, 136).mirror().addBox(-0.2F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1254F, 1.4978F, -3.9701F, 1.7336F, -0.224F, -0.7114F));

		PartDefinition cube_r143 = neckmiddlebase.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(87, 143).mirror().addBox(-2.1F, -1.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -0.4869F, -3.113F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r144 = neckmiddlebase.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(48, 129).mirror().addBox(-0.1885F, -3.7085F, -0.7032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.6267F, -1.1027F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r145 = neckmiddlebase.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(40, 128).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.8485F, 1.3996F, -0.8571F, 1.3502F, -0.1589F, -0.0722F));

		PartDefinition cube_r146 = neckmiddlebase.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(48, 129).addBox(-0.8115F, -3.7085F, -0.7032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.6267F, -1.1027F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r147 = neckmiddlebase.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(87, 143).addBox(0.1F, -1.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -0.4869F, -3.113F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r148 = neckmiddlebase.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(89, 136).addBox(-2.8F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1254F, 1.4978F, -3.9701F, 1.7336F, 0.224F, 0.7114F));

		PartDefinition cube_r149 = neckmiddlebase.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(40, 128).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.8485F, 1.3996F, -0.8571F, 1.3502F, 0.1589F, 0.0722F));

		PartDefinition cube_r150 = neckmiddlebase.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(128, 135).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1563F, 1.5268F, -5.1097F, 1.5422F, 0.1589F, 0.0722F));

		PartDefinition neck3 = neckmiddlebase.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(17, 85).addBox(-0.5152F, -0.9606F, -5.8708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, 0.9302F, -4.9997F, 0.0553F, -0.1264F, -0.0936F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(129, 100).mirror().addBox(-0.1885F, -2.9085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -2.0574F, -1.8571F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(58, 143).mirror().addBox(-2.425F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2304F, -1.9175F, -3.8674F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 143).mirror().addBox(-1.0F, -0.4F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 0.0121F, -3.8802F, 1.7433F, -0.2167F, -0.7555F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 115).mirror().addBox(-0.2239F, -0.9629F, -0.1208F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5427F, 0.8491F, -4.959F, 1.4985F, -0.1589F, -0.0722F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(105, 115).addBox(-0.7761F, -0.9629F, -0.1208F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5123F, 0.8491F, -4.959F, 1.4985F, 0.1589F, 0.0722F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(70, 143).addBox(-1.0F, -0.4F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.701F, 0.0121F, -3.8802F, 1.7433F, 0.2167F, 0.7555F));

		PartDefinition cube_r157 = neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(58, 143).addBox(0.425F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1999F, -1.9175F, -3.8674F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r158 = neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(129, 100).addBox(-0.8115F, -2.9085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0574F, -1.8571F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r159 = neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(126, 128).addBox(0.0F, -1.3F, -3.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -2.3096F, -1.7321F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(101, 42).addBox(-0.701F, -0.0347F, -4.8555F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1858F, -0.9048F, -5.9477F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(128, 121).addBox(0.0F, -0.6F, -1.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, -1.5685F, -2.1607F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(135, 121).mirror().addBox(-0.2239F, -0.7629F, -0.3208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6909F, 1.6645F, -4.975F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(141, 63).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9044F, 1.1597F, -4.0472F, 1.5186F, -0.1505F, 0.1926F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(141, 9).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 1.4961F, -3.9571F, 1.4458F, -0.0989F, 0.7621F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(21, 138).mirror().addBox(-0.1885F, -2.9085F, -0.4032F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2162F, -0.6315F, -1.3418F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(9, 131).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0881F, 1.258F, -0.9401F, 1.3851F, -0.1589F, -0.0722F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(21, 138).addBox(-0.8115F, -2.9085F, -0.4032F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8142F, -0.6315F, -1.3418F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(141, 9).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.887F, 1.4961F, -3.9571F, 1.4458F, 0.0989F, -0.7621F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(141, 63).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5024F, 1.1597F, -4.0472F, 1.5186F, 0.1505F, -0.1926F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(9, 131).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.6862F, 1.258F, -0.9401F, 1.3851F, 0.1589F, 0.0722F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(135, 121).addBox(-0.7761F, -0.7629F, -0.3208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2889F, 1.6645F, -4.975F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition neckmiddlefront = neck4.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(60, 130).addBox(0.0F, -1.9847F, -4.2405F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(103, 49).addBox(-0.5F, -0.0357F, -4.9792F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, 0.003F, -4.7985F, 0.0822F, -0.1271F, -0.0538F));

		PartDefinition cube_r171 = neckmiddlefront.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(143, 47).mirror().addBox(-1.1F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, 0.3463F, -4.054F, 1.6509F, -0.0691F, -1.1818F));

		PartDefinition cube_r172 = neckmiddlefront.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(136, 99).mirror().addBox(-0.2239F, -0.2629F, -0.7708F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2421F, 1.2308F, -1.0901F, 1.4724F, -0.1589F, -0.0722F));

		PartDefinition cube_r173 = neckmiddlefront.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(143, 50).mirror().addBox(-1.0F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0229F, 0.1753F, -3.4226F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r174 = neckmiddlefront.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 136).mirror().addBox(-0.2239F, -1.4629F, -0.6708F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 1.2539F, -4.4482F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r175 = neckmiddlefront.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(143, 50).addBox(-1.0F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0229F, 0.1753F, -3.4226F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r176 = neckmiddlefront.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 136).addBox(-0.7761F, -1.4629F, -0.6708F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 1.2539F, -4.4482F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition cube_r177 = neckmiddlefront.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(136, 99).addBox(-0.7761F, -0.2629F, -0.7708F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2421F, 1.2308F, -1.0901F, 1.4724F, 0.1589F, 0.0722F));

		PartDefinition cube_r178 = neckmiddlefront.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(143, 47).addBox(-0.9F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3442F, 0.3463F, -4.054F, 1.6509F, 0.0691F, 1.1818F));

		PartDefinition cube_r179 = neckmiddlefront.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(138, 49).mirror().addBox(0.2115F, -2.3085F, -0.4032F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -0.7325F, -2.2655F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r180 = neckmiddlefront.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(138, 49).addBox(-1.2115F, -2.3085F, -0.4032F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.7325F, -2.2655F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neck5 = neckmiddlefront.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(46, 103).addBox(-0.5152F, -0.0273F, -4.8625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0152F, 0.0063F, -5.0512F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition cube_r181 = neck5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(130, 38).addBox(0.0F, -0.275F, -2.6F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -1.5763F, -2.3238F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(135, 142).mirror().addBox(0.3115F, -1.8085F, -0.8032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -0.924F, -2.4488F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r183 = neck5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 143).mirror().addBox(-1.181F, -0.2229F, -0.5854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3304F, 0.576F, -4.1488F, 1.6444F, 0.1153F, -1.2984F));

		PartDefinition cube_r184 = neck5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(141, 76).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4074F, 1.6574F, -4.5997F, 1.6382F, -0.1589F, -0.0722F));

		PartDefinition cube_r185 = neck5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(144, 113).mirror().addBox(-1.15F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0381F, 0.6837F, -3.4059F, 1.7134F, -0.2373F, -0.6228F));

		PartDefinition cube_r186 = neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(141, 99).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8802F, 1.2025F, -1.8612F, 1.4811F, -0.1589F, -0.0722F));

		PartDefinition cube_r187 = neck5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(144, 113).addBox(-0.85F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0076F, 0.6837F, -3.4059F, 1.7134F, 0.2373F, 0.6228F));

		PartDefinition cube_r188 = neck5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(141, 99).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8498F, 1.2025F, -1.8612F, 1.4811F, 0.1589F, 0.0722F));

		PartDefinition cube_r189 = neck5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(141, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.377F, 1.6574F, -4.5997F, 1.6382F, 0.1589F, 0.0722F));

		PartDefinition cube_r190 = neck5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 143).addBox(-0.819F, -0.2229F, -0.5854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, 0.576F, -4.1488F, 1.6444F, -0.1153F, 1.2984F));

		PartDefinition cube_r191 = neck5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(135, 142).addBox(-1.3115F, -1.8085F, -0.8032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.924F, -2.4488F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neckfront = neck5.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(28, 101).addBox(0.0F, -0.0194F, -4.9096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(47, 143).addBox(0.5F, -1.5252F, -3.7996F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5152F, -0.0014F, -4.9505F, 0.0604F, -0.2178F, -0.0131F));

		PartDefinition cube_r192 = neckfront.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(118, 36).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0723F, 1.0555F, -4.0303F, 1.7433F, -0.2167F, -0.7555F));

		PartDefinition cube_r193 = neckfront.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(41, 118).mirror().addBox(-0.6F, -1.0F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2188F, 1.5475F, -4.7819F, 1.5425F, -0.2116F, -0.0613F));

		PartDefinition cube_r194 = neckfront.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.2395F, 0.4021F, -4.0901F, 1.662F, -0.0186F, -1.3615F));

		PartDefinition cube_r195 = neckfront.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-0.434F, -1.4078F, -0.1756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0152F, -0.2696F, -3.0939F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r196 = neckfront.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(100, 27).addBox(-0.566F, -1.4078F, -0.1756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -0.2696F, -3.0939F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r197 = neckfront.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(84, 70).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2395F, 0.4021F, -4.0901F, 1.662F, 0.0186F, 1.3615F));

		PartDefinition cube_r198 = neckfront.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(41, 118).addBox(-0.4F, -1.0F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2188F, 1.5475F, -4.7819F, 1.5425F, 0.2116F, 0.0613F));

		PartDefinition cube_r199 = neckfront.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(118, 36).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0723F, 1.0555F, -4.0303F, 1.7433F, 0.2167F, 0.7555F));

		PartDefinition neckflapfront = neckfront.addOrReplaceChild("neckflapfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2212F, -11.5931F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinfront = neckflapfront.addOrReplaceChild("neckskinfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.0848F, 0.0F, 0.0F));

		PartDefinition neck6 = neckfront.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9555F, -4.8983F, 0.1207F, -0.1737F, 0.0169F));

		PartDefinition cube_r200 = neck6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(146, 33).mirror().addBox(-1.342F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.0501F, -0.6837F, -3.4627F, 1.6321F, 0.0624F, -1.1907F));

		PartDefinition cube_r201 = neck6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(146, 77).mirror().addBox(-0.7F, -1.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7752F, -0.7768F, -2.6949F, 1.6909F, 0.0258F, -0.6117F));

		PartDefinition cube_r202 = neck6.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(152, 128).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0393F, 0.3642F, -3.5801F, 1.6315F, 0.0499F, -0.6879F));

		PartDefinition cube_r203 = neck6.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(103, 136).mirror().addBox(-0.9784F, -0.2262F, -0.2499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1749F, 0.831F, -4.3544F, 1.6133F, -0.1207F, -0.0768F));

		PartDefinition cube_r204 = neck6.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(146, 77).addBox(-0.3F, -1.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2248F, -0.7768F, -2.6949F, 1.6909F, -0.0258F, 0.6117F));

		PartDefinition cube_r205 = neck6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(152, 128).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0393F, 0.3642F, -3.5801F, 1.6315F, -0.0499F, 0.6879F));

		PartDefinition cube_r206 = neck6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(143, 42).addBox(-0.5501F, -1.6063F, -0.8371F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0501F, -0.4837F, -2.8627F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(146, 33).addBox(-0.658F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0501F, -0.6837F, -3.4627F, 1.6321F, -0.0624F, 1.1907F));

		PartDefinition cube_r208 = neck6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(103, 136).addBox(-0.0216F, -0.2262F, -0.2499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8251F, 0.831F, -4.3544F, 1.6133F, 0.1207F, 0.0768F));

		PartDefinition cube_r209 = neck6.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(111, 88).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.4912F, 0.1064F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, -0.499F, -4.0293F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r210 = neck7.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(93, 119).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4718F, 0.011F, 4.1365F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck7.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(153, 137).addBox(-0.9282F, -1.4885F, -1.1749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.3147F, -1.1667F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck7.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(123, 135).mirror().addBox(-0.5356F, -0.8847F, -0.6341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4563F, 0.9147F, -2.0667F, 1.5351F, -0.1105F, -0.0909F));

		PartDefinition cube_r213 = neck7.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(148, 61).mirror().addBox(-0.1344F, -1.5955F, 0.2136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4563F, 0.3147F, -1.1667F, 1.6168F, -0.0957F, 0.6056F));

		PartDefinition cube_r214 = neck7.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 152).mirror().addBox(-0.7875F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(152, 89).mirror().addBox(-0.2125F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.3174F, 0.4058F, -2.1542F, 1.707F, 0.1545F, -1.0096F));

		PartDefinition cube_r215 = neck7.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(152, 106).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1335F, 0.9863F, -2.0001F, 1.6292F, 0.0467F, -0.3804F));

		PartDefinition cube_r216 = neck7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(148, 61).addBox(-0.8656F, -1.5955F, 0.2136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.3147F, -1.1667F, 1.6168F, 0.0957F, -0.6056F));

		PartDefinition cube_r217 = neck7.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(152, 89).addBox(-0.7875F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(82, 152).addBox(-0.2125F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2611F, 0.4058F, -2.1542F, 1.707F, -0.1545F, 1.0096F));

		PartDefinition cube_r218 = neck7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(123, 135).addBox(-0.4644F, -0.8847F, -0.6341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.9147F, -2.0667F, 1.5351F, 0.1105F, 0.0909F));

		PartDefinition cube_r219 = neck7.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(152, 106).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0772F, 0.9863F, -2.0001F, 1.6292F, -0.0467F, 0.3804F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 0.6443F, -3.7024F, 0.5363F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(133, 111).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6292F, -0.8902F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(131, 5).addBox(-1.0F, -2.1F, -0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(131, 107).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(82, 124).addBox(-1.5F, -2.1F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.9919F, -2.8714F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(93, 125).addBox(-1.0F, 0.0F, -1.475F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.7929F, 0.0645F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(72, 152).addBox(-1.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.5379F, -5.8333F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(137, 72).addBox(-1.2F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5F, 1.1415F, -5.2565F, 2.342F, -0.6221F, -0.5154F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(146, 99).addBox(-1.0F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.3062F, -4.2704F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(82, 148).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.6664F, -3.2633F, 2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(87, 146).addBox(-1.0F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -2.6017F, -1.654F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(126, 148).addBox(-1.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -2.439F, -2.0194F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(121, 148).addBox(-1.0F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(107, 148).addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -1.5639F, -2.2044F, 2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(94, 21).addBox(-1.0F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -0.5154F, -3.1321F, 2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(120, 17).addBox(-1.0F, -0.6086F, -1.8386F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.8523F, -7.3226F, -2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(146, 74).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 2.1059F, -3.5714F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(70, 146).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1059F, -4.5714F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(37, 152).addBox(-0.5F, -0.3415F, -0.4085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4984F, 2.1291F, -6.9006F, 2.0057F, 0.0006F, 0.0368F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(70, 149).addBox(-0.5F, -0.5915F, -0.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4984F, 2.1291F, -6.9006F, 1.4821F, 0.0006F, 0.0368F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(137, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.961F, -4.3496F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(109, 133).addBox(-1.5F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8168F, -3.2294F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(123, 111).addBox(-0.5F, -1.475F, -0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(122, 111).addBox(-1.0F, -0.525F, -0.325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.84F, -1.8609F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(120, 107).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.0135F, 0.3096F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(99, 67).addBox(-1.0F, -0.625F, -0.425F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4317F, -0.3518F, 0.0524F, 0.0F, 0.0F));

		PartDefinition lowerjawbase = head.addOrReplaceChild("lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.5939F, -1.8729F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r241 = lowerjawbase.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(37, 137).mirror().addBox(-0.5F, -0.3F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(37, 137).addBox(1.72F, -0.3F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.62F, 0.1006F, -1.1091F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r242 = lowerjawbase.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(134, 151).mirror().addBox(-0.5F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(134, 151).addBox(1.72F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.62F, -0.0214F, -0.6668F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r243 = lowerjawbase.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(149, 24).mirror().addBox(-0.5F, -0.15F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(149, 24).addBox(1.72F, -0.15F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.62F, -0.4497F, -1.8722F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r244 = lowerjawbase.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(77, 152).mirror().addBox(-0.5F, -1.05F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 152).addBox(1.72F, -1.05F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.62F, 0.0233F, -2.3883F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r245 = lowerjawbase.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(148, 65).mirror().addBox(-0.5F, -1.25F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(148, 65).addBox(1.726F, -1.25F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.623F, 0.7469F, -2.578F, 2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r246 = lowerjawbase.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(18, 152).mirror().addBox(0.04F, -0.5983F, -0.8906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(18, 152).addBox(-0.34F, -0.5983F, -0.8906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.14F, 2.679F, -3.7403F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r247 = lowerjawbase.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(149, 27).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(149, 27).addBox(1.72F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.62F, -0.448F, -0.38F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r248 = lowerjawbase.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(152, 86).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(152, 86).addBox(1.72F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.62F, 0.5269F, -0.2081F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r249 = lowerjawbase.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(87, 150).mirror().addBox(0.135F, -0.2714F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 150).addBox(-0.435F, -0.2714F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.14F, 2.679F, -3.7403F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r250 = lowerjawbase.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 152).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 152).addBox(1.72F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.62F, -0.4F, -1.0872F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r251 = lowerjawbase.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(57, 146).mirror().addBox(-0.5F, -2.85F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 146).addBox(1.72F, -2.85F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.62F, 0.1401F, -1.1194F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r252 = lowerjawbase.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(97, 150).mirror().addBox(-0.75F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.525F, 3.4787F, -3.8989F, 1.0948F, 0.0643F, 0.124F));

		PartDefinition cube_r253 = lowerjawbase.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(152, 19).mirror().addBox(-0.425F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.5554F, 2.7248F, -4.4168F, 0.7419F, -0.0193F, -0.0177F));

		PartDefinition cube_r254 = lowerjawbase.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(140, 127).mirror().addBox(-0.4312F, -0.2907F, -1.231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 1.8587F, -3.3542F, 0.7765F, 0.257F, 0.2861F));

		PartDefinition cube_r255 = lowerjawbase.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(144, 116).mirror().addBox(-0.0691F, -0.9122F, -0.3379F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(143, 144).mirror().addBox(-0.1293F, -0.5872F, -0.2901F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.485F, 2.6744F, -3.6768F, 0.7834F, 0.295F, 0.2848F));

		PartDefinition cube_r256 = lowerjawbase.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(141, 67).mirror().addBox(-0.4312F, -0.892F, -0.7232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 1.8587F, -3.3542F, -2.3913F, 0.257F, 0.2861F));

		PartDefinition cube_r257 = lowerjawbase.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(141, 13).mirror().addBox(-0.2202F, -0.0597F, -0.4964F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.485F, 2.6744F, -3.6768F, 1.1145F, 0.2902F, 0.2705F));

		PartDefinition cube_r258 = lowerjawbase.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(102, 150).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9925F, 2.536F, -3.2073F, 1.1331F, 0.3019F, 0.3314F));

		PartDefinition cube_r259 = lowerjawbase.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(102, 150).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9725F, 2.536F, -3.2073F, 1.1331F, -0.3019F, -0.3314F));

		PartDefinition cube_r260 = lowerjawbase.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(141, 13).addBox(-1.7798F, -0.0597F, -0.4964F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.465F, 2.6744F, -3.6768F, 1.1145F, -0.2902F, -0.2705F));

		PartDefinition cube_r261 = lowerjawbase.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(97, 150).addBox(-0.25F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.455F, 3.4787F, -3.8989F, 1.0948F, -0.0643F, -0.124F));

		PartDefinition cube_r262 = lowerjawbase.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(141, 67).addBox(-0.5688F, -0.892F, -0.7232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.8F, 1.8587F, -3.3542F, -2.3913F, -0.257F, -0.2861F));

		PartDefinition cube_r263 = lowerjawbase.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(152, 19).addBox(-0.575F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.4246F, 2.7248F, -4.4168F, 0.7419F, 0.0193F, 0.0177F));

		PartDefinition cube_r264 = lowerjawbase.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(144, 116).addBox(-1.9309F, -0.9122F, -0.3379F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(143, 144).addBox(-1.8707F, -0.5872F, -0.2901F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.465F, 2.6744F, -3.6768F, 0.7834F, -0.295F, -0.2848F));

		PartDefinition cube_r265 = lowerjawbase.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(140, 127).addBox(-0.5688F, -0.2907F, -1.231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.8F, 1.8587F, -3.3542F, 0.7765F, -0.257F, -0.2861F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -5.6646F, -3.1301F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(36, 141).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.25F, 4.377F, 2.8826F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(65, 149).addBox(-0.5F, -0.825F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4869F, 6.9558F, -3.0623F, -0.3609F, -0.2342F, -2.966F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(148, 12).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9949F, 6.5371F, 0.7409F, -0.2945F, 0.0149F, -0.0042F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(140, 89).addBox(-0.825F, -0.5F, 1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.634F, 7.6543F, -2.5513F, 0.3231F, 0.2212F, 0.031F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(140, 5).addBox(-0.5687F, -0.3321F, -0.1251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0491F, 7.3621F, -2.2543F, 0.3228F, -0.3122F, -0.0646F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 152).addBox(-1.0437F, 0.3795F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 8.0648F, -4.3145F, 2.0071F, -0.1134F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(13, 151).addBox(-0.225F, -1.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(151, 69).addBox(-0.625F, -1.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8701F, 4.3132F, 0.6273F, -0.0493F, -0.8454F, -1.505F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(125, 151).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8701F, 4.3132F, 0.6273F, -0.6947F, -0.5305F, -0.5457F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(112, 151).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, 3.9251F, 1.066F, -0.8346F, 0.1628F, 0.1459F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(42, 152).addBox(-0.2489F, -0.4513F, -0.2046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2149F, 7.936F, -3.4088F, 2.0071F, -0.3927F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(128, 145).addBox(-1.2489F, -0.1909F, -0.5494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(152, 103).addBox(-0.2489F, -0.7909F, -0.5494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2149F, 7.936F, -3.4088F, 1.4835F, -0.3927F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(152, 83).addBox(-1.0437F, 0.0512F, -0.3465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.325F, 8.0648F, -4.3145F, 1.4835F, -0.1134F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(120, 151).addBox(-0.475F, -0.375F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1011F, 8.3584F, -4.0902F, 1.4837F, -0.0405F, 0.0284F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(26, 143).addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1681F, 8.3584F, -3.8089F, 1.4819F, -0.2877F, 0.0063F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(62, 152).addBox(-0.5767F, -0.6553F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 152).addBox(-0.5767F, -0.6553F, -1.3604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0491F, 7.3621F, -2.2543F, 0.1036F, -0.5002F, 0.4098F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(152, 80).addBox(-0.5743F, -0.3437F, -1.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0491F, 7.3621F, -2.2543F, 0.4161F, -0.3522F, -0.0831F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 149).addBox(-0.9F, -0.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 6.8427F, -2.4377F, -2.8747F, -0.6451F, -0.1195F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 146).addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 3.2507F, 1.829F, -0.4101F, -0.007F, -0.016F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(150, 48).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.25F, 4.9762F, 2.914F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(153, 6).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3824F, 5.7344F, -0.8955F, 2.4237F, 0.3968F, 0.4166F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(152, 131).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3391F, 5.87F, -1.036F, 2.3507F, 0.1563F, 0.1528F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(152, 134).addBox(-0.05F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 4.9982F, -0.1332F, 2.343F, 0.094F, 0.0912F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(147, 0).addBox(-0.7F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5F, 5.9708F, -1.1403F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(97, 146).addBox(-0.7F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 6.4096F, -1.5495F, 2.1892F, -0.215F, -0.1506F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(111, 94).addBox(-0.4096F, -0.6102F, -0.5758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.2273F, 3.9367F, 1.2501F, -3.1084F, 0.923F, 1.5388F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(152, 3).addBox(-0.45F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(152, 0).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(1.3062F, 4.5048F, 0.4807F, -2.6975F, -0.4175F, 0.9541F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(151, 116).addBox(-0.6F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(1.553F, 4.5652F, 0.6939F, -2.0023F, -1.1237F, 0.046F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(151, 113).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.5449F, 4.5797F, 1.0935F, -1.5954F, -0.0335F, -0.423F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(140, 106).addBox(-1.0F, -1.6861F, -0.6878F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.5317F, 5.265F, 0.682F, -0.4164F, -0.0364F, -1.5582F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(144, 38).addBox(-1.0F, -0.5861F, -0.4878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.3298F, 5.266F, 0.7779F, -1.5509F, -0.0364F, -1.5582F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(94, 42).addBox(-0.3313F, -0.4011F, -0.5758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.2273F, 3.9367F, 1.2501F, -2.928F, 0.9058F, 1.7661F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(77, 148).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7491F, 5.602F, -0.7586F, 2.3019F, 0.3372F, 0.3161F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(147, 86).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.245F, 4.9719F, 2.9084F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(32, 152).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.247F, 5.7207F, 1.3291F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(151, 97).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.247F, 5.6011F, 1.9171F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 149).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.247F, 5.3811F, 2.4753F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(148, 139).addBox(-0.3705F, -0.752F, -0.7315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(148, 139).addBox(-0.3205F, -2.152F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(148, 139).addBox(-0.3205F, -1.952F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F))
				.texOffs(148, 139).addBox(-0.3205F, -1.752F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(1.1925F, 6.6987F, 0.6488F, -1.3235F, 0.0088F, 0.0344F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(148, 139).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)), PartPose.offsetAndRotation(1.4108F, 5.9535F, 2.1174F, -2.2834F, 0.0088F, 0.0344F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(148, 139).addBox(-0.5F, -0.6F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F))
				.texOffs(148, 139).addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.413F, 5.8361F, 1.9129F, -1.5329F, 0.0088F, 0.0344F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(148, 139).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(1.4167F, 5.8101F, 2.228F, -1.1664F, 0.0088F, 0.0344F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(150, 45).addBox(-0.3675F, -0.3475F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(149, 110).addBox(-0.3675F, -0.4725F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.1925F, 6.6987F, 0.6488F, 2.5773F, 0.0088F, 0.0344F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(57, 151).addBox(-0.3675F, -0.6272F, -0.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1925F, 6.6987F, 0.6488F, 1.3643F, 0.0088F, 0.0344F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(151, 36).addBox(-0.3675F, -0.3343F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.1925F, 6.6987F, 0.6488F, 0.6226F, 0.0088F, 0.0344F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(151, 30).addBox(-0.3675F, -0.5793F, -0.3381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.1925F, 6.6987F, 0.6488F, -0.3374F, 0.0088F, 0.0344F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 151).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(151, 100).addBox(-0.5F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.25F, 4.8088F, 0.8569F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(152, 122).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.25F, 4.245F, 1.0621F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(148, 8).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, 3.8026F, 1.4674F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(152, 119).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.25F, 3.683F, 2.0554F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(152, 125).addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, 4.0797F, 2.1311F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(149, 16).addBox(-0.9F, -2.7F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 149).addBox(-1.075F, -2.7F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.7F, 6.8588F, 2.6311F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(147, 107).addBox(-1.0F, 0.6F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7F, 6.9338F, 2.7811F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 152).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2482F, 5.7134F, 0.3795F, 2.2879F, 0.0915F, -0.058F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(139, 151).addBox(-0.4935F, -1.0296F, -0.4934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.246F, 5.6988F, 0.4068F, 2.2951F, 0.1571F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(138, 21).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2306F, 6.4094F, 0.2829F, 2.091F, 0.1401F, 0.035F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(108, 141).addBox(-0.475F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.0089F, 6.5394F, -0.6451F, 0.7674F, 0.2397F, 0.0262F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -5.6646F, -3.1301F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(36, 141).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.377F, 2.8826F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(65, 149).mirror().addBox(-0.5F, -0.825F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4869F, 6.9558F, -3.0623F, -0.3609F, 0.2342F, 2.966F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(148, 12).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9949F, 6.5371F, 0.7409F, -0.2945F, -0.0149F, 0.0042F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(140, 89).mirror().addBox(-0.175F, -0.5F, 1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.634F, 7.6543F, -2.5513F, 0.3231F, -0.2212F, -0.031F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(140, 5).mirror().addBox(-0.4313F, -0.3321F, -0.1251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0491F, 7.3621F, -2.2543F, 0.3228F, 0.3122F, 0.0646F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(47, 152).mirror().addBox(0.0437F, 0.3795F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 8.0648F, -4.3145F, 2.0071F, 0.1134F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(13, 151).mirror().addBox(-0.775F, -1.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(151, 69).mirror().addBox(-0.375F, -1.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8701F, 4.3132F, 0.6273F, -0.0493F, 0.8454F, 1.505F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(125, 151).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8701F, 4.3132F, 0.6273F, -0.6947F, 0.5305F, 0.5457F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(112, 151).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.9251F, 1.066F, -0.8346F, -0.1628F, -0.1459F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(42, 152).mirror().addBox(-0.7511F, -0.4513F, -0.2046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2149F, 7.936F, -3.4088F, 2.0071F, 0.3927F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(128, 145).mirror().addBox(-0.7511F, -0.1909F, -0.5494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(152, 103).mirror().addBox(-0.7511F, -0.7909F, -0.5494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2149F, 7.936F, -3.4088F, 1.4835F, 0.3927F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(152, 83).mirror().addBox(0.0437F, 0.0512F, -0.3465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 8.0648F, -4.3145F, 1.4835F, 0.1134F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(120, 151).mirror().addBox(-0.525F, -0.375F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1011F, 8.3584F, -4.0902F, 1.4837F, 0.0405F, -0.0284F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(26, 143).mirror().addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1681F, 8.3584F, -3.8089F, 1.4819F, 0.2877F, -0.0063F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(62, 152).mirror().addBox(-0.4233F, -0.6553F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 152).mirror().addBox(-0.4233F, -0.6553F, -1.3604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0491F, 7.3621F, -2.2543F, 0.1036F, 0.5002F, -0.4098F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(152, 80).mirror().addBox(-0.4257F, -0.3437F, -1.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0491F, 7.3621F, -2.2543F, 0.4161F, 0.3522F, 0.0831F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(52, 149).mirror().addBox(-0.1F, -0.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.8427F, -2.4377F, -2.8747F, 0.6451F, 0.1195F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(7, 146).mirror().addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.2507F, 1.829F, -0.4101F, 0.007F, 0.016F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(150, 48).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.9762F, 2.914F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(153, 6).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3824F, 5.7344F, -0.8955F, 2.4237F, -0.3968F, -0.4166F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(152, 131).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3391F, 5.87F, -1.036F, 2.3507F, -0.1563F, -0.1528F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(152, 134).mirror().addBox(-0.95F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9982F, -0.1332F, 2.343F, -0.094F, -0.0912F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(-0.3F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.9708F, -1.1403F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(97, 146).mirror().addBox(-0.3F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.4096F, -1.5495F, 2.1892F, 0.215F, 0.1506F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(111, 94).mirror().addBox(-1.5904F, -0.6102F, -0.5758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.2273F, 3.9367F, 1.2501F, -3.1084F, -0.923F, -1.5388F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(152, 3).mirror().addBox(-0.55F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(152, 0).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-1.3062F, 4.5048F, 0.4807F, -2.6975F, 0.4175F, -0.9541F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(151, 116).mirror().addBox(-0.4F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-1.553F, 4.5652F, 0.6939F, -2.0023F, 1.1237F, -0.046F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(151, 113).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.5449F, 4.5797F, 1.0935F, -1.5954F, 0.0335F, 0.423F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(140, 106).mirror().addBox(-1.0F, -1.6861F, -0.6878F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.5317F, 5.265F, 0.682F, -0.4164F, 0.0364F, 1.5582F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(144, 38).mirror().addBox(-1.0F, -0.5861F, -0.4878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3298F, 5.266F, 0.7779F, -1.5509F, 0.0364F, 1.5582F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(94, 42).mirror().addBox(-1.6687F, -0.4011F, -0.5758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.2273F, 3.9367F, 1.2501F, -2.928F, -0.9058F, -1.7661F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(77, 148).mirror().addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7491F, 5.602F, -0.7586F, 2.3019F, -0.3372F, -0.3161F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(147, 86).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.245F, 4.9719F, 2.9084F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(32, 152).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.247F, 5.7207F, 1.3291F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(151, 97).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.247F, 5.6011F, 1.9171F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(5, 149).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.247F, 5.3811F, 2.4753F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(148, 139).mirror().addBox(-0.6295F, -0.752F, -0.7315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(148, 139).mirror().addBox(-0.6795F, -2.152F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(148, 139).mirror().addBox(-0.6795F, -1.952F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)).mirror(false)
				.texOffs(148, 139).mirror().addBox(-0.6795F, -1.752F, -1.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-1.1925F, 6.6987F, 0.6488F, -1.3235F, -0.0088F, -0.0344F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(148, 139).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)).mirror(false), PartPose.offsetAndRotation(-1.4108F, 5.9535F, 2.1174F, -2.2834F, -0.0088F, -0.0344F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(148, 139).mirror().addBox(-0.5F, -0.6F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false)
				.texOffs(148, 139).mirror().addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.413F, 5.8361F, 1.9129F, -1.5329F, -0.0088F, -0.0344F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(148, 139).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-1.4167F, 5.8101F, 2.228F, -1.1664F, -0.0088F, -0.0344F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(150, 45).mirror().addBox(-0.6325F, -0.3475F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(149, 110).mirror().addBox(-0.6325F, -0.4725F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.1925F, 6.6987F, 0.6488F, 2.5773F, -0.0088F, -0.0344F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(57, 151).mirror().addBox(-0.6325F, -0.6272F, -0.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1925F, 6.6987F, 0.6488F, 1.3643F, -0.0088F, -0.0344F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(151, 36).mirror().addBox(-0.6325F, -0.3343F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.1925F, 6.6987F, 0.6488F, 0.6226F, -0.0088F, -0.0344F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(151, 30).mirror().addBox(-0.6325F, -0.5793F, -0.3381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.1925F, 6.6987F, 0.6488F, -0.3374F, -0.0088F, -0.0344F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(107, 151).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(151, 100).mirror().addBox(-0.5F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.8088F, 0.8569F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(152, 122).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.245F, 1.0621F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(148, 8).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.8026F, 1.4674F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(152, 119).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.683F, 2.0554F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(152, 125).mirror().addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.0797F, 2.1311F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(149, 16).mirror().addBox(-0.1F, -2.7F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 149).mirror().addBox(0.075F, -2.7F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 6.8588F, 2.6311F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(147, 107).mirror().addBox(0.0F, 0.6F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 6.9338F, 2.7811F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 152).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2482F, 5.7134F, 0.3795F, 2.2879F, -0.0915F, 0.058F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(139, 151).mirror().addBox(-0.5065F, -1.0296F, -0.4934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.246F, 5.6988F, 0.4068F, 2.2951F, -0.1571F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(138, 21).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2306F, 6.4094F, 0.2829F, 2.091F, -0.1401F, -0.035F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(108, 141).mirror().addBox(-0.525F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.0089F, 6.5394F, -0.6451F, 0.7674F, -0.2397F, -0.0262F));

		PartDefinition neckflapmidfront = neckmiddlefront.addOrReplaceChild("neckflapmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0546F, -9.113F, -0.2335F, 0.0F, 0.0F));

		PartDefinition neckskinmidfront = neckflapmidfront.addOrReplaceChild("neckskinmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.5F, -0.0424F, 0.0F, 0.0F));

		PartDefinition neckflapmidbase = neckmiddlebase.addOrReplaceChild("neckflapmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5539F, -12.2082F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinmidbase = neckflapmidbase.addOrReplaceChild("neckskinmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 0.8F, -0.0637F, 0.0F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9412F, 10.3326F, -11.4077F, 0.9599F, 0.0016F, -0.0018F));

		PartDefinition cube_r376 = leftArm.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(74, 73).addBox(0.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 5.3122F, -2.1341F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r377 = leftArm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(147, 90).addBox(-0.5239F, -1.0994F, -0.0368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0329F, 2.4949F, -1.586F, 1.0263F, -0.3654F, 0.4067F));

		PartDefinition cube_r378 = leftArm.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(46, 123).addBox(-0.5239F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0329F, 2.4949F, -1.586F, 0.7209F, -0.3654F, 0.4067F));

		PartDefinition cube_r379 = leftArm.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(140, 131).addBox(-0.475F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5436F, 2.1202F, -2.4993F, 1.5701F, -0.4224F, 0.3346F));

		PartDefinition cube_r380 = leftArm.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(105, 33).addBox(-1.0F, -0.175F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3588F, 5.6536F, -3.0286F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r381 = leftArm.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 130).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3588F, 7.9525F, -3.6744F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r382 = leftArm.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(145, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3588F, 9.8491F, -5.6377F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r383 = leftArm.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 145).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3588F, 9.9748F, -4.8862F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r384 = leftArm.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(140, 93).addBox(-1.0F, -1.0867F, -0.0189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3588F, 9.9004F, -4.8659F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r385 = leftArm.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(132, 81).addBox(-1.0F, 0.0155F, -0.6144F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3588F, 9.9004F, -4.8659F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r386 = leftArm.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(129, 54).addBox(-0.5F, -0.875F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1412F, 7.3662F, -2.7487F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r387 = leftArm.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(105, 27).addBox(-0.5F, -0.375F, 1.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1412F, 8.2754F, -3.6778F, 1.1694F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0921F, 10.6791F, -5.4788F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftArm2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(118, 24).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(-1.0489F, 7.1527F, -0.2501F, 0.944F, 1.4655F, -0.6105F));

		PartDefinition cube_r389 = leftArm2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(97, 143).addBox(-1.9F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8926F, 3.7816F, -1.3321F, 0.8856F, 1.4597F, -0.673F));

		PartDefinition cube_r390 = leftArm2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(115, 0).addBox(-1.0F, -0.5F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.9199F, 6.7741F, -1.5426F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition cube_r391 = leftArm2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(144, 30).addBox(-1.0F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.118F)), PartPose.offsetAndRotation(-0.9313F, 0.2991F, -0.2695F, 0.2084F, 1.1431F, -1.3655F));

		PartDefinition cube_r392 = leftArm2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(57, 116).addBox(-0.725F, -0.5F, -2.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(-0.9275F, 2.0042F, -0.6141F, 0.8856F, 1.4597F, -0.673F));

		PartDefinition cube_r393 = leftArm2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(114, 61).addBox(-1.025F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.9275F, 2.0042F, -0.6141F, 1.5632F, 1.4849F, 0.0076F));

		PartDefinition cube_r394 = leftArm2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(108, 97).addBox(-0.15F, -1.0F, -1.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6471F, 2.1481F, 2.1655F, 0.1873F, 1.0917F, -1.389F));

		PartDefinition cube_r395 = leftArm2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(147, 103).addBox(-0.4F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7255F, 2.5083F, 1.1925F, 2.3583F, 1.4489F, 0.8064F));

		PartDefinition cube_r396 = leftArm2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(133, 138).addBox(-2.1F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6486F, 8.1901F, 1.0823F, 3.0524F, -0.2689F, 1.6097F));

		PartDefinition cube_r397 = leftArm2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(92, 147).addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.735F, 8.1471F, 0.0869F, 2.0455F, -1.4741F, 2.6802F));

		PartDefinition cube_r398 = leftArm2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(45, 95).addBox(0.0363F, -0.0823F, -11.966F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2333F, -4.4743F, 2.8598F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition cube_r399 = leftArm2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(127, 44).addBox(-1.1F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7342F, 1.0137F, 1.3549F, 2.3583F, 1.4489F, 0.8064F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.272F, -0.9976F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r400 = leftArm3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(11, 113).addBox(-0.5362F, -0.4664F, -0.8062F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3318F, 4.0997F, -0.2889F, 1.4547F, -0.384F, 0.2811F));

		PartDefinition cube_r401 = leftArm3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(84, 97).addBox(-0.4F, -1.8F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.827F, 1.6715F, 1.0922F, 1.388F, 0.3006F, -0.0547F));

		PartDefinition cube_r402 = leftArm3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(51, 82).addBox(-0.7F, -2.1502F, -17.8157F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.127F, -12.4006F, 3.726F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftArm3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(71, 97).addBox(0.2F, -1.8F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.827F, 1.5847F, 0.5998F, 1.3746F, -0.4721F, 0.0902F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9412F, 10.3326F, -11.4077F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r404 = rightArm.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 76).addBox(-2.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 5.3122F, -2.1341F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r405 = rightArm.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(32, 148).addBox(-0.4761F, -1.0994F, -0.0368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0329F, 2.4949F, -1.586F, 1.0263F, 0.3654F, -0.4067F));

		PartDefinition cube_r406 = rightArm.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(9, 125).addBox(-0.4761F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0329F, 2.4949F, -1.586F, 0.7209F, 0.3654F, -0.4067F));

		PartDefinition cube_r407 = rightArm.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(140, 135).addBox(-0.525F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.5436F, 2.1202F, -2.4993F, 1.5701F, 0.4224F, -0.3346F));

		PartDefinition cube_r408 = rightArm.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(13, 107).addBox(-1.0F, -0.175F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3588F, 5.6536F, -3.0286F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightArm.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(130, 34).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3588F, 7.9525F, -3.6744F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightArm.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(80, 145).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3588F, 9.8491F, -5.6377F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r411 = rightArm.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(36, 145).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3588F, 9.9748F, -4.8862F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r412 = rightArm.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(142, 110).addBox(-1.0F, -1.0867F, -0.0189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3588F, 9.9004F, -4.8659F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightArm.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(133, 85).addBox(-1.0F, 0.0155F, -0.6144F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3588F, 9.9004F, -4.8659F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightArm.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(109, 129).addBox(-1.5F, -0.875F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1412F, 7.3662F, -2.7487F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightArm.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(83, 105).addBox(-1.5F, -0.375F, 1.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1412F, 8.2754F, -3.6778F, 1.1694F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0921F, 10.6791F, -5.4788F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightArm2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(118, 30).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(1.0489F, 7.1527F, -0.2501F, 0.944F, -1.4655F, 0.6105F));

		PartDefinition cube_r417 = rightArm2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(144, 96).addBox(-0.1F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8926F, 3.7816F, -1.3321F, 0.8856F, -1.4597F, 0.673F));

		PartDefinition cube_r418 = rightArm2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(117, 73).addBox(0.0F, -0.5F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.9199F, 6.7741F, -1.5426F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition cube_r419 = rightArm2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(144, 71).addBox(-1.0F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.118F)), PartPose.offsetAndRotation(0.9313F, 0.2991F, -0.2695F, 0.2084F, -1.1431F, 1.3655F));

		PartDefinition cube_r420 = rightArm2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(46, 117).addBox(-0.275F, -0.5F, -2.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.123F)), PartPose.offsetAndRotation(0.9275F, 2.0042F, -0.6141F, 0.8856F, -1.4597F, 0.673F));

		PartDefinition cube_r421 = rightArm2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(68, 116).addBox(0.025F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.9275F, 2.0042F, -0.6141F, 1.5632F, -1.4849F, -0.0076F));

		PartDefinition cube_r422 = rightArm2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 111).addBox(-0.85F, -1.0F, -1.85F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6471F, 2.1481F, 2.1655F, 0.1873F, -1.0917F, 1.389F));

		PartDefinition cube_r423 = rightArm2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(148, 41).addBox(-0.6F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7255F, 2.5083F, 1.1925F, 2.3583F, -1.4489F, -0.8064F));

		PartDefinition cube_r424 = rightArm2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(140, 119).addBox(0.1F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6486F, 8.1901F, 1.0823F, 3.0524F, 0.2689F, -1.6097F));

		PartDefinition cube_r425 = rightArm2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(37, 148).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.735F, 8.1471F, 0.0869F, 2.0455F, 1.4741F, -2.6802F));

		PartDefinition cube_r426 = rightArm2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(58, 95).addBox(-1.0363F, -0.0823F, -11.966F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2333F, -4.4743F, 2.8598F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition cube_r427 = rightArm2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(128, 17).addBox(-0.9F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7342F, 1.0137F, 1.3549F, 2.3583F, -1.4489F, -0.8064F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.272F, -0.9976F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightArm3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(94, 113).addBox(-0.4638F, -0.4664F, -0.8062F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3318F, 4.0997F, -0.2889F, 1.4547F, 0.384F, -0.2811F));

		PartDefinition cube_r429 = rightArm3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(15, 99).addBox(-0.6F, -1.8F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.827F, 1.6715F, 1.0922F, 1.388F, -0.3006F, 0.0547F));

		PartDefinition cube_r430 = rightArm3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(83, 25).addBox(-2.3F, -2.1502F, -17.8157F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.127F, -12.4006F, 3.726F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r431 = rightArm3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(98, 89).addBox(-1.2F, -1.8F, -3.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.827F, 1.5847F, 0.5998F, 1.3746F, 0.4721F, -0.0902F));

		PartDefinition bone = bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0629F, 5.0242F, -8.2224F, 0.2131F, 0.1807F, 0.2131F));

		PartDefinition cube_r432 = bone.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(110, 115).addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2316F, 2.9878F, -5.2471F, 0.5369F, 0.7378F, 0.1818F));

		PartDefinition cube_r433 = bone.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(120, 10).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3387F, 1.1693F, -6.8065F, 1.3572F, 0.7378F, 0.1818F));

		PartDefinition cube_r434 = bone.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(150, 145).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1207F, -0.5746F, -4.9253F, 2.908F, 0.0076F, -0.253F));

		PartDefinition cube_r435 = bone.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(150, 142).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0843F, -1.3841F, -4.3751F, -2.1534F, 0.0076F, -0.253F));

		PartDefinition cube_r436 = bone.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(137, 115).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1996F, -1.8568F, -3.5015F, -1.0626F, 0.0076F, -0.253F));

		PartDefinition cube_r437 = bone.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(14, 147).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1345F, -1.6346F, -2.5287F, -0.2336F, 0.0076F, -0.253F));

		PartDefinition cube_r438 = bone.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(136, 44).addBox(-0.5F, -1.4F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1103F, -0.7191F, -1.4934F, 0.9009F, 0.0076F, -0.253F));

		PartDefinition cube_r439 = bone.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(135, 0).addBox(-0.5F, -1.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2622F, -0.1604F, -0.537F, 1.2063F, 0.0076F, -0.253F));

		PartDefinition cube_r440 = bone.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(133, 128).addBox(-0.5F, -1.7F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2851F, 3.843F, -2.0802F, -1.8567F, 0.0076F, -0.253F));

		PartDefinition cube_r441 = bone.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(141, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7462F, 5.6083F, -1.4864F, -1.5077F, 0.0076F, -0.253F));

		PartDefinition cube_r442 = bone.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(141, 59).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3594F, 4.152F, -2.8016F, -0.8532F, 0.0076F, -0.253F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(18, 127).addBox(-0.5F, -2.775F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.1259F, 3.2227F, -1.9399F, -0.4168F, 0.0076F, -0.253F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(114, 39).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2396F, 3.7188F, -3.793F, 0.3424F, 0.0076F, -0.253F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(46, 110).addBox(-0.4217F, 1.4843F, 0.9129F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8564F, 2.5627F, -4.2223F, 0.8834F, 0.0076F, -0.253F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(109, 104).addBox(-0.4217F, 0.4143F, 4.1902F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8564F, 2.5627F, -4.2223F, 0.6653F, 0.0076F, -0.253F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(151, 94).addBox(-0.9939F, 0.9591F, 3.7556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 1.4784F, -0.2074F, -0.4006F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(24, 149).addBox(-0.9939F, 0.9539F, -4.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, -2.6493F, -0.2074F, -0.4006F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(23, 152).addBox(-0.9939F, 4.0192F, 0.1229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 2.4383F, -0.2074F, -0.4006F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(26, 139).addBox(-0.9939F, -2.1341F, 2.3567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 0.8239F, -0.2074F, -0.4006F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(10, 139).addBox(-0.9939F, -1.8761F, 0.5669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 0.9286F, -0.2074F, -0.4006F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(109, 13).addBox(-0.9939F, -1.9597F, -0.0235F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 0.6231F, -0.2074F, -0.4006F));

		PartDefinition cube_r453 = bone.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(147, 4).addBox(-0.9939F, 2.1964F, 1.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6791F, -0.605F, 3.5783F, 1.7838F, -0.2074F, -0.4006F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0629F, 5.0242F, -8.2224F, 0.2131F, -0.1807F, -0.2131F));

		PartDefinition cube_r454 = bone3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(110, 115).mirror().addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2316F, 2.9878F, -5.2471F, 0.5369F, -0.7378F, -0.1818F));

		PartDefinition cube_r455 = bone3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(120, 10).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.3387F, 1.1693F, -6.8065F, 1.3572F, -0.7378F, -0.1818F));

		PartDefinition cube_r456 = bone3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(150, 145).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1207F, -0.5746F, -4.9253F, 2.908F, -0.0076F, 0.253F));

		PartDefinition cube_r457 = bone3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(150, 142).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0843F, -1.3841F, -4.3751F, -2.1534F, -0.0076F, 0.253F));

		PartDefinition cube_r458 = bone3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(137, 115).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1996F, -1.8568F, -3.5015F, -1.0626F, -0.0076F, 0.253F));

		PartDefinition cube_r459 = bone3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(14, 147).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1345F, -1.6346F, -2.5287F, -0.2336F, -0.0076F, 0.253F));

		PartDefinition cube_r460 = bone3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(136, 44).mirror().addBox(-0.5F, -1.4F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1103F, -0.7191F, -1.4934F, 0.9009F, -0.0076F, 0.253F));

		PartDefinition cube_r461 = bone3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-0.5F, -1.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.1604F, -0.537F, 1.2063F, -0.0076F, 0.253F));

		PartDefinition cube_r462 = bone3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(133, 128).mirror().addBox(-0.5F, -1.7F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2851F, 3.843F, -2.0802F, -1.8567F, -0.0076F, 0.253F));

		PartDefinition cube_r463 = bone3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(141, 55).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7462F, 5.6083F, -1.4864F, -1.5077F, -0.0076F, 0.253F));

		PartDefinition cube_r464 = bone3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(141, 59).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3594F, 4.152F, -2.8016F, -0.8532F, -0.0076F, 0.253F));

		PartDefinition cube_r465 = bone3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(18, 127).mirror().addBox(-0.5F, -2.775F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1259F, 3.2227F, -1.9399F, -0.4168F, -0.0076F, 0.253F));

		PartDefinition cube_r466 = bone3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(114, 39).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2396F, 3.7188F, -3.793F, 0.3424F, -0.0076F, 0.253F));

		PartDefinition cube_r467 = bone3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(46, 110).mirror().addBox(-0.5783F, 1.4843F, 0.9129F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8564F, 2.5627F, -4.2223F, 0.8834F, -0.0076F, 0.253F));

		PartDefinition cube_r468 = bone3.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(109, 104).mirror().addBox(-0.5783F, 0.4143F, 4.1902F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8564F, 2.5627F, -4.2223F, 0.6653F, -0.0076F, 0.253F));

		PartDefinition cube_r469 = bone3.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(151, 94).mirror().addBox(-0.0061F, 0.9591F, 3.7556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 1.4784F, 0.2074F, 0.4006F));

		PartDefinition cube_r470 = bone3.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(24, 149).mirror().addBox(-0.0061F, 0.9539F, -4.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, -2.6493F, 0.2074F, 0.4006F));

		PartDefinition cube_r471 = bone3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(23, 152).mirror().addBox(-0.0061F, 4.0192F, 0.1229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 2.4383F, 0.2074F, 0.4006F));

		PartDefinition cube_r472 = bone3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(26, 139).mirror().addBox(-0.0061F, -2.1341F, 2.3567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 0.8239F, 0.2074F, 0.4006F));

		PartDefinition cube_r473 = bone3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(10, 139).mirror().addBox(-0.0061F, -1.8761F, 0.5669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 0.9286F, 0.2074F, 0.4006F));

		PartDefinition cube_r474 = bone3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(109, 13).mirror().addBox(-0.0061F, -1.9597F, -0.0235F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 0.6231F, 0.2074F, 0.4006F));

		PartDefinition cube_r475 = bone3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(147, 4).mirror().addBox(-0.0061F, 2.1964F, 1.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6791F, -0.605F, 3.5783F, 1.7838F, 0.2074F, 0.4006F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 9).addBox(-1.0F, -1.0929F, 0.0511F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6992F, 2.0273F, 0.1475F, 0.0863F, 0.0128F));

		PartDefinition cube_r476 = tail1.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(117, 149).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8711F, 4.2412F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail1.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(29, 149).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9924F, 6.6001F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r478 = tail1.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(0, 139).addBox(-0.5F, -3.6F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1034F, 0.0516F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r479 = tail1.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(20, 144).addBox(-0.5F, -3.4F, 3.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 16).addBox(-0.5F, -3.2F, 1.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 139).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0929F, 3.0511F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r480 = tail1.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-2.825F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0929F, 0.0511F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r481 = tail1.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(46, 43).addBox(-0.175F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0929F, 0.0511F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 52).addBox(-1.0F, -0.1774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 7.9957F, -0.0051F, -0.0872F, 0.0042F));

		PartDefinition cube_r482 = tail2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.175F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.8226F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r483 = tail2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(62, 0).addBox(-1.825F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.8226F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r484 = tail2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(10, 149).addBox(0.0F, 0.3F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2542F, 7.9016F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(62, 146).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7882F, 4.9767F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(114, 145).addBox(0.0F, 0.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8722F, 2.8312F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r487 = tail2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(118, 142).addBox(0.0F, -0.6F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7464F, 0.4492F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(148, 57).addBox(-0.5F, -0.9F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2747F, 7.074F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(147, 131).addBox(-0.5F, -1.2F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2321F, 5.1097F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(147, 127).addBox(-0.5F, -1.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0922F, 3.1222F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(147, 123).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1984F, 1.0035F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(50, 32).addBox(-1.0F, -2.1774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9951F, 7.8605F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition cube_r492 = tail3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.8F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -1.1774F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r493 = tail3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(71, 32).addBox(-1.2F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -1.1774F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r494 = tail3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(153, 9).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6154F, 6.4757F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(21, 134).addBox(0.0F, 2.9F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(131, 148).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9536F, 1.6616F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(92, 151).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8989F, 7.2613F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(151, 77).addBox(-0.5F, -0.875F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0051F, 5.1427F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(147, 119).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1113F, 3.024F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail3.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(47, 148).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0212F, 0.8672F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(111, 39).addBox(0.0F, -2.4493F, 7.0258F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 64).addBox(-0.5F, -1.9774F, 0.0231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2011F, 7.9372F, 0.2934F, -0.2585F, -0.0419F));

		PartDefinition cube_r501 = tail4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(14, 131).addBox(0.0F, 3.9F, 10.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 44).addBox(0.0F, 3.0F, 8.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 79).addBox(0.0F, 2.1F, 6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 24).addBox(0.0F, 1.2F, 4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(73, 17).addBox(0.0F, -0.4F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0205F, 5.0826F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(52, 20).addBox(0.0F, -0.55F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0095F, 3.0431F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(153, 39).addBox(0.0F, -0.85F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8621F, 1.1807F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7896F, 7.9005F, 0.1114F, -0.3471F, -0.038F));

		PartDefinition cube_r505 = tail5.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(13, 154).addBox(0.0F, 2.8F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 154).addBox(0.0F, 1.8F, 7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 33).addBox(0.0F, 0.8F, 5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail5.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(153, 13).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1646F, 5.4917F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail5.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(138, 55).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1113F, 3.024F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail5.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(37, 134).addBox(0.0F, -0.5F, -0.175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0621F, 1.1807F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 52).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0156F, 7.9012F, 0.2115F, -0.5222F, -0.0403F));

		PartDefinition cube_r509 = tail6.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(154, 22).addBox(0.0F, 0.8F, 6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 16).addBox(0.0F, -0.2F, 4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(83, 89).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.007F, 7.9002F, 0.368F, -0.252F, -0.0657F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(90, 7).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, 5.9225F, 0.0452F, -0.2615F, -0.0117F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(118, 53).addBox(-0.5F, 0.0949F, 0.0152F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2715F, 6.043F, -0.0801F, -0.4667F, 0.1166F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(82, 118).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, 4.0152F, -0.1158F, -0.1724F, 0.0276F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(11, 119).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1293F, -0.2559F, 0.0557F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(119, 94).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0933F, -0.2577F, 0.0465F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(119, 115).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1787F, -0.2148F, 0.0385F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9814F, 6.5321F, -5.1855F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r510 = bone2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(0, 124).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -10.7872F, 3.8736F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r511 = bone2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(91, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0186F, -11.0309F, 1.8885F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r512 = bone2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(126, 0).addBox(0.0F, -0.8912F, -2.8748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 1.7144F, -0.4188F, -0.0539F));

		PartDefinition cube_r513 = bone2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(91, 75).addBox(0.0F, -0.2803F, 0.9208F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -1.4708F, -0.4188F, -0.0539F));

		PartDefinition cube_r514 = bone2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(148, 53).addBox(-0.8614F, 2.5942F, 4.9762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -1.4659F, -0.724F, -0.1017F));

		PartDefinition cube_r515 = bone2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(119, 121).addBox(-0.8614F, 4.1013F, 2.6402F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -1.3786F, -0.724F, -0.1017F));

		PartDefinition cube_r516 = bone2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(82, 133).addBox(-0.8614F, 5.8853F, -3.8145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -0.5059F, -0.724F, -0.1017F));

		PartDefinition cube_r517 = bone2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(150, 148).addBox(-0.8614F, 4.7876F, -7.7461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 0.0177F, -0.724F, -0.1017F));

		PartDefinition cube_r518 = bone2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(108, 137).addBox(-0.8614F, -4.997F, -7.6127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 1.1521F, -0.724F, -0.1017F));

		PartDefinition cube_r519 = bone2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(129, 49).addBox(-0.8614F, -6.7148F, 0.3741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 2.4611F, -0.724F, -0.1017F));

		PartDefinition cube_r520 = bone2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(52, 144).addBox(-0.8614F, -0.4007F, 5.1063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -2.3822F, -0.724F, -0.1017F));

		PartDefinition cube_r521 = bone2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(105, 6).addBox(-0.8614F, 4.605F, -1.1891F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, -1.0732F, -0.724F, -0.1017F));

		PartDefinition cube_r522 = bone2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(57, 122).addBox(-0.8614F, -0.1642F, -4.7532F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 0.2795F, -0.724F, -0.1017F));

		PartDefinition cube_r523 = bone2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(64, 122).addBox(0.0F, -0.2405F, -2.8673F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5186F, -10.9112F, 1.8062F, 0.2745F, -0.4188F, -0.0539F));

		PartDefinition cube_r524 = bone2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(14, 134).addBox(-0.5F, 0.2F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0276F, -7.5597F, 10.1342F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r525 = bone2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(133, 133).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0276F, -7.5597F, 10.1342F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r526 = bone2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(129, 27).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0276F, -8.0747F, 9.277F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r527 = bone2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(139, 34).addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0276F, -4.9882F, 8.5891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r528 = bone2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(142, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0276F, -7.5597F, 10.1342F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r529 = bone2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(59, 103).addBox(-0.5F, -0.2F, -1.475F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0246F, -9.5159F, 5.4253F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r530 = bone2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(83, 111).addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r531 = bone2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(137, 38).addBox(-0.4741F, -1.0275F, -1.5783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6522F, 0.3855F, 8.9048F, -0.9143F, -0.2544F, 0.4173F));

		PartDefinition cube_r532 = bone2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(125, 59).addBox(-0.4741F, -1.6701F, -2.9468F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5022F, 0.3855F, 8.9048F, 0.1542F, 0.056F, 0.4664F));

		PartDefinition cube_r533 = bone2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(104, 75).addBox(-0.4741F, -0.7633F, -0.8818F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6522F, 0.3855F, 8.9048F, -0.4954F, -0.2544F, 0.4173F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(42, 148).addBox(-0.9386F, -10.4168F, -1.9761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(82, 139).addBox(-0.9386F, -10.4168F, -2.6761F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, 2.7408F, -0.3811F, 0.3899F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(149, 151).addBox(-0.9386F, -9.258F, 5.4735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -2.7569F, -0.3811F, 0.3899F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(144, 151).addBox(-0.9386F, 0.9772F, 10.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -1.7098F, -0.3811F, 0.3899F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(65, 144).addBox(-0.9386F, 7.1324F, 4.2827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -0.7935F, -0.3811F, 0.3899F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(5, 139).addBox(-0.9386F, 5.2733F, 0.0361F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -0.3135F, -0.3811F, 0.3899F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(129, 10).addBox(-0.9386F, 2.9056F, 1.6295F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -0.5317F, -0.3811F, 0.3899F));

		PartDefinition cube_r540 = bone2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(110, 123).addBox(-0.9386F, 1.1038F, 1.8407F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, -0.8371F, -0.3811F, 0.3899F));

		PartDefinition cube_r541 = bone2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(130, 115).addBox(-0.9386F, 2.2118F, -2.4114F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, 0.1228F, -0.3811F, 0.3899F));

		PartDefinition cube_r542 = bone2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(120, 100).addBox(-0.9386F, 0.1181F, -2.9502F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9305F, -2.9159F, 5.3745F, 0.2974F, -0.3811F, 0.3899F));

		PartDefinition cube_r543 = bone2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(97, 97).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6103F, -2.6375F, 6.7736F, 0.0754F, -0.0361F, 0.1708F));

		PartDefinition cube_r544 = bone2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(31, 122).addBox(-0.5F, -2.8F, -2.45F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6563F, -2.5881F, 5.2868F, 0.1453F, -0.0361F, 0.1708F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9814F, 6.5321F, -5.1855F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r545 = bone4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.7872F, 3.8736F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r546 = bone4.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(91, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -11.0309F, 1.8885F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r547 = bone4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-1.0F, -0.8912F, -2.8748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 1.7144F, 0.4188F, 0.0539F));

		PartDefinition cube_r548 = bone4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-1.0F, -0.2803F, 0.9208F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -1.4708F, 0.4188F, 0.0539F));

		PartDefinition cube_r549 = bone4.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(148, 53).mirror().addBox(-0.1386F, 2.5942F, 4.9762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -1.4659F, 0.724F, 0.1017F));

		PartDefinition cube_r550 = bone4.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(119, 121).mirror().addBox(-0.1386F, 4.1013F, 2.6402F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -1.3786F, 0.724F, 0.1017F));

		PartDefinition cube_r551 = bone4.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(82, 133).mirror().addBox(-0.1386F, 5.8853F, -3.8145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -0.5059F, 0.724F, 0.1017F));

		PartDefinition cube_r552 = bone4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(150, 148).mirror().addBox(-0.1386F, 4.7876F, -7.7461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 0.0177F, 0.724F, 0.1017F));

		PartDefinition cube_r553 = bone4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(108, 137).mirror().addBox(-0.1386F, -4.997F, -7.6127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 1.1521F, 0.724F, 0.1017F));

		PartDefinition cube_r554 = bone4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(129, 49).mirror().addBox(-0.1386F, -6.7148F, 0.3741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 2.4611F, 0.724F, 0.1017F));

		PartDefinition cube_r555 = bone4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(52, 144).mirror().addBox(-0.1386F, -0.4007F, 5.1063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -2.3822F, 0.724F, 0.1017F));

		PartDefinition cube_r556 = bone4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.1386F, 4.605F, -1.1891F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, -1.0732F, 0.724F, 0.1017F));

		PartDefinition cube_r557 = bone4.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(57, 122).mirror().addBox(-0.1386F, -0.1642F, -4.7532F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 0.2795F, 0.724F, 0.1017F));

		PartDefinition cube_r558 = bone4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(64, 122).mirror().addBox(-1.0F, -0.2405F, -2.8673F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5186F, -10.9112F, 1.8062F, 0.2745F, 0.4188F, 0.0539F));

		PartDefinition cube_r559 = bone4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(14, 134).mirror().addBox(-0.5F, 0.2F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.5597F, 10.1342F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r560 = bone4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(133, 133).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.5597F, 10.1342F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r561 = bone4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(129, 27).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -8.0747F, 9.277F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r562 = bone4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(139, 34).mirror().addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -4.9882F, 8.5891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r563 = bone4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(142, 82).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.5597F, 10.1342F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r564 = bone4.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(59, 103).mirror().addBox(-0.5F, -0.2F, -1.475F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0246F, -9.5159F, 5.4253F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r565 = bone4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(83, 111).mirror().addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r566 = bone4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(137, 38).mirror().addBox(-0.5259F, -1.0275F, -1.5783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6522F, 0.3855F, 8.9048F, -0.9143F, 0.2544F, -0.4173F));

		PartDefinition cube_r567 = bone4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(125, 59).mirror().addBox(-0.5259F, -1.6701F, -2.9468F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5022F, 0.3855F, 8.9048F, 0.1542F, -0.056F, -0.4664F));

		PartDefinition cube_r568 = bone4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(104, 75).mirror().addBox(-0.5259F, -0.7633F, -0.8818F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6522F, 0.3855F, 8.9048F, -0.4954F, 0.2544F, -0.4173F));

		PartDefinition cube_r569 = bone4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(42, 148).mirror().addBox(-0.0614F, -10.4168F, -1.9761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(82, 139).mirror().addBox(-0.0614F, -10.4168F, -2.6761F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, 2.7408F, 0.3811F, -0.3899F));

		PartDefinition cube_r570 = bone4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(149, 151).mirror().addBox(-0.0614F, -9.258F, 5.4735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -2.7569F, 0.3811F, -0.3899F));

		PartDefinition cube_r571 = bone4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(144, 151).mirror().addBox(-0.0614F, 0.9772F, 10.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -1.7098F, 0.3811F, -0.3899F));

		PartDefinition cube_r572 = bone4.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(65, 144).mirror().addBox(-0.0614F, 7.1324F, 4.2827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -0.7935F, 0.3811F, -0.3899F));

		PartDefinition cube_r573 = bone4.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(5, 139).mirror().addBox(-0.0614F, 5.2733F, 0.0361F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -0.3135F, 0.3811F, -0.3899F));

		PartDefinition cube_r574 = bone4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(129, 10).mirror().addBox(-0.0614F, 2.9056F, 1.6295F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -0.5317F, 0.3811F, -0.3899F));

		PartDefinition cube_r575 = bone4.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(110, 123).mirror().addBox(-0.0614F, 1.1038F, 1.8407F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, -0.8371F, 0.3811F, -0.3899F));

		PartDefinition cube_r576 = bone4.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(130, 115).mirror().addBox(-0.0614F, 2.2118F, -2.4114F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, 0.1228F, 0.3811F, -0.3899F));

		PartDefinition cube_r577 = bone4.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(120, 100).mirror().addBox(-0.0614F, 0.1181F, -2.9502F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9305F, -2.9159F, 5.3745F, 0.2974F, 0.3811F, -0.3899F));

		PartDefinition cube_r578 = bone4.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6103F, -2.6375F, 6.7736F, 0.0754F, 0.0361F, -0.1708F));

		PartDefinition cube_r579 = bone4.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(31, 122).mirror().addBox(-0.5F, -2.8F, -2.45F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6563F, -2.5881F, 5.2868F, 0.1453F, 0.0361F, -0.1708F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 1.9425F, -0.4116F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r580 = leftLeg.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 5.0142F, -9.9018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r581 = leftLeg.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.4F, -7.5F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1F, 2.3578F, -3.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r582 = leftLeg.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(115, 20).addBox(-2.0F, -0.9F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -0.2857F, -1.3343F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r583 = leftLeg.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(109, 111).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 0.7998F, -1.8285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r584 = leftLeg.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(0, 98).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 5.1552F, -13.7922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r585 = leftLeg.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(105, 56).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 6.8662F, -13.0016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r586 = leftLeg.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(121, 84).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.3569F, -11.0513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r587 = leftLeg.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(83, 0).addBox(-1.0F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 3.3237F, -6.0581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r588 = leftLeg.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(69, 45).addBox(-1.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1231F, -2.0337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r589 = leftLeg.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(15, 93).addBox(-2.6F, -1.9615F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0149F, -1.5105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.3786F, -15.1498F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r590 = leftLeg3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(121, 67).addBox(-1.0F, -0.7F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 1.9256F, 0.4139F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r591 = leftLeg3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(128, 72).addBox(-1.0F, -1.375F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -0.2516F, -2.0789F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r592 = leftLeg3.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(129, 22).addBox(-1.0F, -1.05F, -0.725F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, -0.0541F, -1.2322F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r593 = leftLeg3.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(116, 47).addBox(-1.0F, -0.7F, -1.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 0.48F, -0.6632F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r594 = leftLeg3.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(56, 20).addBox(-1.0F, -0.5F, -5.9F, 2.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 1.6357F, -4.5589F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r595 = leftLeg3.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(77, 17).addBox(-1.0F, -1.7F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r596 = leftLeg3.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(23, 43).addBox(-1.0F, -1.025F, -3.85F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r597 = leftLeg3.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(70, 105).addBox(-1.0F, -0.75F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 0.827F, -4.4187F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r598 = leftLeg3.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(30, 134).addBox(-1.0F, -1.2F, -0.675F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1F, 0.7928F, -1.4551F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r599 = leftLeg3.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(87, 139).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, -0.1585F, 0.4358F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r600 = leftLeg3.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(132, 65).addBox(-1.0F, -0.3F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1F, -0.5319F, -0.1647F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r601 = leftLeg3.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(108, 67).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.1F, 0.3076F, -4.1633F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r602 = leftLeg3.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(23, 54).addBox(-1.0F, -1.1F, -5.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1F, 1.479F, -5.0255F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r603 = leftLeg3.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(27, 32).addBox(-1.0F, -0.6F, -5.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.479F, -5.0255F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0245F, 2.0152F, -10.1854F, 0.0992F, -0.0163F, 0.0386F));

		PartDefinition cube_r604 = leftLeg4.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(32, 89).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r605 = leftLeg4.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(86, 53).addBox(-3.0F, -1.415F, -29.0624F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r606 = leftLeg8.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(91, 70).addBox(-3.1915F, -2.5662F, -29.0624F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 1.9425F, -0.4116F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r607 = rightLeg.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(100, 21).addBox(-2.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 5.0142F, -9.9018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r608 = rightLeg.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -0.4F, -7.5F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 2.3578F, -3.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r609 = rightLeg.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(118, 6).addBox(-2.0F, -0.9F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, -0.2857F, -1.3343F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r610 = rightLeg.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(57, 112).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 0.7998F, -1.8285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r611 = rightLeg.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(99, 61).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, 5.1552F, -13.7922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r612 = rightLeg.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(70, 111).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 6.8662F, -13.0016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r613 = rightLeg.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(122, 88).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.3569F, -11.0513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r614 = rightLeg.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 3.3237F, -6.0581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r615 = rightLeg.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(34, 82).addBox(-2.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1231F, -2.0337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r616 = rightLeg.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(94, 15).addBox(-1.4F, -1.9615F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0149F, -1.5105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.3786F, -15.1498F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r617 = rightLeg3.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(121, 79).addBox(-1.0F, -0.7F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.9256F, 0.4139F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r618 = rightLeg3.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(82, 128).addBox(-1.0F, -1.375F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -0.2516F, -2.0789F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r619 = rightLeg3.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(31, 129).addBox(-1.0F, -1.05F, -0.725F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, -0.0541F, -1.2322F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r620 = rightLeg3.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(0, 118).addBox(-1.0F, -0.7F, -1.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.48F, -0.6632F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r621 = rightLeg3.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(44, 63).addBox(-1.0F, -0.5F, -5.9F, 2.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 1.6357F, -4.5589F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r622 = rightLeg3.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(74, 81).addBox(-1.0F, -1.7F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r623 = rightLeg3.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -1.025F, -3.85F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r624 = rightLeg3.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(96, 107).addBox(-1.0F, -0.75F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 0.827F, -4.4187F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r625 = rightLeg3.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(134, 58).addBox(-1.0F, -1.2F, -0.675F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.1F, 0.7928F, -1.4551F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r626 = rightLeg3.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(140, 123).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1F, -0.1585F, 0.4358F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r627 = rightLeg3.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(132, 77).addBox(-1.0F, -0.3F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1F, -0.5319F, -0.1647F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r628 = rightLeg3.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(108, 82).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.1F, 0.3076F, -4.1633F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r629 = rightLeg3.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -1.1F, -5.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, 1.479F, -5.0255F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r630 = rightLeg3.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.6F, -5.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.479F, -5.0255F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 2.0152F, -10.1854F, -0.2499F, 0.0163F, -0.0386F));

		PartDefinition cube_r631 = rightLeg4.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(66, 89).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r632 = rightLeg4.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(49, 89).addBox(-3.0F, -1.415F, -29.0624F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r633 = rightLeg8.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(91, 84).addBox(-2.8085F, -2.5662F, -29.0624F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

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