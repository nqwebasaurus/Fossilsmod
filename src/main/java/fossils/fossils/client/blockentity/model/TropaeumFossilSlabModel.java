package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

@SuppressWarnings("unused")
public class TropaeumFossilSlabModel extends SkullModelBase {
	private final ModelPart Root;
	private final ModelPart shell0;
	private final ModelPart Shell;
	private final ModelPart Shell2;
	private final ModelPart Shell3;
	private final ModelPart Shell4;
	private final ModelPart Shell5;
	private final ModelPart Shell6;
	private final ModelPart Shell7;
	private final ModelPart Shell8;
	private final ModelPart Shell9;
	private final ModelPart Shell10;
	private final ModelPart Shell11;
	private final ModelPart Shell12;
	private final ModelPart stand;
	private final ModelPart back;

	public TropaeumFossilSlabModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.shell0 = this.Root.getChild("shell0");
		this.Shell = this.shell0.getChild("Shell");
		this.Shell2 = this.Shell.getChild("Shell2");
		this.Shell3 = this.Shell2.getChild("Shell3");
		this.Shell4 = this.Shell3.getChild("Shell4");
		this.Shell5 = this.Shell4.getChild("Shell5");
		this.Shell6 = this.Shell5.getChild("Shell6");
		this.Shell7 = this.Shell6.getChild("Shell7");
		this.Shell8 = this.Shell7.getChild("Shell8");
		this.Shell9 = this.Shell8.getChild("Shell9");
		this.Shell10 = this.Shell9.getChild("Shell10");
		this.Shell11 = this.Shell10.getChild("Shell11");
		this.Shell12 = this.Shell11.getChild("Shell12");
		this.stand = this.Root.getChild("stand");
		this.back = this.stand.getChild("back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition shell0 = Root.addOrReplaceChild("shell0", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -17.0F, 7.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Shell = shell0.addOrReplaceChild("Shell", CubeListBuilder.create().texOffs(18, 47).addBox(-3.5F, -7.1808F, -5.5736F, 7.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, 7.5F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Shell.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 60).addBox(-3.5F, -4.0F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -2.275F, -0.096F, 0.0F, 0.0F));

		PartDefinition Shell2 = Shell.addOrReplaceChild("Shell2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -6.0F, -10.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(-0.01F))
		.texOffs(54, 60).addBox(-4.0F, -4.65F, -4.825F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Shell2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 60).addBox(-3.5F, -4.5F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.25F, -1.15F, 0.336F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Shell2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 11).addBox(-3.5F, -3.5F, -0.5F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.05F, -7.475F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Shell3 = Shell2.addOrReplaceChild("Shell3", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, -5.1808F, -9.4264F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(66, 45).addBox(-3.5F, -3.55F, -5.75F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Shell3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 52).addBox(-3.5F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.35F, -8.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Shell3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 19).addBox(-4.0F, -3.0F, -0.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.05F, -1.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Shell4 = Shell3.addOrReplaceChild("Shell4", CubeListBuilder.create().texOffs(32, 17).addBox(-3.0F, -5.7412F, -9.0341F, 6.0F, 6.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Shell4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 66).addBox(-3.5F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.925F, -5.7F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Shell4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 26).addBox(-3.5F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.925F, -2.95F, 0.192F, 0.0F, 0.0F));

		PartDefinition Shell5 = Shell4.addOrReplaceChild("Shell5", CubeListBuilder.create().texOffs(28, 33).addBox(-2.5F, -5.4462F, -8.1051F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -0.7243F, 0.0F, 0.0F));

		PartDefinition Shell6 = Shell5.addOrReplaceChild("Shell6", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5F, -5.9537F, -8.6993F, 5.0F, 5.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition Shell7 = Shell6.addOrReplaceChild("Shell7", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0F, -5.8788F, -9.4772F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition Shell8 = Shell7.addOrReplaceChild("Shell8", CubeListBuilder.create().texOffs(42, 47).addBox(-2.0F, -5.2164F, -8.9763F, 4.0F, 5.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Shell9 = Shell8.addOrReplaceChild("Shell9", CubeListBuilder.create().texOffs(56, 33).addBox(-1.5F, -4.3947F, -7.796F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.8683F, 0.0F, 0.0F));

		PartDefinition Shell10 = Shell9.addOrReplaceChild("Shell10", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -3.0021F, -7.0654F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Shell11 = Shell10.addOrReplaceChild("Shell11", CubeListBuilder.create().texOffs(54, 68).addBox(-0.5F, -3.296F, -3.2898F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(0.0F, -9.296F, -9.2898F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Shell12 = Shell11.addOrReplaceChild("Shell12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.6763F, 0.0F, 0.0F));

		PartDefinition stand = Root.addOrReplaceChild("stand", CubeListBuilder.create().texOffs(0, 101).addBox(4.0F, 5.0F, -21.05F, 5.0F, 5.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -10.0F, 12.0F));

		PartDefinition cube_r8 = stand.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(92, 118).addBox(-5.0F, -4.0F, -1.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 8.25F, -2.25F, 0.4129F, 0.0106F, -0.1985F));

		PartDefinition cube_r9 = stand.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 118).addBox(-5.0F, -4.0F, -1.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 10.25F, -11.5F, -0.0264F, 0.0203F, -0.1884F));

		PartDefinition cube_r10 = stand.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 118).addBox(-5.0F, -4.0F, -1.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 8.25F, -18.75F, -0.3755F, 0.0203F, -0.1884F));

		PartDefinition back = stand.addOrReplaceChild("back", CubeListBuilder.create().texOffs(16, 84).addBox(-3.0F, -16.75F, -15.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(12, 80).addBox(-3.75F, -9.75F, -16.925F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(8.75F, 9.0F, -2.075F));

		PartDefinition cube_r11 = back.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 96).addBox(-5.0F, -24.0F, 0.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.175F, -19.475F, -0.1891F, 0.0803F, 0.094F));

		PartDefinition cube_r12 = back.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 87).addBox(-1.0F, -0.0846F, -2.8462F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.325F, -23.3F, -11.25F, -0.0783F, 0.0503F, 0.0836F));

		PartDefinition cube_r13 = back.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 96).addBox(-2.0F, -4.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -20.375F, -12.475F, 0.4134F, 0.0506F, -0.181F));

		PartDefinition cube_r14 = back.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 96).addBox(-5.0F, -24.0F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.05F, 0.32F, -0.0803F, 0.094F));

		PartDefinition cube_r15 = back.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(31, 96).addBox(-2.0F, -4.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -19.675F, -9.525F, -0.5465F, 0.0506F, -0.181F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.Root.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}