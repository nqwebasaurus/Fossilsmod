package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EndocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart shellbase;
	private final ModelPart shell1;
	private final ModelPart shell2;
	private final ModelPart shell3;
	private final ModelPart shell4;
	private final ModelPart shell5;
	private final ModelPart shell6;
	private final ModelPart shell7;
	private final ModelPart shell7top;
	private final ModelPart shell7bottom;
	private final ModelPart shell6top;
	private final ModelPart shell6bottom;
	private final ModelPart shell5top;
	private final ModelPart shell5bottom;
	private final ModelPart shell4top;
	private final ModelPart shell4bottom;
	private final ModelPart shell3top;
	private final ModelPart shell3bottom;
	private final ModelPart shell2top;
	private final ModelPart shell2bottom;

	public EndocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.head = this.root.getChild("head");
		this.shellbase = this.head.getChild("shellbase");
		this.shell1 = this.shellbase.getChild("shell1");
		this.shell2 = this.shell1.getChild("shell2");
		this.shell3 = this.shell2.getChild("shell3");
		this.shell4 = this.shell3.getChild("shell4");
		this.shell5 = this.shell4.getChild("shell5");
		this.shell6 = this.shell5.getChild("shell6");
		this.shell7 = this.shell6.getChild("shell7");
		this.shell7top = this.shell7.getChild("shell7top");
		this.shell7bottom = this.shell7.getChild("shell7bottom");
		this.shell6top = this.shell6.getChild("shell6top");
		this.shell6bottom = this.shell6.getChild("shell6bottom");
		this.shell5top = this.shell5.getChild("shell5top");
		this.shell5bottom = this.shell5.getChild("shell5bottom");
		this.shell4top = this.shell4.getChild("shell4top");
		this.shell4bottom = this.shell4.getChild("shell4bottom");
		this.shell3top = this.shell3.getChild("shell3top");
		this.shell3bottom = this.shell3.getChild("shell3bottom");
		this.shell2top = this.shell2.getChild("shell2top");
		this.shell2bottom = this.shell2.getChild("shell2bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-3.0F, -25.0678F, -1.448F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -0.6065F, -16.4404F, -1.5708F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(120, 42).addBox(1.0F, -25.0678F, -1.448F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -0.6065F, -16.4404F, -1.5708F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(113, 47).mirror().addBox(-0.6784F, -16.5187F, -28.5532F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 47).mirror().addBox(-0.6784F, -12.5187F, -16.7532F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 47).mirror().addBox(-0.4784F, -11.5187F, -3.3532F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.1204F, -0.8501F, 10.6327F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-1.0F, -54.8973F, -3.3532F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.0F, -1.1065F, -14.4404F, -0.0861F, -0.0144F, -0.1652F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 42).addBox(-1.0F, -54.8973F, -3.3532F, 2.0F, 56.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-9.0F, -1.1065F, -14.4404F, -0.0861F, 0.0144F, 0.1652F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 42).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 56.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, -12.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 29.5F, 1.0F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition shellbase = head.addOrReplaceChild("shellbase", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2F, 17.0F));

		PartDefinition shell1 = shellbase.addOrReplaceChild("shell1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition shell2 = shell1.addOrReplaceChild("shell2", CubeListBuilder.create().texOffs(0, 26).addBox(-5.5F, -4.5F, 1.0F, 11.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.5F, -2.5F, 0.0F, 11.0F, 7.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition shell3 = shell2.addOrReplaceChild("shell3", CubeListBuilder.create().texOffs(0, 46).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 18.0F));

		PartDefinition shell4 = shell3.addOrReplaceChild("shell4", CubeListBuilder.create().texOffs(43, 48).addBox(-4.5F, -3.5F, 0.0F, 9.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition shell5 = shell4.addOrReplaceChild("shell5", CubeListBuilder.create().texOffs(72, 56).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition shell6 = shell5.addOrReplaceChild("shell6", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -2.5F, 0.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(25, 79).addBox(-2.5F, -2.5F, 0.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition shell7 = shell6.addOrReplaceChild("shell7", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -2.0F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition shell7top = shell7.addOrReplaceChild("shell7top", CubeListBuilder.create().texOffs(32, 48).addBox(0.5F, 0.0F, -10.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 10.0F));

		PartDefinition shell7bottom = shell7.addOrReplaceChild("shell7bottom", CubeListBuilder.create().texOffs(6, 30).addBox(1.5F, 0.0F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 10.0F));

		PartDefinition shell6top = shell6.addOrReplaceChild("shell6top", CubeListBuilder.create().texOffs(51, 18).addBox(-2.0F, 0.0F, -10.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 10.0F));

		PartDefinition shell6bottom = shell6.addOrReplaceChild("shell6bottom", CubeListBuilder.create().texOffs(30, 66).addBox(1.0F, 0.0F, -10.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, 10.0F));

		PartDefinition shell5top = shell5.addOrReplaceChild("shell5top", CubeListBuilder.create().texOffs(78, 30).addBox(-3.5F, 0.0F, -10.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 10.0F));

		PartDefinition shell5bottom = shell5.addOrReplaceChild("shell5bottom", CubeListBuilder.create().texOffs(78, 18).addBox(-3.5F, 0.0F, -10.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 10.0F));

		PartDefinition shell4top = shell4.addOrReplaceChild("shell4top", CubeListBuilder.create().texOffs(78, 0).addBox(-4.0F, 0.0F, -10.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 10.0F));

		PartDefinition shell4bottom = shell4.addOrReplaceChild("shell4bottom", CubeListBuilder.create().texOffs(72, 73).addBox(-4.0F, 0.0F, -10.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, 10.0F));

		PartDefinition shell3top = shell3.addOrReplaceChild("shell3top", CubeListBuilder.create().texOffs(41, 66).addBox(-4.5F, 0.0F, -10.0F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 10.0F));

		PartDefinition shell3bottom = shell3.addOrReplaceChild("shell3bottom", CubeListBuilder.create().texOffs(0, 66).addBox(-4.5F, 0.0F, -10.0F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 10.0F));

		PartDefinition shell2top = shell2.addOrReplaceChild("shell2top", CubeListBuilder.create().texOffs(41, 0).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 10.0F));

		PartDefinition shell2bottom = shell2.addOrReplaceChild("shell2bottom", CubeListBuilder.create().texOffs(39, 28).addBox(-5.0F, 0.0F, -10.0F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.5F, 10.0F));

		return LayerDefinition.create(meshdefinition, 128, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}