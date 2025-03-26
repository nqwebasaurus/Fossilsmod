package fossils.fossils.client.blockentity.model.henodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HenodusFossilModel extends SkullModelBase {
	private final ModelPart henodus;
	private final ModelPart shell;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HenodusFossilModel(ModelPart root) {
		this.henodus = root.getChild("henodus");
		this.shell = this.henodus.getChild("shell");
		this.neck = this.shell.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.frontleftleg = this.shell.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.shell.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.backleftleg = this.shell.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backrightleg3 = this.shell.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.shell.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition henodus = partdefinition.addOrReplaceChild("henodus", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.0F, 0.0F));

		PartDefinition shell = henodus.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 36).addBox(-5.0F, 0.0F, -5.0F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(6.0F, -1.0F, -5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).mirror().addBox(-6.0F, -1.0F, -5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(-6.0F, -2.0F, -5.0F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(41, 54).addBox(0.0F, -1.5F, -5.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(40, 6).addBox(-0.5F, -0.3F, -3.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, -0.1745F));

		PartDefinition cube_r1 = shell.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-11.5113F, -0.5197F, -6.0F, 0.0F, 0.7854F, -0.0436F));

		PartDefinition cube_r2 = shell.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 16).mirror().addBox(-12.0F, -1.0F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 36).mirror().addBox(-10.0F, -1.0F, -7.5F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 17).mirror().addBox(-6.0F, -1.0F, -7.5F, 5.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, 0.5F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r3 = shell.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(0.1272F, -0.4564F, -0.1949F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-12.5113F, -0.5197F, 6.25F, 0.0F, 0.5236F, -0.0436F));

		PartDefinition cube_r4 = shell.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 54).mirror().addBox(-3.9981F, -0.5872F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-6.5142F, -0.6506F, 10.0F, 0.0F, -0.1309F, -0.0436F));

		PartDefinition cube_r5 = shell.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 16).addBox(10.0F, -1.0F, -5.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(33, 36).addBox(6.0F, -1.0F, -7.5F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(28, 17).addBox(1.0F, -1.0F, -7.5F, 5.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r6 = shell.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 6).addBox(-2.1272F, -0.4564F, -0.1949F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(13.5113F, -0.5197F, 6.25F, 0.0F, -0.5236F, 0.0436F));

		PartDefinition cube_r7 = shell.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(12.5113F, -0.5197F, -6.0F, 0.0F, -0.7854F, 0.0436F));

		PartDefinition cube_r8 = shell.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 54).addBox(-0.0019F, -0.5872F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(7.5142F, -0.6506F, 10.0F, 0.0F, 0.1309F, 0.0436F));

		PartDefinition cube_r9 = shell.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-3.0F, -0.6F, -0.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -4.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r10 = shell.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -0.6F, -0.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3F, -4.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck = shell.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6644F, -4.7327F, 0.0024F, -0.1379F, 0.3024F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0347F, -0.0043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4957F, -1.4347F, 0.4786F, 0.123F, 1.219F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0347F, -0.0043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4957F, -1.4347F, 0.4786F, -0.123F, -1.219F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, -1.1F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.1644F, -0.5173F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -0.7237F, -1.9919F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 21).addBox(-2.0F, -0.4637F, -5.2419F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.611F, -3.0037F, -0.294F, -0.289F, -0.1801F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -0.75F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(1.5F, -0.75F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7237F, 0.0081F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7237F, -1.9919F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 21).mirror().addBox(-0.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(10, 21).addBox(1.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, -0.2237F, -3.7419F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 15).addBox(0.25F, -0.25F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8929F, -0.7237F, -1.0171F, 0.18F, -0.3007F, -0.5509F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 24).addBox(-0.25F, -0.25F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8929F, -0.7237F, -1.0171F, 0.18F, 0.3007F, 0.5509F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 15).addBox(-2.0F, -1.1F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.2763F, -1.9919F, -0.5672F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(28, 19).addBox(1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(1.0F, 0.0F, -4.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(1, 16).mirror().addBox(-1.0F, 0.0F, -4.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(28, 19).mirror().addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 88).addBox(-1.0F, 0.0F, -5.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.2763F, 0.0081F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r20 = jaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-2.0F, -0.0382F, 0.6435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(51, 4).addBox(1.0F, -0.0382F, 0.6435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.6284F, -2.4027F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r21 = jaw.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 51).mirror().addBox(-1.5F, -0.0226F, -1.9706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(56, 10).mirror().addBox(-1.5F, -0.0226F, -2.4706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false)
				.texOffs(56, 10).addBox(0.5F, -0.0226F, -2.4706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F))
				.texOffs(5, 51).addBox(0.5F, -0.0226F, -1.9706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.4265F, -1.7567F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frontleftleg = shell.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(56, 16).addBox(-1.0F, -0.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -0.25F, -4.75F, 0.201F, -0.9092F, -0.1144F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create().texOffs(41, 57).addBox(-1.0F, -0.75F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(25, 57).addBox(-1.5F, -0.75F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.75F, 0.0F, -0.5672F, 0.0F));

		PartDefinition frontrightleg = shell.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(56, 16).mirror().addBox(0.0F, -0.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.75F, -0.25F, -4.75F, 0.126F, 0.2192F, -0.0175F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(0.0F, -0.75F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(25, 57).mirror().addBox(-0.5F, -0.75F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition backleftleg = shell.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(6, 55).addBox(-0.1735F, -0.6358F, -0.3877F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -0.25F, 7.25F, -0.2086F, -0.0786F, 0.0832F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 29).addBox(-1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3265F, -0.1358F, 2.3623F, 0.0F, -0.2618F, 0.0F));

		PartDefinition backrightleg3 = shell.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(6, 55).mirror().addBox(-0.8265F, -0.6358F, -0.3877F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -0.25F, 7.25F, -0.2294F, -0.4331F, 0.0311F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 29).mirror().addBox(-1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3265F, -0.1358F, 2.3623F, 0.0F, 0.3927F, 0.0F));

		PartDefinition tail = shell.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 51).addBox(1.0F, -1.0F, -0.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 51).mirror().addBox(-1.0F, -1.0F, -0.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.0F, 8.0F, 0.0423F, -0.1739F, 0.0154F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 51).addBox(0.5F, -0.5F, -0.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).mirror().addBox(-0.5F, -0.5F, -0.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 3.25F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(28, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 7).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.25F, 0.0873F, -0.3491F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.henodus.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		henodus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}