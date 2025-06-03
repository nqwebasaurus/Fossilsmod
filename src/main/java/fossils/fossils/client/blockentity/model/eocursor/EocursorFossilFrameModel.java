package fossils.fossils.client.blockentity.model.eocursor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EocursorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eocursor;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart PesL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart PesL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;

	public EocursorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eocursor = this.fossil.getChild("Eocursor");
		this.LegL = this.Eocursor.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.PesL = this.MetatarsalL.getChild("PesL");
		this.LegL2 = this.Eocursor.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.PesL2 = this.MetatarsalL2.getChild("PesL2");
		this.Tail1 = this.Eocursor.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Body = this.Eocursor.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -17.0F, -1.1F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -16.0F, -11.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-4.4F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(-1.0F, -3.0F, 9.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -17.0F, -10.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Eocursor = fossil.addOrReplaceChild("Eocursor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.5F, 0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Eocursor.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.6285F, 0.1648F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition LegL = Eocursor.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 0.9F, -0.6F, -1.7017F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 5.4868F, 1.4076F, 2.3998F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3536F, 0.6562F, -1.0385F, 0.0F, 0.0F));

		PartDefinition PesL = MetatarsalL.addOrReplaceChild("PesL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, -3.1F, 2.0944F, 0.0F, 0.0F));

		PartDefinition LegL2 = Eocursor.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 0.9F, -0.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4868F, 1.4076F, 0.9687F, 0.0522F, -0.0593F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3536F, 0.6562F, 0.1396F, 0.0F, 0.0F));

		PartDefinition PesL2 = MetatarsalL2.addOrReplaceChild("PesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, -3.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail1 = Eocursor.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 2.6F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition Caudalproximal_r1 = Tail1.addOrReplaceChild("Caudalproximal_r1", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7052F, 0.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8052F, 6.7F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition Caudalmedialproximal_r1 = Tail2.addOrReplaceChild("Caudalmedialproximal_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.9F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 10.1F, -0.0089F, 0.1745F, -0.0015F));

		PartDefinition Caudalmedialdistal_r1 = Tail3.addOrReplaceChild("Caudalmedialdistal_r1", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.5F, -0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4997F, -0.0174F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.8997F, 8.9826F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition Caudaldistal_r1 = Tail4.addOrReplaceChild("Caudaldistal_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.7F, -0.7F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.4F, 0.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Body = Eocursor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -2.2F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, 0.6295F, 0.5701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(27, 32).addBox(-0.5F, 0.6517F, 0.2618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4F, -6.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Scapulo_Coracoid_r1 = Chest.addOrReplaceChild("Scapulo_Coracoid_r1", CubeListBuilder.create().texOffs(-1, 32).addBox(-0.6F, -0.2534F, -0.3052F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.3F, 0.4189F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.0F, -1.7F, 0.4451F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 3.6F, 0.0737F, -0.0468F, 0.5655F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1F, -2.7F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 4.0F, -1.7F, 0.1833F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 3.6F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1F, -2.7F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.3F, -0.1355F, -0.2595F, 0.035F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(40, 39).addBox(-1.1F, -0.2313F, -0.4487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(35, 35).addBox(-1.1F, 2.3568F, -2.7613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.7F, 1.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(26, 43).addBox(-0.7F, 0.0917F, -1.8286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -1.6F, -2.2F, 0.25F, -0.2116F, -0.0536F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.0255F, -1.2389F, -0.0344F, -0.0061F, -0.1744F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0779F, 0.9272F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0779F, 0.9272F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5147F, 0.0603F, -2.7074F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9779F, 0.3272F, -0.1745F, 0.0F, 0.0F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5808F, 0.9268F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5808F, 0.9268F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -2.3808F, 1.6268F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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