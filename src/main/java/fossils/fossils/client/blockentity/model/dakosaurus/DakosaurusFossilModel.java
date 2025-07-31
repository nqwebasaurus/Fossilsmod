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
	private final ModelPart Body4;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
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
		this.Body4 = this.body5.getChild("Body4");
		this.bone3 = this.Body4.getChild("bone3");
		this.bone5 = this.Body4.getChild("bone5");
		this.UpperLegL = this.Body4.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.UpperLegL2 = this.Body4.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
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

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -18.6F, -1.0F, -0.053F, -0.1664F, 0.3099F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 84).addBox(1.565F, -1.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.3978F, -12.6046F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 84).addBox(1.565F, -1.85F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.2235F, -14.597F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 84).addBox(1.565F, -1.85F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -3.0513F, -16.5645F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.3F, 0.0F, -0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2898F, 2.3205F, -14.3787F, -0.0325F, -0.3878F, 0.4102F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.3F, 0.0F, -0.2F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2898F, 2.3205F, -14.3787F, -0.0892F, -0.5096F, 0.42F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.1012F, -14.6057F, 0.0735F, -0.4924F, 0.4075F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.1012F, -14.6057F, 0.5902F, -0.8054F, 0.2269F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.6358F, -15.5877F, 0.0407F, 0.5407F, 0.021F));

		PartDefinition Bodymiddle_r1 = Body.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(87, 34).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.5013F, 0.2308F, -0.6125F));

		PartDefinition Bodymiddle_r2 = Body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.6948F, -16.1362F, 0.3501F, 0.4094F, -1.0831F));

		PartDefinition Bodymiddle_r3 = Body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.4085F, 0.0343F, -0.5169F));

		PartDefinition Bodymiddle_r4 = Body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.3557F, 0.1926F, -0.9735F));

		PartDefinition Bodymiddle_r5 = Body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-3.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8948F, -14.1362F, 0.2337F, 0.3102F, -1.4545F));

		PartDefinition Bodymiddle_r6 = Body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.9948F, -12.1362F, 0.4433F, 0.0371F, -0.3847F));

		PartDefinition Bodymiddle_r7 = Body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.9948F, -12.1362F, 0.3864F, 0.2104F, -0.8364F));

		PartDefinition Bodymiddle_r8 = Body.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.9948F, -12.1362F, 0.2531F, 0.3398F, -1.3174F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 55).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7F, 2.6358F, -15.5877F, 0.0407F, -0.5407F, -0.021F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 12).addBox(-0.7F, 0.0F, -0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6898F, 2.3205F, -14.3787F, -0.0325F, 0.3878F, -0.4102F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 22).addBox(-0.7F, 0.0F, -0.2F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6898F, 2.3205F, -14.3787F, -0.0892F, 0.5096F, -0.42F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.1012F, -14.6057F, 0.0735F, 0.4924F, -0.4075F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.1012F, -14.6057F, 0.5902F, 0.8054F, -0.2269F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2F, 2.6358F, -15.5877F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 50).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2F, 1.7961F, -17.4704F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 31).addBox(0.065F, 0.25F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = Body.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(26, 73).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.3501F, -0.4094F, 1.0831F));

		PartDefinition Bodymiddle_r10 = Body.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(87, 34).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.6948F, -16.1362F, 0.5013F, -0.2308F, 0.6125F));

		PartDefinition Bodymiddle_r11 = Body.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(10, 87).addBox(2.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.2337F, -0.3102F, 1.4545F));

		PartDefinition Bodymiddle_r12 = Body.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(73, 24).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.3557F, -0.1926F, 0.9735F));

		PartDefinition Bodymiddle_r13 = Body.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(87, 32).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.8948F, -14.1362F, 0.4085F, -0.0343F, 0.5169F));

		PartDefinition Bodymiddle_r14 = Body.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(74, 9).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.9948F, -12.1362F, 0.2531F, -0.3398F, 1.3174F));

		PartDefinition Bodymiddle_r15 = Body.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(14, 73).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.9948F, -12.1362F, 0.3864F, -0.2104F, 0.8364F));

		PartDefinition Bodymiddle_r16 = Body.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(5, 87).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.9948F, -12.1362F, 0.4433F, -0.0371F, 0.3847F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -2.6493F, -16.3944F, 0.0473F, -0.3051F, -0.0142F));

		PartDefinition cube_r17 = Neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 84).addBox(1.065F, -1.55F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 51).addBox(0.565F, 0.05F, 3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r17 = Neck.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-2.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.0455F, -1.7417F, 0.5874F, 0.9016F, -0.7987F));

		PartDefinition Bodymiddle_r18 = Neck.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(73, 28).addBox(0.0077F, 0.0748F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.0455F, -1.7417F, 0.5874F, -0.9016F, 0.7987F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.0829F, -0.2575F, -0.1805F));

		PartDefinition cube_r18 = Neck2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 38).addBox(0.565F, 0.05F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(15, 84).addBox(1.065F, -1.475F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 70).addBox(1.065F, -0.95F, 2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r19 = Neck2.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(87, 40).mirror().addBox(-1.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -2.7596F, 0.4096F, 0.8776F, -1.218F));

		PartDefinition Bodymiddle_r20 = Neck2.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(87, 38).mirror().addBox(-1.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -0.7596F, 0.6566F, 0.9726F, -0.7128F));

		PartDefinition Bodymiddle_r21 = Neck2.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(87, 40).addBox(0.0077F, 0.0749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -2.7596F, 0.4096F, -0.8776F, 1.218F));

		PartDefinition Bodymiddle_r22 = Neck2.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(87, 38).addBox(0.0077F, 0.0749F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -0.7596F, 0.6566F, -0.9726F, 0.7128F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3051F, -4.6331F, 0.2586F, -0.1517F, -0.1054F));

		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(35, 63).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -1.9181F, -7.8143F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(22, 48).addBox(-1.0F, -3.0F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -0.7432F, -2.9451F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(41, 27).addBox(-1.935F, -2.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2865F, -0.9029F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 81).addBox(-0.46F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.025F, -2.3824F, -11.9856F, 3.0849F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(81, 18).addBox(-1.435F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(53, 20).addBox(-1.935F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.3576F, -11.9892F, 2.9976F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 69).addBox(-1.935F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4125F, -12.5867F, 3.05F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 8).addBox(-1.935F, -0.6F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.8718F, -1.8128F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 83).addBox(-1.935F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5F, -2.3513F, -10.6441F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 58).addBox(-1.935F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5F, -2.543F, -8.6533F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 56).addBox(-1.435F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.5957F, -6.6278F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(31, 48).addBox(-1.435F, 0.0F, -2.05F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.7667F, -4.76F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(42, 18).addBox(-1.935F, 0.0F, -1.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6622F, -3.7654F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 19).addBox(-0.935F, 0.0F, -1.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.4203F, -2.7951F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 44).addBox(-0.935F, -2.05F, -1.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1309F, -2.3187F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 40).addBox(-0.935F, -0.075F, -1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(62, 36).addBox(-0.935F, -0.075F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, -1.7738F, -0.6243F, -0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 16).addBox(-0.435F, -1.075F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.3615F, -0.5503F, -0.733F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.229F, -1.3663F, -1.6664F));

		PartDefinition cube_r35 = leftFace.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 34).addBox(-1.0007F, -4.0F, -1.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8866F, -1.25F, -5.9962F, 1.6537F, 0.1571F, 0.0F));

		PartDefinition cube_r36 = leftFace.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 69).addBox(1.065F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.229F, 2.8178F, 1.7498F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftFace.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6641F, 1.2451F, -0.9551F, 1.5795F, 0.1047F, 0.0F));

		PartDefinition cube_r38 = leftFace.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(79, 67).addBox(1.065F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.079F, 2.8178F, 1.7498F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftFace.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 69).addBox(1.065F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(73, 54).addBox(1.09F, 0.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-2.079F, 2.8178F, 1.7498F, -2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(25, 78).addBox(-0.975F, -1.9439F, 1.4958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(68, 77).addBox(-0.975F, -1.7439F, 1.4958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, 1.1083F, 0.1047F, 0.0F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 13).addBox(-1.3404F, -0.3817F, -2.1404F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 32).addBox(-1.3404F, -0.3817F, -1.3404F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3576F, 0.2262F, 0.0402F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(28, 63).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0855F, -0.4362F, 1.0553F, -0.2608F, 0.3241F, -0.1226F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 81).addBox(-0.81F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.5679F, -1.0204F, -10.3965F, 3.0849F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 81).addBox(-0.21F, -0.8F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.204F, -1.016F, -10.3192F, 3.0777F, 0.4791F, -0.0295F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8391F, -0.2641F, -5.0708F, -1.9211F, 0.2342F, -0.0846F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(81, 15).addBox(1.065F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(15, 81).addBox(1.065F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.054F, 1.7998F, 0.2135F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(81, 12).addBox(1.065F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.054F, 0.8352F, -0.0092F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 78).addBox(-0.5F, -1.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8582F, 0.41F, -11.1874F, 0.7199F, 0.1047F, 0.0F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8582F, 0.41F, -11.1874F, 1.069F, 0.1047F, 0.0F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(61, 28).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6462F, 0.3058F, -10.1212F, 1.2872F, 0.1047F, 0.0F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 24).addBox(-0.5F, -4.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 59).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 48).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 60).addBox(-0.475F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 60).addBox(-0.425F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1328F, 1.2641F, -5.2368F, 1.4181F, 0.1047F, 0.0F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(59, 55).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8588F, 1.5856F, -4.295F, 1.2435F, 0.1047F, 0.0F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(53, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7505F, 1.7137F, -3.2646F, 1.1563F, 0.1047F, 0.0F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4442F, -0.89F, -3.029F, -0.0327F, 0.3258F, 0.1186F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(78, 3).addBox(-0.45F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7492F, -0.8975F, -3.7719F, 0.0982F, 0.3258F, 0.1186F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5F, -0.3875F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(80, 73).addBox(-0.5F, -0.6125F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6858F, -0.2891F, -9.8265F, 1.1999F, 0.0873F, 0.0F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(83, 76).addBox(-0.5F, -0.3448F, -0.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.864F, -0.5431F, -11.0435F, -2.8842F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 83).addBox(-0.5F, -0.566F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.864F, -0.5431F, -11.0435F, 2.57F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(81, 9).addBox(-0.4928F, -0.4638F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.4086F, -0.1641F, -6.437F, 1.5766F, 0.0204F, -0.0219F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(76, 0).addBox(-0.9356F, -1.3691F, -2.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4874F, 0.1423F, -4.0964F, 0.0269F, 0.2355F, 0.0081F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 84).addBox(-0.4928F, -0.4419F, -0.9996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.4086F, -0.1641F, -6.437F, 1.4457F, 0.0204F, -0.0219F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(50, 73).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4874F, 0.1423F, -4.0964F, 1.5727F, 0.1949F, -0.0223F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(83, 60).addBox(-1.008F, 0.0754F, -0.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8866F, -1.25F, -5.9962F, 0.026F, 0.1308F, 0.0079F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(81, 6).addBox(-0.809F, -0.2571F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7326F, -0.8771F, -5.4809F, 0.3227F, 0.8166F, 0.3159F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(46, 59).addBox(-1.0F, 0.05F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.229F, -1.4004F, -3.0936F, -0.2883F, -0.0064F, 0.1142F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(39, 59).addBox(-1.0F, 0.0F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.229F, -1.4004F, -3.0936F, 0.0812F, 0.2464F, -0.0141F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 64).addBox(-0.471F, -0.5828F, -0.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(79, 42).addBox(-0.471F, -0.5828F, -0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0436F, -0.6638F, -3.4113F, 0.0509F, -0.0451F, 0.2075F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(79, 57).addBox(-0.4744F, -0.9972F, -0.1495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0436F, -0.6638F, -3.4113F, -0.9945F, -0.0324F, 0.2091F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 0).addBox(-1.0F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.304F, 0.398F, 1.1768F, -0.2452F, 0.3691F, -0.1319F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(54, 29).addBox(-1.2311F, -0.2939F, 0.1409F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1784F, -0.0314F, 0.0873F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 45).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.654F, 0.536F, -2.2597F, -1.6406F, 0.1047F, 0.0F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 78).addBox(-0.975F, 1.1388F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -1.8588F, 0.1047F, 0.0F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(79, 39).addBox(-0.4744F, -0.4878F, -0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0436F, -0.6638F, -3.4113F, -0.5581F, -0.0324F, 0.2091F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(63, 77).addBox(-0.975F, -0.1734F, 1.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, 1.7191F, 0.1047F, 0.0F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(58, 77).addBox(-0.975F, 0.6782F, 0.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, 2.5918F, 0.1047F, 0.0F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(53, 77).addBox(-0.975F, 0.759F, -0.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -3.1241F, 0.1047F, 0.0F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(79, 36).addBox(-1.05F, 0.4557F, -2.1505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -1.6406F, 0.1047F, 0.0F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(48, 77).addBox(-0.975F, 0.7639F, -2.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -1.4224F, 0.1047F, 0.0F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 77).addBox(-0.975F, -1.7193F, -2.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -0.5061F, 0.1047F, 0.0F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 77).addBox(-0.975F, -0.1164F, -3.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, -1.3352F, 0.1047F, 0.0F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.323F, -0.7304F, -4.5566F, 0.1022F, 0.6757F, 0.295F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 51).addBox(-0.3767F, -0.6092F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0436F, -0.6638F, -3.4113F, 0.141F, 0.3102F, 0.2555F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(81, 0).addBox(-0.809F, -0.2571F, -0.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7326F, -0.8771F, -5.4809F, 0.2355F, 0.8166F, 0.3159F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(55, 83).addBox(-0.5F, -0.3448F, -0.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.689F, -0.5431F, -10.9435F, -2.8842F, 0.3491F, 0.0F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 54).addBox(-0.5F, -0.566F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.689F, -0.5431F, -10.9435F, 2.57F, 0.3491F, 0.0F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.8272F, -0.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7141F, -0.3642F, -10.149F, 1.6537F, 0.0873F, 0.0F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(80, 70).addBox(-1.0F, -2.633F, 0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.954F, 0.8133F, -7.0461F, 1.3483F, 0.1222F, 0.0F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(74, 38).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.4874F, 0.1423F, -4.0964F, 1.4418F, 0.1949F, -0.0223F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0F, -1.6314F, 0.0712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.954F, 0.8133F, -7.0461F, 1.3919F, 0.1222F, 0.0F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(54, 24).addBox(-1.0F, -3.5285F, -0.5472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, 1.069F, 0.1047F, 0.0F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 59).addBox(-1.0F, -1.625F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(14, 59).addBox(-1.0F, -1.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.229F, 2.2492F, -1.4214F, 1.4181F, 0.1047F, 0.0F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 62).addBox(-0.6F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6641F, 0.8676F, 1.8202F, -0.7343F, 0.2397F, -0.0995F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0991F, -1.3663F, -1.6664F));

		PartDefinition cube_r93 = rightFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(0.0007F, -4.0F, -1.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.8866F, -1.25F, -5.9962F, 1.6537F, -0.1571F, 0.0F));

		PartDefinition cube_r94 = rightFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-2.065F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.229F, 2.8178F, 1.7498F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6641F, 1.2451F, -0.9551F, 1.5795F, -0.1047F, 0.0F));

		PartDefinition cube_r96 = rightFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-2.065F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.079F, 2.8178F, 1.7498F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-2.065F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(73, 54).mirror().addBox(-2.09F, 0.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(2.079F, 2.8178F, 1.7498F, -2.4347F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.025F, -1.9439F, 1.4958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(68, 77).mirror().addBox(-0.025F, -1.7439F, 1.4958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, 1.1083F, -0.1047F, 0.0F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-0.6596F, -0.3817F, -2.1404F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(52, 32).mirror().addBox(-0.6596F, -0.3817F, -1.3404F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3576F, -0.2262F, -0.0402F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0855F, -0.4362F, 1.0553F, -0.2608F, -0.3241F, 0.1226F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.19F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.5679F, -1.0204F, -10.3965F, 3.0849F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.79F, -0.8F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.204F, -1.016F, -10.3192F, 3.0777F, -0.4791F, 0.0295F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8391F, -0.2641F, -5.0708F, -1.9211F, -0.2342F, 0.0846F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(-2.065F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(15, 81).mirror().addBox(-2.065F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.054F, 1.7998F, 0.2135F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-2.065F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.054F, 0.8352F, -0.0092F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.5F, -1.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8582F, 0.41F, -11.1874F, 0.7199F, -0.1047F, 0.0F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8582F, 0.41F, -11.1874F, 1.069F, -0.1047F, 0.0F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6462F, 0.3058F, -10.1212F, 1.2872F, -0.1047F, 0.0F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 24).mirror().addBox(-0.5F, -4.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 59).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 48).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 60).mirror().addBox(-0.525F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.575F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1328F, 1.2641F, -5.2368F, 1.4181F, -0.1047F, 0.0F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8588F, 1.5856F, -4.295F, 1.2435F, -0.1047F, 0.0F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7505F, 1.7137F, -3.2646F, 1.1563F, -0.1047F, 0.0F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4442F, -0.89F, -3.029F, -0.0327F, -0.3258F, -0.1186F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.55F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7492F, -0.8975F, -3.7719F, 0.0982F, -0.3258F, -0.1186F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.5F, -0.3875F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(80, 73).mirror().addBox(-0.5F, -0.6125F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6858F, -0.2891F, -9.8265F, 1.1999F, -0.0873F, 0.0F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.5F, -0.3448F, -0.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.864F, -0.5431F, -11.0435F, -2.8842F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.5F, -0.566F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.864F, -0.5431F, -11.0435F, 2.57F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-0.5072F, -0.4638F, -0.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.4086F, -0.1641F, -6.437F, 1.5766F, -0.0204F, 0.0219F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.0644F, -1.3691F, -2.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4874F, 0.1423F, -4.0964F, 0.0269F, -0.2355F, -0.0081F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.5072F, -0.4419F, -0.9996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.4086F, -0.1641F, -6.437F, 1.4457F, -0.0204F, 0.0219F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4874F, 0.1423F, -4.0964F, 1.5727F, -0.1949F, 0.0223F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(0.008F, 0.0754F, -0.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.8866F, -1.25F, -5.9962F, 0.026F, -0.1308F, -0.0079F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-0.191F, -0.2571F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7326F, -0.8771F, -5.4809F, 0.3227F, -0.8166F, -0.3159F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 59).mirror().addBox(0.0F, 0.05F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.229F, -1.4004F, -3.0936F, -0.2883F, 0.0064F, -0.1142F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 59).mirror().addBox(0.0F, 0.0F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.229F, -1.4004F, -3.0936F, 0.0812F, -0.2464F, 0.0141F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(79, 64).mirror().addBox(-0.529F, -0.5828F, -0.502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(79, 42).mirror().addBox(-0.529F, -0.5828F, -0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.0436F, -0.6638F, -3.4113F, 0.0509F, 0.0451F, -0.2075F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.5256F, -0.9972F, -0.1495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0436F, -0.6638F, -3.4113F, -0.9945F, 0.0324F, -0.2091F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.0F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.304F, 0.398F, 1.1768F, -0.2452F, -0.3691F, 0.1319F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-0.7689F, -0.2939F, 0.1409F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1784F, 0.0314F, -0.0873F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.654F, 0.536F, -2.2597F, -1.6406F, -0.1047F, 0.0F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.025F, 1.1388F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -1.8588F, -0.1047F, 0.0F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.5256F, -0.4878F, -0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0436F, -0.6638F, -3.4113F, -0.5581F, 0.0324F, -0.2091F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-0.025F, -0.1734F, 1.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, 1.7191F, -0.1047F, 0.0F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(58, 77).mirror().addBox(-0.025F, 0.6782F, 0.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, 2.5918F, -0.1047F, 0.0F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.025F, 0.759F, -0.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -3.1241F, -0.1047F, 0.0F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(79, 36).mirror().addBox(0.05F, 0.4557F, -2.1505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -1.6406F, -0.1047F, 0.0F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(-0.025F, 0.7639F, -2.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -1.4224F, -0.1047F, 0.0F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.025F, -1.7193F, -2.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -0.5061F, -0.1047F, 0.0F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(38, 77).mirror().addBox(-0.025F, -0.1164F, -3.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, -1.3352F, -0.1047F, 0.0F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.323F, -0.7304F, -4.5566F, 0.1022F, -0.6757F, -0.295F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.6233F, -0.6092F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0436F, -0.6638F, -3.4113F, 0.141F, -0.3102F, -0.2555F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.191F, -0.2571F, -0.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7326F, -0.8771F, -5.4809F, 0.2355F, -0.8166F, -0.3159F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-0.5F, -0.3448F, -0.4473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.689F, -0.5431F, -10.9435F, -2.8842F, -0.3491F, 0.0F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(83, 54).mirror().addBox(-0.5F, -0.566F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.689F, -0.5431F, -10.9435F, 2.57F, -0.3491F, 0.0F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.8272F, -0.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7141F, -0.3642F, -10.149F, 1.6537F, -0.0873F, 0.0F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(0.0F, -2.633F, 0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.954F, 0.8133F, -7.0461F, 1.3483F, -0.1222F, 0.0F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.4874F, 0.1423F, -4.0964F, 1.4418F, -0.1949F, 0.0223F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(0.0F, -1.6314F, 0.0712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.954F, 0.8133F, -7.0461F, 1.3919F, -0.1222F, 0.0F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(0.0F, -3.5285F, -0.5472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, 1.069F, -0.1047F, 0.0F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(0.0F, -1.625F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(14, 59).mirror().addBox(0.0F, -1.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.229F, 2.2492F, -1.4214F, 1.4181F, -0.1047F, 0.0F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(21, 62).mirror().addBox(-0.4F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6641F, 0.8676F, 1.8202F, -0.7343F, -0.2397F, 0.0995F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8174F, 0.8379F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Lowerjaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(61, 63).mirror().addBox(-0.0354F, -0.6057F, -1.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(54, 63).mirror().addBox(-0.0354F, 0.1193F, -1.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.1745F, -0.1222F, 0.0F));

		PartDefinition cube_r152 = Lowerjaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.0354F, -0.3888F, -3.6274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-0.0354F, 0.2112F, -3.6274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2269F, -0.1222F, 0.0F));

		PartDefinition cube_r153 = Lowerjaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.0354F, -0.8349F, -2.6144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.0524F, -0.1222F, 0.0F));

		PartDefinition cube_r154 = Lowerjaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 54).mirror().addBox(-0.0354F, 0.0935F, -7.8263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.3142F, -0.1222F, 0.0F));

		PartDefinition cube_r155 = Lowerjaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.0354F, -1.4032F, -11.0797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2705F, -0.1222F, 0.0F));

		PartDefinition cube_r156 = Lowerjaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.0354F, -0.7784F, -10.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 73).mirror().addBox(-0.0354F, -0.7784F, -9.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 62).mirror().addBox(-0.0354F, -1.0784F, -8.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.3578F, -0.1222F, 0.0F));

		PartDefinition cube_r157 = Lowerjaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.0354F, -0.7135F, -7.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 73).mirror().addBox(-0.0354F, -0.6135F, -6.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 39).mirror().addBox(-0.0354F, -0.3135F, -5.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 67).mirror().addBox(-0.0354F, 0.7117F, -9.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(67, 67).mirror().addBox(-0.0354F, 1.2117F, -9.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(18, 55).mirror().addBox(-0.0354F, 0.8829F, -5.9929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.3927F, -0.1222F, 0.0F));

		PartDefinition cube_r158 = Lowerjaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(55, 36).mirror().addBox(-0.0354F, -0.2169F, -6.1283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(75, 72).mirror().addBox(-0.0354F, 0.3336F, -4.3873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2618F, -0.1222F, 0.0F));

		PartDefinition cube_r159 = Lowerjaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.0354F, 2.4765F, -10.692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.5323F, -0.1222F, 0.0F));

		PartDefinition cube_r160 = Lowerjaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(28, 67).mirror().addBox(-0.0354F, -0.7386F, -11.1208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2356F, -0.1222F, 0.0F));

		PartDefinition cube_r161 = Lowerjaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-0.0354F, -0.24F, -7.7692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2007F, -0.1222F, 0.0F));

		PartDefinition cube_r162 = Lowerjaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-0.0354F, -0.4183F, -4.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -0.2182F, -0.1222F, 0.0F));

		PartDefinition cube_r163 = Lowerjaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-0.1F, 0.1369F, -3.7929F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.0873F, -0.0175F, 0.0F));

		PartDefinition cube_r164 = Lowerjaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.1F, -0.2224F, -2.3135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, 0.0873F, -0.0175F, 0.0F));

		PartDefinition cube_r165 = Lowerjaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.1F, 0.2124F, -0.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, 0.1396F, -0.0175F, 0.0F));

		PartDefinition cube_r166 = Lowerjaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.1F, 0.5281F, -1.0661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, 0.4451F, -0.0175F, 0.0F));

		PartDefinition cube_r167 = Lowerjaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-0.0354F, -0.2792F, -1.2047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.7187F, -3.5791F, -1.405F, -0.1222F, 0.0F));

		PartDefinition cube_r168 = Lowerjaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.1F, 2.3967F, -2.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -1.0821F, -0.0175F, 0.0F));

		PartDefinition cube_r169 = Lowerjaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-0.1F, 0.5746F, -3.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.4276F, -0.0175F, 0.0F));

		PartDefinition cube_r170 = Lowerjaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-0.1F, -0.4566F, -3.6644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.0349F, -0.0175F, 0.0F));

		PartDefinition cube_r171 = Lowerjaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-0.1F, -0.223F, -1.8991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.1658F, -0.0175F, 0.0F));

		PartDefinition cube_r172 = Lowerjaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(-0.1F, -0.0913F, -1.1099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.2967F, -0.0175F, 0.0F));

		PartDefinition cube_r173 = Lowerjaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(61, 32).mirror().addBox(-0.1F, -0.1397F, -0.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8701F, 0.0187F, 0.1209F, -0.1222F, -0.0175F, 0.0F));

		PartDefinition cube_r174 = Lowerjaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(61, 63).addBox(-0.9646F, -0.6057F, -1.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(54, 63).addBox(-0.9646F, 0.1193F, -1.8819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.1745F, 0.1222F, 0.0F));

		PartDefinition cube_r175 = Lowerjaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(7, 64).addBox(-0.9646F, -0.3888F, -3.6274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 64).addBox(-0.9646F, 0.2112F, -3.6274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2269F, 0.1222F, 0.0F));

		PartDefinition cube_r176 = Lowerjaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 81).addBox(-0.9646F, -0.8349F, -2.6144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.0524F, 0.1222F, 0.0F));

		PartDefinition cube_r177 = Lowerjaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 54).addBox(-0.9646F, 0.0935F, -7.8263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.3142F, 0.1222F, 0.0F));

		PartDefinition cube_r178 = Lowerjaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 74).addBox(-0.9646F, -1.4032F, -11.0797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2705F, 0.1222F, 0.0F));

		PartDefinition cube_r179 = Lowerjaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(70, 73).addBox(-0.9646F, -0.7784F, -10.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 73).addBox(-0.9646F, -0.7784F, -9.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 62).addBox(-0.9646F, -1.0784F, -8.1007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.3578F, 0.1222F, 0.0F));

		PartDefinition cube_r180 = Lowerjaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 73).addBox(-0.9646F, -0.7135F, -7.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 73).addBox(-0.9646F, -0.6135F, -6.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 39).addBox(-0.9646F, -0.3135F, -5.0779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 67).addBox(-0.9646F, 0.7117F, -9.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(67, 67).addBox(-0.9646F, 1.2117F, -9.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(18, 55).addBox(-0.9646F, 0.8829F, -5.9929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.3927F, 0.1222F, 0.0F));

		PartDefinition cube_r181 = Lowerjaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(55, 36).addBox(-0.9646F, -0.2169F, -6.1283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(75, 72).addBox(-0.9646F, 0.3336F, -4.3873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2618F, 0.1222F, 0.0F));

		PartDefinition cube_r182 = Lowerjaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 68).addBox(-0.9646F, 2.4765F, -10.692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.5323F, 0.1222F, 0.0F));

		PartDefinition cube_r183 = Lowerjaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(28, 67).addBox(-0.9646F, -0.7386F, -11.1208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2356F, 0.1222F, 0.0F));

		PartDefinition cube_r184 = Lowerjaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(21, 66).addBox(-0.9646F, -0.24F, -7.7692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2007F, 0.1222F, 0.0F));

		PartDefinition cube_r185 = Lowerjaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(75, 75).addBox(-0.9646F, -0.4183F, -4.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -0.2182F, 0.1222F, 0.0F));

		PartDefinition cube_r186 = Lowerjaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 54).addBox(-0.9F, 0.1369F, -3.7929F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.0873F, 0.0175F, 0.0F));

		PartDefinition cube_r187 = Lowerjaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(38, 54).addBox(-0.9F, -0.2224F, -2.3135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, 0.0873F, 0.0175F, 0.0F));

		PartDefinition cube_r188 = Lowerjaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(70, 81).addBox(-0.9F, 0.2124F, -0.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, 0.1396F, 0.0175F, 0.0F));

		PartDefinition cube_r189 = Lowerjaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(40, 63).addBox(-0.9F, 0.5281F, -1.0661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, 0.4451F, 0.0175F, 0.0F));

		PartDefinition cube_r190 = Lowerjaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(74, 34).addBox(-0.9646F, -0.2792F, -1.2047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0F, 0.7187F, -3.5791F, -1.405F, 0.1222F, 0.0F));

		PartDefinition cube_r191 = Lowerjaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 84).addBox(-0.9F, 2.3967F, -2.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -1.0821F, 0.0175F, 0.0F));

		PartDefinition cube_r192 = Lowerjaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 81).addBox(-0.9F, 0.5746F, -3.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.4276F, 0.0175F, 0.0F));

		PartDefinition cube_r193 = Lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(47, 63).addBox(-0.9F, -0.4566F, -3.6644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.0349F, 0.0175F, 0.0F));

		PartDefinition cube_r194 = Lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(81, 51).addBox(-0.9F, -0.223F, -1.8991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.1658F, 0.0175F, 0.0F));

		PartDefinition cube_r195 = Lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(81, 48).addBox(-0.9F, -0.0913F, -1.1099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.2967F, 0.0175F, 0.0F));

		PartDefinition cube_r196 = Lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(61, 32).addBox(-0.9F, -0.1397F, -0.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0F, 0.0187F, 0.1209F, -0.1222F, 0.0175F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1845F, -0.3353F, -16.4146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.2143F, 1.0318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0423F, 0.3805F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -0.3153F, 0.4264F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(7, 68).addBox(2.5F, -0.3F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-3.5F, -0.0283F, 0.0835F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(79, 33).addBox(-0.5F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.7676F, 2.0756F, -0.0704F, 0.032F, -0.0436F, 0.5219F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, -0.025F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.7676F, 2.0756F, -0.0704F, 0.6865F, -0.0436F, 0.5219F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(78, 78).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.7676F, 2.0756F, -0.0704F, -0.6225F, -0.0436F, 0.5219F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, -0.35F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.1768F, 1.0197F, 0.2589F, 1.3846F, -0.0436F, 0.5219F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.3F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2612F, 1.1558F, 0.3787F, 2.2137F, -0.0436F, 0.5219F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 8).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2612F, 1.1558F, 0.3787F, 1.6028F, -0.0436F, 0.5219F));

		PartDefinition bone4 = Body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7845F, -0.3353F, -16.4146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r207 = bone4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2143F, 1.0318F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0423F, 0.3805F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3153F, 0.4264F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-3.5F, -0.3F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(3.5F, -0.0283F, 0.0835F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.5F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.7676F, 2.0756F, -0.0704F, 0.032F, 0.0436F, -0.5219F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5F, -0.025F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.7676F, 2.0756F, -0.0704F, 0.6865F, 0.0436F, -0.5219F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.7676F, 2.0756F, -0.0704F, -0.6225F, 0.0436F, -0.5219F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-0.5F, -0.35F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.1768F, 1.0197F, 0.2589F, 1.3846F, 0.0436F, -0.5219F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.5F, -0.3F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2612F, 1.1558F, 0.3787F, 2.2137F, 0.0436F, -0.5219F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2612F, 1.1558F, 0.3787F, 1.6028F, 0.0436F, -0.5219F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(76, 11).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.635F, 0.3933F, -15.7659F, -0.733F, 0.5672F, 0.0F));

		PartDefinition cube_r217 = UpperArmL.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 20).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, 0.006F, 0.0121F));

		PartDefinition cube_r218 = UpperArmL.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(76, 17).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(76, 14).addBox(-0.5F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r219 = UpperArmL.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 48).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(74, 42).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 45).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 58).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 66).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition cube_r220 = HandL.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(30, 78).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.235F, 0.3933F, -15.7659F, -0.8802F, -0.7494F, 0.2388F));

		PartDefinition cube_r221 = UpperArmL2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(73, 78).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0884F, -0.006F, -0.0121F));

		PartDefinition cube_r222 = UpperArmL2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(78, 61).addBox(-0.5F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(78, 54).addBox(-0.5F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r223 = UpperArmL2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(78, 30).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(74, 69).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 75).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 75).addBox(-0.5F, -0.95F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(26, 75).addBox(-0.5F, -0.025F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition cube_r224 = HandL2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(53, 50).addBox(-0.5F, -1.85F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(28, 31).addBox(-0.435F, -0.475F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(30, 84).addBox(0.065F, -2.175F, 0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.135F, -3.0567F, -11.5659F, 0.1141F, 0.2181F, 0.0058F));

		PartDefinition cube_r225 = Body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(84, 32).addBox(1.065F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.475F, 2.95F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r23 = Body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.365F, 0.0308F, -0.3001F));

		PartDefinition Bodymiddle_r24 = Body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.3177F, 0.1701F, -0.7622F));

		PartDefinition Bodymiddle_r25 = Body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.2099F, 0.273F, -1.2432F));

		PartDefinition Bodymiddle_r26 = Body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.1866F, 0.2356F, -1.2491F));

		PartDefinition Bodymiddle_r27 = Body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.28F, 0.1474F, -0.7681F));

		PartDefinition Bodymiddle_r28 = Body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.3215F, 0.0272F, -0.3014F));

		PartDefinition Bodymiddle_r29 = Body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(40, 67).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.2099F, -0.273F, 1.2432F));

		PartDefinition Bodymiddle_r30 = Body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(69, 52).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.3177F, -0.1701F, 0.7622F));

		PartDefinition Bodymiddle_r31 = Body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(84, 57).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.365F, -0.0308F, 0.3001F));

		PartDefinition Bodymiddle_r32 = Body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(55, 48).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.3215F, -0.0272F, 0.3014F));

		PartDefinition Bodymiddle_r33 = Body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(69, 22).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.28F, -0.1474F, 0.7681F));

		PartDefinition Bodymiddle_r34 = Body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(60, 52).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.1866F, -0.2356F, 1.2491F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(27, 0).addBox(-0.435F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(21, 12).addBox(-1.935F, 3.9249F, 0.9078F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(84, 36).addBox(0.065F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 40).addBox(0.065F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 44).addBox(0.065F, -2.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0528F, 0.1307F, -0.0069F));

		PartDefinition Bodymiddle_r35 = bone.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.2875F, 0.152F, -0.767F));

		PartDefinition Bodymiddle_r36 = bone.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(42, 86).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.3302F, 0.0279F, -0.3012F));

		PartDefinition Bodymiddle_r37 = bone.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.1912F, 0.2431F, -1.248F));

		PartDefinition Bodymiddle_r38 = bone.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.2875F, 0.152F, -0.767F));

		PartDefinition Bodymiddle_r39 = bone.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(86, 18).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.3302F, 0.0279F, -0.3012F));

		PartDefinition Bodymiddle_r40 = bone.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.1912F, 0.2431F, -1.248F));

		PartDefinition Bodymiddle_r41 = bone.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.365F, 0.0308F, -0.3001F));

		PartDefinition Bodymiddle_r42 = bone.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.3177F, 0.1701F, -0.7622F));

		PartDefinition Bodymiddle_r43 = bone.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.2099F, 0.273F, -1.2432F));

		PartDefinition Bodymiddle_r44 = bone.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(49, 67).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.1912F, -0.2431F, 1.248F));

		PartDefinition Bodymiddle_r45 = bone.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(42, 86).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.3302F, -0.0279F, 0.3012F));

		PartDefinition Bodymiddle_r46 = bone.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(14, 71).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.2875F, -0.152F, 0.767F));

		PartDefinition Bodymiddle_r47 = bone.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(62, 4).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.1912F, -0.2431F, 1.248F));

		PartDefinition Bodymiddle_r48 = bone.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(86, 18).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.3302F, -0.0279F, 0.3012F));

		PartDefinition Bodymiddle_r49 = bone.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(71, 5).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.2875F, -0.152F, 0.767F));

		PartDefinition Bodymiddle_r50 = bone.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(86, 0).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.365F, -0.0308F, 0.3001F));

		PartDefinition Bodymiddle_r51 = bone.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(71, 3).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.3177F, -0.1701F, 0.7622F));

		PartDefinition Bodymiddle_r52 = bone.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(67, 48).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.2099F, -0.273F, 1.2432F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0333F, 0.1744F, 0.0058F));

		PartDefinition cube_r226 = Body3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 0).addBox(-0.935F, -1.8199F, -0.0006F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.6829F, 0.7948F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Body3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(84, 63).addBox(1.065F, -1.5F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(87, 42).addBox(1.065F, -1.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(67, 86).addBox(1.065F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(18, 51).addBox(1.065F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(21, 21).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r53 = Body3.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.4346F, 0.0364F, -0.4723F));

		PartDefinition Bodymiddle_r54 = Body3.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.3787F, 0.2059F, -0.9253F));

		PartDefinition Bodymiddle_r55 = Body3.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.2482F, 0.3324F, -1.4063F));

		PartDefinition Bodymiddle_r56 = Body3.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(86, 50).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 4.5275F, 0.3998F, 0.0336F, -0.4299F));

		PartDefinition Bodymiddle_r57 = Body3.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 4.5275F, 0.3481F, 0.1881F, -0.8877F));

		PartDefinition Bodymiddle_r58 = Body3.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 4.5275F, 0.2289F, 0.3028F, -1.3687F));

		PartDefinition Bodymiddle_r59 = Body3.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1034F, 2.5275F, 0.365F, 0.0308F, -0.3874F));

		PartDefinition Bodymiddle_r60 = Body3.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1034F, 2.5275F, 0.3177F, 0.1701F, -0.8494F));

		PartDefinition Bodymiddle_r61 = Body3.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(58, 67).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1034F, 2.5275F, 0.2099F, 0.273F, -1.3305F));

		PartDefinition Bodymiddle_r62 = Body3.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(26, 71).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.5275F, 0.2875F, 0.152F, -0.8107F));

		PartDefinition Bodymiddle_r63 = Body3.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.5275F, 0.3302F, 0.0279F, -0.3448F));

		PartDefinition Bodymiddle_r64 = Body3.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 0.5275F, 0.1912F, 0.2431F, -1.2916F));

		PartDefinition Bodymiddle_r65 = Body3.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(74, 7).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.2482F, -0.3324F, 1.4063F));

		PartDefinition Bodymiddle_r66 = Body3.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(7, 72).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.3787F, -0.2059F, 0.9253F));

		PartDefinition Bodymiddle_r67 = Body3.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(52, 86).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.4346F, -0.0364F, 0.4723F));

		PartDefinition Bodymiddle_r68 = Body3.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(62, 6).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 4.5275F, 0.2289F, -0.3028F, 1.3687F));

		PartDefinition Bodymiddle_r69 = Body3.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(0, 72).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 4.5275F, 0.3481F, -0.1881F, 0.8877F));

		PartDefinition Bodymiddle_r70 = Body3.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(86, 50).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 4.5275F, 0.3998F, -0.0336F, 0.4299F));

		PartDefinition Bodymiddle_r71 = Body3.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(58, 67).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1034F, 2.5275F, 0.2099F, -0.273F, 1.3305F));

		PartDefinition Bodymiddle_r72 = Body3.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(67, 71).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1034F, 2.5275F, 0.3177F, -0.1701F, 0.8494F));

		PartDefinition Bodymiddle_r73 = Body3.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(86, 48).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1034F, 2.5275F, 0.365F, -0.0308F, 0.3874F));

		PartDefinition Bodymiddle_r74 = Body3.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(67, 50).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.5275F, 0.1912F, -0.2431F, 1.2916F));

		PartDefinition Bodymiddle_r75 = Body3.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(47, 86).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.5275F, 0.3302F, -0.0279F, 0.3448F));

		PartDefinition Bodymiddle_r76 = Body3.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(26, 71).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 0.5275F, 0.2875F, -0.152F, 0.8107F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition cube_r228 = body5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 84).addBox(1.065F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(70, 84).addBox(1.065F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(11, 45).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r77 = body5.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.4956F, 0.0412F, -0.5136F));

		PartDefinition Bodymiddle_r78 = body5.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.4329F, 0.2366F, -0.957F));

		PartDefinition Bodymiddle_r79 = body5.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.4694F, 0.0392F, -0.5146F));

		PartDefinition Bodymiddle_r80 = body5.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.4096F, 0.2236F, -0.9624F));

		PartDefinition Bodymiddle_r81 = body5.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-3.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.2679F, 0.362F, -1.4432F));

		PartDefinition Bodymiddle_r82 = body5.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(73, 26).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.4329F, -0.2366F, 0.957F));

		PartDefinition Bodymiddle_r83 = body5.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(87, 36).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.4956F, -0.0412F, 0.5136F));

		PartDefinition Bodymiddle_r84 = body5.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(86, 52).addBox(2.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.2679F, -0.362F, 1.4432F));

		PartDefinition Bodymiddle_r85 = body5.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(33, 72).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.4096F, -0.2236F, 0.9624F));

		PartDefinition Bodymiddle_r86 = body5.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(57, 86).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.4694F, -0.0392F, 0.5146F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.0918F, -0.3042F, -0.0276F));

		PartDefinition cube_r229 = Body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 14).addBox(1.065F, 1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0072F, 4.0813F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 84).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0072F, 4.0813F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(79, 84).addBox(1.065F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1672F, 2.0889F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r232 = Body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(76, 84).addBox(1.065F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3415F, 0.0965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-2.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 0).addBox(-0.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-1.565F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1299F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r87 = Body4.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1018F, 0.4183F, 0.5827F, 0.0478F, -0.5534F));

		PartDefinition Bodymiddle_r88 = Body4.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-1.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1018F, 0.4183F, 0.5116F, 0.2793F, -0.9806F));

		PartDefinition Bodymiddle_r89 = Body4.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(62, 86).addBox(0.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1018F, 0.4183F, 0.5116F, -0.2793F, 0.9806F));

		PartDefinition Bodymiddle_r90 = Body4.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(0, 87).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1018F, 0.4183F, 0.5827F, -0.0478F, 0.5534F));

		PartDefinition bone3 = Body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.6414F, 3.1523F, 2.3824F));

		PartDefinition cube_r234 = bone3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(60, 80).addBox(-1.1075F, -0.4045F, 0.5432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 80).addBox(-1.1075F, -0.4045F, -0.0568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3761F, 0.9558F, -1.8583F, -3.1214F, 0.2606F, 0.4553F));

		PartDefinition cube_r235 = bone3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(50, 80).addBox(-1.1075F, -0.5436F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.3318F, 0.515F, -2.4359F, 2.8127F, 0.2606F, 0.4553F));

		PartDefinition cube_r236 = bone3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(45, 80).addBox(-1.1075F, -0.7137F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.3318F, 0.515F, -2.4359F, -3.0342F, 0.2606F, 0.4553F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 16).addBox(-1.2067F, -0.435F, -0.3176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.5765F, -0.1537F, -1.3797F, -2.336F, 0.2606F, 0.4553F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 20).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -1.4805F, 0.1238F, -0.2313F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(35, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -0.8696F, 0.1238F, -0.2313F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(25, 58).addBox(-1.1061F, -0.3413F, -0.7639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4153F, -0.2747F, -0.0272F, -0.9569F, 0.1238F, 0.5105F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(42, 69).addBox(-1.1061F, -0.4104F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9974F, 0.7016F, -0.2752F, -2.8767F, 0.1238F, 0.5105F));

		PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 83).addBox(-1.1061F, -0.1762F, -0.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8305F, 0.8834F, 1.6087F, -0.6078F, 0.1238F, 0.5105F));

		PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 30).addBox(-1.5955F, -2.0331F, -0.4453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.7423F, 1.1596F, -0.6513F, -1.5765F, 0.1238F, 0.5105F));

		PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(52, 69).addBox(-1.5955F, -1.8452F, 0.2571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6114F, 0.1238F, 0.5105F));

		PartDefinition bone5 = Body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.5115F, 3.1523F, 2.3824F));

		PartDefinition cube_r245 = bone5.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(0.1075F, -0.4045F, 0.5432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(55, 80).mirror().addBox(0.1075F, -0.4045F, -0.0568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3761F, 0.9558F, -1.8583F, -3.1214F, -0.2606F, -0.4553F));

		PartDefinition cube_r246 = bone5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(0.1075F, -0.5436F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.3318F, 0.515F, -2.4359F, 2.8127F, -0.2606F, -0.4553F));

		PartDefinition cube_r247 = bone5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(0.1075F, -0.7137F, -0.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.3318F, 0.515F, -2.4359F, -3.0342F, -0.2606F, -0.4553F));

		PartDefinition cube_r248 = bone5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(0.2067F, -0.435F, -0.3176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.5765F, -0.1537F, -1.3797F, -2.336F, -0.2606F, -0.4553F));

		PartDefinition cube_r249 = bone5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(62, 20).mirror().addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -1.4805F, -0.1238F, 0.2313F));

		PartDefinition cube_r250 = bone5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(35, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -0.8696F, -0.1238F, 0.2313F));

		PartDefinition cube_r251 = bone5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(0.1061F, -0.3413F, -0.7639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4153F, -0.2747F, -0.0272F, -0.9569F, -0.1238F, -0.5105F));

		PartDefinition cube_r252 = bone5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(0.1061F, -0.4104F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9974F, 0.7016F, -0.2752F, -2.8767F, -0.1238F, -0.5105F));

		PartDefinition cube_r253 = bone5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(0.1061F, -0.1762F, -0.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8305F, 0.8834F, 1.6087F, -0.6078F, -0.1238F, -0.5105F));

		PartDefinition cube_r254 = bone5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(0.5955F, -2.0331F, -0.4453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.7423F, 1.1596F, -0.6513F, -1.5765F, -0.1238F, -0.5105F));

		PartDefinition cube_r255 = bone5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(0.5955F, -1.8452F, 0.2571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6114F, -0.1238F, -0.5105F));

		PartDefinition UpperLegL = Body4.addOrReplaceChild("UpperLegL", CubeListBuilder.create().texOffs(80, 23).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7713F, 2.194F, 1.1951F, 0.1824F, -0.069F, -0.7006F));

		PartDefinition cube_r256 = UpperLegL.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(21, 74).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 3.1429F, -2.6951F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r257 = UpperLegL.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(40, 73).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.1429F, -2.6951F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r258 = UpperLegL.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(69, 43).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r259 = UpperLegL.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(65, 80).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create().texOffs(68, 62).addBox(-1.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 24).addBox(-1.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2006F, 5.8405F, -1.7879F, 0.4039F, 0.106F, -0.6168F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(26, 38).addBox(-0.75F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2926F, 3.4146F, -0.1261F, 0.1347F, 0.3724F, 0.072F));

		PartDefinition UpperLegL2 = Body4.addOrReplaceChild("UpperLegL2", CubeListBuilder.create().texOffs(83, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.6414F, 2.194F, 1.1951F, 0.8805F, 0.069F, 0.7006F));

		PartDefinition cube_r260 = UpperLegL2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(33, 74).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.1429F, -2.6951F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r261 = UpperLegL2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.1429F, -2.6951F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r262 = UpperLegL2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(47, 69).addBox(-0.5F, 0.15F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r263 = UpperLegL2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(83, 29).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create().texOffs(69, 8).addBox(0.05F, 0.35F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 29).addBox(0.05F, 0.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2006F, 5.8405F, -1.7879F, 0.3747F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(35, 38).addBox(-0.25F, -0.3F, -1.85F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2926F, 3.4146F, -0.1261F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(42, 6).addBox(-0.435F, -0.3651F, -0.0129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, -0.0564F, -0.1307F, 0.0074F));

		PartDefinition cube_r264 = Tail.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(85, 25).addBox(1.065F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3651F, 1.9871F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Tail.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(85, 21).addBox(1.065F, -1.4F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4651F, -0.0629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Tail.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(53, 4).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1349F, -0.0129F, 0.0068F, 0.0342F, 0.0016F));

		PartDefinition cube_r267 = Tail.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(53, 4).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1349F, -0.0129F, 0.0068F, -0.0342F, -0.0016F));

		PartDefinition cube_r268 = Tail.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(36, 86).addBox(1.065F, -0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 86).addBox(1.065F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.6896F, 1.4622F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(44, 38).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r269 = tail5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 71).addBox(1.065F, -1.8F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4F, 2.05F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r270 = tail5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 67).addBox(1.065F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r271 = tail5.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.335F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r272 = tail5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(53, 8).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.465F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r273 = tail5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(17, 26).addBox(1.065F, 1.4F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 86).addBox(1.065F, 0.5F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -2.5248F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 12).addBox(-0.435F, -0.478F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0148F, -0.1309F, -0.0019F));

		PartDefinition cube_r274 = Tail2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(85, 83).addBox(1.065F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 2.0123F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Tail2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 79).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 0.0123F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r276 = Tail2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.022F, 0.0123F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r277 = Tail2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(53, 12).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.022F, 0.0123F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r278 = Tail2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(85, 87).addBox(1.065F, 3.3F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 63).addBox(1.065F, 2.3F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -6.4998F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r279 = tail6.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(17, 22).addBox(1.065F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r280 = tail6.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(88, 2).addBox(1.065F, 3.9F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5327F, -10.5122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r281 = tail6.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(86, 6).addBox(1.065F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(41, 32).addBox(-0.435F, -0.0994F, 0.0567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, -0.0061F, 0.2182F, -0.0013F));

		PartDefinition cube_r282 = Tail3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(86, 10).addBox(1.065F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 0.0567F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r283 = Tail3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(22, 45).addBox(1.065F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 2.0567F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Tail3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(24, 88).addBox(1.065F, 6.3F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 88).addBox(1.065F, 4.6F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.9327F, -14.4122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(44, 44).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r285 = tail7.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 59).addBox(1.065F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.1F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r286 = tail7.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(14, 56).addBox(1.065F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r287 = tail7.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(27, 88).addBox(1.065F, 8.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 26).addBox(1.065F, 7.1F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5321F, -18.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 45).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0189F, 0.3926F, -0.0072F));

		PartDefinition cube_r288 = tail8.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(88, 20).addBox(1.065F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 2.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r289 = tail8.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(18, 88).addBox(1.065F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r290 = tail8.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(30, 88).addBox(1.065F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3587F, 3.6612F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r291 = tail8.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 29).addBox(1.065F, 8.9F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5321F, -22.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(62, 0).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(21, 88).addBox(0.065F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0915F, 0.3042F, -0.0275F));

		PartDefinition cube_r292 = tail9.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(88, 23).addBox(1.065F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r293 = tail9.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(80, 26).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r294 = tail9.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(42, 88).addBox(1.065F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.511F, 1.6579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2928F, 2.5703F, -0.0894F, 0.3043F, -0.0268F));

		PartDefinition cube_r295 = Tail4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 51).addBox(0.565F, 0.2475F, 3.5409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Tail4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(55, 40).addBox(0.565F, -0.8657F, 1.7585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Tail4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(7, 56).addBox(0.565F, -1.0152F, -0.2699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r298 = Tail4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(54, 88).addBox(1.065F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.406F, 1.5541F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Tail4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(51, 88).addBox(1.065F, 0.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 38).addBox(0.565F, 0.8F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Tail4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(48, 88).addBox(1.065F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 88).addBox(1.065F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.153F, 0.881F, -0.7243F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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