package fossils.fossils.client.blockentity.model.kutchicetus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KutchicetusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart bone;

	public KutchicetusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.neck2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.1819F, -4.8833F, -0.5842F, -0.0241F, -0.0364F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 60).addBox(0.0F, -1.0912F, 0.9459F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2146F, -2.0706F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 57).addBox(0.0F, -1.6274F, -0.0655F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2847F, -2.8862F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 37).mirror().addBox(-2.3148F, 0.0532F, -0.5494F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6048F, 4.6736F, -1.1069F, -0.2503F, 0.0463F, 0.9008F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 2).mirror().addBox(-0.5F, -2.3F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6147F, 0.1629F, -1.7889F, 2.372F, -0.2143F, 0.5428F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 38).mirror().addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8695F, 0.4505F, -1.4689F, 0.2951F, -0.2143F, 0.5428F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(-3.662F, -1.4595F, 0.4617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3869F, -1.5099F, -0.3772F, 0.2517F, -1.1465F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-2.1617F, -0.6881F, 0.4617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3869F, -1.5099F, -0.2511F, 0.3775F, -0.7451F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-1.3002F, -0.3639F, 0.4617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3869F, -1.5099F, -0.1409F, 0.4289F, -0.4658F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-1.023F, -0.1288F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9648F, -3.435F, -0.1857F, 0.5065F, -0.678F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 22).mirror().addBox(-1.9548F, -0.3892F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9648F, -3.435F, -0.3165F, 0.4409F, -0.9631F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 59).mirror().addBox(-2.5883F, -1.1035F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9648F, -3.435F, -0.4601F, 0.2868F, -1.3606F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.6781F, 0.041F, -1.117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, -0.6998F, -0.2143F, 0.5428F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.6781F, 0.8565F, -2.609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 0.33F, -0.2143F, 0.5428F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-0.6781F, -1.3496F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 0.714F, -0.2143F, 0.5428F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 17).mirror().addBox(-0.6781F, -2.7078F, -0.7526F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 1.5343F, -0.2143F, 0.5428F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(-0.6781F, -2.9606F, -0.7019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 1.8833F, -0.2143F, 0.5428F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.5744F, -1.667F, -2.3361F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 1.3511F, 0.2127F, 0.3881F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 11).mirror().addBox(-0.6781F, -1.8377F, -3.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7575F, 0.2886F, -0.6879F, 1.2201F, -0.2143F, 0.5428F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 6).mirror().addBox(-3.5639F, -0.0151F, -0.2441F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6135F, 4.8542F, 1.4994F, 0.4245F, 0.2201F, 0.8368F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-3.6148F, 0.237F, -0.9315F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1132F, 5.1216F, 0.196F, -0.0849F, 0.2784F, 0.7525F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-1.4148F, 0.3076F, -0.632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 3.9479F, -2.0627F, -0.4701F, 0.0162F, 0.8697F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 14).addBox(0.3002F, -0.3639F, 0.4617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3869F, -1.5099F, -0.1409F, -0.4289F, 0.4658F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 47).addBox(1.1617F, -0.6881F, 0.4617F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3869F, -1.5099F, -0.2511F, -0.3775F, 0.7451F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 52).addBox(1.662F, -1.4595F, 0.4617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3869F, -1.5099F, -0.3772F, -0.2517F, 1.1465F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 0).addBox(0.023F, -0.1288F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9648F, -3.435F, -0.1857F, -0.5065F, 0.678F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 22).addBox(0.9548F, -0.3892F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9648F, -3.435F, -0.3165F, -0.4409F, 0.9631F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 59).addBox(1.5883F, -1.1035F, 0.7808F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9648F, -3.435F, -0.4601F, -0.2868F, 1.3606F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 49).addBox(-0.3219F, 0.041F, -1.117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, -0.6998F, 0.2143F, -0.5428F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 0).addBox(-0.3219F, 0.8565F, -2.609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 0.33F, 0.2143F, -0.5428F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8695F, 0.4505F, -1.4689F, 0.2951F, 0.2143F, -0.5428F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5F, -2.3F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6147F, 0.1629F, -1.7889F, 2.372F, 0.2143F, -0.5428F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(9, 37).addBox(-0.3219F, -1.3496F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 0.714F, 0.2143F, -0.5428F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(35, 17).addBox(-0.3219F, -2.7078F, -0.7526F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 1.5343F, 0.2143F, -0.5428F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 40).addBox(-0.3219F, -2.9606F, -0.7019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 1.8833F, 0.2143F, -0.5428F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 35).addBox(-0.4256F, -1.667F, -2.3361F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 1.3511F, -0.2127F, -0.3881F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 11).addBox(-0.3219F, -1.8377F, -3.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7575F, 0.2886F, -0.6879F, 1.2201F, 0.2143F, -0.5428F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(18, 29).addBox(-1.0F, 3.1138F, 3.892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.2823F, -4.2798F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 6).addBox(-0.4361F, -0.0151F, -0.2441F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6135F, 4.8542F, 1.4994F, 0.4245F, -0.2201F, -0.8368F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(35, 0).addBox(-0.3852F, 0.237F, -0.9315F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1132F, 5.1216F, 0.196F, -0.0849F, -0.2784F, -0.7525F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(43, 37).addBox(-0.6852F, 0.0532F, -0.5494F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6048F, 4.6736F, -1.1069F, -0.2503F, -0.0463F, -0.9008F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 47).addBox(-0.5852F, 0.3076F, -0.632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 3.9479F, -2.0627F, -0.4701F, -0.0162F, -0.8697F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(39, 7).addBox(-1.0F, 0.996F, 2.265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.5823F, -3.2798F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 13).addBox(-1.5F, 0.3711F, 0.6837F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.5823F, -3.2798F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.2553F, -0.0229F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -3.7706F, 0.3578F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, -0.0171F, 0.2126F, 0.1707F, 0.0366F));

		PartDefinition cube_r45 = body6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(59, 58).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7489F, 1.5045F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-1.2803F, -0.1902F, 0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3405F, 0.519F, -0.2838F, 0.2496F, -0.5369F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-2.1874F, -0.5151F, 0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3405F, 0.519F, -0.3371F, 0.1691F, -0.7918F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-3.7533F, -1.3103F, 0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3405F, 0.519F, -0.3747F, 0.0276F, -1.1696F));

		PartDefinition cube_r50 = body6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 18).addBox(0.2803F, -0.1902F, 0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3405F, 0.519F, -0.2838F, -0.2496F, 0.5369F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 45).addBox(1.1874F, -0.5151F, 0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3405F, 0.519F, -0.3371F, -0.1691F, 0.7918F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 12).addBox(1.7533F, -1.3103F, 0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3405F, 0.519F, -0.3747F, -0.0276F, 1.1696F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3939F, 2.9994F, -0.1507F, 0.272F, 0.0467F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 59).addBox(0.0F, -1.0041F, -0.8523F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5176F, 2.6437F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(31, 59).addBox(0.0F, -0.8177F, -0.4807F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1669F, 0.402F, -0.4396F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.2677F, 0.3452F, -0.7143F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(-4.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.3789F, 0.2159F, -1.1103F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 59).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1669F, -0.402F, 0.4396F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 12).addBox(1.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.2677F, -0.3452F, 0.7143F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(19, 51).addBox(2.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.3789F, -0.2159F, 1.1103F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -1.0F, -9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4433F, 8.9202F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1307F, 3.6903F, 0.0879F, 0.4384F, -0.0057F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 54).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7704F, 0.7044F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(42, 2).addBox(-0.5F, -0.1512F, 7.7474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2624F, -7.4423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1754F, 1.9491F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(59, 55).addBox(0.0F, -0.3986F, 2.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 59).addBox(0.0F, -0.4986F, 0.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 17).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4473F, 0.1279F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-0.3F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0393F, 0.8501F, 0.6078F, -0.887F, -0.5067F, -0.632F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2853F, 1.5801F, 1.6534F, -0.8443F, -0.3871F, -0.422F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 41).mirror().addBox(-1.011F, -4.2338F, -2.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.468F, -0.549F, -1.1395F, -2.235F, -0.6477F, -1.3533F));

		PartDefinition cube_r68 = hips.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 45).mirror().addBox(-0.733F, -0.3495F, 0.1768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.468F, 0.151F, -0.0395F, -0.7673F, -0.7297F, -1.0432F));

		PartDefinition cube_r69 = hips.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-0.3546F, -3.6879F, 2.9538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.468F, -0.549F, -1.1395F, -1.178F, -0.5219F, -0.6455F));

		PartDefinition cube_r70 = hips.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.828F, -0.5443F, -0.1479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.468F, 0.151F, -0.0395F, -0.4243F, -0.2721F, -0.2165F));

		PartDefinition cube_r71 = hips.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(8, 54).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.598F, 0.154F, -0.2812F, -1.2478F, -0.1754F, -0.503F));

		PartDefinition cube_r72 = hips.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9503F, -0.4628F, -0.6147F, -0.9987F, -0.0716F, -0.5618F));

		PartDefinition cube_r73 = hips.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(16, 39).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2128F, -0.8588F, -0.4587F, -1.3652F, -0.0716F, -0.5618F));

		PartDefinition cube_r74 = hips.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-2.0F, -0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0568F, 0.4394F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r75 = hips.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 10).addBox(0.0F, -0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0568F, 0.4394F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r76 = hips.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(16, 39).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2128F, -0.8588F, -0.4587F, -1.3652F, 0.0716F, 0.5618F));

		PartDefinition cube_r77 = hips.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9503F, -0.4628F, -0.6147F, -0.9987F, 0.0716F, 0.5618F));

		PartDefinition cube_r78 = hips.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(8, 54).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.598F, 0.154F, -0.2812F, -1.2478F, 0.1754F, 0.503F));

		PartDefinition cube_r79 = hips.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 39).addBox(-0.172F, -0.5443F, -0.1479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.468F, 0.151F, -0.0395F, -0.4243F, 0.2721F, 0.2165F));

		PartDefinition cube_r80 = hips.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 48).addBox(-0.6454F, -3.6879F, 2.9538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.468F, -0.549F, -1.1395F, -1.178F, 0.5219F, 0.6455F));

		PartDefinition cube_r81 = hips.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(58, 9).addBox(-0.7F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0393F, 0.8501F, 0.6078F, -0.887F, 0.5067F, 0.632F));

		PartDefinition cube_r82 = hips.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 45).addBox(-0.267F, -0.3495F, 0.1768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.468F, 0.151F, -0.0395F, -0.7673F, 0.7297F, 1.0432F));

		PartDefinition cube_r83 = hips.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 41).addBox(0.011F, -4.2338F, -2.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.468F, -0.549F, -1.1395F, -2.235F, 0.6477F, 1.3533F));

		PartDefinition cube_r84 = hips.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(36, 28).addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2853F, 1.5801F, 1.6534F, -0.8443F, 0.3871F, 0.422F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.3902F, -0.0618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(23, 39).addBox(0.0F, -0.5902F, -0.0618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 49).addBox(0.0F, -0.5902F, 1.9382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 53).addBox(0.0F, -0.5902F, 3.9382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.491F, 3.6799F, -0.2604F, -0.2067F, 0.2307F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -0.3994F, -0.0157F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0495F, 4.8593F, -0.0303F, -0.3574F, 0.0993F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4244F, -0.0278F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0195F, 5.8983F, -0.2015F, -0.0855F, 0.0174F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.069F, 1.2686F, 0.2436F, -0.4918F, -0.2186F, -0.3126F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 17).addBox(-0.2786F, 0.0918F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 14).addBox(-0.2786F, -0.2082F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2214F, 1.4081F, -0.7902F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 32).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2846F, -0.2023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3425F, -0.1162F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0738F, 2.4219F, -0.3754F, 2.1584F, 1.1379F, -1.0956F));

		PartDefinition cube_r88 = leftLeg3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 52).addBox(0.0392F, -3.9838F, -0.5373F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5859F, -0.6978F, 0.3034F, -0.2029F, 0.1023F, 0.4608F));

		PartDefinition cube_r89 = leftLeg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 52).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1766F, -0.7416F, 0.2605F, -0.173F, 0.1337F, 0.6516F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.069F, 1.2686F, 0.2436F, 0.599F, 0.2186F, 0.3126F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(54, 23).addBox(-0.7214F, 0.0918F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 20).addBox(-0.7214F, -0.2082F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2214F, 1.4081F, -0.7902F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 6).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2846F, -0.2023F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3425F, -0.1162F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0738F, 2.4219F, -0.3754F, 1.8441F, -0.5325F, 1.4981F));

		PartDefinition cube_r93 = rightLeg3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 53).addBox(-0.0392F, -3.9838F, -0.5373F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5859F, -0.6978F, 0.3034F, -0.2029F, -0.1023F, -0.4608F));

		PartDefinition cube_r94 = rightLeg3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(31, 52).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1766F, -0.7416F, 0.2605F, -0.173F, -0.1337F, -0.6516F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8098F, 2.8507F, -3.0759F, -0.6111F, -0.067F, -0.2533F));

		PartDefinition cube_r95 = leftarm.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(8, 57).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.4273F, 1.2684F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r96 = leftarm.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(46, 48).addBox(-0.011F, -0.2746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4662F, 0.9306F, 0.0291F, 0.794F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0768F, 1.8668F, 1.7871F, -2.9637F, 1.393F, -2.5739F));

		PartDefinition cube_r97 = leftarm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(46, 6).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 1.1732F, 0.8099F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r98 = leftarm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 27).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.1764F, -0.2146F, 0.8357F, 0.0F, -0.1222F, 1.0385F));

		PartDefinition cube_r99 = leftarm2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(26, 48).addBox(-0.1335F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.5778F, 0.3785F, 0.1612F, -0.4629F, 0.5462F));

		PartDefinition cube_r100 = leftArm3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8098F, 2.8507F, -3.0759F, 0.4798F, 0.067F, 0.2533F));

		PartDefinition cube_r101 = rightarm.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(18, 57).addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4767F, -0.4273F, 1.2684F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r102 = rightarm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 0).addBox(-0.989F, -0.2746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4662F, 0.9306F, 0.0291F, 0.794F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0768F, 1.8668F, 1.7871F, 2.0862F, -1.2099F, -2.4451F));

		PartDefinition cube_r103 = rightarm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(21, 46).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 1.1732F, 0.8099F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r104 = rightarm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 39).addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.1764F, -0.2146F, 0.8357F, 0.0F, 0.1222F, -1.0385F));

		PartDefinition cube_r105 = rightarm2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 27).addBox(-0.8665F, -0.5622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.5778F, 0.3785F, 0.181F, 0.0459F, -0.1696F));

		PartDefinition cube_r106 = rightArm3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(11, 29).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2539F, -3.7545F, 0.0791F, -0.0453F, -0.044F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(47, 59).addBox(0.0F, -1.3314F, -0.861F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.9149F, 0.0553F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0612F, -0.2165F, -0.1701F, 0.5174F, -0.6703F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-1.898F, -0.1834F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0612F, -0.2165F, -0.3054F, 0.4552F, -0.9583F));

		PartDefinition cube_r110 = neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-2.6165F, -0.8919F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0612F, -0.2165F, -0.4562F, 0.3038F, -1.3595F));

		PartDefinition cube_r111 = neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(59, 24).addBox(1.6165F, -0.8919F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0612F, -0.2165F, -0.4562F, -0.3038F, 1.3595F));

		PartDefinition cube_r112 = neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 20).addBox(0.898F, -0.1834F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0612F, -0.2165F, -0.3054F, -0.4552F, 0.9583F));

		PartDefinition cube_r113 = neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(59, 16).addBox(-0.0851F, 0.0553F, -0.6034F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0612F, -0.2165F, -0.1701F, -0.5174F, 0.6703F));

		PartDefinition cube_r114 = neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, -0.4315F, -1.8645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0299F, -1.7964F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-1.922F, -0.0974F, 0.9135F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0682F, -2.6572F, -0.2358F, 0.615F, -0.1378F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(49, 4).addBox(-0.078F, -0.0974F, 0.9135F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0682F, -2.6572F, -0.2358F, -0.615F, 0.1378F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(5, 59).addBox(0.0F, -1.0073F, 0.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4278F, -1.0252F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 15).addBox(-0.5F, -0.466F, -1.916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0049F, -0.0064F, 0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3494F, -2.4824F, -0.8863F, -0.2486F, 0.2476F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(36, 36).addBox(-0.9F, -0.2695F, -0.3242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 3.8611F, -6.0505F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(43, 33).addBox(-0.9F, -0.0462F, -1.9871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.1387F, -4.5287F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(37, 44).addBox(-0.9F, -0.0675F, -1.7471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 0.984F, -3.81F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 24).addBox(-0.9F, -0.1896F, 0.1175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4F, 6.3083F, -8.5607F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 49).addBox(-0.5F, 0.9951F, -0.9106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(42, 19).addBox(-0.5F, -0.0049F, -1.9106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2089F, -3.3879F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(24, 23).addBox(0.0F, -0.1648F, -0.305F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.221F, -2.6071F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(54, 56).addBox(0.0F, 1.4475F, 0.3037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(49, 19).addBox(0.0F, -0.0525F, 0.0037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.1866F, -3.3317F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 56).addBox(-0.5F, 0.0136F, -0.0221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2371F, -0.5822F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(43, 27).addBox(-0.5F, 0.0035F, -1.022F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -4.2795F, 0.8384F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(56, 3).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.2101F, -0.087F, 0.925F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r129 = leftOrbit.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(27, 34).addBox(-1.8623F, -0.5527F, -0.2245F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0035F, -0.8833F, 1.8053F, 0.9147F, -0.6595F, -0.6108F));

		PartDefinition cube_r130 = leftOrbit.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(56, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0856F, 0.4761F, 0.3981F, 0.827F, 0.0672F, 0.1082F));

		PartDefinition cube_r131 = leftOrbit.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(23, 42).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.204F, 0.7126F, -0.1115F, 0.5743F, 0.1324F, 0.1664F));

		PartDefinition cube_r132 = leftOrbit.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(36, 32).addBox(-0.7821F, -0.44F, -0.3028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1965F, 0.1664F, 0.5978F, 0.8088F, -0.1185F, -0.1157F));

		PartDefinition cube_r133 = leftOrbit.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(56, 59).addBox(-0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0199F, 2.8757F, -2.4625F, 0.6236F, 0.3197F, 0.1823F));

		PartDefinition cube_r134 = leftOrbit.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(18, 34).addBox(-0.8757F, -0.2487F, -2.8714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1602F, 1.2557F, -1.1794F, 0.6685F, 0.3568F, 0.2567F));

		PartDefinition cube_r135 = leftOrbit.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 33).addBox(-0.9552F, 0.8612F, -2.378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.2208F, 0.0892F, -0.0451F));

		PartDefinition cube_r136 = leftOrbit.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 56).addBox(-0.6628F, 0.2853F, -0.5972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.6684F, 0.3721F, -0.3231F));

		PartDefinition cube_r137 = leftOrbit.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(27, 56).addBox(-0.7642F, -0.2427F, -0.5965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.6222F, 0.4472F, -0.44F));

		PartDefinition cube_r138 = leftOrbit.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(56, 6).addBox(-0.8319F, -0.1929F, -1.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.6152F, 0.4568F, -0.4561F));

		PartDefinition cube_r139 = leftOrbit.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 30).addBox(-0.9042F, 0.1383F, -2.0143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.5043F, 0.3314F, -0.2961F));

		PartDefinition cube_r140 = leftOrbit.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(27, 29).addBox(-0.8F, -0.5419F, -2.6993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6F, 5.267F, -5.4935F, 0.7524F, 0.0658F, 0.0573F));

		PartDefinition cube_r141 = leftOrbit.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 52).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0684F, -1.0744F, -1.3367F, -0.7733F, 0.8964F, -0.9745F));

		PartDefinition cube_r142 = leftOrbit.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(13, 57).addBox(-0.6934F, -0.5675F, -0.117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8F, 5.2211F, -5.5782F, 0.5442F, 0.0855F, 0.0746F));

		PartDefinition cube_r143 = leftOrbit.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(13, 23).addBox(-0.6607F, -0.4009F, 0.5993F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8F, 5.2211F, -5.5782F, 0.7696F, 0.0618F, 0.0619F));

		PartDefinition cube_r144 = leftOrbit.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 40).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7533F, -1.0371F, 1.1258F, 0.8602F, 0.6782F, -0.4182F));

		PartDefinition cube_r145 = leftOrbit.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(29, 62).addBox(-0.8602F, -1.0238F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 62).addBox(-0.8602F, -0.4238F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6298F, 0.0019F, -1.3598F, -1.7045F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftOrbit.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(42, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0092F, -0.1517F, -1.6836F, -1.719F, 1.0003F, -0.2741F));

		PartDefinition cube_r147 = leftOrbit.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(58, 39).addBox(-0.4431F, -0.2605F, -0.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.6298F, 0.0019F, -1.3598F, -1.9986F, 0.8088F, -0.2525F));

		PartDefinition cube_r148 = leftOrbit.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 26).addBox(-0.4431F, -0.3166F, -0.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6298F, 0.0019F, -1.3598F, -1.3703F, 0.8088F, -0.2525F));

		PartDefinition cube_r149 = leftOrbit.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 9).addBox(-0.9F, -1.0F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -1.049F, 2.8854F, 0.6465F, 0.0395F, 0.0344F));

		PartDefinition cube_r150 = leftOrbit.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(34, 59).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 59).addBox(0.0F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 4.6717F, -4.3608F, 0.7915F, 0.1183F, 0.1035F));

		PartDefinition cube_r151 = leftOrbit.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 44).addBox(-0.65F, -0.3158F, -1.5814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.8F, 5.6182F, -6.8341F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftOrbit.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(33, 23).addBox(-0.4431F, 0.2819F, -1.1772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.6298F, 0.0019F, -1.3598F, -0.0439F, 0.8088F, -0.2525F));

		PartDefinition cube_r153 = leftOrbit.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 8).addBox(-0.4431F, 0.6109F, -1.6891F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6298F, 0.0019F, -1.3598F, 0.1918F, 0.8088F, -0.2525F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.2F, 0.4933F, -1.5002F));

		PartDefinition cube_r154 = rightOrbit.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(27, 34).mirror().addBox(-0.1377F, -0.5527F, -0.2245F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0035F, -0.8833F, 1.8053F, 0.9147F, 0.6595F, 0.6108F));

		PartDefinition cube_r155 = rightOrbit.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0856F, 0.4761F, 0.3981F, 0.827F, -0.0672F, -0.1082F));

		PartDefinition cube_r156 = rightOrbit.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(23, 42).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.204F, 0.7126F, -0.1115F, 0.5743F, -0.1324F, -0.1664F));

		PartDefinition cube_r157 = rightOrbit.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-0.2179F, -0.44F, -0.3028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1965F, 0.1664F, 0.5978F, 0.8088F, 0.1185F, 0.1157F));

		PartDefinition cube_r158 = rightOrbit.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0199F, 2.8757F, -2.4625F, 0.6236F, -0.3197F, -0.1823F));

		PartDefinition cube_r159 = rightOrbit.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(18, 34).mirror().addBox(-0.1243F, -0.2487F, -2.8714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1602F, 1.2557F, -1.1794F, 0.6685F, -0.3568F, -0.2567F));

		PartDefinition cube_r160 = rightOrbit.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(55, 33).mirror().addBox(-0.0448F, 0.8612F, -2.378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.2208F, -0.0892F, 0.0451F));

		PartDefinition cube_r161 = rightOrbit.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 56).mirror().addBox(-0.3372F, 0.2853F, -0.5972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.6684F, -0.3721F, 0.3231F));

		PartDefinition cube_r162 = rightOrbit.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-0.2358F, -0.2427F, -0.5965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.6222F, -0.4472F, 0.44F));

		PartDefinition cube_r163 = rightOrbit.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(56, 6).mirror().addBox(-0.1681F, -0.1929F, -1.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.6152F, -0.4568F, 0.4561F));

		PartDefinition cube_r164 = rightOrbit.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-0.0958F, 0.1383F, -2.0143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.5043F, -0.3314F, 0.2961F));

		PartDefinition cube_r165 = rightOrbit.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 29).mirror().addBox(-0.2F, -0.5419F, -2.6993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6F, 5.267F, -5.4935F, 0.7524F, -0.0658F, -0.0573F));

		PartDefinition cube_r166 = rightOrbit.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(36, 52).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0684F, -1.0744F, -1.3367F, -0.7733F, -0.8964F, 0.9745F));

		PartDefinition cube_r167 = rightOrbit.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(13, 57).mirror().addBox(-0.3066F, -0.5675F, -0.117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8F, 5.2211F, -5.5782F, 0.5442F, -0.0855F, -0.0746F));

		PartDefinition cube_r168 = rightOrbit.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(13, 23).mirror().addBox(-0.3393F, -0.4009F, 0.5993F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8F, 5.2211F, -5.5782F, 0.7696F, -0.0618F, -0.0619F));

		PartDefinition cube_r169 = rightOrbit.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(41, 40).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7533F, -1.0371F, 1.1258F, 0.8602F, -0.6782F, 0.4182F));

		PartDefinition cube_r170 = rightOrbit.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(29, 62).mirror().addBox(-0.1398F, -1.0238F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 62).mirror().addBox(-0.1398F, -0.4238F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6298F, 0.0019F, -1.3598F, -1.7045F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightOrbit.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0092F, -0.1517F, -1.6836F, -1.719F, -1.0003F, 0.2741F));

		PartDefinition cube_r172 = rightOrbit.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-0.5569F, -0.2605F, -0.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.6298F, 0.0019F, -1.3598F, -1.9986F, -0.8088F, 0.2525F));

		PartDefinition cube_r173 = rightOrbit.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-0.5569F, -0.3166F, -0.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6298F, 0.0019F, -1.3598F, -1.3703F, -0.8088F, 0.2525F));

		PartDefinition cube_r174 = rightOrbit.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.1F, -1.0F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2F, -1.049F, 2.8854F, 0.6465F, -0.0395F, -0.0344F));

		PartDefinition cube_r175 = rightOrbit.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 59).mirror().addBox(0.0F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.6717F, -4.3608F, 0.7915F, -0.1183F, -0.1035F));

		PartDefinition cube_r176 = rightOrbit.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(2.15F, 6.2279F, -6.8492F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightOrbit.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(-0.35F, -0.3158F, -1.5814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.8F, 5.6182F, -6.8341F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightOrbit.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 23).mirror().addBox(-0.5569F, 0.2819F, -1.1772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(1.6298F, 0.0019F, -1.3598F, -0.0439F, -0.8088F, 0.2525F));

		PartDefinition cube_r179 = rightOrbit.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-0.5569F, 0.6109F, -1.6891F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6298F, 0.0019F, -1.3598F, 0.1918F, -0.8088F, 0.2525F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.1442F, -0.1346F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(14, 43).mirror().addBox(-0.7F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.7981F, -11.0911F, -0.9044F, 0.1966F, -0.4885F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1689F, 0.6692F, -7.8248F, -1.4483F, -0.1041F, -0.0119F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8413F, 1.0943F, -8.0063F, -1.5178F, -0.1034F, -0.0173F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-0.4F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7765F, 1.1947F, -9.9496F, -1.5033F, -0.0537F, -0.0304F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(0.0014F, -0.1049F, -2.0571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.0618F, -1.7673F, -1.3293F, -0.1948F, -0.0185F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(22, 53).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.0438F, 1.1553F, -6.2582F, -1.5926F, -0.1254F, -0.0341F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(17, 53).mirror().addBox(-0.0424F, -0.1457F, -0.2283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.6624F, -5.4913F, -1.5227F, -0.1254F, -0.0341F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(0.1576F, 0.7543F, -1.2283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4618F, -5.4673F, -1.5406F, -0.127F, -0.0274F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-0.0873F, 0.0057F, -1.1696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.5305F, -3.5583F, -1.5023F, -0.2641F, -0.035F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(11, 60).mirror().addBox(0.4031F, 3.1557F, -2.1171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 2.0618F, -1.7673F, -1.5008F, -0.2819F, -0.0245F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(41, 52).mirror().addBox(-0.0177F, -2.2236F, -1.5391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1149F, -3.7591F, -1.5047F, -0.1813F, -0.0525F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-0.0873F, 0.006F, -0.9783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.5305F, -3.5583F, -1.5547F, -0.2641F, -0.035F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(49, 53).mirror().addBox(-1.0F, -1.5196F, -0.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(49, 53).addBox(1.6F, -1.5196F, -0.1127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 0.8774F, -2.0258F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(-1.0F, -0.0187F, -1.5433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 11).addBox(1.6F, -0.0187F, -1.5433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 1.9774F, 0.1742F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(-0.6F, 2.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(57, 36).addBox(2.2F, 2.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.9F, -2.6535F, 0.5143F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 56).addBox(1.7F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, -1.3184F, -0.5206F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(-1.1F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1094F)).mirror(false)
				.texOffs(49, 15).addBox(1.7F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1094F)), PartPose.offsetAndRotation(-1.4F, -1.0448F, -1.2723F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(31, 48).addBox(2.1F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9F, -1.0599F, -1.2619F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(32, 56).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.5559F, -8.8481F, -1.6093F, -0.0679F, -0.5909F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.7887F, -9.6719F, -1.6217F, -0.0509F, -0.5391F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8898F, -10.4686F, -1.4967F, 0.0462F, -0.5568F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(14, 43).addBox(-0.3F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.6F, 0.7981F, -11.0911F, -0.9044F, -0.1966F, 0.4885F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(59, 52).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0311F, 0.6692F, -7.8248F, -1.4483F, 0.1041F, 0.0119F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(51, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3587F, 1.0943F, -8.0063F, -1.5178F, 0.1034F, 0.0173F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(48, 39).addBox(-0.6F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4235F, 1.1947F, -9.9496F, -1.5033F, 0.0537F, 0.0304F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(41, 48).addBox(-1.0014F, -0.1049F, -2.0571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 2.0618F, -1.7673F, -1.3293F, 0.1948F, 0.0185F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(22, 53).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1562F, 1.1553F, -6.2582F, -1.5926F, 0.1254F, 0.0341F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(17, 53).addBox(-0.9576F, -0.1457F, -0.2283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4189F, 0.6624F, -5.4913F, -1.5227F, 0.1254F, 0.0341F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(14, 60).addBox(-0.1576F, 0.7543F, -1.2283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.4618F, -5.4673F, -1.5406F, 0.127F, 0.0274F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(49, 23).addBox(-0.9127F, 0.0057F, -1.1696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 1.5305F, -3.5583F, -1.5023F, 0.2641F, 0.035F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(11, 60).addBox(-0.4031F, 3.1557F, -2.1171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.0618F, -1.7673F, -1.5008F, 0.2819F, 0.0245F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(41, 52).addBox(-0.9823F, -2.2236F, -1.5391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8F, 2.1149F, -3.7591F, -1.5047F, 0.1813F, 0.0525F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(51, 49).addBox(-0.9127F, 0.006F, -0.9783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8F, 1.5305F, -3.5583F, -1.5547F, 0.2641F, 0.035F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.3F, 0.5559F, -8.8481F, -1.6093F, 0.0679F, 0.5909F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.4F, 0.7887F, -9.6719F, -1.6217F, 0.0509F, 0.5391F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(42, 23).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.4F, 0.8898F, -10.4686F, -1.4967F, -0.0462F, 0.5568F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(54, 53).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 1.1677F, -11.0427F, -1.7453F, 0.0F, 0.0F));

		PartDefinition bone = neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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