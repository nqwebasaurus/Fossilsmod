package fossils.fossils.client.blockentity.model.scutosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ScutosaurusFossilModel extends SkullModelBase {
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

	public ScutosaurusFossilModel(ModelPart root) {
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

		PartDefinition lowerbody = hips.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, -0.4373F, -0.9178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -11.8812F, 13.312F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = lowerbody.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(40, 9).mirror().addBox(-2.5159F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.1929F, 2.1379F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 34).mirror().addBox(-2.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, -0.0334F, -0.3914F));

		PartDefinition Hips_r2 = lowerbody.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(40, 9).addBox(-2.4841F, 0.182F, -1.9187F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 0.1929F, 2.1379F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 89).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4373F, 2.0822F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 44).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4373F, 0.0822F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 34).addBox(0.0F, -0.025F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7369F, -1.8091F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.5674F, 3.3917F, 3.0006F));

		PartDefinition Hips_r3 = bone.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(73, 32).addBox(-1.5F, -2.0F, -1.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.7783F, 4.2291F, 0.9107F, -1.3375F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(63, 80).addBox(-1.0321F, 0.1489F, 1.1575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, -1.3375F, -0.2075F, 1.0388F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(47, 70).addBox(-1.0321F, -0.7522F, -0.1053F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, -0.9884F, -0.2075F, 1.0388F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(85, 37).addBox(-1.0321F, 0.6024F, 0.7585F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, 0.3206F, -0.2075F, 1.0388F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(79, 27).addBox(-1.0321F, -0.9755F, -3.0692F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, 0.7918F, -0.2075F, 1.0388F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(0, 64).addBox(0.0637F, -0.5203F, -3.2226F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8158F, 0.6635F, 1.1735F, 0.0564F, -0.1037F, 0.6587F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(29, 70).addBox(-1.0321F, -0.6282F, -0.5856F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8158F, 2.4634F, 1.1735F, -0.1943F, -0.2075F, 1.0388F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(73, 49).addBox(0.0637F, -0.1647F, -0.5529F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8158F, 0.6635F, 1.1735F, -1.1915F, -0.1037F, 0.6587F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(62, 66).addBox(0.0637F, 1.6279F, -3.1223F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8158F, 0.6635F, 1.1735F, -0.8424F, -0.1037F, 0.6587F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(35, 50).addBox(-0.5F, -1.5F, -2.525F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0653F, -1.2451F, -2.2909F, -0.5266F, 0.0079F, -0.278F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(15, 97).addBox(-0.5F, 0.0F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.6338F, 0.0F, 0.0436F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(56, 77).addBox(-0.5F, 0.35F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2596F, -1.991F, 0.9648F, -1.5738F, 0.0079F, -0.278F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(84, 79).addBox(-0.5F, -0.45F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2596F, -1.991F, 0.9648F, -0.6139F, 0.0079F, -0.278F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(65, 38).addBox(-0.5F, 0.125F, -2.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6153F, -3.2398F, 0.064F, -0.2212F, 0.0079F, -0.278F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(99, 13).addBox(-0.5F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.8591F, -3.8998F, -6.661F, -1.3557F, 0.0079F, -0.278F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.8591F, -3.8998F, -6.661F, -0.8321F, 0.0079F, -0.278F));

		PartDefinition Hips_r19 = bone.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(94, 67).addBox(-0.5F, -1.9F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3251F, -2.0963F, -4.3289F, -0.0903F, 0.0079F, -0.278F));

		PartDefinition Hips_r20 = bone.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(20, 97).addBox(-0.5F, -1.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(52, 88).addBox(-0.5F, -0.85F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4593F, -2.5205F, -5.9305F, -0.483F, 0.0079F, -0.278F));

		PartDefinition Hips_r21 = bone.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(71, 71).addBox(-0.5F, -0.85F, -1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7267F, -3.4642F, -5.6847F, -0.3085F, 0.0079F, -0.278F));

		PartDefinition Hips_r22 = bone.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(81, 21).addBox(-0.5F, 0.15F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8207F, -3.8742F, -2.8886F, -0.1776F, 0.0079F, -0.278F));

		PartDefinition Hips_r23 = bone.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(64, 51).addBox(-0.5F, -0.9809F, -2.5462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.2411F, 0.0F, 0.0436F));

		PartDefinition bone4 = lowerbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.5674F, 3.3917F, 3.0006F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(73, 44).addBox(-1.5F, -2.0F, -1.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7783F, 4.2291F, 0.9107F, -1.3375F, 0.0F, 0.0F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(80, 64).addBox(0.0321F, 0.1489F, 1.1575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, -1.3375F, 0.2075F, -1.0388F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(0, 71).addBox(0.0321F, -0.7522F, -0.1053F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, -0.9884F, 0.2075F, -1.0388F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(63, 85).addBox(0.0321F, 0.6024F, 0.7585F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, 0.3206F, 0.2075F, -1.0388F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(80, 11).addBox(0.0321F, -0.9755F, -3.0692F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, 0.7918F, 0.2075F, -1.0388F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(64, 44).addBox(-1.0637F, -0.5203F, -3.2226F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8158F, 0.6635F, 1.1735F, 0.0564F, 0.1037F, -0.6587F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(38, 70).addBox(0.0321F, -0.6282F, -0.5856F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8158F, 2.4634F, 1.1735F, -0.1943F, 0.2075F, -1.0388F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(73, 60).addBox(-1.0637F, -0.1647F, -0.5529F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8158F, 0.6635F, 1.1735F, -1.1915F, 0.1037F, -0.6587F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(20, 70).addBox(-1.0637F, 1.6279F, -3.1223F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8158F, 0.6635F, 1.1735F, -0.8424F, 0.1037F, -0.6587F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -1.5F, -2.525F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0653F, -1.2451F, -2.2909F, -0.5266F, -0.0079F, 0.278F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(64, 97).addBox(-0.5F, 0.0F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.6338F, 0.0F, -0.0436F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(77, 76).addBox(-0.5F, 0.35F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2596F, -1.991F, 0.9648F, -1.5738F, -0.0079F, 0.278F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(84, 84).addBox(-0.5F, -0.45F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2596F, -1.991F, 0.9648F, -0.6139F, -0.0079F, 0.278F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(66, 17).addBox(-0.5F, 0.125F, -2.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6153F, -3.2398F, 0.064F, -0.2212F, -0.0079F, 0.278F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(99, 38).addBox(-0.5F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.8591F, -3.8998F, -6.661F, -1.3557F, -0.0079F, 0.278F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(99, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.8591F, -3.8998F, -6.661F, -0.8321F, -0.0079F, 0.278F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(95, 4).addBox(-0.5F, -1.9F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3251F, -2.0963F, -4.3289F, -0.0903F, -0.0079F, 0.278F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(97, 58).addBox(-0.5F, -1.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(89, 42).addBox(-0.5F, -0.85F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4593F, -2.5205F, -5.9305F, -0.483F, -0.0079F, 0.278F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.85F, -1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7267F, -3.4642F, -5.6847F, -0.3085F, -0.0079F, 0.278F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(31, 82).addBox(-0.5F, 0.15F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8207F, -3.8742F, -2.8886F, -0.1776F, -0.0079F, 0.278F));

		PartDefinition Hips_r44 = bone4.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -0.9809F, -2.5462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.2411F, 0.0F, -0.0436F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1164F, 6.279F, 1.6069F, 1.013F, 0.3999F, -0.1956F));

		PartDefinition cube_r5 = backleftleg4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 76).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6964F, 0.5631F, -0.1928F, 0.4048F, -0.5193F, -0.4768F));

		PartDefinition cube_r6 = backleftleg4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 93).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0832F, 0.7828F, 0.9366F, 0.143F, -0.5193F, -0.4768F));

		PartDefinition cube_r7 = backleftleg4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 49).addBox(-0.5F, 0.3F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, 0.8411F, -0.5193F, -0.4768F));

		PartDefinition cube_r8 = backleftleg4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(93, 25).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, -0.337F, -0.5193F, -0.4768F));

		PartDefinition cube_r9 = backleftleg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 76).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, 0.0993F, -0.5193F, -0.4768F));

		PartDefinition cube_r10 = backleftleg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 76).addBox(-0.05F, -2.4F, 1.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.7836F, 0.9157F, -0.952F, -0.2497F, -0.5193F, -0.4768F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6428F, 5.0709F, 0.9618F, 0.1762F, -0.4325F, 0.4018F));

		PartDefinition cube_r11 = backleftleg5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 54).addBox(-0.5048F, -2.2494F, 0.0366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition cube_r12 = backleftleg5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 91).addBox(-0.5048F, 0.3657F, -0.2752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, 0.0436F));

		PartDefinition cube_r13 = backleftleg5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 63).addBox(-0.5048F, -0.5587F, -0.0892F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, -0.0524F));

		PartDefinition cube_r14 = backleftleg5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5048F, -1.9765F, -0.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, 0.6109F));

		PartDefinition cube_r15 = backleftleg5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 92).addBox(-0.5048F, -1.1343F, -0.2002F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2132F, 2.0133F, 0.1024F, 0.0F, 1.5708F, 0.1745F));

		PartDefinition cube_r16 = backleftleg5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 32).addBox(-0.5048F, -1.4847F, -2.2335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(87, 59).addBox(-0.5048F, -1.0847F, -1.7335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2132F, 2.2134F, 0.1024F, 0.0F, 1.5708F, 0.0F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create().texOffs(23, 0).addBox(-1.8381F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3787F, 5.5593F, 0.4812F, 0.0872F, 0.0038F, -0.0435F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1164F, 6.279F, 1.6069F, 0.0967F, -0.3999F, 0.1956F));

		PartDefinition cube_r17 = backrightleg4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 81).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6964F, 0.5631F, -0.1928F, 0.4048F, 0.5193F, 0.4768F));

		PartDefinition cube_r18 = backrightleg4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 93).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0832F, 0.7828F, 0.9366F, 0.143F, 0.5193F, 0.4768F));

		PartDefinition cube_r19 = backrightleg4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 59).addBox(-0.5F, 0.3F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, 0.8411F, 0.5193F, 0.4768F));

		PartDefinition cube_r20 = backrightleg4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 93).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, -0.337F, 0.5193F, 0.4768F));

		PartDefinition cube_r21 = backrightleg4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, 0.0993F, 0.5193F, 0.4768F));

		PartDefinition cube_r22 = backrightleg4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 76).addBox(-0.95F, -2.4F, 1.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-0.7836F, 0.9157F, -0.952F, -0.2497F, 0.5193F, 0.4768F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6428F, 5.0709F, 0.9618F, 0.3943F, 0.4325F, -0.4018F));

		PartDefinition cube_r23 = backrightleg5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(84, 74).addBox(-0.4952F, -2.2494F, 0.0366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, 0.3491F));

		PartDefinition cube_r24 = backrightleg5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(75, 91).addBox(-0.4952F, 0.3657F, -0.2752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, -0.0436F));

		PartDefinition cube_r25 = backrightleg5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 86).addBox(-0.4952F, -0.5587F, -0.0892F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, 0.0524F));

		PartDefinition cube_r26 = backrightleg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 93).addBox(-0.4952F, -1.9765F, -0.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, -0.6109F));

		PartDefinition cube_r27 = backrightleg5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 58).addBox(-0.4952F, -1.1343F, -0.2002F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2132F, 2.0133F, 0.1024F, 0.0F, -1.5708F, -0.1745F));

		PartDefinition cube_r28 = backrightleg5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 89).addBox(-0.4952F, -1.4847F, -2.2335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(70, 87).addBox(-0.4952F, -1.0847F, -1.7335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2132F, 2.2134F, 0.1024F, 0.0F, -1.5708F, 0.0F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create().texOffs(19, 27).addBox(-2.1619F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3787F, 5.5593F, 0.4812F, -0.2613F, 0.0188F, 0.1278F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(57, 11).addBox(-0.5F, -0.6829F, -0.2086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(52, 39).addBox(0.5F, -0.1829F, -0.2086F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(52, 39).mirror().addBox(-2.5F, -0.1829F, -0.2086F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 39).addBox(0.0F, -1.1829F, -0.2086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 23).addBox(0.0F, -1.083F, 1.7914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2642F, 4.1371F, -0.1003F, 0.2941F, 0.2247F));

		PartDefinition cube_r29 = tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3829F, 0.4914F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r30 = tail.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 57).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3829F, 0.4914F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail4 = tail.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(70, 27).addBox(-0.5F, -0.4261F, -0.1812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.233F, 3.7914F, -0.2303F, 0.2552F, -0.0591F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(33, 57).addBox(-0.5F, -0.4869F, -0.2066F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.1551F, 0.3884F, -0.0592F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.6101F, -6.1997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1496F, 0.1295F, 0.0195F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -1.1997F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -3.1997F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(17, 100).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -5.1997F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 19).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-3.9114F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.0702F, -0.0163F, -0.1748F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-2.6568F, 0.4485F, -0.2563F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, 0.1145F, 0.006F, -0.1656F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(85, 93).mirror().addBox(-4.5041F, -1.0022F, -0.2898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, 0.0536F, 0.0613F, -0.7077F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-2.7067F, 0.4437F, -0.2787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, 0.0722F, 0.2201F, -0.1965F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-4.5444F, -1.0312F, -0.3133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, -0.0955F, 0.222F, -0.755F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-9.42F, -3.1652F, -0.3133F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, -0.1939F, 0.1447F, -1.2821F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 19).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0601F, -3.7247F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 7).addBox(-0.0886F, 0.3161F, -0.2877F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.0702F, 0.0163F, 0.1748F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 65).addBox(-0.3432F, 0.4485F, -0.2563F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, 0.1145F, -0.006F, 0.1656F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 93).addBox(2.5041F, -1.0022F, -0.2898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, 0.0536F, -0.0613F, 0.7077F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(89, 46).addBox(-0.2933F, 0.4437F, -0.2787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.1145F, -0.006F, 0.1917F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(96, 48).addBox(2.5444F, -1.0312F, -0.3133F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.0536F, -0.0613F, 0.7339F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 9).addBox(3.42F, -3.1652F, -0.3133F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.0158F, -0.0799F, 1.2585F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 19).addBox(-3.25F, -0.4945F, -7.9257F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(50, 97).addBox(-2.75F, -2.3945F, -6.9257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -0.1486F, -6.0768F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(8, 100).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -0.9257F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 89).mirror().addBox(-3.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.04F, -0.0221F, -0.1554F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 94).mirror().addBox(-4.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0641F, -0.0427F, -0.6999F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 15).mirror().addBox(-10.5571F, -3.4936F, -0.3601F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, -0.0342F, -0.069F, -1.2236F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-11.435F, -3.5463F, -0.401F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0181F, -0.0192F, -1.242F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-4.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, -0.0253F, -0.0076F, -0.7185F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-3.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, 0.0114F, -0.0122F, -0.174F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-12.4649F, -3.5263F, -0.4402F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, -0.002F, 0.0398F, -1.2248F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(92, 62).mirror().addBox(-4.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0182F, 0.0354F, -0.7008F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(26, 87).mirror().addBox(-3.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0708F, 0.0021F, -0.1571F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-3.0434F, 0.3354F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.1477F, 0.0183F, -0.1392F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-4.7767F, -1.2911F, -0.491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.0758F, 0.0889F, -0.68F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-12.4912F, -3.5065F, -0.491F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.021F, 0.1149F, -1.2058F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(26, 89).addBox(0.0613F, 0.4042F, -0.3174F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.04F, 0.0221F, 0.1554F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(59, 94).addBox(2.8274F, -1.247F, -0.3601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0641F, 0.0427F, 0.6999F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 15).addBox(3.5571F, -3.4936F, -0.3601F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, -0.0342F, 0.069F, 1.2236F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(38, 30).addBox(3.435F, -3.5463F, -0.401F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0181F, 0.0192F, 1.242F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(92, 39).addBox(2.748F, -1.3537F, -0.401F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, -0.0253F, 0.0076F, 0.7185F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 87).addBox(0.0495F, 0.2704F, -0.3536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, 0.0114F, 0.0122F, 0.174F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(23, 7).addBox(3.4649F, -3.5263F, -0.4402F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, -0.002F, -0.0398F, 1.2248F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 62).addBox(2.7638F, -1.3214F, -0.4402F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0182F, -0.0354F, 0.7008F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 87).addBox(0.0471F, 0.3047F, -0.3942F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0708F, -0.0021F, 0.1571F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(87, 71).addBox(0.0433F, 0.3354F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.1477F, -0.0183F, 0.1392F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 93).addBox(2.7767F, -1.2911F, -0.491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.0758F, -0.0889F, 0.68F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(38, 18).addBox(3.4912F, -3.5065F, -0.491F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.021F, -0.1149F, 1.2058F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 93).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -2.9257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 100).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -4.9257F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -2.9445F, -4.0257F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.0111F, -7.8475F, 0.1834F, 0.0429F, 0.008F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-3.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, 0.0271F, -0.0017F, -0.1576F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(-4.8224F, -1.25F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, -0.0172F, 0.0095F, -0.702F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-12.5513F, -3.4937F, -0.5307F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -0.6204F, -0.0196F, -0.0004F, -1.2255F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(-3.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.0961F, 0.0092F, -0.1573F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(95, 20).mirror().addBox(-4.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.0362F, 0.0545F, -0.7003F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 26).mirror().addBox(-12.5438F, -3.4956F, -0.5718F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -2.6204F, 0.004F, 0.0653F, -1.2247F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-3.0582F, 0.3676F, -0.5833F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.1818F, 0.0252F, -0.156F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(94, 50).mirror().addBox(-4.8065F, -1.2657F, -0.6271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.1016F, 0.1124F, -0.695F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-11.5298F, -3.4993F, -0.6271F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -4.6204F, 0.0316F, 0.1481F, -1.222F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(21, 10).mirror().addBox(-3.0F, 0.0F, -2.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(38, 28).addBox(3.5513F, -3.4937F, -0.5307F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, -0.0196F, 0.0004F, 1.2255F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 18).addBox(2.8224F, -1.25F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, -0.0172F, -0.0095F, 0.702F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(87, 48).addBox(0.0618F, 0.3927F, -0.4877F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -0.6204F, 0.0271F, 0.0017F, 0.1576F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 30).addBox(0.0606F, 0.3837F, -0.5286F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.0961F, -0.0092F, 0.1573F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(95, 20).addBox(2.8168F, -1.2553F, -0.5718F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.0362F, -0.0545F, 0.7003F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 26).addBox(3.5438F, -3.4956F, -0.5718F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -2.6204F, 0.004F, -0.0653F, 1.2247F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(12, 91).addBox(0.0582F, 0.3676F, -0.5833F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.1818F, -0.0252F, 0.156F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(94, 50).addBox(2.8066F, -1.2657F, -0.6271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.1016F, -0.1124F, 0.695F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(38, 32).addBox(3.5298F, -3.4993F, -0.6271F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -4.6204F, 0.0316F, -0.1481F, 1.222F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(26, 100).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3431F, -1.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(11, 100).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 100).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(21, 10).addBox(0.0F, 0.0F, -2.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -3.1F, 0.0F, 0.0F, 0.3927F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1136F, -4.9166F, 0.1342F, 0.0865F, 0.0117F));

		PartDefinition Bodyfront_r1 = upperbody.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(64, 57).addBox(-3.2691F, -1.6026F, 0.4641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(80, 16).addBox(-2.1F, -0.6F, 0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 9.2401F, -7.1102F, 1.1378F, 0.0501F, 0.0079F));

		PartDefinition cube_r100 = upperbody.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(38, 100).addBox(-0.5F, -2.2686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.1805F, -2.0843F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r101 = upperbody.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(35, 100).addBox(-0.5F, -1.9686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.2678F, -4.0824F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r102 = upperbody.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(32, 100).addBox(-0.5F, -1.9019F, -0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.0322F, -5.9824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r103 = upperbody.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-3.0596F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.1304F, 0.0152F, -0.1921F));

		PartDefinition cube_r104 = upperbody.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(95, 29).mirror().addBox(-4.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0625F, 0.0774F, -0.7337F));

		PartDefinition cube_r105 = upperbody.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 13).mirror().addBox(-10.4401F, -3.5542F, -0.4398F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2469F, -1.6686F, 0.0153F, 0.0982F, -1.259F));

		PartDefinition cube_r106 = upperbody.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-2.5812F, 0.2501F, -0.4473F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -5.6686F, 0.2853F, 0.0425F, -0.2571F));

		PartDefinition cube_r107 = upperbody.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(94, 52).mirror().addBox(-4.3372F, -1.1246F, -0.4865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -5.6686F, 0.1826F, 0.1801F, -0.7878F));

		PartDefinition cube_r108 = upperbody.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-7.1938F, -3.1426F, -0.4865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -5.6686F, 0.0673F, 0.2469F, -1.3196F));

		PartDefinition cube_r109 = upperbody.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(21, 91).mirror().addBox(-2.7648F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.2161F, 0.0318F, -0.19F));

		PartDefinition cube_r110 = upperbody.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-4.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.1279F, 0.1356F, -0.7268F));

		PartDefinition cube_r111 = upperbody.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(44, 7).mirror().addBox(-9.3459F, -3.2686F, -0.4821F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -3.6686F, 0.0425F, 0.1813F, -1.2552F));

		PartDefinition cube_r112 = upperbody.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-3.0F, 0.0222F, -5.0281F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, 0.0239F, -0.3483F));

		PartDefinition cube_r113 = upperbody.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 54).addBox(-0.4189F, 0.2501F, -0.4473F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -5.6686F, 0.2853F, -0.0425F, 0.2571F));

		PartDefinition cube_r114 = upperbody.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 52).addBox(2.3372F, -1.1246F, -0.4865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -5.6686F, 0.1826F, -0.1801F, 0.7878F));

		PartDefinition cube_r115 = upperbody.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(74, 41).addBox(3.1938F, -3.1426F, -0.4865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -5.6686F, 0.0673F, -0.2469F, 1.3196F));

		PartDefinition cube_r116 = upperbody.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(40, 13).addBox(3.4401F, -3.5542F, -0.4398F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0153F, -0.0982F, 1.259F));

		PartDefinition cube_r117 = upperbody.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(95, 29).addBox(2.7563F, -1.358F, -0.4398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.0625F, -0.0774F, 0.7337F));

		PartDefinition cube_r118 = upperbody.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(91, 56).addBox(0.0595F, 0.2695F, -0.3923F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2469F, -1.6686F, 0.1304F, -0.0152F, 0.1921F));

		PartDefinition cube_r119 = upperbody.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(21, 91).addBox(-0.2352F, 0.3229F, -0.4421F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.2161F, -0.0318F, 0.19F));

		PartDefinition cube_r120 = upperbody.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(95, 22).addBox(2.532F, -1.1578F, -0.4821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.1279F, -0.1356F, 0.7268F));

		PartDefinition cube_r121 = upperbody.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 7).addBox(3.3459F, -3.2686F, -0.4821F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -3.6686F, 0.0425F, -0.1813F, 1.2552F));

		PartDefinition cube_r122 = upperbody.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 0.0222F, -5.0281F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.9297F, -2.2348F, 0.0656F, -0.0239F, 0.3483F));

		PartDefinition cube_r123 = upperbody.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.6F, -1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -5.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(71, 66).addBox(-1.0F, -0.5F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 84).addBox(-0.5F, -2.1F, -2.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 100).addBox(-0.5F, -2.1F, -0.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -6.9824F, 0.0191F, 0.1736F, 0.0184F));

		PartDefinition cube_r124 = neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.5412F, 0.1005F, -0.5526F));

		PartDefinition cube_r125 = neck2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(68, 15).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.3837F, 0.3563F, -1.0481F));

		PartDefinition cube_r126 = neck2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.4555F, 0.0826F, -0.2987F));

		PartDefinition cube_r127 = neck2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.3138F, 0.2993F, -0.8088F));

		PartDefinition cube_r128 = neck2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-3.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.1183F, 0.4146F, -1.3552F));

		PartDefinition cube_r129 = neck2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-3.0F, 0.0332F, -2.7506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, 0.0609F, -0.3717F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(57, 32).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.5412F, -0.1005F, 0.5526F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 15).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.3837F, -0.3563F, 1.0481F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(75, 4).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.4555F, -0.0826F, 0.2987F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 8).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.3138F, -0.2993F, 0.8088F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 70).addBox(2.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.1183F, -0.4146F, 1.3552F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(49, 34).addBox(0.0F, 0.0332F, -2.7506F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1204F, -0.2241F, 0.1162F, -0.0609F, 0.3717F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, -0.4681F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, -0.2778F, 0.3367F, -0.0939F));

		PartDefinition cube_r136 = neck3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(41, 100).addBox(-0.5F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5181F, -1.839F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.6923F, 0.1907F, -0.6354F));

		PartDefinition cube_r138 = neck3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 27).mirror().addBox(-1.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7052F, 0.483F, 0.5058F, -1.1112F));

		PartDefinition cube_r139 = neck3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-2.0F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, 0.0442F, -0.4342F));

		PartDefinition cube_r140 = neck3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(81, 9).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.6923F, -0.1907F, 0.6354F));

		PartDefinition cube_r141 = neck3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(98, 27).addBox(0.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7052F, 0.483F, -0.5058F, 1.1112F));

		PartDefinition cube_r142 = neck3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(74, 37).addBox(0.0F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.6588F, -1.0153F, 0.095F, -0.0442F, 0.4342F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2735F, -2.2631F, -0.0111F, 0.4341F, 0.108F));

		PartDefinition cube_r143 = head2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 90).addBox(-1.5F, -0.015F, -0.0101F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 1.7655F, -7.4805F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(75, 55).addBox(-2.0F, -0.9F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0F, 1.8296F, -6.7215F, 0.4996F, 0.27F, 0.1446F));

		PartDefinition cube_r145 = head2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(75, 0).addBox(-1.5F, -0.9F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 1.3679F, -5.8345F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 73).addBox(-2.5F, -0.0281F, -0.0983F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.9729F, -4.011F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(96, 31).addBox(-0.5F, -0.825F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3625F, -2.3799F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 57).addBox(-2.0F, 0.05F, -2.1F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.0984F, -3.977F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(91, 86).addBox(-1.5F, -1.1126F, -0.1222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(92, 36).addBox(-1.5F, -1.8126F, -0.1222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.5134F, -6.951F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(9, 69).addBox(-4.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.5732F, -0.2795F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(68, 11).addBox(-4.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, -2.0215F, -2.4702F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(56, 72).addBox(-4.0F, -0.1F, -0.575F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, -1.7366F, -2.801F, 0.48F, 0.0F, 0.0F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9737F, -1.0477F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(12, 87).mirror().addBox(-0.2671F, -0.7396F, -1.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5606F, 1.6585F, -2.1526F, -1.5448F, -0.2639F, 0.213F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-0.2671F, -0.4114F, -1.3446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.5606F, 1.6585F, -2.1526F, -0.934F, -0.2639F, 0.213F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(0.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7444F, 0.4639F, -1.8231F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(87, 13).mirror().addBox(-0.6F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, 0.8291F, -4.3522F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(0.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8089F, 1.4657F, -5.1417F, 0.2256F, -0.2555F, -0.0579F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-0.15F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8254F, 0.7526F, -5.7397F, 0.3492F, -0.886F, -0.2749F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(96, 76).mirror().addBox(-0.0469F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, 1.5882F, -5.6944F, 0.3321F, -0.8449F, -0.2524F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(96, 79).addBox(-1.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7444F, 0.4639F, -1.8231F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(87, 13).addBox(-0.4F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.2985F, 0.8291F, -4.3522F, 0.2355F, 0.3829F, 0.0894F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 20).addBox(-1.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8089F, 1.4657F, -5.1417F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 87).addBox(-0.7329F, -0.7396F, -1.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5606F, 1.6585F, -2.1526F, -1.5448F, 0.2639F, -0.213F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 21).addBox(-0.7329F, -0.4114F, -1.3446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.5606F, 1.6585F, -2.1526F, -0.934F, 0.2639F, -0.213F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(96, 64).addBox(-0.85F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8254F, 0.7526F, -5.7397F, 0.3492F, 0.886F, 0.2749F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 76).addBox(-0.9531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9786F, 1.5882F, -5.6944F, 0.3321F, 0.8449F, 0.2524F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 73).addBox(-1.0F, -1.3F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 17).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0643F, -1.7167F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.5648F, -1.7537F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(99, 61).addBox(-0.4965F, -0.792F, -0.6463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.7464F, -2.009F, -2.1313F, 0.5105F, 0.2899F, -0.2282F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(96, 82).addBox(-0.4715F, -1.0387F, -0.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7464F, -2.009F, -2.1313F, 1.5577F, 0.2899F, -0.2282F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9919F, -1.593F, -5.0045F, -0.2719F, -0.0583F, 0.2477F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 99).addBox(-0.4965F, -0.8791F, 0.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.7464F, -2.009F, -2.1313F, 0.1178F, 0.2899F, -0.2282F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 23).addBox(-0.125F, -0.075F, -0.575F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9919F, -4.2059F, -1.0173F, 0.2137F, -0.2587F, 0.9722F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(98, 71).addBox(-0.5F, -0.4626F, -0.1472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.9919F, 0.9487F, -5.1974F, 0.4396F, -0.1186F, -0.0556F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(22, 63).addBox(-1.0F, 0.0F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.035F, -4.0627F, -1.6458F, 0.5903F, 0.3133F, -0.4323F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(100, 3).addBox(-0.4965F, -0.6524F, -0.5019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-1.7464F, -2.009F, -2.1313F, -1.0603F, 0.2899F, -0.2282F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(86, 99).addBox(-0.4484F, -0.451F, -0.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2734F, -0.451F, -0.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7464F, -2.009F, -2.1313F, -1.1976F, 0.289F, -0.2378F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(98, 24).addBox(-0.55F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(45, 97).addBox(-0.05F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 0).addBox(-0.55F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.4814F, 0.0854F, -4.4971F, 0.8779F, -0.3392F, 1.4338F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(10, 97).addBox(-0.4063F, -0.5041F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.4915F, -0.417F, -4.6369F, 0.7537F, -0.0143F, 1.8933F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(40, 97).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5493F, -0.4979F, -4.9169F, 0.7593F, -0.1096F, 1.8033F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 97).addBox(-1.0518F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(0, 97).addBox(-0.8518F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4915F, -0.417F, -4.6369F, 0.9137F, -0.5272F, 1.3288F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 45).addBox(-0.75F, -0.525F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3314F, 0.0854F, -4.4971F, 0.8779F, -0.3392F, 1.4338F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(42, 89).addBox(-0.05F, -0.9F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4814F, 0.0854F, -4.4971F, 0.2234F, -0.3392F, 1.4338F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 89).addBox(-0.1477F, -0.5781F, -0.0739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.2251F, -0.4274F, -4.2545F, 0.2664F, -0.2225F, 1.4487F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(91, 0).addBox(-0.0002F, 0.088F, 0.0546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.4084F, -3.5195F, -1.8792F, 0.0699F, -0.1971F, 1.2536F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 44).addBox(-1.3002F, -0.6121F, -0.2454F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.2251F, -0.4274F, -4.2545F, 0.2194F, -0.5131F, 1.3449F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(99, 67).addBox(-0.3508F, -2.9499F, -0.4358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 100).addBox(-0.3508F, -2.6999F, -0.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(96, 99).addBox(-0.3508F, -2.3999F, 0.2142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(99, 92).addBox(-0.3508F, -2.0499F, 0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -1.1278F, 0.331F, -0.7961F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(49, 92).addBox(0.021F, -3.0249F, -1.0462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8563F, -1.8261F, 1.333F, -0.0416F, 0.3869F, -0.596F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(13, 49).addBox(-0.5709F, -2.2354F, -1.9579F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.3565F, 0.3772F, -0.8389F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(87, 50).addBox(-0.4657F, 0.3521F, 0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.1482F, 0.4053F, -0.8387F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(87, 9).addBox(-0.4657F, -1.0158F, 0.5157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.759F, 0.4053F, -0.8387F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(88, 4).addBox(-0.5882F, 0.085F, 0.3431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.8653F, 0.3764F, -0.9627F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5882F, -1.3011F, 0.4576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -1.4762F, 0.3764F, -0.9627F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 88).addBox(-0.7604F, -0.1598F, 0.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -1.6038F, 0.3017F, -1.0772F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(87, 17).addBox(-0.7604F, -1.5279F, 0.3546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -2.2146F, 0.3017F, -1.0772F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(89, 89).addBox(-0.5709F, -0.8078F, -0.1067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.662F, 0.3772F, -0.8389F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 93).addBox(-0.5709F, -0.2408F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, 0.4289F, 0.3772F, -0.8389F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(25, 97).addBox(0.3F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4919F, -4.4915F, 0.8618F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(35, 97).addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6919F, -3.9059F, -1.3239F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(96, 89).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6919F, -2.7527F, -2.7062F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(98, 85).addBox(-0.5709F, 0.3269F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.4438F, 0.3772F, -0.8389F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(46, 50).addBox(-0.5709F, -0.8673F, -3.2797F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.142F, -0.5433F, -1.4245F, -0.9238F, 0.3772F, -0.8389F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.5648F, -1.7537F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(-0.5035F, -0.792F, -0.6463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.7464F, -2.009F, -2.1313F, 0.5105F, -0.2899F, 0.2282F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-0.5286F, -1.0387F, -0.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7464F, -2.009F, -2.1313F, 1.5577F, -0.2899F, 0.2282F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(76, 97).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9919F, -1.593F, -5.0045F, -0.2719F, 0.0583F, -0.2477F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(81, 99).mirror().addBox(-0.5035F, -0.8791F, 0.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.7464F, -2.009F, -2.1313F, 0.1178F, -0.2899F, 0.2282F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-2.875F, -0.075F, -0.575F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9919F, -4.2059F, -1.0173F, 0.2137F, 0.2587F, -0.9722F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 71).mirror().addBox(-0.5F, -0.4626F, -0.1472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.9919F, 0.9487F, -5.1974F, 0.4396F, 0.1186F, 0.0556F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(0.0F, 0.0F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.035F, -4.0627F, -1.6458F, 0.5903F, -0.3133F, 0.4323F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-0.5035F, -0.6524F, -0.5019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(1.7464F, -2.009F, -2.1313F, -1.0603F, -0.2899F, 0.2282F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.5516F, -0.451F, -0.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(-0.7266F, -0.451F, -0.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.7464F, -2.009F, -2.1313F, -1.1976F, -0.289F, 0.2378F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-0.45F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(45, 97).mirror().addBox(-0.95F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 0).mirror().addBox(-0.45F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.4814F, 0.0854F, -4.4971F, 0.8779F, 0.3392F, -1.4338F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.5937F, -0.5041F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.4915F, -0.417F, -4.6369F, 0.7537F, 0.0143F, -1.8933F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(40, 97).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.5493F, -0.4979F, -4.9169F, 0.7593F, 0.1096F, -1.8033F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(0.0518F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(0, 97).mirror().addBox(-0.1482F, -0.5041F, -0.3528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4915F, -0.417F, -4.6369F, 0.9137F, 0.5272F, -1.3288F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-0.25F, -0.525F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3314F, 0.0854F, -4.4971F, 0.8779F, 0.3392F, -1.4338F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(42, 89).mirror().addBox(-0.95F, -0.9F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4814F, 0.0854F, -4.4971F, 0.2234F, 0.3392F, -1.4338F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(82, 89).mirror().addBox(-0.8523F, -0.5781F, -0.0739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.2251F, -0.4274F, -4.2545F, 0.2664F, 0.2225F, -1.4487F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.9998F, 0.088F, 0.0546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.4084F, -3.5195F, -1.8792F, 0.0699F, 0.1971F, -1.2536F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.6998F, -0.6121F, -0.2454F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.2251F, -0.4274F, -4.2545F, 0.2194F, 0.5131F, -1.3449F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(99, 67).mirror().addBox(-0.6492F, -2.9499F, -0.4358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(-0.6492F, -2.6999F, -0.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(96, 99).mirror().addBox(-0.6492F, -2.3999F, 0.2142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(99, 92).mirror().addBox(-0.6492F, -2.0499F, 0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -1.1278F, -0.331F, 0.7961F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(-1.021F, -3.0249F, -1.0462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8563F, -1.8261F, 1.333F, -0.0416F, -0.3869F, 0.596F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(13, 49).mirror().addBox(-0.4291F, -2.2354F, -1.9579F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.3565F, -0.3772F, 0.8389F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-0.5343F, 0.3521F, 0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.1482F, -0.4053F, 0.8387F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.5343F, -1.0158F, 0.5157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.759F, -0.4053F, 0.8387F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.4118F, 0.085F, 0.3431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.8653F, -0.3764F, 0.9627F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.4118F, -1.3011F, 0.4576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -1.4762F, -0.3764F, 0.9627F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.2396F, -0.1598F, 0.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -1.6038F, -0.3017F, 1.0772F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.2396F, -1.5279F, 0.3546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -2.2146F, -0.3017F, 1.0772F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(-0.4291F, -0.8078F, -0.1067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.662F, -0.3772F, 0.8389F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.4291F, -0.2408F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, 0.4289F, -0.3772F, 0.8389F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(-1.3F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4919F, -4.4915F, 0.8618F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6919F, -3.9059F, -1.3239F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(96, 89).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6919F, -2.7527F, -2.7062F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(98, 85).mirror().addBox(-0.4291F, 0.3269F, 0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.4438F, -0.3772F, 0.8389F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(46, 50).mirror().addBox(-0.4291F, -0.8673F, -3.2797F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.142F, -0.5433F, -1.4245F, -0.9238F, -0.3772F, 0.8389F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(4.5235F, 6.7609F, -7.3258F));

		PartDefinition Bodyfront_r2 = bone3.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(0, 50).addBox(0.1191F, -2.7048F, 1.3283F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 0.1311F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r3 = bone3.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(84, 0).addBox(0.1191F, -5.5376F, -2.5166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -1.3525F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r4 = bone3.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(87, 67).addBox(0.1191F, -4.921F, 1.5047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -0.3053F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r5 = bone3.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(62, 32).addBox(0.1191F, 1.0833F, -1.305F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -2.5742F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r6 = bone3.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(59, 26).addBox(0.0918F, 1.2948F, -4.9035F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, -2.7487F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r7 = bone3.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(30, 42).addBox(-0.018F, -3.5409F, -3.5084F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4205F, -3.2625F, 4.1102F, 1.2787F, 0.1693F, -0.0398F));

		PartDefinition Bodyfront_r8 = bone3.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(11, 56).addBox(0.1191F, -1.6558F, -0.7444F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5205F, -3.2625F, 4.1102F, 0.4801F, 0.2292F, -0.3611F));

		PartDefinition Bodyfront_r9 = bone3.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(66, 93).addBox(-1.9977F, -0.9525F, -0.4518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1799F, -2.1605F, -0.059F, -0.2142F, -0.037F, 0.0567F));

		PartDefinition Bodyfront_r10 = bone3.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(0, 92).addBox(-1.6224F, 0.4846F, -1.6457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0254F, -1.1262F, 0.7888F, -0.0332F, 0.0991F, 0.5989F));

		PartDefinition Bodyfront_r11 = bone3.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(82, 32).addBox(1.2498F, 3.4314F, -0.8944F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4205F, -3.2625F, 4.1102F, -0.9715F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r12 = bone3.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(18, 76).addBox(1.2498F, 2.449F, -2.4626F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4205F, -3.2625F, 4.1102F, -0.2297F, 0.2783F, 0.4426F));

		PartDefinition Bodyfront_r13 = bone3.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(80, 69).addBox(1.2498F, 3.5058F, -4.0358F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4205F, -3.2625F, 4.1102F, -0.2733F, 0.2783F, 0.4426F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-4.5235F, 6.7609F, -7.3258F));

		PartDefinition Bodyfront_r14 = bone2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(24, 50).addBox(-1.1191F, -2.7048F, 1.3283F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 0.1311F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r15 = bone2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(86, 26).addBox(-1.1191F, -5.5376F, -2.5166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -1.3525F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r16 = bone2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(75, 87).addBox(-1.1191F, -4.921F, 1.5047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -0.3053F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r17 = bone2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(11, 63).addBox(-1.1191F, 1.0833F, -1.305F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -2.5742F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r18 = bone2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(62, 60).addBox(-1.0918F, 1.2948F, -4.9035F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, -2.7487F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r19 = bone2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(41, 42).addBox(-0.982F, -3.5409F, -3.5084F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4205F, -3.2625F, 4.1102F, 1.2787F, -0.1693F, 0.0398F));

		PartDefinition Bodyfront_r20 = bone2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(0, 57).addBox(-1.1191F, -1.6558F, -0.7444F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5205F, -3.2625F, 4.1102F, 0.4801F, -0.2292F, 0.3611F));

		PartDefinition Bodyfront_r21 = bone2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(80, 93).addBox(0.9977F, -0.9525F, -0.4518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1799F, -2.1605F, -0.059F, -0.2142F, 0.037F, -0.0567F));

		PartDefinition Bodyfront_r22 = bone2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(5, 92).addBox(0.6224F, 0.4846F, -1.6457F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0254F, -1.1262F, 0.7888F, -0.0332F, -0.0991F, -0.5989F));

		PartDefinition Bodyfront_r23 = bone2.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(38, 82).addBox(-2.2498F, 3.4314F, -0.8944F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4205F, -3.2625F, 4.1102F, -0.9715F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r24 = bone2.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(25, 76).addBox(-2.2498F, 2.449F, -2.4626F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4205F, -3.2625F, 4.1102F, -0.2297F, -0.2783F, -0.4426F));

		PartDefinition Bodyfront_r25 = bone2.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(81, 4).addBox(-2.2498F, 3.5058F, -4.0358F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4205F, -3.2625F, 4.1102F, -0.2733F, -0.2783F, -0.4426F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1891F, 7.535F, -5.68F, 0.3362F, -0.0992F, -0.3885F));

		PartDefinition cube_r236 = frontleftleg4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(82, 43).addBox(0.4211F, -0.0632F, 0.097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -0.7226F, -0.3938F, -0.9005F));

		PartDefinition cube_r237 = frontleftleg4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(31, 63).addBox(0.4211F, -1.1094F, -1.1758F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.7698F, -0.3938F, -0.9005F));

		PartDefinition cube_r238 = frontleftleg4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 83).addBox(0.4211F, -2.0215F, -2.2404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -2.2061F, -0.3938F, -0.9005F));

		PartDefinition cube_r239 = frontleftleg4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(77, 82).addBox(0.4211F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -1.2898F, -0.3938F, -0.9005F));

		PartDefinition cube_r240 = frontleftleg4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(17, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8928F, 3.6893F, 0.9024F, -0.4585F, -0.308F, -0.8901F));

		PartDefinition cube_r241 = frontleftleg4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(57, 50).addBox(0.4211F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, 0.1501F, -0.3938F, -0.9005F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0487F, 4.7311F, 1.5978F, -0.8256F, 1.3567F, -0.4826F));

		PartDefinition cube_r242 = frontleftleg5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(95, 95).addBox(0.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 1.0618F, 0.3851F, 0.9159F, -0.1321F, -0.0115F));

		PartDefinition cube_r243 = frontleftleg5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(85, 95).addBox(-0.1237F, -1.9998F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, 0.4359F, -0.1321F, -0.0115F));

		PartDefinition cube_r244 = frontleftleg5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(94, 10).addBox(-0.1237F, -1.4248F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition cube_r245 = frontleftleg5.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(96, 41).addBox(0.0F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1038F, 0.3452F, 1.0414F, -0.0004F, -0.1321F, -0.0115F));

		PartDefinition cube_r246 = frontleftleg5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(59, 96).addBox(-0.1237F, -2.9499F, 0.0512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, 0.6104F, -0.1321F, -0.0115F));

		PartDefinition cube_r247 = frontleftleg5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(7, 78).addBox(0.0F, -2.0F, -0.85F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 76).addBox(0.0F, -2.0F, -0.35F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0115F, 3.2942F, 0.6029F, -0.175F, -0.1321F, -0.0115F));

		PartDefinition cube_r248 = frontleftleg5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(65, 72).addBox(0.0F, -0.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 1.9788F, -0.925F, -0.0441F, -0.1321F, -0.0115F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4196F, 6.4753F, -0.6562F, -1.0F, -1.3819F, 0.783F));

		PartDefinition cube_r249 = frontleftleg6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0176F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0123F, -2.7407F, 0.2292F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1891F, 7.535F, -5.68F, -0.3567F, -0.0374F, 0.4902F));

		PartDefinition cube_r250 = frontrightleg4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(70, 82).addBox(-1.4211F, -0.0632F, 0.097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -0.7226F, 0.3938F, 0.9005F));

		PartDefinition cube_r251 = frontrightleg4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(40, 63).addBox(-1.4211F, -1.1094F, -1.1758F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.7698F, 0.3938F, 0.9005F));

		PartDefinition cube_r252 = frontrightleg4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(45, 84).addBox(-1.4211F, -2.0215F, -2.2404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -2.2061F, 0.3938F, 0.9005F));

		PartDefinition cube_r253 = frontrightleg4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(56, 83).addBox(-1.4211F, -0.8753F, -1.9187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -1.2898F, 0.3938F, 0.9005F));

		PartDefinition cube_r254 = frontrightleg4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(24, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.8928F, 3.6893F, 0.9024F, -0.4585F, 0.308F, 0.8901F));

		PartDefinition cube_r255 = frontrightleg4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(55, 60).addBox(-1.4211F, -1.9409F, -0.1672F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, 0.1501F, 0.3938F, 0.9005F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0487F, 4.7311F, 1.5978F, -1.3711F, -0.9052F, 0.9282F));

		PartDefinition cube_r256 = frontrightleg5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(30, 96).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0083F, 1.0618F, 0.3851F, 0.9159F, 0.1321F, 0.0115F));

		PartDefinition cube_r257 = frontrightleg5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(90, 95).addBox(-0.8763F, -1.9998F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, 0.4359F, 0.1321F, 0.0115F));

		PartDefinition cube_r258 = frontrightleg5.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(94, 14).addBox(-0.8763F, -1.4248F, -0.8738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, -0.1313F, 0.1321F, 0.0115F));

		PartDefinition cube_r259 = frontrightleg5.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(54, 96).addBox(-1.0F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1038F, 0.3452F, 1.0414F, -0.0004F, 0.1321F, 0.0115F));

		PartDefinition cube_r260 = frontrightleg5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(71, 96).addBox(-0.8763F, -2.9499F, 0.0512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, 0.6104F, 0.1321F, 0.0115F));

		PartDefinition cube_r261 = frontrightleg5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(12, 78).addBox(-1.0F, -2.0F, -0.85F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 76).addBox(-1.0F, -2.0F, -0.35F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0115F, 3.2942F, 0.6029F, -0.175F, 0.1321F, 0.0115F));

		PartDefinition cube_r262 = frontrightleg5.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(75, 15).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 1.9788F, -0.925F, -0.0441F, 0.1321F, 0.0115F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4196F, 6.4753F, -0.6562F, 0.0472F, 1.3819F, -0.783F));

		PartDefinition cube_r263 = frontrightleg6.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(38, 20).addBox(-1.9824F, 2.8125F, -3.3464F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0123F, -2.7407F, 0.2292F, -0.1313F, 0.1321F, 0.0115F));

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