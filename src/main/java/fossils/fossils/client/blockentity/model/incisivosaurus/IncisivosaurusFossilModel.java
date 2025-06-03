package fossils.fossils.client.blockentity.model.incisivosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IncisivosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public IncisivosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, -1.0012F, 0.0471F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 5).mirror().addBox(-0.8735F, 0.2185F, -1.8631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.86F, -0.2837F, 0.2071F, 1.1131F, -0.1137F, -0.2363F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 8).mirror().addBox(-0.4764F, 3.0742F, -4.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(5, 46).mirror().addBox(-0.4764F, 3.0742F, -3.8431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, 0.3658F, -0.2607F, -0.1591F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.1092F, 0.0815F, -1.074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 3.9163F, -0.7929F, -0.2687F, -0.207F, -0.2249F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-0.6768F, -1.0478F, -1.6027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, 0.0045F, -0.1236F, -0.279F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-1.0379F, 1.2726F, -1.2778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.86F, -0.2837F, 0.2071F, 0.6607F, -0.069F, -0.2968F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-1.0379F, -0.2794F, -0.7339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.86F, -0.2837F, 0.2071F, 0.2942F, -0.069F, -0.2968F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 35).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3415F, 0.5025F, -0.9162F, 0.1355F, 0.0315F, -0.2599F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 40).mirror().addBox(-1.14F, -3.222F, -0.9307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(45, 40).addBox(3.86F, -3.222F, -0.9307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-1.14F, -3.2769F, -1.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 44).addBox(3.86F, -3.2769F, -1.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(27, 25).addBox(4.5F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, -1.0514F, -1.182F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(4, 55).mirror().addBox(-1.1123F, -4.3096F, -2.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.76F, 2.1163F, -0.6929F, 0.2994F, 0.2079F, 0.0259F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-1.1123F, -3.6169F, -2.9613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.76F, 2.1163F, -0.6929F, 0.0027F, 0.2079F, 0.0259F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 19).mirror().addBox(-1.0F, -0.1F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(11, 19).addBox(1.4F, -0.1F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.6537F, -0.2254F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 34).addBox(0.1123F, -3.6169F, -2.9613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.76F, 2.1163F, -0.6929F, 0.0027F, -0.2079F, -0.0259F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(4, 55).addBox(0.1123F, -4.3096F, -2.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.76F, 2.1163F, -0.6929F, 0.2994F, -0.2079F, -0.0259F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 35).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3415F, 0.5025F, -0.9162F, 0.1355F, -0.0315F, 0.2599F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 51).addBox(0.0379F, 1.2726F, -1.2778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, -0.2837F, 0.2071F, 0.6607F, 0.069F, 0.2968F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 47).addBox(0.0379F, -0.2794F, -0.7339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.86F, -0.2837F, 0.2071F, 0.2942F, 0.069F, 0.2968F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 5).addBox(-0.1265F, 0.2185F, -1.8631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, -0.2837F, 0.2071F, 1.1131F, 0.1137F, 0.2363F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 50).addBox(-0.3232F, -1.0478F, -1.6027F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, 2.1163F, -0.1929F, 0.0045F, 0.1236F, 0.279F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 48).addBox(-0.8908F, 0.0815F, -1.074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.86F, 3.9163F, -0.7929F, -0.2687F, 0.207F, 0.2249F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(55, 8).addBox(-0.5236F, 3.0742F, -4.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(5, 46).addBox(-0.5236F, 3.0742F, -3.8431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.86F, 2.1163F, -0.1929F, 0.3658F, 0.2607F, 0.1591F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 11).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(19, 46).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 0.7F, -0.65F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(33, 23).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(5, 31).addBox(-0.9F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.8362F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 35).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(19, 32).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -1.7874F, 0.057F, -0.1466F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 12).mirror().addBox(-1.6F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.1345F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(31, 15).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(31, 15).mirror().addBox(-2.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(19, 46).mirror().addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 0.7F, -0.65F, -0.4938F, -0.0623F, -0.1152F));

		PartDefinition cube_r27 = rightLeg1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 30).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(33, 23).mirror().addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(5, 31).mirror().addBox(-0.1F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.8362F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 35).mirror().addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(19, 32).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.3946F, 0.278F, -0.5631F, 0.1037F, 0.08F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(22, 12).mirror().addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 12).addBox(-0.4F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(31, 15).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(31, 15).addBox(0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 48).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.2376F, 0.2089F, -0.4878F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 38).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, -0.0739F, 0.3276F, -1.5346F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.1116F, 0.3171F, -0.9634F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 40).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.14F, 0.2951F, -1.1294F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.252F, 0.177F, -0.6596F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.252F, -0.177F, 0.6596F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 40).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.14F, -0.2951F, 1.1294F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 38).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, -0.0739F, -0.3276F, 1.5346F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 44).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.1116F, -0.3171F, 0.9634F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.2376F, -0.2089F, 0.4878F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -2.081F, 0.0894F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.5F, -3.3F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 17).addBox(-2.5F, -0.998F, -1.9675F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4434F, -3.1099F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.7016F, -0.0017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, 0.0044F, -5.9051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -3.8F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 56).addBox(-0.5F, -0.1964F, -2.2441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 44).addBox(-1.0F, 0.0036F, -2.2441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 45).addBox(-0.5F, -0.909F, -0.0167F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 56).addBox(-0.5F, -0.676F, -0.1108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-3.8689F, -0.1412F, -0.6723F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0605F, 4.1942F, -3.0194F, 0.3155F, 1.2009F, 0.3221F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-2.2689F, -0.1412F, -0.6723F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0605F, 4.1942F, -3.0194F, 0.1207F, 0.8486F, 0.1053F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-1.1586F, -0.0121F, -0.8356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2366F, 3.4371F, -3.2418F, -0.1525F, 0.0563F, -0.003F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(0.3871F, 0.0152F, 0.1726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 3.5261F, -5.5865F, 1.1673F, -0.0037F, 0.0374F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(29, 3).mirror().addBox(-1.3903F, -2.5254F, -1.9711F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(29, 3).addBox(3.6097F, -2.5254F, -1.9711F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6097F, 2.8261F, -2.7865F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.1597F, 0.1578F, -1.2102F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1124F, 1.7262F, -4.9776F, 0.1418F, -0.5239F, -0.5752F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(34, 19).mirror().addBox(-1.3903F, -2.6517F, 0.705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 19).addBox(3.6097F, -2.6517F, 0.705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6097F, 2.8261F, -2.7865F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(37, 32).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, -0.0085F, 0.6829F, -1.594F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(5, 27).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, 0.5903F, 0.3276F, -0.4849F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, 0.3906F, 0.5756F, -0.933F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 38).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, -0.0722F, 0.5198F, -1.514F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 21).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.2294F, 0.4757F, -0.8979F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(27, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.4124F, 0.3003F, -0.4239F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.3639F, 0.1863F, -0.3969F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.2394F, 0.3527F, -0.8552F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.014F, 0.4232F, -1.4361F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(5, 27).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, 0.5903F, -0.3276F, 0.4849F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(19, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, 0.3906F, -0.5756F, 0.933F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 32).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, -0.0085F, -0.6829F, 1.594F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(27, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.4124F, -0.3003F, 0.4239F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 21).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.2294F, -0.4757F, 0.8979F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 38).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, -0.0722F, -0.5198F, 1.514F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 0).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.014F, -0.4232F, 1.4361F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 28).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.2394F, -0.3527F, 0.8552F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.3639F, -0.1863F, 0.3969F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(45, 29).addBox(0.3903F, -2.297F, -1.1923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6097F, 2.8261F, -2.7865F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(36, 0).addBox(-0.8403F, 0.1578F, -1.2102F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 1.7262F, -4.9776F, 0.1418F, 0.5239F, 0.5752F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(11, 0).addBox(-1.3871F, 0.0152F, 0.1726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6097F, 3.5261F, -5.5865F, 1.1673F, 0.0037F, -0.0374F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 33).addBox(-0.8414F, -0.0121F, -0.8356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2366F, 3.4371F, -3.2418F, -0.1525F, -0.0563F, 0.003F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 0).addBox(-0.1311F, -0.1412F, -0.6723F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0605F, 4.1942F, -3.0194F, 0.3155F, -1.2009F, -0.3221F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(41, 0).addBox(-0.7311F, -0.1412F, -0.6723F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0605F, 4.1942F, -3.0194F, 0.1207F, -0.8486F, -0.1053F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(7, 25).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2474F, 2.9395F, -4.4157F, 0.1807F, 0.919F, -1.1828F));

		PartDefinition cube_r79 = leftArm1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(34, 50).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftArm1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 45).addBox(0.0F, -2.9F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftArm1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(29, 48).addBox(0.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.6353F, -0.6475F, -0.8294F, 0.0387F, -0.0202F));

		PartDefinition cube_r82 = leftArm2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(49, 23).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftArm2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 48).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftArm2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(24, 46).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftArm2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(41, 47).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(36, 6).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(27, 30).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 37).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.4F, 0.3864F, -0.212F, 0.2292F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2474F, 2.9395F, -4.4157F, 0.4692F, -0.8798F, 0.9818F));

		PartDefinition cube_r86 = rightArm1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(34, 50).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightArm1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 45).mirror().addBox(-1.0F, -2.9F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightArm1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(29, 48).mirror().addBox(-1.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.6353F, -0.6475F, -0.9167F, -0.0387F, 0.0202F));

		PartDefinition cube_r89 = rightArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(0.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(46, 48).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 46).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(41, 47).mirror().addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(27, 30).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 37).mirror().addBox(0.0F, 1.7F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.4F, 0.3864F, 0.212F, -0.2292F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -5.8F, -0.3646F, 0.2865F, -0.1074F));

		PartDefinition cube_r93 = neck3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -1.3F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 19).addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, -0.4496F, 0.2409F, 0.0808F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 26).addBox(-0.5F, -0.3262F, 2.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 56).addBox(-0.5F, -0.5262F, 0.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9F, -2.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -2.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -0.8762F, -0.0153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(44, 14).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.6F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 31).addBox(-1.0F, -0.4F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4365F, 0.2836F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 11).addBox(-1.0F, -0.0924F, 0.0561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2933F, -0.383F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(46, 2).addBox(-1.0F, -0.4457F, 0.0814F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4933F, 0.117F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(30, 53).addBox(0.1F, -0.2369F, -0.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(44, 53).addBox(0.1F, -0.2369F, 0.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3933F, -0.883F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 38).addBox(0.0F, -0.0366F, -1.9991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -0.9481F, -2.2506F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(40, 38).addBox(0.0F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8481F, -0.6506F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 5).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6636F, -1.9776F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-1.02F, -0.4988F, -0.9418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(15, 50).addBox(0.42F, -0.4988F, -0.9418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(-0.2F, -0.244F, -0.8258F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(40, 42).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 42).addBox(0.94F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.72F, 0.3403F, -1.0187F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 38).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(38, 12).mirror().addBox(-0.5F, -1.0555F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 1.1153F, -0.1723F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 42).mirror().addBox(-0.8803F, -0.4F, -1.5486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.1142F, -2.8768F, 0.9399F, -0.4266F, -0.2443F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(41, 3).mirror().addBox(-0.9077F, -0.4229F, -0.5631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.1142F, -2.8768F, 0.4091F, 0.1889F, 0.2261F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.41F, -0.8886F, -1.7723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.114F)).mirror(false)
				.texOffs(0, 44).addBox(0.87F, -0.8886F, -1.7723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(-0.73F, 0.3684F, -1.6422F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-0.33F, -0.4958F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 54).mirror().addBox(-0.54F, -0.4958F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 54).addBox(1.0F, -0.4958F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 23).addBox(0.79F, -0.4958F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.73F, 0.8684F, -2.2422F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 7).mirror().addBox(-0.41F, -0.1219F, -1.8461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(43, 7).addBox(0.87F, -0.1219F, -1.8461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.73F, 0.2684F, -1.6422F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(-0.41F, -0.0829F, -1.8753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(22, 38).addBox(0.87F, -0.0829F, -1.8753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.73F, 0.9684F, -1.3422F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-0.44F, -0.3F, -0.9337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(39, 52).addBox(0.84F, -0.3F, -0.9337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 1.527F, -2.6663F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(52, 35).addBox(0.14F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.32F, 2.0008F, -3.6285F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(49, 54).mirror().addBox(-0.435F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 54).addBox(0.205F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.385F, 2.5152F, -3.4692F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 51).mirror().addBox(-0.51F, -0.6F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false)
				.texOffs(24, 55).mirror().addBox(-0.49F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 2.5621F, -4.5013F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(35, 54).mirror().addBox(-0.92F, 1.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 54).addBox(0.32F, 1.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.0965F, -5.3519F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(17, 42).mirror().addBox(-0.8F, -0.9577F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 42).addBox(-0.2F, -0.9577F, -1.9337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.5067F, -2.183F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(14, 25).mirror().addBox(-0.6F, -0.8709F, -1.5261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(14, 25).addBox(-0.4F, -0.8709F, -1.5261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.7067F, -3.783F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 3).addBox(-0.0923F, -0.4229F, -0.5631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.1142F, -2.8768F, 0.4091F, -0.1889F, -0.2261F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 42).addBox(-0.1197F, -0.4F, -1.5486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.1142F, -2.8768F, 0.9399F, 0.4266F, 0.2443F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(9, 54).addBox(-0.7142F, -0.2F, -0.5975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5142F, 0.9142F, -2.8768F, 0.6283F, 0.1222F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(18, 27).addBox(-1.0F, 0.6869F, -1.7895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(30, 9).addBox(-1.0F, -0.0131F, -0.0895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.4067F, -4.383F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, -0.1399F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.9797F, -5.2853F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.1817F, -0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(54, 11).addBox(-0.5F, -0.1817F, -0.1807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.7797F, -5.2853F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-0.7F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(50, 8).addBox(-0.1F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1F, 4.9698F, -4.5306F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(51, 20).addBox(0.1F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3F, 4.345F, -4.3903F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 16).addBox(0.8F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.1524F, -3.4711F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(24, 42).addBox(-1.0F, -2.0013F, -0.9318F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.5067F, -1.683F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(42, 25).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 19).addBox(-1.0F, -2.0F, -0.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.2067F, -1.183F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5F, -1.0555F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(15, 38).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.72F, 1.1153F, -0.1723F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(51, 51).addBox(-0.49F, -0.6F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F))
				.texOffs(24, 55).addBox(-0.51F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(0.33F, 2.5621F, -4.5013F, 1.0472F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.9598F, 0.55F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(49, 12).mirror().addBox(-0.2F, -0.4F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 12).addBox(0.6F, -0.4F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.5164F, -4.2501F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-1.0F, -0.4955F, -2.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(19, 55).addBox(-0.8F, -0.4955F, -2.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(0.3F, 1.5278F, -3.0019F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(-1.0F, -0.1689F, -0.1176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 52).addBox(-0.8F, -0.1689F, -0.1176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1499F)), PartPose.offsetAndRotation(0.3F, 1.2278F, -4.2019F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-1.0F, -0.1874F, -0.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)).mirror(false)
				.texOffs(55, 18).addBox(-0.8F, -0.1874F, -0.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3F, 1.6278F, -4.7019F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(53, 2).mirror().addBox(-1.0F, -0.7369F, -0.7925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 2).addBox(-0.8F, -0.7369F, -0.7925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 2.0278F, -3.9019F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-1.3F, -0.6749F, -1.2092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(39, 17).addBox(-0.5F, -0.6749F, -1.2092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.3F, 1.5278F, -3.0019F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-1.0F, -0.8065F, -0.8258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.9278F, -1.1019F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(39, 21).mirror().addBox(-1.0F, -0.8412F, -1.8655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.151F)).mirror(false)
				.texOffs(39, 21).addBox(0.2F, -0.8412F, -1.8655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.2F, 0.6278F, -0.0019F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(5, 40).mirror().addBox(-1.0F, -0.8943F, -1.8737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 40).addBox(0.2F, -0.8943F, -1.8737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 1.3278F, -1.6019F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 50).addBox(0.84F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.77F, 0.9898F, -2.3055F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(-1.0F, -0.1902F, -1.8934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(37, 28).addBox(0.2F, -0.1902F, -1.8934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2F, 0.2278F, -2.3019F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(-1.0F, -0.0675F, -1.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(40, 32).addBox(0.2F, -0.0675F, -1.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, 0.0278F, -1.2019F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(35, 40).mirror().addBox(-1.0F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(35, 40).addBox(0.2F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.2F, 0.0278F, 0.6981F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(53, 15).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(53, 15).addBox(0.7F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.7F, 0.2971F, -0.2856F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(52, 30).addBox(0.0F, -0.8065F, -0.8258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.9278F, -1.1019F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(40, 55).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 27).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 2.7F, 0.0598F, 0.1293F, -0.0206F));

		PartDefinition cube_r149 = tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 10).addBox(0.0F, -1.1719F, -0.3732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9809F, 2.9397F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(22, 12).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 19).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.3978F, 0.2942F, 0.0728F));

		PartDefinition cube_r151 = tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(57, 0).addBox(0.0F, 1.7F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 57).addBox(0.0F, 1.0F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 51).addBox(0.0F, 0.3F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5077F, -0.9941F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.4272F, 0.3054F, -0.0028F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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