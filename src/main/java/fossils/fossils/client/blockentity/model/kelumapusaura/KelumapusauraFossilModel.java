package fossils.fossils.client.blockentity.model.kelumapusaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KelumapusauraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart leftArm4;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart opposablePinkie3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart opposablePinkie2;
	private final ModelPart chest3;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart bone3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone4;
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail9;

	public KelumapusauraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone6 = this.chest.getChild("bone6");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm7 = this.leftArm4.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.opposablePinkie3 = this.leftArm8.getChild("opposablePinkie3");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm7 = this.rightArm4.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.opposablePinkie2 = this.rightArm8.getChild("opposablePinkie2");
		this.chest3 = this.chest.getChild("chest3");
		this.chest2 = this.chest3.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck = this.neck7.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.bone3 = this.leftLeg.getChild("bone3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone4 = this.rightLeg.getChild("bone4");
		this.tail8 = this.hips.getChild("tail8");
		this.tail = this.tail8.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail9 = this.tail7.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -43.3207F, 1.0785F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-3.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 45).addBox(1.0F, 2.6F, 1.8F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0114F, -2.0615F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 112).addBox(0.0F, -6.4F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 5.6454F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 112).addBox(0.0F, -6.6F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.298F, 2.6607F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(117, 6).addBox(0.0F, -6.625F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7156F, -0.3101F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 17).addBox(-1.0F, -0.1F, 5.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(53, 71).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(9, 82).addBox(1.0F, -1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(9, 82).mirror().addBox(-3.0F, -1.0F, -6.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1854F, -0.2962F, -0.1329F, 0.173F, -0.023F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 123).addBox(0.0F, -5.4F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 113).addBox(0.0F, -6.2F, 0.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(63, 28).addBox(-1.0F, -1.9554F, -6.9243F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0153F, -6.0835F, -0.0528F, 0.1307F, -0.0069F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 124).addBox(0.0F, -5.0647F, -0.0963F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9554F, -2.8243F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(122, 6).addBox(0.0F, -4.6576F, -1.0985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9554F, -4.8243F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(147, 2).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.0229F, -0.0763F, -0.559F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(98, 83).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -5.1303F, 0.0668F, -0.1221F, -0.9951F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(147, 17).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1116F, -0.0205F, -0.5633F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(109, 81).mirror().addBox(-2.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0956F, -1.9303F, 0.1237F, -0.0341F, -0.9996F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(109, 81).addBox(1.6479F, -0.976F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1237F, 0.0341F, 0.9996F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(147, 17).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -1.9303F, 0.1116F, 0.0205F, 0.5633F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(98, 83).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.0668F, 0.1221F, 0.9951F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(147, 2).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0956F, -5.1303F, 0.0229F, 0.0763F, 0.559F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.9956F, -6.9303F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(126, 26).addBox(0.0F, -4.7791F, 0.0071F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -2.0009F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 125).addBox(0.0F, -4.6437F, -0.0022F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4615F, -5.0009F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(19, 65).addBox(-1.0F, -0.1094F, -0.0631F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6401F, -5.8941F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-11.8936F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1558F, 0.1395F, -1.4283F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.1998F, 0.0612F, -0.9967F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -4.1F, 0.2208F, 0.0337F, -0.5608F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.0229F, -0.0763F, -0.559F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.0668F, -0.1221F, -0.9951F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(-5.8937F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.0F, 0.1121F, -0.0825F, -1.432F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 31).addBox(2.8937F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.1121F, 0.0825F, 1.432F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 26).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.0668F, 0.1221F, 0.9951F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(100, 74).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, 0.0229F, 0.0763F, 0.559F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(62, 14).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.2208F, -0.0337F, 0.5608F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 0).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1998F, -0.0612F, 0.9967F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 24).addBox(2.8937F, -2.4262F, -0.2666F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.1558F, -0.1395F, 1.4283F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4275F, -5.8865F, -0.2539F, 0.1308F, -0.005F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 128).addBox(0.0F, -4.1855F, 0.0093F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0671F, -2.0483F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 128).addBox(0.0F, -3.7022F, -0.104F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5896F, -4.501F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(108, 46).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.6685F, 0.2384F, -0.4262F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 29).mirror().addBox(-17.8937F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.2961F, 0.61F, -1.3029F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(77, 16).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -3.304F, 0.5295F, 0.4314F, -0.8418F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(106, 61).mirror().addBox(-1.012F, 0.9573F, 3.9057F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.7228F, -0.7719F, 1.0525F, -0.8921F, -0.6029F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-1.012F, -0.2797F, 0.013F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.7228F, -0.7719F, 0.7384F, -0.8921F, -0.6029F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(107, 109).mirror().addBox(-0.6443F, 0.9007F, 3.6569F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9039F, 20.4228F, -0.0719F, 0.2465F, -1.072F, 0.3018F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-0.6443F, -0.2567F, -1.2411F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9039F, 20.4228F, -0.0719F, -0.0677F, -1.072F, 0.3018F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.7939F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.4228F, -0.0719F, -0.0569F, -0.9902F, 0.2932F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(79, 94).mirror().addBox(-0.7939F, 1.1847F, 4.0272F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.4228F, -0.0719F, 0.2573F, -0.9902F, 0.2932F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.4289F, 0.3623F, -0.9126F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-15.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.2339F, 0.507F, -1.3678F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(114, 89).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4725F, -0.7135F, 0.5526F, 0.2134F, -0.4841F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-0.7939F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.5228F, -0.2719F, 0.1421F, -0.8465F, 0.1388F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-0.7939F, 1.1847F, 4.0272F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1039F, 20.5228F, -0.2719F, 0.4562F, -0.8465F, 0.1388F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(114, 89).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.5526F, -0.2134F, 0.4841F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(48, 16).addBox(2.8937F, -2.4262F, -0.2666F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.2339F, -0.507F, 1.3678F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(78, 69).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4725F, -0.7135F, 0.4289F, -0.3623F, 0.9126F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 80).addBox(-0.2061F, 1.1847F, 4.0272F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.5228F, -0.2719F, 0.4562F, 0.8465F, -0.1388F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 55).addBox(-0.2061F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.5228F, -0.2719F, 0.1421F, 0.8465F, -0.1388F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(79, 94).addBox(-0.2061F, 1.1847F, 4.0272F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.4228F, -0.0719F, 0.2573F, 0.9902F, -0.2932F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 22).addBox(-0.2061F, -0.101F, -0.8011F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.4228F, -0.0719F, -0.0569F, 0.9902F, -0.2932F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 16).addBox(-0.3557F, -0.2567F, -1.2411F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9039F, 20.4228F, -0.0719F, -0.0677F, 1.072F, -0.3018F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(107, 109).addBox(-0.3557F, 0.9007F, 3.6569F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9039F, 20.4228F, -0.0719F, 0.2465F, 1.072F, -0.3018F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(106, 48).addBox(0.0121F, -0.2797F, 0.013F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.7228F, -0.7719F, 0.7384F, 0.8921F, 0.6029F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(106, 61).addBox(0.0121F, 0.9573F, 3.9057F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1039F, 20.7228F, -0.7719F, 1.0525F, 0.8921F, 0.6029F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 119).addBox(-3.4039F, 0.4172F, 4.6895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 19.6228F, -7.8719F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 16).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.5295F, -0.4314F, 0.8418F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 74).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 29).addBox(2.8937F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.2961F, -0.61F, 1.3029F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(108, 46).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -3.304F, 0.6685F, -0.2384F, 0.4262F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 80).addBox(-3.9039F, -0.9454F, -0.1346F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9039F, 19.6228F, -7.8719F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 7.4421F, -0.9095F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(92, 94).addBox(3.5837F, -1.1122F, -5.8426F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.3146F, -4.0438F, 1.5077F, 0.144F, 1.1561F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 150).addBox(-0.5F, 0.1969F, -0.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(146, 13).addBox(-0.5F, -1.9616F, 0.6332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(46, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 7.1814F, -4.4725F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(120, 136).addBox(-0.5F, -2.3559F, 3.724F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 131).addBox(-0.5F, -4.7476F, 9.7396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(132, 112).addBox(-0.5F, -3.4356F, 8.276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(114, 16).addBox(-0.5F, -0.675F, -1.225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 5.4906F, -1.2217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(117, 58).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1943F, -0.6269F, 2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -2.7013F, 5.5439F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(33, 141).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3638F, 1.9264F, 2.2122F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(151, 13).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8751F, 1.067F, 1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(33, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.3865F, 0.1945F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(97, 41).addBox(-0.5F, -0.75F, -2.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.6922F, 0.6556F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5F, -1.0F, -2.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.6922F, 0.6556F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 7.4421F, -0.9095F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(92, 94).mirror().addBox(-4.5837F, -1.1122F, -5.8426F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3146F, -4.0438F, 1.5077F, -0.144F, -1.1561F));

		PartDefinition cube_r82 = bone6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 150).mirror().addBox(-0.5F, 0.1969F, -0.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(146, 13).mirror().addBox(-0.5F, -1.9616F, 0.6332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 114).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1814F, -4.4725F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(120, 136).mirror().addBox(-0.5F, -2.3559F, 3.724F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 131).mirror().addBox(-0.5F, -4.7476F, 9.7396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(132, 112).mirror().addBox(-0.5F, -3.4356F, 8.276F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(114, 16).mirror().addBox(-0.5F, -0.675F, -1.225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4906F, -1.2217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(117, 58).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1943F, -0.6269F, 2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-0.5F, -2.7013F, 5.5439F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.5521F, -3.9112F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(33, 141).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3638F, 1.9264F, 2.2122F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(151, 13).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8751F, 1.067F, 1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(33, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3865F, 0.1945F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone6.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(97, 41).mirror().addBox(-0.5F, -0.75F, -2.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6922F, 0.6556F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone6.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.5F, -1.0F, -2.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6922F, 0.6556F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4985F, 18.8111F, -6.4051F, 0.7274F, 0.0916F, 0.049F));

		PartDefinition cube_r96 = leftArm4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(138, 49).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0263F, 9.8253F, 1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftArm4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(150, 63).addBox(-0.5F, -1.553F, 1.409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 7.2997F, 0.266F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(50, 146).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 8.8124F, 0.9076F, 0.0441F, -0.0009F, -0.009F));

		PartDefinition cube_r99 = leftArm4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(9, 148).addBox(-0.5F, -0.3082F, 0.2292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 7.2997F, 0.266F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftArm4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(73, 143).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, 0.3661F, 0.4012F, 0.0043F, 0.0036F));

		PartDefinition cube_r101 = leftArm4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 143).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0263F, 6.9997F, 0.3661F, 0.2179F, 0.0043F, 0.0036F));

		PartDefinition cube_r102 = leftArm4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(132, 117).addBox(-0.375F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3893F, 0.7872F, 0.0425F, -2.7699F, -0.3577F, -0.0811F));

		PartDefinition cube_r103 = leftArm4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(46, 137).addBox(-0.3621F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.3562F, 0.2019F, -0.456F, -0.1553F));

		PartDefinition cube_r104 = leftArm4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(9, 136).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2043F, 2.4084F, -0.913F, 0.071F, -0.456F, -0.1553F));

		PartDefinition cube_r105 = leftArm4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(25, 146).addBox(-0.4621F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.2312F, 0.6382F, -0.456F, -0.1553F));

		PartDefinition cube_r106 = leftArm4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(138, 45).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3803F, 0.231F, 0.6832F, -0.6997F, 0.0179F, -0.143F));

		PartDefinition cube_r107 = leftArm4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(126, 42).addBox(-0.5F, -1.75F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1406F, 1.9281F, 0.4292F, -0.3071F, 0.0179F, -0.143F));

		PartDefinition cube_r108 = leftArm4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(63, 143).addBox(-0.4878F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.8936F, 0.3562F, 0.0595F, 0.0179F, -0.0033F));

		PartDefinition leftArm7 = leftArm4.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(36, 103).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(0, 99).addBox(-0.5909F, 0.8921F, -1.3717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.316F, 10.2404F, 1.6679F, -1.02F, 0.6849F, -0.6679F));

		PartDefinition cube_r109 = leftArm7.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(133, 0).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(0, 127).addBox(-0.6767F, 0.049F, -0.5432F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0463F, 12.0626F, -0.0652F, 0.1256F, 0.3685F, 0.2454F));

		PartDefinition cube_r110 = leftArm8.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(151, 95).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r111 = leftArm8.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(151, 92).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, -0.3054F));

		PartDefinition cube_r112 = leftArm8.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(127, 6).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1767F, -0.951F, -0.5432F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie3 = leftArm8.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r113 = opposablePinkie3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(143, 99).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4985F, 18.8111F, -6.4051F, 1.0414F, -0.136F, -0.1246F));

		PartDefinition cube_r114 = rightArm4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(142, 22).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0263F, 9.8253F, 1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightArm4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(151, 89).addBox(-0.5F, -1.553F, 1.409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 7.2997F, 0.266F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightArm4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(147, 125).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 8.8124F, 0.9076F, 0.0441F, 0.0009F, 0.009F));

		PartDefinition cube_r117 = rightArm4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(148, 30).addBox(-0.5F, -0.3082F, 0.2292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 7.2997F, 0.266F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightArm4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(122, 145).addBox(-0.5F, -2.4618F, -0.2581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, 0.3661F, 0.4012F, -0.0043F, -0.0036F));

		PartDefinition cube_r119 = rightArm4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(117, 145).addBox(-0.5F, -2.4618F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0263F, 6.9997F, 0.3661F, 0.2179F, -0.0043F, -0.0036F));

		PartDefinition cube_r120 = rightArm4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(136, 99).addBox(-0.625F, -0.9F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3893F, 0.7872F, 0.0425F, -2.7699F, 0.3577F, 0.0811F));

		PartDefinition cube_r121 = rightArm4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(9, 142).addBox(-0.6379F, -4.5022F, -0.8335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.3562F, 0.2019F, 0.456F, 0.1553F));

		PartDefinition cube_r122 = rightArm4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(140, 141).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2043F, 2.4084F, -0.913F, 0.071F, 0.456F, 0.1553F));

		PartDefinition cube_r123 = rightArm4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(102, 147).addBox(-0.5379F, -2.1263F, -0.524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.2312F, 0.6382F, 0.456F, 0.1553F));

		PartDefinition cube_r124 = rightArm4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(133, 141).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3803F, 0.231F, 0.6832F, -0.6997F, -0.0179F, 0.143F));

		PartDefinition cube_r125 = rightArm4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(130, 88).addBox(-0.5F, -1.75F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1406F, 1.9281F, 0.4292F, -0.3071F, -0.0179F, 0.143F));

		PartDefinition cube_r126 = rightArm4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(112, 145).addBox(-0.5122F, -2.9992F, -0.2304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.8936F, 0.3562F, 0.0595F, -0.0179F, 0.0033F));

		PartDefinition rightArm7 = rightArm4.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(41, 106).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(84, 100).addBox(-0.4091F, 0.8921F, -1.3717F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.316F, 10.2404F, 1.6679F, -1.3304F, -0.5132F, 0.8955F));

		PartDefinition cube_r127 = rightArm7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(113, 136).addBox(-0.5F, -1.8193F, -1.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(103, 130).addBox(-0.3233F, 0.049F, -0.5432F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0463F, 12.0626F, -0.0652F, 0.1584F, -0.3562F, -0.3378F));

		PartDefinition cube_r128 = rightArm8.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(151, 111).addBox(-0.5F, -0.4F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, -0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r129 = rightArm8.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(151, 108).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0153F, 5.9502F, -0.051F, 0.1745F, 0.0F, 0.3054F));

		PartDefinition cube_r130 = rightArm8.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(108, 130).addBox(-0.5F, 1.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1767F, -0.951F, -0.5432F, -0.0349F, 0.0F, 0.0F));

		PartDefinition opposablePinkie2 = rightArm8.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6956F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r131 = opposablePinkie2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(127, 145).addBox(-0.5F, -1.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0945F, 2.5179F, -0.4517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest3 = chest.addOrReplaceChild("chest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6617F, -4.598F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 122).mirror().addBox(-1.4639F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1629F, -1.0921F, 0.7513F, 0.2733F, -0.3874F));

		PartDefinition cube_r133 = chest3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(127, 76).mirror().addBox(-3.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1629F, -1.0921F, 0.5959F, 0.4954F, -0.7942F));

		PartDefinition cube_r134 = chest3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-17.765F, -1.9458F, -0.318F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1629F, -1.0921F, 0.3266F, 0.6939F, -1.2666F));

		PartDefinition cube_r135 = chest3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 31).addBox(2.765F, -1.9458F, -0.318F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1629F, -1.0921F, 0.3266F, -0.6939F, 1.2666F));

		PartDefinition cube_r136 = chest3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(127, 76).addBox(1.3283F, -0.5949F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1629F, -1.0921F, 0.5959F, -0.4954F, 0.7942F));

		PartDefinition cube_r137 = chest3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 122).addBox(-0.5361F, 0.0173F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1629F, -1.0921F, 0.7513F, -0.2733F, 0.3874F));

		PartDefinition cube_r138 = chest3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 127).addBox(0.0F, -3.4781F, -0.1018F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.7842F, -2.3105F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(87, 69).addBox(-1.0F, -0.0448F, -3.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7243F, 0.0F, 0.0F));

		PartDefinition chest2 = chest3.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(137, 145).addBox(-1.0F, -2.1333F, -0.8237F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 2.5444F, -2.7267F, 0.3054F, 0.0428F, 0.0086F));

		PartDefinition cube_r140 = chest2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-17.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.1F, 0.2319F, 0.4171F, -1.2997F));

		PartDefinition cube_r141 = chest2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(87, 85).mirror().addBox(-3.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.1F, 0.3861F, 0.2821F, -0.8572F));

		PartDefinition cube_r142 = chest2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(141, 108).mirror().addBox(-1.4638F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.1F, 0.4811F, 0.1573F, -0.4283F));

		PartDefinition cube_r143 = chest2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-16.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.4F, -1.3F, 0.267F, 0.4708F, -1.2656F));

		PartDefinition cube_r144 = chest2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-3.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.4F, -1.3F, 0.4401F, 0.317F, -0.8222F));

		PartDefinition cube_r145 = chest2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(143, 35).mirror().addBox(-1.4539F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.4F, -1.3F, 0.5434F, 0.1678F, -0.3991F));

		PartDefinition cube_r146 = chest2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(144, 89).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.9F, -2.5F, 0.6144F, 0.1653F, -0.4167F));

		PartDefinition cube_r147 = chest2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(145, 50).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.9F, -2.5F, 0.5088F, 0.3432F, -0.8293F));

		PartDefinition cube_r148 = chest2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-14.729F, -1.955F, -0.2993F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.9F, -2.5F, 0.3211F, 0.5222F, -1.2692F));

		PartDefinition cube_r149 = chest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 26).addBox(2.729F, -1.955F, -0.2993F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -2.5F, 0.3211F, -0.5222F, 1.2692F));

		PartDefinition cube_r150 = chest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 128).addBox(0.0F, -1.1777F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 5.0153F, -5.0777F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(53, 114).addBox(0.0F, -2.4502F, -0.0382F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.6153F, -3.5777F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 65).addBox(0.0F, -2.6278F, -0.0698F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.043F, -2.1443F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(21, 55).addBox(-1.0F, -0.0865F, -2.1546F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 3.543F, -3.4443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(145, 50).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -2.5F, 0.5088F, -0.3432F, 0.8293F));

		PartDefinition cube_r155 = chest2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(144, 89).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -2.5F, 0.6144F, -0.1653F, 0.4167F));

		PartDefinition cube_r156 = chest2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(143, 35).addBox(-0.5461F, -0.0044F, -0.3987F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -1.3F, 0.5434F, -0.1678F, 0.3991F));

		PartDefinition cube_r157 = chest2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(93, 67).addBox(1.3095F, -0.6103F, -0.3082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -1.3F, 0.4401F, -0.317F, 0.8222F));

		PartDefinition cube_r158 = chest2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(31, 14).addBox(2.7415F, -1.9518F, -0.3082F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -1.3F, 0.267F, -0.4708F, 1.2656F));

		PartDefinition cube_r159 = chest2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(141, 108).addBox(-0.5362F, 0.0169F, -0.4103F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.1F, 0.4811F, -0.1573F, 0.4283F));

		PartDefinition cube_r160 = chest2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(87, 85).addBox(1.3281F, -0.5952F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.1F, 0.3861F, -0.2821F, 0.8572F));

		PartDefinition cube_r161 = chest2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(31, 0).addBox(2.7647F, -1.946F, -0.3188F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.1F, 0.2319F, -0.4171F, 1.2997F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.4588F, -4.9343F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(152, 125).addBox(0.0F, -1.491F, -0.0268F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9772F, -1.9376F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(146, 118).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, 0.5561F, 0.3435F, 0.0407F, -0.4448F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(146, 120).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, 0.5561F, 0.3086F, 0.119F, -0.8756F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-10.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5491F, 0.5561F, 0.2316F, 0.2373F, -1.3027F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(147, 19).mirror().addBox(-1.4488F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -1.2439F, 0.4455F, 0.2598F, -0.5251F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(-3.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -1.2439F, 0.3071F, 0.3601F, -0.9716F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-3.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8491F, -1.2439F, 0.1199F, 0.4544F, -1.4365F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(84, 16).addBox(2.729F, -1.955F, -0.2993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -1.2439F, 0.1199F, -0.4544F, 1.4365F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(147, 0).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -1.2439F, 0.3071F, -0.3601F, 0.9716F));

		PartDefinition cube_r171 = neck4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(147, 19).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8491F, -1.2439F, 0.4455F, -0.2598F, 0.5251F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(54, 12).addBox(2.729F, -1.955F, -0.2993F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, 0.5561F, 0.2316F, -0.2373F, 1.3027F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(146, 120).addBox(1.2995F, -0.6185F, -0.2993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, 0.5561F, 0.3086F, -0.119F, 0.8756F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(146, 118).addBox(-0.5512F, -0.0159F, -0.3893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5491F, 0.5561F, 0.3435F, -0.0407F, 0.4448F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(97, 55).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -2.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2016F, -1.0737F, 0.5542F, 0.1125F, -0.0671F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(64, 152).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5689F, -1.3778F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r177 = neck3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(100, 102).addBox(-0.5F, -1.9487F, 3.0661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -6.3763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5735F, -3.3438F, -0.4171F, 0.0797F, -0.1554F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(61, 152).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.3469F, -0.4618F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(51, 129).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.7362F, -1.9005F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 102).addBox(-0.5F, -0.3018F, 5.8419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.2263F, -6.8488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(25, 120).addBox(-0.5F, -3.75F, -0.9206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(152, 129).addBox(0.0F, -2.75F, 0.7794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7838F, -2.5662F, 0.3665F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(127, 106).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(20, 141).addBox(0.0F, -3.0F, 1.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 153).addBox(0.0F, -1.0F, 1.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6812F, -0.89F, -0.1469F, 0.0864F, -0.1518F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(128, 48).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(153, 31).addBox(0.0F, -2.0F, 1.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0919F, 0.0801F, -0.1036F));

		PartDefinition neck = neck7.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6059F, 1.1927F, -0.8635F, 0.1183F, -0.1286F));

		PartDefinition cube_r181 = neck.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(62, 120).addBox(0.0F, -1.1F, -1.1F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9961F, -0.7523F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(62, 114).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, -1.3451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1694F, -1.769F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(122, 150).addBox(-0.5F, -0.575F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 4.7623F, -15.3404F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(73, 111).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.6882F, -4.6005F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 127).addBox(-1.0F, -0.6193F, -2.2713F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(120, 70).addBox(-1.125F, 0.2086F, 0.7238F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.125F, 3.4057F, -15.0498F, -1.5803F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(124, 61).addBox(-1.125F, 0.2476F, -1.0794F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.125F, 3.4057F, -15.0498F, -0.1404F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(138, 64).addBox(-1.0F, 0.0789F, -0.9909F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(114, 85).addBox(-1.5F, -0.5589F, 0.0315F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(132, 122).addBox(-1.5F, -1.5393F, -0.5464F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(114, 81).addBox(-1.5F, -1.5308F, -0.5565F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(78, 61).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.9708F, -6.4152F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(95, 8).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.6741F, -4.6297F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 0).addBox(-1.5F, -1.6036F, -2.3507F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.3469F, -2.1125F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 100).addBox(-1.5F, -0.4671F, -0.6677F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.5719F, -2.3875F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(120, 65).addBox(-0.625F, -1.0365F, -1.8799F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.125F, 3.4057F, -15.0498F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 146).addBox(-0.5F, -0.2818F, -2.8334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -3.2842F, -6.6112F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(129, 99).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.7692F, -7.9079F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(76, 128).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -3.1578F, -8.2225F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(141, 68).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.5993F, -8.8896F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(147, 37).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -3.6829F, -9.6852F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(106, 28).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.3897F, -10.4296F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(145, 45).addBox(-0.5F, -2.9F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -2.9139F, -11.0727F, -2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(38, 147).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, -1.0575F, -11.7314F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(147, 26).addBox(-0.5F, -0.1F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, -0.3004F, -10.9335F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(135, 33).addBox(-0.5F, -4.3F, -0.225F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0493F, -11.5961F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(58, 141).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 0.7946F, -15.0385F, 2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(141, 76).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 2.4544F, -14.9156F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(51, 138).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2886F, -15.8497F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(28, 130).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 1.4954F, -10.9655F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(46, 129).addBox(-0.5F, -5.8F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, 2.2415F, -10.4622F, 2.1642F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6835F, 4.8227F, -15.9145F, 0.0F, -0.0349F, 0.0436F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(139, 95).addBox(-0.2413F, -2.9093F, -2.2779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -1.1664F, 0.0432F, -0.1733F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(139, 91).addBox(-0.2406F, -2.1334F, -2.7199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -1.8209F, 0.0432F, -0.1733F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(94, 127).addBox(-1.2406F, 3.1922F, -1.0829F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 2.8653F, 0.0432F, -0.1733F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(113, 130).addBox(-0.8397F, 2.1676F, 0.3203F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -1.5708F, 0.1745F, -0.0436F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(132, 13).addBox(-0.5F, -1.5757F, -1.7233F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.3135F, -3.5144F, 6.9531F, 0.9425F, 0.2182F, -0.0436F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(55, 94).addBox(-0.5F, -1.5642F, -1.0778F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3135F, -3.5144F, 6.9531F, 0.2007F, 0.2182F, -0.0436F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(117, 150).addBox(-0.2406F, 1.2462F, -3.7398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -2.5889F, 0.0432F, -0.1733F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(112, 150).addBox(-0.2406F, 1.2951F, -3.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -2.7809F, 0.0432F, -0.1733F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(146, 110).addBox(-0.2406F, -2.8012F, -2.5878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -1.5155F, 0.0432F, -0.1733F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(119, 51).addBox(-1.3219F, -0.1478F, 1.4879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.6372F, 0.1105F, 0.017F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 114).addBox(-1.3219F, -1.1245F, 4.191F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(119, 37).addBox(-1.3219F, -0.1245F, 1.591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.4196F, 0.1454F, 0.0171F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(137, 137).addBox(-0.7929F, -0.2957F, -0.1349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.7826F, -0.0563F, -0.0129F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(150, 34).addBox(-1.1032F, 0.3109F, -1.195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.9238F, 0.0558F, -0.0033F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(137, 133).addBox(-1.1022F, 0.3337F, 0.026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.6599F, 0.0563F, -0.0302F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(114, 120).addBox(-1.6042F, -3.9922F, -0.9552F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.1693F, 0.0976F, -0.1354F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(106, 6).addBox(-1.1832F, -5.338F, -3.0483F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.7833F, 0.2869F, -0.1027F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(98, 109).addBox(-1.4739F, -3.9735F, -3.6741F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.0491F, 0.1743F, -0.1408F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(39, 118).addBox(-1.5106F, -3.6325F, -2.3083F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.1072F, 0.171F, -0.1358F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(3, 152).addBox(-0.5445F, 1.7228F, -1.9866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.8945F, 0.1289F, -0.1864F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(20, 144).addBox(-0.5481F, -1.8925F, 0.0351F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.033F, 0.1265F, -0.0985F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(107, 146).addBox(-0.6445F, -0.3502F, -1.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.9381F, 0.1289F, -0.1864F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(144, 4).addBox(-0.6445F, -0.2378F, -0.1715F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.1963F, 0.1289F, -0.1864F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(83, 133).addBox(-0.3037F, -3.5767F, -1.7789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.495F, 0.093F, -0.2542F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(111, 66).addBox(-0.5856F, -1.9916F, -2.2025F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.0255F, 0.182F, -0.1035F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(87, 116).addBox(-0.2764F, 1.7458F, -6.8753F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.0305F, 0.1571F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(133, 59).addBox(-0.0861F, -1.524F, -1.415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.486F, 0.1914F, -0.1672F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(147, 133).addBox(-0.0861F, -2.3809F, -1.2812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.3431F, 0.1914F, -0.1672F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(146, 95).addBox(-0.0595F, -3.7068F, -0.4029F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.0485F, 0.1613F, -0.1963F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(93, 146).addBox(-0.0595F, -3.6174F, 0.0824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.3103F, 0.1613F, -0.1963F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(146, 91).addBox(-0.0595F, -3.456F, 0.3914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.5285F, 0.1613F, -0.1963F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(88, 146).addBox(-0.0595F, -3.309F, 0.4765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.6856F, 0.1613F, -0.1963F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(83, 146).addBox(-0.0595F, -3.1919F, 0.4375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.8077F, 0.1613F, -0.1963F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(133, 54).addBox(-0.1227F, -0.6465F, -1.9766F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.5543F, 0.1872F, -0.1536F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(87, 127).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5271F, -7.3328F, 12.2088F, -0.118F, 0.1872F, -0.1536F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(51, 133).addBox(-0.375F, -1.7349F, -0.715F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -2.9418F, 0.2156F, -0.1284F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(127, 70).addBox(-0.375F, -2.199F, -1.3629F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.295F))
				.texOffs(72, 139).addBox(-0.375F, 0.1706F, -1.3599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, 2.9487F, 0.2156F, -0.1284F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(65, 139).addBox(-0.375F, -0.4338F, -1.665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -2.5491F, 0.2156F, -0.1284F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(139, 14).addBox(-0.375F, -0.6357F, -1.6496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -2.1128F, 0.2156F, -0.1284F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(139, 10).addBox(-0.375F, -0.5293F, -1.6316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -1.8946F, 0.2156F, -0.1284F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(102, 138).addBox(-0.375F, -0.246F, -1.6414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -1.8073F, 0.2156F, -0.1284F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(132, 94).addBox(-0.375F, -0.6467F, -0.734F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, -2.7236F, 0.2156F, -0.1284F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(133, 40).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.1274F, -8.418F, 10.5337F, -2.5419F, 0.2073F, -0.1501F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(107, 150).addBox(-0.45F, -0.7841F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 150).addBox(-0.725F, -0.7841F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.2138F, -7.0126F, 10.6794F, 0.1125F, 0.2156F, -0.1284F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(107, 114).addBox(-0.3146F, -4.4315F, -1.5799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 1.3815F, 0.2357F, -0.1422F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(118, 109).addBox(-0.1318F, -5.2116F, -0.9876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 1.5187F, 0.2964F, -0.1029F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(137, 129).addBox(0.6917F, -5.9209F, -1.1889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 1.4796F, 0.4601F, -0.1197F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(81, 138).addBox(-0.4455F, 2.0032F, -2.2537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, -0.9339F, 0.204F, -0.1551F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(147, 129).addBox(-0.4455F, -0.6003F, -2.6692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.0697F, 0.204F, -0.1551F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(133, 18).addBox(-0.4455F, -1.2556F, -2.0472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8127F, -4.8886F, 13.7528F, 0.4188F, 0.204F, -0.1551F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(148, 105).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1384F, -0.0575F, -0.0075F, -2.5793F, 1.1598F, -2.4181F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(46, 106).addBox(-0.5501F, -0.5255F, -0.7768F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.778F, 1.3841F, 0.9875F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(148, 102).addBox(0.49F, -0.1346F, -0.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, -0.9131F, 1.3527F, -0.7238F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(140, 42).addBox(-0.7375F, -0.4326F, -0.9063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.0768F, 0.8521F, 0.3317F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(148, 99).addBox(0.2833F, -0.1023F, -0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, -0.2651F, 0.8228F, -0.1247F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(148, 80).addBox(0.2007F, -0.2499F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.1435F, 0.5547F, -0.0651F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(88, 150).addBox(0.2007F, -0.0893F, -0.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(83, 150).addBox(0.2007F, -0.0893F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, -0.2056F, 0.5547F, -0.0651F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(118, 78).addBox(-0.8292F, -0.5081F, -0.5226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.3142F, 0.3242F, 0.1575F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(120, 106).addBox(-0.8629F, -0.5559F, -0.6616F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.3546F, 0.4721F, 0.273F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(78, 150).addBox(0.2007F, -0.2576F, -0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.1871F, 0.5547F, -0.0651F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(148, 77).addBox(0.183F, -0.2576F, -0.476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.1767F, 0.4517F, -0.0867F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(148, 74).addBox(0.046F, -0.4292F, -0.4315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.2163F, -0.24F, 0.0742F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 148).addBox(0.046F, -0.405F, 0.5431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2394F, -0.1518F, 1.0999F, 0.2599F, -0.24F, 0.0742F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(105, 120).addBox(-0.7F, -0.725F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0312F, -1.6528F, 2.6928F, 0.9211F, 0.0308F, 0.0537F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(118, 73).addBox(-0.3546F, -0.2446F, -2.4875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2313F, -2.4414F, 2.9178F, 1.3658F, -0.1247F, -0.2232F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 123).addBox(-0.8442F, -1.0988F, 4.5153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.5279F, -0.0098F, 0.0892F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(123, 120).addBox(-1.0291F, -1.1176F, 4.4856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.53F, -0.0756F, 0.031F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(141, 72).addBox(-1.0291F, -0.3504F, -0.2713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.7482F, -0.0756F, 0.031F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(58, 147).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4707F, -6.343F, 6.4763F, 0.512F, 0.3231F, -0.2445F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(134, 105).addBox(-0.95F, -0.125F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1064F, -7.9586F, 7.6579F, 0.6735F, 0.1751F, -0.1742F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(145, 63).addBox(-0.75F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.405F, -8.4017F, 7.0433F, -0.0644F, 0.1965F, -0.1571F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(71, 151).addBox(-0.8F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3551F, -8.4038F, 7.0415F, 0.9494F, 0.092F, -0.0821F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(147, 41).addBox(-0.875F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3619F, -6.8288F, 6.3096F, -0.2984F, 0.3498F, -0.5531F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(58, 136).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3049F, -6.4281F, 7.2259F, -0.1938F, 0.3954F, -0.728F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(123, 94).addBox(-1.0291F, -0.4997F, 1.6666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.6609F, -0.0756F, 0.031F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(120, 101).addBox(-1.0413F, -0.4997F, 1.6226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.3668F, -2.5649F, 2.9062F, 0.659F, 0.0279F, 0.1112F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(126, 141).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.2301F, -0.6744F, 1.0354F, -3.0206F, 0.0048F, -0.2777F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(33, 130).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3346F, -7.5723F, 8.0232F, 1.4072F, 0.0055F, -0.6977F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(112, 141).addBox(-0.4993F, -0.2091F, -1.2799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.2826F, -0.8498F, 0.6755F, 1.8663F, 0.0048F, -0.2777F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(141, 104).addBox(-0.4993F, -0.5009F, -0.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(141, 80).addBox(-0.4993F, -0.8759F, -0.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2826F, -0.8498F, 0.6755F, 1.4736F, 0.0048F, -0.2777F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(119, 141).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4281F, -4.0119F, 0.8915F, 1.0971F, 0.013F, -0.0814F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6835F, 4.8227F, -15.9145F, 0.0F, 0.0349F, -0.0436F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(139, 95).mirror().addBox(-0.7587F, -2.9093F, -2.2779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -1.1664F, -0.0432F, 0.1733F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(139, 91).mirror().addBox(-0.7594F, -2.1334F, -2.7199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -1.8209F, -0.0432F, 0.1733F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(94, 127).mirror().addBox(-0.7594F, 3.1922F, -1.0829F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 2.8653F, -0.0432F, 0.1733F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(113, 130).mirror().addBox(-0.1603F, 2.1676F, 0.3203F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -1.5708F, -0.1745F, 0.0436F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(132, 13).mirror().addBox(-0.5F, -1.5757F, -1.7233F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.3135F, -3.5144F, 6.9531F, 0.9425F, -0.2182F, 0.0436F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.5F, -1.5642F, -1.0778F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3135F, -3.5144F, 6.9531F, 0.2007F, -0.2182F, 0.0436F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(117, 150).mirror().addBox(-0.7594F, 1.2462F, -3.7398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -2.5889F, -0.0432F, 0.1733F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(112, 150).mirror().addBox(-0.7594F, 1.2951F, -3.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -2.7809F, -0.0432F, 0.1733F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(146, 110).mirror().addBox(-0.7594F, -2.8012F, -2.5878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -1.5155F, -0.0432F, 0.1733F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(119, 51).mirror().addBox(0.3219F, -0.1478F, 1.4879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.6372F, -0.1105F, -0.017F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(25, 114).mirror().addBox(0.3219F, -1.1245F, 4.191F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(119, 37).mirror().addBox(0.3219F, -0.1245F, 1.591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.4196F, -0.1454F, -0.0171F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(137, 137).mirror().addBox(-0.2071F, -0.2957F, -0.1349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.7826F, 0.0563F, 0.0129F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(150, 34).mirror().addBox(0.1032F, 0.3109F, -1.195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.9238F, -0.0558F, 0.0033F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(137, 133).mirror().addBox(0.1022F, 0.3337F, 0.026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.6599F, -0.0563F, 0.0302F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(114, 120).mirror().addBox(-0.3958F, -3.9922F, -0.9552F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.1693F, -0.0976F, 0.1354F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-0.8168F, -5.338F, -3.0483F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.7833F, -0.2869F, 0.1027F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(98, 109).mirror().addBox(-0.5261F, -3.9735F, -3.6741F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.0491F, -0.1743F, 0.1408F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(39, 118).mirror().addBox(-0.4894F, -3.6325F, -2.3083F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.1072F, -0.171F, 0.1358F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(3, 152).mirror().addBox(-0.4555F, 1.7228F, -1.9866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.8945F, -0.1289F, 0.1864F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(20, 144).mirror().addBox(-0.4519F, -1.8925F, 0.0351F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.033F, -0.1265F, 0.0985F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(107, 146).mirror().addBox(-0.3555F, -0.3502F, -1.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.9381F, -0.1289F, 0.1864F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(144, 4).mirror().addBox(-0.3555F, -0.2378F, -0.1715F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.1963F, -0.1289F, 0.1864F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(83, 133).mirror().addBox(-0.6963F, -3.5767F, -1.7789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.495F, -0.093F, 0.2542F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(111, 66).mirror().addBox(-0.4144F, -1.9916F, -2.2025F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.0255F, -0.182F, 0.1035F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(87, 116).mirror().addBox(0.2764F, 1.7458F, -6.8753F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.0305F, -0.1571F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(133, 59).mirror().addBox(-0.9139F, -1.524F, -1.415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.486F, -0.1914F, 0.1672F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(147, 133).mirror().addBox(-0.9139F, -2.3809F, -1.2812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.3431F, -0.1914F, 0.1672F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(146, 95).mirror().addBox(-0.9405F, -3.7068F, -0.4029F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.0485F, -0.1613F, 0.1963F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(93, 146).mirror().addBox(-0.9405F, -3.6174F, 0.0824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.3103F, -0.1613F, 0.1963F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(146, 91).mirror().addBox(-0.9405F, -3.456F, 0.3914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.5285F, -0.1613F, 0.1963F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 146).mirror().addBox(-0.9405F, -3.309F, 0.4765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.6856F, -0.1613F, 0.1963F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(83, 146).mirror().addBox(-0.9405F, -3.1919F, 0.4375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.8077F, -0.1613F, 0.1963F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(133, 54).mirror().addBox(-0.8773F, -0.6465F, -1.9766F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.5543F, -0.1872F, 0.1536F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(87, 127).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5271F, -7.3328F, 12.2088F, -0.118F, -0.1872F, 0.1536F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(51, 133).mirror().addBox(-0.625F, -1.7349F, -0.715F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -2.9418F, -0.2156F, 0.1284F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(127, 70).mirror().addBox(-0.625F, -2.199F, -1.3629F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(72, 139).mirror().addBox(-0.625F, 0.1706F, -1.3599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, 2.9487F, -0.2156F, 0.1284F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(65, 139).mirror().addBox(-0.625F, -0.4338F, -1.665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -2.5491F, -0.2156F, 0.1284F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(139, 14).mirror().addBox(-0.625F, -0.6357F, -1.6496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -2.1128F, -0.2156F, 0.1284F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(139, 10).mirror().addBox(-0.625F, -0.5293F, -1.6316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -1.8946F, -0.2156F, 0.1284F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(102, 138).mirror().addBox(-0.625F, -0.246F, -1.6414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -1.8073F, -0.2156F, 0.1284F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(132, 94).mirror().addBox(-0.625F, -0.6467F, -0.734F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, -2.7236F, -0.2156F, 0.1284F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(133, 40).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.1274F, -8.418F, 10.5337F, -2.5419F, -0.2073F, 0.1501F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(107, 150).mirror().addBox(-0.55F, -0.7841F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(93, 150).mirror().addBox(-0.275F, -0.7841F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, -7.0126F, 10.6794F, 0.1125F, -0.2156F, 0.1284F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(107, 114).mirror().addBox(-0.6854F, -4.4315F, -1.5799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 1.3815F, -0.2357F, 0.1422F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 109).mirror().addBox(-0.8682F, -5.2116F, -0.9876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 1.5187F, -0.2964F, 0.1029F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(137, 129).mirror().addBox(-1.6917F, -5.9209F, -1.1889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 1.4796F, -0.4601F, 0.1197F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(81, 138).mirror().addBox(-0.5545F, 2.0032F, -2.2537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, -0.9339F, -0.204F, 0.1551F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(147, 129).mirror().addBox(-0.5545F, -0.6003F, -2.6692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.0697F, -0.204F, 0.1551F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(133, 18).mirror().addBox(-0.5545F, -1.2556F, -2.0472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8127F, -4.8886F, 13.7528F, 0.4188F, -0.204F, 0.1551F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(148, 105).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1384F, -0.0575F, -0.0075F, -2.5793F, -1.1598F, 2.4181F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(46, 106).mirror().addBox(-1.4499F, -0.5255F, -0.7768F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.778F, -1.3841F, -0.9875F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(148, 102).mirror().addBox(-1.49F, -0.1346F, -0.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, -0.9131F, -1.3527F, 0.7238F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(140, 42).mirror().addBox(-1.2625F, -0.4326F, -0.9063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.0768F, -0.8521F, -0.3317F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(148, 99).mirror().addBox(-1.2833F, -0.1023F, -0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, -0.2651F, -0.8228F, 0.1247F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(148, 80).mirror().addBox(-1.2007F, -0.2499F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.1435F, -0.5547F, 0.0651F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(88, 150).mirror().addBox(-1.2007F, -0.0893F, -0.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(83, 150).mirror().addBox(-1.2007F, -0.0893F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, -0.2056F, -0.5547F, 0.0651F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(118, 78).mirror().addBox(-1.1708F, -0.5081F, -0.5226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.3142F, -0.3242F, -0.1575F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(120, 106).mirror().addBox(-1.137F, -0.5559F, -0.6616F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.3546F, -0.4721F, -0.273F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(78, 150).mirror().addBox(-1.2007F, -0.2576F, -0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.1871F, -0.5547F, 0.0651F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(148, 77).mirror().addBox(-1.183F, -0.2576F, -0.476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.1767F, -0.4517F, 0.0867F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(148, 74).mirror().addBox(-1.046F, -0.4292F, -0.4315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.2163F, 0.24F, -0.0742F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(73, 148).mirror().addBox(-1.046F, -0.405F, 0.5431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2394F, -0.1518F, 1.0999F, 0.2599F, 0.24F, -0.0742F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(-0.3F, -0.725F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0312F, -1.6528F, 2.6928F, 0.9211F, -0.0308F, -0.0537F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(118, 73).mirror().addBox(-0.6454F, -0.2446F, -2.4875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -2.4414F, 2.9178F, 1.3658F, 0.1247F, 0.2232F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(78, 123).mirror().addBox(-0.1558F, -1.0988F, 4.5153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.5279F, 0.0098F, -0.0892F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(0.0291F, -1.1176F, 4.4856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.53F, 0.0756F, -0.031F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(141, 72).mirror().addBox(0.0291F, -0.3504F, -0.2713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.7482F, 0.0756F, -0.031F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(58, 147).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4707F, -6.343F, 6.4763F, 0.512F, -0.3231F, 0.2445F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(-0.05F, -0.125F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1064F, -7.9586F, 7.6579F, 0.6735F, -0.1751F, 0.1742F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(145, 63).mirror().addBox(-0.25F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.405F, -8.4017F, 7.0433F, -0.0644F, -0.1965F, 0.1571F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(71, 151).mirror().addBox(-0.2F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3551F, -8.4038F, 7.0415F, 0.9494F, -0.092F, 0.0821F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(147, 41).mirror().addBox(-0.125F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3619F, -6.8288F, 6.3096F, -0.2984F, -0.3498F, 0.5531F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(58, 136).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3049F, -6.4281F, 7.2259F, -0.1938F, -0.3954F, 0.728F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(123, 94).mirror().addBox(0.0291F, -0.4997F, 1.6666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.6609F, 0.0756F, -0.031F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(120, 101).mirror().addBox(0.0413F, -0.4997F, 1.6226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3668F, -2.5649F, 2.9062F, 0.659F, -0.0279F, -0.1112F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(126, 141).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.2301F, -0.6744F, 1.0354F, -3.0206F, -0.0048F, 0.2777F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(33, 130).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3346F, -7.5723F, 8.0232F, 1.4072F, -0.0055F, 0.6977F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(112, 141).mirror().addBox(-0.5007F, -0.2091F, -1.2799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.2826F, -0.8498F, 0.6755F, 1.8663F, -0.0048F, 0.2777F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(141, 104).mirror().addBox(-0.5007F, -0.5009F, -0.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(141, 80).mirror().addBox(-0.5007F, -0.8759F, -0.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2826F, -0.8498F, 0.6755F, 1.4736F, -0.0048F, 0.2777F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(119, 141).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4281F, -4.0119F, 0.8915F, 1.0971F, -0.013F, 0.0814F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6459F, -1.7149F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(67, 134).mirror().addBox(-0.5F, -1.0792F, -0.0944F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.0044F, -1.6586F, -4.9305F, -0.628F, -0.0768F, 0.0421F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(144, 84).mirror().addBox(0.7006F, 2.89F, 0.1939F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8787F, 2.1982F, -0.5086F, -2.2305F, -0.2972F, 0.2045F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(145, 139).mirror().addBox(1.4932F, 0.0781F, -0.3625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8787F, 2.1982F, -0.5086F, -2.034F, -0.064F, 0.0833F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(121, 89).mirror().addBox(0.4379F, 0.3469F, -9.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(46, 124).mirror().addBox(0.4379F, -0.3531F, -9.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.4099F, -0.0674F, 0.0272F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(146, 114).mirror().addBox(-0.1431F, -0.1871F, -3.0827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.4547F, -0.2098F, 0.0853F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(139, 110).mirror().addBox(0.4349F, -0.85F, -8.9536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.4091F, -0.0552F, 0.0663F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(139, 114).mirror().addBox(1.7851F, -2.2074F, -9.9689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.1481F, 0.0702F, 0.0038F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(26, 142).mirror().addBox(1.8131F, -2.1947F, -9.9754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.1136F, 0.0699F, -0.0014F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(101, 151).mirror().addBox(1.8132F, -8.6456F, -6.777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 0.6282F, 0.0699F, -0.0014F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(137, 151).mirror().addBox(1.8132F, -11.1059F, 1.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 1.5009F, 0.0699F, -0.0014F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(150, 45).mirror().addBox(0.9579F, -1.6577F, 12.3839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.7244F, -0.0048F, 0.0075F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(148, 122).mirror().addBox(1.7598F, -1.612F, 11.2943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.7249F, 0.0651F, 0.0075F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(127, 150).mirror().addBox(3.832F, -1.6577F, 11.8593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.7159F, 0.1945F, -0.082F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(148, 68).mirror().addBox(12.3753F, -1.6554F, -3.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 1.3879F, 1.1461F, -1.7657F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(9.895F, 2.5048F, -3.8185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 0.745F, 1.4687F, -2.422F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(151, 114).mirror().addBox(1.8132F, 1.4632F, -10.3928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.5499F, 0.0699F, -0.0014F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(51, 142).mirror().addBox(1.8132F, -5.7246F, -10.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 0.2355F, 0.0699F, -0.0014F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(140, 61).mirror().addBox(0.8811F, -2.0883F, -7.3397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.2787F, -0.0626F, 0.0472F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(134, 69).mirror().addBox(0.7811F, -0.7677F, -6.617F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.4794F, -0.0626F, 0.0472F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(139, 118).mirror().addBox(-0.1431F, 1.2723F, -2.3402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -1.1529F, -0.2098F, 0.0853F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-0.1431F, 1.4831F, -2.4414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -1.7637F, -0.2098F, 0.0853F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-0.4027F, 0.9454F, -2.7665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.5537F, -0.302F, 0.1551F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(132, 150).mirror().addBox(-0.4027F, 0.6917F, 0.2289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -1.5573F, -0.302F, 0.1551F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(150, 137).mirror().addBox(-0.4027F, -0.964F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -2.8227F, -0.302F, 0.1551F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(150, 140).mirror().addBox(1.7831F, -5.474F, -9.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 0.1227F, 0.0711F, 0.0067F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(150, 143).mirror().addBox(0.9712F, -2.6857F, -9.4907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.1988F, -0.0074F, 0.045F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(140, 18).mirror().addBox(0.1021F, 2.9715F, -0.1114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -2.0483F, -0.1399F, 0.0696F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(141, 122).mirror().addBox(-11.8263F, 2.6954F, 2.8357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.5682F, -1.4523F, 0.6046F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(150, 146).mirror().addBox(-13.3759F, -1.4528F, 2.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 1.8142F, -1.1461F, 1.3763F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(142, 151).mirror().addBox(1.8132F, -3.3434F, 10.7259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.6353F, 0.0699F, -0.0014F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(17, 149).mirror().addBox(1.7598F, -11.2674F, 3.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(149, 21).mirror().addBox(1.7598F, -10.2674F, 3.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 1.5905F, 0.0651F, 0.0075F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(149, 83).mirror().addBox(0.9579F, -6.4147F, 11.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(149, 86).mirror().addBox(0.9579F, -6.4147F, 10.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, 2.3579F, -0.0048F, 0.0075F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(33, 136).mirror().addBox(-0.5F, -0.0944F, -1.0792F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0044F, -1.6586F, -4.9305F, -2.0243F, -0.0768F, 0.0421F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(116, 114).mirror().addBox(0.4067F, 0.1535F, -6.7297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3287F, 0.1982F, 0.2914F, -0.5407F, -0.0768F, 0.0596F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(150, 146).addBox(12.3759F, -1.4528F, 2.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 1.8142F, 1.1461F, -1.3763F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(141, 122).addBox(9.8263F, 2.6954F, 2.8357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.5682F, 1.4523F, -0.6046F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(140, 18).addBox(-1.1022F, 2.9715F, -0.1114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -2.0483F, 0.1399F, -0.0696F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(150, 143).addBox(-1.9712F, -2.6857F, -9.4907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.1988F, 0.0074F, -0.045F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(150, 140).addBox(-2.7831F, -5.474F, -9.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 0.1227F, -0.0711F, -0.0067F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(150, 137).addBox(-0.5973F, -0.964F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -2.8227F, 0.302F, -0.1551F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(132, 150).addBox(-0.5973F, 0.6917F, 0.2289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -1.5573F, 0.302F, -0.1551F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(140, 0).addBox(-0.5973F, 0.9454F, -2.7665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.5537F, 0.302F, -0.1551F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 122).addBox(-0.8569F, 1.4831F, -2.4414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -1.7637F, 0.2098F, -0.0853F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(139, 118).addBox(-0.8569F, 1.2723F, -2.3402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -1.1529F, 0.2098F, -0.0853F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(134, 69).addBox(-0.7811F, -0.7677F, -6.617F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.4794F, 0.0626F, -0.0472F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(140, 61).addBox(-0.8811F, -2.0883F, -7.3397F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.2787F, 0.0626F, -0.0472F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(51, 142).addBox(-2.8132F, -5.7246F, -10.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 0.2355F, -0.0699F, 0.0014F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(151, 114).addBox(-2.8132F, 1.4632F, -10.3928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.5499F, -0.0699F, 0.0014F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(105, 91).addBox(-11.895F, 2.5048F, -3.8185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 0.745F, -1.4687F, 2.422F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(148, 68).addBox(-13.3753F, -1.6554F, -3.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 1.3879F, -1.1461F, 1.7657F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(127, 150).addBox(-4.832F, -1.6577F, 11.8593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.7159F, -0.1945F, 0.082F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(149, 21).addBox(-2.7598F, -10.2674F, 3.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 149).addBox(-2.7598F, -11.2674F, 3.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 1.5905F, -0.0651F, -0.0075F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(148, 122).addBox(-2.7598F, -1.612F, 11.2943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.7249F, -0.0651F, -0.0075F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(149, 86).addBox(-1.9579F, -6.4147F, 10.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 83).addBox(-1.9579F, -6.4147F, 11.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.3579F, 0.0048F, -0.0075F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(150, 45).addBox(-1.9579F, -1.6577F, 12.3839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.7244F, 0.0048F, -0.0075F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(142, 151).addBox(-2.8132F, -3.3434F, 10.7259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 2.6353F, -0.0699F, 0.0014F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(137, 151).addBox(-2.8132F, -11.1059F, 1.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 1.5009F, -0.0699F, 0.0014F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(101, 151).addBox(-2.8132F, -8.6456F, -6.777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, 0.6282F, -0.0699F, 0.0014F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(26, 142).addBox(-2.8131F, -2.1947F, -9.9754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.1136F, -0.0699F, 0.0014F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(139, 114).addBox(-2.7851F, -2.2074F, -9.9689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.1481F, -0.0702F, -0.0038F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(139, 110).addBox(-1.4349F, -0.85F, -8.9536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.4091F, 0.0552F, -0.0663F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(146, 114).addBox(-0.8569F, -0.1871F, -3.0827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.4547F, 0.2098F, -0.0853F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(46, 124).addBox(-1.4379F, -0.3531F, -9.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(121, 89).addBox(-1.4379F, 0.3469F, -9.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.4099F, 0.0674F, -0.0272F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(145, 139).addBox(-2.4932F, 0.0781F, -0.3625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8787F, 2.1982F, -0.5086F, -2.034F, 0.064F, -0.0833F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(144, 84).addBox(-1.7006F, 2.89F, 0.1939F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8787F, 2.1982F, -0.5086F, -2.2305F, 0.2972F, -0.2045F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(33, 136).addBox(-0.5F, -0.0944F, -1.0792F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0044F, -1.6586F, -4.9305F, -2.0243F, 0.0768F, -0.0421F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(116, 114).addBox(-1.4067F, 0.1535F, -6.7297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3287F, 0.1982F, 0.2914F, -0.5407F, 0.0768F, -0.0596F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(67, 134).addBox(-0.5F, -1.0792F, -0.0944F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.0044F, -1.6586F, -4.9305F, -0.628F, 0.0768F, -0.0421F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, 1.7085F, 3.5447F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r440 = bone.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(42, 42).addBox(0.1082F, -8.3766F, -4.3195F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7222F, 13.3323F, -5.9974F, -0.4273F, -0.192F, -0.0034F));

		PartDefinition cube_r441 = bone.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(94, 131).addBox(-0.5F, -1.5F, -0.15F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3043F, 0.7338F, 1.6505F, -0.4348F, 0.1966F, -0.0726F));

		PartDefinition cube_r442 = bone.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(125, 83).addBox(-0.5635F, -2.5766F, -5.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7583F, 1.0091F, 6.5452F, 0.4815F, 0.1966F, -0.0726F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(106, 22).addBox(-0.5F, -1.55F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3048F, 1.7007F, 4.4105F, -0.1811F, 0.199F, -0.0656F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(124, 56).addBox(-0.75F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5751F, -0.8195F, 1.478F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(20, 88).addBox(-1.4997F, -0.3634F, -0.7461F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7404F, -0.7918F, 2.3193F, -0.1985F, 0.199F, -0.0656F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(151, 10).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7824F, 1.3905F, 6.6062F, 1.9092F, 0.2899F, -0.0768F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(151, 7).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8739F, 0.5434F, 7.1296F, 0.9929F, 0.2899F, -0.0768F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(150, 149).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6671F, -0.3146F, 6.6593F, 0.513F, 0.2899F, -0.0768F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(111, 102).addBox(-0.65F, -1.5F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2829F, 0.1797F, 1.4953F, -0.4802F, 0.031F, -0.0161F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(71, 118).addBox(-0.3881F, -0.0094F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2169F, -1.7503F, 1.0969F, -0.237F, 0.08F, -0.0349F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(69, 123).addBox(-0.5F, -0.65F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.173F, -1.3483F, -2.8261F, -0.3247F, -0.1278F, 0.0285F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(123, 15).addBox(-0.4924F, -2.4279F, 1.3498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2609F, -1.4577F, -6.2376F, -0.6301F, -0.1278F, 0.0285F));

		PartDefinition cube_r453 = bone.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(140, 38).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0327F, -2.6926F, -4.1288F, 0.2338F, -0.1278F, 0.0285F));

		PartDefinition cube_r454 = bone.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(26, 138).addBox(-0.4924F, -1.1945F, 2.1441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2609F, -1.4577F, -6.2376F, 0.0156F, -0.1278F, 0.0285F));

		PartDefinition cube_r455 = bone.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(134, 79).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5423F, -2.302F, -0.0179F, -0.2185F, -0.1308F, 0.0057F));

		PartDefinition cube_r456 = bone.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(96, 116).addBox(-0.5229F, -0.1249F, -1.3089F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1947F, 3.6324F, -7.4867F, 0.5229F, -0.0982F, 0.0178F));

		PartDefinition cube_r457 = bone.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(137, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.3073F, 6.5784F, -8.4248F, -2.6952F, -0.1293F, -0.0206F));

		PartDefinition cube_r458 = bone.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(130, 125).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.057F, 5.72F, -6.6358F, 2.1917F, -0.1293F, -0.0206F));

		PartDefinition cube_r459 = bone.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(127, 136).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5655F, 6.5932F, -10.408F, -1.5607F, -0.1293F, -0.0206F));

		PartDefinition cube_r460 = bone.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(128, 34).addBox(-0.5695F, 0.9881F, -0.7636F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1947F, 3.6324F, -7.4867F, -1.0808F, -0.1293F, -0.0206F));

		PartDefinition cube_r461 = bone.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(140, 26).addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4918F, 3.557F, -9.8959F, -0.3245F, -0.1285F, 0.0251F));

		PartDefinition cube_r462 = bone.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(140, 147).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6279F, 3.885F, -11.0136F, 0.8972F, -0.1285F, 0.0251F));

		PartDefinition cube_r463 = bone.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(69, 128).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3379F, 2.4479F, -8.4898F, 1.5866F, -0.1285F, 0.0251F));

		PartDefinition cube_r464 = bone.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(134, 74).addBox(-0.5F, -0.45F, -2.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3033F, 2.8584F, -8.3018F, 0.3213F, -0.1285F, 0.0251F));

		PartDefinition cube_r465 = bone.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3157F, 4.0187F, -2.7069F, -0.4712F, -0.0243F, 0.0098F));

		PartDefinition cube_r466 = bone.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(9, 123).addBox(-0.4913F, -0.7127F, 1.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1947F, 3.6324F, -7.4867F, 0.3133F, -0.1302F, 0.0138F));

		PartDefinition cube_r467 = bone.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(42, 99).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2321F, 3.4267F, -4.1391F, 0.0515F, -0.1302F, 0.0138F));

		PartDefinition cube_r468 = bone.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(96, 122).addBox(-0.3579F, -0.5392F, -1.937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7778F, 6.2583F, 0.9156F, -0.7239F, -0.1586F, -0.0442F));

		PartDefinition cube_r469 = bone.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(148, 71).addBox(-0.5935F, -16.7685F, 3.3445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -1.8702F, -0.1533F, -0.0474F));

		PartDefinition cube_r470 = bone.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(58, 28).addBox(-0.5935F, 4.561F, -16.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, 2.3622F, -0.1533F, -0.0474F));

		PartDefinition cube_r471 = bone.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(148, 60).addBox(-0.5935F, -9.0804F, -14.947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -3.0919F, -0.1533F, -0.0474F));

		PartDefinition cube_r472 = bone.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(68, 148).addBox(-0.5935F, -17.1547F, -3.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -2.2629F, -0.1533F, -0.0474F));

		PartDefinition cube_r473 = bone.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(137, 125).addBox(-0.5935F, -9.078F, 12.2221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -1.0848F, -0.1533F, -0.0474F));

		PartDefinition cube_r474 = bone.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(137, 87).addBox(-0.5935F, -3.7098F, 12.7657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(119, 42).addBox(-0.5935F, -1.0452F, -0.1853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -0.6921F, -0.1533F, -0.0474F));

		PartDefinition cube_r475 = bone.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5935F, -0.5711F, -0.8693F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -0.4303F, -0.1533F, -0.0474F));

		PartDefinition cube_r476 = bone.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(24, 80).addBox(-0.5935F, -1.4519F, 10.0423F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5972F, 6.8323F, 1.7026F, -0.5176F, -0.1533F, -0.0474F));

		PartDefinition cube_r477 = bone.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(87, 122).addBox(-0.3579F, -1.1904F, -1.9404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7778F, 6.2583F, 0.9156F, -0.8897F, -0.1586F, -0.0442F));

		PartDefinition cube_r478 = bone.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(112, 91).addBox(-0.5F, -0.425F, -1.325F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5387F, 4.8791F, 0.0166F, -0.4153F, -0.1343F, -0.0473F));

		PartDefinition cube_r479 = bone.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(24, 74).addBox(-1.5188F, 5.3914F, -11.7453F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5839F, 11.5654F, 9.2689F, -1.2871F, -0.263F, -0.0288F));

		PartDefinition cube_r480 = bone.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(74, 134).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2829F, 1.9539F, -2.6846F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r481 = bone.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(82, 26).addBox(-0.7829F, -0.7919F, -1.9938F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 1.7085F, 3.5447F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r482 = bone5.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(42, 42).mirror().addBox(-1.1082F, -8.3766F, -4.3195F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7222F, 13.3323F, -5.9974F, -0.4273F, 0.192F, 0.0034F));

		PartDefinition cube_r483 = bone5.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(94, 131).mirror().addBox(-0.5F, -1.5F, -0.15F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3043F, 0.7338F, 1.6505F, -0.4348F, -0.1966F, 0.0726F));

		PartDefinition cube_r484 = bone5.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-0.4365F, -2.5766F, -5.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7583F, 1.0091F, 6.5452F, 0.4815F, -0.1966F, 0.0726F));

		PartDefinition cube_r485 = bone5.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(-0.5F, -1.55F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3048F, 1.7007F, 4.4105F, -0.1811F, -0.199F, 0.0656F));

		PartDefinition cube_r486 = bone5.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(124, 56).mirror().addBox(-0.25F, -0.575F, -1.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5751F, -0.8195F, 1.478F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r487 = bone5.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(0.4997F, -0.3634F, -0.7461F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, -0.7918F, 2.3193F, -0.1985F, -0.199F, 0.0656F));

		PartDefinition cube_r488 = bone5.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(151, 10).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7824F, 1.3905F, 6.6062F, 1.9092F, -0.2899F, 0.0768F));

		PartDefinition cube_r489 = bone5.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(151, 7).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8739F, 0.5434F, 7.1296F, 0.9929F, -0.2899F, 0.0768F));

		PartDefinition cube_r490 = bone5.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(150, 149).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6671F, -0.3146F, 6.6593F, 0.513F, -0.2899F, 0.0768F));

		PartDefinition cube_r491 = bone5.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(111, 102).mirror().addBox(-0.35F, -1.5F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2829F, 0.1797F, 1.4953F, -0.4802F, -0.031F, 0.0161F));

		PartDefinition cube_r492 = bone5.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(71, 118).mirror().addBox(-0.6119F, -0.0094F, -3.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2169F, -1.7503F, 1.0969F, -0.237F, -0.08F, 0.0349F));

		PartDefinition cube_r493 = bone5.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(69, 123).mirror().addBox(-0.5F, -0.65F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.173F, -1.3483F, -2.8261F, -0.3247F, 0.1278F, -0.0285F));

		PartDefinition cube_r494 = bone5.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-0.5076F, -2.4279F, 1.3498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2609F, -1.4577F, -6.2376F, -0.6301F, 0.1278F, -0.0285F));

		PartDefinition cube_r495 = bone5.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(140, 38).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0327F, -2.6926F, -4.1288F, 0.2338F, 0.1278F, -0.0285F));

		PartDefinition cube_r496 = bone5.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(26, 138).mirror().addBox(-0.5076F, -1.1945F, 2.1441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2609F, -1.4577F, -6.2376F, 0.0156F, 0.1278F, -0.0285F));

		PartDefinition cube_r497 = bone5.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(134, 79).mirror().addBox(-0.5F, 0.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5423F, -2.302F, -0.0179F, -0.2185F, 0.1308F, -0.0057F));

		PartDefinition cube_r498 = bone5.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(96, 116).mirror().addBox(-0.4771F, -0.1249F, -1.3089F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 3.6324F, -7.4867F, 0.5229F, 0.0982F, -0.0178F));

		PartDefinition cube_r499 = bone5.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(137, 5).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3073F, 6.5784F, -8.4248F, -2.6952F, 0.1293F, 0.0206F));

		PartDefinition cube_r500 = bone5.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(130, 125).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.057F, 5.72F, -6.6358F, 2.1917F, 0.1293F, 0.0206F));

		PartDefinition cube_r501 = bone5.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(127, 136).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5655F, 6.5932F, -10.408F, -1.5607F, 0.1293F, 0.0206F));

		PartDefinition cube_r502 = bone5.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(128, 34).mirror().addBox(-0.4305F, 0.9881F, -0.7636F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 3.6324F, -7.4867F, -1.0808F, 0.1293F, 0.0206F));

		PartDefinition cube_r503 = bone5.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(140, 26).mirror().addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4918F, 3.557F, -9.8959F, -0.3245F, 0.1285F, -0.0251F));

		PartDefinition cube_r504 = bone5.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(140, 147).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6279F, 3.885F, -11.0136F, 0.8972F, 0.1285F, -0.0251F));

		PartDefinition cube_r505 = bone5.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(69, 128).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3379F, 2.4479F, -8.4898F, 1.5866F, 0.1285F, -0.0251F));

		PartDefinition cube_r506 = bone5.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(134, 74).mirror().addBox(-0.5F, -0.45F, -2.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3033F, 2.8584F, -8.3018F, 0.3213F, 0.1285F, -0.0251F));

		PartDefinition cube_r507 = bone5.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-0.5F, -0.8F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3157F, 4.0187F, -2.7069F, -0.4712F, 0.0243F, -0.0098F));

		PartDefinition cube_r508 = bone5.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(9, 123).mirror().addBox(-0.5087F, -0.7127F, 1.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 3.6324F, -7.4867F, 0.3133F, 0.1302F, -0.0138F));

		PartDefinition cube_r509 = bone5.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2321F, 3.4267F, -4.1391F, 0.0515F, 0.1302F, -0.0138F));

		PartDefinition cube_r510 = bone5.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(96, 122).mirror().addBox(-0.6421F, -0.5392F, -1.937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7778F, 6.2583F, 0.9156F, -0.7239F, 0.1586F, 0.0442F));

		PartDefinition cube_r511 = bone5.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(148, 71).mirror().addBox(-0.4065F, -16.7685F, 3.3445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -1.8702F, 0.1533F, 0.0474F));

		PartDefinition cube_r512 = bone5.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-0.4065F, 4.561F, -16.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, 2.3622F, 0.1533F, 0.0474F));

		PartDefinition cube_r513 = bone5.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(148, 60).mirror().addBox(-0.4065F, -9.0804F, -14.947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -3.0919F, 0.1533F, 0.0474F));

		PartDefinition cube_r514 = bone5.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(68, 148).mirror().addBox(-0.4065F, -17.1547F, -3.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -2.2629F, 0.1533F, 0.0474F));

		PartDefinition cube_r515 = bone5.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(137, 125).mirror().addBox(-0.4065F, -9.078F, 12.2221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -1.0848F, 0.1533F, 0.0474F));

		PartDefinition cube_r516 = bone5.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(137, 87).mirror().addBox(-0.4065F, -3.7098F, 12.7657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(119, 42).mirror().addBox(-0.4065F, -1.0452F, -0.1853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -0.6921F, 0.1533F, 0.0474F));

		PartDefinition cube_r517 = bone5.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.4065F, -0.5711F, -0.8693F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -0.4303F, 0.1533F, 0.0474F));

		PartDefinition cube_r518 = bone5.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(24, 80).mirror().addBox(-0.4065F, -1.4519F, 10.0423F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5972F, 6.8323F, 1.7026F, -0.5176F, 0.1533F, 0.0474F));

		PartDefinition cube_r519 = bone5.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(87, 122).mirror().addBox(-0.6421F, -1.1904F, -1.9404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7778F, 6.2583F, 0.9156F, -0.8897F, 0.1586F, 0.0442F));

		PartDefinition cube_r520 = bone5.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(112, 91).mirror().addBox(-0.5F, -0.425F, -1.325F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5387F, 4.8791F, 0.0166F, -0.4153F, 0.1343F, 0.0473F));

		PartDefinition cube_r521 = bone5.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(24, 74).mirror().addBox(0.5188F, 5.3914F, -11.7453F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5839F, 11.5654F, 9.2689F, -1.2871F, 0.263F, 0.0288F));

		PartDefinition cube_r522 = bone5.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(74, 134).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2829F, 1.9539F, -2.6846F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r523 = bone5.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-0.2171F, -0.7919F, -1.9938F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 4.5322F, 3.2802F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r524 = leftLeg.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5F, 0.0303F, 0.026F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.108F, 2.129F, -2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r525 = leftLeg.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(120, 131).addBox(-0.5F, 0.0302F, -2.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.0886F, 2.4073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r526 = leftLeg.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(125, 114).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0144F, 2.4034F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r527 = leftLeg.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(106, 0).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r528 = leftLeg.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(79, 142).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6205F, -2.1612F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r529 = leftLeg.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(93, 28).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6398F, -2.5008F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r530 = leftLeg.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(108, 41).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1178F, -1.5465F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r531 = leftLeg.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(20, 95).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r532 = leftLeg.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(117, 32).addBox(-1.0F, -0.025F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.1672F, -0.0219F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r533 = leftLeg.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(103, 94).addBox(-1.0F, 1.0F, -1.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 10.1493F, 0.5969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r534 = leftLeg.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r535 = leftLeg.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(109, 74).addBox(-1.0F, 0.0F, -2.05F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.363F, 0.1026F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftLeg.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(39, 80).addBox(-1.0F, -9.0F, -0.05F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.2951F, -1.8915F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r537 = leftLeg.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(108, 53).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.0231F, 1.3554F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r538 = leftLeg.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(133, 23).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 18.6729F, 2.2921F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftLeg.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(108, 58).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.1283F, 3.1308F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r540 = leftLeg.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(129, 65).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.172F, 3.4232F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftLeg.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(93, 61).addBox(-1.5F, 0.6F, -2.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.4946F, 2.3339F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r542 = leftLeg.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(106, 12).addBox(-1.5F, -1.05F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.1719F, 3.4232F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r543 = leftLeg.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(70, 87).addBox(-1.5F, 0.6F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, 15.1679F, -0.8482F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.775F, -1.3637F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r544 = leftLeg2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(105, 125).addBox(-0.5F, -0.0827F, -2.9375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 1.2261F, 0.8622F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r545 = leftLeg2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(132, 6).addBox(-0.5F, -4.4323F, -0.7597F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 5.5837F, 0.7898F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r546 = leftLeg2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(117, 22).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2F, 3.6562F, 2.1433F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r547 = leftLeg2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(148, 52).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2F, 1.7199F, 2.6441F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r548 = leftLeg2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(43, 148).addBox(-0.5F, -0.4477F, 0.7941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(145, 144).addBox(-0.5F, -0.4477F, 1.1941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 1.2261F, 0.8622F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r549 = leftLeg2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(40, 142).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 16.2141F, -0.7431F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r550 = leftLeg2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(149, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 19.1854F, -2.8975F, -2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r551 = leftLeg2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(145, 148).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 18.3172F, -3.3938F, -1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r552 = leftLeg2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(33, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 16.2295F, -1.0186F, -0.528F, 0.0F, 0.0F));

		PartDefinition cube_r553 = leftLeg2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(45, 143).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 13.0674F, -1.0564F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r554 = leftLeg2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(143, 30).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 13.2881F, -0.0811F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r555 = leftLeg2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(20, 113).addBox(-0.5F, 0.2739F, -0.9547F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 5.0837F, 0.9898F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r556 = leftLeg2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(57, 109).addBox(-0.5F, 0.293F, -0.6376F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.0837F, 0.9898F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r557 = leftLeg2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(100, 67).addBox(-1.0F, 0.0974F, -1.5509F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 16.6187F, -0.9439F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r558 = leftLeg2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(82, 48).addBox(-1.0F, -1.5F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 2.3324F, -0.076F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r559 = leftLeg2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(64, 107).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, 5.7159F, -0.3753F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r560 = leftLeg2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(97, 34).addBox(-1.0F, -1.646F, -1.9107F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 3.2021F, 2.431F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r561 = leftLeg2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(77, 100).addBox(-1.0F, -9.0F, -1.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9F, 17.2633F, 0.25F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r562 = leftLeg2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(65, 46).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 14.7664F, -1.4977F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r563 = leftLeg2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(32, 125).addBox(-1.0F, -1.3874F, -1.3465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 16.6187F, -0.9439F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r564 = leftLeg2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(103, 16).addBox(-1.0F, -1.1F, -0.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 4.2129F, -0.5839F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r565 = leftLeg2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(21, 33).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 6.672F, 0.0893F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r566 = leftLeg2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(96, 85).addBox(-1.0F, -3.5F, -0.975F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 8.9255F, 0.3433F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r567 = leftLeg2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -0.1313F, -2.1631F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.1784F, 3.5015F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(87, 76).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.7146F, -2.3663F, -1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(65, 55).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6945F, 0.0346F, 0.7069F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(48, 18).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4266F, -2.7712F, -0.4887F, 0.0F, 0.0F));

		PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 4.5322F, 3.2802F, -0.6484F, 0.2214F, -0.0263F));

		PartDefinition cube_r568 = rightLeg.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(126, 20).addBox(-0.5F, 0.0303F, 0.026F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.108F, 2.129F, -2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r569 = rightLeg.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(127, 131).addBox(-0.5F, 0.0302F, -2.024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.0886F, 2.4073F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r570 = rightLeg.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(123, 125).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0144F, 2.4034F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r571 = rightLeg.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(5, 106).addBox(-1.5F, 0.0381F, -0.1279F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.3448F, 0.5533F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r572 = rightLeg.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(86, 142).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6205F, -2.1612F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r573 = rightLeg.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(42, 93).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6398F, -2.5008F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r574 = rightLeg.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(46, 109).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1178F, -1.5465F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r575 = rightLeg.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(95, 48).addBox(-1.5F, -2.8619F, -2.4279F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.4508F, 1.1898F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r576 = rightLeg.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(117, 46).addBox(-1.0F, -0.025F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.1672F, -0.0219F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r577 = rightLeg.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(105, 83).addBox(-1.0F, 1.0F, -1.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 10.1493F, 0.5969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r578 = rightLeg.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -8.1F, -2.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0491F, 0.9908F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r579 = rightLeg.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(89, 109).addBox(-1.0F, 0.0F, -2.05F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.363F, 0.1026F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r580 = rightLeg.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(48, 80).addBox(-1.0F, -9.0F, -0.05F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 12.2951F, -1.8915F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r581 = rightLeg.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(25, 109).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.0231F, 1.3554F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r582 = rightLeg.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(134, 84).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 18.6729F, 2.2921F, -2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r583 = rightLeg.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(131, 30).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.1283F, 3.1308F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r584 = rightLeg.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(131, 26).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.172F, 3.4232F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r585 = rightLeg.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(66, 94).addBox(-1.5F, 0.6F, -2.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.4946F, 2.3339F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r586 = rightLeg.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(112, 97).addBox(-1.5F, -1.05F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 17.1719F, 3.4232F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r587 = rightLeg.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(83, 87).addBox(-1.5F, 0.6F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, 15.1679F, -0.8482F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.775F, -1.3637F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r588 = rightLeg2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(114, 125).addBox(-0.5F, -0.0827F, -2.9375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 1.2261F, 0.8622F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r589 = rightLeg2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(15, 132).addBox(-0.5F, -4.4323F, -0.7597F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 5.5837F, 0.7898F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r590 = rightLeg2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(117, 27).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2F, 3.6562F, 2.1433F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r591 = rightLeg2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(63, 148).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2F, 1.7199F, 2.6441F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r592 = rightLeg2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(148, 56).addBox(-0.5F, -0.4477F, 0.7941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(146, 9).addBox(-0.5F, -0.4477F, 1.1941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2F, 1.2261F, 0.8622F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r593 = rightLeg2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(102, 142).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 16.2141F, -0.7431F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r594 = rightLeg2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(33, 150).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 19.1854F, -2.8975F, -2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r595 = rightLeg2.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(22, 150).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2F, 18.3172F, -3.3938F, -1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r596 = rightLeg2.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(132, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 16.2295F, -1.0186F, -0.528F, 0.0F, 0.0F));

		PartDefinition cube_r597 = rightLeg2.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(143, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2F, 13.0674F, -1.0564F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r598 = rightLeg2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(143, 53).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 13.2881F, -0.0811F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r599 = rightLeg2.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(82, 113).addBox(-0.5F, 0.2739F, -0.9547F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 5.0837F, 0.9898F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r600 = rightLeg2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, 0.293F, -0.6376F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.0837F, 0.9898F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r601 = rightLeg2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(53, 102).addBox(-1.0F, 0.0974F, -1.5509F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 16.6187F, -0.9439F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r602 = rightLeg2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(57, 87).addBox(-1.0F, -1.5F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 2.3324F, -0.076F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r603 = rightLeg2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(108, 34).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 5.7159F, -0.3753F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r604 = rightLeg2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(98, 76).addBox(-1.0F, -1.646F, -1.9107F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 3.2021F, 2.431F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r605 = rightLeg2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(18, 102).addBox(-1.0F, -9.0F, -1.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 17.2633F, 0.25F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r606 = rightLeg2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(36, 71).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 14.7664F, -1.4977F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r607 = rightLeg2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(125, 78).addBox(-1.0F, -1.3874F, -1.3465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 16.6187F, -0.9439F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r608 = rightLeg2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(25, 103).addBox(-1.0F, -1.1F, -0.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 4.2129F, -0.5839F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r609 = rightLeg2.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(42, 31).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 6.672F, 0.0893F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r610 = rightLeg2.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(9, 97).addBox(-1.0F, -3.5F, -0.975F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 8.9255F, 0.3433F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r611 = rightLeg2.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(33, 93).addBox(-1.0F, -0.1313F, -2.1631F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1784F, 3.5015F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(9, 88).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 19.7146F, -2.3663F, -1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(71, 18).addBox(-3.0F, -0.9696F, -2.8933F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6945F, 0.0346F, 0.7069F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(42, 53).addBox(-3.0F, -1.4F, -4.7F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4266F, -2.7712F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone4 = rightLeg.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail8 = hips.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5241F, 8.3792F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r612 = tail8.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(34, 115).addBox(0.0F, -6.1654F, 0.0352F, 0.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1089F, -0.0954F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r613 = tail8.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-2.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 42).mirror().addBox(-2.0F, -0.1047F, 0.9991F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0309F, 0.9209F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r614 = tail8.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(82, 42).addBox(0.0F, -0.1047F, 0.9991F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(82, 36).addBox(0.0F, -0.1047F, -1.0009F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0309F, 0.9209F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r615 = tail8.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(99, 131).addBox(0.0F, -6.1305F, 0.0338F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1989F, 2.814F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r616 = tail8.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(70, 71).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8911F, -1.0954F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0141F, 5.7948F, 0.1355F, -0.0827F, 0.0272F));

		PartDefinition cube_r617 = tail.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, -5.8F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6141F, 7.4655F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r618 = tail.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(134, 131).addBox(0.0F, -8.442F, 3.289F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8599F, 1.0214F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r619 = tail.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(90, 133).addBox(0.0F, -6.442F, -0.011F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9077F, 3.0208F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r620 = tail.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(43, 133).addBox(0.0F, -6.542F, -0.011F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8599F, 1.0214F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r621 = tail.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(5, 99).addBox(0.0F, -0.144F, -0.0724F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, -2.131F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r622 = tail.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(99, 140).addBox(0.0F, -0.0495F, -0.4683F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 0.869F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r623 = tail.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(96, 138).addBox(0.0F, -0.0093F, -0.1644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 2.869F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r624 = tail.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(93, 138).addBox(0.0F, -0.0977F, 0.0369F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.255F, 4.9657F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r625 = tail.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(40, 133).addBox(0.0F, -0.0977F, -0.2631F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1019F, 7.469F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r626 = tail.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(20, 132).addBox(0.0F, -6.6875F, 0.0286F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8099F, -0.9343F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r627 = tail.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-2.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0799F, -4.9623F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r628 = tail.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, -0.1047F, 4.9991F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0799F, -4.9623F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r629 = tail.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(21, 44).addBox(-1.0F, -2.0F, 7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.9401F, -6.9786F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2599F, 8.0214F, -0.0701F, 0.0871F, -0.0061F));

		PartDefinition cube_r630 = tail2.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(0, 144).addBox(0.0F, -6.3414F, 1.3457F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 30).addBox(0.0F, -5.5414F, -0.0543F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r631 = tail2.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(17, 139).addBox(0.0F, -5.8F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r632 = tail2.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(14, 139).addBox(0.0F, -4.6F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r633 = tail2.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-1.9F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r634 = tail2.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(63, 38).addBox(-0.1F, 0.0F, 1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r635 = tail2.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(3, 136).addBox(0.0F, -0.5446F, 0.0444F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4191F, 8.2226F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r636 = tail2.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(135, 45).addBox(0.0F, -0.1825F, -0.0038F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 1.3868F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r637 = tail2.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(23, 135).addBox(0.0F, -0.3446F, -0.0556F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7729F, 3.9418F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r638 = tail2.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(109, 138).addBox(0.0F, 0.0554F, -0.3556F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4236F, 6.3868F, 0.6894F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 8.8748F, -0.0753F, 0.174F, -0.0131F));

		PartDefinition cube_r639 = tail3.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(0, 151).addBox(0.0F, -2.4184F, 0.0368F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r640 = tail3.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(27, 150).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r641 = tail3.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(98, 148).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r642 = tail3.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(14, 147).addBox(0.0F, -3.45F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r643 = tail3.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(6, 145).addBox(0.0F, -3.9F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r644 = tail3.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(3, 145).addBox(0.0F, -3.95F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r645 = tail3.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(140, 53).addBox(0.0F, -4.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r646 = tail3.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(83, 128).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2737F, 13.6362F, 0.6414F, 0.0F, 0.0F));

		PartDefinition cube_r647 = tail3.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(55, 146).addBox(0.0F, -0.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.553F, 11.5003F, 0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r648 = tail3.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(30, 146).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1342F, 8.9736F, 0.685F, 0.0F, 0.0F));

		PartDefinition cube_r649 = tail3.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(144, 132).addBox(0.0F, -0.3F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3471F, 6.3421F, 0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r650 = tail3.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(144, 125).addBox(0.0F, 0.3F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.054F, 4.0003F, 0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r651 = tail3.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(6, 136).addBox(0.0F, -1.3446F, -0.2556F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4323F, 1.9835F, 0.7287F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 61).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.0701F, 0.0871F, -0.0061F));

		PartDefinition cube_r652 = tail4.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(152, 24).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r653 = tail4.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(17, 152).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r654 = tail4.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(11, 152).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r655 = tail4.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(68, 151).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0641F, 1.8519F, 0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r656 = tail4.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(8, 152).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2192F, 8.7465F, 0.624F, 0.0F, 0.0F));

		PartDefinition cube_r657 = tail4.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(147, 151).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.373F, 6.5588F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r658 = tail4.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(58, 151).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0864F, 4.1344F, 0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r659 = tail4.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(38, 151).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, -0.0399F, 0.1744F, -0.0069F));

		PartDefinition cube_r660 = tail5.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(152, 48).addBox(0.0F, -1.6822F, -0.1146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r661 = tail5.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(44, 152).addBox(0.0F, -1.5989F, -0.1474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r662 = tail5.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(152, 41).addBox(0.0F, -1.5156F, -0.0802F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r663 = tail5.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(152, 132).addBox(0.0F, 14.7554F, 27.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4116F, -24.5084F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r664 = tail5.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(41, 152).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9666F, 4.9822F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r665 = tail5.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(152, 37).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1431F, 2.8353F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r666 = tail5.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(30, 152).addBox(0.0F, -1.5324F, -0.1131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(54, 2).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0132F, 0.1309F, 0.0017F));

		PartDefinition cube_r667 = tail6.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(153, 28).addBox(0.0F, -3.0657F, 5.5455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 153).addBox(0.0F, -2.4657F, 3.6455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r668 = tail6.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(73, 107).addBox(0.0F, -1.549F, -0.1467F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r669 = tail6.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(53, 152).addBox(0.0F, -1.5907F, -0.1795F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r670 = tail6.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(20, 153).addBox(0.0F, 17.1554F, 35.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 127).addBox(0.0F, 16.4554F, 33.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 153).addBox(0.0F, 15.8554F, 31.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 152).addBox(0.0F, 15.3554F, 29.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9913F, -32.3498F, 0.3883F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0569F, 0.0871F, -0.005F));

		PartDefinition cube_r671 = tail7.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(153, 52).addBox(0.0F, -4.7657F, 10.9455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 153).addBox(0.0F, -4.2657F, 9.1455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 153).addBox(0.0F, -3.5657F, 7.3455F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -7.9F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r672 = tail7.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(153, 58).addBox(0.0F, 18.5554F, 39.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 55).addBox(0.0F, 17.8554F, 37.6444F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9913F, -40.2498F, 0.3883F, 0.0F, 0.0F));

		PartDefinition tail9 = tail7.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0047F, 8.0006F, -0.0569F, 0.0871F, -0.005F));

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