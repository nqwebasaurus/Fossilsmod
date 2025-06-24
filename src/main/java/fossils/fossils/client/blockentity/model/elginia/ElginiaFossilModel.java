package fossils.fossils.client.blockentity.model.elginia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ElginiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart elginia;
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
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
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

	public ElginiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.elginia = this.fossil.getChild("elginia");
		this.lowerbody = this.elginia.getChild("lowerbody");
		this.bone = this.lowerbody.getChild("bone");
		this.bone2 = this.lowerbody.getChild("bone2");
		this.backleftleg4 = this.lowerbody.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backrightleg4 = this.lowerbody.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.tail = this.lowerbody.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.lowerbody.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.neck2 = this.upperbody.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition elginia = fossil.addOrReplaceChild("elginia", CubeListBuilder.create(), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition lowerbody = elginia.addOrReplaceChild("lowerbody", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, -0.4373F, -0.9178F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(71, 23).addBox(0.3F, 0.1929F, 0.1379F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 23).mirror().addBox(-2.3F, 0.1929F, 0.1379F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -12.1F, 14.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 35).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4373F, 2.0821F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 53).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4373F, 0.0822F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 23).addBox(-1.0F, -0.125F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.6372F, -1.8178F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = lowerbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.5674F, 1.607F, 2.62F));

		PartDefinition Hips_r1 = bone.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(65, 77).addBox(-1.0514F, 0.9689F, 4.1865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -1.0329F, 0.0F, 0.3927F));

		PartDefinition Hips_r2 = bone.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(71, 37).addBox(-1.0514F, -3.1526F, 4.134F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -1.4693F, 0.0F, 0.3927F));

		PartDefinition Hips_r3 = bone.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(64, 56).addBox(-1.0514F, 0.9799F, 3.3022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -0.3348F, 0.0F, 0.3927F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(54, 81).addBox(-1.0514F, 2.8243F, -2.643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, 0.5902F, 0.0F, 0.3927F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(71, 48).addBox(-1.0514F, 2.1813F, -2.1941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, 0.4419F, 0.0F, 0.3927F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(71, 52).addBox(-1.0514F, 1.7265F, -1.4284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, 0.1364F, 0.0F, 0.3927F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(46, 51).addBox(-1.0514F, -1.1538F, 1.7451F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -0.8061F, 0.0F, 0.3927F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(58, 77).addBox(-1.0514F, -0.6783F, -0.0186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -0.5443F, 0.0F, 0.3927F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(57, 15).addBox(-1.0514F, 0.1038F, -0.7818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.514F, 0.8699F, 0.4373F, -0.1952F, 0.0F, 0.3927F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(32, 71).addBox(-0.5F, -1.3F, -0.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0653F, -1.2451F, -1.2909F, -0.5266F, 0.0079F, -0.278F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(24, 83).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6338F, 0.0F, 0.0436F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(85, 72).addBox(-0.5F, -0.65F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2596F, -1.991F, 0.9647F, -0.6139F, 0.0079F, -0.278F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(36, 84).addBox(-0.5F, 0.5F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6916F, -3.4935F, 0.5952F, -0.1339F, 0.0079F, -0.278F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0559F, -1.125F, -4.3061F, -0.5703F, 0.0079F, -0.278F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(78, 54).addBox(-0.5F, -0.025F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2078F, -1.6964F, -2.9511F, 0.0842F, 0.0079F, -0.278F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(35, 77).addBox(-0.5F, -0.775F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1672F, -1.5498F, -3.1011F, 0.4333F, 0.0079F, -0.278F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(68, 68).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0653F, -1.2451F, -1.2909F, 0.2151F, 0.0079F, -0.278F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(42, 82).addBox(-0.5F, -0.9809F, -0.5462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2411F, 0.0F, 0.0436F));

		PartDefinition bone2 = lowerbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-2.5674F, 1.607F, 2.62F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(0.0514F, 0.9689F, 4.1865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -1.0329F, 0.0F, -0.3927F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(0.0514F, -3.1526F, 4.134F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -1.4693F, 0.0F, -0.3927F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(0.0514F, 0.9799F, 3.3022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -0.3348F, 0.0F, -0.3927F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(54, 81).mirror().addBox(0.0514F, 2.8243F, -2.643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, 0.5902F, 0.0F, -0.3927F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(0.0514F, 2.1813F, -2.1941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, 0.4419F, 0.0F, -0.3927F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(71, 52).mirror().addBox(0.0514F, 1.7265F, -1.4284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, 0.1364F, 0.0F, -0.3927F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(46, 51).mirror().addBox(0.0514F, -1.1538F, 1.7451F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -0.8061F, 0.0F, -0.3927F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(58, 77).mirror().addBox(0.0514F, -0.6783F, -0.0186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -0.5443F, 0.0F, -0.3927F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(0.0514F, 0.1038F, -0.7818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.514F, 0.8699F, 0.4373F, -0.1952F, 0.0F, -0.3927F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(32, 71).mirror().addBox(-0.5F, -1.3F, -0.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0653F, -1.2451F, -1.2909F, -0.5266F, -0.0079F, 0.278F));

		PartDefinition Hips_r29 = bone2.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6338F, 0.0F, -0.0436F));

		PartDefinition Hips_r30 = bone2.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(-0.5F, -0.65F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2596F, -1.991F, 0.9647F, -0.6139F, -0.0079F, 0.278F));

		PartDefinition Hips_r31 = bone2.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(36, 84).mirror().addBox(-0.5F, 0.5F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6916F, -3.4935F, 0.5952F, -0.1339F, -0.0079F, 0.278F));

		PartDefinition Hips_r32 = bone2.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0559F, -1.125F, -4.3061F, -0.5703F, -0.0079F, 0.278F));

		PartDefinition Hips_r33 = bone2.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(-0.5F, -0.025F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2078F, -1.6964F, -2.9511F, 0.0842F, -0.0079F, 0.278F));

		PartDefinition Hips_r34 = bone2.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5F, -0.775F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1672F, -1.5498F, -3.1011F, 0.4333F, -0.0079F, 0.278F));

		PartDefinition Hips_r35 = bone2.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0653F, -1.2451F, -1.2909F, 0.2151F, -0.0079F, 0.278F));

		PartDefinition Hips_r36 = bone2.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-0.5F, -0.9809F, -0.5462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2411F, 0.0F, -0.0436F));

		PartDefinition backleftleg4 = lowerbody.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9164F, 4.7284F, 3.3606F, 0.6106F, 0.2809F, -0.3471F));

		PartDefinition cube_r4 = backleftleg4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 27).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6964F, 0.5631F, -0.1928F, 0.4048F, -0.5193F, -0.4768F));

		PartDefinition cube_r5 = backleftleg4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 66).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0832F, 0.7828F, 0.9366F, 0.143F, -0.5193F, -0.4768F));

		PartDefinition cube_r6 = backleftleg4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 61).addBox(-0.05F, -2.4F, 1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.7836F, 0.9157F, -0.952F, -0.2497F, -0.5193F, -0.4768F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create().texOffs(49, 80).addBox(-0.2915F, 1.3791F, 1.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7208F, 5.7665F, -0.2087F, 0.0584F, -0.2618F, 0.3631F));

		PartDefinition cube_r7 = backleftleg5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 81).addBox(-0.5F, -2.8F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2085F, 1.5791F, 2.3023F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = backleftleg5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 70).addBox(-0.4329F, -1.0974F, -0.65F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1413F, 0.7572F, 0.2439F, 0.3491F, 0.0F, 0.0F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create().texOffs(0, 16).addBox(-1.2381F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4787F, 4.6354F, 1.6985F, 0.0F, 0.1745F, 0.0F));

		PartDefinition backrightleg4 = lowerbody.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9164F, 4.7284F, 3.3606F, 0.0683F, -0.276F, 0.2564F));

		PartDefinition cube_r9 = backrightleg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 27).mirror().addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6964F, 0.5631F, -0.1928F, 0.4048F, 0.5193F, 0.4768F));

		PartDefinition cube_r10 = backrightleg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0832F, 0.7828F, 0.9366F, 0.143F, 0.5193F, 0.4768F));

		PartDefinition cube_r11 = backrightleg4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-0.95F, -2.4F, 1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0065F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.9157F, -0.952F, -0.2497F, 0.5193F, 0.4768F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create().texOffs(49, 80).mirror().addBox(-0.7085F, 1.3791F, 1.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7208F, 5.7665F, -0.2087F, 0.1021F, 0.2618F, -0.3631F));

		PartDefinition cube_r12 = backrightleg5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 81).mirror().addBox(-0.5F, -2.8F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2085F, 1.5791F, 2.3023F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r13 = backrightleg5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-0.5671F, -1.0974F, -0.65F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1413F, 0.7572F, 0.2439F, 0.3491F, 0.0F, 0.0F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.7619F, -0.3918F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4787F, 4.6354F, 1.6985F, 0.0436F, -0.0019F, 0.0436F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(51, 23).addBox(-0.5F, -0.6829F, -0.2086F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(72, 77).addBox(-0.5F, -2.3829F, -0.6086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 26).addBox(0.0F, -1.1829F, -0.2086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 68).addBox(0.0F, -1.083F, 1.7914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2642F, 4.1371F, -0.205F, -0.1282F, 0.0266F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, -0.4261F, -0.1812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2329F, 3.7914F, -0.2303F, 0.2552F, -0.0591F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.4869F, -0.2066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0739F, 2.8188F, -0.1526F, 0.3453F, -0.052F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, -0.6101F, -6.1997F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, -3.0601F, -6.9247F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1544F, -0.6437F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(87, 21).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -1.1997F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(87, 8).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -3.1997F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(87, 4).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6101F, -5.1997F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 38).mirror().addBox(-0.2361F, 0.1448F, 0.1421F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6F, 3.3979F, -6.0461F, -0.125F, 0.2399F, -1.361F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-4.3167F, -1.8145F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.0038F, 0.0379F, -1.4163F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.0223F, 0.0309F, -0.8924F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -0.8201F, 0.072F, -0.0038F, -0.3489F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 5).mirror().addBox(-6.3167F, -1.8145F, -0.4043F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, 0.0158F, 0.0799F, -1.3632F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, 0.0536F, 0.0613F, -0.8386F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -2.8201F, 0.1145F, 0.006F, -0.2965F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 7).mirror().addBox(-8.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, 0.0158F, 0.0799F, -1.2934F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(29, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, 0.0536F, 0.0613F, -0.7688F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4402F, -4.8201F, 0.1145F, 0.006F, -0.2266F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 38).addBox(-0.7639F, 0.1448F, 0.1421F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6F, 3.3979F, -6.0461F, -0.125F, -0.2399F, 1.361F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(87, 80).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.072F, 0.0038F, 0.3489F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.0223F, -0.0309F, 0.8924F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(55, 21).addBox(2.3167F, -1.8145F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -0.8201F, 0.0038F, -0.0379F, 1.4163F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(87, 68).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, 0.1145F, -0.006F, 0.2965F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, 0.0536F, -0.0613F, 0.8386F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 5).addBox(2.3167F, -1.8145F, -0.4043F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -2.8201F, 0.0158F, -0.0799F, 1.3632F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 66).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.1145F, -0.006F, 0.2266F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.0536F, -0.0613F, 0.7688F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 7).addBox(2.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4402F, -4.8201F, 0.0158F, -0.0799F, 1.2934F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 0).addBox(-3.25F, -0.4945F, -6.9257F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-4.25F, -2.9945F, -6.4257F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -0.1156F, -6.274F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 86).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -0.9257F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 9).mirror().addBox(-0.7061F, -0.2128F, -0.2235F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.35F, 3.5135F, -5.7721F, -0.0615F, 0.0767F, -1.352F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-9.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, 0.0014F, 0.0295F, -1.2243F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, 0.016F, 0.0248F, -0.7006F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -0.5461F, 0.0635F, -0.0058F, -0.1568F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 25).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, 0.1145F, 0.006F, -0.1743F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, 0.0536F, 0.0613F, -0.7164F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 19).mirror().addBox(-10.3167F, -1.8145F, -0.4043F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -2.5461F, 0.0158F, 0.0799F, -1.241F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 87).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.157F, 0.0158F, -0.1564F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0851F, 0.0916F, -0.6965F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-11.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -4.5461F, 0.0278F, 0.1218F, -1.2223F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(-11.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.04F, 0.1638F, -1.2032F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(80, 32).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.1168F, 0.1218F, -0.6757F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 46).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -0.3246F, -6.5461F, 0.1995F, 0.0255F, -0.138F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(87, 31).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, 0.0635F, 0.0058F, 0.1568F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, 0.016F, -0.0248F, 0.7006F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 21).addBox(2.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -0.5461F, 0.0014F, -0.0295F, 1.2243F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 19).addBox(2.3167F, -1.8145F, -0.4043F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, 0.0158F, -0.0799F, 1.241F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 70).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, 0.0536F, -0.0613F, 0.7164F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(87, 25).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -2.5461F, 0.1145F, -0.006F, 0.1743F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 33).addBox(2.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0278F, -0.1218F, 1.2223F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 15).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.0851F, -0.0916F, 0.6965F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(23, 87).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -4.5461F, 0.157F, -0.0158F, 0.1564F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 46).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.1995F, -0.0255F, 0.138F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 32).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.1168F, -0.1218F, 0.6757F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 36).addBox(2.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.3246F, -6.5461F, 0.04F, -0.1638F, 1.2032F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 86).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -2.9257F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 86).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -4.9257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 76).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -0.4945F, -6.9257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(38, 9).addBox(-0.2939F, -0.2128F, -0.2235F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.85F, 3.5135F, -5.7721F, -0.0615F, -0.0767F, 1.352F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(24, 53).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-1.5F, -3.0F, -4.3F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, 0.0055F, -6.9257F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-3.8591F, -2.3784F, -5.369F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 0.9748F, 1.4834F, 0.0598F, -0.0953F, -1.3601F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-11.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -1.6204F, 0.04F, 0.1638F, -1.2206F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 7).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -1.6204F, 0.1168F, 0.1218F, -0.6932F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -1.6204F, 0.1995F, 0.0255F, -0.1555F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 17).mirror().addBox(-10.3167F, -1.8145F, -0.4043F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -3.6204F, 0.0498F, 0.1973F, -1.2188F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -3.6204F, 0.1423F, 0.1459F, -0.6898F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3301F, -3.6204F, 0.2336F, 0.0333F, -0.1545F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(65, 48).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -1.6204F, 0.1995F, -0.0255F, 0.1555F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 7).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -1.6204F, 0.1168F, -0.1218F, 0.6932F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(36, 31).addBox(2.3167F, -1.8145F, -0.4043F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -1.6204F, 0.04F, -0.1638F, 1.2206F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 44).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -3.6204F, 0.2336F, -0.0333F, 0.1545F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(29, 59).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -3.6204F, 0.1423F, -0.1459F, 0.6898F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(38, 17).addBox(2.3167F, -1.8145F, -0.4043F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3301F, -3.6204F, 0.0498F, -0.1973F, 1.2188F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 86).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 43).addBox(2.8591F, -2.3784F, -5.369F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.9748F, 1.4834F, 0.0598F, 0.0953F, 1.3601F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(36, 57).addBox(0.0F, -1.6697F, -4.026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0832F, -3.9518F, 0.0028F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = upperbody.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(29, 61).addBox(-3.2691F, -1.6026F, 0.4641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 67).addBox(-2.1F, -0.6F, 0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 9.2401F, -5.1102F, 1.1378F, 0.0501F, 0.0079F));

		PartDefinition cube_r83 = upperbody.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -1.6686F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.2678F, -2.0824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r84 = upperbody.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.8685F, -2.5482F, -4.6496F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 3.5731F, -0.2677F, 0.1362F, -0.271F, -1.3837F));

		PartDefinition cube_r85 = upperbody.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 29).mirror().addBox(-8.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -3.6686F, 0.0855F, 0.3145F, -1.3145F));

		PartDefinition cube_r86 = upperbody.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -3.6686F, 0.2332F, 0.2293F, -0.7775F));

		PartDefinition cube_r87 = upperbody.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1531F, -3.6686F, 0.3529F, 0.0602F, -0.2536F));

		PartDefinition cube_r88 = upperbody.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.6686F, 0.2847F, 0.0449F, -0.1874F));

		PartDefinition cube_r89 = upperbody.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(73, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.6686F, 0.1809F, 0.1818F, -0.7184F));

		PartDefinition cube_r90 = upperbody.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 43).mirror().addBox(-9.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1469F, -1.6686F, 0.0648F, 0.2476F, -1.2504F));

		PartDefinition cube_r91 = upperbody.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(87, 84).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -3.6686F, 0.3529F, -0.0602F, 0.2536F));

		PartDefinition cube_r92 = upperbody.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -3.6686F, 0.2332F, -0.2293F, 0.7775F));

		PartDefinition cube_r93 = upperbody.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(51, 29).addBox(2.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1531F, -3.6686F, 0.0855F, -0.3145F, 1.3145F));

		PartDefinition cube_r94 = upperbody.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(87, 82).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.6686F, 0.2847F, -0.0449F, 0.1874F));

		PartDefinition cube_r95 = upperbody.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.6686F, 0.1809F, -0.1818F, 0.7184F));

		PartDefinition cube_r96 = upperbody.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(47, 43).addBox(2.3167F, -1.8145F, -0.4043F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1469F, -1.6686F, 0.0648F, -0.2476F, 1.2504F));

		PartDefinition cube_r97 = upperbody.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 50).addBox(-0.1315F, -2.5482F, -4.6496F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.9F, 3.5731F, -0.2677F, 0.1362F, 0.271F, 1.3837F));

		PartDefinition cube_r98 = upperbody.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -0.3778F, -5.0281F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -2.5307F, -0.2069F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r99 = upperbody.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(13, 44).addBox(-1.0F, -0.6F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -3.9824F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = upperbody.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(25, 64).addBox(-1.0F, -0.5F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 89).addBox(-0.5F, -2.1F, -2.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 89).addBox(-0.5F, -2.1F, -0.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5322F, -4.9824F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r100 = neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 2).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.3837F, 0.3563F, -1.0481F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -2.6861F, 0.5412F, 0.1005F, -0.5526F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 88).mirror().addBox(-3.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.1183F, 0.4146F, -1.3552F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.3138F, 0.2993F, -0.8088F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(87, 86).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1791F, -0.6861F, 0.4555F, 0.0826F, -0.2987F));

		PartDefinition cube_r105 = neck2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(87, 88).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.5412F, -0.1005F, 0.5526F));

		PartDefinition cube_r106 = neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(85, 2).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -2.6861F, 0.3837F, -0.3563F, 1.0481F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 86).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.4555F, -0.0826F, 0.2987F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(85, 0).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.3138F, -0.2993F, 0.8088F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(34, 88).addBox(2.3167F, -1.8145F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1791F, -0.6861F, 0.1183F, -0.4146F, 1.3552F));

		PartDefinition cube_r110 = neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, 0.0331F, -2.7506F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1204F, -0.2241F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 9).addBox(-0.5F, -0.4681F, -3.839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.0396F, -2.9809F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.5181F, -1.839F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.4181F, -3.839F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-1.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -3.7053F, 0.2419F, 0.5763F, -1.3057F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -3.7053F, 0.5422F, 0.3542F, -0.7458F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7053F, 0.6923F, 0.1907F, -0.6354F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0395F, -1.7053F, 0.483F, 0.5058F, -1.1112F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(5, 89).addBox(0.9136F, -0.413F, -0.4043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -3.7053F, 0.2419F, -0.5763F, 1.3057F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 89).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -3.7053F, 0.5422F, -0.3542F, 0.7458F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 89).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7053F, 0.6923F, -0.1907F, 0.6354F));

		PartDefinition cube_r120 = neck.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 34).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0395F, -1.7053F, 0.483F, -0.5058F, 1.1112F));

		PartDefinition cube_r121 = neck.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0F, 0.0254F, -3.5955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -3.0808F, 2.7568F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 16).addBox(-3.0F, -0.4865F, -2.951F, 6.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.3161F, -4.2727F, -0.0546F, 0.3104F, 0.0666F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 50).addBox(-1.5F, -0.04F, -1.3101F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(78, 46).addBox(-1.5F, -0.04F, -0.9601F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.5229F, -7.283F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(54, 45).addBox(-2.0F, 0.0316F, -4.7772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(39, 46).addBox(-3.0F, 0.0316F, -2.8773F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.3771F, -2.883F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(47, 38).addBox(-3.0F, 0.0144F, -0.0042F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.0271F, -3.683F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 54).addBox(-0.5F, -1.125F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2494F, -3.0407F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(62, 37).addBox(-1.5F, -2.0126F, 0.0028F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.5135F, -6.951F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(35, 81).addBox(-1.0F, -1.6F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(36, 23).addBox(-1.0F, -2.9F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.5135F, -2.851F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(29, 86).addBox(0.2071F, 0.2071F, -0.5649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9866F, -0.851F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(66, 73).addBox(-0.6816F, -0.656F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2949F, 2.2442F, -5.6568F, -2.0899F, -0.0128F, -1.5755F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 34).addBox(-0.4059F, -0.0972F, -0.2441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.1359F, 0.1689F, 0.1888F, -0.2959F, 0.4667F, -0.1643F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(17, 31).addBox(-4.0F, -0.05F, -0.05F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -1.2365F, -2.801F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 23).addBox(-4.0F, -0.05F, -0.05F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2365F, -2.801F, 0.3054F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2728F, -0.9355F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.0469F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, 1.5882F, -5.6944F, 0.3321F, -0.8449F, -0.2524F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.15F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8254F, 0.7526F, -5.7397F, 0.3492F, -0.886F, -0.2749F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.6F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, 0.8291F, -4.3522F, 0.2355F, -0.3829F, -0.0894F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(13, 51).mirror().addBox(0.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8089F, 1.4657F, -5.1417F, 0.2256F, -0.2555F, -0.0579F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(0.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7444F, 0.4639F, -1.8231F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(42, 78).addBox(-1.0619F, -0.3909F, 0.1867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7444F, 0.4639F, -1.8231F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(75, 68).addBox(-0.4F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.2985F, 0.8291F, -4.3522F, 0.2355F, 0.3829F, 0.0894F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(13, 51).addBox(-1.0531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8089F, 1.4657F, -5.1417F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(5, 86).addBox(-0.85F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8254F, 0.7526F, -5.7397F, 0.3492F, 0.886F, 0.2749F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 86).addBox(-0.9531F, -0.6506F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9786F, 1.5882F, -5.6944F, 0.3321F, 0.8449F, 0.2524F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 24).addBox(-1.0F, -1.3F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 21).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.0643F, -1.7167F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.4919F, 2.5648F, -1.7537F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(85, 17).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.4919F, 0.9358F, -5.1973F, 0.3321F, 0.8449F, 0.2524F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(85, 27).addBox(-0.575F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-2.465F, 0.0869F, -4.7108F, 0.2198F, 0.8992F, 0.2032F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(82, 12).addBox(-1.8911F, -2.1815F, -2.8474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, 0.4886F, 0.1621F, 0.0534F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(28, 80).addBox(-1.8661F, -3.6397F, -0.5425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, 1.5357F, 0.1621F, 0.0534F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(80, 81).addBox(-1.8911F, -0.1176F, -2.8501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, -0.3405F, 0.1621F, 0.0534F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 38).addBox(-1.8911F, 1.4941F, -1.1029F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, -1.344F, 0.1621F, 0.0534F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(80, 8).addBox(-1.8911F, 1.1369F, 1.1334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, -1.9985F, 0.1621F, 0.0534F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 81).addBox(-1.8911F, 1.5593F, -0.595F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-0.566F, -1.9044F, -0.1973F, -1.4749F, 0.1621F, 0.0534F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 81).addBox(-1.1375F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(73, 81).addBox(-0.8625F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7733F, -1.943F, -2.6026F, -1.2183F, 0.161F, 0.0441F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 69).addBox(-0.9F, -1.7F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9479F, 0.7936F, -4.5963F, 0.1936F, 0.2713F, 0.0682F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(44, 74).addBox(-0.6816F, -0.3783F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.997F, -1.0206F, -5.6031F, -2.8806F, -0.5781F, -1.5609F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(21, 74).addBox(-0.6816F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.997F, -1.0206F, -5.6031F, -3.0988F, -0.5781F, -1.5609F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(57, 31).addBox(-1.1F, 0.0316F, -0.0772F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.8919F, -2.8704F, -3.7162F, 0.3434F, 0.1209F, 0.0503F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 0).addBox(-1.9159F, -1.4032F, -2.8907F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.616F, -1.9044F, -0.5973F, 0.2704F, 0.1621F, 0.0534F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 9).addBox(-2.2101F, -0.0464F, 0.2594F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.6791F, -1.0853F, -5.594F, 0.3212F, 0.3413F, 0.1528F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(66, 14).addBox(-1.0F, -0.5F, -1.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-2.3479F, 0.0291F, -3.3623F, 0.1903F, 0.3413F, 0.1528F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 43).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(41, 86).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.7019F, -2.1525F, -5.3669F, 0.6966F, 0.5038F, 0.2303F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(9, 63).addBox(-1.15F, -0.725F, -1.325F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.1255F, -1.3578F, -3.8615F, 0.4643F, 0.3354F, 0.1901F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 0).addBox(-0.8F, 0.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.9919F, -2.0845F, -5.5309F, 0.4215F, 0.3614F, 0.1572F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(52, 86).addBox(-0.875F, -1.9626F, 0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(62, 86).addBox(-0.875F, -1.9626F, 0.3278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4919F, 0.9487F, -5.1974F, 0.7099F, 0.5462F, 0.3643F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(78, 0).addBox(-2.0F, -2.0126F, 0.0028F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.4919F, 0.9487F, -5.1974F, 0.6226F, 0.5462F, 0.3643F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-2.4542F, -0.175F, -5.0761F, 1.2771F, 0.5462F, 0.3643F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 73).addBox(-0.6816F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.197F, -0.3206F, -3.9031F, -1.959F, -0.0128F, -1.5755F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(71, 64).addBox(-0.6816F, -0.0783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.997F, -4.2456F, 0.8969F, 0.5585F, 0.8029F, 0.1192F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(46, 59).addBox(-0.5F, -0.6428F, -1.703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1722F, -5.2886F, 1.6218F, -0.2353F, 1.0701F, -1.6778F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 13).addBox(-0.5F, -0.2964F, -0.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.1722F, -5.2886F, 1.6218F, 0.1137F, 1.0701F, -1.6778F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(73, 5).addBox(-0.8508F, -0.2704F, -0.2987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8813F, -5.482F, 3.4348F, 0.7545F, 0.5771F, -0.0479F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(52, 72).addBox(-0.8508F, -1.0145F, -0.295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1251F, -4.4328F, 2.6749F, 0.3677F, 0.6988F, 0.1081F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(72, 42).addBox(-0.8508F, -0.7803F, -0.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1251F, -4.4328F, 2.6749F, 0.4899F, 0.6988F, 0.1081F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(71, 60).addBox(-0.5F, 0.125F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0716F, -5.153F, 2.0697F, 0.2531F, 0.8029F, 0.1192F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(7, 73).addBox(-0.6816F, -0.6561F, -0.488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.997F, -4.2456F, 0.8969F, 0.5149F, 0.8029F, 0.1192F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(67, 86).addBox(-0.5F, -0.325F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0716F, -5.153F, 2.0697F, -0.6632F, 0.8029F, 0.1192F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(71, 56).addBox(-0.5F, -0.225F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0716F, -5.153F, 2.0697F, 0.1222F, 0.8029F, 0.1192F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 72).addBox(-0.7268F, -0.6227F, -1.5737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.097F, -4.2456F, 1.6969F, 0.556F, 0.4078F, 0.1129F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 9).addBox(-0.7268F, -1.1531F, -1.5838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.097F, -4.2456F, 1.6969F, 0.5123F, 0.4078F, 0.1129F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(78, 58).addBox(-0.6923F, -0.5822F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.797F, -2.2206F, -3.3031F, -2.2741F, -0.0128F, -3.0542F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(78, 62).addBox(-0.6923F, -0.1932F, -0.62F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.797F, -2.2206F, -3.3031F, -1.9251F, -0.0128F, -3.0542F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(19, 82).addBox(-0.4287F, -0.9704F, -0.6981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2608F, -2.7194F, -2.9226F, 0.2454F, 0.2536F, 0.177F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(7, 77).addBox(-0.4386F, -0.212F, -1.4709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2608F, -2.7194F, -2.9226F, -0.2973F, 0.1785F, 0.3036F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(85, 36).addBox(-0.4287F, -0.886F, -1.0382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2608F, -2.7194F, -2.9226F, -0.2782F, 0.2536F, 0.177F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(61, 68).addBox(-0.4213F, -1.1357F, -0.4693F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2608F, -2.7194F, -2.9226F, -0.274F, -0.0099F, 0.05F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(59, 73).addBox(-0.5F, -0.6202F, -1.0751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1853F, -3.5329F, -1.7414F, -1.9697F, -0.0384F, -2.9311F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, -0.3613F, -0.9705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.1853F, -3.5329F, -1.7414F, -1.6206F, -0.0384F, -2.9311F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(20, 59).addBox(-1.4304F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.0615F, -3.7417F, -0.072F, -0.274F, -0.0099F, 0.0F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -0.875F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1797F, -3.2749F, -0.3438F, -0.4922F, -0.0099F, 0.05F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, -0.825F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.151F, -3.9918F, 0.3814F, -0.274F, -0.0099F, 0.05F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 67).addBox(-0.6F, -1.0F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9924F, -3.7701F, -0.0082F, -0.4465F, -0.3925F, 0.7187F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 62).addBox(-0.4059F, -0.5135F, -1.0419F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3559F, -2.3959F, 1.9425F, -0.4704F, 0.4667F, -0.1643F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(79, 42).addBox(-0.4059F, 0.2861F, -0.3665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3559F, -2.3959F, 1.9425F, 0.0095F, 0.4667F, -0.1643F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 62).addBox(-1.1034F, -3.0746F, 0.0762F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0044F, 0.347F, -0.2127F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(73, 30).addBox(-0.6816F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.797F, 0.5794F, -0.6031F, -2.5943F, 1.0251F, -2.7134F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 26).addBox(-0.6816F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.797F, 0.5794F, -0.6031F, -2.4634F, 1.0251F, -2.7134F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(51, 76).addBox(-0.6816F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.203F, 0.2794F, 1.3969F, -2.3719F, 1.2719F, -2.6834F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(28, 76).addBox(-0.6816F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.203F, 0.2794F, 1.3969F, -2.241F, 1.2719F, -2.6834F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(73, 34).addBox(0.85F, -0.325F, -1.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 18).addBox(0.25F, -0.325F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 86).addBox(-0.4F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.566F, 0.4204F, 1.8822F, 0.0869F, 1.1312F, -0.1474F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(14, 76).addBox(-0.6816F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.703F, 0.5794F, 2.2969F, -0.1593F, 0.715F, -0.2033F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 76).addBox(-0.6816F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.703F, 0.5794F, 2.2969F, -0.2902F, 0.715F, -0.2033F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(78, 17).addBox(-1.1034F, -0.8942F, -0.5943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 62).addBox(-1.1034F, 0.1058F, -0.5943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0393F, 0.347F, -0.2127F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(64, 50).addBox(-1.1034F, -1.8746F, 0.0762F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4756F, 0.347F, -0.2127F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(55, 50).addBox(-1.1034F, -1.7794F, -3.1745F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3098F, 0.347F, -0.2127F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.4919F, 2.5648F, -1.7537F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.4919F, 0.9358F, -5.1973F, 0.3321F, -0.8449F, -0.2524F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-0.425F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(2.465F, 0.0869F, -4.7108F, 0.2198F, -0.8992F, -0.2032F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.1089F, -2.1815F, -2.8474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, 0.4886F, -0.1621F, -0.0534F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(28, 80).mirror().addBox(-0.1339F, -3.6397F, -0.5425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, 1.5357F, -0.1621F, -0.0534F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.1089F, -0.1176F, -2.8501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, -0.3405F, -0.1621F, -0.0534F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-0.1089F, 1.4941F, -1.1029F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, -1.344F, -0.1621F, -0.0534F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-0.1089F, 1.1369F, 1.1334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, -1.9985F, -0.1621F, -0.0534F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-0.1089F, 1.5593F, -0.595F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(0.566F, -1.9044F, -0.1973F, -1.4749F, -0.1621F, -0.0534F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 81).mirror().addBox(-0.8625F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(73, 81).mirror().addBox(-1.1375F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.7733F, -1.943F, -2.6026F, -1.2183F, -0.161F, -0.0441F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.1F, -1.7F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 0.7936F, -4.5963F, 0.1936F, -0.2713F, -0.0682F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-0.3184F, -0.3783F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.997F, -1.0206F, -5.6031F, -2.8806F, 0.5781F, 1.5609F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(-0.3184F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.997F, -1.0206F, -5.6031F, -3.0988F, 0.5781F, 1.5609F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(57, 31).mirror().addBox(0.1F, 0.0316F, -0.0772F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.8919F, -2.8704F, -3.7162F, 0.3434F, -0.1209F, -0.0503F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.0841F, -1.4032F, -2.8907F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.616F, -1.9044F, -0.5973F, 0.2704F, -0.1621F, -0.0534F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(0.2101F, -0.0464F, 0.2594F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.6791F, -1.0853F, -5.594F, 0.3212F, -0.3413F, -0.1528F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-1.0F, -0.5F, -1.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(2.3479F, 0.0291F, -3.3623F, 0.1903F, -0.3413F, -0.1528F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(86, 43).mirror().addBox(0.0F, 0.0F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(41, 86).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.7019F, -2.1525F, -5.3669F, 0.6966F, -0.5038F, -0.2303F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(-0.85F, -0.725F, -1.325F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.1255F, -1.3578F, -3.8615F, 0.4643F, -0.3354F, -0.1901F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.2F, 0.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.9919F, -2.0845F, -5.5309F, 0.4215F, -0.3614F, -0.1572F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-0.125F, -1.9626F, 0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(62, 86).mirror().addBox(-0.125F, -1.9626F, 0.3278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4919F, 0.9487F, -5.1974F, 0.7099F, -0.5462F, -0.3643F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0F, -2.0126F, 0.0028F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(2.4919F, 0.9487F, -5.1974F, 0.6226F, -0.5462F, -0.3643F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(2.4542F, -0.175F, -5.0761F, 1.2771F, -0.5462F, -0.3643F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-0.3184F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.197F, -0.3206F, -3.9031F, -1.959F, 0.0128F, 1.5755F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.3184F, -0.0783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.997F, -4.2456F, 0.8969F, 0.5585F, -0.8029F, -0.1192F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(46, 59).mirror().addBox(-0.5F, -0.6428F, -1.703F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1722F, -5.2886F, 1.6218F, -0.2353F, -1.0701F, 1.6778F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.5F, -0.2964F, -0.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.1722F, -5.2886F, 1.6218F, 0.1137F, -1.0701F, 1.6778F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 5).mirror().addBox(-0.1492F, -0.2704F, -0.2987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8813F, -5.482F, 3.4348F, 0.7545F, -0.5771F, 0.0479F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(-0.1492F, -1.0145F, -0.295F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1251F, -4.4328F, 2.6749F, 0.3677F, -0.6988F, -0.1081F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(72, 42).mirror().addBox(-0.1492F, -0.7803F, -0.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1251F, -4.4328F, 2.6749F, 0.4899F, -0.6988F, -0.1081F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-0.5F, 0.125F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0716F, -5.153F, 2.0697F, 0.2531F, -0.8029F, -0.1192F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.3184F, -0.6561F, -0.488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.997F, -4.2456F, 0.8969F, 0.5149F, -0.8029F, -0.1192F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(67, 86).mirror().addBox(-0.5F, -0.325F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0716F, -5.153F, 2.0697F, -0.6632F, -0.8029F, -0.1192F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(71, 56).mirror().addBox(-0.5F, -0.225F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0716F, -5.153F, 2.0697F, 0.1222F, -0.8029F, -0.1192F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.2732F, -0.6227F, -1.5737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.097F, -4.2456F, 1.6969F, 0.556F, -0.4078F, -0.1129F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-0.2732F, -1.1531F, -1.5838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.097F, -4.2456F, 1.6969F, 0.5123F, -0.4078F, -0.1129F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.3077F, -0.5822F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.797F, -2.2206F, -3.3031F, -2.2741F, 0.0128F, 3.0542F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.3077F, -0.1932F, -0.62F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.797F, -2.2206F, -3.3031F, -1.9251F, 0.0128F, 3.0542F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-0.5713F, -0.9704F, -0.6981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2608F, -2.7194F, -2.9226F, 0.2454F, -0.2536F, -0.177F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.5614F, -0.212F, -1.4709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2608F, -2.7194F, -2.9226F, -0.2973F, -0.1785F, -0.3036F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-0.5713F, -0.886F, -1.0382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2608F, -2.7194F, -2.9226F, -0.2782F, -0.2536F, -0.177F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(-0.5787F, -1.1357F, -0.4693F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2608F, -2.7194F, -2.9226F, -0.274F, 0.0099F, -0.05F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-0.5F, -0.6202F, -1.0751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1853F, -3.5329F, -1.7414F, -1.9697F, 0.0384F, 2.9311F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(21, 78).mirror().addBox(-0.5F, -0.3613F, -0.9705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.1853F, -3.5329F, -1.7414F, -1.6206F, 0.0384F, 2.9311F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.5F, -0.875F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1797F, -3.2749F, -0.3438F, -0.4922F, 0.0099F, -0.05F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(66, 32).mirror().addBox(-0.5F, -0.825F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.151F, -3.9918F, 0.3814F, -0.274F, 0.0099F, -0.05F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-0.4F, -1.0F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9924F, -3.7701F, -0.0082F, -0.4465F, 0.3925F, -0.7187F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5941F, -0.5135F, -1.0419F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3559F, -2.3959F, 1.9425F, -0.4704F, -0.4667F, 0.1643F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-0.5941F, 0.2861F, -0.3665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.3559F, -2.3959F, 1.9425F, 0.0095F, -0.4667F, 0.1643F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(0.1034F, -3.0746F, 0.0762F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0044F, -0.347F, 0.2127F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-0.3184F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.797F, 0.5794F, -0.6031F, -2.5943F, -1.0251F, 2.7134F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-0.3184F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.797F, 0.5794F, -0.6031F, -2.4634F, -1.0251F, 2.7134F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(51, 76).mirror().addBox(-0.3184F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.203F, 0.2794F, 1.3969F, -2.3719F, -1.2719F, 2.6834F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.3184F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.203F, 0.2794F, 1.3969F, -2.241F, -1.2719F, 2.6834F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-1.85F, -0.325F, -1.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 18).mirror().addBox(-1.25F, -0.325F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 86).mirror().addBox(-0.6F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.566F, 0.4204F, 1.8822F, 0.0869F, -1.1312F, 0.1474F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.3184F, -0.4783F, -0.5005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.703F, 0.5794F, 2.2969F, -0.1593F, -0.715F, 0.2033F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.3184F, -0.6561F, -0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.703F, 0.5794F, 2.2969F, -0.2902F, -0.715F, 0.2033F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(0.1034F, -0.8942F, -0.5943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 62).mirror().addBox(0.1034F, 0.1058F, -0.5943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0393F, -0.347F, 0.2127F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(0.1034F, -1.8746F, 0.0762F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4756F, -0.347F, 0.2127F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(0.1034F, -1.7794F, -3.1745F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3098F, -0.347F, 0.2127F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.5235F, 5.8028F, -5.0391F));

		PartDefinition Bodyfront_r2 = bone3.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(45, 64).addBox(-0.5F, 0.3F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1469F, -6.0101F, 2.9707F, 0.8301F, 0.2125F, -0.2182F));

		PartDefinition Bodyfront_r3 = bone3.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5F, -1.2F, -1.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1469F, -6.0101F, 2.9707F, -0.2171F, 0.2125F, -0.2182F));

		PartDefinition Bodyfront_r4 = bone3.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.725F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1064F, -4.4825F, 1.2544F, -1.8316F, 0.2125F, -0.2182F));

		PartDefinition Bodyfront_r5 = bone3.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(79, 77).addBox(-0.5F, 0.375F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1469F, -6.0101F, 2.9707F, -2.0497F, 0.2125F, -0.2182F));

		PartDefinition Bodyfront_r6 = bone3.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(36, 0).addBox(0.1624F, -1.5849F, 3.1892F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4765F, 1.6373F, -0.0711F, 1.0919F, 0.2125F, -0.2182F));

		PartDefinition Bodyfront_r7 = bone3.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(66, 26).addBox(-0.5732F, -0.3457F, -0.1751F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3501F, 0.2125F, 0.2617F));

		PartDefinition Bodyfront_r8 = bone3.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5732F, -1.9471F, -1.5957F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2608F, 0.2125F, 0.2617F));

		PartDefinition Bodyfront_r9 = bone3.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5169F, -0.2853F, -1.5864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.0856F, 0.239F, 0.2912F));

		PartDefinition Bodyfront_r10 = bone3.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(71, 18).addBox(-0.5732F, -2.1464F, -1.3195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.348F, 0.2125F, 0.2617F));

		PartDefinition Bodyfront_r11 = bone3.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(18, 64).addBox(-0.5732F, -2.4862F, -0.258F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0883F, 0.2125F, 0.2617F));

		PartDefinition Bodyfront_r12 = bone3.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(65, 42).addBox(-0.5732F, -0.6208F, -1.3486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0447F, 0.2125F, 0.2617F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.5235F, 5.8028F, -5.0391F));

		PartDefinition Bodyfront_r13 = bone4.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.5F, 0.3F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1469F, -6.0101F, 2.9707F, 0.8301F, -0.2125F, 0.2182F));

		PartDefinition Bodyfront_r14 = bone4.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(-0.5F, -1.2F, -1.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1469F, -6.0101F, 2.9707F, -0.2171F, -0.2125F, 0.2182F));

		PartDefinition Bodyfront_r15 = bone4.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.725F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, -4.4825F, 1.2544F, -1.8316F, -0.2125F, 0.2182F));

		PartDefinition Bodyfront_r16 = bone4.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-0.5F, 0.375F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1469F, -6.0101F, 2.9707F, -2.0497F, -0.2125F, 0.2182F));

		PartDefinition Bodyfront_r17 = bone4.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.1624F, -1.5849F, 3.1892F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4765F, 1.6373F, -0.0711F, 1.0919F, -0.2125F, 0.2182F));

		PartDefinition Bodyfront_r18 = bone4.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-0.4268F, -0.3457F, -0.1751F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3501F, -0.2125F, -0.2617F));

		PartDefinition Bodyfront_r19 = bone4.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-0.4268F, -1.9471F, -1.5957F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.2608F, -0.2125F, -0.2617F));

		PartDefinition Bodyfront_r20 = bone4.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-0.4831F, -0.2853F, -1.5864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.0856F, -0.239F, -0.2912F));

		PartDefinition Bodyfront_r21 = bone4.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-0.4268F, -2.1464F, -1.3195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.348F, -0.2125F, -0.2617F));

		PartDefinition Bodyfront_r22 = bone4.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-0.4268F, -2.4862F, -0.258F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0883F, -0.2125F, -0.2617F));

		PartDefinition Bodyfront_r23 = bone4.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(65, 42).mirror().addBox(-0.4268F, -0.6208F, -1.3486F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0447F, -0.2125F, -0.2617F));

		PartDefinition frontleftleg4 = upperbody.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1891F, 7.535F, -3.68F, 0.0562F, -0.2867F, -0.0091F));

		PartDefinition cube_r263 = frontleftleg4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, 0.6F, 0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5137F, 0.4385F, -0.7916F, -0.6617F, 0.056F, -0.9104F));

		PartDefinition cube_r264 = frontleftleg4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(11, 57).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5137F, 0.4385F, -0.7916F, -1.7089F, 0.056F, -0.9104F));

		PartDefinition cube_r265 = frontleftleg4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(80, 4).addBox(0.5F, -1.125F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6577F, 1.81F, -0.6719F, -0.7926F, 0.056F, -0.9104F));

		PartDefinition cube_r266 = frontleftleg4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(39, 51).addBox(0.5F, -2.0F, -0.15F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6577F, 1.81F, -0.6719F, 0.211F, 0.056F, -0.9104F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0114F, 4.0306F, 1.8406F, -0.6191F, 1.0988F, -0.4699F));

		PartDefinition cube_r267 = frontleftleg5.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(85, 46).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0083F, 1.0618F, 0.3851F, 0.5232F, -0.1321F, -0.0115F));

		PartDefinition cube_r268 = frontleftleg5.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(47, 85).addBox(-0.1237F, -1.9999F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, 0.4359F, -0.1321F, -0.0115F));

		PartDefinition cube_r269 = frontleftleg5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 50).addBox(-0.1237F, -1.9249F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, 0.2177F, -0.1321F, -0.0115F));

		PartDefinition cube_r270 = frontleftleg5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 58).addBox(0.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.1038F, 0.3452F, 1.0414F, -1.2658F, -0.1321F, -0.0115F));

		PartDefinition cube_r271 = frontleftleg5.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 62).addBox(-0.1237F, -1.8498F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0115F, 1.6942F, 1.4029F, -0.0004F, -0.1321F, -0.0115F));

		PartDefinition cube_r272 = frontleftleg5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(14, 80).addBox(0.0F, -2.0F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.0115F, 3.2942F, 0.6029F, -0.2622F, -0.1321F, -0.0115F));

		PartDefinition cube_r273 = frontleftleg5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(34, 64).addBox(0.0F, -1.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 1.9788F, -0.925F, 0.0432F, -0.1321F, -0.0115F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 4.9519F, -0.536F, 0.3815F, -0.8052F, 0.0045F));

		PartDefinition cube_r274 = frontleftleg6.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(19, 9).addBox(-1.6176F, 2.8125F, -4.3464F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0123F, -2.7407F, 0.2292F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition frontrightleg4 = upperbody.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1891F, 7.535F, -3.68F, 0.674F, 0.5481F, 0.0261F));

		PartDefinition cube_r275 = frontrightleg4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.5F, 0.6F, 0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5137F, 0.4385F, -0.7916F, -0.6617F, -0.056F, 0.9104F));

		PartDefinition cube_r276 = frontrightleg4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(11, 57).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5137F, 0.4385F, -0.7916F, -1.7089F, -0.056F, 0.9104F));

		PartDefinition cube_r277 = frontrightleg4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-1.5F, -1.125F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6577F, 1.81F, -0.6719F, -0.7926F, -0.056F, 0.9104F));

		PartDefinition cube_r278 = frontrightleg4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(39, 51).mirror().addBox(-1.5F, -2.0F, -0.15F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6577F, 1.81F, -0.6719F, 0.211F, -0.056F, 0.9104F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0114F, 4.0306F, 1.8406F, -1.3572F, -0.4721F, 0.7576F));

		PartDefinition cube_r279 = frontrightleg5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0083F, 1.0618F, 0.3851F, 0.5232F, 0.1321F, 0.0115F));

		PartDefinition cube_r280 = frontrightleg5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(-0.8763F, -1.9999F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, 0.4359F, 0.1321F, 0.0115F));

		PartDefinition cube_r281 = frontrightleg5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-0.8763F, -1.9249F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, 0.2177F, 0.1321F, 0.0115F));

		PartDefinition cube_r282 = frontrightleg5.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.1038F, 0.3452F, 1.0414F, -1.2658F, 0.1321F, 0.0115F));

		PartDefinition cube_r283 = frontrightleg5.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-0.8763F, -1.8498F, -0.8488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0115F, 1.6942F, 1.4029F, -0.0004F, 0.1321F, 0.0115F));

		PartDefinition cube_r284 = frontrightleg5.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 80).mirror().addBox(-1.0F, -2.0F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0115F, 3.2942F, 0.6029F, -0.2622F, 0.1321F, 0.0115F));

		PartDefinition cube_r285 = frontrightleg5.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-1.0F, -1.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1764F, 1.9788F, -0.925F, 0.0432F, 0.1321F, 0.0115F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 4.9519F, -0.536F, 1.1232F, 0.8052F, -0.0045F));

		PartDefinition cube_r286 = frontrightleg6.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(19, 9).mirror().addBox(-2.3824F, 2.8125F, -4.3464F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0123F, -2.7407F, 0.2292F, -0.1313F, 0.1321F, 0.0115F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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