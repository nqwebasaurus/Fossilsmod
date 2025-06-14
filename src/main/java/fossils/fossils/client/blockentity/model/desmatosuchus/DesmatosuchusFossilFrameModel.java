package fossils.fossils.client.blockentity.model.desmatosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DesmatosuchusFossilFrameModel extends SkullModelBase {
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

	public DesmatosuchusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -19.0F, 5.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, -1.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.4F, -16.0F, -18.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(5.3F, -4.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.4F, -16.0F, -18.5F, 0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -5.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -16.0F, 6.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Desmatosuchus = fossil.addOrReplaceChild("Desmatosuchus", CubeListBuilder.create(), PartPose.offset(0.0F, -11.975F, -1.0F));

		PartDefinition body3 = Desmatosuchus.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.0546F, 1.6687F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, 0.9014F, 0.3675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6523F, 4.3285F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftBackLeg = body3.addOrReplaceChild("leftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8606F, -0.2747F, 5.2471F, -0.4903F, -0.1134F, 0.0253F));

		PartDefinition leftBjoint = leftBackLeg.addOrReplaceChild("leftBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8984F, 10.9704F, 4.8539F, 0.436F, 0.0184F, -0.0395F));

		PartDefinition leftBfoot = leftBjoint.addOrReplaceChild("leftBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 6.6254F, 2.4237F, 0.0425F, 0.1022F, -0.0227F));

		PartDefinition leftBfoot2 = leftBfoot.addOrReplaceChild("leftBfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8948F, -3.0494F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightBackLeg = body3.addOrReplaceChild("rightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8606F, -0.2747F, 5.2471F, 0.0333F, 0.1134F, -0.0253F));

		PartDefinition rightBjoint = rightBackLeg.addOrReplaceChild("rightBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8984F, 10.9704F, 4.8539F, 0.436F, -0.0184F, 0.0395F));

		PartDefinition rightBfoot = rightBjoint.addOrReplaceChild("rightBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 6.6254F, 2.4237F, -0.1757F, -0.1022F, 0.0227F));

		PartDefinition rightBfoot2 = rightBfoot.addOrReplaceChild("rightBfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8948F, -3.0494F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail7 = body3.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2523F, 7.3285F, -0.0873F, -0.0455F, 0.0417F));

		PartDefinition cube_r5 = tail7.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, 0.9014F, 3.1675F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail = tail7.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8014F, 6.8175F, 0.0748F, -0.0768F, 0.1038F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 10).addBox(-0.4F, 0.5F, 9.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.4F, 0.5F, -0.8F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.65F, 0.25F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6853F, 10.8948F, 0.1578F, -0.0404F, -0.0014F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 73).addBox(-0.5F, -0.1F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 66).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.05F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 8.05F, 0.0316F, 0.0875F, -0.0404F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.3F, 0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.05F, -0.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0026F, 6.9501F, -0.062F, -0.2589F, 0.0589F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 55).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, 0.25F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4585F, 8.9047F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.05F, 5.8F, -0.1509F, 0.5187F, -0.0752F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, 2.9711F, 4.3329F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition bone4 = body3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, 2.9711F, 4.3329F, -0.1806F, 0.2577F, -0.0465F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9845F, 4.8263F, 0.4665F, 0.039F, 0.0196F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 79).addBox(-0.5F, -1.9495F, -0.6268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 74).addBox(-0.5F, -1.9495F, -6.3268F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3727F, -2.8029F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 97).addBox(-0.5F, 0.0044F, 11.9999F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5709F, -14.8619F, 0.096F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2857F, -8.4037F, -0.1329F, 0.173F, -0.023F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 74).addBox(-0.5F, -1.9495F, -11.9268F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1F, 5.7F, -0.0611F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8878F, -5.8288F, -0.2493F, 0.0846F, -0.0215F));

		PartDefinition cube_r13 = bodyfront.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -2.4482F, -17.4453F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1374F, 11.8467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition body4 = bodyfront.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9494F, -5.6261F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5F, -0.3087F, -1.8996F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5194F, -4.9019F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone5 = body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3046F, 4.8709F, -5.7633F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftFrontLeg = bone5.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2558F, 1.9738F, 0.7697F, -0.313F, 0.314F, -0.139F));

		PartDefinition LeftFjoint = leftFrontLeg.addOrReplaceChild("LeftFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5763F, 2.3337F, 6.024F, 0.3875F, 0.1967F, 0.2105F));

		PartDefinition LeftFFoot = LeftFjoint.addOrReplaceChild("LeftFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1061F, 5.3474F, -0.8675F, 0.3904F, -0.8975F, 0.0298F));

		PartDefinition bone3 = body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3046F, 4.8709F, -5.7633F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightFrontLeg = bone3.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2558F, 1.9738F, 0.7697F, -1.3297F, -0.3003F, 0.1825F));

		PartDefinition RightFjoint = rightFrontLeg.addOrReplaceChild("RightFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5763F, 2.3337F, 6.024F, -0.1279F, -0.1023F, 0.758F));

		PartDefinition RightFFoot = RightFjoint.addOrReplaceChild("RightFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1061F, 5.3474F, -0.8675F, 2.7466F, 0.8975F, -0.0298F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(92, 63).addBox(-0.5F, 0.1173F, -4.1011F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2556F, -7.0012F, 0.1944F, 0.1736F, 0.0186F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(56, 96).addBox(-0.5F, 0.3095F, -3.8866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2445F, -3.8519F, -0.0026F, 0.1384F, -0.1103F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(119, 99).addBox(-0.5F, 0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3905F, -3.8866F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2423F, -3.2833F, 0.4193F, 0.1256F, 0.0371F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.536F, -3.1767F, 0.48F, 0.0F, 0.0F));

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