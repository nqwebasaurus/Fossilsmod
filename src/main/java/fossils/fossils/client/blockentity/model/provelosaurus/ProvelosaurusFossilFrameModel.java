package fossils.fossils.client.blockentity.model.provelosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProvelosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart lowerbody;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart tail;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail2;
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
	private final ModelPart bone2;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;

	public ProvelosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.lowerbody = this.hips.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone4 = this.lowerbody.getChild("bone4");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail4 = this.tail.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
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
		this.bone2 = this.upperbody.getChild("bone2");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.0F, 12.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.95F, -7.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, -13.05F, -8.9F, -0.3491F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.625F, -4.95F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.8F, -13.05F, -8.9F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(2.4F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -14.5F, 12.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(41, 46).addBox(-0.5F, 0.2877F, -0.9679F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.7812F, 12.312F, -0.3316F, 0.0F, 0.0F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.0674F, 1.5917F, -1.4994F));

		PartDefinition bone4 = lowerbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0674F, 1.5917F, -1.4994F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8876F, 4.9592F, 1.6828F, 0.191F, 0.92F, -0.1158F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7778F, 5.1693F, 1.3113F, -0.3781F, -1.1165F, 0.6244F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3089F, 7.2388F, -0.3757F, 0.0872F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8876F, 4.9592F, 1.6828F, 0.7197F, -0.4366F, 0.0441F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7778F, 5.1693F, 1.3113F, -0.3781F, 1.1165F, -0.6244F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3089F, 7.2388F, -0.3757F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(55, 16).addBox(-0.5F, 0.042F, -0.3586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2643F, 4.1371F, -0.212F, 0.0F, 0.0F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, 0.3488F, -0.2562F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2329F, 3.7914F, -0.2791F, -0.1679F, 0.0478F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(7, 64).addBox(-0.5F, 0.3131F, -0.3066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.2925F, -0.2511F, 0.0747F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(66, 12).addBox(-0.45F, 0.8131F, -0.0816F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.8F, -0.4548F, -0.276F, 0.1325F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5F, 0.1149F, -6.4497F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 39).addBox(-0.5F, 0.1149F, -1.0497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1836F, -0.0413F, -0.0142F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 10).addBox(-3.25F, 0.2305F, -7.8507F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.114F, -0.0863F, -0.0129F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(4, 47).addBox(-0.5F, 0.25F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 43).addBox(-0.5F, 0.25F, -5.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.0525F, -0.0872F, -0.0031F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, -0.006F, 0.0436F, -0.0003F));

		PartDefinition cube_r4 = upperbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 46).addBox(-1.0F, 0.1F, 0.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(64, 34).addBox(-1.0F, 0.2F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3322F, -4.8824F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(54, 42).addBox(-0.5F, 0.2319F, -3.639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1565F, -2.6457F, -0.1566F, -0.3446F, 0.0264F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2307F, -1.8415F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9919F, 2.4922F, -2.3992F, 0.0758F, 0.1304F, -0.088F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9919F, 2.4922F, -2.3992F, 0.0758F, -0.1304F, 0.088F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5235F, 10.1834F, -4.305F, 0.7418F, 0.0F, 0.0F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5235F, 10.1834F, -4.305F, 0.7418F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2088F, 9.093F, -1.614F, 0.6304F, -0.2875F, -0.2028F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1956F, 4.2251F, 1.8859F, -1.1898F, 0.9134F, -0.9726F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4196F, 6.4753F, -0.6562F, -0.5637F, -1.3819F, 0.783F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2088F, 9.093F, -1.614F, -0.7288F, -1.1347F, 0.5355F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1956F, 4.2251F, 1.8859F, -0.355F, -0.558F, 0.6498F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4196F, 6.4753F, -0.6562F, 0.3526F, 1.3819F, -0.783F));

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