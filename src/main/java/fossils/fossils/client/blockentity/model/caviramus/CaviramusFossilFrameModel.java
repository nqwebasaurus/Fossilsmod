package fossils.fossils.client.blockentity.model.caviramus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CaviramusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart leftWing7;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart rightWing7;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone3;

	public CaviramusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftWing = this.chest.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.leftWing7 = this.leftWing6.getChild("leftWing7");
		this.rightWing = this.chest.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.rightWing7 = this.rightWing6.getChild("rightWing7");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(56, 56).addBox(0.1F, 0.6673F, 4.3827F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, -1.5949F, -1.6306F, -0.0429F, 0.5871F, -0.7853F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(56, 56).addBox(-2.6F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, 3.3673F, 5.9827F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5773F, 0.0967F, -3.1556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 65).addBox(-0.5773F, 0.0967F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6773F, 0.5929F, 4.4665F, -0.1326F, 0.1298F, -0.0173F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, 0.7F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0773F, -0.6033F, -2.9556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.17F, -5.8975F, 0.2582F, 0.0844F, 0.0223F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(77, 73).addBox(-0.5773F, 0.6207F, -0.604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(76, 72).addBox(-0.5773F, 0.6207F, -2.304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -3.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(71, 67).addBox(-0.5F, -0.3F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0773F, 0.8722F, -4.7103F, 1.5272F, -1.3439F, -1.5708F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5773F, 0.4207F, 2.096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.432F, -5.815F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4817F, -5.5678F, -0.2583F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(13, 71).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2023F, 0.6055F, -2.549F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.036F, -1.9741F, -0.6344F, 0.3367F, 0.1645F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(54, 62).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0773F, 0.5401F, -1.5212F, 0.0F, 0.1047F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(63, 67).addBox(-0.5773F, 0.0401F, -2.6212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0167F, -2.8045F, -0.1487F, 0.3037F, 0.2639F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3396F, -2.4595F, -0.0189F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.368F, -1.2628F, 1.021F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6091F, 0.9078F, -7.6618F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7637F, 0.9078F, -7.6618F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3327F, 1.2467F, -4.5068F, 0.5008F, -0.2153F, -2.036F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0777F, 10.0472F, -2.7352F, -0.6552F, -0.1722F, -0.134F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0707F, 14.7462F, -0.3F, 0.32F, 0.4187F, 0.0903F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4277F, 6.4974F, -0.2636F, 0.9483F, -0.439F, -3.0005F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0172F, 6.0375F, 0.0053F, -1.3664F, 0.3357F, 0.0279F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3967F, 0.1715F, 14.1765F, 0.004F, -0.0766F, -0.05F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2023F, -2.2925F, 11.3529F, 0.2761F, -0.0622F, -0.0703F));

		PartDefinition leftWing7 = leftWing6.addOrReplaceChild("leftWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.038F, -0.0183F, 14.5934F, 0.1805F, -0.0612F, -0.0739F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4873F, 1.2467F, -4.5068F, 0.7394F, 0.321F, 1.5632F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0777F, 10.0472F, -2.7352F, -0.7861F, 0.1722F, 0.134F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0707F, 14.7462F, -0.3F, 0.3814F, -0.121F, -0.0128F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4277F, 6.4974F, -0.2636F, 0.9483F, 0.439F, 3.0005F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0172F, 6.0375F, 0.0053F, -1.3664F, -0.3357F, -0.0279F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3967F, 0.1715F, 14.1765F, -0.0257F, 0.0723F, -0.3438F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2023F, -2.2925F, 11.3529F, 0.2761F, 0.0622F, 0.0703F));

		PartDefinition rightWing7 = rightWing6.addOrReplaceChild("rightWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.038F, -0.0183F, 14.5934F, 0.1805F, 0.0612F, 0.0739F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.1947F, 1.671F, -4.0451F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.3492F, 1.671F, -4.0451F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5773F, 0.0F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6773F, 0.7011F, 8.2812F, 0.0025F, 0.1309F, 0.0003F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 40).addBox(-0.5773F, 0.2F, -0.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 47).addBox(-0.5773F, 0.2F, 7.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2293F, 4.9488F, 0.0411F, 0.218F, 0.0089F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5673F, 0.2F, -0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 43).addBox(-0.5673F, 0.2F, 9.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, 0.0256F, 7.9921F, 0.1085F, 0.3037F, 0.0326F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5773F, 0.2F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, 0.0311F, 9.9203F, 0.0891F, 0.2608F, 0.023F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(42, 40).addBox(-0.5773F, 0.2F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 46).addBox(-0.5773F, 0.2F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0002F, 6.9585F, 0.0428F, 0.1308F, 0.0056F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(33, 14).addBox(-0.5773F, 0.2F, -0.2F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0048F, 6.926F, 0.0439F, 0.2616F, 0.0114F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4974F, 1.0147F, 5.8068F, -0.0419F, 0.4031F, -0.8245F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0193F, 7.0598F, 0.7113F, 1.3003F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1358F, 10.6024F, 0.4746F, 1.2386F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2974F, 1.0147F, 5.8068F, 0.7059F, -0.402F, 0.5873F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0193F, 7.0598F, 0.7113F, 0.9512F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1358F, 10.6024F, 0.4746F, 1.2386F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.3061F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0442F, 1.3078F, 5.681F, 0.4378F, 0.0791F, 0.037F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8442F, 1.3078F, 5.681F, 0.4378F, -0.0791F, -0.037F));

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