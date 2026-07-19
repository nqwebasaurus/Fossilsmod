package fossils.fossils.client.blockentity.model.anachlysictis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnachlysictisFossilFrameModel extends SkullModelBase {
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

	public AnachlysictisFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.325F, -16.7F, 14.9F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.65F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2F, -12.65F, -12.1F, -0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.425F, -3.35F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.2F, -12.65F, -12.1F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-2.3F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.5F, 15.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.023F, 12.9507F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6014F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, 0.5604F, -0.6793F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8812F, 0.5604F, -0.6793F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 2.7705F, 1.6667F, -0.9861F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 1.0647F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.5446F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.2318F, 0.7512F, 0.9861F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 2.7705F, 1.6667F, -0.1134F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5858F, 0.4053F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.6755F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.2318F, 0.7512F, 0.288F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.097F, -3.4512F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2776F, -3.8434F, -0.2269F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7933F, -3.7586F, -0.1136F, -0.0434F, 0.0049F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.3F, -4.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 23).addBox(-0.5F, 0.3241F, -0.4807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 20).addBox(-0.5F, 0.3241F, -4.1807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.6667F, -3.8642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 41).addBox(-0.5F, 0.3244F, -1.6868F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 43).addBox(-0.5F, -0.2463F, -0.3949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 42).addBox(-0.5F, -0.2463F, -2.0949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, 0.1036F, -0.1741F, 0.0123F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 11).addBox(-0.5F, 0.45F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 9).addBox(-0.5F, 0.45F, 2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, 0.7068F, -0.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0995F, -7.1074F, -0.294F, -0.0962F, -0.0163F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 43).addBox(-0.5F, 0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -0.956F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4753F, -1.5261F, -0.0433F, -0.0493F, -0.1289F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7606F, 5.6603F, -3.7469F, 0.2832F, -0.2318F, -0.1668F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7606F, 5.6603F, -3.7469F, 0.2832F, 0.2318F, 0.1668F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9168F, -0.7672F, 2.789F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9168F, -0.7672F, 2.789F, 0.0F, -0.0873F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.1918F, -0.2623F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(29, 38).addBox(-0.5F, -0.375F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 37).addBox(-0.5F, -0.375F, 1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.9993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.05F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, -0.375F, 0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9035F, 4.1022F, -2.0546F, 1.2203F, -0.009F, -0.0068F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.3915F, -0.2382F, -1.2566F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 6.3215F, 1.1274F, 0.8552F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 1.3606F, 0.0801F, 1.405F, 0.0037F, -0.0024F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9035F, 4.1022F, -2.0546F, 0.7403F, 0.009F, 0.0068F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.3915F, -0.2382F, -1.0385F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 6.3215F, 1.1274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 1.3606F, 0.0801F, -0.0786F, -0.0037F, 0.0024F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, 0.0873F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9831F, 3.7543F, -2.2716F, -0.1309F, 0.0F, -0.0873F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, 0.2647F, -0.164F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.637F, 0.1311F, -0.0429F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 28).addBox(-0.5F, 0.065F, -0.0289F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(45, 32).addBox(-0.5F, 0.1855F, -0.1175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, -0.0884F, 0.0949F, 0.0789F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, 0.2894F, -0.249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 47).addBox(-0.5F, 0.2894F, 1.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(40, 46).addBox(-0.5F, -0.2856F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.3106F, -0.349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 48).addBox(-0.5F, -0.3106F, 1.351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, -0.3106F, -0.024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 48).addBox(-0.5F, -0.3106F, 1.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -0.3106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(33, 47).addBox(-0.5F, -0.3356F, -0.349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

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