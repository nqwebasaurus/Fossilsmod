package fossils.fossils.client.blockentity.model.mourasuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MourasuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart body5;
	private final ModelPart body3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
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

	public MourasuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.body5 = this.body2.getChild("body5");
		this.body3 = this.body5.getChild("body3");
		this.frontleftleg = this.body3.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.body3.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.bone2 = this.body3.getChild("bone2");
		this.bone4 = this.body3.getChild("bone4");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 2.4F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -18.6131F, 17.5269F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 61).mirror().addBox(-0.5F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(42, 89).addBox(2.5F, -3.9176F, 2.7432F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 61).addBox(3.5F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(39, 33).addBox(1.5F, -0.5176F, -0.2568F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -4.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-7.1F, 0.25F, -0.7F, 8.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.6317F, -4.6939F, -0.1332F, -0.0419F, -0.3026F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.9F, 0.25F, -0.7F, 8.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.6317F, -4.6939F, -0.1332F, 0.0419F, 0.3026F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 143).addBox(0.0F, -2.1F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6652F, 4.9014F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 99).addBox(0.0F, -2.8F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0097F, 1.9196F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 97).addBox(0.5F, -3.6176F, -0.2568F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -4.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -0.056F, -0.0819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(143, 48).addBox(0.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.4187F, 3.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(113, 152).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 3.2329F, -3.7216F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(156, 63).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 2.2912F, -3.664F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(91, 152).addBox(0.0F, 0.0639F, -0.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 1.76F, -2.1795F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 139).addBox(0.0F, -0.3361F, -0.0007F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.4F, -0.0888F, -2.5559F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(142, 92).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -0.9879F, -0.3306F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(130, 128).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -0.7096F, 1.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 152).addBox(-1.0778F, -2.4957F, 4.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -2.4906F, 0.1017F, 0.5075F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(155, 153).addBox(-1.0778F, -2.9794F, 4.7318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -2.796F, 0.1017F, 0.5075F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(151, 67).addBox(-1.0691F, -0.593F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -1.0592F, 0.0958F, 0.5177F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(155, 144).addBox(-1.0691F, -0.1799F, -1.1108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -0.2302F, 0.0958F, 0.5177F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(151, 63).addBox(-1.0696F, 1.0976F, -0.7922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -0.623F, 0.0989F, 0.5127F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(150, 145).addBox(-1.0778F, 3.1127F, -0.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -0.754F, 0.1017F, 0.5075F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(133, 150).addBox(-1.0778F, 3.0458F, -1.0524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -0.5358F, 0.1017F, 0.5075F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(128, 150).addBox(-1.0778F, 3.5396F, 1.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -1.2776F, 0.1017F, 0.5075F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(108, 150).addBox(-1.0778F, -0.1514F, 5.1622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2446F, 4.7532F, -2.5002F, -2.0194F, 0.1017F, 0.5075F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 143).addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9F, 1.9051F, 2.2204F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(142, 135).addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 2.1044F, 1.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(128, 107).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9F, 3.9086F, 0.9305F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(109, 142).addBox(-0.825F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.9F, 3.8886F, -2.8773F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(103, 150).addBox(-1.0F, 2.2813F, 0.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(98, 150).addBox(-1.0F, 2.2813F, 1.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, -0.2793F, 0.0F, 0.48F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(150, 85).addBox(-1.0F, 2.746F, 1.6276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, -0.0611F, 0.0F, 0.48F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(150, 73).addBox(-1.0F, 3.3247F, -1.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, 0.637F, 0.0F, 0.48F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 155).addBox(-1.0F, 2.7056F, -2.4922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, 1.117F, 0.0F, 0.48F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 116).addBox(-1.0F, 1.7174F, -2.0754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, 0.7243F, 0.0F, 0.48F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 150).addBox(-1.0F, -0.0111F, -0.1408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(57, 150).addBox(-1.0F, -0.6111F, -0.5408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, 0.1571F, 0.0F, 0.48F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(147, 149).addBox(-1.0F, 1.2227F, -0.197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 5.5604F, -0.7243F, -0.1047F, 0.0F, 0.48F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(130, 68).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 4.0441F, -0.7641F, -0.4102F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -0.056F, -0.0819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(143, 48).mirror().addBox(-1.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4187F, 3.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(113, 152).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.2329F, -3.7216F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(156, 63).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.2912F, -3.664F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(91, 152).mirror().addBox(-1.0F, 0.0639F, -0.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.76F, -2.1795F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 139).mirror().addBox(-1.0F, -0.3361F, -0.0007F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0888F, -2.5559F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(142, 92).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9879F, -0.3306F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(130, 128).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7096F, 1.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 152).mirror().addBox(0.0778F, -2.4957F, 4.5576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -2.4906F, -0.1017F, -0.5075F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(155, 153).mirror().addBox(0.0778F, -2.9794F, 4.7318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -2.796F, -0.1017F, -0.5075F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(151, 67).mirror().addBox(0.0691F, -0.593F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -1.0592F, -0.0958F, -0.5177F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(155, 144).mirror().addBox(0.0691F, -0.1799F, -1.1108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -0.2302F, -0.0958F, -0.5177F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(151, 63).mirror().addBox(0.0696F, 1.0976F, -0.7922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -0.623F, -0.0989F, -0.5127F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(150, 145).mirror().addBox(0.0778F, 3.1127F, -0.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -0.754F, -0.1017F, -0.5075F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(133, 150).mirror().addBox(0.0778F, 3.0458F, -1.0524F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -0.5358F, -0.1017F, -0.5075F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(128, 150).mirror().addBox(0.0778F, 3.5396F, 1.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -1.2776F, -0.1017F, -0.5075F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 150).mirror().addBox(0.0778F, -0.1514F, 5.1622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, 4.7532F, -2.5002F, -2.0194F, -0.1017F, -0.5075F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 143).mirror().addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.9051F, 2.2204F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(142, 135).mirror().addBox(-0.5F, -1.0F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.1044F, 1.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(128, 107).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.9086F, 0.9305F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(109, 142).mirror().addBox(-0.175F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.8886F, -2.8773F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(103, 150).mirror().addBox(0.0F, 2.2813F, 0.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(98, 150).mirror().addBox(0.0F, 2.2813F, 1.6163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, -0.2793F, 0.0F, -0.48F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(150, 85).mirror().addBox(0.0F, 2.746F, 1.6276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, -0.0611F, 0.0F, -0.48F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(150, 73).mirror().addBox(0.0F, 3.3247F, -1.0378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, 0.637F, 0.0F, -0.48F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 155).mirror().addBox(0.0F, 2.7056F, -2.4922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, 1.117F, 0.0F, -0.48F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(22, 116).mirror().addBox(0.0F, 1.7174F, -2.0754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, 0.7243F, 0.0F, -0.48F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 150).mirror().addBox(0.0F, -0.0111F, -0.1408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(57, 150).mirror().addBox(0.0F, -0.6111F, -0.5408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, 0.1571F, 0.0F, -0.48F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(147, 149).mirror().addBox(0.0F, 1.2227F, -0.197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.5604F, -0.7243F, -0.1047F, 0.0F, -0.48F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(130, 68).mirror().addBox(-0.5F, -0.6F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.0441F, -0.7641F, -0.4102F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 3.877F, -0.6722F, 0.2857F, -0.3272F, -1.4858F));

		PartDefinition cube_r63 = backleftleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(142, 119).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, -1.037F, 0.0506F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r64 = backleftleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(30, 153).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r65 = backleftleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 153).addBox(-0.5F, 1.4F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r66 = backleftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 150).addBox(-0.5F, -0.975F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0169F, 5.6207F, 0.9797F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r67 = backleftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(152, 149).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 5.6207F, 0.9797F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r68 = backleftleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(123, 152).addBox(-0.5F, -6.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = backleftleg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(118, 152).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(143, 139).addBox(-0.5189F, -0.2398F, -0.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5489F, 7.7185F, 1.9453F, 1.1762F, 0.6054F, 0.2413F));

		PartDefinition cube_r70 = backleftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(108, 133).addBox(-0.7F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.721F, 4.6953F, -0.119F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r71 = backleftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(15, 150).addBox(-0.65F, -2.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0189F, 5.3602F, -0.1193F, 0.0F, 0.0F, 0.0873F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create().texOffs(121, 75).addBox(-1.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0259F, 6.2348F, -0.1452F, 1.2638F, -0.1137F, 0.1637F));

		PartDefinition cube_r72 = backleftleg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(117, 68).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3685F, 0.6135F, -0.0664F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r73 = backleftleg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 128).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1685F, 0.6135F, -3.1841F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r74 = backleftleg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 114).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 0.6135F, -3.1058F, 0.0F, -0.1309F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = backleftleg4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 134).addBox(0.1F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1F, 0.5F, -1.3F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r76 = backleftleg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(113, 133).addBox(-0.3484F, -0.5F, -2.9619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8502F, 0.5F, 1.1844F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r77 = backleftleg4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(115, 122).addBox(-0.9471F, -0.5F, -3.4908F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1932F, 0.5F, -0.6956F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r78 = backleftleg4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 115).addBox(0.0529F, -0.5F, -5.0908F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.02F, 0.5F, 0.0854F, 0.0F, -0.3927F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 3.877F, -0.6722F, 0.2857F, 0.3272F, 1.4858F));

		PartDefinition cube_r79 = backrightleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(142, 123).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, -1.037F, 0.0506F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backrightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(146, 154).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r81 = backrightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(141, 154).addBox(-0.5F, 1.4F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0169F, -2.2169F, 0.9767F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backrightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 150).addBox(-0.5F, -0.975F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0169F, 5.6207F, 0.9797F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backrightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(154, 133).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 5.6207F, 0.9797F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backrightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(133, 154).addBox(-0.5F, -6.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0169F, 7.2469F, 0.1488F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r85 = backrightleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(128, 154).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(148, 139).addBox(-0.4811F, -0.2398F, -0.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5489F, 7.7185F, 1.9453F, 1.1762F, -0.6054F, -0.2413F));

		PartDefinition cube_r86 = backrightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(137, 121).addBox(-0.3F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.721F, 4.6953F, -0.119F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r87 = backrightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(42, 150).addBox(-0.35F, -2.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0189F, 5.3602F, -0.1193F, 0.0F, 0.0F, -0.0873F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(0, 122).addBox(0.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0259F, 6.2348F, -0.1452F, 1.2638F, 0.1137F, -0.1637F));

		PartDefinition cube_r88 = backrightleg3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(119, 53).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3685F, 0.6135F, -0.0664F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r89 = backrightleg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(128, 81).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1685F, 0.6135F, -3.1841F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r90 = backrightleg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 114).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5628F, 0.6135F, -3.1058F, 0.0F, 0.1309F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r91 = backrightleg4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(137, 130).addBox(-1.1F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1F, 0.5F, -1.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r92 = backrightleg4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(137, 106).addBox(-0.6516F, -0.5F, -2.9619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.8502F, 0.5F, 1.1844F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r93 = backrightleg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 128).addBox(-0.0529F, -0.5F, -3.4908F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1932F, 0.5F, -0.6956F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r94 = backrightleg4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(116, 35).addBox(-1.0529F, -0.5F, -5.0908F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.02F, 0.5F, 0.0854F, 0.0F, 0.3927F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -4.9F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-7.0F, 0.2F, -1.3F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.9301F, -9.9485F, -0.0666F, -0.021F, -0.3047F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, 0.2F, -1.3F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9301F, -9.9485F, -0.0666F, 0.021F, 0.3047F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(88, 138).addBox(0.0F, -3.3F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.041F, -2.0457F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 144).addBox(0.0F, -3.1F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2155F, -4.9986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(36, 144).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.594F, -7.9897F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 33).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.6005F, -9.8782F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 78).addBox(-1.0F, -0.4F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1505F, -9.9782F, 0.0528F, -0.1307F, -0.0069F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-13.3036F, -3.6003F, 0.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.2582F, 0.4808F, -1.0436F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(146, 83).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.4936F, 0.2311F, -0.3943F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(154, 46).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.5408F, 0.0127F, -0.0129F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-11.3036F, -3.6003F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.2069F, 0.4265F, -1.0979F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 46).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.4221F, 0.216F, -0.4419F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 125).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.4706F, 0.0251F, -0.046F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(150, 77).mirror().addBox(-5.3036F, -3.6003F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.226F, 0.4959F, -1.1207F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(120, 14).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.4798F, 0.2605F, -0.4595F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(151, 4).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.5394F, 0.0449F, -0.0749F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-7.0F, 0.0F, 5.4F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.4282F, -14.0354F, 0.025F, 0.0079F, -0.3053F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(41, 23).addBox(-1.0F, 0.0F, 5.4F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.4282F, -14.0354F, 0.025F, -0.0079F, 0.3053F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(151, 4).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.5394F, -0.0449F, 0.0749F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(120, 14).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.4798F, -0.2605F, 0.4595F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(150, 77).addBox(3.3036F, -3.6003F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.226F, -0.4959F, 1.1207F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 125).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.4706F, -0.0251F, 0.046F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 46).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.4221F, -0.216F, 0.4419F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(74, 29).addBox(3.3036F, -3.6003F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.2069F, -0.4265F, 1.0979F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(154, 46).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.5408F, -0.0127F, 0.0129F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(146, 83).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.4936F, -0.2311F, 0.3943F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(93, 39).addBox(3.3036F, -3.6003F, 0.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.2582F, -0.4808F, 1.0436F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(16, 139).addBox(0.0F, -2.9F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.32F, -0.9721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(51, 144).addBox(0.0F, -2.9546F, 6.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3282F, -11.0075F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 144).addBox(0.0F, -2.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4771F, -6.9701F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 100).addBox(-2.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.2F, -8.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(121, 81).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.3486F, 0.0163F, -0.0314F));

		PartDefinition cube_r125 = body5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(153, 111).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3835F, 0.0174F, -0.0308F));

		PartDefinition cube_r126 = body5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(145, 46).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3436F, 0.1747F, -0.4402F));

		PartDefinition cube_r127 = body5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(-13.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.1681F, 0.3468F, -1.0955F));

		PartDefinition cube_r128 = body5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(145, 90).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.3116F, 0.1598F, -0.4455F));

		PartDefinition cube_r129 = body5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-12.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.1513F, 0.3157F, -1.101F));

		PartDefinition cube_r130 = body5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-7.0F, 0.0F, 0.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.6282F, -6.0354F, 0.025F, 0.0079F, -0.3053F));

		PartDefinition cube_r131 = body5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6282F, -6.0354F, 0.025F, -0.0079F, 0.3053F));

		PartDefinition cube_r132 = body5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(100, 79).addBox(3.3036F, -3.6003F, -1.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.1513F, -0.3157F, 1.101F));

		PartDefinition cube_r133 = body5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(145, 90).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.3116F, -0.1598F, 0.4455F));

		PartDefinition cube_r134 = body5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 41).addBox(3.3036F, -3.6003F, -1.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.1681F, -0.3468F, 1.0955F));

		PartDefinition cube_r135 = body5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(145, 46).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3436F, -0.1747F, 0.4402F));

		PartDefinition cube_r136 = body5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(153, 111).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3835F, -0.0174F, 0.0308F));

		PartDefinition cube_r137 = body5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 147).addBox(0.0F, -2.4546F, 0.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6067F, -6.0065F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 149).addBox(0.0F, -2.7296F, 0.0321F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5282F, -3.0075F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(121, 81).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.3486F, -0.0163F, 0.0314F));

		PartDefinition body3 = body5.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.05F, -6.0F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(151, 101).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.2962F, 0.0134F, -0.0147F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 121).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.2644F, 0.1359F, -0.4349F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(121, 66).mirror().addBox(-9.7201F, 1.3952F, -0.7875F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 9.4363F, -7.6257F, 0.2469F, 0.5686F, 0.3142F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(128, 119).mirror().addBox(-4.9218F, 0.0401F, -0.7875F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 9.4363F, -7.6257F, 0.0606F, 0.6118F, -0.0184F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(106, 68).mirror().addBox(-8.2637F, 1.1868F, -0.4854F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 8.6363F, -9.6257F, 0.2226F, 0.5714F, 0.4212F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(129, 5).mirror().addBox(-4.4256F, -0.0344F, -0.4854F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 8.6363F, -9.6257F, 0.0359F, 0.6078F, 0.0875F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-11.1836F, 1.2849F, -0.2579F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 9.9363F, -5.9257F, 0.2819F, 0.5977F, 0.2409F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(129, 19).mirror().addBox(-4.3757F, 0.082F, -0.2579F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 9.9363F, -5.9257F, 0.0829F, 0.649F, -0.0978F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(-11.2267F, 1.4495F, -0.4493F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 10.7363F, -3.9257F, 0.3269F, 0.7037F, 0.3725F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(129, 21).mirror().addBox(-4.4625F, 0.2283F, -0.4493F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 10.7363F, -3.9257F, 0.0788F, 0.7608F, 0.0038F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-12.3036F, -3.6003F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.25F, -2.5F, 0.1278F, 0.2683F, -1.0903F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-11.3036F, -3.6003F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.1265F, 0.2786F, -1.1074F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(141, 44).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.2697F, 0.1449F, -0.4509F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(151, 127).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.35F, -5.5F, 0.3047F, 0.0194F, -0.0313F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-9.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.1688F, 0.3852F, -1.1451F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(141, 63).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.368F, 0.2048F, -0.4854F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(153, 79).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.4175F, 0.0355F, -0.0798F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(81, 153).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.5045F, 0.0423F, -0.0764F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(133, 104).mirror().addBox(-8.3036F, -3.6003F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.209F, 0.4644F, -1.1285F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(141, 88).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.4476F, 0.2448F, -0.4676F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(41, 12).mirror().addBox(-6.8F, -0.8F, -3.7F, 7.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.95F, -5.0F, 0.0499F, 0.0157F, -0.305F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(101, 8).mirror().addBox(-4.0F, 0.0F, -3.6F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.24F, -9.0207F, 0.175F, 0.0548F, -0.3006F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(153, 107).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.006F, -13.0068F, 0.461F, 0.0389F, -0.0781F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(142, 101).mirror().addBox(-6.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.006F, -13.0068F, 0.1885F, 0.4249F, -1.1373F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(142, 127).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.006F, -13.0068F, 0.4076F, 0.225F, -0.4769F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(153, 129).mirror().addBox(-5.3036F, -3.6003F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2061F, -15.0068F, 0.2526F, 0.5429F, -1.1074F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(146, 71).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2061F, -15.0068F, 0.5287F, 0.2834F, -0.4464F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(153, 131).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2061F, -15.0068F, 0.5916F, 0.0488F, -0.0724F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(132, 46).mirror().addBox(-4.3936F, 0.0494F, -0.5087F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 11.5363F, -1.9257F, 0.0792F, 0.8393F, -0.118F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(101, 14).mirror().addBox(-12.2098F, 1.2586F, -0.5087F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 11.5363F, -1.9257F, 0.367F, 0.7765F, 0.2774F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(132, 90).mirror().addBox(-5.0054F, 0.6159F, -0.6376F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 11.5363F, -0.4257F, 0.127F, 0.8775F, -0.0824F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(-13.6418F, 1.9717F, -0.6376F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 11.5363F, -0.4257F, 0.4288F, 0.7996F, 0.3206F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(75, 133).mirror().addBox(-5.0054F, 0.6159F, -0.6376F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 11.5363F, -0.4257F, 0.1701F, 1.0365F, -0.0444F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(-14.6418F, 1.9717F, -0.6376F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 11.5363F, -0.4257F, 0.5677F, 0.9332F, 0.4295F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(101, 8).addBox(-1.0F, 0.0F, -3.6F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.24F, -9.0207F, 0.175F, -0.0548F, 0.3006F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(41, 12).addBox(-0.2F, -0.8F, -3.7F, 7.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.95F, -5.0F, 0.0499F, -0.0157F, 0.305F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(99, 0).addBox(-1.4F, -3.2052F, 4.9433F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 11.4363F, -11.5257F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(105, 94).addBox(-1.4F, -3.5997F, -0.1204F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 11.4363F, -11.5257F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 83).addBox(-3.4F, -3.6521F, -4.6076F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4F, 11.4363F, -11.5257F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(153, 131).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2061F, -15.0068F, 0.5916F, -0.0488F, 0.0724F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(146, 71).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2061F, -15.0068F, 0.5287F, -0.2834F, 0.4464F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(153, 129).addBox(3.3036F, -3.6003F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2061F, -15.0068F, 0.2526F, -0.5429F, 1.1074F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(153, 107).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.006F, -13.0068F, 0.461F, -0.0389F, 0.0781F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -7.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(61, 144).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3551F, -2.9705F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(31, 139).addBox(-1.0F, -3.3F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2023F, -6.0071F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(26, 139).addBox(-1.0F, -3.6F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2093F, -11.8927F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(21, 139).addBox(-1.0F, -3.8F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(141, 88).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.4476F, -0.2448F, 0.4676F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(133, 104).addBox(3.3036F, -3.6003F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.209F, -0.4644F, 1.1285F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(81, 153).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.5045F, -0.0423F, 0.0764F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(153, 79).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.4175F, -0.0355F, 0.0798F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(141, 63).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.368F, -0.2048F, 0.4854F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(68, 46).addBox(3.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.1688F, -0.3852F, 1.1451F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(151, 127).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.3047F, -0.0194F, 0.0313F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(141, 44).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.2697F, -0.1449F, 0.4509F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(74, 31).addBox(3.3036F, -3.6003F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.35F, -5.5F, 0.1265F, -0.2786F, 1.1074F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(97, 27).addBox(3.3036F, -3.6003F, 0.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.1278F, -0.2683F, 1.0903F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(93, 43).addBox(4.6418F, 1.9717F, -0.6376F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7F, 11.5363F, -0.4257F, 0.5677F, -0.9332F, -0.4295F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(75, 133).addBox(0.0055F, 0.6159F, -0.6376F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7F, 11.5363F, -0.4257F, 0.1701F, -1.0365F, 0.0444F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(100, 81).addBox(4.6418F, 1.9717F, -0.6376F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7F, 11.5363F, -0.4257F, 0.4288F, -0.7996F, -0.3206F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(132, 90).addBox(0.0055F, 0.6159F, -0.6376F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7F, 11.5363F, -0.4257F, 0.127F, -0.8775F, 0.0824F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(101, 14).addBox(4.2098F, 1.2586F, -0.5087F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 11.5363F, -1.9257F, 0.367F, -0.7765F, -0.2774F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(132, 46).addBox(-0.6064F, 0.0494F, -0.5087F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 11.5363F, -1.9257F, 0.0792F, -0.8393F, 0.118F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(129, 21).addBox(-0.5375F, 0.2283F, -0.4493F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 10.7363F, -3.9257F, 0.0788F, -0.7608F, -0.0038F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(115, 90).addBox(4.2267F, 1.4495F, -0.4493F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 10.7363F, -3.9257F, 0.3269F, -0.7037F, -0.3725F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(129, 19).addBox(-0.6243F, 0.082F, -0.2579F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 9.9363F, -5.9257F, 0.0829F, -0.649F, 0.0978F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(83, 70).addBox(4.1836F, 1.2849F, -0.2579F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 9.9363F, -5.9257F, 0.2819F, -0.5977F, -0.2409F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(47, 158).addBox(-0.5F, -2.8F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.577F, -16.0238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(35, 155).addBox(-0.5F, -2.8F, 0.075F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3553F, -14.0665F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(129, 5).addBox(-0.5744F, -0.0344F, -0.4854F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4F, 8.6363F, -9.6257F, 0.0359F, -0.6078F, -0.0875F));

		PartDefinition cube_r211 = body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 68).addBox(4.2637F, 1.1868F, -0.4854F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4F, 8.6363F, -9.6257F, 0.2226F, -0.5714F, -0.4212F));

		PartDefinition cube_r212 = body3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(142, 127).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.006F, -13.0068F, 0.4076F, -0.225F, 0.4769F));

		PartDefinition cube_r213 = body3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(142, 101).addBox(3.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.006F, -13.0068F, 0.1885F, -0.4249F, 1.1373F));

		PartDefinition cube_r214 = body3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(128, 119).addBox(-0.0782F, 0.0401F, -0.7875F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 9.4363F, -7.6257F, 0.0606F, -0.6118F, 0.0184F));

		PartDefinition cube_r215 = body3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(121, 66).addBox(4.7201F, 1.3952F, -0.7875F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 9.4363F, -7.6257F, 0.2469F, -0.5686F, -0.3142F));

		PartDefinition cube_r216 = body3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(33, 121).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.2644F, -0.1359F, 0.4349F));

		PartDefinition cube_r217 = body3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(151, 101).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -2.5F, 0.2962F, -0.0134F, 0.0147F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(149, 96).addBox(-0.3536F, -0.1084F, -0.5754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6703F, 4.3015F, -10.1941F, 1.0051F, 0.222F, -0.701F));

		PartDefinition cube_r218 = frontleftleg.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(150, 42).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1464F, 5.3166F, 0.1746F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r219 = frontleftleg.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(30, 108).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 5.3166F, 0.1746F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r220 = frontleftleg.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(97, 119).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 0.3916F, -0.0754F, -0.7854F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2598F, 6.925F, -0.6143F, 0.1072F, 0.2459F, 0.0653F));

		PartDefinition cube_r221 = frontleftleg2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(25, 150).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0722F, 4.1923F, 0.18F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r222 = frontleftleg2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(149, 119).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r223 = frontleftleg2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(20, 150).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8199F, 2.1155F, 0.18F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r224 = frontleftleg2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(56, 144).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, 0.0873F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1171F, 5.855F, -0.0993F, 1.2529F, -0.282F, -0.076F));

		PartDefinition cube_r225 = frontleftleg3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(115, 108).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5797F, 0.0984F, -2.6117F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r226 = frontleftleg3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(20, 134).addBox(-1.6F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1268F, 0.0984F, -1.7839F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r227 = frontleftleg3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(115, 83).addBox(-0.8F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(122, 133).addBox(-1.4F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7088F, 0.0984F, -2.4393F, 0.0F, -0.0436F, 0.0F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(149, 133).addBox(-0.6464F, -0.1084F, -0.5754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6703F, 4.3015F, -10.1941F, 1.0051F, -0.222F, 0.701F));

		PartDefinition cube_r228 = frontrightleg.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(150, 48).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, 5.3166F, 0.1746F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r229 = frontrightleg.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(116, 142).addBox(-0.5F, -2.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 5.3166F, 0.1746F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r230 = frontrightleg.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(67, 121).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 0.3916F, -0.0754F, -0.7854F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2598F, 6.925F, -0.6143F, 0.1072F, -0.2459F, -0.0653F));

		PartDefinition cube_r231 = frontrightleg2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(52, 150).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0722F, 4.1923F, 0.18F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r232 = frontrightleg2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(142, 149).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r233 = frontrightleg2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(47, 150).addBox(-0.5F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8199F, 2.1155F, 0.18F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r234 = frontrightleg2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 149).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, -0.0873F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1171F, 5.855F, -0.0993F, 1.2529F, 0.282F, 0.076F));

		PartDefinition cube_r235 = frontrightleg3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(102, 116).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5797F, 0.0984F, -2.6117F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r236 = frontrightleg3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(138, 29).addBox(0.6F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1268F, 0.0984F, -1.7839F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r237 = frontrightleg3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(43, 116).addBox(-0.2F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(148, 60).addBox(-0.6F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7088F, 0.0984F, -2.4393F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -1.139F, -8.4157F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r238 = bone2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 155).addBox(-1.6276F, 0.1554F, 0.1576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(156, 92).addBox(-1.6276F, 1.1554F, 0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(20, 155).addBox(-1.6276F, -0.0446F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, -0.3491F));

		PartDefinition cube_r239 = bone2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(156, 66).addBox(-1.6276F, -1.5986F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(77, 144).addBox(-1.6276F, -1.0986F, -0.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, -0.3491F));

		PartDefinition cube_r240 = bone2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(131, 23).addBox(-0.5F, 0.6803F, -1.1475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.1073F, 8.2988F, -0.6915F, 0.2647F, 0.2499F, 0.9909F));

		PartDefinition cube_r241 = bone2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(131, 7).addBox(-0.5F, -0.0532F, -2.0675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1073F, 8.2988F, -0.6915F, 0.832F, 0.2499F, 0.9909F));

		PartDefinition cube_r242 = bone2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(153, 103).addBox(-0.5F, -1.8508F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.1073F, 8.2988F, -0.6915F, 0.352F, 0.2499F, 0.9909F));

		PartDefinition cube_r243 = bone2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(17, 108).addBox(-0.5F, -1.4255F, -0.8367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1073F, 8.2988F, -0.6915F, 1.7919F, 0.2499F, 0.9909F));

		PartDefinition cube_r244 = bone2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(36, 139).addBox(-1.6276F, -2.5251F, -2.5223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, -0.3491F));

		PartDefinition cube_r245 = bone2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(108, 123).addBox(-1.6276F, -1.4089F, -2.7732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 0.7679F, 0.0F, -0.3491F));

		PartDefinition bone4 = body3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -1.139F, -8.4157F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r246 = bone4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 155).mirror().addBox(0.6276F, 0.1554F, 0.1576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(156, 92).mirror().addBox(0.6276F, 1.1554F, 0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(20, 155).mirror().addBox(0.6276F, -0.0446F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, 0.3491F));

		PartDefinition cube_r247 = bone4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(156, 66).mirror().addBox(0.6276F, -1.5986F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(77, 144).mirror().addBox(0.6276F, -1.0986F, -0.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, 0.3491F));

		PartDefinition cube_r248 = bone4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(131, 23).mirror().addBox(-0.5F, 0.6803F, -1.1475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.1073F, 8.2988F, -0.6915F, 0.2647F, -0.2499F, -0.9909F));

		PartDefinition cube_r249 = bone4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(131, 7).mirror().addBox(-0.5F, -0.0532F, -2.0675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1073F, 8.2988F, -0.6915F, 0.832F, -0.2499F, -0.9909F));

		PartDefinition cube_r250 = bone4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(153, 103).mirror().addBox(-0.5F, -1.8508F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.1073F, 8.2988F, -0.6915F, 0.352F, -0.2499F, -0.9909F));

		PartDefinition cube_r251 = bone4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(17, 108).mirror().addBox(-0.5F, -1.4255F, -0.8367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.1073F, 8.2988F, -0.6915F, 1.7919F, -0.2499F, -0.9909F));

		PartDefinition cube_r252 = bone4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(36, 139).mirror().addBox(0.6276F, -2.5251F, -2.5223F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, 0.3491F));

		PartDefinition cube_r253 = bone4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(108, 123).mirror().addBox(0.6276F, -1.4089F, -2.7732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 0.7679F, 0.0F, 0.3491F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(115, 115).addBox(-1.0F, -1.7F, -3.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.1912F, -16.1284F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(56, 116).addBox(-0.5F, -2.9F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9078F, -3.6457F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(73, 114).addBox(-0.5F, -2.7F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6019F, -1.7436F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(153, 81).mirror().addBox(-1.6136F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3F, -2.7F, 0.6043F, 0.7289F, -0.6689F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(142, 5).mirror().addBox(-2.7941F, 0.2637F, -0.4398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4021F, -0.4914F, -1.4787F, 0.3884F, 0.7258F, -0.7994F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(93, 144).mirror().addBox(-0.9968F, -1.8044F, 3.1248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -3.264F, -4.8054F, 0.1327F, -0.0948F, -1.2212F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(121, 144).mirror().addBox(-2.078F, -2.1547F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -3.8215F, 1.7694F, 0.2212F, 0.1087F, -1.2283F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(7, 145).mirror().addBox(-0.6124F, -0.1583F, 3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -5.2747F, -4.8897F, -0.1604F, -0.0247F, 0.482F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(84, 145).mirror().addBox(-1.0407F, -0.6094F, 3.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -5.2747F, -4.8897F, -0.0366F, -0.1649F, -0.7035F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(143, 145).mirror().addBox(0.7369F, -0.6113F, -1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -3.8215F, 1.7694F, 0.2289F, 0.0622F, -0.7088F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(14, 146).mirror().addBox(0.0663F, -1.8324F, -0.9975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -3.8215F, 1.7694F, 0.1516F, -0.1843F, 0.4575F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(14, 146).addBox(-1.0663F, -1.8324F, -0.9975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -3.8215F, 1.7694F, 0.1516F, 0.1843F, -0.4575F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(143, 145).addBox(-1.7369F, -0.6113F, -1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -3.8215F, 1.7694F, 0.2289F, -0.0622F, 0.7088F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 145).addBox(0.0407F, -0.6094F, 3.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -5.2747F, -4.8897F, -0.0366F, 0.1649F, 0.7035F));

		PartDefinition cube_r267 = body4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(7, 145).addBox(-0.3876F, -0.1583F, 3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -5.2747F, -4.8897F, -0.1604F, 0.0247F, -0.482F));

		PartDefinition cube_r268 = body4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(121, 144).addBox(1.0781F, -2.1547F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -3.8215F, 1.7694F, 0.2212F, -0.1087F, 1.2283F));

		PartDefinition cube_r269 = body4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 144).addBox(-0.0032F, -1.8044F, 3.1248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -3.264F, -4.8054F, 0.1327F, 0.0948F, 1.2212F));

		PartDefinition cube_r270 = body4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(142, 5).addBox(-0.2059F, 0.2637F, -0.4398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4021F, -0.4914F, -1.4787F, 0.3884F, -0.7258F, 0.7994F));

		PartDefinition cube_r271 = body4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(153, 81).addBox(-0.3864F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.7F, 0.6043F, -0.7289F, 0.6689F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7045F, -3.388F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r272 = neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(153, 109).mirror().addBox(-1.7271F, -0.1303F, -0.8362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -2.3F, 0.9426F, 0.9173F, -0.5058F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(142, 97).mirror().addBox(-0.4884F, 0.08F, -0.035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.7616F, -2.7856F, -0.0445F, -0.0851F, 0.484F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(102, 142).mirror().addBox(-1.2373F, -0.4079F, -0.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -4.7616F, -2.7856F, 0.0633F, -0.08F, -0.7073F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(21, 146).mirror().addBox(-1.1458F, -1.8077F, 0.0753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -2.7509F, -2.7014F, 0.1325F, -0.0079F, -1.2165F));

		PartDefinition cube_r276 = neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(21, 146).addBox(0.1458F, -1.8077F, 0.0753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -2.7509F, -2.7014F, 0.1325F, 0.0079F, 1.2165F));

		PartDefinition cube_r277 = neck.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(102, 142).addBox(0.2373F, -0.4079F, -0.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.7616F, -2.7856F, 0.0633F, 0.08F, 0.7073F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(142, 97).addBox(-0.5116F, 0.08F, -0.035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -4.7616F, -2.7856F, -0.0445F, 0.0851F, -0.484F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(153, 109).addBox(-0.273F, -0.1303F, -0.8362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.3F, 0.9426F, -0.9173F, 0.5058F));

		PartDefinition cube_r280 = neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(67, 156).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1426F, -2.9292F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(76, 112).addBox(-1.5F, -0.85F, 5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(153, 113).mirror().addBox(-1.6834F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8573F, -0.0107F, -1.2155F, 1.0819F, 1.1142F, -0.4468F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(43, 114).mirror().addBox(-1.0F, -0.125F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.844F, -0.1398F, -3.436F, 0.869F, 0.8808F, -0.5442F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(-0.6723F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -5.2616F, -1.2856F, 0.1119F, -0.1649F, 0.4644F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(147, 7).mirror().addBox(-1.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -5.2616F, -1.2856F, 0.1957F, 0.0338F, -0.7104F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(147, 7).addBox(0.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -5.2616F, -1.2856F, 0.1957F, -0.0338F, 0.7104F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(147, 0).addBox(-0.3277F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -5.2616F, -1.2856F, 0.1119F, 0.1649F, -0.4644F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(43, 114).addBox(0.0F, -0.125F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.844F, -0.1398F, -3.436F, 0.869F, -0.8808F, 0.5442F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(153, 113).addBox(-0.3166F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8573F, -0.0107F, -1.2155F, 1.0819F, -1.1142F, 0.4468F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(81, 138).addBox(0.0F, -1.7F, -2.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7697F, -3.0294F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(44, 158).addBox(0.0F, -2.1F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.733F, -0.9297F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(93, 29).addBox(-1.5F, -0.85F, 2.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.3F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -2.5877F, -5.4261F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(128, 87).addBox(-4.3712F, -1.3515F, -4.3066F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(37, 0).addBox(-4.9712F, -1.0105F, -3.3399F, 6.0F, 1.0F, 10.0F, new CubeDeformation(-0.007F))
				.texOffs(83, 64).addBox(-5.3712F, -1.3515F, -3.3066F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7405F, 0.6593F, -28.8319F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(74, 8).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2307F, 1.7554F, -15.2445F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 74).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2307F, 1.6333F, -22.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(73, 119).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3693F, -1.8174F, -3.5628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 139).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3693F, -1.8958F, -4.4594F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(113, 138).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3693F, -1.8087F, -5.4556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(93, 141).addBox(-3.3712F, -2.3663F, -5.1816F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 85).addBox(-3.3712F, -1.5663F, -5.1816F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7405F, 0.6593F, -28.8319F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(156, 123).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -1.2056F, -28.731F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(44, 129).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.3485F, -25.9769F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(129, 35).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.7141F, -22.9993F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(33, 129).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.9233F, -20.0066F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(129, 14).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 1.028F, -17.0084F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(129, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.871F, -14.0125F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(119, 128).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.5574F, -11.029F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(128, 114).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.0663F, -8.0945F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(108, 128).addBox(-1.0F, -0.3871F, -2.5684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -1.3231F, -5.7723F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(23, 89).addBox(-1.7445F, -1.2473F, -4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6138F, 0.8006F, -4.7225F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(116, 42).addBox(-0.8F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(154, 89).addBox(-0.8F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3864F, 3.0328F, -7.8567F, 0.1737F, -0.0036F, -0.0151F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(159, 136).addBox(-0.8F, -0.4F, 3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(160, 9).addBox(-0.8F, -0.4F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 133).addBox(-0.8F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(160, 12).addBox(-0.8F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 118).addBox(-0.8F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4093F, 3.3774F, -12.8447F, 0.069F, -0.0036F, -0.0151F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(160, 15).addBox(-0.8F, -0.4F, 4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 95).addBox(-0.8F, -0.4F, 3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(160, 18).addBox(-0.8F, -0.4F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 89).addBox(-0.8F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(160, 21).addBox(-0.8F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 159).addBox(-0.8F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4242F, 2.9539F, -18.8298F, -0.0706F, -0.0036F, -0.0151F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(155, 86).addBox(-0.5F, -0.4F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 54).addBox(-0.5F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 115).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8881F, 2.6073F, -21.0596F, -0.1587F, 0.0999F, -0.0316F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(57, 154).addBox(4.3624F, -0.7291F, -1.8845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -1.6364F, 1.308F, -1.6371F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(154, 119).addBox(4.2131F, -0.5291F, -1.7187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -1.1723F, 1.2857F, -1.1557F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(154, 34).addBox(3.388F, -0.5291F, -2.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 154).addBox(3.388F, -0.6291F, -1.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.5058F, 1.0062F, -0.436F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(154, 30).addBox(2.4179F, -0.7291F, -2.6779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.2903F, 0.4374F, -0.1242F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(15, 155).addBox(1.7233F, -0.8291F, -2.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.265F, 0.1434F, -0.0372F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(10, 155).addBox(1.2411F, -1.0291F, -1.9188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.2629F, -0.0672F, 0.0197F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(160, 48).addBox(1.2411F, -0.2054F, -0.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.3501F, -0.0672F, 0.0197F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(75, 156).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.7423F, 2.3438F, -22.4305F, -0.2634F, 0.0999F, -0.0316F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(72, 138).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 2.7038F, -18.8201F, -0.1203F, 0.0212F, 0.1733F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(120, 92).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8618F, -18.594F, -0.1166F, 0.0367F, 0.3033F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(60, 158).addBox(-1.0F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1084F, 0.1488F, -23.1664F, -0.5614F, 1.2889F, -0.2591F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(157, 26).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -23.9586F, -0.0569F, 0.6544F, -0.0134F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(50, 158).addBox(0.0F, -0.0894F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8634F, 6.7066F, 0.1396F, 0.4363F, 0.0654F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(147, 30).addBox(0.0F, -0.219F, -2.9791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8634F, 6.7066F, 0.2705F, 0.4363F, 0.0654F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(158, 43).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8129F, 5.7046F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(147, 26).addBox(0.0F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3634F, 5.2066F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(47, 134).addBox(0.0F, -1.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 2.9956F, -15.7904F, -0.0688F, 0.0121F, 0.1741F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(106, 62).addBox(0.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1442F, -15.6609F, -0.0666F, 0.021F, 0.3047F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(11, 127).addBox(0.0F, -1.0F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 3.1541F, -12.7651F, -0.0344F, 0.0061F, 0.1744F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2994F, -12.7003F, -0.0333F, 0.0105F, 0.3053F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(127, 29).addBox(0.0F, -1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 3.1273F, -9.6934F, 0.0516F, -0.0086F, 0.1656F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(112, 29).addBox(0.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.274F, -9.7905F, 0.0499F, -0.0157F, 0.305F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(29, 134).addBox(0.0F, -1.0F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 2.8885F, -6.659F, 0.1031F, -0.0182F, 0.1736F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(120, 97).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0428F, -6.853F, 0.0999F, -0.0314F, 0.3039F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(38, 134).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 2.4058F, -3.6115F, 0.2063F, -0.0361F, 0.1708F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(104, 45).addBox(-0.7224F, -0.5F, -4.1966F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9256F, 2.9783F, 4.2672F, -0.1311F, 0.7026F, 0.3689F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(105, 101).addBox(-1.3239F, -0.5F, -2.8959F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9256F, 2.9783F, 4.2672F, -0.1869F, 1.0043F, 0.2956F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(147, 34).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5012F, 0.1214F, 5.225F, -1.5817F, -0.3042F, -1.3278F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(55, 158).addBox(-1.0F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 58).addBox(-1.0F, -0.4F, 1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.883F, -0.0423F, 5.1926F, -0.6217F, -0.3042F, -1.3278F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 134).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.2526F, 1.2175F, 8.0381F, -0.3613F, -0.5659F, -1.3244F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(133, 92).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7096F, 1.5737F, 8.0226F, -0.0123F, -0.5659F, -1.3244F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(94, 129).addBox(-1.0F, 1.6F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.883F, -0.0423F, 5.1926F, -0.0109F, -0.3042F, -1.3278F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(49, 106).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.883F, -0.1732F, 2.1955F, -0.0104F, -0.0424F, -1.3306F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 135).addBox(-0.475F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.883F, -0.1654F, 0.3447F, 0.0838F, 0.1129F, 0.2462F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(147, 22).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2461F, 1.3269F, 1.2344F, 0.075F, 0.6122F, 0.242F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(134, 65).addBox(-0.45F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.883F, -0.1654F, 0.3447F, 0.0833F, 0.0434F, 0.2403F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(76, 105).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5905F, -3.9974F, 0.2F, -0.0626F, 0.2992F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(148, 56).addBox(1.3208F, -1.6205F, -1.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.251F, -0.0588F, 0.0895F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(122, 136).addBox(-2.2F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8132F, 0.7625F, -20.8955F, 0.5697F, 0.7066F, -0.0683F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(121, 49).addBox(-4.8431F, -0.4373F, 0.9582F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0243F, 0.5415F, -25.0104F, -0.2157F, 0.7066F, -0.0683F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(155, 51).addBox(1.2601F, -1.6205F, 0.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.3721F, 0.8204F, -0.2037F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(51, 155).addBox(1.2672F, -1.6205F, 1.2172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -1.0483F, 1.2806F, -0.9552F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(94, 158).addBox(1.4956F, -1.6205F, 1.7963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -2.1206F, 1.2757F, -2.0661F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(80, 158).addBox(1.5392F, -1.6205F, 2.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -2.6212F, 1.0488F, -2.6061F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(141, 76).addBox(-2.8441F, -0.82F, -0.8016F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4837F, -0.117F, -27.898F, -2.8378F, 0.573F, -2.9123F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(148, 38).addBox(1.2139F, -1.273F, -1.1991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0098F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.1925F, -0.0312F, 0.1858F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(141, 73).addBox(-2.8314F, 0.0342F, -0.8266F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4837F, -0.117F, -27.898F, -3.0027F, 0.5811F, -3.029F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(155, 48).addBox(1.5427F, -1.273F, 2.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -2.7503F, 1.0456F, -2.6189F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(46, 155).addBox(1.4624F, -1.273F, 1.6794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -2.3311F, 1.3037F, -2.1694F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(41, 155).addBox(1.2004F, -1.273F, 1.1157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -1.0233F, 1.3449F, -0.8321F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(70, 158).addBox(1.1492F, -1.273F, 0.1394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.2983F, 0.8623F, -0.0496F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(148, 52).addBox(0.2567F, -1.273F, -0.0249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8712F, 1.9824F, -23.0596F, -0.2611F, 0.7364F, 0.0022F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(120, 102).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4037F, -21.4863F, -0.1833F, 0.0574F, 0.3002F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(139, 116).addBox(0.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 2.6089F, -1.0314F, -0.1231F, -0.0447F, -0.3463F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 148).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.6321F, 1.8362F, -22.1722F, -0.2071F, 0.4184F, 0.0926F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(147, 11).addBox(0.0F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5604F, 2.2255F, -21.8404F, -0.1891F, 0.0331F, 0.1714F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(67, 86).addBox(-1.0F, -1.5F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.8496F, 0.1099F, 0.2299F, -0.1206F, 0.2901F, -1.3734F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(158, 103).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7099F, 0.7174F, -0.9761F, -0.0732F, 0.217F, -1.2213F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(158, 100).addBox(-1.0F, -0.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8984F, -0.1835F, 0.3249F, -0.1049F, 0.296F, -1.3191F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(154, 0).addBox(-0.075F, -0.025F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4943F, 2.2095F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(99, 158).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8984F, -0.1835F, 0.3249F, -0.4103F, 0.296F, -1.3191F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(11, 133).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -0.4856F, 0.3167F, 0.0173F, 0.3131F, -0.9167F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(134, 48).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -0.4856F, 0.3167F, 0.2657F, 0.1685F, 0.0456F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, -1.3231F, -5.7723F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(116, 42).mirror().addBox(-0.2F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(154, 89).mirror().addBox(-0.2F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.3864F, 3.0328F, -7.8567F, 0.1737F, 0.0036F, 0.0151F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(159, 136).mirror().addBox(-0.2F, -0.4F, 3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(160, 9).mirror().addBox(-0.2F, -0.4F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 133).mirror().addBox(-0.2F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(160, 12).mirror().addBox(-0.2F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 118).mirror().addBox(-0.2F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4093F, 3.3774F, -12.8447F, 0.069F, 0.0036F, 0.0151F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(160, 15).mirror().addBox(-0.2F, -0.4F, 4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 95).mirror().addBox(-0.2F, -0.4F, 3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(160, 18).mirror().addBox(-0.2F, -0.4F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 89).mirror().addBox(-0.2F, -0.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(160, 21).mirror().addBox(-0.2F, -0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 159).mirror().addBox(-0.2F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4242F, 2.9539F, -18.8298F, -0.0706F, 0.0036F, 0.0151F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(155, 86).mirror().addBox(-0.5F, -0.4F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 54).mirror().addBox(-0.5F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 115).mirror().addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8881F, 2.6073F, -21.0596F, -0.1587F, -0.0999F, 0.0316F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(57, 154).mirror().addBox(-5.3624F, -0.7291F, -1.8845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -1.6364F, -1.308F, 1.6371F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(154, 119).mirror().addBox(-5.2131F, -0.5291F, -1.7187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -1.1723F, -1.2857F, 1.1557F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(154, 34).mirror().addBox(-4.388F, -0.5291F, -2.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 154).mirror().addBox(-4.388F, -0.6291F, -1.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.5058F, -1.0062F, 0.436F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(154, 30).mirror().addBox(-3.4179F, -0.7291F, -2.6779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.2903F, -0.4374F, 0.1242F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(15, 155).mirror().addBox(-2.7233F, -0.8291F, -2.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.265F, -0.1434F, 0.0372F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(10, 155).mirror().addBox(-2.2411F, -1.0291F, -1.9188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.2629F, 0.0672F, -0.0197F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(160, 48).mirror().addBox(-2.2411F, -0.2054F, -0.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.3501F, 0.0672F, -0.0197F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(75, 156).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.7423F, 2.3438F, -22.4305F, -0.2634F, -0.0999F, 0.0316F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(72, 138).mirror().addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 2.7038F, -18.8201F, -0.1203F, -0.0212F, -0.1733F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(120, 92).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8618F, -18.594F, -0.1166F, -0.0367F, -0.3033F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(60, 158).mirror().addBox(0.0F, 0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1084F, 0.1488F, -23.1664F, -0.5614F, -1.2889F, 0.2591F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(157, 26).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -23.9586F, -0.0569F, -0.6544F, 0.0134F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(50, 158).mirror().addBox(-1.0F, -0.0894F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8634F, 6.7066F, 0.1396F, -0.4363F, -0.0654F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(147, 30).mirror().addBox(-1.0F, -0.219F, -2.9791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8634F, 6.7066F, 0.2705F, -0.4363F, -0.0654F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(158, 43).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8129F, 5.7046F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(147, 26).mirror().addBox(-1.0F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3634F, 5.2066F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(47, 134).mirror().addBox(-1.0F, -1.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 2.9956F, -15.7904F, -0.0688F, -0.0121F, -0.1741F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(106, 62).mirror().addBox(-3.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1442F, -15.6609F, -0.0666F, -0.021F, -0.3047F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(11, 127).mirror().addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 3.1541F, -12.7651F, -0.0344F, -0.0061F, -0.1744F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-3.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2994F, -12.7003F, -0.0333F, -0.0105F, -0.3053F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(127, 29).mirror().addBox(-1.0F, -1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 3.1273F, -9.6934F, 0.0516F, 0.0086F, -0.1656F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(112, 29).mirror().addBox(-3.0F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.274F, -9.7905F, 0.0499F, 0.0157F, -0.305F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(29, 134).mirror().addBox(-1.0F, -1.0F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 2.8885F, -6.659F, 0.1031F, 0.0182F, -0.1736F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(120, 97).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0428F, -6.853F, 0.0999F, 0.0314F, -0.3039F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(38, 134).mirror().addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 2.4058F, -3.6115F, 0.2063F, 0.0361F, -0.1708F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(104, 45).mirror().addBox(-1.2776F, -0.5F, -4.1966F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9256F, 2.9783F, 4.2672F, -0.1311F, -0.7026F, -0.3689F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(105, 101).mirror().addBox(-0.6762F, -0.5F, -2.8959F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9256F, 2.9783F, 4.2672F, -0.1869F, -1.0043F, -0.2956F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(147, 34).mirror().addBox(0.0F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5012F, 0.1214F, 5.225F, -1.5817F, 0.3042F, 1.3278F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(55, 158).mirror().addBox(0.0F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 58).mirror().addBox(0.0F, -0.4F, 1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.883F, -0.0423F, 5.1926F, -0.6217F, 0.3042F, 1.3278F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(56, 134).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2526F, 1.2175F, 8.0381F, -0.3613F, 0.5659F, 1.3244F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(133, 92).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7096F, 1.5737F, 8.0226F, -0.0123F, 0.5659F, 1.3244F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(94, 129).mirror().addBox(0.0F, 1.6F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.883F, -0.0423F, 5.1926F, -0.0109F, 0.3042F, 1.3278F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(49, 106).mirror().addBox(0.0F, -0.4F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.883F, -0.1732F, 2.1955F, -0.0104F, 0.0424F, 1.3306F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(75, 135).mirror().addBox(-3.525F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.883F, -0.1654F, 0.3447F, 0.0838F, -0.1129F, -0.2462F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(147, 22).mirror().addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2461F, 1.3269F, 1.2344F, 0.075F, -0.6122F, -0.242F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(134, 65).mirror().addBox(-3.55F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.883F, -0.1654F, 0.3447F, 0.0833F, -0.0434F, -0.2403F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(76, 105).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5905F, -3.9974F, 0.2F, 0.0626F, -0.2992F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(148, 56).mirror().addBox(-2.3209F, -1.6205F, -1.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.251F, 0.0588F, -0.0895F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(122, 136).mirror().addBox(-1.8F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8132F, 0.7625F, -20.8955F, 0.5697F, -0.7066F, 0.0683F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(121, 49).mirror().addBox(0.8431F, -0.4373F, 0.9582F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0243F, 0.5415F, -25.0104F, -0.2157F, -0.7066F, 0.0683F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(155, 51).mirror().addBox(-2.2601F, -1.6205F, 0.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.3721F, -0.8204F, 0.2037F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(51, 155).mirror().addBox(-2.2672F, -1.6205F, 1.2172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -1.0483F, -1.2806F, 0.9552F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(94, 158).mirror().addBox(-2.4956F, -1.6205F, 1.7963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -2.1206F, -1.2757F, 2.0661F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(80, 158).mirror().addBox(-2.5392F, -1.6205F, 2.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -2.6212F, -1.0488F, 2.6061F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(141, 76).mirror().addBox(-0.1559F, -0.82F, -0.8016F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4837F, -0.117F, -27.898F, -2.8378F, -0.573F, 2.9123F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(148, 38).mirror().addBox(-2.2139F, -1.273F, -1.1991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0098F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.1925F, 0.0312F, -0.1858F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(141, 73).mirror().addBox(-0.1686F, 0.0342F, -0.8266F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4837F, -0.117F, -27.898F, -3.0027F, -0.5811F, 3.029F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(155, 48).mirror().addBox(-2.5427F, -1.273F, 2.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -2.7503F, -1.0456F, 2.6189F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(46, 155).mirror().addBox(-2.4624F, -1.273F, 1.6794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -2.3311F, -1.3037F, 2.1694F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(41, 155).mirror().addBox(-2.2004F, -1.273F, 1.1157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -1.0233F, -1.3449F, 0.8321F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(70, 158).mirror().addBox(-2.1492F, -1.273F, 0.1394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.2983F, -0.8623F, 0.0496F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(148, 52).mirror().addBox(-1.2567F, -1.273F, -0.0249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8712F, 1.9824F, -23.0596F, -0.2611F, -0.7364F, -0.0022F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(120, 102).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4037F, -21.4863F, -0.1833F, -0.0574F, -0.3002F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(139, 116).mirror().addBox(-3.0F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.6089F, -1.0314F, -0.1231F, 0.0447F, 0.3463F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(77, 148).mirror().addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.6321F, 1.8362F, -22.1722F, -0.2071F, -0.4184F, -0.0926F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(147, 11).mirror().addBox(-1.0F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5604F, 2.2255F, -21.8404F, -0.1891F, -0.0331F, -0.1714F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(67, 86).mirror().addBox(0.0F, -1.5F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8496F, 0.1099F, 0.2299F, -0.1206F, -0.2901F, 1.3734F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(158, 103).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7099F, 0.7174F, -0.9761F, -0.0732F, -0.217F, 1.2213F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(158, 100).mirror().addBox(0.0F, -0.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8984F, -0.1835F, 0.3249F, -0.1049F, -0.296F, 1.3191F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(154, 0).mirror().addBox(-0.925F, -0.025F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4943F, 2.2095F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 158).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8984F, -0.1835F, 0.3249F, -0.4103F, -0.296F, 1.3191F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(11, 133).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4856F, 0.3167F, 0.0173F, -0.3131F, 0.9167F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(134, 48).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4856F, 0.3167F, 0.2657F, -0.1685F, -0.0456F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 2.9549F, 3.9973F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(120, 7).mirror().addBox(-0.5F, -0.7F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2198F, 0.5185F, 0.3594F, -0.0361F, -0.082F, 0.0299F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(149, 92).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.4947F, 0.8184F, 3.5946F, 0.0511F, -0.082F, 0.0299F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(94, 136).mirror().addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3248F, -0.3254F, 1.9441F, -0.0361F, -0.082F, 0.0299F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(104, 158).mirror().addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5112F, 0.6058F, 3.8723F, 0.9936F, -0.082F, 0.0299F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(22, 121).mirror().addBox(-0.5F, -0.7F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.1554F, 1.4692F, -0.769F, -0.2979F, -0.082F, 0.0299F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(129, 141).mirror().addBox(-0.5F, -2.4F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0762F, 2.8038F, -2.219F, 0.0003F, -0.0869F, -0.0076F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(86, 119).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3868F, -3.002F, -8.4914F, -0.2543F, -0.082F, 0.0299F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(121, 42).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2177F, -1.8094F, -10.9815F, -0.1059F, -0.082F, 0.0299F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(48, 86).mirror().addBox(-0.5F, -2.4F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0683F, -0.5542F, -13.2561F, -0.2979F, -0.082F, 0.0299F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(-0.9981F, -0.9977F, 0.0435F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3625F, -3.2653F, -20.7905F, -0.3047F, -0.0166F, 0.0298F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.9981F, -1.1201F, -15.9515F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -0.5542F, -13.2561F, -0.3309F, -0.0166F, 0.0298F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(96, 84).mirror().addBox(-0.9981F, -1.9977F, -15.9565F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(146, 158).mirror().addBox(-0.9981F, -2.5977F, -15.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(160, 51).mirror().addBox(-0.9981F, -2.5977F, -14.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(158, 156).mirror().addBox(-0.9981F, -2.5977F, -13.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 0).mirror().addBox(-0.9981F, -2.5977F, -12.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(3, 159).mirror().addBox(-0.9981F, -2.5977F, -11.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 3).mirror().addBox(-0.9981F, -2.5977F, -10.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(8, 159).mirror().addBox(-0.9981F, -2.5977F, -9.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(13, 159).mirror().addBox(-0.9981F, -2.5977F, -8.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 70).mirror().addBox(-0.9981F, -1.9977F, -6.9565F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -0.5542F, -13.2561F, -0.296F, -0.0166F, 0.0298F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(91, 148).mirror().addBox(-0.4584F, -1.0606F, -1.9062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(114, 148).mirror().addBox(-0.4584F, -1.3606F, -1.9062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.4618F, -0.0139F, 0.0311F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(155, 57).mirror().addBox(-1.0512F, -0.9201F, -2.497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(155, 60).mirror().addBox(-1.0512F, -1.2376F, -2.5187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.5489F, -0.3045F, 0.2295F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-0.9981F, -3.0192F, -7.8277F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -0.5542F, -13.2561F, -0.1651F, -0.0166F, 0.0298F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(56, 121).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7015F, -2.1189F, -4.9843F, -0.5248F, -0.082F, 0.0299F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(126, 158).mirror().addBox(1.7158F, -0.5303F, -2.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.7672F, 0.5277F, -0.4603F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(158, 126).mirror().addBox(1.5919F, -0.5303F, 2.3007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -2.1449F, 0.7753F, -2.325F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(149, 124).mirror().addBox(-3.8304F, -0.5303F, 2.7765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -2.4978F, -0.0418F, 3.1019F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(30, 150).mirror().addBox(-3.7925F, -1.2189F, 2.7169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -2.6199F, -0.0479F, 3.1247F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(131, 158).mirror().addBox(1.5549F, -1.2189F, 2.2405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -2.2748F, 0.8593F, -2.4026F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(141, 158).mirror().addBox(1.6501F, -1.2189F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.6372F, 0.5797F, -0.3745F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(18, 159).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 159).mirror().addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 29).mirror().addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 32).mirror().addBox(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(159, 35).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8433F, -4.6289F, -19.4013F, -0.1738F, -0.0166F, 0.0298F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(70, 155).mirror().addBox(-0.9981F, -0.6977F, -0.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 71).mirror().addBox(-0.9981F, -0.6977F, -1.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 74).mirror().addBox(-0.9981F, -0.6977F, -2.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 155).mirror().addBox(-0.9981F, -0.6977F, -3.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 83).mirror().addBox(-0.9981F, -0.6977F, -4.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1331F, -6.9991F, -27.9085F, -0.3658F, -0.0166F, 0.0298F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(159, 139).mirror().addBox(-0.4584F, -1.9366F, -0.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(158, 159).mirror().addBox(-0.4584F, -2.1366F, -1.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.453F, -0.0139F, 0.0311F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(62, 154).mirror().addBox(-1.0636F, -2.4366F, -2.5135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.4803F, -0.3263F, 0.1899F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(96, 154).mirror().addBox(-2.1945F, -2.5366F, -2.7388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.6845F, -0.8063F, 0.5567F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(154, 96).mirror().addBox(-2.975F, -2.7366F, -3.1899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -0.923F, -0.9898F, 0.8594F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(101, 154).mirror().addBox(-3.77F, -3.0366F, -3.2748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -7.6542F, -33.0561F, -1.4245F, -1.1126F, 1.4323F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(160, 6).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.9506F, -3.7671F, -14.4773F, -0.2611F, -0.0166F, 0.0298F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.9981F, -0.7245F, -20.9242F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(116, 16).mirror().addBox(-0.9981F, -0.4245F, -20.9242F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, -0.5542F, -13.2561F, -0.3745F, -0.0166F, 0.0298F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(78, 127).mirror().addBox(-0.7995F, -0.9693F, -0.0171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9299F, 2.3736F, -0.1847F, 0.2955F, -0.082F, 0.0299F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(78, 127).addBox(-0.2005F, -0.9693F, -0.0171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.9299F, 2.3736F, -0.1847F, 0.2955F, 0.082F, -0.0299F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(149, 92).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.4947F, 0.8184F, 3.5946F, 0.0511F, 0.082F, -0.0299F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(104, 158).addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5112F, 0.6058F, 3.8723F, 0.9936F, 0.082F, -0.0299F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 136).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.3248F, -0.3254F, 1.9441F, -0.0361F, 0.082F, -0.0299F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(129, 141).addBox(-0.5F, -2.4F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0762F, 2.8038F, -2.219F, 0.0003F, 0.0869F, 0.0076F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(160, 6).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9506F, -3.7671F, -14.4773F, -0.2611F, 0.0166F, -0.0298F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(159, 35).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 32).addBox(-0.5F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 29).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 159).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 159).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8433F, -4.6289F, -19.4013F, -0.1738F, 0.0166F, -0.0298F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(13, 159).addBox(-0.0019F, -2.5977F, -8.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(8, 159).addBox(-0.0019F, -2.5977F, -9.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 3).addBox(-0.0019F, -2.5977F, -10.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(3, 159).addBox(-0.0019F, -2.5977F, -11.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 0).addBox(-0.0019F, -2.5977F, -12.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(158, 156).addBox(-0.0019F, -2.5977F, -13.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(160, 51).addBox(-0.0019F, -2.5977F, -14.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(146, 158).addBox(-0.0019F, -2.5977F, -15.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 84).addBox(-0.0019F, -1.9977F, -15.9565F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.008F))
				.texOffs(100, 70).addBox(-0.0019F, -1.9977F, -6.9565F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5683F, -0.5542F, -13.2561F, -0.296F, 0.0166F, -0.0298F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(101, 154).addBox(2.77F, -3.0366F, -3.2748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -1.4245F, 1.1126F, -1.4323F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(154, 96).addBox(1.975F, -2.7366F, -3.1899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.923F, 0.9898F, -0.8594F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(96, 154).addBox(1.1945F, -2.5366F, -2.7388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.6845F, 0.8063F, -0.5567F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(62, 154).addBox(0.0636F, -2.4366F, -2.5135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.4803F, 0.3263F, -0.1899F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(158, 159).addBox(-0.5416F, -2.1366F, -1.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(159, 139).addBox(-0.5416F, -1.9366F, -0.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.453F, 0.0139F, -0.0311F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(155, 83).addBox(-0.0019F, -0.6977F, -4.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 155).addBox(-0.0019F, -0.6977F, -3.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 74).addBox(-0.0019F, -0.6977F, -2.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 71).addBox(-0.0019F, -0.6977F, -1.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 155).addBox(-0.0019F, -0.6977F, -0.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1331F, -6.9991F, -27.9085F, -0.3658F, 0.0166F, -0.0298F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(116, 16).addBox(-0.0019F, -0.4245F, -20.9242F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F))
				.texOffs(116, 0).addBox(-0.0019F, -0.7245F, -20.9242F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -0.5542F, -13.2561F, -0.3745F, 0.0166F, -0.0298F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(114, 148).addBox(-0.5416F, -1.3606F, -1.9062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(91, 148).addBox(-0.5416F, -1.0606F, -1.9062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.4618F, 0.0139F, -0.0311F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(155, 60).addBox(0.0512F, -1.2376F, -2.5187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(155, 57).addBox(0.0512F, -0.9201F, -2.497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.5489F, 0.3045F, -0.2295F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(141, 158).addBox(-2.6501F, -1.2189F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.6372F, -0.5797F, 0.3745F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(131, 158).addBox(-2.5549F, -1.2189F, 2.2405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -2.2748F, -0.8593F, 2.4026F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(30, 150).addBox(1.7925F, -1.2189F, 2.7169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -2.6199F, 0.0479F, -3.1247F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(149, 124).addBox(1.8304F, -0.5303F, 2.7765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -2.4978F, 0.0418F, -3.1019F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(158, 126).addBox(-2.5919F, -0.5303F, 2.3007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -2.1449F, -0.7753F, 2.325F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(126, 158).addBox(-2.7158F, -0.5303F, -2.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -7.6542F, -33.0561F, -0.7672F, -0.5277F, 0.4603F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(86, 95).addBox(-0.0019F, -1.1201F, -15.9515F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -0.5542F, -13.2561F, -0.3309F, 0.0166F, -0.0298F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(97, 17).addBox(-0.0019F, -3.0192F, -7.8277F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5683F, -0.5542F, -13.2561F, -0.1651F, 0.0166F, -0.0298F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(67, 95).addBox(-0.0019F, -0.9977F, 0.0435F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3625F, -3.2653F, -20.7905F, -0.3047F, 0.0166F, -0.0298F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(48, 86).addBox(-0.5F, -2.4F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0683F, -0.5542F, -13.2561F, -0.2979F, 0.082F, -0.0299F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(121, 42).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2177F, -1.8094F, -10.9815F, -0.1059F, 0.082F, -0.0299F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(86, 119).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3868F, -3.002F, -8.4914F, -0.2543F, 0.082F, -0.0299F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(56, 121).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7015F, -2.1189F, -4.9843F, -0.5248F, 0.082F, -0.0299F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(22, 121).addBox(-0.5F, -0.7F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.1554F, 1.4692F, -0.769F, -0.2979F, 0.082F, -0.0299F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(120, 7).addBox(-0.5F, -0.7F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2198F, 0.5185F, 0.3594F, -0.0361F, 0.082F, -0.0299F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(74, 17).addBox(-1.0F, -1.8038F, -0.0408F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.005F))
				.texOffs(149, 15).addBox(0.0F, -4.3038F, 2.9592F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.95F, 6.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(146, 65).addBox(0.0F, -2.8F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7935F, 6.0486F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r509 = tail.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(153, 138).addBox(0.0F, -0.3522F, -0.5333F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1962F, 1.4592F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(154, 6).addBox(0.0F, 2.4478F, 3.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 153).addBox(0.0F, 1.4478F, 1.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 83).addBox(0.0F, 0.0478F, -0.2654F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1962F, 3.4592F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(66, 144).addBox(0.5F, -2.9F, -0.3F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7038F, 0.2592F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-2.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9987F, 0.8442F, -0.0178F, 0.0068F, -0.1394F));

		PartDefinition cube_r513 = tail.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(104, 53).mirror().addBox(-0.3F, -1.0F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -4.677F, 6.6552F, -0.0227F, 0.0695F, -0.5256F));

		PartDefinition cube_r514 = tail.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(43, 139).mirror().addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1489F, -4.8151F, 9.1347F, 0.5882F, 0.0695F, -0.5256F));

		PartDefinition cube_r515 = tail.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(50, 139).mirror().addBox(-0.5F, -3.2F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(66, 131).mirror().addBox(-0.5F, -4.4F, -4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1489F, -4.8151F, 9.1347F, 0.6754F, 0.0695F, -0.5256F));

		PartDefinition cube_r516 = tail.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(28, 146).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8592F, -4.9746F, 1.4535F, 0.4573F, 0.0695F, -0.5256F));

		PartDefinition cube_r517 = tail.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(118, 23).mirror().addBox(-3.4636F, -0.3922F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.9038F, -0.0408F, 0.0673F, 0.0186F, -0.2699F));

		PartDefinition cube_r518 = tail.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(118, 23).addBox(1.4636F, -0.3922F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.9038F, -0.0408F, 0.0673F, -0.0186F, 0.2699F));

		PartDefinition cube_r519 = tail.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(28, 146).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.8592F, -4.9746F, 1.4535F, 0.4573F, -0.0695F, 0.5256F));

		PartDefinition cube_r520 = tail.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(66, 131).addBox(-0.5F, -4.4F, -4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(50, 139).addBox(-0.5F, -3.2F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1489F, -4.8151F, 9.1347F, 0.6754F, -0.0695F, 0.5256F));

		PartDefinition cube_r521 = tail.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(43, 139).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1489F, -4.8151F, 9.1347F, 0.5882F, -0.0695F, 0.5256F));

		PartDefinition cube_r522 = tail.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(104, 53).addBox(-0.7F, -1.0F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -4.677F, 6.6552F, -0.0227F, -0.0695F, 0.5256F));

		PartDefinition cube_r523 = tail.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(77, 73).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.9038F, -0.0408F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(83, 46).addBox(0.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9987F, 0.8442F, -0.0178F, -0.0068F, 0.1394F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -0.1594F, 0.1708F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F))
				.texOffs(42, 97).addBox(-1.0F, -2.9594F, 0.2708F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.6038F, 8.7592F, -0.009F, -0.2618F, 0.0023F));

		PartDefinition cube_r525 = tail2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(102, 108).mirror().addBox(-0.0597F, -1.236F, -4.9969F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, -0.0496F, 0.0377F, -0.4189F));

		PartDefinition cube_r526 = tail2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(57, 139).mirror().addBox(-0.0597F, -1.9347F, -1.014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(139, 68).mirror().addBox(-0.0597F, -2.9347F, -2.514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.5177F, 0.0377F, -0.4189F));

		PartDefinition cube_r527 = tail2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(139, 80).mirror().addBox(-0.0597F, -4.195F, -3.8464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.6049F, 0.0377F, -0.4189F));

		PartDefinition cube_r528 = tail2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(139, 111).mirror().addBox(-0.0597F, -5.7745F, -5.146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(122, 139).mirror().addBox(-0.0597F, -7.0745F, -6.646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(132, 40).mirror().addBox(-0.1347F, -8.2745F, -9.346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.6922F, 0.0377F, -0.4189F));

		PartDefinition cube_r529 = tail2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(61, 105).mirror().addBox(0.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9594F, 12.2708F, 0.0001F, 0.0526F, -0.4193F));

		PartDefinition cube_r530 = tail2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(83, 55).mirror().addBox(-1.6014F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, 0.7415F, 0.1835F, -0.0178F, 0.0243F, -0.1397F));

		PartDefinition cube_r531 = tail2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(83, 55).addBox(-0.3986F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9243F, 0.7415F, 0.1835F, -0.0178F, -0.0243F, 0.1397F));

		PartDefinition cube_r532 = tail2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(138, 156).addBox(0.5F, -3.3F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 137).addBox(0.5F, -3.3F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 156).addBox(0.5F, -3.25F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 156).addBox(0.5F, -3.2F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 156).addBox(0.5F, -3.2F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 156).addBox(0.5F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1594F, 0.1708F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r533 = tail2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(61, 105).addBox(-1.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.0001F, -0.0526F, 0.4193F));

		PartDefinition cube_r534 = tail2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(132, 40).addBox(-0.8653F, -8.2745F, -9.346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F))
				.texOffs(122, 139).addBox(-0.9403F, -7.0745F, -6.646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(139, 111).addBox(-0.9403F, -5.7745F, -5.146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.6922F, -0.0377F, 0.4189F));

		PartDefinition cube_r535 = tail2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(139, 80).addBox(-0.9403F, -4.195F, -3.8464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.6049F, -0.0377F, 0.4189F));

		PartDefinition cube_r536 = tail2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(139, 68).addBox(-0.9403F, -2.9347F, -2.514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(57, 139).addBox(-0.9403F, -1.9347F, -1.014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, 0.5177F, -0.0377F, 0.4189F));

		PartDefinition cube_r537 = tail2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(102, 108).addBox(-0.9403F, -1.236F, -4.9969F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -2.9594F, 12.2708F, -0.0496F, -0.0377F, 0.4189F));

		PartDefinition cube_r538 = tail2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(154, 24).addBox(0.0F, 8.1478F, 11.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 18).addBox(0.0F, 6.5478F, 9.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 78).addBox(0.0F, 4.7478F, 7.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 12).addBox(0.0F, 3.4478F, 5.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(56, 48).addBox(-1.0F, -0.0381F, -0.2468F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1214F, 12.4194F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r539 = tail3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(88, 153).addBox(1.0F, -4.0996F, 3.5393F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 150).addBox(1.0F, -3.7996F, 1.5393F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 150).addBox(1.0F, -3.5996F, -0.4607F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, 6.2532F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r540 = tail3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(37, 12).addBox(1.0F, -3.8F, 2.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 155).addBox(1.0F, -3.1F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, 1.6532F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail3.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(111, 156).addBox(1.0F, -2.7F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, -0.0468F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail3.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(27, 64).mirror().addBox(-0.475F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -3.3292F, 5.1975F, -0.019F, 0.0018F, -0.3042F));

		PartDefinition cube_r543 = tail3.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-0.5F, -1.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8267F, -3.5231F, 9.5019F, 0.4609F, 0.0018F, -0.3042F));

		PartDefinition cube_r544 = tail3.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(140, 7).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(140, 12).mirror().addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(140, 23).mirror().addBox(-0.5F, -3.0F, -4.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(140, 34).mirror().addBox(-0.5F, -4.1F, -5.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.913F, -3.784F, 7.1324F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r545 = tail3.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(140, 34).addBox(-0.5F, -4.1F, -5.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(140, 23).addBox(-0.5F, -3.0F, -4.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(140, 12).addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(140, 7).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.913F, -3.784F, 7.1324F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r546 = tail3.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(140, 0).addBox(-0.5F, -1.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8267F, -3.5231F, 9.5019F, 0.4609F, -0.0018F, 0.3042F));

		PartDefinition cube_r547 = tail3.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(157, 21).addBox(0.0F, 0.7F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 16).addBox(0.0F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3828F, 7.3725F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(157, 11).addBox(0.0F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4896F, 4.9336F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(157, 6).addBox(0.0F, 11.6478F, 15.7346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 157).addBox(0.0F, 10.5478F, 13.7346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9214F, -17.7194F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(27, 64).addBox(-0.525F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, -3.3292F, 5.1975F, -0.019F, -0.0018F, 0.3042F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.413F, -0.1774F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3785F, 10.9345F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r551 = tail4.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(146, 103).addBox(0.0F, -5.0313F, -3.9722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.6162F, 7.32F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(33, 123).addBox(0.0F, 1.1969F, 2.1449F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.6162F, 7.32F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r553 = tail4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(141, 39).mirror().addBox(-0.462F, -1.5227F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(141, 53).mirror().addBox(-0.462F, -2.5227F, -3.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4904F, -4.0181F, 3.1247F, 0.5846F, 0.0832F, -0.3065F));

		PartDefinition cube_r554 = tail4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(-0.5115F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4904F, -4.0181F, 3.1247F, 0.0153F, 0.0963F, -0.3066F));

		PartDefinition cube_r555 = tail4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(77, 84).addBox(-0.4885F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.0153F, -0.0963F, 0.3066F));

		PartDefinition cube_r556 = tail4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(141, 53).addBox(-0.5381F, -2.5227F, -3.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(141, 39).addBox(-0.5381F, -1.5227F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(132, 53).addBox(-0.5381F, -0.4227F, -0.429F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.5846F, -0.0832F, 0.3065F));

		PartDefinition cube_r557 = tail4.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(100, 146).addBox(-0.5381F, 0.2703F, 1.8106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4904F, -4.0181F, 3.1247F, 0.4537F, -0.0832F, 0.3065F));

		PartDefinition cube_r558 = tail4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(146, 79).addBox(0.0F, -2.2744F, -2.8084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.6162F, 7.32F, -2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(65, 137).addBox(-0.5F, -2.0F, -1.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -3.6663F, 9.7997F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(121, 60).addBox(0.0F, -0.5031F, -0.3179F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.6162F, 7.32F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(36, 106).addBox(0.0F, -0.0231F, -0.3295F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -4.6162F, 7.32F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(155, 156).addBox(0.0F, -3.7523F, 3.9986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 64).addBox(0.0F, -3.6523F, 1.9986F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 112).addBox(0.0F, -3.3523F, -0.0014F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.323F, 4.8303F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(155, 38).addBox(0.0F, -3.6784F, 1.9927F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 90).addBox(0.0F, -3.4784F, -0.0073F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.413F, 0.8226F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail4.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(41, 158).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4995F, 10.5803F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(85, 158).addBox(0.0F, 4.9F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(158, 38).addBox(0.0F, 4.0F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 147).addBox(0.0F, 2.9F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 157).addBox(0.0F, 1.8F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0043F, -3.562F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(52, 73).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3213F, 10.8101F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition cube_r566 = tail5.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(151, 159).addBox(0.0F, -1.2538F, -0.0126F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 10.1625F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail5.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(117, 75).addBox(0.0F, -1.3735F, 0.047F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 7.9625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail5.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(112, 35).addBox(0.0F, -1.6551F, 0.0102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 5.9625F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r569 = tail5.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(160, 73).addBox(0.0F, -1.9368F, 0.0735F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 3.9625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r570 = tail5.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(88, 159).addBox(0.0F, -2.3184F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 1.9625F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail5.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(114, 156).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, -0.0375F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r572 = tail5.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(67, 125).addBox(0.0F, 6.4257F, 12.274F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(97, 123).addBox(0.0F, 4.7295F, 9.7975F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(55, 128).addBox(0.0F, 3.34F, 7.2442F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r573 = tail5.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(128, 146).addBox(0.0F, -16.4038F, -7.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(146, 111).addBox(0.0F, -13.4801F, -6.3719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r574 = tail5.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(146, 107).addBox(0.0F, -9.5787F, -7.1214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r575 = tail5.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(29, 48).addBox(0.0F, -1.1631F, 4.5253F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r576 = tail5.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(93, 105).addBox(-0.5F, -7.1F, -1.7F, 1.0F, 10.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -3.0559F, 6.0448F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r577 = tail5.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(44, 123).addBox(0.0F, 2.2992F, 4.4775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r578 = tail5.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(160, 106).addBox(0.0F, 5.2F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 85).addBox(0.0F, 3.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 81).addBox(0.0F, 2.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 77).addBox(0.0F, 0.9F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8208F, -0.2297F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r579 = tail5.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(107, 146).addBox(0.0F, -7.2144F, -5.3471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -4.2949F, -3.49F, -2.042F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -0.1689F, -0.2745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0515F, 11.2098F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition cube_r580 = tail6.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(160, 69).addBox(0.0F, -1.8423F, 0.0761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 4.7255F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail6.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(160, 58).addBox(0.0F, -1.2606F, 0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 6.7255F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r582 = tail6.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(160, 54).addBox(0.0F, -1.8857F, -0.157F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 2.9255F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail6.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(70, 8).addBox(0.0F, -1.4055F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 0.7255F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail6.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(135, 146).addBox(0.0F, -6.8845F, -4.1347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -0.5805F, 1.3849F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r585 = tail6.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(132, 74).addBox(0.0F, -1.1427F, 4.4605F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -0.5805F, 1.3849F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r586 = tail6.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(13, 116).addBox(0.0F, -6.8516F, -3.0156F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.5805F, 1.3849F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r587 = tail6.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(132, 59).addBox(0.0F, -2.9126F, -3.8835F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(146, 129).addBox(0.0F, -2.9263F, -5.0722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -0.5805F, 1.3849F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r588 = tail6.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(126, 122).addBox(0.0F, -2.1735F, 1.7092F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -0.5805F, 1.3849F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r589 = tail6.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(19, 96).addBox(0.0F, 7.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7693F, -11.4395F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail8 = tail6.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 99).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.4311F, 7.7255F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition cube_r590 = tail8.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(52, 70).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r591 = tail8.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(103, 129).addBox(-0.5F, -8.1F, -1.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.4833F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r592 = tail8.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(89, 127).addBox(0.0F, -15.6303F, -2.4083F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -1.0116F, -7.0406F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r593 = tail8.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(148, 115).addBox(0.0F, -10.4507F, -4.2708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(121, 148).addBox(0.0F, -12.9655F, -3.4933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(84, 149).addBox(0.0F, -15.7715F, -3.0156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -1.0116F, -7.0406F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r594 = tail8.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(136, 141).addBox(0.0F, -6.2894F, 5.485F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -1.0116F, -7.0406F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r595 = tail8.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(142, 17).addBox(0.0F, 1.5786F, 8.1964F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(133, 98).addBox(0.0F, 3.525F, 8.9213F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, -1.0116F, -7.0406F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r596 = tail8.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(133, 136).addBox(0.0F, 3.6666F, 11.921F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, -1.0116F, -7.0406F, 0.3578F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 165, 165);
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