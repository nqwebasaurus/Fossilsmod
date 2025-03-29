package fossils.fossils.client.blockentity.model.dilophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DilophosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Dilophosaurus;
	private final ModelPart LegL;
	private final ModelPart TibiaL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart TibiaL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
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
	private final ModelPart ParasagittalCrest2;
	private final ModelPart ParasagittalCrest3;
	private final ModelPart Jaw;

	public DilophosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Dilophosaurus = this.fossil.getChild("Dilophosaurus");
		this.LegL = this.Dilophosaurus.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Dilophosaurus.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Tail1 = this.Dilophosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Dilophosaurus.getChild("Body");
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
		this.ParasagittalCrest2 = this.Head.getChild("ParasagittalCrest2");
		this.ParasagittalCrest3 = this.Head.getChild("ParasagittalCrest3");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -22.0F, 6.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.3F, -5.8F, -0.5F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.5F, -19.2F, -12.5F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.7F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.5F, -19.2F, -12.5F, -0.3316F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(0.1F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -20.9F, 6.5F, 0.0F, 0.0F, 1.7104F));

		PartDefinition Dilophosaurus = fossil.addOrReplaceChild("Dilophosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.3F, 8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Dilophosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(41, 47).addBox(-0.5F, 0.5154F, 5.5763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 42).addBox(-0.5F, 0.5154F, -0.1237F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, -0.1571F, 0.0F, 0.0F));

		PartDefinition basin_r2 = Dilophosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, 0.131F, 1.9612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -6.4F, -0.0785F, 0.0F, 0.0F));

		PartDefinition LegL = Dilophosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 2.3128F, -1.6962F, -0.7375F, -0.0883F, -0.0968F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.6476F, -2.868F, 0.7505F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9872F, 3.692F, -0.6109F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.2911F, -1.2535F, 1.5272F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition LegL2 = Dilophosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 2.3128F, -1.6962F, 0.3491F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 7.6476F, -2.868F, -0.0349F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.9872F, 3.692F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.2911F, -1.2535F, -0.0873F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, -2.3F));

		PartDefinition Tail1 = Dilophosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.8F, 4.5F, 0.0784F, -0.2189F, -0.0853F));

		PartDefinition CaudalProximal_r1 = Tail1.addOrReplaceChild("CaudalProximal_r1", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, 0.492F, 0.0304F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, -0.284F, -0.0072F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.0966F, 10.6773F, 0.064F, -0.3048F, -0.0192F));

		PartDefinition CaudalMedioproximal_r1 = Tail2.addOrReplaceChild("CaudalMedioproximal_r1", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.2F, 12.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0324F, -0.0959F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(31, 13).addBox(-0.6F, 0.1772F, 0.0341F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.1365F, 12.8245F, -0.0302F, -0.5234F, 0.0151F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -0.0109F, 11.0431F, -0.022F, -0.6544F, 0.0134F));

		PartDefinition CaudalDistal_r1 = Tail4.addOrReplaceChild("CaudalDistal_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.1379F, -0.5463F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 0.1121F, 0.0778F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.5156F, 11.4095F, 0.1276F, -0.607F, -0.0731F));

		PartDefinition CaudalDistalmost_r1 = Tail5.addOrReplaceChild("CaudalDistalmost_r1", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, 0.7F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5002F, 0.0939F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Body = Dilophosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4629F, -4.3441F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(56, 20).addBox(-0.5F, 0.6784F, -4.1885F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6146F, -8.0325F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(7, 49).addBox(0.0F, 1.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 42).addBox(0.0F, 1.6F, -9.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 1.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1994F, -11.9238F, 0.1152F, -0.1734F, -0.02F));

		PartDefinition Scapulo_coracoid_r1 = Chest.addOrReplaceChild("Scapulo_coracoid_r1", CubeListBuilder.create().texOffs(19, 42).addBox(0.0F, 0.2338F, -3.0652F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2709F, -3.8339F, 0.0436F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3246F, 5.7867F, -4.7464F, -0.118F, -0.4784F, -0.5613F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4977F, 2.5646F, 3.3518F, -0.4944F, -0.3345F, 0.0922F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.1257F, -1.6879F, -0.0852F, 0.0189F, 0.3221F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3246F, 5.7867F, -4.7464F, -0.2116F, -0.2101F, 0.4951F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4977F, 2.5646F, 3.3518F, -0.288F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.1257F, -1.6879F, -0.0852F, -0.0189F, -0.3221F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3356F, -6.5625F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(4, 56).addBox(-0.5F, 0.6101F, 3.9026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(1, 53).addBox(-0.5F, 0.6101F, 0.2026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1123F, -3.7315F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8703F, -3.8877F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(53, 5).addBox(0.0F, 0.4544F, 0.0601F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.8558F, -2.8571F, -0.7243F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5081F, -2.8638F, 0.2256F, -0.2555F, -0.0579F));

		PartDefinition CervicalProximal_r1 = Neck3.addOrReplaceChild("CervicalProximal_r1", CubeListBuilder.create().texOffs(54, 26).addBox(0.0F, 0.5149F, 0.153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.1054F, -2.9029F, -0.7243F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0584F, -4.0611F, 0.7002F, -0.1846F, -0.1169F));

		PartDefinition ParasagittalCrest2 = Head.addOrReplaceChild("ParasagittalCrest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -2.3258F, -8.7438F, -0.2226F, 0.0905F, 0.0702F));

		PartDefinition ParasagittalCrest3 = Head.addOrReplaceChild("ParasagittalCrest3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -2.3258F, -8.7438F, -0.2226F, -0.0905F, -0.0702F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.8099F, -0.1023F, 0.2618F, 0.0F, 0.0F));

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