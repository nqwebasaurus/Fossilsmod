package fossils.fossils.client.blockentity.model.ornitholestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OrnitholestesFossilModel extends SkullModelBase {
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

	public OrnitholestesFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips = base.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.6222F, 7.1837F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 44).addBox(0.0F, -0.9F, -2.5F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3772F, 0.45F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3778F, -2.4837F, -0.1047F, 0.0F, 0.0F));

		PartDefinition upperlegleft = hips.addOrReplaceChild("upperlegleft", CubeListBuilder.create().texOffs(54, 11).addBox(-0.5F, -0.567F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.05F, 0.8222F, -0.0337F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r3 = upperlegleft.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 67).addBox(0.5F, 0.0168F, -0.0276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.333F, 0.25F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r4 = upperlegleft.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 60).addBox(0.5F, 0.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.433F, -0.45F, 0.2443F, 0.0F, 0.0F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create().texOffs(46, 34).addBox(-0.5F, 0.1995F, -0.1871F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(49, 0).addBox(0.4F, 0.0495F, -0.1871F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.3F, 7.133F, 0.95F, 1.7028F, -0.1298F, -0.0172F));

		PartDefinition cube_r5 = lowerlegleft.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -1.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 1.0495F, 0.3129F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = lowerlegleft.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 65).addBox(-0.5F, -0.95F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 1.0495F, 0.3129F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = lowerlegleft.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.95F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 1.0495F, 0.3129F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r8 = lowerlegleft.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 20).addBox(-0.5F, -0.875F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.9F, 1.0495F, 0.3129F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r9 = lowerlegleft.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, -2.975F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.1245F, -0.0871F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = lowerlegleft.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 61).addBox(0.0F, -2.875F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.1245F, -0.0871F, 0.1745F, 0.0F, 0.0F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(12, 55).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4F, 8.0773F, 0.1105F, -1.8787F, 0.1248F, -0.0396F));

		PartDefinition toeleft = footleft.addOrReplaceChild("toeleft", CubeListBuilder.create().texOffs(17, 55).addBox(-0.5F, 0.0F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6923F, 0.3811F, -0.4013F, 0.2013F, -0.0846F));

		PartDefinition toe = toeleft.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.5F, -0.25F));

		PartDefinition cube_r11 = toe.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 54).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4887F, 0.2691F, -0.7818F, -0.829F, 0.0F, 0.0436F));

		PartDefinition cube_r12 = toe.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 49).addBox(-0.3948F, -0.0212F, -0.3863F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4F, 0.6F, -0.3491F, 0.0F, 0.0436F));

		PartDefinition toeleft2 = toeleft.addOrReplaceChild("toeleft2", CubeListBuilder.create().texOffs(41, 51).addBox(-0.5F, 0.0F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.6F));

		PartDefinition upperlegright = hips.addOrReplaceChild("upperlegright", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, -0.567F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.05F, 0.8222F, -0.0337F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r13 = upperlegright.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 0).addBox(-1.5F, 0.0168F, -0.0276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.333F, 0.25F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r14 = upperlegright.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(62, 59).addBox(-1.5F, 0.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.433F, -0.45F, 0.2443F, 0.0F, 0.0F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create().texOffs(49, 10).addBox(-0.5F, 0.1995F, -0.1871F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(0, 50).addBox(-1.4F, 0.0495F, -0.1871F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.3F, 7.133F, 0.95F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r15 = lowerlegright.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 55).addBox(-0.5F, -1.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, 1.0495F, 0.3129F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r16 = lowerlegright.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 66).addBox(-0.5F, -0.95F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, 1.0495F, 0.3129F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = lowerlegright.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 9).addBox(-0.5F, -0.95F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, 1.0495F, 0.3129F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r18 = lowerlegright.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -0.875F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.9F, 1.0495F, 0.3129F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = lowerlegright.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 65).addBox(-1.0F, -2.975F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.1245F, -0.0871F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = lowerlegright.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 63).addBox(-1.0F, -2.875F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.1245F, -0.0871F, 0.1745F, 0.0F, 0.0F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(31, 55).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4F, 8.0773F, 0.1105F, -0.9163F, 0.0F, 0.0F));

		PartDefinition toeright = footright.addOrReplaceChild("toeright", CubeListBuilder.create().texOffs(55, 49).addBox(-1.5F, 0.0F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6923F, 0.3811F, -0.7854F, 0.0F, 0.0F));

		PartDefinition toe2 = toeright.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offset(1.0F, 2.5F, -0.25F));

		PartDefinition cube_r21 = toe2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 63).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4887F, 0.2691F, -0.7818F, -0.829F, 0.0F, -0.0436F));

		PartDefinition cube_r22 = toe2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 63).addBox(-0.6052F, -0.0212F, -0.3863F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.4F, 0.6F, -0.3491F, 0.0F, -0.0436F));

		PartDefinition toeright2 = toeright.addOrReplaceChild("toeright2", CubeListBuilder.create().texOffs(48, 51).addBox(-1.5F, 0.0F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.6F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.6567F, 3.2602F, 0.0056F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 3).addBox(0.4433F, -3.6609F, -3.2551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, -0.2182F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(49, 20).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0672F, -4.0554F, -1.6185F, -0.1222F, 0.0F, -0.2182F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 56).addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.1181F, -3.8254F, 2.0684F, -0.2967F, 0.0F, -0.2182F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(23, 0).addBox(0.4433F, -3.763F, -2.6893F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 15).addBox(0.4433F, -4.3597F, -2.2027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, -0.2182F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(41, 56).addBox(-0.5F, 0.4F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(56, 29).addBox(-0.5F, 0.0F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3114F, -2.3951F, -2.2893F, 0.2182F, 0.0F, -0.0873F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3114F, -2.3951F, -0.0893F, -0.5236F, 0.0F, -0.0873F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(53, 44).addBox(0.0189F, -3.3588F, -1.0893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(67, 36).addBox(-0.37F, -0.313F, -0.0063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.1745F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 64).addBox(-0.37F, 1.7047F, 0.7883F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.1745F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 32).addBox(-0.37F, -0.0111F, 0.7153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.1745F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 13).addBox(-0.37F, -1.6448F, 0.7464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.1745F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 53).addBox(-1.4761F, 3.8844F, -3.8529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0843F, -0.0226F, -0.2085F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 64).addBox(-0.334F, 1.525F, -2.9423F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0524F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 55).addBox(-0.3915F, -4.043F, -0.0609F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.2F, -0.3752F, 0.0F, 0.0524F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.6567F, 3.2602F, 0.0056F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(-1.4433F, -3.6609F, -3.2551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.2182F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-0.0672F, -4.0554F, -1.6185F, -0.1222F, 0.0F, 0.2182F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.1181F, -3.8254F, 2.0684F, -0.2967F, 0.0F, 0.2182F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-1.4433F, -3.763F, -2.6893F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-1.4433F, -4.3597F, -2.2027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.2182F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 56).mirror().addBox(-0.5F, 0.4F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(56, 29).mirror().addBox(-0.5F, 0.0F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3114F, -2.3951F, -2.2893F, 0.2182F, 0.0F, 0.0873F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, -0.9F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3114F, -2.3951F, -0.0893F, -0.5236F, 0.0F, 0.0873F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-1.0189F, -3.3588F, -1.0893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-0.63F, -0.313F, -0.0063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, -0.1745F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-0.63F, 1.7047F, 0.7883F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, -0.1745F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-0.63F, -0.0111F, 0.7153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, -0.1745F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-0.63F, -1.6448F, 0.7464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, -0.1745F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 53).mirror().addBox(0.4761F, 3.8844F, -3.8529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0843F, 0.0226F, 0.2085F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 64).mirror().addBox(-0.666F, 1.525F, -2.9423F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -0.0524F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.6085F, -4.043F, -0.0609F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.2F, -0.3752F, 0.0F, -0.0524F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.3787F, 0.0374F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 61).addBox(0.0F, -1.3787F, 0.0374F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 71).addBox(0.0F, -1.2787F, 2.0374F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 74).addBox(0.0F, -1.1787F, 4.0374F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 9).addBox(0.0F, -1.0787F, 6.0374F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5222F, 2.3163F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(75, 24).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3918F, 6.4856F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 8).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3525F, 4.1535F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 17).addBox(0.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7213F, 1.5374F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 76).addBox(0.0F, -1.2101F, 0.7376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 76).addBox(0.0F, -1.1101F, 2.7376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 77).addBox(0.0F, -1.01F, 4.7376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0676F, 7.1242F, 0.2863F, -0.302F, -0.0466F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, -0.1722F, 0.0011F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4601F, 6.6376F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4601F, -0.2624F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(77, 15).addBox(0.0F, -0.45F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 77).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4601F, 6.6376F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(68, 76).addBox(0.0F, 2.1F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 76).addBox(0.0F, 1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 12).addBox(0.0F, 0.7F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 75).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7686F, 1.5829F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5601F, 9.7876F, 0.0021F, -0.3051F, -0.0138F));

		PartDefinition cube_r60 = tail3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.014F, -0.0433F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0029F, 0.0061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.314F, 5.8567F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6352F, 10.848F, -0.5782F, 0.3435F, -0.0631F));

		PartDefinition cube_r62 = tail4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.15F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2582F, -0.1351F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail = tail4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3418F, 5.8649F, -0.2751F, 0.6973F, -0.0366F));

		PartDefinition cube_r63 = tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0357F, -0.0022F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0778F, -2.2837F, 0.0209F, 0.1786F, -0.1252F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -1.7F, -3.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.0264F, -3.8137F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -0.4511F, -0.041F, -0.0149F, -0.5582F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -0.4511F, -0.0235F, -0.0368F, -1.2126F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(39, 75).mirror().addBox(-2.939F, -2.1009F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -2.4511F, -0.0038F, 0.0872F, -1.7193F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -2.4511F, 0.047F, 0.0736F, -1.1066F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(44, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -2.4511F, 0.082F, 0.0298F, -0.4526F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -4.4511F, 0.1642F, 0.0594F, -0.2918F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -4.4511F, 0.0945F, 0.147F, -0.9442F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-3.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -4.4511F, -0.0077F, 0.1744F, -1.5627F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -6.4511F, 0.2467F, 0.0886F, -0.2944F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -6.4511F, 0.143F, 0.2201F, -0.9441F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-4.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1979F, -6.4511F, -0.0117F, 0.2615F, -1.5723F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 67).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -0.4511F, -0.0235F, 0.0368F, 1.2126F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -0.4511F, -0.041F, 0.0149F, 0.5582F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -2.4511F, 0.082F, -0.0298F, 0.4526F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(67, 46).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -2.4511F, 0.047F, -0.0736F, 1.1066F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(39, 75).addBox(1.939F, -2.1009F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -2.4511F, -0.0038F, -0.0872F, 1.7193F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 44).addBox(1.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -4.4511F, -0.0077F, -0.1744F, 1.5627F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 42).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -4.4511F, 0.0945F, -0.147F, 0.9442F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(34, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -4.4511F, 0.1642F, -0.0594F, 0.2918F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(74, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -6.4511F, 0.2467F, -0.0886F, 0.2944F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 40).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -6.4511F, 0.143F, -0.2201F, 0.9441F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(38, 6).addBox(1.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1979F, -6.4511F, -0.0117F, -0.2615F, 1.5723F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(31, 75).addBox(0.0F, -1.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 28).addBox(0.0F, -1.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 75).addBox(0.0F, -1.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 77).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.6465F, -6.9163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2965F, -6.9663F, 0.1232F, 0.1299F, 0.016F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-4.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0445F, -1.2917F, -0.0097F, 0.218F, -1.5457F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0445F, -1.2917F, 0.1186F, 0.1836F, -0.9228F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0445F, -1.2917F, 0.2054F, 0.0741F, -0.2716F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-4.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0445F, -3.2917F, -0.0138F, 0.3051F, -1.5642F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 52).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0445F, -3.2917F, 0.1678F, 0.2564F, -0.9295F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(75, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0445F, -3.2917F, 0.288F, 0.103F, -0.2818F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-3.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0445F, -5.2917F, -0.0227F, 0.4795F, -1.62F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-2.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0445F, -5.2917F, 0.2727F, 0.4F, -0.9479F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0445F, -5.2917F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(75, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0445F, -1.2917F, 0.2054F, -0.0741F, 0.2716F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(67, 54).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0445F, -1.2917F, 0.1186F, -0.1836F, 0.9228F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(59, 7).addBox(1.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0445F, -1.2917F, -0.0097F, -0.218F, 1.5457F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0445F, -3.2917F, 0.288F, -0.103F, 0.2818F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 52).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0445F, -3.2917F, 0.1678F, -0.2564F, 0.9295F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 5).addBox(1.939F, -2.1009F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0445F, -3.2917F, -0.0138F, -0.3051F, 1.5642F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(67, 50).addBox(1.939F, -2.1009F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0445F, -5.2917F, -0.0227F, -0.4795F, 1.62F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(67, 48).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0445F, -5.2917F, 0.2727F, -0.4F, 0.9479F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0445F, -5.2917F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.0514F, -3.8848F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4931F, -1.9069F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(23, 8).addBox(-1.0F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0194F, -1.4576F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(77, 32).addBox(0.0F, -0.8F, -5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 77).addBox(0.0F, -0.7F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 77).addBox(0.0F, -0.8F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1931F, -0.1569F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, -0.4F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4931F, -5.9069F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.0751F, 0.3177F, -0.9516F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(45, 29).addBox(-0.5F, -0.0081F, -0.0566F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0751F, 4.593F, -2.554F, -0.2187F, 0.3078F, -0.5882F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 25).addBox(-0.5F, -0.0081F, -0.4566F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0751F, 4.593F, -2.554F, -0.3285F, 0.4736F, -0.647F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(63, 29).addBox(0.0F, -0.0081F, -0.2566F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0751F, 4.593F, -2.554F, -0.349F, 1.2227F, -1.2312F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(58, 25).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5751F, 3.681F, -3.2259F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(58, 21).addBox(-1.225F, -0.5F, 0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0689F, 2.5097F, -5.3508F, 0.58F, -0.2579F, -0.4274F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 68).addBox(-0.5004F, -0.7569F, -0.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 68).addBox(-0.5004F, -0.2569F, -0.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.1473F, 1.9011F, -4.0858F, 0.5815F, 0.2103F, -0.2312F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(68, 6).addBox(-0.5004F, -0.1851F, -0.7789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1473F, 1.9011F, -4.0858F, 1.5414F, 0.2103F, -0.2312F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 17).addBox(-0.5004F, -0.8511F, -0.9879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1473F, 1.9011F, -4.0858F, -0.2475F, 0.2103F, -0.2312F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 50).addBox(-0.4205F, -0.5063F, -1.554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1262F, 1.0887F, -2.2516F, 0.4824F, 0.1151F, -0.2633F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(14, 50).addBox(-0.7F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4022F, -0.1541F, -0.3865F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.0751F, 0.3177F, -0.9516F));

		PartDefinition cube_r120 = bone4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(45, 29).mirror().addBox(-0.5F, -0.0081F, -0.0566F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0751F, 4.593F, -2.554F, -0.2187F, -0.3078F, 0.5882F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(49, 25).mirror().addBox(-0.5F, -0.0081F, -0.4566F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0751F, 4.593F, -2.554F, -0.3285F, -0.4736F, 0.647F));

		PartDefinition cube_r122 = bone4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-1.0F, -0.0081F, -0.2566F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0751F, 4.593F, -2.554F, -0.349F, -1.2227F, 1.2312F));

		PartDefinition cube_r123 = bone4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(0.0F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5751F, 3.681F, -3.2259F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r124 = bone4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-0.775F, -0.5F, 0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0689F, 2.5097F, -5.3508F, 0.58F, 0.2579F, 0.4274F));

		PartDefinition cube_r125 = bone4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(-0.4996F, -0.7569F, -0.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 68).mirror().addBox(-0.4996F, -0.2569F, -0.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.1473F, 1.9011F, -4.0858F, 0.5815F, -0.2103F, 0.2312F));

		PartDefinition cube_r126 = bone4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-0.4996F, -0.1851F, -0.7789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1473F, 1.9011F, -4.0858F, 1.5414F, -0.2103F, 0.2312F));

		PartDefinition cube_r127 = bone4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(58, 17).mirror().addBox(-0.4996F, -0.8511F, -0.9879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1473F, 1.9011F, -4.0858F, -0.2475F, -0.2103F, 0.2312F));

		PartDefinition cube_r128 = bone4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-0.5795F, -0.5063F, -1.554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1262F, 1.0887F, -2.2516F, 0.4824F, -0.1151F, 0.2633F));

		PartDefinition cube_r129 = bone4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 50).mirror().addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4022F, 0.1541F, 0.3865F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 3.4724F, -4.7165F, -0.8822F, 0.1605F, -0.9258F));

		PartDefinition cube_r130 = upperarmleft.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(17, 59).addBox(-0.5291F, -0.153F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.1664F, -0.4573F, 2.729F, -0.0361F, 0.0164F, -0.0416F));

		PartDefinition cube_r131 = upperarmleft.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(59, 13).addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1664F, 0.4677F, 2.154F, 0.2257F, 0.0164F, -0.0416F));

		PartDefinition cube_r132 = upperarmleft.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(59, 9).addBox(0.0F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6664F, -0.3949F, -0.0995F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r133 = upperarmleft.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 59).addBox(0.0F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.6664F, -0.3949F, -0.0995F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0118F, -0.0524F, 5.3065F, -1.3526F, -0.2618F, 0.0F));

		PartDefinition cube_r134 = lowerarmleft.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(24, 38).addBox(-0.5F, -0.35F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
				.texOffs(13, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1812F, 0.6531F, 0.175F, -0.0873F, 0.0F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(30, 30).addBox(-0.45F, -0.65F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1343F, 0.7614F, 4.1511F, 0.5236F, 0.1309F, 0.0F));

		PartDefinition fingerleft2 = handleft.addOrReplaceChild("fingerleft2", CubeListBuilder.create().texOffs(32, 50).addBox(-0.45F, -0.65F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.15F, -0.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fingerleft = handleft.addOrReplaceChild("fingerleft", CubeListBuilder.create().texOffs(35, 38).addBox(-0.45F, -0.65F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, -0.25F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarmright = chest.addOrReplaceChild("upperarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 3.4724F, -4.7165F, -1.078F, 0.0508F, 0.9126F));

		PartDefinition cube_r135 = upperarmright.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(41, 60).addBox(-0.4709F, -0.153F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.1664F, -0.4573F, 2.729F, -0.0361F, -0.0164F, 0.0416F));

		PartDefinition cube_r136 = upperarmright.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1664F, 0.4677F, 2.154F, 0.2257F, -0.0164F, 0.0416F));

		PartDefinition cube_r137 = upperarmright.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(60, 33).addBox(-1.0F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6664F, -0.3949F, -0.0995F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r138 = upperarmright.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(24, 59).addBox(-1.0F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.6664F, -0.3949F, -0.0995F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lowerarmright = upperarmright.addOrReplaceChild("lowerarmright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0118F, -0.0524F, 5.3065F, -1.5708F, 0.2618F, 0.0F));

		PartDefinition cube_r139 = lowerarmright.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(11, 44).addBox(-0.5F, -0.35F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1812F, 0.6531F, 0.175F, -0.0873F, 0.0F, 0.0F));

		PartDefinition handright = lowerarmright.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(34, 21).addBox(-0.55F, -0.65F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1343F, 0.7614F, 4.1511F, 0.5236F, -0.1309F, 0.0F));

		PartDefinition fingerright2 = handright.addOrReplaceChild("fingerright2", CubeListBuilder.create().texOffs(51, 34).addBox(-0.55F, -0.65F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 0.15F, -0.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fingerright = handright.addOrReplaceChild("fingerright", CubeListBuilder.create().texOffs(22, 44).addBox(-0.55F, -0.65F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -0.25F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3432F, -5.6069F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r140 = neck1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(0.0F, -0.8342F, -0.0519F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0537F, -1.8869F, -0.692F, -0.2909F, 0.1957F));

		PartDefinition cube_r141 = neck1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(67, 56).addBox(0.0F, -0.8342F, -0.0519F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0537F, -1.8869F, -0.692F, 0.2909F, -0.1957F));

		PartDefinition cube_r142 = neck1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(34, 77).addBox(0.0F, -0.5078F, 0.9699F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 39).addBox(-0.5F, -0.1078F, -0.0301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2794F, -2.5195F, -0.3578F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9294F, -2.4196F, -0.5595F, 0.2295F, 0.114F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(43, 77).addBox(0.0F, -0.5F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 77).addBox(0.0F, -0.5F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 44).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5588F, -4.1956F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(37, 77).mirror().addBox(-0.6215F, 0.0142F, -1.8695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 35).mirror().addBox(-0.0439F, -0.5901F, -0.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3756F, -0.7673F, -0.4302F, -0.2909F, 0.1957F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(37, 77).addBox(0.6215F, 0.0142F, -1.8695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 35).addBox(0.0439F, -0.5901F, -0.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3756F, -0.7673F, -0.4302F, 0.2909F, -0.1957F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2338F, -3.8956F, -0.5299F, 0.0807F, -0.1316F));

		PartDefinition cube_r146 = neck3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 77).addBox(0.0F, -0.5378F, 0.9792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 41).addBox(-0.5F, -0.1378F, -0.0208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3683F, -1.9595F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(0.0314F, -0.5246F, -0.4017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6532F, 0.5926F, -0.2242F, -0.2993F, -0.2909F, 0.1957F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(46, 77).addBox(-0.0314F, -0.5246F, -0.4017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6532F, 0.5926F, -0.2242F, -0.2993F, 0.2909F, -0.1957F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6671F, -1.8158F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r149 = neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-0.0071F, -0.6515F, -0.3496F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6532F, 0.6319F, 0.2092F, 0.2679F, -0.2909F, 0.1957F));

		PartDefinition cube_r150 = neck.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 77).addBox(0.0071F, -0.6515F, -0.3496F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6532F, 0.6319F, 0.2092F, 0.2679F, 0.2909F, -0.1957F));

		PartDefinition cube_r151 = neck.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(60, 45).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.025F))
				.texOffs(52, 77).addBox(0.0F, -0.8F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.025F, -0.8F, 0.8639F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 71).addBox(-0.5F, -0.2934F, -2.7459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1806F, -0.9157F, 1.2635F, 0.0344F, 0.0338F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 21).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3997F, -5.2906F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 18).addBox(-0.5F, -0.1771F, -0.7538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -0.2289F, -5.2653F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(20, 71).addBox(-1.0F, -0.9773F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8065F, -1.0459F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 12).addBox(-1.0F, -1.8695F, -1.6191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.8065F, -1.0459F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 9).addBox(-1.0F, -1.83F, -0.7874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8065F, -1.0459F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(65, 17).addBox(-1.0F, 0.0082F, 0.0053F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -0.0459F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -0.1414F, 0.0766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0434F, -0.9959F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(62, 64).addBox(-1.0F, 0.0086F, 0.0016F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0434F, -0.9959F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 70).addBox(1.1F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 0.2216F, 0.3634F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-1.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(70, 67).addBox(0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.8412F, -0.1904F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 64).addBox(-1.0F, -0.4F, 0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -1.3893F, -0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0565F, -0.1459F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.325F, -0.6501F, -1.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 29).mirror().addBox(-0.325F, -0.6501F, -1.8402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4913F, -0.8228F, 0.1309F, -0.2269F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-1.0F, -0.225F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(70, 26).addBox(0.35F, -0.225F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.175F, -0.0837F, 0.0022F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-0.2F, -0.076F, -2.1141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4913F, -0.8228F, -0.2051F, -0.2269F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-0.2F, -0.2951F, -1.6146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4913F, -0.8228F, -0.0436F, -0.2269F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.2F, -0.4043F, -1.0743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4913F, -0.8228F, 0.0873F, -0.2269F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-1.0F, -0.807F, -0.8039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(69, 64).addBox(0.35F, -0.807F, -0.8039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.175F, 0.7663F, -0.4728F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-1.0F, -0.8F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 69).addBox(0.35F, -0.8F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.175F, 0.5413F, 0.0522F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-0.8032F, -1.1426F, -2.8798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(35, 69).mirror().addBox(-0.8032F, -1.4176F, -2.8798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(30, 69).mirror().addBox(-0.8032F, -1.1426F, -2.5798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.3913F, -2.4728F, 0.4014F, -0.096F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1794F, 0.0571F, -3.5136F, 0.096F, -0.096F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1031F, 0.164F, -4.3063F, 0.2269F, -0.096F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.8032F, -0.8877F, -2.0934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.3913F, -2.4728F, 0.2618F, -0.096F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-0.8032F, -0.3441F, -1.6561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.3913F, -2.4728F, -0.1309F, -0.096F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.8032F, -0.7076F, -1.6529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.3913F, -2.4728F, 0.1309F, -0.096F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(48, 60).mirror().addBox(-0.2F, -0.8074F, -1.9553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 0.4913F, -0.8228F, -0.0087F, -0.2269F, 0.0F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.0F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(20, 68).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 69).addBox(0.35F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(20, 68).addBox(0.35F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.175F, -0.1087F, 0.0272F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 70).addBox(-0.675F, -0.6501F, -1.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 29).addBox(-0.675F, -0.6501F, -1.8402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.975F, 0.4913F, -0.8228F, 0.1309F, 0.2269F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(70, 23).addBox(-0.8F, -0.076F, -2.1141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4913F, -0.8228F, -0.2051F, 0.2269F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(70, 20).addBox(-0.8F, -0.2951F, -1.6146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.975F, 0.4913F, -0.8228F, -0.0436F, 0.2269F, 0.0F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(10, 70).addBox(-0.8F, -0.4043F, -1.0743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.975F, 0.4913F, -0.8228F, 0.0873F, 0.2269F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(50, 69).addBox(-0.1968F, -1.1426F, -2.8798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(35, 69).addBox(-0.1968F, -1.4176F, -2.8798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(30, 69).addBox(-0.1968F, -1.1426F, -2.5798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.025F, 0.3913F, -2.4728F, 0.4014F, 0.096F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1794F, 0.0571F, -3.5136F, 0.096F, 0.096F, 0.0F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 69).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1031F, 0.164F, -4.3063F, 0.2269F, 0.096F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(25, 69).addBox(-0.1968F, -0.8877F, -2.0934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.025F, 0.3913F, -2.4728F, 0.2618F, 0.096F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(31, 61).addBox(-0.1968F, -0.3441F, -1.6561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.025F, 0.3913F, -2.4728F, -0.1309F, 0.096F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(61, 0).addBox(-0.1968F, -0.7076F, -1.6529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.025F, 0.3913F, -2.4728F, 0.1309F, 0.096F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(48, 60).addBox(-0.8F, -0.8074F, -1.9553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.975F, 0.4913F, -0.8228F, -0.0087F, 0.2269F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(74, 38).addBox(-0.255F, -1.0594F, 1.8984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offset(0.575F, 0.7211F, -2.9153F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 75).addBox(-0.855F, -1.0216F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 62).addBox(-0.73F, -1.0216F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 1.6668F, 0.2487F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(60, 74).addBox(-0.78F, -2.0369F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.4974F, 0.2487F, 0.0F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(74, 53).addBox(-0.78F, -1.3286F, -1.7636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, -0.1571F, 0.2487F, 0.0F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 50).addBox(-0.78F, -1.6785F, -0.9083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.6414F, 0.2487F, 0.0F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 47).addBox(-0.78F, -1.285F, 0.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 1.5882F, 0.2487F, 0.0F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 44).addBox(-0.78F, -0.4369F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 73).addBox(-0.78F, -0.5619F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 1.9286F, 0.2487F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(74, 41).addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.245F, -0.3396F, 2.4694F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 74).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.245F, -0.9396F, 2.4694F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 74).addBox(-0.78F, -1.9512F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.1745F, 0.2487F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(5, 74).addBox(-0.78F, -1.6911F, 0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.6981F, 0.2487F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(70, 73).addBox(-0.78F, -1.4698F, -0.6709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F))
				.texOffs(73, 6).addBox(-1.0F, -1.1F, -1.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.0F, 0.2487F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -0.9773F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, -0.1309F, 0.2487F, 0.0F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(73, 3).addBox(-1.0F, -1.8695F, -1.6691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.1571F, 0.2487F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -1.83F, -0.7874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.45F, 0.0854F, 1.8444F, 0.0873F, 0.2487F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 59).addBox(-0.6355F, 1.4654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 56).addBox(-0.6355F, 1.1654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 72).addBox(-0.6355F, 0.8654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, -1.2497F, 0.1085F, -0.0208F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(55, 72).addBox(-0.5855F, 0.6547F, -0.9378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 72).addBox(-0.7855F, 0.1547F, -1.0378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, -1.5988F, 0.1085F, -0.0208F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(50, 72).addBox(-0.7855F, -0.4165F, -1.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, -1.3806F, 0.1085F, -0.0208F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(72, 35).addBox(-0.7857F, -1.466F, -0.3709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, 0.7138F, 0.1085F, -0.0208F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 72).addBox(-0.7855F, -1.3512F, -0.9002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, -0.1589F, 0.1085F, -0.0208F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(67, 60).addBox(-0.8555F, -1.0294F, -0.1324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, 1.5996F, 0.1085F, -0.0208F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 32).addBox(-0.8555F, -0.8296F, -0.3744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.225F, 1.6388F, 0.1085F, -0.0208F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(30, 72).addBox(-0.8555F, -1.6296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(72, 15).addBox(-0.8555F, -2.4296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 72).addBox(-0.8555F, -3.2296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.225F, 1.5516F, 0.1085F, -0.0208F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(25, 72).addBox(0.05F, -0.1664F, 0.1266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.575F, -1.7646F, 1.9194F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(60, 67).addBox(-0.8555F, -2.7296F, -0.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, 1.5516F, 0.1085F, -0.0208F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 71).addBox(-0.8555F, -1.9156F, -2.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, 0.3429F, 0.1085F, -0.0208F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(55, 61).addBox(-0.8555F, -1.6776F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.05F, 0.0F, 0.225F, 0.1858F, 0.1085F, -0.0208F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(-0.745F, -1.0594F, 1.8984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offset(-0.575F, 0.7211F, -2.9153F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.145F, -1.0216F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(74, 62).mirror().addBox(-0.27F, -1.0216F, 0.5313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 1.6668F, -0.2487F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.22F, -2.0369F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.4974F, -0.2487F, 0.0F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.22F, -1.3286F, -1.7636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, -0.1571F, -0.2487F, 0.0F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-0.22F, -1.6785F, -0.9083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.6414F, -0.2487F, 0.0F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.22F, -1.285F, 0.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 1.5882F, -0.2487F, 0.0F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-0.22F, -0.4369F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 73).mirror().addBox(-0.22F, -0.5619F, 0.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 1.9286F, -0.2487F, 0.0F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.245F, -0.3396F, 2.4694F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.245F, -0.9396F, 2.4694F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.22F, -1.9512F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.1745F, -0.2487F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.22F, -1.6911F, 0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.6981F, -0.2487F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.22F, -1.4698F, -0.6709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false)
				.texOffs(73, 6).mirror().addBox(0.0F, -1.1F, -1.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.0F, -0.2487F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(0.0F, -0.9773F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, -0.1309F, -0.2487F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(73, 3).mirror().addBox(0.0F, -1.8695F, -1.6691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.1571F, -0.2487F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(0.0F, -1.83F, -0.7874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.0854F, 1.8444F, 0.0873F, -0.2487F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-0.3645F, 1.4654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 56).mirror().addBox(-0.3645F, 1.1654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 72).mirror().addBox(-0.3645F, 0.8654F, -1.9919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, -1.2497F, -0.1085F, 0.0208F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(55, 72).mirror().addBox(-0.4145F, 0.6547F, -0.9378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 72).mirror().addBox(-0.2145F, 0.1547F, -1.0378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, -1.5988F, -0.1085F, 0.0208F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-0.2145F, -0.4165F, -1.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, -1.3806F, -0.1085F, 0.0208F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-0.2143F, -1.466F, -0.3709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, 0.7138F, -0.1085F, 0.0208F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.2145F, -1.3512F, -0.9002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, -0.1589F, -0.1085F, 0.0208F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.1445F, -1.0294F, -0.1324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, 1.5996F, -0.1085F, 0.0208F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.1445F, -0.8296F, -0.3744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.225F, 1.6388F, -0.1085F, 0.0208F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-0.1445F, -1.6296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(72, 15).mirror().addBox(-0.1445F, -2.4296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(-0.1445F, -3.2296F, -0.4744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.225F, 1.5516F, -0.1085F, 0.0208F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-1.05F, -0.1664F, 0.1266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.575F, -1.7646F, 1.9194F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-0.1445F, -2.7296F, -0.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, 1.5516F, -0.1085F, 0.0208F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.1445F, -1.9156F, -2.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, 0.3429F, -0.1085F, 0.0208F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.1445F, -1.6776F, -1.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.225F, 0.1858F, -0.1085F, 0.0208F));

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