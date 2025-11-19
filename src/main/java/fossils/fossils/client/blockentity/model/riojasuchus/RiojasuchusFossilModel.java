package fossils.fossils.client.blockentity.model.riojasuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RiojasuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
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
	private final ModelPart tail8;
	private final ModelPart tail9;

	public RiojasuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.bone = this.hip.getChild("bone");
		this.bone4 = this.hip.getChild("bone4");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.leftArm = this.chest2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.neck2 = this.chest2.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.0F, 3.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 84).addBox(-0.5F, -2.1594F, -0.0776F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 1.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 34).addBox(-0.5F, -2.4281F, -0.0926F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -0.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -3.9119F, 1.9924F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 53).addBox(-2.0F, 0.0F, 0.075F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -4.1799F, -1.0709F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-2.0F, 0.3F, 0.9F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 55).addBox(1.0F, 0.3F, 0.9F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 29).addBox(0.0F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hip.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3007F, -1.0591F, 0.5377F, 0.0F, 0.0F, 0.2531F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 86).addBox(-0.5497F, -0.0101F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, 0.1222F, 0.0F, -0.2967F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 57).addBox(-0.5497F, -0.3097F, 0.0202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -0.1222F, 0.0F, -0.2967F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(84, 39).addBox(-0.5497F, -0.48F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -0.384F, 0.0F, -0.2967F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 20).addBox(-0.5497F, -0.4089F, -1.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -0.6021F, 0.0F, -0.2967F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 80).addBox(-0.5497F, 0.4362F, -1.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -1.3003F, 0.0F, -0.2967F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 11).addBox(-0.5497F, 0.2034F, -1.8124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -0.5585F, 0.0F, -0.2967F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 3).addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 0.2583F, -0.1793F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 17).addBox(-0.5F, -0.775F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0426F, 0.8523F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 14).addBox(-0.5F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, 0.0426F, 0.8523F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 62).addBox(-0.5497F, -0.1972F, -1.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, -0.0349F, 0.0F, -0.2967F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5F, -1.0F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, 0.8F, 0.0F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 54).addBox(-1.0F, -0.8354F, -1.314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, 1.7715F, 0.0F, 0.2182F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(78, 74).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, 0.8F, 0.0F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 63).addBox(-0.2188F, -2.2297F, 2.4208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -2.4696F, 0.0F, 0.1222F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(71, 74).addBox(-0.7943F, -0.4812F, -0.2227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(69, 22).addBox(-0.7943F, -0.5073F, -0.2637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5218F, 2.9541F, -2.6561F, -2.0159F, 0.0F, 0.3403F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 46).addBox(-0.2188F, -0.4327F, -0.2182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F))
				.texOffs(0, 82).addBox(-0.2188F, -0.4327F, 1.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 15).addBox(-0.2188F, -0.4588F, -0.2592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -2.0159F, 0.0F, 0.1222F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(81, 14).addBox(-0.2188F, -0.3268F, 1.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -1.9635F, 0.0F, 0.1222F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(92, 41).addBox(-0.2188F, -0.0665F, 2.2044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -1.8588F, 0.0F, 0.1222F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 63).addBox(-0.2188F, 0.4362F, 2.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(93, 56).addBox(-0.2188F, 0.2362F, 2.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F))
				.texOffs(27, 93).addBox(-0.2188F, 0.2362F, 2.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -1.6842F, 0.0F, 0.1222F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 70).addBox(-0.2188F, -0.3904F, 0.7181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.4782F, 4.0541F, -3.2061F, -1.946F, 0.0F, 0.1222F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 90).addBox(-0.8F, -1.601F, 1.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, -2.8885F, 0.0F, 0.2182F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 81).addBox(-0.8F, -1.3651F, 2.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, -2.8013F, 0.0F, 0.2182F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 42).addBox(-0.8F, -2.0586F, -1.7304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, 3.0543F, 0.0F, 0.2182F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(58, 0).addBox(-0.2217F, -0.7196F, -2.6807F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7137F, 3.7098F, 3.4301F, 2.8516F, -0.0682F, 0.1314F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(62, 57).addBox(-0.2217F, -0.7142F, -2.7492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7137F, 3.7098F, 3.4301F, 2.6552F, -0.0682F, 0.1314F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 62).addBox(-0.6957F, -0.4919F, -2.7291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3863F, 3.1098F, 1.2301F, 2.7116F, -0.2044F, 0.2229F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(92, 47).addBox(-0.925F, -0.0053F, -2.2129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, 1.9897F, 0.0F, 0.2182F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 68).addBox(-1.0F, -1.9431F, -2.5933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, 1.0996F, 0.0F, 0.2182F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(65, 32).addBox(-1.0F, -2.0567F, -1.8002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.85F, 1.5F, 0.0F, 1.597F, 0.0F, 0.2182F));

		PartDefinition bone4 = hip.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3007F, -1.0591F, 0.5377F, 0.0F, 0.0F, -0.2531F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-0.4503F, -0.0101F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, 0.1222F, 0.0F, 0.2967F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 57).mirror().addBox(-0.4503F, -0.3097F, 0.0202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -0.1222F, 0.0F, 0.2967F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-0.4503F, -0.48F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -0.384F, 0.0F, 0.2967F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(81, 20).mirror().addBox(-0.4503F, -0.4089F, -1.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -0.6021F, 0.0F, 0.2967F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-0.4503F, 0.4362F, -1.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -1.3003F, 0.0F, 0.2967F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(81, 11).mirror().addBox(-0.4503F, 0.2034F, -1.8124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -0.5585F, 0.0F, 0.2967F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2583F, -0.1793F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-0.5F, -0.775F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0426F, 0.8523F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-0.5F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0426F, 0.8523F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-0.4503F, -0.1972F, -1.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, -0.0349F, 0.0F, 0.2967F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.5F, -1.0F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8F, 0.0F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(0.0F, -0.8354F, -1.314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, 1.7715F, 0.0F, -0.2182F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8F, 0.0F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-0.7812F, -2.2297F, 2.4208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -2.4696F, 0.0F, -0.1222F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.2057F, -0.4812F, -0.2227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(69, 22).mirror().addBox(-0.2057F, -0.5073F, -0.2637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5218F, 2.9541F, -2.6561F, -2.0159F, 0.0F, -0.3403F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-0.7812F, -0.4327F, -0.2182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-0.7812F, -0.4327F, 1.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 15).mirror().addBox(-0.7812F, -0.4588F, -0.2592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -2.0159F, 0.0F, -0.1222F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(81, 14).mirror().addBox(-0.7812F, -0.3268F, 1.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -1.9635F, 0.0F, -0.1222F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-0.7812F, -0.0665F, 2.2044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -1.8588F, 0.0F, -0.1222F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 63).mirror().addBox(-0.7812F, 0.4362F, 2.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(93, 56).mirror().addBox(-0.7812F, 0.2362F, 2.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false)
				.texOffs(27, 93).mirror().addBox(-0.7812F, 0.2362F, 2.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -1.6842F, 0.0F, -0.1222F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 70).mirror().addBox(-0.7812F, -0.3904F, 0.7181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 4.0541F, -3.2061F, -1.946F, 0.0F, -0.1222F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(74, 90).mirror().addBox(-0.2F, -1.601F, 1.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, -2.8885F, 0.0F, -0.2182F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.2F, -1.3651F, 2.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, -2.8013F, 0.0F, -0.2182F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(75, 42).mirror().addBox(-0.2F, -2.0586F, -1.7304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, 3.0543F, 0.0F, -0.2182F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.7783F, -0.7196F, -2.6807F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7137F, 3.7098F, 3.4301F, 2.8516F, 0.0682F, -0.1314F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.7783F, -0.7142F, -2.7492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7137F, 3.7098F, 3.4301F, 2.6552F, 0.0682F, -0.1314F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-0.3043F, -0.4919F, -2.7291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3863F, 3.1098F, 1.2301F, 2.7116F, 0.2044F, -0.2229F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-0.075F, -0.0053F, -2.2129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, 1.9897F, 0.0F, -0.2182F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(0.0F, -1.9431F, -2.5933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, 1.0996F, 0.0F, -0.2182F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(0.0F, -2.0567F, -1.8002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.5F, 0.0F, 1.597F, 0.0F, -0.2182F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.9222F, 0.6325F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(86, 29).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 4.5963F, -0.8353F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 26).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.4474F, -1.9647F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 6.4467F, -1.9298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, -0.25F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.0287F, -1.219F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(79, 38).addBox(0.0F, 0.0003F, -0.0321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.187F, -1.7302F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(54, 78).addBox(0.0F, -0.0997F, -0.9321F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.975F, 0.35F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(31, 81).addBox(0.0F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.5125F, -0.4205F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(5, 91).addBox(0.0F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.0498F, 0.4229F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(22, 92).addBox(0.0F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(92, 44).addBox(-1.0F, -0.2F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 7.1872F, -1.1616F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(53, 93).addBox(0.0F, -0.2108F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(38, 93).addBox(0.0F, -0.2108F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 0.2752F, -0.4286F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 92).addBox(0.0F, -1.4358F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(67, 92).addBox(0.0F, -0.8358F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.45F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 79).addBox(0.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5F, -0.45F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(62, 92).addBox(0.0F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 92).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 4.9846F, 0.237F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(92, 50).addBox(0.0F, 1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(79, 34).addBox(0.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.0391F, -0.0886F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 23).addBox(0.0F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 93).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 2.6284F, -0.6648F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 3).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.0366F, -0.5658F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 92).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 1.4584F, -0.4055F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 19).addBox(0.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 2.7F, 0.15F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 62).addBox(-1.0F, -0.125F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 81).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5184F, -0.7976F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 78).addBox(-0.5F, -0.9F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.2274F, -0.1139F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(91, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 1.0512F, 0.9902F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.8F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(54, 31).addBox(-1.0F, -0.2F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 31).addBox(-2.0F, -0.2F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7327F, 0.9053F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(41, 28).addBox(-1.0F, -0.5F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(41, 28).addBox(-2.0F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.9222F, 0.6325F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(86, 29).mirror().addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.5963F, -0.8353F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.4474F, -1.9647F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.4467F, -1.9298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(28, 68).mirror().addBox(-0.5F, -0.25F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.0287F, -1.219F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-1.0F, 0.0003F, -0.0321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.187F, -1.7302F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 78).mirror().addBox(-1.0F, -0.0997F, -0.9321F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.975F, 0.35F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-1.0F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5125F, -0.4205F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-1.0F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0498F, 0.4229F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(22, 92).mirror().addBox(-1.0F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(92, 44).mirror().addBox(0.0F, -0.2F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1872F, -1.1616F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-1.0F, -0.2108F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(38, 93).mirror().addBox(-1.0F, -0.2108F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2752F, -0.4286F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(-1.0F, -1.4358F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(67, 92).mirror().addBox(-1.0F, -0.8358F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -0.45F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-1.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -0.45F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-1.0F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 92).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9846F, 0.237F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-1.0F, 1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(79, 34).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0391F, -0.0886F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-1.0F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 93).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6284F, -0.6648F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0366F, -0.5658F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4584F, -0.4055F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-1.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7F, 0.15F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(0.0F, -0.125F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(48, 81).mirror().addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5184F, -0.7976F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -0.9F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.2274F, -0.1139F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0512F, 0.9902F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, 0.8F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-1.0F, -0.2F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 31).mirror().addBox(1.0F, -0.2F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7327F, 0.9053F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-1.0F, -0.5F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(41, 28).mirror().addBox(1.0F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.5411F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -2.5512F, -2.8119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(41, 85).addBox(-0.5F, -2.911F, -0.0029F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 84).addBox(-0.5F, -2.5149F, -0.0219F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-2.0862F, -0.6507F, -0.4588F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.2027F, 0.1706F, -0.9471F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-1.2575F, -0.1532F, -0.4849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.2586F, 0.0952F, -0.5312F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-1.438F, -0.24F, -0.4766F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.3387F, 0.131F, -0.4872F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 95).mirror().addBox(-2.2157F, -0.8033F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.2624F, 0.2354F, -0.9001F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-3.6975F, -1.635F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.1434F, 0.3211F, -1.3269F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-5.8891F, -1.5907F, -0.5169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.1548F, 0.3543F, -1.3057F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-2.3728F, -0.6848F, -0.5169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.2868F, 0.2611F, -0.8767F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-1.5319F, -0.0682F, -0.5493F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.371F, 0.1451F, -0.4653F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 94).addBox(1.0862F, -0.6507F, -0.4588F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.2027F, -0.1706F, 0.9471F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 28).addBox(-0.7425F, -0.1532F, -0.4849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.2586F, -0.0952F, 0.5312F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(73, 64).addBox(-0.562F, -0.24F, -0.4766F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.3387F, -0.131F, 0.4872F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 95).addBox(1.2158F, -0.8033F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.2624F, -0.2354F, 0.9001F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(79, 26).addBox(1.6975F, -1.635F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.1434F, -0.3211F, 1.3269F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 9).addBox(1.8891F, -1.5907F, -0.5169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.1548F, -0.3543F, 1.3057F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(94, 0).addBox(1.3728F, -0.6848F, -0.5169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.2868F, -0.2611F, 0.8767F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(78, 58).addBox(-0.4681F, -0.0682F, -0.5493F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.371F, -0.1451F, 0.4653F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.9944F, -2.1832F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3778F, -3.5911F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(41, 34).addBox(-1.5F, -0.0543F, 0.0178F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7901F, -3.44F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 36).addBox(-1.5F, -0.0043F, 0.0427F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.6854F, -6.4382F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(17, 15).addBox(-1.0F, -0.7F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(58, 85).addBox(0.0F, -2.4744F, -0.0425F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(56, 22).mirror().addBox(-6.8825F, -1.4719F, -0.5574F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.1836F, 0.4375F, -1.2074F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 78).mirror().addBox(-2.3184F, -0.579F, -0.5574F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.3483F, 0.3255F, -0.7717F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-1.4384F, 0.0062F, -0.5881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.4517F, 0.1807F, -0.365F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-6.9726F, -1.4472F, -0.5756F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.1602F, 0.3898F, -1.2342F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(77, 93).mirror().addBox(-2.3907F, -0.5198F, -0.5756F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.3069F, 0.2913F, -0.8016F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-1.48F, 0.0896F, -0.6075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.4012F, 0.165F, -0.3912F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-1.9283F, 0.0694F, -0.6533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.3872F, 0.152F, -0.428F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(77, 95).mirror().addBox(-2.793F, -0.7205F, -0.6119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.2991F, 0.2739F, -0.8385F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(56, 24).mirror().addBox(-6.2585F, -1.7942F, -0.6119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.1607F, 0.3709F, -1.2687F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(56, 22).addBox(1.8825F, -1.4719F, -0.5574F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.1836F, -0.4375F, 1.2074F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(93, 78).addBox(1.3184F, -0.579F, -0.5574F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.3483F, -0.3255F, 0.7717F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(78, 70).addBox(-0.5616F, 0.0062F, -0.5881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.4517F, -0.1807F, 0.365F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 12).addBox(1.9726F, -1.4472F, -0.5756F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.1602F, -0.3898F, 1.2342F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(77, 93).addBox(1.3907F, -0.5198F, -0.5756F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.3069F, -0.2913F, 0.8016F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 24).addBox(-0.52F, 0.0896F, -0.6075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.4012F, -0.165F, 0.3912F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(79, 30).addBox(-0.0717F, 0.0694F, -0.6533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.3872F, -0.152F, 0.428F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 95).addBox(1.793F, -0.7205F, -0.6119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.2991F, -0.2739F, 0.8385F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(56, 24).addBox(2.2585F, -1.7942F, -0.6119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.1607F, -0.3709F, 1.2687F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(85, 57).addBox(0.0F, -2.6276F, -0.0086F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(44, 85).addBox(0.0F, -2.8053F, -0.1733F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0291F, -3.8479F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(22, 55).addBox(-1.5F, -1.0473F, -0.0108F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.0027F, -5.365F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(54, 41).addBox(-1.5F, -1.1723F, -0.2108F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(54, 26).addBox(-1.0F, -0.0723F, 0.0392F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.599F, -3.6467F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(28, 29).addBox(-0.5F, -0.5F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, 6.4884F, -5.9849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8991F, -4.775F, 0.0369F, -0.0856F, -0.0468F));

		PartDefinition cube_r158 = chest2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.871F, -4.0461F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6F, 1.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(35, 92).addBox(0.0F, -3.0641F, -0.0293F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(92, 32).addBox(0.0F, -2.7857F, -0.0488F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -4.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-1.4844F, 0.0277F, -0.6209F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.5014F, 0.1997F, -0.4778F));

		PartDefinition cube_r162 = chest2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-2.3699F, -0.5781F, -0.5892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.388F, 0.3622F, -0.8805F));

		PartDefinition cube_r163 = chest2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-5.9298F, -1.4921F, -0.5892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.204F, 0.4866F, -1.3205F));

		PartDefinition cube_r164 = chest2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-6.8641F, -1.4915F, -0.5408F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.1787F, 0.4205F, -1.2792F));

		PartDefinition cube_r165 = chest2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-2.3096F, -0.6043F, -0.5408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.3365F, 0.312F, -0.8451F));

		PartDefinition cube_r166 = chest2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(71, 78).mirror().addBox(-1.441F, -0.0205F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.4359F, 0.1728F, -0.4376F));

		PartDefinition cube_r167 = chest2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(60, 12).addBox(1.9298F, -1.4921F, -0.5892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.204F, -0.4866F, 1.3205F));

		PartDefinition cube_r168 = chest2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(95, 59).addBox(1.3699F, -0.5781F, -0.5892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.388F, -0.3622F, 0.8805F));

		PartDefinition cube_r169 = chest2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(78, 72).addBox(-0.5156F, 0.0277F, -0.6209F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.5014F, -0.1997F, 0.4778F));

		PartDefinition cube_r170 = chest2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 78).addBox(-0.559F, -0.0205F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.4359F, -0.1728F, 0.4376F));

		PartDefinition cube_r171 = chest2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(94, 12).addBox(1.3096F, -0.6043F, -0.5408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.3365F, -0.312F, 0.8451F));

		PartDefinition cube_r172 = chest2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 51).addBox(1.8641F, -1.4915F, -0.5408F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.1787F, -0.4205F, 1.2792F));

		PartDefinition cube_r173 = chest2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(56, 14).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4884F, -5.9849F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.5F, -10.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 8).addBox(-1.5F, 0.4F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 15).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7552F, -5.586F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(76, 8).addBox(-1.0F, -0.5496F, 4.9258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(0, 59).addBox(-0.5F, -0.5496F, 1.9258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(26, 76).addBox(-1.0F, -0.5496F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4148F, 6.1753F, -5.3228F, -0.2041F, 0.284F, -0.2058F));

		PartDefinition cube_r176 = leftArm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(71, 70).addBox(0.1F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7755F, 0.4504F, 2.285F, 0.0F, 0.2007F, 0.0F));

		PartDefinition cube_r177 = leftArm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(71, 66).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 0.4504F, 0.9258F, 0.0F, -0.3665F, 0.0F));

		PartDefinition cube_r178 = leftArm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(51, 86).addBox(-0.325F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2993F, -0.0496F, 5.1422F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r179 = leftArm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(35, 86).addBox(-0.1F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.0496F, 5.4258F, 0.0F, 1.0036F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(59, 62).addBox(-0.1864F, -0.4404F, -0.2021F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(-1.2864F, -0.4404F, -0.2021F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0991F, 0.8164F, 6.1052F, -0.6275F, -0.3205F, 0.0135F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(14, 64).addBox(-1.1F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0524F, 0.0865F, 1.401F, -0.2151F, 0.0366F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(64, 62).addBox(-1.1F, -0.6F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, 1.0559F, 0.0025F, 0.0013F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-1.0F, -0.5496F, 4.9258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.5F, -0.5496F, 1.9258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(26, 76).mirror().addBox(-1.0F, -0.5496F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4148F, 6.1753F, -5.3228F, -0.4659F, -0.284F, 0.2058F));

		PartDefinition cube_r180 = rightArm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-1.1F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7755F, 0.4504F, 2.285F, 0.0F, -0.2007F, 0.0F));

		PartDefinition cube_r181 = rightArm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4504F, 0.9258F, 0.0F, 0.3665F, 0.0F));

		PartDefinition cube_r182 = rightArm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 86).mirror().addBox(-0.675F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2993F, -0.0496F, 5.1422F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r183 = rightArm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.9F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0496F, 5.4258F, 0.0F, -1.0036F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(59, 62).mirror().addBox(-0.8136F, -0.4404F, -0.2021F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 63).mirror().addBox(0.2864F, -0.4404F, -0.2021F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0991F, 0.8164F, 6.1052F, -0.7584F, 0.3205F, -0.0135F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-0.9F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0524F, 0.0865F, 2.0618F, 0.1974F, -0.0927F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(-0.9F, -0.6F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, 0.4451F, -0.0025F, -0.0013F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 6.9884F, -5.9849F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(71, 56).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -6.4282F, 3.3187F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 20).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -3.5919F, 0.3261F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(28, 36).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8F, -5.2019F, 1.7074F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(64, 71).addBox(-1.2F, 1.2292F, -1.1737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -0.7532F, 0.1766F, 0.4081F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(67, 0).addBox(-1.2F, 0.0392F, -1.6991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, 0.0322F, 0.1766F, 0.4081F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 64).addBox(-1.2F, -3.5624F, -0.0682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(78, 66).addBox(-1.2F, -3.5624F, 0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -2.9785F, 0.1766F, 0.4081F));

		PartDefinition cube_r190 = bone2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(36, 67).addBox(-1.2F, -1.1162F, 1.5674F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -2.0186F, 0.1766F, 0.4081F));

		PartDefinition cube_r191 = bone2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(67, 14).addBox(-1.2F, 0.6621F, 0.5338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -1.4514F, 0.1766F, 0.4081F));

		PartDefinition cube_r192 = bone2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(42, 75).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0252F, -0.523F, 0.0504F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.5F, 6.9884F, -5.9849F));

		PartDefinition cube_r193 = bone3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(71, 56).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -6.4282F, 3.3187F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r194 = bone3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -3.5919F, 0.3261F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r195 = bone3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(28, 36).mirror().addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -5.2019F, 1.7074F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r196 = bone3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(0.2F, 1.2292F, -1.1737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -0.7532F, -0.1766F, -0.4081F));

		PartDefinition cube_r197 = bone3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(0.2F, 0.0392F, -1.6991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, 0.0322F, -0.1766F, -0.4081F));

		PartDefinition cube_r198 = bone3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(0.2F, -3.5624F, -0.0682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(78, 66).mirror().addBox(0.2F, -3.5624F, 0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -2.9785F, -0.1766F, -0.4081F));

		PartDefinition cube_r199 = bone3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(36, 67).mirror().addBox(0.2F, -1.1162F, 1.5674F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -2.0186F, -0.1766F, -0.4081F));

		PartDefinition cube_r200 = bone3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(0.2F, 0.6621F, 0.5338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -1.4514F, -0.1766F, -0.4081F));

		PartDefinition cube_r201 = bone3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0252F, 0.523F, -0.0504F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r202 = neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(61, 85).addBox(0.0F, -2.8215F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r203 = neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(32, 90).addBox(0.0F, -3.0084F, -0.3257F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.7F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-2.9135F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.605F, 0.2062F, 0.6884F, -1.2501F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.605F, 0.5001F, 0.5613F, -0.7554F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-4.757F, -1.4473F, -0.5831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.0335F, 0.5137F, -1.5429F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-2.1938F, -0.6076F, -0.5831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.2545F, 0.4523F, -1.0739F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-1.3356F, -0.0706F, -0.6112F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.4233F, 0.3318F, -0.6389F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(79, 32).addBox(0.9136F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.605F, 0.2062F, -0.6884F, 1.2501F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(5, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.605F, 0.5001F, -0.5613F, 0.7554F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 26).addBox(1.757F, -1.4473F, -0.5831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.0335F, -0.5137F, 1.5429F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(93, 6).addBox(1.1938F, -0.6076F, -0.5831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.2545F, -0.4523F, 1.0739F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(68, 51).addBox(-0.6644F, -0.0706F, -0.6112F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.4233F, -0.3318F, 0.6389F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(55, 53).addBox(-1.5F, 0.017F, -1.0371F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -3.4811F, -3.3669F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(13, 36).addBox(-1.5F, -0.383F, -3.0371F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -2.6928F, -0.3044F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(30, 23).addBox(-1.5F, -0.983F, -3.0371F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6928F, -0.3044F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(26, 43).addBox(-0.5F, -0.5F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 57).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(45, 92).addBox(0.0F, -2.6698F, 0.0012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 69).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(15, 23).addBox(-2.0F, -2.3F, -1.375F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -2.705F, 0.6627F, 0.6751F, -0.6609F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -2.705F, 0.2894F, 0.8525F, -1.1919F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-2.9135F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -0.705F, 0.2705F, 0.82F, -1.206F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -0.705F, 0.628F, 0.6534F, -0.6823F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 96).addBox(0.9136F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -2.705F, 0.2894F, -0.8525F, 1.1919F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(95, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -2.705F, 0.6627F, -0.6751F, 0.6609F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(61, 95).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.705F, 0.628F, -0.6534F, 0.6823F));

		PartDefinition cube_r228 = neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(64, 79).addBox(0.9136F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.705F, 0.2705F, -0.82F, 1.206F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(34, 7).addBox(-0.5F, -0.5F, -4.95F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0039F, -2.9767F, -0.0968F, -0.1303F, 0.0126F));

		PartDefinition cube_r229 = neck3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(58, 5).addBox(0.0F, -2.2F, -2.6F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(13, 41).addBox(-1.5F, -1.925F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8082F, -1.889F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(41, 40).addBox(-2.0F, -0.125F, -2.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.1173F, -0.3665F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(66, 95).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0057F, -1.7283F, 0.6627F, 0.6751F, -0.6609F));

		PartDefinition cube_r233 = neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0057F, -1.7283F, 0.2894F, 0.8525F, -1.1919F));

		PartDefinition cube_r234 = neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 96).addBox(0.9136F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0057F, -1.7283F, 0.2894F, -0.8525F, 1.1919F));

		PartDefinition cube_r235 = neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(66, 95).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0057F, -1.7283F, 0.6627F, -0.6751F, 0.6609F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4039F, -4.6233F, 0.0385F, -0.2148F, -0.1787F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(86, 83).addBox(-1.0F, -0.9863F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 5.0383F, -8.5247F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(86, 80).addBox(-1.0F, -0.9864F, 0.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0392F, -8.5683F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(67, 86).addBox(-1.0F, 0.0137F, 0.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.2459F, -7.9596F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 77).addBox(-1.1F, -0.0863F, 0.0197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 1.4805F, -5.6589F, -0.8886F, 0.1931F, 0.1506F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(33, 76).addBox(-1.0F, 0.0137F, -0.9803F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.213F, -4.9708F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(66, 53).addBox(-2.0F, -0.9863F, 0.0197F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.8887F, -0.5606F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 5).addBox(-1.0F, 2.4F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 5).addBox(-1.5F, 0.4F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 5).addBox(-1.5F, -1.6F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 5).addBox(-1.5F, -1.6F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 5).addBox(-1.5F, -1.6F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0553F, -1.7126F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 5).addBox(-2.0F, -1.9863F, 0.0197F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0282F, -2.5557F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(67, 19).addBox(-2.0F, -0.9863F, 0.0197F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.5511F, -3.4345F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(49, 76).addBox(-1.0F, 0.0137F, 0.0197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5511F, -3.4345F, -0.8253F, 0.09F, 0.0828F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(64, 66).addBox(-1.5F, 0.0137F, 0.0197F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.5511F, -3.4345F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.8887F, -0.5606F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(30, 87).addBox(-0.7F, 0.0387F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6931F, -7.3214F, -2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 86).addBox(-0.7F, 0.0137F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.6931F, -7.3214F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -0.0581F, -0.4587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2676F, 4.4817F, -6.7295F, 2.1833F, -0.0693F, -0.0875F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(82, 48).addBox(-0.4855F, 0.1221F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 45).addBox(-0.4855F, -0.5779F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0215F, 4.977F, -6.7304F, 2.1891F, -0.0605F, -0.1614F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(59, 82).addBox(-0.9088F, -0.668F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 51).addBox(-0.9088F, -0.668F, -0.2733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.4437F, 5.1773F, -6.9576F, 2.3113F, 0.0658F, 0.0388F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(43, 82).addBox(-0.5099F, -0.4551F, -0.5606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0215F, 4.977F, -6.7304F, 2.6226F, -0.0172F, -0.2094F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(30, 84).addBox(-0.5F, -0.942F, -0.4601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2676F, 4.4817F, -6.7295F, 2.3665F, -0.0693F, -0.0875F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(10, 83).addBox(-1.084F, -0.0637F, -0.1223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(83, 6).addBox(-1.084F, -0.0637F, -1.0222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.425F, 5.3865F, -6.6207F, 2.6311F, -0.0865F, -0.1226F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(83, 23).addBox(-0.525F, -0.825F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1559F, 4.9033F, -7.3846F, 3.107F, -0.0175F, 0.0362F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(15, 83).addBox(-1.0995F, -1.052F, 0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4375F, 5.9152F, -5.7293F, 2.5136F, 0.0174F, 0.0349F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(29, 61).addBox(-1.095F, -0.2116F, -1.3734F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.7081F, -3.3625F, -0.8359F, 0.2879F, 0.0529F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 74).addBox(-1.3411F, 0.1746F, -0.6587F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3881F, 1.5829F, -3.4612F, -0.5036F, 0.7289F, 0.6872F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(20, 59).addBox(-0.5F, 1.3939F, -3.1811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 79).addBox(-1.095F, 1.3011F, -1.3057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, 2.7081F, -3.3625F, -0.4519F, 0.2879F, 0.0529F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 68).addBox(-1.095F, 0.4556F, 0.2273F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 2.7081F, -3.3625F, -1.2809F, 0.2879F, 0.0529F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(91, 83).addBox(-0.5F, -1.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.897F, 3.4572F, -3.1668F, -1.7958F, 0.2879F, 0.0529F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(91, 29).addBox(-0.5F, -0.875F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.897F, 3.4572F, -3.1668F, -2.2321F, 0.2879F, 0.0529F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(91, 86).addBox(-0.5F, -0.275F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(91, 80).addBox(-0.5F, -0.275F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.897F, 3.4572F, -3.1668F, -2.5375F, 0.2879F, 0.0529F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(91, 89).addBox(-0.5F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.897F, 3.4572F, -3.1668F, -2.7993F, 0.2879F, 0.0529F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 26).addBox(-0.5F, -0.3F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.797F, 3.4572F, -3.1668F, -2.2321F, 0.2879F, 0.0529F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 20).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.797F, 3.4572F, -3.1668F, -1.5776F, 0.2879F, 0.0529F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(73, 60).addBox(-0.773F, 0.0F, -1.1562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0021F, 6.1589F, -5.9235F, -0.3123F, 0.0451F, -0.0769F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(72, 34).addBox(-0.473F, -0.175F, -1.2562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0021F, 6.1589F, -5.9235F, -0.2146F, 0.2585F, -0.123F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(87, 51).addBox(-0.515F, -0.8863F, -0.3499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0021F, 6.1589F, -5.9235F, -0.5304F, 0.2879F, -0.2089F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 73).addBox(-0.3F, -3.375F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(50, 72).addBox(-0.3F, -2.675F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(72, 38).addBox(-0.3F, -1.975F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(35, 72).addBox(-0.3F, -1.275F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(72, 30).addBox(-0.3F, -0.575F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1193F, 5.593F, -4.3965F, -0.9668F, 0.2879F, 0.0529F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(65, 26).addBox(-1.095F, -0.6974F, 0.2737F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 2.7081F, -3.3625F, -1.4031F, 0.2879F, 0.0529F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(21, 72).addBox(-0.5F, 2.1844F, -1.235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -0.925F, 0.2182F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(87, 32).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7905F, 0.3184F, -2.4608F, -1.6755F, 0.2182F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(82, 42).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6111F, 0.8776F, -3.2702F, -0.9774F, 0.2182F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(53, 83).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 83).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0688F, 2.5631F, -2.0028F, -1.6232F, 0.2182F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(59, 45).addBox(-0.5F, -0.575F, -0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.3042F, 0.9178F, -0.941F, -1.405F, 0.2182F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(20, 84).addBox(-0.5F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.6241F, 3.0432F, 0.5018F, -3.0631F, 0.2182F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4142F, 3.0875F, -0.4451F, -2.8885F, 0.2182F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(83, 74).addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.2847F, 3.1345F, -1.029F, -3.0631F, 0.2182F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(69, 83).addBox(-0.5F, -1.225F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2939F, 2.2255F, -0.9874F, -2.5395F, 0.2182F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(83, 66).addBox(-0.5F, -0.575F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.2939F, 2.2255F, -0.9874F, -1.8413F, 0.2182F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(28, 72).addBox(-0.5F, -0.35F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3042F, 0.9178F, -0.941F, -1.4923F, 0.2182F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(83, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.3042F, 0.9178F, -0.941F, -2.1904F, 0.2182F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 90).addBox(-0.35F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 48).addBox(-0.525F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 26).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(87, 45).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9015F, 1.1064F, -2.7578F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(87, 42).addBox(-0.5F, -0.925F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9384F, 1.4964F, -2.5912F, -1.0996F, 0.2182F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5F, 1.6258F, -0.2986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -1.2741F, 0.2182F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(59, 78).addBox(-0.275F, -0.225F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5236F, 0.3111F, 0.8459F, -1.6842F, 0.2182F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(93, 53).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1811F, 0.0746F, -0.699F, -1.7191F, 0.2182F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(87, 35).addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1606F, 0.832F, -0.7912F, -1.1432F, 0.2182F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.1085F, -2.0621F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -1.405F, 0.2182F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(21, 76).addBox(-0.5F, -2.7736F, 0.9299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -1.2305F, 0.2182F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(91, 17).addBox(-0.5F, -2.9686F, -0.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -1.5708F, 0.2182F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(17, 87).addBox(-0.5F, -2.1809F, -0.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -1.9199F, 0.2182F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(50, 67).addBox(-0.5F, -1.1679F, -1.2731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -2.3562F, 0.2182F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(65, 38).addBox(-0.5F, -0.2917F, -1.3084F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.3081F, -0.1625F, -2.6005F, 0.2182F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.8887F, -0.5606F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.3F, 0.0387F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6931F, -7.3214F, -2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-0.3F, 0.0137F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6931F, -7.3214F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.5F, -0.0581F, -0.4587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2676F, 4.4817F, -6.7295F, 2.1833F, 0.0693F, 0.0875F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(82, 48).mirror().addBox(-0.5145F, 0.1221F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 45).mirror().addBox(-0.5145F, -0.5779F, -0.3352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0215F, 4.977F, -6.7304F, 2.1891F, 0.0605F, 0.1614F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(59, 82).mirror().addBox(-0.0912F, -0.668F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 51).mirror().addBox(-0.0912F, -0.668F, -0.2733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 5.1773F, -6.9576F, 2.3113F, -0.0658F, -0.0388F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(43, 82).mirror().addBox(-0.4901F, -0.4551F, -0.5606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0215F, 4.977F, -6.7304F, 2.6226F, 0.0172F, 0.2094F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.5F, -0.942F, -0.4601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2676F, 4.4817F, -6.7295F, 2.3665F, 0.0693F, 0.0875F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(0.084F, -0.0637F, -0.1223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(83, 6).mirror().addBox(0.084F, -0.0637F, -1.0222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.425F, 5.3865F, -6.6207F, 2.6311F, 0.0865F, 0.1226F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(83, 23).mirror().addBox(-0.475F, -0.825F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1559F, 4.9033F, -7.3846F, 3.107F, 0.0175F, -0.0362F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(0.0995F, -1.052F, 0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4375F, 5.9152F, -5.7293F, 2.5136F, -0.0174F, -0.0349F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(29, 61).mirror().addBox(0.095F, -0.2116F, -1.3734F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.7081F, -3.3625F, -0.8359F, -0.2879F, -0.0529F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-0.6589F, 0.1746F, -0.6587F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, 1.5829F, -3.4612F, -0.5036F, -0.7289F, -0.6872F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.5F, 1.3939F, -3.1811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(0.095F, 1.3011F, -1.3057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.7081F, -3.3625F, -0.4519F, -0.2879F, -0.0529F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(0.095F, 0.4556F, 0.2273F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.7081F, -3.3625F, -1.2809F, -0.2879F, -0.0529F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(-0.5F, -1.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.897F, 3.4572F, -3.1668F, -1.7958F, -0.2879F, -0.0529F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(91, 29).mirror().addBox(-0.5F, -0.875F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.897F, 3.4572F, -3.1668F, -2.2321F, -0.2879F, -0.0529F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(91, 86).mirror().addBox(-0.5F, -0.275F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(91, 80).mirror().addBox(-0.5F, -0.275F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.897F, 3.4572F, -3.1668F, -2.5375F, -0.2879F, -0.0529F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(91, 89).mirror().addBox(-0.5F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.897F, 3.4572F, -3.1668F, -2.7993F, -0.2879F, -0.0529F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-0.5F, -0.3F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.797F, 3.4572F, -3.1668F, -2.2321F, -0.2879F, -0.0529F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.797F, 3.4572F, -3.1668F, -1.5776F, -0.2879F, -0.0529F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-0.227F, 0.0F, -1.1562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0021F, 6.1589F, -5.9235F, -0.3123F, -0.0451F, 0.0769F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(72, 34).mirror().addBox(-0.527F, -0.175F, -1.2562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0021F, 6.1589F, -5.9235F, -0.2146F, -0.2585F, 0.123F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-0.485F, -0.8863F, -0.3499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0021F, 6.1589F, -5.9235F, -0.5304F, -0.2879F, 0.2089F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.7F, -3.375F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(50, 72).mirror().addBox(-0.7F, -2.675F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(72, 38).mirror().addBox(-0.7F, -1.975F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(35, 72).mirror().addBox(-0.7F, -1.275F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(72, 30).mirror().addBox(-0.7F, -0.575F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1193F, 5.593F, -4.3965F, -0.9668F, -0.2879F, -0.0529F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(0.095F, -0.6974F, 0.2737F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.7081F, -3.3625F, -1.4031F, -0.2879F, -0.0529F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-0.5F, 2.1844F, -1.235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -0.925F, -0.2182F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7905F, 0.3184F, -2.4608F, -1.6755F, -0.2182F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6111F, 0.8776F, -3.2702F, -0.9774F, -0.2182F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(53, 83).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(36, 83).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0688F, 2.5631F, -2.0028F, -1.6232F, -0.2182F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-0.5F, -0.575F, -0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.3042F, 0.9178F, -0.941F, -1.405F, -0.2182F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.5F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.6241F, 3.0432F, 0.5018F, -3.0631F, -0.2182F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4142F, 3.0875F, -0.4451F, -2.8885F, -0.2182F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.2847F, 3.1345F, -1.029F, -3.0631F, -0.2182F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(69, 83).mirror().addBox(-0.5F, -1.225F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 2.2255F, -0.9874F, -2.5395F, -0.2182F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-0.5F, -0.575F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 2.2255F, -0.9874F, -1.8413F, -0.2182F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-0.5F, -0.35F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3042F, 0.9178F, -0.941F, -1.4923F, -0.2182F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(83, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.3042F, 0.9178F, -0.941F, -2.1904F, -0.2182F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-0.65F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 48).mirror().addBox(-0.475F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 26).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(87, 45).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9015F, 1.1064F, -2.7578F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(87, 42).mirror().addBox(-0.5F, -0.925F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9384F, 1.4964F, -2.5912F, -1.0996F, -0.2182F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-0.5F, 1.6258F, -0.2986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -1.2741F, -0.2182F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 78).mirror().addBox(-0.725F, -0.225F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5236F, 0.3111F, 0.8459F, -1.6842F, -0.2182F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1811F, 0.0746F, -0.699F, -1.7191F, -0.2182F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1606F, 0.832F, -0.7912F, -1.1432F, -0.2182F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -0.1085F, -2.0621F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -1.405F, -0.2182F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-0.5F, -2.7736F, 0.9299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -1.2305F, -0.2182F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(91, 17).mirror().addBox(-0.5F, -2.9686F, -0.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -1.5708F, -0.2182F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(17, 87).mirror().addBox(-0.5F, -2.1809F, -0.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -1.9199F, -0.2182F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-0.5F, -1.1679F, -1.2731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -2.3562F, -0.2182F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.5F, -0.2917F, -1.3084F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.3081F, -0.1625F, -2.6005F, -0.2182F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1697F, 1.8659F, 1.168F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-0.3F, -1.1855F, -0.4093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 1.3875F, -0.2182F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-0.3F, -1.4485F, -0.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 54).mirror().addBox(-0.3F, -1.5485F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 1.4748F, -0.2182F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(-0.2572F, 0.3242F, 0.4941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(52, 89).mirror().addBox(-0.2572F, 0.3242F, 0.4441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(22, 49).mirror().addBox(-0.2572F, -0.1758F, -0.2559F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(47, 89).mirror().addBox(-0.2572F, 0.3242F, -0.1559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.7402F, -0.288F, 0.0175F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-0.325F, -0.1976F, -2.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 89).mirror().addBox(-0.325F, -0.1976F, -2.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, -0.2443F, -0.2182F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(17, 90).mirror().addBox(-0.2822F, 0.105F, 1.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.7576F, -0.288F, 0.0175F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(74, 11).mirror().addBox(-0.2822F, -0.1961F, -0.1616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.5656F, -0.288F, 0.0175F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-0.3F, -0.5456F, 0.6129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 2.7925F, -0.2182F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.3F, -0.5176F, 0.6249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 68).mirror().addBox(-0.3F, -1.1176F, 1.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 2.9671F, -0.2182F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.6974F, 3.914F, -3.8506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.309F, -0.3927F, 0.0175F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.2572F, -1.4591F, -2.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 75).mirror().addBox(-0.2572F, -1.4591F, -4.5454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -0.2967F, -0.288F, 0.0175F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(-0.6974F, -0.9366F, -5.1594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -0.4189F, -0.3927F, 0.0175F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(-0.6974F, -2.0389F, -5.466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(72, 93).mirror().addBox(-0.6974F, -1.5389F, -4.766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(93, 69).mirror().addBox(-0.6974F, -1.5389F, -5.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -0.192F, -0.3927F, 0.0175F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-0.2572F, -1.5319F, -4.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -0.192F, -0.288F, 0.0175F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.6974F, 3.1157F, -4.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 38).mirror().addBox(-0.6974F, 3.4157F, -4.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.1694F, -0.3927F, 0.0175F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(43, 79).mirror().addBox(-0.2572F, 0.6835F, -1.8398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 80).mirror().addBox(-0.2572F, 1.3835F, -1.9398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.7541F, -0.288F, 0.0175F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(-0.2572F, 1.9148F, -2.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.6493F, -0.288F, 0.0175F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.2572F, 2.265F, -2.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.4748F, -0.288F, 0.0175F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.6224F, 2.9282F, -3.3917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.4748F, -0.3927F, 0.0175F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.6974F, 3.074F, -4.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -1.3003F, -0.3927F, 0.0175F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.45F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3737F, -2.4759F, -7.7407F, -1.1471F, 0.0724F, -0.159F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4661F, -2.3999F, -7.4005F, -1.1414F, -0.3F, -0.1926F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-0.35F, -0.825F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(57, 90).addBox(0.1273F, -0.825F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3886F, -1.3925F, -7.7124F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-0.35F, -0.425F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 90).mirror().addBox(-0.35F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(40, 90).addBox(0.1273F, -0.425F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(27, 90).addBox(0.1273F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3886F, -2.0091F, -7.5395F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.6974F, 4.567F, 0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(64, 81).mirror().addBox(-0.6974F, 4.267F, 0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, -2.1817F, -0.3927F, 0.0175F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.6974F, 0.1922F, 3.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.9671F, -0.3927F, 0.0175F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(22, 89).mirror().addBox(-0.2572F, 0.1858F, 3.5822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.9671F, -0.288F, 0.0175F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-0.2572F, -0.215F, 3.0645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(88, 71).mirror().addBox(-0.2572F, -0.6628F, -0.3369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.8623F, -0.288F, 0.0175F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(89, 11).mirror().addBox(-0.2572F, -0.5017F, 2.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 74).mirror().addBox(-0.2572F, -0.7014F, 0.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.7751F, -0.288F, 0.0175F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-0.2572F, -0.7384F, 1.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(88, 77).mirror().addBox(-0.2572F, -0.7884F, 0.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.6878F, -0.288F, 0.0175F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.2572F, -0.9233F, 1.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 0.2719F, -2.6268F, 2.6005F, -0.288F, 0.0175F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-0.3F, -2.1291F, -0.8716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(88, 23).mirror().addBox(-0.3F, -0.9863F, -0.9021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 1.5272F, -0.2182F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(88, 5).mirror().addBox(-0.3F, -0.3317F, -0.7553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 0.5672F, -0.2182F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-0.3F, -0.3485F, -0.7166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.75F, 0.2719F, -0.1268F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(26, 79).addBox(-0.7F, -1.1855F, -0.4093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 1.3875F, 0.2182F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(88, 57).addBox(-0.7F, -1.4485F, -0.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 54).addBox(-0.7F, -1.5485F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 1.4748F, 0.2182F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(64, 89).addBox(-0.7428F, 0.3242F, 0.4941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(52, 89).addBox(-0.7428F, 0.3242F, 0.4441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(22, 49).addBox(-0.7428F, -0.1758F, -0.2559F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F))
				.texOffs(47, 89).addBox(-0.7428F, 0.3242F, -0.1559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.7402F, 0.288F, -0.0175F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(86, 89).addBox(-0.675F, -0.1976F, -2.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 89).addBox(-0.675F, -0.1976F, -2.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, -0.2443F, 0.2182F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(17, 90).addBox(-0.7178F, 0.105F, 1.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.7576F, 0.288F, -0.0175F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(74, 11).addBox(-0.7178F, -0.1961F, -0.1616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.5656F, 0.288F, -0.0175F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(74, 4).addBox(-0.7F, -0.5456F, 0.6129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 2.7925F, 0.2182F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(74, 0).addBox(-0.7F, -0.5176F, 0.6249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 68).addBox(-0.7F, -1.1176F, 1.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 2.9671F, 0.2182F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 91).addBox(-0.3026F, 3.914F, -3.8506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.309F, 0.3927F, -0.0175F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(14, 76).addBox(-0.7428F, -1.4591F, -2.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 75).addBox(-0.7428F, -1.4591F, -4.5454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -0.2967F, 0.288F, -0.0175F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(93, 75).addBox(-0.3026F, -0.9366F, -5.1594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -0.4189F, 0.3927F, -0.0175F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(93, 66).addBox(-0.3026F, -2.0389F, -5.466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(72, 93).addBox(-0.3026F, -1.5389F, -4.766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(93, 69).addBox(-0.3026F, -1.5389F, -5.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -0.192F, 0.3927F, -0.0175F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(93, 72).addBox(-0.7428F, -1.5319F, -4.2022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -0.192F, 0.288F, -0.0175F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(76, 82).addBox(-0.3026F, 3.1157F, -4.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 38).addBox(-0.3026F, 3.4157F, -4.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.1694F, 0.3927F, -0.0175F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(43, 79).addBox(-0.7428F, 0.6835F, -1.8398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 80).addBox(-0.7428F, 1.3835F, -1.9398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.7541F, 0.288F, -0.0175F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(80, 60).addBox(-0.7428F, 1.9148F, -2.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.6493F, 0.288F, -0.0175F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(15, 80).addBox(-0.7428F, 2.265F, -2.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.4748F, 0.288F, -0.0175F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(81, 0).addBox(-0.3776F, 2.9282F, -3.3917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.4748F, 0.3927F, -0.0175F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(81, 82).addBox(-0.3026F, 3.074F, -4.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -1.3003F, 0.3927F, -0.0175F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(5, 83).addBox(-0.55F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3737F, -2.4759F, -7.7407F, -1.1471F, -0.0724F, 0.159F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(75, 50).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4661F, -2.3999F, -7.4005F, -1.1414F, 0.3F, 0.1926F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(10, 92).addBox(-0.3026F, 4.567F, 0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(64, 81).addBox(-0.3026F, 4.267F, 0.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, -2.1817F, 0.3927F, -0.0175F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(35, 89).addBox(-0.3026F, 0.1922F, 3.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.9671F, 0.3927F, -0.0175F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(22, 89).addBox(-0.7428F, 0.1858F, 3.5822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.9671F, 0.288F, -0.0175F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(12, 89).addBox(-0.7428F, -0.215F, 3.0645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(88, 71).addBox(-0.7428F, -0.6628F, -0.3369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.8623F, 0.288F, -0.0175F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(89, 11).addBox(-0.7428F, -0.5017F, 2.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 74).addBox(-0.7428F, -0.7014F, 0.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.7751F, 0.288F, -0.0175F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(89, 8).addBox(-0.7428F, -0.7384F, 1.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(88, 77).addBox(-0.7428F, -0.7884F, 0.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.6878F, 0.288F, -0.0175F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(89, 0).addBox(-0.7428F, -0.9233F, 1.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.25F, 0.2719F, -2.6268F, 2.6005F, 0.288F, -0.0175F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(88, 65).addBox(-0.7F, -2.1291F, -0.8716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(88, 23).addBox(-0.7F, -0.9863F, -0.9021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 1.5272F, 0.2182F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(88, 5).addBox(-0.7F, -0.3317F, -0.7553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 0.5672F, 0.2182F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(68, 43).addBox(-0.7F, -0.3485F, -0.7166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.75F, 0.2719F, -0.1268F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 51).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(33, 57).addBox(0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(33, 57).mirror().addBox(-2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r411 = tail.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(80, 85).addBox(0.0F, -2.175F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r412 = tail.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(77, 85).addBox(0.0F, 0.8F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(74, 85).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(37, 45).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.005F, 0.0051F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(83, 85).addBox(0.0F, -2.075F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.1772F, -0.1719F, 0.0306F));

		PartDefinition cube_r415 = tail2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(6, 86).addBox(0.0F, -2.325F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r416 = tail2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(3, 86).addBox(0.0F, -2.15F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r417 = tail2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(94, 8).addBox(0.0F, 4.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 0).addBox(0.0F, 1.9F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -4.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r418 = tail2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -0.075F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.2F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r420 = tail2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(45, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9935F, 4.9253F, -0.0864F, -0.2646F, -0.021F));

		PartDefinition cube_r421 = tail3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(86, 9).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r422 = tail3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(9, 86).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(94, 92).addBox(0.0F, 6.3F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 37).addBox(0.0F, 5.2F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -9.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.457F, 2.3959F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, -0.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-1.1F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, 1.0F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r427 = tail3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(56, 18).addBox(-0.9F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 1.0F, 0.0F, -0.1222F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2008F, -0.0872F, -0.0023F));

		PartDefinition cube_r428 = tail4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(23, 95).addBox(0.0F, -1.4717F, 0.0195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r429 = tail4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(20, 95).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r430 = tail4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(43, 71).addBox(-0.5F, -1.075F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.8473F, 2.1125F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r431 = tail4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(68, 47).addBox(-0.5F, -0.075F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.3599F, 0.4656F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r432 = tail4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 95).addBox(0.0F, 7.6F, 12.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -13.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 6).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1965F, -0.2141F, -0.0423F));

		PartDefinition cube_r433 = tail5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(95, 32).addBox(0.0F, -1.3257F, 0.0076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(87, 95).addBox(0.0F, -0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 93).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3378F, 0.4437F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r435 = tail5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(32, 95).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r436 = tail5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(86, 17).addBox(-0.5F, -0.075F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 58).addBox(-0.5F, -0.075F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(11, 47).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0079F, 3.9715F, 0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail6.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(38, 76).addBox(0.0F, -1.175F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 95).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail6.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(16, 96).addBox(0.0F, 0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 14).addBox(0.0F, 0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2077F, 0.7083F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail6.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.2F, -0.275F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4178F, 0.3251F, -0.0916F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(45, 20).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0191F, 3.9725F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r440 = tail7.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(13, 96).addBox(0.0F, -0.675F, 1.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 95).addBox(0.0F, -0.7F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.975F, 1.025F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail7.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(96, 17).addBox(0.0F, 2.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 11).addBox(0.0F, 1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1886F, -3.2643F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail7.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(44, 51).addBox(-0.5F, -0.425F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8656F, 0.1072F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(48, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0017F, 4.0095F, 0.1752F, -0.1744F, -0.0077F));

		PartDefinition cube_r443 = tail8.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(96, 20).addBox(0.0F, 3.0F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1902F, -7.2738F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.0038F, 0.3497F, -0.1744F, -0.0077F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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