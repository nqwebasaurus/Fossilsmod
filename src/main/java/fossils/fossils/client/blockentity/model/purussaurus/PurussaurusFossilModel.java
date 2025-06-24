package fossils.fossils.client.blockentity.model.purussaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PurussaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart eye4;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail8;
	private final ModelPart tail7;

	public PurussaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone2 = this.body3.getChild("bone2");
		this.bone3 = this.body3.getChild("bone3");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.eye4 = this.head.getChild("eye4");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail8 = this.tail6.getChild("tail8");
		this.tail7 = this.tail8.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 4.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -14.2131F, 17.5269F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-4.0F, 0.05F, -0.4F, 5.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.6317F, -4.6939F, -0.1332F, -0.0419F, -0.3026F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-0.5F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(144, 127).addBox(2.5F, -2.1176F, 2.7432F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 142).addBox(2.5F, -2.2176F, -0.2568F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 62).addBox(3.5F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(33, 47).addBox(1.5F, -0.5176F, -0.2568F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -4.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.05F, -0.4F, 5.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.6317F, -4.6939F, -0.1332F, 0.0419F, 0.3026F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(115, 142).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6652F, 4.9014F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 142).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0097F, 1.9196F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.5F, -0.9F, -8.2F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(136, 39).addBox(0.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.4186F, 12.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(115, 147).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 3.2329F, 5.2784F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(116, 126).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 2.2912F, 5.336F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(146, 33).addBox(0.0F, 0.0639F, -0.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 1.76F, 6.8205F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 129).addBox(0.0F, -0.3361F, -0.0007F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.4F, -0.0888F, 6.4441F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(132, 13).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -0.9879F, 8.6694F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(115, 118).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -0.7096F, 10.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 146).addBox(-1.0778F, -2.4958F, 4.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -2.4906F, 0.1017F, 0.5075F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(151, 45).addBox(-1.0778F, -2.9794F, 4.7318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -2.796F, 0.1017F, 0.5075F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(148, 86).addBox(-1.0691F, -0.593F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -1.0592F, 0.0958F, 0.5177F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(54, 151).addBox(-1.0691F, -0.1799F, -1.1108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -0.2302F, 0.0958F, 0.5177F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 147).addBox(-1.0696F, 1.0976F, -0.7922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -0.623F, 0.0989F, 0.5127F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(148, 119).addBox(-1.0778F, 3.1127F, -0.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -0.754F, 0.1017F, 0.5075F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 113).addBox(-1.0778F, 3.0458F, -1.0524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -0.5358F, 0.1017F, 0.5075F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(31, 146).addBox(-1.0778F, 3.5396F, 1.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -1.2776F, 0.1017F, 0.5075F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(147, 110).addBox(-1.0778F, -0.1514F, 5.1622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, 6.4998F, -2.0194F, 0.1017F, 0.5075F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(137, 51).addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9F, 1.9051F, 11.2204F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(137, 47).addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 2.1044F, 10.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 111).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9F, 3.9086F, 9.9305F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(140, 99).addBox(-0.825F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.9F, 3.8886F, 6.1227F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 148).addBox(-1.0F, 2.2813F, 0.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(147, 145).addBox(-1.0F, 2.2813F, 1.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, -0.2793F, 0.0F, 0.48F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(136, 147).addBox(-1.0F, 2.746F, 1.6276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, -0.0611F, 0.0F, 0.48F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(148, 90).addBox(-1.0F, 3.3247F, -1.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, 0.637F, 0.0F, 0.48F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(149, 59).addBox(-1.0F, 2.7056F, -2.4922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, 1.117F, 0.0F, 0.48F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(132, 26).addBox(-1.0F, 1.7174F, -2.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, 0.7243F, 0.0F, 0.48F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(125, 147).addBox(-1.0F, -0.0111F, -0.1408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(120, 147).addBox(-1.0F, -0.6111F, -0.5408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, 0.1571F, 0.0F, 0.48F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(120, 142).addBox(-1.0F, 1.2228F, -0.197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, 8.2757F, -0.1047F, 0.0F, 0.48F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 118).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 4.0441F, 8.2359F, -0.4102F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.9F, -8.2F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(136, 39).mirror().addBox(-1.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4186F, 12.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(115, 147).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.2329F, 5.2784F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(116, 126).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.2912F, 5.336F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(146, 33).mirror().addBox(-1.0F, 0.0639F, -0.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.76F, 6.8205F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(68, 129).mirror().addBox(-1.0F, -0.3361F, -0.0007F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0888F, 6.4441F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(132, 13).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9879F, 8.6694F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(115, 118).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7096F, 10.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(95, 146).mirror().addBox(0.0778F, -2.4958F, 4.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -2.4906F, -0.1017F, -0.5075F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(151, 45).mirror().addBox(0.0778F, -2.9794F, 4.7318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -2.796F, -0.1017F, -0.5075F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(148, 86).mirror().addBox(0.0691F, -0.593F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -1.0592F, -0.0958F, -0.5177F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 151).mirror().addBox(0.0691F, -0.1799F, -1.1108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -0.2302F, -0.0958F, -0.5177F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 147).mirror().addBox(0.0696F, 1.0976F, -0.7922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -0.623F, -0.0989F, -0.5127F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(148, 119).mirror().addBox(0.0778F, 3.1127F, -0.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -0.754F, -0.1017F, -0.5075F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 113).mirror().addBox(0.0778F, 3.0458F, -1.0524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -0.5358F, -0.1017F, -0.5075F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 146).mirror().addBox(0.0778F, 3.5396F, 1.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -1.2776F, -0.1017F, -0.5075F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(147, 110).mirror().addBox(0.0778F, -0.1514F, 5.1622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, 6.4998F, -2.0194F, -0.1017F, -0.5075F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(137, 51).mirror().addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.9051F, 11.2204F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(137, 47).mirror().addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.1044F, 10.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 111).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.9086F, 9.9305F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(140, 99).mirror().addBox(-0.175F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.8886F, 6.1227F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 148).mirror().addBox(0.0F, 2.2813F, 0.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(147, 145).mirror().addBox(0.0F, 2.2813F, 1.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, -0.2793F, 0.0F, -0.48F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(136, 147).mirror().addBox(0.0F, 2.746F, 1.6276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, -0.0611F, 0.0F, -0.48F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(148, 90).mirror().addBox(0.0F, 3.3247F, -1.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, 0.637F, 0.0F, -0.48F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(149, 59).mirror().addBox(0.0F, 2.7056F, -2.4922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, 1.117F, 0.0F, -0.48F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(132, 26).mirror().addBox(0.0F, 1.7174F, -2.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, 0.7243F, 0.0F, -0.48F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(125, 147).mirror().addBox(0.0F, -0.0111F, -0.1408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(120, 147).mirror().addBox(0.0F, -0.6111F, -0.5408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, 0.1571F, 0.0F, -0.48F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(120, 142).mirror().addBox(0.0F, 1.2228F, -0.197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, 8.2757F, -0.1047F, 0.0F, -0.48F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 118).mirror().addBox(-0.5F, -0.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.0441F, 8.2359F, -0.4102F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 2.3944F, 0.4149F, 0.6794F, -0.4267F, -0.5958F));

		PartDefinition cube_r62 = backleftleg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(135, 103).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, -1.037F, 0.0506F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r63 = backleftleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 147).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r64 = backleftleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(146, 55).addBox(-0.5F, 1.4F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r65 = backleftleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(146, 9).addBox(-0.5F, -0.975F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0169F, 5.6207F, 0.9797F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r66 = backleftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(146, 0).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 5.6207F, 0.9797F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r67 = backleftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(41, 149).addBox(-0.5F, -6.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = backleftleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(148, 132).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(101, 135).addBox(-0.5189F, -0.2398F, -0.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2588F, 6.5719F, 1.2737F, 1.2864F, 0.8065F, 0.3019F));

		PartDefinition cube_r69 = backleftleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(27, 48).addBox(-0.7F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.721F, 4.6953F, -0.119F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r70 = backleftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(125, 142).addBox(-0.65F, -2.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0189F, 5.3602F, -0.1193F, 0.0F, 0.0F, 0.0873F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create().texOffs(115, 91).addBox(-1.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0259F, 6.2348F, -0.1452F, 1.2583F, -0.0241F, 0.261F));

		PartDefinition cube_r71 = backleftleg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(110, 0).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3685F, 0.6135F, -0.0664F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r72 = backleftleg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(114, 7).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1685F, 0.6135F, -3.1841F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r73 = backleftleg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(110, 35).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 0.6135F, -3.1058F, 0.0F, -0.1309F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r74 = backleftleg4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(123, 27).addBox(0.1F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1F, 0.5F, -1.3F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r75 = backleftleg4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(123, 37).addBox(-0.3484F, -0.5F, -2.9619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8502F, 0.5F, 1.1844F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r76 = backleftleg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 111).addBox(-0.9471F, -0.5F, -3.4908F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1932F, 0.5F, -0.6956F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r77 = backleftleg4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(73, 104).addBox(0.0529F, -0.5F, -5.0908F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.02F, 0.5F, 0.0854F, 0.0F, -0.3927F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 2.3944F, 0.4149F, 0.5832F, 0.2246F, 0.8381F));

		PartDefinition cube_r78 = backrightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(7, 136).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, -1.037F, 0.0506F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r79 = backrightleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 147).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backrightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(66, 146).addBox(-0.5F, 1.4F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r81 = backrightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(146, 17).addBox(-0.5F, -0.975F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0169F, 5.6207F, 0.9797F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backrightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(146, 13).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 5.6207F, 0.9797F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backrightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(149, 50).addBox(-0.5F, -6.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backrightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 149).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(106, 135).addBox(-0.4811F, -0.2398F, -0.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2588F, 6.5719F, 1.2737F, 0.9855F, -0.4721F, -0.2659F));

		PartDefinition cube_r85 = backrightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(27, 121).addBox(-0.3F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.721F, 4.6953F, -0.119F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r86 = backrightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(137, 142).addBox(-0.35F, -2.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0189F, 5.3602F, -0.1193F, 0.0F, 0.0F, -0.0873F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(115, 97).addBox(0.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0259F, 6.2348F, -0.1452F, 1.4581F, -0.5371F, 0.2957F));

		PartDefinition cube_r87 = backrightleg3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(110, 28).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3685F, 0.6135F, -0.0664F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r88 = backrightleg3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(114, 19).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1685F, 0.6135F, -3.1841F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r89 = backrightleg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 110).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5628F, 0.6135F, -3.1058F, 0.0F, 0.1309F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r90 = backrightleg4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(123, 32).addBox(-1.1F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1F, 0.5F, -1.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r91 = backrightleg4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(62, 123).addBox(-0.6516F, -0.5F, -2.9619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.8502F, 0.5F, 1.1844F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r92 = backrightleg4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 111).addBox(-0.0529F, -0.5F, -3.4908F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1932F, 0.5F, -0.6956F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r93 = backrightleg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0529F, -0.5F, -5.0908F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.02F, 0.5F, 0.0854F, 0.0F, 0.3927F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.85F, -4.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-5.0F, 0.0F, -0.3F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.4296F, -9.9703F, -0.0666F, -0.021F, -0.3047F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(41, 147).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.6F, 0.8156F, 0.099F, -0.0984F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(136, 10).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.6F, 0.7336F, 0.407F, -0.4194F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 124).mirror().addBox(-4.3036F, -3.6003F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.6F, 0.3473F, 0.7592F, -1.0924F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(146, 72).mirror().addBox(-5.3036F, -3.6003F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.05F, -8.5F, 0.2566F, 0.5704F, -1.1202F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(133, 115).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.05F, -8.5F, 0.5492F, 0.3029F, -0.4554F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(146, 4).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.05F, -8.5F, 0.6171F, 0.0599F, -0.0859F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(37, 16).addBox(-1.0F, 0.0F, -0.3F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.4296F, -9.9703F, -0.0666F, 0.021F, 0.3047F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 147).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.6F, 0.8156F, -0.099F, 0.0984F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(136, 10).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.6F, 0.7336F, -0.407F, 0.4194F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(80, 124).addBox(3.3036F, -3.6003F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.6F, 0.3473F, -0.7592F, 1.0924F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(146, 72).addBox(3.3036F, -3.6003F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.05F, -8.5F, 0.2566F, -0.5704F, 1.1202F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(133, 115).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.05F, -8.5F, 0.5492F, -0.3029F, 0.4554F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(146, 4).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.05F, -8.5F, 0.6171F, -0.0599F, 0.0859F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 141).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5342F, -1.9543F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(142, 78).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7126F, -4.9506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(141, 61).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0911F, -7.9418F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 15).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -0.4F, -14.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.65F, -10.0F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.0F, 0.0F, 0.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.4282F, -14.0354F, 0.025F, 0.0079F, -0.3053F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(-12.5879F, 1.6778F, -0.1829F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 12.977F, -11.3794F, 0.3673F, 0.5652F, 0.8417F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(35, 117).mirror().addBox(-4.8726F, 0.3482F, -0.1829F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 12.977F, -11.3794F, 0.1805F, 0.6416F, 0.5148F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-11.9491F, 1.3396F, -0.4579F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 12.977F, -13.3794F, 0.381F, 0.5783F, 0.727F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(115, 108).mirror().addBox(-4.1653F, 0.1991F, -0.4579F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 12.977F, -13.3794F, 0.189F, 0.6577F, 0.3978F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(147, 99).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -12.5F, 0.4358F, 0.019F, -0.0299F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(137, 57).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -12.5F, 0.3919F, 0.1968F, -0.4312F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(109, 83).mirror().addBox(-10.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -12.5F, 0.194F, 0.3932F, -1.0862F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(147, 125).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.4523F, 0.0382F, -0.0785F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(138, 70).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.3997F, 0.221F, -0.4787F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(125, 24).mirror().addBox(-7.3036F, -3.6003F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.1845F, 0.417F, -1.139F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(145, 123).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.4357F, 0.0235F, -0.0469F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 136).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.3899F, 0.201F, -0.4486F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 119).mirror().addBox(-8.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.1897F, 0.3953F, -1.1048F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(148, 117).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.4972F, 0.0121F, -0.0134F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(138, 125).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.4523F, 0.2142F, -0.4034F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(111, 73).mirror().addBox(-9.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.2339F, 0.4429F, -1.0544F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(-10.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.2119F, 0.4241F, -1.0791F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(41, 136).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.4243F, 0.2113F, -0.4247F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(48, 147).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.4707F, 0.02F, -0.0292F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.4282F, -14.0354F, 0.025F, -0.0079F, 0.3053F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(147, 125).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.4523F, -0.0382F, 0.0785F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(138, 70).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.3997F, -0.221F, 0.4787F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(125, 24).addBox(3.3036F, -3.6003F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.1845F, -0.417F, 1.139F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(145, 123).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.4357F, -0.0235F, 0.0469F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(50, 136).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.3899F, -0.201F, 0.4486F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(9, 119).addBox(3.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.1897F, -0.3953F, 1.1048F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(148, 117).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.4972F, -0.0121F, 0.0134F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(138, 125).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.4523F, -0.2142F, 0.4034F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(111, 73).addBox(3.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.2339F, -0.4429F, 1.0544F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(109, 83).addBox(3.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -12.5F, 0.194F, -0.3932F, 1.0862F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(137, 57).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -12.5F, 0.3919F, -0.1968F, 0.4312F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(147, 99).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -12.5F, 0.4358F, -0.019F, 0.0299F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(97, 11).addBox(3.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.2119F, -0.4241F, 1.0791F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(41, 136).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.4243F, -0.2113F, 0.4247F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 147).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.4707F, -0.02F, 0.0292F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(135, 97).addBox(0.0F, -2.3546F, 9.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 91).addBox(0.0F, -2.3546F, 6.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 135).addBox(0.0F, -2.3546F, 3.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(140, 87).addBox(0.0F, -1.9546F, -2.9679F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 138).addBox(0.0F, -2.2296F, 0.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3282F, -11.0075F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(35, 117).addBox(-0.1274F, 0.3482F, -0.1829F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 12.977F, -11.3794F, 0.1805F, -0.6416F, -0.5148F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(37, 28).addBox(4.5879F, 1.6778F, -0.1829F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 12.977F, -11.3794F, 0.3673F, -0.5652F, -0.8417F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(115, 108).addBox(-0.8347F, 0.1991F, -0.4579F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 12.977F, -13.3794F, 0.189F, -0.6577F, -0.3978F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 13).addBox(3.9491F, 1.3396F, -0.4579F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 12.977F, -13.3794F, 0.381F, -0.5783F, -0.727F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -14.0F, 0.1376F, -0.0444F, -0.0161F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-4.0F, 0.0F, -3.6F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.24F, -9.0207F, 0.175F, 0.0548F, -0.3006F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(59, 92).mirror().addBox(-4.0784F, -0.1534F, -0.3757F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 11.427F, -9.4794F, 0.205F, 0.1365F, 0.811F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-6.9627F, 0.9767F, -0.3757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 11.427F, -9.4794F, 0.2341F, 0.0752F, 1.085F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(102, 110).mirror().addBox(-10.4505F, 1.3713F, -0.4162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.727F, -1.4794F, 0.3929F, 0.4307F, 0.7033F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(22, 117).mirror().addBox(-4.6561F, 0.0915F, -0.4162F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.727F, -1.4794F, 0.2556F, 0.5204F, 0.4054F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(125, 11).mirror().addBox(-8.7767F, 1.1406F, -0.8256F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.127F, -7.1794F, 0.2621F, 0.2113F, 0.8767F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(117, 110).mirror().addBox(-4.906F, -0.2202F, -0.8256F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.127F, -7.1794F, 0.1942F, 0.2749F, 0.5964F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(13, 111).mirror().addBox(-10.4294F, 1.1678F, -0.2431F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.427F, -3.5794F, 0.339F, 0.3813F, 0.7297F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(112, 25).mirror().addBox(-4.5797F, -0.0984F, -0.2431F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.427F, -3.5794F, 0.2183F, 0.4587F, 0.4356F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(147, 80).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.5045F, 0.0423F, -0.0764F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(125, 42).mirror().addBox(-7.3036F, -3.6003F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.209F, 0.4644F, -1.1285F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(137, 55).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.4476F, 0.2448F, -0.4676F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-5.8F, -0.8F, -3.7F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.95F, -5.0F, 0.0499F, 0.0157F, -0.305F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(71, 147).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.4175F, 0.0355F, -0.0798F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(81, 136).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.368F, 0.2048F, -0.4854F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(22, 119).mirror().addBox(-8.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.1688F, 0.3852F, -1.1451F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(143, 41).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.392F, 0.022F, -0.0295F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(131, 89).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.3496F, 0.1824F, -0.4379F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(110, 42).mirror().addBox(-9.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.1681F, 0.3564F, -1.0944F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(108, 65).mirror().addBox(-10.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.1707F, 0.3454F, -1.0773F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 117).mirror().addBox(-4.9499F, -0.0081F, -0.5613F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.127F, -5.4794F, 0.2678F, 0.396F, 0.5335F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(102, 118).mirror().addBox(-9.7604F, 1.3566F, -0.5613F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.127F, -5.4794F, 0.366F, 0.3084F, 0.8162F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(72, 136).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.3447F, 0.1722F, -0.4226F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(147, 70).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.3835F, 0.0146F, -0.0135F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 54).addBox(-1.0F, 0.0F, -3.6F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.24F, -9.0207F, 0.175F, -0.0548F, 0.3006F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(27, 62).addBox(-0.2F, -0.8F, -3.7F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.95F, -5.0F, 0.0499F, -0.0157F, 0.305F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(94, 68).addBox(-1.0F, 0.5684F, 0.0285F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.6663F, -3.3434F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(19, 96).addBox(-1.0F, -0.9316F, -4.9714F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.1658F, -3.3827F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(85, 61).addBox(-3.0F, -0.882F, -1.8686F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.4414F, -10.5231F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(33, 31).addBox(-2.0F, 0.0F, -4.1F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(140, 93).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3551F, -2.9705F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(33, 135).addBox(-1.0F, -2.1F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2023F, -6.0071F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(105, 141).addBox(-1.0F, -2.0F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2093F, -11.8927F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(95, 141).addBox(-1.0F, -2.0F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(137, 55).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.4476F, -0.2448F, 0.4676F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(125, 42).addBox(3.3036F, -3.6003F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.209F, -0.4644F, 1.1285F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(147, 80).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.5045F, -0.0423F, 0.0764F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(71, 147).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.4175F, -0.0355F, 0.0798F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(81, 136).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.368F, -0.2048F, 0.4854F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(22, 119).addBox(3.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.1688F, -0.3852F, 1.1451F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(143, 41).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.392F, -0.022F, 0.0295F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(131, 89).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.3496F, -0.1824F, 0.4379F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(110, 42).addBox(3.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.1681F, -0.3564F, 1.0944F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(108, 65).addBox(3.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.1707F, -0.3454F, 1.0773F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(22, 117).addBox(-0.3439F, 0.0915F, -0.4162F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.727F, -1.4794F, 0.2556F, -0.5204F, -0.4054F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(102, 110).addBox(4.4505F, 1.3713F, -0.4162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.727F, -1.4794F, 0.3929F, -0.4307F, -0.7033F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(112, 25).addBox(-0.4203F, -0.0984F, -0.2431F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.427F, -3.5794F, 0.2183F, -0.4587F, -0.4356F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(13, 111).addBox(4.4294F, 1.1678F, -0.2431F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.427F, -3.5794F, 0.339F, -0.3813F, -0.7297F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(131, 127).addBox(3.9627F, 0.9767F, -0.3757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.9F, 11.427F, -9.4794F, 0.2341F, -0.0752F, -1.085F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(59, 92).addBox(0.0784F, -0.1534F, -0.3757F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.9F, 11.427F, -9.4794F, 0.205F, -0.1365F, -0.811F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(117, 110).addBox(-0.0939F, -0.2202F, -0.8256F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.127F, -7.1794F, 0.1942F, -0.2749F, -0.5964F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(125, 11).addBox(4.7767F, 1.1406F, -0.8256F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.127F, -7.1794F, 0.2621F, -0.2113F, -0.8767F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(63, 117).addBox(-0.0501F, -0.0081F, -0.5613F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.127F, -5.4794F, 0.2678F, -0.396F, -0.5335F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(102, 118).addBox(4.7604F, 1.3566F, -0.5613F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 12.127F, -5.4794F, 0.366F, -0.3084F, -0.8162F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(72, 136).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.3447F, -0.1722F, 0.4226F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(147, 70).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.3835F, -0.0146F, 0.0135F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(36, 143).addBox(-0.3536F, -0.1084F, -0.5754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6703F, 5.4411F, -10.5699F, 1.0229F, -0.1675F, -0.8898F));

		PartDefinition cube_r209 = frontleftleg.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(145, 66).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1464F, 5.3166F, 0.1746F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r210 = frontleftleg.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(62, 132).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 5.3166F, 0.1746F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r211 = frontleftleg.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(146, 138).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 0.3916F, -0.0754F, -0.7854F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2598F, 6.925F, -0.6143F, -1.0969F, -0.026F, 0.4033F));

		PartDefinition cube_r212 = frontleftleg2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(51, 142).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0722F, 4.1923F, 0.18F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r213 = frontleftleg2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 142).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r214 = frontleftleg2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(41, 142).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8199F, 2.1155F, 0.18F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r215 = frontleftleg2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(28, 135).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, 0.0873F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1171F, 5.855F, -0.0993F, 0.3844F, -0.291F, 0.6158F));

		PartDefinition cube_r216 = frontleftleg3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(47, 103).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5797F, 0.0984F, -2.6117F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r217 = frontleftleg3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 126).addBox(-1.6F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1268F, 0.0984F, -1.7839F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r218 = frontleftleg3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(102, 103).addBox(-0.8F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(56, 28).addBox(-1.4F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7088F, 0.0984F, -2.4393F, 0.0F, -0.0436F, 0.0F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(144, 50).addBox(-0.6464F, -0.1084F, -0.5754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6703F, 5.4411F, -10.5699F, 0.502F, -0.1784F, 0.9077F));

		PartDefinition cube_r219 = frontrightleg.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(145, 95).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, 5.3166F, 0.1746F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r220 = frontrightleg.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(23, 135).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 5.3166F, 0.1746F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r221 = frontrightleg.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 147).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 0.3916F, -0.0754F, -0.7854F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2598F, 6.925F, -0.6143F, -0.973F, 0.1406F, -0.1372F));

		PartDefinition cube_r222 = frontrightleg2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(56, 142).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0722F, 4.1923F, 0.18F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r223 = frontrightleg2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(77, 142).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r224 = frontrightleg2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(46, 142).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8199F, 2.1155F, 0.18F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r225 = frontrightleg2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(67, 135).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, -0.0873F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1171F, 5.855F, -0.0993F, 0.2591F, 0.3081F, -0.8842F));

		PartDefinition cube_r226 = frontrightleg3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(60, 103).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5797F, 0.0984F, -2.6117F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r227 = frontrightleg3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(126, 91).addBox(0.6F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1268F, 0.0984F, -1.7839F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r228 = frontrightleg3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(26, 104).addBox(-0.2F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(140, 111).addBox(-0.6F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7088F, 0.0984F, -2.4393F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(7.0F, -0.5261F, -10.3119F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(142, 145).addBox(-1.6276F, 1.2905F, 1.1981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 82).addBox(-1.6276F, 1.3005F, 0.8551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.9897F, 0.0F, -0.3491F));

		PartDefinition cube_r230 = bone2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(146, 106).addBox(-1.6276F, 0.1554F, 0.1576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(105, 146).addBox(-1.6276F, -0.0446F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, -0.3491F));

		PartDefinition cube_r231 = bone2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(150, 21).addBox(-1.6276F, -1.5986F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(0, 137).addBox(-1.6276F, -1.0986F, -0.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, -0.3491F));

		PartDefinition cube_r232 = bone2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.6879F, 10.1954F, -0.3919F, 0.0453F, 0.1016F, 0.6033F));

		PartDefinition cube_r233 = bone2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(85, 68).addBox(-0.5F, -1.1F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6879F, 10.1954F, -0.3919F, 0.6126F, 0.1016F, 0.6033F));

		PartDefinition cube_r234 = bone2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(15, 147).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5736F, 8.5766F, -0.3995F, 0.1326F, 0.1016F, 0.6033F));

		PartDefinition cube_r235 = bone2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -0.8F, -4.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0823F, 6.2466F, -1.32F, 1.5725F, 0.1016F, 0.6033F));

		PartDefinition cube_r236 = bone2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(123, 129).addBox(-1.6276F, -2.5251F, -2.5223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, -0.3491F));

		PartDefinition cube_r237 = bone2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(34, 130).addBox(-1.6276F, -1.4089F, -2.7732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 0.7679F, 0.0F, -0.3491F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-7.0F, -0.5261F, -10.3119F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(142, 145).mirror().addBox(0.6276F, 1.2905F, 1.1981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(148, 82).mirror().addBox(0.6276F, 1.3005F, 0.8551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.9897F, 0.0F, 0.3491F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(146, 106).mirror().addBox(0.6276F, 0.1554F, 0.1576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(105, 146).mirror().addBox(0.6276F, -0.0446F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, 0.3491F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(150, 21).mirror().addBox(0.6276F, -1.5986F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 137).mirror().addBox(0.6276F, -1.0986F, -0.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, 0.3491F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.6879F, 10.1954F, -0.3919F, 0.0453F, -0.1016F, -0.6033F));

		PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-0.5F, -1.1F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6879F, 10.1954F, -0.3919F, 0.6126F, -0.1016F, -0.6033F));

		PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(15, 147).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.5736F, 8.5766F, -0.3995F, 0.1326F, -0.1016F, -0.6033F));

		PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5F, -0.8F, -4.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0823F, 6.2466F, -1.32F, 1.5725F, -0.1016F, -0.6033F));

		PartDefinition cube_r245 = bone3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(123, 129).mirror().addBox(0.6276F, -2.5251F, -2.5223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, 0.3491F));

		PartDefinition cube_r246 = bone3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(34, 130).mirror().addBox(0.6276F, -1.4089F, -2.7732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 0.7679F, 0.0F, 0.3491F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, -0.6F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.85F, -13.1F, 0.0518F, -0.0978F, -0.0526F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(116, 151).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -5.7F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(110, 151).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(100, 141).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -1.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(139, 107).mirror().addBox(-0.9644F, -0.8775F, 5.6819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -2.164F, -7.7054F, 0.1333F, -0.138F, -1.227F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(79, 138).mirror().addBox(-1.3414F, -0.2321F, 5.9078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.1747F, -7.7897F, 0.0299F, -0.1083F, -0.7042F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(72, 138).mirror().addBox(-0.3848F, 0.2789F, 5.9041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.1747F, -7.7897F, -0.0832F, -0.0647F, 0.4869F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(139, 43).mirror().addBox(-0.6557F, -0.8775F, 2.9684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -2.164F, -7.7054F, 0.1327F, -0.0948F, -1.2212F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(138, 66).mirror().addBox(-0.6124F, -0.1583F, 3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.1747F, -7.7897F, -0.1604F, -0.0247F, 0.482F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(55, 138).mirror().addBox(-1.0407F, -0.6094F, 3.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.1747F, -7.7897F, -0.0366F, -0.1649F, -0.7035F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(126, 73).mirror().addBox(-3.7941F, 0.2637F, -0.4398F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4021F, 0.6086F, -3.6787F, 0.3884F, 0.7258F, -0.7994F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(137, 72).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.5F, 0.4476F, 0.2448F, -0.4676F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(137, 59).mirror().addBox(-6.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.5F, 0.209F, 0.4644F, -1.1285F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(147, 101).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.5F, 0.5045F, 0.0423F, -0.0764F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(148, 6).mirror().addBox(-1.6136F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -4.9F, 0.3874F, 0.4507F, -0.8218F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(137, 72).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -0.5F, 0.4476F, -0.2448F, 0.4676F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(137, 59).addBox(3.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -0.5F, 0.209F, -0.4644F, 1.1285F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(72, 138).addBox(-0.6152F, 0.2789F, 5.9041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.1747F, -7.7897F, -0.0832F, 0.0647F, -0.4869F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(79, 138).addBox(0.3414F, -0.2321F, 5.9078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.1747F, -7.7897F, 0.0299F, 0.1083F, 0.7042F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(55, 138).addBox(0.0407F, -0.6094F, 3.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.1747F, -7.7897F, -0.0366F, 0.1649F, 0.7035F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(138, 66).addBox(-0.3876F, -0.1583F, 3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.1747F, -7.7897F, -0.1604F, 0.0247F, -0.482F));

		PartDefinition cube_r267 = body4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(139, 107).addBox(-0.0356F, -0.8775F, 5.6819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -2.164F, -7.7054F, 0.1333F, 0.138F, 1.227F));

		PartDefinition cube_r268 = body4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(139, 43).addBox(-0.3443F, -0.8775F, 2.9684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -2.164F, -7.7054F, 0.1327F, 0.0948F, 1.2212F));

		PartDefinition cube_r269 = body4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(147, 101).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -0.5F, 0.5045F, -0.0423F, 0.0764F));

		PartDefinition cube_r270 = body4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(126, 73).addBox(-0.2059F, 0.2637F, -0.4398F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4021F, 0.6086F, -3.6787F, 0.3884F, -0.7258F, 0.7994F));

		PartDefinition cube_r271 = body4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(148, 6).addBox(-0.3864F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -4.9F, 0.3874F, -0.4507F, 0.8218F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3868F, -6.6041F, -0.1743F, -0.0827F, 0.0033F));

		PartDefinition cube_r272 = neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(126, 134).mirror().addBox(-0.7988F, -0.8784F, -0.0514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -2.5509F, -1.1014F, 0.1325F, -0.0079F, -1.2165F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(135, 79).mirror().addBox(-0.4884F, 0.08F, -0.035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.5616F, -1.1856F, -0.0445F, -0.0851F, 0.484F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(140, 74).mirror().addBox(-1.2373F, -0.4079F, -0.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.5616F, -1.1856F, 0.0633F, -0.08F, -0.7073F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(48, 138).mirror().addBox(-0.3971F, -0.572F, -0.9989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8704F, -3.6269F, -6.2868F, 0.1163F, -0.0603F, 0.4765F));

		PartDefinition cube_r276 = neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(136, 22).mirror().addBox(-0.6053F, -0.5685F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8704F, -3.6269F, -6.2868F, 0.1006F, 0.0779F, -0.7031F));

		PartDefinition cube_r277 = neck.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(41, 138).mirror().addBox(-0.8534F, -0.103F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.984F, -4.5419F, -3.2858F, 0.0009F, -0.007F, -0.7067F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(137, 129).mirror().addBox(0.0534F, -0.103F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0534F, -4.6508F, -3.2858F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(139, 34).mirror().addBox(0.5F, -0.8F, 1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(150, 94).mirror().addBox(0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3936F, -1.614F, -5.0462F, -0.0149F, -0.041F, -1.2214F));

		PartDefinition cube_r280 = neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(75, 129).mirror().addBox(-0.727F, -0.1304F, -0.8362F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -2.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r281 = neck.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(44, 119).mirror().addBox(-1.5834F, -0.2308F, -0.74F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -0.3F, 0.3675F, 0.329F, -0.8739F));

		PartDefinition cube_r282 = neck.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(126, 134).addBox(-0.2012F, -0.8784F, -0.0514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -2.5509F, -1.1014F, 0.1325F, 0.0079F, 1.2165F));

		PartDefinition cube_r283 = neck.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(139, 34).addBox(-1.5F, -0.8F, 1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(150, 94).addBox(-1.2F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3936F, -1.614F, -5.0462F, -0.0149F, 0.041F, 1.2214F));

		PartDefinition cube_r284 = neck.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(136, 22).addBox(-0.3947F, -0.5685F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8704F, -3.6269F, -6.2868F, 0.1006F, -0.0779F, 0.7031F));

		PartDefinition cube_r285 = neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(48, 138).addBox(-0.6029F, -0.572F, -0.9989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8704F, -3.6269F, -6.2868F, 0.1163F, 0.0603F, -0.4765F));

		PartDefinition cube_r286 = neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(140, 74).addBox(0.2373F, -0.4079F, -0.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.5616F, -1.1856F, 0.0633F, 0.08F, 0.7073F));

		PartDefinition cube_r287 = neck.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(135, 79).addBox(-0.5116F, 0.08F, -0.035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.5616F, -1.1856F, -0.0445F, 0.0851F, -0.484F));

		PartDefinition cube_r288 = neck.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(137, 129).addBox(-1.0534F, -0.103F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0534F, -4.6508F, -3.2858F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r289 = neck.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(41, 138).addBox(-0.1466F, -0.103F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.984F, -4.5419F, -3.2858F, 0.0009F, 0.007F, 0.7067F));

		PartDefinition cube_r290 = neck.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(151, 106).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2624F, -6.9387F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(141, 149).addBox(0.0F, -1.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2522F, -4.9287F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r292 = neck.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(75, 129).addBox(-0.273F, -0.1304F, -0.8362F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r293 = neck.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(44, 119).addBox(-0.4166F, -0.2308F, -0.74F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -0.3F, 0.3675F, -0.329F, 0.8739F));

		PartDefinition cube_r294 = neck.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(113, 151).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1426F, -2.9292F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r295 = neck.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(144, 149).addBox(0.0F, -1.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.033F, -0.9297F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r296 = neck.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(72, 0).addBox(-1.5F, -0.85F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.9254F, -7.864F, -0.3337F, -0.2037F, 0.0188F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(122, 75).addBox(-1.7664F, -0.92F, 0.0167F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1357F, -0.4991F, -15.3141F, -1.4704F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(130, 44).addBox(-2.2664F, -0.938F, -0.9855F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6357F, 0.6903F, -16.8538F, -2.3082F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(126, 100).addBox(-1.5F, -1.1F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 1.776F, -15.8841F, -1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(126, 96).addBox(-1.7664F, 0.2532F, -1.4389F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1357F, 2.1204F, -14.6324F, -1.5752F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(63, 119).addBox(-1.7664F, 0.1829F, -0.0106F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1357F, -0.5561F, -15.1676F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(95, 13).addBox(-1.5F, -0.048F, -0.1427F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1307F, 0.9719F, -14.9758F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(95, 24).addBox(-2.5F, -1.0F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, -0.1976F, -7.2058F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(115, 103).addBox(-1.0F, -0.3121F, -1.5684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -1.3231F, -5.7723F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(64, 41).addBox(-2.5F, 0.0186F, -2.9266F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1307F, -1.843F, -4.4485F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(89, 36).addBox(-2.0F, -0.4F, -3.0022F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1307F, -0.2344F, -6.9388F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 28).addBox(-2.0F, -0.2727F, 4.2485F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.9719F, -14.9758F, 0.2182F, 0.0F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4693F, -0.9004F, -7.0059F, 0.0015F, 0.1745F, 0.0089F));

		PartDefinition cube_r308 = eye.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(95, 150).addBox(0.025F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(150, 149).addBox(-0.375F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5678F, 0.0657F, 0.1558F, 0.234F, -0.444F, -0.0663F));

		PartDefinition cube_r309 = eye.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(151, 0).addBox(-0.497F, -0.5394F, -0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6189F, -0.4118F, 2.5244F, -0.0066F, 0.2012F, 0.027F));

		PartDefinition cube_r310 = eye.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(151, 24).addBox(-0.325F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1781F, -0.4764F, 2.3891F, -0.0095F, -0.1403F, -0.0053F));

		PartDefinition cube_r311 = eye.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 151).addBox(-0.5015F, -0.5539F, -0.943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6189F, -0.4118F, 2.5244F, 0.2109F, 0.2013F, 0.0671F));

		PartDefinition cube_r312 = eye.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(105, 150).addBox(-0.225F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2488F, -0.1332F, 0.8986F, 0.2109F, 0.2013F, 0.054F));

		PartDefinition cube_r313 = eye.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(126, 104).addBox(-1.0F, -0.55F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0045F, 0.1514F, 0.4714F, 0.2561F, -0.1068F, 0.1955F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7307F, -0.9004F, -7.0059F, 0.0015F, -0.1745F, -0.0089F));

		PartDefinition cube_r314 = eye3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(95, 150).mirror().addBox(-1.025F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(150, 149).mirror().addBox(-0.625F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5678F, 0.0657F, 0.1558F, 0.234F, 0.444F, 0.0663F));

		PartDefinition cube_r315 = eye3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(151, 0).mirror().addBox(-0.503F, -0.5394F, -0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6189F, -0.4118F, 2.5244F, -0.0066F, -0.2012F, -0.027F));

		PartDefinition cube_r316 = eye3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(151, 24).mirror().addBox(-0.675F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1781F, -0.4764F, 2.3891F, -0.0095F, 0.1403F, 0.0053F));

		PartDefinition cube_r317 = eye3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 151).mirror().addBox(-0.4985F, -0.5539F, -0.943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6189F, -0.4118F, 2.5244F, 0.2109F, -0.2013F, -0.0671F));

		PartDefinition cube_r318 = eye3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(105, 150).mirror().addBox(-0.775F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2488F, -0.1332F, 0.8986F, 0.2109F, -0.2013F, -0.054F));

		PartDefinition cube_r319 = eye3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(126, 104).mirror().addBox(-1.0F, -0.55F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0045F, 0.1514F, 0.4714F, 0.2561F, 0.1068F, -0.1955F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r320 = eye2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(130, 108).addBox(0.2F, 0.9528F, 1.7161F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 8).addBox(-1.8F, -0.0444F, 1.642F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 20).addBox(-1.8F, -0.0444F, 0.142F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.1F, -0.3495F, -1.6013F, 0.1658F, 0.0F, 0.0F));

		PartDefinition eye4 = head.addOrReplaceChild("eye4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5131F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(52, 116).addBox(0.9245F, -0.4504F, -1.5684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2925F, -0.0508F, 0.1671F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(125, 62).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.781F, 0.3784F, -3.1911F, 0.0896F, 0.2038F, 0.2234F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 124).addBox(-0.2F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.3699F, -2.9745F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(122, 124).addBox(-1.4F, -1.0F, -1.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.3699F, -2.9745F, 0.055F, -0.6538F, -0.0335F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(125, 6).addBox(-0.5F, -1.0F, -0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8947F, 1.4284F, -4.3144F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(35, 119).addBox(-0.9F, -0.0728F, -0.0227F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4F, 0.7083F, -7.056F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(110, 147).addBox(0.8336F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(87, 147).addBox(0.0336F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9664F, 0.7238F, -8.5468F, -1.3522F, 0.2483F, 0.436F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(55, 147).addBox(-0.9664F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9664F, 0.7238F, -8.5468F, -1.4653F, 0.3125F, 0.0325F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(125, 138).addBox(-0.6414F, -1.545F, 0.1167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5613F, 0.7515F, -9.8207F, -1.4351F, 0.7372F, 0.0915F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(131, 117).addBox(-0.6664F, -2.22F, 0.0167F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2664F, 0.824F, -9.5418F, -1.4351F, 0.7372F, 0.0915F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(107, 126).addBox(-1.05F, -0.926F, -1.2896F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.686F, 2.3242F, -8.4507F, 0.2037F, 0.3927F, 0.0961F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(141, 6).addBox(-0.975F, -0.925F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(9, 127).addBox(-0.975F, -0.925F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9768F, 3.337F, -7.4979F, -0.0635F, 0.3751F, 0.0141F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(18, 127).addBox(-1.025F, -0.15F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9604F, 2.5198F, -9.6007F, 0.3097F, 1.0393F, 0.1558F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(142, 114).addBox(-1.9F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2708F, 1.6522F, -10.684F, 0.7297F, 0.8717F, 0.8369F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(130, 142).addBox(-2.0F, 0.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.095F, 1.5726F, -10.1144F, 0.4798F, 0.4255F, 0.4253F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(142, 103).addBox(-1.9F, 0.1F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4998F, 1.6145F, -10.4938F, 0.5949F, 0.6991F, 0.6472F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(50, 127).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9938F, 2.1336F, -9.5803F, 0.17F, 1.0393F, 0.1558F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(146, 29).addBox(-0.4493F, -0.9605F, 0.3235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(146, 43).addBox(-0.4493F, -0.8605F, -0.5765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3878F, 3.3573F, -7.5401F, 0.2182F, 0.1047F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(149, 114).addBox(-0.4869F, -0.55F, -0.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1573F, 3.7195F, -10.3516F, 0.9802F, 1.3211F, 0.8953F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(149, 103).addBox(-0.45F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1573F, 3.7195F, -10.3516F, 0.648F, 1.2238F, 0.5485F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(26, 146).addBox(-0.8F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4166F, 3.402F, -10.2801F, 0.4329F, 1.0779F, 0.2984F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(100, 146).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8534F, 3.2615F, -9.2754F, 0.2182F, 0.4102F, 0.0F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(146, 25).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2522F, 3.2615F, -8.3583F, 0.0F, 0.4102F, 0.0F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(5, 144).addBox(-0.12F, 1.4345F, -9.8987F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(109, 76).addBox(-0.12F, -1.7683F, -10.3118F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.2094F, 0.0873F, 0.0F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(143, 38).addBox(-0.12F, -0.9508F, -9.2191F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(139, 12).addBox(0.88F, -1.1032F, -9.0253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 127).addBox(-0.12F, -1.6032F, -8.2253F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.3403F, 0.0873F, 0.0F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(32, 125).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3669F, 1.0337F, -7.3443F, 0.1225F, -0.0074F, 0.3193F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(125, 19).addBox(-1.0F, -0.075F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.947F, 1.1771F, -7.4671F, 0.1824F, 0.0651F, 0.1026F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(150, 66).addBox(1.0064F, 1.1519F, -6.7739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 140).addBox(0.0064F, -0.3481F, -6.6739F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 129).addBox(-0.524F, -1.0957F, 2.0726F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, -0.0262F, 0.0785F, 0.0F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(132, 138).addBox(-1.5F, -0.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5267F, 0.1962F, 4.0337F, -0.3349F, 0.589F, -0.2659F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(144, 47).addBox(-0.524F, -1.9968F, 0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, -0.4189F, 0.0785F, 0.0F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(14, 140).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.953F, 0.0282F, 2.7192F, -0.0089F, 0.0337F, 0.0144F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(143, 22).addBox(-0.5036F, -1.4581F, -0.8208F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.3665F, 0.0175F, 0.0F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(12, 144).addBox(-0.5036F, -1.5688F, -2.0088F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.7156F, 0.0175F, 0.0F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(98, 126).addBox(-2.8009F, -2.3045F, 1.0234F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1857F, 0.2156F, 0.1683F, 0.7841F, 0.9638F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(142, 142).addBox(-0.5036F, -1.7736F, -0.8618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.9338F, 0.0175F, 0.0F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(59, 128).addBox(-0.5036F, -1.4985F, -2.0164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.2007F, 0.0175F, 0.0F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(113, 112).addBox(0.4964F, 0.0119F, -6.2241F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 58).addBox(-0.5036F, -1.4881F, -6.0241F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.9708F, 2.1367F, 0.192F, 0.0175F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(52, 116).mirror().addBox(-2.9245F, -0.4504F, -1.5684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2925F, 0.0508F, -0.1671F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.781F, 0.3784F, -3.1911F, 0.0896F, -0.2038F, -0.2234F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.8F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.3699F, -2.9745F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(0.4F, -1.0F, -1.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.3699F, -2.9745F, 0.055F, 0.6538F, 0.0335F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.5F, -1.0F, -0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8947F, 1.4284F, -4.3144F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(35, 119).mirror().addBox(-0.1F, -0.0728F, -0.0227F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.7083F, -7.056F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(110, 147).mirror().addBox(-1.8336F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 147).mirror().addBox(-1.0336F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9664F, 0.7238F, -8.5468F, -1.3522F, -0.2483F, -0.436F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(55, 147).mirror().addBox(-0.0336F, -1.62F, 0.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9664F, 0.7238F, -8.5468F, -1.4653F, -0.3125F, -0.0325F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(125, 138).mirror().addBox(-0.3586F, -1.545F, 0.1167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5613F, 0.7515F, -9.8207F, -1.4351F, -0.7372F, -0.0915F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(131, 117).mirror().addBox(-0.3336F, -2.22F, 0.0167F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2664F, 0.824F, -9.5418F, -1.4351F, -0.7372F, -0.0915F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(107, 126).mirror().addBox(-0.95F, -0.926F, -1.2896F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.686F, 2.3242F, -8.4507F, 0.2037F, -0.3927F, -0.0961F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(141, 6).mirror().addBox(-1.025F, -0.925F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(9, 127).mirror().addBox(-1.025F, -0.925F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9768F, 3.337F, -7.4979F, -0.0635F, -0.3751F, -0.0141F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(18, 127).mirror().addBox(-0.975F, -0.15F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9604F, 2.5198F, -9.6007F, 0.3097F, -1.0393F, -0.1558F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(142, 114).mirror().addBox(-0.1F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2708F, 1.6522F, -10.684F, 0.7297F, -0.8717F, -0.8369F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(130, 142).mirror().addBox(0.0F, 0.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.095F, 1.5726F, -10.1144F, 0.4798F, -0.4255F, -0.4253F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(142, 103).mirror().addBox(-0.1F, 0.1F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4998F, 1.6145F, -10.4938F, 0.5949F, -0.6991F, -0.6472F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(50, 127).mirror().addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9938F, 2.1336F, -9.5803F, 0.17F, -1.0393F, -0.1558F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(146, 29).mirror().addBox(-0.5507F, -0.9605F, 0.3235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(146, 43).mirror().addBox(-0.5507F, -0.8605F, -0.5765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3878F, 3.3573F, -7.5401F, 0.2182F, -0.1047F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(149, 114).mirror().addBox(-0.5131F, -0.55F, -0.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1573F, 3.7195F, -10.3516F, 0.9802F, -1.3211F, -0.8953F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(149, 103).mirror().addBox(-0.55F, -0.45F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1573F, 3.7195F, -10.3516F, 0.648F, -1.2238F, -0.5485F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(26, 146).mirror().addBox(-0.2F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4166F, 3.402F, -10.2801F, 0.4329F, -1.0779F, -0.2984F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(100, 146).mirror().addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8534F, 3.2615F, -9.2754F, 0.2182F, -0.4102F, 0.0F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(146, 25).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2522F, 3.2615F, -8.3583F, 0.0F, -0.4102F, 0.0F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(5, 144).mirror().addBox(-1.88F, 1.4345F, -9.8987F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(109, 76).mirror().addBox(-1.88F, -1.7683F, -10.3118F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.2094F, -0.0873F, 0.0F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(143, 38).mirror().addBox(-1.88F, -0.9508F, -9.2191F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-1.88F, -1.1032F, -9.0253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 127).mirror().addBox(-1.88F, -1.6032F, -8.2253F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.3403F, -0.0873F, 0.0F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(32, 125).mirror().addBox(0.0F, 0.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3669F, 1.0337F, -7.3443F, 0.1225F, 0.0074F, -0.3193F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(125, 19).mirror().addBox(0.0F, -0.075F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.947F, 1.1771F, -7.4671F, 0.1824F, -0.0651F, -0.1026F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(150, 66).mirror().addBox(-2.0064F, 1.1519F, -6.7739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 140).mirror().addBox(-2.0064F, -0.3481F, -6.6739F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-1.476F, -1.0957F, 2.0726F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, -0.0262F, -0.0785F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(132, 138).mirror().addBox(0.5F, -0.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5267F, 0.1962F, 4.0337F, -0.3349F, -0.589F, 0.2659F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(144, 47).mirror().addBox(-1.476F, -1.9968F, 0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, -0.4189F, -0.0785F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(14, 140).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.953F, 0.0282F, 2.7192F, -0.0089F, -0.0337F, -0.0144F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(143, 22).mirror().addBox(-1.4964F, -1.4581F, -0.8208F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.3665F, -0.0175F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(12, 144).mirror().addBox(-1.4964F, -1.5688F, -2.0088F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.7156F, -0.0175F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(98, 126).mirror().addBox(0.8009F, -2.3045F, 1.0234F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1857F, 0.2156F, 0.1683F, -0.7841F, -0.9638F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(142, 142).mirror().addBox(-1.4964F, -1.7736F, -0.8618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.9338F, -0.0175F, 0.0F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(59, 128).mirror().addBox(-1.4964F, -1.4985F, -2.0164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.2007F, -0.0175F, 0.0F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(113, 112).mirror().addBox(-1.4964F, 0.0119F, -6.2241F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 58).mirror().addBox(-1.4964F, -1.4881F, -6.0241F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9708F, 2.1367F, 0.192F, -0.0175F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(47, 96).addBox(2.5F, -0.4396F, -9.5893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 96).mirror().addBox(-3.5F, -0.4396F, -9.5893F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 3).addBox(-1.4818F, -1.3192F, -16.1974F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(132, 0).addBox(-1.4818F, -0.8192F, -16.1974F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1307F, -0.6092F, -0.1629F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(100, 150).mirror().addBox(-0.425F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7413F, -0.2732F, -15.6049F, -0.4521F, -1.1072F, 0.2473F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(151, 17).mirror().addBox(-0.3612F, -0.0192F, -0.9752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(5, 151).mirror().addBox(-0.3612F, -0.0192F, -1.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2587F, -1.3556F, -15.3792F, -0.06F, -1.1154F, 0.1507F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(10, 151).mirror().addBox(-0.032F, -0.8782F, -2.6675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(139, 138).mirror().addBox(-0.032F, -0.8782F, -2.1675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.5943F, -13.7655F, -0.4712F, -0.3491F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(151, 27).mirror().addBox(-0.5F, -0.1152F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7913F, -15.7347F, 0.2494F, 0.3467F, -0.0237F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(151, 30).mirror().addBox(-0.5F, -0.8847F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7913F, -15.7347F, 0.1622F, 0.3467F, -0.0237F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(151, 14).mirror().addBox(-0.5F, -0.8847F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6864F, -1.1705F, -13.8629F, -0.6343F, 1.104F, -0.7334F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(151, 42).mirror().addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5087F, -1.2696F, -14.8379F, -0.2567F, 1.1007F, -0.5985F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(151, 33).mirror().addBox(-0.275F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.26F, -1.5158F, -15.178F, 0.0009F, 0.7288F, -0.2372F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(151, 11).mirror().addBox(-0.5F, -0.1152F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6864F, -1.1705F, -13.8629F, -0.547F, 1.104F, -0.7334F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(151, 8).mirror().addBox(-0.5715F, -0.4706F, -0.6008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0968F, 0.2692F, -14.8421F, -0.3949F, -0.3859F, -0.0705F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(149, 142).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9424F, 0.0719F, -15.3381F, -0.3977F, -0.402F, -0.0632F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(149, 63).mirror().addBox(-0.5715F, -0.4273F, 0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0968F, 0.2692F, -14.8421F, -0.2727F, -0.3859F, -0.0705F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(139, 30).mirror().addBox(0.1F, 0.1929F, -4.3059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.1943F, -9.5655F, -0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(20, 151).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 151).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7115F, -0.0726F, -12.8363F, -0.0611F, -0.0873F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(139, 26).mirror().addBox(0.1F, -1.4085F, -4.3575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.1943F, -9.5655F, -0.0175F, -0.0873F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(80, 126).mirror().addBox(-0.5F, -0.45F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9026F, -0.0881F, -10.653F, -0.096F, -0.0873F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(126, 79).mirror().addBox(0.1F, -1.1107F, -2.5115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.1943F, -9.5655F, -0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(122, 85).mirror().addBox(0.1F, -0.7504F, -2.6417F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.1943F, -9.5655F, -0.2793F, -0.0873F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-6.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 0).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, 2.4943F, -9.5655F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(34, 96).mirror().addBox(-6.5F, 0.025F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 96).addBox(-0.5F, 0.025F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.2215F, -4.5999F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-1.0F, -1.368F, -6.1509F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, -0.0873F, -0.0873F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(71, 124).mirror().addBox(-1.0F, -1.3805F, -2.7979F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, 0.6632F, -0.0873F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(133, 134).mirror().addBox(-1.0F, 1.1119F, -6.1975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, -0.0698F, -0.0873F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(131, 122).mirror().addBox(-1.0F, -1.0465F, -4.6011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, 0.192F, -0.0873F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(14, 136).mirror().addBox(-1.0F, -1.3531F, -0.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, 0.925F, -0.0873F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(108, 44).mirror().addBox(-1.0F, -1.8417F, -3.5048F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, 0.6196F, -0.0873F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(27, 130).mirror().addBox(-1.0F, -1.0195F, -3.5638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, -0.2094F, -0.0873F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(31, 141).mirror().addBox(-1.0F, -1.7508F, -4.2805F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.7049F, 1.3845F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(100, 150).addBox(-0.575F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7413F, -0.2732F, -15.6049F, -0.4521F, 1.1072F, -0.2473F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(151, 17).addBox(-0.6388F, -0.0192F, -0.9752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(5, 151).addBox(-0.6388F, -0.0192F, -1.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2587F, -1.3556F, -15.3792F, -0.06F, 1.1154F, -0.1507F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(10, 151).addBox(-0.968F, -0.8782F, -2.6675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(139, 138).addBox(-0.968F, -0.8782F, -2.1675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.1F, 0.5943F, -13.7655F, -0.4712F, 0.3491F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(151, 27).addBox(-0.5F, -0.1152F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1849F, -1.7913F, -15.7347F, 0.2494F, -0.3467F, 0.0237F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(151, 30).addBox(-0.5F, -0.8847F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1849F, -1.7913F, -15.7347F, 0.1622F, -0.3467F, 0.0237F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(151, 14).addBox(-0.5F, -0.8847F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6864F, -1.1705F, -13.8629F, -0.6343F, -1.104F, 0.7334F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(151, 42).addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5087F, -1.2696F, -14.8379F, -0.2567F, -1.1007F, 0.5985F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(151, 33).addBox(-0.725F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.26F, -1.5158F, -15.178F, 0.0009F, -0.7288F, 0.2372F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(151, 11).addBox(-0.5F, -0.1152F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6864F, -1.1705F, -13.8629F, -0.547F, -1.104F, 0.7334F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(151, 8).addBox(-0.4285F, -0.4706F, -0.6008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0968F, 0.2692F, -14.8421F, -0.3949F, 0.3859F, 0.0705F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(149, 142).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9424F, 0.0719F, -15.3381F, -0.3977F, 0.402F, 0.0632F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(149, 63).addBox(-0.4285F, -0.4273F, 0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0968F, 0.2692F, -14.8421F, -0.2727F, 0.3859F, 0.0705F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(139, 30).addBox(-1.1F, 0.1929F, -4.3059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.6F, 1.1943F, -9.5655F, -0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 151).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 151).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7115F, -0.0726F, -12.8363F, -0.0611F, 0.0873F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(139, 26).addBox(-1.1F, -1.4085F, -4.3575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6F, 1.1943F, -9.5655F, -0.0175F, 0.0873F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(80, 126).addBox(-0.5F, -0.45F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9026F, -0.0881F, -10.653F, -0.096F, 0.0873F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(126, 79).addBox(-1.1F, -1.1107F, -2.5115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6F, 1.1943F, -9.5655F, -0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(122, 85).addBox(-1.1F, -0.7504F, -2.6417F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6F, 1.1943F, -9.5655F, -0.2793F, 0.0873F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(39, 104).addBox(0.0F, -1.368F, -6.1509F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, -0.0873F, 0.0873F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(71, 124).addBox(0.0F, -1.3805F, -2.7979F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, 0.6632F, 0.0873F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(133, 134).addBox(0.0F, 1.1119F, -6.1975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, -0.0698F, 0.0873F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(131, 122).addBox(0.0F, -1.0465F, -4.6011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, 0.192F, 0.0873F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(14, 136).addBox(0.0F, -1.3531F, -0.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, 0.925F, 0.0873F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(108, 44).addBox(0.0F, -1.8417F, -3.5048F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, 0.6196F, 0.0873F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(27, 130).addBox(0.0F, -1.0195F, -3.5638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, -0.2094F, 0.0873F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(31, 141).addBox(0.0F, -1.7508F, -4.2805F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.7049F, 1.3845F, 0.0F, 0.0873F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 73).addBox(-1.0F, -0.1552F, -0.085F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F))
				.texOffs(140, 133).addBox(0.0F, -1.7552F, -0.085F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 57).addBox(0.0F, -1.8552F, 2.915F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.35F, 6.8F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r455 = tail.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(13, 97).addBox(0.0F, -1.9F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1448F, 6.0044F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(92, 142).addBox(0.0F, -0.9F, 3.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 78).addBox(0.0F, -2.2F, 0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8448F, 3.415F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(52, 110).mirror().addBox(-3.4636F, -0.3922F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.2552F, -0.085F, 0.0673F, 0.0186F, -0.2699F));

		PartDefinition cube_r458 = tail.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(138, 121).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8592F, -3.3259F, 1.4093F, 0.4573F, 0.0695F, -0.5256F));

		PartDefinition cube_r459 = tail.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(122, 67).mirror().addBox(-0.5F, -4.4F, -4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(89, 131).mirror().addBox(-0.5F, -3.2F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1489F, -3.1664F, 9.0905F, 0.6754F, 0.0695F, -0.5256F));

		PartDefinition cube_r460 = tail.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(131, 84).mirror().addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1489F, -3.1664F, 9.0905F, 0.5882F, 0.0695F, -0.5256F));

		PartDefinition cube_r461 = tail.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(78, 95).mirror().addBox(-0.3F, -1.0F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -3.0283F, 6.611F, -0.0227F, 0.0695F, -0.5256F));

		PartDefinition cube_r462 = tail.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-2.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, 0.8F, -0.0178F, 0.0068F, -0.1394F));

		PartDefinition cube_r463 = tail.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(52, 110).addBox(1.4636F, -0.3922F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -3.2552F, -0.085F, 0.0673F, -0.0186F, 0.2699F));

		PartDefinition cube_r464 = tail.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(138, 121).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.8592F, -3.3259F, 1.4093F, 0.4573F, -0.0695F, 0.5256F));

		PartDefinition cube_r465 = tail.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(122, 67).addBox(-0.5F, -4.4F, -4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(89, 131).addBox(-0.5F, -3.2F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1489F, -3.1664F, 9.0905F, 0.6754F, -0.0695F, 0.5256F));

		PartDefinition cube_r466 = tail.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(131, 84).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1489F, -3.1664F, 9.0905F, 0.5882F, -0.0695F, 0.5256F));

		PartDefinition cube_r467 = tail.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(78, 95).addBox(-0.7F, -1.0F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -3.0283F, 6.611F, -0.0227F, -0.0695F, 0.5256F));

		PartDefinition cube_r468 = tail.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -3.2552F, -0.085F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(71, 85).addBox(0.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, 0.8F, -0.0178F, -0.0068F, 0.1394F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -0.1594F, 0.1708F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F))
				.texOffs(59, 94).addBox(-1.0F, -2.9594F, 0.2708F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(26, 141).addBox(0.0F, -2.0594F, 0.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 142).addBox(0.0F, -2.0594F, 3.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 144).addBox(0.0F, -2.1594F, 6.1708F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0448F, 8.715F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r470 = tail2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(90, 136).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1594F, 9.1708F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r471 = tail2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(121, 56).mirror().addBox(-0.1347F, -8.2745F, -9.346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(82, 131).mirror().addBox(-0.0597F, -7.0745F, -6.646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(75, 131).mirror().addBox(-0.0597F, -5.7745F, -5.146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.6922F, 0.0377F, -0.4189F));

		PartDefinition cube_r472 = tail2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(131, 67).mirror().addBox(-0.0597F, -4.195F, -3.8464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.6049F, 0.0377F, -0.4189F));

		PartDefinition cube_r473 = tail2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(48, 131).mirror().addBox(-0.0597F, -2.9347F, -2.514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(41, 131).mirror().addBox(-0.0597F, -1.9347F, -1.014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.5177F, 0.0377F, -0.4189F));

		PartDefinition cube_r474 = tail2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(0.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.0001F, 0.0526F, -0.4193F));

		PartDefinition cube_r475 = tail2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(102, 95).mirror().addBox(-0.0597F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, -0.0496F, 0.0377F, -0.4189F));

		PartDefinition cube_r476 = tail2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.6014F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, 0.7415F, 0.2835F, -0.0178F, 0.0243F, -0.1397F));

		PartDefinition cube_r477 = tail2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 78).addBox(-0.3986F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9243F, 0.7415F, 0.2835F, -0.0178F, -0.0243F, 0.1397F));

		PartDefinition cube_r478 = tail2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(84, 147).addBox(0.0F, 4.1F, 8.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 147).addBox(0.0F, 3.1F, 5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 147).addBox(0.0F, 1.4F, 1.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 135).addBox(0.0F, -1.5F, -1.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2656F, 1.6898F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r479 = tail2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 76).addBox(-1.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.0001F, -0.0526F, 0.4193F));

		PartDefinition cube_r480 = tail2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(121, 56).addBox(-0.8653F, -8.2745F, -9.346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F))
				.texOffs(82, 131).addBox(-0.9403F, -7.0745F, -6.646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(75, 131).addBox(-0.9403F, -5.7745F, -5.146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.6922F, -0.0377F, 0.4189F));

		PartDefinition cube_r481 = tail2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(131, 67).addBox(-0.9403F, -4.195F, -3.8464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.6049F, -0.0377F, 0.4189F));

		PartDefinition cube_r482 = tail2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(48, 131).addBox(-0.9403F, -2.9347F, -2.514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(41, 131).addBox(-0.9403F, -1.9347F, -1.014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.5177F, -0.0377F, 0.4189F));

		PartDefinition cube_r483 = tail2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(102, 95).addBox(-0.9403F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, -0.0496F, -0.0377F, 0.4189F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(62, 47).addBox(-1.0F, -0.0381F, -0.2468F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(0, 141).addBox(0.0F, -2.3381F, -0.2468F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(141, 0).addBox(0.0F, -2.3381F, 2.7532F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(141, 16).addBox(0.0F, -2.2381F, 5.7532F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 141).addBox(0.0F, -2.1381F, 8.7532F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1214F, 12.4194F, 0.0455F, -0.0416F, -0.0455F));

		PartDefinition cube_r484 = tail3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(150, 74).addBox(0.0F, 3.4F, 5.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 150).addBox(0.0F, 2.2F, 2.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 59).addBox(0.0F, -0.2F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5576F, 1.6768F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(16, 131).mirror().addBox(-0.5F, -4.1F, -5.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(9, 131).mirror().addBox(-0.5F, -3.0F, -4.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(130, 129).mirror().addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(105, 130).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.913F, -3.784F, 7.1324F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r486 = tail3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(98, 130).mirror().addBox(-0.5F, -1.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8267F, -3.5231F, 9.5019F, 0.4609F, 0.0018F, -0.3042F));

		PartDefinition cube_r487 = tail3.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.475F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -3.3291F, 5.1975F, -0.019F, 0.0018F, -0.3042F));

		PartDefinition cube_r488 = tail3.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(16, 131).addBox(-0.5F, -4.1F, -5.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(9, 131).addBox(-0.5F, -3.0F, -4.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(130, 129).addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(105, 130).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.913F, -3.784F, 7.1324F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r489 = tail3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(98, 130).addBox(-0.5F, -1.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8267F, -3.5231F, 9.5019F, 0.4609F, -0.0018F, 0.3042F));

		PartDefinition cube_r490 = tail3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 64).addBox(-0.525F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, -3.3291F, 5.1975F, -0.019F, -0.0018F, 0.3042F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 86).addBox(-1.0F, -0.413F, -0.1774F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.001F))
				.texOffs(108, 51).addBox(-0.5F, -0.3339F, 6.3237F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2514F, 10.8531F, -0.0057F, -0.1319F, -0.0915F));

		PartDefinition cube_r491 = tail4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(132, 35).addBox(-0.5F, -0.6732F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.4488F, 12.2609F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r492 = tail4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(111, 67).addBox(-0.5F, -1.1504F, -2.2817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -5.4488F, 12.2609F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(94, 121).addBox(0.0F, 0.1791F, -1.7989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -3.3577F, 12.8346F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r494 = tail4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(118, 138).mirror().addBox(-0.462F, 0.2703F, 1.8107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4904F, -4.0181F, 3.1247F, 0.4537F, 0.0832F, -0.3065F));

		PartDefinition cube_r495 = tail4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-0.5115F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4904F, -4.0181F, 3.1247F, 0.0153F, 0.0963F, -0.3066F));

		PartDefinition cube_r496 = tail4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(130, 57).mirror().addBox(-0.462F, -2.5227F, -3.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(130, 52).mirror().addBox(-0.462F, -1.5227F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(53, 121).mirror().addBox(-0.462F, -0.4227F, -0.429F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4904F, -4.0181F, 3.1247F, 0.5846F, 0.0832F, -0.3065F));

		PartDefinition cube_r497 = tail4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(21, 85).addBox(-0.4885F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.0153F, -0.0963F, 0.3066F));

		PartDefinition cube_r498 = tail4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(130, 57).addBox(-0.5381F, -2.5227F, -3.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(130, 52).addBox(-0.5381F, -1.5227F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(53, 121).addBox(-0.5381F, -0.4227F, -0.429F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.5846F, -0.0832F, 0.3065F));

		PartDefinition cube_r499 = tail4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(118, 138).addBox(-0.5381F, 0.2703F, 1.8107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.4537F, -0.0832F, 0.3065F));

		PartDefinition cube_r500 = tail4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(132, 31).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.9488F, 9.5609F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(86, 104).addBox(0.0F, 0.1791F, -1.7989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -3.1577F, 9.9346F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(59, 86).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.9339F, 7.9237F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(13, 103).addBox(0.0F, -1.9209F, 0.0011F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.713F, 7.0226F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(147, 149).addBox(0.5F, -2.9555F, 2.4128F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.413F, 6.9226F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(51, 149).addBox(0.5F, -2.6523F, 0.4027F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.413F, 6.9226F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(60, 149).addBox(0.0F, -2.4F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.323F, 5.8303F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(122, 79).addBox(0.0F, 3.4F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 91).addBox(0.0F, 2.3F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(149, 127).addBox(0.0F, 0.3F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 149).addBox(0.0F, -0.8F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 149).addBox(0.0F, -2.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8658F, 1.2364F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(63, 149).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.513F, 2.3226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(64, 28).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(0, 48).addBox(-0.5F, -5.5547F, 1.0098F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.1792F, 11.1139F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r509 = tail5.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(145, 89).addBox(0.0F, -5.8F, 10.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 83).addBox(0.0F, -5.4F, 7.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 74).addBox(0.0F, -4.6F, 5.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 120).addBox(0.0F, -4.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 41).addBox(0.0F, -3.4F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 149).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, -0.0375F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail5.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(121, 62).addBox(0.0F, 10.4F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 151).addBox(0.0F, 9.3F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 131).addBox(0.0F, 7.1F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 121).addBox(0.0F, 6.1F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 130).addBox(0.0F, 4.8F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.045F, -9.8775F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail5.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5F, -1.1694F, -1.2598F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F))
				.texOffs(133, 111).addBox(-0.5F, -1.1832F, -2.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.8987F, 12.3779F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail5.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(102, 112).addBox(-0.5F, -1.6861F, -1.4029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.8987F, 12.3779F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail5.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(133, 75).addBox(-0.5F, -1.2996F, -2.4985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(122, 118).addBox(-0.5F, -1.2858F, -1.3098F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -4.9806F, 9.2525F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail5.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(112, 13).addBox(-0.5F, -1.6341F, -1.2873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.9806F, 9.2525F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r515 = tail5.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(0, 133).addBox(-0.5F, -0.7996F, -2.5985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.7806F, 6.3525F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail5.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, -1.6341F, -1.2873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.7806F, 6.3525F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail5.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(102, 120).addBox(-0.5F, -1.1858F, -1.2098F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -4.7806F, 6.3525F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail5.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(85, 120).addBox(0.0F, 0.1791F, -2.7989F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, -2.9786F, 4.5208F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail5.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(111, 85).addBox(-0.5F, -1.1504F, -2.2817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -5.7696F, 3.947F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail5.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(55, 132).addBox(-0.5F, -0.6732F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.7696F, 3.947F, -1.9199F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(92, 85).addBox(-0.5F, -0.1689F, -0.2745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0515F, 11.2098F, -0.0331F, -0.045F, -0.0402F));

		PartDefinition cube_r521 = tail6.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(133, 145).addBox(0.0F, -4.3055F, 4.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 132).addBox(0.0F, -4.4055F, 6.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 145).addBox(0.0F, -4.2055F, 2.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 117).addBox(0.0F, -4.0055F, 0.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 0.7255F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail6.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(128, 151).addBox(0.0F, 14.0F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 151).addBox(0.0F, 12.8F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 151).addBox(0.0F, 11.6F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9935F, -21.0872F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail6.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(134, 18).addBox(-0.5F, -1.314F, -2.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.7978F, 7.2758F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail6.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(9, 121).addBox(-0.5F, -1.5657F, -1.4886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.7978F, 7.2758F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail6.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(86, 109).addBox(-0.5F, -1.3793F, -0.6439F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -4.7978F, 7.2758F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail6.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(123, 13).addBox(-0.5F, -1.1694F, -1.2598F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(134, 6).addBox(-0.5F, -1.1832F, -2.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.7502F, 4.0682F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail6.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(11, 113).addBox(-0.5F, -1.6861F, -1.4029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.7502F, 4.0682F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail8 = tail6.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(89, 44).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.4311F, 7.7255F, 0.0436F, 0.0019F, -0.0436F));

		PartDefinition cube_r528 = tail8.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(150, 37).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r529 = tail8.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(31, 150).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r530 = tail8.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(28, 150).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r531 = tail8.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(151, 136).addBox(0.0F, 17.7F, 29.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 151).addBox(0.0F, 16.6F, 27.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 151).addBox(0.0F, 15.2F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.5624F, -28.8127F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r532 = tail8.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(121, 44).addBox(-0.5F, -1.5657F, -1.6886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.529F, 8.7503F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r533 = tail8.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(119, 134).addBox(-0.5F, -1.314F, -2.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.529F, 8.7503F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r534 = tail8.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(112, 134).addBox(-0.5F, -1.314F, -2.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.729F, 5.7503F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r535 = tail8.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(44, 121).addBox(-0.5F, -1.5657F, -1.4886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.729F, 5.7503F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r536 = tail8.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(18, 121).addBox(-0.5F, -1.5657F, -1.4886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -5.029F, 2.7503F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r537 = tail8.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(93, 95).addBox(-0.5F, -7.2793F, -0.5439F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -5.029F, 2.7503F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r538 = tail8.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(134, 62).addBox(-0.5F, -1.314F, -2.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -5.029F, 2.7503F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r539 = tail8.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(25, 150).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail7 = tail8.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1039F, 8.1241F, -0.0195F, -0.1312F, -0.0578F));

		PartDefinition cube_r540 = tail7.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(132, 39).addBox(0.0F, -3.1209F, 5.5405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 151).addBox(0.0F, -3.0208F, 3.5405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.95F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail7.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(151, 54).addBox(0.0F, -1.7264F, 0.1071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5443F, 2.788F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail7.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(86, 138).addBox(0.0F, -1.7695F, -0.1026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.95F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r543 = tail7.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(138, 117).addBox(-0.5F, -1.0139F, -0.8039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.325F, 9.2262F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail7.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(124, 112).addBox(-0.5F, -0.5657F, -2.3886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.325F, 9.2262F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail7.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(121, 50).addBox(-0.5F, -0.9657F, -2.3886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.525F, 6.4262F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail7.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(111, 138).addBox(-0.5F, -1.0139F, -1.2039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.525F, 6.4262F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r547 = tail7.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(130, 47).addBox(-0.5F, -1.1657F, -0.8886F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.925F, 3.6262F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail7.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(116, 129).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.3072F, 2.8837F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail7.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(138, 83).addBox(-0.5F, -1.314F, -1.7039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.925F, 3.6262F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail7.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(95, 109).addBox(-0.5F, -6.5793F, 0.1561F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.525F, 3.6262F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail7.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(151, 139).addBox(0.0F, 20.1F, 33.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 151).addBox(0.0F, 18.9F, 31.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6663F, -36.9368F, 0.6021F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 157, 157);
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