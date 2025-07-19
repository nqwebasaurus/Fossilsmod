package fossils.fossils.client.blockentity.model.prestosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PrestosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart upperarm2;
	private final ModelPart arm2;
	private final ModelPart hand2;
	private final ModelPart upperarm3;
	private final ModelPart arm3;
	private final ModelPart hand3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart crestl3;
	private final ModelPart crestl4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public PrestosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.arm2 = this.upperarm2.getChild("arm2");
		this.hand2 = this.arm2.getChild("hand2");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.arm3 = this.upperarm3.getChild("arm3");
		this.hand3 = this.arm3.getChild("hand3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.crestl.getChild("crestl2");
		this.crestl3 = this.head.getChild("crestl3");
		this.crestl4 = this.crestl3.getChild("crestl4");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 2.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(0.0F, -1.8F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 0).mirror().addBox(0.0F, -1.8F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.9F, -3.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 91).mirror().addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2F, -3.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 91).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2F, -3.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 91).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 46).addBox(0.0F, -1.8F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 0).addBox(0.0F, -1.8F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 48).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 92).addBox(0.0F, -1.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 63).mirror().addBox(-4.0F, 0.5F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(39, 63).addBox(3.0F, 0.5F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(23, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 0).addBox(0.0F, -1.8F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 0).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -1.9F, -1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 77).mirror().addBox(0.0F, -2.7002F, -6.056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.2F, -3.1F, 1.6755F, 0.0F, -0.384F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 86).mirror().addBox(0.0F, -4.9909F, -8.0934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.2F, -3.1F, 1.7017F, 0.0F, -0.384F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(0.0F, -0.4464F, -7.1232F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.2F, -3.1F, 1.2217F, 0.0F, -0.384F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 40).mirror().addBox(0.0F, -1.1871F, -7.2026F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.2F, -3.1F, 1.2915F, 0.0F, -0.384F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-0.2F, -1.3F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.6158F, -2.4941F, 1.0963F, -0.1218F, -0.2323F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(0.0F, 4.4987F, -2.0596F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 2.0F, 1.4F, 0.9599F, 0.0F, -0.4887F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 40).mirror().addBox(0.0F, -0.1302F, -0.9055F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 2.0F, 1.4F, 0.7156F, 0.0F, -0.4887F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 13).mirror().addBox(-4.0F, 0.0767F, -7.1107F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 52).mirror().addBox(-4.0F, -1.9233F, -7.1107F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(16, 13).addBox(3.0F, 0.0767F, -7.1107F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(0, 52).addBox(3.0F, -1.9233F, -7.1107F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8F, 3.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-4.0F, -0.3626F, -0.9519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 0).addBox(3.0F, -0.3626F, -0.9519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.5F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 90).addBox(6.5F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5F, -3.484F, 5.6228F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(90, 56).addBox(6.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.5F, -3.2406F, 5.0306F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, 0.0154F, -1.0659F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 70).addBox(3.0F, 0.0154F, -1.0659F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, 0.6F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 90).mirror().addBox(-4.0F, -0.0893F, 0.0314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 90).addBox(3.0F, -0.0893F, 0.0314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 90).mirror().addBox(-4.0F, -0.0098F, -0.1264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(26, 90).addBox(3.0F, -0.0098F, -0.1264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 11).mirror().addBox(-4.0F, -0.8981F, -0.3733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 11).addBox(3.0F, -0.8981F, -0.3733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -3.0F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-3.0F, 0.5F, 1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 0).addBox(1.0F, 0.5F, 1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, 4.4987F, -2.0596F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.6F, 2.0F, 1.4F, 0.9599F, 0.0F, 0.4887F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 40).addBox(-1.0F, -0.1302F, -0.9055F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 2.0F, 1.4F, 0.7156F, 0.0F, 0.4887F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 40).addBox(-0.8F, -1.3F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.6158F, -2.4941F, 1.0963F, 0.1218F, 0.2323F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 77).addBox(-1.0F, -2.7002F, -6.056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 1.2F, -3.1F, 1.6755F, 0.0F, 0.384F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(52, 47).addBox(-1.0F, -0.4464F, -7.1232F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.7F, 1.2F, -3.1F, 1.2217F, 0.0F, 0.384F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 86).addBox(-1.0F, -4.9909F, -8.0934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 1.2F, -3.1F, 1.7017F, 0.0F, 0.384F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 40).addBox(-1.0F, -1.1871F, -7.2026F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.2F, -3.1F, 1.2915F, 0.0F, 0.384F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 26).addBox(-1.0F, -0.0815F, 0.0948F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 1.1319F, -0.3993F, 0.2462F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(20, 79).addBox(-0.5F, -0.4F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(37, 43).addBox(-0.5F, 1.6F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9362F, 0.614F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(28, 27).addBox(-0.5F, 0.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4638F, -0.586F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 10.2227F, 1.157F, 0.5452F, 0.0F, 0.0F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(89, 4).addBox(-1.0497F, -3.478F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0535F, 3.3385F, 0.2506F, -1.5708F, 1.4137F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(73, 84).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0535F, 6.1385F, 1.2506F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(80, 72).addBox(-1.0F, -6.2772F, -1.9465F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.2671F, 1.6198F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(5, 84).addBox(-0.0821F, -2.7095F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9465F, 3.9899F, 1.6198F, -1.5708F, 1.4486F, -1.5708F));

		PartDefinition leg2_r1 = leg2.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(14, 84).addBox(-0.3F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9465F, 6.4899F, 1.6198F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(48, 16).addBox(-2.5487F, -0.475F, -3.7509F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.3899F, 2.1734F, 0.1707F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(62, 46).addBox(-2.4987F, -0.4978F, -3.9636F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, -0.829F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 1.1319F, -0.3993F, -0.452F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg3.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(74, 78).addBox(-1.5F, -0.4F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(43, 26).addBox(-1.5F, 1.6F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9362F, 0.614F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg3.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, 0.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4638F, -0.586F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 10.2227F, 1.157F, 0.6761F, 0.0F, 0.0F));

		PartDefinition leg5_r1 = leg3.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(47, 71).addBox(-0.9503F, -3.478F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0535F, 3.3385F, 0.2506F, -1.5708F, -1.4137F, 1.5708F));

		PartDefinition leg4_r2 = leg3.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(41, 84).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0535F, 6.1385F, 1.2506F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(80, 65).addBox(-2.0F, -6.2772F, -1.9465F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2671F, 1.6198F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r4 = leg3.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(83, 29).addBox(-1.9179F, -2.7095F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9465F, 3.9899F, 1.6198F, -1.5708F, -1.4486F, 1.5708F));

		PartDefinition leg3_r4 = leg3.addOrReplaceChild("leg3_r4", CubeListBuilder.create().texOffs(83, 82).addBox(-0.7F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9465F, 6.4899F, 1.6198F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(48, 8).addBox(-2.4513F, -0.475F, -3.7509F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.3899F, 2.1734F, -0.1347F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(11, 62).addBox(-2.5013F, -0.4978F, -3.9636F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 54).addBox(-1.0F, -1.2F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(61, 33).addBox(-1.0F, -3.1F, -5.4F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(70, 92).addBox(0.0F, -2.9F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 92).addBox(0.0F, -2.9F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 92).addBox(0.0F, -2.9F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.5F, -0.0077F, -0.004F, -0.7068F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.5F, -0.0059F, -0.0064F, -1.0559F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.1252F, -2.3981F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -1.5F, -0.0023F, -0.0084F, -1.5359F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-5.1252F, -2.3981F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.5F, 0.0573F, 0.2106F, -1.4426F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.5F, 0.1942F, 0.1001F, -0.6098F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.5F, 0.1487F, 0.1603F, -0.9567F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-7.1252F, -2.3981F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -5.5F, 0.0765F, 0.2779F, -1.3856F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -5.5F, 0.2569F, 0.1315F, -0.5502F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(92, 2).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -5.5F, 0.1975F, 0.211F, -0.8953F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(16, 22).mirror().addBox(-8.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -7.5F, 0.0965F, 0.3451F, -1.3271F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 83).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -7.5F, 0.2474F, 0.2612F, -0.8313F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -7.5F, 0.3202F, 0.1624F, -0.4886F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(90, 25).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.2987F, 0.3107F, -0.8168F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(-9.1252F, -2.398F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.1174F, 0.4121F, -1.3193F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -9.5F, 0.3842F, 0.1927F, -0.4773F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -11.3F, 0.3681F, 0.1852F, -0.4629F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -11.3F, 0.2857F, 0.2984F, -0.8032F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-10.1252F, -2.398F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -11.3F, 0.1121F, 0.3954F, -1.304F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(91, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.5F, -0.0077F, 0.004F, 0.7068F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 85).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.5F, -0.0059F, 0.0064F, 1.0559F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 16).addBox(3.1252F, -2.3981F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -1.5F, -0.0023F, 0.0084F, 1.5359F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(91, 87).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.5F, 0.1487F, -0.1603F, 0.9567F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.5F, 0.1942F, -0.1001F, 0.6098F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(91, 12).addBox(3.1252F, -2.3981F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.5F, 0.0573F, -0.2106F, 1.4426F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 17).addBox(3.1252F, -2.398F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -11.3F, 0.1121F, -0.3954F, 1.304F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 72).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -11.3F, 0.2857F, -0.2984F, 0.8032F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(88, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -11.3F, 0.3681F, -0.1852F, 0.4629F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 25).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.2987F, -0.3107F, 0.8168F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.3842F, -0.1927F, 0.4773F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 8).addBox(3.1252F, -2.398F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -9.5F, 0.1174F, -0.4121F, 1.3193F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(90, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -7.5F, 0.3202F, -0.1624F, 0.4886F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 22).addBox(3.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -7.5F, 0.0965F, -0.3451F, 1.3271F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 83).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -7.5F, 0.2474F, -0.2612F, 0.8313F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 52).addBox(3.1252F, -2.3981F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -5.5F, 0.0765F, -0.2779F, 1.3856F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 2).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -5.5F, 0.1975F, -0.211F, 0.8953F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(12, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -5.5F, 0.2569F, -0.1315F, 0.5502F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(77, 92).addBox(0.0F, -1.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 92).addBox(0.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 92).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, 9.2F, 1.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(51, 56).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -12.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 37).addBox(-1.0F, -0.089F, -0.0892F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -12.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -12.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(16, 27).mirror().addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 10.7053F, -4.2842F, 0.304F, -0.5185F, -0.2665F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 10.7053F, -4.2842F, 0.4536F, -0.6332F, -0.3168F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 10.7053F, -4.2842F, 0.6036F, -0.8116F, -0.4637F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 6).addBox(1.7F, -1.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 10.3447F, -6.743F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.0436F, -3.2575F, -3.9752F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 7.1202F, -4.8869F, 1.1378F, -0.2709F, -0.5248F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(0.0F, -1.8611F, -1.9503F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 5.2202F, -4.2869F, 1.0711F, -0.0843F, -0.153F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(9, 77).mirror().addBox(-0.5F, -1.7926F, -0.2084F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 77).addBox(8.5F, -1.7926F, -0.2084F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 3.9202F, -2.3869F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(24, 62).addBox(8.5F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 2.6202F, -2.6869F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-0.5F, -0.0569F, -0.4199F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(74, 39).addBox(8.5F, -0.0569F, -0.4199F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.5F, 3.0202F, -3.9869F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0436F, -3.2575F, -3.9752F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 7.1202F, -4.8869F, 1.1378F, 0.2709F, 0.5248F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(24, 41).addBox(-1.0F, -1.8611F, -1.9503F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 5.2202F, -4.2869F, 1.0711F, 0.0843F, 0.153F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(38, 0).addBox(-4.0F, -2.2204F, -4.7049F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.1F, 2.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -0.0558F, -0.0324F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9F, -6.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(17, 53).addBox(-1.0F, 0.1428F, 0.153F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(90, 92).addBox(0.0F, -1.5572F, 4.153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 93).addBox(0.0F, -1.5572F, 2.153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 93).addBox(0.0F, -1.5572F, 0.153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -6.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 41).mirror().addBox(-11.1252F, -2.3981F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.3F, 0.1121F, 0.3954F, -1.2865F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.3F, 0.3681F, 0.1852F, -0.4454F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.3F, 0.2857F, 0.2984F, -0.7858F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -3.3F, 0.3842F, 0.1927F, -0.4773F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(6, 78).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -3.3F, 0.2987F, 0.3107F, -0.8168F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-10.1252F, -2.3981F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -3.3F, 0.1174F, 0.4121F, -1.3193F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(61, 41).mirror().addBox(-10.1252F, -2.3981F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -5.3F, 0.1228F, 0.4289F, -1.352F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 56).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -5.3F, 0.3117F, 0.323F, -0.8477F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(8, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -5.3F, 0.4002F, 0.2001F, -0.5091F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(8, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -5.3F, 0.4002F, -0.2001F, 0.5091F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 56).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -5.3F, 0.3117F, -0.323F, 0.8477F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 41).addBox(3.1252F, -2.3981F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -5.3F, 0.1228F, -0.4289F, 1.352F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7053F, -4.2842F, 0.304F, 0.5185F, 0.2665F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7053F, -4.2842F, 0.4536F, 0.6332F, 0.3168F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 72).addBox(-0.5F, -0.0831F, 0.0502F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7053F, -4.2842F, 0.6036F, 0.8116F, 0.4637F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(6, 78).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -3.3F, 0.2987F, -0.3107F, 0.8168F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(74, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -3.3F, 0.3842F, -0.1927F, 0.4773F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 8).addBox(3.1252F, -2.3981F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -3.3F, 0.1174F, -0.4121F, 1.3193F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(81, 40).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -1.3F, 0.2857F, -0.2984F, 0.7858F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(37, 41).addBox(3.1252F, -2.3981F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -1.3F, 0.1121F, -0.3954F, 1.2865F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(28, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -1.3F, 0.3681F, -0.1852F, 0.4454F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(52, 74).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 8.4F, -4.2F, 1.0718F, 0.0F, -0.1396F));

		PartDefinition arm2 = upperarm2.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(74, 27).addBox(-0.7F, -0.6282F, -1.0842F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(-0.2F, -0.6282F, -2.8842F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 6.5F, 0.8F, -1.6157F, -0.364F, -1.4434F));

		PartDefinition hand2 = arm2.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6718F, -1.0842F, -0.0405F, 0.0253F, 1.0904F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 8.4F, -4.2F, -0.1063F, 0.0F, 0.1396F));

		PartDefinition arm3 = upperarm3.addOrReplaceChild("arm3", CubeListBuilder.create().texOffs(71, 52).addBox(-1.3F, -0.6282F, -1.0842F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 82).addBox(-0.8F, -0.6282F, -2.8842F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 6.5F, 0.8F, -1.6762F, -1.1608F, 1.5561F));

		PartDefinition hand3 = arm3.addOrReplaceChild("hand3", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6718F, -1.0842F, 0.0004F, 0.0477F, 1.0472F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -5.2F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r103 = neck3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(42, 93).addBox(0.5F, -3.4046F, 2.876F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 93).addBox(0.5F, -3.3046F, 0.876F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 19).addBox(0.0F, -1.8046F, -0.124F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6F, -4.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-8.1252F, -2.398F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.8F, 0.1546F, 0.5297F, -1.3375F));

		PartDefinition cube_r105 = neck3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.8F, 0.3907F, 0.3972F, -0.8199F));

		PartDefinition cube_r106 = neck3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.8F, 0.4968F, 0.2459F, -0.4878F));

		PartDefinition cube_r107 = neck3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 33).mirror().addBox(-4.8794F, -0.684F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -3.6F, 0.6152F, 0.641F, -1.023F));

		PartDefinition cube_r108 = neck3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -3.6F, 0.7735F, 0.4155F, -0.7128F));

		PartDefinition cube_r109 = neck3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(75, 58).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.415F, -5.6017F, -0.523F, -0.4119F, 0.1361F));

		PartDefinition cube_r110 = neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 58).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.415F, -5.6017F, -0.523F, 0.4119F, -0.1361F));

		PartDefinition cube_r111 = neck3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(45, 54).addBox(0.0F, -0.0329F, 0.0129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -4.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r112 = neck3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 33).addBox(1.8794F, -0.684F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -3.6F, 0.6152F, -0.641F, 1.023F));

		PartDefinition cube_r113 = neck3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(92, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -3.6F, 0.7735F, -0.4155F, 0.7128F));

		PartDefinition cube_r114 = neck3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(57, 33).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.8F, 0.3907F, -0.3972F, 0.8199F));

		PartDefinition cube_r115 = neck3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 22).addBox(3.1252F, -2.398F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.8F, 0.1546F, -0.5297F, 1.3375F));

		PartDefinition cube_r116 = neck3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(92, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -1.8F, 0.4968F, -0.2459F, 0.4878F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -4.8F, -0.0873F, -0.3491F, 0.0F));

		PartDefinition cube_r117 = neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 93).addBox(0.5F, -1.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 93).addBox(0.5F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 94).addBox(0.5F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 71).addBox(0.0F, -0.1F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -5.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.615F, -2.8017F, -0.3093F, -0.3233F, 0.0746F));

		PartDefinition cube_r119 = neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 46).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.715F, -4.8017F, -0.2374F, -0.307F, 0.0678F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(77, 6).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.615F, -2.8017F, -0.3093F, 0.3233F, -0.0746F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(49, 46).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.715F, -4.8017F, -0.2374F, 0.307F, -0.0678F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 52).addBox(-0.5F, -0.0259F, -0.0131F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8434F, -5.0283F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r123 = neck.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 16).addBox(0.5F, -1.5F, 0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 71).addBox(0.0F, -0.5F, -1.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.315F, -1.8017F, -0.2157F, -0.2389F, 0.0518F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(78, 87).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.315F, -1.8017F, -0.2157F, 0.2389F, -0.0518F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 15).addBox(-0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0394F, -2.4712F, 0.2007F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 65).addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.7339F, -9.6197F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 85).addBox(-1.0F, -0.1386F, -2.0122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.4F, -10.2F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(80, 54).addBox(-2.0F, -0.7F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.1244F, -2.1587F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(38, 79).addBox(-2.0F, -0.4756F, -0.0364F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.1F, -2.7F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, 1.4962F, 0.0827F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 25).addBox(-1.0F, 0.5962F, -0.0173F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 36).addBox(-1.0F, -0.3038F, -0.0173F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 6.4F, -5.0F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(54, 66).addBox(-1.0F, -2.7527F, -0.0186F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2F, -2.9F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(49, 10).mirror().addBox(-0.92F, -0.6F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 10).addBox(0.92F, -0.6F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1125F, -7.1129F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(81, 58).addBox(-1.5F, -0.5F, -1.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, 5.9134F, -6.2127F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 63).addBox(-1.0F, 0.0733F, -0.1155F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.6F, -7.5F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(83, 77).addBox(-1.0F, -0.1F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.9414F, -8.7717F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(21, 85).addBox(-1.0F, -1.0273F, 0.0159F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -8.4F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(34, 71).addBox(-1.0F, 0.0047F, -1.4389F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.6F, -9.1F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(59, 82).addBox(-1.0F, 0.0575F, -2.0073F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4F, -7.8F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(13, 68).addBox(-0.5F, -0.0075F, -3.9993F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.1F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(-0.92F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 52).addBox(0.12F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.1107F, -8.6558F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(18, 52).mirror().addBox(-1.92F, 0.6F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 46).mirror().addBox(-2.42F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 72).mirror().addBox(-2.54F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(68, 43).mirror().addBox(-2.75F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(16, 11).mirror().addBox(-2.42F, -1.4F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(16, 11).addBox(0.62F, -1.4F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(18, 52).addBox(0.12F, 0.6F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 43).addBox(0.95F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(8, 72).addBox(0.74F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 46).addBox(0.62F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9533F, -2.2641F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-1.92F, 0.0587F, 0.0167F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(27, 0).addBox(0.12F, 0.0587F, 0.0167F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 0.9533F, -4.0641F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 46).mirror().addBox(-1.92F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 46).addBox(1.12F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 0.7273F, -1.9832F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-1.92F, 0.0F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(92, 46).addBox(1.12F, 0.0F, -1.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 0.0065F, -2.0184F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(7, 11).mirror().addBox(-1.92F, 0.2938F, -0.5158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(7, 11).addBox(1.12F, 0.2938F, -0.5158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 2.7598F, 1.4271F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(24, 13).mirror().addBox(-1.0F, -2.9974F, -0.0385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(24, 13).addBox(2.0F, -2.9974F, -0.0385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.6F, 2.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.92F, -2.8027F, -0.7518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(1.12F, -2.8027F, -0.7518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.7598F, -1.1729F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, -0.985F, -0.9468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 62).addBox(2.0F, -0.985F, -0.9468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.3F, 2.5F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(89, 62).mirror().addBox(-1.0F, -0.7497F, -2.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(89, 62).addBox(2.0F, -0.7497F, -2.0107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.1F, 2.2F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(46, 81).mirror().addBox(-1.0F, -0.0509F, -0.0252F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 81).addBox(2.0F, -0.0509F, -0.0252F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1F, -0.2F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(57, 24).addBox(-2.0F, -2.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5F, -1.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(65, 66).addBox(-2.0F, -0.9592F, -0.0215F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, -0.6F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 21).addBox(-2.0F, -0.4974F, -0.0385F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -0.1F, 1.9199F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2703F, 0.6012F, -5.6233F, 0.5477F, 0.581F, 0.0424F));

		PartDefinition cube_r155 = crestl.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 77).addBox(-2.9357F, -0.4533F, -2.93F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.024F, 0.4748F, 1.9716F, 0.0F, -0.0873F, 0.0F));

		PartDefinition crestl2 = crestl.addOrReplaceChild("crestl2", CubeListBuilder.create().texOffs(83, 0).addBox(-4.9605F, -0.1531F, 0.624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0185F, -0.0787F, 2.6969F, -0.211F, -0.5263F, -0.0234F));

		PartDefinition cube_r156 = crestl2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(89, 68).addBox(-1.153F, -0.0017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9577F, -0.176F, 2.6187F, -0.0356F, -0.5238F, -0.013F));

		PartDefinition crestl3 = head.addOrReplaceChild("crestl3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2703F, 0.6012F, -5.6233F, 0.5477F, -0.581F, -0.0424F));

		PartDefinition cube_r157 = crestl3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-0.0643F, -0.4533F, -2.93F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.024F, 0.4748F, 1.9716F, 0.0F, 0.0873F, 0.0F));

		PartDefinition crestl4 = crestl3.addOrReplaceChild("crestl4", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(2.9605F, -0.1531F, 0.624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0185F, -0.0787F, 2.6969F, -0.211F, 0.5263F, 0.0234F));

		PartDefinition cube_r158 = crestl4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(0.153F, -0.0017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9577F, -0.176F, 2.6187F, -0.0356F, 0.5238F, 0.013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 2.9F, 3.2F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-1.0F, -0.3372F, -3.4721F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 48).mirror().addBox(-1.2F, 0.0628F, -3.9721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(87, 87).addBox(1.4F, -0.3372F, -3.4721F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(78, 48).addBox(0.6F, 0.0628F, -3.9721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1F, -2.0F, -6.2F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 54).mirror().addBox(-1.0F, -1.0041F, -1.0137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(65, 10).mirror().addBox(-1.0F, -1.0041F, -1.4137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 54).addBox(-0.2F, -1.0041F, -1.0137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 10).addBox(-0.2F, -1.0041F, -1.4137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -3.1F, -11.7F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-1.0F, -0.4541F, -2.6481F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 27).mirror().addBox(-1.2F, 0.0459F, -1.6481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 46).addBox(0.4F, -0.4541F, -2.6481F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(65, 19).addBox(-1.4F, 0.0459F, -2.6481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(90, 27).addBox(-0.4F, 0.0459F, -1.6481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -3.5F, -9.7F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-1.0F, -0.9404F, -1.5388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(33, 90).addBox(-0.2F, -0.9404F, -1.5388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8F, -2.3F, -10.4F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(31, 79).mirror().addBox(-1.0F, -1.0019F, -3.9294F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 79).addBox(0.8F, -1.0019F, -3.9294F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.6F, -6.9F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-1.0F, -0.9864F, -1.7975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 51).addBox(1.8F, -0.9864F, -1.7975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.1F, -5.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.0F, -1.8F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 78).addBox(1.8F, -1.8F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8F, 1.0F, -2.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-1.0F, -0.0446F, -2.0117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(90, 33).addBox(0.8F, -0.0446F, -2.0117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, -2.2F, -5.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-1.0F, -0.0069F, -1.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(89, 21).addBox(1.8F, -0.0069F, -1.9529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8F, -1.8F, -3.7F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 58).addBox(2.34F, -0.9F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.32F, 0.0904F, -4.3239F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-1.0F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 53).addBox(1.8F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.0F, -0.3F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(82, 43).mirror().addBox(-1.0F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(82, 43).addBox(1.8F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8F, 0.0F, -0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(27, 27).addBox(-1.0F, -0.8F, 0.2F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 5.7F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r171 = tail.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 46).addBox(0.0F, -2.7F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 53).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 54).addBox(0.0F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 62).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 84).addBox(0.0F, 1.4F, 6.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 88).addBox(0.0F, 0.3F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 87).addBox(0.0F, -0.4F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 16).addBox(0.0F, -1.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4397F, 3.1541F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(26, 62).mirror().addBox(0.0F, -2.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 62).mirror().addBox(0.0F, -2.0F, 2.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 62).mirror().addBox(0.0F, -1.9F, 4.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 62).mirror().addBox(0.0F, -1.8F, 6.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 62).mirror().addBox(0.0F, -1.7F, 8.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1684F, 1.1181F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r174 = tail.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(26, 62).addBox(0.0F, -1.7F, 8.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -1.8F, 6.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -1.9F, 4.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -2.0F, 2.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -2.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1684F, 1.1181F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r175 = tail.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(26, 62).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(9, 94).addBox(0.0F, -3.1F, 9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 94).addBox(0.0F, -2.8F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 94).addBox(0.0F, -2.4F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 26).addBox(0.0F, -2.2F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 13).addBox(0.0F, -2.0F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2F, 0.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r179 = tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2F, 2.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2F, 4.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r181 = tail2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 6.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r182 = tail2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2F, 8.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r183 = tail2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.2F, 10.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r184 = tail2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.2F, 10.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r185 = tail2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.2F, 8.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r186 = tail2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 6.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r187 = tail2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.2F, 4.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r188 = tail2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2F, 2.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r189 = tail2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(39, 13).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2F, 0.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r190 = tail2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 6.2F, 16.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 71).addBox(0.0F, 4.7F, 14.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 19).addBox(0.0F, 4.0F, 12.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(0.0F, 3.4F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 74).addBox(0.0F, 1.8F, 8.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4397F, -7.8459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, 0.0F, 0.1F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 69).addBox(-0.5F, -0.6985F, -0.0349F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(65, 0).addBox(-0.5F, -0.6985F, 4.9651F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 11.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r192 = tail3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 39).addBox(0.0F, -2.1F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 91).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 94).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6985F, 4.9651F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(58, 25).addBox(0.0F, 10.1F, 26.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 10).addBox(0.0F, 9.4F, 24.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(0.0F, 8.7F, 22.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 78).addBox(0.0F, 8.3F, 20.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(0.0F, 6.7F, 18.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5413F, -18.8808F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(65, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7985F, 4.9651F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(3, 94).addBox(0.0F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 94).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3985F, 0.9651F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(72, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8985F, -0.0349F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3985F, 10.9651F, -0.1855F, 0.3435F, -0.0631F));

		PartDefinition cube_r197 = tail4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(83, 6).addBox(0.0F, -3.0F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 16).addBox(0.0F, -2.6F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 62).addBox(0.0F, -2.1F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 89).addBox(0.0F, -1.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 78).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(24, 94).addBox(0.0F, 12.7F, 34.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 94).addBox(0.0F, 12.1F, 32.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 94).addBox(0.0F, 11.4F, 30.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 94).addBox(0.0F, 10.8F, 28.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9397F, -29.8459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.128F, 0.3031F, -0.0384F));

		PartDefinition cube_r200 = tail5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(16, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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