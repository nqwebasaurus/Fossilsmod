package fossils.fossils.client.blockentity.model.anatosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnatosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftside;
	private final ModelPart rightside;
	private final ModelPart horn;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public AnatosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backLeftLeg = this.main.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backRightLeg = this.main.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.frontLeftLeg = this.body3.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontRightLeg = this.body3.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.neck = this.body3.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftside = this.head.getChild("leftside");
		this.rightside = this.head.getChild("rightside");
		this.horn = this.head.getChild("horn");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -3.25F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -0.0672F, -0.0115F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -10.2F, 8.4F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 4).addBox(-1.0F, -1.15F, 0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -9.7F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 43).mirror().addBox(-0.5F, 0.5562F, 1.4831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -8.8789F, 6.2679F, -1.9024F, 0.0F, -0.2618F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-0.5F, -0.3308F, 0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -8.8789F, 6.2679F, -2.3562F, 0.0F, -0.2618F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-0.5F, -0.4343F, -0.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -8.8789F, 6.2679F, -2.5482F, 0.0F, -0.2618F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.2F, 0.5216F, -0.0476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -8.3934F, 7.393F, -0.192F, 0.0F, -0.3665F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-0.2F, -0.4084F, -0.5901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -8.3934F, 7.393F, -0.9948F, 0.0F, -0.3665F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-3.0F, 0.0563F, 0.7637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 28).mirror().addBox(-3.0F, 0.0563F, 0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(40, 42).mirror().addBox(-3.0F, -0.5437F, 0.0637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 49).addBox(-1.0F, 0.0563F, 0.7637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 28).addBox(-1.0F, 0.0563F, 0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(40, 42).addBox(-1.0F, -0.5437F, 0.0637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(20, 30).addBox(-2.0F, -0.1437F, -0.0363F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -9.75F, 5.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 39).addBox(-0.8F, 0.5216F, -0.0476F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, -8.3934F, 7.393F, -0.192F, 0.0F, 0.3665F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5F, 0.5562F, 1.4831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -8.8789F, 6.2679F, -1.9024F, 0.0F, 0.2618F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, -0.3308F, 0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8F, -8.8789F, 6.2679F, -2.3562F, 0.0F, 0.2618F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 43).addBox(-0.5F, -0.4343F, -0.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -8.8789F, 6.2679F, -2.5482F, 0.0F, 0.2618F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 16).addBox(-0.8F, -0.4084F, -0.5901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -8.3934F, 7.393F, -0.9948F, 0.0F, 0.3665F));

		PartDefinition backLeftLeg = main.addOrReplaceChild("backLeftLeg", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, -0.5995F, -0.4632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -8.8F, 6.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r14 = backLeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 23).addBox(-2.0F, 1.4903F, -0.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(47, 15).addBox(-2.0F, -0.0097F, -0.0559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.7005F, -1.2632F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r15 = backLeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 47).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 0.4005F, 0.5368F, -0.5061F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create().texOffs(18, 35).addBox(-0.9F, -0.1286F, -0.1532F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(28, 35).addBox(0.1F, -0.2286F, -0.1532F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.5394F, -1.5987F, 0.5236F, 0.0F, 0.0F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(0, 26).addBox(-1.25F, -0.5204F, -1.5008F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.25F, 4.9365F, 0.4649F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create().texOffs(26, 0).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -0.0204F, -1.5008F));

		PartDefinition backRightLeg = main.addOrReplaceChild("backRightLeg", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-0.5F, -0.5995F, -0.4632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -8.8F, 6.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = backRightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(1.0F, 1.4903F, -0.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(47, 15).mirror().addBox(1.0F, -0.0097F, -0.0559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.7005F, -1.2632F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r17 = backRightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4005F, 0.5368F, -0.5061F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create().texOffs(18, 35).mirror().addBox(-0.1F, -0.1286F, -0.1532F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(28, 35).mirror().addBox(-1.1F, -0.2286F, -0.1532F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5394F, -1.5987F, 0.6545F, 0.0F, 0.0F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.75F, -0.5204F, -1.5008F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.25F, 4.9365F, 0.4649F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.0204F, -1.5008F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.425F, 5.85F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.05F, -3.95F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.125F, 0.05F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.308F, -3.5032F, 0.0156F, 0.0079F, -0.5235F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.308F, -3.5032F, 0.0115F, 0.0132F, -0.9075F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-2.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.308F, -3.5032F, 0.0027F, 0.0172F, -1.4661F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.208F, -1.5032F, -0.1268F, -0.1445F, -1.1776F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.208F, -1.5032F, -0.1715F, -0.0867F, -0.7954F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 23).addBox(1.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.308F, -3.5032F, 0.0027F, -0.0172F, 1.4661F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(25, 54).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.308F, -3.5032F, 0.0115F, -0.0132F, 0.9075F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.308F, -3.5032F, 0.0156F, -0.0079F, 0.5235F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.208F, -1.5032F, -0.1715F, 0.0867F, 0.7954F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 53).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.208F, -1.5032F, -0.1268F, 0.1445F, 1.1776F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 20).addBox(-3.0F, -1.0304F, -1.9763F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.225F, -2.25F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.65F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -0.075F, -3.85F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1F, -4.0F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, -0.941F, -1.035F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 3.325F, -0.25F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(-2.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.208F, -1.4032F, 0.0192F, 0.1207F, -1.4126F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.208F, -1.4032F, 0.0804F, 0.0921F, -0.8515F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.208F, -1.4032F, 0.109F, 0.0554F, -0.4682F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(52, 21).mirror().addBox(-2.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.008F, -3.4032F, 0.0419F, 0.2585F, -1.4257F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.008F, -3.4032F, 0.174F, 0.1966F, -0.8555F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.008F, -3.4032F, 0.2344F, 0.1178F, -0.4748F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(52, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.208F, -1.4032F, 0.109F, -0.0554F, 0.4682F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(5, 53).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.208F, -1.4032F, 0.0804F, -0.0921F, 0.8515F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 53).addBox(1.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.208F, -1.4032F, 0.0192F, -0.1207F, 1.4126F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 21).addBox(1.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.008F, -3.4032F, 0.0419F, -0.2585F, 1.4257F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 28).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.008F, -3.4032F, 0.174F, -0.1966F, 0.8555F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.008F, -3.4032F, 0.2344F, -0.1178F, 0.4748F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(11, 24).addBox(-1.5F, -0.65F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 0.025F, -0.05F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -0.05F, -3.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.325F, 0.15F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.075F, -2.85F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 14).addBox(-2.0F, -0.2492F, -4.0326F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.25F, 0.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.3827F, 0.2771F, -0.1303F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7552F, -1.7837F, 1.1071F, -1.2427F, -0.7128F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(22, 25).mirror().addBox(-0.5F, 0.0117F, -0.5272F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7552F, -0.7837F, 0.2534F, -0.6531F, 0.0166F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 35).mirror().addBox(-0.5F, 0.0117F, -0.5272F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7552F, -0.7837F, 0.7295F, -1.1613F, -0.458F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.017F, -2.5532F, 0.5074F, 0.2752F, -0.6339F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.017F, -2.5532F, 0.3757F, 0.4413F, -1.0044F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-2.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.017F, -2.5532F, 0.0653F, 0.5681F, -1.6291F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(29, 30).mirror().addBox(-2.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(29, 30).addBox(1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6556F, -3.8924F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-0.4F, -1.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.3556F, -2.2924F, 1.5708F, 0.0F, 0.1396F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 46).addBox(-1.6F, -1.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.3556F, -2.2924F, 1.5708F, 0.0F, -0.1396F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(35, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.017F, -2.5532F, 0.5074F, -0.2752F, 0.6339F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 33).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.017F, -2.5532F, 0.3757F, -0.4413F, 1.0044F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(54, 31).addBox(1.4358F, -1.3389F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.017F, -2.5532F, 0.0653F, -0.5681F, 1.6291F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, 0.0117F, -0.5272F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7552F, -0.7837F, 0.2534F, 0.6531F, -0.0166F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 47).addBox(-0.6173F, 0.2771F, -0.1303F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7552F, -1.7837F, 1.1071F, 1.2427F, 0.7128F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 35).addBox(-0.5F, 0.0117F, -0.5272F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7552F, -0.7837F, 0.7295F, 1.1613F, 0.458F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(11, 30).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4552F, -2.2837F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 9).addBox(-2.0F, -0.35F, 0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5F, 0.05F, -4.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body3.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create().texOffs(47, 37).addBox(-0.5F, -0.6739F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 2.8F, -2.45F, -0.2174F, 0.0189F, 0.0852F));

		PartDefinition cube_r64 = frontLeftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(37, 46).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3261F, -0.4096F, 0.2967F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create().texOffs(35, 16).addBox(-0.1F, -0.226F, -0.6402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(23, 35).addBox(-1.0F, -0.226F, -0.6402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9717F, 0.56F, -0.5806F, 0.2069F, -0.0822F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(35, 12).addBox(-1.0F, -0.3868F, -1.8982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5501F, -0.1535F, 0.8247F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = body3.addOrReplaceChild("frontRightLeg", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-0.5F, -0.6739F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.8F, -2.45F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r65 = frontRightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3261F, -0.4096F, 0.2967F, 0.0F, 0.0F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-0.9F, -0.226F, -0.6402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(23, 35).mirror().addBox(0.0F, -0.226F, -0.6402F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9717F, 0.56F, -0.8727F, 0.0F, 0.0F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(35, 12).mirror().addBox(-1.0F, -0.3868F, -1.8982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5501F, -0.1535F, 0.1265F, 0.0F, 0.0F));

		PartDefinition neck = body3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2872F, -3.9962F, 0.1933F, 0.3694F, 0.226F));

		PartDefinition cube_r66 = neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(26, 14).addBox(-1.0F, -0.2495F, -2.986F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1034F, 0.1178F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 20).addBox(-1.5F, -0.65F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, -0.0034F, -2.8822F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1534F, -1.9322F, 0.4363F, 0.3491F, 0.0F));

		PartDefinition cube_r68 = neck2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(42, 33).addBox(-1.5F, -1.0263F, -2.0102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 0.55F, -0.05F, -0.1484F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 38).addBox(-0.5F, -0.35F, -3.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5436F, -1.999F, 0.149F, -0.0077F, -0.139F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.5162F, -0.2455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.37F, -6.4243F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-1.5F, -0.9414F, -0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(0, 38).addBox(-1.5F, -0.9414F, -1.3657F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(10, 50).addBox(0.5F, -0.9414F, -0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.05F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-1.5F, -0.9074F, -0.9403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.65F, 0.25F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 50).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0328F, 0.0328F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-1.5F, -0.1859F, 0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(52, 18).addBox(-0.5F, -0.1859F, 0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 8).addBox(-1.5F, -0.125F, 0.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.7913F, -2.0333F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 52).mirror().addBox(-0.5F, -0.0188F, 0.0492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(52, 37).mirror().addBox(-0.5F, -0.0188F, 0.7492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3913F, -3.6333F, 0.2517F, -0.1522F, -0.039F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(47, 40).addBox(0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5F, -0.3821F, -1.696F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.5F, -0.5484F, -0.1177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0715F, -2.1003F, -0.0678F, -0.0867F, 0.5642F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 40).mirror().addBox(-0.5F, -0.5522F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0715F, -2.1003F, 0.2042F, -0.3263F, 0.5149F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-0.5265F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7135F, 0.1021F, -4.1925F, 0.0786F, -0.11F, 1.3397F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 49).addBox(-0.4735F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7135F, 0.1021F, -4.1925F, 0.0786F, 0.11F, -1.3397F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 40).addBox(-0.5F, -0.5522F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.7F, -0.0715F, -2.1003F, 0.2042F, 0.3263F, -0.5149F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 6).addBox(-0.5F, -0.5484F, -0.1177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.7F, -0.0715F, -2.1003F, -0.0678F, 0.0867F, -0.5642F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.1188F, -0.8508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -0.3913F, -3.6333F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(40, 52).addBox(-0.5F, -0.0188F, 0.0492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(52, 37).addBox(-0.5F, -0.0188F, 0.7492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3913F, -3.6333F, 0.2517F, 0.1522F, 0.039F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 3).addBox(-0.5F, -0.1163F, -1.9004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.25F, -3.85F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 30).addBox(-1.5F, -0.8989F, -1.3053F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(37, 0).addBox(-1.5F, -0.8989F, -1.0053F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.45F, -0.65F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(49, 34).addBox(0.5F, -0.9074F, -0.9403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 0.65F, 0.25F, -0.733F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7252F, 0.0537F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-0.5F, -0.4315F, -0.8081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1435F, -6.0488F, -0.5934F, -0.2269F, 0.0F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -0.6165F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(52, 15).mirror().addBox(-0.5F, -0.8165F, -0.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(35, 51).mirror().addBox(-0.5F, -0.6165F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(47, 49).mirror().addBox(-0.5F, -0.4165F, -0.1758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1435F, -6.0488F, -0.2618F, -0.2269F, 0.0F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.672F, -1.5032F, -3.5293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 11).mirror().addBox(-0.672F, -1.2032F, -3.5293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(44, 7).mirror().addBox(-0.672F, -0.9718F, -3.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9248F, -2.2037F, -0.0183F, -0.3141F, 0.0038F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-0.1519F, -1.3452F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9248F, -2.2037F, 0.0698F, -0.0175F, 0.0F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-0.1519F, -0.6181F, -1.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9248F, -2.2037F, -0.4538F, -0.0175F, 0.0F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-0.1519F, -0.9009F, -1.8337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9248F, -2.2037F, -0.0524F, -0.0175F, 0.0F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(25, 51).mirror().addBox(-0.5F, -0.9493F, -0.8942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(25, 51).addBox(1.5F, -0.9493F, -0.8942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 0.9248F, -1.3037F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-0.5F, -0.1646F, -1.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(51, 12).addBox(1.5F, -0.1646F, -1.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-1.0F, -0.0752F, -0.6037F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(47, 43).mirror().addBox(-0.5F, -0.1227F, -0.9303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(47, 43).addBox(1.5F, -0.1227F, -0.9303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.0F, -0.0752F, -1.4037F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 26).mirror().addBox(-0.42F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 26).addBox(1.82F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 0.3926F, -1.2093F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.5F, -0.1646F, -0.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(51, 9).addBox(1.5F, -0.1646F, -0.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.0752F, -0.6037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(42, 24).mirror().addBox(-0.7F, -0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 46).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(42, 24).addBox(1.7F, -0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 46).addBox(1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 0.3248F, -0.3037F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(30, 51).addBox(-0.5F, -0.4315F, -0.8081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.4F, 0.1435F, -6.0488F, -0.5934F, 0.2269F, 0.0F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.6165F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 15).addBox(-0.5F, -0.8165F, -0.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 51).addBox(-0.5F, -0.6165F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(47, 49).addBox(-0.5F, -0.4165F, -0.1758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4F, 0.1435F, -6.0488F, -0.2618F, 0.2269F, 0.0F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 45).addBox(-0.328F, -1.5032F, -3.5293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 11).addBox(-0.328F, -1.2032F, -3.5293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F))
				.texOffs(44, 7).addBox(-0.328F, -0.9718F, -3.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 0.9248F, -2.2037F, -0.0183F, 0.3141F, -0.0038F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(50, 52).addBox(-0.8481F, -1.3452F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.4F, 0.9248F, -2.2037F, 0.0698F, 0.0175F, 0.0F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(45, 52).addBox(-0.8481F, -0.6181F, -1.7393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 0.9248F, -2.2037F, -0.4538F, 0.0175F, 0.0F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(14, 46).addBox(-0.8481F, -0.9009F, -1.8337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.4F, 0.9248F, -2.2037F, -0.0524F, 0.0175F, 0.0F));

		PartDefinition leftside = head.addOrReplaceChild("leftside", CubeListBuilder.create().texOffs(16, 42).addBox(-0.5F, -0.0018F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7143F, -0.3137F, -1.7528F, 0.043F, -0.0076F, 0.1744F));

		PartDefinition cube_r105 = leftside.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 33).addBox(-0.75F, -0.5018F, -2.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.237F, 0.5F, -1.8656F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r106 = leftside.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(33, 38).addBox(-0.0882F, -0.7376F, -2.4513F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0316F, 0.8347F, -1.2015F, 0.1244F, -0.1585F, -0.1715F));

		PartDefinition cube_r107 = leftside.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(47, 19).addBox(-0.05F, -0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6177F, 0.8183F, -4.3295F, -0.444F, 0.6775F, -0.6213F));

		PartDefinition cube_r108 = leftside.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 35).addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1506F, 0.4665F, -3.5464F, -0.0486F, 1.2294F, -0.0261F));

		PartDefinition cube_r109 = leftside.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 3).addBox(-0.6138F, -0.4516F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 0.5F, -4.3F, 0.139F, 0.9216F, 0.0997F));

		PartDefinition cube_r110 = leftside.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(20, 50).addBox(-0.4378F, -0.5F, 0.0666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 0.5F, -4.3F, 0.0F, 0.3229F, 0.0698F));

		PartDefinition cube_r111 = leftside.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(21, 46).addBox(-0.945F, -0.5F, -0.9589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.5F, -2.7F, 0.0F, -0.3229F, 0.0F));

		PartDefinition cube_r112 = leftside.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(33, 25).addBox(-1.0F, -0.5F, -2.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightside = head.addOrReplaceChild("rightside", CubeListBuilder.create().texOffs(16, 42).mirror().addBox(-0.5F, -0.0018F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7143F, -0.3137F, -1.7528F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition cube_r113 = rightside.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.25F, -0.5018F, -2.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.237F, 0.5F, -1.8656F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r114 = rightside.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(33, 38).mirror().addBox(0.0882F, -0.7376F, -2.4513F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0316F, 0.8347F, -1.2015F, 0.1244F, 0.1585F, 0.1715F));

		PartDefinition cube_r115 = rightside.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 19).mirror().addBox(0.05F, -0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6177F, 0.8183F, -4.3295F, -0.444F, -0.6775F, 0.6213F));

		PartDefinition cube_r116 = rightside.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(33, 35).mirror().addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1506F, 0.4665F, -3.5464F, -0.0486F, -1.2294F, 0.0261F));

		PartDefinition cube_r117 = rightside.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 3).mirror().addBox(-0.3862F, -0.4516F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.5F, -4.3F, 0.139F, -0.9216F, -0.0997F));

		PartDefinition cube_r118 = rightside.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(20, 50).mirror().addBox(-0.5622F, -0.5F, 0.0666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.5F, -4.3F, 0.0F, -0.3229F, -0.0698F));

		PartDefinition cube_r119 = rightside.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-0.055F, -0.5F, -0.9589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5F, -2.7F, 0.0F, 0.3229F, 0.0F));

		PartDefinition cube_r120 = rightside.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(33, 25).mirror().addBox(0.0F, -0.5F, -2.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition horn = head.addOrReplaceChild("horn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.364F, -6.7315F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r121 = horn.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(42, 49).mirror().addBox(-0.8801F, -0.5894F, -0.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0394F, 0.3047F, -0.0986F, -0.783F, 0.0696F));

		PartDefinition cube_r122 = horn.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(23, 42).mirror().addBox(-0.6F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2194F, -0.101F, -0.4213F, -0.0698F, 0.0174F, -0.0012F));

		PartDefinition cube_r123 = horn.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(23, 42).addBox(-0.4F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2194F, -0.101F, -0.4213F, -0.0698F, -0.0174F, 0.0012F));

		PartDefinition cube_r124 = horn.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(42, 49).addBox(-0.1199F, -0.5894F, -0.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0394F, 0.3047F, -0.0986F, 0.783F, -0.0696F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5002F, -0.074F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -8.7083F, 8.709F, -0.5186F, 0.1139F, -0.0647F));

		PartDefinition cube_r125 = tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 7).addBox(0.5F, -0.2228F, -0.0666F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.0002F, -0.099F, -0.0131F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 7).addBox(0.0F, -0.5972F, -0.0325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0953F, 4.8628F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition cube_r126 = tail2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(49, 31).addBox(0.5F, -1.0587F, -0.8468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -0.0972F, 0.6925F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(26, 4).addBox(0.0F, -0.5955F, 0.0981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0199F, 4.7417F, 0.1264F, 0.2598F, 0.0326F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -0.5451F, 0.0734F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0671F, 2.8764F, 0.3878F, 0.325F, 0.1297F));

		return LayerDefinition.create(meshdefinition, 58, 58);
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