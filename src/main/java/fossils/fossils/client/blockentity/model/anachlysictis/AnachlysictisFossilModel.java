package fossils.fossils.client.blockentity.model.anachlysictis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnachlysictisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart neck;
	private final ModelPart neck5;
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
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public AnachlysictisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
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
		this.bone4 = this.chest.getChild("bone4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.023F, 12.9507F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 77).addBox(0.0F, -1.189F, -0.9992F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 55).addBox(0.0F, -1.4678F, -0.9129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 30).addBox(0.0F, -1.376F, -0.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 32).mirror().addBox(-1.0763F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 47).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 47).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 32).addBox(-0.9237F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, 0.5604F, -0.6793F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 14).addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5159F, -0.2857F, 1.5909F, -0.9697F, 0.1018F, 0.0812F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 39).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0552F, -1.8945F, 0.3831F, -0.8737F, 0.1018F, 0.0812F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 2).addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1054F, -1.5064F, 0.2012F, -0.9174F, 0.1018F, 0.0812F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0604F, -1.9802F, 1.4429F, -0.5247F, 0.1018F, 0.0812F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0041F, -1.8736F, 0.898F, -1.8337F, 0.1018F, 0.0812F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1058F, -1.4638F, 2.3149F, -1.0221F, 0.1018F, 0.0812F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 69).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1057F, -0.1317F, 2.3624F, -1.2503F, 0.1215F, 0.0467F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 4).addBox(-0.3683F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.3564F, 0.1663F, -0.1795F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 28).addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.206F, 1.2694F, 2.3226F, -1.8713F, 0.1663F, -0.1795F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 38).addBox(-0.3683F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.0859F, 0.1663F, -0.1795F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 0).addBox(-0.9F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2033F, 1.514F, 0.9063F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(66, 68).addBox(-0.1571F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(64, 53).addBox(-1.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9891F, 2.4027F, 3.5458F, -1.7134F, 0.1311F, 0.1653F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(31, 59).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9793F, 2.3954F, 3.5795F, 0.3969F, 0.0647F, 0.2403F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 68).addBox(-1.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9891F, 2.4027F, 3.5458F, -0.7099F, 0.1311F, 0.1653F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(37, 17).addBox(-0.8198F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -2.1006F, -0.6518F, 1.6723F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 68).addBox(-0.3883F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 68).addBox(-0.3883F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4591F, 4.6946F, 3.9823F, -1.6633F, -0.8107F, 1.0317F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(37, 13).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9002F, 5.4946F, 3.5758F, 0.3089F, 0.7259F, 0.7733F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 50).addBox(-0.1571F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -0.8692F, 0.7259F, 0.7733F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8812F, 0.5604F, -0.6793F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5159F, -0.2857F, 1.5909F, -0.9697F, -0.1018F, -0.0812F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(5, 39).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0552F, -1.8945F, 0.3831F, -0.8737F, -0.1018F, -0.0812F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(70, 2).mirror().addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1054F, -1.5064F, 0.2012F, -0.9174F, -0.1018F, -0.0812F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0604F, -1.9802F, 1.4429F, -0.5247F, -0.1018F, -0.0812F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(69, 48).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0041F, -1.8736F, 0.898F, -1.8337F, -0.1018F, -0.0812F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1058F, -1.4638F, 2.3149F, -1.0221F, -0.1018F, -0.0812F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1057F, -0.1317F, 2.3624F, -1.2503F, -0.1215F, -0.0467F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-0.6317F, -0.3645F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.3564F, -0.1663F, 0.1795F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.206F, 1.2694F, 2.3226F, -1.8713F, -0.1663F, 0.1795F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 38).mirror().addBox(-0.6317F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.0859F, -0.1663F, 0.1795F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.1F, -1.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2033F, 1.514F, 0.9063F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.8429F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(0.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 2.4027F, 3.5458F, -1.7134F, -0.1311F, -0.1653F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(31, 59).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 2.3954F, 3.5795F, 0.3969F, -0.0647F, -0.2403F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(0.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 2.4027F, 3.5458F, -0.7099F, -0.1311F, -0.1653F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(37, 17).mirror().addBox(-0.1802F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -2.1006F, 0.6518F, -1.6723F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-0.6117F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 68).mirror().addBox(-0.6117F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4591F, 4.6946F, 3.9823F, -1.6633F, 0.8107F, -1.0317F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 13).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9002F, 5.4946F, 3.5758F, 0.3089F, -0.7259F, -0.7733F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 50).mirror().addBox(-0.8429F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -0.8692F, -0.7259F, -0.7733F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(59, 49).addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2F, 2.7705F, 1.6667F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 34).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(10, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(70, 5).addBox(-0.5F, -0.6414F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 32).addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 53).addBox(-0.5F, -0.0664F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 40).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(53, 23).addBox(-1.0F, -0.275F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.0318F, 0.4857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(53, 20).addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(53, 17).addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(58, 3).addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 54).addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 54).addBox(-1.997F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(58, 6).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(14, 54).addBox(-0.5F, -3.0222F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 70).addBox(-1.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 60).addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.2318F, 0.7512F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftArm5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(79, 47).addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 40).addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 79).addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 51).addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5303F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftArm5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.7705F, 1.6667F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-0.5F, 0.5034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 34).mirror().addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-0.5F, -0.6414F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.5F, -0.0664F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-1.0F, -0.275F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0318F, 0.4857F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(53, 17).mirror().addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(26, 54).mirror().addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-0.003F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(14, 54).mirror().addBox(-0.5F, -3.0222F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(0.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(40, 38).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.2318F, 0.7512F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightArm5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 40).mirror().addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 79).mirror().addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 51).mirror().addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5303F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightArm5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.097F, -3.4512F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 16).addBox(0.0F, -1.5846F, -0.9952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -0.9047F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(43, 77).addBox(0.0F, -1.7545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6986F, -2.8046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.48F, -3.5797F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-1.7472F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.48F, -1.5797F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(60, 16).addBox(-0.2528F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.48F, -1.5797F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(60, 14).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.48F, -3.5797F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.1512F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7675F, -13.3658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(46, 78).addBox(0.0F, -1.6645F, -4.034F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7933F, -3.7586F, -0.1136F, -0.0434F, 0.0049F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(-6.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.4435F, 0.283F, -1.3921F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(19, 45).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.302F, 0.4313F, -0.9931F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.1744F, 0.4935F, -0.7086F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(76, 45).mirror().addBox(-4.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.4365F, 0.2997F, -1.4947F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.2879F, 0.444F, -1.0917F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.1564F, 0.5021F, -0.8047F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.4308F, 0.3693F, -1.4928F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.2512F, 0.5057F, -1.0749F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.0995F, 0.5518F, -0.7761F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(23, 79).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.0995F, -0.5518F, 0.7761F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 30).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.2512F, -0.5057F, 1.0749F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(63, 8).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.4308F, -0.3693F, 1.4928F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 14).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.1564F, -0.5021F, 0.8047F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(45, 28).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.2879F, -0.444F, 1.0917F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(76, 45).addBox(3.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.4365F, -0.2997F, 1.4947F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(28, 45).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.1744F, -0.4935F, 0.7086F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(19, 45).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.302F, -0.4313F, 0.9931F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(44, 24).addBox(3.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.4435F, -0.283F, 1.3921F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(10, 79).addBox(0.0F, -1.8205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -2.1528F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 69).addBox(0.0F, -2.1938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3949F, -5.8528F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(33, 72).addBox(0.0F, -2.6205F, 0.0438F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(72, 16).addBox(0.0F, -2.6649F, -0.1021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(44, 16).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(53, 62).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(44, 20).mirror().addBox(-7.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, 0.2686F, -1.3612F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, 0.4239F, -0.9668F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, 0.4919F, -0.6846F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(63, 6).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, -0.4919F, 0.6846F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(44, 22).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, -0.4239F, 0.9668F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(44, 20).addBox(4.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, -0.2686F, 1.3612F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(53, 62).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 18).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(44, 16).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, -0.3759F, -3.9807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(15, 59).addBox(0.0F, -3.2121F, -0.1182F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -2.9687F, -0.0408F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5809F, -1.8018F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2136F, 0.4522F, -0.6421F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(7, 50).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3261F, 0.3819F, -0.9181F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.445F, 0.229F, -1.308F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, 0.2121F, -1.309F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, 0.3681F, -0.9223F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, 0.4417F, -0.6487F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 20).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, -0.4417F, 0.6487F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(41, 0).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, -0.3681F, 0.9223F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 18).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, -0.2121F, 1.309F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(34, 64).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.445F, -0.229F, 1.308F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(7, 50).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3261F, -0.3819F, 0.9181F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 0).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2136F, -0.4522F, 0.6421F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.0333F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(15, 72).addBox(0.0F, -2.7606F, -0.0758F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4094F, -1.7777F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 33).mirror().addBox(-3.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5915F, 5.4758F, 0.8458F, 0.4795F, 0.2019F, 0.2835F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 26).mirror().addBox(-2.8F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2882F, 5.3679F, -0.4334F, 0.4817F, 0.143F, 0.3023F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(33, 24).mirror().addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0419F, 4.2939F, 3.7776F, 0.465F, 0.242F, 0.3763F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.1776F, 0.4971F, -0.623F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.3061F, 0.4339F, -0.9076F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.4481F, 0.284F, -1.3062F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 41).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.4481F, -0.284F, 1.3062F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(42, 26).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.3061F, -0.4339F, 0.9076F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(46, 62).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.1776F, -0.4971F, 0.623F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(33, 24).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0419F, 4.2939F, 3.7776F, 0.465F, -0.242F, -0.3763F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(33, 26).addBox(-0.2F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2882F, 5.3679F, -0.4334F, 0.4817F, -0.143F, -0.3023F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 33).addBox(-0.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5915F, 5.4758F, 0.8458F, 0.4795F, -0.2019F, -0.2835F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(20, 28).addBox(-0.5F, -1.0261F, -3.0609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.2581F, 2.2051F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(26, 41).addBox(-0.5F, -0.3756F, -1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(49, 70).addBox(0.0F, -2.485F, -0.1495F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4588F, -1.6659F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(41, 2).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.2821F, 0.4613F, -1.0543F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(60, 22).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.1449F, 0.5172F, -0.7643F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 22).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.1449F, -0.5172F, 0.7643F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(41, 2).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.2821F, -0.4613F, 1.0543F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(12, 42).addBox(-0.5F, -0.8713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, 0.1036F, -0.1741F, 0.0123F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(77, 72).addBox(0.0F, -1.4076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7639F, -1.0128F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, 0.0068F, -0.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0995F, -7.1074F, -0.294F, -0.0962F, -0.0163F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(12, 35).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5068F, 0.544F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(33, 43).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -0.956F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(61, 28).addBox(0.0F, -0.101F, -2.3564F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0903F, 0.0383F, 0.4849F, -0.0201F, -0.0009F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4753F, -1.5261F, -0.0433F, -0.0493F, -0.1289F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 42).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.7629F, -1.3412F, 0.7186F, 0.0633F, 0.0942F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 23).addBox(-1.1624F, -1.0176F, -0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.1885F, -0.1369F, 0.5703F, -0.065F, -0.0931F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(37, 9).addBox(-0.5F, -1.3745F, -1.0079F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9685F, -2.4303F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.3028F, -2.9775F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4091F, -2.2419F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(10, 73).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5141F, -3.5159F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(73, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1626F, -3.234F, 2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(63, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.1266F, -4.4873F, 2.5482F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(10, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1751F, -5.415F, 2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(38, 57).addBox(-1.0F, -0.35F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.2352F, -5.669F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.0277F, -5.9375F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1751F, -5.415F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, -0.5F, -1.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 4.5543F, -4.6838F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(35, 37).addBox(-0.5F, -3.8F, -1.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 4.917F, -4.5904F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(54, 29).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 4.9228F, -5.1412F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.006F, -1.1748F, -1.4981F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(36, 60).addBox(-0.5F, -1.325F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.006F, -0.0634F, -0.6417F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(24, 57).addBox(-0.6F, -0.5F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 26).addBox(-0.6F, -0.1F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.394F, -0.7885F, -0.9798F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(18, 74).addBox(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(70, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2335F, -2.4205F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(70, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.2537F, -2.4013F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(70, 54).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(5, 34).addBox(-0.5F, -0.875F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.1445F, -2.1453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(24, 60).addBox(0.498F, -0.0843F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.5F, -2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7606F, 5.6603F, -3.7469F, 0.2832F, -0.2318F, -0.1668F));

		PartDefinition cube_r194 = leftCanine.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(58, 10).addBox(-0.1718F, -0.9607F, -0.0068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.5464F, 0.2551F, 0.0186F));

		PartDefinition cube_r195 = leftCanine.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 30).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1308F, -0.8827F, -0.4427F, 0.5401F, 0.229F, 0.0518F));

		PartDefinition cube_r196 = leftCanine.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(28, 67).addBox(-0.1278F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(67, 20).addBox(-0.1278F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, -0.6797F, 0.2551F, 0.0186F));

		PartDefinition cube_r197 = leftCanine.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 17).addBox(-0.1278F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, -0.4965F, 0.2551F, 0.0186F));

		PartDefinition cube_r198 = leftCanine.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(67, 14).addBox(-0.1278F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.8038F, 0.2551F, 0.0186F));

		PartDefinition cube_r199 = leftCanine.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 67).addBox(-0.1278F, 0.897F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.9871F, 0.2551F, 0.0186F));

		PartDefinition cube_r200 = leftCanine.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 39).addBox(-0.5F, -0.75F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.0698F, 0.1024F, 0.3528F, 0.4198F, 0.2551F, 0.0186F));

		PartDefinition cube_r201 = leftCanine.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 65).addBox(-0.1718F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.8125F, 0.2551F, 0.0186F));

		PartDefinition cube_r202 = leftCanine.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(66, 42).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0879F, -0.4322F, -0.2897F, 0.4635F, 0.2551F, 0.0186F));

		PartDefinition cube_r203 = leftCanine.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(66, 45).addBox(-0.1718F, -0.2068F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.7253F, 0.2551F, 0.0186F));

		PartDefinition cube_r204 = leftCanine.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(5, 71).addBox(-0.2306F, -0.2035F, -0.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5483F, -0.8126F, -1.1221F, 0.5715F, 0.2028F, 0.0358F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7606F, 5.6603F, -3.7469F, 0.2832F, 0.2318F, 0.1668F));

		PartDefinition cube_r205 = rightCanine.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-0.8282F, -0.9607F, -0.0068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.5464F, -0.2551F, -0.0186F));

		PartDefinition cube_r206 = rightCanine.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1308F, -0.8827F, -0.4427F, 0.5401F, -0.229F, -0.0518F));

		PartDefinition cube_r207 = rightCanine.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(28, 67).mirror().addBox(-0.8722F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(67, 20).mirror().addBox(-0.8722F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, -0.6797F, -0.2551F, -0.0186F));

		PartDefinition cube_r208 = rightCanine.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(67, 17).mirror().addBox(-0.8722F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, -0.4965F, -0.2551F, -0.0186F));

		PartDefinition cube_r209 = rightCanine.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(-0.8722F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.8038F, -0.2551F, -0.0186F));

		PartDefinition cube_r210 = rightCanine.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.8722F, 0.897F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.9871F, -0.2551F, -0.0186F));

		PartDefinition cube_r211 = rightCanine.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(66, 39).mirror().addBox(-0.5F, -0.75F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.0698F, 0.1024F, 0.3528F, 0.4198F, -0.2551F, -0.0186F));

		PartDefinition cube_r212 = rightCanine.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-0.8282F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.8125F, -0.2551F, -0.0186F));

		PartDefinition cube_r213 = rightCanine.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0879F, -0.4322F, -0.2897F, 0.4635F, -0.2551F, -0.0186F));

		PartDefinition cube_r214 = rightCanine.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.8282F, -0.2068F, -0.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.7253F, -0.2551F, -0.0186F));

		PartDefinition cube_r215 = rightCanine.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.7694F, -0.2035F, -0.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.8126F, -1.1221F, 0.5715F, -0.2028F, -0.0358F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9168F, -0.7672F, 2.789F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r216 = leftOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(10, 59).addBox(-0.85F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4468F, 1.8106F, -5.9145F, 2.2645F, 0.2262F, 0.0959F));

		PartDefinition cube_r217 = leftOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5F, -0.6719F, -0.3701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(77, 11).addBox(-0.5F, -0.6719F, -0.8701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1737F, 2.4259F, -5.3534F, 1.3628F, 0.3546F, 0.0867F));

		PartDefinition cube_r218 = leftOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(20, 68).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2563F, 4.2566F, -7.5163F, -2.4644F, -0.0932F, 0.9793F));

		PartDefinition cube_r219 = leftOrbit.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(68, 10).addBox(-0.9F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2851F, 4.2862F, -7.6074F, -1.1554F, -0.0932F, 0.9793F));

		PartDefinition cube_r220 = leftOrbit.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(39, 68).addBox(-0.875F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2869F, 4.633F, -7.3845F, -0.9571F, -0.8793F, -0.4344F));

		PartDefinition cube_r221 = leftOrbit.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 68).addBox(-0.9473F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3787F, 3.3232F, -5.8802F, -1.2237F, 0.2506F, 0.1704F));

		PartDefinition cube_r222 = leftOrbit.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 4).addBox(-0.7F, -0.7F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0611F, 3.8909F, -6.5363F, -2.6358F, -0.183F, 0.9343F));

		PartDefinition cube_r223 = leftOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(51, 77).addBox(-0.9473F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3787F, 3.3232F, -5.8802F, -2.6636F, 0.2506F, 0.1704F));

		PartDefinition cube_r224 = leftOrbit.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(33, 77).addBox(-0.9473F, -0.8803F, -0.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3787F, 3.3232F, -5.8802F, 2.3543F, 0.2506F, 0.1704F));

		PartDefinition cube_r225 = leftOrbit.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(70, 81).addBox(-0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0922F, 6.2322F, -8.1754F, 0.4574F, -0.0783F, -0.0385F));

		PartDefinition cube_r226 = leftOrbit.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, -0.2352F, -1.2275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1225F, 4.1192F, -5.6521F, 0.4559F, 0.1474F, 0.2714F));

		PartDefinition cube_r227 = leftOrbit.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(66, 77).addBox(-0.5F, -0.3411F, -0.7396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1225F, 4.1192F, -5.6521F, 0.674F, 0.1474F, 0.2714F));

		PartDefinition cube_r228 = leftOrbit.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(61, 77).addBox(-0.5F, -0.3411F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1225F, 4.1192F, -5.6521F, 0.9358F, 0.1474F, 0.2714F));

		PartDefinition cube_r229 = leftOrbit.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(56, 77).addBox(-0.5F, -0.2352F, 0.2275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1225F, 4.1192F, -5.6521F, 1.154F, 0.1474F, 0.2714F));

		PartDefinition cube_r230 = leftOrbit.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(38, 77).addBox(-0.9473F, -0.1121F, -0.3658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3787F, 3.3232F, -5.8802F, 1.1325F, 0.2506F, 0.1704F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -0.5106F, -1.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1737F, 2.4259F, -5.3534F, 1.1447F, 0.3546F, 0.0867F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(56, 65).addBox(-0.2516F, -0.4878F, -0.8654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.4544F, 0.7304F, -3.5055F, 1.0928F, 0.1186F, 0.0786F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(65, 2).addBox(-0.2516F, -0.6603F, -0.3813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4544F, 0.7304F, -3.5055F, 1.8782F, 0.1186F, 0.0786F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 22).addBox(-0.475F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8431F, -1.0245F, -4.2983F, -0.6019F, -0.652F, 2.3363F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(41, 60).addBox(-0.215F, -0.7198F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8273F, -0.8287F, -4.0719F, 0.5777F, -0.6727F, 0.681F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 32).addBox(-1.075F, 0.125F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 52).addBox(-1.075F, -0.675F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7457F, -0.3346F, -3.5651F, 0.693F, 0.0215F, -0.0122F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0059F, 0.4187F, -3.2502F, 2.6426F, 1.2013F, 2.0754F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(75, 69).addBox(-0.3544F, -1.5768F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0959F, 0.2607F, -3.4795F, -2.5728F, 1.173F, 2.2122F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(65, 59).addBox(-0.823F, -0.8924F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0959F, 0.2607F, -3.4795F, 1.9604F, 0.5368F, 0.2421F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6666F, 0.3786F, -4.1454F, 0.703F, 0.2464F, 0.1311F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(34, 66).addBox(-1.0508F, -2.127F, -0.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8579F, 2.5507F, -5.4731F, 2.3858F, 0.4299F, 0.1648F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 33).addBox(-1.0508F, -1.965F, 0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.8579F, 2.5507F, -5.4731F, -3.112F, 0.4299F, 0.1648F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 56).addBox(-1.3069F, 0.3944F, 1.5555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8579F, 2.5507F, -5.4731F, -2.0829F, 0.3265F, 0.0883F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(16, 51).addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.465F, 2.2245F, -7.0461F, -0.2607F, 0.473F, 0.735F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(51, 11).addBox(-1.8F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0157F, 1.883F, -6.8422F, 1.1792F, 0.473F, 0.735F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(51, 8).addBox(-1.8F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.032F, 2.0786F, -6.6198F, 1.1411F, 0.6171F, 0.6617F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(23, 51).addBox(-1.5F, -0.5773F, 0.0454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4493F, 2.7409F, -6.9946F, 0.8821F, 0.2829F, 0.0877F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.534F, 5.1277F, -7.6431F, -0.5667F, -0.0475F, -0.0221F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(76, 31).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5199F, 5.1587F, -7.9257F, -0.8721F, -0.0475F, -0.0221F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5363F, 5.2864F, -7.5214F, -1.0903F, -0.0475F, -0.0221F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(41, 74).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.247F, 4.5132F, -7.6091F, 2.3511F, 0.2165F, -0.4573F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(36, 74).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6964F, 3.9423F, -8.2962F, 0.9819F, 0.3567F, -0.2825F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(57, 74).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2515F, -0.3388F, -3.9825F, 0.0898F, 0.9598F, -1.5222F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(62, 74).addBox(-1.1925F, 0.1348F, 0.3206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 74).addBox(-1.1925F, 0.1348F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9838F, -0.3761F, -5.0112F, 0.7567F, 0.6668F, -0.6409F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(72, 74).addBox(-0.9425F, -0.1402F, 0.3956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 74).addBox(-0.9425F, -0.1402F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9838F, -0.3761F, -5.0112F, 0.9287F, 0.3042F, -0.2813F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 36).addBox(-0.9425F, -0.1402F, -1.6044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9305F, 0.5151F, -5.4616F, 0.9043F, 0.2966F, -0.2759F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(75, 0).addBox(-0.9425F, -0.1402F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9838F, -0.3761F, -5.0112F, 1.0746F, 0.3294F, -0.233F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(47, 48).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2224F, 0.9182F, -4.6107F, 0.0117F, 0.8394F, -1.5982F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(74, 50).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2405F, 0.4632F, -4.4041F, 0.0189F, 1.1448F, -1.5897F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(47, 44).addBox(-0.9862F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2272F, 0.904F, -4.5878F, -0.1549F, 0.8187F, -1.5192F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(47, 40).addBox(-0.9862F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2272F, 0.904F, -4.5878F, 0.5519F, 0.6556F, -0.5181F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(74, 47).addBox(-1.1863F, 0.1429F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9828F, -0.3621F, -5.0221F, 0.9838F, 0.729F, -0.4568F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4642F, 5.6803F, -8.8555F, -0.9158F, -0.0475F, -0.0221F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(66, 27).addBox(-1.651F, -0.5735F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.171F, 5.6747F, -8.7924F, -0.1653F, 0.6175F, 0.7522F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(66, 24).addBox(-0.5601F, -1.3073F, -0.2142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.171F, 5.6747F, -8.7924F, -0.019F, -0.0612F, -0.5985F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(15, 66).addBox(-0.796F, -0.7945F, -0.2488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.171F, 5.6747F, -8.7924F, -0.1304F, -0.0475F, -0.1618F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(28, 76).addBox(0.0F, -0.725F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9852F, 6.0291F, -8.2653F, 0.4369F, -0.0475F, -0.0221F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(30, 51).addBox(-1.5F, -0.5421F, -0.5075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4493F, 2.7409F, -6.9946F, 1.013F, 0.2829F, 0.0877F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(47, 52).addBox(-1.5F, -0.5903F, -1.0434F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4493F, 2.7409F, -6.9946F, 1.1876F, 0.2829F, 0.0877F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(51, 67).addBox(-1.2569F, -2.936F, -0.268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.8579F, 2.7507F, -5.2731F, 2.0623F, 0.3265F, 0.0883F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9168F, -0.7672F, 2.789F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r271 = rightOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-0.15F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4468F, 1.8106F, -5.9145F, 2.2645F, -0.2262F, -0.0959F));

		PartDefinition cube_r272 = rightOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.5F, -0.6719F, -0.3701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 11).mirror().addBox(-0.5F, -0.6719F, -0.8701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 2.4259F, -5.3534F, 1.3628F, -0.3546F, -0.0867F));

		PartDefinition cube_r273 = rightOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2563F, 4.2566F, -7.5163F, -2.4644F, 0.0932F, -0.9793F));

		PartDefinition cube_r274 = rightOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-0.1F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2851F, 4.2862F, -7.6074F, -1.1554F, 0.0932F, -0.9793F));

		PartDefinition cube_r275 = rightOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(39, 68).mirror().addBox(-0.125F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2869F, 4.633F, -7.3845F, -0.9571F, 0.8793F, 0.4344F));

		PartDefinition cube_r276 = rightOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.0527F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 3.3232F, -5.8802F, -1.2237F, -0.2506F, -0.1704F));

		PartDefinition cube_r277 = rightOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-0.3F, -0.7F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0611F, 3.8909F, -6.5363F, -2.6358F, 0.183F, -0.9343F));

		PartDefinition cube_r278 = rightOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.0527F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 3.3232F, -5.8802F, -2.6636F, -0.2506F, -0.1704F));

		PartDefinition cube_r279 = rightOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(33, 77).mirror().addBox(-0.0527F, -0.8803F, -0.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 3.3232F, -5.8802F, 2.3543F, -0.2506F, -0.1704F));

		PartDefinition cube_r280 = rightOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0922F, 6.2322F, -8.1754F, 0.4574F, 0.0783F, 0.0385F));

		PartDefinition cube_r281 = rightOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(71, 77).mirror().addBox(-0.5F, -0.2352F, -1.2275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 4.1192F, -5.6521F, 0.4559F, -0.1474F, -0.2714F));

		PartDefinition cube_r282 = rightOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-0.5F, -0.3411F, -0.7396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 4.1192F, -5.6521F, 0.674F, -0.1474F, -0.2714F));

		PartDefinition cube_r283 = rightOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-0.5F, -0.3411F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 4.1192F, -5.6521F, 0.9358F, -0.1474F, -0.2714F));

		PartDefinition cube_r284 = rightOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-0.5F, -0.2352F, 0.2275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1225F, 4.1192F, -5.6521F, 1.154F, -0.1474F, -0.2714F));

		PartDefinition cube_r285 = rightOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(38, 77).mirror().addBox(-0.0527F, -0.1121F, -0.3658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3787F, 3.3232F, -5.8802F, 1.1325F, -0.2506F, -0.1704F));

		PartDefinition cube_r286 = rightOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.5F, -0.5106F, -1.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 2.4259F, -5.3534F, 1.1447F, -0.3546F, -0.0867F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.7484F, -0.4878F, -0.8654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.4544F, 0.7304F, -3.5055F, 1.0928F, -0.1186F, -0.0786F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(65, 2).mirror().addBox(-0.7484F, -0.6603F, -0.3813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4544F, 0.7304F, -3.5055F, 1.8782F, -0.1186F, -0.0786F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(76, 22).mirror().addBox(-0.525F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8431F, -1.0245F, -4.2983F, -0.6019F, 0.652F, -2.3363F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(41, 60).mirror().addBox(-0.785F, -0.7198F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8273F, -0.8287F, -4.0719F, 0.5777F, 0.6727F, -0.681F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(-0.925F, 0.125F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(7, 52).mirror().addBox(-0.925F, -0.675F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7457F, -0.3346F, -3.5651F, 0.693F, -0.0215F, 0.0122F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.0059F, 0.4187F, -3.2502F, 2.6426F, -1.2013F, -2.0754F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.6456F, -1.5768F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.0959F, 0.2607F, -3.4795F, -2.5728F, -1.173F, -2.2122F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.177F, -0.8924F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0959F, 0.2607F, -3.4795F, 1.9604F, -0.5368F, -0.2421F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6666F, 0.3786F, -4.1454F, 0.703F, -0.2464F, -0.1311F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(0.0508F, -2.127F, -0.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 2.5507F, -5.4731F, 2.3858F, -0.4299F, -0.1648F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(66, 33).mirror().addBox(0.0508F, -1.965F, 0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 2.5507F, -5.4731F, -3.112F, -0.4299F, -0.1648F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(0.3069F, 0.3944F, 1.5555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 2.5507F, -5.4731F, -2.0829F, -0.3265F, -0.0883F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.465F, 2.2245F, -7.0461F, -0.2607F, -0.473F, -0.735F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-0.2F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0157F, 1.883F, -6.8422F, 1.1792F, -0.473F, -0.735F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-0.2F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.032F, 2.0786F, -6.6198F, 1.1411F, -0.6171F, -0.6617F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(23, 51).mirror().addBox(-0.5F, -0.5773F, 0.0454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4493F, 2.7409F, -6.9946F, 0.8821F, -0.2829F, -0.0877F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(41, 64).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.534F, 5.1277F, -7.6431F, -0.5667F, 0.0475F, 0.0221F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5199F, 5.1587F, -7.9257F, -0.8721F, 0.0475F, 0.0221F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(76, 28).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5363F, 5.2864F, -7.5214F, -1.0903F, 0.0475F, 0.0221F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(41, 74).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.247F, 4.5132F, -7.6091F, 2.3511F, -0.2165F, 0.4573F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(36, 74).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6964F, 3.9423F, -8.2962F, 0.9819F, -0.3567F, 0.2825F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2515F, -0.3388F, -3.9825F, 0.0898F, -0.9598F, 1.5222F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(0.1925F, 0.1348F, 0.3206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 74).mirror().addBox(0.1925F, 0.1348F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9838F, -0.3761F, -5.0112F, 0.7567F, -0.6668F, 0.6409F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(-0.0575F, -0.1402F, 0.3956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 74).mirror().addBox(-0.0575F, -0.1402F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9838F, -0.3761F, -5.0112F, 0.9287F, -0.3042F, 0.2813F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(47, 36).mirror().addBox(-0.0575F, -0.1402F, -1.6044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9305F, 0.5151F, -5.4616F, 0.9043F, -0.2966F, 0.2759F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.0575F, -0.1402F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9838F, -0.3761F, -5.0112F, 1.0746F, -0.3294F, 0.233F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2224F, 0.9182F, -4.6107F, 0.0117F, -0.8394F, 1.5982F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2405F, 0.4632F, -4.4041F, 0.0189F, -1.1448F, 1.5897F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(47, 44).mirror().addBox(-0.0138F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2272F, 0.904F, -4.5878F, -0.1549F, -0.8187F, 1.5192F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-0.0138F, -1.0071F, -2.0226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2272F, 0.904F, -4.5878F, 0.5519F, -0.6556F, 0.5181F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(0.1863F, 0.1429F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9828F, -0.3621F, -5.0221F, 0.9838F, -0.729F, 0.4568F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4642F, 5.6803F, -8.8555F, -0.9158F, 0.0475F, 0.0221F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(0.651F, -0.5735F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.171F, 5.6747F, -8.7924F, -0.1653F, -0.6175F, -0.7522F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-0.4399F, -1.3073F, -0.2142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.171F, 5.6747F, -8.7924F, -0.019F, 0.0612F, 0.5985F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.2041F, -0.7945F, -0.2488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.171F, 5.6747F, -8.7924F, -0.1304F, 0.0475F, 0.1618F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-1.0F, -0.725F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9852F, 6.0291F, -8.2653F, 0.4369F, 0.0475F, 0.0221F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-0.5F, -0.5421F, -0.5075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4493F, 2.7409F, -6.9946F, 1.013F, -0.2829F, -0.0877F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(47, 52).mirror().addBox(-0.5F, -0.5903F, -1.0434F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4493F, 2.7409F, -6.9946F, 1.1876F, -0.2829F, -0.0877F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(0.2569F, -2.936F, -0.268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.8579F, 2.7507F, -5.2731F, 2.0623F, -0.3265F, -0.0883F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.1918F, -0.2623F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-0.5268F, -0.7153F, -0.5415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.7199F, -0.1521F, 2.9116F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-0.2375F, -0.2269F, 1.5618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, 0.02F, -0.0718F, 0.0692F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.3858F, -0.4382F, 1.7982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.2858F, -0.0455F, -0.014F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-0.2275F, -1.8246F, 1.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.6844F, -0.1534F, -0.0506F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.0004F, 0.6289F, -2.0428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -1.3028F, -0.1724F, 0.0191F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-0.523F, -1.1669F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -0.2177F, -1.0448F, 0.5718F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.423F, -0.4312F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -2.3208F, -1.0448F, 0.5718F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(0.0996F, -0.3262F, -0.7338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -0.7184F, -0.1899F, 0.0192F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0985F, 1.0589F, -1.1741F, -1.486F, -0.1724F, 0.0191F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(0.0996F, -0.4657F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.8671F, -0.0466F, -0.3428F, -0.1724F, 0.0191F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.1901F, -2.0795F, 0.4269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -1.0794F, -0.1043F, -0.1133F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-0.0021F, -4.0098F, 0.8971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.9002F, -0.2165F, -0.1485F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(61, 24).mirror().addBox(0.0041F, -4.1139F, 0.2312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(23, 76).mirror().addBox(0.0041F, -2.5639F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.9794F, -0.2215F, -0.1427F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.1836F, -1.4402F, -1.6049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -2.4145F, -0.1095F, -0.1077F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.1836F, -1.1474F, -2.0693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -2.6327F, -0.1095F, -0.1077F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(0.1741F, -4.3945F, 0.1296F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.8128F, -0.1286F, -0.3016F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(75, 3).mirror().addBox(-0.2375F, 1.9632F, -1.4463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, 1.233F, -0.0718F, 0.0692F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(29, 63).mirror().addBox(-0.2375F, -1.0518F, -2.5467F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, 2.6293F, -0.0718F, 0.0692F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.2375F, -2.1077F, -0.4293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(75, 16).mirror().addBox(-0.2375F, -2.1077F, -1.0293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -2.3449F, -0.0718F, 0.0692F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(76, 65).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0386F, -0.5852F, -1.9202F, -1.5209F, -0.1724F, 0.0191F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.0607F, 0.2136F, -1.8809F, -2.9172F, -0.1724F, 0.0191F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-0.0021F, -4.6194F, 1.5646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.7257F, -0.2165F, -0.1485F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(46, 75).mirror().addBox(-0.0021F, -4.8881F, 1.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -0.7693F, -0.2165F, -0.1485F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(75, 53).mirror().addBox(-0.5268F, -0.4707F, -0.3773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -2.0289F, -0.1521F, 2.9116F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.5268F, -0.7595F, -0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.2616F, 3.9136F, -5.729F, -1.1126F, -0.1521F, 2.9116F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0512F, 3.9976F, -5.0686F, -2.7812F, -0.0718F, 0.0692F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(76, 40).addBox(-0.1741F, -4.3945F, 0.1296F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.8128F, 0.1286F, 0.3016F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 43).addBox(-0.8164F, -1.1474F, -2.0693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -2.6327F, 0.1095F, 0.1077F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(65, 62).addBox(-0.8164F, -1.4402F, -1.6049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -2.4145F, 0.1095F, 0.1077F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(23, 76).addBox(-1.0041F, -2.5639F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(61, 24).addBox(-1.0041F, -4.1139F, 0.2312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.9794F, 0.2215F, 0.1427F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(46, 75).addBox(-0.9979F, -4.8881F, 1.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.7693F, 0.2165F, 0.1485F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(75, 19).addBox(-0.9979F, -4.6194F, 1.5646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.7257F, 0.2165F, 0.1485F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(50, 57).addBox(-0.9979F, -4.0098F, 0.8971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.9002F, 0.2165F, 0.1485F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 64).addBox(-0.8099F, -2.0795F, 0.4269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -1.0794F, 0.1043F, 0.1133F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(71, 35).addBox(-1.0996F, -0.4657F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -0.3428F, 0.1724F, -0.0191F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(51, 64).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.4985F, 1.0589F, -1.1741F, -1.486F, 0.1724F, -0.0191F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(64, 49).addBox(-1.0996F, -0.3262F, -0.7338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -0.7184F, 0.1899F, -0.0192F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(71, 32).addBox(-0.577F, -0.4312F, -0.5666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -2.3208F, 1.0448F, -0.5718F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(61, 65).addBox(-0.477F, -1.1669F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -0.2177F, 1.0448F, -0.5718F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4607F, 0.2136F, -1.8809F, -2.9172F, 0.1724F, -0.0191F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(76, 65).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.4386F, -0.5852F, -1.9202F, -1.5209F, 0.1724F, -0.0191F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 51).addBox(-0.9996F, 0.6289F, -2.0428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 0.8671F, -0.0466F, -1.3028F, 0.1724F, -0.0191F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(66, 36).addBox(-0.7724F, -1.8246F, 1.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.6844F, 0.1534F, 0.0506F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(71, 29).addBox(-0.6142F, -0.4382F, 1.7982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.2858F, 0.0455F, 0.014F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(75, 16).addBox(-0.7625F, -2.1077F, -1.0293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(0, 64).addBox(-0.7625F, -2.1077F, -0.4293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -2.3449F, 0.0718F, -0.0692F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(75, 59).addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5488F, 3.9976F, -5.0686F, -2.7812F, 0.0718F, -0.0692F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(29, 63).addBox(-0.7625F, -1.0518F, -2.5467F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, 2.6293F, 0.0718F, -0.0692F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(75, 3).addBox(-0.7625F, 1.9632F, -1.4463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, 1.233F, 0.0718F, -0.0692F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(60, 57).addBox(-0.7625F, -0.2269F, 1.5618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, 0.02F, 0.0718F, -0.0692F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(75, 53).addBox(-0.4732F, -0.4707F, -0.3773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -2.0289F, 0.1521F, -2.9116F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(75, 56).addBox(-0.4732F, -0.7595F, -0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -1.1126F, 0.1521F, -2.9116F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(71, 26).addBox(-0.4732F, -0.7153F, -0.5415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.3384F, 3.9136F, -5.729F, -0.7199F, 0.1521F, -2.9116F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(76, 77).addBox(0.0F, -1.7423F, -1.0693F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, 0.0007F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r379 = neck.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(28, 37).addBox(-0.5F, -1.1F, 1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.9993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.05F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r380 = neck5.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(78, 6).addBox(0.0F, -1.9423F, -0.0193F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0168F, -2.8955F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(79, 50).addBox(0.0F, -1.2423F, -0.2193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3209F, -0.787F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck5.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, -1.1F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r383 = sternum.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1729F, -2.0121F, 3.0279F, 0.2388F, 0.3659F, 0.3572F));

		PartDefinition cube_r384 = sternum.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.1895F, 0.106F, -1.1482F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0246F, -2.2752F, 6.2403F, 0.2267F, 0.331F, 0.3457F));

		PartDefinition cube_r385 = sternum.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(28, 2).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4131F, -2.5998F, 7.7828F, 0.4096F, 0.3726F, 0.4104F));

		PartDefinition cube_r386 = sternum.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(33, 22).mirror().addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9965F, -4.2759F, 10.1865F, 0.6326F, 0.4443F, 0.8005F));

		PartDefinition cube_r387 = sternum.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(22, 20).mirror().addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2332F, -5.7014F, 12.0421F, 0.7536F, 0.5835F, 1.007F));

		PartDefinition cube_r388 = sternum.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(22, 20).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9614F, -5.7014F, 12.0421F, 0.7536F, -0.5835F, -1.007F));

		PartDefinition cube_r389 = sternum.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(33, 22).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7247F, -4.2759F, 10.1865F, 0.6326F, -0.4443F, -0.8005F));

		PartDefinition cube_r390 = sternum.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(28, 2).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1413F, -2.5998F, 7.7828F, 0.4096F, -0.3726F, -0.4104F));

		PartDefinition cube_r391 = sternum.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -1.8252F, -0.6115F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.6718F, 4.8464F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r392 = sternum.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(28, 0).addBox(-4.8105F, 0.106F, -1.1482F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7529F, -2.2752F, 6.2403F, 0.2267F, -0.331F, -0.3457F));

		PartDefinition cube_r393 = sternum.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9011F, -2.0121F, 3.0279F, 0.2388F, -0.3659F, -0.3572F));

		PartDefinition cube_r394 = sternum.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -1.3914F, -4.5715F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.3718F, 3.6464F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9035F, 4.1022F, -2.0546F, 1.2203F, -0.009F, -0.0068F));

		PartDefinition cube_r395 = leftarm.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(54, 44).addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftarm.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(54, 41).addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(54, 38).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0113F, 0.0926F, -0.8585F, 3.1066F, 0.0014F, -0.001F));

		PartDefinition cube_r397 = leftarm.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(38, 54).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0102F, -0.1142F, 0.0457F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r398 = leftarm.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(54, 35).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.01F, 0.5707F, -0.2883F, -1.1695F, 0.0014F, -0.001F));

		PartDefinition cube_r399 = leftarm.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(33, 54).addBox(-0.5F, -2.025F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 5.4321F, -0.4597F, 0.4188F, 0.0011F, -0.002F));

		PartDefinition cube_r400 = leftarm.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(43, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0107F, 3.8649F, -1.5397F, -0.8727F, 0.0031F, 0.0019F));

		PartDefinition cube_r401 = leftarm.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(71, 41).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 2.8203F, -1.3939F, -0.0437F, 0.0031F, 0.0019F));

		PartDefinition cube_r402 = leftarm.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(61, 34).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4883F, 1.1621F, -1.897F, 0.1919F, 0.0014F, -0.001F));

		PartDefinition cube_r403 = leftarm.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(7, 43).addBox(0.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftarm.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(71, 38).addBox(0.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.3915F, -0.2382F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r405 = leftarm2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(19, 57).addBox(-1.2849F, -0.3625F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.136F, -1.1702F, 1.3299F, 1.5708F, -1.4748F, -1.5708F));

		PartDefinition cube_r406 = leftarm2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(76, 25).addBox(-0.0585F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(23, 64).addBox(-0.0585F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, 7.0713F, 1.1022F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r407 = leftarm2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(71, 63).addBox(-0.35F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -0.2618F, -1.6232F));

		PartDefinition cube_r408 = leftarm2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(62, 71).addBox(-0.625F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5272F, -0.2618F, -1.6232F));

		PartDefinition cube_r409 = leftarm2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(57, 71).addBox(-0.6F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(52, 71).addBox(-0.6F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -1.1781F, -1.6232F));

		PartDefinition cube_r410 = leftarm2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(45, 55).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4604F, 4.1302F, -0.0335F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r411 = leftarm2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(61, 42).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.4923F, -1.6232F));

		PartDefinition cube_r412 = leftarm2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(61, 38).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4248F, 4.8097F, 0.6872F, 1.5708F, -1.2828F, -1.6232F));

		PartDefinition cube_r413 = leftarm2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(5, 55).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r414 = leftarm2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 55).addBox(-0.0399F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1564F, 3.0773F, -0.388F, 1.5708F, -1.5272F, -1.6232F));

		PartDefinition cube_r415 = leftarm2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(71, 44).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.8838F, 0.0948F, 1.5708F, -0.2182F, -1.5708F));

		PartDefinition cube_r416 = leftarm2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(54, 52).addBox(-1.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1764F, 3.4849F, 1.4674F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r417 = leftarm2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(54, 47).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1764F, 0.596F, 1.2146F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 6.3215F, 1.1274F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r418 = leftArm3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(44, 4).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 1.3606F, 0.0801F, 1.405F, 0.0037F, -0.0024F));

		PartDefinition cube_r419 = leftArm4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 0).addBox(-1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(-1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 79).addBox(-0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 76).addBox(0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r420 = leftArm4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9035F, 4.1022F, -2.0546F, 0.7403F, 0.009F, 0.0068F));

		PartDefinition cube_r421 = rightarm.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r422 = rightarm.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(54, 41).mirror().addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(54, 38).mirror().addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0113F, 0.0926F, -0.8585F, 3.1066F, -0.0014F, 0.001F));

		PartDefinition cube_r423 = rightarm.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0102F, -0.1142F, 0.0457F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r424 = rightarm.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(54, 35).mirror().addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.01F, 0.5707F, -0.2883F, -1.1695F, -0.0014F, 0.001F));

		PartDefinition cube_r425 = rightarm.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-0.5F, -2.025F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0044F, 5.4321F, -0.4597F, 0.4188F, -0.0011F, 0.002F));

		PartDefinition cube_r426 = rightarm.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0107F, 3.8649F, -1.5397F, -0.8727F, -0.0031F, -0.0019F));

		PartDefinition cube_r427 = rightarm.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0083F, 2.8203F, -1.3939F, -0.0437F, -0.0031F, -0.0019F));

		PartDefinition cube_r428 = rightarm.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(61, 34).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4883F, 1.1621F, -1.897F, 0.1919F, -0.0014F, 0.001F));

		PartDefinition cube_r429 = rightarm.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(7, 43).mirror().addBox(-1.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightarm.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(-1.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.3915F, -0.2382F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r431 = rightarm2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(0.2849F, -0.3625F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.136F, -1.1702F, 1.3299F, 1.5708F, 1.4748F, 1.5708F));

		PartDefinition cube_r432 = rightarm2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.9415F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(23, 64).mirror().addBox(-0.9415F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 7.0713F, 1.1022F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r433 = rightarm2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-0.65F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 0.2618F, 1.6232F));

		PartDefinition cube_r434 = rightarm2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-0.375F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5272F, 0.2618F, 1.6232F));

		PartDefinition cube_r435 = rightarm2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-0.4F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(52, 71).mirror().addBox(-0.4F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 1.1781F, 1.6232F));

		PartDefinition cube_r436 = rightarm2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.4604F, 4.1302F, -0.0335F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r437 = rightarm2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.4923F, 1.6232F));

		PartDefinition cube_r438 = rightarm2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4248F, 4.8097F, 0.6872F, 1.5708F, 1.2828F, 1.6232F));

		PartDefinition cube_r439 = rightarm2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r440 = rightarm2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.9601F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1564F, 3.0773F, -0.388F, 1.5708F, 1.5272F, 1.6232F));

		PartDefinition cube_r441 = rightarm2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.8838F, 0.0948F, 1.5708F, 0.2182F, 1.5708F));

		PartDefinition cube_r442 = rightarm2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(0.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 3.4849F, 1.4674F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r443 = rightarm2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.596F, 1.2146F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 6.3215F, 1.1274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightArm3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 1.3606F, 0.0801F, -0.0786F, -0.0037F, 0.0024F));

		PartDefinition cube_r445 = rightArm4.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 79).mirror().addBox(0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 76).mirror().addBox(-0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r446 = rightArm4.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, 0.0873F));

		PartDefinition cube_r447 = bone2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(72, 13).addBox(-0.5587F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, 0.4642F, -0.3102F));

		PartDefinition cube_r448 = bone2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -2.525F, -1.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6488F, -3.0746F, 0.7182F, -0.4877F, 0.4451F, -0.3737F));

		PartDefinition cube_r449 = bone2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(37, 4).addBox(-1.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -0.4154F, 0.433F, -0.3661F));

		PartDefinition cube_r450 = bone2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(76, 62).addBox(-1.0311F, -3.2822F, -4.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -1.419F, 0.433F, -0.3661F));

		PartDefinition cube_r451 = bone2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(67, 71).addBox(-1.0311F, -1.2771F, -5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -1.8117F, 0.433F, -0.3661F));

		PartDefinition cube_r452 = bone2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(46, 64).addBox(-1.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -2.3789F, 0.433F, -0.3661F));

		PartDefinition cube_r453 = bone2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(44, 12).addBox(-1.0311F, 2.6354F, 0.9821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 2.2462F, 0.433F, -0.3661F));

		PartDefinition cube_r454 = bone2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(18, 62).addBox(-1.0311F, -0.9312F, 2.8693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.2863F, 0.433F, -0.3661F));

		PartDefinition cube_r455 = bone2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(21, 35).addBox(-1.0311F, -0.1568F, 1.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.5481F, 0.433F, -0.3661F));

		PartDefinition cube_r456 = bone2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(60, 61).addBox(-1.0311F, -0.0054F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.6964F, 0.433F, -0.3661F));

		PartDefinition cube_r457 = bone2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(15, 14).addBox(-0.8F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3193F, -3.9253F, -0.2132F, 1.4646F, 0.0033F, -0.3591F));

		PartDefinition cube_r458 = bone2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(71, 66).addBox(-0.5587F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, 0.4666F, -0.2893F));

		PartDefinition cube_r459 = bone2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(44, 8).addBox(-0.5587F, -0.2718F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, 0.4666F, -0.2893F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, -0.0873F));

		PartDefinition cube_r460 = bone4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-0.4413F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, -0.4642F, 0.3102F));

		PartDefinition cube_r461 = bone4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-0.5F, -2.525F, -1.05F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6488F, -3.0746F, 0.7182F, -0.4877F, -0.4451F, 0.3737F));

		PartDefinition cube_r462 = bone4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(37, 4).mirror().addBox(0.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -0.4154F, -0.433F, 0.3661F));

		PartDefinition cube_r463 = bone4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(0.0311F, -3.2822F, -4.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -1.419F, -0.433F, 0.3661F));

		PartDefinition cube_r464 = bone4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(0.0311F, -1.2771F, -5.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -1.8117F, -0.433F, 0.3661F));

		PartDefinition cube_r465 = bone4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(0.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -2.3789F, -0.433F, 0.3661F));

		PartDefinition cube_r466 = bone4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(44, 12).mirror().addBox(0.0311F, 2.6354F, 0.9821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 2.2462F, -0.433F, 0.3661F));

		PartDefinition cube_r467 = bone4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(0.0311F, -0.9312F, 2.8693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.2863F, -0.433F, 0.3661F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(21, 35).mirror().addBox(0.0311F, -0.1568F, 1.0125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.5481F, -0.433F, 0.3661F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(0.0311F, -0.0054F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.6964F, -0.433F, 0.3661F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(15, 14).mirror().addBox(-0.2F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3193F, -3.9253F, -0.2132F, 1.4646F, -0.0033F, 0.3591F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.4413F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, -0.4666F, 0.2893F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-0.4413F, -0.2718F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, -0.4666F, 0.2893F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.637F, 0.1311F, -0.0429F));

		PartDefinition cube_r473 = tail.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(80, 3).addBox(0.0F, -0.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r474 = tail.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(3, 80).addBox(0.0F, -0.875F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 28).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(45, 32).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, -0.0884F, 0.0949F, 0.0789F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(40, 46).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(33, 47).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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