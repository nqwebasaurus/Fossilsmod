package fossils.fossils.client.blockentity.model.batrachotomus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BatrachotomusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart ToesL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart ToesL2;

	public BatrachotomusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Hips = this.Root.getChild("Hips");
		this.bone = this.Hips.getChild("bone");
		this.bone3 = this.Hips.getChild("bone3");
		this.Body = this.Hips.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Chest = this.body2.getChild("Chest");
		this.bone2 = this.Chest.getChild("bone2");
		this.bone4 = this.Chest.getChild("bone4");
		this.Neck = this.Chest.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.UpperArmL = this.Chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.Chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.Tail = this.Hips.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.UpperLegL = this.Hips.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.ToesL = this.FootL.getChild("ToesL");
		this.UpperLegL2 = this.Hips.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.ToesL2 = this.FootL2.getChild("ToesL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -20.0F, 9.9F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, -3.95F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -13.05F, -8.7F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.55F, -4.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -13.05F, -8.7F, 0.0436F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-5.4F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -13.0F, 10.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition Hips = Root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 14.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 22).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0962F, -6.9128F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0043F, -0.948F, -2.0138F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0043F, -0.948F, -2.0138F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, 0.1826F, -6.9876F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.2962F, -5.9128F, 0.0351F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(35, 58).addBox(-0.5F, 0.1F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -6.8876F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(1, 51).addBox(-0.5F, 0.0743F, -5.7529F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0874F, 0.0F, 0.0F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.4234F, -4.4806F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.4234F, -4.4806F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0313F, -5.8996F, -0.1768F, 0.1719F, -0.0305F));

		PartDefinition cube_r5 = Neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 66).addBox(-0.5F, 0.0765F, 0.4406F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1442F, -3.8748F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0994F, -3.5716F, -0.1355F, 0.1356F, 0.0241F));

		PartDefinition cube_r6 = Neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 53).addBox(-0.5F, -0.2F, 0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1042F, -3.7447F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.8F, 0.2495F, 0.1723F, 0.028F));

		PartDefinition cube_r7 = Neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 46).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1042F, -3.7447F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0242F, -3.3447F, 0.2268F, 0.1566F, 0.2849F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.925F, 2.3427F, -9.5554F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.925F, 2.3427F, -9.5554F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4351F, -0.0478F, 0.5498F, 0.0F, 0.0F));

		PartDefinition UpperArmL = Chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 5.1419F, -6.4363F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.5962F, 1.205F, -0.672F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 6.8148F, -0.8748F, 0.7418F, 0.0F, 0.0F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, -0.6109F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 5.1419F, -6.4363F, 0.1309F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.5962F, 1.205F, -1.5388F, 0.2267F, -0.1632F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 6.8148F, -0.8748F, 1.7453F, 0.0F, 0.0F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2212F, 0.9872F, -0.0981F, -0.1737F, 0.017F));

		PartDefinition cube_r8 = Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 1.01F, -1.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.7481F, 1.0684F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, -0.1095F, -0.3161F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3269F, 8.0684F, -0.0498F, -0.0872F, 0.0043F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 31).addBox(-0.5F, 0.3392F, -0.6974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 38).addBox(-0.5F, 0.3392F, 7.0026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4095F, 8.0839F, -0.0633F, -0.0871F, 0.0055F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.2992F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0392F, 7.7026F, -0.0829F, -0.2609F, 0.0214F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, 0.2995F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0008F, 7.925F, -0.0808F, -0.1305F, 0.0105F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.2995F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.875F, -0.0588F, 0.1307F, -0.0077F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.2995F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.1043F, 0.217F, -0.0225F));

		PartDefinition UpperLegL = Hips.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 1.3673F, -3.6104F, -0.7418F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 10.4037F, 1.5505F, 0.9599F, 0.0F, 0.0F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4705F, -0.7813F, -1.3526F, 0.0F, 0.0F));

		PartDefinition ToesL = FootL.addOrReplaceChild("ToesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0057F, 2.7277F, -0.233F, 1.1349F, 0.0F, 0.0F));

		PartDefinition UpperLegL2 = Hips.addOrReplaceChild("UpperLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 1.3673F, -3.6104F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 10.4037F, 1.5505F, 0.9599F, 0.0F, 0.0F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4705F, -0.7813F, -1.9199F, 0.0F, 0.0F));

		PartDefinition ToesL2 = FootL2.addOrReplaceChild("ToesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0057F, 2.7277F, -0.233F, 1.2658F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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