package fossils.fossils.client.blockentity.model.acanthostomatops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcanthostomatopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legspineL2;
	private final ModelPart legL6;
	private final ModelPart legL10;
	private final ModelPart legL11;
	private final ModelPart legspineL4;
	private final ModelPart legL12;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legspineL;
	private final ModelPart legL3;
	private final ModelPart legL7;
	private final ModelPart legL8;
	private final ModelPart legspineL3;
	private final ModelPart legL9;

	public AcanthostomatopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.head = this.bone.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftHead = this.upperjaw.getChild("leftHead");
		this.rightHead = this.upperjaw.getChild("rightHead");
		this.body = this.bone.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.tail = this.body2.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.legL4 = this.body2.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legspineL2 = this.legL5.getChild("legspineL2");
		this.legL6 = this.legspineL2.getChild("legL6");
		this.legL10 = this.body2.getChild("legL10");
		this.legL11 = this.legL10.getChild("legL11");
		this.legspineL4 = this.legL11.getChild("legspineL4");
		this.legL12 = this.legspineL4.getChild("legL12");
		this.legL = this.body.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legspineL = this.legL2.getChild("legspineL");
		this.legL3 = this.legspineL.getChild("legL3");
		this.legL7 = this.body.getChild("legL7");
		this.legL8 = this.legL7.getChild("legL8");
		this.legspineL3 = this.legL8.getChild("legspineL3");
		this.legL9 = this.legspineL3.getChild("legL9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -3.125F, -3.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(39, 33).addBox(-0.5F, -0.3F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.7F, -0.281F, 0.2879F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -0.4F, -0.054F, 0.3892F, -0.1415F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.4F, -0.054F, -0.3892F, 0.1415F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(42, 15).addBox(-1.0F, 0.0F, -9.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.65F, -1.35F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = lowerjaw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 29).mirror().addBox(-0.097F, -1.025F, 0.0394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 1.0F, -2.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r4 = lowerjaw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 33).mirror().addBox(0.0227F, -1.025F, 0.0734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.0F, -4.9F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r5 = lowerjaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(0.1F, -1.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0F, -8.8F, 0.0F, -1.0444F, 0.0F));

		PartDefinition cube_r6 = lowerjaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(0.0095F, -1.025F, 0.0395F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.0F, -8.2F, 0.0F, -0.5847F, 0.0F));

		PartDefinition cube_r7 = lowerjaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 39).addBox(-1.1F, -1.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, -8.8F, 0.0F, 1.0444F, 0.0F));

		PartDefinition cube_r8 = lowerjaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 29).addBox(-0.903F, -1.025F, 0.0394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.4F, 1.0F, -2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r9 = lowerjaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 33).addBox(-1.0227F, -1.025F, 0.0734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.0F, -4.9F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r10 = lowerjaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0095F, -1.025F, 0.0395F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3F, 1.0F, -8.2F, 0.0F, 0.5847F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -3.15F, 0.0405F, 0.0F, 0.0F));

		PartDefinition cube_r11 = upperjaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 4).mirror().addBox(-1.4F, -0.3869F, -0.0002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.3908F, 0.8596F, -0.0357F, 0.3483F, -0.1762F));

		PartDefinition cube_r12 = upperjaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(14, 4).addBox(-0.6F, -0.3869F, -0.0002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3908F, 0.8596F, -0.0357F, -0.3483F, 0.1762F));

		PartDefinition cube_r13 = upperjaw.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 27).addBox(-0.7F, -0.383F, -0.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.09F, -0.497F, -6.9457F, 0.028F, -0.3664F, -0.01F));

		PartDefinition cube_r14 = upperjaw.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 35).addBox(-0.5F, -0.383F, -0.3003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.09F, -0.497F, -6.9457F, 0.028F, 0.3664F, 0.01F));

		PartDefinition cube_r15 = upperjaw.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 0).addBox(-0.59F, -0.34F, -7.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(-0.99F, -0.125F, -8.2F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.75F, 0.75F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftHead = upperjaw.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.65F, -4.45F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r16 = leftHead.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 0).addBox(0.2265F, -0.0806F, 0.8614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 3).addBox(0.2265F, -0.0806F, -1.6386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 14).addBox(1.2265F, -0.0806F, -2.3886F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(29, 16).addBox(3.2265F, -0.0806F, -2.3886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.021F, 0.6082F, 0.1604F));

		PartDefinition cube_r17 = leftHead.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 42).addBox(1.8549F, -0.2288F, 5.0664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, -0.0569F, 0.5709F, 0.1077F));

		PartDefinition cube_r18 = leftHead.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3293F, 1.2616F, 6.4238F, -0.048F, -0.0828F, 0.1424F));

		PartDefinition cube_r19 = leftHead.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 24).addBox(-0.1277F, -0.5121F, -2.9029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3161F, 1.014F, 6.2673F, 0.0228F, 0.7129F, 0.1633F));

		PartDefinition cube_r20 = leftHead.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 15).addBox(3.4267F, -0.0806F, 1.6492F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 20).addBox(4.4267F, -0.0806F, 2.6492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0173F, -0.0026F, 0.1483F));

		PartDefinition cube_r21 = leftHead.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 9).addBox(-0.5042F, -0.0806F, 0.4289F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0184F, 0.3464F, 0.1546F));

		PartDefinition cube_r22 = leftHead.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 33).addBox(2.8729F, -0.0806F, -1.7975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 39).addBox(3.8729F, -0.0806F, -2.3975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0344F, 1.0444F, 0.1781F));

		PartDefinition cube_r23 = leftHead.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 22).addBox(-1.0F, -0.6F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 35).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0222F, 0.5484F, 2.9379F, 0.025F, -0.012F, 0.148F));

		PartDefinition rightHead = upperjaw.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.65F, -4.45F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r24 = rightHead.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-1.2265F, -0.0806F, 0.8614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 3).mirror().addBox(-2.2265F, -0.0806F, -1.6386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 14).mirror().addBox(-3.2265F, -0.0806F, -2.3886F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(29, 16).mirror().addBox(-4.2265F, -0.0806F, -2.3886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.021F, -0.6082F, -0.1604F));

		PartDefinition cube_r25 = rightHead.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(-3.8549F, -0.2288F, 5.0664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, -0.0569F, -0.5709F, -0.1077F));

		PartDefinition cube_r26 = rightHead.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3293F, 1.2616F, 6.4238F, -0.048F, 0.0828F, -0.1424F));

		PartDefinition cube_r27 = rightHead.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 24).mirror().addBox(-0.8723F, -0.5121F, -2.9029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3161F, 1.014F, 6.2673F, 0.0228F, -0.7129F, -0.1633F));

		PartDefinition cube_r28 = rightHead.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 15).mirror().addBox(-5.4267F, -0.0806F, 1.6492F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 20).mirror().addBox(-5.4267F, -0.0806F, 2.6492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0173F, 0.0026F, -0.1483F));

		PartDefinition cube_r29 = rightHead.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 9).mirror().addBox(-4.4958F, -0.0806F, 0.4289F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0184F, -0.3464F, -0.1546F));

		PartDefinition cube_r30 = rightHead.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 33).mirror().addBox(-3.8729F, -0.0806F, -1.7975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 39).mirror().addBox(-4.8729F, -0.0806F, -2.3975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.0344F, -1.0444F, -0.1781F));

		PartDefinition cube_r31 = rightHead.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 22).mirror().addBox(0.0F, -0.6F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 35).mirror().addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0222F, 0.5484F, 2.9379F, 0.025F, 0.012F, -0.148F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 11).addBox(-0.49F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, 0.8F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(0.0025F, -0.3199F, -0.4484F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.8226F, 0.0499F, 1.1144F, 0.1719F, -0.0306F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.3F, 1.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 24).addBox(-1.1F, 1.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0472F, -0.0234F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 39).mirror().addBox(-1.2F, -0.6327F, -3.3381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 20).mirror().addBox(-1.2F, 0.419F, -2.574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 39).addBox(3.8F, -0.6327F, -3.3381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 20).addBox(3.8F, 0.419F, -2.574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.7481F, 2.903F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 0).addBox(-3.0025F, -0.3199F, -0.4484F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.8226F, 0.0499F, 1.1144F, -0.1719F, 0.0306F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 0.1F, 5.5F, -0.1946F, 0.3931F, -0.4752F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 0.1F, 3.5F, -0.1582F, 0.4084F, -0.3819F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 0.1F, 1.5F, -0.1582F, 0.4084F, -0.3819F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1F, 5.5F, -0.1946F, -0.3931F, 0.4752F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(43, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1F, 3.5F, -0.1582F, -0.4084F, 0.3819F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(29, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1F, 1.5F, -0.1582F, -0.4084F, 0.3819F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(10, 13).addBox(-0.5347F, -0.19F, -0.197F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0347F, -0.2F, 6.897F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition Basin_r1 = body2.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(10, 22).addBox(-1.0F, 0.0041F, 1.8107F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5347F, 0.6724F, 2.1639F, -0.1332F, -0.012F, -0.0074F));

		PartDefinition Basin_r2 = body2.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(43, 18).mirror().addBox(0.0F, 0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5759F, -0.4477F, 5.7114F, -0.1647F, -0.05F, -0.3897F));

		PartDefinition Basin_r3 = body2.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(43, 18).addBox(-1.0F, 0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5064F, -0.4477F, 5.7114F, -0.1647F, 0.05F, 0.3897F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 11).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5347F, 0.31F, 6.303F, -0.1719F, 0.4971F, -0.3492F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(29, 14).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5347F, 0.31F, 4.303F, -0.195F, 0.4891F, -0.3979F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 29).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5347F, 0.31F, 2.303F, -0.1483F, 0.504F, -0.3001F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5347F, 0.31F, 0.303F, -0.195F, 0.4891F, -0.3979F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 29).addBox(-0.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 0.31F, 2.303F, -0.1483F, -0.504F, 0.3001F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 11).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 0.31F, 6.303F, -0.1719F, -0.4971F, 0.3492F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(29, 14).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 0.31F, 4.303F, -0.195F, -0.4891F, 0.3979F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 0.31F, 0.303F, -0.195F, -0.4891F, 0.3979F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 33).addBox(-0.3038F, -0.2366F, -0.0691F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2312F, 0.05F, 6.8172F, -0.1065F, 0.2604F, -0.0275F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.51F, -0.2206F, -0.0235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1962F, -0.0066F, 2.9309F, 0.0041F, 0.1743F, 0.0083F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(24, 27).addBox(-0.4807F, -0.3624F, -0.0435F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1494F, 2.9765F, -0.1582F, 0.217F, 0.0224F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(39, 24).addBox(0.75F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 16).addBox(2.75F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 38).addBox(-0.25F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9153F, 1.275F, 5.478F, -0.0917F, 0.338F, -0.2951F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 0.25F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition legspineL2 = legL5.addOrReplaceChild("legspineL2", CubeListBuilder.create().texOffs(17, 42).addBox(-0.1F, -0.35F, 0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 42).addBox(-0.1F, -0.35F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.25F, 0.0F, -0.1516F, 0.3626F, -0.3928F));

		PartDefinition legL6 = legspineL2.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(23, 22).addBox(-0.117F, -0.4F, -1.45F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.1165F, 0.204F, 0.6982F));

		PartDefinition legL10 = body2.addOrReplaceChild("legL10", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-2.75F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 16).mirror().addBox(-3.75F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 38).mirror().addBox(-0.75F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9847F, 1.275F, 5.478F, 0.1023F, 0.1754F, 0.3368F));

		PartDefinition legL11 = legL10.addOrReplaceChild("legL11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 0.25F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition legspineL4 = legL11.addOrReplaceChild("legspineL4", CubeListBuilder.create().texOffs(17, 42).mirror().addBox(-0.9F, -0.35F, 0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 42).mirror().addBox(-0.9F, -0.35F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.25F, 0.0F, -0.1182F, -0.3744F, 0.3001F));

		PartDefinition legL12 = legspineL4.addOrReplaceChild("legL12", CubeListBuilder.create().texOffs(23, 22).mirror().addBox(-2.883F, -0.4F, -1.45F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0981F, -0.2133F, -0.6095F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(34, 8).addBox(0.9205F, -0.25F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 38).addBox(1.9205F, -0.25F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 11).addBox(-0.0795F, -0.25F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, 1.375F, 2.25F, 0.0462F, -0.2588F, -0.1349F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4205F, 0.25F, -0.0003F, 0.0F, 1.2217F, 0.0F));

		PartDefinition legspineL = legL2.addOrReplaceChild("legspineL", CubeListBuilder.create().texOffs(0, 43).addBox(-0.1F, -0.35F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 41).addBox(-0.1F, -0.35F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.016F, 0.25F, -1.0428F, 0.0348F, -0.2308F, -0.8185F));

		PartDefinition legL3 = legspineL.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(0, 5).addBox(-0.1538F, -0.2F, -1.0743F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, 2.433F, 0.1F, 0.1027F, 0.0524F, 0.8724F));

		PartDefinition legL7 = body.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-1.9205F, -0.25F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 38).mirror().addBox(-2.9205F, -0.25F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 11).mirror().addBox(-0.9205F, -0.25F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.05F, 1.375F, 2.25F, 0.0544F, 0.6074F, 0.1542F));

		PartDefinition legL8 = legL7.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4205F, 0.25F, -0.0003F, 0.0F, -1.2217F, 0.0F));

		PartDefinition legspineL3 = legL8.addOrReplaceChild("legspineL3", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.9F, -0.35F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 41).mirror().addBox(-0.9F, -0.35F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.016F, 0.25F, -1.0428F, -0.0524F, 0.2308F, 0.8185F));

		PartDefinition legL9 = legspineL3.addOrReplaceChild("legL9", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-1.8462F, -0.2F, -1.0743F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.433F, 0.1F, 0.1027F, -0.0524F, -0.8724F));

		return LayerDefinition.create(meshdefinition, 50, 50);
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