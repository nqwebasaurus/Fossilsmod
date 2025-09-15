package fossils.fossils.client.blockentity.model.spicomellus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpicomellusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart Osteoderms5;
	private final ModelPart Osteoderms16;
	private final ModelPart bone2;
	private final ModelPart bone10;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone7;
	private final ModelPart bone16;
	private final ModelPart body;
	private final ModelPart osteoderns;
	private final ModelPart osteoderns2;
	private final ModelPart chest;
	private final ModelPart bone5;
	private final ModelPart bone14;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms15;
	private final ModelPart bone3;
	private final ModelPart bone11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart bone4;
	private final ModelPart bone13;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms14;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms13;
	private final ModelPart neck;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms6;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone15;
	private final ModelPart backPlates2;
	private final ModelPart tail;
	private final ModelPart osteoderms12;
	private final ModelPart bone9;
	private final ModelPart osteoderms17;
	private final ModelPart bone12;
	private final ModelPart osteoderms7;
	private final ModelPart tail2;
	private final ModelPart bone8;
	private final ModelPart bone17;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms18;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms19;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms20;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms21;

	public SpicomellusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.Osteoderms5 = this.hips.getChild("Osteoderms5");
		this.Osteoderms16 = this.hips.getChild("Osteoderms16");
		this.bone2 = this.hips.getChild("bone2");
		this.bone10 = this.hips.getChild("bone10");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone7 = this.hips.getChild("bone7");
		this.bone16 = this.hips.getChild("bone16");
		this.body = this.hips.getChild("body");
		this.osteoderns = this.body.getChild("osteoderns");
		this.osteoderns2 = this.body.getChild("osteoderns2");
		this.chest = this.body.getChild("chest");
		this.bone5 = this.chest.getChild("bone5");
		this.bone14 = this.chest.getChild("bone14");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.bone3 = this.chest.getChild("bone3");
		this.bone11 = this.chest.getChild("bone11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.bone4 = this.neck3.getChild("bone4");
		this.bone13 = this.neck3.getChild("bone13");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms14 = this.neck3.getChild("osteoderms14");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms13 = this.neck2.getChild("osteoderms13");
		this.neck = this.neck2.getChild("neck");
		this.osteoderms = this.neck.getChild("osteoderms");
		this.osteoderms6 = this.neck.getChild("osteoderms6");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone6 = this.body.getChild("bone6");
		this.bone15 = this.body.getChild("bone15");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.tail = this.hips.getChild("tail");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.bone9 = this.osteoderms12.getChild("bone9");
		this.osteoderms17 = this.tail.getChild("osteoderms17");
		this.bone12 = this.osteoderms17.getChild("bone12");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.tail2 = this.tail.getChild("tail2");
		this.bone8 = this.tail2.getChild("bone8");
		this.bone17 = this.tail2.getChild("bone17");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms18 = this.tail2.getChild("osteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms19 = this.tail3.getChild("osteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms20 = this.tail4.getChild("osteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms21 = this.tail5.getChild("osteoderms21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -21.7F, 13.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 94).addBox(0.5F, -0.9106F, -5.0576F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.7662F, -6.6284F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 23).addBox(-4.0F, 0.0447F, -0.0543F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1505F, -0.885F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 30).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-6.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -7.7F, -0.0174F, 0.0011F, 0.0611F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(122, 76).mirror().addBox(-1.404F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 92).mirror().addBox(-1.996F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(114, 9).mirror().addBox(-5.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 7).mirror().addBox(-5.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0174F, 0.0011F, 0.0611F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(122, 76).addBox(-2.596F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 65).addBox(-2.004F, 0.0347F, -0.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 92).addBox(-2.004F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 9).addBox(0.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(114, 7).addBox(0.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0174F, -0.0011F, -0.0611F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(103, 50).addBox(0.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -7.7F, -0.0174F, -0.0011F, -0.0611F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 11).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(124, 126).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.987F, 3.7928F, 1.2445F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(127, 130).addBox(-0.5F, 1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(120, 130).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9341F, -0.0935F, 1.3317F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(130, 29).addBox(-0.5F, 4.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(130, 25).addBox(-0.5F, 2.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 130).addBox(-0.5F, 0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.3789F, -6.9791F, 1.5063F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 94).addBox(0.48F, -0.717F, -0.192F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Osteoderms5 = hips.addOrReplaceChild("Osteoderms5", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition cube_r18 = Osteoderms5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(126, 98).addBox(-0.5F, -2.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(126, 102).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(126, 106).addBox(-0.5F, 1.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.5881F, 1.3414F, 2.8194F, 1.525F, -0.0852F, 0.7903F));

		PartDefinition cube_r19 = Osteoderms5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 101).addBox(-0.3858F, -10.7926F, -0.7679F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(7.3194F, 3.111F, 6.5339F, -0.7312F, -0.064F, 1.2112F));

		PartDefinition cube_r20 = Osteoderms5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 62).addBox(-0.3963F, -1.531F, -0.474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3194F, 3.111F, 6.5339F, 0.7524F, -0.064F, 1.2112F));

		PartDefinition cube_r21 = Osteoderms5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(128, 67).addBox(-0.5F, 1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 128).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(87, 128).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.0659F, 0.5796F, 2.8686F, 1.5149F, 0.0322F, 0.5227F));

		PartDefinition cube_r22 = Osteoderms5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(130, 49).addBox(-0.8F, 1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(130, 53).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 130).addBox(-0.8F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.4F, 0.187F, 2.894F, 1.5102F, 0.0221F, 0.3484F));

		PartDefinition cube_r23 = Osteoderms5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(125, 45).addBox(-0.6F, 1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 126).addBox(-0.6F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 126).addBox(-0.6F, -2.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.8636F, 1.5396F, 8.8402F, 1.2231F, 0.0533F, 0.5312F));

		PartDefinition cube_r24 = Osteoderms5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(124, 122).addBox(-0.7F, 1.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(125, 11).addBox(-0.7F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(125, 39).addBox(-0.7F, -2.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2055F, 0.8361F, 8.9167F, 1.3358F, 0.0296F, 0.3473F));

		PartDefinition cube_r25 = Osteoderms5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 131).addBox(-0.5F, 1.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(94, 131).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(101, 131).addBox(-0.5F, -2.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 0.5738F, 8.8815F, 1.3347F, 0.0194F, 0.3048F));

		PartDefinition cube_r26 = Osteoderms5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 130).addBox(-0.5F, 1.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 130).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 130).addBox(-0.5F, -2.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 0.187F, 2.894F, 1.5529F, 0.0194F, 0.3048F));

		PartDefinition Osteoderms16 = hips.addOrReplaceChild("Osteoderms16", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition cube_r27 = Osteoderms16.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(126, 98).mirror().addBox(-0.5F, -2.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(126, 102).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(126, 106).mirror().addBox(-0.5F, 1.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-6.5881F, 1.3414F, 2.8194F, 1.525F, 0.0852F, -0.7903F));

		PartDefinition cube_r28 = Osteoderms16.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 101).mirror().addBox(-0.6142F, -10.7926F, -0.7679F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-7.3194F, 3.111F, 6.5339F, -0.7312F, 0.064F, -1.2112F));

		PartDefinition cube_r29 = Osteoderms16.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.6037F, -1.531F, -0.474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3194F, 3.111F, 6.5339F, 0.7524F, 0.064F, -1.2112F));

		PartDefinition cube_r30 = Osteoderms16.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 67).mirror().addBox(-0.5F, 1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(73, 128).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 128).mirror().addBox(-0.5F, -2.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.0659F, 0.5796F, 2.8686F, 1.5149F, -0.0322F, -0.5227F));

		PartDefinition cube_r31 = Osteoderms16.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(130, 49).mirror().addBox(-0.2F, 1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(130, 53).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(64, 130).mirror().addBox(-0.2F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.187F, 2.894F, 1.5102F, -0.0221F, -0.3484F));

		PartDefinition cube_r32 = Osteoderms16.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(125, 45).mirror().addBox(-0.4F, 1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 126).mirror().addBox(-0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(24, 126).mirror().addBox(-0.4F, -2.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8636F, 1.5396F, 8.8402F, 1.2231F, -0.0533F, -0.5312F));

		PartDefinition cube_r33 = Osteoderms16.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(-0.3F, 1.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(125, 11).mirror().addBox(-0.3F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(125, 39).mirror().addBox(-0.3F, -2.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.2055F, 0.8361F, 8.9167F, 1.3358F, -0.0296F, -0.3473F));

		PartDefinition cube_r34 = Osteoderms16.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(14, 131).mirror().addBox(-0.5F, 1.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(94, 131).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(101, 131).mirror().addBox(-0.5F, -2.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.5738F, 8.8815F, 1.3347F, -0.0194F, -0.3048F));

		PartDefinition cube_r35 = Osteoderms16.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 130).mirror().addBox(-0.5F, 1.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(38, 130).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 130).mirror().addBox(-0.5F, -2.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.187F, 2.894F, 1.5529F, -0.0194F, -0.3048F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.8068F, -0.3635F, -0.2547F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 88).addBox(0.0905F, 0.899F, -1.8568F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.6F, -0.3927F, -0.3704F, 0.629F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(105, 140).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(136, 0).addBox(-0.5F, -1.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1265F, 1.3757F, -3.8121F, 0.5672F, -0.3704F, 0.629F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(94, 124).addBox(-0.237F, -0.0723F, -1.7143F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.3704F, 0.0367F, 0.8309F));

		PartDefinition cube_r39 = bone2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 134).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5891F, 4.8411F, 2.6115F, 0.0723F, -0.1541F, 0.5523F));

		PartDefinition cube_r40 = bone2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(127, 85).addBox(-2.2843F, 0.1712F, -6.8575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.45F, -0.0231F, -0.3935F, 0.5269F));

		PartDefinition cube_r41 = bone2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(107, 21).addBox(-1.1375F, -0.5736F, -1.856F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(111, 77).addBox(-1.1375F, -0.5736F, -1.856F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5121F, 1.4877F, 1.9836F, -0.5012F, -0.056F, 0.4147F));

		PartDefinition cube_r42 = bone2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 102).addBox(0.2709F, -3.0171F, -4.3546F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, -0.2658F, 0.036F, 0.2594F));

		PartDefinition cube_r43 = bone2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(86, 53).addBox(-1.4961F, 0.0172F, -5.355F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.45F, -0.0219F, -0.2364F, 0.5231F));

		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(19, 66).addBox(-0.1243F, 0.0429F, -7.391F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.45F, -0.0214F, -0.0619F, 0.5193F));

		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 79).addBox(-1.5F, -0.425F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4721F, 0.5794F, -0.576F, -0.2797F, -0.0515F, 0.4646F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(35, 108).addBox(0.2206F, -0.5736F, -2.0186F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5121F, 1.4877F, 1.9836F, -0.5416F, -0.3747F, 0.6008F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 56).addBox(0.0166F, -0.8811F, -0.4043F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.561F, -0.1541F, 0.7705F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(112, 52).addBox(0.2895F, -2.2285F, -2.2993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, -0.1724F, 0.0272F, 0.1547F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(14, 122).addBox(-2.1024F, -1.8562F, -1.65F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, -0.1665F, 0.0128F, -0.1127F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 135).addBox(0.0669F, -1.7493F, -0.6318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.7927F, -0.0659F, 0.4124F));

		PartDefinition cube_r51 = bone2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(134, 4).addBox(-0.237F, -2.8095F, -1.74F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.5275F, 0.0367F, 0.8309F));

		PartDefinition bone10 = hips.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-3.8068F, -0.3635F, -0.2547F));

		PartDefinition cube_r52 = bone10.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(96, 88).mirror().addBox(-1.0905F, 0.899F, -1.8568F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.6F, -0.3927F, 0.3704F, -0.629F));

		PartDefinition cube_r53 = bone10.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(105, 140).mirror().addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(136, 0).mirror().addBox(-0.5F, -1.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, 1.3757F, -3.8121F, 0.5672F, 0.3704F, -0.629F));

		PartDefinition cube_r54 = bone10.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 124).mirror().addBox(-0.763F, -0.0723F, -1.7143F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.3704F, -0.0367F, -0.8309F));

		PartDefinition cube_r55 = bone10.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 134).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.5891F, 4.8411F, 2.6115F, 0.0723F, 0.1541F, -0.5523F));

		PartDefinition cube_r56 = bone10.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(127, 85).mirror().addBox(1.2843F, 0.1712F, -6.8575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.45F, -0.0231F, 0.3935F, -0.5269F));

		PartDefinition cube_r57 = bone10.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(107, 21).mirror().addBox(0.1375F, -0.5736F, -1.856F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(111, 77).mirror().addBox(-0.8625F, -0.5736F, -1.856F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5121F, 1.4877F, 1.9836F, -0.5012F, 0.056F, -0.4147F));

		PartDefinition cube_r58 = bone10.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-1.2709F, -3.0171F, -4.3546F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, -0.2658F, -0.036F, -0.2594F));

		PartDefinition cube_r59 = bone10.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-0.5039F, 0.0172F, -5.355F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.45F, -0.0219F, 0.2364F, -0.5231F));

		PartDefinition cube_r60 = bone10.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(-1.8757F, 0.0429F, -7.391F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.45F, -0.0214F, 0.0619F, -0.5193F));

		PartDefinition cube_r61 = bone10.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-1.5F, -0.425F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4721F, 0.5794F, -0.576F, -0.2797F, 0.0515F, -0.4646F));

		PartDefinition cube_r62 = bone10.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-1.2206F, -0.5736F, -2.0186F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5121F, 1.4877F, 1.9836F, -0.5416F, 0.3747F, -0.6008F));

		PartDefinition cube_r63 = bone10.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 56).mirror().addBox(-1.0166F, -0.8811F, -0.4043F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.561F, 0.1541F, -0.7705F));

		PartDefinition cube_r64 = bone10.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(112, 52).mirror().addBox(-1.2895F, -2.2285F, -2.2993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, -0.1724F, -0.0272F, -0.1547F));

		PartDefinition cube_r65 = bone10.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(14, 122).mirror().addBox(-1.8976F, -1.8562F, -1.65F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, -0.1665F, -0.0128F, 0.1127F));

		PartDefinition cube_r66 = bone10.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 135).mirror().addBox(-1.0669F, -1.7493F, -0.6318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.7927F, 0.0659F, -0.4124F));

		PartDefinition cube_r67 = bone10.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(134, 4).mirror().addBox(-0.763F, -2.8095F, -1.74F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.5275F, -0.0367F, -0.8309F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(93, 67).addBox(-1.5F, 8.2833F, -3.7553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.8F, 1.4999F, -1.1448F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 95).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftleg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 94).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.2288F, 0.1275F, 0.0296F));

		PartDefinition cube_r70 = leftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(127, 19).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(134, 129).addBox(-0.1F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(108, 59).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(109, 117).addBox(-1.601F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 122).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(75, 117).addBox(-1.5F, -5.8767F, 0.9508F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, -0.1445F, -0.2592F, 0.0373F));

		PartDefinition cube_r75 = leftleg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(102, 113).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(119, 67).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftfoot.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(123, 36).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(86, 47).addBox(-1.999F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-1.5F, 8.2833F, -3.7553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8F, 1.4999F, -1.1448F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r77 = rightleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(84, 95).mirror().addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 94).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.1919F, -0.3002F, -0.0574F));

		PartDefinition cube_r79 = rightleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(127, 19).mirror().addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(134, 129).mirror().addBox(-0.9F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(108, 59).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(109, 117).mirror().addBox(-0.399F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 122).mirror().addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(75, 117).mirror().addBox(-0.5F, -5.8767F, 0.9508F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightleg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(102, 113).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(119, 67).mirror().addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightfoot.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 36).mirror().addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(86, 47).mirror().addBox(-2.001F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone7 = hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(7.898F, 1.0309F, -1.2425F));

		PartDefinition cube_r86 = bone7.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(83, 80).addBox(-1.0F, 0.0447F, -0.0543F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.398F, -3.1814F, 0.3574F, -0.248F, -0.1693F, 0.0426F));

		PartDefinition cube_r87 = bone7.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 9).addBox(-0.7F, 0.1662F, -0.1284F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4619F, 1.7626F, -6.6579F, -0.0074F, -0.1151F, 1.1354F));

		PartDefinition cube_r88 = bone7.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(67, 53).addBox(-2.225F, 0.1662F, -0.1284F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, 1.7626F, -6.6579F, -0.0074F, -0.0278F, 1.1347F));

		PartDefinition cube_r89 = bone7.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(44, 45).addBox(0.3F, 0.1662F, -6.6284F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5936F, -3.3926F, -0.0669F, -0.0115F, 0.0132F, 0.8551F));

		PartDefinition cube_r90 = bone7.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 54).addBox(0.0F, 0.0447F, -0.0543F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.398F, -3.1814F, 0.3574F, -0.286F, 0.0895F, 0.9249F));

		PartDefinition cube_r91 = bone7.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(34, 78).addBox(-0.325F, 0.0447F, -0.0543F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2869F, -0.1199F, 0.9864F));

		PartDefinition bone16 = hips.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(-7.898F, 1.0309F, -1.2425F));

		PartDefinition cube_r92 = bone16.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(0.0F, 0.0447F, -0.0543F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.398F, -3.1814F, 0.3574F, -0.248F, 0.1693F, -0.0426F));

		PartDefinition cube_r93 = bone16.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-0.3F, 0.1662F, -0.1284F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, 1.7626F, -6.6579F, -0.0074F, 0.1151F, -1.1354F));

		PartDefinition cube_r94 = bone16.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(0.225F, 0.1662F, -0.1284F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, 1.7626F, -6.6579F, -0.0074F, 0.0278F, -1.1347F));

		PartDefinition cube_r95 = bone16.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-4.3F, 0.1662F, -6.6284F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5936F, -3.3926F, -0.0669F, -0.0115F, -0.0132F, -0.8551F));

		PartDefinition cube_r96 = bone16.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 54).mirror().addBox(-4.0F, 0.0447F, -0.0543F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.398F, -3.1814F, 0.3574F, -0.286F, -0.0895F, -0.9249F));

		PartDefinition cube_r97 = bone16.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(-1.675F, 0.0447F, -0.0543F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2869F, 0.1199F, -0.9864F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4844F, -7.332F, 0.2096F, -0.0427F, -0.0091F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(118, 49).addBox(0.5F, -0.9278F, -0.0823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(14, 116).addBox(0.5F, -1.1248F, 3.8203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 97).addBox(0.5F, -0.9917F, 1.8215F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 62).addBox(0.0F, 0.0083F, -0.1785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 110).addBox(0.5F, -0.6917F, -0.1785F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 21).addBox(-1.0F, 0.6836F, 0.4585F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0998F, -7.9586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 114).mirror().addBox(-5.1126F, 0.0089F, -0.5524F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.1561F, -0.0177F, 0.1121F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(127, 43).mirror().addBox(-6.8831F, -3.3481F, -0.5454F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.1298F, 0.0887F, -0.5964F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(108, 65).mirror().addBox(-7.7443F, -7.1457F, -0.5454F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.0343F, 0.1533F, -1.35F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(114, 5).mirror().addBox(-5.0234F, -0.149F, -0.4587F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.2081F, -0.0235F, 0.111F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(132, 41).mirror().addBox(-6.7134F, -3.4071F, -0.4379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.1734F, 0.118F, -0.5919F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 36).mirror().addBox(-9.5799F, -7.0731F, -0.4379F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.046F, 0.2044F, -1.3479F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(112, 41).mirror().addBox(-4.6118F, -0.0268F, -0.3764F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.295F, -0.0325F, 0.126F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(132, 13).mirror().addBox(-6.4847F, -3.0422F, -0.3438F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.2465F, 0.1669F, -0.5641F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 27).mirror().addBox(-10.6615F, -6.6502F, -0.3438F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.0655F, 0.2896F, -1.3257F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 114).addBox(0.1126F, 0.0089F, -0.5524F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.1561F, 0.0177F, -0.1121F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(127, 43).addBox(3.8831F, -3.3481F, -0.5454F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.1298F, -0.0887F, 0.5964F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(108, 65).addBox(2.7443F, -7.1457F, -0.5454F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.0343F, -0.1533F, 1.35F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(114, 5).addBox(0.0234F, -0.149F, -0.4587F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.2081F, 0.0235F, -0.111F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(132, 41).addBox(3.7134F, -3.4071F, -0.4379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.1734F, -0.118F, 0.5919F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(88, 36).addBox(2.5798F, -7.0731F, -0.4379F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.046F, -0.2044F, 1.3479F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(112, 41).addBox(-0.3882F, -0.0268F, -0.3764F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.295F, 0.0325F, -0.126F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(132, 13).addBox(3.4847F, -3.0422F, -0.3438F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.2465F, -0.1669F, 0.5641F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(128, 58).addBox(-0.5F, 2.5165F, -0.4274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8978F, -3.5496F, 1.3754F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(132, 37).addBox(-0.5F, 0.4299F, -0.9589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8978F, -3.5496F, 1.4626F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(129, 89).addBox(-0.5F, -1.5557F, -1.1794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8978F, -3.5496F, 1.419F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(113, 129).addBox(-0.5F, -3.5701F, -1.0401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8978F, -3.5496F, 1.5499F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 27).addBox(2.6615F, -6.6502F, -0.3438F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.0655F, -0.2896F, 1.3257F));

		PartDefinition osteoderns = body.addOrReplaceChild("osteoderns", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9986F, 0.7423F, -3.3178F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r125 = osteoderns.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 140).addBox(-0.5006F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7657F, 2.3643F, 2.797F, 2.4634F, 0.0353F, 2.0449F));

		PartDefinition cube_r126 = osteoderns.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(41, 134).addBox(-0.5006F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7657F, 2.3643F, 2.797F, 2.7339F, 0.0353F, 2.0449F));

		PartDefinition cube_r127 = osteoderns.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(66, 117).addBox(-0.5006F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7657F, 2.3643F, 2.797F, 0.5871F, 0.0353F, 2.0449F));

		PartDefinition cube_r128 = osteoderns.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(84, 102).addBox(-0.5006F, -0.3821F, -1.3363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7657F, 2.3643F, 2.797F, 0.7617F, 0.0353F, 2.0449F));

		PartDefinition cube_r129 = osteoderns.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(83, 88).addBox(-0.5006F, -0.3821F, -1.7363F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.0657F, 2.3643F, -0.303F, 0.8781F, -0.0246F, 2.0456F));

		PartDefinition cube_r130 = osteoderns.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5006F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0657F, 2.3643F, -0.303F, 0.7036F, -0.0246F, 2.0456F));

		PartDefinition cube_r131 = osteoderns.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(31, 134).addBox(-0.5006F, -2.575F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0657F, 2.3643F, -0.303F, 2.8503F, -0.0246F, 2.0456F));

		PartDefinition cube_r132 = osteoderns.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(139, 139).addBox(-0.5006F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0657F, 2.3643F, -0.303F, 2.5798F, -0.0246F, 2.0456F));

		PartDefinition cube_r133 = osteoderns.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 140).addBox(-0.5006F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4657F, 2.3643F, -3.403F, 3.057F, -0.2525F, 1.978F));

		PartDefinition cube_r134 = osteoderns.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 134).addBox(-0.5006F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4657F, 2.3643F, -3.403F, -2.9557F, -0.2525F, 1.978F));

		PartDefinition cube_r135 = osteoderns.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(82, 116).addBox(-0.5006F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4657F, 2.3643F, -3.403F, 1.1807F, -0.2525F, 1.978F));

		PartDefinition cube_r136 = osteoderns.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(46, 104).addBox(-0.5006F, -0.3821F, -1.1363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.4657F, 2.3643F, -3.403F, 1.3553F, -0.2525F, 1.978F));

		PartDefinition cube_r137 = osteoderns.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(87, 132).addBox(-1.0825F, -2.3947F, -1.7889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0217F, 0.3311F, -0.8735F, 1.5018F, -0.0882F, 1.2802F));

		PartDefinition cube_r138 = osteoderns.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(7, 130).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.066F, 0.1178F, -0.7773F, 1.4145F, -0.0882F, 1.2802F));

		PartDefinition cube_r139 = osteoderns.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(133, 75).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4972F, 0.4455F, 3.0507F, 1.3459F, -0.0046F, 1.2813F));

		PartDefinition cube_r140 = osteoderns.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(133, 71).addBox(1.1964F, -1.0808F, 0.8368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4038F, -0.4962F, 3.0892F, 1.2717F, -0.0613F, 0.8193F));

		PartDefinition cube_r141 = osteoderns.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(91, 119).addBox(-0.2096F, -0.7395F, -0.4181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4038F, -0.4962F, 3.0892F, 1.2535F, -0.0855F, 0.4728F));

		PartDefinition cube_r142 = osteoderns.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 0).addBox(-2.0532F, -0.4517F, -1.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4038F, -0.4962F, 3.0892F, 1.2477F, -0.0995F, 0.2995F));

		PartDefinition cube_r143 = osteoderns.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(78, 133).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.5783F, -2.0324F, 3.3068F, 1.2503F, 0.0F, 0.3862F));

		PartDefinition cube_r144 = osteoderns.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(57, 128).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7726F, 0.3341F, 1.2355F, 1.3272F, -0.0882F, 1.2802F));

		PartDefinition cube_r145 = osteoderns.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(129, 80).addBox(-0.9032F, -2.2602F, -1.6488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 130).addBox(-0.5032F, -0.4602F, -1.4738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3217F, -1.2689F, -0.8735F, 1.3754F, -0.1249F, 0.8137F));

		PartDefinition cube_r146 = osteoderns.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(126, 94).addBox(-0.1032F, 1.5575F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3217F, -1.2689F, -0.8735F, 1.3317F, -0.1249F, 0.8137F));

		PartDefinition cube_r147 = osteoderns.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(127, 15).addBox(-0.1032F, 1.5575F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5783F, -2.1689F, -0.8735F, 1.3317F, -0.1249F, 0.4646F));

		PartDefinition cube_r148 = osteoderns.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(127, 117).addBox(-0.9032F, -2.4602F, -1.5488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(71, 132).addBox(-0.5032F, -0.4602F, -1.3738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5783F, -2.1689F, -0.8735F, 1.3754F, -0.1249F, 0.4646F));

		PartDefinition cube_r149 = osteoderns.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(118, 21).addBox(-0.1032F, 1.5575F, -1.8637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.6783F, -2.5689F, -0.8735F, 1.3317F, -0.1249F, 0.2901F));

		PartDefinition cube_r150 = osteoderns.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(118, 117).addBox(-0.9032F, -2.2602F, -2.2488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(118, 87).addBox(-0.5032F, -0.4602F, -1.9488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.6783F, -2.5689F, -0.8735F, 1.3754F, -0.1249F, 0.2901F));

		PartDefinition cube_r151 = osteoderns.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(80, 129).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.2861F, -2.3507F, 1.2039F, 1.3317F, 0.0F, 0.3773F));

		PartDefinition cube_r152 = osteoderns.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(129, 0).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.5854F, -3.1506F, -2.9384F, 1.3754F, 0.0F, 0.3773F));

		PartDefinition cube_r153 = osteoderns.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(106, 127).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.3713F, -2.8119F, -0.8253F, 1.3754F, 0.0F, 0.3773F));

		PartDefinition osteoderns2 = body.addOrReplaceChild("osteoderns2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9986F, 0.7423F, -3.3178F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r154 = osteoderns2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(10, 140).mirror().addBox(-0.4994F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7657F, 2.3643F, 2.797F, 2.4634F, -0.0353F, -2.0449F));

		PartDefinition cube_r155 = osteoderns2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 134).mirror().addBox(-0.4994F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7657F, 2.3643F, 2.797F, 2.7339F, -0.0353F, -2.0449F));

		PartDefinition cube_r156 = osteoderns2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(66, 117).mirror().addBox(-0.4994F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7657F, 2.3643F, 2.797F, 0.5871F, -0.0353F, -2.0449F));

		PartDefinition cube_r157 = osteoderns2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(84, 102).mirror().addBox(-0.4994F, -0.3821F, -1.3363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7657F, 2.3643F, 2.797F, 0.7617F, -0.0353F, -2.0449F));

		PartDefinition cube_r158 = osteoderns2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(-0.4994F, -0.3821F, -1.7363F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.0657F, 2.3643F, -0.303F, 0.8781F, 0.0246F, -2.0456F));

		PartDefinition cube_r159 = osteoderns2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(5, 116).mirror().addBox(-0.4994F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0657F, 2.3643F, -0.303F, 0.7036F, 0.0246F, -2.0456F));

		PartDefinition cube_r160 = osteoderns2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(31, 134).mirror().addBox(-0.4994F, -2.575F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0657F, 2.3643F, -0.303F, 2.8503F, 0.0246F, -2.0456F));

		PartDefinition cube_r161 = osteoderns2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(139, 139).mirror().addBox(-0.4994F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0657F, 2.3643F, -0.303F, 2.5798F, 0.0246F, -2.0456F));

		PartDefinition cube_r162 = osteoderns2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.4994F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4657F, 2.3643F, -3.403F, 3.057F, 0.2525F, -1.978F));

		PartDefinition cube_r163 = osteoderns2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(36, 134).mirror().addBox(-0.4994F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4657F, 2.3643F, -3.403F, -2.9557F, 0.2525F, -1.978F));

		PartDefinition cube_r164 = osteoderns2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(82, 116).mirror().addBox(-0.4994F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4657F, 2.3643F, -3.403F, 1.1807F, 0.2525F, -1.978F));

		PartDefinition cube_r165 = osteoderns2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(46, 104).mirror().addBox(-0.4994F, -0.3821F, -1.1363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.4657F, 2.3643F, -3.403F, 1.3553F, 0.2525F, -1.978F));

		PartDefinition cube_r166 = osteoderns2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(87, 132).mirror().addBox(0.0825F, -2.3947F, -1.7889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0217F, 0.3311F, -0.8735F, 1.5018F, 0.0882F, -1.2802F));

		PartDefinition cube_r167 = osteoderns2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(7, 130).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.066F, 0.1178F, -0.7773F, 1.4145F, 0.0882F, -1.2802F));

		PartDefinition cube_r168 = osteoderns2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(133, 75).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4972F, 0.4455F, 3.0507F, 1.3459F, 0.0046F, -1.2813F));

		PartDefinition cube_r169 = osteoderns2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(133, 71).mirror().addBox(-2.1964F, -1.0808F, 0.8368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4038F, -0.4962F, 3.0892F, 1.2717F, 0.0613F, -0.8193F));

		PartDefinition cube_r170 = osteoderns2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 119).mirror().addBox(-0.7904F, -0.7395F, -0.4181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4038F, -0.4962F, 3.0892F, 1.2535F, 0.0855F, -0.4728F));

		PartDefinition cube_r171 = osteoderns2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(1.0532F, -0.4517F, -1.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4038F, -0.4962F, 3.0892F, 1.2477F, 0.0995F, -0.2995F));

		PartDefinition cube_r172 = osteoderns2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 133).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.5783F, -2.0324F, 3.3068F, 1.2503F, 0.0F, -0.3862F));

		PartDefinition cube_r173 = osteoderns2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 128).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7726F, 0.3341F, 1.2355F, 1.3272F, 0.0882F, -1.2802F));

		PartDefinition cube_r174 = osteoderns2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(129, 80).mirror().addBox(-0.0968F, -2.2602F, -1.6488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 130).mirror().addBox(-0.4968F, -0.4602F, -1.4738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3217F, -1.2689F, -0.8735F, 1.3754F, 0.1249F, -0.8137F));

		PartDefinition cube_r175 = osteoderns2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(126, 94).mirror().addBox(-0.8968F, 1.5575F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3217F, -1.2689F, -0.8735F, 1.3317F, 0.1249F, -0.8137F));

		PartDefinition cube_r176 = osteoderns2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(127, 15).mirror().addBox(-0.8968F, 1.5575F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5783F, -2.1689F, -0.8735F, 1.3317F, 0.1249F, -0.4646F));

		PartDefinition cube_r177 = osteoderns2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(127, 117).mirror().addBox(-0.0968F, -2.4602F, -1.5488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(71, 132).mirror().addBox(-0.4968F, -0.4602F, -1.3738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5783F, -2.1689F, -0.8735F, 1.3754F, 0.1249F, -0.4646F));

		PartDefinition cube_r178 = osteoderns2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(118, 21).mirror().addBox(-0.8968F, 1.5575F, -1.8637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.6783F, -2.5689F, -0.8735F, 1.3317F, 0.1249F, -0.2901F));

		PartDefinition cube_r179 = osteoderns2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(118, 117).mirror().addBox(-0.0968F, -2.2602F, -2.2488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(118, 87).mirror().addBox(-0.4968F, -0.4602F, -1.9488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.6783F, -2.5689F, -0.8735F, 1.3754F, 0.1249F, -0.2901F));

		PartDefinition cube_r180 = osteoderns2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(80, 129).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.2861F, -2.3507F, 1.2039F, 1.3317F, 0.0F, -0.3773F));

		PartDefinition cube_r181 = osteoderns2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(129, 0).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.5854F, -3.1506F, -2.9384F, 1.3754F, 0.0F, -0.3773F));

		PartDefinition cube_r182 = osteoderns2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(106, 127).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.3713F, -2.8119F, -0.8253F, 1.3754F, 0.0F, -0.3773F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1983F, -7.1F, 0.0611F, -0.0436F, -0.0008F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(23, 41).addBox(-2.0354F, -1.8566F, 1.7649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 107).addBox(-2.0354F, -1.3047F, -0.1939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(51, 78).addBox(-3.3387F, -0.1253F, -4.7678F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 30).addBox(-3.0F, -0.6F, -2.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 92).addBox(-2.0F, -0.6F, -0.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8402F, -6.7901F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(0.7713F, 0.3128F, -1.4611F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.5615F, -1.2695F, -0.3985F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.1333F, 0.1706F, -1.4985F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.6278F, -1.2984F, -0.4676F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-1.4408F, -0.0115F, -2.4033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.6845F, -1.2609F, -0.44F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-2.446F, -0.3002F, -2.2474F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.9817F, -1.3212F, -0.6643F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(119, 63).mirror().addBox(-4.0306F, -0.0622F, -0.3718F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.3736F, -0.0377F, 0.1579F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-6.007F, -2.6993F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.3119F, 0.2124F, -0.5171F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(-10.546F, -6.0737F, -0.3718F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.0811F, 0.367F, -1.286F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(133, 105).mirror().addBox(-5.227F, -1.4467F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.5395F, 0.3394F, -0.5075F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(114, 43).mirror().addBox(-7.8298F, -4.6257F, -0.2884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.156F, 0.6112F, -1.3033F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(108, 133).mirror().addBox(-2.6201F, 0.3714F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.6253F, -0.0666F, 0.0919F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(122, 78).mirror().addBox(-4.0716F, -0.0008F, -0.5301F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.5382F, -0.0583F, 0.045F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(133, 103).mirror().addBox(-6.0782F, -2.6799F, -0.5301F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.4598F, 0.296F, -0.5847F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(105, 35).mirror().addBox(-8.6113F, -6.1081F, -0.5301F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.1293F, 0.5269F, -1.3701F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 114).mirror().addBox(-4.0245F, 0.2754F, -0.5387F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.4686F, -0.0514F, 0.0837F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-6.2239F, -2.4405F, -0.5387F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.3976F, 0.2601F, -0.5669F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-9.8811F, -6.0324F, -0.5387F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.1098F, 0.4592F, -1.3444F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 62).addBox(-1.7713F, 0.3128F, -1.4611F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.5615F, 1.2695F, 0.3985F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(60, 0).addBox(-0.8667F, 0.1706F, -1.4985F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.6278F, 1.2984F, 0.4676F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 44).addBox(0.4408F, -0.0115F, -2.4033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.6845F, 1.2609F, 0.44F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(79, 0).addBox(1.446F, -0.3002F, -2.2474F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.9817F, 1.3212F, 0.6643F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(57, 114).addBox(-2.5354F, -0.4162F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(88, 15).addBox(-2.0354F, -1.9507F, 5.7582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 18).addBox(-2.0354F, -1.9507F, 3.7582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(119, 63).addBox(0.0306F, -0.0622F, -0.3718F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.3736F, 0.0377F, -0.1579F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(132, 23).addBox(3.007F, -2.6993F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.3119F, -0.2124F, 0.5171F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(86, 60).addBox(2.546F, -6.0737F, -0.3718F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.0811F, -0.367F, 1.286F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(133, 105).addBox(2.227F, -1.4467F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.5395F, -0.3394F, 0.5075F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(114, 43).addBox(2.8297F, -4.6257F, -0.2884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.156F, -0.6112F, 1.3033F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(108, 133).addBox(-0.3799F, 0.3714F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.6253F, 0.0666F, -0.0919F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(122, 78).addBox(0.0716F, -0.0008F, -0.5301F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.5382F, 0.0583F, -0.045F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(133, 103).addBox(3.0782F, -2.6799F, -0.5301F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.4598F, -0.296F, 0.5847F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(105, 35).addBox(2.6113F, -6.1081F, -0.5301F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.1293F, -0.5269F, 1.3701F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(25, 114).addBox(-0.9755F, 0.2754F, -0.5387F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.4686F, 0.0514F, -0.0837F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(133, 101).addBox(3.2239F, -2.4405F, -0.5387F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.3976F, -0.2601F, 0.5669F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(132, 62).addBox(-0.5F, 0.5674F, -2.7083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.684F, -1.845F, 1.2413F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(52, 132).addBox(-0.5F, 0.3516F, -2.735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.584F, -3.245F, 1.2413F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(31, 139).addBox(-0.5F, 0.5503F, 0.1654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.584F, -5.245F, -0.1986F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(91, 108).addBox(-0.5F, 0.2293F, -2.5832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.584F, -5.245F, 1.2413F, 0.0F, 0.0F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(139, 127).addBox(-0.5F, 1.0964F, -1.3499F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.584F, -5.245F, -0.155F, 0.0F, 0.0F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(47, 86).addBox(-0.5F, -1.2018F, -3.3224F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.584F, -5.245F, 1.2849F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(94, 27).addBox(2.8811F, -6.0324F, -0.5387F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.1098F, -0.4592F, 1.3444F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 101).addBox(-1.0F, 1.0484F, -0.0506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7756F, -8.0525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, 0.975F, -0.0797F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6442F, -5.3011F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(88, 29).addBox(-2.5354F, -0.6794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.5155F, -0.713F, -5.1201F));

		PartDefinition cube_r230 = bone5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(43, 121).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9539F, 3.7065F, -0.1018F, 0.22F, -0.2817F, 1.2557F));

		PartDefinition cube_r231 = bone5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(121, 49).addBox(-0.725F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.7866F, 5.1036F, -0.1032F, 0.2112F, 0.0168F, 1.3214F));

		PartDefinition cube_r232 = bone5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(88, 8).addBox(-0.0117F, -0.0106F, -0.0637F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9694F, 3.3738F, 0.6558F, 0.0742F, -0.1772F, 1.1715F));

		PartDefinition cube_r233 = bone5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(57, 71).addBox(-0.0117F, -0.0106F, -0.0637F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9052F, 0.8498F, 0.1652F, 0.1478F, -0.123F, 0.689F));

		PartDefinition cube_r234 = bone5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(93, 62).addBox(0.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8897F, 1.2754F, -0.9389F, 0.2579F, -0.2108F, 0.6707F));

		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(92, 22).addBox(0.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0155F, 0.4568F, -1.2207F, 0.3243F, -0.0705F, 0.2066F));

		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(38, 71).addBox(-0.0117F, -0.0106F, -0.0637F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1875F, -0.0413F, 0.2143F));

		PartDefinition bone14 = chest.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(-1.5155F, -0.713F, -5.1201F));

		PartDefinition cube_r237 = bone14.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(43, 121).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9539F, 3.7065F, -0.1018F, 0.22F, 0.2817F, -1.2557F));

		PartDefinition cube_r238 = bone14.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(121, 49).mirror().addBox(-0.275F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.7866F, 5.1036F, -0.1032F, 0.2112F, -0.0168F, -1.3214F));

		PartDefinition cube_r239 = bone14.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(-1.9883F, -0.0106F, -0.0637F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9694F, 3.3738F, 0.6558F, 0.0742F, 0.1772F, -1.1715F));

		PartDefinition cube_r240 = bone14.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-3.9883F, -0.0106F, -0.0637F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9052F, 0.8498F, 0.1652F, 0.1478F, 0.123F, -0.689F));

		PartDefinition cube_r241 = bone14.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-4.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8897F, 1.2754F, -0.9389F, 0.2579F, 0.2108F, -0.6707F));

		PartDefinition cube_r242 = bone14.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-4.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0155F, 0.4568F, -1.2207F, 0.3243F, 0.0705F, -0.2066F));

		PartDefinition cube_r243 = bone14.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(38, 71).mirror().addBox(-3.9883F, -0.0106F, -0.0637F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1875F, 0.0413F, -0.2143F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5114F, -7.6554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r244 = osteoderms4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(87, 124).addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5781F, 5.1461F, 4.4651F, 1.1933F, -0.2149F, 1.4675F));

		PartDefinition cube_r245 = osteoderms4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 110).addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(5.5781F, 5.1461F, 4.4651F, 1.5598F, -0.2149F, 1.4675F));

		PartDefinition cube_r246 = osteoderms4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(134, 84).addBox(-0.5006F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4643F, 5.3734F, 5.3218F, -2.9557F, -0.2525F, 1.978F));

		PartDefinition cube_r247 = osteoderms4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(15, 140).addBox(-0.5006F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.4643F, 5.3734F, 5.3218F, 3.057F, -0.2525F, 1.978F));

		PartDefinition cube_r248 = osteoderms4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(103, 44).addBox(-0.5006F, -0.3821F, -1.1363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(8.4643F, 5.3734F, 5.3218F, 1.3553F, -0.2525F, 1.978F));

		PartDefinition cube_r249 = osteoderms4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(117, 104).addBox(-0.5006F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.4643F, 5.3734F, 5.3218F, 1.1807F, -0.2525F, 1.978F));

		PartDefinition cube_r250 = osteoderms4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(100, 117).addBox(-0.478F, -0.9553F, -0.523F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.9376F, 5.5025F, 2.6326F, 1.2346F, -0.1723F, 1.8522F));

		PartDefinition cube_r251 = osteoderms4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(103, 5).addBox(-0.478F, -0.4995F, -1.1448F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.9376F, 5.5025F, 2.6326F, 1.4091F, -0.1723F, 1.8522F));

		PartDefinition cube_r252 = osteoderms4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(5, 140).addBox(-0.478F, -2.0785F, -0.1781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.9376F, 5.5025F, 2.6326F, 3.1108F, -0.1723F, 1.8522F));

		PartDefinition cube_r253 = osteoderms4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(46, 134).addBox(-0.478F, -2.4403F, -0.5791F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9376F, 5.5025F, 2.6326F, -2.8582F, -0.1723F, 1.8522F));

		PartDefinition cube_r254 = osteoderms4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(91, 114).addBox(-0.4653F, -1.0256F, -0.5333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.0F, 4.6204F, -2.1727F, 1.4815F, 0.0418F, 2.1001F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 38).addBox(-0.4653F, -0.5706F, -1.1428F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.0F, 4.6204F, -2.1727F, 1.6561F, 0.0418F, 2.1001F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(139, 135).addBox(-0.4653F, -2.0672F, -0.1079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 4.6204F, -2.1727F, -2.9254F, 0.0418F, 2.1001F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(64, 134).addBox(-0.4947F, -2.3815F, -0.5856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 4.6204F, -2.1727F, -2.6113F, 0.0418F, 2.1001F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(15, 135).addBox(-0.5062F, -2.405F, -0.5257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3045F, 5.6643F, 0.1805F, -2.7744F, 0.1237F, 2.0595F));

		PartDefinition cube_r259 = osteoderms4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(139, 131).addBox(-0.5062F, -2.0614F, -0.1164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.3045F, 5.6643F, 0.1805F, -3.0886F, 0.1237F, 2.0595F));

		PartDefinition cube_r260 = osteoderms4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(24, 102).addBox(-0.5062F, -0.5629F, -1.1359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.3045F, 5.6643F, 0.1805F, 1.4929F, 0.1237F, 2.0595F));

		PartDefinition cube_r261 = osteoderms4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(34, 121).addBox(-0.6745F, -0.0355F, -1.9265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.7573F, 3.2115F, 6.1612F, 1.4519F, -0.1085F, 1.2249F));

		PartDefinition cube_r262 = osteoderms4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(135, 66).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.8331F, 3.3195F, 4.5111F, -0.0294F, -0.0962F, 1.2365F));

		PartDefinition cube_r263 = osteoderms4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(139, 62).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.2303F, 3.4818F, -1.4702F, -0.204F, -0.0962F, 1.2365F));

		PartDefinition cube_r264 = osteoderms4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(134, 137).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0316F, 2.7103F, -1.4517F, -0.1525F, -0.1519F, 0.8209F));

		PartDefinition cube_r265 = osteoderms4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(56, 138).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9038F, 0.9878F, -1.5125F, -0.2335F, -0.1466F, 0.5302F));

		PartDefinition cube_r266 = osteoderms4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(119, 137).addBox(-0.7967F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.9471F, 3.3619F, 2.3548F, 0.1887F, -0.0962F, 1.2365F));

		PartDefinition cube_r267 = osteoderms4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(124, 137).addBox(-0.7967F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.8471F, 1.9619F, 2.4548F, 0.022F, -0.1519F, 0.8209F));

		PartDefinition cube_r268 = osteoderms4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(129, 137).addBox(-0.7721F, 0.0538F, -2.4133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0195F, 0.7595F, 2.456F, -0.1026F, -0.1466F, 0.5302F));

		PartDefinition cube_r269 = osteoderms4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(114, 137).addBox(-0.7967F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.9471F, 3.3619F, 4.3548F, 0.1887F, -0.0962F, 1.2365F));

		PartDefinition cube_r270 = osteoderms4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(121, 31).addBox(-0.172F, 1.3531F, -1.2674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.8471F, 1.9619F, 4.4548F, 1.5037F, -0.1659F, 0.8114F));

		PartDefinition cube_r271 = osteoderms4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(109, 135).addBox(-0.5621F, -1.3773F, -0.5575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(79, 137).addBox(-0.7967F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.8471F, 1.9619F, 4.4548F, 0.022F, -0.1519F, 0.8209F));

		PartDefinition cube_r272 = osteoderms4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(121, 26).addBox(-0.1474F, 1.3458F, -1.2569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0195F, 0.7595F, 4.456F, 1.3787F, -0.1617F, 0.5226F));

		PartDefinition cube_r273 = osteoderms4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(104, 135).addBox(-0.5375F, -1.2886F, -0.5635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 137).addBox(-0.7721F, -0.3462F, -2.4133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0195F, 0.7595F, 4.456F, -0.1026F, -0.1466F, 0.5302F));

		PartDefinition cube_r274 = osteoderms4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(21, 134).addBox(-0.7961F, -0.9224F, -2.4805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 135).addBox(-0.5615F, -0.6648F, -0.6307F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1399F, 0.2975F, 4.6885F, -0.1216F, -0.186F, 0.4461F));

		PartDefinition cube_r275 = osteoderms4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(106, 101).addBox(-0.1771F, 1.3266F, -2.1844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1399F, 0.2975F, 4.6885F, 1.36F, -0.2012F, 0.4387F));

		PartDefinition cube_r276 = osteoderms4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(132, 45).addBox(0.5608F, 4.1881F, 0.8999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7657F, -0.5651F, 1.2112F, 1.2008F, -0.1249F, 0.3773F));

		PartDefinition cube_r277 = osteoderms4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(26, 139).addBox(0.1841F, -1.656F, 2.7921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7657F, -0.7651F, 1.3112F, -0.2799F, -0.1087F, 0.3821F));

		PartDefinition cube_r278 = osteoderms4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(119, 58).addBox(0.1486F, 2.5455F, -0.053F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7657F, -0.7651F, 1.3112F, 1.16F, -0.1087F, 0.3821F));

		PartDefinition cube_r279 = osteoderms4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(106, 95).addBox(-0.2914F, -0.9724F, -2.5834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.445F, -1.7591F, 3.8738F, 1.16F, -0.1087F, 0.3821F));

		PartDefinition cube_r280 = osteoderms4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(139, 84).addBox(-0.2558F, 0.3936F, -1.0259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.445F, -1.7591F, 3.8738F, -0.2799F, -0.1087F, 0.3821F));

		PartDefinition cube_r281 = osteoderms4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(92, 15).addBox(-0.1583F, -0.2338F, -1.3941F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5657F, -0.6651F, 1.2112F, 1.1104F, -0.0913F, 0.5442F));

		PartDefinition cube_r282 = osteoderms4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(46, 139).addBox(-0.1228F, -0.689F, -0.1384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5657F, -0.6651F, 1.2112F, -0.3295F, -0.0913F, 0.5442F));

		PartDefinition cube_r283 = osteoderms4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(43, 116).addBox(-0.5062F, -1.0193F, -0.5252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.3045F, 5.6643F, 0.1805F, 1.3183F, 0.1237F, 2.0595F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.5114F, -7.6554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r284 = osteoderms15.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(87, 124).mirror().addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.5781F, 5.1461F, 4.4651F, 1.1933F, 0.2149F, -1.4675F));

		PartDefinition cube_r285 = osteoderms15.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(5, 110).mirror().addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.5781F, 5.1461F, 4.4651F, 1.5598F, 0.2149F, -1.4675F));

		PartDefinition cube_r286 = osteoderms15.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(134, 84).mirror().addBox(-0.4994F, -2.475F, -0.5683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4643F, 5.3734F, 5.3218F, -2.9557F, 0.2525F, -1.978F));

		PartDefinition cube_r287 = osteoderms15.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(15, 140).mirror().addBox(-0.4994F, -2.0853F, -0.2956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.4643F, 5.3734F, 5.3218F, 3.057F, 0.2525F, -1.978F));

		PartDefinition cube_r288 = osteoderms15.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(103, 44).mirror().addBox(-0.4994F, -0.3821F, -1.1363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-8.4643F, 5.3734F, 5.3218F, 1.3553F, 0.2525F, -1.978F));

		PartDefinition cube_r289 = osteoderms15.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(117, 104).mirror().addBox(-0.4994F, -0.8411F, -0.4942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-8.4643F, 5.3734F, 5.3218F, 1.1807F, 0.2525F, -1.978F));

		PartDefinition cube_r290 = osteoderms15.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(100, 117).mirror().addBox(-0.522F, -0.9553F, -0.523F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.9376F, 5.5025F, 2.6326F, 1.2346F, 0.1723F, -1.8522F));

		PartDefinition cube_r291 = osteoderms15.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(103, 5).mirror().addBox(-0.522F, -0.4995F, -1.1448F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.9376F, 5.5025F, 2.6326F, 1.4091F, 0.1723F, -1.8522F));

		PartDefinition cube_r292 = osteoderms15.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 140).mirror().addBox(-0.522F, -2.0785F, -0.1781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.9376F, 5.5025F, 2.6326F, 3.1108F, 0.1723F, -1.8522F));

		PartDefinition cube_r293 = osteoderms15.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(46, 134).mirror().addBox(-0.522F, -2.4403F, -0.5791F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9376F, 5.5025F, 2.6326F, -2.8582F, 0.1723F, -1.8522F));

		PartDefinition cube_r294 = osteoderms15.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(91, 114).mirror().addBox(-0.5347F, -1.0256F, -0.5333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 4.6204F, -2.1727F, 1.4815F, -0.0418F, -2.1001F));

		PartDefinition cube_r295 = osteoderms15.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-0.5347F, -0.5706F, -1.1428F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 4.6204F, -2.1727F, 1.6561F, -0.0418F, -2.1001F));

		PartDefinition cube_r296 = osteoderms15.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(139, 135).mirror().addBox(-0.5347F, -2.0672F, -0.1079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 4.6204F, -2.1727F, -2.9254F, -0.0418F, -2.1001F));

		PartDefinition cube_r297 = osteoderms15.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(64, 134).mirror().addBox(-0.5053F, -2.3815F, -0.5856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 4.6204F, -2.1727F, -2.6113F, -0.0418F, -2.1001F));

		PartDefinition cube_r298 = osteoderms15.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(15, 135).mirror().addBox(-0.4938F, -2.405F, -0.5257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3045F, 5.6643F, 0.1805F, -2.7744F, -0.1237F, -2.0595F));

		PartDefinition cube_r299 = osteoderms15.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(139, 131).mirror().addBox(-0.4938F, -2.0614F, -0.1164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.3045F, 5.6643F, 0.1805F, -3.0886F, -0.1237F, -2.0595F));

		PartDefinition cube_r300 = osteoderms15.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(24, 102).mirror().addBox(-0.4938F, -0.5629F, -1.1359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.3045F, 5.6643F, 0.1805F, 1.4929F, -0.1237F, -2.0595F));

		PartDefinition cube_r301 = osteoderms15.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(34, 121).mirror().addBox(-0.3255F, -0.0355F, -1.9265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-6.7573F, 3.2115F, 6.1612F, 1.4519F, 0.1085F, -1.2249F));

		PartDefinition cube_r302 = osteoderms15.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(135, 66).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.8331F, 3.3195F, 4.5111F, -0.0294F, 0.0962F, -1.2365F));

		PartDefinition cube_r303 = osteoderms15.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(139, 62).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.2303F, 3.4818F, -1.4702F, -0.204F, 0.0962F, -1.2365F));

		PartDefinition cube_r304 = osteoderms15.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(134, 137).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.0316F, 2.7103F, -1.4517F, -0.1525F, 0.1519F, -0.8209F));

		PartDefinition cube_r305 = osteoderms15.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(56, 138).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9038F, 0.9878F, -1.5125F, -0.2335F, 0.1466F, -0.5302F));

		PartDefinition cube_r306 = osteoderms15.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(119, 137).mirror().addBox(-0.2033F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.9471F, 3.3619F, 2.3548F, 0.1887F, 0.0962F, -1.2365F));

		PartDefinition cube_r307 = osteoderms15.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(124, 137).mirror().addBox(-0.2033F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8471F, 1.9619F, 2.4548F, 0.022F, 0.1519F, -0.8209F));

		PartDefinition cube_r308 = osteoderms15.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(129, 137).mirror().addBox(-0.2279F, 0.0538F, -2.4133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.0195F, 0.7595F, 2.456F, -0.1026F, 0.1466F, -0.5302F));

		PartDefinition cube_r309 = osteoderms15.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(114, 137).mirror().addBox(-0.2033F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.9471F, 3.3619F, 4.3548F, 0.1887F, 0.0962F, -1.2365F));

		PartDefinition cube_r310 = osteoderms15.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(121, 31).mirror().addBox(-0.828F, 1.3531F, -1.2674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8471F, 1.9619F, 4.4548F, 1.5037F, 0.1659F, -0.8114F));

		PartDefinition cube_r311 = osteoderms15.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(109, 135).mirror().addBox(-0.4379F, -1.3773F, -0.5575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(79, 137).mirror().addBox(-0.2033F, -1.0349F, -2.4073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.8471F, 1.9619F, 4.4548F, 0.022F, 0.1519F, -0.8209F));

		PartDefinition cube_r312 = osteoderms15.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(121, 26).mirror().addBox(-0.8526F, 1.3458F, -1.2569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.0195F, 0.7595F, 4.456F, 1.3787F, 0.1617F, -0.5226F));

		PartDefinition cube_r313 = osteoderms15.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(104, 135).mirror().addBox(-0.4625F, -1.2886F, -0.5635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 137).mirror().addBox(-0.2279F, -0.3462F, -2.4133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.0195F, 0.7595F, 4.456F, -0.1026F, 0.1466F, -0.5302F));

		PartDefinition cube_r314 = osteoderms15.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(21, 134).mirror().addBox(-0.2039F, -0.9224F, -2.4805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(99, 135).mirror().addBox(-0.4385F, -0.6648F, -0.6307F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1399F, 0.2975F, 4.6885F, -0.1216F, 0.186F, -0.4461F));

		PartDefinition cube_r315 = osteoderms15.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(106, 101).mirror().addBox(-0.8229F, 1.3266F, -2.1844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1399F, 0.2975F, 4.6885F, 1.36F, 0.2012F, -0.4387F));

		PartDefinition cube_r316 = osteoderms15.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(132, 45).mirror().addBox(-1.5608F, 4.1881F, 0.8999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7657F, -0.5651F, 1.2112F, 1.2008F, 0.1249F, -0.3773F));

		PartDefinition cube_r317 = osteoderms15.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(26, 139).mirror().addBox(-1.1841F, -1.656F, 2.7921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7657F, -0.7651F, 1.3112F, -0.2799F, 0.1087F, -0.3821F));

		PartDefinition cube_r318 = osteoderms15.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(119, 58).mirror().addBox(-1.1486F, 2.5455F, -0.053F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7657F, -0.7651F, 1.3112F, 1.16F, 0.1087F, -0.3821F));

		PartDefinition cube_r319 = osteoderms15.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(106, 95).mirror().addBox(-0.7086F, -0.9724F, -2.5834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.445F, -1.7591F, 3.8738F, 1.16F, 0.1087F, -0.3821F));

		PartDefinition cube_r320 = osteoderms15.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(139, 84).mirror().addBox(-0.7442F, 0.3936F, -1.0259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.445F, -1.7591F, 3.8738F, -0.2799F, 0.1087F, -0.3821F));

		PartDefinition cube_r321 = osteoderms15.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(92, 15).mirror().addBox(-0.8417F, -0.2338F, -1.3941F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5657F, -0.6651F, 1.2112F, 1.1104F, 0.0913F, -0.5442F));

		PartDefinition cube_r322 = osteoderms15.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(46, 139).mirror().addBox(-0.8772F, -0.689F, -0.1384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5657F, -0.6651F, 1.2112F, -0.3295F, 0.0913F, -0.5442F));

		PartDefinition cube_r323 = osteoderms15.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(43, 116).mirror().addBox(-0.4938F, -1.0193F, -0.5252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.3045F, 5.6643F, 0.1805F, 1.3183F, -0.1237F, -2.0595F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6695F, 3.3868F, -6.3762F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r324 = bone3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(136, 89).addBox(2.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6341F, -0.6835F, -0.8463F, 0.6482F, 0.5705F, 0.8236F));

		PartDefinition cube_r325 = bone3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(138, 123).addBox(-0.276F, -3.1823F, -1.2452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -1.3846F, 0.2244F, -0.096F));

		PartDefinition cube_r326 = bone3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(107, 122).addBox(-0.245F, -2.2236F, 0.4231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 0.1687F, 0.2244F, -0.096F));

		PartDefinition cube_r327 = bone3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(138, 119).addBox(-0.276F, -3.3738F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -0.8436F, 0.2244F, -0.096F));

		PartDefinition cube_r328 = bone3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(100, 122).addBox(-0.3958F, -1.725F, -1.9037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 1.0313F, 0.3585F, -0.0307F));

		PartDefinition cube_r329 = bone3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(122, 80).addBox(-0.3958F, -1.6361F, -0.4965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 0.6997F, 0.3585F, -0.0307F));

		PartDefinition cube_r330 = bone3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(95, 95).addBox(-0.2149F, 1.5463F, -2.3213F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -0.8144F, 0.435F, -0.0326F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(139, 18).addBox(2.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 108).addBox(2.3634F, 0.1949F, 0.1506F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6341F, -0.6835F, -0.8463F, 0.1071F, 0.5705F, 0.8236F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6695F, 3.3868F, -6.3762F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r332 = bone11.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(136, 89).mirror().addBox(-3.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.6341F, -0.6835F, -0.8463F, 0.6482F, -0.5705F, -0.8236F));

		PartDefinition cube_r333 = bone11.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(138, 123).mirror().addBox(-0.724F, -3.1823F, -1.2452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -1.3846F, -0.2244F, 0.096F));

		PartDefinition cube_r334 = bone11.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(107, 122).mirror().addBox(-0.755F, -2.2236F, 0.4231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 0.1687F, -0.2244F, 0.096F));

		PartDefinition cube_r335 = bone11.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(138, 119).mirror().addBox(-0.724F, -3.3738F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -0.8436F, -0.2244F, 0.096F));

		PartDefinition cube_r336 = bone11.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(100, 122).mirror().addBox(-0.6042F, -1.725F, -1.9037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 1.0313F, -0.3585F, 0.0307F));

		PartDefinition cube_r337 = bone11.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(-0.6042F, -1.6361F, -0.4965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 0.6997F, -0.3585F, 0.0307F));

		PartDefinition cube_r338 = bone11.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.7851F, 1.5463F, -2.3213F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -0.8144F, -0.435F, 0.0326F));

		PartDefinition cube_r339 = bone11.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(139, 18).mirror().addBox(-3.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 108).mirror().addBox(-3.3634F, 0.1949F, 0.1506F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6341F, -0.6835F, -0.8463F, 0.1071F, -0.5705F, -0.8236F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8118F, 7.5705F, -6.8296F, 0.1222F, -0.0008F, -0.2182F));

		PartDefinition cube_r340 = leftarm.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(75, 89).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r341 = leftarm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(94, 135).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.0969F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r342 = leftarm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(112, 27).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r343 = leftarm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(112, 37).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r344 = leftarm.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(127, 5).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6694F, 5.1524F, 2.2788F, -0.8913F, -0.6477F, 1.5311F));

		PartDefinition cube_r345 = leftarm2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(18, 114).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.67F, 0.5245F, -2.7163F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r346 = leftarm2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(75, 95).addBox(0.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 0.6601F, 0.6457F, -0.7939F));

		PartDefinition cube_r347 = lefthand.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(114, 45).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r348 = lefthand.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(13, 97).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r349 = lefthand.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(117, 109).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1616F, -0.2575F, 0.3364F));

		PartDefinition cube_r350 = lefthand.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(66, 122).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8118F, 7.5705F, -6.8296F, 0.2531F, 0.0008F, 0.2182F));

		PartDefinition cube_r351 = rightarm.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r352 = rightarm.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(94, 135).mirror().addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.0969F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r353 = rightarm.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(112, 27).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightarm.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(112, 37).mirror().addBox(-1.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightarm.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(127, 5).mirror().addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6694F, 5.1524F, 2.2788F, -0.8691F, 0.5322F, -1.4454F));

		PartDefinition cube_r356 = rightarm2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(18, 114).mirror().addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.67F, 0.5245F, -2.7163F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r357 = rightarm2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-2.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 0.7295F, -0.5618F, 0.6717F));

		PartDefinition cube_r358 = righthand.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(114, 45).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r359 = righthand.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.0509F, -0.0511F, 0.1759F));

		PartDefinition cube_r360 = righthand.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(117, 109).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r361 = righthand.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(66, 122).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7F, -7.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(142, 105).addBox(0.5F, -1.1F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 111).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(142, 99).addBox(0.5F, -0.6346F, -0.0211F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(133, 107).mirror().addBox(-2.556F, 0.0512F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.546F, 0.0398F, 0.0614F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(133, 97).mirror().addBox(-4.9685F, -1.6463F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.4045F, 0.3794F, -0.5866F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(133, 99).mirror().addBox(-5.5046F, -4.5953F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.0172F, 0.5471F, -1.4109F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(137, 54).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.293F, 0.2089F, -3.1F, 0.5735F, 0.2434F, -0.1481F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(138, 114).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.293F, 0.2089F, -3.1F, 0.2855F, 0.5554F, -0.8539F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(137, 54).addBox(-0.9849F, -0.1848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.293F, 0.2089F, -3.1F, 0.5735F, -0.2434F, 0.1481F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(133, 99).addBox(2.5046F, -4.5953F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.0172F, -0.5471F, 1.4109F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(133, 97).addBox(1.9685F, -1.6463F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.4045F, -0.3794F, 0.5866F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(133, 107).addBox(-0.444F, 0.0512F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.546F, -0.0398F, -0.0614F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(138, 114).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.293F, 0.2089F, -3.1F, 0.2855F, -0.5554F, 0.8539F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(96, 0).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7846F, -1.4877F, 0.1484F, 0.0F, 0.0F));

		PartDefinition bone4 = neck3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.5F, -2.2052F, -2.0561F));

		PartDefinition cube_r375 = bone4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 95).addBox(-1.5F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8918F, 3.5114F, 2.8019F, 0.7057F, 0.23F, 1.368F));

		PartDefinition cube_r376 = bone4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(61, 96).addBox(-0.05F, 0.05F, -1.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8198F, 0.675F, 0.9763F, 0.1361F, -0.305F, 0.7074F));

		PartDefinition cube_r377 = bone4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(71, 39).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1455F, -0.0739F, 0.2009F));

		PartDefinition bone13 = neck3.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.2052F, -2.0561F));

		PartDefinition cube_r378 = bone13.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8918F, 3.5114F, 2.8019F, 0.7057F, -0.23F, -1.368F));

		PartDefinition cube_r379 = bone13.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(61, 96).mirror().addBox(-2.95F, 0.05F, -1.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8198F, 0.675F, 0.9763F, 0.1361F, 0.305F, -0.7074F));

		PartDefinition cube_r380 = bone13.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1455F, 0.0739F, -0.2009F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -2.2664F, -3.3528F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r381 = osteoderms3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(19, 124).addBox(-0.1148F, -3.4998F, -0.7682F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2783F, -0.4305F, 2.0458F, -0.2581F, -0.1345F, 0.3742F));

		PartDefinition cube_r382 = osteoderms3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(86, 39).addBox(-0.1504F, -1.0892F, -0.9772F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2783F, -0.4305F, 2.0458F, 1.2254F, -0.1345F, 0.3742F));

		PartDefinition cube_r383 = osteoderms3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(17, 84).addBox(-0.2395F, -1.2223F, -0.7593F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2783F, -0.4305F, 3.7458F, 1.1438F, -0.1022F, 0.5409F));

		PartDefinition cube_r384 = osteoderms3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(59, 132).addBox(-0.2039F, -2.4296F, -0.983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2783F, -0.4305F, 3.7458F, -0.3398F, -0.1022F, 0.5409F));

		PartDefinition osteoderms14 = neck3.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -2.2664F, -3.3528F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r385 = osteoderms14.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(19, 124).mirror().addBox(-0.8852F, -3.4998F, -0.7682F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2783F, -0.4305F, 2.0458F, -0.2581F, 0.1345F, -0.3742F));

		PartDefinition cube_r386 = osteoderms14.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.8496F, -1.0892F, -0.9772F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2783F, -0.4305F, 2.0458F, 1.2254F, 0.1345F, -0.3742F));

		PartDefinition cube_r387 = osteoderms14.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(17, 84).mirror().addBox(-0.7605F, -1.2223F, -0.7593F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2783F, -0.4305F, 3.7458F, 1.1438F, 0.1022F, -0.5409F));

		PartDefinition cube_r388 = osteoderms14.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(59, 132).mirror().addBox(-0.7961F, -2.4296F, -0.983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2783F, -0.4305F, 3.7458F, -0.3398F, 0.1022F, -0.5409F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.4411F, 0.0227F, 0.1556F));

		PartDefinition cube_r389 = neck2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(19, 50).addBox(0.5F, -1.1F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 31).addBox(0.5F, -1.0F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 110).addBox(0.0F, -0.6F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r390 = neck2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(-2.0152F, -0.0847F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r391 = neck2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(126, 110).mirror().addBox(-3.0152F, -0.0847F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.404F, 0.546F, -0.8458F));

		PartDefinition cube_r392 = neck2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(126, 110).addBox(0.0151F, -0.0847F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.404F, -0.546F, 0.8458F));

		PartDefinition cube_r393 = neck2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(68, 78).addBox(0.0151F, -0.0847F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition cube_r394 = neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 88).addBox(-1.5F, 0.7566F, 2.4255F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(93, 73).addBox(-1.0F, 0.9566F, -0.0745F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.8888F, -3.5074F, -0.2356F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r395 = osteoderms2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(106, 107).addBox(-0.3963F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2806F, 1.1846F, 0.0352F, 1.1733F, 0.0398F, 1.4748F));

		PartDefinition cube_r396 = osteoderms2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(61, 101).addBox(-0.3858F, -10.7926F, -1.0179F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2806F, 1.1846F, 0.0352F, -0.2665F, 0.0398F, 1.4748F));

		PartDefinition cube_r397 = osteoderms2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(45, 126).addBox(-0.6929F, -0.2F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8071F, -1.3417F, -0.1793F, 0.9043F, 0.0F, 0.0F));

		PartDefinition cube_r398 = osteoderms2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 110).addBox(-0.3858F, -9.7926F, -1.0179F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5806F, 0.2846F, 0.5352F, -0.1865F, 0.1076F, 0.8698F));

		PartDefinition cube_r399 = osteoderms2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(13, 108).addBox(-0.3963F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5806F, 0.2846F, 0.5352F, 1.2534F, 0.1076F, 0.8698F));

		PartDefinition cube_r400 = osteoderms2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(25, 121).addBox(-0.5053F, -0.6542F, -1.3254F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2409F, 4.0159F, 1.0234F, 1.4877F, 0.0581F, 2.0352F));

		PartDefinition cube_r401 = osteoderms2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(41, 139).addBox(-0.4947F, -0.7872F, -0.4054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2409F, 4.0159F, 1.0234F, 0.2223F, 0.0581F, 2.0352F));

		PartDefinition cube_r402 = osteoderms2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(24, 108).addBox(-0.3963F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1194F, 2.1846F, 2.3352F, 1.1901F, 0.0272F, 1.2655F));

		PartDefinition cube_r403 = osteoderms2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 122).addBox(-0.3858F, -5.7926F, -1.0179F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1194F, 2.1846F, 2.3352F, -0.2498F, 0.0272F, 1.2655F));

		PartDefinition cube_r404 = osteoderms2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(82, 121).addBox(-0.3858F, -5.7926F, -1.0179F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0806F, 0.6846F, 2.7352F, -0.2997F, 0.0114F, 0.7409F));

		PartDefinition cube_r405 = osteoderms2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(107, 88).addBox(-0.3963F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0806F, 0.6846F, 2.7352F, 1.1402F, 0.0114F, 0.7409F));

		PartDefinition cube_r406 = osteoderms2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 124).addBox(-0.5178F, -0.4247F, -1.6316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2634F, 3.1657F, -1.5417F, 1.5229F, 0.2443F, 2.3745F));

		PartDefinition cube_r407 = osteoderms2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(135, 57).addBox(-0.4822F, -1.5732F, -0.2242F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2634F, 3.1657F, -1.5417F, 0.5193F, 0.2443F, 2.3745F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r408 = osteoderms13.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.6037F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2806F, 1.1846F, 0.0352F, 1.1733F, -0.0398F, -1.4748F));

		PartDefinition cube_r409 = osteoderms13.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(61, 101).mirror().addBox(-0.6142F, -10.7926F, -1.0179F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.2806F, 1.1846F, 0.0352F, -0.2665F, -0.0398F, -1.4748F));

		PartDefinition cube_r410 = osteoderms13.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(137, 49).mirror().addBox(-0.5F, -2.325F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.2067F, 2.4802F, -0.1778F, 0.0F, 0.0F));

		PartDefinition cube_r411 = osteoderms13.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.5F, -0.4077F, -1.1912F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.2076F, 2.1001F, 1.2185F, 0.0F, 0.0F));

		PartDefinition cube_r412 = osteoderms13.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(139, 45).mirror().addBox(-0.3018F, 1.4275F, -0.3475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.8018F, -2.8586F, 0.2622F, -0.1865F, 0.0F, 0.0F));

		PartDefinition cube_r413 = osteoderms13.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.6142F, -9.7926F, -1.0179F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5806F, 0.2846F, 0.5352F, -0.1865F, -0.1076F, -0.8698F));

		PartDefinition cube_r414 = osteoderms13.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(13, 108).mirror().addBox(-0.6037F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5806F, 0.2846F, 0.5352F, 1.2534F, -0.1076F, -0.8698F));

		PartDefinition cube_r415 = osteoderms13.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(25, 121).mirror().addBox(-0.4947F, -0.6542F, -1.3254F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2409F, 4.0159F, 1.0234F, 1.4877F, -0.0581F, -2.0352F));

		PartDefinition cube_r416 = osteoderms13.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(41, 139).mirror().addBox(-0.5053F, -0.7872F, -0.4054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2409F, 4.0159F, 1.0234F, 0.2223F, -0.0581F, -2.0352F));

		PartDefinition cube_r417 = osteoderms13.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(24, 108).mirror().addBox(-0.6037F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1194F, 2.1846F, 2.3352F, 1.1901F, -0.0272F, -1.2655F));

		PartDefinition cube_r418 = osteoderms13.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-0.6142F, -5.7926F, -1.0179F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1194F, 2.1846F, 2.3352F, -0.2498F, -0.0272F, -1.2655F));

		PartDefinition cube_r419 = osteoderms13.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(82, 121).mirror().addBox(-0.6142F, -5.7926F, -1.0179F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0806F, 0.6846F, 2.7352F, -0.2997F, -0.0114F, -0.7409F));

		PartDefinition cube_r420 = osteoderms13.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(107, 88).mirror().addBox(-0.6037F, -1.531F, -0.474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0806F, 0.6846F, 2.7352F, 1.1402F, -0.0114F, -0.7409F));

		PartDefinition cube_r421 = osteoderms13.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(75, 124).mirror().addBox(-0.4822F, -0.4247F, -1.6316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2634F, 3.1657F, -1.5417F, 1.5229F, -0.2443F, -2.3745F));

		PartDefinition cube_r422 = osteoderms13.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(135, 57).mirror().addBox(-0.5178F, -1.5732F, -0.2242F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2634F, 3.1657F, -1.5417F, 0.5193F, -0.2443F, -2.3745F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r423 = neck.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(102, 108).addBox(0.5F, -0.6219F, 1.9925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 89).addBox(0.0F, -0.2219F, -1.0075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r424 = neck.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(141, 78).addBox(2.3697F, 0.1338F, 0.1453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, 0.7087F, -0.8998F, 0.7267F));

		PartDefinition cube_r425 = neck.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(71, 105).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1573F, -2.3226F, 0.0349F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r426 = osteoderms.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(101, 29).addBox(-0.2378F, -0.2801F, -1.0474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1116F, 2.0187F, -0.6168F, 1.4308F, 0.0038F, 2.0536F));

		PartDefinition cube_r427 = osteoderms.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(31, 126).addBox(-0.2378F, -0.7799F, -0.6557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.1116F, 2.0187F, -0.6168F, 1.0555F, 0.0038F, 2.0536F));

		PartDefinition cube_r428 = osteoderms.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.323F, -1.2852F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.192F, -0.1634F, -0.7697F, 1.5662F, -0.1244F, 1.0208F));

		PartDefinition cube_r429 = osteoderms.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(106, 71).addBox(-0.5F, -0.686F, -1.2648F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.192F, -0.1634F, -0.7697F, 1.4528F, -0.1244F, 1.0208F));

		PartDefinition osteoderms6 = neck.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r430 = osteoderms6.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.7623F, -0.2801F, -1.0474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1116F, 2.0187F, -0.6168F, 1.4308F, -0.0038F, -2.0536F));

		PartDefinition cube_r431 = osteoderms6.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(31, 126).mirror().addBox(-0.7623F, -0.7799F, -0.6557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.1116F, 2.0187F, -0.6168F, 1.0555F, -0.0038F, -2.0536F));

		PartDefinition cube_r432 = osteoderms6.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -0.323F, -1.2852F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.192F, -0.1634F, -0.7697F, 1.5662F, 0.1244F, -1.0208F));

		PartDefinition cube_r433 = osteoderms6.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-0.5F, -0.686F, -1.2648F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.192F, -0.1634F, -0.7697F, 1.4528F, 0.1244F, -1.0208F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4258F, -3.8931F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(131, 134).addBox(-1.0F, -0.55F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7378F, -5.9759F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(111, 82).addBox(-1.0F, -1.1F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(109, 0).addBox(-1.0F, -1.45F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.6334F, -2.6639F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 106).addBox(-2.0F, -0.15F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -0.5045F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(105, 17).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -0.5045F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(106, 67).addBox(-2.7F, -1.5824F, -0.1106F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.035F))
				.texOffs(98, 84).addBox(-2.7F, -0.9824F, -0.1106F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0297F)), PartPose.offsetAndRotation(0.7F, -2.6608F, -0.6642F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(113, 113).addBox(-2.7F, -1.9968F, -1.0796F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.3406F, -2.324F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(121, 54).addBox(-2.2F, -0.1297F, -0.1205F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -2.3524F, -2.4994F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(126, 71).addBox(-1.2F, -0.1758F, -0.063F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -1.6634F, -4.1762F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(116, 11).addBox(-1.0F, -0.8799F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3213F, -0.9719F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(134, 15).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0028F)), PartPose.offsetAndRotation(0.0F, -0.2128F, -5.8179F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(124, 134).addBox(-1.0F, 0.0F, -0.975F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.0F, 0.8155F, -5.5364F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(117, 134).addBox(-1.0F, -0.775F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0027F)), PartPose.offsetAndRotation(0.0F, 0.3292F, -6.3874F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(134, 116).addBox(-1.0F, -0.3F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.0F, 0.3292F, -6.3874F, -0.8639F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.9406F, -5.724F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(141, 12).addBox(-0.8F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 1.212F, 0.6156F, 1.0297F, 0.0239F, 0.006F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(141, 15).addBox(-0.615F, -0.396F, -0.594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.115F, 1.4579F, -0.799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(141, 0).addBox(-0.385F, -0.657F, -0.5842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.115F, 1.4579F, -0.799F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(13, 102).addBox(-0.8709F, -0.0736F, -3.3887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1809F, 0.2547F, -0.0135F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(101, 53).addBox(-0.9709F, -0.7736F, -0.0887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6702F, 0.6885F, 0.1372F, 0.3705F, 0.198F, 0.0486F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(5, 121).addBox(-0.5F, -0.0117F, -1.7006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3207F, -1.4142F, 4.7437F, 1.4631F, -0.1855F, 0.9447F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(117, 99).addBox(-0.5F, -0.9758F, -1.7286F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3207F, -1.4142F, 4.7437F, 0.6254F, -0.1855F, 0.9447F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(117, 71).addBox(-0.5F, -0.4508F, -1.4087F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3207F, -1.4142F, 4.7437F, 1.0966F, -0.1855F, 0.9447F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(52, 119).addBox(-0.4869F, -0.0138F, -1.7063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3345F, 0.1814F, 4.2437F, 1.4051F, -0.2261F, 2.4575F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(117, 94).addBox(-0.4869F, -0.9729F, -1.734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3345F, 0.1814F, 4.2437F, 0.5673F, -0.2261F, 2.4575F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(34, 116).addBox(-0.4869F, -0.4507F, -1.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3345F, 0.1814F, 4.2437F, 1.0386F, -0.2261F, 2.4575F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(66, 126).addBox(-0.635F, -0.5005F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1533F, -0.5696F, 4.2737F, 0.2793F, 0.0698F, 0.0F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(25, 116).addBox(-1.4F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(20, 140).addBox(-0.4749F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 116).addBox(-0.3649F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1533F, -0.5696F, 4.2737F, 0.2356F, 0.0698F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.9406F, -5.724F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(96, 5).mirror().addBox(-0.385F, 0.1659F, -0.733F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 1.4579F, -0.799F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(141, 12).mirror().addBox(-0.2F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.212F, 0.6156F, 1.0297F, -0.0239F, -0.006F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(141, 15).mirror().addBox(-0.385F, -0.396F, -0.594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 1.4579F, -0.799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-0.615F, -0.657F, -0.5842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 1.4579F, -0.799F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(13, 102).mirror().addBox(-0.1291F, -0.0736F, -3.3887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1809F, -0.2547F, 0.0135F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-0.0291F, -0.7736F, -0.0887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6702F, 0.6885F, 0.1372F, 0.3705F, -0.198F, -0.0486F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(5, 121).mirror().addBox(-0.5F, -0.0117F, -1.7006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3207F, -1.4142F, 4.7437F, 1.4631F, 0.1855F, -0.9447F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(117, 99).mirror().addBox(-0.5F, -0.9758F, -1.7286F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3207F, -1.4142F, 4.7437F, 0.6254F, 0.1855F, -0.9447F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(117, 71).mirror().addBox(-0.5F, -0.4508F, -1.4087F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3207F, -1.4142F, 4.7437F, 1.0966F, 0.1855F, -0.9447F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(52, 119).mirror().addBox(-0.5131F, -0.0138F, -1.7063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3345F, 0.1814F, 4.2437F, 1.4051F, 0.2261F, -2.4575F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(117, 94).mirror().addBox(-0.5131F, -0.9729F, -1.734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3345F, 0.1814F, 4.2437F, 0.5673F, 0.2261F, -2.4575F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(34, 116).mirror().addBox(-0.5131F, -0.4507F, -1.4148F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3345F, 0.1814F, 4.2437F, 1.0386F, 0.2261F, -2.4575F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(66, 126).mirror().addBox(-0.365F, -0.5005F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1533F, -0.5696F, 4.2737F, 0.2793F, -0.0698F, 0.0F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(25, 116).mirror().addBox(-0.6F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.2182F, -0.0349F, 0.0F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(20, 140).mirror().addBox(-0.5251F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(52, 116).mirror().addBox(-0.6351F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1533F, -0.5696F, 4.2737F, 0.2356F, -0.0698F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.5903F, -0.4346F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(139, 8).mirror().addBox(0.0F, 0.025F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3114F, 0.2416F, -3.8978F, 0.4393F, -0.3121F, 0.0362F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(139, 4).mirror().addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6577F, 0.7015F, -2.8768F, 0.1819F, -0.3141F, 0.0079F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.736F, 1.8296F, -6.0242F, -0.1312F, -0.0694F, 0.0073F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(118, 16).mirror().addBox(-0.5F, -0.9F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9332F, 1.4234F, -3.1464F, 0.2875F, -0.0685F, 0.0133F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(124, 113).mirror().addBox(-0.5F, -0.45F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(124, 113).addBox(1.9F, -0.45F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.5021F, -0.6497F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(133, 93).mirror().addBox(-0.5F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 93).addBox(1.9F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.4452F, -1.734F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(99, 127).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(99, 127).addBox(1.9F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.2548F, -0.834F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(38, 126).mirror().addBox(0.0317F, -0.0871F, -1.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.6433F, -4.1018F, 0.4285F, -0.0506F, -0.0512F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(100, 140).mirror().addBox(-0.2309F, 0.1077F, -0.7704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.2433F, -3.2018F, 0.16F, -0.3121F, 0.0362F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(140, 56).mirror().addBox(-0.2985F, -0.4744F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.496F, 0.7294F, -2.7247F, 0.256F, -0.3121F, 0.0362F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(-0.5758F, -0.8061F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3433F, -2.2018F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(139, 8).addBox(0.0F, 0.025F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7114F, 0.2416F, -3.8978F, 0.4393F, 0.3121F, -0.0362F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(139, 4).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0577F, 0.7015F, -2.8768F, 0.1819F, 0.3141F, -0.0079F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(62, 86).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.136F, 1.8296F, -6.0242F, -0.1312F, 0.0694F, -0.0073F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(118, 16).addBox(-0.5F, -0.9F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3332F, 1.4234F, -3.1464F, 0.2875F, 0.0685F, -0.0133F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(38, 126).addBox(-1.0317F, -0.0871F, -1.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.6433F, -4.1018F, 0.4285F, 0.0506F, 0.0512F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(100, 140).addBox(-0.7691F, 0.1077F, -0.7704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.2433F, -3.2018F, 0.16F, 0.3121F, -0.0362F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(140, 56).addBox(-0.7015F, -0.4744F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.896F, 0.7294F, -2.7247F, 0.256F, 0.3121F, -0.0362F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(66, 114).addBox(-0.4242F, -0.8061F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.3433F, -2.2018F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(8.4694F, 1.8078F, -3.7899F));

		PartDefinition cube_r495 = bone6.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(37, 0).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9694F, -3.4322F, -0.1799F, 0.0511F, -0.0113F, 0.2179F));

		PartDefinition cube_r496 = bone6.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0642F, -2.5676F, -0.1346F, 0.0401F, -0.0336F, 0.6975F));

		PartDefinition cube_r497 = bone6.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(57, 62).addBox(0.0F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0201F, -0.0484F, 1.1776F));

		PartDefinition bone15 = body.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(-8.4694F, 1.8078F, -3.7899F));

		PartDefinition cube_r498 = bone15.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.9694F, -3.4322F, -0.1799F, 0.0511F, 0.0113F, -0.2179F));

		PartDefinition cube_r499 = bone15.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0642F, -2.5676F, -0.1346F, 0.0401F, 0.0336F, -0.6975F));

		PartDefinition cube_r500 = bone15.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(-2.0F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0201F, 0.0484F, -1.1776F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7F, 2.9001F, -0.9979F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(76, 71).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 114).addBox(0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 43).addBox(0.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 30).addBox(-0.4F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 102).addBox(0.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 114).mirror().addBox(-2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 43).mirror().addBox(-2.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 30).mirror().addBox(-1.6F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 102).mirror().addBox(-1.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 119).addBox(0.0F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 121).addBox(0.0F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 131).addBox(0.0F, -1.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 109).addBox(0.0F, -1.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.1049F, -0.0432F, 0.0065F));

		PartDefinition cube_r501 = tail.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(57, 124).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 96).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 53).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(131, 125).addBox(-0.5F, 4.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(131, 121).addBox(-0.5F, 2.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(131, 112).addBox(-0.5F, 0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.687F, 0.6928F, 1.5063F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -1.4664F, 9.4472F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r503 = osteoderms12.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(51, 136).addBox(-0.4947F, -1.4578F, -0.4422F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.1446F, -0.2544F, -2.3309F, -0.8682F, -0.3134F, 1.4406F));

		PartDefinition cube_r504 = osteoderms12.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(119, 122).addBox(-0.4947F, -2.8559F, -0.3986F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.9575F, -0.3412F, -4.1105F, -0.7681F, -0.4464F, 1.1727F));

		PartDefinition cube_r505 = osteoderms12.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(95, 102).addBox(-0.5053F, -0.57F, -2.3634F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9575F, -0.3412F, -4.1105F, 0.7155F, -0.4464F, 1.1727F));

		PartDefinition cube_r506 = osteoderms12.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(61, 119).addBox(-0.3858F, -6.7926F, -0.7679F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.2194F, -0.8015F, -6.9924F, -0.5994F, -0.1796F, 0.7152F));

		PartDefinition cube_r507 = osteoderms12.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(132, 33).addBox(-0.4F, -2.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(132, 19).addBox(-0.4F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(132, 9).addBox(-0.4F, 1.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -1.1076F, -5.4549F, 1.4434F, -0.1358F, 0.407F));

		PartDefinition cube_r508 = osteoderms12.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(32, 86).addBox(-0.3963F, -1.281F, -0.474F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2194F, -0.8015F, -6.9924F, 0.8841F, -0.1796F, 0.7152F));

		PartDefinition bone9 = osteoderms12.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(1.0067F, 1.5045F, -1.4359F));

		PartDefinition cube_r509 = bone9.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(0, 31).addBox(-5.0F, 0.0F, -1.2F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3933F, -2.6963F, -6.8191F, -0.0371F, -0.3488F, 0.0127F));

		PartDefinition cube_r510 = bone9.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(68, 80).addBox(-0.5F, -0.875F, -3.6F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2552F, -1.5372F, -4.591F, -2.9005F, -0.4688F, -0.7633F));

		PartDefinition cube_r511 = bone9.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(0, 50).addBox(-0.8171F, 0.0383F, -0.4436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5951F, -0.4688F, -0.7633F));

		PartDefinition osteoderms17 = tail.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -1.4664F, 9.4472F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r512 = osteoderms17.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(51, 136).mirror().addBox(-0.5053F, -1.4578F, -0.4422F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.1446F, -0.2544F, -2.3309F, -0.8682F, 0.3134F, -1.4406F));

		PartDefinition cube_r513 = osteoderms17.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(119, 122).mirror().addBox(-0.5053F, -2.8559F, -0.3986F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9575F, -0.3412F, -4.1105F, -0.7681F, 0.4464F, -1.1727F));

		PartDefinition cube_r514 = osteoderms17.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(95, 102).mirror().addBox(-0.4947F, -0.57F, -2.3634F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9575F, -0.3412F, -4.1105F, 0.7155F, 0.4464F, -1.1727F));

		PartDefinition cube_r515 = osteoderms17.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(61, 119).mirror().addBox(-0.6142F, -6.7926F, -0.7679F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2194F, -0.8015F, -6.9924F, -0.5994F, 0.1796F, -0.7152F));

		PartDefinition cube_r516 = osteoderms17.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(132, 33).mirror().addBox(-0.6F, -2.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(132, 19).mirror().addBox(-0.6F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(132, 9).mirror().addBox(-0.6F, 1.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.1076F, -5.4549F, 1.4434F, 0.1358F, -0.407F));

		PartDefinition cube_r517 = osteoderms17.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(32, 86).mirror().addBox(-0.6037F, -1.281F, -0.474F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2194F, -0.8015F, -6.9924F, 0.8841F, 0.1796F, -0.7152F));

		PartDefinition bone12 = osteoderms17.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-1.0067F, 1.5045F, -1.4359F));

		PartDefinition cube_r518 = bone12.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(0.0F, 0.0F, -1.2F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3933F, -2.6963F, -6.8191F, -0.0371F, 0.3488F, -0.0127F));

		PartDefinition cube_r519 = bone12.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(-0.5F, -0.875F, -3.6F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2552F, -1.5372F, -4.591F, -2.9005F, 0.4688F, 0.7633F));

		PartDefinition cube_r520 = bone12.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.1829F, 0.0383F, -0.4436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5951F, 0.4688F, 0.7633F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -2.4926F, 1.8291F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(106, 77).addBox(0.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 85).addBox(0.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 9).addBox(0.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 131).addBox(-0.1F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 77).mirror().addBox(-1.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(122, 85).mirror().addBox(-1.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 9).mirror().addBox(-1.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 131).mirror().addBox(-0.9F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 80).addBox(0.0F, -1.0987F, 2.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 141).addBox(0.0F, -0.9987F, 4.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 141).addBox(0.0F, -0.9987F, 6.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.2977F, -0.1299F, -0.016F));

		PartDefinition cube_r521 = tail2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(71, 101).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 141).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 75).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 140).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(90, 136).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(27, 34).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone8 = tail2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(2.3846F, -2.5586F, -0.0591F));

		PartDefinition cube_r524 = bone8.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(52, 9).addBox(-1.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition bone17 = tail2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(-2.3846F, -2.5586F, -0.0591F));

		PartDefinition cube_r525 = bone17.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(0.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r526 = osteoderms8.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(137, 25).addBox(-0.9F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.9364F, 3.3162F, 4.5203F, -0.822F, -0.4442F, 1.3161F));

		PartDefinition cube_r527 = osteoderms8.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(140, 72).addBox(-0.3212F, 4.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(140, 59).addBox(-0.3212F, 2.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(140, 66).addBox(-0.3212F, 0.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(140, 69).addBox(-0.3212F, -1.9245F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3156F, 2.975F, 0.1482F, 1.8361F, -0.1358F, 0.407F));

		PartDefinition cube_r528 = osteoderms8.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(85, 136).addBox(-0.9F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.3343F, 3.9178F, 2.5203F, -0.7904F, -0.4081F, 1.344F));

		PartDefinition cube_r529 = osteoderms8.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(136, 79).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.8011F, 4.6857F, -0.0159F, -0.7006F, -0.3997F, 1.3356F));

		PartDefinition osteoderms18 = tail2.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r530 = osteoderms18.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(137, 25).mirror().addBox(-0.1F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9364F, 3.3162F, 4.5203F, -0.822F, 0.4442F, -1.3161F));

		PartDefinition cube_r531 = osteoderms18.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(140, 72).mirror().addBox(-0.6788F, 4.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(140, 59).mirror().addBox(-0.6788F, 2.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(140, 66).mirror().addBox(-0.6788F, 0.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(140, 69).mirror().addBox(-0.6788F, -1.9245F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3156F, 2.975F, 0.1482F, 1.8361F, 0.1358F, -0.407F));

		PartDefinition cube_r532 = osteoderms18.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(85, 136).mirror().addBox(-0.1F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.3343F, 3.9178F, 2.5203F, -0.7904F, 0.4081F, -1.344F));

		PartDefinition cube_r533 = osteoderms18.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(136, 79).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.8011F, 4.6857F, -0.0159F, -0.7006F, 0.3997F, -1.3356F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(23, 45).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(142, 102).addBox(0.0F, -0.8998F, 0.9913F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 142).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 142).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.2013F, -0.0862F, -0.0137F));

		PartDefinition cube_r534 = tail3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(142, 49).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 25).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 116).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 88).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r535 = tail3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(31, 22).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r536 = osteoderms9.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(139, 36).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7919F, 3.3523F, 4.1938F, 2.2833F, -0.5324F, 1.5731F));

		PartDefinition cube_r537 = osteoderms9.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(36, 139).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1997F, 4.8231F, 1.2006F, 2.3531F, -0.5324F, 1.5731F));

		PartDefinition cube_r538 = osteoderms9.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(140, 75).addBox(0.8788F, 11.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 140).addBox(0.8788F, 9.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(140, 93).addBox(0.8788F, 7.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(95, 140).addBox(0.8788F, 5.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.3156F, 2.8331F, -8.1845F, 1.8361F, -0.1358F, 0.407F));

		PartDefinition cube_r539 = osteoderms9.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(69, 136).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.5996F, 5.2121F, -0.875F, 2.3534F, -0.4451F, 1.573F));

		PartDefinition osteoderms19 = tail3.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r540 = osteoderms19.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(139, 36).mirror().addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7919F, 3.3523F, 4.1938F, 2.2833F, 0.5324F, -1.5731F));

		PartDefinition cube_r541 = osteoderms19.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(36, 139).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1997F, 4.8231F, 1.2006F, 2.3531F, 0.5324F, -1.5731F));

		PartDefinition cube_r542 = osteoderms19.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(140, 75).mirror().addBox(-1.8788F, 11.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 140).mirror().addBox(-1.8788F, 9.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(140, 93).mirror().addBox(-1.8788F, 7.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(95, 140).mirror().addBox(-1.8788F, 5.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.3156F, 2.8331F, -8.1845F, 1.8361F, 0.1358F, -0.407F));

		PartDefinition cube_r543 = osteoderms19.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(69, 136).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5996F, 5.2121F, -0.875F, 2.3534F, 0.4451F, -1.573F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 75).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail4.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(50, 34).addBox(-1.0F, -0.15F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(105, 59).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 104).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 142).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r546 = osteoderms10.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(66, 141).addBox(-0.0106F, 0.5249F, -1.7988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 141).addBox(-0.0106F, -0.9751F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(141, 40).addBox(-0.401F, -2.4106F, 1.3091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8814F, -0.873F, 3.6312F, 2.2659F, -0.5324F, 1.5731F));

		PartDefinition cube_r547 = osteoderms10.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(139, 32).addBox(-0.4008F, -1.7813F, 0.5405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9814F, 0.3827F, 0.4721F, 2.3706F, -0.5324F, 1.5731F));

		PartDefinition osteoderms20 = tail4.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r548 = osteoderms20.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(66, 141).mirror().addBox(-0.9894F, 0.5249F, -1.7988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(51, 141).mirror().addBox(-0.9894F, -0.9751F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(141, 40).mirror().addBox(-0.599F, -2.4106F, 1.3091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8814F, -0.873F, 3.6312F, 2.2659F, 0.5324F, -1.5731F));

		PartDefinition cube_r549 = osteoderms20.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(139, 32).mirror().addBox(-0.5992F, -1.7813F, 0.5405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9814F, 0.3827F, 0.4721F, 2.3706F, 0.5324F, -1.5731F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5157F, -0.1994F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.016F, 6.9899F, 0.0786F, -0.0435F, -0.0034F));

		PartDefinition cube_r550 = tail5.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(27, 9).addBox(-0.5F, -0.9498F, 0.8311F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.2996F, 0.7751F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition cube_r551 = osteoderms11.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(5, 134).addBox(-0.223F, -1.4221F, -0.3441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5144F, -6.4491F, 9.659F, -1.1732F, -0.7239F, 1.2678F));

		PartDefinition cube_r552 = osteoderms11.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(52, 124).addBox(-0.4943F, -2.116F, 0.1112F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7397F, -5.2725F, 8.1136F, -0.9475F, -0.6074F, 1.2292F));

		PartDefinition cube_r553 = osteoderms11.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(14, 124).addBox(-0.5573F, -2.9073F, -0.3047F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5824F, -4.0577F, 6.3825F, -0.5793F, -0.4396F, 1.2491F));

		PartDefinition cube_r554 = osteoderms11.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(0, 134).addBox(-0.5129F, -2.5151F, -0.1687F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4656F, -2.8564F, 4.5884F, -0.2727F, -0.3381F, 1.3523F));

		PartDefinition cube_r555 = osteoderms11.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(141, 22).addBox(0.5395F, 0.2669F, -3.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 139).addBox(0.0913F, -0.7854F, -2.2541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(138, 109).addBox(-0.5F, -2.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4272F, -1.8722F, 3.3216F, -0.2137F, -0.3134F, 1.4406F));

		PartDefinition osteoderms21 = tail5.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.2996F, 0.7751F, -0.5062F, -0.0153F, 0.0085F));

		PartDefinition cube_r556 = osteoderms21.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(5, 134).mirror().addBox(-0.777F, -1.4221F, -0.3441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5144F, -6.4491F, 9.659F, -1.1732F, 0.7239F, -1.2678F));

		PartDefinition cube_r557 = osteoderms21.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(52, 124).mirror().addBox(-0.5057F, -2.116F, 0.1112F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7397F, -5.2725F, 8.1136F, -0.9475F, 0.6074F, -1.2292F));

		PartDefinition cube_r558 = osteoderms21.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(14, 124).mirror().addBox(-0.4427F, -2.9073F, -0.3047F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5824F, -4.0577F, 6.3825F, -0.5793F, 0.4396F, -1.2491F));

		PartDefinition cube_r559 = osteoderms21.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.4871F, -2.5151F, -0.1687F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4656F, -2.8564F, 4.5884F, -0.2727F, 0.3381F, -1.3523F));

		PartDefinition cube_r560 = osteoderms21.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-1.5395F, 0.2669F, -3.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(61, 139).mirror().addBox(-1.0913F, -0.7854F, -2.2541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(138, 109).mirror().addBox(-0.5F, -2.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4272F, -1.8722F, 3.3216F, -0.2137F, 0.3134F, -1.4406F));

		return LayerDefinition.create(meshdefinition, 147, 147);
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