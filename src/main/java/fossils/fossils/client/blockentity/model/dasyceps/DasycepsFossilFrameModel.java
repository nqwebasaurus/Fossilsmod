package fossils.fossils.client.blockentity.model.dasyceps;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DasycepsFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart crossbeam2_r1;
	private final ModelPart crossbeam1_r1;
	private final ModelPart Dasyceps;
	private final ModelPart Basin;
	private final ModelPart frame4_r1;
	private final ModelPart FemurR2;
	private final ModelPart Tibia_FibulaR2;
	private final ModelPart PesR2;
	private final ModelPart FemurR3;
	private final ModelPart Tibia_FibulaR3;
	private final ModelPart PesR3;
	private final ModelPart Body2;
	private final ModelPart frame3_r1;
	private final ModelPart Body3;
	private final ModelPart frame2_r1;
	private final ModelPart Neck2;
	private final ModelPart frame1_r1;
	private final ModelPart Cephalon2;
	private final ModelPart Cranium2;
	private final ModelPart Jaw2;
	private final ModelPart ForearmL3;
	private final ModelPart Radio_UlnaL3;
	private final ModelPart ManusL3;
	private final ModelPart ForearmL4;
	private final ModelPart Radio_UlnaL4;
	private final ModelPart ManusL4;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart frame6_r1;
	private final ModelPart Tail3;

	public DasycepsFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.crossbeam2_r1 = this.fossil.getChild("crossbeam2_r1");
		this.crossbeam1_r1 = this.fossil.getChild("crossbeam1_r1");
		this.Dasyceps = this.fossil.getChild("Dasyceps");
		this.Basin = this.Dasyceps.getChild("Basin");
		this.frame4_r1 = this.Basin.getChild("frame4_r1");
		this.FemurR2 = this.Basin.getChild("FemurR2");
		this.Tibia_FibulaR2 = this.FemurR2.getChild("Tibia_FibulaR2");
		this.PesR2 = this.Tibia_FibulaR2.getChild("PesR2");
		this.FemurR3 = this.Basin.getChild("FemurR3");
		this.Tibia_FibulaR3 = this.FemurR3.getChild("Tibia_FibulaR3");
		this.PesR3 = this.Tibia_FibulaR3.getChild("PesR3");
		this.Body2 = this.Basin.getChild("Body2");
		this.frame3_r1 = this.Body2.getChild("frame3_r1");
		this.Body3 = this.Body2.getChild("Body3");
		this.frame2_r1 = this.Body3.getChild("frame2_r1");
		this.Neck2 = this.Body3.getChild("Neck2");
		this.frame1_r1 = this.Neck2.getChild("frame1_r1");
		this.Cephalon2 = this.Neck2.getChild("Cephalon2");
		this.Cranium2 = this.Cephalon2.getChild("Cranium2");
		this.Jaw2 = this.Cephalon2.getChild("Jaw2");
		this.ForearmL3 = this.Body3.getChild("ForearmL3");
		this.Radio_UlnaL3 = this.ForearmL3.getChild("Radio_UlnaL3");
		this.ManusL3 = this.Radio_UlnaL3.getChild("ManusL3");
		this.ForearmL4 = this.Body3.getChild("ForearmL4");
		this.Radio_UlnaL4 = this.ForearmL4.getChild("Radio_UlnaL4");
		this.ManusL4 = this.Radio_UlnaL4.getChild("ManusL4");
		this.Tail1 = this.Basin.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.frame6_r1 = this.Tail2.getChild("frame6_r1");
		this.Tail3 = this.Tail2.getChild("Tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-1.6F, -2.9F, 3.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(1, 1).addBox(-1.9F, -2.9F, -10.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crossbeam2_r1 = fossil.addOrReplaceChild("crossbeam2_r1", CubeListBuilder.create().texOffs(-2, 1).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, -1.0F, -9.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(-2, 1).addBox(-4.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, -2.0F, 4.25F, 0.0F, 0.1484F, 0.0F));

		PartDefinition Dasyceps = fossil.addOrReplaceChild("Dasyceps", CubeListBuilder.create(), PartPose.offset(-1.2F, -10.0F, 3.0F));

		PartDefinition Basin = Dasyceps.addOrReplaceChild("Basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5F, 0.6F, 0.1309F, 0.1745F, 0.0F));

		PartDefinition frame4_r1 = Basin.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(15, 52).addBox(-0.5F, -2.7958F, -0.1912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5974F, -2.7392F, -0.1745F, 0.0F, 0.0F));

		PartDefinition FemurR2 = Basin.addOrReplaceChild("FemurR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 1.7669F, 0.2694F, 0.324F, -0.3548F, -0.7365F));

		PartDefinition Tibia_FibulaR2 = FemurR2.addOrReplaceChild("Tibia_FibulaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0491F, 2.7718F, 1.9914F, -0.5116F, -0.8554F, 0.4579F));

		PartDefinition PesR2 = Tibia_FibulaR2.addOrReplaceChild("PesR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.6638F, -0.2768F, -0.1718F));

		PartDefinition FemurR3 = Basin.addOrReplaceChild("FemurR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.15F, 1.7669F, 0.2694F, -0.7006F, -0.5571F, 1.0716F));

		PartDefinition Tibia_FibulaR3 = FemurR3.addOrReplaceChild("Tibia_FibulaR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0491F, 2.7718F, 1.9914F, -0.3969F, 0.8736F, -0.297F));

		PartDefinition PesR3 = Tibia_FibulaR3.addOrReplaceChild("PesR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.5526F, 0.0635F, -0.1256F));

		PartDefinition Body2 = Basin.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8436F, -2.4906F, 0.0853F, -0.173F, 0.023F));

		PartDefinition frame3_r1 = Body2.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(-2, 41).addBox(-0.5F, -0.5422F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1858F, -4.4643F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8171F, -7.7512F, -0.0455F, -0.1278F, 0.0285F));

		PartDefinition frame2_r1 = Body3.addOrReplaceChild("frame2_r1", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.6195F, 0.2479F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4496F, -5.2906F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Neck2 = Body3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.7064F, -5.1426F, -0.2216F, 0.1705F, -0.0362F));

		PartDefinition frame1_r1 = Neck2.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(25, 34).addBox(-0.6F, -0.2011F, -0.6261F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.7754F, -4.264F));

		PartDefinition Cephalon2 = Neck2.addOrReplaceChild("Cephalon2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1489F, -4.0201F, -0.0884F, 0.2171F, -0.0305F));

		PartDefinition Cranium2 = Cephalon2.addOrReplaceChild("Cranium2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -0.6F, 0.2F, -0.1621F, 0.0F, 0.0F));

		PartDefinition Jaw2 = Cephalon2.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0071F, 1.944F, 1.3495F, 0.1639F, 0.0F, 0.0F));

		PartDefinition ForearmL3 = Body3.addOrReplaceChild("ForearmL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 1.8328F, -2.7816F, -0.534F, 0.5242F, -0.9358F));

		PartDefinition Radio_UlnaL3 = ForearmL3.addOrReplaceChild("Radio_UlnaL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.1F, 0.7F, -0.7413F, -0.6027F, 0.5747F));

		PartDefinition ManusL3 = Radio_UlnaL3.addOrReplaceChild("ManusL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9679F, 4.544F, -2.0594F, 0.6442F, -0.0278F, 0.193F));

		PartDefinition ForearmL4 = Body3.addOrReplaceChild("ForearmL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 1.8328F, -2.7816F, 0.7196F, 0.8164F, 0.7772F));

		PartDefinition Radio_UlnaL4 = ForearmL4.addOrReplaceChild("Radio_UlnaL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.1F, 0.7F, -0.8172F, 0.0057F, -0.4891F));

		PartDefinition ManusL4 = Radio_UlnaL4.addOrReplaceChild("ManusL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9679F, 4.544F, -2.0594F, 0.6631F, 0.2381F, -0.0353F));

		PartDefinition Tail1 = Basin.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(45, 32).addBox(-0.5F, 0.6569F, -0.0931F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2016F, 3.4506F, -0.2664F, 0.2595F, -0.035F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0522F, 6.9034F, 0.0083F, -0.346F, -0.0475F));

		PartDefinition frame6_r1 = Tail2.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(33, 34).addBox(-0.5F, -0.4015F, 0.0698F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.0392F, -0.7974F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0306F, 7.5331F, 0.1473F, -0.4755F, -0.0678F));

		return LayerDefinition.create(meshdefinition, 70, 65);
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