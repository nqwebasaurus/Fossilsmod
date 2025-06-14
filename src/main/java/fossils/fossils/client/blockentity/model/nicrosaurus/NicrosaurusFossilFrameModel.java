package fossils.fossils.client.blockentity.model.nicrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NicrosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart hip;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public NicrosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.hip = this.main.getChild("hip");
		this.backLeftLeg = this.hip.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backRightLeg = this.hip.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hip.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.frontLeftLeg = this.body2.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontRightLeg = this.body2.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.0F, -8.9F, -6.4F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.1F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.0F, -8.9F, -6.4F, 0.3054F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.25F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.75F, 10.4F, -0.0175F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -9.75F, 10.4F, 0.0F, -0.0175F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.5F, -2.0F, 0.0F));

		PartDefinition hip = main.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(-0.5F, -9.6F, 9.75F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, 0.55F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.95F, -0.0524F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = hip.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9367F, 2.0782F, 0.5217F, -0.0269F, -0.0206F, -0.3166F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1005F, 6.5533F, 0.0486F, 0.6833F, -0.1298F, 0.228F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1677F, 3.8238F, 1.1485F, -0.6175F, -0.0358F, 0.0619F));

		PartDefinition backRightLeg = hip.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9367F, 2.0782F, 0.5217F, -0.5069F, 0.0206F, 0.3166F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1005F, 6.5533F, 0.0486F, 0.8142F, 0.1298F, -0.228F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1677F, 3.8238F, 1.1485F, -0.3121F, 0.0358F, -0.0619F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, 0.1957F, 0.1653F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6872F, 2.5542F, -0.2436F, -0.2544F, 0.0625F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(43, 42).addBox(-0.5F, 0.3638F, -0.1887F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1831F, 6.1715F, -0.0587F, -0.4017F, -0.0981F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.3256F, -0.2928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 29).addBox(-0.5F, 0.3256F, 6.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.053F, 4.7604F, -0.009F, -0.3072F, -0.0805F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, 0.1999F, -0.2087F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 39).addBox(-0.5F, 0.1999F, 5.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1328F, 6.8879F, 0.0213F, -0.6108F, -0.0122F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2909F, -0.1042F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 20).addBox(-0.5F, 0.2909F, 7.4958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.0982F, 6.0127F, 0.2261F, 0.3837F, 0.0859F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.2039F, 7.7959F, 0.0567F, 0.3921F, 0.0217F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -1.85F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(55, 6).addBox(0.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -10.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 19).addBox(0.0F, 0.625F, 0.0258F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -10.9F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 26).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1079F, -4.0707F, 0.1222F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body2.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.071F, 3.6929F, -3.3897F, -0.0834F, 0.3043F, -0.3075F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3258F, 3.7662F, 0.4296F, -0.6875F, 0.0317F, 0.3036F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4269F, 4.3014F, -0.4872F, 0.7055F, -0.0289F, -0.0272F));

		PartDefinition frontRightLeg = body2.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.071F, 3.6929F, -3.3897F, 0.7893F, -0.3043F, 0.3075F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3258F, 3.7662F, 0.4296F, -0.6862F, -0.0648F, -0.3321F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4269F, 4.3014F, -0.4872F, -0.1272F, 0.091F, -0.0343F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, 0.3448F, -2.9769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4631F, -3.8938F, 0.073F, 0.3F, 0.105F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.029F, -2.8305F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, 0.4483F, -0.0087F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0842F, -3.6464F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.0F, -3.65F, -0.3491F, 0.3054F, 0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.2F, 0.4F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.5771F, -0.1017F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.5771F, -0.1017F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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