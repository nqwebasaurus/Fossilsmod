package fossils.fossils.client.blockentity.model.borhyaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BorhyaenaFossilFrameModel extends SkullModelBase {
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

	public BorhyaenaFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.0F, 13.6F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(0.5F, -16.7F, -11.9F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.3F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -14.5F, -11.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.1F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.5F, 14.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.223F, 12.9507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6514F, 0.1389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6471F, 2.1417F, 1.545F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6471F, 2.1417F, 1.545F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.7593F, 0.8256F, -0.5498F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4055F, 0.7187F, 1.6144F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5345F, -0.8064F, -2.1118F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.2318F, 0.7512F, 0.637F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.7593F, 0.8256F, -1.2043F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4055F, 0.7187F, 1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5345F, -0.8064F, -1.5446F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.2318F, 0.7512F, 1.0734F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.097F, -3.4512F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, 0.6238F, 9.8724F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.7675F, -13.3658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7933F, -3.7586F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 13).addBox(-0.5F, -0.175F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 8).addBox(-0.5F, -0.175F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9949F, -5.8528F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.4241F, -4.2057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 20).addBox(-0.5F, 0.7667F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5911F, -3.5847F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 31).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 1.4859F, -0.8326F, 0.5326F, -0.0301F, -0.0177F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5594F, -1.7777F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 45).addBox(-0.45F, -0.1713F, -0.3949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 44).addBox(-0.45F, -0.1713F, -2.0949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.888F, -1.5723F, -0.0522F, -0.2591F, -0.0363F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 33).addBox(-0.425F, 0.5F, 5.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 31).addBox(-0.425F, 0.5F, 2.575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2695F, -2.6775F, -0.1086F, -0.1349F, -0.0288F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 9).addBox(-0.5F, -0.5F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 8).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.075F, 0.1911F, -2.6687F, -0.1921F, -0.0343F, 0.0067F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.05F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r12 = neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 2).addBox(-0.5F, -0.375F, 0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -3.8993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5F, 0.7068F, -0.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0886F, -2.9803F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 48).addBox(-0.5F, 0.7F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -0.956F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.137F, -2.3706F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1497F, 6.2996F, -4.7602F, -0.1095F, -0.2318F, -0.1668F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1497F, 6.2996F, -4.7602F, -0.1095F, 0.2318F, 0.1668F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7512F, 6.1177F, -5.1959F, 0.0006F, 0.0699F, -0.0522F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7512F, 6.1177F, -5.1959F, 0.0006F, -0.0699F, 0.0522F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.5296F, -0.2353F, 1.0123F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8907F, 2.9783F, -1.4837F, 0.2167F, -0.009F, -0.0068F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.2003F, 0.2242F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 6.3215F, 1.1274F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 1.3606F, 0.0801F, 0.5759F, 0.0037F, -0.0024F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8907F, 2.9783F, -1.4837F, 0.6967F, 0.009F, 0.0068F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.2003F, 0.2242F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 6.3215F, 1.1274F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 1.3606F, 0.0801F, -0.5149F, -0.0037F, 0.0024F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9831F, 3.7543F, -2.2716F, -0.2613F, 0.0114F, 0.0865F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9831F, 3.7543F, -2.2716F, -0.2613F, -0.0114F, -0.0865F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.2897F, -0.089F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.5536F, 0.1115F, -0.0687F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 16).addBox(-0.525F, 0.065F, 0.0211F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.0879F, 0.0859F, -0.0152F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 2).addBox(-0.55F, 0.1855F, -0.1175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, -0.143F, 0.216F, -0.0308F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(49, 6).addBox(-0.5F, 0.2894F, -0.274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 7).addBox(-0.5F, 0.2894F, 1.426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, -0.1162F, 0.2167F, -0.0251F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 50).addBox(-0.55F, -0.2856F, -0.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.0F, 0.1372F, 0.3027F, 0.0411F));

		PartDefinition cube_r14 = tail5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 51).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 0.5644F, 1.801F, 0.1309F, 0.2182F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, -0.3106F, 0.151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1806F, 0.2577F, 0.0465F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, -0.3106F, -0.199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.013F, 0.0096F, 1.9268F, 0.1329F, -0.173F, -0.023F));

		PartDefinition cube_r15 = tail7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 51).addBox(-0.8F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1894F, 1.676F, 0.0698F, -0.0873F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(28, 51).addBox(-0.5F, -0.3106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0259F, 0.025F, 1.9067F, 0.2706F, -0.2527F, -0.0692F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(35, 51).addBox(-0.55F, -0.3106F, -0.299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 52).addBox(-0.55F, -0.3106F, 1.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0226F, 0.0062F, 1.9287F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(42, 51).addBox(-0.5F, -0.3106F, 0.151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1375F, 0.0311F, 1.7639F, 0.1509F, -0.5187F, -0.0752F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(7, 52).addBox(-0.5F, -0.3106F, -0.024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.125F, 0.0F, 1.6908F, 0.0F, -0.6109F, 0.0F));

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