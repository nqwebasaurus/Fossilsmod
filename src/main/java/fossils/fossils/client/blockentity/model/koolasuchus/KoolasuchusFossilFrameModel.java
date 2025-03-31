package fossils.fossils.client.blockentity.model.koolasuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KoolasuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart front;
	private final ModelPart front2;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart neck;
	private final ModelPart wholehead;
	private final ModelPart headbase;
	private final ModelPart headdonotmove;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public KoolasuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.hindlegL = this.body.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL4 = this.body.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.front = this.body.getChild("front");
		this.front2 = this.front.getChild("front2");
		this.forelegL = this.front2.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.front2.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.neck = this.front2.getChild("neck");
		this.wholehead = this.neck.getChild("wholehead");
		this.headbase = this.wholehead.getChild("headbase");
		this.headdonotmove = this.headbase.getChild("headdonotmove");
		this.leftFace = this.headdonotmove.getChild("leftFace");
		this.rightFace = this.headdonotmove.getChild("rightFace");
		this.jaw = this.wholehead.getChild("jaw");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.9F, 16.0F, -0.3043F, -0.0262F, -0.0832F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 53).addBox(-1.5F, 0.2F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4672F, 2.9868F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 56).addBox(-0.5F, 1.85F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-2, 44).addBox(-1.0F, 2.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -6.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hindlegL = body.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.736F, -1.3F, 1.6918F, 0.5169F, -0.7135F, 1.0664F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 0.0F, 0.0F, 0.1381F, 0.1855F, 1.3171F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9152F, -0.3068F, 0.7339F, 0.2182F, 0.3491F, -1.2654F));

		PartDefinition hindlegL4 = body.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.736F, -1.3F, 1.6918F, 1.2052F, 0.7948F, 0.0402F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 0.0F, 0.0F, 0.1381F, -0.1855F, -1.3171F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9152F, -0.3068F, 0.7339F, 0.2182F, -0.3491F, 1.2654F));

		PartDefinition front = body.addOrReplaceChild("front", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -4.2F, 0.0078F, 0.218F, 0.0446F));

		PartDefinition cube_r4 = front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 1.75F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.0F, -9.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition front2 = front.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(21, 30).addBox(-0.5F, 0.1F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -9.8F, 0.0474F, 0.0872F, 0.0438F));

		PartDefinition cube_r5 = front2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 34).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.6F, -3.8F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition cube_r6 = front2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 28).addBox(-0.8F, 1.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition forelegL = front2.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7739F, 2.2054F, -3.7736F, 0.0F, -0.7854F, 0.2618F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8067F, 0.6634F, -0.25F, 0.0F, -0.0436F, 0.8727F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9247F, 0.1297F, 0.2784F, 1.5996F, 0.4781F, 0.1976F));

		PartDefinition forelegL4 = front2.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7739F, 2.2054F, -3.7736F, 0.0F, -0.0436F, -0.2618F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8067F, 0.6634F, -0.25F, -0.115F, -0.8893F, -0.0894F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9247F, 0.1297F, 0.2784F, 1.2602F, 0.0198F, 0.0638F));

		PartDefinition neck = front2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0151F, -6.9553F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -6.1F, -10.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.3F, 4.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2949F, -4.8217F, 0.1464F, 0.0184F, 0.1356F));

		PartDefinition headbase = wholehead.addOrReplaceChild("headbase", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));

		PartDefinition headdonotmove = headbase.addOrReplaceChild("headdonotmove", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -11.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = headdonotmove.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9368F, -0.975F, 0.1495F));

		PartDefinition rightFace = headdonotmove.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9368F, -0.975F, 0.1495F));

		PartDefinition jaw = wholehead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.5F, 0.35F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 30).addBox(-0.5F, 0.35F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1315F, 4.5556F, 0.0011F, -0.2275F, -0.2311F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(-2, 18).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1691F, 6.9348F, 0.0365F, 0.3911F, -0.0361F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1943F, 9.1299F, 0.2691F, 0.7395F, 0.0638F));

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