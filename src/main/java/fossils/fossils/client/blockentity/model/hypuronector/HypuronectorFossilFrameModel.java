package fossils.fossils.client.blockentity.model.hypuronector;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypuronectorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hypuronector;
	private final ModelPart lowerbody;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart finger;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart finger2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart upperbody;
	private final ModelPart frontleftarm;
	private final ModelPart frontleftarm2;
	private final ModelPart frontleftarm3;
	private final ModelPart frontleftarm4;
	private final ModelPart frontrightarm;
	private final ModelPart frontrightarm2;
	private final ModelPart frontrightarm3;
	private final ModelPart frontrightarm4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw;

	public HypuronectorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hypuronector = this.fossil.getChild("Hypuronector");
		this.lowerbody = this.Hypuronector.getChild("lowerbody");
		this.backleftleg = this.lowerbody.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.finger = this.backleftleg3.getChild("finger");
		this.backrightleg = this.lowerbody.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.finger2 = this.backrightleg3.getChild("finger2");
		this.tail = this.lowerbody.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.lowerbody.getChild("body");
		this.upperbody = this.body.getChild("upperbody");
		this.frontleftarm = this.upperbody.getChild("frontleftarm");
		this.frontleftarm2 = this.frontleftarm.getChild("frontleftarm2");
		this.frontleftarm3 = this.frontleftarm2.getChild("frontleftarm3");
		this.frontleftarm4 = this.frontleftarm2.getChild("frontleftarm4");
		this.frontrightarm = this.upperbody.getChild("frontrightarm");
		this.frontrightarm2 = this.frontrightarm.getChild("frontrightarm2");
		this.frontrightarm3 = this.frontrightarm2.getChild("frontrightarm3");
		this.frontrightarm4 = this.frontrightarm2.getChild("frontrightarm4");
		this.neck = this.upperbody.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -15.0F, 14.4F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.8F, -3.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -12.0F, -3.7F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -9.9F, -3.7F, 0.122F, 0.0064F, -1.6228F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -14.5F, 14.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hypuronector = fossil.addOrReplaceChild("Hypuronector", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = Hypuronector.addOrReplaceChild("lowerbody", CubeListBuilder.create(), PartPose.offset(0.0F, -10.7F, 10.0F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 18).addBox(-0.5F, 0.7F, 0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.85F, -0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backleftleg = lowerbody.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, 1.45F, 4.95F, -0.3051F, -0.0072F, -0.0952F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.506F, 7.3876F, 0.4497F, 0.6961F, -0.0653F, 0.0626F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0268F, 5.5994F, 0.0082F, -0.3763F, 0.0331F, 0.0955F));

		PartDefinition finger = backleftleg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9952F, 0.4042F, 0.3042F, 0.0F, 0.2618F, 0.0F));

		PartDefinition backrightleg = lowerbody.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, 1.45F, 4.95F, -0.6082F, 0.0572F, 0.1668F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.506F, 7.3876F, 0.4497F, 0.5216F, 0.0653F, -0.0626F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0268F, 5.5994F, 0.0082F, 0.3219F, -0.0331F, -0.0955F));

		PartDefinition finger2 = backrightleg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9952F, 0.4042F, 0.3042F, 0.0F, -0.2618F, 0.0F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.723F, 6.1814F, -0.0922F, 0.3032F, -0.016F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.7F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.027F, -2.1814F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.377F, 4.8186F, 0.2669F, 0.2129F, 0.0479F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, -1).addBox(-0.5F, -0.15F, -4.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1594F, 3.8564F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4592F, 7.7524F, -0.0894F, 0.2173F, -0.0193F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 25).addBox(-0.5F, 0.5243F, 0.1576F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7002F, 0.104F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.005F, -0.6693F, 6.7881F, -0.2716F, 0.083F, -0.027F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6743F, 12.7576F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.005F, -0.0309F, -12.8841F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, 12.9F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.55F, -0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 33).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.85F, -12.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.7894F, 0.54F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition upperbody = body.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -12.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r11 = upperbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 36).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.15F, -3.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition frontleftarm = upperbody.addOrReplaceChild("frontleftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 6.15F, -1.95F, -0.5417F, -0.0134F, -0.2521F));

		PartDefinition frontleftarm2 = frontleftarm.addOrReplaceChild("frontleftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1238F, 0.1887F, 7.3547F, 0.1252F, -0.0438F, 0.256F));

		PartDefinition frontleftarm3 = frontleftarm2.addOrReplaceChild("frontleftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4089F, 5.5813F, 0.3197F, -1.0893F, 0.2209F, 0.069F));

		PartDefinition frontleftarm4 = frontleftarm2.addOrReplaceChild("frontleftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4089F, 5.5813F, 0.3197F, -1.0389F, -0.3684F, -0.2082F));

		PartDefinition frontrightarm = upperbody.addOrReplaceChild("frontrightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 6.15F, -1.95F, -2.287F, 0.0134F, 0.2521F));

		PartDefinition frontrightarm2 = frontrightarm.addOrReplaceChild("frontrightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1238F, 0.1887F, 7.3547F, 0.89F, 0.0878F, 0.0911F));

		PartDefinition frontrightarm3 = frontrightarm2.addOrReplaceChild("frontrightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4089F, 5.5813F, 0.3197F, 0.2197F, -0.2209F, -0.069F));

		PartDefinition frontrightarm4 = frontrightarm2.addOrReplaceChild("frontrightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4089F, 5.5813F, 0.3197F, 0.3137F, 0.3684F, 0.2082F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7516F, -3.5943F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -0.1625F, 0.0296F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1984F, -5.7057F, 0.3229F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(-1, 6).addBox(-0.5F, 0.211F, -4.2227F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6594F, -5.6024F, -0.1374F, -0.4293F, -0.1922F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0728F, -3.7982F, -0.3242F, -0.3861F, 0.0736F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 11).addBox(-0.5F, 0.5426F, -0.4702F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.24F, -2.7678F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8536F, -2.5588F, 0.1632F, -0.1281F, -0.0268F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1535F, -0.4893F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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