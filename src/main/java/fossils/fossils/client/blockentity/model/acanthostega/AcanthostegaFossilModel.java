package fossils.fossils.client.blockentity.model.acanthostega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcanthostegaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart body;
	private final ModelPart basin;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tailfin3;
	private final ModelPart tailfin2;
	private final ModelPart tailfin1;
	private final ModelPart upperarm1;
	private final ModelPart arm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart arm2;
	private final ModelPart hand2;
	private final ModelPart neck1;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart eyes1;

	public AcanthostegaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.body = this.chest.getChild("body");
		this.basin = this.body.getChild("basin");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tailfin3 = this.tail3.getChild("tailfin3");
		this.tailfin2 = this.tail2.getChild("tailfin2");
		this.tailfin1 = this.tail1.getChild("tailfin1");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.arm1 = this.upperarm1.getChild("arm1");
		this.hand1 = this.arm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.arm2 = this.upperarm2.getChild("arm2");
		this.hand2 = this.arm2.getChild("hand2");
		this.neck1 = this.chest.getChild("neck1");
		this.head1 = this.neck1.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.eyes1 = this.head2.getChild("eyes1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(32, 21).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(-2.5F, 2.4F, -3.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(55, 28).addBox(1.5F, 2.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 31).addBox(-1.0F, 2.4F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 47).addBox(-0.5F, 2.4F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 28).mirror().addBox(-2.5F, 2.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2F, -8.2F, -0.4678F, 0.0033F, -0.3886F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-0.6F, -0.8695F, -1.9914F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.9155F, 0.0492F, 1.4399F, 0.0F, -0.4276F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(48, 42).mirror().addBox(-0.6F, -0.1755F, -1.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.9155F, -0.6508F, 0.9975F, -0.1927F, -0.3842F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-0.1F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.7F, -0.1F, 0.9599F, 0.0F, 0.2182F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1047F, -0.9847F, 0.6376F, 1.3855F, -0.6641F, 0.0247F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(54, 24).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1047F, -0.9847F, 0.6376F, 1.3855F, 0.6641F, -0.0247F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(40, 21).addBox(-0.9F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 0.7F, -0.1F, 0.9599F, 0.0F, -0.2182F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(48, 42).addBox(-0.4F, -0.1755F, -1.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.9155F, -0.6508F, 0.9975F, 0.1927F, 0.3842F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(45, 32).addBox(-0.4F, -0.8695F, -1.9914F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.9155F, 0.0492F, 1.4399F, 0.0F, 0.4276F));

		PartDefinition neck_r1 = chest.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -1.1353F, 3.5148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r2 = chest.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -1.1353F, 3.5148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r3 = chest.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(6, 46).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -1.1353F, 1.5148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r4 = chest.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(57, 17).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -1.1353F, 1.5148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r5 = chest.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(44, 44).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -1.1353F, 3.5148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r6 = chest.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(57, 14).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -1.1353F, 3.5148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r7 = chest.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(6, 46).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -1.1353F, 1.5148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(40, 21).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9017F, 3.5222F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(14, 41).addBox(0.0F, -0.8144F, 5.7382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -4.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck_r8 = chest.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(57, 17).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -1.1353F, 1.5148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(11, 7).addBox(-0.5F, -0.5087F, 0.1998F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.8F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition neck_r9 = body.addOrReplaceChild("neck_r9", CubeListBuilder.create().texOffs(6, 25).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 10.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r10 = body.addOrReplaceChild("neck_r10", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 10.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r11 = body.addOrReplaceChild("neck_r11", CubeListBuilder.create().texOffs(25, 21).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 8.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r12 = body.addOrReplaceChild("neck_r12", CubeListBuilder.create().texOffs(23, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 8.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r13 = body.addOrReplaceChild("neck_r13", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 6.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r14 = body.addOrReplaceChild("neck_r14", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 6.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r15 = body.addOrReplaceChild("neck_r15", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 4.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r16 = body.addOrReplaceChild("neck_r16", CubeListBuilder.create().texOffs(26, 2).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 4.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r17 = body.addOrReplaceChild("neck_r17", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 2.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r18 = body.addOrReplaceChild("neck_r18", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 2.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r19 = body.addOrReplaceChild("neck_r19", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 0.7148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r20 = body.addOrReplaceChild("neck_r20", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, 0.7148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r21 = body.addOrReplaceChild("neck_r21", CubeListBuilder.create().texOffs(6, 25).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 10.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r22 = body.addOrReplaceChild("neck_r22", CubeListBuilder.create().texOffs(20, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 10.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r23 = body.addOrReplaceChild("neck_r23", CubeListBuilder.create().texOffs(25, 21).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 8.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r24 = body.addOrReplaceChild("neck_r24", CubeListBuilder.create().texOffs(23, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 8.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r25 = body.addOrReplaceChild("neck_r25", CubeListBuilder.create().texOffs(52, 46).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 6.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r26 = body.addOrReplaceChild("neck_r26", CubeListBuilder.create().texOffs(56, 31).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 6.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r27 = body.addOrReplaceChild("neck_r27", CubeListBuilder.create().texOffs(26, 2).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 4.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r28 = body.addOrReplaceChild("neck_r28", CubeListBuilder.create().texOffs(50, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 4.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r29 = body.addOrReplaceChild("neck_r29", CubeListBuilder.create().texOffs(11, 35).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 2.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r30 = body.addOrReplaceChild("neck_r30", CubeListBuilder.create().texOffs(0, 57).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 2.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck11_r1 = body.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, -1.6F, -0.5052F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4969F, 10.7252F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck10_r1 = body.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(37, 55).addBox(0.0F, -1.5F, -0.5044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5144F, 8.7244F, -0.0611F, 0.0F, 0.0F));

		PartDefinition neck9_r1 = body.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(7, 38).addBox(0.0F, -1.2F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 34).addBox(0.0F, -0.9F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 39).addBox(0.0F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8017F, -1.2778F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck_r31 = body.addOrReplaceChild("neck_r31", CubeListBuilder.create().texOffs(38, 15).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 0.7148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r32 = body.addOrReplaceChild("neck_r32", CubeListBuilder.create().texOffs(57, 0).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, 0.7148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition basin = body.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 12.2F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition tailbase_r1 = basin.addOrReplaceChild("tailbase_r1", CubeListBuilder.create().texOffs(12, 5).mirror().addBox(-2.9283F, 2.9239F, -0.7506F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6637F, 3.9675F, 0.0164F, 0.006F, -0.349F));

		PartDefinition tailbase_r2 = basin.addOrReplaceChild("tailbase_r2", CubeListBuilder.create().texOffs(31, 44).mirror().addBox(-0.5F, 0.2335F, -0.9372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.6449F, 5.2816F, -0.5854F, -0.0284F, -0.4039F));

		PartDefinition tailbase_r3 = basin.addOrReplaceChild("tailbase_r3", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.4F, -1.795F, -0.7192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).addBox(1.4F, -1.795F, -0.7192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6637F, 3.9675F, -1.8151F, 0.0F, 0.0F));

		PartDefinition tailbase_r4 = basin.addOrReplaceChild("tailbase_r4", CubeListBuilder.create().texOffs(31, 44).addBox(-0.5F, 0.2335F, -0.9372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.6449F, 5.2816F, -0.5854F, 0.0284F, 0.4039F));

		PartDefinition tailbase_r5 = basin.addOrReplaceChild("tailbase_r5", CubeListBuilder.create().texOffs(12, 5).addBox(1.9283F, 2.9239F, -0.7506F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6637F, 3.9675F, 0.0164F, -0.006F, 0.349F));

		PartDefinition tailbase_r6 = basin.addOrReplaceChild("tailbase_r6", CubeListBuilder.create().texOffs(0, 32).addBox(-1.6F, 3.7048F, -0.7506F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.6637F, 3.9675F, 0.0175F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(21, 21).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 0.0131F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck_r33 = basin.addOrReplaceChild("neck_r33", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 6.3148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r34 = basin.addOrReplaceChild("neck_r34", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 6.3148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r35 = basin.addOrReplaceChild("neck_r35", CubeListBuilder.create().texOffs(6, 19).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 4.3148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r36 = basin.addOrReplaceChild("neck_r36", CubeListBuilder.create().texOffs(11, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 4.3148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r37 = basin.addOrReplaceChild("neck_r37", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 2.3148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r38 = basin.addOrReplaceChild("neck_r38", CubeListBuilder.create().texOffs(21, 21).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 2.3148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r39 = basin.addOrReplaceChild("neck_r39", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 0.3148F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r40 = basin.addOrReplaceChild("neck_r40", CubeListBuilder.create().texOffs(17, 56).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0353F, 0.3148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r41 = basin.addOrReplaceChild("neck_r41", CubeListBuilder.create().texOffs(0, 19).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 6.3148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r42 = basin.addOrReplaceChild("neck_r42", CubeListBuilder.create().texOffs(56, 5).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 6.3148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r43 = basin.addOrReplaceChild("neck_r43", CubeListBuilder.create().texOffs(6, 19).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 4.3148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r44 = basin.addOrReplaceChild("neck_r44", CubeListBuilder.create().texOffs(11, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 4.3148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r45 = basin.addOrReplaceChild("neck_r45", CubeListBuilder.create().texOffs(21, 21).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 2.3148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r46 = basin.addOrReplaceChild("neck_r46", CubeListBuilder.create().texOffs(14, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 2.3148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r47 = basin.addOrReplaceChild("neck_r47", CubeListBuilder.create().texOffs(0, 25).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 0.3148F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck16_r1 = basin.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(12, 5).addBox(0.0F, -2.4F, 5.4939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(0.0F, -2.3F, 3.4939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(0.0F, -2.0F, 1.4939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 9).addBox(0.0F, -1.7F, -0.5061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4795F, 0.426F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck_r48 = basin.addOrReplaceChild("neck_r48", CubeListBuilder.create().texOffs(17, 56).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.0353F, 0.3148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(12, 21).addBox(-0.5723F, -0.244F, -1.5389F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 50).addBox(-0.5723F, -0.244F, -0.5389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.8F, 6.3F, 1.0629F, 0.0345F, -1.2827F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(45, 54).addBox(-0.5F, -0.0716F, -1.1518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 34).addBox(-0.5F, -0.0716F, 0.1482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0723F, 3.856F, -0.9389F, 0.3201F, 0.3415F, 0.1731F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6284F, 0.3482F, 0.1487F, 0.0031F, -0.0003F));

		PartDefinition feet7_r1 = feet1.addOrReplaceChild("feet7_r1", CubeListBuilder.create().texOffs(51, 30).addBox(-0.4909F, -0.4658F, -0.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1242F, 0.7688F, 1.0618F, 0.1867F, 0.037F, -0.0224F));

		PartDefinition feet6_r1 = feet1.addOrReplaceChild("feet6_r1", CubeListBuilder.create().texOffs(43, 49).addBox(-0.4987F, -0.4251F, -0.3842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1242F, 0.7688F, 0.4618F, 0.068F, 0.013F, -0.0089F));

		PartDefinition feet5_r1 = feet1.addOrReplaceChild("feet5_r1", CubeListBuilder.create().texOffs(48, 49).addBox(-0.4987F, -0.4251F, -0.8842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1242F, 0.7688F, 0.4618F, -0.034F, -0.0062F, 0.0048F));

		PartDefinition feet4_r1 = feet1.addOrReplaceChild("feet4_r1", CubeListBuilder.create().texOffs(32, 50).addBox(-0.4814F, -0.3113F, -0.8748F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1242F, 0.6688F, -0.0382F, -0.1704F, -0.0295F, 0.026F));

		PartDefinition feet3_r1 = feet1.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(7, 51).addBox(-0.4516F, -0.3927F, -0.8036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1242F, 0.6688F, -0.6382F, -0.3074F, -0.0497F, 0.0502F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(12, 51).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4F, -1.5F, -0.4278F, -0.0644F, 0.0735F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4F, -1.5F, -0.5572F, -0.077F, 0.1003F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(12, 21).mirror().addBox(-0.4277F, -0.244F, -1.5389F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 50).mirror().addBox(-0.4277F, -0.244F, -0.5389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.8F, 6.3F, -0.6824F, -0.0345F, 1.2827F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-0.5F, -0.0716F, -1.1518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 34).mirror().addBox(-0.5F, -0.0716F, 0.1482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0723F, 3.856F, -0.9389F, 0.2139F, 0.0329F, -0.0523F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6284F, 0.3482F, 0.1478F, 0.0162F, -0.1292F));

		PartDefinition feet8_r1 = feet2.addOrReplaceChild("feet8_r1", CubeListBuilder.create().texOffs(51, 30).mirror().addBox(-0.5091F, -0.4658F, -0.4828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 0.7688F, 1.0618F, 0.1867F, -0.037F, 0.0224F));

		PartDefinition feet7_r2 = feet2.addOrReplaceChild("feet7_r2", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-0.5013F, -0.4251F, -0.3842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 0.7688F, 0.4618F, 0.068F, -0.013F, 0.0089F));

		PartDefinition feet6_r2 = feet2.addOrReplaceChild("feet6_r2", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-0.5013F, -0.4251F, -0.8842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 0.7688F, 0.4618F, -0.034F, 0.0062F, -0.0048F));

		PartDefinition feet5_r2 = feet2.addOrReplaceChild("feet5_r2", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-0.5186F, -0.3113F, -0.8748F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 0.6688F, -0.0382F, -0.1704F, 0.0295F, -0.026F));

		PartDefinition feet4_r2 = feet2.addOrReplaceChild("feet4_r2", CubeListBuilder.create().texOffs(7, 51).mirror().addBox(-0.5484F, -0.3927F, -0.8036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 0.6688F, -0.6382F, -0.3074F, 0.0497F, -0.0502F));

		PartDefinition feet3_r2 = feet2.addOrReplaceChild("feet3_r2", CubeListBuilder.create().texOffs(12, 51).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -1.5F, -0.4278F, 0.0644F, -0.0735F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -1.5F, -0.5572F, 0.077F, -0.1003F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 7.9F, 0.0649F, -0.392F, -0.0419F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(56, 10).addBox(0.0F, 1.4003F, 3.9826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 56).addBox(0.0F, 0.7003F, 1.9826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(0.0F, 0.0003F, -0.0174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.3142F, 0.0F, 0.0F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck_r49 = tail1.addOrReplaceChild("neck_r49", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(0.0451F, -2.4702F, 0.4186F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 45).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.1353F, 0.3148F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r50 = tail1.addOrReplaceChild("neck_r50", CubeListBuilder.create().texOffs(12, 0).addBox(-0.0451F, -2.4702F, 0.4186F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 45).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -0.1353F, 0.3148F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck15_r1 = tail1.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(19, 5).addBox(0.0F, -2.5F, 7.4939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6795F, -7.574F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3F, 5.8F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition tail6_r1 = tail2.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(55, 55).addBox(0.0F, 2.6003F, 7.5826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 55).addBox(0.0F, 2.1003F, 5.9826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -5.9F, 0.3142F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, 0.1412F, 0.6488F, 0.0952F));

		PartDefinition tailfin3 = tail3.addOrReplaceChild("tailfin3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.8966F, 0.2216F, 0.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.9F, -0.5F));

		PartDefinition tailfin2 = tail2.addOrReplaceChild("tailfin2", CubeListBuilder.create().texOffs(31, 31).addBox(0.0F, -0.8889F, 2.8592F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 39).addBox(0.0F, -0.8889F, -0.1408F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.7F, 0.0F));

		PartDefinition tailfin1 = tail1.addOrReplaceChild("tailfin1", CubeListBuilder.create().texOffs(24, 39).addBox(0.0F, -0.8819F, -1.1794F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.8F, 3.2F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(40, 40).addBox(-0.6534F, -0.133F, -0.9622F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 55).addBox(-0.1534F, 1.967F, 0.7378F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 1.6F, 0.7F, -0.7104F, 0.3076F, -1.7447F));

		PartDefinition arm1 = upperarm1.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(52, 16).addBox(-0.6F, 0.0378F, -1.5481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0534F, 4.167F, 0.1378F, -0.3676F, 0.4721F, 0.2383F));

		PartDefinition arm2_r1 = arm1.addOrReplaceChild("arm2_r1", CubeListBuilder.create().texOffs(32, 55).addBox(0.0F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.8378F, 0.4519F, -0.1607F, -0.0678F, 0.015F));

		PartDefinition hand1 = arm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3378F, -0.7481F, 0.0989F, -0.2207F, -0.0392F));

		PartDefinition hand3_r1 = hand1.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(17, 51).addBox(-0.581F, -0.9536F, -0.3501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0824F, 0.9405F, 0.4101F, -0.0079F, -0.149F, 0.0499F));

		PartDefinition hand4_r1 = hand1.addOrReplaceChild("hand4_r1", CubeListBuilder.create().texOffs(49, 24).addBox(-0.6269F, -0.9031F, 0.2691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0824F, 0.9405F, 0.4101F, 0.1944F, -0.0644F, 0.0304F));

		PartDefinition hand6_r1 = hand1.addOrReplaceChild("hand6_r1", CubeListBuilder.create().texOffs(37, 51).addBox(-0.8892F, -0.4227F, 1.3009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0824F, 0.9405F, 0.4101F, 0.5959F, 0.1078F, 0.0436F));

		PartDefinition hand5_r1 = hand1.addOrReplaceChild("hand5_r1", CubeListBuilder.create().texOffs(27, 48).addBox(-0.7389F, -0.7169F, 0.8138F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0824F, 0.9405F, 0.4101F, 0.3947F, 0.0224F, 0.0283F));

		PartDefinition hand4_r2 = hand1.addOrReplaceChild("hand4_r2", CubeListBuilder.create().texOffs(22, 51).addBox(-0.4735F, -0.6901F, -0.172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3203F, 0.4285F, -0.2289F, -0.2346F, 0.1128F, -0.0242F));

		PartDefinition hand3_r2 = hand1.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(32, 21).addBox(-0.4396F, -0.6851F, -0.7108F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3203F, 0.4285F, -0.2289F, -0.4307F, 0.0438F, 0.0286F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(26, 9).addBox(-0.4643F, -0.5479F, -1.28F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3203F, 0.4285F, -0.2289F, -0.6299F, -0.0136F, 0.0937F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(52, 7).addBox(-0.7192F, -0.1058F, -1.7064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3203F, 0.4285F, -0.2289F, -0.9561F, -0.075F, 0.218F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-0.3466F, -0.133F, -0.9622F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 55).mirror().addBox(0.1534F, 1.967F, 0.7378F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.6F, 0.7F, 1.0481F, -0.1046F, 0.9599F));

		PartDefinition arm2 = upperarm2.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-0.4F, 0.0378F, -1.5481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0534F, 4.167F, 0.1378F, -0.3559F, -0.6413F, -0.1841F));

		PartDefinition arm3_r1 = arm2.addOrReplaceChild("arm3_r1", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-1.0F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.8378F, 0.4519F, -0.1607F, 0.0678F, -0.015F));

		PartDefinition hand2 = arm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3378F, -0.7481F, 0.0869F, -0.036F, -0.0284F));

		PartDefinition hand4_r3 = hand2.addOrReplaceChild("hand4_r3", CubeListBuilder.create().texOffs(17, 51).mirror().addBox(-0.419F, -0.9536F, -0.3501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0824F, 0.9405F, 0.4101F, -0.0079F, 0.149F, -0.0499F));

		PartDefinition hand5_r2 = hand2.addOrReplaceChild("hand5_r2", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-0.3731F, -0.9031F, 0.2691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0824F, 0.9405F, 0.4101F, 0.1944F, 0.0644F, -0.0304F));

		PartDefinition hand7_r1 = hand2.addOrReplaceChild("hand7_r1", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(-0.1108F, -0.4227F, 1.3009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0824F, 0.9405F, 0.4101F, 0.5959F, -0.1078F, -0.0436F));

		PartDefinition hand6_r2 = hand2.addOrReplaceChild("hand6_r2", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.2611F, -0.7169F, 0.8138F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0824F, 0.9405F, 0.4101F, 0.3947F, -0.0224F, -0.0283F));

		PartDefinition hand5_r3 = hand2.addOrReplaceChild("hand5_r3", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(-0.5265F, -0.6901F, -0.172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3203F, 0.4285F, -0.2289F, -0.2346F, -0.1128F, 0.0242F));

		PartDefinition hand4_r4 = hand2.addOrReplaceChild("hand4_r4", CubeListBuilder.create().texOffs(32, 21).mirror().addBox(-0.5604F, -0.6851F, -0.7108F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3203F, 0.4285F, -0.2289F, -0.4307F, -0.0438F, -0.0286F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(26, 9).mirror().addBox(-0.5357F, -0.5479F, -1.28F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3203F, 0.4285F, -0.2289F, -0.6299F, 0.0136F, -0.0937F));

		PartDefinition hand2_r2 = hand2.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-0.2808F, -0.1058F, -1.7064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3203F, 0.4285F, -0.2289F, -0.9561F, 0.075F, -0.218F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 0.3F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition neck_r51 = neck1.addOrReplaceChild("neck_r51", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.2353F, -0.4852F, -1.3546F, 0.1822F, 0.9465F));

		PartDefinition neck_r52 = neck1.addOrReplaceChild("neck_r52", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.2353F, -0.4852F, -1.2917F, 0.0395F, 1.4995F));

		PartDefinition neck_r53 = neck1.addOrReplaceChild("neck_r53", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, -2.4852F, -1.3241F, 0.0296F, 0.8136F));

		PartDefinition neck_r54 = neck1.addOrReplaceChild("neck_r54", CubeListBuilder.create().texOffs(29, 57).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.0353F, -2.4852F, -1.3458F, -0.1064F, 1.3651F));

		PartDefinition neck_r55 = neck1.addOrReplaceChild("neck_r55", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2647F, -4.4852F, -1.3729F, -0.2925F, 1.232F));

		PartDefinition neck_r56 = neck1.addOrReplaceChild("neck_r56", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2647F, -4.4852F, -1.2483F, -0.1425F, 0.6708F));

		PartDefinition neck_r57 = neck1.addOrReplaceChild("neck_r57", CubeListBuilder.create().texOffs(26, 57).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.2353F, -0.4852F, -1.2917F, -0.0395F, -1.4995F));

		PartDefinition neck_r58 = neck1.addOrReplaceChild("neck_r58", CubeListBuilder.create().texOffs(51, 52).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.2353F, -0.4852F, -1.3546F, -0.1822F, -0.9465F));

		PartDefinition neck_r59 = neck1.addOrReplaceChild("neck_r59", CubeListBuilder.create().texOffs(29, 57).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, -2.4852F, -1.3458F, 0.1064F, -1.3651F));

		PartDefinition neck_r60 = neck1.addOrReplaceChild("neck_r60", CubeListBuilder.create().texOffs(26, 0).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.0353F, -2.4852F, -1.3241F, -0.0296F, -0.8136F));

		PartDefinition neck_r61 = neck1.addOrReplaceChild("neck_r61", CubeListBuilder.create().texOffs(57, 34).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 0.2647F, -4.4852F, -1.3729F, 0.2925F, -1.232F));

		PartDefinition neck_r62 = neck1.addOrReplaceChild("neck_r62", CubeListBuilder.create().texOffs(36, 0).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 0.2647F, -4.4852F, -1.2483F, 0.1425F, -0.6708F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(43, 5).addBox(0.0F, -0.8144F, 3.7382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(0.0F, -0.7144F, 1.7382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 21).addBox(-0.5F, -0.1165F, -1.3167F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head1 = neck1.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(16, 31).addBox(-1.0F, -1.4057F, -6.1386F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2012F, -4.7433F, -0.0326F, 0.1546F, -0.0548F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-0.6F, -0.1F, -2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9936F, 0.9698F, -2.6509F, -0.1803F, 0.0224F, 1.4942F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-0.7024F, -2.2983F, -0.0255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 1.2943F, -0.7386F, 0.0262F, 0.0F, 1.1432F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0341F, -4.366F, 0.138F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 1.2943F, -4.8386F, -0.192F, 0.0F, 1.1432F));

		PartDefinition head4_r2 = head1.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(8, 41).mirror().addBox(-0.6F, -1.1F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4057F, -1.6386F, 0.0F, -0.1222F, 0.0F));

		PartDefinition head3_r2 = head1.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(8, 41).addBox(-0.4F, -1.1F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -0.4057F, -1.6386F, 0.0F, 0.1222F, 0.0F));

		PartDefinition head3_r3 = head1.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(43, 5).addBox(-0.4F, -0.1F, -2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9936F, 0.9698F, -2.6509F, -0.1803F, -0.0224F, -1.4942F));

		PartDefinition head2_r2 = head1.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0341F, -4.366F, 0.138F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 1.2943F, -4.8386F, -0.192F, 0.0F, -1.1432F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(46, 19).addBox(-0.2976F, -2.2983F, -0.0255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7F, 1.2943F, -0.7386F, 0.0262F, 0.0F, -1.1432F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create().texOffs(43, 26).addBox(3.0F, 0.171F, -2.6302F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 26).mirror().addBox(-4.0F, 0.171F, -2.6302F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7948F, 0.4842F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(21, 21).mirror().addBox(-0.1861F, 0.0F, -0.001F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, -0.029F, -5.5302F, -0.0349F, -0.1396F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 44).addBox(6.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-3.5F, 2.171F, -2.5302F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.171F, -5.4302F, 0.0F, -0.1396F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(21, 21).addBox(0.1861F, 0.0F, -0.001F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -0.029F, -5.5302F, -0.0349F, 0.1396F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 1.171F, -5.4302F, 0.0F, 0.1396F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(46, 0).addBox(-1.5F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 59).addBox(-1.0F, -1.2F, -5.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.171F, -5.3302F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(40, 34).mirror().addBox(-0.3071F, -19.2923F, 0.5534F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(-0.6071F, -19.0923F, 0.5534F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 18.0923F, -4.6183F, 0.0F, -0.2182F, 0.0F));

		PartDefinition jaw6_r1 = jaw2.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(0.2365F, -0.8986F, 1.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(54, 1).mirror().addBox(0.5365F, -1.0986F, 0.2127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(0.2365F, -0.8986F, -0.0873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.104F, -6.069F, -0.0139F, -0.6973F, 0.0382F));

		PartDefinition jaw4_r3 = jaw2.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-0.0455F, -1.0F, 0.0502F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5596F, 0.4F, -4.227F, -0.1396F, -0.2182F, 0.0F));

		PartDefinition jaw5_r2 = jaw2.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(55, 42).addBox(-1.2365F, -0.8986F, 1.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(54, 1).addBox(-0.5365F, -1.0986F, 0.2127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-1.2365F, -0.8986F, -0.0873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, -0.104F, -6.069F, -0.0139F, 0.6973F, -0.0382F));

		PartDefinition jaw4_r4 = jaw2.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(40, 34).addBox(0.3071F, -19.2923F, 0.5534F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-0.3929F, -19.0923F, 0.5534F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 18.0923F, -4.6183F, 0.0F, 0.2182F, 0.0F));

		PartDefinition jaw3_r3 = jaw2.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(36, 28).addBox(-0.9545F, -1.0F, 0.0502F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5596F, 0.4F, -4.227F, -0.1396F, 0.2182F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.1367F, 0.0F, 0.0F));

		PartDefinition jaw5_r3 = jaw3.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(49, 3).mirror().addBox(0.2491F, 0.0095F, 0.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.604F, -6.069F, 0.0276F, -0.6947F, -0.0762F));

		PartDefinition jaw4_r5 = jaw3.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(49, 3).addBox(-1.2491F, 0.0095F, 0.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, -0.604F, -6.069F, 0.0276F, 0.6947F, 0.0762F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(11, 32).addBox(-1.5F, 0.0995F, -6.0228F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 34).addBox(-1.0F, 0.2995F, -5.7228F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2052F, -5.0158F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, 0.0F, 0.1367F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head3.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(13, 46).mirror().addBox(0.2F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4148F, 2.3287F, -1.2586F, -0.083F, -0.2188F, 0.0F));

		PartDefinition head10_r1 = head3.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(0.1F, -1.1F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8074F, 2.4818F, -3.0908F, 0.0F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head3.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5865F, 2.167F, -3.6198F, -0.1265F, -0.3235F, 0.0F));

		PartDefinition head8_r2 = head3.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(27, 53).mirror().addBox(0.3F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9236F, 1.6938F, -5.3482F, -0.2386F, -0.7095F, 0.0F));

		PartDefinition head9_r1 = head3.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5391F, 1.9826F, -4.568F, -0.1513F, -0.7095F, 0.0F));

		PartDefinition head7_r2 = head3.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(43, 15).mirror().addBox(0.0471F, -0.5245F, -1.8982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5533F, 1.772F, -4.687F, -0.1077F, -0.7095F, -0.2468F));

		PartDefinition head7_r3 = head3.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(36, 47).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9906F, 1.0469F, -2.9853F, 0.0042F, -0.0181F, -0.4161F));

		PartDefinition head6_r1 = head3.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(44, 9).mirror().addBox(-0.1346F, 0.1841F, -2.0236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3564F, 1.3429F, -2.6742F, 0.0044F, -0.3235F, -0.4175F));

		PartDefinition head10_r2 = head3.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(-1.3779F, 1.7185F, -0.1602F, -0.0015F, -0.097F, -0.4018F));

		PartDefinition head8_r3 = head3.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(10, 46).mirror().addBox(-0.5F, -0.3697F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.23F)).mirror(false)
				.texOffs(21, 39).mirror().addBox(-0.5F, -0.6303F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5518F, 1.3249F, -0.162F, 0.0042F, -0.1228F, -0.4166F));

		PartDefinition head7_r4 = head3.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(0.3404F, -0.8016F, -2.8778F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9533F, 2.672F, 0.013F, 0.0043F, -0.2188F, -0.417F));

		PartDefinition head9_r2 = head3.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(56, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(1.3779F, 1.7185F, -0.1602F, -0.0015F, 0.097F, 0.4018F));

		PartDefinition head9_r3 = head3.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0482F, 0.5946F, 1.838F, -0.1358F, 0.0029F, -0.0327F));

		PartDefinition head8_r4 = head3.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5F, -0.6303F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 46).addBox(-0.5F, -0.3697F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.23F)), PartPose.offsetAndRotation(1.5518F, 1.3249F, -0.162F, 0.0042F, 0.1228F, 0.4166F));

		PartDefinition head7_r5 = head3.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(47, 38).addBox(-3.8404F, -0.8016F, -1.8778F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 0).addBox(-3.3404F, -0.8016F, -2.8778F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9533F, 2.672F, 0.013F, 0.0043F, 0.2188F, 0.417F));

		PartDefinition head7_r6 = head3.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(13, 46).addBox(-0.2F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4148F, 2.3287F, -1.2586F, -0.083F, 0.2188F, 0.0F));

		PartDefinition head9_r4 = head3.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(54, 38).addBox(-1.1F, -1.1F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8074F, 2.4818F, -3.0908F, 0.0F, 0.0F, 0.0F));

		PartDefinition head8_r5 = head3.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(53, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5391F, 1.9826F, -4.568F, -0.1513F, 0.7095F, 0.0F));

		PartDefinition head7_r7 = head3.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(27, 53).addBox(-0.3F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9236F, 1.6938F, -5.3482F, -0.2386F, 0.7095F, 0.0F));

		PartDefinition head6_r2 = head3.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(43, 15).addBox(-2.0471F, -0.5245F, -1.8982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5533F, 1.772F, -4.687F, -0.1077F, 0.7095F, 0.2468F));

		PartDefinition head6_r3 = head3.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9906F, 1.0469F, -2.9853F, 0.0042F, 0.0181F, 0.4161F));

		PartDefinition head6_r4 = head3.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(40, 53).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5865F, 2.167F, -3.6198F, -0.1265F, 0.3235F, 0.0F));

		PartDefinition head5_r1 = head3.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(44, 9).addBox(-1.8654F, 0.1841F, -2.0236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3564F, 1.3429F, -2.6742F, 0.0044F, 0.3235F, 0.4175F));

		PartDefinition head4_r3 = head3.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(50, 13).addBox(-1.0F, 0.0055F, -0.9151F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head3_r4 = head3.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(35, 9).addBox(-1.0F, -0.1111F, -0.4952F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, 0.096F, 0.0F, 0.0F));

		PartDefinition eyes1 = head2.addOrReplaceChild("eyes1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -1.7F, 0.7F, -0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 65);
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