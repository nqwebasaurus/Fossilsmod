package fossils.fossils.client.blockentity.model.dakosaurusandiniensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DakosaurusandiniensisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart UpperArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart HandL2;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart Body3;
	private final ModelPart body5;
	private final ModelPart bone3;
	private final ModelPart bone4;
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

	public DakosaurusandiniensisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone2 = this.Body.getChild("bone2");
		this.bone5 = this.Body.getChild("bone5");
		this.UpperArmL = this.Body.getChild("UpperArmL");
		this.HandL = this.UpperArmL.getChild("HandL");
		this.UpperArmL2 = this.Body.getChild("UpperArmL2");
		this.HandL2 = this.UpperArmL2.getChild("HandL2");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.Body3 = this.bone.getChild("Body3");
		this.body5 = this.Body3.getChild("body5");
		this.bone3 = this.body5.getChild("bone3");
		this.bone4 = this.body5.getChild("bone4");
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

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -18.6F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(89, 0).addBox(1.565F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.3978F, -12.6046F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 88).addBox(1.565F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.2235F, -14.597F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 88).addBox(1.565F, -1.625F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.0513F, -16.5645F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-0.9326F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.5732F, 0.089F, -0.3765F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-2.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.4846F, 0.3129F, -0.811F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-5.2995F, -1.6646F, -0.3319F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7948F, -12.1362F, 0.2923F, 0.4748F, -1.3019F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.4085F, 0.0343F, -0.5169F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.3557F, 0.1926F, -0.9735F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-3.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.2337F, 0.3102F, -1.4545F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.5013F, 0.2308F, -0.6125F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.3501F, 0.4094F, -1.0831F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 51).mirror().addBox(-1.336F, -0.1669F, -1.1426F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 1.5133F, -13.4959F, 0.302F, -0.7346F, 0.4283F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.9654F, 0.2867F, -1.3474F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 1.5133F, -13.4959F, -0.1436F, -0.3962F, 0.5013F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2744F, 2.0063F, -14.2447F, -0.1518F, -0.4452F, 0.5227F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2998F, 2.023F, -14.0642F, -0.0939F, -0.3458F, 0.4831F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.325F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3564F, 1.5572F, -15.1546F, -0.1866F, 0.1887F, -0.0354F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 0).addBox(-0.675F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7564F, 1.5572F, -15.1546F, -0.1866F, -0.1887F, 0.0354F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6998F, 2.023F, -14.0642F, -0.0939F, 0.3458F, -0.4831F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6744F, 2.0063F, -14.2447F, -0.1518F, 0.4452F, -0.5227F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 35).addBox(-0.0347F, 0.2867F, -1.3474F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.1436F, 0.3962F, -0.5013F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 51).addBox(0.336F, -0.1669F, -1.1426F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, 0.302F, 0.7346F, -0.4283F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 12).addBox(-1.4643F, -0.1546F, -2.2226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 31).addBox(-1.9643F, 0.289F, -3.9983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 1.5133F, -13.4959F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 28).addBox(0.065F, 0.25F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 70).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.3501F, -0.4094F, 1.0831F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(86, 12).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.5013F, -0.2308F, 0.6125F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(75, 17).addBox(2.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.2337F, -0.3102F, 1.4545F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 47).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.3557F, -0.1926F, 0.9735F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 64).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.4085F, -0.0343F, 0.5169F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 8).addBox(2.2995F, -1.6646F, -0.3319F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.2923F, -0.4748F, 1.3019F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 64).addBox(0.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.4846F, -0.3129F, 0.811F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(22, 37).addBox(-0.0674F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.7948F, -12.1362F, 0.5732F, -0.089F, 0.3765F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -2.6493F, -16.3944F, -0.025F, -0.1745F, 0.0043F));

		PartDefinition cube_r33 = Neck.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 88).addBox(1.065F, -1.4F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 0).addBox(0.565F, 0.05F, 3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Neck.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-2.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.0455F, -1.7417F, 0.5874F, 0.9016F, -0.7987F));

		PartDefinition cube_r35 = Neck.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 70).addBox(0.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.0455F, -1.7417F, 0.5874F, -0.9016F, 0.7987F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.2357F, -0.1736F, 0.0182F));

		PartDefinition cube_r36 = Neck2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 25).addBox(0.565F, 0.05F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(88, 59).addBox(1.065F, -1.25F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 70).addBox(1.065F, -0.925F, 2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Neck2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-1.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -0.7596F, 0.6566F, 0.9726F, -0.7128F));

		PartDefinition cube_r38 = Neck2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-1.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -2.7596F, 0.4096F, 0.8776F, -1.218F));

		PartDefinition cube_r39 = Neck2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(88, 57).addBox(0.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -2.7596F, 0.4096F, -0.8776F, 1.218F));

		PartDefinition cube_r40 = Neck2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(88, 55).addBox(0.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -0.7596F, 0.6566F, -0.9726F, 0.7128F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5975F, -4.5511F, 0.2779F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(56, 60).addBox(-2.235F, -1.3983F, 0.0096F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -1.0572F, -9.3024F, 1.4046F, 0.0642F, -0.0126F));

		PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-2.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(51, 10).addBox(0.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(51, 10).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.065F, 0.0115F, -1.5027F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -3.0F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -0.7432F, -2.9451F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 62).addBox(-0.46F, -0.775F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.025F, -2.5574F, -12.2356F, 3.0849F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(47, 52).addBox(-1.935F, -0.825F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.5287F, -12.0377F, -2.7969F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 81).addBox(-1.435F, -0.775F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, -2.5287F, -12.0377F, -2.8318F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(61, 78).addBox(-1.435F, -0.75F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(51, 15).addBox(-1.935F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.5326F, -12.2392F, 2.9976F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 13).addBox(-1.935F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.5875F, -12.8367F, 3.05F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 59).addBox(-0.993F, -0.007F, -0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.575F, -3.0467F, -10.6567F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 68).addBox(-2.235F, 0.3409F, 1.1165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.8F, -1.0572F, -9.3024F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 80).addBox(-1.01F, 0.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.575F, -3.1622F, -9.6432F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(78, 56).addBox(-1.01F, 0.01F, -1.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.575F, -3.0999F, -8.6251F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(66, 80).addBox(-2.235F, -2.0092F, 0.327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8F, -1.0572F, -9.3024F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 50).addBox(-1.435F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.9957F, -6.6279F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 53).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.565F, -2.8714F, -4.8873F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 44).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.565F, -2.9933F, -5.8799F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(60, 43).addBox(-1.0F, -1.0F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.975F, -6.202F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(76, 73).addBox(-0.935F, 0.05F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -2.4203F, -2.7951F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -0.975F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, -1.3324F, -2.6572F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(70, 70).addBox(-0.935F, -0.075F, -1.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.7738F, -0.6243F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.904F, -1.3663F, -1.6664F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 66).addBox(-1.0351F, -2.1999F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, -0.0484F, 0.1048F, -0.0029F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 86).addBox(-1.0351F, -2.0055F, -2.391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, -0.1487F, 0.1048F, -0.0029F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(66, 80).addBox(-2.1403F, -2.2907F, -2.3525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, -0.0087F, 0.0349F, -0.0005F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 50).addBox(-2.0226F, -2.2451F, -1.5831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, -0.0439F, 0.1133F, -0.0057F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(80, 68).addBox(-1.9585F, 0.2633F, 1.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.4043F, 0.0502F, -0.0173F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 80).addBox(-1.01F, 0.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.129F, -1.7959F, -7.9768F, -1.457F, 0.1219F, 0.0095F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 56).addBox(-1.01F, 0.01F, -1.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.079F, -1.7336F, -6.9587F, -0.0611F, -0.0008F, -0.0131F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 86).addBox(-1.0351F, 2.2071F, -2.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, -1.6322F, 0.1048F, -0.0029F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(30, 86).addBox(-1.0035F, 1.3341F, -0.7146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, -3.0331F, 0.1747F, -0.0029F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 86).addBox(-1.1194F, 0.4702F, 0.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.976F, 0.1747F, -0.0029F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(86, 9).addBox(-1.0035F, -0.5905F, 1.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.976F, 0.1747F, -0.0029F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 68).addBox(-1.0586F, 0.2F, 0.7078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.5829F, 0.1691F, -0.0156F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(31, 68).addBox(-1.1194F, 0.0575F, 0.7678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.6531F, 0.1747F, -0.0029F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(31, 68).addBox(-1.102F, 0.9593F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.2461F, 1.6531F, 0.1747F, -0.0029F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(31, 68).addBox(-1.0035F, 0.2563F, 0.917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.6533F, 0.1048F, -0.0029F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 60).addBox(0.3222F, 5.2285F, 0.1509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.2741F, 0.1265F, 0.0F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 8).addBox(0.3154F, 4.1663F, -1.4142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.5794F, 0.1091F, -0.0006F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 64).addBox(0.0216F, 1.6755F, -5.3484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 2.7576F, 0.1789F, 0.0F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(7, 56).addBox(0.0216F, 3.3371F, -2.4655F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.8413F, 0.1789F, 0.0F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 81).addBox(0.4722F, -8.6945F, 0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.6057F, 0.1265F, 0.0F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 56).addBox(0.4722F, -1.038F, 6.0321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -0.144F, 0.1265F, 0.0F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 81).addBox(0.4722F, -7.5672F, 0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(56, 78).addBox(0.4722F, -7.9672F, 0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.5839F, 0.1265F, 0.0F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 73).addBox(0.4722F, -5.2634F, -6.138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.5656F, 0.1265F, 0.0F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(58, 66).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1737F, 1.3175F, 1.3038F, 2.8449F, 0.1265F, 0.0F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 46).addBox(0.4722F, -2.1597F, -7.6128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.9147F, 0.1265F, 0.0F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 82).addBox(0.4722F, -7.0099F, -3.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.0857F, 0.1265F, 0.0F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(20, 78).addBox(0.4722F, -7.2123F, -4.3425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.2602F, 0.1265F, 0.0F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(9, 47).addBox(-2.4F, -0.2F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3201F, -0.7886F, -1.325F, -0.1358F, 0.0101F, 0.0703F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(11, 9).addBox(-0.8F, -0.675F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.108F))
				.texOffs(11, 9).addBox(-0.8F, -0.675F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8593F, 0.2539F, -0.1703F, -2.5347F, -0.9658F, 2.6992F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(38, 10).addBox(-1.3F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.2858F, 0.0333F, -0.1772F, -0.3306F, -0.0347F, 0.0884F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(38, 10).addBox(-1.05F, -0.675F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8593F, 0.2539F, -0.1703F, -0.3459F, 0.295F, -0.0279F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(68, 16).addBox(-1.825F, -0.1F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.366F, -0.6232F, -0.6172F, -0.3545F, -0.3638F, 0.2074F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(15, 78).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3665F, -0.2187F, -0.933F, -0.3714F, 0.3485F, -0.0084F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 84).addBox(-1.0094F, 1.4953F, -0.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.654F, 0.6133F, -8.6211F, -2.79F, 0.2641F, 0.0791F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 3).addBox(-1.2868F, 0.8939F, -1.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.854F, 0.6133F, -10.4211F, -2.79F, 0.2641F, 0.0791F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(10, 78).addBox(-1.1448F, 1.0109F, -0.2987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.854F, 0.6133F, -10.4211F, 3.084F, 0.183F, -0.0075F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 78).addBox(-0.9532F, 1.0109F, 0.3856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.854F, 0.6133F, -10.4211F, 3.0759F, 0.5315F, -0.0304F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(71, 74).addBox(-0.475F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.839F, -0.2641F, -5.0708F, -1.9211F, 0.2342F, -0.0846F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 78).addBox(0.4972F, -7.1971F, -1.8838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(71, 77).addBox(0.4972F, -6.4971F, -1.8838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.9024F, 0.1265F, 0.0F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 77).addBox(0.4972F, -5.5317F, -2.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.0769F, 0.1265F, 0.0F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 36).addBox(0.4972F, -5.5035F, -4.8317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.3824F, 0.1265F, 0.0F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(10, 84).addBox(0.6514F, -1.6092F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 0.5603F, 1.2449F, -0.9142F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 66).addBox(-0.9613F, -1.4414F, -0.6349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.3744F, 0.2138F, 0.0F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(7, 65).addBox(-0.9966F, -0.6331F, -0.7333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.3744F, 0.1571F, 0.0F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(60, 54).addBox(-0.9125F, -1.6075F, -1.0862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.3744F, 0.1571F, 0.0F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(46, 56).addBox(-0.9125F, -0.8582F, -1.0216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.4181F, 0.1571F, 0.0F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0059F, -3.3068F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.804F, 0.6133F, -5.0461F, 1.3134F, 0.0873F, 0.0F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 59).addBox(-0.9328F, 0.296F, -1.4787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.313F, 0.1515F, -0.0126F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(60, 4).addBox(-0.9078F, 1.2834F, -1.5614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.4177F, 0.1515F, -0.0126F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(39, 56).addBox(-0.425F, -0.5F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1328F, 3.2641F, -5.2368F, 1.4181F, 0.1047F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(67, 4).addBox(0.177F, 1.2442F, -1.0637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.2435F, 0.1789F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(77, 50).addBox(-0.9827F, -0.4726F, 0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(27, 77).addBox(-0.9827F, -0.6976F, 0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.4181F, 0.1396F, 0.0F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(67, 8).addBox(-0.966F, 0.223F, 0.1428F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.5752F, 0.0672F, -0.0346F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(72, 32).addBox(-1.0061F, -0.1767F, -0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.2685F, 0.113F, -0.0489F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 47).addBox(-0.0243F, -0.8139F, 0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(77, 40).addBox(-0.0243F, -0.8139F, 0.4866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0344F, -0.8649F, -3.9174F, -0.2052F, 0.0097F, 0.1771F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(42, 77).addBox(0.1928F, -3.3573F, -1.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(37, 77).addBox(-0.0222F, -3.3971F, -1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.6406F, 0.1789F, 0.0F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 86).addBox(0.1523F, -3.3016F, -0.8518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.8588F, 0.1789F, 0.0F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(12, 74).addBox(0.1523F, -2.3941F, 1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -0.5061F, 0.1789F, 0.0F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 23).addBox(0.1523F, 0.414F, 1.4233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 0.4538F, 0.1789F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 20).addBox(0.1523F, 1.3405F, 0.6137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(74, 4).addBox(0.1523F, 2.4696F, 0.9724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.2392F, 0.1789F, 0.0F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 17).addBox(0.1523F, 1.7768F, -1.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 2.5045F, 0.1789F, 0.0F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(26, 68).addBox(0.1523F, -2.3572F, -3.6775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.7314F, 0.1789F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(85, 14).addBox(0.1523F, -3.0459F, -3.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -1.946F, 0.1789F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 39).addBox(0.1523F, -3.9855F, 1.3386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -0.8116F, 0.1789F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 36).addBox(0.1523F, 1.0567F, 3.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 0.4974F, 0.1789F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(84, 65).addBox(0.1523F, 2.3522F, -3.2091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 2.2427F, 0.1789F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 68).addBox(0.1523F, -1.2403F, -3.892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -3.0805F, 0.1789F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 6).addBox(-0.3058F, -0.7058F, 0.151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.6644F, -0.5311F, -3.6651F, 2.4975F, 0.5391F, -0.3685F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 80).addBox(-0.3985F, -0.5519F, -0.6721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.6644F, -0.5311F, -3.6651F, 1.1023F, 0.3342F, -0.254F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 77).addBox(-0.3546F, -0.2956F, -0.2927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.6644F, -0.5311F, -3.6651F, 0.1458F, 0.0225F, -0.1736F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 37).addBox(-0.3546F, -1.0508F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.6644F, -0.5311F, -3.6651F, -0.8142F, 0.0225F, -0.1736F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(77, 34).addBox(-0.8968F, -0.1077F, -0.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3512F, -1.4753F, -4.2726F, -0.0878F, 0.6405F, 0.0856F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(32, 77).addBox(-0.1881F, -0.7857F, -0.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0344F, -0.8649F, -3.9174F, -0.1304F, 0.3652F, 0.1301F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 53).addBox(-0.7746F, -0.2004F, -1.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3512F, -1.4753F, -4.2726F, -0.0058F, 0.7783F, 0.0257F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 71).addBox(-0.6472F, -1.2238F, 1.1441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.6101F, 0.3534F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 83).addBox(-0.52F, -0.4623F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.4702F, -0.1764F, -11.6706F, -1.837F, 0.0131F, 0.0F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(83, 62).addBox(-0.52F, -0.8262F, 0.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.4702F, -0.1764F, -11.6706F, 0.7374F, 0.0131F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(67, 83).addBox(-0.52F, -1.0228F, -0.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.4702F, -0.1764F, -11.6706F, -0.5716F, 0.0131F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(81, 83).addBox(-0.52F, -0.4623F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8702F, -0.1764F, -11.6706F, -1.837F, 0.0131F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 83).addBox(-0.52F, -1.0228F, -0.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8702F, -0.1764F, -11.6706F, -0.5716F, 0.0131F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(84, 0).addBox(-1.4389F, -1.308F, 0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.4692F, -0.1085F, 0.1074F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8307F, -1.0256F, -11.0587F, 1.4796F, 0.0135F, 0.008F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 84).addBox(-1.4481F, -1.4983F, 1.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.4792F, 0.1004F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(83, 62).addBox(-0.52F, -0.8262F, 0.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8702F, -0.1764F, -11.6706F, 0.7374F, 0.0131F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(62, 83).addBox(-1.4957F, 0.8761F, -1.0662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -1.8194F, -0.1101F, 0.119F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 59).addBox(-1.4957F, -0.9568F, -2.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -0.554F, -0.1101F, 0.119F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(83, 56).addBox(-1.4957F, -2.1445F, -0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 0.755F, -0.1101F, 0.119F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(57, 81).addBox(-0.6137F, -2.3057F, -0.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 0.7374F, 0.3883F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 81).addBox(-0.6137F, -0.8949F, -2.2171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -0.5716F, 0.3883F, 0.0F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(20, 81).addBox(-0.6137F, 1.0697F, -1.0624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -1.837F, 0.3883F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(81, 74).addBox(-0.7468F, 0.3367F, 0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 3.0063F, 0.3534F, 0.0F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(74, 0).addBox(-0.8831F, -1.0457F, -1.9561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -1.6624F, 0.1396F, 0.0F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(15, 81).addBox(-0.7468F, 0.9516F, -0.8165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, -2.4042F, 0.3534F, 0.0F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 31).addBox(-0.9827F, -0.7417F, 0.5262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.404F, 0.6133F, -10.3461F, 1.5664F, 0.1396F, 0.0F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(77, 8).addBox(-0.9855F, -1.3386F, 0.4014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.4355F, 0.1745F, 0.0F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(53, 40).addBox(-1.154F, 1.2352F, 0.0452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.4403F, 0.2417F, -0.0353F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(53, 40).addBox(-1.154F, 0.3602F, 0.2202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.104F, 0.3091F, -7.636F, 1.0913F, 0.2417F, -0.0353F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(72, 8).addBox(-0.9855F, -1.1724F, 0.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.3919F, 0.1745F, 0.0F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(72, 8).addBox(-0.9855F, -0.1724F, 0.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.204F, 0.6133F, -8.5461F, 1.3919F, 0.1047F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(53, 35).addBox(0.0029F, -0.0493F, -0.0754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.069F, 0.1789F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(73, 60).addBox(0.0029F, -2.2644F, -0.9468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, -2.1162F, 0.1789F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(81, 11).addBox(0.0029F, -0.6374F, -3.1734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 2.858F, 0.1789F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(49, 60).addBox(0.0029F, 2.8349F, -1.5622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6387F, 1.1654F, -5.2391F, 1.5926F, 0.1789F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(31, 45).addBox(-0.4385F, -0.9665F, -3.7991F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2164F, 1.1343F, 1.8996F, -0.5697F, 1.0012F, -0.3106F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(82, 30).addBox(-1.3385F, -0.9665F, 0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.65F, 0.2F, -0.4999F, 1.0012F, -0.3106F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(37, 64).addBox(-0.3404F, -0.3817F, -1.3404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.3576F, 0.2262F, 0.0402F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 83).addBox(-1.05F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.664F, -1.1567F, -1.7473F, -0.0644F, -0.2359F, -1.3014F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(25, 83).addBox(-0.9F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.829F, -1.6113F, -4.7033F, 0.0046F, 0.0522F, -1.4834F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(68, 53).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.864F, -1.5051F, -3.2209F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 82).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.82F, -1.5652F, -3.7173F, 1.5601F, -0.1217F, -1.4829F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(82, 49).addBox(-1.01F, -1.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.8731F, -1.2884F, -2.2344F, 3.0892F, 1.1872F, -1.5344F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 83).addBox(-1.01F, -0.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.8731F, -1.2884F, -2.2344F, -3.1067F, 1.1872F, -1.5344F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 83).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.842F, -1.3941F, -2.7303F, 3.1215F, -0.226F, -1.4812F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(82, 33).addBox(-0.323F, -0.9665F, 0.0264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(76, 76).addBox(-0.323F, -0.9665F, 0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.65F, 0.2F, -0.2682F, 0.2218F, 0.0601F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.7741F, -1.3663F, -1.6664F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(0.0351F, -2.1999F, -1.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, -0.0484F, -0.1048F, 0.0029F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(0.0351F, -2.0055F, -2.391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, -0.1487F, -0.1048F, 0.0029F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(1.1403F, -2.2907F, -2.3525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, -0.0087F, -0.0349F, 0.0005F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(1.0226F, -2.2451F, -1.5831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, -0.0439F, -0.1133F, 0.0057F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(0.9585F, 0.2633F, 1.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.4043F, -0.0502F, 0.0173F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(0.01F, 0.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.129F, -1.7959F, -7.9768F, -1.457F, -0.1219F, -0.0095F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(78, 56).mirror().addBox(0.01F, 0.01F, -1.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.079F, -1.7336F, -6.9587F, -0.0611F, 0.0008F, 0.0131F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(0.0351F, 2.2071F, -2.2063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, -1.6322F, -0.1048F, 0.0029F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(0.0035F, 1.3341F, -0.7146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, -3.0331F, -0.1747F, 0.0029F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(0.1194F, 0.4702F, 0.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.976F, -0.1747F, 0.0029F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(0.0035F, -0.5905F, 1.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.976F, -0.1747F, 0.0029F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(0.0586F, 0.2F, 0.7078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.5829F, -0.1691F, 0.0156F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(31, 68).mirror().addBox(0.1194F, 0.0575F, 0.7678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.6531F, -0.1747F, 0.0029F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(31, 68).mirror().addBox(0.102F, 0.9593F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.2461F, 1.6531F, -0.1747F, 0.0029F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(31, 68).mirror().addBox(0.0035F, 0.2563F, 0.917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.6533F, -0.1048F, 0.0029F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-1.3222F, 5.2285F, 0.1509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.2741F, -0.1265F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-1.3154F, 4.1663F, -1.4142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.5794F, -0.1091F, 0.0006F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(44, 64).mirror().addBox(-1.0216F, 1.6755F, -5.3484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 2.7576F, -0.1789F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-1.0216F, 3.3371F, -2.4655F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.8413F, -0.1789F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-1.4722F, -8.6945F, 0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.6057F, -0.1265F, 0.0F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-1.4722F, -1.038F, 6.0321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -0.144F, -0.1265F, 0.0F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-1.4722F, -7.5672F, 0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(56, 78).mirror().addBox(-1.4722F, -7.9672F, 0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.5839F, -0.1265F, 0.0F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(-1.4722F, -5.2634F, -6.138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.5656F, -0.1265F, 0.0F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 1.3175F, 1.3038F, 2.8449F, -0.1265F, 0.0F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-1.4722F, -2.1597F, -7.6128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.9147F, -0.1265F, 0.0F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-1.4722F, -7.0099F, -3.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.0857F, -0.1265F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-1.4722F, -7.2123F, -4.3425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.2602F, -0.1265F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(-0.6F, -0.2F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3201F, -0.7886F, -1.325F, -0.1358F, -0.0101F, -0.0703F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(11, 9).mirror().addBox(-1.2F, -0.675F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(11, 9).mirror().addBox(-1.2F, -0.675F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8593F, 0.2539F, -0.1703F, -2.5347F, 0.9658F, -2.6992F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-0.7F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.2858F, 0.0333F, -0.1772F, -0.3306F, 0.0347F, -0.0884F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-0.95F, -0.675F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8593F, 0.2539F, -0.1703F, -0.3459F, -0.295F, 0.0279F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(68, 16).mirror().addBox(-0.175F, -0.1F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.366F, -0.6232F, -0.6172F, -0.3545F, 0.3638F, -0.2074F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3665F, -0.2187F, -0.933F, -0.3714F, -0.3485F, 0.0084F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(0.0094F, 1.4953F, -0.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.654F, 0.6133F, -8.6211F, -2.79F, -0.2641F, -0.0791F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.2868F, 0.8939F, -1.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.854F, 0.6133F, -10.4211F, -2.79F, -0.2641F, -0.0791F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.1448F, 1.0109F, -0.2987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.854F, 0.6133F, -10.4211F, 3.084F, -0.183F, 0.0075F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.0468F, 1.0109F, 0.3856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.854F, 0.6133F, -10.4211F, 3.0759F, -0.5315F, 0.0304F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.525F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.839F, -0.2641F, -5.0708F, -1.9211F, -0.2342F, 0.0846F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.4972F, -7.1971F, -1.8838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(71, 77).mirror().addBox(-1.4972F, -6.4971F, -1.8838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.9024F, -0.1265F, 0.0F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-1.4972F, -5.5317F, -2.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.0769F, -0.1265F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-1.4972F, -5.5035F, -4.8317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.3824F, -0.1265F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-1.6514F, -1.6092F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 0.5603F, -1.2449F, 0.9142F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-0.0387F, -1.4414F, -0.6349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.3744F, -0.2138F, 0.0F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.0034F, -0.6331F, -0.7333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.3744F, -0.1571F, 0.0F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-0.0875F, -1.6075F, -1.0862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.3744F, -0.1571F, 0.0F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(46, 56).mirror().addBox(-0.0875F, -0.8582F, -1.0216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.4181F, -0.1571F, 0.0F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.0059F, -3.3068F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.804F, 0.6133F, -5.0461F, 1.3134F, -0.0873F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-0.0672F, 0.296F, -1.4787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.313F, -0.1515F, 0.0126F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.0922F, 1.2834F, -1.5614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.4177F, -0.1515F, 0.0126F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(39, 56).mirror().addBox(-0.575F, -0.5F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1328F, 3.2641F, -5.2368F, 1.4181F, -0.1047F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-1.177F, 1.2442F, -1.0637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.2435F, -0.1789F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.0173F, -0.4726F, 0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(27, 77).mirror().addBox(-0.0173F, -0.6976F, 0.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.4181F, -0.1396F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-0.034F, 0.223F, 0.1428F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.5752F, -0.0672F, 0.0346F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(0.0061F, -0.1767F, -0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.2685F, -0.113F, 0.0489F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.9757F, -0.8139F, 0.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 40).mirror().addBox(-0.9757F, -0.8139F, 0.4866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0344F, -0.8649F, -3.9174F, -0.2052F, -0.0097F, -0.1771F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(42, 77).mirror().addBox(-1.1928F, -3.3573F, -1.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(37, 77).mirror().addBox(-0.9778F, -3.3971F, -1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.6406F, -0.1789F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-1.1523F, -3.3016F, -0.8518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.8588F, -0.1789F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(12, 74).mirror().addBox(-1.1523F, -2.3941F, 1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -0.5061F, -0.1789F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-1.1523F, 0.414F, 1.4233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 0.4538F, -0.1789F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-1.1523F, 1.3405F, 0.6137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(74, 4).mirror().addBox(-1.1523F, 2.4696F, 0.9724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.2392F, -0.1789F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-1.1523F, 1.7768F, -1.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 2.5045F, -0.1789F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(26, 68).mirror().addBox(-1.1523F, -2.3572F, -3.6775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.7314F, -0.1789F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-1.1523F, -3.0459F, -3.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -1.946F, -0.1789F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-1.1523F, -3.9855F, 1.3386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -0.8116F, -0.1789F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-1.1523F, 1.0567F, 3.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 0.4974F, -0.1789F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.1523F, 2.3522F, -3.2091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 2.2427F, -0.1789F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-1.1523F, -1.2403F, -3.892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -3.0805F, -0.1789F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-0.6942F, -0.7058F, 0.151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.6644F, -0.5311F, -3.6651F, 2.4975F, -0.5391F, 0.3685F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(81, 80).mirror().addBox(-0.6015F, -0.5519F, -0.6721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.6644F, -0.5311F, -3.6651F, 1.1023F, -0.3342F, 0.254F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(81, 77).mirror().addBox(-0.6454F, -0.2956F, -0.2927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.6644F, -0.5311F, -3.6651F, 0.1458F, -0.0225F, 0.1736F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.6454F, -1.0508F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.6644F, -0.5311F, -3.6651F, -0.8142F, -0.0225F, 0.1736F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.1032F, -0.1077F, -0.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3512F, -1.4753F, -4.2726F, -0.0878F, -0.6405F, -0.0856F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(32, 77).mirror().addBox(-0.8119F, -0.7857F, -0.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0344F, -0.8649F, -3.9174F, -0.1304F, -0.3652F, -0.1301F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.2254F, -0.2004F, -1.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3512F, -1.4753F, -4.2726F, -0.0058F, -0.7783F, -0.0257F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-0.3528F, -1.2238F, 1.1441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.6101F, -0.3534F, 0.0F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-0.48F, -0.4623F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.4702F, -0.1764F, -11.6706F, -1.837F, -0.0131F, 0.0F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(83, 62).mirror().addBox(-0.48F, -0.8262F, 0.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.4702F, -0.1764F, -11.6706F, 0.7374F, -0.0131F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(-0.48F, -1.0228F, -0.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.4702F, -0.1764F, -11.6706F, -0.5716F, -0.0131F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-0.48F, -0.4623F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.8702F, -0.1764F, -11.6706F, -1.837F, -0.0131F, 0.0F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(-0.48F, -1.0228F, -0.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.8702F, -0.1764F, -11.6706F, -0.5716F, -0.0131F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(0.4389F, -1.308F, 0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.4692F, 0.1085F, -0.1074F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.8307F, -1.0256F, -11.0587F, 1.4796F, -0.0135F, -0.008F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(0.4481F, -1.4983F, 1.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.4792F, -0.1004F, 0.0F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(83, 62).mirror().addBox(-0.48F, -0.8262F, 0.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.8702F, -0.1764F, -11.6706F, 0.7374F, -0.0131F, 0.0F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(62, 83).mirror().addBox(0.4957F, 0.8761F, -1.0662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -1.8194F, 0.1101F, -0.119F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(83, 59).mirror().addBox(0.4957F, -0.9568F, -2.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -0.554F, 0.1101F, -0.119F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(0.4957F, -2.1445F, -0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 0.755F, 0.1101F, -0.119F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(57, 81).mirror().addBox(-0.3863F, -2.3057F, -0.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 0.7374F, -0.3883F, 0.0F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(52, 81).mirror().addBox(-0.3863F, -0.8949F, -2.2171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -0.5716F, -0.3883F, 0.0F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.3863F, 1.0697F, -1.0624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -1.837F, -0.3883F, 0.0F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-0.2532F, 0.3367F, 0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 3.0063F, -0.3534F, 0.0F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.1169F, -1.0457F, -1.9561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -1.6624F, -0.1396F, 0.0F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.2532F, 0.9516F, -0.8165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, -2.4042F, -0.3534F, 0.0F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.0173F, -0.7417F, 0.5262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.404F, 0.6133F, -10.3461F, 1.5664F, -0.1396F, 0.0F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(-0.0145F, -1.3386F, 0.4014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.4355F, -0.1745F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(0.154F, 1.2352F, 0.0452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.4403F, -0.2417F, 0.0353F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(0.154F, 0.3602F, 0.2202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.104F, 0.3091F, -7.636F, 1.0913F, -0.2417F, 0.0353F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.0145F, -1.1724F, 0.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.3919F, -0.1745F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.0145F, -0.1724F, 0.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.204F, 0.6133F, -8.5461F, 1.3919F, -0.1047F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-1.0029F, -0.0493F, -0.0754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.069F, -0.1789F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-1.0029F, -2.2644F, -0.9468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, -2.1162F, -0.1789F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(81, 11).mirror().addBox(-1.0029F, -0.6374F, -3.1734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 2.858F, -0.1789F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(-1.0029F, 2.8349F, -1.5622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6387F, 1.1654F, -5.2391F, 1.5926F, -0.1789F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(-0.5615F, -0.9665F, -3.7991F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2164F, 1.1343F, 1.8996F, -0.5697F, -1.0012F, 0.3106F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(0.3385F, -0.9665F, 0.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.65F, 0.2F, -0.4999F, -1.0012F, 0.3106F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.6596F, -0.3817F, -1.3404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.3576F, -0.2262F, -0.0402F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(0.05F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.664F, -1.1567F, -1.7473F, -0.0644F, 0.2359F, 1.3014F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.1F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.829F, -1.6113F, -4.7033F, 0.0046F, -0.0522F, 1.4834F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.864F, -1.5051F, -3.2209F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.82F, -1.5652F, -3.7173F, 1.5601F, 0.1217F, 1.4829F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(0.01F, -1.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.8731F, -1.2884F, -2.2344F, 3.0892F, -1.1872F, 1.5344F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(0.01F, -0.01F, 0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.8731F, -1.2884F, -2.2344F, -3.1067F, -1.1872F, 1.5344F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.842F, -1.3941F, -2.7303F, 3.1215F, 0.226F, 1.4812F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-0.677F, -0.9665F, 0.0264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(76, 76).mirror().addBox(-0.677F, -0.9665F, 0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.65F, 0.2F, -0.2682F, -0.2218F, -0.0601F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8174F, 0.8379F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Lowerjaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-0.1F, -0.1397F, -0.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, -0.0563F, 0.1209F, 0.096F, -0.017F, -0.0038F));

		PartDefinition cube_r290 = Lowerjaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-0.1F, -0.1413F, -1.9599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, 0.0187F, 0.1209F, -0.2618F, -0.0175F, 0.0F));

		PartDefinition cube_r291 = Lowerjaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0447F, 0.0396F, -3.894F, -1.4067F, -0.2797F, 0.006F));

		PartDefinition cube_r292 = Lowerjaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.594F, 0.5542F, 1.6639F, 0.5411F, -0.017F, -0.0038F));

		PartDefinition cube_r293 = Lowerjaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.56F, 0.8192F, -0.449F, 0.0087F, -0.0175F, 0.0F));

		PartDefinition cube_r294 = Lowerjaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-0.1F, -0.2224F, -2.3135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, 0.0187F, 0.1209F, 0.0873F, -0.0175F, 0.0F));

		PartDefinition cube_r295 = Lowerjaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.0651F, -1.8306F, -0.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(20, 84).mirror().addBox(-0.0651F, -2.4311F, -0.8893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, 1.8187F, -1.8791F, -0.0873F, -0.2094F, 0.0F));

		PartDefinition cube_r296 = Lowerjaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-0.7885F, -1.4107F, -1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 60).mirror().addBox(-0.7885F, -1.8357F, -1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2269F, -0.1265F, 0.0F));

		PartDefinition cube_r297 = Lowerjaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-0.7885F, -1.3618F, -2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(32, 56).mirror().addBox(-0.7885F, -2.2623F, -4.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(74, 44).mirror().addBox(-0.7885F, -1.8618F, -2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2618F, -0.1265F, 0.0F));

		PartDefinition cube_r298 = Lowerjaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(66, 74).mirror().addBox(-0.7885F, -2.3715F, -2.2262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(61, 62).mirror().addBox(-0.7885F, -2.3649F, -1.476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2182F, -0.1265F, 0.0F));

		PartDefinition cube_r299 = Lowerjaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(53, 56).mirror().addBox(-0.7885F, -1.3813F, -4.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.7885F, -1.9813F, -4.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2531F, -0.1265F, 0.0F));

		PartDefinition cube_r300 = Lowerjaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-0.7885F, -1.8055F, -5.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(61, 24).mirror().addBox(-0.7885F, -1.5953F, -6.954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(51, 66).mirror().addBox(-0.7885F, -1.5805F, -5.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2007F, -0.1265F, 0.0F));

		PartDefinition cube_r301 = Lowerjaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.7885F, -2.648F, -7.1802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(10, 52).mirror().addBox(-0.7885F, -2.248F, -7.2802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.1745F, -0.1265F, 0.0F));

		PartDefinition cube_r302 = Lowerjaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(-0.0894F, -0.5346F, -1.8695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, -0.1815F, -0.3184F, -0.0067F));

		PartDefinition cube_r303 = Lowerjaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-0.0894F, 0.4958F, -1.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, -0.8622F, -0.3184F, -0.0067F));

		PartDefinition cube_r304 = Lowerjaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-0.7885F, -2.7156F, -3.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 56).mirror().addBox(-0.7885F, -2.7656F, -4.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 60).mirror().addBox(-0.7885F, -2.8156F, -5.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.3927F, -0.1265F, 0.0F));

		PartDefinition cube_r305 = Lowerjaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(51, 72).mirror().addBox(-0.7885F, -3.2587F, -6.0723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.288F, -0.1265F, 0.0F));

		PartDefinition cube_r306 = Lowerjaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-0.7885F, -3.4717F, -6.9913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2356F, -0.1265F, 0.0F));

		PartDefinition cube_r307 = Lowerjaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(12, 70).mirror().addBox(-0.0747F, -1.6582F, -0.7658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, -0.1396F, -0.3185F, 0.0F));

		PartDefinition cube_r308 = Lowerjaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.0747F, -1.6199F, -1.6994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, -0.096F, -0.3185F, 0.0F));

		PartDefinition cube_r309 = Lowerjaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-0.7885F, -2.4699F, -5.7136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2701F, 1.6937F, -6.2791F, -0.2094F, -0.1265F, 0.0F));

		PartDefinition cube_r310 = Lowerjaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.5774F, 1.0692F, 0.8069F, -0.8115F, -0.017F, -0.0038F));

		PartDefinition cube_r311 = Lowerjaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.5481F, 1.8131F, -1.1338F, -1.3875F, -0.0175F, 0.0F));

		PartDefinition cube_r312 = Lowerjaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.5618F, 1.6673F, -0.3473F, -2.6965F, -0.0175F, 0.0F));

		PartDefinition cube_r313 = Lowerjaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(-0.0651F, 0.2725F, -2.5327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, 1.8187F, -1.8791F, -1.4835F, -0.2094F, 0.0F));

		PartDefinition cube_r314 = Lowerjaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.0651F, -1.8007F, -2.7548F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9701F, 1.8187F, -1.8791F, -0.1222F, -0.2094F, 0.0F));

		PartDefinition cube_r315 = Lowerjaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(18, 54).mirror().addBox(-0.1F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4008F, 0.6912F, -4.3891F, -0.1935F, -0.2437F, 0.0069F));

		PartDefinition cube_r316 = Lowerjaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(86, 83).mirror().addBox(-0.0894F, -0.2525F, 0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, -2.2149F, -0.3184F, -0.0067F));

		PartDefinition cube_r317 = Lowerjaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.0894F, -1.3301F, -0.4946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(87, 35).mirror().addBox(-0.0894F, -0.7301F, -0.0946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, -1.6074F, -12.9378F, 2.9339F, -0.3184F, -0.0067F));

		PartDefinition cube_r318 = Lowerjaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-0.0894F, -0.5346F, -0.0945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.5982F, -1.9315F, -14.596F, -0.1734F, 0.1113F, -0.0836F));

		PartDefinition cube_r319 = Lowerjaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(42, 60).addBox(-0.2115F, -1.8357F, -1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F))
				.texOffs(35, 60).addBox(-0.2115F, -1.4107F, -1.492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2269F, 0.1265F, 0.0F));

		PartDefinition cube_r320 = Lowerjaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(61, 62).addBox(-0.2115F, -2.3649F, -1.476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(66, 74).addBox(-0.2115F, -2.3715F, -2.2262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2182F, 0.1265F, 0.0F));

		PartDefinition cube_r321 = Lowerjaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(62, 28).addBox(-0.2115F, -2.4699F, -5.7136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2094F, 0.1265F, 0.0F));

		PartDefinition cube_r322 = Lowerjaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(7, 69).addBox(-0.9253F, -1.6199F, -1.6994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, -0.096F, 0.3185F, 0.0F));

		PartDefinition cube_r323 = Lowerjaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(12, 70).addBox(-0.9253F, -1.6582F, -0.7658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, -0.1396F, 0.3185F, 0.0F));

		PartDefinition cube_r324 = Lowerjaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(69, 28).addBox(-0.2115F, -3.4717F, -6.9913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2356F, 0.1265F, 0.0F));

		PartDefinition cube_r325 = Lowerjaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 72).addBox(-0.2115F, -3.2587F, -6.0723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.288F, 0.1265F, 0.0F));

		PartDefinition cube_r326 = Lowerjaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(68, 60).addBox(-0.2115F, -2.8156F, -5.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 56).addBox(-0.2115F, -2.7656F, -4.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 24).addBox(-0.2115F, -2.7156F, -3.2395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.3927F, 0.1265F, 0.0F));

		PartDefinition cube_r327 = Lowerjaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(32, 56).addBox(-0.2115F, -2.2623F, -4.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(74, 44).addBox(-0.2115F, -1.8618F, -2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(36, 22).addBox(-0.2115F, -1.3618F, -2.3099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2618F, 0.1265F, 0.0F));

		PartDefinition cube_r328 = Lowerjaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(87, 35).addBox(-0.9106F, -0.7301F, -0.0946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(87, 35).addBox(-0.9106F, -1.3301F, -0.4946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, 2.9339F, 0.3184F, 0.0067F));

		PartDefinition cube_r329 = Lowerjaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(86, 83).addBox(-0.9106F, -0.2525F, 0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, -2.2149F, 0.3184F, 0.0067F));

		PartDefinition cube_r330 = Lowerjaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(87, 32).addBox(-0.9106F, 0.4958F, -1.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, -0.8622F, 0.3184F, 0.0067F));

		PartDefinition cube_r331 = Lowerjaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(61, 40).addBox(-0.9106F, -0.5346F, -0.0945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.7282F, -1.9315F, -14.596F, -0.1734F, -0.1113F, 0.0836F));

		PartDefinition cube_r332 = Lowerjaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(60, 39).addBox(-0.9106F, -0.5346F, -1.8695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.2725F, -1.6074F, -12.9378F, -0.1815F, 0.3184F, 0.0067F));

		PartDefinition cube_r333 = Lowerjaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(10, 52).addBox(-0.2115F, -2.248F, -7.2802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F))
				.texOffs(61, 58).addBox(-0.2115F, -2.648F, -7.1802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.1745F, 0.1265F, 0.0F));

		PartDefinition cube_r334 = Lowerjaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(61, 24).addBox(-0.2115F, -1.5953F, -6.954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(51, 66).addBox(-0.2115F, -1.5805F, -5.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(60, 35).addBox(-0.2115F, -1.8055F, -5.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2007F, 0.1265F, 0.0F));

		PartDefinition cube_r335 = Lowerjaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 59).addBox(-0.2115F, -1.9813F, -4.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F))
				.texOffs(53, 56).addBox(-0.2115F, -1.3813F, -4.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 1.6937F, -6.2791F, -0.2531F, 0.1265F, 0.0F));

		PartDefinition cube_r336 = Lowerjaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(18, 54).addBox(-0.9F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5308F, 0.6912F, -4.3891F, -0.1935F, 0.2437F, -0.0069F));

		PartDefinition cube_r337 = Lowerjaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 54).addBox(-0.9349F, -1.8007F, -2.7548F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1F, 1.8187F, -1.8791F, -0.1222F, 0.2094F, 0.0F));

		PartDefinition cube_r338 = Lowerjaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(72, 49).addBox(-0.9349F, -1.8306F, -0.9577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(20, 84).addBox(-0.9349F, -2.4311F, -0.8893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1F, 1.8187F, -1.8791F, -0.0873F, 0.2094F, 0.0F));

		PartDefinition cube_r339 = Lowerjaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 42).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.6918F, 1.6673F, -0.3473F, -2.6965F, 0.0175F, 0.0F));

		PartDefinition cube_r340 = Lowerjaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(84, 26).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.678F, 1.8131F, -1.1338F, -1.3875F, 0.0175F, 0.0F));

		PartDefinition cube_r341 = Lowerjaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(72, 40).addBox(-0.9F, -0.2224F, -2.3135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(3.1F, 0.0187F, 0.1209F, 0.0873F, 0.0175F, 0.0F));

		PartDefinition cube_r342 = Lowerjaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(61, 20).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.69F, 0.8192F, -0.449F, 0.0087F, 0.0175F, 0.0F));

		PartDefinition cube_r343 = Lowerjaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.7074F, 1.0692F, 0.8069F, -0.8115F, 0.017F, 0.0038F));

		PartDefinition cube_r344 = Lowerjaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7239F, 0.5542F, 1.6639F, 0.5411F, 0.017F, 0.0038F));

		PartDefinition cube_r345 = Lowerjaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.1747F, 0.0396F, -3.894F, -1.4067F, 0.2797F, -0.006F));

		PartDefinition cube_r346 = Lowerjaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(50, 84).addBox(-0.9349F, 0.2725F, -2.5327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(3.1F, 1.8187F, -1.8791F, -1.4835F, 0.2094F, 0.0F));

		PartDefinition cube_r347 = Lowerjaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(61, 16).addBox(-0.9F, -0.1413F, -1.9599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1F, 0.0187F, 0.1209F, -0.2618F, 0.0175F, 0.0F));

		PartDefinition cube_r348 = Lowerjaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(7, 61).addBox(-0.9F, -0.1397F, -0.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(3.1F, -0.0563F, 0.1209F, 0.096F, 0.017F, 0.0038F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2716F, 0.6609F, -16.4146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r349 = bone2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(76, 79).addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.5893F, 0.1318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3327F, -0.5195F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r351 = bone2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(79, 53).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r352 = bone2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(30, 80).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r353 = bone2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -0.7821F, -0.4337F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r354 = bone2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(47, 79).addBox(-0.4977F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, -0.0204F, -0.0436F, 1.0892F));

		PartDefinition cube_r355 = bone2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(17, 75).addBox(-0.4977F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 0.8174F, -0.0436F, 1.0892F));

		PartDefinition cube_r356 = bone2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(79, 43).addBox(-0.4977F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, -0.8843F, -0.0436F, 1.0892F));

		PartDefinition cube_r357 = bone2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(79, 27).addBox(-0.4977F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 1.3846F, -0.0436F, 1.0892F));

		PartDefinition cube_r358 = bone2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(87, 29).addBox(-0.4977F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 2.2137F, -0.0436F, 1.0892F));

		PartDefinition cube_r359 = bone2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(79, 3).addBox(-0.4977F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2405F, 0.0123F, -0.4873F, 1.6028F, -0.0436F, 1.0892F));

		PartDefinition bone5 = Body.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8716F, 0.6609F, -16.4146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r360 = bone5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5893F, 0.1318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r361 = bone5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(79, 65).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3327F, -0.5195F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r362 = bone5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r363 = bone5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r364 = bone5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.7821F, -0.4337F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(47, 79).mirror().addBox(-0.5023F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, -0.0204F, 0.0436F, -1.0892F));

		PartDefinition cube_r366 = bone5.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-0.5023F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 0.8174F, 0.0436F, -1.0892F));

		PartDefinition cube_r367 = bone5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-0.5023F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, -0.8843F, 0.0436F, -1.0892F));

		PartDefinition cube_r368 = bone5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-0.5023F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 1.3846F, 0.0436F, -1.0892F));

		PartDefinition cube_r369 = bone5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(87, 29).mirror().addBox(-0.5023F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 2.2137F, 0.0436F, -1.0892F));

		PartDefinition cube_r370 = bone5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.5023F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.0123F, -0.4873F, 1.6028F, 0.0436F, -1.0892F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5684F, 0.6902F, -17.1263F, -0.733F, 0.5672F, 0.0F));

		PartDefinition cube_r371 = UpperArmL.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(87, 48).addBox(-0.5F, -0.925F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0065F, -0.1117F, 1.2062F, 0.4374F, 0.006F, 0.0121F));

		PartDefinition cube_r372 = UpperArmL.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(87, 45).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0004F, -0.5476F, 1.4707F, -0.348F, 0.006F, 0.0121F));

		PartDefinition cube_r373 = UpperArmL.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(87, 38).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, 0.006F, 0.0121F));

		PartDefinition cube_r374 = UpperArmL.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(86, 74).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 86).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(22, 75).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(84, 52).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition cube_r375 = HandL.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(53, 45).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1684F, 0.6902F, -17.1263F, -0.733F, -0.5672F, 0.0F));

		PartDefinition cube_r376 = UpperArmL2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(87, 86).addBox(-0.5F, -0.925F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0065F, -0.1117F, 1.2062F, 0.4374F, -0.006F, -0.0121F));

		PartDefinition cube_r377 = UpperArmL2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(55, 87).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0004F, -0.5476F, 1.4707F, -0.348F, -0.006F, -0.0121F));

		PartDefinition cube_r378 = UpperArmL2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(50, 87).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, -0.006F, -0.0121F));

		PartDefinition cube_r379 = UpperArmL2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(86, 80).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(86, 71).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 76).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(45, 85).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition cube_r380 = HandL2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(28, 25).addBox(-0.435F, -0.475F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(25, 89).addBox(0.065F, -1.925F, 0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.135F, -3.0567F, -11.5659F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r381 = Body2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(28, 89).addBox(1.065F, -1.525F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.475F, 2.95F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Body2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.2216F, 0.3348F, -1.2392F));

		PartDefinition cube_r383 = Body2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(56, 72).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.3571F, 0.2197F, -0.7541F));

		PartDefinition cube_r384 = Body2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.4216F, 0.0581F, -0.2971F));

		PartDefinition cube_r385 = Body2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.5154F, 0.0767F, -0.292F));

		PartDefinition cube_r386 = Body2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(72, 66).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.4356F, 0.2772F, -0.736F));

		PartDefinition cube_r387 = Body2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.2651F, 0.4212F, -1.2244F));

		PartDefinition cube_r388 = Body2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(62, 32).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.2651F, -0.4212F, 1.2244F));

		PartDefinition cube_r389 = Body2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(72, 66).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.4356F, -0.2772F, 0.736F));

		PartDefinition cube_r390 = Body2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(89, 4).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.5154F, -0.0767F, 0.292F));

		PartDefinition cube_r391 = Body2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(88, 63).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.4216F, -0.0581F, 0.2971F));

		PartDefinition cube_r392 = Body2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(56, 72).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.3571F, -0.2197F, 0.7541F));

		PartDefinition cube_r393 = Body2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(60, 47).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.2216F, -0.3348F, 1.2392F));

		PartDefinition cube_r394 = Body2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(36, 17).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.344F, 4.1212F, -0.2007F, 0.0F, 0.0F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 20).addBox(-0.435F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(13, 32).addBox(-1.935F, 5.5977F, 2.7309F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(41, 89).addBox(0.065F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 41).addBox(0.065F, -1.875F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 51).addBox(0.065F, -1.85F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r395 = bone.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.2716F, 0.4377F, -1.2217F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.4491F, 0.2889F, -0.7322F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.5322F, 0.0817F, -0.2907F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4043F, 0.2598F, -0.7431F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(31, 89).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4806F, 0.074F, -0.2935F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.2449F, 0.3917F, -1.2312F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(17, 73).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4176F, 0.2715F, -0.7396F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4973F, 0.079F, -0.2922F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.2513F, 0.4081F, -1.2287F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(14, 64).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.2513F, -0.4081F, 1.2287F));

		PartDefinition cube_r405 = bone.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(36, 89).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4973F, -0.079F, 0.2922F));

		PartDefinition cube_r406 = bone.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(17, 73).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4176F, -0.2715F, 0.7396F));

		PartDefinition cube_r407 = bone.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(63, 51).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.2449F, -0.3917F, 1.2312F));

		PartDefinition cube_r408 = bone.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(31, 89).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4806F, -0.074F, 0.2935F));

		PartDefinition cube_r409 = bone.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(5, 73).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4043F, -0.2598F, 0.7431F));

		PartDefinition cube_r410 = bone.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(89, 26).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.5322F, -0.0817F, 0.2907F));

		PartDefinition cube_r411 = bone.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(72, 68).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.4491F, -0.2889F, 0.7322F));

		PartDefinition cube_r412 = bone.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(63, 49).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.2716F, -0.4377F, 1.2217F));

		PartDefinition cube_r413 = bone.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(36, 5).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.5977F, 2.7309F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0415F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Body3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(19, 10).addBox(-0.935F, -1.0005F, 0.0113F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.3868F, 2.7799F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Body3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(36, 0).addBox(-0.935F, -1.0005F, 0.0113F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.4654F, -0.2191F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Body3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(63, 91).addBox(1.065F, -1.45F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(60, 91).addBox(1.065F, -1.35F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(91, 59).addBox(1.065F, -1.35F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(37, 91).addBox(1.065F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(0, 10).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Body3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.4251F, 0.2893F, -0.7804F));

		PartDefinition cube_r418 = Body3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(91, 71).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.5115F, 0.092F, -0.3339F));

		PartDefinition cube_r419 = Body3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.3275F, 0.249F, 0.4272F, -1.2725F));

		PartDefinition cube_r420 = Body3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.6255F, 0.1341F, -0.3658F));

		PartDefinition cube_r421 = Body3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.5146F, 0.3755F, -0.7959F));

		PartDefinition cube_r422 = Body3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(73, 21).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.2866F, 0.5433F, -1.2997F));

		PartDefinition cube_r423 = Body3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.9244F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.721F, 0.1749F, -0.3961F));

		PartDefinition cube_r424 = Body3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-2.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.5904F, 0.4515F, -0.8105F));

		PartDefinition cube_r425 = Body3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-3.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.3148F, 0.6435F, -1.329F));

		PartDefinition cube_r426 = Body3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.7905F, 0.2091F, -0.4281F));

		PartDefinition cube_r427 = Body3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(24, 73).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.6457F, 0.51F, -0.8302F));

		PartDefinition cube_r428 = Body3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(24, 73).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.6457F, -0.51F, 0.8302F));

		PartDefinition cube_r429 = Body3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(89, 65).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.7905F, -0.2091F, 0.4281F));

		PartDefinition cube_r430 = Body3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(65, 89).addBox(2.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.3148F, -0.6435F, 1.329F));

		PartDefinition cube_r431 = Body3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(73, 23).addBox(0.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.5904F, -0.4515F, 0.8105F));

		PartDefinition cube_r432 = Body3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(60, 89).addBox(-0.0756F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.721F, -0.1749F, 0.3961F));

		PartDefinition cube_r433 = Body3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(73, 21).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.2866F, -0.5433F, 1.2997F));

		PartDefinition cube_r434 = Body3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(73, 19).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.5146F, -0.3755F, 0.7959F));

		PartDefinition cube_r435 = Body3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(30, 8).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.6255F, -0.1341F, 0.3658F));

		PartDefinition cube_r436 = Body3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(74, 12).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.249F, -0.4272F, 1.2725F));

		PartDefinition cube_r437 = Body3.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(91, 71).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.5115F, -0.092F, 0.3339F));

		PartDefinition cube_r438 = Body3.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(73, 25).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.3275F, 0.4251F, -0.2893F, 0.7804F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition cube_r439 = body5.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(8, 90).addBox(1.065F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.2302F, 1.9988F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r440 = body5.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(5, 90).addBox(1.065F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r441 = body5.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(42, 46).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r442 = body5.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(76, 89).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.7627F, 0.1984F, -0.4795F));

		PartDefinition cube_r443 = body5.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(81, 89).mirror().addBox(-1.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.622F, 0.4894F, -0.8873F));

		PartDefinition cube_r444 = body5.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.45F, 0.0154F, -0.5149F));

		PartDefinition cube_r445 = body5.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-1.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.4021F, 0.1937F, -0.9636F));

		PartDefinition cube_r446 = body5.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 90).addBox(0.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.4021F, -0.1937F, 0.9636F));

		PartDefinition cube_r447 = body5.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(86, 89).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.45F, -0.0154F, 0.5149F));

		PartDefinition cube_r448 = body5.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(81, 89).addBox(0.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.622F, -0.4894F, 0.8873F));

		PartDefinition cube_r449 = body5.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(76, 89).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.7627F, -0.1984F, 0.4795F));

		PartDefinition bone3 = body5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r450 = bone3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(75, 14).addBox(-0.5089F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(5, 75).addBox(-0.5089F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.9232F, 0.1603F, 0.4968F));

		PartDefinition cube_r451 = bone3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(75, 70).addBox(-0.5089F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, 3.0109F, 0.1603F, 0.4968F));

		PartDefinition cube_r452 = bone3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(55, 84).addBox(-0.5089F, -0.7667F, 0.0658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.836F, 0.1603F, 0.4968F));

		PartDefinition cube_r453 = bone3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5089F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.8095F, 0.1638F, -2.5182F, -2.1378F, 0.1603F, 0.4968F));

		PartDefinition cube_r454 = bone3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.9843F, -2.5469F, -1.0307F, -0.3904F, 0.1337F, -0.2258F));

		PartDefinition cube_r455 = bone3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(72, 85).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0578F, -2.4866F, -1.6639F, -1.0441F, 0.1238F, -0.2313F));

		PartDefinition cube_r456 = bone3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F))
				.texOffs(80, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8543F, -1.7342F, -1.4579F, -1.8295F, 0.1238F, -0.2313F));

		PartDefinition cube_r457 = bone3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(80, 20).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -1.4368F, 0.1238F, -0.2313F));

		PartDefinition cube_r458 = bone3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, 0.0031F, 0.1238F, -0.2313F));

		PartDefinition cube_r459 = bone3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(80, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -0.8696F, 0.1238F, -0.2313F));

		PartDefinition cube_r460 = bone3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(80, 14).addBox(-1.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4153F, -1.0747F, -0.1272F, -0.9569F, 0.1238F, 0.5105F));

		PartDefinition cube_r461 = bone3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(41, 73).addBox(-1.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9974F, -0.0984F, -0.3752F, -2.8767F, 0.1238F, 0.5105F));

		PartDefinition cube_r462 = bone3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 75).addBox(-1.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8305F, 0.0834F, 1.5087F, -1.2187F, 0.1238F, 0.5105F));

		PartDefinition cube_r463 = bone3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(36, 73).addBox(-1.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.7423F, 0.3597F, -0.7513F, -1.5765F, 0.1238F, 0.5105F));

		PartDefinition cube_r464 = bone3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(31, 73).addBox(-1.5955F, -1.7952F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, 0.1238F, 0.5105F));

		PartDefinition bone4 = body5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5115F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r465 = bone4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(75, 14).mirror().addBox(-0.4911F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(5, 75).mirror().addBox(-0.4911F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.9232F, -0.1603F, -0.4968F));

		PartDefinition cube_r466 = bone4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(-0.4911F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, 3.0109F, -0.1603F, -0.4968F));

		PartDefinition cube_r467 = bone4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.4911F, -0.7667F, 0.0658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.836F, -0.1603F, -0.4968F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.4911F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1638F, -2.5182F, -2.1378F, -0.1603F, -0.4968F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.9843F, -2.5469F, -1.0307F, -0.3904F, -0.1337F, 0.2258F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0578F, -2.4866F, -1.6639F, -1.0441F, -0.1238F, 0.2313F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(80, 23).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.8543F, -1.7342F, -1.4579F, -1.8295F, -0.1238F, 0.2313F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -1.4368F, -0.1238F, 0.2313F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, 0.0031F, -0.1238F, 0.2313F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -0.8696F, -0.1238F, 0.2313F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(0.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4153F, -1.0747F, -0.1272F, -0.9569F, -0.1238F, -0.5105F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(41, 73).mirror().addBox(0.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9974F, -0.0984F, -0.3752F, -2.8767F, -0.1238F, -0.5105F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8305F, 0.0834F, 1.5087F, -1.2187F, -0.1238F, -0.5105F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(0.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.7423F, 0.3597F, -0.7513F, -1.5765F, -0.1238F, -0.5105F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(31, 73).mirror().addBox(0.5955F, -1.7952F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, -0.1238F, -0.5105F));

		PartDefinition UpperLegL = body5.addOrReplaceChild("UpperLegL", CubeListBuilder.create().texOffs(77, 86).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.68F, 2.1913F, 1.7854F, 0.9422F, 0.3885F, -1.0008F));

		PartDefinition cube_r480 = UpperLegL.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(41, 68).addBox(-0.5F, 1.8949F, -0.6615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.7485F, -1.2907F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r481 = UpperLegL.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(56, 74).addBox(-0.5F, 0.0177F, -0.0363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7485F, -1.2907F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r482 = UpperLegL.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r483 = UpperLegL.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create().texOffs(67, 34).addBox(-1.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(67, 39).addBox(-1.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2006F, 5.8405F, -1.7879F, 0.3747F, -0.1872F, 0.0677F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(13, 37).addBox(-0.75F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2926F, 3.4146F, -0.1261F, 0.1262F, 0.1128F, 0.037F));

		PartDefinition UpperLegL2 = body5.addOrReplaceChild("UpperLegL2", CubeListBuilder.create().texOffs(86, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.55F, 2.1913F, 1.7854F, 0.6893F, 0.0463F, 0.7021F));

		PartDefinition cube_r484 = UpperLegL2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(46, 68).addBox(-0.5F, 1.8949F, -0.6615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.7485F, -1.2907F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r485 = UpperLegL2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(61, 74).addBox(-0.5F, 0.0177F, -0.0363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7485F, -1.2907F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r486 = UpperLegL2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r487 = UpperLegL2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(10, 87).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create().texOffs(68, 19).addBox(0.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(21, 68).addBox(0.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2006F, 5.8405F, -1.7879F, 0.3747F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(22, 39).addBox(-0.25F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2926F, 3.4146F, -0.1261F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.1243F, 0.1732F, 0.0215F));

		PartDefinition cube_r488 = Body4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(66, 91).addBox(0.0F, 0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.8624F, 2.7857F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r489 = Body4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(19, 90).addBox(1.065F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5245F, 4.589F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r490 = Body4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(90, 18).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0072F, 4.0813F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r491 = Body4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(16, 90).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1672F, 2.0889F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r492 = Body4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(90, 14).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3415F, 0.0965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r493 = Body4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(11, 90).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1018F, 0.4183F, 0.5827F, 0.0478F, -0.5534F));

		PartDefinition cube_r494 = Body4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-2.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 19).addBox(-0.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-1.565F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1299F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r495 = Body4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(11, 90).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1018F, 0.4183F, 0.5827F, -0.0478F, 0.5534F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(31, 39).addBox(-0.435F, -0.3651F, -0.0129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, 0.0121F, 0.2176F, -0.0163F));

		PartDefinition cube_r496 = Tail.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(51, 90).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3651F, 1.9871F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r497 = Tail.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(48, 90).addBox(1.065F, -1.475F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4651F, -0.0629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r498 = Tail.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1349F, -0.0129F, 0.0068F, 0.0342F, 0.0016F));

		PartDefinition cube_r499 = Tail.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(52, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1349F, -0.0129F, 0.0068F, -0.0342F, -0.0016F));

		PartDefinition cube_r500 = Tail.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(90, 22).addBox(1.065F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 90).addBox(1.065F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.6896F, 1.4622F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 41).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition cube_r501 = tail5.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(90, 67).addBox(1.065F, -1.425F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4F, 2.05F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail5.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(57, 90).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail5.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.335F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r504 = tail5.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(52, 27).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.465F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r505 = tail5.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(15, 20).addBox(1.065F, 1.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 90).addBox(1.065F, 0.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -2.5248F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(41, 22).addBox(-0.435F, -0.478F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0147F, 0.0F, 0.0F));

		PartDefinition cube_r506 = Tail2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(31, 91).addBox(1.065F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 2.0123F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r507 = Tail2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(91, 9).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 0.0123F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r508 = Tail2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.022F, 0.0123F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r509 = Tail2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(38, 52).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.022F, 0.0123F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r510 = Tail2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(14, 56).addBox(1.065F, 3.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 40).addBox(1.065F, 2.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -6.4998F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(41, 28).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r511 = tail6.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(91, 73).addBox(1.065F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail6.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(17, 70).addBox(1.065F, 4.2F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5327F, -10.5122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail6.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(34, 91).addBox(1.065F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 34).addBox(-0.435F, -0.0994F, 0.0567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, -0.006F, 0.0434F, -0.0439F));

		PartDefinition cube_r514 = Tail3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(91, 79).addBox(1.065F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 0.0567F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r515 = Tail3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(79, 91).addBox(1.065F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 2.0567F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r516 = Tail3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(91, 76).addBox(1.065F, 6.0F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 91).addBox(1.065F, 5.2F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.9327F, -14.4122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(42, 40).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r517 = tail7.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(88, 91).addBox(1.065F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.1F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail7.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(85, 91).addBox(1.065F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail7.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(91, 82).addBox(1.065F, 8.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 91).addBox(1.065F, 7.0F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5321F, -18.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(51, 5).addBox(-0.435F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4999F, 4.0087F, -0.1006F, 0.2498F, -0.1534F));

		PartDefinition cube_r520 = tail8.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(92, 0).addBox(1.065F, -0.675F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.026F, 2.054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail8.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(0, 92).addBox(1.065F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail8.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(91, 89).addBox(1.065F, 8.9F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0321F, -22.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(23, 64).addBox(-0.435F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(92, 6).addBox(0.065F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1096F, 2.9801F, -0.2464F, 0.127F, -0.0318F));

		PartDefinition cube_r523 = tail9.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(11, 92).addBox(1.065F, -0.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail9.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(25, 80).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail9.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(92, 31).addBox(1.065F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.911F, 1.6579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6928F, 2.5703F, 0.0456F, 0.0F, 0.0F));

		PartDefinition cube_r526 = Tail4.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(20, 49).addBox(0.565F, 0.4811F, 1.6197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r527 = Tail4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(21, 60).addBox(0.565F, -0.0653F, -0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r528 = Tail4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(30, 64).addBox(0.565F, -1.0152F, -0.2699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r529 = Tail4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(92, 28).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 1.2524F, 2.2201F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r530 = Tail4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(92, 37).addBox(1.065F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 34).addBox(1.065F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.153F, 0.881F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r531 = Tail4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(28, 32).addBox(0.565F, 0.8F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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