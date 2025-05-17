package fossils.fossils.client.blockentity.model.atopodentatus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AtopodentatusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart tail;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart rightArm2;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart FrontFlipperR2;
	private final ModelPart leftArm;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart rightArm;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AtopodentatusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.tail = this.hip.getChild("tail");
		this.tail5 = this.tail.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail7 = this.tail4.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.FrontFlipperR3 = this.hip.getChild("FrontFlipperR3");
		this.leftArm2 = this.FrontFlipperR3.getChild("leftArm2");
		this.FrontFlipperMiddleR3 = this.leftArm2.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperR5 = this.hip.getChild("FrontFlipperR5");
		this.rightArm2 = this.FrontFlipperR5.getChild("rightArm2");
		this.FrontFlipperMiddleR5 = this.rightArm2.getChild("FrontFlipperMiddleR5");
		this.body2 = this.hip.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body = this.body5.getChild("body");
		this.FrontFlipperR2 = this.body.getChild("FrontFlipperR2");
		this.leftArm = this.FrontFlipperR2.getChild("leftArm");
		this.FrontFlipperMiddleR2 = this.leftArm.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperR4 = this.body.getChild("FrontFlipperR4");
		this.rightArm = this.FrontFlipperR4.getChild("rightArm");
		this.FrontFlipperMiddleR4 = this.rightArm.getChild("FrontFlipperMiddleR4");
		this.neck2 = this.body.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.8F, -11.0F, -24.8F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.9F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.8F, -11.0F, -24.8F, -0.5672F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -11.0F, 16.1F, 0.48F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, 2.4F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -11.0F, 16.1F, 0.0F, -0.48F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(7.9758F, -8.5169F, -2.0737F, -0.0659F, -0.3891F, 0.023F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 45).mirror().addBox(-0.5F, 0.2F, 1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.95F, 15.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 25.1F, -0.1338F, -0.2943F, -0.1526F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-0.5F, 0.2F, 10.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(54, 33).mirror().addBox(-0.5F, 0.2F, 2.6F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 7.8F, 0.0745F, -0.3484F, -0.0223F));

		PartDefinition cube_r7 = tail5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.5F, 0.2F, 17.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(36, 64).mirror().addBox(-0.5F, 0.2F, 10.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -10.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3171F, 7.0095F, 0.0438F, -0.3927F, 0.0035F));

		PartDefinition cube_r8 = tail2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, 0.1F, 1.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1041F, -1.0958F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1041F, 7.8042F, 0.1323F, -0.5284F, 0.0303F));

		PartDefinition cube_r9 = tail6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-0.5F, 0.1F, 8.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -8.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.1F, -0.0873F, -0.7368F, 0.0948F));

		PartDefinition cube_r10 = tail3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 62).mirror().addBox(-0.2F, 0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.147F, 6.9482F, -0.0798F, -0.6099F, 0.0362F));

		PartDefinition tail7 = tail4.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-0.2F, 0.4F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.014F, 6.9679F, -0.0957F, 0.349F, 0.0062F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-0.2F, 0.4F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.039F, 6.923F, 0.051F, 0.7657F, 0.1958F));

		PartDefinition FrontFlipperR3 = hip.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0053F, -0.3439F, 19.8663F, -0.8489F, -0.2301F, -0.2629F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1593F, -0.1811F, -0.6566F, -3.0718F, 0.6647F, -0.6627F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5168F, -0.1024F, -4.6567F, 0.2864F, 0.2292F, -1.1217F));

		PartDefinition FrontFlipperR5 = hip.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0052F, -0.3439F, 19.8663F, -0.3389F, -0.427F, 0.4648F));

		PartDefinition rightArm2 = FrontFlipperR5.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1593F, -0.1811F, -0.6566F, 2.9424F, -0.3965F, -0.0408F));

		PartDefinition FrontFlipperMiddleR5 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5168F, -0.1024F, -4.6567F, 0.1216F, -0.2412F, 0.2825F));

		PartDefinition body2 = hip.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 15.95F, -0.1058F, 0.2613F, 0.0162F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 20).mirror().addBox(-0.5F, 0.3362F, 19.4905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(-0.5F, 0.3362F, 7.7905F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4992F, -19.7618F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4992F, -11.7618F, 0.0894F, 0.172F, 0.0295F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.5F, 0.3362F, 0.0905F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0875F, -8.1335F, -0.0515F, 0.174F, 0.0142F));

		PartDefinition cube_r13 = body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 42).mirror().addBox(-0.5F, 0.2F, 9.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(31, 33).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9598F, -9.8475F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9598F, -9.8475F, 0.0008F, 0.1297F, 0.0175F));

		PartDefinition cube_r14 = body5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.5F, 0.2F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7987F, -4.8985F, 0.0445F, 0.1297F, 0.0175F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.5F, 0.45F, 10.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.5F, 0.45F, 4.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0581F, -11.0213F, 0.0262F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = body.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2384F, 4.2564F, -3.2675F, 1.3856F, 0.8719F, 0.0943F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.7593F, -0.1811F, -2.1566F, -0.1123F, -0.7658F, 0.2785F));

		PartDefinition FrontFlipperMiddleR2 = leftArm.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3817F, -0.1028F, -4.8042F, -0.768F, -0.286F, 1.2299F));

		PartDefinition FrontFlipperR4 = body.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2384F, 4.2564F, -3.2675F, 1.4334F, -0.7288F, -0.3393F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7593F, -0.1811F, -2.1566F, -0.6725F, 0.8785F, -0.5654F));

		PartDefinition FrontFlipperMiddleR4 = rightArm.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3817F, -0.1028F, -4.8042F, 0.7734F, 0.1536F, 1.4153F));

		PartDefinition neck2 = body.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2581F, -6.0213F, -0.2074F, 0.1665F, 0.1373F));

		PartDefinition cube_r16 = neck2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-0.5F, 0.45F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -5.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.9F, -0.2172F, 0.2184F, 0.0412F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(-0.5F, 0.2F, 4.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2515F, -8.7842F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.241F, -3.8847F, -0.3047F, 0.3322F, 0.1615F));

		PartDefinition cube_r18 = neck4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(-0.5F, 0.2873F, -5.5992F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.0175F, 0.0262F, -0.0005F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3949F, -4.9001F, -0.0175F, 0.1026F, 0.2495F));

		PartDefinition cube_r19 = neck3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.5F, -0.7618F, -0.0614F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.0786F, 0.0174F, -0.0014F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.402F, 0.1349F, 0.0131F));

		PartDefinition cube_r20 = neck5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -4.4F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.8248F, -1.6431F, -1.8074F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.8248F, -1.6431F, -1.8074F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1148F, -0.2772F, 0.5149F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 116, 116);
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