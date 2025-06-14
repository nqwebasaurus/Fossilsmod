package fossils.fossils.client.blockentity.model.desmatosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DesmatosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Desmatosuchus;
	private final ModelPart body3;
	private final ModelPart leftBackLeg;
	private final ModelPart leftBjoint;
	private final ModelPart leftBfoot;
	private final ModelPart leftBfoot2;
	private final ModelPart rightBackLeg;
	private final ModelPart rightBjoint;
	private final ModelPart rightBfoot;
	private final ModelPart rightBfoot2;
	private final ModelPart tail7;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart body4;
	private final ModelPart bone5;
	private final ModelPart leftFrontLeg;
	private final ModelPart LeftFjoint;
	private final ModelPart LeftFFoot;
	private final ModelPart bone3;
	private final ModelPart rightFrontLeg;
	private final ModelPart RightFjoint;
	private final ModelPart RightFFoot;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public DesmatosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Desmatosuchus = this.fossil.getChild("Desmatosuchus");
		this.body3 = this.Desmatosuchus.getChild("body3");
		this.leftBackLeg = this.body3.getChild("leftBackLeg");
		this.leftBjoint = this.leftBackLeg.getChild("leftBjoint");
		this.leftBfoot = this.leftBjoint.getChild("leftBfoot");
		this.leftBfoot2 = this.leftBfoot.getChild("leftBfoot2");
		this.rightBackLeg = this.body3.getChild("rightBackLeg");
		this.rightBjoint = this.rightBackLeg.getChild("rightBjoint");
		this.rightBfoot = this.rightBjoint.getChild("rightBfoot");
		this.rightBfoot2 = this.rightBfoot.getChild("rightBfoot2");
		this.tail7 = this.body3.getChild("tail7");
		this.tail = this.tail7.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.bone2 = this.body3.getChild("bone2");
		this.bone4 = this.body3.getChild("bone4");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.body4 = this.bodyfront.getChild("body4");
		this.bone5 = this.body4.getChild("bone5");
		this.leftFrontLeg = this.bone5.getChild("leftFrontLeg");
		this.LeftFjoint = this.leftFrontLeg.getChild("LeftFjoint");
		this.LeftFFoot = this.LeftFjoint.getChild("LeftFFoot");
		this.bone3 = this.body4.getChild("bone3");
		this.rightFrontLeg = this.bone3.getChild("rightFrontLeg");
		this.RightFjoint = this.rightFrontLeg.getChild("RightFjoint");
		this.RightFFoot = this.RightFjoint.getChild("RightFFoot");
		this.neck = this.body4.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Desmatosuchus = fossil.addOrReplaceChild("Desmatosuchus", CubeListBuilder.create(), PartPose.offset(0.0F, -11.975F, -1.0F));

		PartDefinition body3 = Desmatosuchus.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.0546F, 1.6687F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6121F, -1.6375F, 9.2696F, 1.0154F, -0.0939F, -1.0533F));

		PartDefinition cube_r2 = body3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(113, 118).mirror().addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.6121F, -1.6375F, 9.2696F, 1.4517F, -0.0939F, -1.0533F));

		PartDefinition cube_r3 = body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(118, 91).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0871F, -2.1125F, 7.6446F, 1.0612F, -0.1197F, -1.1455F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(113, 114).mirror().addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.0871F, -2.1125F, 7.6446F, 1.4976F, -0.1197F, -1.1455F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(118, 87).mirror().addBox(-0.5F, -0.2936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.4871F, -1.9125F, 5.7446F, 1.6359F, 0.2808F, -1.2049F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 118).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4871F, -1.9125F, 5.7446F, 1.025F, 0.2808F, -1.2049F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-1.0319F, 0.0F, -0.0742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2243F, -3.7397F, 6.5988F, -0.4164F, -0.0561F, -0.6171F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.778F, -1.4894F, 6.0073F, 0.0879F, 0.1978F, -0.7269F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.0477F, 6.016F, -0.4181F, 0.0603F, -0.2712F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 38).mirror().addBox(-5.0F, 0.0692F, -0.2699F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.501F, 3.3403F, 0.2043F, 0.1069F, -0.2331F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 102).mirror().addBox(-2.8319F, 0.0F, -0.0742F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2243F, -3.7397F, 6.5988F, -0.4166F, 0.0637F, -0.67F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-3.2495F, -0.2808F, -0.5877F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8617F, -3.3478F, 4.2597F, 0.0898F, 0.2848F, -0.7189F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(-3.4F, -0.1388F, -1.4075F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3716F, 6.3625F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-4.5F, 0.9014F, 0.1675F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 14).addBox(0.5F, 0.9014F, 0.1675F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(-0.5F, -0.0986F, 0.1675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6523F, 4.3285F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 107).addBox(0.0319F, 0.0F, -0.0742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2243F, -3.7397F, 6.5988F, -0.4164F, 0.0561F, 0.6171F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 102).addBox(0.8319F, 0.0F, -0.0742F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2243F, -3.7397F, 6.5988F, -0.4166F, -0.0637F, 0.67F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 59).addBox(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.0477F, 6.016F, -0.4181F, -0.0603F, 0.2712F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0477F, 6.016F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(113, 118).addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.6121F, -1.6375F, 9.2696F, 1.4517F, 0.0939F, 1.0533F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6121F, -1.6375F, 9.2696F, 1.0154F, 0.0939F, 1.0533F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(113, 114).addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.0871F, -2.1125F, 7.6446F, 1.4976F, 0.1197F, 1.1455F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(118, 91).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0871F, -2.1125F, 7.6446F, 1.0612F, 0.1197F, 1.1455F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(118, 87).addBox(-0.5F, -0.2936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.4871F, -1.9125F, 5.7446F, 1.6359F, -0.2808F, 1.2049F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(78, 118).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4871F, -1.9125F, 5.7446F, 1.025F, -0.2808F, 1.2049F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(104, 64).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.778F, -1.4894F, 6.0073F, 0.0879F, -0.1978F, 0.7269F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 91).addBox(0.2495F, -0.2808F, -0.5877F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8617F, -3.3478F, 4.2597F, 0.0898F, -0.2848F, 0.7189F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(86, 38).addBox(0.0F, 0.0692F, -0.2699F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.501F, 3.3403F, 0.2043F, -0.1069F, 0.2331F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 104).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.301F, 3.3403F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(73, 51).addBox(-0.6F, -0.1388F, -1.4075F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3716F, 6.3625F, -0.1264F, -0.2598F, 0.0326F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(108, 116).addBox(-0.006F, -2.6809F, -0.4201F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6523F, 4.3285F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 76).addBox(0.0F, -3.081F, 0.0799F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6523F, 4.3285F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftBackLeg = body3.addOrReplaceChild("leftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8606F, -0.2747F, 5.2471F, -0.4903F, -0.1134F, 0.0253F));

		PartDefinition cube_r32 = leftBackLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 103).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7905F, 8.5417F, 2.3628F, 0.3532F, 0.0905F, -0.2921F));

		PartDefinition cube_r33 = leftBackLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 55).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2168F, 9.549F, 3.6643F, 0.8768F, 0.0905F, -0.2921F));

		PartDefinition cube_r34 = leftBackLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(57, 102).addBox(-0.5F, -2.5F, -1.15F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8057F, 5.2951F, 2.2736F, 0.2048F, 0.0905F, -0.2921F));

		PartDefinition cube_r35 = leftBackLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 58).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.723F, 0.5903F, 0.2459F, 0.4666F, 0.0905F, -0.2921F));

		PartDefinition leftBjoint = leftBackLeg.addOrReplaceChild("leftBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8984F, 10.9704F, 4.8539F, 0.436F, 0.0184F, -0.0395F));

		PartDefinition cube_r36 = leftBjoint.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 110).addBox(0.6F, -4.9F, -1.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 59).addBox(-0.5F, -4.8F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(103, 108).addBox(-0.5F, -4.5F, -1.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 4.3864F, 1.9502F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftBjoint.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(126, 19).addBox(-0.5F, -2.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 2.4873F, -0.1097F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftBjoint.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(19, 126).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 2.4873F, -0.1097F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftBjoint.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(115, 77).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 5.3844F, 2.069F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftBjoint.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 115).addBox(-0.5F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 5.3844F, 2.069F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftBfoot = leftBjoint.addOrReplaceChild("leftBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 6.6254F, 2.4237F, 0.0425F, 0.1022F, -0.0227F));

		PartDefinition cube_r41 = leftBfoot.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(76, 64).addBox(-1.5F, -1.5F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6398F, -1.8723F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftBfoot2 = leftBfoot.addOrReplaceChild("leftBfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8948F, -3.0494F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftBfoot2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 76).addBox(-1.5F, -1.5F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8398F, -2.3723F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightBackLeg = body3.addOrReplaceChild("rightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8606F, -0.2747F, 5.2471F, 0.0333F, 0.1134F, -0.0253F));

		PartDefinition cube_r43 = rightBackLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(96, 103).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7905F, 8.5417F, 2.3628F, 0.3532F, -0.0905F, 0.2921F));

		PartDefinition cube_r44 = rightBackLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(112, 101).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.2168F, 9.549F, 3.6643F, 0.8768F, -0.0905F, 0.2921F));

		PartDefinition cube_r45 = rightBackLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(102, 89).addBox(-0.5F, -2.5F, -1.15F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8057F, 5.2951F, 2.2736F, 0.2048F, -0.0905F, 0.2921F));

		PartDefinition cube_r46 = rightBackLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(102, 70).addBox(0.0F, -1.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.723F, 0.5903F, 0.2459F, 0.4666F, -0.0905F, 0.2921F));

		PartDefinition rightBjoint = rightBackLeg.addOrReplaceChild("rightBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8984F, 10.9704F, 4.8539F, 0.436F, -0.0184F, 0.0395F));

		PartDefinition cube_r47 = rightBjoint.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 110).addBox(-1.6F, -4.9F, -1.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 103).addBox(-0.5F, -4.8F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(108, 108).addBox(-0.5F, -4.5F, -1.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 4.3864F, 1.9502F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightBjoint.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 126).addBox(-0.5F, -2.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 2.4873F, -0.1097F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightBjoint.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(126, 27).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 2.4873F, -0.1097F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightBjoint.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 115).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.3844F, 2.069F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightBjoint.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(87, 115).addBox(-0.5F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.3844F, 2.069F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightBfoot = rightBjoint.addOrReplaceChild("rightBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 6.6254F, 2.4237F, -0.1757F, -0.1022F, 0.0227F));

		PartDefinition cube_r52 = rightBfoot.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(15, 82).addBox(-2.5F, -1.5F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6398F, -1.8723F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightBfoot2 = rightBfoot.addOrReplaceChild("rightBfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8948F, -3.0494F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightBfoot2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(32, 76).addBox(-2.5F, -1.5F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8398F, -2.3723F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail7 = body3.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2523F, 7.3285F, -0.0873F, -0.0455F, 0.0417F));

		PartDefinition cube_r54 = tail7.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(55, 34).mirror().addBox(-1.3F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3073F, 3.5079F, 0.1226F, -0.0866F, 3.1309F));

		PartDefinition cube_r55 = tail7.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(55, 34).addBox(-0.7F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3073F, 3.5079F, 0.1226F, 0.0866F, -3.1309F));

		PartDefinition cube_r56 = tail7.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, -0.0986F, 3.1675F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail7.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(110, 129).mirror().addBox(-0.5F, -0.8481F, 0.5825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(118, 108).mirror().addBox(-0.5F, -0.8481F, -1.0175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2121F, -1.2852F, 3.8412F, 1.08F, 0.02F, -1.143F));

		PartDefinition cube_r58 = tail7.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(113, 122).mirror().addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1121F, -0.8852F, 7.7412F, 1.5164F, 0.02F, -1.143F));

		PartDefinition cube_r59 = tail7.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(106, 122).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1121F, -0.8852F, 7.7412F, 1.08F, 0.02F, -1.143F));

		PartDefinition cube_r60 = tail7.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 119).mirror().addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.6121F, -1.0852F, 5.8412F, 1.5164F, 0.02F, -1.143F));

		PartDefinition cube_r61 = tail7.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(119, 4).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6121F, -1.0852F, 5.8412F, 1.08F, 0.02F, -1.143F));

		PartDefinition cube_r62 = tail7.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(118, 95).mirror().addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.2121F, -1.2852F, 3.8412F, 1.5164F, 0.02F, -1.143F));

		PartDefinition cube_r63 = tail7.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.15F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5382F, -1.1362F, 4.5235F, -0.1502F, -0.0245F, -0.5751F));

		PartDefinition cube_r64 = tail7.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(-2.9F, 0.0F, 0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3048F, -2.4642F, 1.361F, -0.1518F, 0.148F, -0.6014F));

		PartDefinition cube_r65 = tail7.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.6986F, 1.3675F, -0.1559F, -0.0016F, -0.3137F));

		PartDefinition cube_r66 = tail7.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 0).addBox(-0.85F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.5382F, -1.1362F, 4.5235F, -0.1502F, 0.0245F, 0.5751F));

		PartDefinition cube_r67 = tail7.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(73, 43).addBox(0.9F, 0.0F, 0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3048F, -2.4642F, 1.361F, -0.1518F, -0.148F, 0.6014F));

		PartDefinition cube_r68 = tail7.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(19, 58).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6986F, 1.3675F, -0.1559F, 0.0016F, 0.3137F));

		PartDefinition cube_r69 = tail7.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 128).addBox(0.0F, -2.2837F, -1.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail7.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(106, 122).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1121F, -0.8852F, 7.7412F, 1.08F, -0.02F, 1.143F));

		PartDefinition cube_r71 = tail7.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(113, 122).addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.1121F, -0.8852F, 7.7412F, 1.5164F, -0.02F, 1.143F));

		PartDefinition cube_r72 = tail7.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(119, 4).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6121F, -1.0852F, 5.8412F, 1.08F, -0.02F, 1.143F));

		PartDefinition cube_r73 = tail7.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(7, 119).addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.6121F, -1.0852F, 5.8412F, 1.5164F, -0.02F, 1.143F));

		PartDefinition cube_r74 = tail7.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(110, 129).addBox(-0.5F, -0.8481F, 0.5825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(118, 108).addBox(-0.5F, -0.8481F, -1.0175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2121F, -1.2852F, 3.8412F, 1.08F, -0.02F, 1.143F));

		PartDefinition cube_r75 = tail7.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(118, 95).addBox(-0.5F, -0.4936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.2121F, -1.2852F, 3.8412F, 1.5164F, -0.02F, 1.143F));

		PartDefinition cube_r76 = tail7.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 128).addBox(0.0F, -2.2663F, -1.0313F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail7.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6986F, 1.3675F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail7.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(29, 127).addBox(0.0F, -2.3489F, -1.034F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail = tail7.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8014F, 6.8175F, 0.0748F, -0.0768F, 0.1038F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(127, 115).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.3631F, -1.4624F, 9.7982F, 0.7046F, 0.1025F, -1.346F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(127, 61).mirror().addBox(-0.85F, -0.5932F, -0.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7822F, -1.7932F, 8.4654F, 0.542F, 0.1391F, -1.2016F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(96, 127).mirror().addBox(-0.5F, -0.5936F, -0.1571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9121F, -1.5117F, 6.6237F, 1.4218F, 0.0994F, -1.1408F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 127).mirror().addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9121F, -1.5117F, 6.6237F, 1.1164F, 0.0994F, -1.1408F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(16, 115).mirror().addBox(-0.5F, -0.5936F, -1.1571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.3621F, -1.5617F, 4.6237F, 1.4218F, 0.0994F, -1.1408F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(125, 127).mirror().addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3621F, -1.5617F, 4.6237F, 1.1164F, 0.0994F, -1.1408F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(115, 129).mirror().addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7121F, -1.5867F, 2.6237F, 1.08F, 0.02F, -1.143F));

		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(119, 8).mirror().addBox(-0.5F, -0.5936F, -1.1571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.7121F, -1.5867F, 2.6237F, 1.3855F, 0.02F, -1.143F));

		PartDefinition cube_r87 = tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 34).mirror().addBox(-1.0F, 0.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7648F, -2.4271F, 0.4302F, -0.0664F, 0.1434F, -0.5743F));

		PartDefinition cube_r88 = tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(25, 46).mirror().addBox(0.0F, 0.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3933F, -1.3596F, 0.887F, -0.0675F, 0.2304F, -0.5802F));

		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(0.0F, 0.0F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3794F, -2.5916F, 10.2405F, -0.0331F, 0.1363F, -0.3538F));

		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(25, 10).mirror().addBox(-2.0F, 0.0F, -0.2F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.6172F, 0.4704F, -0.0328F, -0.0119F, -0.3489F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(46, 34).addBox(0.0F, 0.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7648F, -2.4271F, 0.4302F, -0.0664F, -0.1434F, 0.5743F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(25, 46).addBox(-1.0F, 0.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3933F, -1.3596F, 0.887F, -0.0675F, -0.2304F, 0.5802F));

		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, 0.0F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3794F, -2.5916F, 10.2405F, -0.0331F, -0.1363F, 0.3538F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 10).addBox(0.0F, 0.0F, -0.2F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.6172F, 0.4704F, -0.0328F, 0.0119F, 0.3489F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.95F, 5.25F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(78, 113).addBox(0.0F, 1.6F, -0.1878F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.35F, 8.25F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(106, 130).addBox(0.0F, 1.6F, -0.1878F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.15F, 6.25F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(48, 128).addBox(0.0F, 1.2001F, -0.1878F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.35F, 4.25F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(88, 126).addBox(0.0F, -0.0999F, -0.1878F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.75F, 2.25F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(102, 124).addBox(0.0F, 0.1F, -0.1878F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.75F, 0.25F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(24, 133).addBox(0.0F, -1.5943F, -1.0048F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.25F, 11.05F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(21, 133).addBox(0.0F, -1.7768F, -1.004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.15F, 9.05F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(18, 133).addBox(0.0F, -1.2594F, -1.0085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.65F, 7.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(15, 133).addBox(0.0F, -1.8419F, -1.0042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.15F, 5.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 133).addBox(0.0F, -1.9245F, -1.0043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.15F, 3.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(133, 0).addBox(0.0F, -2.007F, -1.0043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.15F, 1.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(-11, 0).mirror().addBox(-1.5F, 0.0F, -0.2F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, 0.2544F, 0.0088F, 0.0873F, 0.0008F));

		PartDefinition cube_r108 = tail.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(-11, 0).addBox(-0.5F, 0.0F, -0.2F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, 0.2544F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition cube_r109 = tail.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.5F, -0.2F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.65F, 0.25F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(127, 115).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.3631F, -1.4624F, 9.7982F, 0.7046F, -0.1025F, 1.346F));

		PartDefinition cube_r111 = tail.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(127, 61).addBox(-0.15F, -0.5932F, -0.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.7822F, -1.7932F, 8.4654F, 0.542F, -0.1391F, 1.2016F));

		PartDefinition cube_r112 = tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(91, 127).addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9121F, -1.5117F, 6.6237F, 1.1164F, -0.0994F, 1.1408F));

		PartDefinition cube_r113 = tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(96, 127).addBox(-0.5F, -0.5936F, -0.1571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.9121F, -1.5117F, 6.6237F, 1.4218F, -0.0994F, 1.1408F));

		PartDefinition cube_r114 = tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(125, 127).addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3621F, -1.5617F, 4.6237F, 1.1164F, -0.0994F, 1.1408F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(16, 115).addBox(-0.5F, -0.5936F, -1.1571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.3621F, -1.5617F, 4.6237F, 1.4218F, -0.0994F, 1.1408F));

		PartDefinition cube_r116 = tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(119, 8).addBox(-0.5F, -0.5936F, -1.1571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.7121F, -1.5867F, 2.6237F, 1.3855F, -0.02F, 1.143F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(115, 129).addBox(-0.5F, -0.8481F, -0.4175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7121F, -1.5867F, 2.6237F, 1.08F, -0.02F, 1.143F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6853F, 10.8948F, 0.1578F, -0.0404F, -0.0014F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(110, 126).mirror().addBox(-0.0882F, -1.5219F, -1.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(127, 112).mirror().addBox(-0.0882F, -2.6219F, -3.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6392F, -0.5813F, 7.9399F, 0.5408F, 0.0756F, -1.4116F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(127, 121).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4925F, -0.689F, 2.9825F, 0.527F, -0.0105F, -1.4121F));

		PartDefinition cube_r120 = tail2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(120, 127).mirror().addBox(-0.55F, 0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(127, 118).mirror().addBox(-0.55F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8605F, -0.8255F, 0.451F, 0.7452F, -0.0105F, -1.4121F));

		PartDefinition cube_r121 = tail2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(-2.1F, -0.1F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.0548F, 3.1798F, -0.0085F, 0.0763F, -0.2625F));

		PartDefinition cube_r122 = tail2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 98).mirror().addBox(-1.0F, 0.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.344F, -1.9206F, -0.4028F, -0.1498F, 0.1319F, -0.6101F));

		PartDefinition cube_r123 = tail2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-2.0F, 0.0F, -0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.7F, -0.45F, -0.137F, -0.0134F, -0.3948F));

		PartDefinition cube_r124 = tail2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(43, 91).addBox(0.1F, -0.1F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.0548F, 3.1798F, -0.0085F, -0.0763F, 0.2625F));

		PartDefinition cube_r125 = tail2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(92, 83).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.153F, 3.3719F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 91).addBox(0.0F, 0.0F, -0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7F, -0.45F, -0.137F, 0.0134F, 0.3948F));

		PartDefinition cube_r127 = tail2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(78, 98).addBox(0.0F, 0.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, -1.9206F, -0.4028F, -0.1498F, -0.1319F, 0.6101F));

		PartDefinition cube_r128 = tail2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(24, 96).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7F, -0.45F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(133, 42).addBox(0.0F, -1.8F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 133).addBox(0.0F, -1.9F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 120).addBox(0.0F, -2.1F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 116).addBox(0.0F, -2.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 66).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.05F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(27, 132).addBox(0.0F, 1.1F, -0.1878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.15F, 6.05F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(132, 89).addBox(0.0F, 1.1F, -0.1878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.35F, 4.05F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(110, 126).addBox(-0.9118F, -1.5219F, -1.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(127, 112).addBox(-0.9118F, -2.6219F, -3.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6392F, -0.5813F, 7.9399F, 0.5408F, -0.0756F, 1.4116F));

		PartDefinition cube_r133 = tail2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(127, 121).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4925F, -0.689F, 2.9825F, 0.527F, 0.0105F, 1.4121F));

		PartDefinition cube_r134 = tail2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(120, 127).addBox(-0.45F, 0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(127, 118).addBox(-0.45F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8605F, -0.8255F, 0.451F, 0.7452F, 0.0105F, 1.4121F));

		PartDefinition cube_r135 = tail2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(87, 132).addBox(0.0F, 1.1F, -0.1878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.65F, 2.05F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(132, 85).addBox(0.0F, 1.1F, -0.1878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.65F, 0.05F, 0.7069F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(69, 55).addBox(-0.5F, -1.85F, -0.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 8.05F, 0.0316F, 0.0875F, -0.0404F));

		PartDefinition cube_r137 = tail3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(127, 58).mirror().addBox(-0.0925F, 1.4844F, 2.0671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(7, 127).mirror().addBox(-0.0925F, 0.5844F, 0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(115, 126).mirror().addBox(-0.0925F, -0.5156F, -0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6392F, -0.2866F, -0.0952F, 0.5408F, 0.0756F, -1.4116F));

		PartDefinition cube_r138 = tail3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4099F, -1.85F, -0.9165F, -0.0163F, -0.0135F, -0.2791F));

		PartDefinition cube_r139 = tail3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-1.6F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4099F, -1.85F, -0.9165F, -0.0164F, 0.1174F, -0.2812F));

		PartDefinition cube_r140 = tail3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(90, 7).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4099F, -1.85F, -0.9165F, -0.0163F, 0.0135F, 0.2791F));

		PartDefinition cube_r141 = tail3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 21).addBox(0.6F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4099F, -1.85F, -0.9165F, -0.0164F, -0.1174F, 0.2812F));

		PartDefinition cube_r142 = tail3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(133, 48).addBox(0.0F, -1.3F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 133).addBox(0.0F, -1.3F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 45).addBox(0.0F, -1.4F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 0).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, -0.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(132, 66).addBox(0.0F, 4.7F, 5.8122F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 62).addBox(0.0F, 3.4001F, 3.8122F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 58).addBox(0.0F, 2.1F, 1.8122F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.45F, -2.0F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(127, 58).addBox(-0.9075F, 1.4844F, 2.0671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(7, 127).addBox(-0.9075F, 0.5844F, 0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(115, 126).addBox(-0.9075F, -0.5156F, -0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6392F, -0.2866F, -0.0952F, 0.5408F, -0.0756F, 1.4116F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(25, 22).addBox(-0.5F, -1.8F, -0.65F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0026F, 6.9501F, -0.062F, -0.2589F, 0.0589F));

		PartDefinition cube_r145 = tail4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 133).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8963F, 8.3774F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(133, 54).addBox(0.0F, -1.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 133).addBox(0.0F, -1.2F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 51).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 133).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 55).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(0.0F, -0.275F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0861F, -1.2098F, -0.95F, 0.0F, 0.0349F, -0.3054F));

		PartDefinition cube_r148 = tail4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(23, 34).addBox(-1.0F, -0.275F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0861F, -1.2098F, -0.95F, 0.0F, -0.0349F, 0.3054F));

		PartDefinition cube_r149 = tail4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 118).addBox(0.0F, 10.3001F, 13.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 107).addBox(0.0F, 9.2F, 11.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 43).addBox(0.0F, 7.7F, 9.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 70).addBox(0.0F, 5.7F, 7.8122F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.4526F, -8.9501F, 0.6632F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, -0.45F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(59, 133).addBox(0.0F, -0.85F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 133).addBox(0.0F, -0.75F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4585F, 8.9047F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r150 = tail5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-0.75F, 0.0F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3415F, 0.3453F, -0.1048F, 0.0347F, -0.0037F));

		PartDefinition cube_r151 = tail5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(87, 70).addBox(-0.25F, 0.0F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3415F, 0.3453F, -0.1048F, -0.0347F, 0.0037F));

		PartDefinition cube_r152 = tail5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3415F, 0.3453F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(133, 31).addBox(0.0F, 13.4001F, 17.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 124).addBox(0.0F, 11.8001F, 15.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.9111F, -17.8548F, 0.6632F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 0.05F, 5.8F, -0.1509F, 0.5187F, -0.0752F));

		PartDefinition cube_r154 = tail6.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(133, 34).addBox(0.0F, 16.3F, 21.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 133).addBox(0.0F, 14.9001F, 19.8122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.8611F, -23.6548F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail6.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(11, 101).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7748F, 0.4129F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, 2.9711F, 4.3329F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(131, 6).addBox(-0.557F, -2.6935F, 1.5807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(131, 9).addBox(-0.557F, -2.2935F, 1.5807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.9875F, 1.6761F, -0.7044F, -2.0836F, -0.1303F, 0.3174F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(131, 12).addBox(-0.557F, -2.6304F, 0.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.9875F, 1.6761F, -0.7044F, -2.7818F, -0.1303F, 0.3174F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(125, 107).addBox(-0.557F, -2.7283F, -0.6316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.9875F, 1.6761F, -0.7044F, 3.0389F, -0.1303F, 0.3174F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(0, 113).addBox(-0.9037F, -2.6687F, -1.5453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2875F, -1.3239F, 0.6956F, 2.2099F, -0.1303F, 0.3698F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(126, 6).addBox(-0.8323F, -3.0786F, -0.3478F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5875F, -0.0239F, -1.3044F, -2.8079F, -0.1303F, 0.8934F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(112, 13).addBox(-1.1F, 0.9703F, 0.4199F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3125F, -2.3239F, 0.6956F, -1.4073F, -0.1303F, 0.3698F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(108, 78).addBox(-0.9037F, -1.5095F, 0.3031F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2875F, -1.3239F, 0.6956F, -1.8044F, -0.1303F, 0.3698F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(9, 107).addBox(-1.2759F, 0.4471F, -0.321F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6875F, -1.3239F, 3.3956F, -0.8712F, -0.5247F, 0.4604F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(128, 31).addBox(-1.2759F, -0.4425F, 0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6875F, -1.3239F, 3.3956F, -1.3512F, -0.5247F, 0.4604F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(10, 131).addBox(-1.2759F, -0.0604F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6875F, -1.3239F, 3.3956F, -0.9847F, -0.5247F, 0.4604F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(113, 60).addBox(-1.1535F, -1.3137F, -0.0166F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0875F, -1.3239F, 1.1956F, -0.6638F, -0.3088F, 0.2984F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(103, 14).addBox(-1.1535F, -0.7265F, -0.6305F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0875F, -1.3239F, 1.1956F, -0.9605F, -0.3088F, 0.2984F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(46, 97).addBox(-1.1F, 0.3728F, -2.6565F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3125F, -2.3239F, 0.6956F, -0.1812F, -0.1303F, 0.3698F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(103, 38).addBox(-1.1F, -0.762F, -1.7826F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3125F, -2.3239F, 0.6956F, 0.6042F, -0.1303F, 0.3698F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(94, 110).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0058F, -3.4174F, 0.2387F, -1.2654F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(87, 110).addBox(-0.3751F, 0.627F, -2.4141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1374F, -1.008F, 0.334F, -1.9286F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(130, 130).addBox(-0.5F, -0.275F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4325F, 0.3778F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(114, 33).addBox(-0.5F, -1.1543F, -0.8728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.3373F, 0.7157F, -2.1031F, 0.0F, 0.0F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(9, 112).addBox(-0.5F, -2.3983F, 0.0012F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1582F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(127, 64).addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.9697F, -1.3582F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(12, 128).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.8697F, -0.7582F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(91, 91).addBox(2.8842F, -0.882F, -2.0629F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-3.3842F, -5.2438F, 1.9756F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(103, 44).addBox(2.8842F, -1.9F, 5.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.3842F, -4.7438F, -6.0244F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone4 = body3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, 2.9711F, 4.3329F, -0.1806F, 0.2577F, -0.0465F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(131, 6).mirror().addBox(-0.443F, -2.6935F, 1.5807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(131, 9).mirror().addBox(-0.443F, -2.2935F, 1.5807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.9875F, 1.6761F, -0.7044F, -2.0836F, 0.1303F, -0.3174F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(131, 12).mirror().addBox(-0.443F, -2.6304F, 0.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.9875F, 1.6761F, -0.7044F, -2.7818F, 0.1303F, -0.3174F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(125, 107).mirror().addBox(-0.443F, -2.7283F, -0.6316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.9875F, 1.6761F, -0.7044F, 3.0389F, 0.1303F, -0.3174F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.0963F, -2.6687F, -1.5453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2875F, -1.3239F, 0.6956F, 2.2099F, 0.1303F, -0.3698F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(126, 6).mirror().addBox(-0.1677F, -3.0786F, -0.3478F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5875F, -0.0239F, -1.3044F, -2.8079F, 0.1303F, -0.8934F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(112, 13).mirror().addBox(0.1F, 0.9703F, 0.4199F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3125F, -2.3239F, 0.6956F, -1.4073F, 0.1303F, -0.3698F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(108, 78).mirror().addBox(-0.0963F, -1.5095F, 0.3031F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2875F, -1.3239F, 0.6956F, -1.8044F, 0.1303F, -0.3698F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(9, 107).mirror().addBox(0.2759F, 0.4471F, -0.321F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.6875F, -1.3239F, 3.3956F, -0.8712F, 0.5247F, -0.4604F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(128, 31).mirror().addBox(0.2759F, -0.4425F, 0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.6875F, -1.3239F, 3.3956F, -1.3512F, 0.5247F, -0.4604F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(0.2759F, -0.0604F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.6875F, -1.3239F, 3.3956F, -0.9847F, 0.5247F, -0.4604F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(113, 60).mirror().addBox(0.1535F, -1.3137F, -0.0166F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -1.3239F, 1.1956F, -0.6638F, 0.3088F, -0.2984F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(103, 14).mirror().addBox(0.1535F, -0.7265F, -0.6305F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -1.3239F, 1.1956F, -0.9605F, 0.3088F, -0.2984F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(46, 97).mirror().addBox(0.1F, 0.3728F, -2.6565F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3125F, -2.3239F, 0.6956F, -0.1812F, 0.1303F, -0.3698F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(103, 38).mirror().addBox(0.1F, -0.762F, -1.7826F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3125F, -2.3239F, 0.6956F, 0.6042F, 0.1303F, -0.3698F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(94, 110).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0058F, -3.4174F, 0.2387F, -1.2654F, 0.0F, 0.0F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(87, 110).mirror().addBox(-0.6249F, 0.627F, -2.4141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1374F, -1.008F, 0.334F, -1.9286F, 0.0F, 0.0F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(130, 130).mirror().addBox(-0.5F, -0.275F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.4325F, 0.3778F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(114, 33).mirror().addBox(-0.5F, -1.1543F, -0.8728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.3373F, 0.7157F, -2.1031F, 0.0F, 0.0F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(9, 112).mirror().addBox(-0.5F, -2.3983F, 0.0012F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.3697F, -2.1582F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(127, 64).mirror().addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.9697F, -1.3582F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Hips_r44 = bone4.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(12, 128).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.8697F, -0.7582F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r45 = bone4.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-3.8842F, -0.882F, -2.0629F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(3.3842F, -5.2438F, 1.9756F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Hips_r46 = bone4.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(103, 44).mirror().addBox(-3.8842F, -1.9F, 5.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(3.3842F, -4.7438F, -6.0244F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9845F, 4.8263F, 0.4665F, 0.039F, 0.0196F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(119, 27).mirror().addBox(-0.5768F, -1.533F, -1.1453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3558F, -0.4259F, -3.9943F, 1.3167F, 0.0295F, -1.0913F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(21, 119).mirror().addBox(-0.5768F, -1.1F, -1.0147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.3558F, -0.4259F, -3.9943F, 1.9276F, 0.0295F, -1.0913F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.5031F, 0.4834F, -1.3649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.7558F, -0.5259F, -3.6943F, 1.7742F, 0.1104F, -1.0792F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(23, 115).mirror().addBox(-0.5031F, -0.0351F, -0.524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7558F, -0.5259F, -3.6943F, 1.1633F, 0.1104F, -1.0792F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(14, 119).mirror().addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2871F, -0.728F, -1.0817F, 0.9473F, 0.0765F, -1.0879F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(119, 12).mirror().addBox(-0.5F, -0.2936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.2871F, -0.728F, -1.0817F, 1.5581F, 0.0765F, -1.0879F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(121, 31).mirror().addBox(-0.8F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-7.1207F, 0.1026F, -7.3652F, 0.4568F, 0.1109F, -0.7492F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-1.8559F, 0.0998F, -0.8336F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.463F, -2.2538F, -7.8588F, 0.0203F, 0.0062F, -0.7514F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-4.9F, 0.0998F, -0.1079F, 5.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -3.5598F, -7.7848F, 0.0393F, 0.0F, -0.2618F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-3.8559F, 0.0998F, -0.8336F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.463F, -2.2538F, -7.8588F, 0.0204F, 0.1109F, -0.7492F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(112, 106).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.3941F, -2.0516F, 0.0179F, 0.1822F, -0.1665F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(131, 29).mirror().addBox(-2.7043F, -1.0684F, -0.5069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.3941F, -2.0516F, -0.0735F, 0.194F, -0.6462F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(117, 22).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5941F, -4.6517F, -0.0536F, 0.0812F, -0.1797F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(121, 35).mirror().addBox(-3.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5941F, -4.6517F, -0.0904F, 0.0718F, -0.6523F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-1.0332F, -0.0107F, -0.2846F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.0059F, -7.7516F, -0.0781F, 0.1655F, 0.0263F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-2.9209F, -0.4792F, -0.3092F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.0059F, -7.7516F, -0.1508F, 0.1357F, -0.4495F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(132, 74).mirror().addBox(-3.2569F, -1.9151F, -0.3092F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.0059F, -7.7516F, -0.1987F, 0.0393F, -0.9842F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(50, 10).addBox(-0.1441F, 0.0998F, -0.8336F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.463F, -2.2538F, -7.8588F, 0.0203F, -0.0062F, 0.7514F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(121, 31).addBox(-0.2F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.1207F, 0.1026F, -7.3652F, 0.4568F, -0.1109F, 0.7492F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(48, 22).addBox(1.8559F, 0.0998F, -0.8336F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.463F, -2.2538F, -7.8588F, 0.0204F, -0.1109F, 0.7492F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(25, 0).addBox(-0.1F, 0.0998F, -0.1079F, 5.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6F, -3.5598F, -7.7848F, 0.0393F, 0.0F, 0.2618F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.3598F, -7.7848F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(48, 112).addBox(0.0F, -2.5559F, -0.0557F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.629F, -2.8619F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(82, 112).addBox(0.0F, -5.2495F, -2.8268F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 78).addBox(-2.5F, 4.4505F, -5.8268F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(57, 74).addBox(-0.5F, -2.9495F, -5.8268F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.3727F, -2.8029F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(113, 108).addBox(0.0F, -2.4095F, 0.1578F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8273F, -8.6029F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(131, 29).addBox(1.7043F, -1.0684F, -0.5069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.3941F, -2.0516F, -0.0735F, -0.194F, 0.6462F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(112, 106).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.3941F, -2.0516F, 0.0179F, -0.1822F, 0.1665F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(121, 35).addBox(1.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.5941F, -4.6517F, -0.0904F, -0.0718F, 0.6523F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(117, 22).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.5941F, -4.6517F, -0.0536F, -0.0812F, 0.1797F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(117, 20).addBox(-1.9668F, -0.0107F, -0.2846F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -0.0059F, -7.7516F, -0.0781F, -0.1655F, -0.0263F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(21, 119).addBox(-0.4232F, -1.1F, -1.0147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.3558F, -0.4259F, -3.9943F, 1.9276F, -0.0295F, 1.0913F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(119, 27).addBox(-0.4232F, -1.533F, -1.1453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3558F, -0.4259F, -3.9943F, 1.3167F, -0.0295F, 1.0913F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(23, 115).addBox(-0.4969F, -0.0351F, -0.524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7558F, -0.5259F, -3.6943F, 1.1633F, -0.1104F, 1.0792F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(60, 121).addBox(-0.4969F, 0.4834F, -1.3649F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.7558F, -0.5259F, -3.6943F, 1.7742F, -0.1104F, 1.0792F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(119, 12).addBox(-0.5F, -0.2936F, -1.0571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.2871F, -0.728F, -1.0817F, 1.5581F, -0.0765F, 1.0879F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(14, 119).addBox(-0.5F, -0.8481F, -0.7175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2871F, -0.728F, -1.0817F, 0.9473F, -0.0765F, 1.0879F));

		PartDefinition cube_r192 = body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(126, 52).addBox(0.9209F, -0.4792F, -0.3092F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -0.0059F, -7.7516F, -0.1508F, -0.1357F, 0.4495F));

		PartDefinition cube_r193 = body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(132, 74).addBox(2.2569F, -1.9151F, -0.3092F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -0.0059F, -7.7516F, -0.1987F, -0.0393F, 0.9842F));

		PartDefinition cube_r194 = body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(102, 97).addBox(-0.5F, -0.9956F, 12.0999F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.5709F, -14.8619F, 0.096F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2857F, -8.4037F, -0.1329F, 0.173F, -0.023F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 46).addBox(-2.5F, 4.3505F, -11.8268F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.002F))
				.texOffs(72, 74).addBox(-0.5F, -2.9495F, -11.8268F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.1F, 5.7F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 122).addBox(0.0F, -2.1747F, -0.1351F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -2.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-0.5F, 0.3F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(118, 73).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-7.5694F, -0.3965F, -2.5692F, 0.3596F, -0.0432F, -0.6982F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(118, 69).mirror().addBox(-0.7F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-7.1402F, -0.3346F, -4.6215F, 0.3665F, -0.0744F, -0.7077F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-4.9967F, 0.0F, -3.0728F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5033F, -3.8539F, -2.6244F, -0.0087F, 0.0F, -0.2618F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-3.8941F, 0.025F, -2.6611F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.3288F, -2.5628F, -2.8425F, 0.0105F, -0.0432F, -0.6982F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(126, 50).mirror().addBox(-4.6249F, -2.8237F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.3916F, -1.9479F, -0.1165F, 0.2417F, -1.1122F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(126, 56).mirror().addBox(-3.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.3916F, -1.9479F, 0.0275F, 0.2665F, -0.5533F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(117, 18).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.3916F, -1.9479F, 0.1408F, 0.2011F, -0.0732F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5916F, -4.9479F, 0.2292F, 0.2127F, -0.1074F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(126, 48).mirror().addBox(-3.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5916F, -4.9479F, 0.1021F, 0.3167F, -0.5842F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-6.6249F, -2.8237F, -0.5069F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5916F, -4.9479F, -0.0817F, 0.3223F, -1.1549F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(117, 18).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.3916F, -1.9479F, 0.1408F, -0.2011F, 0.0732F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(126, 56).addBox(1.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.3916F, -1.9479F, 0.0275F, -0.2665F, 0.5533F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(126, 50).addBox(2.6249F, -2.8237F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.3916F, -1.9479F, -0.1165F, -0.2417F, 1.1122F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.879F, -5.4971F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 38).addBox(-0.0033F, 0.0F, -3.0728F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5033F, -3.8539F, -2.6244F, -0.0087F, 0.0F, 0.2618F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 122).addBox(-0.5F, 0.3F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(118, 73).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.5694F, -0.3965F, -2.5692F, 0.3596F, 0.0432F, 0.6982F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(118, 69).addBox(-0.3F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.1402F, -0.3346F, -4.6215F, 0.3665F, 0.0744F, 0.7077F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 66).addBox(-0.1058F, 0.025F, -2.6611F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.3288F, -2.5628F, -2.8425F, 0.0105F, 0.0432F, 0.6982F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(7, 117).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5916F, -4.9479F, 0.2292F, -0.2127F, 0.1074F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(126, 48).addBox(1.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5916F, -4.9479F, 0.1021F, -0.3167F, 0.5842F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(90, 49).addBox(2.6249F, -2.8237F, -0.5069F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5916F, -4.9479F, -0.0817F, -0.3223F, 1.1549F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 122).addBox(0.0F, -2.2581F, -0.1346F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -5.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8878F, -5.8288F, -0.2493F, 0.0846F, -0.0215F));

		PartDefinition cube_r219 = bodyfront.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(53, 118).mirror().addBox(0.1F, -0.4F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8425F, 1.0848F, -5.68F, 0.0081F, -0.7F, 0.6113F));

		PartDefinition cube_r220 = bodyfront.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(46, 118).mirror().addBox(-0.2F, -0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0055F, 0.144F, -1.6523F, 0.0029F, -0.5692F, 0.6192F));

		PartDefinition cube_r221 = bodyfront.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(129, 76).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8425F, 1.0848F, -5.68F, -0.1228F, -0.7789F, 0.4877F));

		PartDefinition cube_r222 = bodyfront.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-2.0244F, 0.0239F, -4.0735F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(76, 70).mirror().addBox(-4.0244F, 0.0239F, 0.9265F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9597F, -1.4144F, -1.9098F, 0.2028F, 0.0935F, -0.6965F));

		PartDefinition cube_r223 = bodyfront.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(-4.9653F, 0.0869F, -4.9712F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5347F, -2.6644F, -2.1848F, 0.2094F, 0.0F, -0.2793F));

		PartDefinition cube_r224 = bodyfront.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-3.5799F, 0.0239F, -3.8881F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9597F, -1.4144F, -1.9098F, 0.2063F, -0.2057F, -0.7585F));

		PartDefinition cube_r225 = bodyfront.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(101, 34).mirror().addBox(-7.6249F, -2.8237F, -0.5069F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4962F, -1.6192F, 0.0153F, 0.5219F, -1.1324F));

		PartDefinition cube_r226 = bodyfront.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(126, 42).mirror().addBox(-3.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4962F, -1.6192F, 0.3F, 0.4339F, -0.5288F));

		PartDefinition cube_r227 = bodyfront.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4962F, -1.6192F, 0.4518F, 0.2346F, -0.0753F));

		PartDefinition cube_r228 = bodyfront.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-8.6249F, -2.8237F, -0.5069F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8962F, -4.5192F, -0.0256F, 0.4425F, -1.1688F));

		PartDefinition cube_r229 = bodyfront.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(126, 37).mirror().addBox(-3.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8962F, -4.5192F, 0.2186F, 0.3887F, -0.5788F));

		PartDefinition cube_r230 = bodyfront.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(114, 25).mirror().addBox(-2.0031F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8962F, -4.5192F, 0.3625F, 0.2271F, -0.1132F));

		PartDefinition cube_r231 = bodyfront.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(15, 88).addBox(0.0244F, 0.0239F, -4.0735F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(76, 70).addBox(0.0244F, 0.0239F, 0.9265F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.9597F, -1.4144F, -1.9098F, 0.2028F, -0.0935F, 0.6965F));

		PartDefinition cube_r232 = bodyfront.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(53, 118).addBox(-1.1F, -0.4F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8425F, 1.0848F, -5.68F, 0.0081F, 0.7F, -0.6113F));

		PartDefinition cube_r233 = bodyfront.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(46, 118).addBox(-0.8F, -0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0055F, 0.144F, -1.6523F, 0.0029F, 0.5692F, -0.6192F));

		PartDefinition cube_r234 = bodyfront.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(129, 76).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8425F, 1.0848F, -5.68F, -0.1228F, 0.7789F, -0.4877F));

		PartDefinition cube_r235 = bodyfront.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(73, 9).addBox(1.5799F, 0.0239F, -3.8881F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9597F, -1.4144F, -1.9098F, 0.2063F, 0.2057F, 0.7585F));

		PartDefinition cube_r236 = bodyfront.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(48, 46).addBox(-0.0347F, 0.0869F, -4.9712F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5347F, -2.6644F, -2.1848F, 0.2094F, 0.0F, 0.2793F));

		PartDefinition cube_r237 = bodyfront.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(47, 83).addBox(-0.5F, -0.6F, 4.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2313F, -10.3281F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r238 = bodyfront.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(115, 81).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.4962F, -1.6192F, 0.4518F, -0.2346F, 0.0753F));

		PartDefinition cube_r239 = bodyfront.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(126, 42).addBox(1.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.4962F, -1.6192F, 0.3F, -0.4339F, 0.5288F));

		PartDefinition cube_r240 = bodyfront.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(101, 34).addBox(2.6249F, -2.8237F, -0.5069F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.4962F, -1.6192F, 0.0153F, -0.5219F, 1.1324F));

		PartDefinition cube_r241 = bodyfront.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(114, 25).addBox(-0.9969F, -0.1796F, -0.4603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.8962F, -4.5192F, 0.3625F, -0.2271F, 0.1132F));

		PartDefinition cube_r242 = bodyfront.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(126, 37).addBox(1.7043F, -1.0684F, -0.5069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.8962F, -4.5192F, 0.2186F, -0.3887F, 0.5788F));

		PartDefinition cube_r243 = bodyfront.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 17).addBox(2.6249F, -2.8237F, -0.5069F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.8962F, -4.5192F, -0.0256F, -0.4425F, 1.1688F));

		PartDefinition cube_r244 = bodyfront.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 3.8518F, -17.2453F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 74).addBox(-0.5F, -3.4482F, -17.4453F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1374F, 11.8467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r245 = bodyfront.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(14, 123).addBox(0.0F, -1.5136F, -3.4412F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 122).addBox(0.0F, -1.7136F, -0.4412F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5506F, -2.4261F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body4 = bodyfront.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9494F, -5.6261F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.7861F, 0.4087F, -1.4778F, 0.0294F, -0.5964F, -0.0247F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(71, 113).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3469F, 0.3219F, -3.1269F, -0.1265F, -0.8241F, 0.2205F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.4819F, 0.282F, -4.8648F, -0.122F, -0.7894F, 0.2142F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(101, 49).mirror().addBox(-0.8F, -0.5F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1055F, -0.5846F, -1.7125F, 0.1834F, 0.044F, -0.5721F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-1.6952F, 0.0003F, -2.6332F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.55F, -1.0533F, -3.9871F, 0.1978F, -0.3846F, -0.6554F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-3.0F, 0.0711F, -2.6309F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3533F, -3.9871F, 0.1222F, 0.0F, -0.2967F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-1.7212F, 0.0003F, 0.3335F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.55F, -1.0533F, -3.9871F, 0.1946F, -0.3418F, -0.6463F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-1.0425F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4468F, -5.493F, 0.2381F, 0.2138F, -0.2452F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(-2.9702F, -0.4009F, -0.3472F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4468F, -5.493F, 0.1096F, 0.3216F, -0.7215F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(101, 36).mirror().addBox(-7.3394F, -1.8734F, -0.3472F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4468F, -5.493F, -0.0781F, 0.3304F, -1.2934F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-2.0124F, -0.0873F, -0.4976F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3468F, -3.493F, 0.2381F, 0.2138F, -0.2801F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(126, 44).mirror().addBox(-3.7535F, -0.9902F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3468F, -3.493F, 0.1096F, 0.3216F, -0.7564F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(71, 30).mirror().addBox(-8.7074F, -2.782F, -0.5449F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3468F, -3.493F, -0.0781F, 0.3304F, -1.3283F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-2.0124F, -0.0873F, -0.4976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2468F, -1.493F, 0.2736F, 0.2179F, -0.2201F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(119, 16).mirror().addBox(-3.7535F, -0.9902F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2468F, -1.493F, 0.1402F, 0.3412F, -0.6941F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-8.7074F, -2.782F, -0.5449F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2468F, -1.493F, -0.0636F, 0.3625F, -1.271F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(101, 49).addBox(-1.2F, -0.5F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.1055F, -0.5846F, -1.7125F, 0.1834F, -0.044F, 0.5721F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(30, 90).addBox(-0.2788F, 0.0003F, 0.3335F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.55F, -1.0533F, -3.9871F, 0.1946F, 0.3418F, 0.6463F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(101, 29).addBox(-0.3048F, 0.0003F, -2.6332F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.55F, -1.0533F, -3.9871F, 0.1978F, 0.3846F, 0.6554F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 66).addBox(0.0F, 0.0711F, -2.6309F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3533F, -3.9871F, 0.1222F, 0.0F, 0.2967F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(77, 83).addBox(-0.5F, -1.2F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1367F, -3.4658F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r267 = body4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(109, 132).addBox(0.0F, -1.464F, -0.058F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r268 = body4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(132, 93).addBox(0.0F, -1.2341F, -0.1869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r269 = body4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(101, 36).addBox(2.3394F, -1.8734F, -0.3472F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4468F, -5.493F, -0.0781F, -0.3304F, 1.2934F));

		PartDefinition cube_r270 = body4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(126, 46).addBox(0.9701F, -0.4009F, -0.3472F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4468F, -5.493F, 0.1096F, -0.3216F, 0.7215F));

		PartDefinition cube_r271 = body4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(19, 56).addBox(0.0426F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4468F, -5.493F, 0.2381F, -0.2138F, 0.2452F));

		PartDefinition cube_r272 = body4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(71, 30).addBox(2.7074F, -2.782F, -0.5449F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3468F, -3.493F, -0.0781F, -0.3304F, 1.3283F));

		PartDefinition cube_r273 = body4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(126, 44).addBox(1.7535F, -0.9902F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3468F, -3.493F, 0.1096F, -0.3216F, 0.7564F));

		PartDefinition cube_r274 = body4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 64).addBox(0.0124F, -0.0873F, -0.4976F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3468F, -3.493F, 0.2381F, -0.2138F, 0.2801F));

		PartDefinition cube_r275 = body4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(92, 89).addBox(-0.9876F, -0.0873F, -0.4976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2468F, -1.493F, 0.2736F, -0.2179F, 0.2201F));

		PartDefinition cube_r276 = body4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(119, 16).addBox(1.7535F, -0.9902F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2468F, -1.493F, 0.1402F, -0.3412F, 0.6941F));

		PartDefinition cube_r277 = body4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(73, 19).addBox(2.7074F, -2.782F, -0.5449F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2468F, -1.493F, -0.0636F, -0.3625F, 1.271F));

		PartDefinition cube_r278 = body4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(30, 133).addBox(0.0F, -1.4622F, 0.2331F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r279 = body4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5F, -1.0087F, -1.9996F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5194F, -4.9019F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r280 = body4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 129).addBox(-0.6F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.7861F, 0.4087F, -1.4778F, 0.0294F, 0.5964F, 0.0247F));

		PartDefinition cube_r281 = body4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(71, 113).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3469F, 0.3219F, -3.1269F, -0.1265F, 0.8241F, -0.2205F));

		PartDefinition cube_r282 = body4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 118).addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.4819F, 0.282F, -4.8648F, -0.122F, 0.7894F, -0.2142F));

		PartDefinition bone5 = body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3046F, 4.8709F, -5.7633F, 0.0F, 0.3054F, 0.0F));

		PartDefinition Bodyfront_r1 = bone5.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(103, 6).addBox(0.865F, -2.4874F, -3.2103F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3375F, 0.3189F, 0.9223F));

		PartDefinition Bodyfront_r2 = bone5.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(64, 117).addBox(-1.0948F, -0.7992F, -0.4684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(103, 0).addBox(-1.0948F, -2.1075F, -0.993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.368F, -3.5323F, 1.805F, 0.8043F, -0.0691F, -0.5244F));

		PartDefinition Bodyfront_r3 = bone5.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(131, 18).addBox(-1.0948F, 0.0308F, 2.6621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.368F, -3.5323F, 1.805F, 1.0225F, -0.0691F, -0.5244F));

		PartDefinition Bodyfront_r4 = bone5.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(126, 99).addBox(-1.0948F, 0.2284F, 1.8908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.368F, -3.5323F, 1.805F, 1.677F, -0.0691F, -0.5244F));

		PartDefinition Bodyfront_r5 = bone5.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(62, 128).addBox(-1.0948F, -0.2324F, 2.7429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(24, 127).addBox(-1.0948F, -0.2324F, 2.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.368F, -3.5323F, 1.805F, 0.7607F, -0.0691F, -0.5244F));

		PartDefinition Bodyfront_r6 = bone5.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(74, 122).addBox(-1.0948F, -1.8837F, 0.3999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.368F, -3.5323F, 1.805F, 0.1062F, -0.0691F, -0.5244F));

		PartDefinition Bodyfront_r7 = bone5.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(73, 126).addBox(-0.5F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.6438F, -0.6852F, 0.3737F, 1.5635F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r8 = bone5.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(112, 45).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5316F, 0.1375F, 0.3058F, 0.6036F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r9 = bone5.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(69, 91).addBox(-0.5F, -2.5F, -3.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8007F, -0.9823F, -1.8211F, 2.7852F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r10 = bone5.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8007F, -0.9823F, -1.8211F, 1.9998F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r11 = bone5.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(120, 120).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.771F, -1.8272F, 1.0138F, 1.2144F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r12 = bone5.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(120, 116).addBox(-1.0F, -1.0977F, 0.5773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.1708F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r13 = bone5.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(71, 117).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1044F, -3.9107F, 0.2462F, 1.6508F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r14 = bone5.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(117, 39).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.898F, -2.8848F, 1.4315F, 1.0835F, 0.0518F, -0.1398F));

		PartDefinition leftFrontLeg = bone5.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2558F, 1.9738F, 0.7697F, -0.313F, 0.314F, -0.139F));

		PartDefinition cube_r283 = leftFrontLeg.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(32, 111).addBox(-0.326F, 0.1969F, -1.0648F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 18).addBox(-0.326F, 2.1969F, -0.3649F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4059F, -0.7694F, -0.4768F, 1.1862F, 0.0981F, 0.1095F));

		PartDefinition LeftFjoint = leftFrontLeg.addOrReplaceChild("LeftFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5763F, 2.3337F, 6.024F, 0.3875F, 0.1967F, 0.2105F));

		PartDefinition cube_r284 = LeftFjoint.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(82, 104).addBox(-1.0F, 2.5F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 103).addBox(-1.0F, 1.0F, 0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0892F, -2.5467F, -0.1933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftFFoot = LeftFjoint.addOrReplaceChild("LeftFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1061F, 5.3474F, -0.8675F, 0.3904F, -0.8975F, 0.0298F));

		PartDefinition cube_r285 = LeftFFoot.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(88, 17).addBox(-1.5F, 0.7828F, -2.8345F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3955F, -1.2658F, -0.2774F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone3 = body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3046F, 4.8709F, -5.7633F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Bodyfront_r15 = bone3.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(33, 103).addBox(-1.865F, -2.4874F, -3.2103F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3375F, -0.3189F, -0.9223F));

		PartDefinition Bodyfront_r16 = bone3.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(119, 47).addBox(0.0948F, -0.7992F, -0.4684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(103, 20).addBox(0.0948F, -2.1075F, -0.993F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.368F, -3.5323F, 1.805F, 0.8043F, 0.0691F, 0.5244F));

		PartDefinition Bodyfront_r17 = bone3.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(131, 26).addBox(0.0948F, 0.0308F, 2.6621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.368F, -3.5323F, 1.805F, 1.0225F, 0.0691F, 0.5244F));

		PartDefinition Bodyfront_r18 = bone3.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(105, 126).addBox(0.0948F, 0.2284F, 1.8908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.368F, -3.5323F, 1.805F, 1.677F, 0.0691F, 0.5244F));

		PartDefinition Bodyfront_r19 = bone3.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(5, 130).addBox(0.0948F, -0.2324F, 2.7429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(54, 127).addBox(0.0948F, -0.2324F, 2.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.368F, -3.5323F, 1.805F, 0.7607F, 0.0691F, 0.5244F));

		PartDefinition Bodyfront_r20 = bone3.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(122, 77).addBox(0.0948F, -1.8837F, 0.3999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.368F, -3.5323F, 1.805F, 0.1062F, 0.0691F, 0.5244F));

		PartDefinition Bodyfront_r21 = bone3.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(78, 126).addBox(-0.5F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.6438F, -0.6852F, 0.3737F, 1.5635F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r22 = bone3.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(112, 50).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5316F, 0.1375F, 0.3058F, 0.6036F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r23 = bone3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(80, 91).addBox(-0.5F, -2.5F, -3.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.8007F, -0.9823F, -1.8211F, 2.7852F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r24 = bone3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(112, 28).addBox(-0.5F, -0.8F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8007F, -0.9823F, -1.8211F, 1.9998F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r25 = bone3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(121, 103).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.771F, -1.8272F, 1.0138F, 1.2144F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r26 = bone3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(67, 121).addBox(0.0F, -1.0977F, 0.5773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.2F, -0.2F, 1.1708F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r27 = bone3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(119, 43).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1044F, -3.9107F, 0.2462F, 1.6508F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r28 = bone3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(37, 119).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.898F, -2.8848F, 1.4315F, 1.0835F, -0.0518F, 0.1398F));

		PartDefinition rightFrontLeg = bone3.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2558F, 1.9738F, 0.7697F, -1.3297F, -0.3003F, 0.1825F));

		PartDefinition cube_r286 = rightFrontLeg.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(111, 96).addBox(-0.674F, 0.1969F, -1.0648F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 38).addBox(-0.674F, 2.1969F, -0.3649F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4059F, -0.7694F, -0.4768F, 1.1862F, -0.0981F, -0.1095F));

		PartDefinition RightFjoint = rightFrontLeg.addOrReplaceChild("RightFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5763F, 2.3337F, 6.024F, -0.1279F, -0.1023F, 0.758F));

		PartDefinition cube_r287 = RightFjoint.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(27, 107).addBox(0.0F, 2.5F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(103, 78).addBox(0.0F, 1.0F, 0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0892F, -2.5467F, -0.1933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightFFoot = RightFjoint.addOrReplaceChild("RightFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1061F, 5.3474F, -0.8675F, 2.7466F, 0.8975F, -0.0298F));

		PartDefinition cube_r288 = RightFFoot.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(88, 23).addBox(-1.5F, 0.7828F, -2.8345F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3955F, -1.2658F, -0.2774F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, -0.5827F, -3.9011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(91, 97).addBox(-0.5F, -2.1835F, -2.8836F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2556F, -7.0012F, 0.1944F, 0.1736F, 0.0186F));

		PartDefinition cube_r289 = neck.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(125, 87).mirror().addBox(-5.0901F, -0.645F, -6.724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.4476F, 1.0151F, 0.1247F));

		PartDefinition cube_r290 = neck.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(125, 96).mirror().addBox(-5.8873F, -0.3801F, -2.5415F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.1982F, 0.1803F, 0.5284F));

		PartDefinition cube_r291 = neck.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(125, 93).mirror().addBox(-4.7306F, -0.3801F, -4.3668F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.2253F, 0.5217F, 0.4506F));

		PartDefinition cube_r292 = neck.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-4.712F, -0.3801F, -1.7105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(126, 0).mirror().addBox(-4.712F, -0.3801F, -1.3105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(109, 92).mirror().addBox(-3.187F, -0.3801F, -2.3355F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.1957F, -0.0851F, 0.5812F));

		PartDefinition cube_r293 = neck.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-4.3702F, -0.3801F, -2.9299F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.1966F, 0.1289F, 0.5388F));

		PartDefinition cube_r294 = neck.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(88, 123).mirror().addBox(-3.2479F, -0.4102F, -0.1881F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.2527F, -0.4949F, 0.6502F));

		PartDefinition cube_r295 = neck.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(125, 70).mirror().addBox(-6.1399F, -0.5394F, -4.1882F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.2564F, 0.5199F, 0.3987F));

		PartDefinition cube_r296 = neck.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(125, 73).mirror().addBox(-5.3266F, -0.645F, -5.4458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.3115F, 0.7305F, 0.3004F));

		PartDefinition cube_r297 = neck.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(110, 6).mirror().addBox(-1.7877F, -0.4102F, -2.0067F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.2324F, -0.3F, 0.598F));

		PartDefinition cube_r298 = neck.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(109, 69).mirror().addBox(-1.5793F, -0.4102F, -0.6898F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7613F, -0.3256F, 0.9323F, -0.332F, -0.8297F, 0.7772F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(124, 39).mirror().addBox(-1.7389F, -0.3973F, -0.035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.4342F, -0.7117F, -1.9983F, -0.2713F, -0.3473F, 0.4055F));

		PartDefinition cube_r300 = neck.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(81, 123).mirror().addBox(-1.6386F, -0.3973F, 0.5193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4342F, -0.7117F, -1.9983F, -0.3013F, -0.5567F, 0.4738F));

		PartDefinition cube_r301 = neck.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(26, 124).mirror().addBox(-1.839F, -0.3973F, -0.8374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.4342F, -0.7117F, -1.9983F, -0.2548F, 0.0153F, 0.3071F));

		PartDefinition cube_r302 = neck.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(16, 112).mirror().addBox(-4.0819F, -0.3973F, -0.813F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.4342F, -0.7117F, -1.9983F, -0.2551F, -0.0522F, 0.3247F));

		PartDefinition cube_r303 = neck.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(110, 10).mirror().addBox(-3.7858F, -0.3973F, 0.2881F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4342F, -0.7117F, -1.9983F, -0.2717F, -0.3515F, 0.4067F));

		PartDefinition cube_r304 = neck.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(117, 83).mirror().addBox(0.8158F, 0.1317F, -1.4146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7524F, -0.5577F, -0.082F, -0.0126F, -0.053F, -0.5878F));

		PartDefinition cube_r305 = neck.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(0.0947F, 0.1317F, -3.8382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7524F, -0.5577F, -0.082F, -0.0142F, -0.4892F, -0.5818F));

		PartDefinition cube_r306 = neck.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(90, 43).mirror().addBox(-2.0F, 0.0992F, 0.0174F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2827F, -2.9011F, 0.0F, 0.0F, -0.4014F));

		PartDefinition cube_r307 = neck.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(103, 87).mirror().addBox(-1.0426F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0228F, -2.7902F, 0.5086F, 0.3733F, -0.5519F));

		PartDefinition cube_r308 = neck.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(117, 37).mirror().addBox(-3.9702F, -0.4009F, -0.3472F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0228F, -2.7902F, 0.2842F, 0.5821F, -1.0301F));

		PartDefinition cube_r309 = neck.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-1.0426F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0228F, -0.7902F, 0.3245F, 0.258F, -0.6093F));

		PartDefinition cube_r310 = neck.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-4.9702F, -0.4009F, -0.3472F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0228F, -0.7902F, 0.1678F, 0.3994F, -1.0853F));

		PartDefinition cube_r311 = neck.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(88, 123).addBox(1.2479F, -0.4102F, -0.1881F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.2527F, 0.4949F, -0.6502F));

		PartDefinition cube_r312 = neck.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(109, 69).addBox(-0.4207F, -0.4102F, -0.6898F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.332F, 0.8297F, -0.7772F));

		PartDefinition cube_r313 = neck.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(126, 3).addBox(2.712F, -0.3801F, -1.7105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(126, 0).addBox(2.712F, -0.3801F, -1.3105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F))
				.texOffs(109, 92).addBox(1.187F, -0.3801F, -2.3355F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.1957F, 0.0851F, -0.5812F));

		PartDefinition cube_r314 = neck.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(125, 96).addBox(3.8873F, -0.3801F, -2.5415F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.1982F, -0.1803F, -0.5284F));

		PartDefinition cube_r315 = neck.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(125, 93).addBox(2.7306F, -0.3801F, -4.3668F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.2253F, -0.5217F, -0.4506F));

		PartDefinition cube_r316 = neck.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 126).addBox(2.3702F, -0.3801F, -2.9299F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.1966F, -0.1289F, -0.5388F));

		PartDefinition cube_r317 = neck.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(110, 6).addBox(-0.2123F, -0.4102F, -2.0067F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.2324F, 0.3F, -0.598F));

		PartDefinition cube_r318 = neck.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(125, 87).addBox(3.0901F, -0.645F, -6.724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.4476F, -1.0151F, -0.1247F));

		PartDefinition cube_r319 = neck.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(125, 73).addBox(3.3266F, -0.645F, -5.4458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.3115F, -0.7305F, -0.3004F));

		PartDefinition cube_r320 = neck.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(125, 70).addBox(4.1399F, -0.5394F, -4.1882F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.7613F, -0.3256F, 0.9323F, -0.2564F, -0.5199F, -0.3987F));

		PartDefinition cube_r321 = neck.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(110, 10).addBox(0.7859F, -0.3973F, 0.2881F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4342F, -0.7117F, -1.9983F, -0.2717F, 0.3515F, -0.4067F));

		PartDefinition cube_r322 = neck.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(16, 112).addBox(1.0819F, -0.3973F, -0.813F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.4342F, -0.7117F, -1.9983F, -0.2551F, 0.0522F, -0.3247F));

		PartDefinition cube_r323 = neck.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(26, 124).addBox(-0.161F, -0.3973F, -0.8374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.4342F, -0.7117F, -1.9983F, -0.2548F, -0.0153F, -0.3071F));

		PartDefinition cube_r324 = neck.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(124, 39).addBox(-0.2611F, -0.3973F, -0.035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.4342F, -0.7117F, -1.9983F, -0.2713F, 0.3473F, -0.4055F));

		PartDefinition cube_r325 = neck.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 123).addBox(-0.3614F, -0.3973F, 0.5193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4342F, -0.7117F, -1.9983F, -0.3013F, 0.5567F, -0.4738F));

		PartDefinition cube_r326 = neck.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(132, 112).addBox(0.0F, -1.8F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 132).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0173F, -0.9011F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r327 = neck.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(117, 37).addBox(0.9702F, -0.4009F, -0.3472F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0228F, -2.7902F, 0.2842F, -0.5821F, 1.0301F));

		PartDefinition cube_r328 = neck.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(103, 87).addBox(0.0425F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0228F, -2.7902F, 0.5086F, -0.3733F, 0.5519F));

		PartDefinition cube_r329 = neck.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(15, 74).addBox(0.0425F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0228F, -0.7902F, 0.3245F, -0.258F, 0.6093F));

		PartDefinition cube_r330 = neck.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(103, 26).addBox(0.9702F, -0.4009F, -0.3472F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0228F, -0.7902F, 0.1678F, -0.3994F, 1.0853F));

		PartDefinition cube_r331 = neck.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(117, 83).addBox(-1.8158F, 0.1317F, -1.4146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7524F, -0.5577F, -0.082F, -0.0126F, 0.053F, 0.5878F));

		PartDefinition cube_r332 = neck.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(35, 97).addBox(-1.0947F, 0.1317F, -3.8382F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7524F, -0.5577F, -0.082F, -0.0142F, 0.4892F, 0.5818F));

		PartDefinition cube_r333 = neck.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(90, 43).addBox(0.0F, 0.0992F, 0.0174F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2827F, -2.9011F, 0.0F, 0.0F, 0.4014F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(56, 96).addBox(-0.5F, -0.3905F, -3.8866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2445F, -3.8519F, -0.0026F, 0.1384F, -0.1103F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(36, 133).addBox(0.0F, -1.3F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 132).addBox(0.0F, -1.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3905F, 0.1134F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(120, 63).mirror().addBox(-1.2264F, -0.0327F, -1.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5486F, -1.5897F, -3.4704F, 0.2531F, -0.3715F, -0.5423F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(120, 59).mirror().addBox(-0.9514F, -0.0327F, -1.7704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5486F, -1.5897F, -3.4704F, 0.2372F, -0.1174F, -0.4769F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(128, 103).mirror().addBox(0.2016F, 0.0505F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.2428F, -1.5084F, 0.154F, 0.5344F, -0.0025F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(127, 124).mirror().addBox(-0.6723F, 0.0505F, -1.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.2428F, -1.5084F, 0.1512F, -0.5027F, -0.1547F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(130, 127).mirror().addBox(-1.7048F, -0.0451F, 1.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1103F, -0.3777F, 0.0156F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(125, 90).mirror().addBox(-2.8307F, -0.0451F, 0.9024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1038F, -0.1608F, 0.0398F));

		PartDefinition cube_r341 = neck2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(35, 123).mirror().addBox(-1.77F, -0.0451F, 0.7799F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1025F, -0.0306F, 0.0533F));

		PartDefinition cube_r342 = neck2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(-0.8784F, -0.0451F, 1.3051F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1174F, -0.5078F, -0.0008F));

		PartDefinition cube_r343 = neck2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(67, 128).mirror().addBox(-0.5642F, -0.0436F, -0.3641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1441F, -0.4606F, -0.1419F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(19, 123).mirror().addBox(-1.5652F, -0.0436F, -0.6893F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1297F, 0.1017F, -0.0643F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(67, 98).mirror().addBox(0.6995F, 0.0053F, -1.8146F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1137F, 0.0413F, -0.3978F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.022F, 0.0053F, -1.8913F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0486F, -1.2428F, -1.5084F, 0.1141F, -0.0887F, -0.4127F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(132, 97).mirror().addBox(-1.9701F, -0.4009F, -0.3472F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1673F, -2.7382F, 0.0528F, 1.0799F, -1.5213F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(131, 21).mirror().addBox(-1.0426F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1673F, -2.7382F, 0.7064F, 0.8684F, -0.7474F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(120, 67).mirror().addBox(-1.0426F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2673F, -0.7382F, 0.5977F, 0.6626F, -0.5485F));

		PartDefinition cube_r350 = neck2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(126, 54).mirror().addBox(-2.9701F, -0.4009F, -0.3472F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2673F, -0.7382F, 0.1761F, 0.8706F, -1.144F));

		PartDefinition cube_r351 = neck2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(131, 21).addBox(0.0425F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1673F, -2.7382F, 0.7064F, -0.8684F, 0.7474F));

		PartDefinition cube_r352 = neck2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(132, 97).addBox(0.9702F, -0.4009F, -0.3472F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1673F, -2.7382F, 0.0528F, -1.0799F, 1.5213F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(126, 54).addBox(0.9702F, -0.4009F, -0.3472F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2673F, -0.7382F, 0.1761F, -0.8706F, 1.144F));

		PartDefinition cube_r354 = neck2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(23, 26).addBox(-1.5486F, -1.2455F, -0.8508F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r355 = neck2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(130, 127).addBox(0.7048F, -0.0451F, 1.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1103F, 0.3777F, -0.0156F));

		PartDefinition cube_r356 = neck2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(125, 90).addBox(0.8308F, -0.0451F, 0.9024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1038F, 0.1608F, -0.0398F));

		PartDefinition cube_r357 = neck2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(123, 24).addBox(-1.1216F, -0.0451F, 1.3051F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1174F, 0.5078F, 0.0008F));

		PartDefinition cube_r358 = neck2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(35, 123).addBox(-0.23F, -0.0451F, 0.7799F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1025F, 0.0306F, -0.0533F));

		PartDefinition cube_r359 = neck2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(127, 124).addBox(-0.3277F, 0.0505F, -1.5196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.8986F, -1.2428F, -1.5084F, 0.1512F, 0.5027F, 0.1547F));

		PartDefinition cube_r360 = neck2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(128, 103).addBox(-1.2016F, 0.0505F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8986F, -1.2428F, -1.5084F, 0.154F, -0.5344F, 0.0025F));

		PartDefinition cube_r361 = neck2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(67, 128).addBox(-0.4358F, -0.0436F, -0.3641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1441F, 0.4606F, 0.1419F));

		PartDefinition cube_r362 = neck2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(19, 123).addBox(-0.4347F, -0.0436F, -0.6893F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1297F, -0.1017F, 0.0643F));

		PartDefinition cube_r363 = neck2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 97).addBox(-0.978F, 0.0053F, -1.8913F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1141F, 0.0887F, 0.4127F));

		PartDefinition cube_r364 = neck2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(67, 98).addBox(-1.6995F, 0.0053F, -1.8146F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1137F, -0.0413F, 0.3978F));

		PartDefinition cube_r365 = neck2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(120, 63).addBox(0.2264F, -0.0327F, -1.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5486F, -1.5897F, -3.4704F, 0.2531F, 0.3715F, 0.5423F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(120, 59).addBox(-0.0486F, -0.0327F, -1.7704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5486F, -1.5897F, -3.4704F, 0.2372F, 0.1174F, 0.4769F));

		PartDefinition cube_r367 = neck2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(28, 120).addBox(-2.5486F, -0.0327F, -1.9704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0486F, -1.5897F, -3.4704F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r368 = neck2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(13, 95).addBox(-2.5486F, -0.6327F, -1.8704F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0486F, -1.2428F, -1.5084F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r369 = neck2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(120, 67).addBox(0.0425F, 0.0816F, -0.3219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2673F, -0.7382F, 0.5977F, -0.6626F, 0.5485F));

		PartDefinition cube_r370 = neck2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(119, 99).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3905F, -3.8866F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2423F, -3.2833F, 0.4193F, 0.1256F, 0.0371F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(109, 73).addBox(-1.0F, -0.275F, -1.725F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.04F, -9.1484F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(131, 15).mirror().addBox(-2.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(131, 15).addBox(-0.2F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.85F, 0.6038F, -3.8344F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(131, 39).mirror().addBox(-2.5F, -0.125F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 132).mirror().addBox(-2.7F, 0.075F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(131, 99).mirror().addBox(-2.55F, 0.075F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(0, 132).addBox(0.0F, 0.075F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(131, 99).addBox(-0.15F, 0.075F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F))
				.texOffs(131, 39).addBox(-0.2F, -0.125F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.85F, -0.0205F, -3.3435F, -1.6101F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(37, 130).mirror().addBox(-2.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(37, 130).addBox(-0.2F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.85F, -0.2974F, -4.4219F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(32, 130).mirror().addBox(-2.5F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(32, 130).addBox(-0.2F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.85F, 0.0231F, -3.9605F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(131, 82).mirror().addBox(-0.675F, -0.8799F, -0.3944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 1.303F, -3.4051F, -2.327F, -0.0359F, 0.4331F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(83, 126).mirror().addBox(-0.325F, -0.8387F, 0.1163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 1.303F, -3.4051F, -0.1061F, -0.0359F, 0.4331F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(126, 11).mirror().addBox(-0.325F, -0.9619F, -0.5102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 1.303F, -3.4051F, -0.4551F, -0.0359F, 0.4331F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-0.325F, -0.8565F, -1.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 1.303F, -3.4051F, -0.7606F, -0.0359F, 0.4331F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(43, 128).mirror().addBox(-0.3F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(128, 34).mirror().addBox(-0.3F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0253F, -5.6006F, 0.3155F, -0.2494F, -0.0804F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(38, 126).mirror().addBox(-0.475F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 126).addBox(0.775F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.65F, 0.3322F, -6.0509F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(54, 130).mirror().addBox(-0.25F, -0.4815F, -0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.3F, -9.775F, -0.0436F, -0.2618F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(92, 119).mirror().addBox(-0.25F, -0.439F, 0.2242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.3F, -9.775F, 0.0436F, -0.2618F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(119, 51).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0249F, -8.0898F, 0.4152F, -0.3215F, -0.1384F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 119).mirror().addBox(-1.2F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 119).addBox(0.2F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6039F, -7.0735F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(119, 55).mirror().addBox(-1.0F, -0.325F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(119, 55).addBox(0.0F, -0.325F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -0.2149F, -7.9649F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(109, 88).addBox(-1.5F, -0.275F, -0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.5015F, -7.8266F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 109).addBox(-1.0F, -0.275F, -1.725F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -0.5015F, -7.8266F, 0.336F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(130, 23).addBox(-1.0F, -0.75F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 125).addBox(-1.5F, -0.75F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.5F, 1.2863F, -10.9379F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(125, 67).addBox(-1.0F, -0.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(59, 125).addBox(-1.0F, -0.2F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(120, 124).addBox(-1.0F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, 0.9338F, -10.4809F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(95, 124).addBox(-1.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.2901F, -10.4257F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(22, 130).addBox(-1.0F, -0.75F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(17, 130).addBox(-1.0F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 1.59F, -9.2877F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(54, 130).addBox(-0.75F, -0.4815F, -0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.25F, 1.3F, -9.775F, -0.0436F, 0.2618F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(92, 119).addBox(-0.75F, -0.439F, 0.2242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.25F, 1.3F, -9.775F, 0.0436F, 0.2618F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(119, 51).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 1.0249F, -8.0898F, 0.4152F, 0.3215F, 0.1384F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(101, 116).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.3F, -8.95F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 109).addBox(-1.5F, 0.0465F, 0.0457F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -0.9324F, -5.4241F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(64, 109).addBox(-1.0F, 0.1465F, -0.7543F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4381F, -6.5221F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(108, 84).addBox(-1.0F, -0.9F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.4946F, -6.9846F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 84).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(95, 135).addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 135).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 81).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.0F, 1.7428F, -6.2132F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(95, 135).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7428F, -6.2132F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(43, 128).addBox(-0.7F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(128, 34).addBox(-0.7F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.0F, 1.0253F, -5.6006F, 0.3155F, 0.2494F, 0.0804F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(126, 15).addBox(-0.675F, -0.8565F, -1.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.25F, 1.303F, -3.4051F, -0.7606F, 0.0359F, -0.4331F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(126, 11).addBox(-0.675F, -0.9619F, -0.5102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.25F, 1.303F, -3.4051F, -0.4551F, 0.0359F, -0.4331F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(22, 102).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.2528F, -3.6916F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(131, 82).addBox(-0.325F, -0.8799F, -0.3944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.25F, 1.303F, -3.4051F, -2.327F, 0.0359F, -0.4331F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(40, 112).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.2528F, -3.6916F, -1.8934F, 0.1006F, -0.013F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(131, 79).mirror().addBox(-0.5625F, -0.2874F, -0.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 131).mirror().addBox(-0.5625F, -0.2874F, -0.7828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.7375F, -0.1727F, -2.3212F, -1.5512F, 0.1426F, 0.5464F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-0.4375F, -0.8062F, -0.9897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.7375F, -0.1727F, -2.3212F, -0.7702F, 0.1426F, 0.5464F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(62, 131).mirror().addBox(-0.5625F, -0.6019F, -0.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(67, 131).mirror().addBox(-0.5625F, -0.6019F, -0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7375F, -0.1727F, -2.3212F, -2.293F, 0.1426F, 0.5464F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(67, 131).addBox(-0.4375F, -0.6019F, -0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(62, 131).addBox(-0.4375F, -0.6019F, -0.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7375F, -0.1727F, -2.3212F, -2.293F, -0.1426F, -0.5464F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(131, 79).addBox(-0.4375F, -0.2874F, -0.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 131).addBox(-0.4375F, -0.2874F, -0.7828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.7375F, -0.1727F, -2.3212F, -1.5512F, -0.1426F, -0.5464F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(40, 112).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, -1.2528F, -3.6916F, -1.8934F, -0.1006F, 0.013F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(39, 112).addBox(-0.5F, -0.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -1.0492F, -2.9115F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(102, 54).addBox(-0.5625F, -0.8062F, -0.9897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.7375F, -0.1727F, -2.3212F, -0.7702F, -0.1426F, -0.5464F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(102, 54).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.628F, -1.7815F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(83, 126).addBox(-0.675F, -0.8387F, 0.1163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.25F, 1.303F, -3.4051F, -0.1061F, 0.0359F, -0.4331F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.536F, -3.1767F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(7, 123).mirror().addBox(-0.5F, -0.2395F, -0.6914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(120, 112).mirror().addBox(-0.5F, 2.6292F, -5.2522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.6545F, -0.1571F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(82, 130).mirror().addBox(-0.5F, -0.3781F, -1.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 130).mirror().addBox(-0.5F, -0.3781F, -1.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.3578F, -0.1571F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(101, 130).mirror().addBox(-0.5F, -1.8345F, -2.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, 0.384F, -0.1571F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(72, 130).mirror().addBox(-0.5F, -0.6656F, -2.4361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.1833F, -0.1571F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(113, 65).mirror().addBox(-0.5F, 0.0091F, -2.0167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(64, 113).mirror().addBox(-0.5F, 0.2091F, -2.0167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.2269F, -0.1571F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(96, 130).mirror().addBox(-0.5F, -0.5876F, -2.6538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(91, 130).mirror().addBox(-0.5F, -0.0876F, -2.7538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.0698F, -0.1571F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(120, 130).mirror().addBox(-0.5F, -1.2467F, -4.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(133, 135).mirror().addBox(-0.5F, -1.6467F, -4.6128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(130, 109).mirror().addBox(-0.5F, -1.2467F, -4.7128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, 0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(133, 135).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4301F, -0.4095F, -4.6311F, -0.0436F, -0.1571F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(130, 106).mirror().addBox(-0.5F, -0.6808F, -3.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.0436F, -0.1571F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(73, 104).mirror().addBox(-0.5F, 0.7542F, -7.2455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.3054F, -0.1571F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(125, 130).mirror().addBox(-0.5F, 1.0605F, -4.6342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.2618F, -0.1571F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(99, 120).mirror().addBox(-0.5F, -0.7201F, -4.3976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, 0.1745F, -0.1571F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(30, 116).mirror().addBox(-0.5F, 0.1989F, -0.3732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0992F, 0.2296F, -0.1745F, -0.1571F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(7, 123).addBox(-0.5F, -0.2395F, -0.6914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(120, 112).addBox(-0.5F, 2.6292F, -5.2522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.6545F, 0.1571F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(82, 130).addBox(-0.5F, -0.3781F, -1.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 130).addBox(-0.5F, -0.3781F, -1.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.3578F, 0.1571F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(101, 130).addBox(-0.5F, -1.8345F, -2.524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, 0.384F, 0.1571F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(72, 130).addBox(-0.5F, -0.6656F, -2.4361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.1833F, 0.1571F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(113, 65).addBox(-0.5F, 0.0091F, -2.0167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(64, 113).addBox(-0.5F, 0.2091F, -2.0167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(96, 130).addBox(-0.5F, -0.5876F, -2.6538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(91, 130).addBox(-0.5F, -0.0876F, -2.7538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.0698F, 0.1571F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(120, 130).addBox(-0.5F, -1.2467F, -4.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(133, 135).addBox(-0.5F, -1.6467F, -4.6128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(130, 109).addBox(-0.5F, -1.2467F, -4.7128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, 0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(133, 135).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4301F, -0.4095F, -4.6311F, -0.0436F, 0.1571F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(130, 106).addBox(-0.5F, -0.6808F, -3.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.0436F, 0.1571F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(73, 104).addBox(-0.5F, 0.7542F, -7.2455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.3054F, 0.1571F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(125, 130).addBox(-0.5F, 1.0605F, -4.6342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.2618F, 0.1571F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(99, 120).addBox(-0.5F, -0.7201F, -4.3976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, 0.1745F, 0.1571F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(30, 116).addBox(-0.5F, 0.1989F, -0.3732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, 0.0992F, 0.2296F, -0.1745F, 0.1571F, 0.0F));

		return LayerDefinition.create(meshdefinition, 137, 137);
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