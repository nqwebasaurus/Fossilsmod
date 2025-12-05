package fossils.fossils.client.blockentity.model.titanichthys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TitanichthysFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Headslope;
	private final ModelPart Throat;
	private final ModelPart Throatslope;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperjawslope2;
	private final ModelPart Upperjawslope1;
	private final ModelPart Rightcheekslope;
	private final ModelPart Leftcheekslope;
	private final ModelPart Lowerjawback;

	public TitanichthysFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Head = this.root.getChild("Head");
		this.Headslope = this.Head.getChild("Headslope");
		this.Throat = this.Head.getChild("Throat");
		this.Throatslope = this.Throat.getChild("Throatslope");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperjawslope2 = this.Upperjawfront.getChild("Upperjawslope2");
		this.Upperjawslope1 = this.Upperjawback.getChild("Upperjawslope1");
		this.Rightcheekslope = this.Upperjawback.getChild("Rightcheekslope");
		this.Leftcheekslope = this.Upperjawback.getChild("Leftcheekslope");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -12.7F, 4.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -14.8F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.9F, 4.1F, 1.5708F, 0.2793F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.0F, 4.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -0.3F, -0.9F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -11.3356F, -0.5774F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -9.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.2281F, 3.1379F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -4.5F, 6.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -3.9F, 4.1F, 3.1416F, 0.2793F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.6F, 9.0F));

		PartDefinition Head = root.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1758F, -7.9451F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5263F, 11.2036F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 7.5F, 1.7F));

		PartDefinition Throatslope = Throat.addOrReplaceChild("Throatslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3381F, 1.9628F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, -4.3F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawslope2 = Upperjawfront.addOrReplaceChild("Upperjawslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0253F, -1.4544F, 0.7404F, 0.0F, 0.0F));

		PartDefinition Upperjawslope1 = Upperjawback.addOrReplaceChild("Upperjawslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1172F, -0.0005F, 0.4138F, 0.0F, 0.0F));

		PartDefinition Rightcheekslope = Upperjawback.addOrReplaceChild("Rightcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2359F, 6.5049F, -4.1736F, 0.6914F, 0.1588F, -0.0003F));

		PartDefinition Leftcheekslope = Upperjawback.addOrReplaceChild("Leftcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2359F, 6.5049F, -4.1736F, 0.6914F, -0.1588F, 0.0003F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6347F, 9.4635F, -3.6228F, 0.2618F, 0.0F, 0.0F));

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