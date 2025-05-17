package fossils.fossils.client.blockentity.model.atopodentatus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AtopodentatusFossilModel extends SkullModelBase {
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

	public AtopodentatusFossilModel(ModelPart root) {
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

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(7.9758F, -8.5169F, -2.0737F, -0.0659F, -0.3891F, 0.023F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 58).addBox(0.5F, 0.0F, 2.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.002F))
				.texOffs(0, 58).mirror().addBox(-2.5F, 0.0F, 2.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(25, 45).mirror().addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.95F, 15.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(105, 81).addBox(1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(105, 81).mirror().addBox(-2.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.6076F, 20.5295F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(100, 100).addBox(1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(100, 100).mirror().addBox(-2.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.4771F, 21.521F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 76).addBox(1.5F, -0.4F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 76).mirror().addBox(-2.5F, -0.4F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.676F, 18.1754F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 101).addBox(1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(6, 101).mirror().addBox(-2.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4702F, 20.9764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 0).addBox(1.5F, -0.9F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(77, 0).mirror().addBox(-2.5F, -0.9F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7867F, 17.8604F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 30).addBox(-1.0F, 1.0629F, -3.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(99, 53).addBox(-1.0F, 2.6629F, -4.2118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 1.7017F, 0.0F, 0.48F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 78).addBox(-1.0F, 0.1849F, 2.584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -0.4363F, 0.0F, 0.48F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 92).addBox(-1.0F, 2.1815F, -0.2965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 0.2618F, 0.0F, 0.48F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 101).addBox(-1.0F, -0.5296F, 2.6536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -1.1781F, 0.0F, 0.48F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 102).addBox(-1.0F, 0.222F, -3.8161F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(106, 21).addBox(-1.0F, 2.1822F, -3.8285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 1.5708F, 0.0F, 0.48F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(102, 8).addBox(-1.0F, 1.2259F, -2.6841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 0.3927F, 0.0F, 0.48F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 69).addBox(-1.0F, 1.8107F, -2.7577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 0.1309F, 0.0F, 0.48F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(99, 65).addBox(-1.0F, 2.6191F, -1.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -0.3054F, 0.0F, 0.48F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(109, 49).addBox(-1.0F, 3.9846F, -0.7598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 102).addBox(-1.0F, 2.6846F, -0.7598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -0.7418F, 0.0F, 0.48F));

		PartDefinition cube_r16 = hip.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 92).addBox(-1.0F, 1.8599F, -1.1428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -0.6109F, 0.0F, 0.48F));

		PartDefinition cube_r17 = hip.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 65).addBox(-1.0F, 0.3448F, -1.7784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F))
				.texOffs(55, 76).addBox(-1.0F, -0.3552F, -1.7784F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, -0.2618F, 0.0F, 0.48F));

		PartDefinition cube_r18 = hip.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 82).addBox(-1.0F, 0.9034F, -0.5443F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.0371F, 19.0777F, 0.6109F, 0.0F, 0.48F));

		PartDefinition cube_r19 = hip.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(0.0F, 0.9034F, -0.5443F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 0.6109F, 0.0F, -0.48F));

		PartDefinition cube_r20 = hip.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(0.0F, 1.0629F, -3.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(99, 53).mirror().addBox(0.0F, 2.6629F, -4.2118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 1.7017F, 0.0F, -0.48F));

		PartDefinition cube_r21 = hip.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(0.0F, 2.1822F, -3.8285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(31, 102).mirror().addBox(0.0F, 0.222F, -3.8161F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 1.5708F, 0.0F, -0.48F));

		PartDefinition cube_r22 = hip.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 101).mirror().addBox(0.0F, -0.5296F, 2.6536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -1.1781F, 0.0F, -0.48F));

		PartDefinition cube_r23 = hip.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 78).mirror().addBox(0.0F, 0.1849F, 2.584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -0.4363F, 0.0F, -0.48F));

		PartDefinition cube_r24 = hip.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(0.0F, 2.1815F, -0.2965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 0.2618F, 0.0F, -0.48F));

		PartDefinition cube_r25 = hip.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(102, 8).mirror().addBox(0.0F, 1.2259F, -2.6841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 0.3927F, 0.0F, -0.48F));

		PartDefinition cube_r26 = hip.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(99, 69).mirror().addBox(0.0F, 1.8107F, -2.7577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, 0.1309F, 0.0F, -0.48F));

		PartDefinition cube_r27 = hip.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(0.0F, 2.6191F, -1.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -0.3054F, 0.0F, -0.48F));

		PartDefinition cube_r28 = hip.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(109, 49).mirror().addBox(0.0F, 3.9846F, -0.7598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 102).mirror().addBox(0.0F, 2.6846F, -0.7598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -0.7418F, 0.0F, -0.48F));

		PartDefinition cube_r29 = hip.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 92).mirror().addBox(0.0F, 1.8599F, -1.1428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -0.6109F, 0.0F, -0.48F));

		PartDefinition cube_r30 = hip.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(0.0F, 0.3448F, -1.7784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(55, 76).mirror().addBox(0.0F, -0.3552F, -1.7784F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.0371F, 19.0777F, -0.2618F, 0.0F, -0.48F));

		PartDefinition cube_r31 = hip.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(0.0F, -5.8092F, -0.1058F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7863F, 21.1278F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hip.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(0.0F, -5.807F, -0.0982F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9863F, 19.1278F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hip.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(0.0F, -5.4283F, 0.0151F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7863F, 23.0278F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hip.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(0.0F, -5.8911F, -0.1747F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2863F, 17.2278F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 25.1F, -0.1338F, -0.2943F, -0.1526F));

		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(42, 56).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.043F, -0.1041F, -0.0524F, -0.0523F, 0.0027F));

		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 56).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.043F, -0.1041F, -0.0524F, 0.0523F, -0.0027F));

		PartDefinition cube_r37 = tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(0.0F, -0.3487F, -0.1038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5746F, 5.7881F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(0.0F, 0.0431F, 0.0878F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5746F, 3.5881F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(0.0F, -0.3778F, -0.8785F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5746F, 0.4881F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(41, 105).mirror().addBox(0.0F, 0.1564F, -0.6171F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5746F, 2.2881F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(0.0F, -4.6237F, -0.1252F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2425F, 6.1309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(95, 93).mirror().addBox(0.0F, -4.7521F, -0.023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3425F, 4.0309F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(0.0F, -5.3146F, -0.1062F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3863F, 0.0278F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(0.0F, -4.7201F, -0.0695F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4863F, 2.0278F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 7.8F, 0.0745F, -0.3484F, -0.0223F));

		PartDefinition cube_r46 = tail5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(58, 0).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0243F, 0.0849F, -0.0525F, -0.0697F, 0.0037F));

		PartDefinition cube_r47 = tail5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0243F, 0.0849F, -0.0525F, 0.0697F, -0.0037F));

		PartDefinition cube_r48 = tail5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -10.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 36).mirror().addBox(0.0F, 0.9564F, 11.3829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1746F, -5.5119F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(112, 8).mirror().addBox(0.0F, 0.0848F, -0.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1746F, 4.4881F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(112, 4).mirror().addBox(0.0F, 0.294F, -0.1882F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1746F, 2.0881F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 110).mirror().addBox(0.0F, 0.377F, -0.0962F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1746F, -0.0119F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(98, 93).mirror().addBox(0.0F, -4.3913F, 0.0697F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4425F, 2.0309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(0.0F, -4.4511F, -0.2199F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2425F, 4.3309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(74, 96).mirror().addBox(0.0F, -4.341F, -0.0226F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1425F, 6.1309F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(0.0F, -4.6136F, 0.0721F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5425F, 0.0309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3171F, 7.0095F, 0.0438F, -0.3927F, 0.0035F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 106).mirror().addBox(0.0F, -3.1523F, -0.0199F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2384F, 6.8351F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 100).mirror().addBox(0.0F, -3.1686F, -0.1113F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4384F, 4.9351F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(0.0F, -3.5966F, -0.0213F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3384F, 2.8351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 99).mirror().addBox(0.0F, -4.0189F, -0.0189F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4384F, 0.8351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 113).mirror().addBox(0.0F, 2.3564F, 19.3829F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 110).mirror().addBox(0.0F, 1.4564F, 17.3829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 110).mirror().addBox(0.0F, 1.3564F, 15.3829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 112).mirror().addBox(0.0F, 1.0564F, 13.3829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1212F, -12.7078F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.6F, 1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1041F, -1.0958F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(18, 113).mirror().addBox(0.0F, 0.2628F, 5.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 113).mirror().addBox(0.0F, 0.3628F, 7.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1041F, 7.8042F, 0.1323F, -0.5284F, 0.0303F));

		PartDefinition cube_r63 = tail6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(-0.5F, -0.6F, 9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -8.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 113).mirror().addBox(0.0F, 2.6564F, 23.3829F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 113).mirror().addBox(0.0F, 2.5564F, 21.3829F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2254F, -20.5119F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 110).mirror().addBox(0.0F, -1.9761F, -0.0554F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3425F, 7.1309F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(27, 106).mirror().addBox(0.0F, -1.9984F, -0.053F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4425F, 5.1309F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(24, 106).mirror().addBox(0.0F, -2.3203F, -0.0628F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3425F, 3.1309F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 106).mirror().addBox(0.0F, -2.7363F, -0.1664F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3425F, 1.2309F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(0.0F, 0.3628F, -0.0437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 102).mirror().addBox(0.0F, 0.3628F, 1.9563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 102).mirror().addBox(0.0F, 0.2628F, 3.9563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 30).mirror().addBox(0.0F, 0.2628F, 5.9563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 9.1F, -0.0873F, -0.7368F, 0.0948F));

		PartDefinition cube_r69 = tail3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-0.5F, -0.6F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 110).mirror().addBox(0.0F, -1.3301F, 0.2869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1022F, 5.6889F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 110).mirror().addBox(0.0F, -1.4092F, 0.2375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0425F, 3.7309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 112).mirror().addBox(0.0F, -1.338F, 0.3519F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3425F, 1.6309F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(82, 110).mirror().addBox(0.0F, -1.6599F, 0.3421F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2425F, -0.3691F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 62).mirror().addBox(-0.2F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(112, 46).mirror().addBox(0.3F, 0.1157F, 1.0081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 84).mirror().addBox(0.3F, 0.1157F, 3.0081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 103).mirror().addBox(0.3F, 0.2157F, 5.0081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.147F, 6.9482F, -0.0798F, -0.6099F, 0.0362F));

		PartDefinition cube_r74 = tail4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(27, 113).mirror().addBox(-0.2F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 26).mirror().addBox(-0.2F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 113).mirror().addBox(-0.2F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7 = tail4.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-0.2F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(112, 109).mirror().addBox(0.3F, 0.1297F, 2.0401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 112).mirror().addBox(0.3F, 0.1297F, 4.0401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 113).mirror().addBox(0.3F, 0.0297F, 6.0401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 113).mirror().addBox(0.3F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 113).mirror().addBox(0.3F, -0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 113).mirror().addBox(0.3F, -0.6F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 40).mirror().addBox(0.3F, -0.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.014F, 6.9679F, -0.0957F, 0.349F, 0.0062F));

		PartDefinition cube_r75 = tail7.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(112, 106).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.7297F, 0.5401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-0.2F, -0.3F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.039F, 6.923F, 0.051F, 0.7657F, 0.1958F));

		PartDefinition FrontFlipperR3 = hip.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0053F, -0.3439F, 19.8663F, -0.8489F, -0.2301F, -0.2629F));

		PartDefinition cube_r76 = FrontFlipperR3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-2.0F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8208F, -0.1811F, -1.594F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r77 = FrontFlipperR3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(9, 87).mirror().addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3593F, -0.1811F, -1.2566F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r78 = FrontFlipperR3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(95, 4).mirror().addBox(-1.0F, -1.5F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1055F, 0.3189F, 0.1033F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r79 = FrontFlipperR3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(74, 88).mirror().addBox(-12.4777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9266F, -3.2839F, -17.5565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r80 = FrontFlipperR3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-1.9F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3435F, -0.1811F, 0.0929F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r81 = FrontFlipperR3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4102F, -0.1811F, -0.3331F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r82 = FrontFlipperR3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-0.225F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.2476F, -0.1811F, -2.105F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r83 = FrontFlipperR3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(87, 97).mirror().addBox(-1.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9337F, -0.1811F, -0.0585F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r84 = FrontFlipperR3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(47, 93).mirror().addBox(0.5F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9337F, 0.3189F, -0.0585F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1593F, -0.1811F, -0.6566F, -3.0718F, 0.6647F, -0.6627F));

		PartDefinition cube_r85 = leftArm2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.075F, -0.5F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8022F, 0.0F, -3.6037F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r86 = leftArm2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-3.2F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.663F, 0.0F, -3.6282F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r87 = leftArm2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9864F, 0.0F, -2.8943F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(26, 96).mirror().addBox(-0.9F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2287F, 0.0F, -1.4193F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.95F, -1.0F, -1.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(-1.6F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(109, 67).mirror().addBox(-0.5884F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 70).mirror().addBox(-0.7884F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 37).mirror().addBox(-1.5884F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 102).mirror().addBox(-1.0884F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5168F, -0.1024F, -4.6567F, 0.2864F, 0.2292F, -1.1217F));

		PartDefinition cube_r91 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(9, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8883F, 0.1028F, -0.7294F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r92 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.9F, 0.0F, -3.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3883F, 0.1028F, -0.0294F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR5 = hip.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0052F, -0.3439F, 19.8663F, -0.3389F, -0.427F, 0.4648F));

		PartDefinition cube_r93 = FrontFlipperR5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(33, 99).mirror().addBox(0.0F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.8209F, -0.1811F, -1.594F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r94 = FrontFlipperR5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(87, 49).mirror().addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.3593F, -0.1811F, -1.2566F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r95 = FrontFlipperR5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(95, 8).mirror().addBox(-1.0F, -1.5F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1055F, 0.3189F, 0.1033F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r96 = FrontFlipperR5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(10.4777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.9266F, -3.2839F, -17.5565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r97 = FrontFlipperR5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(9, 80).mirror().addBox(-0.1F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(6.3435F, -0.1811F, 0.0929F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r98 = FrontFlipperR5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.4102F, -0.1811F, -0.3331F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r99 = FrontFlipperR5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(26, 99).mirror().addBox(-1.775F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(6.2476F, -0.1811F, -2.105F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r100 = FrontFlipperR5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.9337F, -0.1811F, -0.0585F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r101 = FrontFlipperR5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(88, 93).mirror().addBox(-2.5F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9337F, 0.3189F, -0.0585F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightArm2 = FrontFlipperR5.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1593F, -0.1811F, -0.6566F, 2.9424F, -0.3965F, -0.0408F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 41).mirror().addBox(-1.925F, -0.5F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8023F, 0.0F, -3.6037F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r103 = rightArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(18, 82).mirror().addBox(0.2F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.663F, 0.0F, -3.6282F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r104 = rightArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9864F, 0.0F, -2.8943F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r105 = rightArm2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(-1.1F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.2287F, 0.0F, -1.4193F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r106 = rightArm2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-1.05F, -1.0F, -1.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r107 = rightArm2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(0.6F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition FrontFlipperMiddleR5 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create().texOffs(72, 109).mirror().addBox(-0.4117F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 73).mirror().addBox(-0.2116F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 85).mirror().addBox(0.5883F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 103).mirror().addBox(0.0883F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.5168F, -0.1024F, -4.6567F, 0.1216F, -0.2412F, 0.2825F));

		PartDefinition cube_r108 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 102).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8883F, 0.1028F, -0.7294F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r109 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-3.1F, 0.0F, -3.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3883F, 0.1028F, -0.0294F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = hip.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 15.95F, -0.1058F, 0.2613F, 0.0162F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-4.0F, -2.0475F, -6.9984F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6783F, -0.9574F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(36, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0287F, -0.4748F, -0.084F, -0.2272F, 0.6312F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(91, 47).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0287F, -0.4748F, -0.1848F, -0.1878F, 1.1113F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(31, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0287F, -2.4748F, -0.0574F, -0.2308F, 0.5205F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(47, 91).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0287F, -2.4748F, -0.1631F, -0.203F, 1.0024F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(112, 2).addBox(3.156F, -2.3721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0287F, -2.4748F, -0.2436F, -0.091F, 1.5379F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(26, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -4.4748F, -0.0397F, -0.2332F, 0.4291F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(91, 28).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -4.4748F, -0.1486F, -0.2131F, 0.9121F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(100, 47).addBox(3.156F, -2.3721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -4.4748F, -0.2365F, -0.107F, 1.45F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(111, 21).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -6.4748F, -0.0041F, -0.2376F, 0.3684F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(91, 26).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -6.4748F, -0.1193F, -0.2331F, 0.8533F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(91, 24).addBox(3.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -6.4748F, -0.2222F, -0.1389F, 1.3959F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(21, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -8.4748F, -0.0397F, -0.2332F, 0.3244F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(90, 84).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -8.4748F, -0.1486F, -0.2131F, 0.8074F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 76).addBox(3.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -8.4748F, -0.2365F, -0.107F, 1.3453F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(79, 23).addBox(3.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -10.4748F, -0.2365F, -0.107F, 1.2929F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(90, 74).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -10.4748F, -0.1486F, -0.2131F, 0.755F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(16, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2287F, -10.4748F, -0.0397F, -0.2332F, 0.272F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0287F, -0.4748F, -0.1848F, 0.1878F, -1.1113F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(36, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0287F, -0.4748F, -0.084F, 0.2272F, -0.6312F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(112, 2).mirror().addBox(-4.156F, -2.3721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0287F, -2.4748F, -0.2436F, 0.091F, -1.5379F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0287F, -2.4748F, -0.1631F, 0.203F, -1.0024F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0287F, -2.4748F, -0.0574F, 0.2308F, -0.5205F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(100, 47).mirror().addBox(-5.156F, -2.3721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -4.4748F, -0.2365F, 0.107F, -1.45F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -4.4748F, -0.1486F, 0.2131F, -0.9121F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(26, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -4.4748F, -0.0397F, 0.2332F, -0.4291F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-6.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -6.4748F, -0.2222F, 0.1389F, -1.3959F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -6.4748F, -0.1193F, 0.2331F, -0.8533F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(111, 21).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -6.4748F, -0.0041F, 0.2376F, -0.3684F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-6.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -8.4748F, -0.2365F, 0.107F, -1.3453F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -8.4748F, -0.1486F, 0.2131F, -0.8074F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(21, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -8.4748F, -0.0397F, 0.2332F, -0.3244F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(16, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -10.4748F, -0.0397F, 0.2332F, -0.272F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -10.4748F, -0.1486F, 0.2131F, -0.755F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-7.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2287F, -10.4748F, -0.2365F, 0.107F, -1.2929F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -0.3638F, 7.9905F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4992F, -19.7618F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 34).mirror().addBox(0.0F, -5.9499F, -0.0524F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3883F, -0.8072F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(56, 86).mirror().addBox(0.0F, -6.0457F, -0.5653F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3883F, -2.2072F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(27, 82).mirror().addBox(0.0F, -6.159F, -0.1858F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3883F, -4.6072F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(28, 34).mirror().addBox(0.0F, -6.0405F, -0.074F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5256F, -6.6886F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(0.0F, -6.0322F, -0.0832F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5256F, -8.6886F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 89).mirror().addBox(0.0F, -4.8F, -5.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2256F, -5.1886F, -0.096F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4992F, -11.7618F, 0.0894F, 0.172F, 0.0295F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 48).mirror().addBox(0.0F, -5.9806F, -0.0019F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -1.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(0.0F, -6.033F, -0.0026F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(0.0F, -5.9854F, -0.0006F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -5.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(0.0F, -5.8377F, -0.0013F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2705F, -0.7129F, -0.1283F, -0.2208F, 0.2745F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(90, 72).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2705F, -0.7129F, -0.2207F, -0.1622F, 0.7511F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(77, 6).addBox(3.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2705F, -0.7129F, -0.2718F, -0.0271F, 1.2778F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(6, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -2.7129F, -0.1283F, -0.2208F, 0.2396F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 70).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -2.7129F, -0.2207F, -0.1622F, 0.7162F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 14).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -2.7129F, -0.2718F, -0.0271F, 1.2429F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(110, 82).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -4.7129F, -0.1283F, -0.2208F, 0.2222F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(90, 68).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -4.7129F, -0.2207F, -0.1622F, 0.6987F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(75, 12).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -4.7129F, -0.2718F, -0.0271F, 1.2255F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 10).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -6.7129F, -0.2718F, -0.0271F, 1.1905F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 66).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -6.7129F, -0.2207F, -0.1622F, 0.6638F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(12, 90).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0705F, -6.7129F, -0.1283F, -0.2208F, 0.1873F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-7.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2705F, -0.7129F, -0.2718F, 0.0271F, -1.2778F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 72).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2705F, -0.7129F, -0.2207F, 0.1622F, -0.7511F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(11, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2705F, -0.7129F, -0.1283F, 0.2208F, -0.2745F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(75, 14).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -2.7129F, -0.2718F, 0.0271F, -1.2429F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(27, 10).mirror().addBox(-3.5F, -1.745F, -13.9543F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5775F, 3.6044F, 0.0262F, -0.0002F, -0.0003F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.5F, -2.0481F, -6.957F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5775F, 3.6044F, 0.0698F, -0.0002F, -0.0003F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -2.7129F, -0.2207F, 0.1622F, -0.7162F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(6, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -2.7129F, -0.1283F, 0.2208F, -0.2396F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -4.7129F, -0.2718F, 0.0271F, -1.2255F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(90, 68).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -4.7129F, -0.2207F, 0.1622F, -0.6987F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(110, 82).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -4.7129F, -0.1283F, 0.2208F, -0.2222F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(12, 90).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -6.7129F, -0.1283F, 0.2208F, -0.1873F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -6.7129F, -0.2207F, 0.1622F, -0.6638F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0705F, -6.7129F, -0.2718F, 0.0271F, -1.1905F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.5F, -0.3638F, -0.0095F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0875F, -8.1335F, -0.0515F, 0.174F, 0.0142F));

		PartDefinition cube_r183 = body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(0.0F, -5.7965F, -0.0895F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(3, 94).mirror().addBox(0.0F, -5.6438F, 0.0176F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0092F, -2.8842F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(71, 86).mirror().addBox(0.0F, -5.2951F, -0.0018F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1331F, -4.7858F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 97).mirror().addBox(0.0F, -4.9029F, -0.0014F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2331F, -6.7858F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(0.0F, -4.5108F, -0.001F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3331F, -8.7858F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(82, 31).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.6579F, -8.4795F, -0.0397F, -0.2332F, 0.1324F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(90, 64).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.6579F, -8.4795F, -0.1486F, -0.2131F, 0.6154F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 33).addBox(3.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.6579F, -8.4795F, -0.2365F, -0.107F, 1.1533F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 8).addBox(3.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5579F, -6.4795F, -0.2242F, -0.1471F, 1.1353F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(90, 22).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5579F, -6.4795F, -0.1167F, -0.2413F, 0.5918F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(31, 79).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5579F, -6.4795F, 0.0021F, -0.2436F, 0.1061F));

		PartDefinition cube_r194 = body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(58, 8).addBox(3.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2579F, -4.4795F, -0.2186F, -0.1468F, 1.0986F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(3, 90).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2579F, -4.4795F, -0.1119F, -0.2381F, 0.5549F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 77).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2579F, -4.4795F, 0.0049F, -0.2387F, 0.0696F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(52, 74).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -0.5795F, -0.2365F, -0.107F, 1.1533F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(88, 35).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -0.5795F, -0.1486F, -0.2131F, 0.6154F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(36, 62).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -0.5795F, -0.0397F, -0.2332F, 0.1324F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(54, 43).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -2.5795F, -0.2293F, -0.1229F, 1.135F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(26, 71).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -2.5795F, -0.1339F, -0.2231F, 0.5948F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(25, 43).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1579F, -2.5795F, -0.0219F, -0.2354F, 0.1108F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(-9.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6579F, -8.4795F, -0.2365F, 0.107F, -1.1533F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6579F, -8.4795F, -0.1486F, 0.2131F, -0.6154F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.6579F, -8.4795F, -0.0397F, 0.2332F, -0.1324F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 79).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5579F, -6.4795F, 0.0021F, 0.2436F, -0.1061F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5579F, -6.4795F, -0.1167F, 0.2413F, -0.5918F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-9.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5579F, -6.4795F, -0.2242F, 0.1471F, -1.1353F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2579F, -4.4795F, 0.0049F, 0.2387F, -0.0696F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(3, 90).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2579F, -4.4795F, -0.1119F, 0.2381F, -0.5549F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(58, 8).mirror().addBox(-9.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2579F, -4.4795F, -0.2186F, 0.1468F, -1.0986F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -0.5795F, -0.0397F, 0.2332F, -0.1324F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -0.5795F, -0.1486F, 0.2131F, -0.6154F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-2.5F, -0.7766F, -20.3044F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.665F, 11.7379F, -0.0436F, -0.0002F, -0.0003F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -0.5795F, -0.2365F, 0.107F, -1.1533F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 43).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -2.5795F, -0.0219F, 0.2354F, -0.1108F));

		PartDefinition cube_r217 = body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(26, 71).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -2.5795F, -0.1339F, 0.2231F, -0.5948F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1579F, -2.5795F, -0.2293F, 0.1229F, -1.135F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9598F, -9.8475F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9598F, -9.8475F, 0.0008F, 0.1297F, 0.0175F));

		PartDefinition cube_r220 = body5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(111, 90).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5981F, -4.732F, 0.1032F, -0.2492F, 0.168F));

		PartDefinition cube_r221 = body5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 91).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5981F, -4.732F, -0.0296F, -0.2921F, 0.6554F));

		PartDefinition cube_r222 = body5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(75, 16).addBox(3.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5981F, -4.732F, -0.1784F, -0.2344F, 1.2132F));

		PartDefinition cube_r223 = body5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(67, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2981F, -2.732F, 0.1032F, -0.2492F, 0.1506F));

		PartDefinition cube_r224 = body5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 80).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2981F, -2.732F, -0.0296F, -0.2921F, 0.638F));

		PartDefinition cube_r225 = body5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(37, 73).addBox(3.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2981F, -2.732F, -0.1784F, -0.2344F, 1.1957F));

		PartDefinition cube_r226 = body5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(73, 35).addBox(3.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0019F, -0.732F, -0.2005F, -0.1867F, 1.1829F));

		PartDefinition cube_r227 = body5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 78).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0019F, -0.732F, -0.0748F, -0.2629F, 0.6329F));

		PartDefinition cube_r228 = body5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(49, 111).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0019F, -0.732F, 0.0495F, -0.2438F, 0.1462F));

		PartDefinition cube_r229 = body5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-8.156F, -2.3721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5981F, -4.732F, -0.1784F, 0.2344F, -1.2132F));

		PartDefinition cube_r230 = body5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 91).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5981F, -4.732F, -0.0296F, 0.2921F, -0.6554F));

		PartDefinition cube_r231 = body5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(111, 90).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5981F, -4.732F, 0.1032F, 0.2492F, -0.168F));

		PartDefinition cube_r232 = body5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(-9.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2981F, -2.732F, -0.1784F, 0.2344F, -1.1957F));

		PartDefinition cube_r233 = body5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2981F, -2.732F, -0.0296F, 0.2921F, -0.638F));

		PartDefinition cube_r234 = body5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(67, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2981F, -2.732F, 0.1032F, 0.2492F, -0.1506F));

		PartDefinition cube_r235 = body5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(49, 111).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0019F, -0.732F, 0.0495F, 0.2438F, -0.1462F));

		PartDefinition cube_r236 = body5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(91, 78).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0019F, -0.732F, -0.0748F, 0.2629F, -0.6329F));

		PartDefinition cube_r237 = body5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-9.156F, -2.3721F, -0.3859F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0019F, -0.732F, -0.2005F, 0.1867F, -1.1829F));

		PartDefinition cube_r238 = body5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r239 = body5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(77, 96).mirror().addBox(0.0F, -4.1239F, 0.0189F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r240 = body5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(0.0F, -3.7049F, -0.0411F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r241 = body5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(0.0F, -2.9706F, -0.0191F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -5.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7987F, -4.8985F, 0.0445F, 0.1297F, 0.0175F));

		PartDefinition cube_r242 = body.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(0.0F, -2.8181F, 0.0089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3687F, -1.9596F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(105, 99).mirror().addBox(0.0F, -2.436F, -0.108F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3419F, -3.9213F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(0.0F, -2.6809F, 0.0017F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0581F, -6.0213F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(81, 72).addBox(-2.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9288F, 5.8701F, -9.0503F, -2.9631F, 0.3418F, 2.2937F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(112, 0).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0994F, -5.6335F, 0.1391F, -0.2525F, 0.386F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(12, 92).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0994F, -5.6335F, 0.0009F, -0.3112F, 0.8733F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 97).addBox(3.156F, -2.3721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0994F, -5.6335F, -0.1634F, -0.2661F, 1.4364F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(111, 94).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -3.6335F, 0.0495F, -0.2438F, 0.2684F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(3, 92).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -3.6335F, -0.0748F, -0.2629F, 0.7551F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(90, 91).addBox(3.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -3.6335F, -0.2005F, -0.1867F, 1.3051F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 47).addBox(3.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -1.6335F, -0.2222F, -0.1389F, 1.2737F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(91, 82).addBox(0.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -1.6335F, -0.1193F, -0.2331F, 0.7311F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(111, 92).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1006F, -1.6335F, -0.0041F, -0.2376F, 0.2463F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(9, 77).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6754F, 6.6192F, -7.2133F, -2.1575F, -1.1643F, 1.897F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(81, 72).mirror().addBox(-0.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9288F, 5.8701F, -9.0503F, -2.9631F, -0.3418F, -2.2937F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(9, 77).mirror().addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6754F, 6.6192F, -7.2133F, -2.1575F, 1.1643F, -1.897F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(101, 97).mirror().addBox(-5.156F, -2.3721F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0994F, -5.6335F, -0.1634F, 0.2661F, -1.4364F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(12, 92).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0994F, -5.6335F, 0.0009F, 0.3112F, -0.8733F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0994F, -5.6335F, 0.1391F, 0.2525F, -0.386F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-6.156F, -2.3721F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -3.6335F, -0.2005F, 0.1867F, -1.3051F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -3.6335F, -0.0748F, 0.2629F, -0.7551F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(111, 94).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -3.6335F, 0.0495F, 0.2438F, -0.2684F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(111, 92).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -1.6335F, -0.0041F, 0.2376F, -0.2463F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(91, 82).mirror().addBox(-3.9408F, -0.417F, -0.3859F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -1.6335F, -0.1193F, 0.2331F, -0.7311F));

		PartDefinition cube_r262 = body.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-7.156F, -2.3721F, -0.3859F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1006F, -1.6335F, -0.2222F, 0.1389F, -1.2737F));

		PartDefinition cube_r263 = body.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(67, 50).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(78, 50).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(78, 50).mirror().addBox(-2.7F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 50).mirror().addBox(-1.7F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 6.7962F, -4.1342F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r264 = body.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(109, 61).addBox(-0.35F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.863F, 7.1595F, -5.4608F, -0.1276F, -0.607F, 0.0731F));

		PartDefinition cube_r265 = body.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(40, 82).addBox(-3.0F, -0.5F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 7.4502F, -2.6947F, -0.2238F, -1.0804F, 0.1982F));

		PartDefinition cube_r266 = body.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(95, 86).addBox(-1.0F, -0.5F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 7.5548F, -1.7002F, -0.1476F, 0.7799F, -0.1042F));

		PartDefinition cube_r267 = body.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(109, 87).addBox(-0.5F, 0.6262F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, 0.4189F, 0.0F, 0.3491F));

		PartDefinition cube_r268 = body.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(110, 79).addBox(-0.5F, -1.5066F, 0.2664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 88).addBox(-0.5F, -1.5066F, -0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, -0.8029F, 0.0F, 0.3491F));

		PartDefinition cube_r269 = body.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(6, 94).addBox(-0.5F, -0.0681F, -0.4362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, -0.1484F, 0.0F, 0.3491F));

		PartDefinition cube_r270 = body.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(82, 104).addBox(-0.5F, 0.2444F, -2.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, -0.5411F, 0.0F, 0.3491F));

		PartDefinition cube_r271 = body.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(87, 104).addBox(-0.5F, -0.0065F, -1.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, -0.3229F, 0.0F, 0.3491F));

		PartDefinition cube_r272 = body.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -1.3215F, -2.2758F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1F, 6.4209F, -3.7759F, -0.2793F, 0.0F, 0.3491F));

		PartDefinition cube_r273 = body.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(88, 31).addBox(-0.5F, -0.5047F, -1.6081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.5934F, 0.2182F, 0.0F));

		PartDefinition cube_r274 = body.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(99, 49).addBox(-0.5F, 0.2675F, -0.2575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.637F, 0.2182F, 0.0F));

		PartDefinition cube_r275 = body.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, 0.2065F, -1.6713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.7679F, 0.2182F, 0.0F));

		PartDefinition cube_r276 = body.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, -1.3617F, -1.6451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.5061F, 0.2182F, 0.0F));

		PartDefinition cube_r277 = body.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(104, 70).addBox(-0.5F, -1.4023F, 0.171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.3752F, 0.2182F, 0.0F));

		PartDefinition cube_r278 = body.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(104, 73).addBox(-0.5F, -1.7438F, 0.5568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, -0.0175F, 0.2182F, 0.0F));

		PartDefinition cube_r279 = body.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(77, 104).addBox(-0.5F, -0.6773F, 0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.2F, 3.5627F, -6.2025F, 0.1134F, 0.2182F, 0.0F));

		PartDefinition cube_r280 = body.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(104, 73).mirror().addBox(-0.5F, -1.7438F, 0.5568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, -0.0175F, -0.2182F, 0.0F));

		PartDefinition cube_r281 = body.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.5F, 0.2675F, -0.2575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.637F, -0.2182F, 0.0F));

		PartDefinition cube_r282 = body.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(77, 104).mirror().addBox(-0.5F, -0.6773F, 0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.1134F, -0.2182F, 0.0F));

		PartDefinition cube_r283 = body.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(104, 70).mirror().addBox(-0.5F, -1.4023F, 0.171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.3752F, -0.2182F, 0.0F));

		PartDefinition cube_r284 = body.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(109, 87).mirror().addBox(-0.5F, 0.6262F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, 0.4189F, 0.0F, -0.3491F));

		PartDefinition cube_r285 = body.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(6, 94).mirror().addBox(-0.5F, -0.0681F, -0.4362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, -0.1484F, 0.0F, -0.3491F));

		PartDefinition cube_r286 = body.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(87, 104).mirror().addBox(-0.5F, -0.0065F, -1.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, -0.3229F, 0.0F, -0.3491F));

		PartDefinition cube_r287 = body.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(82, 104).mirror().addBox(-0.5F, 0.2444F, -2.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, -0.5411F, 0.0F, -0.3491F));

		PartDefinition cube_r288 = body.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(110, 79).mirror().addBox(-0.5F, -1.5066F, 0.2664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 88).mirror().addBox(-0.5F, -1.5066F, -0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, -0.8029F, 0.0F, -0.3491F));

		PartDefinition cube_r289 = body.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -1.3215F, -2.2758F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 6.4209F, -3.7759F, -0.2793F, 0.0F, -0.3491F));

		PartDefinition cube_r290 = body.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-0.5F, 0.2065F, -1.6713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.7679F, -0.2182F, 0.0F));

		PartDefinition cube_r291 = body.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.5F, -0.5047F, -1.6081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.5934F, -0.2182F, 0.0F));

		PartDefinition cube_r292 = body.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5F, -1.3617F, -1.6451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 3.5627F, -6.2025F, 0.5061F, -0.2182F, 0.0F));

		PartDefinition cube_r293 = body.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(109, 61).mirror().addBox(-0.65F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.863F, 7.1595F, -5.4608F, -0.1276F, 0.607F, -0.0731F));

		PartDefinition cube_r294 = body.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(0.0F, -0.5F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 7.4502F, -2.6947F, -0.2238F, 1.0804F, -0.1982F));

		PartDefinition cube_r295 = body.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(95, 86).mirror().addBox(-1.0F, -0.5F, -1.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 7.5548F, -1.7002F, -0.1476F, -0.7799F, 0.1042F));

		PartDefinition cube_r296 = body.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -0.25F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0581F, -11.0213F, 0.0262F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = body.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2384F, 4.2564F, -3.2675F, 1.3856F, 0.8719F, 0.0943F));

		PartDefinition cube_r297 = FrontFlipperR2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-1.5F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0407F, -0.1811F, -1.7566F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r298 = FrontFlipperR2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(95, 30).mirror().addBox(-1.0F, -1.5F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2944F, 0.3189F, -0.3967F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r299 = FrontFlipperR2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(15.0684F, 2.1028F, 1.7433F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8935F, -3.2839F, -18.0595F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r300 = FrontFlipperR2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(88, 18).mirror().addBox(-12.3777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5266F, -3.2839F, -18.0565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r301 = FrontFlipperR2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(74, 92).mirror().addBox(-1.0F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6861F, 0.3189F, -2.4932F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r302 = FrontFlipperR2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-5.1F, -1.5F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9436F, 0.3189F, -0.1071F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r303 = FrontFlipperR2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-2.1F, -0.5F, -2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9436F, -0.1811F, -0.4071F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r304 = FrontFlipperR2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(73, 37).mirror().addBox(-0.725F, -0.5F, 0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 55).mirror().addBox(-0.225F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8476F, -0.1811F, -2.605F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r305 = FrontFlipperR2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-3.5F, -0.5F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(13, 94).mirror().addBox(0.5F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5337F, -0.1811F, -0.5585F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-2.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7593F, -0.1811F, -2.1566F, -0.1123F, -0.7658F, 0.2785F));

		PartDefinition cube_r306 = leftArm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8023F, 0.0F, -3.6037F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r307 = leftArm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(82, 25).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3997F, 0.0F, -4.1118F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r308 = leftArm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-4.0F, -1.0F, -1.175F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, -0.5F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r309 = leftArm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-1.0F, -1.0F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r310 = leftArm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(48, 87).mirror().addBox(-0.35F, -1.0F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = leftArm.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-7.3884F, 0.1028F, -2.5294F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 43).mirror().addBox(-0.5884F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 34).mirror().addBox(-0.7883F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 103).mirror().addBox(-1.5884F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 24).mirror().addBox(-1.0884F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.3817F, -0.1028F, -4.8042F, -0.768F, -0.286F, 1.2299F));

		PartDefinition cube_r311 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(72, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8883F, 0.1028F, -0.7294F, 0.0F, -0.5236F, 0.0F));

		PartDefinition FrontFlipperR4 = body.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2384F, 4.2564F, -3.2675F, 1.4334F, -0.7288F, -0.3393F));

		PartDefinition cube_r312 = FrontFlipperR4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.5F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0407F, -0.1811F, -1.7566F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r313 = FrontFlipperR4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 37).mirror().addBox(-1.0F, -1.5F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, 0.3189F, -0.3967F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r314 = FrontFlipperR4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-18.0684F, 2.1028F, 1.7433F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.8934F, -3.2839F, -18.0595F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r315 = FrontFlipperR4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(10.3777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.5266F, -3.2839F, -18.0565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r316 = FrontFlipperR4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-1.0F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.6861F, 0.3189F, -2.4932F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r317 = FrontFlipperR4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(3.1F, -1.5F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.9435F, 0.3189F, -0.1071F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r318 = FrontFlipperR4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(0.1F, -0.5F, -2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9435F, -0.1811F, -0.4071F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r319 = FrontFlipperR4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-4.275F, -0.5F, 0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 58).mirror().addBox(-3.775F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(4.8476F, -0.1811F, -2.605F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r320 = FrontFlipperR4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.5F, -0.5F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(95, 0).mirror().addBox(-2.5F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5337F, -0.1811F, -0.5585F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(18, 88).mirror().addBox(0.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.7593F, -0.1811F, -2.1566F, -0.6725F, 0.8785F, -0.5654F));

		PartDefinition cube_r321 = rightArm.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(86, 37).mirror().addBox(-2.9F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8023F, 0.0F, -3.6037F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r322 = rightArm.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3997F, 0.0F, -4.1118F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r323 = rightArm.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(1.0F, -1.0F, -1.175F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.5F, -0.5F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r324 = rightArm.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(6, 98).mirror().addBox(-1.0F, -1.0F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.5F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r325 = rightArm.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 87).mirror().addBox(-1.65F, -1.0F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition FrontFlipperMiddleR4 = rightArm.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create().texOffs(104, 49).mirror().addBox(-0.4117F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 52).mirror().addBox(-0.2116F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 27).mirror().addBox(0.5883F, -0.3972F, -0.4294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 40).mirror().addBox(0.0883F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.3817F, -0.1028F, -4.8042F, 0.7734F, 0.1536F, 1.4153F));

		PartDefinition cube_r326 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(104, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8883F, 0.1028F, -0.7294F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r327 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(0.0F, 0.0F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3883F, 0.1028F, -0.0294F, 0.0F, 0.0F, 0.6109F));

		PartDefinition neck2 = body.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2581F, -6.0213F, -0.2074F, 0.1665F, 0.1373F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(41, 110).mirror().addBox(0.0F, -2.0286F, -0.0068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(0.0F, -1.7789F, -0.1075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -3.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(99, 89).addBox(0.0218F, -0.5358F, -0.0422F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2451F, -3.887F, -0.5764F, 0.2608F, -0.237F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(37, 75).addBox(0.0F, -0.4738F, -0.0003F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2451F, -1.987F, -0.731F, 0.3697F, -0.3134F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.0218F, -0.5358F, -0.0422F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2451F, -3.887F, -0.5764F, -0.2608F, 0.237F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(0.0F, -0.4738F, -0.0003F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2451F, -1.987F, -0.731F, -0.3697F, 0.3134F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -5.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.9F, -0.2172F, 0.2184F, 0.0412F));

		PartDefinition cube_r335 = neck.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(103, 110).mirror().addBox(0.0F, -2.0F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(100, 110).mirror().addBox(0.0F, -2.2F, 7.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(15, 71).mirror().addBox(-0.5F, -0.5F, 4.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2515F, -8.7842F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(100, 77).addBox(0.087F, -0.5719F, -0.1618F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1451F, -2.687F, -0.446F, 0.2131F, -0.233F));

		PartDefinition cube_r337 = neck.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(57, 100).addBox(0.0717F, -0.5247F, -0.1403F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1451F, -0.687F, -0.529F, 0.2202F, -0.2193F));

		PartDefinition cube_r338 = neck.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(100, 77).mirror().addBox(-0.087F, -0.5719F, -0.1618F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1451F, -2.687F, -0.446F, -0.2131F, 0.233F));

		PartDefinition cube_r339 = neck.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(57, 100).mirror().addBox(-0.0717F, -0.5247F, -0.1403F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1451F, -0.687F, -0.529F, -0.2202F, 0.2193F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.241F, -3.8847F, -0.3047F, 0.3322F, 0.1615F));

		PartDefinition cube_r340 = neck4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(0, 111).mirror().addBox(0.0F, -1.8F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(109, 110).mirror().addBox(0.0F, -1.9F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(106, 110).mirror().addBox(0.0F, -2.0F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(65, 74).addBox(0.649F, 0.9642F, -4.0037F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1138F, -0.7023F, -0.31F, 0.1494F, -0.1863F));

		PartDefinition cube_r342 = neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(100, 81).addBox(0.4184F, 0.4332F, -2.0808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1138F, -0.7023F, -0.3123F, 0.1909F, -0.1999F));

		PartDefinition cube_r343 = neck4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(80, 100).addBox(0.0069F, -0.1369F, -0.1109F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1138F, -0.7023F, -0.2715F, 0.2324F, -0.2137F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-0.0069F, -0.1369F, -0.1109F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1138F, -0.7023F, -0.2715F, -0.2324F, 0.2137F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(-0.4184F, 0.4332F, -2.0808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1138F, -0.7023F, -0.3123F, -0.1909F, 0.1999F));

		PartDefinition cube_r346 = neck4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(65, 74).mirror().addBox(-0.649F, 0.9642F, -4.0037F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1138F, -0.7023F, -0.31F, -0.1494F, 0.1863F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3949F, -4.9001F, -0.0175F, 0.1026F, 0.2495F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(113, 43).mirror().addBox(0.0F, -1.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 111).mirror().addBox(0.0F, -1.9F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 72).mirror().addBox(-0.5F, -0.8F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -7.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 100).addBox(-0.158F, -0.8533F, -0.0963F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.752F, 0.6755F, -1.8916F, -0.3991F, 0.1729F, -0.2156F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(85, 100).addBox(0.1597F, -0.3224F, -1.996F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.752F, 0.6755F, -1.8916F, -0.3965F, 0.1327F, -0.1985F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 100).mirror().addBox(-0.1597F, -0.3224F, -1.996F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.752F, 0.6755F, -1.8916F, -0.3965F, -0.1327F, 0.1985F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(0.158F, -0.8533F, -0.0963F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.752F, 0.6755F, -1.8916F, -0.3991F, -0.1729F, 0.2156F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.402F, 0.1349F, 0.0131F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(50, 113).mirror().addBox(0.0F, -0.9271F, -0.9451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -3.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(47, 113).mirror().addBox(0.0F, -1.675F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 73).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(95, 100).addBox(1.9596F, 2.2781F, -9.3349F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.181F, 8.1979F, -0.3123F, 0.1909F, -0.1999F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(95, 100).mirror().addBox(-1.9596F, 2.2781F, -9.3349F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.181F, 8.1979F, -0.3123F, -0.1909F, 0.1999F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -4.4F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition cube_r356 = upperjaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-1.0F, -1.125F, -0.975F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6953F, -0.0207F, 1.4704F, 0.0F, 0.0F));

		PartDefinition cube_r357 = upperjaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(13, 98).mirror().addBox(-0.5F, -1.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.1162F, 0.6451F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r358 = upperjaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(-1.0F, -1.025F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.1162F, 0.6451F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r359 = upperjaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-1.0F, -0.425F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5958F, 0.1459F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r360 = upperjaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(52, 105).mirror().addBox(0.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0774F, -4.0504F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r361 = upperjaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.5F, -0.0044F, -1.4034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(101, 93).mirror().addBox(0.5F, -0.0044F, -1.0034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.737F, -2.0285F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r362 = upperjaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2303F, -3.321F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r363 = upperjaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-1.0F, -0.0044F, -1.0035F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8329F, -1.0331F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r364 = upperjaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(9, 84).mirror().addBox(-1.5F, -0.425F, -0.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5417F, -4.2572F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r365 = upperjaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6689F, -4.9159F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r366 = upperjaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(97, 34).mirror().addBox(-1.0F, -0.525F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.021F, -4.8477F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r367 = upperjaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(96, 44).mirror().addBox(-1.0F, -0.475F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.325F, -4.775F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r368 = upperjaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3438F, -0.5481F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r369 = upperjaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(56, 83).mirror().addBox(-1.0F, -0.5F, -0.425F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1F, -0.2F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.8248F, -1.6431F, -1.8074F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(62, 104).mirror().addBox(-0.4031F, -0.2566F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0228F, -0.0302F, 0.0058F, -0.167F, -0.187F, 0.0332F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-0.4031F, -0.6994F, -0.1333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0228F, -0.0302F, 0.0058F, -0.7778F, -0.187F, 0.0332F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(-0.5281F, -0.4459F, -0.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(102, 104).mirror().addBox(-0.7031F, -0.4459F, -0.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(104, 58).mirror().addBox(-0.4031F, -0.371F, -0.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0228F, -0.0302F, 0.0058F, 1.5347F, -0.187F, 0.0332F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-0.4031F, -0.8014F, -0.8527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0228F, -0.0302F, 0.0058F, 0.6184F, -0.187F, 0.0332F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(57, 104).mirror().addBox(-0.4031F, -0.1608F, -0.5335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0228F, -0.0302F, 0.0058F, 1.8838F, -0.187F, 0.0332F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-2.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.5748F, 1.3316F, 1.5131F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(72, 106).mirror().addBox(-2.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(1.5748F, 1.4225F, 1.4047F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(97, 104).mirror().addBox(0.225F, -0.725F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6752F, 0.5983F, 0.6231F, 0.5961F, -0.2761F, 0.1297F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(109, 52).mirror().addBox(-0.85F, -0.1539F, 2.5978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.2959F, -2.239F, -0.2182F, 0.048F, 0.0F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(0.1293F, -0.1441F, 1.8878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 94).mirror().addBox(0.1293F, -0.1441F, 0.8878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.2959F, -2.239F, -0.1222F, -0.2138F, 0.0F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(67, 105).mirror().addBox(-0.016F, -0.9809F, -0.7813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0502F, 1.2209F, -1.439F, -0.0873F, 0.0916F, 0.0873F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(82, 107).mirror().addBox(-0.65F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4059F, 1.1789F, -1.8236F, 0.1321F, 0.0824F, 0.0446F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2645F, 1.2458F, -0.6069F, -0.0516F, -0.1267F, -0.0046F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(-0.216F, -0.0906F, -0.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0502F, 1.2209F, -1.439F, -1.3963F, 0.0916F, 0.0873F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(99, 73).mirror().addBox(0.0971F, -0.4272F, 1.4381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0312F, 0.1407F, -2.258F, 0.3551F, -0.1907F, -0.0506F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-0.0295F, -0.1788F, 0.5477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0312F, 0.1407F, -2.258F, 0.5229F, -0.1152F, -0.0063F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(62, 107).mirror().addBox(-0.575F, -0.475F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.4248F, 0.6365F, -2.1723F, 0.8165F, 0.2443F, 0.2519F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(107, 84).mirror().addBox(1.2785F, -0.3262F, -0.7135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7252F, 1.6241F, -2.226F, -0.431F, -0.1533F, -0.2988F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 107).mirror().addBox(-0.2846F, -0.5826F, -0.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(92, 107).mirror().addBox(-0.6846F, -0.5826F, -0.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7454F, 1.6839F, -2.1224F, -0.3858F, 0.1964F, -0.2007F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(105, 15).mirror().addBox(-0.0499F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 15).mirror().addBox(1.1501F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 15).mirror().addBox(0.5501F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.638F, 1.0239F, -2.4265F, -0.431F, -0.1533F, -0.2116F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-0.6977F, -0.3882F, -0.5338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7454F, 1.6839F, -2.1224F, -0.271F, 0.2332F, -0.0721F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(57, 107).mirror().addBox(-0.9F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(107, 46).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6448F, 1.464F, -2.3673F, -0.5188F, 0.4749F, -0.388F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(109, 55).mirror().addBox(0.4F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(109, 55).mirror().addBox(-0.6F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(107, 107).mirror().addBox(-0.1F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0517F, 1.8115F, -2.753F, -0.1697F, 0.2313F, -0.1407F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5355F, 1.8794F, -2.559F, -0.1747F, 0.4249F, -0.1483F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(102, 107).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9554F, 1.9532F, -2.2979F, -0.1867F, 0.5494F, -0.174F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(107, 37).mirror().addBox(-1.1066F, -0.8009F, -0.1935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 30).mirror().addBox(-0.8066F, -0.8009F, -0.1935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.6077F, 1.8484F, -2.8811F, -0.3655F, 0.5257F, -0.2505F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(105, 12).mirror().addBox(-0.192F, -0.1312F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 3).mirror().addBox(0.408F, -0.1312F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.638F, 1.0239F, -2.4265F, -0.5403F, 0.131F, -0.3572F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-1.3816F, -0.8509F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 9).mirror().addBox(-0.7816F, -0.8509F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4502F, 1.7241F, -3.076F, -0.3463F, 0.2318F, -0.1766F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(107, 9).mirror().addBox(-0.5318F, -0.1751F, -0.5504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1045F, 1.1053F, -2.698F, -0.3463F, 0.2318F, -0.1766F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(92, 104).mirror().addBox(-0.1022F, -0.0498F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0312F, 0.1407F, -2.258F, 0.7373F, -0.0016F, 0.0589F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(102, 4).mirror().addBox(-0.0635F, -1.0381F, 2.1423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0312F, 0.1407F, -2.258F, 0.0966F, -0.13F, -0.0193F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.0859F, 0.9057F, -2.6206F, -0.5361F, 0.0561F, -0.3123F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.8248F, -1.6431F, -1.8074F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(62, 104).addBox(-0.5969F, -0.2566F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0228F, -0.0302F, 0.0058F, -0.167F, 0.187F, -0.0332F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(104, 64).addBox(-0.5969F, -0.6994F, -0.1333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0228F, -0.0302F, 0.0058F, -0.7778F, 0.187F, -0.0332F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(104, 67).addBox(-0.4719F, -0.4459F, -0.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(102, 104).addBox(-0.2969F, -0.4459F, -0.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(104, 58).addBox(-0.5969F, -0.371F, -0.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0228F, -0.0302F, 0.0058F, 1.5347F, 0.187F, -0.0332F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(104, 61).addBox(-0.5969F, -0.8014F, -0.8527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0228F, -0.0302F, 0.0058F, 0.6184F, 0.187F, -0.0332F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(57, 104).addBox(-0.5969F, -0.1608F, -0.5335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0228F, -0.0302F, 0.0058F, 1.8838F, 0.187F, -0.0332F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(44, 106).addBox(1.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.5748F, 1.3316F, 1.5131F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(72, 106).addBox(1.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-1.5748F, 1.4225F, 1.4047F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(97, 104).addBox(-1.225F, -0.725F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6752F, 0.5983F, 0.6231F, 0.5961F, 0.2761F, -0.1297F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(109, 52).addBox(-0.15F, -0.1539F, 2.5978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0252F, 0.2959F, -2.239F, -0.2182F, -0.048F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(106, 91).addBox(-1.1294F, -0.1441F, 1.8878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 94).addBox(-1.1294F, -0.1441F, 0.8878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0252F, 0.2959F, -2.239F, -0.1222F, 0.2138F, 0.0F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(67, 105).addBox(-0.984F, -0.9809F, -0.7813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0502F, 1.2209F, -1.439F, -0.0873F, -0.0916F, -0.0873F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(82, 107).addBox(-0.35F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4059F, 1.1789F, -1.8236F, 0.1321F, -0.0824F, -0.0446F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(40, 92).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2645F, 1.2458F, -0.6069F, -0.0516F, 0.1267F, 0.0046F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(107, 6).addBox(-0.784F, -0.0906F, -0.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0502F, 1.2209F, -1.439F, -1.3963F, -0.0916F, -0.0873F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(99, 73).addBox(-1.0971F, -0.4272F, 1.4381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0312F, 0.1407F, -2.258F, 0.3551F, 0.1907F, 0.0506F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(5, 105).addBox(-0.9705F, -0.1788F, 0.5477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0312F, 0.1407F, -2.258F, 0.5229F, 0.1152F, 0.0063F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(77, 107).addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 107).addBox(-0.425F, -0.475F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.4248F, 0.6365F, -2.1723F, 0.8165F, -0.2443F, -0.2519F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(107, 84).addBox(-2.2785F, -0.3262F, -0.7135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7252F, 1.6241F, -2.226F, -0.431F, 0.1533F, 0.2988F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(87, 107).addBox(-0.7154F, -0.5826F, -0.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(92, 107).addBox(-0.3154F, -0.5826F, -0.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7454F, 1.6839F, -2.1224F, -0.3858F, -0.1964F, 0.2007F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(105, 15).addBox(-0.9501F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 15).addBox(-2.1501F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 15).addBox(-1.5501F, -0.0772F, -0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.638F, 1.0239F, -2.4265F, -0.431F, 0.1533F, 0.2116F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(97, 107).addBox(-0.3023F, -0.3882F, -0.5338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7454F, 1.6839F, -2.1224F, -0.271F, -0.2332F, 0.0721F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(57, 107).addBox(-0.1F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(107, 46).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6448F, 1.464F, -2.3673F, -0.5188F, -0.4749F, 0.388F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(109, 55).addBox(-1.4F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(109, 55).addBox(-0.4F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(107, 107).addBox(-0.9F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0517F, 1.8115F, -2.753F, -0.1697F, -0.2313F, 0.1407F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(107, 104).addBox(-0.475F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5355F, 1.8794F, -2.559F, -0.1747F, -0.4249F, 0.1483F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(102, 107).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9554F, 1.9532F, -2.2979F, -0.1867F, -0.5494F, 0.174F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(107, 37).addBox(0.1066F, -0.8009F, -0.1935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 30).addBox(-0.1934F, -0.8009F, -0.1935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.6076F, 1.8484F, -2.8811F, -0.3655F, -0.5257F, 0.2505F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(105, 12).addBox(-0.808F, -0.1312F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 3).addBox(-1.408F, -0.1312F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.638F, 1.0239F, -2.4265F, -0.5403F, -0.131F, 0.3572F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(10, 105).addBox(0.3816F, -0.8509F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 9).addBox(-0.2184F, -0.8509F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4502F, 1.7241F, -3.076F, -0.3463F, -0.2318F, 0.1766F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(107, 9).addBox(-0.4682F, -0.1751F, -0.5504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1045F, 1.1053F, -2.698F, -0.3463F, -0.2318F, 0.1766F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(92, 104).addBox(-0.8978F, -0.0498F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0312F, 0.1407F, -2.258F, 0.7373F, 0.0016F, -0.0589F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(102, 4).addBox(-0.9365F, -1.0381F, 2.1423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0312F, 0.1407F, -2.258F, 0.0966F, 0.13F, 0.0193F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(107, 3).addBox(-0.475F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0859F, 0.9057F, -2.6206F, -0.5361F, -0.0561F, 0.3123F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-1.65F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(89, 43).addBox(0.65F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 1.1148F, -0.2772F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(108, 27).addBox(-0.8F, -1.2889F, -1.3494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.45F, 0.7296F, -0.2293F, -0.3316F, 0.1745F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(108, 24).addBox(-0.7767F, -1.3996F, -0.9758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 108).addBox(-0.7767F, -1.3996F, -1.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.325F, 0.5296F, -0.8043F, -0.0262F, 0.2443F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(108, 100).addBox(-0.7767F, -0.7568F, -2.6855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(67, 108).addBox(-0.7767F, -0.7568F, -2.2855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(92, 56).addBox(-0.7767F, -0.7605F, -1.7775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.325F, 0.5296F, -0.8043F, -0.3316F, 0.2443F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(108, 97).addBox(-0.7767F, -1.1599F, -2.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(108, 76).addBox(-0.7767F, -1.1599F, -2.2647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.325F, 0.5296F, -0.8043F, -0.2007F, 0.2443F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(108, 43).addBox(-0.2296F, -0.7662F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.225F, -0.2704F, -2.9543F, -0.3278F, -0.1485F, 0.0866F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(49, 108).addBox(0.3704F, -0.9393F, -1.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 108).addBox(-0.2296F, -0.9393F, -1.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, -0.2704F, -2.9543F, -0.0223F, -0.1485F, 0.0866F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(108, 40).addBox(-0.2296F, -0.8449F, -0.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, -0.2704F, -2.9543F, -0.1969F, -0.1485F, 0.0866F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(109, 58).addBox(-0.425F, -0.25F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5107F, -1.0668F, -2.9264F, -0.2039F, -0.0889F, 0.0697F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(92, 60).addBox(-0.5F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8026F, -0.4978F, -1.7555F, -0.2138F, 0.2443F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(5, 108).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.45F, 0.7296F, -0.2293F, -0.2618F, 0.1745F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 108).addBox(1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 108).mirror().addBox(-1.3F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.5F, 0.325F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(110, 12).addBox(-0.2763F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(109, 64).addBox(-0.7763F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(109, 64).addBox(0.2237F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.3313F, -0.2612F, 0.1495F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(105, 18).addBox(1.1748F, -0.6091F, -0.5898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.38F, -0.5602F, 0.27F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(0, 105).addBox(0.7017F, -0.6091F, -0.4158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.355F, -0.4421F, 0.2182F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(36, 105).addBox(-0.7284F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(36, 105).addBox(-0.2534F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 33).addBox(0.3466F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.1474F, -0.2866F, 0.092F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(44, 109).addBox(0.8791F, -0.3034F, -0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(110, 15).addBox(1.1791F, -0.3034F, -0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.1969F, -0.5754F, 0.1892F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(59, 110).addBox(-0.6724F, -0.2089F, 0.2639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7834F, -1.0347F, -4.5338F, -0.0519F, 0.1148F, 0.0281F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(110, 18).addBox(0.6503F, -0.3525F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(77, 110).addBox(1.0503F, -0.3525F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.0843F, -0.1113F, 0.172F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(54, 110).addBox(-0.6724F, -0.2089F, 0.4639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 110).addBox(-0.0724F, -0.2089F, 0.4639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1584F, -0.9847F, -4.4088F, -0.0519F, 0.1148F, 0.0281F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(47, 97).addBox(-2.1334F, -0.6173F, -0.8475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1334F, -0.8347F, -3.9838F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(57, 97).addBox(-2.1334F, -0.3843F, -0.8394F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1334F, -0.8347F, -3.9838F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(36, 108).addBox(-0.8F, -0.7768F, -1.2747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.45F, 0.7296F, -0.2293F, -0.9425F, 0.1745F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(36, 108).mirror().addBox(-0.2F, -0.7768F, -1.2747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.7296F, -0.2293F, -0.9425F, -0.1745F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(108, 27).mirror().addBox(-0.2F, -1.2889F, -1.3494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.7296F, -0.2293F, -0.3316F, -0.1745F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(108, 24).mirror().addBox(-0.2232F, -1.3996F, -0.9758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 108).mirror().addBox(-0.2232F, -1.3996F, -1.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.5296F, -0.8043F, -0.0262F, -0.2443F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(108, 100).mirror().addBox(-0.2232F, -0.7568F, -2.6855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(67, 108).mirror().addBox(-0.2232F, -0.7568F, -2.2855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(92, 56).mirror().addBox(-0.2232F, -0.7605F, -1.7775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.5296F, -0.8043F, -0.3316F, -0.2443F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(108, 97).mirror().addBox(-0.2232F, -1.1599F, -2.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(108, 76).mirror().addBox(-0.2232F, -1.1599F, -2.2647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.5296F, -0.8043F, -0.2007F, -0.2443F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(108, 43).mirror().addBox(-0.7705F, -0.7662F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -0.2704F, -2.9543F, -0.3278F, 0.1485F, -0.0866F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(49, 108).mirror().addBox(-1.3704F, -0.9393F, -1.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 108).mirror().addBox(-0.7705F, -0.9393F, -1.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -0.2704F, -2.9543F, -0.0223F, 0.1485F, -0.0866F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(108, 40).mirror().addBox(-0.7705F, -0.8449F, -0.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -0.2704F, -2.9543F, -0.1969F, 0.1485F, -0.0866F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(109, 58).mirror().addBox(-0.575F, -0.25F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5107F, -1.0668F, -2.9264F, -0.2039F, 0.0889F, -0.0697F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(-0.5F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8026F, -0.4978F, -1.7555F, -0.2138F, -0.2443F, 0.0F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.7296F, -0.2293F, -0.2618F, -0.1745F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(110, 12).mirror().addBox(-0.7237F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(109, 64).mirror().addBox(-0.2237F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(109, 64).mirror().addBox(-1.2237F, -0.6091F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.3313F, 0.2612F, -0.1495F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(105, 18).mirror().addBox(-2.1748F, -0.6091F, -0.5898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.38F, 0.5602F, -0.27F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-1.7017F, -0.6091F, -0.4158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.355F, 0.4421F, -0.2182F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(36, 105).mirror().addBox(-0.2716F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(36, 105).mirror().addBox(-0.7466F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 33).mirror().addBox(-1.3466F, -0.263F, -0.2392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.1474F, 0.2866F, -0.092F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(44, 109).mirror().addBox(-1.8791F, -0.3034F, -0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(110, 15).mirror().addBox(-2.1791F, -0.3034F, -0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.1969F, 0.5754F, -0.1892F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(59, 110).mirror().addBox(-0.3276F, -0.2089F, 0.2639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7834F, -1.0347F, -4.5338F, -0.0519F, -0.1148F, -0.0281F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(110, 18).mirror().addBox(-1.6503F, -0.3525F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(77, 110).mirror().addBox(-2.0503F, -0.3525F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.0843F, 0.1113F, -0.172F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(54, 110).mirror().addBox(-0.3276F, -0.2089F, 0.4639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 110).mirror().addBox(-0.9276F, -0.2089F, 0.4639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -0.9847F, -4.4088F, -0.0519F, -0.1148F, -0.0281F));

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