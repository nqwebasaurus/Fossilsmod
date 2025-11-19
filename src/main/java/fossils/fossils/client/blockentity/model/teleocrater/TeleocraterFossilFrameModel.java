package fossils.fossils.client.blockentity.model.teleocrater;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TeleocraterFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Neck8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RHand2;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand3;
	private final ModelPart RHand4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public TeleocraterFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.Body = this.hips.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Body2 = this.body4.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Neck8 = this.Neck7.getChild("Neck8");
		this.Head = this.Neck8.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RHand2 = this.RHand.getChild("RHand2");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand3 = this.RArm4.getChild("RHand3");
		this.RHand4 = this.RHand3.getChild("RHand4");
		this.Tail = this.hips.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.RLeg = this.hips.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.hips.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.0F, 6.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.675F, -5.55F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.25F, -9.45F, -13.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.95F, -2.35F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -9.45F, -13.5F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.3F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -13.5F, 7.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.0891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -16.1673F, 6.2135F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0477F, -0.8895F, 1.4434F, 0.0523F, -0.0027F, 0.0523F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0477F, -0.8895F, 1.4434F, 0.0523F, 0.0027F, -0.0523F));

		PartDefinition Body = hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.1506F, -0.1726F, -0.0261F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 3).addBox(-0.5F, -0.2495F, 4.2912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 0).addBox(-0.5F, -0.2495F, -0.4088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, -0.2F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3983F, -4.9751F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 23).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 19).addBox(-0.5F, -0.2F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3978F, -4.9534F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r7 = Body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 50).addBox(-0.5F, -0.4F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.8975F, -7.8134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 3.8575F, -3.4008F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 3.8575F, -3.4008F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4785F, -3.8313F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition cube_r8 = Neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 57).addBox(-0.5F, -0.2727F, 2.2598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 56).addBox(-0.5F, -0.2727F, -0.4402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.0264F, 0.1309F, -0.0034F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 62).addBox(-0.5F, 0.7F, 3.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6801F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 21).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 19).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4143F, -0.9824F, -0.2449F, 0.0677F, -0.0169F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.332F, 0.3298F, 0.0338F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 71).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6773F, 0.1187F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, 0.1773F, -3.2813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 64).addBox(-0.5F, 0.1773F, -0.5813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0061F, -1.8805F, 0.1718F, 0.1516F, 0.157F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, 0.1773F, -2.1063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0243F, -2.8779F, 0.1136F, 0.0434F, 0.0049F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0094F, -1.9004F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition cube_r12 = Neck7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 61).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6773F, 0.1187F, 0.0F, 0.048F, 0.0F));

		PartDefinition Neck8 = Neck7.addOrReplaceChild("Neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.015F, -2.76F, 0.2451F, 0.1719F, 0.2193F));

		PartDefinition cube_r13 = Neck8.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 33).addBox(-0.5F, -0.5F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6773F, -2.0313F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Head = Neck8.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8249F, -1.9587F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -5.1282F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -5.1282F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.6999F, -0.5197F, 0.6545F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9803F, 4.7674F, -2.7041F, -1.0474F, 0.0824F, 0.0397F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2924F, -0.7224F, 5.3552F, 1.1529F, 0.6142F, 0.9702F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8934F, 4.9741F, 0.6F, 0.0F, 0.2618F, -0.2618F));

		PartDefinition RHand2 = RHand.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7022F, 1.9165F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9803F, 4.7674F, -2.7041F, -1.1915F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2924F, -0.7224F, 5.3552F, 0.8245F, -1.0604F, -0.5418F));

		PartDefinition RHand3 = RArm4.addOrReplaceChild("RHand3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8934F, 4.9741F, 0.6F, 0.0F, -0.2618F, 0.2618F));

		PartDefinition RHand4 = RHand3.addOrReplaceChild("RHand4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7022F, 1.9165F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Tail = hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, 0.0987F, -0.3611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 20).addBox(-0.5F, 0.0987F, 8.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, -0.0264F, 0.1309F, -0.0034F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0416F, 0.1124F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0661F, 8.8942F, -0.0968F, -0.1303F, 0.0126F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2853F, -0.1526F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(-0.5F, 0.2853F, 10.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0059F, 10.9741F, -0.0723F, -0.2611F, 0.0187F));

		PartDefinition cube_r14 = Tail4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -10.8F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7853F, 10.9474F, 0.0F, -0.0087F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, 0.2852F, -0.3526F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 41).addBox(-0.5F, 0.2852F, 7.3474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0133F, 10.9385F, 0.0745F, 0.6096F, 0.0427F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(25, 23).addBox(-0.5F, 0.2852F, -0.0526F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, 0.0366F, 0.3052F, 0.011F));

		PartDefinition RLeg = hips.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.8241F, 0.8792F, -0.6283F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0017F, -1.9932F, 0.8116F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2657F, 1.2395F, -1.7541F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3436F, 0.2593F, -0.0418F, -0.2149F, -0.1046F, 0.009F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6042F, 2.346F, 0.3425F, -1.5282F, -0.1421F, 0.256F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4782F, 2.9354F, -0.1082F, 1.571F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4116F, -1.803F, 0.009F, 0.0F, 0.0F));

		PartDefinition RLeg4 = hips.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.8241F, 0.8792F, 0.3739F, 0.0319F, -0.0812F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.0017F, -1.9932F, 0.7902F, 0.1149F, 0.0722F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2657F, 1.2395F, -2.0595F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3436F, 0.2593F, -0.0418F, -0.2149F, 0.1046F, -0.009F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6042F, 2.346F, 0.3425F, -1.5282F, 0.1421F, -0.256F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4782F, 2.9354F, -0.1082F, 1.571F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4116F, -1.803F, -0.5146F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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