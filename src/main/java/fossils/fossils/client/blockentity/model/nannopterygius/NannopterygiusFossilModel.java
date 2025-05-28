package fossils.fossils.client.blockentity.model.nannopterygius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NannopterygiusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public NannopterygiusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.frontleftflipper = this.main.getChild("frontleftflipper");
		this.frontrightflipper = this.main.getChild("frontrightflipper");
		this.neck = this.main.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.backleftflipper = this.body3.getChild("backleftflipper");
		this.backrightflipper = this.body3.getChild("backrightflipper");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.0F, -7.0F, -0.0532F, -0.1264F, -0.264F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 67).addBox(0.0F, -1.8859F, 0.01F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 68).addBox(0.0F, -1.9003F, 4.0174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 68).addBox(0.0F, -1.9003F, 2.0174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 68).addBox(0.0F, -1.7003F, 0.0174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.1F, -0.9925F, -5.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 57).addBox(0.9F, -0.9925F, -3.1957F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(1.7F, -0.9925F, -5.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, 6.8F, -2.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(2.485F, -0.9925F, -3.4959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 6.8F, -2.6F, -1.539F, 1.2895F, -1.229F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-0.9F, -0.9925F, -5.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 6.8F, -2.6F, -0.2826F, 0.1002F, 0.2798F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-0.7946F, -0.9925F, -3.5297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 6.8F, -2.6F, -0.3108F, 0.4343F, 0.1744F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-0.3387F, -0.9925F, -4.2552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 6.8F, -2.6F, -0.4108F, 0.8027F, 0.0052F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.2F, -1.2996F, -3.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 30).mirror().addBox(-1.2F, -0.7996F, -2.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-1.2F, -1.1996F, -1.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, 1.2913F, -4.8338F, 1.3235F, -0.0542F, -0.2114F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.0812F, -0.8846F, -0.4446F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 3.3738F, -7.3857F, -0.4763F, -0.0033F, 0.4807F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 44).mirror().addBox(-3.6971F, 3.5643F, -3.2919F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2F, 5.3738F, -5.3857F, -0.3627F, 0.7188F, 1.0467F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.7841F, -5.0396F, 0.541F, 0.2042F, -0.3378F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.7841F, -5.0396F, 0.4169F, 0.4014F, -0.7467F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-5.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.7841F, -5.0396F, 0.1766F, 0.5453F, -1.2632F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.1841F, -3.0396F, 0.3583F, 0.1376F, -0.369F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.1841F, -3.0396F, 0.2712F, 0.2674F, -0.7947F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.1841F, -3.0396F, 0.1148F, 0.3615F, -1.2904F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, -1.2396F, 0.2601F, 0.0992F, -0.3806F));

		PartDefinition cube_r18 = main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, -1.2396F, 0.1965F, 0.192F, -0.8117F));

		PartDefinition cube_r19 = main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 19).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, -1.2396F, 0.0849F, 0.2607F, -1.2996F));

		PartDefinition cube_r20 = main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.2841F, 6.4604F, 0.0765F, 0.0643F, -0.862F));

		PartDefinition cube_r21 = main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.2841F, 6.4604F, 0.0981F, 0.0334F, -0.4263F));

		PartDefinition cube_r22 = main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.2841F, 6.4604F, 0.0381F, 0.0923F, -1.3427F));

		PartDefinition cube_r23 = main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 4.5604F, 0.1241F, 0.1156F, -0.8229F));

		PartDefinition cube_r24 = main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 4.5604F, 0.1628F, 0.0599F, -0.3883F));

		PartDefinition cube_r25 = main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 4.5604F, 0.0565F, 0.1597F, -1.3055F));

		PartDefinition cube_r26 = main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 2.5604F, 0.2114F, 0.0796F, -0.3849F));

		PartDefinition cube_r27 = main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 51).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 2.5604F, 0.1601F, 0.1539F, -0.818F));

		PartDefinition cube_r28 = main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 11).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 2.5604F, 0.0705F, 0.2102F, -1.3029F));

		PartDefinition cube_r29 = main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(34, 13).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 0.4604F, 0.0849F, 0.2607F, -1.2996F));

		PartDefinition cube_r30 = main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(61, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 0.4604F, 0.1965F, 0.192F, -0.8117F));

		PartDefinition cube_r31 = main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.3841F, 0.4604F, 0.2601F, 0.0992F, -0.3806F));

		PartDefinition cube_r32 = main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 21).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.2841F, 6.4604F, 0.0381F, -0.0923F, 1.3427F));

		PartDefinition cube_r33 = main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.2841F, 6.4604F, 0.0981F, -0.0334F, 0.4263F));

		PartDefinition cube_r34 = main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(33, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.2841F, 6.4604F, 0.0765F, -0.0643F, 0.862F));

		PartDefinition cube_r35 = main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(34, 9).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 4.5604F, 0.0565F, -0.1597F, 1.3055F));

		PartDefinition cube_r36 = main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 4.5604F, 0.1628F, -0.0599F, 0.3883F));

		PartDefinition cube_r37 = main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 4.5604F, 0.1241F, -0.1156F, 0.8229F));

		PartDefinition cube_r38 = main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 11).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 2.5604F, 0.0705F, -0.2102F, 1.3029F));

		PartDefinition cube_r39 = main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(66, 51).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 2.5604F, 0.1601F, -0.1539F, 0.818F));

		PartDefinition cube_r40 = main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(14, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 2.5604F, 0.2114F, -0.0796F, 0.3849F));

		PartDefinition cube_r41 = main.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 0.4604F, 0.2601F, -0.0992F, 0.3806F));

		PartDefinition cube_r42 = main.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(61, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 0.4604F, 0.1965F, -0.192F, 0.8117F));

		PartDefinition cube_r43 = main.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 13).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, 0.4604F, 0.0849F, -0.2607F, 1.2996F));

		PartDefinition cube_r44 = main.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 9).addBox(-5.0F, -2.0689F, -4.0835F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2F, 0.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r45 = main.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 8.9F, 1.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = main.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 48).addBox(-0.2054F, -0.9925F, -3.5297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4F, 6.8F, -2.6F, -0.3108F, -0.4343F, -0.1744F));

		PartDefinition cube_r47 = main.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(56, 15).addBox(-3.485F, -0.9925F, -3.4959F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 6.8F, -2.6F, -1.539F, -1.2895F, 1.229F));

		PartDefinition cube_r48 = main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 53).addBox(-0.6613F, -0.9925F, -4.2552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4F, 6.8F, -2.6F, -0.4108F, -0.8027F, -0.0052F));

		PartDefinition cube_r49 = main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(38, 35).addBox(-0.1F, -0.9925F, -5.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 6.8F, -2.6F, -0.2826F, -0.1002F, -0.2798F));

		PartDefinition cube_r50 = main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.5515F, -0.0497F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.6F, -2.7F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = main.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, -1.5008F, -0.0365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r52 = main.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 68).addBox(0.0F, -1.9198F, 2.0095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 68).addBox(0.0F, -1.5198F, 0.0095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -5.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = main.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 37).addBox(0.2F, -1.2996F, -3.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.2F, -1.1996F, -1.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 30).addBox(0.2F, -0.7996F, -2.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.8F, 1.2913F, -4.8338F, 1.3235F, 0.0542F, 0.2114F));

		PartDefinition cube_r54 = main.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(63, 44).addBox(1.6971F, 3.5643F, -3.2919F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, 5.3738F, -5.3857F, -0.3627F, -0.7188F, -1.0467F));

		PartDefinition cube_r55 = main.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 33).addBox(-3.9188F, -0.8846F, -0.4446F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6F, 3.3738F, -7.3857F, -0.4763F, 0.0033F, -0.4807F));

		PartDefinition cube_r56 = main.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(9, 58).addBox(1.7F, -0.0283F, -2.2975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2F, 5.3738F, -5.3857F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r57 = main.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(39, 23).addBox(-1.0F, -1.5F, 0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -6.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = main.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 15).addBox(2.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.7841F, -5.0396F, 0.1766F, -0.5453F, 1.2632F));

		PartDefinition cube_r59 = main.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 55).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.7841F, -5.0396F, 0.4169F, -0.4014F, 0.7467F));

		PartDefinition cube_r60 = main.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.7841F, -5.0396F, 0.541F, -0.2042F, 0.3378F));

		PartDefinition cube_r61 = main.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(59, 36).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.1841F, -3.0396F, 0.1148F, -0.3615F, 1.2904F));

		PartDefinition cube_r62 = main.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.1841F, -3.0396F, 0.2712F, -0.2674F, 0.7947F));

		PartDefinition cube_r63 = main.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.1841F, -3.0396F, 0.3583F, -0.1376F, 0.369F));

		PartDefinition cube_r64 = main.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(26, 19).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, -1.2396F, 0.0849F, -0.2607F, 1.2996F));

		PartDefinition cube_r65 = main.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(26, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, -1.2396F, 0.1965F, -0.192F, 0.8117F));

		PartDefinition cube_r66 = main.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(27, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.3841F, -1.2396F, 0.2601F, -0.0992F, 0.3806F));

		PartDefinition frontleftflipper = main.addOrReplaceChild("frontleftflipper", CubeListBuilder.create().texOffs(54, 38).addBox(0.1633F, -0.6821F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 0).addBox(1.1633F, -0.0821F, -1.3F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.2F, -5.6F, 0.0F, -0.3054F, 0.6109F));

		PartDefinition frontrightflipper = main.addOrReplaceChild("frontrightflipper", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-3.1633F, -0.6821F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 0).mirror().addBox(-6.1633F, -0.0821F, -1.3F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 4.2F, -5.6F, 0.0F, 0.2182F, -0.6109F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7F, -6.6F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(24, 68).addBox(0.0F, -2.1987F, 2.0571F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 68).addBox(0.0F, -1.5987F, 0.0571F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.8F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2159F, -2.1396F, 0.7668F, 0.5662F, -0.2958F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2159F, -2.1396F, 0.4619F, 0.817F, -0.7649F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2159F, -0.2396F, 0.6374F, 0.3648F, -0.3192F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(55, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2159F, -0.2396F, 0.4392F, 0.5856F, -0.7446F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-4.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2159F, -0.2396F, 0.0782F, 0.7127F, -1.3299F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 0).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.2159F, -2.1396F, 0.4617F, -0.8081F, 0.7049F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(21, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.2159F, -2.1396F, 0.7619F, -0.5583F, 0.2382F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 65).addBox(2.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2159F, -0.2396F, 0.0782F, -0.7127F, 1.3299F));

		PartDefinition cube_r76 = neck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(55, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2159F, -0.2396F, 0.4392F, -0.5856F, 0.7446F));

		PartDefinition cube_r77 = neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2159F, -0.2396F, 0.6374F, -0.3648F, 0.3192F));

		PartDefinition cube_r78 = neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(28, 33).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.4F, 0.48F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(47, 38).addBox(-0.3F, 0.8F, -12.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
				.texOffs(47, 38).mirror().addBox(-0.7F, 0.8F, -12.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 30).addBox(-0.3F, 0.95F, -12.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.7525F, -0.7761F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(61, 26).addBox(-1.0F, -0.0475F, -1.7761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.3F, -4.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(40, 55).addBox(-2.5F, 0.0131F, 0.0439F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.2F, -2.7F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.55F, -0.7292F, -0.6777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(13, 19).mirror().addBox(-0.87F, -0.7292F, -0.6777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(0, 27).addBox(2.95F, -0.7292F, -0.6777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(13, 19).addBox(3.27F, -0.7292F, -0.6777F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-1.7F, 0.3997F, -2.4974F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(-0.85F, -1.7493F, -0.512F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.49F)).mirror(false)
				.texOffs(31, 55).addBox(2.25F, -1.7493F, -0.512F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.49F)), PartPose.offsetAndRotation(-1.7F, 0.2997F, -0.6974F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.45F, -0.2337F, -0.1503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(0, 16).addBox(2.85F, -0.2337F, -0.1503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.7F, -0.4003F, -3.0974F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(22, 53).mirror().addBox(-0.75F, -0.4435F, -0.3705F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(22, 53).addBox(2.15F, -0.4435F, -0.3705F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.7F, 1.6997F, -3.2974F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(18, 59).mirror().addBox(-1.0F, -0.7F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)).mirror(false)
				.texOffs(18, 59).addBox(1.9F, -0.7F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)), PartPose.offsetAndRotation(-1.45F, 0.6856F, -3.4777F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(29, 48).mirror().addBox(-0.55F, -0.7761F, -0.8415F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.798F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.5997F, -3.8974F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(-0.5F, -1.6F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.803F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9027F, -4.8112F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.8731F, -5.009F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(58, 61).addBox(-0.5F, -1.6F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
				.texOffs(0, 62).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.803F)), PartPose.offsetAndRotation(0.75F, 0.9027F, -4.8112F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 55).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.75F, 0.8731F, -5.009F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(29, 48).addBox(-0.45F, -0.7761F, -0.8415F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.798F)), PartPose.offsetAndRotation(1.7F, 0.5997F, -3.8974F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(50, 0).addBox(-1.5F, -0.055F, -0.0157F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -4.3F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.8277F, -5.891F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 19).addBox(-2.0F, -0.9565F, 0.056F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -2.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 28).addBox(-1.0F, -0.6565F, -3.444F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F))
				.texOffs(60, 58).addBox(-2.0F, -0.9565F, -0.944F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 61).addBox(-1.0F, -0.9565F, -2.944F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -2.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(27, 61).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.1F, -6.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(52, 5).addBox(-1.5F, -0.3186F, -2.6596F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.8F, -6.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -0.55F, -0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(0.5F, 1.5F, -8.5F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(34, 42).addBox(-1.5F, -0.7F, -0.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 1.5F, -8.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 20).addBox(-2.5F, -0.0171F, -1.031F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.5067F, -0.2265F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(40, 59).addBox(-2.5F, -0.0324F, -1.0131F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6067F, 0.1735F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(8, 37).mirror().addBox(-2.2F, 0.0663F, -0.7608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(8, 37).addBox(1.2F, 0.0663F, -0.7608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -0.3933F, 0.1735F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 4).addBox(-2.5F, -0.0337F, -0.9608F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3933F, 0.1735F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(52, 44).addBox(-2.5F, -0.0177F, -0.0278F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.3933F, -0.3265F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(22, 33).addBox(-2.5F, -1.6F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 23).addBox(-2.5F, -1.6F, -0.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.2067F, -1.3265F, 0.0175F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 0.4F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(7, 46).mirror().addBox(-0.7F, -0.8476F, -0.3246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(18, 47).mirror().addBox(-0.7F, -0.7476F, -0.3246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7156F, -12.2237F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(7, 46).addBox(-0.3F, -0.8476F, -0.3246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.32F))
				.texOffs(18, 47).addBox(-0.3F, -0.7476F, -0.3246F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.7156F, -12.2237F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(11, 53).addBox(-1.0F, -0.6315F, -0.3718F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.1156F, -8.9237F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 10).addBox(-1.0F, -0.4744F, -0.1992F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.33F))
				.texOffs(43, 44).addBox(-1.0F, -0.3404F, -0.2992F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, -1.4156F, -8.9237F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(7, 63).addBox(-1.5F, -0.8117F, -0.2011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 23).addBox(-1.5F, -0.8117F, 0.0989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, -0.4156F, -7.3237F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(61, 0).addBox(-1.5F, -0.1503F, -0.3126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -1.0156F, -7.0237F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(49, 50).addBox(-0.5F, -1.1742F, -4.1356F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.13F))
				.texOffs(38, 50).addBox(-0.5F, -0.9742F, -4.0356F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F))
				.texOffs(46, 50).mirror().addBox(-1.5F, -0.9742F, -1.1356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(46, 50).addBox(1.5F, -0.9742F, -1.1356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.3844F, -2.8237F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-2.5F, -0.9F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(26, 23).addBox(0.5F, -0.9F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 0.6844F, 0.3763F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-2.5F, -0.9427F, -2.0353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.025F)).mirror(false)
				.texOffs(25, 47).addBox(0.5F, -0.9427F, -2.0353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.5F, 1.3844F, -1.0237F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 7.0F, 0.0038F, 0.0435F, 0.0873F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(41, 68).addBox(0.0F, -1.7575F, 3.9811F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 68).addBox(0.0F, -1.8575F, 1.9811F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 68).addBox(0.0F, -1.8575F, -0.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.1F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8159F, 5.3604F, -0.0026F, -0.0594F, -1.3957F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(6, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8159F, 5.3604F, -0.0298F, -0.0515F, -0.9151F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(63, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8159F, 5.3604F, -0.0471F, -0.0267F, -0.4791F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 7).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4159F, 3.3604F, 0.011F, -0.0088F, -1.3613F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4159F, 3.3604F, 0.0057F, -0.0129F, -0.8813F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.4159F, 3.3604F, -0.003F, 0.0073F, -0.4355F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(63, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 1.4604F, 0.0336F, 0.0067F, -0.4799F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(37, 5).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 1.4604F, 0.02F, 0.0249F, -1.3612F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 1.4604F, 0.0292F, 0.0129F, -0.8813F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8159F, 5.3604F, -0.0471F, 0.0267F, 0.4791F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(6, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8159F, 5.3604F, -0.0298F, 0.0515F, 0.9151F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(46, 36).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8159F, 5.3604F, -0.0026F, 0.0594F, 1.3957F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4159F, 3.3604F, -0.003F, -0.0073F, 0.4355F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4159F, 3.3604F, 0.0057F, 0.0129F, 0.8813F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(37, 7).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4159F, 3.3604F, 0.011F, 0.0088F, 1.3613F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(20, 66).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 1.4604F, 0.0292F, -0.0129F, 0.8813F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(37, 5).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 1.4604F, 0.02F, -0.0249F, 1.3612F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 1.4604F, 0.0336F, -0.0067F, 0.4799F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(27, 23).addBox(-1.0F, -0.5F, 0.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.2F, -0.192F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, 7.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, -1.9F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 23).addBox(0.0F, -1.9F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 52).addBox(0.0F, -2.2F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 57).addBox(0.0F, -2.3F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 9).addBox(-1.0F, -0.7F, -0.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.7159F, 5.9604F, 0.0013F, -0.0067F, -0.6195F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-2.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.7159F, 5.9604F, 0.0057F, -0.0129F, -1.0558F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1159F, 4.1604F, -0.0793F, -0.04F, -0.5827F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1159F, 4.1604F, -0.0534F, -0.0771F, -1.0183F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-3.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1159F, 4.1604F, -0.0117F, -0.0931F, -1.4998F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(41, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6159F, 2.3604F, -0.0793F, -0.04F, -0.5478F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6159F, 2.3604F, -0.0534F, -0.0771F, -0.9834F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 63).mirror().addBox(-4.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6159F, 2.3604F, -0.0117F, -0.0931F, -1.4649F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(58, 42).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 0.3604F, -0.0117F, -0.0931F, -1.4474F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 0.3604F, -0.0534F, -0.0771F, -0.9659F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0159F, 0.3604F, -0.0793F, -0.04F, -0.5304F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 0).addBox(1.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.7159F, 5.9604F, 0.0057F, 0.0129F, 1.0558F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.7159F, 5.9604F, 0.0013F, 0.0067F, 0.6195F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(46, 38).addBox(2.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1159F, 4.1604F, -0.0117F, 0.0931F, 1.4998F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 32).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1159F, 4.1604F, -0.0534F, 0.0771F, 1.0183F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1159F, 4.1604F, -0.0793F, 0.04F, 0.5827F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(65, 63).addBox(2.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6159F, 2.3604F, -0.0117F, 0.0931F, 1.4649F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(46, 67).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6159F, 2.3604F, -0.0534F, 0.0771F, 0.9834F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(41, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6159F, 2.3604F, -0.0793F, 0.04F, 0.5478F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 42).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 0.3604F, -0.0117F, 0.0931F, 1.4474F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(64, 65).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 0.3604F, -0.0534F, 0.0771F, 0.9659F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(63, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0159F, 0.3604F, -0.0793F, 0.04F, 0.5304F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 19).addBox(-1.0F, -0.9F, -0.2F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.005F))
				.texOffs(31, 0).addBox(0.0F, -2.0F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 9).addBox(0.0F, -2.0F, 2.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(0.0F, -2.0F, 4.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 23).addBox(0.0F, -2.0F, 6.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 6.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-0.1543F, -0.0071F, -0.0708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.2748F, 0.0357F, 0.5216F, 0.0607F, 0.2118F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(16, 39).mirror().addBox(-0.2747F, -0.7851F, -3.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4802F, 4.0801F, -0.1324F, 1.2027F, -0.4113F, -0.9899F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(29, 40).mirror().addBox(-0.2747F, -0.2851F, -3.2545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4802F, 4.0801F, -0.1324F, 1.9295F, 0.3185F, -1.0423F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(12, 30).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4748F, 0.1357F, 1.2372F, 0.0607F, 0.2118F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0841F, 7.3604F, 0.0338F, 0.0367F, -0.9507F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0841F, 5.3604F, 0.0357F, 0.0349F, -0.8983F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0841F, 3.3604F, 0.0369F, 0.0336F, -0.8634F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(38, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0841F, 1.3604F, 0.0369F, 0.0336F, -0.8634F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(38, 35).addBox(-0.8457F, -0.0071F, -0.0708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.2748F, 0.0357F, 0.5216F, -0.0607F, -0.2118F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(12, 30).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 3.4748F, 0.1357F, 1.2372F, -0.0607F, -0.2118F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(29, 40).addBox(-0.7253F, -0.2851F, -3.2545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4802F, 4.0801F, -0.1324F, 1.9295F, -0.3185F, 1.0423F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(16, 39).addBox(-0.7253F, -0.7851F, -3.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4802F, 4.0801F, -0.1324F, 1.2027F, 0.4113F, 0.9899F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0841F, 7.3604F, 0.0338F, -0.0367F, 0.9507F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0841F, 5.3604F, 0.0357F, -0.0349F, 0.8983F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0841F, 3.3604F, 0.0369F, -0.0336F, 0.8634F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(38, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0841F, 1.3604F, 0.0369F, -0.0336F, 0.8634F));

		PartDefinition backleftflipper = body3.addOrReplaceChild("backleftflipper", CubeListBuilder.create().texOffs(13, 16).addBox(0.1481F, -0.5313F, -1.2024F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 15).addBox(1.1481F, -0.1313F, -1.7024F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.8F, 0.8F, 0.0F, -0.5236F, 0.5672F));

		PartDefinition backrightflipper = body3.addOrReplaceChild("backrightflipper", CubeListBuilder.create().texOffs(13, 16).mirror().addBox(-3.1481F, -0.5313F, -1.2024F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 15).mirror().addBox(-5.1481F, -0.1313F, -1.7024F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.8F, 0.8F, 0.0F, 0.1745F, -0.5672F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 7.7F, -0.1072F, 0.217F, -0.0232F));

		PartDefinition cube_r174 = tail.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(16, 39).addBox(0.0F, -1.0F, 6.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 39).addBox(0.0F, -1.0F, 4.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 40).addBox(0.0F, -1.3F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 68).addBox(0.0F, -1.5F, 0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.293F, 0.1742F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.793F, 7.8742F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(21, 40).addBox(-0.5F, -0.0071F, -0.1351F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3996F, 0.0087F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2004F, 4.8087F, -0.9132F, 0.1904F, -0.2403F));

		PartDefinition cube_r176 = tail3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3442F, 8.0927F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(14, 46).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -0.1073F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(8, 39).addBox(-0.5F, 0.0052F, 0.044F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.4442F, 3.2927F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, 0.0218F, -0.0561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.4442F, 1.3927F, 0.0087F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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