package fossils.fossils.client.blockentity.model.hupehsuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HupehsuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eretmorhipis;
	private final ModelPart neck2;
	private final ModelPart Neck;
	private final ModelPart neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Chest;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart body4;
	private final ModelPart Tail2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public HupehsuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eretmorhipis = this.fossil.getChild("Eretmorhipis");
		this.neck2 = this.Eretmorhipis.getChild("neck2");
		this.Neck = this.neck2.getChild("Neck");
		this.neck3 = this.Neck.getChild("neck3");
		this.Head = this.neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Chest = this.Eretmorhipis.getChild("Chest");
		this.LArm = this.Chest.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Chest.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.bone2 = this.Chest.getChild("bone2");
		this.bone4 = this.Chest.getChild("bone4");
		this.Body = this.Chest.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.body4 = this.Tail.getChild("body4");
		this.Tail2 = this.body4.getChild("Tail2");
		this.LLeg = this.Tail2.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Tail2.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.bone = this.Tail2.getChild("bone");
		this.bone3 = this.Tail2.getChild("bone3");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.Tail4 = this.tail7.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eretmorhipis = fossil.addOrReplaceChild("Eretmorhipis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.4253F, -14.5606F, 0.1349F, -0.036F, 0.2594F));

		PartDefinition cube_r1 = Eretmorhipis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 25).addBox(-0.6F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.1332F, -0.943F, -1.5708F, -0.0175F, 1.5708F));

		PartDefinition cube_r2 = Eretmorhipis.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.5336F, -0.9884F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Eretmorhipis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 27).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5336F, -2.2884F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = Eretmorhipis.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.1F, -0.0172F, 0.1298F, -0.132F));

		PartDefinition cube_r4 = neck2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 18).addBox(-0.5F, 0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 17).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck = neck2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -2.05F, 0.0133F, 0.3095F, -0.1208F));

		PartDefinition cube_r5 = Neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 70).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.2512F, -0.2094F, 0.0F, 0.0F));

		PartDefinition neck3 = Neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7455F, -1.7512F, 0.0903F, 0.2646F, -0.0201F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 70).addBox(-0.5F, 0.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head = neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5392F, -1.781F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2079F, 0.074F, 0.8465F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2778F, 0.195F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2778F, 0.195F));

		PartDefinition Chest = Eretmorhipis.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7539F, -0.1864F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 3).addBox(-0.5F, 0.7F, -4.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 0).addBox(-0.5F, 0.7F, -8.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2443F, 7.9957F, 0.0349F, 0.0F, 0.0F));

		PartDefinition LArm = Chest.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9838F, 4.2944F, -1.0546F, 0.696F, -0.3069F, 0.322F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7853F, -0.5F, 0.3441F, 0.0385F, -0.2148F, -0.1787F));

		PartDefinition LArm3 = Chest.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9838F, 4.2944F, -1.0546F, 0.4208F, 0.641F, -0.9034F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7853F, -0.5F, 0.3441F, 0.0F, -0.48F, 0.0F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.0841F, -0.9291F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.0841F, -0.9291F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8347F, 3.9276F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 0.7F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(64, 12).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 14).addBox(-0.5F, 0.1F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5038F, 4.0245F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(54, 48).addBox(-0.5F, 0.4997F, 3.2314F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2989F, -0.5981F, 0.0052F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(41, 48).addBox(-0.5F, 0.4666F, 0.0689F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 6.9314F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition body4 = Tail.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, 0.101F, -0.6112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 57).addBox(-1.0F, 0.101F, 3.0888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3656F, 5.3801F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Tail2 = body4.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(13, 48).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3729F, 3.6876F, 0.1227F, -0.1468F, 0.1127F));

		PartDefinition cube_r9 = Tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 49).addBox(1.7F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.7F, 1.4F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition LLeg = Tail2.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8831F, 1.454F, 1.2375F, -0.0187F, -0.6595F, 0.9422F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6377F, -0.5738F, 0.2126F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LLeg3 = Tail2.addOrReplaceChild("LLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8831F, 1.454F, 1.2375F, 0.2437F, 1.1256F, -0.6551F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6377F, -0.5738F, 0.2126F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone = Tail2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.6F, 0.7087F, 0.8042F));

		PartDefinition bone3 = Tail2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.6F, 0.7087F, 0.8042F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(55, 6).addBox(-0.5F, 0.1513F, -0.3469F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 9).addBox(-0.5F, 0.1513F, 3.3531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3488F, 4.8469F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 33).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.429F, 3.9999F, -0.0183F, -0.3054F, 0.0055F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5304F, 5.8277F, -0.1387F, 0.1618F, -0.1092F));

		PartDefinition Tail4 = tail7.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 7).addBox(-0.5F, 0.2F, 8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 6.7999F, -0.0356F, 0.215F, -0.0949F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0412F, 9.0249F, 0.054F, 0.3576F, -0.1042F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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