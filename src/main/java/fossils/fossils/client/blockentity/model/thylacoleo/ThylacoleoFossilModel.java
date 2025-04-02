package fossils.fossils.client.blockentity.model.thylacoleo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThylacoleoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftThumb;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightThumb;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ThylacoleoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftZygomaticarch = this.head.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.head.getChild("rightZygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.0F, 10.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 20).addBox(0.0F, -0.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 18).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 54).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 0).addBox(-1.5F, 0.0F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 4).mirror().addBox(-0.2F, -0.4707F, -0.3619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0469F, -0.717F, -1.0868F, -0.2029F, -0.5223F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-0.9F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3618F, 1.1495F, -0.8038F, -0.0901F, 0.0404F, -0.5445F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 45).mirror().addBox(-0.2F, 1.9231F, 1.1001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0469F, -0.717F, -0.092F, -0.2029F, -0.5223F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 24).mirror().addBox(-0.0151F, -0.6863F, 0.1459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.2531F, 3.283F, -1.5898F, 0.4488F, -1.1556F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-0.3F, -0.0033F, -0.0666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.6469F, 2.683F, -0.6959F, -0.7883F, -0.0919F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.2F, -0.9955F, -0.071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 32).addBox(1.2F, -0.9955F, -0.071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0469F, -1.317F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 46).mirror().addBox(-2.2F, -0.6F, -4.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(8, 46).addBox(1.2F, -0.6F, -4.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5469F, 0.283F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 59).mirror().addBox(-0.1F, -0.1571F, -1.8007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -3.3469F, -3.517F, -0.5565F, 0.2237F, -0.1371F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 24).addBox(-0.9849F, -0.6863F, 0.1459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.2531F, 3.283F, -1.5898F, -0.4488F, 1.1556F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 44).addBox(-0.7F, -0.0033F, -0.0666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -0.6469F, 2.683F, -0.6959F, 0.7883F, 0.0919F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 18).addBox(-0.1F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3618F, 1.1495F, -0.8038F, -0.0901F, -0.0404F, 0.5445F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 45).addBox(-0.8F, 1.9231F, 1.1001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, -1.0469F, -0.717F, -0.092F, 0.2029F, 0.5223F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 4).addBox(-0.8F, -0.4707F, -0.3619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0469F, -0.717F, -1.0868F, 0.2029F, 0.5223F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 59).addBox(-0.9F, -0.1571F, -1.8007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -3.3469F, -3.517F, -0.5565F, -0.2237F, 0.1371F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, 0.3F, -0.1F, 0.2486F, -0.0525F, -0.0008F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 31).addBox(-2.0F, -1.3F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0091F, -0.1157F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 35).addBox(-1.0F, -8.2703F, -0.0231F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 8.5959F, -0.62F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 4).addBox(-1.0F, -1.9F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, -0.234F, -1.2986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.0675F, 0.5422F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -0.6661F, -1.2893F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0675F, 0.5422F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.8769F, 0.6997F, 1.3426F, -0.029F, -0.0164F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 23).addBox(-1.4F, -0.1519F, -1.6581F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.4F, 0.2737F, 0.1554F, 0.096F, 0.0F, 0.0698F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 60).addBox(-0.5F, -0.0584F, -0.4419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 57).addBox(-0.5F, -0.8584F, -0.9419F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.686F, 1.0319F, -0.2617F, -0.0024F, -0.0698F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, 3.439F, -1.09F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.686F, 1.0319F, -0.0872F, -0.0024F, -0.0698F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 39).addBox(-0.9F, 1.4725F, -0.6583F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4F, 0.2737F, 0.1554F, -0.1222F, 0.0F, 0.0698F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(25, 45).addBox(-0.9F, 1.4848F, -1.3149F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.2737F, 0.1554F, -0.0349F, 0.0F, 0.0698F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 9.6737F, -0.8446F, -0.6768F, -0.1763F, 0.0914F));

		PartDefinition cube_r26 = leftLeg3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 48).addBox(-1.5F, -3.0F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4557F, -0.1179F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(18, 25).addBox(-2.1F, -0.1629F, -2.9132F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.0414F, -0.8063F, 0.968F, -0.0051F, -0.0055F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, 0.3F, -0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 6).addBox(-1.0F, -1.3F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0091F, -0.1157F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(11, 35).addBox(0.0F, -8.2703F, -0.0231F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 8.5959F, -0.62F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 46).addBox(0.0F, -1.9F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 11.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -0.234F, -1.2986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.0675F, 0.5422F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(53, 50).addBox(-1.0F, -0.6661F, -1.2893F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0675F, 0.5422F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.8769F, 0.6997F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 43).addBox(-0.6F, -0.1519F, -1.6581F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.4F, 0.2737F, 0.1554F, 0.096F, 0.0F, -0.0698F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 35).addBox(-0.5F, -0.0584F, -0.4419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 30).addBox(-0.5F, -0.8584F, -0.9419F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.686F, 1.0319F, -0.2617F, 0.0024F, 0.0698F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(21, 54).addBox(-0.5F, 3.439F, -1.09F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.686F, 1.0319F, -0.0872F, 0.0024F, 0.0698F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 50).addBox(-0.1F, 1.4725F, -0.6583F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.4F, 0.2737F, 0.1554F, -0.1222F, 0.0F, -0.0698F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 45).addBox(-0.1F, 1.4848F, -1.3149F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 0.2737F, 0.1554F, -0.0349F, 0.0F, -0.0698F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 9.6737F, -0.8446F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -3.0F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4557F, -0.1179F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(16, 20).addBox(-0.9F, -0.1629F, -2.9132F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.0414F, -0.8063F, 0.2705F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -3.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 55).addBox(-0.5F, -2.7F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 67).addBox(-0.5F, -2.8F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 68).addBox(-0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -5.5F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-1.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.5499F, -1.4446F, -0.1068F, -0.1996F, 0.0213F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-1.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5499F, -3.4446F, -0.1053F, 0.1041F, -0.011F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-1.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5499F, -5.4446F, -0.1326F, 0.659F, -0.0815F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 46).addBox(0.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.5499F, -1.4446F, -0.1068F, 0.1996F, -0.0213F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(71, 10).addBox(0.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5499F, -3.4446F, -0.1053F, -0.1041F, 0.011F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 71).addBox(0.0F, -0.0418F, -0.1022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5499F, -5.4446F, -0.1326F, -0.659F, 0.0815F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(11, 12).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.0F, -5.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.5F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 69).addBox(-0.5F, -2.6816F, 1.9256F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 71).addBox(-0.5F, -2.0816F, -0.0744F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2F, -7.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(20, 30).addBox(-1.0F, -0.0024F, -3.426F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.2F, -4.5F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, -2.438F, -0.0476F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(39, 11).mirror().addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7636F, 7.6797F, -5.4741F, 0.0001F, 0.5811F, 0.6358F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-2.5F, 0.4F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1166F, 5.7098F, -3.7158F, 0.9329F, 0.7942F, 1.1807F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-2.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6849F, 3.5159F, -1.646F, 1.7778F, 0.6361F, 1.7406F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-3.2036F, -1.9215F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.3643F, -0.6346F, 0.6248F, -1.2042F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.3643F, -0.1486F, 0.8493F, -0.5017F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.3643F, 0.3787F, 0.7912F, 0.2053F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-4.2036F, -1.9215F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4537F, -3.3643F, -0.4151F, 0.587F, -1.0135F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 51).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4537F, -3.3643F, 0.0115F, 0.7045F, -0.3236F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4537F, -3.3643F, 0.3829F, 0.607F, 0.2734F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 9).mirror().addBox(-6.2036F, -1.9215F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9537F, -5.1643F, -0.2162F, 0.467F, -1.0003F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9537F, -5.1643F, 0.0871F, 0.5044F, -0.3677F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9537F, -5.1643F, 0.3218F, 0.4044F, 0.1563F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4537F, -7.1643F, 0.302F, 0.2837F, 0.0449F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4537F, -7.1643F, 0.1345F, 0.3899F, -0.4519F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 29).mirror().addBox(-7.2036F, -1.9215F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4537F, -7.1643F, -0.1046F, 0.3986F, -1.0581F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 0).addBox(-1.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6849F, 3.5159F, -1.646F, 1.7778F, -0.6361F, -1.7406F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(50, 28).addBox(-1.5F, 0.4F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1166F, 5.7098F, -3.7158F, 0.9329F, -0.7942F, -1.1807F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(39, 11).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7636F, 7.6797F, -5.4741F, 0.0001F, -0.5811F, -0.6358F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 69).addBox(-0.5F, -2.2681F, -0.0419F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(65, 48).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.3643F, -0.1486F, -0.8493F, 0.5017F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(71, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.3643F, 0.3787F, -0.7912F, -0.2053F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(71, 45).addBox(2.2036F, -1.9215F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.3643F, -0.6346F, -0.6248F, 1.2042F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(14, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4537F, -7.1643F, 0.302F, -0.2837F, -0.0449F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 38).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4537F, -7.1643F, 0.1345F, -0.3899F, 0.4519F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(38, 29).addBox(2.2036F, -1.9215F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4537F, -7.1643F, -0.1046F, -0.3986F, 1.0581F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(52, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9537F, -5.1643F, 0.3218F, -0.4044F, -0.1563F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 44).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9537F, -5.1643F, 0.0871F, -0.5044F, 0.3677F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 9).addBox(2.2036F, -1.9215F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9537F, -5.1643F, -0.2162F, -0.467F, 1.0003F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 24).addBox(2.2036F, -1.9215F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4537F, -3.3643F, -0.4151F, -0.587F, 1.0135F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 51).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4537F, -3.3643F, 0.0115F, -0.7045F, 0.3236F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4537F, -3.3643F, 0.3829F, -0.607F, -0.2734F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -0.5F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.5F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -8.0F, 0.1308F, -0.001F, -0.0018F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 71).addBox(0.0F, -3.2046F, 4.0654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 71).addBox(0.0F, -2.6046F, 2.0654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 71).addBox(0.0F, -2.0046F, 0.0654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(63, 17).mirror().addBox(-1.7543F, -0.5744F, -1.0527F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.7604F, -2.7033F, 1.296F, -0.2912F, 0.3147F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 7).mirror().addBox(-0.8317F, -1.5111F, -1.4211F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.7604F, -2.7033F, 1.1893F, -0.2716F, 0.3845F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-1.9193F, -0.5744F, 0.4186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.7604F, -2.7033F, 1.2315F, -0.2116F, 0.5723F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(27, 26).mirror().addBox(-0.8317F, -2.2382F, 0.1943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.7604F, -2.7033F, 0.7705F, -0.2716F, 0.3845F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(9, 28).mirror().addBox(-0.8317F, -1.9744F, 0.768F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.7604F, -2.7033F, 1.2766F, -0.2716F, 0.3845F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(28, 7).addBox(-0.1683F, -1.5111F, -1.4211F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0F, 2.7604F, -2.7033F, 1.1893F, 0.2716F, -0.3845F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(63, 17).addBox(0.7543F, -0.5744F, -1.0527F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.7604F, -2.7033F, 1.296F, 0.2912F, -0.3147F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 18).addBox(0.9193F, -0.5744F, 0.4186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.7604F, -2.7033F, 1.2315F, 0.2116F, -0.5723F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(9, 28).addBox(-0.1683F, -1.9744F, 0.768F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.7604F, -2.7033F, 1.2766F, 0.2716F, -0.3845F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(59, 22).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.5466F, -3.7203F, -0.3547F, 0.0099F, 0.4073F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(-4.7376F, -0.1138F, -0.572F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.4466F, -1.8203F, -0.3493F, 0.0642F, 0.5548F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-5.5773F, 0.0182F, -0.6732F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.1466F, 0.1797F, -0.3341F, 0.1709F, 0.6471F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1537F, -0.9643F, 0.2949F, 0.1268F, -0.0961F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(43, 41).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1537F, -0.9643F, 0.205F, 0.2478F, -0.5693F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(20, 7).mirror().addBox(-6.2036F, -1.9215F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1537F, -0.9643F, 0.0394F, 0.3179F, -1.1472F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-5.2036F, -1.9215F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1537F, -2.9643F, 0.0816F, 0.2802F, -1.1343F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(16, 30).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1537F, -2.9643F, 0.2188F, 0.1943F, -0.5659F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(28, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1537F, -2.9643F, 0.2825F, 0.073F, -0.0969F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 23).mirror().addBox(-4.2036F, -1.9215F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0537F, -4.8643F, 0.1373F, 0.3905F, -1.3079F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0537F, -4.8643F, 0.3254F, 0.2586F, -0.7339F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(26, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0537F, -4.8643F, 0.4046F, 0.0842F, -0.2793F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(43, 36).mirror().addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.172F, -4.6475F, -0.3284F, 0.2027F, 0.5335F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 23).addBox(2.2036F, -1.9215F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0537F, -4.8643F, 0.1373F, -0.3905F, 1.3079F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 25).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0537F, -4.8643F, 0.3254F, -0.2586F, 0.7339F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(26, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0537F, -4.8643F, 0.4046F, -0.0842F, 0.2793F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1537F, -2.9643F, 0.2825F, -0.073F, 0.0969F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(16, 30).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1537F, -2.9643F, 0.2188F, -0.1943F, 0.5659F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(59, 20).addBox(2.2036F, -1.9215F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1537F, -2.9643F, 0.0816F, -0.2802F, 1.1343F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(71, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1537F, -0.9643F, 0.2949F, -0.1268F, 0.0961F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(43, 41).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1537F, -0.9643F, 0.205F, -0.2478F, 0.5693F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(20, 7).addBox(2.2036F, -1.9215F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1537F, -0.9643F, 0.0394F, -0.3179F, 1.1472F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 26).addBox(-0.1683F, -2.2382F, 0.1943F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 2.7604F, -2.7033F, 0.7705F, 0.2716F, -0.3845F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(43, 36).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 5.172F, -4.6475F, -0.3284F, -0.2027F, -0.5335F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 0).addBox(-0.4227F, 0.0182F, -0.6732F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.1466F, 0.1797F, -0.3341F, -0.1709F, -0.6471F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(21, 39).addBox(-0.2624F, -0.1138F, -0.572F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.4466F, -1.8203F, -0.3493F, -0.0642F, -0.5548F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 22).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.5466F, -3.7203F, -0.3547F, -0.0099F, -0.4073F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(11, 3).addBox(-0.5F, -0.6F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4F, 0.6F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.6F, -7.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.6F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 4.8651F, -3.3441F, -0.0514F, 0.3248F, -0.8232F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(10, 11).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0131F, -0.0741F, -0.4254F, 0.1744F, 0.0013F, -0.0011F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(45, 60).addBox(-1.0F, -0.0873F, -1.1134F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3099F, 3.856F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 61).addBox(-0.2F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(31, 62).addBox(0.2F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.3099F, 1.556F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -3.711F, -0.243F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.5F, 3.5099F, 0.256F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 66).addBox(0.0F, -0.346F, 0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 63).addBox(0.0F, -0.346F, -0.3366F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 3.5099F, 0.356F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(62, 63).addBox(0.0F, -0.1111F, -0.9556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5099F, 0.856F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(52, 11).addBox(-1.5F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.8237F, 3.8199F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.5389F, 4.1847F, -1.3038F, -0.4835F, 1.2786F));

		PartDefinition cube_r127 = leftarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(68, 29).addBox(-0.9913F, -0.4978F, -0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.764F, 0.6298F, 0.2549F, -1.5708F, -1.3614F, 1.6755F));

		PartDefinition cube_r128 = leftarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(55, 35).addBox(-1.8166F, 4.6678F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.764F, 0.6298F, 0.2549F, -1.5708F, -1.2392F, 1.6755F));

		PartDefinition cube_r129 = leftarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 58).addBox(-0.923F, 0.3881F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.764F, 0.6298F, 0.2549F, -1.5708F, -1.0647F, 1.6755F));

		PartDefinition cube_r130 = leftarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(36, 65).addBox(-0.0006F, 0.0084F, -0.0596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, 1.5708F, 1.1694F, -1.6232F));

		PartDefinition cube_r131 = leftarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(62, 41).addBox(0.9297F, -2.0736F, -0.0596F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, 1.5708F, -0.7679F, -1.6232F));

		PartDefinition cube_r132 = leftarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(14, 59).addBox(-1.0052F, -0.0909F, -0.0596F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, -1.5708F, -1.0734F, 1.5184F));

		PartDefinition cube_r133 = leftarm2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(19, 61).addBox(-1.3354F, 4.4407F, -0.0596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.064F, 1.6298F, 0.7549F, -1.5708F, -1.1519F, 1.5184F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0551F, -3.5341F, -0.2304F, -0.3446F, 0.5369F));

		PartDefinition cube_r134 = leftArm3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(59, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.1745F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.4605F, -0.0824F, 0.6969F, 0.0337F, 0.0294F));

		PartDefinition cube_r135 = leftArm4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 27).addBox(-1.4F, -0.6107F, -2.4276F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 1.7F, 0.0F, -0.1014F, -0.0062F, 0.5896F));

		PartDefinition cube_r136 = leftThumb.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(37, 70).addBox(-1.0F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7157F, 1.6789F, 0.1F, 0.0F, 0.0F, 2.0508F));

		PartDefinition cube_r137 = leftThumb.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(36, 45).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(0.1F, 2.0F, 0.1F, 0.0F, 0.0F, 1.5272F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 4.8651F, -3.3441F, -0.5216F, -0.1584F, 0.663F));

		PartDefinition cube_r138 = rightarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(10, 2).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0131F, -0.0741F, -0.4254F, 0.1744F, -0.0013F, 0.0011F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 2).addBox(-1.0F, -0.0873F, -1.1134F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3099F, 3.856F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 18).addBox(-0.8F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(20, 11).addBox(-1.2F, -0.0423F, -0.9809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.3099F, 1.556F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.711F, -0.243F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.5F, 3.5099F, 0.256F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 66).addBox(-1.0F, -0.346F, 0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 52).addBox(-1.0F, -0.346F, -0.3366F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 3.5099F, 0.356F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 28).addBox(-1.0F, -0.1111F, -0.9556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5099F, 0.856F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightarm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(7, 51).addBox(-0.5F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.8237F, 3.8199F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.5389F, 4.1847F, -0.7464F, 0.6251F, -0.7098F));

		PartDefinition cube_r145 = rightarm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 26).addBox(-0.0087F, -0.4978F, -0.0424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, 0.2549F, -1.5708F, 1.3614F, -1.6755F));

		PartDefinition cube_r146 = rightarm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 55).addBox(0.8166F, 4.6678F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, 0.2549F, -1.5708F, 1.2392F, -1.6755F));

		PartDefinition cube_r147 = rightarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 54).addBox(-0.077F, 0.3881F, -0.0424F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.764F, 0.6298F, 0.2549F, -1.5708F, 1.0647F, -1.6755F));

		PartDefinition cube_r148 = rightarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 33).addBox(-0.9994F, 0.0084F, -0.0596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, 1.5708F, -1.1694F, 1.6232F));

		PartDefinition cube_r149 = rightarm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(62, 6).addBox(-2.9297F, -2.0736F, -0.0596F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, 1.5708F, 0.7679F, 1.6232F));

		PartDefinition cube_r150 = rightarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(26, 58).addBox(0.0052F, -0.0909F, -0.0596F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, -1.5708F, 1.0734F, -1.5184F));

		PartDefinition cube_r151 = rightarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(5, 61).addBox(0.3354F, 4.4407F, -0.0596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, 1.6298F, 0.7549F, -1.5708F, 1.1519F, -1.5184F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0551F, -3.5341F, -0.2338F, 0.7124F, -0.4492F));

		PartDefinition cube_r152 = rightArm3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(55, 42).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.1745F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 1.4605F, -0.0824F, 0.6533F, -0.0337F, -0.0294F));

		PartDefinition cube_r153 = rightArm4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(26, 18).addBox(-1.6F, -0.6107F, -2.4276F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create().texOffs(45, 64).addBox(-0.6F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 1.7F, 0.0F, 0.0713F, -0.209F, -0.5597F));

		PartDefinition cube_r154 = rightThumb.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(70, 35).addBox(0.0F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7157F, 1.6789F, 0.1F, 0.0F, 0.0F, -2.0508F));

		PartDefinition cube_r155 = rightThumb.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(44, 4).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.1F, 0.0F, 0.0F, -1.5272F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5F, -6.2F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -2.0051F, 2.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 27).addBox(0.0F, -1.0051F, 0.0436F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.8F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r158 = neck.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(36, 18).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6462F, -1.7674F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r159 = neck.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(8, 18).addBox(0.0F, -1.5F, 0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 13).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(33, 14).addBox(-2.5F, 0.0F, -0.6F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 13).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9978F, -0.208F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(35, 53).mirror().addBox(-3.0F, -0.0304F, -0.2527F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9978F, -0.208F, -0.1323F, -0.1142F, -0.708F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 53).addBox(0.0F, -0.0304F, -0.2527F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -2.9978F, -0.208F, -0.1323F, 0.1142F, 0.708F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, 0.9493F, -0.0002F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 15).addBox(-0.5F, -0.0507F, -0.0002F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(21, 41).addBox(-2.0F, 1.0082F, 0.0179F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(68, 20).addBox(-0.5F, 0.0082F, 0.0179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, -2.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(32, 41).addBox(-2.0F, -0.0151F, 0.0375F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -0.0236F, -0.0312F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.4F, -5.7F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-0.8F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.3024F, -4.6248F, 0.6717F, -0.6972F, -0.5993F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(53, 46).addBox(-1.2F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -2.3024F, -4.6248F, 0.6717F, 0.6972F, 0.5993F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(46, 18).addBox(-0.5F, 1.006F, -0.4663F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-1.0F, 0.006F, -1.4663F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -6.1F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(61, 13).addBox(-1.0F, -0.0184F, 0.0278F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -6.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(70, 57).addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -7.9767F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 7).addBox(-0.5F, -0.6F, -0.4522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.0F, 0.2569F, -8.1978F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-1.1F, 0.3002F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false)
				.texOffs(70, 32).mirror().addBox(-1.1F, -0.2998F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 70).addBox(0.1F, 0.3002F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F))
				.texOffs(70, 32).addBox(0.1F, -0.2998F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5F, -8.6F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-0.2F, -0.1905F, -0.2254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.2F, -8.7F, -0.0347F, -0.0036F, -0.1047F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(0.3F, -0.8F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2003F, 1.8562F, -5.4466F, 0.0155F, -0.3038F, -0.0253F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-0.7F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2003F, 1.8562F, -5.4466F, 0.1028F, -0.3038F, -0.0253F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(42, 55).mirror().addBox(-0.0365F, -0.9843F, 0.0553F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.6355F, -6.5581F, -0.0194F, -0.4537F, -0.1835F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-0.5F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1211F, 0.6602F, -6.0453F, -0.0339F, -1.0295F, -0.1629F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 65).addBox(-0.8F, -0.1905F, -0.2254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 1.2F, -8.7F, -0.0347F, 0.0036F, 0.1047F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(47, 31).addBox(-1.0F, -1.0962F, 0.0128F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4F, -8.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(55, 4).addBox(-0.5F, -1.0F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1211F, 0.6602F, -6.0453F, -0.0339F, 1.0295F, 0.1629F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 70).addBox(-1.3F, -0.8F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2003F, 1.8562F, -5.4466F, 0.0155F, 0.3038F, 0.0253F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(54, 23).addBox(-0.3F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2003F, 1.8562F, -5.4466F, 0.1028F, 0.3038F, 0.0253F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(35, 36).addBox(-2.9635F, -0.2843F, -1.9447F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.6355F, -6.5581F, 0.24F, 0.4497F, 0.3775F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 55).addBox(-0.9635F, -0.9843F, 0.0553F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.6355F, -6.5581F, -0.0194F, 0.4537F, 0.1835F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(37, 48).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition leftZygomaticarch = head.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.1564F, -5.5582F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r187 = leftZygomaticarch.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(20, 2).addBox(1.0F, -1.9843F, 0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 36).addBox(1.0F, -2.5843F, 0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -0.7F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftZygomaticarch.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(70, 17).addBox(1.0F, -0.9756F, -1.0998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.7F, 0.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftZygomaticarch.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 70).addBox(1.0F, -1.0502F, -0.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.7F, -0.2F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftZygomaticarch.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(67, 0).addBox(-1.0F, -1.5639F, -0.1866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.2F, -1.3963F, -0.2094F, 0.0F));

		PartDefinition cube_r191 = leftZygomaticarch.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 68).addBox(-1.0123F, -1.1596F, -0.3637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.7F, 2.6F, -1.3963F, -0.3752F, 0.0F));

		PartDefinition cube_r192 = leftZygomaticarch.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(66, 9).addBox(-0.9202F, 0.0429F, -0.261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -0.7F, 4.8F, -1.7934F, -0.8344F, 0.0445F));

		PartDefinition cube_r193 = leftZygomaticarch.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(41, 68).addBox(-1.0123F, -0.8092F, -0.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, -0.7F, 2.6F, -1.7628F, -0.3752F, 0.0F));

		PartDefinition cube_r194 = leftZygomaticarch.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(65, 57).addBox(-1.0F, -1.5355F, -0.5884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.2F, -1.3439F, -0.2094F, 0.0F));

		PartDefinition cube_r195 = leftZygomaticarch.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(14, 70).addBox(1.0F, -1.0502F, -0.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.7F, -0.2F, -0.9948F, 0.0F, 0.0F));

		PartDefinition rightZygomaticarch = head.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.1564F, -5.5582F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r196 = rightZygomaticarch.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 2).mirror().addBox(-2.0F, -1.9843F, 0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 36).mirror().addBox(-2.0F, -2.5843F, 0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, -0.7F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightZygomaticarch.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-2.0F, -0.9756F, -1.0998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.7F, 0.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightZygomaticarch.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-2.0F, -1.0502F, -0.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.7F, -0.2F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightZygomaticarch.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(0.0F, -1.5639F, -0.1866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 1.2F, -1.3963F, 0.2094F, 0.0F));

		PartDefinition cube_r200 = rightZygomaticarch.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(0.0123F, -1.1596F, -0.3637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.7F, 2.6F, -1.3963F, 0.3752F, 0.0F));

		PartDefinition cube_r201 = rightZygomaticarch.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.0798F, 0.0429F, -0.261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, -0.7F, 4.8F, -1.7934F, 0.8344F, -0.0445F));

		PartDefinition cube_r202 = rightZygomaticarch.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(41, 68).mirror().addBox(0.0123F, -0.8092F, -0.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.7F, 2.6F, -1.7628F, 0.3752F, 0.0F));

		PartDefinition cube_r203 = rightZygomaticarch.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(0.0F, -1.5355F, -0.5884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 1.2F, -1.3439F, 0.2094F, 0.0F));

		PartDefinition cube_r204 = rightZygomaticarch.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-2.0F, -1.0502F, -0.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -0.7F, -0.2F, -0.9948F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.0F, -1.0F, 0.2703F, 0.0182F, 0.0181F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.8019F, -2.3128F, 0.7939F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2202F, -2.8428F, -1.309F, -0.0524F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.0036F, -0.4246F, 0.2694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 65).mirror().addBox(-0.0036F, -0.0084F, -0.5391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.9202F, -2.8428F, -1.0647F, -0.384F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(49, 70).mirror().addBox(-0.6F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 48).mirror().addBox(-0.6F, -0.5F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7594F, 2.0378F, -4.364F, -2.5386F, -0.3073F, -0.1667F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(29, 67).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6796F, 2.8943F, -6.3799F, -1.96F, -0.1108F, -0.1199F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.729F, -1.9801F, 0.0709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6381F, 2.9175F, -5.5885F, -1.9538F, 0.0869F, 0.2238F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-0.0036F, 0.5899F, 1.8469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.9202F, -2.8428F, -1.9897F, -0.384F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.8019F, -0.9861F, -0.3241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2202F, -2.5428F, -0.5236F, -0.0524F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-0.8019F, 0.9344F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2202F, -2.5428F, -0.3142F, -0.0524F, 0.0F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(-0.8019F, -0.2013F, 0.5379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2202F, -2.5428F, -0.4014F, -0.0524F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4613F, 0.742F, 0.189F, -1.0472F, -0.0524F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 40).addBox(-0.1981F, -0.2013F, 0.5379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.2202F, -2.5428F, -0.4014F, 0.0524F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(15, 54).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8613F, 0.742F, 0.189F, -1.0472F, 0.0524F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(14, 53).addBox(-0.1981F, -2.3128F, 0.7939F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4F, 0.2202F, -2.8428F, -1.309F, 0.0524F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(10, 65).addBox(-0.9964F, -0.4246F, 0.2694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 65).addBox(-0.9964F, -0.0084F, -0.5391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2F, 1.9202F, -2.8428F, -1.0647F, 0.384F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(49, 70).addBox(-0.4F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 48).addBox(-0.4F, -0.5F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1594F, 2.0378F, -4.364F, -2.5386F, 0.3073F, 0.1667F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(29, 67).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0796F, 2.8943F, -6.3799F, -1.96F, 0.1108F, 0.1199F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 67).addBox(-0.271F, -1.9801F, 0.0709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0381F, 2.9175F, -5.5885F, -1.9538F, -0.0869F, -0.2238F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(67, 53).addBox(-0.9964F, 0.5899F, 1.8469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2F, 1.9202F, -2.8428F, -1.9897F, 0.384F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(66, 69).addBox(-0.1981F, 0.9344F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.2202F, -2.5428F, -0.3142F, 0.0524F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(67, 61).addBox(-0.1981F, -0.9861F, -0.3241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4F, 0.2202F, -2.5428F, -0.5236F, 0.0524F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(8, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(20, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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