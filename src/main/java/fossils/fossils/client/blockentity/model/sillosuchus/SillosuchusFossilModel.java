package fossils.fossils.client.blockentity.model.sillosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SillosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand4;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart upperleg1;
	private final ModelPart lowerleg1;
	private final ModelPart feet1;
	private final ModelPart toes1;
	private final ModelPart upperleg2;
	private final ModelPart lowerleg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public SillosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head1 = this.neck7.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.leftFace = this.head1.getChild("leftFace");
		this.rightFace = this.head1.getChild("rightFace");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand2 = this.lowerarm3.getChild("hand2");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.lowerleg1 = this.upperleg1.getChild("lowerleg1");
		this.feet1 = this.lowerleg1.getChild("feet1");
		this.toes1 = this.feet1.getChild("toes1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.lowerleg2 = this.upperleg2.getChild("lowerleg2");
		this.feet2 = this.lowerleg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.bone2 = this.basin.getChild("bone2");
		this.bone4 = this.basin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -11.8011F, 1.4739F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 49).addBox(0.7F, -1.5627F, -7.9729F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0107F, 4.0795F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-3.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 39).addBox(-0.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-1.2F, -0.0744F, 0.0452F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(57, 67).addBox(-0.3F, -0.5688F, -7.1294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(89, 79).addBox(0.2F, -2.5199F, -2.125F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, -0.0785F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(53, 69).addBox(0.6F, -2.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4269F, -3.6243F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(25, 114).addBox(0.6F, -2.4F, -1.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.5339F, -5.6239F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(126, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -1.6449F, 0.0722F, 0.0316F, -0.5054F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(125, 118).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -3.6449F, 0.1977F, 0.0694F, -0.4642F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(-1.7934F, -0.6088F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -3.6449F, 0.1152F, 0.1752F, -1.1154F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -6.0449F, 0.4322F, 0.1425F, -0.2998F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2749F, -6.0449F, 0.2635F, 0.3737F, -0.9356F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(126, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -1.6449F, 0.0722F, -0.0316F, 0.5054F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(125, 118).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -3.6449F, 0.1977F, -0.0694F, 0.4642F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(113, 23).addBox(0.7933F, -0.6088F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -3.6449F, 0.1152F, -0.1752F, 1.1154F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -6.0449F, 0.4322F, -0.1425F, 0.2998F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(120, 33).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2749F, -6.0449F, 0.2635F, -0.3737F, 0.9356F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(98, 115).addBox(-0.4F, -2.8555F, -5.8864F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-0.9F, -0.5374F, -6.8909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(123, 105).mirror().addBox(-1.2972F, -0.038F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3062F, -2.0064F, 0.4759F, 0.1013F, -0.0908F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(123, 63).mirror().addBox(-3.006F, -0.8199F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3062F, -2.0064F, 0.3271F, 0.3658F, -0.7089F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 9).mirror().addBox(-4.9921F, -2.3958F, -0.5144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3062F, -2.0064F, 0.0459F, 0.4838F, -1.3695F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(123, 61).mirror().addBox(-1.2981F, -0.0284F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -4.9064F, 0.4054F, 0.0952F, -0.0622F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(123, 59).mirror().addBox(-3.0126F, -0.8127F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -4.9064F, 0.2704F, 0.3198F, -0.6924F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-7.0016F, -2.3937F, -0.5188F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -4.9064F, 0.03F, 0.4148F, -1.3409F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(123, 105).addBox(-0.7028F, -0.038F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3062F, -2.0064F, 0.4759F, -0.1013F, 0.0908F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(123, 63).addBox(1.006F, -0.8199F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3062F, -2.0064F, 0.3271F, -0.3658F, 0.7089F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(112, 9).addBox(1.9921F, -2.3958F, -0.5144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3062F, -2.0064F, 0.0459F, -0.4838F, 1.3695F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(123, 61).addBox(-0.7019F, -0.0284F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -4.9064F, 0.4054F, -0.0952F, 0.0622F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(123, 59).addBox(1.0126F, -0.8127F, -0.5188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -4.9064F, 0.2704F, -0.3198F, 0.6924F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 43).addBox(2.0016F, -2.3937F, -0.5188F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -4.9064F, 0.03F, -0.4148F, 1.3409F));

		PartDefinition body_r3 = body2.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(25, 25).addBox(-2.5F, -3.1F, -0.1F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 14.3122F, -7.3276F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body_r4 = body2.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(103, 115).addBox(0.6F, -2.4F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5165F, -2.785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(116, 100).addBox(-0.4F, -3.1055F, -7.8863F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 36).addBox(-0.9F, -0.5374F, -8.8909F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0085F, -6.945F, 0.1263F, 0.0812F, 0.0541F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(123, 53).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -6.9064F, 0.2024F, 0.0916F, -0.0809F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(121, 8).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -6.9064F, 0.1053F, 0.1957F, -0.7343F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-11.0418F, -2.5888F, -0.5365F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -6.9064F, -0.0277F, 0.2202F, -1.3586F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 10).mirror().addBox(-1.2972F, -0.038F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.0064F, 0.3015F, 0.084F, -0.107F));

		PartDefinition cube_r27 = body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(124, 6).mirror().addBox(-3.006F, -0.8199F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.0064F, 0.1907F, 0.2493F, -0.7503F));

		PartDefinition cube_r28 = body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-8.9921F, -2.3958F, -0.5144F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3062F, -1.0064F, 0.0094F, 0.3125F, -1.3837F));

		PartDefinition cube_r29 = body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(123, 26).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.0064F, 0.2636F, 0.0964F, -0.0751F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-10.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.0064F, -0.0144F, 0.2799F, -1.3553F));

		PartDefinition cube_r31 = body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(124, 43).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.0064F, 0.1519F, 0.2364F, -0.7243F));

		PartDefinition cube_r32 = body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(124, 10).addBox(-0.7028F, -0.038F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.0064F, 0.3015F, -0.084F, 0.107F));

		PartDefinition cube_r33 = body3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(124, 6).addBox(1.006F, -0.8199F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.0064F, 0.1907F, -0.2493F, 0.7503F));

		PartDefinition cube_r34 = body3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 65).addBox(1.9921F, -2.3958F, -0.5144F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -1.0064F, 0.0094F, -0.3125F, 1.3837F));

		PartDefinition cube_r35 = body3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(67, 43).addBox(2.0418F, -2.5888F, -0.5365F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -6.9064F, -0.0277F, -0.2202F, 1.3586F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(121, 8).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -6.9064F, 0.1053F, -0.1957F, 0.7343F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(123, 53).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3062F, -6.9064F, 0.2024F, -0.0916F, 0.0809F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(123, 26).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.0064F, 0.2636F, -0.0964F, 0.0751F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 45).addBox(2.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.0064F, -0.0144F, -0.2799F, 1.3553F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(124, 43).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.0064F, 0.1519F, -0.2364F, 0.7243F));

		PartDefinition body_r5 = body3.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(25, 13).addBox(-2.0F, -2.1721F, -8.4056F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 13.4053F, -1.3079F, -0.288F, 0.0F, 0.0F));

		PartDefinition body_r6 = body3.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(56, 116).addBox(0.6F, -2.525F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5165F, -1.785F, -0.096F, 0.0F, 0.0F));

		PartDefinition body_r7 = body3.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(35, 116).addBox(0.6F, -2.575F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5235F, -3.8857F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.6411F, -9.0857F, -0.0822F, 0.1341F, 0.0324F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(5, 116).addBox(0.6F, -2.725F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -6.7057F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(0, 116).addBox(0.6F, -3.0F, 2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 0).addBox(0.1F, -1.0F, -1.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -6.7057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(108, 115).addBox(0.6F, -2.2112F, 0.1157F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.161F, -2.0057F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(0.0F, -0.45F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 9.1262F, -5.5884F, -0.1947F, 0.343F, -0.0662F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.2F, 0.7786F, -0.5637F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3099F, 8.7898F, -4.371F, -1.0896F, -1.3239F, 1.5301F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(23, 36).mirror().addBox(-0.2967F, 0.8699F, -0.7321F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.8347F, -2.3252F, -0.0679F, -0.5168F, 0.2445F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.3161F, 0.8744F, -0.3246F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.8347F, -2.3252F, -0.1418F, -0.7782F, 0.2525F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-0.0575F, 1.2022F, -0.5801F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.3347F, -3.2252F, -0.5703F, -0.8783F, 0.7039F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4104F, -6.7827F, 0.3421F, 0.1464F, -0.1412F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(121, 103).mirror().addBox(-2.7934F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4104F, -6.7827F, 0.1851F, 0.3234F, -0.7908F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-8.939F, -2.1009F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4104F, -6.7827F, -0.0421F, 0.3687F, -1.4398F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(124, 41).mirror().addBox(-3.1501F, -0.9545F, -0.5564F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1104F, -3.7827F, 0.1593F, 0.3004F, -0.7273F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(67, 41).mirror().addBox(-11.0329F, -2.5887F, -0.5564F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1104F, -3.7827F, -0.0483F, 0.3356F, -1.3705F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(123, 122).mirror().addBox(-1.4935F, -0.0571F, -0.5564F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1104F, -3.7827F, 0.3083F, 0.143F, -0.0747F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-11.0534F, -2.5847F, -0.5536F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1896F, -0.7827F, -0.0331F, 0.3172F, -1.3277F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(-3.1645F, -0.9395F, -0.5536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1896F, -0.7827F, 0.1599F, 0.2771F, -0.6892F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(123, 107).mirror().addBox(-1.4958F, -0.0364F, -0.5536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1896F, -0.7827F, 0.2945F, 0.1241F, -0.0386F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(92, 84).addBox(-0.8F, 0.7786F, -0.5637F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5099F, 8.7898F, -4.371F, -1.0896F, 1.3239F, -1.5301F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(23, 36).addBox(-0.7033F, 0.8699F, -0.7321F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.8347F, -2.3252F, -0.0679F, 0.5168F, -0.2445F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(0, 71).addBox(-0.6839F, 0.8744F, -0.3246F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.8347F, -2.3252F, -0.1418F, 0.7782F, -0.2525F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(17, 76).addBox(-0.9425F, 1.2022F, -0.5801F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.3347F, -3.2252F, -0.5703F, 0.8783F, -0.7039F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(86, 12).addBox(-2.0F, -0.45F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6F, 9.1262F, -5.5884F, -0.1947F, -0.343F, 0.0662F));

		PartDefinition chest_r14 = chest.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(86, 8).addBox(-2.5F, 0.7089F, -4.1794F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(82, 27).addBox(-1.0F, 0.7751F, -2.2899F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 8.3347F, -3.2252F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(124, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4104F, -6.7827F, 0.3421F, -0.1464F, 0.1412F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(121, 103).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4104F, -6.7827F, 0.1851F, -0.3234F, 0.7908F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 33).addBox(1.939F, -2.1009F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4104F, -6.7827F, -0.0421F, -0.3687F, 1.4398F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(124, 41).addBox(1.1501F, -0.9545F, -0.5564F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1104F, -3.7827F, 0.1593F, -0.3004F, 0.7273F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(67, 41).addBox(2.0329F, -2.5887F, -0.5564F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1104F, -3.7827F, -0.0483F, -0.3356F, 1.3705F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(123, 122).addBox(-0.5065F, -0.0571F, -0.5564F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1104F, -3.7827F, 0.3083F, -0.143F, 0.0747F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(65, 56).addBox(2.0534F, -2.5847F, -0.5536F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1896F, -0.7827F, -0.0331F, -0.3172F, 1.3277F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(123, 120).addBox(1.1645F, -0.9395F, -0.5536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1896F, -0.7827F, 0.1599F, -0.2771F, 0.6892F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(123, 107).addBox(-0.5042F, -0.0364F, -0.5536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1896F, -0.7827F, 0.2945F, -0.1241F, 0.0386F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(31, 100).addBox(-0.4F, -0.7056F, -3.8655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3694F, -6.7967F, 0.1335F, 0.1247F, 0.179F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(73, 120).addBox(0.6F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2056F, -3.3655F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r59 = neck1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(126, 101).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.159F, -2.9861F, 0.4121F, 0.1558F, -0.1307F));

		PartDefinition cube_r60 = neck1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-6.939F, -2.1009F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.159F, -2.9861F, -0.0321F, 0.4379F, -1.4358F));

		PartDefinition cube_r61 = neck1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(124, 12).mirror().addBox(-2.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.159F, -2.9861F, 0.2378F, 0.3726F, -0.7728F));

		PartDefinition cube_r62 = neck1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(124, 12).addBox(0.7933F, -0.6088F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.159F, -2.9861F, 0.2378F, -0.3726F, 0.7728F));

		PartDefinition cube_r63 = neck1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 63).addBox(1.939F, -2.1009F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.159F, -2.9861F, -0.0321F, -0.4379F, 1.4358F));

		PartDefinition cube_r64 = neck1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(126, 101).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.159F, -2.9861F, 0.4121F, -0.1558F, 0.1307F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -3.8577F, -0.2308F, 0.06F, -0.055F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(61, 120).addBox(0.6F, -1.6F, 4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 90).addBox(0.1F, -0.1F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r65 = neck2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1808F, -1.6284F, 0.6776F, 0.7785F, -0.8373F));

		PartDefinition cube_r66 = neck2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(101, 9).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1808F, -1.6284F, 0.6776F, -0.7785F, 0.8373F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.6107F, -3.9056F, -0.0971F, 0.0434F, -0.0042F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(120, 28).addBox(0.6F, -2.7F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 120).addBox(0.6F, -2.7F, 1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 83).addBox(0.1F, -1.0F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(106, 15).mirror().addBox(-3.9882F, 0.0315F, -0.4908F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.6217F, -4.1814F, 0.7327F, 1.24F, -0.8579F));

		PartDefinition cube_r68 = neck3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(104, 62).mirror().addBox(-3.9F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2217F, -0.7814F, 1.2128F, 1.1743F, -0.2861F));

		PartDefinition cube_r69 = neck3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(106, 15).addBox(-0.0118F, 0.0315F, -0.4908F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6217F, -4.1814F, 0.7327F, -1.24F, 0.8579F));

		PartDefinition cube_r70 = neck3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(104, 62).addBox(-0.1F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2217F, -0.7814F, 1.2128F, -1.1743F, 0.2861F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6119F, -4.916F, -0.292F, 0.2005F, 0.0467F));

		PartDefinition neck6_r1 = neck4.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(118, 35).addBox(0.6F, -0.0326F, -2.0977F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5988F, -4.0445F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck5_r2 = neck4.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(85, 117).addBox(0.6F, -2.5F, 0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(69, 18).addBox(0.1F, -1.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r71 = neck4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(106, 17).mirror().addBox(-3.8946F, -0.0222F, -0.5874F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.7616F, -4.876F, 0.9612F, 1.3107F, -0.5778F));

		PartDefinition cube_r72 = neck4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-3.6404F, -0.0786F, -0.5716F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2616F, -1.776F, 0.9095F, 1.3003F, -0.6314F));

		PartDefinition cube_r73 = neck4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(106, 17).addBox(-0.1054F, -0.0222F, -0.5874F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.7616F, -4.876F, 0.9612F, -1.3107F, 0.5778F));

		PartDefinition cube_r74 = neck4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(105, 91).addBox(-0.3596F, -0.0786F, -0.5716F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2616F, -1.776F, 0.9095F, -1.3003F, 0.6314F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8167F, -6.8478F, 0.0068F, 0.0781F, 0.1023F));

		PartDefinition neck7_r1 = neck5.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(121, 98).addBox(0.6F, -0.1156F, -1.7559F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2988F, -3.3445F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck6_r2 = neck5.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(118, 23).addBox(0.6F, -0.0094F, -1.993F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7988F, -0.1445F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck5_r3 = neck5.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(79, 83).addBox(0.1F, -1.0F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r75 = neck5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(107, 51).mirror().addBox(-3.9264F, -0.0106F, -0.6368F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.5616F, -4.076F, 0.6172F, 1.3484F, -0.9397F));

		PartDefinition cube_r76 = neck5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2616F, -1.776F, 0.4762F, 1.2886F, -1.0852F));

		PartDefinition cube_r77 = neck5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(107, 51).addBox(-0.0736F, -0.0106F, -0.6368F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.5616F, -4.076F, 0.6172F, -1.3484F, 0.9397F));

		PartDefinition cube_r78 = neck5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(105, 93).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2616F, -1.776F, 0.4762F, -1.2886F, 1.0852F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5955F, -4.8449F, 0.3083F, 0.1686F, 0.0454F));

		PartDefinition neck7_r2 = neck6.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(40, 118).addBox(0.6F, -2.1F, 0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r79 = neck6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(106, 11).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2616F, -1.776F, 0.6003F, 1.2662F, -0.9555F));

		PartDefinition cube_r80 = neck6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(106, 11).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2616F, -1.776F, 0.6003F, -1.2662F, 0.9555F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4597F, -3.7586F, 0.263F, 0.1264F, 0.0339F));

		PartDefinition neck9_r1 = neck7.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(119, 45).addBox(0.6F, -2.2F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 40).addBox(0.6F, -2.2F, 1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 90).addBox(0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck7.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(124, 39).mirror().addBox(-0.3732F, -0.3089F, -1.6217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 13).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2616F, -1.776F, 0.4747F, 1.1911F, -1.0888F));

		PartDefinition cube_r82 = neck7.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(124, 39).addBox(-1.6267F, -0.3089F, -1.6217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 13).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2616F, -1.776F, 0.4747F, -1.1911F, 1.0888F));

		PartDefinition head1 = neck7.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, -0.0605F, -4.2471F, 0.357F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head1.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(86, 18).addBox(-3.42F, 0.0539F, -1.9639F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -1.2958F, 0.0486F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head1.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(86, 23).addBox(-2.92F, 0.0F, -0.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 1.29F, -0.2722F, -2.4696F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(95, 33).addBox(-2.92F, -0.6F, -0.975F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.7705F, -0.8554F, 0.7592F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(97, 0).addBox(-2.92F, -2.0F, 0.025F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 2.4744F, -0.617F, 1.2392F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head1.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(125, 28).addBox(-0.92F, 0.0035F, -1.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2454F, -12.7656F, 0.8203F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head1.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(126, 98).addBox(-0.92F, 0.0035F, -1.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.321F, -11.9414F, 0.6021F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head1.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(73, 116).addBox(-0.92F, 0.0035F, -2.0434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8218F, -10.0051F, 0.2531F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head1.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(65, 126).addBox(-0.92F, -0.1965F, -2.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(18, 106).addBox(-1.42F, -0.1965F, -1.9434F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4724F, -8.4345F, 0.3971F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head1.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(89, 73).addBox(-1.42F, 0.0035F, -2.9434F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -1.7251F, -5.5456F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head1.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(11, 83).addBox(-2.0F, -3.325F, -0.225F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, 1.2787F, -3.4333F, -0.576F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head1.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(74, 67).addBox(-1.92F, -0.0215F, -3.0434F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -2.1417F, -3.4872F, 0.2094F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head1.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(92, 79).addBox(-2.92F, -0.0034F, -0.9763F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, -1.2674F, 0.0475F, -0.733F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(69, 27).addBox(-2.92F, 0.0319F, -1.5525F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0739F, -1.0609F, -0.2094F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create().texOffs(100, 96).addBox(1.025F, 0.2949F, -0.9158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(100, 96).mirror().addBox(-1.865F, 0.2949F, -0.9158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.329F, -0.9049F, 0.4337F, 0.029F, 0.0107F));

		PartDefinition jaw7_r1 = jaw1.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(0.075F, -1.3375F, -2.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.2967F, -0.1222F, 0.0F));

		PartDefinition jaw6_r1 = jaw1.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(81, 126).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(81, 126).addBox(2.39F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.365F, -0.7783F, -0.7646F, -0.4189F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw1.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(76, 126).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(76, 126).addBox(2.39F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.365F, -0.4283F, 0.1014F, -0.3491F, 0.0F, 0.0F));

		PartDefinition jaw9_r1 = jaw1.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(116, 61).mirror().addBox(0.075F, 0.7122F, -9.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(61, 116).mirror().addBox(0.075F, 1.5122F, -9.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.3229F, -0.1222F, 0.0F));

		PartDefinition jaw10_r1 = jaw1.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(126, 86).mirror().addBox(0.075F, 9.2164F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -1.6493F, -0.1222F, 0.0F));

		PartDefinition jaw9_r2 = jaw1.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(20, 128).mirror().addBox(0.075F, 4.5681F, -9.5461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.6283F, -0.1222F, 0.0F));

		PartDefinition jaw8_r1 = jaw1.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(86, 127).mirror().addBox(0.075F, -8.2213F, -8.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, 0.6458F, -0.1222F, 0.0F));

		PartDefinition jaw8_r2 = jaw1.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(34, 109).mirror().addBox(0.075F, 0.0657F, -9.9208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.2531F, -0.1222F, 0.0F));

		PartDefinition jaw7_r2 = jaw1.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(125, 127).mirror().addBox(0.075F, -3.5906F, -10.2732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, 0.1222F, -0.1222F, 0.0F));

		PartDefinition jaw6_r2 = jaw1.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(101, 4).mirror().addBox(0.075F, -0.8776F, -8.896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.1484F, -0.1222F, 0.0F));

		PartDefinition jaw6_r3 = jaw1.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(110, 5).mirror().addBox(0.075F, -2.796F, -5.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, 0.192F, -0.1222F, 0.0F));

		PartDefinition jaw5_r2 = jaw1.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(109, 58).mirror().addBox(0.075F, -1.8734F, -4.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.0524F, -0.1222F, 0.0F));

		PartDefinition jaw8_r3 = jaw1.addOrReplaceChild("jaw8_r3", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.878F, -1.0139F, -5.0503F, -0.2793F, -0.1222F, 0.0F));

		PartDefinition jaw8_r4 = jaw1.addOrReplaceChild("jaw8_r4", CubeListBuilder.create().texOffs(126, 89).mirror().addBox(-0.5F, -0.15F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4636F, -0.4889F, -8.4249F, 0.6545F, -0.1222F, 0.0F));

		PartDefinition jaw7_r3 = jaw1.addOrReplaceChild("jaw7_r3", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(-0.5F, 0.025F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.878F, -1.0139F, -5.0503F, -0.0175F, -0.1222F, 0.0F));

		PartDefinition jaw7_r4 = jaw1.addOrReplaceChild("jaw7_r4", CubeListBuilder.create().texOffs(9, 102).mirror().addBox(0.025F, -0.9435F, -0.0017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3796F, 0.9299F, -5.2729F, 0.0262F, -0.1222F, 0.0F));

		PartDefinition jaw6_r4 = jaw1.addOrReplaceChild("jaw6_r4", CubeListBuilder.create().texOffs(18, 101).mirror().addBox(0.025F, -0.9435F, -3.0017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.3796F, 0.9299F, -5.2729F, -0.2007F, -0.1222F, 0.0F));

		PartDefinition jaw5_r3 = jaw1.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(91, 96).mirror().addBox(0.075F, -0.2435F, -7.4017F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.2182F, -0.1222F, 0.0F));

		PartDefinition jaw4_r1 = jaw1.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(82, 96).mirror().addBox(0.075F, -1.1033F, -4.7456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, -0.0262F, -0.1222F, 0.0F));

		PartDefinition jaw3_r1 = jaw1.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(0.075F, -1.2124F, -1.9058F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.94F, 0.5154F, -0.7084F, 0.0349F, -0.1222F, 0.0F));

		PartDefinition jaw2_r1 = jaw1.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(124, 2).mirror().addBox(-0.5F, -1.225F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(124, 2).addBox(2.39F, -1.225F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.365F, 0.3236F, 0.9986F, 1.1345F, 0.0F, 0.0F));

		PartDefinition jaw6_r5 = jaw1.addOrReplaceChild("jaw6_r5", CubeListBuilder.create().texOffs(126, 83).addBox(-1.075F, -1.3375F, -2.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.2967F, 0.1222F, 0.0F));

		PartDefinition jaw8_r5 = jaw1.addOrReplaceChild("jaw8_r5", CubeListBuilder.create().texOffs(116, 61).addBox(-1.075F, 0.7122F, -9.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(61, 116).addBox(-1.075F, 1.5122F, -9.1174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.3229F, 0.1222F, 0.0F));

		PartDefinition jaw9_r3 = jaw1.addOrReplaceChild("jaw9_r3", CubeListBuilder.create().texOffs(126, 86).addBox(-1.075F, 9.2164F, -0.7297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -1.6493F, 0.1222F, 0.0F));

		PartDefinition jaw8_r6 = jaw1.addOrReplaceChild("jaw8_r6", CubeListBuilder.create().texOffs(20, 128).addBox(-1.075F, 4.5681F, -9.5461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.6283F, 0.1222F, 0.0F));

		PartDefinition jaw7_r5 = jaw1.addOrReplaceChild("jaw7_r5", CubeListBuilder.create().texOffs(86, 127).addBox(-1.075F, -8.2213F, -8.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, 0.6458F, 0.1222F, 0.0F));

		PartDefinition jaw7_r6 = jaw1.addOrReplaceChild("jaw7_r6", CubeListBuilder.create().texOffs(34, 109).addBox(-1.075F, 0.0657F, -9.9208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.2531F, 0.1222F, 0.0F));

		PartDefinition jaw6_r6 = jaw1.addOrReplaceChild("jaw6_r6", CubeListBuilder.create().texOffs(125, 127).addBox(-1.075F, -3.5906F, -10.2732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, 0.1222F, 0.1222F, 0.0F));

		PartDefinition jaw5_r4 = jaw1.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(101, 4).addBox(-1.075F, -0.8776F, -8.896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.1484F, 0.1222F, 0.0F));

		PartDefinition jaw5_r5 = jaw1.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(110, 5).addBox(-1.075F, -2.796F, -5.4733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, 0.192F, 0.1222F, 0.0F));

		PartDefinition jaw4_r2 = jaw1.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(109, 58).addBox(-1.075F, -1.8734F, -4.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.0524F, 0.1222F, 0.0F));

		PartDefinition jaw7_r7 = jaw1.addOrReplaceChild("jaw7_r7", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0379F, -1.0139F, -5.0503F, -0.2793F, 0.1222F, 0.0F));

		PartDefinition jaw7_r8 = jaw1.addOrReplaceChild("jaw7_r8", CubeListBuilder.create().texOffs(126, 89).addBox(-0.5F, -0.15F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6236F, -0.4889F, -8.4249F, 0.6545F, 0.1222F, 0.0F));

		PartDefinition jaw6_r7 = jaw1.addOrReplaceChild("jaw6_r7", CubeListBuilder.create().texOffs(100, 101).addBox(-0.5F, 0.025F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0379F, -1.0139F, -5.0503F, -0.0175F, 0.1222F, 0.0F));

		PartDefinition jaw6_r8 = jaw1.addOrReplaceChild("jaw6_r8", CubeListBuilder.create().texOffs(9, 102).addBox(-1.025F, -0.9435F, -0.0017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, 0.9299F, -5.2729F, 0.0262F, 0.1222F, 0.0F));

		PartDefinition jaw5_r6 = jaw1.addOrReplaceChild("jaw5_r6", CubeListBuilder.create().texOffs(18, 101).addBox(-1.025F, -0.9435F, -3.0017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5396F, 0.9299F, -5.2729F, -0.2007F, 0.1222F, 0.0F));

		PartDefinition jaw4_r3 = jaw1.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(91, 96).addBox(-1.075F, -0.2435F, -7.4017F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.2182F, 0.1222F, 0.0F));

		PartDefinition jaw3_r2 = jaw1.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(82, 96).addBox(-1.075F, -1.1033F, -4.7456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, -0.0262F, 0.1222F, 0.0F));

		PartDefinition jaw2_r2 = jaw1.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(109, 100).addBox(-1.075F, -1.2124F, -1.9058F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1F, 0.5154F, -0.7084F, 0.0349F, 0.1222F, 0.0F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.846F, -0.2862F, -5.9806F));

		PartDefinition head4_r4 = leftFace.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(5, 126).addBox(1.275F, -1.875F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 125).addBox(1.275F, -1.375F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.846F, 1.1611F, 5.5922F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head4_r5 = leftFace.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(44, 126).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.134F, -1.0685F, 5.3813F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head2_r3 = leftFace.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(80, 117).addBox(-0.02F, 0.2216F, 0.0237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.346F, -2.0996F, 4.37F, -0.2007F, 0.0F, 0.0F));

		PartDefinition head13_r1 = leftFace.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(15, 126).addBox(-0.5F, -0.7949F, -0.5411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.754F, 0.7316F, 3.8707F, -2.81F, 0.0F, 0.0F));

		PartDefinition head12_r1 = leftFace.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(120, 127).addBox(-0.5F, -1.2442F, -0.9308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.754F, 0.7316F, 3.8707F, 2.7314F, 0.0F, 0.0F));

		PartDefinition head13_r2 = leftFace.addOrReplaceChild("head13_r2", CubeListBuilder.create().texOffs(124, 14).addBox(-0.5F, -1.95F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.754F, -0.7168F, 4.5458F, 2.4347F, 0.0F, 0.0F));

		PartDefinition head12_r2 = leftFace.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(10, 126).addBox(-0.5F, -0.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.754F, -0.0203F, 4.1397F, 3.1329F, 0.0F, 0.0F));

		PartDefinition head11_r1 = leftFace.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(0, 122).addBox(-0.5F, -1.2419F, -0.2491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.754F, 0.7316F, 3.8707F, 2.4784F, 0.0F, 0.0F));

		PartDefinition head7_r2 = leftFace.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(29, 122).addBox(-0.4875F, -1.7259F, -0.1336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4415F, -0.1255F, 1.4463F, -1.2828F, 0.1396F, 0.0F));

		PartDefinition head8_r1 = leftFace.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(20, 125).addBox(-0.4875F, -1.3646F, -1.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4415F, -0.1255F, 1.4463F, -2.4609F, 0.1396F, 0.0F));

		PartDefinition head11_r2 = leftFace.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(100, 121).addBox(-0.4875F, -0.0905F, -0.3318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(11, 79).addBox(-0.4875F, -0.0905F, 0.6682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4352F, 1.2153F, 1.4014F, 3.0281F, 0.1396F, 0.0F));

		PartDefinition head9_r1 = leftFace.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(35, 127).addBox(-0.4875F, -1.6836F, -0.7082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4415F, -0.1255F, 1.4463F, -2.7663F, 0.1396F, 0.0F));

		PartDefinition head4_r6 = leftFace.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(34, 112).addBox(-0.5F, 0.3551F, -0.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(111, 40).addBox(-0.5F, -0.1449F, -0.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.2339F, -0.1671F, -0.7274F, 0.3665F, 0.0436F, 0.0F));

		PartDefinition head4_r7 = leftFace.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(100, 125).addBox(-0.5F, -0.7163F, -0.5644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.2699F, -0.1666F, 0.0964F, 0.7679F, 0.0436F, 0.0F));

		PartDefinition head5_r3 = leftFace.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(60, 112).addBox(-0.4875F, -1.1874F, -1.3559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4415F, -0.1255F, 1.4463F, 0.3752F, 0.1396F, 0.0F));

		PartDefinition head6_r2 = leftFace.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(67, 112).addBox(-0.4875F, -1.2868F, -0.1831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4415F, -0.1255F, 1.4463F, -0.1484F, 0.1396F, 0.0F));

		PartDefinition head10_r1 = leftFace.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(125, 115).addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(0, 126).addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.4035F, -0.0367F, 1.1758F, -3.0281F, 0.1396F, 0.0F));

		PartDefinition head17_r1 = leftFace.addOrReplaceChild("head17_r1", CubeListBuilder.create().texOffs(128, 21).addBox(-0.4993F, -0.8849F, -0.781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.264F, 0.3294F, -1.8398F, 0.4216F, 0.0146F, 0.0365F));

		PartDefinition head20_r1 = leftFace.addOrReplaceChild("head20_r1", CubeListBuilder.create().texOffs(124, 77).addBox(-0.4234F, -0.3091F, -0.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 55).addBox(-0.4234F, -0.6984F, -1.1584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(128, 34).addBox(-0.4234F, -0.6984F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3146F, 0.6578F, -4.7923F, 0.8182F, 0.1702F, 0.0345F));

		PartDefinition head20_r2 = leftFace.addOrReplaceChild("head20_r2", CubeListBuilder.create().texOffs(124, 80).addBox(-0.3985F, -0.3091F, 0.5167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 74).addBox(-0.3985F, -0.3091F, -0.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3146F, 0.6578F, -4.7923F, 0.8042F, 0.0499F, -0.0927F));

		PartDefinition head18_r1 = leftFace.addOrReplaceChild("head18_r1", CubeListBuilder.create().texOffs(74, 112).addBox(-0.4094F, -0.7627F, -0.1993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3146F, 0.6578F, -4.7923F, 0.4621F, 0.0298F, -0.0363F));

		PartDefinition head20_r3 = leftFace.addOrReplaceChild("head20_r3", CubeListBuilder.create().texOffs(124, 112).addBox(-0.4234F, -0.1136F, -1.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 109).addBox(-0.4234F, -0.1136F, -0.8619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3146F, 0.6578F, -4.7923F, 0.251F, 0.1702F, 0.0345F));

		PartDefinition head3_r4 = leftFace.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(106, 32).addBox(-2.0033F, -0.2282F, -0.1195F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9806F, -2.2577F, 2.9864F, 0.0493F, -0.4444F, -0.6947F));

		PartDefinition head4_r8 = leftFace.addOrReplaceChild("head4_r8", CubeListBuilder.create().texOffs(100, 106).addBox(-0.858F, -0.5282F, -0.8165F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3271F, -1.2273F, 1.937F, 0.1391F, -0.0385F, -0.6335F));

		PartDefinition head7_r3 = leftFace.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(9, 107).addBox(-1.225F, -0.5F, -1.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2431F, -0.429F, -2.5317F, 2.7013F, 1.2397F, 2.0944F));

		PartDefinition head6_r3 = leftFace.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(0, 107).addBox(-1.5F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4637F, -0.1153F, -1.3776F, 1.2429F, 1.4239F, 0.6116F));

		PartDefinition head5_r4 = leftFace.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(53, 93).addBox(-0.7111F, -0.5282F, -2.9727F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3271F, -1.2273F, 1.937F, 0.1541F, 0.4452F, -0.5613F));

		PartDefinition head3_r5 = leftFace.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(43, 78).addBox(-1.02F, -2.8715F, -3.1434F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.254F, 2.0224F, 3.1327F, -0.0541F, 0.1555F, -0.022F));

		PartDefinition head4_r9 = leftFace.addOrReplaceChild("head4_r9", CubeListBuilder.create().texOffs(100, 70).addBox(-1.02F, -0.0965F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7691F, -1.2755F, 0.5043F, 0.1903F, 0.1555F, -0.022F));

		PartDefinition head6_r4 = leftFace.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(127, 18).addBox(-0.775F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.266F, 0.0386F, -4.5899F, 0.4416F, 0.4399F, 0.1987F));

		PartDefinition head8_r2 = leftFace.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(88, 124).addBox(-0.92F, 0.1035F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.346F, 0.5316F, -6.785F, 1.3414F, -0.5928F, -0.8072F));

		PartDefinition head8_r3 = leftFace.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(125, 49).addBox(-0.375F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5933F, 1.6071F, -6.6968F, 1.9754F, 0.5706F, 0.1842F));

		PartDefinition head9_r2 = leftFace.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(60, 125).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(126, 92).addBox(-0.45F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0015F, 1.424F, -5.1389F, 1.5618F, 0.2531F, -0.0012F));

		PartDefinition head10_r2 = leftFace.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(66, 77).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1736F, 0.7967F, -3.4478F, 1.693F, 0.0175F, 0.0F));

		PartDefinition head11_r3 = leftFace.addOrReplaceChild("head11_r3", CubeListBuilder.create().texOffs(106, 19).addBox(-1.02F, 0.0857F, -0.0718F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7017F, 1.6456F, -2.99F, 1.4923F, 0.0175F, 0.0F));

		PartDefinition head13_r3 = leftFace.addOrReplaceChild("head13_r3", CubeListBuilder.create().texOffs(126, 65).addBox(-1.02F, -1.0019F, -1.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6795F, -0.6202F, -4.2574F, 2.0769F, 0.0175F, 0.0F));

		PartDefinition head12_r3 = leftFace.addOrReplaceChild("head12_r3", CubeListBuilder.create().texOffs(116, 94).addBox(-1.02F, -3.7019F, -1.0958F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7431F, -1.2627F, -0.6142F, 1.7453F, 0.0175F, 0.0F));

		PartDefinition head13_r4 = leftFace.addOrReplaceChild("head13_r4", CubeListBuilder.create().texOffs(105, 121).addBox(-0.3F, 0.075F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4495F, 0.8837F, -6.7664F, 2.0582F, 0.196F, 0.0471F));

		PartDefinition head16_r1 = leftFace.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(105, 125).addBox(-0.4993F, -1.1607F, -1.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.264F, 0.3294F, -1.8398F, 1.0325F, 0.0146F, 0.0365F));

		PartDefinition head16_r2 = leftFace.addOrReplaceChild("head16_r2", CubeListBuilder.create().texOffs(127, 31).addBox(-0.4993F, -0.8031F, -0.808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(93, 126).addBox(-0.4993F, -0.2031F, -0.808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.264F, 0.3294F, -1.8398F, 1.687F, 0.0146F, 0.0365F));

		PartDefinition head13_r5 = leftFace.addOrReplaceChild("head13_r5", CubeListBuilder.create().texOffs(123, 124).addBox(-0.4993F, -0.1441F, -0.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.264F, 0.3294F, -1.8398F, 2.9087F, 0.0146F, 0.0365F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.686F, -0.2862F, -5.9806F));

		PartDefinition head5_r5 = rightFace.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(5, 126).mirror().addBox(-2.275F, -1.875F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 125).mirror().addBox(-2.275F, -1.375F, 0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.846F, 1.1611F, 5.5922F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head5_r6 = rightFace.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(44, 126).mirror().addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.134F, -1.0685F, 5.3813F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head3_r6 = rightFace.addOrReplaceChild("head3_r6", CubeListBuilder.create().texOffs(80, 117).mirror().addBox(-0.98F, 0.2216F, 0.0237F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.346F, -2.0996F, 4.37F, -0.2007F, 0.0F, 0.0F));

		PartDefinition head14_r1 = rightFace.addOrReplaceChild("head14_r1", CubeListBuilder.create().texOffs(15, 126).mirror().addBox(-0.5F, -0.7949F, -0.5411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.754F, 0.7316F, 3.8707F, -2.81F, 0.0F, 0.0F));

		PartDefinition head13_r6 = rightFace.addOrReplaceChild("head13_r6", CubeListBuilder.create().texOffs(120, 127).mirror().addBox(-0.5F, -1.2442F, -0.9308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.754F, 0.7316F, 3.8707F, 2.7314F, 0.0F, 0.0F));

		PartDefinition head14_r2 = rightFace.addOrReplaceChild("head14_r2", CubeListBuilder.create().texOffs(124, 14).mirror().addBox(-0.5F, -1.95F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.754F, -0.7168F, 4.5458F, 2.4347F, 0.0F, 0.0F));

		PartDefinition head13_r7 = rightFace.addOrReplaceChild("head13_r7", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(-0.5F, -0.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.754F, -0.0203F, 4.1397F, 3.1329F, 0.0F, 0.0F));

		PartDefinition head12_r4 = rightFace.addOrReplaceChild("head12_r4", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-0.5F, -1.2419F, -0.2491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.754F, 0.7316F, 3.8707F, 2.4784F, 0.0F, 0.0F));

		PartDefinition head8_r4 = rightFace.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(29, 122).mirror().addBox(-0.5125F, -1.7259F, -0.1336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4415F, -0.1255F, 1.4463F, -1.2828F, -0.1396F, 0.0F));

		PartDefinition head9_r3 = rightFace.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(20, 125).mirror().addBox(-0.5125F, -1.3646F, -1.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4415F, -0.1255F, 1.4463F, -2.4609F, -0.1396F, 0.0F));

		PartDefinition head12_r5 = rightFace.addOrReplaceChild("head12_r5", CubeListBuilder.create().texOffs(100, 121).mirror().addBox(-0.5125F, -0.0905F, -0.3318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(11, 79).mirror().addBox(-0.5125F, -0.0905F, 0.6682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4352F, 1.2153F, 1.4014F, 3.0281F, -0.1396F, 0.0F));

		PartDefinition head10_r3 = rightFace.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(35, 127).mirror().addBox(-0.5125F, -1.6836F, -0.7082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4415F, -0.1255F, 1.4463F, -2.7663F, -0.1396F, 0.0F));

		PartDefinition head5_r7 = rightFace.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(34, 112).mirror().addBox(-0.5F, 0.3551F, -0.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(111, 40).mirror().addBox(-0.5F, -0.1449F, -0.036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.2339F, -0.1671F, -0.7274F, 0.3665F, -0.0436F, 0.0F));

		PartDefinition head5_r8 = rightFace.addOrReplaceChild("head5_r8", CubeListBuilder.create().texOffs(100, 125).mirror().addBox(-0.5F, -0.7163F, -0.5644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.2699F, -0.1666F, 0.0964F, 0.7679F, -0.0436F, 0.0F));

		PartDefinition head6_r5 = rightFace.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(60, 112).mirror().addBox(-0.5125F, -1.1874F, -1.3559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4415F, -0.1255F, 1.4463F, 0.3752F, -0.1396F, 0.0F));

		PartDefinition head7_r4 = rightFace.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(67, 112).mirror().addBox(-0.5125F, -1.2868F, -0.1831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4415F, -0.1255F, 1.4463F, -0.1484F, -0.1396F, 0.0F));

		PartDefinition head11_r4 = rightFace.addOrReplaceChild("head11_r4", CubeListBuilder.create().texOffs(125, 115).mirror().addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(0, 126).mirror().addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.4035F, -0.0367F, 1.1758F, -3.0281F, -0.1396F, 0.0F));

		PartDefinition head18_r2 = rightFace.addOrReplaceChild("head18_r2", CubeListBuilder.create().texOffs(128, 21).mirror().addBox(-0.5007F, -0.8849F, -0.781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.264F, 0.3294F, -1.8398F, 0.4216F, -0.0146F, -0.0365F));

		PartDefinition head21_r1 = rightFace.addOrReplaceChild("head21_r1", CubeListBuilder.create().texOffs(124, 77).mirror().addBox(-0.5766F, -0.3091F, -0.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 55).mirror().addBox(-0.5766F, -0.6984F, -1.1584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(128, 34).mirror().addBox(-0.5766F, -0.6984F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 0.6578F, -4.7923F, 0.8182F, -0.1702F, -0.0345F));

		PartDefinition head21_r2 = rightFace.addOrReplaceChild("head21_r2", CubeListBuilder.create().texOffs(124, 80).mirror().addBox(-0.6015F, -0.3091F, 0.5167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 74).mirror().addBox(-0.6015F, -0.3091F, -0.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 0.6578F, -4.7923F, 0.8042F, -0.0499F, 0.0927F));

		PartDefinition head19_r1 = rightFace.addOrReplaceChild("head19_r1", CubeListBuilder.create().texOffs(74, 112).mirror().addBox(-0.5906F, -0.7627F, -0.1993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 0.6578F, -4.7923F, 0.4621F, -0.0298F, 0.0363F));

		PartDefinition head21_r3 = rightFace.addOrReplaceChild("head21_r3", CubeListBuilder.create().texOffs(124, 112).mirror().addBox(-0.5766F, -0.1136F, -1.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 109).mirror().addBox(-0.5766F, -0.1136F, -0.8619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 0.6578F, -4.7923F, 0.251F, -0.1702F, -0.0345F));

		PartDefinition head4_r10 = rightFace.addOrReplaceChild("head4_r10", CubeListBuilder.create().texOffs(106, 32).mirror().addBox(0.0033F, -0.2282F, -0.1195F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9806F, -2.2577F, 2.9864F, 0.0493F, 0.4444F, 0.6947F));

		PartDefinition head5_r9 = rightFace.addOrReplaceChild("head5_r9", CubeListBuilder.create().texOffs(100, 106).mirror().addBox(-1.142F, -0.5282F, -0.8165F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.3271F, -1.2273F, 1.937F, 0.1391F, 0.0385F, 0.6335F));

		PartDefinition head8_r5 = rightFace.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(9, 107).mirror().addBox(-0.775F, -0.5F, -1.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2431F, -0.429F, -2.5317F, 2.7013F, -1.2397F, -2.0944F));

		PartDefinition head7_r5 = rightFace.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.5F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.4637F, -0.1153F, -1.3776F, 1.2429F, -1.4239F, -0.6116F));

		PartDefinition head6_r6 = rightFace.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-1.2889F, -0.5282F, -2.9727F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3271F, -1.2273F, 1.937F, 0.1541F, -0.4452F, 0.5613F));

		PartDefinition head4_r11 = rightFace.addOrReplaceChild("head4_r11", CubeListBuilder.create().texOffs(43, 78).mirror().addBox(0.02F, -2.8715F, -3.1434F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.254F, 2.0224F, 3.1327F, -0.0541F, -0.1555F, 0.022F));

		PartDefinition head5_r10 = rightFace.addOrReplaceChild("head5_r10", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(0.02F, -0.0965F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7691F, -1.2755F, 0.5043F, 0.1903F, -0.1555F, 0.022F));

		PartDefinition head7_r6 = rightFace.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(127, 18).mirror().addBox(-0.225F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.266F, 0.0386F, -4.5899F, 0.4416F, -0.4399F, -0.1987F));

		PartDefinition head9_r4 = rightFace.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(88, 124).mirror().addBox(-0.08F, 0.1035F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.346F, 0.5316F, -6.785F, 1.3414F, 0.5928F, 0.8072F));

		PartDefinition head9_r5 = rightFace.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(125, 49).mirror().addBox(-0.625F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5933F, 1.6071F, -6.6968F, 1.9754F, -0.5706F, -0.1842F));

		PartDefinition head10_r4 = rightFace.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(126, 92).mirror().addBox(-0.55F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0015F, 1.424F, -5.1389F, 1.5618F, -0.2531F, 0.0012F));

		PartDefinition head11_r5 = rightFace.addOrReplaceChild("head11_r5", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1736F, 0.7967F, -3.4478F, 1.693F, -0.0175F, 0.0F));

		PartDefinition head12_r6 = rightFace.addOrReplaceChild("head12_r6", CubeListBuilder.create().texOffs(106, 19).mirror().addBox(0.02F, 0.0857F, -0.0718F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7017F, 1.6456F, -2.99F, 1.4923F, -0.0175F, 0.0F));

		PartDefinition head14_r3 = rightFace.addOrReplaceChild("head14_r3", CubeListBuilder.create().texOffs(126, 65).mirror().addBox(0.02F, -1.0019F, -1.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.6795F, -0.6202F, -4.2574F, 2.0769F, -0.0175F, 0.0F));

		PartDefinition head13_r8 = rightFace.addOrReplaceChild("head13_r8", CubeListBuilder.create().texOffs(116, 94).mirror().addBox(0.02F, -3.7019F, -1.0958F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7431F, -1.2627F, -0.6142F, 1.7453F, -0.0175F, 0.0F));

		PartDefinition head14_r4 = rightFace.addOrReplaceChild("head14_r4", CubeListBuilder.create().texOffs(105, 121).mirror().addBox(-0.7F, 0.075F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.4495F, 0.8837F, -6.7664F, 2.0582F, -0.196F, -0.0471F));

		PartDefinition head17_r2 = rightFace.addOrReplaceChild("head17_r2", CubeListBuilder.create().texOffs(105, 125).mirror().addBox(-0.5007F, -1.1607F, -1.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.264F, 0.3294F, -1.8398F, 1.0325F, -0.0146F, -0.0365F));

		PartDefinition head17_r3 = rightFace.addOrReplaceChild("head17_r3", CubeListBuilder.create().texOffs(127, 31).mirror().addBox(-0.5007F, -0.8031F, -0.808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(93, 126).mirror().addBox(-0.5007F, -0.2031F, -0.808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.264F, 0.3294F, -1.8398F, 1.687F, -0.0146F, -0.0365F));

		PartDefinition head14_r5 = rightFace.addOrReplaceChild("head14_r5", CubeListBuilder.create().texOffs(123, 124).mirror().addBox(-0.5007F, -0.1441F, -0.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.264F, 0.3294F, -1.8398F, 2.9087F, -0.0146F, -0.0365F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(34, 122).addBox(-0.3F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.8966F, 8.494F, -5.42F, 0.5256F, 0.243F, -0.0479F));

		PartDefinition upperarm6_r1 = upperarm2.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(115, 29).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 5.8669F, 3.1781F, 0.7243F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm2.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(19, 115).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.8669F, 3.1781F, 0.8639F, 0.0F, 0.0F));

		PartDefinition upperarm4_r1 = upperarm2.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(90, 119).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 3.6375F, 1.1707F, 0.733F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm2.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(78, 122).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition upperarm5_r2 = upperarm2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(25, 126).addBox(-0.5F, 0.9F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(66, 122).addBox(-0.5F, -1.1F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 1.9188F, 0.2503F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarm2.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(55, 122).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.093F, 0.1356F, -0.5934F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(93, 113).addBox(-0.4F, -0.1995F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3111F, 9.0324F, 5.9798F, -0.9499F, 0.1456F, 0.013F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(50, 107).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(40, 104).addBox(-0.5132F, -0.3632F, -0.9638F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.111F, 0.0199F, 0.0047F));

		PartDefinition lowerarm2_r1 = lowerarm2.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(81, 111).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.4004F, 0.1002F, -0.0848F, 0.0181F, 0.0093F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(86, 102).addBox(-0.8736F, -0.2769F, -1.1549F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2497F, 9.0318F, -0.8816F, 0.1582F, -0.0699F, 0.2937F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create().texOffs(83, 122).addBox(-0.7F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.6966F, 8.494F, -5.42F, 0.5256F, -0.243F, 0.0479F));

		PartDefinition upperarm7_r1 = upperarm3.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(51, 115).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 5.8669F, 3.1781F, 0.7243F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarm3.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(46, 115).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.8669F, 3.1781F, 0.8639F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarm3.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(119, 110).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 3.6375F, 1.1707F, 0.733F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm3.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(39, 123).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition upperarm6_r3 = upperarm3.addOrReplaceChild("upperarm6_r3", CubeListBuilder.create().texOffs(30, 126).addBox(-0.5F, 0.9F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(123, 35).addBox(-0.5F, -1.1F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 1.9188F, 0.2503F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm3.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(123, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.093F, 0.1356F, -0.5934F, 0.0F, 0.0F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create().texOffs(114, 44).addBox(-0.6F, -0.1995F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3111F, 9.0324F, 5.9798F, -0.5572F, -0.1456F, -0.013F));

		PartDefinition lowerarm5_r1 = lowerarm3.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(55, 107).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition lowerarm4_r2 = lowerarm3.addOrReplaceChild("lowerarm4_r2", CubeListBuilder.create().texOffs(45, 104).addBox(-0.4868F, -0.3632F, -0.9638F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.111F, -0.0199F, -0.0047F));

		PartDefinition lowerarm3_r2 = lowerarm3.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(41, 112).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.4004F, 0.1002F, -0.0848F, -0.0181F, -0.0093F));

		PartDefinition hand2 = lowerarm3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(93, 102).addBox(-0.1264F, -0.2769F, -1.1549F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2497F, 9.0318F, -0.8816F, 0.1582F, 0.0699F, -0.2937F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0859F, 4.7758F, -4.5398F, 0.0F, -0.1309F, 0.0F));

		PartDefinition chest_r15 = bone.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(95, 27).addBox(-1.0F, -1.75F, -1.15F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(-0.049F, -3.8642F, 1.0837F, 2.7494F, 0.3013F, -0.1823F));

		PartDefinition chest_r16 = bone.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(54, 85).addBox(-1.0F, -2.0F, -2.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3114F, -4.4108F, 2.5433F, 1.5713F, 0.3013F, -0.1823F));

		PartDefinition chest_r17 = bone.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(36, 69).addBox(-1.0F, -1.0F, -5.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.4495F, -2.5531F, 5.061F, 0.0005F, 0.3013F, -0.1823F));

		PartDefinition chest_r18 = bone.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(23, 47).addBox(-1.0F, -0.1F, -6.975F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.8981F, -4.1913F, 4.2718F, 0.4368F, 0.3013F, -0.1823F));

		PartDefinition chest_r19 = bone.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(98, 45).addBox(-1.0F, -1.1F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.8981F, -4.1913F, 4.2718F, 0.8295F, 0.3013F, -0.1823F));

		PartDefinition chest_r20 = bone.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(95, 37).addBox(-0.9637F, -0.7956F, 0.4314F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1912F, 2.7469F, -1.7515F, 0.4669F, 0.5967F, 0.0908F));

		PartDefinition chest_r21 = bone.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(78, 58).addBox(-0.9637F, -0.1296F, -2.3644F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.1912F, 2.7469F, -1.7515F, 1.4268F, 0.5967F, 0.0908F));

		PartDefinition chest_r22 = bone.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(22, 95).addBox(-1.0F, -1.775F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(-0.6368F, 4.0186F, -2.2997F, 1.1738F, 0.5967F, 0.0908F));

		PartDefinition chest_r23 = bone.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(98, 50).addBox(-1.0F, -1.225F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.9077F, 2.7849F, -2.8615F, 0.6502F, 0.5967F, 0.0908F));

		PartDefinition chest_r24 = bone.addOrReplaceChild("chest_r24", CubeListBuilder.create().texOffs(0, 95).addBox(-0.9637F, -1.8712F, -2.3761F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1912F, 2.7469F, -1.7515F, -0.7025F, 0.5967F, 0.0908F));

		PartDefinition chest_r25 = bone.addOrReplaceChild("chest_r25", CubeListBuilder.create().texOffs(43, 85).addBox(-0.9637F, -2.1891F, -1.4918F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(-0.1912F, 2.7469F, -1.7515F, -0.3447F, 0.5967F, 0.0908F));

		PartDefinition chest_r26 = bone.addOrReplaceChild("chest_r26", CubeListBuilder.create().texOffs(69, 9).addBox(-1.0003F, -0.7856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F))
				.texOffs(69, 0).addBox(-1.0003F, -1.3856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.394F)), PartPose.offsetAndRotation(0.0537F, 0.1813F, -0.9526F, 0.908F, 0.3013F, -0.1823F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8859F, 4.7758F, -4.5398F, 0.0F, 0.1309F, 0.0F));

		PartDefinition chest_r27 = bone3.addOrReplaceChild("chest_r27", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-1.0F, -1.75F, -1.15F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(0.049F, -3.8642F, 1.0837F, 2.7494F, -0.3013F, 0.1823F));

		PartDefinition chest_r28 = bone3.addOrReplaceChild("chest_r28", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(-1.0F, -2.0F, -2.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3114F, -4.4108F, 2.5433F, 1.5713F, -0.3013F, 0.1823F));

		PartDefinition chest_r29 = bone3.addOrReplaceChild("chest_r29", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-1.0F, -1.0F, -5.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.4495F, -2.5531F, 5.061F, 0.0005F, -0.3013F, 0.1823F));

		PartDefinition chest_r30 = bone3.addOrReplaceChild("chest_r30", CubeListBuilder.create().texOffs(23, 47).mirror().addBox(-1.0F, -0.1F, -6.975F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -4.1913F, 4.2718F, 0.4368F, -0.3013F, 0.1823F));

		PartDefinition chest_r31 = bone3.addOrReplaceChild("chest_r31", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-1.0F, -1.1F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -4.1913F, 4.2718F, 0.8295F, -0.3013F, 0.1823F));

		PartDefinition chest_r32 = bone3.addOrReplaceChild("chest_r32", CubeListBuilder.create().texOffs(95, 37).mirror().addBox(-1.0363F, -0.7956F, 0.4314F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1912F, 2.7469F, -1.7515F, 0.4669F, -0.5967F, -0.0908F));

		PartDefinition chest_r33 = bone3.addOrReplaceChild("chest_r33", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-1.0363F, -0.1296F, -2.3644F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.1912F, 2.7469F, -1.7515F, 1.4268F, -0.5967F, -0.0908F));

		PartDefinition chest_r34 = bone3.addOrReplaceChild("chest_r34", CubeListBuilder.create().texOffs(22, 95).mirror().addBox(-1.0F, -1.775F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(0.6368F, 4.0186F, -2.2997F, 1.1738F, -0.5967F, -0.0908F));

		PartDefinition chest_r35 = bone3.addOrReplaceChild("chest_r35", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-1.0F, -1.225F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.9077F, 2.7849F, -2.8615F, 0.6502F, -0.5967F, -0.0908F));

		PartDefinition chest_r36 = bone3.addOrReplaceChild("chest_r36", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.0363F, -1.8712F, -2.3761F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1912F, 2.7469F, -1.7515F, -0.7025F, -0.5967F, -0.0908F));

		PartDefinition chest_r37 = bone3.addOrReplaceChild("chest_r37", CubeListBuilder.create().texOffs(43, 85).mirror().addBox(-1.0363F, -2.1891F, -1.4918F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(0.1912F, 2.7469F, -1.7515F, -0.3447F, -0.5967F, -0.0908F));

		PartDefinition chest_r38 = bone3.addOrReplaceChild("chest_r38", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-0.9997F, -0.7856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(69, 0).mirror().addBox(-0.9997F, -1.3856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.394F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.1813F, -0.9526F, 0.908F, -0.3013F, 0.1823F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(50, 22).addBox(0.2F, -0.9522F, -0.0584F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1873F, 6.0008F, -0.1677F, -0.2152F, 0.0361F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(-1.8F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0478F, 0.8416F, 0.0F, 0.0349F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(17, 68).addBox(-0.2F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0478F, 0.8416F, 0.0F, -0.0349F, 0.0F));

		PartDefinition body_r8 = tail1.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(40, 99).addBox(0.6F, -0.8802F, 11.1124F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 55).addBox(0.6F, -0.826F, 9.1084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 4).addBox(0.6F, -0.6718F, 7.1043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 120).addBox(0.6F, -0.8161F, 4.0827F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.8669F, -4.0595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r9 = tail1.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(18, 96).addBox(0.6F, 3.5736F, 3.2874F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 49).addBox(0.6F, 1.0736F, 1.2874F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.2685F, 2.286F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(50, 11).addBox(0.2F, -0.9101F, -0.116F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0351F, 7.8889F, -0.1185F, -0.13F, 0.0154F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0899F, 0.884F, 0.0F, 0.0698F, 0.0F));

		PartDefinition tail3_r2 = tail2.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(67, 33).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0899F, 0.884F, 0.0F, -0.0698F, 0.0F));

		PartDefinition body_r10 = tail2.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(110, 84).addBox(0.6F, -0.8473F, -0.6802F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7248F, 7.5822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r11 = tail2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(50, 104).addBox(0.6F, -0.6623F, -0.9033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9248F, 5.8822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r12 = tail2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(53, 74).addBox(0.6F, -1.8479F, 23.0671F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 75).addBox(0.6F, -1.7648F, 21.0708F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.8248F, -20.1178F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r13 = tail2.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(20, 121).addBox(0.0F, 0.9F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.3428F, 3.0061F, 0.7854F, 0.0F, 0.0F));

		PartDefinition body_r14 = tail2.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(110, 121).addBox(0.0F, -0.0222F, -0.105F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.1427F, 2.1061F, 0.8552F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(38, 59).addBox(0.2F, -0.5203F, -0.2717F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2772F, 8.004F, 0.0938F, -0.1307F, -0.0065F));

		PartDefinition tail7_r1 = tail3.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(128, 124).addBox(0.6F, -0.325F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 7.2283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail3.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(116, 128).addBox(0.6F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 5.2283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail3.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(113, 128).addBox(0.6F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0203F, 3.2283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail3.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(110, 128).addBox(0.6F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3203F, 0.7283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r15 = tail3.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(10, 116).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.1122F, 8.3364F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body_r16 = tail3.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(14, 111).addBox(0.0F, -2.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4785F, 6.033F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body_r17 = tail3.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(36, 105).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.62F, 3.346F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body_r18 = tail3.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(27, 101).addBox(0.0F, 2.7F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.62F, -4.9979F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(25, 0).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.067F, 7.6106F, 0.1663F, -0.2583F, -0.0429F));

		PartDefinition tail9_r1 = tail4.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(73, 128).addBox(0.6F, -0.9F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 128).addBox(0.6F, -0.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 128).addBox(0.6F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 128).addBox(0.6F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 127).addBox(0.6F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3331F, 1.0393F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r19 = tail4.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(3, 129).addBox(0.0F, 0.6F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 2).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 112).addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.9676F, 5.3345F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body_r20 = tail4.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(111, 29).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.015F, 3.0524F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, -0.4332F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, -0.0708F, 0.087F, -0.0062F));

		PartDefinition tail9_r2 = tail5.addOrReplaceChild("tail9_r2", CubeListBuilder.create().texOffs(107, 128).addBox(0.6F, -0.625F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 128).addBox(0.6F, -0.625F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 128).addBox(0.6F, -0.625F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 128).addBox(0.6F, -0.525F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2332F, 0.1393F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body_r21 = tail5.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(0, 129).addBox(0.0F, 1.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.0046F, -5.5615F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 13).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, -0.2295F, 0.1275F, -0.0297F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(74, 75).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0373F, 10.9716F, -0.1965F, -0.0189F, 0.1352F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 58).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.001F, 5.9263F, 0.0644F, 0.2347F, -0.0033F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(44, 48).addBox(0.2F, -0.4331F, 0.0393F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0039F, 8.0025F, 0.0105F, 0.3023F, 0.0877F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 4.2643F, 0.1191F, 0.096F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg1.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(11, 90).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(117, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0253F, 1.0413F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg1.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(113, 116).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.8731F, 0.2759F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(18, 110).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.414F, -0.7025F, -0.6021F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg1.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(86, 108).addBox(-1.0F, -4.066F, -2.452F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(116, 106).addBox(-1.0F, -4.066F, -3.152F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7776F, -0.6639F, -0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg1.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(111, 25).addBox(-1.0F, -1.7F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 7.5673F, -2.4935F, -0.6807F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg1.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(67, 107).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.2747F, -3.5328F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg1.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(103, 75).addBox(-1.0F, -2.0F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.6018F, -3.4262F, -0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg1.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(63, 102).addBox(-1.0F, -1.0F, -0.775F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 13.7738F, -4.3181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg1.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(118, 50).addBox(-1.0F, -0.0237F, 0.0106F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9866F, -5.0146F, -0.096F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg1.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(107, 110).addBox(-1.0F, -0.0236F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 9.0158F, -4.597F, -0.1396F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg1.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(100, 110).addBox(-1.0F, -0.0737F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2526F, -3.5639F, -0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperleg1.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(117, 4).addBox(-1.0F, -0.116F, 0.0481F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.5428F, -2.6072F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg1_r1 = upperleg1.addOrReplaceChild("upperleg1_r1", CubeListBuilder.create().texOffs(9, 96).addBox(-1.0F, 0.0305F, -1.9914F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7434F, 1.2137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create().texOffs(109, 64).addBox(-1.5F, 3.8328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(99, 19).addBox(-1.5F, 1.8328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(27, 105).addBox(-1.5F, 0.8328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(104, 26).addBox(0.9F, 0.8328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 14.6874F, -4.8205F, 0.4014F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r1 = lowerleg1.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(15, 121).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 121).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 4.759F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lowerleg7_r1 = lowerleg1.addOrReplaceChild("lowerleg7_r1", CubeListBuilder.create().texOffs(43, 93).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 8.5594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition lowerleg6_r1 = lowerleg1.addOrReplaceChild("lowerleg6_r1", CubeListBuilder.create().texOffs(38, 88).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 8.5594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r1 = lowerleg1.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(121, 88).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 5.9714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r2 = lowerleg1.addOrReplaceChild("lowerleg4_r2", CubeListBuilder.create().texOffs(45, 121).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 6.1708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition lowerleg2_r1 = lowerleg1.addOrReplaceChild("lowerleg2_r1", CubeListBuilder.create().texOffs(30, 116).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 8.3328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r3 = lowerleg1.addOrReplaceChild("lowerleg4_r3", CubeListBuilder.create().texOffs(27, 109).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(-0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r4 = lowerleg1.addOrReplaceChild("lowerleg4_r4", CubeListBuilder.create().texOffs(86, 45).addBox(1.9F, 0.0F, 0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(24, 83).addBox(1.9F, 0.0F, 0.1F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.4F, 7.0328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create().texOffs(32, 78).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 17.0254F, 0.7475F, -1.9289F, 0.0F, 0.0F));

		PartDefinition feet3_r1 = feet1.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(113, 19).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(98, 89).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.1309F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create().texOffs(57, 59).addBox(-2.0F, -0.3F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9393F, 0.6325F, 1.5291F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.2643F, 0.1191F, -0.5149F, 0.0F, 0.0F));

		PartDefinition upperleg3_r4 = upperleg2.addOrReplaceChild("upperleg3_r4", CubeListBuilder.create().texOffs(65, 90).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(117, 75).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0253F, 1.0413F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(117, 71).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.8731F, 0.2759F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperleg5_r5 = upperleg2.addOrReplaceChild("upperleg5_r5", CubeListBuilder.create().texOffs(110, 79).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.414F, -0.7025F, -0.6021F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg2.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(93, 108).addBox(-1.0F, -4.066F, -2.452F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(117, 11).addBox(-1.0F, -4.066F, -3.152F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7776F, -0.6639F, -0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg6_r3 = upperleg2.addOrReplaceChild("upperleg6_r3", CubeListBuilder.create().texOffs(111, 36).addBox(-1.0F, -1.7F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 7.5673F, -2.4935F, -0.6807F, 0.0F, 0.0F));

		PartDefinition upperleg6_r4 = upperleg2.addOrReplaceChild("upperleg6_r4", CubeListBuilder.create().texOffs(74, 107).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.2747F, -3.5328F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upperleg5_r6 = upperleg2.addOrReplaceChild("upperleg5_r6", CubeListBuilder.create().texOffs(103, 81).addBox(-1.0F, -2.0F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.6018F, -3.4262F, -0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg5_r7 = upperleg2.addOrReplaceChild("upperleg5_r7", CubeListBuilder.create().texOffs(72, 102).addBox(-1.0F, -1.0F, -0.775F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 13.7738F, -4.3181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg6_r5 = upperleg2.addOrReplaceChild("upperleg6_r5", CubeListBuilder.create().texOffs(120, 19).addBox(-1.0F, -0.0237F, 0.0106F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9866F, -5.0146F, -0.096F, 0.0F, 0.0F));

		PartDefinition upperleg5_r8 = upperleg2.addOrReplaceChild("upperleg5_r8", CubeListBuilder.create().texOffs(7, 111).addBox(-1.0F, -0.0236F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 9.0158F, -4.597F, -0.1396F, 0.0F, 0.0F));

		PartDefinition upperleg4_r6 = upperleg2.addOrReplaceChild("upperleg4_r6", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, -0.0737F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2526F, -3.5639F, -0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg4_r7 = upperleg2.addOrReplaceChild("upperleg4_r7", CubeListBuilder.create().texOffs(117, 15).addBox(-1.0F, -0.116F, 0.0481F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.5428F, -2.6072F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg2_r2 = upperleg2.addOrReplaceChild("upperleg2_r2", CubeListBuilder.create().texOffs(64, 96).addBox(-1.0F, 0.0305F, -1.9914F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7434F, 1.2137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(109, 105).addBox(-0.5F, 3.8328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(102, 55).addBox(-0.5F, 1.8328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(105, 87).addBox(-0.5F, 0.8328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(104, 37).addBox(-1.9F, 0.8328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 14.6874F, -4.8205F, 0.5323F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r2 = lowerleg2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(121, 83).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 121).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 4.759F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lowerleg8_r1 = lowerleg2.addOrReplaceChild("lowerleg8_r1", CubeListBuilder.create().texOffs(48, 93).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 8.5594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition lowerleg7_r2 = lowerleg2.addOrReplaceChild("lowerleg7_r2", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 8.5594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lowerleg6_r2 = lowerleg2.addOrReplaceChild("lowerleg6_r2", CubeListBuilder.create().texOffs(121, 93).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 5.9714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r3 = lowerleg2.addOrReplaceChild("lowerleg5_r3", CubeListBuilder.create().texOffs(121, 65).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 6.1708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition lowerleg3_r1 = lowerleg2.addOrReplaceChild("lowerleg3_r1", CubeListBuilder.create().texOffs(116, 65).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 8.3328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r4 = lowerleg2.addOrReplaceChild("lowerleg5_r4", CubeListBuilder.create().texOffs(109, 53).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r5 = lowerleg2.addOrReplaceChild("lowerleg5_r5", CubeListBuilder.create().texOffs(88, 33).addBox(-3.9F, 0.0F, 0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(31, 88).addBox(-3.9F, 0.0F, 0.1F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 7.0328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 79).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 17.0254F, 0.7475F, -1.0126F, 0.0F, 0.0F));

		PartDefinition feet4_r1 = feet2.addOrReplaceChild("feet4_r1", CubeListBuilder.create().texOffs(86, 113).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition feet2_r1 = feet2.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(99, 12).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.1309F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(65, 48).addBox(-2.0F, -0.3F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9393F, 0.6325F, 1.1814F, -0.029F, 0.0169F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 3.4694F, 0.0452F, 0.0F, -0.0087F, 0.0524F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(95, 121).addBox(-0.5F, 0.0183F, -0.9949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, -1.1567F, 4.6948F, -1.7628F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(54, 126).addBox(-0.5F, 0.0183F, -0.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2F, -1.0522F, 5.6894F, -1.6755F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(49, 126).addBox(-0.5F, 0.0183F, 0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(126, 95).addBox(-0.5F, 0.0183F, 0.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, -2.8877F, 6.4111F, -1.4137F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(110, 74).addBox(-0.5F, 0.0183F, 0.0051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -4.3019F, 4.9969F, -0.7854F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(107, 45).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, -3.1019F, 2.8969F, -0.3316F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(118, 120).addBox(-0.5F, -2.8694F, -1.0247F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, -2.9973F, -4.2001F, -1.5359F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(120, 115).addBox(-0.5F, -2.9694F, -1.0247F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -2.9973F, -4.2001F, -1.885F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(115, 125).addBox(-0.5F, -0.75F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2F, -3.7973F, -4.8001F, -1.3177F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(110, 125).addBox(-0.5F, -1.0644F, 0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, -3.1758F, -6.0393F, -0.5323F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(100, 65).addBox(-0.5F, 0.0237F, -0.0673F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.2F, -4.8008F, -4.2143F, 0.0785F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(116, 53).addBox(-0.5F, 0.3452F, -1.7388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, -4.9758F, -4.6393F, 0.384F, 0.0F, 0.0F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5F, -2.175F, -3.35F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -2.7758F, 1.4607F, -0.0087F, 0.0F, 0.0F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(91, 57).addBox(-1.1867F, 5.0076F, -0.4743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, -0.678F, 0.0352F, 0.0345F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(89, 67).addBox(-1.1867F, 5.7179F, -3.2892F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, 0.1946F, 0.0352F, 0.0345F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(117, 79).addBox(-1.1867F, 5.7759F, -3.7947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, -0.1981F, 0.0352F, 0.0345F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(60, 107).addBox(-1.1867F, 1.1315F, -7.6812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, 0.7182F, 0.0352F, 0.0345F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(109, 69).addBox(-1.1867F, 4.9223F, -4.6498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, 0.1335F, 0.0352F, 0.0345F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(81, 102).addBox(-1.1867F, -0.12F, 0.0903F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, -0.6693F, 0.0352F, 0.0345F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(58, 98).addBox(-1.1867F, -0.1027F, -0.17F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7692F, 1.5821F, -6.2954F, -0.7566F, 0.0352F, 0.0345F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(123, 55).addBox(-0.3265F, 0.6799F, -1.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(5, 122).addBox(-0.3265F, 1.1049F, -1.548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8442F, 0.5821F, -3.3953F, -0.7611F, 0.2443F, 0.0943F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(124, 70).addBox(-0.3265F, -0.464F, -1.103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8442F, 0.5821F, -3.3953F, -1.0666F, 0.2443F, 0.0943F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(73, 96).addBox(-0.5F, -1.6F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6954F, 0.0656F, -0.6917F, -0.2356F, 0.0F, 0.1745F));

		PartDefinition basin_r25 = bone2.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(114, 84).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.6945F, 0.0605F, -2.6533F, 0.1134F, 0.0F, 0.1745F));

		PartDefinition basin_r26 = bone2.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(116, 57).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4951F, 6.6185F, 9.1945F, 0.4644F, 0.0212F, 0.1733F));

		PartDefinition basin_r27 = bone2.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(14, 115).addBox(-0.5F, -0.2967F, -0.2725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1641F, 4.4399F, 6.8536F, 0.9007F, 0.0212F, 0.1733F));

		PartDefinition basin_r28 = bone2.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(114, 110).addBox(-0.5F, 0.8033F, -0.2725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0401F, 3.6397F, 6.1092F, 0.7436F, 0.0212F, 0.1733F));

		PartDefinition basin_r29 = bone2.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(116, 88).addBox(-0.5F, -2.4F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.655F, 1.109F, 3.4166F, 1.049F, 0.0212F, 0.1733F));

		PartDefinition basin_r30 = bone2.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(68, 116).addBox(-0.5F, -5.7142F, -0.588F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0401F, 3.6397F, 6.1092F, 0.7872F, 0.0212F, 0.1733F));

		PartDefinition basin_r31 = bone2.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(53, 98).addBox(-0.5F, -5.7142F, -0.438F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0401F, 3.6397F, 6.1092F, 0.8745F, 0.0212F, 0.1733F));

		PartDefinition basin_r32 = bone2.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(110, 0).addBox(-1.0F, 1.7223F, -0.0138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, 0.2531F, 0.0F, 0.1745F));

		PartDefinition basin_r33 = bone2.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -0.4522F, -1.3452F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition basin_r34 = bone2.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(109, 95).addBox(-0.5F, -0.9F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2971F, -2.1933F, -1.4084F, -1.4486F, 0.0F, 0.1745F));

		PartDefinition basin_r35 = bone2.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(124, 45).addBox(-1.0F, 2.4013F, -1.1191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, -2.7F, 0.0F, -0.7505F, 0.0F, 0.1745F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 3.4694F, 0.0452F, 0.0F, 0.0087F, -0.0524F));

		PartDefinition basin_r36 = bone4.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(95, 121).mirror().addBox(-0.5F, 0.0183F, -0.9949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.1567F, 4.6948F, -1.7628F, 0.0F, 0.0F));

		PartDefinition basin_r37 = bone4.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(54, 126).mirror().addBox(-0.5F, 0.0183F, -0.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.0522F, 5.6894F, -1.6755F, 0.0F, 0.0F));

		PartDefinition basin_r38 = bone4.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(49, 126).mirror().addBox(-0.5F, 0.0183F, 0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(126, 95).mirror().addBox(-0.5F, 0.0183F, 0.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.8877F, 6.4111F, -1.4137F, 0.0F, 0.0F));

		PartDefinition basin_r39 = bone4.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(110, 74).mirror().addBox(-0.5F, 0.0183F, 0.0051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.3019F, 4.9969F, -0.7854F, 0.0F, 0.0F));

		PartDefinition basin_r40 = bone4.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(107, 45).mirror().addBox(-0.5F, -1.8F, -0.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.1019F, 2.8969F, -0.3316F, 0.0F, 0.0F));

		PartDefinition basin_r41 = bone4.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(118, 120).mirror().addBox(-0.5F, -2.8694F, -1.0247F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.9973F, -4.2001F, -1.5359F, 0.0F, 0.0F));

		PartDefinition basin_r42 = bone4.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(120, 115).mirror().addBox(-0.5F, -2.9694F, -1.0247F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.9973F, -4.2001F, -1.885F, 0.0F, 0.0F));

		PartDefinition basin_r43 = bone4.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(115, 125).mirror().addBox(-0.5F, -0.75F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.7973F, -4.8001F, -1.3177F, 0.0F, 0.0F));

		PartDefinition basin_r44 = bone4.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(110, 125).mirror().addBox(-0.5F, -1.0644F, 0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.1758F, -6.0393F, -0.5323F, 0.0F, 0.0F));

		PartDefinition basin_r45 = bone4.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(100, 65).mirror().addBox(-0.5F, 0.0237F, -0.0673F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8008F, -4.2143F, 0.0785F, 0.0F, 0.0F));

		PartDefinition basin_r46 = bone4.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(116, 53).mirror().addBox(-0.5F, 0.3452F, -1.7388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.9758F, -4.6393F, 0.384F, 0.0F, 0.0F));

		PartDefinition basin_r47 = bone4.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.5F, -2.175F, -3.35F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.7758F, 1.4607F, -0.0087F, 0.0F, 0.0F));

		PartDefinition basin_r48 = bone4.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(0.1867F, 5.0076F, -0.4743F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, -0.678F, -0.0352F, -0.0345F));

		PartDefinition basin_r49 = bone4.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(89, 67).mirror().addBox(0.1867F, 5.7179F, -3.2892F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, 0.1946F, -0.0352F, -0.0345F));

		PartDefinition basin_r50 = bone4.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(117, 79).mirror().addBox(0.1867F, 5.7759F, -3.7947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, -0.1981F, -0.0352F, -0.0345F));

		PartDefinition basin_r51 = bone4.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(60, 107).mirror().addBox(0.1867F, 1.1315F, -7.6812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, 0.7182F, -0.0352F, -0.0345F));

		PartDefinition basin_r52 = bone4.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(109, 69).mirror().addBox(0.1867F, 4.9223F, -4.6498F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, 0.1335F, -0.0352F, -0.0345F));

		PartDefinition basin_r53 = bone4.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(81, 102).mirror().addBox(0.1867F, -0.12F, 0.0903F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, -0.6693F, -0.0352F, -0.0345F));

		PartDefinition basin_r54 = bone4.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(58, 98).mirror().addBox(0.1867F, -0.1027F, -0.17F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7692F, 1.5821F, -6.2954F, -0.7566F, -0.0352F, -0.0345F));

		PartDefinition basin_r55 = bone4.addOrReplaceChild("basin_r55", CubeListBuilder.create().texOffs(123, 55).mirror().addBox(-0.6735F, 0.6799F, -1.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(5, 122).mirror().addBox(-0.6735F, 1.1049F, -1.548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8442F, 0.5821F, -3.3953F, -0.7611F, -0.2443F, -0.0943F));

		PartDefinition basin_r56 = bone4.addOrReplaceChild("basin_r56", CubeListBuilder.create().texOffs(124, 70).mirror().addBox(-0.6735F, -0.464F, -1.103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8442F, 0.5821F, -3.3953F, -1.0666F, -0.2443F, -0.0943F));

		PartDefinition basin_r57 = bone4.addOrReplaceChild("basin_r57", CubeListBuilder.create().texOffs(73, 96).mirror().addBox(-0.5F, -1.6F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6954F, 0.0656F, -0.6917F, -0.2356F, 0.0F, -0.1745F));

		PartDefinition basin_r58 = bone4.addOrReplaceChild("basin_r58", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-0.5F, -0.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.6945F, 0.0605F, -2.6533F, 0.1134F, 0.0F, -0.1745F));

		PartDefinition basin_r59 = bone4.addOrReplaceChild("basin_r59", CubeListBuilder.create().texOffs(116, 57).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.4951F, 6.6185F, 9.1945F, 0.4644F, -0.0212F, -0.1733F));

		PartDefinition basin_r60 = bone4.addOrReplaceChild("basin_r60", CubeListBuilder.create().texOffs(14, 115).mirror().addBox(-0.5F, -0.2967F, -0.2725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1641F, 4.4399F, 6.8536F, 0.9007F, -0.0212F, -0.1733F));

		PartDefinition basin_r61 = bone4.addOrReplaceChild("basin_r61", CubeListBuilder.create().texOffs(114, 110).mirror().addBox(-0.5F, 0.8033F, -0.2725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.0401F, 3.6397F, 6.1092F, 0.7436F, -0.0212F, -0.1733F));

		PartDefinition basin_r62 = bone4.addOrReplaceChild("basin_r62", CubeListBuilder.create().texOffs(116, 88).mirror().addBox(-0.5F, -2.4F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.655F, 1.109F, 3.4166F, 1.049F, -0.0212F, -0.1733F));

		PartDefinition basin_r63 = bone4.addOrReplaceChild("basin_r63", CubeListBuilder.create().texOffs(68, 116).mirror().addBox(-0.5F, -5.7142F, -0.588F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0401F, 3.6397F, 6.1092F, 0.7872F, -0.0212F, -0.1733F));

		PartDefinition basin_r64 = bone4.addOrReplaceChild("basin_r64", CubeListBuilder.create().texOffs(53, 98).mirror().addBox(-0.5F, -5.7142F, -0.438F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0401F, 3.6397F, 6.1092F, 0.8745F, -0.0212F, -0.1733F));

		PartDefinition basin_r65 = bone4.addOrReplaceChild("basin_r65", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(0.0F, 1.7223F, -0.0138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, 0.2531F, 0.0F, -0.1745F));

		PartDefinition basin_r66 = bone4.addOrReplaceChild("basin_r66", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(0.0F, -0.4522F, -1.3452F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition basin_r67 = bone4.addOrReplaceChild("basin_r67", CubeListBuilder.create().texOffs(109, 95).mirror().addBox(-0.5F, -0.9F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2971F, -2.1933F, -1.4084F, -1.4486F, 0.0F, -0.1745F));

		PartDefinition basin_r68 = bone4.addOrReplaceChild("basin_r68", CubeListBuilder.create().texOffs(124, 45).mirror().addBox(0.0F, 2.4013F, -1.1191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.0F, -0.7505F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 133, 133);
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