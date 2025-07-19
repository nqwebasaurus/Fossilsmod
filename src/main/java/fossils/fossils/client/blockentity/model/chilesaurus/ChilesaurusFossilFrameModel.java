package fossils.fossils.client.blockentity.model.chilesaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChilesaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodyMiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyFront;
	private final ModelPart neckBase;
	private final ModelPart neckMiddlebase;
	private final ModelPart neckMiddlefront;
	private final ModelPart neckFront;
	private final ModelPart neckFront2;
	private final ModelPart head;
	private final ModelPart headSlope;
	private final ModelPart upperJawback;
	private final ModelPart upperJawslopefront;
	private final ModelPart upperJawslopeback;
	private final ModelPart lowerJawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart chestSlope;
	private final ModelPart leftUpperarm;
	private final ModelPart leftLowerarm;
	private final ModelPart leftHand;
	private final ModelPart leftHand2;
	private final ModelPart rightUpperarm;
	private final ModelPart rightLowerarm;
	private final ModelPart rightHand;
	private final ModelPart rightHand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tailBase;
	private final ModelPart tailMiddlebase;
	private final ModelPart tailMiddle;
	private final ModelPart tailMiddleend;
	private final ModelPart tailEnd;
	private final ModelPart tailEnd2;
	private final ModelPart tailEnd3;
	private final ModelPart tailEnd4;
	private final ModelPart tailEnd5;
	private final ModelPart tailEnd6;
	private final ModelPart rightThigh;
	private final ModelPart rightShin;
	private final ModelPart rightAnkle;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftThigh;
	private final ModelPart leftShin;
	private final ModelPart leftAnkle;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart bone;
	private final ModelPart bone3;

	public ChilesaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodyMiddle = this.hips.getChild("bodyMiddle");
		this.body = this.bodyMiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyFront = this.body2.getChild("bodyFront");
		this.neckBase = this.bodyFront.getChild("neckBase");
		this.neckMiddlebase = this.neckBase.getChild("neckMiddlebase");
		this.neckMiddlefront = this.neckMiddlebase.getChild("neckMiddlefront");
		this.neckFront = this.neckMiddlefront.getChild("neckFront");
		this.neckFront2 = this.neckFront.getChild("neckFront2");
		this.head = this.neckFront2.getChild("head");
		this.headSlope = this.head.getChild("headSlope");
		this.upperJawback = this.head.getChild("upperJawback");
		this.upperJawslopefront = this.upperJawback.getChild("upperJawslopefront");
		this.upperJawslopeback = this.upperJawslopefront.getChild("upperJawslopeback");
		this.lowerJawbase = this.head.getChild("lowerJawbase");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.chestSlope = this.bodyFront.getChild("chestSlope");
		this.leftUpperarm = this.bodyFront.getChild("leftUpperarm");
		this.leftLowerarm = this.leftUpperarm.getChild("leftLowerarm");
		this.leftHand = this.leftLowerarm.getChild("leftHand");
		this.leftHand2 = this.leftLowerarm.getChild("leftHand2");
		this.rightUpperarm = this.bodyFront.getChild("rightUpperarm");
		this.rightLowerarm = this.rightUpperarm.getChild("rightLowerarm");
		this.rightHand = this.rightLowerarm.getChild("rightHand");
		this.rightHand2 = this.rightLowerarm.getChild("rightHand2");
		this.bone2 = this.bodyFront.getChild("bone2");
		this.bone4 = this.bodyFront.getChild("bone4");
		this.tailBase = this.hips.getChild("tailBase");
		this.tailMiddlebase = this.tailBase.getChild("tailMiddlebase");
		this.tailMiddle = this.tailMiddlebase.getChild("tailMiddle");
		this.tailMiddleend = this.tailMiddle.getChild("tailMiddleend");
		this.tailEnd = this.tailMiddleend.getChild("tailEnd");
		this.tailEnd2 = this.tailEnd.getChild("tailEnd2");
		this.tailEnd3 = this.tailEnd2.getChild("tailEnd3");
		this.tailEnd4 = this.tailEnd3.getChild("tailEnd4");
		this.tailEnd5 = this.tailEnd4.getChild("tailEnd5");
		this.tailEnd6 = this.tailEnd5.getChild("tailEnd6");
		this.rightThigh = this.hips.getChild("rightThigh");
		this.rightShin = this.rightThigh.getChild("rightShin");
		this.rightAnkle = this.rightShin.getChild("rightAnkle");
		this.rightFoot = this.rightAnkle.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftThigh = this.hips.getChild("leftThigh");
		this.leftShin = this.leftThigh.getChild("leftShin");
		this.leftAnkle = this.leftShin.getChild("leftAnkle");
		this.leftFoot = this.leftAnkle.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.0F, 1.1F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8F, -6.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.7F, -12.0F, -15.8F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.8F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.7F, -12.0F, -15.8F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.9F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -12.0F, 1.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4944F, -2.8941F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 6).addBox(-0.5F, 0.4944F, 4.8059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.0405F, 0.6247F, -0.1236F, 0.0F, 0.0F));

		PartDefinition bodyMiddle = hips.addOrReplaceChild("bodyMiddle", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.3265F, -3.969F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1366F, -2.5961F, 0.0653F, -0.0871F, -0.0057F));

		PartDefinition body = bodyMiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(11, 40).addBox(-1.762F, 0.3598F, -3.8893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2446F, -0.0507F, -3.6812F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, 0.254F, -4.2973F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 43).addBox(-1.0F, 0.254F, -0.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7924F, 0.0998F, -3.8198F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition bodyFront = body2.addOrReplaceChild("bodyFront", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, 0.4043F, -5.1493F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1184F, -3.9124F, 0.0887F, -0.0435F, -0.0039F));

		PartDefinition neckBase = bodyFront.addOrReplaceChild("neckBase", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, 0.2611F, -3.5988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 51).addBox(-0.5F, 0.2611F, -0.8988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1771F, -4.7726F, -0.0477F, -0.2615F, 0.0123F));

		PartDefinition neckMiddlebase = neckBase.addOrReplaceChild("neckMiddlebase", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5F, 0.5F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 50).addBox(-0.5F, 0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2089F, -2.7621F, -0.6235F, -0.3896F, 0.1574F));

		PartDefinition neckMiddlefront = neckMiddlebase.addOrReplaceChild("neckMiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0111F, -2.8602F, -0.5288F, 0.0F, 0.0F));

		PartDefinition neckMiddlefront_r1 = neckMiddlefront.addOrReplaceChild("neckMiddlefront_r1", CubeListBuilder.create().texOffs(49, 7).addBox(-0.4F, -0.5F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 5).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9729F, -1.7081F, 0.0F, -0.0349F, -0.2618F));

		PartDefinition neckFront = neckMiddlefront.addOrReplaceChild("neckFront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.1729F, -3.0081F, -0.0962F, -0.1674F, -0.4374F));

		PartDefinition neckFront_r1 = neckFront.addOrReplaceChild("neckFront_r1", CubeListBuilder.create().texOffs(18, 46).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.18F, 0.7125F, -2.5924F, -0.0168F, -0.0849F, -0.2621F));

		PartDefinition neckFront2 = neckFront.addOrReplaceChild("neckFront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0107F, -2.856F, 0.6727F, -0.2851F, -0.7118F));

		PartDefinition neckFront_r2 = neckFront2.addOrReplaceChild("neckFront_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, 0.8068F, -2.4992F, -0.0153F, -0.0314F, 0.454F));

		PartDefinition head = neckFront2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.213F, -2.5777F, 0.0398F, -0.0975F, -0.1815F));

		PartDefinition headSlope = head.addOrReplaceChild("headSlope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.1921F, -2.9723F, 0.0848F, 0.0F, 0.0F));

		PartDefinition upperJawback = head.addOrReplaceChild("upperJawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7621F, -2.9323F, 0.2759F, 0.0F, 0.0F));

		PartDefinition upperJawslopefront = upperJawback.addOrReplaceChild("upperJawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.41F, -0.02F, 0.1061F, 0.0F, 0.0F));

		PartDefinition upperJawslopeback = upperJawslopefront.addOrReplaceChild("upperJawslopeback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.02F, 0.0F, 0.0F, -0.3609F, 0.0F, 0.0F));

		PartDefinition lowerJawbase = head.addOrReplaceChild("lowerJawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1286F, -0.3168F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.285F, 2.1329F, -0.5823F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.265F, 2.1329F, -0.5823F));

		PartDefinition chestSlope = bodyFront.addOrReplaceChild("chestSlope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 4.7043F, -3.9493F, -0.4033F, 0.0F, 0.0F));

		PartDefinition leftUpperarm = bodyFront.addOrReplaceChild("leftUpperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0854F, 4.6679F, -4.017F, 0.1712F, 0.2078F, 0.0195F));

		PartDefinition leftLowerarm = leftUpperarm.addOrReplaceChild("leftLowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2093F, 3.5266F, 3.2686F, -0.4244F, -0.2664F, -0.078F));

		PartDefinition leftHand = leftLowerarm.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9168F, 2.9829F, -0.0402F, 0.2759F, 0.0F, 0.3396F));

		PartDefinition leftHand2 = leftLowerarm.addOrReplaceChild("leftHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8573F, 2.9575F, -0.3715F, -0.2423F, -0.0413F, 0.0811F));

		PartDefinition rightUpperarm = bodyFront.addOrReplaceChild("rightUpperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0854F, 4.6679F, -4.017F, -0.396F, -0.2078F, -0.0195F));

		PartDefinition rightLowerarm = rightUpperarm.addOrReplaceChild("rightLowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2093F, 3.5266F, 3.2686F, -0.36F, 0.3501F, 0.2896F));

		PartDefinition rightHand = rightLowerarm.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9168F, 2.9829F, -0.0402F, 0.2759F, 0.0F, -0.3396F));

		PartDefinition rightHand2 = rightLowerarm.addOrReplaceChild("rightHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8573F, 2.9575F, -0.3715F, -0.2423F, 0.0413F, -0.0811F));

		PartDefinition bone2 = bodyFront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.1882F, 2.578F, -1.9343F));

		PartDefinition bone4 = bodyFront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.1882F, 2.578F, -1.9343F));

		PartDefinition tailBase = hips.addOrReplaceChild("tailBase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2961F, 5.2741F, 0.1901F, 0.156F, 0.1174F));

		PartDefinition tailBase_r1 = tailBase.addOrReplaceChild("tailBase_r1", CubeListBuilder.create().texOffs(26, 33).addBox(-0.5F, 0.2447F, 0.011F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0458F, 0.0208F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tailMiddlebase = tailBase.addOrReplaceChild("tailMiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.535F, 4.9797F, -0.0418F, 0.1744F, -0.0073F));

		PartDefinition tailMiddlebase_r1 = tailMiddlebase.addOrReplaceChild("tailMiddlebase_r1", CubeListBuilder.create().texOffs(34, 22).addBox(-0.5F, 0.1423F, 4.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 18).addBox(-0.5F, 0.1423F, -0.3597F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1676F, -0.0735F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tailMiddle = tailMiddlebase.addOrReplaceChild("tailMiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3781F, 4.8875F, -0.059F, 0.1394F, 0.1218F));

		PartDefinition tailMiddle_r1 = tailMiddle.addOrReplaceChild("tailMiddle_r1", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, 0.0996F, -0.118F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0988F, 0.0255F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailMiddleend = tailMiddle.addOrReplaceChild("tailMiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1315F, 4.7805F, -0.171F, 0.172F, -0.0295F));

		PartDefinition tailMiddleend_r1 = tailMiddleend.addOrReplaceChild("tailMiddleend_r1", CubeListBuilder.create().texOffs(5, 23).addBox(-0.5F, -0.1252F, 5.4091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 18).addBox(-0.5F, -0.1252F, -0.2909F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2559F, 0.0697F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd = tailMiddleend.addOrReplaceChild("tailEnd", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8711F, 5.986F, -0.0661F, 0.2278F, 0.1131F));

		PartDefinition tailEnd_r1 = tailEnd.addOrReplaceChild("tailEnd_r1", CubeListBuilder.create().texOffs(34, 7).addBox(-0.5F, 0.1882F, -0.2607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0031F, 0.222F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd2 = tailEnd.addOrReplaceChild("tailEnd2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5714F, 4.9177F, -0.0594F, 0.1742F, -0.0103F));

		PartDefinition tailEnd_r2 = tailEnd2.addOrReplaceChild("tailEnd_r2", CubeListBuilder.create().texOffs(3, 29).addBox(-0.5F, 0.1882F, 4.1393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 26).addBox(-0.5F, 0.1882F, -0.5607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0719F, 0.222F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd3 = tailEnd2.addOrReplaceChild("tailEnd3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6821F, 4.8995F, -0.0151F, -0.1745F, 0.0026F));

		PartDefinition tailEnd_r3 = tailEnd3.addOrReplaceChild("tailEnd_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, 0.1882F, -0.1607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd4 = tailEnd3.addOrReplaceChild("tailEnd4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6517F, 4.8942F, 0.0081F, -0.175F, -0.1303F));

		PartDefinition tailEnd_r4 = tailEnd4.addOrReplaceChild("tailEnd_r4", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.1882F, -0.4607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd5 = tailEnd4.addOrReplaceChild("tailEnd5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6697F, 4.8803F, 0.0816F, -0.4786F, -0.0377F));

		PartDefinition tailEnd_r5 = tailEnd5.addOrReplaceChild("tailEnd_r5", CubeListBuilder.create().texOffs(17, 37).addBox(-0.5F, 0.1882F, 3.8393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 33).addBox(-0.5F, 0.1882F, -0.8607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailEnd6 = tailEnd5.addOrReplaceChild("tailEnd6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6532F, 4.8462F, 0.1216F, -0.3033F, -0.0365F));

		PartDefinition tailEnd_r6 = tailEnd6.addOrReplaceChild("tailEnd_r6", CubeListBuilder.create().texOffs(15, 18).addBox(-0.5F, 0.1882F, -0.5607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0469F, 0.272F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightThigh = hips.addOrReplaceChild("rightThigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 1.4696F, 1.5587F, -0.7158F, 0.0F, 0.0F));

		PartDefinition rightShin = rightThigh.addOrReplaceChild("rightShin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 6.7197F, 1.4192F, 0.8125F, 0.0F, 0.0F));

		PartDefinition rightAnkle = rightShin.addOrReplaceChild("rightAnkle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.39F, 7.2018F, 1.328F, -0.8372F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightAnkle.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0756F, 0.1494F, 1.5186F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.009F, -1.5201F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftThigh = hips.addOrReplaceChild("leftThigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 1.4696F, 1.5587F, 0.2442F, 0.0F, 0.0F));

		PartDefinition leftShin = leftThigh.addOrReplaceChild("leftShin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 6.7197F, 1.4192F, 0.8125F, 0.0F, 0.0F));

		PartDefinition leftAnkle = leftShin.addOrReplaceChild("leftAnkle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.39F, 7.2018F, 1.328F, -0.4882F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftAnkle.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0756F, 0.1494F, 0.2969F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.009F, -1.5201F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.785F, 2.1521F, 2.8288F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.785F, 2.1521F, 2.8288F, 0.0F, 0.0F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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