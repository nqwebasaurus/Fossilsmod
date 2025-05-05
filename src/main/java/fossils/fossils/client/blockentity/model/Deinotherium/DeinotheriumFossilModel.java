package fossils.fossils.client.blockentity.model.Deinotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeinotheriumFossilModel extends SkullModelBase {
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
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm6;
	private final ModelPart rightarm7;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;
	private final ModelPart rightArm10;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public DeinotheriumFossilModel(ModelPart root) {
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
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm6 = this.chest.getChild("rightarm6");
		this.rightarm7 = this.rightarm6.getChild("rightarm7");
		this.rightArm8 = this.rightarm7.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
		this.rightArm10 = this.rightArm9.getChild("rightArm10");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.1942F, 11.8817F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(101, 109).addBox(0.0F, -1.8125F, 0.0115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(105, 89).addBox(0.0F, -2.6885F, -0.0985F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -0.7F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 91).addBox(0.0F, -3.0063F, -0.0995F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.4F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.9F, -0.45F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9702F, 12.9499F, 4.2604F, 0.702F, -1.1569F, -2.6342F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-1.5F, -0.5F, -4.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7444F, 10.0874F, 5.1754F, 0.3575F, -0.7347F, -2.3953F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-0.575F, -4.3F, -4.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2658F, 9.1765F, 1.9724F, -0.3566F, -0.4625F, -0.8751F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 101).mirror().addBox(-0.5F, -2.875F, -4.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.0626F, 1.3969F, -0.2679F, -0.5162F, -1.0634F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(117, 128).mirror().addBox(-0.6F, 0.1F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4144F, 10.1151F, 2.7164F, -2.3169F, -0.9701F, -3.034F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(130, 114).mirror().addBox(-3.1F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6311F, 10.6529F, 5.9738F, 0.3029F, -0.1755F, -2.0967F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(128, 129).mirror().addBox(-2.15F, -1.0F, -1.825F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-7.451F, 5.3887F, 1.9629F, -0.4237F, -0.9324F, 0.9953F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 40).mirror().addBox(0.1803F, 1.0134F, -0.9197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5018F, -1.0117F, -1.2324F, -2.6552F, -0.5979F, 1.6015F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-7.7073F, -1.3308F, 2.5514F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.7127F, -4.1499F, -1.4762F, -1.7257F, 0.0147F, -0.2774F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-11.1812F, 0.271F, 0.8179F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7127F, -4.1499F, -1.4762F, -1.3949F, 0.1046F, -1.1463F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 91).mirror().addBox(-9.7641F, 0.271F, 2.5746F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7127F, -4.1499F, -1.4762F, -1.3675F, 0.0211F, -0.717F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(77, 48).mirror().addBox(-4.6736F, -0.71F, -0.8754F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.1127F, -0.1499F, -1.4762F, -1.2416F, 0.1719F, -1.303F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-4.3044F, -1.3308F, 2.8708F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7127F, -4.1499F, -1.4762F, -1.6804F, 0.1107F, 0.4158F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-3.9819F, -0.4004F, -2.3234F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1127F, -0.1499F, -1.4762F, -2.1483F, 0.1354F, 2.0241F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(109, 51).mirror().addBox(-3.9819F, -0.8299F, -0.415F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1127F, -0.1499F, -1.4762F, -1.4938F, 0.1354F, 2.0241F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-0.3986F, -1.4444F, 0.1003F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7127F, -4.1499F, -1.4762F, -1.586F, 0.1549F, 1.3196F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(120, 44).mirror().addBox(-2.7372F, -0.5F, 0.5354F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5556F, 12.2208F, 5.1944F, 0.2918F, -0.4448F, -2.1039F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(136, 100).mirror().addBox(-0.1F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6311F, 10.6529F, 5.9738F, 0.2658F, -0.151F, -2.1908F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(48, 135).mirror().addBox(-2.883F, -0.4786F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4446F, 8.086F, 3.0349F, -0.2603F, -0.3114F, 0.7292F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(136, 65).mirror().addBox(-0.5F, -1.1718F, -3.0147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.236F, 2.1276F, -1.1698F, 0.1331F, -0.266F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(23, 40).addBox(-1.1803F, 1.0134F, -0.9197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5018F, -1.0117F, -1.2324F, -2.6552F, 0.5979F, -1.6015F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 23).addBox(2.7073F, -1.3308F, 2.5514F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.7127F, -4.1499F, -1.4762F, -1.7257F, -0.0147F, 0.2774F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 137).addBox(7.1812F, 0.271F, 0.8179F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7127F, -4.1499F, -1.4762F, -1.3949F, -0.1046F, 1.1463F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(13, 91).addBox(5.7641F, 0.271F, 2.5746F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7127F, -4.1499F, -1.4762F, -1.3675F, -0.0211F, 0.717F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(77, 48).addBox(-1.3264F, -0.71F, -0.8754F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.1127F, -0.1499F, -1.4762F, -1.2416F, -0.1719F, 1.303F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(94, 23).addBox(2.3044F, -1.3308F, 2.8708F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7127F, -4.1499F, -1.4762F, -1.6804F, -0.1107F, -0.4158F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(111, 0).addBox(-0.0181F, -0.4004F, -2.3234F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1127F, -0.1499F, -1.4762F, -2.1483F, -0.1354F, -2.0241F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(109, 51).addBox(-0.0181F, -0.8299F, -0.415F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1127F, -0.1499F, -1.4762F, -1.4938F, -0.1354F, -2.0241F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 9).addBox(-4.6014F, -1.4444F, 0.1003F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7127F, -4.1499F, -1.4762F, -1.586F, -0.1549F, -1.3196F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 145).addBox(-1.1F, -0.45F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9702F, 12.9499F, 4.2604F, 0.702F, 1.1569F, 2.6342F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(120, 44).addBox(-2.2628F, -0.5F, 0.5354F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5556F, 12.2208F, 5.1944F, 0.2918F, 0.4448F, 2.1039F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(130, 114).addBox(0.1F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6311F, 10.6529F, 5.9738F, 0.3029F, 0.1755F, 2.0967F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.5F, -4.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7444F, 10.0874F, 5.1754F, 0.3575F, 0.7347F, 2.3953F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(136, 100).addBox(-0.9F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6311F, 10.6529F, 5.9738F, 0.2658F, 0.151F, 2.1908F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(128, 129).addBox(-1.85F, -1.0F, -1.825F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(7.451F, 5.3887F, 1.9629F, -0.4237F, 0.9324F, -0.9953F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(48, 135).addBox(-1.117F, -0.4786F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4446F, 8.086F, 3.0349F, -0.2603F, 0.3114F, -0.7292F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(117, 128).addBox(-2.4F, 0.1F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4144F, 10.1151F, 2.7164F, -2.3169F, 0.9701F, 3.034F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(119, 117).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 13.7781F, 3.4481F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(136, 65).addBox(-0.5F, -1.1718F, -3.0147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.236F, 2.1276F, -1.1698F, -0.1331F, 0.266F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(94, 14).addBox(-0.425F, -4.3F, -4.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2658F, 9.1765F, 1.9724F, -0.3566F, 0.4625F, 0.8751F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(83, 101).addBox(-0.5F, -2.875F, -4.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.0626F, 1.3969F, -0.2679F, 0.5162F, 1.0634F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(26, 80).addBox(-0.5F, -0.875F, -3.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.3685F, 2.2757F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 49).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 10.7483F, 1.7167F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(138, 5).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 131).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 130).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(111, 152).addBox(0.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7885F, 3.5155F, 0.9257F, -0.2457F, 0.134F, 0.4896F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(137, 122).addBox(-1.7885F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7885F, 3.5155F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(83, 94).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 112).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -3.4F, -1.2F, 2.0F, 16.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.755F, -0.4575F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 116).addBox(-1.0F, -1.2333F, -3.7068F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 23.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(112, 143).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 22.4637F, 0.1393F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 123).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 21.2051F, -1.415F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(106, 122).addBox(-1.5F, -0.9F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 19.8773F, -0.7464F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 78).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 20.7243F, 1.8995F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 128).addBox(-1.0F, -2.0F, -0.075F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 18.5858F, 0.5053F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(97, 122).addBox(-1.0F, -1.7499F, 0.2895F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.8652F, -1.6822F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 22.7564F, -0.314F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(96, 48).addBox(-1.5F, -1.4F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7821F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(13, 96).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(147, 5).addBox(0.0F, 13.6F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 86).addBox(0.0F, -0.2F, 0.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.3972F, 2.01F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(101, 113).addBox(-1.0F, -3.0F, -1.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(45, 144).addBox(-2.4F, -1.835F, -1.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 15.1912F, -2.9572F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(29, 144).addBox(-2.4F, -1.935F, -1.0686F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 15.9285F, -2.2816F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(105, 14).addBox(-2.4F, 0.765F, -0.1686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(41, 85).addBox(-1.9F, -11.735F, 0.1314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 104).addBox(-2.4F, 2.39F, -1.9686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(131, 47).addBox(-1.9F, -0.035F, -1.8686F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 116).addBox(-1.9F, -1.035F, -1.6686F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(96, 76).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.122F, -2.2511F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(54, 144).addBox(-0.4F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.5847F, -0.2182F, 0.0F));

		PartDefinition cube_r72 = leftLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(149, 135).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(149, 132).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(111, 149).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.5036F, -1.6985F, 2.5963F, 0.3018F, -0.2129F, -0.0479F));

		PartDefinition cube_r73 = leftLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(138, 78).addBox(-0.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.6414F, 1.7936F, 0.0349F, -0.2182F, 0.0F));

		PartDefinition cube_r74 = leftLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(146, 119).addBox(-0.4F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(88, 69).addBox(-1.0F, -1.0696F, -2.9933F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8772F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(107, 55).addBox(-1.7556F, 0.1612F, -1.9345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1745F, 0.2618F, -0.5672F));

		PartDefinition cube_r76 = leftLeg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(107, 20).addBox(-0.5017F, 0.3224F, -1.934F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1309F, -0.1309F, 0.5672F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.0304F, -2.6933F, -0.6149F, -0.0183F, 0.0087F));

		PartDefinition cube_r77 = leftLeg5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(22, 135).addBox(-2.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.2782F, -1.685F, -0.4461F, 0.4802F, -0.2174F));

		PartDefinition cube_r78 = leftLeg5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(73, 41).addBox(-2.5023F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3957F, -0.1209F, 0.0503F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 10.7483F, 1.7167F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(103, 138).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(122, 133).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(133, 94).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(127, 152).addBox(-1.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7885F, 3.5155F, 0.9257F, -0.2457F, -0.134F, -0.4896F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(138, 88).addBox(-1.2115F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7885F, 3.5155F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(96, 94).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(24, 114).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(11, 51).addBox(-1.0F, -3.4F, -1.2F, 2.0F, 16.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.755F, -0.4575F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(118, 13).addBox(-1.0F, -1.2333F, -3.7068F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 23.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(68, 144).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 22.4637F, 0.1393F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(126, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 21.2051F, -1.415F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 124).addBox(-1.5F, -0.9F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 19.8773F, -0.7464F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 84).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 20.7243F, 1.8995F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(128, 107).addBox(-1.0F, -2.0F, -0.075F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 18.5858F, 0.5053F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 124).addBox(-1.0F, -1.7499F, 0.2895F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.8652F, -1.6822F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 22.7564F, -0.314F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(37, 97).addBox(-1.5F, -1.4F, -2.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7821F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 97).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(147, 22).addBox(-1.0F, 13.6F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 86).addBox(-1.0F, -0.2F, 0.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 0.3972F, 2.01F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(33, 114).addBox(-1.0F, -3.0F, -1.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(130, 144).addBox(-0.6F, -1.835F, -1.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 15.1912F, -2.9572F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(121, 144).addBox(-0.6F, -1.935F, -1.0686F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 15.9285F, -2.2816F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(107, 7).addBox(-0.6F, 0.765F, -0.1686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(69, 86).addBox(-0.1F, -11.735F, 0.1314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(105, 101).addBox(-0.6F, 2.39F, -1.9686F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(131, 133).addBox(-0.1F, -0.035F, -1.8686F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(118, 36).addBox(-0.1F, -1.035F, -1.6686F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(98, 0).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 16.122F, -2.2511F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(77, 144).addBox(-1.6F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.5847F, 0.2182F, 0.0F));

		PartDefinition cube_r104 = rightLeg3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(28, 150).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(15, 150).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(146, 149).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.5036F, -1.6985F, 2.5963F, 0.3018F, 0.2129F, 0.0479F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(112, 138).addBox(-1.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.6414F, 1.7936F, 0.0349F, 0.2182F, 0.0F));

		PartDefinition cube_r106 = rightLeg3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(147, 35).addBox(-1.6F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -1.0696F, -2.9933F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8772F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(26, 108).addBox(-0.2444F, 0.1612F, -1.9345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1745F, -0.2618F, 0.5672F));

		PartDefinition cube_r108 = rightLeg4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(105, 107).addBox(-1.4983F, 0.3224F, -1.934F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1309F, 0.1309F, -0.5672F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0304F, -2.6933F, -1.0488F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(39, 135).addBox(1.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.2782F, -1.685F, -0.4461F, -0.4802F, 0.2174F));

		PartDefinition cube_r110 = rightLeg5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 16).addBox(-2.4977F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3957F, 0.1209F, -0.0503F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(94, 131).addBox(0.0F, -3.8798F, -0.0429F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6064F, -0.859F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 116).addBox(0.0F, -3.9545F, -0.0038F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.331F, -2.7389F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 149).addBox(0.0F, -4.4398F, -0.0023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.531F, -4.7389F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(148, 142).addBox(0.0F, -4.5115F, -0.0418F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.031F, -6.6389F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(20, 116).addBox(0.0F, -4.6401F, 0.0197F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5315F, -8.7301F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(151, 144).mirror().addBox(-1.9022F, -0.0121F, -0.3428F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5F, -8.5F, -0.2076F, 0.0409F, -0.445F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(151, 142).mirror().addBox(-1.6869F, -0.0622F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -6.4F, -0.1946F, -0.078F, -0.3764F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(151, 54).mirror().addBox(-1.9001F, -0.0189F, -0.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6F, -4.3F, -0.1932F, -0.172F, -0.4025F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(121, 148).mirror().addBox(-2.0116F, 0.0186F, -0.2655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3F, -2.7F, -0.1761F, -0.3083F, -0.4224F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(146, 124).mirror().addBox(-2.8145F, 0.0281F, -0.717F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.3F, -0.1413F, -0.4337F, -0.4044F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(151, 144).addBox(-0.0978F, -0.0121F, -0.3428F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, -8.5F, -0.2076F, -0.0409F, 0.445F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(151, 142).addBox(-0.3131F, -0.0622F, -0.5009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -6.4F, -0.1946F, 0.078F, 0.3764F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(151, 54).addBox(-0.0999F, -0.0189F, -0.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6F, -4.3F, -0.1932F, 0.172F, 0.4025F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(121, 148).addBox(-0.9884F, 0.0186F, -0.2655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.7F, -0.1761F, 0.3083F, 0.4224F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(146, 124).addBox(-0.1855F, 0.0281F, -0.717F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.3F, -0.1413F, 0.4337F, 0.4044F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(27, 30).addBox(-1.0F, -0.1512F, 3.7474F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -10.6F, -0.2271F, 0.0425F, -0.0098F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(130, 148).mirror().addBox(0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2356F, 6.1625F, -1.0403F, -0.8693F, -0.3965F, -1.318F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(148, 128).mirror().addBox(0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8086F, 8.547F, -2.7682F, -0.8496F, -0.6138F, -1.3349F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(148, 126).mirror().addBox(0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1637F, 10.1542F, -4.9085F, -1.1461F, -0.7944F, -0.8703F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(140, 54).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1637F, 10.1542F, -4.9085F, -1.127F, -0.5994F, -1.2389F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(26, 102).mirror().addBox(-4.1F, 0.5F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9325F, 13.0336F, -6.7416F, -0.9188F, -0.7946F, -1.5909F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(136, 70).mirror().addBox(-4.0F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5696F, 15.4267F, -9.4064F, -0.8259F, -0.8334F, -1.7213F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(111, 4).mirror().addBox(-12.9756F, -3.7942F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -9.5644F, -0.4391F, 0.0782F, -1.4061F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(9, 135).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -9.5644F, -0.3792F, 0.2398F, -1.0334F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(148, 117).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -9.5644F, -0.3068F, 0.3283F, -0.7766F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(148, 115).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -11.5644F, -0.3388F, 0.297F, -0.8039F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(134, 63).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -11.5644F, -0.4013F, 0.2018F, -1.0557F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-14.9756F, -3.7942F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -11.5644F, -0.4455F, 0.035F, -1.4239F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-16.9755F, -3.7942F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -13.3644F, -0.4519F, -0.0082F, -1.424F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(127, 41).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -13.3644F, -0.4231F, 0.1638F, -1.0597F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(140, 136).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -13.3644F, -0.3701F, 0.2655F, -0.8126F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(127, 150).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, 0.5356F, -0.2066F, 0.3686F, -0.6102F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(148, 130).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -1.4644F, -0.2066F, 0.3686F, -1.0117F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(122, 26).mirror().addBox(-3.8978F, -0.7765F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -1.4644F, -0.2956F, 0.3031F, -1.2803F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -3.5644F, -0.4181F, 0.1682F, -1.6041F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(45, 148).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -3.5644F, -0.3245F, 0.3157F, -1.219F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(28, 148).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -3.5644F, -0.2315F, 0.388F, -0.9508F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(112, 147).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -5.5644F, -0.2124F, 0.392F, -0.8915F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(147, 80).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -5.5644F, -0.3077F, 0.3242F, -1.1617F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(147, 27).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -5.5644F, -0.4064F, 0.1821F, -1.55F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(147, 52).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -7.4644F, -0.3519F, 0.2875F, -1.0385F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(147, 50).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -7.4644F, -0.2666F, 0.3676F, -0.7751F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(127, 72).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -7.4644F, -0.432F, 0.1322F, -1.4175F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(127, 150).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, 0.5356F, -0.2066F, -0.3686F, 0.6102F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(148, 130).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -1.4644F, -0.2066F, -0.3686F, 1.0117F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(122, 26).addBox(2.8978F, -0.7765F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -1.4644F, -0.2956F, -0.3031F, 1.2803F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(17, 71).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -3.5644F, -0.4181F, -0.1682F, 1.6041F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 148).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -3.5644F, -0.3245F, -0.3157F, 1.219F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(28, 148).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -3.5644F, -0.2315F, -0.388F, 0.9508F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(112, 147).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -5.5644F, -0.2124F, -0.392F, 0.8915F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(147, 80).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -5.5644F, -0.3077F, -0.3242F, 1.1617F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(147, 27).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -5.5644F, -0.4064F, -0.1821F, 1.55F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(147, 52).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -7.4644F, -0.3519F, -0.2875F, 1.0385F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(147, 50).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -7.4644F, -0.2666F, -0.3676F, 0.7751F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(127, 72).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -7.4644F, -0.432F, -0.1322F, 1.4175F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -14.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(6, 149).addBox(0.0F, -5.4539F, -0.113F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -0.5238F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(3, 149).addBox(0.0F, -4.6496F, -0.11F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7899F, -1.9238F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 150).addBox(0.0F, -3.7048F, -0.0266F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -4.2238F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(123, 65).addBox(-0.005F, -5.4966F, 0.5016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -4.2238F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(105, 44).addBox(-0.005F, -6.4966F, 0.7016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8101F, -6.6238F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(32, 153).addBox(0.0F, -4.7048F, -0.0266F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8101F, -6.6238F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(121, 150).addBox(0.0F, -3.682F, -0.146F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7101F, -14.0238F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(153, 104).addBox(-0.005F, -6.5174F, 0.3673F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7101F, -14.0238F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(89, 150).addBox(0.0F, -3.682F, -0.146F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -11.9238F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(148, 117).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -9.5644F, -0.3068F, -0.3283F, 0.7766F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(9, 135).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -9.5644F, -0.3792F, -0.2398F, 1.0334F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(111, 4).addBox(6.9756F, -3.7942F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -9.5644F, -0.4391F, -0.0782F, 1.4061F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(130, 148).addBox(-3.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2356F, 6.1625F, -1.0403F, -0.8693F, 0.3965F, 1.318F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(148, 128).addBox(-3.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8086F, 8.547F, -2.7682F, -0.8496F, 0.6138F, 1.3349F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(148, 126).addBox(-3.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1637F, 10.1542F, -4.9085F, -1.1461F, 0.7944F, 0.8703F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(140, 54).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1637F, 10.1542F, -4.9085F, -1.127F, 0.5994F, 1.2389F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(26, 102).addBox(0.1F, 0.5F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9325F, 13.0336F, -6.7416F, -0.9188F, 0.7946F, 1.5909F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(136, 70).addBox(0.0F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5696F, 15.4267F, -9.4064F, -0.8259F, 0.8334F, 1.7213F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 41).addBox(6.9756F, -3.7942F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -11.5644F, -0.4455F, -0.035F, 1.4239F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(134, 63).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -11.5644F, -0.4013F, -0.2018F, 1.0557F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(148, 115).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -11.5644F, -0.3388F, -0.297F, 0.8039F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(140, 136).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -13.3644F, -0.3701F, -0.2655F, 0.8126F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(127, 41).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -13.3644F, -0.4231F, -0.1638F, 1.0597F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 44).addBox(6.9756F, -3.7942F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -13.3644F, -0.4519F, 0.0082F, 1.424F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(58, 155).addBox(-0.005F, -5.5174F, 0.3673F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -11.9238F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(55, 155).addBox(-0.005F, -5.5174F, 0.3673F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -9.9238F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 150).addBox(0.0F, -3.682F, -0.146F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -9.9238F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(47, 114).addBox(-0.005F, -5.5174F, 0.3673F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0101F, -8.0238F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(118, 149).addBox(0.0F, -3.6821F, -0.146F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0101F, -8.0238F, -0.4712F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9954F, -13.9509F, -0.0961F, 0.0434F, -0.0042F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-0.1819F, -1.3057F, 5.1112F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(145, 99).mirror().addBox(-0.1819F, -3.0057F, 5.1112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 1.0967F, -0.4379F, 0.3946F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(145, 65).mirror().addBox(0.6078F, 5.2106F, -0.815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, -0.1781F, -0.7465F, 0.4368F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(83, 86).mirror().addBox(0.6078F, 4.7622F, 1.4305F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, -0.3963F, -0.7465F, 0.4368F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(0.6078F, 0.7595F, -1.5997F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, -0.0472F, -0.7465F, 0.4368F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(0.1081F, -2.9805F, -0.4861F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, -0.0584F, -0.5543F, 0.5047F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-11.1232F, 1.076F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 22.3735F, -3.0809F, 0.867F, 0.5993F, 0.8693F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(152, 14).mirror().addBox(-1.5551F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 22.3735F, -3.0809F, 0.0865F, 1.0047F, -0.1527F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-9.1232F, 1.076F, -0.5309F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 22.3735F, -3.0809F, 0.6133F, 0.4958F, 0.7248F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(152, 12).mirror().addBox(-1.5551F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 22.3735F, -3.0809F, 0.0299F, 0.7676F, -0.2085F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(96, 36).mirror().addBox(-6.5551F, -0.0333F, -0.5309F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 22.3735F, -6.3809F, 0.0377F, 0.4456F, 0.1411F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-7.5551F, -0.0333F, -0.5309F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 22.3735F, -4.3809F, 0.0904F, 0.5186F, 0.2353F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-6.1551F, -0.0333F, -0.5309F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 22.3735F, -8.8809F, 0.059F, 0.4257F, 0.1978F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-17.9755F, -3.7942F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -1.2644F, -0.4391F, 0.0782F, -1.4235F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(134, 61).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -1.2644F, -0.3792F, 0.2398F, -1.0509F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(148, 113).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -1.2644F, -0.3068F, 0.3283F, -0.794F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 49).mirror().addBox(-19.9755F, -3.7942F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -2.9644F, -0.4455F, 0.035F, -1.4239F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(134, 59).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -2.9644F, -0.4013F, 0.2018F, -1.0557F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(148, 111).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -2.9644F, -0.3388F, 0.297F, -0.8039F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-19.9755F, -3.7942F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2794F, -4.9644F, -0.4519F, -0.0082F, -1.424F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(133, 45).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2794F, -4.9644F, -0.4231F, 0.1638F, -1.0597F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(148, 109).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2794F, -4.9644F, -0.3701F, 0.2655F, -0.8126F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-16.9755F, -3.7942F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6794F, -8.7644F, -0.4777F, -0.1808F, -1.4215F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(133, 43).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6794F, -8.7644F, -0.5082F, 0.0112F, -1.0671F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(84, 148).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6794F, -8.7644F, -0.491F, 0.1372F, -0.8368F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(129, 23).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9794F, -6.7644F, -0.4532F, 0.1105F, -1.0638F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(68, 148).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9794F, -6.7644F, -0.4132F, 0.2209F, -0.823F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(-18.9755F, -3.7942F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9794F, -6.7644F, -0.4608F, -0.0686F, -1.4236F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(36, 75).mirror().addBox(0.4579F, 0.7878F, -9.2446F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 0.9482F, -0.1979F, 0.2842F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.2496F, -4.508F, 0.5203F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 0.4704F, -0.5425F, 0.3855F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(27, 18).mirror().addBox(-0.9494F, -1.2566F, -8.6572F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 1.2243F, 0.599F, -0.0387F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(0.4479F, -3.7446F, -0.9927F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 1.6202F, -0.1979F, 0.2842F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(145, 10).mirror().addBox(0.4479F, -5.895F, 3.1283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 0.6515F, -0.1979F, 0.2842F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(79, 109).mirror().addBox(0.4479F, -6.2692F, -1.0553F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 0.5206F, -0.1979F, 0.2842F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(43, 51).mirror().addBox(0.4579F, -3.7973F, -7.1155F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 1.4456F, -0.1979F, 0.2842F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(120, 75).mirror().addBox(0.4579F, -1.9636F, -9.3518F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.1773F, 3.7267F, -5.5307F, 1.1402F, -0.1979F, 0.2842F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(107, 26).mirror().addBox(-5.3232F, -0.124F, -0.5309F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 20.3735F, -11.3809F, -0.5897F, 0.2625F, 0.0252F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(84, 148).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6794F, -8.7644F, -0.491F, -0.1372F, 0.8368F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(133, 43).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6794F, -8.7644F, -0.5082F, -0.0112F, 1.0671F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(60, 6).addBox(6.9756F, -3.7942F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6794F, -8.7644F, -0.4777F, 0.1808F, 1.4215F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(148, 113).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -1.2644F, -0.3068F, -0.3283F, 0.794F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(134, 61).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -1.2644F, -0.3792F, -0.2398F, 1.0509F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(52, 39).addBox(6.9756F, -3.7942F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -1.2644F, -0.4391F, -0.0782F, 1.4235F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(148, 111).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -2.9644F, -0.3388F, -0.297F, 0.8039F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(134, 59).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -2.9644F, -0.4013F, -0.2018F, 1.0557F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(29, 49).addBox(6.9756F, -3.7942F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -2.9644F, -0.4455F, -0.035F, 1.4239F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(148, 109).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2794F, -4.9644F, -0.3701F, -0.2655F, 0.8126F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(133, 45).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2794F, -4.9644F, -0.4231F, -0.1638F, 1.0597F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 49).addBox(6.9756F, -3.7942F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2794F, -4.9644F, -0.4519F, 0.0082F, 1.424F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(129, 23).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9794F, -6.7644F, -0.4532F, -0.1105F, 1.0638F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(68, 148).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9794F, -6.7644F, -0.4132F, -0.2209F, 0.823F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(52, 37).addBox(6.9756F, -3.7942F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9794F, -6.7644F, -0.4608F, 0.0686F, 1.4236F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(36, 75).addBox(-1.4579F, 0.7878F, -9.2446F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 0.9482F, 0.1979F, -0.2842F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(145, 65).addBox(-1.6078F, 5.2106F, -0.815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, -0.1781F, 0.7465F, -0.4368F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(83, 86).addBox(-1.6078F, 4.7622F, 1.4305F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, -0.3963F, 0.7465F, -0.4368F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(22, 60).addBox(-1.6078F, 0.7595F, -1.5997F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, -0.0472F, 0.7465F, -0.4368F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(13, 80).addBox(-1.1081F, -2.9805F, -0.4861F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, -0.0584F, 0.5543F, -0.5047F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 80).addBox(-1.2496F, -4.508F, 0.5203F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 0.4704F, 0.5425F, -0.3855F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(27, 18).addBox(-2.0506F, -1.2566F, -8.6572F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 1.2243F, -0.599F, 0.0387F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(37, 64).addBox(-1.4479F, -3.7446F, -0.9927F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 1.6202F, 0.1979F, -0.2842F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(107, 61).addBox(-0.8181F, -1.3057F, 5.1112F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(145, 99).addBox(-0.8181F, -3.0057F, 5.1112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 1.0967F, 0.4379F, -0.3946F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(145, 10).addBox(-1.4479F, -5.895F, 3.1283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 0.6515F, 0.1979F, -0.2842F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(79, 109).addBox(-1.4479F, -6.2692F, -1.0553F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 0.5206F, 0.1979F, -0.2842F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 51).addBox(-1.4579F, -3.7973F, -7.1155F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 1.4456F, 0.1979F, -0.2842F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(120, 75).addBox(-1.4579F, -1.9636F, -9.3518F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.1773F, 3.7267F, -5.5307F, 1.1402F, 0.1979F, -0.2842F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(98, 149).addBox(0.0F, -4.8331F, -0.2365F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7101F, -9.3238F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(61, 155).addBox(-0.005F, -7.6763F, -0.816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2101F, -7.4238F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(12, 148).addBox(0.0F, -5.8331F, -0.2365F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2101F, -7.4238F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(154, 20).addBox(-0.005F, -8.6763F, -0.816F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5101F, -5.5238F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(9, 148).addBox(0.0F, -5.8331F, -0.2365F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5101F, -5.5238F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(154, 4).addBox(-0.005F, -7.9496F, -0.7709F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8101F, -3.5238F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(23, 32).addBox(0.0F, -5.1057F, -0.2676F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8101F, -3.5238F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(153, 119).addBox(-0.005F, -3.0994F, -0.3098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5899F, -0.6238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(149, 92).addBox(0.0F, -4.0603F, -0.2762F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1101F, -1.7238F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(152, 14).addBox(-0.4449F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 22.3735F, -3.0809F, 0.0865F, -1.0047F, 0.1527F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 46).addBox(1.1232F, 1.076F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 22.3735F, -3.0809F, 0.867F, -0.5993F, -0.8693F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(152, 12).addBox(-0.4449F, -0.0333F, -0.5309F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 22.3735F, -3.0809F, 0.0299F, -0.7676F, 0.2085F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(77, 39).addBox(1.1232F, 1.076F, -0.5309F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 22.3735F, -3.0809F, 0.6133F, -0.4958F, -0.7248F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(56, 28).addBox(-0.4449F, -0.0333F, -0.5309F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 22.3735F, -4.3809F, 0.0904F, -0.5186F, -0.2353F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(96, 36).addBox(-0.4449F, -0.0333F, -0.5309F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 22.3735F, -6.3809F, 0.0377F, -0.4456F, -0.1411F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 37).addBox(-0.8449F, -0.0333F, -0.5309F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 22.3735F, -8.8809F, 0.059F, -0.4257F, -0.1978F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(107, 26).addBox(-0.6768F, -0.124F, -0.5309F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 20.3735F, -11.3809F, -0.5897F, -0.2625F, -0.0252F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(75, 29).addBox(-1.0F, -0.9411F, 0.0764F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 23.0821F, -8.6872F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(22, 51).addBox(-1.5F, -0.2802F, -0.1543F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.9821F, -13.1872F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -1.908F, 2.84F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.9F, -12.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8316F, 14.2717F, -9.8067F, -0.1583F, 0.0193F, -0.1295F));

		PartDefinition cube_r280 = leftarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(120, 55).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 16.0714F, 3.6761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(68, 108).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 14.7978F, 5.2471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftarm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(59, 99).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5891F, -0.2255F, 2.9999F, -0.1048F, 0.0014F, -0.001F));

		PartDefinition cube_r283 = leftarm.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(129, 17).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.5857F, -1.4012F, 0.4819F, -0.323F, 0.0014F, -0.001F));

		PartDefinition cube_r284 = leftarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(141, 119).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5848F, -0.955F, -0.413F, -1.1084F, 0.0014F, -0.001F));

		PartDefinition cube_r285 = leftarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(137, 0).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5849F, -0.1117F, -0.9504F, -0.5673F, 0.0014F, -0.001F));

		PartDefinition cube_r286 = leftarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(66, 139).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5894F, 0.3931F, 2.8069F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r287 = leftarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(88, 124).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.7477F, 1.8555F, -0.1746F, 0.0014F, -0.001F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(129, 88).addBox(0.5F, -2.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5884F, 4.4329F, -0.6606F, -1.152F, 0.0014F, -0.001F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(129, 11).addBox(0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5902F, 4.1054F, 0.8303F, -0.8029F, 0.0014F, -0.001F));

		PartDefinition cube_r290 = leftarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(120, 6).addBox(-0.5F, -1.2F, -1.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5879F, 1.1327F, 0.3516F, -0.6931F, -0.0627F, -0.0248F));

		PartDefinition cube_r291 = leftarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(50, 109).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.5894F, 4.4945F, 0.0024F, -0.3492F, 0.0014F, -0.001F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(69, 98).addBox(-1.0F, -5.5475F, -2.7419F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.6F, 7.8209F, 5.2038F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(14, 128).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 9.2766F, 5.8038F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(114, 61).addBox(-1.0F, 0.1F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 9.2766F, 5.8038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(28, 91).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 5.401F, 3.493F, 0.3142F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.991F, 16.6204F, 4.7878F, -0.5115F, 0.0801F, 0.1058F));

		PartDefinition cube_r296 = leftarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(147, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1501F, 0.8493F, -1.18F, 1.5001F, -1.2163F, -1.4785F));

		PartDefinition cube_r297 = leftarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(11, 116).addBox(-0.25F, -3.5F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0672F, 11.2776F, 0.3219F, -1.3992F, -1.5352F, 1.4172F));

		PartDefinition cube_r298 = leftarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(140, 72).addBox(-0.8F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4457F, 12.591F, 0.4499F, 1.6755F, -1.4399F, -1.6581F));

		PartDefinition cube_r299 = leftarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(42, 114).addBox(-0.448F, -0.8088F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1118F, 2.0963F, -0.961F, 1.85F, -1.4399F, -1.6581F));

		PartDefinition cube_r300 = leftarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(139, 127).addBox(-0.6F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0122F, 13.3602F, 0.6926F, -1.5708F, -1.3526F, 1.5708F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(121, 139).addBox(0.0608F, 4.8093F, -1.2886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, 7.5057F, 0.0963F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(129, 74).addBox(-0.1F, 1.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(50, 99).addBox(-0.5256F, -0.0299F, -1.3596F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(47, 118).addBox(-2.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2236F, 0.3885F, 1.2089F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition cube_r305 = leftarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(127, 36).addBox(-1.375F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, -1.4836F, 2.8962F, 1.5708F, -0.829F, -1.5708F));

		PartDefinition cube_r306 = leftarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(11, 137).addBox(-0.2F, -2.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.5988F, 3.5671F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r307 = leftarm2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(128, 123).addBox(-0.8F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, -1.0818F, 3.7305F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition cube_r308 = leftarm2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(39, 129).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2236F, 2.3653F, 0.7011F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition cube_r309 = leftarm2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(127, 65).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 8.4042F, 1.2858F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r310 = leftarm2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(120, 88).addBox(-0.1F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 6.3598F, 0.4917F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition cube_r311 = leftarm2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(118, 101).addBox(-1.1F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0122F, 10.6807F, 2.4143F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3911F, 13.8724F, 1.2386F, 1.0798F, -0.0972F, 0.0079F));

		PartDefinition cube_r312 = leftArm3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(101, 65).addBox(-2.5002F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.2177F, -0.0096F, -0.0084F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(13, 109).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 2.8459F, -0.09F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftArm4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(138, 10).addBox(-1.5997F, -1.0456F, 0.5234F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9423F, 0.5743F, -1.0437F, 0.0735F, 0.8158F, 0.1714F));

		PartDefinition cube_r314 = leftArm4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(23, 145).addBox(-0.7053F, -4.4031F, -0.3039F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2368F, 4.2008F, 0.0357F, -0.0322F, -0.8321F, -0.01F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1868F, 4.5391F, 0.5618F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftArm5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(96, 55).addBox(-2.3137F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5F, -3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftArm5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(31, 123).addBox(-1.6565F, 2.6682F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.129F, -3.9649F, -1.6056F, 0.9497F, 0.8301F, 0.1502F));

		PartDefinition cube_r317 = leftArm5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(105, 29).addBox(-1.665F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0501F, -0.3383F, -0.5261F, 1.0314F, -0.7945F, -0.0728F));

		PartDefinition cube_r318 = leftArm5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(52, 69).addBox(-2.3124F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm6 = chest.addOrReplaceChild("rightarm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8316F, 14.2717F, -9.8067F, 0.278F, -0.0193F, 0.1295F));

		PartDefinition cube_r319 = rightarm6.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(123, 60).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 16.0714F, 3.6761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightarm6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(109, 44).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 14.7978F, 5.2471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightarm6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(113, 35).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5891F, -0.2255F, 2.9999F, -0.1048F, -0.0014F, 0.001F));

		PartDefinition cube_r322 = rightarm6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(104, 132).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.5857F, -1.4012F, 0.4819F, -0.323F, -0.0014F, 0.001F));

		PartDefinition cube_r323 = rightarm6.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(142, 22).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5848F, -0.955F, -0.413F, -1.1084F, -0.0014F, 0.001F));

		PartDefinition cube_r324 = rightarm6.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(138, 17).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5849F, -0.1117F, -0.9504F, -0.5673F, -0.0014F, 0.001F));

		PartDefinition cube_r325 = rightarm6.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(130, 139).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5894F, 0.3931F, 2.8069F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r326 = rightarm6.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(76, 127).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.7477F, 1.8555F, -0.1746F, -0.0014F, 0.001F));

		PartDefinition cube_r327 = rightarm6.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 131).addBox(-1.5F, -2.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5884F, 4.4329F, -0.6606F, -1.152F, -0.0014F, 0.001F));

		PartDefinition cube_r328 = rightarm6.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(131, 53).addBox(-1.5F, -0.7F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5902F, 4.1054F, 0.8303F, -0.8029F, -0.0014F, 0.001F));

		PartDefinition cube_r329 = rightarm6.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(120, 19).addBox(-0.5F, -1.2F, -1.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5879F, 1.1327F, 0.3516F, -0.6931F, 0.0627F, 0.0248F));

		PartDefinition cube_r330 = rightarm6.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(110, 113).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.5894F, 4.4945F, 0.0024F, -0.3492F, -0.0014F, 0.001F));

		PartDefinition cube_r331 = rightarm6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(59, 102).addBox(-1.0F, -5.5475F, -2.7419F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-1.6F, 7.8209F, 5.2038F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r332 = rightarm6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(23, 128).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 9.2766F, 5.8038F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightarm6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(68, 115).addBox(-1.0F, 0.1F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 9.2766F, 5.8038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightarm6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(96, 83).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 5.401F, 3.493F, 0.3142F, 0.0F, 0.0F));

		PartDefinition rightarm7 = rightarm6.addOrReplaceChild("rightarm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.991F, 16.6204F, 4.7878F, -0.0316F, -0.0801F, -0.1058F));

		PartDefinition cube_r335 = rightarm7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(147, 70).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1501F, 0.8493F, -1.18F, 1.5001F, 1.2163F, 1.4785F));

		PartDefinition cube_r336 = rightarm7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 28).addBox(-1.75F, -3.5F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0672F, 11.2776F, 0.3219F, -1.3992F, 1.5352F, -1.4172F));

		PartDefinition cube_r337 = rightarm7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(61, 144).addBox(-0.2F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4457F, 12.591F, 0.4499F, 1.6755F, 1.4399F, 1.6581F));

		PartDefinition cube_r338 = rightarm7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 117).addBox(-0.552F, -0.8088F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1118F, 2.0963F, -0.961F, 1.85F, 1.4399F, 1.6581F));

		PartDefinition cube_r339 = rightarm7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 140).addBox(-1.4F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0122F, 13.3602F, 0.6926F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition cube_r340 = rightarm7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(139, 139).addBox(-2.0608F, 4.8093F, -1.2886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, 7.5057F, 0.0963F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r341 = rightarm7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(130, 118).addBox(-2.9F, 1.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r342 = rightarm7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(41, 104).addBox(-1.4744F, -0.0299F, -1.3596F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r343 = rightarm7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(118, 82).addBox(-1.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2236F, 0.3885F, 1.2089F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition cube_r344 = rightarm7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(106, 127).addBox(-1.625F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.4836F, 2.8962F, 1.5708F, 0.829F, 1.5708F));

		PartDefinition cube_r345 = rightarm7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(138, 25).addBox(-1.8F, -2.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -0.5988F, 3.5671F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r346 = rightarm7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(129, 5).addBox(-1.2F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.0818F, 3.7305F, -1.5708F, 0.9163F, -1.5708F));

		PartDefinition cube_r347 = rightarm7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(113, 132).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2236F, 2.3653F, 0.7011F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition cube_r348 = rightarm7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(127, 100).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 8.4042F, 1.2858F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r349 = rightarm7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(67, 123).addBox(-1.9F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 6.3598F, 0.4917F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition cube_r350 = rightarm7.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(119, 109).addBox(-0.9F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0122F, 10.6807F, 2.4143F, 1.5708F, 1.2217F, 1.5708F));

		PartDefinition rightArm8 = rightarm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3911F, 13.8724F, 1.2386F, 0.1199F, 0.0972F, -0.0079F));

		PartDefinition cube_r351 = rightArm8.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(105, 38).addBox(-1.4998F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.2177F, 0.0096F, 0.0084F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create().texOffs(109, 75).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 2.8459F, -0.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightArm9.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(138, 30).addBox(-0.4003F, -1.0456F, 0.5234F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9423F, 0.5743F, -1.0437F, 0.0735F, -0.8158F, -0.1714F));

		PartDefinition cube_r353 = rightArm9.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(147, 15).addBox(-0.2947F, -4.4031F, -0.3039F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2368F, 4.2008F, 0.0357F, -0.0322F, 0.8321F, 0.01F));

		PartDefinition rightArm10 = rightArm9.addOrReplaceChild("rightArm10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1868F, 4.5391F, 0.5618F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightArm10.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(59, 136).addBox(-1.6863F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5F, -3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightArm10.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(117, 123).addBox(-0.3435F, 2.6682F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.129F, -3.9649F, -1.6056F, 0.9497F, -0.8301F, -0.1502F));

		PartDefinition cube_r356 = rightArm10.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(105, 83).addBox(-0.335F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0501F, -0.3383F, -0.5261F, 1.0314F, 0.7945F, 0.0728F));

		PartDefinition cube_r357 = rightArm10.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(17, 73).addBox(-1.6876F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, -9.5F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1406F, -1.4017F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r359 = neck2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(88, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1406F, -1.4017F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r360 = neck2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(124, 150).addBox(0.0F, -3.741F, 0.3309F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7899F, -1.9238F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r361 = neck2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(116, 69).addBox(-1.0F, -0.2F, 1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0797F, -2.5185F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(154, 38).addBox(0.0F, -2.6676F, 0.0678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2899F, -2.8238F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(154, 33).addBox(0.0F, -3.125F, -0.1131F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5899F, -0.6238F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(151, 146).mirror().addBox(-1.5957F, 0.0446F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2594F, -2.5017F, -0.25F, 0.0452F, -0.6804F));

		PartDefinition cube_r365 = neck.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(79, 150).mirror().addBox(-1.0931F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3406F, 1.4983F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r366 = neck.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(151, 146).addBox(-0.4043F, 0.0446F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2594F, -2.5017F, -0.25F, -0.0452F, 0.6804F));

		PartDefinition cube_r367 = neck.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(79, 150).addBox(-0.9069F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3406F, 1.4983F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r368 = neck.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(92, 29).addBox(-1.0F, -1.1F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -3.5F, -0.3503F, -0.082F, 0.0299F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(154, 59).addBox(0.0F, -1.9924F, -0.1334F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -7.4F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(31, 137).addBox(0.0F, -4.1F, 3.8F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -9.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(129, 84).addBox(-2.5F, -3.9F, -0.5F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3193F, -2.2078F, 1.501F, 0.0F, -3.1416F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(154, 43).addBox(0.0F, -2.5131F, -0.0836F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0899F, -1.6238F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(152, 10).mirror().addBox(-1.1957F, 0.2446F, -2.8954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4406F, 0.9983F, -0.25F, 0.0452F, -0.6804F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(152, 10).addBox(-0.8043F, 0.2446F, -2.8954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4406F, 0.9983F, -0.25F, -0.0452F, 0.6804F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.1F, -4.2F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.398F, -8.4425F, -0.382F, 0.0721F, 0.1589F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(109, 96).addBox(-2.0F, -1.0F, -1.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2313F, -0.1678F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(77, 53).addBox(-4.0F, -1.1F, -1.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2872F, -0.0849F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(77, 58).addBox(-2.5F, 0.5014F, -4.0757F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 15.0472F, -6.2599F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(137, 110).addBox(-2.5F, 1.2014F, 0.0243F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 85).addBox(-2.5F, 0.2014F, -2.9757F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 16.4352F, -6.4427F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(75, 140).addBox(-1.5F, -0.1986F, -1.9757F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 17.6527F, -8.0294F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(96, 38).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 16.9564F, -8.2327F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(56, 17).addBox(-2.0F, 0.4F, -2.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0826F, -3.5865F, 0.9675F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, 2.9764F, -0.0007F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.2182F, -7.9399F, 1.4836F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(51, 76).addBox(-2.5F, -6.0236F, 0.9993F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 9.8169F, -1.228F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(71, 69).addBox(-2.0F, 1.9764F, -3.0007F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 6.2182F, -7.9399F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(52, 30).addBox(-3.5F, 0.5764F, -2.0007F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.6091F, -8.1491F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(23, 43).addBox(-4.0F, -0.4F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.3051F, -7.042F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(48, 43).addBox(-4.0F, 0.0357F, -0.5881F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.9742F, -4.1625F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(77, 65).addBox(-3.0F, 0.0804F, -0.1608F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.5741F, -5.7625F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(26, 104).addBox(-2.5F, -0.1076F, -0.3546F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 71).addBox(-2.5F, -0.1076F, 0.6454F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0182F, -6.6399F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(60, 0).addBox(-3.0F, -0.0236F, -0.0007F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.0182F, -6.6399F, 1.622F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(94, 58).addBox(-2.0F, -5.5F, -1.7F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.8709F, 1.0122F, 0.1298F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(80, 156).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.298F, -5.1289F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(35, 0).addBox(-2.5F, -2.0F, -2.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 9.5063F, -1.644F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(35, 9).mirror().addBox(-2.9662F, -1.1569F, -2.3083F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, 9.5719F, -1.4917F, 0.6969F, -0.1344F, -0.1117F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(57, 139).mirror().addBox(-1.7044F, -1.9986F, -0.9336F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.4083F, -3.8179F, 0.5654F, -0.1478F, -0.0932F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(57, 139).addBox(-0.2956F, -1.9986F, -0.9336F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 12.4083F, -3.8179F, 0.5654F, 0.1478F, 0.0932F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(35, 9).addBox(-3.0338F, -1.1569F, -2.3083F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.6F, 9.5719F, -1.4917F, 0.6969F, 0.1344F, 0.1117F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(4.92F, 3.8796F, -7.7036F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(70, 136).addBox(-0.2896F, -0.1621F, -0.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6918F, 9.4413F, -0.9299F, -0.1275F, -0.1126F, 1.1326F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(5, 117).addBox(-0.8338F, -0.2009F, 0.0161F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6918F, 9.4413F, -0.9299F, 0.0138F, -0.4424F, 0.4511F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(67, 153).addBox(0.1867F, -0.0623F, 0.0536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 124).addBox(-0.6133F, -0.0623F, 0.0536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4918F, 7.7413F, -0.9299F, -0.1536F, -0.1833F, 0.4617F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(149, 82).addBox(-0.9762F, -0.8665F, -0.1406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1347F, 7.4471F, 0.3241F, -0.4763F, -0.4424F, -0.2756F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(153, 0).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7019F, -2.7514F, 6.7706F, -1.906F, 0.6041F, -0.0373F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(139, 148).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9037F, -2.3678F, 8.5638F, -1.8641F, -0.3579F, 0.2634F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(148, 138).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2588F, -2.3063F, 9.6998F, -2.0157F, -0.8902F, 0.5129F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(147, 87).addBox(-0.5F, -1.5F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(140, 47).addBox(-1.1F, -3.0F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.224F, -3.1217F, 8.4051F, -2.9185F, -1.2894F, 1.4969F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(32, 128).addBox(-1.3F, -4.0F, -0.4F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2995F, -3.3303F, 6.7167F, -2.3138F, -1.4873F, 0.8854F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(67, 150).addBox(-0.6F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4524F, -3.3082F, 5.3109F, 1.535F, -0.5412F, -2.9844F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(147, 75).addBox(-1.2521F, -0.2201F, -1.0196F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2771F, -2.7358F, 4.5697F, 1.5221F, -0.89F, -2.9649F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(127, 31).addBox(-2.3F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7341F, -2.1046F, 4.1102F, 0.9677F, -0.4272F, 3.0404F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(127, 26).addBox(-0.518F, -2.546F, -1.0138F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7229F, -2.7358F, 4.5697F, 0.8284F, -0.7019F, -2.9859F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(140, 56).addBox(-1.9F, 1.0F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3838F, -0.6949F, 2.0628F, 0.1911F, 0.9178F, 2.4233F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(139, 144).addBox(-0.7754F, 0.0171F, -0.0515F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5011F, 0.0675F, 1.4303F, 0.3725F, 0.1951F, 3.1168F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(50, 150).addBox(-0.761F, 0.0276F, -0.1884F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5011F, 1.0675F, 1.6303F, -0.0638F, 0.1951F, 3.1168F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(48, 139).addBox(-1.3494F, -0.9668F, -0.6249F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5011F, 1.9675F, 2.1303F, -0.1531F, 0.137F, 2.5889F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(144, 152).addBox(-0.6758F, -2.1009F, -0.6249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5011F, 1.9675F, 2.1303F, -0.2036F, 0.0252F, 1.986F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(139, 152).addBox(0.2875F, -2.268F, -0.7126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5011F, 1.9675F, 2.4303F, -0.2024F, 0.461F, 1.5569F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(154, 76).addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 73).addBox(-0.1F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1374F, 2.9432F, 3.2043F, -0.0588F, 0.0173F, 1.8803F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(153, 148).addBox(0.56F, -2.4006F, 0.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(45, 150).addBox(0.56F, -2.5006F, -0.7126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5011F, 1.9675F, 2.4303F, -0.0669F, 0.4964F, 1.8494F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(149, 152).addBox(1.8434F, -0.3712F, 0.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(147, 40).addBox(0.8434F, -0.3712F, -0.7126F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5011F, 1.9675F, 2.4303F, -0.4302F, 0.2641F, 0.9357F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(37, 60).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2452F, 5.3566F, 3.9339F, -1.0896F, 0.115F, 0.3568F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(42, 126).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(52, 64).addBox(-0.5F, -1.4F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7496F, 5.8846F, 1.4385F, -0.915F, 0.115F, 0.3568F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(91, 142).addBox(-2.1584F, -4.6911F, -1.4202F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4479F, 9.4012F, 0.3558F, -0.3452F, -0.1891F, 0.0543F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(140, 132).addBox(-2.6879F, -0.9468F, 1.5162F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4918F, 9.4413F, -0.9299F, -1.4761F, 0.1877F, 0.4077F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(140, 83).addBox(-2.4411F, -0.9537F, -0.5788F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4918F, 9.4413F, -0.9299F, -1.6217F, 0.2723F, 0.1531F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(122, 95).addBox(-0.866F, -0.8598F, -3.1037F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.2677F, 9.9634F, -0.592F, -1.9374F, 0.1483F, -0.3741F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(97, 129).addBox(-0.7F, -2.9F, -0.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.1405F, 6.4687F, 3.2749F, 1.9264F, -0.3548F, 1.2663F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-4.92F, 3.8796F, -7.7036F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(70, 136).mirror().addBox(-0.7104F, -0.1621F, -0.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6918F, 9.4413F, -0.9299F, -0.1275F, 0.1126F, -1.1326F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(5, 117).mirror().addBox(-0.1662F, -0.2009F, 0.0161F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6918F, 9.4413F, -0.9299F, 0.0138F, 0.4424F, -0.4511F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(67, 153).mirror().addBox(-1.1867F, -0.0623F, 0.0536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 124).mirror().addBox(-0.3867F, -0.0623F, 0.0536F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4918F, 7.7413F, -0.9299F, -0.1536F, 0.1833F, -0.4617F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(149, 82).mirror().addBox(-0.0238F, -0.8665F, -0.1406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1347F, 7.4471F, 0.3241F, -0.4763F, 0.4424F, 0.2756F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(153, 0).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7019F, -2.7514F, 6.7706F, -1.906F, -0.6041F, 0.0373F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(139, 148).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9037F, -2.3678F, 8.5638F, -1.8641F, 0.3579F, -0.2634F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(148, 138).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2588F, -2.3063F, 9.6998F, -2.0157F, 0.8902F, -0.5129F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(147, 87).mirror().addBox(-1.5F, -1.5F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(140, 47).mirror().addBox(-0.9F, -3.0F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.224F, -3.1217F, 8.4051F, -2.9185F, 1.2894F, -1.4969F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(32, 128).mirror().addBox(-0.7F, -4.0F, -0.4F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2995F, -3.3303F, 6.7167F, -2.3138F, 1.4873F, -0.8854F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(67, 150).mirror().addBox(-1.4F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4524F, -3.3082F, 5.3109F, 1.535F, 0.5412F, 2.9844F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(147, 75).mirror().addBox(-0.7479F, -0.2201F, -1.0196F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2771F, -2.7358F, 4.5697F, 1.5221F, 0.89F, 2.9649F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(127, 31).mirror().addBox(-1.7F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7341F, -2.1046F, 4.1102F, 0.9677F, 0.4272F, -3.0404F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(127, 26).mirror().addBox(-3.482F, -2.546F, -1.0138F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7229F, -2.7358F, 4.5697F, 0.8284F, 0.7019F, 2.9859F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(140, 56).mirror().addBox(-1.1F, 1.0F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3838F, -0.6949F, 2.0628F, 0.1911F, -0.9178F, -2.4233F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(139, 144).mirror().addBox(-2.2245F, 0.0171F, -0.0515F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 0.0675F, 1.4303F, 0.3725F, -0.1951F, -3.1168F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-1.239F, 0.0276F, -0.1884F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.0675F, 1.6303F, -0.0638F, -0.1951F, -3.1168F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(48, 139).mirror().addBox(-1.6506F, -0.9668F, -0.6249F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.9675F, 2.1303F, -0.1531F, -0.137F, -2.5889F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(144, 152).mirror().addBox(-0.3242F, -2.1009F, -0.6249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.9675F, 2.1303F, -0.2036F, -0.0252F, -1.986F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(139, 152).mirror().addBox(-1.2875F, -2.268F, -0.7126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.9675F, 2.4303F, -0.2024F, -0.461F, -1.5569F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(154, 76).mirror().addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(154, 73).mirror().addBox(-0.9F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1374F, 2.9432F, 3.2043F, -0.0588F, -0.0173F, -1.8803F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(153, 148).mirror().addBox(-1.56F, -2.4006F, 0.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(45, 150).mirror().addBox(-1.56F, -2.5006F, -0.7126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.9675F, 2.4303F, -0.0669F, -0.4964F, -1.8494F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(149, 152).mirror().addBox(-2.8434F, -0.3712F, 0.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(147, 40).mirror().addBox(-2.8434F, -0.3712F, -0.7126F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 1.9675F, 2.4303F, -0.4302F, -0.2641F, -0.9357F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(37, 60).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2452F, 5.3566F, 3.9339F, -1.0896F, -0.115F, -0.3568F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(42, 126).mirror().addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(52, 64).mirror().addBox(-0.5F, -1.4F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7496F, 5.8846F, 1.4385F, -0.915F, -0.115F, -0.3568F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(91, 142).mirror().addBox(0.1584F, -4.6911F, -1.4202F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4479F, 9.4012F, 0.3558F, -0.3452F, 0.1891F, -0.0543F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(140, 132).mirror().addBox(0.6879F, -0.9468F, 1.5162F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4918F, 9.4413F, -0.9299F, -1.4761F, -0.1877F, -0.4077F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(140, 83).mirror().addBox(0.4411F, -0.9537F, -0.5788F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4918F, 9.4413F, -0.9299F, -1.6217F, -0.2723F, -0.1531F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(122, 95).mirror().addBox(-1.134F, -0.8598F, -3.1037F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.2677F, 9.9634F, -0.592F, -1.9374F, -0.1483F, 0.3741F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(97, 129).mirror().addBox(-0.3F, -2.9F, -0.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.1405F, 6.4687F, 3.2749F, 1.9264F, 0.3548F, -1.2663F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7972F, 10.5824F, -4.1828F, -0.7869F, -0.2186F, -0.0975F));

		PartDefinition cube_r457 = leftOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(152, 16).addBox(0.5046F, -2.3909F, -1.0233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3218F, -4.8025F, 0.2284F, 2.6366F, -0.0498F, 0.3763F));

		PartDefinition cube_r458 = leftOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(38, 152).addBox(-0.5331F, -0.1231F, -0.6859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3483F, -4.9942F, -0.2074F, -2.9723F, 0.0558F, 0.1345F));

		PartDefinition cube_r459 = leftOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(140, 37).addBox(-0.9F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0901F, -10.1305F, -1.1324F, 3.0731F, -0.2366F, 1.7116F));

		PartDefinition cube_r460 = leftOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(20, 141).addBox(-1.9F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2708F, -9.4667F, -1.0701F, -2.8862F, -0.2576F, 0.7553F));

		PartDefinition cube_r461 = leftOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(106, 149).addBox(-0.5331F, 1.8985F, -0.5084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(152, 29).addBox(-0.5331F, -0.1015F, -0.2084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3483F, -4.9942F, -0.2074F, -3.0596F, 0.0558F, 0.1345F));

		PartDefinition cube_r462 = leftOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(101, 149).addBox(-0.5331F, 1.7621F, -0.6738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3483F, -4.9942F, -0.2074F, -2.8022F, 0.0558F, 0.1345F));

		PartDefinition cube_r463 = leftOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(22, 152).addBox(0.371F, -1.1788F, -0.0018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(134, 150).addBox(0.371F, -1.1788F, -0.4018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3218F, -4.8025F, 0.2284F, -2.7944F, 0.0129F, 0.2692F));

		PartDefinition cube_r464 = leftOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(9, 131).addBox(0.371F, -2.0842F, -1.3447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3218F, -4.8025F, 0.2284F, 2.1362F, 0.0129F, 0.2692F));

		PartDefinition cube_r465 = leftOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(94, 65).addBox(0.5341F, -0.1887F, -3.0147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3218F, -4.8025F, 0.2284F, 1.2668F, 0.01F, 0.3597F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7972F, 10.5824F, -4.1828F, -0.7869F, 0.2186F, 0.0975F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(152, 16).mirror().addBox(-1.5046F, -2.3909F, -1.0233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3218F, -4.8025F, 0.2284F, 2.6366F, 0.0498F, -0.3763F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(38, 152).mirror().addBox(-0.4669F, -0.1231F, -0.6859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3483F, -4.9942F, -0.2074F, -2.9723F, -0.0558F, -0.1345F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(140, 37).mirror().addBox(-0.1F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0901F, -10.1305F, -1.1324F, 3.0731F, 0.2366F, -1.7116F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(20, 141).mirror().addBox(-0.1F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2708F, -9.4667F, -1.0701F, -2.8862F, 0.2576F, -0.7553F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(106, 149).mirror().addBox(-0.4669F, 1.8985F, -0.5084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(152, 29).mirror().addBox(-0.4669F, -0.1015F, -0.2084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3483F, -4.9942F, -0.2074F, -3.0596F, -0.0558F, -0.1345F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(101, 149).mirror().addBox(-0.4669F, 1.7621F, -0.6738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3483F, -4.9942F, -0.2074F, -2.8022F, -0.0558F, -0.1345F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(22, 152).mirror().addBox(-1.371F, -1.1788F, -0.0018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(134, 150).mirror().addBox(-1.371F, -1.1788F, -0.4018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3218F, -4.8025F, 0.2284F, -2.7944F, -0.0129F, -0.2692F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(9, 131).mirror().addBox(-1.371F, -2.0842F, -1.3447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3218F, -4.8025F, 0.2284F, 2.1362F, -0.0129F, -0.2692F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(-1.5341F, -0.1887F, -3.0147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3218F, -4.8025F, 0.2284F, 1.2668F, -0.01F, -0.3597F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(48, 129).addBox(3.0F, 1.4F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F))
				.texOffs(154, 85).addBox(3.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(48, 129).mirror().addBox(-5.2F, 1.4F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(154, 85).mirror().addBox(-5.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 3.8022F, 1.9515F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(79, 152).mirror().addBox(-0.7175F, 2.7446F, -0.2304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.4161F, -0.0447F, 0.1231F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(152, 96).mirror().addBox(-0.7175F, 4.4348F, -1.0479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.5907F, -0.0447F, 0.1231F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(92, 153).mirror().addBox(-0.7175F, 5.7621F, -2.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.8525F, -0.0447F, 0.1231F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(93, 148).mirror().addBox(-0.7175F, 6.5914F, -4.6013F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 1.1186F, -0.0447F, 0.1231F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(74, 150).mirror().addBox(-0.7175F, 5.785F, -6.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 1.2932F, -0.0447F, 0.1231F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(152, 100).mirror().addBox(-0.7175F, 5.4695F, -4.0313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.9834F, -0.0447F, 0.1231F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(152, 92).mirror().addBox(-0.7175F, 4.3265F, -2.4783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.7216F, -0.0447F, 0.1231F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(152, 64).mirror().addBox(-0.7175F, 2.7604F, -1.4831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.5034F, -0.0447F, 0.1231F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(98, 143).mirror().addBox(-0.5816F, -0.0418F, -0.9815F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.3267F, -0.0594F, 0.1642F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(105, 143).mirror().addBox(-0.5816F, -0.1991F, -0.5909F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.1958F, -0.0594F, 0.1642F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(142, 93).mirror().addBox(-0.9869F, -0.1582F, -0.5848F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.2004F, -0.0149F, 0.041F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(84, 142).mirror().addBox(-0.9869F, -0.0005F, -0.9808F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.6762F, -14.6028F, 0.3313F, -0.0149F, 0.041F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(13, 103).mirror().addBox(-0.9788F, -1.9319F, -0.9558F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(13, 103).addBox(-0.5788F, -1.9319F, -0.9558F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3212F, 10.9571F, -14.8323F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(64, 155).mirror().addBox(-0.0439F, 1.1306F, -1.4102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.5796F, -0.2094F, 0.0006F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(154, 68).mirror().addBox(-0.0447F, -3.5695F, -1.202F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.6408F, -0.2094F, 0.0012F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(85, 127).mirror().addBox(-0.0596F, -0.6741F, -1.2283F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.7281F, -0.2094F, 0.0012F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(141, 113).mirror().addBox(-0.7082F, -3.8422F, -0.8713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3212F, 10.9571F, -14.8323F, 0.0126F, -0.1621F, -0.0073F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.5906F, -3.8305F, -1.0582F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3212F, 10.9571F, -14.8323F, -0.1599F, 0.0515F, -0.1108F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(145, 30).mirror().addBox(-0.4096F, -0.3818F, -0.3677F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.6476F, -0.2097F, -0.007F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(38, 141).mirror().addBox(-0.5F, -0.0688F, -1.9673F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 141).addBox(7.7F, -0.0688F, -1.9673F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.7F, 6.469F, -0.6949F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(16, 145).mirror().addBox(-2.6F, -0.1379F, -1.8552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(16, 145).addBox(5.6F, -0.1379F, -1.8552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.6F, 6.0606F, -3.3363F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(78, 102).mirror().addBox(-0.3996F, -4.2778F, -0.3647F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.6755F, -0.1745F, 0.0F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(76, 134).mirror().addBox(-2.7921F, 0.8228F, -2.0418F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 6.0606F, -3.3363F, -1.6161F, -0.3717F, -0.0704F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(146, 104).mirror().addBox(-0.5F, -0.034F, -0.2215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.1073F, -11.7969F, -1.0908F, -0.2182F, -0.0436F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(147, 45).mirror().addBox(-0.5F, -0.0072F, 0.1412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1213F, 5.9039F, -15.6573F, -0.1309F, -0.2182F, -0.0436F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(9, 142).mirror().addBox(-0.5F, -0.2072F, 0.1411F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6204F, 3.8593F, -13.8105F, -0.7418F, -0.2182F, -0.0436F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(149, 56).mirror().addBox(-0.8F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1046F, 5.8358F, -11.499F, -0.9311F, -0.4901F, -0.1306F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(137, 105).mirror().addBox(-1.0F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1487F, 4.9512F, -11.6879F, -1.2474F, -0.2298F, -0.0998F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(94, 101).mirror().addBox(-0.9F, -3.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5887F, 7.3815F, -13.5106F, -0.5777F, -0.096F, -0.146F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(94, 137).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.378F, 4.7567F, -10.4929F, -1.582F, -0.1721F, 0.0291F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-0.3996F, 1.171F, -0.4579F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7004F, 3.3904F, -9.0331F, -1.5708F, -0.1745F, 0.0F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(129, 78).mirror().addBox(-1.2557F, -0.6945F, -2.1078F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 6.0106F, -7.5363F, -1.6679F, -0.2442F, 0.0087F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(38, 147).mirror().addBox(-0.5F, -1.9904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(38, 147).addBox(7.7F, -1.9904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.7F, 4.3784F, 1.0536F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(101, 154).mirror().addBox(-0.5F, -1.5507F, -1.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 154).addBox(7.7F, -1.5507F, -1.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 6.4575F, 0.8983F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(122, 47).mirror().addBox(-0.5F, -1.6493F, -4.5934F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(122, 47).addBox(7.7F, -1.6493F, -4.5934F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 5.7364F, -2.0507F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(57, 150).mirror().addBox(-0.5F, -1.5F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 150).addBox(7.7F, -1.5F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 0.8507F, -0.7197F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(62, 150).mirror().addBox(-0.5F, -0.7F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(62, 150).addBox(7.7F, -0.7F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.7F, 0.7F, 0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(15, 153).mirror().addBox(-0.5F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(15, 153).addBox(7.7F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, 0.7F, 0.3F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(90, 109).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(90, 109).addBox(7.2F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.2F, 0.969F, -3.6436F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(50, 153).mirror().addBox(-1.0F, 0.0319F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(50, 153).addBox(7.2F, 0.0319F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.2F, 1.0739F, -6.2029F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(154, 88).mirror().addBox(-1.0F, 0.0319F, -0.3171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(154, 88).addBox(7.2F, 0.0319F, -0.3171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2F, 0.1453F, -5.7257F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(27, 153).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(27, 153).addBox(7.7F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, -0.0651F, -5.0564F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(154, 82).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(154, 82).addBox(7.7F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 0.9212F, -4.8914F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(109, 89).mirror().addBox(-0.5F, -1.8F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(109, 89).addBox(7.7F, -1.8F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.7F, 5.0865F, -1.5026F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-0.5F, -3.3001F, -0.9595F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(58, 121).addBox(7.7F, -3.3001F, -0.9595F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, 4.9575F, -1.1017F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(79, 152).addBox(-0.2825F, 2.7446F, -0.2304F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.4161F, 0.0447F, -0.1231F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(152, 96).addBox(-0.2825F, 4.4348F, -1.0479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.5907F, 0.0447F, -0.1231F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(92, 153).addBox(-0.2825F, 5.7621F, -2.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.8525F, 0.0447F, -0.1231F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(93, 148).addBox(-0.2825F, 6.5914F, -4.6013F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 1.1186F, 0.0447F, -0.1231F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(74, 150).addBox(-0.2825F, 5.785F, -6.2166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 1.2932F, 0.0447F, -0.1231F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(152, 100).addBox(-0.2825F, 5.4695F, -4.0313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.9834F, 0.0447F, -0.1231F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(152, 92).addBox(-0.2825F, 4.3265F, -2.4783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.7216F, 0.0447F, -0.1231F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(152, 64).addBox(-0.2825F, 2.7604F, -1.4831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.5034F, 0.0447F, -0.1231F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(98, 143).addBox(-0.4184F, -0.0418F, -0.9815F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.3267F, 0.0594F, -0.1642F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(105, 143).addBox(-0.4184F, -0.1991F, -0.5909F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.1958F, 0.0594F, -0.1642F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(142, 93).addBox(-0.0131F, -0.1582F, -0.5848F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.2004F, 0.0149F, -0.041F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(84, 142).addBox(-0.0131F, -0.0005F, -0.9808F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6762F, -14.6028F, 0.3313F, 0.0149F, -0.041F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(64, 155).addBox(0.0439F, 1.1306F, -1.4102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.5796F, 0.2094F, -0.0006F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(154, 68).addBox(0.0447F, -3.5695F, -1.202F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.6408F, 0.2094F, -0.0012F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(85, 127).addBox(0.0596F, -0.6741F, -1.2283F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.7281F, 0.2094F, -0.0012F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(141, 113).addBox(-0.2918F, -3.8422F, -0.8713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1212F, 10.9571F, -14.8323F, 0.0126F, 0.1621F, 0.0073F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(0, 110).addBox(-1.4094F, -3.8305F, -1.0582F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1212F, 10.9571F, -14.8323F, -0.1599F, -0.0515F, 0.1108F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(145, 30).addBox(-0.5904F, -0.3818F, -0.3677F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.6476F, 0.2097F, 0.007F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(78, 102).addBox(-0.6004F, -4.2778F, -0.3647F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.6755F, 0.1745F, 0.0F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(76, 134).addBox(0.7921F, 0.8228F, -2.0418F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6F, 6.0606F, -3.3363F, -1.6161F, 0.3717F, 0.0704F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(146, 104).addBox(-0.5F, -0.034F, -0.2215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1073F, -11.7969F, -1.0908F, 0.2182F, 0.0436F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(147, 45).addBox(-0.5F, -0.0072F, 0.1412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0787F, 5.9039F, -15.6573F, -0.1309F, 0.2182F, 0.0436F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(9, 142).addBox(-0.5F, -0.2072F, 0.1411F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4204F, 3.8593F, -13.8105F, -0.7418F, 0.2182F, 0.0436F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(149, 56).addBox(-1.2F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9046F, 5.8358F, -11.499F, -0.9311F, 0.4901F, 0.1306F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(137, 105).addBox(-1.0F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9487F, 4.9512F, -11.6879F, -1.2474F, 0.2298F, 0.0998F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(94, 101).addBox(-1.1F, -3.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3887F, 7.3815F, -13.5106F, -0.5777F, 0.096F, 0.146F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(94, 137).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.178F, 4.7567F, -10.4929F, -1.582F, 0.1721F, -0.0291F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(146, 0).addBox(-0.6004F, 1.171F, -0.4579F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5004F, 3.3904F, -9.0331F, -1.5708F, 0.1745F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(129, 78).addBox(-0.7443F, -0.6945F, -2.1078F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6F, 6.0106F, -7.5363F, -1.6679F, 0.2442F, -0.0087F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(60, 59).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(106, 154).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 154).addBox(0.0F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0726F, 2.7644F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(154, 151).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 3.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(46, 155).addBox(0.0F, -1.8182F, 2.953F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 6.8924F, -0.3328F, 0.0825F, -0.0285F));

		PartDefinition cube_r551 = tail2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(45, 141).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3182F, 4.953F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(43, 155).addBox(0.0F, -1.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3182F, 1.753F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(68, 78).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(16, 142).addBox(0.0F, -1.2864F, 0.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 155).addBox(0.0F, -1.2864F, 2.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 155).addBox(0.0F, -1.0864F, 4.9035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0855F, 5.8481F, -0.2628F, 0.0843F, -0.0226F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(92, 41).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0076F, 5.7226F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(50, 92).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0174F, 4.9015F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(94, 7).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.7F, 0.3568F, 0.2048F, 0.0757F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(85, 137).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.7F, 0.4498F, 0.2368F, 0.1128F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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