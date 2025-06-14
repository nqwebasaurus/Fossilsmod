package fossils.fossils.client.blockentity.model.limnoscelis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LimnoscelisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart leftArm9;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Upperjaw1;
	private final ModelPart Upperjaw2;
	private final ModelPart Upperteeth2;
	private final ModelPart Upperteeth1;
	private final ModelPart Lowerjaw1;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public LimnoscelisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.leftArm9 = this.leftArm8.getChild("leftArm9");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.leftArm2 = this.bone3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.Neck = this.bone.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Upperjaw1 = this.Head.getChild("Upperjaw1");
		this.Upperjaw2 = this.Upperjaw1.getChild("Upperjaw2");
		this.Upperteeth2 = this.Upperjaw2.getChild("Upperteeth2");
		this.Upperteeth1 = this.Upperjaw1.getChild("Upperteeth1");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.2F, 2.6F, -0.0861F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(58, 82).addBox(1.3842F, -2.0349F, 0.0384F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, -0.0909F, 5.9937F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(15, 76).addBox(1.3842F, -3.1F, 6.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 75).addBox(1.3842F, -3.2F, 4.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 24).addBox(1.3842F, -3.0F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 0).mirror().addBox(-0.1158F, -0.5F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 0).addBox(1.8842F, -0.5F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(19, 22).addBox(0.8842F, -1.0F, 2.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0119F, 2.677F, 3.1214F, 0.1211F, -0.6536F, 0.1766F));

		PartDefinition cube_r1 = leftArm5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 56).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2781F, 0.6517F, -0.0412F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r2 = leftArm5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 60).addBox(-0.3F, -1.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6933F, 0.6517F, 0.4746F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r3 = leftArm5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 48).addBox(-16.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 74).addBox(-15.9684F, 2.1028F, -2.8567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7015F, -2.4511F, -17.198F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r4 = leftArm5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(79, 15).addBox(-0.25F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1932F, 0.6517F, -1.0401F, 0.0F, -1.6581F, 0.0F));

		PartDefinition cube_r5 = leftArm5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 12).addBox(-4.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6556F, 0.1517F, -1.7434F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r6 = leftArm5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(63, 43).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8474F, 0.1517F, -0.8409F, 0.0F, 0.1833F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3982F, 0.0349F, -0.3703F, 0.8433F, -1.2369F, 0.4039F));

		PartDefinition cube_r7 = leftArm6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 24).addBox(-0.0391F, -0.5F, -0.9127F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0896F, -0.2626F, 0.2413F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r8 = leftArm6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 67).addBox(-1.6F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.6896F, -0.2626F, -0.1587F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r9 = leftArm6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0336F, -0.5F, -1.0722F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6447F, -0.2626F, -0.5658F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r10 = leftArm6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 68).addBox(-1.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3447F, -0.2626F, -1.8658F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r11 = leftArm6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 26).addBox(-0.5591F, -0.4988F, -0.4875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0962F, -0.2638F, -0.7864F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r12 = leftArm6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(70, 63).addBox(-1.4433F, -0.9988F, -0.3566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0962F, -0.2638F, -0.7864F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r13 = leftArm6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 0).addBox(-1.4326F, -0.9988F, -0.13F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0962F, -0.2638F, -0.7864F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(67, 19).addBox(-0.2706F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.765F, 0.7374F, -2.6238F, -0.0019F, -0.2618F, 0.0008F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(16, 55).addBox(-0.6347F, -2.5F, -1.724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.0472F, 0.0F));

		PartDefinition leftArm9 = leftArm8.addOrReplaceChild("leftArm9", CubeListBuilder.create().texOffs(30, 57).addBox(-0.2817F, -2.5F, -2.1223F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3471F, 0.0F, -1.5726F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0119F, 2.677F, 3.1214F, 0.1207F, -0.6483F, -0.3236F));

		PartDefinition cube_r14 = rightArm5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 75).addBox(-0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2781F, 0.6517F, -0.0412F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r15 = rightArm5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, 60).addBox(-0.7F, -1.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-3.6933F, 0.6517F, 0.4746F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r16 = rightArm5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 51).addBox(14.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(14.9684F, 2.1028F, -2.8567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.7015F, -2.4511F, -17.198F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r17 = rightArm5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 79).addBox(-0.75F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1932F, 0.6517F, -1.0401F, 0.0F, 1.6581F, 0.0F));

		PartDefinition cube_r18 = rightArm5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 15).addBox(1.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.6556F, 0.1517F, -1.7434F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r19 = rightArm5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 35).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8474F, 0.1517F, -0.8409F, 0.0F, -0.1833F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3982F, 0.0349F, -0.3703F, -0.1931F, 0.3372F, -1.3618F));

		PartDefinition cube_r20 = rightArm6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 60).addBox(-2.9609F, -0.5F, -0.9127F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.0896F, -0.2626F, 0.2413F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r21 = rightArm6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 67).addBox(-0.4F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.6896F, -0.2626F, -0.1587F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r22 = rightArm6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 68).addBox(0.0336F, -0.5F, -1.0722F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6447F, -0.2626F, -0.5658F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r23 = rightArm6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 68).addBox(-0.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3447F, -0.2626F, -1.8658F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r24 = rightArm6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 54).addBox(-3.4409F, -0.4988F, -0.4875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0962F, -0.2638F, -0.7864F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r25 = rightArm6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 71).addBox(0.4433F, -0.9988F, -0.3566F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0962F, -0.2638F, -0.7864F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r26 = rightArm6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 69).addBox(0.4326F, -0.9988F, -0.13F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0962F, -0.2638F, -0.7864F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(21, 67).addBox(-0.7294F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.765F, 0.7374F, -2.6238F, -1.5813F, 1.569F, -1.5816F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(23, 57).addBox(-0.3653F, -2.5F, -1.724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -1.0472F, 0.0F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create().texOffs(58, 6).addBox(-0.7183F, -2.5F, -2.1223F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3471F, 0.0F, -1.5726F, 0.0F, -0.7418F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0158F, 0.1091F, -0.0063F, 0.038F, -0.2616F, -0.0098F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(27, 50).addBox(1.3842F, -2.064F, 0.0151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5362F, -1.9034F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(81, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.0913F, -1.3959F, -0.0158F, -0.0074F, -0.4363F));

		PartDefinition cube_r27 = Belly.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2291F, -3.3503F, -0.0876F, 0.0273F, -1.3655F));

		PartDefinition cube_r28 = Belly.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(37, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2291F, -3.3503F, -0.0714F, 0.0403F, -0.8941F));

		PartDefinition cube_r29 = Belly.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 81).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2291F, -5.3503F, -0.0891F, -0.0217F, -1.66F));

		PartDefinition cube_r30 = Belly.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(71, 71).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2291F, -5.3503F, -0.0876F, 0.0273F, -1.1211F));

		PartDefinition cube_r31 = Belly.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2291F, -5.3503F, -0.0714F, 0.0403F, -0.6498F));

		PartDefinition cube_r32 = Belly.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2291F, -3.3503F, -0.0714F, -0.0403F, 0.8941F));

		PartDefinition cube_r33 = Belly.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 81).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2291F, -3.3503F, -0.0876F, -0.0273F, 1.3655F));

		PartDefinition cube_r34 = Belly.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(32, 81).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2291F, -5.3503F, -0.0891F, 0.0217F, 1.66F));

		PartDefinition cube_r35 = Belly.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(71, 71).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2291F, -5.3503F, -0.0876F, -0.0273F, 1.1211F));

		PartDefinition cube_r36 = Belly.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(27, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2291F, -5.3503F, -0.0714F, -0.0403F, 0.6498F));

		PartDefinition Belly_r3 = Belly.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(24, 80).addBox(1.3842F, -3.0F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 80).addBox(1.3842F, -3.0F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 31).addBox(0.8842F, -1.0F, 3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.2638F, -9.7034F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Belly_r4 = Belly.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(81, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.0913F, -1.3959F, -0.0158F, 0.0074F, 0.4363F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.15F, -0.2362F, -5.9034F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition Belly_r5 = body.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(18, 80).addBox(1.3842F, -3.0F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 80).addBox(1.3842F, -3.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 22).addBox(0.8842F, -1.0F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -1.4469F, -0.0891F, -0.0217F, -1.5378F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -1.4469F, -0.0876F, 0.0273F, -0.9989F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -1.4469F, -0.0714F, 0.0403F, -0.5276F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -3.4469F, -0.0892F, 0.0307F, -1.4855F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(71, 67).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -3.4469F, -0.0607F, 0.0723F, -0.9452F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.0071F, -3.4469F, -0.027F, 0.0682F, -0.4728F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -1.4469F, -0.0714F, -0.0403F, 0.5276F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 69).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -1.4469F, -0.0876F, -0.0273F, 0.9989F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 19).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -1.4469F, -0.0891F, 0.0217F, 1.5378F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(65, 80).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -3.4469F, -0.027F, -0.0682F, 0.4728F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 67).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -3.4469F, -0.0607F, -0.0723F, 0.9452F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 4).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.0071F, -3.4469F, -0.0892F, -0.0307F, 1.4855F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2262F, -4.9035F, -0.0414F, -0.0872F, 0.0036F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(14, 81).addBox(1.3842F, -1.8066F, -0.0709F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -0.7331F, -0.9572F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(55, 82).addBox(1.3842F, -1.9311F, -0.0523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -0.4331F, -2.9572F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.2191F, -0.4434F, -0.0894F, 0.1005F, -1.3808F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.2191F, -0.4434F, 0.0325F, 0.1051F, -0.363F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 71).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.2191F, -0.4434F, -0.0247F, 0.1321F, -0.8368F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.1191F, -2.4434F, -0.0895F, 0.1529F, -1.3284F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.1191F, -2.4434F, 0.0774F, 0.1326F, -0.3053F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, -0.1191F, -2.4434F, 0.0028F, 0.1769F, -0.7803F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 47).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.1809F, -4.4434F, -0.0895F, 0.1878F, -1.3459F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.1809F, -4.4434F, 0.0213F, 0.2067F, -0.7942F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.1809F, -4.4434F, 0.1075F, 0.1508F, -0.3185F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(51, 71).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.2191F, -0.4434F, -0.0247F, -0.1321F, 0.8368F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(80, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.2191F, -0.4434F, 0.0325F, -0.1051F, 0.363F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(54, 37).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.2191F, -0.4434F, -0.0894F, -0.1005F, 1.3808F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 4).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.1191F, -2.4434F, 0.0028F, -0.1769F, 0.7803F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(80, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.1191F, -2.4434F, 0.0774F, -0.1326F, 0.3053F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(18, 48).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, -0.1191F, -2.4434F, -0.0895F, -0.1529F, 1.3284F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(37, 47).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.1809F, -4.4434F, -0.0895F, -0.1878F, 1.3459F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(70, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.1809F, -4.4434F, 0.0213F, -0.2067F, 0.7942F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6342F, 0.1809F, -4.4434F, 0.1075F, -0.1508F, 0.3185F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(52, 80).addBox(1.3842F, -1.6652F, -0.1509F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -0.3331F, -4.8572F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(36, 15).addBox(0.8842F, -1.0237F, 4.9609F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.25F, 1.1669F, -9.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(82, 30).addBox(0.0342F, -2.0976F, -4.032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 44).addBox(0.0342F, -2.0814F, -2.0414F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1669F, -4.9572F, 0.0723F, -0.2611F, -0.0187F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.314F, -3.4862F, 0.1075F, 0.1508F, -0.4756F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.314F, -3.4862F, 0.0213F, 0.2067F, -0.9513F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.314F, -3.4862F, -0.0895F, 0.1878F, -1.503F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.214F, -1.3862F, -0.1761F, 0.1514F, -1.3932F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(36, 29).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.214F, -1.3862F, -0.0726F, 0.2203F, -0.8468F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(37, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 0.214F, -1.3862F, 0.0311F, 0.2051F, -0.3647F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(61, 46).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.314F, -3.4862F, -0.0895F, -0.1878F, 1.503F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 32).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.314F, -3.4862F, 0.0213F, -0.2067F, 0.9513F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(18, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.314F, -3.4862F, 0.1075F, -0.1508F, 0.4756F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(37, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.214F, -1.3862F, 0.0624F, -0.1235F, 0.3596F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 29).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.214F, -1.3862F, -0.0064F, -0.162F, 0.8342F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 47).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5342F, 0.214F, -1.3862F, -0.0894F, -0.1354F, 1.3808F));

		PartDefinition Bodyfront_r5 = bone.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(30, 38).addBox(0.8842F, -1.442F, -4.8209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.35F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.4342F, 4.1381F, -5.9865F));

		PartDefinition Bodyfront_r6 = bone3.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(0.1F, -1.759F, -1.9145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.8F, 0.0F, 0.0F, 1.3375F, -0.3189F, -0.9223F));

		PartDefinition Bodyfront_r7 = bone3.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(0.0F, -1.22F, 3.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 0.6036F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r8 = bone3.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(0.0F, 1.5066F, 4.739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 1.5635F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r9 = bone3.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(0.0F, -1.215F, 5.1421F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 0.9526F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r10 = bone3.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(0.0F, -2.4734F, 3.4743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 0.909F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r11 = bone3.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(0.0F, -1.4324F, 2.5416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 0.5599F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r12 = bone3.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(43, 35).mirror().addBox(0.0F, 0.2023F, -0.0227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(13, 39).mirror().addBox(0.0F, -1.4977F, -0.0227F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 1.1708F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r13 = bone3.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(0.0F, 0.8906F, -0.8548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -0.2F, -0.2F, 1.6944F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r14 = bone3.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(38, 54).addBox(-1.1F, -1.759F, -1.9145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3375F, 0.3189F, 0.9223F));

		PartDefinition Bodyfront_r15 = bone3.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(28, 63).addBox(-1.0F, 0.8906F, -0.8548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.6944F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r16 = bone3.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(75, 63).addBox(-1.0F, -1.4324F, 2.5416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 0.5599F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r17 = bone3.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(43, 35).addBox(-1.0F, 0.2023F, -0.0227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(13, 39).addBox(-1.0F, -1.4977F, -0.0227F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.1708F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r18 = bone3.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(7, 65).addBox(-1.0F, -1.22F, 3.4752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 0.6036F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r19 = bone3.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(45, 54).addBox(-1.0F, -2.4734F, 3.4743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 0.909F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r20 = bone3.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(75, 41).addBox(-1.0F, 1.5066F, 4.739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.5635F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r21 = bone3.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(24, 39).addBox(-1.0F, -1.215F, 5.1421F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 0.9526F, 0.0518F, -0.1398F));

		PartDefinition leftArm2 = bone3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3881F, 0.028F, 1.0564F, 0.3004F, -1.0003F, 0.1104F));

		PartDefinition cube_r79 = leftArm2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(79, 12).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2781F, 0.6517F, -0.0412F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r80 = leftArm2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(72, 21).addBox(-0.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6933F, 0.6517F, 0.4746F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r81 = leftArm2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 13).addBox(-16.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7015F, -2.4511F, -17.198F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r82 = leftArm2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 53).addBox(-0.35F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1932F, 0.6517F, -1.0401F, 0.0F, -1.6581F, 0.0F));

		PartDefinition cube_r83 = leftArm2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(58, 18).addBox(-4.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6556F, 0.1517F, -1.7434F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r84 = leftArm2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(66, 54).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8474F, 0.1517F, -0.8409F, 0.0F, 0.1833F, 0.0F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(12, 69).addBox(-0.4F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7561F, 0.1655F, -0.6232F, 0.72F, -0.1721F, 1.0432F));

		PartDefinition cube_r85 = leftArm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 43).addBox(-1.3F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6297F, 0.0F, -1.6313F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r86 = leftArm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(75, 27).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(66, 60).addBox(-0.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3341F, 0.0F, -0.9297F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r87 = leftArm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(31, 70).addBox(-1.95F, -1.0F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5568F, -2.5F, -1.9681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.683F, 1.0176F, -1.9603F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -2.5F, -3.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5346F, 0.0F, -1.8871F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightArm2 = bone3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4119F, 0.028F, 1.0564F, 0.1637F, -0.1982F, -0.3979F));

		PartDefinition cube_r88 = rightArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(79, 18).addBox(-0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2781F, 0.6517F, -0.0412F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r89 = rightArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(73, 60).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-3.6933F, 0.6517F, 0.4746F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r90 = rightArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(67, 16).addBox(14.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7015F, -2.4511F, -17.198F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r91 = rightArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 72).addBox(-0.65F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1932F, 0.6517F, -1.0401F, 0.0F, 1.6581F, 0.0F));

		PartDefinition cube_r92 = rightArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(58, 21).addBox(1.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.6556F, 0.1517F, -1.7434F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r93 = rightArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 57).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8474F, 0.1517F, -0.8409F, 0.0F, -0.1833F, 0.0F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(26, 70).addBox(-0.6F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7561F, 0.1655F, -0.6232F, -0.2814F, -0.1215F, -0.9583F));

		PartDefinition cube_r94 = rightArm.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(7, 58).addBox(-1.7F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6297F, 0.0F, -1.6313F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r95 = rightArm.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(75, 38).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(67, 10).addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3341F, 0.0F, -0.9297F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r96 = rightArm.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 38).addBox(0.95F, -1.0F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(55, 0).addBox(-0.4432F, -2.5F, -1.9681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.683F, 1.0176F, -1.9603F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(9, 46).addBox(0.0F, -2.5F, -3.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offset(-0.5346F, 0.0F, -1.8871F));

		PartDefinition Neck = bone.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, 0.6235F, -4.7722F, -0.3009F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(43, 78).addBox(1.3842F, -2.512F, -1.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.4093F, -0.0119F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(35, 63).addBox(0.8842F, -1.0375F, 1.0526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7906F, -3.0119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.0119F, 0.2564F, -0.2378F, -0.0276F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(8, 80).addBox(1.3842F, -1.125F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.0858F, -2.5106F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(5, 80).addBox(1.3842F, -1.8722F, -0.4294F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.1858F, -2.5106F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r5 = neck2.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(43, 29).addBox(0.8842F, -1.0572F, -0.6488F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, -0.5699F, -3.3965F, 0.1228F, -0.273F, -0.1313F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-0.575F, 0.0F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2335F, 1.2523F, -0.4976F, 0.7588F, 0.0347F, 0.2F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(46, 71).mirror().addBox(-0.372F, -1.9052F, 0.8982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4799F, 1.5777F, -1.9009F, -0.0266F, 0.0347F, 0.2F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(-0.0674F, -1.9283F, 0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4799F, 1.5777F, -1.9009F, -0.0493F, -0.3559F, 0.2486F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(41, 71).mirror().addBox(-0.0674F, -1.922F, -0.9557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4799F, 1.5777F, -1.9009F, -0.1889F, -0.3559F, 0.2486F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-0.068F, -1.9001F, -2.8542F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4799F, 1.5777F, -1.9009F, -0.202F, -0.3591F, 0.2173F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(59, 54).addBox(-0.932F, -1.9001F, -2.8542F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5482F, 1.5777F, -1.9009F, -0.202F, 0.3591F, -0.2173F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(41, 71).addBox(-0.9326F, -1.922F, -0.9557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5482F, 1.5777F, -1.9009F, -0.1889F, 0.3559F, -0.2486F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(36, 71).addBox(-0.9326F, -1.9283F, 0.0397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5482F, 1.5777F, -1.9009F, -0.0493F, 0.3559F, -0.2486F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(25, 8).addBox(-1.1158F, -0.9912F, -1.9818F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.35F, -1.3072F, -2.3531F, 1.6319F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(49, 64).addBox(-0.6158F, -1.1064F, -1.7358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(42, 4).addBox(-2.1158F, -0.9814F, -2.0108F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, -1.4822F, -1.3781F, 1.7191F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(42, 0).addBox(-2.1158F, -0.1174F, -1.9817F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.15F, -1.4072F, -1.2531F, 1.1476F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(24, 45).addBox(-2.1158F, -0.748F, -1.0208F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.35F, -0.3822F, -0.1031F, 0.4494F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(66, 77).addBox(-0.425F, 0.0F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3019F, 1.2523F, -0.4976F, 0.7588F, -0.0347F, -0.2F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(46, 71).addBox(-0.628F, -1.9052F, 0.8982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5482F, 1.5777F, -1.9009F, -0.0266F, -0.0347F, -0.2F));

		PartDefinition Upperjaw1 = Head.addOrReplaceChild("Upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.35F, -1.4315F, -3.8121F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperjaw6_r1 = Upperjaw1.addOrReplaceChild("Upperjaw6_r1", CubeListBuilder.create().texOffs(42, 64).addBox(-0.1158F, 0.0071F, -0.6057F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1039F, -4.0701F, -0.2225F, 0.0F, 0.0F));

		PartDefinition Upperjaw5_r1 = Upperjaw1.addOrReplaceChild("Upperjaw5_r1", CubeListBuilder.create().texOffs(49, 49).addBox(-0.1158F, 0.0113F, -1.8574F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.1789F, -2.4201F, -0.048F, 0.0F, 0.0F));

		PartDefinition Upperjaw11_r1 = Upperjaw1.addOrReplaceChild("Upperjaw11_r1", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.4524F, -1.1598F, 0.1703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.824F, 2.2499F, -6.5587F, 0.2483F, -0.3413F, -0.0113F));

		PartDefinition Upperjaw12_r1 = Upperjaw1.addOrReplaceChild("Upperjaw12_r1", CubeListBuilder.create().texOffs(70, 28).mirror().addBox(-0.4524F, -0.8406F, -0.4625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.824F, 2.2499F, -6.5587F, 0.1174F, -0.3413F, -0.0113F));

		PartDefinition Upperjaw13_r1 = Upperjaw1.addOrReplaceChild("Upperjaw13_r1", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.5207F, -0.4647F, -1.1005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.824F, 2.2499F, -6.5587F, 0.0882F, -0.3659F, -0.0488F));

		PartDefinition Upperjaw12_r2 = Upperjaw1.addOrReplaceChild("Upperjaw12_r2", CubeListBuilder.create().texOffs(66, 68).addBox(-0.4793F, -0.4647F, -1.1005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9444F, 2.2499F, -6.5587F, 0.0882F, 0.3659F, 0.0488F));

		PartDefinition Upperjaw11_r2 = Upperjaw1.addOrReplaceChild("Upperjaw11_r2", CubeListBuilder.create().texOffs(70, 28).addBox(-0.5475F, -0.8406F, -0.4625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9444F, 2.2499F, -6.5587F, 0.1174F, 0.3413F, 0.0113F));

		PartDefinition Upperjaw10_r1 = Upperjaw1.addOrReplaceChild("Upperjaw10_r1", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5475F, -1.1598F, 0.1703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9444F, 2.2499F, -6.5587F, 0.2483F, 0.3413F, 0.0113F));

		PartDefinition Upperjaw4_r1 = Upperjaw1.addOrReplaceChild("Upperjaw4_r1", CubeListBuilder.create().texOffs(63, 72).mirror().addBox(-0.8F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7842F, 3.0777F, 0.0663F, 0.5558F, -0.268F, 0.4031F));

		PartDefinition Upperjaw6_r2 = Upperjaw1.addOrReplaceChild("Upperjaw6_r2", CubeListBuilder.create().texOffs(32, 75).mirror().addBox(-0.0446F, -0.5372F, -1.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, 0.0742F, -0.0698F, 0.0F));

		PartDefinition Upperjaw7_r1 = Upperjaw1.addOrReplaceChild("Upperjaw7_r1", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.0446F, -0.3806F, -2.6129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 6).mirror().addBox(-0.0446F, -0.3556F, -3.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.0131F, -0.0698F, 0.0F));

		PartDefinition Upperjaw9_r1 = Upperjaw1.addOrReplaceChild("Upperjaw9_r1", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.0446F, 0.1539F, -4.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(18, 77).mirror().addBox(-0.0446F, -0.0461F, -5.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.144F, -0.0698F, 0.0F));

		PartDefinition Upperjaw9_r2 = Upperjaw1.addOrReplaceChild("Upperjaw9_r2", CubeListBuilder.create().texOffs(18, 77).addBox(-0.9554F, -0.0461F, -5.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 77).addBox(-0.9554F, 0.1539F, -4.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.144F, 0.0698F, 0.0F));

		PartDefinition Upperjaw7_r2 = Upperjaw1.addOrReplaceChild("Upperjaw7_r2", CubeListBuilder.create().texOffs(77, 6).addBox(-0.9554F, -0.3556F, -3.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 77).addBox(-0.9554F, -0.3806F, -2.6129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.0131F, 0.0698F, 0.0F));

		PartDefinition Upperjaw5_r2 = Upperjaw1.addOrReplaceChild("Upperjaw5_r2", CubeListBuilder.create().texOffs(32, 75).addBox(-0.9554F, -0.5372F, -1.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, 0.0742F, 0.0698F, 0.0F));

		PartDefinition Upperjaw4_r2 = Upperjaw1.addOrReplaceChild("Upperjaw4_r2", CubeListBuilder.create().texOffs(0, 64).addBox(-0.1158F, -0.0129F, -1.0084F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1289F, -1.4201F, 0.0742F, 0.0F, 0.0F));

		PartDefinition Upperjaw3_r1 = Upperjaw1.addOrReplaceChild("Upperjaw3_r1", CubeListBuilder.create().texOffs(63, 39).addBox(-0.1158F, 0.0089F, -1.0081F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.1289F, -0.4201F, -0.0218F, 0.0F, 0.0F));

		PartDefinition Upperjaw3_r2 = Upperjaw1.addOrReplaceChild("Upperjaw3_r2", CubeListBuilder.create().texOffs(63, 72).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9842F, 3.0777F, 0.0663F, 0.5558F, 0.268F, -0.4031F));

		PartDefinition Upperjaw2_r1 = Upperjaw1.addOrReplaceChild("Upperjaw2_r1", CubeListBuilder.create().texOffs(54, 39).addBox(-0.1158F, -0.45F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6289F, 0.0299F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjaw7_r3 = Upperjaw1.addOrReplaceChild("Upperjaw7_r3", CubeListBuilder.create().texOffs(38, 78).mirror().addBox(-0.0163F, -2.1197F, -1.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, 0.0026F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw6_r3 = Upperjaw1.addOrReplaceChild("Upperjaw6_r3", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(-0.0163F, -1.4277F, -2.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.3639F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw5_r3 = Upperjaw1.addOrReplaceChild("Upperjaw5_r3", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-0.575F, -0.7F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(78, 78).mirror().addBox(-0.8F, -0.7F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2595F, 1.4352F, -1.0764F, -0.1108F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw4_r3 = Upperjaw1.addOrReplaceChild("Upperjaw4_r3", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.0163F, -2.5279F, -1.1701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, 0.2819F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw3_r3 = Upperjaw1.addOrReplaceChild("Upperjaw3_r3", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.0163F, -2.0259F, -1.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.2854F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw4_r4 = Upperjaw1.addOrReplaceChild("Upperjaw4_r4", CubeListBuilder.create().texOffs(28, 78).mirror().addBox(-0.0163F, -2.0854F, -0.8018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, 0.0463F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw5_r4 = Upperjaw1.addOrReplaceChild("Upperjaw5_r4", CubeListBuilder.create().texOffs(33, 78).mirror().addBox(-0.0163F, -1.7359F, -1.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.0846F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw2_r2 = Upperjaw1.addOrReplaceChild("Upperjaw2_r2", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(0.0332F, -1.7646F, -0.7208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.1108F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw5_r5 = Upperjaw1.addOrReplaceChild("Upperjaw5_r5", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(0.0332F, -1.7595F, -2.4563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.0585F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw3_r4 = Upperjaw1.addOrReplaceChild("Upperjaw3_r4", CubeListBuilder.create().texOffs(72, 34).mirror().addBox(0.0332F, -1.8429F, -1.4683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.0017F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw5_r6 = Upperjaw1.addOrReplaceChild("Upperjaw5_r6", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(0.0332F, -1.1141F, -4.3333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.281F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw4_r5 = Upperjaw1.addOrReplaceChild("Upperjaw4_r5", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(0.0332F, -1.4822F, -3.4111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.1719F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw6_r4 = Upperjaw1.addOrReplaceChild("Upperjaw6_r4", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(0.0332F, -0.5352F, -5.1752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.4163F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw6_r5 = Upperjaw1.addOrReplaceChild("Upperjaw6_r5", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(0.0332F, -2.4042F, -4.7268F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4658F, 2.729F, -0.012F, -0.0192F, -0.0619F, 0.1306F));

		PartDefinition Upperjaw4_r6 = Upperjaw1.addOrReplaceChild("Upperjaw4_r6", CubeListBuilder.create().texOffs(72, 48).addBox(-1.0332F, -1.7595F, -2.4563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.0585F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw5_r7 = Upperjaw1.addOrReplaceChild("Upperjaw5_r7", CubeListBuilder.create().texOffs(70, 42).addBox(-1.0332F, -0.5352F, -5.1752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.4163F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw5_r8 = Upperjaw1.addOrReplaceChild("Upperjaw5_r8", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0332F, -2.4042F, -4.7268F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.0192F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw4_r7 = Upperjaw1.addOrReplaceChild("Upperjaw4_r7", CubeListBuilder.create().texOffs(51, 73).addBox(-1.0332F, -1.1141F, -4.3333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.281F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw3_r5 = Upperjaw1.addOrReplaceChild("Upperjaw3_r5", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0332F, -1.4822F, -3.4111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.1719F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw2_r3 = Upperjaw1.addOrReplaceChild("Upperjaw2_r3", CubeListBuilder.create().texOffs(72, 34).addBox(-1.0332F, -1.8429F, -1.4683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.0017F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw5_r9 = Upperjaw1.addOrReplaceChild("Upperjaw5_r9", CubeListBuilder.create().texOffs(78, 78).addBox(-0.2F, -0.7F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 50).addBox(-0.425F, -0.7F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.5089F, 1.4352F, -1.0764F, -0.1108F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw3_r6 = Upperjaw1.addOrReplaceChild("Upperjaw3_r6", CubeListBuilder.create().texOffs(78, 3).addBox(-0.9837F, -2.5279F, -1.1701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, 0.2819F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw6_r6 = Upperjaw1.addOrReplaceChild("Upperjaw6_r6", CubeListBuilder.create().texOffs(38, 78).addBox(-0.9837F, -2.1197F, -1.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, 0.0026F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw5_r10 = Upperjaw1.addOrReplaceChild("Upperjaw5_r10", CubeListBuilder.create().texOffs(79, 9).addBox(-0.9837F, -1.4277F, -2.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.3639F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw4_r8 = Upperjaw1.addOrReplaceChild("Upperjaw4_r8", CubeListBuilder.create().texOffs(33, 78).addBox(-0.9837F, -1.7359F, -1.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.0846F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw3_r7 = Upperjaw1.addOrReplaceChild("Upperjaw3_r7", CubeListBuilder.create().texOffs(28, 78).addBox(-0.9837F, -2.0854F, -0.8018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, 0.0463F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw2_r4 = Upperjaw1.addOrReplaceChild("Upperjaw2_r4", CubeListBuilder.create().texOffs(0, 78).addBox(-0.9837F, -2.0259F, -1.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.2854F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw1_r1 = Upperjaw1.addOrReplaceChild("Upperjaw1_r1", CubeListBuilder.create().texOffs(17, 72).addBox(-1.0332F, -1.7646F, -0.7208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2342F, 2.729F, -0.012F, -0.1108F, 0.0619F, -0.1306F));

		PartDefinition Upperjaw2 = Upperjaw1.addOrReplaceChild("Upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9F, -3.3F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjaw3_r8 = Upperjaw2.addOrReplaceChild("Upperjaw3_r8", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(-0.4139F, -1.0606F, -0.9576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.824F, -1.4393F, -3.3572F, 0.2099F, -0.3906F, 0.0418F));

		PartDefinition Upperjaw10_r2 = Upperjaw2.addOrReplaceChild("Upperjaw10_r2", CubeListBuilder.create().texOffs(72, 6).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9592F, -2.7755F, -3.1203F, -1.3656F, -0.3991F, 0.0463F));

		PartDefinition Upperjaw6_r7 = Upperjaw2.addOrReplaceChild("Upperjaw6_r7", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.0842F, -0.9059F, -0.1145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.9684F, -2.975F, -4.275F, -0.7854F, -0.3665F, 0.0F));

		PartDefinition Upperjaw7_r4 = Upperjaw2.addOrReplaceChild("Upperjaw7_r4", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-0.0842F, -1.6208F, -0.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9684F, -2.975F, -4.275F, -1.2305F, -0.3665F, 0.0F));

		PartDefinition Upperjaw12_r3 = Upperjaw2.addOrReplaceChild("Upperjaw12_r3", CubeListBuilder.create().texOffs(23, 77).mirror().addBox(-0.525F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.9592F, -2.7755F, -3.1203F, -1.7147F, -0.3991F, 0.0463F));

		PartDefinition Upperjaw11_r3 = Upperjaw2.addOrReplaceChild("Upperjaw11_r3", CubeListBuilder.create().texOffs(77, 21).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9938F, -2.8945F, -3.2536F, -1.2347F, -0.3991F, 0.0463F));

		PartDefinition Upperjaw11_r4 = Upperjaw2.addOrReplaceChild("Upperjaw11_r4", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.4139F, -1.3614F, -1.0707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.824F, -1.4393F, -3.3572F, -1.3653F, -0.3906F, 0.0418F));

		PartDefinition Upperjaw11_r5 = Upperjaw2.addOrReplaceChild("Upperjaw11_r5", CubeListBuilder.create().texOffs(73, 76).mirror().addBox(-0.0067F, -1.0596F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(78, 59).mirror().addBox(-0.0067F, -1.3596F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.2342F, -3.3755F, -2.7703F, -1.646F, -0.1344F, 0.1395F));

		PartDefinition Upperjaw9_r3 = Upperjaw2.addOrReplaceChild("Upperjaw9_r3", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(0.0038F, -0.8992F, -0.7155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0349F, -2.0508F, -2.6769F, -1.6409F, -0.0781F, 0.0079F));

		PartDefinition Upperjaw10_r3 = Upperjaw2.addOrReplaceChild("Upperjaw10_r3", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5861F, -1.3614F, -1.0707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9444F, -1.4393F, -3.3572F, -1.3653F, 0.3906F, -0.0418F));

		PartDefinition Upperjaw11_r6 = Upperjaw2.addOrReplaceChild("Upperjaw11_r6", CubeListBuilder.create().texOffs(78, 59).addBox(-0.9933F, -1.3596F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(73, 76).addBox(-0.9933F, -1.0596F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5342F, -3.3755F, -2.7703F, -1.646F, 0.1344F, -0.1395F));

		PartDefinition Upperjaw11_r7 = Upperjaw2.addOrReplaceChild("Upperjaw11_r7", CubeListBuilder.create().texOffs(23, 77).addBox(-0.475F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.8092F, -2.7755F, -3.1203F, -1.7147F, 0.3991F, -0.0463F));

		PartDefinition Upperjaw10_r4 = Upperjaw2.addOrReplaceChild("Upperjaw10_r4", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7746F, -2.8945F, -3.2536F, -1.2347F, 0.3991F, -0.0463F));

		PartDefinition Upperjaw9_r4 = Upperjaw2.addOrReplaceChild("Upperjaw9_r4", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8092F, -2.7755F, -3.1203F, -1.3656F, 0.3991F, -0.0463F));

		PartDefinition Upperjaw8_r1 = Upperjaw2.addOrReplaceChild("Upperjaw8_r1", CubeListBuilder.create().texOffs(74, 10).addBox(-1.0038F, -0.8992F, -0.7155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7334F, -2.0508F, -2.6769F, -1.6409F, 0.0781F, -0.0079F));

		PartDefinition Upperjaw7_r5 = Upperjaw2.addOrReplaceChild("Upperjaw7_r5", CubeListBuilder.create().texOffs(54, 33).addBox(-0.1158F, -0.9128F, -0.1085F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, -3.85F, -2.25F, -1.6406F, 0.0F, 0.0F));

		PartDefinition Upperjaw6_r8 = Upperjaw2.addOrReplaceChild("Upperjaw6_r8", CubeListBuilder.create().texOffs(54, 29).addBox(-0.1158F, -0.8881F, -0.0963F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -3.825F, -3.025F, -1.5228F, 0.0F, 0.0F));

		PartDefinition Upperjaw6_r9 = Upperjaw2.addOrReplaceChild("Upperjaw6_r9", CubeListBuilder.create().texOffs(74, 13).addBox(-0.9158F, -1.6208F, -0.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8F, -2.975F, -4.275F, -1.2305F, 0.3665F, 0.0F));

		PartDefinition Upperjaw5_r11 = Upperjaw2.addOrReplaceChild("Upperjaw5_r11", CubeListBuilder.create().texOffs(77, 30).addBox(-0.9158F, -0.9059F, -0.1145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.8F, -2.975F, -4.275F, -0.7854F, 0.3665F, 0.0F));

		PartDefinition Upperjaw5_r12 = Upperjaw2.addOrReplaceChild("Upperjaw5_r12", CubeListBuilder.create().texOffs(74, 0).addBox(0.3842F, -0.9104F, -0.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -3.55F, -3.8F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Upperjaw4_r9 = Upperjaw2.addOrReplaceChild("Upperjaw4_r9", CubeListBuilder.create().texOffs(61, 76).addBox(-0.1158F, -0.9059F, -0.1144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, -2.975F, -4.35F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Upperjaw4_r10 = Upperjaw2.addOrReplaceChild("Upperjaw4_r10", CubeListBuilder.create().texOffs(18, 50).addBox(-0.1158F, -0.1095F, -0.0494F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, -2.175F, -4.45F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Upperjaw3_r9 = Upperjaw2.addOrReplaceChild("Upperjaw3_r9", CubeListBuilder.create().texOffs(56, 76).addBox(-0.1158F, -0.7097F, -0.0407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -2.375F, -4.45F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Upperjaw2_r5 = Upperjaw2.addOrReplaceChild("Upperjaw2_r5", CubeListBuilder.create().texOffs(42, 75).addBox(-0.5861F, -1.0606F, -0.9576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.9444F, -1.4393F, -3.3572F, 0.2099F, 0.3906F, -0.0418F));

		PartDefinition Upperteeth2 = Upperjaw2.addOrReplaceChild("Upperteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition Upperteeth1 = Upperjaw1.addOrReplaceChild("Upperteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -3.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.025F, 1.8009F, -0.3826F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Lowerjaw7_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r1", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(0.3556F, 0.7045F, -3.795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4845F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw8_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r1", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(0.3556F, 1.2152F, -5.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4671F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw7_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r2", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(0.9144F, 1.0969F, -8.253F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4494F, -0.1497F, 0.0265F));

		PartDefinition Lowerjaw6_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r1", CubeListBuilder.create().texOffs(31, 49).mirror().addBox(0.3556F, 1.0742F, -5.0953F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4409F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw5_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r1", CubeListBuilder.create().texOffs(74, 16).mirror().addBox(0.0733F, 0.1384F, -2.7954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(0.0733F, -0.4616F, -2.7954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(73, 73).mirror().addBox(0.0733F, 0.1384F, -2.4704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.1194F, -0.3289F, 0.175F));

		PartDefinition Lowerjaw3_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r1", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(0.0733F, -0.503F, -1.7951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, 0.2733F, -0.3289F, 0.175F));

		PartDefinition Lowerjaw3_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r2", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(0.242F, -0.3031F, -2.928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4185F, -0.2493F, 0.1376F));

		PartDefinition Lowerjaw4_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r1", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(0.3556F, -0.7999F, -4.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.1835F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw4_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r2", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(0.7875F, -3.8827F, -8.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, 0.0539F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw5_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r2", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(0.7875F, 1.0187F, -8.8163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.5134F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw5_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r3", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(0.7875F, -6.8785F, -6.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, 0.56F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw6_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r2", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7245F, -1.2512F, -5.8366F, -0.3665F, -0.1497F, 0.0265F));

		PartDefinition Lowerjaw5_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r4", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(0.3556F, 0.2486F, -5.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4191F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw6_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r3", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(0.3556F, 0.0869F, -5.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 69).mirror().addBox(0.3556F, 0.0869F, -5.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4627F, -0.253F, 0.0287F));

		PartDefinition Lowerjaw7_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r3", CubeListBuilder.create().texOffs(77, 44).mirror().addBox(0.9144F, -0.1812F, -6.8129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 47).mirror().addBox(0.9144F, -0.2062F, -7.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.445F, -0.1497F, 0.0265F));

		PartDefinition Lowerjaw10_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r1", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(0.7875F, -2.4237F, -9.3921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.269F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw11_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r1", CubeListBuilder.create().texOffs(68, 73).mirror().addBox(0.7875F, -0.3169F, -8.806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.4872F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw11_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r2", CubeListBuilder.create().texOffs(53, 60).mirror().addBox(0.7875F, -3.8694F, -9.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.0509F, -0.1585F, 0.0352F));

		PartDefinition Lowerjaw3_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r3", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(0.2483F, -1.0617F, -0.8715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, 0.4042F, -0.3289F, 0.175F));

		PartDefinition Lowerjaw2_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r1", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(0.0733F, -0.5576F, -1.6505F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.094F, 0.6197F, 0.0557F, -0.0321F, -0.3289F, 0.175F));

		PartDefinition Lowerjaw6_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r4", CubeListBuilder.create().texOffs(63, 31).addBox(-1.3556F, 0.7045F, -3.795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4845F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw7_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r4", CubeListBuilder.create().texOffs(27, 74).addBox(-1.3556F, 1.2152F, -5.4854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4671F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw6_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r5", CubeListBuilder.create().texOffs(7, 53).addBox(-1.9144F, 1.0969F, -8.253F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4494F, 0.1497F, -0.0265F));

		PartDefinition Lowerjaw5_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r5", CubeListBuilder.create().texOffs(31, 49).addBox(-1.3556F, 1.0742F, -5.0953F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4409F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw4_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r3", CubeListBuilder.create().texOffs(74, 16).addBox(-1.0733F, 0.1384F, -2.7954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 0).addBox(-1.0733F, -0.4616F, -2.7954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F))
				.texOffs(73, 73).addBox(-1.0733F, 0.1384F, -2.4704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.1194F, 0.3289F, -0.175F));

		PartDefinition Lowerjaw2_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r2", CubeListBuilder.create().texOffs(14, 61).addBox(-1.0733F, -0.503F, -1.7951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, 0.2733F, 0.3289F, -0.175F));

		PartDefinition Lowerjaw2_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r3", CubeListBuilder.create().texOffs(21, 63).addBox(-1.242F, -0.3031F, -2.928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4185F, 0.2493F, -0.1376F));

		PartDefinition Lowerjaw3_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r4", CubeListBuilder.create().texOffs(56, 64).addBox(-1.3556F, -0.7999F, -4.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.1835F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw3_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r5", CubeListBuilder.create().texOffs(71, 79).addBox(-1.7875F, -3.8827F, -8.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, 0.0539F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw4_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r4", CubeListBuilder.create().texOffs(14, 65).addBox(-1.7875F, 1.0187F, -8.8163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.5134F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw4_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r5", CubeListBuilder.create().texOffs(60, 79).addBox(-1.7875F, -6.8785F, -6.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, 0.56F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw5_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r6", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7429F, -1.2512F, -5.8366F, -0.3665F, 0.1497F, -0.0265F));

		PartDefinition Lowerjaw4_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r6", CubeListBuilder.create().texOffs(77, 33).addBox(-1.3556F, 0.2486F, -5.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4191F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw5_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r7", CubeListBuilder.create().texOffs(78, 66).addBox(-1.3556F, 0.0869F, -5.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 69).addBox(-1.3556F, 0.0869F, -5.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4627F, 0.253F, -0.0287F));

		PartDefinition Lowerjaw6_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r6", CubeListBuilder.create().texOffs(77, 44).addBox(-1.9144F, -0.1812F, -6.8129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 47).addBox(-1.9144F, -0.2062F, -7.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.445F, 0.1497F, -0.0265F));

		PartDefinition Lowerjaw9_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r1", CubeListBuilder.create().texOffs(61, 68).addBox(-1.7875F, -2.4237F, -9.3921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.269F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw10_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r2", CubeListBuilder.create().texOffs(68, 73).addBox(-1.7875F, -0.3169F, -8.806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.4872F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw10_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r3", CubeListBuilder.create().texOffs(53, 60).addBox(-1.7875F, -3.8694F, -9.4589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.0509F, 0.1585F, -0.0352F));

		PartDefinition Lowerjaw2_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r4", CubeListBuilder.create().texOffs(37, 75).addBox(-1.2483F, -1.0617F, -0.8715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, 0.4042F, 0.3289F, -0.175F));

		PartDefinition Lowerjaw1_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw1_r1", CubeListBuilder.create().texOffs(63, 27).addBox(-1.0733F, -0.5576F, -1.6505F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1124F, 0.6197F, 0.0557F, -0.0321F, 0.3289F, -0.175F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5158F, -0.6976F, -0.1156F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(80, 36).addBox(-0.0158F, -2.6976F, 0.8844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0158F, 0.6091F, 7.0187F, -0.1002F, 0.2262F, 0.0631F));

		PartDefinition Tail5_r1 = Tail1.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(49, 80).addBox(1.3842F, -1.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.6976F, 7.8844F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(46, 80).addBox(1.3842F, -1.6F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.6976F, 5.8844F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(80, 40).addBox(1.3842F, -2.0F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5976F, 3.7844F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail1.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.9842F, -0.5F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5316F, 0.3024F, 0.9844F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.0158F, -0.5F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3024F, 0.9844F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail4_r2 = Tail1.addOrReplaceChild("Tail4_r2", CubeListBuilder.create().texOffs(61, 82).addBox(1.3842F, 2.7F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 82).addBox(1.3842F, 1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 82).addBox(1.3842F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7743F, 1.0009F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 13).addBox(-0.5158F, -0.3711F, -0.0246F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 83).addBox(-0.0158F, -1.3711F, 0.9754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 83).addBox(-0.0158F, -1.0711F, 2.9754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(83, 34).addBox(-0.0158F, -0.8711F, 4.9754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2976F, 7.7844F, 0.0439F, 0.2691F, -0.1149F));

		PartDefinition Tail7_r1 = Tail2.addOrReplaceChild("Tail7_r1", CubeListBuilder.create().texOffs(70, 82).addBox(1.3842F, 2.9658F, 4.0688F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 83).addBox(1.3842F, 1.3658F, 2.0688F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 3).addBox(1.3842F, -0.0342F, 0.0688F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.6719F, 0.2165F, 0.637F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5158F, -0.4453F, -0.057F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(17, 69).addBox(-0.0158F, -0.8453F, -0.057F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 21).addBox(-0.0158F, -0.8453F, 1.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 24).addBox(-0.0158F, -0.7453F, 3.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 83).addBox(-0.0158F, -0.6453F, 5.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0289F, 6.9754F, 0.0817F, 0.261F, 0.0211F));

		PartDefinition Tail11_r1 = Tail3.addOrReplaceChild("Tail11_r1", CubeListBuilder.create().texOffs(83, 40).addBox(1.3842F, 8.7658F, 12.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 83).addBox(1.3842F, 7.4658F, 10.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 37).addBox(1.3842F, 6.1658F, 8.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 82).addBox(1.3842F, 3.9658F, 6.0688F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.643F, -6.7589F, 0.637F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5158F, -0.5213F, -0.0258F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0547F, 10.943F, -0.0404F, -0.218F, 0.0087F));

		PartDefinition Tail14_r1 = Tail4.addOrReplaceChild("Tail14_r1", CubeListBuilder.create().texOffs(42, 83).addBox(1.3842F, 12.8658F, 18.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 48).addBox(1.3842F, 11.3658F, 16.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 83).addBox(1.3842F, 10.1658F, 14.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.5884F, -17.7019F, 0.637F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(30, 31).addBox(-0.4908F, -0.5213F, -0.0258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.025F, 0.025F, 5.9F, -0.1328F, -0.3029F, 0.0398F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(36, 8).addBox(-0.4908F, -0.5213F, -0.0258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.05F, 4.825F, -0.1762F, -0.2579F, 0.0454F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 5.1529F, 3.1181F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(5, 73).addBox(-1.0F, 0.9594F, 3.3153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 59).addBox(-1.0F, -0.3406F, 2.3153F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -1.4923F, 0.0F, 0.3491F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(7, 61).addBox(-1.0F, -0.5535F, 2.7191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -2.0595F, 0.0F, 0.3491F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -3.7433F, 2.0593F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -1.7541F, 0.0F, 0.3491F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(65, 6).addBox(-1.0F, 0.9334F, 3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -0.2793F, 0.0F, 0.3491F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(49, 14).addBox(-1.0F, -1.1425F, 2.4807F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -0.8378F, 0.0F, 0.3491F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(49, 8).addBox(-1.0F, 0.8855F, -0.3844F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -0.0873F, 0.0F, 0.3491F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(73, 56).addBox(-1.0F, -0.1099F, 1.2977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -0.5236F, 0.0F, 0.3491F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(73, 52).addBox(-1.0F, -1.2022F, 0.2103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -1.5272F, 0.0F, 0.2618F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(49, 20).addBox(-1.0F, -1.2398F, -0.1836F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -4.2697F, -0.7583F, -1.9286F, 0.0F, 0.3491F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, -0.275F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4324F, 0.3778F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(58, 49).addBox(-0.5F, -1.9983F, 0.0047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1583F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(75, 24).addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.9697F, -1.3582F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(50, 77).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.8697F, -0.7583F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(43, 41).addBox(2.8842F, -0.882F, -2.0629F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-3.3842F, -5.2438F, 1.9756F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(40, 49).addBox(2.8842F, -1.9F, 5.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.3842F, -4.7438F, -6.0244F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.5F, 5.1529F, 3.1181F));

		PartDefinition Hips_r18 = bone4.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(0.0F, 0.9594F, 3.3153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 59).mirror().addBox(0.0F, -0.3406F, 2.3153F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -1.4923F, 0.0F, -0.3491F));

		PartDefinition Hips_r19 = bone4.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(0.0F, -0.5535F, 2.7191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -2.0595F, 0.0F, -0.3491F));

		PartDefinition Hips_r20 = bone4.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.0F, -3.7433F, 2.0593F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -1.7541F, 0.0F, -0.3491F));

		PartDefinition Hips_r21 = bone4.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(65, 6).mirror().addBox(0.0F, 0.9334F, 3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -0.2793F, 0.0F, -0.3491F));

		PartDefinition Hips_r22 = bone4.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(0.0F, -1.1425F, 2.4807F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -0.8378F, 0.0F, -0.3491F));

		PartDefinition Hips_r23 = bone4.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(0.0F, 0.8855F, -0.3844F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -0.0873F, 0.0F, -0.3491F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(0.0F, -0.1099F, 1.2977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -0.5236F, 0.0F, -0.3491F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(0.0F, -1.2022F, 0.2103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -1.5272F, 0.0F, -0.2618F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(0.0F, -1.2398F, -0.1836F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.2697F, -0.7583F, -1.9286F, 0.0F, -0.3491F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.5F, -0.275F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.4324F, 0.3778F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.5F, -1.9983F, 0.0047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1583F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(75, 24).mirror().addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.9697F, -1.3582F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.8697F, -0.7583F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(43, 41).mirror().addBox(-3.8842F, -0.882F, -2.0629F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(3.3842F, -5.2438F, 1.9756F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(40, 49).mirror().addBox(-3.8842F, -1.9F, 5.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(3.3842F, -4.7438F, -6.0244F, -0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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