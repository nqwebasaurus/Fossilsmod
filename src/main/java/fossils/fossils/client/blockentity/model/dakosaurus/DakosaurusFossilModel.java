package fossils.fossils.client.blockentity.model.dakosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DakosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart UpperArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart HandL2;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart Body3;
	private final ModelPart body5;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart Body4;
	private final ModelPart Tail;
	private final ModelPart tail5;
	private final ModelPart Tail2;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart Tail4;

	public DakosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone6 = this.Lowerjaw.getChild("bone6");
		this.bone2 = this.Body.getChild("bone2");
		this.bone4 = this.Body.getChild("bone4");
		this.UpperArmL = this.Body.getChild("UpperArmL");
		this.HandL = this.UpperArmL.getChild("HandL");
		this.UpperArmL2 = this.Body.getChild("UpperArmL2");
		this.HandL2 = this.UpperArmL2.getChild("HandL2");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.Body3 = this.bone.getChild("Body3");
		this.body5 = this.Body3.getChild("body5");
		this.bone3 = this.body5.getChild("bone3");
		this.bone5 = this.body5.getChild("bone5");
		this.UpperLegL = this.body5.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.UpperLegL2 = this.body5.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.Body4 = this.body5.getChild("Body4");
		this.Tail = this.Body4.getChild("Tail");
		this.tail5 = this.Tail.getChild("tail5");
		this.Tail2 = this.tail5.getChild("Tail2");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.Tail4 = this.tail9.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -18.6F, -1.0F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 93).addBox(1.565F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.3978F, -12.6046F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 93).addBox(1.565F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.2235F, -14.597F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 27).addBox(1.565F, -1.625F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.0513F, -16.5645F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-0.9326F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.5732F, 0.089F, -0.3765F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-2.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.4846F, 0.3129F, -0.811F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-5.2995F, -1.6646F, -0.3319F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.2923F, 0.4748F, -1.3019F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.4085F, 0.0343F, -0.5169F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.3557F, 0.1926F, -0.9735F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 62).mirror().addBox(-3.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.2337F, 0.3102F, -1.4545F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 87).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.5013F, 0.2308F, -0.6125F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.3501F, 0.4094F, -1.0831F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 56).mirror().addBox(-1.336F, -0.1669F, -1.1426F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 1.5133F, -13.4959F, 0.302F, -0.7346F, 0.4283F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 17).mirror().addBox(-0.9654F, 0.2867F, -1.3474F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 1.5133F, -13.4959F, -0.1436F, -0.3962F, 0.5013F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2744F, 2.0063F, -14.2447F, -0.1518F, -0.4452F, 0.5227F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2998F, 2.023F, -14.0642F, -0.0939F, -0.3458F, 0.4831F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-0.325F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3564F, 1.5572F, -15.1546F, -0.1866F, 0.1887F, -0.0354F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 26).addBox(-0.675F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7564F, 1.5572F, -15.1546F, -0.1866F, -0.1887F, 0.0354F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6998F, 2.023F, -14.0642F, -0.0939F, 0.3458F, -0.4831F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6744F, 2.0063F, -14.2447F, -0.1518F, 0.4452F, -0.5227F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 17).addBox(-0.0347F, 0.2867F, -1.3474F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.1436F, 0.3962F, -0.5013F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 56).addBox(0.336F, -0.1669F, -1.1426F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, 0.302F, 0.7346F, -0.4283F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 42).addBox(-1.4643F, -0.1546F, -2.2226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(57, 48).addBox(-1.9643F, 0.289F, -3.9983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 28).addBox(0.065F, 0.25F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(70, 66).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.3501F, -0.4094F, 1.0831F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 87).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.5013F, -0.2308F, 0.6125F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 62).addBox(2.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.2337F, -0.3102F, 1.4545F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(58, 21).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.3557F, -0.1926F, 0.9735F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 9).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.4085F, -0.0343F, 0.5169F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 8).addBox(2.2995F, -1.6646F, -0.3319F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.2923F, -0.4748F, 1.3019F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 27).addBox(0.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.4846F, -0.3129F, 0.811F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(67, 8).addBox(-0.0674F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.5732F, -0.089F, 0.3765F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -2.6493F, -16.3944F, -0.0259F, 0.3053F, -0.0078F));

		PartDefinition cube_r33 = Neck.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(24, 38).addBox(1.065F, -1.4F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 5).addBox(0.565F, 0.05F, 3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Neck.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-2.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.0455F, -1.7417F, 0.5874F, 0.9016F, -0.7987F));

		PartDefinition cube_r35 = Neck.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 46).addBox(0.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.0455F, -1.7417F, 0.5874F, -0.9016F, 0.7987F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, 0.0688F, 0.217F, -0.0228F));

		PartDefinition cube_r36 = Neck2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 20).addBox(0.565F, 0.05F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(24, 42).addBox(1.065F, -1.25F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 74).addBox(1.065F, -0.925F, 2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Neck2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(-1.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -0.7596F, 0.6566F, 0.9726F, -0.7128F));

		PartDefinition cube_r38 = Neck2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-1.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -2.7596F, 0.4096F, 0.8776F, -1.218F));

		PartDefinition cube_r39 = Neck2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 93).addBox(0.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -2.7596F, 0.4096F, -0.8776F, 1.218F));

		PartDefinition cube_r40 = Neck2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 93).addBox(0.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -0.7596F, 0.6566F, -0.9726F, 0.7128F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5975F, -4.5511F, 0.2779F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(35, 52).addBox(-0.5F, -2.0F, -0.725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -1.7105F, -11.8999F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -1.0F, -0.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.065F, 0.0115F, -1.5027F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(49, 10).addBox(-1.0F, -3.0F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -0.7432F, -2.9451F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 55).addBox(-0.46F, -0.7257F, -1.4102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.025F, -3.0574F, -15.8356F, -3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 65).addBox(-1.935F, -0.825F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -3.1037F, -15.6377F, -3.0151F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(37, 65).addBox(-1.435F, -0.803F, -1.0211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, -3.1037F, -15.6377F, -3.0063F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 65).addBox(-1.935F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -3.0076F, -15.8392F, 2.9976F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 9).addBox(-1.935F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -3.0875F, -16.4367F, 3.05F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 6).addBox(-0.993F, -0.007F, -0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.575F, -3.2967F, -13.9317F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 3).addBox(-1.01F, -0.99F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.575F, -3.299F, -13.9118F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -3.0888F, -11.9275F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -3.202F, -12.9211F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.065F, -1.7272F, -9.654F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(39, 61).addBox(-1.435F, -0.95F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.72F, -9.3252F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(70, 63).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -2.6472F, -4.0013F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 52).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.565F, -2.6683F, -5.8799F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -1.0F, -1.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.65F, -6.202F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(81, 80).addBox(-0.5F, -0.7524F, -0.9243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.7652F, -3.184F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 77).addBox(-0.5F, -0.0124F, 0.3069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(74, 0).addBox(-0.5F, -0.0124F, 0.0069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -2.4902F, -3.009F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.529F, -1.5413F, -2.5664F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 42).addBox(-1.1518F, 1.5038F, -0.229F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.4961F, 0.1747F, -0.0029F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 87).addBox(-1.502F, -0.2862F, 1.4646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.073F, -1.1012F, -11.3916F, -3.1285F, 0.0698F, 0.0F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 87).addBox(-0.0761F, -0.2862F, 1.4577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.173F, -1.1012F, -11.3916F, -3.1248F, 0.6806F, 0.0097F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(49, 53).addBox(0.8905F, -1.0985F, 1.8825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, -0.0923F, -0.0317F, -1.4365F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 87).addBox(0.969F, -0.2242F, 0.2693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.073F, -1.1012F, -11.3916F, -0.6654F, 1.4931F, 2.4753F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(45, 87).addBox(0.969F, -0.2242F, 0.1693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.173F, -1.1012F, -11.3916F, -0.6654F, 1.4931F, 2.4753F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(50, 87).addBox(0.7498F, -0.1245F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.173F, -1.1012F, -11.3916F, -0.2412F, 0.972F, 2.9334F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 87).addBox(0.3144F, -0.1245F, 0.1693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.173F, -1.1012F, -11.3916F, -1.1451F, 1.4224F, 1.993F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(12, 78).addBox(-0.9501F, -2.1831F, -0.758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.435F, 0.1572F, -0.0029F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(9, 60).addBox(-1.0459F, -0.3962F, -0.1459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.4352F, 0.1048F, -0.0029F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 61).addBox(-0.6277F, 3.922F, -0.9391F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.457F, 0.0738F, -0.0066F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 52).addBox(-0.7123F, 1.5116F, -4.9427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 2.7576F, 0.0916F, 0.0F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 60).addBox(-0.7123F, 2.9154F, -2.3485F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.8413F, 0.0916F, 0.0F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(79, 6).addBox(-0.0636F, -7.8681F, -0.0673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.7096F, 0.0037F, -0.0132F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 3).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.639F, -1.705F, -10.8581F, -1.6581F, -0.0008F, -0.0087F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(10, 85).addBox(-0.875F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.639F, -1.4822F, -8.8654F, -0.1313F, 0.0842F, -0.0287F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(10, 85).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.639F, -1.4822F, -8.8654F, -0.1309F, -0.0023F, -0.0173F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(84, 0).addBox(-0.975F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.664F, -1.6606F, -10.3546F, -0.1137F, 0.0694F, -0.0079F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(84, 0).addBox(-0.175F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.464F, -1.6606F, -10.3546F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 53).addBox(-1.0F, 0.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1641F, -1.0671F, -4.2464F, -0.0443F, 0.069F, -0.0205F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(40, 53).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.664F, -1.1195F, -5.5454F, -0.0436F, -0.0004F, -0.0087F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(39, 61).addBox(-1.11F, -0.95F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.529F, -0.1787F, -6.7588F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(39, 61).addBox(-0.975F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4148F, -1.2581F, -7.41F, -0.1758F, 0.0657F, -0.0294F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 63).addBox(0.3F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.464F, -1.1059F, -1.4349F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(68, 52).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.964F, -1.1269F, -3.3135F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(12, 51).addBox(0.3F, -1.0F, -1.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.464F, -0.1087F, -3.6356F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(56, 77).addBox(-0.0497F, 1.4433F, 5.3255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 0.336F, 0.0044F, 0.0F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 76).addBox(-0.0497F, -1.0791F, 5.6263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -0.144F, 0.0044F, 0.0F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(79, 83).addBox(-0.0636F, -7.257F, 0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(74, 83).addBox(-0.0636F, -7.657F, 0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.6878F, 0.0037F, -0.0132F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 71).addBox(3.3906F, -3.3828F, -5.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -2.7838F, -0.5629F, 0.0F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(23, 65).addBox(-0.2835F, 1.3025F, -6.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 2.8449F, 0.0393F, 0.0F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(58, 52).addBox(1.4122F, -2.535F, -5.4665F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -2.7287F, -0.5639F, -0.0195F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(25, 58).addBox(1.4122F, -0.9925F, -6.0055F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -3.0341F, -0.5639F, -0.0195F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 58).addBox(1.4122F, -5.9405F, -1.3861F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.8124F, -0.5639F, -0.0195F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(72, 8).addBox(-1.1F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0998F, -1.1069F, -2.8634F, -1.3774F, 0.0474F, -0.0471F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 71).addBox(-1.9F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1459F, -0.9988F, -2.2649F, -0.1511F, 0.2186F, -0.0129F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 47).addBox(-0.6649F, -0.5F, -1.7975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7829F, 0.013F, -0.2813F, -2.5627F, -0.9731F, 2.7223F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 6).addBox(-1.5741F, -0.6512F, -0.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.073F, -1.1012F, -11.3916F, 0.1396F, 0.0175F, 0.0F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(46, 48).addBox(-1.4249F, -0.5F, -1.657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F))
				.texOffs(46, 48).addBox(-0.8249F, -0.5F, -1.657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7829F, 0.013F, -0.2813F, -0.3142F, 0.0883F, 0.0474F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(35, 86).addBox(-0.8827F, -0.5F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(35, 86).addBox(-0.0827F, -0.5F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1946F, -0.5413F, -2.0813F, -0.3438F, -0.6085F, 0.3084F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 68).addBox(-0.5037F, -0.5F, -1.8425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1946F, -0.5413F, -2.0813F, -2.0707F, 1.2701F, -1.9865F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(85, 89).addBox(-0.375F, -0.45F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3987F, -0.2776F, -1.2085F, -0.4506F, 0.8827F, -0.2512F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(37, 83).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3987F, -0.2776F, -1.2085F, -0.2878F, 0.2262F, 0.0402F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 78).addBox(-0.3946F, -0.6167F, -2.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 78).addBox(-0.3946F, -1.0167F, -2.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8939F, 1.3246F, -7.4029F, -2.4834F, 0.1425F, -0.1661F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 32).addBox(-0.3793F, 3.4999F, -2.9039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(83, 29).addBox(-0.3793F, 4.1999F, -2.9039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 2.0072F, 0.0668F, 0.0144F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(82, 86).addBox(-0.3793F, 4.6077F, -3.6586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 2.0945F, 0.0668F, 0.0144F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(82, 75).addBox(-0.3793F, 5.2777F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.5273F, 0.0668F, 0.0144F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 78).addBox(-0.3793F, 3.2182F, 4.6006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 0.5237F, 0.0668F, 0.0144F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(76, 38).addBox(-0.3793F, 4.4153F, -0.4953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.44F, 0.0668F, 0.0144F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(65, 22).addBox(0.5249F, -4.8047F, -2.8258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.2098F, 0.4724F, -0.1892F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 18).addBox(-0.719F, -4.2322F, -2.5459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 14).addBox(-0.694F, -3.4713F, -2.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.3744F, 0.1571F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 10).addBox(-0.7359F, -2.4687F, -2.9309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 61).addBox(-0.7609F, -1.5644F, -3.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.2872F, 0.1396F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(46, 63).addBox(-0.7609F, -0.8327F, -2.9314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.3134F, 0.1396F, 0.0F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(16, 63).addBox(-0.8612F, -0.2338F, -1.4271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.3134F, 0.0873F, 0.0F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(63, 27).addBox(-0.8362F, 0.7698F, -1.5239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.3744F, 0.0873F, 0.0F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(32, 61).addBox(-0.9686F, 1.667F, -1.7156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.4181F, 0.1571F, 0.0F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 59).addBox(-1.1171F, 3.0205F, -1.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.3308F, 0.2313F, 0.0F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(69, 81).addBox(-0.5217F, -2.1133F, -1.0813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 81).addBox(-0.7867F, -2.1531F, -1.0841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.6406F, 0.0916F, 0.0F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 76).addBox(-0.5622F, -1.7896F, 0.7594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -0.5061F, 0.0916F, 0.0F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 58).addBox(-0.5622F, -3.1006F, -1.0214F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.2741F, 0.0916F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(80, 89).addBox(-0.5622F, -0.7773F, -2.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 3.002F, 0.0916F, 0.0F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5622F, 1.9635F, -0.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.4748F, 0.0916F, 0.0F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 78).addBox(-0.567F, 0.3105F, 1.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 0.4712F, 0.0916F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(92, 59).addBox(-0.5622F, -2.6532F, -1.9259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.597F, 0.0916F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 56).addBox(-0.5622F, 0.2161F, -2.3719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -2.8187F, 0.0916F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(92, 50).addBox(-0.5622F, 0.887F, -0.4321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.091F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 2.2864F, 0.0916F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(35, 92).addBox(-0.5622F, 0.2218F, 0.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.4573F, 0.0916F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(92, 53).addBox(-0.5622F, -0.1327F, 0.3024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 0.4538F, 0.0916F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 77).addBox(-0.814F, -0.2566F, -0.5798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0292F, -0.6466F, -4.1975F, -1.2897F, 0.7198F, 0.2277F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(72, 55).addBox(-0.814F, -0.147F, -0.3145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0292F, -0.6466F, -4.1975F, -1.4816F, 0.7198F, 0.2277F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(39, 80).addBox(-0.5F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2229F, -0.2833F, -3.615F, -2.994F, 0.3435F, 0.1812F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 68).addBox(-0.8F, -0.2332F, -0.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0571F, -0.2819F, -3.7099F, 1.4422F, -0.6352F, 0.2124F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(17, 79).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5741F, -0.6854F, -3.263F, 1.4858F, -0.6352F, 0.2124F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 60).addBox(-0.2F, -0.2F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5628F, -1.1293F, -4.0852F, 1.1876F, 1.1651F, 2.7102F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(68, 72).addBox(-0.225F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3622F, -1.1027F, -3.5203F, 0.6885F, -1.0181F, 0.9373F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(63, 72).addBox(-0.2F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4625F, -1.116F, -3.8027F, 0.3405F, 0.0489F, 1.5656F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 79).addBox(-0.4812F, -1.1415F, -0.731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2894F, -0.1311F, -3.6651F, 0.0167F, 0.3435F, 0.1812F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(85, 49).addBox(0.2062F, -4.8364F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 61).addBox(0.2062F, -4.4364F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.6101F, 0.3491F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 58).addBox(-1.5689F, 4.1894F, 0.8137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -1.837F, 0.0611F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 55).addBox(-1.5689F, 1.8325F, -4.6282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -0.5716F, 0.0611F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(85, 46).addBox(-1.4174F, -4.981F, -0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 52).addBox(-1.4174F, -4.581F, -0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.5525F, 0.0186F, 0.0823F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(44, 81).addBox(-1.5585F, -5.0192F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.5661F, 0.0613F, -0.0038F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 43).addBox(-1.4543F, -2.2215F, -0.2316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.073F, -1.1012F, -11.3916F, 1.5665F, -0.0435F, -0.0038F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 90).addBox(-2.3899F, 3.812F, 0.8237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -1.8283F, -0.1838F, 0.1203F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(25, 90).addBox(-2.3899F, 1.7285F, -4.2653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -0.5629F, -0.1838F, 0.1203F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(82, 22).addBox(0.0652F, 1.8098F, -4.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -0.5716F, 0.3142F, 0.0F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(82, 19).addBox(0.0652F, 4.0609F, 0.8305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -1.837F, 0.3142F, 0.0F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(15, 82).addBox(0.1065F, -1.7435F, 3.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 2.8754F, 0.3491F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(13, 38).addBox(-0.9031F, -2.2071F, -0.2215F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, -0.1426F, 0.0854F, 0.0215F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(38, 10).addBox(-0.8956F, -2.2067F, -0.2557F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, -0.1445F, 0.1368F, 0.0088F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(49, 17).addBox(-0.7677F, -0.5915F, -2.5899F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -0.1076F, 0.1201F, 0.019F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(75, 48).addBox(-0.7259F, 2.0314F, -1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, -1.4425F, 0.1375F, 0.019F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(46, 77).addBox(-0.8558F, -2.2758F, -1.2687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.3788F, 0.1222F, 0.0F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(34, 77).addBox(-0.8558F, -2.1204F, -1.8404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.2479F, 0.1222F, 0.0F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(74, 68).addBox(-0.8139F, -3.9471F, -1.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.2785F, 0.1396F, 0.0F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(12, 74).addBox(-0.8139F, -4.0614F, -1.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.973F, -1.1012F, -8.9916F, 1.4181F, 0.1396F, 0.0F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(58, 10).addBox(-0.8781F, -0.2712F, 0.0035F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.8939F, 1.3246F, -7.4029F, 1.2273F, 0.1744F, -0.0514F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(29, 53).addBox(-1.0275F, -0.7766F, -0.2078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8939F, 0.5246F, -9.0029F, 1.2348F, 0.1047F, 0.0F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(58, 16).addBox(-0.7309F, -0.0518F, -0.3651F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(0, 70).addBox(-0.7309F, 2.3974F, -1.5527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 1.5926F, 0.0916F, 0.0F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(15, 85).addBox(-0.7309F, -0.0166F, -0.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -0.3272F, 0.0916F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(44, 67).addBox(-0.7309F, -1.7874F, -0.9813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, -1.8544F, 0.0916F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(10, 82).addBox(-0.7309F, -1.4466F, -2.4629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5887F, 1.1654F, -4.9391F, 3.1198F, 0.0916F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 87).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(87, 18).addBox(-0.9F, 0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.349F, -0.2249F, 1.5667F, -0.1729F, 0.4266F, 0.0154F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 86).addBox(-0.9F, -0.35F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(77, 86).addBox(-0.9F, -0.65F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2084F, 0.369F, 1.7083F, -0.2035F, 0.6838F, -0.0421F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6779F, -0.6417F, 0.9641F, -0.2702F, 1.0223F, -0.1751F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(74, 4).addBox(-0.525F, -0.625F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.454F, 0.012F, 0.9999F, -0.5495F, 1.0223F, -0.1751F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(87, 21).addBox(-1.7423F, -0.1984F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(86, 35).addBox(-0.9423F, -0.1984F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.025F, 0.275F, 1.45F, -0.3605F, 0.9838F, -0.2621F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(89, 81).addBox(-1.7083F, -0.4538F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(89, 64).addBox(-0.9083F, -0.4538F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.025F, 0.275F, 1.45F, -0.2041F, 1.0131F, -0.0762F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 68).addBox(-0.5726F, -0.9593F, -1.8741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7394F, 0.8627F, 0.4085F, -0.3364F, 0.2171F, 0.0756F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5725F, -0.9093F, -0.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.275F, -0.875F, -0.1968F, 0.2171F, 0.0756F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(86, 41).addBox(-0.8905F, -0.3351F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(5, 82).addBox(-0.8905F, -0.5851F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(86, 38).addBox(-0.8905F, -0.3351F, 0.0829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(0, 82).addBox(-0.8905F, -0.5851F, 0.0829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.125F, 0.275F, 0.45F, -0.1404F, -0.1379F, 0.0933F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(87, 52).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.164F, -1.1102F, -1.9348F, 3.1379F, -0.0079F, -1.1344F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 87).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.164F, -1.1182F, -2.8136F, 1.5634F, -0.0158F, -1.1344F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(87, 55).addBox(-0.7F, -0.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 69).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.154F, -1.0851F, -4.3026F, 0.0201F, 0.0484F, -1.1776F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.3991F, -1.5413F, -2.5664F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(0.1518F, 1.5038F, -0.229F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.4961F, -0.1747F, 0.0029F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(0.502F, -0.2862F, 1.4646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.073F, -1.1012F, -11.3916F, -3.1285F, -0.0698F, 0.0F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.9239F, -0.2862F, 1.4577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(1.173F, -1.1012F, -11.3916F, -3.1248F, -0.6806F, -0.0097F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(49, 53).mirror().addBox(-1.8905F, -1.0985F, 1.8825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, -0.0923F, 0.0317F, 1.4365F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-1.969F, -0.2242F, 0.2693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.073F, -1.1012F, -11.3916F, -0.6654F, -1.4931F, -2.4753F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-1.969F, -0.2242F, 0.1693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.173F, -1.1012F, -11.3916F, -0.6654F, -1.4931F, -2.4753F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-1.7498F, -0.1245F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(1.173F, -1.1012F, -11.3916F, -0.2412F, -0.972F, -2.9334F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-1.3144F, -0.1245F, 0.1693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.173F, -1.1012F, -11.3916F, -1.1451F, -1.4224F, -1.993F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-0.0499F, -2.1831F, -0.758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.435F, -0.1572F, 0.0029F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(0.0459F, -0.3962F, -0.1459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.4352F, -0.1048F, 0.0029F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.3723F, 3.922F, -0.9391F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.457F, -0.0738F, 0.0066F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.2877F, 1.5116F, -4.9427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 2.7576F, -0.0916F, 0.0F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.2877F, 2.9154F, -2.3485F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.8413F, -0.0916F, 0.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-0.9364F, -7.8681F, -0.0673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.7096F, -0.0037F, 0.0132F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.639F, -1.705F, -10.8581F, -1.6581F, 0.0008F, 0.0087F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.125F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.639F, -1.4822F, -8.8654F, -0.1313F, -0.0842F, 0.0287F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.639F, -1.4822F, -8.8654F, -0.1309F, 0.0023F, 0.0173F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.025F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.664F, -1.6606F, -10.3546F, -0.1137F, -0.0694F, 0.0079F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.825F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.464F, -1.6606F, -10.3546F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(0.0F, 0.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1641F, -1.0671F, -4.2464F, -0.0443F, -0.069F, 0.0205F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.664F, -1.1195F, -5.5454F, -0.0436F, 0.0004F, 0.0087F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(0.11F, -0.95F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.529F, -0.1787F, -6.7588F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-0.025F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4148F, -1.2581F, -7.41F, -0.1758F, -0.0657F, 0.0294F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-1.3F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.464F, -1.1059F, -1.4349F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-0.8F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(1.964F, -1.1269F, -3.3135F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(12, 51).mirror().addBox(-1.3F, -1.0F, -1.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.464F, -0.1087F, -3.6356F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-0.9503F, 1.4433F, 5.3255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 0.336F, -0.0044F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.9503F, -1.0791F, 5.6263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -0.144F, -0.0044F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(79, 83).mirror().addBox(-0.9364F, -7.257F, 0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(74, 83).mirror().addBox(-0.9364F, -7.657F, 0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.6878F, -0.0037F, 0.0132F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-4.3906F, -3.3828F, -5.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -2.7838F, 0.5629F, 0.0F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(-0.7164F, 1.3025F, -6.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 2.8449F, -0.0393F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(58, 52).mirror().addBox(-4.4122F, -2.535F, -5.4665F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -2.7287F, 0.5639F, 0.0195F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-4.4122F, -0.9925F, -6.0055F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -3.0341F, 0.5639F, 0.0195F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-4.4122F, -5.9405F, -1.3861F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.8124F, 0.5639F, 0.0195F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.9F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0998F, -1.1069F, -2.8634F, -1.3774F, -0.0474F, 0.0471F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-0.1F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1459F, -0.9988F, -2.2649F, -0.1511F, -0.2186F, 0.0129F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(-1.3351F, -0.5F, -1.7975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7829F, 0.013F, -0.2813F, -2.5627F, 0.9731F, -2.7223F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(0.5741F, -0.6512F, -0.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.073F, -1.1012F, -11.3916F, 0.1396F, -0.0175F, 0.0F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(46, 48).mirror().addBox(-0.5751F, -0.5F, -1.657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(46, 48).mirror().addBox(-1.1751F, -0.5F, -1.657F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7829F, 0.013F, -0.2813F, -0.3142F, -0.0883F, -0.0474F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.1173F, -0.5F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(35, 86).mirror().addBox(-0.9173F, -0.5F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1946F, -0.5413F, -2.0813F, -0.3438F, 0.6085F, -0.3084F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-0.4963F, -0.5F, -1.8425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1946F, -0.5413F, -2.0813F, -2.0707F, -1.2701F, 1.9865F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 89).mirror().addBox(-0.625F, -0.45F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3987F, -0.2776F, -1.2085F, -0.4506F, -0.8827F, 0.2512F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(37, 83).mirror().addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3987F, -0.2776F, -1.2085F, -0.2878F, -0.2262F, -0.0402F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(66, 78).mirror().addBox(-0.6054F, -0.6167F, -2.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 78).mirror().addBox(-0.6054F, -1.0167F, -2.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 1.3246F, -7.4029F, -2.4834F, -0.1425F, 0.1661F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(-0.6207F, 3.4999F, -2.9039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(83, 29).mirror().addBox(-0.6207F, 4.1999F, -2.9039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 2.0072F, -0.0668F, -0.0144F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.6207F, 4.6077F, -3.6586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 2.0945F, -0.0668F, -0.0144F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.6207F, 5.2777F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.5273F, -0.0668F, -0.0144F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(86, 78).mirror().addBox(-0.6207F, 3.2182F, 4.6006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 0.5237F, -0.0668F, -0.0144F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(-0.6207F, 4.4153F, -0.4953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.44F, -0.0668F, -0.0144F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-1.5249F, -4.8047F, -2.8258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.2098F, -0.4724F, 0.1892F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 18).mirror().addBox(-0.281F, -4.2322F, -2.5459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 14).mirror().addBox(-0.306F, -3.4713F, -2.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.3744F, -0.1571F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-0.2641F, -2.4687F, -2.9309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 61).mirror().addBox(-0.2391F, -1.5644F, -3.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.2872F, -0.1396F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-0.2391F, -0.8327F, -2.9314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.3134F, -0.1396F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(16, 63).mirror().addBox(-0.1388F, -0.2338F, -1.4271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.3134F, -0.0873F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(-0.1638F, 0.7698F, -1.5239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.3744F, -0.0873F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.0314F, 1.667F, -1.7156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.4181F, -0.1571F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(0.1171F, 3.0205F, -1.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.3308F, -0.2313F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 81).mirror().addBox(-0.4783F, -2.1133F, -1.0813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(64, 81).mirror().addBox(-0.2133F, -2.1531F, -1.0841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.6406F, -0.0916F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-0.4378F, -1.7896F, 0.7594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -0.5061F, -0.0916F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.4378F, -3.1006F, -1.0214F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.2741F, -0.0916F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-0.4378F, -0.7773F, -2.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 3.002F, -0.0916F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.4378F, 1.9635F, -0.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.4748F, -0.0916F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.433F, 0.3105F, 1.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 0.4712F, -0.0916F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(92, 59).mirror().addBox(-0.4378F, -2.6532F, -1.9259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.597F, -0.0916F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 56).mirror().addBox(-0.4378F, 0.2161F, -2.3719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -2.8187F, -0.0916F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-0.4378F, 0.887F, -0.4321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.091F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 2.2864F, -0.0916F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.4378F, 0.2218F, 0.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.4573F, -0.0916F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(-0.4378F, -0.1327F, 0.3024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 0.4538F, -0.0916F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.186F, -0.2566F, -0.5798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0292F, -0.6466F, -4.1975F, -1.2897F, -0.7198F, -0.2277F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-0.186F, -0.147F, -0.3145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0292F, -0.6466F, -4.1975F, -1.4816F, -0.7198F, -0.2277F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-0.5F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2229F, -0.2833F, -3.615F, -2.994F, -0.3435F, -0.1812F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-0.2F, -0.2332F, -0.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0571F, -0.2819F, -3.7099F, 1.4422F, 0.6352F, -0.2124F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(17, 79).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5741F, -0.6854F, -3.263F, 1.4858F, 0.6352F, -0.2124F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-1.8F, -0.2F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5628F, -1.1293F, -4.0852F, 1.1876F, -1.1651F, -2.7102F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.775F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3622F, -1.1027F, -3.5203F, 0.6885F, 1.0181F, -0.9373F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 72).mirror().addBox(-0.8F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4625F, -1.116F, -3.8027F, 0.3405F, -0.0489F, -1.5656F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.5188F, -1.1415F, -0.731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2894F, -0.1311F, -3.6651F, 0.0167F, -0.3435F, -0.1812F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-1.2062F, -4.8364F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 61).mirror().addBox(-1.2062F, -4.4364F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.6101F, -0.3491F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(0.5689F, 4.1894F, 0.8137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -1.837F, -0.0611F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(0.5689F, 1.8325F, -4.6282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -0.5716F, -0.0611F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(0.4174F, -4.981F, -0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 52).mirror().addBox(0.4174F, -4.581F, -0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.5525F, -0.0186F, -0.0823F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(44, 81).mirror().addBox(0.5585F, -5.0192F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.5661F, -0.0613F, 0.0038F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(0.4543F, -2.2215F, -0.2316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.073F, -1.1012F, -11.3916F, 1.5665F, 0.0435F, 0.0038F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(65, 90).mirror().addBox(1.3899F, 3.812F, 0.8237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -1.8283F, 0.1838F, -0.1203F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(1.3899F, 1.7285F, -4.2653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -0.5629F, 0.1838F, -0.1203F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-1.0652F, 1.8098F, -4.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -0.5716F, -0.3142F, 0.0F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(82, 19).mirror().addBox(-1.0652F, 4.0609F, 0.8305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -1.837F, -0.3142F, 0.0F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-1.1065F, -1.7435F, 3.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 2.8754F, -0.3491F, 0.0F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(13, 38).mirror().addBox(-0.0969F, -2.2071F, -0.2215F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, -0.1426F, -0.0854F, -0.0215F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-0.1044F, -2.2067F, -0.2557F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, -0.1445F, -0.1368F, -0.0088F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-0.2323F, -0.5915F, -2.5899F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -0.1076F, -0.1201F, -0.019F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(75, 48).mirror().addBox(-0.2741F, 2.0314F, -1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, -1.4425F, -0.1375F, -0.019F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-0.1442F, -2.2758F, -1.2687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.3788F, -0.1222F, 0.0F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(34, 77).mirror().addBox(-0.1442F, -2.1204F, -1.8404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.2479F, -0.1222F, 0.0F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-0.1861F, -3.9471F, -1.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.2785F, -0.1396F, 0.0F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(12, 74).mirror().addBox(-0.1861F, -4.0614F, -1.06F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.973F, -1.1012F, -8.9916F, 1.4181F, -0.1396F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-0.1219F, -0.2712F, 0.0035F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 1.3246F, -7.4029F, 1.2273F, -0.1744F, 0.0514F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(29, 53).mirror().addBox(0.0275F, -0.7766F, -0.2078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8939F, 0.5246F, -9.0029F, 1.2348F, -0.1047F, 0.0F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-0.2691F, -0.0518F, -0.3651F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.2691F, 2.3974F, -1.5527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 1.5926F, -0.0916F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.2691F, -0.0166F, -0.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -0.3272F, -0.0916F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(-0.2691F, -1.7874F, -0.9813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, -1.8544F, -0.0916F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(-0.2691F, -1.4466F, -2.4629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.1654F, -4.9391F, 3.1198F, -0.0916F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(87, 18).mirror().addBox(-0.1F, 0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.349F, -0.2249F, 1.5667F, -0.1729F, -0.4266F, -0.0154F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(72, 86).mirror().addBox(-0.1F, -0.35F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(77, 86).mirror().addBox(-0.1F, -0.65F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2084F, 0.369F, 1.7083F, -0.2035F, -0.6838F, 0.0421F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6779F, -0.6417F, 0.9641F, -0.2702F, -1.0223F, 0.1751F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-0.475F, -0.625F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.454F, 0.012F, 0.9999F, -0.5495F, -1.0223F, 0.1751F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(87, 21).mirror().addBox(0.7423F, -0.1984F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(86, 35).mirror().addBox(-0.0577F, -0.1984F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.025F, 0.275F, 1.45F, -0.3605F, -0.9838F, 0.2621F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(89, 81).mirror().addBox(0.7083F, -0.4538F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(89, 64).mirror().addBox(-0.0917F, -0.4538F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.025F, 0.275F, 1.45F, -0.2041F, -1.0131F, 0.0762F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-0.4274F, -0.9593F, -1.8741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7394F, 0.8627F, 0.4085F, -0.3364F, -0.2171F, -0.0756F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.4275F, -0.9093F, -0.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.275F, -0.875F, -0.1968F, -0.2171F, -0.0756F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 41).mirror().addBox(-0.1095F, -0.3351F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(5, 82).mirror().addBox(-0.1095F, -0.5851F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(86, 38).mirror().addBox(-0.1095F, -0.3351F, 0.0829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-0.1095F, -0.5851F, 0.0829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.125F, 0.275F, 0.45F, -0.1404F, 0.1379F, -0.0933F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(87, 52).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.164F, -1.1102F, -1.9348F, 3.1379F, 0.0079F, 1.1344F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.164F, -1.1182F, -2.8136F, 1.5634F, 0.0158F, 1.1344F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-0.3F, -0.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 69).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.154F, -1.0851F, -4.3026F, 0.0201F, -0.0484F, 1.1776F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6124F, -0.2612F, 0.2793F, 0.0F, 0.0F));

		PartDefinition bone6 = Lowerjaw.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(2.775F, 0.4437F, 0.2209F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r288 = bone6.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.0025F, -0.1501F, -0.5549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 0.0961F, -0.0389F, -0.0038F));

		PartDefinition cube_r289 = bone6.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-0.0025F, -0.4276F, -2.0333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -0.4102F, -0.0393F, 0.0F));

		PartDefinition cube_r290 = bone6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-0.0025F, 0.0564F, 0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 0.2357F, -0.0389F, -0.0038F));

		PartDefinition cube_r291 = bone6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.0025F, -0.585F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -0.8115F, -0.0389F, -0.0038F));

		PartDefinition cube_r292 = bone6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(66, 35).mirror().addBox(-0.0025F, -0.4305F, -1.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 0.0087F, -0.0393F, 0.0F));

		PartDefinition cube_r293 = bone6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.108F, 8.1749F, 1.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -2.3089F, -0.0659F, 0.1011F));

		PartDefinition cube_r294 = bone6.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.1886F, -3.9764F, -9.1463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.3193F, -0.064F, 0.1294F));

		PartDefinition cube_r295 = bone6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-3.1953F, -5.6741F, -8.582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.1354F, -0.3604F, 0.2901F));

		PartDefinition cube_r296 = bone6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-0.0025F, -0.201F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -1.5969F, -0.0389F, -0.0038F));

		PartDefinition cube_r297 = bone6.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(60, 87).mirror().addBox(-0.0025F, 0.7237F, 0.2195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -1.4923F, -0.0393F, 0.0F));

		PartDefinition cube_r298 = bone6.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(87, 61).mirror().addBox(-0.0025F, -1.1434F, 0.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -2.9758F, -0.0393F, 0.0F));

		PartDefinition cube_r299 = bone6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(65, 87).mirror().addBox(-0.0025F, -0.3975F, -1.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 1.9111F, -0.0393F, 0.0F));

		PartDefinition cube_r300 = bone6.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-0.0025F, -0.4949F, -2.8207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -0.3752F, -0.0393F, 0.0F));

		PartDefinition cube_r301 = bone6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.0531F, 2.5927F, -0.6599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(28, 69).mirror().addBox(-0.0531F, 3.3416F, 0.089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -1.885F, -0.0567F, 0.0F));

		PartDefinition cube_r302 = bone6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-0.0531F, -1.6467F, 2.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 2.7402F, -0.0567F, 0.0F));

		PartDefinition cube_r303 = bone6.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-0.0025F, -0.5403F, -2.3286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, -0.0785F, -0.0393F, 0.0F));

		PartDefinition cube_r304 = bone6.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.0025F, -3.0016F, -1.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 1.405F, -0.0393F, 0.0F));

		PartDefinition cube_r305 = bone6.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 86).mirror().addBox(-0.0531F, -1.9676F, 2.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.4201F, 0.0F, 0.0F, 2.8623F, -0.0567F, 0.0F));

		PartDefinition cube_r306 = bone6.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.9109F, -1.2924F, -1.6953F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, -0.305F, -0.1094F, 0.0682F));

		PartDefinition cube_r307 = bone6.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.9109F, -0.3034F, 1.0863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 1.3356F, -0.1094F, 0.0682F));

		PartDefinition cube_r308 = bone6.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.9109F, -1.9558F, -0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 0.2448F, -0.1094F, 0.0682F));

		PartDefinition cube_r309 = bone6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(-0.9109F, 0.0247F, -1.9433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, -1.4133F, -0.1094F, 0.0682F));

		PartDefinition cube_r310 = bone6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-0.8043F, -2.4918F, -0.7317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false)
				.texOffs(7, 73).mirror().addBox(-0.8043F, -3.4918F, -0.1317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 1.2534F, -0.0484F, 0.0375F));

		PartDefinition cube_r311 = bone6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.8043F, -0.8354F, 2.2619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 2.7805F, -0.0484F, 0.0375F));

		PartDefinition cube_r312 = bone6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-0.2086F, -0.0332F, -0.9231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -1.9426F, -0.1184F, 0.1073F));

		PartDefinition cube_r313 = bone6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.2086F, -0.8929F, -1.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(35, 69).mirror().addBox(-0.2086F, -1.5474F, -3.5469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4067F, -0.1184F, 0.1073F));

		PartDefinition cube_r314 = bone6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-0.2086F, -2.5658F, -0.1653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, 1.1292F, -0.1184F, 0.1073F));

		PartDefinition cube_r315 = bone6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.2086F, -0.2083F, 2.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, 2.6825F, -0.1184F, 0.1073F));

		PartDefinition cube_r316 = bone6.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(80, 46).mirror().addBox(-0.0491F, 3.1189F, -0.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -2.0821F, -0.0661F, 0.1075F));

		PartDefinition cube_r317 = bone6.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-0.0491F, -0.7116F, -4.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4938F, -0.0661F, 0.1075F));

		PartDefinition cube_r318 = bone6.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-0.0491F, -5.7228F, -0.2884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, 1.077F, -0.0661F, 0.1075F));

		PartDefinition cube_r319 = bone6.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.0491F, -0.0921F, 5.5009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, 2.6827F, -0.0661F, 0.1075F));

		PartDefinition cube_r320 = bone6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-0.0491F, 6.2952F, -0.6287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -2.0734F, -0.0661F, 0.1075F));

		PartDefinition cube_r321 = bone6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.0491F, -0.0026F, -8.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.5898F, -0.0661F, 0.1075F));

		PartDefinition cube_r322 = bone6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.2086F, -1.6742F, -0.8713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.302F, -0.1184F, 0.1073F));

		PartDefinition cube_r323 = bone6.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.8043F, 2.1775F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, -1.7835F, -0.0484F, 0.0375F));

		PartDefinition cube_r324 = bone6.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.8043F, 0.4744F, 1.3546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 2.9725F, -0.0484F, 0.0375F));

		PartDefinition cube_r325 = bone6.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-0.9109F, -1.8764F, 0.8336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.3201F, 0.0F, -4.5F, 1.6236F, -0.1094F, 0.0682F));

		PartDefinition cube_r326 = bone6.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-0.2086F, -1.6328F, -1.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.3544F, -0.1184F, 0.1073F));

		PartDefinition cube_r327 = bone6.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-0.0491F, -1.3246F, -6.3477F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4764F, -0.0661F, 0.1075F));

		PartDefinition cube_r328 = bone6.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-0.0491F, -1.1063F, -7.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.5113F, -0.0661F, 0.1075F));

		PartDefinition cube_r329 = bone6.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(-0.0491F, -0.2445F, -7.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(89, 24).mirror().addBox(-0.0491F, -0.2445F, -8.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.6335F, -0.0661F, 0.1075F));

		PartDefinition cube_r330 = bone6.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.1232F, 8.1292F, -2.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -1.9861F, -0.0661F, 0.1075F));

		PartDefinition cube_r331 = bone6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-3.1789F, -2.5448F, -9.5777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 81).mirror().addBox(-3.1789F, -2.5448F, -9.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.3952F, -0.3605F, 0.2833F));

		PartDefinition cube_r332 = bone6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(90, 92).mirror().addBox(-3.1789F, 2.1261F, -9.1106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.9013F, -0.3605F, 0.2833F));

		PartDefinition cube_r333 = bone6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.1069F, -2.3616F, -8.0496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 30).mirror().addBox(-0.1069F, -2.3616F, -7.2496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 73).mirror().addBox(-0.1069F, -2.3616F, -6.4496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 34).mirror().addBox(-0.1069F, -2.3616F, -5.6496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(36, 73).mirror().addBox(-0.1069F, -2.3616F, -4.8496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 73).mirror().addBox(-0.1069F, -2.2616F, -4.0496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4939F, -0.064F, 0.1294F));

		PartDefinition cube_r334 = bone6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 73).mirror().addBox(-0.2662F, -2.2386F, -3.2838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 72).mirror().addBox(-0.2662F, -2.1386F, -2.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4952F, -0.1164F, 0.1294F));

		PartDefinition cube_r335 = bone6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(0.6825F, -2.5448F, -10.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.3685F, 0.0046F, 0.1354F));

		PartDefinition cube_r336 = bone6.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.0491F, 0.6863F, -8.7357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.6771F, -0.0661F, 0.1075F));

		PartDefinition cube_r337 = bone6.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.1886F, -3.0733F, -8.658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8201F, -0.4F, -7.6F, -0.4066F, -0.064F, 0.1294F));

		PartDefinition cube_r338 = bone6.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 81).addBox(-1.6825F, -2.5448F, -10.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.3685F, -0.0046F, -0.1354F));

		PartDefinition cube_r339 = bone6.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(73, 72).addBox(-0.7338F, -2.1386F, -2.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 73).addBox(-0.7338F, -2.2386F, -3.2838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4952F, 0.1164F, -0.1294F));

		PartDefinition cube_r340 = bone6.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(47, 73).addBox(-0.8932F, -2.2616F, -4.0496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 73).addBox(-0.8932F, -2.3616F, -4.8496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 34).addBox(-0.8932F, -2.3616F, -5.6496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 73).addBox(-0.8932F, -2.3616F, -6.4496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 30).addBox(-0.8932F, -2.3616F, -7.2496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 73).addBox(-0.8932F, -2.3616F, -8.0496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4939F, 0.064F, -0.1294F));

		PartDefinition cube_r341 = bone6.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(54, 81).addBox(2.1789F, -2.5448F, -9.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(49, 81).addBox(2.1789F, -2.5448F, -9.5777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.3952F, 0.3605F, -0.2833F));

		PartDefinition cube_r342 = bone6.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(90, 92).addBox(2.1789F, 2.1261F, -9.1106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.9013F, 0.3605F, -0.2833F));

		PartDefinition cube_r343 = bone6.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(35, 89).addBox(-0.8768F, 8.1292F, -2.0988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -1.9861F, 0.0661F, -0.1075F));

		PartDefinition cube_r344 = bone6.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(89, 24).addBox(-0.9509F, -0.2445F, -8.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(89, 24).addBox(-0.9509F, -0.2445F, -7.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.6335F, 0.0661F, -0.1075F));

		PartDefinition cube_r345 = bone6.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(89, 15).addBox(-0.9509F, -1.1063F, -7.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.5113F, 0.0661F, -0.1075F));

		PartDefinition cube_r346 = bone6.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(54, 29).addBox(-0.9509F, -1.3246F, -6.3477F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4764F, 0.0661F, -0.1075F));

		PartDefinition cube_r347 = bone6.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(89, 12).addBox(-0.7914F, -1.6328F, -1.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.3544F, 0.1184F, -0.1073F));

		PartDefinition cube_r348 = bone6.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(7, 73).addBox(-0.1958F, -3.4918F, -0.1317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(22, 81).addBox(-0.1958F, -2.4918F, -0.7317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 1.2534F, 0.0484F, -0.0375F));

		PartDefinition cube_r349 = bone6.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(27, 81).addBox(-0.0891F, -1.8764F, 0.8336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 1.6236F, 0.1094F, -0.0682F));

		PartDefinition cube_r350 = bone6.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(89, 9).addBox(-0.1958F, 0.4744F, 1.3546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 2.9725F, 0.0484F, -0.0375F));

		PartDefinition cube_r351 = bone6.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 91).addBox(-0.1958F, 2.1775F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, -1.7835F, 0.0484F, -0.0375F));

		PartDefinition cube_r352 = bone6.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(89, 6).addBox(-0.7914F, -1.6742F, -0.8713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.302F, 0.1184F, -0.1073F));

		PartDefinition cube_r353 = bone6.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(89, 3).addBox(-0.9509F, 0.6863F, -8.7357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.6771F, 0.0661F, -0.1075F));

		PartDefinition cube_r354 = bone6.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(89, 3).addBox(-0.9509F, -0.0026F, -8.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.5898F, 0.0661F, -0.1075F));

		PartDefinition cube_r355 = bone6.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(92, 21).addBox(-0.9509F, 6.2952F, -0.6287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -2.0734F, 0.0661F, -0.1075F));

		PartDefinition cube_r356 = bone6.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(89, 0).addBox(-0.9509F, -0.0921F, 5.5009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, 2.6827F, 0.0661F, -0.1075F));

		PartDefinition cube_r357 = bone6.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(78, 72).addBox(-0.9509F, -5.7228F, -0.2884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, 1.077F, 0.0661F, -0.1075F));

		PartDefinition cube_r358 = bone6.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 70).addBox(-0.9509F, -0.7116F, -4.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4938F, 0.0661F, -0.1075F));

		PartDefinition cube_r359 = bone6.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 46).addBox(-0.9509F, 3.1189F, -0.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -2.0821F, 0.0661F, -0.1075F));

		PartDefinition cube_r360 = bone6.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(88, 31).addBox(-0.7914F, -0.2083F, 2.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, 2.6825F, 0.1184F, -0.1073F));

		PartDefinition cube_r361 = bone6.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(88, 28).addBox(-0.7914F, -2.5658F, -0.1653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, 1.1292F, 0.1184F, -0.1073F));

		PartDefinition cube_r362 = bone6.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(35, 69).addBox(-0.7914F, -1.5474F, -3.5469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 88).addBox(-0.7914F, -0.8929F, -1.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4067F, 0.1184F, -0.1073F));

		PartDefinition cube_r363 = bone6.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(90, 89).addBox(-0.7914F, -0.0332F, -0.9231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -1.9426F, 0.1184F, -0.1073F));

		PartDefinition cube_r364 = bone6.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(10, 88).addBox(-0.1958F, -0.8354F, 2.2619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 2.7805F, 0.0484F, -0.0375F));

		PartDefinition cube_r365 = bone6.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(76, 80).addBox(-0.0891F, 0.0247F, -1.9433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, -1.4133F, 0.1094F, -0.0682F));

		PartDefinition cube_r366 = bone6.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(5, 88).addBox(-0.0891F, -1.9558F, -0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 0.2448F, 0.1094F, -0.0682F));

		PartDefinition cube_r367 = bone6.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 88).addBox(-0.0891F, -0.3034F, 1.0863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, 1.3356F, 0.1094F, -0.0682F));

		PartDefinition cube_r368 = bone6.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(60, 0).addBox(-0.0891F, -1.2924F, -1.6953F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-1.1F, 0.0F, -4.5F, -0.305F, 0.1094F, -0.0682F));

		PartDefinition cube_r369 = bone6.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(28, 69).addBox(-0.9469F, 3.3416F, 0.089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(21, 69).addBox(-0.9469F, 2.5927F, -0.6599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.885F, 0.0567F, 0.0F));

		PartDefinition cube_r370 = bone6.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(87, 86).addBox(-0.9469F, -1.9676F, 2.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8623F, 0.0567F, 0.0F));

		PartDefinition cube_r371 = bone6.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(87, 74).addBox(-0.9975F, -3.0016F, -1.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.405F, 0.0393F, 0.0F));

		PartDefinition cube_r372 = bone6.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(77, 62).addBox(-0.9975F, -0.5403F, -2.3286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0785F, 0.0393F, 0.0F));

		PartDefinition cube_r373 = bone6.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(58, 55).addBox(-0.9469F, -1.6467F, 2.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7402F, 0.0567F, 0.0F));

		PartDefinition cube_r374 = bone6.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(77, 58).addBox(-0.9975F, -0.4949F, -2.8207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3752F, 0.0393F, 0.0F));

		PartDefinition cube_r375 = bone6.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(65, 87).addBox(-0.9975F, -0.3975F, -1.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9111F, 0.0393F, 0.0F));

		PartDefinition cube_r376 = bone6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(87, 61).addBox(-0.9975F, -1.1434F, 0.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9758F, 0.0393F, 0.0F));

		PartDefinition cube_r377 = bone6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(60, 87).addBox(-0.9975F, 0.7237F, 0.2195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4923F, 0.0393F, 0.0F));

		PartDefinition cube_r378 = bone6.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(87, 58).addBox(-0.9975F, -0.201F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5969F, 0.0389F, 0.0038F));

		PartDefinition cube_r379 = bone6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(76, 42).addBox(2.1953F, -5.6741F, -8.582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.1354F, 0.3604F, -0.2901F));

		PartDefinition cube_r380 = bone6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(21, 73).addBox(-0.8114F, -3.0733F, -8.658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.4066F, 0.064F, -0.1294F));

		PartDefinition cube_r381 = bone6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(21, 73).addBox(-0.8114F, -3.9764F, -9.1463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -0.3193F, 0.064F, -0.1294F));

		PartDefinition cube_r382 = bone6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(5, 91).addBox(-0.892F, 8.1749F, 1.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6F, -0.4F, -7.6F, -2.3089F, 0.0659F, -0.1011F));

		PartDefinition cube_r383 = bone6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(66, 35).addBox(-0.9975F, -0.4305F, -1.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0087F, 0.0393F, 0.0F));

		PartDefinition cube_r384 = bone6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(84, 15).addBox(-0.9975F, -0.585F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8115F, 0.0389F, 0.0038F));

		PartDefinition cube_r385 = bone6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(84, 12).addBox(-0.9975F, 0.0564F, 0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2357F, 0.0389F, 0.0038F));

		PartDefinition cube_r386 = bone6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(66, 31).addBox(-0.9975F, -0.4276F, -2.0333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4102F, 0.0393F, 0.0F));

		PartDefinition cube_r387 = bone6.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 66).addBox(-0.9975F, -0.1501F, -0.5549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0961F, 0.0389F, 0.0038F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2716F, 0.6609F, -16.4146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r388 = bone2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(57, 84).addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.5893F, 0.1318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r389 = bone2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(52, 84).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3327F, -0.5195F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r390 = bone2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(47, 84).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r391 = bone2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r392 = bone2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(51, 69).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -0.7821F, -0.4337F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r393 = bone2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(30, 84).addBox(-0.4977F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, -0.0204F, -0.0436F, 1.0892F));

		PartDefinition cube_r394 = bone2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(80, 49).addBox(-0.4977F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 0.8174F, -0.0436F, 1.0892F));

		PartDefinition cube_r395 = bone2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(84, 25).addBox(-0.4977F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, -0.8843F, -0.0436F, 1.0892F));

		PartDefinition cube_r396 = bone2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(25, 84).addBox(-0.4977F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 1.3846F, -0.0436F, 1.0892F));

		PartDefinition cube_r397 = bone2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(92, 18).addBox(-0.4977F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 2.2137F, -0.0436F, 1.0892F));

		PartDefinition cube_r398 = bone2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(20, 84).addBox(-0.4977F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 1.6028F, -0.0436F, 1.0892F));

		PartDefinition bone4 = Body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8716F, 0.6609F, -16.4146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r399 = bone4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(57, 84).mirror().addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5893F, 0.1318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r400 = bone4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(52, 84).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3327F, -0.5195F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r401 = bone4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(47, 84).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r402 = bone4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r403 = bone4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(51, 69).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.7821F, -0.4337F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r404 = bone4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.5023F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, -0.0204F, 0.0436F, -1.0892F));

		PartDefinition cube_r405 = bone4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(80, 49).mirror().addBox(-0.5023F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 0.8174F, 0.0436F, -1.0892F));

		PartDefinition cube_r406 = bone4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.5023F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, -0.8843F, 0.0436F, -1.0892F));

		PartDefinition cube_r407 = bone4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.5023F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 1.3846F, 0.0436F, -1.0892F));

		PartDefinition cube_r408 = bone4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5023F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 2.2137F, 0.0436F, -1.0892F));

		PartDefinition cube_r409 = bone4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.5023F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 1.6028F, 0.0436F, -1.0892F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5684F, 0.6902F, -17.1263F, -0.733F, 0.5672F, 0.0F));

		PartDefinition cube_r410 = UpperArmL.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(75, 92).addBox(-0.5F, -0.925F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0065F, -0.1117F, 1.2062F, 0.4374F, 0.006F, 0.0121F));

		PartDefinition cube_r411 = UpperArmL.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(92, 73).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0004F, -0.5476F, 1.4707F, -0.348F, 0.006F, 0.0121F));

		PartDefinition cube_r412 = UpperArmL.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(70, 92).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, 0.006F, 0.0121F));

		PartDefinition cube_r413 = UpperArmL.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(45, 90).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 90).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(32, 81).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(89, 67).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition cube_r414 = HandL.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(18, 58).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1684F, 0.6902F, -17.1263F, -0.733F, -0.5672F, 0.0F));

		PartDefinition cube_r415 = UpperArmL2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(85, 92).addBox(-0.5F, -0.925F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0065F, -0.1117F, 1.2062F, 0.4374F, -0.006F, -0.0121F));

		PartDefinition cube_r416 = UpperArmL2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 84).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0004F, -0.5476F, 1.4707F, -0.348F, -0.006F, -0.0121F));

		PartDefinition cube_r417 = UpperArmL2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(80, 92).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, -0.006F, -0.0121F));

		PartDefinition cube_r418 = UpperArmL2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(91, 37).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 44).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 40).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(20, 90).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition cube_r419 = HandL2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(60, 5).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(30, 30).addBox(-0.435F, -0.475F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(48, 93).addBox(0.065F, -1.925F, 0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.135F, -3.0567F, -11.5659F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r420 = Body2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(51, 93).addBox(1.065F, -1.525F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.475F, 2.95F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Body2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(36, 23).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.2216F, 0.3348F, -1.2392F));

		PartDefinition cube_r422 = Body2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.3571F, 0.2197F, -0.7541F));

		PartDefinition cube_r423 = Body2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(93, 31).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.4216F, 0.0581F, -0.2971F));

		PartDefinition cube_r424 = Body2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(43, 93).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.5154F, 0.0767F, -0.292F));

		PartDefinition cube_r425 = Body2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(63, 76).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.4356F, 0.2772F, -0.736F));

		PartDefinition cube_r426 = Body2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.2651F, 0.4212F, -1.2244F));

		PartDefinition cube_r427 = Body2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(64, 46).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.2651F, -0.4212F, 1.2244F));

		PartDefinition cube_r428 = Body2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(63, 76).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.4356F, -0.2772F, 0.736F));

		PartDefinition cube_r429 = Body2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(43, 93).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.5154F, -0.0767F, 0.292F));

		PartDefinition cube_r430 = Body2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(93, 31).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.4216F, -0.0581F, 0.2971F));

		PartDefinition cube_r431 = Body2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(74, 52).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.3571F, -0.2197F, 0.7541F));

		PartDefinition cube_r432 = Body2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(36, 23).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.2216F, -0.3348F, 1.2392F));

		PartDefinition cube_r433 = Body2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(30, 25).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.344F, 4.1212F, -0.2007F, 0.0F, 0.0F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(21, 0).addBox(-0.435F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(13, 33).addBox(-1.935F, 5.5977F, 2.7309F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 94).addBox(0.065F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 0).addBox(0.065F, -1.875F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 94).addBox(0.065F, -1.85F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r434 = bone.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(66, 39).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.2716F, 0.4377F, -1.2217F));

		PartDefinition cube_r435 = bone.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.4491F, 0.2889F, -0.7322F));

		PartDefinition cube_r436 = bone.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.5322F, 0.0817F, -0.2907F));

		PartDefinition cube_r437 = bone.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4043F, 0.2598F, -0.7431F));

		PartDefinition cube_r438 = bone.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4806F, 0.074F, -0.2935F));

		PartDefinition cube_r439 = bone.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.2449F, 0.3917F, -1.2312F));

		PartDefinition cube_r440 = bone.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(77, 11).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4176F, 0.2715F, -0.7396F));

		PartDefinition cube_r441 = bone.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(64, 93).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4973F, 0.079F, -0.2922F));

		PartDefinition cube_r442 = bone.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.2513F, 0.4081F, -1.2287F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(66, 50).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.2513F, -0.4081F, 1.2287F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(64, 93).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4973F, -0.079F, 0.2922F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(77, 11).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4176F, -0.2715F, 0.7396F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(66, 48).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.2449F, -0.3917F, 1.2312F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(59, 93).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4806F, -0.074F, 0.2935F));

		PartDefinition cube_r448 = bone.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(5, 77).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4043F, -0.2598F, 0.7431F));

		PartDefinition cube_r449 = bone.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(54, 93).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.5322F, -0.0817F, 0.2907F));

		PartDefinition cube_r450 = bone.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(70, 76).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.4491F, -0.2889F, 0.7322F));

		PartDefinition cube_r451 = bone.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(66, 39).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.2716F, -0.4377F, 1.2217F));

		PartDefinition cube_r452 = bone.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.5977F, 2.7309F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, -0.0021F, -0.1309F, 0.0003F));

		PartDefinition cube_r453 = Body3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(19, 10).addBox(-0.935F, -1.0005F, 0.0113F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.3868F, 2.7799F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Body3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(36, 5).addBox(-0.935F, -1.0005F, 0.0113F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.4654F, -0.2191F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Body3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(81, 95).addBox(1.065F, -1.45F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(78, 95).addBox(1.065F, -1.35F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(75, 95).addBox(1.065F, -1.35F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(72, 95).addBox(1.065F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(0, 10).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Body3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.4251F, 0.2893F, -0.7804F));

		PartDefinition cube_r457 = Body3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(94, 24).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.5115F, 0.092F, -0.3339F));

		PartDefinition cube_r458 = Body3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(77, 66).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.249F, 0.4272F, -1.2725F));

		PartDefinition cube_r459 = Body3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.6255F, 0.1341F, -0.3658F));

		PartDefinition cube_r460 = Body3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.5146F, 0.3755F, -0.7959F));

		PartDefinition cube_r461 = Body3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.2866F, 0.5433F, -1.2997F));

		PartDefinition cube_r462 = Body3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(93, 70).mirror().addBox(-0.9244F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.721F, 0.1749F, -0.3961F));

		PartDefinition cube_r463 = Body3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-2.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.5904F, 0.4515F, -0.8105F));

		PartDefinition cube_r464 = Body3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-3.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.3148F, 0.6435F, -1.329F));

		PartDefinition cube_r465 = Body3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(6, 94).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.7905F, 0.2091F, -0.4281F));

		PartDefinition cube_r466 = Body3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.6457F, 0.51F, -0.8302F));

		PartDefinition cube_r467 = Body3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(77, 17).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.6457F, -0.51F, 0.8302F));

		PartDefinition cube_r468 = Body3.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(6, 94).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.7905F, -0.2091F, 0.4281F));

		PartDefinition cube_r469 = Body3.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(94, 4).addBox(2.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.3148F, -0.6435F, 1.329F));

		PartDefinition cube_r470 = Body3.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(17, 77).addBox(0.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.5904F, -0.4515F, 0.8105F));

		PartDefinition cube_r471 = Body3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(93, 70).addBox(-0.0756F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.721F, -0.1749F, 0.3961F));

		PartDefinition cube_r472 = Body3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(77, 15).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.2866F, -0.5433F, 1.2997F));

		PartDefinition cube_r473 = Body3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(77, 13).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.5146F, -0.3755F, 0.7959F));

		PartDefinition cube_r474 = Body3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(30, 8).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.6255F, -0.1341F, 0.3658F));

		PartDefinition cube_r475 = Body3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(77, 66).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.249F, -0.4272F, 1.2725F));

		PartDefinition cube_r476 = Body3.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(94, 24).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.5115F, -0.092F, 0.3339F));

		PartDefinition cube_r477 = Body3.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(77, 27).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.4251F, -0.2893F, 0.7804F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r478 = body5.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(16, 94).addBox(1.065F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.2302F, 1.9988F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r479 = body5.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 12).addBox(1.065F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r480 = body5.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(24, 47).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r481 = body5.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.7627F, 0.1984F, -0.4795F));

		PartDefinition cube_r482 = body5.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-1.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.622F, 0.4894F, -0.8873F));

		PartDefinition cube_r483 = body5.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.45F, 0.0154F, -0.5149F));

		PartDefinition cube_r484 = body5.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(11, 94).mirror().addBox(-1.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.4021F, 0.1937F, -0.9636F));

		PartDefinition cube_r485 = body5.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(11, 94).addBox(0.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.4021F, -0.1937F, 0.9636F));

		PartDefinition cube_r486 = body5.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(94, 10).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.45F, -0.0154F, 0.5149F));

		PartDefinition cube_r487 = body5.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(94, 8).addBox(0.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.622F, -0.4894F, 0.8873F));

		PartDefinition cube_r488 = body5.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(94, 6).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.7627F, -0.1984F, 0.4795F));

		PartDefinition bone3 = body5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r489 = bone3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(79, 3).addBox(-0.5089F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(79, 0).addBox(-0.5089F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.9232F, 0.1603F, 0.4968F));

		PartDefinition cube_r490 = bone3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(81, 37).addBox(-0.5089F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, 3.0109F, 0.1603F, 0.4968F));

		PartDefinition cube_r491 = bone3.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(70, 89).addBox(-0.5089F, -0.7667F, 0.0658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.836F, 0.1603F, 0.4968F));

		PartDefinition cube_r492 = bone3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5089F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.1378F, 0.1603F, 0.4968F));

		PartDefinition cube_r493 = bone3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(60, 90).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.9843F, -2.5469F, -1.0307F, -0.3904F, 0.1337F, -0.2258F));

		PartDefinition cube_r494 = bone3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(30, 90).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0578F, -2.4866F, -1.6639F, -1.0441F, 0.1238F, -0.2313F));

		PartDefinition cube_r495 = bone3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F))
				.texOffs(84, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8543F, -1.7342F, -1.4579F, -1.8295F, 0.1238F, -0.2313F));

		PartDefinition cube_r496 = bone3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -1.4368F, 0.1238F, -0.2313F));

		PartDefinition cube_r497 = bone3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(67, 84).addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, 0.0031F, 0.1238F, -0.2313F));

		PartDefinition cube_r498 = bone3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(84, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -0.8696F, 0.1238F, -0.2313F));

		PartDefinition cube_r499 = bone3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(62, 84).addBox(-1.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4153F, -1.0747F, -0.1272F, -0.9569F, 0.1238F, 0.5105F));

		PartDefinition cube_r500 = bone3.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(24, 77).addBox(-1.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9974F, -0.0984F, -0.3752F, -2.8767F, 0.1238F, 0.5105F));

		PartDefinition cube_r501 = bone3.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(71, 78).addBox(-1.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8305F, 0.0834F, 1.5087F, -1.2187F, 0.1238F, 0.5105F));

		PartDefinition cube_r502 = bone3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(77, 23).addBox(-1.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.7423F, 0.3597F, -0.7513F, -1.5765F, 0.1238F, 0.5105F));

		PartDefinition cube_r503 = bone3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(77, 19).addBox(-1.5955F, -1.7952F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, 0.1238F, 0.5105F));

		PartDefinition bone5 = body5.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5115F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r504 = bone5.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.4911F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(79, 0).mirror().addBox(-0.4911F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.9232F, -0.1603F, -0.4968F));

		PartDefinition cube_r505 = bone5.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-0.4911F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, 3.0109F, -0.1603F, -0.4968F));

		PartDefinition cube_r506 = bone5.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.4911F, -0.7667F, 0.0658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.836F, -0.1603F, -0.4968F));

		PartDefinition cube_r507 = bone5.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.4911F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.1378F, -0.1603F, -0.4968F));

		PartDefinition cube_r508 = bone5.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.9843F, -2.5469F, -1.0307F, -0.3904F, -0.1337F, 0.2258F));

		PartDefinition cube_r509 = bone5.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0578F, -2.4866F, -1.6639F, -1.0441F, -0.1238F, 0.2313F));

		PartDefinition cube_r510 = bone5.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(84, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.8543F, -1.7342F, -1.4579F, -1.8295F, -0.1238F, 0.2313F));

		PartDefinition cube_r511 = bone5.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -1.4368F, -0.1238F, 0.2313F));

		PartDefinition cube_r512 = bone5.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, 0.0031F, -0.1238F, 0.2313F));

		PartDefinition cube_r513 = bone5.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -0.8696F, -0.1238F, 0.2313F));

		PartDefinition cube_r514 = bone5.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(62, 84).mirror().addBox(0.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4153F, -1.0747F, -0.1272F, -0.9569F, -0.1238F, -0.5105F));

		PartDefinition cube_r515 = bone5.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(24, 77).mirror().addBox(0.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9974F, -0.0984F, -0.3752F, -2.8767F, -0.1238F, -0.5105F));

		PartDefinition cube_r516 = bone5.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(71, 78).mirror().addBox(0.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8305F, 0.0834F, 1.5087F, -1.2187F, -0.1238F, -0.5105F));

		PartDefinition cube_r517 = bone5.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(0.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.7423F, 0.3597F, -0.7513F, -1.5765F, -0.1238F, -0.5105F));

		PartDefinition cube_r518 = bone5.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(77, 19).mirror().addBox(0.5955F, -1.7952F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, -0.1238F, -0.5105F));

		PartDefinition UpperLegL = body5.addOrReplaceChild("UpperLegL", CubeListBuilder.create().texOffs(90, 47).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.68F, 2.1913F, 1.7854F, 0.4648F, 0.0923F, -0.9746F));

		PartDefinition cube_r519 = UpperLegL.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(72, 21).addBox(-0.5F, 1.8949F, -0.6615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.7485F, -1.2907F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r520 = UpperLegL.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(78, 29).addBox(-0.5F, 0.0177F, -0.0363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7485F, -1.2907F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r521 = UpperLegL.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(91, 34).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r522 = UpperLegL.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(15, 91).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create().texOffs(71, 41).addBox(-1.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 71).addBox(-1.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2006F, 5.8405F, -1.7879F, 0.3747F, -0.1872F, 0.0677F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(28, 37).addBox(-0.75F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2926F, 3.4146F, -0.1261F, 0.1262F, 0.1128F, 0.037F));

		PartDefinition UpperLegL2 = body5.addOrReplaceChild("UpperLegL2", CubeListBuilder.create().texOffs(55, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.55F, 2.1913F, 1.7854F, 1.387F, -0.0824F, 0.726F));

		PartDefinition cube_r523 = UpperLegL2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, 1.8949F, -0.6615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.7485F, -1.2907F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r524 = UpperLegL2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(78, 33).addBox(-0.5F, 0.0177F, -0.0363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7485F, -1.2907F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r525 = UpperLegL2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(91, 77).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r526 = UpperLegL2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(91, 40).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create().texOffs(72, 11).addBox(0.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 16).addBox(0.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2006F, 5.8405F, -1.7879F, 0.3747F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(37, 37).addBox(-0.25F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2926F, 3.4146F, -0.1261F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.0352F, -0.0436F, -0.0015F));

		PartDefinition cube_r527 = Body4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(25, 95).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.8624F, 2.7857F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r528 = Body4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(22, 95).addBox(1.065F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5245F, 4.589F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r529 = Body4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(19, 95).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0072F, 4.0813F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r530 = Body4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(94, 80).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1672F, 2.0889F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r531 = Body4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(94, 64).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3415F, 0.0965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r532 = Body4.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1018F, 0.4183F, 0.5827F, 0.0478F, -0.5534F));

		PartDefinition cube_r533 = Body4.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-2.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 23).addBox(-0.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 25).addBox(-1.565F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1299F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r534 = Body4.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(94, 16).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1018F, 0.4183F, 0.5827F, -0.0478F, 0.5534F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(43, 30).addBox(-0.435F, -0.3651F, -0.0129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, -0.074F, -0.1305F, 0.0097F));

		PartDefinition cube_r535 = Tail.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(95, 43).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3651F, 1.9871F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r536 = Tail.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(43, 95).addBox(1.065F, -1.475F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4651F, -0.0629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r537 = Tail.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1349F, -0.0129F, 0.0068F, 0.0342F, 0.0016F));

		PartDefinition cube_r538 = Tail.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1349F, -0.0129F, 0.0068F, -0.0342F, -0.0016F));

		PartDefinition cube_r539 = Tail.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(36, 95).addBox(1.065F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 95).addBox(1.065F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.6896F, 1.4622F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 45).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r540 = tail5.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(60, 95).addBox(1.065F, -1.425F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4F, 2.05F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail5.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(57, 95).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail5.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.335F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r543 = tail5.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(57, 34).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.465F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r544 = tail5.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(15, 20).addBox(1.065F, 1.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 95).addBox(1.065F, 0.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -2.5248F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(45, 23).addBox(-0.435F, -0.478F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0152F, 0.2618F, 0.0039F));

		PartDefinition cube_r545 = Tail2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(66, 95).addBox(1.065F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 2.0123F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r546 = Tail2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(63, 95).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 0.0123F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r547 = Tail2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(57, 38).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.022F, 0.0123F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r548 = Tail2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(57, 38).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.022F, 0.0123F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r549 = Tail2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(63, 31).addBox(1.065F, 3.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 12).addBox(1.065F, 2.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -6.4998F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 46).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r550 = tail6.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(17, 74).addBox(1.065F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail6.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(60, 65).addBox(1.065F, 4.2F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5327F, -10.5122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail6.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(69, 95).addBox(1.065F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(46, 36).addBox(-0.435F, -0.0994F, 0.0567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, -0.0062F, 0.3054F, -0.0019F));

		PartDefinition cube_r553 = Tail3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(95, 89).addBox(1.065F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 0.0567F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r554 = Tail3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(87, 95).addBox(1.065F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 2.0567F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r555 = Tail3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(84, 95).addBox(1.065F, 6.0F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 47).addBox(1.065F, 5.2F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.9327F, -14.4122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(46, 42).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.0181F, 0.2618F, -0.0047F));

		PartDefinition cube_r556 = tail7.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(6, 96).addBox(1.065F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.1F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail7.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(93, 95).addBox(1.065F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail7.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(95, 92).addBox(1.065F, 8.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 95).addBox(1.065F, 7.0F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5321F, -18.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(20, 53).addBox(-0.435F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4999F, 4.0087F, -0.0806F, 0.5222F, -0.0403F));

		PartDefinition cube_r559 = tail8.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(96, 26).addBox(1.065F, -0.675F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.026F, 2.054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail8.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(12, 96).addBox(1.065F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail8.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(9, 96).addBox(1.065F, 8.9F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0321F, -22.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(67, 4).addBox(-0.435F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(96, 33).addBox(0.065F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1096F, 2.9801F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail9.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(96, 39).addBox(1.065F, -0.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail9.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(5, 85).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail9.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(96, 36).addBox(1.065F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.911F, 1.6579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6928F, 2.5703F, 0.0456F, 0.0F, 0.0F));

		PartDefinition cube_r565 = Tail4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(51, 0).addBox(0.565F, 0.4811F, 1.6197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r566 = Tail4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(63, 64).addBox(0.565F, -0.0653F, -0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r567 = Tail4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(14, 67).addBox(0.565F, -1.0152F, -0.2699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r568 = Tail4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(97, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 1.2524F, 2.2201F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r569 = Tail4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(96, 95).addBox(1.065F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 76).addBox(1.065F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.153F, 0.881F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r570 = Tail4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(0, 35).addBox(0.565F, 0.8F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 101, 101);
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