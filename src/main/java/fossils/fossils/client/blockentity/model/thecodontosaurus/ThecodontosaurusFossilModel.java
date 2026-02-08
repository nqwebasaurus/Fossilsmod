package fossils.fossils.client.blockentity.model.thecodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThecodontosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Thecodontosaurus;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
	private final ModelPart Tail10;
	private final ModelPart Tail11;
	private final ModelPart Tail12;
	private final ModelPart Tail13;
	private final ModelPart Tail14;
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

	public ThecodontosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Thecodontosaurus = this.fossil.getChild("Thecodontosaurus");
		this.bone = this.Thecodontosaurus.getChild("bone");
		this.bone4 = this.Thecodontosaurus.getChild("bone4");
		this.Body = this.Thecodontosaurus.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Head = this.Neck5.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Thecodontosaurus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.Tail10 = this.Tail9.getChild("Tail10");
		this.Tail11 = this.Tail10.getChild("Tail11");
		this.Tail12 = this.Tail11.getChild("Tail12");
		this.Tail13 = this.Tail12.getChild("Tail13");
		this.Tail14 = this.Tail13.getChild("Tail14");
		this.RLeg = this.Thecodontosaurus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Thecodontosaurus.getChild("RLeg4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Thecodontosaurus = fossil.addOrReplaceChild("Thecodontosaurus", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.7293F, -2.185F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(43, 14).addBox(0.5F, -0.2293F, -1.185F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(43, 14).mirror().addBox(-1.5F, -0.2293F, -1.185F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 92).addBox(0.0F, -2.4308F, -0.1834F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.7674F, -1.7865F, -0.0902F, 0.0159F, 0.1738F));

		PartDefinition cube_r1 = Thecodontosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 60).addBox(0.0F, -1.9087F, -0.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6205F, 1.8201F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Thecodontosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 92).addBox(0.0F, -1.4734F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7293F, -2.16F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone = Thecodontosaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1402F, 1.5661F, 0.8884F, 0.0519F, -0.0073F, 0.1394F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 50).addBox(-0.9F, -1.9419F, 0.0815F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.7106F, -1.5759F, -0.7108F, -0.0087F, 0.0F, -0.1745F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0396F, -3.0777F, 3.3256F, 0.1396F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 12).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.1651F, -2.3657F, 3.3745F, 0.2269F, 0.0F, -0.1745F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(89, 57).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.022F)), PartPose.offsetAndRotation(0.2446F, -1.915F, 1.7682F, 0.6632F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 89).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1917F, -2.2149F, 2.2852F, 0.5323F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 4).addBox(-0.5F, -0.35F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.1041F, -2.7118F, 1.2045F, 0.1396F, 0.0F, -0.1745F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 77).addBox(-0.7809F, -0.3361F, 0.1817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2288F, 2.056F, -3.29F, -0.3946F, -0.0245F, 0.1552F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 88).addBox(-0.2963F, 3.163F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(83, 76).addBox(-0.2963F, 2.463F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5083F, 3.684F, -3.5067F, -0.0287F, -0.0308F, -0.0721F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 41).addBox(-0.2963F, -0.1971F, -0.2687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5083F, 3.684F, -3.5067F, -0.116F, -0.0308F, -0.0721F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 0).addBox(-0.7809F, -0.1671F, -0.1262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2288F, 2.056F, -3.29F, -0.2026F, -0.0245F, 0.1552F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1038F, 0.056F, -2.89F, -0.1954F, -0.0458F, 0.1503F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2271F, -0.8409F, -2.4652F, -0.439F, -0.0352F, 0.1531F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(72, 12).addBox(-1.1F, 1.4489F, -0.684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.0106F, -1.7522F, -0.0993F, -0.8901F, 0.0F, 0.1571F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 91).addBox(-0.5F, 0.1F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.012F, -3.234F, -1.5765F, 0.3752F, 0.0F, -0.1745F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 76).addBox(-0.9F, -1.0227F, -0.2341F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(58, 76).addBox(-0.9F, -1.0227F, 0.0659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.7106F, -1.5759F, -0.7108F, 1.5272F, 0.0F, -0.1745F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 29).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0299F, -3.1327F, -1.5765F, 0.288F, 0.0F, -0.1745F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(81, 66).addBox(-0.5F, -0.3F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.0225F, 0.7351F, -1.1828F, -1.1345F, 0.0F, 0.1571F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 83).addBox(-0.5F, -0.9F, 2.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(11, 54).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.201F, 1.6108F, 1.8838F, -0.5898F, -0.0006F, 0.1918F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 31).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1873F, 1.7045F, 2.0229F, -0.2433F, -0.1034F, 0.1928F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 21).addBox(-0.8015F, -0.1656F, -3.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0976F, 2.0454F, 3.4649F, -0.7495F, -0.1034F, 0.1928F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 43).addBox(-0.9F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.3393F, 0.6048F, 1.2934F, -1.0595F, -0.0779F, 0.1469F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 61).addBox(-0.5F, -1.0F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0179F, 0.4797F, -0.0719F, -1.4835F, 0.0F, 0.1571F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 71).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.2235F, -0.6181F, 0.158F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 71).addBox(-1.125F, -0.1813F, -1.5595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.8522F, -0.7526F, -0.3941F, -0.5661F, -0.0375F, 0.0982F));

		PartDefinition bone4 = Thecodontosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1402F, 1.5661F, 0.8884F, 0.0519F, 0.0073F, -0.1394F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(42, 50).mirror().addBox(-0.1F, -1.9419F, 0.0815F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.7106F, -1.5759F, -0.7108F, -0.0087F, 0.0F, 0.1745F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.0396F, -3.0777F, 3.3256F, 0.1396F, 0.0F, 0.1745F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1651F, -2.3657F, 3.3745F, 0.2269F, 0.0F, 0.1745F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.022F)).mirror(false), PartPose.offsetAndRotation(-0.2446F, -1.915F, 1.7682F, 0.6632F, 0.0F, 0.1745F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.1917F, -2.2149F, 2.2852F, 0.5323F, 0.0F, 0.1745F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-0.5F, -0.35F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, -2.7118F, 1.2045F, 0.1396F, 0.0F, 0.1745F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-0.2191F, -0.3361F, 0.1817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2288F, 2.056F, -3.29F, -0.3946F, 0.0245F, -0.1552F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-0.7037F, 3.163F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(83, 76).mirror().addBox(-0.7037F, 2.463F, -0.4921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5083F, 3.684F, -3.5067F, -0.0287F, 0.0308F, 0.0721F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-0.7037F, -0.1971F, -0.2687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5083F, 3.684F, -3.5067F, -0.116F, 0.0308F, 0.0721F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.2191F, -0.1671F, -0.1262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2288F, 2.056F, -3.29F, -0.2026F, 0.0245F, -0.1552F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1038F, 0.056F, -2.89F, -0.1954F, 0.0458F, -0.1503F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2271F, -0.8409F, -2.4652F, -0.439F, 0.0352F, -0.1531F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(0.1F, 1.4489F, -0.684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0106F, -1.7522F, -0.0993F, -0.8901F, 0.0F, -0.1571F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-0.5F, 0.1F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.012F, -3.234F, -1.5765F, 0.3752F, 0.0F, 0.1745F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 76).mirror().addBox(-0.1F, -1.0227F, -0.2341F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(58, 76).mirror().addBox(-0.1F, -1.0227F, 0.0659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.7106F, -1.5759F, -0.7108F, 1.5272F, 0.0F, 0.1745F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.0299F, -3.1327F, -1.5765F, 0.288F, 0.0F, 0.1745F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-0.5F, -0.3F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.0225F, 0.7351F, -1.1828F, -1.1345F, 0.0F, -0.1571F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(37, 83).mirror().addBox(-0.5F, -0.9F, 2.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(11, 54).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.201F, 1.6108F, 1.8838F, -0.5898F, 0.0006F, -0.1918F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1873F, 1.7045F, 2.0229F, -0.2433F, 0.1034F, -0.1928F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 21).mirror().addBox(-0.1985F, -0.1656F, -3.3072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0976F, 2.0454F, 3.4649F, -0.7495F, 0.1034F, -0.1928F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.1F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(-0.3393F, 0.6048F, 1.2934F, -1.0595F, 0.0779F, -0.1469F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-0.5F, -1.0F, -1.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.0179F, 0.4797F, -0.0719F, -1.4835F, 0.0F, -0.1571F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.2235F, -0.6181F, 0.158F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 71).mirror().addBox(0.125F, -0.1813F, -1.5595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.8522F, -0.7526F, -0.3941F, -0.5661F, 0.0375F, -0.0982F));

		PartDefinition Body = Thecodontosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1779F, -1.8967F, 0.2573F, -0.0734F, -0.0642F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(93, 74).addBox(0.0F, -1.3435F, 0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9619F, -2.1041F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(74, 93).addBox(0.0F, -1.248F, 0.0162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2794F, -4.0749F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(30, 15).addBox(-0.5F, -0.9495F, -0.2088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 81).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6324F, -1.5851F, -0.027F, -0.0776F, -1.6113F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6324F, -1.5851F, -0.0563F, -0.0599F, -1.1917F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6324F, -1.5851F, -0.0752F, -0.0332F, -0.7908F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0074F, -3.6601F, 0.0481F, 0.0376F, -0.6885F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0074F, -3.6601F, 0.0296F, 0.0535F, -1.0901F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0074F, -3.6601F, 0.0053F, 0.0609F, -1.5096F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 81).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6324F, -1.5851F, -0.027F, 0.0776F, 1.6113F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(93, 45).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6324F, -1.5851F, -0.0563F, 0.0599F, 1.1917F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(93, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6324F, -1.5851F, -0.0752F, 0.0332F, 0.7908F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0074F, -3.6601F, 0.0481F, -0.0376F, 0.6885F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 89).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0074F, -3.6601F, 0.0296F, -0.0535F, 1.0901F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(65, 17).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0074F, -3.6601F, 0.0053F, -0.0609F, 1.5096F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, -3.0851F, -0.0478F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 7.9549F, -7.1842F, -0.2443F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1936F, -0.1285F, 0.0251F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(41, 94).addBox(0.0F, -1.0492F, -0.1984F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -0.8804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(92, 85).addBox(0.0F, -0.975F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -2.5804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(71, 92).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -4.5804F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0049F, -0.5967F, 0.2166F, 0.1634F, -0.6367F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0049F, -0.5967F, 0.1357F, 0.2347F, -1.0399F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0049F, -0.5967F, 0.0266F, 0.2692F, -1.4712F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0951F, -2.4967F, 0.2451F, 0.1841F, -0.6318F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0951F, -2.4967F, 0.154F, 0.2648F, -1.0354F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0951F, -2.4967F, 0.0302F, 0.304F, -1.4702F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(43, 20).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -4.4967F, 0.033F, 0.3212F, -1.417F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -4.4967F, 0.1641F, 0.2793F, -0.9803F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 92).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -4.4967F, 0.26F, 0.1936F, -0.5766F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(58, 19).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0049F, -0.5967F, 0.0266F, -0.2692F, 1.4712F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(93, 82).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0049F, -0.5967F, 0.1357F, -0.2347F, 1.0399F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(94, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0049F, -0.5967F, 0.2166F, -0.1634F, 0.6367F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(92, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0951F, -2.4967F, 0.2451F, -0.1841F, 0.6318F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 17).addBox(-1.5F, -2.8F, -4.7F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 10.0858F, 0.0835F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 70).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0951F, -2.4967F, 0.154F, -0.2648F, 1.0354F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(52, 41).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0951F, -2.4967F, 0.0302F, -0.304F, 1.4702F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 20).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -4.4967F, 0.033F, -0.3212F, 1.417F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(92, 68).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -4.4967F, 0.1641F, -0.2793F, 0.9803F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 92).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -4.4967F, 0.26F, -0.1936F, 0.5766F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 24).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5905F, -5.1274F, -0.0499F, -0.1355F, -0.0799F));

		PartDefinition cube_r90 = Body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 20).addBox(0.0F, -0.475F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8027F, -1.5073F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(17, 74).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1147F, -3.9347F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 70).addBox(0.0F, -0.675F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1826F, -5.8113F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -5.4101F, 0.4425F, 0.3058F, -0.5134F));

		PartDefinition cube_r94 = Body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -5.4101F, 0.2911F, 0.4519F, -0.9168F));

		PartDefinition cube_r95 = Body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(30, 22).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -5.4101F, 0.0675F, 0.5282F, -1.3848F));

		PartDefinition cube_r96 = Body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(17, 8).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2877F, 6.5386F, -5.4716F, -0.1281F, -0.5053F, 0.5129F));

		PartDefinition cube_r97 = Body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2553F, 6.5267F, -5.5199F, -0.0736F, -0.6573F, 0.6787F));

		PartDefinition cube_r98 = Body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -3.4101F, 0.3526F, 0.2458F, -0.4514F));

		PartDefinition cube_r99 = Body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -3.4101F, 0.2302F, 0.3628F, -0.8545F));

		PartDefinition cube_r100 = Body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(17, 15).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -3.4101F, 0.0555F, 0.4235F, -1.3038F));

		PartDefinition cube_r101 = Body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -1.4101F, 0.3392F, 0.2344F, -0.5076F));

		PartDefinition cube_r102 = Body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 29).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -1.4101F, 0.0554F, 0.4061F, -1.3568F));

		PartDefinition cube_r103 = Body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -1.4101F, 0.2221F, 0.3472F, -0.9102F));

		PartDefinition cube_r104 = Body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -5.4101F, 0.4425F, -0.3058F, 0.5134F));

		PartDefinition cube_r105 = Body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 83).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -5.4101F, 0.2911F, -0.4519F, 0.9168F));

		PartDefinition cube_r106 = Body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 22).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -5.4101F, 0.0675F, -0.5282F, 1.3848F));

		PartDefinition cube_r107 = Body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2877F, 6.5386F, -5.4716F, -0.1281F, 0.5053F, -0.5129F));

		PartDefinition cube_r108 = Body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(52, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2553F, 6.5267F, -5.5199F, -0.0736F, 0.6573F, -0.6787F));

		PartDefinition cube_r109 = Body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 35).addBox(-1.4494F, -0.1706F, -1.3592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.9494F, 6.3858F, -5.0486F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 27).addBox(-1.9494F, 0.1998F, -3.0469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.9494F, 6.3858F, -5.0486F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -3.4101F, 0.3526F, -0.2458F, 0.4514F));

		PartDefinition cube_r112 = Body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(65, 62).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -3.4101F, 0.2302F, -0.3628F, 0.8545F));

		PartDefinition cube_r113 = Body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(17, 15).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -3.4101F, 0.0555F, -0.4235F, 1.3038F));

		PartDefinition cube_r114 = Body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -1.4101F, 0.3392F, -0.2344F, 0.5076F));

		PartDefinition cube_r115 = Body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -2.05F, -0.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 7.827F, -3.8261F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(41, 29).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -1.4101F, 0.0554F, -0.4061F, 1.3568F));

		PartDefinition cube_r117 = Body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 43).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -1.4101F, 0.2221F, -0.3472F, 0.9102F));

		PartDefinition cube_r118 = Body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 4.8602F, -5.9905F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -0.8341F, 2.5577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2354F, 0.9625F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 62).addBox(-0.5F, -1.6005F, 5.9697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.8354F, -0.7125F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.6637F, 6.1378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.5F, -0.8354F, -0.7125F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(82, 53).addBox(-0.5F, 3.835F, 4.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.8354F, -0.7125F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(42, 85).addBox(-0.4773F, -1.2517F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F))
				.texOffs(83, 82).addBox(-0.4773F, -1.5517F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0259F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -2.9431F, 0.6339F, 0.4486F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(79, 37).addBox(-0.4773F, -2.0528F, 0.1815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -2.1665F, 0.6339F, 0.4486F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(77, 54).addBox(-0.4773F, -0.4537F, 0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -2.5155F, 0.6339F, 0.4486F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 49).addBox(-0.4773F, -1.1223F, -0.679F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0243F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -2.0792F, 0.6339F, 0.4486F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(83, 79).addBox(-0.4773F, 0.1425F, -1.6477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -1.4683F, 0.6339F, 0.4486F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(56, 64).addBox(-0.4773F, -0.8572F, -1.5257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-1.4918F, 0.0314F, -0.7824F, -1.0058F, 0.6339F, 0.4486F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(41, 67).addBox(-1.1F, -0.5516F, -2.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.029F)), PartPose.offsetAndRotation(0.1F, -1.231F, 1.0967F, 0.4276F, 0.1745F, 0.0524F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 89).addBox(-1.1F, -0.5607F, -1.9493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.1F, -1.231F, 0.8967F, 0.0785F, 0.1745F, 0.0524F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(89, 40).addBox(-1.1F, -0.4618F, -1.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.1F, -1.231F, 1.0967F, 0.8639F, 0.1745F, 0.0524F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(89, 37).addBox(-1.1F, -0.3872F, -0.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.1F, -1.231F, 1.0967F, 0.7767F, 0.1745F, 0.0524F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 54).addBox(-0.5F, -0.2595F, -0.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.5F, -1.2354F, 0.9625F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(50, 89).addBox(-0.5F, -0.6181F, 0.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.5F, -1.2354F, 0.9625F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 34).addBox(-1.1F, -0.6413F, -0.8969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.1F, -1.231F, 0.8967F, 0.1658F, 0.1745F, 0.0524F));

		PartDefinition cube_r136 = bone2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.457F, 0.1174F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.029F)), PartPose.offsetAndRotation(-0.5F, -1.2354F, 0.9625F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(49, 64).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -2.9382F, 4.2386F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 4.8602F, -5.9905F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-0.5F, -0.8341F, 2.5577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2354F, 0.9625F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r139 = bone3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.5F, -1.6005F, 5.9697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8354F, -0.7125F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = bone3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, -0.6637F, 6.1378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8354F, -0.7125F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r141 = bone3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.5F, 3.835F, 4.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8354F, -0.7125F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.5227F, -1.2517F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)).mirror(false)
				.texOffs(83, 82).mirror().addBox(-0.5227F, -1.5517F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0259F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -2.9431F, -0.6339F, -0.4486F));

		PartDefinition cube_r143 = bone3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-0.5227F, -2.0528F, 0.1815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -2.1665F, -0.6339F, -0.4486F));

		PartDefinition cube_r144 = bone3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5227F, -0.4537F, 0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -2.5155F, -0.6339F, -0.4486F));

		PartDefinition cube_r145 = bone3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-0.5227F, -1.1223F, -0.679F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0243F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -2.0792F, -0.6339F, -0.4486F));

		PartDefinition cube_r146 = bone3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 79).mirror().addBox(-0.5227F, 0.1425F, -1.6477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -1.4683F, -0.6339F, -0.4486F));

		PartDefinition cube_r147 = bone3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.5227F, -0.8572F, -1.5257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(1.4918F, 0.0314F, -0.7824F, -1.0058F, -0.6339F, -0.4486F));

		PartDefinition cube_r148 = bone3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(0.1F, -0.5516F, -2.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.029F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.231F, 1.0967F, 0.4276F, -0.1745F, -0.0524F));

		PartDefinition cube_r149 = bone3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(0.1F, -0.5607F, -1.9493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.231F, 0.8967F, 0.0785F, -0.1745F, -0.0524F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(0.1F, -0.4618F, -1.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.231F, 1.0967F, 0.8639F, -0.1745F, -0.0524F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(0.1F, -0.3872F, -0.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.231F, 1.0967F, 0.7767F, -0.1745F, -0.0524F));

		PartDefinition cube_r152 = bone3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-0.5F, -0.2595F, -0.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2354F, 0.9625F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.5F, -0.6181F, 0.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2354F, 0.9625F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r154 = bone3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(0.1F, -0.6413F, -0.8969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.231F, 0.8967F, 0.1658F, -0.1745F, -0.0524F));

		PartDefinition cube_r155 = bone3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.457F, 0.1174F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.029F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2354F, 0.9625F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.9382F, 4.2386F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8099F, -6.9064F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r157 = Neck.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-3.0058F, -0.0132F, -0.4178F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.8161F, 0.1767F, 0.7504F, -1.1541F));

		PartDefinition cube_r158 = Neck.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0679F, -0.6354F, 0.064F, 0.634F, -1.5602F));

		PartDefinition cube_r159 = Neck.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 92).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0679F, -0.6354F, 0.344F, 0.5471F, -1.0649F));

		PartDefinition cube_r160 = Neck.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0679F, -0.6354F, 0.5275F, 0.375F, -0.6585F));

		PartDefinition cube_r161 = Neck.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 27).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0679F, -0.6354F, 0.064F, -0.634F, 1.5602F));

		PartDefinition cube_r162 = Neck.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(61, 92).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0679F, -0.6354F, 0.344F, -0.5471F, 1.0649F));

		PartDefinition cube_r163 = Neck.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(92, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0679F, -0.6354F, 0.5275F, -0.375F, 0.6585F));

		PartDefinition cube_r164 = Neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(3, 95).addBox(0.0F, -0.55F, -0.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6539F, -0.3092F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 56).addBox(0.0058F, -0.0132F, -0.4178F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.8161F, 0.1767F, -0.7504F, 1.1541F));

		PartDefinition cube_r166 = Neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(80, 94).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9576F, -2.2916F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 22).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, 0.2058F, -0.1911F, -0.1991F));

		PartDefinition cube_r168 = Neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(92, 94).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9562F, -1.2589F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-2.0222F, -0.0728F, -0.3565F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -1.9496F, 0.2244F, 0.8752F, -1.1407F));

		PartDefinition cube_r170 = Neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(77, 60).addBox(0.0222F, -0.0728F, -0.3565F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -1.9496F, 0.2244F, -0.8752F, 1.1407F));

		PartDefinition cube_r171 = Neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(56, 14).addBox(-0.5F, 0.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(42, 56).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(83, 94).addBox(0.0F, -0.475F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8231F, -0.2616F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, -0.5453F, -2.8F, 0.3528F, 1.0834F, -1.1677F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-1.9822F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2819F, -0.6589F, 0.2703F, 1.0779F, -1.1423F));

		PartDefinition cube_r176 = neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(77, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, -0.5453F, -2.8F, 0.3528F, -1.0834F, 1.1677F));

		PartDefinition cube_r177 = neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(76, 70).addBox(-0.0178F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2819F, -0.6589F, 0.2703F, -1.0779F, 1.1423F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.2552F, -0.1267F, 0.033F));

		PartDefinition cube_r178 = Neck3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(86, 94).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5665F, -1.3736F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Neck3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.0942F, -1.7931F, 0.5251F, 1.242F, -0.9808F));

		PartDefinition cube_r180 = Neck3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.0942F, -1.7931F, 0.5251F, -1.242F, 0.9808F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(58, 43).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -2.7779F, 0.3628F, -0.1634F, -0.0617F));

		PartDefinition cube_r181 = Neck5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(89, 94).addBox(0.0F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Neck5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(1.6882F, -0.4458F, -1.2953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1684F, 0.0372F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r183 = Neck5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1409F, -0.7953F, 0.4217F, 1.1642F, -1.0915F));

		PartDefinition cube_r184 = Neck5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(94, 9).addBox(-2.6882F, -0.4458F, -1.2953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1684F, 0.0372F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition cube_r185 = Neck5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(82, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1409F, -0.7953F, 0.4217F, -1.1642F, 1.0915F));

		PartDefinition cube_r186 = Neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(97, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5227F, -0.3813F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Neck5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5227F, -2.8813F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Head = Neck5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.286F, -3.1801F, 0.1503F, -0.1301F, 0.1177F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(84, 59).addBox(-1.0F, 0.0052F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5173F, -3.1516F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(84, 56).addBox(-1.0F, -0.0047F, -1.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.68F, -2.1588F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, -0.6651F, 0.5354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.3017F, -5.2399F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(84, 35).addBox(-0.5F, -0.194F, -0.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.1819F, -6.1178F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(87, 51).addBox(-0.5F, -0.8473F, -0.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.3017F, -5.2399F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(25, 84).addBox(-0.5F, -0.791F, -0.5207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3017F, -5.2399F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(84, 22).addBox(-0.5F, -0.2105F, -0.7817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.6517F, -5.8149F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(40, 76).addBox(-1.5F, -0.9896F, -0.8015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.2607F, -0.0681F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(33, 75).addBox(-1.5F, 0.0104F, -1.0015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.7256F, 0.097F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(74, 16).addBox(-1.5F, 0.0104F, -0.0015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -1.6767F, -0.212F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.5125F, -2.9655F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(87, 31).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3734F, -1.9752F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(74, 8).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4876F, -1.1275F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 46).addBox(-1.5F, 0.0F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.7452F, -1.219F, -1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(9, 59).addBox(-1.5F, -0.025F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6899F, -0.2455F, -1.6275F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -4.8282F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(79, 72).addBox(-0.4127F, -1.0192F, -1.9749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1729F, 0.8076F, 0.5535F, -0.1768F, 0.2534F, -0.0268F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(87, 28).addBox(-0.4127F, -0.2319F, -1.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 87).addBox(-0.4127F, -0.3319F, -0.8273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1729F, 0.8076F, 0.5535F, -0.0023F, 0.2534F, -0.0268F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(75, 90).addBox(-0.412F, -0.3336F, -0.2204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 90).addBox(-0.412F, -0.3336F, 0.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1729F, 0.8076F, 0.5535F, 0.1232F, 0.1325F, 0.0059F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 20).addBox(-0.412F, -0.471F, 1.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1729F, 0.8076F, 0.5535F, 0.0011F, 0.1325F, 0.0059F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 89).addBox(-0.35F, -0.925F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1073F, -0.3588F, 4.6288F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 13).addBox(-0.5F, -0.2F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.2573F, 1.3409F, 4.6563F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(81, 49).addBox(0.25F, -1.4F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4927F, 1.5258F, 4.0312F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(62, 86).addBox(-0.6965F, -0.4573F, 1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.2073F, 0.8624F, 0.6775F, 3.0201F, 0.2425F, -0.0304F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(87, 17).addBox(-0.5F, -0.5237F, -0.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2476F, -0.1396F, -0.2777F, -0.9798F, 0.228F, 0.0138F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(91, 6).addBox(-0.5F, -0.7106F, 0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 89).addBox(-0.5F, -0.3106F, 0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2476F, -0.1396F, -0.2777F, -2.3324F, 0.228F, 0.0138F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.3673F, -0.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.2476F, -0.1396F, -0.2777F, -2.4633F, 0.228F, 0.0138F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 19).addBox(-0.5F, -0.6608F, -0.1537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.2476F, -0.1396F, -0.2777F, 0.3641F, 0.228F, 0.0138F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(65, 89).addBox(-0.5F, 0.1688F, -0.2557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2476F, -0.1396F, -0.2777F, 1.7603F, 0.228F, 0.0138F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 65).addBox(-0.6965F, -0.1471F, 0.8311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2073F, 0.7624F, 0.7525F, 1.9199F, 0.2443F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(61, 0).addBox(-1.7F, 0.0067F, 0.3166F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F))
				.texOffs(60, 52).addBox(-1.7F, -0.3933F, 0.3166F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, 1.7671F, 0.1222F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 72).addBox(-0.7F, -1.3825F, 0.3374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, 1.8719F, 0.1222F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(63, 83).addBox(-0.7F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 83).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5648F, -1.0555F, 1.3559F, 1.819F, -0.3557F, -0.1703F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(77, 29).addBox(-0.575F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2002F, -0.662F, 0.8481F, 1.9086F, 0.3729F, 0.0778F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(62, 68).addBox(-0.7F, -1.018F, 0.3252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 68).addBox(-0.7F, -0.618F, 0.3252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, 1.8544F, 0.1222F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 82).addBox(-0.6965F, -0.6654F, 0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 29).addBox(-0.6965F, -1.0654F, 0.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 32).addBox(-0.6965F, -0.6654F, 0.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(79, 41).addBox(-0.6965F, -1.6654F, 0.0854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(76, 66).addBox(-0.6965F, -1.6654F, -0.3146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2073F, 0.8624F, 0.6775F, 1.554F, 0.2425F, -0.0304F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(32, 82).addBox(-0.6965F, -1.1762F, 0.3859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2073F, 0.7624F, 0.7525F, 1.6799F, 0.2443F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(34, 62).addBox(-0.7F, -1.98F, -0.3265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, 1.6275F, 0.1222F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(20, 58).addBox(-1.7F, -1.584F, -1.2629F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, -0.1833F, 0.1222F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(60, 48).addBox(-1.5F, -0.7F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.2573F, 1.4891F, 3.8716F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(75, 4).addBox(-1.5F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.2573F, 1.145F, 4.0365F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(86, 14).addBox(-0.5F, -0.225F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 86).addBox(-0.5F, -0.225F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.2323F, 0.3649F, 3.7646F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(38, 79).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.2323F, 0.5611F, 2.785F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(91, 47).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, 0.338F, 2.3375F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(45, 91).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, -0.1055F, 2.1066F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 65).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 91).addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.2323F, -0.3031F, 2.9703F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(92, 0).addBox(-0.725F, 0.2717F, -1.2881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 92).addBox(-0.725F, 0.2717F, -1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, -1.6232F, 0.1222F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(50, 92).addBox(-0.5F, -0.25F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.2926F, -0.1964F, -0.3371F, 0.6109F, 0.2443F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 92).addBox(-0.7215F, -0.5661F, -1.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2073F, 0.7624F, 0.7525F, -0.4887F, 0.2443F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(92, 26).addBox(-0.7215F, 0.5969F, -0.9471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(92, 15).addBox(-0.7215F, 0.5969F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.2073F, 0.7624F, 0.7525F, -2.1991F, 0.2443F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 92).addBox(-0.7215F, -0.0711F, -1.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.2073F, 0.7624F, 0.7525F, -0.8378F, 0.2443F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(90, 91).addBox(-0.725F, 0.4396F, -1.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, -1.3177F, 0.1222F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(85, 91).addBox(-0.725F, -0.6408F, -1.8772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, -0.5672F, 0.1222F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(80, 91).addBox(-0.725F, -1.8954F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.4073F, 0.7624F, 2.3525F, 0.5847F, 0.1222F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(40, 91).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, -0.6046F, 2.1371F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, -0.955F, 2.4938F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(30, 91).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, -1.1137F, 2.9679F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(91, 23).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, -0.98F, 3.4497F, 2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(52, 86).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, -0.5888F, 3.761F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(86, 48).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, -0.0889F, 3.7741F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, 0.3586F, 3.551F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, 0.2405F, 3.2177F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(86, 6).addBox(-0.5F, -0.75F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2323F, 1.0681F, 3.6907F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(87, 62).addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2323F, 1.0407F, 4.2047F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, 1.2873F, 4.1401F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 89).addBox(-0.425F, -0.2308F, -0.1947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0427F, -1.3621F, 4.5827F, -1.6275F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 3).addBox(-0.425F, -0.199F, -0.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0427F, -1.3489F, 4.6162F, -0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.875F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2323F, 0.543F, 4.6687F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(82, 85).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2323F, 0.0437F, 4.6948F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 85).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.2323F, -0.4276F, 4.5279F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 11).addBox(-0.525F, -0.4688F, -1.4881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2573F, 0.7948F, 4.2339F, -1.6319F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -4.8282F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-0.5873F, -1.0192F, -1.9749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 0.8076F, 0.5535F, -0.1768F, -0.2534F, 0.0268F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(87, 28).mirror().addBox(-0.5873F, -0.2319F, -1.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-0.5873F, -0.3319F, -0.8273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 0.8076F, 0.5535F, -0.0023F, -0.2534F, 0.0268F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(75, 90).mirror().addBox(-0.588F, -0.3336F, -0.2204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 90).mirror().addBox(-0.588F, -0.3336F, 0.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 0.8076F, 0.5535F, 0.1232F, -0.1325F, -0.0059F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.588F, -0.471F, 1.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 0.8076F, 0.5535F, 0.0011F, -0.1325F, -0.0059F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.65F, -0.925F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, -0.3588F, 4.6288F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(65, 13).mirror().addBox(-0.5F, -0.2F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.2573F, 1.3409F, 4.6563F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-1.25F, -1.4F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4927F, 1.5258F, 4.0312F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.3035F, -0.4573F, 1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.8624F, 0.6775F, 3.0201F, -0.2425F, 0.0304F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.5F, -0.5237F, -0.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2476F, -0.1396F, -0.2777F, -0.9798F, -0.228F, -0.0138F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-0.5F, -0.7106F, 0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 89).mirror().addBox(-0.5F, -0.3106F, 0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2476F, -0.1396F, -0.2777F, -2.3324F, -0.228F, -0.0138F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.5F, -0.3673F, -0.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.2476F, -0.1396F, -0.2777F, -2.4633F, -0.228F, -0.0138F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(82, 19).mirror().addBox(-0.5F, -0.6608F, -0.1537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.2476F, -0.1396F, -0.2777F, 0.3641F, -0.228F, -0.0138F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.5F, 0.1688F, -0.2557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2476F, -0.1396F, -0.2777F, 1.7603F, -0.228F, -0.0138F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(86, 65).mirror().addBox(-0.3035F, -0.1471F, 0.8311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.7624F, 0.7525F, 1.9199F, -0.2443F, 0.0F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.3F, 0.0067F, 0.3166F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(60, 52).mirror().addBox(-0.3F, -0.3933F, 0.3166F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, 1.7671F, -0.1222F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(65, 72).mirror().addBox(-0.3F, -1.3825F, 0.3374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, 1.8719F, -0.1222F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-0.3F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 83).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5648F, -1.0555F, 1.3559F, 1.819F, 0.3557F, 0.1703F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 29).mirror().addBox(-0.425F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2002F, -0.662F, 0.8481F, 1.9086F, -0.3729F, -0.0778F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(62, 68).mirror().addBox(-0.3F, -1.018F, 0.3252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 68).mirror().addBox(-0.3F, -0.618F, 0.3252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, 1.8544F, -0.1222F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(48, 82).mirror().addBox(-0.3035F, -0.6654F, 0.7854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 29).mirror().addBox(-0.3035F, -1.0654F, 0.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 32).mirror().addBox(-0.3035F, -0.6654F, 0.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(79, 41).mirror().addBox(-0.3035F, -1.6654F, 0.0854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 66).mirror().addBox(-0.3035F, -1.6654F, -0.3146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.8624F, 0.6775F, 1.554F, -0.2425F, 0.0304F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-0.3035F, -1.1762F, 0.3859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.7624F, 0.7525F, 1.6799F, -0.2443F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-0.3F, -1.98F, -0.3265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, 1.6275F, -0.1222F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-0.3F, -1.584F, -1.2629F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, -0.1833F, -0.1222F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(60, 48).mirror().addBox(-0.5F, -0.7F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2573F, 1.4891F, 3.8716F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.5F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2573F, 1.145F, 4.0365F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-0.5F, -0.225F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 86).mirror().addBox(-0.5F, -0.225F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.3649F, 3.7646F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.5611F, 2.785F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.338F, 2.3375F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.1055F, 2.1066F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(91, 65).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 91).mirror().addBox(-0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.3031F, 2.9703F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.275F, 0.2717F, -1.2881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 92).mirror().addBox(-0.275F, 0.2717F, -1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, -1.6232F, -0.1222F, 0.0F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.5F, -0.25F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.2926F, -0.1964F, -0.3371F, 0.6109F, -0.2443F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.2785F, -0.5661F, -1.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.7624F, 0.7525F, -0.4887F, -0.2443F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(92, 26).mirror().addBox(-0.2785F, 0.5969F, -0.9471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(92, 15).mirror().addBox(-0.2785F, 0.5969F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.7624F, 0.7525F, -2.1991F, -0.2443F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.2785F, -0.0711F, -1.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, 0.7624F, 0.7525F, -0.8378F, -0.2443F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-0.275F, 0.4396F, -1.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, -1.3177F, -0.1222F, 0.0F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(-0.275F, -0.6408F, -1.8772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, -0.5672F, -0.1222F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 91).mirror().addBox(-0.275F, -1.8954F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.4073F, 0.7624F, 2.3525F, 0.5847F, -0.1222F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.6046F, 2.1371F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.955F, 2.4938F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -1.1137F, 2.9679F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.98F, 3.4497F, 2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.5888F, 3.761F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.0889F, 3.7741F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.3586F, 3.551F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.2405F, 3.2177F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.5F, -0.75F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.0681F, 3.6907F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.0407F, 4.2047F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.2873F, 4.1401F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.575F, -0.2308F, -0.1947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -1.3621F, 4.5827F, -1.6275F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.575F, -0.199F, -0.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -1.3489F, 4.6162F, -0.8945F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -0.875F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.543F, 4.6687F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(82, 85).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.0437F, 4.6948F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.4276F, 4.5279F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-0.475F, -0.4688F, -1.4881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.2573F, 0.7948F, 4.2339F, -1.6319F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4154F, -0.405F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5F, -0.8F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(70, 0).addBox(0.85F, -0.8F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.775F, 0.4024F, -0.7033F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(82, 88).mirror().addBox(-0.17F, -1.7954F, -2.0179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0976F, -3.6283F, 0.2531F, -0.192F, 0.0F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.17F, -1.2564F, -1.8087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 77).mirror().addBox(-0.17F, -1.2064F, -1.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 74).mirror().addBox(-0.17F, -1.2064F, -0.6087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0976F, -3.6283F, -0.0524F, -0.192F, 0.0F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(-0.2227F, -1.1221F, -1.6181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 44).mirror().addBox(-0.2227F, -1.1221F, -1.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0976F, -2.0283F, -0.0524F, -0.1571F, 0.0F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1376F, -0.298F, -5.5062F, -0.6632F, -0.192F, 0.0F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.17F, -0.7686F, -1.7418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2055F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0976F, -3.8283F, -0.0349F, -0.192F, 0.0F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(69, 68).mirror().addBox(-0.17F, -0.8449F, -1.9871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0976F, -3.8283F, -0.0873F, -0.192F, 0.0F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.17F, -0.8691F, -0.6941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0976F, -3.8283F, -0.0524F, -0.192F, 0.0F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.5F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(20, 88).addBox(0.85F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.775F, -0.7336F, -2.1221F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.275F, -0.7905F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0976F, -1.6283F, -0.0873F, -0.0873F, 0.0F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-0.2227F, -0.8377F, -1.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2055F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0976F, -2.2283F, -0.0175F, -0.1571F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-0.2227F, -0.5447F, -1.7973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0976F, -2.2283F, -0.1396F, -0.1571F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(87, 85).mirror().addBox(-0.275F, -0.4509F, -0.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2055F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0976F, -1.6283F, -0.1571F, -0.0873F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(77, 87).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(77, 87).addBox(0.85F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.775F, -1.0058F, -1.2472F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-0.5F, -0.2F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 68).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(87, 71).addBox(0.85F, -0.2F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 68).addBox(0.85F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.775F, -0.4832F, -0.5145F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.5F, -0.4934F, -0.7813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(65, 25).addBox(0.85F, -0.4934F, -0.7813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.775F, 0.1866F, -0.106F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-0.5F, -0.525F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(84, 41).addBox(0.85F, -0.525F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.775F, 0.0717F, -0.5275F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(15, 88).addBox(-0.725F, -0.7905F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8F, -0.0976F, -1.6283F, -0.0873F, 0.0873F, 0.0F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(69, 68).addBox(-0.83F, -0.8449F, -1.9871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.6F, -0.0976F, -3.8283F, -0.0873F, 0.192F, 0.0F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(30, 88).addBox(-0.83F, -0.8691F, -0.6941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.0976F, -3.8283F, -0.0524F, 0.192F, 0.0F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(69, 51).addBox(-0.7773F, -0.8377F, -1.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2055F)), PartPose.offsetAndRotation(0.8F, -0.0976F, -2.2283F, -0.0175F, 0.1571F, 0.0F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0624F, -0.298F, -5.5062F, -0.6632F, 0.192F, 0.0F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 70).addBox(-0.83F, -0.7686F, -1.7418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2055F)), PartPose.offsetAndRotation(0.6F, -0.0976F, -3.8283F, -0.0349F, 0.192F, 0.0F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(82, 88).addBox(-0.83F, -1.7954F, -2.0179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, -0.0976F, -3.6283F, 0.2531F, 0.192F, 0.0F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(88, 80).addBox(-0.83F, -1.2564F, -1.8087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 77).addBox(-0.83F, -1.2064F, -1.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 74).addBox(-0.83F, -1.2064F, -0.6087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, -0.0976F, -3.6283F, -0.0524F, 0.192F, 0.0F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(45, 88).addBox(-0.7773F, -1.1221F, -1.6181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 44).addBox(-0.7773F, -1.1221F, -1.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8F, -0.0976F, -2.0283F, -0.0524F, 0.1571F, 0.0F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(69, 47).addBox(-0.7773F, -0.5447F, -1.7973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8F, -0.0976F, -2.2283F, -0.1396F, 0.1571F, 0.0F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(87, 85).addBox(-0.725F, -0.4509F, -0.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2055F)), PartPose.offsetAndRotation(0.8F, -0.0976F, -1.6283F, -0.1571F, 0.0873F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6602F, 4.9749F, -5.3913F, -0.8107F, 0.1827F, -0.2256F));

		PartDefinition cube_r341 = RArm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(68, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4229F, -0.8239F, 4.8795F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r342 = RArm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(21, 73).addBox(-0.5F, -0.2907F, -0.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4229F, -0.0383F, 3.0706F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r343 = RArm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -0.2758F, -1.9518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4229F, -0.0383F, 3.0706F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r344 = RArm.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(67, 8).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0771F, 1.4356F, 0.7448F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r345 = RArm.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(65, 58).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r346 = RArm.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(48, 68).addBox(0.0F, 0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, 0.0411F, -0.0019F, 0.0207F));

		PartDefinition cube_r347 = RArm.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(65, 39).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.1771F, -0.0019F, 0.0207F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(5, 63).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(10, 63).addBox(0.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0771F, -0.5128F, 6.7545F, 0.642F, 0.1148F, -0.2964F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(45, 0).addBox(-0.9F, -0.01F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8575F, 5.1083F, -0.3878F, 0.1745F, 0.0F, 0.2618F));

		PartDefinition cube_r348 = RHand.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(51, 58).addBox(-0.91F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, 0.0F, 0.0F, -0.4293F, -0.0758F, -0.2043F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6602F, 4.9749F, -5.3913F, -1.6196F, -0.1139F, 0.371F));

		PartDefinition cube_r349 = RArm3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(70, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4229F, -0.8239F, 4.8795F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r350 = RArm3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.2907F, -0.0495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4229F, -0.0383F, 3.0706F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r351 = RArm3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(72, 72).addBox(-0.5F, -0.2758F, -1.9518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4229F, -0.0383F, 3.0706F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r352 = RArm3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(70, 29).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0771F, 1.4356F, 0.7448F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r353 = RArm3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(70, 19).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r354 = RArm3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(14, 70).addBox(-1.0F, 0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, 0.0411F, 0.0019F, -0.0207F));

		PartDefinition cube_r355 = RArm3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(7, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.1771F, 0.0019F, -0.0207F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(15, 63).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(20, 63).addBox(-1.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0771F, -0.5128F, 6.7545F, 0.7497F, 0.0224F, 0.5039F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(13, 45).addBox(-0.1F, -0.01F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8575F, 5.1083F, -0.3878F, 0.1745F, 0.0F, -0.2618F));

		PartDefinition cube_r356 = RHand2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(58, 58).addBox(-1.09F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.99F, 0.0F, 0.0F, -0.4293F, 0.0758F, 0.2043F));

		PartDefinition Tail = Thecodontosaurus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1254F, 3.8651F, -0.0635F, 0.0795F, -0.1357F));

		PartDefinition cube_r357 = Tail.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(18, 94).addBox(0.0F, -1.775F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5266F, 3.9324F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r358 = Tail.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 94).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 1.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(93, 78).addBox(0.0F, -0.1118F, -0.0885F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 3.4389F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Tail.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(92, 50).addBox(0.0F, -0.576F, -0.1487F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 1.1389F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Tail.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(77, 93).addBox(0.0F, -2.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3906F, 0.0138F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Tail.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-1.0F, 0.025F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 36).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1013F, 0.9389F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r363 = Tail.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(52, 36).addBox(0.0F, 0.025F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(52, 36).addBox(0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1013F, 0.9389F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(39, 38).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0694F, 4.9105F, 0.0264F, 0.1309F, 0.0034F));

		PartDefinition cube_r364 = Tail2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(21, 94).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 2.9624F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Tail2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(64, 94).addBox(0.0F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 0.9624F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Tail2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(68, 84).addBox(0.0F, 0.0592F, -0.1559F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.4F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Tail2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 63).addBox(0.0F, -0.8043F, -0.4997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(41, 22).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2133F, 4.8901F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r368 = Tail3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(67, 94).addBox(0.0F, -1.125F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 4.1474F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Tail3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(94, 34).addBox(0.0F, -1.275F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 2.0474F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Tail3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(30, 94).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 0.0474F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Tail3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(71, 84).addBox(0.0F, 0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2041F, 2.913F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Tail3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(84, 70).addBox(0.0F, 0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, 0.6352F, 0.576F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(38, 94).addBox(0.0F, -1.4647F, 1.0474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0414F, 4.9579F, 0.005F, 0.1748F, -0.0426F));

		PartDefinition cube_r373 = Tail4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(94, 38).addBox(0.0F, -1.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 3.0474F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Tail4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(35, 92).addBox(0.0F, 12.8F, 22.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 84).addBox(0.0F, 11.9F, 20.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(6, 95).addBox(0.0F, -1.3897F, 0.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 95).addBox(0.0F, -1.3648F, 2.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 95).addBox(0.0F, -1.2898F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9331F, 0.0586F, 0.2204F, -0.0307F));

		PartDefinition cube_r375 = Tail5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(61, 94).addBox(0.0F, 15.8F, 26.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 94).addBox(0.0F, 14.9F, 24.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3581F, -28.2955F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0048F, 4.9233F, 0.1025F, 0.2649F, -0.0165F));

		PartDefinition cube_r376 = Tail6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(27, 95).addBox(0.0F, -0.5F, -0.45F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6397F, 3.5474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Tail6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(24, 95).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6147F, 1.5474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Tail6.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(94, 54).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9053F, 3.193F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Tail6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(47, 94).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9527F, 0.9109F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(95, 50).addBox(0.0F, -0.9898F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0014F, 4.9147F, 0.0288F, 0.4385F, -0.0751F));

		PartDefinition cube_r380 = Tail7.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(50, 95).addBox(0.0F, -0.475F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5147F, 2.5474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Tail7.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(69, 55).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5147F, 0.5474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Tail7.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(56, 96).addBox(0.0F, 1.4F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 58).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7727F, 0.5103F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(32, 7).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(95, 58).addBox(0.0F, -1.0147F, 1.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 61).addBox(0.0F, -1.0147F, 3.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0114F, 4.9505F, -0.0734F, 0.3391F, -0.1557F));

		PartDefinition cube_r383 = Tail8.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(70, 96).addBox(0.0F, 4.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 64).addBox(0.0F, 2.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7613F, -4.4402F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(13, 38).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(95, 91).addBox(0.0F, -0.9147F, 2.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 94).addBox(0.0F, -0.8647F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0132F, 4.976F, 0.1086F, 0.2876F, -0.1949F));

		PartDefinition cube_r384 = Tail9.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(95, 84).addBox(0.0F, -0.525F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 0.5474F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r385 = Tail9.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(96, 77).addBox(0.0F, 7.4F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 74).addBox(0.0F, 6.0F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7481F, -9.4162F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tail10 = Tail9.addOrReplaceChild("Tail10", CubeListBuilder.create().texOffs(26, 38).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(96, 5).addBox(0.0F, -0.8148F, 1.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 11).addBox(0.0F, -0.8148F, 3.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0068F, 4.9064F, -0.1343F, 0.4213F, -0.1329F));

		PartDefinition Tail11 = Tail10.addOrReplaceChild("Tail11", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(96, 23).addBox(0.0F, -0.8148F, 0.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 47).addBox(0.0F, -0.7897F, 2.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 96).addBox(0.0F, -0.7147F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.003F, 4.9281F, -0.2243F, 0.3229F, -0.2368F));

		PartDefinition Tail12 = Tail11.addOrReplaceChild("Tail12", CubeListBuilder.create().texOffs(39, 31).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0288F, 0.0729F, 4.7841F, -0.0463F, -0.3772F, 0.0789F));

		PartDefinition Tail13 = Tail12.addOrReplaceChild("Tail13", CubeListBuilder.create().texOffs(15, 24).addBox(-0.4713F, -0.6758F, 0.2388F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0087F, 0.1456F, 4.5046F, -0.3156F, -0.4204F, 0.1434F));

		PartDefinition Tail14 = Tail13.addOrReplaceChild("Tail14", CubeListBuilder.create().texOffs(58, 8).addBox(-0.4712F, -0.6758F, 0.2388F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1695F, -0.0826F, 4.5665F, -0.2752F, -0.4176F, 0.1374F));

		PartDefinition RLeg = Thecodontosaurus.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.7067F, 0.046F, -0.2435F, -0.0211F, -0.0847F));

		PartDefinition cube_r386 = RLeg.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(34, 67).addBox(1.0F, 1.4829F, -0.2212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r387 = RLeg.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 82).addBox(1.0F, 0.2269F, -0.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r388 = RLeg.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(79, 23).addBox(1.0F, -0.0419F, -0.0302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r389 = RLeg.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(28, 75).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0318F, 1.9723F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r390 = RLeg.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(79, 11).addBox(1.0F, -0.0005F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.6042F, 0.7434F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r391 = RLeg.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(83, 45).addBox(-0.5F, 0.1343F, -0.3441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8671F, 1.3788F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r392 = RLeg.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -1.9494F, -0.9296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 3.3474F, 1.7094F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r393 = RLeg.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(5, 79).addBox(1.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2145F, 1.1003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r394 = RLeg.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(20, 85).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7145F, 0.2343F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r395 = RLeg.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(15, 85).addBox(1.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r396 = RLeg.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(77, 84).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r397 = RLeg.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(78, 76).addBox(1.0F, -2.0F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 1.5067F, 1.3421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r398 = RLeg.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(52, 78).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 3.5918F, 0.2858F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r399 = RLeg.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(33, 78).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, 3.5918F, 0.2858F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r400 = RLeg.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 78).addBox(1.0F, -0.175F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, 0.0421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r401 = RLeg.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(77, 62).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, 0.0421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.3477F, 4.1821F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r402 = RLeg2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(22, 45).addBox(0.0F, -5.9F, -0.7F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 37).addBox(-1.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(32, 50).addBox(-1.0F, -5.2F, -0.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r403 = RLeg2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 3.6534F, 0.0128F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r404 = RLeg2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(53, 72).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-0.5F, 7.2091F, 0.576F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r405 = RLeg2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(77, 19).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(53, 50).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 11.2204F, 1.2331F, -0.8795F, -0.0673F, -0.0556F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, 0.169F, -0.1046F, 0.009F));

		PartDefinition cube_r406 = digit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 62).addBox(-0.2826F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.1745F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r407 = digit2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -0.35F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(-0.0349F, -0.0805F, -0.6011F, 1.789F, 0.0F, 0.1745F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(45, 45).addBox(-0.9F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4782F, 6.4836F, -0.1585F, 0.7463F, -0.0964F, -0.0887F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(45, 9).addBox(-0.9F, -0.5827F, -2.9239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.8026F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Thecodontosaurus.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.7067F, 0.046F, -1.0698F, -0.115F, -0.0627F));

		PartDefinition cube_r408 = RLeg4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(70, 62).addBox(-2.0F, 1.4829F, -0.2212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r409 = RLeg4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(82, 0).addBox(-2.0F, 0.2269F, -0.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r410 = RLeg4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(43, 81).addBox(-2.0F, -0.0419F, -0.0302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r411 = RLeg4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(47, 76).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0318F, 1.9723F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r412 = RLeg4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(20, 81).addBox(-2.0F, -0.0005F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.6042F, 0.7434F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r413 = RLeg4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(53, 83).addBox(-0.5F, 0.1343F, -0.3441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.8671F, 1.3788F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r414 = RLeg4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(81, 15).addBox(-0.5F, -1.9494F, -0.9296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.3474F, 1.7094F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r415 = RLeg4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(15, 81).addBox(-2.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2145F, 1.1003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r416 = RLeg4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 89).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.7145F, 0.2343F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r417 = RLeg4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(89, 9).addBox(-2.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r418 = RLeg4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(5, 89).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r419 = RLeg4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(81, 7).addBox(-2.0F, -2.0F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 1.5067F, 1.3421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r420 = RLeg4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(78, 80).addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 3.5918F, 0.2858F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r421 = RLeg4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(73, 80).addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.5918F, 0.2858F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r422 = RLeg4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(68, 80).addBox(-2.0F, -0.175F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 1.6067F, 0.0421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r423 = RLeg4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(27, 80).addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.6067F, 0.0421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.3477F, 4.1821F, 1.4832F, 0.0869F, -0.0076F));

		PartDefinition cube_r424 = RLeg5.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(27, 45).addBox(-1.0F, -5.9F, -0.7F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 72).addBox(0.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(37, 50).addBox(0.0F, -5.2F, -0.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r425 = RLeg5.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(12, 74).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 3.6534F, 0.0128F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r426 = RLeg5.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(72, 55).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.5F, 7.2091F, 0.576F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r427 = RLeg5.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(22, 77).addBox(0.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 11.2204F, 1.2331F, -0.925F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.0055F, 0.1046F, -0.009F));

		PartDefinition cube_r428 = digit3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(29, 62).addBox(-0.7174F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r429 = digit4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5F, -0.35F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0349F, -0.0805F, -0.6011F, 1.789F, 0.0F, -0.1745F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(0, 46).addBox(-2.1F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4782F, 6.4836F, -0.1585F, 0.9165F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(32, 45).addBox(-2.1F, -0.5827F, -2.9239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.279F, 0.0F, 0.0F));

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