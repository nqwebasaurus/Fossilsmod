package fossils.fossils.client.blockentity.model.sarcosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SarcosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
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
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart eye4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public SarcosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
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
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.eye4 = this.head.getChild("eye4");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -19.25F, 30.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 15).addBox(-3.5F, -0.3F, -5.0F, 7.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3988F, -1.1018F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 73).addBox(0.5F, -2.5176F, 8.7432F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(51, 76).addBox(0.5F, -2.5176F, 5.7432F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 76).addBox(0.5F, -2.5176F, 2.7432F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 36).addBox(0.5F, -2.5176F, -0.2568F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 76).mirror().addBox(-2.5F, -0.2176F, 6.6432F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(63, 11).mirror().addBox(-3.5F, -1.2176F, 9.2432F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 33).mirror().addBox(-3.4F, -0.2176F, 7.2432F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(73, 76).addBox(1.5F, -0.2176F, 6.6432F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(0, 33).addBox(3.4F, -0.2176F, 7.2432F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(63, 11).addBox(3.5F, -1.2176F, 9.2432F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(46, 11).addBox(-0.5F, -0.5176F, -0.2568F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-1.0F, -0.0361F, -4.0007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(16, 64).addBox(6.0F, -0.0361F, -4.0007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-3.0F, -0.8022F, 3.317F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(81, 111).mirror().addBox(-0.5893F, -1.5091F, 0.0557F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3686F, 7.0114F, 6.0912F, 0.9252F, -0.0361F, -0.265F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 100).mirror().addBox(-0.4893F, -1.2374F, -0.5677F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3686F, 7.0114F, 6.0912F, 1.3441F, -0.0361F, -0.265F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 63).mirror().addBox(-0.3089F, -0.1772F, -1.1431F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 5.0803F, 3.9575F, 0.644F, 0.0348F, -0.747F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 110).mirror().addBox(-0.1F, -0.3088F, -0.993F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.1803F, 3.0575F, 0.4495F, -0.07F, -0.7819F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 108).mirror().addBox(-0.5F, -0.2346F, -0.117F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 3.4491F, 0.6911F, -0.7152F, -0.0346F, -0.7859F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.4811F, -0.1048F, 0.1254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 60).mirror().addBox(-0.4811F, -0.6048F, 0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6446F, 6.6532F, -3.4002F, -1.6577F, -0.0346F, -0.1314F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.4811F, -0.0893F, -0.7226F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(34, 79).mirror().addBox(-0.4811F, -2.0893F, -0.7226F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6446F, 6.6532F, -3.4002F, -1.1864F, -0.0346F, -0.1314F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(100, 60).addBox(-0.5189F, -0.6048F, 0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(20, 98).addBox(-0.5189F, -0.1048F, 0.1254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6446F, 6.6532F, -3.4002F, -1.6577F, 0.0346F, 0.1314F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 79).addBox(-0.5189F, -2.0893F, -0.7226F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(33, 96).addBox(-0.5189F, -0.0893F, -0.7226F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6446F, 6.6532F, -3.4002F, -1.1864F, 0.0346F, 0.1314F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(58, 100).addBox(-0.5107F, -1.2374F, -0.5677F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3686F, 7.0114F, 6.0912F, 1.3441F, 0.0361F, 0.265F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 111).addBox(-0.4107F, -1.5091F, 0.0557F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3686F, 7.0114F, 6.0912F, 0.9252F, 0.0361F, 0.265F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(106, 14).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -2.0F, -0.201F, 0.0068F, -0.1394F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(106, 41).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8F, -5.0F, -0.1399F, 0.0068F, -0.1394F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 14).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -2.0F, -0.201F, -0.0068F, 0.1394F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(106, 41).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8F, -5.0F, -0.1399F, -0.0068F, 0.1394F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 63).addBox(-0.6911F, -0.1772F, -1.1431F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.2F, 5.0803F, 3.9575F, 0.644F, -0.0348F, 0.747F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(89, 110).addBox(-0.9F, -0.3088F, -0.993F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.3F, 4.1803F, 3.0575F, 0.4495F, 0.07F, 0.7819F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(23, 108).addBox(-0.5F, -0.2346F, -0.117F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 3.4491F, 0.6911F, -0.7152F, 0.0346F, 0.7859F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 1.7F, 2.4F, -0.6517F, -0.3612F, -0.7714F));

		PartDefinition cube_r22 = backleftleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 106).addBox(-0.5F, 0.4F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r23 = backleftleg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(63, 106).addBox(-0.5F, -0.1134F, 0.1152F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 6.1469F, -0.3512F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r24 = backleftleg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 111).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(34, 102).addBox(0.2811F, -0.6398F, -0.6193F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(-2.421F, -0.6047F, -0.619F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8748F, 10.4649F, 2.214F, 0.8473F, -0.5354F, 0.5743F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create().texOffs(81, 36).addBox(-1.4372F, 0.1135F, -5.6058F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4869F, 8.6745F, 0.7016F, -0.0937F, -0.1747F, -0.0918F));

		PartDefinition cube_r25 = backleftleg3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 36).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1685F, 0.6135F, -3.1841F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r26 = backleftleg3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(81, 36).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 0.6135F, -3.1058F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r27 = backleftleg3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 36).addBox(0.2F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3372F, 0.6135F, -3.1058F, 0.0F, 0.1745F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r28 = backleftleg4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5F, -0.5F, -7.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1F, 0.5F, -1.3F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r29 = backleftleg4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(29, 42).addBox(-0.4484F, -0.5F, -6.1619F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6155F, 0.5F, -0.6634F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r30 = backleftleg4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 39).addBox(-1.0221F, -0.5F, -8.9658F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1932F, 0.5F, -0.6956F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r31 = backleftleg4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(29, 42).addBox(-0.5791F, -0.5F, -5.4544F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.2F, 0.5F, -1.3F, 0.0F, -0.0436F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 1.7F, 2.4F, -0.3044F, 0.8423F, 1.1821F));

		PartDefinition cube_r32 = backrightleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, 0.4F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = backrightleg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 11).addBox(-0.5F, -0.1134F, 0.1152F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 6.1469F, -0.3512F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r34 = backrightleg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(12, 111).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(101, 100).addBox(-1.2811F, -0.6398F, -0.6193F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 100).addBox(0.421F, -0.6047F, -0.619F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8748F, 10.4649F, 2.214F, 1.1075F, -0.1853F, 0.0838F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(81, 22).addBox(0.6372F, 0.1135F, -5.6058F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(81, 22).addBox(-0.8628F, 0.1135F, -5.6058F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4869F, 8.6745F, 0.7016F, 0.3706F, 0.118F, -0.0353F));

		PartDefinition cube_r35 = backrightleg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(81, 22).addBox(0.1241F, -0.3596F, -2.4797F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1628F, 0.6135F, -3.1058F, -0.0044F, 0.0867F, 0.0052F));

		PartDefinition cube_r36 = backrightleg3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 22).addBox(-1.3134F, -0.4725F, -4.5109F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9354F, 0.9352F, -1.0141F, 0.0F, -0.1309F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(3, 36).addBox(2.3491F, -0.0479F, -6.7535F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F))
				.texOffs(1, 34).addBox(0.8F, -0.2F, -8.7F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r37 = backrightleg4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(3, 36).addBox(-0.7717F, -0.3718F, -1.4903F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1F, 0.3F, -5.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r38 = backrightleg4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 33).addBox(-0.7F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 0.3F, -5.2F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.85F, -6.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 0).addBox(-4.5F, -0.5F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.65F, -4.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -2.0F, -0.0963F, 0.0068F, -0.1394F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 44).mirror().addBox(-9.3036F, -3.6003F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.65F, -5.0F, 0.0301F, 0.0726F, -1.2294F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.65F, -5.0F, 0.0681F, 0.0392F, -0.5746F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 108).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.65F, -5.0F, 0.0782F, 0.0068F, -0.1394F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-11.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.85F, -8.0F, 0.0234F, 0.0564F, -1.1949F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(104, 47).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.85F, -8.0F, 0.0529F, 0.0305F, -0.5402F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(108, 60).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.85F, -8.0F, 0.0609F, 0.0053F, -0.1046F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 22).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -2.0F, -0.0963F, -0.0068F, 0.1394F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 108).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.65F, -5.0F, 0.0782F, -0.0068F, 0.1394F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(104, 44).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.65F, -5.0F, 0.0681F, -0.0392F, 0.5746F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(17, 44).addBox(3.3036F, -3.6003F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.65F, -5.0F, 0.0301F, -0.0726F, 1.2294F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 32).addBox(3.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.85F, -8.0F, 0.0234F, -0.0564F, 1.1949F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 47).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.85F, -8.0F, 0.0529F, -0.0305F, 0.5402F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(108, 60).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.85F, -8.0F, 0.0609F, -0.0053F, 0.1046F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(88, 97).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5341F, -1.9543F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(59, 111).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7126F, -4.9506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(71, 111).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0911F, -7.9417F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 66).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(50, 39).addBox(-1.0F, -0.4F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.65F, -10.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -0.5F, -7.0F, 12.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.45F, -5.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -10.8794F, -0.0376F, -0.0865F, 0.0005F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(103, 39).mirror().addBox(-9.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -10.8794F, -0.06F, -0.0728F, 0.2803F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 35).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -8.3794F, -0.0376F, -0.0865F, 0.0529F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(100, 68).mirror().addBox(-9.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -8.3794F, -0.06F, -0.0728F, 0.3327F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -5.3794F, -0.0376F, -0.0865F, 0.0529F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-9.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.977F, -5.3794F, -0.06F, -0.0728F, 0.3327F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(16, 59).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.977F, -2.8794F, -0.0376F, -0.0865F, 0.0616F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-9.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.977F, -2.8794F, -0.06F, -0.0728F, 0.3414F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 11.577F, 0.0206F, 0.1082F, -0.0247F, 0.0835F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 100).mirror().addBox(-8.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 11.577F, 0.0206F, 0.0973F, -0.0535F, 0.3615F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(19, 29).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.277F, 3.0206F, 0.1082F, -0.0247F, 0.1358F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(-8.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.277F, 3.0206F, 0.0973F, -0.0535F, 0.4138F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 11.277F, 3.9206F, 0.1527F, 0.2685F, 0.3338F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(-8.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 11.277F, 3.9206F, 0.221F, 0.2162F, 0.6164F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(108, 63).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.0F, 0.0609F, 0.0053F, -0.0871F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(104, 70).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.0F, 0.0529F, 0.0305F, -0.5228F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 88).mirror().addBox(-12.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.0F, 0.0234F, 0.0564F, -1.1774F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-13.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -4.0F, 0.0167F, 0.0403F, -1.1429F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -4.0F, 0.0378F, 0.0218F, -0.4883F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(73, 108).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -4.0F, 0.0435F, 0.0038F, -0.0523F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 108).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -7.0F, 0.0609F, 0.0053F, -0.0173F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(83, 105).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -7.0F, 0.0529F, 0.0305F, -0.453F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(-13.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -7.0F, 0.0234F, 0.0564F, -1.1076F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(82, 85).mirror().addBox(-13.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -10.0F, 0.0335F, 0.0806F, -1.1244F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(105, 84).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -10.0F, 0.0756F, 0.0436F, -0.4696F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(109, 17).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -10.0F, 0.0869F, 0.0076F, -0.0346F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(108, 63).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.0F, 0.0609F, -0.0053F, 0.0871F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 70).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.0F, 0.0529F, -0.0305F, 0.5228F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(77, 88).addBox(3.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.0F, 0.0234F, -0.0564F, 1.1774F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 108).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -4.0F, 0.0435F, -0.0038F, 0.0523F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(105, 8).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -4.0F, 0.0378F, -0.0218F, 0.4883F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 43).addBox(3.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -4.0F, 0.0167F, -0.0403F, 1.1429F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 108).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -7.0F, 0.0609F, -0.0053F, 0.0173F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 105).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -7.0F, 0.0529F, -0.0305F, 0.453F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(83, 16).addBox(3.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -7.0F, 0.0234F, -0.0564F, 1.1076F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(82, 85).addBox(3.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -10.0F, 0.0335F, -0.0806F, 1.1244F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(105, 84).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -10.0F, 0.0756F, -0.0436F, 0.4696F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(109, 17).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -10.0F, 0.0869F, -0.0076F, 0.0346F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(68, 106).addBox(0.0F, -3.3546F, 9.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(106, 100).addBox(0.0F, -3.3546F, 6.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 107).addBox(0.0F, -3.3546F, 3.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 107).addBox(0.0F, -3.3546F, 0.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3282F, -11.0075F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.7205F, -0.0407F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.9163F, -6.3434F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 11.277F, 3.9206F, 0.1527F, -0.2685F, -0.3338F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 9).addBox(4.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 11.277F, 3.9206F, 0.221F, -0.2162F, -0.6164F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 29).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.277F, 3.0206F, 0.1082F, 0.0247F, -0.1358F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 80).addBox(4.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.277F, 3.0206F, 0.0973F, 0.0535F, -0.4138F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 73).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 11.577F, 0.0206F, 0.1082F, 0.0247F, -0.0835F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(73, 100).addBox(4.8063F, 1.3782F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 11.577F, 0.0206F, 0.0973F, 0.0535F, -0.3615F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(16, 59).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.977F, -2.8794F, -0.0376F, 0.0865F, -0.0616F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(95, 6).addBox(4.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.977F, -2.8794F, -0.06F, 0.0728F, -0.3414F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(100, 58).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -5.3794F, -0.0376F, 0.0865F, -0.0529F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 96).addBox(4.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -5.3794F, -0.06F, 0.0728F, -0.3327F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(103, 35).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -8.3794F, -0.0376F, 0.0865F, -0.0529F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(100, 68).addBox(4.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -8.3794F, -0.06F, 0.0728F, -0.3327F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 37).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -10.8794F, -0.0376F, 0.0865F, -0.0005F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 39).addBox(4.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 11.977F, -10.8794F, -0.06F, 0.0728F, -0.2803F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(61, 91).addBox(-0.5F, -0.9299F, 2.9566F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.9163F, -14.3434F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -11.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 29).addBox(-5.5F, -0.7F, -4.0F, 11.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.95F, -5.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(66, 41).mirror().addBox(-1.0F, 0.0193F, -2.0168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 41).addBox(14.0F, 0.0193F, -2.0168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 1.9794F, -6.2074F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-1.0F, -0.054F, -1.1134F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(52, 39).addBox(14.0F, -0.054F, -1.1134F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-7.0F, 4.2833F, -7.3317F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-1.0F, -1.8253F, -1.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(8, 24).addBox(14.0F, -1.8253F, -1.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-7.0F, 6.1914F, -6.5546F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-1.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(50, 100).addBox(14.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.0F, 5.2914F, -6.9546F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9263F, 9.4204F, -6.8738F, 2.2241F, 0.0278F, -0.9959F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(32, 64).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9263F, 9.4204F, -6.8738F, 2.2241F, -0.0278F, 0.9959F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(14, 79).addBox(-1.0F, -0.9299F, -0.0434F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.6663F, -3.3434F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(37, 87).addBox(-3.0F, 0.0F, -3.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(70, 53).addBox(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.6663F, -3.7434F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(77, 73).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F))
				.texOffs(49, 108).addBox(-1.0F, -3.3F, 2.9F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 111).addBox(-1.0F, -3.0F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(28, 108).addBox(0.0F, -2.0F, -0.9F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7782F, -2.1075F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 11.727F, -2.8794F, -0.0345F, -0.0517F, 0.0875F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-9.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 11.727F, -2.8794F, -0.0475F, -0.0402F, 0.3669F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-13.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -2.0F, 0.047F, 0.1128F, -1.1056F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -2.0F, 0.1217F, 0.0106F, -0.0168F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -2.0F, 0.1059F, 0.061F, -0.4506F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(-12.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -5.0F, 0.0674F, 0.1611F, -1.1203F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(7, 104).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -5.0F, 0.1515F, 0.0869F, -0.4646F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(108, 11).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -5.0F, 0.1739F, 0.0151F, -0.0336F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -8.0F, 0.2127F, 0.1213F, -0.5106F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(92, 19).mirror().addBox(-10.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -8.0F, 0.0951F, 0.2254F, -1.1673F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -8.0F, 0.2435F, 0.0211F, -0.0847F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(107, 4).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -8.0F, 0.2435F, -0.0211F, 0.0847F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(89, 53).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -8.0F, 0.2127F, -0.1213F, 0.5106F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 19).addBox(3.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -8.0F, 0.0951F, -0.2254F, 1.1673F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(108, 11).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -5.0F, 0.1739F, -0.0151F, 0.0336F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(7, 104).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -5.0F, 0.1515F, -0.0869F, 0.4646F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 88).addBox(3.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -5.0F, 0.0674F, -0.1611F, 1.1203F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 29).addBox(3.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -2.0F, 0.047F, -0.1128F, 1.1056F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(38, 11).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 11.727F, -2.8794F, -0.0345F, 0.0517F, -0.0875F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(23, 64).addBox(4.8063F, 1.3782F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 11.727F, -2.8794F, -0.0475F, 0.0402F, -0.3669F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(39, 104).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -2.0F, 0.1059F, -0.061F, 0.4506F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(108, 50).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -2.0F, 0.1217F, -0.0106F, 0.0168F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(36, 50).addBox(-0.3536F, -0.1834F, -1.3254F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(106, 107).addBox(-0.3536F, 2.8166F, -0.3254F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1F, 7.5F, -6.3F, -0.4882F, -0.0086F, -1.217F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create().texOffs(0, 44).addBox(0.2589F, -0.1872F, -0.32F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 44).addBox(-1.4411F, -0.1872F, -0.32F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5218F, 7.9971F, 0.2955F, -0.2818F, -0.6449F, 1.1858F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6123F, 9.4817F, 0.2887F, 0.5491F, -0.185F, -0.1243F));

		PartDefinition cube_r147 = frontleftleg3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 27).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4203F, 0.0984F, -3.4117F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r148 = frontleftleg3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(62, 30).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1268F, 0.0984F, -2.5839F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r149 = frontleftleg3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 28).addBox(-0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7088F, 0.0984F, -3.2393F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r150 = frontleftleg3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 27).addBox(-0.7F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8682F, 0.0984F, -3.584F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r151 = frontleftleg3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 27).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2533F, 0.0984F, -3.7305F, 0.0F, 0.48F, 0.0F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(9, 15).addBox(-0.6464F, -0.1834F, -1.3254F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 107).addBox(-0.6464F, 2.8166F, -0.3254F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1F, 7.5F, -6.3F, 0.6026F, 0.0086F, 1.217F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create().texOffs(19, 15).addBox(-2.2589F, -0.1872F, -0.32F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 15).addBox(0.4411F, -0.1872F, -0.32F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5218F, 7.9971F, 0.2955F, -0.5148F, -0.328F, -1.151F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(48, 54).addBox(-0.7228F, -0.4016F, -5.9117F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1123F, 9.4817F, 0.6887F, 0.3848F, 0.4234F, 0.1257F));

		PartDefinition cube_r152 = frontrightleg3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7228F, 0.0984F, -1.4117F, 0.006F, 0.6541F, -0.0102F));

		PartDefinition cube_r153 = frontrightleg3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(49, 55).addBox(-0.8F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2228F, 0.0984F, -2.4117F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r154 = frontrightleg3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(48, 54).addBox(-0.8F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4772F, 0.0984F, -2.9117F, -0.0024F, -0.218F, 0.0048F));

		PartDefinition cube_r155 = frontrightleg3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7772F, 0.0984F, -2.9117F, 0.0F, -0.5236F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(50, 63).addBox(-1.0F, -0.6F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(0, 86).addBox(0.0F, -3.1F, -3.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 112).addBox(0.0F, -2.7F, -5.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, -8.7F, -0.1631F, -0.1304F, -0.088F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(66, 0).addBox(-3.5F, -0.7F, -4.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.55F, -3.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -2.3F, 0.4271F, 0.2443F, -0.6642F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-8.3036F, -3.6003F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -2.3F, 0.1919F, 0.4518F, -1.3277F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(106, 73).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -2.3F, 0.4859F, 0.0494F, -0.2688F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(26, 33).mirror().addBox(-1.9426F, 0.0204F, -0.9805F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -4.9F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(39, 93).addBox(3.3036F, -3.6003F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -2.3F, 0.1919F, -0.4518F, 1.3277F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 80).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -2.3F, 0.4271F, -0.2443F, 0.6642F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(26, 33).addBox(-0.0574F, 0.0204F, -0.9805F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -4.9F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(106, 73).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -2.3F, 0.4859F, -0.0494F, 0.2688F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -6.3F, -0.1086F, -0.3156F, -0.0849F));

		PartDefinition cube_r165 = neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(70, 49).addBox(-2.5F, -0.7F, -5.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.65F, -4.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(86, 111).addBox(0.0F, -1.1F, -6.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 108).addBox(0.0F, -1.2F, -4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 112).addBox(0.0F, -1.4F, -2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 112).addBox(0.0F, -1.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-1.9426F, 0.0204F, -0.9805F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -0.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(81, 25).mirror().addBox(-0.9426F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -2.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-0.9426F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -4.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 68).mirror().addBox(-0.9426F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -6.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r171 = neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(62, 68).addBox(-0.0574F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -6.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 59).addBox(-0.0574F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r173 = neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(81, 25).addBox(-0.0574F, 0.0204F, -0.9805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r174 = neck.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(58, 32).addBox(-0.0574F, 0.0204F, -0.9805F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -0.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r175 = neck.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(66, 36).addBox(-1.5F, -0.85F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(83, 9).addBox(-4.6307F, -1.1004F, -9.5559F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 89).addBox(-2.6307F, -0.1004F, -13.5559F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1307F, -0.456F, -9.445F, -0.1537F, -0.2322F, -0.098F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(69, 91).mirror().addBox(-1.0613F, 5.0221F, 1.1932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -1.8875F, 0.286F, -0.1087F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-1.0613F, 4.9017F, 0.7823F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -1.9399F, 0.286F, -0.1087F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-3.5F, 6.0047F, -4.2822F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 26).addBox(1.5F, 6.0047F, -4.2822F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 80).addBox(-2.5F, 6.0047F, -4.2822F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(0, 66).addBox(-2.5F, 7.0047F, -3.2822F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -1.2261F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(39, 96).mirror().addBox(-3.0F, 7.6267F, 2.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 22).addBox(-2.5F, 4.3536F, 0.5823F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(39, 96).addBox(1.0F, 7.6267F, 2.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -1.9242F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(61, 91).addBox(0.0613F, 4.9017F, 0.7823F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.6307F, -0.7754F, -17.0559F, -1.9399F, -0.286F, 0.1087F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(69, 91).addBox(0.0613F, 5.0221F, 1.1932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, -0.7754F, -17.0559F, -1.8875F, -0.286F, 0.1087F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(3, 15).addBox(0.0F, -1.7097F, 9.1877F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6307F, -0.7754F, -17.0559F, -3.111F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(17, 47).mirror().addBox(0.1469F, 0.0022F, 0.4566F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.5307F, 0.8996F, -14.3559F, -0.1017F, -0.3116F, 0.3214F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-2.5341F, 3.602F, -3.8283F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.8693F, -0.7754F, -13.6309F, -0.1166F, 0.0367F, 0.3033F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-2.25F, 1.7421F, -1.7692F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 113).addBox(1.25F, 1.7421F, -1.7692F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 76).addBox(-2.5F, -0.1079F, -7.7692F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(31, 93).mirror().addBox(-2.1161F, 2.296F, -6.7692F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3693F, -0.7754F, -17.0559F, -0.2193F, 0.0383F, 0.1703F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 66).mirror().addBox(-2.5179F, -1.1217F, -0.5736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1307F, 1.4362F, -25.5782F, -2.9036F, -0.031F, 0.1272F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(-1.5F, -0.6358F, -0.4143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(13, 86).addBox(0.5F, -0.6358F, -0.4143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1307F, 1.4362F, -25.5782F, -2.8143F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(32, 66).addBox(1.5179F, -1.1217F, -0.5736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1307F, 1.4362F, -25.5782F, -2.9036F, 0.031F, -0.1272F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 53).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1307F, -0.5088F, -24.9136F, -2.0202F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(98, 89).addBox(-2.0F, -1.9428F, -0.0288F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, -0.7754F, -27.2559F, -1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(31, 93).addBox(2.1161F, 2.296F, -6.7692F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, -0.7754F, -17.0559F, -0.2193F, -0.0383F, -0.1703F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 93).addBox(2.5341F, 3.602F, -3.8283F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.1307F, -0.7754F, -13.6309F, -0.1166F, -0.0367F, -0.3033F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(89, 46).addBox(-1.5F, 0.6733F, -3.8783F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.1307F, -0.7754F, -13.6309F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(51, 76).addBox(-0.5F, -0.043F, -1.2653F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1307F, -0.7754F, -17.0309F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(91, 73).addBox(-1.5F, -0.0728F, -0.1227F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.1307F, -0.5678F, -13.4264F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 47).addBox(-0.1469F, 0.0022F, 0.4566F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2693F, 0.8996F, -14.3559F, -0.1017F, 0.3116F, -0.3214F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-2.1F, -1.0F, -8.0F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6307F, -0.2004F, -1.5559F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.1613F, -1.0F, -0.5434F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.5307F, 0.8996F, -14.3559F, 0.0F, -0.3796F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 86).addBox(-2.8387F, -1.0F, -0.5434F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2693F, 0.8996F, -14.3559F, 0.0F, 0.3796F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(78, 91).addBox(-2.5F, -0.0236F, -1.9971F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1307F, -2.4754F, -5.5559F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(88, 0).addBox(-2.5F, -0.4814F, -3.9266F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1307F, -1.3754F, -1.7559F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(94, 94).addBox(-2.5F, -0.0965F, -2.906F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, -2.1004F, -7.6559F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.4911F, -0.8006F, 0.4558F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1307F, 0.8626F, -5.5567F, 0.1683F, -0.7841F, -0.9638F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 95).addBox(-3.5089F, -0.8006F, 0.4558F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.8626F, -5.5567F, 0.1683F, 0.7841F, 0.9638F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(75, 59).addBox(-4.5F, -3.9F, 2.6F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, 1.8996F, -6.5559F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.9F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6307F, 0.2851F, -5.1405F, 0.3889F, -0.3331F, -0.1332F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(75, 66).addBox(-0.1F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3693F, 0.2851F, -5.1405F, 0.3889F, 0.3331F, 0.1332F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(18, 50).addBox(-0.9F, -1.0F, -8.0F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3693F, -0.2004F, -1.5559F, 0.0F, 0.2618F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4693F, -0.9004F, -7.0059F, 0.0015F, 0.1745F, 0.0089F));

		PartDefinition cube_r210 = eye.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(62, 63).addBox(3.1F, -1.2444F, 4.542F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.5326F, -5.6205F, 0.1309F, 0.0F, 0.0F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7307F, -0.9004F, -7.0059F, 0.0015F, -0.1745F, -0.0089F));

		PartDefinition cube_r211 = eye3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-5.1F, -1.2444F, 4.542F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5F, 0.5326F, -5.6205F, 0.1309F, 0.0F, 0.0F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r212 = eye2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(63, 100).addBox(2.1F, -1.2444F, 4.542F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 0.9657F, -5.4627F, 0.1309F, 0.0F, 0.0F));

		PartDefinition eye4 = head.addOrReplaceChild("eye4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5131F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r213 = eye4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(63, 100).mirror().addBox(-5.1F, -1.2444F, 4.542F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.1F, 0.9657F, -5.4627F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(46, 15).addBox(4.5F, 0.0291F, -3.596F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(46, 15).mirror().addBox(-5.5F, 0.0291F, -3.596F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1307F, 1.1996F, 0.9441F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-3.0F, -0.9969F, -3.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 36).addBox(1.0F, -0.9969F, -3.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9856F, -14.5805F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(23, 48).mirror().addBox(-3.25F, -0.75F, -3.725F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(72, 102).mirror().addBox(-3.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 48).addBox(1.25F, -0.75F, -3.725F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(72, 102).addBox(0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 0.0291F, -14.596F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-6.0F, -1.3F, -5.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(100, 61).addBox(3.0F, -1.3F, -5.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 4.0291F, -5.296F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-6.5F, -0.4F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 99).addBox(2.5F, -0.4F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0291F, -5.596F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.5F, -3.9464F, -4.955F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 0).addBox(4.5F, -3.9464F, -4.955F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4399F, -1.6389F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-5.5F, -0.605F, -5.8585F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(0, 15).addBox(4.5F, -0.605F, -5.8585F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.3399F, 3.5611F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-6.0F, 0.0F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 59).addBox(4.0F, 0.0F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0291F, 0.304F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(0.0F, -0.7483F, -2.4294F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 73).addBox(3.5F, -0.7483F, -2.4294F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -0.262F, -21.3025F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(0.05F, -0.7423F, -0.5615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.85F, -0.6576F, -25.1893F, -0.2376F, -0.0741F, -0.2966F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(110, 32).mirror().addBox(-0.5F, -1.2465F, -0.3588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2926F, -25.8007F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(111, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3367F, -0.8839F, -25.7437F, 0.2247F, 0.0432F, -0.3025F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(51, 91).mirror().addBox(-2.5F, -0.5998F, 0.9041F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 29).addBox(-2.5F, -0.5998F, -0.0959F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(51, 91).addBox(0.5F, -0.5998F, 0.9041F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0459F, -26.296F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(68, 91).mirror().addBox(-2.5F, -0.1123F, -5.7495F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(106, 0).addBox(-2.5F, -0.1123F, -6.7495F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 91).addBox(0.5F, -0.1123F, -5.7495F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.0459F, -19.596F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(0.25F, 0.25F, -5.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(79, 97).mirror().addBox(0.0F, 1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -0.9709F, -10.596F, 0.0F, -0.4669F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(11, 96).mirror().addBox(2.2955F, -0.8F, -1.4458F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 1.7291F, -15.696F, 0.0F, -0.4669F, 0.0F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(2.2955F, -0.8F, -1.4458F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 1.7291F, -15.696F, -0.1745F, -0.4669F, 0.0F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 33).addBox(-0.05F, -0.7423F, -0.5615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.85F, -0.6576F, -25.1893F, -0.2376F, 0.0741F, 0.2966F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(111, 53).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3367F, -0.8839F, -25.7437F, 0.2247F, -0.0432F, 0.3025F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 0).addBox(-0.25F, 0.25F, -5.75F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.002F))
				.texOffs(79, 97).addBox(-1.0F, 1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.0F, -0.9709F, -10.596F, 0.0F, 0.4669F, 0.0F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(11, 96).addBox(-3.2955F, -0.8F, -1.4458F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, 1.7291F, -15.696F, 0.0F, 0.4669F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(40, 96).addBox(-3.2955F, -0.8F, -1.4458F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.0F, 1.7291F, -15.696F, -0.1745F, 0.4669F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(59, 76).addBox(-1.0F, -0.1552F, -0.085F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F))
				.texOffs(63, 11).addBox(-2.5F, -3.1552F, -0.085F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.001F))
				.texOffs(0, 0).addBox(0.0F, -2.1552F, -0.085F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(41, 64).addBox(0.0F, -2.8552F, 2.915F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.35F, 5.7F, -0.1986F, 0.2569F, -0.0511F));

		PartDefinition cube_r235 = tail.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.5F, -0.9F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1552F, 6.915F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r236 = tail.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 118).addBox(0.0F, 0.4F, 4.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(0.0F, -0.5F, 2.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(0.0F, -1.5F, 0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8448F, 3.415F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-2.0014F, -0.014F, 5.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 16).mirror().addBox(-2.0014F, -0.014F, 2.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 89).mirror().addBox(-2.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, 0.8F, -0.0178F, 0.0068F, -0.1394F));

		PartDefinition cube_r238 = tail.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(26, 39).addBox(0.0014F, -0.014F, 5.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 16).addBox(0.0014F, -0.014F, 2.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 89).addBox(0.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, 0.8F, -0.0178F, -0.0068F, 0.1394F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.1594F, 0.1708F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F))
				.texOffs(18, 80).addBox(-2.0F, -3.1594F, -0.3292F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(0, 73).addBox(0.0F, -2.1594F, 0.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 47).addBox(0.0F, -2.1594F, 3.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(0.0F, -2.1594F, 6.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(0.0F, -2.1594F, 9.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0448F, 8.715F, -0.1896F, 0.2573F, -0.0488F));

		PartDefinition cube_r239 = tail2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(48, 53).mirror().addBox(-1.1014F, -0.014F, 14.1995F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 6).mirror().addBox(-1.4014F, -0.014F, 11.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 45).mirror().addBox(-1.6014F, -0.014F, 8.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6052F, -7.915F, -0.0178F, 0.0068F, -0.1394F));

		PartDefinition cube_r240 = tail2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(48, 53).addBox(0.1014F, -0.014F, 14.1995F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 6).addBox(-0.5986F, -0.014F, 11.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 45).addBox(-0.3986F, -0.014F, 8.1995F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6052F, -7.915F, -0.0178F, -0.0068F, 0.1394F));

		PartDefinition cube_r241 = tail2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(4, 123).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7957F, 3.3017F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r242 = tail2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(4, 123).addBox(0.0F, 1.6265F, 3.9105F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 123).addBox(0.0F, 0.6265F, 1.9105F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 123).addBox(0.0F, -0.3735F, -0.0895F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5406F, 6.7708F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(4, 123).addBox(0.0F, -0.173F, 0.2167F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5406F, 4.1708F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.0381F, -0.2468F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(111, 103).addBox(0.0F, -2.0381F, -0.2468F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 98).addBox(0.0F, -2.0381F, 2.7532F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 92).addBox(0.0F, -2.0381F, 5.7532F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 76).addBox(0.0F, -2.1381F, 8.7532F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1594F, 12.1208F, 0.0089F, 0.1745F, 0.0015F));

		PartDefinition cube_r244 = tail3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(18, 123).addBox(0.0F, 0.5F, 8.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 123).addBox(0.0F, 0.1F, 6.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 123).addBox(0.0F, -0.7F, 4.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 123).addBox(0.0F, -1.1F, 2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 123).addBox(0.0F, -1.8F, 0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9619F, 1.2532F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, -0.413F, -0.1774F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(102, 112).addBox(0.0F, -2.3653F, 7.3253F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2619F, 10.4532F, 0.064F, -0.3048F, -0.0192F));

		PartDefinition cube_r245 = tail4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.1F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -0.413F, 6.7226F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r246 = tail4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(111, 87).addBox(0.5F, -2.1718F, 0.0142F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.413F, 9.3226F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r247 = tail4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(102, 112).addBox(0.0F, -0.6F, 2.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 112).addBox(0.0F, -0.4F, 4.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 112).addBox(0.0F, -0.9F, 0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6347F, 7.8253F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r248 = tail4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(99, 112).addBox(0.0F, -2.3F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 75).addBox(0.0F, -2.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.513F, 2.3226F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r249 = tail4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 75).addBox(0.0F, 0.1F, 3.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 75).addBox(0.0F, -0.4F, 1.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 75).addBox(0.0F, -0.9F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8637F, 1.9886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(61, 63).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.613F, 11.2226F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition cube_r250 = tail5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -3.8F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 95).addBox(0.0F, -3.4F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 107).addBox(0.0F, -3.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 63).addBox(0.0F, -2.9F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 68).addBox(0.0F, -2.6F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 41).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, -0.0375F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.1689F, -0.2745F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0322F, 10.9625F, 0.1107F, -0.5209F, -0.0553F));

		PartDefinition cube_r251 = tail6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(75, 66).addBox(0.0F, -2.4305F, 0.9026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 0).addBox(0.0F, -6.0861F, 12.1805F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 0).addBox(0.0F, -5.4722F, 10.361F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 15).addBox(0.0F, -4.9153F, 8.4513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).addBox(0.0F, -4.3583F, 6.5416F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 59).addBox(0.0F, -3.7444F, 4.7221F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 76).addBox(0.0F, -3.1305F, 2.9026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 0.7255F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(36, 63).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2311F, 15.2255F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r252 = tail7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 76).addBox(0.0F, -2.3209F, 2.6405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 89).addBox(0.0F, -1.6264F, 0.9072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 73).addBox(0.0F, -0.9695F, -1.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.35F, -0.3665F, 0.0F, 0.0F));

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