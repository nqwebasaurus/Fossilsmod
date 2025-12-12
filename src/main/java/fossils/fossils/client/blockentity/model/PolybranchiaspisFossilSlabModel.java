package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PolybranchiaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Polybranchiaspis;
	private final ModelPart body;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart main;
	private final ModelPart Rightside;
	private final ModelPart Leftside;
	private final ModelPart Polybranchiaspis2;
	private final ModelPart main2;
	private final ModelPart Rightside2;
	private final ModelPart Leftside2;

	public PolybranchiaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Polybranchiaspis = this.fossil.getChild("Polybranchiaspis");
		this.body = this.Polybranchiaspis.getChild("body");
		this.tail2 = this.body.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.main = this.Polybranchiaspis.getChild("main");
		this.Rightside = this.main.getChild("Rightside");
		this.Leftside = this.main.getChild("Leftside");
		this.Polybranchiaspis2 = this.fossil.getChild("Polybranchiaspis2");
		this.main2 = this.Polybranchiaspis2.getChild("main2");
		this.Rightside2 = this.main2.getChild("Rightside2");
		this.Leftside2 = this.main2.getChild("Leftside2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -0.5F, -12.6F, 21.0F, 1.0F, 23.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.153F, -0.5F, -1.2456F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.1679F, -0.5F, -0.0568F, 28.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.9945F, -0.5F, -1.1872F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 41).addBox(-6.0F, -0.5F, -9.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(10.2947F, -0.5F, 1.7051F, 0.0F, 0.2182F, 0.0F));

		PartDefinition Polybranchiaspis = fossil.addOrReplaceChild("Polybranchiaspis", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9F, 0.8F, 3.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition body = Polybranchiaspis.addOrReplaceChild("body", CubeListBuilder.create().texOffs(43, 53).addBox(-3.0F, -2.0F, 0.25F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 19).addBox(-3.0F, -1.0F, -0.65F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offset(0.0F, -1.1F, 1.7F));

		PartDefinition tail2 = body.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(62, 41).addBox(-2.0F, -1.75F, -0.3F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 4).addBox(0.0F, -2.75F, 0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 3.05F, 0.0F, -0.2618F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 65).addBox(-1.5F, -2.25F, -0.4F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(3, 2).addBox(0.0F, -3.05F, 0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 3.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(66, 5).addBox(-1.0F, -2.0F, -0.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 0).addBox(0.0F, -2.8F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 3.7F, 0.0F, -0.5236F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, 3.4F, 0.0F, -0.6545F, 0.0F));

		PartDefinition main = Polybranchiaspis.addOrReplaceChild("main", CubeListBuilder.create().texOffs(55, 55).addBox(-2.0F, -2.0F, -3.25F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offset(-0.2F, -0.1F, -5.2F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, 1.0155F, -0.8897F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 10).addBox(-2.5F, 0.0155F, 0.1103F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -3.1F, 0.75F, 0.072F, 0.0F, 0.0054F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 65).addBox(-2.5F, 0.4F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -3.5F, 0.75F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Rightside = main.addOrReplaceChild("Rightside", CubeListBuilder.create().texOffs(0, 50).addBox(0.7692F, -1.5F, -6.5325F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offset(-5.7692F, -0.5F, 5.7825F));

		PartDefinition cube_r6 = Rightside.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 12).addBox(-3.0287F, -0.5F, -0.1731F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 2.2646F, 0.0F));

		PartDefinition cube_r7 = Rightside.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 16).addBox(-2.075F, -0.5F, -0.675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.0F, -2.0F, 0.0F, 1.7235F, 0.0F));

		PartDefinition cube_r8 = Rightside.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 59).addBox(-3.89F, 0.0F, -0.1012F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.6629F, -1.5F, -6.4571F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r9 = Rightside.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.7692F, -1.5F, -9.0325F, 0.0F, 0.6501F, 0.0F));

		PartDefinition cube_r10 = Rightside.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 10).addBox(0.3482F, 0.2156F, -0.2715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4692F, -1.739F, -6.963F, 0.2813F, 0.0414F, -0.3203F));

		PartDefinition cube_r11 = Rightside.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7185F, -0.1455F, -0.1916F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7692F, -1.939F, -6.263F, 0.059F, 0.0345F, -0.1982F));

		PartDefinition Leftside = main.addOrReplaceChild("Leftside", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-3.7692F, -1.5F, -6.5325F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offset(5.7692F, -0.5F, 5.7825F));

		PartDefinition cube_r12 = Leftside.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(0.0287F, -0.5F, -0.1731F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -2.2646F, 0.0F));

		PartDefinition cube_r13 = Leftside.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 16).mirror().addBox(-0.925F, -0.5F, -0.675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0F, -2.0F, 0.0F, -1.7235F, 0.0F));

		PartDefinition cube_r14 = Leftside.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.11F, 0.0F, -0.1012F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6629F, -1.5F, -6.4571F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r15 = Leftside.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.7692F, -1.5F, -9.0325F, 0.0F, -0.6501F, 0.0F));

		PartDefinition cube_r16 = Leftside.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-1.3482F, 0.2156F, -0.2715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4692F, -1.739F, -6.963F, 0.2813F, -0.0414F, 0.3203F));

		PartDefinition cube_r17 = Leftside.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2815F, -0.1455F, -0.1916F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7692F, -1.939F, -6.263F, 0.059F, -0.0345F, 0.1982F));

		PartDefinition Polybranchiaspis2 = fossil.addOrReplaceChild("Polybranchiaspis2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -5.7F, -3.1416F, 0.0F, 0.0F));

		PartDefinition main2 = Polybranchiaspis2.addOrReplaceChild("main2", CubeListBuilder.create().texOffs(43, 41).addBox(-2.0F, -2.0F, -3.25F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offset(5.7F, 0.7F, -7.8F));

		PartDefinition Rightside2 = main2.addOrReplaceChild("Rightside2", CubeListBuilder.create().texOffs(0, 41).addBox(0.7692F, -1.5F, -6.5325F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offset(-5.7692F, -0.5F, 5.7825F));

		PartDefinition cube_r18 = Rightside2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 59).addBox(-3.0287F, -0.5F, -0.1731F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 2.2646F, 0.0F));

		PartDefinition cube_r19 = Rightside2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 59).addBox(-2.075F, -0.5F, -0.675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.0F, -2.0F, 0.0F, 1.7235F, 0.0F));

		PartDefinition cube_r20 = Rightside2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 35).addBox(-3.89F, 0.0F, -0.1012F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.6629F, -1.5F, -6.4571F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r21 = Rightside2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(32, 65).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.7692F, -1.5F, -9.0325F, 0.0F, 0.6501F, 0.0F));

		PartDefinition Leftside2 = main2.addOrReplaceChild("Leftside2", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-3.7692F, -1.5F, -6.5325F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offset(5.7692F, -0.5F, 5.7825F));

		PartDefinition cube_r22 = Leftside2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 59).mirror().addBox(0.0287F, -0.5F, -0.1731F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -2.2646F, 0.0F));

		PartDefinition cube_r23 = Leftside2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-0.925F, -0.5F, -0.675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0F, -2.0F, 0.0F, -1.7235F, 0.0F));

		PartDefinition cube_r24 = Leftside2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.11F, 0.0F, -0.1012F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6629F, -1.5F, -6.4571F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r25 = Leftside2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.7692F, -1.5F, -9.0325F, 0.0F, -0.6501F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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