package fossils.fossils.client.blockentity.model.edmontosaurusannectens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EdmontosaurusannectensFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart bone;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone2;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
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

	public EdmontosaurusannectensFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.bone = this.leftLeg.getChild("bone");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone2 = this.rightLeg.getChild("bone2");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.9787F, 6.1958F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(133, 18).mirror().addBox(-1.0F, -1.3351F, -0.1082F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8412F, 9.5452F, 16.9026F, -0.1951F, 0.174F, 0.1202F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(143, 137).mirror().addBox(-1.0F, -1.1269F, 1.0543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8412F, 9.5452F, 16.9026F, -0.0555F, 0.174F, 0.1202F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(95, 148).mirror().addBox(-1.0F, -2.9639F, 3.0453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8412F, 9.5452F, 16.9026F, -0.5442F, 0.174F, 0.1202F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(0.7905F, -0.2298F, 0.1259F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 6.178F, 11.3293F, -0.3042F, 0.2889F, 0.0687F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 139).mirror().addBox(-0.8662F, -0.8548F, -3.0498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 139).addBox(8.1338F, -0.8548F, -3.0498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1338F, 3.678F, 2.9293F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 143).mirror().addBox(-0.8662F, -0.8692F, -1.9471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(95, 143).addBox(8.1338F, -0.8692F, -1.9471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.1338F, 4.278F, 4.7293F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 143).mirror().addBox(-0.2171F, -0.0592F, 0.0994F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 143).addBox(8.7829F, -0.0592F, 0.0994F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -4.1091F, -2.5009F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-1.5739F, -2.1099F, -0.1904F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, 1.5172F, -7.514F, 0.0682F, 0.1285F, -0.0251F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(131, 28).mirror().addBox(-1.0657F, -7.0092F, -2.1502F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1474F, 4.6334F, -12.8914F, -1.0635F, 0.1296F, 0.0183F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(134, 58).mirror().addBox(-1.0984F, 0.1244F, -0.1646F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1474F, 0.0334F, -13.7914F, -0.6446F, 0.1296F, 0.0183F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(147, 65).mirror().addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.6891F, -5.6826F, -2.2427F, -1.1642F, 0.0623F, -0.1152F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(124, 44).mirror().addBox(0.0896F, 1.1685F, -4.5075F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -7.726F, -0.0484F, -0.0609F, 0.1309F, 0.0034F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 107).mirror().addBox(0.0896F, 0.4764F, -8.7989F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.388F, -7.026F, -2.8484F, 0.3231F, 0.1309F, 0.0034F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(116, 126).mirror().addBox(0.0896F, 0.2888F, -4.9638F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.988F, -7.726F, -0.0484F, 0.0788F, 0.1309F, 0.0034F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 107).mirror().addBox(0.0896F, -0.8033F, -8.9005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.388F, -7.026F, -2.8484F, 0.4453F, 0.1309F, 0.0034F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.6049F, -0.1609F, -0.3373F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -4.9091F, 6.5991F, -0.2403F, -0.2044F, 0.046F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(116, 36).mirror().addBox(-0.2171F, -2.2428F, -2.0329F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 36).addBox(8.7829F, -2.2428F, -2.0329F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -4.7091F, 1.0991F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(150, 55).mirror().addBox(0.5025F, -2.2386F, 3.1373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -4.7091F, 1.0991F, -0.3625F, -0.2044F, 0.046F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 105).mirror().addBox(-0.8683F, -0.3998F, -0.1085F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 3.678F, 4.9293F, -0.4089F, 0.2889F, 0.0687F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-0.8662F, -0.39F, -4.9593F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(55, 86).addBox(8.1338F, -0.39F, -4.9593F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.1338F, 2.178F, 2.4293F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 126).mirror().addBox(-1.757F, -0.2704F, -0.6736F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4777F, 0.9172F, -3.914F, -0.4185F, 0.1714F, 0.046F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(-1.757F, -0.3852F, 3.9218F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4777F, 0.9172F, -3.914F, -0.4535F, 0.1714F, 0.046F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(92, 137).mirror().addBox(-0.7998F, -0.4827F, -2.7584F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1457F, 1.62F, 3.0918F, -1.2523F, 0.023F, 0.0515F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(133, 143).mirror().addBox(-0.8662F, -0.4204F, -0.17F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1457F, 1.62F, 3.0918F, -0.7779F, 0.139F, 0.09F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(133, 116).mirror().addBox(-0.7294F, 0.0117F, 0.0011F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1474F, -1.0666F, -11.0914F, -1.238F, 0.1296F, 0.0183F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.5F, -1.4292F, -2.1289F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1474F, 0.5334F, -9.0914F, -0.0861F, 0.1296F, 0.0183F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-1.0753F, -1.0177F, -4.8227F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8777F, -0.5828F, -3.214F, 0.2253F, 0.1285F, -0.0251F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(123, 110).mirror().addBox(-4.0F, 1.0F, 0.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 110).mirror().addBox(-4.0F, 1.0F, 4.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 110).addBox(1.0F, 1.0F, 0.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(123, 110).addBox(1.0F, 1.0F, 4.6F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 86).mirror().addBox(-0.2171F, -1.2919F, -2.7938F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 86).addBox(8.7829F, -1.2919F, -2.7938F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7829F, -4.7091F, 1.0991F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(119, 141).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5853F, -2.8364F, 4.6706F, 0.2525F, -0.2094F, 0.0056F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(0.5025F, -1.2397F, 2.9831F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7829F, -4.7091F, 1.0991F, -0.2229F, -0.2044F, 0.046F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(147, 65).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.6891F, -5.6826F, -2.2427F, -1.1642F, -0.0623F, 0.1152F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(124, 44).addBox(-1.0896F, 1.1685F, -4.5075F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.988F, -7.726F, -0.0484F, -0.0609F, -0.1309F, -0.0034F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 107).addBox(-1.0896F, 0.4764F, -8.7989F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.388F, -7.026F, -2.8484F, 0.3231F, -0.1309F, -0.0034F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(116, 126).addBox(-1.0896F, 0.2888F, -4.9638F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.988F, -7.726F, -0.0484F, 0.0788F, -0.1309F, -0.0034F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 107).addBox(-1.0896F, -0.8033F, -8.9005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.388F, -7.026F, -2.8484F, 0.4453F, -0.1309F, -0.0034F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(116, 0).addBox(-0.3951F, -0.1609F, -0.3373F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -4.9091F, 6.5991F, -0.2403F, 0.2044F, -0.046F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(150, 55).addBox(-1.5025F, -2.2386F, 3.1373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7829F, -4.7091F, 1.0991F, -0.3625F, 0.2044F, -0.046F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 148).addBox(0.0F, -2.9639F, 3.0453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8412F, 9.5452F, 16.9026F, -0.5442F, -0.174F, -0.1202F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(133, 18).addBox(0.0F, -1.3351F, -0.1082F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8412F, 9.5452F, 16.9026F, -0.1951F, -0.174F, -0.1202F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(143, 137).addBox(0.0F, -1.1269F, 1.0543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8412F, 9.5452F, 16.9026F, -0.0555F, -0.174F, -0.1202F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 107).addBox(-1.7905F, -0.2298F, 0.1259F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.1338F, 6.178F, 11.3293F, -0.3042F, -0.2889F, -0.0687F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(53, 105).addBox(-0.1317F, -0.3998F, -0.1085F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1338F, 3.678F, 4.9293F, -0.4089F, -0.2889F, -0.0687F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(26, 126).addBox(0.757F, -0.2704F, -0.6736F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4777F, 0.9172F, -3.914F, -0.4185F, -0.1714F, -0.046F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 86).addBox(0.757F, -0.3852F, 3.9218F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4777F, 0.9172F, -3.914F, -0.4535F, -0.1714F, -0.046F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(92, 137).addBox(-0.2002F, -0.4827F, -2.7584F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1457F, 1.62F, 3.0918F, -1.2523F, -0.023F, -0.0515F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(133, 143).addBox(-0.1338F, -0.4204F, -0.17F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1457F, 1.62F, 3.0918F, -0.7779F, -0.139F, -0.09F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(131, 28).addBox(0.0657F, -7.0092F, -2.1502F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.1474F, 4.6334F, -12.8914F, -1.0635F, -0.1296F, -0.0183F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(134, 58).addBox(0.0984F, 0.1244F, -0.1646F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1474F, 0.0334F, -13.7914F, -0.6446F, -0.1296F, -0.0183F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(133, 116).addBox(-0.2706F, 0.0117F, 0.0011F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.1474F, -1.0666F, -11.0914F, -1.238F, -0.1296F, -0.0183F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5F, -1.4292F, -2.1289F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1474F, 0.5334F, -9.0914F, -0.0861F, -0.1296F, -0.0183F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(100, 70).addBox(0.5739F, -2.1099F, -0.1904F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8777F, 1.5172F, -7.514F, 0.0682F, -0.1285F, 0.0251F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 124).addBox(0.0753F, -1.0177F, -4.8227F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8777F, -0.5828F, -3.214F, 0.2253F, -0.1285F, 0.0251F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(119, 141).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.5853F, -2.8364F, 4.6706F, 0.2525F, 0.2094F, -0.0056F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5025F, -1.2397F, 2.9831F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7829F, -4.7091F, 1.0991F, -0.2229F, 0.2044F, -0.046F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(104, 143).addBox(0.0F, -5.6F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 0).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(145, 147).addBox(0.0F, -5.6382F, 0.4324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9202F, 6.4033F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(64, 60).addBox(0.0F, 0.2129F, -0.0892F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0202F, -1.7967F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, -0.3118F, -1.1366F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(95, 87).addBox(-0.5F, -0.1698F, -6.9002F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 8.4671F, 2.2985F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 139).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8671F, 0.2985F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(83, 59).addBox(-2.0F, -3.1F, -2.1F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1943F, -0.7442F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(117, 70).addBox(-1.0F, -6.0532F, -2.9767F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.7719F, 0.4259F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(17, 110).addBox(-1.0F, -8.0522F, 0.0259F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 14.9719F, -4.1741F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(103, 10).addBox(-2.0F, -4.0362F, -0.0731F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 20.4498F, -0.8309F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(99, 26).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.6498F, -2.5309F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.0573F, -1.5592F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(144, 36).addBox(-0.5F, -8.6538F, -0.9295F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2F, 8.696F, 0.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(109, 21).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2F, 18.1876F, -1.4546F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(43, 116).addBox(-0.5F, -5.6456F, -0.5279F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 8.696F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 122).addBox(-2.0F, -4.0068F, -0.1069F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 20.4832F, -1.0618F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(30, 116).addBox(-2.0F, -4.5F, -1.8F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 18.4832F, -1.5618F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 98).addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 0.7255F, 0.7001F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(33, 47).addBox(-1.9F, -16.0978F, 3.0681F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 129).addBox(-1.0F, -3.1347F, -2.5949F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 3.8952F, 1.3071F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 113).addBox(-1.9F, -0.0744F, -2.1364F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8475F, 1.4533F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(109, 49).addBox(-2.0F, -0.5443F, -1.6179F, 4.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 20.4675F, -2.8413F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(74, 87).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2043F, -0.0455F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(31, 76).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition bone = leftLeg.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, -0.3118F, -1.1366F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(36, 96).addBox(-0.5F, -0.1698F, -6.9002F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 8.4671F, 2.2985F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(67, 139).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8671F, 0.2985F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(84, 11).addBox(-2.0F, -3.1F, -2.1F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1943F, -0.7442F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(120, 9).addBox(-2.0F, -6.0532F, -2.9767F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.7719F, 0.4259F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(112, 80).addBox(-2.0F, -8.0522F, 0.0259F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 14.9719F, -4.1741F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(72, 104).addBox(-2.0F, -4.0362F, -0.0731F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 20.4498F, -0.8309F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(99, 39).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.6498F, -2.5309F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.0573F, -1.5592F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(145, 28).addBox(-0.5F, -8.6538F, -0.9295F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2F, 8.696F, 0.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(145, 102).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2F, 18.1876F, -1.4546F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(48, 116).addBox(-0.5F, -5.6456F, -0.5279F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 8.696F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 102).addBox(-1.0F, -4.0068F, -0.1069F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 20.4832F, -1.0618F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(120, 116).addBox(-1.0F, -4.5F, -1.8F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 18.4832F, -1.5618F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 98).addBox(-1.5F, -1.0F, -3.2F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 0.7255F, 0.7001F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 122).addBox(-0.1F, -16.0978F, 3.0681F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(129, 126).addBox(-1.0F, -3.1347F, -2.5949F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 3.8952F, 1.3071F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(79, 113).addBox(-0.1F, -0.0744F, -2.1364F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8475F, 1.4533F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(112, 92).addBox(-2.0F, -0.5443F, -1.6179F, 4.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 20.4675F, -2.8413F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 90).addBox(-3.0F, -1.4696F, -2.8933F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2043F, -0.0455F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(56, 76).addBox(-3.0F, -1.4F, -4.9F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition bone2 = rightLeg.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(59, 140).addBox(0.0F, -5.8338F, -9.0239F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(128, 141).addBox(0.0F, -5.8816F, -6.0288F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8F, -5.0F, -0.0358F, -0.218F, 0.0077F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(16, 142).addBox(0.0F, -5.3F, -0.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -2.9274F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(153, 2).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -8.2333F, -0.1224F, -0.0994F, -0.4691F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(155, 104).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -8.2333F, -0.0566F, -0.2039F, -0.8979F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(155, 71).mirror().addBox(-4.8936F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.226F, -8.2333F, 0.0362F, -0.2084F, -1.3438F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(154, 95).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -11.2333F, 0.0476F, -0.0856F, -0.8942F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(145, 34).mirror().addBox(-5.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -11.2333F, 0.0793F, -0.0575F, -1.3308F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(153, 0).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -11.2333F, 0.021F, -0.0352F, -0.46F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(124, 56).mirror().addBox(-9.8936F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -14.2333F, 0.1184F, 0.0765F, -1.3297F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(151, 40).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -14.2333F, 0.1395F, 0.0195F, -0.8966F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(152, 145).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.426F, -14.2333F, 0.1486F, 0.0214F, -0.4602F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(153, 2).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -8.2333F, -0.1224F, 0.0994F, 0.4691F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(155, 104).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -8.2333F, -0.0566F, 0.2039F, 0.8979F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(155, 71).addBox(2.8936F, -2.4262F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.226F, -8.2333F, 0.0362F, 0.2084F, 1.3438F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(154, 95).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -11.2333F, 0.0476F, 0.0856F, 0.8942F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(145, 34).addBox(2.8936F, -2.4262F, -0.2666F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -11.2333F, 0.0793F, 0.0575F, 1.3308F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(153, 0).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -11.2333F, 0.021F, 0.0352F, 0.46F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(124, 56).addBox(2.8936F, -2.4262F, -0.2666F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -14.2333F, 0.1184F, -0.0765F, 1.3297F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(151, 40).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -14.2333F, 0.1395F, -0.0195F, 0.8966F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(152, 145).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.426F, -14.2333F, 0.1486F, -0.0214F, 0.4602F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 143).addBox(0.0F, -5.2952F, 0.0052F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5339F, -12.0274F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(143, 74).addBox(0.0F, -5.2F, -6.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7339F, -9.0274F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 25).addBox(-1.0F, -1.4F, -14.9F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6661F, -0.1274F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5634F, -14.8779F, -0.0704F, -0.1306F, 0.0092F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-13.8936F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2317F, -5.0443F, 0.1901F, 0.3104F, -1.2979F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(155, 147).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2317F, -5.0443F, 0.3029F, 0.2021F, -0.8605F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(155, 102).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2317F, -5.0443F, 0.3733F, 0.1185F, -0.4264F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(152, 143).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3317F, -2.2443F, 0.2611F, 0.069F, -0.437F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(62, 155).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3317F, -2.2443F, 0.2215F, 0.1102F, -0.8732F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(102, 68).mirror().addBox(-12.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3317F, -2.2443F, 0.1549F, 0.1931F, -1.3068F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-16.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0317F, -8.0443F, 0.2156F, 0.3943F, -1.2891F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(155, 140).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0317F, -8.0443F, 0.3618F, 0.2679F, -0.8467F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(155, 69).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0317F, -8.0443F, 0.4537F, 0.1542F, -0.4155F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(102, 68).addBox(2.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3317F, -2.2443F, 0.1549F, -0.1931F, 1.3068F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(155, 102).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2317F, -5.0443F, 0.3733F, -0.1185F, 0.4264F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(155, 147).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2317F, -5.0443F, 0.3029F, -0.2021F, 0.8605F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 22).addBox(2.8936F, -2.4262F, -0.2666F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2317F, -5.0443F, 0.1901F, -0.3104F, 1.2979F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 24).addBox(2.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0317F, -8.0443F, 0.2156F, -0.3943F, 1.2891F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(155, 69).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0317F, -8.0443F, 0.4537F, -0.1542F, 0.4155F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(155, 140).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0317F, -8.0443F, 0.3618F, -0.2679F, 0.8467F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(62, 155).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3317F, -2.2443F, 0.2215F, -0.1102F, 0.8732F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(144, 16).addBox(0.0F, -4.8604F, -0.17F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.2298F, -8.7487F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(142, 89).addBox(0.0F, -5.4721F, 0.0295F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2282F, -3.1384F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(142, 65).addBox(0.0F, -5.177F, -0.0663F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4718F, -5.9384F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(76, 43).addBox(-1.0F, 0.0F, -10.1F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3282F, 0.8616F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(152, 143).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3317F, -2.2443F, 0.2611F, -0.069F, 0.437F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.2981F, -8.6045F, 0.0648F, -0.0883F, -0.0415F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 144).addBox(0.0F, -4.8981F, -0.0363F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4413F, -2.8164F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(24, 144).addBox(0.0F, -4.6181F, -0.0937F, 0.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9413F, -5.4164F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(106, 107).addBox(-1.0F, -0.0448F, -0.0381F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9413F, -5.4164F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(36, 152).addBox(0.0F, -5.0784F, 0.0244F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.5413F, -6.8164F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 152).addBox(0.0F, -4.9093F, 0.0031F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.9413F, -8.2164F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 151).addBox(0.0F, -5.0134F, -0.0864F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.3413F, -9.5164F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(119, 59).addBox(-1.0F, -0.0865F, -0.1546F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.5413F, -8.7164F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(16, 135).mirror().addBox(-0.5F, -2.9874F, -2.6462F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(16, 135).addBox(10.5F, -2.9874F, -2.6462F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 13.9805F, -8.4412F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(76, 137).mirror().addBox(-0.5F, -1.9896F, 0.0538F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(76, 137).addBox(10.5F, -1.9896F, 0.0538F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.5F, 12.4805F, -7.6412F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(145, 83).mirror().addBox(-0.5F, -0.0081F, -0.0297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(145, 83).addBox(10.5F, -0.0081F, -0.0297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.5F, 5.9997F, -0.7827F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(116, 44).mirror().addBox(-0.5F, -0.0453F, 0.0315F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(116, 44).addBox(10.5F, -0.0453F, 0.0315F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 6.4997F, -2.7827F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(136, 102).mirror().addBox(-0.5F, -0.016F, 0.056F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(136, 102).addBox(10.5F, -0.016F, 0.056F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-5.5F, 9.1997F, -8.0827F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(67, 129).mirror().addBox(-0.8628F, -1.9061F, -5.3031F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 17.9093F, -11.1458F, 1.3533F, -0.4607F, -1.1094F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(0.3853F, -1.9061F, -2.2762F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 17.9093F, -11.1458F, 1.1194F, -0.2373F, -0.4514F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(137, 43).mirror().addBox(-0.5F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 43).addBox(10.5F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 13.0805F, -8.7412F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(0.0F, 0.2194F, -0.3821F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(100, 80).addBox(11.0F, 0.2194F, -0.3821F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.0F, 14.4093F, -12.0458F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(136, 83).mirror().addBox(-0.5F, 0.0389F, -0.0905F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(136, 83).addBox(10.5F, 0.0389F, -0.0905F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-5.5F, 7.4997F, -5.4827F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.5F, 0.1157F, -0.047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(99, 49).addBox(10.5F, 0.1157F, -0.047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.5F, 11.2997F, -10.0827F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(39, 155).mirror().addBox(-3.6251F, -0.9946F, -0.2447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7983F, -8.7721F, 0.5971F, 0.4684F, -0.7098F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(57, 153).mirror().addBox(-1.9045F, -0.2207F, -0.3604F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7983F, -8.7721F, 0.7412F, 0.2481F, -0.3061F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(-18.8651F, -2.4335F, -0.2447F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7983F, -8.7721F, 0.3435F, 0.6703F, -1.172F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(81, 76).mirror().addBox(-0.5F, -0.8F, -5.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(81, 76).addBox(10.5F, -0.8F, -5.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.5F, 8.502F, -1.4888F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 145).mirror().addBox(-0.0209F, -0.0752F, -0.6634F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 22.0011F, -3.3169F, -0.1891F, -0.9305F, 0.2241F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-0.0209F, 0.6338F, 2.2482F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 22.0011F, -3.3169F, 0.125F, -0.9305F, 0.2241F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.672F, 0.7066F, 2.511F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 22.2011F, -2.8169F, 0.2665F, -0.8521F, 0.1794F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(143, 61).mirror().addBox(-0.672F, -0.0871F, -0.3909F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 22.2011F, -2.8169F, -0.0477F, -0.8521F, 0.1794F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.2682F, 0.0362F, -0.8729F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 21.9011F, -3.2169F, 0.2318F, -1.1016F, 0.108F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-0.3682F, -0.0426F, -1.3033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 21.8011F, -3.4169F, 0.4799F, -1.2879F, -0.0276F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(153, 44).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.4983F, -11.3721F, 0.8277F, 0.2735F, -0.2838F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(113, 155).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.4983F, -11.3721F, 0.6736F, 0.5241F, -0.6734F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-14.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.4983F, -11.3721F, 0.3898F, 0.7502F, -1.1419F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-16.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9983F, -9.9721F, 0.3522F, 0.6863F, -1.1666F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(154, 134).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9983F, -9.9721F, 0.6121F, 0.4797F, -0.703F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(126, 19).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9983F, -9.9721F, 0.7584F, 0.2533F, -0.3019F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(155, 73).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.2983F, -7.1721F, 0.707F, 0.2374F, -0.3144F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(155, 112).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.2983F, -7.1721F, 0.5678F, 0.4455F, -0.7227F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(-18.8936F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.2983F, -7.1721F, 0.3266F, 0.638F, -1.1823F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(153, 42).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9983F, -5.8721F, 0.6852F, 0.2447F, -0.37F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(155, 110).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9983F, -5.8721F, 0.5431F, 0.4437F, -0.7838F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-18.8936F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9983F, -5.8721F, 0.3028F, 0.6265F, -1.2468F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(153, 25).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3983F, -4.0721F, 0.6345F, 0.2272F, -0.3814F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(155, 108).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3983F, -4.0721F, 0.5014F, 0.4077F, -0.8006F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-17.8936F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3983F, -4.0721F, 0.2809F, 0.5774F, -1.2588F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(155, 106).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0983F, -1.7721F, 0.4381F, 0.3433F, -0.8065F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-17.8936F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0983F, -1.7721F, 0.2522F, 0.4937F, -1.2561F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(153, 23).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0983F, -1.7721F, 0.5526F, 0.1926F, -0.3811F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(112, 102).mirror().addBox(-1.25F, -1.1083F, 0.0185F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 102).addBox(1.15F, -1.1083F, 0.0185F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 22.3011F, -8.8169F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(67, 129).addBox(-0.1372F, -1.9061F, -5.3031F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 17.9093F, -11.1458F, 1.3533F, 0.4607F, 1.1094F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(125, 80).addBox(-1.3853F, -1.9061F, -2.2762F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 17.9093F, -11.1458F, 1.1194F, 0.2373F, 0.4514F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(39, 155).addBox(1.6251F, -0.9946F, -0.2447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7983F, -8.7721F, 0.5971F, -0.4684F, 0.7098F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(57, 153).addBox(-0.0955F, -0.2207F, -0.3604F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7983F, -8.7721F, 0.7412F, -0.2481F, 0.3061F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(49, 16).addBox(2.8651F, -2.4335F, -0.2447F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7983F, -8.7721F, 0.3435F, -0.6703F, 1.172F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 145).addBox(-0.9791F, -0.0752F, -0.6634F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 22.0011F, -3.3169F, -0.1891F, 0.9305F, -0.2241F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 116).addBox(-0.9791F, 0.6338F, 2.2482F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 22.0011F, -3.3169F, 0.125F, 0.9305F, -0.2241F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 96).addBox(-0.328F, 0.7066F, 2.511F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 22.2011F, -2.8169F, 0.2665F, 0.8521F, -0.1794F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(143, 61).addBox(-0.328F, -0.0871F, -0.3909F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 22.2011F, -2.8169F, -0.0477F, 0.8521F, -0.1794F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 80).addBox(-0.7318F, 0.0362F, -0.8729F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, 21.9011F, -3.2169F, 0.2318F, 1.1016F, -0.108F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 95).addBox(-0.6318F, -0.0426F, -1.3033F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 21.8011F, -3.4169F, 0.4799F, 1.2879F, 0.0276F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(3, 144).addBox(-0.25F, -0.7574F, 0.0296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 22.5011F, -5.8169F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(153, 44).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.4983F, -11.3721F, 0.8277F, -0.2735F, 0.2838F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(113, 155).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.4983F, -11.3721F, 0.6736F, -0.5241F, 0.6734F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(78, 37).addBox(2.8936F, -2.4262F, -0.2666F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.4983F, -11.3721F, 0.3898F, -0.7502F, 1.1419F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(76, 57).addBox(2.8936F, -2.4262F, -0.2666F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9983F, -9.9721F, 0.3522F, -0.6863F, 1.1666F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(154, 134).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9983F, -9.9721F, 0.6121F, -0.4797F, 0.703F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(126, 19).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9983F, -9.9721F, 0.7584F, -0.2533F, 0.3019F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(155, 73).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2983F, -7.1721F, 0.707F, -0.2374F, 0.3144F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(155, 112).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2983F, -7.1721F, 0.5678F, -0.4455F, 0.7227F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(49, 20).addBox(2.8936F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2983F, -7.1721F, 0.3266F, -0.638F, 1.1823F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(153, 42).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9983F, -5.8721F, 0.6852F, -0.2447F, 0.37F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(155, 110).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9983F, -5.8721F, 0.5431F, -0.4437F, 0.7838F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(49, 18).addBox(2.8936F, -2.4262F, -0.2666F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9983F, -5.8721F, 0.3028F, -0.6265F, 1.2468F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(153, 25).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3983F, -4.0721F, 0.6345F, -0.2272F, 0.3814F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(155, 108).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3983F, -4.0721F, 0.5014F, -0.4077F, 0.8006F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(76, 55).addBox(2.8936F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3983F, -4.0721F, 0.2809F, -0.5774F, 1.2588F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(155, 106).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0983F, -1.7721F, 0.4381F, -0.3433F, 0.8065F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(49, 22).addBox(2.8936F, -2.4262F, -0.2666F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0983F, -1.7721F, 0.2522F, -0.4937F, 1.2561F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(153, 23).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0983F, -1.7721F, 0.5526F, -0.1926F, 0.3811F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(39, 126).addBox(0.0F, -4.3099F, -0.2666F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5914F, -10.5425F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(152, 137).addBox(0.0F, -3.7603F, -0.0342F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.9914F, -12.2425F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(102, 59).addBox(-1.0F, -2.0025F, -0.1586F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9914F, -11.5425F, 0.7679F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4491F, 18.5041F, -9.2527F, 0.9264F, 0.1952F, -0.1478F));

		PartDefinition cube_r215 = leftArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(146, 42).addBox(0.0F, -0.5F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(135, 65).addBox(0.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(74, 155).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r218 = leftArm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(138, 28).addBox(-0.6433F, -0.2928F, -0.5597F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.4317F, -0.3971F, -0.2345F, -0.4743F, -0.0768F));

		PartDefinition cube_r219 = leftArm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(15, 151).addBox(-0.6F, -2.0F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4632F, 4.3572F, -0.121F, 1.1181F, -0.4743F, -0.0768F));

		PartDefinition cube_r220 = leftArm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(74, 148).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0264F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(11, 132).addBox(-0.5909F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.014F, 10.0756F, 2.4052F, -0.4057F, 0.3693F, -0.1353F));

		PartDefinition cube_r221 = leftArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(130, 67).addBox(-0.5F, -5.5F, -1.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0909F, 6.3921F, -0.8717F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(147, 93).addBox(-0.5F, -1.8193F, -1.8439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(53, 128).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0583F, 12.1999F, -0.2572F, 0.1745F, 0.2709F, 0.6063F));

		PartDefinition cube_r223 = leftArm3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(145, 112).addBox(10.8523F, 1.5487F, -12.0035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(30, 110).addBox(-0.5945F, -0.2848F, -0.5127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4491F, 18.5041F, -9.2527F, 0.7082F, -0.1952F, 0.1478F));

		PartDefinition cube_r224 = rightArm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(147, 88).addBox(-1.0F, -0.5F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightArm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(136, 74).addBox(-1.0419F, -15.7734F, -8.7275F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightArm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(155, 136).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r227 = rightArm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(138, 108).addBox(-0.3567F, -0.2928F, -0.5597F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.4317F, -0.3971F, -0.2345F, 0.4743F, 0.0768F));

		PartDefinition cube_r228 = rightArm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(152, 15).addBox(-0.4F, -2.0F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 4.3572F, -0.121F, 1.1181F, 0.4743F, 0.0768F));

		PartDefinition cube_r229 = rightArm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(148, 75).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0264F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(133, 6).addBox(-0.4091F, 1.8921F, -0.2717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.014F, 10.0756F, 2.4052F, -1.0602F, -0.3693F, 0.1353F));

		PartDefinition cube_r230 = rightArm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(87, 130).addBox(-0.5F, -5.5F, -1.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0909F, 6.3921F, -0.8717F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(148, 70).addBox(-0.5F, -1.8193F, -1.8439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 1.7921F, 0.5283F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(60, 128).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, 12.1999F, -0.2572F, 0.5863F, -0.285F, -0.5167F));

		PartDefinition cube_r232 = rightArm3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(146, 24).addBox(-11.8523F, 1.5487F, -12.0035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(48, 133).addBox(-0.4055F, -0.2848F, -0.5127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.3927F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.8413F, -12.0164F, -0.2787F, -0.15F, -0.0472F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(80, 11).addBox(0.0F, -2.0112F, 0.0383F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4772F, -3.8376F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 155).addBox(0.0F, -4.6F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 28).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6772F, -3.6376F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(138, 16).mirror().addBox(-3.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -2.8557F, 0.2497F, 1.257F, -1.3206F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(120, 155).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -2.8557F, 1.0051F, 0.9788F, -0.4967F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(153, 75).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -2.8557F, 1.2566F, 0.6112F, -0.1519F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(154, 33).mirror().addBox(-1.916F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.057F, -1.3557F, 1.1876F, 0.4423F, -0.1723F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(-12.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.057F, -1.3557F, 0.5478F, 1.1154F, -1.0288F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(155, 114).mirror().addBox(-3.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.057F, -1.3557F, 1.0019F, 0.7997F, -0.4847F));

		PartDefinition cube_r241 = neck4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(153, 75).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -2.8557F, 1.2566F, -0.6112F, 0.1519F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(120, 155).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -2.8557F, 1.0051F, -0.9788F, 0.4967F));

		PartDefinition cube_r243 = neck4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(138, 16).addBox(2.8936F, -2.4262F, -0.2666F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -2.8557F, 0.2497F, -1.257F, 1.3206F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(155, 114).addBox(1.6479F, -0.976F, -0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.057F, -1.3557F, 1.0019F, -0.7997F, 0.4847F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(103, 19).addBox(2.8936F, -2.4262F, -0.2666F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.057F, -1.3557F, 0.5478F, -1.1154F, 1.0288F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(154, 33).addBox(-0.084F, -0.1946F, -0.3834F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.057F, -1.3557F, 1.1876F, -0.4423F, 0.1723F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5772F, -3.9376F, 0.6272F, -0.2136F, -0.1525F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(3, 159).addBox(0.0F, -3.6487F, 4.0661F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(158, 157).addBox(0.0F, -3.2487F, 2.0661F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 154).addBox(0.0F, -2.9487F, -0.9339F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 100).addBox(0.0F, -1.9487F, -0.9339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(19, 100).addBox(-1.0F, -1.9487F, -0.9339F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -5.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7875F, -5.5123F, -0.4183F, -0.3579F, 0.0337F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(154, 91).addBox(0.0F, -1.2018F, 5.8419F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(154, 87).addBox(0.0F, -1.2018F, 2.8419F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(99, 0).addBox(0.0F, -0.3018F, 2.8419F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F))
				.texOffs(99, 0).addBox(-1.0F, -0.3018F, 2.8419F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -6.6263F, -7.1488F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.9832F, -5.381F, -0.5528F, -0.4763F, 0.1444F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(147, 10).addBox(0.0F, -0.0088F, -2.0576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2867F, -3.4451F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(152, 82).addBox(0.0F, -1.0F, -1.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6944F, -3.3806F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(154, 65).addBox(0.0F, -1.8F, -1.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 130).addBox(0.0F, -0.8F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(92, 130).addBox(-1.0F, -0.8F, -2.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7867F, -1.2451F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.143F, -5.2379F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(140, 131).addBox(-2.4F, -1.0125F, 0.021F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 9.3813F, -16.6358F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(78, 39).addBox(-3.0F, -0.413F, -1.304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1974F, 9.3713F, -14.3362F, 0.0694F, 0.0F, 0.0F));

		PartDefinition cube_r254 = heads.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(105, 36).addBox(-2.4F, -0.8439F, -0.3773F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 10.0813F, -16.0358F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r255 = heads.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(88, 124).addBox(-1.8F, -0.4F, 4.8F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(53, 122).addBox(-1.8F, -0.4F, 0.8F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 6.9716F, -12.5603F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r256 = heads.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(143, 54).addBox(-0.5F, 0.0118F, 0.01F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.6813F, -7.4358F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r257 = heads.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(37, 133).addBox(-0.5F, 0.0112F, -0.1067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.8813F, -10.6358F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r258 = heads.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(27, 154).addBox(-0.5F, 0.0386F, -1.0386F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3813F, -16.0358F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r259 = heads.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(152, 28).addBox(-0.5F, 0.0209F, -0.9604F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.6813F, -15.4358F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r260 = heads.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(157, 10).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.0868F, -12.5359F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r261 = heads.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(157, 7).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 6.0868F, -12.5359F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r262 = heads.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(149, 126).addBox(-0.5F, 1.0829F, -3.0011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 143).addBox(-0.5F, 0.0829F, -3.0011F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.5813F, -13.2358F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r263 = heads.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(142, 116).addBox(-0.5F, 0.0112F, -3.1067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.8813F, -10.6358F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r264 = heads.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(127, 94).addBox(-2.0F, -0.9922F, -2.8223F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.098F, -7.3986F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r265 = heads.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(157, 16).addBox(0.5F, 0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4F, 3.3529F, -6.617F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r266 = heads.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(133, 24).addBox(-1.5F, -0.9763F, -1.9458F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 4.798F, -5.4986F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(127, 89).addBox(-1.5F, -1.0128F, -2.3225F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 4.198F, -3.1986F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(116, 21).addBox(-4.5F, -3.5749F, -1.5394F, 6.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 2.0295F, -0.6077F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(131, 0).addBox(-2.6F, -0.0257F, -0.9822F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, -3.102F, -0.2986F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(131, 3).addBox(-4.0F, -0.0568F, -1.7024F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -2.102F, 1.1014F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(103, 116).addBox(-3.0F, -2.1645F, -1.9997F, 6.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.098F, 0.2014F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(124, 52).addBox(-3.5F, -0.0042F, -1.957F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.802F, -2.0986F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(127, 99).addBox(-3.5F, -0.0481F, -0.9856F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -3.302F, -1.1986F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(131, 39).addBox(-2.0F, -1.0024F, -1.9669F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.098F, -1.4986F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(83, 70).addBox(-3.0F, 0.1001F, -0.0002F, 6.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.202F, -2.9986F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(103, 130).addBox(-1.5F, -0.0609F, -1.9985F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 144).addBox(-1.0F, -0.0609F, -2.9985F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.202F, -4.6986F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r277 = heads.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(88, 116).addBox(-2.5F, 0.0154F, -1.6968F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.002F, -3.1986F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.5F, 9.3813F, -16.6358F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(152, 20).addBox(0.0F, -0.0125F, 0.021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -0.2094F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(147, 134).addBox(0.0F, -1.0125F, 0.021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, -0.2094F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(125, 67).addBox(-0.7F, -0.5F, 0.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3265F, -0.4552F, 1.079F, -0.2002F, -1.0307F, 0.1504F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(138, 36).addBox(-0.8F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 0.4333F, 1.2107F, 0.1593F, 0.5379F, 0.2759F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(133, 148).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(156, 4).addBox(-0.6F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.4124F, 2.3105F, 0.017F, -0.0039F, 0.2269F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(148, 147).addBox(-0.7F, -0.8208F, -0.2022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1F, -0.0754F, 1.5019F, -0.2095F, -0.0171F, 0.0036F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(151, 36).addBox(-0.5F, -0.3791F, -1.4748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.2575F, 4.3208F, 0.3927F, -0.576F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(41, 151).addBox(-0.5F, -0.2943F, -1.5513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.4575F, 4.3208F, 0.1467F, -0.5587F, 0.003F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(158, 97).addBox(-0.5F, -0.214F, -0.1022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.2575F, 4.3208F, 1.2654F, -0.576F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(142, 98).addBox(-1.0F, -0.1574F, -3.925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(57, 149).addBox(0.0F, -0.1574F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -3.3F, 4.7F, 0.7603F, -0.2792F, -0.0075F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(53, 114).addBox(-0.9238F, -0.5843F, -3.5814F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, -2.1825F, 4.8644F, 0.8298F, -0.2443F, -0.0065F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(157, 13).addBox(0.5F, 0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1F, -6.0284F, 10.0188F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(114, 133).addBox(-1.0F, -0.7758F, -2.7496F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4F, -5.4833F, 11.1372F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(125, 134).addBox(-0.663F, -0.1351F, 0.0001F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7805F, -7.9967F, 8.6796F, 0.5239F, 0.3699F, -0.1235F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(138, 10).addBox(-1.1746F, -1.7292F, -2.7006F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, -6.2833F, 11.1372F, -0.1089F, -0.0173F, -0.3212F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(101, 137).addBox(-0.2F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7643F, -6.4087F, 11.9869F, 0.0091F, 0.8089F, -0.0598F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(67, 146).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3F, -6.7258F, 13.9127F, 1.3778F, 0.1028F, -0.0201F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(151, 116).addBox(-0.4F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.3F, -6.5668F, 14.4387F, 1.0391F, 0.166F, -0.0969F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(141, 49).addBox(-0.7935F, -0.461F, 0.1989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.8791F, -6.8842F, 14.7372F, 0.6341F, -0.337F, -0.4487F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(156, 123).addBox(1.0F, -0.0568F, -0.7024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -11.4833F, 17.7372F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(148, 151).addBox(1.0F, -0.4429F, -0.0219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -11.4833F, 17.5372F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(148, 155).addBox(-1.0F, 2.6527F, -1.6061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -9.6833F, 16.5372F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(137, 152).addBox(-1.0F, -0.004F, -0.7564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -9.6833F, 16.5372F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(153, 155).addBox(-0.6F, -1.9571F, -0.2657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.13F, -7.2032F, 14.0391F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(108, 158).addBox(-0.6F, -0.9637F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(158, 116).addBox(-0.6F, -1.9637F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.13F, -8.7032F, 15.5391F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(155, 149).addBox(-0.6F, -0.9601F, 0.1992F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.13F, -8.3032F, 14.0391F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(126, 158).addBox(-0.6F, -1.0963F, -0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.13F, -10.6032F, 14.6391F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(152, 59).addBox(1.4778F, -0.0532F, 0.5359F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, -10.8882F, 13.7056F, -0.105F, 0.3794F, 1.7947F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(152, 62).addBox(0.0021F, -0.0532F, -0.309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7F, -10.8882F, 13.7056F, -0.0977F, -0.0548F, 1.8391F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(157, 27).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, -10.8882F, 13.7056F, 0.5269F, -0.4385F, 0.6304F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(157, 30).addBox(-1.0264F, -0.0993F, -0.9358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, -11.5882F, 13.7056F, 0.6672F, -0.0867F, 0.1095F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(158, 38).addBox(-0.5F, 0.68F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 0.307F, 0.4888F, -0.1488F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(116, 157).addBox(-0.5F, 0.0895F, -1.2617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 0.0103F, 0.4888F, -0.1488F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(121, 157).addBox(-0.5F, 0.6773F, -0.0367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, -0.8275F, 0.4888F, -0.1488F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 155).addBox(-0.5F, -0.6918F, 0.0495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, -0.461F, 0.4888F, -0.1488F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(88, 158).addBox(-0.5F, -1.0367F, 0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 0.0801F, 0.4888F, -0.1488F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(158, 77).addBox(-0.5F, -0.7794F, 0.7798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 0.9877F, 0.4888F, -0.1488F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(137, 157).addBox(-0.5F, -0.1605F, 0.7689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 1.8603F, 0.4888F, -0.1488F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(27, 158).addBox(-0.5F, -0.5057F, 0.6911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 2.2443F, 0.4888F, -0.1488F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(145, 107).addBox(0.3F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -4.4465F, 9.299F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(6, 153).addBox(0.0F, -0.9696F, -0.0635F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.3022F, 10.9869F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(146, 121).addBox(-0.5F, -1.173F, -1.246F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, 0.2197F, 0.4888F, -0.1488F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(149, 130).addBox(-0.4F, -2.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6326F, -8.6297F, 12.6942F, 0.7632F, 0.4792F, 0.0621F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(150, 51).addBox(-0.4F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -10.8889F, 12.901F, 0.2984F, 0.2718F, -0.3387F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(158, 35).addBox(-0.48F, -1.0804F, -0.6741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 120).addBox(-0.3F, -1.0804F, -0.6741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9393F, -8.8117F, 12.8334F, -0.077F, 0.4888F, -0.1488F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5F, 9.3813F, -16.6358F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(152, 20).mirror().addBox(-2.0F, -0.0125F, 0.021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.2094F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(147, 134).mirror().addBox(-2.0F, -1.0125F, 0.021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.2094F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(125, 67).mirror().addBox(-0.3F, -0.5F, 0.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3265F, -0.4552F, 1.079F, -0.2002F, 1.0307F, -0.1504F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(138, 36).mirror().addBox(-0.2F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4333F, 1.2107F, 0.1593F, -0.5379F, -0.2759F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(133, 148).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(156, 4).mirror().addBox(-0.4F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.4124F, 2.3105F, 0.017F, 0.0039F, -0.2269F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(148, 147).mirror().addBox(-0.3F, -0.8208F, -0.2022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.0754F, 1.5019F, -0.2095F, 0.0171F, -0.0036F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(151, 36).mirror().addBox(-0.5F, -0.3791F, -1.4748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2575F, 4.3208F, 0.3927F, 0.576F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(41, 151).mirror().addBox(-0.5F, -0.2943F, -1.5513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.4575F, 4.3208F, 0.1467F, 0.5587F, -0.003F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(158, 97).mirror().addBox(-0.5F, -0.214F, -0.1022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2575F, 4.3208F, 1.2654F, 0.576F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(142, 98).mirror().addBox(-1.0F, -0.1574F, -3.925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(57, 149).mirror().addBox(-1.0F, -0.1574F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5F, -3.3F, 4.7F, 0.7603F, 0.2792F, 0.0075F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(53, 114).mirror().addBox(-1.0762F, -0.5843F, -3.5814F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.1825F, 4.8644F, 0.8298F, 0.2443F, 0.0065F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(157, 13).mirror().addBox(-1.5F, 0.6F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.0284F, 10.0188F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(114, 133).mirror().addBox(0.0F, -0.7758F, -2.7496F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -5.4833F, 11.1372F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(125, 134).mirror().addBox(-0.337F, -0.1351F, 0.0001F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7805F, -7.9967F, 8.6796F, 0.5239F, -0.3699F, 0.1235F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(138, 10).mirror().addBox(0.1746F, -1.7292F, -2.7006F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -6.2833F, 11.1372F, -0.1089F, 0.0173F, 0.3212F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 137).mirror().addBox(-0.8F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, -6.4087F, 11.9869F, 0.0091F, -0.8089F, 0.0598F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(67, 146).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -6.7258F, 13.9127F, 1.3778F, -0.1028F, 0.0201F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(151, 116).mirror().addBox(-0.6F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -6.5668F, 14.4387F, 1.0391F, -0.166F, 0.0969F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(141, 49).mirror().addBox(-0.2065F, -0.461F, 0.1989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8791F, -6.8842F, 14.7372F, 0.6341F, 0.337F, 0.4487F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(156, 123).mirror().addBox(-2.0F, -0.0568F, -0.7024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, -11.4833F, 17.7372F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(148, 151).mirror().addBox(-2.0F, -0.4429F, -0.0219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, -11.4833F, 17.5372F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(148, 155).mirror().addBox(0.0F, 2.6527F, -1.6061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -9.6833F, 16.5372F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(137, 152).mirror().addBox(0.0F, -0.004F, -0.7564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -9.6833F, 16.5372F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(153, 155).mirror().addBox(-0.4F, -1.9571F, -0.2657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.13F, -7.2032F, 14.0391F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(108, 158).mirror().addBox(-0.4F, -0.9637F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(158, 116).mirror().addBox(-0.4F, -1.9637F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.13F, -8.7032F, 15.5391F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(155, 149).mirror().addBox(-0.4F, -0.9601F, 0.1992F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.13F, -8.3032F, 14.0391F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(126, 158).mirror().addBox(-0.4F, -1.0963F, -0.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.13F, -10.6032F, 14.6391F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(152, 59).mirror().addBox(-3.4778F, -0.0532F, 0.5359F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -10.8882F, 13.7056F, -0.105F, -0.3794F, -1.7947F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(152, 62).mirror().addBox(-2.0021F, -0.0532F, -0.309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -10.8882F, 13.7056F, -0.0977F, 0.0548F, -1.8391F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(157, 27).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -10.8882F, 13.7056F, 0.5269F, 0.4385F, -0.6304F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(157, 30).mirror().addBox(0.0264F, -0.0993F, -0.9358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -11.5882F, 13.7056F, 0.6672F, 0.0867F, -0.1095F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(158, 38).mirror().addBox(-0.5F, 0.68F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 0.307F, -0.4888F, 0.1488F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(116, 157).mirror().addBox(-0.5F, 0.0895F, -1.2617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 0.0103F, -0.4888F, 0.1488F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(121, 157).mirror().addBox(-0.5F, 0.6773F, -0.0367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, -0.8275F, -0.4888F, 0.1488F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(57, 155).mirror().addBox(-0.5F, -0.6918F, 0.0495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, -0.461F, -0.4888F, 0.1488F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 158).mirror().addBox(-0.5F, -1.0367F, 0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 0.0801F, -0.4888F, 0.1488F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(158, 77).mirror().addBox(-0.5F, -0.7794F, 0.7798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 0.9877F, -0.4888F, 0.1488F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(137, 157).mirror().addBox(-0.5F, -0.1605F, 0.7689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 1.8603F, -0.4888F, 0.1488F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(27, 158).mirror().addBox(-0.5F, -0.5057F, 0.6911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 2.2443F, -0.4888F, 0.1488F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(145, 107).mirror().addBox(-0.3F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -4.4465F, 9.299F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(6, 153).mirror().addBox(0.0F, -0.9696F, -0.0635F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -4.3022F, 10.9869F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(146, 121).mirror().addBox(-0.5F, -1.173F, -1.246F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, 0.2197F, -0.4888F, 0.1488F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(149, 130).mirror().addBox(-0.6F, -2.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6326F, -8.6297F, 12.6942F, 0.7632F, -0.4792F, -0.0621F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(150, 51).mirror().addBox(-0.6F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -10.8889F, 12.901F, 0.2984F, -0.2718F, 0.3387F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(158, 35).mirror().addBox(-0.52F, -1.0804F, -0.6741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(156, 120).mirror().addBox(-0.7F, -1.0804F, -0.6741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9393F, -8.8117F, 12.8334F, -0.077F, -0.4888F, 0.1488F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(151, 98).addBox(0.9F, 0.0347F, -7.7288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(151, 98).mirror().addBox(-1.9F, 0.0347F, -7.7288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3774F, 1.1854F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(34, 139).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(34, 139).addBox(4.3F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.4F, -0.4328F, -3.4945F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(25, 139).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(25, 139).addBox(4.3F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4F, -0.2465F, -3.6613F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(115, 151).mirror().addBox(-1.0F, 0.0272F, -0.1041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 151).addBox(1.8F, 0.0272F, -0.1041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.0075F, -5.7247F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(64, 151).mirror().addBox(-1.0F, 0.008F, -0.1346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(64, 151).addBox(1.8F, 0.008F, -0.1346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9F, 0.1075F, -0.6247F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(26, 133).mirror().addBox(-1.0F, 0.0506F, -3.011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(26, 133).addBox(1.8F, 0.0506F, -3.011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.9F, 0.3075F, -1.4247F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(140, 126).mirror().addBox(-1.0F, 0.1157F, -3.0001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(140, 126).addBox(1.8F, 0.1157F, -3.0001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 0.3075F, -1.2247F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(14, 156).mirror().addBox(-1.0F, -0.9657F, -0.0256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(14, 156).addBox(1.8F, -0.9657F, -0.0256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 0.1075F, 1.2753F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(3, 149).mirror().addBox(-1.0F, -0.9657F, -2.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 149).addBox(1.8F, -0.9657F, -2.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.1075F, 1.2753F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(115, 146).mirror().addBox(0.0F, -0.7F, 0.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 146).addBox(3.2F, -0.7F, 0.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.295F, -7.4259F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(153, 77).mirror().addBox(0.0F, -0.7F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(153, 77).addBox(2.2F, -0.7F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.295F, -7.4259F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(149, 5).mirror().addBox(-1.0F, 0.0264F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(149, 5).addBox(0.6F, 0.0264F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.0075F, -7.6247F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(134, 137).mirror().addBox(-1.0F, 0.0058F, -3.0376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4075F, -11.3247F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(39, 157).mirror().addBox(-1.0F, -0.0206F, -0.8434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3075F, -10.5247F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(156, 126).mirror().addBox(-1.0F, 0.0031F, -0.9918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0075F, -9.6247F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(29, 150).mirror().addBox(0.0F, 0.1753F, 0.7652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.1609F, -15.6444F, 0.5236F, 0.4014F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(49, 157).mirror().addBox(0.0F, -0.0221F, -0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.1609F, -15.6444F, 0.3142F, 0.4014F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(157, 49).mirror().addBox(-0.2463F, -0.6068F, -0.1031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6572F, 3.1664F, -14.7167F, 0.1144F, 0.4901F, -0.0795F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(150, 47).mirror().addBox(-0.4F, -0.4585F, -0.3087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.5857F, -16.074F, -0.3127F, 0.3166F, -0.1003F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(157, 46).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.531F, -15.8324F, 0.3319F, 0.1405F, -0.1356F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(44, 157).mirror().addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.7384F, -14.6193F, -0.2685F, 0.4225F, -0.1123F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-1.0F, -1.0316F, -2.7489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.9075F, -11.5247F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(21, 80).mirror().addBox(-1.0F, -1.9474F, -2.9743F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.5075F, -8.5247F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(50, 140).mirror().addBox(-1.0F, -1.0061F, -2.9665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(50, 140).addBox(1.8F, -1.0061F, -2.9665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, 1.4075F, -0.3247F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-1.0F, -2.0115F, -2.0484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(146, 0).addBox(1.8F, -2.0115F, -2.0484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 2.7075F, -7.1247F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(41, 146).mirror().addBox(-1.0F, -1.9447F, -1.9499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(41, 146).addBox(1.8F, -1.9447F, -1.9499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9F, 2.6075F, -5.2247F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(145, 142).mirror().addBox(-1.0F, -1.9447F, 0.0501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(145, 142).addBox(1.8F, -1.9447F, 0.0501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 2.6075F, -5.2247F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(134, 137).addBox(0.0F, 0.0058F, -3.0376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.4075F, -11.3247F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(39, 157).addBox(0.0F, -0.0206F, -0.8434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3F, 0.3075F, -10.5247F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(156, 126).addBox(0.0F, 0.0031F, -0.9918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.0075F, -9.6247F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(29, 150).addBox(-1.0F, 0.1753F, 0.7652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 2.1609F, -15.6444F, 0.5236F, -0.4014F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(49, 157).addBox(-1.0F, -0.0221F, -0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 2.1609F, -15.6444F, 0.3142F, -0.4014F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(157, 49).addBox(-0.7537F, -0.6068F, -0.1031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6572F, 3.1664F, -14.7167F, 0.1144F, -0.4901F, 0.0795F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(150, 47).addBox(-0.6F, -0.4585F, -0.3087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 2.5857F, -16.074F, -0.3127F, -0.3166F, 0.1003F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(157, 46).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 2.531F, -15.8324F, 0.3319F, -0.1405F, 0.1356F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(134, 134).addBox(-2.5F, -0.7558F, -0.1689F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8609F, -16.8444F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(133, 123).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.5609F, -16.5444F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(44, 157).addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.7384F, -14.6193F, -0.2685F, -0.4225F, 0.1123F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 139).addBox(0.0F, -1.0316F, -2.7489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.9075F, -11.5247F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(138, 6).addBox(-1.7178F, -0.7683F, -1.823F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 3.4075F, -14.7247F, -0.2437F, 0.0F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(21, 80).addBox(0.0F, -1.9474F, -2.9743F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.5075F, -8.5247F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 7.6F, -0.1051F, 0.0868F, -0.0091F));

		PartDefinition cube_r408 = tail.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(152, 109).addBox(0.0F, -6.452F, 5.3751F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 152).addBox(0.0F, -5.8867F, 3.5273F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(152, 102).addBox(0.0F, -5.5213F, 1.6796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7874F, 15.1679F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r409 = tail.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(82, 152).addBox(0.0F, -4.9559F, -0.1682F, 0.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7874F, 15.0679F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r410 = tail.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(54, 149).addBox(0.0F, -5.4908F, -0.1685F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7874F, 13.0679F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r411 = tail.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(51, 149).addBox(0.0F, -5.5258F, 0.0329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8874F, 10.8679F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r412 = tail.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(48, 149).addBox(0.0F, -5.4607F, 0.0344F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9874F, 8.8679F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(149, 15).addBox(0.0F, -5.6956F, 0.0341F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9874F, 6.8679F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(79, 148).addBox(0.0F, -5.8305F, 0.0338F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9874F, 4.8679F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r415 = tail.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(13, 124).addBox(0.0F, -5.8654F, 0.0352F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0874F, 2.8679F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r416 = tail.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -3.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 1.3891F, -0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r417 = tail.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 2.8891F, -0.1571F, 0.0F, -1.5708F));

		PartDefinition cube_r418 = tail.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 4.8891F, -0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r419 = tail.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 6.8891F, -0.0349F, 0.0F, -1.5708F));

		PartDefinition cube_r420 = tail.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 8.8891F, -0.0175F, 0.0F, -1.5708F));

		PartDefinition cube_r421 = tail.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 10.8891F, -0.0698F, 0.0F, -1.5708F));

		PartDefinition cube_r422 = tail.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 12.8891F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r423 = tail.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 14.8891F, -0.1134F, 0.0F, -1.5708F));

		PartDefinition cube_r424 = tail.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 17.0891F, -0.1571F, 0.0F, -1.5708F));

		PartDefinition cube_r425 = tail.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(122, 146).mirror().addBox(0.0F, -0.8F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(122, 146).mirror().addBox(-0.1F, -0.6F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9003F, 0.033F, 1.3891F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r426 = tail.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 8.8891F, -0.0175F, 0.0F, 1.5708F));

		PartDefinition cube_r427 = tail.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(122, 146).addBox(0.1F, -0.6F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(122, 146).addBox(0.0F, -0.8F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 1.3891F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r428 = tail.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 17.0891F, -0.1571F, 0.0F, 1.5708F));

		PartDefinition cube_r429 = tail.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 14.8891F, -0.1134F, 0.0F, 1.5708F));

		PartDefinition cube_r430 = tail.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 12.8891F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r431 = tail.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 10.8891F, -0.0698F, 0.0F, 1.5708F));

		PartDefinition cube_r432 = tail.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 6.8891F, -0.0349F, 0.0F, 1.5708F));

		PartDefinition cube_r433 = tail.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 4.8891F, -0.1047F, 0.0F, 1.5708F));

		PartDefinition cube_r434 = tail.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 2.8891F, -0.1571F, 0.0F, 1.5708F));

		PartDefinition cube_r435 = tail.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -3.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9003F, 0.033F, 1.3891F, -0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r436 = tail.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(122, 146).addBox(0.0F, -5.8003F, 0.0349F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0874F, 0.8679F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9126F, -0.1321F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 144).addBox(0.0F, -0.4183F, 0.0477F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3325F, 21.2343F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(142, 143).addBox(0.0F, 0.0002F, 0.0824F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3325F, 18.6343F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r440 = tail.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(12, 144).addBox(0.0F, 0.013F, -0.0855F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1325F, 16.1343F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(79, 156).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.096F, 14.5663F, 0.6632F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1266F, 21.8598F, -0.1152F, 0.1734F, -0.02F));

		PartDefinition cube_r442 = tail2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(102, 152).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r443 = tail2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(94, 153).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 11.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r444 = tail2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(20, 153).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 9.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r445 = tail2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(3, 153).addBox(0.0F, -4.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r446 = tail2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(134, 152).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r447 = tail2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(85, 152).addBox(0.0F, -4.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r448 = tail2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(109, 144).addBox(0.0F, 2.0258F, 3.9291F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 146).addBox(0.0F, 3.6258F, 5.9291F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 144).addBox(0.0F, 1.2258F, 1.9291F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 142).addBox(0.0F, -0.1742F, -0.0709F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, 4.1664F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r449 = tail2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(64, 140).addBox(0.0F, -0.1366F, -0.0681F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4199F, 1.7664F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 19.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.1392F, 0.346F, -0.0475F));

		PartDefinition cube_r450 = tail3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(62, 157).addBox(0.0F, -3.861F, 1.5701F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 157).addBox(0.0F, -2.861F, 0.0701F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 16.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(54, 157).addBox(0.0F, -2.9999F, -0.064F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 14.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(157, 52).addBox(0.0F, -2.8389F, 0.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 12.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(6, 157).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(145, 156).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(156, 129).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(154, 9).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(113, 157).addBox(0.0F, 13.2258F, 22.3291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 81).addBox(0.0F, 12.4258F, 20.3291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 154).addBox(0.0F, 10.7258F, 18.3291F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 154).addBox(0.0F, 9.9258F, 16.3291F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 152).addBox(0.0F, 8.3258F, 14.3291F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 150).addBox(0.0F, 6.4258F, 12.3291F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 150).addBox(0.0F, 5.7258F, 10.3291F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 150).addBox(0.0F, 5.1258F, 8.3291F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2199F, -8.7336F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(153, 120).addBox(0.0F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(97, 153).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 60).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 19.0F, 0.1347F, 0.4329F, 0.0568F));

		PartDefinition cube_r460 = tail4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(20, 159).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 10.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r461 = tail4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(159, 19).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 8.9F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r462 = tail4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(17, 159).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 6.9F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r463 = tail4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(14, 159).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.9F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(68, 157).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.9F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r465 = tail4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(65, 157).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.9F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r466 = tail4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(93, 159).addBox(0.0F, 19.0258F, 34.3291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 90).addBox(0.0F, 18.2258F, 32.3291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 86).addBox(0.0F, 17.5258F, 30.3291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 159).addBox(0.0F, 16.6258F, 28.3291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 159).addBox(0.0F, 15.8258F, 26.3291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 158).addBox(0.0F, 13.9258F, 24.3291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -27.7336F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(78, 26).addBox(-0.5F, -0.5062F, -0.0782F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 12.9F, 0.1584F, 0.1293F, 0.0206F));

		PartDefinition cube_r467 = tail5.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(159, 61).addBox(0.0F, -2.5F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 61).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, 5.9218F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r468 = tail5.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(159, 57).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, 3.9218F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail5.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(57, 159).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, 1.9218F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r470 = tail5.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(35, 159).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, -0.0782F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r471 = tail5.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(134, 159).addBox(0.0F, 23.7258F, 42.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 159).addBox(0.0F, 22.7258F, 40.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 129).addBox(0.0F, 21.7258F, 38.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 159).addBox(0.0F, 20.5258F, 36.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3137F, -40.7118F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(43, 43).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0716F, 8.7529F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r472 = tail6.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(74, 159).addBox(0.0F, -3.0679F, 1.4994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 65).addBox(0.0F, -1.9244F, -0.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 11.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r473 = tail6.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(158, 153).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r474 = tail6.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(116, 122).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 7.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r475 = tail6.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(26, 122).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r476 = tail6.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(96, 159).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail6.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(95, 39).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r478 = tail6.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(151, 159).addBox(0.0F, 26.9258F, 48.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 159).addBox(0.0F, 25.7258F, 46.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 142).addBox(0.0F, 24.7258F, 44.3291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2421F, -49.4647F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.4604F, -0.0976F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0999F, 15.0035F, -0.0806F, 0.5222F, -0.0403F));

		PartDefinition cube_r479 = tail7.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(102, 159).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4604F, 3.9024F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r480 = tail7.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(99, 159).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4604F, 1.9024F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r481 = tail7.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(89, 104).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4604F, -0.0976F, -0.3142F, 0.0F, 0.0F));

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