package fossils.fossils.client.blockentity.model.austriadactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustriadactylusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tailthing1;
	private final ModelPart bone;
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
	private final ModelPart chest;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
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

	public AustriadactylusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body2 = this.root.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tailthing1 = this.tail5.getChild("tailthing1");
		this.bone = this.hips.getChild("bone");
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
		this.chest = this.body2.getChild("chest");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body2 = root.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9F, -4.6F, 0.1845F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5F, 0.6F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 43).addBox(-0.5F, 0.6F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1F, -3.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8212F, 2.9688F, 0.0853F, 0.0F, 0.0F));

		PartDefinition body_r1 = hips.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(50, 28).addBox(-0.5F, 0.3F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 24).addBox(-0.5F, 0.3F, -1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, 1.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r2 = hips.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(47, 25).addBox(0.6F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2274F, 2.0716F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(27, 12).addBox(-0.5F, 0.4848F, -0.1517F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.8F, 0.1621F, 0.0431F, 0.007F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 9).addBox(-0.5F, -0.3F, 9.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6848F, 9.9483F, 0.3027F, 0.0417F, 0.013F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.7F, 0.0019F, 0.0436F, 0.0001F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1645F, 0.0861F, -0.0143F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 34).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 40).addBox(-0.5F, 0.2F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1382F, 0.0864F, -0.012F));

		PartDefinition tailthing1 = tail5.addOrReplaceChild("tailthing1", CubeListBuilder.create().texOffs(19, 44).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.6F, 1.3F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8982F, 1.5066F, 0.6644F, 0.4902F, -0.0902F, -1.483F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0193F, 5.9203F, 0.3896F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1326F, 7.2685F, 0.7819F, 1.064F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8982F, 1.5066F, 0.6644F, 0.4817F, 0.1309F, 1.4054F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0193F, 5.9203F, 0.3896F, 0.8203F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1326F, 7.2685F, 0.7819F, 1.064F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5877F, -4.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6549F, -3.0858F, 0.0342F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = chest.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.7935F, -2.8347F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition neck2_r1 = chest.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 0.8F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0607F, -4.8155F, -0.1329F, -0.173F, 0.023F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 18).addBox(-0.5F, 0.0412F, -2.1659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2922F, 0.0808F, 0.096F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(61, 14).addBox(-0.5F, 0.1357F, -1.9905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 14).addBox(-0.5F, 0.1357F, -0.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3068F, -1.973F, -0.3081F, -0.0832F, 0.0264F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(61, 38).addBox(-0.5F, 0.1357F, -0.5905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 37).addBox(-0.5F, 0.1357F, -2.2905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0046F, -1.8291F, -0.248F, -0.1269F, 0.032F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, 0.1357F, -1.8905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0017F, -1.8554F, -0.1977F, -0.1797F, -0.008F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0773F, -0.5129F, -1.943F, 0.6677F, -0.1971F, -0.1813F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0889F, -0.6208F, 0.5498F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6091F, 0.9078F, -7.6618F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7637F, 0.9078F, -7.6618F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1721F, 0.6341F, -2.7775F, 0.2656F, 0.0524F, -2.0462F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3634F, 6.1475F, -1.1859F, -0.629F, -0.2612F, -0.2557F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0343F, 9.439F, -0.064F, 0.2869F, 0.1841F, -0.0433F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1065F, 1.802F, -0.6525F, 1.0453F, 0.2092F, -3.1161F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0579F, 2.8148F, 0.3059F, -1.3958F, -0.1243F, 0.1142F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.286F, 0.2049F, 7.1473F, 0.0041F, -0.2075F, -0.0505F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2023F, -2.2925F, 11.3529F, 0.417F, -0.2222F, -0.1408F));

		PartDefinition leftWing7 = leftWing6.addOrReplaceChild("leftWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0542F, 0.0519F, 11.5518F, 0.1835F, -0.1899F, -0.0978F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1721F, 0.6341F, -2.7775F, 0.2631F, -0.0638F, 2.0883F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1657F, 6.132F, -1.1601F, -0.6527F, 0.1828F, 0.1481F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0343F, 9.439F, -0.064F, 0.2944F, -0.1716F, 0.0008F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1065F, 1.802F, -0.6524F, 1.0453F, -0.2092F, 3.1161F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0579F, 2.8148F, 0.3059F, -1.3812F, 0.1006F, 0.0153F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.286F, 0.2049F, 7.1473F, 0.0041F, 0.2075F, 0.0505F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2023F, -2.2925F, 11.3529F, 0.4105F, 0.1423F, 0.1051F));

		PartDefinition rightWing7 = rightWing6.addOrReplaceChild("rightWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0542F, 0.0519F, 11.5518F, 0.1805F, 0.0612F, 0.0739F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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