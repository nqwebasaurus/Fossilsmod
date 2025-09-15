package fossils.fossils.client.blockentity.model.brightstoneus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrightstoneusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
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
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart chest2;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public BrightstoneusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
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
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.chest2 = this.chest.getChild("chest2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone5 = this.chest2.getChild("bone5");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.heads = this.neck6.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0752F, 6.0011F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-4.0F, 1.0F, 0.0F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 18).addBox(1.0F, 1.0F, 0.0F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 124).addBox(-0.004F, -5.8382F, -0.9676F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9995F, 7.071F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 124).addBox(0.0F, -6.7382F, -0.0676F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.57F, 7.8619F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 71).addBox(-0.004F, 0.0F, -5.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7458F, 0.988F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 56).addBox(0.0F, -1.6F, -1.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9202F, 2.2034F, -0.1658F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7508F, -2.0884F, 3.0703F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(117, 95).addBox(-0.1328F, 2.1025F, -8.4104F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-3.4098F, 9.0359F, 3.34F, -1.3278F, -0.2209F, 0.2376F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 133).addBox(-0.0643F, -2.9309F, -5.7173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.4098F, 9.0359F, 3.34F, -0.3163F, -0.2094F, 0.2411F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(103, 119).addBox(-0.0643F, -8.4139F, 0.0855F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.4098F, 9.0359F, 3.34F, 0.9054F, -0.2094F, 0.2411F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 82).addBox(-0.5F, -0.4F, -2.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0328F, 3.6986F, -6.7295F, 0.3054F, -0.3229F, 0.0F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(126, 90).addBox(-0.5092F, 0.4099F, -3.5533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, -0.0815F, -0.1213F, 0.0493F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(113, 113).addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3366F, -1.5463F, -5.2556F, -0.7797F, -0.1213F, 0.0493F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(131, 20).addBox(-0.5211F, -0.29F, -8.6038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.3044F, -0.1299F, 0.016F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5211F, -1.4404F, -6.6303F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.4789F, -0.1299F, 0.016F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 52).addBox(2.5381F, -1.9965F, -7.5353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.5264F, 0.173F, 0.1902F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(115, 85).addBox(0.7958F, -1.9965F, -6.4623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.5185F, -0.0542F, 0.0596F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 117).addBox(-0.5211F, -1.9965F, -6.6084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(140, 73).addBox(-0.5211F, -1.9965F, -7.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.5226F, -0.1299F, 0.016F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(108, 69).addBox(-0.5211F, -0.6574F, -4.0705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, 0.1735F, -0.1299F, 0.016F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(108, 30).addBox(-0.4093F, -0.1922F, -2.2415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(108, 26).addBox(-0.4093F, -0.1922F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.5883F, -0.0985F, -0.1147F, 0.1193F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 78).addBox(-0.5F, -0.5F, -1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.041F, -1.2017F, 2.277F, -0.2421F, 0.1007F, 0.078F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 116).addBox(-0.05F, -0.5F, -1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.041F, -1.2017F, 2.277F, -0.2415F, -0.0688F, 0.1198F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 114).addBox(-0.5623F, -0.446F, -0.1794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2492F, -1.6141F, 1.1639F, -0.2474F, 0.2277F, 0.0459F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(104, 127).addBox(-0.225F, -0.725F, -2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2449F, -1.2168F, 1.6382F, -0.0964F, -0.0697F, 0.1551F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(90, 8).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7492F, -2.0624F, -2.7821F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 118).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.465F, -1.5874F, -0.0327F, -0.0884F, 0.1888F, 0.0946F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(137, 13).addBox(-0.5898F, -4.0927F, 4.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(90, 125).addBox(-0.5898F, -4.0927F, 3.4459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.5098F, 9.6692F, 5.1207F, -1.8307F, 0.073F, 0.0073F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(125, 72).addBox(-0.5898F, -6.8184F, 0.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.5098F, 9.6692F, 5.1207F, -2.5289F, 0.073F, 0.0073F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(80, 104).addBox(-0.5898F, -0.7042F, 2.5391F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.5098F, 9.6692F, 5.1207F, -1.089F, 0.073F, 0.0073F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(31, 112).addBox(-0.0307F, -0.1361F, -0.1947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5098F, 9.6692F, 5.1207F, -0.8778F, 0.033F, 0.2153F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 106).addBox(-0.2325F, -0.8831F, -0.2038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.7098F, 7.4859F, 1.79F, -0.7918F, 0.0041F, 0.2701F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 78).addBox(-0.0643F, -0.6956F, -8.1932F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4098F, 9.0359F, 3.34F, -0.8486F, -0.2094F, 0.2411F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(75, 9).addBox(-0.5F, -1.2F, -2.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2508F, 3.3489F, -4.1049F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(110, 44).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.3841F, 3.8968F, -5.2437F, -0.3468F, -0.3183F, 0.0946F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(95, 66).addBox(-0.4977F, -0.1348F, -6.2567F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.9532F, 7.2132F, -1.4614F, -0.7831F, -0.3183F, 0.0946F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 97).addBox(-0.4977F, -0.0319F, -6.2353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.9532F, 7.2132F, -1.4614F, -0.853F, -0.3183F, 0.0946F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(97, 127).addBox(-0.4977F, -1.3184F, 3.2511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9532F, 7.2132F, -1.4614F, -0.9315F, -0.3183F, 0.0946F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(117, 55).addBox(-0.4977F, -0.1056F, 0.8187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.9532F, 7.2132F, -1.4614F, -0.5824F, -0.3183F, 0.0946F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(116, 73).addBox(-0.4977F, -0.2306F, -1.7198F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9532F, 7.2132F, -1.4614F, -0.7133F, -0.3183F, 0.0946F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(126, 59).addBox(-0.7088F, 1.3119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1613F, 2.1828F, -5.6872F, -2.5569F, -0.3229F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(104, 108).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.9068F, 4.2101F, -9.5376F, -2.3387F, -0.3229F, 0.0F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 106).addBox(-0.5F, -1.375F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5298F, 2.437F, -11.3996F, -2.2078F, -0.3229F, 0.0F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(140, 22).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.615F, 1.5587F, -11.6542F, -1.2915F, -0.3229F, 0.0F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 140).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.615F, 1.5587F, -11.6542F, -2.1642F, -0.3229F, 0.0F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(138, 19).addBox(-0.5F, 0.35F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8456F, 0.834F, -12.3433F, 0.192F, -0.3229F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(126, 28).addBox(-0.5F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1268F, 2.4827F, -10.195F, -0.5934F, -0.3229F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(126, 43).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1268F, 2.4827F, -10.195F, -0.3316F, -0.3229F, 0.0F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 44).addBox(-0.7088F, -0.5053F, -3.9835F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1613F, 2.1828F, -5.6872F, 0.1047F, -0.3229F, 0.0F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(137, 7).addBox(-0.7088F, -1.0858F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1613F, 2.1828F, -5.6872F, 0.7243F, -0.3229F, 0.0F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 35).addBox(-0.7088F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1613F, 2.1828F, -5.6872F, 0.3316F, -0.3229F, 0.0F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 12).addBox(4.0F, -0.0054F, -4.1615F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(99, 44).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0051F, -0.6949F, 0.1594F, 0.3187F, 0.2055F, -0.0405F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(22, 94).addBox(-0.5F, -0.575F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.255F, -0.4382F, 1.3072F, -0.1613F, 0.2055F, -0.0405F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.7508F, -2.0884F, 3.0703F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(117, 95).mirror().addBox(-0.8671F, 2.1025F, -8.4104F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(3.4098F, 9.0359F, 3.34F, -1.3278F, 0.2209F, -0.2376F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 133).mirror().addBox(-0.9357F, -2.9309F, -5.7173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.4098F, 9.0359F, 3.34F, -0.3163F, 0.2094F, -0.2411F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(103, 119).mirror().addBox(-0.9357F, -8.4139F, 0.0855F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.4098F, 9.0359F, 3.34F, 0.9054F, 0.2094F, -0.2411F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 82).mirror().addBox(-0.5F, -0.4F, -2.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0328F, 3.6986F, -6.7295F, 0.3054F, 0.3229F, 0.0F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(126, 90).mirror().addBox(-0.4908F, 0.4099F, -3.5533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, -0.0815F, 0.1213F, -0.0493F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(113, 113).mirror().addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3366F, -1.5463F, -5.2556F, -0.7797F, 0.1213F, -0.0493F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(131, 20).mirror().addBox(-0.4789F, -0.29F, -8.6038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.3044F, 0.1299F, -0.016F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.4789F, -1.4404F, -6.6303F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.4789F, 0.1299F, -0.016F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(95, 52).mirror().addBox(-3.5381F, -1.9965F, -7.5353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.5264F, -0.173F, -0.1902F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(115, 85).mirror().addBox(-1.7958F, -1.9965F, -6.4623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.5185F, 0.0542F, -0.0596F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(25, 117).mirror().addBox(-0.4789F, -1.9965F, -6.6084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(140, 73).mirror().addBox(-0.4789F, -1.9965F, -7.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.5226F, 0.1299F, -0.016F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(108, 69).mirror().addBox(-2.4789F, -0.6574F, -4.0705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, 0.1735F, 0.1299F, -0.016F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-2.5907F, -0.1922F, -2.2415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(108, 26).mirror().addBox(-2.5907F, -0.1922F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.5883F, -0.0985F, 0.1147F, -0.1193F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(116, 78).mirror().addBox(-0.5F, -0.5F, -1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.041F, -1.2017F, 2.277F, -0.2421F, -0.1007F, -0.078F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(78, 116).mirror().addBox(-0.95F, -0.5F, -1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.041F, -1.2017F, 2.277F, -0.2415F, 0.0688F, -0.1198F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 114).mirror().addBox(-0.4377F, -0.446F, -0.1794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2492F, -1.6141F, 1.1639F, -0.2474F, -0.2277F, -0.0459F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(104, 127).mirror().addBox(-0.775F, -0.725F, -2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2449F, -1.2168F, 1.6382F, -0.0964F, 0.0697F, -0.1551F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7492F, -2.0624F, -2.7821F, -0.1731F, -0.0227F, -0.1289F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 118).mirror().addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.465F, -1.5874F, -0.0327F, -0.0884F, -0.1888F, -0.0946F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(137, 13).mirror().addBox(-0.4102F, -4.0927F, 4.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(90, 125).mirror().addBox(-0.4102F, -4.0927F, 3.4459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 9.6692F, 5.1207F, -1.8307F, -0.073F, -0.0073F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(125, 72).mirror().addBox(-0.4102F, -6.8184F, 0.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 9.6692F, 5.1207F, -2.5289F, -0.073F, -0.0073F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(80, 104).mirror().addBox(-0.4102F, -0.7042F, 2.5391F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 9.6692F, 5.1207F, -1.089F, -0.073F, -0.0073F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(31, 112).mirror().addBox(-0.9693F, -0.1361F, -0.1947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 9.6692F, 5.1207F, -0.8778F, -0.033F, -0.2153F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.7675F, -0.8831F, -0.2038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.7098F, 7.4859F, 1.79F, -0.7918F, -0.0041F, -0.2701F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(32, 78).mirror().addBox(-0.9357F, -0.6956F, -8.1932F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4098F, 9.0359F, 3.34F, -0.8486F, 0.2094F, -0.2411F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(-0.5F, -1.2F, -2.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 3.3489F, -4.1049F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(110, 44).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.3841F, 3.8968F, -5.2437F, -0.3468F, 0.3183F, -0.0946F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(95, 66).mirror().addBox(-0.5024F, -0.1348F, -6.2567F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 7.2132F, -1.4614F, -0.7831F, 0.3183F, -0.0946F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-0.5024F, -0.0319F, -6.2353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 7.2132F, -1.4614F, -0.853F, 0.3183F, -0.0946F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(97, 127).mirror().addBox(-0.5024F, -1.3184F, 3.2511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 7.2132F, -1.4614F, -0.9315F, 0.3183F, -0.0946F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(-0.5024F, -0.1056F, 0.8187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 7.2132F, -1.4614F, -0.5824F, 0.3183F, -0.0946F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(116, 73).mirror().addBox(-0.5024F, -0.2306F, -1.7198F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 7.2132F, -1.4614F, -0.7133F, 0.3183F, -0.0946F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(126, 59).mirror().addBox(-0.2912F, 1.3119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 2.1828F, -5.6872F, -2.5569F, 0.3229F, 0.0F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(104, 108).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.9068F, 4.2101F, -9.5376F, -2.3387F, 0.3229F, 0.0F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(122, 106).mirror().addBox(-0.5F, -1.375F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5298F, 2.437F, -11.3996F, -2.2078F, 0.3229F, 0.0F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(140, 22).mirror().addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.615F, 1.5587F, -11.6542F, -1.2915F, 0.3229F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(59, 140).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.615F, 1.5587F, -11.6542F, -2.1642F, 0.3229F, 0.0F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(138, 19).mirror().addBox(-0.5F, 0.35F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8456F, 0.834F, -12.3433F, 0.192F, 0.3229F, 0.0F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(126, 28).mirror().addBox(-0.5F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1268F, 2.4827F, -10.195F, -0.5934F, 0.3229F, 0.0F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(126, 43).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1268F, 2.4827F, -10.195F, -0.3316F, 0.3229F, 0.0F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(86, 44).mirror().addBox(-0.2912F, -0.5053F, -3.9835F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 2.1828F, -5.6872F, 0.1047F, 0.3229F, 0.0F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(137, 7).mirror().addBox(-0.2912F, -1.0858F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 2.1828F, -5.6872F, 0.7243F, 0.3229F, 0.0F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(90, 35).mirror().addBox(-0.2912F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 2.1828F, -5.6872F, 0.3316F, 0.3229F, 0.0F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-5.0F, -0.0054F, -4.1615F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(99, 44).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0051F, -0.6949F, 0.1594F, 0.3187F, -0.2055F, 0.0405F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(-0.5F, -0.575F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -0.4382F, 1.3072F, -0.1613F, -0.2055F, 0.0405F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 0.5447F, -1.1177F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(131, 98).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(98, 14).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 86).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(80, 90).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(106, 85).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(83, 18).addBox(-1.9F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(69, 119).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(40, 57).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(119, 32).addBox(-1.9F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(62, 83).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(35, 97).addBox(-1.5F, -0.5444F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(73, 28).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3064F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(69, 45).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -2.9933F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 0.5447F, -1.1177F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(100, 131).addBox(-0.5F, -9.7343F, -6.3198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(46, 98).addBox(-1.0F, -5.4F, -1.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(71, 90).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(9, 92).addBox(-1.0F, -10.7937F, -6.8715F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(22, 108).addBox(-1.0F, -8.799F, -6.8693F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(9, 84).addBox(-0.1F, -0.2745F, -2.1999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3652F, 0.7178F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(119, 26).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(16, 120).addBox(-0.5F, 7.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(70, 101).addBox(-0.5F, -3.0F, -0.6F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(22, 101).addBox(-1.0F, -1.5F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 14.0271F, -0.7882F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(119, 43).addBox(-0.1F, -15.0978F, 4.4681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 84).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(59, 97).addBox(-1.5F, -0.5444F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.0475F, -0.9467F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(73, 35).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4414F, -0.3064F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(34, 71).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 46).addBox(-1.0F, -0.6317F, -8.0364F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(33, 125).addBox(0.01F, -5.2397F, -0.0012F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4945F, -7.093F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(60, 121).addBox(0.01F, -5.8045F, -0.1008F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -0.901F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(87, 120).addBox(0.01F, -5.6693F, -0.0073F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -3.001F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(3, 125).addBox(0.01F, -5.381F, 0.0285F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.57F, -5.0397F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(135, 71).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.6558F, -0.3016F, -0.1319F, -0.5076F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(136, 106).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.6558F, -0.2109F, -0.3062F, -0.9181F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(135, 69).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.6558F, -0.2251F, -0.0892F, -0.516F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(136, 104).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.6558F, -0.1564F, -0.2365F, -0.9327F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(135, 67).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3449F, -4.6558F, -0.1871F, -0.0676F, -0.519F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(136, 102).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3449F, -4.6558F, -0.1299F, -0.2014F, -0.9385F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(136, 100).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3449F, -6.6558F, -0.0779F, -0.1307F, -0.9471F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(31, 135).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3449F, -6.6558F, -0.1113F, -0.0242F, -0.5225F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(136, 106).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.6558F, -0.2109F, 0.3062F, 0.9181F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(135, 71).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.6558F, -0.3016F, 0.1319F, 0.5076F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(136, 104).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.6558F, -0.1564F, 0.2365F, 0.9327F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(135, 69).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.6558F, -0.2251F, 0.0892F, 0.516F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(136, 102).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3449F, -4.6558F, -0.1299F, 0.2014F, 0.9385F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(135, 67).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3449F, -4.6558F, -0.1871F, 0.0676F, 0.519F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 135).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3449F, -6.6558F, -0.1113F, 0.0242F, 0.5225F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(136, 100).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3449F, -6.6558F, -0.0779F, 0.1307F, 0.9471F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -7.8319F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 65).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6229F, -0.2045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(108, 131).addBox(0.01F, -4.9449F, 0.0356F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2944F, -1.1537F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(6, 135).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.5538F, -0.6239F, 0.0401F, 0.0629F, -0.5195F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(136, 98).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.5538F, -0.6239F, 0.0237F, 0.0114F, -0.9532F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(122, 116).mirror().addBox(-4.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.0486F, 0.192F, -1.3861F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(136, 88).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.1257F, 0.1534F, -0.9447F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(135, 2).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.1931F, 0.1485F, -0.5033F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(84, 135).mirror().addBox(-5.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7537F, -4.2239F, 0.0756F, 0.3291F, -1.3791F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(136, 86).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7537F, -4.2239F, 0.2103F, 0.2658F, -0.9271F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7537F, -4.2239F, 0.3182F, 0.2145F, -0.4807F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(136, 98).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.5538F, -0.6239F, 0.0237F, -0.0114F, 0.9532F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(6, 135).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.5538F, -0.6239F, 0.0401F, -0.0629F, 0.5195F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(135, 2).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.1931F, -0.1485F, 0.5033F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(136, 88).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.1257F, -0.1534F, 0.9447F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(122, 116).addBox(3.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.0486F, -0.192F, 1.3861F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(135, 0).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7537F, -4.2239F, 0.3182F, -0.2145F, 0.4807F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(136, 86).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7537F, -4.2239F, 0.2103F, -0.2658F, 0.9271F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(84, 135).addBox(3.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7537F, -4.2239F, 0.0756F, -0.3291F, 1.3791F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(105, 131).addBox(0.01F, -4.9967F, -0.0328F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4294F, -2.9781F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(42, 131).addBox(0.01F, -4.9561F, -0.0186F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9871F, -4.9347F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4771F, -5.8045F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(92, 129).addBox(0.01F, -0.4216F, -0.4715F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5999F, -1.5938F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(17, 126).addBox(0.0F, -5.1991F, -0.1146F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.674F, -2.8132F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(109, 19).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9766F, -0.3194F, 0.0652F, 0.2777F, -1.3822F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(13, 136).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9766F, -0.3194F, 0.1781F, 0.2238F, -0.9349F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(134, 118).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9766F, -0.3194F, 0.2709F, 0.1901F, -0.4902F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(134, 116).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5767F, -2.2194F, 0.366F, 0.2385F, -0.47F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(132, 135).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5767F, -2.2194F, 0.2432F, 0.3076F, -0.9178F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-9.0583F, -2.3736F, -0.2407F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5767F, -2.2194F, 0.0864F, 0.3805F, -1.3753F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(134, 118).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9766F, -0.3194F, 0.2709F, -0.1901F, 0.4902F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(13, 136).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9766F, -0.3194F, 0.1781F, -0.2238F, 0.9349F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(109, 19).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9766F, -0.3194F, 0.0652F, -0.2777F, 1.3822F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(58, 28).addBox(3.0583F, -2.3736F, -0.2407F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5767F, -2.2194F, 0.0864F, -0.3805F, 1.3753F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(132, 135).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5767F, -2.2194F, 0.2432F, -0.3076F, 0.9178F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(134, 116).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5767F, -2.2194F, 0.366F, -0.2385F, 0.47F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(92, 74).addBox(-1.0F, 0.0F, -10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, 5.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7998F, -3.5913F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(63, 56).addBox(-1.0F, 0.0855F, 0.0911F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(14, 126).addBox(0.01F, -5.445F, -0.009F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1027F, -0.8792F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(20, 126).addBox(0.0F, -5.5168F, 0.0023F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1119F, -2.3853F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 129).addBox(0.0F, -5.4473F, -0.0044F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4092F, -3.8814F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.1053F, 0.4661F, -1.3676F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(133, 96).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.3002F, 0.3764F, -0.8986F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 127).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.4468F, 0.2772F, -0.4493F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-11.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.1133F, 0.5002F, -1.3638F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(133, 94).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.3238F, 0.4036F, -0.8897F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(132, 80).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.4797F, 0.2922F, -0.4401F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(132, 78).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.5128F, 0.307F, -0.4303F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(133, 92).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.348F, 0.4306F, -0.8799F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.1217F, 0.5344F, -1.3597F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(132, 127).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.4468F, -0.2772F, 0.4493F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(133, 96).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.3002F, -0.3764F, 0.8986F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(98, 22).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.1053F, -0.4661F, 1.3676F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(132, 80).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.4797F, -0.2922F, 0.4401F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(133, 94).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.3238F, -0.4036F, 0.8897F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 26).addBox(3.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.1133F, -0.5002F, 1.3638F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(132, 78).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.5128F, -0.307F, 0.4303F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(133, 92).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.348F, -0.4306F, 0.8799F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(58, 26).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.1217F, -0.5344F, 1.3597F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5644F, 15.04F, -6.4134F, 0.2993F, 0.1298F, -0.0329F));

		PartDefinition cube_r191 = leftArm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(90, 120).addBox(0.0F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftArm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(34, 117).addBox(0.0419F, -15.7734F, -7.7276F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftArm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(133, 63).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r194 = leftArm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(26, 131).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, -0.06F, -0.4743F, -0.0768F));

		PartDefinition cube_r195 = leftArm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(125, 5).addBox(-0.2622F, -0.0364F, -0.1808F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r196 = leftArm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(71, 83).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(75, 101).addBox(-0.5909F, -0.1079F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(21, 47).addBox(-0.5909F, 1.8921F, -1.3717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2974F, 7.2157F, 2.8832F, -0.6034F, 0.2041F, -0.1214F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(53, 111).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0644F, 9.8313F, -0.4734F, 0.2688F, 0.2842F, 0.3313F));

		PartDefinition cube_r197 = leftArm3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(126, 47).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftArm3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(90, 14).addBox(12.3544F, -3.1239F, -11.9897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(119, 131).addBox(-0.5945F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5644F, 15.04F, -6.4134F, 0.8229F, -0.1298F, 0.0329F));

		PartDefinition cube_r199 = rightArm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(121, 0).addBox(-1.0F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightArm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(39, 118).addBox(-1.0419F, -15.7734F, -7.7276F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightArm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(79, 133).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r202 = rightArm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(95, 131).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, -0.06F, 0.4743F, 0.0768F));

		PartDefinition cube_r203 = rightArm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(125, 12).addBox(-0.7378F, -0.0364F, -0.1808F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r204 = rightArm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 121).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(103, 26).addBox(-0.4091F, -0.1079F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(64, 106).addBox(-0.4091F, 1.8921F, -1.3717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2974F, 7.2157F, 2.8832F, -1.0092F, -0.0333F, -0.1339F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 112).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0644F, 9.8313F, -0.4734F, 0.0113F, -0.3165F, -0.1985F));

		PartDefinition cube_r205 = rightArm3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(126, 51).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 0.0807F, -1.0948F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightArm3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(124, 86).addBox(-13.3544F, -3.1239F, -11.9897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(124, 131).addBox(-0.4055F, -0.2848F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.48F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7092F, -4.1814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(106, 92).addBox(-2.3511F, 0.6901F, -4.8568F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3511F, 12.6718F, -0.1255F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(117, 60).addBox(-1.8511F, 0.0777F, -2.2406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3511F, 12.6718F, -0.1255F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(52, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.396F, 13.2749F, 0.2501F, -0.0082F, -0.6335F, 0.1864F));

		PartDefinition cube_r210 = chest2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3655F, 13.2762F, 0.213F, -0.033F, -0.7292F, 0.1983F));

		PartDefinition cube_r211 = chest2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 13.2835F, 0.1588F, 0.0291F, -0.9209F, 0.2091F));

		PartDefinition cube_r212 = chest2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(47, 84).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4959F, 13.2183F, 0.269F, 0.2155F, -1.2383F, 0.0776F));

		PartDefinition cube_r213 = chest2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(116, 83).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.6013F, 0.344F, -0.402F));

		PartDefinition cube_r214 = chest2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(133, 90).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.4145F, 0.5004F, -0.85F));

		PartDefinition cube_r215 = chest2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-12.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.1453F, 0.6239F, -1.3468F));

		PartDefinition cube_r216 = chest2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(115, 106).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.5295F, 0.3142F, -0.4252F));

		PartDefinition cube_r217 = chest2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-15.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.126F, 0.5514F, -1.3575F));

		PartDefinition cube_r218 = chest2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(133, 84).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.3603F, 0.4441F, -0.8746F));

		PartDefinition cube_r219 = chest2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-14.0583F, -2.3736F, -0.2407F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.1315F, 0.5728F, -1.3546F));

		PartDefinition cube_r220 = chest2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.5504F, 0.3231F, -0.4187F));

		PartDefinition cube_r221 = chest2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(84, 133).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.376F, 0.4608F, -0.8678F));

		PartDefinition cube_r222 = chest2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(47, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4959F, 13.2183F, 0.269F, 0.2155F, 1.2383F, -0.0776F));

		PartDefinition cube_r223 = chest2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(17, 67).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3093F, 13.2835F, 0.1588F, 0.0291F, 0.9209F, -0.2091F));

		PartDefinition cube_r224 = chest2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3655F, 13.2762F, 0.213F, -0.033F, 0.7292F, -0.1983F));

		PartDefinition cube_r225 = chest2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.396F, 13.2749F, 0.2501F, -0.0082F, 0.6335F, -0.1864F));

		PartDefinition cube_r226 = chest2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0894F, 2.309F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(133, 84).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.3603F, -0.4441F, 0.8746F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(52, 43).addBox(3.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.126F, -0.5514F, 1.3575F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(115, 106).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.5295F, -0.3142F, 0.4252F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(79, 42).addBox(3.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.1453F, -0.6239F, 1.3468F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(133, 90).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.4145F, -0.5004F, 0.85F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(116, 83).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.6013F, -0.344F, 0.402F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 24).addBox(3.0583F, -2.3736F, -0.2407F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.1315F, -0.5728F, 1.3546F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(84, 133).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.376F, -0.4608F, 0.8678F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(24, 84).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.5504F, -0.3231F, 0.4187F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(60, 111).addBox(0.0F, -2.3427F, -0.3142F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7049F, -3.7906F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(3, 133).addBox(0.0F, -3.9418F, 0.4287F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8049F, -2.8906F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(36, 125).addBox(0.0F, -4.8345F, -0.025F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.829F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8762F, 6.198F, -2.5586F, -0.0002F, 0.0038F, -0.0872F));

		PartDefinition cube_r239 = bone2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(44, 106).addBox(-0.4F, -0.8F, -1.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3069F, 4.8941F, -2.2627F, 0.7276F, 0.3762F, 0.8375F));

		PartDefinition cube_r240 = bone2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(118, 12).addBox(-1.5F, -1.4836F, -1.7712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.2294F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r241 = bone2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(51, 124).addBox(-1.5F, -0.5836F, -0.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.2294F, 0.2628F, 0.2296F, 0.4552F));

		PartDefinition cube_r242 = bone2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(124, 19).addBox(-1.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.2294F, 2.0082F, 0.2296F, 0.4552F));

		PartDefinition cube_r243 = bone2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(80, 110).addBox(-0.5F, -0.875F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8433F, 1.6112F, -0.0274F, 1.1371F, 0.0511F, 0.2185F));

		PartDefinition cube_r244 = bone2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(17, 75).addBox(-1.0854F, -1.138F, -0.1046F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.7F, 0.6395F, 0.7459F, 0.8409F, -0.0533F, 0.0788F));

		PartDefinition cube_r245 = bone2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(45, 133).addBox(-1.0854F, 0.9F, 5.2109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.7F, 0.6395F, 0.7459F, 1.2074F, -0.0533F, 0.0788F));

		PartDefinition cube_r246 = bone2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(133, 43).addBox(-1.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.7F, 0.6395F, 0.7459F, 0.5092F, -0.0533F, 0.0788F));

		PartDefinition cube_r247 = bone2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(62, 74).addBox(-1.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.7F, 0.6395F, 0.7459F, 0.9107F, -0.0533F, 0.0788F));

		PartDefinition bone5 = chest2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8762F, 6.198F, -2.5586F, -0.0002F, -0.0038F, 0.0872F));

		PartDefinition cube_r248 = bone5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-0.6F, -0.8F, -1.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3069F, 4.8941F, -2.2627F, 0.7276F, -0.3762F, -0.8375F));

		PartDefinition cube_r249 = bone5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(118, 12).mirror().addBox(0.5F, -1.4836F, -1.7712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.2294F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r250 = bone5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(51, 124).mirror().addBox(0.5F, -0.5836F, -0.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.2294F, 0.2628F, -0.2296F, -0.4552F));

		PartDefinition cube_r251 = bone5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(124, 19).mirror().addBox(0.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.2294F, 2.0082F, -0.2296F, -0.4552F));

		PartDefinition cube_r252 = bone5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-0.5F, -0.875F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8433F, 1.6112F, -0.0274F, 1.1371F, -0.0511F, -0.2185F));

		PartDefinition cube_r253 = bone5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(0.0854F, -1.138F, -0.1046F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6395F, 0.7459F, 0.8409F, 0.0533F, -0.0788F));

		PartDefinition cube_r254 = bone5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(45, 133).mirror().addBox(0.0854F, 0.9F, 5.2109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6395F, 0.7459F, 1.2074F, 0.0533F, -0.0788F));

		PartDefinition cube_r255 = bone5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(133, 43).mirror().addBox(0.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6395F, 0.7459F, 0.5092F, 0.0533F, -0.0788F));

		PartDefinition cube_r256 = bone5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(0.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6395F, 0.7459F, 0.9107F, 0.0533F, -0.0788F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2986F, -3.9226F, 0.2271F, -0.0425F, -0.0098F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(140, 95).addBox(0.0F, -2.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 67).addBox(0.0F, -3.4F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 91).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(132, 131).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.517F, 0.3088F, -0.4291F));

		PartDefinition cube_r259 = neck4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.1227F, 0.5386F, -1.3592F));

		PartDefinition cube_r260 = neck4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(13, 134).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.3511F, 0.434F, -0.8786F));

		PartDefinition cube_r261 = neck4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.1024F, 0.4532F, -1.3689F));

		PartDefinition cube_r262 = neck4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(132, 133).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.2915F, 0.3662F, -0.9018F));

		PartDefinition cube_r263 = neck4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(132, 129).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.4346F, 0.2715F, -0.4527F));

		PartDefinition cube_r264 = neck4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(13, 134).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.3511F, -0.434F, 0.8786F));

		PartDefinition cube_r265 = neck4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(58, 30).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.1227F, -0.5386F, 1.3592F));

		PartDefinition cube_r266 = neck4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(132, 131).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.517F, -0.3088F, 0.4291F));

		PartDefinition cube_r267 = neck4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(132, 129).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.4346F, -0.2715F, 0.4527F));

		PartDefinition cube_r268 = neck4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(132, 133).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.2915F, -0.3662F, 0.9018F));

		PartDefinition cube_r269 = neck4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(98, 24).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.1024F, -0.4532F, 1.3689F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9591F, -3.3577F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(142, 12).addBox(0.0F, -2.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 122).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -4.0023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(133, 24).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -0.5663F, 0.1584F, 0.1294F, -0.6827F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(133, 34).mirror().addBox(-5.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -0.5663F, 0.0413F, 0.1534F, -1.5618F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(133, 82).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -0.5663F, 0.1025F, 0.1215F, -1.1224F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(133, 82).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -0.5663F, 0.1025F, -0.1215F, 1.1224F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(133, 34).addBox(3.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -0.5663F, 0.0413F, -0.1534F, 1.5618F));

		PartDefinition cube_r276 = neck3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(133, 24).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -0.5663F, 0.1584F, -0.1294F, 0.6827F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0111F, -1.4783F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(16, 142).addBox(0.0F, -0.622F, 3.9599F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(108, 51).addBox(-0.5F, -0.022F, 2.9599F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(133, 26).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.0947F, 0.1362F, -0.9505F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(25, 115).mirror().addBox(-2.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.042F, 0.1008F, -1.3885F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(25, 115).addBox(1.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.042F, -0.1008F, 1.3885F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(133, 26).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.0947F, -0.1362F, 0.9505F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(22, 142).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 142).addBox(0.0F, -0.5F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 0).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(133, 30).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6259F, -3.5344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r284 = neck.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(133, 28).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0259F, -1.4344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r285 = neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(133, 30).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6259F, -3.5344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition cube_r286 = neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(133, 28).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0259F, -1.4344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0148F, -3.4133F, -0.4652F, -0.1172F, -0.0385F));

		PartDefinition cube_r287 = neck5.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 142).addBox(0.0F, -0.3F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 34).addBox(0.0F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 0).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r288 = neck5.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(133, 32).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9111F, -3.621F, 0.272F, 0.8773F, -1.2208F));

		PartDefinition cube_r289 = neck5.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(31, 133).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r290 = neck5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(133, 32).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9111F, -3.621F, 0.272F, -0.8773F, 1.2208F));

		PartDefinition cube_r291 = neck5.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(31, 133).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.409F, -4.4395F, 0.3984F, -0.3338F, -0.2286F));

		PartDefinition cube_r292 = neck6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(111, 131).addBox(0.0F, -0.6F, -1.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5852F, -0.5172F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r293 = neck6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(108, 57).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck6.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8417F, -1.8748F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r294 = heads.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(138, 54).addBox(-0.8917F, -1.2877F, -1.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3916F, 5.61F, -10.9726F, 1.7933F, 0.0F, 0.0F));

		PartDefinition cube_r295 = heads.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(127, 116).addBox(-0.8917F, -0.4336F, -0.9761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(138, 48).addBox(-0.8917F, -0.9598F, -0.1437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3916F, 5.61F, -10.9726F, 1.0079F, 0.0F, 0.0F));

		PartDefinition cube_r296 = heads.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(138, 51).addBox(-0.8917F, -0.0289F, -0.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3916F, 6.1291F, -12.1434F, 1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r297 = heads.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(123, 38).addBox(-0.8917F, -0.0217F, -0.014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3916F, 4.3878F, -11.2995F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r298 = heads.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(129, 104).addBox(-0.5F, -0.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.2145F, -6.1313F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r299 = heads.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(133, 59).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.1289F, -9.4112F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r300 = heads.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(99, 139).addBox(-0.5F, -0.65F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.533F, -8.6051F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r301 = heads.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(122, 122).addBox(-0.5F, 0.0F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.3061F, -7.8079F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r302 = heads.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(138, 45).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2052F, -6.1654F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r303 = heads.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(130, 40).addBox(-1.0F, -0.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3477F, -5.3484F, 0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r304 = heads.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(109, 118).addBox(-1.5F, -0.9467F, -0.9925F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9194F, -0.3198F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r305 = heads.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(76, 121).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6588F, -2.6791F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r306 = heads.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(129, 124).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2923F, -3.6095F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r307 = heads.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(125, 80).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8461F, -4.5045F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r308 = heads.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(124, 83).addBox(-1.5F, -1.3866F, -1.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9194F, -0.3198F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r309 = heads.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(119, 69).addBox(-1.5F, -0.7019F, 0.6628F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7694F, 0.1052F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r310 = heads.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(40, 113).addBox(-1.5F, -0.004F, -0.0267F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7694F, 0.1052F, -0.7941F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(124, 100).addBox(-0.552F, -1.9614F, -1.8786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.3409F, -1.7867F, 0.107F, -0.0348F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(16, 112).addBox(-0.552F, -2.6136F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.3409F, -0.8268F, 0.107F, -0.0348F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(100, 114).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 0.3882F, -2.5742F, 0.6218F, 0.089F, -0.0043F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(16, 115).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7092F, 2.1365F, -5.0031F, 0.7114F, 0.1154F, 0.0186F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(138, 42).addBox(-0.6916F, -0.0531F, -1.6482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1084F, 6.3835F, -8.1888F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(129, 120).addBox(-0.9F, -0.5F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(129, 112).addBox(-0.5F, -0.5F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6439F, 0.968F, -2.5117F, 1.0378F, 0.5466F, 0.704F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(118, 118).addBox(-1.7052F, -0.3005F, -0.3133F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9908F, 0.5981F, -2.4611F, 0.6348F, -0.0924F, -0.0081F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(75, 18).addBox(-0.631F, -1.9866F, -0.5447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.3409F, -0.1149F, 0.1023F, -0.0417F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(105, 73).addBox(-0.5676F, -1.0733F, -1.7624F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.5847F, 0.0654F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(105, 7).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.9563F, 2.5276F, -0.7723F, 0.1047F, 0.1047F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(109, 13).addBox(-0.569F, -1.627F, 2.1937F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.1834F, 0.0654F, 0.0027F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(129, 108).addBox(-0.569F, -0.3302F, -1.367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.4888F, 0.0654F, 0.0027F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(115, 122).addBox(-0.569F, -1.4375F, 0.4463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.2706F, 0.0654F, 0.0027F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(120, 139).addBox(-0.5559F, -0.5714F, -1.7442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.6628F, 0.0805F, -0.0238F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(115, 139).addBox(-1.0122F, -0.9268F, -1.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6225F, 5.0605F, -5.0507F, 0.4001F, 0.1198F, -0.0239F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(110, 139).addBox(-0.9903F, -1.2597F, -1.5551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.6225F, 5.0605F, -5.0507F, 0.7957F, 0.1198F, 0.024F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(111, 127).addBox(-0.9903F, -0.7174F, -3.5308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6225F, 5.0605F, -5.0507F, 0.4466F, 0.1198F, 0.024F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(122, 111).addBox(-0.55F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.6911F, 1.2172F, -0.5821F, 0.5394F, 0.1593F, 0.1364F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5811F, -1.7861F, -1.0326F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.3409F, 0.2585F, 0.0938F, 0.003F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(135, 73).addBox(-0.4F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4412F, 2.4251F, 2.3237F, 0.4254F, 0.0737F, -0.0737F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(63, 133).addBox(0.3317F, 0.0032F, -1.6092F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.4363F, 0.0131F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(108, 122).addBox(0.3317F, -0.0481F, 0.4492F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0225F, 3.7605F, -3.9507F, 0.3142F, 0.0131F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 140).addBox(-0.4987F, -0.3589F, 0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 132).addBox(-0.4987F, -0.3589F, -0.462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, 0.8212F, 0.0085F, -0.013F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(88, 140).addBox(-0.4987F, -0.9814F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, 2.2175F, 0.0085F, -0.013F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(140, 83).addBox(-0.4987F, -1.1154F, -0.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, 2.8284F, 0.0085F, -0.013F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 140).addBox(-0.4987F, -0.2097F, -0.3757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, -2.0586F, 0.0085F, -0.013F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(140, 80).addBox(-0.4987F, -0.657F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, -1.0114F, 0.0085F, -0.013F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(78, 140).addBox(-0.4987F, -0.9473F, -0.1038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.2661F, 4.8319F, -7.2885F, 0.0358F, 0.0085F, -0.013F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(49, 140).addBox(-0.4749F, 0.0151F, -1.7288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, 0.8259F, 0.0768F, 0.0144F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(6, 131).addBox(-0.4749F, -0.5666F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, 1.175F, 0.0768F, 0.0144F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(130, 36).addBox(-0.4749F, -1.0512F, -1.4074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, 1.7422F, 0.0768F, 0.0144F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(44, 140).addBox(-0.4749F, -0.2039F, 0.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, 2.8767F, 0.0768F, 0.0144F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(132, 137).addBox(-0.4749F, 0.2597F, -1.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, -2.0975F, 0.0768F, 0.0144F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(136, 108).addBox(-0.4749F, -0.8295F, -1.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 136).addBox(-0.4749F, -0.9295F, -1.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, -1.1986F, 0.0768F, 0.0144F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(119, 136).addBox(-0.4749F, -1.7709F, -0.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, -0.0467F, 0.0768F, 0.0144F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(130, 4).addBox(-0.4749F, -0.5039F, -1.2264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, 1.1052F, 0.0768F, 0.0144F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(131, 86).addBox(-0.4749F, -1.3456F, -0.855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(94, 137).addBox(-0.4749F, -1.3456F, -0.455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2745F, 0.7569F, 1.1402F, -0.3783F, 0.0768F, 0.0144F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(137, 4).addBox(-0.4505F, 0.6922F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 2.0373F, 0.0975F, 0.0253F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(63, 137).addBox(-0.4505F, 0.1329F, 0.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 1.4962F, 0.0975F, 0.0253F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(55, 137).addBox(-0.4505F, -1.4128F, -0.1304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 0.1872F, 0.0975F, 0.0253F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(50, 137).addBox(-0.4505F, -1.3357F, -0.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 0.4927F, 0.0975F, 0.0253F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(45, 137).addBox(-0.4505F, -0.2811F, -1.3544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -0.86F, 0.0975F, 0.0253F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(137, 39).addBox(-0.4505F, 0.4515F, -0.3345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -1.9072F, 0.0975F, 0.0253F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(137, 36).addBox(-0.4505F, -0.3395F, 0.4618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -2.7798F, 0.0975F, 0.0253F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(34, 67).addBox(-0.4505F, -1.4023F, -0.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 2.3427F, 0.0975F, 0.0253F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(136, 111).addBox(-0.6255F, -0.3335F, -0.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 136).addBox(-0.4505F, -0.3335F, -0.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -1.0563F, 0.0975F, 0.0253F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(79, 137).addBox(-0.4505F, -0.3647F, -1.3851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 137).addBox(-0.4505F, -0.5397F, -1.3851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 1.2344F, 0.0975F, 0.0253F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(68, 137).addBox(-0.4505F, -0.5204F, 0.4522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -1.3399F, 0.0975F, 0.0253F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(26, 137).addBox(-0.4505F, -1.4906F, -0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, -2.6053F, 0.0975F, 0.0253F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(7, 122).addBox(-0.4505F, -0.9095F, -1.402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5566F, 1.1819F, -1.2086F, 3.0234F, 0.0975F, 0.0253F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(93, 102).addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6853F, 1.103F, -0.3755F, 0.4193F, 0.1268F, 0.0255F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(53, 118).addBox(-0.5703F, -2.246F, -2.2978F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.3409F, 1.0738F, 0.1268F, 0.0255F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(89, 137).addBox(0.1139F, -0.0576F, -0.5065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(84, 137).addBox(0.1139F, -0.0576F, -1.5065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1084F, 6.3835F, -8.1888F, 0.5975F, 0.1835F, 0.2084F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(104, 102).addBox(-0.5F, -0.8221F, 0.5988F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6971F, 3.0898F, -4.6908F, 0.5356F, 0.0348F, -0.0641F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(124, 136).addBox(-0.475F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(136, 123).addBox(-0.475F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6F, -0.2369F, -0.1772F, 0.3778F, 0.1136F, 0.045F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(136, 120).addBox(-0.6F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6F, 0.1517F, -1.05F, 0.468F, 0.1482F, 0.0745F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(6, 127).addBox(-0.5F, -0.716F, -2.6165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.6971F, 3.0898F, -4.6908F, 0.8672F, 0.0348F, -0.0641F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(126, 94).addBox(-0.5F, -0.6267F, -0.9839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.6971F, 3.0898F, -4.6908F, 0.7538F, 0.0348F, -0.0641F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(53, 106).addBox(-0.8646F, 0.1514F, -0.5613F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.1084F, 6.3835F, -8.1888F, 0.9712F, 0.0303F, -0.1544F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(124, 100).mirror().addBox(-0.448F, -1.9614F, -1.8786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.3409F, -1.7867F, -0.107F, 0.0348F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(16, 112).mirror().addBox(-0.448F, -2.6136F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.3409F, -0.8268F, -0.107F, 0.0348F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(100, 114).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.5F, 0.3882F, -2.5742F, 0.6218F, -0.089F, 0.0043F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(16, 115).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7092F, 2.1365F, -5.0031F, 0.7114F, -0.1154F, -0.0186F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(138, 42).mirror().addBox(-0.3083F, -0.0531F, -1.6482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.1084F, 6.3835F, -8.1888F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(129, 120).mirror().addBox(-0.1F, -0.5F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(129, 112).mirror().addBox(-0.5F, -0.5F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6439F, 0.968F, -2.5117F, 1.0378F, -0.5466F, -0.704F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(118, 118).mirror().addBox(-0.2948F, -0.3005F, -0.3133F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9908F, 0.5981F, -2.4611F, 0.6348F, 0.0924F, 0.0081F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.369F, -1.9866F, -0.5447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.3409F, -0.1149F, -0.1023F, 0.0417F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(105, 73).mirror().addBox(-0.4324F, -1.0733F, -1.7624F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.5847F, -0.0654F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(105, 7).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.9563F, 2.5276F, -0.7723F, 0.1047F, -0.1047F, 0.0F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(109, 13).mirror().addBox(-0.431F, -1.627F, 2.1937F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.1834F, -0.0654F, -0.0027F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(129, 108).mirror().addBox(-0.431F, -0.3302F, -1.367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.4888F, -0.0654F, -0.0027F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(115, 122).mirror().addBox(-0.431F, -1.4375F, 0.4463F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.2706F, -0.0654F, -0.0027F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(120, 139).mirror().addBox(-0.4441F, -0.5714F, -1.7442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.6628F, -0.0805F, 0.0238F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(115, 139).mirror().addBox(0.0122F, -0.9268F, -1.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6225F, 5.0605F, -5.0507F, 0.4001F, -0.1198F, 0.0239F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(110, 139).mirror().addBox(-0.0097F, -1.2597F, -1.5551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.6225F, 5.0605F, -5.0507F, 0.7957F, -0.1198F, -0.024F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(111, 127).mirror().addBox(-0.0097F, -0.7174F, -3.5308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6225F, 5.0605F, -5.0507F, 0.4466F, -0.1198F, -0.024F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(122, 111).mirror().addBox(-0.45F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(1.6911F, 1.2172F, -0.5821F, 0.5394F, -0.1593F, -0.1364F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.4189F, -1.7861F, -1.0326F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.3409F, 0.2585F, -0.0938F, -0.003F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(135, 73).mirror().addBox(-0.6F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4412F, 2.4251F, 2.3237F, 0.4254F, -0.0737F, 0.0737F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(63, 133).mirror().addBox(-0.3317F, 0.0032F, -1.6092F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.4363F, -0.0131F, 0.0F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(108, 122).mirror().addBox(-0.3317F, -0.0481F, 0.4492F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0225F, 3.7605F, -3.9507F, 0.3142F, -0.0131F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.5013F, -0.3589F, 0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 132).mirror().addBox(-0.5013F, -0.3589F, -0.462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, 0.8212F, -0.0085F, 0.013F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(88, 140).mirror().addBox(-0.5013F, -0.9814F, -0.6799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, 2.2175F, -0.0085F, 0.013F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(140, 83).mirror().addBox(-0.5013F, -1.1154F, -0.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, 2.8284F, -0.0085F, 0.013F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(83, 140).mirror().addBox(-0.5013F, -0.2097F, -0.3757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, -2.0586F, -0.0085F, 0.013F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(140, 80).mirror().addBox(-0.5013F, -0.657F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, -1.0114F, -0.0085F, 0.013F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(78, 140).mirror().addBox(-0.5013F, -0.9473F, -0.1038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.2661F, 4.8319F, -7.2885F, 0.0358F, -0.0085F, 0.013F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(49, 140).mirror().addBox(-0.5251F, 0.0151F, -1.7288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, 0.8259F, -0.0768F, -0.0144F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(6, 131).mirror().addBox(-0.5251F, -0.5666F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, 1.175F, -0.0768F, -0.0144F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-0.5251F, -1.0512F, -1.4074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, 1.7422F, -0.0768F, -0.0144F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(44, 140).mirror().addBox(-0.5251F, -0.2039F, 0.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, 2.8767F, -0.0768F, -0.0144F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(132, 137).mirror().addBox(-0.5251F, 0.2597F, -1.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, -2.0975F, -0.0768F, -0.0144F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(136, 108).mirror().addBox(-0.5251F, -0.8295F, -1.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 136).mirror().addBox(-0.5251F, -0.9295F, -1.5947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, -1.1986F, -0.0768F, -0.0144F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(119, 136).mirror().addBox(-0.5251F, -1.7709F, -0.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, -0.0467F, -0.0768F, -0.0144F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(130, 4).mirror().addBox(-0.5251F, -0.5039F, -1.2264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, 1.1052F, -0.0768F, -0.0144F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(131, 86).mirror().addBox(-0.5251F, -1.3456F, -0.855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(94, 137).mirror().addBox(-0.5251F, -1.3456F, -0.455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2745F, 0.7569F, 1.1402F, -0.3783F, -0.0768F, -0.0144F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(137, 4).mirror().addBox(-0.5495F, 0.6922F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 2.0373F, -0.0975F, -0.0253F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(63, 137).mirror().addBox(-0.5495F, 0.1329F, 0.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 1.4962F, -0.0975F, -0.0253F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(55, 137).mirror().addBox(-0.5495F, -1.4128F, -0.1304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 0.1872F, -0.0975F, -0.0253F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(50, 137).mirror().addBox(-0.5495F, -1.3357F, -0.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 0.4927F, -0.0975F, -0.0253F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(45, 137).mirror().addBox(-0.5495F, -0.2811F, -1.3544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -0.86F, -0.0975F, -0.0253F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(137, 39).mirror().addBox(-0.5495F, 0.4515F, -0.3345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -1.9072F, -0.0975F, -0.0253F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(137, 36).mirror().addBox(-0.5495F, -0.3395F, 0.4618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -2.7798F, -0.0975F, -0.0253F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-0.5495F, -1.4023F, -0.4177F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 2.3427F, -0.0975F, -0.0253F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(136, 111).mirror().addBox(-0.3745F, -0.3335F, -0.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 136).mirror().addBox(-0.5495F, -0.3335F, -0.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -1.0563F, -0.0975F, -0.0253F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(79, 137).mirror().addBox(-0.5495F, -0.3647F, -1.3851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 137).mirror().addBox(-0.5495F, -0.5397F, -1.3851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 1.2344F, -0.0975F, -0.0253F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(68, 137).mirror().addBox(-0.5495F, -0.5204F, 0.4522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -1.3399F, -0.0975F, -0.0253F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(26, 137).mirror().addBox(-0.5495F, -1.4906F, -0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, -2.6053F, -0.0975F, -0.0253F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(7, 122).mirror().addBox(-0.5495F, -0.9095F, -1.402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5566F, 1.1819F, -1.2086F, 3.0234F, -0.0975F, -0.0253F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(93, 102).mirror().addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.6853F, 1.103F, -0.3755F, 0.4193F, -0.1268F, -0.0255F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 118).mirror().addBox(-0.4297F, -2.246F, -2.2978F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.3409F, 1.0738F, -0.1268F, -0.0255F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(89, 137).mirror().addBox(-1.1139F, -0.0576F, -0.5065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(84, 137).mirror().addBox(-1.1139F, -0.0576F, -1.5065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.1084F, 6.3835F, -8.1888F, 0.5975F, -0.1835F, -0.2084F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(104, 102).mirror().addBox(-0.5F, -0.8221F, 0.5988F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6971F, 3.0898F, -4.6908F, 0.5356F, -0.0348F, 0.0641F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(124, 136).mirror().addBox(-0.525F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(136, 123).mirror().addBox(-0.525F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6F, -0.2369F, -0.1772F, 0.3778F, -0.1136F, -0.045F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(136, 120).mirror().addBox(-0.4F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6F, 0.1517F, -1.05F, 0.468F, -0.1482F, -0.0745F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(6, 127).mirror().addBox(-0.5F, -0.716F, -2.6165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.6971F, 3.0898F, -4.6908F, 0.8672F, -0.0348F, 0.0641F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(126, 94).mirror().addBox(-0.5F, -0.6267F, -0.9839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.6971F, 3.0898F, -4.6908F, 0.7538F, -0.0348F, 0.0641F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(53, 106).mirror().addBox(-1.1354F, 0.1514F, -0.5613F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.1084F, 6.3835F, -8.1888F, 0.9712F, -0.0303F, 0.1544F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2187F, -0.0574F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(137, 137).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4612F, 0.3265F, -5.1833F, 0.2271F, -0.0872F, -0.0038F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(11, 138).mirror().addBox(-0.3709F, 0.0172F, -0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 0.4626F, -7.7305F, 0.3841F, -0.0872F, -0.0038F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(85, 129).mirror().addBox(-0.3709F, -0.4328F, -2.2488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.329F, -5.4241F, 0.2532F, -0.0872F, -0.0038F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(63, 129).mirror().addBox(-0.0581F, -2.9735F, -2.7572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.6198F, 0.329F, -5.4241F, -1.8141F, -0.218F, -0.0097F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(139, 77).mirror().addBox(-0.0581F, -4.0417F, 0.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6198F, 0.329F, -5.4241F, -0.9414F, -0.218F, -0.0097F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(130, 8).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.9794F, -0.2374F, -1.7818F, -0.5924F, -0.218F, -0.0097F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(53, 129).mirror().addBox(-0.0581F, -4.1486F, -0.5426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.6198F, 0.329F, -5.4241F, -1.2905F, -0.218F, -0.0097F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(133, 55).mirror().addBox(-0.5F, -1.075F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8468F, 0.2848F, -2.3575F, 0.2367F, -0.218F, -0.0097F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(89, 115).mirror().addBox(-0.4476F, -0.3714F, -3.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, 0.1745F, -0.2182F, 0.0349F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(130, 12).mirror().addBox(-0.4476F, -0.6566F, -2.2331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(140, 28).mirror().addBox(-0.5452F, -0.2045F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(140, 28).mirror().addBox(-0.5452F, -0.2045F, -0.3406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, 0.0175F, -0.2182F, 0.0349F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(140, 31).mirror().addBox(-0.5452F, -0.4717F, -0.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 140).mirror().addBox(-0.5452F, -0.4717F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, -0.3752F, -0.2182F, 0.0349F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(73, 139).mirror().addBox(-0.5452F, -0.1434F, 0.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, 0.1484F, -0.2182F, 0.0349F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(26, 140).mirror().addBox(-0.5452F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, 0.8029F, -0.2182F, 0.0349F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(140, 25).mirror().addBox(-0.5452F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.0594F, 1.2392F, -0.2182F, 0.0349F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(55, 133).mirror().addBox(-0.2715F, -0.6517F, -2.5045F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.229F, -5.3241F, 0.2976F, -0.0847F, -0.0212F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(142, 37).mirror().addBox(-0.2754F, -0.6133F, -0.5504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.229F, -5.3241F, 0.2275F, -0.0859F, -0.0152F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(133, 51).mirror().addBox(-0.2754F, -0.6568F, 0.3804F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.229F, -5.3241F, 0.1228F, -0.0859F, -0.0152F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(139, 129).mirror().addBox(-0.4063F, -1.0471F, -2.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3948F, 0.979F, -7.2741F, 0.5858F, -0.0832F, -0.0263F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(39, 139).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1526F, 1.5137F, -8.82F, 0.4016F, -0.0872F, -0.0038F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(46, 129).mirror().addBox(-0.1959F, -0.3488F, -1.2239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 1.129F, -7.4241F, 0.3492F, -0.0872F, -0.0038F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(128, 67).mirror().addBox(-0.3709F, -0.0479F, -1.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.329F, -5.4241F, 0.1747F, -0.0872F, -0.0038F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1797F, 2.0718F, -9.0585F, 0.4845F, -0.0872F, -0.0038F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(21, 139).mirror().addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(21, 139).addBox(-0.25F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.125F, 3.0873F, -10.6887F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(139, 126).mirror().addBox(-0.5F, -0.75F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(139, 126).addBox(-0.25F, -0.75F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.125F, 1.7821F, -10.5062F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(16, 139).mirror().addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(16, 139).addBox(-0.25F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.125F, 2.2066F, -10.5549F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(105, 138).mirror().addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(105, 138).addBox(-0.25F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.125F, 2.2699F, -11.1037F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(138, 63).mirror().addBox(-0.5F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(138, 63).addBox(-0.25F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.125F, 2.7533F, -11.2472F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(125, 139).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(125, 139).addBox(-0.2F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.15F, 2.7685F, -10.3917F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(138, 60).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false)
				.texOffs(138, 60).addBox(-0.2F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.15F, 2.2517F, -10.2036F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(138, 57).mirror().addBox(-0.5F, -0.45F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(138, 57).addBox(-0.2F, -0.45F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.15F, 2.6429F, -10.1019F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(125, 127).mirror().addBox(-0.5F, -0.35F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.5923F, 0.5166F, -3.6761F, -0.026F, -0.0872F, -0.0038F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(118, 127).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5896F, 0.1196F, -3.7243F, 0.1485F, -0.0872F, -0.0038F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(137, 137).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4612F, 0.3265F, -5.1833F, 0.2271F, 0.0872F, 0.0038F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(11, 138).addBox(-0.6291F, 0.0172F, -0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.3677F, 0.4626F, -7.7305F, 0.3841F, 0.0872F, 0.0038F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(85, 129).addBox(-0.6291F, -0.4328F, -2.2488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5698F, 0.329F, -5.4241F, 0.2532F, 0.0872F, 0.0038F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(63, 129).addBox(-0.9419F, -2.9735F, -2.7572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.6198F, 0.329F, -5.4241F, -1.8141F, 0.218F, 0.0097F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(139, 77).addBox(-0.9419F, -4.0417F, 0.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6198F, 0.329F, -5.4241F, -0.9414F, 0.218F, 0.0097F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(130, 8).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.9794F, -0.2374F, -1.7818F, -0.5924F, 0.218F, 0.0097F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(53, 129).addBox(-0.9419F, -4.1486F, -0.5426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.6198F, 0.329F, -5.4241F, -1.2905F, 0.218F, 0.0097F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(133, 55).addBox(-0.5F, -1.075F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8468F, 0.2848F, -2.3575F, 0.2367F, 0.218F, 0.0097F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(89, 115).addBox(-0.5524F, -0.3714F, -3.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, 0.1745F, 0.2182F, -0.0349F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(130, 12).addBox(-0.5524F, -0.6566F, -2.2331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(140, 28).addBox(-0.4548F, -0.2045F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(140, 28).addBox(-0.4548F, -0.2045F, -0.3406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, 0.0175F, 0.2182F, -0.0349F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(140, 31).addBox(-0.4548F, -0.4717F, -0.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 140).addBox(-0.4548F, -0.4717F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, -0.3752F, 0.2182F, -0.0349F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(73, 139).addBox(-0.4548F, -0.1434F, 0.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, 0.1484F, 0.2182F, -0.0349F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(26, 140).addBox(-0.4548F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, 0.8029F, 0.2182F, -0.0349F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(140, 25).addBox(-0.4548F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.0594F, 1.2392F, 0.2182F, -0.0349F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(55, 133).addBox(0.2715F, -0.6517F, -2.5045F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5698F, 0.229F, -5.3241F, 0.2976F, 0.0847F, 0.0212F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(142, 37).addBox(0.2754F, -0.6133F, -0.5504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5698F, 0.229F, -5.3241F, 0.2275F, 0.0859F, 0.0152F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(133, 51).addBox(0.2754F, -0.6568F, 0.3804F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5698F, 0.229F, -5.3241F, 0.1228F, 0.0859F, 0.0152F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(139, 129).addBox(-0.5937F, -1.0471F, -2.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3948F, 0.979F, -7.2741F, 0.5858F, 0.0832F, 0.0263F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(39, 139).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1526F, 1.5137F, -8.82F, 0.4016F, 0.0872F, 0.0038F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(46, 129).addBox(-0.8041F, -0.3488F, -1.2239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5698F, 1.129F, -7.4241F, 0.3492F, 0.0872F, 0.0038F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(128, 67).addBox(-0.6291F, -0.0479F, -1.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5698F, 0.329F, -5.4241F, 0.1747F, 0.0872F, 0.0038F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1797F, 2.0718F, -9.0585F, 0.4845F, 0.0872F, 0.0038F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(125, 127).addBox(-0.5F, -0.35F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5923F, 0.5166F, -3.6761F, -0.026F, 0.0872F, 0.0038F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(118, 127).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5896F, 0.1196F, -3.7243F, 0.1485F, 0.0872F, 0.0038F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -0.8209F, 0.0402F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.88F, 8.6205F, -0.1764F, -0.0353F, 0.0506F));

		PartDefinition cube_r485 = tail.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-3.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1791F, 1.0402F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r486 = tail.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(35, 13).addBox(0.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1791F, 1.0402F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r487 = tail.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(60, 130).addBox(0.0F, -0.2F, 3.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 129).addBox(0.0F, -1.3F, 1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 122).addBox(0.0F, -3.0F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.299F, 6.8066F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(69, 140).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1625F, 3.0385F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(23, 131).addBox(0.0F, -5.0635F, 0.001F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 9.1435F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(39, 131).addBox(0.0F, -5.5382F, 0.0324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7789F, 7.0783F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(0, 125).addBox(0.0F, -6.1382F, -0.0676F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6677F, 5.1167F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r492 = tail.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(82, 124).addBox(0.0F, -6.6382F, 0.0324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7924F, 2.9991F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(45, 57).addBox(0.0F, -7.0382F, 0.0324F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.9395F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1686F, 11.0409F, -0.0786F, -0.0435F, 0.0034F));

		PartDefinition cube_r494 = tail2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r495 = tail2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(35, 23).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r496 = tail2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(93, 140).addBox(0.0F, -2.2892F, -0.094F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(140, 90).addBox(0.0F, -2.8238F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(59, 91).addBox(0.0F, -3.5228F, -0.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5383F, 4.0113F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, -4.0228F, -0.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5834F, 1.987F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(129, 131).addBox(0.0F, -4.6228F, -0.0149F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(76, 133).addBox(0.0F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6236F, 8.3868F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(132, 71).addBox(0.0F, 3.7F, 9.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 131).addBox(0.0F, 2.8F, 7.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5199F, -6.2336F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 8.7567F, -0.0337F, -0.0834F, 0.1335F));

		PartDefinition cube_r503 = tail3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.0F, 0.0055F, 0.052F, -0.002F));

		PartDefinition cube_r504 = tail3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(48, 46).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.0F, 0.0055F, -0.052F, 0.002F));

		PartDefinition cube_r505 = tail3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(20, 134).addBox(0.0F, 3.8F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 113).addBox(0.0F, 2.8F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 109).addBox(0.0F, 1.7F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 78).addBox(0.0F, -0.3F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(142, 66).addBox(0.0F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1822F, 9.3698F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(39, 142).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.872F, 7.4913F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r508 = tail3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(104, 141).addBox(0.0F, -1.5707F, 0.0528F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2428F, 4.8337F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r509 = tail3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(13, 141).addBox(0.0F, -1.6707F, -0.1472F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(10, 141).addBox(0.0F, -1.9819F, -0.3259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(107, 141).addBox(0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 108).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 111).addBox(0.0F, -1.25F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 114).addBox(0.0F, -1.25F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 117).addBox(0.0F, -1.25F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 120).addBox(0.0F, -1.25F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0096F, 10.9005F, -0.038F, -0.1196F, 0.1022F));

		PartDefinition cube_r511 = tail4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(133, 140).addBox(0.0F, 10.3F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 140).addBox(0.0F, 8.9F, 17.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 140).addBox(0.0F, 7.9F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 114).addBox(0.0F, 6.7F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(36, 137).addBox(0.0F, 4.8F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5429F, -13.0147F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(80, 52).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F))
				.texOffs(141, 123).addBox(0.0F, -1.15F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 0).addBox(0.0F, -1.1F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 3).addBox(0.0F, -0.975F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.1457F, -0.1327F, 0.0846F));

		PartDefinition cube_r513 = tail5.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(142, 6).addBox(0.0F, 14.5F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 140).addBox(0.0F, 12.5F, 23.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 140).addBox(0.0F, 11.3F, 21.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -24.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0071F, 6.0019F, 0.1182F, -0.2418F, 0.1621F));

		PartDefinition cube_r514 = tail6.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(142, 9).addBox(0.0F, 15.4F, 27.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5596F, -30.1161F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(21, 57).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, 0.2055F, -0.2137F, -0.0442F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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