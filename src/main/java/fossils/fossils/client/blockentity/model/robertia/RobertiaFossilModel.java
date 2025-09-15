package fossils.fossils.client.blockentity.model.robertia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RobertiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart bone;
	private final ModelPart bone5;

	public RobertiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.bone3 = this.head.getChild("bone3");
		this.bone4 = this.head.getChild("bone4");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
		this.upperarm1 = this.Bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.Bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone6 = this.Bodyfront.getChild("bone6");
		this.upperleg1 = this.Hips.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.Hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.bone = this.Hips.getChild("bone");
		this.bone5 = this.Hips.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.7F, 12.5F, -0.2169F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(8, 79).addBox(0.0F, -1.3F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(39, 78).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(27, 80).addBox(0.0F, -1.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(15, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.4374F, -4.9915F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-0.7488F, -2.1F, -0.4892F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(14, 63).mirror().addBox(-0.9488F, -2.1F, 1.5108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(56, 63).mirror().addBox(-1.2488F, -2.1F, 3.4108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(56, 63).mirror().addBox(-1.2F, -1.5F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(14, 63).mirror().addBox(-0.9F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(56, 80).mirror().addBox(-0.7F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7176F, -2.4575F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(56, 63).addBox(1.2488F, -2.1F, 3.4108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(14, 63).addBox(0.9488F, -2.1F, 1.5108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 80).addBox(0.7488F, -2.1F, -0.4892F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 63).addBox(1.2F, -1.5F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(14, 63).addBox(0.9F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 80).addBox(0.7F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7176F, -2.4575F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0375F, 1.9085F, -0.0006F, 0.1745F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(80, 53).addBox(0.0F, -2.0F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 59).addBox(-0.5F, -1.2F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1625F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, -0.6283F, -0.0494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(5, 48).addBox(0.0F, -1.0283F, 0.9506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0375F, 1.8402F, -0.1942F, 0.1713F, -0.0335F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(21, 58).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0283F, 1.9506F, -0.0008F, 0.2182F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, -0.8626F, -4.8347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(47, 78).addBox(0.0F, -2.7626F, -4.8347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 46).addBox(0.0F, -2.6876F, -2.8347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6624F, -3.9915F, 0.0599F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(50, 78).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0126F, -0.3347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, 0.3268F, 0.1708F, -0.4664F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 61).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, 0.1516F, 0.3113F, -1.0091F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, -0.0304F, 0.3439F, -1.5618F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 63).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, 0.0364F, 0.3264F, -1.2168F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, 0.2397F, 0.241F, -0.6558F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, -0.0304F, 0.3439F, -1.5269F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.1516F, 0.3113F, -0.9742F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.3268F, 0.1708F, -0.4315F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 63).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, 0.0364F, -0.3264F, 1.2168F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, 0.2397F, -0.241F, 0.6558F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 55).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, -0.0304F, -0.3439F, 1.5618F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 61).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, 0.1516F, -0.3113F, 1.0091F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, 0.3268F, -0.1708F, 0.4664F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 47).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, -0.0304F, -0.3439F, 1.5269F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 40).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.1516F, -0.3113F, 0.9742F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 78).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.3268F, -0.1708F, 0.4315F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(53, 78).addBox(0.0F, -2.4F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 59).addBox(0.0F, -2.4F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, -0.0023F, 0.2933F, -1.4688F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(60, 51).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.1479F, 0.2542F, -0.926F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.2939F, 0.1236F, -0.3871F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(39, 10).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.0059F, 0.3282F, -1.4149F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.1736F, 0.28F, -0.8677F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 78).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.3287F, 0.1331F, -0.3312F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 37).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, -0.0023F, -0.2933F, 1.4688F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 51).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.1479F, -0.2542F, 0.926F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 57).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.2939F, -0.1236F, 0.3871F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(39, 10).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.0059F, -0.3282F, 1.4149F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(60, 49).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.1736F, -0.28F, 0.8677F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 78).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.3287F, -0.1331F, 0.3312F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body2.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(52, 10).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body2.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(24, 80).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0172F, 0.2581F, -1.3615F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 29).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.1458F, 0.2144F, -0.8244F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.2717F, 0.0905F, -0.2874F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 4).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.0247F, 0.2573F, -1.3075F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.1518F, 0.21F, -0.7711F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 80).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.2744F, 0.0837F, -0.2351F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.305F, 0.1007F, -0.1965F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.1698F, 0.2402F, -0.7313F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 14).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.0242F, 0.2922F, -1.2719F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 0).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0172F, -0.2581F, 1.3615F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 29).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.1458F, -0.2144F, 0.8244F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(77, 33).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.2717F, -0.0905F, 0.2874F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(30, 4).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.0247F, -0.2573F, 1.3075F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 63).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.1518F, -0.21F, 0.7711F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 80).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.2744F, -0.0837F, 0.2351F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 40).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.305F, -0.1007F, 0.1965F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(30, 6).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.1698F, -0.2402F, 0.7313F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(28, 14).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.0242F, -0.2922F, 1.2719F));

		PartDefinition Bodymiddle_r4 = body2.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(10, 71).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(30, 77).addBox(0.0F, -2.6F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.1012F, -0.0913F, 0.0344F));

		PartDefinition Bodymiddle_r5 = body3.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(66, 78).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.2915F, 0.0892F, -0.2346F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.1639F, 0.2234F, -0.7694F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(30, 2).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.0281F, 0.2748F, -1.3076F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(39, 12).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0183F, 0.3453F, -1.3253F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.1933F, 0.2885F, -0.7767F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.3495F, 0.1307F, -0.2429F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(78, 63).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.3016F, -0.0467F, 0.2339F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(61, 0).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.1948F, -0.1919F, 0.763F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 2).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.0717F, -0.2632F, 1.296F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 12).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0183F, -0.3453F, 1.3253F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 61).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.1933F, -0.2885F, 0.7767F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(61, 78).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.3495F, -0.1307F, 0.2429F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.025F, -0.1309F, 0.0033F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -2.7F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(11, 79).addBox(0.0F, -2.65F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(27, 42).addBox(0.0F, -2.327F, -0.0534F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2959F, -4.8804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(20, 38).mirror().addBox(-2.5F, -0.5059F, -1.9593F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(20, 38).addBox(-0.5F, -0.5059F, -1.9593F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.9279F, -3.4387F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -0.4863F, -0.0767F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.9279F, -3.4387F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6473F, -4.5245F, -0.0472F, 0.5698F, -1.592F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6473F, -4.5245F, 0.2728F, 0.5087F, -0.9832F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 42).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6473F, -4.5245F, 0.5288F, 0.2827F, -0.4435F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, -0.0331F, 0.4834F, -1.4627F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.2297F, 0.4303F, -0.8805F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 80).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.453F, 0.2352F, -0.3407F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, -0.005F, 0.4154F, -1.3476F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(61, 2).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.213F, 0.3595F, -0.7841F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.4024F, 0.1823F, -0.2484F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(80, 42).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6473F, -4.5245F, 0.5288F, -0.2827F, 0.4435F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 20).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6473F, -4.5245F, 0.2728F, -0.5087F, 0.9832F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 22).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6473F, -4.5245F, -0.0472F, -0.5698F, 1.592F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 30).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, -0.0331F, -0.4834F, 1.4627F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 29).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.2297F, -0.4303F, 0.8805F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(42, 80).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.453F, -0.2352F, 0.3407F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 24).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0872F, -0.3946F, 1.3112F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 2).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.2774F, -0.297F, 0.7633F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.4239F, -0.0977F, 0.2454F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5959F, -6.0054F, -0.1416F, -0.2593F, 0.0365F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(49, 39).addBox(0.0F, -1.9782F, -0.0109F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.411F, -0.9139F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(33, 61).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.5053F, 0.4686F, -0.4484F));

		PartDefinition cube_r78 = Neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.1302F, 0.6531F, -1.058F));

		PartDefinition cube_r79 = Neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 61).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.5053F, -0.4686F, 0.4484F));

		PartDefinition cube_r80 = Neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(69, 51).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.1302F, -0.6531F, 1.058F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(57, 5).addBox(-0.5F, -0.8F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.2203F, -0.2173F, 0.0193F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(5, 79).addBox(0.0F, -2.2047F, 0.1018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2222F, -3.0864F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(33, 78).addBox(0.0F, -2.178F, 0.0031F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2222F, -0.9864F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-1.6801F, 0.0063F, -0.5711F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0652F, -2.5666F, 0.6415F, 0.7365F, -0.7578F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-1.9348F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0652F, -0.5666F, 0.5132F, 0.7134F, -0.917F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(74, 35).addBox(-0.3199F, 0.0063F, -0.5711F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0652F, -2.5666F, 0.6415F, -0.7365F, 0.7578F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 53).addBox(-0.0652F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0652F, -0.5666F, 0.5132F, -0.7134F, 0.917F));

		PartDefinition Neck_r5 = neck2.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(31, 11).addBox(-0.5F, -0.8F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 8).addBox(-0.5F, -0.8F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8342F, -4.8404F, -0.45F, -0.0295F, -0.1089F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(48, 26).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.3998F, -9.1951F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(11, 30).addBox(-1.5F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.409F, -9.3867F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 36).addBox(-1.5F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 2.4227F, -9.2217F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(22, 32).addBox(-1.5F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.5684F, -8.4725F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.0363F, -5.9865F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2316F, -2.5277F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, -0.9205F, -1.9098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4545F, -2.6988F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(31, 39).addBox(-0.5F, -2.0F, -1.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5222F, -1.6793F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -0.3676F, -2.3675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4545F, -2.6988F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -0.0575F, -0.0216F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.916F, -4.4812F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 8).addBox(-1.0F, -0.0576F, -0.0216F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1124F, -7.3342F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 36).addBox(-1.5F, -0.0576F, -2.0216F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.1124F, -7.3342F, 0.9948F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1549F, 0.2589F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 39).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 0).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 4.499F, -8.6688F, -0.4802F, 0.0F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 9).mirror().addBox(-0.5F, -0.2F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.2002F, 3.7134F, -5.7081F, 0.8236F, -0.3161F, -0.2144F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(71, 76).mirror().addBox(-0.6839F, 0.1814F, -0.4004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 4.1549F, -7.5865F, -0.328F, -0.2701F, -0.1835F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-0.6839F, 0.2492F, 0.0929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 4.1549F, -7.5865F, -0.1534F, -0.2701F, -0.1835F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-0.7143F, -0.9614F, 0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.1971F, 5.4721F, -6.9813F, 0.4592F, -0.244F, -0.2173F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-0.7143F, 0.5527F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 4.1549F, -7.5865F, 1.55F, -0.244F, -0.2173F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 66).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5242F, 3.9666F, -7.8886F, 0.4155F, -0.244F, -0.2173F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-0.7143F, -0.6722F, -0.312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 4.1549F, -7.5865F, 0.6337F, -0.244F, -0.2173F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(78, 80).mirror().addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(54, 0).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.0309F, 3.1555F, -6.5768F, 0.7799F, -0.3161F, -0.2144F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6426F, 1.111F, -0.4676F, -1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-0.5F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5898F, 1.4522F, -1.4745F, -0.829F, -0.0524F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-1.5433F, 3.0712F, -2.3618F, -0.7069F, -0.0524F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-0.5F, -0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.5796F, 2.2403F, -1.6702F, -1.2828F, -0.0524F, 0.0F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-0.5F, 0.4F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.3264F, 0.6275F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-0.5F, 0.475F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0258F)).mirror(false), PartPose.offsetAndRotation(-1.4793F, 0.3663F, -3.5837F, 0.4712F, -0.0524F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.3702F, 2.7109F, -4.8739F, 0.5503F, -0.0466F, -0.0238F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0254F)).mirror(false), PartPose.offsetAndRotation(-1.3871F, 1.0781F, -5.3429F, 0.8558F, -0.0466F, -0.0238F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(54, 42).mirror().addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.4793F, 0.3663F, -3.5837F, 0.384F, -0.0524F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0243F)).mirror(false), PartPose.offsetAndRotation(-1.5769F, 0.0038F, -1.7212F, 0.192F, -0.0524F, 0.0F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-0.5F, 0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6424F, -0.0736F, -0.471F, 0.6632F, -0.0524F, 0.0F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(-0.5F, -0.075F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.026F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.1264F, 0.228F, 0.4974F, -0.0524F, 0.0F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(65, 31).mirror().addBox(-0.5F, -0.075F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.1264F, 0.228F, -0.0698F, -0.0524F, 0.0F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 9).addBox(-0.5F, -0.2F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.2002F, 3.7134F, -5.7081F, 0.8236F, 0.3161F, 0.2144F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 76).addBox(-0.3161F, 0.1814F, -0.4004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3336F, 4.1549F, -7.5865F, -0.328F, 0.2701F, 0.1835F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 71).addBox(-0.3161F, 0.2492F, 0.0929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3336F, 4.1549F, -7.5865F, -0.1534F, 0.2701F, 0.1835F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 68).addBox(-0.2857F, -0.9614F, 0.2155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.1971F, 5.4721F, -6.9813F, 0.4592F, 0.244F, 0.2173F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 50).addBox(-0.2857F, 0.5527F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.3336F, 4.1549F, -7.5865F, 1.55F, 0.244F, 0.2173F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5242F, 3.9666F, -7.8886F, 0.4155F, 0.244F, 0.2173F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(73, 61).addBox(-0.2857F, -0.6722F, -0.312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.3336F, 4.1549F, -7.5865F, 0.6337F, 0.244F, 0.2173F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(78, 80).addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 80).addBox(-0.5F, -1.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(54, 0).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.0309F, 3.1555F, -6.5768F, 0.7799F, 0.3161F, 0.2144F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6426F, 1.111F, -0.4676F, -1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(76, 24).addBox(-0.5F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5898F, 1.4522F, -1.4745F, -0.829F, 0.0524F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(1.5433F, 3.0712F, -2.3618F, -0.7069F, 0.0524F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(61, 42).addBox(-0.5F, -0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5796F, 2.2403F, -1.6702F, -1.2828F, 0.0524F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(76, 15).addBox(-0.5F, 0.4F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7F, 0.3264F, 0.6275F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 54).addBox(-0.5F, 0.475F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0258F)), PartPose.offsetAndRotation(1.4793F, 0.3663F, -3.5837F, 0.4712F, 0.0524F, 0.0F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.3702F, 2.7109F, -4.8739F, 0.5503F, 0.0466F, 0.0238F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0254F)), PartPose.offsetAndRotation(1.3871F, 1.0781F, -5.3429F, 0.8558F, 0.0466F, 0.0238F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 42).addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.4793F, 0.3663F, -3.5837F, 0.384F, 0.0524F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(53, 37).addBox(-0.5F, -0.075F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0243F)), PartPose.offsetAndRotation(1.5769F, 0.0038F, -1.7212F, 0.192F, 0.0524F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 27).addBox(-0.5F, 0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6424F, -0.0736F, -0.471F, 0.6632F, 0.0524F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(39, 65).addBox(-0.5F, -0.075F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.026F)), PartPose.offsetAndRotation(1.6791F, 0.1264F, 0.228F, 0.4974F, 0.0524F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 31).addBox(-0.5F, -0.075F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6791F, 0.1264F, 0.228F, -0.0698F, 0.0524F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7389F, 5.5315F, -7.684F, 0.1536F, -0.354F, 0.2246F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(46, 14).addBox(-0.868F, -0.5692F, -2.3952F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.0903F, 0.0539F, 0.2955F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(9, 41).addBox(-0.435F, -0.1216F, -4.9965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F))
				.texOffs(42, 32).addBox(-0.435F, -0.5216F, -4.9965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.2796F, -0.0511F, 0.1126F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(18, 42).addBox(-0.625F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.9359F, -5.6718F, 4.1454F, -2.4839F, 0.607F, -0.5673F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 16).addBox(-0.7816F, 0.1538F, -1.8092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.4826F, -7.6278F, 3.877F, -1.8637F, 0.5754F, -1.8821F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 8).addBox(-0.7816F, 0.2742F, -1.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4826F, -7.6278F, 3.877F, -1.6892F, 0.5754F, -1.8821F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(69, 12).addBox(-0.932F, -0.8347F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1566F, -6.6943F, 3.2311F, -1.3303F, 0.5398F, -1.1867F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 42).addBox(-0.882F, -0.3442F, -1.8229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4826F, -7.6278F, 3.877F, -1.9227F, 0.3529F, -1.8068F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 21).addBox(-0.65F, -0.75F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(56, 21).addBox(-0.65F, -0.25F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6818F, -0.9333F, 0.0047F, 0.1321F, 0.7082F, -0.358F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 20).addBox(-0.425F, -0.325F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 15).addBox(-0.75F, -0.325F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3131F, -4.5949F, 2.4188F, -0.7401F, 0.8472F, -0.1715F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(21, 68).addBox(-0.8633F, -0.3169F, -1.8173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0566F, -6.9443F, 3.7311F, -1.6739F, 0.483F, -1.1754F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 4).addBox(-0.5555F, -0.3169F, -0.8313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.2691F, -6.2341F, 3.977F, -1.3815F, 0.4581F, -0.5472F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(25, 64).addBox(-0.5555F, -0.1061F, -0.0828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.2691F, -6.2341F, 3.977F, 0.2766F, 0.4581F, -0.5472F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 63).addBox(-0.5555F, -0.5531F, -0.6068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2691F, -6.2341F, 3.977F, -0.5088F, 0.4581F, -0.5472F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5555F, -0.4155F, 0.1342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.2691F, -6.2341F, 3.977F, -1.8614F, 0.4581F, -0.5472F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 49).addBox(0.5984F, 3.8052F, -6.0213F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -3.0996F, -0.2198F, -0.032F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(18, 62).addBox(-1.975F, -0.45F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.4828F, -8.9218F, 9.5481F, -2.9985F, 0.0717F, -0.4848F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(12, 52).addBox(-0.8F, -0.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3282F, -4.3637F, 8.6306F, 2.9968F, -0.2117F, -1.3633F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 70).addBox(-0.9F, -6.4F, -0.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(39, 26).addBox(-2.9F, -3.7F, -0.825F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.3524F, -8.8496F, 9.3733F, 2.8887F, 0.0391F, -0.2492F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(47, 43).addBox(0.5984F, 4.5681F, -5.8807F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, 2.9829F, -0.2198F, -0.032F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 51).addBox(-0.5F, -1.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.205F, -10.0761F, 8.403F, 2.8956F, -0.2198F, -0.032F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(51, 32).addBox(0.648F, 1.4922F, -9.0207F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.6021F, -0.2198F, -0.032F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 49).addBox(0.5984F, -0.3496F, -7.9484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.3578F, -0.2198F, -0.032F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8727F, -7.0967F, 5.6142F, -2.2651F, -0.1969F, 0.0111F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(59, 54).addBox(0.5984F, -0.2401F, -6.3857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.3142F, -0.2198F, -0.032F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(71, 68).addBox(-0.9421F, -0.9203F, -1.3079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3376F, -1.4478F, 0.5284F, -2.319F, 0.8651F, -0.5757F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(46, 65).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.132F, -7.3965F, 4.2282F, 2.0934F, -0.0156F, -0.4985F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(59, 62).addBox(-1.5F, -1.8F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.5477F, -6.102F, 2.1055F, 2.3147F, 0.3383F, -0.2707F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(59, 58).addBox(-1.5F, -1.6F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.3201F, -6.917F, 3.3481F, 2.1402F, 0.3383F, -0.2707F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(51, 69).addBox(-0.3F, -2.05F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.675F, -4.0161F, 1.0466F, 2.389F, 0.8323F, -0.5249F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 31).addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.675F, -4.0161F, 1.0466F, 2.5199F, 0.8323F, -0.5249F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(27, 47).addBox(-0.8921F, -0.1203F, -0.7579F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3376F, -1.4478F, 0.5284F, -2.9298F, 0.8651F, -0.5757F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5171F, -0.0953F, -2.7579F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1459F, -0.9368F, 1.1511F, -2.4081F, 0.5479F, 0.1958F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 0).addBox(-0.868F, -0.6523F, -2.3454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.613F, -2.5926F, 2.3835F, -2.2125F, 0.0539F, 0.2955F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 32).addBox(-0.5171F, 0.4064F, -0.5456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1459F, -0.9368F, 1.1511F, -1.1602F, 0.5479F, 0.1958F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(45, 59).addBox(-0.5171F, -0.4748F, -0.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.1459F, -0.9368F, 1.1511F, -1.771F, 0.5479F, 0.1958F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 43).addBox(-0.5171F, -0.7279F, -2.2077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1459F, -0.9368F, 1.1511F, -2.251F, 0.5479F, 0.1958F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7389F, 5.5315F, -7.684F, 0.1536F, 0.354F, -0.2246F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 14).mirror().addBox(-0.132F, -0.5692F, -2.3952F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.0903F, -0.0539F, -0.2955F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(-0.565F, -0.1216F, -4.9965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(42, 32).mirror().addBox(-0.565F, -0.5216F, -4.9965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.2796F, 0.0511F, -0.1126F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 42).mirror().addBox(-0.375F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.9359F, -5.6718F, 4.1454F, -2.4839F, -0.607F, 0.5673F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-0.2184F, 0.1538F, -1.8092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.4826F, -7.6278F, 3.877F, -1.8637F, -0.5754F, 1.8821F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.2184F, 0.2742F, -1.9582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4826F, -7.6278F, 3.877F, -1.6892F, -0.5754F, 1.8821F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-0.068F, -0.8347F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1566F, -6.6943F, 3.2311F, -1.3303F, -0.5398F, 1.1867F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(68, 42).mirror().addBox(-0.118F, -0.3442F, -1.8229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4826F, -7.6278F, 3.877F, -1.9227F, -0.3529F, 1.8068F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(56, 21).mirror().addBox(-0.35F, -0.75F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 21).mirror().addBox(-0.35F, -0.25F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.6818F, -0.9333F, 0.0047F, 0.1321F, -0.7082F, 0.358F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-0.575F, -0.325F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 15).mirror().addBox(-0.25F, -0.325F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3131F, -4.5949F, 2.4188F, -0.7401F, -0.8472F, 0.1715F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.1367F, -0.3169F, -1.8173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0566F, -6.9443F, 3.7311F, -1.6739F, -0.483F, 1.1754F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(-0.4445F, -0.3169F, -0.8313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.2691F, -6.2341F, 3.977F, -1.3815F, -0.4581F, 0.5472F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-0.4445F, -0.1061F, -0.0828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.2691F, -6.2341F, 3.977F, 0.2766F, -0.4581F, 0.5472F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.4445F, -0.5531F, -0.6068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2691F, -6.2341F, 3.977F, -0.5088F, -0.4581F, 0.5472F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-0.4445F, -0.4155F, 0.1342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.2691F, -6.2341F, 3.977F, -1.8614F, -0.4581F, 0.5472F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-1.5984F, 3.8052F, -6.0213F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -3.0996F, 0.2198F, 0.032F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(-0.025F, -0.45F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.4828F, -8.9218F, 9.5481F, -2.9985F, -0.0717F, 0.4848F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(12, 52).mirror().addBox(-1.2F, -0.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3282F, -4.3637F, 8.6306F, 2.9968F, 0.2117F, 1.3633F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-0.1F, -6.4F, -0.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(39, 26).mirror().addBox(-0.1F, -3.7F, -0.825F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.3524F, -8.8496F, 9.3733F, 2.8887F, -0.0391F, 0.2492F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(47, 43).mirror().addBox(-1.5984F, 4.5681F, -5.8807F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, 2.9829F, 0.2198F, 0.032F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(5, 51).mirror().addBox(-0.5F, -1.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.205F, -10.0761F, 8.403F, 2.8956F, 0.2198F, 0.032F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-1.648F, 1.4922F, -9.0207F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.6021F, 0.2198F, 0.032F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-1.5984F, -0.3496F, -7.9484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.3578F, 0.2198F, 0.032F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8727F, -7.0967F, 5.6142F, -2.2651F, 0.1969F, -0.0111F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-1.5984F, -0.2401F, -6.3857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.3142F, 0.2198F, 0.032F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-0.0579F, -0.9203F, -1.3079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3376F, -1.4478F, 0.5284F, -2.319F, -0.8651F, 0.5757F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(46, 65).mirror().addBox(-0.5F, -0.2F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.132F, -7.3965F, 4.2282F, 2.0934F, 0.0156F, 0.4985F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(59, 62).mirror().addBox(-0.5F, -1.8F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.5477F, -6.102F, 2.1055F, 2.3147F, -0.3383F, 0.2707F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.5F, -1.6F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.3201F, -6.917F, 3.3481F, 2.1402F, -0.3383F, 0.2707F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(51, 69).mirror().addBox(-0.7F, -2.05F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.675F, -4.0161F, 1.0466F, 2.389F, -0.8323F, 0.5249F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.675F, -4.0161F, 1.0466F, 2.5199F, -0.8323F, 0.5249F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(27, 47).mirror().addBox(-0.1079F, -0.1203F, -0.7579F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3376F, -1.4478F, 0.5284F, -2.9298F, -0.8651F, 0.5757F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.4829F, -0.0953F, -2.7579F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, -0.9368F, 1.1511F, -2.4081F, -0.5479F, -0.1958F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.132F, -0.6523F, -2.3454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.613F, -2.5926F, 2.3835F, -2.2125F, -0.0539F, -0.2955F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-0.4829F, 0.4064F, -0.5456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, -0.9368F, 1.1511F, -1.1602F, -0.5479F, -0.1958F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-0.4829F, -0.4748F, -0.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, -0.9368F, 1.1511F, -1.771F, -0.5479F, -0.1958F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(-0.4829F, -0.7279F, -2.2077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, -0.9368F, 1.1511F, -2.251F, -0.5479F, -0.1958F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.0F, 3.409F, -9.3867F));

		PartDefinition cube_r211 = bone3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(34, 48).addBox(-1.0F, -0.0325F, -2.0216F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -9.9421F, 7.9155F, 0.6943F, 0.4909F, 0.2994F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(39, 16).addBox(-1.0F, 0.0425F, -0.4216F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -9.9421F, 7.9155F, -0.1252F, 0.8727F, 0.2464F));

		PartDefinition cube_r213 = bone3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.6102F, -1.362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, -3.0456F, 0.48F, 0.0F));

		PartDefinition cube_r214 = bone3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 13).addBox(-0.5F, -0.511F, -0.8919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, 2.1904F, 0.48F, 0.0F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(34, 74).addBox(-0.5F, -0.9701F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, 3.0631F, 0.48F, 0.0F));

		PartDefinition cube_r216 = bone3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(38, 54).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0349F, 0.4515F, 0.0467F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.409F, -9.3867F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(34, 48).mirror().addBox(0.0F, -0.0325F, -2.0216F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -9.9421F, 7.9155F, 0.6943F, -0.4909F, -0.2994F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(39, 16).mirror().addBox(0.0F, 0.0425F, -0.4216F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -9.9421F, 7.9155F, -0.1252F, -0.8727F, -0.2464F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.5F, -0.6102F, -1.362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, -3.0456F, -0.48F, 0.0F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-0.5F, -0.511F, -0.8919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, 2.1904F, -0.48F, 0.0F));

		PartDefinition cube_r221 = bone4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-0.5F, -0.9701F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7236F, 1.8212F, 3.0631F, -0.48F, 0.0F));

		PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0349F, -0.4515F, -0.0467F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.631F, 7.6499F, -5.7117F, 0.5876F, 0.5758F, 0.1171F));

		PartDefinition cube_r223 = leftTusk.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(66, 70).addBox(-0.502F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.2096F, -0.0575F, 0.1241F));

		PartDefinition cube_r224 = leftTusk.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 3).addBox(-0.502F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 75).addBox(-0.502F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.515F, -0.0575F, 0.1241F));

		PartDefinition cube_r225 = leftTusk.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(69, 46).addBox(-0.502F, -2.6037F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, -0.1002F, -0.0575F, 0.1241F));

		PartDefinition cube_r226 = leftTusk.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 69).addBox(-0.502F, -2.6037F, -0.5016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.1529F, -0.0575F, 0.1241F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.631F, 7.6499F, -5.7117F, 0.5876F, -0.5758F, -0.1171F));

		PartDefinition cube_r227 = rightTusk.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(66, 70).mirror().addBox(-0.498F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.2096F, 0.0575F, -0.1241F));

		PartDefinition cube_r228 = rightTusk.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.498F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 75).mirror().addBox(-0.498F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.515F, 0.0575F, -0.1241F));

		PartDefinition cube_r229 = rightTusk.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-0.498F, -2.6037F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, -0.1002F, 0.0575F, -0.1241F));

		PartDefinition cube_r230 = rightTusk.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-0.498F, -2.6037F, -0.5016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.1529F, 0.0575F, -0.1241F));

		PartDefinition upperarm1 = Bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(33, 54).addBox(-0.3797F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6551F, 5.0044F, -2.9368F, 0.3248F, -0.0397F, -0.8486F));

		PartDefinition upperarm4_r1 = upperarm1.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(66, 61).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm1.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(9, 46).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarm1.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(75, 42).addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm1.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm1.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarm1.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(14, 70).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6795F, 4.7465F, -0.4007F, -0.6439F, -0.478F, 1.4176F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(56, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8955F, -0.2335F, -0.2897F, 0.0791F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(55, 47).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3572F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(29, 73).addBox(0.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3115F, 2.0518F, -0.2838F, -0.2961F, 1.2533F, -0.2064F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3239F, 4.1855F, -0.6257F, -0.2001F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0518F, 4.4716F, -1.0283F, 0.7185F, 1.0288F, -0.129F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(26, 22).addBox(0.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(39, 6).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(77, 65).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(70, 65).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = Bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-0.6203F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6551F, 5.0044F, -2.9368F, 0.892F, 0.0397F, 0.8486F));

		PartDefinition upperarm5_r2 = upperarm2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarm2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarm2.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm7_r1 = upperarm2.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(75, 42).mirror().addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarm2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarm2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm4_r5 = upperarm2.addOrReplaceChild("upperarm4_r5", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6795F, 4.7465F, -0.4007F, -0.6439F, 0.478F, -1.4176F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8955F, -0.2335F, -0.2897F, 0.0791F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(55, 47).mirror().addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3572F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(-1.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3115F, 2.0518F, -0.2838F, -0.2961F, -1.2533F, 0.2064F));

		PartDefinition lowerarm2_r3 = lowerarm2.addOrReplaceChild("lowerarm2_r3", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3239F, 4.1855F, -0.6257F, -0.2001F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0518F, 4.4716F, -1.0283F, 0.8933F, -1.1199F, -0.0695F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(26, 22).mirror().addBox(-3.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(39, 6).mirror().addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r6 = bone2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(55, 75).addBox(-0.5246F, -0.0617F, -0.9108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8007F, 3.4727F, -5.7738F, 2.1869F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r7 = bone2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(44, 75).addBox(-0.5246F, -0.6613F, -1.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(15, 76).addBox(-0.5246F, -0.6613F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8007F, 3.4727F, -5.7738F, 2.7977F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r8 = bone2.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(76, 77).addBox(-0.5246F, -0.8119F, 0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8007F, 3.4727F, -5.7738F, 2.405F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r9 = bone2.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(66, 53).addBox(-0.5246F, -0.1629F, -0.4855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8007F, 3.4727F, -5.7738F, 2.8414F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r10 = bone2.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(76, 6).addBox(-0.51F, -2.4703F, -1.184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8387F, 0.5755F, -5.1802F, 2.4304F, -0.1276F, -0.2273F));

		PartDefinition Bodyfront_r11 = bone2.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(78, 21).addBox(-0.51F, -1.1708F, -2.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(78, 18).addBox(-0.51F, -1.5708F, -1.9336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8387F, 0.5755F, -5.1802F, 1.6276F, -0.1276F, -0.2273F));

		PartDefinition Bodyfront_r12 = bone2.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(46, 19).addBox(-0.51F, -0.2711F, -0.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8387F, 0.5755F, -5.1802F, 1.2785F, -0.1276F, -0.2273F));

		PartDefinition Bodyfront_r13 = bone2.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(14, 57).addBox(-0.51F, -0.0682F, 0.9146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8387F, 0.5755F, -5.1802F, 1.4967F, -0.1276F, -0.2273F));

		PartDefinition Bodyfront_r14 = bone2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(14, 66).addBox(-0.51F, -0.6074F, 0.9908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(28, 69).addBox(-0.51F, -0.2291F, -2.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8387F, 0.5755F, -5.1802F, 1.0167F, -0.1276F, -0.2273F));

		PartDefinition Bodyfront_r15 = bone2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(7, 67).addBox(-1.2776F, -1.1114F, 0.5974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9724F, 3.5798F, -7.348F, 0.9414F, -0.0833F, 0.245F));

		PartDefinition Bodyfront_r16 = bone2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(7, 57).addBox(-1.1043F, -1.2124F, 1.1298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0317F, 5.0246F, -6.4321F, 1.6712F, 0.0115F, 0.4464F));

		PartDefinition bone6 = Bodyfront.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-4.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r17 = bone6.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.4754F, -0.0617F, -0.9108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.4727F, -5.7738F, 2.1869F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r18 = bone6.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(44, 75).mirror().addBox(-0.4754F, -0.6613F, -1.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(15, 76).mirror().addBox(-0.4754F, -0.6613F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.4727F, -5.7738F, 2.7977F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r19 = bone6.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.4754F, -0.8119F, 0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.4727F, -5.7738F, 2.405F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r20 = bone6.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-0.4754F, -0.1629F, -0.4855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.4727F, -5.7738F, 2.8414F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r21 = bone6.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.49F, -2.4703F, -1.184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 0.5755F, -5.1802F, 2.4304F, 0.1276F, 0.2273F));

		PartDefinition Bodyfront_r22 = bone6.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(78, 21).mirror().addBox(-0.49F, -1.1708F, -2.3335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(78, 18).mirror().addBox(-0.49F, -1.5708F, -1.9336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 0.5755F, -5.1802F, 1.6276F, 0.1276F, 0.2273F));

		PartDefinition Bodyfront_r23 = bone6.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-0.49F, -0.2711F, -0.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 0.5755F, -5.1802F, 1.2785F, 0.1276F, 0.2273F));

		PartDefinition Bodyfront_r24 = bone6.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-0.49F, -0.0682F, 0.9146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 0.5755F, -5.1802F, 1.4967F, 0.1276F, 0.2273F));

		PartDefinition Bodyfront_r25 = bone6.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-0.49F, -0.6074F, 0.9908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(28, 69).mirror().addBox(-0.49F, -0.2291F, -2.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 0.5755F, -5.1802F, 1.0167F, 0.1276F, 0.2273F));

		PartDefinition Bodyfront_r26 = bone6.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(0.2776F, -1.1114F, 0.5974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9724F, 3.5798F, -7.348F, 0.9414F, 0.0833F, -0.245F));

		PartDefinition Bodyfront_r27 = bone6.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(0.1043F, -1.2124F, 1.1298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0317F, 5.0246F, -6.4321F, 1.6712F, -0.0115F, -0.4464F));

		PartDefinition upperleg1 = Hips.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, 3.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4101F, 2.3024F, -0.4736F, -0.7016F, 0.1228F, -0.9243F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(66, 74).addBox(-0.5018F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(61, 70).addBox(-0.5018F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg1.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(50, 74).addBox(-0.5018F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg1.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.8112F, 0.8125F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg1.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(76, 74).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8F, 0.6F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7083F, 8.044F, 0.4834F, 0.6157F, -0.4832F, 0.5007F));

		PartDefinition leg3_r1 = leg1.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(73, 57).addBox(-0.3166F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, -0.1382F, 1.3147F, 0.1794F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(51, 63).addBox(-0.3165F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, 0.1673F, 1.3147F, 0.1794F));

		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-0.3984F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, 0.0364F, 1.3147F, 0.1794F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, 0.3226F, 0.0242F, 0.4358F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(38, 39).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(26, 27).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = Hips.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.5F, 3.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4101F, 2.3024F, -0.4736F, -0.3962F, -0.1228F, 0.9243F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(66, 74).mirror().addBox(-0.4982F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(61, 70).mirror().addBox(-0.4982F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-0.4982F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.8112F, 0.8125F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg2.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(76, 74).mirror().addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8F, 0.6F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7083F, 8.044F, 0.4834F, 1.052F, 0.4832F, -0.5007F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(73, 57).mirror().addBox(-0.6834F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, -0.1382F, -1.3147F, -0.1794F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.6835F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, 0.1673F, -1.3147F, -0.1794F));

		PartDefinition leg2_r2 = leg2.addOrReplaceChild("leg2_r2", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.6016F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, 0.0364F, -1.3147F, -0.1794F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.4646F, -0.3978F, -0.2102F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(26, 27).mirror().addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2362F, -0.5711F, 0.2902F, 0.0F, 0.0F, 0.1745F));

		PartDefinition basin_r1 = bone.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(71, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -1.7941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(50, 5).addBox(0.0F, -0.45F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7708F, -2.0782F, -0.8405F, -0.7941F, 0.0F, 0.0F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(5, 71).addBox(0.0F, -0.1286F, -0.9606F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -2.6174F, -0.9308F, 0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(71, 3).addBox(0.0F, -0.0176F, -0.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -1.8103F, -3.7366F, 0.48F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(45, 71).addBox(0.0F, -0.1221F, 0.2116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(0, 71).addBox(0.0F, -0.1221F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -2.1368F, -2.9013F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.2708F, -0.4074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(24, 73).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, 0.0839F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(19, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2708F, -0.5744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(76, 12).addBox(0.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7708F, -1.6869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(38, 59).addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -0.0628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(76, 9).addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, 0.4336F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(28, 58).addBox(-0.9043F, -4.5612F, -0.4295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.418F, 0.0237F, 0.3209F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(26, 53).addBox(-0.9043F, -3.2435F, -0.5893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.7409F, 0.0237F, 0.3209F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(25, 77).addBox(-0.9043F, -2.6201F, 2.1564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.0428F, 0.0237F, 0.3209F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(20, 77).addBox(-0.9043F, -1.9066F, 2.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -1.5192F, 0.0237F, 0.3209F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(71, 72).addBox(-0.9043F, -2.1504F, 3.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -1.3883F, 0.0237F, 0.3209F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(19, 52).addBox(-0.9043F, -1.2113F, 0.1753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.0253F, 0.0237F, 0.3209F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(74, 46).addBox(-0.9064F, -3.7156F, -1.3587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.7235F, 0.0237F, 0.3209F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(39, 74).addBox(-0.9064F, -2.1506F, -0.3003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4104F, 1.7805F, -0.9551F, -2.1999F, 0.0237F, 0.3209F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(64, 25).addBox(-0.5F, 0.075F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, 0.8308F, -0.3091F, -1.5045F, -0.0255F, 0.111F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(77, 30).addBox(-0.4846F, 1.5429F, -1.1737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8104F, 3.5805F, 0.0449F, -2.069F, 0.0237F, 0.1114F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(60, 36).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, 0.8773F, -0.6055F, -1.4172F, -0.0255F, 0.111F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2362F, -0.5711F, 0.2902F, 0.0F, 0.0F, -0.1745F));

		PartDefinition basin_r23 = bone5.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -1.7941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone5.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-1.0F, -0.45F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -2.0782F, -0.8405F, -0.7941F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone5.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-1.0F, -0.1286F, -0.9606F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -2.6174F, -0.9308F, 0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r26 = bone5.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-1.0F, -0.0176F, -0.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -1.8103F, -3.7366F, 0.48F, 0.0F, 0.0F));

		PartDefinition basin_r27 = bone5.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-1.0F, -0.1221F, 0.2116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(0, 71).mirror().addBox(-1.0F, -0.1221F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -2.1368F, -2.9013F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r28 = bone5.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -0.4074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r29 = bone5.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(24, 73).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, 0.0839F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r30 = bone5.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(19, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -0.5744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r31 = bone5.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-1.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -1.6869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r32 = bone5.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(38, 59).mirror().addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -0.0628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone5.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, 0.4336F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r34 = bone5.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.0957F, -4.5612F, -0.4295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.418F, -0.0237F, -0.3209F));

		PartDefinition basin_r35 = bone5.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(26, 53).mirror().addBox(-0.0957F, -3.2435F, -0.5893F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.7409F, -0.0237F, -0.3209F));

		PartDefinition basin_r36 = bone5.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.0957F, -2.6201F, 2.1564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.0428F, -0.0237F, -0.3209F));

		PartDefinition basin_r37 = bone5.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.0957F, -1.9066F, 2.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -1.5192F, -0.0237F, -0.3209F));

		PartDefinition basin_r38 = bone5.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-0.0957F, -2.1504F, 3.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -1.3883F, -0.0237F, -0.3209F));

		PartDefinition basin_r39 = bone5.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(19, 52).mirror().addBox(-0.0957F, -1.2113F, 0.1753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.0253F, -0.0237F, -0.3209F));

		PartDefinition basin_r40 = bone5.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(74, 46).mirror().addBox(-0.0936F, -3.7156F, -1.3587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.7235F, -0.0237F, -0.3209F));

		PartDefinition basin_r41 = bone5.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.0936F, -2.1506F, -0.3003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, 1.7805F, -0.9551F, -2.1999F, -0.0237F, -0.3209F));

		PartDefinition basin_r42 = bone5.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-0.5F, 0.075F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, 0.8308F, -0.3091F, -1.5045F, 0.0255F, -0.111F));

		PartDefinition basin_r43 = bone5.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.5154F, 1.5429F, -1.1737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 3.5805F, 0.0449F, -2.069F, -0.0237F, -0.1114F));

		PartDefinition basin_r44 = bone5.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, 0.8773F, -0.6055F, -1.4172F, 0.0255F, -0.111F));

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