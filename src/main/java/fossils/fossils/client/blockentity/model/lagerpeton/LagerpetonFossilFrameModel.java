package fossils.fossils.client.blockentity.model.lagerpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LagerpetonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Lagerpeton;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public LagerpetonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Lagerpeton = this.fossil.getChild("Lagerpeton");
		this.bone = this.Lagerpeton.getChild("bone");
		this.bone3 = this.Lagerpeton.getChild("bone3");
		this.Body = this.Lagerpeton.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Lagerpeton.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.RLeg = this.Lagerpeton.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Lagerpeton.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -26.0F, -1.0F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(2.25F, -2.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.6F, -15.75F, -16.8F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -7.25F, -0.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.6F, -15.75F, -16.8F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(6.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -18.5F, -0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Lagerpeton = fossil.addOrReplaceChild("Lagerpeton", CubeListBuilder.create().texOffs(17, 45).addBox(-0.5F, 0.0109F, -1.9147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -26.5923F, -1.7865F, 0.0305F, 0.0F, 0.0F));

		PartDefinition bone = Lagerpeton.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -0.6884F, 1.4539F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone3 = Lagerpeton.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -0.6884F, 1.4539F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Body = Lagerpeton.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 48).addBox(-0.5F, -0.1495F, 4.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 44).addBox(-0.5F, -0.1495F, -0.4087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2025F, -5.3134F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.8F, 0.1489F, -0.0863F, -0.0129F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, -0.3F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0675F, -4.7554F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6234F, -5.5505F, -0.1834F, -0.0429F, 0.008F));

		PartDefinition cube_r7 = Neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5F, -0.1727F, 2.6598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 57).addBox(-0.5F, -0.1727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.157F, 0.2223F, 0.0091F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 51).addBox(-0.5F, 0.7F, 2.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 54).addBox(-0.5F, 0.7F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6801F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8471F, -3.7801F, -0.2689F, 0.3654F, 0.0534F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(35, 55).addBox(-0.5F, 0.7F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 52).addBox(-0.5F, 0.7F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.9F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, 0.1773F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7534F, -3.8729F, -0.5991F, 0.3917F, -0.0289F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0588F, -2.9246F, 0.5958F, 0.2926F, 0.1931F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5927F, -0.3278F, -5.1282F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5927F, -0.3278F, -5.1282F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.3588F, 0.2901F, 0.3491F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9683F, 5.4654F, -4.9356F, -1.8024F, 0.2368F, -0.0429F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, -0.2237F, 6.88F, 0.5585F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8897F, 8.079F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9683F, 5.4654F, -4.9356F, -0.8861F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, -0.2237F, 6.88F, 0.0349F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8897F, 8.079F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Tail = Lagerpeton.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, 0.1987F, -0.2611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 33).addBox(-0.5F, 0.1987F, 8.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, 0.0903F, -0.1231F, -0.098F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 13).addBox(-0.5F, 0.1416F, 0.0624F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.0595F, -0.1698F, -0.0961F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.3853F, -0.3526F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 10).addBox(-0.5F, 0.3853F, 10.3474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, 0.0448F, 0.3567F, -0.1074F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3853F, -0.2526F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(-0.5F, 0.3853F, 10.4474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, 0.1007F, 0.5214F, 0.0503F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.3852F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.128F, 0.3031F, -0.0384F));

		PartDefinition RLeg = Lagerpeton.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 1.026F, 0.8445F, -0.9773F, -0.2556F, -0.1412F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.8272F, 3.0921F, 2.0508F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.1975F, 1.4474F, -0.9687F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5093F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 8.5447F, -0.1234F, 0.6547F, 0.0421F, 0.0113F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3979F, -2.2418F, -0.4363F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Lagerpeton.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 1.026F, 0.8445F, -1.4219F, 0.3994F, 0.0453F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.8272F, 3.0921F, 1.9635F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.1975F, 1.4474F, -0.7505F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5093F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 8.5447F, -0.1234F, 0.262F, -0.0421F, -0.0113F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3979F, -2.2418F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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