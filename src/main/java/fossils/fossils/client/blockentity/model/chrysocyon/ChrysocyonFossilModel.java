package fossils.fossils.client.blockentity.model.chrysocyon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChrysocyonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart neck4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart sternum;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public ChrysocyonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.neck4 = this.chest.getChild("neck4");
		this.neck2 = this.neck4.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck3 = this.neck5.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.sternum = this.chest.getChild("sternum");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.tail = this.hips.getChild("tail");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.548F, 11.7507F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 95).addBox(0.0F, -0.9178F, -0.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 75).addBox(0.0F, -1.376F, -0.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-1.0763F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 50).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 50).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 72).addBox(-0.9237F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, -0.3396F, -2.4793F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 80).addBox(0.0F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5159F, -0.2857F, 1.5909F, -0.9697F, 0.1018F, 0.0812F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0304F, -1.5064F, 0.2012F, -0.9174F, 0.1018F, 0.0812F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2352F, -1.7225F, 2.6208F, 0.1735F, 0.1018F, 0.0812F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 86).addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(72, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0696F, -1.9329F, 0.838F, 0.4789F, 0.1018F, 0.0812F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, 0.35F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1354F, -1.9802F, 1.4429F, -0.5247F, 0.1018F, 0.0812F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 34).addBox(-0.3683F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.3564F, 0.1663F, -0.1795F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 49).addBox(-0.5F, -0.575F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.206F, 1.2694F, 2.3226F, -1.6095F, 0.1663F, -0.1795F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 49).addBox(-0.3683F, -0.7947F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.0859F, 0.1663F, -0.1795F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 22).addBox(-0.9F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2033F, 1.514F, 0.9063F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 80).addBox(-0.1571F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 41).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9793F, 2.3954F, 3.5795F, 0.3969F, 0.0647F, 0.2403F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(79, 56).addBox(-1.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9891F, 2.4027F, 3.5458F, -0.7099F, 0.1311F, 0.1653F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 16).addBox(-0.8198F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -2.1006F, -0.6518F, 1.6723F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 79).addBox(-0.3883F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 45).addBox(-0.3883F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -1.6633F, -0.8107F, 1.0317F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9002F, 5.4946F, 3.5758F, 0.3089F, 0.7259F, 0.7733F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 49).addBox(-0.1571F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -0.8692F, 0.7259F, 0.7733F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8812F, -0.3396F, -2.4793F));

		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(-1.0F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5159F, -0.2857F, 1.5909F, -0.9697F, -0.1018F, -0.0812F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0304F, -1.5064F, 0.2012F, -0.9174F, -0.1018F, -0.0812F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2352F, -1.7225F, 2.6208F, 0.1735F, -0.1018F, -0.0812F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(77, 86).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(72, 86).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0696F, -1.9329F, 0.838F, 0.4789F, -0.1018F, -0.0812F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.5F, 0.35F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1354F, -1.9802F, 1.4429F, -0.5247F, -0.1018F, -0.0812F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 34).mirror().addBox(-0.6317F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.3564F, -0.1663F, 0.1795F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 49).mirror().addBox(-0.5F, -0.575F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.206F, 1.2694F, 2.3226F, -1.6095F, -0.1663F, 0.1795F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 49).mirror().addBox(-0.6317F, -0.7947F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.0859F, -0.1663F, 0.1795F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-0.1F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2033F, 1.514F, 0.9063F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.8429F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 2.3954F, 3.5795F, 0.3969F, -0.0647F, -0.2403F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(0.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 2.4027F, 3.5458F, -0.7099F, -0.1311F, -0.1653F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(45, 16).mirror().addBox(-0.1802F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -2.1006F, 0.6518F, -1.6723F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 79).mirror().addBox(-0.6117F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 45).mirror().addBox(-0.6117F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -1.6633F, 0.8107F, -1.0317F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9002F, 5.4946F, 3.5758F, 0.3089F, -0.7259F, -0.7733F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(-0.8429F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -0.8692F, -0.7259F, -0.7733F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 2.4592F, -0.1943F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 80).addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 80).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(50, 32).addBox(-0.5F, -0.35F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 12.5066F, -0.2932F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 13.0124F, 0.1897F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 66).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.9949F, 1.1895F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -0.55F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.2318F, 1.0857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(31, 61).addBox(-1.0F, -0.275F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.3714F, 0.8165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(14, 61).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.007F, 12.3545F, -0.5675F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 76).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0476F, -0.0269F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(10, 41).addBox(-0.5F, -5.9F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 7.8255F, -0.5324F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 76).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 9.6252F, -0.5638F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(87, 18).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 10.6675F, 0.8125F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 10.839F, 0.1334F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(76, 68).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 10.3391F, 0.0827F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 72).addBox(-0.5F, -1.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 11.4115F, -0.0168F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9747F, 0.5451F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 63).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 0.5177F, 1.0579F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(63, 60).addBox(-1.0F, -0.425F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 22).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.297F, 0.2493F, 0.549F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 94).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9F, 1.4204F, 1.7083F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.9F, 3.5629F, 0.9772F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 41).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3F, 14.2548F, -2.3317F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(25, 41).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 8.714F, -0.4398F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3F, 5.9485F, -0.0017F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 36).addBox(-0.5F, -4.9F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3F, 4.8584F, -0.6739F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(72, 76).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.3F, 2.4746F, 0.4248F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 5).addBox(-0.5F, -4.0222F, -0.0452F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 5.9656F, -0.865F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 80).addBox(-1.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6053F, -1.4028F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 72).addBox(-0.5F, -1.75F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(41, 50).addBox(-1.0F, -1.5F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1484F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0387F, 1.4289F, 0.0831F, 0.1571F, -0.0016F, 0.0011F));

		PartDefinition cube_r67 = leftArm5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(15, 39).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 6.2147F, 0.1009F, -0.1658F, 0.0037F, -0.0024F));

		PartDefinition cube_r68 = leftArm6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(81, 95).addBox(-0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 95).addBox(-0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 95).addBox(0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 95).addBox(0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8051F, -1.8449F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftArm6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 18).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5328F, -1.7485F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftArm6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 42).addBox(0.0F, -0.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 2.4592F, -0.1943F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(93, 66).addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 47).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 60).addBox(-0.5F, -0.35F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 12.5066F, -0.2932F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 13.0124F, 0.1897F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(70, 65).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.9949F, 1.1895F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 62).addBox(-1.0F, -0.55F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.2318F, 1.0857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(70, 59).addBox(-1.0F, -0.275F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.3714F, 0.8165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(45, 70).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.007F, 12.3545F, -0.5675F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 34).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0476F, -0.0269F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(20, 41).addBox(-0.5F, -5.9F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 7.8255F, -0.5324F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(78, 24).addBox(-0.5F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 9.6252F, -0.5638F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 30).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 10.6675F, 0.8125F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(93, 24).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 10.839F, 0.1334F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 78).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 10.3391F, 0.0827F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5F, -1.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 11.4115F, -0.0168F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9747F, 0.5451F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(19, 71).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.5177F, 1.0579F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 13).addBox(-1.0F, -0.425F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(7, 71).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.297F, 0.2493F, 0.549F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(94, 36).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.9F, 1.4204F, 1.7083F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.9F, 3.5629F, 0.9772F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 94).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3F, 14.2548F, -2.3317F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 8.714F, -0.4398F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(71, 3).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3F, 5.9485F, -0.0017F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 48).addBox(-0.5F, -4.9F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3F, 4.8584F, -0.6739F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(78, 49).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3F, 2.4746F, 0.4248F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(10, 49).addBox(-0.5F, -4.0222F, -0.0452F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 5.9656F, -0.865F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 94).addBox(0.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6053F, -1.4028F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 78).addBox(-0.5F, -1.75F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 56).addBox(-1.0F, -1.5F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1484F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0387F, 1.4289F, 0.0831F, 0.1571F, 0.0016F, -0.0011F));

		PartDefinition cube_r100 = rightArm5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(5, 41).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 6.2147F, 0.1009F, -0.0349F, -0.0037F, 0.0024F));

		PartDefinition cube_r101 = rightArm6.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(6, 97).addBox(0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 97).addBox(0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 97).addBox(-0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 62).addBox(-0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8051F, -1.8449F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightArm6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(71, 24).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.5328F, -1.7485F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightArm6.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(56, 60).addBox(-2.0F, -0.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4974F, -3.4722F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 94).addBox(0.0F, -1.5846F, -0.9952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8986F, -0.9047F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(94, 50).addBox(0.0F, -1.5545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2985F, -2.8047F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, -0.1199F, -3.5798F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-1.7472F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, -0.1199F, -1.5798F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(71, 16).addBox(-0.2528F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, -0.1199F, -1.5798F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(71, 8).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, -0.1199F, -3.5798F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(29, 22).addBox(-0.5F, -0.1513F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3675F, -13.3658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3933F, -3.7586F, -0.2358F, 0.0424F, -0.0102F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(-7.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.437F, 0.3173F, -1.3901F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.2807F, 0.4604F, -0.9839F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.1439F, 0.516F, -0.6939F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(55, 52).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.3872F, 0.2564F, -1.1259F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.3102F, 0.3463F, -0.8683F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.3392F, 0.3506F, -1.1116F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.236F, 0.4254F, -0.8404F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-4.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.4523F, 0.0908F, -1.4978F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.4446F, 0.1953F, -1.4967F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 95).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.236F, -0.4254F, 0.8404F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(55, 54).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.3392F, -0.3506F, 1.1116F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 74).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.4446F, -0.1953F, 1.4967F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(94, 54).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.3102F, -0.3463F, 0.8683F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 52).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.3872F, -0.2564F, 1.1259F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 95).addBox(3.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.4523F, -0.0908F, 1.4978F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(93, 69).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.1439F, -0.516F, 0.6939F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(7, 55).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.2807F, -0.4604F, 0.9839F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(41, 30).addBox(3.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.437F, -0.3173F, 1.3901F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(94, 94).addBox(0.0F, -1.1705F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -2.1528F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 95).addBox(0.0F, -0.7594F, -0.0811F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -3.9528F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(66, 95).addBox(0.0F, -0.5188F, -0.0713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3949F, -5.8528F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, 0.0262F, 0.0436F, 0.0011F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(7, 50).addBox(0.0F, -2.6205F, 0.0438F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.1F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 94).addBox(0.0F, -1.4899F, -0.1021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-8.5116F, -2.7918F, -0.5952F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4403F, 0.2458F, -1.3069F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(52, 40).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3146F, 0.3958F, -0.9138F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.1979F, 0.4626F, -0.6352F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 42).mirror().addBox(-8.4467F, -2.8451F, -0.7403F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.463F, 0.2516F, -1.3621F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3343F, 0.4095F, -0.9712F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-2.3578F, -0.2807F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.2133F, 0.4808F, -0.6918F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(67, 74).addBox(0.3578F, -0.2807F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.2133F, -0.4808F, 0.6918F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(39, 54).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3343F, -0.4095F, 0.9712F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 42).addBox(4.4467F, -2.8451F, -0.7403F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.463F, -0.2516F, 1.3621F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 18).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.1979F, -0.4626F, 0.6352F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(52, 40).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3146F, -0.3958F, 0.9138F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(41, 28).addBox(4.5116F, -2.7918F, -0.5952F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4403F, -0.2458F, 1.3069F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(18, 22).addBox(-0.5F, -0.3759F, -3.9807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(46, 73).addBox(0.0F, -4.0121F, -0.1182F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(43, 73).addBox(0.0F, -3.2687F, -0.0408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5809F, -1.8018F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.1822F, 0.4729F, -0.6281F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-5.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3029F, 0.4096F, -0.9092F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.4356F, 0.2626F, -1.3057F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4403F, 0.2458F, -1.3069F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 2).mirror().addBox(-5.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3146F, 0.3958F, -0.9138F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.1979F, 0.4626F, -0.6352F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(73, 10).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.1979F, -0.4626F, 0.6352F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 2).addBox(2.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3146F, -0.3958F, 0.9138F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(51, 0).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4403F, -0.2458F, 1.3069F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(69, 72).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.4356F, -0.2626F, 1.3057F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 50).addBox(2.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3029F, -0.4096F, 0.9092F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(62, 72).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.1822F, -0.4729F, 0.6281F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, -0.0333F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(49, 73).addBox(0.0F, -3.7606F, -0.0758F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4094F, -1.7777F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-3.375F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5915F, 5.4758F, 0.8458F, 0.4675F, 0.2298F, 0.2279F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-3.3956F, 0.2019F, 0.7187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8618F, -1.6799F, 0.4817F, 0.143F, 0.3023F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 26).mirror().addBox(-3.9F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4302F, 5.7211F, 2.8191F, 0.4532F, 0.2262F, 0.3283F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.1449F, 0.5172F, -0.6072F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.2821F, 0.4613F, -0.8972F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.4385F, 0.3177F, -1.3034F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(92, 89).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.4385F, -0.3177F, 1.3034F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(52, 30).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.2821F, -0.4613F, 0.8972F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(74, 0).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.1449F, -0.5172F, 0.6072F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(40, 26).addBox(-0.1F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4302F, 5.7211F, 2.8191F, 0.4532F, -0.2262F, -0.3283F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(51, 47).addBox(0.3956F, 0.2019F, 0.7187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8618F, -1.6799F, 0.4817F, -0.143F, -0.3023F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(40, 20).addBox(-0.625F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5915F, 5.4758F, 0.8458F, 0.4675F, -0.2298F, -0.2279F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(31, 16).addBox(-0.5F, -0.728F, -0.135F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.8618F, -1.6799F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 43).addBox(-0.5F, -0.3756F, -1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(37, 44).addBox(0.0F, -2.485F, -0.1495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4588F, -1.6659F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.2821F, 0.4613F, -1.0543F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.1449F, 0.5172F, -0.7643F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 74).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.1449F, -0.5172F, 0.7643F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 20).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.2821F, -0.4613F, 1.0543F));

		PartDefinition cube_r183 = neck4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, -0.8713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, 0.4311F, 0.3574F, -0.0492F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(85, 94).addBox(0.0F, -1.3076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7638F, -1.0128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.1646F, 0.1296F, 0.0183F));

		PartDefinition cube_r186 = neck.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(88, 94).addBox(0.0F, -1.3423F, -1.0693F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, 0.0007F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(20, 53).addBox(-0.5F, -1.1F, 1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.9993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3948F, -2.0003F, -0.2435F, 0.2331F, -0.0133F));

		PartDefinition cube_r188 = neck5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(26, 95).addBox(0.0F, -0.9423F, -0.0193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0168F, -2.8955F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r189 = neck5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 95).addBox(0.0F, -0.9423F, -0.2193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3209F, -0.787F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r190 = neck5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 23).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1931F, -3.8618F, -0.3246F, 0.2774F, -0.1864F));

		PartDefinition cube_r191 = neck3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(38, 6).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0932F, -0.056F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 55).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.023F, -0.382F, -0.1687F, 0.2667F, -0.0201F, -0.0009F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1753F, -1.8261F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(52, 36).addBox(-0.5F, -0.825F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.7629F, -1.3412F, 0.8495F, 0.0633F, 0.0942F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(41, 32).addBox(-1.5F, -0.8114F, -0.5982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4012F, 0.3055F, -0.4718F, 1.5302F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(7, 65).addBox(-1.5F, -0.4018F, -0.1886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4012F, 0.3055F, -0.4718F, 0.5703F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5601F, -3.1125F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 11).addBox(-0.5F, -1.425F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.4066F, -3.1004F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(70, 89).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.0064F, -3.5428F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 15).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -2.444F, -0.7528F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(15, 91).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.4196F, -1.1521F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -2.3094F, -1.5366F, -2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.134F, -1.8961F, -2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(91, 0).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.9462F, -2.2493F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(80, 89).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.7254F, -2.5828F, -2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(65, 89).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.2609F, -3.2341F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(88, 6).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0064F, -3.5428F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6894F, -4.6024F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(77, 20).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.1678F, -4.0874F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 88).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5452F, -3.8423F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8103F, -2.2939F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(87, 82).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, 3.1015F, -5.5235F, 2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(82, 19).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, 2.3547F, -5.2368F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(45, 67).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.7472F, -7.0754F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(31, 67).addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.9079F, -6.533F, -1.946F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(52, 12).addBox(-1.3115F, -1.0317F, -0.3708F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3115F, 6.1513F, -6.7646F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(87, 79).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(87, 76).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.6126F, -6.5786F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(22, 79).addBox(-0.5F, -0.95F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.0277F, -5.9374F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, -0.125F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1751F, -5.4149F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, 0.1F, -2.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 4.5544F, -4.6838F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 67).addBox(-0.5F, -0.675F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 5.0261F, -5.0324F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(64, 7).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.006F, -1.3197F, -0.7597F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(67, 46).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.006F, -1.0548F, 0.2653F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(64, 4).addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.006F, -0.8288F, -0.0972F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2412F, -1.408F, 1.5839F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(81, 3).addBox(-0.5F, 0.075F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9612F, -2.1611F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(81, 0).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -0.875F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.1445F, -2.1453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4822F, 7.2009F, -5.251F, -0.0222F, -0.2318F, -0.1668F));

		PartDefinition cube_r228 = leftCanine.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(87, 57).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1373F, -0.6714F, -0.9322F, -1.0288F, 0.2551F, 0.0186F));

		PartDefinition cube_r229 = leftCanine.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1373F, -0.6714F, -0.9322F, -1.3342F, 0.2551F, 0.0186F));

		PartDefinition cube_r230 = leftCanine.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1927F, -0.4818F, -0.7064F, -1.1597F, 0.2551F, 0.0186F));

		PartDefinition cube_r231 = leftCanine.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(87, 73).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.247F, 0.0985F, -0.457F, 2.8633F, 0.2551F, 0.0186F));

		PartDefinition cube_r232 = leftCanine.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(87, 60).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1618F, -0.0937F, -0.7973F, -2.0673F, 0.2551F, 0.0186F));

		PartDefinition cube_r233 = leftCanine.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 16).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1004F, -0.3942F, -1.054F, -0.8455F, 0.2551F, 0.0186F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4822F, 7.2009F, -5.251F, -0.0222F, 0.2318F, 0.1668F));

		PartDefinition cube_r234 = rightCanine.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.1373F, -0.6714F, -0.9322F, -1.0288F, -0.2551F, -0.0186F));

		PartDefinition cube_r235 = rightCanine.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1373F, -0.6714F, -0.9322F, -1.3342F, -0.2551F, -0.0186F));

		PartDefinition cube_r236 = rightCanine.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1927F, -0.4818F, -0.7064F, -1.1597F, -0.2551F, -0.0186F));

		PartDefinition cube_r237 = rightCanine.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.247F, 0.0985F, -0.457F, 2.8633F, -0.2551F, -0.0186F));

		PartDefinition cube_r238 = rightCanine.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(87, 60).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1618F, -0.0937F, -0.7973F, -2.0673F, -0.2551F, -0.0186F));

		PartDefinition cube_r239 = rightCanine.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1004F, -0.3942F, -1.054F, -0.8455F, -0.2551F, -0.0186F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9168F, -0.7672F, 2.789F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 30).addBox(-0.85F, -0.1F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4468F, 2.6106F, -6.7145F, 2.2645F, 0.2262F, 0.0959F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 48).addBox(-0.5F, -0.7219F, -0.2951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1737F, 3.2259F, -6.1534F, 1.3628F, 0.3546F, 0.0867F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(59, 36).addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0514F, 4.013F, -6.2985F, 1.0016F, 0.365F, 0.1016F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(83, 35).addBox(-0.5F, -0.6969F, -0.9451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1737F, 3.2259F, -6.1534F, 1.1883F, 0.3546F, 0.0867F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(40, 94).addBox(-0.9F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2851F, 5.4862F, -8.3074F, -1.2081F, -0.2268F, 1.3062F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(83, 32).addBox(-0.875F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2869F, 5.833F, -8.0845F, -0.9571F, -0.8793F, -0.4344F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(83, 25).addBox(-0.9473F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3787F, 4.5232F, -6.5802F, -1.2237F, 0.2506F, 0.1704F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 89).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0611F, 5.0909F, -7.2363F, -2.7203F, -0.3405F, 1.2573F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 83).addBox(-0.9473F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3787F, 4.5232F, -6.5802F, -2.6636F, 0.2506F, 0.1704F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(87, 88).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2239F, 4.7914F, -6.8081F, 2.1532F, -0.6061F, 1.1274F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(83, 22).addBox(-0.9473F, -0.8803F, -0.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3787F, 4.5232F, -6.5802F, 2.3543F, 0.2506F, 0.1704F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(20, 83).addBox(-0.35F, 0.4F, -2.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0922F, 6.2322F, -8.1754F, 0.4574F, -0.0783F, -0.0385F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(88, 47).addBox(-0.55F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4498F, 5.8889F, -7.467F, -0.3279F, 0.251F, 0.119F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(45, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6466F, 6.2274F, -8.0725F, -0.0866F, 0.1573F, 0.037F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6879F, 6.526F, -8.5782F, -0.0734F, 0.1297F, 0.0687F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(83, 12).addBox(-0.5F, -0.4411F, -0.9396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1225F, 5.3192F, -6.3521F, 0.674F, 0.1474F, 0.2714F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -0.2911F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1225F, 5.3192F, -6.3521F, 0.9358F, 0.1474F, 0.2714F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(83, 9).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1615F, 4.5872F, -5.8316F, 1.2413F, 0.1474F, 0.2714F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(10, 89).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3663F, 4.3926F, -6.5239F, 0.8829F, -0.8665F, 0.8456F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(83, 6).addBox(-0.9473F, -0.1121F, -0.3658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3787F, 4.5232F, -6.5802F, 1.1325F, 0.2506F, 0.1704F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 83).addBox(-0.2516F, -0.6603F, -0.3813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4544F, 1.5304F, -4.3056F, 1.8782F, 0.1186F, 0.0786F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 80).addBox(-0.7765F, -0.1517F, -0.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8523F, -0.5037F, -3.6219F, -0.0416F, 0.0491F, 2.1549F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(19, 74).addBox(-0.2773F, -0.7625F, -0.5655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8523F, -0.5037F, -3.6219F, -0.06F, -0.0233F, 0.9174F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 65).addBox(-1.075F, -0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(56, 64).addBox(-1.075F, -0.85F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7155F, 0.3486F, -3.7788F, -0.1795F, -0.008F, -0.093F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 68).addBox(-0.625F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0461F, 0.8196F, -3.9977F, -1.3889F, 1.3142F, -1.9748F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 77).addBox(-0.3544F, -1.5768F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0959F, 1.0607F, -4.2795F, -2.5728F, 1.173F, 2.2122F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(60, 88).addBox(-0.823F, -0.8924F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0959F, 1.0607F, -4.2795F, 1.9604F, 0.5368F, 0.2421F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(82, 74).addBox(-0.5F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6666F, 1.1786F, -4.9454F, 0.703F, 0.2464F, 0.1311F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 62).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5766F, 4.2663F, -7.4826F, -2.2289F, 0.5754F, -0.0707F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(64, 53).addBox(-1.3637F, -0.1962F, -0.1382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6472F, 2.2014F, -7.8806F, -0.1245F, 0.3518F, 0.805F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(64, 50).addBox(-1.3637F, -0.1382F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6472F, 2.2014F, -7.8806F, 1.3154F, 0.3518F, 0.805F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(49, 64).addBox(-1.3787F, -0.0707F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6472F, 2.2014F, -7.8806F, 1.2966F, 0.5034F, 0.7599F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(31, 64).addBox(-1.1091F, -0.085F, -0.5497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6472F, 2.2014F, -7.8806F, 1.1946F, 0.2402F, 0.1845F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5032F, -1.5351F, -0.402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.5276F, 6.0616F, -8.3672F, -0.6884F, 0.0789F, 0.0399F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(62, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5363F, 5.2864F, -7.5214F, -1.0903F, -0.0475F, -0.0221F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(64, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.247F, 4.5632F, -7.4591F, 2.3511F, 0.2165F, -0.4573F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(82, 59).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6964F, 3.9423F, -8.2962F, 0.9819F, 0.3567F, -0.2825F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(40, 22).addBox(-1.9863F, -1.0071F, -2.0226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1522F, 0.279F, -5.9128F, -0.2016F, 1.0177F, -1.4911F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(52, 26).addBox(-0.9863F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1522F, 0.279F, -5.9128F, 0.7682F, 0.7732F, -0.3105F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(57, 67).addBox(-0.8F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2133F, 5.5525F, -8.4181F, -0.9615F, -0.6224F, 0.8067F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 63).addBox(-0.5032F, -1.8693F, -0.5689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5276F, 6.0616F, -8.3672F, -0.732F, 0.0789F, 0.0399F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(88, 12).addBox(-0.275F, 0.0518F, -0.4142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7415F, 6.9185F, -9.6822F, -0.1566F, -0.0475F, -0.092F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(79, 28).addBox(-1.1F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(27, 79).addBox(-0.7F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.423F, 5.7228F, -9.4655F, 1.4732F, 0.9725F, -1.7436F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(77, 59).addBox(-0.7F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7793F, 5.6345F, -9.6245F, 2.1878F, 0.8131F, -0.852F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 72).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.811F, 5.0557F, -9.2322F, 2.1674F, 0.7844F, -0.8805F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(59, 10).addBox(-1.7F, -0.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4548F, 5.144F, -9.0731F, 1.39F, 0.9465F, -1.7402F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(88, 21).addBox(-0.275F, -0.3755F, -0.0307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 88).addBox(-0.275F, -0.3755F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7415F, 6.9185F, -9.6822F, 1.7895F, -0.0475F, -0.092F));

		PartDefinition cube_r287 = leftOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(59, 14).addBox(-0.525F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(35, 88).addBox(-0.525F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 24).addBox(-0.525F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5395F, 6.373F, -9.1743F, -1.262F, -0.021F, -0.1752F));

		PartDefinition cube_r288 = leftOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(88, 31).addBox(-0.7F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 88).addBox(-0.7F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3454F, 6.4313F, -9.4563F, -0.7889F, -1.1249F, -0.899F));

		PartDefinition cube_r289 = leftOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(77, 41).addBox(-0.275F, -1.3054F, -0.145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.7415F, 6.9185F, -9.6822F, -0.6976F, -0.0475F, -0.092F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(47, 82).addBox(-0.275F, -0.3382F, -0.3768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7415F, 6.9185F, -9.6822F, -0.2613F, -0.0475F, -0.092F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 34).addBox(-0.5032F, -0.4461F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5276F, 6.0616F, -8.3672F, 0.8388F, 0.0789F, 0.0399F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(42, 82).addBox(-0.5032F, -0.3615F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5276F, 6.0616F, -8.3672F, 0.6206F, 0.0789F, 0.0399F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 56).addBox(-0.975F, -0.5F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0259F, 3.1906F, -7.7224F, 1.3291F, 0.3082F, 0.3268F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 68).addBox(-0.975F, -0.5F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0259F, 3.1906F, -7.7224F, 1.8704F, 0.2862F, 0.2385F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(14, 64).addBox(-0.975F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0259F, 3.1906F, -7.7224F, 1.3032F, 0.2862F, 0.2385F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(89, 44).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0063F, -1.2568F, -4.7532F, 0.4077F, 0.213F, -0.634F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(50, 89).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.395F, -0.5668F, -4.3656F, -0.0096F, 0.4572F, -1.7712F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(89, 37).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9684F, -1.0431F, -5.187F, -2.5941F, 0.4042F, -0.684F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(89, 50).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9684F, -1.0431F, -5.187F, -1.5192F, 1.071F, 0.7102F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(19, 68).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2702F, -0.5107F, -4.7084F, -3.1257F, 0.6844F, -1.6643F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(89, 53).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2702F, -0.5107F, -4.7084F, 1.8895F, 0.5033F, -1.7382F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 89).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8595F, -0.2393F, -6.4312F, -2.6959F, 0.3125F, -0.7336F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(7, 68).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2299F, -0.1437F, -5.1684F, -3.1158F, 0.521F, -1.6718F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(55, 89).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0456F, -1.474F, -4.3045F, 1.6344F, -0.0612F, -0.6559F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(25, 89).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0666F, 1.2117F, -5.5378F, -1.0641F, 0.5546F, 0.0192F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(89, 27).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1541F, 0.3487F, -6.0355F, -2.1122F, 0.521F, -1.6718F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(59, 26).addBox(-0.8F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4211F, 3.8062F, -8.3284F, 1.0872F, -0.0713F, 0.1052F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(52, 16).addBox(0.025F, -0.525F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1322F, 3.7082F, -7.7982F, 1.4314F, 0.251F, 0.0618F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(82, 41).addBox(-0.4987F, -0.5719F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6161F, 4.2222F, -7.5288F, 2.243F, 0.3573F, -0.0147F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9168F, -0.7672F, 2.789F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-0.15F, -0.1F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4468F, 2.6106F, -6.7145F, 2.2645F, -0.2262F, -0.0959F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-0.5F, -0.7219F, -0.2951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 3.2259F, -6.1534F, 1.3628F, -0.3546F, -0.0867F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0514F, 4.013F, -6.2985F, 1.0016F, -0.365F, -0.1016F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(-0.5F, -0.6969F, -0.9451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 3.2259F, -6.1534F, 1.1883F, -0.3546F, -0.0867F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-0.1F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2851F, 5.4862F, -8.3074F, -1.2081F, 0.2268F, -1.3062F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(-0.125F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2869F, 5.833F, -8.0845F, -0.9571F, 0.8793F, 0.4344F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-0.0527F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 4.5232F, -6.5802F, -1.2237F, -0.2506F, -0.1704F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0611F, 5.0909F, -7.2363F, -2.7203F, 0.3405F, -1.2573F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.0527F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 4.5232F, -6.5802F, -2.6636F, -0.2506F, -0.1704F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2239F, 4.7914F, -6.8081F, 2.1532F, 0.6061F, -1.1274F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.0527F, -0.8803F, -0.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 4.5232F, -6.5802F, 2.3543F, -0.2506F, -0.1704F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.65F, 0.4F, -2.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0922F, 6.2322F, -8.1754F, 0.4574F, 0.0783F, 0.0385F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(-0.45F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4498F, 5.8889F, -7.467F, -0.3279F, -0.251F, -0.119F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6466F, 6.2274F, -8.0725F, -0.0866F, -0.1573F, -0.037F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6879F, 6.526F, -8.5782F, -0.0734F, -0.1297F, -0.0687F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.5F, -0.4411F, -0.9396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 5.3192F, -6.3521F, 0.674F, -0.1474F, -0.2714F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5F, -0.2911F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 5.3192F, -6.3521F, 0.9358F, -0.1474F, -0.2714F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1615F, 4.5872F, -5.8316F, 1.2413F, -0.1474F, -0.2714F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3663F, 4.3926F, -6.5239F, 0.8829F, 0.8665F, -0.8456F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.0527F, -0.1121F, -0.3658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 4.5232F, -6.5802F, 1.1325F, -0.2506F, -0.1704F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.7484F, -0.6603F, -0.3813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4544F, 1.5304F, -4.3056F, 1.8782F, -0.1186F, -0.0786F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-0.2235F, -0.1517F, -0.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8523F, -0.5037F, -3.6219F, -0.0416F, -0.0491F, -2.1549F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.7227F, -0.7625F, -0.5655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8523F, -0.5037F, -3.6219F, -0.06F, 0.0233F, -0.9174F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.925F, -0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 64).mirror().addBox(-0.925F, -0.85F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7155F, 0.3486F, -3.7788F, -0.1795F, 0.008F, 0.093F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-0.375F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0461F, 0.8196F, -3.9977F, -1.3889F, -1.3142F, 1.9748F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.6456F, -1.5768F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.0959F, 1.0607F, -4.2795F, -2.5728F, -1.173F, -2.2122F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.177F, -0.8924F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0959F, 1.0607F, -4.2795F, 1.9604F, -0.5368F, -0.2421F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(82, 74).mirror().addBox(-0.5F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6666F, 1.1786F, -4.9454F, 0.703F, -0.2464F, -0.1311F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5766F, 4.2663F, -7.4826F, -2.2289F, -0.5754F, 0.0707F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.6363F, -0.1962F, -0.1382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 2.2014F, -7.8806F, -0.1245F, -0.3518F, -0.805F));

		PartDefinition cube_r340 = rightOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-0.6363F, -0.1382F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 2.2014F, -7.8806F, 1.3154F, -0.3518F, -0.805F));

		PartDefinition cube_r341 = rightOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(-0.6213F, -0.0707F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 2.2014F, -7.8806F, 1.2966F, -0.5034F, -0.7599F));

		PartDefinition cube_r342 = rightOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(31, 64).mirror().addBox(-0.8909F, -0.085F, -0.5497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 2.2014F, -7.8806F, 1.1946F, -0.2402F, -0.1845F));

		PartDefinition cube_r343 = rightOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.4968F, -1.5351F, -0.402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.5276F, 6.0616F, -8.3672F, -0.6884F, -0.0789F, -0.0399F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(62, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5363F, 5.2864F, -7.5214F, -1.0903F, 0.0475F, 0.0221F));

		PartDefinition cube_r345 = rightOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.247F, 4.5632F, -7.4591F, 2.3511F, -0.2165F, 0.4573F));

		PartDefinition cube_r346 = rightOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6964F, 3.9423F, -8.2962F, 0.9819F, -0.3567F, 0.2825F));

		PartDefinition cube_r347 = rightOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(40, 22).mirror().addBox(-0.0137F, -1.0071F, -2.0226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1522F, 0.279F, -5.9128F, -0.2016F, -1.0177F, 1.4911F));

		PartDefinition cube_r348 = rightOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(52, 26).mirror().addBox(-0.0137F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1522F, 0.279F, -5.9128F, 0.7682F, -0.7732F, 0.3105F));

		PartDefinition cube_r349 = rightOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.2F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2133F, 5.5525F, -8.4181F, -0.9615F, 0.6224F, -0.8067F));

		PartDefinition cube_r350 = rightOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.4968F, -1.8693F, -0.5689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5276F, 6.0616F, -8.3672F, -0.732F, -0.0789F, -0.0399F));

		PartDefinition cube_r351 = rightOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.725F, 0.0518F, -0.4142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7415F, 6.9185F, -9.6822F, -0.1566F, 0.0475F, 0.092F));

		PartDefinition cube_r352 = rightOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(0.1F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 79).mirror().addBox(-0.3F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.423F, 5.7228F, -9.4655F, 1.4732F, -0.9725F, 1.7436F));

		PartDefinition cube_r353 = rightOrbit.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(-0.3F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7793F, 5.6345F, -9.6245F, 2.1878F, -0.8131F, 0.852F));

		PartDefinition cube_r354 = rightOrbit.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.811F, 5.0557F, -9.2322F, 2.1674F, -0.7844F, 0.8805F));

		PartDefinition cube_r355 = rightOrbit.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-0.3F, -0.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4548F, 5.144F, -9.0731F, 1.39F, -0.9465F, 1.7402F));

		PartDefinition cube_r356 = rightOrbit.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-0.725F, -0.3755F, -0.0307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 88).mirror().addBox(-0.725F, -0.3755F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7415F, 6.9185F, -9.6822F, 1.7895F, 0.0475F, 0.092F));

		PartDefinition cube_r357 = rightOrbit.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-0.475F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(35, 88).mirror().addBox(-0.475F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 24).mirror().addBox(-0.475F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5395F, 6.373F, -9.1743F, -1.262F, 0.021F, 0.1752F));

		PartDefinition cube_r358 = rightOrbit.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.3F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 88).mirror().addBox(-0.3F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3454F, 6.4313F, -9.4563F, -0.7889F, 1.1249F, 0.899F));

		PartDefinition cube_r359 = rightOrbit.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(77, 41).mirror().addBox(-0.725F, -1.3054F, -0.145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.7415F, 6.9185F, -9.6822F, -0.6976F, 0.0475F, 0.092F));

		PartDefinition cube_r360 = rightOrbit.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(47, 82).mirror().addBox(-0.725F, -0.3382F, -0.3768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.7415F, 6.9185F, -9.6822F, -0.2613F, 0.0475F, 0.092F));

		PartDefinition cube_r361 = rightOrbit.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-0.4968F, -0.4461F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5276F, 6.0616F, -8.3672F, 0.8388F, -0.0789F, -0.0399F));

		PartDefinition cube_r362 = rightOrbit.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-0.4968F, -0.3615F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5276F, 6.0616F, -8.3672F, 0.6206F, -0.0789F, -0.0399F));

		PartDefinition cube_r363 = rightOrbit.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-1.025F, -0.5F, -0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0259F, 3.1906F, -7.7224F, 1.3291F, -0.3082F, -0.3268F));

		PartDefinition cube_r364 = rightOrbit.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-1.025F, -0.5F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0259F, 3.1906F, -7.7224F, 1.8704F, -0.2862F, -0.2385F));

		PartDefinition cube_r365 = rightOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-1.025F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0259F, 3.1906F, -7.7224F, 1.3032F, -0.2862F, -0.2385F));

		PartDefinition cube_r366 = rightOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(89, 44).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0063F, -1.2568F, -4.7532F, 0.4077F, -0.213F, 0.634F));

		PartDefinition cube_r367 = rightOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.395F, -0.5668F, -4.3656F, -0.0096F, -0.4572F, 1.7712F));

		PartDefinition cube_r368 = rightOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9684F, -1.0431F, -5.187F, -2.5941F, -0.4042F, 0.684F));

		PartDefinition cube_r369 = rightOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9684F, -1.0431F, -5.187F, -1.5192F, -1.071F, -0.7102F));

		PartDefinition cube_r370 = rightOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2702F, -0.5107F, -4.7084F, -3.1257F, -0.6844F, 1.6643F));

		PartDefinition cube_r371 = rightOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2702F, -0.5107F, -4.7084F, 1.8895F, -0.5033F, 1.7382F));

		PartDefinition cube_r372 = rightOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8595F, -0.2393F, -6.4312F, -2.6959F, -0.3125F, 0.7336F));

		PartDefinition cube_r373 = rightOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2299F, -0.1437F, -5.1684F, -3.1158F, -0.521F, 1.6718F));

		PartDefinition cube_r374 = rightOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0456F, -1.474F, -4.3045F, 1.6344F, 0.0612F, 0.6559F));

		PartDefinition cube_r375 = rightOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0666F, 1.2117F, -5.5378F, -1.0641F, -0.5546F, -0.0192F));

		PartDefinition cube_r376 = rightOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(89, 27).mirror().addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1541F, 0.3487F, -6.0355F, -2.1122F, -0.521F, 1.6718F));

		PartDefinition cube_r377 = rightOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(59, 26).mirror().addBox(-0.2F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4211F, 3.8062F, -8.3284F, 1.0872F, 0.0713F, -0.1052F));

		PartDefinition cube_r378 = rightOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-1.025F, -0.525F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1322F, 3.7082F, -7.7982F, 1.4314F, -0.251F, -0.0618F));

		PartDefinition cube_r379 = rightOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(82, 41).mirror().addBox(-0.5013F, -0.5719F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.6161F, 4.2222F, -7.5288F, 2.243F, -0.3573F, 0.0147F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.8082F, -1.1938F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(48, 52).mirror().addBox(-0.0004F, 0.5289F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -1.3028F, -0.1724F, 0.0191F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0607F, 0.2136F, -1.8809F, -1.6518F, -0.1724F, 0.0191F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.0607F, 0.2136F, -1.8809F, -2.9172F, -0.1724F, 0.0191F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(0.0996F, -0.0262F, -0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -0.7184F, -0.1899F, 0.0192F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0985F, 1.0589F, -1.1741F, -1.486F, -0.1724F, 0.0191F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(84, 28).mirror().addBox(0.0996F, -0.2657F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -0.3428F, -0.1724F, 0.0191F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.0144F, -0.0873F, -0.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5116F, 4.0136F, -1.329F, -0.7149F, -0.2855F, -0.1512F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(0.0F, -0.925F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4819F, 3.8069F, -1.6692F, -0.39F, -0.1904F, -0.0824F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(74, 45).mirror().addBox(-0.1155F, 0.7339F, -0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5116F, 4.0136F, -1.329F, -0.8861F, -0.2906F, -0.1453F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(-0.0662F, 0.7577F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(55, 92).mirror().addBox(-0.0662F, 1.2577F, 0.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5116F, 4.0136F, -1.329F, -1.6207F, -0.1952F, -0.3051F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.5F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0264F, 1.6031F, -1.6477F, -2.8823F, -0.1724F, 0.0191F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(0.0996F, -0.3407F, -1.0474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.15F, 0.8171F, -0.0466F, -1.9136F, -0.1724F, 0.0191F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(0.0996F, -1.0407F, -0.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.15F, 0.8171F, -0.0466F, -2.6554F, -0.1724F, 0.0191F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.5F, -0.25F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.3041F, 0.8318F, 2.537F, -0.1724F, 0.0191F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.5F, 0.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2927F, 1.3779F, -0.0797F, -0.3693F, -0.1899F, 0.0192F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(60, 91).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3099F, 2.469F, -0.0997F, -0.4582F, -0.1875F, 0.0359F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1201F, 2.5262F, -1.11F, -0.24F, -0.1875F, 0.0359F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5607F, 4.1002F, -1.1173F, -2.2269F, -0.2406F, -0.0625F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.1155F, 0.7465F, -0.4942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5116F, 4.0136F, -1.329F, -0.9559F, -0.2906F, -0.1453F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 92).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1895F, 3.3752F, -1.7916F, -1.9616F, -0.12F, -0.1629F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(55, 92).addBox(-0.9338F, 1.2577F, 0.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 44).addBox(-0.9338F, 0.7577F, -0.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9116F, 4.0136F, -1.329F, -1.6207F, 0.1952F, 0.3051F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(65, 92).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5895F, 3.3752F, -1.7916F, -1.9616F, 0.12F, 0.1629F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(77, 63).addBox(-0.8845F, 0.7465F, -0.4942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9116F, 4.0136F, -1.329F, -0.9559F, 0.2906F, 0.1453F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(74, 45).addBox(-0.8845F, 0.7339F, -0.7407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9116F, 4.0136F, -1.329F, -0.8861F, 0.2906F, 0.1453F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(79, 53).addBox(-1.0F, -0.925F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8819F, 3.8069F, -1.6692F, -0.39F, 0.1904F, 0.0824F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(85, 91).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9607F, 4.1002F, -1.1173F, -2.2269F, 0.2406F, 0.0625F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(84, 38).addBox(-0.9856F, -0.0873F, -0.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9116F, 4.0136F, -1.329F, -0.7149F, 0.2855F, 0.1512F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(40, 91).addBox(-0.5F, -0.25F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.1036F, 1.3041F, 0.8318F, 2.537F, 0.1724F, -0.0191F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(35, 91).addBox(-1.0996F, -1.0407F, -0.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 0.8171F, -0.0466F, -2.6554F, 0.1724F, -0.0191F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(60, 18).addBox(-1.0996F, -0.3407F, -1.0474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 0.8171F, -0.0466F, -1.9136F, 0.1724F, -0.0191F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(84, 28).addBox(-1.0996F, -0.2657F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -0.3428F, 0.1724F, -0.0191F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(30, 91).addBox(-0.5F, -0.95F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.4264F, 1.6031F, -1.6477F, -2.8823F, 0.1724F, -0.0191F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4985F, 1.0589F, -1.1741F, -1.486F, 0.1724F, -0.0191F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(91, 63).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5201F, 2.5262F, -1.11F, -0.24F, 0.1875F, -0.0359F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(60, 91).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7099F, 2.469F, -0.0997F, -0.4582F, 0.1875F, -0.0359F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(45, 91).addBox(-0.5F, 0.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6927F, 1.3779F, -0.0797F, -0.3693F, 0.1899F, -0.0192F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(77, 83).addBox(-1.0996F, -0.0262F, -0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -0.7184F, 0.1899F, -0.0192F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(72, 83).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4607F, 0.2136F, -1.8809F, -2.9172F, 0.1724F, -0.0191F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(83, 70).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.4607F, 0.2136F, -1.8809F, -1.6518F, 0.1724F, -0.0191F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(48, 52).addBox(-0.9996F, 0.5289F, -2.0178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -1.3028F, 0.1724F, -0.0191F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.1554F, 5.4473F, -3.5115F));

		PartDefinition cube_r420 = bone3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(52, 83).mirror().addBox(-0.5001F, -0.6474F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.436F, -1.6017F, -0.7269F, -0.1166F, 2.8293F));

		PartDefinition cube_r421 = bone3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-0.5001F, -0.6907F, -0.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.436F, -1.6017F, -0.9451F, -0.1166F, 2.8293F));

		PartDefinition cube_r422 = bone3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(-0.5001F, -0.4415F, -0.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.436F, -1.6017F, -2.0359F, -0.1166F, 2.8293F));

		PartDefinition cube_r423 = bone3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-0.7939F, -0.7849F, 0.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, -2.6624F, -0.053F, 0.004F));

		PartDefinition cube_r424 = bone3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-0.7939F, -0.6626F, -0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, -2.4006F, -0.053F, 0.004F));

		PartDefinition cube_r425 = bone3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.4169F, -0.0083F, -0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 92).mirror().addBox(-0.4169F, -0.6083F, -0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(92, 18).mirror().addBox(-0.4169F, -0.0083F, -0.3327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -0.8597F, -0.2527F, -0.0914F));

		PartDefinition cube_r426 = bone3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-0.4169F, -0.56F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -0.9819F, -0.2527F, -0.0914F));

		PartDefinition cube_r427 = bone3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(45, 94).mirror().addBox(-0.7939F, -0.0793F, -0.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, 0.5665F, -0.053F, 0.004F));

		PartDefinition cube_r428 = bone3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.7939F, -0.9708F, -1.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, 1.7882F, -0.053F, 0.004F));

		PartDefinition cube_r429 = bone3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-0.2425F, 0.1984F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(50, 92).mirror().addBox(-0.2425F, 0.3984F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, -1.3334F, 0.0592F, 3.1052F));

		PartDefinition cube_r430 = bone3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(92, 56).mirror().addBox(-0.2914F, -0.4816F, -0.8428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(92, 59).mirror().addBox(-0.2914F, 0.0434F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -1.5763F, -0.1539F, -0.1332F));

		PartDefinition cube_r431 = bone3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(92, 59).addBox(-0.7086F, 0.0434F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(92, 56).addBox(-0.7086F, -0.4816F, -0.8428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5763F, 0.1539F, 0.1332F));

		PartDefinition cube_r432 = bone3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(50, 92).addBox(-0.7575F, 0.3984F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(92, 40).addBox(-0.7575F, 0.1984F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, -1.3334F, -0.0592F, -3.1052F));

		PartDefinition cube_r433 = bone3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(25, 92).addBox(-0.2061F, -0.9708F, -1.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, 1.7882F, 0.053F, -0.004F));

		PartDefinition cube_r434 = bone3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(45, 94).addBox(-0.2061F, -0.0793F, -0.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, 0.5665F, 0.053F, -0.004F));

		PartDefinition cube_r435 = bone3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(20, 92).addBox(-0.5831F, -0.56F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9819F, 0.2527F, 0.0914F));

		PartDefinition cube_r436 = bone3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5831F, -0.0083F, -0.3327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(10, 92).addBox(-0.5831F, -0.6083F, -0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(0, 92).addBox(-0.5831F, -0.0083F, -0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8597F, 0.2527F, 0.0914F));

		PartDefinition cube_r437 = bone3.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(90, 91).addBox(-0.2061F, -0.6626F, -0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, -2.4006F, 0.053F, -0.004F));

		PartDefinition cube_r438 = bone3.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(94, 43).addBox(-0.2061F, -0.7849F, 0.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, -2.6624F, 0.053F, -0.004F));

		PartDefinition cube_r439 = bone3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(67, 83).addBox(-0.4999F, -0.4415F, -0.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.051F, 0.436F, -1.6017F, -2.0359F, 0.1166F, -2.8293F));

		PartDefinition cube_r440 = bone3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(57, 83).addBox(-0.4999F, -0.6907F, -0.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.051F, 0.436F, -1.6017F, -0.9451F, 0.1166F, -2.8293F));

		PartDefinition cube_r441 = bone3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(52, 83).addBox(-0.4999F, -0.6474F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.051F, 0.436F, -1.6017F, -0.7269F, 0.1166F, -2.8293F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 5.4916F, 1.1753F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r442 = sternum.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 12).mirror().addBox(-4.3F, 0.0F, -0.75F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.411F, 0.3177F, 3.1895F, 0.1841F, 0.3953F, 0.2102F));

		PartDefinition cube_r443 = sternum.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(-4.4807F, 0.1041F, -0.6139F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6331F, 0.2274F, 5.1441F, 0.014F, 0.3879F, 0.1892F));

		PartDefinition cube_r444 = sternum.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2314F, -0.197F, 7.7674F, 0.1922F, 0.4552F, 0.2461F));

		PartDefinition cube_r445 = sternum.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(31, 2).mirror().addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6339F, 0.0073F, 8.0775F, 0.4348F, 0.5977F, 0.6229F));

		PartDefinition cube_r446 = sternum.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(31, 4).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6339F, 0.0073F, 8.0775F, 0.9309F, 0.6679F, 1.1726F));

		PartDefinition cube_r447 = sternum.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(31, 4).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3622F, 0.0073F, 8.0775F, 0.9309F, -0.6679F, -1.1726F));

		PartDefinition cube_r448 = sternum.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(31, 2).addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3622F, 0.0073F, 8.0775F, 0.4348F, -0.5977F, -0.6229F));

		PartDefinition cube_r449 = sternum.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(31, 0).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9597F, -0.197F, 7.7674F, 0.1922F, -0.4552F, -0.2461F));

		PartDefinition cube_r450 = sternum.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(16, 28).addBox(-0.5F, -0.2103F, -0.3518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.1642F, 4.9471F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r451 = sternum.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5193F, 0.1041F, -0.6139F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3613F, 0.2274F, 5.1441F, 0.014F, -0.3879F, -0.1892F));

		PartDefinition cube_r452 = sternum.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(20, 12).addBox(-0.7F, 0.0F, -0.75F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1393F, 0.3177F, 3.1895F, 0.1841F, -0.3953F, -0.2102F));

		PartDefinition cube_r453 = sternum.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(5, 16).addBox(-0.5F, -0.965F, 2.8453F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.7642F, -3.0529F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0971F, 3.5356F, -1.7691F, 0.9585F, -0.009F, -0.0068F));

		PartDefinition cube_r454 = leftarm.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(66, 10).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0105F, 0.6992F, -0.6796F, -2.4348F, 0.0014F, -0.001F));

		PartDefinition cube_r455 = leftarm.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(65, 43).addBox(-1.0F, -0.7F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0113F, 0.0926F, -0.8585F, 2.4085F, 0.0014F, -0.001F));

		PartDefinition cube_r456 = leftarm.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(65, 40).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0102F, -0.1142F, 0.0457F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r457 = leftarm.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(71, 27).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.01F, 0.5707F, -0.2883F, -1.1695F, 0.0014F, -0.001F));

		PartDefinition cube_r458 = leftarm.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(76, 2).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.001F, 10.862F, -4.9641F, 2.0812F, 0.0009F, -0.0013F));

		PartDefinition cube_r459 = leftarm.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 11.1662F, -4.3337F, 1.1213F, 0.0009F, -0.0013F));

		PartDefinition cube_r460 = leftarm.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(86, 3).addBox(-0.5F, -0.85F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0001F, 10.7474F, -3.7728F, 0.6413F, 0.0009F, -0.0013F));

		PartDefinition cube_r461 = leftarm.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0007F, 10.1043F, -3.4964F, -0.4059F, 0.0009F, -0.0013F));

		PartDefinition cube_r462 = leftarm.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0023F, 8.5146F, -2.894F, -0.3622F, 0.0009F, -0.0013F));

		PartDefinition cube_r463 = leftarm.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(21, 57).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0072F, 4.749F, -2.8912F, -0.1877F, 0.0009F, -0.0013F));

		PartDefinition cube_r464 = leftarm.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(42, 36).addBox(-0.0118F, -1.0263F, -0.1862F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, 1.0885F, -1.8986F, -0.2619F, 0.0009F, -0.0015F));

		PartDefinition cube_r465 = leftarm.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.0929F, -2.2001F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r466 = leftarm.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(26, 65).addBox(-0.5F, -0.6F, -0.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.546F, -0.7975F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.8661F, -4.6821F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r467 = leftarm2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(94, 27).addBox(0.4F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1764F, -1.7537F, 1.316F, -1.5708F, 1.1694F, 1.5708F));

		PartDefinition cube_r468 = leftarm2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(50, 86).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.1764F, -1.7537F, 1.316F, 1.5708F, 1.1868F, -1.5708F));

		PartDefinition cube_r469 = leftarm2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(25, 86).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.1764F, -1.7537F, 1.316F, 1.5708F, 0.2269F, -1.5708F));

		PartDefinition cube_r470 = leftarm2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(20, 86).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1764F, -0.9562F, 1.2532F, 1.5708F, 1.4923F, -1.5708F));

		PartDefinition cube_r471 = leftarm2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(86, 15).addBox(-0.7F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.1764F, -0.3644F, 1.1542F, -1.5708F, 0.1658F, 1.5708F));

		PartDefinition cube_r472 = leftarm2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(5, 85).addBox(-0.725F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1764F, 0.0373F, 0.9577F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r473 = leftarm2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(5, 29).addBox(-0.3F, -0.2F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1764F, 3.1524F, 0.8139F, 1.5708F, -1.3919F, -1.5708F));

		PartDefinition cube_r474 = leftarm2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(84, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6599F, 0.324F, 0.146F, 1.5708F, -0.7854F, -1.6232F));

		PartDefinition cube_r475 = leftarm2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(84, 51).addBox(-0.425F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5272F, -0.2618F, -1.6232F));

		PartDefinition cube_r476 = leftarm2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(37, 79).addBox(-0.5F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(32, 79).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6457F, 0.5941F, -0.1223F, 1.5708F, -1.1345F, -1.6232F));

		PartDefinition cube_r477 = leftarm2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(67, 86).addBox(-1.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(86, 65).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0561F, 11.845F, 2.3502F, 1.5708F, -0.0698F, -1.6232F));

		PartDefinition cube_r478 = leftarm2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(71, 49).addBox(-1.0F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0896F, 11.2059F, 2.0569F, 1.5708F, 0.3229F, -1.6232F));

		PartDefinition cube_r479 = leftarm2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(71, 35).addBox(-0.3F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0374F, 12.2014F, 1.6879F, 1.5708F, 0.1047F, -1.6232F));

		PartDefinition cube_r480 = leftarm2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(55, 86).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0401F, 12.1495F, 2.0038F, 1.5708F, -0.733F, -1.6232F));

		PartDefinition cube_r481 = leftarm2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(0, 32).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3933F, 5.4107F, 0.5497F, 1.5708F, -1.3875F, -1.6232F));

		PartDefinition cube_r482 = leftarm2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(66, 35).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5172F, 3.0469F, 0.1536F, 1.5708F, -1.405F, -1.6232F));

		PartDefinition cube_r483 = leftarm2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(66, 13).addBox(-0.35F, -1.175F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.5966F, 1.5305F, 0.0041F, 1.5708F, -1.4399F, -1.6232F));

		PartDefinition cube_r484 = leftarm2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(12, 76).addBox(-0.45F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1764F, 1.8542F, 0.897F, 1.5708F, -1.3352F, -1.5708F));

		PartDefinition cube_r485 = leftarm2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(27, 53).addBox(-0.45F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1764F, 1.8542F, 0.897F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1766F, 12.889F, 2.5594F, 0.0262F, -0.0014F, 0.0013F));

		PartDefinition cube_r486 = leftArm3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(36, 28).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 6.2147F, 0.1009F, -0.2967F, 0.0037F, -0.0024F));

		PartDefinition cube_r487 = leftArm4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(63, 95).addBox(-0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 95).addBox(-0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 95).addBox(0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 95).addBox(0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8051F, -1.8449F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r488 = leftArm4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(38, 66).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5328F, -1.7485F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r489 = leftArm4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, -0.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0971F, 3.5356F, -1.7691F, 0.2597F, 0.0202F, -0.0354F));

		PartDefinition cube_r490 = rightarm.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(69, 69).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0105F, 0.6992F, -0.6796F, -2.4348F, -0.0014F, 0.001F));

		PartDefinition cube_r491 = rightarm.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(62, 69).addBox(-1.0F, -0.7F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0113F, 0.0926F, -0.8585F, 2.4085F, -0.0014F, 0.001F));

		PartDefinition cube_r492 = rightarm.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(38, 69).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0102F, -0.1142F, 0.0457F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r493 = rightarm.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(71, 52).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.01F, 0.5707F, -0.2883F, -1.1695F, -0.0014F, 0.001F));

		PartDefinition cube_r494 = rightarm.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.001F, 10.862F, -4.9641F, 2.0812F, -0.0009F, 0.0013F));

		PartDefinition cube_r495 = rightarm.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 11.1662F, -4.3337F, 1.1213F, -0.0009F, 0.0013F));

		PartDefinition cube_r496 = rightarm.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(92, 71).addBox(-0.5F, -0.85F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0001F, 10.7474F, -3.7728F, 0.6413F, -0.0009F, 0.0013F));

		PartDefinition cube_r497 = rightarm.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(70, 92).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0007F, 10.1043F, -3.4964F, -0.4059F, -0.0009F, 0.0013F));

		PartDefinition cube_r498 = rightarm.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(77, 76).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0023F, 8.5146F, -2.894F, -0.3622F, -0.0009F, 0.0013F));

		PartDefinition cube_r499 = rightarm.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(39, 60).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0072F, 4.749F, -2.8912F, -0.1877F, -0.0009F, 0.0013F));

		PartDefinition cube_r500 = rightarm.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(41, 43).addBox(-0.9882F, -1.0263F, -0.1862F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5F, 1.0885F, -1.8986F, -0.2619F, -0.0009F, 0.0015F));

		PartDefinition cube_r501 = rightarm.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.0929F, -2.2001F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r502 = rightarm.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5F, -0.6F, -0.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.546F, -0.7975F, -0.4451F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.8661F, -4.6821F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r503 = rightarm2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(35, 94).addBox(-1.4F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1764F, -1.7537F, 1.316F, -1.5708F, -1.1694F, -1.5708F));

		PartDefinition cube_r504 = rightarm2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(93, 21).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.1764F, -1.7537F, 1.316F, 1.5708F, -1.1868F, 1.5708F));

		PartDefinition cube_r505 = rightarm2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(93, 12).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.1764F, -1.7537F, 1.316F, 1.5708F, -0.2269F, 1.5708F));

		PartDefinition cube_r506 = rightarm2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(93, 9).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.1764F, -0.9562F, 1.2532F, 1.5708F, -1.4923F, 1.5708F));

		PartDefinition cube_r507 = rightarm2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(93, 6).addBox(-0.3F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.1764F, -0.3644F, 1.1542F, -1.5708F, -0.1658F, -1.5708F));

		PartDefinition cube_r508 = rightarm2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(92, 86).addBox(-0.275F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.1764F, 0.0373F, 0.9577F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r509 = rightarm2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(10, 29).addBox(-0.7F, -0.2F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1764F, 3.1524F, 0.8139F, 1.5708F, 1.3919F, 1.5708F));

		PartDefinition cube_r510 = rightarm2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(92, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6599F, 0.324F, 0.146F, 1.5708F, 0.7854F, 1.6232F));

		PartDefinition cube_r511 = rightarm2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(92, 80).addBox(-0.575F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5272F, 0.2618F, 1.6232F));

		PartDefinition cube_r512 = rightarm2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(42, 79).addBox(-0.5F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(79, 38).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6457F, 0.5941F, -0.1223F, 1.5708F, 1.1345F, 1.6232F));

		PartDefinition cube_r513 = rightarm2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(80, 92).addBox(0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(92, 77).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0561F, 11.845F, 2.3502F, 1.5708F, 0.0698F, 1.6232F));

		PartDefinition cube_r514 = rightarm2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(72, 38).addBox(-1.0F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0896F, 11.2059F, 2.0569F, 1.5708F, -0.3229F, 1.6232F));

		PartDefinition cube_r515 = rightarm2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(36, 72).addBox(-1.7F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0374F, 12.2014F, 1.6879F, 1.5708F, -0.1047F, 1.6232F));

		PartDefinition cube_r516 = rightarm2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(75, 92).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0401F, 12.1495F, 2.0038F, 1.5708F, 0.733F, 1.6232F));

		PartDefinition cube_r517 = rightarm2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(33, 6).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.3933F, 5.4107F, 0.5497F, 1.5708F, 1.3875F, 1.6232F));

		PartDefinition cube_r518 = rightarm2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(31, 70).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5172F, 3.0469F, 0.1536F, 1.5708F, 1.405F, 1.6232F));

		PartDefinition cube_r519 = rightarm2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(26, 70).addBox(-0.65F, -1.175F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.5966F, 1.5305F, 0.0041F, 1.5708F, 1.4399F, 1.6232F));

		PartDefinition cube_r520 = rightarm2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(78, 6).addBox(-0.55F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1764F, 1.8542F, 0.897F, 1.5708F, 1.3352F, 1.5708F));

		PartDefinition cube_r521 = rightarm2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(44, 60).addBox(-0.55F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1764F, 1.8542F, 0.897F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1766F, 12.889F, 2.5594F, 0.5498F, 0.0014F, -0.0013F));

		PartDefinition cube_r522 = rightArm3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(40, 11).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 6.2147F, 0.1009F, 0.6196F, -0.0037F, 0.0024F));

		PartDefinition cube_r523 = rightArm4.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(96, 15).addBox(0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 3).addBox(0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 0).addBox(-0.3F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 91).addBox(-0.9F, -0.675F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8051F, -1.8449F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r524 = rightArm4.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(70, 21).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.5328F, -1.7485F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r525 = rightArm4.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(60, 46).addBox(-2.0F, -0.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0206F, 3.3255F, -1.7106F, -0.1309F, 0.0F, 0.0873F));

		PartDefinition cube_r526 = bone2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1326F, -0.1815F, 0.2032F, 2.1528F, 0.4695F, -0.3018F));

		PartDefinition cube_r527 = bone2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5587F, -0.2993F, -0.3245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.15F, 0.0F, 0.0F, 1.5856F, 0.4695F, -0.3018F));

		PartDefinition cube_r528 = bone2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -2.575F, -1.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9073F, -4.6352F, 1.4079F, -0.7495F, 0.4451F, -0.3737F));

		PartDefinition cube_r529 = bone2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(46, 43).addBox(-0.5F, -2.525F, -0.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6488F, -3.0746F, 0.7182F, -0.4441F, 0.4451F, -0.3737F));

		PartDefinition cube_r530 = bone2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(62, 74).addBox(-0.5F, -0.525F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0229F, -7.321F, 1.2649F, -0.7208F, 0.433F, -0.3661F));

		PartDefinition cube_r531 = bone2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, -1.975F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0347F, -4.1397F, -1.2443F, -1.6022F, 0.433F, -0.3661F));

		PartDefinition cube_r532 = bone2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.3139F, -5.0661F, -1.0907F, -0.1972F, 0.433F, -0.3661F));

		PartDefinition cube_r533 = bone2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(24, 75).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5013F, -5.9753F, -0.7652F, 1.199F, 0.433F, -0.3661F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(57, 32).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.5331F, -6.7838F, -0.2032F, 2.4644F, 0.433F, -0.3661F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(40, 85).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4065F, -7.4156F, 0.5419F, -2.5534F, 0.433F, -0.3661F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.1945F, -7.919F, 1.36F, -1.1572F, 0.433F, -0.3661F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(62, 85).addBox(-0.5F, 0.7F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(45, 85).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 75).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3007F, -2.3213F, -1.1485F, 1.9844F, 0.433F, -0.3661F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(66, 25).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2071F, -3.1434F, -0.3442F, 1.7226F, 0.433F, -0.3661F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(18, 16).addBox(-0.6F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3193F, -3.9253F, -0.2132F, 1.4646F, 0.0033F, -0.3591F));

		PartDefinition cube_r540 = bone2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5587F, -0.5121F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 0.0F, 0.0F, 0.9996F, 0.4715F, -0.2808F));

		PartDefinition cube_r541 = bone2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5587F, -0.1968F, 0.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.15F, 0.0F, 0.0F, 1.8723F, 0.4715F, -0.2808F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0206F, 3.3255F, -1.7106F, -0.1309F, 0.0F, -0.0873F));

		PartDefinition cube_r542 = bone5.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1326F, -0.1815F, 0.2032F, 2.1528F, -0.4695F, 0.3018F));

		PartDefinition cube_r543 = bone5.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.4413F, -0.2993F, -0.3245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.0F, 0.0F, 1.5856F, -0.4695F, 0.3018F));

		PartDefinition cube_r544 = bone5.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(27, 28).mirror().addBox(-0.5F, -2.575F, -1.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9073F, -4.6352F, 1.4079F, -0.7495F, -0.4451F, 0.3737F));

		PartDefinition cube_r545 = bone5.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.5F, -2.525F, -0.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6488F, -3.0746F, 0.7182F, -0.4441F, -0.4451F, 0.3737F));

		PartDefinition cube_r546 = bone5.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(-0.5F, -0.525F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0229F, -7.321F, 1.2649F, -0.7208F, -0.433F, 0.3661F));

		PartDefinition cube_r547 = bone5.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-0.5F, -1.975F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0347F, -4.1397F, -1.2443F, -1.6022F, -0.433F, 0.3661F));

		PartDefinition cube_r548 = bone5.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.3139F, -5.0661F, -1.0907F, -0.1972F, -0.433F, 0.3661F));

		PartDefinition cube_r549 = bone5.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5013F, -5.9753F, -0.7652F, 1.199F, -0.433F, 0.3661F));

		PartDefinition cube_r550 = bone5.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.5331F, -6.7838F, -0.2032F, 2.4644F, -0.433F, 0.3661F));

		PartDefinition cube_r551 = bone5.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(40, 85).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4065F, -7.4156F, 0.5419F, -2.5534F, -0.433F, 0.3661F));

		PartDefinition cube_r552 = bone5.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.1945F, -7.919F, 1.36F, -1.1572F, -0.433F, 0.3661F));

		PartDefinition cube_r553 = bone5.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(62, 85).mirror().addBox(-0.5F, 0.7F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(45, 85).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 75).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3007F, -2.3213F, -1.1485F, 1.9844F, -0.433F, 0.3661F));

		PartDefinition cube_r554 = bone5.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2071F, -3.1434F, -0.3442F, 1.7226F, -0.433F, 0.3661F));

		PartDefinition cube_r555 = bone5.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(18, 16).mirror().addBox(-0.4F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3193F, -3.9253F, -0.2132F, 1.4646F, -0.0033F, 0.3591F));

		PartDefinition cube_r556 = bone5.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.4413F, -0.5121F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.0F, 0.0F, 0.9996F, -0.4715F, 0.2808F));

		PartDefinition cube_r557 = bone5.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.4413F, -0.1968F, 0.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.0F, 0.0F, 1.8723F, -0.4715F, 0.2808F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.9425F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, 0.0544F, 0.0176F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5103F, 3.586F, -0.4835F, -0.116F, 0.0607F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(56, 22).addBox(-0.5F, -0.1145F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1627F, 2.9551F, -0.5361F, -0.1127F, 0.0667F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 56).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.296F, 1.8055F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(46, 56).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.132F, 0.1298F, 0.0172F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(53, 56).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(7, 57).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.176F, 0.1289F, 0.0229F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(32, 57).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1787F, 0.2148F, 0.0385F));

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