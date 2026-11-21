package fossils.fossils.client.blockentity.model.borhyaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BorhyaenaFossilModel extends SkullModelBase {
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
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
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
	private final ModelPart tail10;
	private final ModelPart tail11;

	public BorhyaenaFossilModel(ModelPart root) {
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
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck3 = this.neck5.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
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
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.223F, 12.9507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 81).addBox(0.0F, -0.9889F, -0.9992F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(53, 80).addBox(0.0F, -1.2678F, -0.9129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 44).addBox(0.0F, -1.176F, -0.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 21).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 21).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 0).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6471F, 2.1417F, 1.545F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 55).addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2818F, -2.3496F, -0.8327F, -0.9697F, 0.1018F, 0.0812F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 25).addBox(-0.5F, -0.475F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1789F, -3.9584F, -2.0404F, -0.8737F, 0.1018F, 0.0812F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1287F, -3.5703F, -2.2223F, -0.9174F, 0.1018F, 0.0812F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 72).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3416F, -3.5377F, -0.1196F, -0.7428F, 0.1018F, 0.0812F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 72).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.23F, -3.9375F, -1.5255F, -1.8337F, 0.1018F, 0.0812F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3399F, -3.5277F, -0.1087F, -1.0221F, 0.1018F, 0.0812F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 68).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3398F, -2.1956F, -0.0611F, -1.2503F, 0.1215F, 0.0467F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(31, 31).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2003F, -1.5292F, -0.7249F, -1.6619F, 0.1663F, -0.1795F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(47, 15).addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4401F, -0.7945F, -0.1009F, -1.8713F, 0.1663F, -0.1795F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 46).addBox(-0.3683F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.356F, -0.4559F, -0.1587F, -1.0859F, 0.1663F, -0.1795F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 52).addBox(-0.9F, -1.2F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0308F, -0.0499F, -1.5172F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8976F, 1.2916F, -0.3049F, -0.8866F, 0.7259F, 0.7733F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 68).addBox(-1.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2232F, 0.8388F, 1.1222F, -1.7134F, 0.1311F, 0.1653F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 62).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2134F, 0.8315F, 1.1559F, 0.3969F, 0.0647F, 0.2403F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 72).addBox(-1.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2232F, 0.8388F, 1.1222F, -0.7099F, 0.1311F, 0.1653F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(42, 0).addBox(-0.8198F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.225F, 3.1307F, 1.5588F, -2.1006F, -0.6518F, 1.6723F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 68).addBox(-0.3883F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 68).addBox(-0.3883F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.225F, 3.1307F, 1.5588F, -1.6633F, -0.8107F, 1.0317F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6661F, 3.9307F, 1.1523F, 0.3089F, 0.7259F, 0.7733F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 14).addBox(-0.1571F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2999F, 2.4463F, 0.796F, -0.8692F, 0.7259F, 0.7733F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6471F, 2.1417F, 1.545F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2818F, -2.3496F, -0.8327F, -0.9697F, -0.1018F, -0.0812F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 25).mirror().addBox(-0.5F, -0.475F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1789F, -3.9584F, -2.0404F, -0.8737F, -0.1018F, -0.0812F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -0.875F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1287F, -3.5703F, -2.2223F, -0.9174F, -0.1018F, -0.0812F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3416F, -3.5377F, -0.1196F, -0.7428F, -0.1018F, -0.0812F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 72).mirror().addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.23F, -3.9375F, -1.5255F, -1.8337F, -0.1018F, -0.0812F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3399F, -3.5277F, -0.1087F, -1.0221F, -0.1018F, -0.0812F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3398F, -2.1956F, -0.0611F, -1.2503F, -0.1215F, -0.0467F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 31).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2003F, -1.5292F, -0.7249F, -1.6619F, -0.1663F, 0.1795F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-0.5F, -0.275F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4401F, -0.7945F, -0.1009F, -1.8713F, -0.1663F, 0.1795F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(23, 46).mirror().addBox(-0.6317F, -0.6697F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.356F, -0.4559F, -0.1587F, -1.0859F, -0.1663F, 0.1795F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-0.1F, -1.2F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0308F, -0.0499F, -1.5172F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8976F, 1.2916F, -0.3049F, -0.8866F, -0.7259F, -0.7733F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(0.0146F, 0.2845F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2232F, 0.8388F, 1.1222F, -1.7134F, -0.1311F, -0.1653F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2134F, 0.8315F, 1.1559F, 0.3969F, -0.0647F, -0.2403F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(0.0146F, -0.0259F, -0.98F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2232F, 0.8388F, 1.1222F, -0.7099F, -0.1311F, -0.1653F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-0.1802F, -0.5432F, -0.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.225F, 3.1307F, 1.5588F, -2.1006F, 0.6518F, -1.6723F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.6117F, -0.5432F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 68).mirror().addBox(-0.6117F, -0.5432F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.225F, 3.1307F, 1.5588F, -1.6633F, 0.8107F, -1.0317F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6661F, 3.9307F, 1.1523F, 0.3089F, -0.7259F, -0.7733F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-0.8429F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2999F, 2.4463F, 0.796F, -0.8692F, -0.7259F, -0.7733F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(61, 54).addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2F, 1.7593F, 0.8256F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.6414F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(18, 42).addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(15, 62).addBox(-0.5F, -0.0664F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(7, 56).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.5601F, 0.4011F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 5).addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4055F, 0.7187F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 26).addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(58, 48).addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(21, 58).addBox(-1.997F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 67).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(28, 2).addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(33, 21).addBox(-0.5F, -3.0222F, -0.0453F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 61).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 77).addBox(-1.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5345F, -0.8064F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(63, 2).addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 43).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.2318F, 0.7513F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftArm5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 6).addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 82).addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 80).addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 62).addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5304F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftArm5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-0.5F, 4.9865F, -0.6168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.7593F, 0.8256F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-0.5F, 0.0034F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1768F, 1.043F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1872F, 1.0394F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, -0.6414F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(18, 42).mirror().addBox(-0.5F, 0.0335F, 0.0098F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4165F, -0.3985F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 62).mirror().addBox(-0.5F, -0.0664F, -0.9902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8657F, 1.0865F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 4).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1301F, -0.5875F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5601F, 0.4011F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-1.0F, -0.275F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1714F, 0.2165F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -0.775F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2177F, -0.2957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4055F, 0.7187F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(59, 26).mirror().addBox(-1.0F, -0.7F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3118F, 0.7862F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-1.0F, -0.15F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.3437F, -0.0851F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-0.003F, -0.2308F, -1.2173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.35F, 0.9431F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.329F, 0.4337F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(28, 2).mirror().addBox(-0.5F, -6.5112F, -0.7657F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-0.5F, -3.0222F, -0.0453F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 5.9656F, -0.865F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.1691F, 0.622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(0.4F, -0.1447F, 0.3132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5345F, -0.8064F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-0.5F, -0.95F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.2318F, 0.7513F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightArm5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 80).mirror().addBox(-0.4F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 62).mirror().addBox(-1.2F, -0.425F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5304F, -2.1185F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightArm5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4399F, -0.6907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.097F, -3.4512F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(18, 32).addBox(0.0F, -1.1846F, -0.9952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2986F, -0.9047F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 51).addBox(0.0F, -1.0545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6986F, -2.8046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.48F, -3.5797F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-1.7472F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.48F, -1.5797F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(63, 18).addBox(-0.2528F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.48F, -1.5797F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 6).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.48F, -3.5797F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, -0.1513F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7675F, -13.3658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(65, 81).addBox(0.0F, -1.3645F, -4.034F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7933F, -3.7586F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-5.2581F, -1.8721F, -0.3159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.4435F, 0.283F, -1.3921F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 45).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.302F, 0.4313F, -0.9931F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2703F, -5.5602F, -0.1744F, 0.4935F, -0.7086F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-2.8352F, -0.2236F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.2879F, 0.444F, -1.0917F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -1.4602F, -0.1564F, 0.5021F, -0.8047F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.2512F, 0.5057F, -1.0749F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8703F, -3.4602F, -0.0995F, 0.5518F, -0.7761F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(81, 55).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.0995F, -0.5518F, 0.7761F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 0).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8703F, -3.4602F, -0.2512F, -0.5057F, 1.0749F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(81, 12).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.1564F, -0.5021F, 0.8047F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 48).addBox(0.8351F, -0.2236F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -1.4602F, -0.2879F, -0.444F, 1.0917F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 74).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.1744F, -0.4935F, 0.7086F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(48, 45).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.302F, -0.4313F, 0.9931F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 46).addBox(3.2581F, -1.8721F, -0.3159F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2703F, -5.5602F, -0.4435F, -0.283F, 1.3921F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(68, 81).addBox(0.0F, -1.5205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -2.1528F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(62, 81).addBox(0.0F, -1.8938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3949F, -5.8528F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 65).addBox(0.0F, -3.4205F, 0.0438F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.1F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(53, 75).addBox(0.0F, -2.9649F, -0.1021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.0F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(48, 41).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-6.4467F, -2.8451F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, 0.2686F, -1.3612F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 43).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, 0.4239F, -0.9668F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, 0.4919F, -0.6846F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 44).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.198F, -0.4919F, 0.6846F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 43).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3235F, -0.4239F, 0.9668F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 0).addBox(4.4467F, -2.8451F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4593F, -0.2686F, 1.3612F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(64, 58).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 41).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 39).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.3759F, -3.9807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 72).addBox(0.0F, -2.9121F, -0.1182F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.6F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(43, 61).addBox(0.0F, -3.9687F, -0.0408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5809F, -1.8018F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(52, 21).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 29).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, 0.2121F, -1.309F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(47, 19).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, 0.3681F, -0.9223F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, 0.4417F, -0.6487F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 32).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.229F, -0.4417F, 0.6487F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 19).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.3374F, -0.3681F, 0.9223F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(44, 29).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, -0.4496F, -0.2121F, 1.309F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(12, 66).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 21).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 66).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.3F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(22, 20).addBox(-0.5F, -0.0333F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 77).addBox(0.0F, -2.2606F, -0.0758F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4094F, -1.7777F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-3.3F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5915F, 5.4758F, 0.8458F, 0.4795F, 0.2019F, 0.2835F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(32, 43).mirror().addBox(-2.8F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2882F, 5.3679F, -0.4334F, 0.4817F, 0.143F, 0.3023F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0419F, 4.2939F, 3.7776F, 0.465F, 0.242F, 0.3763F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.1116F, 0.5369F, -0.5904F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.2574F, 0.4885F, -0.886F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.4287F, 0.3513F, -1.3001F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(77, 60).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.4287F, -0.3513F, 1.3001F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 37).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.2574F, -0.4885F, 0.886F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 51).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.1116F, -0.5369F, 0.5904F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 36).addBox(-4.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0419F, 4.2939F, 3.7776F, 0.465F, -0.242F, -0.3763F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(32, 43).addBox(-0.2F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2882F, 5.3679F, -0.4334F, 0.4817F, -0.143F, -0.3023F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 29).addBox(-0.7F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5915F, 5.4758F, 0.8458F, 0.4795F, -0.2019F, -0.2835F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(33, 7).addBox(-0.5F, -1.0261F, -3.0609F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.2581F, 2.2051F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(47, 31).addBox(-0.5F, -0.3756F, -1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 81).addBox(0.0F, -2.185F, -0.1495F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4588F, -1.6659F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.2821F, 0.4613F, -1.0543F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3294F, -1.5644F, -0.1449F, 0.5172F, -0.7643F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 34).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.1449F, -0.5172F, 0.7643F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(47, 35).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3294F, -1.5644F, -0.2821F, -0.4613F, 1.0543F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(7, 44).addBox(-0.5F, -0.8713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, -0.0522F, -0.2591F, -0.0363F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(11, 16).addBox(0.0F, -1.8076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7638F, -1.0128F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(22, 31).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9638F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.1086F, -0.1349F, -0.0288F));

		PartDefinition cube_r164 = neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(81, 76).addBox(0.0F, -1.6423F, -1.0693F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, 0.0007F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 8).addBox(-0.5F, -1.1F, 1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.9993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.05F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r166 = neck5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(59, 81).addBox(0.0F, -1.7423F, -0.2193F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3209F, -0.787F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 2).addBox(-0.5F, -1.1F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5F, 0.0068F, -0.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0886F, -2.9803F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(9, 41).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5068F, 0.544F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(7, 48).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -0.956F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(18, 36).addBox(0.0F, -0.801F, -1.6564F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0903F, 0.0384F, 0.4849F, -0.0201F, -0.0009F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.137F, -2.3706F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 71).addBox(-1.1624F, -1.0176F, -0.9203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1115F, 0.5631F, 0.5703F, -0.065F, -0.0931F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -0.525F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7066F, -2.4004F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 78).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0028F, -2.2775F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 25).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1091F, -1.5419F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(68, 27).addBox(-0.5F, -1.0242F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1361F, -3.2503F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, -1.0226F, -1.019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1361F, -3.2503F, 2.5482F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(40, 31).addBox(-0.5F, -0.1F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.058F, -3.7006F, 2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(34, 38).addBox(-0.5F, -0.1009F, -1.0871F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.6023F, -4.7458F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(58, 45).addBox(-1.0F, -0.7578F, -0.2659F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.7228F, -5.8412F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, -1.7842F, -0.6378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.7228F, -5.8412F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -0.0362F, 0.0209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.1228F, -5.9412F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(57, 58).addBox(-1.0F, -1.3309F, -0.0494F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 6.7228F, -5.8412F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(42, 15).addBox(-0.5F, -3.8627F, -0.8008F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 6.0532F, -4.9685F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 58).addBox(-1.0F, -1.2831F, -0.6917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 6.7228F, -5.8412F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(73, 19).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.006F, -0.8748F, -0.7981F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(66, 12).addBox(-0.5F, -1.325F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.006F, 0.2366F, 0.0583F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(37, 47).addBox(-1.0F, -2.1F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 23).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.006F, -0.666F, 0.0102F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 31).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.4488F, -0.049F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(25, 78).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(78, 18).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9335F, -1.7205F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 29).addBox(-0.5F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.9537F, -1.7013F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(78, 0).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.6441F, -1.3171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(11, 26).addBox(-1.0F, -0.875F, -1.525F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.4445F, -1.4453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1497F, 6.2996F, -4.7602F, -0.1095F, -0.2318F, -0.1668F));

		PartDefinition cube_r193 = leftCanine.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(73, 70).addBox(-0.1277F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(73, 67).addBox(-0.1277F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, -0.6797F, 0.2551F, 0.0186F));

		PartDefinition cube_r194 = leftCanine.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(73, 26).addBox(-0.1277F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, -0.4965F, 0.2551F, 0.0186F));

		PartDefinition cube_r195 = leftCanine.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 3).addBox(-0.1277F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.8038F, 0.2551F, 0.0186F));

		PartDefinition cube_r196 = leftCanine.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(76, 79).addBox(-0.1277F, 0.897F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.9871F, 0.2551F, 0.0186F));

		PartDefinition cube_r197 = leftCanine.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(70, 33).addBox(-0.5F, -0.75F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.0698F, 0.1024F, 0.3528F, 0.4198F, 0.2551F, 0.0186F));

		PartDefinition cube_r198 = leftCanine.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 77).addBox(-0.1717F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5483F, -0.3376F, -0.7471F, 0.8125F, 0.2551F, 0.0186F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1497F, 6.2996F, -4.7602F, -0.1095F, 0.2318F, 0.1668F));

		PartDefinition cube_r199 = rightCanine.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-0.8723F, -0.6866F, 1.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(73, 67).mirror().addBox(-0.8723F, -0.6866F, 1.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, -0.6797F, -0.2551F, -0.0186F));

		PartDefinition cube_r200 = rightCanine.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-0.8723F, -0.2897F, 1.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, -0.4965F, -0.2551F, -0.0186F));

		PartDefinition cube_r201 = rightCanine.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.8723F, 0.8271F, -0.2215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.8038F, -0.2551F, -0.0186F));

		PartDefinition cube_r202 = rightCanine.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.8723F, 0.897F, -0.5177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.9871F, -0.2551F, -0.0186F));

		PartDefinition cube_r203 = rightCanine.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.5F, -0.75F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.0698F, 0.1024F, 0.3528F, 0.4198F, -0.2551F, -0.0186F));

		PartDefinition cube_r204 = rightCanine.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.8283F, 0.3821F, -0.2705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5483F, -0.3376F, -0.7471F, 0.8125F, -0.2551F, -0.0186F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7512F, 6.1177F, -5.1959F, 0.0006F, 0.0699F, -0.0522F));

		PartDefinition cube_r205 = leftOrbit.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(28, 61).addBox(-0.2462F, 0.332F, -0.2039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.0313F, -3.04F, 2.5978F, 2.3556F, 0.1937F, 0.204F));

		PartDefinition cube_r206 = leftOrbit.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(28, 16).addBox(-0.2462F, 0.4811F, -0.0962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0313F, -3.04F, 2.5978F, 2.5301F, 0.1937F, 0.204F));

		PartDefinition cube_r207 = leftOrbit.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(25, 69).addBox(-0.2206F, -0.451F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0313F, -3.04F, 2.5978F, 1.5012F, 0.3402F, 0.1862F));

		PartDefinition cube_r208 = leftOrbit.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 35).addBox(-0.9F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4899F, -1.5138F, 0.6926F, -1.1554F, -0.0932F, 0.9793F));

		PartDefinition cube_r209 = leftOrbit.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(70, 50).addBox(-0.9473F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1537F, -2.4768F, 2.4198F, -1.2237F, 0.2506F, 0.1704F));

		PartDefinition cube_r210 = leftOrbit.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(45, 21).addBox(-0.7F, -0.7F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8361F, -1.9091F, 1.7637F, -2.6358F, -0.183F, 0.9343F));

		PartDefinition cube_r211 = leftOrbit.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(74, 39).addBox(-0.9473F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1537F, -2.4768F, 2.4198F, -2.6636F, 0.2506F, 0.1704F));

		PartDefinition cube_r212 = leftOrbit.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(74, 36).addBox(-0.955F, -0.058F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9543F, -1.7953F, 2.0722F, 2.2084F, 0.1645F, 0.1673F));

		PartDefinition cube_r213 = leftOrbit.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 68).addBox(-1.5263F, 0.0951F, -2.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4148F, -0.7709F, 1.2347F, 0.4574F, -0.0783F, -0.0385F));

		PartDefinition cube_r214 = leftOrbit.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(71, 64).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3336F, -1.061F, 2.1745F, 0.3282F, 0.1918F, 0.2424F));

		PartDefinition cube_r215 = leftOrbit.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(72, 8).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0978F, -0.6982F, 1.4446F, -0.8499F, 0.1918F, 0.2424F));

		PartDefinition cube_r216 = leftOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1223F, -1.0644F, 0.8975F, 0.2152F, 0.0048F, -0.1802F));

		PartDefinition cube_r217 = leftOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 56).addBox(-0.5F, -0.625F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1583F, -0.8276F, 1.5868F, -0.2826F, 0.1918F, 0.2424F));

		PartDefinition cube_r218 = leftOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 53).addBox(-0.5008F, -0.3544F, -0.7388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5264F, -1.5698F, 2.7554F, 0.4901F, 0.141F, 0.2403F));

		PartDefinition cube_r219 = leftOrbit.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(48, 71).addBox(-0.5008F, -0.3537F, -0.2562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5264F, -1.5698F, 2.7554F, 0.7519F, 0.141F, 0.2403F));

		PartDefinition cube_r220 = leftOrbit.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(43, 71).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7031F, -1.9983F, 3.3623F, 0.9705F, 0.143F, 0.1691F));

		PartDefinition cube_r221 = leftOrbit.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(30, 74).addBox(-0.955F, -0.19F, 0.5854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9543F, -1.7953F, 2.0722F, 0.8121F, 0.1645F, 0.1673F));

		PartDefinition cube_r222 = leftOrbit.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 80).addBox(-0.4585F, 0.0751F, -0.0456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7761F, -2.7204F, 1.9371F, 1.3466F, 0.5048F, 0.352F));

		PartDefinition cube_r223 = leftOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(54, 55).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.0041F, -5.538F, 5.3257F, 1.0956F, 0.8181F, 0.991F));

		PartDefinition cube_r224 = leftOrbit.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(25, 38).addBox(-2.9224F, -0.6938F, 0.5151F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.2563F, -4.54F, 3.8978F, 0.6775F, 0.0025F, 0.2108F));

		PartDefinition cube_r225 = leftOrbit.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(41, 12).addBox(-2.9224F, 0.1676F, 0.0515F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.2563F, -4.54F, 3.8978F, 1.3756F, 0.0025F, 0.2108F));

		PartDefinition cube_r226 = leftOrbit.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 77).addBox(-0.9224F, -0.1764F, -0.4437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.2563F, -4.54F, 3.8978F, 2.0738F, 0.0025F, 0.2108F));

		PartDefinition cube_r227 = leftOrbit.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(66, 78).addBox(-0.9224F, 0.0273F, 0.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2563F, -4.54F, 3.8978F, 2.161F, 0.0025F, 0.2108F));

		PartDefinition cube_r228 = leftOrbit.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(38, 69).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0069F, -8.8833F, 5.1015F, -0.1715F, 0.1207F, -2.8354F));

		PartDefinition cube_r229 = leftOrbit.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 21).addBox(-1.0698F, 0.4079F, -0.3512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5568F, -7.3606F, 5.2939F, -0.1623F, -0.1328F, 2.16F));

		PartDefinition cube_r230 = leftOrbit.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(67, 60).addBox(-0.9491F, -0.8413F, -0.3512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5568F, -7.3606F, 5.2939F, 0.0746F, -0.1958F, 0.9026F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(61, 29).addBox(-1.354F, 0.1542F, -0.4087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(14, 56).addBox(-1.354F, -0.6458F, -0.4087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5568F, -7.3606F, 5.2939F, 0.0385F, 0.0097F, -0.0228F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 26).addBox(-2.9188F, 0.458F, 0.1933F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2563F, -4.54F, 3.8978F, 2.1888F, 0.0112F, 0.2143F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(20, 74).addBox(-0.3307F, -0.902F, 1.955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0313F, -3.04F, 2.5978F, 0.9681F, 0.2042F, 0.243F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5006F, -0.352F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7761F, -2.7204F, 1.9371F, 2.609F, 0.5632F, 0.4524F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(33, 68).addBox(-0.5006F, -0.8086F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7761F, -2.7204F, 1.9371F, -2.8888F, 0.5632F, 0.4524F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(69, 36).addBox(-0.5399F, -0.1793F, -0.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7761F, -2.7204F, 1.9371F, -1.8837F, 0.477F, 0.3474F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 2).addBox(-1.2135F, -0.4242F, 0.2558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0711F, -3.8438F, 1.0762F, 1.2659F, 0.3711F, 0.4172F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(47, 55).addBox(-1.5033F, -0.4242F, 0.3458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0711F, -3.8438F, 1.0762F, 1.3749F, 0.4364F, 0.6931F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(21, 61).addBox(-0.8998F, -0.4242F, -0.0316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0711F, -3.8438F, 1.0762F, 1.1602F, 0.2476F, 0.074F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(66, 23).addBox(-0.6377F, -0.7727F, -0.4415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3812F, -1.221F, 1.0447F, -0.5884F, -0.0994F, -0.0381F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(72, 45).addBox(-0.8F, -0.8F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(72, 42).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.7265F, 0.122F, -0.267F, -0.705F, -0.6121F, -0.5524F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(35, 72).addBox(-0.6378F, 1.089F, -0.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(30, 71).addBox(-0.6378F, 1.089F, -0.2795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3812F, -1.221F, 1.0447F, -0.8939F, -0.0994F, -0.0381F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(78, 65).addBox(-0.6378F, 0.4757F, 0.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3812F, -1.221F, 1.0447F, -1.112F, -0.0994F, -0.0381F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 59).addBox(-0.8F, -2.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6446F, -0.8113F, 0.197F, -1.0658F, -0.4116F, 0.4541F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 8).addBox(-0.6377F, -0.0521F, -0.3756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3812F, -1.221F, 1.0447F, -0.9375F, -0.0994F, -0.0381F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(61, 78).addBox(-0.4863F, -0.4152F, -0.4719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1181F, -0.0165F, -0.4358F, -0.9141F, 0.1182F, 0.1964F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(15, 74).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0861F, -0.8323F, -0.7202F, -0.1711F, 0.1492F, 0.9256F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 76).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0303F, -0.5293F, -0.2347F, -0.1177F, 0.1757F, -0.5335F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(10, 74).addBox(-1.0756F, -0.3083F, -2.1133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4148F, -0.7709F, 1.2347F, -0.1163F, -0.0844F, -0.503F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(56, 78).addBox(-0.4917F, -0.6621F, -0.5533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1181F, -0.0165F, -0.4358F, -0.2373F, 0.1031F, 0.0609F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 79).addBox(-0.4863F, -0.3417F, -0.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1181F, -0.0165F, -0.4358F, 0.4385F, 0.1182F, 0.1964F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(14, 59).addBox(-1.0F, -0.5238F, -0.2283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0572F, -3.5626F, 1.1233F, 1.3091F, 0.2463F, 0.218F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(33, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1491F, -7.2196F, 3.3928F, 0.6008F, 0.407F, -0.6255F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5153F, -6.6819F, 3.9119F, 0.1146F, 0.7036F, -1.4965F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(15, 71).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1049F, -5.5429F, 1.6689F, 2.5312F, 0.2378F, -0.222F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(81, 9).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0572F, -6.2953F, 2.3418F, -2.527F, 0.4021F, -0.6061F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0243F, -5.9673F, 1.9659F, -2.5607F, -0.2578F, -1.0414F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(70, 30).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5937F, -5.7524F, 2.8725F, -3.0113F, 0.7101F, -1.4723F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(80, 14).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2273F, -8.2131F, 4.2868F, 0.8728F, 0.4755F, -0.4276F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(15, 80).addBox(-1.0F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2273F, -8.2131F, 4.2868F, 0.6616F, 0.4648F, -0.4121F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(61, 65).addBox(-0.775F, -1.075F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1113F, -4.1848F, 0.9672F, 2.6018F, 0.5087F, -0.2667F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(61, 75).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4205F, -2.3188F, 0.858F, 1.4938F, 1.0077F, -1.6533F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(56, 65).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1171F, -2.7709F, 0.1462F, 2.4995F, 0.4761F, -0.3217F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 77).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3909F, -1.1389F, 0.1963F, 0.0148F, 1.1487F, -1.5335F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(66, 75).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1334F, -1.4969F, -0.5763F, 1.0833F, 0.5064F, -0.2307F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(30, 80).addBox(-1.1F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3583F, -7.7737F, 4.968F, 0.0213F, 0.7442F, -1.6064F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(66, 53).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6266F, -5.4244F, 2.4966F, -2.0077F, 0.7101F, -1.4723F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(9, 37).addBox(-1.8F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6198F, -2.6802F, 0.6521F, -0.4064F, 1.054F, -1.6625F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(22, 26).addBox(-0.9351F, -0.4556F, -2.484F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0711F, -3.8438F, 1.0762F, 1.0737F, 0.3122F, 0.2028F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(7, 59).addBox(-1.0F, -0.5238F, -0.7717F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0572F, -3.5626F, 1.1233F, 1.4836F, 0.2463F, 0.218F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(69, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3617F, -2.7938F, 1.234F, 2.2245F, 0.3745F, 0.2579F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7512F, 6.1177F, -5.1959F, 0.0006F, -0.0699F, 0.0522F));

		PartDefinition cube_r272 = rightOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(-0.7538F, 0.332F, -0.2039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, -3.04F, 2.5978F, 2.3556F, -0.1937F, -0.204F));

		PartDefinition cube_r273 = rightOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-0.7538F, 0.4811F, -0.0962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, -3.04F, 2.5978F, 2.5301F, -0.1937F, -0.204F));

		PartDefinition cube_r274 = rightOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.7794F, -0.451F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, -3.04F, 2.5978F, 1.5012F, -0.3402F, -0.1862F));

		PartDefinition cube_r275 = rightOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-0.1F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4899F, -1.5138F, 0.6926F, -1.1554F, 0.0932F, -0.9793F));

		PartDefinition cube_r276 = rightOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 50).mirror().addBox(-0.0527F, 1.0491F, 0.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, -2.4768F, 2.4198F, -1.2237F, -0.2506F, -0.1704F));

		PartDefinition cube_r277 = rightOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(45, 21).mirror().addBox(-0.3F, -0.7F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8361F, -1.9091F, 1.7637F, -2.6358F, 0.183F, -0.9343F));

		PartDefinition cube_r278 = rightOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-0.0527F, -1.1275F, 0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, -2.4768F, 2.4198F, -2.6636F, -0.2506F, -0.1704F));

		PartDefinition cube_r279 = rightOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.045F, -0.058F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9543F, -1.7953F, 2.0722F, 2.2084F, -0.1645F, -0.1673F));

		PartDefinition cube_r280 = rightOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(0.5263F, 0.0951F, -2.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4148F, -0.7709F, 1.2347F, 0.4574F, 0.0783F, 0.0385F));

		PartDefinition cube_r281 = rightOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, -1.061F, 2.1745F, 0.3282F, -0.1918F, -0.2424F));

		PartDefinition cube_r282 = rightOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0978F, -0.6982F, 1.4446F, -0.8499F, -0.1918F, -0.2424F));

		PartDefinition cube_r283 = rightOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1223F, -1.0644F, 0.8975F, 0.2152F, -0.0048F, 0.1802F));

		PartDefinition cube_r284 = rightOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(71, 56).mirror().addBox(-0.5F, -0.625F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1583F, -0.8276F, 1.5868F, -0.2826F, -0.1918F, -0.2424F));

		PartDefinition cube_r285 = rightOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-0.4992F, -0.3544F, -0.7388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5264F, -1.5698F, 2.7554F, 0.4901F, -0.141F, -0.2403F));

		PartDefinition cube_r286 = rightOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(48, 71).mirror().addBox(-0.4992F, -0.3537F, -0.2562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5264F, -1.5698F, 2.7554F, 0.7519F, -0.141F, -0.2403F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7031F, -1.9983F, 3.3623F, 0.9705F, -0.143F, -0.1691F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-0.045F, -0.19F, 0.5854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.9543F, -1.7953F, 2.0722F, 0.8121F, -0.1645F, -0.1673F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5415F, 0.0751F, -0.0456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, -2.7204F, 1.9371F, 1.3466F, -0.5048F, -0.352F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.0041F, -5.538F, 5.3257F, 1.0956F, -0.8181F, -0.991F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(25, 38).mirror().addBox(-0.0776F, -0.6938F, 0.5151F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.2563F, -4.54F, 3.8978F, 0.6775F, -0.0025F, -0.2108F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(41, 12).mirror().addBox(-0.0776F, 0.1676F, 0.0515F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.2563F, -4.54F, 3.8978F, 1.3756F, -0.0025F, -0.2108F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.0776F, -0.1764F, -0.4437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.2563F, -4.54F, 3.8978F, 2.0738F, -0.0025F, -0.2108F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(66, 78).mirror().addBox(-0.0776F, 0.0273F, 0.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2563F, -4.54F, 3.8978F, 2.161F, -0.0025F, -0.2108F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(38, 69).mirror().addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0069F, -8.8833F, 5.1015F, -0.1715F, -0.1207F, 2.8354F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(81, 21).mirror().addBox(0.0698F, 0.4079F, -0.3512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, -7.3606F, 5.2939F, -0.1623F, 0.1328F, -2.16F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.0509F, -0.8413F, -0.3512F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, -7.3606F, 5.2939F, 0.0746F, 0.1958F, -0.9026F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(-0.646F, 0.1542F, -0.4087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(14, 56).mirror().addBox(-0.646F, -0.6458F, -0.4087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, -7.3606F, 5.2939F, 0.0385F, -0.0097F, 0.0228F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(38, 26).mirror().addBox(-0.0812F, 0.458F, 0.1933F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2563F, -4.54F, 3.8978F, 2.1888F, -0.0112F, -0.2143F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.6693F, -0.902F, 1.955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, -3.04F, 2.5978F, 0.9681F, -0.2042F, -0.243F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.4994F, -0.352F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, -2.7204F, 1.9371F, 2.609F, -0.5632F, -0.4524F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-0.4994F, -0.8086F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, -2.7204F, 1.9371F, -2.8888F, -0.5632F, -0.4524F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.4601F, -0.1793F, -0.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, -2.7204F, 1.9371F, -1.8837F, -0.477F, -0.3474F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(56, 2).mirror().addBox(-0.7865F, -0.4242F, 0.2558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0711F, -3.8438F, 1.0762F, 1.2659F, -0.3711F, -0.4172F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(47, 55).mirror().addBox(-0.4967F, -0.4242F, 0.3458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0711F, -3.8438F, 1.0762F, 1.3749F, -0.4364F, -0.6931F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(-1.1002F, -0.4242F, -0.0316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0711F, -3.8438F, 1.0762F, 1.1602F, -0.2476F, -0.074F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-0.3623F, -0.7727F, -0.4415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, -1.221F, 1.0447F, -0.5884F, 0.0994F, 0.0381F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-0.2F, -0.8F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(72, 42).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7265F, 0.122F, -0.267F, -0.705F, 0.6121F, 0.5524F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.3622F, 1.089F, -0.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(30, 71).mirror().addBox(-0.3622F, 1.089F, -0.2795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, -1.221F, 1.0447F, -0.8939F, 0.0994F, 0.0381F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.3622F, 0.4757F, 0.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, -1.221F, 1.0447F, -1.112F, 0.0994F, 0.0381F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(-0.2F, -2.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6446F, -0.8113F, 0.197F, -1.0658F, 0.4116F, -0.4541F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-0.3623F, -0.0521F, -0.3756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, -1.221F, 1.0447F, -0.9375F, 0.0994F, 0.0381F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-0.5137F, -0.4152F, -0.4719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1181F, -0.0165F, -0.4358F, -0.9141F, -0.1182F, -0.1964F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0861F, -0.8323F, -0.7202F, -0.1711F, -0.1492F, -0.9256F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0303F, -0.5293F, -0.2347F, -0.1177F, -0.1757F, 0.5335F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(0.0756F, -0.3083F, -2.1133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4148F, -0.7709F, 1.2347F, -0.1163F, 0.0844F, 0.503F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(56, 78).mirror().addBox(-0.5083F, -0.6621F, -0.5533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1181F, -0.0165F, -0.4358F, -0.2373F, -0.1031F, -0.0609F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5137F, -0.3417F, -0.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1181F, -0.0165F, -0.4358F, 0.4385F, -0.1182F, -0.1964F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-1.0F, -0.5238F, -0.2283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0572F, -3.5626F, 1.1233F, 1.3091F, -0.2463F, -0.218F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(33, 55).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1491F, -7.2196F, 3.3928F, 0.6008F, -0.407F, 0.6255F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5153F, -6.6819F, 3.9119F, 0.1146F, -0.7036F, 1.4965F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1049F, -5.5429F, 1.6689F, 2.5312F, -0.2378F, 0.222F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0572F, -6.2953F, 2.3418F, -2.527F, -0.4021F, 0.6061F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0243F, -5.9673F, 1.9659F, -2.5607F, 0.2578F, 1.0414F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5937F, -5.7524F, 2.8725F, -3.0113F, -0.7101F, 1.4723F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2273F, -8.2131F, 4.2868F, 0.8728F, -0.4755F, 0.4276F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(0.0F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2273F, -8.2131F, 4.2868F, 0.6616F, -0.4648F, 0.4121F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-0.225F, -1.075F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1113F, -4.1848F, 0.9672F, 2.6018F, -0.5087F, 0.2667F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(61, 75).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4205F, -2.3188F, 0.858F, 1.4938F, -1.0077F, 1.6533F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -2.7709F, 0.1462F, 2.4995F, -0.4761F, 0.3217F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3909F, -1.1389F, 0.1963F, 0.0148F, -1.1487F, 1.5335F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(66, 75).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1334F, -1.4969F, -0.5763F, 1.0833F, -0.5064F, 0.2307F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(0.1F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3583F, -7.7737F, 4.968F, 0.0213F, -0.7442F, 1.6064F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6266F, -5.4244F, 2.4966F, -2.0077F, -0.7101F, 1.4723F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-0.2F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6198F, -2.6802F, 0.6521F, -0.4064F, -1.054F, 1.6625F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-1.0649F, -0.4556F, -2.484F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0711F, -3.8438F, 1.0762F, 1.0737F, -0.3122F, -0.2028F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-1.0F, -0.5238F, -0.7717F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0572F, -3.5626F, 1.1233F, 1.4836F, -0.2463F, -0.218F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3617F, -2.7938F, 1.234F, 2.2245F, -0.3745F, -0.2579F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.5296F, -0.2353F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(9, 32).mirror().addBox(-0.9086F, -0.2358F, -3.6772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(68, 69).mirror().addBox(-0.8086F, -0.7772F, -3.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -1.5116F, -0.4128F, -0.1858F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.9086F, 0.5227F, -3.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -1.7297F, -0.4128F, -0.1858F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.9086F, 1.857F, 0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -3.126F, -0.4128F, -0.1858F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(43, 74).mirror().addBox(-0.5982F, -2.6051F, 1.4742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.7171F, -0.2466F, -0.6634F, -1.1542F, 0.6933F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-0.4982F, -1.1923F, -2.684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.6421F, -0.2466F, -2.7665F, -1.1542F, 0.6933F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-0.8016F, -2.0202F, -0.9901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.6421F, -0.2466F, -0.8854F, -0.4046F, -0.2348F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 69).mirror().addBox(-0.8086F, 0.8173F, -1.9215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -1.9566F, -0.4128F, -0.1858F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.8086F, -2.6005F, -1.1765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -0.5517F, -0.4128F, -0.1858F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-0.0294F, -0.0158F, -0.3902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.9589F, -0.2001F, -0.0759F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(33, 64).mirror().addBox(-0.109F, 1.321F, -1.5284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.9671F, 0.1534F, -0.6065F, -0.1825F, -0.0243F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(38, 61).mirror().addBox(-0.0378F, -0.0783F, -1.234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.8634F, -0.205F, -0.07F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.8086F, 1.4606F, -2.7444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.225F, 2.8671F, -0.4716F, -2.2533F, -0.4128F, -0.1858F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-0.109F, -0.9674F, 1.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 22).mirror().addBox(-0.109F, -0.9674F, 1.5198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.9671F, 0.1534F, -2.4391F, -0.1825F, -0.0243F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.0849F, 1.8026F, 0.0171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -1.1719F, -0.2347F, -0.0766F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.0849F, 0.4883F, -3.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 0.2244F, -0.2347F, -0.0766F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-0.0849F, -4.0761F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 1.5334F, -0.2347F, -0.0766F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(68, 2).mirror().addBox(-0.0849F, -4.2459F, -0.3287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 2.0134F, -0.2347F, -0.0766F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(71, 76).mirror().addBox(-0.0849F, -0.8132F, -2.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(76, 76).mirror().addBox(-0.0849F, -0.8132F, -3.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 0.4862F, -0.2347F, -0.0766F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.9033F, 2.3505F, -1.3923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -1.3747F, 0.216F, 3.0972F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(77, 42).mirror().addBox(-0.9033F, 2.4977F, -0.1128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -1.9419F, 0.216F, 3.0972F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.9033F, 0.9495F, -2.7481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.7638F, 0.216F, 3.0972F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.9033F, 2.5215F, -2.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -1.2001F, 0.216F, 3.0972F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-0.959F, -0.1563F, -1.9513F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 8).mirror().addBox(-0.959F, -0.1563F, -0.3513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.7598F, 0.1813F, 3.0976F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-1.5329F, 1.287F, -4.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.7554F, 0.0254F, 3.0409F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-1.5329F, 2.6513F, -3.5579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -1.1481F, 0.0254F, 3.0409F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-1.5271F, 1.0268F, -4.9823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.5808F, 0.0254F, 3.0409F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-1.5271F, 1.7684F, -4.5876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -0.7641F, 0.0254F, 3.0409F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-1.5271F, 4.1691F, 1.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -2.0644F, 0.0254F, 3.0409F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-1.5271F, 3.7449F, 1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 45).mirror().addBox(-1.5271F, 3.7449F, 1.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, -2.2476F, 0.0254F, 3.0409F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-1.5329F, -3.9965F, -2.9562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 0.51F, 0.0254F, 3.0409F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(1.4814F, -3.7983F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 77).mirror().addBox(1.5814F, -3.7983F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.9671F, -1.6466F, 1.534F, 0.1578F, -0.0911F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-0.6F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0614F, 4.5189F, -5.9286F, -1.1135F, -0.0877F, -2.8992F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(38, 61).addBox(-0.9622F, -0.0783F, -1.234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.8634F, 0.205F, 0.07F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(33, 64).addBox(-0.891F, 1.321F, -1.5284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 0.9671F, 0.1534F, -0.6065F, 0.1825F, 0.0243F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(76, 22).addBox(-0.891F, -0.9674F, 1.5198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(76, 11).addBox(-0.891F, -0.9674F, 1.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9671F, 0.1534F, -2.4391F, 0.1825F, 0.0243F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(76, 76).addBox(-0.9151F, -0.8132F, -3.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 76).addBox(-0.9151F, -0.8132F, -2.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 0.4862F, 0.2347F, 0.0766F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(20, 80).addBox(-0.0967F, 2.5215F, -2.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -1.2001F, -0.216F, -3.0972F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(25, 72).addBox(-0.0967F, 2.3505F, -1.3923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -1.3747F, -0.216F, -3.0972F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(77, 42).addBox(-0.0967F, 2.4977F, -0.1128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -1.9419F, -0.216F, -3.0972F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(62, 8).addBox(-0.041F, -0.1563F, -0.3513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 38).addBox(-0.041F, -0.1563F, -1.9513F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.7598F, -0.1813F, -3.0976F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(42, 39).addBox(-0.4F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5386F, 4.5189F, -5.9286F, -1.1135F, 0.0877F, 2.8992F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(5, 77).addBox(-0.0967F, 0.9495F, -2.7481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.7638F, -0.216F, -3.0972F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(68, 2).addBox(-0.9151F, -4.2459F, -0.3287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 2.0134F, 0.2347F, 0.0766F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(77, 57).addBox(0.5329F, -3.9965F, -2.9562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 0.51F, -0.0254F, -3.0409F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(70, 5).addBox(0.5329F, 1.287F, -4.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.7554F, -0.0254F, -3.0409F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(53, 69).addBox(0.5329F, 2.6513F, -3.5579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -1.1481F, -0.0254F, -3.0409F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(79, 38).addBox(0.5271F, 1.0268F, -4.9823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.5808F, -0.0254F, -3.0409F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(20, 71).addBox(0.5271F, 1.7684F, -4.5876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.7641F, -0.0254F, -3.0409F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(71, 23).addBox(0.5271F, 4.1691F, 1.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -2.0644F, -0.0254F, -3.0409F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(45, 77).addBox(0.5271F, 3.7449F, 1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 45).addBox(0.5271F, 3.7449F, 1.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -2.2476F, -0.0254F, -3.0409F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(10, 77).addBox(-2.5814F, -3.7983F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(77, 6).addBox(-2.4814F, -3.7983F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 1.534F, -0.1578F, 0.0911F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(76, 62).addBox(-0.9151F, -4.0761F, -2.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 1.5334F, 0.2347F, 0.0766F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(76, 54).addBox(-0.9151F, 0.4883F, -3.5834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, 0.2244F, 0.2347F, 0.0766F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(76, 51).addBox(-0.9151F, 1.8026F, 0.0171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -1.1719F, 0.2347F, 0.0766F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(20, 64).addBox(-0.9706F, -0.0158F, -0.3902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 2.9671F, -1.6466F, -0.9589F, 0.2001F, 0.0759F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 70).addBox(-0.1914F, 1.4606F, -2.7444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -2.2533F, 0.4128F, 0.1858F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(68, 69).addBox(-0.1914F, -0.7772F, -3.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(9, 32).addBox(-0.0914F, -0.2358F, -3.6772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -1.5116F, 0.4128F, 0.1858F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(51, 63).addBox(-0.1914F, -2.6005F, -1.1765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -0.5517F, 0.4128F, 0.1858F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(63, 69).addBox(-0.1914F, 0.8173F, -1.9215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -1.9566F, 0.4128F, 0.1858F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(46, 63).addBox(-0.1984F, -2.0202F, -0.9901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, 2.6421F, -0.2466F, -0.8854F, 0.4046F, 0.2348F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(58, 69).addBox(-0.5018F, -1.1923F, -2.684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7F, 2.6421F, -0.2466F, -2.7665F, 1.1542F, -0.6933F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(43, 74).addBox(-0.4018F, -2.6051F, 1.4742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.625F, 2.7171F, -0.2466F, -0.6634F, 1.1542F, -0.6933F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(5, 80).addBox(-0.0914F, 1.857F, 0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -3.126F, 0.4128F, 0.1858F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(10, 80).addBox(-0.0914F, 0.5227F, -3.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.625F, 2.8671F, -0.4716F, -1.7297F, 0.4128F, 0.1858F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r403 = sternum.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(28, 14).mirror().addBox(-4.7247F, 0.573F, -1.3985F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2142F, -1.1958F, 2.1335F, 0.1512F, 0.4084F, 0.126F));

		PartDefinition cube_r404 = sternum.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-4.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4594F, -0.7265F, 4.2648F, 0.221F, 0.2459F, 0.3255F));

		PartDefinition cube_r405 = sternum.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(28, 12).mirror().addBox(-3.8F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9969F, -1.1136F, 6.3265F, 0.4668F, 0.201F, 0.5775F));

		PartDefinition cube_r406 = sternum.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(25, 36).mirror().addBox(-3.8F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4814F, -1.6838F, 8.4673F, 0.6346F, 0.2254F, 0.9133F));

		PartDefinition cube_r407 = sternum.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(25, 36).addBox(-0.2F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2097F, -1.6838F, 8.4673F, 0.6346F, -0.2254F, -0.9133F));

		PartDefinition cube_r408 = sternum.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(28, 12).addBox(-1.2F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7251F, -1.1136F, 6.3265F, 0.4668F, -0.201F, -0.5775F));

		PartDefinition cube_r409 = sternum.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -1.8252F, -0.6115F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.6718F, 4.8464F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r410 = sternum.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(28, 0).addBox(-0.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1877F, -0.7265F, 4.2648F, 0.221F, -0.2459F, -0.3255F));

		PartDefinition cube_r411 = sternum.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(28, 14).addBox(-0.2753F, 0.573F, -1.3985F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.486F, -1.1958F, 2.1335F, 0.1512F, -0.4084F, -0.126F));

		PartDefinition cube_r412 = sternum.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -1.3914F, -4.5715F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.3718F, 3.6464F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8907F, 2.9783F, -1.4837F, 0.2167F, -0.009F, -0.0068F));

		PartDefinition cube_r413 = leftarm.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(56, 33).addBox(-1.0F, -1.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r414 = leftarm.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(57, 42).addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(57, 39).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0113F, 0.0926F, -0.8585F, 3.1066F, 0.0014F, -0.001F));

		PartDefinition cube_r415 = leftarm.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(56, 51).addBox(-1.0F, 0.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(56, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0102F, -0.1142F, 0.0457F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r416 = leftarm.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(57, 36).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.01F, 0.5707F, -0.2883F, -1.1695F, 0.0014F, -0.001F));

		PartDefinition cube_r417 = leftarm.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(54, 23).addBox(-0.5F, -0.225F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.009F, 3.605F, -1.273F, 0.3882F, 0.0011F, -0.002F));

		PartDefinition cube_r418 = leftarm.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(25, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0107F, 3.8649F, -1.5397F, -0.8727F, 0.0031F, 0.0019F));

		PartDefinition cube_r419 = leftarm.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(75, 15).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 2.8203F, -1.3939F, -0.0437F, 0.0031F, 0.0019F));

		PartDefinition cube_r420 = leftarm.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(64, 36).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4883F, 1.1621F, -1.897F, 0.1919F, 0.0014F, -0.001F));

		PartDefinition cube_r421 = leftarm.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(32, 45).addBox(0.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftarm.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(75, 3).addBox(0.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.2003F, 0.2242F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftarm2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(28, 55).addBox(-1.2848F, -1.3625F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.136F, -1.1702F, 1.3299F, 1.5708F, -1.4748F, -1.5708F));

		PartDefinition cube_r424 = leftarm2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(45, 80).addBox(-0.0585F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(48, 67).addBox(-0.0585F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, 7.0713F, 1.1023F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r425 = leftarm2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(75, 29).addBox(-0.35F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -0.2618F, -1.6232F));

		PartDefinition cube_r426 = leftarm2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(70, 16).addBox(-0.625F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5272F, -0.2618F, -1.6232F));

		PartDefinition cube_r427 = leftarm2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(71, 12).addBox(-0.6F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(10, 71).addBox(-0.6F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6489F, 0.5328F, -0.0395F, 1.5708F, -1.1781F, -1.6232F));

		PartDefinition cube_r428 = leftarm2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(52, 58).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4604F, 4.1302F, -0.0335F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r429 = leftarm2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(64, 40).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.4923F, -1.6232F));

		PartDefinition cube_r430 = leftarm2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(57, 61).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4248F, 4.8097F, 0.6872F, 1.5708F, -1.2828F, -1.6232F));

		PartDefinition cube_r431 = leftarm2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(47, 58).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5334F, 2.7364F, -0.1433F, 1.5708F, -1.3701F, -1.6232F));

		PartDefinition cube_r432 = leftarm2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(57, 8).addBox(-0.0399F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1564F, 3.0773F, -0.388F, 1.5708F, -1.5272F, -1.6232F));

		PartDefinition cube_r433 = leftarm2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(5, 71).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.8838F, 0.0949F, 1.5708F, -0.2182F, -1.5708F));

		PartDefinition cube_r434 = leftarm2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1764F, 3.4849F, 1.4674F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r435 = leftarm2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(61, 13).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1764F, 0.596F, 1.2146F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 6.3215F, 1.1274F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftArm3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(21, 54).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 1.3606F, 0.0801F, 0.5759F, 0.0037F, -0.0024F));

		PartDefinition cube_r437 = leftArm4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(82, 57).addBox(-1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 82).addBox(-1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 44).addBox(-0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 41).addBox(0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r438 = leftArm4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8907F, 2.9783F, -1.4837F, 0.6967F, 0.009F, 0.0068F));

		PartDefinition cube_r439 = rightarm.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(56, 33).mirror().addBox(-1.0F, -1.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1835F, 0.3413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r440 = rightarm.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-1.0F, -1.1F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(57, 39).mirror().addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0113F, 0.0926F, -0.8585F, 3.1066F, -0.0014F, 0.001F));

		PartDefinition cube_r441 = rightarm.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-1.0F, 0.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(56, 18).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0102F, -0.1142F, 0.0457F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r442 = rightarm.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.01F, 0.5707F, -0.2883F, -1.1695F, -0.0014F, 0.001F));

		PartDefinition cube_r443 = rightarm.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-0.5F, -0.225F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.009F, 3.605F, -1.273F, 0.3882F, -0.0011F, 0.002F));

		PartDefinition cube_r444 = rightarm.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0107F, 3.8649F, -1.5397F, -0.8727F, -0.0031F, -0.0019F));

		PartDefinition cube_r445 = rightarm.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(75, 15).mirror().addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0083F, 2.8203F, -1.3939F, -0.0437F, -0.0031F, -0.0019F));

		PartDefinition cube_r446 = rightarm.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4883F, 1.1621F, -1.897F, 0.1919F, -0.0014F, 0.001F));

		PartDefinition cube_r447 = rightarm.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(32, 45).mirror().addBox(-1.0F, -1.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.6885F, -0.3986F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightarm.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(75, 3).mirror().addBox(-1.0F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5915F, -0.5274F, -0.3229F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.2003F, 0.2242F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightarm2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(0.2848F, -1.3625F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.136F, -1.1702F, 1.3299F, 1.5708F, 1.4748F, 1.5708F));

		PartDefinition cube_r450 = rightarm2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.9415F, -1.8872F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(48, 67).mirror().addBox(-0.9415F, -3.6372F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 7.0713F, 1.1023F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r451 = rightarm2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-0.65F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 0.2618F, 1.6232F));

		PartDefinition cube_r452 = rightarm2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-0.375F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5272F, 0.2618F, 1.6232F));

		PartDefinition cube_r453 = rightarm2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-0.4F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(10, 71).mirror().addBox(-0.4F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6489F, 0.5328F, -0.0395F, 1.5708F, 1.1781F, 1.6232F));

		PartDefinition cube_r454 = rightarm2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.4604F, 4.1302F, -0.0335F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r455 = rightarm2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.4923F, 1.6232F));

		PartDefinition cube_r456 = rightarm2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(57, 61).mirror().addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4248F, 4.8097F, 0.6872F, 1.5708F, 1.2828F, 1.6232F));

		PartDefinition cube_r457 = rightarm2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5334F, 2.7364F, -0.1433F, 1.5708F, 1.3701F, 1.6232F));

		PartDefinition cube_r458 = rightarm2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-0.9601F, -3.0491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1564F, 3.0773F, -0.388F, 1.5708F, 1.5272F, 1.6232F));

		PartDefinition cube_r459 = rightarm2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.8838F, 0.0949F, 1.5708F, 0.2182F, 1.5708F));

		PartDefinition cube_r460 = rightarm2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 3.4849F, 1.4674F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r461 = rightarm2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(61, 13).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.596F, 1.2146F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 6.3215F, 1.1274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightArm3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(21, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 1.3606F, 0.0801F, -0.5149F, -0.0037F, 0.0024F));

		PartDefinition cube_r463 = rightArm4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(1.9F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 82).mirror().addBox(1.1F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 44).mirror().addBox(0.3F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 41).mirror().addBox(-0.5F, -0.55F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightArm4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9831F, 3.7543F, -2.2716F, -0.2613F, 0.0114F, 0.0865F));

		PartDefinition cube_r465 = bone2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(75, 48).addBox(-0.5587F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, 0.4642F, -0.3102F));

		PartDefinition cube_r466 = bone2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2207F, -2.5847F, 2.0403F, -1.9276F, 0.4451F, -0.3737F));

		PartDefinition cube_r467 = bone2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(38, 21).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4632F, -2.7211F, 0.81F, -1.055F, 0.4451F, -0.3737F));

		PartDefinition cube_r468 = bone2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(38, 65).addBox(-0.5F, 0.475F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6488F, -3.0746F, 0.7182F, -0.4877F, 0.4451F, -0.3737F));

		PartDefinition cube_r469 = bone2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(56, 75).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7039F, -5.8551F, 2.7941F, 0.4136F, 0.433F, -0.3661F));

		PartDefinition cube_r470 = bone2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(25, 41).addBox(-1.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -0.4154F, 0.433F, -0.3661F));

		PartDefinition cube_r471 = bone2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(35, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-2.0959F, -6.1907F, 0.242F, -1.5935F, 0.433F, -0.3661F));

		PartDefinition cube_r472 = bone2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(51, 47).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.1318F, -5.4371F, -0.4142F, 2.6826F, 0.433F, -0.3661F));

		PartDefinition cube_r473 = bone2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(66, 65).addBox(-1.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, -2.3789F, 0.433F, -0.3661F));

		PartDefinition cube_r474 = bone2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(49, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.754F, -3.6081F, -1.0676F, -0.1536F, 0.433F, -0.3661F));

		PartDefinition cube_r475 = bone2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(5, 62).addBox(-1.0311F, -0.6312F, 2.5443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.2863F, 0.433F, -0.3661F));

		PartDefinition cube_r476 = bone2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(25, 65).addBox(-1.0311F, -0.0568F, 1.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4087F, -1.3188F, -1.3887F, 1.5481F, 0.433F, -0.3661F));

		PartDefinition cube_r477 = bone2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.775F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.557F, -2.0199F, 0.1204F, 2.3946F, 0.433F, -0.3661F));

		PartDefinition cube_r478 = bone2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(15, 14).addBox(-0.8F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3193F, -3.9253F, -0.2132F, 1.4646F, 0.0033F, -0.3591F));

		PartDefinition cube_r479 = bone2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(75, 32).addBox(-0.5587F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, 0.4666F, -0.2893F));

		PartDefinition cube_r480 = bone2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(14, 48).addBox(-0.5587F, -0.3968F, 0.126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6354F, 0.4666F, -0.2893F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9831F, 3.7543F, -2.2716F, -0.2613F, -0.0114F, -0.0865F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(75, 48).mirror().addBox(-0.4413F, -0.2993F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, -0.4642F, 0.3102F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2207F, -2.5847F, 2.0403F, -1.9276F, -0.4451F, 0.3737F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4632F, -2.7211F, 0.81F, -1.055F, -0.4451F, 0.3737F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(38, 65).mirror().addBox(-0.5F, 0.475F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6488F, -3.0746F, 0.7182F, -0.4877F, -0.4451F, 0.3737F));

		PartDefinition cube_r485 = bone4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(56, 75).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7039F, -5.8551F, 2.7941F, 0.4136F, -0.433F, 0.3661F));

		PartDefinition cube_r486 = bone4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(25, 41).mirror().addBox(0.0311F, -5.7326F, 0.2396F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -0.4154F, -0.433F, 0.3661F));

		PartDefinition cube_r487 = bone4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(2.0959F, -6.1907F, 0.242F, -1.5935F, -0.433F, 0.3661F));

		PartDefinition cube_r488 = bone4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.1318F, -5.4371F, -0.4142F, 2.6826F, -0.433F, 0.3661F));

		PartDefinition cube_r489 = bone4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(0.0311F, 0.6539F, -4.6815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, -2.3789F, -0.433F, 0.3661F));

		PartDefinition cube_r490 = bone4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(49, 51).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.754F, -3.6081F, -1.0676F, -0.1536F, -0.433F, 0.3661F));

		PartDefinition cube_r491 = bone4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(0.0311F, -0.6312F, 2.5443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.2863F, -0.433F, 0.3661F));

		PartDefinition cube_r492 = bone4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(0.0311F, -0.0568F, 1.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4087F, -1.3188F, -1.3887F, 1.5481F, -0.433F, 0.3661F));

		PartDefinition cube_r493 = bone4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, -0.775F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.557F, -2.0199F, 0.1204F, 2.3946F, -0.433F, 0.3661F));

		PartDefinition cube_r494 = bone4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(15, 14).mirror().addBox(-0.2F, 0.3F, -3.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3193F, -3.9253F, -0.2132F, 1.4646F, -0.0033F, 0.3591F));

		PartDefinition cube_r495 = bone4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-0.4413F, -0.8871F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, -0.4666F, 0.2893F));

		PartDefinition cube_r496 = bone4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(14, 48).mirror().addBox(-0.4413F, -0.3968F, 0.126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6354F, -0.4666F, 0.2893F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.5536F, 0.1115F, -0.0687F));

		PartDefinition cube_r497 = tail.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(74, 82).addBox(0.0F, -0.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(71, 82).addBox(0.0F, -0.675F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.0879F, 0.0859F, -0.0152F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 2).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, -0.143F, 0.216F, -0.0308F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(49, 6).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, -0.1162F, 0.2167F, -0.0251F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.1372F, 0.3027F, 0.0411F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1806F, 0.2577F, 0.0465F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.013F, 0.0096F, 1.9268F, 0.1329F, -0.173F, -0.023F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(28, 51).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0259F, 0.025F, 1.9067F, 0.2706F, -0.2527F, -0.0692F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(35, 51).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0226F, 0.0062F, 1.9287F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(42, 51).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1375F, 0.0311F, 1.7639F, 0.1509F, -0.5187F, -0.0752F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(7, 52).addBox(-0.5F, -1.0106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, 0.0F, 1.6908F, 0.0F, -0.6109F, 0.0F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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