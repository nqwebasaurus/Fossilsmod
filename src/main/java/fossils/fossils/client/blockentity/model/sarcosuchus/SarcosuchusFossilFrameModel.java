package fossils.fossils.client.blockentity.model.sarcosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SarcosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart eye4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public SarcosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.frontleftleg = this.body3.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.body3.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.eye4 = this.head.getChild("eye4");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -17.0F, 31.8F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.05F, -2.5F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-9.25F, -15.5F, -2.0F, 0.0F, 0.5149F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(3.5F, -10.25F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-9.25F, -15.5F, -2.0F, 0.5149F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -19.5F, 32.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -19.25F, 30.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 11).addBox(0.0F, 0.4824F, -0.2568F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 1.7F, 2.4F, -0.6517F, -0.3612F, -0.7714F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8748F, 10.4649F, 2.214F, 0.8473F, -0.5354F, 0.5743F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4869F, 8.6745F, 0.7016F, -0.0937F, -0.1747F, -0.0918F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 1.7F, 2.4F, -0.3044F, 0.8423F, 1.1821F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8748F, 10.4649F, 2.214F, 1.1075F, -0.1853F, 0.0838F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4869F, 8.6745F, 0.7016F, 0.3706F, 0.118F, -0.0353F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.85F, -6.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 66).addBox(-1.5F, 1.0F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(50, 39).addBox(-0.5F, 0.6F, -11.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.65F, -10.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -11.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 73).addBox(-1.5F, 1.0F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1F, 7.5F, -6.3F, -0.4882F, -0.0086F, -1.217F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5218F, 7.9971F, 0.2955F, -0.2818F, -0.6449F, 1.1858F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6123F, 9.4817F, 0.2887F, 0.5491F, -0.185F, -0.1243F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1F, 7.5F, -6.3F, 0.6026F, 0.0086F, 1.217F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5218F, 7.9971F, 0.2955F, -0.5148F, -0.328F, -1.151F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1123F, 9.4817F, 0.6887F, 0.3848F, 0.4234F, 0.1257F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.55F, -8.7F, -0.1631F, -0.1304F, -0.088F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 63).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.2F, 0.0F, -0.0436F, 0.0F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -6.3F, -0.1086F, -0.3156F, -0.0849F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 36).addBox(-1.0F, 0.15F, -1.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.456F, -9.445F, -0.1537F, -0.2322F, -0.098F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4693F, -0.9004F, -7.0059F, 0.0015F, 0.1745F, 0.0089F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7307F, -0.9004F, -7.0059F, 0.0015F, -0.1745F, -0.0089F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition eye4 = head.addOrReplaceChild("eye4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5131F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 1.1996F, 0.9441F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(59, 76).addBox(-0.5F, 0.8448F, -0.085F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.35F, 5.7F, -0.1986F, 0.2569F, -0.0511F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.8406F, 0.1708F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0448F, 8.715F, -0.1896F, 0.2573F, -0.0488F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 0.9619F, -0.2468F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1594F, 12.1208F, 0.0089F, 0.1745F, 0.0015F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5F, 0.587F, -0.1774F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2619F, 10.4532F, 0.064F, -0.3048F, -0.0192F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-1, 23).addBox(0.0F, 0.9F, -0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.413F, 6.7226F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(61, 63).addBox(-0.5F, 0.5678F, -0.0375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.613F, 11.2226F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.4311F, -0.4745F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0322F, 10.9625F, 0.1107F, -0.5209F, -0.0553F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(36, 63).addBox(-0.5F, 0.1F, -0.25F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2311F, 15.2255F, 0.0F, -0.6109F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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