package fossils.fossils.client.blockentity.model.cyamodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CyamodusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart leftShell;
	private final ModelPart rightShell;
	private final ModelPart hips;
	private final ModelPart backleftleg;
	private final ModelPart frontleftleg3;
	private final ModelPart backrightleg;
	private final ModelPart frontrightleg3;
	private final ModelPart leftShell2;
	private final ModelPart rightShell2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;

	public CyamodusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.leftShell = this.body.getChild("leftShell");
		this.rightShell = this.body.getChild("rightShell");
		this.hips = this.body.getChild("hips");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.frontleftleg3 = this.backleftleg.getChild("frontleftleg3");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.frontrightleg3 = this.backrightleg.getChild("frontrightleg3");
		this.leftShell2 = this.hips.getChild("leftShell2");
		this.rightShell2 = this.hips.getChild("rightShell2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.frontleftleg = this.body.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.body.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(33, 28).addBox(-0.5F, 0.1F, -3.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 34).addBox(-0.5F, 0.1F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.4F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 51).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.9324F, -7.3735F, 3.1416F, -1.5184F, -1.5708F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 46).addBox(-1.9F, 0.6F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7606F, -6.0329F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 46).addBox(-1.0F, 0.7F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1536F, -8.9865F, -0.329F, -0.1744F, -0.1587F));

		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, -0.8F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 67).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2365F, -1.7514F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1923F, -1.8499F, -0.0847F, -0.0302F, -0.1719F));

		PartDefinition cube_r5 = neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 40).addBox(-0.5F, 0.41F, -1.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1345F, -3.3814F, -0.1288F, -0.2173F, -0.0193F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.4372F, 0.4497F, -3.1709F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.4372F, 0.4497F, -3.1709F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3785F, -0.2983F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftShell = body.addOrReplaceChild("leftShell", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.6F, -3.1F, 0.0F, 0.0F, 0.0524F));

		PartDefinition rightShell = body.addOrReplaceChild("rightShell", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.6F, -3.1F, 0.0F, 0.0F, -0.0524F));

		PartDefinition hips = body.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(38, 62).addBox(-0.5F, 0.4F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 64).addBox(-0.5F, 0.4F, 2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, 0.0949F, 0.0869F, 0.0876F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 22).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.344F, 3.857F, -3.1416F, -1.5272F, 1.5708F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 18).addBox(-2.3F, 0.9F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0239F, 5.7164F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 19).addBox(0.0F, 0.3957F, 0.4583F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4529F, 2.1117F, 3.7748F, 0.1937F, 0.704F, 0.5378F));

		PartDefinition frontleftleg3 = backleftleg.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4371F, -0.3058F, 4.7384F, -3.1158F, -0.6534F, -0.0553F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4529F, 2.1117F, 3.7748F, 0.546F, -1.2843F, -0.9392F));

		PartDefinition frontrightleg3 = backrightleg.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4371F, -0.3058F, 4.7384F, -3.1202F, 0.3045F, 0.0461F));

		PartDefinition leftShell2 = hips.addOrReplaceChild("leftShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, -1.3F, 7.9F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightShell2 = hips.addOrReplaceChild("rightShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -1.3F, 7.9F, 0.0F, 0.0F, -0.0873F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.1738F, -0.3006F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 8).addBox(-0.5F, 0.1738F, 8.3994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4522F, 8.0454F, 0.0703F, 0.2221F, 0.1241F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 19).addBox(-0.5F, 0.2187F, -0.2002F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0229F, -0.0599F, 9.1027F, 0.1334F, 0.2691F, 0.0127F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0087F, 6.6998F, 0.1784F, -0.346F, -0.1392F));

		PartDefinition frontleftleg = body.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4824F, 1.4728F, -7.643F, 0.7722F, -0.9132F, -0.3493F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5577F, 0.5F, -4.2044F, -0.2145F, 0.5293F, -0.4074F));

		PartDefinition frontrightleg = body.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4824F, 1.4728F, -7.643F, 2.0747F, 0.8659F, 1.6073F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5577F, 0.5F, -4.2044F, 0.0F, 0.0436F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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