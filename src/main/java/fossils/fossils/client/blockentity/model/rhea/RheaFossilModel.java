package fossils.fossils.client.blockentity.model.rhea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RheaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart neck11;
	private final ModelPart neck12;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public RheaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.neck11 = this.neck10.getChild("neck11");
		this.neck12 = this.neck11.getChild("neck12");
		this.head = this.neck12.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.4754F, 3.6883F, -0.1519F, -0.2157F, 0.0328F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 44).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 41).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.2875F, 3.3215F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5621F, 2.6332F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 59).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9858F, 0.4726F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0837F, 0.147F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 52).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9148F, -2.3171F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 49).addBox(-1.0F, -1.075F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4564F, -3.7179F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0201F, -0.0077F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1477F, -0.4379F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 19).addBox(-1.0F, -0.0973F, -5.9824F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.6444F, 1.423F, -0.3578F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.049F, -4.8424F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 74).addBox(-0.65F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0822F, 5.2211F, 7.6511F, -1.8407F, -0.4385F, 0.4951F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 44).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.4229F, 5.3499F, 9.1109F, -1.9664F, -0.8939F, 0.693F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 28).addBox(-0.7737F, -0.5572F, -0.1981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3005F, 4.4963F, 6.4358F, -0.5577F, 0.1139F, 0.3783F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 39).addBox(-0.838F, -0.3711F, -0.2863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2005F, 2.7964F, 4.7358F, -0.6669F, 0.3499F, 0.2713F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 22).addBox(-0.6923F, -0.5951F, -3.7541F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9534F, 2.8749F, 4.6284F, -0.8283F, 0.6037F, 0.0598F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 73).addBox(-0.875F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1303F, -2.4688F, 3.6849F, -0.475F, -0.7356F, 0.4015F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 59).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8332F, -1.901F, 4.1132F, -0.6088F, -0.4427F, 0.6795F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.517F, -1.8386F, 5.0583F, -1.2562F, 0.6429F, -0.8753F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 73).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8112F, -1.2898F, 4.9044F, -0.8877F, 0.6935F, -0.1834F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 74).addBox(-0.2F, 0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9096F, -1.9308F, 4.7426F, -0.6562F, 0.0531F, 0.1046F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 73).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9096F, -1.9308F, 4.7426F, -0.6202F, 0.236F, 0.3522F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(81, 47).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3699F, -1.6887F, 4.5407F, -0.6562F, 0.0531F, 0.1046F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 18).addBox(0.0841F, -1.7655F, -5.3678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.6647F, 0.1565F, 0.0239F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 5).addBox(-0.475F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4242F, -0.6479F, 3.117F, -0.9265F, 0.1565F, 0.0239F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 8).addBox(-0.8247F, -0.6278F, -0.3181F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0848F, 4.1515F, 8.8673F, -1.0566F, 0.3212F, 0.2196F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 38).addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3628F, 4.1649F, 8.6037F, -1.1039F, -0.0911F, 0.2617F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 0).addBox(-0.475F, -1.0F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8F, -2.3705F, 1.6118F, -0.4221F, 0.1195F, -0.0535F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.265F, -1.5956F, 2.4142F, -0.586F, -0.1536F, -0.6502F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 42).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8275F, -1.8475F, 1.8058F, -0.1973F, -0.5742F, -1.6418F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 60).addBox(-0.625F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.1327F, 4.9893F, -0.8159F, -0.09F, 0.0952F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 61).addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 0.225F, 6.3953F, -0.7262F, -0.0653F, 0.0579F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(50, 81).addBox(-0.25F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.5131F, 7.4755F, -0.8135F, -0.06F, 0.0634F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(81, 50).addBox(-0.35F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.2385F, 8.1639F, 0.4504F, -0.0573F, 0.1178F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(13, 0).addBox(-0.9F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.787F, 5.988F, -0.557F, -0.4176F, -0.6339F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(41, 40).addBox(-0.8258F, -0.4719F, -0.9392F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0625F, 0.5901F, 4.0773F, -0.7F, 0.139F, 0.0238F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 59).addBox(-0.8258F, -0.077F, 1.5457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.0625F, 0.5901F, 4.0773F, -0.4818F, 0.139F, 0.0238F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(81, 53).addBox(-0.5178F, -0.7439F, -0.5429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.648F, 2.4227F, 7.3758F, -1.1102F, -0.3583F, -0.5639F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5178F, -0.2924F, -1.8023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 81).addBox(-0.5178F, -0.2924F, -0.2023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.648F, 2.4227F, 7.3758F, -1.2847F, -0.3583F, -0.5639F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 12).addBox(-0.8503F, -0.6132F, -1.6845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0848F, 4.1515F, 8.8673F, -0.7047F, 0.1753F, 0.2679F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 37).addBox(-0.8096F, -0.6378F, -0.2158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3625F, 2.5901F, 6.6773F, -0.7467F, 0.0082F, 0.0672F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.5F, 1.049F, -4.8424F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.35F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0822F, 5.2211F, 7.6511F, -1.8407F, 0.4385F, -0.4951F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 44).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4229F, 5.3499F, 9.1109F, -1.9664F, 0.8939F, -0.693F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(59, 28).mirror().addBox(-0.2263F, -0.5572F, -0.1981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3005F, 4.4963F, 6.4358F, -0.5577F, -0.1139F, -0.3783F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(23, 39).mirror().addBox(-0.162F, -0.3711F, -0.2863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2005F, 2.7964F, 4.7358F, -0.6669F, -0.3499F, -0.2713F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.3077F, -0.5951F, -3.7541F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9534F, 2.8749F, 4.6284F, -0.8283F, -0.6037F, -0.0598F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-0.125F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1303F, -2.4688F, 3.6849F, -0.475F, 0.7356F, -0.4015F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8332F, -1.901F, 4.1132F, -0.6088F, 0.4427F, -0.6795F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.517F, -1.8386F, 5.0583F, -1.2562F, -0.6429F, 0.8753F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8112F, -1.2898F, 4.9044F, -0.8877F, -0.6935F, 0.1834F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-0.8F, 0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9096F, -1.9308F, 4.7426F, -0.6562F, -0.0531F, -0.1046F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9096F, -1.9308F, 4.7426F, -0.6202F, -0.236F, -0.3522F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3699F, -1.6887F, 4.5407F, -0.6562F, -0.0531F, -0.1046F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-1.0841F, -1.7655F, -5.3678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.6647F, -0.1565F, -0.0239F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 5).mirror().addBox(-0.525F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4242F, -0.6479F, 3.117F, -0.9265F, -0.1565F, -0.0239F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-1.1753F, -0.6278F, -0.3181F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0848F, 4.1515F, 8.8673F, -1.0566F, -0.3212F, -0.2196F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3628F, 4.1649F, 8.6037F, -1.1039F, 0.0911F, -0.2617F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-0.525F, -1.0F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -2.3705F, 1.6118F, -0.4221F, -0.1195F, 0.0535F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.265F, -1.5956F, 2.4142F, -0.586F, 0.1536F, 0.6502F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 42).mirror().addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8275F, -1.8475F, 1.8058F, -0.1973F, 0.5742F, 1.6418F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-0.375F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.1327F, 4.9893F, -0.8159F, 0.09F, -0.0952F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.225F, 6.3953F, -0.7262F, 0.0653F, -0.0579F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.75F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5131F, 7.4755F, -0.8135F, 0.06F, -0.0634F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 50).mirror().addBox(-0.65F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2385F, 8.1639F, 0.4504F, 0.0573F, -0.1178F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(-0.1F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.787F, 5.988F, -0.557F, 0.4176F, 0.6339F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 40).mirror().addBox(-0.1742F, -0.4719F, -0.9392F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0625F, 0.5901F, 4.0773F, -0.7F, -0.139F, -0.0238F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 59).mirror().addBox(-0.1742F, -0.077F, 1.5457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.0625F, 0.5901F, 4.0773F, -0.4818F, -0.139F, -0.0238F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(81, 53).mirror().addBox(-0.4822F, -0.7439F, -0.5429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.648F, 2.4227F, 7.3758F, -1.1102F, 0.3583F, 0.5639F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.4822F, -0.2924F, -1.8023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 81).mirror().addBox(-0.4822F, -0.2924F, -0.2023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.648F, 2.4227F, 7.3758F, -1.2847F, 0.3583F, 0.5639F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(-1.1497F, -0.6132F, -1.6845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0848F, 4.1515F, 8.8673F, -0.7047F, -0.1753F, -0.2679F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.1904F, -0.6378F, -0.2158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3625F, 2.5901F, 6.6773F, -0.7467F, -0.0082F, -0.0672F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 0.1303F, -1.6058F, -0.4333F, -0.0283F, -0.2164F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 77).addBox(-1.5F, 0.222F, -0.8799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.774F, 3.5843F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(42, 77).addBox(-0.5F, -0.0109F, -0.9106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.774F, 3.5843F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(40, 92).addBox(0.5F, 0.3959F, -0.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.774F, 3.5843F, 2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(80, 92).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 7.558F, 5.1254F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 77).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 8.4605F, 4.6949F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 8.6329F, 3.2913F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 62).addBox(-1.0F, -0.3486F, -0.6201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 7.774F, 3.5843F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(32, 18).addBox(-1.0F, -6.0F, 0.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 31).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 6.7962F, 2.1035F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 54).addBox(-1.0F, -1.6615F, -0.6232F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 49).addBox(-1.0F, -2.3196F, -0.3188F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 7.774F, 3.5843F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 2.254F, -0.084F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 63).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 1.388F, -0.584F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(76, 65).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 0.4635F, -0.267F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(25, 92).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4635F, -0.267F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 82).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.733F, 1.2883F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.162F, 0.8421F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 22).addBox(-3.5F, -2.175F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.0F, 2.0011F, 0.6148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 8.0282F, 4.7314F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 3).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.0428F, -0.5169F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 16).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.6639F, -0.1844F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, 0.6639F, -0.1844F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 34).addBox(-1.0F, -1.0F, -0.45F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.7F, 2.249F, -0.1577F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(50, 31).addBox(-1.5F, -0.2F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 13.5669F, -1.4296F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 28).addBox(-1.5F, -0.3F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 13.5669F, -1.4296F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, -2.5F, -0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 2.8745F, 0.0395F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 7.5182F, 0.1536F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(41, 10).addBox(-2.5F, -0.2F, -1.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 2.7497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(66, 38).addBox(-5.8F, -3.6498F, 0.5679F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.4472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8292F, 0.9336F, 0.647F, -1.047F, 0.0064F, 0.052F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8292F, 0.9336F, 0.647F, -1.3961F, 0.0064F, 0.052F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(76, 40).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8068F, 1.3283F, 0.3653F, -0.698F, 0.0064F, 0.052F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.587F, 5.4866F, -0.1822F, -0.1307F, 0.0064F, 0.052F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(41, 23).addBox(-1.5F, -0.0446F, -0.5239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 14.206F, -2.1231F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(27, 47).addBox(-5.5F, -3.0F, -1.2F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 7.9553F, 0.4261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(17, 62).addBox(-5.5F, -2.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 1.9553F, 0.4261F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 7).addBox(-1.8F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 8.5397F, 0.064F, 1.4312F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, -0.0049F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftToes.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 12).addBox(-5.3F, 0.0F, 0.75F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, 0.15F, -3.35F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, 0.1303F, -1.6058F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(75, 91).addBox(0.5F, 0.222F, -0.8799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.774F, 3.5843F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(91, 62).addBox(-0.5F, -0.0109F, -0.9106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.774F, 3.5843F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(90, 93).addBox(-1.5F, 0.3959F, -0.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.774F, 3.5843F, 2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(93, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 7.558F, 5.1254F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 54).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 8.4605F, 4.6949F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(50, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 8.6329F, 3.2913F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 70).addBox(-1.0F, -0.3486F, -0.6201F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 7.774F, 3.5843F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(34, 34).addBox(-1.0F, -6.0F, 0.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 26).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 6.7962F, 2.1035F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(31, 65).addBox(-1.0F, -1.6615F, -0.6232F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 53).addBox(-1.0F, -2.3196F, -0.3188F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 7.774F, 3.5843F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(60, 91).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 2.254F, -0.084F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(55, 91).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 1.388F, -0.584F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 51).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 0.4635F, -0.267F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(45, 93).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4635F, -0.267F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(91, 48).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.733F, 1.2883F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(35, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.162F, 0.8421F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 75).addBox(2.5F, -2.175F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.0F, 2.0011F, 0.6148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 8.0282F, 4.7314F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0428F, -0.5169F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 45).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.6639F, -0.1844F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 24).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, 0.6639F, -0.1844F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(9, 54).addBox(-1.0F, -1.0F, -0.45F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7F, 2.249F, -0.1577F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 54).addBox(-1.5F, -0.2F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 13.5669F, -1.4296F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 42).addBox(-1.5F, -0.3F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, 13.5669F, -1.4296F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(28, 53).addBox(-1.0F, -2.5F, -0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7F, 2.8745F, 0.0395F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(16, 36).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7F, 7.5182F, 0.1536F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(41, 45).addBox(0.5F, -0.2F, -1.05F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 2.7497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(66, 59).addBox(3.8F, -3.6498F, 0.5679F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.4472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8292F, 0.9336F, 0.647F, -1.047F, -0.0064F, -0.052F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(25, 76).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8292F, 0.9336F, 0.647F, -1.3961F, -0.0064F, -0.052F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(76, 44).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8068F, 1.3283F, 0.3653F, -0.698F, -0.0064F, -0.052F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(27, 19).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.587F, 5.4866F, -0.1822F, -0.1307F, -0.0064F, -0.052F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.0446F, -0.5239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 14.206F, -2.1231F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(34, 47).addBox(3.5F, -3.0F, -1.2F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0F, 7.9553F, 0.4261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(17, 66).addBox(3.5F, -2.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.0F, 1.9553F, 0.4261F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(15, 14).addBox(-2.2F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 8.5397F, -0.686F, 2.042F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 17).addBox(-2.2F, -0.5F, -3.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, -0.0049F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 66).addBox(-0.5F, -0.0104F, 0.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(31, 62).addBox(0.0F, -0.3104F, 1.0244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0861F, 3.3285F, -0.9774F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 49).addBox(-0.5F, -0.794F, -0.0402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 67).addBox(0.0F, -0.994F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8043F, 1.9382F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(57, 22).addBox(-0.5F, 0.006F, -0.0402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2903F, -4.168F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(15, 94).addBox(0.0F, -1.1025F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.9F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(23, 95).addBox(0.0F, -1.1535F, -0.0164F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 53).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.047F, -0.3252F, -1.4261F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.2065F, -0.2573F, -0.8834F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(59, 32).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.2721F, -0.1331F, -0.3423F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0314F, -0.0504F, -0.4422F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.042F, -0.0625F, -0.9875F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0051F, -0.0751F, -1.5122F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 53).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0051F, 0.0751F, 1.5122F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 34).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.042F, 0.0625F, 0.9875F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(35, 59).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0314F, 0.0504F, 0.4422F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 32).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.2721F, 0.1331F, 0.3423F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 32).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.2065F, 0.2573F, 0.8834F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 53).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.047F, 0.3252F, 1.4261F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.6F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.775F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(40, 95).addBox(0.0F, -0.9025F, -0.0576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.9F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(95, 33).addBox(0.0F, -1.0535F, -0.0164F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.0405F, -0.282F, -1.4281F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.1781F, -0.2235F, -0.8902F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.2307F, -0.1184F, -0.3475F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 94).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.3111F, -0.1775F, -0.4101F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.2171F, -0.3152F, -0.9543F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0241F, -0.38F, -1.5079F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-2.0F, 0.0053F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.875F, 2.9604F, -3.0403F, -0.0516F, -0.7179F, -1.4054F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 63).mirror().addBox(-2.0F, 0.0017F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5451F, 3.674F, -1.6842F, -0.0407F, -0.9905F, -1.4827F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7111F, 1.7763F, -2.8537F, 0.1897F, -1.3251F, -1.6444F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(0.0F, -0.025F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5244F, 3.1863F, -1.936F, 0.412F, -1.068F, -1.7492F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(73, 63).addBox(0.0F, 0.0017F, -0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5451F, 3.674F, -1.6842F, -0.0407F, 0.9905F, 1.4827F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(57, 26).addBox(-3.0F, -0.025F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5244F, 3.1863F, -1.936F, 0.412F, 1.068F, 1.7492F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(71, 20).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0241F, 0.38F, 1.5079F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 28).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.2171F, 0.3152F, 0.9543F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 94).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.3111F, 0.1775F, 0.4101F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(94, 65).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.2307F, 0.1184F, 0.3475F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(73, 26).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.1781F, 0.2235F, 0.8902F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(73, 38).addBox(0.0F, 0.0053F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.875F, 2.9604F, -3.0403F, -0.0516F, 0.7179F, 1.4054F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(73, 36).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7111F, 1.7763F, -2.8537F, 0.1897F, 1.3251F, 1.6444F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(66, 30).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.0405F, 0.282F, 1.4281F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(16, 25).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.6F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8495F, -3.832F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(23, 36).addBox(0.0F, -1.5468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(95, 24).addBox(0.0F, -0.7982F, -0.1317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0687F, -2.6025F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(-2.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.1192F, -0.0654F, -0.3073F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.1095F, -0.1207F, -0.8515F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(-5.77F, -3.756F, -0.5341F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.0342F, -0.1592F, -1.379F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 94).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.089F, 0.0004F, -0.3314F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.0346F, 0.0433F, -0.8744F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.0083F, 0.0548F, -1.3985F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.2036F, 0.2448F, -0.9115F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.3358F, 0.088F, -0.382F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-1.0F, -0.05F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8968F, 2.5272F, 0.3164F, 0.1814F, -1.2892F, -1.5827F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(55, 94).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.3358F, -0.088F, 0.382F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(20, 73).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.2036F, -0.2448F, 0.9115F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(9, 42).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.0083F, -0.0548F, 1.3985F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(7, 73).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.0346F, -0.0433F, 0.8744F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(18, 94).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.089F, -0.0004F, 0.3314F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 30).addBox(-1.0F, -0.05F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8968F, 2.5272F, 0.3164F, 0.1814F, 1.2892F, 1.5827F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(64, 36).addBox(2.77F, -3.756F, -0.5341F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.0342F, 0.1592F, 1.379F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 76).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.1095F, 0.1207F, 0.8515F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 60).addBox(1.9152F, -0.4179F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.1192F, 0.0654F, 0.3073F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(40, 80).addBox(-1.1727F, -0.9964F, -1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.5869F, -1.2046F, -1.1624F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(80, 35).addBox(-1.1727F, 0.0036F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 6.518F, -2.1305F, -0.0715F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(30, 80).addBox(-1.1727F, 0.0036F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.5536F, -2.7295F, 0.0594F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 29).addBox(-1.1727F, -0.9964F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.8445F, -3.3069F, 0.3648F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(10, 79).addBox(-1.1727F, -0.0464F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.3119F, -4.0936F, 0.9757F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 78).addBox(-1.1727F, -1.0621F, 0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.3119F, -4.0936F, 0.6528F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(16, 31).addBox(-1.6727F, -0.9941F, -0.0198F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.112F, -3.6936F, -0.0803F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(48, 4).addBox(-2.1727F, -1.9941F, -0.0198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.112F, -3.6936F, 0.6179F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 39).addBox(-2.1727F, -2.8888F, -0.637F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.112F, -3.6936F, 0.2862F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(77, 76).addBox(-1.1727F, -1.3328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(77, 73).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 5.4874F, -5.1746F, 0.1728F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(72, 77).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.412F, -4.7936F, 0.391F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(28, 6).addBox(-1.0F, -1.3F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7154F, 0.8115F, -2.4977F, 1.0207F, 0.3187F, -0.1359F));

		PartDefinition cube_r204 = leftArm1.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(21, 49).addBox(0.0F, -1.6F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftArm1.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 8.4598F, 0.8712F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm1.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(47, 58).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0059F, 4.7633F, 0.7098F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftArm1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 53).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 1.0949F, 0.2269F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftArm1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(78, 32).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0059F, 1.3353F, 0.2525F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3467F, 11.5947F, -0.3428F, -2.9238F, 0.0387F, -0.0202F));

		PartDefinition cube_r209 = leftArm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 59).addBox(-1.75F, 0.1F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 4.142F, 0.417F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(71, 6).addBox(-1.75F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.8072F, 0.1193F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(66, 65).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 57).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 78).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftArm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F))
				.texOffs(47, 78).addBox(-0.5F, -1.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(35, 78).addBox(-0.5F, -0.725F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(37, 72).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F))
				.texOffs(71, 65).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftArm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(57, 75).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(65, 92).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 7.7822F, -0.8346F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.35F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 4.4323F, -0.8638F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(16, 54).addBox(-0.5F, -0.35F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 1.0486F, -0.4158F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3959F, 8.2608F, -0.3495F, 2.3107F, -0.0692F, 0.0532F));

		PartDefinition cube_r219 = leftHand.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 60).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5026F, 1.2123F, -0.1828F, -0.3405F, 0.0495F, 0.0529F));

		PartDefinition cube_r220 = leftHand.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(59, 42).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.4719F, 0.4993F, -0.327F, -0.0787F, 0.0495F, 0.0529F));

		PartDefinition cube_r221 = leftHand.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(92, 71).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 92).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 68).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5588F, 2.6368F, 0.1052F, 0.4886F, 0.0495F, 0.0529F));

		PartDefinition cube_r222 = leftHand.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 4).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.5097F, 1.3849F, -0.2416F, 0.2704F, 0.0495F, 0.0529F));

		PartDefinition cube_r223 = leftHand.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.452F, 1.1948F, 0.7182F, 0.0959F, 0.0495F, 0.0529F));

		PartDefinition cube_r224 = leftHand.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 48).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7842F, 4.0223F, 1.0115F, 0.3075F, 0.0835F, 0.0853F));

		PartDefinition cube_r225 = leftHand.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(35, 81).addBox(-0.5F, 0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(81, 21).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(81, 18).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.5137F, 2.6261F, 1.0116F, 0.133F, 0.0835F, 0.0853F));

		PartDefinition cube_r226 = leftHand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(81, 15).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4913F, 2.2454F, 0.8909F, 0.3075F, 0.0835F, 0.0853F));

		PartDefinition cube_r227 = leftHand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(81, 12).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(81, 9).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.507F, 1.7187F, 0.1682F, 0.482F, 0.0835F, 0.0853F));

		PartDefinition cube_r228 = leftHand.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(62, 75).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.452F, 1.1948F, 0.7182F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7154F, 0.8115F, -2.4977F, 1.0207F, -0.3187F, 0.1359F));

		PartDefinition cube_r229 = rightArm1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(71, 16).addBox(-1.0F, -1.6F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightArm1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(57, 70).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 8.4598F, 0.8712F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(64, 42).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0059F, 4.7633F, 0.7098F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightArm1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(42, 61).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 1.0949F, 0.2269F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightArm1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(5, 91).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0059F, 1.3353F, 0.2525F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3467F, 11.5947F, -0.3428F, -2.9238F, -0.0387F, 0.0202F));

		PartDefinition cube_r234 = rightArm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 65).addBox(0.75F, 0.1F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 4.142F, 0.417F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightArm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 11).addBox(0.75F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.8072F, 0.1193F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightArm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(62, 70).addBox(0.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(15, 91).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 12).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F))
				.texOffs(91, 9).addBox(-0.5F, -1.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(91, 6).addBox(-0.5F, -0.725F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightArm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F))
				.texOffs(74, 69).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(92, 80).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 7.7822F, -0.8346F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightArm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.35F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 4.4323F, -0.8638F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightArm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(47, 64).addBox(-0.5F, -0.35F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 1.0486F, -0.4158F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3959F, 8.2608F, -0.3495F, 2.3107F, 0.0692F, -0.0532F));

		PartDefinition cube_r244 = rightHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(91, 45).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(91, 42).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5026F, 1.2123F, -0.1828F, -0.3405F, -0.0495F, -0.0529F));

		PartDefinition cube_r245 = rightHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(76, 54).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.4719F, 0.4993F, -0.327F, -0.0787F, -0.0495F, -0.0529F));

		PartDefinition cube_r246 = rightHand.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(93, 30).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 93).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 92).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5588F, 2.6368F, 0.1052F, 0.4886F, -0.0495F, -0.0529F));

		PartDefinition cube_r247 = rightHand.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(76, 22).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.5097F, 1.3849F, -0.2416F, 0.2704F, -0.0495F, -0.0529F));

		PartDefinition cube_r248 = rightHand.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 16).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.452F, 1.1948F, 0.7182F, 0.0959F, -0.0495F, -0.0529F));

		PartDefinition cube_r249 = rightHand.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(76, 51).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7842F, 4.0223F, 1.0115F, 0.3075F, -0.0835F, -0.0853F));

		PartDefinition cube_r250 = rightHand.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 39).addBox(-0.5F, 0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(91, 36).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(91, 21).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.5137F, 2.6261F, 1.0116F, 0.133F, -0.0835F, -0.0853F));

		PartDefinition cube_r251 = rightHand.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(20, 91).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.4913F, 2.2454F, 0.8909F, 0.3075F, -0.0835F, -0.0853F));

		PartDefinition cube_r252 = rightHand.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(91, 18).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(91, 15).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.507F, 1.7187F, 0.1682F, 0.482F, -0.0835F, -0.0853F));

		PartDefinition cube_r253 = rightHand.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 12).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.452F, 1.1948F, 0.7182F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 4.2036F, -2.0961F));

		PartDefinition cube_r254 = bone.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(30, 12).addBox(-0.2825F, -0.8007F, 1.4802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0163F, -3.8179F, -1.2093F, 0.072F, -0.1682F, -0.4763F));

		PartDefinition cube_r255 = bone.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(57, 6).addBox(-0.5732F, -0.4944F, -0.2949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0163F, -3.8179F, -1.2093F, 0.2615F, 0.0088F, -0.4391F));

		PartDefinition cube_r256 = bone.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(67, 80).addBox(-0.0339F, 0.7625F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4719F, 1.692F, -1.3005F, 0.719F, -1.3919F, -0.2362F));

		PartDefinition cube_r257 = bone.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(20, 79).addBox(-1.2702F, 0.2223F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4719F, 1.692F, -1.3005F, 1.4005F, -0.6598F, -0.975F));

		PartDefinition cube_r258 = bone.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 4).addBox(-0.7F, -0.7F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0737F, 1.5017F, -1.1584F, 0.6884F, -1.0988F, -0.4154F));

		PartDefinition cube_r259 = bone.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(50, 72).addBox(-0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0432F, 0.6841F, -1.4789F, 0.7108F, -0.9612F, -0.5383F));

		PartDefinition cube_r260 = bone.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 57).addBox(-4.0F, -0.5F, 0.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.098F, 1.0334F, 2.8591F, 0.7762F, -1.3305F, -0.5593F));

		PartDefinition cube_r261 = bone.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 81).addBox(-1.1461F, -1.0729F, -0.5375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0719F, 1.592F, -0.7005F, 0.9081F, -0.7943F, -0.7766F));

		PartDefinition cube_r262 = bone.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(81, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7323F, 2.4524F, 0.8661F, 0.7234F, -0.3524F, -1.1606F));

		PartDefinition cube_r263 = bone.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(81, 3).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6115F, 2.1286F, -0.0722F, 1.5524F, -0.3524F, -1.1606F));

		PartDefinition cube_r264 = bone.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(81, 0).addBox(-1.4713F, -0.7022F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4719F, 1.692F, -1.3005F, 1.1804F, 0.9546F, -1.5677F));

		PartDefinition cube_r265 = bone.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(72, 80).addBox(-1.0989F, -0.4513F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4719F, 1.692F, -1.3005F, 1.3462F, 0.1579F, -1.2796F));

		PartDefinition cube_r266 = bone.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(32, 72).addBox(-1.4013F, -2.269F, -0.6354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0719F, 1.592F, -0.7005F, 0.5072F, -1.0223F, -0.3509F));

		PartDefinition cube_r267 = bone.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 79).addBox(0.5016F, -0.0548F, -0.6182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9523F, 0.0333F, -3.0475F, 0.1594F, -1.0185F, -0.0191F));

		PartDefinition cube_r268 = bone.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(27, 72).addBox(0.3054F, 0.0026F, -0.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9523F, 0.9333F, -2.8475F, 0.9234F, -0.758F, -0.7379F));

		PartDefinition cube_r269 = bone.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(28, 58).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9505F, -1.7978F, -2.3712F, 1.2828F, 0.3249F, 0.4175F));

		PartDefinition cube_r270 = bone.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(80, 26).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3822F, -3.2533F, -1.0265F, 1.0294F, -0.045F, -0.3349F));

		PartDefinition cube_r271 = bone.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(55, 55).addBox(-0.5F, -0.7F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4623F, -1.0988F, -1.8817F, 1.0793F, 0.241F, 0.1591F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8F, 4.2036F, -2.0961F));

		PartDefinition cube_r272 = bone4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-0.7175F, -0.8007F, 1.4802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -3.8179F, -1.2093F, 0.072F, 0.1682F, 0.4763F));

		PartDefinition cube_r273 = bone4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-0.4268F, -0.4944F, -0.2949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -3.8179F, -1.2093F, 0.2615F, -0.0088F, 0.4391F));

		PartDefinition cube_r274 = bone4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.9661F, 0.7625F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4719F, 1.692F, -1.3005F, 0.719F, 1.3919F, 0.2362F));

		PartDefinition cube_r275 = bone4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(0.2702F, 0.2223F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4719F, 1.692F, -1.3005F, 1.4005F, 0.6598F, 0.975F));

		PartDefinition cube_r276 = bone4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-3.3F, -0.7F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0737F, 1.5017F, -1.1584F, 0.6884F, 1.0988F, 0.4154F));

		PartDefinition cube_r277 = bone4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-2.9F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0432F, 0.6841F, -1.4789F, 0.7108F, 0.9612F, 0.5383F));

		PartDefinition cube_r278 = bone4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(0.0F, -0.5F, 0.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.098F, 1.0334F, 2.8591F, 0.7762F, 1.3305F, 0.5593F));

		PartDefinition cube_r279 = bone4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(0.1461F, -1.0729F, -0.5375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.0719F, 1.592F, -0.7005F, 0.9081F, 0.7943F, 0.7766F));

		PartDefinition cube_r280 = bone4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7323F, 2.4524F, 0.8661F, 0.7234F, 0.3524F, 1.1606F));

		PartDefinition cube_r281 = bone4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6115F, 2.1286F, -0.0722F, 1.5524F, 0.3524F, 1.1606F));

		PartDefinition cube_r282 = bone4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(0.4713F, -0.7022F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4719F, 1.692F, -1.3005F, 1.1804F, -0.9546F, 1.5677F));

		PartDefinition cube_r283 = bone4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(0.0989F, -0.4513F, 0.2623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4719F, 1.692F, -1.3005F, 1.3462F, -0.1579F, 1.2796F));

		PartDefinition cube_r284 = bone4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(0.4013F, -2.269F, -0.6354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.0719F, 1.592F, -0.7005F, 0.5072F, 1.0223F, 0.3509F));

		PartDefinition cube_r285 = bone4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-1.5016F, -0.0548F, -0.6182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9523F, 0.0333F, -3.0475F, 0.1594F, 1.0185F, 0.0191F));

		PartDefinition cube_r286 = bone4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-1.3054F, 0.0026F, -0.5934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9523F, 0.9333F, -2.8475F, 0.9234F, 0.758F, 0.7379F));

		PartDefinition cube_r287 = bone4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9505F, -1.7978F, -2.3712F, 1.2828F, -0.3249F, -0.4175F));

		PartDefinition cube_r288 = bone4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3822F, -3.2533F, -1.0265F, 1.0294F, 0.045F, 0.3349F));

		PartDefinition cube_r289 = bone4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-0.5F, -0.7F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4623F, -1.0988F, -1.8817F, 1.0793F, -0.241F, -0.1591F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3168F, -3.9195F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r290 = neck6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(26, 95).addBox(0.0F, -2.3943F, -1.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 10).addBox(-0.5F, -1.9943F, -2.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9814F, -0.652F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(60, 94).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4336F, -1.7927F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r292 = neck6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(60, 94).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4336F, -1.7927F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0814F, -2.052F, -0.3065F, 0.0832F, -0.0263F));

		PartDefinition cube_r293 = neck5.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(95, 27).addBox(0.0F, -1.4F, -1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 26).addBox(-0.5F, -1.075F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7333F, -1.8459F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r294 = neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(29, 95).addBox(0.0F, -2.3981F, 3.7713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(-0.5F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -1.4F, 0.0087F, 0.0011F, -0.1309F));

		PartDefinition cube_r295 = neck3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(32, 95).addBox(0.0F, 0.0065F, -0.2463F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r296 = neck3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(38, 67).addBox(-1.0F, 3.1773F, -0.9318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7451F, -0.5755F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(52, 67).addBox(-0.995F, 1.4022F, -1.3146F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.495F, -3.7297F, -2.1899F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.717F, -1.798F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r298 = neck.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(57, 14).addBox(-0.994F, -0.1384F, 2.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.494F, -1.4854F, -4.4415F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8885F, -1.5332F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r299 = neck7.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(41, 30).addBox(-0.994F, -0.1384F, 1.0138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.494F, -0.7392F, -3.7167F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0376F, -2.5775F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r300 = neck8.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(41, 35).addBox(-0.994F, -0.1384F, 0.7138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.494F, -1.2263F, -3.4455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9478F, -2.6288F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r301 = neck9.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(57, 34).addBox(-0.994F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.494F, -0.7513F, -3.4455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3454F, -1.6168F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r302 = neck10.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(40, 57).addBox(-0.994F, -0.1134F, 1.1638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.494F, -0.6263F, -2.9455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck11 = neck10.addOrReplaceChild("neck11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.206F, -1.6125F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r303 = neck11.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 45).addBox(-0.994F, -0.2884F, 1.4388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.494F, -0.6263F, -3.2455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r304 = neck11.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(7, 34).addBox(0.0F, -0.375F, 1.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.8412F, -2.3565F, -0.3403F, 0.0F, 0.0F));

		PartDefinition neck12 = neck11.addOrReplaceChild("neck12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3481F, -1.5922F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r305 = neck12.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(11, 22).addBox(0.0F, -0.25F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.4931F, -0.7643F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r306 = neck12.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(21, 58).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1009F, -0.9703F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head = neck12.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1121F, -1.733F, 0.3187F, -0.0308F, -0.0454F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -1.8454F, -2.4096F, 0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(20, 82).addBox(0.0F, -0.325F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.506F, -0.6049F, -1.2037F, 0.685F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(60, 82).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.006F, -0.7916F, -2.2324F, 2.2122F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(55, 82).addBox(0.0F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.506F, -0.7883F, -1.9824F, 1.5577F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(47, 74).addBox(0.0F, -0.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 70).addBox(0.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.506F, -0.7883F, -1.9824F, 1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(69, 56).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.006F, -1.8924F, -2.0124F, 1.6886F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(69, 53).addBox(-1.5F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.494F, -1.9369F, -1.414F, -3.0674F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(69, 50).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.494F, -1.929F, -0.8141F, -1.5839F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(69, 41).addBox(-1.5F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.494F, -1.8171F, -0.2246F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(31, 69).addBox(-1.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.494F, -1.406F, 0.2124F, 0.8159F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(69, 47).addBox(-2.0F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(69, 44).addBox(-2.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.994F, -0.8958F, 0.5281F, 1.2523F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(57, 67).addBox(-2.0F, -0.8002F, -1.0288F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.994F, -1.016F, 0.7228F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(77, 79).addBox(-0.5F, -0.3829F, -0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(79, 68).addBox(-0.5F, -0.3829F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 79).addBox(-0.5F, -0.3829F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.006F, -1.06F, -6.5069F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(62, 79).addBox(-0.5F, 0.1723F, -0.5165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.006F, -1.06F, -6.5069F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(82, 74).addBox(-0.5F, -0.3534F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.006F, -1.3689F, -5.5921F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(82, 71).addBox(-0.5F, -0.3534F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.006F, -1.4288F, -5.2981F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, -0.3534F, -1.6382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.006F, -1.5759F, -4.0065F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(82, 77).addBox(-0.5F, -0.35F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.006F, -0.8227F, -3.8024F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(48, 20).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.7316F, -3.3107F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -0.075F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(18, 44).addBox(-0.5F, -0.275F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.006F, -1.1494F, -3.2333F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(77, 82).addBox(-0.5F, -0.575F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(9, 44).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.006F, -1.1494F, -3.2333F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(57, 18).addBox(-0.5F, -0.3534F, -1.6382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.006F, -1.6099F, -2.7069F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -11.0378F, -3.5937F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(87, 72).addBox(-0.65F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2664F, 10.3196F, 3.7574F, -0.971F, -0.518F, -0.608F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(87, 69).addBox(-0.65F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.1425F, 10.4302F, 3.5075F, -1.0387F, -0.2595F, -0.4315F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(87, 81).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0407F, 10.1374F, 3.5592F, 1.1185F, -0.9459F, -1.031F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(5, 88).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 10.142F, 4.1218F, 0.8008F, -0.2493F, -0.7348F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(87, 78).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 9.2207F, 3.3691F, -0.1444F, -0.1202F, -0.6894F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(87, 75).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 9.4263F, 3.5876F, 0.9464F, -0.4561F, -0.5486F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(50, 87).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 9.8869F, 3.964F, 0.6624F, -0.5441F, -0.3838F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(10, 88).addBox(-0.7F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 87).addBox(-0.7F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.406F, 10.4269F, 4.0279F, 1.207F, -0.4948F, 0.1789F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(35, 87).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.106F, 10.2642F, 3.5344F, 0.6655F, -1.1613F, 0.863F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 87).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 10.9968F, 3.84F, 1.1981F, -0.5355F, 0.1969F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(85, 86).addBox(-0.8F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0836F, 10.8383F, 3.3594F, 0.6655F, -1.1613F, 0.863F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 86).addBox(-0.8F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2389F, 10.6568F, 2.809F, 1.1981F, -0.5355F, 0.1969F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(43, 70).addBox(-1.2046F, -0.4782F, -0.3447F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5178F, -0.4239F, -0.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 1.4893F, 0.0142F, 0.2024F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(65, 86).addBox(-0.3524F, -0.1149F, -0.2534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(86, 47).addBox(-0.6524F, -0.1149F, -0.2534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 0.9017F, 0.2631F, 0.0525F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 62).addBox(-0.2399F, 0.0317F, -0.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 1.5196F, 0.2977F, 0.6881F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(86, 53).addBox(-0.3524F, 0.03F, -0.6058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(86, 50).addBox(-0.6524F, 0.03F, -0.6058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 1.4253F, 0.2631F, 0.0525F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(86, 44).addBox(-0.5353F, -0.3121F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(86, 41).addBox(-0.2853F, -0.3121F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 0.8871F, 0.1273F, 0.1585F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(20, 70).addBox(-1.201F, -0.2883F, -0.3168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 0.7743F, 0.0063F, -0.026F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(40, 86).addBox(-0.1702F, -0.318F, -0.172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, 0.0999F, -0.057F, 0.1961F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(86, 38).addBox(-0.1253F, -0.2985F, -0.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, -0.074F, 0.0805F, 0.6771F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(30, 86).addBox(-0.531F, -1.0322F, -0.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 86).addBox(-0.531F, -0.7322F, -0.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.928F, 11.0805F, 3.24F, -0.695F, -0.2218F, -0.4088F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(86, 21).addBox(-0.506F, -0.4578F, -0.2548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 18).addBox(-0.506F, -0.4578F, -0.4297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(85, 24).addBox(-0.506F, -0.4578F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0303F, 10.858F, 3.0596F, -0.4979F, -0.0454F, -0.2593F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(86, 15).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.406F, 9.1924F, 1.1841F, 0.6206F, 0.3019F, 0.1798F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, -0.3829F, -0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 9).addBox(-0.5F, -0.3829F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 6).addBox(-0.5F, -0.3829F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.206F, 9.9279F, -2.9132F, 0.018F, 0.4607F, -0.0279F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(86, 3).addBox(-0.5F, -0.3829F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 85).addBox(-0.5F, -0.3829F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 85).addBox(-0.5F, -0.3829F, -0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.206F, 9.9779F, -2.9132F, 0.4014F, 0.1745F, 0.0F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 0.1723F, -0.5165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.206F, 9.9779F, -2.9132F, 1.7977F, 0.1745F, 0.0F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(55, 85).addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-2.106F, 9.8419F, -2.1016F, 0.22F, 0.1278F, 0.0285F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(85, 35).addBox(-0.4F, -0.3534F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(85, 27).addBox(-0.4F, -0.3534F, -0.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-2.206F, 9.6091F, -1.7044F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(64, 22).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-2.056F, 9.6769F, -1.0055F, 0.1135F, 0.0347F, 0.004F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(64, 18).addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.906F, 9.5911F, 0.2526F, 0.0271F, 0.2617F, 0.007F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(64, 14).addBox(-0.675F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.906F, 9.5911F, 0.2526F, 0.0264F, 0.1309F, 0.0034F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(20, 85).addBox(-0.506F, -0.328F, -0.7391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(15, 85).addBox(-0.506F, -0.328F, -0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F))
				.texOffs(5, 85).addBox(-0.506F, -0.328F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.0303F, 10.858F, 3.0596F, -0.8034F, -0.0454F, -0.2593F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(10, 85).addBox(-0.2473F, -0.6538F, -0.4292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, -0.6736F, 0.6617F, -0.4989F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(64, 10).addBox(-0.2719F, -0.687F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2765F, 9.5247F, 2.7797F, -0.1086F, 0.6511F, -0.3938F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(84, 66).addBox(-0.6986F, -0.5847F, 0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 84).addBox(-0.6986F, -0.5847F, 0.3616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7907F, 10.8407F, 1.7204F, -0.3458F, 0.0389F, -0.0847F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(10, 64).addBox(-0.65F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.4841F, 9.9477F, -1.2421F, -0.1614F, 0.2968F, -0.1308F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(64, 6).addBox(-0.65F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1886F, 10.1862F, 0.0012F, -0.2101F, 0.2106F, -0.1165F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(45, 84).addBox(-0.65F, -0.95F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 84).addBox(-0.65F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0967F, 10.2731F, 0.3807F, -0.539F, 0.1654F, -0.2881F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(59, 63).addBox(-0.65F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8901F, 10.4687F, 1.2345F, -0.245F, 0.2106F, -0.1165F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 84).addBox(-0.6986F, -0.1706F, -0.262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7907F, 10.8407F, 1.7204F, 0.8672F, 0.0389F, -0.0847F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(82, 83).addBox(-0.6986F, -0.6398F, -0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F))
				.texOffs(62, 49).addBox(-0.6986F, -0.5615F, -0.9306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.7907F, 10.8407F, 1.7204F, -0.3109F, 0.0389F, -0.0847F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(70, 83).addBox(-0.6986F, -0.6355F, -0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 83).addBox(-0.6986F, -0.6355F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7907F, 10.8407F, 1.7204F, -0.18F, 0.0389F, -0.0847F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(65, 83).addBox(-0.4F, -0.775F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(83, 59).addBox(-0.4F, -0.775F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.1521F, 9.5503F, 1.81F, 0.1243F, 0.7851F, 0.0262F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(83, 56).addBox(-0.65F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0367F, 9.1377F, 1.5609F, 0.1015F, 0.5249F, -0.0109F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(52, 63).addBox(-0.35F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.7F, 10.4046F, 0.2647F, -0.1876F, 0.2145F, -0.0404F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(40, 83).addBox(-0.65F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8875F, 9.1056F, 1.8192F, 0.097F, 0.438F, -0.0207F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(62, 55).addBox(-0.35F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-1.0331F, 9.0796F, 2.2169F, 0.1633F, 1.001F, 0.0759F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(83, 32).addBox(-0.4F, -0.775F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1521F, 9.5503F, 1.81F, 0.2069F, 1.1297F, 0.1256F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(82, 80).addBox(-0.3875F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 83).addBox(-0.6125F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3752F, 10.0161F, 2.4774F, -0.2586F, 0.3745F, -0.1899F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -11.0378F, -3.5937F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(87, 72).mirror().addBox(-0.35F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2664F, 10.3196F, 3.7574F, -0.971F, 0.518F, 0.608F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(87, 69).mirror().addBox(-0.35F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.1425F, 10.4302F, 3.5075F, -1.0387F, 0.2595F, 0.4315F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0407F, 10.1374F, 3.5592F, 1.1185F, 0.9459F, 1.031F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 10.142F, 4.1218F, 0.8008F, 0.2493F, 0.7348F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(87, 78).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 9.2207F, 3.3691F, -0.1444F, 0.1202F, 0.6894F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(87, 75).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 9.4263F, 3.5876F, 0.9464F, 0.4561F, 0.5486F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 9.8869F, 3.964F, 0.6624F, 0.5441F, 0.3838F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.3F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 87).mirror().addBox(-0.3F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.406F, 10.4269F, 4.0279F, 1.207F, 0.4948F, -0.1789F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.106F, 10.2642F, 3.5344F, 0.6655F, 1.1613F, -0.863F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 10.9968F, 3.84F, 1.1981F, 0.5355F, -0.1969F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-0.2F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.0836F, 10.8383F, 3.3594F, 0.6655F, 1.1613F, -0.863F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(80, 86).mirror().addBox(-0.2F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2389F, 10.6568F, 2.809F, 1.1981F, 0.5355F, -0.1969F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-0.7955F, -0.4782F, -0.3447F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.4822F, -0.4239F, -0.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 1.4893F, -0.0142F, -0.2024F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.6476F, -0.1149F, -0.2534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(86, 47).mirror().addBox(-0.3476F, -0.1149F, -0.2534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 0.9017F, -0.2631F, -0.0525F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.7601F, 0.0317F, -0.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 1.5196F, -0.2977F, -0.6881F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-0.6476F, 0.03F, -0.6058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(86, 50).mirror().addBox(-0.3476F, 0.03F, -0.6058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 1.4253F, -0.2631F, -0.0525F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(86, 44).mirror().addBox(-0.4647F, -0.3121F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(86, 41).mirror().addBox(-0.7147F, -0.3121F, -0.2395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 0.8871F, -0.1273F, -0.1585F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.799F, -0.2883F, -0.3168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 0.7743F, -0.0063F, 0.026F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.8298F, -0.318F, -0.172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, 0.0999F, 0.057F, -0.1961F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(86, 38).mirror().addBox(-0.8747F, -0.2985F, -0.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, -0.074F, -0.0805F, -0.6771F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.469F, -1.0322F, -0.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 86).mirror().addBox(-0.469F, -0.7322F, -0.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.928F, 11.0805F, 3.24F, -0.695F, 0.2218F, 0.4088F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.494F, -0.4578F, -0.2548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(86, 18).mirror().addBox(-0.494F, -0.4578F, -0.4297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(85, 24).mirror().addBox(-0.494F, -0.4578F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0303F, 10.858F, 3.0596F, -0.4979F, 0.0454F, 0.2593F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.406F, 9.1924F, 1.1841F, 0.6206F, -0.3019F, -0.1798F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.5F, -0.3829F, -0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(86, 9).mirror().addBox(-0.5F, -0.3829F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(86, 6).mirror().addBox(-0.5F, -0.3829F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.206F, 9.9279F, -2.9132F, 0.018F, -0.4607F, 0.0279F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.5F, -0.3829F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 85).mirror().addBox(-0.5F, -0.3829F, -0.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 85).mirror().addBox(-0.5F, -0.3829F, -0.4219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.206F, 9.9779F, -2.9132F, 0.4014F, -0.1745F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, 0.1723F, -0.5165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.206F, 9.9779F, -2.9132F, 1.7977F, -0.1745F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-0.475F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(2.106F, 9.8419F, -2.1016F, 0.22F, -0.1278F, -0.0285F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-0.6F, -0.3534F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(85, 27).mirror().addBox(-0.6F, -0.3534F, -0.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(2.206F, 9.6091F, -1.7044F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(2.056F, 9.6769F, -1.0055F, 0.1135F, -0.0347F, -0.004F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.906F, 9.5911F, 0.2526F, 0.0271F, -0.2617F, -0.007F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-0.325F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.906F, 9.5911F, 0.2526F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.494F, -0.328F, -0.7391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(15, 85).mirror().addBox(-0.494F, -0.328F, -0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false)
				.texOffs(5, 85).mirror().addBox(-0.494F, -0.328F, -0.2391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.0303F, 10.858F, 3.0596F, -0.8034F, 0.0454F, 0.2593F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.7527F, -0.6538F, -0.4292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, -0.6736F, -0.6617F, 0.4989F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.7281F, -0.687F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2765F, 9.5247F, 2.7797F, -0.1086F, -0.6511F, 0.3938F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-0.3014F, -0.5847F, 0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 84).mirror().addBox(-0.3014F, -0.5847F, 0.3616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7907F, 10.8407F, 1.7204F, -0.3458F, -0.0389F, 0.0847F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-0.35F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.4841F, 9.9477F, -1.2421F, -0.1614F, -0.2968F, 0.1308F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.35F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1886F, 10.1862F, 0.0012F, -0.2101F, -0.2106F, 0.1165F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.35F, -0.95F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 84).mirror().addBox(-0.35F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0967F, 10.2731F, 0.3807F, -0.539F, -0.1654F, 0.2881F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(59, 63).mirror().addBox(-0.35F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8901F, 10.4687F, 1.2345F, -0.245F, -0.2106F, 0.1165F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.3014F, -0.1706F, -0.262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7907F, 10.8407F, 1.7204F, 0.8672F, -0.0389F, 0.0847F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.3014F, -0.6398F, -0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false)
				.texOffs(62, 49).mirror().addBox(-0.3014F, -0.5615F, -0.9306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.7907F, 10.8407F, 1.7204F, -0.3109F, -0.0389F, 0.0847F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.3014F, -0.6355F, -0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(30, 83).mirror().addBox(-0.3014F, -0.6355F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7907F, 10.8407F, 1.7204F, -0.18F, -0.0389F, 0.0847F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.6F, -0.775F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(83, 59).mirror().addBox(-0.6F, -0.775F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.1521F, 9.5503F, 1.81F, 0.1243F, -0.7851F, -0.0262F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.35F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0367F, 9.1377F, 1.5609F, 0.1015F, -0.5249F, 0.0109F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(-0.65F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.7F, 10.4046F, 0.2647F, -0.1876F, -0.2145F, 0.0404F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.35F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8875F, 9.1056F, 1.8192F, 0.097F, -0.438F, 0.0207F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(62, 55).mirror().addBox(-0.65F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(1.0331F, 9.0796F, 2.2169F, 0.1633F, -1.001F, -0.0759F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(-0.6F, -0.775F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1521F, 9.5503F, 1.81F, 0.2069F, -1.1297F, -0.1256F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-0.6125F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 83).mirror().addBox(-0.3875F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3752F, 10.0161F, 2.4774F, -0.2586F, -0.3745F, 0.1899F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.3642F, -0.6063F, -0.2087F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.3683F, -0.6833F, -0.6196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, 0.1056F, -0.0428F, -0.0461F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.3683F, -0.6356F, -0.6492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, 0.8037F, -0.0428F, -0.0461F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.3683F, -0.8475F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(25, 89).mirror().addBox(-0.3683F, -2.21F, -0.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, 1.4145F, -0.0428F, -0.0461F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-0.3683F, -0.8002F, -0.7913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, 0.6292F, -0.0428F, -0.0461F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-0.3683F, -0.4893F, -1.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, -0.1999F, -0.0428F, -0.0461F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.3683F, 0.1145F, -0.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, -1.0289F, -0.0428F, -0.0461F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-0.3683F, 0.2236F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, -1.5525F, -0.0428F, -0.0461F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.3683F, -0.3522F, -1.5858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 87).mirror().addBox(-0.3683F, -0.3522F, -1.9858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 90).mirror().addBox(-0.3683F, -0.3522F, -2.1858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, -0.1126F, -0.0428F, -0.0461F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(-0.287F, -0.6734F, -0.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, 0.201F, -0.2172F, -0.0472F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.3683F, -0.6767F, 0.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(40, 89).mirror().addBox(-0.3683F, -0.6767F, 0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, 0.099F, 2.9417F, -0.0428F, -0.0461F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.287F, -0.5994F, -1.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 89).mirror().addBox(-0.287F, -0.5994F, -1.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, -0.0171F, -0.2172F, -0.0472F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-0.287F, -0.6829F, -1.0611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(80, 89).mirror().addBox(-0.287F, -0.6829F, -1.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, 0.0265F, -0.2172F, -0.0472F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.2847F, -0.662F, -0.6808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, -0.0255F, -0.2163F, -0.0525F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.287F, 0.8433F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 24).mirror().addBox(-0.287F, 1.2433F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, -1.5007F, -0.2172F, -0.0472F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(-0.3338F, -0.3765F, -0.6653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.8662F, 0.2944F, -3.7011F, -1.4072F, -0.2728F, -0.0748F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-0.3338F, -0.323F, -0.0905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-1.8662F, 0.2944F, -3.7011F, -2.9344F, -0.2728F, -0.0748F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-0.3588F, -0.3441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 90).mirror().addBox(-0.3588F, -0.0441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4148F, 0.4466F, -5.1763F, -1.4474F, -0.3595F, -0.086F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(45, 90).mirror().addBox(-0.3338F, -0.3873F, -0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(50, 90).mirror().addBox(-0.3338F, -0.1123F, -0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-1.8662F, 0.2944F, -3.7011F, -1.5381F, -0.2728F, -0.0748F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-0.287F, -0.5656F, -0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2912F, 0.2944F, -1.801F, -0.1044F, -0.2172F, -0.0472F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.3588F, -0.6441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.1998F, 0.5022F, -5.7336F, -1.455F, 0.0739F, -0.0338F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(40, 89).addBox(-0.6317F, -0.6767F, 0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(30, 89).addBox(-0.6317F, -0.6767F, 0.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, 2.9417F, 0.0428F, 0.0461F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(25, 89).addBox(-0.6317F, -2.21F, -0.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(20, 88).addBox(-0.6317F, -0.8475F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, 1.4145F, 0.0428F, 0.0461F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(75, 88).addBox(-0.713F, -0.6734F, -0.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, 0.201F, 0.2172F, 0.0472F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(70, 89).addBox(-0.7153F, -0.662F, -0.6808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, -0.0255F, 0.2163F, 0.0525F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(91, 0).addBox(-0.6412F, -0.6441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.8002F, 0.5022F, -5.7336F, -1.455F, -0.0739F, 0.0338F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(35, 90).addBox(-0.6412F, -0.0441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(90, 33).addBox(-0.6412F, -0.3441F, -0.541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5852F, 0.4466F, -5.1763F, -1.4474F, 0.3595F, 0.086F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(64, 32).addBox(-0.6662F, -0.323F, -0.0905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.1338F, 0.2944F, -3.7011F, -2.9344F, 0.2728F, 0.0748F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(50, 90).addBox(-0.6662F, -0.1123F, -0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(45, 90).addBox(-0.6662F, -0.3873F, -0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.1338F, 0.2944F, -3.7011F, -1.5381F, 0.2728F, 0.0748F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(90, 27).addBox(-0.6662F, -0.3765F, -0.6653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1338F, 0.2944F, -3.7011F, -1.4072F, 0.2728F, 0.0748F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(90, 24).addBox(-0.713F, 1.2433F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 90).addBox(-0.713F, 0.8433F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, -1.5007F, 0.2172F, 0.0472F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(80, 89).addBox(-0.713F, -0.6829F, -1.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 65).addBox(-0.713F, -0.6829F, -1.0611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, 0.0265F, 0.2172F, 0.0472F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(85, 89).addBox(-0.713F, -0.5994F, -1.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 89).addBox(-0.713F, -0.5994F, -1.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, -0.0171F, 0.2172F, 0.0472F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(90, 84).addBox(-0.713F, -0.5656F, -0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, -1.801F, -0.1044F, 0.2172F, 0.0472F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(90, 90).addBox(-0.6317F, -0.3522F, -2.1858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(90, 87).addBox(-0.6317F, -0.3522F, -1.9858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 88).addBox(-0.6317F, -0.3522F, -1.5858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, -0.1126F, 0.0428F, 0.0461F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(88, 59).addBox(-0.6317F, 0.2236F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, -1.5525F, 0.0428F, 0.0461F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(88, 56).addBox(-0.6317F, 0.1145F, -0.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, -1.0289F, 0.0428F, 0.0461F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(55, 88).addBox(-0.6317F, -0.4893F, -1.0356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, -0.1999F, 0.0428F, 0.0461F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(88, 30).addBox(-0.6317F, -0.8002F, -0.7913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, 0.6292F, 0.0428F, 0.0461F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(15, 88).addBox(-0.6317F, -0.6356F, -0.6492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, 0.8037F, 0.0428F, 0.0461F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(25, 80).addBox(-0.6317F, -0.6833F, -0.6196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2912F, 0.2944F, 0.099F, 0.1056F, 0.0428F, 0.0461F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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