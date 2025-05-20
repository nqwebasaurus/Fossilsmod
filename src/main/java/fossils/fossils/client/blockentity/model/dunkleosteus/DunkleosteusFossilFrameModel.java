package fossils.fossils.client.blockentity.model.dunkleosteus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DunkleosteusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Headslope;
	private final ModelPart Throat;
	private final ModelPart Throatslope;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperjawslope2;
	private final ModelPart Upperfrontshears;
	private final ModelPart Leftuppershears;
	private final ModelPart Rightuppershears;
	private final ModelPart Rightuppershears2;
	private final ModelPart Upperjawslope1;
	private final ModelPart Leftcheekslope;
	private final ModelPart Rightcheekslope;
	private final ModelPart Rightcheekslope3;
	private final ModelPart Rightcheekslope2;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawback2;
	private final ModelPart Lowerjawmiddle2;
	private final ModelPart Lowerjawfront2;

	public DunkleosteusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Head = this.root.getChild("Head");
		this.Headslope = this.Head.getChild("Headslope");
		this.Throat = this.Head.getChild("Throat");
		this.Throatslope = this.Throat.getChild("Throatslope");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperjawslope2 = this.Upperjawfront.getChild("Upperjawslope2");
		this.Upperfrontshears = this.Upperjawfront.getChild("Upperfrontshears");
		this.Leftuppershears = this.Upperjawfront.getChild("Leftuppershears");
		this.Rightuppershears = this.Upperjawfront.getChild("Rightuppershears");
		this.Rightuppershears2 = this.Upperjawfront.getChild("Rightuppershears2");
		this.Upperjawslope1 = this.Upperjawback.getChild("Upperjawslope1");
		this.Leftcheekslope = this.Upperjawback.getChild("Leftcheekslope");
		this.Rightcheekslope = this.Upperjawback.getChild("Rightcheekslope");
		this.Rightcheekslope3 = this.Upperjawback.getChild("Rightcheekslope3");
		this.Rightcheekslope2 = this.Upperjawback.getChild("Rightcheekslope2");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerjawback2 = this.Head.getChild("Lowerjawback2");
		this.Lowerjawmiddle2 = this.Lowerjawback2.getChild("Lowerjawmiddle2");
		this.Lowerjawfront2 = this.Lowerjawmiddle2.getChild("Lowerjawfront2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -12.7F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -2.5F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -3.2F, -5.2F, 3.1416F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.3F, -9.2F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.0F, -0.5F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.0F, -0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.0F, -0.4F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.0228F, -1.8459F, -1.2654F, 0.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.6F, 9.0F));

		PartDefinition Head = root.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -9.0F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.1F, 6.0F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, 0.0F));

		PartDefinition Throatslope = Throat.addOrReplaceChild("Throatslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1482F, 0.981F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7F, -6.0F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawslope2 = Upperjawfront.addOrReplaceChild("Upperjawslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.95F, -0.6F, 0.7055F, 0.0F, 0.0F));

		PartDefinition Upperfrontshears = Upperjawfront.addOrReplaceChild("Upperfrontshears", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -2.7F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Leftuppershears = Upperjawfront.addOrReplaceChild("Leftuppershears", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.5F, -1.2F, 0.1274F, -0.1485F, 0.0F));

		PartDefinition Rightuppershears = Upperjawfront.addOrReplaceChild("Rightuppershears", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -0.5F, -1.2F, 0.1274F, 0.1485F, 0.0F));

		PartDefinition Rightuppershears2 = Upperjawfront.addOrReplaceChild("Rightuppershears2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.5F, -1.2F, 0.1274F, -0.1485F, 0.0F));

		PartDefinition Upperjawslope1 = Upperjawback.addOrReplaceChild("Upperjawslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.4138F, 0.0F, 0.0F));

		PartDefinition Leftcheekslope = Upperjawback.addOrReplaceChild("Leftcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.0F, -1.9F, 0.7006F, -0.0424F, -0.0848F));

		PartDefinition Rightcheekslope = Upperjawback.addOrReplaceChild("Rightcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2398F, 3.1729F, -2.629F, 0.6786F, 0.214F, -0.0691F));

		PartDefinition Rightcheekslope3 = Upperjawback.addOrReplaceChild("Rightcheekslope3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2398F, 3.1729F, -2.629F, 0.6786F, -0.214F, 0.0691F));

		PartDefinition Rightcheekslope2 = Upperjawback.addOrReplaceChild("Rightcheekslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.0F, -1.9F, 0.7006F, -0.0424F, -0.0848F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9821F, 4.7726F, -4.7007F, 0.1641F, 0.1722F, 0.0284F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0078F, 2.1093F, -0.8245F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.7F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawback2 = Head.addOrReplaceChild("Lowerjawback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9821F, 4.7726F, -4.7007F, 0.1641F, -0.1722F, -0.0284F));

		PartDefinition Lowerjawmiddle2 = Lowerjawback2.addOrReplaceChild("Lowerjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0078F, 2.1093F, -0.8245F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront2 = Lowerjawmiddle2.addOrReplaceChild("Lowerjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.7F, 0.0637F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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