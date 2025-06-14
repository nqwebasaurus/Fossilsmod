package fossils.fossils.client.blockentity.model.piatnitzkysaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiatnitzkysaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;

	public PiatnitzkysaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.0F, 3.2F, 0.1744F, -0.0076F, 0.043F));

		PartDefinition basin_r1 = hips.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(23, 81).addBox(0.0F, -3.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 17).addBox(-1.0F, -1.6F, -6.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.6071F, 0.3707F, -0.0262F, 0.0F, 0.0F));

		PartDefinition basin_r2 = hips.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(44, 9).addBox(0.0F, -3.4F, -4.8F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6071F, 0.3707F, 0.0262F, 0.0F, 0.0F));

		PartDefinition basin_r3 = hips.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-1.0154F, -6.3623F, -3.2346F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, 0.0349F, 0.2618F, 0.1745F));

		PartDefinition basin_r4 = hips.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(-1.0154F, -7.1194F, -1.4272F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, 0.5934F, 0.2618F, 0.1745F));

		PartDefinition basin_r5 = hips.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(29, 66).mirror().addBox(-1.464F, -4.9408F, 1.7507F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, 0.192F, 0.0F, 0.1745F));

		PartDefinition basin_r6 = hips.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-1.464F, -6.2573F, -1.4177F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.0349F, 0.0F, 0.1745F));

		PartDefinition basin_r7 = hips.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.464F, -5.5075F, -3.2463F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.3316F, 0.0F, 0.1745F));

		PartDefinition basin_r8 = hips.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-1.464F, -6.444F, 0.4803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.2094F, 0.0F, 0.1745F));

		PartDefinition basin_r9 = hips.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-1.5199F, -0.3106F, -1.3411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -2.7838F, 0.5411F, 0.1745F));

		PartDefinition basin_r10 = hips.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(-1.3321F, -5.638F, -1.3741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 74).mirror().addBox(-1.3321F, -4.638F, -1.2741F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -2.2192F, 0.3218F, -0.0805F));

		PartDefinition basin_r11 = hips.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(79, 7).mirror().addBox(-1.5199F, -0.8105F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -1.8064F, 0.5411F, 0.1745F));

		PartDefinition basin_r12 = hips.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-0.7338F, 4.9596F, -5.8472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.1484F, 0.0F, -0.1396F));

		PartDefinition basin_r13 = hips.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-0.7338F, -3.034F, -3.0146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, 0.2793F, 0.0F, -0.1396F));

		PartDefinition basin_r14 = hips.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-0.7338F, 3.2687F, -4.0342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.384F, 0.0F, -0.1396F));

		PartDefinition basin_r15 = hips.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.464F, -1.5364F, -2.9627F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.1047F, 0.0F, 0.1745F));

		PartDefinition basin_r16 = hips.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.7338F, -0.1606F, -2.9775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.7505F, 0.0F, -0.1396F));

		PartDefinition basin_r17 = hips.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(28, 31).mirror().addBox(-0.7338F, -0.2717F, -3.5997F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.936F, 3.2173F, -0.7439F, -0.5061F, 0.0F, -0.1396F));

		PartDefinition basin_r18 = hips.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(29, 66).addBox(0.464F, -4.9408F, 1.7507F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, 0.192F, 0.0F, -0.1745F));

		PartDefinition basin_r19 = hips.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(76, 61).addBox(0.464F, -6.444F, 0.4803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.2094F, 0.0F, -0.1745F));

		PartDefinition basin_r20 = hips.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(36, 71).addBox(0.0154F, -7.1194F, -1.4272F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, 0.5934F, -0.2618F, -0.1745F));

		PartDefinition basin_r21 = hips.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(71, 70).addBox(0.0154F, -6.3623F, -3.2346F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, 0.0349F, -0.2618F, -0.1745F));

		PartDefinition basin_r22 = hips.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(69, 21).addBox(0.464F, -6.2573F, -1.4177F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.0349F, 0.0F, -0.1745F));

		PartDefinition basin_r23 = hips.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(67, 76).addBox(0.3321F, -5.638F, -1.3741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 74).addBox(0.3321F, -4.638F, -1.2741F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -2.2192F, -0.3218F, 0.0805F));

		PartDefinition basin_r24 = hips.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(79, 7).addBox(0.5199F, -0.8105F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -1.8064F, -0.5411F, -0.1745F));

		PartDefinition basin_r25 = hips.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(78, 69).addBox(0.5199F, -0.3106F, -1.3411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -2.7838F, -0.5411F, -0.1745F));

		PartDefinition basin_r26 = hips.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(0, 51).addBox(-0.2662F, -0.1606F, -2.9775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.7505F, 0.0F, 0.1396F));

		PartDefinition basin_r27 = hips.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(73, 56).addBox(-0.2662F, 4.9596F, -5.8472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.1484F, 0.0F, 0.1396F));

		PartDefinition basin_r28 = hips.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(52, 8).addBox(-0.2662F, 3.2687F, -4.0342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.384F, 0.0F, 0.1396F));

		PartDefinition basin_r29 = hips.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(74, 76).addBox(-0.2662F, -3.034F, -3.0146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, 0.2793F, 0.0F, 0.1396F));

		PartDefinition basin_r30 = hips.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(28, 31).addBox(-0.2662F, -0.2717F, -3.5997F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.5061F, 0.0F, 0.1396F));

		PartDefinition basin_r31 = hips.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(0, 58).addBox(0.464F, -1.5364F, -2.9627F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.1047F, 0.0F, -0.1745F));

		PartDefinition basin_r32 = hips.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(0, 14).addBox(0.464F, -5.5075F, -3.2463F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.936F, 3.2173F, -0.7439F, -0.3316F, 0.0F, -0.1745F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(23, 2).addBox(-1.2F, -0.9704F, -0.886F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5838F, 0.981F, -1.4832F, -0.4349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 48).addBox(-1.0F, -0.1541F, -0.4467F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 7.9296F, 0.114F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 31).addBox(-1.0F, -0.1038F, 0.0772F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, 4.0296F, -0.986F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.48F, 9.9439F, 1.0908F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 40).addBox(-0.5F, -1.8527F, -0.5979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1402F, 2.0441F, 0.5637F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(78, 53).addBox(-0.5F, -2.0499F, 0.0067F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1402F, 4.0441F, 0.5637F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1402F, 9.6441F, 1.9637F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 42).addBox(0.0F, -0.4F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.86F, 0.4418F, 1.2075F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -2.2097F, -1.3434F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.86F, 3.8439F, 2.0839F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 49).addBox(0.0F, -3.0097F, -0.9434F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.86F, 3.8439F, 2.0839F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 71).addBox(0.0F, -0.0053F, -0.8435F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.86F, 3.8439F, 1.9839F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(9, 65).addBox(-0.98F, 0.0804F, -0.147F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 9.4911F, 1.8661F, -0.9121F, -0.1037F, -0.08F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7626F, 0.179F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 0).addBox(-2.68F, 0.2F, -5.4F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.514F, 0.2486F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, -0.9704F, -0.886F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6344F, 0.7855F, -1.6948F, -1.4103F, 0.2368F, -0.0934F));

		PartDefinition cube_r11 = rightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 18).addBox(-1.0F, -0.1541F, -0.4467F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 7.9296F, 0.114F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -0.1038F, 0.0772F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, 4.0296F, -0.986F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.48F, 9.9439F, 1.0908F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r13 = rightLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 72).addBox(-0.5F, -1.8527F, -0.5979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1402F, 2.0441F, 0.5637F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r14 = rightLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 45).addBox(-0.5F, -2.0499F, 0.0067F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1402F, 4.0441F, 0.5637F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r15 = rightLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 69).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1402F, 9.6441F, 1.9637F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.4F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.86F, 0.4418F, 1.2075F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 72).addBox(-1.0F, -2.2097F, -1.3434F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.86F, 3.8439F, 2.0839F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(37, 1).addBox(-1.0F, -3.0097F, -0.9434F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, 3.8439F, 2.0839F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 69).addBox(-1.0F, -0.0053F, -0.8435F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.86F, 3.8439F, 1.9839F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(32, 16).addBox(-1.02F, 0.0804F, -0.147F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 9.4911F, 1.8661F, -1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7626F, 0.179F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightLeg4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 31).addBox(-2.32F, 0.2F, -5.4F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.514F, 0.2486F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(14, 31).addBox(-1.0F, -0.991F, 0.031F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(20, 81).addBox(0.0F, -2.591F, 0.031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 0).addBox(0.0F, -2.491F, 2.031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 80).addBox(0.0F, -2.491F, 4.031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 80).addBox(0.0F, -2.391F, 6.031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 80).addBox(0.0F, -2.391F, 8.031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 5.18F, -0.064F, 0.1437F, 0.1642F));

		PartDefinition cube_r21 = tail1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 79).addBox(0.0F, 2.1439F, 3.9854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 80).addBox(0.0F, 1.1439F, 1.9854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 80).addBox(0.0F, 0.2439F, -0.0146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3358F, 2.1858F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 81).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.409F, 0.531F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.6231F, -0.1267F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.007F))
				.texOffs(66, 80).addBox(0.0F, -1.8231F, 0.8733F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 33).addBox(0.0F, -1.6231F, 2.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 28).addBox(0.0F, -1.6231F, 4.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 23).addBox(0.0F, -1.5231F, 6.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 42).addBox(0.0F, -1.4231F, 8.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 45).addBox(0.0F, -1.2231F, 10.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4089F, 9.107F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 80).addBox(0.0F, 8.2439F, 15.6854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 77).addBox(0.0F, 6.3439F, 13.6854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 79).addBox(0.0F, 5.4439F, 11.6854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 79).addBox(0.0F, 4.6439F, 9.6854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 79).addBox(0.0F, 3.8439F, 7.6854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 79).addBox(0.0F, 2.8439F, 5.6854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7446F, -6.9212F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 3).addBox(-0.5F, -0.0996F, -0.3004F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.002F))
				.texOffs(22, 74).addBox(0.0F, -0.7996F, 0.6996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 37).addBox(0.0F, -0.7996F, 2.6996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 65).addBox(0.0F, -0.6996F, 4.6996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(0.0F, -0.5996F, 6.6996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 64).addBox(0.0F, -0.4996F, 8.6996F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4264F, 11.8557F, -0.0536F, 0.2179F, -0.0116F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 69).addBox(0.0F, 12.6439F, 23.6854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 71).addBox(0.0F, 11.7439F, 21.6854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 80).addBox(0.0F, 9.9439F, 19.6854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 57).addBox(0.0F, 9.0439F, 17.6854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.171F, -18.7769F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(32, 16).addBox(-0.5F, -0.6366F, -0.0748F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F))
				.texOffs(48, 8).addBox(0.0F, -1.0366F, -0.0748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 40).addBox(0.0F, -0.9366F, 1.9252F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(0.0F, -0.9366F, 3.9252F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(0.0F, -0.9366F, 5.9252F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 10.7F, -0.1625F, -0.2585F, 0.0419F));

		PartDefinition cube_r25 = tail4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(55, 26).addBox(0.0F, 15.1439F, 29.6854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 0).addBox(0.0F, 14.3439F, 27.6854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 61).addBox(0.0F, 13.5439F, 25.6854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5986F, -29.4275F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0118F, 8.9186F, -0.3146F, -0.3332F, 0.106F));

		PartDefinition cube_r26 = tail5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 28).addBox(-0.1F, 0.3061F, -2.2122F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.9672F, 1.9647F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.26F, -5.22F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(60, 6).addBox(0.3F, -1.3302F, -2.0504F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 25).addBox(0.3F, -1.4302F, -4.0504F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 27).addBox(-0.7F, -0.0302F, -5.0504F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, -1.7846F, -6.7586F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4648F, -4.368F, -0.3518F, -0.105F, -0.5049F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4648F, -4.368F, -0.2694F, -0.2516F, -0.9606F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(-4.0356F, -2.1024F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7648F, -6.368F, -0.0361F, -0.2241F, -1.5144F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 59).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7648F, -6.368F, -0.1646F, -0.1569F, -0.8597F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(54, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7648F, -6.368F, -0.2173F, -0.0658F, -0.3942F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-5.0356F, -2.1024F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9648F, -8.368F, -0.022F, -0.1379F, -1.4122F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9648F, -8.368F, -0.1008F, -0.0968F, -0.7631F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9648F, -8.368F, -0.1336F, -0.0407F, -0.294F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0648F, -10.368F, -0.0629F, -0.0606F, -0.766F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-7.0356F, -2.1024F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0648F, -10.368F, -0.0137F, -0.0862F, -1.4131F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0648F, -10.368F, -0.0835F, -0.0255F, -0.2956F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 58).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4648F, -4.368F, -0.2694F, 0.2516F, 0.9606F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(63, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4648F, -4.368F, -0.3518F, 0.105F, 0.5049F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7648F, -6.368F, -0.2173F, 0.0658F, 0.3942F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 59).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7648F, -6.368F, -0.1646F, 0.1569F, 0.8597F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 62).addBox(2.0356F, -2.1024F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7648F, -6.368F, -0.0361F, 0.2241F, 1.5144F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9648F, -8.368F, -0.1336F, 0.0407F, 0.294F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 58).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9648F, -8.368F, -0.1008F, 0.0968F, 0.7631F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 35).addBox(2.0356F, -2.1024F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9648F, -8.368F, -0.022F, 0.1379F, 1.4122F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 69).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0648F, -10.368F, -0.0629F, 0.0606F, 0.766F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 32).addBox(2.0356F, -2.1024F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0648F, -10.368F, -0.0137F, 0.0862F, 1.4131F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(70, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0648F, -10.368F, -0.0835F, 0.0255F, 0.2956F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, -2.8172F, -9.6147F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.8F, 9.3154F, -2.6586F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(11, 80).addBox(0.3F, -0.5003F, -1.3784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 11).addBox(0.3F, -0.3003F, -3.3784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 80).addBox(0.3F, -0.3003F, -5.3784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 80).addBox(0.3F, -0.4003F, -7.3784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 39).addBox(-0.7F, 0.9997F, -7.3784F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.3F, -1.7846F, 0.6414F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3846F, -11.7586F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 58).addBox(0.3F, -1.4443F, -0.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.7F, -0.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 58).addBox(0.3F, -1.5443F, -2.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 59).addBox(0.3F, -1.2443F, -4.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 43).addBox(-0.7F, -0.0443F, -5.8546F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.7F, -0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-1.0F, -0.0075F, 0.0273F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -1.8654F, -1.387F, 2.4793F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-0.5F, -0.0075F, -0.1727F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.4021F, -0.7075F, 0.5922F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.0075F, -0.1727F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.405F, -0.9703F, 0.7356F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-0.5F, -0.0075F, -0.6727F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.6388F, -1.2866F, 1.1048F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-1.3F, 0.2637F, -0.7828F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 12).addBox(5.7F, 0.2637F, -0.7828F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 1.3F, -4.9F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(0.0F, -0.8653F, -1.9633F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.6F, -7.1F, 0.9965F, -0.4689F, -0.6097F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-1.3F, -0.0013F, -3.9589F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(36, 60).addBox(5.7F, -0.0013F, -3.9589F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.7F, 1.3F, -4.8F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-1.3F, 0.0637F, 0.1172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(69, 15).addBox(5.7F, 0.0637F, 0.1172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.7F, 1.3F, -4.9F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-6.0356F, -2.1024F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8198F, -4.4094F, 0.0248F, 0.1551F, -1.4642F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8198F, -4.4094F, 0.1134F, 0.1089F, -0.8141F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8198F, -4.4094F, 0.1503F, 0.0458F, -0.3456F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-7.0356F, -2.1024F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5198F, -2.5094F, 0.0109F, 0.069F, -1.4133F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(47, 53).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5198F, -2.5094F, 0.0503F, 0.0485F, -0.7667F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(17, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5198F, -2.5094F, 0.0668F, 0.0204F, -0.296F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3198F, -0.5094F, 0.0167F, 0.0051F, -0.2967F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 56).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3198F, -0.5094F, 0.0126F, 0.0121F, -0.7679F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-8.0356F, -2.1024F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3198F, -0.5094F, 0.0027F, 0.0172F, -1.4137F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8198F, -4.4094F, 0.1503F, -0.0458F, 0.3456F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 43).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8198F, -4.4094F, 0.1134F, -0.1089F, 0.8141F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 24).addBox(2.0356F, -2.1024F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8198F, -4.4094F, 0.0248F, -0.1551F, 1.4642F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(17, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5198F, -2.5094F, 0.0668F, -0.0204F, 0.296F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 53).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5198F, -2.5094F, 0.0503F, -0.0485F, 0.7667F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(21, 52).addBox(2.0356F, -2.1024F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5198F, -2.5094F, 0.0109F, -0.069F, 1.4133F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3198F, -0.5094F, 0.0167F, -0.0051F, 0.2967F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(29, 56).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3198F, -0.5094F, 0.0126F, -0.0121F, 0.7679F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(23, 0).addBox(2.0356F, -2.1024F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3198F, -0.5094F, 0.0027F, -0.0172F, 1.4137F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(45, 69).addBox(-1.0F, -0.8653F, -1.9633F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.6F, -7.1F, 0.9965F, 0.4689F, 0.6097F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(45, 35).addBox(-0.5F, -0.0075F, -0.1727F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.4021F, 0.7075F, -0.5922F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.0075F, -0.1727F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.405F, 0.9703F, -0.7356F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 27).addBox(0.0F, -0.0075F, 0.0273F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -1.8654F, 1.387F, -2.4793F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 20).addBox(-0.5F, -0.0075F, -0.6727F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3039F, -4.313F, -0.6388F, 1.2866F, -1.1048F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(16, 69).addBox(-0.5F, -1.0224F, 0.0431F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7039F, -7.313F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 26).addBox(-1.5F, 0.1F, -2.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6039F, -6.713F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 8).addBox(-1.7F, -2.031F, -2.9016F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 9.6F, -0.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 6.67F, -6.16F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftArm.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 79).addBox(-0.8F, -1.9419F, 0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(76, 29).addBox(-0.8F, -0.9419F, -0.0047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0398F, -0.1213F, -0.7832F, -0.8779F, 0.0082F, -0.4301F));

		PartDefinition cube_r89 = leftArm.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(76, 35).addBox(-1.0F, -0.9755F, -2.1632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0398F, 0.3787F, 1.3168F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 10).addBox(-1.0F, 0.5F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0398F, -1.2213F, 1.7168F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(13, 52).addBox(-0.2F, 0.0948F, -0.871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(60, 6).addBox(-0.1998F, 1.155F, 0.0288F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.66F, -0.9233F, 5.1656F, -1.4602F, 0.0702F, -0.5633F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(42, 42).addBox(-0.4248F, -1.66F, -0.2232F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 1.1232F, 4.1629F, 0.0F, -0.1745F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 6.67F, -6.16F, -1.3969F, 0.0151F, -0.0859F));

		PartDefinition cube_r91 = rightArm.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 73).addBox(-0.2F, -1.9419F, 0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(5, 76).addBox(-0.2F, -0.9419F, -0.0047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0398F, -0.1213F, -0.7832F, -0.8779F, -0.0082F, 0.4301F));

		PartDefinition cube_r92 = rightArm.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(76, 24).addBox(0.0F, -0.9755F, -2.1632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0398F, 0.3787F, 1.3168F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(64, 67).addBox(0.0F, 0.5F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0398F, -1.2213F, 1.7168F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(52, 8).addBox(-0.8F, 0.0948F, -0.871F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(11, 59).addBox(-0.8002F, 1.155F, 0.0288F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.66F, -0.9233F, 5.1656F, -1.5708F, 0.0F, 0.3927F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5752F, -1.66F, -0.2232F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.15F, 1.1232F, 4.1629F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.36F, -5.52F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r94 = neck1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 28).addBox(0.0F, -2.4238F, 2.9075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 8).addBox(0.0F, -2.2238F, 0.9075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 62).addBox(-1.0F, -1.4238F, 1.9075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(41, 75).addBox(-0.5F, -1.4238F, -0.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0046F, -3.964F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-5.0356F, -2.1024F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6598F, -0.4894F, 0.0332F, 0.2068F, -1.5499F));

		PartDefinition cube_r96 = neck1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-2.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6598F, -0.4894F, 0.1517F, 0.1449F, -0.8965F));

		PartDefinition cube_r97 = neck1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(22, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6598F, -0.4894F, 0.2005F, 0.0608F, -0.4302F));

		PartDefinition cube_r98 = neck1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(22, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6598F, -0.4894F, 0.2005F, -0.0608F, 0.4302F));

		PartDefinition cube_r99 = neck1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(42, 39).addBox(0.891F, -0.454F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6598F, -0.4894F, 0.1517F, -0.1449F, 0.8965F));

		PartDefinition cube_r100 = neck1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 8).addBox(2.0356F, -2.1024F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6598F, -0.4894F, 0.0332F, -0.2068F, 1.5499F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0754F, -3.964F, 0.1842F, 0.1651F, -0.1685F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 21).addBox(0.0F, -0.8007F, -0.5544F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 21).addBox(0.0F, -1.0007F, -2.5544F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 14).addBox(0.0F, -1.4007F, -4.5544F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(-0.5F, -0.1007F, -4.5544F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(0.0185F, -0.453F, 0.0563F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8275F, -4.2631F, -0.7609F, -0.3604F, 0.0549F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.0226F, -0.517F, -0.0052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.242F, -0.3764F, -0.7806F, -0.4105F, 0.1074F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(0.0155F, -0.5911F, 0.05F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2313F, 1.1368F, -0.9031F, -0.5F, 0.2268F));

		PartDefinition cube_r105 = neck2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(0.0527F, -0.5272F, 0.1141F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4978F, -2.2981F, -0.7703F, -0.3856F, 0.0809F));

		PartDefinition cube_r106 = neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(5, 71).addBox(0.0226F, -0.517F, -0.0052F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.242F, -0.3764F, -0.7806F, 0.4105F, -0.1074F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 45).addBox(-0.0155F, -0.5911F, 0.05F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2313F, 1.1368F, -0.9031F, 0.5F, -0.2268F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(72, 0).addBox(-0.0527F, -0.5272F, 0.1141F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4978F, -2.2981F, -0.7703F, 0.3856F, -0.0809F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(22, 77).addBox(-0.0185F, -0.453F, 0.0563F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8275F, -4.2631F, -0.7609F, 0.3604F, -0.0549F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -4.3F, -0.2699F, 0.2893F, -0.1176F));

		PartDefinition cube_r110 = neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(0.0F, -0.5251F, -0.0011F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7725F, -1.8631F, 0.0274F, -0.2966F, -0.008F));

		PartDefinition cube_r111 = neck3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(77, 3).addBox(0.0F, -0.5251F, -0.0011F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7725F, -1.8631F, 0.0274F, 0.2966F, 0.008F));

		PartDefinition cube_r112 = neck3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(38, 66).addBox(-0.5F, 2.0F, -0.08F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(0.0F, 0.8F, 0.92F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2275F, -2.8631F, 0.0262F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 64).addBox(-1.5F, -1.2582F, -2.92F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.022F))
				.texOffs(52, 42).addBox(-1.5F, -1.2582F, -1.92F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.3225F, -2.3031F, 0.1843F, 0.3675F, -0.0579F));

		PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(74, 8).mirror().addBox(-2.0F, 1.4451F, 1.1025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(74, 65).mirror().addBox(-2.0F, 0.0451F, 0.0025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(74, 8).addBox(0.0F, 1.4451F, 1.1025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F))
				.texOffs(74, 65).addBox(0.0F, 0.0451F, 0.0025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.5F, -1.7033F, 0.0776F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.52F, -1.0217F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(35, 66).addBox(1.52F, -1.0217F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, -0.9241F, -1.4453F, -1.1694F, 0.0F, 0.0F));

		PartDefinition Head_r3 = head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(35, 66).addBox(-0.725F, 0.05F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(35, 66).mirror().addBox(-2.315F, 0.05F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.02F, -2.0475F, -1.3554F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r4 = head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.52F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(69, 0).addBox(1.52F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, 0.5759F, -1.4453F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r5 = head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.52F, -1.999F, -0.9634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false)
				.texOffs(35, 77).addBox(1.52F, -1.999F, -0.9634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-1.0F, 1.2759F, -1.4453F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Head_r6 = head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(7, 14).mirror().addBox(-0.52F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(7, 14).addBox(1.52F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.0F, -0.097F, -1.2524F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Head_r7 = head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.52F, 0.0711F, -0.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.022F)).mirror(false)
				.texOffs(76, 0).addBox(1.56F, 0.0711F, -0.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.022F)), PartPose.offsetAndRotation(-1.02F, -0.2018F, -3.197F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r8 = head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.52F, -1.6061F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(78, 17).mirror().addBox(-0.72F, -1.6061F, -0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 49).mirror().addBox(-0.83F, -1.6061F, -0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 49).addBox(1.87F, -1.6061F, -0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 17).addBox(1.76F, -1.6061F, -0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(53, 77).addBox(1.56F, -1.6061F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.02F, -0.2018F, -3.197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Head_r9 = head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(65, 34).mirror().addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(65, 34).addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -0.511F, -9.8147F, -0.6807F, 0.0F, 0.0F));

		PartDefinition Head_r10 = head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.5F, -1.0335F, 0.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false)
				.texOffs(59, 48).addBox(-0.5F, -1.0335F, 0.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.0F, -0.611F, -9.5147F, -1.1694F, 0.0F, 0.0F));

		PartDefinition Rightcrestfront_r1 = head.addOrReplaceChild("Rightcrestfront_r1", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-0.2722F, -0.7888F, -0.3913F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.885F, -1.4058F, -4.8241F, -0.2955F, -0.2985F, 0.014F));

		PartDefinition Rightcrestfront_r2 = head.addOrReplaceChild("Rightcrestfront_r2", CubeListBuilder.create().texOffs(15, 14).mirror().addBox(-0.55F, -1.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.7157F, -0.8897F, -5.5446F, 0.2552F, -0.1654F, -0.1523F));

		PartDefinition Rightcrestfront_r3 = head.addOrReplaceChild("Rightcrestfront_r3", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.215F, -0.7732F, -1.9136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.485F, -1.4058F, -4.7241F, 0.2267F, -0.2394F, -0.0206F));

		PartDefinition Rightcrestfront_r4 = head.addOrReplaceChild("Rightcrestfront_r4", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-0.6885F, -0.8519F, -0.1564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.885F, -1.4058F, -4.8241F, 0.1758F, 0.0112F, -0.1554F));

		PartDefinition Upperjawbase_r1 = head.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(-0.0319F, -2.0108F, -2.1632F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-1.4521F, 1.4558F, -4.0553F, -0.0879F, -0.2007F, 0.0176F));

		PartDefinition Head_r11 = head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.0659F, -2.0286F, -2.1573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4521F, 1.4558F, -4.0553F, -0.4893F, -0.192F, 0.0176F));

		PartDefinition Head_r12 = head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.0659F, -0.1164F, -2.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-1.4521F, 1.4558F, -4.0553F, -1.1874F, -0.192F, 0.0176F));

		PartDefinition Head_r13 = head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(48, 76).mirror().addBox(-0.0659F, 1.0973F, -1.5256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.027F)).mirror(false), PartPose.offsetAndRotation(-1.4521F, 1.4558F, -4.0553F, -1.7285F, -0.192F, 0.0176F));

		PartDefinition Upperjawbase_r2 = head.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-0.525F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.3757F, 0.3288F, -6.8999F, 0.0338F, -0.1135F, 0.0206F));

		PartDefinition Upperjawfront_r1 = head.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8725F, -9.0744F, -0.0671F, -0.0609F, 0.0041F));

		PartDefinition Head_r14 = head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(53, 0).addBox(-0.9341F, -2.0286F, -2.1573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.4521F, 1.4558F, -4.0553F, -0.4893F, 0.192F, -0.0176F));

		PartDefinition Head_r15 = head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(16, 65).addBox(-0.9341F, -0.1164F, -2.9515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(1.4521F, 1.4558F, -4.0553F, -1.1874F, 0.192F, -0.0176F));

		PartDefinition Head_r16 = head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(48, 76).addBox(-0.9341F, 1.0973F, -1.5256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.027F)), PartPose.offsetAndRotation(1.4521F, 1.4558F, -4.0553F, -1.7285F, 0.192F, -0.0176F));

		PartDefinition Head_r17 = head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(44, 19).addBox(-2.5F, 0.0074F, -2.0563F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.0F, -2.1033F, -1.8224F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r18 = head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(10, 43).addBox(-2.5F, 0.0451F, -1.9975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(1.0F, -1.7033F, 0.0776F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r19 = head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(54, 35).addBox(-2.5F, -1.9549F, -1.9975F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.0F, 1.6967F, -2.9224F, -0.9425F, 0.0F, 0.0F));

		PartDefinition Leftcrestfront_r1 = head.addOrReplaceChild("Leftcrestfront_r1", CubeListBuilder.create().texOffs(75, 13).addBox(-0.785F, -0.7732F, -1.9136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.485F, -1.4058F, -4.7241F, 0.2267F, 0.2394F, 0.0206F));

		PartDefinition Leftcrestfront_r2 = head.addOrReplaceChild("Leftcrestfront_r2", CubeListBuilder.create().texOffs(75, 20).addBox(-0.3115F, -0.8519F, -0.1564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.885F, -1.4058F, -4.8241F, 0.1758F, -0.0112F, 0.1554F));

		PartDefinition Leftcrestfront_r3 = head.addOrReplaceChild("Leftcrestfront_r3", CubeListBuilder.create().texOffs(15, 14).addBox(-0.45F, -1.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.7157F, -0.8897F, -5.5446F, 0.2552F, 0.1654F, 0.1523F));

		PartDefinition Leftcrestfront_r4 = head.addOrReplaceChild("Leftcrestfront_r4", CubeListBuilder.create().texOffs(71, 26).addBox(-0.7278F, -0.7888F, -0.3913F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.885F, -1.4058F, -4.8241F, -0.2955F, 0.2985F, -0.014F));

		PartDefinition Upperjawbase_r3 = head.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.8F, -1.7597F, -3.1235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 58).addBox(-0.2F, -1.7597F, -3.1235F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2599F, -7.3632F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r4 = head.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0726F, -6.2045F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition Upperjawbase_r5 = head.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0726F, -6.2045F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition Upperjawbase_r6 = head.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(68, 5).addBox(-0.475F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.3757F, 0.3288F, -6.8999F, 0.0338F, 0.1135F, -0.0206F));

		PartDefinition Upperjawbase_r7 = head.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(64, 54).addBox(-2.0F, -2.0347F, -1.0295F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.5F, 1.5551F, -3.0763F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r8 = head.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(46, 64).addBox(-0.9681F, -2.0108F, -2.1632F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.4521F, 1.4558F, -4.0553F, -0.0879F, 0.2007F, -0.0176F));

		PartDefinition Upperjawslopebase_r1 = head.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(22, 55).mirror().addBox(0.0F, -0.6542F, 0.2622F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5342F, -7.6013F, 0.2296F, -0.0423F, -0.0185F));

		PartDefinition Upperjawslopebase_r2 = head.addOrReplaceChild("Upperjawslopebase_r2", CubeListBuilder.create().texOffs(22, 55).addBox(-1.0F, -0.6542F, 0.2622F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.5F, -0.5342F, -7.6013F, 0.2296F, 0.0423F, 0.0185F));

		PartDefinition Upperjawslopefront_r1 = head.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(71, 32).addBox(-1.0F, -0.4088F, -1.6782F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, -0.9233F, -7.7024F, 0.1864F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = head.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(58, 77).addBox(-1.0F, -1.2907F, -2.1284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.9233F, -7.7024F, 0.7885F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r3 = head.addOrReplaceChild("Upperjawslopefront_r3", CubeListBuilder.create().texOffs(78, 39).addBox(-1.0F, -1.8559F, -2.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.9233F, -7.7024F, 1.094F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = head.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(64, 37).addBox(-1.0F, -1.594F, -1.8334F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 2.2767F, -8.9024F, -0.1019F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r3 = head.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(56, 64).addBox(-0.55F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8725F, -9.0744F, -0.0671F, 0.0609F, -0.0041F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8567F, 0.6276F, 0.4782F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = jaw.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.52F, 1.5274F, -3.3711F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r1 = jaw.addOrReplaceChild("Lowerjawslope_r1", CubeListBuilder.create().texOffs(21, 54).mirror().addBox(-0.1F, -0.7178F, -4.0362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1714F, -4.2537F, 0.0517F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r2 = jaw.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(72, 50).mirror().addBox(0.5F, 0.0662F, -2.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.011F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.3148F, -3.3734F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r2 = jaw.addOrReplaceChild("Lowerjawslope_r2", CubeListBuilder.create().texOffs(29, 49).mirror().addBox(-0.1F, -0.5547F, -4.3991F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1714F, -4.2537F, 0.0342F, -0.1745F, 0.0F));

		PartDefinition Lowerjawslope_r3 = jaw.addOrReplaceChild("Lowerjawslope_r3", CubeListBuilder.create().texOffs(29, 58).mirror().addBox(-0.1F, -1.4113F, -4.0416F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1714F, -4.2537F, 0.1826F, -0.1745F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = jaw.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3793F, -7.0903F, 0.0694F, -0.0871F, -0.006F));

		PartDefinition Lowerjawbase_r3 = jaw.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(0.5F, -0.8387F, -3.8584F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8148F, 0.5266F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r4 = jaw.addOrReplaceChild("Lowerjawslope_r4", CubeListBuilder.create().texOffs(29, 49).addBox(-0.9F, -0.5547F, -4.3991F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 2.1714F, -4.2537F, 0.0342F, 0.1745F, 0.0F));

		PartDefinition Lowerjawslope_r5 = jaw.addOrReplaceChild("Lowerjawslope_r5", CubeListBuilder.create().texOffs(21, 54).addBox(-0.9F, -0.7178F, -4.0362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4F, 2.1714F, -4.2537F, 0.0517F, 0.1745F, 0.0F));

		PartDefinition Lowerjawslope_r6 = jaw.addOrReplaceChild("Lowerjawslope_r6", CubeListBuilder.create().texOffs(29, 58).addBox(-0.9F, -1.4113F, -4.0416F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1714F, -4.2537F, 0.1826F, 0.1745F, 0.0F));

		PartDefinition Lowerjawfront_r1 = jaw.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(15, 21).addBox(-0.96F, 0.0714F, -2.5673F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F))
				.texOffs(61, 0).addBox(-0.96F, -0.4286F, -2.5673F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7923F, -8.254F, -0.0408F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = jaw.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(8, 51).addBox(-1.0F, -2.4793F, -0.8014F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 3.2923F, -9.454F, 0.1162F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = jaw.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(53, 53).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.3793F, -7.0903F, 0.0694F, 0.0871F, 0.006F));

		PartDefinition Lowerjawbase_r4 = jaw.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(7, 58).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.52F, 1.5274F, -3.3711F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = jaw.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(72, 50).addBox(-1.5F, 0.0662F, -2.032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.011F)), PartPose.offsetAndRotation(2.0F, 0.3148F, -3.3734F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r6 = jaw.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(47, 58).addBox(-1.5F, -0.8387F, -3.8584F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.0F, 0.8148F, 0.5266F, 0.1047F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4523F, -4.294F));

		PartDefinition Lowerjawbase_r7 = throat.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(42, 42).mirror().addBox(-0.6F, -0.9696F, -2.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.1F, 2.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r8 = throat.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(43, 27).mirror().addBox(-0.6F, -0.9978F, -1.9284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.3F, 3.5F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r9 = throat.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(42, 42).addBox(-0.4F, -0.9696F, -2.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9F, -0.1F, 2.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r10 = throat.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(43, 27).addBox(-0.4F, -0.9978F, -1.9284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.9F, -1.3F, 3.5F, 0.6894F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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