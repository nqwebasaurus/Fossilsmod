package fossils.fossils.client.blockentity.model.thylacosmilus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThylacosmilusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
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
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public ThylacosmilusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
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
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
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
		this.bone3 = this.chest.getChild("bone3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.023F, 12.9507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 90).addBox(0.0F, -1.189F, -0.9992F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, -1.4678F, -0.9129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 90).addBox(0.0F, -1.376F, -0.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 46).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 24).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 46).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 24).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, 0.5604F, -0.6793F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 55).addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5159F, -0.2857F, 1.5909F, -0.9697F, 0.1018F, 0.0812F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 37).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0552F, -1.8945F, 0.3831F, -0.8737F, 0.1018F, 0.0812F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 75).addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1054F, -1.5064F, 0.2012F, -0.9174F, 0.1018F, 0.0812F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0604F, -1.9802F, 1.4429F, -0.5247F, 0.1018F, 0.0812F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0041F, -1.8736F, 0.898F, -1.8337F, 0.1018F, 0.0812F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1058F, -1.4638F, 2.3149F, -1.0221F, 0.1018F, 0.0812F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 75).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1057F, -0.1317F, 2.3624F, -1.2503F, 0.1215F, 0.0467F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 12).addBox(-0.3683F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.3564F, 0.1663F, -0.1795F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 43).addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.206F, 1.2694F, 2.3226F, -1.8713F, 0.1663F, -0.1795F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 22).addBox(-0.3683F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.0859F, 0.1663F, -0.1795F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(37, 41).addBox(-0.9F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2033F, 1.514F, 0.9063F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 23).addBox(-0.1571F, 0.1755F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(74, 58).addBox(-1.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9891F, 2.4027F, 3.5458F, -1.7134F, 0.1311F, 0.1653F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 68).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9793F, 2.3954F, 3.5795F, 0.3969F, 0.0647F, 0.2403F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 20).addBox(-1.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9891F, 2.4027F, 3.5458F, -0.7099F, 0.1311F, 0.1653F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(23, 41).addBox(-0.8198F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -2.1006F, -0.6518F, 1.6723F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(80, 17).addBox(-0.3883F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 17).addBox(-0.3883F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -1.6633F, -0.8107F, 1.0317F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9002F, 5.4946F, 3.5758F, 0.3089F, 0.7259F, 0.7733F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 54).addBox(-0.1571F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -0.8692F, 0.7259F, 0.7733F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8812F, 0.5604F, -0.6793F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5159F, -0.2857F, 1.5909F, -0.9697F, -0.1018F, -0.0812F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 37).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0552F, -1.8945F, 0.3831F, -0.8737F, -0.1018F, -0.0812F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 75).mirror().addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1054F, -1.5064F, 0.2012F, -0.9174F, -0.1018F, -0.0812F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0604F, -1.9802F, 1.4429F, -0.5247F, -0.1018F, -0.0812F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0041F, -1.8736F, 0.898F, -1.8337F, -0.1018F, -0.0812F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 75).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1058F, -1.4638F, 2.3149F, -1.0221F, -0.1018F, -0.0812F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1057F, -0.1317F, 2.3624F, -1.2503F, -0.1215F, -0.0467F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 12).mirror().addBox(-0.6317F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.3564F, -0.1663F, 0.1795F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 43).mirror().addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.206F, 1.2694F, 2.3226F, -1.8713F, -0.1663F, 0.1795F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(42, 22).mirror().addBox(-0.6317F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.0859F, -0.1663F, 0.1795F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(37, 41).mirror().addBox(-0.1F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2033F, 1.514F, 0.9063F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-0.8429F, 0.1755F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(0.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 2.4027F, 3.5458F, -1.7134F, -0.1311F, -0.1653F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 2.3954F, 3.5795F, 0.3969F, -0.0647F, -0.2403F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(0.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 2.4027F, 3.5458F, -0.7099F, -0.1311F, -0.1653F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(23, 41).mirror().addBox(-0.1802F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -2.1006F, 0.6518F, -1.6723F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-0.6117F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 17).mirror().addBox(-0.6117F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -1.6633F, 0.8107F, -1.0317F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9002F, 5.4946F, 3.5758F, 0.3089F, -0.7259F, -0.7733F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.8429F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -0.8692F, -0.7259F, -0.7733F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(65, 9).addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2F, 2.7705F, 1.6667F, -1.9484F, -0.2171F, 0.0212F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 15).addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 90).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(56, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 20).addBox(-0.5F, -0.6415F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(14, 51).addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(65, 13).addBox(-0.5F, -0.0665F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 41).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, -0.275F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.0318F, 0.4857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 23).addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 20).addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 29).addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 18).addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 26).addBox(-1.997F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 35).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -3.0222F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 71).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(87, 50).addBox(-1.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 71).addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 14).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.2318F, 0.7512F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftArm5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(91, 33).addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 27).addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 24).addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 91).addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5303F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftArm5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(25, 37).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.2F, 2.7705F, 1.6667F, -2.0027F, 0.2387F, -0.1086F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 21).addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 18).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(55, 87).addBox(-0.5F, -0.6415F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -0.0665F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(63, 43).addBox(-1.0F, -0.275F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.0318F, 0.4857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(24, 63).addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(63, 21).addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 32).addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 64).addBox(-0.003F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 64).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(5, 41).addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(53, 63).addBox(-0.5F, -3.0222F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(20, 72).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(60, 87).addBox(0.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.9794F, 0.0382F, 0.0785F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(25, 72).addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 53).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.2318F, 0.7512F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightArm5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(90, 91).addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 91).addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 91).addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 47).addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5303F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightArm5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(34, 37).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.097F, -3.4512F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 16).addBox(0.0F, -1.5846F, -0.9952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2986F, -0.9047F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 90).addBox(0.0F, -1.7545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6986F, -2.8046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-1.7472F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.4801F, -1.5797F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.4801F, -3.5797F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(65, 41).addBox(-0.2528F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.4801F, -1.5797F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 39).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.4801F, -3.5797F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.1513F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7675F, -13.3658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(46, 90).addBox(0.0F, -1.6645F, -4.034F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7933F, -3.7586F, -0.1139F, -0.0867F, 0.0099F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.0995F, 0.5518F, -0.7761F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.2512F, 0.5057F, -1.0749F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.4308F, 0.3693F, -1.4928F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.1564F, 0.5021F, -0.8047F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.2879F, 0.444F, -1.0917F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(17, 43).mirror().addBox(-4.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.4365F, 0.2997F, -1.4947F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-0.8222F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.1744F, 0.4935F, -0.7086F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(31, 47).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.302F, 0.4313F, -0.9931F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-6.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.4435F, 0.283F, -1.3921F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(59, 51).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.0995F, -0.5518F, 0.7761F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 0).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.2512F, -0.5057F, 1.0749F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(67, 6).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.4308F, -0.3693F, 1.4928F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 35).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.1564F, -0.5021F, 0.8047F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 48).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.2879F, -0.444F, 1.0917F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(17, 43).addBox(3.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.4365F, -0.2997F, 1.4947F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 41).addBox(-0.1778F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.1744F, -0.4935F, 0.7086F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(31, 47).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.302F, -0.4313F, 0.9931F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 20).addBox(3.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.4435F, -0.283F, 1.3921F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(49, 90).addBox(0.0F, -1.8205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -2.1528F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 6).addBox(0.0F, -2.1938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3949F, -5.8528F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 76).addBox(0.0F, -2.6205F, 0.0438F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(75, 65).addBox(0.0F, -2.6649F, -0.1021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, 0.4919F, -0.6846F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(35, 45).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, 0.4239F, -0.9668F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-7.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, 0.2686F, -1.3612F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(17, 66).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(26, 45).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(17, 45).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(24, 66).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, -0.4919F, 0.6846F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(35, 45).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, -0.4239F, 0.9668F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 33).addBox(4.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, -0.2686F, 1.3612F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 66).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(26, 45).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(17, 45).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, -0.3759F, -3.9807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 66).addBox(0.0F, -3.2121F, -0.1182F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(5, 76).addBox(0.0F, -2.9687F, -0.0408F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5809F, -1.8018F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(65, 64).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, 0.4417F, -0.6487F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 4).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, 0.3681F, -0.9223F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, 0.2121F, -1.309F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.445F, 0.229F, -1.308F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-5.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3261F, 0.3819F, -0.9181F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2136F, 0.4522F, -0.6421F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 64).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, -0.4417F, 0.6487F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(41, 4).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, -0.3681F, 0.9223F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 62).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, -0.2121F, 1.309F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(74, 51).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.445F, -0.229F, 1.308F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 18).addBox(2.2438F, -0.807F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3261F, -0.3819F, 0.9181F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(74, 36).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2136F, -0.4522F, 0.6421F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.0333F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 76).addBox(0.0F, -2.7606F, -0.0758F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4094F, -1.7777F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-2.8F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2882F, 5.3679F, -0.4334F, 0.4817F, 0.143F, 0.3023F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.4481F, 0.284F, -1.3062F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.3061F, 0.4339F, -0.9076F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.1776F, 0.4971F, -0.623F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(25, 35).mirror().addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0419F, 4.2939F, 3.7776F, 0.465F, 0.242F, 0.3763F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(28, 17).mirror().addBox(-3.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5915F, 5.4758F, 0.8458F, 0.4795F, 0.2019F, 0.2835F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(16, 31).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.4481F, -0.284F, 1.3062F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 35).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.3061F, -0.4339F, 0.9076F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 48).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.1776F, -0.4971F, 0.623F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(25, 35).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0419F, 4.2939F, 3.7776F, 0.465F, -0.242F, -0.3763F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(40, 31).addBox(-0.2F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2882F, 5.3679F, -0.4334F, 0.4817F, -0.143F, -0.3023F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(28, 17).addBox(-0.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5915F, 5.4758F, 0.8458F, 0.4795F, -0.2019F, -0.2835F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(22, 28).addBox(-0.5F, -1.0261F, -3.0609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.2581F, 2.2051F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, -0.3756F, -1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1865F, -0.1132F, -0.1093F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 76).addBox(0.0F, -2.485F, -0.1495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4588F, -1.6659F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 30).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.2821F, 0.4613F, -1.0543F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.1449F, 0.5172F, -0.7643F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(67, 59).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.1449F, -0.5172F, 0.7643F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(49, 30).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.2821F, -0.4613F, 1.0543F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(46, 6).addBox(-0.5F, -0.8713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(37, 90).addBox(0.0F, -1.4076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7639F, -1.0128F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(7, 31).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9638F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(40, 90).addBox(0.0F, -1.7423F, -1.0693F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, 0.0007F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(30, 41).addBox(-0.5F, -1.1F, 1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.9993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.05F, 0.0774F, -0.0806F, -0.0934F));

		PartDefinition cube_r170 = neck5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(52, 90).addBox(0.0F, -1.9423F, -0.0193F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0168F, -2.8955F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(67, 90).addBox(0.0F, -1.2423F, -0.2193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3209F, -0.787F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 22).addBox(-0.5F, -1.1F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(78, 79).addBox(-0.5F, 0.0068F, -0.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0886F, -2.9803F, -0.1044F, -0.2319F, -0.1044F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(37, 14).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5068F, 0.544F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(7, 51).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -0.956F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, -0.101F, -2.3564F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0903F, 0.0384F, 0.4849F, -0.0201F, -0.0009F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4753F, -1.5261F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(47, 26).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3815F, 0.8877F, -1.2582F, 0.5877F, 0.0633F, 0.0942F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(31, 28).addBox(-0.525F, -0.3F, -1.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3815F, 0.8877F, -1.2582F, 0.5877F, -0.0633F, -0.0942F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(74, 4).addBox(-0.5F, -0.0263F, -0.0506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5913F, -3.8049F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(11, 26).addBox(-1.0F, -0.825F, 0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.7992F, -2.5215F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 58).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1037F, -3.3654F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 78).addBox(-0.6F, -0.9495F, -0.8079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9685F, -2.4303F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(78, 70).addBox(-1.0F, -0.271F, -1.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9546F, -5.4414F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(67, 55).addBox(-1.0F, 0.0638F, -0.0967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.1546F, -4.5414F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(24, 47).addBox(-1.5F, 0.0468F, -0.0172F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.0546F, -5.0414F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(17, 47).addBox(-1.0F, -1.0F, -0.775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(57, 53).addBox(-1.0F, -0.7F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5543F, -4.6838F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 58).addBox(-2.0F, 1.0279F, -0.7937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 2.2546F, -5.1414F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.702F, -3.116F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(37, 6).addBox(-1.0F, -0.625F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.1768F, -4.2175F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(57, 37).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 5.4478F, -4.5293F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(28, 78).addBox(0.006F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.59F, -1.7341F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(70, 20).addBox(-0.5F, -1.325F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.006F, -0.0634F, -0.6417F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(36, 33).addBox(-0.6F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.394F, -0.7885F, -0.9798F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(8, 78).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3809F, -2.5556F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(85, 86).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.494F, 2.6784F, -5.6633F, -0.3384F, 0.8262F, -0.2532F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(20, 82).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.506F, 2.6784F, -5.6633F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.506F, 1.7274F, -5.3543F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 82).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.506F, 0.8444F, -4.8848F, 2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.506F, 0.0057F, -4.3401F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(73, 81).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.506F, -0.6303F, -3.5685F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(77, 61).addBox(0.994F, 0.1288F, -0.6277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.8714F, -2.9748F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(77, 53).addBox(0.0F, -0.475F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5194F, -2.6502F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(77, 38).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 36).addBox(-0.5F, -0.975F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.1445F, -2.1453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(10, 67).addBox(0.498F, -0.0843F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.5F, -2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(76, 29).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9F, -0.0135F, -0.1869F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0177F, 5.4062F, -4.4852F, -0.0222F, -0.2318F, -0.1668F));

		PartDefinition cube_r206 = leftCanine.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 12).addBox(-0.2421F, -3.9468F, -0.5473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, -0.6772F, 0.1853F, 0.0618F));

		PartDefinition cube_r207 = leftCanine.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 8).addBox(-0.2421F, -2.7113F, 0.0265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, -0.4154F, 0.1853F, 0.0618F));

		PartDefinition cube_r208 = leftCanine.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 47).addBox(-0.2421F, -1.7281F, 0.2634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, -0.1099F, 0.1853F, 0.0618F));

		PartDefinition cube_r209 = leftCanine.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(69, 50).addBox(-0.5F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.063F, -1.0687F, 0.3502F, 0.1082F, 0.1853F, 0.0618F));

		PartDefinition cube_r210 = leftCanine.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 67).addBox(-0.5F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0082F, -0.2232F, 0.25F, 0.2391F, 0.1853F, 0.0618F));

		PartDefinition cube_r211 = leftCanine.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(31, 67).addBox(-0.1718F, -0.9607F, -0.0568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, 0.5464F, 0.2551F, 0.0186F));

		PartDefinition cube_r212 = leftCanine.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 64).addBox(-0.2306F, -0.3408F, 0.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3915F, 0.3506F, -0.1397F, 0.3185F, 0.2028F, 0.0358F));

		PartDefinition cube_r213 = leftCanine.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(81, 35).addBox(-0.1278F, -3.3637F, 0.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(33, 81).addBox(-0.1278F, -2.9637F, 0.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, -1.8316F, 0.2551F, 0.0186F));

		PartDefinition cube_r214 = leftCanine.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(81, 29).addBox(-0.1278F, -2.6466F, -0.0299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, -1.9364F, 0.2551F, 0.0186F));

		PartDefinition cube_r215 = leftCanine.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(43, 81).addBox(-0.1278F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 81).addBox(-0.1278F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, -0.6797F, 0.2551F, 0.0186F));

		PartDefinition cube_r216 = leftCanine.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(28, 81).addBox(-0.1278F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, -0.4965F, 0.2551F, 0.0186F));

		PartDefinition cube_r217 = leftCanine.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(48, 81).addBox(-0.1278F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, 0.8038F, 0.2551F, 0.0186F));

		PartDefinition cube_r218 = leftCanine.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(63, 78).addBox(-0.1278F, 0.897F, -0.5178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, 0.9871F, 0.2551F, 0.0186F));

		PartDefinition cube_r219 = leftCanine.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(58, 78).addBox(-0.1718F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, 0.8125F, 0.2551F, 0.0186F));

		PartDefinition cube_r220 = leftCanine.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 78).addBox(-0.1718F, -0.2068F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3915F, 0.8256F, 0.2353F, 0.7253F, 0.2551F, 0.0186F));

		PartDefinition cube_r221 = leftCanine.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(43, 78).addBox(-0.2306F, -0.2035F, -0.1603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3915F, 0.3506F, -0.1397F, 0.5715F, 0.2028F, 0.0358F));

		PartDefinition cube_r222 = leftCanine.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(68, 81).addBox(-0.2421F, 2.8584F, 0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, 2.2812F, 0.1853F, 0.0618F));

		PartDefinition cube_r223 = leftCanine.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(63, 81).addBox(-0.2421F, -1.0268F, 2.4514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, 0.8849F, 0.1853F, 0.0618F));

		PartDefinition cube_r224 = leftCanine.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 35).addBox(-0.2421F, -2.9547F, -0.5538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, -0.5113F, 0.1853F, 0.0618F));

		PartDefinition cube_r225 = leftCanine.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(58, 81).addBox(-0.2421F, -0.6312F, -1.3958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, -1.9251F, 0.1853F, 0.0618F));

		PartDefinition cube_r226 = leftCanine.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(53, 81).addBox(-0.2421F, -0.181F, -0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3211F, -2.3739F, -0.7258F, 3.0928F, 0.1853F, 0.0618F));

		PartDefinition cube_r227 = leftCanine.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(81, 49).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0964F, -1.7774F, -0.7319F, 1.6092F, 0.1853F, 0.0618F));

		PartDefinition cube_r228 = leftCanine.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(19, 51).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1308F, -0.2127F, -0.3996F, 1.7838F, 0.1853F, 0.0618F));

		PartDefinition cube_r229 = leftCanine.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(38, 78).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0543F, -0.1829F, 0.0174F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0177F, 5.4062F, -4.4852F, -0.0222F, 0.2318F, 0.1668F));

		PartDefinition cube_r230 = rightCanine.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 70).addBox(-0.7579F, -3.9468F, -0.5473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, -0.6772F, -0.1853F, -0.0618F));

		PartDefinition cube_r231 = rightCanine.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(72, 61).addBox(-0.7579F, -2.7113F, 0.0265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, -0.4154F, -0.1853F, -0.0618F));

		PartDefinition cube_r232 = rightCanine.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(63, 74).addBox(-0.7579F, -1.7281F, 0.2634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, -0.1099F, -0.1853F, -0.0618F));

		PartDefinition cube_r233 = rightCanine.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(72, 54).addBox(-0.5F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.063F, -1.0687F, 0.3502F, 0.1082F, -0.1853F, -0.0618F));

		PartDefinition cube_r234 = rightCanine.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 72).addBox(-0.5F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0082F, -0.2232F, 0.25F, 0.2391F, -0.1853F, -0.0618F));

		PartDefinition cube_r235 = rightCanine.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(72, 39).addBox(-0.8283F, -0.9607F, -0.0568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, 0.5464F, -0.2551F, -0.0186F));

		PartDefinition cube_r236 = rightCanine.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(89, 44).addBox(-0.7694F, -0.3408F, 0.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3915F, 0.3506F, -0.1397F, 0.3185F, -0.2028F, -0.0358F));

		PartDefinition cube_r237 = rightCanine.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(89, 30).addBox(-0.8722F, -3.3637F, 0.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 3).addBox(-0.8722F, -2.9637F, 0.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, -1.8316F, -0.2551F, -0.0186F));

		PartDefinition cube_r238 = rightCanine.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(88, 82).addBox(-0.8722F, -2.6466F, -0.0299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, -1.9364F, -0.2551F, -0.0186F));

		PartDefinition cube_r239 = rightCanine.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 79).addBox(-0.8722F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 76).addBox(-0.8722F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, -0.6797F, -0.2551F, -0.0186F));

		PartDefinition cube_r240 = rightCanine.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(75, 88).addBox(-0.8722F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, -0.4965F, -0.2551F, -0.0186F));

		PartDefinition cube_r241 = rightCanine.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(88, 73).addBox(-0.8722F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, 0.8038F, -0.2551F, -0.0186F));

		PartDefinition cube_r242 = rightCanine.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(88, 70).addBox(-0.8722F, 0.897F, -0.5178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, 0.9871F, -0.2551F, -0.0186F));

		PartDefinition cube_r243 = rightCanine.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(88, 67).addBox(-0.8283F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, 0.8125F, -0.2551F, -0.0186F));

		PartDefinition cube_r244 = rightCanine.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(88, 64).addBox(-0.8283F, -0.2068F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3915F, 0.8256F, 0.2353F, 0.7253F, -0.2551F, -0.0186F));

		PartDefinition cube_r245 = rightCanine.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 61).addBox(-0.7694F, -0.2035F, -0.1603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3915F, 0.3506F, -0.1397F, 0.5715F, -0.2028F, -0.0358F));

		PartDefinition cube_r246 = rightCanine.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(20, 88).addBox(-0.7579F, 2.8584F, 0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, 2.2812F, -0.1853F, -0.0618F));

		PartDefinition cube_r247 = rightCanine.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(15, 88).addBox(-0.7579F, -1.0268F, 2.4514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, 0.8849F, -0.1853F, -0.0618F));

		PartDefinition cube_r248 = rightCanine.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(35, 72).addBox(-0.7579F, -2.9547F, -0.5538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, -0.5113F, -0.1853F, -0.0618F));

		PartDefinition cube_r249 = rightCanine.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 6).addBox(-0.7579F, -0.6312F, -1.3958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, -1.9251F, -0.1853F, -0.0618F));

		PartDefinition cube_r250 = rightCanine.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 88).addBox(-0.7579F, -0.181F, -0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3211F, -2.3739F, -0.7258F, 3.0928F, -0.1853F, -0.0618F));

		PartDefinition cube_r251 = rightCanine.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0964F, -1.7774F, -0.7319F, 1.6092F, -0.1853F, -0.0618F));

		PartDefinition cube_r252 = rightCanine.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(50, 53).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1308F, -0.2127F, -0.3996F, 1.7838F, -0.1853F, -0.0618F));

		PartDefinition cube_r253 = rightCanine.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(65, 87).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0543F, -0.1829F, 0.0174F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(28, 6).addBox(-0.975F, -0.525F, -2.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 6).addBox(-0.975F, -0.525F, -2.35F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6856F, -5.8474F, 2.8334F, 0.6121F, 0.1505F, -0.2643F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(58, 90).addBox(-0.335F, -0.394F, -1.3598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.0674F, 2.0879F, 0.7014F, 0.1186F, 0.0556F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(70, 90).addBox(0.0F, -0.5156F, 0.0057F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0856F, -2.1038F, 2.4263F, 0.5424F, 0.3799F, 0.0594F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(90, 85).addBox(-0.0044F, -0.5724F, -0.7757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0856F, -2.1038F, 2.4263F, 0.7169F, 0.3799F, 0.0594F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(83, 83).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(48, 67).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0557F, -1.8668F, 2.3673F, 0.7592F, 0.2135F, 0.0799F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(65, 84).addBox(0.3048F, -0.6008F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 84).addBox(-0.2952F, -0.6008F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4963F, -0.9359F, -0.1191F, 2.0018F, -0.3585F, 1.4134F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(85, 12).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2915F, -0.3159F, -0.4004F, 1.6528F, -0.3585F, 1.4134F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 85).addBox(-0.1F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 84).addBox(-0.1F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4826F, -1.4546F, -0.739F, 0.3487F, -0.7878F, 2.8812F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 15).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4326F, -1.4546F, -0.739F, 1.3314F, -1.4277F, 1.4722F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(85, 9).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4326F, -1.4546F, -0.739F, 2.5255F, -1.0914F, 0.216F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 85).addBox(-0.7063F, -0.2108F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3815F, -0.9401F, -0.6159F, 1.6774F, -0.2151F, 1.4803F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(84, 55).addBox(-0.8313F, -0.6108F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4963F, -0.9359F, -0.1191F, 1.9829F, -0.2151F, 1.4803F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(5, 87).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0173F, -1.5927F, -0.2792F, 1.4006F, 0.2213F, 1.414F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(83, 80).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2198F, -0.9662F, -0.245F, 1.4031F, -0.1402F, 1.4753F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 53).addBox(2.0318F, -1.3056F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 1.3989F, -0.2606F, 1.4963F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(83, 77).addBox(0.7805F, 2.3967F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 1.1952F, 1.1035F, 1.1132F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(83, 74).addBox(1.3396F, 1.391F, -1.232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 1.3631F, 0.6416F, 1.3262F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.601F, -1.3596F, 0.5242F, 0.8103F, 1.3287F, 0.7059F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(83, 62).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0229F, -2.1327F, -0.067F, -0.9026F, 1.2801F, -0.9166F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(83, 6).addBox(-0.9393F, 0.8663F, -1.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, -0.3293F, 0.8015F, -0.2756F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(83, 65).addBox(-0.9962F, -1.0008F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 0.5876F, 1.1904F, -0.9834F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(80, 86).addBox(-0.9971F, -1.0026F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 1.0876F, 0.7771F, -0.3602F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 82).addBox(-0.9971F, -1.0026F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0687F, -3.4448F, 0.3205F, 1.1225F, 0.7771F, -0.3602F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(83, 71).addBox(-1.0F, -0.875F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0687F, -4.2879F, 0.7622F, 2.0969F, 1.0719F, -1.1572F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(83, 68).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0687F, -4.2879F, 0.7622F, 2.1946F, 0.954F, -0.8478F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 59).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.806F, -4.6051F, 0.1657F, 2.4748F, 0.7089F, -0.4735F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 52).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.806F, -5.4438F, 0.7103F, -2.3364F, 0.6666F, -0.5363F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(82, 38).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.806F, -6.0799F, 1.4819F, -1.0627F, 0.4881F, -0.6999F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(45, 84).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.806F, -6.171F, 1.9736F, 0.141F, 0.1174F, -0.6898F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(53, 57).addBox(-1.4814F, -0.8616F, -0.5588F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5186F, 0.1147F, 0.258F, 0.5549F, 0.2291F, 0.0517F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(68, 78).addBox(-1.0467F, -0.8615F, -0.1262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2028F, -2.1953F, 2.4431F, 0.4863F, 0.301F, 0.1987F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(78, 67).addBox(-1.0468F, -1.0139F, -1.6175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5337F, -2.5091F, 3.1004F, 0.7158F, 0.3625F, 0.2336F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(28, 6).mirror().addBox(-0.025F, -0.525F, -2.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 6).mirror().addBox(-0.025F, -0.525F, -2.35F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6856F, -5.8474F, 2.8334F, 0.6121F, -0.1505F, 0.2643F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 90).mirror().addBox(0.335F, -0.394F, -1.3598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -2.0674F, 2.0879F, 0.7014F, -0.1186F, -0.0556F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(70, 90).mirror().addBox(0.0F, -0.5156F, 0.0057F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0856F, -2.1038F, 2.4263F, 0.5424F, -0.3799F, -0.0594F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(0.0044F, -0.5724F, -0.7757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0856F, -2.1038F, 2.4263F, 0.7169F, -0.3799F, -0.0594F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(83, 83).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(48, 67).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0557F, -1.8668F, 2.3673F, 0.7592F, -0.2135F, -0.0799F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(65, 84).mirror().addBox(-1.3048F, -0.6008F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 84).mirror().addBox(-0.7048F, -0.6008F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4963F, -0.9359F, -0.1191F, 2.0018F, 0.3585F, -1.4134F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2915F, -0.3159F, -0.4004F, 1.6528F, 0.3585F, -1.4134F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.9F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 84).mirror().addBox(-0.9F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4826F, -1.4546F, -0.739F, 0.3487F, 0.7878F, -2.8812F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4326F, -1.4546F, -0.739F, 1.3314F, 1.4277F, -1.4722F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4326F, -1.4546F, -0.739F, 2.5255F, 1.0914F, -0.216F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.2937F, -0.2108F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3815F, -0.9401F, -0.6159F, 1.6774F, 0.2151F, -1.4803F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-0.1687F, -0.6108F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4963F, -0.9359F, -0.1191F, 1.9829F, 0.2151F, -1.4803F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0173F, -1.5927F, -0.2792F, 1.4006F, -0.2213F, -1.414F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2198F, -0.9662F, -0.245F, 1.4031F, 0.1402F, -1.4753F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-3.0317F, -1.3056F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 1.3989F, 0.2606F, -1.4963F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-1.7805F, 2.3967F, -1.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 1.1952F, -1.1035F, -1.1132F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-2.3396F, 1.391F, -1.232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 1.3631F, -0.6416F, -1.3262F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.601F, -1.3596F, 0.5242F, 0.8103F, -1.3287F, -0.7059F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(83, 62).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0229F, -2.1327F, -0.067F, -0.9026F, -1.2801F, 0.9166F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.0607F, 0.8663F, -1.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, -0.3293F, -0.8015F, 0.2756F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-0.0038F, -1.0008F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 0.5876F, -1.1904F, 0.9834F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(80, 86).mirror().addBox(-0.0029F, -1.0026F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 1.0876F, -0.7771F, 0.3602F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-0.0029F, -1.0026F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -3.4448F, 0.3205F, 1.1225F, -0.7771F, 0.3602F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(0.0F, -0.875F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -4.2879F, 0.7622F, 2.0969F, -1.0719F, 1.1572F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0687F, -4.2879F, 0.7622F, 2.1946F, -0.954F, 0.8478F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.806F, -4.6051F, 0.1657F, 2.4748F, -0.7089F, 0.4735F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.806F, -5.4438F, 0.7103F, -2.3364F, -0.6666F, 0.5363F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.806F, -6.0799F, 1.4819F, -1.0627F, -0.4881F, 0.6999F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.806F, -6.171F, 1.9736F, 0.141F, -0.1174F, 0.6898F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-0.5186F, -0.8616F, -0.5588F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5186F, 0.1147F, 0.258F, 0.5549F, -0.2291F, -0.0517F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(0.0468F, -0.8615F, -0.1262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2028F, -2.1953F, 2.4431F, 0.4863F, -0.301F, -0.1987F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(0.0468F, -1.0139F, -1.6175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -2.5091F, 3.1004F, 0.7158F, -0.3625F, -0.2336F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8732F, 0.5328F, 2.2909F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r318 = leftOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(35, 84).addBox(-0.8909F, -1.5707F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(30, 84).addBox(-0.8909F, -0.9707F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 0.921F, 0.3039F, 0.117F));

		PartDefinition cube_r319 = leftOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(68, 70).addBox(0.175F, -2.05F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2592F, -0.5506F, -5.3393F, -2.3534F, 0.6566F, 3.027F));

		PartDefinition cube_r320 = leftOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(70, 66).addBox(-0.2F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2592F, -0.5506F, -5.3393F, -2.7192F, 0.9118F, 2.5188F));

		PartDefinition cube_r321 = leftOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(55, 84).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6429F, -0.1753F, -5.6076F, 2.2451F, 0.4635F, 0.7742F));

		PartDefinition cube_r322 = leftOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(59, 48).addBox(-1.8F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3656F, 0.0532F, -6.0881F, 2.1798F, 0.218F, 0.5807F));

		PartDefinition cube_r323 = leftOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(7, 55).addBox(-2.2703F, 0.6155F, 0.6622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, -3.0893F, -0.5794F, -1.1416F));

		PartDefinition cube_r324 = leftOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(64, 3).addBox(-2.5267F, 0.2986F, 0.6991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 2.9137F, -0.6401F, -0.8778F));

		PartDefinition cube_r325 = leftOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 44).addBox(-2.0194F, -0.5072F, 0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 2.291F, -0.5609F, -0.0057F));

		PartDefinition cube_r326 = leftOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(40, 84).addBox(-2.0194F, -1.1045F, 0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 1.7238F, -0.5609F, -0.0057F));

		PartDefinition cube_r327 = leftOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(84, 32).addBox(-0.8909F, -1.7155F, 0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 1.7064F, 0.3039F, 0.117F));

		PartDefinition cube_r328 = leftOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(18, 79).addBox(-1.0129F, -0.8593F, -0.7867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 1.9682F, 0.3039F, 0.2566F));

		PartDefinition cube_r329 = leftOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(79, 3).addBox(-1.0129F, -0.3831F, -1.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 1.3487F, 0.3039F, 0.2566F));

		PartDefinition cube_r330 = leftOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5655F, -0.4705F, -0.7148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4437F, 1.0334F, -4.1678F, 0.9641F, 0.3981F, 0.1966F));

		PartDefinition cube_r331 = leftOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(80, 89).addBox(-0.535F, -0.3114F, -0.4904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.4437F, 1.1084F, -4.1678F, 2.3971F, 0.4837F, 0.2048F));

		PartDefinition cube_r332 = leftOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(5, 84).addBox(-0.4618F, 0.0552F, -0.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4437F, 1.1084F, -4.1678F, 1.8924F, 0.2925F, 0.0815F));

		PartDefinition cube_r333 = leftOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(50, 84).addBox(-1.1489F, 0.027F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.601F, -1.3321F, -3.5991F, -0.4073F, -0.6196F, 2.1045F));

		PartDefinition cube_r334 = leftOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(63, 70).addBox(-0.697F, -0.9717F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.601F, -1.3321F, -3.5991F, 0.4555F, -0.5874F, 0.7417F));

		PartDefinition cube_r335 = leftOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(60, 6).addBox(-1.9F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.4421F, -0.4209F, -2.7405F, 0.4748F, 0.0184F, -0.0166F));

		PartDefinition cube_r336 = leftOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(51, 41).addBox(-1.9F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1813F, -1.9158F, -3.5068F, 0.4691F, 0.078F, -0.1333F));

		PartDefinition cube_r337 = leftOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(10, 84).addBox(-1.3836F, -1.6866F, -0.1629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4437F, 1.1084F, -4.1678F, -1.9177F, 0.7578F, 2.9057F));

		PartDefinition cube_r338 = leftOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(84, 3).addBox(-1.2782F, 0.0371F, -0.1629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4437F, 1.1084F, -4.1678F, 2.1105F, 1.0695F, 0.4913F));

		PartDefinition cube_r339 = leftOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(78, 76).addBox(-0.535F, -0.7284F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4437F, 1.1084F, -4.1678F, 0.5819F, 0.4837F, 0.2048F));

		PartDefinition cube_r340 = leftOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(70, 43).addBox(-1.0508F, -2.127F, -0.7355F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 2.3858F, 0.4299F, 0.1648F));

		PartDefinition cube_r341 = leftOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(25, 84).addBox(-1.0508F, -1.965F, 0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, -3.112F, 0.4299F, 0.1648F));

		PartDefinition cube_r342 = leftOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(54, 26).addBox(-1.3069F, 0.3944F, 1.5555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, -2.0829F, 0.3265F, 0.0883F));

		PartDefinition cube_r343 = leftOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(78, 73).addBox(-1.3069F, -2.936F, -0.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.8579F, 0.7507F, -4.5731F, 2.0623F, 0.3265F, 0.0883F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8732F, 0.5328F, 2.2909F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.1091F, -1.5707F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(30, 84).mirror().addBox(-0.1091F, -0.9707F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 0.921F, -0.3039F, -0.117F));

		PartDefinition cube_r345 = rightOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-1.175F, -2.05F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, -0.5506F, -5.3393F, -2.3534F, -0.6566F, -3.027F));

		PartDefinition cube_r346 = rightOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-0.8F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, -0.5506F, -5.3393F, -2.7192F, -0.9118F, -2.5188F));

		PartDefinition cube_r347 = rightOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6429F, -0.1753F, -5.6076F, 2.2451F, -0.4635F, -0.7742F));

		PartDefinition cube_r348 = rightOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.2F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3656F, 0.0532F, -6.0881F, 2.1798F, -0.218F, -0.5807F));

		PartDefinition cube_r349 = rightOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(0.2703F, 0.6155F, 0.6622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, -3.0893F, 0.5794F, 1.1416F));

		PartDefinition cube_r350 = rightOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(64, 3).mirror().addBox(0.5267F, 0.2986F, 0.6991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 2.9137F, 0.6401F, 0.8778F));

		PartDefinition cube_r351 = rightOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(1.0194F, -0.5072F, 0.4012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 2.291F, 0.5609F, 0.0057F));

		PartDefinition cube_r352 = rightOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(1.0194F, -1.1045F, 0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 1.7238F, 0.5609F, 0.0057F));

		PartDefinition cube_r353 = rightOrbit.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-0.1091F, -1.7155F, 0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 1.7064F, -0.3039F, -0.117F));

		PartDefinition cube_r354 = rightOrbit.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(18, 79).mirror().addBox(0.0129F, -0.8593F, -0.7867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 1.9682F, -0.3039F, -0.2566F));

		PartDefinition cube_r355 = rightOrbit.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(0.0129F, -0.3831F, -1.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 1.3487F, -0.3039F, -0.2566F));

		PartDefinition cube_r356 = rightOrbit.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.4345F, -0.4705F, -0.7148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.0334F, -4.1678F, 0.9641F, -0.3981F, -0.1966F));

		PartDefinition cube_r357 = rightOrbit.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-0.4649F, -0.3114F, -0.4904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.1084F, -4.1678F, 2.3971F, -0.4837F, -0.2048F));

		PartDefinition cube_r358 = rightOrbit.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5382F, 0.0552F, -0.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.1084F, -4.1678F, 1.8924F, -0.2925F, -0.0815F));

		PartDefinition cube_r359 = rightOrbit.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(0.1489F, 0.027F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.601F, -1.3321F, -3.5991F, -0.4073F, 0.6196F, -2.1045F));

		PartDefinition cube_r360 = rightOrbit.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.303F, -0.9717F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.601F, -1.3321F, -3.5991F, 0.4555F, 0.5874F, -0.7417F));

		PartDefinition cube_r361 = rightOrbit.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.1F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.4421F, -0.4209F, -2.7405F, 0.4748F, -0.0184F, 0.0166F));

		PartDefinition cube_r362 = rightOrbit.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(51, 41).mirror().addBox(-0.1F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1813F, -1.9158F, -3.5068F, 0.4691F, -0.078F, 0.1333F));

		PartDefinition cube_r363 = rightOrbit.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(0.3836F, -1.6866F, -0.1629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.1084F, -4.1678F, -1.9177F, -0.7578F, -2.9057F));

		PartDefinition cube_r364 = rightOrbit.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.2782F, 0.0371F, -0.1629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.1084F, -4.1678F, 2.1105F, -1.0695F, -0.4913F));

		PartDefinition cube_r365 = rightOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-0.4649F, -0.7284F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4437F, 1.1084F, -4.1678F, 0.5819F, -0.4837F, -0.2048F));

		PartDefinition cube_r366 = rightOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(0.0508F, -2.127F, -0.7355F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 2.3858F, -0.4299F, -0.1648F));

		PartDefinition cube_r367 = rightOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(0.0508F, -1.965F, 0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, -3.112F, -0.4299F, -0.1648F));

		PartDefinition cube_r368 = rightOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(0.3069F, 0.3944F, 1.5555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, -2.0829F, -0.3265F, -0.0883F));

		PartDefinition cube_r369 = rightOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(0.3069F, -2.936F, -0.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 0.7507F, -4.5731F, 2.0623F, -0.3265F, -0.0883F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.3873F, -0.3422F, 2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(-0.032F, 0.0568F, 0.1556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.9671F, -2.5466F, -1.4295F, -0.2634F, -0.072F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(90, 88).mirror().addBox(0.2244F, 0.4213F, -2.7227F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.975F, 0.9671F, 0.6534F, -0.32F, -0.2063F, -0.1608F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(86, 47).mirror().addBox(0.1262F, 1.7649F, -0.2737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.9671F, -2.5466F, -1.1245F, -0.1739F, 0.0022F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(86, 35).mirror().addBox(-1.0516F, 0.7562F, 0.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, -0.5916F, -0.0601F, 0.0042F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.8521F, -0.6461F, 1.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, -0.0243F, -0.0601F, 0.0915F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-0.7808F, 0.5285F, -0.0945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(75, 85).mirror().addBox(-0.7808F, 0.8285F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.2171F, -6.1466F, 1.2554F, -0.1539F, 0.2159F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.7808F, -1.055F, 0.9368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.2171F, -6.1466F, 0.2605F, -0.1539F, 0.2159F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.7808F, 0.422F, 0.9845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.2171F, -6.1466F, 0.1907F, -0.1539F, 0.2159F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.7808F, -0.3525F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.2171F, -6.1466F, 2.512F, -0.1539F, 0.2159F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-0.7808F, -0.7521F, -1.7805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.2171F, -6.1466F, -2.4447F, -0.1539F, 0.2159F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.8521F, -1.4777F, 0.3744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, -1.089F, -0.0601F, 0.0915F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-0.8521F, -0.1729F, -0.4013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, 0.2811F, -0.0601F, 0.0915F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-1.0516F, -2.3042F, -2.1538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, 1.6337F, -0.0601F, 0.0042F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-1.0187F, -1.0417F, -0.2173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, -2.9384F, -0.1492F, -0.066F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-1.0187F, -0.9741F, 0.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, -2.7202F, -0.1492F, -0.066F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(-0.0351F, 1.3689F, -0.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(58, 67).mirror().addBox(-0.0351F, -0.1811F, -0.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.9671F, -2.5466F, -1.4133F, -0.2664F, -0.0648F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(0.0996F, 1.4586F, -0.327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -1.5733F, -0.1724F, 0.0191F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(0.0996F, 1.708F, -0.8259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -1.1984F, -0.1899F, 0.0192F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(0.1318F, 0.0089F, -0.5723F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.375F, 0.9671F, -1.8466F, -1.3259F, -0.2246F, -0.2474F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-1.0212F, -0.2492F, 0.3455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, -1.3847F, -0.1459F, -0.0729F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(0.0996F, -0.4657F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -0.3428F, -0.1724F, 0.0191F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(0.0996F, 0.8825F, -1.1988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -1.006F, -0.1724F, 0.0191F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(0.0996F, -0.4762F, -0.5337F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -1.3293F, -0.1899F, 0.0192F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.423F, -0.4312F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -2.3208F, -1.0448F, 0.5718F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-0.523F, -1.1669F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -0.2177F, -1.0448F, 0.5718F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(0.0387F, 0.04F, -1.843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.0171F, -4.6466F, -0.4329F, -0.0397F, 2.7986F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-0.0004F, 0.3289F, -1.5428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.9671F, -0.0466F, -1.3028F, -0.1724F, 0.0191F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9362F, 2.4996F, -6.6789F, 2.9558F, -0.0601F, 0.0042F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(90, 88).addBox(-0.2244F, 0.4213F, -2.7227F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.375F, 0.9671F, 0.6534F, -0.32F, 0.2063F, 0.1608F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(43, 90).addBox(-0.1318F, 0.0089F, -0.5723F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.775F, 0.9671F, -1.8466F, -1.3259F, 0.2246F, 0.2474F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(40, 27).addBox(0.0186F, -1.0417F, -0.2173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, -2.9384F, 0.1492F, 0.066F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(10, 75).addBox(0.0186F, -0.9741F, 0.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, -2.7202F, 0.1492F, 0.066F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(85, 21).addBox(-0.9649F, 1.3689F, -0.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(58, 67).addBox(-0.9649F, -0.1811F, -0.2585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7F, 0.9671F, -2.5466F, -1.4133F, 0.2664F, 0.0648F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(10, 71).addBox(-0.968F, 0.0568F, 0.1556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.9671F, -2.5466F, -1.4295F, 0.2634F, 0.072F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(74, 32).addBox(0.0212F, -0.2492F, 0.3455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, -1.3847F, 0.1459F, 0.0729F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(75, 11).addBox(-1.0996F, -0.4657F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -0.3428F, 0.1724F, -0.0191F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(20, 85).addBox(-1.0996F, 1.4586F, -0.327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -1.5733F, 0.1724F, -0.0191F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(79, 56).addBox(-1.0996F, 0.8825F, -1.1988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -1.006F, 0.1724F, -0.0191F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 18).addBox(-1.0996F, 1.708F, -0.8259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -1.1984F, 0.1899F, -0.0192F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(54, 32).addBox(-1.0996F, -0.4762F, -0.5337F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -1.3293F, 0.1899F, -0.0192F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(90, 9).addBox(-0.577F, -0.4312F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -2.3208F, 1.0448F, -0.5718F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(75, 8).addBox(-0.477F, -1.1669F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -0.2177F, 1.0448F, -0.5718F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(79, 32).addBox(-0.9996F, 0.3289F, -1.5428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.9671F, -0.0466F, -1.3028F, 0.1724F, -0.0191F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(86, 47).addBox(-1.1262F, 1.7649F, -0.2737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 0.9671F, -2.5466F, -1.1245F, 0.1739F, -0.0022F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(86, 35).addBox(0.0516F, 0.7562F, 0.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, -0.5916F, 0.0601F, -0.0042F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 27).addBox(-0.1479F, -0.6461F, 1.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, -0.0243F, 0.0601F, -0.0915F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(71, 0).addBox(-0.2192F, -1.055F, 0.9368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.6F, 4.2171F, -6.1466F, 0.2605F, 0.1539F, -0.2159F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(79, 46).addBox(-1.0387F, 0.04F, -1.843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, -0.4329F, 0.0397F, -2.7986F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(86, 0).addBox(-0.2192F, 0.422F, 0.9845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.2171F, -6.1466F, 0.1907F, 0.1539F, -0.2159F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(86, 24).addBox(-0.2192F, 0.5285F, -0.0945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(75, 85).addBox(-0.2192F, 0.8285F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6F, 4.2171F, -6.1466F, 1.2554F, 0.1539F, -0.2159F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(85, 41).addBox(-0.2192F, -0.3525F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.2171F, -6.1466F, 2.512F, 0.1539F, -0.2159F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(52, 49).addBox(-0.2192F, -0.7521F, -1.7805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6F, 4.2171F, -6.1466F, -2.4447F, 0.1539F, -0.2159F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 71).addBox(-0.1479F, -1.4777F, 0.3744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, -1.089F, 0.0601F, -0.0915F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(51, 45).addBox(-0.1479F, -0.1729F, -0.4013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8F, 3.0171F, -6.4466F, 0.2811F, 0.0601F, -0.0915F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(64, 51).addBox(0.0516F, -2.3042F, -2.1538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 1.0171F, -4.6466F, 1.6337F, 0.0601F, -0.0042F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(23, 79).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6638F, 2.4996F, -6.6789F, 2.9558F, 0.0601F, -0.0042F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r426 = sternum.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(22, 20).mirror().addBox(-9.4855F, 1.5605F, 2.2612F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.9418F, 0.6688F, 1.1176F));

		PartDefinition cube_r427 = sternum.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(25, 33).mirror().addBox(-7.3562F, 1.4039F, 2.2066F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.7803F, 0.5615F, 0.8719F));

		PartDefinition cube_r428 = sternum.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-6.1721F, 0.1579F, 1.7991F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.4901F, 0.5315F, 0.4456F));

		PartDefinition cube_r429 = sternum.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(28, 2).mirror().addBox(-5.289F, -0.4504F, -0.3221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.2936F, 0.4944F, 0.3726F));

		PartDefinition cube_r430 = sternum.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1729F, -2.0121F, 3.0279F, 0.2388F, 0.3659F, 0.3572F));

		PartDefinition cube_r431 = sternum.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(22, 20).addBox(3.3123F, 1.3994F, 2.5691F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.587F, -0.4838F, -0.922F));

		PartDefinition cube_r432 = sternum.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(25, 33).addBox(3.112F, 1.2479F, 2.4651F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.5009F, -0.3195F, -0.7513F));

		PartDefinition cube_r433 = sternum.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(28, 4).addBox(0.8405F, 0.0675F, 1.9797F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.3387F, -0.2118F, -0.3899F));

		PartDefinition cube_r434 = sternum.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(15, 7).addBox(-0.6942F, -0.9428F, 0.1211F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.2182F, 0.1745F, 0.0F));

		PartDefinition cube_r435 = sternum.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(28, 2).addBox(-0.0565F, -0.552F, -0.1768F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0583F, -0.0311F, 3.9402F, 0.167F, -0.1663F, -0.3309F));

		PartDefinition cube_r436 = sternum.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(28, 0).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9011F, -2.0121F, 3.0279F, 0.2388F, -0.3659F, -0.3572F));

		PartDefinition cube_r437 = sternum.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -1.3914F, -4.5715F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.3718F, 3.6464F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9035F, 4.1022F, -2.0546F, 1.133F, -0.009F, -0.0068F));

		PartDefinition cube_r438 = leftarm.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(26, 57).addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r439 = leftarm.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(19, 58).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0113F, 0.0926F, -0.8585F, 3.1066F, 0.0014F, -0.001F));

		PartDefinition cube_r440 = leftarm.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(58, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0102F, -0.1142F, 0.0457F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r441 = leftarm.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(57, 3).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.01F, 0.5707F, -0.2883F, -1.1695F, 0.0014F, -0.001F));

		PartDefinition cube_r442 = leftarm.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, -2.025F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 5.4321F, -0.4597F, 0.4188F, 0.0011F, -0.002F));

		PartDefinition cube_r443 = leftarm.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(80, 23).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0107F, 3.8649F, -1.5397F, -0.8727F, 0.0031F, 0.0019F));

		PartDefinition cube_r444 = leftarm.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(18, 76).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 2.8203F, -1.3939F, -0.0437F, 0.0031F, 0.0019F));

		PartDefinition cube_r445 = leftarm.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(65, 66).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4883F, 1.1621F, -1.897F, 0.1919F, 0.0014F, -0.001F));

		PartDefinition cube_r446 = leftarm.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r447 = leftarm.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.3915F, -0.2382F, -2.3513F, -0.1098F, 0.0714F));

		PartDefinition cube_r448 = leftarm2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(48, 57).addBox(-1.2849F, -0.3625F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.136F, -1.1702F, 1.3299F, 1.5708F, -1.4748F, -1.5708F));

		PartDefinition cube_r449 = leftarm2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(85, 89).addBox(-0.0585F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(68, 74).addBox(-0.0585F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, 7.0713F, 1.1022F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r450 = leftarm2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(10, 81).addBox(-0.35F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -0.2618F, -1.6232F));

		PartDefinition cube_r451 = leftarm2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(5, 81).addBox(-0.625F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5272F, -0.2618F, -1.6232F));

		PartDefinition cube_r452 = leftarm2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(81, 0).addBox(-0.6F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(80, 41).addBox(-0.6F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -1.1781F, -1.6232F));

		PartDefinition cube_r453 = leftarm2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(59, 30).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4604F, 4.1302F, -0.0335F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r454 = leftarm2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(36, 68).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.4923F, -1.6232F));

		PartDefinition cube_r455 = leftarm2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(53, 68).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4248F, 4.8097F, 0.6872F, 1.5708F, -1.2828F, -1.6232F));

		PartDefinition cube_r456 = leftarm2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(58, 43).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r457 = leftarm2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(43, 57).addBox(-0.0399F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1564F, 3.0773F, -0.388F, 1.5708F, -1.5272F, -1.6232F));

		PartDefinition cube_r458 = leftarm2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(81, 26).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.8838F, 0.0948F, 1.5708F, -0.2182F, -1.5708F));

		PartDefinition cube_r459 = leftarm2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(38, 59).addBox(-1.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1764F, 3.485F, 1.4674F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r460 = leftarm2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(33, 57).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1764F, 0.596F, 1.2146F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 6.3215F, 1.1274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r461 = leftArm3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 1.3606F, 0.0801F, 0.925F, 0.0037F, -0.0024F));

		PartDefinition cube_r462 = leftArm4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(55, 90).addBox(-1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 41).addBox(-1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 32).addBox(-0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 28).addBox(0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r463 = leftArm4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9035F, 4.1022F, -2.0546F, 1.2639F, 0.009F, 0.0068F));

		PartDefinition cube_r464 = rightarm.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightarm.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(60, 59).addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(60, 56).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0113F, 0.0926F, -0.8585F, 3.1066F, -0.0014F, 0.001F));

		PartDefinition cube_r466 = rightarm.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(53, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0102F, -0.1142F, 0.0457F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r467 = rightarm.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(26, 60).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.01F, 0.5707F, -0.2883F, -1.1695F, -0.0014F, 0.001F));

		PartDefinition cube_r468 = rightarm.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(60, 13).addBox(-0.5F, -2.025F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0044F, 5.4321F, -0.4597F, 0.4188F, -0.0011F, 0.002F));

		PartDefinition cube_r469 = rightarm.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0107F, 3.8649F, -1.5397F, -0.8727F, -0.0031F, -0.0019F));

		PartDefinition cube_r470 = rightarm.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0083F, 2.8203F, -1.3939F, -0.0437F, -0.0031F, -0.0019F));

		PartDefinition cube_r471 = rightarm.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(71, 28).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4883F, 1.1621F, -1.897F, 0.1919F, -0.0014F, 0.001F));

		PartDefinition cube_r472 = rightarm.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(26, 51).addBox(-1.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightarm.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(10, 87).addBox(-1.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.3915F, -0.2382F, -2.3701F, 0.0802F, -0.1638F));

		PartDefinition cube_r474 = rightarm2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(48, 62).addBox(0.2849F, -0.3625F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.136F, -1.1702F, 1.3299F, 1.5708F, 1.4748F, 1.5708F));

		PartDefinition cube_r475 = rightarm2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(5, 90).addBox(-0.9415F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(73, 74).addBox(-0.9415F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, 7.0713F, 1.1022F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r476 = rightarm2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(50, 87).addBox(-0.65F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 0.2618F, 1.6232F));

		PartDefinition cube_r477 = rightarm2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(45, 87).addBox(-0.375F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5272F, 0.2618F, 1.6232F));

		PartDefinition cube_r478 = rightarm2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(40, 87).addBox(-0.4F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(87, 38).addBox(-0.4F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 1.1781F, 1.6232F));

		PartDefinition cube_r479 = rightarm2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(43, 62).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.4604F, 4.1302F, -0.0335F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r480 = rightarm2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(41, 71).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.4923F, 1.6232F));

		PartDefinition cube_r481 = rightarm2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(30, 71).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4248F, 4.8097F, 0.6872F, 1.5708F, 1.2828F, 1.6232F));

		PartDefinition cube_r482 = rightarm2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(33, 62).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r483 = rightarm2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(12, 62).addBox(-0.9601F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1564F, 3.0773F, -0.388F, 1.5708F, 1.5272F, 1.6232F));

		PartDefinition cube_r484 = rightarm2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(35, 87).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1764F, 0.8838F, 0.0948F, 1.5708F, 0.2182F, 1.5708F));

		PartDefinition cube_r485 = rightarm2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(19, 61).addBox(0.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1764F, 3.485F, 1.4674F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r486 = rightarm2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(7, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1764F, 0.596F, 1.2146F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 6.3215F, 1.1274F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightArm3.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(53, 6).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 1.3606F, 0.0801F, 0.7941F, -0.0037F, 0.0024F));

		PartDefinition cube_r488 = rightArm4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(18, 91).addBox(1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 91).addBox(1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 0).addBox(0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 91).addBox(-0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r489 = rightArm4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(37, 10).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, 0.0873F));

		PartDefinition cube_r490 = bone2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(76, 26).addBox(-0.5587F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, 0.4642F, -0.3102F));

		PartDefinition cube_r491 = bone2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -2.525F, -1.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6488F, -3.0746F, 0.7182F, -0.4877F, 0.4451F, -0.3737F));

		PartDefinition cube_r492 = bone2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(39, 17).addBox(-1.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -0.4154F, 0.433F, -0.3661F));

		PartDefinition cube_r493 = bone2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(90, 12).addBox(-1.0311F, -3.2822F, -4.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -1.419F, 0.433F, -0.3661F));

		PartDefinition cube_r494 = bone2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(80, 11).addBox(-1.0311F, -1.2771F, -5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -1.8117F, 0.433F, -0.3661F));

		PartDefinition cube_r495 = bone2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -2.3789F, 0.433F, -0.3661F));

		PartDefinition cube_r496 = bone2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(51, 10).addBox(-1.0311F, 2.6354F, 0.9821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 2.2462F, 0.433F, -0.3661F));

		PartDefinition cube_r497 = bone2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(20, 68).addBox(-1.0311F, -0.9312F, 2.8693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.2863F, 0.433F, -0.3661F));

		PartDefinition cube_r498 = bone2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(16, 38).addBox(-1.0311F, -0.1568F, 1.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.5481F, 0.433F, -0.3661F));

		PartDefinition cube_r499 = bone2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0311F, -0.0054F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.6964F, 0.433F, -0.3661F));

		PartDefinition cube_r500 = bone2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(15, 14).addBox(-0.8F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3193F, -3.9253F, -0.2132F, 1.4646F, 0.0033F, -0.3591F));

		PartDefinition cube_r501 = bone2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(23, 76).addBox(-0.5587F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, 0.4666F, -0.2893F));

		PartDefinition cube_r502 = bone2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(10, 47).addBox(-0.5587F, -0.2718F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, 0.4666F, -0.2893F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, -0.0873F));

		PartDefinition cube_r503 = bone3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-0.4413F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, -0.4642F, 0.3102F));

		PartDefinition cube_r504 = bone3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.5F, -2.525F, -1.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6488F, -3.0746F, 0.7182F, -0.4877F, -0.4451F, 0.3737F));

		PartDefinition cube_r505 = bone3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(0.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -0.4154F, -0.433F, 0.3661F));

		PartDefinition cube_r506 = bone3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(90, 12).mirror().addBox(0.0311F, -3.2822F, -4.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -1.419F, -0.433F, 0.3661F));

		PartDefinition cube_r507 = bone3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(80, 11).mirror().addBox(0.0311F, -1.2771F, -5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -1.8117F, -0.433F, 0.3661F));

		PartDefinition cube_r508 = bone3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -2.3789F, -0.433F, 0.3661F));

		PartDefinition cube_r509 = bone3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(0.0311F, 2.6354F, 0.9821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 2.2462F, -0.433F, 0.3661F));

		PartDefinition cube_r510 = bone3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(0.0311F, -0.9312F, 2.8693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.2863F, -0.433F, 0.3661F));

		PartDefinition cube_r511 = bone3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(16, 38).mirror().addBox(0.0311F, -0.1568F, 1.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.5481F, -0.433F, 0.3661F));

		PartDefinition cube_r512 = bone3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(0.0311F, -0.0054F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.6964F, -0.433F, 0.3661F));

		PartDefinition cube_r513 = bone3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(15, 14).mirror().addBox(-0.2F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3193F, -3.9253F, -0.2132F, 1.4646F, -0.0033F, 0.3591F));

		PartDefinition cube_r514 = bone3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(23, 76).mirror().addBox(-0.4413F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, -0.4666F, 0.2893F));

		PartDefinition cube_r515 = bone3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(10, 47).mirror().addBox(-0.4413F, -0.2718F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, -0.4666F, 0.2893F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(64, 90).addBox(0.0F, -0.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(61, 90).addBox(0.0F, -0.875F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(16, 33).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 22).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, -0.3142F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(31, 49).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, 0.5411F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 49).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(50, 2).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(50, 37).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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