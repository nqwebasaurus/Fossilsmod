package fossils.fossils.client.blockentity.model.mymoorapelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MymoorapeltaFossilModel extends SkullModelBase {
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
	private final ModelPart bone15;
	private final ModelPart body;
	private final ModelPart osteoderns;
	private final ModelPart osteoderns2;
	private final ModelPart chest;
	private final ModelPart bone5;
	private final ModelPart bone13;
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
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms14;
	private final ModelPart bone4;
	private final ModelPart bone12;
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
	private final ModelPart bone14;
	private final ModelPart backPlates2;
	private final ModelPart tail;
	private final ModelPart bone9;
	private final ModelPart bone16;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms17;
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

	public MymoorapeltaFossilModel(ModelPart root) {
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
		this.bone15 = this.hips.getChild("bone15");
		this.body = this.hips.getChild("body");
		this.osteoderns = this.body.getChild("osteoderns");
		this.osteoderns2 = this.body.getChild("osteoderns2");
		this.chest = this.body.getChild("chest");
		this.bone5 = this.chest.getChild("bone5");
		this.bone13 = this.chest.getChild("bone13");
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
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms14 = this.neck3.getChild("osteoderms14");
		this.bone4 = this.neck3.getChild("bone4");
		this.bone12 = this.neck3.getChild("bone12");
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
		this.bone14 = this.body.getChild("bone14");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.tail = this.hips.getChild("tail");
		this.bone9 = this.tail.getChild("bone9");
		this.bone16 = this.tail.getChild("bone16");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms17 = this.tail.getChild("osteoderms17");
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

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 88).addBox(0.5F, -0.9106F, -5.0576F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.7662F, -6.6284F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 46).addBox(-1.0F, 0.0447F, -0.0543F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1505F, -0.885F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 65).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(119, 16).mirror().addBox(-1.404F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 14).mirror().addBox(-1.996F, 0.0347F, -0.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 70).mirror().addBox(-1.996F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(113, 68).mirror().addBox(-4.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-4.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0174F, 0.0011F, 0.0611F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-4.8023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -7.7F, -0.0175F, 0.0003F, 0.0175F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(119, 16).addBox(-2.596F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 14).addBox(-2.004F, 0.0347F, -0.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 70).addBox(-2.004F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(113, 68).addBox(0.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(87, 79).addBox(0.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0174F, -0.0011F, -0.0611F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 44).addBox(-0.1977F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -7.7F, -0.0175F, -0.0003F, -0.0175F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 6).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 41).addBox(0.48F, -0.717F, -0.192F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Osteoderms5 = hips.addOrReplaceChild("Osteoderms5", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition cube_r15 = Osteoderms5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(113, 109).addBox(-0.582F, -2.0294F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(138, 102).addBox(-0.582F, -3.0294F, 0.5024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, 1.8213F, 0.1918F, 1.9278F));

		PartDefinition cube_r16 = Osteoderms5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(137, 117).addBox(-0.5526F, -2.2012F, 0.6264F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, -0.884F, 0.1918F, 1.9278F));

		PartDefinition cube_r17 = Osteoderms5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 100).addBox(-0.582F, -1.7075F, -1.3401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, 2.5456F, 0.1918F, 1.9278F));

		PartDefinition cube_r18 = Osteoderms5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 115).addBox(-0.582F, -1.5686F, 0.2534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, 2.7201F, 0.1918F, 1.9278F));

		PartDefinition cube_r19 = Osteoderms5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(128, 139).addBox(-0.5069F, -2.6807F, 0.1014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, -1.1283F, 0.1918F, 1.9278F));

		PartDefinition cube_r20 = Osteoderms5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(117, 142).addBox(-0.5069F, -1.7404F, 1.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(123, 139).addBox(-0.5069F, -1.7404F, 0.591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, -0.3429F, 0.1918F, 1.9278F));

		PartDefinition cube_r21 = Osteoderms5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(133, 86).addBox(-3.4306F, 0.899F, 0.9513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 3.1381F, -0.0187F, 0.3963F));

		PartDefinition cube_r22 = Osteoderms5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(133, 123).addBox(-3.3443F, 0.8712F, -3.0422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 3.1032F, 0.0336F, 0.3961F));

		PartDefinition cube_r23 = Osteoderms5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(134, 106).addBox(-5.4701F, 1.7676F, -1.0951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 3.0865F, 0.0125F, 0.1364F));

		PartDefinition cube_r24 = Osteoderms5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(133, 82).addBox(-0.5187F, 0.7657F, -1.2429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 3.1395F, 0.0721F, 0.6579F));

		PartDefinition cube_r25 = Osteoderms5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 81).addBox(0.3618F, 3.1522F, -1.223F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 3.1264F, -0.1219F, 1.9726F));

		PartDefinition cube_r26 = Osteoderms5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 121).addBox(0.3911F, -6.2999F, 0.7961F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 0.4124F, -0.1219F, 1.9726F));

		PartDefinition cube_r27 = Osteoderms5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 137).addBox(0.3911F, -6.8124F, 0.4728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 137).addBox(0.3911F, -6.8124F, 0.0728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 0.0459F, -0.1219F, 1.9726F));

		PartDefinition cube_r28 = Osteoderms5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(131, 135).addBox(0.3618F, 0.389F, 4.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 2.0355F, -0.1219F, 1.9726F));

		PartDefinition cube_r29 = Osteoderms5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(128, 93).addBox(0.3618F, 0.5174F, 3.4726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4035F, 3.3876F, 2.4151F, 2.4021F, -0.1219F, 1.9726F));

		PartDefinition cube_r30 = Osteoderms5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(40, 112).addBox(-0.5069F, -1.388F, -1.5587F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 132).addBox(-0.5526F, 0.1075F, -0.9042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.4825F, 6.4823F, 13.7841F, 0.0061F, 0.1918F, 1.9278F));

		PartDefinition cube_r31 = Osteoderms5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(131, 131).addBox(-0.5112F, -0.7685F, -0.6302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(9.9992F, 5.9561F, 6.9912F, 1.6603F, 0.1121F, 1.959F));

		PartDefinition cube_r32 = Osteoderms5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 135).addBox(-0.9F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9156F, 1.9813F, 11.7607F, 2.8462F, 0.0701F, 0.2573F));

		PartDefinition cube_r33 = Osteoderms5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(135, 4).addBox(-0.75F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8264F, 0.7586F, 7.0118F, 2.9339F, 0.0274F, 0.2663F));

		PartDefinition cube_r34 = Osteoderms5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(135, 0).addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.6313F, 1.7507F, 9.0609F, 2.9339F, -0.0153F, 0.2753F));

		PartDefinition cube_r35 = Osteoderms5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 136).addBox(-0.8F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(7.1378F, 3.8538F, 11.1453F, 2.9106F, -0.014F, 0.6772F));

		PartDefinition cube_r36 = Osteoderms5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(117, 134).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(7.1902F, 3.0426F, 7.228F, 2.953F, 0.1146F, 0.6527F));

		PartDefinition cube_r37 = Osteoderms5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 122).addBox(-0.4818F, -1.5792F, -0.1168F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(9.9992F, 5.9561F, 6.9912F, 0.0371F, 0.1121F, 1.959F));

		PartDefinition cube_r38 = Osteoderms5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(118, 109).addBox(-0.5112F, -1.6914F, -0.3394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9992F, 5.9561F, 6.9912F, 2.7511F, 0.1121F, 1.959F));

		PartDefinition cube_r39 = Osteoderms5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(110, 118).addBox(-0.5F, -0.45F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(9.0093F, 5.6708F, 8.074F, -3.0085F, 0.1121F, 1.959F));

		PartDefinition cube_r40 = Osteoderms5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(112, 142).addBox(-0.5112F, -1.4265F, -0.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(83, 139).addBox(-0.5112F, -2.2265F, 0.5542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(9.9992F, 5.9561F, 6.9912F, 2.0268F, 0.1121F, 1.959F));

		PartDefinition cube_r41 = Osteoderms5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(62, 82).addBox(-0.5F, -0.95F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(10.248F, 6.3295F, 9.0617F, -0.4167F, 0.1121F, 1.959F));

		PartDefinition Osteoderms16 = hips.addOrReplaceChild("Osteoderms16", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition cube_r42 = Osteoderms16.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(113, 109).mirror().addBox(-0.418F, -2.0294F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(138, 102).mirror().addBox(-0.418F, -3.0294F, 0.5024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, 1.8213F, -0.1918F, -1.9278F));

		PartDefinition cube_r43 = Osteoderms16.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(137, 117).mirror().addBox(-0.4474F, -2.2012F, 0.6264F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, -0.884F, -0.1918F, -1.9278F));

		PartDefinition cube_r44 = Osteoderms16.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.418F, -1.7075F, -1.3401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, 2.5456F, -0.1918F, -1.9278F));

		PartDefinition cube_r45 = Osteoderms16.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(16, 115).mirror().addBox(-0.418F, -1.5686F, 0.2534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, 2.7201F, -0.1918F, -1.9278F));

		PartDefinition cube_r46 = Osteoderms16.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(128, 139).mirror().addBox(-0.4931F, -2.6807F, 0.1014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, -1.1283F, -0.1918F, -1.9278F));

		PartDefinition cube_r47 = Osteoderms16.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(117, 142).mirror().addBox(-0.4931F, -1.7404F, 1.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(123, 139).mirror().addBox(-0.4931F, -1.7404F, 0.591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, -0.3429F, -0.1918F, -1.9278F));

		PartDefinition cube_r48 = Osteoderms16.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(133, 86).mirror().addBox(2.4306F, 0.899F, 0.9513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 3.1381F, 0.0187F, -0.3963F));

		PartDefinition cube_r49 = Osteoderms16.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(133, 123).mirror().addBox(2.3443F, 0.8712F, -3.0422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 3.1032F, -0.0336F, -0.3961F));

		PartDefinition cube_r50 = Osteoderms16.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(134, 106).mirror().addBox(4.4701F, 1.7676F, -1.0951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 3.0865F, -0.0125F, -0.1364F));

		PartDefinition cube_r51 = Osteoderms16.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(133, 82).mirror().addBox(-0.4813F, 0.7657F, -1.2429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 3.1395F, -0.0721F, -0.6579F));

		PartDefinition cube_r52 = Osteoderms16.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-1.3618F, 3.1522F, -1.223F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 3.1264F, 0.1219F, -1.9726F));

		PartDefinition cube_r53 = Osteoderms16.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-1.3911F, -6.2999F, 0.7961F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 0.4124F, 0.1219F, -1.9726F));

		PartDefinition cube_r54 = Osteoderms16.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 137).mirror().addBox(-1.3911F, -6.8124F, 0.4728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 137).mirror().addBox(-1.3911F, -6.8124F, 0.0728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 0.0459F, 0.1219F, -1.9726F));

		PartDefinition cube_r55 = Osteoderms16.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(131, 135).mirror().addBox(-1.3618F, 0.389F, 4.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 2.0355F, 0.1219F, -1.9726F));

		PartDefinition cube_r56 = Osteoderms16.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(128, 93).mirror().addBox(-1.3618F, 0.5174F, 3.4726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4035F, 3.3876F, 2.4151F, 2.4021F, 0.1219F, -1.9726F));

		PartDefinition cube_r57 = Osteoderms16.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 112).mirror().addBox(-0.4931F, -1.388F, -1.5587F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 132).mirror().addBox(-0.4474F, 0.1075F, -0.9042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-8.4825F, 6.4823F, 13.7841F, 0.0061F, -0.1918F, -1.9278F));

		PartDefinition cube_r58 = Osteoderms16.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(131, 131).mirror().addBox(-0.4888F, -0.7685F, -0.6302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-9.9992F, 5.9561F, 6.9912F, 1.6603F, -0.1121F, -1.959F));

		PartDefinition cube_r59 = Osteoderms16.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(14, 135).mirror().addBox(-0.1F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9156F, 1.9813F, 11.7607F, 2.8462F, -0.0701F, -0.2573F));

		PartDefinition cube_r60 = Osteoderms16.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(135, 4).mirror().addBox(-0.25F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8264F, 0.7586F, 7.0118F, 2.9339F, -0.0274F, -0.2663F));

		PartDefinition cube_r61 = Osteoderms16.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.6313F, 1.7507F, 9.0609F, 2.9339F, 0.0153F, -0.2753F));

		PartDefinition cube_r62 = Osteoderms16.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 136).mirror().addBox(-0.2F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-7.1378F, 3.8538F, 11.1453F, 2.9106F, 0.014F, -0.6772F));

		PartDefinition cube_r63 = Osteoderms16.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(117, 134).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-7.1902F, 3.0426F, 7.228F, 2.953F, -0.1146F, -0.6527F));

		PartDefinition cube_r64 = Osteoderms16.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(9, 122).mirror().addBox(-0.5182F, -1.5792F, -0.1168F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-9.9992F, 5.9561F, 6.9912F, 0.0371F, -0.1121F, -1.959F));

		PartDefinition cube_r65 = Osteoderms16.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(118, 109).mirror().addBox(-0.4888F, -1.6914F, -0.3394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9992F, 5.9561F, 6.9912F, 2.7511F, -0.1121F, -1.959F));

		PartDefinition cube_r66 = Osteoderms16.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(110, 118).mirror().addBox(-0.5F, -0.45F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.0093F, 5.6708F, 8.074F, -3.0085F, -0.1121F, -1.959F));

		PartDefinition cube_r67 = Osteoderms16.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(112, 142).mirror().addBox(-0.4888F, -1.4265F, -0.2458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(83, 139).mirror().addBox(-0.4888F, -2.2265F, 0.5542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.9992F, 5.9561F, 6.9912F, 2.0268F, -0.1121F, -1.959F));

		PartDefinition cube_r68 = Osteoderms16.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 82).mirror().addBox(-0.5F, -0.95F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-10.248F, 6.3295F, 9.0617F, -0.4167F, -0.1121F, -1.959F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7074F, -0.3635F, -0.2285F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(95, 95).addBox(0.0905F, 0.899F, -1.8568F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.6F, -0.3927F, -0.3704F, 0.629F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(66, 132).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(12, 139).addBox(-0.5F, -1.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1265F, 1.3757F, -3.8121F, 0.5672F, -0.3704F, 0.629F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 128).addBox(-0.237F, -0.0723F, -1.7143F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.3704F, 0.0367F, 0.8309F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(103, 136).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5891F, 4.8411F, 2.6115F, 0.0723F, -0.1541F, 0.5523F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(102, 106).addBox(-1.1375F, -0.5736F, -0.856F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(108, 98).addBox(-1.1375F, -0.5736F, -1.856F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5121F, 1.4877F, 1.9836F, -0.5012F, -0.056F, 0.4147F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 81).addBox(-1.1961F, 0.0172F, -4.355F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.45F, -0.0219F, -0.2364F, 0.5231F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 60).addBox(-3.9F, -0.5F, -0.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9298F, 2.1558F, -6.5013F, -0.0225F, 0.3307F, 0.5107F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(124, 135).addBox(-1.0F, -2.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7392F, 3.6703F, -3.5889F, 0.0061F, -0.101F, 0.1005F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 88).addBox(-1.0F, -2.175F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8343F, 4.0112F, -5.6079F, 1.4086F, -0.006F, 0.1338F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 113).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7488F, 3.9038F, -3.9135F, 1.016F, -0.0583F, 0.1309F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0F, -1.0F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7392F, 3.6703F, -3.5889F, 0.617F, -0.101F, 0.1005F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(109, 112).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.023F, 1.6923F, -4.0958F, 0.004F, -0.0654F, 0.1258F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(34, 81).addBox(0.8757F, 0.0429F, -4.391F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3F, -1.45F, -0.0214F, -0.0619F, 0.5193F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(71, 0).addBox(-1.5F, -0.425F, -1.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4721F, 0.5794F, -0.576F, -0.2797F, -0.0515F, 0.4646F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 74).addBox(0.3206F, -0.5736F, -1.9186F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5121F, 1.4877F, 1.9836F, -0.5416F, -0.3747F, 0.6008F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 97).addBox(0.0166F, -0.8811F, -0.4043F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.561F, -0.1541F, 0.7705F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(110, 34).addBox(0.2895F, -2.2285F, -2.2993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, -0.1724F, 0.0272F, 0.1547F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 41).addBox(-2.1024F, -1.8562F, -1.65F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, -0.1665F, 0.0128F, -0.1127F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 136).addBox(0.0669F, -1.7493F, -0.6318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.7927F, -0.0659F, 0.4124F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 135).addBox(-0.237F, -2.8095F, -1.74F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.98F, 2.9734F, 0.7154F, 0.5275F, 0.0367F, 0.8309F));

		PartDefinition bone10 = hips.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7074F, -0.3635F, -0.2285F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r89 = bone10.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-1.0905F, 0.899F, -1.8568F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.6F, -0.3927F, 0.3704F, -0.629F));

		PartDefinition cube_r90 = bone10.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(66, 132).mirror().addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(12, 139).mirror().addBox(-0.5F, -1.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, 1.3757F, -3.8121F, 0.5672F, 0.3704F, -0.629F));

		PartDefinition cube_r91 = bone10.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 128).mirror().addBox(-0.763F, -0.0723F, -1.7143F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.3704F, -0.0367F, -0.8309F));

		PartDefinition cube_r92 = bone10.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 136).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.5891F, 4.8411F, 2.6115F, 0.0723F, 0.1541F, -0.5523F));

		PartDefinition cube_r93 = bone10.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(0.1375F, -0.5736F, -0.856F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(108, 98).mirror().addBox(-0.8625F, -0.5736F, -1.856F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5121F, 1.4877F, 1.9836F, -0.5012F, 0.056F, -0.4147F));

		PartDefinition cube_r94 = bone10.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-1.8039F, 0.0172F, -4.355F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.45F, -0.0219F, 0.2364F, -0.5231F));

		PartDefinition cube_r95 = bone10.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(95, 60).mirror().addBox(-0.1F, -0.5F, -0.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9298F, 2.1558F, -6.5013F, -0.0225F, -0.3307F, -0.5107F));

		PartDefinition cube_r96 = bone10.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(124, 135).mirror().addBox(0.0F, -2.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7392F, 3.6703F, -3.5889F, 0.0061F, 0.101F, -0.1005F));

		PartDefinition cube_r97 = bone10.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 88).mirror().addBox(0.0F, -2.175F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8343F, 4.0112F, -5.6079F, 1.4086F, 0.006F, -0.1338F));

		PartDefinition cube_r98 = bone10.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 113).mirror().addBox(0.0F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7488F, 3.9038F, -3.9135F, 1.016F, 0.0583F, -0.1309F));

		PartDefinition cube_r99 = bone10.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(0.0F, -1.0F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7392F, 3.6703F, -3.5889F, 0.617F, 0.101F, -0.1005F));

		PartDefinition cube_r100 = bone10.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(109, 112).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.023F, 1.6923F, -4.0958F, 0.004F, 0.0654F, -0.1258F));

		PartDefinition cube_r101 = bone10.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(34, 81).mirror().addBox(-3.8757F, 0.0429F, -4.391F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3F, -1.45F, -0.0214F, 0.0619F, -0.5193F));

		PartDefinition cube_r102 = bone10.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-3.5F, -0.425F, -1.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4721F, 0.5794F, -0.576F, -0.2797F, 0.0515F, -0.4646F));

		PartDefinition cube_r103 = bone10.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(70, 74).mirror().addBox(-3.3206F, -0.5736F, -1.9186F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5121F, 1.4877F, 1.9836F, -0.5416F, 0.3747F, -0.6008F));

		PartDefinition cube_r104 = bone10.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 97).mirror().addBox(-1.0166F, -0.8811F, -0.4043F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.561F, 0.1541F, -0.7705F));

		PartDefinition cube_r105 = bone10.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(110, 34).mirror().addBox(-1.2895F, -2.2285F, -2.2993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, -0.1724F, -0.0272F, -0.1547F));

		PartDefinition cube_r106 = bone10.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-1.8976F, -1.8562F, -1.65F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, -0.1665F, -0.0128F, 0.1127F));

		PartDefinition cube_r107 = bone10.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(35, 136).mirror().addBox(-1.0669F, -1.7493F, -0.6318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.7927F, 0.0659F, -0.4124F));

		PartDefinition cube_r108 = bone10.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(73, 135).mirror().addBox(-0.763F, -2.8095F, -1.74F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.98F, 2.9734F, 0.7154F, 0.5275F, -0.0367F, -0.8309F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(15, 88).addBox(-1.5F, 8.2833F, -3.7553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.8F, 1.4999F, -1.1448F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftleg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 96).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftleg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftleg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(128, 113).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftleg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(108, 136).addBox(-0.1F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftleg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(99, 12).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftleg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(58, 116).addBox(-1.601F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 126).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftleg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(25, 115).addBox(-1.5F, -5.8767F, 0.9508F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftleg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(110, 46).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(121, 45).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftfoot.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(123, 49).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(0, 75).addBox(-1.999F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(54, 94).addBox(-1.5F, 8.2833F, -3.7553F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.8F, 1.4999F, -1.1448F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightleg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(98, 79).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightleg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(29, 94).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightleg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 134).addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightleg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(92, 138).addBox(-0.9F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightleg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(106, 92).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightleg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(16, 120).addBox(-0.399F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 128).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightleg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(32, 119).addBox(-0.5F, -5.8767F, 0.9508F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightleg3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 114).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(126, 4).addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightfoot.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(128, 27).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(78, 54).addBox(-2.001F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone7 = hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(7.898F, 1.0309F, -1.2425F));

		PartDefinition cube_r127 = bone7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(21, 37).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.398F, -3.2194F, -3.1988F, -0.017F, 0.0038F, 0.2181F));

		PartDefinition cube_r128 = bone7.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, 0.0F, -3.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8807F, -0.2049F, -3.2514F, -0.0172F, -0.003F, -0.1745F));

		PartDefinition cube_r129 = bone7.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(44, 37).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4929F, -2.3538F, -3.2139F, -0.0147F, 0.0094F, 0.5672F));

		PartDefinition cube_r130 = bone7.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 18).addBox(0.0F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.398F, -2.4255F, 3.2048F, -0.2388F, 0.0524F, 0.2119F));

		PartDefinition cube_r131 = bone7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(69, 17).addBox(0.0F, 0.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6158F, 0.4142F, 2.8292F, -0.1222F, 0.1718F, 1.3075F));

		PartDefinition cube_r132 = bone7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 0).addBox(-0.3F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4929F, -1.5855F, 2.9954F, -0.2057F, 0.0449F, 0.5716F));

		PartDefinition cube_r133 = bone7.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 74).addBox(-0.325F, 0.0447F, -0.0543F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2869F, -0.1199F, 0.9864F));

		PartDefinition bone15 = hips.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6981F, 1.0309F, -1.7675F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r134 = bone15.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(21, 37).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.3981F, -3.2194F, -3.1988F, -0.017F, -0.0038F, -0.2181F));

		PartDefinition cube_r135 = bone15.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.0F, 0.0F, -3.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8807F, -0.2049F, -3.2514F, -0.0172F, 0.003F, 0.1745F));

		PartDefinition cube_r136 = bone15.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4929F, -2.3538F, -3.2139F, -0.0147F, -0.0094F, -0.5672F));

		PartDefinition cube_r137 = bone15.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-4.0F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.3981F, -2.4255F, 3.2048F, -0.2388F, -0.0524F, -0.2119F));

		PartDefinition cube_r138 = bone15.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6158F, 0.4142F, 2.8292F, -0.1222F, -0.1718F, -1.3075F));

		PartDefinition cube_r139 = bone15.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-3.7F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4929F, -1.5855F, 2.9954F, -0.2057F, -0.0449F, -0.5716F));

		PartDefinition cube_r140 = bone15.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 74).mirror().addBox(-1.675F, 0.0447F, -0.0543F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2869F, 0.1199F, -0.9864F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3845F, -7.3277F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(55, 143).addBox(0.5F, -0.9278F, -0.0823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(23, 143).addBox(0.5F, -1.1248F, 3.8203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(20, 143).addBox(0.5F, -0.9917F, 1.8215F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 26).addBox(0.0F, 0.0083F, -0.1785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(88, 142).addBox(0.5F, -0.6917F, -0.1785F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(48, 9).addBox(-1.0F, 0.6836F, 0.4585F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0998F, -7.9586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(109, 83).mirror().addBox(-5.1126F, 0.0089F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.1561F, -0.0177F, 0.1121F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(126, 70).mirror().addBox(-6.8831F, -3.3481F, -0.5454F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.1298F, 0.0887F, -0.5964F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(108, 103).mirror().addBox(-7.7443F, -7.1457F, -0.5454F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, 0.3186F, -2.3521F, 0.0343F, 0.1533F, -1.35F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-5.0234F, -0.149F, -0.4587F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.2081F, -0.0235F, 0.111F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(124, 76).mirror().addBox(-6.7134F, -3.4071F, -0.4379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.1734F, 0.118F, -0.5919F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-9.5799F, -7.0731F, -0.4379F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -4.4F, 0.046F, 0.2044F, -1.3479F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(74, 72).mirror().addBox(-4.6118F, -0.0268F, -0.3764F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.295F, -0.0325F, 0.126F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(112, 22).mirror().addBox(-6.4847F, -3.0421F, -0.3438F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.2465F, 0.1669F, -0.5641F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(27, 9).mirror().addBox(-10.6615F, -6.6502F, -0.3438F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.5F, 0.0655F, 0.2896F, -1.3257F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(109, 83).addBox(0.1126F, 0.0089F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.1561F, 0.0177F, -0.1121F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(126, 70).addBox(3.8831F, -3.3481F, -0.5454F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.1298F, -0.0887F, 0.5964F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(108, 103).addBox(2.7443F, -7.1457F, -0.5454F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3936F, 0.3186F, -2.3521F, 0.0343F, -0.1533F, 1.35F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(102, 70).addBox(0.0234F, -0.149F, -0.4587F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.2081F, 0.0235F, -0.111F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(124, 76).addBox(3.7134F, -3.4071F, -0.4379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.1734F, -0.118F, 0.5919F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(61, 54).addBox(2.5798F, -7.0731F, -0.4379F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.4F, 0.046F, -0.2044F, 1.3479F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(74, 72).addBox(-0.3882F, -0.0268F, -0.3764F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.295F, 0.0325F, -0.126F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(112, 22).addBox(3.4847F, -3.0421F, -0.3438F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.2465F, -0.1669F, 0.5641F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(27, 9).addBox(2.6615F, -6.6502F, -0.3438F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -6.5F, 0.0655F, -0.2896F, 1.3257F));

		PartDefinition osteoderns = body.addOrReplaceChild("osteoderns", CubeListBuilder.create(), PartPose.offset(10.5709F, 4.4635F, 0.0213F));

		PartDefinition cube_r164 = osteoderns.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(128, 35).addBox(-1.0F, -0.9F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(96, 134).addBox(-0.8F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-8.3096F, -5.9532F, -5.2365F, -3.0913F, 0.022F, 0.1352F));

		PartDefinition cube_r165 = osteoderns.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(133, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.3307F, -5.2368F, -4.0548F, -3.0873F, 0.0082F, 0.3966F));

		PartDefinition cube_r166 = osteoderns.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(135, 127).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.5221F, -3.9813F, -1.484F, 3.1276F, -0.0599F, 0.6551F));

		PartDefinition cube_r167 = osteoderns.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(78, 133).addBox(-0.9F, -0.8F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.0123F, -3.6346F, -5.4658F, -3.0683F, -0.0599F, 0.6551F));

		PartDefinition cube_r168 = osteoderns.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(40, 106).addBox(-0.4725F, -1.1223F, -2.0671F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.783F, -0.1005F, -3.7894F, 3.0974F, -0.0338F, 1.9728F));

		PartDefinition cube_r169 = osteoderns.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(103, 118).addBox(-0.4432F, -2.1491F, -0.1561F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.783F, -0.1005F, -3.7894F, 0.5579F, -0.0338F, 1.9728F));

		PartDefinition cube_r170 = osteoderns.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(37, 127).addBox(-0.4725F, -0.9931F, -0.3161F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.783F, -0.1005F, -3.7894F, 2.6174F, -0.0338F, 1.9728F));

		PartDefinition osteoderns2 = body.addOrReplaceChild("osteoderns2", CubeListBuilder.create(), PartPose.offset(-10.5709F, 4.4635F, 0.0213F));

		PartDefinition cube_r171 = osteoderns2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(128, 35).mirror().addBox(0.0F, -0.9F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(96, 134).mirror().addBox(-0.2F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(8.3096F, -5.9532F, -5.2365F, -3.0913F, -0.022F, -0.1352F));

		PartDefinition cube_r172 = osteoderns2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(133, 113).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.3307F, -5.2368F, -4.0548F, -3.0873F, -0.0082F, -0.3966F));

		PartDefinition cube_r173 = osteoderns2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(135, 127).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.5221F, -3.9813F, -1.484F, 3.1276F, 0.0599F, -0.6551F));

		PartDefinition cube_r174 = osteoderns2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 133).mirror().addBox(-0.1F, -0.8F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.0123F, -3.6346F, -5.4658F, -3.0683F, 0.0599F, -0.6551F));

		PartDefinition cube_r175 = osteoderns2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.5275F, -1.1223F, -2.0671F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.783F, -0.1005F, -3.7894F, 3.0974F, 0.0338F, -1.9728F));

		PartDefinition cube_r176 = osteoderns2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(103, 118).mirror().addBox(-0.5568F, -2.1491F, -0.1561F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.783F, -0.1005F, -3.7894F, 0.5579F, 0.0338F, -1.9728F));

		PartDefinition cube_r177 = osteoderns2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(37, 127).mirror().addBox(-0.5275F, -0.9931F, -0.3161F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.783F, -0.1005F, -3.7894F, 2.6174F, 0.0338F, -1.9728F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1983F, -7.1F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(30, 82).addBox(-2.0354F, -1.8566F, 1.7649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(116, 0).addBox(-2.0354F, -1.3046F, -0.1939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(17, 74).addBox(-3.3387F, -0.1253F, -4.7678F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(78, 60).addBox(-3.0F, -0.6F, -2.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(-2.0F, -0.6F, -0.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8402F, -6.7901F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(0.7713F, 0.3128F, -1.4611F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.5615F, -1.2695F, -0.3985F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(40, 56).mirror().addBox(-0.1333F, 0.1706F, -1.4985F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.6278F, -1.2984F, -0.4676F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.4408F, -0.0115F, -2.4033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.6845F, -1.2609F, -0.44F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-2.446F, -0.3002F, -2.2474F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3387F, 9.5487F, 0.1284F, 0.9817F, -1.3212F, -0.6643F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(119, 100).mirror().addBox(-4.0306F, -0.0622F, -0.3718F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.3736F, -0.0377F, 0.1579F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(129, 80).mirror().addBox(-6.007F, -2.6993F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.3119F, 0.2124F, -0.5171F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(-10.546F, -6.0737F, -0.3718F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, 1.0219F, -1.2342F, 0.0811F, 0.367F, -1.286F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(129, 78).mirror().addBox(-4.8149F, -1.1635F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.5395F, 0.3394F, -0.5075F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(111, 76).mirror().addBox(-7.7215F, -4.1375F, -0.2884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.156F, 0.6112F, -1.3033F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(128, 121).mirror().addBox(-2.1233F, 0.3148F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6354F, 2.5035F, -7.2138F, 0.6253F, -0.0666F, 0.0919F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(119, 62).mirror().addBox(-3.573F, -0.035F, -0.5435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.5382F, -0.0583F, 0.045F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(128, 119).mirror().addBox(-5.6794F, -2.3786F, -0.5435F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.4598F, 0.296F, -0.5847F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-8.5252F, -5.6157F, -0.5435F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 2.0035F, -4.7138F, 0.1293F, 0.5269F, -1.3701F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-4.0245F, 0.2754F, -0.5387F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.4686F, -0.0514F, 0.0837F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(128, 98).mirror().addBox(-6.2239F, -2.4405F, -0.5387F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.3976F, 0.2601F, -0.5669F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-9.8811F, -6.0324F, -0.5387F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, 1.0184F, -3.0362F, 0.1098F, 0.4592F, -1.3444F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(19, 58).addBox(-1.7713F, 0.3128F, -1.4611F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.5615F, 1.2695F, 0.3985F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(40, 56).addBox(-0.8667F, 0.1706F, -1.4985F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.6278F, 1.2984F, 0.4676F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 56).addBox(0.4408F, -0.0115F, -2.4033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.6845F, 1.2609F, 0.44F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(36, 73).addBox(1.446F, -0.3002F, -2.2474F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3387F, 9.5487F, 0.1284F, 0.9817F, 1.3212F, 0.6643F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(117, 40).addBox(-2.5354F, -0.4162F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(87, 114).addBox(-2.0354F, -1.9507F, 5.7582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 12).addBox(-2.0354F, -1.9507F, 3.7582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(119, 100).addBox(0.0306F, -0.0622F, -0.3718F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.3736F, 0.0377F, -0.1579F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(129, 80).addBox(3.007F, -2.6993F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.3119F, -0.2124F, 0.5171F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(27, 11).addBox(2.546F, -6.0737F, -0.3718F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5089F, 1.0219F, -1.2342F, 0.0811F, -0.367F, 1.286F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(129, 78).addBox(1.8149F, -1.1635F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.5395F, -0.3394F, 0.5075F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(111, 76).addBox(2.7215F, -4.1375F, -0.2884F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.156F, -0.6112F, 1.3033F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(128, 121).addBox(-0.8767F, 0.3148F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6354F, 2.5035F, -7.2138F, 0.6253F, 0.0666F, -0.0919F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(119, 62).addBox(-0.427F, -0.035F, -0.5435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.5382F, 0.0583F, -0.045F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(128, 119).addBox(2.6794F, -2.3786F, -0.5435F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.4598F, -0.296F, 0.5847F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 6).addBox(2.5252F, -5.6157F, -0.5435F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 2.0035F, -4.7138F, 0.1293F, -0.5269F, 1.3701F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(110, 50).addBox(-0.9755F, 0.2754F, -0.5387F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.4686F, 0.0514F, -0.0837F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(128, 98).addBox(3.2239F, -2.4405F, -0.5387F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.3976F, -0.2601F, 0.5669F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 51).addBox(2.8811F, -6.0324F, -0.5387F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5509F, 1.0184F, -3.0362F, 0.1098F, -0.4592F, 1.3444F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(97, 25).addBox(-1.0F, 1.0484F, -0.0506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7756F, -8.0525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(74, 65).addBox(-1.0F, 0.975F, -0.0797F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6442F, -5.3011F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(86, 6).addBox(-2.5354F, -0.6794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.5155F, -0.713F, -5.1201F));

		PartDefinition cube_r219 = bone5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(102, 141).addBox(-1.0F, 0.0F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 115).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3052F, 2.6474F, -1.3447F, 0.1847F, 0.5022F, -0.043F));

		PartDefinition cube_r220 = bone5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(10, 143).addBox(-0.5F, -0.4F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 119).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.7509F, 2.7115F, -1.0305F, 0.4423F, 0.3068F, 0.5898F));

		PartDefinition cube_r221 = bone5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(138, 72).addBox(-0.3F, 0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 59).addBox(-0.3F, 0.1F, 0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9939F, 1.9776F, -2.7229F, 0.4229F, 0.1086F, 0.4965F));

		PartDefinition cube_r222 = bone5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(110, 24).addBox(-0.3F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.892F, 0.5371F, 0.3933F, 0.3195F, 0.1507F, 0.3715F));

		PartDefinition cube_r223 = bone5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(110, 29).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0155F, 0.4568F, -1.2207F, 0.3173F, -0.0981F, 0.2897F));

		PartDefinition cube_r224 = bone5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(49, 82).addBox(-1.0F, 0.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1817F, 2.1006F, 4.9336F, 0.0208F, 0.2497F, -0.1916F));

		PartDefinition cube_r225 = bone5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.5543F, 0.9765F, 5.2306F, 0.18F, 0.1491F, 0.6045F));

		PartDefinition cube_r226 = bone5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(80, 44).addBox(0.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8675F, -0.0759F, 5.0139F, 0.179F, -0.1086F, 0.5578F));

		PartDefinition cube_r227 = bone5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(17, 67).addBox(0.0F, 0.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0377F, -0.9258F, 4.8487F, 0.205F, -0.0413F, 0.2143F));

		PartDefinition bone13 = chest.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5155F, -0.713F, -5.1201F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r228 = bone13.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(102, 141).mirror().addBox(0.0F, 0.0F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(0, 115).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3052F, 2.6474F, -1.3447F, 0.1847F, -0.5022F, 0.043F));

		PartDefinition cube_r229 = bone13.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(10, 143).mirror().addBox(-0.5F, -0.4F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 119).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.7509F, 2.7115F, -1.0305F, 0.4423F, -0.3068F, -0.5898F));

		PartDefinition cube_r230 = bone13.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(138, 72).mirror().addBox(-1.7F, 0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 59).mirror().addBox(-1.7F, 0.1F, 0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9939F, 1.9776F, -2.7229F, 0.4229F, -0.1086F, -0.4965F));

		PartDefinition cube_r231 = bone13.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(110, 24).mirror().addBox(-1.7F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.892F, 0.5371F, 0.3933F, 0.3195F, -0.1507F, -0.3715F));

		PartDefinition cube_r232 = bone13.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(110, 29).mirror().addBox(-2.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0155F, 0.4568F, -1.2207F, 0.3173F, 0.0981F, -0.2897F));

		PartDefinition cube_r233 = bone13.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(0.0F, 0.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1817F, 2.1006F, 4.9336F, 0.0208F, -0.2497F, 0.1916F));

		PartDefinition cube_r234 = bone13.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-2.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.5543F, 0.9765F, 5.2306F, 0.18F, -0.1491F, -0.6045F));

		PartDefinition cube_r235 = bone13.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(80, 44).mirror().addBox(-2.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8675F, -0.0759F, 5.0139F, 0.179F, 0.1086F, -0.5578F));

		PartDefinition cube_r236 = bone13.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-4.0F, 0.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0377F, -0.9258F, 4.8487F, 0.205F, 0.0413F, -0.2143F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(11.2333F, 5.1399F, -2.9146F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r237 = osteoderms4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(126, 124).addBox(-0.4709F, -0.1176F, -0.2114F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 2.714F, -0.0745F, 1.9675F));

		PartDefinition cube_r238 = osteoderms4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(120, 78).addBox(-0.4709F, -0.1321F, -1.645F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, -2.9583F, -0.0745F, 1.9675F));

		PartDefinition cube_r239 = osteoderms4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(128, 57).addBox(-0.4416F, 1.8582F, -4.4528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, -2.8536F, -0.0745F, 1.9675F));

		PartDefinition cube_r240 = osteoderms4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(137, 43).addBox(-0.4416F, 2.2121F, -3.7077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 3.1242F, -0.0745F, 1.9675F));

		PartDefinition cube_r241 = osteoderms4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(40, 137).addBox(-0.4416F, 4.2699F, -0.7635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 2.6006F, -0.0745F, 1.9675F));

		PartDefinition cube_r242 = osteoderms4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(28, 137).addBox(-0.4416F, 4.2086F, 1.3983F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 2.2952F, -0.0745F, 1.9675F));

		PartDefinition cube_r243 = osteoderms4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 94).addBox(-0.4416F, -2.6862F, 0.603F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 0.6546F, -0.0745F, 1.9675F));

		PartDefinition cube_r244 = osteoderms4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(124, 102).addBox(-0.4709F, 1.1834F, -0.9986F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.2005F, -0.9563F, 0.7337F, 2.365F, -0.0745F, 1.9675F));

		PartDefinition cube_r245 = osteoderms4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(94, 118).addBox(-1.0222F, -0.2898F, 3.8605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 1.3323F, 0.0543F, 1.9237F));

		PartDefinition cube_r246 = osteoderms4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(131, 102).addBox(-1.0222F, -3.0356F, 3.226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(89, 131).addBox(-1.0222F, -3.5356F, 3.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 0.8261F, 0.0543F, 1.9237F));

		PartDefinition cube_r247 = osteoderms4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(110, 4).addBox(-1.0006F, -1.943F, 0.7039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 1.2886F, 0.0543F, 1.9237F));

		PartDefinition cube_r248 = osteoderms4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(103, 125).addBox(-1.03F, -0.7489F, -0.205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 2.3009F, 0.0543F, 1.9237F));

		PartDefinition cube_r249 = osteoderms4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(126, 83).addBox(-1.0006F, -3.0692F, 2.7463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 0.9396F, 0.0543F, 1.9237F));

		PartDefinition cube_r250 = osteoderms4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 64).addBox(-1.0006F, -2.9434F, -0.7191F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 0.9832F, 0.0543F, 1.9237F));

		PartDefinition cube_r251 = osteoderms4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(126, 88).addBox(-1.0006F, 0.2857F, 2.686F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, 1.6639F, 0.0543F, 1.9237F));

		PartDefinition cube_r252 = osteoderms4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(9, 128).addBox(-0.5F, -1.5953F, -1.311F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-6.296F, -5.1697F, -1.672F, 2.2379F, 0.1191F, 0.7629F));

		PartDefinition cube_r253 = osteoderms4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(133, 39).addBox(-0.5F, -0.2128F, -1.698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.296F, -5.1697F, -1.672F, 2.8924F, 0.1191F, 0.7629F));

		PartDefinition cube_r254 = osteoderms4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(133, 52).addBox(-0.5F, -0.575F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.9458F, -4.0297F, 2.6146F, -3.074F, 0.0681F, 0.5768F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(44, 133).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.2817F, -5.3706F, 2.5552F, -3.0617F, -0.0457F, 0.3414F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(110, 11).addBox(-0.8871F, -1.3476F, -1.405F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-9.1856F, -5.1797F, 2.4971F, 2.2879F, 0.0659F, 0.4725F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(110, 127).addBox(0.0F, -0.6128F, -1.198F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-10.096F, -5.6197F, -1.672F, 2.7318F, -0.0173F, 0.5447F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(126, 8).addBox(-1.03F, -0.5488F, 0.4174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7005F, -0.1563F, -2.6663F, -2.9351F, 0.0543F, 1.9237F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.2333F, 5.1399F, -2.9146F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r259 = osteoderms15.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(126, 124).mirror().addBox(-0.5291F, -0.1176F, -0.2114F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 2.714F, 0.0745F, -1.9675F));

		PartDefinition cube_r260 = osteoderms15.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(120, 78).mirror().addBox(-0.5291F, -0.1321F, -1.645F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, -2.9583F, 0.0745F, -1.9675F));

		PartDefinition cube_r261 = osteoderms15.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(128, 57).mirror().addBox(-0.5584F, 1.8582F, -4.4528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, -2.8536F, 0.0745F, -1.9675F));

		PartDefinition cube_r262 = osteoderms15.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(137, 43).mirror().addBox(-0.5584F, 2.2121F, -3.7077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 3.1242F, 0.0745F, -1.9675F));

		PartDefinition cube_r263 = osteoderms15.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(40, 137).mirror().addBox(-0.5584F, 4.2699F, -0.7635F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 2.6006F, 0.0745F, -1.9675F));

		PartDefinition cube_r264 = osteoderms15.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(28, 137).mirror().addBox(-0.5584F, 4.2086F, 1.3983F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 2.2952F, 0.0745F, -1.9675F));

		PartDefinition cube_r265 = osteoderms15.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-0.5584F, -2.6862F, 0.603F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 0.6546F, 0.0745F, -1.9675F));

		PartDefinition cube_r266 = osteoderms15.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(124, 102).mirror().addBox(-0.5291F, 1.1834F, -0.9986F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.2005F, -0.9563F, 0.7337F, 2.365F, 0.0745F, -1.9675F));

		PartDefinition cube_r267 = osteoderms15.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(94, 118).mirror().addBox(0.0222F, -0.2898F, 3.8605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 1.3323F, -0.0543F, -1.9237F));

		PartDefinition cube_r268 = osteoderms15.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(131, 102).mirror().addBox(0.0222F, -3.0356F, 3.226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(89, 131).mirror().addBox(0.0222F, -3.5356F, 3.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 0.8261F, -0.0543F, -1.9237F));

		PartDefinition cube_r269 = osteoderms15.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(110, 4).mirror().addBox(0.0006F, -1.943F, 0.7039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 1.2886F, -0.0543F, -1.9237F));

		PartDefinition cube_r270 = osteoderms15.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(103, 125).mirror().addBox(0.03F, -0.7489F, -0.205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 2.3009F, -0.0543F, -1.9237F));

		PartDefinition cube_r271 = osteoderms15.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(0.0006F, -3.0692F, 2.7463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 0.9396F, -0.0543F, -1.9237F));

		PartDefinition cube_r272 = osteoderms15.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(91, 64).mirror().addBox(0.0006F, -2.9434F, -0.7191F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 0.9832F, -0.0543F, -1.9237F));

		PartDefinition cube_r273 = osteoderms15.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(126, 88).mirror().addBox(0.0006F, 0.2857F, 2.686F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, 1.6639F, -0.0543F, -1.9237F));

		PartDefinition cube_r274 = osteoderms15.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(9, 128).mirror().addBox(-0.5F, -1.5953F, -1.311F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(6.296F, -5.1697F, -1.672F, 2.2379F, -0.1191F, -0.7629F));

		PartDefinition cube_r275 = osteoderms15.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(133, 39).mirror().addBox(-0.5F, -0.2128F, -1.698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.296F, -5.1697F, -1.672F, 2.8924F, -0.1191F, -0.7629F));

		PartDefinition cube_r276 = osteoderms15.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(133, 52).mirror().addBox(-0.5F, -0.575F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.9458F, -4.0297F, 2.6146F, -3.074F, -0.0681F, -0.5768F));

		PartDefinition cube_r277 = osteoderms15.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(44, 133).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.2817F, -5.3706F, 2.5552F, -3.0617F, 0.0457F, -0.3414F));

		PartDefinition cube_r278 = osteoderms15.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(110, 11).mirror().addBox(-0.1129F, -1.3476F, -1.405F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(9.1856F, -5.1797F, 2.4971F, 2.2879F, -0.0659F, -0.4725F));

		PartDefinition cube_r279 = osteoderms15.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(110, 127).mirror().addBox(-1.0F, -0.6128F, -1.198F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(10.096F, -5.6197F, -1.672F, 2.7318F, 0.0173F, -0.5447F));

		PartDefinition cube_r280 = osteoderms15.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(126, 8).mirror().addBox(0.03F, -0.5488F, 0.4174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7005F, -0.1563F, -2.6663F, -2.9351F, -0.0543F, -1.9237F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8676F, 3.5885F, -6.3414F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(38, 94).addBox(2.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6341F, -0.6835F, -0.8463F, 0.6482F, 0.5705F, 0.8236F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(17, 139).addBox(-0.276F, -3.1823F, -1.2452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -1.3846F, 0.2244F, -0.096F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(126, 52).addBox(-0.245F, -2.2236F, 0.4231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 0.1687F, 0.2244F, -0.096F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(139, 16).addBox(-0.276F, -3.3738F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -0.8436F, 0.2244F, -0.096F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(44, 128).addBox(-0.3958F, -1.725F, -1.9037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 1.0313F, 0.3585F, -0.0307F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(126, 39).addBox(-0.3958F, -1.6361F, -0.4965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, 0.6997F, 0.3585F, -0.0307F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(95, 53).addBox(-0.2149F, 1.5463F, -2.3213F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7386F, 0.2251F, 0.7601F, -0.8144F, 0.435F, -0.0326F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(139, 12).addBox(2.3634F, 0.1949F, -0.8495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 102).addBox(2.3634F, 0.1949F, 0.1505F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6341F, -0.6835F, -0.8463F, 0.1071F, 0.5705F, 0.8236F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8676F, 3.5885F, -6.3414F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r289 = bone11.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(38, 94).mirror().addBox(-3.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.6341F, -0.6835F, -0.8463F, 0.6482F, -0.5705F, -0.8236F));

		PartDefinition cube_r290 = bone11.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(17, 139).mirror().addBox(-0.724F, -3.1823F, -1.2452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -1.3846F, -0.2244F, 0.096F));

		PartDefinition cube_r291 = bone11.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-0.755F, -2.2236F, 0.4231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 0.1687F, -0.2244F, 0.096F));

		PartDefinition cube_r292 = bone11.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(139, 16).mirror().addBox(-0.724F, -3.3738F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -0.8436F, -0.2244F, 0.096F));

		PartDefinition cube_r293 = bone11.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(44, 128).mirror().addBox(-0.6042F, -1.725F, -1.9037F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 1.0313F, -0.3585F, 0.0307F));

		PartDefinition cube_r294 = bone11.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(126, 39).mirror().addBox(-0.6042F, -1.6361F, -0.4965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, 0.6997F, -0.3585F, 0.0307F));

		PartDefinition cube_r295 = bone11.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(95, 53).mirror().addBox(-0.7851F, 1.5463F, -2.3213F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.2251F, 0.7601F, -0.8144F, -0.435F, 0.0326F));

		PartDefinition cube_r296 = bone11.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-3.3634F, 0.1949F, -0.8495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 102).mirror().addBox(-3.3634F, 0.1949F, 0.1505F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6341F, -0.6835F, -0.8463F, 0.1071F, -0.5705F, -0.8236F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8118F, 7.5705F, -6.8296F, 0.6894F, -0.0008F, -0.2182F));

		PartDefinition cube_r297 = leftarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(65, 121).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r298 = leftarm.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(7, 137).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r299 = leftarm.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 103).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(22, 111).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftarm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(82, 129).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6694F, 5.1524F, 2.2788F, -0.7587F, -0.8086F, 1.3328F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(33, 111).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.67F, 0.5245F, -2.7163F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 93).addBox(0.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 1.3672F, 0.6437F, -0.5477F));

		PartDefinition cube_r304 = lefthand.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(111, 72).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r305 = lefthand.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(97, 30).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r306 = lefthand.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(123, 18).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r307 = lefthand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(122, 72).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8118F, 7.5705F, -6.8296F, 0.1222F, 0.0008F, 0.2182F));

		PartDefinition cube_r308 = rightarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(16, 125).addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(138, 75).addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(51, 106).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(113, 64).addBox(-1.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(135, 94).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6694F, 5.1524F, 2.2788F, -0.5992F, 0.9187F, -1.1236F));

		PartDefinition cube_r313 = rightarm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(69, 113).addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.67F, 0.5245F, -2.7163F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r314 = rightarm2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(20, 94).addBox(-2.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 0.9309F, -0.6437F, 0.5477F));

		PartDefinition cube_r315 = righthand.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(113, 105).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r316 = righthand.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(97, 35).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r317 = righthand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(126, 0).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r318 = righthand.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 126).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7F, -7.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(28, 128).addBox(0.5F, -1.1F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 72).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(121, 102).addBox(0.5F, -0.6346F, -0.0211F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r321 = neck3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-0.5352F, -0.0581F, -0.4399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.293F, 0.2089F, -3.1F, 0.5735F, 0.2434F, -0.1481F));

		PartDefinition cube_r322 = neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-5.5046F, -4.5953F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.0172F, 0.5471F, -1.4109F));

		PartDefinition cube_r323 = neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(126, 129).mirror().addBox(-4.5817F, -1.3311F, -0.5072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.4045F, 0.3794F, -0.5866F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(89, 129).mirror().addBox(-2.0573F, 0.0353F, -0.5072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4354F, 0.0035F, -1.3138F, 0.546F, 0.0398F, 0.0614F));

		PartDefinition cube_r325 = neck3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-2.3717F, -0.403F, -0.4399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.293F, 0.2089F, -3.1F, 0.2855F, 0.5554F, -0.8539F));

		PartDefinition cube_r326 = neck3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(103, 4).addBox(-1.4648F, -0.0581F, -0.4399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.293F, 0.2089F, -3.1F, 0.5735F, -0.2434F, 0.1481F));

		PartDefinition cube_r327 = neck3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 130).addBox(2.5046F, -4.5953F, -0.5401F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.0172F, -0.5471F, 1.4109F));

		PartDefinition cube_r328 = neck3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(126, 129).addBox(1.5817F, -1.3311F, -0.5072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.4045F, -0.3794F, 0.5866F));

		PartDefinition cube_r329 = neck3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(89, 129).addBox(-0.9427F, 0.0353F, -0.5072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4354F, 0.0035F, -1.3138F, 0.546F, -0.0398F, -0.0614F));

		PartDefinition cube_r330 = neck3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(98, 86).addBox(0.3717F, -0.403F, -0.4399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.293F, 0.2089F, -3.1F, 0.2855F, -0.5554F, 0.8539F));

		PartDefinition cube_r331 = neck3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(15, 82).addBox(-1.5F, -0.75F, -2.275F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5067F, -1.5146F, 0.1594F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.698F, 0.7134F, -3.7876F, -0.0137F, -0.1038F, 0.1316F));

		PartDefinition cube_r332 = osteoderms3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(131, 72).addBox(0.1155F, -0.1096F, 8.3732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.4851F, -0.0828F, 1.8827F));

		PartDefinition cube_r333 = osteoderms3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(71, 131).addBox(0.1155F, -4.1526F, 7.4247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.0662F, -0.0828F, 1.8827F));

		PartDefinition cube_r334 = osteoderms3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(29, 105).addBox(0.1155F, 0.4113F, 4.7372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F))
				.texOffs(49, 100).addBox(0.1155F, 1.0113F, 4.7372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.616F, -0.0828F, 1.8827F));

		PartDefinition cube_r335 = osteoderms3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(60, 104).addBox(0.1155F, -2.3112F, 4.3491F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 104).addBox(0.1155F, -2.9112F, 4.3491F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.2233F, -0.0828F, 1.8827F));

		PartDefinition cube_r336 = osteoderms3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(82, 107).addBox(0.1155F, 0.7095F, 2.2359F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.9214F, -0.0828F, 1.8827F));

		PartDefinition cube_r337 = osteoderms3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(128, 30).addBox(0.0861F, 1.836F, -1.8857F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 2.9773F, -0.0828F, 1.8827F));

		PartDefinition cube_r338 = osteoderms3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(43, 90).addBox(0.1155F, -1.8623F, 1.2281F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, 1.4414F, -0.0828F, 1.8827F));

		PartDefinition cube_r339 = osteoderms3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(113, 138).addBox(0.1155F, -0.1357F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, -2.9655F, -0.0828F, 1.8827F));

		PartDefinition cube_r340 = osteoderms3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(66, 141).addBox(-0.5F, -1.0953F, -0.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.5608F, -2.2932F, 1.701F, 2.801F, 0.0661F, 0.5192F));

		PartDefinition cube_r341 = osteoderms3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(127, 108).addBox(-0.5F, -1.0128F, -1.498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5608F, -2.2932F, 1.701F, 3.0191F, 0.0661F, 0.5192F));

		PartDefinition cube_r342 = osteoderms3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 110).addBox(0.0861F, -0.0227F, -2.675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.0F, -2.5205F, -0.0828F, 1.8827F));

		PartDefinition osteoderms14 = neck3.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.698F, 0.7134F, -3.7876F, -0.0137F, 0.1038F, -0.1316F));

		PartDefinition cube_r343 = osteoderms14.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(131, 72).mirror().addBox(-1.1155F, -0.1096F, 8.3732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.4851F, 0.0828F, -1.8827F));

		PartDefinition cube_r344 = osteoderms14.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(71, 131).mirror().addBox(-1.1155F, -4.1526F, 7.4247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.0662F, 0.0828F, -1.8827F));

		PartDefinition cube_r345 = osteoderms14.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-1.1155F, 0.4113F, 4.7372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(49, 100).mirror().addBox(-1.1155F, 1.0113F, 4.7372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.616F, 0.0828F, -1.8827F));

		PartDefinition cube_r346 = osteoderms14.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-1.1155F, -2.3112F, 4.3491F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 104).mirror().addBox(-1.1155F, -2.9112F, 4.3491F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.2233F, 0.0828F, -1.8827F));

		PartDefinition cube_r347 = osteoderms14.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(82, 107).mirror().addBox(-1.1155F, 0.7095F, 2.2359F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.9214F, 0.0828F, -1.8827F));

		PartDefinition cube_r348 = osteoderms14.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(128, 30).mirror().addBox(-1.0861F, 1.836F, -1.8857F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 2.9773F, 0.0828F, -1.8827F));

		PartDefinition cube_r349 = osteoderms14.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-1.1155F, -1.8623F, 1.2281F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, 1.4414F, 0.0828F, -1.8827F));

		PartDefinition cube_r350 = osteoderms14.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(113, 138).mirror().addBox(-1.1155F, -0.1357F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, -2.9655F, 0.0828F, -1.8827F));

		PartDefinition cube_r351 = osteoderms14.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(66, 141).mirror().addBox(-0.5F, -1.0953F, -0.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.5608F, -2.2932F, 1.701F, 2.801F, -0.0661F, -0.5192F));

		PartDefinition cube_r352 = osteoderms14.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(127, 108).mirror().addBox(-0.5F, -1.0128F, -1.498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5608F, -2.2932F, 1.701F, 3.0191F, -0.0661F, -0.5192F));

		PartDefinition cube_r353 = osteoderms14.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(60, 110).mirror().addBox(-1.0861F, -0.0227F, -2.675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, 0.0F, -2.5205F, 0.0828F, -1.8827F));

		PartDefinition bone4 = neck3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.1F, -2.5052F, -2.0561F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(106, 86).addBox(-2.0116F, -1.095F, -1.7701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0023F, 2.0245F, 0.1064F, 0.1697F, 0.0015F, 0.3415F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(84, 25).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6964F, 1.6287F, -1.7023F, -0.2044F, 0.5683F, -0.2454F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(38, 98).addBox(-1.0F, -0.1F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.0474F, 0.8593F, 0.1189F, -0.3976F, 0.1886F, -1.0532F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(94, 109).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 109).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0474F, 0.8593F, 0.1189F, -0.0922F, 0.1886F, -1.0532F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(106, 53).addBox(-1.3695F, -1.095F, -1.8441F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0023F, 2.0245F, 0.1064F, 0.171F, 0.1219F, 0.3623F));

		PartDefinition bone12 = neck3.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5052F, -2.0561F, 0.0F, 0.0785F, 0.0F));

		PartDefinition cube_r359 = bone12.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(106, 86).mirror().addBox(1.0116F, -1.095F, -1.7701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0023F, 2.0245F, 0.1064F, 0.1697F, -0.0015F, -0.3415F));

		PartDefinition cube_r360 = bone12.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(0.0F, 0.0F, -0.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6964F, 1.6287F, -1.7023F, -0.2044F, -0.5683F, 0.2454F));

		PartDefinition cube_r361 = bone12.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(0.0F, -0.1F, -1.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0474F, 0.8593F, 0.1189F, -0.3976F, -0.1886F, 1.0532F));

		PartDefinition cube_r362 = bone12.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(94, 109).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 109).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0474F, 0.8593F, 0.1189F, -0.0922F, -0.1886F, 1.0532F));

		PartDefinition cube_r363 = bone12.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(106, 53).mirror().addBox(0.3695F, -1.095F, -1.8441F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0023F, 2.0245F, 0.1064F, 0.171F, -0.1219F, -0.3623F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r364 = neck2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(92, 135).addBox(0.5F, -1.1F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 15).addBox(0.5F, -1.0F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 107).addBox(0.0F, -0.6F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(130, 13).mirror().addBox(-3.0152F, -0.0847F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.404F, 0.546F, -0.8458F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(137, 98).mirror().addBox(-2.0152F, -0.0847F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r367 = neck2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(130, 13).addBox(0.0151F, -0.0847F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.404F, -0.546F, 0.8458F));

		PartDefinition cube_r368 = neck2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(137, 98).addBox(0.0151F, -0.0847F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r369 = osteoderms2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(7, 133).addBox(-0.563F, -1.1181F, -0.7734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7553F, 3.5315F, -0.1696F, -3.0588F, 0.3569F, 2.0009F));

		PartDefinition cube_r370 = osteoderms2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(138, 135).addBox(-0.563F, -0.3824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7553F, 3.5315F, -0.1696F, -3.0326F, 0.3569F, 2.0009F));

		PartDefinition cube_r371 = osteoderms2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(140, 122).addBox(-0.563F, -1.2824F, -0.8603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4803F, 0.3565F, 0.5304F, 3.0221F, 0.1332F, 1.0124F));

		PartDefinition cube_r372 = osteoderms2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(33, 141).addBox(-0.563F, -1.2928F, -0.5453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4803F, 0.3565F, 0.5304F, 2.5858F, 0.1332F, 1.0124F));

		PartDefinition cube_r373 = osteoderms2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(48, 124).addBox(-2.1759F, -1.5866F, -0.9841F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1964F, 2.0457F, 0.0917F, -0.2334F, -0.0325F, -0.1358F));

		PartDefinition cube_r374 = osteoderms2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(124, 64).addBox(-0.2106F, -1.3896F, -0.9824F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1964F, 2.0457F, 0.0917F, -0.1814F, -0.1429F, -0.7484F));

		PartDefinition cube_r375 = osteoderms2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(28, 133).addBox(-0.4085F, 0.9414F, -0.309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1964F, 2.0457F, 0.0917F, -0.6035F, -0.168F, -0.8964F));

		PartDefinition cube_r376 = osteoderms2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(138, 131).addBox(-0.563F, -0.6928F, 0.0297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7553F, 3.5315F, -0.1696F, 2.7269F, 0.3569F, 2.0009F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r377 = osteoderms13.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(7, 133).mirror().addBox(-0.437F, -1.1181F, -0.7734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7553F, 3.5315F, -0.1696F, -3.0588F, -0.3569F, -2.0009F));

		PartDefinition cube_r378 = osteoderms13.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(138, 135).mirror().addBox(-0.437F, -0.3824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7553F, 3.5315F, -0.1696F, -3.0326F, -0.3569F, -2.0009F));

		PartDefinition cube_r379 = osteoderms13.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(140, 122).mirror().addBox(-0.437F, -1.2824F, -0.8603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4803F, 0.3565F, 0.5304F, 3.0221F, -0.1332F, -1.0124F));

		PartDefinition cube_r380 = osteoderms13.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(33, 141).mirror().addBox(-0.437F, -1.2928F, -0.5453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4803F, 0.3565F, 0.5304F, 2.5858F, -0.1332F, -1.0124F));

		PartDefinition cube_r381 = osteoderms13.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(48, 124).mirror().addBox(0.1759F, -1.5866F, -0.9841F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1964F, 2.0457F, 0.0917F, -0.2334F, 0.0325F, 0.1358F));

		PartDefinition cube_r382 = osteoderms13.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(124, 64).mirror().addBox(-0.7894F, -1.3896F, -0.9824F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1964F, 2.0457F, 0.0917F, -0.1814F, 0.1429F, 0.7484F));

		PartDefinition cube_r383 = osteoderms13.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(28, 133).mirror().addBox(-0.5915F, 0.9414F, -0.309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1964F, 2.0457F, 0.0917F, -0.6035F, 0.168F, 0.8964F));

		PartDefinition cube_r384 = osteoderms13.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(138, 131).mirror().addBox(-0.437F, -0.6928F, 0.0297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7553F, 3.5315F, -0.1696F, 2.7269F, -0.3569F, -2.0009F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, -0.2657F, -0.1685F, 0.0456F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(88, 139).addBox(0.5F, -0.6219F, 1.9925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 13).addBox(0.0F, -0.2219F, -1.0075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(49, 98).mirror().addBox(-3.3697F, 0.1338F, 0.1453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5F, -3.9F, 0.7087F, 0.8998F, -0.7267F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(49, 98).addBox(2.3697F, 0.1338F, 0.1453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, 0.7087F, -0.8998F, 0.7267F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r388 = osteoderms.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(140, 82).addBox(-0.563F, -1.2824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4553F, -0.2685F, 0.1304F, 3.1381F, 0.1F, 0.6334F));

		PartDefinition cube_r389 = osteoderms.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(140, 86).addBox(-0.563F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4553F, -0.2685F, 0.1304F, 2.7018F, 0.1F, 0.6334F));

		PartDefinition cube_r390 = osteoderms.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(140, 52).addBox(-0.563F, -1.2824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4553F, 0.1315F, -1.5696F, 3.0718F, 0.1574F, 1.0612F));

		PartDefinition cube_r391 = osteoderms.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(73, 140).addBox(-0.563F, -1.2928F, -0.5453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4553F, 0.1315F, -1.5696F, 2.6354F, 0.1574F, 1.0612F));

		PartDefinition cube_r392 = osteoderms.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(140, 38).addBox(-0.563F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0553F, 2.6315F, -1.4696F, 2.6354F, 0.1574F, 1.9775F));

		PartDefinition cube_r393 = osteoderms.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(140, 113).addBox(-0.201F, -0.6044F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.478F, 1.0798F, -1.7404F, 0.0638F, 0.0284F, -0.418F));

		PartDefinition cube_r394 = osteoderms.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(137, 27).addBox(-1.3964F, -0.7979F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.478F, 1.0798F, -1.7404F, 0.0691F, 0.0097F, -0.1393F));

		PartDefinition cube_r395 = osteoderms.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(50, 140).addBox(-0.563F, -1.3324F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0553F, 2.6315F, -1.4696F, 3.0718F, 0.1574F, 1.9775F));

		PartDefinition cube_r396 = osteoderms.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(54, 90).addBox(-0.563F, -1.4181F, -0.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4553F, 2.8315F, 0.6304F, -3.0194F, 0.1574F, 1.9775F));

		PartDefinition cube_r397 = osteoderms.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(110, 123).addBox(-1.8598F, -1.1858F, -0.9963F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1652F, 1.4474F, 0.2828F, -0.094F, -0.0837F, -0.1393F));

		PartDefinition cube_r398 = osteoderms.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(64, 127).addBox(-0.2037F, -0.8954F, -0.9904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1652F, 1.4474F, 0.2828F, -0.0362F, -0.1077F, -0.7442F));

		PartDefinition cube_r399 = osteoderms.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(133, 8).addBox(-0.3011F, 0.5105F, -0.6141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1652F, 1.4474F, 0.2828F, -0.3815F, -0.1111F, -0.8582F));

		PartDefinition cube_r400 = osteoderms.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(140, 8).addBox(-0.563F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(138, 60).addBox(-0.563F, -1.4678F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.4553F, 2.8315F, 0.6304F, 2.6354F, 0.1574F, 1.9775F));

		PartDefinition cube_r401 = osteoderms.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(61, 138).addBox(-0.563F, -1.2824F, -0.7603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4553F, 2.8315F, 0.6304F, 3.0718F, 0.1574F, 1.9775F));

		PartDefinition osteoderms6 = neck.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r402 = osteoderms6.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(140, 82).mirror().addBox(-0.437F, -1.2824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4553F, -0.2685F, 0.1304F, 3.1381F, -0.1F, -0.6334F));

		PartDefinition cube_r403 = osteoderms6.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(140, 86).mirror().addBox(-0.437F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4553F, -0.2685F, 0.1304F, 2.7018F, -0.1F, -0.6334F));

		PartDefinition cube_r404 = osteoderms6.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(140, 52).mirror().addBox(-0.437F, -1.2824F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4553F, 0.1315F, -1.5696F, 3.0718F, -0.1574F, -1.0612F));

		PartDefinition cube_r405 = osteoderms6.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(73, 140).mirror().addBox(-0.437F, -1.2928F, -0.5453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4553F, 0.1315F, -1.5696F, 2.6354F, -0.1574F, -1.0612F));

		PartDefinition cube_r406 = osteoderms6.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(140, 38).mirror().addBox(-0.437F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.0553F, 2.6315F, -1.4696F, 2.6354F, -0.1574F, -1.9775F));

		PartDefinition cube_r407 = osteoderms6.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(140, 113).mirror().addBox(-0.799F, -0.6044F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.478F, 1.0798F, -1.7404F, 0.0638F, -0.0284F, 0.418F));

		PartDefinition cube_r408 = osteoderms6.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(137, 27).mirror().addBox(-0.6036F, -0.7979F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.478F, 1.0798F, -1.7404F, 0.0691F, -0.0097F, 0.1393F));

		PartDefinition cube_r409 = osteoderms6.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(50, 140).mirror().addBox(-0.437F, -1.3324F, -0.7603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0553F, 2.6315F, -1.4696F, 3.0718F, -0.1574F, -1.9775F));

		PartDefinition cube_r410 = osteoderms6.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(-0.437F, -1.4181F, -0.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4553F, 2.8315F, 0.6304F, -3.0194F, -0.1574F, -1.9775F));

		PartDefinition cube_r411 = osteoderms6.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(110, 123).mirror().addBox(-0.1402F, -1.1858F, -0.9963F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1652F, 1.4474F, 0.2828F, -0.094F, 0.0837F, 0.1393F));

		PartDefinition cube_r412 = osteoderms6.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(64, 127).mirror().addBox(-0.7963F, -0.8954F, -0.9904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1652F, 1.4474F, 0.2828F, -0.0362F, 0.1077F, 0.7442F));

		PartDefinition cube_r413 = osteoderms6.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(133, 8).mirror().addBox(-0.6989F, 0.5105F, -0.6141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1652F, 1.4474F, 0.2828F, -0.3815F, 0.1111F, 0.8582F));

		PartDefinition cube_r414 = osteoderms6.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(140, 8).mirror().addBox(-0.437F, -1.2928F, -0.5452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(138, 60).mirror().addBox(-0.437F, -1.4678F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.4553F, 2.8315F, 0.6304F, 2.6354F, -0.1574F, -1.9775F));

		PartDefinition cube_r415 = osteoderms6.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(61, 138).mirror().addBox(-0.437F, -1.2824F, -0.7603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4553F, 2.8315F, 0.6304F, 3.0718F, -0.1574F, -1.9775F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4258F, -3.8931F, -0.3044F, -0.3593F, 0.0056F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(137, 24).addBox(-1.0F, -0.55F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7378F, -5.9759F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 110).addBox(-1.0F, -1.1F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(109, 78).addBox(-1.0F, -1.45F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.6334F, -2.6639F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(78, 103).addBox(-2.0F, -0.15F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -0.5046F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(103, 0).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(0.0F, -0.5655F, -0.5046F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 102).addBox(-2.7F, -1.5824F, -0.1106F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.035F))
				.texOffs(97, 49).addBox(-2.7F, -0.9824F, -0.1106F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.0297F)), PartPose.offsetAndRotation(0.7F, -2.6608F, -0.6642F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(112, 18).addBox(-2.7F, -1.9968F, -1.0796F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.3406F, -2.324F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(39, 123).addBox(-2.2F, -0.1297F, -0.1205F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -2.3525F, -2.4994F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(130, 44).addBox(-1.2F, -0.1758F, -0.063F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -1.6634F, -4.1762F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(117, 52).addBox(-1.0F, -0.88F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3213F, -0.9719F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(137, 21).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0028F)), PartPose.offsetAndRotation(0.0F, -0.2128F, -5.8179F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(134, 110).addBox(-1.0F, 0.0F, -0.975F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.0F, 0.8155F, -5.5364F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(71, 104).addBox(-1.0F, -0.775F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0027F)), PartPose.offsetAndRotation(0.0F, 0.3292F, -6.3874F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(67, 94).addBox(-1.0F, -0.3F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.0F, 0.3292F, -6.3874F, -0.8639F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.9406F, -5.724F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(27, 142).addBox(-0.8F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 1.2121F, 0.6156F, 1.0297F, 0.0239F, 0.006F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(5, 142).addBox(-0.615F, -0.396F, -0.594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.115F, 1.4579F, -0.799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(142, 4).addBox(-0.385F, -0.657F, -0.5842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.115F, 1.4579F, -0.799F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(102, 64).addBox(-0.8709F, -0.0736F, -3.3886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1809F, 0.2547F, -0.0135F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(101, 18).addBox(-0.9709F, -0.7736F, -0.0887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6702F, 0.6885F, 0.1373F, 0.3705F, 0.198F, 0.0486F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(85, 135).addBox(-0.1372F, -0.8196F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8707F, -1.8892F, 4.8437F, 1.294F, -0.0156F, 1.3172F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(135, 56).addBox(-0.1372F, -0.2446F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8707F, -1.8892F, 4.8437F, 1.2935F, 0.0599F, 1.2957F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(66, 135).addBox(-0.5F, -1.8617F, -1.5006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.8207F, -1.6142F, 5.1437F, 1.2013F, -0.1855F, 1.189F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(135, 68).addBox(-0.5F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7841F, -1.7845F, 4.0729F, 1.5068F, -0.1855F, 1.189F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(15, 143).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7841F, -1.7845F, 4.0729F, 0.8523F, -0.1855F, 1.189F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(76, 118).addBox(-0.2622F, 0.2891F, -2.8034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8707F, -1.8892F, 4.8437F, 1.5015F, 0.2695F, 1.2342F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(119, 124).addBox(-0.5F, 0.7742F, -1.5536F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8207F, -1.6142F, 5.1437F, -0.7709F, -0.1855F, 1.189F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(40, 118).addBox(-0.4323F, 0.0217F, -1.7514F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3871F, 0.2187F, 4.2394F, 1.8498F, -0.1892F, 2.5018F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(117, 90).addBox(-0.4323F, -0.914F, -1.9252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3871F, 0.2187F, 4.2394F, 1.0993F, -0.1892F, 2.5018F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(135, 90).addBox(-0.4323F, -0.4948F, -0.6707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3871F, 0.2187F, 4.2394F, 1.4833F, -0.1892F, 2.5018F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(130, 22).addBox(-0.635F, -0.5005F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1533F, -0.5696F, 4.2737F, 0.2793F, 0.0698F, 0.0F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(117, 85).addBox(-1.4F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(141, 110).addBox(-0.4749F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(140, 65).addBox(-0.3649F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1533F, -0.5696F, 4.2737F, 0.2356F, 0.0698F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.9406F, -5.724F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(27, 142).mirror().addBox(-0.2F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2121F, 0.6156F, 1.0297F, -0.0239F, -0.006F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(5, 142).mirror().addBox(-0.385F, -0.396F, -0.594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 1.4579F, -0.799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(142, 4).mirror().addBox(-0.615F, -0.657F, -0.5842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.115F, 1.4579F, -0.799F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(102, 64).mirror().addBox(-0.1291F, -0.0736F, -3.3886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1809F, -0.2547F, 0.0135F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.0291F, -0.7736F, -0.0887F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6702F, 0.6885F, 0.1373F, 0.3705F, -0.198F, -0.0486F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(85, 135).mirror().addBox(-0.8628F, -0.8196F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8707F, -1.8892F, 4.8437F, 1.294F, 0.0156F, -1.3172F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(135, 56).mirror().addBox(-0.8628F, -0.2446F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8707F, -1.8892F, 4.8437F, 1.2935F, -0.0599F, -1.2957F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(66, 135).mirror().addBox(-0.5F, -1.8617F, -1.5006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.8207F, -1.6142F, 5.1437F, 1.2013F, 0.1855F, -1.189F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(135, 68).mirror().addBox(-0.5F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7841F, -1.7845F, 4.0729F, 1.5068F, 0.1855F, -1.189F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(15, 143).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7841F, -1.7845F, 4.0729F, 0.8523F, 0.1855F, -1.189F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(76, 118).mirror().addBox(-0.7378F, 0.2891F, -2.8034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8707F, -1.8892F, 4.8437F, 1.5015F, -0.2695F, -1.2342F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(119, 124).mirror().addBox(-0.5F, 0.7742F, -1.5536F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8207F, -1.6142F, 5.1437F, -0.7709F, 0.1855F, -1.189F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(40, 118).mirror().addBox(-0.5677F, 0.0217F, -1.7514F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3871F, 0.2187F, 4.2394F, 1.8498F, 0.1892F, -2.5018F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(117, 90).mirror().addBox(-0.5677F, -0.914F, -1.9252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3871F, 0.2187F, 4.2394F, 1.0993F, 0.1892F, -2.5018F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(135, 90).mirror().addBox(-0.5677F, -0.4948F, -0.6707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3871F, 0.2187F, 4.2394F, 1.4833F, 0.1892F, -2.5018F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(130, 22).mirror().addBox(-0.365F, -0.5005F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1533F, -0.5696F, 4.2737F, 0.2793F, -0.0698F, 0.0F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(117, 85).mirror().addBox(-0.6F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.2182F, -0.0349F, 0.0F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(141, 110).mirror().addBox(-0.5251F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(140, 65).mirror().addBox(-0.6351F, -0.5026F, -0.4519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1533F, -0.5696F, 4.2737F, 0.2356F, -0.0698F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.2903F, -0.0346F, 0.4454F, 0.0126F, -0.0002F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(139, 48).mirror().addBox(0.0F, 0.025F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3114F, 0.2416F, -3.8978F, 0.4393F, -0.3121F, 0.0362F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(22, 139).mirror().addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6577F, 0.7015F, -2.8768F, 0.1819F, -0.3141F, 0.0079F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(142, 42).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.736F, 1.8296F, -6.0242F, -0.1312F, -0.0694F, 0.0073F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(85, 118).mirror().addBox(-0.5F, -0.9F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9332F, 1.4234F, -3.1464F, 0.2875F, -0.0685F, 0.0133F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(131, 62).mirror().addBox(-0.5F, -0.45F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(131, 62).addBox(1.9F, -0.45F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.5021F, -0.6497F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(16, 131).mirror().addBox(-0.5F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 131).addBox(1.9F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.4452F, -1.734F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(117, 130).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(117, 130).addBox(1.9F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.2548F, -0.834F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(98, 130).mirror().addBox(0.0317F, -0.0871F, -1.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.6433F, -4.1018F, 0.4285F, -0.0506F, -0.0512F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(38, 142).mirror().addBox(-0.2309F, 0.1077F, -0.7704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.2433F, -3.2018F, 0.16F, -0.3121F, 0.0362F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(142, 33).mirror().addBox(-0.2985F, -0.4744F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.496F, 0.7294F, -2.7247F, 0.256F, -0.3121F, 0.0362F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(142, 30).mirror().addBox(-0.5758F, -0.8061F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3433F, -2.2018F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(139, 48).addBox(0.0F, 0.025F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7114F, 0.2416F, -3.8978F, 0.4393F, 0.3121F, -0.0362F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(22, 139).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0577F, 0.7015F, -2.8768F, 0.1819F, 0.3141F, -0.0079F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(142, 42).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.136F, 1.8296F, -6.0242F, -0.1312F, 0.0694F, -0.0073F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(85, 118).addBox(-0.5F, -0.9F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3332F, 1.4234F, -3.1464F, 0.2875F, 0.0685F, -0.0133F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(98, 130).addBox(-1.0317F, -0.0871F, -1.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.6433F, -4.1018F, 0.4285F, 0.0506F, 0.0512F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(38, 142).addBox(-0.7691F, 0.1077F, -0.7704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.2433F, -3.2018F, 0.16F, 0.3121F, -0.0362F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(142, 33).addBox(-0.7015F, -0.4744F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.896F, 0.7294F, -2.7247F, 0.256F, 0.3121F, -0.0362F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(142, 30).addBox(-0.4242F, -0.8061F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.3433F, -2.2018F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(8.4694F, 1.8078F, -3.7899F));

		PartDefinition cube_r484 = bone6.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9694F, -3.4322F, -0.1799F, 0.0511F, -0.0113F, 0.2179F));

		PartDefinition cube_r485 = bone6.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0642F, -2.5676F, -0.1346F, 0.0442F, -0.0281F, 0.5666F));

		PartDefinition cube_r486 = bone6.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(59, 56).addBox(-0.4F, -0.35F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0091F, -0.0516F, 1.396F));

		PartDefinition bone14 = body.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3944F, -1.6922F, -3.8149F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r487 = bone14.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0306F, 0.0678F, -0.1799F, 0.0511F, 0.0113F, -0.2179F));

		PartDefinition cube_r488 = bone14.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-4.0F, 0.0F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9358F, 0.9324F, -0.1346F, 0.0442F, 0.0281F, -0.5666F));

		PartDefinition cube_r489 = bone14.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(59, 56).mirror().addBox(-1.6F, -0.35F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 3.5F, 0.0F, 0.0091F, 0.0516F, -1.396F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7F, 2.9001F, -0.9979F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(130, 15).addBox(0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 100).addBox(0.1F, 0.0F, 2.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 66).addBox(-0.4F, 0.0F, 4.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 80).addBox(0.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 15).mirror().addBox(-3.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 100).mirror().addBox(-3.1F, 0.0F, 2.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 66).mirror().addBox(-2.6F, 0.0F, 4.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 80).mirror().addBox(-2.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 143).addBox(0.0F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 59).addBox(0.0F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 143).addBox(0.0F, -1.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 143).addBox(0.0F, -1.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.324F, 0.0827F, -0.0278F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(143, 75).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 62).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 143).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(38, 65).addBox(-1.5F, -0.4F, -3.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone9 = tail.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(1.5F, -2.7033F, 3.914F));

		PartDefinition cube_r492 = bone9.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(119, 114).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8174F, 2.1121F, 0.3227F, 0.2222F, -0.283F, -0.2007F));

		PartDefinition cube_r493 = bone9.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(119, 95).addBox(0.175F, 0.0F, -6.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8491F, 0.9766F, 3.0503F, -0.0316F, -0.3566F, 0.5698F));

		PartDefinition cube_r494 = bone9.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(119, 57).addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8491F, 0.9766F, 3.0503F, -0.0296F, 0.0098F, 0.5585F));

		PartDefinition cube_r495 = bone9.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(121, 22).addBox(1.7F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(49, 119).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8975F, 0.7946F, -3.0296F, -0.03F, -0.156F, 0.5634F));

		PartDefinition cube_r496 = bone9.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(87, 72).addBox(-1.7616F, 0.3599F, -1.7838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7149F, 0.9866F, 0.8148F, 0.663F, 0.1554F, -1.4337F));

		PartDefinition cube_r497 = bone9.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(62, 87).addBox(-0.9116F, 0.5562F, -1.7838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7149F, 0.9866F, 0.8148F, 0.6532F, -0.1975F, -0.9871F));

		PartDefinition cube_r498 = bone9.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(106, 40).addBox(-0.9116F, -0.0463F, -1.1937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7149F, 0.9866F, 0.8148F, 0.4351F, -0.1975F, -0.9871F));

		PartDefinition cube_r499 = bone9.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, 0.0F, -0.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9487F, 0.4496F, -0.0157F, -0.0374F, -0.4282F, 0.2426F));

		PartDefinition cube_r500 = bone9.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(11, 110).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(86, 20).addBox(0.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.034F, 0.0079F, 0.2268F));

		PartDefinition bone16 = tail.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -2.6533F, 2.7905F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r501 = bone16.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(119, 114).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8174F, 2.1121F, 0.3227F, 0.2222F, 0.283F, 0.2007F));

		PartDefinition cube_r502 = bone16.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(119, 95).mirror().addBox(-1.175F, 0.0F, -6.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8491F, 0.9766F, 3.0503F, -0.0316F, 0.3566F, -0.5698F));

		PartDefinition cube_r503 = bone16.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(119, 57).mirror().addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8491F, 0.9766F, 3.0503F, -0.0296F, -0.0098F, -0.5585F));

		PartDefinition cube_r504 = bone16.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(121, 22).mirror().addBox(-2.7F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(49, 119).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8975F, 0.7946F, -3.0296F, -0.03F, 0.156F, -0.5634F));

		PartDefinition cube_r505 = bone16.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(87, 72).mirror().addBox(0.7616F, 0.31F, 0.2162F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 72).mirror().addBox(0.7616F, 0.36F, -1.7838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7149F, 0.9866F, 0.8148F, 0.663F, -0.1554F, 1.4337F));

		PartDefinition cube_r506 = bone16.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(62, 87).mirror().addBox(0.0116F, 0.5562F, 0.2162F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(62, 87).mirror().addBox(-0.0884F, 0.5562F, -1.7838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7149F, 0.9866F, 0.8148F, 0.6532F, 0.1975F, 0.9871F));

		PartDefinition cube_r507 = bone16.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(106, 40).mirror().addBox(-0.0884F, -0.0463F, -1.1937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7149F, 0.9866F, 0.8148F, 0.4351F, 0.1975F, 0.9871F));

		PartDefinition cube_r508 = bone16.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-2.0F, 0.075F, 1.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(90, 0).mirror().addBox(-2.0F, 0.0F, -0.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 0.4496F, -0.0157F, -0.0374F, 0.4282F, -0.2426F));

		PartDefinition cube_r509 = bone16.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(11, 110).mirror().addBox(-2.0F, 0.075F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 110).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 20).mirror().addBox(-4.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.034F, -0.0079F, -0.2268F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6647F, -1.4664F, 9.8728F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r510 = osteoderms12.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(119, 7).addBox(-0.616F, -2.5377F, -0.0572F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(2.9856F, 1.8596F, -1.3873F, -0.6901F, -0.0751F, 1.7279F));

		PartDefinition cube_r511 = osteoderms12.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(97, 138).addBox(-0.6453F, 0.7161F, 0.9828F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9856F, 1.8596F, -1.3873F, 1.3607F, -0.0751F, 1.7279F));

		PartDefinition cube_r512 = osteoderms12.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(135, 34).addBox(-0.8F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2784F, -1.1025F, -5.0484F, 3.1158F, -0.1426F, 0.1915F));

		PartDefinition cube_r513 = osteoderms12.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(135, 30).addBox(-0.7F, -1.0F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6728F, -0.9327F, -6.7693F, 2.9844F, -0.4051F, 0.3783F));

		PartDefinition cube_r514 = osteoderms12.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(21, 135).addBox(-0.4F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.981F, -0.194F, -4.3745F, 2.831F, -0.7067F, 0.7139F));

		PartDefinition cube_r515 = osteoderms12.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(119, 0).addBox(-0.6453F, -2.7208F, -0.3243F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9856F, 1.8596F, -1.3873F, 1.6661F, -0.0751F, 1.7279F));

		PartDefinition cube_r516 = osteoderms12.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.4F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6428F, 1.5372F, -1.8844F, 2.4341F, -0.0751F, 1.7279F));

		PartDefinition cube_r517 = osteoderms12.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(132, 17).addBox(-0.616F, 0.0555F, -1.5864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9856F, 1.8596F, -1.3873F, -0.149F, -0.0751F, 1.7279F));

		PartDefinition osteoderms17 = tail.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6647F, -1.4664F, 9.8728F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r518 = osteoderms17.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(119, 7).mirror().addBox(-0.384F, -2.5377F, -0.0572F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-2.9856F, 1.8596F, -1.3873F, -0.6901F, 0.0751F, -1.7279F));

		PartDefinition cube_r519 = osteoderms17.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(97, 138).mirror().addBox(-0.3547F, 0.7161F, 0.9828F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9856F, 1.8596F, -1.3873F, 1.3607F, 0.0751F, -1.7279F));

		PartDefinition cube_r520 = osteoderms17.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(135, 34).mirror().addBox(-0.2F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2784F, -1.1025F, -5.0484F, 3.1158F, 0.1426F, -0.1915F));

		PartDefinition cube_r521 = osteoderms17.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(135, 30).mirror().addBox(-0.3F, -1.0F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6728F, -0.9327F, -6.7693F, 2.9844F, 0.4051F, -0.3783F));

		PartDefinition cube_r522 = osteoderms17.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(21, 135).mirror().addBox(-0.6F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.981F, -0.194F, -4.3745F, 2.831F, 0.7067F, -0.7139F));

		PartDefinition cube_r523 = osteoderms17.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.3547F, -2.7208F, -0.3243F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9856F, 1.8596F, -1.3873F, 1.6661F, 0.0751F, -1.7279F));

		PartDefinition cube_r524 = osteoderms17.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.5F, -0.4F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6428F, 1.5372F, -1.8844F, 2.4341F, 0.0751F, -1.7279F));

		PartDefinition cube_r525 = osteoderms17.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(132, 17).mirror().addBox(-0.384F, 0.0555F, -1.5864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9856F, 1.8596F, -1.3873F, -0.149F, 0.0751F, -1.7279F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -2.4926F, 1.8291F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(66, 139).addBox(0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 76).addBox(0.5F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 100).addBox(0.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 36).addBox(-0.1F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 139).mirror().addBox(-2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 76).mirror().addBox(-1.5F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(139, 100).mirror().addBox(-1.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(142, 36).mirror().addBox(-0.9F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 143).addBox(0.0F, -1.0987F, 2.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 143).addBox(0.0F, -0.9987F, 4.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 129).addBox(0.0F, -0.9987F, 6.9774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0467F, 0.0814F, 0.1419F));

		PartDefinition cube_r526 = tail2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(122, 143).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 102).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 46).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 143).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(94, 143).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(25, 26).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone8 = tail2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(2.3846F, -2.5586F, -0.0591F));

		PartDefinition cube_r529 = bone8.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(21, 46).addBox(-1.1172F, -2.2617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9544F, -0.1926F, -1.1262F));

		PartDefinition bone17 = tail2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(-2.3846F, -2.5586F, -0.0591F));

		PartDefinition cube_r530 = bone17.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(0.1172F, -2.2617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9544F, 0.1926F, 1.1262F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r531 = osteoderms8.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(142, 68).addBox(-0.3212F, 4.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(142, 56).addBox(-0.3212F, 2.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(142, 45).addBox(-0.3212F, 0.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 142).addBox(-0.3212F, -1.9245F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3156F, 2.975F, 0.1482F, 1.8361F, -0.1358F, 0.407F));

		PartDefinition cube_r532 = osteoderms8.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(37, 132).addBox(-0.4769F, 0.4299F, -1.8845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.335F, 4.1655F, 4.2245F, 0.2016F, -0.3796F, 1.6966F));

		PartDefinition cube_r533 = osteoderms8.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(121, 27).addBox(-0.5062F, -3.1006F, -0.6154F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.335F, 4.1655F, 4.2245F, 2.0167F, -0.3796F, 1.6966F));

		PartDefinition cube_r534 = osteoderms8.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(9, 115).addBox(-0.4769F, -2.0633F, -0.1198F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(5.335F, 4.1655F, 4.2245F, -0.3395F, -0.3796F, 1.6966F));

		PartDefinition cube_r535 = osteoderms8.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(142, 0).addBox(-0.5062F, 0.4414F, 0.5909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.335F, 4.1655F, 4.2245F, 1.7113F, -0.3796F, 1.6966F));

		PartDefinition cube_r536 = osteoderms8.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(84, 33).addBox(-0.5062F, -2.3975F, -1.378F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.335F, 4.1655F, 4.2245F, 3.0465F, -0.3796F, 1.6966F));

		PartDefinition osteoderms18 = tail2.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r537 = osteoderms18.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(142, 68).mirror().addBox(-0.6788F, 4.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(142, 56).mirror().addBox(-0.6788F, 2.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(142, 45).mirror().addBox(-0.6788F, 0.0755F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(43, 142).mirror().addBox(-0.6788F, -1.9245F, -0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3156F, 2.975F, 0.1482F, 1.8361F, 0.1358F, -0.407F));

		PartDefinition cube_r538 = osteoderms18.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(37, 132).mirror().addBox(-0.5231F, 0.4299F, -1.8845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.335F, 4.1655F, 4.2245F, 0.2016F, 0.3796F, -1.6966F));

		PartDefinition cube_r539 = osteoderms18.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(121, 27).mirror().addBox(-0.4938F, -3.1006F, -0.6154F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.335F, 4.1655F, 4.2245F, 2.0167F, 0.3796F, -1.6966F));

		PartDefinition cube_r540 = osteoderms18.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(9, 115).mirror().addBox(-0.5231F, -2.0633F, -0.1198F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-5.335F, 4.1655F, 4.2245F, -0.3395F, 0.3796F, -1.6966F));

		PartDefinition cube_r541 = osteoderms18.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(142, 0).mirror().addBox(-0.4938F, 0.4414F, 0.5909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.335F, 4.1655F, 4.2245F, 1.7113F, 0.3796F, -1.6966F));

		PartDefinition cube_r542 = osteoderms18.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-0.4938F, -2.3975F, -1.378F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.335F, 4.1655F, 4.2245F, 3.0465F, 0.3796F, -1.6966F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(91, 103).addBox(0.0F, -0.8998F, 0.9913F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 143).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 138).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.167F, 0.3446F, 0.0569F));

		PartDefinition cube_r543 = tail3.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(143, 135).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 143).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 132).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 143).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail3.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r545 = osteoderms9.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(142, 93).addBox(0.8788F, 11.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(142, 90).addBox(0.8788F, 9.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 142).addBox(0.8788F, 7.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 87).addBox(0.8788F, 5.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.3156F, 2.8331F, -8.1845F, 1.8361F, -0.1358F, 0.407F));

		PartDefinition cube_r546 = osteoderms9.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(91, 112).addBox(-0.6654F, -2.2224F, -0.3107F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.2165F, 3.6516F, 5.1701F, 3.1215F, -0.4662F, 1.7016F));

		PartDefinition cube_r547 = osteoderms9.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(56, 132).addBox(-0.6654F, -2.2389F, -0.6495F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.2165F, 3.6516F, 5.1701F, -0.9189F, -0.4662F, 1.7016F));

		PartDefinition cube_r548 = osteoderms9.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(77, 123).addBox(-0.6654F, -2.0277F, -1.354F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.2165F, 3.6516F, 5.1701F, 2.7026F, -0.4662F, 1.7016F));

		PartDefinition cube_r549 = osteoderms9.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(72, 123).addBox(-0.6654F, -2.2596F, 0.4843F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2165F, 3.6516F, 5.1701F, 2.2227F, -0.4662F, 1.7016F));

		PartDefinition cube_r550 = osteoderms9.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(132, 48).addBox(-0.4769F, 0.4299F, -1.8845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.235F, 5.0235F, 1.3917F, 0.2016F, -0.3796F, 1.6966F));

		PartDefinition cube_r551 = osteoderms9.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(105, 130).addBox(-0.5062F, -3.3506F, 0.1846F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.235F, 5.0235F, 1.3917F, 1.8858F, -0.3796F, 1.6966F));

		PartDefinition cube_r552 = osteoderms9.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(25, 122).addBox(-0.4769F, -1.0633F, -0.6448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(6.235F, 5.0235F, 1.3917F, -0.3395F, -0.3796F, 1.6966F));

		PartDefinition cube_r553 = osteoderms9.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(133, 139).addBox(-0.5062F, 0.4414F, 0.2909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.235F, 5.0235F, 1.3917F, 1.7113F, -0.3796F, 1.6966F));

		PartDefinition cube_r554 = osteoderms9.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(67, 97).addBox(-0.5062F, -1.9975F, -0.378F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.235F, 5.0235F, 1.3917F, 3.1338F, -0.3796F, 1.6966F));

		PartDefinition osteoderms19 = tail3.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r555 = osteoderms19.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(142, 93).mirror().addBox(-1.8788F, 11.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(142, 90).mirror().addBox(-1.8788F, 9.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 142).mirror().addBox(-1.8788F, 7.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(43, 87).mirror().addBox(-1.8788F, 5.8755F, -3.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.3156F, 2.8331F, -8.1845F, 1.8361F, 0.1358F, -0.407F));

		PartDefinition cube_r556 = osteoderms19.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(91, 112).mirror().addBox(-0.3346F, -2.2224F, -0.3107F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.2165F, 3.6516F, 5.1701F, 3.1215F, 0.4662F, -1.7016F));

		PartDefinition cube_r557 = osteoderms19.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(56, 132).mirror().addBox(-0.3346F, -2.2389F, -0.6495F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.2165F, 3.6516F, 5.1701F, -0.9189F, 0.4662F, -1.7016F));

		PartDefinition cube_r558 = osteoderms19.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(77, 123).mirror().addBox(-0.3346F, -2.0277F, -1.354F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2165F, 3.6516F, 5.1701F, 2.7026F, 0.4662F, -1.7016F));

		PartDefinition cube_r559 = osteoderms19.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(72, 123).mirror().addBox(-0.3346F, -2.2596F, 0.4843F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2165F, 3.6516F, 5.1701F, 2.2227F, 0.4662F, -1.7016F));

		PartDefinition cube_r560 = osteoderms19.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(132, 48).mirror().addBox(-0.5231F, 0.4299F, -1.8845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 5.0235F, 1.3917F, 0.2016F, 0.3796F, -1.6966F));

		PartDefinition cube_r561 = osteoderms19.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(105, 130).mirror().addBox(-0.4938F, -3.3506F, 0.1846F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 5.0235F, 1.3917F, 1.8858F, 0.3796F, -1.6966F));

		PartDefinition cube_r562 = osteoderms19.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(25, 122).mirror().addBox(-0.5231F, -1.0633F, -0.6448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 5.0235F, 1.3917F, -0.3395F, 0.3796F, -1.6966F));

		PartDefinition cube_r563 = osteoderms19.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(133, 139).mirror().addBox(-0.4938F, 0.4414F, 0.2909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 5.0235F, 1.3917F, 1.7113F, 0.3796F, -1.6966F));

		PartDefinition cube_r564 = osteoderms19.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.4938F, -1.9975F, -0.378F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 5.0235F, 1.3917F, 3.1338F, 0.3796F, -1.6966F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.4048F, 0.216F, 0.0308F));

		PartDefinition cube_r565 = tail4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(40, 46).addBox(-1.0F, -0.15F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(0, 144).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 141).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 143).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r567 = osteoderms10.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(119, 34).addBox(-0.4896F, -1.7141F, -7.4617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.135F, 1.2544F, 0.5023F, 3.1338F, -0.3796F, 1.6966F));

		PartDefinition cube_r568 = osteoderms10.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(0, 140).addBox(-0.4896F, 7.0304F, -0.9126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.135F, 1.2544F, 0.5023F, 1.7113F, -0.3796F, 1.6966F));

		PartDefinition cube_r569 = osteoderms10.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(96, 123).addBox(-0.7978F, -1.6649F, -0.9905F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(4.8718F, -1.5168F, 8.2212F, -0.034F, -0.3796F, 1.6966F));

		PartDefinition cube_r570 = osteoderms10.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(56, 138).addBox(-0.7978F, -0.0141F, -1.0335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.6579F, -0.2045F, 4.8117F, 2.2F, -0.3796F, 1.6966F));

		PartDefinition cube_r571 = osteoderms10.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(57, 127).addBox(-0.7978F, -1.5402F, -1.7896F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2964F, -1.3972F, 7.7429F, -0.0602F, -0.3796F, 1.6966F));

		PartDefinition cube_r572 = osteoderms10.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(82, 123).addBox(0.9889F, -1.7499F, -1.1505F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.3964F, -1.3972F, 2.9429F, 0.507F, -0.3796F, 1.6966F));

		PartDefinition cube_r573 = osteoderms10.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(61, 132).addBox(0.9889F, 0.0495F, -0.8251F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.7579F, -0.2045F, 0.0117F, 2.0778F, -0.3796F, 1.6966F));

		PartDefinition cube_r574 = osteoderms10.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(89, 123).addBox(1.3265F, -3.7011F, 6.5139F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(6.235F, 1.2544F, -4.2977F, -0.3395F, -0.3796F, 1.6966F));

		PartDefinition cube_r575 = osteoderms10.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(138, 139).addBox(1.2971F, 8.0106F, -0.6954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.235F, 1.2544F, -4.2977F, 1.7113F, -0.3796F, 1.6966F));

		PartDefinition cube_r576 = osteoderms10.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(100, 112).addBox(1.2971F, -2.5022F, -7.41F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.235F, 1.2544F, -4.2977F, 3.1338F, -0.3796F, 1.6966F));

		PartDefinition osteoderms20 = tail4.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r577 = osteoderms20.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(119, 34).mirror().addBox(-0.5104F, -1.7141F, -7.4617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.135F, 1.2544F, 0.5023F, 3.1338F, 0.3796F, -1.6966F));

		PartDefinition cube_r578 = osteoderms20.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.5104F, 7.0304F, -0.9126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.135F, 1.2544F, 0.5023F, 1.7113F, 0.3796F, -1.6966F));

		PartDefinition cube_r579 = osteoderms20.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(96, 123).mirror().addBox(-0.2022F, -1.6649F, -0.9905F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-4.8718F, -1.5168F, 8.2212F, -0.034F, 0.3796F, -1.6966F));

		PartDefinition cube_r580 = osteoderms20.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(56, 138).mirror().addBox(-0.2022F, -0.0141F, -1.0335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.6579F, -0.2045F, 4.8117F, 2.2F, 0.3796F, -1.6966F));

		PartDefinition cube_r581 = osteoderms20.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(57, 127).mirror().addBox(-0.2022F, -1.5402F, -1.7896F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2964F, -1.3972F, 7.7429F, -0.0602F, 0.3796F, -1.6966F));

		PartDefinition cube_r582 = osteoderms20.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(82, 123).mirror().addBox(-1.989F, -1.7499F, -1.1505F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.3964F, -1.3972F, 2.9429F, 0.507F, 0.3796F, -1.6966F));

		PartDefinition cube_r583 = osteoderms20.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(61, 132).mirror().addBox(-1.9889F, 0.0495F, -0.8251F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.7579F, -0.2045F, 0.0117F, 2.0778F, 0.3796F, -1.6966F));

		PartDefinition cube_r584 = osteoderms20.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(89, 123).mirror().addBox(-2.3265F, -3.7011F, 6.5139F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 1.2544F, -4.2977F, -0.3395F, 0.3796F, -1.6966F));

		PartDefinition cube_r585 = osteoderms20.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(138, 139).mirror().addBox(-2.2971F, 8.0106F, -0.6954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 1.2544F, -4.2977F, 1.7113F, 0.3796F, -1.6966F));

		PartDefinition cube_r586 = osteoderms20.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(100, 112).mirror().addBox(-2.2971F, -2.5022F, -7.41F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.235F, 1.2544F, -4.2977F, 3.1338F, 0.3796F, -1.6966F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5157F, -0.1994F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.016F, 6.9899F, 0.0737F, 0.2592F, -0.0373F));

		PartDefinition cube_r587 = tail5.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.9498F, 0.8311F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.2996F, 0.7751F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition cube_r588 = osteoderms11.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(107, 141).addBox(1.8416F, -1.1687F, 4.1464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(141, 106).addBox(2.2947F, -1.5008F, 0.7368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2048F, -4.3733F, 2.7872F, -0.1067F, -0.3738F, 1.7137F));

		PartDefinition cube_r589 = osteoderms11.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(142, 117).addBox(1.7905F, 3.45F, -1.2166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 138).addBox(2.2076F, -0.7998F, -0.0268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2048F, -4.3733F, 2.7872F, 1.7172F, -0.3738F, 1.7137F));

		PartDefinition cube_r590 = osteoderms11.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(142, 126).addBox(1.7905F, -0.5821F, -4.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(110, 132).addBox(2.2076F, -0.2635F, -0.9536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2048F, -4.3733F, 2.7872F, 3.0873F, -0.3738F, 1.7137F));

		PartDefinition osteoderms21 = tail5.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.2996F, 0.7751F, -0.5062F, -0.0153F, 0.0085F));

		PartDefinition cube_r591 = osteoderms21.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(107, 141).mirror().addBox(-2.8416F, -1.1687F, 4.1464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(141, 106).mirror().addBox(-3.2947F, -1.5008F, 0.7368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2048F, -4.3733F, 2.7872F, -0.1067F, 0.3738F, -1.7137F));

		PartDefinition cube_r592 = osteoderms21.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(142, 117).mirror().addBox(-2.7905F, 3.45F, -1.2166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 138).mirror().addBox(-3.2076F, -0.7998F, -0.0268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2048F, -4.3733F, 2.7872F, 1.7172F, 0.3738F, -1.7137F));

		PartDefinition cube_r593 = osteoderms21.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(142, 126).mirror().addBox(-2.7905F, -0.5821F, -4.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(110, 132).mirror().addBox(-3.2076F, -0.2635F, -0.9536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2048F, -4.3733F, 2.7872F, 3.0873F, 0.3738F, -1.7137F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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