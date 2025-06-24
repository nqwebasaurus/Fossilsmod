package fossils.fossils.client.blockentity.model.scutosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ScutosaurusFossilFrameModel extends SkullModelBase {
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

	public ScutosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(6.5F, -7.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-6.5F, -15.0F, -8.0F, 0.3895F, -0.0263F, 1.6086F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.6F, 0.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-6.5F, -15.0F, -8.0F, 0.0284F, 0.3894F, 0.0486F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -7.3F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -12.5F, 13.1F, -0.0436F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -3.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -12.5F, 13.1F, 0.0F, -0.0436F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, 0.2627F, -1.1178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -11.8812F, 13.312F, -0.3752F, 0.0F, 0.0F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.5674F, 3.3917F, 3.0006F));

		PartDefinition bone4 = lowerbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.5674F, 3.3917F, 3.0006F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1164F, 6.279F, 1.6069F, 1.013F, 0.3999F, -0.1956F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6428F, 5.0709F, 0.9618F, 0.1762F, -0.4325F, 0.4018F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3787F, 5.5593F, 0.4812F, 0.0872F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1164F, 6.279F, 1.6069F, 0.0967F, -0.3999F, 0.1956F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6428F, 5.0709F, 0.9618F, 0.3943F, 0.4325F, -0.4018F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3787F, 5.5593F, 0.4812F, -0.2613F, 0.0188F, 0.1278F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2642F, 4.1371F, -0.1003F, 0.2941F, 0.2247F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 11).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5171F, 3.3914F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(70, 27).addBox(-0.5F, 0.2739F, -0.4812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.233F, 3.7914F, -0.2303F, 0.2552F, -0.0591F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.1551F, 0.3884F, -0.0592F));

		PartDefinition cube_r6 = tail5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 57).addBox(-0.5F, -0.5F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7131F, 2.9934F, 0.0F, -0.0349F, 0.0F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, 0.0899F, -6.1997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1496F, 0.1295F, 0.0195F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 19).addBox(-3.25F, 0.2055F, -8.2257F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.2F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.1834F, 0.0429F, 0.008F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, 0.1342F, 0.0865F, 0.0117F));

		PartDefinition cube_r7 = upperbody.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, 0.1F, -1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(71, 66).addBox(-1.0F, 0.2F, -3.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 68).addBox(-1.0F, 0.2F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -6.9824F, 0.0191F, 0.1736F, 0.0184F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, 0.2319F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, -0.2778F, 0.3367F, -0.0939F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2735F, -2.2631F, -0.0111F, 0.4341F, 0.108F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9737F, -1.0477F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.5648F, -1.7537F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.5648F, -1.7537F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.5235F, 6.7609F, -7.3258F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-4.5235F, 6.7609F, -7.3258F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1891F, 7.535F, -5.68F, 0.3362F, -0.0992F, -0.3885F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0487F, 4.7311F, 1.5978F, -0.8256F, 1.3567F, -0.4826F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4196F, 6.4753F, -0.6562F, -1.0F, -1.3819F, 0.783F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1891F, 7.535F, -5.68F, -0.3567F, -0.0374F, 0.4902F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0487F, 4.7311F, 1.5978F, -1.3711F, -0.9052F, 0.9282F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4196F, 6.4753F, -0.6562F, 0.0472F, 1.3819F, -0.783F));

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