package fossils.fossils.client.blockentity.model.inostrancevia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class InostranceviaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
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
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw1;
	private final ModelPart lowerjaw2;
	private final ModelPart lowerjaw3;
	private final ModelPart lowerjawslope;
	private final ModelPart lowerjawteeth1;
	private final ModelPart jawparting;
	private final ModelPart upperjaw1;
	private final ModelPart upperjaw2;
	private final ModelPart nose;
	private final ModelPart upperjawteeth;
	private final ModelPart upperjawteeth1;
	private final ModelPart leftsabre;
	private final ModelPart rightsabre;
	private final ModelPart fur1;
	private final ModelPart fur2;
	private final ModelPart fur3;

	public InostranceviaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
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
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
		this.lowerjaw3 = this.lowerjaw2.getChild("lowerjaw3");
		this.lowerjawslope = this.lowerjaw2.getChild("lowerjawslope");
		this.lowerjawteeth1 = this.lowerjaw2.getChild("lowerjawteeth1");
		this.jawparting = this.lowerjaw1.getChild("jawparting");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.upperjaw2 = this.upperjaw1.getChild("upperjaw2");
		this.nose = this.upperjaw2.getChild("nose");
		this.upperjawteeth = this.upperjaw2.getChild("upperjawteeth");
		this.upperjawteeth1 = this.upperjaw1.getChild("upperjawteeth1");
		this.leftsabre = this.upperjaw1.getChild("leftsabre");
		this.rightsabre = this.upperjaw1.getChild("rightsabre");
		this.fur1 = this.body.getChild("fur1");
		this.fur2 = this.fur1.getChild("fur2");
		this.fur3 = this.fur2.getChild("fur3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -19.0F, 10.2F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8F, -7.8F, -0.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(4.5F, -18.0F, -13.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.9F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.5F, -18.0F, -13.5F, -0.3054F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -16.6F, 10.7F, 0.0F, 0.0F, 1.4835F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.375F, 8.0F, -0.4213F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1249F, -0.1128F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5F, 0.041F, -0.0655F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2009F, 6.4908F, -0.1394F, 0.2161F, -0.0301F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, 0.108F, -0.4388F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 24).addBox(-0.5F, 0.108F, 5.2612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0653F, 5.0247F, -0.1201F, 0.26F, -0.031F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -0.0302F, 0.0376F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1355F, 5.7658F, -0.2968F, 0.3771F, -0.1122F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 3.4218F, 5.098F, -0.4466F, -0.2139F, -0.0409F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2995F, -1.5846F, 1.6319F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.338F, 0.0853F, -2.0246F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 3.908F, 0.255F, 1.5795F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 3.4218F, 5.098F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2995F, -1.5846F, 0.9774F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.338F, 0.0853F, -2.3736F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 3.908F, 0.255F, 0.7941F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(36, 30).addBox(-0.5F, 0.4731F, 4.2973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 26).addBox(-0.5F, 0.4731F, -0.4027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.8658F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5687F, -4.8658F, 0.0038F, -0.0872F, -0.0438F));

		PartDefinition body_r2 = body2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, 0.5714F, -6.1567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body_r3 = body2.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, 0.3208F, -0.1049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront = body2.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7045F, -8.8635F, 0.3171F, -0.0829F, -0.0272F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(17, 27).addBox(-0.5F, -0.3385F, 0.0114F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2485F, -5.7107F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7485F, -5.7107F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(11, 56).addBox(-0.5F, -0.6F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 54).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9452F, 4.9988F, -2.8445F, 0.5658F, -0.009F, -0.0068F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.2202F, 1.2568F, -1.6513F, -0.2201F, 0.2252F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 4.7604F, 0.5027F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 2.8612F, 0.1106F, 0.772F, -0.3042F, 0.0303F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9452F, 4.9988F, -2.8445F, -0.276F, 0.1362F, 0.4256F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.2202F, 1.2568F, -1.693F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 4.7604F, 0.5027F, -0.0828F, 0.7401F, -0.0559F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 2.8612F, 0.1106F, 0.8203F, 0.0002F, -0.0001F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(57, 67).addBox(-0.5F, 0.0216F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0938F, -2.7609F, -0.3543F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0784F, -1.9889F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r4 = neck2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, 0.1F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 34).addBox(-0.5F, 0.1F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.9F, 0.1745F, -0.1309F, 0.0F));

		PartDefinition cube_r5 = neck3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, 0.15F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r6 = neck4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 40).addBox(-0.5F, 0.325F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0212F, -3.5175F, 0.3976F, 0.0F, 0.0F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, 1.0267F, 0.6887F, 0.0F, 0.0F));

		PartDefinition lowerjaw2 = lowerjaw1.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.16F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw3 = lowerjaw2.addOrReplaceChild("lowerjaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjawslope = lowerjaw2.addOrReplaceChild("lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.9F, -0.3643F, 0.0F, 0.0F));

		PartDefinition lowerjawteeth1 = lowerjaw2.addOrReplaceChild("lowerjawteeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -2.2F, -0.2793F, 0.0F, 0.0F));

		PartDefinition jawparting = lowerjaw1.addOrReplaceChild("jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -1.2F, -0.4554F, 0.0F, 0.0F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9627F, -5.3899F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw2 = upperjaw1.addOrReplaceChild("upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition nose = upperjaw2.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition upperjawteeth = upperjaw2.addOrReplaceChild("upperjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, 0.0785F, 0.0F, 0.0F));

		PartDefinition upperjawteeth1 = upperjaw1.addOrReplaceChild("upperjawteeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -2.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftsabre = upperjaw1.addOrReplaceChild("leftsabre", CubeListBuilder.create(), PartPose.offset(1.9F, 4.0F, -5.03F));

		PartDefinition rightsabre = upperjaw1.addOrReplaceChild("rightsabre", CubeListBuilder.create(), PartPose.offset(-1.9F, 4.0F, -5.03F));

		PartDefinition fur1 = body.addOrReplaceChild("fur1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0687F, -18.2658F, 0.4098F, 0.0F, 0.0F));

		PartDefinition fur2 = fur1.addOrReplaceChild("fur2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.182F, 0.0F, 0.0F));

		PartDefinition fur3 = fur2.addOrReplaceChild("fur3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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