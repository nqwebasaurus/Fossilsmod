package fossils.fossils.client.blockentity.model.tuojiangosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TuojiangosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
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
	private final ModelPart tail;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart tail2;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart tail4;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart tail7;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart body2;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart leftPlate7;
	private final ModelPart leftPlate20;
	private final ModelPart upperbody;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart spike;
	private final ModelPart spike2;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart head2;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart eye;
	private final ModelPart jaw2;
	private final ModelPart eye2;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;

	public TuojiangosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.leftPlate8 = this.body.getChild("leftPlate8");
		this.rightPlate8 = this.body.getChild("rightPlate8");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.leftPlate9 = this.tail.getChild("leftPlate9");
		this.rightPlate9 = this.tail.getChild("rightPlate9");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate10 = this.tail2.getChild("leftPlate10");
		this.rightPlate10 = this.tail2.getChild("rightPlate10");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.leftPlate11 = this.tail3.getChild("leftPlate11");
		this.rightPlate11 = this.tail3.getChild("rightPlate11");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate14 = this.tail4.getChild("leftPlate14");
		this.rightPlate14 = this.tail4.getChild("rightPlate14");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftPlate13 = this.tail6.getChild("leftPlate13");
		this.rightPlate13 = this.tail6.getChild("rightPlate13");
		this.leftPlate19 = this.tail6.getChild("leftPlate19");
		this.rightPlate19 = this.tail6.getChild("rightPlate19");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftPlate18 = this.tail5.getChild("leftPlate18");
		this.rightPlate18 = this.tail5.getChild("rightPlate18");
		this.body2 = this.body.getChild("body2");
		this.leftPlate6 = this.body2.getChild("leftPlate6");
		this.rightPlate6 = this.body2.getChild("rightPlate6");
		this.leftPlate7 = this.body2.getChild("leftPlate7");
		this.leftPlate20 = this.body2.getChild("leftPlate20");
		this.upperbody = this.body2.getChild("upperbody");
		this.leftPlate5 = this.upperbody.getChild("leftPlate5");
		this.rightPlate5 = this.upperbody.getChild("rightPlate5");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.spike = this.chest.getChild("spike");
		this.spike2 = this.chest.getChild("spike2");
		this.leftPlate2 = this.chest.getChild("leftPlate2");
		this.rightPlate2 = this.chest.getChild("rightPlate2");
		this.leftPlate4 = this.chest.getChild("leftPlate4");
		this.rightPlate4 = this.chest.getChild("rightPlate4");
		this.bone4 = this.chest.getChild("bone4");
		this.bone2 = this.chest.getChild("bone2");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate17 = this.neck4.getChild("leftPlate17");
		this.rightPlate17 = this.neck4.getChild("rightPlate17");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.leftPlate15 = this.neck5.getChild("leftPlate15");
		this.rightPlate15 = this.neck5.getChild("rightPlate15");
		this.leftPlate16 = this.neck5.getChild("leftPlate16");
		this.rightPlate16 = this.neck5.getChild("rightPlate16");
		this.head2 = this.neck5.getChild("head2");
		this.leftFace2 = this.head2.getChild("leftFace2");
		this.rightFace2 = this.head2.getChild("rightFace2");
		this.eye = this.head2.getChild("eye");
		this.jaw2 = this.head2.getChild("jaw2");
		this.eye2 = this.head2.getChild("eye2");
		this.leftPlate3 = this.neck2.getChild("leftPlate3");
		this.rightPlate3 = this.neck2.getChild("rightPlate3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.7711F, 10.9004F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-2.5F, 2.0F, 0.25F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 0).addBox(0.5F, 2.0F, 0.25F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(23, 14).addBox(-0.5F, 1.0F, -0.75F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 119).addBox(0.0F, -3.4F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9048F, 3.993F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 117).addBox(0.0F, -3.3F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0617F, 1.9991F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 48).addBox(0.0F, -0.1F, 0.05F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4392F, -3.9542F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = body.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6065F, -4.9759F, 1.3964F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r5 = leftPlate8.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 93).addBox(-0.5F, -1.5F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -2.0795F, 1.1424F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftPlate8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 101).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftPlate8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 99).addBox(-0.5F, -1.8F, -1.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, 0.5511F, 0.4283F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftPlate8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 78).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -2.5471F, -0.8997F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftPlate8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 59).addBox(-0.4992F, -0.4533F, -0.854F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1541F, -0.9776F, -1.2516F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftPlate8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 70).addBox(-0.5F, 0.225F, -3.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftPlate8.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(108, 36).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.3451F, 1.4568F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftPlate8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(129, 65).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.1246F, -4.7807F, 0.93F, 0.7747F, -0.0227F, 0.0004F));

		PartDefinition cube_r13 = leftPlate8.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 86).addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -2.5517F, -0.9053F, 1.0123F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = body.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6065F, -4.9759F, 1.3964F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r14 = rightPlate8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 93).mirror().addBox(-0.5F, -1.5F, -1.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.0795F, 1.1424F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = rightPlate8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 101).mirror().addBox(-0.5F, -0.825F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightPlate8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 99).mirror().addBox(-0.5F, -1.8F, -1.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5511F, 0.4283F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightPlate8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 78).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.5471F, -0.8997F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightPlate8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(100, 59).mirror().addBox(-0.5008F, -0.4533F, -0.854F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, -0.9776F, -1.2516F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightPlate8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-0.5F, 0.225F, -3.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightPlate8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.3451F, 1.4568F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightPlate8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(129, 65).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.1246F, -4.7807F, 0.93F, 0.7747F, 0.0227F, -0.0004F));

		PartDefinition cube_r22 = rightPlate8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.5517F, -0.9053F, 1.0123F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, 0.8915F, 2.7561F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 70).addBox(1.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(27, 64).addBox(1.3F, -1.7911F, -2.0495F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8F, -0.6915F, -1.6561F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(108, 110).addBox(-1.25F, -0.416F, 0.1705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -1.5679F, 0.1083F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(70, 104).addBox(-0.253F, -0.8268F, -0.3192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.75F, -1.5679F, 0.1083F, -0.5694F, -0.4526F, 0.2729F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 110).addBox(-1.25F, -0.8268F, 0.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -1.5679F, 0.1083F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 37).addBox(-1.25F, -0.7771F, -2.6665F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -1.5679F, 0.1083F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(71, 81).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.9632F, -3.7941F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 9).addBox(-2.9F, -0.4222F, -3.7757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -2.2842F, -1.6532F, -0.1685F, 0.2483F, -0.0973F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(104, 52).addBox(1.5338F, -0.3496F, -4.2861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -2.7915F, -4.7561F, 0.1629F, 0.0089F, 0.0167F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 14).addBox(0.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7915F, -4.7561F, 0.0756F, -0.2729F, 0.0524F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(32, 39).addBox(-0.3855F, -0.3664F, -6.4922F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7915F, -4.7561F, 0.1431F, -0.4269F, 0.0082F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(109, 96).addBox(-0.5F, -1.475F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5561F, -0.8854F, -5.48F, -0.47F, -0.6214F, 0.0621F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 83).addBox(-0.8812F, -2.0171F, 4.5286F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.7216F, -0.2094F, 0.0009F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(88, 75).addBox(-0.8812F, -1.7691F, 5.0904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.6779F, -0.2094F, 0.0009F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 54).addBox(-0.8812F, -0.7249F, 7.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.547F, -0.2094F, 0.0009F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 49).addBox(-0.8812F, -1.5024F, 7.1942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.6517F, -0.2094F, 0.0009F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 87).addBox(-0.8812F, -1.3834F, 2.1226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.5907F, -0.2094F, 0.0009F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 35).addBox(-0.8812F, -0.516F, -1.2202F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.175F, 1.6835F, -3.8811F, -0.2416F, -0.2094F, 0.0009F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(124, 124).addBox(0.7962F, -0.5574F, -3.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.3085F, -3.356F, 0.3988F, -0.2434F, 0.0217F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(109, 100).addBox(-0.3631F, 0.3108F, -5.4607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.3085F, -3.356F, 0.1582F, -0.5715F, -0.0311F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(97, 20).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0879F, -2.1937F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(124, 16).addBox(-1.0F, -0.274F, -0.2559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 1.1382F, -0.2277F, 0.1363F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(114, 72).addBox(-1.0F, 0.7594F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.9637F, -0.2277F, 0.1363F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(111, 18).addBox(-1.0F, 4.2141F, -0.1244F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.9113F, -0.2277F, 0.1363F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 78).addBox(-1.0F, 4.2088F, 0.166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.8677F, -0.2277F, 0.1363F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(108, 114).addBox(-1.0F, 2.4273F, 0.4676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.7978F, -0.2277F, 0.1363F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(114, 68).addBox(-1.0F, 2.5687F, -0.1564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.92F, -0.2277F, 0.1363F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 123).addBox(-1.0F, -1.2433F, 0.1414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 1.664F, -1.2747F, 0.6146F, -0.2277F, 0.1363F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.8915F, 2.7561F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-3.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 64).mirror().addBox(-2.3F, -1.7911F, -2.0495F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -0.6915F, -1.6561F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(108, 110).mirror().addBox(0.25F, -0.416F, 0.1705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.5679F, 0.1083F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 104).mirror().addBox(-0.747F, -0.8268F, -0.3192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.5679F, 0.1083F, -0.5694F, 0.4526F, -0.2729F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(0.25F, -0.8268F, 0.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.5679F, 0.1083F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-1.75F, -0.7771F, -2.6665F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.5679F, 0.1083F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 81).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9632F, -3.7941F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(0.9F, -0.4222F, -3.7757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.2842F, -1.6532F, -0.1685F, -0.2483F, 0.0973F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(104, 52).mirror().addBox(-2.5338F, -0.3496F, -4.2861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.7915F, -4.7561F, 0.1629F, -0.0089F, -0.0167F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-2.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.7915F, -4.7561F, 0.0756F, 0.2729F, -0.0524F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(-0.6145F, -0.3664F, -6.4922F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.7915F, -4.7561F, 0.1431F, 0.4269F, -0.0082F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(109, 96).mirror().addBox(-0.5F, -1.475F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5561F, -0.8854F, -5.48F, -0.47F, 0.6214F, -0.0621F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(87, 83).mirror().addBox(-0.1188F, -2.0171F, 4.5286F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.7216F, 0.2094F, -0.0009F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(88, 75).mirror().addBox(-0.1188F, -1.7691F, 5.0904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.6779F, 0.2094F, -0.0009F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-0.1188F, -0.7249F, 7.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.547F, 0.2094F, -0.0009F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(88, 49).mirror().addBox(-0.1188F, -1.5024F, 7.1942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.6517F, 0.2094F, -0.0009F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.1188F, -1.3834F, 2.1226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.5907F, 0.2094F, -0.0009F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(15, 35).mirror().addBox(-0.1188F, -0.516F, -1.2202F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.6835F, -3.8811F, -0.2416F, 0.2094F, -0.0009F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(124, 124).mirror().addBox(-1.7962F, -0.5574F, -3.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.3085F, -3.356F, 0.3988F, 0.2434F, -0.0217F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(-0.6369F, 0.3108F, -5.4607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.3085F, -3.356F, 0.1582F, 0.5715F, 0.0311F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0879F, -2.1937F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(124, 16).mirror().addBox(0.0F, -0.274F, -0.2559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 1.1382F, 0.2277F, -0.1363F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(114, 72).mirror().addBox(0.0F, 0.7594F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.9637F, 0.2277F, -0.1363F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(111, 18).mirror().addBox(0.0F, 4.2141F, -0.1244F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.9113F, 0.2277F, -0.1363F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(0.0F, 4.2088F, 0.166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.8677F, 0.2277F, -0.1363F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(108, 114).mirror().addBox(0.0F, 2.4273F, 0.4676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.7978F, 0.2277F, -0.1363F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(114, 68).mirror().addBox(0.0F, 2.5687F, -0.1564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.92F, 0.2277F, -0.1363F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 123).mirror().addBox(0.0F, -1.2433F, 0.1414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.664F, -1.2747F, 0.6146F, 0.2277F, -0.1363F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(63, 9).addBox(0.0F, 0.5487F, -0.3449F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(3.0F, 0.9151F, -0.1001F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r77 = backleftleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 98).addBox(-1.0F, -1.5F, -0.425F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.6291F, 0.2953F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r78 = backleftleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 92).addBox(-1.5F, -2.6F, -0.775F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.7291F, 0.0703F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r79 = backleftleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 59).addBox(0.25F, -2.7F, 2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backleftleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(62, 81).addBox(0.75F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r81 = backleftleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(124, 58).addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.385F, 0.9862F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backleftleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(124, 55).addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3881F, 1.0647F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backleftleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(124, 52).addBox(0.0F, 0.0F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5487F, 0.2551F, 0.2269F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 12.7549F, 0.0088F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backleftleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(22, 64).addBox(-0.4255F, -0.2538F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, -0.3027F, 0.5696F, -0.1048F, -0.003F, 0.0435F));

		PartDefinition cube_r85 = backleftleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(96, 83).addBox(-1.0F, -0.6241F, -1.1383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 1.9696F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r86 = backleftleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(77, 104).addBox(-1.0F, -4.688F, -0.0607F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r87 = backleftleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 97).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.1875F, 0.9111F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r88 = backleftleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 66).addBox(-1.0F, -2.9F, -1.1F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r89 = backleftleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 73).addBox(-1.0F, -1.1F, -0.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 0.0696F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0105F, 9.4915F, 0.0038F, -0.1735F, 0.0F, 0.0F));

		PartDefinition cube_r90 = backleftleg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(36, 72).addBox(-2.0F, -2.3F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0119F, 1.6211F, -1.2246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5119F, 1.2232F, -0.9137F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r91 = backleftleg4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 42).addBox(-2.0F, -0.1F, -1.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2358F, -1.3451F, 0.4363F, 0.0041F, -0.0005F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(63, 20).addBox(-2.0F, 0.5487F, -0.4449F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.0F, 0.9151F, -0.1001F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r92 = backrightleg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, -1.5F, -0.475F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.6291F, 0.2953F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r93 = backrightleg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 93).addBox(-0.5F, -2.6F, -0.775F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 10.7291F, 0.0703F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r94 = backrightleg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 31).addBox(-2.25F, -2.7F, 2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r95 = backrightleg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 82).addBox(-2.75F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r96 = backrightleg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(124, 64).addBox(-1.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.385F, 0.9862F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = backrightleg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(124, 61).addBox(-1.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.3881F, 1.0647F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r98 = backrightleg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 124).addBox(-1.0F, 0.0F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5487F, 0.2551F, 0.2269F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 12.7549F, 0.0088F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r99 = backrightleg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 66).addBox(-0.5745F, -0.2538F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, -0.3027F, 0.5696F, -0.1048F, 0.003F, -0.0435F));

		PartDefinition cube_r100 = backrightleg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(97, 15).addBox(-1.0F, -0.6241F, -1.1383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 1.9696F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r101 = backrightleg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(107, 56).addBox(-1.0F, -4.688F, -0.0607F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r102 = backrightleg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(97, 93).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.1875F, 0.9111F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r103 = backrightleg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -2.9F, -1.1F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = backrightleg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(81, 24).addBox(-1.0F, -1.1F, -0.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 0.0696F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0105F, 9.4915F, 0.0038F, -0.1298F, 0.0F, 0.0F));

		PartDefinition cube_r105 = backrightleg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 37).addBox(-2.0F, -2.3F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0119F, 1.6211F, -1.2246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5119F, 1.2232F, -0.9137F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r106 = backrightleg4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 58).addBox(-2.0F, -0.1F, -1.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2358F, -1.3451F, 0.4363F, -0.0041F, 0.0005F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1422F, 4.8499F, -0.114F, -0.0867F, 0.0099F));

		PartDefinition cube_r107 = tail.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.75F, -0.0422F, -0.0827F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.167F, 0.9264F, -0.1225F, 0.0693F, -0.0085F));

		PartDefinition cube_r108 = tail.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(36, 117).addBox(0.0F, -3.3422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1065F, 6.9043F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(33, 117).addBox(0.0F, -3.6422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4495F, 4.9314F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(118, 22).addBox(0.0F, -0.1F, 2.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 126).addBox(0.0F, -1.5F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6205F, 2.1934F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(94, 117).addBox(0.0F, -2.0F, -0.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7538F, 8.0749F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 117).addBox(0.0F, -3.7422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5939F, 2.9341F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 117).addBox(0.0F, -3.4422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9369F, 0.9612F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 48).addBox(-0.25F, -0.0422F, -0.0827F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.167F, 0.9264F, -0.1225F, -0.0693F, 0.0085F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(19, 38).addBox(-0.5F, -1.0422F, 0.9173F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = tail.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5421F, -4.5473F, 4.0425F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r116 = leftPlate9.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(22, 114).addBox(-0.5F, -2.575F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7126F, 0.8394F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftPlate9.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(45, 113).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.1549F, -1.6031F, 0.5382F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftPlate9.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 113).addBox(-0.5F, -2.6571F, -1.7889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(131, 24).addBox(-0.5F, -0.6571F, -0.8889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -0.0811F, 0.552F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftPlate9.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(127, 134).addBox(-0.5F, -1.8F, -1.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, 0.7275F, -0.2734F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftPlate9.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, -1.8F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.7813F, -1.8441F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftPlate9.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(42, 108).addBox(-0.4992F, 0.1467F, -0.754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1541F, -0.9776F, -1.2516F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftPlate9.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 129).addBox(-0.5F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.1916F, 1.4164F, 1.1794F, 0.0149F, 0.0027F));

		PartDefinition cube_r123 = leftPlate9.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(129, 18).addBox(-0.5F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1954F, -3.5415F, 1.5935F, 1.2043F, -0.0524F, 0.0233F));

		PartDefinition cube_r124 = leftPlate9.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(2, 128).addBox(-0.5F, -0.575F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1954F, -3.5415F, 1.5935F, 0.9056F, -0.0227F, 0.0004F));

		PartDefinition cube_r125 = leftPlate9.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(77, 88).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -1.8097F, -0.6615F, 0.7505F, 0.0F, 0.0F));

		PartDefinition rightPlate9 = tail.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5421F, -4.5473F, 4.0425F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r126 = rightPlate9.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(22, 114).mirror().addBox(-0.5F, -2.575F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7126F, 0.8394F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightPlate9.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 113).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.6031F, 0.5382F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightPlate9.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(50, 113).mirror().addBox(-0.5F, -2.6571F, -1.7889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(131, 24).mirror().addBox(-0.5F, -0.6571F, -0.8889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0811F, 0.552F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightPlate9.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(127, 134).mirror().addBox(-0.5F, -1.8F, -1.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.7275F, -0.2734F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightPlate9.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(99, 10).mirror().addBox(-0.5F, -1.8F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7813F, -1.8441F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightPlate9.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(42, 108).mirror().addBox(-0.5008F, 0.1467F, -0.754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, -0.9776F, -1.2516F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightPlate9.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(70, 129).mirror().addBox(-0.5F, -0.45F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.1916F, 1.4164F, 1.1794F, -0.0149F, -0.0027F));

		PartDefinition cube_r133 = rightPlate9.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(129, 18).mirror().addBox(-0.5F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1954F, -3.5415F, 1.5935F, 1.2043F, 0.0524F, -0.0233F));

		PartDefinition cube_r134 = rightPlate9.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(2, 128).mirror().addBox(-0.5F, -0.575F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1954F, -3.5415F, 1.5935F, 0.9056F, 0.0227F, -0.0004F));

		PartDefinition cube_r135 = rightPlate9.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(77, 88).mirror().addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8097F, -0.6615F, 0.7505F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7615F, 7.6696F, -0.033F, -0.1744F, 0.0057F));

		PartDefinition cube_r136 = tail2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.2F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.198F, 0.9826F, -0.035F, 0.0523F, -0.0018F));

		PartDefinition cube_r137 = tail2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 126).addBox(0.0F, -2.4894F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5321F, 9.0334F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(27, 126).addBox(0.0F, -2.6894F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6019F, 7.0346F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(126, 19).addBox(0.0F, -2.9894F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6717F, 5.0358F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(42, 117).addBox(0.0F, -3.1894F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7415F, 3.037F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(39, 117).addBox(0.0F, -3.1894F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8113F, 1.0382F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(44, 134).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8728F, 8.8343F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(39, 126).addBox(0.0F, -0.6F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3783F, 5.8737F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(126, 36).addBox(0.0F, 0.4F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9923F, 0.4053F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(36, 126).addBox(0.0F, -0.925F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7589F, 2.2883F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 27).addBox(-0.8F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.45F, 0.198F, 0.9826F, -0.035F, -0.0523F, 0.0018F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.8894F, -0.5203F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0708F, 0.5071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = tail2.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1225F, -4.4209F, 3.751F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r148 = leftPlate10.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(119, 66).addBox(-0.5F, -1.7F, -1.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7126F, 0.8394F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftPlate10.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 101).addBox(-0.5F, -0.175F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftPlate10.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 114).addBox(-0.5F, -1.5F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -0.6926F, -0.6041F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftPlate10.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 131).addBox(-0.5F, -0.8071F, -1.0638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -0.0811F, 0.552F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftPlate10.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(129, 34).addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, 0.3156F, -1.468F, -0.0634F, 0.078F, -0.001F));

		PartDefinition cube_r153 = leftPlate10.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(55, 119).addBox(-0.4992F, -1.2533F, -0.379F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1541F, -0.9776F, -1.2516F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftPlate10.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(100, 131).addBox(-0.5132F, -0.5218F, -0.8964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1731F, -2.7231F, 0.4719F, 1.3976F, 0.014F, 0.0059F));

		PartDefinition cube_r155 = leftPlate10.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(28, 131).addBox(-0.48F, -0.4952F, -0.4042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1731F, -2.7231F, 0.4719F, 1.4227F, -0.0562F, 0.0114F));

		PartDefinition cube_r156 = leftPlate10.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(95, 131).addBox(-0.4795F, -0.5867F, -0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2496F))
				.texOffs(85, 131).addBox(-0.4795F, -0.5867F, -0.6129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1731F, -2.7231F, 0.4719F, 1.1238F, -0.0223F, -0.0045F));

		PartDefinition cube_r157 = leftPlate10.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5F, -0.35F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(130, 131).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -1.8097F, -0.6615F, 0.7156F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = tail2.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1225F, -4.4209F, 3.751F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r158 = rightPlate10.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(119, 66).mirror().addBox(-0.5F, -1.7F, -1.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7126F, 0.8394F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r159 = rightPlate10.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 101).mirror().addBox(-0.5F, -0.175F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightPlate10.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-0.5F, -1.5F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6926F, -0.6041F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightPlate10.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(33, 131).mirror().addBox(-0.5F, -0.8071F, -1.0638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0811F, 0.552F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightPlate10.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(129, 34).mirror().addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3156F, -1.468F, -0.0634F, -0.078F, 0.001F));

		PartDefinition cube_r163 = rightPlate10.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 119).mirror().addBox(-0.5008F, -1.2533F, -0.379F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, -0.9776F, -1.2516F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r164 = rightPlate10.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(100, 131).mirror().addBox(-0.4868F, -0.5218F, -0.8964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1731F, -2.7231F, 0.4719F, 1.3976F, -0.014F, -0.0059F));

		PartDefinition cube_r165 = rightPlate10.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(28, 131).mirror().addBox(-0.52F, -0.4952F, -0.4042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1731F, -2.7231F, 0.4719F, 1.4227F, 0.0562F, -0.0114F));

		PartDefinition cube_r166 = rightPlate10.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(95, 131).mirror().addBox(-0.5205F, -0.5867F, -0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2496F)).mirror(false)
				.texOffs(85, 131).mirror().addBox(-0.5205F, -0.5867F, -0.6129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1731F, -2.7231F, 0.4719F, 1.1238F, 0.0223F, 0.0045F));

		PartDefinition cube_r167 = rightPlate10.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.5F, -0.35F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(130, 131).mirror().addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8097F, -0.6615F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5165F, 9.9012F, -0.0309F, -0.1743F, -0.0098F));

		PartDefinition cube_r168 = tail3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(23, 134).addBox(0.0F, -1.8455F, -0.0252F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3712F, 8.9586F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(134, 19).addBox(0.0F, -1.7455F, -0.0252F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3664F, 6.9561F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(134, 58).addBox(0.0F, -0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 54).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 7.0431F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(134, 50).addBox(0.0F, 0.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 134).addBox(0.0F, 0.2F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 134).addBox(0.0F, -0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3562F, -1.0668F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(134, 15).addBox(0.0F, -1.8205F, -0.0252F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2617F, 4.9588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(8, 134).addBox(0.0F, -1.9455F, -0.0252F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1571F, 2.9615F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(126, 31).addBox(0.0F, -2.2705F, -0.0002F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0261F, 0.9406F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9455F, -0.8252F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3995F, -4.128F, 10.0158F, 0.0675F, -0.0355F, 0.1711F));

		PartDefinition cube_r176 = leftPlate12.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(119, 98).addBox(-0.5F, -0.725F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7328F, 0.182F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftPlate12.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(119, 94).addBox(-0.5F, 0.125F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftPlate12.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, 0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -1.7959F, 0.3084F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftPlate12.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(90, 129).addBox(-0.5F, -0.05F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(75, 129).addBox(-0.5F, 0.525F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.9422F, -0.8308F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftPlate12.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(27, 123).addBox(-0.4992F, 0.6467F, -0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1541F, -0.9776F, -1.2516F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftPlate12.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(52, 131).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -1.0295F, -0.7448F, 0.624F, 0.0F, 0.0F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3995F, -4.128F, 10.0158F, 0.0675F, 0.0355F, -0.1711F));

		PartDefinition cube_r182 = rightPlate12.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(119, 98).mirror().addBox(-0.5F, -0.725F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7328F, 0.182F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightPlate12.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(119, 94).mirror().addBox(-0.5F, 0.125F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightPlate12.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.5F, 0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7959F, 0.3084F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightPlate12.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(90, 129).mirror().addBox(-0.5F, -0.05F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(75, 129).mirror().addBox(-0.5F, 0.525F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.9422F, -0.8308F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightPlate12.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(27, 123).mirror().addBox(-0.5008F, 0.6467F, -0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, -0.9776F, -1.2516F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightPlate12.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(52, 131).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0295F, -0.7448F, 0.624F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail3.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.686F, -3.9511F, 1.2259F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r188 = leftPlate11.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(119, 90).addBox(-0.5F, -0.8F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(119, 86).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7328F, 0.182F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftPlate11.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(77, 119).addBox(-0.5F, 0.125F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftPlate11.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 114).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -1.7959F, 0.3084F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftPlate11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(130, 128).addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, 0.2537F, -0.0998F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftPlate11.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(72, 119).addBox(-0.5F, -1.125F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.9422F, -0.8308F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftPlate11.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(110, 131).addBox(-0.5F, -0.35F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1523F, -1.8439F, 0.2962F, 1.5722F, 0.014F, 0.0059F));

		PartDefinition cube_r194 = leftPlate11.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(38, 131).addBox(-0.45F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1578F, -2.2707F, 0.404F, 1.6404F, -0.0476F, 0.0321F));

		PartDefinition cube_r195 = leftPlate11.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(131, 112).addBox(-0.4795F, -0.5867F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1732F, -2.4731F, 0.4719F, 0.731F, -0.0223F, 0.0044F));

		PartDefinition cube_r196 = leftPlate11.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(18, 132).addBox(-0.5F, -0.15F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -2.2103F, -0.3623F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftPlate11.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(13, 132).addBox(-0.5F, -0.15F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -1.8097F, -0.6615F, 0.9294F, 0.0F, 0.0F));

		PartDefinition rightPlate11 = tail3.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -3.9511F, 1.2259F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r198 = rightPlate11.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(119, 90).mirror().addBox(-0.5F, -0.8F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(119, 86).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7328F, 0.182F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightPlate11.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(77, 119).mirror().addBox(-0.5F, 0.125F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightPlate11.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(17, 114).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7959F, 0.3084F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightPlate11.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(130, 128).mirror().addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2537F, -0.0998F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightPlate11.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(72, 119).mirror().addBox(-0.5F, -1.125F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.9422F, -0.8308F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightPlate11.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(110, 131).mirror().addBox(-0.5F, -0.35F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1523F, -1.8439F, 0.2962F, 1.5722F, -0.014F, -0.0059F));

		PartDefinition cube_r204 = rightPlate11.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(38, 131).mirror().addBox(-0.55F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1578F, -2.2707F, 0.404F, 1.6404F, 0.0476F, -0.0321F));

		PartDefinition cube_r205 = rightPlate11.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(131, 112).mirror().addBox(-0.5205F, -0.5867F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1732F, -2.4731F, 0.4719F, 0.731F, 0.0223F, -0.0044F));

		PartDefinition cube_r206 = rightPlate11.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(18, 132).mirror().addBox(-0.5F, -0.15F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.2103F, -0.3623F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightPlate11.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(13, 132).mirror().addBox(-0.5F, -0.15F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8097F, -0.6615F, 0.9294F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0749F, 10.8635F, 0.2413F, -0.29F, -0.0972F));

		PartDefinition cube_r208 = tail4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(134, 34).addBox(0.0F, -1.7055F, -0.061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3156F, 8.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(32, 134).addBox(0.0F, -1.6556F, -0.036F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3583F, 6.0753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(134, 30).addBox(0.0F, -1.7555F, -0.061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3506F, 4.1002F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(113, 34).addBox(0.0F, 3.1F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 107).addBox(0.0F, 2.7F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 37).addBox(0.0F, 2.1F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 56).addBox(0.0F, 1.4F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 62).addBox(0.0F, -0.2F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7387F, -3.8205F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(29, 134).addBox(0.0F, -1.8056F, 0.039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3689F, 2.0003F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(26, 134).addBox(0.0F, -1.8555F, 0.039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4363F, 0.0008F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(23, 27).addBox(-0.5F, -0.5056F, 0.139F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate14 = tail4.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.393F, -2.7231F, 6.1965F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r215 = leftPlate14.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(129, 119).addBox(-0.5F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -0.0529F, -0.312F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftPlate14.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(129, 116).addBox(-0.5F, 0.275F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7328F, 0.182F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftPlate14.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(129, 97).addBox(-0.5F, 0.525F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftPlate14.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(129, 122).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.1549F, 0.2797F, -0.8466F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftPlate14.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(131, 43).addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1971F, -0.585F, -0.3539F, 1.2651F, -0.042F, 0.0391F));

		PartDefinition cube_r220 = leftPlate14.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(47, 130).addBox(-0.5F, -0.45F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1971F, -0.585F, -0.3539F, 0.9161F, -0.042F, 0.0391F));

		PartDefinition rightPlate14 = tail4.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.393F, -2.7231F, 6.1965F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r221 = rightPlate14.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(129, 119).mirror().addBox(-0.5F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0529F, -0.312F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightPlate14.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(129, 116).mirror().addBox(-0.5F, 0.275F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7328F, 0.182F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightPlate14.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(129, 97).mirror().addBox(-0.5F, 0.525F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5012F, 0.3316F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightPlate14.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(129, 122).mirror().addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2797F, -0.8466F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightPlate14.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(131, 43).mirror().addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1971F, -0.585F, -0.3539F, 1.2651F, 0.042F, -0.0391F));

		PartDefinition cube_r226 = rightPlate14.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(47, 130).mirror().addBox(-0.5F, -0.45F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1971F, -0.585F, -0.3539F, 0.9161F, 0.042F, -0.0391F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0449F, 9.0714F, 0.2974F, -0.2928F, -0.0882F));

		PartDefinition cube_r227 = tail5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(75, 50).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3784F, 6.8667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(41, 134).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8784F, 5.3667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(38, 134).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3784F, 2.8667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(35, 134).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3784F, 0.8667F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(134, 95).addBox(0.0F, 0.0F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 134).addBox(0.0F, -0.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 92).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 89).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8536F, 1.6337F, 0.1396F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(44, 27).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1216F, 7.8667F, -0.2628F, -0.2876F, 0.0823F));

		PartDefinition cube_r232 = tail6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(92, 41).addBox(0.0F, -0.175F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.775F, 5.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(84, 70).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.775F, 3.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(17, 82).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.775F, 1.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail6.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5541F, -1.6718F, 1.4498F, 0.043F, 0.3061F, 0.5509F));

		PartDefinition cube_r235 = leftPlate13.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(134, 132).addBox(-0.5F, -4.7F, -0.575F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -2.2493F, 2.1586F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftPlate13.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(134, 117).addBox(-0.5F, -5.8F, -0.275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.1018F, -0.209F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftPlate13.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(121, 32).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.1536F, 1.1547F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftPlate13.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -0.5603F, 0.0883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, 0.0967F, -0.6283F, -0.2356F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = tail6.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5541F, -1.6718F, 1.4498F, 0.043F, -0.3061F, -0.5509F));

		PartDefinition cube_r239 = rightPlate13.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(134, 132).mirror().addBox(-0.5F, -4.7F, -0.575F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2493F, 2.1586F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightPlate13.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(134, 117).mirror().addBox(-0.5F, -5.8F, -0.275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.1018F, -0.209F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightPlate13.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-0.5F, -1.4F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1536F, 1.1547F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightPlate13.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, -0.5603F, 0.0883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0967F, -0.6283F, -0.2356F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = tail6.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6142F, -1.2123F, 5.0698F, -0.3061F, 0.3061F, 0.5509F));

		PartDefinition cube_r243 = leftPlate19.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(35, 111).addBox(-0.5F, -2.0F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -0.7233F, 1.0808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftPlate19.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(134, 77).addBox(-0.5F, -4.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.4868F, 1.4538F, -0.6021F, 0.0F, 0.0F));

		PartDefinition rightPlate19 = tail6.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6142F, -1.2123F, 5.0698F, -0.3061F, -0.3061F, -0.5509F));

		PartDefinition cube_r245 = rightPlate19.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(35, 111).mirror().addBox(-0.5F, -2.0F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.7233F, 1.0808F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightPlate19.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(134, 77).mirror().addBox(-0.5F, -4.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.4868F, 1.4538F, -0.6021F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(64, 47).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0427F, -0.0211F, 7.9567F, -0.124F, -0.1732F, 0.0215F));

		PartDefinition leftPlate18 = tail5.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.542F, -2.4289F, 2.6308F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r247 = leftPlate18.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(80, 131).addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.197F, 0.165F, -0.7539F, 1.2651F, -0.042F, 0.0391F));

		PartDefinition cube_r248 = leftPlate18.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(131, 71).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.197F, 0.165F, -0.7539F, 0.9161F, -0.042F, 0.0391F));

		PartDefinition rightPlate18 = tail5.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.542F, -2.4289F, 2.6308F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r249 = rightPlate18.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(80, 131).mirror().addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.197F, 0.165F, -0.7539F, 1.2651F, 0.042F, -0.0391F));

		PartDefinition cube_r250 = rightPlate18.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(131, 71).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.197F, 0.165F, -0.7539F, 0.9161F, 0.042F, -0.0391F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5967F, -5.1249F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r251 = body2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(5, 132).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4276F, -2.7453F, 0.1501F, -0.1168F, 1.9495F));

		PartDefinition cube_r252 = body2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 111).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4276F, -2.7453F, 0.1478F, 0.1399F, 0.6164F));

		PartDefinition cube_r253 = body2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(107, 122).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.4276F, -2.7453F, 0.0747F, 0.1892F, 0.1767F));

		PartDefinition cube_r254 = body2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(84, 134).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3276F, -4.7453F, 0.1139F, -0.2059F, 1.9553F));

		PartDefinition cube_r255 = body2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(11, 119).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3276F, -4.7453F, 0.2264F, 0.084F, 0.6251F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3276F, -4.7453F, 0.1706F, 0.1714F, 0.1939F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(90, 132).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0276F, -6.6453F, 0.0763F, -0.2947F, 1.9646F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(116, 16).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0276F, -6.6453F, 0.3042F, 0.0277F, 0.6295F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(63, 95).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0276F, -6.6453F, 0.2658F, 0.1522F, 0.2093F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4724F, -8.5453F, 0.3434F, 0.1355F, 0.2204F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(60, 114).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4724F, -8.5453F, 0.3677F, -0.0186F, 0.6298F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(75, 132).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4724F, -8.5453F, 0.0441F, -0.3671F, 1.9751F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(81, 134).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0724F, -10.5453F, 0.006F, -0.4471F, 1.9902F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(111, 118).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0724F, -10.5453F, 0.4384F, -0.0699F, 0.6267F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0724F, -10.5453F, 0.4291F, 0.1159F, 0.2312F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(132, 81).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.6527F, -0.6699F, 0.1984F, 0.0049F, 1.7897F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.6527F, -0.6699F, 0.0386F, 0.2146F, 0.44F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 117).addBox(-0.5F, -5.2893F, 9.3354F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 116).addBox(-0.5F, -5.2893F, 7.3354F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 116).addBox(-0.5F, -5.1893F, 5.3354F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -1.8893F, 4.3354F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.0369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(5, 132).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4276F, -2.7453F, 0.1501F, 0.1168F, -1.9495F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(94, 111).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4276F, -2.7453F, 0.1478F, -0.1399F, -0.6164F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(107, 122).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.4276F, -2.7453F, 0.0747F, -0.1892F, -0.1767F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 134).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3276F, -4.7453F, 0.1139F, 0.2059F, -1.9553F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(11, 119).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3276F, -4.7453F, 0.2264F, -0.084F, -0.6251F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(35, 49).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3276F, -4.7453F, 0.1706F, -0.1714F, -0.1939F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(90, 132).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0276F, -6.6453F, 0.0763F, 0.2947F, -1.9646F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(116, 16).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0276F, -6.6453F, 0.3042F, -0.0277F, -0.6295F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 95).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0276F, -6.6453F, 0.2658F, -0.1522F, -0.2093F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(14, 75).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4724F, -8.5453F, 0.3434F, -0.1355F, -0.2204F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 114).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4724F, -8.5453F, 0.3677F, 0.0186F, -0.6298F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(75, 132).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4724F, -8.5453F, 0.0441F, 0.3671F, -1.9751F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 134).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0724F, -10.5453F, 0.006F, 0.4471F, -1.9902F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(111, 118).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0724F, -10.5453F, 0.4384F, 0.0699F, -0.6267F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(47, 72).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0724F, -10.5453F, 0.4291F, -0.1159F, -0.2312F));

		PartDefinition cube_r284 = body2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(116, 98).addBox(-0.5F, -3.2006F, -0.0096F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0073F, -6.8618F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r285 = body2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(97, 116).addBox(-0.5F, -3.2006F, -0.0096F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5418F, -8.7891F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r286 = body2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(116, 92).addBox(-0.5F, -3.1007F, -0.0096F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0763F, -10.7163F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r287 = body2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -1.1007F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.0369F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r288 = body2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(132, 81).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.6527F, -0.6699F, 0.1984F, -0.0049F, -1.7897F));

		PartDefinition cube_r289 = body2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 125).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.6527F, -0.6699F, 0.0386F, -0.2146F, -0.44F));

		PartDefinition leftPlate6 = body2.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6784F, -3.1576F, -9.7731F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition cube_r290 = leftPlate6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(28, 112).addBox(-0.5F, -0.25F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -3.686F, 1.4707F, -0.018F, -0.006F, 0.0012F));

		PartDefinition cube_r291 = leftPlate6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(30, 99).addBox(-0.5F, -0.2071F, -2.1139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.3362F, 2.0138F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftPlate6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(72, 53).addBox(-0.5F, -4.25F, -1.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftPlate6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(92, 35).addBox(-0.5F, -3.0F, -0.525F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.8783F, -0.9516F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftPlate6.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(86, 44).addBox(-0.5F, -0.225F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftPlate6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(109, 87).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -4.4266F, 1.0092F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftPlate6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(108, 106).addBox(-0.5F, -0.2F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1549F, -4.5935F, -0.4059F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = body2.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6784F, -3.1576F, -9.7731F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition cube_r297 = rightPlate6.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(28, 112).mirror().addBox(-0.5F, -0.25F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.686F, 1.4707F, -0.018F, 0.006F, -0.0012F));

		PartDefinition cube_r298 = rightPlate6.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.5F, -0.2071F, -2.1139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3362F, 2.0138F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightPlate6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-0.5F, -4.25F, -1.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightPlate6.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(92, 35).mirror().addBox(-0.5F, -3.0F, -0.525F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8783F, -0.9516F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightPlate6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(86, 44).mirror().addBox(-0.5F, -0.225F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightPlate6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(109, 87).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -4.4266F, 1.0092F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightPlate6.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(108, 106).mirror().addBox(-0.5F, -0.2F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -4.5935F, -0.4059F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = body2.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7319F, -4.4046F, -2.4648F, 0.2856F, -0.0355F, 0.1711F));

		PartDefinition cube_r304 = leftPlate7.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.1071F, -1.9638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.3362F, 2.0138F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftPlate7.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(129, 0).addBox(-0.5F, -1.45F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.1552F, -1.2436F, -0.5432F, 0.0077F, -0.0171F));

		PartDefinition cube_r306 = leftPlate7.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(72, 73).addBox(-0.5F, -5.0F, -1.425F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftPlate7.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 99).addBox(-0.4992F, -0.8533F, -1.529F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1541F, -0.9776F, -1.2516F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftPlate7.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(68, 88).addBox(-0.5F, -0.275F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftPlate7.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(119, 54).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1173F, -6.7179F, 1.2884F, -0.1634F, -0.0227F, 0.0004F));

		PartDefinition cube_r310 = leftPlate7.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.525F, -0.575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1173F, -6.7179F, 1.2884F, -0.0325F, -0.0227F, 0.0004F));

		PartDefinition cube_r311 = leftPlate7.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(128, 61).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.146F, -6.1659F, 0.0151F, 0.9056F, -0.0227F, 0.0004F));

		PartDefinition cube_r312 = leftPlate7.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, -0.2F, -0.275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1549F, -2.2049F, -2.1568F, 1.0647F, 0.0F, 0.0F));

		PartDefinition leftPlate20 = body2.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7319F, -4.4046F, -2.4648F, 0.2856F, 0.0355F, -0.1711F));

		PartDefinition cube_r313 = leftPlate20.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.5F, -0.1071F, -1.9638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3362F, 2.0138F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftPlate20.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(129, 0).mirror().addBox(-0.5F, -1.45F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.1552F, -1.2436F, -0.5432F, -0.0077F, 0.0171F));

		PartDefinition cube_r315 = leftPlate20.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-0.5F, -5.0F, -1.425F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftPlate20.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.5008F, -0.8533F, -1.529F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1541F, -0.9776F, -1.2516F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r317 = leftPlate20.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-0.5F, -0.275F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -5.3289F, 0.3678F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftPlate20.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-0.5F, -0.2F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1173F, -6.7179F, 1.2884F, -0.1634F, 0.0227F, -0.0004F));

		PartDefinition cube_r319 = leftPlate20.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.5F, -0.525F, -0.575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1173F, -6.7179F, 1.2884F, -0.0325F, 0.0227F, -0.0004F));

		PartDefinition cube_r320 = leftPlate20.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.146F, -6.1659F, 0.0151F, 0.9056F, 0.0227F, -0.0004F));

		PartDefinition cube_r321 = leftPlate20.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(16, 27).mirror().addBox(-0.5F, -0.2F, -0.275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.2049F, -2.1568F, 1.0647F, 0.0F, 0.0F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6797F, -10.4136F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r322 = upperbody.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.083F, -1.8375F, 0.3318F, 0.1248F, 0.2016F));

		PartDefinition cube_r323 = upperbody.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.083F, -1.8375F, 0.3529F, -0.0238F, 0.6128F));

		PartDefinition cube_r324 = upperbody.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(67, 133).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.083F, -1.8375F, 0.0351F, -0.3538F, 1.961F));

		PartDefinition cube_r325 = upperbody.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.567F, -3.7625F, 0.392F, 0.1124F, 0.2087F));

		PartDefinition cube_r326 = upperbody.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.567F, -3.7625F, 0.403F, -0.0589F, 0.6107F));

		PartDefinition cube_r327 = upperbody.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(87, 134).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.567F, -3.7625F, 0.0098F, -0.4102F, 1.9704F));

		PartDefinition cube_r328 = upperbody.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(18, 70).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.167F, -5.6125F, 0.4264F, 0.1051F, 0.2125F));

		PartDefinition cube_r329 = upperbody.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(63, 115).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.167F, -5.6125F, 0.4317F, -0.0789F, 0.6087F));

		PartDefinition cube_r330 = upperbody.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(134, 85).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.167F, -5.6125F, -0.0052F, -0.4424F, 1.9766F));

		PartDefinition cube_r331 = upperbody.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(62, 66).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.083F, -1.8375F, 0.3318F, -0.1248F, -0.2016F));

		PartDefinition cube_r332 = upperbody.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(118, 112).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.083F, -1.8375F, 0.3529F, 0.0238F, -0.6128F));

		PartDefinition cube_r333 = upperbody.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 133).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.083F, -1.8375F, 0.0351F, 0.3538F, -1.961F));

		PartDefinition cube_r334 = upperbody.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(72, 61).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.567F, -3.7625F, 0.392F, -0.1124F, -0.2087F));

		PartDefinition cube_r335 = upperbody.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 119).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.567F, -3.7625F, 0.403F, 0.0589F, -0.6107F));

		PartDefinition cube_r336 = upperbody.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(87, 134).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.567F, -3.7625F, 0.0098F, 0.4102F, -1.9704F));

		PartDefinition cube_r337 = upperbody.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(18, 70).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.167F, -5.6125F, 0.4264F, -0.1051F, -0.2125F));

		PartDefinition cube_r338 = upperbody.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(63, 115).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.167F, -5.6125F, 0.4317F, 0.0789F, -0.6087F));

		PartDefinition cube_r339 = upperbody.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(134, 85).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.167F, -5.6125F, -0.0052F, 0.4424F, -1.9766F));

		PartDefinition cube_r340 = upperbody.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(91, 116).addBox(-0.5F, -3.3553F, 0.0204F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0603F, -2.0572F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r341 = upperbody.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(88, 116).addBox(-0.5F, -3.8553F, 3.6204F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 48).addBox(-1.0F, -0.7053F, 1.6204F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 2.3164F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r342 = upperbody.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(52, 125).addBox(-0.5F, -2.8803F, -0.9796F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.867F, -4.9485F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = upperbody.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5302F, -2.9241F, -4.4159F, 0.4175F, -0.0754F, 0.1534F));

		PartDefinition cube_r343 = leftPlate5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(88, 110).addBox(-0.5F, -0.375F, -1.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -3.2972F, 1.6041F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r344 = leftPlate5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(65, 73).addBox(-0.5F, -4.225F, -1.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r345 = leftPlate5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(93, 63).addBox(-0.5F, -2.125F, -0.525F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.8783F, -0.9516F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r346 = leftPlate5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(17, 85).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, -4.4873F, 0.7314F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r347 = leftPlate5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, 0.075F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -5.3289F, 0.3678F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r348 = leftPlate5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(78, 83).addBox(-0.5F, -0.325F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1549F, -5.3289F, 0.3678F, 1.0908F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = upperbody.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5302F, -2.9241F, -4.4159F, 0.4175F, 0.0754F, -0.1534F));

		PartDefinition cube_r349 = rightPlate5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(88, 110).mirror().addBox(-0.5F, -0.375F, -1.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2972F, 1.6041F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightPlate5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.5F, -4.225F, -1.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, 0.1509F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightPlate5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(93, 63).mirror().addBox(-0.5F, -2.125F, -0.525F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8783F, -0.9516F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightPlate5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -4.4873F, 0.7314F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightPlate5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-0.5F, 0.075F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -5.3289F, 0.3678F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightPlate5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.5F, -0.325F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -5.3289F, 0.3678F, 1.0908F, 0.0F, 0.0F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3936F, 2.3346F, -5.1865F, 0.2127F, -0.0425F, -0.0083F));

		PartDefinition cube_r355 = chest.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.7053F, -6.3796F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8936F, -0.1506F, -1.7052F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r356 = chest.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, 0.5491F, 0.0997F, 0.0505F));

		PartDefinition cube_r357 = chest.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(32, 49).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, 0.4439F, 0.1044F, 0.0398F));

		PartDefinition cube_r358 = chest.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(97, 69).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.3387F, 0.108F, 0.0286F));

		PartDefinition cube_r359 = chest.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(118, 76).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, 0.5434F, -0.1297F, 0.4226F));

		PartDefinition cube_r360 = chest.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(132, 77).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, -0.0097F, -0.4593F, 1.804F));

		PartDefinition cube_r361 = chest.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(78, 134).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, -0.0382F, -0.5611F, 1.818F));

		PartDefinition cube_r362 = chest.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(69, 115).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, 0.4475F, -0.0862F, 0.4329F));

		PartDefinition cube_r363 = chest.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(66, 115).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.3524F, -0.0419F, 0.439F));

		PartDefinition cube_r364 = chest.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(134, 66).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.0161F, -0.3573F, 1.7938F));

		PartDefinition cube_r365 = chest.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(59, 20).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, 0.5491F, -0.0997F, -0.0505F));

		PartDefinition cube_r366 = chest.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(118, 76).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, 0.5434F, 0.1297F, -0.4226F));

		PartDefinition cube_r367 = chest.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(78, 134).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, -0.0382F, 0.5611F, -1.818F));

		PartDefinition cube_r368 = chest.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(32, 49).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, 0.4439F, -0.1044F, -0.0398F));

		PartDefinition cube_r369 = chest.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(69, 115).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, 0.4475F, 0.0862F, -0.4329F));

		PartDefinition cube_r370 = chest.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(132, 77).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, -0.0097F, 0.4593F, -1.804F));

		PartDefinition cube_r371 = chest.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(97, 69).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.3387F, -0.108F, -0.0286F));

		PartDefinition cube_r372 = chest.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(66, 115).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.3524F, 0.0419F, -0.439F));

		PartDefinition cube_r373 = chest.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(134, 66).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.0161F, 0.3573F, -1.7938F));

		PartDefinition cube_r374 = chest.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(39, 91).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.2509F, 0.11F, 0.019F));

		PartDefinition cube_r375 = chest.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(115, 23).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.2735F, -0.0048F, 0.4408F));

		PartDefinition cube_r376 = chest.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(64, 133).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.0361F, -0.2722F, 1.7876F));

		PartDefinition cube_r377 = chest.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(39, 91).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.2509F, -0.11F, -0.019F));

		PartDefinition cube_r378 = chest.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(115, 23).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.2735F, 0.0048F, -0.4408F));

		PartDefinition cube_r379 = chest.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 133).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.0361F, 0.2722F, -1.7876F));

		PartDefinition cube_r380 = chest.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(24, 125).addBox(-0.5F, -2.5053F, -0.0796F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, 1.267F, -7.8639F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r381 = chest.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(82, 116).mirror().addBox(0.5F, -2.9053F, -0.0796F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, -0.728F, -2.2018F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r382 = chest.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(116, 86).addBox(-0.5F, -3.0053F, 0.0204F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, 0.6003F, -6.0819F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r383 = chest.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(85, 116).addBox(-0.5F, -2.9053F, 0.0204F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, -0.0965F, -4.2046F, 0.2356F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create().texOffs(74, 29).addBox(-1.5F, 2.4868F, -1.131F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(4.6828F, 7.4154F, -5.7188F, 1.0505F, -0.0552F, -0.1188F));

		PartDefinition cube_r384 = frontleftleg2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(88, 93).addBox(-1.0F, 2.4603F, -0.5828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.7991F, 0.0926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r385 = frontleftleg2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(46, 20).addBox(-1.0034F, -1.4331F, -2.2516F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 1.5991F, -0.8074F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r386 = frontleftleg2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(116, 46).addBox(-0.5F, -1.825F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6366F, 0.3636F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r387 = frontleftleg2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(120, 106).addBox(-0.5F, 0.075F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8269F, 0.3018F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r388 = frontleftleg2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(95, 41).addBox(-0.5F, -0.8F, 0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0049F, 0.65F, -2.1122F, -0.2524F, -0.0093F, 0.0065F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create().texOffs(84, 110).addBox(-0.8351F, 0.6441F, -1.0153F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2717F, 8.4964F, -1.227F, -0.9222F, 0.07F, 0.1047F));

		PartDefinition cube_r389 = frontleftleg3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(106, 4).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3351F, 0.5174F, -0.5701F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r390 = frontleftleg3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(95, 88).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3351F, 1.8292F, 0.3126F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r391 = frontleftleg3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(38, 10).addBox(-1.0F, -2.1F, -1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3351F, 2.2441F, 1.4847F, -0.1203F, 0.0208F, 0.0042F));

		PartDefinition cube_r392 = frontleftleg3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(16, 90).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3351F, 4.2385F, 0.8673F, -0.0676F, 0.0238F, 0.0046F));

		PartDefinition cube_r393 = frontleftleg3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(108, 27).addBox(0.4996F, -1.9987F, -1.0189F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8348F, 0.2198F, 2.1143F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r394 = frontleftleg3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(55, 75).addBox(0.4996F, -2.8987F, -1.4189F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 3.1428F, 1.9536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create().texOffs(70, 19).addBox(-1.9179F, 0.0265F, -0.9537F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(100, 64).addBox(0.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0321F, 6.1394F, 0.09F, 0.8943F, -0.0562F, -0.0206F));

		PartDefinition cube_r395 = frontleftleg4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(36, 76).addBox(-1.5F, -0.8306F, -0.4904F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.3765F, -0.4537F, -1.3963F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, 2.4868F, -1.131F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.8956F, 7.4154F, -5.7188F, 0.8323F, 0.0552F, 0.1188F));

		PartDefinition cube_r396 = frontrightleg2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(30, 95).addBox(-1.0F, 2.4603F, -0.5828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.7991F, 0.0926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r397 = frontrightleg2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(13, 57).addBox(-0.9966F, -1.4331F, -2.2516F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.5991F, -0.8074F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r398 = frontrightleg2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(45, 118).addBox(-0.5F, -1.825F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6366F, 0.3636F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r399 = frontrightleg2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(121, 12).addBox(-0.5F, 0.075F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8269F, 0.3018F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r400 = frontrightleg2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(56, 95).addBox(-0.5F, -0.7F, 0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0049F, 0.65F, -2.1122F, -0.2524F, 0.0093F, -0.0065F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(98, 110).addBox(-0.1649F, 0.6441F, -1.0153F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2717F, 8.4964F, -1.227F, -0.835F, -0.07F, -0.1047F));

		PartDefinition cube_r401 = frontrightleg3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(35, 107).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3351F, 0.5174F, -0.5701F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r402 = frontrightleg3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3351F, 1.8292F, 0.3126F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r403 = frontrightleg3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(83, 5).addBox(-1.0F, -2.1F, -1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3351F, 2.2441F, 1.4847F, -0.1203F, -0.0208F, -0.0042F));

		PartDefinition cube_r404 = frontrightleg3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(90, 21).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3351F, 4.2385F, 0.8673F, -0.0676F, -0.0238F, -0.0046F));

		PartDefinition cube_r405 = frontrightleg3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(28, 108).addBox(-2.4996F, -1.9987F, -1.0189F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8348F, 0.2198F, 2.1143F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r406 = frontrightleg3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 61).addBox(-2.4996F, -2.8987F, -1.4189F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 3.1428F, 1.9536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create().texOffs(70, 24).addBox(-1.082F, 0.0265F, -0.9537F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(100, 69).addBox(-1.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0321F, 6.1394F, 0.09F, 0.9379F, 0.0562F, 0.0206F));

		PartDefinition cube_r407 = frontrightleg4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(79, 50).addBox(-1.5F, -0.8306F, -0.4904F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.3765F, -0.4537F, -1.3963F, 0.0F, 0.0F));

		PartDefinition spike = chest.addOrReplaceChild("spike", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5611F, 5.1384F, -4.7465F, 0.161F, 0.4504F, 0.1416F));

		PartDefinition cube_r408 = spike.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(14, 15).addBox(-2.2016F, -0.6143F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0894F, -2.1812F, 8.059F, 2.9289F, -1.159F, -3.0743F));

		PartDefinition cube_r409 = spike.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 6).addBox(-0.2769F, -0.9919F, -0.0858F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0884F, -1.0069F, 2.9208F, 1.3425F, -1.3545F, -1.3946F));

		PartDefinition cube_r410 = spike.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(81, 32).addBox(-4.9812F, -0.8107F, 0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4315F, -1.2F, 3.6444F, 0.2205F, -1.1229F, -0.2438F));

		PartDefinition cube_r411 = spike.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(81, 29).addBox(-4.9812F, -1.0607F, 0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4315F, -1.2F, 3.6444F, 0.5975F, -1.0342F, -0.6697F));

		PartDefinition cube_r412 = spike.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(88, 80).addBox(-3.7866F, -0.6103F, -0.3131F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2315F, -1.5F, 3.4444F, 0.3076F, -0.866F, -0.3308F));

		PartDefinition cube_r413 = spike.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(25, 10).addBox(-5.7866F, -0.6103F, -0.0881F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2315F, -1.5F, 3.4444F, 0.4991F, -1.1485F, -0.5548F));

		PartDefinition spike2 = chest.addOrReplaceChild("spike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.774F, 5.1384F, -4.7465F, 0.161F, -0.4504F, -0.1416F));

		PartDefinition cube_r414 = spike2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(13, 18).addBox(-2.7984F, -0.6143F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0894F, -2.1812F, 8.059F, 2.9289F, 1.159F, 3.0743F));

		PartDefinition cube_r415 = spike2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(75, 47).addBox(-3.7231F, -0.9919F, -0.0858F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0884F, -1.0069F, 2.9208F, 1.3425F, 1.3545F, 1.3946F));

		PartDefinition cube_r416 = spike2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(81, 41).addBox(0.9812F, -0.8107F, 0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4315F, -1.2F, 3.6444F, 0.2205F, 1.1229F, 0.2438F));

		PartDefinition cube_r417 = spike2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(35, 81).addBox(0.9812F, -1.0607F, 0.0086F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4315F, -1.2F, 3.6444F, 0.5975F, 1.0342F, 0.6697F));

		PartDefinition cube_r418 = spike2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(95, 46).addBox(0.7866F, -0.6103F, -0.3131F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2315F, -1.5F, 3.4444F, 0.3076F, 0.866F, 0.3308F));

		PartDefinition cube_r419 = spike2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(36, 69).addBox(0.7866F, -0.6103F, -0.0881F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2315F, -1.5F, 3.4444F, 0.4991F, 1.1485F, 0.5548F));

		PartDefinition leftPlate2 = chest.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6975F, -2.3435F, -7.1768F, 0.6944F, 0.0092F, 0.1647F));

		PartDefinition cube_r420 = leftPlate2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(120, 134).addBox(-0.5F, -0.25F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -2.4158F, 0.4797F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r421 = leftPlate2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(130, 103).addBox(-0.5F, -1.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(130, 100).addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -0.1377F, 0.9699F, -0.3414F, 0.0395F, -0.0361F));

		PartDefinition cube_r422 = leftPlate2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(106, 118).addBox(-0.5F, -2.35F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftPlate2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(42, 98).addBox(-0.5F, -0.95F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, -0.6653F, 0.1079F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftPlate2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(107, 68).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.7515F, -0.8572F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftPlate2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(118, 50).addBox(-0.5F, -0.425F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1596F, -2.1766F, -0.4276F, 0.3566F, -0.0089F, 0.0046F));

		PartDefinition cube_r426 = leftPlate2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(107, 64).addBox(-0.5F, -1.225F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.8132F, -1.2625F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = chest.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9104F, -2.3435F, -7.1768F, 0.6944F, -0.0092F, -0.1647F));

		PartDefinition cube_r427 = rightPlate2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(120, 134).mirror().addBox(-0.5F, -0.25F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.4158F, 0.4797F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightPlate2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(130, 103).mirror().addBox(-0.5F, -1.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(130, 100).mirror().addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.1377F, 0.9699F, -0.3414F, -0.0395F, 0.0361F));

		PartDefinition cube_r429 = rightPlate2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(106, 118).mirror().addBox(-0.5F, -2.35F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightPlate2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.5F, -0.95F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6653F, 0.1079F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r431 = rightPlate2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(107, 68).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7515F, -0.8572F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r432 = rightPlate2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(-0.5F, -0.425F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1596F, -2.1766F, -0.4276F, 0.3566F, 0.0089F, -0.0046F));

		PartDefinition cube_r433 = rightPlate2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(107, 64).mirror().addBox(-0.5F, -1.225F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8132F, -1.2625F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = chest.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8823F, -4.0183F, -3.0469F, 0.5206F, 0.0005F, 0.1771F));

		PartDefinition cube_r434 = leftPlate4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(103, 83).addBox(-0.5F, -1.275F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.1549F, -2.9241F, 1.6728F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r435 = leftPlate4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(82, 60).addBox(-0.5F, -0.625F, -2.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -2.1314F, 1.8154F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftPlate4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(108, 23).addBox(-0.5F, -0.768F, -1.8602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -1.4629F, 2.2403F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r437 = leftPlate4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(60, 127).addBox(-0.5F, -0.768F, -0.8602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.8877F, 2.0699F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r438 = leftPlate4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(126, 113).addBox(-0.5F, -0.75F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -0.3877F, 1.7698F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r439 = leftPlate4.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(99, 5).addBox(-0.5F, -0.125F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -3.8913F, 1.0648F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r440 = leftPlate4.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(49, 93).addBox(-0.5F, -2.9F, -1.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.184F)), PartPose.offsetAndRotation(0.1549F, 0.7451F, 1.0781F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r441 = leftPlate4.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(23, 90).addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, 0.2601F, -1.1426F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r442 = leftPlate4.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(87, 102).addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.475F, -0.6797F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r443 = leftPlate4.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(114, 103).addBox(-0.5F, -0.125F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1688F, -2.6777F, -0.7582F, 0.6184F, -0.0089F, 0.0046F));

		PartDefinition cube_r444 = leftPlate4.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(37, 102).addBox(-0.5F, -0.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -1.2051F, -0.6324F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r445 = leftPlate4.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(113, 114).addBox(-0.5F, -1.225F, 0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -0.6846F, -1.5851F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = chest.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0952F, -4.0183F, -3.0469F, 0.5206F, -0.0005F, -0.1771F));

		PartDefinition cube_r446 = rightPlate4.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(103, 83).mirror().addBox(-0.5F, -1.275F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.9241F, 1.6728F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r447 = rightPlate4.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(-0.5F, -0.625F, -2.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.1314F, 1.8154F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightPlate4.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(-0.5F, -0.768F, -1.8602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.4629F, 2.2403F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightPlate4.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(60, 127).mirror().addBox(-0.5F, -0.768F, -0.8602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8877F, 2.0699F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightPlate4.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(126, 113).mirror().addBox(-0.5F, -0.75F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3877F, 1.7698F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightPlate4.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-0.5F, -0.125F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.8913F, 1.0648F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightPlate4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-0.5F, -2.9F, -1.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.184F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.7451F, 1.0781F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r453 = rightPlate4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(23, 90).mirror().addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2601F, -1.1426F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r454 = rightPlate4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(87, 102).mirror().addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.475F, -0.6797F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r455 = rightPlate4.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(114, 103).mirror().addBox(-0.5F, -0.125F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1688F, -2.6777F, -0.7582F, 0.6184F, 0.0089F, -0.0046F));

		PartDefinition cube_r456 = rightPlate4.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(37, 102).mirror().addBox(-0.5F, -0.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.2051F, -0.6324F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r457 = rightPlate4.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(113, 114).mirror().addBox(-0.5F, -1.225F, 0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6846F, -1.5851F, -0.4014F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6064F, 0.1963F, -1.0423F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r458 = bone4.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(9, 86).mirror().addBox(0.4F, -2.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5985F, 8.5915F, -5.2355F, 1.3472F, -0.5584F, -0.9462F));

		PartDefinition cube_r459 = bone4.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(46, 10).mirror().addBox(-3.0F, -0.0077F, -7.0083F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3493F, 4.5527F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r460 = bone4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-3.0F, 0.0866F, 0.0444F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.275F, -0.55F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r461 = bone4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(-3.0F, -0.1256F, -3.0263F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -1.4F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r462 = bone4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.5F, -1.9F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9561F, 4.8732F, -2.8702F, 0.1161F, -0.3734F, -0.3951F));

		PartDefinition cube_r463 = bone4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.5F, -1.95F, -1.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1829F, 5.8451F, -3.7368F, 1.0934F, -0.3734F, -0.3951F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3936F, 0.1963F, -1.0423F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r464 = bone2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(9, 86).addBox(-1.4F, -2.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5985F, 8.5915F, -5.2355F, 1.3472F, 0.5584F, 0.9462F));

		PartDefinition cube_r465 = bone2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(46, 10).addBox(2.0F, -0.0077F, -7.0083F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -2.3493F, 4.5527F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r466 = bone2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(19, 49).addBox(2.0F, 0.0866F, 0.0444F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.275F, -0.55F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r467 = bone2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(26, 57).addBox(2.0F, -0.1256F, -3.0263F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -1.4F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r468 = bone2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -1.9F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9561F, 4.8732F, -2.8702F, 0.1161F, 0.3734F, 0.3951F));

		PartDefinition cube_r469 = bone2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(54, 58).addBox(-0.5F, -1.95F, -1.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1829F, 5.8451F, -3.7368F, 1.0934F, 0.3734F, 0.3951F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3936F, 1.7408F, -7.915F, -0.3217F, -0.0828F, 0.0276F));

		PartDefinition cube_r470 = neck.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(59, 82).addBox(0.5F, -1.9318F, -0.0564F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2879F, -3.7993F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r471 = neck.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(36, 64).addBox(0.5F, -2.2317F, -0.0564F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1279F, -1.843F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r472 = neck.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(39, 63).addBox(0.0F, -0.1318F, -0.1564F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6944F, -3.4616F, -0.1259F, 0.0F, 0.0F));

		PartDefinition cube_r473 = neck2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(61, 133).addBox(0.5F, -1.567F, 0.958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 14).addBox(0.0F, -0.042F, -0.042F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3024F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2654F, -2.6978F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r474 = neck4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(58, 133).addBox(0.5F, -1.25F, -1.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5577F, -1.9798F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r475 = neck4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(133, 46).addBox(0.5F, -1.75F, -1.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.388F, 0.0155F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r476 = neck4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -0.65F, -0.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = neck4.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7603F, -2.1251F, -3.0005F, -0.1584F, 0.0762F, 0.2206F));

		PartDefinition cube_r477 = leftPlate17.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(51, 105).addBox(-0.5F, -1.0286F, -2.4561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3222F, 0.2424F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r478 = leftPlate17.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(126, 73).addBox(-0.5F, -0.8286F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1549F, -0.0262F, 0.7309F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r479 = leftPlate17.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(70, 126).addBox(-0.5F, -0.8286F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, 0.3222F, 0.2424F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r480 = leftPlate17.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(55, 126).addBox(-0.5F, -1.8286F, -0.2061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3536F, -0.3568F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r481 = leftPlate17.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(111, 41).addBox(-0.5F, -2.3228F, -0.3541F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.248F, -0.8934F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r482 = leftPlate17.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(50, 122).addBox(-0.5F, -0.6978F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate17 = neck4.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2397F, -2.1251F, -3.0005F, -0.1584F, -0.0762F, -0.2206F));

		PartDefinition cube_r483 = rightPlate17.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(-0.5F, -1.0286F, -2.4561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3222F, 0.2424F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightPlate17.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(126, 73).mirror().addBox(-0.5F, -0.8286F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0262F, 0.7309F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightPlate17.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(70, 126).mirror().addBox(-0.5F, -0.8286F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3222F, 0.2424F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r486 = rightPlate17.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(55, 126).mirror().addBox(-0.5F, -1.8286F, -0.2061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3536F, -0.3568F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightPlate17.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(111, 41).mirror().addBox(-0.5F, -2.3228F, -0.3541F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.248F, -0.8934F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r488 = rightPlate17.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(50, 122).mirror().addBox(-0.5F, -0.6978F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4251F, -3.8705F, -0.182F, -0.1019F, -0.0697F));

		PartDefinition cube_r489 = neck3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(102, 134).mirror().addBox(-0.5F, -1.65F, 0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 10).mirror().addBox(-1.0F, -0.65F, -1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r490 = neck3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(99, 134).mirror().addBox(-0.5F, -0.975F, -1.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4919F, -1.9953F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3256F, -2.9321F, 0.116F, 0.0F, 0.0F));

		PartDefinition cube_r491 = neck5.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(96, 134).mirror().addBox(-0.5F, -0.95F, -0.95F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.0791F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r492 = neck5.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-1.0F, -0.65F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate15 = neck5.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3181F, -1.5328F, -2.4812F, 0.1034F, 0.0762F, 0.2206F));

		PartDefinition cube_r493 = leftPlate15.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(126, 24).addBox(-0.5F, -1.0286F, -0.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r494 = leftPlate15.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(86, 121).addBox(-0.5F, -0.45F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1549F, -0.6438F, -0.2574F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightPlate15 = neck5.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3181F, -1.5328F, -2.4812F, 0.1034F, -0.0762F, -0.2206F));

		PartDefinition cube_r495 = rightPlate15.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(126, 24).mirror().addBox(-0.5F, -1.0286F, -0.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r496 = rightPlate15.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(86, 121).mirror().addBox(-0.5F, -0.45F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6438F, -0.2574F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftPlate16 = neck5.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2543F, -1.7209F, 0.1045F, -0.1584F, 0.0762F, 0.2206F));

		PartDefinition cube_r497 = leftPlate16.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(104, 92).addBox(-0.5F, -0.6286F, -1.9061F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.1549F, 0.3222F, 0.2424F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r498 = leftPlate16.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(126, 44).addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.0846F, -0.1856F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r499 = leftPlate16.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(45, 122).addBox(-0.5F, -1.5228F, -0.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.248F, -0.8934F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightPlate16 = neck5.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2543F, -1.7209F, 0.1045F, -0.1584F, -0.0762F, -0.2206F));

		PartDefinition cube_r500 = rightPlate16.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(104, 92).mirror().addBox(-0.5F, -0.6286F, -1.9061F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3222F, 0.2424F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r501 = rightPlate16.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(126, 44).mirror().addBox(-0.5F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0846F, -0.1856F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r502 = rightPlate16.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(45, 122).mirror().addBox(-0.5F, -1.5228F, -0.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.248F, -0.8934F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head2 = neck5.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6168F, -3.374F, 0.0989F, 0.0F, 0.0F));

		PartDefinition cube_r503 = head2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(122, 83).mirror().addBox(0.0F, 0.057F, -0.3002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0653F, -6.7798F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r504 = head2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(70, 112).mirror().addBox(-1.0F, 0.0F, -0.0131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7597F, -0.2715F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r505 = head2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(92, 27).mirror().addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 92).mirror().addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.7191F, -0.8505F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r506 = head2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(106, 8).mirror().addBox(-0.5F, 0.0215F, -2.0057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.626F, -2.2889F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r507 = head2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(0.0F, -0.218F, -0.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.78F, -6.6871F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r508 = head2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(124, 67).mirror().addBox(-1.0F, 0.0012F, -0.9632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7731F, -5.3425F, 0.6414F, 0.0F, 0.0F));

		PartDefinition cube_r509 = head2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(115, 128).mirror().addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9915F, -6.1425F, 0.624F, 0.0F, 0.0F));

		PartDefinition cube_r510 = head2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(63, 112).mirror().addBox(-1.5F, 0.0329F, -0.9953F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.8194F, -1.3076F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r511 = head2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(111, 79).mirror().addBox(-1.0F, 0.0F, -0.0131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7771F, -1.2714F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r512 = head2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(14, 106).addBox(-1.0F, -0.0152F, -1.8808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.3375F, -3.8109F, 0.6327F, 0.0F, 0.0F));

		PartDefinition leftFace2 = head2.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(1.6028F, -1.0519F, -2.7607F));

		PartDefinition cube_r513 = leftFace2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(42, 84).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8592F, 0.046F, 0.2487F, 0.0357F, 0.2055F, 0.0467F));

		PartDefinition cube_r514 = leftFace2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(84, 106).addBox(-0.6393F, -0.6447F, -0.2275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1182F, -0.1775F, 0.4159F, 0.1737F, -0.3981F, -0.283F));

		PartDefinition cube_r515 = leftFace2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(111, 51).addBox(-1.7143F, -0.691F, -0.1844F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(0, 79).addBox(-1.7143F, -0.691F, -0.3344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1193F, 0.1307F, 0.3128F, 0.8136F, 0.0442F, -0.011F));

		PartDefinition cube_r516 = leftFace2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(111, 76).addBox(-1.7F, -0.275F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2075F, -0.2576F, -0.0911F, 0.7766F, 0.1991F, 0.058F));

		PartDefinition cube_r517 = leftFace2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(56, 111).addBox(-1.7F, -0.275F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2075F, -0.2576F, -0.0911F, 0.7575F, 0.0164F, -0.1184F));

		PartDefinition cube_r518 = leftFace2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(125, 128).addBox(-0.4961F, 0.4753F, 2.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2276F, 1.9181F, -3.1108F, 0.4817F, -0.0063F, 0.1523F));

		PartDefinition cube_r519 = leftFace2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(37, 123).addBox(-1.3031F, 0.3684F, -0.7078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7279F, 1.9181F, -3.0934F, 0.5067F, 0.0567F, 0.0508F));

		PartDefinition cube_r520 = leftFace2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(119, 122).addBox(-0.5F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4945F, 2.9863F, -2.577F, 0.4887F, 0.1745F, 0.0F));

		PartDefinition cube_r521 = leftFace2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(114, 122).addBox(-0.5F, -0.4229F, -0.6604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3414F, 2.5924F, -1.7085F, 0.3142F, 0.1745F, 0.0F));

		PartDefinition cube_r522 = leftFace2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(102, 40).addBox(-0.5F, -0.3979F, -0.0604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3414F, 2.5924F, -1.7085F, 0.4887F, 0.1745F, 0.0F));

		PartDefinition cube_r523 = leftFace2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(124, 70).addBox(-1.049F, -1.0503F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.862F, 2.774F, -1.2685F, 0.2818F, 0.1225F, 0.1333F));

		PartDefinition cube_r524 = leftFace2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(127, 82).addBox(-1.0749F, -1.353F, -0.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.862F, 2.774F, -1.2685F, 0.5681F, 0.1023F, 0.0613F));

		PartDefinition cube_r525 = leftFace2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(101, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2829F, 1.8659F, -1.3186F, 0.5695F, 0.0357F, 0.1837F));

		PartDefinition cube_r526 = leftFace2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(19, 123).addBox(-0.6667F, 0.5571F, 1.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2276F, 1.9181F, -3.1108F, 0.5268F, 0.0651F, 0.2025F));

		PartDefinition cube_r527 = leftFace2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(106, 33).addBox(-0.3F, -0.45F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1341F, 0.1565F, -0.1383F, 1.3922F, 0.8501F, 1.1939F));

		PartDefinition cube_r528 = leftFace2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(63, 104).addBox(0.0F, -0.45F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1341F, 0.1565F, -0.1383F, 0.9639F, 0.659F, 0.5816F));

		PartDefinition cube_r529 = leftFace2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(101, 106).addBox(-1.0F, -1.6512F, -1.6864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.6028F, 0.9197F, 1.2894F, 0.6885F, 0.0123F, 0.0338F));

		PartDefinition cube_r530 = leftFace2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(124, 95).addBox(-1.0F, -0.8993F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6234F, 1.3202F, 0.7157F, 0.611F, 0.0552F, 0.0638F));

		PartDefinition cube_r531 = leftFace2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(65, 124).addBox(-1.0F, -0.6161F, -0.9825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6028F, 0.9197F, 1.2894F, 0.3046F, 0.0123F, 0.0338F));

		PartDefinition cube_r532 = leftFace2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(75, 68).addBox(-0.9F, -0.575F, -1.725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.9084F, 1.443F, -1.5744F, 0.6405F, 0.1108F, 0.0595F));

		PartDefinition cube_r533 = leftFace2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(11, 64).addBox(-0.525F, -0.575F, -3.625F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.7967F, 0.9109F, -0.8573F, 0.6414F, 0.1213F, 0.0674F));

		PartDefinition cube_r534 = leftFace2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(106, 12).addBox(-0.3511F, -0.7059F, -0.716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(81, 44).addBox(-0.3511F, -0.7059F, -0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 1.4077F, 0.3427F, 0.1165F));

		PartDefinition cube_r535 = leftFace2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(60, 121).addBox(-0.3511F, -0.7146F, -0.4453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 0.9714F, 0.3427F, 0.1165F));

		PartDefinition cube_r536 = leftFace2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(121, 46).addBox(-0.355F, -0.7506F, -0.3213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 0.9498F, 0.0908F, 0.0239F));

		PartDefinition cube_r537 = leftFace2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(121, 40).addBox(-0.6049F, -0.6236F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 0.7375F, 0.0989F, -0.008F));

		PartDefinition cube_r538 = leftFace2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(72, 115).addBox(-0.5F, -0.9779F, -0.366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.8028F, 0.9229F, 2.619F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftFace2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(121, 74).addBox(-0.555F, -0.1776F, -0.4114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 0.4757F, 0.0989F, -0.008F));

		PartDefinition cube_r540 = leftFace2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(80, 128).addBox(0.075F, -0.175F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6028F, -0.7253F, 1.4893F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftFace2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(82, 122).addBox(-0.5712F, -0.1329F, -0.7349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.3082F, 3.2327F, -3.5036F, 0.1658F, 0.4102F, 0.0F));

		PartDefinition rightFace2 = head2.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(-1.6028F, -1.0519F, -2.7607F));

		PartDefinition cube_r542 = rightFace2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8592F, 0.046F, 0.2487F, 0.0357F, -0.2055F, -0.0467F));

		PartDefinition cube_r543 = rightFace2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(84, 106).mirror().addBox(-0.3607F, -0.6447F, -0.2275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1182F, -0.1775F, 0.4159F, 0.1737F, 0.3981F, 0.283F));

		PartDefinition cube_r544 = rightFace2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-0.2857F, -0.691F, -0.1844F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(0, 79).mirror().addBox(-0.2857F, -0.691F, -0.3344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1193F, 0.1307F, 0.3128F, 0.8136F, -0.0442F, 0.011F));

		PartDefinition cube_r545 = rightFace2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(111, 76).mirror().addBox(-0.3F, -0.275F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2075F, -0.2576F, -0.0911F, 0.7766F, -0.1991F, -0.058F));

		PartDefinition cube_r546 = rightFace2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(56, 111).mirror().addBox(-0.3F, -0.275F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2075F, -0.2576F, -0.0911F, 0.7575F, -0.0164F, 0.1184F));

		PartDefinition cube_r547 = rightFace2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(125, 128).mirror().addBox(-0.5039F, 0.4753F, 2.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2276F, 1.9181F, -3.1108F, 0.4817F, 0.0063F, -0.1523F));

		PartDefinition cube_r548 = rightFace2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(37, 123).mirror().addBox(0.3031F, 0.3684F, -0.7078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7279F, 1.9181F, -3.0934F, 0.5067F, -0.0567F, -0.0508F));

		PartDefinition cube_r549 = rightFace2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(119, 122).mirror().addBox(-0.5F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4945F, 2.9863F, -2.577F, 0.4887F, -0.1745F, 0.0F));

		PartDefinition cube_r550 = rightFace2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(114, 122).mirror().addBox(-0.5F, -0.4229F, -0.6604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3414F, 2.5924F, -1.7085F, 0.3142F, -0.1745F, 0.0F));

		PartDefinition cube_r551 = rightFace2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.5F, -0.3979F, -0.0604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3414F, 2.5924F, -1.7085F, 0.4887F, -0.1745F, 0.0F));

		PartDefinition cube_r552 = rightFace2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(124, 70).mirror().addBox(0.049F, -1.0503F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.862F, 2.774F, -1.2685F, 0.2818F, -0.1225F, -0.1333F));

		PartDefinition cube_r553 = rightFace2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(127, 82).mirror().addBox(0.0749F, -1.353F, -0.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.862F, 2.774F, -1.2685F, 0.5681F, -0.1023F, -0.0613F));

		PartDefinition cube_r554 = rightFace2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2829F, 1.8659F, -1.3186F, 0.5695F, -0.0357F, -0.1837F));

		PartDefinition cube_r555 = rightFace2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(19, 123).mirror().addBox(-0.3332F, 0.5571F, 1.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2276F, 1.9181F, -3.1108F, 0.5268F, -0.0651F, -0.2025F));

		PartDefinition cube_r556 = rightFace2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(-0.7F, -0.45F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1341F, 0.1565F, -0.1383F, 1.3922F, -0.8501F, -1.1939F));

		PartDefinition cube_r557 = rightFace2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(-1.0F, -0.45F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1341F, 0.1565F, -0.1383F, 0.9639F, -0.659F, -0.5816F));

		PartDefinition cube_r558 = rightFace2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(101, 106).mirror().addBox(0.0F, -1.6512F, -1.6864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.6028F, 0.9197F, 1.2894F, 0.6885F, -0.0123F, -0.0338F));

		PartDefinition cube_r559 = rightFace2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(124, 95).mirror().addBox(0.0F, -0.8993F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6234F, 1.3202F, 0.7157F, 0.611F, -0.0552F, -0.0638F));

		PartDefinition cube_r560 = rightFace2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(65, 124).mirror().addBox(0.0F, -0.6161F, -0.9825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6028F, 0.9197F, 1.2894F, 0.3046F, -0.0123F, -0.0338F));

		PartDefinition cube_r561 = rightFace2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.1F, -0.575F, -1.725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.9084F, 1.443F, -1.5744F, 0.6405F, -0.1108F, -0.0595F));

		PartDefinition cube_r562 = rightFace2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-0.475F, -0.575F, -3.625F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.7967F, 0.9109F, -0.8573F, 0.6414F, -0.1213F, -0.0674F));

		PartDefinition cube_r563 = rightFace2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(-0.6489F, -0.7059F, -0.716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(81, 44).mirror().addBox(-0.6489F, -0.7059F, -0.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 1.4077F, -0.3427F, -0.1165F));

		PartDefinition cube_r564 = rightFace2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.6489F, -0.7146F, -0.4453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 0.9714F, -0.3427F, -0.1165F));

		PartDefinition cube_r565 = rightFace2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(121, 46).mirror().addBox(-0.645F, -0.7506F, -0.3213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 0.9498F, -0.0908F, -0.0239F));

		PartDefinition cube_r566 = rightFace2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(121, 40).mirror().addBox(-0.3951F, -0.6236F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 0.7375F, -0.0989F, 0.008F));

		PartDefinition cube_r567 = rightFace2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(72, 115).mirror().addBox(-0.5F, -0.9779F, -0.366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.8028F, 0.9229F, 2.619F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r568 = rightFace2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(121, 74).mirror().addBox(-0.4451F, -0.1776F, -0.4114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 0.4757F, -0.0989F, 0.008F));

		PartDefinition cube_r569 = rightFace2.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(80, 128).mirror().addBox(-1.075F, -0.175F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6028F, -0.7253F, 1.4893F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r570 = rightFace2.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(82, 122).mirror().addBox(-0.4288F, -0.1329F, -0.7349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.3082F, 3.2327F, -3.5036F, 0.1658F, -0.4102F, 0.0F));

		PartDefinition eye = head2.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r571 = eye.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(125, 104).addBox(-0.755F, -1.7971F, -0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, 1.5611F, 0.0062F, 0.0354F));

		PartDefinition cube_r572 = eye.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(125, 107).addBox(-0.755F, -1.4331F, 0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, 2.0149F, 0.0062F, 0.0354F));

		PartDefinition cube_r573 = eye.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(102, 125).addBox(-0.755F, -0.7119F, 0.3303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, 2.2767F, 0.0062F, 0.0354F));

		PartDefinition cube_r574 = eye.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(125, 101).addBox(-0.5F, -0.275F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.495F, -1.6864F, 2.3861F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r575 = eye.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(97, 125).addBox(-0.5F, -1.25F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 125).addBox(-0.5F, -1.075F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.495F, -0.2945F, 2.2632F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r576 = eye.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(80, 125).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.495F, -1.2058F, 2.65F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r577 = eye.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(47, 125).addBox(-0.5F, -0.775F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.495F, -0.7382F, 3.0276F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r578 = eye.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(42, 125).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.495F, -1.0203F, 2.7249F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r579 = eye.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(8, 125).addBox(-0.755F, -1.6197F, -0.1348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, 0.863F, 0.0062F, 0.0354F));

		PartDefinition cube_r580 = eye.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(125, 6).addBox(-0.755F, -1.1916F, -1.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, -0.1755F, 0.0062F, 0.0354F));

		PartDefinition cube_r581 = eye.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(124, 116).addBox(-0.62F, -1.5247F, -1.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(124, 86).addBox(-0.795F, -1.5247F, -1.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.775F, -0.0222F, 1.9696F, 0.3917F, 0.0062F, 0.0354F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4685F, 0.2989F, 0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r582 = jaw2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(102, 98).mirror().addBox(-0.9004F, -1.8055F, -4.5602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.1396F, -0.2007F, 0.0F));

		PartDefinition cube_r583 = jaw2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(124, 98).mirror().addBox(-0.3814F, -2.0337F, -3.8724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 92).mirror().addBox(-0.3814F, -2.0337F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.1544F, -0.1219F, 0.051F));

		PartDefinition cube_r584 = jaw2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(21, 106).mirror().addBox(-0.3814F, -1.4245F, -6.1884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.0148F, -0.1219F, 0.051F));

		PartDefinition cube_r585 = jaw2.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(107, 60).mirror().addBox(-0.582F, -1.1643F, -6.3784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.0061F, -0.1274F, 0.0323F));

		PartDefinition cube_r586 = jaw2.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(125, 3).mirror().addBox(-0.5687F, -6.8397F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 0).mirror().addBox(-0.5687F, -6.4147F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.9058F, -0.1274F, 0.0323F));

		PartDefinition cube_r587 = jaw2.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(-0.5687F, -2.2186F, -6.9644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.164F, -0.1274F, 0.0323F));

		PartDefinition cube_r588 = jaw2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(47, 128).mirror().addBox(-0.3814F, -0.8654F, -6.7959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.0812F, -0.1219F, 0.051F));

		PartDefinition cube_r589 = jaw2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(32, 123).mirror().addBox(-0.5861F, -0.6782F, -6.9895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.0803F, -0.1274F, 0.0323F));

		PartDefinition cube_r590 = jaw2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(102, 88).mirror().addBox(-0.582F, -0.6194F, -6.3961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.0978F, -0.1274F, 0.0323F));

		PartDefinition cube_r591 = jaw2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-0.9004F, -0.4207F, -4.834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.1396F, -0.2007F, 0.0F));

		PartDefinition cube_r592 = jaw2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(70, 123).mirror().addBox(-0.2F, -2.5354F, -2.6142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.4102F, 0.0175F, 0.0F));

		PartDefinition cube_r593 = jaw2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(55, 123).mirror().addBox(-0.2F, -0.9341F, -3.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.2443F, 0.0175F, 0.0F));

		PartDefinition cube_r594 = jaw2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(104, 48).mirror().addBox(-0.2F, -0.8826F, -3.3606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(44, 104).mirror().addBox(-0.2F, -0.4826F, -3.3606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.1134F, 0.0175F, 0.0F));

		PartDefinition cube_r595 = jaw2.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(122, 48).mirror().addBox(-0.2F, -0.6745F, -2.5736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, -0.3491F, 0.0175F, 0.0F));

		PartDefinition cube_r596 = jaw2.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(28, 104).mirror().addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4003F, 0.5232F, 0.0785F, 0.0175F, 0.0F));

		PartDefinition cube_r597 = jaw2.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(102, 98).addBox(-0.0996F, -1.8055F, -4.5602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.1396F, 0.2007F, 0.0F));

		PartDefinition cube_r598 = jaw2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(124, 98).addBox(-0.6186F, -2.0337F, -3.8724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 92).addBox(-0.6186F, -2.0337F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.1544F, 0.1219F, -0.051F));

		PartDefinition cube_r599 = jaw2.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(21, 106).addBox(-0.6186F, -1.4245F, -6.1884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.0148F, 0.1219F, -0.051F));

		PartDefinition cube_r600 = jaw2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(107, 60).addBox(-0.418F, -1.1643F, -6.3784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.0061F, 0.1274F, -0.0323F));

		PartDefinition cube_r601 = jaw2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(128, 47).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1662F, -0.2806F, -6.1588F, 1.4818F, -0.1274F, 0.0323F));

		PartDefinition cube_r602 = jaw2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(128, 47).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1662F, -0.2806F, -6.1588F, 1.4818F, 0.1274F, -0.0323F));

		PartDefinition cube_r603 = jaw2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(125, 3).addBox(-0.4313F, -6.8397F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 0).addBox(-0.4313F, -6.4147F, -4.4724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.9058F, 0.1274F, -0.0323F));

		PartDefinition cube_r604 = jaw2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(124, 122).addBox(-0.4313F, -2.2186F, -6.9644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.164F, 0.1274F, -0.0323F));

		PartDefinition cube_r605 = jaw2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(47, 128).addBox(-0.6186F, -0.8654F, -6.7959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.0812F, 0.1219F, -0.051F));

		PartDefinition cube_r606 = jaw2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(32, 123).addBox(-0.4139F, -0.6782F, -6.9895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.0803F, 0.1274F, -0.0323F));

		PartDefinition cube_r607 = jaw2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(102, 88).addBox(-0.418F, -0.6194F, -6.3961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.0978F, 0.1274F, -0.0323F));

		PartDefinition cube_r608 = jaw2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(104, 44).addBox(-0.0996F, -0.4207F, -4.834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.1396F, 0.2007F, 0.0F));

		PartDefinition cube_r609 = jaw2.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(70, 123).addBox(-0.8F, -2.5354F, -2.6142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.4102F, -0.0175F, 0.0F));

		PartDefinition cube_r610 = jaw2.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(55, 123).addBox(-0.8F, -0.9341F, -3.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.2443F, -0.0175F, 0.0F));

		PartDefinition cube_r611 = jaw2.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(104, 48).addBox(-0.8F, -0.8826F, -3.3606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(44, 104).addBox(-0.8F, -0.4826F, -3.3606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.1134F, -0.0175F, 0.0F));

		PartDefinition cube_r612 = jaw2.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(122, 48).addBox(-0.8F, -0.6745F, -2.5736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, -0.3491F, -0.0175F, 0.0F));

		PartDefinition cube_r613 = jaw2.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(28, 104).addBox(-0.8F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.975F, 0.4003F, 0.5232F, 0.0785F, -0.0175F, 0.0F));

		PartDefinition eye2 = head2.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r614 = eye2.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(125, 107).mirror().addBox(-0.245F, -1.4331F, 0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, 2.0149F, -0.0062F, -0.0354F));

		PartDefinition cube_r615 = eye2.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(125, 104).mirror().addBox(-0.245F, -1.7971F, -0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, 1.5611F, -0.0062F, -0.0354F));

		PartDefinition cube_r616 = eye2.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(102, 125).mirror().addBox(-0.245F, -0.7119F, 0.3303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, 2.2767F, -0.0062F, -0.0354F));

		PartDefinition cube_r617 = eye2.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(125, 101).mirror().addBox(-0.5F, -0.275F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.495F, -1.6864F, 2.3861F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r618 = eye2.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(97, 125).mirror().addBox(-0.5F, -1.25F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 125).mirror().addBox(-0.5F, -1.075F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.495F, -0.2945F, 2.2632F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r619 = eye2.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(80, 125).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.495F, -1.2058F, 2.65F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r620 = eye2.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(47, 125).mirror().addBox(-0.5F, -0.775F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.495F, -0.7382F, 3.0276F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r621 = eye2.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(42, 125).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.495F, -1.0203F, 2.7249F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r622 = eye2.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(8, 125).mirror().addBox(-0.245F, -1.6197F, -0.1348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, 0.863F, -0.0062F, -0.0354F));

		PartDefinition cube_r623 = eye2.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.245F, -1.1916F, -1.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, -0.1755F, -0.0062F, -0.0354F));

		PartDefinition cube_r624 = eye2.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(124, 116).mirror().addBox(-0.38F, -1.5247F, -1.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(124, 86).mirror().addBox(-0.205F, -1.5247F, -1.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.0222F, 1.9696F, 0.3917F, -0.0062F, -0.0354F));

		PartDefinition leftPlate3 = neck2.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8215F, -2.7737F, -0.1601F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition cube_r625 = leftPlate3.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(74, 125).addBox(-0.5F, -0.2F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F))
				.texOffs(18, 126).addBox(-0.5F, -0.75F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.1549F, -1.7991F, 0.6478F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r626 = leftPlate3.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(116, 42).addBox(-0.5F, -1.2F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.6406F, -0.1633F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r627 = leftPlate3.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(97, 49).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r628 = leftPlate3.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.3659F, -0.3559F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r629 = leftPlate3.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(126, 12).addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.8132F, -1.2625F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r630 = leftPlate3.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(113, 135).addBox(-0.5F, -0.225F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1549F, -0.6846F, -1.5851F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = neck2.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8215F, -2.7737F, -0.1601F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition cube_r631 = rightPlate3.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(74, 125).mirror().addBox(-0.5F, -0.2F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(18, 126).mirror().addBox(-0.5F, -0.75F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7991F, 0.6478F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r632 = rightPlate3.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(116, 42).mirror().addBox(-0.5F, -1.2F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6406F, -0.1633F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r633 = rightPlate3.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r634 = rightPlate3.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3659F, -0.3559F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r635 = rightPlate3.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(126, 12).mirror().addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8132F, -1.2625F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r636 = rightPlate3.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(113, 135).mirror().addBox(-0.5F, -0.225F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6846F, -1.5851F, -0.4014F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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