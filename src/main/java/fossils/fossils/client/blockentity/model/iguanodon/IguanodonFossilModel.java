package fossils.fossils.client.blockentity.model.iguanodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IguanodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public IguanodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(78, 82).addBox(4.5F, -0.5615F, 1.5866F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F))
				.texOffs(78, 82).mirror().addBox(-5.5F, -0.5615F, 1.5866F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offset(0.0F, -39.9F, 3.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 29).addBox(0.0F, -5.9477F, 0.0014F, 0.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-4.0F, 1.997F, -11.5184F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 67).mirror().addBox(-5.0F, -0.003F, -8.3184F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 71).mirror().addBox(-5.0F, 0.997F, -10.5184F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(55, 30).addBox(1.0F, 1.997F, -11.5184F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(56, 71).addBox(5.0F, 0.997F, -10.5184F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(42, 67).addBox(5.0F, -0.003F, -8.3184F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 7.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-5.0F, -0.0905F, -7.9654F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 63).addBox(5.0F, -0.0905F, -7.9654F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -3.9F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 24).mirror().addBox(0.0F, -0.3981F, 1.8996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -0.6822F, 0.2313F, -0.151F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 24).mirror().addBox(0.0F, -0.2321F, -0.0336F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, 0.1905F, 0.2313F, -0.151F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(110, 5).mirror().addBox(0.0F, -0.4149F, 0.0468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -0.5338F, 0.2313F, -0.151F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(0.0F, 0.557F, -0.3565F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -0.2022F, 0.2313F, -0.151F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(0.0F, -1.7007F, -13.6074F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 3.6856F, -4.8326F, 2.5831F, 0.2094F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(0.0F, -0.4073F, -5.8515F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 3.6856F, -4.8326F, 2.3562F, 0.2094F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-5.0F, -3.1328F, -0.0513F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 19).addBox(5.0F, -3.1328F, -0.0513F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.1F, -4.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(0.0F, -6.8215F, 10.4264F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -1.2145F, 0.2313F, -0.151F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 82).mirror().addBox(0.0F, -2.6364F, 8.1513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -0.848F, 0.2313F, -0.151F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(0.0F, -1.4791F, -0.5701F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 6.1F, 1.2F, -0.7084F, 0.2313F, -0.151F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(-1.0F, -0.9741F, -0.0804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(28, 110).addBox(9.0F, -0.9741F, -0.0804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.5F, 6.1359F, -11.0077F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(110, 105).mirror().addBox(-1.0F, -0.9415F, -0.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 105).addBox(9.0F, -0.9415F, -0.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 4.5359F, -12.3077F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(104, 7).mirror().addBox(-1.0F, -0.1042F, 0.0714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(104, 7).addBox(9.0F, -0.1042F, 0.0714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, 3.1359F, -11.0077F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(108, 110).mirror().addBox(-1.0F, -1.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(108, 110).addBox(9.0F, -1.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.5F, 4.5359F, -10.5077F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 108).mirror().addBox(-1.0F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(83, 108).addBox(9.0F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.5F, 4.8031F, -9.9258F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-1.0F, -0.9438F, 0.0517F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 43).addBox(9.0F, -0.9438F, 0.0517F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 5.4856F, -9.2326F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 19).mirror().addBox(-1.0F, -0.0462F, 0.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(60, 19).addBox(9.0F, -0.0462F, 0.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.5F, 1.3514F, -4.4589F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 111).mirror().addBox(-1.0F, -0.0765F, 0.0746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(44, 111).addBox(9.0F, -0.0765F, 0.0746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.5F, 2.5514F, -6.0589F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 93).mirror().addBox(-1.0F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(47, 93).addBox(9.0F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.5F, 3.0856F, -6.3326F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-5.5F, -1.0318F, -7.9996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(72, 32).addBox(4.5F, -1.0318F, -7.9996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.8F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 85).mirror().addBox(0.0F, -0.0905F, -5.9654F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.5F, -2.2F, -3.9F, 0.5918F, -0.1453F, -0.097F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-6.0F, -0.1428F, -2.9649F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 19).addBox(5.0F, -0.1428F, -2.9649F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -0.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(0.0F, -0.199F, -0.1814F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.5F, -2.1F, -0.7F, -0.2106F, 0.1024F, -0.0218F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 22).addBox(-1.0F, -1.7007F, -13.6074F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.5F, 3.6856F, -4.8326F, 2.5831F, -0.2094F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 32).addBox(-1.0F, -0.4073F, -5.8515F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 3.6856F, -4.8326F, 2.3562F, -0.2094F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 76).addBox(-1.0F, -6.8215F, 10.4264F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -1.2145F, -0.2313F, 0.151F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(100, 82).addBox(-1.0F, -2.6364F, 8.1513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -0.848F, -0.2313F, 0.151F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(30, 24).addBox(-1.0F, -0.3981F, 1.8996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -0.6822F, -0.2313F, 0.151F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 24).addBox(-1.0F, -0.2321F, -0.0336F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, 0.1905F, -0.2313F, 0.151F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(99, 45).addBox(-1.0F, 0.557F, -0.3565F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -0.2022F, -0.2313F, 0.151F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 5).addBox(-1.0F, -0.4149F, 0.0468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -0.5338F, -0.2313F, 0.151F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 65).addBox(-1.0F, -1.4791F, -0.5701F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 6.1F, 1.2F, -0.7084F, -0.2313F, 0.151F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 85).addBox(-1.0F, -0.0905F, -5.9654F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.5F, -2.2F, -3.9F, 0.5918F, 0.1453F, 0.097F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 9).addBox(-1.0F, -0.199F, -0.1814F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.5F, -2.1F, -0.7F, -0.2106F, -0.1024F, 0.0218F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(21, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, -6.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 2.8F, -1.3F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, 5.4791F, -1.6592F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9314F, -0.6016F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 42).addBox(-1.0F, -5.0285F, -3.0408F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7686F, 1.2984F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 40).addBox(-1.0F, -4.9937F, -0.0329F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0686F, -2.6016F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 91).addBox(-1.0F, 3.2F, -4.2F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.4649F, -0.5292F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 85).addBox(-1.0F, -6.8716F, -0.0973F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.8686F, -3.1016F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.3686F, -0.9016F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 13.5919F, -2.3098F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -0.1257F, -0.9784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 10.4354F, -0.7811F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(61, 85).addBox(-0.5F, -6.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(104, 51).addBox(-0.5F, -4.6F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 6.8354F, -0.7811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(96, 58).addBox(-1.0F, 3.7F, -0.4F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 24).addBox(-1.0F, -0.7F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.1354F, 0.6189F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 83).addBox(-1.0F, -12.0562F, -1.9362F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9F, 13.5785F, -0.4842F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(103, 0).addBox(-1.0F, -0.2525F, 0.0214F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 8.9811F, -1.9223F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -3.5F, -1.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9F, 5.4811F, -0.6223F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(18, 85).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.8354F, -2.6811F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(73, 73).addBox(-3.0F, -1.0319F, -3.2504F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, -1.0F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(58, 0).addBox(-3.0F, -1.3F, -5.2F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 2.8F, -1.3F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 30).addBox(-0.5F, 5.4791F, -1.6592F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9314F, -0.6016F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(40, 26).addBox(-1.0F, -5.0285F, -3.0408F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7686F, 1.2984F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(92, 29).addBox(-1.0F, -4.9937F, -0.0329F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0686F, -2.6016F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 87).addBox(-1.0F, 3.2F, -4.2F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.4649F, -0.5292F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -6.8716F, -0.0973F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.8686F, -3.1016F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.3686F, -0.9016F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 13.5919F, -2.3098F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1257F, -0.9784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 10.4354F, -0.7811F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(70, 60).addBox(-0.5F, -6.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(100, 103).addBox(-0.5F, -4.6F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 6.8354F, -0.7811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 96).addBox(-1.0F, 3.7F, -0.4F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 4).addBox(-1.0F, -0.7F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1354F, 0.6189F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 0).addBox(-1.0F, -12.0562F, -1.9362F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9F, 13.5785F, -0.4842F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 20).addBox(-1.0F, -0.2525F, 0.0214F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 8.9811F, -1.9223F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(91, 95).addBox(-1.0F, -3.5F, -1.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 5.4811F, -0.6223F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.8354F, -2.6811F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(68, 42).addBox(-3.0F, -1.0319F, -3.2504F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, -1.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(55, 49).addBox(-3.0F, -1.3F, -5.2F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(67, 104).addBox(0.0F, -6.4214F, 0.0876F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 104).addBox(0.0F, -6.3731F, -0.0164F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -4.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(105, 103).addBox(0.0F, -6.0731F, -0.0164F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -7.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 106).addBox(0.0F, -5.8558F, 3.0787F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 107).addBox(0.0F, -4.9558F, 0.0787F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -14.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-1.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, -2.1597F, -1.3011F, 0.0143F, 0.1836F, 0.4788F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(113, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4185F, -0.8949F, -0.0703F, -0.0569F, -0.494F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(113, 13).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4185F, -0.8949F, -0.0368F, -0.0826F, -0.9657F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-1.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, -2.1597F, -4.3011F, 0.0143F, 0.1836F, 0.4788F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(107, 76).mirror().addBox(-1.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, -2.1597F, -7.3011F, 0.0143F, 0.1836F, 0.4788F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(107, 82).mirror().addBox(-1.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, -2.1597F, -10.3011F, 0.0143F, 0.1836F, 0.4788F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(109, 24).mirror().addBox(-1.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, -2.1597F, -13.3011F, 0.0143F, 0.1836F, 0.4788F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(113, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -3.8949F, -0.0395F, -0.0403F, -0.4955F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(113, 43).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -3.8949F, -0.0169F, -0.0539F, -0.967F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(113, 95).mirror().addBox(-5.0439F, -2.4213F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -3.8949F, 0.0074F, -0.056F, -1.404F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(115, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2185F, -12.8949F, 0.2251F, 0.0703F, -0.4371F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(115, 97).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2185F, -12.8949F, 0.1696F, 0.1644F, -0.9023F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(40, 24).mirror().addBox(-14.0439F, -2.4213F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2185F, -12.8949F, 0.0839F, 0.2204F, -1.3433F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-6.0439F, -2.4213F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -6.8949F, 0.0306F, 0.0817F, -1.4037F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(114, 113).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -6.8949F, 0.0623F, 0.0611F, -0.9668F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -6.8949F, 0.0832F, 0.0262F, -0.4963F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-11.0439F, -2.4213F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -9.8949F, 0.0461F, 0.1226F, -1.3323F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(115, 15).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -9.8949F, 0.0936F, 0.0916F, -0.8945F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(28, 115).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6185F, -9.8949F, 0.1249F, 0.0393F, -0.4252F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(113, 13).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4185F, -0.8949F, -0.0368F, 0.0826F, 0.9657F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(113, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4185F, -0.8949F, -0.0703F, 0.0569F, 0.494F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(113, 95).addBox(3.0439F, -2.4213F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -3.8949F, 0.0074F, 0.056F, 1.404F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(113, 43).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -3.8949F, -0.0169F, 0.0539F, 0.967F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(113, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -3.8949F, -0.0395F, 0.0403F, 0.4955F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(115, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -6.8949F, 0.0832F, -0.0262F, 0.4963F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(114, 113).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -6.8949F, 0.0623F, -0.0611F, 0.9668F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 11).addBox(3.0439F, -2.4213F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -6.8949F, 0.0306F, -0.0817F, 1.4037F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 24).addBox(3.0439F, -2.4213F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2185F, -12.8949F, 0.0839F, -0.2204F, 1.3433F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(115, 97).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2185F, -12.8949F, 0.1696F, -0.1644F, 0.9023F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(115, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2185F, -12.8949F, 0.2251F, -0.0703F, 0.4371F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(55, 58).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -2.1597F, -1.3011F, 0.0143F, -0.1836F, -0.4788F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 51).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -2.1597F, -4.3011F, 0.0143F, -0.1836F, -0.4788F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(107, 76).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -2.1597F, -7.3011F, 0.0143F, -0.1836F, -0.4788F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(107, 82).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -2.1597F, -10.3011F, 0.0143F, -0.1836F, -0.4788F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(109, 24).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -2.1597F, -13.3011F, 0.0143F, -0.1836F, -0.4788F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 9).addBox(3.0439F, -2.4213F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -9.8949F, 0.0461F, -0.1226F, 1.3323F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(115, 15).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -9.8949F, 0.0936F, -0.0916F, 0.8945F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(28, 115).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6185F, -9.8949F, 0.1249F, -0.0393F, 0.4252F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.3F, -14.9F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(92, 113).addBox(0.0F, -4.6082F, -3.5756F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 108).addBox(0.0F, -5.342F, -1.6058F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -15.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(89, 113).addBox(0.0F, -4.2608F, 0.1472F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(73, 114).addBox(0.0F, -4.752F, 4.0517F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 115).addBox(0.0F, -4.052F, 2.0517F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 115).addBox(0.0F, -3.452F, 0.0517F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -11.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-1.0F, 0.0263F, -9.1134F, 1.0F, 3.0F, 9.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(18, 60).addBox(11.0F, 0.0263F, -9.1134F, 1.0F, 3.0F, 9.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-5.5F, 0.4254F, -2.8345F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(40, 4).mirror().addBox(-1.0F, -0.1151F, 0.0281F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 4).addBox(11.0F, -0.1151F, 0.0281F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 0.6254F, -2.8345F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(58, 58).mirror().addBox(-1.0F, 0.0263F, -9.1134F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(58, 58).addBox(11.0F, 0.0263F, -9.1134F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.5F, 0.4254F, -2.8345F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 78).mirror().addBox(-0.5F, -0.3462F, 0.0207F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 15.9769F, -4.8327F, 1.6425F, -0.6184F, 0.3914F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(-0.5F, -0.5462F, 0.0207F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 15.9769F, -4.8327F, 1.5896F, -0.7932F, 0.393F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(97, 105).mirror().addBox(-0.5F, -0.5462F, 0.0207F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 15.9769F, -4.8327F, 1.6449F, -1.0371F, 0.3674F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(19, 110).mirror().addBox(-0.5F, -0.7462F, 0.0207F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 15.9769F, -4.8327F, 1.926F, -1.3076F, 0.1779F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.5F, -3.2F, -0.6F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6539F, 12.6498F, -12.2388F, 1.281F, -0.6111F, -1.1134F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(67, 88).mirror().addBox(0.0193F, -2.0954F, -4.0159F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 9.8254F, -11.1345F, 0.996F, -0.4834F, -0.6225F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(90, 105).mirror().addBox(-1.5792F, -4.7973F, 0.0043F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3982F, 15.4412F, -4.8325F, 1.4361F, -0.2657F, -1.1695F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, 1.739F, -10.9195F, 0.2315F, 0.0906F, 0.5245F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, 0.739F, -9.1195F, 0.2315F, 0.0906F, 0.5245F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(109, 58).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9884F, 0.2214F, -7.1876F, 0.2306F, 0.0056F, 0.5045F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(111, 79).mirror().addBox(-1.5F, -0.4F, -4.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 85).mirror().addBox(-1.5F, -0.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 31).mirror().addBox(-1.5F, -0.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2936F, -0.9678F, 0.2323F, -0.1218F, 0.4745F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-7.0439F, -2.4213F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1815F, -10.7949F, 0.1371F, 0.3504F, -1.2934F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(114, 17).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1815F, -10.7949F, 0.2739F, 0.2598F, -0.8454F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(114, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1815F, -10.7949F, 0.3594F, 0.1104F, -0.3901F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(20, 13).mirror().addBox(-9.0439F, -2.4213F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1815F, -8.9949F, 0.1302F, 0.3342F, -1.2608F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(114, 48).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1815F, -8.9949F, 0.2606F, 0.248F, -0.8138F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(114, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1815F, -8.9949F, 0.3425F, 0.1055F, -0.357F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6815F, -6.9949F, 0.3085F, 0.0967F, -0.3604F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(114, 71).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6815F, -6.9949F, 0.2334F, 0.2251F, -0.8202F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(40, 17).mirror().addBox(-14.0439F, -2.4213F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6815F, -6.9949F, 0.1154F, 0.3022F, -1.2654F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(20, 22).mirror().addBox(-15.0439F, -2.4213F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1815F, -5.0949F, 0.1127F, 0.2846F, -1.2487F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(114, 73).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1815F, -5.0949F, 0.2232F, 0.2104F, -0.8049F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(114, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1815F, -5.0949F, 0.293F, 0.0879F, -0.3443F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-16.0439F, -2.4213F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5185F, -3.1949F, 0.1234F, 0.318F, -1.2456F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 114).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5185F, -3.1949F, 0.2474F, 0.2362F, -0.7995F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5185F, -3.1949F, 0.3257F, 0.1005F, -0.3413F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(114, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4185F, -0.6949F, 0.2921F, 0.0905F, -0.3794F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(20, 2).mirror().addBox(-16.0439F, -2.4213F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4185F, -0.6949F, 0.11F, 0.2855F, -1.2844F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 114).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4185F, -0.6949F, 0.2212F, 0.2124F, -0.8403F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -3.462F, -5.0341F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5F, 7.4254F, -7.1345F, 0.8969F, -0.3141F, -0.3691F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(67, 88).addBox(-1.0193F, -2.0954F, -4.0159F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.2F, 9.8254F, -11.1345F, 0.996F, 0.4834F, 0.6225F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5F, -3.2F, -0.6F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6539F, 12.6498F, -12.2388F, 1.281F, 0.6111F, 1.1134F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5F, -0.3462F, 0.0207F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0675F, 15.9769F, -4.8327F, 1.6425F, 0.6184F, -0.3914F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(36, 42).addBox(-0.5F, -0.5462F, 0.0207F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0675F, 15.9769F, -4.8327F, 1.5896F, 0.7932F, -0.393F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(97, 105).addBox(-0.5F, -0.5462F, 0.0207F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0675F, 15.9769F, -4.8327F, 1.6449F, 1.0371F, -0.3674F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(19, 110).addBox(-0.5F, -0.7462F, 0.0207F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0675F, 15.9769F, -4.8327F, 1.926F, 1.3076F, -0.1779F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(90, 105).addBox(0.5792F, -4.7973F, 0.0043F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3982F, 15.4412F, -4.8325F, 1.4361F, 0.2657F, 1.1695F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.462F, -5.0341F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 7.4254F, -7.1345F, 0.8969F, 0.3141F, 0.3691F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(114, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1815F, -10.7949F, 0.3594F, -0.1104F, 0.3901F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(114, 17).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1815F, -10.7949F, 0.2739F, -0.2598F, 0.8454F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(55, 40).addBox(3.0439F, -2.4213F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1815F, -10.7949F, 0.1371F, -0.3504F, 1.2934F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(114, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1815F, -8.9949F, 0.3425F, -0.1055F, 0.357F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(114, 48).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1815F, -8.9949F, 0.2606F, -0.248F, 0.8138F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(20, 13).addBox(3.0439F, -2.4213F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1815F, -8.9949F, 0.1302F, -0.3342F, 1.2608F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 17).addBox(3.0439F, -2.4213F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6815F, -6.9949F, 0.1154F, -0.3022F, 1.2654F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(114, 71).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6815F, -6.9949F, 0.2334F, -0.2251F, 0.8202F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(66, 114).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6815F, -6.9949F, 0.3085F, -0.0967F, 0.3604F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(114, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1815F, -5.0949F, 0.293F, -0.0879F, 0.3443F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(114, 73).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1815F, -5.0949F, 0.2232F, -0.2104F, 0.8049F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 22).addBox(3.0439F, -2.4213F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1815F, -5.0949F, 0.1127F, -0.2846F, 1.2487F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(114, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5185F, -3.1949F, 0.3257F, -0.1005F, 0.3413F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(95, 114).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5185F, -3.1949F, 0.2474F, -0.2362F, 0.7995F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(20, 0).addBox(3.0439F, -2.4213F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5185F, -3.1949F, 0.1234F, -0.318F, 1.2456F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(107, 114).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4185F, -0.6949F, 0.2212F, -0.2124F, 0.8403F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 2).addBox(3.0439F, -2.4213F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4185F, -0.6949F, 0.11F, -0.2855F, 1.2844F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(114, 101).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4185F, -0.6949F, 0.2921F, -0.0905F, 0.3794F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 88).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, 1.739F, -10.9195F, 0.2315F, -0.0906F, -0.5245F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(99, 65).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, 0.739F, -9.1195F, 0.2315F, -0.0906F, -0.5245F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(109, 58).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, 0.2214F, -7.1876F, 0.2306F, -0.0056F, -0.5045F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(111, 79).addBox(-0.5F, -0.4F, -4.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 85).addBox(-0.5F, -0.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 31).addBox(-0.5F, -0.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2936F, -0.9678F, 0.2323F, 0.1218F, -0.4745F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(38, 49).addBox(-1.0F, -1.0F, -11.6F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8F, 12.8F, -8.4F, 0.5164F, -0.0048F, -0.3447F));

		PartDefinition cube_r174 = leftArm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 103).addBox(-2.0F, -0.01F, -1.9515F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5611F, 8.8871F, 2.2344F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftArm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(38, 96).addBox(-2.0F, -2.7318F, -1.4898F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5611F, 5.8871F, 0.8344F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftArm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(23, 103).addBox(-0.4F, -4.0784F, -0.4587F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8331F, 2.2692F, -0.858F, -0.2469F, -0.4961F, -0.0094F));

		PartDefinition cube_r177 = leftArm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(13, 71).addBox(-0.3F, -1.1F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7877F, 4.7438F, -0.964F, 0.4855F, -0.4728F, 0.0857F));

		PartDefinition cube_r178 = leftArm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(107, 19).addBox(-2.0F, -3.2307F, -2.1339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5611F, 1.3871F, 0.3344F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftArm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(14, 102).addBox(-2.0F, -3.3196F, -1.6747F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5611F, 2.2871F, 0.3344F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0058F, -2.3134F, 0.9749F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(78, 99).addBox(-0.5058F, 0.6866F, -0.9251F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0611F, 12.3871F, 2.0344F, -0.6564F, 0.5468F, -0.0034F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(92, 0).addBox(-0.7786F, 1.8824F, -1.9996F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(91, 51).addBox(-1.7786F, -0.1176F, -1.9996F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7942F, 10.8866F, 0.9749F, 0.2646F, 0.265F, 0.467F));

		PartDefinition cube_r180 = leftArm3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 98).addBox(-0.5F, -1.0903F, -3.9608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2786F, 0.8824F, -1.8996F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftArm3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 15).addBox(-0.5F, -0.2903F, -3.9608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2786F, 0.8824F, -1.8996F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftArm3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(99, 34).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0638F, 5.7263F, 0.0004F, 0.0F, 0.0F, -0.3927F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(9, 19).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2492F, 0.1824F, 1.8494F, 1.1695F, -0.2013F, 0.0846F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, 12.8F, -8.4F, 0.0433F, -0.0167F, 0.2148F));

		PartDefinition cube_r183 = rightArm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(103, 27).addBox(0.0F, -0.01F, -1.9515F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5611F, 8.8871F, 2.2344F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightArm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(42, 65).addBox(0.0F, -2.7318F, -1.4898F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5611F, 5.8871F, 0.8344F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightArm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(83, 99).addBox(-0.6F, -4.0784F, -0.4587F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8331F, 2.2692F, -0.858F, -0.2469F, 0.4961F, 0.0094F));

		PartDefinition cube_r186 = rightArm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(71, 11).addBox(-0.7F, -1.1F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7877F, 4.7438F, -0.964F, 0.4855F, 0.4728F, -0.0857F));

		PartDefinition cube_r187 = rightArm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(46, 106).addBox(0.0F, -3.2307F, -2.1339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5611F, 1.3871F, 0.3344F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightArm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(58, 101).addBox(0.0F, -3.3196F, -1.6747F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5611F, 2.2871F, 0.3344F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(43, 78).addBox(-0.9942F, -2.3134F, 0.9749F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(9, 98).addBox(-0.4942F, 0.6866F, -0.9251F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0611F, 12.3871F, 2.0344F, -0.7722F, -0.4388F, 0.1865F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(15, 58).addBox(-0.2214F, 1.8824F, -1.9996F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(36, 49).addBox(-0.2214F, -0.1176F, -1.9996F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7942F, 10.8866F, 0.9749F, 0.4152F, -0.2868F, -0.3792F));

		PartDefinition cube_r189 = rightArm3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 21).addBox(-0.5F, -1.0903F, -3.9608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2786F, 0.8824F, -1.8996F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 9).addBox(-0.5F, -0.2903F, -3.9608F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2786F, 0.8824F, -1.8996F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightArm3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(98, 91).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0638F, 5.7263F, 0.0004F, 0.0F, 0.0F, 0.3927F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2492F, 0.1824F, 1.8494F, 1.0208F, 0.7493F, -0.3956F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r192 = neck4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(22, 116).addBox(0.0F, -4.5736F, 6.0238F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 80).addBox(0.0F, -3.7736F, 4.0238F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 91).addBox(0.0F, -3.8736F, 2.0238F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 69).addBox(-1.0F, -1.8736F, 0.0238F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -8.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1185F, -5.8949F, 0.2222F, 0.5732F, -1.1871F));

		PartDefinition cube_r194 = neck4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(112, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1185F, -5.8949F, 0.4651F, 0.4106F, -0.6831F));

		PartDefinition cube_r195 = neck4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2185F, -3.5949F, 0.2222F, 0.5732F, -1.1871F));

		PartDefinition cube_r196 = neck4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2185F, -3.5949F, 0.4651F, 0.4106F, -0.6831F));

		PartDefinition cube_r197 = neck4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(113, 109).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4185F, -1.5949F, 0.343F, 0.3296F, -0.64F));

		PartDefinition cube_r198 = neck4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 36).mirror().addBox(-5.782F, -0.908F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4185F, -1.5949F, 0.1521F, 0.4477F, -1.1342F));

		PartDefinition cube_r199 = neck4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(112, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1185F, -5.8949F, 0.4651F, -0.4106F, 0.6831F));

		PartDefinition cube_r200 = neck4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(105, 93).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1185F, -5.8949F, 0.2222F, -0.5732F, 1.1871F));

		PartDefinition cube_r201 = neck4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(112, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2185F, -3.5949F, 0.4651F, -0.4106F, 0.6831F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(112, 88).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2185F, -3.5949F, 0.2222F, -0.5732F, 1.1871F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(40, 36).addBox(1.782F, -0.908F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4185F, -1.5949F, 0.1521F, -0.4477F, 1.1342F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(113, 109).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4185F, -1.5949F, 0.343F, -0.3296F, 0.64F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -7.8F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(74, 88).addBox(0.0F, -4.0F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 0).addBox(0.0F, -3.7F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 9).addBox(0.0F, -3.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1F, -6.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 21).addBox(0.0F, -1.2729F, -1.1579F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.2F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1185F, -6.3949F, 0.2472F, 0.4657F, -1.0715F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(36, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5185F, -4.3949F, 0.2256F, 0.476F, -1.1191F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(16, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0185F, -2.3949F, 0.2681F, 0.4546F, -1.0244F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(91, 18).mirror().addBox(-3.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8185F, -0.3949F, 0.1852F, 0.492F, -1.2059F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(98, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8185F, -0.3949F, 0.3929F, 0.3546F, -0.71F));

		PartDefinition cube_r212 = neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 80).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1185F, -6.3949F, 0.2472F, -0.4657F, 1.0715F));

		PartDefinition cube_r213 = neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(36, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5185F, -4.3949F, 0.2256F, -0.476F, 1.1191F));

		PartDefinition cube_r214 = neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(16, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0185F, -2.3949F, 0.2681F, -0.4546F, 1.0244F));

		PartDefinition cube_r215 = neck3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(98, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8185F, -0.3949F, 0.3929F, -0.3546F, 0.71F));

		PartDefinition cube_r216 = neck3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(91, 18).addBox(1.782F, -0.908F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8185F, -0.3949F, 0.1852F, -0.492F, 1.2059F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -6.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(74, 98).addBox(0.0F, -1.4089F, 7.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 26).addBox(0.0F, -1.4089F, 5.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 0).addBox(0.0F, -1.4089F, 3.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 51).addBox(0.0F, -1.4089F, 1.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 17).addBox(-1.0F, -0.1089F, 0.0071F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, -7.5F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.0185F, -6.9949F, 0.2529F, 0.508F, -1.0592F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.1185F, -5.4949F, 0.2472F, 0.4657F, -1.0715F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8185F, -3.7949F, 0.2472F, 0.4657F, -1.0715F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5185F, -1.9949F, 0.2472F, 0.4657F, -1.0715F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.0185F, -6.9949F, 0.2529F, -0.508F, 1.0592F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(77, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.1185F, -5.4949F, 0.2472F, -0.4657F, 1.0715F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(77, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8185F, -3.7949F, 0.2472F, -0.4657F, 1.0715F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(7, 80).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5185F, -1.9949F, 0.2472F, -0.4657F, 1.0715F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.6F, -7.5F, 0.2182F, -0.4363F, 0.0F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(22, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1185F, -1.4949F, 0.2308F, 0.8251F, -1.0731F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(22, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1185F, -1.4949F, 0.2308F, -0.8251F, 1.0731F));

		PartDefinition cube_r228 = neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(47, 100).addBox(-1.0F, -0.9934F, -3.1212F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(30, 4).addBox(0.0F, -2.4934F, -2.1212F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(22, 112).addBox(0.0F, -0.0331F, 0.1068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.0F, 1.0F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, 0.015F, -0.0553F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3F, -0.3F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, 0.0357F, -0.1138F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -2.9F, -2.2F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(100, 97).mirror().addBox(0.0F, -1.8626F, 0.0552F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.4F, -6.8F, 0.0897F, -0.5044F, -0.0435F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(112, 38).mirror().addBox(1.18F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 38).addBox(2.22F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 3.2692F, -11.0827F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(0.0F, 0.0321F, -1.9981F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -0.1685F, -6.2079F, 0.7488F, -0.7622F, -0.5705F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-2.6F, -0.6F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(106, 34).addBox(0.6F, -0.6F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3315F, -5.8079F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(109, 49).mirror().addBox(-2.01F, 0.6562F, -0.5521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 88).mirror().addBox(-2.44F, 0.6562F, -0.5521F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(105, 71).mirror().addBox(-2.65F, 0.6562F, -0.5521F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(105, 71).addBox(1.65F, 0.6562F, -0.5521F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(105, 88).addBox(1.44F, 0.6562F, -0.5521F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(109, 49).addBox(2.01F, 0.6562F, -0.5521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 54).addBox(-2.0F, 0.0562F, 0.0479F, 5.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -5.6F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(39, 105).mirror().addBox(-0.32F, -1.6F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 105).addBox(3.72F, -1.6F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -0.3398F, -1.9577F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(94, 76).addBox(-2.0F, 0.0321F, -1.9981F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -0.1685F, -6.2079F, 0.7488F, 0.7622F, 0.5705F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(87, 80).addBox(-2.5F, 0.0562F, 0.0479F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -5.6F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 49).addBox(-1.0F, 0.0463F, 0.0317F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 7.5F, -11.5F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(37, 58).addBox(-1.0F, 0.0075F, -0.9971F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 6.9F, -12.7F, 1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(103, 40).addBox(-1.0F, 0.2154F, -1.9876F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(103, 40).addBox(-1.0F, 0.0154F, -1.9876F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.9F, -12.5F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(107, 61).addBox(-1.0F, -0.0125F, -1.0168F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.0F, -12.0F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(106, 13).addBox(-1.0F, -0.0514F, -1.9373F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -10.8F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(106, 44).addBox(-1.0F, -0.0616F, -2.0182F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.3F, -9.1F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 80).addBox(-1.0F, -0.188F, 0.3247F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.8F, -10.2F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 10).addBox(-1.0F, -2.0094F, -5.0351F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.5F, -6.2F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(100, 97).addBox(-2.0F, -1.8626F, 0.0552F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4F, -6.8F, 0.0897F, 0.5044F, 0.0435F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 95).addBox(-1.0F, 0.0562F, -3.9521F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -5.6F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(90, 70).addBox(-3.0F, -2.8574F, -0.1417F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3514F, -2.3775F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(82, 63).addBox(-3.0F, -2.7641F, 0.3472F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.3514F, -2.7775F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(28, 42).addBox(1.0F, -0.4126F, -0.0522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8F, -0.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(83, 20).addBox(-3.0F, -0.0615F, -0.0108F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1F, -1.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(109, 101).addBox(0.0F, -0.0515F, -2.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 101).mirror().addBox(-3.8F, -0.0515F, -2.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 4.8F, 0.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(109, 54).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(109, 54).addBox(2.8F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.8F, 0.9485F, -0.0262F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(23, 95).mirror().addBox(-1.0F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(23, 95).addBox(2.8F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.8F, -0.0515F, -1.0262F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-1.0F, -0.721F, -0.0648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 71).addBox(2.8F, -0.721F, -0.0648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, -3.0408F, -2.3045F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(55, 93).mirror().addBox(-1.0F, -0.3F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(55, 93).addBox(2.8F, -0.3F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.8F, -1.6408F, -2.3045F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(49, 26).mirror().addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(49, 26).addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4F, 0.9205F, -10.3843F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(45, 94).mirror().addBox(-1.0F, -1.0076F, -0.0936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(45, 94).addBox(0.0F, -1.0076F, -0.0936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, 2.7485F, -11.1262F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-1.0F, -1.0241F, -1.986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(26, 76).addBox(0.0F, -1.0241F, -1.986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 2.1485F, -9.2262F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(108, 95).mirror().addBox(-1.0F, 0.0207F, -2.0247F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 95).addBox(0.0F, 0.0207F, -2.0247F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.3515F, -7.9262F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(40, 4).mirror().addBox(-0.8F, -0.7383F, -2.1446F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 4).addBox(0.8F, -0.7383F, -2.1446F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.4515F, -7.7262F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(103, 65).mirror().addBox(-1.0F, -0.0383F, -2.8446F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(103, 65).addBox(0.0F, -0.0383F, -2.8446F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, -0.4515F, -7.7262F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(0.1F, -1.6759F, -0.3686F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.4485F, -7.4262F, 0.1745F, -0.3491F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-0.1F, -0.9673F, 0.0851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.4485F, -7.4262F, 0.2269F, -0.3491F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(60, 94).mirror().addBox(-0.1F, -0.8133F, -0.2105F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.4485F, -7.4262F, 0.1396F, -0.3491F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-0.8F, -1.5F, -1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 49).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 58).addBox(3.6F, -1.5F, -1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 49).addBox(2.8F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, -0.3768F, -2.9364F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-1.0F, -1.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(36, 76).addBox(2.8F, -1.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.8F, 0.8485F, -2.0262F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, 0.0143F, -1.1896F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(112, 0).addBox(-1.0F, 0.1143F, -0.7896F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, 1.1485F, -12.5262F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(112, 27).addBox(-1.0F, -1.0678F, -0.0115F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 2.2485F, -11.9262F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(66, 71).addBox(-0.1F, -1.6759F, -0.3686F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4485F, -7.4262F, 0.1745F, 0.3491F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(100, 76).addBox(-0.9F, -0.9673F, 0.0851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4485F, -7.4262F, 0.2269F, 0.3491F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(60, 94).addBox(-0.9F, -0.8133F, -0.2105F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 0.4485F, -7.4262F, 0.1396F, 0.3491F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -1.6F, -0.1F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(115, 66).addBox(1.0F, -0.6F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 64).addBox(1.0F, -0.6F, 2.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 60).addBox(1.0F, -0.6F, 4.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 57).addBox(1.0F, -0.6F, 6.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 45).addBox(0.9F, -0.6F, 8.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 68).addBox(0.8F, -0.6F, 10.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 66).mirror().addBox(-3.0F, -0.6F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 64).mirror().addBox(-3.0F, -0.6F, 2.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 60).mirror().addBox(-3.0F, -0.6F, 4.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 57).mirror().addBox(-3.0F, -0.6F, 6.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 45).mirror().addBox(-2.9F, -0.6F, 8.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 68).mirror().addBox(-2.8F, -0.6F, 10.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 7.8F, -0.2322F, 0.2125F, -0.0498F));

		PartDefinition cube_r274 = tail.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 113).addBox(0.0F, -6.2F, 10.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 110).addBox(0.0F, -6.1F, 8.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 111).addBox(0.0F, -6.0F, 6.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 110).addBox(0.0F, -5.9F, 4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 111).addBox(0.0F, -5.7F, 2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 111).addBox(0.0F, -5.4F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r275 = tail.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(49, 0).addBox(0.0F, 2.5528F, 2.0644F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 110).addBox(0.0F, 1.3528F, 0.0644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7701F, 8.1282F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r276 = tail.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(54, 65).addBox(0.0F, 0.5176F, -0.8026F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7701F, 6.2282F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r277 = tail.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(13, 110).addBox(0.0F, -0.1826F, 0.0463F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 2.5F, 0.925F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.6F, -0.2F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.005F))
				.texOffs(44, 115).addBox(0.6F, -0.6F, -0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 36).addBox(0.4F, -0.6F, 1.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 60).addBox(1.0F, -0.6F, 3.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 22).addBox(0.8F, -0.6F, 5.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 65).addBox(0.6F, -0.6F, 7.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 115).mirror().addBox(-2.6F, -0.6F, -0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 36).mirror().addBox(-2.4F, -0.6F, 1.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 60).mirror().addBox(-2.0F, -0.6F, 3.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 22).mirror().addBox(-1.8F, -0.6F, 5.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 65).mirror().addBox(-1.6F, -0.6F, 7.8F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, -0.0529F, 0.085F, -0.0091F));

		PartDefinition cube_r278 = tail2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(68, 40).addBox(0.0F, -3.5797F, 1.0044F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 12.9F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r279 = tail2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 32).addBox(0.0F, -4.4601F, 8.1148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 85).addBox(0.0F, -4.4601F, 6.1148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 32).addBox(0.0F, -4.4601F, 4.1148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 112).addBox(0.0F, -4.4601F, 2.1148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 113).addBox(0.0F, -4.4601F, 0.1148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 3.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r280 = tail2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(58, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9351F, 13.7198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r281 = tail2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(15, 55).addBox(0.0F, 10.1528F, 10.0644F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 65).addBox(0.0F, 8.7528F, 8.0644F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 109).addBox(0.0F, 6.1528F, 6.0644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 109).addBox(0.0F, 4.7528F, 4.0644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7701F, -4.8718F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r282 = tail2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(41, 113).addBox(0.0F, -4.8F, 2.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 113).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 4).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 14.9F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition cube_r283 = tail3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(85, 42).addBox(0.0F, -1.8839F, 0.0155F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 12.9F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r284 = tail3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(54, 115).addBox(0.0F, -1.7886F, -0.8924F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 11.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r285 = tail3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(57, 115).addBox(0.0F, -1.9316F, -0.6226F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 9.6F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r286 = tail3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 2).addBox(0.0F, 7.4F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 116).addBox(0.0F, 5.3F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 41).addBox(0.0F, 4.0F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 58).addBox(0.0F, 2.9F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 49).addBox(0.0F, 0.9F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 49).addBox(0.0F, -0.2F, 1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6351F, -1.1802F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r287 = tail3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(101, 115).addBox(0.0F, -4.8956F, 5.6033F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 115).addBox(0.0F, -4.2F, 3.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 116).addBox(0.0F, -3.7F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 0).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.9F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.9F, 0.1519F, -0.2157F, -0.0328F));

		PartDefinition cube_r288 = tail4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(46, 58).addBox(0.0F, -3.6612F, 7.2808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 58).addBox(0.0F, -3.1612F, 5.4808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 2).addBox(0.0F, -2.7536F, 3.6582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 82).addBox(0.0F, -2.2997F, 1.7469F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 82).addBox(0.0F, -1.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r289 = tail4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, 4.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 38).addBox(0.0F, 3.7F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(0.0F, 2.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 55).addBox(0.0F, 1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 71).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0521F, 0.6525F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(19, 42).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 13.9F, -0.0715F, -0.2176F, 0.0155F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.0F, -0.0536F, -0.2179F, 0.0116F));

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