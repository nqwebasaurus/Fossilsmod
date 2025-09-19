package fossils.fossils.client.blockentity.model.hyperodapedon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HyperodapedonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart Belly;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart Neck2;
	private final ModelPart neck3;
	private final ModelPart Head2;
	private final ModelPart Lowerjaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tail1;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart bone2;
	private final ModelPart bone5;

	public HyperodapedonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.Belly = this.Hips.getChild("Belly");
		this.body2 = this.Belly.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone6 = this.bone3.getChild("bone6");
		this.leftArm2 = this.bone3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.Neck2 = this.bone.getChild("Neck2");
		this.neck3 = this.Neck2.getChild("neck3");
		this.Head2 = this.neck3.getChild("Head2");
		this.Lowerjaw1 = this.Head2.getChild("Lowerjaw1");
		this.leftFace = this.Head2.getChild("leftFace");
		this.rightFace = this.Head2.getChild("rightFace");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail4 = this.Tail1.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone5 = this.Hips.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.4F, 7.7F, -0.3916F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(55, 65).addBox(1.3842F, -2.0F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 3).addBox(1.3842F, -1.8F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).mirror().addBox(-0.1158F, -0.5F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(1.8842F, -0.5F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(22, 27).addBox(0.8842F, -1.0F, 2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0119F, 0.9208F, 2.3963F, 0.1102F, 0.1446F, 0.4895F));

		PartDefinition cube_r1 = leftArm5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 10).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4781F, 0.6517F, -0.0412F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r2 = leftArm5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 38).addBox(-0.25F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0068F, 0.6517F, -1.0401F, 0.0F, -1.7628F, 0.0F));

		PartDefinition cube_r3 = leftArm5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.2089F, 0.0F, 0.0261F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.533F, -0.3483F, -0.9935F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = leftArm5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 40).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0334F, 0.1517F, -0.4411F, 0.0F, 0.0175F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8792F, 0.2932F, -0.3144F, -2.0178F, -1.0298F, 3.0945F));

		PartDefinition cube_r5 = leftArm6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 55).addBox(1.2272F, -0.5F, -0.224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(28, 49).addBox(-0.2728F, -0.5F, -0.224F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4638F, -1.1627F, -1.2479F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r6 = leftArm6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 23).addBox(-0.95F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.9638F, -1.1627F, -0.5479F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r7 = leftArm6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 5).addBox(-0.183F, -0.4988F, -0.1637F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6962F, -0.2638F, -1.6864F, 0.0F, 0.4102F, 0.0F));

		PartDefinition cube_r8 = leftArm6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 49).addBox(-0.8591F, -0.4988F, -0.5125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0962F, -0.2638F, -0.7864F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r9 = leftArm6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 55).addBox(-1.4433F, -0.9988F, -0.3566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0962F, 0.2362F, -0.7864F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r10 = leftArm6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 35).addBox(-1.4326F, -0.9988F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0962F, 0.2362F, -0.7864F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(11, 22).addBox(-0.2706F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0223F, 0.2383F, -1.9763F, -0.0018F, -0.0611F, 0.0004F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(0, 28).addBox(-0.6347F, -2.5F, -2.724F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.1956F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0119F, 0.9208F, 2.3963F, 0.1582F, -0.5717F, -0.5964F));

		PartDefinition cube_r11 = rightArm5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4781F, 0.6517F, -0.0412F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r12 = rightArm5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 38).mirror().addBox(-0.75F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.0068F, 0.6517F, -1.0401F, 0.0F, 1.7628F, 0.0F));

		PartDefinition cube_r13 = rightArm5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-2.791F, 0.0F, 0.0261F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.533F, -0.3483F, -0.9935F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r14 = rightArm5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 40).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 0.1517F, -0.4411F, 0.0F, -0.0175F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8792F, 0.2932F, -0.3144F, -0.8025F, 0.8688F, -1.6825F));

		PartDefinition cube_r15 = rightArm6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-2.2272F, -0.5F, -0.224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(28, 49).mirror().addBox(-1.7272F, -0.5F, -0.224F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4638F, -1.1627F, -1.2479F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r16 = rightArm6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-1.05F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9638F, -1.1627F, -0.5479F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r17 = rightArm6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-1.817F, -0.4988F, -0.1637F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6962F, -0.2638F, -1.6864F, 0.0F, -0.4102F, 0.0F));

		PartDefinition cube_r18 = rightArm6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-1.1409F, -0.4988F, -0.5125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0962F, -0.2638F, -0.7864F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r19 = rightArm6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(0.4433F, -0.9988F, -0.3566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0962F, 0.2362F, -0.7864F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r20 = rightArm6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 35).mirror().addBox(0.4326F, -0.9988F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0962F, 0.2362F, -0.7864F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(11, 22).mirror().addBox(-0.7294F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0223F, 0.2383F, -1.9763F, -0.002F, 0.4538F, -0.0012F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.3653F, -2.5F, -2.724F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -0.9774F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2625F, 0.7217F, 0.212F, -0.0853F, -0.0183F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(66, 47).addBox(1.3842F, -0.864F, 0.0152F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, -1.8166F, -2.3734F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(31, 52).addBox(1.3842F, -1.8F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 27).addBox(0.8842F, -1.0F, 5.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, -1.0166F, -10.1734F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Belly.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4845F, -1.8703F, 0.1734F, 0.4039F, -0.9069F));

		PartDefinition cube_r22 = Belly.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4845F, -1.8703F, 0.3313F, 0.2596F, -0.4314F));

		PartDefinition cube_r23 = Belly.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(65, 50).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4345F, -3.8703F, -0.0711F, 0.4842F, -1.4463F));

		PartDefinition cube_r24 = Belly.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4345F, -3.8703F, 0.2075F, 0.446F, -0.8405F));

		PartDefinition cube_r25 = Belly.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4345F, -3.8703F, 0.38F, 0.2829F, -0.3659F));

		PartDefinition cube_r26 = Belly.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(63, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4845F, -1.8703F, 0.3313F, -0.2596F, 0.4314F));

		PartDefinition cube_r27 = Belly.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(55, 0).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4845F, -1.8703F, 0.1734F, -0.4039F, 0.9069F));

		PartDefinition cube_r28 = Belly.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4345F, -3.8703F, 0.38F, -0.2829F, 0.3659F));

		PartDefinition cube_r29 = Belly.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 33).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4345F, -3.8703F, 0.2075F, -0.446F, 0.8405F));

		PartDefinition cube_r30 = Belly.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 50).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4345F, -3.8703F, -0.0711F, -0.4842F, 1.4463F));

		PartDefinition Belly_r3 = Belly.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(17, 5).addBox(-0.6158F, -0.05F, 0.15F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, 3.2945F, -3.8477F, 0.1396F, 0.0F, 0.0F));

		PartDefinition body2 = Belly.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0158F, -1.4916F, -4.3234F, 0.0786F, -0.0435F, -0.0034F));

		PartDefinition Belly_r4 = body2.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(35, 67).addBox(1.3842F, -1.7F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 33).addBox(0.8842F, -1.0F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.0071F, -1.4469F, 0.3313F, 0.2596F, -0.2394F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(53, 29).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.0071F, -1.4469F, 0.1734F, 0.4039F, -0.7149F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.0071F, -1.4469F, -0.0732F, 0.4319F, -1.3076F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(65, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.0071F, -1.4469F, 0.3313F, -0.2596F, 0.2394F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 29).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.0071F, -1.4469F, 0.1734F, -0.4039F, 0.7149F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 47).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.0071F, -1.4469F, -0.0732F, -0.4319F, 1.3076F));

		PartDefinition Belly_r5 = body2.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(17, 0).addBox(-1.1158F, -1.075F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 6.1218F, -2.5979F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2762F, -2.8535F, 0.1256F, -0.1299F, -0.0164F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(44, 67).addBox(1.3842F, -0.8065F, -0.0656F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.6331F, -0.9572F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(41, 67).addBox(1.3842F, -0.8311F, -0.0523F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.4331F, -2.9572F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2191F, -0.4434F, 0.1464F, 0.3109F, -0.6769F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2191F, -0.4434F, 0.2648F, 0.1883F, -0.2066F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2191F, -0.4434F, -0.0409F, 0.3403F, -1.2479F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 31).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.1191F, -2.4434F, 0.2284F, 0.3799F, -0.613F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.1191F, -2.4434F, 0.3668F, 0.2152F, -0.1501F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.1191F, -2.4434F, -0.0118F, 0.4402F, -1.2008F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 54).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2191F, -0.4434F, 0.1464F, -0.3109F, 0.6769F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2191F, -0.4434F, 0.2648F, -0.1883F, 0.2066F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 24).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2191F, -0.4434F, -0.0409F, -0.3403F, 1.2479F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 31).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.1191F, -2.4434F, 0.2284F, -0.3799F, 0.613F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(58, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.1191F, -2.4434F, 0.3668F, -0.2152F, 0.1501F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 38).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.1191F, -2.4434F, -0.0118F, -0.4402F, 1.2008F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(17, 17).addBox(-1.1158F, -1.0237F, -0.0391F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, 5.737F, -2.4306F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(18, 33).addBox(0.8842F, -1.0237F, 6.9609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, 1.1669F, -9.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(66, 55).addBox(-0.0158F, -1.0814F, -2.0414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0331F, -2.9572F, 0.1136F, -0.0434F, -0.0049F));

		PartDefinition Bodyfront_r5 = bone.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(66, 52).addBox(1.3842F, -0.8976F, 0.068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.1F, -4.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.314F, -3.4862F, -0.0594F, 0.5707F, -1.317F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 10).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.314F, -3.4862F, 0.2733F, 0.5107F, -0.6868F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.314F, -3.4862F, 0.4652F, 0.314F, -0.2175F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(21, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.2141F, -1.3862F, 0.3467F, 0.2217F, -0.1184F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.2141F, -1.3862F, 0.2064F, 0.3769F, -0.585F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.2141F, -1.3862F, -0.0287F, 0.4264F, -1.1718F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 36).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.314F, -3.4862F, -0.0594F, -0.5707F, 1.317F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(53, 10).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.314F, -3.4862F, 0.2733F, -0.5107F, 0.6868F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(28, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.314F, -3.4862F, 0.4652F, -0.314F, 0.2175F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(21, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.2141F, -1.3862F, 0.3467F, -0.2217F, 0.1184F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(52, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.2141F, -1.3862F, 0.2064F, -0.3769F, 0.585F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(32, 8).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.2141F, -1.3862F, -0.0287F, -0.4264F, 1.1718F));

		PartDefinition Bodyfront_r6 = bone.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(0, 16).addBox(-0.6158F, -0.917F, -4.0709F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, 5.717F, -0.0888F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(17, 10).addBox(0.8842F, -1.442F, -4.8209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.3842F, 4.1381F, -5.9865F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.1F, -0.7889F, 1.3948F));

		PartDefinition Bodyfront_r8 = bone4.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(39, 10).addBox(-1.1F, -1.759F, -2.2145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.2F, 0.2F, 1.3375F, 0.3189F, 0.9223F));

		PartDefinition Bodyfront_r9 = bone4.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(48, 14).addBox(-1.0F, -0.4094F, -0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6944F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r10 = bone4.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(30, 10).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7999F, -2.0796F, -0.0309F, 1.2581F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r11 = bone4.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(44, 47).addBox(-0.7987F, -0.2698F, -1.8049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, -0.8F, -1.6F, 1.4223F, 0.3317F, 0.7441F));

		PartDefinition Bodyfront_r12 = bone4.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(21, 45).addBox(-1.1962F, -0.607F, -0.6099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 41).addBox(-1.1962F, -0.107F, -0.6099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(60, 13).addBox(-1.1962F, -0.107F, -0.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.9614F, 0.0518F, -0.1398F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-6.7F, -0.7889F, 1.3948F));

		PartDefinition Bodyfront_r13 = bone6.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(39, 10).mirror().addBox(0.1F, -1.759F, -2.2145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2F, 0.2F, 1.3375F, -0.3189F, -0.9223F));

		PartDefinition Bodyfront_r14 = bone6.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(0.0F, -0.4094F, -0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6944F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r15 = bone6.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7999F, -2.0796F, -0.0309F, 1.2581F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r16 = bone6.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-0.2013F, -0.2698F, -1.8049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.8F, -1.6F, 1.4223F, -0.3317F, -0.7441F));

		PartDefinition Bodyfront_r17 = bone6.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(21, 45).mirror().addBox(0.1962F, -0.607F, -0.6099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 41).mirror().addBox(0.1962F, -0.107F, -0.6099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(60, 13).mirror().addBox(0.1962F, -0.107F, -0.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.9614F, -0.0518F, 0.1398F));

		PartDefinition leftArm2 = bone3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2515F, -1.3317F, 1.8479F, -0.1171F, -0.8128F, 0.64F));

		PartDefinition cube_r61 = leftArm2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 58).addBox(-0.7F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3283F, 0.8081F, 0.35F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r62 = leftArm2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 41).addBox(-0.35F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.143F, 0.8081F, -0.6489F, 0.0F, -1.7279F, 0.0F));

		PartDefinition cube_r63 = leftArm2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(32, 5).addBox(-4.275F, -0.5F, 0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7058F, 0.3081F, -1.3522F, 0.0F, 0.0524F, 0.0F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1403F, 0.1773F, -0.6036F, 0.403F, -0.0646F, 0.9981F));

		PartDefinition cube_r64 = leftArm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(33, 29).addBox(-1.2612F, -0.1123F, -0.4094F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5844F, 0.5461F, -0.7948F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r65 = leftArm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 33).addBox(-1.6439F, -0.7673F, -0.9694F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2887F, 0.5461F, -0.0932F, 0.0F, 0.5236F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(35, 51).addBox(-0.5568F, -1.5F, -0.9681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3608F, 1.1543F, -1.2969F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(36, 38).addBox(-0.7879F, -0.5F, -1.9879F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2867F, -1.0852F, -0.9022F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rightArm2 = bone3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5485F, -1.3317F, 1.8479F, 0.0263F, -0.5374F, -0.4729F));

		PartDefinition cube_r66 = rightArm2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-0.3F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3283F, 0.8081F, 0.35F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r67 = rightArm2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(27, 41).mirror().addBox(-0.65F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.143F, 0.8081F, -0.6489F, 0.0F, 1.7279F, 0.0F));

		PartDefinition cube_r68 = rightArm2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 5).mirror().addBox(0.275F, -0.5F, 0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7058F, 0.3081F, -1.3522F, 0.0F, -0.0524F, 0.0F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1403F, 0.1773F, -0.6036F, 0.1412F, 0.0646F, -0.9981F));

		PartDefinition cube_r69 = rightArm.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-2.7388F, -0.1123F, -0.4094F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5844F, 0.5461F, -0.7948F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r70 = rightArm.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 33).mirror().addBox(-2.3561F, -0.7673F, -0.9694F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2887F, 0.5461F, -0.0932F, 0.0F, -0.5236F, 0.0F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-0.4432F, -1.5F, -0.9681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3608F, 1.1543F, -1.2969F, 0.0F, 0.3054F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(36, 38).mirror().addBox(-0.2121F, -0.5F, -1.9879F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2867F, -1.0852F, -0.9022F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Neck2 = bone.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6235F, -4.7722F, -0.242F, -0.125F, 0.0386F));

		PartDefinition Neck_r1 = Neck2.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(66, 58).addBox(1.3842F, -1.0041F, -0.0931F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.4094F, -1.0119F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2094F, -0.714F, 0.1055F, 0.9456F, -1.2015F));

		PartDefinition cube_r72 = Neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2094F, -0.714F, 0.6798F, 0.7252F, -0.4477F));

		PartDefinition cube_r73 = Neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, -0.2094F, -0.714F, 0.878F, 0.3724F, -0.0768F));

		PartDefinition cube_r74 = Neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(63, 27).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2094F, -0.714F, 0.878F, -0.3724F, 0.0768F));

		PartDefinition cube_r75 = Neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(53, 12).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2094F, -0.714F, 0.6798F, -0.7252F, 0.4477F));

		PartDefinition cube_r76 = Neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(43, 8).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, -0.2094F, -0.714F, 0.1055F, -0.9456F, 1.2015F));

		PartDefinition Neck_r2 = Neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(41, 43).addBox(0.8842F, -1.0375F, 1.0526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7907F, -3.0119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = Neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.0119F, 0.1949F, -0.1713F, -0.0336F));

		PartDefinition Neck_r3 = neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(38, 67).addBox(1.3842F, -0.9405F, 0.0595F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.3858F, -1.0106F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(50, 36).addBox(1.3842F, -1.1722F, -1.4294F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.1858F, -2.5106F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r77 = neck3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-1.9448F, -0.0222F, -0.5804F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.0999F, -2.7021F, 0.303F, 0.7089F, -0.8006F));

		PartDefinition cube_r78 = neck3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5158F, 0.0999F, -0.6021F, 0.3525F, 0.7022F, -0.7421F));

		PartDefinition cube_r79 = neck3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 2).addBox(-0.0552F, -0.0222F, -0.5804F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.0999F, -2.7021F, 0.303F, -0.7089F, 0.8006F));

		PartDefinition cube_r80 = neck3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(44, 30).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4842F, 0.0999F, -0.6021F, 0.3525F, -0.7022F, 0.7421F));

		PartDefinition Neck_r5 = neck3.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(17, 21).addBox(0.8842F, -1.0572F, -0.6488F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head2 = neck3.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2094F, -4.2314F, 0.3377F, -0.2116F, -0.0537F));

		PartDefinition Head_r1 = Head2.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(51, 26).addBox(-0.1158F, -0.9912F, -0.9818F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.9F, -1.2039F, -3.8844F, 2.3911F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head2.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(14, 51).addBox(-0.1158F, -0.9912F, -0.9818F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, -1.2388F, -2.885F, 1.6057F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head2.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(7, 51).addBox(-0.6158F, -0.9912F, -0.9818F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4F, -1.3708F, -2.096F, 1.7366F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head2.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(35, 61).addBox(-0.6158F, -0.5912F, -0.9818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, -1.3656F, -1.496F, 1.5621F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head2.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(43, 0).addBox(-0.6158F, -0.9912F, -1.9818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1F, -1.616F, -0.5278F, 1.8239F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head2.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(37, 20).addBox(-1.1158F, -0.9814F, -2.0108F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.7909F, 0.4472F, 1.7191F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head2.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(33, 26).addBox(-2.1158F, -0.0262F, -0.9406F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -0.7972F, 0.8669F, 0.0567F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head2.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(38, 32).addBox(-1.1158F, -0.0262F, -0.9406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -1.716F, 0.4722F, 0.4058F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head2.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.237F, 0.6334F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Lowerjaw5_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r1", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-0.5024F, -0.4939F, -2.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(56, 59).mirror().addBox(-0.5024F, -0.4939F, -1.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.0932F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw7_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r1", CubeListBuilder.create().texOffs(37, 47).mirror().addBox(0.1353F, 0.336F, -1.8047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(47, 32).mirror().addBox(0.1353F, -0.264F, -1.8047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0085F, -0.9006F, -2.1588F, -0.3935F, -0.8418F, 0.3083F));

		PartDefinition Lowerjaw9_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r1", CubeListBuilder.create().texOffs(27, 36).mirror().addBox(-0.2355F, -0.5268F, -0.3931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8437F, -0.8262F, -4.5279F, -0.5004F, -0.4355F, 0.1765F));

		PartDefinition Lowerjaw8_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r1", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.2355F, -0.6192F, -0.366F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 0).mirror().addBox(-0.2355F, -1.2192F, -0.666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8437F, -0.8262F, -4.5279F, -0.4568F, -0.4355F, 0.1765F));

		PartDefinition Lowerjaw5_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r2", CubeListBuilder.create().texOffs(26, 52).mirror().addBox(-0.5024F, -0.5416F, -3.0946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.3288F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw4_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r1", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-0.5024F, -0.1786F, -2.5186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.4859F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw3_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r1", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.0267F, -0.2076F, -1.0005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.3812F, -0.1571F, 0.0F));

		PartDefinition Lowerjaw11_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r1", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(31, 55).addBox(0.1399F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5858F, -1.3788F, -4.3994F, 0.041F, 0.0F, 0.0F));

		PartDefinition Lowerjaw10_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r1", CubeListBuilder.create().texOffs(55, 22).mirror().addBox(-0.5461F, -0.5532F, -0.5665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5728F, -1.8284F, -4.3366F, 0.041F, -0.424F, -0.0208F));

		PartDefinition Lowerjaw10_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r2", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-0.5461F, -0.4349F, 0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 65).mirror().addBox(-0.5461F, 0.1651F, 0.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5728F, -1.8284F, -4.3366F, -0.6571F, -0.424F, -0.0208F));

		PartDefinition Lowerjaw8_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r2", CubeListBuilder.create().texOffs(48, 42).mirror().addBox(0.1353F, 0.759F, -1.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0085F, -0.9006F, -2.1588F, -0.5943F, -0.8418F, 0.3083F));

		PartDefinition Lowerjaw7_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r2", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.5024F, -0.2075F, -2.8976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.4248F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw6_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r1", CubeListBuilder.create().texOffs(25, 59).mirror().addBox(-0.5024F, -0.2308F, -2.7691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(20, 59).mirror().addBox(-0.5024F, -0.2308F, -2.3691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, 0.0115F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw4_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r2", CubeListBuilder.create().texOffs(15, 59).mirror().addBox(-0.5024F, -0.3952F, -1.8183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, 0.1163F, -0.6458F, 0.1571F));

		PartDefinition Lowerjaw3_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r2", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-0.0267F, -0.2314F, -1.2441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, 0.0115F, -0.1571F, 0.0F));

		PartDefinition Lowerjaw2_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r1", CubeListBuilder.create().texOffs(46, 58).mirror().addBox(-0.0267F, -0.1576F, -0.6505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.344F, 0.1197F, 0.3558F, -0.163F, -0.1571F, 0.0F));

		PartDefinition Lowerjaw5_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r3", CubeListBuilder.create().texOffs(56, 59).addBox(-0.4976F, -0.4939F, -1.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(30, 59).addBox(-0.4976F, -0.4939F, -2.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.0932F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw6_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r2", CubeListBuilder.create().texOffs(37, 47).addBox(-1.1353F, 0.336F, -1.8047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F))
				.texOffs(47, 32).addBox(-1.1353F, -0.264F, -1.8047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9769F, -0.9006F, -2.1588F, -0.3935F, 0.8418F, -0.3083F));

		PartDefinition Lowerjaw11_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r2", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.5129F, -0.3056F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(41, 58).mirror().addBox(-0.5129F, -0.7056F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6001F, -2.6667F, -4.5603F, -0.0324F, -0.3389F, -0.2224F));

		PartDefinition Lowerjaw12_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r1", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.5129F, -0.4171F, -0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.6001F, -2.6667F, -4.5603F, 0.4475F, -0.3389F, -0.2224F));

		PartDefinition Lowerjaw7_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r3", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-0.5461F, -0.7206F, -0.8086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4978F, -1.8284F, -4.3366F, -0.8927F, -0.424F, -0.0208F));

		PartDefinition Lowerjaw6_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r3", CubeListBuilder.create().texOffs(41, 15).addBox(-0.4539F, -0.7206F, -0.8086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4662F, -1.8284F, -4.3366F, -0.8927F, 0.424F, 0.0208F));

		PartDefinition Lowerjaw8_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r3", CubeListBuilder.create().texOffs(27, 36).addBox(-0.7645F, -0.5268F, -0.3931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8121F, -0.8262F, -4.5279F, -0.5004F, 0.4355F, -0.1765F));

		PartDefinition Lowerjaw7_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r4", CubeListBuilder.create().texOffs(0, 35).addBox(-0.7645F, -0.6192F, -0.366F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 0).addBox(-0.7645F, -1.2192F, -0.666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8121F, -0.8262F, -4.5279F, -0.4568F, 0.4355F, -0.1765F));

		PartDefinition Lowerjaw4_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r3", CubeListBuilder.create().texOffs(26, 52).addBox(-0.4976F, -0.5416F, -3.0946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.3288F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw3_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r3", CubeListBuilder.create().texOffs(14, 47).addBox(-0.4976F, -0.1786F, -2.5186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.4859F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw2_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r2", CubeListBuilder.create().texOffs(7, 47).addBox(-0.9733F, -0.2076F, -1.0005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.3812F, 0.1571F, 0.0F));

		PartDefinition Lowerjaw11_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r3", CubeListBuilder.create().texOffs(41, 58).addBox(-0.4871F, -0.7056F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(36, 58).addBox(-0.4871F, -0.3056F, -0.4942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5684F, -2.6667F, -4.5603F, -0.0324F, 0.3389F, 0.2224F));

		PartDefinition Lowerjaw11_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r4", CubeListBuilder.create().texOffs(50, 64).addBox(-0.4871F, -0.4171F, -0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5684F, -2.6667F, -4.5603F, 0.4475F, 0.3389F, 0.2224F));

		PartDefinition Lowerjaw9_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r2", CubeListBuilder.create().texOffs(55, 22).addBox(-0.4539F, -0.5532F, -0.5665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5412F, -1.8284F, -4.3366F, 0.041F, 0.424F, 0.0208F));

		PartDefinition Lowerjaw9_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r3", CubeListBuilder.create().texOffs(65, 35).addBox(-0.4539F, -0.4349F, 0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 65).addBox(-0.4539F, 0.1651F, 0.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5412F, -1.8284F, -4.3366F, -0.6571F, 0.424F, 0.0208F));

		PartDefinition Lowerjaw7_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r5", CubeListBuilder.create().texOffs(48, 42).addBox(-1.1353F, 0.759F, -1.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9769F, -0.9006F, -2.1588F, -0.5943F, 0.8418F, -0.3083F));

		PartDefinition Lowerjaw6_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r4", CubeListBuilder.create().texOffs(21, 52).addBox(-0.4976F, -0.2075F, -2.8976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.4248F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw5_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r4", CubeListBuilder.create().texOffs(25, 59).addBox(-0.4976F, -0.2308F, -2.7691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(20, 59).addBox(-0.4976F, -0.2308F, -2.3691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, 0.0115F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw3_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r4", CubeListBuilder.create().texOffs(15, 59).addBox(-0.4976F, -0.3952F, -1.8183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, 0.1163F, 0.6458F, -0.1571F));

		PartDefinition Lowerjaw2_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r3", CubeListBuilder.create().texOffs(59, 7).addBox(-0.9733F, -0.2314F, -1.2441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, 0.0115F, 0.1571F, 0.0F));

		PartDefinition Lowerjaw1_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw1_r1", CubeListBuilder.create().texOffs(46, 58).addBox(-0.9733F, -0.1576F, -0.6505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3124F, 0.1197F, 0.3558F, -0.163F, 0.1571F, 0.0F));

		PartDefinition leftFace = Head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.4F, -1.3656F, -1.496F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(55, 41).addBox(-0.32F, -0.3815F, -0.6578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.1565F, 1.0366F, 2.3369F, -0.759F, -0.0829F, -0.9146F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(63, 24).addBox(-1.275F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 24).addBox(-0.475F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9323F, 0.1367F, 1.7298F, 0.4737F, 0.1279F, -1.4101F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(35, 64).addBox(-0.475F, -0.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9823F, 0.1438F, 1.0671F, 0.8462F, 0.1367F, -1.5342F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(51, 46).addBox(-0.125F, -0.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.411F, 0.5002F, -2.5741F, 1.8499F, -1.4438F, -0.2769F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(0, 54).addBox(-0.325F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2342F, 0.4756F, -1.8683F, 1.6111F, -0.5232F, -0.0201F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(63, 16).addBox(-0.475F, -0.925F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9323F, 0.1367F, 1.7298F, 0.7263F, 0.1942F, -1.4676F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(0, 64).addBox(-1.041F, -1.692F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 62).addBox(-1.041F, -0.892F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2608F, 0.2941F, 3.0062F, 0.4229F, -0.0772F, -1.0584F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(40, 61).addBox(-0.9158F, -0.8912F, -0.8818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 0.8931F, -3.0704F, 2.5763F, 0.0866F, 0.1924F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(64, 6).addBox(-0.32F, -0.3765F, -0.285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(55, 62).addBox(-0.32F, -0.5265F, -0.285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1565F, 1.0366F, 2.3369F, -0.1132F, -0.0829F, -0.9146F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(15, 65).addBox(-0.211F, -0.0322F, -0.7971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(65, 12).addBox(-0.211F, 0.0428F, -0.2721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1565F, 1.0366F, 2.3369F, -0.35F, -0.0108F, -0.603F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 58).addBox(-0.211F, 0.5301F, -0.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 4).addBox(-0.211F, 0.3301F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.1565F, 1.0366F, 2.3369F, -0.83F, -0.0108F, -0.603F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(56, 47).addBox(-1.0559F, -0.8073F, -1.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 53).addBox(-1.0559F, -0.6073F, -0.9217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(17, 56).addBox(-1.0559F, -0.8073F, -0.9217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.8657F, 2.6482F, 1.7016F, -1.4585F, -0.1114F, -0.3105F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(5, 56).addBox(-0.7601F, -1.9058F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6092F, 2.8253F, -0.1491F, -1.4407F, 0.5387F, -0.1088F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(61, 44).addBox(-0.9158F, -0.0367F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3F, 2.0542F, -2.8513F, 2.5694F, 0.2445F, -0.0688F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(22, 56).addBox(-0.9158F, 0.0082F, -0.6173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 2.0542F, -2.8513F, 1.6793F, 0.2445F, -0.0688F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(56, 44).addBox(-0.9158F, 0.283F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.3F, 2.0542F, -2.8513F, 1.0684F, 0.2445F, -0.0688F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(12, 54).addBox(-0.8382F, -1.8178F, -0.155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.45F, 2.8542F, -2.0513F, -0.0791F, 0.4186F, -0.0731F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(5, 59).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2281F, 1.8837F, -1.2403F, -1.7666F, 0.2048F, -0.027F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(50, 51).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0223F, 1.9606F, -0.7606F, -1.7625F, -0.0093F, 0.0151F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(0, 47).addBox(-1.7F, -1.5F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6645F, 1.9149F, -0.5842F, -1.7645F, 0.1449F, -0.015F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(20, 38).addBox(-0.8382F, -2.5984F, -1.6414F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.45F, 2.8542F, -2.0513F, -1.3881F, 0.4186F, -0.0731F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(41, 55).addBox(-0.9577F, -0.9629F, -0.9027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6092F, 2.8253F, -0.1491F, -1.6791F, 0.7547F, -0.0702F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(20, 62).addBox(-0.9738F, -0.9445F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.8842F, 2.5253F, -0.8491F, -0.4718F, 0.7972F, -0.1905F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(61, 59).addBox(-1.4378F, 1.5406F, 0.2147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3842F, 1.3253F, -2.5491F, 0.8717F, 0.851F, -0.152F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(45, 51).addBox(-1.3329F, -0.188F, 0.0635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3842F, 1.3253F, -2.5491F, 1.0179F, 0.8081F, -0.0901F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(51, 58).addBox(-1.0F, 0.0271F, -0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3842F, 1.3253F, -2.5491F, 1.2499F, 0.5222F, 0.0403F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(30, 65).addBox(-0.4518F, -0.7651F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1805F, 1.3324F, -0.4772F, 2.3717F, 1.0065F, 1.678F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(20, 65).addBox(-0.0237F, -0.9597F, -1.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.8157F, 1.1616F, 0.2832F, 1.7693F, 0.7986F, 1.265F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(65, 19).addBox(-0.1487F, -0.7097F, -0.8654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.2593F, 0.2634F, -0.0991F, 1.586F, 0.015F, 1.1434F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(10, 64).addBox(-0.2202F, -1.3748F, -0.7204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 3.0903F, 0.0724F, 0.1736F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(56, 56).addBox(-0.2202F, -1.6976F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(51, 55).addBox(-0.2202F, -1.3977F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, -2.8612F, 0.0724F, 0.1736F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(55, 50).addBox(-0.0245F, -1.3302F, -0.7323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 3.0903F, 0.0724F, 0.3132F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(65, 9).addBox(-0.0245F, -1.6594F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 65).addBox(-0.0245F, -1.3594F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, -2.8612F, 0.0724F, 0.3132F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(45, 64).addBox(-0.2604F, -1.0437F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 2.9333F, 0.0724F, 0.0645F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(45, 61).addBox(-0.2604F, -1.151F, -0.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, -3.0532F, 0.0724F, 0.0645F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(30, 62).addBox(-0.0714F, -0.956F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 2.9333F, 0.0724F, 0.3132F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(55, 38).addBox(-0.0714F, -1.0658F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, -3.0532F, 0.0724F, 0.3132F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(61, 47).addBox(-0.2981F, -0.5708F, -0.8205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 2.7828F, 0.138F, -0.0508F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(40, 64).addBox(-0.2981F, -0.7124F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 3.062F, 0.138F, -0.0508F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(25, 62).addBox(-0.1983F, -0.5766F, -0.8374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 2.7828F, 0.138F, 0.1587F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(61, 53).addBox(-0.1983F, -0.7227F, -0.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 1.8931F, -3.5704F, 3.062F, 0.138F, 0.1587F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(5, 62).addBox(-1.1647F, -1.2165F, -0.8018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.8931F, -3.0704F, 2.6131F, 0.0508F, -0.0333F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(62, 0).addBox(-1.1638F, -1.3107F, -0.601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4F, 0.8931F, -3.0704F, 2.8054F, 0.0179F, -0.0218F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(62, 3).addBox(-0.7193F, -1.4251F, -0.89F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4F, 0.8931F, -3.0704F, 2.6126F, 0.138F, 0.3158F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(61, 56).addBox(-0.7193F, -1.5323F, -0.6122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.8931F, -3.0704F, 2.8046F, 0.138F, 0.3158F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(65, 38).addBox(-0.725F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6827F, 0.6353F, -1.1774F, 2.63F, 1.2294F, 1.4039F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.525F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9551F, 1.0374F, 0.9144F, 1.9316F, 0.1254F, 0.8083F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(0, 51).addBox(-1.8658F, -0.8412F, -0.8568F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.607F, 0.0349F, 0.0132F, 1.5663F, -0.0431F, 0.0439F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(58, 26).addBox(-0.0408F, -0.8662F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5807F, 0.1051F, 0.0119F, 1.4079F, -0.412F, 0.7099F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(58, 18).addBox(0.1342F, -0.8412F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.3F, 0.0F, 0.0F, 1.5532F, -0.0395F, 0.3583F));

		PartDefinition rightFace = Head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3684F, -1.3656F, -1.496F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-0.68F, -0.3815F, -0.6578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-3.1565F, 1.0366F, 2.3369F, -0.759F, 0.0829F, 0.9146F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(0.275F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(63, 24).mirror().addBox(-0.525F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9323F, 0.1367F, 1.7298F, 0.4737F, -0.1279F, 1.4101F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(-0.525F, -0.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9823F, 0.1438F, 1.0671F, 0.8462F, -0.1367F, 1.5342F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-0.875F, -0.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.411F, 0.5002F, -2.5741F, 1.8499F, 1.4438F, 0.2769F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.675F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2342F, 0.4756F, -1.8683F, 1.6111F, 0.5232F, 0.0201F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.525F, -0.925F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9323F, 0.1367F, 1.7298F, 0.7263F, -0.1942F, 1.4676F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.041F, -1.692F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(60, 62).mirror().addBox(0.041F, -0.892F, -0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2608F, 0.2941F, 3.0062F, 0.4229F, 0.0772F, 1.0584F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-0.0842F, -0.8912F, -0.8818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8931F, -3.0704F, 2.5763F, -0.0866F, -0.1924F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.68F, -0.3765F, -0.285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(55, 62).mirror().addBox(-0.68F, -0.5265F, -0.285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1565F, 1.0366F, 2.3369F, -0.1132F, 0.0829F, 0.9146F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(15, 65).mirror().addBox(-0.789F, -0.0322F, -0.7971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(65, 12).mirror().addBox(-0.789F, 0.0428F, -0.2721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1565F, 1.0366F, 2.3369F, -0.35F, 0.0108F, 0.603F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.789F, 0.5301F, -0.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(57, 4).mirror().addBox(-0.789F, 0.3301F, 0.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-3.1565F, 1.0366F, 2.3369F, -0.83F, 0.0108F, 0.603F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(56, 47).mirror().addBox(0.0559F, -0.8073F, -1.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 53).mirror().addBox(0.0559F, -0.6073F, -0.9217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(17, 56).mirror().addBox(0.0559F, -0.8073F, -0.9217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.8657F, 2.6482F, 1.7016F, -1.4585F, 0.1114F, 0.3105F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.2399F, -1.9058F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6092F, 2.8253F, -0.1491F, -1.4407F, -0.5387F, 0.1088F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-0.0842F, -0.0367F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.0542F, -2.8513F, 2.5694F, -0.2445F, 0.0688F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(22, 56).mirror().addBox(-0.0842F, 0.0082F, -0.6173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.0542F, -2.8513F, 1.6793F, -0.2445F, 0.0688F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(56, 44).mirror().addBox(-0.0842F, 0.283F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.0542F, -2.8513F, 1.0684F, -0.2445F, 0.0688F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(-0.1618F, -1.8178F, -0.155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 2.8542F, -2.0513F, -0.0791F, -0.4186F, 0.0731F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2281F, 1.8837F, -1.2403F, -1.7666F, -0.2048F, 0.027F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0223F, 1.9606F, -0.7606F, -1.7625F, 0.0093F, -0.0151F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.3F, -1.5F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.6645F, 1.9149F, -0.5842F, -1.7645F, -0.1449F, 0.015F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(20, 38).mirror().addBox(-0.1618F, -2.5984F, -1.6414F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 2.8542F, -2.0513F, -1.3881F, -0.4186F, 0.0731F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(41, 55).mirror().addBox(-0.0423F, -0.9629F, -0.9027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6092F, 2.8253F, -0.1491F, -1.6791F, -0.7547F, 0.0702F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-0.0262F, -0.9445F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8842F, 2.5253F, -0.8491F, -0.4718F, -0.7972F, 0.1905F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(61, 59).mirror().addBox(0.4378F, 1.5406F, 0.2147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3842F, 1.3253F, -2.5491F, 0.8717F, -0.851F, 0.152F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(0.3329F, -0.188F, 0.0635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3842F, 1.3253F, -2.5491F, 1.0179F, -0.8081F, 0.0901F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(0.0F, 0.0271F, -0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3842F, 1.3253F, -2.5491F, 1.2499F, -0.5222F, -0.0403F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.5482F, -0.7651F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1805F, 1.3324F, -0.4772F, 2.3717F, -1.0065F, -1.678F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-0.9763F, -0.9597F, -1.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8157F, 1.1616F, 0.2832F, 1.7693F, -0.7986F, -1.265F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-0.8513F, -0.7097F, -0.8654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.2593F, 0.2634F, -0.0991F, 1.586F, -0.015F, -1.1434F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-0.7798F, -1.3748F, -0.7204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 3.0903F, -0.0724F, -0.1736F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-0.7798F, -1.6976F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(51, 55).mirror().addBox(-0.7798F, -1.3977F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, -2.8612F, -0.0724F, -0.1736F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-0.9755F, -1.3302F, -0.7323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 3.0903F, -0.0724F, -0.3132F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-0.9755F, -1.6594F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 65).mirror().addBox(-0.9755F, -1.3594F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, -2.8612F, -0.0724F, -0.3132F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.7396F, -1.0437F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 2.9333F, -0.0724F, -0.0645F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.7396F, -1.151F, -0.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, -3.0532F, -0.0724F, -0.0645F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.9286F, -0.956F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 2.9333F, -0.0724F, -0.3132F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-0.9286F, -1.0658F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, -3.0532F, -0.0724F, -0.3132F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-0.7019F, -0.5708F, -0.8205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 2.7828F, -0.138F, 0.0508F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-0.7019F, -0.7124F, -0.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 3.062F, -0.138F, 0.0508F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(25, 62).mirror().addBox(-0.8017F, -0.5766F, -0.8374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 2.7828F, -0.138F, -0.1587F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-0.8017F, -0.7227F, -0.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8931F, -3.5704F, 3.062F, -0.138F, -0.1587F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(0.1647F, -1.2165F, -0.8018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8931F, -3.0704F, 2.6131F, -0.0508F, 0.0333F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(0.1638F, -1.3107F, -0.601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8931F, -3.0704F, 2.8054F, -0.0179F, 0.0218F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(62, 3).mirror().addBox(-0.2807F, -1.4251F, -0.89F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8931F, -3.0704F, 2.6126F, -0.138F, -0.3158F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-0.2807F, -1.5323F, -0.6122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8931F, -3.0704F, 2.8046F, -0.138F, -0.3158F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.275F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6827F, 0.6353F, -1.1774F, 2.63F, -1.2294F, -1.4039F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(0.0F, -1.525F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9551F, 1.0374F, 0.9144F, 1.9316F, -0.1254F, -0.8083F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.1342F, -0.8412F, -0.8568F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.607F, 0.0349F, 0.0132F, 1.5663F, 0.0431F, -0.0439F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-0.9592F, -0.8662F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5807F, 0.1051F, 0.0119F, 1.4079F, 0.412F, -0.7099F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(-1.1342F, -0.8412F, -0.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0F, 0.0F, 1.5532F, 0.0395F, -0.3583F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5158F, -0.6976F, -0.1156F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 67).addBox(-0.0158F, -1.5976F, -0.1156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0158F, 0.4841F, 4.0187F, -0.1349F, -0.0865F, 0.0117F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(67, 0).addBox(1.3842F, -0.8651F, 0.0994F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5976F, 1.7844F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail1.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.9842F, -0.5F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5316F, 0.3024F, 0.9844F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-0.0158F, -0.5F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3024F, 0.9844F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3_r3 = Tail1.addOrReplaceChild("Tail3_r3", CubeListBuilder.create().texOffs(66, 43).addBox(1.3842F, -0.0859F, 0.0772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.3743F, 1.9009F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Tail2_r2 = Tail1.addOrReplaceChild("Tail2_r2", CubeListBuilder.create().texOffs(66, 29).addBox(1.3842F, -0.0295F, -0.033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.3743F, 0.0009F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail1.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(28, 21).addBox(-0.5158F, -0.3711F, -0.0246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 67).addBox(-0.0158F, -0.9711F, -0.0246F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(10, 67).addBox(-0.0158F, -0.8211F, 1.9754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3226F, 3.8847F, -0.0106F, -0.1318F, -0.0859F));

		PartDefinition Tail5_r1 = Tail4.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(50, 67).addBox(1.3842F, 3.5141F, 1.6773F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 67).addBox(1.3842F, 1.9141F, 0.9772F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.6969F, -1.9838F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5158F, -0.4453F, -0.057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(27, 56).addBox(-0.0158F, -0.8453F, 0.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1039F, 2.9754F, 0.1088F, -0.2051F, -0.1507F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(43, 4).addBox(-0.5158F, -0.5213F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0547F, 2.943F, 0.1272F, -0.2343F, -0.3267F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5158F, -0.5213F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.025F, 1.9F, 0.1363F, -0.1297F, -0.0177F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5158F, -0.5213F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.05F, 1.925F, 0.3167F, -0.2076F, -0.0675F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 4.8529F, 2.7181F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(55, 14).addBox(-0.9034F, -0.7801F, 0.5715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -1.2654F, 0.0F, 0.384F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 61).addBox(-0.9034F, -0.3089F, -0.098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(60, 50).addBox(-0.9034F, -0.3089F, 0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.6981F, 0.0F, 0.384F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(61, 32).addBox(-0.9034F, 1.5515F, -0.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.5934F, 0.0F, 0.384F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(53, 18).addBox(-0.9034F, 1.519F, -0.919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.288F, 0.0F, 0.384F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(61, 29).addBox(-0.9034F, 0.6392F, 1.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(61, 29).addBox(-0.9034F, 0.6392F, 0.7182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.6807F, 0.0F, 0.384F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(46, 19).addBox(-0.9034F, 1.4111F, 0.8749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.1571F, 0.0F, 0.384F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(46, 10).addBox(-0.9034F, -0.219F, 1.664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -0.6458F, 0.0F, 0.384F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(50, 61).addBox(-0.9034F, -0.7142F, -0.2877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -1.0908F, 0.0F, 0.384F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(34, 43).addBox(-0.831F, -0.2279F, -0.2156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.4F, -4.2697F, -0.7583F, -1.9286F, 0.0F, 0.4712F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(15, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.9178F, -0.3643F, 1.0385F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.9983F, 0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1583F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(60, 35).addBox(-0.5F, -1.0012F, -0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -5.8697F, -1.8582F, -1.4923F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(60, 21).addBox(-0.5F, 0.437F, -0.1184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.8697F, -1.3582F, -1.3352F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(44, 26).addBox(2.8842F, 0.0153F, 0.0448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.3842F, -5.9438F, -0.9244F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.8529F, 2.7181F));

		PartDefinition Hips_r16 = bone5.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-0.0966F, -0.7801F, 0.5715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -1.2654F, 0.0F, -0.384F));

		PartDefinition Hips_r17 = bone5.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.0966F, -0.3089F, -0.098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 50).mirror().addBox(-0.0966F, -0.3089F, 0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.6981F, 0.0F, -0.384F));

		PartDefinition Hips_r18 = bone5.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(61, 32).mirror().addBox(-0.0966F, 1.5515F, -0.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.5934F, 0.0F, -0.384F));

		PartDefinition Hips_r19 = bone5.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.0966F, 1.519F, -0.919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.288F, 0.0F, -0.384F));

		PartDefinition Hips_r20 = bone5.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(-0.0966F, 0.6392F, 1.0182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(61, 29).mirror().addBox(-0.0966F, 0.6392F, 0.7182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.6807F, 0.0F, -0.384F));

		PartDefinition Hips_r21 = bone5.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-0.0966F, 1.4111F, 0.8749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.1571F, 0.0F, -0.384F));

		PartDefinition Hips_r22 = bone5.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(46, 10).mirror().addBox(-0.0966F, -0.219F, 1.664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -0.6458F, 0.0F, -0.384F));

		PartDefinition Hips_r23 = bone5.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.0966F, -0.7142F, -0.2877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -1.0908F, 0.0F, -0.384F));

		PartDefinition Hips_r24 = bone5.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(34, 43).mirror().addBox(-0.169F, -0.2279F, -0.2156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.2697F, -0.7583F, -1.9286F, 0.0F, -0.4712F));

		PartDefinition Hips_r25 = bone5.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(15, 62).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.9178F, -0.3643F, 1.0385F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-0.5F, -0.9983F, 0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1583F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-0.5F, -1.0012F, -0.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.8697F, -1.8582F, -1.4923F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.5F, 0.437F, -0.1184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.8697F, -1.3582F, -1.3352F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-3.8842F, 0.0153F, 0.0448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(3.3842F, -5.9438F, -0.9244F, 0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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