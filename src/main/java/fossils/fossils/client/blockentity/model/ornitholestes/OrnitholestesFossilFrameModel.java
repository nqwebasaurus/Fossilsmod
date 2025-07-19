package fossils.fossils.client.blockentity.model.ornitholestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OrnitholestesFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base;
	private final ModelPart hips;
	private final ModelPart upperlegleft;
	private final ModelPart lowerlegleft;
	private final ModelPart footleft;
	private final ModelPart toeleft;
	private final ModelPart toe;
	private final ModelPart toeleft2;
	private final ModelPart upperlegright;
	private final ModelPart lowerlegright;
	private final ModelPart footright;
	private final ModelPart toeright;
	private final ModelPart toe2;
	private final ModelPart toeright2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart fingerleft2;
	private final ModelPart fingerleft;
	private final ModelPart upperarmright;
	private final ModelPart lowerarmright;
	private final ModelPart handright;
	private final ModelPart fingerright2;
	private final ModelPart fingerright;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public OrnitholestesFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base = this.fossil.getChild("base");
		this.hips = this.base.getChild("hips");
		this.upperlegleft = this.hips.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.toeleft = this.footleft.getChild("toeleft");
		this.toe = this.toeleft.getChild("toe");
		this.toeleft2 = this.toeleft.getChild("toeleft2");
		this.upperlegright = this.hips.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.toeright = this.footright.getChild("toeright");
		this.toe2 = this.toeright.getChild("toe2");
		this.toeright2 = this.toeright.getChild("toeright2");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail = this.tail4.getChild("tail");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.fingerleft2 = this.handleft.getChild("fingerleft2");
		this.fingerleft = this.handleft.getChild("fingerleft");
		this.upperarmright = this.chest.getChild("upperarmright");
		this.lowerarmright = this.upperarmright.getChild("lowerarmright");
		this.handright = this.lowerarmright.getChild("handright");
		this.fingerright2 = this.handright.getChild("fingerright2");
		this.fingerright = this.handright.getChild("fingerright");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -18.0F, 6.9F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -4.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.4F, -12.0F, -4.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, -12.0F, -4.4F, 0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.3F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -12.0F, 7.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips = base.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.6222F, 7.1837F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 8).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3778F, -2.4837F, -0.1047F, 0.0F, 0.0F));

		PartDefinition upperlegleft = hips.addOrReplaceChild("upperlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.05F, 0.8222F, -0.0337F, -0.9599F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 7.133F, 0.95F, 1.7028F, -0.1298F, -0.0172F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 8.0773F, 0.1105F, -1.8787F, 0.1248F, -0.0396F));

		PartDefinition toeleft = footleft.addOrReplaceChild("toeleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6923F, 0.3811F, -0.4013F, 0.2013F, -0.0846F));

		PartDefinition toe = toeleft.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.5F, -0.25F));

		PartDefinition toeleft2 = toeleft.addOrReplaceChild("toeleft2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.6F));

		PartDefinition upperlegright = hips.addOrReplaceChild("upperlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.05F, 0.8222F, -0.0337F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 7.133F, 0.95F, 1.2217F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 8.0773F, 0.1105F, -0.9163F, 0.0F, 0.0F));

		PartDefinition toeright = footright.addOrReplaceChild("toeright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6923F, 0.3811F, -0.7854F, 0.0F, 0.0F));

		PartDefinition toe2 = toeright.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, -0.25F));

		PartDefinition toeright2 = toeright.addOrReplaceChild("toeright2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.6F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.6567F, 3.2602F, 0.0056F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.6567F, 3.2602F, 0.0056F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, 0.3213F, -0.4625F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 18).addBox(-0.5F, 0.3213F, 6.2375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5222F, 2.3163F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0676F, 7.1242F, 0.2863F, -0.302F, -0.0466F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, 0.5278F, 0.1011F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4601F, 6.6376F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 26).addBox(-0.5F, 0.65F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 20).addBox(-0.5F, 0.65F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4601F, -0.2624F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5601F, 9.7876F, 0.0021F, -0.3051F, -0.0138F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, 0.3F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.014F, -0.0433F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 41).addBox(0.0F, 0.7029F, 4.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 37).addBox(0.0F, 0.7029F, -0.3939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.314F, 5.8567F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6352F, 10.848F, -0.5782F, 0.3435F, -0.0631F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, 0.55F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2582F, -0.1351F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail = tail4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3418F, 5.8649F, -0.2751F, 0.6973F, -0.0366F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6643F, -0.0022F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0778F, -2.2837F, 0.0209F, 0.1786F, -0.1252F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6465F, -6.9163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2965F, -6.9663F, 0.1232F, 0.1299F, 0.016F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, 0.6486F, -4.1848F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 3).addBox(-0.5F, 0.6486F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4931F, -1.9069F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, 0.3F, 4.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4931F, -5.9069F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.0751F, 0.3177F, -0.9516F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.0751F, 0.3177F, -0.9516F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 3.4724F, -4.7165F, -0.8822F, 0.1605F, -0.9258F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0118F, -0.0524F, 5.3065F, -1.3526F, -0.2618F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1343F, 0.7614F, 4.1511F, 0.5236F, 0.1309F, 0.0F));

		PartDefinition fingerleft2 = handleft.addOrReplaceChild("fingerleft2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, 0.15F, -0.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fingerleft = handleft.addOrReplaceChild("fingerleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, -0.25F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 3.4724F, -4.7165F, -1.078F, 0.0508F, 0.9126F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0118F, -0.0524F, 5.3065F, -1.5708F, 0.2618F, 0.0F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1343F, 0.7614F, 4.1511F, 0.5236F, -0.1309F, 0.0F));

		PartDefinition fingerright2 = handright.addOrReplaceChild("fingerright2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, 0.15F, -0.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fingerright = handright.addOrReplaceChild("fingerright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -0.25F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3432F, -5.6069F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5F, -0.8533F, 2.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 39).addBox(-0.5F, -0.8533F, -0.1723F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1794F, -3.4195F, -0.4102F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9294F, -2.4196F, -0.5595F, 0.2295F, 0.114F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 44).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5588F, -4.1956F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2338F, -3.8956F, -0.5299F, 0.0807F, -0.1316F));

		PartDefinition cube_r16 = neck3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 41).addBox(-0.5F, 0.5622F, 0.1792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3683F, -1.9595F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6671F, -1.8158F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 45).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.025F, -0.8F, 0.8639F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1806F, -0.9157F, 1.2635F, 0.0344F, 0.0338F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0565F, -0.1459F, 0.733F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.575F, 0.7211F, -2.9153F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.575F, 0.7211F, -2.9153F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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