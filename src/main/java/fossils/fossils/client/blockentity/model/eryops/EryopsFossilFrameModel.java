package fossils.fossils.client.blockentity.model.eryops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EryopsFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone3;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone5;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone8;

	public EryopsFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.body = this.hip.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone3 = this.forelegL2.getChild("bone3");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone5 = this.forelegL4.getChild("bone5");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.bone = this.chest.getChild("bone");
		this.bone7 = this.chest.getChild("bone7");
		this.hindlegL = this.hip.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.hip.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone2 = this.hip.getChild("bone2");
		this.bone8 = this.hip.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -1.7F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.4F, -7.0F, -1.2F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.1F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, -7.0F, -1.2F, -0.3054F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.55F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -5.95F, 14.9F, 0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -2.05F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.1F, -5.95F, 14.9F, 0.0F, 0.2618F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 8.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body4_r1 = hip.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.7384F, -0.0503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.9847F, 1.8393F, -0.144F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.3993F, -0.3289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 29).addBox(-0.5F, 0.3993F, 3.3711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.9766F, 6.7405F, -0.3302F, 0.2067F, -0.0702F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, 0.35F, 0.0517F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.05F, 3.9F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(9, 40).addBox(-0.5F, 0.4892F, -0.3338F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 42).addBox(-0.5F, 0.4892F, 2.3662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1617F, 2.8579F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.4892F, 0.0662F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0062F, 2.8443F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(44, 20).addBox(-0.5F, 0.4892F, -0.2339F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 22).addBox(-0.5F, 0.4892F, 2.4662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0181F, 2.9274F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(44, 34).addBox(-0.5F, 0.4892F, -0.0338F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.032F, 2.9402F, 0.0715F, 0.2176F, 0.0155F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.4884F, 2.0218F, -0.0616F, -0.1307F, 0.008F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(22, 14).addBox(-0.5F, 0.6903F, 1.0904F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -6.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.253F, -5.019F, 0.1402F, -0.0864F, -0.0122F));

		PartDefinition body5_r1 = body2.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.6903F, 2.3904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 21).addBox(-0.5F, 0.6903F, -2.3096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.438F, -3.0067F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.012F, -5.0041F, 0.0524F, -0.0436F, -0.0023F));

		PartDefinition body2_r1 = chest.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, -0.2F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.804F, 4.9622F, -2.9971F, 0.7189F, 0.0469F, -1.3802F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0588F, 4.7516F, -0.1499F, -1.6585F, 1.1657F, -0.3089F));

		PartDefinition bone3 = forelegL2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4473F, 2.4839F, -0.249F, 0.0019F, -0.0436F, -1.2654F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.804F, 4.9622F, -2.9971F, -0.4592F, -0.0469F, 1.3802F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0588F, 4.7516F, -0.1499F, -1.1793F, -0.889F, -0.1069F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4473F, 2.4839F, -0.249F, -0.0149F, 0.041F, 0.8724F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, 0.21F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, -0.0416F, -0.173F, -0.023F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0478F, -4.1466F, -0.1671F, -0.2555F, -0.0579F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.792F, 0.5149F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.5F, 1.6F, -9.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.6F, -9.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.7461F, -4.9358F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.7461F, -4.9358F, -0.2182F, 0.0F, 0.0F));

		PartDefinition hindlegL = hip.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2328F, -4.5809F, 5.3656F, -0.5073F, 0.0811F, -1.5946F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9648F, 5.2168F, 0.2788F, -0.6116F, 1.1568F, 0.7897F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4894F, -0.1216F, -0.0602F, -0.1639F, -1.2168F));

		PartDefinition hindlegL3 = hip.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2328F, -4.5809F, 5.3656F, 0.7581F, -0.0811F, 1.5946F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9648F, 5.2168F, 0.2788F, -0.0436F, -1.5272F, -1.3963F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4894F, -0.1216F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition bone2 = hip.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5978F, -3.4172F, 6.0032F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition bone8 = hip.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5978F, -3.4172F, 6.0032F, 0.0873F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 81, 81);
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