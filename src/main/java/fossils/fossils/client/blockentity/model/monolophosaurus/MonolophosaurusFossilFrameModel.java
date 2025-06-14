package fossils.fossils.client.blockentity.model.monolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MonolophosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Monolophosaurus;
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
	private final ModelPart ThroatPouch;
	private final ModelPart Skull;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public MonolophosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Monolophosaurus = this.fossil.getChild("Monolophosaurus");
		this.LegL = this.Monolophosaurus.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Monolophosaurus.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Body = this.Monolophosaurus.getChild("Body");
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
		this.ThroatPouch = this.Neck3.getChild("ThroatPouch");
		this.Skull = this.Neck3.getChild("Skull");
		this.Jaw = this.Skull.getChild("Jaw");
		this.Tail1 = this.Monolophosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -21.0F, 5.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(0.6F, -22.0F, -14.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(2.5F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(-0.5F, -3.0F, 18.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -20.0F, -13.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Monolophosaurus = fossil.addOrReplaceChild("Monolophosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6122F, 4.9009F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Monolophosaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(23, 38).addBox(1.5F, 0.3312F, 1.8165F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -0.8F, -3.9F, -0.1134F, 0.0F, 0.0F));

		PartDefinition LegL = Monolophosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.5465F, 0.3241F, -0.3054F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 8.5015F, -4.6158F, 0.4014F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2872F, 4.192F, -0.3491F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 5.2786F, -1.4403F, 0.2618F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.05F, -2.3F));

		PartDefinition LegL2 = Monolophosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.5465F, 0.3241F, 0.4837F, -0.0365F, 0.0168F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 8.5015F, -4.6158F, 0.6196F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2872F, 4.192F, -0.3054F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.2786F, -1.4403F, 0.7418F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.05F, -2.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Body = Monolophosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6825F, -4.1503F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(53, 22).addBox(0.0F, 0.6643F, -0.3979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 19).addBox(0.0F, 0.6643F, -4.0979F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6314F, -7.0005F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(23, 27).addBox(0.0F, 0.7F, -8.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4314F, 1.9994F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0686F, -10.9505F, 0.1398F, 0.0432F, 0.0061F));

		PartDefinition Scapulo_coracoid_r1 = Chest.addOrReplaceChild("Scapulo_coracoid_r1", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, 0.6564F, 5.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 0).addBox(-0.5F, 0.6564F, 0.4009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -6.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8874F, 5.4053F, -4.0192F, -0.6163F, 0.2282F, -0.0705F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4977F, 2.8522F, 3.2666F, -0.3053F, -0.1719F, -0.4971F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0025F, 4.3828F, -2.1979F, -0.0681F, -0.298F, -0.1107F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8874F, 5.4053F, -4.0192F, -0.2545F, -0.2369F, 0.2047F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4977F, 2.8522F, 3.2666F, -0.3271F, 0.2213F, 0.5742F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0025F, 4.3828F, -2.1979F, -0.0608F, 0.4323F, -0.3221F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4495F, -5.1295F, -0.0611F, 0.0F, 0.0F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(50, 13).addBox(-0.5F, 1.05F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.2738F, -2.2762F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6738F, -2.6263F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, 1.3F, 1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -4.1349F, -3.1508F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6291F, -2.9863F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition CervicalProximal_r1 = Neck3.addOrReplaceChild("CervicalProximal_r1", CubeListBuilder.create().texOffs(32, 73).addBox(0.0F, 0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.9783F, -2.8551F, 0.2531F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r2 = Neck3.addOrReplaceChild("CervicalProximal_r2", CubeListBuilder.create().texOffs(52, 60).addBox(0.0F, 0.7F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.9783F, -2.8551F, -0.1833F, 0.0F, 0.0F));

		PartDefinition ThroatPouch = Neck3.addOrReplaceChild("ThroatPouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2717F, -3.7551F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Skull = Neck3.addOrReplaceChild("Skull", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6694F, -4.6387F, 0.48F, 0.0F, 0.0F));

		PartDefinition Jaw = Skull.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.35F, 0.55F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail1 = Monolophosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.357F, 5.6998F, -0.0699F, 0.0435F, -0.003F));

		PartDefinition CaudalProximal_r1 = Tail1.addOrReplaceChild("CaudalProximal_r1", CubeListBuilder.create().texOffs(9, 36).addBox(-1.0F, 0.7F, 9.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 27).addBox(-1.0F, 0.7F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, -0.4171F, -0.0058F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.2852F, 9.8962F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition CaudalMedioproximal_r1 = Tail2.addOrReplaceChild("CaudalMedioproximal_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2725F, -0.0676F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.1757F, 11.8114F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition CaudalMediodistal_r1 = Tail3.addOrReplaceChild("CaudalMediodistal_r1", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.7F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, -0.5723F, -0.9901F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.6493F, 11.0355F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition CaudalDistal_r1 = Tail4.addOrReplaceChild("CaudalDistal_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-0.5F, 0.7F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, -0.4003F, -0.1105F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.7997F, 10.1395F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition CaudalDistalmost_r1 = Tail5.addOrReplaceChild("CaudalDistalmost_r1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, 0.7F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1044F, 1.05F, -0.48F, 0.0F, 0.0F));

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