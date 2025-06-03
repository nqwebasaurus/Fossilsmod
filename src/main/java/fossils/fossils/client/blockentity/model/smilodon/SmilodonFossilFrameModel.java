package fossils.fossils.client.blockentity.model.smilodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SmilodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart sternum;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftThumb;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightThumb;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftCanine2;
	private final ModelPart rightCanine2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SmilodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.sternum = this.chest.getChild("sternum");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftCanine2 = this.head.getChild("leftCanine2");
		this.rightCanine2 = this.head.getChild("rightCanine2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -20.5F, 13.3F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.95F, -0.5F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-5.5F, -18.05F, -9.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.95F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-5.5F, -18.05F, -9.5F, 0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.3F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -19.5F, 13.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.723F, 11.9507F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.6014F, -0.0611F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, 0.0604F, -1.2793F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8812F, 0.0604F, -1.2793F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 3.2233F, 2.0603F, -0.6807F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.478F, -0.846F, 0.8465F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.1519F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 4.0374F, 0.731F, 0.2705F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 3.2233F, 2.0603F, -0.1134F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.478F, -0.846F, 0.8465F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.1519F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 4.0374F, 0.731F, -0.2967F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7244F, -3.6985F, -0.124F, 0.1732F, -0.0215F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, 0.5487F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8028F, -3.6452F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.3F, -4.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5949F, -5.8528F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 7).addBox(-0.5F, 0.6667F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.1F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 26).addBox(-0.5F, 0.3241F, -0.4807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 23).addBox(-0.5F, 0.3241F, -4.1807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0911F, -7.6847F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -0.1713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3094F, -1.3777F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 55).addBox(-0.5F, 0.3244F, -0.7118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 54).addBox(-0.5F, 0.3244F, -2.4118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8814F, 4.3862F, 0.6181F, 1.0021F, -0.009F, -0.0068F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.5337F, 1.6508F, -1.9548F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 7.3379F, 1.3658F, 0.8552F, 0.0F, 0.0F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2383F, 2.1254F, -0.2606F, -0.1466F, 0.1886F, 0.7813F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 3.0605F, 0.0949F, 1.8849F, 0.0037F, -0.0024F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8814F, 4.3862F, 0.6181F, 0.9585F, 0.009F, 0.0068F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.5337F, 1.6508F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 7.3379F, 1.3658F, -0.4572F, 0.1176F, -0.0576F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2383F, 2.1254F, -0.2606F, -0.1466F, -0.1886F, -0.7813F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 3.0605F, 0.0949F, 0.0087F, -0.0037F, 0.0024F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0528F, 2.9582F, 0.3414F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0528F, 2.9582F, 0.3414F, 0.0F, 0.0F, -0.0873F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3974F, -3.25F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 51).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 0.5324F, -1.0436F, -0.1051F, 0.0868F, -0.0091F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3943F, -1.9248F, 0.244F, 0.2199F, 0.401F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -4.6993F, -0.192F, 0.0214F, -0.0042F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.3507F, 0.0951F, -2.8248F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6493F, -4.7036F, 0.1715F, 0.0029F, -0.0224F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5247F, -2.0261F, -0.9763F, 0.1076F, -0.1984F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9225F, 5.7876F, -4.4926F, 0.0424F, -0.1019F, -0.0776F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9225F, 5.7876F, -4.4926F, 0.0424F, 0.1019F, 0.0776F));

		PartDefinition leftCanine2 = head.addOrReplaceChild("leftCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5976F, 5.8418F, -5.1098F, -0.3797F, -0.1647F, -0.1461F));

		PartDefinition rightCanine2 = head.addOrReplaceChild("rightCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5976F, 5.8418F, -5.1098F, -0.3797F, 0.1647F, 0.1461F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.4F, 1.4328F, 2.0323F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.4F, 1.4328F, 2.0323F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.4955F, -1.3122F, 2.0595F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2207F, 0.9014F, -5.0507F, -1.382F, 0.0554F, -2.6677F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9793F, 0.9014F, -5.0507F, -1.382F, -0.0554F, 2.6677F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.2897F, -0.114F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.8159F, -0.09F, 0.0952F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 15).addBox(-0.5F, 0.065F, -0.3039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 17).addBox(-0.5F, 0.065F, 2.3961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, 0.1384F, -0.5877F, 0.0536F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 58).addBox(-0.5F, 0.1855F, -0.5425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 59).addBox(-0.5F, 0.1855F, 1.1575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, 0.9121F, -0.278F, -0.3408F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, 0.2894F, -0.349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, 0.2466F, -0.2967F, -0.0735F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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