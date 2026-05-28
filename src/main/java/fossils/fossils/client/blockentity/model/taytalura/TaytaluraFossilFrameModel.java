package fossils.fossils.client.blockentity.model.taytalura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TaytaluraFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail9;

	public TaytaluraFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail9 = this.tail6.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -4.9F, 8.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-1.375F, -14.0F, -13.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.3F, -3.9F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, -9.5F, -13.2F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-6.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.5F, 8.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.4142F, 9.6479F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, 0.7F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 30).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7096F, 1.9341F, -0.8617F, 0.1551F, -0.0803F, 0.5174F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7096F, 1.9341F, -0.8617F, 0.1551F, 0.0803F, -0.5174F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1681F, 2.7021F, -0.4567F, -1.0719F, -0.3543F, -1.737F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2737F, 8.1936F, 1.4303F, 2.249F, -1.4251F, 0.303F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0021F, 8.2623F, 0.9321F, -0.3436F, -0.0346F, 0.0349F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1681F, 2.7021F, -0.4567F, -0.9024F, -0.5501F, 2.3849F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2737F, 8.1936F, 1.4303F, -2.9616F, 0.6288F, 1.8471F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0021F, 8.2623F, 0.9321F, 0.8423F, -0.2844F, -0.2056F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.1999F, -5.5122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 49).addBox(-0.5F, 0.1999F, -0.8122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, 0.3F, -5.225F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(51, 17).addBox(-0.5F, 0.275F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 0.3F, -5.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 54).addBox(-0.5F, 0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0708F, -0.2057F, -4.9622F, -0.0915F, 0.0257F, -0.0105F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 37).addBox(-0.5648F, 0.8395F, 3.1618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4454F, 4.5851F, -1.1724F, 1.119F, 0.07F, -0.7503F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.902F, 6.6501F, 0.0425F, -0.7168F, 0.6649F, 0.3167F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1189F, 5.8858F, 0.4764F, 0.176F, -0.4098F, 0.0362F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5869F, 4.5851F, -1.1724F, 0.3706F, -0.19F, 0.8178F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.902F, 6.6501F, 0.0425F, -0.6548F, -0.3967F, -0.4832F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1189F, 5.8858F, 0.4764F, 0.6999F, 0.403F, -0.0489F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7894F, 6.9489F, -4.4662F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.9309F, 6.9489F, -4.4662F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.3519F, -3.8154F, 0.1671F, 0.0665F, 0.1408F));

		PartDefinition cube_r5 = neck3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 23).addBox(0.0102F, -1.1046F, 2.151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0038F, 0.1301F, -3.088F, 0.3099F, 0.1669F, 0.0523F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.2692F, -9.2683F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2497F, 2.2692F, -9.2683F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9543F, 1.7664F, -0.1997F, 0.9335F, 0.0035F, -0.0051F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 30).addBox(-0.5F, 0.2719F, 0.0537F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, 0.0748F, -0.1305F, -0.0098F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 49).addBox(-0.55F, 0.7F, -0.425F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 53).addBox(-0.55F, 0.7F, 4.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4531F, 5.0037F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 14).addBox(-0.525F, 0.7143F, 0.0112F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 19).addBox(-0.525F, 0.7143F, 5.7112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9209F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4143F, 6.0362F, 0.0532F, -0.1743F, -0.0092F));

		PartDefinition cube_r6 = tail8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.7974F, 0.3547F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0032F, -0.1936F, 4.7604F, -0.0013F, -0.0356F, -0.1839F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 23).addBox(-0.4968F, -0.1F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6015F, 4.9651F, 0.0F, 0.0F, 0.1309F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 24).addBox(-0.4968F, 0.0015F, -0.3849F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 30).addBox(-0.4968F, 0.0015F, 6.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 7.0F, -0.0165F, 0.1301F, 0.0149F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.4968F, 0.0015F, -0.1349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 38).addBox(-0.4968F, 0.0015F, 6.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0393F, 0.3479F, 0.0277F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(17, 33).addBox(-0.4968F, 0.0015F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 39).addBox(-0.4968F, 0.0015F, 6.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0421F, 0.3052F, 0.0118F));

		PartDefinition tail9 = tail6.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(19, 15).addBox(-0.4968F, 0.0015F, -0.2349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0046F, 0.5248F, -0.0239F));

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