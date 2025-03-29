package fossils.fossils.client.blockentity.model.camptosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamptosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Camptosaurus;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart OpposableL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart OpposableL2;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public CamptosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Camptosaurus = this.fossil.getChild("Camptosaurus");
		this.Tail1 = this.Camptosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.LegL = this.Camptosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Camptosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Body = this.Camptosaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.OpposableL = this.HandL.getChild("OpposableL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.OpposableL2 = this.HandL2.getChild("OpposableL2");
		this.Neck4 = this.Chest.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.45F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-2.9F, -20.55F, -24.1F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.85F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9F, -20.55F, -24.1F, -0.192F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.5F, -5.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -22.5F, -2.4F, 0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -22.5F, -2.4F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Camptosaurus = fossil.addOrReplaceChild("Camptosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, 0.0F));

		PartDefinition cube_r5 = Camptosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 16).addBox(-0.5F, -0.2092F, -0.6091F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1897F, -7.5097F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail1 = Camptosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.4926F, 0.5715F, -0.3232F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.1F, -0.4378F, 0.0791F, -0.037F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(-1, 17).addBox(-0.4997F, -0.6044F, -0.3008F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1528F, 9.561F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5095F, 0.1779F, 0.0534F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6217F, 12.7806F, 0.1965F, -0.2141F, -0.0423F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5181F, 0.4907F, 0.0091F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2272F, 12.4974F, 0.0928F, -0.3477F, -0.0317F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5276F, 0.6047F, -0.6331F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1113F, 16.2311F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition LegL = Camptosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.1F, -1.4F, -0.1309F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.6378F, 1.0243F, 1.309F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5189F, 0.0436F, -0.7418F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 6.3996F, -0.8833F, -1.309F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.4F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LegL2 = Camptosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.1F, -1.4F, -0.7418F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.6378F, 1.0243F, 1.0908F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.5189F, 0.0436F, -1.0908F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 6.3996F, -0.8833F, -0.829F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.4F, 0.0F));

		PartDefinition Body = Camptosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -8.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, 0.549F, 0.0353F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.181F, -6.6698F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 50).addBox(0.0F, 0.7512F, 0.2946F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.2F, -12.6F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8F, -12.3F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, 0.2835F, -8.6465F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2957F, 0.0961F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 36).addBox(0.0F, 0.6514F, -0.2502F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.9043F, -2.9039F, 0.6981F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 8.6F, -4.3F, 0.4728F, 0.0998F, -0.1434F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 7.2455F, 0.4442F, 0.5132F, 0.2151F, -0.0303F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6573F, -0.7082F, -5.8535F, 0.0F, 0.48F, 0.0F));

		PartDefinition OpposableL = HandL.addOrReplaceChild("OpposableL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 8.6F, -4.3F, 0.9528F, -0.0998F, 0.1434F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 7.2455F, 0.4442F, 0.2951F, -0.2151F, 0.0303F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6573F, -0.7082F, -5.8535F, 0.0F, -0.4363F, 0.0F));

		PartDefinition OpposableL2 = HandL2.addOrReplaceChild("OpposableL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.2161F, -0.149F, -0.5947F));

		PartDefinition Neck4 = Chest.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -6.3F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5F, 0.7763F, -0.1763F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.8739F, -4.5769F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.3F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 72).addBox(-0.5075F, -0.0285F, -0.5795F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3156F, -3.5699F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4584F, -3.3099F, -0.0131F, 0.0434F, -0.0422F));

		PartDefinition cube_r12 = Neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, 55).addBox(-0.5007F, 0.654F, 0.0687F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.069F, -2.9311F, -0.9861F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -2.9F, -0.1572F, 0.0431F, -0.0068F));

		PartDefinition cube_r13 = Neck1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5007F, 0.1643F, -0.8771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0203F, -1.2957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.103F, -1.5206F, -0.2414F, 0.0876F, 0.0016F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -0.2F, 0.6196F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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