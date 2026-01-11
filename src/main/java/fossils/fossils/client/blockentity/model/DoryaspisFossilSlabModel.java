package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DoryaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Doryaspis;
	private final ModelPart Head;
	private final ModelPart BrachialPlateL_NOANIMATION;
	private final ModelPart BrachialPlateL_NOANIMATION2;
	private final ModelPart Head2;
	private final ModelPart BrachialPlateL_NOANIMATION3;
	private final ModelPart BrachialPlateL_NOANIMATION4;
	private final ModelPart Head3;
	private final ModelPart BrachialPlateL_NOANIMATION5;
	private final ModelPart BrachialPlateL_NOANIMATION6;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Doryaspis2;
	private final ModelPart Head4;
	private final ModelPart BrachialPlateL_NOANIMATION7;
	private final ModelPart BrachialPlateL_NOANIMATION8;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public DoryaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Doryaspis = this.fossil.getChild("Doryaspis");
		this.Head = this.Doryaspis.getChild("Head");
		this.BrachialPlateL_NOANIMATION = this.Head.getChild("BrachialPlateL_NOANIMATION");
		this.BrachialPlateL_NOANIMATION2 = this.Head.getChild("BrachialPlateL_NOANIMATION2");
		this.Head2 = this.Doryaspis.getChild("Head2");
		this.BrachialPlateL_NOANIMATION3 = this.Head2.getChild("BrachialPlateL_NOANIMATION3");
		this.BrachialPlateL_NOANIMATION4 = this.Head2.getChild("BrachialPlateL_NOANIMATION4");
		this.Head3 = this.Doryaspis.getChild("Head3");
		this.BrachialPlateL_NOANIMATION5 = this.Head3.getChild("BrachialPlateL_NOANIMATION5");
		this.BrachialPlateL_NOANIMATION6 = this.Head3.getChild("BrachialPlateL_NOANIMATION6");
		this.Tail1 = this.Doryaspis.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Doryaspis2 = this.fossil.getChild("Doryaspis2");
		this.Head4 = this.Doryaspis2.getChild("Head4");
		this.BrachialPlateL_NOANIMATION7 = this.Head4.getChild("BrachialPlateL_NOANIMATION7");
		this.BrachialPlateL_NOANIMATION8 = this.Head4.getChild("BrachialPlateL_NOANIMATION8");
		this.Tail3 = this.Doryaspis2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 32).addBox(-26.0F, -2.0F, -21.0F, 13.0F, 2.0F, 31.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 0).addBox(-13.0F, -2.0F, -12.0F, 33.0F, 2.0F, 29.0F, new CubeDeformation(0.003F))
				.texOffs(58, 32).addBox(20.0F, -2.0F, -8.0F, 7.0F, 2.0F, 25.0F, new CubeDeformation(-0.003F))
				.texOffs(41, 77).addBox(4.0F, -2.0F, -20.0F, 14.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 66).addBox(-14.0F, -2.0F, 0.0F, 14.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -20.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 77).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, 0.0F, -20.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -2.0F, -9.0F, 15.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.0F, 0.0F, 10.0F, 0.0F, -0.4974F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 78).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 2.0F, 11.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-13.0F, 0.0F, -21.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition Doryaspis = fossil.addOrReplaceChild("Doryaspis", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, 0.2F, -1.4F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(16, 43).addBox(-0.5F, -0.05F, -1.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-10.6F, -2.5F, -2.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Head = Doryaspis.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 10).addBox(-0.5F, -1.9F, -14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-1.5F, -2.0F, -9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.1102F, 0.0248F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 51).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.0F, -0.4119F, 0.0F, 0.0F));

		PartDefinition BrachialPlateL_NOANIMATION = Head.addOrReplaceChild("BrachialPlateL_NOANIMATION", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -1.35F, 0.0F, 0.0F, 0.0F, -0.2007F));

		PartDefinition cube_r7 = BrachialPlateL_NOANIMATION.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 32).addBox(-0.05F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.3403F));

		PartDefinition cube_r8 = BrachialPlateL_NOANIMATION.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 56).addBox(-0.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7F, -0.5F, -1.5F, 0.0F, 0.0F, 0.2025F));

		PartDefinition cube_r9 = BrachialPlateL_NOANIMATION.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -2.0F, 0.0F, -0.4102F, 0.2025F));

		PartDefinition BrachialPlateL_NOANIMATION2 = Head.addOrReplaceChild("BrachialPlateL_NOANIMATION2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.35F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r10 = BrachialPlateL_NOANIMATION2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 57).addBox(-2.95F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 0.0F, 0.0F, 0.0F, -0.0873F, -0.3403F));

		PartDefinition cube_r11 = BrachialPlateL_NOANIMATION2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 32).addBox(-2.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -1.5F, 0.0F, 0.0F, -0.2025F));

		PartDefinition cube_r12 = BrachialPlateL_NOANIMATION2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 56).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -2.0F, 0.0F, 0.4102F, -0.2025F));

		PartDefinition Head2 = Doryaspis.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(14, 10).addBox(-0.5F, -1.9F, -14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-1.5F, -2.0F, -9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.6F, 2.1F, 3.8F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r13 = Head2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.1102F, 0.0248F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Head2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 51).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.0F, -0.4119F, 0.0F, 0.0F));

		PartDefinition BrachialPlateL_NOANIMATION3 = Head2.addOrReplaceChild("BrachialPlateL_NOANIMATION3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -1.35F, 0.0F, 0.0F, 0.0F, -0.2007F));

		PartDefinition cube_r15 = BrachialPlateL_NOANIMATION3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 32).addBox(-0.05F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.3403F));

		PartDefinition cube_r16 = BrachialPlateL_NOANIMATION3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 56).addBox(-0.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7F, -0.5F, -1.5F, 0.0F, 0.0F, 0.2025F));

		PartDefinition cube_r17 = BrachialPlateL_NOANIMATION3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -2.0F, 0.0F, -0.4102F, 0.2025F));

		PartDefinition BrachialPlateL_NOANIMATION4 = Head2.addOrReplaceChild("BrachialPlateL_NOANIMATION4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.35F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r18 = BrachialPlateL_NOANIMATION4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 57).addBox(-2.95F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 0.0F, 0.0F, 0.0F, -0.0873F, -0.3403F));

		PartDefinition cube_r19 = BrachialPlateL_NOANIMATION4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 32).addBox(-2.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -1.5F, 0.0F, 0.0F, -0.2025F));

		PartDefinition cube_r20 = BrachialPlateL_NOANIMATION4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 56).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -2.0F, 0.0F, 0.4102F, -0.2025F));

		PartDefinition Head3 = Doryaspis.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(14, 10).addBox(-0.5F, -1.9F, -14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-1.5F, -2.0F, -9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.9421F, 2.1F, 7.6802F, 0.1082F, -0.2535F, -0.1027F));

		PartDefinition cube_r21 = Head3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.1102F, 0.0248F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Head3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 51).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.0F, -0.4119F, 0.0F, 0.0F));

		PartDefinition BrachialPlateL_NOANIMATION5 = Head3.addOrReplaceChild("BrachialPlateL_NOANIMATION5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -1.35F, 0.0F, 0.0F, 0.0F, -0.2007F));

		PartDefinition cube_r23 = BrachialPlateL_NOANIMATION5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 32).addBox(-0.05F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.3403F));

		PartDefinition cube_r24 = BrachialPlateL_NOANIMATION5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 56).addBox(-0.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7F, -0.5F, -1.5F, 0.0F, 0.0F, 0.2025F));

		PartDefinition cube_r25 = BrachialPlateL_NOANIMATION5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -2.0F, 0.0F, -0.4102F, 0.2025F));

		PartDefinition BrachialPlateL_NOANIMATION6 = Head3.addOrReplaceChild("BrachialPlateL_NOANIMATION6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.35F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r26 = BrachialPlateL_NOANIMATION6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 57).addBox(-2.95F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 0.0F, 0.0F, 0.0F, -0.0873F, -0.3403F));

		PartDefinition cube_r27 = BrachialPlateL_NOANIMATION6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 32).addBox(-2.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -1.5F, 0.0F, 0.0F, -0.2025F));

		PartDefinition cube_r28 = BrachialPlateL_NOANIMATION6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 56).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -2.0F, 0.0F, 0.4102F, -0.2025F));

		PartDefinition Tail1 = Doryaspis.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(13, 32).addBox(-1.0F, 0.4F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(7, 41).addBox(-0.5F, 0.15F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8F, 4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r29 = Tail2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 32).addBox(-3.4F, -3.2671F, 13.1307F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2329F, 3.0F, -9.1307F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Doryaspis2 = fossil.addOrReplaceChild("Doryaspis2", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, 0.2F, -1.4F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(16, 43).addBox(-0.5F, -0.05F, -1.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(13.4F, -2.5F, -13.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition Head4 = Doryaspis2.addOrReplaceChild("Head4", CubeListBuilder.create().texOffs(14, 10).addBox(-0.5F, -1.9F, -14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-1.5F, -2.0F, -9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -0.5F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r30 = Head4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.1102F, 0.0248F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Head4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 51).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.0F, -0.4119F, 0.0F, 0.0F));

		PartDefinition BrachialPlateL_NOANIMATION7 = Head4.addOrReplaceChild("BrachialPlateL_NOANIMATION7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, -1.35F, 0.0F, 0.0F, 0.0F, -0.2007F));

		PartDefinition cube_r32 = BrachialPlateL_NOANIMATION7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 32).addBox(-0.05F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.3403F));

		PartDefinition cube_r33 = BrachialPlateL_NOANIMATION7.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 56).addBox(-0.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7F, -0.5F, -1.5F, 0.0F, 0.0F, 0.2025F));

		PartDefinition cube_r34 = BrachialPlateL_NOANIMATION7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -2.0F, 0.0F, -0.4102F, 0.2025F));

		PartDefinition BrachialPlateL_NOANIMATION8 = Head4.addOrReplaceChild("BrachialPlateL_NOANIMATION8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -1.35F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r35 = BrachialPlateL_NOANIMATION8.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 57).addBox(-2.95F, 0.02F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 0.0F, 0.0F, 0.0F, -0.0873F, -0.3403F));

		PartDefinition cube_r36 = BrachialPlateL_NOANIMATION8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 32).addBox(-2.5F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -1.5F, 0.0F, 0.0F, -0.2025F));

		PartDefinition cube_r37 = BrachialPlateL_NOANIMATION8.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(21, 56).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.5F, -2.0F, 0.0F, 0.4102F, -0.2025F));

		PartDefinition Tail3 = Doryaspis2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(13, 32).addBox(-1.0F, 0.4F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(7, 41).addBox(-0.5F, 0.15F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.8F, 4.1F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r38 = Tail4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 32).addBox(-3.4F, -3.2671F, 13.1307F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2329F, 3.0F, -9.1307F, 0.0F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}