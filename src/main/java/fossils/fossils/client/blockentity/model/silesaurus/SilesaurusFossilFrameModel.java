package fossils.fossils.client.blockentity.model.silesaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SilesaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Silesaurus;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart MetacarpalL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart MetacarpalL2;
	private final ModelPart HandL2;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public SilesaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Silesaurus = this.fossil.getChild("Silesaurus");
		this.LegL = this.Silesaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.LegL2 = this.Silesaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL2 = this.MetatarsalL2.getChild("FootL2");
		this.Tail1 = this.Silesaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Silesaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.MetacarpalL = this.ElbowL.getChild("MetacarpalL");
		this.HandL = this.MetacarpalL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.MetacarpalL2 = this.ElbowL2.getChild("MetacarpalL2");
		this.HandL2 = this.MetacarpalL2.getChild("HandL2");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, 1.8F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.45F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, -12.95F, -11.4F, 0.1484F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.05F, -0.5F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.7F, -12.95F, -11.4F, 0.0F, -0.1484F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(5.4F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -15.0F, 2.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Silesaurus = fossil.addOrReplaceChild("Silesaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -22.8F, 3.0F));

		PartDefinition Basin_r1 = Silesaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, 0.7F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition LegL = Silesaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offset(3.2F, 1.4891F, -0.2853F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.4508F, 0.0988F, 1.2654F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 8.8959F, -0.2334F, -0.8988F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0458F, 0.0285F, 1.7453F, 0.0F, 0.0F));

		PartDefinition LegL2 = Silesaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.4891F, -0.2853F, -1.1082F, 0.1167F, -0.037F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.4508F, 0.0988F, 1.6144F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 8.8959F, -0.2334F, -1.4224F, 0.0F, 0.0F));

		PartDefinition FootL2 = MetatarsalL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0458F, 0.0285F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Tail1 = Silesaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0354F, 0.421F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.0607F, 0.3991F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.5564F, 10.8991F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, 0.1178F, 0.2815F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1936F, 9.8118F, 0.0262F, -0.0436F, -0.0011F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(23, 25).addBox(-0.5F, 0.3026F, 0.26F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.257F, 9.9231F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.3026F, -0.04F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.035F, 7.8917F, -0.1072F, -0.217F, 0.0232F));

		PartDefinition Body = Silesaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1995F, -2.9791F, 0.0524F, -0.0436F, -0.0023F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 14).addBox(-0.5F, 0.7592F, -0.0866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 43).addBox(-0.5F, 0.7787F, 0.0267F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2739F, -10.0862F, -0.0444F, -0.1308F, 0.0058F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 25).addBox(-0.5F, -0.0261F, 0.2308F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.6F, -5.8F, 0.1658F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 7.1F, -2.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0569F, 0.1241F, -1.5708F, -0.5411F, -1.5708F));

		PartDefinition MetacarpalL = ElbowL.addOrReplaceChild("MetacarpalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 8.914F, -0.6001F, -0.6981F, -1.5533F, 1.5708F));

		PartDefinition HandL = MetacarpalL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6777F, 0.5719F, 1.1956F, 0.0F, 0.0F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 7.1F, -2.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0569F, 0.1241F, -1.6537F, 0.3574F, 1.3376F));

		PartDefinition MetacarpalL2 = ElbowL2.addOrReplaceChild("MetacarpalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 8.914F, -0.6001F, 1.6495F, 1.4561F, 1.1699F));

		PartDefinition HandL2 = MetacarpalL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6777F, 0.5719F, 1.3265F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9223F, -5.7458F, -0.1848F, -0.1287F, 0.024F));

		PartDefinition cube_r8 = Neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 3).addBox(-0.5F, 0.7128F, -0.223F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0043F, -2.7718F, 0.133F, -0.2163F, -0.0287F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 35).addBox(-0.5F, 0.1F, -6.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.7F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(32, 61).addBox(-0.4714F, 0.3995F, -1.989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.4716F, -5.2193F, 0.0282F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -1.8F, 0.0F, -0.3927F, -0.1309F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.0315F, 0.6908F, 0.6894F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 82, 82);
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