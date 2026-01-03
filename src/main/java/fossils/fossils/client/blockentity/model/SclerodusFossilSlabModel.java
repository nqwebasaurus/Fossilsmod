package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SclerodusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Sclerodus;
	private final ModelPart Head;
	private final ModelPart Leftside;
	private final ModelPart Rightside;

	public SclerodusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Sclerodus = this.fossil.getChild("Sclerodus");
		this.Head = this.Sclerodus.getChild("Head");
		this.Leftside = this.Head.getChild("Leftside");
		this.Rightside = this.Head.getChild("Rightside");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(35, 58).addBox(-10.0F, -2.0F, -14.0F, 15.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 0).addBox(-3.5F, -1.0F, -9.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.3944F, -4.0F, 1.7423F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 67).addBox(0.184F, -1.5F, -2.0093F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2202F, -3.5F, 5.6263F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 62).addBox(-27.9F, -6.0F, 2.7F, 6.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -25.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-17.0F, -3.0F, 0.0F, 7.0F, 3.0F, 21.0F, new CubeDeformation(0.003F))
				.texOffs(36, 21).addBox(-10.0F, -2.0F, 0.0F, 10.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, -14.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 41).addBox(13.0F, -3.0F, 10.0F, 9.0F, 3.0F, 13.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 46).addBox(15.0F, -4.0F, 0.0F, 7.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 22.0F, 2.0F, 18.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0F, 0.0F, -14.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition Sclerodus = fossil.addOrReplaceChild("Sclerodus", CubeListBuilder.create(), PartPose.offset(3.0F, 1.3F, -4.0F));

		PartDefinition Head = Sclerodus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -1.1F, -8.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -3.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.022F, -0.0299F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1F, -7.95F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 21).addBox(-0.0839F, -1.0F, 0.0328F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -2.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftside = Head.addOrReplaceChild("Leftside", CubeListBuilder.create().texOffs(36, 21).addBox(-0.5401F, 0.2F, -0.6224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offset(0.0F, -1.1F, -7.95F));

		PartDefinition cube_r8 = Leftside.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 26).addBox(-1.0401F, 0.0F, -0.0224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2F, 0.2F, -0.5F, 0.0F, -0.0742F, 0.0F));

		PartDefinition cube_r9 = Leftside.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 15).addBox(2.0227F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 55).addBox(0.8227F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(15, 27).addBox(-0.2773F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 46).addBox(0.0227F, 0.0F, 0.0061F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.3F, 0.2F, 12.7F, 0.0F, -2.0988F, 0.0F));

		PartDefinition cube_r10 = Leftside.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 56).addBox(0.1376F, 0.5F, -0.449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 64).addBox(1.3376F, 0.5F, -0.449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(46, 49).addBox(-0.0624F, 0.0F, -0.049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.4F, 0.2F, 10.0F, 0.0F, -1.9766F, 0.0F));

		PartDefinition cube_r11 = Leftside.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 52).addBox(-0.2558F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(4, 57).addBox(0.8442F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(36, 57).addBox(1.9442F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(46, 46).addBox(-0.0558F, 0.0F, -0.0719F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 0.2F, 7.0F, 0.0F, -1.645F, 0.0F));

		PartDefinition cube_r12 = Leftside.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 46).addBox(-0.4475F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 62).addBox(0.6525F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(5, 64).addBox(1.7525F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(28, 46).addBox(-0.0475F, 0.0F, -0.0547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.8F, 0.2F, 4.1F, 0.0F, -1.2959F, 0.0F));

		PartDefinition cube_r13 = Leftside.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 14).addBox(-0.0575F, 0.0F, -0.9667F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.0F, 0.2F, 4.9F, 0.0F, -0.8072F, 0.0F));

		PartDefinition cube_r14 = Leftside.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 5).addBox(-2.8605F, 0.5F, -0.563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.5F, 0.2F, 1.3F, 0.0F, -0.528F, 0.0F));

		PartDefinition cube_r15 = Leftside.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 27).addBox(-1.7605F, 0.5F, -0.563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.5F, 0.2F, 1.3F, 0.0F, -0.5629F, 0.0F));

		PartDefinition cube_r16 = Leftside.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 16).addBox(-0.6605F, 0.5F, -0.463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.5F, 0.2F, 1.3F, 0.0F, -0.7723F, 0.0F));

		PartDefinition cube_r17 = Leftside.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 49).addBox(0.4395F, 0.5F, -0.663F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(5, 62).addBox(1.5395F, 0.5F, -0.663F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(15, 21).addBox(0.0395F, 0.0F, 0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(45, 28).addBox(2.0395F, 0.0F, 0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(9, 39).addBox(0.0395F, 0.0F, -0.063F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(42, 21).addBox(0.0395F, 0.0F, 1.937F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.5F, 0.2F, 1.3F, 0.0F, -1.1388F, 0.0F));

		PartDefinition cube_r18 = Leftside.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 7).addBox(-0.2494F, 0.0F, -0.2694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2F, 0.2F, 5.7F, 0.0F, -0.685F, 0.0F));

		PartDefinition cube_r19 = Leftside.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 27).addBox(-0.4F, 0.2F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -0.3F, 0.0F, -0.6501F, 0.0F));

		PartDefinition cube_r20 = Leftside.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 46).addBox(-0.0719F, 0.3203F, -0.3239F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(0, 37).addBox(-0.0719F, 0.0203F, -0.3239F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(10, 34).addBox(-0.0719F, 0.0203F, -3.0239F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.739F, 3.2695F, 0.2325F, 0.0066F, 0.1164F));

		PartDefinition Rightside = Head.addOrReplaceChild("Rightside", CubeListBuilder.create().texOffs(8, 0).addBox(-0.4599F, 0.2F, -0.6224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offset(0.0F, -1.1F, -7.95F));

		PartDefinition cube_r21 = Rightside.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 7).addBox(0.0401F, 0.0F, -0.0224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.5F, 0.0F, 0.0742F, 0.0F));

		PartDefinition cube_r22 = Rightside.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(29, 64).addBox(-3.0227F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(24, 62).addBox(-1.8227F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(29, 62).addBox(-0.7227F, 0.5F, -0.3939F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(28, 55).addBox(-3.0227F, 0.0F, 0.0061F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-4.3F, 0.2F, 12.7F, 0.0F, 2.0988F, 0.0F));

		PartDefinition cube_r23 = Rightside.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 62).addBox(-1.1376F, 0.5F, -0.449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(63, 0).addBox(-2.3376F, 0.5F, -0.449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 50).addBox(-2.9376F, 0.0F, -0.049F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-5.4F, 0.2F, 10.0F, 0.0F, 1.9766F, 0.0F));

		PartDefinition cube_r24 = Rightside.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 52).addBox(-0.7442F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(8, 55).addBox(-2.9442F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(24, 64).addBox(-1.8442F, 0.5F, -0.4719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(28, 49).addBox(-2.9442F, 0.0F, -0.0719F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 0.2F, 7.0F, 0.0F, 1.645F, 0.0F));

		PartDefinition cube_r25 = Rightside.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 2).addBox(-0.5525F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(63, 4).addBox(-1.6525F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(8, 52).addBox(-2.7525F, 0.5F, -0.5547F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(37, 49).addBox(-2.9525F, 0.0F, -0.0547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-4.8F, 0.2F, 4.1F, 0.0F, 1.2959F, 0.0F));

		PartDefinition cube_r26 = Rightside.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 31).addBox(-3.9425F, 0.0F, -0.9667F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.0F, 0.2F, 4.9F, 0.0F, 0.8072F, 0.0F));

		PartDefinition cube_r27 = Rightside.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 3).addBox(1.8605F, 0.5F, -0.563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-3.5F, 0.2F, 1.3F, 0.0F, 0.528F, 0.0F));

		PartDefinition cube_r28 = Rightside.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 10).addBox(0.7605F, 0.5F, -0.563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-3.5F, 0.2F, 1.3F, 0.0F, 0.5629F, 0.0F));

		PartDefinition cube_r29 = Rightside.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 52).addBox(-0.3395F, 0.5F, -0.463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-3.5F, 0.2F, 1.3F, 0.0F, 0.7723F, 0.0F));

		PartDefinition cube_r30 = Rightside.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 6).addBox(-1.4395F, 0.5F, -0.663F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(63, 13).addBox(-2.5395F, 0.5F, -0.663F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 52).addBox(-1.0395F, 0.0F, 0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(47, 31).addBox(-3.0395F, 0.0F, 0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(28, 52).addBox(-3.0395F, 0.0F, -0.063F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 53).addBox(-3.0395F, 0.0F, 1.937F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-3.5F, 0.2F, 1.3F, 0.0F, 1.1388F, 0.0F));

		PartDefinition cube_r31 = Rightside.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(45, 34).addBox(-0.7506F, 0.0F, -0.2694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2F, 0.2F, 5.7F, 0.0F, 0.685F, 0.0F));

		PartDefinition cube_r32 = Rightside.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 32).addBox(-2.6F, 0.2F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, -0.3F, 0.0F, 0.6501F, 0.0F));

		PartDefinition cube_r33 = Rightside.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 24).addBox(-1.9281F, 0.3203F, -0.3239F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(36, 34).addBox(-1.9281F, 0.0203F, -0.3239F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(10, 29).addBox(-1.9281F, 0.0203F, -3.0239F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.739F, 3.2695F, 0.2325F, -0.0066F, -0.1164F));

		return LayerDefinition.create(meshdefinition, 96, 78);
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