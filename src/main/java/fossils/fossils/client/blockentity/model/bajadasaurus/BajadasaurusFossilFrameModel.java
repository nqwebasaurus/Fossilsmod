package fossils.fossils.client.blockentity.model.bajadasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BajadasaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone5;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart throat;

	public BajadasaurusFossilFrameModel(ModelPart root) {
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
		this.bone5 = this.neck4.getChild("bone5");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -29.0F, 6.8F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -7.55F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -20.45F, -11.3F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(5.05F, -10.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -20.45F, -11.3F, 0.1047F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -26.0F, 7.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.5F, 11.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -4.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 0.8187F, 1.1724F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.602F, -6.5203F, -0.2356F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 0.45F, -0.1F, 1.0123F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.1101F, -13.6438F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0318F, -8.3993F, -0.0578F, 0.001F, 0.0365F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 0.45F, -0.1F, 1.405F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.1101F, -13.6438F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0318F, -8.3993F, -0.2498F, -0.001F, -0.0365F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.7F, -0.4903F, -0.077F, 0.0411F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 15).addBox(-0.5F, -0.7838F, 0.0924F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3586F, 7.3533F, 0.0699F, -0.0522F, -0.0037F));

		PartDefinition cube_r6 = tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, 0.9F, 0.4F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.918F, 0.0389F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.918F, 12.9389F, 0.0958F, -0.2647F, 0.1258F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 55).addBox(-0.5F, 0.8F, 0.4F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6819F, -0.0333F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4181F, 10.6667F, 0.1664F, -0.0933F, 0.0286F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, 0.9F, -0.2F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6564F, 0.0794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.0848F, -0.277F, 1.0F, 2.0F, 17.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0564F, 12.7794F, 0.0706F, -0.4444F, -0.0207F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5152F, 16.723F, 0.262F, -0.6454F, 0.0554F));

		PartDefinition cube_r9 = tail5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 38).addBox(-0.6F, 1.0F, -0.9F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3603F, 0.0752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7397F, 13.5752F, 0.1718F, -0.5375F, 0.0426F));

		PartDefinition cube_r10 = tail6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2767F, 0.0761F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(57, 48).addBox(-0.5F, 0.5524F, -0.0306F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6233F, 11.8761F, -0.3702F, -0.294F, 0.0841F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, 0.4751F, -0.2583F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0524F, 9.9694F, -0.6093F, -0.3714F, 0.1307F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -6.4F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 20).addBox(-0.5F, 1.0679F, -0.0311F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5164F, -13.9618F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -13.6F, 0.1834F, 0.0429F, 0.008F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(55, 33).addBox(-0.5F, -21.0F, -16.75F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 20.7F, 9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 14.4424F, -2.8629F, 0.8423F, 0.1016F, -0.0827F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 6.2547F, -1.2204F, -1.3382F, -0.0599F, 0.3883F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 6.8721F, -1.3089F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 14.4424F, -2.8629F, -0.4625F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 6.2547F, -1.2204F, -0.672F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 6.8721F, -1.3089F, 0.9512F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.0001F, -7.8245F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.6F, -8.5F, 0.0651F, 0.0843F, 0.049F));

		PartDefinition neckBoneLeft1 = neck1.addOrReplaceChild("neckBoneLeft1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -8.731F, -11.2089F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neckBoneRight1 = neck1.addOrReplaceChild("neckBoneRight1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -8.731F, -11.2089F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(43, 58).addBox(-0.5F, 0.1516F, -8.7843F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -7.6245F, 0.0697F, 0.0434F, -0.0046F));

		PartDefinition neckBoneLeft2 = neck2.addOrReplaceChild("neckBoneLeft2", CubeListBuilder.create(), PartPose.offset(0.25F, -2.2793F, -5.4687F));

		PartDefinition neckBoneRight2 = neck2.addOrReplaceChild("neckBoneRight2", CubeListBuilder.create(), PartPose.offset(-0.25F, -2.2793F, -5.4687F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(80, 85).addBox(-0.5F, 0.2985F, -5.771F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1484F, -8.7843F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2985F, -5.571F, 0.539F, 0.1502F, 0.0893F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2755F, -6.022F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone5 = neck4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.9054F, -1.0765F, -6.1352F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5755F, -5.522F, 0.7069F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -7.65F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -1.75F, -0.3665F, 0.0F, 0.0F));

		PartDefinition bone6 = jaw.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -4.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 130, 130);
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