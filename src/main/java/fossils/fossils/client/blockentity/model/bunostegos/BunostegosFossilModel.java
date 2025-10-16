package fossils.fossils.client.blockentity.model.bunostegos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BunostegosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart lowerbody;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart tail;
	private final ModelPart tail4;
	private final ModelPart tail5;
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
	private final ModelPart bone4;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;

	public BunostegosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.lowerbody = this.hips.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone2 = this.lowerbody.getChild("bone2");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail4 = this.tail.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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
		this.bone4 = this.upperbody.getChild("bone4");
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

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(26, 42).addBox(-0.5F, -0.4372F, -0.9178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -12.9812F, 13.312F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-1.1F, -0.225F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(98, 56).mirror().addBox(-1.1F, -0.225F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(98, 53).mirror().addBox(-1.1F, -0.225F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 26).mirror().addBox(-2.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, -0.0334F, -0.3914F));

		PartDefinition Hips_r1 = lowerbody.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(36, 30).mirror().addBox(-2.5159F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.1929F, 2.1379F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition Hips_r2 = lowerbody.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(36, 30).addBox(-2.4841F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 0.1929F, 2.1379F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 47).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4372F, 2.0822F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4372F, 0.0822F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 59).addBox(0.1F, -0.225F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(98, 56).addBox(0.1F, -0.225F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(98, 53).addBox(0.1F, -0.225F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(19, 26).addBox(0.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.5674F, 3.3917F, 3.0006F));

		PartDefinition Hips_r3 = bone.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(50, 51).addBox(-2.0F, -4.1F, -1.3F, 4.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.7783F, 4.2291F, 0.9107F, -1.3811F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(79, 52).addBox(-0.6321F, -0.1511F, 0.8575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, -1.3375F, -0.2075F, 1.0388F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(61, 76).addBox(-1.0321F, -0.7522F, -0.1053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.9408F, 2.4634F, 1.4985F, -1.1302F, -0.1679F, 0.7969F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(57, 6).addBox(-0.5F, -0.3F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.7409F, 2.8424F, 4.139F, 0.0916F, -0.1679F, 0.7969F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(70, 93).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.8351F, 2.7461F, 4.9339F, -0.5193F, -0.1679F, 0.7969F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.6703F, 3.0518F, 2.9643F, 0.0479F, -0.1679F, 0.7969F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(7, 88).addBox(-0.5F, -0.475F, 0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.6406F, 3.1531F, -2.2453F, -0.3731F, -0.0324F, 0.9023F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(36, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.6406F, 3.1531F, -2.2453F, -0.024F, -0.0324F, 0.9023F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(59, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1002F, 0.9454F, -1.9975F, -0.0744F, -0.1037F, 0.6587F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(16, 64).addBox(-1.0321F, -0.7283F, -0.2856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9408F, 2.4634F, 1.4985F, -0.816F, -0.1679F, 0.7969F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(7, 60).addBox(0.0637F, -0.4647F, -0.9529F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8158F, 0.6634F, 1.1735F, -1.1478F, -0.1037F, 0.6587F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(64, 12).addBox(-0.5F, -0.3F, -3.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0653F, -1.2451F, -2.2909F, -0.8757F, 0.0079F, -0.278F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5F, -0.7F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.8518F, -0.0094F, 0.0426F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(25, 70).addBox(-0.5F, 0.35F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2596F, -1.991F, 0.9648F, -1.5738F, 0.0079F, -0.278F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(79, 57).addBox(-0.5F, -0.45F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2596F, -1.991F, 0.9648F, -0.6139F, 0.0079F, -0.278F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(93, 51).addBox(-0.5F, 0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6153F, -3.2398F, 0.064F, -0.5354F, 0.0079F, -0.278F));

		PartDefinition Hips_r19 = bone.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(94, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0286F, -0.9185F, -2.2052F, -0.8146F, 0.0079F, -0.278F));

		PartDefinition Hips_r20 = bone.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(94, 10).addBox(-0.5F, -2.075F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3251F, -2.0963F, -4.3289F, -0.0903F, 0.0079F, -0.278F));

		PartDefinition Hips_r21 = bone.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.553F, -2.9342F, -2.9702F, -1.0066F, 0.0079F, -0.278F));

		PartDefinition Hips_r22 = bone.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(82, 27).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9665F, -4.3278F, -4.8744F, -0.1165F, 0.0079F, -0.278F));

		PartDefinition Hips_r23 = bone.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(80, 77).addBox(-0.5F, -0.05F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7087F, -3.5732F, -0.9145F, -0.1782F, 0.0127F, -0.2779F));

		PartDefinition Hips_r24 = bone.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(99, 0).addBox(-0.5F, 0.0191F, -0.5462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(73, 12).addBox(-0.5F, -0.9809F, -2.2462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.2411F, 0.0F, 0.0436F));

		PartDefinition bone2 = lowerbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-5.5674F, 3.3917F, 3.0006F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-2.0F, -4.1F, -1.3F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7783F, 4.2291F, 0.9107F, -1.3811F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(79, 52).mirror().addBox(-0.3679F, -0.1511F, 0.8575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, -1.3375F, 0.2075F, -1.0388F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(0.0321F, -0.7522F, -0.1053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.9408F, 2.4634F, 1.4985F, -1.1302F, 0.1679F, -0.7969F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-0.5F, -0.3F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.7409F, 2.8424F, 4.139F, 0.0916F, 0.1679F, -0.7969F));

		PartDefinition Hips_r29 = bone2.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(70, 93).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.8351F, 2.7461F, 4.9339F, -0.5193F, 0.1679F, -0.7969F));

		PartDefinition Hips_r30 = bone2.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.6703F, 3.0518F, 2.9643F, 0.0479F, 0.1679F, -0.7969F));

		PartDefinition Hips_r31 = bone2.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(7, 88).mirror().addBox(-0.5F, -0.475F, 0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.6406F, 3.1531F, -2.2453F, -0.3731F, 0.0324F, -0.9023F));

		PartDefinition Hips_r32 = bone2.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(36, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.6406F, 3.1531F, -2.2453F, -0.024F, 0.0324F, -0.9023F));

		PartDefinition Hips_r33 = bone2.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1002F, 0.9454F, -1.9975F, -0.0744F, 0.1037F, -0.6587F));

		PartDefinition Hips_r34 = bone2.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(0.0321F, -0.7283F, -0.2856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9408F, 2.4634F, 1.4985F, -0.816F, 0.1679F, -0.7969F));

		PartDefinition Hips_r35 = bone2.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-1.0637F, -0.4647F, -0.9529F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8158F, 0.6634F, 1.1735F, -1.1478F, 0.1037F, -0.6587F));

		PartDefinition Hips_r36 = bone2.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(64, 12).mirror().addBox(-0.5F, -0.3F, -3.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0653F, -1.2451F, -2.2909F, -0.8757F, -0.0079F, 0.278F));

		PartDefinition Hips_r37 = bone2.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.5F, -0.7F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.8518F, 0.0094F, -0.0426F));

		PartDefinition Hips_r38 = bone2.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.5F, 0.35F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2596F, -1.991F, 0.9648F, -1.5738F, -0.0079F, 0.278F));

		PartDefinition Hips_r39 = bone2.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.5F, -0.45F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2596F, -1.991F, 0.9648F, -0.6139F, -0.0079F, 0.278F));

		PartDefinition Hips_r40 = bone2.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(93, 51).mirror().addBox(-0.5F, 0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6153F, -3.2398F, 0.064F, -0.5354F, -0.0079F, 0.278F));

		PartDefinition Hips_r41 = bone2.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(94, 13).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0286F, -0.9185F, -2.2052F, -0.8146F, -0.0079F, 0.278F));

		PartDefinition Hips_r42 = bone2.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-0.5F, -2.075F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3251F, -2.0963F, -4.3289F, -0.0903F, -0.0079F, 0.278F));

		PartDefinition Hips_r43 = bone2.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.553F, -2.9342F, -2.9702F, -1.0066F, -0.0079F, 0.278F));

		PartDefinition Hips_r44 = bone2.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9665F, -4.3278F, -4.8744F, -0.1165F, -0.0079F, 0.278F));

		PartDefinition Hips_r45 = bone2.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.5F, -0.05F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.7087F, -3.5732F, -0.9145F, -0.1782F, -0.0127F, 0.2779F));

		PartDefinition Hips_r46 = bone2.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-0.5F, 0.0191F, -0.5462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(73, 12).mirror().addBox(-0.5F, -0.9809F, -2.2462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.2411F, 0.0F, -0.0436F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1164F, 4.6277F, 1.4919F, 0.4889F, 0.2271F, 0.3622F));

		PartDefinition cube_r5 = backleftleg4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(80, 9).addBox(-0.5F, 0.3F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1622F, 0.9281F, 0.6229F, -0.5193F, -0.4768F));

		PartDefinition cube_r6 = backleftleg4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, 0.6F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1622F, 0.9281F, -0.337F, -0.5193F, -0.4768F));

		PartDefinition cube_r7 = backleftleg4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 67).addBox(-0.5F, -2.3F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, 0.0121F, -0.5193F, -0.4768F));

		PartDefinition cube_r8 = backleftleg4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 77).addBox(-0.5F, -1.1F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4815F, 0.3181F, 1.4413F, 0.3611F, -0.5193F, -0.4768F));

		PartDefinition cube_r9 = backleftleg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 76).addBox(-0.5F, -0.375F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.8649F, 0.6496F, 2.3033F, -0.8606F, -0.5193F, -0.4768F));

		PartDefinition cube_r10 = backleftleg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(91, 37).addBox(-0.05F, -2.4F, 1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.7836F, 0.9157F, -0.952F, -0.1188F, -0.5193F, -0.4768F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create().texOffs(66, 30).addBox(-1.3892F, -0.4605F, -1.3186F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7616F, 5.8644F, 1.16F, 0.0897F, -0.4697F, -0.1853F));

		PartDefinition cube_r11 = backleftleg5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 76).addBox(-0.511F, -2.5744F, -0.3587F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4959F, 2.1835F, 0.5962F, 0.3491F, 0.2618F, -0.0436F));

		PartDefinition cube_r12 = backleftleg5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(87, 72).addBox(-0.511F, 0.2168F, -0.7648F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4959F, 2.1835F, 0.5962F, -0.0436F, 0.2618F, -0.0436F));

		PartDefinition cube_r13 = backleftleg5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 81).addBox(-0.511F, -0.7538F, -0.5622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4959F, 2.1835F, 0.5962F, 0.0524F, 0.2618F, -0.0436F));

		PartDefinition cube_r14 = backleftleg5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 89).addBox(-0.511F, -1.8391F, -0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.4959F, 2.1835F, 0.5962F, -0.6109F, 0.2618F, -0.0436F));

		PartDefinition cube_r15 = backleftleg5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(89, 0).addBox(-0.511F, -1.2181F, -0.705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4959F, 2.1835F, 0.5962F, -0.1745F, 0.2618F, -0.0436F));

		PartDefinition cube_r16 = backleftleg5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 84).addBox(-0.397F, -2.1586F, -1.6193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2132F, 2.2134F, 0.1024F, -1.5708F, 1.0036F, -1.5708F));

		PartDefinition cube_r17 = backleftleg5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 84).addBox(-0.897F, -1.0586F, -1.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2132F, 2.2134F, 0.1024F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition cube_r18 = backleftleg5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 77).addBox(-0.497F, -2.0586F, -1.6193F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2132F, 2.2134F, 0.1024F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r19 = backleftleg5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(68, 76).addBox(0.098F, -2.0951F, -1.6128F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2132F, 2.2134F, 0.1024F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create().texOffs(19, 19).addBox(-1.8382F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3787F, 5.5593F, 0.4812F, -0.0437F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1164F, 4.6277F, 1.4919F, 0.6773F, -0.1729F, -0.432F));

		PartDefinition cube_r20 = backrightleg4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, 0.3F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1622F, 0.9281F, 0.6229F, 0.5193F, 0.4768F));

		PartDefinition cube_r21 = backrightleg4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 37).addBox(-0.5F, 0.6F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1622F, 0.9281F, -0.337F, 0.5193F, 0.4768F));

		PartDefinition cube_r22 = backrightleg4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 35).addBox(-0.5F, -2.3F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, 0.0121F, 0.5193F, 0.4768F));

		PartDefinition cube_r23 = backrightleg4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 79).addBox(-0.5F, -1.1F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4815F, 0.3181F, 1.4413F, 0.3611F, 0.5193F, 0.4768F));

		PartDefinition cube_r24 = backrightleg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 93).addBox(-0.5F, -0.375F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.8649F, 0.6496F, 2.3033F, -0.8606F, 0.5193F, 0.4768F));

		PartDefinition cube_r25 = backrightleg4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 93).addBox(-0.95F, -2.4F, 1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-0.7836F, 0.9157F, -0.952F, -0.1188F, 0.5193F, 0.4768F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create().texOffs(0, 67).addBox(0.3892F, -0.4605F, -1.3186F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.7616F, 5.8644F, 1.16F, 0.0024F, 0.4697F, 0.1853F));

		PartDefinition cube_r26 = backrightleg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(79, 47).addBox(-0.489F, -2.5744F, -0.3587F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4959F, 2.1835F, 0.5962F, 0.3491F, -0.2618F, 0.0436F));

		PartDefinition cube_r27 = backrightleg5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 77).addBox(-0.489F, 0.2168F, -0.7648F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.4959F, 2.1835F, 0.5962F, -0.0436F, -0.2618F, 0.0436F));

		PartDefinition cube_r28 = backrightleg5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(24, 81).addBox(-0.489F, -0.7538F, -0.5622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4959F, 2.1835F, 0.5962F, 0.0524F, -0.2618F, 0.0436F));

		PartDefinition cube_r29 = backrightleg5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 89).addBox(-0.489F, -1.8391F, -0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.4959F, 2.1835F, 0.5962F, -0.6109F, -0.2618F, 0.0436F));

		PartDefinition cube_r30 = backrightleg5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(60, 89).addBox(-0.489F, -1.2181F, -0.705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4959F, 2.1835F, 0.5962F, -0.1745F, -0.2618F, 0.0436F));

		PartDefinition cube_r31 = backrightleg5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 93).addBox(-0.603F, -2.1586F, -1.6193F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2132F, 2.2134F, 0.1024F, -1.5708F, -1.0036F, 1.5708F));

		PartDefinition cube_r32 = backrightleg5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 55).addBox(-0.103F, -1.0586F, -1.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2132F, 2.2134F, 0.1024F, 1.5708F, -1.5272F, -1.5708F));

		PartDefinition cube_r33 = backrightleg5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 79).addBox(-0.503F, -2.0586F, -1.6193F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2132F, 2.2134F, 0.1024F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r34 = backrightleg5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 77).addBox(-1.098F, -2.0951F, -1.6128F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2132F, 2.2134F, 0.1024F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create().texOffs(0, 20).addBox(-2.1618F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3787F, 5.5593F, 0.4812F, -0.0873F, -0.0038F, 0.0435F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(50, 58).addBox(-0.5F, -0.683F, -0.2086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(13, 49).addBox(0.5F, -0.183F, -0.2086F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(13, 49).mirror().addBox(-2.5F, -0.183F, -0.2086F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 62).addBox(0.0F, -1.183F, -0.2086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 67).addBox(0.0F, -1.083F, 1.7914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2643F, 4.1371F, -0.2566F, -0.0844F, 0.0221F));

		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.383F, 0.4914F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(55, 20).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.383F, 0.4914F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(67, 43).addBox(-0.5F, -0.4261F, -0.1812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.233F, 3.7914F, -0.0483F, -0.0872F, 0.0042F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(68, 5).addBox(-0.5F, -0.4869F, -0.2066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, 0.1676F, -0.2583F, -0.0432F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.6101F, -6.1997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 99).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -1.1997F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 99).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -3.1997F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(70, 99).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -5.1997F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-1.2F, -0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 47).mirror().addBox(-1.2F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 22).mirror().addBox(-1.2F, -0.2F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 34).mirror().addBox(-2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-3.9114F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.0702F, -0.0163F, -0.1748F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(-2.6523F, 0.4124F, -0.3759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, -0.006F, -0.0142F, -0.1651F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-4.482F, -1.0258F, -0.4105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, -0.0391F, -0.0183F, -0.7097F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(87, 8).mirror().addBox(-2.7067F, 0.4437F, -0.2787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.9451F, 0.0631F, -0.004F, -0.1918F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-4.5444F, -1.0312F, -0.3133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.9451F, 0.0147F, 0.0262F, -0.7356F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(38, 24).mirror().addBox(-9.42F, -3.1652F, -0.3133F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.9451F, -0.0003F, 0.03F, -1.2594F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(98, 50).addBox(0.2F, -0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 47).addBox(0.2F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 22).addBox(0.2F, -0.2F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 34).addBox(0.0F, 0.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(65, 48).addBox(-0.0886F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.0702F, 0.0163F, 0.1748F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 70).addBox(-0.3477F, 0.4124F, -0.3759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, -0.006F, 0.0142F, 0.1651F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(91, 23).addBox(2.482F, -1.0258F, -0.4105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, -0.0391F, 0.0183F, 0.7097F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(87, 8).addBox(-0.2933F, 0.4437F, -0.2787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.9451F, 0.0631F, 0.004F, 0.1918F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 21).addBox(2.5444F, -1.0312F, -0.3133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.9451F, 0.0147F, -0.0262F, 0.7356F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 24).addBox(3.42F, -3.1652F, -0.3133F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.9451F, -0.0003F, -0.03F, 1.2594F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 10).addBox(-3.25F, -0.4945F, -7.9257F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(77, 72).addBox(-2.75F, -2.3945F, -6.9257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(99, 15).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -0.9257F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-1.1F, -0.3F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 98).mirror().addBox(-1.1F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 98).mirror().addBox(-1.1F, -0.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 97).mirror().addBox(-1.1F, -0.3F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-2.0F, 0.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(82, 35).mirror().addBox(-3.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0745F, -0.0275F, -0.1545F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-4.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0908F, -0.0651F, -0.6984F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(38, 20).mirror().addBox(-10.5571F, -3.4936F, -0.3601F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0461F, -0.1018F, -1.2226F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-11.435F, -3.5463F, -0.401F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0294F, -0.0523F, -1.2416F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 54).mirror().addBox(-4.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0516F, -0.0306F, -0.718F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-3.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.023F, -0.0182F, -0.1734F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(-11.4649F, -3.5263F, -0.4402F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, -0.0138F, 0.0069F, -1.225F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 59).mirror().addBox(-4.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, -0.0085F, 0.0129F, -0.7014F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-3.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0363F, -0.0033F, -0.1571F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-3.0434F, 0.3354F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.0958F, 0.011F, -0.1399F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(41, 91).mirror().addBox(-4.7767F, -1.2911F, -0.491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.035F, 0.0559F, -0.683F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 34).mirror().addBox(-12.4912F, -3.5065F, -0.491F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.0023F, 0.0659F, -1.2075F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 35).addBox(0.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0745F, 0.0275F, 0.1545F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 45).addBox(2.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0908F, 0.0651F, 0.6984F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 20).addBox(3.5571F, -3.4936F, -0.3601F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0461F, 0.1018F, 1.2226F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 10).addBox(3.435F, -3.5463F, -0.401F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0294F, 0.0523F, 1.2416F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(18, 54).addBox(2.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0516F, 0.0306F, 0.718F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(82, 33).addBox(0.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.023F, 0.0182F, 0.1734F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(38, 8).addBox(3.4649F, -3.5263F, -0.4402F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, -0.0138F, -0.0069F, 1.225F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(91, 59).addBox(2.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, -0.0085F, -0.0129F, 0.7014F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(82, 31).addBox(0.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0363F, 0.0033F, 0.1571F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 82).addBox(0.0433F, 0.3354F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.0958F, -0.011F, 0.1399F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 91).addBox(2.7767F, -1.2911F, -0.491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.035F, -0.0559F, 0.683F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(34, 34).addBox(3.4912F, -3.5065F, -0.491F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.0023F, -0.0659F, 1.2075F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 100).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -2.9257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(64, 85).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -4.9257F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(98, 19).addBox(0.1F, -0.3F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 98).addBox(0.1F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 98).addBox(0.1F, -0.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 97).addBox(0.1F, -0.3F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 0.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 42).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.07F, 0.0431F, 0.0068F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-1.1F, -0.3F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 85).mirror().addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 82).mirror().addBox(-1.1F, -0.3F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 27).mirror().addBox(-2.0F, 0.0F, -2.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-12.5513F, -3.4937F, -0.5307F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, 0.039F, 0.0342F, -1.2272F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-4.8224F, -1.2499F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, 0.0509F, 0.0101F, -0.704F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-3.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, 0.0858F, -0.0364F, -0.1613F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-3.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.1306F, 0.0147F, -0.1569F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-4.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.0629F, 0.077F, -0.6985F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-12.5438F, -3.4956F, -0.5718F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.0159F, 0.0981F, -1.2238F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-3.0582F, 0.3676F, -0.5833F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.1818F, 0.0252F, -0.156F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-4.8065F, -1.2657F, -0.6271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.1016F, 0.1124F, -0.695F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 12).mirror().addBox(-11.5298F, -3.4993F, -0.6271F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.0316F, 0.1481F, -1.222F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(36, 28).addBox(3.5513F, -3.4937F, -0.5307F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, -0.0019F, -0.0489F, 1.2251F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(91, 31).addBox(2.8224F, -1.2499F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, 0.0228F, -0.0433F, 0.7009F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 82).addBox(0.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, 0.0789F, -0.0065F, 0.1574F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(82, 39).addBox(0.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.1306F, -0.0147F, 0.1569F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 12).addBox(2.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.0629F, -0.077F, 0.6985F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 26).addBox(3.5438F, -3.4956F, -0.5718F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.0159F, -0.0981F, 1.2238F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(82, 37).addBox(0.0582F, 0.3676F, -0.5833F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.1818F, -0.0252F, 0.156F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(92, 80).addBox(2.8066F, -1.2657F, -0.6271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.1016F, -0.1124F, 0.695F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(38, 12).addBox(3.5298F, -3.4993F, -0.6271F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.0316F, -0.1481F, 1.222F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(99, 29).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3431F, -1.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 100).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(99, 25).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(97, 88).addBox(0.1F, -0.3F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 85).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 82).addBox(0.1F, -0.3F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(0.0F, 0.0F, -2.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, 0.3927F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, 0.0727F, 0.0435F, 0.0038F));

		PartDefinition Bodyfront_r1 = upperbody.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(50, 48).addBox(-4.1F, -1.6026F, 0.4641F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(38, 14).addBox(-4.1F, -1.6F, 1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 9.2401F, -7.1102F, 1.1378F, 0.0501F, 0.0079F));

		PartDefinition Bodyfront_r2 = upperbody.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(57, 26).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1306F, 9.3318F, -4.4603F, 1.3559F, 0.0501F, 0.0079F));

		PartDefinition Bodyfront_r3 = upperbody.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(54, 79).addBox(-2.1F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0888F, 8.5344F, -7.4446F, 1.2687F, 0.0501F, 0.0079F));

		PartDefinition cube_r106 = upperbody.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -2.2686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.1805F, -2.0843F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r107 = upperbody.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 99).addBox(-0.5F, -1.9686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.2678F, -4.0824F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = upperbody.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(26, 100).addBox(-0.5F, -1.9019F, -0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.0322F, -5.9824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = upperbody.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(79, 97).mirror().addBox(-1.1F, -0.3778F, -0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(97, 76).mirror().addBox(-1.1F, -0.3778F, -2.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(97, 73).mirror().addBox(-1.1F, -0.3778F, -4.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(19, 10).mirror().addBox(-2.0F, 0.0222F, -5.0281F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, 0.0239F, -0.3483F));

		PartDefinition cube_r110 = upperbody.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 45).mirror().addBox(-2.5812F, 0.2502F, -0.4473F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1531F, -5.6686F, 0.2764F, 0.0763F, -0.2576F));

		PartDefinition cube_r111 = upperbody.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(89, 82).mirror().addBox(-4.3372F, -1.1246F, -0.4865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1531F, -5.6686F, 0.1573F, 0.2046F, -0.7926F));

		PartDefinition cube_r112 = upperbody.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-7.1938F, -3.1426F, -0.4865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1531F, -5.6686F, 0.0323F, 0.2555F, -1.3283F));

		PartDefinition cube_r113 = upperbody.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(38, 22).mirror().addBox(-10.4401F, -3.5542F, -0.4398F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0153F, 0.0982F, -1.259F));

		PartDefinition cube_r114 = upperbody.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-4.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0625F, 0.0774F, -0.7337F));

		PartDefinition cube_r115 = upperbody.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-3.0596F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.1304F, 0.0152F, -0.1921F));

		PartDefinition cube_r116 = upperbody.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-2.7648F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.2161F, 0.0318F, -0.19F));

		PartDefinition cube_r117 = upperbody.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 91).mirror().addBox(-4.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.1279F, 0.1356F, -0.7268F));

		PartDefinition cube_r118 = upperbody.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-9.3459F, -3.2686F, -0.4821F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.0425F, 0.1813F, -1.2552F));

		PartDefinition cube_r119 = upperbody.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 45).addBox(-0.4188F, 0.2502F, -0.4473F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1531F, -5.6686F, 0.2764F, -0.0763F, 0.2576F));

		PartDefinition cube_r120 = upperbody.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 82).addBox(2.3372F, -1.1246F, -0.4865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1531F, -5.6686F, 0.1573F, -0.2046F, 0.7926F));

		PartDefinition cube_r121 = upperbody.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(68, 10).addBox(3.1938F, -3.1426F, -0.4865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1531F, -5.6686F, 0.0323F, -0.2555F, 1.3283F));

		PartDefinition cube_r122 = upperbody.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(38, 22).addBox(3.4401F, -3.5542F, -0.4398F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0153F, -0.0982F, 1.259F));

		PartDefinition cube_r123 = upperbody.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 19).addBox(2.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0625F, -0.0774F, 0.7337F));

		PartDefinition cube_r124 = upperbody.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(83, 43).addBox(0.0595F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.1304F, -0.0152F, 0.1921F));

		PartDefinition cube_r125 = upperbody.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 41).addBox(-0.2352F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.2161F, -0.0318F, 0.19F));

		PartDefinition cube_r126 = upperbody.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(48, 91).addBox(2.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.1279F, -0.1356F, 0.7268F));

		PartDefinition cube_r127 = upperbody.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(52, 46).addBox(3.3459F, -3.2686F, -0.4821F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.0425F, -0.1813F, 1.2552F));

		PartDefinition cube_r128 = upperbody.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 97).addBox(0.1F, -0.3778F, -0.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(97, 76).addBox(0.1F, -0.3778F, -2.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(97, 73).addBox(0.1F, -0.3778F, -4.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(19, 10).addBox(0.0F, 0.0222F, -5.0281F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, -0.0239F, 0.3483F));

		PartDefinition cube_r129 = upperbody.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -0.6F, -1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, -0.5F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(29, 100).addBox(-0.5F, -2.1F, -2.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 100).addBox(-0.5F, -2.1F, -0.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -6.9824F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-1.1F, -0.3668F, -0.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 96).mirror().addBox(-1.1F, -0.2669F, -2.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 59).mirror().addBox(-2.0F, 0.0331F, -2.7506F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, 0.0609F, -0.3717F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1209F, -2.6861F, 0.5412F, 0.1005F, -0.3345F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1209F, -2.6861F, 0.3837F, 0.3563F, -0.8299F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(98, 62).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2209F, -0.6861F, 0.4555F, 0.0826F, -0.1241F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2209F, -0.6861F, 0.3138F, 0.2993F, -0.6342F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(38, 82).mirror().addBox(-3.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2209F, -0.6861F, 0.1183F, 0.4146F, -1.1806F));

		PartDefinition cube_r136 = neck2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(99, 45).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1209F, -2.6861F, 0.5412F, -0.1005F, 0.3345F));

		PartDefinition cube_r137 = neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(91, 57).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1209F, -2.6861F, 0.3837F, -0.3563F, 0.8299F));

		PartDefinition cube_r138 = neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 62).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2209F, -0.6861F, 0.4555F, -0.0826F, 0.1241F));

		PartDefinition cube_r139 = neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(91, 55).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2209F, -0.6861F, 0.3138F, -0.2993F, 0.6342F));

		PartDefinition cube_r140 = neck2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(38, 82).addBox(2.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2209F, -0.6861F, 0.1183F, -0.4146F, 1.1806F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(96, 33).addBox(0.1F, -0.3668F, -0.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 96).addBox(0.1F, -0.2669F, -2.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 59).addBox(0.0F, 0.0331F, -2.7506F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, -0.0609F, 0.3717F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(27, 59).addBox(-0.5F, -0.4681F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, 0.1759F, 0.1739F, 0.0154F));

		PartDefinition cube_r142 = neck3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 100).addBox(-0.5F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5181F, -1.839F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r143 = neck3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.6923F, 0.1907F, -0.6354F));

		PartDefinition cube_r144 = neck3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 99).mirror().addBox(-1.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.483F, 0.5058F, -1.1112F));

		PartDefinition cube_r145 = neck3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-2.075F, 0.05F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, 0.0442F, -0.4342F));

		PartDefinition cube_r146 = neck3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(65, 99).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.6923F, -0.1907F, 0.6354F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 99).addBox(0.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.483F, -0.5058F, 1.1112F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(16, 69).addBox(0.075F, 0.05F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, -0.0442F, 0.4342F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0385F, -3.197F, 0.2871F, 0.3359F, 0.097F));

		PartDefinition cube_r149 = head2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 84).addBox(-1.5F, -0.065F, -0.9601F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.6787F, -6.4898F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 88).addBox(-1.5F, -1.075F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 1.2826F, -5.1397F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 96).addBox(0.0F, -0.775F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5491F, 1.5702F, -7.1212F, -0.8482F, -0.0322F, -0.013F));

		PartDefinition cube_r152 = head2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(54, 70).addBox(-1.5F, -1.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 1.2826F, -5.1397F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(85, 84).addBox(-1.0F, -0.0281F, -1.0983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.7009F, -2.5502F, 0.413F, 0.1451F, -0.3186F));

		PartDefinition cube_r154 = head2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -0.0281F, -1.0983F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.7009F, -2.5502F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(90, 91).addBox(-0.5F, -0.825F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.4478F, -1.6851F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(61, 51).addBox(-2.0F, -0.025F, -1.95F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.2181F, -3.563F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(48, 88).addBox(-1.5F, -0.0126F, 0.0028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 2.4408F, -6.8848F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(41, 88).addBox(-1.5F, -2.1126F, -0.3972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.4282F, -6.2562F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 56).addBox(-4.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.6585F, 0.4153F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(37, 55).addBox(-4.5F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, -2.1067F, -1.7754F, 0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6915F, -0.3877F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(0.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7444F, 0.4639F, -1.8231F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-0.6F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, 0.8291F, -4.3522F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(0.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8089F, 1.4657F, -5.1417F, 0.2256F, -0.2555F, -0.0579F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-0.2671F, -0.7396F, -1.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5606F, 1.6585F, -2.1526F, -1.5448F, -0.2639F, 0.213F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(84, 98).mirror().addBox(-0.6F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.2522F, 1.8291F, -4.9262F, -0.4408F, -0.899F, -0.2374F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.2671F, -0.6113F, -1.4446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.5606F, 1.6585F, -2.1526F, -0.934F, -0.2639F, 0.213F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 25).mirror().addBox(-0.15F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8254F, 0.7526F, -5.7397F, 0.3492F, -0.886F, -0.2749F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-0.0469F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, 1.5882F, -5.6944F, 0.3321F, -0.8449F, -0.2524F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(94, 28).addBox(-1.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7444F, 0.4639F, -1.8231F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 84).addBox(-0.4F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.2985F, 0.8291F, -4.3522F, 0.2355F, 0.3829F, 0.0894F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(55, 30).addBox(-1.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8089F, 1.4657F, -5.1417F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(84, 4).addBox(-0.7329F, -0.7396F, -1.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5606F, 1.6585F, -2.1526F, -1.5448F, 0.2639F, -0.213F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(84, 98).addBox(-0.4F, -0.55F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2522F, 1.8291F, -4.9262F, -0.4408F, 0.899F, 0.2374F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 83).addBox(-0.7329F, -0.6113F, -1.4446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.5606F, 1.6585F, -2.1526F, -0.934F, 0.2639F, -0.213F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(94, 25).addBox(-0.85F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8254F, 0.7526F, -5.7397F, 0.3492F, 0.886F, 0.2749F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 16).addBox(-0.9531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9786F, 1.5882F, -5.6944F, 0.3321F, 0.8449F, 0.2524F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -1.3F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 43).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0643F, -1.7167F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.4795F, -1.0589F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 98).addBox(-0.5555F, -0.9433F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, 0.9915F, 0.2107F, -0.0887F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(99, 9).addBox(-0.5305F, -1.1715F, -0.1769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, 2.955F, 0.2107F, -0.0887F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(99, 12).addBox(-0.5305F, -1.0172F, -0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, 1.6896F, 0.2107F, -0.0887F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(95, 91).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9919F, -1.593F, -5.0045F, -0.2719F, -0.0583F, 0.2477F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5555F, -1.0751F, -0.3327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, 0.1188F, 0.2107F, -0.0887F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(27, 56).addBox(-0.0477F, -0.025F, -0.614F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5169F, -4.8059F, -0.1673F, 0.236F, -0.3266F, 1.2695F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(69, 96).addBox(0.0F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-3.241F, -1.5093F, -5.7623F, -2.4104F, -0.0348F, 0.0873F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(96, 67).addBox(0.0F, -0.375F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-3.241F, -1.5093F, -5.7623F, -1.4069F, -0.0348F, 0.0873F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(96, 64).addBox(0.0F, -0.675F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.241F, -1.5093F, -5.7623F, -0.7785F, -0.0348F, 0.0873F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(29, 84).addBox(0.075F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-3.205F, -1.8472F, -4.3476F, 0.4836F, 0.2095F, 0.0705F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(90, 95).addBox(-0.5F, -2.1626F, 0.6028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.9919F, 2.9487F, -5.1974F, 0.4396F, -0.1186F, -0.0556F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(97, 42).addBox(-0.5555F, 0.0033F, -0.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, 0.4679F, 0.2107F, -0.0887F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(65, 93).addBox(-0.5555F, -0.5223F, 0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.027F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, -0.2303F, 0.2107F, -0.0887F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(42, 97).addBox(-0.5555F, -1.0725F, -0.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, -0.972F, 0.2107F, -0.0887F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 61).addBox(-0.5084F, -0.5455F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 93).addBox(-0.3334F, -0.5455F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.627F, -2.1562F, -2.3586F, -1.1958F, 0.2098F, -0.0982F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(85, 95).addBox(-0.0145F, -0.4214F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(32, 97).addBox(-0.3952F, -0.5465F, -0.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 27).addBox(-1.0145F, -0.4214F, -0.2371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.4432F, -0.1951F, -5.0037F, 0.7303F, -0.3548F, 1.4841F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(17, 95).addBox(-0.4063F, -0.5041F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.4915F, -0.417F, -4.6369F, 0.7537F, -0.0143F, 1.8933F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 39).addBox(-0.8091F, -0.5517F, -0.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4432F, -0.1951F, -5.0037F, 0.6231F, -0.0765F, 1.816F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 97).addBox(-1.1988F, -0.4235F, -0.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.4432F, -0.1951F, -5.0037F, 0.7541F, -0.5551F, 1.4112F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 95).addBox(-0.8518F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4915F, -0.417F, -4.6369F, 0.9137F, -0.5272F, 1.3288F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(47, 64).addBox(0.569F, 0.0718F, -0.3246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5742F, -0.3665F, -4.6955F, 0.2468F, -0.4737F, 1.3947F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(80, 94).addBox(-1.2645F, -0.1963F, 0.2629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4432F, 1.8049F, -5.0037F, 0.7303F, -0.3548F, 1.4841F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(38, 64).addBox(-0.0443F, 0.0166F, -0.0731F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5742F, -0.3665F, -4.6955F, 0.2112F, -0.4089F, 1.4879F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(87, 10).addBox(-0.0002F, 0.0879F, 0.0546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.4084F, -3.5195F, -1.8792F, 0.0699F, -0.1971F, 1.2536F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(73, 0).addBox(0.0693F, 0.1433F, -0.0307F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.1286F, -3.6433F, -2.0328F, 0.0954F, -0.2648F, 1.4003F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(39, 42).addBox(-0.3307F, 0.1183F, -0.0307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6432F, -1.2381F, -5.2125F, 0.2201F, -0.5239F, 1.4185F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(55, 89).addBox(-1.0595F, -0.2209F, 0.2699F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5169F, -4.8059F, -0.1673F, -0.0416F, 0.3869F, -0.2818F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(39, 48).addBox(-0.5709F, -2.2354F, -1.9579F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.542F, -1.2933F, -0.0245F, 0.1475F, 0.355F, -0.7449F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(97, 70).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 97).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 97).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1667F, -1.6282F, 1.2338F, 0.4971F, 1.0072F, -1.0543F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(27, 97).addBox(-0.4F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 91).addBox(-0.4F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0987F, -3.0199F, 1.5634F, 1.3135F, 1.4845F, -0.1896F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5003F, -0.3401F, -1.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8795F, -0.38F, 0.5376F, -1.0295F, 0.3558F, -1.07F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(82, 18).addBox(-0.5003F, -0.6556F, -1.6465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8795F, -0.38F, 0.5376F, -2.2076F, 0.3558F, -1.07F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(82, 14).addBox(-0.5003F, -0.5008F, -1.4265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8795F, -0.38F, 0.5376F, -1.6404F, 0.3558F, -1.07F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5709F, -0.8078F, -0.1067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.542F, -1.2933F, -0.0245F, -0.1579F, 0.355F, -0.7449F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(91, 66).addBox(-0.5709F, -0.2408F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.542F, -1.2933F, -0.0245F, 0.9329F, 0.355F, -0.7449F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(64, 96).addBox(-0.5F, -1.322F, -0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 0.4872F, 0.0341F, 0.2619F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(59, 96).addBox(-0.5F, -0.7515F, 0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.0981F, 0.0341F, 0.2619F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(75, 93).addBox(-0.5F, 0.0406F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.8835F, 0.0341F, 0.2619F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 97).addBox(-0.4712F, -0.154F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(96, 36).addBox(-0.4712F, -0.154F, -1.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.7596F, 1.993F, 0.1445F, -0.186F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(22, 97).addBox(-0.4712F, -1.1345F, -1.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.7596F, 2.6911F, 0.1445F, -0.186F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 85).addBox(-0.5F, -0.8884F, -0.9298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.4908F, 0.0341F, 0.2619F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(66, 17).addBox(-0.8F, -0.5344F, -2.402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.4579F, 0.2418F, 0.6501F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(65, 65).addBox(-0.8F, -0.9344F, -2.402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.1088F, 0.2418F, 0.6501F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(84, 22).addBox(-0.5F, -0.9344F, -1.202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.9419F, -4.8992F, 0.5595F, 1.0545F, 0.0341F, 0.2619F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(92, 88).addBox(-0.5F, 0.3762F, 0.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 2.6013F, -0.1748F, 0.5441F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 60).addBox(-0.9F, -1.045F, -2.0927F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 1.3492F, -0.2477F, 0.8934F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(73, 81).addBox(-0.9F, -0.645F, -0.7927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 1.7419F, -0.2477F, 0.8934F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(81, 62).addBox(-0.5F, -0.445F, -0.4927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(61, 81).addBox(-0.5F, -0.845F, -0.4927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 1.8159F, -0.1748F, 0.5441F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(91, 33).addBox(-0.5F, -0.4962F, -0.1289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(73, 85).addBox(-0.5F, -0.9962F, -2.2289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 0.9869F, -0.1748F, 0.5441F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5F, -1.0405F, -0.3367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.7919F, -3.2983F, -2.4745F, 1.5105F, -0.1748F, 0.5441F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(54, 94).addBox(-0.5709F, 0.3269F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.542F, -1.2933F, -0.0245F, 0.0602F, 0.355F, -0.7449F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(26, 49).addBox(-0.5709F, -0.8673F, -3.2797F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.542F, -1.2933F, -0.0245F, -0.4197F, 0.355F, -0.7449F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.4795F, -1.0589F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(89, 98).mirror().addBox(-0.4445F, -0.9433F, -0.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, 0.9915F, -0.2107F, 0.0887F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-0.4695F, -1.1715F, -0.1769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, 2.955F, -0.2107F, 0.0887F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-0.4695F, -1.0172F, -0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, 1.6896F, -0.2107F, 0.0887F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9919F, -1.593F, -5.0045F, -0.2719F, 0.0583F, -0.2477F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.4445F, -1.0751F, -0.3327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, 0.1188F, -0.2107F, 0.0887F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-2.9523F, -0.025F, -0.614F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5169F, -4.8059F, -0.1673F, 0.236F, 0.3266F, -1.2695F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(69, 96).mirror().addBox(-1.0F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(3.241F, -1.5093F, -5.7623F, -2.4104F, 0.0348F, -0.0873F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(-1.0F, -0.375F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(3.241F, -1.5093F, -5.7623F, -1.4069F, 0.0348F, -0.0873F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-1.0F, -0.675F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.241F, -1.5093F, -5.7623F, -0.7785F, 0.0348F, -0.0873F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 84).mirror().addBox(-1.075F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(3.205F, -1.8472F, -4.3476F, 0.4836F, -0.2095F, -0.0705F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-0.5F, -2.1626F, 0.6028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.9919F, 2.9487F, -5.1974F, 0.4396F, 0.1186F, 0.0556F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-0.4445F, 0.0033F, -0.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, 0.4679F, -0.2107F, 0.0887F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.4445F, -0.5223F, 0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.027F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, -0.2303F, -0.2107F, 0.0887F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(42, 97).mirror().addBox(-0.4445F, -1.0725F, -0.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, -0.972F, -0.2107F, 0.0887F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(-0.4916F, -0.5455F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 93).mirror().addBox(-0.6666F, -0.5455F, -0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.627F, -2.1562F, -2.3586F, -1.1958F, -0.2098F, 0.0982F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(85, 95).mirror().addBox(-0.9855F, -0.4214F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(32, 97).mirror().addBox(-0.6048F, -0.5465F, -0.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(68, 27).mirror().addBox(-0.9855F, -0.4214F, -0.2371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.4432F, -0.1951F, -5.0037F, 0.7303F, 0.3548F, -1.4841F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(17, 95).mirror().addBox(-0.5937F, -0.5041F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.4915F, -0.417F, -4.6369F, 0.7537F, 0.0143F, -1.8933F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(-0.1909F, -0.5517F, -0.8498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4432F, -0.1951F, -5.0037F, 0.6231F, 0.0765F, -1.816F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(37, 97).mirror().addBox(0.1988F, -0.4235F, -0.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.4432F, -0.1951F, -5.0037F, 0.7541F, 0.5551F, -1.4112F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.1482F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4915F, -0.417F, -4.6369F, 0.9137F, 0.5272F, -1.3288F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 64).mirror().addBox(-1.569F, 0.0718F, -0.3246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5742F, -0.3665F, -4.6955F, 0.2468F, 0.4737F, -1.3947F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 94).mirror().addBox(0.2645F, -0.1963F, 0.2629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4432F, 1.8049F, -5.0037F, 0.7303F, 0.3548F, -1.4841F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(38, 64).mirror().addBox(-0.9557F, 0.0166F, -0.0731F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5742F, -0.3665F, -4.6955F, 0.2112F, 0.4089F, -1.4879F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(87, 10).mirror().addBox(-0.9998F, 0.0879F, 0.0546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.4084F, -3.5195F, -1.8792F, 0.0699F, 0.1971F, -1.2536F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-2.0693F, 0.1433F, -0.0307F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.1286F, -3.6433F, -2.0328F, 0.0954F, 0.2648F, -1.4003F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(-1.6693F, 0.1183F, -0.0307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6432F, -1.2381F, -5.2125F, 0.2201F, 0.5239F, -1.4185F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(0.0595F, -0.2209F, 0.2699F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.5169F, -4.8059F, -0.1673F, -0.0416F, -0.3869F, 0.2818F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-0.4291F, -2.2354F, -1.9579F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.542F, -1.2933F, -0.0245F, 0.1475F, -0.355F, 0.7449F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 97).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 97).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1667F, -1.6282F, 1.2338F, 0.4971F, -1.0072F, 1.0543F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(27, 97).mirror().addBox(-0.6F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 91).mirror().addBox(-0.6F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0987F, -3.0199F, 1.5634F, 1.3135F, -1.4845F, 0.1896F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.4997F, -0.3401F, -1.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8795F, -0.38F, 0.5376F, -1.0295F, -0.3558F, 1.07F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.4997F, -0.6556F, -1.6465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8795F, -0.38F, 0.5376F, -2.2076F, -0.3558F, 1.07F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-0.4997F, -0.5008F, -1.4265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8795F, -0.38F, 0.5376F, -1.6404F, -0.3558F, 1.07F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.4291F, -0.8078F, -0.1067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.542F, -1.2933F, -0.0245F, -0.1579F, -0.355F, 0.7449F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(-0.4291F, -0.2408F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.542F, -1.2933F, -0.0245F, 0.9329F, -0.355F, 0.7449F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(64, 96).mirror().addBox(-0.5F, -1.322F, -0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 0.4872F, -0.0341F, -0.2619F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(59, 96).mirror().addBox(-0.5F, -0.7515F, 0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.0981F, -0.0341F, -0.2619F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(75, 93).mirror().addBox(-0.5F, 0.0406F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.8835F, -0.0341F, -0.2619F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.5288F, -0.154F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(96, 36).mirror().addBox(-0.5288F, -0.154F, -1.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.7596F, 1.993F, -0.1445F, 0.186F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(22, 97).mirror().addBox(-0.5288F, -1.1345F, -1.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.7596F, 2.6911F, -0.1445F, 0.186F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-0.5F, -0.8884F, -0.9298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.4908F, -0.0341F, -0.2619F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-0.2F, -0.5344F, -2.402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.4579F, -0.2418F, -0.6501F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.2F, -0.9344F, -2.402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.1088F, -0.2418F, -0.6501F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-0.5F, -0.9344F, -1.202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.9419F, -4.8992F, 0.5595F, 1.0545F, -0.0341F, -0.2619F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(92, 88).mirror().addBox(-0.5F, 0.3762F, 0.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 2.6013F, 0.1748F, -0.5441F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(-0.1F, -1.045F, -2.0927F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 1.3492F, 0.2477F, -0.8934F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(73, 81).mirror().addBox(-0.1F, -0.645F, -0.7927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 1.7419F, 0.2477F, -0.8934F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 62).mirror().addBox(-0.5F, -0.445F, -0.4927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(61, 81).mirror().addBox(-0.5F, -0.845F, -0.4927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 1.8159F, 0.1748F, -0.5441F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-0.5F, -0.4962F, -0.1289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(73, 85).mirror().addBox(-0.5F, -0.9962F, -2.2289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 0.9869F, 0.1748F, -0.5441F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.5F, -1.0405F, -0.3367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.7919F, -3.2983F, -2.4745F, 1.5105F, 0.1748F, -0.5441F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(54, 94).mirror().addBox(-0.4291F, 0.3269F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.542F, -1.2933F, -0.0245F, 0.0602F, -0.355F, 0.7449F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(26, 49).mirror().addBox(-0.4291F, -0.8673F, -3.2797F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.542F, -1.2933F, -0.0245F, -0.4197F, -0.355F, 0.7449F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.5235F, 6.7609F, -7.3258F));

		PartDefinition Bodyfront_r4 = bone3.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(92, 72).addBox(-1.0194F, -0.7994F, 2.2862F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.852F, -5.4017F, 3.4896F, 1.1042F, 0.1693F, -0.3365F));

		PartDefinition Bodyfront_r5 = bone3.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(96, 3).addBox(-1.0194F, -0.0934F, 2.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(95, 94).addBox(-1.0194F, -0.6934F, 2.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.852F, -5.4017F, 3.4896F, 1.0169F, 0.1693F, -0.3365F));

		PartDefinition Bodyfront_r6 = bone3.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(39, 93).addBox(-1.0194F, -0.7118F, 2.6181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(64, 0).addBox(-1.0194F, -0.7118F, 0.3181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.852F, -5.4017F, 3.4896F, 1.5405F, 0.1693F, -0.3365F));

		PartDefinition Bodyfront_r7 = bone3.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(53, 14).addBox(-1.1359F, -0.7324F, -0.2787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(3, 44).addBox(-1.1359F, -0.5324F, 1.4213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.252F, -2.2017F, 2.0896F, 1.1915F, 0.1693F, -0.1619F));

		PartDefinition Bodyfront_r8 = bone3.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(2, 43).addBox(-1.0194F, -0.64F, -0.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.852F, -5.4017F, 3.4896F, 1.1915F, 0.1693F, -0.3365F));

		PartDefinition Bodyfront_r9 = bone3.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(55, 2).addBox(-1.1359F, -1.0198F, 1.8802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.252F, -2.2017F, 2.0896F, 0.9297F, 0.1693F, -0.1619F));

		PartDefinition Bodyfront_r10 = bone3.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(55, 2).addBox(-1.0194F, -0.2146F, 0.46F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.852F, -5.4017F, 3.4896F, 0.9297F, 0.1693F, -0.3365F));

		PartDefinition Bodyfront_r11 = bone3.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(50, 84).addBox(-1.1359F, -1.1867F, -0.4203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.252F, -2.2017F, 2.0896F, 0.886F, 0.1693F, -0.1619F));

		PartDefinition Bodyfront_r12 = bone3.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(49, 93).addBox(-0.018F, -2.8409F, -2.5084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4205F, -3.2625F, 4.1102F, 1.2787F, 0.1693F, -0.0398F));

		PartDefinition Bodyfront_r13 = bone3.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(25, 65).addBox(-1.1359F, -0.3755F, -0.9264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.252F, -2.2017F, 2.0896F, 1.2787F, 0.1693F, -0.1619F));

		PartDefinition Bodyfront_r14 = bone3.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(12, 92).addBox(-1.9977F, -0.9525F, -0.4518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1799F, -2.1605F, -0.059F, -0.2142F, -0.037F, 0.0567F));

		PartDefinition Bodyfront_r15 = bone3.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(88, 61).addBox(-1.6224F, 0.4846F, -1.6457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0254F, -1.1262F, 0.7888F, -0.0332F, 0.0991F, 0.5989F));

		PartDefinition Bodyfront_r16 = bone3.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(74, 62).addBox(-0.5F, -1.525F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5609F, -0.6279F, 0.1684F, -0.8406F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r17 = bone3.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(75, 17).addBox(-0.5F, -2.5F, 0.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4036F, -0.0681F, 1.505F, -1.5823F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r18 = bone3.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(77, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7677F, -1.3023F, 3.3592F, -1.2769F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r19 = bone3.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(96, 6).addBox(1.2498F, 4.449F, -3.8626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(18, 56).addBox(1.2498F, 1.449F, -2.9626F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0013F)), PartPose.offsetAndRotation(-0.0795F, -3.2625F, 4.1102F, -0.2297F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r20 = bone3.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(56, 65).addBox(-2.5F, -1.6F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.8397F, 2.3157F, 3.8226F, 0.7517F, -1.0335F, 0.7149F));

		PartDefinition Bodyfront_r21 = bone3.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(54, 74).addBox(-0.5F, -1.25F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9983F, -0.0168F, -0.2988F, -1.7132F, 0.2783F, 0.4426F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.5235F, 6.7609F, -7.3258F));

		PartDefinition Bodyfront_r22 = bone4.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(92, 72).mirror().addBox(0.0194F, -0.7994F, 2.2862F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.852F, -5.4017F, 3.4896F, 1.1042F, -0.1693F, 0.3365F));

		PartDefinition Bodyfront_r23 = bone4.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(0.0194F, -0.0934F, 2.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(95, 94).mirror().addBox(0.0194F, -0.6934F, 2.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.852F, -5.4017F, 3.4896F, 1.0169F, -0.1693F, 0.3365F));

		PartDefinition Bodyfront_r24 = bone4.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(0.0194F, -0.7118F, 2.6181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(64, 0).mirror().addBox(0.0194F, -0.7118F, 0.3181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.852F, -5.4017F, 3.4896F, 1.5405F, -0.1693F, 0.3365F));

		PartDefinition Bodyfront_r25 = bone4.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(0.1359F, -0.7324F, -0.2787F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(3, 44).mirror().addBox(0.1359F, -0.5324F, 1.4213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.252F, -2.2017F, 2.0896F, 1.1915F, -0.1693F, 0.1619F));

		PartDefinition Bodyfront_r26 = bone4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(2, 43).mirror().addBox(0.0194F, -0.64F, -0.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.852F, -5.4017F, 3.4896F, 1.1915F, -0.1693F, 0.3365F));

		PartDefinition Bodyfront_r27 = bone4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(0.1359F, -1.0198F, 1.8802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.252F, -2.2017F, 2.0896F, 0.9297F, -0.1693F, 0.1619F));

		PartDefinition Bodyfront_r28 = bone4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(0.0194F, -0.2146F, 0.46F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.852F, -5.4017F, 3.4896F, 0.9297F, -0.1693F, 0.3365F));

		PartDefinition Bodyfront_r29 = bone4.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(0.1359F, -1.1867F, -0.4203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.252F, -2.2017F, 2.0896F, 0.886F, -0.1693F, 0.1619F));

		PartDefinition Bodyfront_r30 = bone4.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-0.982F, -2.8409F, -2.5084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4205F, -3.2625F, 4.1102F, 1.2787F, -0.1693F, 0.0398F));

		PartDefinition Bodyfront_r31 = bone4.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(0.1359F, -0.3755F, -0.9264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.252F, -2.2017F, 2.0896F, 1.2787F, -0.1693F, 0.1619F));

		PartDefinition Bodyfront_r32 = bone4.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(12, 92).mirror().addBox(0.9977F, -0.9525F, -0.4518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1799F, -2.1605F, -0.059F, -0.2142F, 0.037F, -0.0567F));

		PartDefinition Bodyfront_r33 = bone4.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(0.6224F, 0.4846F, -1.6457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0254F, -1.1262F, 0.7888F, -0.0332F, -0.0991F, -0.5989F));

		PartDefinition Bodyfront_r34 = bone4.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-0.5F, -1.525F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5609F, -0.6279F, 0.1684F, -0.8406F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r35 = bone4.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-0.5F, -2.5F, 0.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4036F, -0.0681F, 1.505F, -1.5823F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r36 = bone4.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7677F, -1.3023F, 3.3592F, -1.2769F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r37 = bone4.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(-2.2498F, 4.449F, -3.8626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(18, 56).mirror().addBox(-2.2498F, 1.449F, -2.9626F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0013F)).mirror(false), PartPose.offsetAndRotation(0.0795F, -3.2625F, 4.1102F, -0.2297F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r38 = bone4.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.5F, -1.6F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.8397F, 2.3157F, 3.8226F, 0.7517F, 1.0335F, -0.7149F));

		PartDefinition Bodyfront_r39 = bone4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(-0.5F, -1.25F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.9983F, -0.0168F, -0.2988F, -1.7132F, -0.2783F, -0.4426F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9642F, 7.535F, -5.68F, 0.4749F, 0.1044F, 0.7432F));

		PartDefinition cube_r282 = frontleftleg4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(23, 76).addBox(0.4212F, -0.8882F, -0.303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -0.8971F, -0.3938F, -0.9005F));

		PartDefinition cube_r283 = frontleftleg4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(70, 70).addBox(0.4212F, -1.1093F, -1.1758F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.7698F, -0.3938F, -0.9005F));

		PartDefinition cube_r284 = frontleftleg4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(84, 66).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3077F, 1.1841F, 1.5371F, -2.6425F, -0.3938F, -0.9005F));

		PartDefinition cube_r285 = frontleftleg4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(43, 84).addBox(0.4212F, -0.9215F, -2.6404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -2.2061F, -0.3938F, -0.9005F));

		PartDefinition cube_r286 = frontleftleg4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 4).addBox(0.4212F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.2898F, -0.3938F, -0.9005F));

		PartDefinition cube_r287 = frontleftleg4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.8928F, 3.6893F, 0.9024F, -0.4585F, -0.3938F, -0.9005F));

		PartDefinition cube_r288 = frontleftleg4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(75, 27).addBox(-0.5F, -0.4F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.837F, 4.3261F, 0.8194F, -0.5976F, 1.2572F, -0.3103F));

		PartDefinition cube_r289 = frontleftleg4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(30, 77).addBox(-0.5F, -1.35F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.837F, 4.3261F, 0.8194F, -1.6012F, 1.2572F, -0.3103F));

		PartDefinition cube_r290 = frontleftleg4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8928F, 3.6893F, 0.9024F, -0.9821F, -0.3938F, -0.9005F));

		PartDefinition cube_r291 = frontleftleg4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(52, 36).addBox(0.4212F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, 0.1501F, -0.3938F, -0.9005F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3092F, 5.0985F, 1.4255F, -0.2686F, 0.5224F, -0.9972F));

		PartDefinition cube_r292 = frontleftleg5.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 91).addBox(0.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2083F, -0.0382F, 0.7851F, 0.9159F, -0.1321F, -0.0115F));

		PartDefinition cube_r293 = frontleftleg5.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(68, 83).addBox(-0.1237F, -1.1749F, -0.5988F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.2115F, 0.5942F, 1.8029F, -0.3582F, -0.1321F, -0.0115F));

		PartDefinition cube_r294 = frontleftleg5.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 90).addBox(-0.1237F, -1.2248F, -1.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2115F, 0.5942F, 1.8029F, -0.7858F, -0.1321F, -0.0115F));

		PartDefinition cube_r295 = frontleftleg5.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(92, 41).addBox(0.0F, -0.9F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3039F, -0.7548F, 1.4414F, -0.4368F, -0.1321F, -0.0115F));

		PartDefinition cube_r296 = frontleftleg5.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(44, 93).addBox(-0.1237F, -1.8498F, 0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2115F, 0.5942F, 1.8029F, 0.9159F, -0.1321F, -0.0115F));

		PartDefinition cube_r297 = frontleftleg5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(26, 88).addBox(0.0F, -2.5F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2115F, 2.1942F, 1.0029F, 0.1741F, -0.1321F, -0.0115F));

		PartDefinition cube_r298 = frontleftleg5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(39, 69).addBox(0.0F, -2.0F, -0.65F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2115F, 2.1942F, 1.0029F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition cube_r299 = frontleftleg5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(89, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.562F, 4.9901F, -0.7788F, -0.2186F, -0.1321F, -0.0115F));

		PartDefinition cube_r300 = frontleftleg5.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(34, 69).addBox(0.0F, -0.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, 0.8788F, -0.525F, 0.0432F, -0.1321F, -0.0115F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1816F, 5.5716F, -0.2581F, -0.0145F, -0.858F, 0.2025F));

		PartDefinition cube_r301 = frontleftleg6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0176F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0123F, -2.7407F, 0.2292F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9642F, 7.535F, -5.68F, 0.9384F, 0.1388F, -0.5235F));

		PartDefinition cube_r302 = frontrightleg4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(76, 42).addBox(-1.4212F, -0.8882F, -0.303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -0.8971F, 0.3938F, 0.9005F));

		PartDefinition cube_r303 = frontrightleg4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(16, 73).addBox(-1.4212F, -1.1093F, -1.1758F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.7698F, 0.3938F, 0.9005F));

		PartDefinition cube_r304 = frontrightleg4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 51).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3077F, 1.1841F, 1.5371F, -2.6425F, 0.3938F, 0.9005F));

		PartDefinition cube_r305 = frontrightleg4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(86, 47).addBox(-1.4212F, -0.9215F, -2.6404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -2.2061F, 0.3938F, 0.9005F));

		PartDefinition cube_r306 = frontrightleg4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 78).addBox(-1.4212F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.2898F, 0.3938F, 0.9005F));

		PartDefinition cube_r307 = frontrightleg4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(72, 56).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.8928F, 3.6893F, 0.9024F, -0.4585F, 0.3938F, 0.9005F));

		PartDefinition cube_r308 = frontrightleg4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(75, 32).addBox(-0.5F, -0.4F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.837F, 4.3261F, 0.8194F, -0.5976F, -1.2572F, 0.3103F));

		PartDefinition cube_r309 = frontrightleg4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(77, 67).addBox(-0.5F, -1.35F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.837F, 4.3261F, 0.8194F, -1.6012F, -1.2572F, 0.3103F));

		PartDefinition cube_r310 = frontrightleg4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(72, 50).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.8928F, 3.6893F, 0.9024F, -0.9821F, 0.3938F, 0.9005F));

		PartDefinition cube_r311 = frontrightleg4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 54).addBox(-1.4212F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, 0.1501F, 0.3938F, 0.9005F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3092F, 5.0985F, 1.4255F, -0.8877F, 0.0776F, 2.019F));

		PartDefinition cube_r312 = frontrightleg5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(19, 91).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2083F, -0.0382F, 0.7851F, 0.9159F, 0.1321F, 0.0115F));

		PartDefinition cube_r313 = frontrightleg5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(14, 86).addBox(-0.8763F, -1.1749F, -0.5988F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.2115F, 0.5942F, 1.8029F, -0.3582F, 0.1321F, 0.0115F));

		PartDefinition cube_r314 = frontrightleg5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(91, 4).addBox(-0.8763F, -1.2248F, -1.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.2115F, 0.5942F, 1.8029F, -0.7858F, 0.1321F, 0.0115F));

		PartDefinition cube_r315 = frontrightleg5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(5, 93).addBox(-1.0F, -0.9F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3039F, -0.7548F, 1.4414F, -0.4368F, 0.1321F, 0.0115F));

		PartDefinition cube_r316 = frontrightleg5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(93, 47).addBox(-0.8763F, -1.8498F, 0.6512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2115F, 0.5942F, 1.8029F, 0.9159F, 0.1321F, 0.0115F));

		PartDefinition cube_r317 = frontrightleg5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(31, 88).addBox(-1.0F, -2.5F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2115F, 2.1942F, 1.0029F, 0.1741F, 0.1321F, 0.0115F));

		PartDefinition cube_r318 = frontrightleg5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(49, 69).addBox(-1.0F, -2.0F, -0.65F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2115F, 2.1942F, 1.0029F, -0.1313F, 0.1321F, 0.0115F));

		PartDefinition cube_r319 = frontrightleg5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(89, 26).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.562F, 4.9901F, -0.7788F, -0.2186F, 0.1321F, 0.0115F));

		PartDefinition cube_r320 = frontrightleg5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(44, 69).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, 0.8788F, -0.525F, 0.0432F, 0.1321F, 0.0115F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1816F, 5.5716F, -0.2581F, -0.2054F, 1.1937F, -1.4114F));

		PartDefinition cube_r321 = frontrightleg6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(34, 36).addBox(-1.9824F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0123F, -2.7407F, 0.2292F, -0.1313F, 0.1321F, 0.0115F));

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