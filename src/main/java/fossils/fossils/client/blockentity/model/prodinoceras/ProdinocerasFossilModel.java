package fossils.fossils.client.blockentity.model.prodinoceras;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProdinocerasFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftMaxilla;
	private final ModelPart leftCanine;
	private final ModelPart rightMaxilla;
	private final ModelPart rightCanine;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public ProdinocerasFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm4 = this.leftarm2.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm4 = this.rightarm2.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.leftCanine = this.leftMaxilla.getChild("leftCanine");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.rightCanine = this.rightMaxilla.getChild("rightCanine");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.2239F, 8.4628F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 45).addBox(0.0F, -1.0691F, -0.0309F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 0.2F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 71).addBox(0.0F, -1.5986F, 2.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 71).addBox(0.0F, -1.5986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-1.5963F, -0.6677F, -1.0607F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 3.4589F, 0.545F, 2.2995F, -0.6794F, 1.4309F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 70).mirror().addBox(0.4812F, -0.6005F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 3.4589F, 0.545F, 1.8345F, -0.9199F, 2.1659F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.6F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 60).mirror().addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4413F, 0.2042F, -2.1596F, -1.638F, -1.1371F, 0.6131F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 48).mirror().addBox(-1.6941F, -0.4845F, -0.5113F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -1.2128F, -0.3322F, -1.4136F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-1.4919F, -0.4845F, -0.9418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -1.6397F, -0.4789F, -0.4111F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(1.8403F, -1.4942F, -0.643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9733F, 0.3122F, -1.0725F, -2.1016F, -0.4761F, 1.1003F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.6F, -0.9F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2836F, 1.5018F, -0.5704F, -2.6733F, -1.1066F, 1.7954F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-1.4863F, -1.1167F, 0.3561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 3.4589F, 0.545F, 2.5981F, 0.1188F, 1.1083F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.9234F, -0.5F, -0.1905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9204F, 3.4791F, 1.9517F, 0.6628F, -1.0773F, -2.7374F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-1.2003F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9204F, 3.4791F, 1.9517F, 1.686F, -1.273F, 2.4567F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-1.5963F, -1.2272F, -1.3486F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 3.4589F, 0.545F, 3.0849F, -0.6794F, 1.4309F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(1.7583F, -1.6046F, 1.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -2.2688F, -0.5208F, 1.5283F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(0.3426F, -1.6046F, 1.2142F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -2.3537F, -0.3554F, 1.7273F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-1.6253F, -0.4845F, -1.2165F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -2.0197F, -0.186F, 0.6444F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-0.8464F, -0.161F, -1.7234F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -2.051F, -0.2981F, 0.1931F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-1.9001F, -2.3025F, -1.2267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -1.351F, -0.9932F, -0.1905F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.3995F, -2.6602F, -1.6347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0368F, -0.8342F, 1.5872F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-0.4118F, -1.6203F, -0.0383F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0132F, -0.9903F, 1.617F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(0.0556F, -2.6602F, -1.334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 0.3868F, -1.3835F, -2.0127F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(0.016F, -0.2179F, -1.8626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 3.4589F, 0.545F, -0.9076F, 0.3163F, -0.379F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(68, 8).addBox(0.4863F, -1.1167F, 0.3561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, 2.5981F, -0.1188F, -1.1083F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(49, 70).addBox(-1.4812F, -0.6005F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, 1.8345F, 0.9199F, -2.1659F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0766F, -0.5F, -0.1905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9204F, 3.4791F, 1.9517F, 0.6628F, 1.0773F, 2.7374F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 33).addBox(-0.7997F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9204F, 3.4791F, 1.9517F, 1.686F, 1.273F, -2.4567F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(24, 62).addBox(-0.4037F, -0.6677F, -1.0607F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, 2.2995F, 0.6794F, -1.4309F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(17, 60).addBox(-0.4037F, -1.2272F, -1.3486F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, 3.0849F, 0.6794F, -1.4309F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 40).addBox(-3.8403F, -1.4942F, -0.643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9733F, 0.3122F, -1.0725F, -2.1016F, 0.4761F, -1.1003F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 60).addBox(-1.4F, -0.9F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2836F, 1.5018F, -0.5704F, -2.6733F, 1.1066F, -1.7954F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 17).addBox(-2.7583F, -1.6046F, 1.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -2.2688F, 0.5208F, -1.5283F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 69).addBox(-0.4F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 60).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4413F, 0.2042F, -2.1596F, -1.638F, 1.1371F, -0.6131F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 27).addBox(-2.3426F, -1.6046F, 1.2142F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -2.3537F, 0.3554F, -1.7273F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 48).addBox(-0.3059F, -0.4845F, -0.5113F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -1.2128F, 0.3322F, 1.4136F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 25).addBox(-0.5081F, -0.4845F, -0.9418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -1.6397F, 0.4789F, 0.4111F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 42).addBox(-1.3747F, -0.4845F, -1.2165F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -2.0197F, 0.186F, -0.6444F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 9).addBox(-1.1536F, -0.161F, -1.7234F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -2.051F, 0.2981F, -0.1931F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(56, 11).addBox(0.9001F, -2.3025F, -1.2267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, -1.351F, 0.9932F, 0.1905F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 69).addBox(-0.6005F, -2.6602F, -1.6347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0368F, 0.8342F, -1.5872F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 65).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5882F, -1.6203F, -0.0383F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0132F, 0.9903F, -1.617F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 56).addBox(-1.0556F, -2.6602F, -1.334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 0.3868F, 1.3835F, 2.0127F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 22).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.2715F, 0.2393F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 30).addBox(-2.016F, -0.2179F, -1.8626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, -0.9076F, -0.3163F, 0.379F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 14).addBox(-3.3744F, -0.2179F, -1.7106F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 43).addBox(-3.3744F, -0.0559F, 0.0057F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3744F, 3.4589F, 0.545F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.929F, 0.4801F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(45, 17).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -2.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(46, 47).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.0261F, 0.0497F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 46).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.896F, -0.9164F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(18, 74).addBox(-1.0F, -0.033F, -0.0653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.3822F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.0303F, -0.9875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6652F, -0.0822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2289F, 0.1913F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(48, 21).addBox(-1.3F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 54).addBox(-0.6F, -1.2938F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.2131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(55, 65).addBox(-0.6F, -0.3656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 3.8131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(61, 49).addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3F, 0.9131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(60, 66).addBox(-0.5F, -0.0656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(66, 49).addBox(-0.5F, -0.1222F, -0.0452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(45, 62).addBox(-1.4F, 0.0303F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8263F, 0.0345F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(48, 29).addBox(-1.0F, -1.0174F, -0.1004F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2376F, 0.866F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(55, 62).addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.5705F, -0.278F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(61, 46).addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4557F, -0.6179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 29).addBox(-1.5F, -0.5634F, -2.7119F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7097F, -0.0561F, 0.925F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.929F, 0.4801F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(-0.5F, -2.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0261F, 0.0497F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 46).mirror().addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.896F, -0.9164F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-1.0F, -0.033F, -0.0653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.3822F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.5F, -0.0303F, -0.9875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6652F, -0.0822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2289F, 0.1913F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.4F, -1.2938F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.4F, -0.3656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(61, 49).mirror().addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.9131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-0.5F, -0.0656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.5131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 49).mirror().addBox(-0.5F, -0.1222F, -0.0452F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(0.4F, 0.0303F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8263F, 0.0345F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-1.0F, -1.0174F, -0.1004F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2376F, 0.866F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5705F, -0.278F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4557F, -0.6179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(15, 29).mirror().addBox(-1.5F, -0.5634F, -2.7119F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7097F, -0.0561F, 1.4923F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.5F, -0.1174F, 0.2601F, -0.0303F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 72).addBox(0.0F, -0.4F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.0F, -0.6F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9985F, -5.8046F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(6, 72).addBox(0.0F, -1.7244F, -1.0623F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4985F, -4.5046F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-1.7472F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.08F, -1.3798F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(63, 54).mirror().addBox(-2.9177F, -0.1042F, -0.408F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1454F, -5.2577F, -0.4652F, 0.0804F, -1.1563F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.9134F, 0.1368F, -0.408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1454F, -5.2577F, -0.4324F, 0.1946F, -0.9183F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.08F, -3.3798F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 71).addBox(-0.0866F, 0.1368F, -0.408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1454F, -5.2577F, -0.4324F, -0.1946F, 0.9183F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 54).addBox(0.9177F, -0.1042F, -0.408F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1454F, -5.2577F, -0.4652F, -0.0804F, 1.1563F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 40).addBox(-0.2528F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.08F, -1.3798F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 15).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.08F, -3.3798F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(17, 13).addBox(-0.5F, -0.1512F, 6.7474F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4248F, -6.5933F, -0.1772F, 0.1719F, -0.0306F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-6.3328F, 0.0934F, -0.3717F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.4299F, -5.9335F, 0.6443F, 0.8242F, 1.1631F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-4.1328F, 0.0934F, -0.3717F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.4299F, -5.9335F, 0.2856F, 0.3008F, 0.592F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(37, 41).mirror().addBox(-4.7328F, 0.0934F, -0.3717F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.4299F, -5.9335F, 0.449F, 0.6198F, 0.8917F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(-4.5233F, 0.0201F, -0.2306F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.9299F, -7.0335F, 0.2996F, 0.092F, 0.6205F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(11, 41).mirror().addBox(-4.2243F, -0.0361F, -0.4507F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.1299F, -8.5335F, 0.2871F, 0.1306F, 0.4307F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-3.8403F, -0.0985F, -0.4891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2703F, -0.4602F, -0.3474F, 0.3349F, -1.1318F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-0.8372F, 0.1223F, -0.4891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2703F, -0.4602F, -0.2487F, 0.4123F, -0.863F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-0.6492F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.3102F, 0.3463F, -0.8683F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-3.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.3872F, 0.2564F, -1.1259F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-4.1449F, -1.7359F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.4523F, 0.0908F, -1.4978F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.33F, 0.3636F, -0.7736F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(56, 4).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.4103F, 0.2684F, -1.0303F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(36, 65).mirror().addBox(-5.2581F, -1.8721F, -0.3159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.4776F, 0.0939F, -1.3985F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-4.7182F, -0.5751F, -0.4368F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.4123F, 0.2903F, -0.9802F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-1.8085F, -0.1108F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.326F, 0.3853F, -0.7215F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-6.1184F, -2.3729F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.4873F, 0.1137F, -1.3488F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-7.2579F, -2.5396F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.4679F, 0.1446F, -1.3123F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(-4.9117F, -0.674F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.3817F, 0.3121F, -0.9371F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-2.021F, -0.1562F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.2894F, 0.3988F, -0.6734F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-6.0431F, -2.5609F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.4894F, 0.1322F, -1.3148F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-4.7223F, -0.7776F, -0.4087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.4073F, 0.3083F, -0.9444F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-1.8649F, -0.3053F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.316F, 0.4015F, -0.6833F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(53, 36).addBox(0.8403F, -0.0985F, -0.4891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2703F, -0.4602F, -0.3474F, -0.3349F, 1.1318F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(71, 37).addBox(-0.1628F, 0.1223F, -0.4891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2703F, -0.4602F, -0.2487F, -0.4123F, 0.863F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(57, 27).addBox(-0.3508F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.3102F, -0.3463F, 0.8683F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(52, 52).addBox(0.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.3872F, -0.2564F, 1.1259F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(70, 6).addBox(3.1449F, -1.7359F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.4523F, -0.0908F, 1.4978F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 14).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.33F, -0.3636F, 0.7736F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(56, 4).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.4103F, -0.2684F, 1.0303F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(36, 65).addBox(3.2581F, -1.8721F, -0.3159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.4776F, -0.0939F, 1.3985F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 15).addBox(1.7182F, -0.5751F, -0.4368F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.4123F, -0.2903F, 0.9802F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 66).addBox(-0.1915F, -0.1108F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.326F, -0.3853F, 0.7215F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(42, 0).addBox(-0.8672F, 0.0934F, -0.3717F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.4299F, -5.9335F, 0.2856F, -0.3008F, -0.592F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 0).addBox(-0.6672F, 0.0934F, -0.3717F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.4299F, -5.9335F, 0.6443F, -0.8242F, -1.1631F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(37, 41).addBox(-0.2672F, 0.0934F, -0.3717F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.4299F, -5.9335F, 0.449F, -0.6198F, -0.8917F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(24, 41).addBox(-0.4767F, 0.0201F, -0.2306F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.9299F, -7.0335F, 0.2996F, -0.092F, -0.6205F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(11, 41).addBox(-0.7757F, -0.0361F, -0.4507F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.1299F, -8.5335F, 0.2871F, -0.1306F, -0.4307F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 67).addBox(4.1184F, -2.3729F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.4873F, -0.1137F, 1.3488F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 38).addBox(4.2579F, -2.5396F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.4679F, -0.1446F, 1.3123F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(54, 9).addBox(1.9117F, -0.674F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.3817F, -0.3121F, 0.9371F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(22, 65).addBox(0.021F, -0.1562F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.2894F, -0.3988F, 0.6734F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(63, 60).addBox(4.0431F, -2.5609F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.4894F, -0.1322F, 1.3148F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(53, 34).addBox(1.7223F, -0.7776F, -0.4087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.4073F, -0.3083F, 0.9444F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(66, 20).addBox(-0.1351F, -0.3053F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.316F, -0.4015F, 0.6833F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(45, 72).addBox(0.0F, -2.0686F, -0.0381F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -6.9528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(64, 71).addBox(0.0F, -1.8408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -1.0528F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(39, 71).addBox(0.0F, -1.8594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -2.9528F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(12, 72).addBox(0.0F, -1.8938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, -4.8528F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(67, 71).addBox(-0.001F, -2.9518F, -0.2638F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -9.0528F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 39).addBox(0.0F, -0.999F, -0.0143F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -9.0528F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(9, 72).addBox(-0.001F, -3.081F, -0.1627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8949F, -10.9528F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 19).addBox(0.0F, -1.1002F, 0.0233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8949F, -10.9528F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.9361F, -0.0783F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 9.6419F, -9.0717F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -10.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9932F, -10.7795F, 0.0189F, 0.3926F, 0.0072F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(73, 42).addBox(-1.0F, -1.9239F, -0.6353F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1888F, -1.2421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 72).addBox(-1.001F, -3.4889F, -1.3348F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1888F, -1.2421F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(72, 62).addBox(-0.001F, -3.2727F, -0.2609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5094F, -3.8777F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 73).addBox(0.0F, -1.2891F, 0.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5094F, -3.8777F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(46, 67).addBox(0.0F, -2.3187F, 0.041F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5094F, -5.5777F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(36, 7).mirror().addBox(-4.7416F, 0.0295F, -0.5152F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.2332F, 0.2495F, 0.2827F, 0.0902F, 0.3822F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-3.1809F, 0.0041F, -0.4843F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9332F, -3.6505F, 0.2674F, 0.2545F, 0.3736F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-3.455F, 0.1676F, -0.4709F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9332F, -1.7505F, 0.2766F, 0.1685F, 0.4232F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(-2.1F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.2332F, -5.6505F, 0.2685F, 0.3265F, 0.3753F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(38, 46).mirror().addBox(-0.1473F, -1.6319F, 0.268F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, -0.9163F, -0.1745F, 0.1309F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(39, 21).mirror().addBox(-0.1473F, -1.8222F, -0.5251F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 0.1658F, -0.1745F, 0.1309F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(-0.1473F, -1.9397F, 0.101F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 0.8465F, -0.1745F, 0.1309F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-5.7222F, -0.3953F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8888F, -4.8421F, -0.5103F, 0.2831F, -1.1964F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 43).mirror().addBox(-2.7318F, 0.3227F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8888F, -4.8421F, -0.4265F, 0.4019F, -0.9485F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-1.9184F, 0.1789F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.3045F, 0.4159F, -0.7309F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(-4.8993F, -0.3237F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.4005F, 0.325F, -0.9945F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-6.3834F, -2.2123F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.4894F, 0.1501F, -1.367F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 13).mirror().addBox(-6.8019F, -2.58F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.2421F, -0.5071F, 0.0646F, -1.3165F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.2421F, -0.4495F, 0.2515F, -0.9561F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(52, 50).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.2421F, -0.3738F, 0.3568F, -0.7047F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(28, 22).mirror().addBox(-0.1473F, -0.403F, -3.7469F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 1.0908F, -0.1745F, 0.1309F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-0.1473F, -1.4685F, -2.6926F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 1.5446F, -0.1745F, 0.1309F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-0.6674F, -0.3852F, -2.8919F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 1.1898F, 0.2608F, 0.0017F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.1473F, -0.9934F, -3.8077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.2582F, -5.1586F, 1.2828F, -0.1745F, 0.1309F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(18, 50).addBox(2.7222F, -0.3953F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8888F, -4.8421F, -0.5103F, -0.2831F, 1.1964F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 43).addBox(-0.2682F, 0.3227F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8888F, -4.8421F, -0.4265F, -0.4019F, 0.9485F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(7, 67).addBox(-0.0816F, 0.1789F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.3045F, -0.4159F, 0.7309F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(57, 21).addBox(1.8993F, -0.3237F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.4005F, -0.325F, 0.9945F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(14, 67).addBox(4.3834F, -2.2123F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.4894F, -0.1501F, 1.367F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(63, 13).addBox(4.8019F, -2.58F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.2421F, -0.5071F, -0.0646F, 1.3165F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 52).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.2421F, -0.4495F, -0.2515F, 0.9561F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 50).addBox(-0.5254F, 0.1468F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.2421F, -0.3738F, -0.3568F, 0.7047F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(28, 22).addBox(-0.8527F, -0.403F, -3.7469F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 1.0908F, 0.1745F, -0.1309F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(38, 46).addBox(-0.8527F, -1.6319F, 0.268F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, -0.9163F, 0.1745F, -0.1309F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(39, 21).addBox(-0.8527F, -1.8222F, -0.5251F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 0.1658F, 0.1745F, -0.1309F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(39, 28).addBox(-0.8527F, -1.9397F, 0.101F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 0.8465F, 0.1745F, -0.1309F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(25, 2).addBox(-0.8527F, -1.4685F, -2.6926F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 1.5446F, 0.1745F, -0.1309F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(36, 2).addBox(-0.3326F, -0.3852F, -2.8919F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 1.1898F, -0.2608F, -0.0017F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 30).addBox(-0.8527F, -0.9934F, -3.8077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9527F, 2.2582F, -5.1586F, 1.2828F, 0.1745F, -0.1309F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(18, 48).addBox(-0.8191F, 0.0041F, -0.4843F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9332F, -3.6505F, 0.2674F, -0.2545F, -0.3736F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 7).addBox(-0.2584F, 0.0295F, -0.5152F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.2332F, 0.2495F, 0.2827F, -0.0902F, -0.3822F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(44, 39).addBox(-0.545F, 0.1676F, -0.4709F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9332F, -1.7505F, 0.2766F, -0.1685F, -0.4232F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 38).addBox(0.1F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.2332F, -5.6505F, 0.2685F, -0.3265F, -0.3753F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(11, 34).addBox(-0.5F, -0.6098F, 0.11F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7452F, -7.1887F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(15, 22).addBox(-0.5F, 0.7847F, 3.7296F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7452F, -7.1887F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.908F, 3.84F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0094F, -9.5777F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 6.509F, -6.6595F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(61, 43).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(61, 17).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 2.4677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(29, 43).addBox(-0.5F, -0.2F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 63).addBox(-0.0077F, -0.082F, -0.0437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.1673F, 0.5378F, 0.8464F, 0.0014F, -0.001F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 62).addBox(-0.0087F, -0.0823F, -0.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1673F, 0.5378F, 0.0261F, 0.0014F, -0.001F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(63, 0).addBox(-0.01F, -1.0076F, 0.0296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5673F, 0.0378F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(70, 11).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2754F, 1.9453F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(12, 62).addBox(0.0F, -0.2F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.7819F, 2.0166F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(49, 67).addBox(-0.4F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 0.6564F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r202 = leftarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.6969F, 0.2286F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(58, 6).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.4201F, 1.5708F, -0.4102F, -1.5708F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(58, 54).addBox(-1.9256F, -0.8299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.0702F, 1.5549F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(12, 56).addBox(-0.0335F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.6664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm4 = leftarm2.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(56, 59).addBox(-1.0F, 0.0601F, -0.6907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.5265F, 0.5065F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(20, 43).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 6.509F, -6.6595F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(61, 17).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8609F, 2.4677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(29, 43).mirror().addBox(-1.5F, -0.2F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5119F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.9923F, -0.082F, -0.0437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.1673F, 0.5378F, 0.8464F, -0.0014F, 0.001F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-0.9913F, -0.0823F, -0.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1673F, 0.5378F, 0.0261F, -0.0014F, 0.001F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.99F, -1.0076F, 0.0296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5673F, 0.0378F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2754F, 1.9453F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(12, 62).mirror().addBox(-1.0F, -0.2F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.7819F, 2.0166F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.6F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.11F, 0.6564F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r215 = rightarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 3.6969F, 0.2286F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.4201F, 1.5708F, 0.4102F, 1.5708F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(58, 54).mirror().addBox(0.9256F, -0.8299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.136F, -0.0702F, 1.5549F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(12, 56).mirror().addBox(-0.9665F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.6664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm4 = rightarm2.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-1.0F, 0.0601F, -0.6907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.5265F, 0.5065F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(20, 43).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4459F, -6.2693F, 0.5354F, 0.2648F, 0.154F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(54, 17).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9638F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(62, 36).mirror().addBox(-1.8909F, -0.1177F, -0.3326F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0079F, -0.5857F, -0.4567F, -0.0394F, -1.0124F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(-4.796F, -0.603F, -0.3326F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0079F, -0.5857F, -0.4338F, -0.1527F, -1.2497F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(50, 41).addBox(1.796F, -0.603F, -0.3326F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0079F, -0.5857F, -0.4338F, 0.1527F, 1.2497F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(62, 36).addBox(-0.1091F, -0.1177F, -0.3326F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0079F, -0.5857F, -0.4567F, 0.0394F, 1.0124F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(11, 30).addBox(0.0F, -1.7605F, -0.0674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5873F, -0.9213F, -0.5498F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.007F, -2.0249F, -0.2648F, 0.2954F, -0.0788F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(28, 54).addBox(-0.5F, -1.1F, 2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(44, 34).addBox(-0.5F, -0.5932F, -2.956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5179F, -1.7365F, -0.7772F, 0.4815F, -0.0579F));

		PartDefinition cube_r227 = neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(64, 23).addBox(0.0F, -1.2041F, -0.3284F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0824F, -1.7248F, 0.288F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(31, 63).addBox(-0.5F, -2.4F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1932F, -2.456F, -0.3525F, 0.4241F, 0.0472F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, 0.0912F, -1.9602F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9422F, -0.7567F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(54, 45).addBox(-0.5F, 0.4449F, -1.2056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 71).addBox(0.5F, 0.1449F, -1.0056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5344F, -3.1244F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(57, 1).mirror().addBox(-1.0F, 0.0581F, -0.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3702F, -0.1129F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.8F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0702F, -1.1129F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(57, 1).addBox(0.0F, 0.0581F, -0.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3702F, -0.1129F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(56, 0).addBox(-0.2F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0702F, -1.1129F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 54).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7176F, -1.4225F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(55, 29).addBox(0.0F, 0.5552F, -0.007F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, -1.6F, -3.2F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(36, 67).addBox(-0.502F, 0.0196F, -2.0556F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7422F, -1.6567F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(44, 54).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.7131F, -4.4328F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(17, 56).addBox(-0.5F, -0.0054F, -0.0649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9097F, -4.9437F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(45, 50).addBox(-2.5F, -0.151F, -1.9309F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.8F, -3.8F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(21, 52).addBox(-2.5F, -0.0213F, 0.0529F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 1.7F, -4.2F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(11, 43).addBox(-2.5F, -0.0363F, -0.5684F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.8F, -3.7F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(45, 9).addBox(-1.0F, -1.996F, -1.8751F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3016F, -0.5296F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(49, 6).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.4016F, -2.2296F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(35, 56).addBox(-1.0F, -0.9769F, -0.9997F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.0168F, -2.9453F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(1, 46).addBox(-1.0F, -2.0733F, -0.9889F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.5168F, -2.2453F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(9, 48).addBox(-1.5F, -1.1552F, -0.9215F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.9168F, -1.5453F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(47, 2).addBox(-1.0F, -0.9F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.3493F, -1.7935F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(63, 9).addBox(-0.5F, -0.0341F, -0.0336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3656F, -3.5244F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(71, 48).addBox(0.5F, 0.0684F, 0.0751F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -2.5F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(42, 71).addBox(0.498F, -0.0276F, -0.0021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -3.0F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(31, 63).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -0.2F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.2742F, -9.7729F));

		PartDefinition cube_r252 = leftMaxilla.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 69).addBox(-0.2F, -0.6F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3385F, -2.9968F, 6.041F, 0.7104F, 0.1853F, 0.0618F));

		PartDefinition cube_r253 = leftMaxilla.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(37, 52).addBox(-0.0651F, -0.7789F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3385F, -3.3968F, 6.641F, 0.7802F, 0.1853F, 0.0618F));

		PartDefinition leftCanine = leftMaxilla.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8385F, -2.5968F, 6.041F, 0.0F, 0.0873F, -0.1222F));

		PartDefinition cube_r254 = leftCanine.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(68, 56).addBox(-0.1055F, -0.6564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 68).addBox(-0.1055F, -1.0564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition cube_r255 = leftCanine.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(68, 42).addBox(-0.1055F, -0.6564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(68, 45).addBox(-0.1055F, -1.0564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition cube_r256 = leftCanine.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 4).addBox(-0.6106F, -0.4154F, -0.0529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.0086F, 0.8111F, -0.0227F, 0.9722F, 0.1853F, 0.0618F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.2742F, -9.7729F));

		PartDefinition cube_r257 = rightMaxilla.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.8F, -0.6F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3385F, -2.9968F, 6.041F, 0.7104F, -0.1853F, -0.0618F));

		PartDefinition cube_r258 = rightMaxilla.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(37, 52).mirror().addBox(-0.9349F, -0.7789F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3385F, -3.3968F, 6.641F, 0.7802F, -0.1853F, -0.0618F));

		PartDefinition rightCanine = rightMaxilla.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8385F, -2.5968F, 6.041F, 0.0F, -0.0873F, 0.1222F));

		PartDefinition cube_r259 = rightCanine.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-0.8945F, -0.6564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 68).mirror().addBox(-0.8945F, -1.0564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition cube_r260 = rightCanine.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(68, 42).mirror().addBox(-0.8945F, -0.6564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(68, 45).mirror().addBox(-0.8945F, -1.0564F, -0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition cube_r261 = rightCanine.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-0.3894F, -0.4154F, -0.0529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0086F, 0.8111F, -0.0227F, 0.9722F, -0.1853F, -0.0618F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(0.9F, 0.3856F, 3.1765F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 50).addBox(-0.8266F, -0.5292F, -0.1037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.3716F, 0.5964F, -4.4114F, 0.7241F, -0.3144F, -0.4962F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 50).addBox(-0.8266F, -0.5292F, -0.1037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3716F, 0.5964F, -4.4114F, 1.143F, -0.3144F, -0.4962F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(42, 58).addBox(-0.9159F, -0.4467F, -1.7895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9716F, 1.8964F, -5.3114F, 0.6421F, 0.1542F, 0.3271F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(49, 58).addBox(-0.2009F, -0.1994F, -0.4422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3716F, 1.3964F, -5.3114F, 1.0567F, 0.1122F, 0.2955F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(5, 69).addBox(-0.9F, -0.9F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3561F, 1.4583F, -6.3282F, 1.9186F, -0.1911F, -0.1473F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(57, 23).addBox(-0.6371F, -0.1015F, -0.3435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1258F, 1.8409F, -7.0055F, 1.454F, -0.0435F, -0.173F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-0.9F, 0.3856F, 3.1765F));

		PartDefinition cube_r268 = rightOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.1734F, -0.5292F, -0.1037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.3716F, 0.5964F, -4.4114F, 0.7241F, 0.3144F, 0.4962F));

		PartDefinition cube_r269 = rightOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.1734F, -0.5292F, -0.1037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3716F, 0.5964F, -4.4114F, 1.143F, 0.3144F, 0.4962F));

		PartDefinition cube_r270 = rightOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(-0.0841F, -0.4467F, -1.7895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9716F, 1.8964F, -5.3114F, 0.6421F, -0.1542F, -0.3271F));

		PartDefinition cube_r271 = rightOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.7991F, -0.1994F, -0.4422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3716F, 1.3964F, -5.3114F, 1.0567F, -0.1122F, -0.2955F));

		PartDefinition cube_r272 = rightOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.1F, -0.9F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3561F, 1.4583F, -6.3282F, 1.9186F, 0.1911F, 0.1473F));

		PartDefinition cube_r273 = rightOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(57, 23).mirror().addBox(-0.3629F, -0.1015F, -0.3435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1258F, 1.8409F, -7.0055F, 1.454F, 0.0435F, 0.173F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.391F, -1.4509F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(24, 56).addBox(-1.0F, 0.7927F, 0.9818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.4771F, -3.9852F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(54, 72).mirror().addBox(0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4231F, 2.4456F, -2.6737F, -1.5388F, 0.027F, 0.0228F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-0.4654F, -0.8973F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4483F, 3.0562F, -3.7638F, -1.4835F, -0.384F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 56).mirror().addBox(-1.0F, -0.0048F, -0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(63, 56).addBox(1.2F, -0.0048F, -0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 2.1771F, -1.2852F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-1.0F, -0.144F, -0.9956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(17, 63).addBox(1.2F, -0.144F, -0.9956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 3.1771F, -1.2852F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(7, 52).addBox(1.9F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, 1.1782F, -0.312F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-1.0F, -1.7196F, -0.0127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(21, 67).addBox(1.4F, -1.7196F, -0.0127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3F, 2.2771F, -1.5852F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(25, 71).mirror().addBox(-1.0F, 0.6813F, -1.6433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 71).addBox(1.4F, 0.6813F, -1.6433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 3.3771F, 0.6148F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(70, 59).addBox(1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, 2.4617F, 0.2374F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 71).addBox(2.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3F, 0.5633F, 0.3648F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(31, 67).mirror().addBox(-1.1F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(31, 67).addBox(1.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -0.5229F, -0.3852F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-1.0F, 0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(41, 67).addBox(1.4F, 0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -0.5229F, -0.2852F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(70, 3).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.5864F, -4.6388F, -2.1576F, -0.2943F, 0.1905F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(54, 72).addBox(-0.5F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2231F, 2.4456F, -2.6737F, -1.5388F, -0.027F, -0.0228F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(70, 53).addBox(-0.5346F, -0.8973F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2483F, 3.0562F, -3.7638F, -1.4835F, 0.384F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(54, 69).mirror().addBox(-0.5058F, -0.8269F, -0.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3431F, 3.2139F, -3.8298F, -0.9431F, -0.349F, 0.2114F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-0.494F, -0.4464F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3431F, 3.2139F, -3.8298F, -1.7644F, -0.4188F, 0.2141F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-0.494F, -0.2416F, -0.2239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3431F, 3.2139F, -3.8298F, -2.7767F, -0.4188F, 0.2141F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(54, 69).addBox(-0.4942F, -0.8269F, -0.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1431F, 3.2139F, -3.8298F, -0.9431F, 0.349F, -0.2114F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(69, 34).addBox(-0.506F, -0.2416F, -0.2239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1431F, 3.2139F, -3.8298F, -2.7767F, 0.4188F, -0.2141F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(69, 31).addBox(-0.506F, -0.4464F, -0.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1431F, 3.2139F, -3.8298F, -1.7644F, 0.4188F, -0.2141F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(69, 25).addBox(-1.0F, 0.4964F, -0.061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.4771F, -3.9852F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(-0.5028F, -0.4747F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(68, 0).mirror().addBox(-0.5028F, -0.4747F, -1.1107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0495F, 2.0135F, -4.8872F, -1.1139F, -0.3337F, -0.6419F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(68, 0).addBox(-0.4972F, -0.4747F, -1.1107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 68).addBox(-0.4972F, -0.4747F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1505F, 2.0135F, -4.8872F, -1.1139F, 0.3337F, 0.6419F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(70, 3).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 2.5864F, -4.6388F, -2.1576F, 0.2943F, -0.1905F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 29).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(73, 0).addBox(0.0F, -1.1103F, -0.214F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 8).addBox(0.0F, -1.0103F, 1.786F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.8018F, 0.122F, -0.1251F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.0075F, 0.1334F, -0.1129F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1176F, 3.895F, 0.2442F, 0.3455F, -0.0506F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 9).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1425F, 3.7909F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, -0.4601F, -0.2423F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0237F, 4.0501F, 0.5411F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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