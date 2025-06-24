package fossils.fossils.client.blockentity.model.varanuspriscus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VaranuspriscusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart FrontFlipperR5;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
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
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public VaranuspriscusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.leftArm = this.FrontFlipperR2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.FrontFlipperR4 = this.chest.getChild("FrontFlipperR4");
		this.rightArm = this.FrontFlipperR4.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.body = this.chest.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hips = this.body3.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.FrontFlipperR3 = this.bone.getChild("FrontFlipperR3");
		this.leftArm3 = this.FrontFlipperR3.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.FrontFlipperR5 = this.bone.getChild("FrontFlipperR5");
		this.rightArm3 = this.FrontFlipperR5.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
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
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -11.5F, -17.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-4.3F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -11.5F, -17.0F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.2F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -11.5F, 6.7F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, 1.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -11.5F, 6.7F, 0.0F, 0.4363F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.2566F, -16.9804F, -0.1251F, -0.4333F, 0.0527F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8017F, 4.6361F, 0.9384F, 0.7801F, -0.4129F, 0.7059F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5184F, -0.4618F, 2.8194F, 0.8145F, 0.361F, 0.331F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2038F, 0.1426F, -2.6142F, 0.0154F, 0.3621F, -0.1285F));

		PartDefinition FrontFlipperR4 = chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8017F, 4.6361F, 0.9384F, 0.7155F, -0.2637F, -0.8128F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5184F, -0.4618F, 2.8194F, 0.6408F, -0.5924F, 0.098F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2038F, 0.1426F, -2.6142F, 0.4263F, -0.335F, -1.0681F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 52).addBox(-0.5F, 0.2F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 6).addBox(-0.5F, 0.2F, 0.325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2784F, 7.7024F, -0.1355F, 0.2595F, -0.035F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.3F, -0.325F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 16).addBox(-1.0F, 0.3F, 6.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, -0.1418F, 0.1728F, -0.0245F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.3166F, 0.0594F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0522F, 6.8665F, -0.2011F, 0.2996F, -0.0601F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0025F, 1.9668F, 4.9705F));

		PartDefinition FrontFlipperR3 = bone.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0127F, 0.0242F, -0.2046F, -0.1999F, -0.4527F, 0.5618F));

		PartDefinition leftArm3 = FrontFlipperR3.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5127F, 0.0374F, -0.6176F, -2.6346F, -0.7801F, 2.1973F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3648F, -0.1298F, -4.2817F, 0.1803F, 0.2581F, 0.5411F));

		PartDefinition FrontFlipperR5 = bone.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0177F, 0.0242F, -0.2046F, 0.0403F, -0.4833F, -0.6992F));

		PartDefinition rightArm3 = FrontFlipperR5.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5127F, 0.0374F, -0.6176F, -2.0874F, -0.0401F, -1.3906F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3648F, -0.1298F, -4.2817F, -0.1049F, -0.3352F, 0.4644F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 10).addBox(-1.0F, 0.3F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 15).addBox(-1.0F, 0.3F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0235F, 7.9596F, -0.1155F, 0.4338F, -0.0487F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, 0.3F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 4).addBox(-1.0F, 0.3F, 4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0661F, 0.3919F, 0.0253F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 26).addBox(-1.0F, 0.3F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 18).addBox(-1.0F, 0.3F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0632F, -0.2613F, -0.0164F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, 0.3F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 47).addBox(-1.0F, 0.3F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.1207F, -0.3467F, -0.0412F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 0.3F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, 0.1439F, -0.3921F, -0.0217F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 4.9034F, 0.0969F, -0.6102F, -0.0305F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 26).addBox(-1.0F, 0.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 31).addBox(-1.0F, 0.2F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0131F, 5.9008F, 0.2381F, -0.5187F, -0.0752F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1412F, -0.0553F, 5.4924F, -0.1922F, 0.4293F, -0.0808F));

		PartDefinition cube_r7 = tail9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.2F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1138F, -0.2917F, 3.4392F, -0.2875F, 0.4205F, -0.1201F));

		PartDefinition cube_r8 = tail10.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 40).addBox(-1.0F, 0.2F, 3.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2615F, -3.915F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -1.9F, -0.0353F, -0.346F, -0.0475F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 57).addBox(0.0F, 0.1F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 55).addBox(0.0F, 0.1F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, -0.0436F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 26).addBox(0.0F, 0.1F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4297F, -3.9997F, -0.0406F, -0.2608F, -0.0233F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.1701F, 1.2894F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.1701F, 1.2894F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4036F, 0.1427F, 0.5411F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 94, 94);
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