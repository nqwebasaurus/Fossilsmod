package fossils.fossils.client.blockentity.model.bunostegos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BunostegosFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart lowerbody;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart tail;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head2;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;

	public BunostegosFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.lowerbody = this.hips.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone2 = this.lowerbody.getChild("bone2");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail4 = this.tail.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.lowerbody.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.neck2 = this.upperbody.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head2 = this.neck3.getChild("head2");
		this.jaw = this.head2.getChild("jaw");
		this.leftFace = this.head2.getChild("leftFace");
		this.rightFace = this.head2.getChild("rightFace");
		this.bone3 = this.upperbody.getChild("bone3");
		this.bone4 = this.upperbody.getChild("bone4");
		this.frontleftleg4 = this.upperbody.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.upperbody.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.5F, 13.1F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.2F, -6.0F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -14.0F, -11.1F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.3F, -6.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.0F, -11.1F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.2F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.0F, 13.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(26, 42).addBox(-0.5F, 0.2627F, -0.7179F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.9812F, 13.312F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.5674F, 3.3917F, 3.0006F));

		PartDefinition bone2 = lowerbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-5.5674F, 3.3917F, 3.0006F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1164F, 4.6277F, 1.4919F, 0.4889F, 0.2271F, 0.3622F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7616F, 5.8644F, 1.16F, 0.0897F, -0.4697F, -0.1853F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3787F, 5.5593F, 0.4812F, -0.0437F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1164F, 4.6277F, 1.4919F, 0.6773F, -0.1729F, -0.432F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7616F, 5.8644F, 1.16F, 0.0024F, 0.4697F, 0.1853F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3787F, 5.5593F, 0.4812F, -0.0873F, -0.0038F, 0.0435F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(50, 58).addBox(-0.5F, 0.017F, -0.1086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2643F, 4.1371F, -0.2566F, -0.0844F, 0.0221F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(67, 43).addBox(-0.5F, 0.2738F, -0.1812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.233F, 3.7914F, -0.0483F, -0.0872F, 0.0042F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(68, 5).addBox(-0.5F, 0.2131F, -0.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, 0.1676F, -0.2583F, -0.0432F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, 0.0899F, -6.4997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 5).addBox(-0.5F, 0.0899F, -0.7997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1658F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 10).addBox(-3.25F, 0.2055F, -8.1257F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 42).addBox(-0.5F, 0.2F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.07F, 0.0431F, 0.0068F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, 0.0727F, 0.0435F, 0.0038F));

		PartDefinition cube_r4 = upperbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, 0.2F, -3.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 24).addBox(-1.0F, 0.2F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -6.9824F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(27, 59).addBox(-0.5F, 0.2319F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, 0.1759F, 0.1739F, 0.0154F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0385F, -3.197F, 0.2871F, 0.3359F, 0.097F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6915F, -0.3877F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.4795F, -1.0589F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.4795F, -1.0589F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.5235F, 6.7609F, -7.3258F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.5235F, 6.7609F, -7.3258F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9642F, 7.535F, -5.68F, 0.4749F, 0.1044F, 0.7432F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3092F, 5.0985F, 1.4255F, -0.2686F, 0.5224F, -0.9972F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1816F, 5.5716F, -0.2581F, -0.0145F, -0.858F, 0.2025F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9642F, 7.535F, -5.68F, 0.9384F, 0.1388F, -0.5235F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3092F, 5.0985F, 1.4255F, -0.8877F, 0.0776F, 2.019F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1816F, 5.5716F, -0.2581F, -0.2054F, 1.1937F, -1.4114F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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