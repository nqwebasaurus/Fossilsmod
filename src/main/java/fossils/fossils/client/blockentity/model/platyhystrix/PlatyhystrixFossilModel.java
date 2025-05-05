package fossils.fossils.client.blockentity.model.platyhystrix;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatyhystrixFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hip;
	private final ModelPart UpperLegR;
	private final ModelPart LowerLegR;
	private final ModelPart FootR;
	private final ModelPart UpperLegR2;
	private final ModelPart LowerLegR2;
	private final ModelPart FootR2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart body;
	private final ModelPart body1;
	private final ModelPart Chest;
	private final ModelPart Head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart UpperArmR;
	private final ModelPart LowerArmR;
	private final ModelPart HandR;
	private final ModelPart UpperArmR2;
	private final ModelPart LowerArmR2;
	private final ModelPart HandR2;
	private final ModelPart root;
	private final ModelPart body2;
	private final ModelPart basin;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart neck;
	private final ModelPart head2;
	private final ModelPart snout1;
	private final ModelPart teeth2;
	private final ModelPart snout2;
	private final ModelPart teeth1;
	private final ModelPart eye2;
	private final ModelPart eye1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart teeth3;
	private final ModelPart lowerjaw2;
	private final ModelPart teeth4;
	private final ModelPart gums2;
	private final ModelPart upperarm1;
	private final ModelPart arm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart arm2;
	private final ModelPart hand2;
	private final ModelPart sail;

	public PlatyhystrixFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hip = this.fossil.getChild("Hip");
		this.UpperLegR = this.Hip.getChild("UpperLegR");
		this.LowerLegR = this.UpperLegR.getChild("LowerLegR");
		this.FootR = this.LowerLegR.getChild("FootR");
		this.UpperLegR2 = this.Hip.getChild("UpperLegR2");
		this.LowerLegR2 = this.UpperLegR2.getChild("LowerLegR2");
		this.FootR2 = this.LowerLegR2.getChild("FootR2");
		this.Tail1 = this.Hip.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.body = this.Hip.getChild("body");
		this.body1 = this.body.getChild("body1");
		this.Chest = this.body1.getChild("Chest");
		this.Head = this.Chest.getChild("Head");
		this.lowerjaw = this.Head.getChild("lowerjaw");
		this.upperjaw = this.Head.getChild("upperjaw");
		this.UpperArmR = this.Chest.getChild("UpperArmR");
		this.LowerArmR = this.UpperArmR.getChild("LowerArmR");
		this.HandR = this.LowerArmR.getChild("HandR");
		this.UpperArmR2 = this.Chest.getChild("UpperArmR2");
		this.LowerArmR2 = this.UpperArmR2.getChild("LowerArmR2");
		this.HandR2 = this.LowerArmR2.getChild("HandR2");
		this.root = this.fossil.getChild("root");
		this.body2 = this.root.getChild("body2");
		this.basin = this.body2.getChild("basin");
		this.tail3 = this.basin.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.neck = this.body2.getChild("neck");
		this.head2 = this.neck.getChild("head2");
		this.snout1 = this.head2.getChild("snout1");
		this.teeth2 = this.snout1.getChild("teeth2");
		this.snout2 = this.snout1.getChild("snout2");
		this.teeth1 = this.head2.getChild("teeth1");
		this.eye2 = this.head2.getChild("eye2");
		this.eye1 = this.head2.getChild("eye1");
		this.jaw1 = this.head2.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.teeth3 = this.jaw2.getChild("teeth3");
		this.lowerjaw2 = this.jaw2.getChild("lowerjaw2");
		this.teeth4 = this.jaw1.getChild("teeth4");
		this.gums2 = this.jaw1.getChild("gums2");
		this.upperarm1 = this.body2.getChild("upperarm1");
		this.arm1 = this.upperarm1.getChild("arm1");
		this.hand1 = this.arm1.getChild("hand1");
		this.upperarm2 = this.body2.getChild("upperarm2");
		this.arm2 = this.upperarm2.getChild("arm2");
		this.hand2 = this.arm2.getChild("hand2");
		this.sail = this.body2.getChild("sail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hip = fossil.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 3.75F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 9).mirror().addBox(-0.1273F, -1.9166F, -0.8695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.9454F, 1.7069F, -1.9649F, 0.123F, -0.3518F));

		PartDefinition cube_r2 = Hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 12).mirror().addBox(-0.1273F, 0.2089F, -2.4799F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.9454F, 1.7069F, 0.1732F, 0.123F, -0.3518F));

		PartDefinition cube_r3 = Hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-0.1273F, -0.1931F, -0.9662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.9454F, 1.7069F, -0.7868F, 0.123F, -0.3518F));

		PartDefinition cube_r4 = Hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.1273F, -1.4033F, -0.6654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 17).mirror().addBox(0.8006F, -1.2187F, -0.6385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.9454F, 1.7069F, 0.0423F, 0.123F, -0.3518F));

		PartDefinition cube_r5 = Hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 12).addBox(-0.8727F, 0.2089F, -2.4799F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 2.9454F, 1.7069F, 0.1732F, -0.123F, 0.3518F));

		PartDefinition cube_r6 = Hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 9).addBox(-0.8727F, -1.9166F, -0.8695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 2.9454F, 1.7069F, -1.9649F, -0.123F, 0.3518F));

		PartDefinition cube_r7 = Hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 31).addBox(-0.8727F, -0.1931F, -0.9662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 2.9454F, 1.7069F, -0.7868F, -0.123F, 0.3518F));

		PartDefinition cube_r8 = Hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 17).addBox(-1.8006F, -1.2187F, -0.6385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-0.8727F, -1.4033F, -0.6654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.9454F, 1.7069F, 0.0423F, -0.123F, 0.3518F));

		PartDefinition cube_r9 = Hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.825F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition UpperLegR = Hip.addOrReplaceChild("UpperLegR", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.25F, 3.3795F, 2.3566F, 0.1707F, 0.8296F, -0.2618F));

		PartDefinition LowerLegR = UpperLegR.addOrReplaceChild("LowerLegR", CubeListBuilder.create().texOffs(9, 31).addBox(0.0F, -0.51F, -0.59F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(22, 4).addBox(0.0F, -0.51F, 0.51F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.795F, 0.0426F, -1.2444F, 0.4134F, 0.2255F, 1.2984F));

		PartDefinition FootR = LowerLegR.addOrReplaceChild("FootR", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -2.26F, -1.64F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4729F, 0.0003F, 0.6126F, 0.4258F, 0.2465F, 0.5699F));

		PartDefinition UpperLegR2 = Hip.addOrReplaceChild("UpperLegR2", CubeListBuilder.create().texOffs(34, 16).mirror().addBox(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 3.3795F, 2.3566F, 0.1219F, 0.3389F, 0.429F));

		PartDefinition LowerLegR2 = UpperLegR2.addOrReplaceChild("LowerLegR2", CubeListBuilder.create().texOffs(9, 31).mirror().addBox(-4.0F, -0.51F, -0.59F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(22, 4).mirror().addBox(-4.0F, -0.51F, 0.51F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.795F, 0.0426F, -1.2444F, 0.3719F, 0.3249F, -1.5815F));

		PartDefinition FootR2 = LowerLegR2.addOrReplaceChild("FootR2", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-1.0F, -2.26F, -1.64F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4729F, 0.0003F, 0.6126F, 0.3686F, -0.1702F, -0.2953F));

		PartDefinition Tail1 = Hip.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.75F, 2.0F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition cube_r10 = Tail1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 9).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.875F, -0.4F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.1755F, -0.5218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1828F, -0.3006F, -0.0547F));

		PartDefinition body = Hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(37, 21).addBox(-0.5F, -0.275F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(3, 43).addBox(-0.02F, -1.8577F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1011F, -0.4186F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 40).addBox(0.0F, -2.0225F, -0.017F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6011F, -1.3186F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 22).addBox(-0.01F, -1.9462F, -0.1131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1011F, -0.4186F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 41).addBox(-0.01F, -3.1099F, -0.0808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6473F, -1.6929F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 41).addBox(-0.02F, -3.0099F, -0.0808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6473F, -1.6929F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 9).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6947F, -1.7257F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(20, 19).addBox(-0.5F, -1.325F, -5.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.75F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r17 = body1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(3, 7).addBox(-0.07F, -7.6087F, 1.7608F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -2.0697F, -4.5924F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 9).addBox(-0.06F, -7.9559F, 0.9939F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -2.0697F, -4.5924F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 39).addBox(0.0F, -3.9843F, -0.7032F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -1.8124F, -0.8232F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 38).addBox(-0.07F, -4.9067F, -0.272F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -5.8124F, -0.8232F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 35).addBox(-0.06F, -4.932F, -0.2438F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -5.8124F, -0.8232F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 39).addBox(-0.07F, -4.9392F, -0.6998F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -6.6762F, -1.9216F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(19, 38).addBox(0.0F, -0.1205F, -0.7048F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -6.6762F, -1.9216F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 40).addBox(-0.06F, -4.8823F, -0.67F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -6.6762F, -1.9216F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 39).addBox(-0.07F, -5.0155F, -0.9088F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -6.822F, -3.0289F, 0.4276F, 0.0F, 0.0F));

		PartDefinition neck_r1 = body1.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(37, 19).mirror().addBox(-2.4066F, 0.3763F, 3.3315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 25).mirror().addBox(-2.2462F, 0.0682F, 1.3618F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 35).mirror().addBox(-2.0858F, -0.2398F, -0.6078F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7104F, -4.6275F, 0.1942F, 0.1001F, -0.4702F));

		PartDefinition neck_r2 = body1.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(20, 19).mirror().addBox(-2.7188F, -1.3812F, 1.3618F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 28).mirror().addBox(-2.3979F, -1.5141F, -0.6078F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7104F, -4.6275F, 0.0846F, 0.2013F, -1.1695F));

		PartDefinition neck_r3 = body1.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(37, 19).addBox(0.4066F, 0.3763F, 3.3315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 25).addBox(0.2462F, 0.0682F, 1.3618F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(0.0858F, -0.2398F, -0.6078F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.7104F, -4.6275F, 0.1942F, -0.1001F, 0.4702F));

		PartDefinition neck_r4 = body1.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(20, 19).addBox(1.7188F, -1.3812F, 1.3618F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 28).addBox(1.3979F, -1.5141F, -0.6078F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.7104F, -4.6275F, 0.0846F, -0.2013F, 1.1695F));

		PartDefinition cube_r26 = body1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(16, 39).addBox(-0.06F, -5.0155F, -0.9088F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -6.822F, -3.0289F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 38).addBox(0.0F, -2.5F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -4.322F, -3.3289F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 38).addBox(0.0F, -4.6335F, -0.245F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, -2.0697F, -4.5924F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Chest = body1.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.25F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 35).addBox(-0.02F, -3.0501F, -0.9733F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1039F, -0.2291F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 43).addBox(-0.01F, -2.9501F, -0.9733F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1039F, -0.2291F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -1.9382F, -0.2891F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0359F, -0.4193F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-0.01F, -1.9575F, -0.7305F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7528F, -1.2279F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.75F, -1.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 31).mirror().addBox(-0.5F, -1.0085F, -0.9353F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.0066F, -0.5949F, -0.2618F, 0.0F, 0.1745F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(-0.4F, -1.4744F, -0.8059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.3066F, -0.5949F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 31).addBox(-0.5F, -1.0085F, -0.9353F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.0066F, -0.5949F, -0.2618F, 0.0F, -0.1745F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 19).addBox(-3.5F, -0.5F, -2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-4.5F, -0.5F, -0.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.7321F, -1.2008F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(32, 36).addBox(-0.6F, -1.4744F, -0.8059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.3066F, -0.5949F, 0.0F, 0.0F, -0.1745F));

		PartDefinition neck_r5 = Chest.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-3.422F, -1.5041F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7104F, -1.3775F, 0.0335F, 0.0806F, -1.1767F));

		PartDefinition neck_r6 = Chest.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(7, 24).mirror().addBox(-2.0979F, -0.2167F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.7104F, -1.3775F, 0.0774F, 0.0403F, -0.4784F));

		PartDefinition neck_r7 = Chest.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(7, 24).addBox(0.0979F, -0.2167F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.7104F, -1.3775F, 0.0774F, -0.0403F, 0.4784F));

		PartDefinition neck_r8 = Chest.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(0, 41).addBox(1.422F, -1.5041F, -0.4095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.7104F, -1.3775F, 0.0335F, -0.0806F, 1.1767F));

		PartDefinition cube_r39 = Chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, -0.45F, -0.65F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.15F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.75F, -0.09F, 0.123F, -0.045F));

		PartDefinition lowerjaw = Head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(38, 13).addBox(-1.0F, 0.01F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.525F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r40 = lowerjaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 28).mirror().addBox(-0.2608F, -0.9518F, -2.8033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2F, -5.4F, -0.0873F, -0.5236F, 0.0F));

		PartDefinition cube_r41 = lowerjaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 1).mirror().addBox(-1.025F, -0.99F, 2.825F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -8.0F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r42 = lowerjaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 9).mirror().addBox(-1.0724F, 0.0F, -5.9449F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6268F, 0.91F, 0.6178F, -0.1134F, -0.192F, 0.0F));

		PartDefinition cube_r43 = lowerjaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(29, 11).mirror().addBox(0.0F, -0.99F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(34, 1).mirror().addBox(0.5F, -1.515F, -0.05F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -8.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r44 = lowerjaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 33).mirror().addBox(-0.0245F, -0.5F, -0.0175F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.042F, -0.015F, -5.1462F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r45 = lowerjaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 33).addBox(0.0245F, -0.5F, -0.0175F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.042F, -0.015F, -5.1462F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r46 = lowerjaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 1).addBox(-0.5F, -1.515F, -0.05F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(29, 11).addBox(-1.0F, -0.99F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 1.0F, -8.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r47 = lowerjaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(28, 28).addBox(-0.7392F, -0.9518F, -2.8033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2F, 1.2F, -5.4F, -0.0873F, 0.5236F, 0.0F));

		PartDefinition cube_r48 = lowerjaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(11, 9).addBox(0.0724F, 0.0F, -5.9449F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6268F, 0.91F, 0.6178F, -0.1134F, 0.192F, 0.0F));

		PartDefinition cube_r49 = lowerjaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(13, 1).addBox(0.025F, -0.99F, 2.825F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 1.0F, -8.0F, 0.0F, 0.192F, 0.0F));

		PartDefinition upperjaw = Head.addOrReplaceChild("upperjaw", CubeListBuilder.create().texOffs(26, 7).addBox(-2.0F, -2.0F, -4.875F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 17).addBox(-1.0F, -1.01F, -8.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(31, 33).addBox(-1.5F, -1.01F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition cube_r50 = upperjaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(6, 34).mirror().addBox(-0.025F, -0.5F, -2.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4897F, -0.01F, -2.6533F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r51 = upperjaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-1.025F, -0.99F, 2.825F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -8.0F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r52 = upperjaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(20, 26).mirror().addBox(0.0F, -0.99F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -8.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r53 = upperjaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(13, 34).mirror().addBox(-0.025F, -1.01F, -0.75F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.5F, -7.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r54 = upperjaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F, -0.99F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r55 = upperjaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 7).addBox(-0.975F, -0.99F, 2.825F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.0F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r56 = upperjaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.55F, -3.25F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r57 = upperjaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(6, 34).addBox(0.025F, -0.5F, -2.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4897F, -0.01F, -2.6533F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r58 = upperjaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(13, 34).addBox(0.025F, -1.01F, -0.75F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 0.5F, -7.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r59 = upperjaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -1.0F, 0.325F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition UpperArmR = Chest.addOrReplaceChild("UpperArmR", CubeListBuilder.create().texOffs(34, 28).addBox(-0.4F, -0.1F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.25F, -0.9F, -0.0436F, -0.0436F, 0.6109F));

		PartDefinition LowerArmR = UpperArmR.addOrReplaceChild("LowerArmR", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, -0.51F, -0.49F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(37, 6).addBox(0.0F, 0.59F, -0.69F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6466F, 0.1384F, -0.9439F, -1.1405F, 1.2249F, -0.123F));

		PartDefinition HandR = LowerArmR.addOrReplaceChild("HandR", CubeListBuilder.create().texOffs(11, 24).addBox(0.0F, -1.51F, -2.39F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.5F, -0.3F, 2.7822F, -1.5145F, -2.6566F));

		PartDefinition UpperArmR2 = Chest.addOrReplaceChild("UpperArmR2", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-2.6F, -0.1F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.25F, -0.9F, 0.0F, 1.2217F, -0.6109F));

		PartDefinition LowerArmR2 = UpperArmR2.addOrReplaceChild("LowerArmR2", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-2.0F, -0.51F, -0.49F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(37, 6).mirror().addBox(-2.0F, 0.59F, -0.69F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6466F, 0.1384F, -0.9439F, 0.2618F, -1.3963F, -1.2217F));

		PartDefinition HandR2 = LowerArmR2.addOrReplaceChild("HandR2", CubeListBuilder.create().texOffs(11, 24).mirror().addBox(-1.0F, -1.51F, -2.39F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 0.5F, -0.3F, -0.1738F, 0.7346F, -0.4035F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition body2 = root.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -0.9F, 0.1F, 0.0911F, 0.0F, 0.0F));

		PartDefinition basin = body2.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.0104F, -5.3275F, 0.0467F, 0.2179F, 0.0101F));

		PartDefinition tail3 = basin.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.9658F, -4.2995F, 0.054F, 0.5666F, 0.029F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1465F, -4.6513F, -0.0969F, 0.3476F, -0.0331F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.1658F, -1.0995F, 0.4098F, 0.0F, 0.3643F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.525F, 2.4996F, 0.754F, 0.5918F, 0.0F, 0.0F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -1.7797F, -6.0135F, 0.4098F, -0.3187F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 3.1658F, -1.0995F, -0.0765F, 0.2006F, -0.8513F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.525F, 2.4996F, 0.754F, 0.614F, 0.2522F, 0.1741F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -1.7797F, -6.0135F, 0.4098F, 0.3187F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -0.1104F, 3.2725F, 0.0F, 0.0F, 0.0089F));

		PartDefinition head2 = neck.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0142F, 0.6999F, 5.3F, 0.3714F, 0.2103F, -0.0568F));

		PartDefinition snout1 = head2.addOrReplaceChild("snout1", CubeListBuilder.create(), PartPose.offset(3.0F, -0.681F, 5.6832F));

		PartDefinition teeth2 = snout1.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.9F, -0.29F));

		PartDefinition snout2 = snout1.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -0.9F, -0.1F, -0.1452F, 0.0F, 0.0F));

		PartDefinition teeth1 = head2.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offset(3.5F, 2.219F, 3.7832F));

		PartDefinition eye2 = head2.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offset(4.5F, -0.981F, 5.1832F));

		PartDefinition eye1 = head2.addOrReplaceChild("eye1", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.981F, 5.1832F));

		PartDefinition jaw1 = head2.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.319F, -0.1168F, -0.9865F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 5.6F));

		PartDefinition teeth3 = jaw2.addOrReplaceChild("teeth3", CubeListBuilder.create(), PartPose.offset(2.5F, -0.8F, -0.2F));

		PartDefinition lowerjaw2 = jaw2.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, 0.1121F, 0.0F, 0.0F));

		PartDefinition teeth4 = jaw1.addOrReplaceChild("teeth4", CubeListBuilder.create(), PartPose.offset(3.5F, -0.8F, 3.8F));

		PartDefinition gums2 = jaw1.addOrReplaceChild("gums2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -0.8F, 0.3841F, 0.0F, 0.0F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 3.8896F, 4.8725F, -0.2068F, 0.0F, 0.3187F));

		PartDefinition arm1 = upperarm1.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5504F, 4.3759F, -0.619F, -0.5618F, 0.0F, 0.0F));

		PartDefinition hand1 = arm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, -1.061F, 3.0983F, -0.9517F, 0.0594F, -0.3601F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3F, 3.8896F, 4.8725F, -1.1231F, 0.0F, -0.3187F));

		PartDefinition arm2 = upperarm2.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5504F, 4.3759F, -0.619F, -0.6927F, 0.0F, 0.0F));

		PartDefinition hand2 = arm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -1.061F, 3.0983F, -0.1294F, -0.1562F, 0.435F));

		PartDefinition sail = body2.addOrReplaceChild("sail", CubeListBuilder.create(), PartPose.offset(-0.1F, -16.5104F, -10.1275F));

		return LayerDefinition.create(meshdefinition, 48, 48);
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