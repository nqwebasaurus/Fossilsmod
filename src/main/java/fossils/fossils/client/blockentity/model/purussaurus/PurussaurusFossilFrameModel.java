package fossils.fossils.client.blockentity.model.purussaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PurussaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart eye4;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail8;
	private final ModelPart tail7;

	public PurussaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone2 = this.body3.getChild("bone2");
		this.bone3 = this.body3.getChild("bone3");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.eye4 = this.head.getChild("eye4");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail8 = this.tail6.getChild("tail8");
		this.tail7 = this.tail8.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -9.0F, 17.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, 3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.5F, -14.0F, -20.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-7.5F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5F, -14.0F, -20.7F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-7.1F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -14.0F, 17.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 4.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -14.2131F, 17.5269F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 47).addBox(0.0F, 0.4824F, 0.1432F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -4.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.5F, -0.9F, -8.2F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.9F, -8.2F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 2.3944F, 0.4149F, 0.6794F, -0.4267F, -0.5958F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2588F, 6.5719F, 1.2737F, 1.2864F, 0.8065F, 0.3019F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0259F, 6.2348F, -0.1452F, 1.2583F, -0.0241F, 0.261F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 2.3944F, 0.4149F, 0.5832F, 0.2246F, 0.8381F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2588F, 6.5719F, 1.2737F, 0.9855F, -0.4721F, -0.2659F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0259F, 6.2348F, -0.1452F, 1.4581F, -0.5371F, 0.2957F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.85F, -4.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(70, 15).addBox(-1.5F, 1.0F, 0.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, 0.6F, -14.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.65F, -10.0F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -14.0F, 0.1376F, -0.0444F, -0.0161F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 31).addBox(-1.5F, 1.0F, -4.1F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6703F, 5.4411F, -10.5699F, 1.0229F, -0.1675F, -0.8898F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2598F, 6.925F, -0.6143F, -1.0969F, -0.026F, 0.4033F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1171F, 5.855F, -0.0993F, 0.3844F, -0.291F, 0.6158F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6703F, 5.4411F, -10.5699F, 0.502F, -0.1784F, 0.9077F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2598F, 6.925F, -0.6143F, -0.973F, 0.1406F, -0.1372F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1171F, 5.855F, -0.0993F, 0.2591F, 0.3081F, -0.8842F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(7.0F, -0.5261F, -10.3119F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-7.0F, -0.5261F, -10.3119F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, 0.4F, -6.7F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.85F, -13.1F, 0.0518F, -0.0978F, -0.0526F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3868F, -6.6041F, -0.1743F, -0.0827F, 0.0033F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, 0.05F, -0.6F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.9254F, -7.864F, -0.3337F, -0.2037F, 0.0188F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4693F, -0.9004F, -7.0059F, 0.0015F, 0.1745F, 0.0089F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7307F, -0.9004F, -7.0059F, 0.0015F, -0.1745F, -0.0089F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition eye4 = head.addOrReplaceChild("eye4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5131F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, -0.6092F, -0.1629F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 73).addBox(-0.5F, 0.8448F, 0.215F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.35F, 6.8F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, 0.8406F, 0.1708F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0448F, 8.715F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, 0.9619F, -0.4468F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1214F, 12.4194F, 0.0455F, -0.0416F, -0.0455F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(41, 86).addBox(-0.5F, 0.587F, -0.3774F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(108, 51).addBox(-0.5F, 0.4661F, 6.3237F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2514F, 10.8531F, -0.0057F, -0.1319F, -0.0915F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(64, 28).addBox(-0.5F, 0.6678F, -0.1375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1792F, 11.1139F, 0.0F, 0.0F, -0.0436F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(92, 85).addBox(-0.5F, 0.6311F, -0.5745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 92).addBox(-0.5F, 0.6311F, 7.1255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0515F, 11.2098F, -0.0331F, -0.045F, -0.0402F));

		PartDefinition tail8 = tail6.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(89, 44).addBox(-1.0F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4311F, 7.7255F, 0.0436F, 0.0019F, -0.0436F));

		PartDefinition tail7 = tail8.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5F, 0.3F, -0.45F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1039F, 8.1241F, -0.0195F, -0.1312F, -0.0578F));

		return LayerDefinition.create(meshdefinition, 157, 157);
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