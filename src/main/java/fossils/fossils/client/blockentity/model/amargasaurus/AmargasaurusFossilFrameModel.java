package fossils.fossils.client.blockentity.model.amargasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AmargasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neckBoneLeft1;
	private final ModelPart neckBoneRight1;
	private final ModelPart neck2;
	private final ModelPart neckBoneLeft2;
	private final ModelPart neckBoneRight2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart throat;

	public AmargasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neckBoneLeft1 = this.neck1.getChild("neckBoneLeft1");
		this.neckBoneRight1 = this.neck1.getChild("neckBoneRight1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neckBoneLeft2 = this.neck2.getChild("neckBoneLeft2");
		this.neckBoneRight2 = this.neck2.getChild("neckBoneRight2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.bone6 = this.jaw.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -30.0F, 11.1F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -5.0F, -0.5F, 1.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -28.0F, -14.7F, 0.0F, 0.096F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-8.5F, -10.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -28.0F, -14.7F, -0.096F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-7.5F, -7.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -36.0F, 11.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.5F, 11.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 61).addBox(-0.5F, 0.8187F, 0.9724F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.602F, -6.5203F, -0.2356F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 0.45F, 0.4F, 1.4399F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.3997F, -15.7619F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.703F, -9.3647F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 0.45F, 0.4F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.3997F, -15.7619F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, 1.703F, -9.3647F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.7F, -0.4396F, 0.1186F, -0.0556F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 89).addBox(-0.5F, 1.0F, 6.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(84, 37).addBox(-0.5F, 1.0F, -0.1F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.918F, 0.0389F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.918F, 12.9389F, 0.0884F, 0.1739F, 0.0077F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5F, 0.8F, -0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6819F, -0.0333F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4181F, 10.8667F, 0.1736F, 0.0841F, 0.0339F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 63).addBox(-0.5F, 0.8F, -0.7F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.6564F, 0.0794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, 0.0848F, -0.277F, 1.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0564F, 12.7794F, 0.4216F, 0.3677F, 0.135F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5152F, 16.723F, 0.1415F, -0.0114F, 0.0465F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, 0.7F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3603F, 0.0752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7397F, 13.5752F, 0.0099F, -0.1383F, 0.0638F));

		PartDefinition cube_r9 = tail6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2767F, 0.0761F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.2524F, -0.3306F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0233F, 16.7761F, -0.4796F, -0.2865F, 0.0843F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1751F, -0.5583F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0524F, 18.9694F, -0.3155F, -0.2494F, 0.0804F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -6.4F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 1.0679F, -0.0311F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5164F, -13.9618F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -13.6F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -21.0F, -19.75F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 20.7F, 9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 16.5424F, -6.4629F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 7.2547F, -1.9204F, -0.4737F, -0.0287F, 0.0041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 7.9632F, -1.8005F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 16.5424F, -6.4629F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 7.2547F, -1.9204F, -0.8639F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 7.9632F, -1.8005F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(69, 20).addBox(-0.5F, 0.9F, -15.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7F, -11.0F, -0.4809F, 0.2161F, -0.0531F));

		PartDefinition cube_r12 = neck1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(98, 26).addBox(0.0F, 0.9F, -0.8F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neckBoneLeft1 = neck1.addOrReplaceChild("neckBoneLeft1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -7.8309F, -10.3844F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neckBoneRight1 = neck1.addOrReplaceChild("neckBoneRight1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -7.8309F, -10.3844F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(69, 5).addBox(-0.5F, -0.0484F, -11.3843F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -14.8F, -0.3005F, 0.1926F, 0.0314F));

		PartDefinition neckBoneLeft2 = neck2.addOrReplaceChild("neckBoneLeft2", CubeListBuilder.create(), PartPose.offset(0.25F, -2.2793F, -5.4687F));

		PartDefinition neckBoneRight2 = neck2.addOrReplaceChild("neckBoneRight2", CubeListBuilder.create(), PartPose.offset(-0.25F, -2.2793F, -5.4687F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(68, 44).addBox(-0.5F, 0.0985F, -10.771F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1484F, -11.7843F, 0.3214F, 0.0913F, 0.1609F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1985F, -10.571F, 0.4426F, 0.1546F, 0.0812F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 75).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2755F, -6.022F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1755F, -5.322F, 0.1905F, 0.0797F, 0.2092F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -7.65F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -1.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone6 = jaw.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -4.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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