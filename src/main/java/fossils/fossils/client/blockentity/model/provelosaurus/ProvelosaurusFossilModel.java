package fossils.fossils.client.blockentity.model.provelosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProvelosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart lowerbody;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart tail;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head2;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;

	public ProvelosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.lowerbody = this.hips.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone4 = this.lowerbody.getChild("bone4");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail4 = this.tail.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.body = this.lowerbody.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.neck2 = this.upperbody.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head2 = this.neck3.getChild("head2");
		this.jaw = this.head2.getChild("jaw");
		this.leftFace = this.head2.getChild("leftFace");
		this.rightFace = this.head2.getChild("rightFace");
		this.bone3 = this.upperbody.getChild("bone3");
		this.bone2 = this.upperbody.getChild("bone2");
		this.frontleftleg4 = this.upperbody.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.upperbody.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(41, 46).addBox(-0.5F, -0.4372F, -0.9178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -12.7812F, 12.312F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-2.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, -0.0334F, -0.3914F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-2.5159F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.1929F, 2.1379F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 0).addBox(-2.4841F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 0.1929F, 2.1379F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 100).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4372F, 2.0822F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = lowerbody.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 12).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4372F, 0.0822F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = lowerbody.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 26).addBox(0.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.0674F, 1.5917F, -1.4994F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 42).addBox(-3.5F, -2.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-5.0674F, 4.231F, 5.3818F, -0.8139F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 19).addBox(-6.5F, -1.5F, -0.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0674F, 3.82F, 3.8551F, -1.512F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 0).addBox(0.398F, -1.4441F, 3.6368F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.0913F, 0.0079F, 0.1583F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 6).addBox(-0.5F, -1.075F, -1.425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0188F, -0.359F, 1.1741F, 2.484F, 0.0079F, 0.1583F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 58).addBox(-0.6285F, 0.0099F, 0.6255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.3064F, -0.1419F, 0.4291F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 66).addBox(-0.1964F, 0.68F, 1.9431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.6194F, -0.0499F, 0.29F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 78).addBox(-0.6285F, -1.1045F, 0.5679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 1.1283F, -0.1419F, 0.4291F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(89, 24).addBox(-0.6285F, 0.9737F, 0.4921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 1.7828F, -0.1419F, 0.4291F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 95).addBox(-0.6285F, 2.1671F, -1.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(25, 95).addBox(-0.6285F, 1.6671F, -1.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.35F, -0.1419F, 0.4291F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 54).addBox(-0.6285F, -0.8982F, -1.9067F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -2.5805F, -0.1419F, 0.4291F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 87).addBox(-0.6285F, -0.2196F, -1.124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -1.3588F, -0.1419F, 0.4291F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 67).addBox(-0.6285F, -1.8763F, -2.3371F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -0.2243F, -0.1419F, 0.4291F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 83).addBox(-0.6285F, -1.858F, -2.4472F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 0.5611F, -0.1419F, 0.4291F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 5).addBox(-0.6285F, -3.0483F, 0.3855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 1.6083F, -0.1419F, 0.4291F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 74).addBox(-0.1964F, -2.1618F, 2.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 1.9649F, -0.0499F, 0.29F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(49, 42).addBox(1.8454F, 1.4305F, 6.1086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.7192F, 0.0756F, -0.0592F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 63).addBox(1.8454F, 2.9351F, 6.1305F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 2.9374F, 0.0756F, -0.0592F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(95, 66).addBox(1.8454F, 8.2488F, 3.0979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -2.5604F, 0.0756F, -0.0592F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 98).addBox(1.8454F, 4.7357F, -7.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -1.295F, 0.0756F, -0.0592F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 77).addBox(1.8454F, 3.4053F, -7.4464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -1.3823F, 0.0756F, -0.0592F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 30).addBox(0.398F, -6.379F, -3.473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 0.1715F, 0.0079F, 0.1583F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 77).addBox(1.8454F, -7.0835F, -1.9389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, 0.4067F, 0.0756F, -0.0592F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 0).addBox(1.8454F, -6.3114F, -5.2165F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5379F, 3.636F, 4.6728F, -0.0733F, 0.0756F, -0.0592F));

		PartDefinition bone4 = lowerbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0674F, 1.5917F, -1.4994F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 42).mirror().addBox(-3.5F, -2.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(5.0674F, 4.231F, 5.3818F, -0.8139F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 19).mirror().addBox(-0.5F, -1.5F, -0.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0674F, 3.82F, 3.8551F, -1.512F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.398F, -1.4441F, 3.6368F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.0913F, -0.0079F, -0.1583F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-0.5F, -1.075F, -1.425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0188F, -0.359F, 1.1741F, 2.484F, -0.0079F, -0.1583F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.3715F, 0.0099F, 0.6255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.3064F, 0.1419F, -0.4291F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 66).mirror().addBox(-0.8036F, 0.68F, 1.9431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.6194F, 0.0499F, -0.29F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.3715F, -1.1045F, 0.5679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 1.1283F, 0.1419F, -0.4291F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(-0.3715F, 0.9737F, 0.4921F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 1.7828F, 0.1419F, -0.4291F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(-0.3715F, 2.1671F, -1.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(25, 95).mirror().addBox(-0.3715F, 1.6671F, -1.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.35F, 0.1419F, -0.4291F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(-0.3715F, -0.8982F, -1.9067F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -2.5805F, 0.1419F, -0.4291F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-0.3715F, -0.2196F, -1.124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -1.3588F, 0.1419F, -0.4291F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.3715F, -1.8763F, -2.3371F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -0.2243F, 0.1419F, -0.4291F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.3715F, -1.858F, -2.4472F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 0.5611F, 0.1419F, -0.4291F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-0.3715F, -3.0483F, 0.3855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 1.6083F, 0.1419F, -0.4291F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.8036F, -2.1618F, 2.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 1.9649F, 0.0499F, -0.29F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 42).mirror().addBox(-2.8454F, 1.4305F, 6.1086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.7192F, -0.0756F, 0.0592F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 63).mirror().addBox(-2.8454F, 2.9351F, 6.1305F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 2.9374F, -0.0756F, 0.0592F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(95, 66).mirror().addBox(-2.8454F, 8.2488F, 3.0979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -2.5604F, -0.0756F, 0.0592F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-2.8454F, 4.7357F, -7.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -1.295F, -0.0756F, 0.0592F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(69, 77).mirror().addBox(-2.8454F, 3.4053F, -7.4464F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -1.3823F, -0.0756F, 0.0592F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-1.398F, -6.379F, -3.473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 0.1715F, -0.0079F, -0.1583F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-2.8454F, -7.0835F, -1.9389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, 0.4067F, -0.0756F, 0.0592F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-2.8454F, -6.3114F, -5.2165F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5379F, 3.636F, 4.6728F, -0.0733F, -0.0756F, 0.0592F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8876F, 4.9592F, 1.6828F, 0.191F, 0.92F, -0.1158F));

		PartDefinition cube_r53 = backleftleg4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 89).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6964F, 0.5631F, -0.1928F, 0.4048F, -0.5193F, -0.4768F));

		PartDefinition cube_r54 = backleftleg4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 87).addBox(-0.5F, -1.65F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0832F, 0.7828F, 0.9366F, 0.143F, -0.5193F, -0.4768F));

		PartDefinition cube_r55 = backleftleg4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, 0.5F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, 0.8411F, -0.5193F, -0.4768F));

		PartDefinition cube_r56 = backleftleg4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(36, 91).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, -0.337F, -0.5193F, -0.4768F));

		PartDefinition cube_r57 = backleftleg4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 63).addBox(-0.5F, -1.225F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1655F, 4.0017F, 0.3091F, -1.4278F, -0.5193F, -0.4768F));

		PartDefinition cube_r58 = backleftleg4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(89, 29).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, 0.1866F, -0.5193F, -0.4768F));

		PartDefinition cube_r59 = backleftleg4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.5F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, 0.0993F, -0.5193F, -0.4768F));

		PartDefinition cube_r60 = backleftleg4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 71).addBox(-0.05F, -2.4F, 0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.7836F, 0.9157F, -0.952F, -0.2497F, -0.5193F, -0.4768F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7778F, 5.1693F, 1.3113F, -0.3781F, -1.1165F, 0.6244F));

		PartDefinition cube_r61 = backleftleg5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(85, 4).addBox(-0.5F, -0.05F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3408F, 5.7802F, 0.1072F, 0.0F, 1.5708F, -1.3963F));

		PartDefinition cube_r62 = backleftleg5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(96, 10).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0541F, 6.4812F, 0.1072F, 0.0F, 1.5708F, -0.7941F));

		PartDefinition cube_r63 = backleftleg5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 68).addBox(-0.5048F, -1.4587F, 0.1108F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, -0.1396F));

		PartDefinition cube_r64 = backleftleg5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(85, 55).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0968F, 1.2625F, 0.1072F, 0.0F, 1.5708F, 1.2654F));

		PartDefinition cube_r65 = backleftleg5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 81).addBox(-0.5F, -1.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2878F, 1.9209F, 0.1072F, 0.0F, 1.5708F, -1.4835F));

		PartDefinition cube_r66 = backleftleg5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(63, 86).addBox(-0.5F, -0.5F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0202F, 1.2286F, 0.1072F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition cube_r67 = backleftleg5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(77, 90).addBox(-0.5F, -2.15F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1225F, 5.5929F, 0.1072F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition cube_r68 = backleftleg5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8471F, 5.2456F, 0.1072F, 0.0F, 1.5708F, 0.1745F));

		PartDefinition cube_r69 = backleftleg5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9331F, 5.1248F, 0.1072F, 0.0F, 1.5708F, 1.6581F));

		PartDefinition cube_r70 = backleftleg5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 75).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0202F, 4.1286F, 0.1072F, 0.0F, 1.5708F, -0.0873F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create().texOffs(0, 20).addBox(-1.8382F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3089F, 7.2388F, -0.3757F, 0.0872F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8876F, 4.9592F, 1.6828F, 0.7197F, -0.4366F, 0.0441F));

		PartDefinition cube_r71 = backrightleg4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(47, 90).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6964F, 0.5631F, -0.1928F, 0.4048F, 0.5193F, 0.4768F));

		PartDefinition cube_r72 = backrightleg4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(89, 14).addBox(-0.5F, -1.65F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0832F, 0.7828F, 0.9366F, 0.143F, 0.5193F, 0.4768F));

		PartDefinition cube_r73 = backrightleg4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 67).addBox(-0.5F, 0.5F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, 0.8411F, 0.5193F, 0.4768F));

		PartDefinition cube_r74 = backrightleg4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(91, 47).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, -0.337F, 0.5193F, 0.4768F));

		PartDefinition cube_r75 = backrightleg4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(91, 10).addBox(-0.5F, -1.225F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1655F, 4.0017F, 0.3091F, -1.4278F, 0.5193F, 0.4768F));

		PartDefinition cube_r76 = backrightleg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 89).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, 0.1866F, 0.5193F, 0.4768F));

		PartDefinition cube_r77 = backrightleg4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 67).addBox(-0.5F, -1.5F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, 0.0993F, 0.5193F, 0.4768F));

		PartDefinition cube_r78 = backrightleg4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 75).addBox(-0.95F, -2.4F, 0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-0.7836F, 0.9157F, -0.952F, -0.2497F, 0.5193F, 0.4768F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7778F, 5.1693F, 1.3113F, -0.3781F, 1.1165F, -0.6244F));

		PartDefinition cube_r79 = backrightleg5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(12, 85).addBox(-0.5F, -0.05F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3408F, 5.7802F, 0.1072F, 0.0F, -1.5708F, 1.3963F));

		PartDefinition cube_r80 = backrightleg5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(97, 78).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0541F, 6.4812F, 0.1072F, 0.0F, -1.5708F, 0.7941F));

		PartDefinition cube_r81 = backrightleg5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(31, 68).addBox(-0.4952F, -1.4587F, 0.1108F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, 0.1396F));

		PartDefinition cube_r82 = backrightleg5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(56, 86).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0968F, 1.2625F, 0.1072F, 0.0F, -1.5708F, -1.2654F));

		PartDefinition cube_r83 = backrightleg5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(26, 87).addBox(-0.5F, -1.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2878F, 1.9209F, 0.1072F, 0.0F, -1.5708F, 1.4835F));

		PartDefinition cube_r84 = backrightleg5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5F, -0.5F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0202F, 1.2286F, 0.1072F, 0.0F, -1.5708F, -0.3491F));

		PartDefinition cube_r85 = backrightleg5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(17, 91).addBox(-0.5F, -2.15F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1225F, 5.5929F, 0.1072F, 0.0F, -1.5708F, 0.3491F));

		PartDefinition cube_r86 = backrightleg5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 26).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8471F, 5.2456F, 0.1072F, 0.0F, -1.5708F, -0.1745F));

		PartDefinition cube_r87 = backrightleg5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(94, 22).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9331F, 5.1248F, 0.1072F, 0.0F, -1.5708F, -1.6581F));

		PartDefinition cube_r88 = backrightleg5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(77, 27).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0202F, 4.1286F, 0.1072F, 0.0F, -1.5708F, 0.0873F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create().texOffs(23, 0).addBox(-2.1619F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3089F, 7.2388F, -0.3757F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(55, 16).addBox(-0.5F, -0.683F, -0.2086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 39).addBox(0.0F, -1.583F, -0.2086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 100).addBox(0.0F, -1.583F, 1.7914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2643F, 4.1371F, -0.212F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(15, 41).mirror().addBox(-4.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.183F, 1.7914F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.383F, 0.4914F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(26, 57).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.383F, 0.4914F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 41).addBox(0.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.183F, 1.7914F, 0.0F, 0.0F, 0.48F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, -0.4261F, -0.1812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2329F, 3.7914F, -0.2791F, -0.1679F, 0.0478F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(7, 64).addBox(-0.5F, -0.4869F, -0.2066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.2925F, -0.2511F, 0.0747F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(66, 12).addBox(-0.5F, 0.0131F, -0.0066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.8F, -0.4548F, -0.276F, 0.1325F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5F, -0.6101F, -6.1997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1836F, -0.0413F, -0.0142F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(100, 63).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -1.1997F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(100, 56).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -3.1997F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(100, 52).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -5.1997F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-7.0405F, -3.2876F, -0.281F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0402F, -4.9701F, 0.0024F, 0.0383F, -1.2593F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(90, 79).mirror().addBox(-4.277F, -1.3269F, -0.281F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0402F, -4.9701F, 0.0212F, 0.032F, -0.7354F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(12, 83).mirror().addBox(-2.6305F, 0.0537F, -0.2334F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0402F, -4.9701F, 0.0717F, -0.0024F, -0.1918F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 91).mirror().addBox(-4.5041F, -1.0022F, -0.2898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.9201F, -0.0457F, -0.024F, -0.7095F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-2.6568F, 0.4485F, -0.2563F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.9201F, -0.0146F, -0.0156F, -0.1649F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-3.9114F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.0702F, -0.0163F, -0.1748F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(19, 18).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 18).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(66, 30).addBox(-0.0886F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.0702F, 0.0163F, 0.1748F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(79, 39).addBox(-0.3432F, 0.4485F, -0.2563F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.9201F, -0.0146F, 0.0156F, 0.1649F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(67, 91).addBox(2.5041F, -1.0022F, -0.2898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.9201F, -0.0457F, 0.024F, 0.7095F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(12, 83).addBox(-0.3695F, 0.0537F, -0.2334F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0402F, -4.9701F, 0.0717F, 0.0024F, 0.1918F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(90, 79).addBox(2.277F, -1.3269F, -0.281F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0402F, -4.9701F, 0.0212F, -0.032F, 0.7354F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(65, 46).addBox(3.0405F, -3.2876F, -0.281F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0402F, -4.9701F, 0.0024F, -0.0383F, 1.2593F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 10).addBox(-3.25F, -0.4945F, -7.9257F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(99, 28).addBox(-2.75F, -2.0695F, -6.9257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.114F, -0.0863F, -0.0129F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(99, 87).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -0.9257F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-11.2128F, -3.6129F, -0.4567F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.0246F, -6.5461F, -0.0101F, 0.0333F, -1.2081F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-4.5888F, -1.5224F, -0.4567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.0246F, -6.5461F, 0.0079F, 0.0339F, -0.6842F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-3.0017F, 0.0416F, -0.4018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.0246F, -6.5461F, 0.0613F, 0.0061F, -0.1402F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(80, 34).mirror().addBox(-3.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0536F, -0.0006F, -0.1572F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(22, 93).mirror().addBox(-4.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0048F, 0.0242F, -0.7012F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(38, 24).mirror().addBox(-11.4649F, -3.5263F, -0.4402F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, -0.0079F, 0.0233F, -1.2249F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-3.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, 0.0114F, -0.0122F, -0.174F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(-4.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0253F, -0.0076F, -0.7185F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 34).mirror().addBox(-10.435F, -3.5463F, -0.401F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0181F, -0.0192F, -1.242F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-9.5571F, -3.4936F, -0.3601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0342F, -0.069F, -1.2236F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(29, 93).mirror().addBox(-4.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0641F, -0.0427F, -0.6999F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-3.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.04F, -0.0221F, -0.1554F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(80, 63).addBox(0.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.04F, 0.0221F, 0.1554F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(29, 93).addBox(2.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0641F, 0.0427F, 0.6999F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 7).addBox(3.5571F, -3.4936F, -0.3601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0342F, 0.069F, 1.2236F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(47, 34).addBox(3.435F, -3.5463F, -0.401F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0181F, 0.0192F, 1.242F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 8).addBox(2.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0253F, 0.0076F, 0.7185F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(80, 36).addBox(0.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, 0.0114F, 0.0122F, 0.174F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(38, 24).addBox(3.4649F, -3.5263F, -0.4402F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, -0.0079F, -0.0233F, 1.2249F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(22, 93).addBox(2.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0048F, -0.0242F, 0.7012F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(80, 34).addBox(0.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0536F, 0.0006F, 0.1572F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(79, 41).addBox(0.0017F, 0.0416F, -0.4018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.0246F, -6.5461F, 0.0613F, -0.0061F, 0.1402F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(92, 4).addBox(2.5888F, -1.5224F, -0.4567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.0246F, -6.5461F, 0.0079F, -0.0339F, 0.6842F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 32).addBox(3.2128F, -3.6129F, -0.4567F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.0246F, -6.5461F, -0.0101F, -0.0333F, 1.2081F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(65, 100).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -2.9257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(99, 44).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.0945F, -4.9257F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.0525F, -0.0872F, -0.0031F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(19, 10).mirror().addBox(-3.0F, 0.0F, -2.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-9.158F, -3.6342F, -0.5673F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0699F, -4.6204F, -0.0131F, 0.025F, -1.2259F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(93, 37).mirror().addBox(-4.552F, -1.5684F, -0.5673F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0699F, -4.6204F, 0.0012F, 0.0282F, -0.7021F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-2.9961F, -0.0208F, -0.5103F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0699F, -4.6204F, 0.0525F, 0.0047F, -0.1579F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(47, 36).mirror().addBox(-10.5438F, -3.4956F, -0.5718F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, -0.0108F, 0.0243F, -1.2254F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 91).mirror().addBox(-4.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.0028F, 0.0264F, -0.7016F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(21, 81).mirror().addBox(-3.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.053F, 0.0024F, -0.1575F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-3.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, 0.0271F, -0.0017F, -0.1576F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(29, 91).mirror().addBox(-4.8224F, -1.25F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, -0.0172F, 0.0095F, -0.702F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(42, 4).mirror().addBox(-11.5513F, -3.4937F, -0.5307F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, -0.0196F, -0.0004F, -1.2255F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 4).addBox(3.5513F, -3.4937F, -0.5307F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, -0.0196F, 0.0004F, 1.2255F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(29, 91).addBox(2.8224F, -1.25F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, -0.0172F, -0.0095F, 0.702F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(42, 81).addBox(0.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, 0.0271F, 0.0017F, 0.1576F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(21, 81).addBox(0.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.053F, -0.0024F, 0.1575F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(22, 91).addBox(2.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.0028F, -0.0264F, 0.7016F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(47, 36).addBox(3.5438F, -3.4956F, -0.5718F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, -0.0108F, -0.0243F, 1.2254F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(12, 81).addBox(-0.0039F, -0.0208F, -0.5103F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0699F, -4.6204F, 0.0525F, -0.0047F, 0.1579F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 37).addBox(2.552F, -1.5684F, -0.5673F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0699F, -4.6204F, 0.0012F, -0.0282F, 0.7021F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(54, 48).addBox(3.158F, -3.6342F, -0.5673F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0699F, -4.6204F, -0.0131F, -0.025F, 1.2259F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(100, 37).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3431F, -1.0062F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(100, 67).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(97, 99).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(19, 10).addBox(0.0F, 0.0F, -2.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, 0.3927F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, -0.006F, 0.0436F, -0.0003F));

		PartDefinition cube_r162 = upperbody.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 31).addBox(-3.2691F, -0.6026F, -2.0359F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(7, 69).addBox(-2.1F, 0.4F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 9.2401F, -7.1102F, 1.1378F, 0.0501F, 0.0079F));

		PartDefinition cube_r163 = upperbody.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(100, 48).addBox(-0.5F, -2.1686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.1805F, -2.0843F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r164 = upperbody.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(96, 46).addBox(-0.5F, -2.1686F, 0.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.2678F, -4.0824F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = upperbody.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-3.0F, 0.0222F, -3.0281F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, 0.0239F, -0.3483F));

		PartDefinition cube_r166 = upperbody.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-6.3459F, -3.2686F, -0.4821F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.0425F, 0.1813F, -1.2552F));

		PartDefinition cube_r167 = upperbody.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-4.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.1279F, 0.1356F, -0.7268F));

		PartDefinition cube_r168 = upperbody.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-2.7648F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.2161F, 0.0318F, -0.19F));

		PartDefinition cube_r169 = upperbody.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-3.0596F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.1304F, 0.0152F, -0.1921F));

		PartDefinition cube_r170 = upperbody.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-4.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0625F, 0.0774F, -0.7337F));

		PartDefinition cube_r171 = upperbody.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(66, 32).mirror().addBox(-7.4401F, -3.5542F, -0.4398F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0153F, 0.0982F, -1.259F));

		PartDefinition cube_r172 = upperbody.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(66, 32).addBox(3.4401F, -3.5542F, -0.4398F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0153F, -0.0982F, 1.259F));

		PartDefinition cube_r173 = upperbody.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(93, 39).addBox(2.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0625F, -0.0774F, 0.7337F));

		PartDefinition cube_r174 = upperbody.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(82, 12).addBox(0.0595F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.1304F, -0.0152F, 0.1921F));

		PartDefinition cube_r175 = upperbody.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(82, 10).addBox(-0.2352F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.2161F, -0.0318F, 0.19F));

		PartDefinition cube_r176 = upperbody.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(5, 92).addBox(2.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.1279F, -0.1356F, 0.7268F));

		PartDefinition cube_r177 = upperbody.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(76, 81).addBox(3.3459F, -3.2686F, -0.4821F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.0425F, -0.1813F, 1.2552F));

		PartDefinition cube_r178 = upperbody.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.0222F, -3.0281F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, -0.0239F, 0.3483F));

		PartDefinition cube_r179 = upperbody.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(13, 46).addBox(-1.0F, -0.6F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(64, 34).addBox(-1.0F, -0.5F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3322F, -4.8824F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(97, 56).addBox(-0.5F, -3.175F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.975F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(13, 53).mirror().addBox(-3.0F, 0.0331F, -2.7506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, 0.0609F, -0.3717F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-3.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.0622F, 0.1584F, -1.3712F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.1332F, 0.1061F, -0.8454F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.2055F, 0.0038F, -0.3095F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.3209F, 0.2498F, -1.0668F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(97, 61).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.4372F, 0.036F, -0.5597F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.7551F, -0.8569F, 0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(95, 69).mirror().addBox(-2.4551F, -1.0569F, -0.7864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(95, 72).mirror().addBox(-2.8551F, -1.0569F, 0.7136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.3809F, 0.5869F, -3.1252F, 0.1643F, 0.757F, -1.0369F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.6427F, 0.0865F, 0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-4.684F, -1.4064F, -0.8313F, 0.0942F, 0.7974F, -0.7428F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-0.315F, 0.164F, -0.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.5105F, 2.6759F, -3.3509F, 0.3388F, 0.757F, -1.0369F));

		PartDefinition cube_r190 = neck2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.3079F, -0.0396F, -0.4337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8787F, 2.5005F, -4.7438F, 0.2801F, 0.4588F, -1.128F));

		PartDefinition cube_r191 = neck2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.327F, -0.036F, -0.4311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.1955F, 0.6837F, -5.2364F, 0.4626F, 0.9987F, -0.8773F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.315F, 0.137F, -0.8575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.1915F, 3.6613F, -4.077F, 0.7315F, 0.757F, -1.0369F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 61).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.4372F, -0.036F, 0.5597F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(92, 8).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.3209F, -0.2498F, 1.0668F));

		PartDefinition cube_r195 = neck2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 81).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.2055F, -0.0038F, 0.3095F));

		PartDefinition cube_r196 = neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(92, 6).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.1332F, -0.1061F, 0.8454F));

		PartDefinition cube_r197 = neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(51, 80).addBox(2.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.0622F, -0.1584F, 1.3712F));

		PartDefinition cube_r198 = neck2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(97, 51).addBox(-0.5F, -2.275F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.875F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r199 = neck2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(13, 53).addBox(0.0F, 0.0331F, -2.7506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, -0.0609F, 0.3717F));

		PartDefinition cube_r200 = neck2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(95, 72).addBox(1.8551F, -1.0569F, 0.7136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 69).addBox(1.4551F, -1.0569F, -0.7864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 95).addBox(-0.2449F, -0.8569F, 0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.3809F, 0.5869F, -3.1252F, 0.1643F, -0.757F, 1.0369F));

		PartDefinition cube_r201 = neck2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(35, 95).addBox(-0.673F, -0.036F, -0.4311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.1955F, 0.6837F, -5.2364F, 0.4626F, -0.9987F, 0.8773F));

		PartDefinition cube_r202 = neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(40, 95).addBox(-0.6921F, -0.0396F, -0.4337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.8787F, 2.5005F, -4.7438F, 0.2801F, -0.4588F, 1.128F));

		PartDefinition cube_r203 = neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 84).addBox(-0.685F, 0.137F, -0.8575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.1915F, 3.6613F, -4.077F, 0.7315F, -0.757F, 1.0369F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(95, 75).addBox(-0.685F, 0.164F, -0.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5105F, 2.6759F, -3.3509F, 0.3388F, -0.757F, 1.0369F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 95).addBox(-0.3573F, 0.0865F, 0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.684F, -1.4064F, -0.8313F, 0.0942F, -0.7974F, 0.7428F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(54, 42).addBox(-0.5F, -0.4681F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(95, 41).addBox(-0.5F, -1.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5181F, -1.839F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-2.0F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, 0.0442F, -0.4342F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-1.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.483F, 0.5058F, -1.1112F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(99, 32).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.6923F, 0.1907F, -0.6354F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(-0.9249F, -0.5638F, -1.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8809F, 0.6425F, 0.0227F, 0.1953F, 0.7474F, -1.0484F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(82, 98).mirror().addBox(1.4712F, -0.5816F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8809F, 0.6425F, 0.0227F, 0.3446F, 0.7006F, -0.8237F));

		PartDefinition cube_r212 = neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(99, 32).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.6923F, -0.1907F, 0.6354F));

		PartDefinition cube_r213 = neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 56).addBox(0.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.483F, -0.5058F, 1.1112F));

		PartDefinition cube_r214 = neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 98).addBox(-2.4712F, -0.5816F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.8809F, 0.6425F, 0.0227F, 0.3446F, -0.7006F, 0.8237F));

		PartDefinition cube_r215 = neck3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(45, 95).addBox(-0.0752F, -0.5638F, -1.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8809F, 0.6425F, 0.0227F, 0.1953F, -0.7474F, 1.0484F));

		PartDefinition cube_r216 = neck3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(66, 26).addBox(0.0F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, -0.0442F, 0.4342F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(71, 63).addBox(-1.5F, 3.5703F, -8.7626F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.1565F, -2.6457F, -0.1566F, -0.3446F, 0.0264F));

		PartDefinition cube_r217 = head2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(68, 22).addBox(-2.0F, -0.015F, -0.0101F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 3.5655F, -8.7805F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(26, 46).addBox(-2.986F, -0.014F, -2.011F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.986F, 1.5499F, -5.5471F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(26, 51).addBox(-2.986F, -0.014F, -1.986F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.986F, 1.9975F, -7.7036F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(43, 67).addBox(-1.5F, 0.025F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 2.6415F, -8.4514F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 34).addBox(-3.5F, -0.0281F, -0.0983F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.9729F, -4.011F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(36, 26).addBox(-2.5F, -0.025F, -3.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.4443F, -4.9224F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(53, 26).addBox(-2.5F, -0.525F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2807F, -4.93F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(57, 22).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.5573F, -8.7647F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(47, 38).addBox(-5.0F, -3.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.5732F, 1.7205F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(54, 50).addBox(-2.5F, -0.525F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.4647F, -1.5207F, -0.6109F, 0.0F, 0.0F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2307F, -1.8415F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.0469F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, 1.5882F, -5.8944F, 0.3321F, -0.8449F, -0.2524F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-0.15F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8254F, 0.6276F, -6.0397F, 0.3492F, -0.886F, -0.2749F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(21, 83).mirror().addBox(-0.5F, -0.8F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.4885F, 2.6674F, -0.6747F, -0.7594F, -0.2639F, 0.213F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(28, 83).mirror().addBox(-0.2671F, -0.7397F, -1.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.5606F, 1.9585F, -0.7526F, -1.1958F, -0.2639F, 0.213F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(0.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8089F, 1.4657F, -5.3417F, 0.2692F, -0.2555F, -0.0579F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-0.6F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(72, 97).mirror().addBox(-0.6F, -0.5F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, 0.7041F, -4.6522F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(42, 83).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3103F, 0.5982F, -1.2006F, 0.3087F, -0.1704F, -0.0381F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.1581F, 2.0344F, -1.3748F, -0.2358F, -0.2639F, 0.213F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(0.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8089F, 1.4657F, -5.3417F, 0.0162F, -0.2555F, -0.0579F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7833F, 0.3043F, -3.5081F, 0.0947F, -0.2555F, -0.0579F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 98).mirror().addBox(-0.5F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2673F, 1.7775F, -1.3311F, 0.5728F, -0.1824F, -0.0091F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-0.5F, -0.75F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 98).mirror().addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4899F, 2.6681F, -0.6702F, -1.3267F, -0.2639F, 0.213F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(42, 83).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3103F, 0.5982F, -1.2006F, 0.3087F, 0.1704F, 0.0381F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(72, 97).addBox(-0.4F, -0.5F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(82, 14).addBox(-0.4F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.2985F, 0.7041F, -4.6522F, 0.2355F, 0.3829F, 0.0894F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(35, 98).addBox(-0.5F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(72, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2673F, 1.7775F, -1.3311F, 0.5728F, 0.1824F, 0.0091F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(7, 58).addBox(-1.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8089F, 1.4657F, -5.3417F, 0.0162F, 0.2555F, 0.0579F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7833F, 0.3043F, -3.5081F, 0.0947F, 0.2555F, 0.0579F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(35, 83).addBox(-1.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8089F, 1.4657F, -5.3417F, 0.2692F, 0.2555F, 0.0579F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(97, 96).addBox(-0.5F, -0.75F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4899F, 2.6681F, -0.6702F, -1.3267F, 0.2639F, -0.213F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(28, 83).addBox(-0.7329F, -0.7397F, -1.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.5606F, 1.9585F, -0.7526F, -1.1958F, 0.2639F, -0.213F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(83, 69).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.1581F, 2.0344F, -1.3748F, -0.2358F, 0.2639F, -0.213F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(21, 83).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.4885F, 2.6674F, -0.6747F, -0.7594F, 0.2639F, -0.213F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(95, 63).addBox(-0.85F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8254F, 0.6276F, -6.0397F, 0.3492F, 0.886F, 0.2749F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(10, 98).addBox(-0.9531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9786F, 1.5882F, -5.8944F, 0.3321F, 0.8449F, 0.2524F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(77, 87).addBox(-1.0F, -1.3F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9393F, -2.0167F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(89, 34).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0643F, -1.9167F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9919F, 2.4922F, -2.3992F, 0.0758F, 0.1304F, -0.088F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5887F, 0.1172F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.9964F, -1.4841F, -2.472F, 2.6291F, 0.3236F, 0.0774F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(20, 99).addBox(-0.5887F, -0.7193F, -0.8785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.9964F, -1.4841F, -2.472F, 1.1019F, 0.3236F, 0.0774F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 98).addBox(-0.5F, -0.3802F, -0.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7526F, 0.5202F, -6.2049F, -2.1069F, 0.0102F, 0.1912F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(87, 98).addBox(-0.5F, -0.6232F, -0.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.7526F, 0.5202F, -6.2049F, 2.8236F, 0.0102F, 0.1912F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(98, 84).addBox(-0.5F, -0.7761F, -0.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7526F, 0.5202F, -6.2049F, 2.0819F, 0.0102F, 0.1912F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5637F, -1.1617F, -0.8958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9964F, -1.4841F, -2.472F, 2.1055F, 0.3236F, 0.0774F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 79).addBox(-1.0F, -0.015F, -0.0101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.617F, 1.2307F, -6.9005F, 0.7117F, -0.0236F, 0.2077F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(96, 34).addBox(-1.0F, -0.015F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.3898F, 0.264F, -6.7832F, 1.4532F, 0.0028F, 0.2305F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 94).addBox(-1.0F, -0.015F, -1.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.271F, -0.6179F, -6.327F, 2.1873F, -0.0228F, 0.163F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(77, 94).addBox(-1.0F, -0.015F, -0.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.3898F, 0.264F, -6.7832F, 1.0968F, -0.0371F, 0.1529F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(30, 98).addBox(-1.1995F, -0.6701F, -1.2261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.4392F, 1.7027F, -5.1892F, 0.4396F, -0.1186F, 0.119F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(99, 13).addBox(-0.5887F, -0.6623F, -1.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-1.9964F, -1.4841F, -2.472F, -1.8651F, 0.3236F, 0.0774F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 3).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.026F)), PartPose.offsetAndRotation(-2.0845F, -1.2615F, -2.4036F, -0.3816F, 0.3236F, 0.0774F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(99, 22).addBox(-0.4183F, -0.4988F, -0.5811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 25).addBox(-0.2433F, -0.4988F, -0.5811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9964F, -1.4841F, -2.472F, -0.7809F, 0.3265F, 0.0682F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(97, 93).addBox(-0.525F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.5939F, 1.0627F, -3.7766F, 0.2234F, -0.3392F, 1.6084F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 18).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.7817F, 1.3481F, -4.4999F, 0.227F, -0.3817F, 1.5979F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(25, 98).addBox(-0.6281F, -1.0663F, -0.7252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.4392F, 1.7027F, -5.1892F, 0.8779F, -0.3392F, 1.6084F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(83, 73).addBox(-0.6401F, -0.2565F, -3.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5356F, -0.8955F, -0.7975F, 0.2537F, -0.3089F, 1.7138F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 50).addBox(-2.8875F, -0.0176F, -3.586F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5356F, -0.8955F, -0.7975F, 0.2156F, -0.6003F, 1.6087F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 90).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3866F, -3.4603F, 0.4208F, 0.0864F, 0.4082F, -0.2041F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(41, 91).addBox(-0.4917F, 0.2735F, 1.182F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.738F, 0.4739F, -0.1332F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1347F, -4.3473F, -0.6502F, 0.2653F, 0.0974F, -0.1543F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(55, 98).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1325F, -3.8009F, -1.4878F, 0.5803F, 0.1507F, 0.2449F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(60, 98).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(50, 98).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1325F, -3.8009F, -1.4878F, 0.5744F, -0.069F, 0.1021F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(15, 95).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9513F, -2.9775F, -0.9501F, 0.5707F, 0.0974F, -0.1543F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(76, 76).addBox(-0.4917F, -2.6905F, -0.7418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5356F, -0.8955F, -0.7975F, 0.6196F, 0.3874F, 0.0466F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(61, 53).addBox(-0.4917F, -0.6905F, -0.7418F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.6071F, 0.4739F, -0.1332F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 47).addBox(-0.385F, 1.5885F, 0.8776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.3866F, 0.4981F, -0.1169F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(57, 78).addBox(-0.385F, 1.6914F, 1.0755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.6484F, 0.4981F, -0.1169F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(78, 59).addBox(-0.385F, -0.3279F, 1.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -0.2242F, 0.4981F, -0.1169F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(79, 83).addBox(-0.661F, 0.92F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -0.3475F, 0.5307F, -0.2475F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(83, 65).addBox(-0.661F, -0.2144F, 1.9015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -0.6529F, 0.5307F, -0.2475F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(66, 17).addBox(-0.9838F, -0.0864F, 0.969F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -1.2106F, 0.517F, -0.3982F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(85, 51).addBox(-0.9838F, -1.4632F, 2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -1.5597F, 0.517F, -0.3982F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(83, 43).addBox(-0.4917F, 0.2617F, 0.6671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -0.1347F, 0.4739F, -0.1332F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(20, 95).addBox(-0.4917F, 0.9394F, -0.8704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.9562F, 0.4739F, -0.1332F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(98, 81).addBox(-0.4F, -0.725F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9646F, -2.7719F, -2.3035F, 0.9846F, 0.2201F, 0.5728F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(77, 98).addBox(-0.5F, -0.65F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7441F, -2.7298F, -1.8315F, 0.5266F, 0.5283F, 0.7499F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(99, 19).addBox(0.6874F, -2.2848F, 0.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 6).addBox(-0.525F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2008F, -1.3054F, -3.6048F, 2.4873F, 0.2155F, 1.0453F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(67, 97).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6698F, -0.3862F, -1.8834F, 0.9637F, 0.9164F, 0.7774F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(58, 82).addBox(-0.422F, 0.6063F, -2.3354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7011F, -4.9519F, 0.5412F, -0.0135F, 1.2161F, -0.3041F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 82).addBox(-0.2039F, -0.1766F, -1.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.139F, -5.3183F, 0.489F, 0.9464F, 1.2161F, -0.3041F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(99, 16).addBox(-0.625F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4656F, -0.8202F, -5.9138F, 0.8591F, 1.2161F, -0.3041F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(45, 98).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9727F, -2.7826F, -2.9038F, 1.5621F, -0.021F, 0.5227F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(98, 41).addBox(-0.4917F, 1.5385F, 0.6781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.0835F, 0.4739F, -0.1332F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(92, 94).addBox(-0.5F, 0.856F, -0.6836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-3.1406F, 0.9244F, -6.4138F, 2.2238F, 0.1695F, 0.0438F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(52, 90).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.9016F, 0.895F, -5.0254F, 1.9184F, 0.1695F, 0.0438F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(43, 76).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.2734F, 0.9735F, -4.3026F, 1.7359F, 0.3058F, 0.0222F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(28, 76).addBox(-0.4917F, -2.5416F, -2.4388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 1.1743F, 0.4739F, -0.1332F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 0).addBox(-0.4917F, 0.6871F, -1.8425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, 0.2144F, 0.4739F, -0.1332F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(50, 53).addBox(-0.4917F, -0.0345F, -2.2555F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.5106F, -0.8955F, -0.7975F, -0.3965F, 0.4739F, -0.1332F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9919F, 2.4922F, -2.3992F, 0.0758F, -0.1304F, 0.088F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-0.4113F, 0.1172F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.9964F, -1.4841F, -2.472F, 2.6291F, -0.3236F, -0.0774F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.4113F, -0.7193F, -0.8785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.9964F, -1.4841F, -2.472F, 1.1019F, -0.3236F, -0.0774F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-0.5F, -0.3802F, -0.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7526F, 0.5202F, -6.2049F, -2.1069F, -0.0102F, -0.1912F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(87, 98).mirror().addBox(-0.5F, -0.6232F, -0.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.7526F, 0.5202F, -6.2049F, 2.8236F, -0.0102F, -0.1912F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-0.5F, -0.7761F, -0.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7526F, 0.5202F, -6.2049F, 2.0819F, -0.0102F, -0.1912F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.4363F, -1.1617F, -0.8958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9964F, -1.4841F, -2.472F, 2.1055F, -0.3236F, -0.0774F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(0.0F, -0.015F, -0.0101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.617F, 1.2307F, -6.9005F, 0.7117F, 0.0236F, -0.2077F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(96, 34).mirror().addBox(0.0F, -0.015F, -1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.3898F, 0.264F, -6.7832F, 1.4532F, -0.0028F, -0.2305F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(82, 94).mirror().addBox(0.0F, -0.015F, -1.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.271F, -0.6179F, -6.327F, 2.1873F, 0.0228F, -0.163F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(77, 94).mirror().addBox(0.0F, -0.015F, -0.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.3898F, 0.264F, -6.7832F, 1.0968F, 0.0371F, -0.1529F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(30, 98).mirror().addBox(0.1995F, -0.6701F, -1.2261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.4392F, 1.7027F, -5.1892F, 0.4396F, 0.1186F, -0.119F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(99, 13).mirror().addBox(-0.4113F, -0.6623F, -1.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(1.9964F, -1.4841F, -2.472F, -1.8651F, -0.3236F, -0.0774F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.026F)).mirror(false), PartPose.offsetAndRotation(2.0845F, -1.2615F, -2.4036F, -0.3816F, -0.3236F, -0.0774F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(99, 22).mirror().addBox(-0.5817F, -0.4988F, -0.5811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(99, 25).mirror().addBox(-0.7567F, -0.4988F, -0.5811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9964F, -1.4841F, -2.472F, -0.7809F, -0.3265F, -0.0682F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(97, 93).mirror().addBox(-0.475F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.5939F, 1.0627F, -3.7766F, 0.2234F, 0.3392F, -1.6084F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.7817F, 1.3481F, -4.4999F, 0.227F, 0.3817F, -1.5979F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(25, 98).mirror().addBox(-0.3719F, -1.0663F, -0.7252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.4392F, 1.7027F, -5.1892F, 0.8779F, 0.3392F, -1.6084F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(83, 73).mirror().addBox(-0.3599F, -0.2565F, -3.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5356F, -0.8955F, -0.7975F, 0.2537F, 0.3089F, -1.7138F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.8875F, -0.0176F, -3.586F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5356F, -0.8955F, -0.7975F, 0.2156F, 0.6003F, -1.6087F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.3866F, -3.4603F, 0.4208F, 0.0864F, -0.4082F, 0.2041F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(41, 91).mirror().addBox(-0.5083F, 0.2735F, 1.182F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.738F, -0.4739F, 0.1332F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1347F, -4.3473F, -0.6502F, 0.2653F, -0.0974F, 0.1543F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(55, 98).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1325F, -3.8009F, -1.4878F, 0.5803F, -0.1507F, -0.2449F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(60, 98).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(50, 98).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1325F, -3.8009F, -1.4878F, 0.5744F, 0.069F, -0.1021F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9513F, -2.9775F, -0.9501F, 0.5707F, -0.0974F, 0.1543F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(76, 76).mirror().addBox(-0.5083F, -2.6905F, -0.7418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5356F, -0.8955F, -0.7975F, 0.6196F, -0.3874F, -0.0466F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-0.5083F, -0.6905F, -0.7418F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.6071F, -0.4739F, 0.1332F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.615F, 1.5885F, 0.8776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.3866F, -0.4981F, 0.1169F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-0.615F, 1.6914F, 1.0755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.6484F, -0.4981F, 0.1169F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-0.615F, -0.3279F, 1.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -0.2242F, -0.4981F, 0.1169F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(79, 83).mirror().addBox(-0.339F, 0.92F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -0.3475F, -0.5307F, 0.2475F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-0.339F, -0.2144F, 1.9015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -0.6529F, -0.5307F, 0.2475F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-0.0162F, -0.0864F, 0.969F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -1.2106F, -0.517F, 0.3982F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.0162F, -1.4632F, 2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -1.5597F, -0.517F, 0.3982F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-0.5083F, 0.2617F, 0.6671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -0.1347F, -0.4739F, 0.1332F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(-0.5083F, 0.9394F, -0.8704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.9562F, -0.4739F, 0.1332F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(98, 81).mirror().addBox(-0.6F, -0.725F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9646F, -2.7719F, -2.3035F, 0.9846F, -0.2201F, -0.5728F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(77, 98).mirror().addBox(-0.5F, -0.65F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7441F, -2.7298F, -1.8315F, 0.5266F, -0.5283F, -0.7499F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(99, 19).mirror().addBox(-1.6874F, -2.2848F, 0.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(99, 6).mirror().addBox(-0.475F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2008F, -1.3054F, -3.6048F, 2.4873F, -0.2155F, -1.0453F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6698F, -0.3862F, -1.8834F, 0.9637F, -0.9164F, -0.7774F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-0.578F, 0.6063F, -2.3354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7011F, -4.9519F, 0.5412F, -0.0135F, -1.2161F, 0.3041F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(-0.7961F, -0.1766F, -1.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.139F, -5.3183F, 0.489F, 0.9464F, -1.2161F, 0.3041F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 16).mirror().addBox(-0.375F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4656F, -0.8202F, -5.9138F, 0.8591F, -1.2161F, 0.3041F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9727F, -2.7826F, -2.9038F, 1.5621F, 0.021F, -0.5227F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(98, 41).mirror().addBox(-0.5083F, 1.5385F, 0.6781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.0835F, -0.4739F, 0.1332F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(92, 94).mirror().addBox(-0.5F, 0.856F, -0.6836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(3.1406F, 0.9244F, -6.4138F, 2.2238F, -0.1695F, -0.0438F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(2.9016F, 0.895F, -5.0254F, 1.9184F, -0.1695F, -0.0438F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(43, 76).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(2.2734F, 0.9735F, -4.3026F, 1.7359F, -0.3058F, -0.0222F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.5083F, -2.5416F, -2.4388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 1.1743F, -0.4739F, 0.1332F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5083F, 0.6871F, -1.8425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, 0.2144F, -0.4739F, 0.1332F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(-0.5083F, -0.0345F, -2.2555F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.5106F, -0.8955F, -0.7975F, -0.3965F, -0.4739F, 0.1332F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5235F, 10.1834F, -4.305F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r355 = bone3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 72).addBox(0.1191F, 0.7833F, -0.105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -2.5742F, 0.2292F, -0.3611F));

		PartDefinition cube_r356 = bone3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(37, 60).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6014F, -2.7761F, 2.1938F, 1.1915F, 0.1693F, -0.0398F));

		PartDefinition cube_r357 = bone3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(90, 75).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3613F, -3.4901F, 0.9558F, 2.5877F, 0.1693F, -0.0398F));

		PartDefinition cube_r358 = bone3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(39, 53).addBox(-0.5F, -2.0F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9012F, -0.8568F, 3.5002F, 2.3696F, 0.1693F, -0.0398F));

		PartDefinition cube_r359 = bone3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(57, 73).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9012F, -0.8568F, 3.5002F, 2.8059F, 0.1693F, -0.0398F));

		PartDefinition cube_r360 = bone3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(71, 58).addBox(-0.5F, -0.275F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5684F, -1.5662F, 1.7193F, 1.6714F, 0.1693F, -0.0398F));

		PartDefinition cube_r361 = bone3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(96, 0).addBox(-0.0631F, 0.827F, -2.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -1.7177F, 0.1462F, -0.3124F));

		PartDefinition cube_r362 = bone3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(93, 85).addBox(-0.0631F, -2.0288F, -2.278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -1.2377F, 0.1462F, -0.3124F));

		PartDefinition cube_r363 = bone3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(21, 76).addBox(-0.0631F, -4.296F, -0.9584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -0.7141F, 0.1462F, -0.3124F));

		PartDefinition cube_r364 = bone3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(14, 76).addBox(-0.0631F, -2.0376F, 3.9015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 0.5949F, 0.1462F, -0.3124F));

		PartDefinition cube_r365 = bone3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(92, 55).addBox(-0.0631F, 3.2432F, 1.1714F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 1.6857F, 0.1462F, -0.3124F));

		PartDefinition cube_r366 = bone3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(67, 93).addBox(-0.0631F, 0.2625F, 4.8728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 0.7694F, 0.1462F, -0.3124F));

		PartDefinition cube_r367 = bone3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 34).addBox(-0.0631F, -1.9374F, -0.7566F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 0.4204F, 0.1462F, -0.3124F));

		PartDefinition cube_r368 = bone3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(88, 38).addBox(0.4179F, -3.273F, -0.8621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.3127F, -3.2082F, -1.4777F, -1.0123F, -0.0448F, 0.4104F));

		PartDefinition cube_r369 = bone3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(12, 89).addBox(-0.5F, -0.85F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5835F, -1.7316F, -2.7642F, -2.9736F, 0.1845F, 1.1336F));

		PartDefinition cube_r370 = bone3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(89, 19).addBox(0.104F, -1.0342F, -0.7029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3127F, -3.2082F, -1.4777F, -0.7893F, 0.4338F, 0.7068F));

		PartDefinition cube_r371 = bone3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(77, 49).addBox(-0.3788F, 0.4544F, -3.9638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, -1.3628F, 0.562F, 0.5269F));

		PartDefinition cube_r372 = bone3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(82, 26).addBox(-0.3788F, -0.4512F, -4.0271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, 2.5206F, 0.562F, 0.5269F));

		PartDefinition cube_r373 = bone3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(82, 22).addBox(-0.3788F, -2.8603F, -3.6136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(36, 73).addBox(-0.3788F, -0.9284F, -2.1312F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, 3.1315F, 0.562F, 0.5269F));

		PartDefinition cube_r374 = bone3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(73, 34).addBox(-0.3788F, -2.2989F, 0.3452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, -1.8427F, 0.562F, 0.5269F));

		PartDefinition cube_r375 = bone3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(65, 39).addBox(-0.3788F, -1.8985F, -0.917F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, -0.621F, 0.562F, 0.5269F));

		PartDefinition cube_r376 = bone3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(90, 71).addBox(-0.3788F, -4.1838F, 0.9604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 67).addBox(-0.3788F, -4.1838F, 0.6604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, 1.2116F, 0.562F, 0.5269F));

		PartDefinition cube_r377 = bone3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(70, 53).addBox(-0.3788F, -2.3666F, -3.5128F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, 0.0771F, 0.562F, 0.5269F));

		PartDefinition cube_r378 = bone3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(64, 60).addBox(-0.3788F, -1.8971F, -2.8376F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.844F, 1.0512F, 1.1383F, -0.6646F, 0.562F, 0.5269F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5235F, 10.1834F, -4.305F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.1191F, 0.7833F, -0.105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -2.5742F, -0.2292F, 0.3611F));

		PartDefinition cube_r380 = bone2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(37, 60).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6014F, -2.7761F, 2.1938F, 1.1915F, -0.1693F, 0.0398F));

		PartDefinition cube_r381 = bone2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(90, 75).mirror().addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3613F, -3.4901F, 0.9558F, 2.5877F, -0.1693F, 0.0398F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(39, 53).mirror().addBox(-0.5F, -2.0F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9012F, -0.8568F, 3.5002F, 2.3696F, -0.1693F, 0.0398F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9012F, -0.8568F, 3.5002F, 2.8059F, -0.1693F, 0.0398F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.5F, -0.275F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5684F, -1.5662F, 1.7193F, 1.6714F, -0.1693F, 0.0398F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.9369F, 0.827F, -2.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -1.7177F, -0.1462F, 0.3124F));

		PartDefinition cube_r386 = bone2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-0.9369F, -2.0288F, -2.278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -1.2377F, -0.1462F, 0.3124F));

		PartDefinition cube_r387 = bone2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-0.9369F, -4.296F, -0.9584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -0.7141F, -0.1462F, 0.3124F));

		PartDefinition cube_r388 = bone2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.9369F, -2.0376F, 3.9015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 0.5949F, -0.1462F, 0.3124F));

		PartDefinition cube_r389 = bone2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-0.9369F, 3.2432F, 1.1714F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 1.6857F, -0.1462F, 0.3124F));

		PartDefinition cube_r390 = bone2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-0.9369F, 0.2625F, 4.8728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 0.7694F, -0.1462F, 0.3124F));

		PartDefinition cube_r391 = bone2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.9369F, -1.9374F, -0.7566F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 0.4204F, -0.1462F, 0.3124F));

		PartDefinition cube_r392 = bone2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(88, 38).mirror().addBox(-1.4179F, -3.273F, -0.8621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.3127F, -3.2082F, -1.4777F, -1.0123F, 0.0448F, -0.4104F));

		PartDefinition cube_r393 = bone2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-0.5F, -0.85F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5835F, -1.7316F, -2.7642F, -2.9736F, -0.1845F, -1.1336F));

		PartDefinition cube_r394 = bone2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-1.104F, -1.0342F, -0.7029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3127F, -3.2082F, -1.4777F, -0.7893F, -0.4338F, -0.7068F));

		PartDefinition cube_r395 = bone2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-0.6212F, 0.4544F, -3.9638F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, -1.3628F, -0.562F, -0.5269F));

		PartDefinition cube_r396 = bone2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-0.6212F, -0.4512F, -4.0271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, 2.5206F, -0.562F, -0.5269F));

		PartDefinition cube_r397 = bone2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-0.6212F, -2.8603F, -3.6136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(36, 73).mirror().addBox(-0.6212F, -0.9284F, -2.1312F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, 3.1315F, -0.562F, -0.5269F));

		PartDefinition cube_r398 = bone2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-0.6212F, -2.2989F, 0.3452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, -1.8427F, -0.562F, -0.5269F));

		PartDefinition cube_r399 = bone2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.6212F, -1.8985F, -0.917F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, -0.621F, -0.562F, -0.5269F));

		PartDefinition cube_r400 = bone2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-0.6212F, -4.1838F, 0.9604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 67).mirror().addBox(-0.6212F, -4.1838F, 0.6604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, 1.2116F, -0.562F, -0.5269F));

		PartDefinition cube_r401 = bone2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-0.6212F, -2.3666F, -3.5128F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, 0.0771F, -0.562F, -0.5269F));

		PartDefinition cube_r402 = bone2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-0.6212F, -1.8971F, -2.8376F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.844F, 1.0512F, 1.1383F, -0.6646F, -0.562F, -0.5269F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2088F, 9.093F, -1.614F, 0.6304F, -0.2875F, -0.2028F));

		PartDefinition cube_r403 = frontleftleg4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(69, 72).addBox(0.4211F, -0.0632F, 0.097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -0.7226F, -0.3938F, -0.9005F));

		PartDefinition cube_r404 = frontleftleg4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(46, 60).addBox(0.4211F, -1.1094F, -1.1758F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.7698F, -0.3938F, -0.9005F));

		PartDefinition cube_r405 = frontleftleg4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(70, 0).addBox(0.4211F, -2.0215F, -2.2404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -2.2061F, -0.3938F, -0.9005F));

		PartDefinition cube_r406 = frontleftleg4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(72, 39).addBox(0.4211F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.2898F, -0.3938F, -0.9005F));

		PartDefinition cube_r407 = frontleftleg4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(76, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8928F, 3.6893F, 0.9024F, -0.4585F, -0.308F, -0.8901F));

		PartDefinition cube_r408 = frontleftleg4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(55, 6).addBox(0.4211F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, 0.1501F, -0.3938F, -0.9005F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1956F, 4.2251F, 1.8859F, -1.1898F, 0.9134F, -0.9726F));

		PartDefinition cube_r409 = frontleftleg5.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(62, 94).addBox(0.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 1.0618F, 0.3851F, 0.9159F, -0.1321F, -0.0115F));

		PartDefinition cube_r410 = frontleftleg5.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(92, 51).addBox(-0.1237F, -1.4249F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition cube_r411 = frontleftleg5.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(94, 30).addBox(0.0F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1038F, 0.3452F, 1.0414F, -0.0004F, -0.1321F, -0.0115F));

		PartDefinition cube_r412 = frontleftleg5.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(90, 43).addBox(-0.1237F, -2.9498F, 0.0512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, 0.6104F, -0.1321F, -0.0115F));

		PartDefinition cube_r413 = frontleftleg5.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(16, 68).addBox(0.0F, -2.0F, -0.85F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 67).addBox(0.0F, -2.0F, -0.35F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0115F, 3.2942F, 0.6029F, -0.175F, -0.1321F, -0.0115F));

		PartDefinition cube_r414 = frontleftleg5.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 77).addBox(-0.4968F, -2.3912F, -0.548F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition cube_r415 = frontleftleg5.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 85).addBox(-0.4968F, -2.6531F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, 2.7925F, 0.0F, 3.1416F));

		PartDefinition cube_r416 = frontleftleg5.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(85, 59).addBox(-0.4968F, -0.5566F, -2.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, 1.8762F, 0.0F, 3.1416F));

		PartDefinition cube_r417 = frontleftleg5.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(33, 87).addBox(-0.4968F, -0.4543F, -0.3447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, -1.6581F, 0.0F, -3.1416F));

		PartDefinition cube_r418 = frontleftleg5.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(94, 14).addBox(-0.4968F, -1.3321F, 1.7926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, 1.4835F, 0.0F, 3.1416F));

		PartDefinition cube_r419 = frontleftleg5.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(72, 93).addBox(-0.4968F, -0.156F, -0.5091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition cube_r420 = frontleftleg5.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 91).addBox(-0.4968F, 0.1924F, -0.5309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2355F, 3.52F, -1.5829F, -2.7925F, 0.0F, -3.1416F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4196F, 6.4753F, -0.6562F, -0.5637F, -1.3819F, 0.783F));

		PartDefinition cube_r421 = frontleftleg6.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(38, 7).addBox(-2.0176F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0123F, -2.7407F, 0.2292F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2088F, 9.093F, -1.614F, -0.7288F, -1.1347F, 0.5355F));

		PartDefinition cube_r422 = frontrightleg4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(75, 15).addBox(-1.4211F, -0.0632F, 0.097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -0.7226F, 0.3938F, 0.9005F));

		PartDefinition cube_r423 = frontrightleg4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(55, 60).addBox(-1.4211F, -1.1094F, -1.1758F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.7698F, 0.3938F, 0.9005F));

		PartDefinition cube_r424 = frontrightleg4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(71, 5).addBox(-1.4211F, -2.0215F, -2.2404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -2.2061F, 0.3938F, 0.9005F));

		PartDefinition cube_r425 = frontrightleg4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(75, 10).addBox(-1.4211F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.2898F, 0.3938F, 0.9005F));

		PartDefinition cube_r426 = frontrightleg4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(76, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.8928F, 3.6893F, 0.9024F, -0.4585F, 0.308F, 0.8901F));

		PartDefinition cube_r427 = frontrightleg4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(0, 56).addBox(-1.4211F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, 0.1501F, 0.3938F, 0.9005F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1956F, 4.2251F, 1.8859F, -0.355F, -0.558F, 0.6498F));

		PartDefinition cube_r428 = frontrightleg5.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(94, 89).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0083F, 1.0618F, 0.3851F, 0.9159F, 0.1321F, 0.0115F));

		PartDefinition cube_r429 = frontrightleg5.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(92, 59).addBox(-0.8763F, -1.4249F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, -0.1313F, 0.1321F, 0.0115F));

		PartDefinition cube_r430 = frontrightleg5.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(87, 94).addBox(-1.0F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1038F, 0.3452F, 1.0414F, -0.0004F, 0.1321F, 0.0115F));

		PartDefinition cube_r431 = frontrightleg5.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(62, 90).addBox(-0.8763F, -2.9498F, 0.0512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, 0.6104F, 0.1321F, 0.0115F));

		PartDefinition cube_r432 = frontrightleg5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(21, 68).addBox(-1.0F, -2.0F, -0.85F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 67).addBox(-1.0F, -2.0F, -0.35F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0115F, 3.2942F, 0.6029F, -0.175F, 0.1321F, 0.0115F));

		PartDefinition cube_r433 = frontrightleg5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(77, 20).addBox(-0.5032F, -2.3912F, -0.548F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, -3.0543F, 0.0F, 3.1416F));

		PartDefinition cube_r434 = frontrightleg5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5032F, -2.6531F, -1.8531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, 2.7925F, 0.0F, -3.1416F));

		PartDefinition cube_r435 = frontrightleg5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(49, 86).addBox(-0.5032F, -0.5566F, -2.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, 1.8762F, 0.0F, -3.1416F));

		PartDefinition cube_r436 = frontrightleg5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(40, 87).addBox(-0.5032F, -0.4543F, -0.3447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, -1.6581F, 0.0F, 3.1416F));

		PartDefinition cube_r437 = frontrightleg5.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(94, 18).addBox(-0.5032F, -1.3321F, 1.7926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, 1.4835F, 0.0F, -3.1416F));

		PartDefinition cube_r438 = frontrightleg5.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(93, 81).addBox(-0.5032F, -0.156F, -0.5091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, 2.9671F, 0.0F, -3.1416F));

		PartDefinition cube_r439 = frontrightleg5.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(91, 0).addBox(-0.5032F, 0.1924F, -0.5309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2355F, 3.52F, -1.5829F, -2.7925F, 0.0F, 3.1416F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4196F, 6.4753F, -0.6562F, 0.3526F, 1.3819F, -0.783F));

		PartDefinition cube_r440 = frontrightleg6.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(38, 13).addBox(-1.9824F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0123F, -2.7407F, 0.2292F, -0.1313F, 0.1321F, 0.0115F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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