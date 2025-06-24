package fossils.fossils.client.blockentity.model.elginia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ElginiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart elginia;
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
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
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

	public ElginiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.elginia = this.fossil.getChild("elginia");
		this.lowerbody = this.elginia.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone2 = this.lowerbody.getChild("bone2");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.lowerbody.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.neck2 = this.upperbody.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -14.0F, 16.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.0F, -10.0F, -7.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.2F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -10.0F, -7.5F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -10.0F, 17.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition elginia = fossil.addOrReplaceChild("elginia", CubeListBuilder.create(), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition lowerbody = elginia.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, 0.2628F, -1.0178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.1F, 14.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.5674F, 1.607F, 2.62F));

		PartDefinition bone2 = lowerbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-2.5674F, 1.607F, 2.62F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9164F, 4.7284F, 3.3606F, 0.6106F, 0.2809F, -0.3471F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7208F, 5.7665F, -0.2087F, 0.0584F, -0.2618F, 0.3631F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4787F, 4.6354F, 1.6985F, 0.0F, 0.1745F, 0.0F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9164F, 4.7284F, 3.3606F, 0.0683F, -0.276F, 0.2564F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7208F, 5.7665F, -0.2087F, 0.1021F, 0.2618F, -0.3631F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4787F, 4.6354F, 1.6985F, 0.0436F, -0.0019F, 0.0436F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(51, 23).addBox(-0.5F, 0.0171F, -0.4086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2642F, 4.1371F, -0.205F, -0.1282F, 0.0266F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, 0.2739F, -0.3812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2329F, 3.7914F, -0.2303F, 0.2552F, -0.0591F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, 0.2131F, -0.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.1526F, 0.3453F, -0.052F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, 0.0899F, -6.0997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 0).addBox(-3.25F, 0.2055F, -6.6257F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.75F, -0.1156F, -6.274F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(24, 53).addBox(-0.5F, 0.2F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 56).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.75F, 0.0055F, -6.9257F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0832F, -3.9518F, 0.0028F, 0.0F, 0.0F));

		PartDefinition cube_r4 = upperbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 44).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -3.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(25, 64).addBox(-1.0F, 0.2F, -3.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 66).addBox(-1.0F, 0.2F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -4.9824F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 9).addBox(-0.5F, 0.2319F, -3.739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, 0.0F, 0.1745F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3161F, -4.2727F, -0.0546F, 0.3104F, 0.0666F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2728F, -0.9355F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.5648F, -1.7537F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.5648F, -1.7537F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.5235F, 5.8028F, -5.0391F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.5235F, 5.8028F, -5.0391F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1891F, 7.535F, -3.68F, 0.0562F, -0.2867F, -0.0091F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0114F, 4.0306F, 1.8406F, -0.6191F, 1.0988F, -0.4699F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 4.9519F, -0.536F, 0.3815F, -0.8052F, 0.0045F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1891F, 7.535F, -3.68F, 0.674F, 0.5481F, 0.0261F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0114F, 4.0306F, 1.8406F, -1.3572F, -0.4721F, 0.7576F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 4.9519F, -0.536F, 1.1232F, 0.8052F, -0.0045F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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