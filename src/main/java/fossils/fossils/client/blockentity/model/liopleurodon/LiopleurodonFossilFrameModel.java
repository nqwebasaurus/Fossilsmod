package fossils.fossils.client.blockentity.model.liopleurodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LiopleurodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Pliosaurus;
	private final ModelPart Chest;
	private final ModelPart Shoulder;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public LiopleurodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Pliosaurus = this.fossil.getChild("Pliosaurus");
		this.Chest = this.Pliosaurus.getChild("Chest");
		this.Shoulder = this.Chest.getChild("Shoulder");
		this.Neck3 = this.Shoulder.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperL = this.Shoulder.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.Shoulder.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.BackFlipperL = this.Pliosaurus.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Pliosaurus.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.Tail1 = this.Pliosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -8.5001F, 22.607F, 0.0349F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Pliosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(15, 39).addBox(-1.2F, -0.5F, -6.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 4.2442F, -2.3727F, -1.5708F, 0.1047F, 1.5708F));

		PartDefinition basin_r2 = Pliosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(25, 49).addBox(-0.5F, -0.8133F, 0.5473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.6836F, -2.3136F, -1.6755F, 0.0F, 0.0F));

		PartDefinition basin_r3 = Pliosaurus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(20, 44).addBox(-0.5F, 1.5867F, -0.1527F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.3F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 26).addBox(-1.0F, 0.9398F, -0.4209F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0959F, -9.449F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3123F, -10.1371F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Shoulder.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, 1.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0003F, -12.6405F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0003F, -12.6405F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(73, 10).addBox(-1.0F, 0.2246F, -3.9057F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, -18.722F, 0.0286F, 0.1724F, 0.0276F));

		PartDefinition cube_r4 = Neck3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 0).addBox(-1.7F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 5.1943F, -0.1246F, -1.4399F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = Neck3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 10).addBox(-0.5F, -0.5F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.1943F, -0.1246F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1556F, -4.9315F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3346F, -6.8299F, -0.0275F, 0.1293F, -0.0206F));

		PartDefinition cube_r7 = Neck1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, 0.7F, -2.3F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0646F, -3.759F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4132F, -7.4845F, -0.4638F, 0.1293F, -0.0206F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0736F, -0.7817F, -17.1414F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9264F, -0.7817F, -17.1414F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 3.8531F, 1.9722F, 0.5061F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0209F, 6.6141F, -17.8528F, 0.1708F, -0.2149F, 0.4326F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1946F, -0.3954F, 0.7967F, -0.1215F, -0.1702F, -0.3099F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2443F, -1.5F, -0.0469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0209F, 6.6141F, -17.8528F, 0.1397F, 0.4744F, -0.3957F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1946F, -0.3954F, 0.7967F, -0.1118F, 0.1942F, 0.3532F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2443F, -1.5F, -0.0469F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4156F, 3.5484F, -1.8153F, -0.0922F, -0.7274F, 0.4009F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(11.1585F, 0.5F, -0.1872F, -0.1897F, -0.1278F, -0.22F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4156F, 3.5484F, -1.8153F, -0.0076F, -0.043F, -0.3053F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.1585F, 0.5F, -0.1872F, 0.0285F, 0.1278F, 0.22F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3101F, 4.4898F, -0.3694F, 0.1222F, -0.0471F));

		PartDefinition cube_r8 = Tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 70).addBox(-1.0F, 1.0F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4143F, 1.0271F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Tail1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 73).addBox(-1.0F, 0.8803F, -0.2474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6143F, 3.9272F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9599F, 5.799F, -0.2288F, 0.1275F, -0.0296F));

		PartDefinition cube_r10 = Tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 80).addBox(-1.0F, 0.9284F, 3.1831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 77).addBox(-1.0F, 0.9284F, -0.517F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7472F, 3.8143F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r11 = Tail3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 70).addBox(-1.075F, 0.8F, 0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, 0.1017F, -0.2512F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5619F, 4.9594F, 0.2037F, 0.171F, 0.0351F));

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