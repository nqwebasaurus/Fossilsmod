package fossils.fossils.client.blockentity.model.abyssosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AbyssosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart snout;
	private final ModelPart snout2;
	private final ModelPart forehead;
	private final ModelPart forehead2;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public AbyssosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail = this.Hips.getChild("Tail");
		this.BackFlipperR2 = this.Tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.snout = this.Head.getChild("snout");
		this.snout2 = this.snout.getChild("snout2");
		this.forehead = this.snout2.getChild("forehead");
		this.forehead2 = this.forehead.getChild("forehead2");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.Chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.1543F, 2.952F, 0.6429F, 0.1321F, -0.1741F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 33).addBox(-1.0F, 0.7978F, -0.115F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(34, 45).addBox(-0.5F, 0.5197F, 0.0363F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6962F, 11.3425F, -0.2172F, -0.101F, 0.1551F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 40).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5197F, 2.3363F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 48).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0197F, 2.3363F, -1.5708F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4F, 4.7082F, 2.09F, 0.2849F, -0.3618F, 0.5453F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5092F, 0.0209F, 1.0724F, 0.1061F, -0.324F, -0.3228F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.415F, -0.4473F, -17.069F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 4.7082F, 2.09F, 0.301F, 0.4375F, -0.7182F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5092F, 0.0209F, 1.0724F, 0.1205F, 0.3191F, 0.3685F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.415F, -0.4473F, -17.069F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(10, 47).addBox(-0.5F, 0.4887F, -0.7726F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1916F, 6.0976F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, 0.1741F, -0.035F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1882F, 5.8814F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 48).addBox(-0.5F, -0.0094F, -0.1604F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0993F, 5.8479F, 0.0181F, 0.2618F, 0.0047F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8212F, 3.6925F, -0.049F, 0.0375F, -0.1328F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.8795F, -5.9815F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -8.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -13.8F, -0.1333F, 0.0221F, -0.2472F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-1, 24).addBox(-0.5F, -0.2784F, -3.7094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 42).addBox(-1.6F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5529F, -3.3342F, 1.5708F, 0.1745F, -1.5708F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 51).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5985F, -3.8552F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 50).addBox(-0.5F, 0.7F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -7.7F, -0.2734F, 0.1338F, -0.1727F));

		PartDefinition cube_r10 = Neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 35).addBox(-1.5F, 0.4F, -6.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -7.9F, -0.3713F, 0.2435F, -0.1391F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 14).addBox(-1.6F, -0.3F, -6.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -10.0F, -0.3317F, 0.2513F, 0.098F));

		PartDefinition cube_r12 = Neck4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, 24).addBox(-1.5F, -0.2F, -9.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.3601F, 0.2428F, 0.0464F));

		PartDefinition cube_r13 = Neck5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.3F, -10.7F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, 0.0F, -8.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.0F, 0.255F, 0.3345F, 0.2326F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.2436F, 0.325F, 0.1304F));

		PartDefinition cube_r14 = Neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 26).addBox(-0.6F, 0.2F, -9.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2F, -8.8F, 0.1242F, 0.3421F, 0.0691F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1557F, -2.9796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition forehead2 = forehead.addOrReplaceChild("forehead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, 1.8F, -0.1876F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.9557F, -0.0296F, 0.6109F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 5.5806F, -3.22F, 0.2112F, 0.1903F, -0.7811F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2723F, -0.2839F, -0.6396F, 0.0149F, 0.041F, 0.3494F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9888F, -4.0F, -18.8073F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 5.5806F, -3.22F, 0.456F, -0.2552F, 0.8548F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2723F, -0.2839F, -0.6396F, 0.0167F, -0.0403F, -0.393F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9888F, -4.0F, -18.8073F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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