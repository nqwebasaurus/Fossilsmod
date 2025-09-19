package fossils.fossils.client.blockentity.model.conflicto;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConflictoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart bone3;
	private final ModelPart leftLeg3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart bone4;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public ConflictoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone6 = this.hips.getChild("bone6");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.bone3 = this.leftLeg2.getChild("bone3");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe = this.leftLeg3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.bone4 = this.rightLeg2.getChild("bone4");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone = this.chest.getChild("bone");
		this.bone5 = this.chest.getChild("bone5");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.head = this.neck9.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.7F, 3.0F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-0.8948F, -0.0587F, -0.6175F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.74F, -2.7408F, -0.3847F, -0.2083F, -0.3959F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(-2.7353F, -0.5085F, -0.6363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.74F, -2.7408F, -0.2659F, -0.3789F, -0.9376F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-4.1146F, -1.808F, -0.6363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.74F, -2.7408F, -0.0296F, -0.4583F, -1.5056F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 69).addBox(0.7353F, -0.5085F, -0.6363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.74F, -2.7408F, -0.2659F, 0.3789F, 0.9376F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 47).addBox(2.1146F, -1.808F, -0.6363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.74F, -2.7408F, -0.0296F, 0.4583F, 1.5056F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 41).addBox(-0.1052F, -0.0587F, -0.6175F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.74F, -2.7408F, -0.3847F, 0.2083F, 0.3959F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 20).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1371F, -0.418F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 30).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -4.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 7).addBox(-0.5772F, -0.8697F, -0.9202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1097F, 2.3445F, 6.7044F, -1.0418F, 0.0838F, 0.4307F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(43, 47).addBox(0.1571F, 1.1358F, 4.7469F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8397F, 0.3227F, 3.3041F, -0.7335F, 0.2548F, 0.3053F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 36).addBox(-0.7575F, -0.7931F, -0.8896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8397F, 0.3227F, 3.3041F, -1.333F, 0.3257F, 0.1461F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 27).addBox(-0.7575F, -0.2458F, 1.6454F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8397F, 0.3227F, 3.3041F, -1.0537F, 0.3257F, 0.1461F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5728F, 0.1609F, 2.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -0.8966F, 0.154F, 0.2158F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 55).addBox(-0.5728F, -1.2504F, 0.8086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -1.4202F, 0.154F, 0.2158F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 12).addBox(-0.8484F, -0.4107F, -2.6292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1097F, 2.2445F, 6.7044F, -0.7847F, 0.1308F, 0.2305F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 34).addBox(-0.8484F, -0.603F, -0.6162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1097F, 2.2445F, 6.7044F, -1.4828F, 0.1308F, 0.2305F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 57).addBox(-0.5728F, -2.1281F, -0.2938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -1.9001F, 0.154F, 0.2158F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5728F, -0.0967F, 0.0971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -0.2421F, 0.154F, 0.2158F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 33).addBox(-0.5728F, -0.3967F, 0.2683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -0.8617F, 0.154F, 0.2158F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 61).addBox(-0.5728F, 0.4139F, -3.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -1.682F, 0.154F, 0.2158F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 39).addBox(-0.5728F, -0.6242F, -3.954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -0.9838F, 0.154F, 0.2158F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 63).addBox(-0.5728F, -0.4855F, -1.3127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4291F, 2.9384F, 5.3935F, -1.106F, 0.154F, 0.2158F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(51, 13).addBox(-1.9633F, -0.8697F, -0.8536F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1097F, 2.3445F, 6.7044F, -1.0904F, 0.2453F, 0.1367F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 14).addBox(0.0697F, -1.4188F, -3.6921F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0446F, 0.9625F, 5.3455F, -0.3586F, 0.0776F, 0.2041F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 68).addBox(-1.0F, -0.5F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 71).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.8233F, -1.2036F, 1.1732F, -1.7441F, 1.2077F, -1.5228F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(27, 77).addBox(-1.0937F, 0.0354F, -1.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6629F, -1.2775F, 1.9916F, -0.4841F, 0.7202F, -0.1007F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 34).addBox(-0.0937F, 0.0354F, -2.0415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6023F, -0.7966F, 3.9005F, -0.3577F, 0.0368F, 0.2194F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 57).addBox(-0.1437F, 0.0354F, -2.1415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.781F, -0.0099F, 5.8394F, -0.3601F, 0.1185F, 0.1887F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 55).addBox(-0.2828F, -0.5574F, -1.7223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1097F, 1.5445F, 6.7044F, -0.6818F, 0.3054F, 0.0349F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 26).addBox(0.0107F, -0.9686F, -1.574F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7903F, 1.5445F, 6.7044F, -0.6557F, 0.1683F, 0.1461F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r31 = bone6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(33, 7).mirror().addBox(-0.4228F, -0.8697F, -0.9202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1097F, 2.3445F, 6.7044F, -1.0418F, -0.0838F, -0.4307F));

		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-1.1571F, 1.1358F, 4.7469F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8397F, 0.3227F, 3.3041F, -0.7335F, -0.2548F, -0.3053F));

		PartDefinition cube_r33 = bone6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(-0.2425F, -0.7931F, -0.8896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8397F, 0.3227F, 3.3041F, -1.333F, -0.3257F, -0.1461F));

		PartDefinition cube_r34 = bone6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.2425F, -0.2458F, 1.6454F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8397F, 0.3227F, 3.3041F, -1.0537F, -0.3257F, -0.1461F));

		PartDefinition cube_r35 = bone6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.4272F, 0.1609F, 2.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -0.8966F, -0.154F, -0.2158F));

		PartDefinition cube_r36 = bone6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(-0.4272F, -1.2504F, 0.8086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -1.4202F, -0.154F, -0.2158F));

		PartDefinition cube_r37 = bone6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(33, 12).mirror().addBox(-0.1516F, -0.4107F, -2.6292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1097F, 2.2445F, 6.7044F, -0.7847F, -0.1308F, -0.2305F));

		PartDefinition cube_r38 = bone6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-0.1516F, -0.603F, -0.6162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1097F, 2.2445F, 6.7044F, -1.4828F, -0.1308F, -0.2305F));

		PartDefinition cube_r39 = bone6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-0.4272F, -2.1281F, -0.2938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -1.9001F, -0.154F, -0.2158F));

		PartDefinition cube_r40 = bone6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-0.4272F, -0.0967F, 0.0971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -0.2421F, -0.154F, -0.2158F));

		PartDefinition cube_r41 = bone6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-0.4272F, -0.3967F, 0.2683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -0.8617F, -0.154F, -0.2158F));

		PartDefinition cube_r42 = bone6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-0.4272F, 0.4139F, -3.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -1.682F, -0.154F, -0.2158F));

		PartDefinition cube_r43 = bone6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-0.4272F, -0.6242F, -3.954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -0.9838F, -0.154F, -0.2158F));

		PartDefinition cube_r44 = bone6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.4272F, -0.4855F, -1.3127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, 2.9384F, 5.3935F, -1.106F, -0.154F, -0.2158F));

		PartDefinition cube_r45 = bone6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(51, 13).mirror().addBox(-0.0367F, -0.8697F, -0.8536F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1097F, 2.3445F, 6.7044F, -1.0904F, -0.2453F, -0.1367F));

		PartDefinition cube_r46 = bone6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(-2.0697F, -1.4188F, -3.6921F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0446F, 0.9625F, 5.3455F, -0.3586F, -0.0776F, -0.2041F));

		PartDefinition cube_r47 = bone6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(0.0F, -0.5F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 71).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.8233F, -1.2036F, 1.1732F, -1.7441F, -1.2077F, 1.5228F));

		PartDefinition cube_r48 = bone6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(27, 77).mirror().addBox(0.0937F, 0.0354F, -1.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6629F, -1.2775F, 1.9916F, -0.4841F, -0.7202F, 0.1007F));

		PartDefinition cube_r49 = bone6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(-0.9063F, 0.0354F, -2.0415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6023F, -0.7966F, 3.9005F, -0.3577F, -0.0368F, -0.2194F));

		PartDefinition cube_r50 = bone6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-0.8563F, 0.0354F, -2.1415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.781F, -0.0099F, 5.8394F, -0.3601F, -0.1185F, -0.1887F));

		PartDefinition cube_r51 = bone6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 55).mirror().addBox(-0.7172F, -0.5574F, -1.7223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1097F, 1.5445F, 6.7044F, -0.6818F, -0.3054F, -0.0349F));

		PartDefinition cube_r52 = bone6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(-2.0107F, -0.9686F, -1.574F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7903F, 1.5445F, 6.7044F, -0.6557F, -0.1683F, -0.1461F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(36, 49).addBox(0.7F, 0.225F, -0.325F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3F, 0.7733F, -0.4964F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 21).addBox(-1.5F, -0.2783F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 82).addBox(0.5F, -0.2783F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 7.2202F, 0.9788F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -0.4937F, -0.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 7.2202F, 0.9788F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(74, 12).addBox(0.5F, -0.5368F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 7.2202F, 0.9788F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(21, 67).addBox(-1.0F, -0.9448F, 0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7F, 7.7899F, 0.2893F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 52).addBox(-4.5F, 0.775F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.2F, 3.1611F, 0.6122F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(14, 52).addBox(-2.0F, -0.5F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.7F, 0.725F, 0.175F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 15).addBox(-3.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.2F, -0.3208F, -0.6147F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -0.0365F, 0.008F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 74).addBox(-3.5F, -2.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 1.4F, -0.4F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 7.497F, 0.8505F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 22).addBox(-1.0F, -1.3F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.9774F, -1.8672F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 65).addBox(-2.5F, 0.6F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 0).addBox(-2.5F, 0.2F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 15.5214F, -2.5591F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 56).addBox(-2.5F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 15.5214F, -2.5591F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, -0.2F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 11.5433F, -2.141F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5F, -0.2F, -0.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 6.0515F, -0.4619F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 65).addBox(-2.5F, -1.925F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 2.5497F, -0.2949F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 47).addBox(-2.5F, -1.4F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 2.5497F, -0.2949F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(11, 27).addBox(-0.975F, -0.9285F, -0.131F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0F, 1.2636F, -0.6436F, -0.1309F, 0.0018F, 0.0174F));

		PartDefinition bone3 = leftLeg2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.0F, 1.2636F, -0.6436F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, -0.4446F, -0.8239F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 17.5153F, -3.0234F, -2.0806F, -0.1144F, 0.0637F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0901F, 10.3645F, -0.3134F, 0.3054F, -0.3927F, 0.0F));

		PartDefinition cube_r70 = toe.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 60).addBox(-1.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = toe.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(27, 73).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, 0.0F, -3.85F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.2499F, -0.5663F, 1.2199F, -0.108F, -0.2863F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, -5.1F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4969F, -3.5325F, 0.4401F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-2.7F, 0.225F, -0.325F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.7733F, -0.4964F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(0.5F, -0.2783F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 82).mirror().addBox(-1.5F, -0.2783F, -0.8782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 7.2202F, 0.9788F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.5F, -0.4937F, -0.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 7.2202F, 0.9788F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-1.5F, -0.5368F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 7.2202F, 0.9788F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-1.0F, -0.9448F, 0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 7.7899F, 0.2893F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(2.5F, 0.775F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 3.1611F, 0.6122F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-1.0F, -0.5F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.725F, 0.175F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(2.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -0.3208F, -0.6147F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.0365F, 0.008F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(2.5F, -2.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 1.4F, -0.4F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 7.497F, 0.8505F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-1.0F, -1.3F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.9774F, -1.8672F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(68, 65).mirror().addBox(0.5F, 0.6F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(68, 0).mirror().addBox(0.5F, 0.2F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 15.5214F, -2.5591F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(0.5F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 15.5214F, -2.5591F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.5F, -0.2F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 11.5433F, -2.141F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(0.5F, -0.2F, -0.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 6.0515F, -0.4619F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(0.5F, -1.925F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.5497F, -0.2949F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(0.5F, -1.4F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.5497F, -0.2949F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(11, 27).mirror().addBox(-0.025F, -0.9285F, -0.131F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2636F, -0.6436F, -0.1309F, -0.0018F, -0.0174F));

		PartDefinition bone4 = rightLeg2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.2636F, -0.6436F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.4446F, -0.8239F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 17.5153F, -3.0234F, -0.7679F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0901F, 10.3645F, -0.3134F, 0.3054F, 0.3927F, 0.0F));

		PartDefinition cube_r89 = toe2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r90 = toe2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(27, 73).mirror().addBox(0.5F, 0.2F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-1.5F, 0.0F, -3.85F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.2499F, -0.5663F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, -0.5F, -5.1F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4969F, -3.5325F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 83).addBox(-0.5F, -0.5104F, -0.0756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.8263F, 2.2123F, -0.8116F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(61, 65).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 85).addBox(0.0F, -0.894F, 0.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0892F, 0.7449F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, -0.4415F, -0.1155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0525F, 1.7234F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 76).addBox(-0.5F, -0.9591F, -0.0106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8585F, -0.1155F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 30).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 65).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9939F, -4.0998F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(41, 85).addBox(0.0F, -0.9025F, -0.0576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.8F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(12, 38).addBox(0.0F, -1.0535F, -0.0164F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.7F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.0328F, -0.2302F, -1.43F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(83, 52).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.1812F, -0.1004F, -0.3529F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -2.2408F, -0.1446F, -0.1826F, -0.8969F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 82).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.0332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.3408F, -0.303F, -0.174F, -0.4115F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.3408F, -0.2118F, -0.3081F, -0.9559F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.94F, -0.3408F, -0.0235F, -0.3712F, -1.5081F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(72, 19).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.3408F, -0.0235F, 0.3712F, 1.5081F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(71, 53).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.3408F, -0.2118F, 0.3081F, 0.9559F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(84, 5).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.94F, -0.3408F, -0.303F, 0.174F, 0.4115F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(83, 52).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.1812F, 0.1004F, 0.3529F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 5).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.1446F, 0.1826F, 0.8969F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(44, 22).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -2.2408F, -0.0328F, 0.2302F, 1.43F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(40, 82).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 82).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.0332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(20, 26).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.6F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(7, 33).addBox(0.0F, -1.5468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(58, 38).addBox(0.0F, -0.9482F, 0.0683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(55, 44).addBox(0.0F, -1.6924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(37, 76).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 76).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 76).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.2547F, 0.0552F, -0.3878F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.0407F, 0.2264F, -1.455F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.1494F, 0.1755F, -0.9229F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(83, 72).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -2.1408F, 0.0083F, 0.0548F, -1.3985F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -2.1408F, 0.0346F, 0.0433F, -0.8744F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -2.1408F, 0.089F, 0.0004F, -0.3314F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.036F, -0.0388F, -0.3117F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(17, 70).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.052F, -0.0549F, -0.8566F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-4.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.0176F, -0.0735F, -1.381F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(37, 76).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 76).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 76).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 83).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.2547F, -0.0552F, 0.3878F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(43, 71).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.1494F, -0.1755F, 0.9229F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(83, 74).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.0407F, -0.2264F, 1.455F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(83, 72).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -2.1408F, 0.0083F, -0.0548F, 1.3985F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 62).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -2.1408F, 0.0346F, -0.0433F, 0.8744F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(83, 70).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -2.1408F, 0.089F, -0.0004F, 0.3314F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 60).addBox(2.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.0176F, 0.0735F, 1.381F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(17, 70).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.052F, 0.0549F, 0.8566F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(7, 63).addBox(1.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.036F, 0.0388F, 0.3117F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 8.1358F, 0.3647F, 1.4731F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 9).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 7.6356F, -0.0032F, 0.5568F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, -0.275F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 8.0084F, -0.0439F, 1.3858F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 3).addBox(-0.5F, -1.075F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.697F, 0.3473F, 1.316F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, -0.0053F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1904F, -2.4611F, 1.2113F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 30).addBox(-1.0F, 0.8494F, -0.6684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8809F, -2.3728F, 1.1065F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1901F, -3.115F, 0.8709F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 69).addBox(-0.5F, -0.0579F, 0.0621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3697F, -4.2306F, 1.0891F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(51, 30).addBox(-1.5F, -1.019F, -0.4463F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8809F, -2.3728F, 0.8797F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(31, 65).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.6921F, -5.0322F, 0.9233F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, -2.9289F, -0.6166F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8809F, -2.3728F, 0.7051F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(53, 41).addBox(-1.5F, -3.5784F, -1.5057F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8809F, -2.3728F, 0.3735F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(68, 73).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1251F, -4.7509F, 0.8709F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(83, 67).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5345F, -6.3324F, -0.7697F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 49).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9572F, -5.6419F, -0.8744F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 65).addBox(-0.5F, -3.1996F, -3.3645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8809F, -2.3728F, 0.2601F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(58, 57).addBox(-0.5F, -0.5F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5097F, -4.6726F, 0.8709F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(32, 73).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(3.7412F, -0.8543F, -4.9272F, 0.8025F, 0.3187F, -0.1359F));

		PartDefinition cube_r152 = leftArm1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftArm1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 37).addBox(-0.5F, 0.0555F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.0059F, 7.6841F, 7.2963F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftArm1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(33, 69).addBox(-0.5F, -0.0945F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 7.6841F, 7.2963F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftArm1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(28, 69).addBox(-0.5F, 0.0055F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0059F, 6.2286F, 6.075F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftArm1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0055F, -0.1515F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 4.5195F, 2.5881F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftArm1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(66, 45).addBox(-0.5F, 0.0066F, -0.1921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0059F, 2.5353F, 0.6525F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftArm1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(72, 55).addBox(-0.5F, -0.001F, -0.1192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 1.2353F, -0.5475F, 0.7069F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1988F, 9.7821F, 7.12F, -1.9639F, 0.0387F, -0.0202F));

		PartDefinition cube_r159 = leftArm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(53, 34).addBox(-1.75F, 0.075F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.2F, 8.2406F, 0.3048F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftArm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 52).addBox(-1.75F, 0.1F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2F, 8.2406F, 0.3048F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftArm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(7, 38).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.7F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftArm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(75, 64).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 0).addBox(-0.5F, 0.4F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-0.05F, -1.2447F, 0.378F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(74, 29).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.05F, -0.3746F, 0.345F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftArm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(67, 20).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 15).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftArm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -2.325F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.05F, 2.1509F, -0.4869F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftArm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(21, 32).addBox(-0.5F, -5.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 10.7293F, -1.4627F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4279F, 13.6683F, -0.6204F, 2.6423F, -0.0692F, 0.0532F));

		PartDefinition cube_r168 = leftHand.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(69, 7).addBox(-0.475F, -0.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.8045F, -0.4564F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftHand.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 42).addBox(-0.25F, -1.4F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4359F, 7.8402F, -1.2161F, 0.0608F, -0.2752F, -0.2719F));

		PartDefinition cube_r170 = leftHand.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 7).addBox(0.0F, -1.15F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.8597F, -2.1049F, -0.1869F, 0.0647F, 0.0033F));

		PartDefinition cube_r171 = leftHand.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5095F, -1.7651F, -0.2647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4728F, 2.4824F, -0.1667F, 0.0258F, 0.064F, 0.0339F));

		PartDefinition cube_r172 = leftHand.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(7, 69).addBox(-0.4822F, -0.3364F, -0.6764F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.4728F, 2.4324F, 0.2333F, -0.131F, 0.0552F, 0.047F));

		PartDefinition cube_r173 = leftHand.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(68, 68).addBox(-0.6022F, 1.9303F, 0.038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4728F, 2.4324F, 0.0833F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftHand.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 72).addBox(-1.0F, -1.775F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.3323F, -0.0303F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftHand.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(72, 33).addBox(-1.0F, -1.775F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3323F, -0.0303F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftHand.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(22, 72).addBox(-1.0F, 7.1F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 32).addBox(-1.0F, -0.55F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(32, 73).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-3.7412F, -0.8543F, -4.9272F, 0.8025F, -0.3187F, 0.1359F));

		PartDefinition cube_r177 = rightArm1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightArm1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 37).mirror().addBox(-0.5F, 0.0555F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 7.6841F, 7.2963F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightArm1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-0.5F, -0.0945F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 7.6841F, 7.2963F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightArm1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.5F, 0.0055F, -0.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 6.2286F, 6.075F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightArm1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, 0.0055F, -0.1515F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 4.5195F, 2.5881F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightArm1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.5F, 0.0066F, -0.1921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 2.5353F, 0.6525F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightArm1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-0.5F, -0.001F, -0.1192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 1.2353F, -0.5475F, 0.7069F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1988F, 9.7821F, 7.12F, -1.9639F, -0.0387F, 0.0202F));

		PartDefinition cube_r184 = rightArm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(0.75F, 0.075F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.2406F, 0.3048F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightArm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(0.75F, 0.1F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.2406F, 0.3048F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightArm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(7, 38).mirror().addBox(0.75F, -0.2F, -0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.7F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightArm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 0).mirror().addBox(-0.5F, 0.4F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(0.05F, -1.2447F, 0.378F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightArm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.3746F, 0.345F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightArm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.15F, 0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(67, 15).mirror().addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.15F, 0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightArm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -2.325F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.1509F, -0.4869F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightArm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(21, 32).mirror().addBox(-0.5F, -5.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 10.7293F, -1.4627F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4279F, 13.6683F, -0.6204F, 2.6423F, 0.0692F, -0.0532F));

		PartDefinition cube_r193 = rightHand.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(69, 7).mirror().addBox(-0.525F, -0.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.8045F, -0.4564F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightHand.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(21, 42).mirror().addBox(-0.75F, -1.4F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4359F, 7.8402F, -1.2161F, 0.0608F, 0.2752F, 0.2719F));

		PartDefinition cube_r195 = rightHand.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(0.0F, -1.15F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.8597F, -2.1049F, -0.1869F, -0.0647F, -0.0033F));

		PartDefinition cube_r196 = rightHand.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-0.4905F, -1.7651F, -0.2647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4728F, 2.4824F, -0.1667F, 0.0258F, -0.064F, -0.0339F));

		PartDefinition cube_r197 = rightHand.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.5178F, -0.3364F, -0.6764F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.4728F, 2.4324F, 0.2333F, -0.131F, -0.0552F, -0.047F));

		PartDefinition cube_r198 = rightHand.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.3978F, 1.9303F, 0.038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4728F, 2.4324F, 0.0833F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightHand.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(38, 72).mirror().addBox(0.0F, -1.775F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3323F, -0.0303F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightHand.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(0.0F, -1.775F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3323F, -0.0303F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightHand.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(0.0F, 7.1F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(16, 32).mirror().addBox(0.0F, -0.55F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 3.6036F, -3.0961F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(19, 0).addBox(-0.3709F, -0.6659F, 0.06F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1458F, -3.5763F, 1.9933F, -0.0483F, -0.3245F, -0.3498F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(31, 24).addBox(-0.3942F, -0.636F, -3.5696F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1458F, -3.5763F, 1.9933F, 0.139F, -0.0233F, -0.3168F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(53, 17).addBox(0.0F, -1.0F, 0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9054F, 2.8889F, 1.1287F, 2.1675F, -0.5435F, -1.9697F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 70).addBox(-0.4499F, -0.8935F, -0.4272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3007F, 2.3551F, 1.2082F, 1.8064F, -0.7552F, -1.3864F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(52, 52).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4384F, 1.47F, -0.1855F, 2.292F, -0.7575F, -2.1939F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 69).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8789F, 1.0771F, 0.2039F, 1.6755F, -0.99F, -1.4115F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 55).addBox(-0.3F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3606F, 2.2352F, 1.8738F, 1.6725F, -1.1192F, -1.0056F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 27).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3009F, 1.8934F, 1.4942F, 1.4028F, -0.8201F, -0.9219F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(72, 25).addBox(-0.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6631F, 0.9747F, 0.5748F, 1.2388F, -0.9375F, -0.9644F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(70, 83).addBox(0.0768F, -2.6724F, -0.7503F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3159F, 1.399F, 1.489F, 1.266F, -0.7761F, -1.1487F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(82, 33).addBox(0.43F, -3.7466F, -0.615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3159F, 1.399F, 1.489F, 1.3513F, -0.479F, -1.2247F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(12, 69).addBox(-0.25F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3304F, 3.2893F, 1.88F, 1.2328F, -0.5349F, -1.2197F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(60, 13).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2409F, 0.0834F, -1.3658F, 2.2213F, -1.0716F, -2.4173F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(24, 63).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2409F, 0.0834F, -1.3658F, 1.9791F, -0.752F, -2.1155F));

		PartDefinition cube_r216 = bone.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(55, 69).addBox(-0.9907F, -3.9071F, -1.2663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3159F, 1.399F, 1.489F, 1.3861F, -0.8058F, -1.3173F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(9, 15).addBox(-0.35F, -1.1F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.761F, -1.6429F, -3.3057F, 0.9618F, 0.2302F, -0.2672F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(9, 15).addBox(-1.2F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.761F, -1.6429F, -3.3057F, 1.8124F, 0.0495F, 0.7321F));

		PartDefinition cube_r219 = bone.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(7, 13).addBox(-1.2F, -0.5F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0163F, -0.4179F, -1.2093F, 1.7634F, 0.1548F, 0.2611F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.8F, 3.6036F, -3.0961F));

		PartDefinition cube_r220 = bone5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.6291F, -0.6659F, 0.06F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1458F, -3.5763F, 1.9933F, -0.0483F, 0.3245F, 0.3498F));

		PartDefinition cube_r221 = bone5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(31, 24).mirror().addBox(-0.6058F, -0.636F, -3.5696F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1458F, -3.5763F, 1.9933F, 0.139F, 0.0233F, 0.3168F));

		PartDefinition cube_r222 = bone5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(53, 17).mirror().addBox(-1.0F, -1.0F, 0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9054F, 2.8889F, 1.1287F, 2.1675F, 0.5435F, 1.9697F));

		PartDefinition cube_r223 = bone5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5501F, -0.8935F, -0.4272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3007F, 2.3551F, 1.2082F, 1.8064F, 0.7552F, 1.3864F));

		PartDefinition cube_r224 = bone5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4384F, 1.47F, -0.1855F, 2.292F, 0.7575F, 2.1939F));

		PartDefinition cube_r225 = bone5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.8789F, 1.0771F, 0.2039F, 1.6755F, 0.99F, 1.4115F));

		PartDefinition cube_r226 = bone5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-3.7F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3606F, 2.2352F, 1.8738F, 1.6725F, 1.1192F, 1.0056F));

		PartDefinition cube_r227 = bone5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3009F, 1.8934F, 1.4942F, 1.4028F, 0.8201F, 0.9219F));

		PartDefinition cube_r228 = bone5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-2.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6631F, 0.9747F, 0.5748F, 1.2388F, 0.9375F, 0.9644F));

		PartDefinition cube_r229 = bone5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-2.0768F, -2.6724F, -0.7503F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3159F, 1.399F, 1.489F, 1.266F, 0.7761F, 1.1487F));

		PartDefinition cube_r230 = bone5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-2.43F, -3.7466F, -0.615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3159F, 1.399F, 1.489F, 1.3513F, 0.479F, 1.2247F));

		PartDefinition cube_r231 = bone5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(12, 69).mirror().addBox(-0.75F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3304F, 3.2893F, 1.88F, 1.2328F, 0.5349F, 1.2197F));

		PartDefinition cube_r232 = bone5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(60, 13).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2409F, 0.0834F, -1.3658F, 2.2213F, 1.0716F, 2.4173F));

		PartDefinition cube_r233 = bone5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2409F, 0.0834F, -1.3658F, 1.9791F, 0.752F, 2.1155F));

		PartDefinition cube_r234 = bone5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-0.0093F, -3.9071F, -1.2663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3159F, 1.399F, 1.489F, 1.3861F, 0.8058F, 1.3173F));

		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(9, 15).mirror().addBox(-0.65F, -1.1F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.761F, -1.6429F, -3.3057F, 0.9618F, -0.2302F, 0.2672F));

		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(9, 15).mirror().addBox(0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.761F, -1.6429F, -3.3057F, 1.8124F, -0.0495F, -0.7321F));

		PartDefinition cube_r237 = bone5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 13).mirror().addBox(0.2F, -0.5F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -0.4179F, -1.2093F, 1.7634F, -0.1548F, -0.2611F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 69).addBox(0.0F, -2.5943F, -2.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 59).addBox(-0.5F, -1.9943F, -2.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -1.3408F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r240 = neck6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 3).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -1.3408F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(84, 7).addBox(0.0F, -1.3F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 41).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, 0.0087F, -0.0436F, -0.0004F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 35).addBox(0.0F, -2.3981F, 1.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 10).addBox(0.0F, -2.3981F, 3.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 36).addBox(-0.5F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -2.6F, -1.4F, -0.0267F, -0.2617F, 0.0012F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(84, 18).addBox(0.0F, -0.9935F, -0.2463F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(66, 50).addBox(-1.0F, 3.0773F, -0.9317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8175F, -0.5357F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(16, 27).addBox(0.0F, -2.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 24).addBox(0.0F, -0.5F, -0.45F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5614F, -0.1412F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(12, 59).addBox(-1.0F, 0.9272F, -0.8396F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -3.8F, -3.2F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8375F, -2.5505F, -0.8312F, -0.0785F, -0.1068F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(15, 85).addBox(0.0F, -0.5F, -4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 0).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 27).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1299F, -0.434F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(7, 20).addBox(-1.0F, -0.1384F, -0.2862F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.1F, -4.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.877F, -5.0503F, 0.2695F, 0.0233F, -0.0841F));

		PartDefinition cube_r249 = neck7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(18, 85).addBox(-0.5F, -0.3384F, 1.7138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 41).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.9F, -3.4F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4516F, -2.789F, 0.4436F, -0.0375F, 0.0788F));

		PartDefinition cube_r250 = neck8.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, -0.3384F, 0.7138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 85).addBox(-0.5F, -0.3384F, 2.7138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 42).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -3.4F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5511F, -2.5295F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck9.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(83, 38).addBox(-1.0F, -0.1384F, -0.9362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7724F, -2.9117F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck9.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(38, 85).addBox(-0.5F, -0.4384F, 1.7138F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 12).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.9F, -3.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0386F, -3.8049F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(66, 42).addBox(-1.0F, -0.883F, -0.913F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.0166F, -0.7438F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(32, 4).addBox(-2.0F, -0.9079F, -0.913F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.697F, 0.0036F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(67, 76).addBox(-0.5F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7662F, -2.4595F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 76).addBox(-0.5F, -0.475F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.3115F, -2.895F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(52, 47).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.6028F, -2.3849F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 76).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.1496F, -1.7677F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, -0.725F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -2.8286F, -3.2607F, 1.5839F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(67, 4).addBox(-1.0F, -0.9065F, -0.9328F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.2457F, -2.2986F, 1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -0.9065F, -0.8828F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -3.1498F, -1.5096F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(51, 10).addBox(-2.0F, -0.7F, -0.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(25, 49).addBox(-2.0F, -0.5F, -0.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.0F, -1.9426F, 0.0466F, 0.685F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(14, 49).addBox(-2.0F, -0.5503F, -0.9788F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7035F, 0.948F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(33, 17).addBox(-2.0F, -0.4208F, -0.6912F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -1.916F, -0.3721F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(31, 20).addBox(-2.0F, -0.4208F, -0.3088F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -1.916F, -0.3721F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(32, 46).addBox(-2.0F, -0.368F, -0.3405F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(21, 46).addBox(-2.0F, -0.368F, -0.5655F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, -0.9943F, 0.8142F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(43, 52).addBox(-1.5F, -1.05F, -1.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.0981F, -0.7996F, -2.1337F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -0.4F, -1.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3107F, 0.0665F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(44, 44).addBox(-2.0F, -0.4F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.6972F, 0.4419F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(59, 44).addBox(-0.5F, -1.0246F, 2.1317F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.8757F, -7.7515F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(58, 73).addBox(-0.5F, -0.6547F, -0.9769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(53, 73).addBox(-0.5F, -0.6547F, -0.7769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -4.4869F, -11.1626F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(60, 17).addBox(-0.5F, -0.4159F, -0.3869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -4.6034F, -11.0209F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(32, 77).addBox(-0.5F, -0.4159F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -4.6602F, -11.2126F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(48, 73).addBox(-0.5F, -0.4159F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -4.6619F, -11.4126F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 55).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.5187F, -9.2952F, 1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(77, 32).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.6571F, -9.6705F, 1.2174F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(47, 76).addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.8527F, -9.7525F, 1.1825F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(76, 45).addBox(-0.5F, -0.241F, -0.2961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -3.8033F, -8.8158F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(42, 76).addBox(-0.5F, -0.4F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -3.538F, -8.1345F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(42, 59).addBox(-0.5F, -0.2578F, -0.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -3.6514F, -7.9077F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -3.5755F, -6.4541F, -0.144F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -10.3781F, -2.6971F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 48).addBox(-0.975F, -0.075F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.9F, 7.6318F, 1.2098F, 1.2313F, 0.7515F, -0.1787F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(71, 45).addBox(-0.975F, -1.575F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 7.6318F, 1.2098F, 1.4507F, 0.3294F, -0.0476F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(80, 0).addBox(-0.7F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 80).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3854F, 7.0313F, -0.4005F, 1.4649F, 0.2681F, 0.0047F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 15).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3854F, 7.0313F, -0.4005F, 1.45F, 0.0358F, 0.0242F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(71, 49).addBox(-0.475F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8415F, 7.1921F, -1.2565F, 1.6204F, 0.2708F, -0.021F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 51).addBox(-0.9F, -0.9F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.3F, 7.0973F, -0.3944F, 1.5775F, 0.3144F, -0.0187F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(61, 0).addBox(-0.8F, -0.175F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 6.947F, -2.6443F, -0.1164F, 0.2254F, -0.0261F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(78, 40).addBox(-0.4649F, -0.7116F, -0.5765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2791F, 10.644F, 1.3886F, -0.2689F, 0.2746F, -0.0409F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(77, 77).addBox(-0.4649F, -0.6866F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 77).addBox(-0.4649F, -0.5866F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2791F, 10.644F, 1.3886F, -0.0071F, 0.2746F, -0.0409F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(77, 61).addBox(-0.4649F, -0.4116F, -0.1515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 58).addBox(-0.4649F, -0.4116F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.3487F, 10.2446F, 1.1997F, -0.6529F, 0.2746F, -0.0409F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(42, 7).addBox(-0.4649F, -0.4116F, -0.3515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.9084F, 9.153F, -0.6265F, -0.5307F, 0.2746F, -0.0409F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(43, 0).addBox(-0.575F, -0.425F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.7759F, 9.1779F, -0.5964F, -0.4871F, 0.2359F, -0.0873F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(55, 82).addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6325F, 9.1287F, 1.1771F, -1.4052F, 0.0685F, -0.1924F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(10, 83).addBox(-0.4728F, -0.6748F, -0.1458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 83).addBox(-0.4728F, -0.6748F, -0.3458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.559F, 7.7984F, -0.9527F, -1.9751F, 0.1643F, -0.2734F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(82, 82).addBox(-0.4912F, -0.6084F, -0.8806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 79).addBox(-0.4912F, -0.6084F, -0.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.559F, 7.7984F, -0.9527F, -1.2549F, 0.188F, -0.3646F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(82, 57).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4872F, 8.582F, 1.8202F, -1.1793F, -0.099F, -0.082F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(82, 54).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 82).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6072F, 9.2419F, 1.2238F, -1.1871F, 0.0685F, -0.1924F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5125F, -1.2242F, -0.8163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4375F, 9.9772F, 2.1495F, -1.0562F, 0.0685F, -0.1924F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.1466F, 5.8719F, -8.9159F, 0.2812F, 0.5296F, -0.0554F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(81, 46).addBox(-0.5892F, -0.4607F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.8666F, 5.7576F, -8.6041F, 0.1416F, 0.5296F, -0.0554F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(81, 43).addBox(-0.5892F, -0.3929F, -0.6073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.8666F, 5.7576F, -8.6041F, -0.19F, 0.5296F, -0.0554F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(77, 80).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.7854F, 5.9131F, -8.472F, -0.3076F, 0.4326F, -0.0599F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(80, 64).addBox(-0.5F, -0.5044F, -0.6947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 80).addBox(-0.5F, -0.5044F, -0.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.8032F, 6.0193F, -8.18F, -0.3534F, 0.288F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(60, 82).addBox(-0.5F, -0.5057F, -0.3054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.8032F, 6.0193F, -8.18F, -0.4058F, 0.288F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(72, 80).addBox(-0.6302F, -0.4526F, -0.7391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F))
				.texOffs(25, 80).addBox(-0.6302F, -0.4526F, -0.6391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)), PartPose.offsetAndRotation(-1.5586F, 6.2212F, -7.6312F, -0.5105F, 0.2007F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(60, 29).addBox(-0.7266F, -0.4483F, -4.5082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.325F, 8.0229F, -3.9169F, -0.4581F, 0.0436F, 0.0F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(79, 27).addBox(-0.7F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4823F, 6.8485F, -5.7634F, -0.3352F, 0.2372F, 0.4923F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(60, 25).addBox(-0.7766F, -0.6481F, -3.1648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.325F, 8.0229F, -3.9169F, -0.4058F, 0.0436F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(60, 21).addBox(-0.7841F, -0.6975F, -1.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.325F, 8.0229F, -3.9169F, -0.4058F, 0.0785F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(78, 73).addBox(-0.775F, -0.6755F, -1.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 70).addBox(-0.775F, -0.6755F, -1.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.125F, 8.5229F, -2.5169F, -0.3534F, 0.1484F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(79, 12).addBox(-0.35F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 79).addBox(-0.725F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.8975F, 7.4156F, -2.468F, 0.0413F, 0.7273F, 0.9513F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(79, 9).addBox(-1.55F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 6).addBox(-1.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(79, 3).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.1714F, 7.9716F, -2.658F, 0.0315F, 0.204F, 0.9302F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(74, 37).addBox(-0.725F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2463F, 7.8403F, -3.11F, -1.0758F, 1.3971F, -0.3373F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(79, 35).addBox(-0.7F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 18).addBox(-1.0F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6526F, 7.3027F, -4.6851F, -2.5251F, 1.1929F, -1.8066F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(67, 12).addBox(-0.6F, -0.35F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2463F, 7.8403F, -3.11F, -2.5858F, 1.188F, -1.8718F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 67).addBox(-0.775F, -0.7746F, -0.7241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.125F, 8.5229F, -2.5169F, -0.144F, 0.1484F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(33, 61).addBox(-0.6F, -0.3909F, -1.5869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.9044F, 6.2299F, -7.2133F, -0.1735F, -0.356F, -1.2348F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(17, 61).addBox(-0.6F, -0.3909F, -0.3869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.1F, 5.7514F, -8.3145F, -0.0817F, -0.3667F, -1.3462F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 80).addBox(-0.6F, -0.5159F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.9051F, 5.7442F, -8.4972F, -0.448F, -0.2339F, -1.2166F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(67, 79).addBox(-0.6F, -0.3909F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.1F, 5.6939F, -8.5084F, -0.0665F, -0.2804F, -1.3345F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(63, 73).addBox(-0.6F, -0.3909F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-2.1F, 5.6911F, -8.7152F, -0.0028F, -0.0083F, -1.2392F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(52, 79).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, 6.4735F, -6.4929F, 1.4958F, -0.2556F, -1.2819F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(57, 79).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, 6.4149F, -6.6473F, 1.4453F, -0.3313F, -1.2007F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(62, 79).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, 6.275F, -7.007F, 1.4384F, -0.3661F, -1.2146F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(42, 79).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.95F, 6.6138F, -5.9183F, -0.0571F, -0.137F, -1.1742F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(37, 79).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.95F, 6.6881F, -5.4406F, -0.0809F, -0.1192F, -0.9726F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(47, 79).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)), PartPose.offsetAndRotation(-1.7404F, 7.2234F, -4.7245F, -0.0514F, 0.3422F, 0.6381F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(79, 24).addBox(-0.25F, -0.2578F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(20, 79).addBox(-0.25F, -0.2578F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.95F, 6.7267F, -5.2105F, -0.0485F, 0.0372F, 0.6536F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(73, 74).addBox(-0.15F, -0.2578F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.95F, 6.7267F, -5.2105F, -0.0491F, 0.1679F, 0.6472F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(43, 73).addBox(-0.5125F, -0.0742F, -0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4375F, 9.9772F, 2.1495F, -0.4453F, 0.0685F, -0.1924F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(42, 29).addBox(-1.2325F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(5, 54).addBox(-0.5675F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9709F, 8.2515F, 0.4765F, -0.3304F, 0.3727F, -0.2005F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -10.3781F, -2.6971F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(76, 48).mirror().addBox(-0.025F, -0.075F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.9F, 7.6318F, 1.2098F, 1.2313F, -0.7515F, 0.1787F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-0.025F, -1.575F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9F, 7.6318F, 1.2098F, 1.4507F, -0.3294F, 0.0476F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.3F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 80).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3854F, 7.0313F, -0.4005F, 1.4649F, -0.2681F, -0.0047F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 15).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3854F, 7.0313F, -0.4005F, 1.45F, -0.0358F, -0.0242F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-0.525F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8415F, 7.1921F, -1.2565F, 1.6204F, -0.2708F, 0.021F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.1F, -0.9F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.3F, 7.0973F, -0.3944F, 1.5775F, -0.3144F, 0.0187F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.2F, -0.175F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9F, 6.947F, -2.6443F, -0.1164F, -0.2254F, 0.0261F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-0.5351F, -0.7116F, -0.5765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2791F, 10.644F, 1.3886F, -0.2689F, -0.2746F, 0.0409F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.5351F, -0.6866F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 77).mirror().addBox(-0.5351F, -0.5866F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2791F, 10.644F, 1.3886F, -0.0071F, -0.2746F, 0.0409F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(77, 61).mirror().addBox(-0.5351F, -0.4116F, -0.1515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 58).mirror().addBox(-0.5351F, -0.4116F, -0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.3487F, 10.2446F, 1.1997F, -0.6529F, -0.2746F, 0.0409F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(42, 7).mirror().addBox(-0.5351F, -0.4116F, -0.3515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.9084F, 9.153F, -0.6265F, -0.5307F, -0.2746F, 0.0409F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-0.425F, -0.425F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.7759F, 9.1779F, -0.5964F, -0.4871F, -0.2359F, 0.0873F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6325F, 9.1287F, 1.1771F, -1.4052F, -0.0685F, 0.1924F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5272F, -0.6748F, -0.1458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-0.5272F, -0.6748F, -0.3458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.559F, 7.7984F, -0.9527F, -1.9751F, -0.1643F, 0.2734F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-0.5088F, -0.6084F, -0.8806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 79).mirror().addBox(-0.5088F, -0.6084F, -0.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.559F, 7.7984F, -0.9527F, -1.2549F, -0.188F, 0.3646F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4872F, 8.582F, 1.8202F, -1.1793F, 0.099F, 0.082F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 82).mirror().addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6072F, 9.2419F, 1.2238F, -1.1871F, -0.0685F, 0.1924F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(-0.4875F, -1.2242F, -0.8163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4375F, 9.9772F, 2.1495F, -1.0562F, -0.0685F, 0.1924F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.1466F, 5.8719F, -8.9159F, 0.2812F, -0.5296F, 0.0554F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-0.4108F, -0.4607F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.8666F, 5.7576F, -8.6041F, 0.1416F, -0.5296F, 0.0554F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.4108F, -0.3929F, -0.6073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.8666F, 5.7576F, -8.6041F, -0.19F, -0.5296F, 0.0554F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.7854F, 5.9131F, -8.472F, -0.3076F, -0.4326F, 0.0599F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-0.5F, -0.5044F, -0.6947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 80).mirror().addBox(-0.5F, -0.5044F, -0.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.8032F, 6.0193F, -8.18F, -0.3534F, -0.288F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.5F, -0.5057F, -0.3054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.8032F, 6.0193F, -8.18F, -0.4058F, -0.288F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-0.3698F, -0.4526F, -0.7391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).mirror(false)
				.texOffs(25, 80).mirror().addBox(-0.3698F, -0.4526F, -0.6391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)).mirror(false), PartPose.offsetAndRotation(1.5586F, 6.2212F, -7.6312F, -0.5105F, -0.2007F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(60, 29).mirror().addBox(-0.2734F, -0.4483F, -4.5082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.325F, 8.0229F, -3.9169F, -0.4581F, -0.0436F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-0.3F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4823F, 6.8485F, -5.7634F, -0.3352F, -0.2372F, -0.4923F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(-0.2234F, -0.6481F, -3.1648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.325F, 8.0229F, -3.9169F, -0.4058F, -0.0436F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.2159F, -0.6975F, -1.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.325F, 8.0229F, -3.9169F, -0.4058F, -0.0785F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.225F, -0.6755F, -1.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(78, 70).mirror().addBox(-0.225F, -0.6755F, -1.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.125F, 8.5229F, -2.5169F, -0.3534F, -0.1484F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.65F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 79).mirror().addBox(-0.275F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(1.8975F, 7.4156F, -2.468F, 0.0413F, -0.7273F, -0.9513F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(0.55F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 6).mirror().addBox(0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(79, 3).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(1.1714F, 7.9716F, -2.658F, 0.0315F, -0.204F, -0.9302F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-0.275F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2462F, 7.8403F, -3.11F, -1.0758F, -1.3971F, 0.3373F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-0.3F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 18).mirror().addBox(0.0F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.6526F, 7.3027F, -4.6851F, -2.5251F, -1.1929F, 1.8066F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-1.4F, -0.35F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2462F, 7.8403F, -3.11F, -2.5858F, -1.188F, 1.8718F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.225F, -0.7746F, -0.7241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.125F, 8.5229F, -2.5169F, -0.144F, -0.1484F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(33, 61).mirror().addBox(-0.4F, -0.3909F, -1.5869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.9044F, 6.2299F, -7.2133F, -0.1735F, 0.356F, 1.2348F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(17, 61).mirror().addBox(-0.4F, -0.3909F, -0.3869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.1F, 5.7514F, -8.3145F, -0.0817F, 0.3667F, 1.3462F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.4F, -0.5159F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.9051F, 5.7442F, -8.4972F, -0.448F, 0.2339F, 1.2166F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.4F, -0.3909F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.1F, 5.6939F, -8.5084F, -0.0665F, 0.2804F, 1.3345F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-0.4F, -0.3909F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(2.1F, 5.6911F, -8.7152F, -0.0028F, 0.0083F, 1.2392F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(52, 79).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.4735F, -6.4929F, 1.4958F, 0.2556F, 1.2819F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.4149F, -6.6473F, 1.4453F, 0.3313F, 1.2007F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(62, 79).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.275F, -7.007F, 1.4384F, 0.3661F, 1.2146F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(42, 79).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.95F, 6.6138F, -5.9183F, -0.0571F, 0.137F, 1.1742F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.95F, 6.6881F, -5.4406F, -0.0809F, 0.1192F, 0.9726F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(47, 79).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false), PartPose.offsetAndRotation(1.7404F, 7.2234F, -4.7245F, -0.0514F, -0.3422F, -0.6381F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-0.75F, -0.2578F, 0.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(20, 79).mirror().addBox(-0.75F, -0.2578F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(1.95F, 6.7267F, -5.2105F, -0.0485F, -0.0372F, -0.6536F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-0.85F, -0.2578F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.95F, 6.7267F, -5.2105F, -0.0491F, -0.1679F, -0.6472F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(-0.4875F, -0.0742F, -0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4375F, 9.9772F, 2.1495F, -0.4453F, -0.0685F, 0.1924F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(42, 29).mirror().addBox(-0.7675F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(5, 54).mirror().addBox(-0.4325F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9709F, 8.2515F, 0.4765F, -0.3304F, -0.3727F, 0.2005F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.3435F, -1.091F, -0.2175F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.5387F, 0.6333F, -1.2686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.0696F, 0.0775F, -1.2754F, 2.0252F, -0.1835F, 0.0295F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-0.5387F, 0.0404F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.1155F, 0.3451F, -1.0706F, -1.9061F, -0.1835F, 0.0295F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-0.5387F, -0.4346F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.1155F, 0.3451F, -1.0706F, -1.6094F, -0.1835F, 0.0295F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-0.5387F, -1.2596F, -0.7006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0696F, 0.0775F, -1.2754F, -1.8538F, -0.1835F, 0.0295F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.3339F, 0.0174F, -1.7533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false)
				.texOffs(42, 24).mirror().addBox(-0.3339F, 0.3674F, -2.7533F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F)).mirror(false)
				.texOffs(49, 61).mirror().addBox(-0.3339F, 0.1233F, -4.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.2119F, -0.0774F, 0.0386F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.3339F, -0.4686F, -1.9588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, 0.0848F, -0.0774F, 0.0386F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.3339F, -0.1375F, -2.8726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.1072F, -0.0774F, 0.0386F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-0.3339F, 0.4643F, -6.5572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.2992F, -0.0774F, 0.0386F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-0.3066F, 0.4878F, -5.6829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.2862F, -0.0733F, 0.0429F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.3066F, 1.41F, -5.8417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.4608F, -0.0733F, 0.0429F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.3066F, 0.9231F, -6.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.3735F, -0.0733F, 0.0429F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(56, 61).mirror().addBox(-0.3339F, 0.4867F, -4.0876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.2643F, -0.0774F, 0.0386F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.3339F, 0.7531F, -5.4669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.6855F, -1.2208F, -4.3791F, -0.3341F, -0.0774F, 0.0386F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-0.1072F, -0.0627F, -1.8587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1855F, -1.5208F, -2.9791F, 0.0368F, -0.2525F, -0.0169F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.1342F, 0.9812F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1855F, -1.5208F, -2.9791F, -0.3141F, -0.2852F, 0.0034F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(-0.5475F, -0.8468F, -2.2252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0696F, 0.0775F, -1.2754F, -0.4479F, -0.1874F, 0.0166F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(50, 82).addBox(-0.4613F, 0.6333F, -1.2686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0696F, 0.0775F, -1.2754F, 2.0252F, 0.1835F, -0.0295F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(38, 67).addBox(-0.4613F, 0.0404F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1155F, 0.3451F, -1.0706F, -1.9061F, 0.1835F, -0.0295F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(67, 25).addBox(-0.4613F, -0.4346F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1155F, 0.3451F, -1.0706F, -1.6094F, 0.1835F, -0.0295F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(72, 21).addBox(-0.4613F, -1.2596F, -0.7006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0696F, 0.0775F, -1.2754F, -1.8538F, 0.1835F, -0.0295F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 63).addBox(-0.6661F, 0.0174F, -1.7533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F))
				.texOffs(42, 24).addBox(-0.6661F, 0.3674F, -2.7533F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F))
				.texOffs(49, 61).addBox(-0.6661F, 0.1233F, -4.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.2119F, 0.0774F, -0.0386F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(62, 38).addBox(-0.6661F, -0.4686F, -1.9588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.265F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, 0.0848F, 0.0774F, -0.0386F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(62, 8).addBox(-0.6661F, -0.1375F, -2.8726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.1072F, 0.0774F, -0.0386F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(51, 5).addBox(-0.6661F, 0.4643F, -6.5572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.265F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.2992F, 0.0774F, -0.0386F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(77, 15).addBox(-0.6934F, 0.4878F, -5.6829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.2862F, 0.0733F, -0.0429F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(10, 77).addBox(-0.6934F, 1.41F, -5.8417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.4608F, 0.0733F, -0.0429F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(5, 77).addBox(-0.6934F, 0.9231F, -6.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.3735F, 0.0733F, -0.0429F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5F, -0.475F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.269F))
				.texOffs(0, 77).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(-1.0176F, -2.2507F, -10.7907F, -0.4614F, 0.0F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(56, 61).addBox(-0.6661F, 0.4867F, -4.0876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.2643F, 0.0774F, -0.0386F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(60, 4).addBox(-0.6661F, 0.7531F, -5.4669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.3145F, -1.2208F, -4.3791F, -0.3341F, 0.0774F, -0.0386F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(59, 52).addBox(-0.8928F, -0.0627F, -1.8587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1855F, -1.5208F, -2.9791F, 0.0368F, 0.2525F, 0.0169F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(59, 48).addBox(-0.8658F, 0.9812F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1855F, -1.5208F, -2.9791F, -0.3141F, 0.2852F, -0.0034F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(44, 17).addBox(-0.4525F, -0.8468F, -2.2252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0696F, 0.0775F, -1.2754F, -0.4479F, 0.1874F, -0.0166F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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