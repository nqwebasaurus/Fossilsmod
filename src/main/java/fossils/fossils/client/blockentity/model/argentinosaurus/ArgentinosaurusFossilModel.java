package fossils.fossils.client.blockentity.model.argentinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArgentinosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart neckflapmidfront;
	private final ModelPart neckskinmidfront;
	private final ModelPart neck5;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart neckfront;
	private final ModelPart neckflapfront;
	private final ModelPart neckskinfront;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart neckflapmidbase;
	private final ModelPart neckskinmidbase;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart bone3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public ArgentinosaurusFossilModel(ModelPart root) {
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
		this.neckflapmidfront = this.neckmiddlefront.getChild("neckflapmidfront");
		this.neckskinmidfront = this.neckflapmidfront.getChild("neckskinmidfront");
		this.neck5 = this.neckmiddlefront.getChild("neck5");
		this.neck9 = this.neck5.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.neckfront = this.neck10.getChild("neckfront");
		this.neckflapfront = this.neckfront.getChild("neckflapfront");
		this.neckskinfront = this.neckflapfront.getChild("neckskinfront");
		this.neck6 = this.neckfront.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.lowerjawbase = this.head.getChild("lowerjawbase");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.neckflapmidbase = this.neckmiddlebase.getChild("neckflapmidbase");
		this.neckskinmidbase = this.neckflapmidbase.getChild("neckskinmidbase");
		this.leftArm = this.bodyfront.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.bodyfront.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.bone = this.bodyfront.getChild("bone");
		this.bone4 = this.bodyfront.getChild("bone4");
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
		this.bone3 = this.hips.getChild("bone3");
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

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2353F, 13.8649F, -0.3068F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 38).mirror().addBox(-4.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 38).addBox(1.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.0F, -2.007F, 0.1001F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 13).addBox(-0.5F, -5.1043F, -1.9686F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3072F, -4.765F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.0401F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.5F, -4.1F, 11.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.445F, -4.1975F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 50).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, 0.077F, 0.0199F, 1.85F));

		PartDefinition cube_r5 = bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 141).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, 0.061F, 0.1603F, 0.6743F));

		PartDefinition cube_r6 = bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(115, 141).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, -0.0429F, 0.166F, 0.055F));

		PartDefinition cube_r7 = bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 152).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2937F, -0.7299F, -0.1224F, 0.1698F, 0.0417F));

		PartDefinition cube_r8 = bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2937F, -0.7299F, -0.0017F, 0.209F, 0.6628F));

		PartDefinition cube_r9 = bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(154, 37).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.2937F, -0.7299F, 0.0987F, 0.0954F, 1.8512F));

		PartDefinition cube_r10 = bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(154, 37).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2937F, -0.7299F, 0.0987F, -0.0954F, -1.8512F));

		PartDefinition cube_r11 = bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2937F, -0.7299F, -0.0017F, -0.209F, -0.6628F));

		PartDefinition cube_r12 = bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 152).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.2937F, -0.7299F, -0.1224F, -0.1698F, -0.0417F));

		PartDefinition cube_r13 = bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(115, 141).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, -0.0429F, -0.166F, -0.055F));

		PartDefinition cube_r14 = bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 141).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, 0.061F, -0.1603F, -0.6743F));

		PartDefinition cube_r15 = bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(154, 50).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, 0.077F, -0.0199F, -1.85F));

		PartDefinition cube_r16 = bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -0.0629F, 12.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9956F, -18.7642F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 114).addBox(-0.5F, -5.7F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8952F, 0.088F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(106, 112).addBox(-0.5F, -5.5707F, -0.1173F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7028F, -4.7293F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body = bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0339F, -5.9274F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(67, 20).addBox(-1.0F, -0.0629F, 4.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.6928F, -10.735F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, -0.0215F, 0.124F, 0.1922F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(32, 140).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, 0.0538F, 0.1138F, 0.8074F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, 0.0314F, 0.0086F, 1.9834F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(142, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, -0.0107F, -0.0873F, 1.9851F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 141).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, 0.1262F, 0.0379F, 0.8129F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(98, 124).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, 0.0818F, 0.1034F, 0.2039F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 124).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, 0.0818F, -0.1034F, -0.2039F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(29, 141).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, 0.1262F, -0.0379F, -0.8129F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(142, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, -0.0107F, 0.0873F, -1.9851F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, 0.0314F, -0.0086F, -1.9834F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 140).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, 0.0538F, -0.1138F, -0.8074F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(101, 124).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, -0.0215F, -0.124F, -0.1922F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(114, 6).addBox(-0.5F, -5.791F, -0.0071F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8303F, -1.803F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -5.818F, -1.8801F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7961F, -2.9351F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0376F, -5.8204F, 0.171F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, 0.0119F, 0.111F, 0.1442F));

		PartDefinition cube_r35 = bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 141).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, 0.0735F, 0.0841F, 0.7575F));

		PartDefinition cube_r36 = bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(101, 134).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, 0.0115F, -0.021F, 1.9317F));

		PartDefinition cube_r37 = bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(95, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, 0.0285F, 0.104F, 0.1467F));

		PartDefinition cube_r38 = bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, 0.083F, 0.0689F, 0.7589F));

		PartDefinition cube_r39 = bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(100, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, 0.0011F, -0.0356F, 1.9327F));

		PartDefinition cube_r40 = bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(41, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, 0.0935F, 0.0942F, 0.1531F));

		PartDefinition cube_r41 = bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(35, 140).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, 0.1305F, 0.0238F, 0.7611F));

		PartDefinition cube_r42 = bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, -0.0221F, -0.0968F, 1.9342F));

		PartDefinition cube_r43 = bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(95, 64).mirror().addBox(-7.2F, 0.0F, -0.8F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.6259F, -6.1272F, -0.2585F, 0.1436F, 0.2446F));

		PartDefinition cube_r44 = bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 35).mirror().addBox(-8.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6031F, 12.8401F, -5.5699F, -0.2831F, 0.1834F, 0.1365F));

		PartDefinition cube_r45 = bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-8.3F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5483F, 12.8203F, -5.6187F, -0.3843F, 0.3352F, 0.0716F));

		PartDefinition cube_r46 = bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 29).mirror().addBox(-9.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 12.8013F, -5.6772F, -0.2971F, 0.4789F, 0.0154F));

		PartDefinition cube_r47 = bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(46, 33).mirror().addBox(-9.9F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 12.8013F, -5.6772F, -0.3219F, 0.6613F, -0.0213F));

		PartDefinition cube_r48 = bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 33).addBox(-1.1F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 12.8013F, -5.6772F, -0.3219F, -0.6613F, 0.0213F));

		PartDefinition cube_r49 = bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 29).addBox(-1.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 12.8013F, -5.6772F, -0.2971F, -0.4789F, -0.0154F));

		PartDefinition cube_r50 = bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 31).addBox(-0.7F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5483F, 12.8203F, -5.6187F, -0.3843F, -0.3352F, -0.0716F));

		PartDefinition cube_r51 = bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(46, 35).addBox(0.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6031F, 12.8401F, -5.5699F, -0.2831F, -0.1834F, -0.1365F));

		PartDefinition cube_r52 = bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(95, 64).addBox(0.2F, 0.0F, -0.8F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.6259F, -6.1272F, -0.2585F, -0.1436F, -0.2446F));

		PartDefinition cube_r53 = bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(17, 71).addBox(-1.0F, -1.5749F, 5.9699F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7111F, -11.8942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(127, 127).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5644F, -2.2693F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(122, 127).addBox(-0.5F, -5.9257F, -0.3923F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1137F, -0.4313F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 125).addBox(-0.5F, -6.3F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0068F, -4.6303F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, -0.0221F, 0.0968F, -1.9342F));

		PartDefinition cube_r58 = bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 140).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, 0.1305F, -0.0238F, -0.7611F));

		PartDefinition cube_r59 = bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(41, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, 0.0935F, -0.0942F, -0.1531F));

		PartDefinition cube_r60 = bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(100, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, 0.0011F, 0.0356F, -1.9327F));

		PartDefinition cube_r61 = bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, 0.083F, -0.0689F, -0.7589F));

		PartDefinition cube_r62 = bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, 0.0285F, -0.104F, -0.1467F));

		PartDefinition cube_r63 = bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(101, 134).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, 0.0115F, 0.021F, -1.9317F));

		PartDefinition cube_r64 = bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(68, 141).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, 0.0735F, -0.0841F, -0.7575F));

		PartDefinition cube_r65 = bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(38, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, 0.0119F, -0.111F, -0.1442F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1664F, -5.8252F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(43, 141).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, 0.1048F, 0.0411F, 0.7434F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(145, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, -0.0161F, -0.0664F, 1.9168F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2092F, -2.5006F, 0.1558F, -0.0196F, 0.6929F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(83, 132).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2092F, -2.5006F, -0.0526F, -0.1369F, 1.8695F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(79, 138).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, 0.1768F, -0.063F, 0.6071F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, -0.0851F, -0.1728F, 1.7896F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 118).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, 0.0624F, 0.0938F, 0.1333F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(83, 121).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2092F, -2.5006F, 0.1392F, 0.073F, 0.0887F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 102).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, 0.1811F, 0.0492F, 0.0063F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 102).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, 0.1811F, -0.0492F, -0.0063F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 121).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2092F, -2.5006F, 0.1392F, -0.073F, -0.0887F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(92, 118).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, 0.0624F, -0.0938F, -0.1333F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 84).addBox(-3.2735F, -0.0793F, -3.5022F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 13.8244F, -2.6027F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 12).addBox(-3.7735F, 1.1202F, -6.964F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 13.8244F, -2.6027F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(65, 41).addBox(-1.0F, -1.5749F, -0.0301F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4552F, -6.069F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(87, 118).addBox(-0.5F, -6.8F, -0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1929F, -0.7763F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(59, 95).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, -0.0851F, 0.1728F, -1.7896F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(79, 138).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, 0.1768F, 0.063F, -0.6071F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(83, 132).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2092F, -2.5006F, -0.0526F, 0.1369F, -1.8695F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 139).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2092F, -2.5006F, 0.1558F, 0.0196F, -0.6929F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(145, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, -0.0161F, 0.0664F, -1.9168F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(43, 141).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, 0.1048F, -0.0411F, -0.7434F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(105, 122).addBox(-0.5F, -6.7F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5454F, -2.7475F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(45, 86).addBox(-0.5F, -6.1257F, -0.5423F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0769F, -4.2749F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neckbase = chest.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1994F, -6.0205F, -0.2436F, 0.0F, 0.0F));

		PartDefinition cube_r90 = neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(135, 144).mirror().addBox(-1.0219F, -2.6851F, -0.4926F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(148, 150).mirror().addBox(-1.0219F, -2.9851F, -0.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3921F, 2.4044F, -1.5252F, 1.118F, -0.1743F, 0.2215F));

		PartDefinition cube_r91 = neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(132, 93).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3015F, 1.0462F, -2.9963F, 1.3652F, -0.4509F, -0.4422F));

		PartDefinition cube_r92 = neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(139, 89).mirror().addBox(-0.2846F, -2.6944F, -0.1806F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3921F, 2.4044F, -1.5252F, 1.6342F, -0.4416F, -1.4087F));

		PartDefinition cube_r93 = neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(130, 81).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5036F, -1.0317F, -1.3243F, 1.6044F, 0.0043F, 0.6121F));

		PartDefinition cube_r94 = neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(101, 145).mirror().addBox(-1.0219F, -0.2258F, -0.4728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(138, 150).mirror().addBox(-1.0219F, 2.2742F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3921F, 2.4044F, -1.5252F, 0.6817F, -0.1743F, 0.2215F));

		PartDefinition cube_r95 = neckbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(32, 148).mirror().addBox(-1.0219F, -2.455F, -0.7112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3921F, 2.4044F, -1.5252F, 0.7689F, -0.1743F, 0.2215F));

		PartDefinition cube_r96 = neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(143, 150).mirror().addBox(-1.0219F, -1.8218F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(150, 145).mirror().addBox(-1.0219F, -2.4218F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3921F, 2.4044F, -1.5252F, 0.2017F, -0.1743F, 0.2215F));

		PartDefinition cube_r97 = neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(139, 89).addBox(-2.7154F, -2.6944F, -0.1806F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3921F, 2.4044F, -1.5252F, 1.6342F, 0.4416F, 1.4087F));

		PartDefinition cube_r98 = neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(132, 93).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3015F, 1.0462F, -2.9963F, 1.3652F, 0.4509F, 0.4422F));

		PartDefinition cube_r99 = neckbase.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(138, 150).addBox(0.0219F, 2.2742F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(101, 145).addBox(0.0219F, -0.2258F, -0.4728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3921F, 2.4044F, -1.5252F, 0.6817F, 0.1743F, -0.2215F));

		PartDefinition cube_r100 = neckbase.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(150, 145).addBox(0.0219F, -2.4218F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(143, 150).addBox(0.0219F, -1.8218F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3921F, 2.4044F, -1.5252F, 0.2017F, 0.1743F, -0.2215F));

		PartDefinition cube_r101 = neckbase.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(32, 148).addBox(0.0219F, -2.455F, -0.7112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3921F, 2.4044F, -1.5252F, 0.7689F, 0.1743F, -0.2215F));

		PartDefinition cube_r102 = neckbase.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(148, 150).addBox(0.0219F, -2.9851F, -0.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(135, 144).addBox(0.0219F, -2.6851F, -0.4926F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3921F, 2.4044F, -1.5252F, 1.118F, 0.1743F, -0.2215F));

		PartDefinition cube_r103 = neckbase.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(130, 81).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5036F, -1.0317F, -1.3243F, 1.6044F, -0.0043F, -0.6121F));

		PartDefinition cube_r104 = neckbase.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -1.0F, 6.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2504F, -10.7942F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r105 = neckbase.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(80, 129).addBox(0.0F, -6.1F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -1.9633F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.042F, -3.8657F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 99).addBox(-1.0F, -1.0F, 3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8768F, -7.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 115).addBox(0.0F, -5.4F, -1.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -1.5F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(132, 134).mirror().addBox(-0.3F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, 0.4212F, -2.6421F, 1.7216F, -0.2322F, -0.6583F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(38, 138).mirror().addBox(-2.2F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -1.5798F, -2.6494F, 1.6672F, -0.0546F, -1.4438F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 134).mirror().addBox(-0.2525F, -0.5192F, -0.2173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.645F, 0.7873F, -3.6093F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(12, 132).mirror().addBox(-0.1885F, -1.3085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.9197F, -1.8391F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(106, 145).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.1162F, 0.2853F, 0.6629F, 1.3851F, -0.1589F, -0.0722F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(149, 37).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4847F, 0.7932F, 3.186F, 1.1669F, -0.1589F, -0.0722F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(12, 132).addBox(-0.8115F, -1.3085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.9197F, -1.8391F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(149, 37).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4847F, 0.7932F, 3.186F, 1.1669F, 0.1589F, 0.0722F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(106, 145).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.1162F, 0.2853F, 0.6629F, 1.3851F, 0.1589F, 0.0722F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(69, 134).addBox(-0.7475F, -0.5192F, -0.2173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.645F, 0.7873F, -3.6093F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(38, 138).addBox(-0.8F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -1.5798F, -2.6494F, 1.6672F, 0.0546F, 1.4438F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(132, 134).addBox(-2.7F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3754F, 0.4212F, -2.6421F, 1.7216F, 0.2322F, 0.6583F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, 0.0524F, -0.0436F, -0.0023F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(99, 18).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7768F, -3.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.1885F, -2.2085F, -0.3032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.7197F, -1.3391F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(133, 41).mirror().addBox(-0.475F, -0.4F, -0.725F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6472F, 0.5605F, -2.4627F, 1.6667F, -0.0555F, -1.4351F));

		PartDefinition cube_r123 = neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(28, 124).mirror().addBox(-0.3877F, -1.8989F, -0.847F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5909F, 0.7328F, -2.4256F, 1.5498F, -0.165F, -0.0566F));

		PartDefinition cube_r124 = neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(140, 145).mirror().addBox(-0.3877F, 4.5747F, -1.4812F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5909F, 0.7328F, -2.4256F, 1.6807F, -0.165F, -0.0566F));

		PartDefinition cube_r125 = neck2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(43, 149).mirror().addBox(-0.3877F, 6.963F, 1.0822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5909F, 0.7328F, -2.4256F, 1.3317F, -0.165F, -0.0566F));

		PartDefinition cube_r126 = neck2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(43, 149).addBox(-0.6123F, 6.963F, 1.0822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5909F, 0.7328F, -2.4256F, 1.3317F, 0.165F, 0.0566F));

		PartDefinition cube_r127 = neck2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(140, 145).addBox(-0.6123F, 4.5747F, -1.4812F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5909F, 0.7328F, -2.4256F, 1.6807F, 0.165F, 0.0566F));

		PartDefinition cube_r128 = neck2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(28, 124).addBox(-0.6123F, -1.8989F, -0.847F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5909F, 0.7328F, -2.4256F, 1.5498F, 0.165F, 0.0566F));

		PartDefinition cube_r129 = neck2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(133, 41).addBox(-2.525F, -0.4F, -0.725F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6472F, 0.5605F, -2.4627F, 1.6667F, 0.0555F, 1.4351F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 124).addBox(-0.8115F, -2.2085F, -0.3032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.7197F, -1.3391F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(117, 123).addBox(0.0F, -4.5F, -1.7F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neck2.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(97, 39).addBox(-1.0F, -1.9461F, -4.0082F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.204F, -4.0607F, 0.1007F, -0.0436F, -0.0006F));

		PartDefinition cube_r132 = neckmiddlebase.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(7, 116).addBox(0.0F, -4.2F, -1.7F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3379F, -1.5502F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r133 = neckmiddlebase.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(38, 147).mirror().addBox(0.2917F, -2.3814F, -0.8119F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1437F, 0.4034F, -3.3519F, 1.5245F, -0.1601F, -0.0694F));

		PartDefinition cube_r134 = neckmiddlebase.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-2.1F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -1.403F, -2.4048F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r135 = neckmiddlebase.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(53, 126).mirror().addBox(-0.1885F, -2.8085F, -0.7032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.8428F, -1.1945F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r136 = neckmiddlebase.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(145, 145).mirror().addBox(0.2917F, 0.2143F, -0.7391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.1437F, 0.4034F, -3.3519F, 1.35F, -0.1601F, -0.0694F));

		PartDefinition cube_r137 = neckmiddlebase.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(146, 7).mirror().addBox(0.2917F, 2.6262F, -1.3787F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1437F, 0.4034F, -3.3519F, 1.5682F, -0.1601F, -0.0694F));

		PartDefinition cube_r138 = neckmiddlebase.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(128, 36).mirror().addBox(0.2917F, 5.0259F, -2.0769F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.1437F, 0.4034F, -3.3519F, 1.6991F, -0.1601F, -0.0694F));

		PartDefinition cube_r139 = neckmiddlebase.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(53, 126).addBox(-0.8115F, -2.8085F, -0.7032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.8428F, -1.1945F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r140 = neckmiddlebase.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(140, 0).addBox(-0.9F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -1.403F, -2.4048F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r141 = neckmiddlebase.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(128, 36).addBox(-1.2917F, 5.0259F, -2.0769F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.1437F, 0.4034F, -3.3519F, 1.6991F, 0.1601F, 0.0694F));

		PartDefinition cube_r142 = neckmiddlebase.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(146, 7).addBox(-1.2917F, 2.6262F, -1.3787F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1437F, 0.4034F, -3.3519F, 1.5682F, 0.1601F, 0.0694F));

		PartDefinition cube_r143 = neckmiddlebase.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(145, 145).addBox(-1.2917F, 0.2143F, -0.7391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.1437F, 0.4034F, -3.3519F, 1.35F, 0.1601F, 0.0694F));

		PartDefinition cube_r144 = neckmiddlebase.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(38, 147).addBox(-1.2917F, -2.3814F, -0.8119F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1437F, 0.4034F, -3.3519F, 1.5245F, 0.1601F, 0.0694F));

		PartDefinition neck3 = neckmiddlebase.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(98, 115).addBox(-0.0152F, -5.5522F, -3.675F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(82, 49).addBox(-1.0152F, -1.6032F, -4.8137F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, -0.3428F, -4.1945F, -0.0262F, -0.0435F, 0.003F));

		PartDefinition cube_r145 = neck3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(110, 123).mirror().addBox(-0.1885F, -2.4085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -2.0F, -1.8F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r146 = neck3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(23, 138).mirror().addBox(-2.425F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2304F, -1.3602F, -4.1103F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(128, 144).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 0.5694F, -4.1231F, 1.7433F, -0.2167F, -0.7555F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 133).mirror().addBox(-0.4708F, -2.1304F, -0.8586F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5427F, 0.6064F, -4.0019F, 1.4109F, -0.1613F, -0.0666F));

		PartDefinition cube_r149 = neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(38, 130).mirror().addBox(-0.4708F, 2.3147F, -1.3122F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5427F, 0.6064F, -4.0019F, 1.5854F, -0.1613F, -0.0666F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(104, 131).mirror().addBox(-0.4708F, 7.4816F, -3.0422F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5427F, 0.6064F, -4.0019F, 1.8036F, -0.1613F, -0.0666F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(104, 131).addBox(-0.5292F, 7.4816F, -3.0422F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5123F, 0.6064F, -4.0019F, 1.8036F, 0.1613F, 0.0666F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(38, 130).addBox(-0.5292F, 2.3147F, -1.3122F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5123F, 0.6064F, -4.0019F, 1.5854F, 0.1613F, 0.0666F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(64, 133).addBox(-0.5292F, -2.1304F, -0.8586F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5123F, 0.6064F, -4.0019F, 1.4109F, 0.1613F, 0.0666F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(128, 144).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.701F, 0.5694F, -4.1231F, 1.7433F, 0.2167F, 0.7555F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(23, 138).addBox(-0.575F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1999F, -1.3602F, -4.1103F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(110, 123).addBox(-0.8115F, -2.4085F, -1.0032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -1.8F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(82, 41).addBox(-1.201F, -1.6646F, -5.031F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(121, 10).addBox(-0.201F, -4.7984F, -3.3362F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1858F, 0.0177F, -4.7818F, 0.0349F, -0.0436F, 0.0004F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(77, 109).mirror().addBox(-0.2168F, -1.8713F, -0.7214F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8929F, 0.6535F, -4.3322F, 1.4633F, -0.1613F, -0.0666F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(3, 141).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9044F, 0.5299F, -4.4228F, 1.5186F, -0.1505F, 0.1926F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(141, 3).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 0.8662F, -4.3326F, 1.4458F, -0.0989F, 0.7621F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(53, 118).mirror().addBox(-0.1885F, -3.1085F, -0.2032F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2162F, -1.5613F, -1.5173F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(110, 130).mirror().addBox(-0.2168F, 7.4836F, -2.2247F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8929F, 0.6535F, -4.3322F, 1.6553F, -0.1613F, -0.0666F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(53, 118).addBox(-0.8115F, -3.1085F, -0.2032F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8142F, -1.5613F, -1.5173F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(141, 3).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.887F, 0.8662F, -4.3326F, 1.4458F, 0.0989F, -0.7621F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(3, 141).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5024F, 0.5299F, -4.4228F, 1.5186F, 0.1505F, -0.1926F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(110, 130).addBox(-0.7832F, 7.4836F, -2.2247F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4909F, 0.6535F, -4.3322F, 1.6553F, 0.1613F, 0.0666F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(77, 109).addBox(-0.7832F, -1.8713F, -0.7214F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4909F, 0.6535F, -4.3322F, 1.4633F, 0.1613F, 0.0666F));

		PartDefinition neckmiddlefront = neck4.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(57, 69).addBox(-1.0F, -1.9454F, -5.913F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, 0.2958F, -5.1043F, -0.1598F, -0.0431F, 0.0069F));

		PartDefinition cube_r167 = neckmiddlefront.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 133).mirror().addBox(-0.1885F, -2.2085F, -0.0032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.9422F, -2.1992F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r168 = neckmiddlefront.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(139, 86).mirror().addBox(-1.47F, -0.3769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.5422F, -3.9992F, 1.6592F, -0.058F, -1.3125F));

		PartDefinition cube_r169 = neckmiddlefront.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 129).mirror().addBox(-0.2872F, -2.0579F, -0.6752F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 0.7191F, -3.8819F, 1.5288F, -0.161F, -0.0673F));

		PartDefinition cube_r170 = neckmiddlefront.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(147, 34).mirror().addBox(-1.2F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0229F, -0.4344F, -3.2563F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r171 = neckmiddlefront.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(82, 109).mirror().addBox(-0.2872F, 3.4643F, -1.0957F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 0.7191F, -3.8819F, 1.6422F, -0.161F, -0.0673F));

		PartDefinition cube_r172 = neckmiddlefront.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(35, 152).mirror().addBox(-0.2872F, 12.7072F, -3.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 152).mirror().addBox(-0.2872F, 13.3072F, -3.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 0.7191F, -3.8819F, 1.8167F, -0.161F, -0.0673F));

		PartDefinition cube_r173 = neckmiddlefront.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(147, 34).addBox(-0.8F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0229F, -0.4344F, -3.2563F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r174 = neckmiddlefront.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(61, 152).addBox(-0.7128F, 13.3072F, -3.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 152).addBox(-0.7128F, 12.7072F, -3.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 0.7191F, -3.8819F, 1.8167F, 0.161F, 0.0673F));

		PartDefinition cube_r175 = neckmiddlefront.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(82, 109).addBox(-0.7128F, 3.4643F, -1.0957F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.701F, 0.7191F, -3.8819F, 1.6422F, 0.161F, 0.0673F));

		PartDefinition cube_r176 = neckmiddlefront.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 129).addBox(-0.7128F, -2.0579F, -0.6752F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 0.7191F, -3.8819F, 1.5288F, 0.161F, 0.0673F));

		PartDefinition cube_r177 = neckmiddlefront.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(139, 86).addBox(-1.53F, -0.3769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3152F, -0.5422F, -3.9992F, 1.6592F, 0.058F, 1.3125F));

		PartDefinition cube_r178 = neckmiddlefront.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 133).addBox(-0.8115F, -2.2085F, -0.0032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.9422F, -2.1992F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r179 = neckmiddlefront.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(110, 38).addBox(0.0F, -1.9F, -2.1F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5944F, -2.0743F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neckflapmidfront = neckmiddlefront.addOrReplaceChild("neckflapmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -1.3454F, -5.913F, -0.2335F, 0.0F, 0.0F));

		PartDefinition neckskinmidfront = neckflapmidfront.addOrReplaceChild("neckskinmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.5F, -0.0424F, 0.0F, 0.0F));

		PartDefinition neck5 = neckmiddlefront.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(40, 69).addBox(-1.0152F, -0.1032F, -6.0137F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, -1.8293F, -5.792F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(132, 87).addBox(0.0F, -1.175F, -1.4F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -0.9522F, -2.475F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-0.1885F, -3.5085F, -0.4032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -0.3F, -2.6F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r182 = neck5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(14, 138).mirror().addBox(-1.181F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3304F, 1.6F, -5.7F, 1.6444F, 0.1153F, -1.2984F));

		PartDefinition cube_r183 = neck5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(33, 124).mirror().addBox(-0.1698F, -0.5274F, -0.8135F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9074F, 2.3815F, -5.3509F, 1.4697F, -0.1265F, -0.0663F));

		PartDefinition cube_r184 = neck5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(20, 147).mirror().addBox(-0.8F, -2.6F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0381F, 1.2078F, -3.1571F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r185 = neck5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(48, 149).mirror().addBox(-0.1698F, -2.0755F, -0.8141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9074F, 2.3815F, -5.3509F, 1.5569F, -0.1265F, -0.0663F));

		PartDefinition cube_r186 = neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(96, 135).mirror().addBox(-0.1698F, 5.9389F, -1.627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9074F, 2.3815F, -5.3509F, 1.6006F, -0.1265F, -0.0663F));

		PartDefinition cube_r187 = neck5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(128, 55).mirror().addBox(-0.1698F, 10.3736F, -2.5575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9074F, 2.3815F, -5.3509F, 1.6878F, -0.1265F, -0.0663F));

		PartDefinition cube_r188 = neck5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 147).addBox(-1.2F, -2.6F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0076F, 1.2078F, -3.1571F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r189 = neck5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(48, 149).addBox(-0.8302F, -2.0755F, -0.8141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.877F, 2.3815F, -5.3509F, 1.5569F, 0.1265F, 0.0663F));

		PartDefinition cube_r190 = neck5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(128, 55).addBox(-0.8302F, 10.3736F, -2.5575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.877F, 2.3815F, -5.3509F, 1.6878F, 0.1265F, 0.0663F));

		PartDefinition cube_r191 = neck5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(96, 135).addBox(-0.8302F, 5.9389F, -1.627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.877F, 2.3815F, -5.3509F, 1.6006F, 0.1265F, 0.0663F));

		PartDefinition cube_r192 = neck5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(33, 124).addBox(-0.8302F, -0.5274F, -0.8135F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.877F, 2.3815F, -5.3509F, 1.4697F, 0.1265F, 0.0663F));

		PartDefinition cube_r193 = neck5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(14, 138).addBox(-1.819F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, 1.6F, -5.7F, 1.6444F, -0.1153F, 1.2984F));

		PartDefinition cube_r194 = neck5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 131).addBox(-0.8115F, -3.5085F, -0.4032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.6F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neck9 = neck5.addOrReplaceChild("neck9", CubeListBuilder.create().texOffs(44, 38).addBox(-1.0152F, -0.1032F, -8.0137F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0961F, -0.0434F, -0.0042F));

		PartDefinition cube_r195 = neck9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(112, 89).addBox(0.0F, -1.775F, -3.6F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -0.9522F, -2.475F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 124).mirror().addBox(-0.1885F, -5.8085F, -0.0032F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -0.3F, -2.6F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r197 = neck9.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(101, 138).mirror().addBox(-1.181F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3304F, 1.6F, -6.8F, 1.6444F, 0.1153F, -1.2984F));

		PartDefinition cube_r198 = neck9.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(65, 124).mirror().addBox(-0.3667F, -2.4711F, -0.8063F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7074F, 2.3815F, -6.4509F, 1.426F, -0.1265F, -0.0663F));

		PartDefinition cube_r199 = neck9.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(147, 51).mirror().addBox(-0.8F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0381F, 1.7078F, -6.0571F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r200 = neck9.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(-0.3667F, 4.1051F, -0.957F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7074F, 2.3815F, -6.4509F, 1.4609F, -0.1265F, -0.0663F));

		PartDefinition cube_r201 = neck9.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(147, 51).addBox(-1.2F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0076F, 1.7078F, -6.0571F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r202 = neck9.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(54, 95).addBox(-0.6333F, 4.1051F, -0.957F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.677F, 2.3815F, -6.4509F, 1.4609F, 0.1265F, 0.0663F));

		PartDefinition cube_r203 = neck9.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(65, 124).addBox(-0.6333F, -2.4711F, -0.8063F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.677F, 2.3815F, -6.4509F, 1.426F, 0.1265F, 0.0663F));

		PartDefinition cube_r204 = neck9.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(101, 138).addBox(-1.819F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, 1.6F, -6.8F, 1.6444F, -0.1153F, 1.2984F));

		PartDefinition cube_r205 = neck9.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 124).addBox(-0.8115F, -5.8085F, -0.0032F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.6F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create().texOffs(44, 11).addBox(-1.0152F, -0.1032F, -8.0137F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r206 = neck10.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(13, 99).addBox(0.0F, -1.775F, -3.6F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -0.9522F, -2.475F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck10.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(21, 130).mirror().addBox(-0.1885F, -4.2085F, -0.0032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -0.3F, -2.6F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r208 = neck10.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(110, 138).mirror().addBox(-1.181F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3304F, 1.4F, -5.6F, 1.6444F, 0.1153F, -1.2984F));

		PartDefinition cube_r209 = neck10.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(135, 62).mirror().addBox(-0.4597F, -2.3135F, -0.7321F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6074F, 2.4815F, -5.1509F, 1.5308F, -0.1253F, -0.0691F));

		PartDefinition cube_r210 = neck10.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(147, 60).mirror().addBox(-0.8F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0381F, 1.5078F, -4.8571F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r211 = neck10.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 136).mirror().addBox(-0.4597F, 2.2685F, -0.4941F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.6074F, 2.4815F, -5.1509F, 1.4348F, -0.1253F, -0.0691F));

		PartDefinition cube_r212 = neck10.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(-0.4597F, 6.8367F, -0.0632F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6074F, 2.4815F, -5.1509F, 1.3737F, -0.1253F, -0.0691F));

		PartDefinition cube_r213 = neck10.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(147, 60).addBox(-1.2F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0076F, 1.5078F, -4.8571F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r214 = neck10.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(72, 102).addBox(-0.5403F, 6.8367F, -0.0632F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.577F, 2.4815F, -5.1509F, 1.3737F, 0.1253F, 0.0691F));

		PartDefinition cube_r215 = neck10.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(83, 136).addBox(-0.5403F, 2.2685F, -0.4941F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.577F, 2.4815F, -5.1509F, 1.4348F, 0.1253F, 0.0691F));

		PartDefinition cube_r216 = neck10.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(135, 62).addBox(-0.5403F, -2.3135F, -0.7321F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.577F, 2.4815F, -5.1509F, 1.5308F, 0.1253F, 0.0691F));

		PartDefinition cube_r217 = neck10.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(110, 138).addBox(-1.819F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, 1.4F, -5.6F, 1.6444F, -0.1153F, 1.2984F));

		PartDefinition cube_r218 = neck10.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(21, 130).addBox(-0.8115F, -4.2085F, -0.0032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.6F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neckfront = neck10.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(65, 50).addBox(-0.5F, -0.0212F, -6.9931F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(51, 143).addBox(0.0F, -2.1271F, -3.2831F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, 0.1307F, -7.9378F, 0.1289F, -0.0433F, -0.0056F));

		PartDefinition cube_r219 = neckfront.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(151, 134).mirror().addBox(-0.625F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5229F, 1.4364F, -4.8345F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r220 = neckfront.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(101, 101).mirror().addBox(-0.4226F, -2.6892F, -0.7549F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1188F, 2.0457F, -4.1654F, 1.4259F, -0.1593F, -0.0607F));

		PartDefinition cube_r221 = neckfront.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(144, 96).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7395F, 1.3003F, -4.3736F, 1.662F, -0.0186F, -1.3615F));

		PartDefinition cube_r222 = neckfront.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(86, 128).mirror().addBox(-0.434F, -3.2078F, -0.1756F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.2714F, -3.1774F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r223 = neckfront.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(56, 143).mirror().addBox(-0.4226F, 8.8722F, 0.039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1188F, 2.0457F, -4.1654F, 1.3386F, -0.1593F, -0.0607F));

		PartDefinition cube_r224 = neckfront.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 130).mirror().addBox(-0.4226F, 12.3509F, 1.1403F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1188F, 2.0457F, -4.1654F, 1.2513F, -0.1593F, -0.0607F));

		PartDefinition cube_r225 = neckfront.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(86, 128).addBox(-0.566F, -3.2078F, -0.1756F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.2714F, -3.1774F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r226 = neckfront.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(144, 96).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.7395F, 1.3003F, -4.3736F, 1.662F, 0.0186F, 1.3615F));

		PartDefinition cube_r227 = neckfront.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 130).addBox(-0.5774F, 12.3509F, 1.1403F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1188F, 2.0457F, -4.1654F, 1.2513F, 0.1593F, 0.0607F));

		PartDefinition cube_r228 = neckfront.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(56, 143).addBox(-0.5774F, 8.8722F, 0.039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1188F, 2.0457F, -4.1654F, 1.3386F, 0.1593F, 0.0607F));

		PartDefinition cube_r229 = neckfront.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(101, 101).addBox(-0.5774F, -2.6892F, -0.7549F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1188F, 2.0457F, -4.1654F, 1.4259F, 0.1593F, 0.0607F));

		PartDefinition cube_r230 = neckfront.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(151, 134).addBox(-0.375F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5229F, 1.4364F, -4.8345F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition neckflapfront = neckfront.addOrReplaceChild("neckflapfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5788F, -7.2931F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinfront = neckflapfront.addOrReplaceChild("neckskinfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.0848F, 0.0F, 0.0F));

		PartDefinition neck6 = neckfront.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0399F, -6.9624F, 0.1169F, -0.0333F, -0.0917F));

		PartDefinition cube_r231 = neck6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(74, 137).mirror().addBox(-0.1571F, -1.6954F, -0.6812F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3151F, 1.3871F, -3.982F, 1.4052F, -0.1381F, -0.0769F));

		PartDefinition cube_r232 = neck6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(147, 66).mirror().addBox(-1.342F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5501F, 0.4074F, -4.0691F, 1.6321F, 0.0624F, -1.1907F));

		PartDefinition cube_r233 = neck6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(151, 131).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5393F, 1.4554F, -4.1865F, 1.6315F, 0.0499F, -0.6879F));

		PartDefinition cube_r234 = neck6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(-0.8F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2752F, 0.1144F, -2.8013F, 1.6909F, 0.0258F, -0.6117F));

		PartDefinition cube_r235 = neck6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(24, 99).mirror().addBox(-0.1571F, 2.8824F, -0.4111F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3151F, 1.3871F, -3.982F, 1.3179F, -0.1381F, -0.0769F));

		PartDefinition cube_r236 = neck6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(68, 78).addBox(-0.2F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2752F, 0.1144F, -2.8013F, 1.6909F, -0.0258F, 0.6117F));

		PartDefinition cube_r237 = neck6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(151, 131).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5393F, 1.4554F, -4.1865F, 1.6315F, -0.0499F, 0.6879F));

		PartDefinition cube_r238 = neck6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(79, 147).addBox(-0.5501F, -2.0063F, 0.4629F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5501F, 0.4074F, -2.9691F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(147, 66).addBox(-0.658F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5501F, 0.4074F, -4.0691F, 1.6321F, -0.0624F, 1.1907F));

		PartDefinition cube_r240 = neck6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(24, 99).addBox(-0.8429F, 2.8824F, -0.4111F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3151F, 1.3871F, -3.982F, 1.3179F, 0.1381F, 0.0769F));

		PartDefinition cube_r241 = neck6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(74, 137).addBox(-0.8429F, -1.6954F, -0.6812F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3151F, 1.3871F, -3.982F, 1.4052F, 0.1381F, 0.0769F));

		PartDefinition cube_r242 = neck6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, 0.3965F, -5.0765F, 0.0899F, -0.1586F, -0.2299F));

		PartDefinition cube_r243 = neck7.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(128, 10).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0282F, 0.0963F, 4.1032F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck7.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(154, 108).addBox(-0.9282F, -1.3885F, -0.5749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4F, -1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck7.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(132, 153).mirror().addBox(-0.2826F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.5F, -2.3F, 1.7688F, 0.0329F, -0.1625F));

		PartDefinition cube_r246 = neck7.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(84, 147).mirror().addBox(-0.5446F, -0.5931F, -0.7333F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 1.0F, -2.6F, 1.6676F, -0.1279F, -0.0911F));

		PartDefinition cube_r247 = neck7.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(153, 93).mirror().addBox(-0.5514F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.5F, -2.3F, 1.678F, 0.1758F, -1.1852F));

		PartDefinition cube_r248 = neck7.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(147, 114).mirror().addBox(-0.1344F, -1.9955F, 0.1136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.4F, -1.2F, 1.704F, -0.0957F, 0.6056F));

		PartDefinition cube_r249 = neck7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 128).mirror().addBox(-0.5446F, 1.8717F, -0.0365F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 1.0F, -2.6F, 1.3447F, -0.1279F, -0.0911F));

		PartDefinition cube_r250 = neck7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(147, 114).addBox(-0.8656F, -1.9955F, 0.1136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4F, -1.2F, 1.704F, 0.0957F, -0.6056F));

		PartDefinition cube_r251 = neck7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(153, 93).addBox(-0.4486F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9F, 0.5F, -2.3F, 1.678F, -0.1758F, 1.1852F));

		PartDefinition cube_r252 = neck7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(7, 128).addBox(-0.4554F, 1.8717F, -0.0365F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 1.0F, -2.6F, 1.3447F, 0.1279F, 0.0911F));

		PartDefinition cube_r253 = neck7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(84, 147).addBox(-0.4554F, -0.5931F, -0.7333F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 1.0F, -2.6F, 1.6676F, 0.1279F, 0.0911F));

		PartDefinition cube_r254 = neck7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(132, 153).addBox(-0.7174F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.5F, -2.3F, 1.7688F, -0.0329F, 0.1625F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 0.3713F, -2.8968F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck8.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(62, 8).addBox(-0.9282F, -0.9885F, -0.8749F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -0.7032F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck8.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(-0.5356F, -0.6847F, -0.5341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.8287F, -1.6032F, 1.3165F, -0.1214F, -0.0757F));

		PartDefinition cube_r257 = neck8.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-0.6514F, -0.8023F, -0.6956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.2287F, -1.3032F, 1.678F, 0.1758F, -1.1852F));

		PartDefinition cube_r258 = neck8.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(112, 97).mirror().addBox(-0.1344F, -1.6955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.2287F, -0.7032F, 1.704F, -0.0957F, 0.6056F));

		PartDefinition cube_r259 = neck8.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(112, 97).addBox(-0.8656F, -1.6955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -0.7032F, 1.704F, 0.0957F, -0.6056F));

		PartDefinition cube_r260 = neck8.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(84, 26).addBox(-0.3486F, -0.8023F, -0.6956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -1.3032F, 1.678F, -0.1758F, 1.1852F));

		PartDefinition cube_r261 = neck8.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(34, 71).addBox(-0.4644F, -0.6847F, -0.5341F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.8287F, -1.6032F, 1.3165F, 0.1214F, 0.0757F));

		PartDefinition cube_r262 = neck8.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(53, 110).addBox(-0.7174F, -0.7626F, -1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -1.3032F, 1.7688F, -0.0329F, 0.1625F));

		PartDefinition cube_r263 = neck8.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.275F, 7.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7927F, -3.2447F, 0.0738F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(137, 80).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1752F, -1.9639F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(137, 77).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5657F, -1.7678F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(117, 103).addBox(-1.5F, -0.4F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.1371F, -1.4915F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(139, 131).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6036F, 0.1333F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(139, 128).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.6036F, 0.1333F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(60, 120).addBox(-1.5F, 0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 44).addBox(-1.5F, -0.2F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7466F, 0.0419F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(137, 11).addBox(-1.5F, -0.525F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3897F, -0.2194F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(137, 8).addBox(-1.0F, -0.2F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.9041F, -0.65F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(122, 136).addBox(-1.0F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.8362F, -1.2462F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(132, 124).addBox(-1.0F, -1.8F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.8362F, -1.2462F, -2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(134, 31).addBox(-1.0F, -1.0F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.9237F, -3.7521F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(137, 102).addBox(-1.5F, -0.1F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.6385F, -4.0453F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(137, 99).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.8513F, -3.3889F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(5, 138).addBox(-1.5F, -0.7F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 3.1717F, -5.1058F, 2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(131, 137).addBox(-1.5F, -0.75F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.1717F, -5.1058F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(137, 83).addBox(-1.5F, -0.7F, -0.225F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 3.6385F, -4.0453F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(146, 42).addBox(-0.5F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.1514F, -5.5251F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(119, 107).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.3657F, -4.2733F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(136, 23).addBox(-1.0F, -0.9F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.2119F, -4.1553F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(125, 23).addBox(-1.5F, -0.1F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(7, 125).addBox(-1.5F, -0.1F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5F, 3.2608F, -4.9538F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(121, 93).addBox(-1.5F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5F, 2.9354F, -5.6846F, 2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(78, 66).addBox(-1.5F, -0.7F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.4272F, -5.173F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(139, 105).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.5084F, -1.5201F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(121, 89).addBox(-1.0F, -1.2F, -2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.102F, 0.3107F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(135, 96).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.5065F, -2.7996F, -2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(133, 59).addBox(-1.5F, -0.9F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.8927F, -2.1414F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(137, 69).addBox(-1.5F, -0.6F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0972F, -0.1079F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(121, 51).addBox(-1.0F, -1.1F, -1.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 0.102F, 0.3107F, 1.2654F, 0.0F, 0.0F));

		PartDefinition lowerjawbase = head.addOrReplaceChild("lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.2305F, 0.183F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r292 = lowerjawbase.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(10, 141).mirror().addBox(-0.5F, -0.25F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(10, 141).addBox(1.72F, -0.25F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.12F, 0.0251F, -0.1777F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r293 = lowerjawbase.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(152, 140).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(153, 10).mirror().addBox(-0.5F, -0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(153, 10).addBox(1.72F, -0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(152, 140).addBox(1.72F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.12F, 0.3112F, -1.6497F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r294 = lowerjawbase.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(153, 3).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(153, 3).addBox(1.72F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.12F, 0.1987F, -1.1625F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r295 = lowerjawbase.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(153, 13).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(153, 13).addBox(1.72F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.12F, 0.4966F, -2.2203F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r296 = lowerjawbase.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(153, 16).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(153, 16).addBox(1.72F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-1.12F, 0.9206F, -2.4853F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r297 = lowerjawbase.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(153, 23).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(153, 23).addBox(1.72F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.12F, 1.515F, -2.247F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r298 = lowerjawbase.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(153, 26).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false)
				.texOffs(153, 72).mirror().addBox(-0.5F, 0.0057F, 0.0991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(153, 78).mirror().addBox(-0.5F, 0.0057F, -0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(153, 78).addBox(1.72F, 0.0057F, -0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(153, 72).addBox(1.72F, 0.0057F, 0.0991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(153, 26).addBox(1.72F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-1.12F, 1.9008F, -2.5651F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r299 = lowerjawbase.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(40, 153).mirror().addBox(-0.5F, -0.2637F, -0.2785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(40, 153).addBox(1.72F, -0.2637F, -0.2785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.12F, 2.1758F, -2.9401F, -2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r300 = lowerjawbase.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(108, 141).mirror().addBox(-0.725F, -0.1978F, -0.2303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(146, 69).mirror().addBox(-0.225F, -0.1978F, 0.7697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(146, 72).mirror().addBox(-0.275F, -0.3478F, 0.7697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false)
				.texOffs(146, 72).addBox(0.045F, -0.3478F, 0.7697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(146, 69).addBox(-0.005F, -0.1978F, 0.7697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(108, 141).addBox(1.495F, -0.1978F, -0.2303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.895F, 2.7258F, -3.4651F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r301 = lowerjawbase.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(141, 124).mirror().addBox(-0.725F, -0.1999F, -0.3026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(141, 124).addBox(1.495F, -0.1999F, -0.3026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.895F, 2.7258F, -3.4651F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r302 = lowerjawbase.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(153, 41).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(153, 41).addBox(1.72F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.12F, 1.9008F, -2.5651F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r303 = lowerjawbase.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(153, 44).mirror().addBox(-0.5F, -0.325F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false)
				.texOffs(153, 44).addBox(1.72F, -0.325F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-1.12F, 1.6661F, -2.1236F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r304 = lowerjawbase.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(45, 153).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(45, 153).addBox(1.72F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.12F, 1.5172F, -1.7255F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r305 = lowerjawbase.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(153, 47).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(50, 153).mirror().addBox(-0.5F, -1.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(50, 153).addBox(1.72F, -1.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(153, 47).addBox(1.72F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.12F, 1.2449F, -1.3062F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r306 = lowerjawbase.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(66, 153).mirror().addBox(-0.5F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 153).addBox(1.72F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.12F, 0.3584F, -0.9836F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r307 = lowerjawbase.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(153, 69).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(153, 69).addBox(1.72F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.12F, 1.0134F, -1.7408F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r308 = lowerjawbase.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(140, 141).mirror().addBox(-0.725F, 0.1162F, -0.2717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(146, 75).mirror().addBox(-0.325F, 0.1162F, 0.7283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(146, 75).addBox(0.095F, 0.1162F, 0.7283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(140, 141).addBox(1.495F, 0.1162F, -0.2717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.895F, 2.7258F, -3.4651F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r309 = lowerjawbase.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(71, 153).mirror().addBox(-0.5F, -0.0085F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(71, 153).addBox(1.72F, -0.0085F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.12F, 2.3508F, -3.1401F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r310 = lowerjawbase.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(153, 75).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false)
				.texOffs(153, 75).addBox(1.72F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-1.12F, 2.3405F, -3.51F, -2.4086F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.6354F, -0.3301F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 152).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4735F, 1.5665F, -5.2074F, -2.2481F, 0.1311F, 0.4653F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(79, 152).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.9406F, -4.6393F, -2.0827F, -0.5611F, -0.7087F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(146, 48).addBox(-1.9F, -0.9F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.4F, 2.5765F, -3.8252F, 2.1585F, 0.9445F, 0.5232F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(146, 45).addBox(-1.9F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 2.5765F, -3.8252F, 2.291F, 0.8647F, 0.6913F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(153, 81).addBox(-0.7F, -1.0762F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 152).addBox(-0.7F, -0.6762F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2007F, 0.6649F, -4.4258F, 2.58F, -0.2983F, -0.437F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(53, 149).addBox(-0.7F, -1.6762F, -0.6968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1F, -0.1067F, -3.8652F, 2.5356F, -0.1777F, -0.2498F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(148, 104).addBox(-1.0F, -1.6762F, -0.6968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -0.1067F, -3.8652F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(147, 119).addBox(-1.0F, -1.6784F, -0.6939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -1.1309F, -2.9079F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(150, 29).addBox(-0.7F, -1.675F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7116F, -2.0152F, -1.8272F, 2.3664F, 0.4928F, 0.4499F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 150).addBox(-0.7F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1173F, -1.1574F, -2.8865F, 2.3999F, 0.1371F, 0.1215F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(99, 150).addBox(-0.7F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, -2.0309F, -1.8079F, 2.2557F, 0.1016F, 0.0827F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(94, 150).addBox(-1.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2F, -2.0309F, -1.8079F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(141, 134).addBox(-1.1F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(124, 151).addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2F, -2.2517F, -1.4743F, -2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(153, 126).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.75F, -1.7351F, -0.0341F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(153, 90).addBox(-0.475F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.429F, 0.5657F, 0.4337F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(137, 153).addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.3048F, 0.8388F, 0.7574F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(153, 87).addBox(-0.475F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.3824F, 0.7656F, 0.6496F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(10, 150).addBox(-0.8F, -1.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1052F, -2.022F, -1.8181F, 2.2876F, 0.0527F, 0.0458F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(143, 30).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, -1.1717F, -0.1404F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(153, 123).addBox(-0.45F, -1.0147F, -0.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(119, 153).addBox(-0.45F, -0.8147F, -0.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.775F, -1.1078F, 0.2747F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(109, 151).addBox(-0.45F, -0.9063F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.775F, -1.1078F, 0.2747F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(148, 92).addBox(-0.55F, -0.452F, -0.5176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.775F, -1.1078F, 0.2747F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(152, 120).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.75F, 0.2783F, -1.3259F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(152, 117).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.75F, -0.3143F, -1.4197F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(101, 141).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.75F, -1.2846F, -1.6617F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(151, 99).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.75F, -1.4903F, -1.2906F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(133, 149).addBox(-0.5F, -1.8F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.75F, -2.0399F, -1.0767F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(114, 153).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.75F, -2.1337F, -0.4841F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(153, 105).addBox(-0.5625F, -0.9652F, -0.5089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8125F, -1.3426F, -0.7186F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(151, 96).addBox(-0.4125F, -0.3429F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(151, 7).addBox(-0.5875F, -0.3429F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8125F, -1.3426F, -0.7186F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(152, 137).addBox(-0.5017F, -0.2579F, -0.7213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.5877F, -1.8003F, -1.8015F, 2.1904F, -0.0349F, -0.0006F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(89, 148).addBox(-0.5017F, -0.2578F, -0.7213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.6308F, -0.6599F, -2.7749F, 2.4349F, -0.0337F, -0.009F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(119, 149).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5896F, -1.9718F, -1.3229F, 1.8064F, -0.0349F, 0.0F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(104, 153).addBox(-0.5017F, -0.2571F, -0.7385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6443F, -0.2529F, -3.065F, 2.5571F, -0.0337F, -0.009F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(153, 102).addBox(-0.5F, -0.4854F, -0.5055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6443F, 0.0971F, -2.99F, 2.6444F, -0.0328F, -0.0119F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(152, 114).addBox(-0.5F, -0.8316F, -1.0393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(0.6443F, 0.0971F, -2.99F, 2.0335F, -0.0328F, -0.0119F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(140, 52).addBox(-0.5F, -0.5316F, -1.9394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.6443F, 0.0971F, -2.99F, 1.2481F, -0.0328F, -0.0119F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(61, 148).addBox(0.8F, -0.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.5F, 0.223F, 0.4035F, -2.9496F, 0.0F, 0.0F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(141, 14).addBox(-0.5F, -0.45F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6844F, 1.4048F, -3.7355F, 1.0299F, -0.0328F, -0.0119F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(147, 111).addBox(-1.8F, 0.2999F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(147, 108).addBox(-1.8F, -0.2751F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4298F, 0.3818F, -1.5533F, 0.1222F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(147, 63).addBox(-1.8F, 0.6951F, -0.1059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4298F, 0.3818F, -1.6755F, 0.1222F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.6354F, -0.3301F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(84, 152).mirror().addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4735F, 1.5665F, -5.2074F, -2.2481F, -0.1311F, -0.4653F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(79, 152).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9406F, -4.6393F, -2.0827F, 0.5611F, 0.7087F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(146, 48).mirror().addBox(-0.1F, -0.9F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.5765F, -3.8252F, 2.1585F, -0.9445F, -0.5232F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(146, 45).mirror().addBox(-0.1F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.5765F, -3.8252F, 2.291F, -0.8647F, -0.6913F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(153, 81).mirror().addBox(-0.3F, -1.0762F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 152).mirror().addBox(-0.3F, -0.6762F, -0.6968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2007F, 0.6649F, -4.4258F, 2.58F, 0.2983F, 0.437F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(53, 149).mirror().addBox(-0.3F, -1.6762F, -0.6968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.1067F, -3.8652F, 2.5356F, 0.1777F, 0.2498F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(148, 104).mirror().addBox(0.0F, -1.6762F, -0.6968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1067F, -3.8652F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(147, 119).mirror().addBox(0.0F, -1.6784F, -0.6939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.1309F, -2.9079F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(150, 29).mirror().addBox(-0.3F, -1.675F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7116F, -2.0152F, -1.8272F, 2.3664F, -0.4928F, -0.4499F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(15, 150).mirror().addBox(-0.3F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1173F, -1.1574F, -2.8865F, 2.3999F, -0.1371F, -0.1215F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(99, 150).mirror().addBox(-0.3F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.0309F, -1.8079F, 2.2557F, -0.1016F, -0.0827F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(94, 150).mirror().addBox(0.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.0309F, -1.8079F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(141, 134).mirror().addBox(-0.9F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(124, 151).mirror().addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.2517F, -1.4743F, -2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(153, 126).mirror().addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.7351F, -0.0341F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(153, 90).mirror().addBox(-0.525F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.429F, -0.5657F, -0.4337F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(137, 153).mirror().addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.3048F, -0.8388F, -0.7574F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(153, 87).mirror().addBox(-0.525F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.3824F, -0.7656F, -0.6496F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(10, 150).mirror().addBox(-0.2F, -1.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -2.022F, -1.8181F, 2.2876F, -0.0527F, -0.0458F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(143, 30).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.1717F, -0.1404F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(153, 123).mirror().addBox(-0.55F, -1.0147F, -0.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 153).mirror().addBox(-0.55F, -0.8147F, -0.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -1.1078F, 0.2747F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(109, 151).mirror().addBox(-0.55F, -0.9063F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -1.1078F, 0.2747F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(148, 92).mirror().addBox(-0.45F, -0.452F, -0.5176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -1.1078F, 0.2747F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(152, 120).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.2783F, -1.3259F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(152, 117).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -0.3143F, -1.4197F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(101, 141).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.2846F, -1.6617F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(151, 99).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.4903F, -1.2906F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(133, 149).mirror().addBox(-0.5F, -1.8F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -2.0399F, -1.0767F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(114, 153).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -2.1337F, -0.4841F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(153, 105).mirror().addBox(-0.4375F, -0.9652F, -0.5089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8125F, -1.3426F, -0.7186F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(151, 96).mirror().addBox(-0.5875F, -0.3429F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(151, 7).mirror().addBox(-0.4125F, -0.3429F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8125F, -1.3426F, -0.7186F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(152, 137).mirror().addBox(-0.4983F, -0.2579F, -0.7213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.5877F, -1.8003F, -1.8015F, 2.1904F, 0.0349F, 0.0006F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(89, 148).mirror().addBox(-0.4983F, -0.2578F, -0.7213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.6308F, -0.6599F, -2.7749F, 2.4349F, 0.0337F, 0.009F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(119, 149).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5896F, -1.9718F, -1.3229F, 1.8064F, 0.0349F, 0.0F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(104, 153).mirror().addBox(-0.4983F, -0.2571F, -0.7385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, -0.2529F, -3.065F, 2.5571F, 0.0337F, 0.009F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(153, 102).mirror().addBox(-0.5F, -0.4854F, -0.5055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, 0.0971F, -2.99F, 2.6444F, 0.0328F, 0.0119F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(152, 114).mirror().addBox(-0.5F, -0.8316F, -1.0393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, 0.0971F, -2.99F, 2.0335F, 0.0328F, 0.0119F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(140, 52).mirror().addBox(-0.5F, -0.5316F, -1.9394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, 0.0971F, -2.99F, 1.2481F, 0.0328F, 0.0119F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(61, 148).mirror().addBox(-1.8F, -0.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.223F, 0.4035F, -2.9496F, 0.0F, 0.0F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(141, 14).mirror().addBox(-0.5F, -0.45F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6844F, 1.4048F, -3.7355F, 1.0299F, 0.0328F, 0.0119F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(147, 111).mirror().addBox(-0.2F, 0.2999F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(147, 108).mirror().addBox(-0.2F, -0.2751F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4298F, 0.3818F, -1.5533F, -0.1222F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(147, 63).mirror().addBox(-0.2F, 0.6951F, -0.1059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4298F, 0.3818F, -1.6755F, -0.1222F, 0.0F));

		PartDefinition neckflapmidbase = neckmiddlebase.addOrReplaceChild("neckflapmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2539F, -11.6082F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinmidbase = neckflapmidbase.addOrReplaceChild("neckskinmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 0.8F, -0.0637F, 0.0F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1412F, 8.9813F, -9.9175F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r393 = leftArm.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(74, 69).addBox(0.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 5.2696F, -2.2166F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r394 = leftArm.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(26, 133).addBox(-0.5239F, -1.0994F, -1.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 1.0263F, -0.3654F, 0.4067F));

		PartDefinition cube_r395 = leftArm.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(117, 97).addBox(-0.5239F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 0.7209F, -0.3654F, 0.4067F));

		PartDefinition cube_r396 = leftArm.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(140, 116).addBox(-0.5739F, -1.3269F, -2.6598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 1.3022F, -0.4218F, 0.392F));

		PartDefinition cube_r397 = leftArm.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(29, 113).addBox(-0.5F, -0.575F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1412F, 8.2328F, -3.7604F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftArm.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5F, -1.3F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1412F, 7.3236F, -2.8313F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r399 = leftArm.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(114, 15).addBox(-1.0F, 0.125F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 105).addBox(-1.0F, -0.875F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3588F, 9.0685F, -4.6901F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r400 = leftArm.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(128, 101).addBox(-1.0F, -0.175F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3588F, 9.0685F, -4.6901F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r401 = leftArm.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(130, 73).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1412F, 7.3236F, -2.8313F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r402 = leftArm.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(110, 52).addBox(-0.5F, -0.5F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1412F, 8.2328F, -3.7604F, 1.1694F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0921F, 10.2338F, -6.0189F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftArm2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(111, 0).addBox(-0.9F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.124F)), PartPose.offsetAndRotation(-0.8926F, 3.7204F, -1.7165F, 2.2468F, 1.4605F, 0.6942F));

		PartDefinition cube_r404 = leftArm2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(3, 145).addBox(-1.9F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(110, 46).addBox(-0.9F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8926F, 3.7204F, -1.7165F, 0.8856F, 1.4597F, -0.673F));

		PartDefinition cube_r405 = leftArm2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(108, 57).addBox(1.6113F, -1.5823F, -8.966F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.0333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition cube_r406 = leftArm2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(54, 138).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6471F, 2.0869F, 1.6811F, 0.2257F, 1.1772F, -1.3467F));

		PartDefinition cube_r407 = leftArm2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(66, 149).addBox(-0.4F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7255F, 2.4471F, 0.7081F, 2.5559F, 1.4149F, 1.0059F));

		PartDefinition cube_r408 = leftArm2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(17, 141).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6486F, 8.129F, 0.5979F, 3.042F, -0.5295F, 1.6364F));

		PartDefinition cube_r409 = leftArm2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(148, 25).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7351F, 8.086F, -0.3975F, 2.0455F, -1.4741F, 2.6802F));

		PartDefinition cube_r410 = leftArm2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(148, 123).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7993F, 7.2931F, -1.0035F, 0.1407F, -0.9122F, -1.6671F));

		PartDefinition cube_r411 = leftArm2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(148, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7993F, 6.3083F, -0.8298F, 0.0873F, -0.1745F, -1.5708F));

		PartDefinition cube_r412 = leftArm2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(47, 138).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.769F, 4.4287F, -0.1471F, 0.2463F, 1.2111F, -1.3245F));

		PartDefinition cube_r413 = leftArm2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(88, 85).addBox(0.0113F, -0.0823F, -11.666F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(123, 18).addBox(-0.3887F, -0.0823F, -6.666F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.2253F, -1.2163F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r414 = leftArm3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(44, 124).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6604F, 2.0039F, -0.4034F, 2.0402F, 0.2179F, 1.0016F));

		PartDefinition cube_r415 = leftArm3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(59, 106).addBox(-0.4F, -1.8F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.827F, 1.676F, 0.9994F, 1.388F, 0.3006F, -0.0547F));

		PartDefinition cube_r416 = leftArm3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(90, 26).addBox(-0.7F, -2.1502F, -16.8157F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r417 = leftArm3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(105, 25).addBox(0.2F, -1.8F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8271F, 1.5891F, 0.507F, 1.3746F, -0.4721F, 0.0902F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1412F, 8.9813F, -9.9175F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r418 = rightArm.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 76).addBox(-2.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 5.2696F, -2.2166F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r419 = rightArm.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(133, 36).addBox(-0.4761F, -1.0994F, -1.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 1.0263F, 0.3654F, -0.4067F));

		PartDefinition cube_r420 = rightArm.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(113, 117).addBox(-0.4761F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 0.7209F, 0.3654F, -0.4067F));

		PartDefinition cube_r421 = rightArm.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(140, 120).addBox(-0.4261F, -1.3269F, -2.6598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 1.3022F, 0.4218F, -0.392F));

		PartDefinition cube_r422 = rightArm.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(51, 113).addBox(-1.5F, -0.575F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1412F, 8.2328F, -3.7604F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r423 = rightArm.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(132, 4).addBox(-1.5F, -1.3F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1412F, 7.3236F, -2.8313F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r424 = rightArm.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(140, 66).addBox(-1.0F, 0.125F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 120).addBox(-1.0F, -0.875F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3588F, 9.0685F, -4.6901F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r425 = rightArm.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(44, 129).addBox(-1.0F, -0.175F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3588F, 9.0685F, -4.6901F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r426 = rightArm.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(131, 116).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1412F, 7.3236F, -2.8313F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r427 = rightArm.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(40, 113).addBox(-1.5F, -0.5F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1412F, 8.2328F, -3.7604F, 1.1694F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0921F, 10.2338F, -6.0189F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightArm2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(112, 83).addBox(-0.1F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.124F)), PartPose.offsetAndRotation(0.8926F, 3.7204F, -1.7165F, 2.2468F, -1.4605F, -0.6942F));

		PartDefinition cube_r429 = rightArm2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(146, 78).addBox(-0.1F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(112, 18).addBox(-0.1F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.8926F, 3.7204F, -1.7165F, 0.8856F, -1.4597F, 0.673F));

		PartDefinition cube_r430 = rightArm2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(0, 109).addBox(-2.6113F, -1.5823F, -8.966F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition cube_r431 = rightArm2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(139, 47).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6471F, 2.0869F, 1.6811F, 0.2257F, -1.1772F, 1.3467F));

		PartDefinition cube_r432 = rightArm2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(71, 149).addBox(-0.6F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7255F, 2.4471F, 0.7081F, 2.5559F, -1.4149F, -1.0059F));

		PartDefinition cube_r433 = rightArm2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(142, 38).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6486F, 8.129F, 0.5979F, 3.042F, 0.5295F, -1.6364F));

		PartDefinition cube_r434 = rightArm2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(148, 88).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7351F, 8.086F, -0.3975F, 2.0455F, 1.4741F, -2.6802F));

		PartDefinition cube_r435 = rightArm2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(149, 54).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7993F, 7.2931F, -1.0035F, 0.1407F, 0.9122F, 1.6671F));

		PartDefinition cube_r436 = rightArm2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(148, 84).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7993F, 6.3083F, -0.8298F, 0.0873F, 0.1745F, 1.5708F));

		PartDefinition cube_r437 = rightArm2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(88, 138).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.769F, 4.4287F, -0.1471F, 0.2463F, -1.2111F, 1.3245F));

		PartDefinition cube_r438 = rightArm2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(62, 91).addBox(-1.0113F, -0.0823F, -11.666F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(125, 26).addBox(-1.6113F, -0.0823F, -6.666F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.2253F, -1.2163F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r439 = rightArm3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(125, 31).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6604F, 2.0039F, -0.4034F, 2.0402F, -0.2179F, -1.0016F));

		PartDefinition cube_r440 = rightArm3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(106, 101).addBox(-0.6F, -1.8F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.827F, 1.676F, 0.9994F, 1.388F, -0.3006F, 0.0547F));

		PartDefinition cube_r441 = rightArm3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(91, 66).addBox(-2.3F, -2.1502F, -16.8157F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r442 = rightArm3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(106, 66).addBox(-1.2F, -1.8F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8271F, 1.5891F, 0.507F, 1.3746F, 0.4721F, -0.0902F));

		PartDefinition bone = bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7F, 1.5208F, -7.4424F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(51, 85).addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2571F, 5.3307F, -5.7505F, 0.6919F, 0.9798F, 0.4572F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(101, 93).addBox(-0.5F, -2.3437F, -2.5607F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.2571F, 5.3307F, -5.7505F, 1.6344F, 0.9798F, 0.4572F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(43, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7626F, 1.5972F, -1.3993F, 1.6427F, 0.0076F, -0.253F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(5, 148).addBox(-0.4217F, -3.1912F, 3.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.4209F, 0.0076F, -0.253F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(148, 3).addBox(-0.4217F, 1.0368F, -3.9353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -2.6857F, 0.0076F, -0.253F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(140, 34).addBox(-0.4217F, 2.523F, 0.3295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 2.2448F, 0.0076F, -0.253F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(104, 150).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5702F, 6.7887F, -2.5991F, 0.8049F, 0.0076F, -0.253F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(149, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5275F, 6.5809F, -1.2009F, -0.635F, 0.0076F, -0.253F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(61, 140).addBox(-0.5F, -0.475F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3023F, 5.7237F, -1.6546F, -1.5949F, 0.0076F, -0.253F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(119, 139).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3919F, 6.1204F, -3.3041F, -0.8095F, 0.0076F, -0.253F));

		PartDefinition cube_r453 = bone.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(132, 48).addBox(-0.5F, -0.925F, -0.725F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4767F, 2.778F, -3.8732F, -0.0241F, 0.0076F, -0.253F));

		PartDefinition cube_r454 = bone.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(133, 109).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5767F, 2.4008F, -4.189F, 1.4594F, 0.0076F, -0.253F));

		PartDefinition cube_r455 = bone.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(29, 99).addBox(-0.4217F, 0.2342F, 0.9129F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.8834F, 0.0076F, -0.253F));

		PartDefinition cube_r456 = bone.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(139, 72).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9367F, 0.8825F, -0.048F, 0.6653F, 0.0076F, -0.253F));

		PartDefinition cube_r457 = bone.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(44, 118).addBox(-0.5F, -1.025F, -1.775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8846F, 1.0689F, 0.4546F, 1.058F, 0.0076F, -0.253F));

		PartDefinition cube_r458 = bone.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(119, 37).addBox(-0.5F, -1.525F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5982F, -0.4714F, 2.4738F, 0.7868F, -0.0786F, -0.3929F));

		PartDefinition cube_r459 = bone.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(128, 63).addBox(0.6644F, -8.9865F, 2.7102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -0.3564F, -0.0786F, -0.3929F));

		PartDefinition cube_r460 = bone.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(115, 132).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0681F, -4.3785F, 0.7232F, -0.1295F, -0.0786F, -0.3929F));

		PartDefinition cube_r461 = bone.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(152, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.216F, -4.5345F, 1.6998F, -0.1033F, -0.0786F, -0.3929F));

		PartDefinition cube_r462 = bone.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(46, 143).addBox(0.6644F, -8.1864F, 7.5731F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.2021F, -0.0786F, -0.3929F));

		PartDefinition cube_r463 = bone.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(116, 24).addBox(0.6644F, 0.9947F, 9.272F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.9875F, -0.0786F, -0.3929F));

		PartDefinition bone4 = bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7F, 1.5208F, -7.4424F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r464 = bone4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(51, 85).mirror().addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2571F, 5.3307F, -5.7505F, 0.6919F, -0.9798F, -0.4572F));

		PartDefinition cube_r465 = bone4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(101, 93).mirror().addBox(-0.5F, -2.3437F, -2.5607F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.2571F, 5.3307F, -5.7505F, 1.6344F, -0.9798F, -0.4572F));

		PartDefinition cube_r466 = bone4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(43, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7626F, 1.5972F, -1.3993F, 1.6427F, -0.0076F, 0.253F));

		PartDefinition cube_r467 = bone4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(5, 148).mirror().addBox(-0.5783F, -3.1912F, 3.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.4209F, -0.0076F, 0.253F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(148, 3).mirror().addBox(-0.5783F, 1.0368F, -3.9353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -2.6857F, -0.0076F, 0.253F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(140, 34).mirror().addBox(-0.5783F, 2.523F, 0.3295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 2.2448F, -0.0076F, 0.253F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(104, 150).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5702F, 6.7887F, -2.5991F, 0.8049F, -0.0076F, 0.253F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(149, 0).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5275F, 6.5809F, -1.2009F, -0.635F, -0.0076F, 0.253F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(61, 140).mirror().addBox(-0.5F, -0.475F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3023F, 5.7237F, -1.6546F, -1.5949F, -0.0076F, 0.253F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(119, 139).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3919F, 6.1204F, -3.3041F, -0.8095F, -0.0076F, 0.253F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(132, 48).mirror().addBox(-0.5F, -0.925F, -0.725F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4767F, 2.778F, -3.8732F, -0.0241F, -0.0076F, 0.253F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(133, 109).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5767F, 2.4008F, -4.189F, 1.4594F, -0.0076F, 0.253F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(29, 99).mirror().addBox(-0.5783F, 0.2342F, 0.9129F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.8834F, -0.0076F, 0.253F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(139, 72).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9367F, 0.8825F, -0.048F, 0.6653F, -0.0076F, 0.253F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(44, 118).mirror().addBox(-0.5F, -1.025F, -1.775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8846F, 1.0689F, 0.4546F, 1.058F, -0.0076F, 0.253F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(119, 37).mirror().addBox(-0.5F, -1.525F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5982F, -0.4714F, 2.4738F, 0.7868F, 0.0786F, 0.3929F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(128, 63).mirror().addBox(-1.6644F, -8.9865F, 2.7102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -0.3564F, 0.0786F, 0.3929F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(115, 132).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.0681F, -4.3785F, 0.7232F, -0.1295F, 0.0786F, 0.3929F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(152, 20).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.216F, -4.5345F, 1.6998F, -0.1033F, 0.0786F, 0.3929F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(46, 143).mirror().addBox(-1.6644F, -8.1864F, 7.5731F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.2021F, 0.0786F, 0.3929F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(116, 24).mirror().addBox(-1.6644F, 0.9947F, 9.272F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.9875F, 0.0786F, 0.3929F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(46, 22).addBox(-1.0F, -1.0929F, 0.0511F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6992F, 2.0273F, 0.2001F, 0.0855F, 0.0173F));

		PartDefinition cube_r485 = tail1.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(27, 149).addBox(0.0F, -1.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0956F, 4.9199F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail1.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(148, 131).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9924F, 6.6001F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r487 = tail1.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(14, 116).addBox(-0.5F, -5.1F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1034F, 0.0516F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail1.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(121, 43).addBox(-0.5F, -5.1F, 2.875F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0929F, 3.0511F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail1.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(76, 121).addBox(-0.5F, -4.7F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0929F, 3.0511F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail1.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-2.825F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0929F, 0.0511F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r491 = tail1.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(0, 47).addBox(-0.175F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0929F, 0.0511F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -0.1774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 7.9957F, -0.2318F, 0.0F, 0.0F));

		PartDefinition cube_r492 = tail2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-1.175F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.8226F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r493 = tail2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(19, 57).addBox(-1.825F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.8226F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r494 = tail2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(3, 152).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5301F, 8.2917F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 152).addBox(0.0F, 3.1F, 8.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(129, 151).addBox(0.0F, -0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9588F, 2.8812F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(111, 145).addBox(0.0F, -0.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.883F, 0.4126F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(89, 143).addBox(-0.5F, -2.6F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2747F, 7.074F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(15, 145).addBox(-0.5F, -3.0F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2321F, 5.1097F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(38, 141).addBox(-0.5F, -3.5F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0922F, 3.1222F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(24, 141).addBox(-0.5F, -3.6F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1984F, 1.0035F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, -1.8774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.6959F, 7.8814F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r502 = tail3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.8F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.8774F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r503 = tail3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(62, 0).addBox(-1.2F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.8774F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r504 = tail3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(153, 148).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0556F, 6.6257F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(148, 153).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1177F, 4.9937F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(58, 149).addBox(0.0F, -1.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0784F, 2.6616F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(10, 145).addBox(-0.5F, -2.1F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7352F, 7.0841F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(148, 127).addBox(-0.5F, -2.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7051F, 5.1427F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r509 = tail3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(118, 144).addBox(-0.5F, -2.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8113F, 3.024F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(74, 144).addBox(-0.5F, -2.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7212F, 0.8672F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.8774F, 0.0231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.001F, 7.9407F, 0.1402F, 0.0864F, 0.0122F));

		PartDefinition cube_r511 = tail4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(24, 154).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2091F, 7.6917F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(21, 154).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2484F, 5.3597F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(18, 154).addBox(0.0F, -0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1144F, 3.1277F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(15, 154).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, 0.9456F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r515 = tail4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(12, 154).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8429F, 7.0541F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(9, 154).addBox(0.0F, -1.5F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8414F, 4.9654F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(151, 153).addBox(0.0F, -1.55F, 0.075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9286F, 2.9449F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(76, 149).addBox(0.0F, -0.35F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6696F, 7.8277F, 0.1572F, 0.0431F, 0.0068F));

		PartDefinition cube_r519 = tail5.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(18, 125).addBox(0.0F, 3.0F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 99).addBox(0.0F, 2.1F, 7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 92).addBox(0.0F, 1.2F, 5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail5.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(154, 54).addBox(0.0F, -1.4F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 7.3186F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail5.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(97, 154).addBox(0.0F, -1.25F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2205F, 5.0827F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail5.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(94, 154).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1113F, 3.024F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail5.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(154, 33).addBox(0.0F, -1.4F, -0.075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1794F, 1.1017F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(59, 59).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0364F, 7.8033F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r524 = tail6.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(128, 48).addBox(0.0F, -1.225F, 1.45F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 62).addBox(0.0F, -1.225F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0269F, 5.5544F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail6.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(154, 58).addBox(0.0F, -1.25F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1141F, 3.5339F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail6.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(58, 154).addBox(0.0F, -0.825F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6511F, 1.2952F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(91, 78).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0078F, 7.9254F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r527 = tail7.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(128, 15).addBox(0.0F, -0.6F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.095F, 3.632F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail7.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(154, 0).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0785F, 1.4895F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 92).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1235F, 0.1287F, -0.0236F));

		PartDefinition cube_r529 = tail8.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(154, 66).addBox(0.0F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.12F, 0.5352F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(28, 92).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0007F, 0.1732F, -0.0152F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(88, 93).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1314F, 0.0862F, -0.0133F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(41, 95).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0441F, 0.1304F, -0.0095F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(95, 57).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0881F, 0.1302F, -0.0134F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(75, 95).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.6814F, 5.0455F, -5.995F));

		PartDefinition cube_r530 = bone2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(126, 140).addBox(0.1F, 0.5845F, 3.6707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -2.2094F, -0.2967F, 0.0441F));

		PartDefinition cube_r531 = bone2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(114, 149).addBox(0.1F, 3.554F, 0.9546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -1.2495F, -0.2967F, 0.0441F));

		PartDefinition cube_r532 = bone2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(126, 96).addBox(0.1F, 2.0074F, -4.7659F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -0.0714F, -0.2967F, 0.0441F));

		PartDefinition cube_r533 = bone2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(112, 63).addBox(0.1F, -2.9409F, -4.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, 0.9322F, -0.2967F, 0.0441F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(82, 143).addBox(0.104F, 3.165F, -1.4026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -1.0488F, -0.2967F, 0.0441F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(140, 112).addBox(0.104F, 2.3562F, -0.8378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -1.2233F, -0.2967F, 0.0441F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(146, 99).addBox(0.104F, -0.4115F, -2.4804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, 0.1642F, -0.2967F, 0.0441F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(0, 148).addBox(0.1F, 2.0473F, 1.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -1.1361F, -0.2967F, 0.0441F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(147, 141).addBox(0.1F, 2.3694F, -3.2883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(147, 137).addBox(0.1F, 2.3694F, -3.6883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -0.0452F, -0.2967F, 0.0441F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(29, 118).addBox(0.1F, 2.265F, -1.7344F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -0.3245F, -0.2967F, 0.0441F));

		PartDefinition cube_r540 = bone2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(77, 102).addBox(-0.506F, -0.0081F, -3.9142F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0246F, -9.8909F, 4.7253F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r541 = bone2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(13, 108).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0186F, -10.5843F, 1.8337F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r542 = bone2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(29, 107).addBox(-0.5F, -0.9457F, -4.0012F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -10.6439F, 1.8426F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r543 = bone2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(132, 128).addBox(0.1F, -0.1467F, -1.538F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4936F, -10.6439F, 0.4426F, -0.019F, -0.2967F, 0.0441F));

		PartDefinition cube_r544 = bone2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(88, 107).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0276F, -9.0132F, 7.413F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r545 = bone2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(20, 150).addBox(-0.5F, -1.306F, -0.6922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0276F, -7.8543F, 6.7368F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r546 = bone2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(57, 133).addBox(-0.5F, -1.0F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0186F, -6.1475F, 1.613F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r547 = bone2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(40, 102).addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r548 = bone2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(141, 18).addBox(-0.5144F, -1.8113F, 0.2295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3523F, -1.0531F, 4.7999F, -0.6332F, -0.3369F, 0.3555F));

		PartDefinition cube_r549 = bone2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(30, 152).addBox(-0.5F, 0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(141, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7733F, -1.5565F, 8.2691F, 0.2831F, -0.3369F, 0.3555F));

		PartDefinition cube_r550 = bone2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(124, 111).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9333F, -0.4948F, 7.6421F, -0.3278F, -0.3369F, 0.3555F));

		PartDefinition cube_r551 = bone2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(61, 144).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7784F, -1.1362F, 7.865F, 0.0213F, -0.3369F, 0.3555F));

		PartDefinition cube_r552 = bone2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(97, 46).addBox(-0.5144F, -1.1089F, 0.7108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3523F, -1.0531F, 4.7999F, -0.2842F, -0.3369F, 0.3555F));

		PartDefinition cube_r553 = bone2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(128, 147).addBox(-0.658F, 8.5004F, 1.3525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.5159F, 4.8745F, -0.6189F, -0.3811F, 0.3899F));

		PartDefinition cube_r554 = bone2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(134, 26).addBox(-0.658F, 7.601F, -0.608F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(50, 133).addBox(-0.658F, 2.44F, -0.7546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8555F, -4.5159F, 4.8745F, -0.4008F, -0.3811F, 0.3899F));

		PartDefinition cube_r555 = bone2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(153, 84).addBox(-0.5F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(148, 12).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1145F, 5.1075F, 2.1764F, -0.0953F, -0.3811F, 0.3899F));

		PartDefinition cube_r556 = bone2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(123, 144).addBox(-0.658F, 6.9226F, -3.0983F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8555F, -4.5159F, 4.8745F, 0.0356F, -0.3811F, 0.3899F));

		PartDefinition cube_r557 = bone2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(123, 82).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0661F, 0.4753F, 4.1507F, -0.2699F, -0.3811F, 0.3899F));

		PartDefinition cube_r558 = bone2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(133, 54).addBox(-0.658F, 3.4152F, -1.4793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.5159F, 4.8745F, -0.2262F, -0.3811F, 0.3899F));

		PartDefinition cube_r559 = bone2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(101, 85).addBox(-1.0F, -2.8F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8812F, -1.3472F, 2.7285F, 0.5404F, -0.1751F, -0.0112F));

		PartDefinition cube_r560 = bone2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(21, 123).addBox(-0.5F, -0.3F, -0.975F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3108F, -0.7279F, 2.1136F, 0.0792F, -0.3811F, 0.3899F));

		PartDefinition cube_r561 = bone2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(119, 57).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3108F, -0.7279F, 2.1136F, 0.2974F, -0.3811F, 0.3899F));

		PartDefinition cube_r562 = bone2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(77, 85).addBox(-0.5F, -2.0F, -1.6F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5728F, -3.526F, 3.4629F, 0.25F, -0.0361F, 0.1708F));

		PartDefinition cube_r563 = bone2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(62, 113).addBox(-0.5F, -1.5F, -2.675F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6563F, -3.8881F, 2.8868F, -0.2038F, -0.0361F, 0.1708F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.6814F, 5.0455F, -5.995F));

		PartDefinition cube_r564 = bone3.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(126, 140).mirror().addBox(-1.1F, 0.5845F, 3.6707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -2.2094F, 0.2967F, -0.0441F));

		PartDefinition cube_r565 = bone3.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(114, 149).mirror().addBox(-1.1F, 3.554F, 0.9546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -1.2495F, 0.2967F, -0.0441F));

		PartDefinition cube_r566 = bone3.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(-1.1F, 2.0074F, -4.7659F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -0.0714F, 0.2967F, -0.0441F));

		PartDefinition cube_r567 = bone3.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(112, 63).mirror().addBox(-1.1F, -2.9409F, -4.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, 0.9322F, 0.2967F, -0.0441F));

		PartDefinition cube_r568 = bone3.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(82, 143).mirror().addBox(-1.104F, 3.165F, -1.4026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -1.0488F, 0.2967F, -0.0441F));

		PartDefinition cube_r569 = bone3.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(140, 112).mirror().addBox(-1.104F, 2.3562F, -0.8378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -1.2233F, 0.2967F, -0.0441F));

		PartDefinition cube_r570 = bone3.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(146, 99).mirror().addBox(-1.104F, -0.4115F, -2.4804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, 0.1642F, 0.2967F, -0.0441F));

		PartDefinition cube_r571 = bone3.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(0, 148).mirror().addBox(-1.1F, 2.0473F, 1.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -1.1361F, 0.2967F, -0.0441F));

		PartDefinition cube_r572 = bone3.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(147, 141).mirror().addBox(-1.1F, 2.3694F, -3.2883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(147, 137).mirror().addBox(-1.1F, 2.3694F, -3.6883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -0.0452F, 0.2967F, -0.0441F));

		PartDefinition cube_r573 = bone3.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(29, 118).mirror().addBox(-1.1F, 2.265F, -1.7344F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -0.3245F, 0.2967F, -0.0441F));

		PartDefinition cube_r574 = bone3.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(77, 102).mirror().addBox(-0.494F, -0.0081F, -3.9142F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0246F, -9.8909F, 4.7253F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r575 = bone3.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(13, 108).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.5843F, 1.8337F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r576 = bone3.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(29, 107).mirror().addBox(-0.5F, -0.9457F, -4.0012F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.6439F, 1.8426F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r577 = bone3.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(132, 128).mirror().addBox(-1.1F, -0.1467F, -1.538F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, -10.6439F, 0.4426F, -0.019F, 0.2967F, -0.0441F));

		PartDefinition cube_r578 = bone3.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(88, 107).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -9.0132F, 7.413F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r579 = bone3.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(20, 150).mirror().addBox(-0.5F, -1.306F, -0.6922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.8543F, 6.7368F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r580 = bone3.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(57, 133).mirror().addBox(-0.5F, -1.0F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -6.1475F, 1.613F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r581 = bone3.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(40, 102).mirror().addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r582 = bone3.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(141, 18).mirror().addBox(-0.4856F, -1.8113F, 0.2295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -1.0531F, 4.7999F, -0.6332F, 0.3369F, -0.3555F));

		PartDefinition cube_r583 = bone3.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(30, 152).mirror().addBox(-0.5F, 0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(141, 26).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7733F, -1.5565F, 8.2691F, 0.2831F, 0.3369F, -0.3555F));

		PartDefinition cube_r584 = bone3.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(124, 111).mirror().addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9333F, -0.4948F, 7.6421F, -0.3278F, 0.3369F, -0.3555F));

		PartDefinition cube_r585 = bone3.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(61, 144).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7784F, -1.1362F, 7.865F, 0.0213F, 0.3369F, -0.3555F));

		PartDefinition cube_r586 = bone3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-0.4856F, -1.1089F, 0.7108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -1.0531F, 4.7999F, -0.2842F, 0.3369F, -0.3555F));

		PartDefinition cube_r587 = bone3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(128, 147).mirror().addBox(-0.342F, 8.5004F, 1.3525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.5159F, 4.8745F, -0.6189F, 0.3811F, -0.3899F));

		PartDefinition cube_r588 = bone3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(134, 26).mirror().addBox(-0.342F, 7.601F, -0.608F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(50, 133).mirror().addBox(-0.342F, 2.44F, -0.7546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.5159F, 4.8745F, -0.4008F, 0.3811F, -0.3899F));

		PartDefinition cube_r589 = bone3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(153, 84).mirror().addBox(-0.5F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(148, 12).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.1145F, 5.1075F, 2.1764F, -0.0953F, 0.3811F, -0.3899F));

		PartDefinition cube_r590 = bone3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(123, 144).mirror().addBox(-0.342F, 6.9226F, -3.0983F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.5159F, 4.8745F, 0.0356F, 0.3811F, -0.3899F));

		PartDefinition cube_r591 = bone3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(123, 82).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0661F, 0.4753F, 4.1507F, -0.2699F, 0.3811F, -0.3899F));

		PartDefinition cube_r592 = bone3.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(133, 54).mirror().addBox(-0.342F, 3.4152F, -1.4793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.5159F, 4.8745F, -0.2262F, 0.3811F, -0.3899F));

		PartDefinition cube_r593 = bone3.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(101, 85).mirror().addBox(0.0F, -2.8F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8812F, -1.3472F, 2.7285F, 0.5404F, 0.1751F, 0.0112F));

		PartDefinition cube_r594 = bone3.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(21, 123).mirror().addBox(-0.5F, -0.3F, -0.975F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3108F, -0.7279F, 2.1136F, 0.0792F, 0.3811F, -0.3899F));

		PartDefinition cube_r595 = bone3.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(119, 57).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3108F, -0.7279F, 2.1136F, 0.2974F, 0.3811F, -0.3899F));

		PartDefinition cube_r596 = bone3.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-0.5F, -2.0F, -1.6F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5728F, -3.526F, 3.4629F, 0.25F, 0.0361F, -0.1708F));

		PartDefinition cube_r597 = bone3.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(62, 113).mirror().addBox(-0.5F, -1.5F, -2.675F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6563F, -3.8881F, 2.8868F, -0.2038F, 0.0361F, -0.1708F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 0.1864F, -2.9738F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r598 = leftLeg.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 4.4142F, -9.8018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r599 = leftLeg.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.4F, -5.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1F, 1.7578F, -3.65F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r600 = leftLeg.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(106, 108).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -0.8857F, -1.2343F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r601 = leftLeg.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(97, 53).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 0.1998F, -1.7285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r602 = leftLeg.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(86, 6).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 4.0802F, -12.5922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r603 = leftLeg.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(0, 104).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 5.7912F, -11.8016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r604 = leftLeg.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(119, 73).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.2819F, -9.8513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r605 = leftLeg.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(30, 86).addBox(-1.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1F, 2.7237F, -5.9581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r606 = leftLeg.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(51, 78).addBox(-1.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.4769F, -1.9337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r607 = leftLeg.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(84, 20).addBox(-2.6F, -1.9616F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4149F, -1.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.5847F, -14.2994F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r608 = leftLeg3.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(87, 113).addBox(-1.0F, 0.0F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 1.9256F, 0.4139F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r609 = leftLeg3.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(12, 128).addBox(-1.0F, -0.275F, 1.525F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, -1.8195F, -1.5975F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r610 = leftLeg3.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(122, 117).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 0.8197F, -0.9381F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r611 = leftLeg3.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(140, 62).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 2.3246F, 0.9851F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r612 = leftLeg3.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(74, 77).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r613 = leftLeg3.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(132, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 2.5711F, -8.5709F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r614 = leftLeg3.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(101, 12).addBox(-1.0F, -0.575F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 1.9468F, -6.5213F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r615 = leftLeg3.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(114, 32).addBox(-1.0F, -0.575F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 1.1372F, -2.748F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r616 = leftLeg3.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(117, 68).addBox(-1.0F, -0.5F, 1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r617 = leftLeg3.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(128, 69).addBox(-1.0F, 1.15F, 3.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r618 = leftLeg3.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(133, 140).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1F, 1.929F, -0.6856F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r619 = leftLeg3.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(145, 22).addBox(-1.0F, 0.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 92).addBox(-1.0F, -1.5F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1F, 1.8108F, -0.0771F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r620 = leftLeg3.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 1.4658F, -3.8694F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r621 = leftLeg3.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(23, 47).addBox(-1.0F, -0.4F, -2.8F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, 1.979F, -5.0255F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0479F, 1.8728F, -8.4192F, -0.2049F, 0.0284F, 0.2521F));

		PartDefinition cube_r622 = leftLeg4.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(17, 80).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r623 = leftLeg4.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(65, 8).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r624 = leftLeg8.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(19, 65).addBox(-4.1915F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 0.1864F, -2.9738F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r625 = rightLeg.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(91, 72).addBox(-2.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 4.4142F, -9.8018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r626 = rightLeg.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(23, 28).addBox(-2.0F, -0.4F, -5.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 1.7578F, -3.65F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r627 = rightLeg.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(40, 109).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, -0.8857F, -1.2343F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r628 = rightLeg.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(106, 73).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 0.1998F, -1.7285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r629 = rightLeg.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(15, 86).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, 4.0802F, -12.5922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r630 = rightLeg.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(104, 78).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 5.7912F, -11.8016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r631 = rightLeg.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(121, 6).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.2819F, -9.8513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r632 = rightLeg.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(86, 33).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1F, 2.7237F, -5.9581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r633 = rightLeg.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(78, 59).addBox(-2.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.4769F, -1.9337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r634 = rightLeg.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(62, 85).addBox(-1.4F, -1.9616F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.4149F, -1.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.5847F, -14.2994F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r635 = rightLeg3.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(113, 112).addBox(-1.0F, 0.0F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.9256F, 0.4139F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r636 = rightLeg3.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(128, 44).addBox(-1.0F, -0.275F, 1.525F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -1.8195F, -1.5975F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r637 = rightLeg3.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(122, 122).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 0.8197F, -0.9381F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r638 = rightLeg3.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(140, 108).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 2.3246F, 0.9851F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r639 = rightLeg3.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(34, 78).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r640 = rightLeg3.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(132, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 2.5711F, -8.5709F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r641 = rightLeg3.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(101, 32).addBox(-1.0F, -0.575F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 1.9468F, -6.5213F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r642 = rightLeg3.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(117, 63).addBox(-1.0F, -0.575F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.1372F, -2.748F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r643 = rightLeg3.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(117, 77).addBox(-1.0F, -0.5F, 1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r644 = rightLeg3.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(128, 77).addBox(-1.0F, 1.15F, 3.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r645 = rightLeg3.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(140, 137).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, 1.929F, -0.6856F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r646 = rightLeg3.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(146, 81).addBox(-1.0F, 0.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 56).addBox(-1.0F, -1.5F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1F, 1.8108F, -0.0771F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r647 = rightLeg3.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(101, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1F, 1.4658F, -3.8694F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r648 = rightLeg3.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(44, 49).addBox(-1.0F, -0.4F, -2.8F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1F, 1.979F, -5.0255F, 0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0479F, 1.8728F, -8.4192F, -0.2062F, 0.0163F, -0.0386F));

		PartDefinition cube_r649 = rightLeg4.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(81, 0).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r650 = rightLeg4.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(65, 14).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r651 = rightLeg8.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(65, 35).addBox(-3.8085F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

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