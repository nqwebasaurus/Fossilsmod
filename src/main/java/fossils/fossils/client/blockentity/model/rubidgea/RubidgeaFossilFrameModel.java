package fossils.fossils.client.blockentity.model.rubidgea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RubidgeaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw1;
	private final ModelPart lowerjaw2;
	private final ModelPart lowerjaw3;
	private final ModelPart lowerjawslope;
	private final ModelPart upperjaw1;
	private final ModelPart upperjaw2;
	private final ModelPart nose;
	private final ModelPart bone6;
	private final ModelPart bone10;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart fur1;
	private final ModelPart fur2;
	private final ModelPart fur3;

	public RubidgeaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.bone2 = this.hips.getChild("bone2");
		this.bone12 = this.hips.getChild("bone12");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm6 = this.leftLeg3.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm6 = this.rightLeg3.getChild("rightArm6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyfront = this.body2.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone11 = this.chest.getChild("bone11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
		this.lowerjaw3 = this.lowerjaw2.getChild("lowerjaw3");
		this.lowerjawslope = this.lowerjaw2.getChild("lowerjawslope");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.upperjaw2 = this.upperjaw1.getChild("upperjaw2");
		this.nose = this.upperjaw2.getChild("nose");
		this.bone6 = this.nose.getChild("bone6");
		this.bone10 = this.nose.getChild("bone10");
		this.bone4 = this.upperjaw1.getChild("bone4");
		this.bone7 = this.upperjaw1.getChild("bone7");
		this.bone3 = this.head.getChild("bone3");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone8 = this.head.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.fur1 = this.body.getChild("fur1");
		this.fur2 = this.fur1.getChild("fur2");
		this.fur3 = this.fur2.getChild("fur3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -15.0F, 8.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.3F, -13.0F, -10.1F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -13.0F, -10.1F, -0.2443F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -13.0F, 9.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1594F, 7.4916F, -0.2032F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, 0.6F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1249F, -0.1128F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(11, 34).addBox(-0.5F, 0.141F, -0.1655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0251F, 4.5987F, -0.3107F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.308F, -0.4388F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 28).addBox(-0.5F, 0.308F, 2.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -0.0982F, 3.015F, -0.1178F, -0.1733F, 0.0204F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.1698F, -0.1624F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0999F, 3.8015F, -0.2501F, -0.3816F, 0.0949F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone12 = hips.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.3207F, 2.7902F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 1.1519F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.8284F, 1.4019F, 0.7505F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.3207F, 2.7902F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 0.7592F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.8284F, 1.4019F, 1.1868F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, 0.5731F, -0.0027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.8658F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5687F, -4.8658F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition body_r2 = body2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, 0.6714F, -6.3567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body_r3 = body2.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(22, 37).addBox(-0.5F, 0.4208F, 2.3951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 35).addBox(-0.5F, 0.4208F, -0.3049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront = body2.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7045F, -8.8635F, 0.1416F, 0.0432F, 0.0062F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.2385F, 0.9114F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2485F, -5.7107F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5485F, -4.7107F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(54, 24).addBox(-0.5F, -0.5F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 23).addBox(-0.5F, -0.5F, 1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4322F, 3.6415F, 1.3217F, -0.0015F, -0.009F, -0.0068F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.522F, 1.3834F, -0.5149F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 3.9496F, 0.3519F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 1.8658F, 0.2065F, 0.0349F, -0.0002F, 0.0001F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4322F, 3.6415F, 1.3217F, 0.6094F, 0.009F, 0.0068F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.522F, 1.3834F, -1.8239F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 3.9496F, 0.3519F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 1.8658F, 0.2065F, 1.6493F, 0.0002F, -0.0001F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(57, 47).addBox(-0.5F, 0.1216F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0618F, -1.8993F, -0.0957F, 0.2607F, -0.0247F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1912F, -2.0238F, -0.1325F, 0.285F, 0.1325F));

		PartDefinition cube_r4 = neck4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.325F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6481F, -3.5617F, 0.1794F, 0.0F, 0.0F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.754F, 1.2185F, 0.776F, 0.0F, 0.0F));

		PartDefinition lowerjaw2 = lowerjaw1.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.16F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw3 = lowerjaw2.addOrReplaceChild("lowerjaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjawslope = lowerjaw2.addOrReplaceChild("lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.9F, -0.3643F, 0.0F, 0.0F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9627F, -4.9899F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw2 = upperjaw1.addOrReplaceChild("upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition nose = upperjaw2.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition bone6 = nose.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7506F, -0.6172F, 5.1538F, 0.0124F, 0.2037F, 0.1391F));

		PartDefinition bone10 = nose.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7506F, -0.6172F, 5.1538F, 0.0124F, -0.2037F, -0.1391F));

		PartDefinition bone4 = upperjaw1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.9F, -0.1F, -1.0F));

		PartDefinition bone7 = upperjaw1.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.1F, -1.0F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.5F, 1.0922F, -3.4118F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(2.5706F, -0.1316F, 4.2695F));

		PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.0922F, -3.4118F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-2.5706F, -0.1316F, 4.2695F));

		PartDefinition fur1 = body.addOrReplaceChild("fur1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0687F, -18.2658F, 0.4098F, 0.0F, 0.0F));

		PartDefinition fur2 = fur1.addOrReplaceChild("fur2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.182F, 0.0F, 0.0F));

		PartDefinition fur3 = fur2.addOrReplaceChild("fur3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 0.182F, 0.0F, 0.0F));

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