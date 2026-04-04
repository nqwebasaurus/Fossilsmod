package fossils.fossils.client.blockentity.model.lavocatisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LavocatisaurusFossilModel extends SkullModelBase {
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
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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
	private final ModelPart tail14;
	private final ModelPart tail15;
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

	public LavocatisaurusFossilModel(ModelPart root) {
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
		this.neck6 = this.neckfront.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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
		this.tail14 = this.tail13.getChild("tail14");
		this.tail15 = this.tail14.getChild("tail15");
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

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0499F, 11.6579F, -0.2632F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-4.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 0).addBox(1.0F, -1.007F, 1.1001F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(27, 35).addBox(-1.0F, -2.007F, 0.1001F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 60).addBox(-0.5F, -8.6043F, 0.0314F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3072F, -4.765F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 128).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -6.3095F, -4.9082F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 125).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2752F, -5.8727F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.2155F, -0.0853F, -0.0186F));

		PartDefinition cube_r4 = bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -5.1818F, -5.7437F, 11.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0043F, -1.7643F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 143).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.0937F, -0.9299F, -0.0257F, 0.2656F, 0.5392F));

		PartDefinition cube_r6 = bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(154, 93).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.0937F, -0.9299F, 0.1431F, 0.138F, 1.7385F));

		PartDefinition cube_r7 = bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(124, 149).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, -0.0075F, 0.164F, 0.0608F));

		PartDefinition cube_r8 = bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 138).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, 0.0885F, 0.1384F, 0.6784F));

		PartDefinition cube_r9 = bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(154, 20).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.6937F, -3.7299F, 0.0674F, -0.0136F, 1.85F));

		PartDefinition cube_r10 = bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 143).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.0937F, -0.9299F, -0.0257F, -0.2656F, -0.5392F));

		PartDefinition cube_r11 = bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(154, 93).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.0937F, -0.9299F, 0.1431F, -0.138F, -1.7385F));

		PartDefinition cube_r12 = bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(124, 149).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, -0.0075F, -0.164F, -0.0608F));

		PartDefinition cube_r13 = bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 138).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, 0.0885F, -0.1384F, -0.6784F));

		PartDefinition cube_r14 = bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(154, 20).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.6937F, -3.7299F, 0.0674F, 0.0136F, -1.85F));

		PartDefinition cube_r15 = bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(89, 84).addBox(-1.0F, -0.0628F, 12.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7643F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(91, 110).addBox(-0.5F, -8.6F, -2.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8953F, 0.088F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 14).addBox(-0.5F, -7.8707F, -0.1173F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7028F, -4.7293F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0339F, -5.9274F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -0.0628F, 4.9492F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6928F, -10.735F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 129).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, 0.1504F, 0.089F, 0.2105F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, 0.1742F, -0.0128F, 0.8135F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(111, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.1909F, -3.7006F, -0.0391F, -0.1512F, 1.9885F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(108, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, 0.0104F, -0.0394F, 1.9837F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(43, 143).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, 0.0901F, 0.0759F, 0.8109F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(75, 136).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.0091F, -0.7006F, 0.0302F, 0.1139F, 0.1983F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(79, 129).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, 0.1504F, -0.089F, -0.2105F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, 0.1742F, 0.0128F, -0.8135F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(111, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.1909F, -3.7006F, -0.0391F, 0.1512F, -1.9885F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(108, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, 0.0104F, 0.0394F, -1.9837F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 143).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, 0.0901F, -0.0759F, -0.8109F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 136).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.0091F, -0.7006F, 0.0302F, -0.1139F, -0.1983F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 114).addBox(-0.5F, -7.691F, 0.7929F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 111).addBox(-0.5F, -7.418F, -1.8801F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7961F, -2.9351F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0376F, -5.8204F, 0.1725F, -0.129F, -0.0224F));

		PartDefinition cube_r33 = bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(75, 100).addBox(-3.7735F, 1.1202F, -6.964F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 11.8727F, -6.6209F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(77, 29).mirror().addBox(-10.2F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 12.8013F, -5.6772F, -0.3309F, 0.6944F, -0.0357F));

		PartDefinition cube_r35 = bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(46, 126).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, 0.1671F, 0.0827F, 0.1596F));

		PartDefinition cube_r36 = bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(103, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, 0.1842F, -0.0274F, 0.7611F));

		PartDefinition cube_r37 = bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(8, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.1572F, -4.2258F, -0.0489F, -0.1661F, 1.9377F));

		PartDefinition cube_r38 = bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-9.4F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4983F, 12.8013F, -5.6772F, -0.2946F, 0.5725F, 0.0246F));

		PartDefinition cube_r39 = bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-8.6F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5483F, 12.8203F, -5.6187F, -0.3848F, 0.4599F, 0.0781F));

		PartDefinition cube_r40 = bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-8.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6031F, 12.8401F, -5.5699F, -0.283F, 0.3237F, 0.1506F));

		PartDefinition cube_r41 = bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-7.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.6259F, -6.1272F, -0.2741F, 0.2133F, 0.1334F));

		PartDefinition cube_r42 = bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(153, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, -0.0237F, -0.1009F, 1.9344F));

		PartDefinition cube_r43 = bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, 0.1337F, 0.0208F, 0.7612F));

		PartDefinition cube_r44 = bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 126).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.9572F, -2.2258F, 0.0978F, 0.0936F, 0.1535F));

		PartDefinition cube_r45 = bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(154, 107).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, -0.0071F, -0.07F, 1.9325F));

		PartDefinition cube_r46 = bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(106, 142).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, 0.1116F, 0.048F, 0.76F));

		PartDefinition cube_r47 = bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(86, 123).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -0.5572F, -0.3258F, 0.064F, 0.1033F, 0.1498F));

		PartDefinition cube_r48 = bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 29).addBox(-0.8F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 12.8013F, -5.6772F, -0.3309F, -0.6944F, 0.0357F));

		PartDefinition cube_r49 = bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 65).addBox(-0.6F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4983F, 12.8013F, -5.6772F, -0.2946F, -0.5725F, -0.0246F));

		PartDefinition cube_r50 = bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 46).addBox(-0.4F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5483F, 12.8203F, -5.6187F, -0.3848F, -0.4599F, -0.0781F));

		PartDefinition cube_r51 = bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 31).addBox(0.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6031F, 12.8401F, -5.5699F, -0.283F, -0.3237F, -0.1506F));

		PartDefinition cube_r52 = bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 33).addBox(0.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.6259F, -6.1272F, -0.2741F, -0.2133F, -0.1334F));

		PartDefinition cube_r53 = bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(96, 19).addBox(-3.2735F, -0.0793F, -3.5022F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2735F, 11.8727F, -6.6209F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -1.5749F, 5.9699F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7111F, -11.8942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 128).addBox(-0.5F, -6.4F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5644F, -2.2693F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(127, 122).addBox(-0.5F, -6.8257F, -0.3923F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1137F, -0.4313F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(127, 98).addBox(-0.5F, -6.3F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0068F, -4.6303F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(8, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, -0.0489F, 0.1661F, -1.9377F));

		PartDefinition cube_r59 = bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(103, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, 0.1842F, 0.0274F, -0.7611F));

		PartDefinition cube_r60 = bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 126).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.1572F, -4.2258F, 0.1671F, -0.0827F, -0.1596F));

		PartDefinition cube_r61 = bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(153, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, -0.0237F, 0.1009F, -1.9344F));

		PartDefinition cube_r62 = bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, 0.1337F, -0.0208F, -0.7612F));

		PartDefinition cube_r63 = bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(43, 126).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.9572F, -2.2258F, 0.0978F, -0.0936F, -0.1535F));

		PartDefinition cube_r64 = bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(154, 107).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, -0.0071F, 0.07F, -1.9325F));

		PartDefinition cube_r65 = bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(106, 142).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, 0.1116F, -0.048F, -0.76F));

		PartDefinition cube_r66 = bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(86, 123).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -0.5572F, -0.3258F, 0.064F, -0.1033F, -0.1498F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1664F, -5.8252F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(150, 153).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, -0.1046F, -0.258F, 1.7937F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, 0.2489F, -0.1125F, 0.6008F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(40, 143).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.1091F, -4.5006F, 0.2685F, 0.0484F, 0.0106F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2091F, -2.5006F, -0.0762F, -0.2119F, 1.8736F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 137).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2091F, -2.5006F, 0.2164F, -0.0697F, 0.6902F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.2091F, -2.5006F, 0.2176F, 0.0658F, 0.0941F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 154).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, -0.052F, -0.1649F, 1.921F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(64, 144).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, 0.1819F, -0.0298F, 0.7439F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(83, 123).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, 0.6091F, -0.4006F, 0.1665F, 0.0794F, 0.1423F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(40, 143).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, 0.2685F, -0.0484F, -0.0106F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(19, 61).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2091F, -2.5006F, 0.2176F, -0.0658F, -0.0941F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 123).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, 0.1665F, -0.0794F, -0.1423F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 84).addBox(-1.0F, -1.5749F, -0.0301F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4552F, -6.0689F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(49, 126).addBox(-0.5F, -6.1F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1929F, -0.7763F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(150, 153).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, -0.1046F, 0.258F, -1.7937F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.1091F, -4.5006F, 0.2489F, 0.1125F, -0.6008F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(34, 86).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2091F, -2.5006F, -0.0762F, 0.2119F, -1.8736F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(30, 137).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.2091F, -2.5006F, 0.2164F, 0.0697F, -0.6902F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(5, 154).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, -0.052F, 0.1649F, -1.921F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 144).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, 0.6091F, -0.4006F, 0.1819F, 0.0298F, -0.7439F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(132, 97).addBox(-0.5F, -5.8F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5454F, -2.7475F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(132, 80).addBox(-0.5F, -5.1257F, -0.5423F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0769F, -4.2748F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neckbase = chest.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1995F, -6.0205F, -0.1581F, -0.1283F, 0.0262F));

		PartDefinition cube_r89 = neckbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(109, 145).mirror().addBox(-0.5F, -2.5F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7256F, 2.8645F, 0.0517F, 1.516F, -0.1589F, -0.0722F));

		PartDefinition cube_r90 = neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(141, 63).mirror().addBox(-0.1F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2603F, 2.7423F, -1.7394F, 1.7451F, -0.2152F, -0.7643F));

		PartDefinition cube_r91 = neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-2.2F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, 0.245F, -1.7688F, 1.6695F, -0.0504F, -1.4873F));

		PartDefinition cube_r92 = neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(0.0115F, -1.7085F, -0.0032F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5187F, -0.5251F, -0.6593F, 1.7336F, 0.0242F, 0.4916F));

		PartDefinition cube_r93 = neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0115F, -1.7085F, -0.0032F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5187F, -0.5251F, -0.6593F, 1.7336F, -0.0242F, -0.4916F));

		PartDefinition cube_r94 = neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(137, 0).addBox(-0.8F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, 0.245F, -1.7688F, 1.6695F, 0.0504F, 1.4873F));

		PartDefinition cube_r95 = neckbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(141, 63).addBox(-2.9F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2603F, 2.7423F, -1.7394F, 1.7451F, 0.2152F, 0.7643F));

		PartDefinition cube_r96 = neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(109, 145).addBox(-0.5F, -2.5F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7256F, 2.8645F, 0.0517F, 1.516F, 0.1589F, 0.0722F));

		PartDefinition cube_r97 = neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(118, 14).addBox(-1.0F, -1.0F, 7.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2505F, -10.7942F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r98 = neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 145).addBox(0.0F, -4.7F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9466F, -0.7679F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 1.1248F, -2.8694F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(101, 106).addBox(-1.0F, -1.0F, 3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8768F, -7.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(132, 121).addBox(0.0F, -3.7F, -1.5F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -1.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 131).mirror().addBox(-0.1885F, -1.3085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.9197F, -1.8391F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(131, 144).mirror().addBox(-0.2525F, -0.1192F, -0.2173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.645F, 1.5874F, -3.2093F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(101, 64).mirror().addBox(-2.2F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -0.7798F, -2.2494F, 1.6672F, -0.0546F, -1.4438F));

		PartDefinition cube_r104 = neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 141).mirror().addBox(-0.3F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, 1.2212F, -2.2421F, 1.7216F, -0.2322F, -0.6583F));

		PartDefinition cube_r105 = neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(54, 131).addBox(-0.8115F, -1.3085F, -0.8032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.9197F, -1.8391F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(131, 144).addBox(-0.7475F, -0.1192F, -0.2173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.645F, 1.5874F, -3.2093F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(101, 64).addBox(-0.8F, -0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -0.7798F, -2.2494F, 1.6672F, 0.0546F, 1.4438F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 141).addBox(-2.7F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3754F, 1.2212F, -2.2421F, 1.7216F, 0.2322F, 0.6583F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, -0.0421F, -0.2559F, 0.0557F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(118, 20).addBox(-1.0F, -1.0F, 0.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7768F, -3.9446F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(108, 151).mirror().addBox(1.825F, -0.4F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 126).mirror().addBox(-0.475F, -0.4F, -0.725F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6472F, 1.0605F, -2.4627F, 1.6667F, -0.0555F, -1.4351F));

		PartDefinition cube_r111 = neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(141, 60).mirror().addBox(-0.4F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2413F, 1.2472F, -2.3005F, 1.7216F, -0.2322F, -0.6583F));

		PartDefinition cube_r112 = neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(145, 120).mirror().addBox(-0.2525F, -0.1942F, -0.2674F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5909F, 1.8328F, -3.0256F, 1.6469F, -0.1589F, -0.0722F));

		PartDefinition cube_r113 = neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(134, 66).mirror().addBox(-0.1885F, -1.7085F, -0.3032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.7197F, -1.3391F, 1.7353F, 0.0043F, 0.6121F));

		PartDefinition cube_r114 = neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(141, 60).addBox(-2.6F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2413F, 1.2472F, -2.3005F, 1.7216F, 0.2322F, 0.6583F));

		PartDefinition cube_r115 = neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(145, 120).addBox(-0.7475F, -0.1942F, -0.2674F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5909F, 1.8328F, -3.0256F, 1.6469F, 0.1589F, 0.0722F));

		PartDefinition cube_r116 = neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(108, 151).addBox(-2.825F, -0.4F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 126).addBox(-2.525F, -0.4F, -0.725F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6472F, 1.0605F, -2.4627F, 1.6667F, 0.0555F, 1.4351F));

		PartDefinition cube_r117 = neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(134, 66).addBox(-0.8115F, -1.7085F, -0.3032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.7197F, -1.3391F, 1.7353F, -0.0043F, -0.6121F));

		PartDefinition cube_r118 = neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, -3.1F, -1.7F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neckmiddlebase = neck2.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(78, 110).addBox(-1.0F, -1.9461F, -4.0082F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1562F, -3.0466F, -0.1262F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neckmiddlebase.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 140).addBox(0.0F, -2.8F, -1.9F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3379F, -1.5502F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neckmiddlebase.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 135).mirror().addBox(-0.1885F, -2.6085F, -0.7032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.8428F, -1.1945F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r121 = neckmiddlebase.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(140, 8).mirror().addBox(-2.1F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2151F, -0.703F, -2.2048F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r122 = neckmiddlebase.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(115, 140).mirror().addBox(-0.2F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1254F, 1.2817F, -3.0619F, 1.7336F, -0.224F, -0.7114F));

		PartDefinition cube_r123 = neckmiddlebase.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(83, 140).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1563F, 1.3107F, -4.2015F, 1.5422F, -0.1589F, -0.0722F));

		PartDefinition cube_r124 = neckmiddlebase.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 135).addBox(-0.8115F, -2.6085F, -0.7032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.8428F, -1.1945F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r125 = neckmiddlebase.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(140, 8).addBox(-0.9F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2151F, -0.703F, -2.2048F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r126 = neckmiddlebase.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(115, 140).addBox(-2.8F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1254F, 1.2817F, -3.0619F, 1.7336F, 0.224F, 0.7114F));

		PartDefinition cube_r127 = neckmiddlebase.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(83, 140).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1563F, 1.3107F, -4.2015F, 1.5422F, 0.1589F, 0.0722F));

		PartDefinition neck3 = neckmiddlebase.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(107, 47).addBox(-1.0152F, -1.6032F, -3.8137F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, -0.3428F, -4.1945F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r128 = neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(141, 144).mirror().addBox(-0.2239F, -0.1629F, -0.2208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5427F, 1.9064F, -3.9019F, 1.5771F, -0.1589F, -0.0722F));

		PartDefinition cube_r129 = neck3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(147, 25).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7314F, 1.0694F, -2.8231F, 1.7433F, -0.2167F, -0.7555F));

		PartDefinition cube_r130 = neck3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(114, 61).mirror().addBox(-2.425F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2304F, -0.8602F, -2.8103F, 1.6716F, -0.046F, -1.5308F));

		PartDefinition cube_r131 = neck3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(125, 131).mirror().addBox(-0.1885F, -1.9085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -2.0F, -1.8F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r132 = neck3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(141, 144).addBox(-0.7761F, -0.1629F, -0.2208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5123F, 1.9064F, -3.9019F, 1.5771F, 0.1589F, 0.0722F));

		PartDefinition cube_r133 = neck3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(147, 25).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.701F, 1.0694F, -2.8231F, 1.7433F, 0.2167F, 0.7555F));

		PartDefinition cube_r134 = neck3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(114, 61).addBox(-0.575F, -0.5F, -0.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1999F, -0.8602F, -2.8103F, 1.6716F, 0.046F, 1.5308F));

		PartDefinition cube_r135 = neck3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(125, 131).addBox(-0.8115F, -1.9085F, -1.0032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -1.8F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r136 = neck3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 147).addBox(0.0F, -2.6F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -2.2522F, -1.675F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(109, 26).addBox(-1.201F, -1.6646F, -4.031F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1858F, 0.0613F, -3.7827F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 141).addBox(0.0F, -1.8F, -1.3F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, -2.4984F, -2.3362F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r138 = neck4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(33, 143).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 1.4662F, -3.1326F, 1.4458F, -0.0989F, 0.7621F));

		PartDefinition cube_r139 = neck4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(129, 116).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9044F, 1.1299F, -3.2227F, 1.5186F, -0.1505F, 0.1926F));

		PartDefinition cube_r140 = neck4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(136, 144).mirror().addBox(-0.2239F, -0.2629F, -0.2208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6909F, 1.6846F, -4.1506F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r141 = neck4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(131, 26).mirror().addBox(-0.1885F, -2.6085F, -0.2032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2162F, -1.5613F, -1.5173F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r142 = neck4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(131, 26).addBox(-0.8115F, -2.6085F, -0.2032F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8142F, -1.5613F, -1.5173F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r143 = neck4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(33, 143).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.887F, 1.4662F, -3.1326F, 1.4458F, 0.0989F, -0.7621F));

		PartDefinition cube_r144 = neck4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(129, 116).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5024F, 1.1299F, -3.2227F, 1.5186F, 0.1505F, -0.1926F));

		PartDefinition cube_r145 = neck4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(136, 144).addBox(-0.7761F, -0.2629F, -0.2208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2889F, 1.6846F, -4.1506F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition neckmiddlefront = neck4.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(51, 146).addBox(0.0F, -4.2944F, -3.1743F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(106, 80).addBox(-1.0F, -1.9454F, -3.913F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.201F, 0.263F, -4.1052F, -0.2819F, 0.0F, 0.0F));

		PartDefinition cube_r146 = neckmiddlefront.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(147, 22).mirror().addBox(-1.0F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0229F, -0.4344F, -2.7563F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r147 = neckmiddlefront.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(145, 74).mirror().addBox(-0.2239F, -0.4629F, -0.5708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.701F, 0.7191F, -3.7819F, 1.5596F, -0.1589F, -0.0722F));

		PartDefinition cube_r148 = neckmiddlefront.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(136, 77).mirror().addBox(-1.27F, -0.3769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.5422F, -3.4992F, 1.6592F, -0.058F, -1.3125F));

		PartDefinition cube_r149 = neckmiddlefront.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(146, 126).mirror().addBox(-0.1885F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0152F, -1.9422F, -2.1992F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r150 = neckmiddlefront.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(147, 22).addBox(-1.0F, -1.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0229F, -0.4344F, -2.7563F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r151 = neckmiddlefront.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(145, 74).addBox(-0.7761F, -0.4629F, -0.5708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.701F, 0.7191F, -3.7819F, 1.5596F, 0.1589F, 0.0722F));

		PartDefinition cube_r152 = neckmiddlefront.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(136, 77).addBox(-1.73F, -0.3769F, -0.5543F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3152F, -0.5422F, -3.4992F, 1.6592F, 0.058F, 1.3125F));

		PartDefinition cube_r153 = neckmiddlefront.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(146, 126).addBox(-0.8115F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0152F, -1.9422F, -2.1992F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neck5 = neckmiddlefront.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(109, 33).addBox(-1.0152F, -2.1013F, -4.101F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0152F, 0.1578F, -3.8992F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r154 = neck5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(46, 146).addBox(0.0F, -1.475F, -1.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -2.9503F, -2.5623F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(147, 19).mirror().addBox(-0.8F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0381F, -0.7903F, -3.2444F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r156 = neck5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(145, 45).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4074F, 0.3834F, -4.4382F, 1.4636F, -0.1589F, -0.0722F));

		PartDefinition cube_r157 = neck5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(133, 44).mirror().addBox(-1.181F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3304F, -0.8981F, -3.9872F, 1.6444F, 0.1153F, -1.2984F));

		PartDefinition cube_r158 = neck5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(146, 143).mirror().addBox(-0.1885F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0304F, -2.2981F, -2.6872F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r159 = neck5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(147, 19).addBox(-1.2F, -0.9F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0076F, -0.7903F, -3.2444F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition cube_r160 = neck5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(145, 45).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.377F, 0.3834F, -4.4382F, 1.4636F, 0.1589F, 0.0722F));

		PartDefinition cube_r161 = neck5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(133, 44).addBox(-1.819F, -0.2229F, -0.5854F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, -0.8981F, -3.9872F, 1.6444F, -0.1153F, 1.2984F));

		PartDefinition cube_r162 = neck5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(146, 143).addBox(-0.8115F, -1.8085F, -0.0032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2981F, -2.6872F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition neckfront = neck5.addOrReplaceChild("neckfront", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -0.0212F, -3.9931F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(22, 142).addBox(0.0F, -2.3271F, -3.8831F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0152F, -2.0813F, -4.0382F, -0.0108F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neckfront.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(64, 152).mirror().addBox(-0.625F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5229F, 0.7364F, -3.7345F, 1.6694F, -0.2583F, -0.4441F));

		PartDefinition cube_r164 = neckfront.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 147).mirror().addBox(-0.434F, -1.2078F, -0.1756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, -0.2714F, -3.1774F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r165 = neckfront.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7395F, 0.6003F, -3.2736F, 1.662F, -0.0186F, -1.3615F));

		PartDefinition cube_r166 = neckfront.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(17, 147).mirror().addBox(-0.6F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7188F, 1.7457F, -3.9654F, 1.4466F, -0.2116F, -0.0613F));

		PartDefinition cube_r167 = neckfront.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 147).addBox(-0.566F, -1.2078F, -0.1756F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, -0.2714F, -3.1774F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r168 = neckfront.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(146, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.7395F, 0.6003F, -3.2736F, 1.662F, 0.0186F, 1.3615F));

		PartDefinition cube_r169 = neckfront.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 147).addBox(-0.4F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7188F, 1.7457F, -3.9654F, 1.4466F, 0.2116F, 0.0613F));

		PartDefinition cube_r170 = neckfront.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(64, 152).addBox(-0.375F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5229F, 0.7364F, -3.7345F, 1.6694F, 0.2583F, 0.4441F));

		PartDefinition neck6 = neckfront.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0788F, -3.8931F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck6.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(59, 152).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5393F, 1.4554F, -3.0865F, 1.6315F, 0.0499F, -0.6879F));

		PartDefinition cube_r172 = neck6.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(147, 3).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2752F, 0.1144F, -2.8013F, 1.6909F, -0.0258F, 0.6117F));

		PartDefinition cube_r173 = neck6.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(141, 108).mirror().addBox(-1.342F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5501F, 0.4074F, -2.9691F, 1.6321F, 0.0624F, -1.1907F));

		PartDefinition cube_r174 = neck6.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(145, 114).mirror().addBox(-0.9784F, -0.2262F, -0.2499F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3251F, 1.9221F, -3.8608F, 1.6569F, -0.1207F, -0.0768F));

		PartDefinition cube_r175 = neck6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(59, 152).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5393F, 1.4554F, -3.0865F, 1.6315F, -0.0499F, 0.6879F));

		PartDefinition cube_r176 = neck6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(147, 3).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2752F, 0.1144F, -2.8013F, 1.6909F, 0.0258F, -0.6117F));

		PartDefinition cube_r177 = neck6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(154, 16).addBox(-0.5501F, -2.1063F, 0.1629F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5501F, 0.4074F, -2.9691F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(141, 108).addBox(-0.658F, -0.7264F, -0.5108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5501F, 0.4074F, -2.9691F, 1.6321F, -0.0624F, 1.1907F));

		PartDefinition cube_r179 = neck6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(145, 114).addBox(-0.0216F, -0.2262F, -0.2499F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3251F, 1.9221F, -3.8608F, 1.6569F, 0.1207F, 0.0768F));

		PartDefinition cube_r180 = neck6.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(78, 117).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, 0.3037F, -4.1032F, 0.0595F, -0.1698F, -0.0961F));

		PartDefinition cube_r181 = neck7.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(125, 107).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0282F, 0.0963F, 4.1032F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck7.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(11, 154).addBox(-0.9282F, -1.7885F, -0.9749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4F, -1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r183 = neck7.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(54, 152).mirror().addBox(-0.2826F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.5F, -1.7F, 1.7688F, 0.0329F, -0.1625F));

		PartDefinition cube_r184 = neck7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(10, 150).mirror().addBox(-0.1344F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.4F, -1.2F, 1.704F, -0.0957F, 0.6056F));

		PartDefinition cube_r185 = neck7.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(150, 76).mirror().addBox(-0.5514F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.5F, -1.7F, 1.678F, 0.1758F, -1.1852F));

		PartDefinition cube_r186 = neck7.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(150, 49).mirror().addBox(-0.5356F, -0.5847F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 1.1F, -2.0F, 1.4478F, -0.1105F, -0.0909F));

		PartDefinition cube_r187 = neck7.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(10, 150).addBox(-0.8656F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4F, -1.2F, 1.704F, 0.0957F, -0.6056F));

		PartDefinition cube_r188 = neck7.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(150, 76).addBox(-0.4486F, -0.9023F, -0.6206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9F, 0.5F, -1.7F, 1.678F, -0.1758F, 1.1852F));

		PartDefinition cube_r189 = neck7.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(150, 49).addBox(-0.4644F, -0.5847F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 1.1F, -2.0F, 1.4478F, 0.1105F, 0.0909F));

		PartDefinition cube_r190 = neck7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 152).addBox(-0.7174F, -0.8626F, -0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.5F, -1.7F, 1.7688F, -0.0329F, 0.1625F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 0.3713F, -2.8968F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition cube_r191 = neck8.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(154, 41).addBox(-0.9282F, -1.5885F, -0.8749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -0.7032F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck8.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(73, 152).mirror().addBox(-0.2826F, -0.7626F, -1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.3287F, -1.2032F, 1.7688F, 0.0329F, -0.1625F));

		PartDefinition cube_r193 = neck8.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(150, 12).mirror().addBox(-0.1344F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.2287F, -0.7032F, 1.704F, -0.0957F, 0.6056F));

		PartDefinition cube_r194 = neck8.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(-0.6514F, -0.8023F, -0.6956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.3287F, -1.2032F, 1.678F, 0.1758F, -1.1852F));

		PartDefinition cube_r195 = neck8.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(147, 28).mirror().addBox(-0.5356F, -0.5847F, -0.5341F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.9287F, -1.5032F, 1.4478F, -0.1105F, -0.0909F));

		PartDefinition cube_r196 = neck8.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(150, 12).addBox(-0.8656F, -1.4955F, 0.1136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, 0.2287F, -0.7032F, 1.704F, 0.0957F, -0.6056F));

		PartDefinition cube_r197 = neck8.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(150, 70).addBox(-0.3486F, -0.8023F, -0.6956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, 0.3287F, -1.2032F, 1.678F, -0.1758F, 1.1852F));

		PartDefinition cube_r198 = neck8.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(147, 28).addBox(-0.4644F, -0.5847F, -0.5341F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.9287F, -1.5032F, 1.4478F, 0.1105F, 0.0909F));

		PartDefinition cube_r199 = neck8.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(73, 152).addBox(-0.7174F, -0.7626F, -1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.3287F, -1.2032F, 1.7688F, -0.0329F, 0.1625F));

		PartDefinition cube_r200 = neck8.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.275F, 7.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6696F, -2.9711F, 0.4342F, -0.0829F, -0.1337F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(132, 135).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4399F, -0.8214F, 0.1134F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(140, 111).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.6036F, 0.1333F, 0.1571F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(113, 151).addBox(-1.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.7273F, -5.7646F, 2.3649F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(56, 148).addBox(-1.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.9343F, -4.6108F, 2.1729F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(22, 148).addBox(-1.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.4955F, -4.2016F, 2.3911F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(114, 147).addBox(-1.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.477F, -3.1946F, 2.3387F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(147, 33).addBox(-1.0F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.3955F, -2.138F, 2.2864F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(150, 123).addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5F, -1.6163F, -1.8044F, -2.5569F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(94, 135).addBox(-1.0F, -1.8F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.8362F, -1.2462F, -2.7663F, 0.0F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(137, 98).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.9237F, -3.7521F, -0.9599F, 0.0F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(137, 95).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.3064F, -4.6759F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(115, 137).addBox(-1.0F, -1.6F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(137, 101).addBox(-1.0F, -1.6F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(137, 92).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 3.3064F, -4.6759F, 1.8326F, 0.0F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(138, 25).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.0659F, -6.0397F, 2.5482F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(137, 83).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.4923F, -5.2205F, -2.5307F, 0.0F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(138, 22).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1503F, -4.2808F, -1.2217F, 0.0F, 0.0F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(138, 19).addBox(-1.0F, -0.45F, -1.525F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.7315F, -2.8008F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(138, 16).addBox(-1.0F, -0.6F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7315F, -2.8008F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(137, 80).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.5084F, -1.5201F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(125, 72).addBox(-1.0F, -1.2F, -2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(122, 43).addBox(-1.0F, -0.9F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.102F, 0.3107F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(127, 76).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.0293F, -1.7922F, 1.8413F, 0.0F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(96, 26).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.6791F, -0.8555F, 1.9286F, 0.0F, 0.0F));

		PartDefinition head_r22 = head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(81, 6).addBox(-1.0F, -0.575F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8205F, -1.0654F, 1.309F, 0.0F, 0.0F));

		PartDefinition head_r23 = head.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(138, 28).addBox(-1.0F, -0.625F, -0.425F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.2424F, -0.2831F, 0.0524F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.1914F, -0.9513F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(88, 144).mirror().addBox(-0.5F, -0.3F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(88, 144).addBox(1.32F, -0.3F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.92F, 0.389F, -0.5519F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(44, 151).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 151).addBox(1.72F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.095F, 1.2088F, -1.9263F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(5, 151).mirror().addBox(-0.675F, 0.325F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 148).mirror().addBox(-0.5F, -0.125F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(5, 151).addBox(1.495F, 0.325F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 148).addBox(1.32F, -0.125F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, 0.1119F, -0.6701F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(146, 101).mirror().addBox(-0.5F, -0.475F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(146, 98).mirror().addBox(-0.5F, -0.15F, -2.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(95, 144).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(146, 101).addBox(0.32F, -0.475F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(146, 98).addBox(0.32F, -0.15F, -2.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(95, 144).addBox(1.32F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.92F, 1.6539F, -2.6398F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(-0.1F, -0.025F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(122, 146).addBox(0.12F, -0.025F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.02F, 3.1361F, -3.4467F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(15, 152).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(15, 152).addBox(1.32F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, 1.1177F, -2.1899F, 2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(152, 3).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(152, 3).addBox(1.32F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.92F, 0.9179F, -2.1812F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(142, 37).mirror().addBox(-0.5F, -0.175F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(142, 37).addBox(1.32F, -0.175F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.92F, 2.5894F, -2.4379F, -2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(149, 84).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(149, 84).addBox(1.32F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.92F, 1.6059F, -2.3258F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(145, 11).mirror().addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(145, 11).addBox(1.32F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, 0.8153F, 0.349F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(151, 150).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(151, 150).addBox(1.32F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, 0.3116F, -1.8311F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(151, 147).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(151, 147).addBox(1.32F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.92F, -0.1613F, -1.315F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 152).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 152).addBox(1.32F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, 0.0251F, -0.1777F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(150, 63).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(150, 63).addBox(1.32F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -0.1596F, 0.1771F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.6354F, -0.3301F));

		PartDefinition head_r24 = leftFace.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(153, 104).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.75F, -1.6587F, 0.3013F, 0.4189F, 0.0F, 0.0F));

		PartDefinition head_r25 = leftFace.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(153, 101).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.75F, -1.417F, -0.0114F, 1.6232F, 0.0F, 0.0F));

		PartDefinition head_r26 = leftFace.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(130, 150).addBox(-0.475F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.429F, 0.5657F, 0.4337F));

		PartDefinition head_r27 = leftFace.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(150, 138).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.1F, -2.2517F, -1.4743F, -2.5569F, 0.0F, 0.0F));

		PartDefinition head_r28 = leftFace.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(140, 150).addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.3048F, 0.8388F, 0.7574F));

		PartDefinition head_r29 = leftFace.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(135, 150).addBox(-0.475F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, -1.9745F, -1.5307F, -2.3824F, 0.7656F, 0.6496F));

		PartDefinition head_r30 = leftFace.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(148, 66).addBox(-0.8F, -1.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1052F, -2.022F, -1.8181F, 2.2876F, 0.0527F, 0.0458F));

		PartDefinition head_r31 = leftFace.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(135, 153).addBox(-0.5F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(153, 132).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.75F, -0.6641F, -0.4566F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r32 = leftFace.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(130, 153).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, -1.1303F, -0.8342F, 2.2515F, 0.0F, 0.0F));

		PartDefinition head_r33 = leftFace.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(30, 153).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(153, 0).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.825F, -0.413F, -0.8866F, -1.3177F, 0.0F, 0.0F));

		PartDefinition head_r34 = leftFace.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(152, 34).addBox(-0.5F, -0.625F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.825F, -0.413F, -0.8866F, -0.8378F, 0.0F, 0.0F));

		PartDefinition head_r35 = leftFace.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(150, 53).addBox(-0.5F, -0.475F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.725F, 0.2932F, -0.7062F, -0.9338F, 0.0F, 0.0F));

		PartDefinition head_r36 = leftFace.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(145, 152).addBox(-0.5F, -0.575F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.725F, 0.2932F, -0.7062F, 0.5498F, 0.0F, 0.0F));

		PartDefinition head_r37 = leftFace.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(153, 87).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.725F, 0.9721F, -0.9491F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r38 = leftFace.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(151, 144).addBox(-0.5F, -0.8F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.725F, 1.1068F, -4.0456F, -2.8972F, 0.0F, 0.0F));

		PartDefinition head_r39 = leftFace.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(151, 141).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.725F, 1.01F, -3.6575F, -2.8972F, 0.0F, 0.0F));

		PartDefinition head_r40 = leftFace.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(150, 60).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.725F, 1.4784F, -2.9499F, -1.3701F, 0.0F, 0.0F));

		PartDefinition head_r41 = leftFace.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(150, 57).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.725F, 1.8759F, -3.3993F, -0.8465F, 0.0F, 0.0F));

		PartDefinition head_r42 = leftFace.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(151, 126).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.725F, 2.1668F, -3.9241F, 0.5061F, 0.0F, 0.0F));

		PartDefinition head_r43 = leftFace.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(153, 98).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.725F, 1.9764F, -4.4931F, 1.2479F, 0.0F, 0.0F));

		PartDefinition head_r44 = leftFace.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(153, 90).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.725F, 1.6674F, -4.151F, 1.597F, 0.0F, 0.0F));

		PartDefinition head_r45 = leftFace.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(78, 153).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.725F, 1.1173F, -1.5313F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r46 = leftFace.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(153, 66).addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.725F, 0.722F, -1.7167F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head_r47 = leftFace.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(153, 129).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.75F, -1.6886F, -1.0541F, -2.7663F, 0.0F, 0.0F));

		PartDefinition head_r48 = leftFace.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(118, 153).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.75F, -2.3527F, -0.5259F, -1.4573F, 0.0F, 0.0F));

		PartDefinition head_r49 = leftFace.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(153, 112).addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, -1.9559F, -0.4502F, -0.192F, 0.0F, 0.0F));

		PartDefinition head_r50 = leftFace.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(97, 152).addBox(-0.8F, -2.9F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 152).addBox(-0.975F, -2.9F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(87, 152).addBox(-1.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2F, 0.8231F, 0.0498F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r51 = leftFace.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(150, 8).addBox(-0.7F, 2.3763F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.9F, 0.6721F, -4.4821F, 2.2602F, -0.0349F, 0.0F));

		PartDefinition head_r52 = leftFace.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(150, 45).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5896F, -1.9718F, -1.3229F, 1.8064F, -0.0349F, 0.0F));

		PartDefinition head_r53 = leftFace.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(152, 28).addBox(-0.7F, 1.8756F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(152, 31).addBox(-0.7F, 1.3756F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9F, 0.6721F, -4.4821F, 2.2951F, -0.0349F, 0.0F));

		PartDefinition head_r54 = leftFace.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(142, 41).addBox(-0.7F, 0.098F, -0.1607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.9F, 0.6721F, -4.4821F, 0.8988F, -0.0349F, 0.0F));

		PartDefinition head_r55 = leftFace.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(49, 142).addBox(-0.7F, -0.2863F, -0.6013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9F, 0.6721F, -4.4821F, 0.5498F, -0.0349F, 0.0F));

		PartDefinition head_r56 = leftFace.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(10, 147).addBox(-1.8F, 0.2999F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(147, 16).addBox(-1.8F, -0.2751F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4298F, 0.3818F, -1.5533F, 0.1222F, 0.0F));

		PartDefinition head_r57 = leftFace.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(146, 131).addBox(-1.8F, 0.6951F, -0.1059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4298F, 0.3818F, -1.6755F, 0.1222F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.6354F, -0.3301F));

		PartDefinition head_r58 = rightFace.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(153, 104).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.6587F, 0.3013F, 0.4189F, 0.0F, 0.0F));

		PartDefinition head_r59 = rightFace.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(153, 101).mirror().addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.417F, -0.0114F, 1.6232F, 0.0F, 0.0F));

		PartDefinition head_r60 = rightFace.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(130, 150).mirror().addBox(-0.525F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.429F, -0.5657F, -0.4337F));

		PartDefinition head_r61 = rightFace.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(150, 138).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.1F, -2.2517F, -1.4743F, -2.5569F, 0.0F, 0.0F));

		PartDefinition head_r62 = rightFace.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(140, 150).mirror().addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.3048F, -0.8388F, -0.7574F));

		PartDefinition head_r63 = rightFace.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(135, 150).mirror().addBox(-0.525F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9745F, -1.5307F, -2.3824F, -0.7656F, -0.6496F));

		PartDefinition head_r64 = rightFace.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(148, 66).mirror().addBox(-0.2F, -1.725F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -2.022F, -1.8181F, 2.2876F, -0.0527F, -0.0458F));

		PartDefinition head_r65 = rightFace.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(135, 153).mirror().addBox(-0.5F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(153, 132).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -0.6641F, -0.4566F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r66 = rightFace.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(130, 153).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.1303F, -0.8342F, 2.2515F, 0.0F, 0.0F));

		PartDefinition head_r67 = rightFace.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(30, 153).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(153, 0).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.413F, -0.8866F, -1.3177F, 0.0F, 0.0F));

		PartDefinition head_r68 = rightFace.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(152, 34).mirror().addBox(-0.5F, -0.625F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.413F, -0.8866F, -0.8378F, 0.0F, 0.0F));

		PartDefinition head_r69 = rightFace.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(150, 53).mirror().addBox(-0.5F, -0.475F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 0.2932F, -0.7062F, -0.9338F, 0.0F, 0.0F));

		PartDefinition head_r70 = rightFace.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(145, 152).mirror().addBox(-0.5F, -0.575F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 0.2932F, -0.7062F, 0.5498F, 0.0F, 0.0F));

		PartDefinition head_r71 = rightFace.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(153, 87).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 0.9721F, -0.9491F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r72 = rightFace.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(151, 144).mirror().addBox(-0.5F, -0.8F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.1068F, -4.0456F, -2.8972F, 0.0F, 0.0F));

		PartDefinition head_r73 = rightFace.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(151, 141).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.01F, -3.6575F, -2.8972F, 0.0F, 0.0F));

		PartDefinition head_r74 = rightFace.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(150, 60).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.4784F, -2.9499F, -1.3701F, 0.0F, 0.0F));

		PartDefinition head_r75 = rightFace.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(150, 57).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.8759F, -3.3993F, -0.8465F, 0.0F, 0.0F));

		PartDefinition head_r76 = rightFace.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(151, 126).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 2.1668F, -3.9241F, 0.5061F, 0.0F, 0.0F));

		PartDefinition head_r77 = rightFace.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(153, 98).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.9764F, -4.4931F, 1.2479F, 0.0F, 0.0F));

		PartDefinition head_r78 = rightFace.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(153, 90).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.6674F, -4.151F, 1.597F, 0.0F, 0.0F));

		PartDefinition head_r79 = rightFace.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(78, 153).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 1.1173F, -1.5313F, 1.8151F, 0.0F, 0.0F));

		PartDefinition head_r80 = rightFace.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(153, 66).mirror().addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.725F, 0.722F, -1.7167F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head_r81 = rightFace.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(153, 129).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.6886F, -1.0541F, -2.7663F, 0.0F, 0.0F));

		PartDefinition head_r82 = rightFace.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(118, 153).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -2.3527F, -0.5259F, -1.4573F, 0.0F, 0.0F));

		PartDefinition head_r83 = rightFace.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(153, 112).mirror().addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.9559F, -0.4502F, -0.192F, 0.0F, 0.0F));

		PartDefinition head_r84 = rightFace.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(97, 152).mirror().addBox(-0.2F, -2.9F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(92, 152).mirror().addBox(-0.025F, -2.9F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 152).mirror().addBox(0.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.8231F, 0.0498F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r85 = rightFace.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(150, 8).mirror().addBox(-0.3F, 2.3763F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6721F, -4.4821F, 2.2602F, 0.0349F, 0.0F));

		PartDefinition head_r86 = rightFace.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(150, 45).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5896F, -1.9718F, -1.3229F, 1.8064F, 0.0349F, 0.0F));

		PartDefinition head_r87 = rightFace.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(152, 28).mirror().addBox(-0.3F, 1.8756F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(152, 31).mirror().addBox(-0.3F, 1.3756F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6721F, -4.4821F, 2.2951F, 0.0349F, 0.0F));

		PartDefinition head_r88 = rightFace.addOrReplaceChild("head_r88", CubeListBuilder.create().texOffs(142, 41).mirror().addBox(-0.3F, 0.098F, -0.1607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6721F, -4.4821F, 0.8988F, 0.0349F, 0.0F));

		PartDefinition head_r89 = rightFace.addOrReplaceChild("head_r89", CubeListBuilder.create().texOffs(49, 142).mirror().addBox(-0.3F, -0.2863F, -0.6013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6721F, -4.4821F, 0.5498F, 0.0349F, 0.0F));

		PartDefinition head_r90 = rightFace.addOrReplaceChild("head_r90", CubeListBuilder.create().texOffs(10, 147).mirror().addBox(-0.2F, 0.2999F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(147, 16).mirror().addBox(-0.2F, -0.2751F, -0.2157F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4298F, 0.3818F, -1.5533F, -0.1222F, 0.0F));

		PartDefinition head_r91 = rightFace.addOrReplaceChild("head_r91", CubeListBuilder.create().texOffs(146, 131).mirror().addBox(-0.2F, 0.6951F, -0.1059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4298F, 0.3818F, -1.6755F, -0.1222F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 9.0647F, -8.6888F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(92, 31).addBox(0.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, 5.2696F, -2.2166F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(96, 139).addBox(-0.5239F, -1.0994F, -1.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 1.0263F, -0.3654F, 0.4067F));

		PartDefinition cube_r217 = leftArm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(125, 60).addBox(-0.5239F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 0.7209F, -0.3654F, 0.4067F));

		PartDefinition cube_r218 = leftArm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(143, 70).addBox(-0.5739F, -1.3269F, -2.6598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0329F, 2.4523F, -1.6685F, 1.3022F, -0.4218F, 0.392F));

		PartDefinition cube_r219 = leftArm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(43, 121).addBox(-0.5F, -0.575F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1412F, 8.2328F, -3.7604F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftArm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(115, 133).addBox(-0.5F, -1.3F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1412F, 7.3236F, -2.8313F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(146, 87).addBox(-1.0F, 0.125F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 112).addBox(-1.0F, -0.875F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3588F, 9.0685F, -4.6901F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 133).addBox(-1.0F, -0.175F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3588F, 9.0685F, -4.6901F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(134, 52).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1412F, 7.3236F, -2.8313F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftArm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(122, 33).addBox(-0.5F, -0.5F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1412F, 8.2328F, -3.7604F, 1.1694F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0921F, 10.6791F, -5.4788F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(34, 115).addBox(-0.9F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.124F)), PartPose.offsetAndRotation(-0.8926F, 3.7204F, -1.7165F, 2.2468F, 1.4605F, 0.6942F));

		PartDefinition cube_r226 = leftArm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(107, 54).addBox(-1.9F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(114, 106).addBox(-0.9F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8926F, 3.7204F, -1.7165F, 0.8856F, 1.4597F, -0.673F));

		PartDefinition cube_r227 = leftArm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(117, 92).addBox(1.6113F, -1.5823F, -8.966F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.0333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition cube_r228 = leftArm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(39, 138).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6471F, 2.0869F, 1.6811F, 0.2257F, 1.1772F, -1.3467F));

		PartDefinition cube_r229 = leftArm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 148).addBox(-0.4F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7255F, 2.4471F, 0.7081F, 2.5559F, 1.4149F, 1.0059F));

		PartDefinition cube_r230 = leftArm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(124, 142).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6486F, 8.129F, 0.5979F, 3.042F, -0.5295F, 1.6364F));

		PartDefinition cube_r231 = leftArm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(148, 104).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7351F, 8.086F, -0.3974F, 2.0455F, -1.4741F, 2.6802F));

		PartDefinition cube_r232 = leftArm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(149, 37).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7993F, 7.2931F, -1.0035F, 0.1407F, -0.9122F, -1.6671F));

		PartDefinition cube_r233 = leftArm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(146, 148).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7993F, 6.3083F, -0.8298F, 0.0873F, -0.1745F, -1.5708F));

		PartDefinition cube_r234 = leftArm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(137, 121).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.769F, 4.4287F, -0.1471F, 0.2463F, 1.2111F, -1.3245F));

		PartDefinition cube_r235 = leftArm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 106).addBox(0.0113F, -0.0823F, -11.666F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(63, 130).addBox(-0.3887F, -0.0823F, -6.666F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.2253F, -1.2163F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftArm3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(99, 80).addBox(-0.3F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6604F, 2.0039F, -0.4034F, 2.0623F, 0.1574F, 1.1198F));

		PartDefinition cube_r237 = leftArm3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(107, 124).addBox(-0.4F, -1.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.827F, 1.676F, 0.9994F, 1.388F, 0.3006F, -0.0547F));

		PartDefinition cube_r238 = leftArm3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(106, 87).addBox(-0.7F, -2.1502F, -15.8157F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.127F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftArm3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(118, 122).addBox(0.2F, -1.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.827F, 1.5891F, 0.507F, 1.3746F, -0.4721F, 0.0902F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 9.0647F, -8.6888F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(92, 39).addBox(-2.0F, -0.8785F, 0.0381F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, 5.2696F, -2.2166F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(139, 129).addBox(-0.4761F, -1.0994F, -1.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 1.0263F, 0.3654F, -0.4067F));

		PartDefinition cube_r242 = rightArm.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(125, 66).addBox(-0.4761F, -1.3382F, 0.588F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 0.7209F, 0.3654F, -0.4067F));

		PartDefinition cube_r243 = rightArm.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(115, 143).addBox(-0.4261F, -1.3269F, -2.6598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0329F, 2.4523F, -1.6685F, 1.3022F, 0.4218F, -0.392F));

		PartDefinition cube_r244 = rightArm.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(122, 6).addBox(-1.5F, -0.575F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1412F, 8.2328F, -3.7604F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightArm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(7, 134).addBox(-1.5F, -1.3F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1412F, 7.3236F, -2.8313F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightArm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(146, 90).addBox(-1.0F, 0.125F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 36).addBox(-1.0F, -0.875F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3588F, 9.0685F, -4.6901F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightArm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(133, 32).addBox(-1.0F, -0.175F, -1.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3588F, 9.0685F, -4.6901F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(134, 56).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1412F, 7.3236F, -2.8313F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightArm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(122, 38).addBox(-1.5F, -0.5F, 1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1412F, 8.2328F, -3.7604F, 1.1694F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0921F, 10.6791F, -5.4788F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightArm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(116, 99).addBox(-0.1F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.124F)), PartPose.offsetAndRotation(0.8926F, 3.7204F, -1.7165F, 2.2468F, -1.4605F, -0.6942F));

		PartDefinition cube_r251 = rightArm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(122, 11).addBox(-0.1F, -0.5F, -4.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(45, 115).addBox(-0.1F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.8926F, 3.7204F, -1.7165F, 0.8856F, -1.4597F, 0.673F));

		PartDefinition cube_r252 = rightArm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 118).addBox(-2.6113F, -1.5823F, -8.966F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition cube_r253 = rightArm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(138, 47).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6471F, 2.0869F, 1.6811F, 0.2257F, -1.1772F, 1.3467F));

		PartDefinition cube_r254 = rightArm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(97, 148).addBox(-0.6F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7255F, 2.4471F, 0.7081F, 2.5559F, -1.4149F, -1.0059F));

		PartDefinition cube_r255 = rightArm2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 143).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6486F, 8.129F, 0.5979F, 3.042F, 0.5295F, -1.6364F));

		PartDefinition cube_r256 = rightArm2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(148, 134).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7351F, 8.086F, -0.3974F, 2.0455F, 1.4741F, -2.6802F));

		PartDefinition cube_r257 = rightArm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(149, 80).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7993F, 7.2931F, -1.0035F, 0.1407F, 0.9122F, 1.6671F));

		PartDefinition cube_r258 = rightArm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(149, 41).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7993F, 6.3083F, -0.8298F, 0.0873F, 0.1745F, 1.5708F));

		PartDefinition cube_r259 = rightArm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(124, 137).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.769F, 4.4287F, -0.1471F, 0.2463F, -1.2111F, 1.3245F));

		PartDefinition cube_r260 = rightArm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(30, 106).addBox(-1.0113F, -0.0823F, -11.666F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(94, 130).addBox(-1.6113F, -0.0823F, -6.666F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.2253F, -1.2163F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightArm3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(141, 66).addBox(-0.7F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6604F, 2.0039F, -0.4034F, 2.0623F, -0.1574F, -1.1198F));

		PartDefinition cube_r262 = rightArm3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(54, 125).addBox(-0.6F, -1.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.827F, 1.676F, 0.9994F, 1.388F, -0.3006F, 0.0547F));

		PartDefinition cube_r263 = rightArm3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(112, 64).addBox(-2.3F, -2.1502F, -15.8157F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.127F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightArm3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(63, 124).addBox(-1.2F, -1.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.827F, 1.5891F, 0.507F, 1.3746F, 0.4721F, -0.0902F));

		PartDefinition bone = bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7F, -0.0199F, -6.1909F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r265 = bone.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(90, 100).addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2571F, 6.1307F, -6.7505F, 0.6919F, 0.9798F, 0.4572F));

		PartDefinition cube_r266 = bone.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(111, 6).addBox(-0.5F, -2.3437F, -2.5607F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.2571F, 6.1307F, -6.7505F, 1.6344F, 0.9798F, 0.4572F));

		PartDefinition cube_r267 = bone.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(89, 139).addBox(-0.4217F, 2.3812F, 2.1482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 1.4681F, 0.0076F, -0.253F));

		PartDefinition cube_r268 = bone.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(119, 149).addBox(-0.4217F, -3.1912F, 3.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.4209F, 0.0076F, -0.253F));

		PartDefinition cube_r269 = bone.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(150, 117).addBox(-0.4217F, 2.0368F, -3.9353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -2.6857F, 0.0076F, -0.253F));

		PartDefinition cube_r270 = bone.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(141, 104).addBox(-0.4217F, 2.523F, 0.3295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 2.2448F, 0.0076F, -0.253F));

		PartDefinition cube_r271 = bone.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(54, 137).addBox(-0.4217F, -3.5267F, -0.8556F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -2.0749F, 0.0076F, -0.253F));

		PartDefinition cube_r272 = bone.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(9, 123).addBox(-0.4217F, -2.2704F, -1.1112F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -1.2895F, 0.0076F, -0.253F));

		PartDefinition cube_r273 = bone.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(138, 116).addBox(-0.4217F, -2.0375F, 0.29F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.5431F, 0.0076F, -0.253F));

		PartDefinition cube_r274 = bone.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(140, 3).addBox(-0.4217F, -1.856F, 0.8892F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.8485F, 0.0076F, -0.253F));

		PartDefinition cube_r275 = bone.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 106).addBox(-0.4217F, -0.6657F, 0.9129F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.8834F, 0.0076F, -0.253F));

		PartDefinition cube_r276 = bone.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(23, 137).addBox(-0.4217F, 1.4783F, 5.1017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.9707F, 0.0076F, -0.253F));

		PartDefinition cube_r277 = bone.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 122).addBox(-0.4217F, 0.2143F, 5.1902F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.6653F, 0.0076F, -0.253F));

		PartDefinition cube_r278 = bone.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(92, 47).addBox(0.6644F, -2.2708F, 7.6608F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.4814F, -0.0786F, -0.3929F));

		PartDefinition cube_r279 = bone.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(103, 137).addBox(0.6644F, 11.057F, 5.1533F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 1.5548F, -0.0786F, -0.3929F));

		PartDefinition cube_r280 = bone.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(5, 138).addBox(0.6644F, -1.6664F, 12.8844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.5076F, -0.0786F, -0.3929F));

		PartDefinition cube_r281 = bone.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(133, 5).addBox(0.6644F, -9.1365F, 3.0102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -0.3564F, -0.0786F, -0.3929F));

		PartDefinition cube_r282 = bone.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(132, 129).addBox(0.6644F, -9.582F, 5.7055F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, -0.0073F, -0.0786F, -0.3929F));

		PartDefinition cube_r283 = bone.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(54, 106).addBox(0.6644F, -8.1864F, 7.573F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.2021F, -0.0786F, -0.3929F));

		PartDefinition cube_r284 = bone.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(34, 121).addBox(0.6644F, 2.3947F, 10.972F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0691F, 4.7056F, -5.1256F, 0.9875F, -0.0786F, -0.3929F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7F, -0.0199F, -6.1909F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.5F, -2.4577F, -0.9879F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2571F, 6.1307F, -6.7505F, 0.6919F, -0.9798F, -0.4572F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(111, 6).mirror().addBox(-0.5F, -2.3437F, -2.5607F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.2571F, 6.1307F, -6.7505F, 1.6344F, -0.9798F, -0.4572F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(89, 139).mirror().addBox(-0.5783F, 2.3812F, 2.1482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 1.4681F, -0.0076F, 0.253F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(119, 149).mirror().addBox(-0.5783F, -3.1912F, 3.5664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.4209F, -0.0076F, 0.253F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(150, 117).mirror().addBox(-0.5783F, 2.0368F, -3.9353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -2.6857F, -0.0076F, 0.253F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(141, 104).mirror().addBox(-0.5783F, 2.523F, 0.3295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 2.2448F, -0.0076F, 0.253F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(54, 137).mirror().addBox(-0.5783F, -3.5267F, -0.8556F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -2.0749F, -0.0076F, 0.253F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(9, 123).mirror().addBox(-0.5783F, -2.2704F, -1.1112F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -1.2895F, -0.0076F, 0.253F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(138, 116).mirror().addBox(-0.5783F, -2.0375F, 0.29F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.5431F, -0.0076F, 0.253F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(140, 3).mirror().addBox(-0.5783F, -1.856F, 0.8892F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.8485F, -0.0076F, 0.253F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(43, 106).mirror().addBox(-0.5783F, -0.6657F, 0.9129F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.8834F, -0.0076F, 0.253F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(23, 137).mirror().addBox(-0.5783F, 1.4783F, 5.1017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.9707F, -0.0076F, 0.253F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(89, 122).mirror().addBox(-0.5783F, 0.2143F, 5.1902F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.6653F, -0.0076F, 0.253F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-1.6644F, -2.2708F, 7.6608F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.4814F, 0.0786F, 0.3929F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(103, 137).mirror().addBox(-1.6644F, 11.057F, 5.1533F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 1.5548F, 0.0786F, 0.3929F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(5, 138).mirror().addBox(-1.6644F, -1.6664F, 12.8844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.5076F, 0.0786F, 0.3929F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(133, 5).mirror().addBox(-1.6644F, -9.1365F, 3.0102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -0.3564F, 0.0786F, 0.3929F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(132, 129).mirror().addBox(-1.6644F, -9.582F, 5.7055F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, -0.0073F, 0.0786F, 0.3929F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(54, 106).mirror().addBox(-1.6644F, -8.1864F, 7.573F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.2021F, 0.0786F, 0.3929F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(34, 121).mirror().addBox(-1.6644F, 2.3947F, 10.972F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0691F, 4.7056F, -5.1256F, 0.9875F, 0.0786F, 0.3929F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(54, 11).addBox(-1.0F, -1.093F, 0.0511F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6992F, 2.0273F, 0.2237F, 0.0536F, -0.0305F));

		PartDefinition cube_r305 = tail1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(84, 147).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0956F, 4.9199F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r306 = tail1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(146, 80).addBox(0.0F, -0.8F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9923F, 6.6001F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r307 = tail1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(13, 111).addBox(-0.5F, -8.3F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1034F, 0.0516F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(56, 115).addBox(-0.5F, -7.4F, 2.875F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 113).addBox(-0.5F, -7.4F, 0.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.093F, 3.0511F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(54, 22).mirror().addBox(-2.825F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.093F, 0.0511F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r310 = tail1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(54, 22).addBox(-0.175F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.093F, 0.0511F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, -0.1774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 7.9957F, -0.1449F, 0.0868F, -0.0088F));

		PartDefinition cube_r311 = tail2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-1.175F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.8226F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r312 = tail2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 60).addBox(-1.825F, 0.0F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.8226F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r313 = tail2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(78, 147).addBox(0.0F, 4.3F, 10.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 147).addBox(0.0F, 3.3F, 8.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 149).addBox(0.0F, 2.3F, 6.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 145).addBox(0.0F, 0.4F, 4.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(110, 138).addBox(-0.5F, -4.2F, -0.075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2747F, 7.074F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(12, 140).addBox(-0.5F, -4.6F, -0.075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2321F, 5.1097F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r316 = tail2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(34, 135).addBox(-0.5F, -5.2F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0922F, 3.1222F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r317 = tail2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(110, 130).addBox(-0.5F, -5.6F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1984F, 1.0035F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(52, 35).addBox(-1.0F, -0.1774F, 0.0231F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.0704F, 0.1306F, -0.0092F));

		PartDefinition cube_r318 = tail3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(-0.8F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.8226F, 4.5231F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r319 = tail3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(73, 51).addBox(-1.2F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.8226F, 4.5231F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r320 = tail3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(74, 118).addBox(0.0F, 3.8F, 9.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 152).addBox(0.0F, 2.7F, 7.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 147).addBox(0.0F, 1.0F, 5.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(142, 31).addBox(-0.5F, -2.6F, 5.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(56, 142).addBox(-0.5F, -3.5F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, 5.1427F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(17, 140).addBox(-0.5F, -3.8F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1113F, 3.024F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(49, 135).addBox(-0.5F, -4.3F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0212F, 0.8672F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 60).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r325 = tail4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(150, 112).addBox(0.0F, 3.9F, 10.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 150).addBox(0.0F, 2.9F, 8.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 152).addBox(0.0F, 2.0F, 6.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 73).addBox(0.0F, 0.8F, 4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(105, 150).addBox(0.0F, -1.7F, 5.75F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 150).addBox(0.0F, -1.4F, 3.75F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 93).addBox(0.0F, -1.25F, 1.775F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 147).addBox(0.0F, -1.15F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r327 = tail5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(154, 37).addBox(0.0F, 3.6F, 9.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 155).addBox(0.0F, 2.7F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 26).addBox(0.0F, 0.8F, 5.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(154, 79).addBox(0.0F, -1.6F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 7.3186F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r329 = tail5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(154, 24).addBox(0.0F, -1.0F, 3.775F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 154).addBox(0.0F, -0.7F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 95).addBox(0.0F, -0.4F, -0.175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r330 = tail6.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(47, 154).addBox(0.0F, 3.4F, 10.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 154).addBox(0.0F, 2.5F, 8.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 6).addBox(0.0F, 1.6F, 6.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 153).addBox(0.0F, 0.6F, 4.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r331 = tail6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(154, 83).addBox(0.0F, -1.725F, 1.45F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 154).addBox(0.0F, -1.625F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0269F, 5.5544F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r332 = tail6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(14, 155).addBox(0.0F, -1.55F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1141F, 3.5339F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(83, 153).addBox(0.0F, -1.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6511F, 1.2952F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition cube_r334 = tail7.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(39, 135).addBox(0.0F, 3.3F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 10).addBox(0.0F, 1.3F, 7.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 153).addBox(0.0F, 0.5F, 5.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0303F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(44, 154).addBox(0.0F, -0.725F, 5.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 154).addBox(0.0F, -0.425F, 3.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(17, 155).addBox(0.0F, -1.3F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.095F, 3.632F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(140, 153).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0785F, 1.4895F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, -0.1774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0054F, 7.8751F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r338 = tail8.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(155, 54).addBox(0.0F, 3.2F, 10.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 45).addBox(0.0F, 2.2F, 8.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 57).addBox(0.0F, 1.2F, 6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 155).addBox(0.0F, 0.1F, 4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0304F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r339 = tail8.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 155).addBox(0.0F, -0.1F, 3.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 135).addBox(0.0F, -0.4F, 5.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 155).addBox(0.0F, 0.2F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 73).addBox(0.0F, 0.6F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(73, 31).addBox(-0.5F, -0.7774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 8.0F, 0.2711F, -0.0864F, -0.0122F));

		PartDefinition cube_r340 = tail9.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(155, 51).addBox(0.0F, 2.7F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 155).addBox(0.0F, 1.6F, 7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 48).addBox(0.0F, 0.4F, 5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4304F, -3.7747F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r341 = tail9.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(98, 110).addBox(0.0F, -0.2F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 90).addBox(0.0F, 0.1F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 6).addBox(0.0F, 0.5F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 111).addBox(0.0F, 0.8F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2327F, 1.486F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5F, -0.7774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.29F, -0.1643F, 0.0276F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(75, 9).addBox(-0.5F, -0.7774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.1132F, 0.1745F, -0.0031F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(19, 76).addBox(-0.5F, -0.2774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 8.0F, -0.1144F, 0.1301F, -0.0149F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(76, 68).addBox(-0.5F, -0.2774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1772F, 0.1719F, -0.0306F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(77, 19).addBox(-0.5F, -0.2774F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition tail15 = tail14.addOrReplaceChild("tail15", CubeListBuilder.create().texOffs(34, 90).addBox(-0.5F, -0.2774F, 0.0231F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3079F, 0.1248F, -0.0396F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.9814F, 6.4456F, -5.795F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(149, 108).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -6.7404F, -3.9317F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(150, 120).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0186F, -7.7398F, -3.9666F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(49, 151).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -8.6014F, -3.459F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(138, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0226F, -9.7745F, -1.8495F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(16, 134).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0226F, -10.6512F, -0.052F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r347 = bone2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(136, 72).addBox(-0.5F, -2.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0186F, -6.6695F, -0.9797F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(125, 54).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0186F, -7.4102F, 0.1024F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r349 = bone2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(18, 123).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -10.7872F, 3.8736F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(72, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0186F, -11.0309F, 1.8885F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = bone2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(128, 92).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0186F, -10.9112F, 0.9062F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r352 = bone2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(146, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0186F, -10.6439F, -0.0574F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r353 = bone2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(143, 52).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0276F, -7.1847F, 7.2592F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r354 = bone2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(145, 138).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0276F, -7.9901F, 6.8576F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r355 = bone2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 128).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0246F, -9.5159F, 5.4253F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r356 = bone2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(139, 86).addBox(-0.5F, -1.0F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0186F, -6.1475F, 1.613F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r357 = bone2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 114).addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r358 = bone2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(141, 134).addBox(-0.5144F, -1.8113F, -0.1705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3523F, -2.5531F, 5.2999F, -0.6332F, -0.3369F, 0.3555F));

		PartDefinition cube_r359 = bone2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(116, 128).addBox(-0.5144F, -0.5747F, -0.6729F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3523F, -2.5531F, 5.2999F, -0.0224F, -0.3369F, 0.3555F));

		PartDefinition cube_r360 = bone2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(17, 86).addBox(-0.5144F, -1.1089F, 0.7108F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3523F, -2.5531F, 5.2999F, -0.2842F, -0.3369F, 0.3555F));

		PartDefinition cube_r361 = bone2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(39, 151).addBox(-0.658F, -9.0408F, -5.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, 2.479F, -0.3811F, 0.3899F));

		PartDefinition cube_r362 = bone2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(150, 73).addBox(-0.658F, -9.8664F, 3.5231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -2.9315F, -0.3811F, 0.3899F));

		PartDefinition cube_r363 = bone2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(143, 56).addBox(-0.658F, 1.3468F, 8.7699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -1.6661F, -0.3811F, 0.3899F));

		PartDefinition cube_r364 = bone2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(131, 139).addBox(-0.658F, 8.5004F, 1.3525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -0.6189F, -0.3811F, 0.3899F));

		PartDefinition cube_r365 = bone2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(103, 130).addBox(-0.658F, 5.601F, -0.608F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(138, 139).addBox(-0.658F, 2.44F, -0.7546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -0.4008F, -0.3811F, 0.3899F));

		PartDefinition cube_r366 = bone2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(134, 60).addBox(-0.658F, 6.5976F, -3.1733F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, 0.0356F, -0.3811F, 0.3899F));

		PartDefinition cube_r367 = bone2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(82, 135).addBox(-0.658F, 5.3882F, -1.7336F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -0.1826F, -0.3811F, 0.3899F));

		PartDefinition cube_r368 = bone2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(68, 136).addBox(-0.658F, 3.4152F, -1.4793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -0.2262F, -0.3811F, 0.3899F));

		PartDefinition cube_r369 = bone2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(134, 105).addBox(-0.658F, 2.234F, -2.881F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, -0.0081F, -0.3811F, 0.3899F));

		PartDefinition cube_r370 = bone2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(120, 47).addBox(-0.658F, -0.0979F, -3.414F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8555F, -4.2159F, 3.3745F, 0.2974F, -0.3811F, 0.3899F));

		PartDefinition cube_r371 = bone2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(17, 95).addBox(0.3681F, -6.4611F, -3.0237F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 6.2F, 0.4245F, -0.0361F, 0.1708F));

		PartDefinition cube_r372 = bone2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(122, 26).addBox(-0.5F, -1.5F, -2.55F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6563F, -3.8881F, 2.8868F, -0.422F, -0.0361F, 0.1708F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.9814F, 6.4456F, -5.795F));

		PartDefinition cube_r373 = bone4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(149, 108).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -6.7404F, -3.9317F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r374 = bone4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(150, 120).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -7.7398F, -3.9666F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r375 = bone4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(49, 151).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -8.6014F, -3.459F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r376 = bone4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(138, 11).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0226F, -9.7745F, -1.8495F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r377 = bone4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(16, 134).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0226F, -10.6512F, -0.052F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r378 = bone4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(136, 72).mirror().addBox(-0.5F, -2.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -6.6695F, -0.9797F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r379 = bone4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(125, 54).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -7.4102F, 0.1024F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r380 = bone4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(18, 123).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.7872F, 3.8736F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r381 = bone4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(72, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -11.0309F, 1.8885F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r382 = bone4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(128, 92).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.9112F, 0.9062F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r383 = bone4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(146, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -10.6439F, -0.0574F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r384 = bone4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(143, 52).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.1847F, 7.2592F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r385 = bone4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(145, 138).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0276F, -7.9901F, 6.8576F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r386 = bone4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0246F, -9.5159F, 5.4253F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r387 = bone4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(139, 86).mirror().addBox(-0.5F, -1.0F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -6.1475F, 1.613F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r388 = bone4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-0.5F, -1.9692F, -7.9887F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0186F, -3.6051F, 9.2481F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r389 = bone4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(141, 134).mirror().addBox(-0.4856F, -1.8113F, -0.1705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -2.5531F, 5.2999F, -0.6332F, 0.3369F, -0.3555F));

		PartDefinition cube_r390 = bone4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(116, 128).mirror().addBox(-0.4856F, -0.5747F, -0.6729F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -2.5531F, 5.2999F, -0.0224F, 0.3369F, -0.3555F));

		PartDefinition cube_r391 = bone4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-0.4856F, -1.1089F, 0.7108F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3523F, -2.5531F, 5.2999F, -0.2842F, 0.3369F, -0.3555F));

		PartDefinition cube_r392 = bone4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(39, 151).mirror().addBox(-0.342F, -9.0408F, -5.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, 2.479F, 0.3811F, -0.3899F));

		PartDefinition cube_r393 = bone4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(150, 73).mirror().addBox(-0.342F, -9.8664F, 3.5231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -2.9315F, 0.3811F, -0.3899F));

		PartDefinition cube_r394 = bone4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(143, 56).mirror().addBox(-0.342F, 1.3468F, 8.7699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -1.6661F, 0.3811F, -0.3899F));

		PartDefinition cube_r395 = bone4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(131, 139).mirror().addBox(-0.342F, 8.5004F, 1.3525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -0.6189F, 0.3811F, -0.3899F));

		PartDefinition cube_r396 = bone4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(103, 130).mirror().addBox(-0.342F, 5.601F, -0.608F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(138, 139).mirror().addBox(-0.342F, 2.44F, -0.7546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -0.4008F, 0.3811F, -0.3899F));

		PartDefinition cube_r397 = bone4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(134, 60).mirror().addBox(-0.342F, 6.5976F, -3.1733F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, 0.0356F, 0.3811F, -0.3899F));

		PartDefinition cube_r398 = bone4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(82, 135).mirror().addBox(-0.342F, 5.3882F, -1.7336F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -0.1826F, 0.3811F, -0.3899F));

		PartDefinition cube_r399 = bone4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(68, 136).mirror().addBox(-0.342F, 3.4152F, -1.4793F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -0.2262F, 0.3811F, -0.3899F));

		PartDefinition cube_r400 = bone4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(-0.342F, 2.234F, -2.881F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, -0.0081F, 0.3811F, -0.3899F));

		PartDefinition cube_r401 = bone4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(120, 47).mirror().addBox(-0.342F, -0.0979F, -3.414F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8555F, -4.2159F, 3.3745F, 0.2974F, 0.3811F, -0.3899F));

		PartDefinition cube_r402 = bone4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(17, 95).mirror().addBox(-1.3681F, -6.4611F, -3.0237F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.1F, 6.2F, 0.4245F, 0.0361F, -0.1708F));

		PartDefinition cube_r403 = bone4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(122, 26).mirror().addBox(-0.5F, -1.5F, -2.55F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6563F, -3.8881F, 2.8868F, -0.422F, 0.0361F, -0.1708F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 2.331F, -2.8155F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftLeg.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(45, 100).addBox(-1.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 5.0142F, -8.8018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r405 = leftLeg.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(27, 11).addBox(-1.0F, -0.4F, -7.5F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1F, 2.3578F, -2.6501F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftLeg.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(114, 76).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -0.2857F, -0.2343F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r407 = leftLeg.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(119, 80).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 0.7998F, -0.7285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftLeg.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(102, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 5.1552F, -12.6922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r409 = leftLeg.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(65, 113).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 6.8662F, -11.9016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftLeg.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(78, 106).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.3569F, -9.9513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r411 = leftLeg.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(68, 93).addBox(-1.0F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 3.3237F, -4.9581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r412 = leftLeg.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(51, 93).addBox(-1.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1231F, -0.9337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r413 = leftLeg.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(101, 100).addBox(-2.6F, -1.9615F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0149F, -0.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.302F, -13.865F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r414 = leftLeg3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(63, 118).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 1.9256F, 0.4139F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r415 = leftLeg3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(129, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -1.8195F, -1.5975F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r416 = leftLeg3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(7, 129).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, -1.0703F, 0.2569F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r417 = leftLeg3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(114, 54).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 0.48F, -0.6632F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r418 = leftLeg3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(99, 57).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r419 = leftLeg3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(38, 81).addBox(-1.0F, -1.4F, -4.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r420 = leftLeg3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -1.0F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r421 = leftLeg3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(65, 106).addBox(-1.0F, -0.7F, 0.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 2.2449F, -6.4874F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftLeg3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(74, 123).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1F, 0.92F, 0.1577F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftLeg3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(16, 129).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, -1.0287F, -0.2922F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftLeg3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -0.7F, 0.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1F, 1.979F, -5.0255F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftLeg3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(130, 88).addBox(-1.0F, -1.6F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 11).addBox(-1.0F, -1.1F, -6.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1F, 1.979F, -5.0255F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r426 = leftLeg3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.3F, -6.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.979F, -5.0255F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0067F, 1.795F, -10.7521F, -0.2062F, -0.0163F, 0.0386F));

		PartDefinition cube_r427 = leftLeg4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(94, 13).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r428 = leftLeg4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(57, 78).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r429 = leftLeg8.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(78, 59).addBox(-4.1915F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 2.331F, -2.8155F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightLeg.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(60, 100).addBox(-2.0F, -0.325F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 5.0142F, -8.8018F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r431 = rightLeg.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(27, 23).addBox(-2.0F, -0.4F, -7.5F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 2.3578F, -2.6501F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r432 = rightLeg.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(118, 112).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, -0.2857F, -0.2343F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r433 = rightLeg.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(119, 84).addBox(-2.0F, -0.65F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 0.7998F, -0.7285F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r434 = rightLeg.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(15, 105).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, 5.1552F, -12.6922F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r435 = rightLeg.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(98, 113).addBox(-2.0F, -1.75F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 6.8662F, -11.9016F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r436 = rightLeg.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(119, 88).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.3569F, -9.9513F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r437 = rightLeg.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(94, 6).addBox(-2.0F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 3.3237F, -4.9581F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r438 = rightLeg.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(85, 93).addBox(-2.0F, 0.2F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1231F, -0.9337F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r439 = rightLeg.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(102, 93).addBox(-1.4F, -1.9615F, 0.0699F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0149F, -0.4105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.302F, -13.865F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r440 = rightLeg3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(118, 116).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.9256F, 0.4139F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r441 = rightLeg3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(129, 47).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -1.8195F, -1.5975F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r442 = rightLeg3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(129, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, -1.0703F, 0.2569F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r443 = rightLeg3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(114, 69).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.48F, -0.6632F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightLeg3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(99, 73).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r445 = rightLeg3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(55, 84).addBox(-1.0F, -1.4F, -4.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r446 = rightLeg3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(50, 48).addBox(-1.0F, -1.0F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r447 = rightLeg3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(109, 40).addBox(-1.0F, -0.7F, 0.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 2.2449F, -6.4874F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightLeg3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(98, 124).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.1F, 0.92F, 0.1577F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightLeg3.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(129, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1F, -1.0287F, -0.2922F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightLeg3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(30, 99).addBox(-1.0F, -0.7F, 0.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1F, 1.979F, -5.0255F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightLeg3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(133, 40).addBox(-1.0F, -1.6F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 24).addBox(-1.0F, -1.1F, -6.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, 1.979F, -5.0255F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightLeg3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(25, 48).addBox(-1.0F, -0.3F, -6.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.979F, -5.0255F, 0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0067F, 1.795F, -10.7521F, 0.1865F, 0.0163F, -0.0386F));

		PartDefinition cube_r453 = rightLeg4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(95, 67).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r454 = rightLeg4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(78, 78).addBox(-4.0F, -1.415F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r455 = rightLeg8.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(81, 0).addBox(-3.8085F, -3.5662F, -29.0624F, 8.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

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