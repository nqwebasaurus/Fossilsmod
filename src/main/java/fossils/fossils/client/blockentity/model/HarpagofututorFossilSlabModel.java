package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HarpagofututorFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart immobile;
	private final ModelPart jaw;
	private final ModelPart immobile2;
	private final ModelPart immobile6;
	private final ModelPart immobile7;
	private final ModelPart immobile8;
	private final ModelPart leftPectoral;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart leftPelvic;
	private final ModelPart head2;
	private final ModelPart immobile3;
	private final ModelPart jaw2;
	private final ModelPart immobile4;
	private final ModelPart leftPectoral2;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart leftPelvic2;

	public HarpagofututorFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.immobile = this.head.getChild("immobile");
		this.jaw = this.immobile.getChild("jaw");
		this.immobile2 = this.immobile.getChild("immobile2");
		this.immobile6 = this.immobile.getChild("immobile6");
		this.immobile7 = this.immobile6.getChild("immobile7");
		this.immobile8 = this.immobile6.getChild("immobile8");
		this.leftPectoral = this.head.getChild("leftPectoral");
		this.body = this.head.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.leftPelvic = this.body2.getChild("leftPelvic");
		this.head2 = this.fossil.getChild("head2");
		this.immobile3 = this.head2.getChild("immobile3");
		this.jaw2 = this.immobile3.getChild("jaw2");
		this.immobile4 = this.immobile3.getChild("immobile4");
		this.leftPectoral2 = this.head2.getChild("leftPectoral2");
		this.body6 = this.head2.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.leftPelvic2 = this.body7.getChild("leftPelvic2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 66).addBox(0.1619F, -2.0F, -0.1123F, 10.0F, 2.0F, 27.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-16.7F, 0.0F, -9.6F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -2.0F, 0.0F, 23.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -23.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -43.3F, 20.0F, 2.0F, 36.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-16.0F, 0.0F, 24.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -14.0F, 0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 66).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.0641F, 0.5487F, -0.2225F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 69).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition immobile = head.addOrReplaceChild("immobile", CubeListBuilder.create(), PartPose.offset(0.0F, -0.325F, -1.1F));

		PartDefinition cube_r6 = immobile.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 20).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.9538F, -5.2396F, -0.4102F, 0.0F, -3.1416F));

		PartDefinition cube_r7 = immobile.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.5813F, -1.7089F, -0.4102F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = immobile.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 17).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4554F, -4.0933F, -0.4102F, 0.0F, -3.1416F));

		PartDefinition cube_r9 = immobile.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4F, 0.15F, -2.3F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = immobile.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition jaw = immobile.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.975F, -0.95F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r11 = jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 28).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.85F, -3.3F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = jaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.35F, -1.3F, 0.0F, 0.0F, -3.1416F));

		PartDefinition immobile2 = immobile.addOrReplaceChild("immobile2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r13 = immobile2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 10).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2692F, -1.8461F, 0.2487F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = immobile2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 29).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5F, -0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition immobile6 = immobile.addOrReplaceChild("immobile6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1F, -4.5F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r15 = immobile6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 28).addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition immobile7 = immobile6.addOrReplaceChild("immobile7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.3454F, 0.0F, 0.0F));

		PartDefinition cube_r16 = immobile7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(13, 17).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -3.15F, 0.25F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = immobile7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -2.25F, 0.25F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = immobile7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(27, 20).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -2.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition immobile8 = immobile6.addOrReplaceChild("immobile8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.3755F, 0.0F, 0.0F));

		PartDefinition cube_r19 = immobile8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -5.2F, 0.75F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r20 = immobile8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -4.3F, 0.75F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r21 = immobile8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -3.35F, 0.75F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r22 = immobile8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(4, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -2.425F, 0.75F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r23 = immobile8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 17).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -1.5F, 0.75F, 0.7854F, 0.0F, 3.1416F));

		PartDefinition cube_r24 = immobile8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(22, 0).addBox(-0.1F, -3.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -3.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition leftPectoral = head.addOrReplaceChild("leftPectoral", CubeListBuilder.create(), PartPose.offsetAndRotation(0.45F, 0.3F, 1.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftPectoral.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 3).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -1.5F, -3.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r26 = leftPectoral.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(18, 20).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body = head.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(48, 66).addBox(0.1F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.8195F, 2.5431F, -0.1265F, 0.0F, -3.1416F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, -0.5F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 10).addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 4.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 20).addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.826F, 3.9744F, 0.0436F, 0.0F, -3.1416F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -4.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 4.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 42).addBox(-0.1F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4336F, 3.5255F, 0.1527F, 0.0F, -3.1416F));

		PartDefinition cube_r33 = body3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2848F, 3.4865F, 0.2269F, 0.0F, -3.1416F));

		PartDefinition cube_r34 = body3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -1.5F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.5F, 3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 7.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(9, 6).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8835F, 3.2514F, 0.2574F, 0.0F, -3.1416F));

		PartDefinition cube_r36 = body4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.2363F, 2.8837F, 0.1876F, 0.0F, -3.1416F));

		PartDefinition cube_r37 = body4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 17).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.0F, 3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 7.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(3, 19).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, 8.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r39 = body5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(27, 14).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 7.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r40 = body5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 4.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r41 = body5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(9, 52).addBox(-0.1F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7671F, 3.089F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition cube_r42 = body5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0228F, 2.4645F, 0.1484F, 0.0F, -3.1416F));

		PartDefinition cube_r43 = body5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(11, 66).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5F, 2.9F, 0.0F, 0.0F, -3.1416F));

		PartDefinition leftPelvic = body2.addOrReplaceChild("leftPelvic", CubeListBuilder.create().texOffs(18, 10).addBox(-0.75F, 0.025F, 2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.0F, 6.0F, 0.0F, 0.2618F, 1.5708F));

		PartDefinition cube_r44 = leftPelvic.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head2 = fossil.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(66, 69).addBox(0.4F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -2.6F, 6.0F, -2.6616F, 0.0F, 1.5708F));

		PartDefinition cube_r45 = head2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(59, 66).addBox(0.2F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.2225F, 0.0F, 0.0F));

		PartDefinition immobile3 = head2.addOrReplaceChild("immobile3", CubeListBuilder.create().texOffs(0, 25).addBox(0.3F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.1F, -0.35F, -2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offset(0.0F, -0.325F, -1.1F));

		PartDefinition cube_r46 = immobile3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(23, 20).addBox(0.3F, 0.0F, -4.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(0.2F, 0.0F, -1.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 17).addBox(0.1F, 0.0F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.4102F, 0.0F, 0.0F));

		PartDefinition jaw2 = immobile3.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(9, 0).addBox(0.5F, -0.65F, -2.8F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 28).addBox(0.5F, 0.35F, -4.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.975F, -0.95F, -0.1309F, 0.0F, 0.0F));

		PartDefinition immobile4 = immobile3.addOrReplaceChild("immobile4", CubeListBuilder.create().texOffs(4, 29).addBox(0.2F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r47 = immobile4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 10).addBox(0.4F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -0.2487F, 0.0F, 0.0F));

		PartDefinition leftPectoral2 = head2.addOrReplaceChild("leftPectoral2", CubeListBuilder.create().texOffs(18, 20).addBox(-0.1F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 3).addBox(0.0F, -1.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.3F, 1.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition body6 = head2.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 66).addBox(0.4F, -2.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 70).addBox(0.9F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0F, 0.0F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(1, 67).addBox(0.3F, 0.0F, -4.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.0F, 5.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, 0.0F, 0.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body7.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -0.2F, -7.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(3, 28).addBox(0.2F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftPelvic2 = body7.addOrReplaceChild("leftPelvic2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 3.0F, 6.0F, 0.0F, 0.2618F, 1.5708F));

		PartDefinition cube_r51 = leftPelvic2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4142F, 0.0F, -0.7854F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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