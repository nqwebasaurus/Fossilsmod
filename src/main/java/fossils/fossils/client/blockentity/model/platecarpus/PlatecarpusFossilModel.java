package fossils.fossils.client.blockentity.model.platecarpus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatecarpusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hips;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PlatecarpusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.frontleftflipper = this.chest.getChild("frontleftflipper");
		this.frontrightflipper = this.chest.getChild("frontrightflipper");
		this.body = this.chest.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hips = this.body3.getChild("hips");
		this.backleftflipper = this.hips.getChild("backleftflipper");
		this.backrightflipper = this.hips.getChild("backrightflipper");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -38.15F, -13.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 52).addBox(0.0F, -1.5599F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-2.9936F, 0.2032F, -0.9355F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.6312F, 2.3152F, 0.048F, -0.3404F, 1.0323F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-4.386F, -0.35F, -0.1259F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 7.4312F, 7.7152F, 0.373F, 0.393F, 0.8207F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-3.9916F, -0.0818F, -0.1918F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 7.4312F, 6.8152F, 0.311F, 0.2305F, 0.6435F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(-4.2039F, -0.2712F, -0.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 7.6312F, 5.7152F, 0.2715F, 0.1278F, 0.3721F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-3.9604F, 0.0516F, -0.5014F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 7.5312F, 4.3152F, 0.2812F, 0.1113F, 0.3927F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.6312F, 2.9152F, 0.3455F, -0.0106F, 0.6544F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 33).mirror().addBox(-0.0267F, -0.4441F, 0.1593F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.5701F, 3.2146F, 0.0183F, 0.2967F, 0.0053F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-2.0F, 0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 6).addBox(1.0F, 0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(39, 37).addBox(-1.0F, 0.6F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.3234F, -0.3566F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-2.0F, -0.6219F, -0.0075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.2934F, -2.4832F, -0.165F, 0.735F, -0.1112F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.1331F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 6.9657F, -0.1604F, -2.6656F, -1.1821F, -3.0195F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-0.8031F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 6.9657F, -0.1604F, -0.2982F, -0.9386F, 0.8103F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(-0.4783F, -0.5F, -1.3019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 6.9657F, -0.1604F, -0.9336F, -1.353F, 1.4893F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-0.5F, 0.7898F, 0.0408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 0.0698F, -0.1309F, 0.0F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-0.5F, -0.3841F, -0.4029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 73).mirror().addBox(-0.5F, -1.3841F, 0.5971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 3.0892F, -0.1309F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.5F, -0.0503F, -0.3381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 2.6878F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.5F, -0.4919F, 0.2875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 1.501F, -0.1309F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.5F, 0.4089F, -0.1531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 2.3736F, -0.1309F, 0.0F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-0.5F, 0.2189F, -1.5165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 47).mirror().addBox(-0.5F, -0.6656F, -0.3948F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 4.2758F, -0.7231F, 0.6807F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(-5.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.0363F, 0.5633F, -1.4054F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.3426F, 0.4577F, -0.7943F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 19).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8249F, -3.4059F, 0.4981F, 0.2393F, -0.3484F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.3485F, 0.182F, -0.3012F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.0097F, 0.408F, -1.3393F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.227F, 0.3421F, -0.7609F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(86, 19).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.4981F, -0.2393F, 0.3484F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 35).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.3426F, -0.4577F, 0.7943F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 47).addBox(2.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8249F, -3.4059F, 0.0363F, -0.5633F, 1.4054F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 86).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.3485F, -0.182F, 0.3012F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 8).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.0097F, -0.408F, 1.3393F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 27).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.227F, -0.3421F, 0.7609F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 48).addBox(0.0F, -1.2286F, 0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 59).addBox(-0.5F, 0.2189F, -1.5165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 0.0873F, 0.1309F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 58).addBox(-0.5F, -0.4919F, 0.2875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 1.501F, 0.1309F, 0.0F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 18).addBox(-0.5F, -0.3841F, -0.4029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 73).addBox(-0.5F, -1.3841F, 0.5971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 3.0892F, 0.1309F, 0.0F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(59, 58).addBox(-0.5F, -0.0503F, -0.3381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 2.6878F, 0.1309F, 0.0F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(59, 48).addBox(-0.5F, 0.4089F, -0.1531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 2.3736F, 0.1309F, 0.0F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 73).addBox(-0.5F, 0.7898F, 0.0408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 0.0698F, 0.1309F, 0.0F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -0.6656F, -0.3948F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7F, 4.2758F, -0.7231F, 0.6807F, 0.1309F, 0.0F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 66).addBox(-0.1969F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4107F, 6.9657F, -0.1604F, -0.2982F, 0.9386F, -0.8103F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 67).addBox(-0.8669F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4107F, 6.9657F, -0.1604F, -2.6656F, 1.1821F, 3.0195F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 55).addBox(-0.5217F, -0.5F, -1.3019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4107F, 6.9657F, -0.1604F, -0.9336F, 1.353F, -1.4893F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 51).addBox(-1.0F, -0.6219F, -0.0075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.2934F, -2.4832F, -0.165F, -0.735F, 0.1112F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(26, 33).addBox(-0.9733F, -0.4441F, 0.1593F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.0F, 7.5701F, 3.2146F, 0.0183F, -0.2967F, -0.0053F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 67).addBox(-0.5F, -1.0665F, 3.9819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(56, 10).addBox(-1.0F, -1.0665F, 1.9819F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(47, 18).addBox(-2.0F, -1.0665F, -0.0181F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.2234F, 1.4434F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 41).addBox(-0.614F, -0.35F, -0.1259F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 7.4312F, 7.7152F, 0.373F, -0.393F, -0.8207F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0084F, -0.0818F, -0.1918F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 7.4312F, 6.8152F, 0.311F, -0.2305F, -0.6435F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(52, 37).addBox(-0.7961F, -0.2712F, -0.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 7.6312F, 5.7152F, 0.2715F, -0.1278F, -0.3721F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 0).addBox(-0.0396F, 0.0516F, -0.5014F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 7.5312F, 4.3152F, 0.2812F, -0.1113F, -0.3927F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 0).addBox(-0.0064F, 0.2032F, -0.9355F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.6312F, 2.3152F, 0.048F, 0.3404F, -1.0323F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 60).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.6312F, 2.9152F, 0.3455F, 0.0106F, -0.6544F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.8F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create().texOffs(73, 55).addBox(0.6838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(14, 67).addBox(1.5838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(67, 18).addBox(-0.0162F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(15, 40).addBox(4.5838F, -0.0902F, -1.6511F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9162F, 5.7061F, 1.0617F, 0.1888F, -0.3713F, 0.5037F));

		PartDefinition cube_r54 = frontleftflipper.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(30, 18).addBox(0.0008F, 0.0341F, -0.2164F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5838F, -0.0902F, -1.5511F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r55 = frontleftflipper.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 70).addBox(-0.2F, 0.0241F, -1.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7374F, -0.0902F, 3.4194F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r56 = frontleftflipper.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 66).addBox(0.4F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0838F, -0.0902F, 2.8489F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r57 = frontleftflipper.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 82).addBox(-0.2F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(82, 38).addBox(-0.8F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6838F, -0.0902F, 0.4489F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r58 = frontleftflipper.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 82).addBox(0.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(82, 41).addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 12).addBox(-0.9F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6838F, -0.0902F, -1.0511F, 0.0F, 0.2443F, 0.0F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create().texOffs(57, 73).addBox(-1.6838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(67, 62).addBox(-2.5838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 68).addBox(-0.9838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 43).addBox(-8.5838F, -0.0902F, -1.6511F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9162F, 5.7061F, 1.0617F, -0.1725F, 0.2483F, -0.5263F));

		PartDefinition cube_r59 = frontrightflipper.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(30, 22).addBox(-5.0008F, 0.0341F, -0.2164F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5838F, -0.0902F, -1.5511F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r60 = frontrightflipper.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 71).addBox(-0.8F, 0.0241F, -1.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7374F, -0.0902F, 3.4194F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r61 = frontrightflipper.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 71).addBox(-1.4F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0838F, -0.0902F, 2.8489F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r62 = frontrightflipper.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 82).addBox(-0.8F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(82, 64).addBox(-0.2F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.6838F, -0.0902F, 0.4489F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r63 = frontrightflipper.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 82).addBox(-1.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(55, 82).addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 82).addBox(-0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.6838F, -0.0902F, -1.0511F, 0.0F, -0.2443F, 0.0F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(45, 6).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.186F, 0.1716F, 0.0321F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 4).addBox(0.0F, -1.5715F, -0.0741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, 0.0261F, 0.0427F, -0.2679F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, -0.0018F, 0.0736F, -0.739F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, -0.0395F, 0.0622F, -1.2812F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, -0.0372F, 0.0795F, -1.2287F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 2).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, 0.0091F, 0.0873F, -0.6857F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 56).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, 0.042F, 0.0499F, -0.2148F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(43, 30).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, -0.0302F, 0.1314F, -1.2279F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.0422F, 0.1281F, -0.6822F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.0899F, 0.0714F, -0.2119F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 24).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, -0.0292F, 0.1846F, -1.2629F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.0711F, 0.173F, -0.713F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.1387F, 0.084F, -0.2523F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 49).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, -0.0395F, -0.0622F, 1.2812F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 4).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, -0.0018F, -0.0736F, 0.739F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 85).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, 0.0261F, -0.0427F, 0.2679F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 56).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, 0.042F, -0.0499F, 0.2148F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(72, 2).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, 0.0091F, -0.0873F, 0.6857F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 22).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, -0.0372F, -0.0795F, 1.2287F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(84, 35).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.0899F, -0.0714F, 0.2119F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(71, 53).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.0422F, -0.1281F, 0.6822F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 30).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, -0.0302F, -0.1314F, 1.2279F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(25, 58).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.1387F, -0.084F, 0.2523F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 51).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.0711F, -0.173F, 0.713F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 24).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, -0.0292F, -0.1846F, 1.2629F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 84).addBox(0.0F, -1.7001F, -0.0616F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3087F, 5.9004F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 8).addBox(0.0F, -1.7023F, 0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5087F, 3.8004F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(45, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2784F, 7.7024F, -0.3678F, 0.0815F, -0.0313F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(18, 84).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 15).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(19, 72).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 4.5917F, 0.1554F, 0.2628F, -0.9743F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 4.5917F, 0.2506F, 0.1415F, -0.509F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(67, 85).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, -0.006F, 0.3043F, -1.4321F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, 0.1554F, 0.2628F, -0.8696F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(62, 85).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, 0.2506F, 0.1415F, -0.4042F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(56, 6).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, -0.011F, 0.2697F, -1.3288F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, 0.1322F, 0.2361F, -0.7706F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, 0.2183F, 0.1277F, -0.3039F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 67).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 4.5917F, 0.2506F, -0.1415F, 0.509F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(19, 72).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 4.5917F, 0.1554F, -0.2628F, 0.9743F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 85).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, 0.2506F, -0.1415F, 0.4042F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(72, 12).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, 0.1554F, -0.2628F, 0.8696F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 85).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, -0.006F, -0.3043F, 1.4321F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(85, 58).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, 0.2183F, -0.1277F, 0.3039F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(72, 10).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, 0.1322F, -0.2361F, 0.7706F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 6).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, -0.011F, -0.2697F, 1.3288F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, -0.1848F, 0.1287F, -0.024F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 84).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(24, 84).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(84, 23).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 4.5917F, 0.0867F, 0.1822F, -1.1465F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 4.5917F, 0.1539F, 0.0998F, -0.6777F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 2.5917F, 0.0867F, 0.1822F, -1.1116F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 2.5917F, 0.1539F, 0.0998F, -0.6428F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.1207F, 0.2227F, -1.0524F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.2021F, 0.1208F, -0.5851F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 80).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 4.5917F, 0.1539F, -0.0998F, 0.6777F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(85, 82).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 4.5917F, 0.0867F, -0.1822F, 1.1465F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 85).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 2.5917F, 0.1539F, -0.0998F, 0.6428F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 78).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 2.5917F, 0.0867F, -0.1822F, 1.1116F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 69).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.2021F, -0.1208F, 0.5851F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(72, 25).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.1207F, -0.2227F, 1.0524F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r127 = hips.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(36, 84).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r128 = hips.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(33, 84).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r129 = hips.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 84).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r130 = hips.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.5F, -0.5F, -0.4401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9481F, 2.917F, 3.9777F, 0.9343F, -0.3207F, 0.3467F));

		PartDefinition cube_r131 = hips.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(75, 58).mirror().addBox(-0.6F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, 2.4658F, 3.9852F, 0.9025F, -0.6186F, 0.5765F));

		PartDefinition cube_r132 = hips.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(39, 75).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4786F, 2.8014F, 3.528F, 1.6013F, -0.8766F, -0.4005F));

		PartDefinition cube_r133 = hips.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-1.3965F, -0.8278F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(75, 32).mirror().addBox(-0.7965F, -0.8278F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.2379F, 4.0562F, 1.0223F, -0.7237F, 0.3845F));

		PartDefinition cube_r134 = hips.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-1.8F, -0.7172F, -0.2238F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.5378F, 4.5562F, 1.1328F, -0.3996F, 0.1802F));

		PartDefinition cube_r135 = hips.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6936F, 3.0362F, 2.5597F, 0.2341F, 0.5429F, 0.6221F));

		PartDefinition cube_r136 = hips.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-2.8F, -0.7923F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(25, 81).mirror().addBox(-2.4F, -0.7923F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 20).mirror().addBox(-2.4F, -0.7923F, -0.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(40, 70).mirror().addBox(-1.8F, -0.7923F, -0.2325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.4F, 2.6F, 0.2011F, -0.1058F, 0.478F));

		PartDefinition cube_r137 = hips.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.1785F, -0.7474F, -0.7923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.2106F, 3.4262F, 3.2576F, 0.2149F, 0.3728F, 0.5789F));

		PartDefinition cube_r138 = hips.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-0.2273F, 0.3706F, -0.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 42).mirror().addBox(-0.2273F, -0.2294F, -0.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.9378F, 1.5099F, 2.5883F, -0.8028F, -0.2651F, 0.3281F));

		PartDefinition cube_r139 = hips.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 53).mirror().addBox(-0.6F, -1.1F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.0F, 0.3F, -0.6806F, -0.2651F, 0.3281F));

		PartDefinition cube_r140 = hips.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-2.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1037F, 3.4391F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r141 = hips.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.0739F, 0.0642F, -0.7366F));

		PartDefinition cube_r142 = hips.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 86).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.0739F, -0.0642F, 0.7366F));

		PartDefinition cube_r143 = hips.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(48, 49).addBox(0.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1037F, 3.4391F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r144 = hips.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 65).addBox(-0.7727F, 0.3706F, -0.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 42).addBox(-0.7727F, -0.2294F, -0.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.9378F, 1.5099F, 2.5883F, -0.8028F, 0.2651F, -0.3281F));

		PartDefinition cube_r145 = hips.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(55, 53).addBox(-0.4F, -1.1F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.0F, 0.3F, -0.6806F, 0.2651F, -0.3281F));

		PartDefinition cube_r146 = hips.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 81).addBox(-0.8215F, -0.7474F, -0.7923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2106F, 3.4262F, 3.2576F, 0.2149F, -0.3728F, -0.5789F));

		PartDefinition cube_r147 = hips.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 81).addBox(1.8F, -0.7923F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(25, 81).addBox(1.4F, -0.7923F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 20).addBox(1.4F, -0.7923F, -0.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(40, 70).addBox(-0.2F, -0.7923F, -0.2325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 4.4F, 2.6F, 0.2011F, 0.1058F, -0.478F));

		PartDefinition cube_r148 = hips.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(80, 81).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6936F, 3.0362F, 2.5597F, 0.2341F, -0.5429F, -0.6221F));

		PartDefinition cube_r149 = hips.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(75, 58).addBox(-0.4F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1987F, 2.4658F, 3.9852F, 0.9025F, 0.6186F, -0.5765F));

		PartDefinition cube_r150 = hips.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(39, 75).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4786F, 2.8014F, 3.528F, 1.6013F, 0.8766F, 0.4005F));

		PartDefinition cube_r151 = hips.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(34, 75).addBox(0.3965F, -0.8278F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(75, 32).addBox(-0.2035F, -0.8278F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3F, 3.2379F, 4.0562F, 1.0223F, 0.7237F, -0.3845F));

		PartDefinition cube_r152 = hips.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 69).addBox(-0.5F, -0.5F, -0.4401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9481F, 2.917F, 3.9777F, 0.9343F, 0.3207F, -0.3467F));

		PartDefinition cube_r153 = hips.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 14).addBox(-0.2F, -0.7172F, -0.2238F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 3.5378F, 4.5562F, 1.1328F, 0.3996F, -0.1802F));

		PartDefinition cube_r154 = hips.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 29).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 3.2379F, 4.5562F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r155 = hips.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.1F, 2.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition backleftflipper = hips.addOrReplaceChild("backleftflipper", CubeListBuilder.create().texOffs(70, 43).addBox(-0.2162F, -0.5902F, -0.8511F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(45, 58).addBox(0.7838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8697F, 2.5093F, 3.7074F, 0.2527F, -0.4946F, 0.2506F));

		PartDefinition cube_r156 = backleftflipper.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 26).addBox(-1.9F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3534F, -0.0561F, -0.8032F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r157 = backleftflipper.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(47, 70).addBox(-0.6088F, 0.0121F, -0.0841F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4397F, -0.0781F, 1.9018F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r158 = backleftflipper.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 68).addBox(-0.6319F, -0.0121F, -1.9129F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4397F, -0.0781F, 1.9018F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r159 = backleftflipper.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 39).addBox(-3.8425F, -0.0171F, -1.925F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4263F, -0.0731F, -0.6261F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r160 = backleftflipper.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(47, 73).addBox(-0.8F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8838F, -0.0902F, 0.4489F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r161 = backleftflipper.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(0, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 20).addBox(-0.9F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8838F, -0.0902F, -1.0511F, 0.0F, 0.2443F, 0.0F));

		PartDefinition backrightflipper = hips.addOrReplaceChild("backrightflipper", CubeListBuilder.create().texOffs(54, 70).addBox(-1.7838F, -0.5902F, -0.8511F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(52, 58).addBox(-1.7838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8697F, 2.5093F, 3.7074F, 0.2589F, 0.5368F, -0.238F));

		PartDefinition cube_r162 = backrightflipper.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 43).addBox(-2.1F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.3534F, -0.0561F, -0.8032F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r163 = backrightflipper.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(61, 70).addBox(-0.3912F, 0.0121F, -0.0841F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4397F, -0.0781F, 1.9018F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r164 = backrightflipper.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(69, 22).addBox(-0.3681F, -0.0121F, -1.9129F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4397F, -0.0781F, 1.9018F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r165 = backrightflipper.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(39, 33).addBox(-0.1575F, -0.0171F, -1.925F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4263F, -0.0731F, -0.6261F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r166 = backrightflipper.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 73).addBox(-0.2F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.8838F, -0.0902F, 0.4489F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r167 = backrightflipper.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 76).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(5, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 76).addBox(-0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8838F, -0.0902F, -1.0511F, 0.0F, -0.2443F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 8).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.007F, 4.9002F, -0.1489F, 0.0863F, -0.0129F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(80, 84).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(84, 74).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(84, 60).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 85).addBox(0.0F, -0.1036F, -0.1454F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 3.4F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(3, 88).addBox(0.0F, -0.5F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-1.7F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r174 = tail.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 0).addBox(-0.3F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.0718F, -0.127F, 0.0318F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(85, 31).addBox(-0.5F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(85, 27).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(83, 84).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(86, 46).addBox(0.0F, 4.4964F, 5.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 85).addBox(0.0F, 2.7964F, 3.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 85).addBox(0.0F, 1.0964F, 1.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -2.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-1.7F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(30, 6).addBox(-0.3F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0989F, -0.2736F, 0.2027F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(45, 85).addBox(-0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(42, 85).addBox(-0.5F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(86, 84).addBox(0.0F, 7.3964F, 9.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 50).addBox(0.0F, 5.9964F, 7.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -8.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(39, 85).addBox(-0.5F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-1.5F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(15, 16).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(11, 50).addBox(-0.7F, 0.1F, 3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 50).mirror().addBox(-2.3F, 0.1F, 3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0173F, -0.0431F, 0.0068F));

		PartDefinition cube_r187 = tail4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(87, 40).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(87, 37).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(87, 23).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(87, 8).addBox(0.0F, 0.0805F, 0.0404F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3F, 4.9F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(87, 4).addBox(0.0F, 10.3964F, 13.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 0).addBox(0.0F, 8.6964F, 11.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -14.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-1.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 1.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r193 = tail4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(40, 73).addBox(-0.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(45, 43).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, -0.3047F, -0.2421F, 0.2131F));

		PartDefinition cube_r194 = tail5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 87).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(57, 87).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(6, 88).addBox(0.0F, 0.4449F, -0.3279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3174F, 1.6985F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 32).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, -0.351F, -0.1426F, 0.1416F));

		PartDefinition cube_r197 = tail6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(48, 85).addBox(-0.5F, -1.2F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 60).addBox(-0.5F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(22, 50).addBox(0.0F, 0.1515F, -0.1485F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4533F, 3.9795F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(19, 88).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4533F, 2.7795F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(9, 88).addBox(0.0F, 2.045F, 1.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3466F, -2.2059F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(87, 63).addBox(-0.5F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 4.9034F, -0.2967F, -0.1137F, 0.1161F));

		PartDefinition cube_r202 = tail7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(66, 87).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(63, 87).addBox(-0.5F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(83, 44).addBox(0.0F, 3.1515F, 4.8515F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 83).addBox(0.0F, 1.8515F, 3.1515F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 54).addBox(0.0F, 0.6515F, 1.4515F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4791F, -0.9239F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 24).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(69, 87).addBox(-0.5F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.284F, -0.3753F, -0.0664F));

		PartDefinition cube_r205 = tail8.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(72, 87).addBox(-0.5F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail8.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(87, 71).addBox(-0.5F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail8.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(11, 47).addBox(0.0F, 2.4779F, 3.0192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 44).addBox(0.0F, 1.5779F, 1.4192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 59).addBox(0.0F, -0.1221F, -0.0808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4791F, 1.0761F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.2976F, -0.1016F, -0.2617F));

		PartDefinition cube_r208 = tail9.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(66, 56).addBox(-1.0F, -0.8181F, -0.0781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail9.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -0.4017F, 1.8686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 74).addBox(-0.5F, -0.4017F, -0.1314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail9.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -0.4F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, -0.1694F, 0.1722F, 0.1641F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(87, 15).addBox(0.5F, -0.7925F, -0.9738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -1.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(9, 54).addBox(0.0F, -0.6F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(86, 44).mirror().addBox(-3.2375F, -1.8712F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.0534F, 0.6494F, -1.6662F));

		PartDefinition cube_r214 = neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.4124F, 0.5195F, -1.0321F));

		PartDefinition cube_r215 = neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.5829F, 0.269F, -0.5976F));

		PartDefinition cube_r216 = neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(72, 37).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.4124F, -0.5195F, 1.0321F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(86, 21).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.5829F, -0.269F, 0.5976F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(86, 44).addBox(2.2375F, -1.8712F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.0534F, -0.6494F, 1.6662F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, 0.1387F, 0.2406F, 0.1047F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 87).addBox(0.5F, -0.7F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(87, 12).addBox(0.5F, -1.1F, -2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 32).addBox(0.0F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1F, -2.5F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -0.9F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(16, 88).addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1F, -2.5F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 39).addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1F, -0.9F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.3F, -0.2182F, 0.1309F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 45).addBox(-0.5F, -0.2865F, -0.3144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.8685F, -1.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(65, 10).addBox(-0.5F, -0.3193F, -0.3847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.7431F, -2.7817F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(30, 40).addBox(-1.5F, -0.1809F, -0.2569F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(65, 2).addBox(-0.5F, -0.1809F, -0.2569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.0F, -1.4431F, -4.3817F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(56, 2).addBox(-1.0F, -0.1723F, -0.1452F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -6.0817F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(63, 14).addBox(-1.0F, -0.1088F, -0.3332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.0431F, -7.5817F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3478F, -0.4013F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(30, 78).addBox(-0.4623F, -0.7532F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6719F, 1.4908F, -0.6358F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(15, 77).addBox(-0.6324F, -1.0408F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4229F, 1.1328F, 0.1274F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(70, 30).addBox(0.1232F, -1.1286F, -0.3556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9765F, 1.6789F, -0.3043F, 1.5711F, 0.8121F, 0.0467F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(35, 78).addBox(-0.7705F, -1.3639F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 54).addBox(-0.7705F, -1.7639F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4616F, 0.9597F, 0.172F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(79, 3).addBox(-0.3493F, -0.6832F, -0.6399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.4F, -0.5F, 1.6711F, 0.9597F, 0.172F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(78, 51).addBox(-0.4783F, -0.7133F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4839F, -0.2943F, -0.7598F, 1.4953F, 0.5946F, 0.0446F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, -0.4732F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.808F, -0.279F, -1.2763F, 1.6523F, 0.5946F, 0.0446F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 48).addBox(-0.525F, -0.6954F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.4839F, -0.2943F, -0.7598F, 1.4616F, 0.9597F, -0.0025F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(64, 76).addBox(-0.738F, -0.2855F, 2.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, 0.1374F, 0.1657F, 0.6652F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(59, 76).addBox(-0.738F, 0.7956F, 2.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, 0.4952F, 0.1657F, 0.6652F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, 1.6786F, 2.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 77).addBox(-1.0F, 1.3786F, 2.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, 0.4363F, 0.2094F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(69, 76).addBox(-1.0F, 2.9083F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(74, 76).addBox(-1.0F, 2.9083F, 0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, 0.9425F, 0.2094F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(25, 78).addBox(-1.0F, 2.1939F, 1.4054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, 0.5411F, 0.2094F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0F, -0.2669F, 2.4751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(20, 78).addBox(-1.0F, 0.1331F, 2.4751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.4F, 0.4F, -3.2F, -0.0873F, 0.2094F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(40, 55).addBox(-0.6008F, -4.7232F, -0.237F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.4F, 0.1F, 1.6496F, 0.2268F, 0.0014F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(65, 26).addBox(-0.8F, -0.4588F, -1.6326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6F, -0.0953F, -2.3804F, 0.2404F, -0.7534F, -0.1661F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(64, 52).addBox(-0.8962F, -2.433F, -1.9733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, 0.1316F, 0.1568F, 0.0254F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(35, 66).addBox(-0.8F, -0.3866F, -1.8683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 35).addBox(-0.8F, 0.0134F, -1.9089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.9F, 0.3047F, -5.5804F, 0.1745F, 0.192F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(79, 9).addBox(-0.5F, -0.8F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(79, 6).addBox(-0.5F, -0.5F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.7844F, 1.1115F, -3.2532F, -0.0524F, 0.2094F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(77, 72).addBox(-0.85F, -0.576F, 1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)), PartPose.offsetAndRotation(-0.9F, 2.2047F, -5.4804F, 0.1396F, 0.2094F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(14, 71).addBox(-0.8486F, -1.7902F, -2.4638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 66).addBox(-0.8286F, -1.0921F, -1.6447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 26).addBox(-0.8486F, -1.7902F, -1.7638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, -0.192F, 0.1745F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(28, 71).addBox(-0.8196F, -0.6321F, -1.6311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, -1.4405F, 0.1743F, -0.0092F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(40, 79).addBox(-0.8296F, -1.7036F, -1.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, -0.3491F, 0.1745F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(79, 35).addBox(-0.8338F, -1.8974F, -1.3119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, -0.0524F, 0.1745F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 26).addBox(-0.8328F, -2.1337F, -0.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, 0.8552F, 0.1745F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(79, 23).addBox(-0.8375F, -1.6846F, -1.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(79, 17).addBox(-0.8375F, -1.4846F, -1.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 79).addBox(-0.7706F, -1.4536F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 79).addBox(-0.9286F, -1.4536F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1258F, -3.592F, -0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(75, 79).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 79).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4277F, 1.9696F, -6.7231F, 0.0191F, 0.1912F, 0.0169F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 39).addBox(-0.8F, 0.646F, -1.7033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 0.3047F, -5.5804F, -0.0698F, 0.192F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(79, 61).addBox(-0.8F, 0.2812F, 0.8734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 79).addBox(-0.8F, 0.1812F, -0.0266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 31).addBox(-0.8F, -0.3188F, -0.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-1.4F, 1.0691F, -8.9278F, -0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(46, 53).addBox(-0.69F, -0.7212F, -0.1385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(63, 43).addBox(-0.8F, -0.6131F, -0.1385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 1.0691F, -8.9278F, 0.1396F, 0.1047F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(77, 14).addBox(0.65F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8F, 1.7491F, -2.7843F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(79, 75).addBox(-0.4997F, -0.2726F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, 0.6717F, -0.0088F, 0.0043F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(30, 26).addBox(-0.6275F, -0.6284F, -0.265F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7536F, 1.4585F, -8.8472F, -0.1218F, 0.0348F, 0.0058F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 57).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.6912F, 2.1836F, -4.3427F, 0.0962F, 0.157F, 0.0037F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(80, 32).addBox(-0.5F, -0.3478F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6911F, 1.7656F, -4.3522F, -0.1918F, 0.157F, 0.0037F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(80, 68).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.6136F, 2.2856F, -4.0288F, 0.0389F, 0.4933F, -0.1177F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(80, 29).addBox(-0.3623F, -0.6234F, -0.9286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5252F, 2.2133F, -3.5589F, -0.2578F, 0.4933F, -0.1177F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.5106F, 2.2554F, -3.7177F, 0.2231F, 0.1883F, -0.0374F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(15, 80).addBox(-0.4575F, -0.6234F, -0.6696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.5252F, 2.2133F, -3.5589F, -0.2306F, 0.1883F, -0.0374F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5F, -0.5339F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.4591F, 2.2817F, -3.4339F, 0.1937F, 0.1909F, 0.02F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(5, 80).addBox(-0.3436F, -0.6655F, -0.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.5252F, 2.2133F, -2.9589F, 0.0715F, 0.1909F, 0.02F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(82, 71).addBox(-0.4791F, -0.6655F, -0.6238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5252F, 2.2133F, -2.9589F, 0.073F, -0.2792F, -0.0138F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(75, 82).addBox(-0.6904F, -0.4807F, -0.7074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 82).addBox(-0.6904F, -0.4807F, -1.1074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5647F, 1.7849F, -2.1376F, 0.2905F, -0.27F, -0.0729F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(49, 66).addBox(-0.4997F, -0.3499F, -1.3555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(66, 47).addBox(-0.4997F, -0.6499F, -0.2555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, -0.0178F, -0.0088F, 0.0043F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 80).addBox(-0.4997F, -0.5887F, -0.7575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, -0.1748F, -0.0088F, 0.0043F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(35, 70).addBox(-0.4997F, -2.4868F, -0.4456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, 0.532F, -0.0088F, 0.0043F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(28, 64).addBox(-0.8398F, -0.7929F, -0.0309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.5F, 1.5047F, -10.3804F, 0.192F, 0.1222F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 79).addBox(-0.8398F, -0.4301F, 0.6039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 79).addBox(-0.8398F, -0.4301F, -0.1961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(21, 64).addBox(-0.8398F, -0.8301F, -0.1961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, 1.5047F, -10.3804F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.3478F, -0.4013F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.5376F, -0.7532F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6719F, -1.4908F, 0.6358F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.3676F, -1.0408F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4229F, -1.1328F, -0.1274F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(-1.1232F, -1.1286F, -0.3556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9765F, 1.6789F, -0.3043F, 1.5711F, -0.8121F, -0.0467F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.2295F, -1.3639F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 54).mirror().addBox(-0.2295F, -1.7639F, -0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4616F, -0.9597F, -0.172F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.6507F, -0.6832F, -0.6399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.4F, -0.5F, 1.6711F, -0.9597F, -0.172F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.5217F, -0.7133F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4839F, -0.2943F, -0.7598F, 1.4953F, -0.5946F, -0.0446F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.5F, -0.4732F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.808F, -0.279F, -1.2763F, 1.6523F, -0.5946F, -0.0446F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-0.475F, -0.6954F, -0.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.4839F, -0.2943F, -0.7598F, 1.4616F, -0.9597F, 0.0025F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(64, 76).mirror().addBox(-0.262F, -0.2855F, 2.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, 0.1374F, -0.1657F, -0.6652F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-0.262F, 0.7956F, 2.3853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, 0.4952F, -0.1657F, -0.6652F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.0F, 1.6786F, 2.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 77).mirror().addBox(0.0F, 1.3786F, 2.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, 0.4363F, -0.2094F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(0.0F, 2.9083F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(74, 76).mirror().addBox(0.0F, 2.9083F, 0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, 0.9425F, -0.2094F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(0.0F, 2.1939F, 1.4054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, 0.5411F, -0.2094F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.0F, -0.2669F, 2.4751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(20, 78).mirror().addBox(0.0F, 0.1331F, 2.4751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.4F, -3.2F, -0.0873F, -0.2094F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.3992F, -4.7232F, -0.237F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.4F, 0.1F, 1.6496F, -0.2268F, -0.0014F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-0.2F, -0.4588F, -1.6326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6F, -0.0953F, -2.3804F, 0.2404F, 0.7534F, 0.1661F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-0.1038F, -2.433F, -1.9733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, 0.1316F, -0.1568F, -0.0254F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.2F, -0.3866F, -1.8683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(65, 35).mirror().addBox(-0.2F, 0.0134F, -1.9089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.3047F, -5.5804F, 0.1745F, -0.192F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(-0.5F, -0.8F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(79, 6).mirror().addBox(-0.5F, -0.5F, -0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.7844F, 1.1115F, -3.2532F, -0.0524F, -0.2094F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.15F, -0.576F, 1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.2047F, -5.4804F, 0.1396F, -0.2094F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-0.1514F, -1.7902F, -2.4638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(42, 66).mirror().addBox(-0.1714F, -1.0921F, -1.6447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 26).mirror().addBox(-0.1514F, -1.7902F, -1.7638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, -0.192F, -0.1745F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-0.1804F, -0.6321F, -1.6311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, -1.4405F, -0.1743F, 0.0092F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.1704F, -1.7036F, -1.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, -0.3491F, -0.1745F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-0.1662F, -1.8974F, -1.3119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, -0.0524F, -0.1745F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-0.1672F, -2.1337F, -0.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, 0.8552F, -0.1745F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-0.1625F, -1.6846F, -1.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(79, 17).mirror().addBox(-0.1625F, -1.4846F, -1.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(50, 79).mirror().addBox(-0.2294F, -1.4536F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 79).mirror().addBox(-0.0714F, -1.4536F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1258F, -3.592F, -0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(75, 79).mirror().addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 79).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4277F, 1.9696F, -6.7231F, 0.0191F, -0.1912F, -0.0169F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.2F, 0.646F, -1.7033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.3047F, -5.5804F, -0.0698F, -0.192F, 0.0F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-0.2F, 0.2812F, 0.8734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 79).mirror().addBox(-0.2F, 0.1812F, -0.0266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 31).mirror().addBox(-0.2F, -0.3188F, -0.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.0691F, -8.9278F, -0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(46, 53).mirror().addBox(-0.31F, -0.7212F, -0.1385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(63, 43).mirror().addBox(-0.2F, -0.6131F, -0.1385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.0691F, -8.9278F, 0.1396F, -0.1047F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-1.65F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8F, 1.7491F, -2.7843F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-0.5003F, -0.2726F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, 0.6717F, 0.0088F, -0.0043F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(30, 26).mirror().addBox(-0.3725F, -0.6284F, -0.265F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7536F, 1.4585F, -8.8472F, -0.1218F, -0.0348F, -0.0058F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(80, 57).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.6912F, 2.1836F, -4.3427F, 0.0962F, -0.157F, -0.0037F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(80, 32).mirror().addBox(-0.5F, -0.3478F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6911F, 1.7656F, -4.3522F, -0.1918F, -0.157F, -0.0037F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.6136F, 2.2856F, -4.0288F, 0.0389F, -0.4933F, 0.1177F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(80, 29).mirror().addBox(-0.6377F, -0.6234F, -0.9286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5252F, 2.2133F, -3.5589F, -0.2578F, -0.4933F, 0.1177F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(80, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.5106F, 2.2554F, -3.7177F, 0.2231F, -0.1883F, 0.0374F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.5425F, -0.6234F, -0.6696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.5252F, 2.2133F, -3.5589F, -0.2306F, -0.1883F, 0.0374F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.5F, -0.5339F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.4591F, 2.2817F, -3.4339F, 0.1937F, -0.1909F, -0.02F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.6564F, -0.6655F, -0.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.5252F, 2.2133F, -2.9589F, 0.0715F, -0.1909F, -0.02F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(82, 71).mirror().addBox(-0.5209F, -0.6655F, -0.6238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5252F, 2.2133F, -2.9589F, 0.073F, 0.2792F, 0.0138F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.3096F, -0.4807F, -0.7074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 82).mirror().addBox(-0.3096F, -0.4807F, -1.1074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5647F, 1.7849F, -2.1376F, 0.2905F, 0.27F, 0.0729F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-0.5003F, -0.3499F, -1.3555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(66, 47).mirror().addBox(-0.5003F, -0.6499F, -0.2555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, -0.0178F, 0.0088F, -0.0043F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5003F, -0.5887F, -0.7575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, -0.1748F, 0.0088F, -0.0043F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.5003F, -2.4868F, -0.4456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, 0.532F, 0.0088F, -0.0043F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(-0.1602F, -0.7929F, -0.0309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.5047F, -10.3804F, 0.192F, -0.1222F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(65, 79).mirror().addBox(-0.1602F, -0.4301F, 0.6039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 79).mirror().addBox(-0.1602F, -0.4301F, -0.1961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(21, 64).mirror().addBox(-0.1602F, -0.8301F, -0.1961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.5047F, -10.3804F, -0.0873F, -0.1222F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(15, 44).mirror().addBox(-0.5956F, -0.4311F, 1.0907F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.3572F, -0.1559F, 0.1425F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-0.3F, -0.6306F, -0.2686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.5164F, -0.3515F, 0.22F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.3F, 2.3379F, -4.1156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.5585F, -0.1658F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.3F, 2.5543F, -4.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.3491F, -0.1658F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-0.3F, -0.79F, -5.0009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.4189F, -0.1658F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-0.6815F, -0.758F, -2.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(14, 63).mirror().addBox(-0.6815F, -0.558F, -2.6237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F)).mirror(false)
				.texOffs(74, 62).mirror().addBox(-0.6815F, -0.8088F, -0.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(19, 74).mirror().addBox(-0.6815F, -0.8088F, -1.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(60, 62).mirror().addBox(-0.6815F, -0.5088F, -1.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1939F, 0.1077F, -8.1837F, -0.0873F, -0.1134F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.3985F, -0.7762F, -0.2425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1939F, 0.1077F, -10.6837F, -0.2793F, -0.1134F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.6815F, -0.1753F, -1.6526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1939F, 0.1077F, -8.1837F, -0.2443F, -0.1134F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.3F, 1.8784F, -7.8444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.2443F, -0.1658F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-0.3F, 2.1909F, -6.098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.2967F, -0.1658F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(-0.3F, 0.7893F, -6.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(62, 22).mirror().addBox(-0.3F, 0.1893F, -6.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.0698F, -0.1658F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-0.3F, 0.1007F, -5.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(24, 75).mirror().addBox(-0.3F, 0.0007F, -6.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 75).mirror().addBox(-0.3F, 0.0007F, -7.8023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(53, 62).mirror().addBox(-0.3F, 0.3007F, -8.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.0873F, -0.1658F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.3F, -1.029F, -5.1716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(56, 43).mirror().addBox(-0.3F, -0.778F, -4.3574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.1745F, -0.1658F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.3F, -0.0573F, -3.6612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.1047F, -0.1658F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.3F, -0.3522F, -0.941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.7854F, -0.1658F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(22, 53).mirror().addBox(-0.3F, 0.2813F, -3.6482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.0524F, -0.1658F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(32, 60).mirror().addBox(-0.3F, -0.0004F, -2.8332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.2618F, -0.1658F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.3F, -0.0932F, -1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(72, 73).mirror().addBox(-0.3F, -0.5932F, -1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.3491F, -0.1658F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(-0.3F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(15, 44).addBox(-0.4044F, -0.4311F, 1.0907F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.3572F, 0.1559F, -0.1425F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(56, 66).addBox(-0.7F, -0.6306F, -0.2686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.2F, -0.5164F, 0.3515F, -0.22F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(73, 46).addBox(-0.7F, 2.3379F, -4.1156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.5585F, 0.1658F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(77, 39).addBox(-0.7F, 2.5543F, -4.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.3491F, 0.1658F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(74, 6).addBox(-0.7F, -0.79F, -5.0009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.4189F, 0.1658F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(74, 17).addBox(-0.3184F, -0.758F, -2.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(14, 63).addBox(-0.3184F, -0.558F, -2.6237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F))
				.texOffs(74, 62).addBox(-0.3184F, -0.8088F, -0.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(19, 74).addBox(-0.3184F, -0.8088F, -1.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(60, 62).addBox(-0.3184F, -0.5088F, -1.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1939F, 0.1077F, -8.1837F, -0.0873F, 0.1134F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(7, 63).addBox(-0.6015F, -0.7762F, -0.2425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1939F, 0.1077F, -10.6837F, -0.2793F, 0.1134F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 63).addBox(-0.3184F, -0.1753F, -1.6526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1939F, 0.1077F, -8.1837F, -0.2443F, 0.1134F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(46, 62).addBox(-0.7F, 1.8784F, -7.8444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.2443F, 0.1658F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(56, 14).addBox(-0.7F, 2.1909F, -6.098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.2967F, 0.1658F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(39, 62).addBox(-0.7F, 0.7893F, -6.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(62, 22).addBox(-0.7F, 0.1893F, -6.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.0698F, 0.1658F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(29, 75).addBox(-0.7F, 0.1007F, -5.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(24, 75).addBox(-0.7F, 0.0007F, -6.9022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 75).addBox(-0.7F, 0.0007F, -7.8023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(53, 62).addBox(-0.7F, 0.3007F, -8.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.0873F, 0.1658F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 58).addBox(-0.7F, -1.029F, -5.1716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(56, 43).addBox(-0.7F, -0.778F, -4.3574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.1745F, 0.1658F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 53).addBox(-0.7F, -0.0573F, -3.6612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.1047F, 0.1658F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 74).addBox(-0.7F, -0.3522F, -0.941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.7854F, 0.1658F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(22, 53).addBox(-0.7F, 0.2813F, -3.6482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.0524F, 0.1658F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(32, 60).addBox(-0.7F, -0.0004F, -2.8332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.2618F, 0.1658F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 74).addBox(-0.7F, -0.0932F, -1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(72, 73).addBox(-0.7F, -0.5932F, -1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.3491F, 0.1658F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(25, 60).addBox(-0.7F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, 0.0F, 0.1658F, 0.0F));

		return LayerDefinition.create(meshdefinition, 91, 91);
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