package fossils.fossils.client.blockentity.model.hescheleria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HescheleriaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hescheleria;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart Jaw;
	private final ModelPart bone4;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Hip;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public HescheleriaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hescheleria = this.fossil.getChild("Hescheleria");
		this.Chest = this.Hescheleria.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone4 = this.Jaw.getChild("bone4");
		this.RArm = this.Chest.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Chest.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Hip = this.Hescheleria.getChild("Hip");
		this.RLeg = this.Hip.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RLeg3 = this.Hip.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot2 = this.RLeg4.getChild("RFoot2");
		this.Tail = this.Hip.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hescheleria = fossil.addOrReplaceChild("Hescheleria", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -2.0F, -6.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3624F, -6.9064F, -0.2168F, 0.2325F, -0.3453F, 0.3004F));

		PartDefinition Chest = Hescheleria.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.275F, -6.0F, -0.3686F, 0.1197F, 0.2591F));

		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 53).addBox(-0.5F, 0.45F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(-1, 48).addBox(-0.5F, 0.45F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.275F, -6.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-3, 46).addBox(-0.2F, 2.2F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0274F, -3.1406F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r3 = Chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 51).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.0274F, -3.1406F, -1.501F, 0.0F, 0.0F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(60, 49).addBox(-0.5F, 0.35F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4144F, -6.1311F, -0.1708F, 0.2572F, 0.2099F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, -0.3086F, 0.2367F, -0.2578F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2999F, 0.0108F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bone4 = Jaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 3.775F, -3.0F, -2.2493F, -1.3991F, -2.3285F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 1.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 3.775F, -3.0F, 1.435F, 1.3977F, -0.2694F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 1.0F, 0.0F, -0.0731F, -0.4721F, 0.2417F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Hip = Hescheleria.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1445F, 6.9007F, 0.3572F, 0.2594F, 0.0281F));

		PartDefinition cube_r4 = Hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 48).addBox(1.5F, 1.7F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8797F, 4.3704F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition cube_r5 = Hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 52).addBox(-0.5F, -2.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.8797F, 4.3704F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 44).addBox(-0.5F, -0.05F, -0.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.2F, 6.0F, 0.692F, -0.8032F, 0.5777F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3127F, -0.5338F, 0.5661F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offset(3.1808F, 0.0F, 0.2736F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.2F, 6.0F, -0.2457F, 1.2675F, -1.5283F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.121F, 0.6003F, -0.212F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1808F, 0.0F, 0.2736F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7277F, 9.3996F, 0.3685F, 0.2694F, -0.0592F));

		PartDefinition cube_r7 = Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, 0.4F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.05F, -0.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, 11.3F, 0.1694F, 0.436F, 0.0163F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.15F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.3F, -0.2677F, -0.3924F, -0.0145F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 15.9F, -0.3491F, -0.6109F, 0.0F));

		PartDefinition cube_r8 = Tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.1396F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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