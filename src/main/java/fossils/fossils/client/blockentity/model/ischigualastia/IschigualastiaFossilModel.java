package fossils.fossils.client.blockentity.model.ischigualastia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IschigualastiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public IschigualastiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone4 = this.body.getChild("bone4");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.chest2 = this.chest.getChild("chest2");
		this.neck2 = this.chest2.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0196F, 10.9544F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 76).addBox(-2.5F, -1.4337F, 2.9478F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 89).addBox(-2.5F, -1.5522F, 1.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 73).addBox(0.0F, -1.9423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4465F, 1.0888F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 63).addBox(0.0F, -1.8009F, 0.0446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4376F, -0.9906F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(0.5F, 0.4506F, 1.0286F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 68).addBox(2.5F, 0.4506F, 1.0286F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 1.9519F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 25).mirror().addBox(0.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 25).addBox(2.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 3.5519F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -0.0145F, 0.007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 86).addBox(-0.5067F, -1.7241F, 1.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -0.8601F, -0.1315F, 0.1568F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 81).addBox(-0.5067F, -2.7389F, -0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -1.6891F, -0.1315F, 0.1568F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 88).addBox(-0.5067F, -1.2393F, -2.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -2.5182F, -0.1315F, 0.1568F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 56).addBox(-0.5067F, -2.3629F, -1.614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -1.9946F, -0.1315F, 0.1568F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 75).addBox(-0.5067F, -0.5349F, -0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, 2.9796F, -0.1315F, 0.1568F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5067F, -0.2912F, -1.1707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, 0.798F, -0.1315F, 0.1568F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 60).addBox(-0.0171F, -1.9435F, -1.1999F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.2971F, -0.3045F, 0.2053F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 89).addBox(-0.0171F, -1.694F, -2.3364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 0.7298F, -0.3045F, 0.2053F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(81, 88).addBox(-0.0171F, -2.8274F, -0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.4716F, -0.3045F, 0.2053F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(87, 87).addBox(-0.0171F, -1.701F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 2.257F, -0.3045F, 0.2053F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 28).addBox(-0.0171F, -1.8333F, -0.4465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.6898F, -0.3045F, 0.2053F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 76).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.994F, -0.9552F, -0.7038F, 1.3317F, -0.0255F, 0.111F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(75, 73).addBox(-0.5F, -1.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8353F, 0.4016F, -0.4129F, 2.5534F, -0.0255F, 0.111F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 40).addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8529F, -0.2062F, 1.5371F, -2.4644F, -0.0255F, 0.111F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 15).addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6417F, 2.2155F, -0.7495F, -1.8274F, -0.0255F, 0.111F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 60).addBox(-0.5F, -0.775F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5661F, 2.5469F, 0.7573F, -1.2165F, -0.0255F, 0.111F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5661F, 2.5469F, 0.7573F, -1.7401F, -0.0255F, 0.111F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 5).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6245F, 1.6149F, 2.5259F, -1.0856F, -0.0255F, 0.111F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8054F, 1.2074F, -2.7437F, 2.4661F, -0.0255F, 0.111F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(55, 75).addBox(-0.5F, -1.0F, 0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9293F, -0.1822F, -1.5371F, -2.8571F, -0.0255F, 0.111F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(24, 19).addBox(-0.475F, -0.45F, -0.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, -1.8692F, -2.5091F, -1.1539F, -0.0203F, 0.0944F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(87, 33).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0435F, -1.3137F, -3.2763F, -2.4208F, -0.0255F, 0.111F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(67, 36).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -2.8055F, -1.7663F, -0.0255F, 0.111F));

		PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 86).mirror().addBox(-0.4933F, -1.7241F, 1.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -0.8601F, 0.1315F, -0.1568F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-0.4933F, -2.7389F, -0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -1.6891F, 0.1315F, -0.1568F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(8, 88).mirror().addBox(-0.4933F, -1.2393F, -2.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -2.5182F, 0.1315F, -0.1568F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 56).mirror().addBox(-0.4933F, -2.3629F, -1.614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -1.9946F, 0.1315F, -0.1568F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-0.4933F, -0.5349F, -0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, 2.9796F, 0.1315F, -0.1568F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.4933F, -0.2912F, -1.1707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, 0.798F, 0.1315F, -0.1568F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.9829F, -1.9435F, -1.1999F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.2971F, 0.3045F, -0.2053F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(18, 89).mirror().addBox(-0.9829F, -1.694F, -2.3364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 0.7298F, 0.3045F, -0.2053F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 88).mirror().addBox(-0.9829F, -2.8274F, -0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.4716F, 0.3045F, -0.2053F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-0.9829F, -1.701F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 2.257F, 0.3045F, -0.2053F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-0.9829F, -1.8333F, -0.4465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.6898F, 0.3045F, -0.2053F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.994F, -0.9552F, -0.7038F, 1.3317F, 0.0255F, -0.111F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.5F, -1.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8353F, 0.4016F, -0.4129F, 2.5534F, 0.0255F, -0.111F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 40).mirror().addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 67).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8529F, -0.2062F, 1.5371F, -2.4644F, 0.0255F, -0.111F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6417F, 2.2155F, -0.7495F, -1.8274F, 0.0255F, -0.111F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-0.5F, -0.775F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5661F, 2.5469F, 0.7573F, -1.2165F, 0.0255F, -0.111F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5661F, 2.5469F, 0.7573F, -1.7401F, 0.0255F, -0.111F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6245F, 1.6149F, 2.5259F, -1.0856F, 0.0255F, -0.111F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8054F, 1.2074F, -2.7437F, 2.4661F, 0.0255F, -0.111F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.5F, -1.0F, 0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, -0.1822F, -1.5371F, -2.8571F, 0.0255F, -0.111F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(24, 19).mirror().addBox(-0.525F, -0.45F, -0.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, -1.8692F, -2.5091F, -1.1539F, 0.0203F, -0.0944F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(87, 33).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0435F, -1.3137F, -3.2763F, -2.4208F, 0.0255F, -0.111F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -2.8055F, -1.7663F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9338F, 3.5043F, 2.1903F, -0.6002F, 0.167F, -1.0292F));

		PartDefinition cube_r54 = upperleg1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0982F, 4.1944F, 1.6016F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r55 = upperleg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(18, 52).addBox(-1.5F, -1.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 5.5042F, 3.4396F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = upperleg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 34).addBox(-1.5F, -0.8F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.4982F, 7.6709F, 1.6215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r57 = upperleg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(38, 29).addBox(-1.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 6.3197F, 0.1469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r58 = upperleg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(27, 47).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 4.3501F, -0.2004F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r59 = upperleg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r60 = upperleg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(22, 37).addBox(-1.5F, -2.0F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r61 = upperleg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0982F, 3.8887F, 0.6977F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r62 = upperleg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5F, -3.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0982F, 2.7889F, -0.8025F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r63 = upperleg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 70).addBox(-1.5F, -1.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r64 = upperleg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(27, 51).addBox(-1.5F, -0.2F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r65 = upperleg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 46).addBox(-1.5F, -1.15F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 1.0276F, 1.1858F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r66 = upperleg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(43, 44).addBox(-1.5F, -0.325F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 1.0276F, 1.1858F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, 7.807F, 1.2578F, 0.9861F, -0.6207F, 0.5445F));

		PartDefinition cube_r67 = leg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(59, 47).addBox(-0.3165F, -4.7286F, 0.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 4.6722F, 0.2489F, -0.0073F, 1.3147F, 0.1794F));

		PartDefinition cube_r68 = leg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 73).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6173F, 2.0145F, -0.2125F, 0.3418F, 1.3147F, 0.2666F));

		PartDefinition cube_r69 = leg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(87, 84).addBox(-0.5F, -2.15F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9074F, 6.1825F, 0.0143F, -0.2691F, 1.3147F, 0.2666F));

		PartDefinition cube_r70 = leg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(79, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1284F, 3.653F, -0.216F, 0.1673F, 1.3147F, 0.2666F));

		PartDefinition cube_r71 = leg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 17).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6173F, 2.0145F, -0.2125F, 0.0364F, 1.3147F, 0.2666F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1327F, 4.8498F, -0.174F, -0.0851F, 0.1792F, 0.3833F));

		PartDefinition cube_r72 = feet1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 34).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition cube_r73 = feet1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 17).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9338F, 3.5043F, 2.1903F, -0.2723F, -0.2398F, 0.9181F));

		PartDefinition cube_r74 = upperleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(23, 26).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0982F, 4.1944F, 1.6016F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r75 = upperleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(52, 43).addBox(-0.5F, -1.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 5.5042F, 3.4396F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = upperleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(44, 17).addBox(-0.5F, -0.8F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.4982F, 7.6709F, 1.6215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r77 = upperleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 6.3197F, 0.1469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r78 = upperleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 22).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 4.3501F, -0.2004F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r79 = upperleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r80 = upperleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 37).addBox(-0.5F, -2.0F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r81 = upperleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 66).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0982F, 3.8887F, 0.6977F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r82 = upperleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5F, -3.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0982F, 2.7889F, -0.8025F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r83 = upperleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(33, 71).addBox(-0.5F, -1.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r84 = upperleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.2F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r85 = upperleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, -1.15F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 1.0276F, 1.1858F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r86 = upperleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.325F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 1.0276F, 1.1858F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, 7.807F, 1.2578F, 1.3183F, 0.5434F, -0.4959F));

		PartDefinition cube_r87 = leg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 17).addBox(-0.6835F, -4.7286F, 0.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 4.6722F, 0.2489F, -0.0073F, -1.3147F, -0.1794F));

		PartDefinition cube_r88 = leg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(74, 5).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6173F, 2.0145F, -0.2125F, 0.3418F, -1.3147F, -0.2666F));

		PartDefinition cube_r89 = leg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 88).addBox(-0.5F, -2.15F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9074F, 6.1825F, 0.0143F, -0.2691F, -1.3147F, -0.2666F));

		PartDefinition cube_r90 = leg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1284F, 3.653F, -0.216F, 0.1673F, -1.3147F, -0.2666F));

		PartDefinition cube_r91 = leg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 74).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6173F, 2.0145F, -0.2125F, 0.0364F, -1.3147F, -0.2666F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1327F, 4.8498F, -0.174F, -0.696F, -0.1792F, -0.3833F));

		PartDefinition cube_r92 = feet2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(11, 37).addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition cube_r93 = feet2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(17, 0).addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -0.0413F, -0.5234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9744F, 5.6003F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(26, 67).addBox(0.0F, -1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3534F, -0.8371F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(65, 21).addBox(-15.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.9587F, 0.4766F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7957F, 0.4882F, -0.2226F, -0.0338F, 0.2597F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1861F, -0.0779F, 0.2956F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(23, 56).addBox(0.0F, -2.0419F, 0.0206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -1.9557F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, -1.9689F, 0.0191F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -3.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(90, 69).addBox(0.0F, -2.0954F, 0.0063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -5.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.3F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-6.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.0817F, 0.2147F, -1.5022F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.1652F, 0.1601F, -1.0614F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.2247F, 0.0473F, -0.5021F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.1683F, 0.1978F, -1.1292F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.2473F, 0.0776F, -0.569F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.146F, 0.2067F, -1.2357F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(37, 17).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.2336F, 0.0967F, -0.6723F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(37, 17).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.2336F, -0.0967F, 0.6723F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(75, 45).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.146F, -0.2067F, 1.2357F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 47).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.2473F, -0.0776F, 0.569F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(48, 6).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.1683F, -0.1978F, 1.1292F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(79, 6).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.2247F, -0.0473F, 0.5021F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(51, 26).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.1652F, -0.1601F, 1.0614F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(79, 4).addBox(4.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.0817F, -0.2147F, 1.5022F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9617F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 83).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1688F, -5.9579F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(79, 82).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0399F, -3.9593F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.0866F, 0.2405F, -1.4139F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1808F, 0.1814F, -0.9715F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.249F, 0.0571F, -0.4136F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.219F, 0.039F, -0.4153F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.1648F, 0.1501F, -0.9744F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.0857F, 0.2055F, -1.4143F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.2351F, 0.046F, -0.4321F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.1747F, 0.1646F, -0.9903F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.0885F, 0.2228F, -1.4312F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(64, 59).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.0885F, -0.2228F, 1.4312F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(48, 10).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.1747F, -0.1646F, 0.9903F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(77, 70).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.2351F, -0.046F, 0.4321F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(47, 31).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.0857F, -0.2055F, 1.4143F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 41).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.1648F, -0.1501F, 0.9744F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 77).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.219F, -0.039F, 0.4153F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(76, 49).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.249F, -0.0571F, 0.4136F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(48, 8).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1808F, -0.1814F, 0.9715F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(47, 29).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.0866F, -0.2405F, 1.4139F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(66, 80).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2097F, -1.962F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.8189F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(28, 85).addBox(0.0F, -2.3693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5433F, -1.0467F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 85).addBox(0.0F, -2.3693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0952F, -2.9677F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(18, 42).addBox(-0.5F, 0.0019F, 4.1302F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.1F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1468F, 0.1303F, -1.0117F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.0779F, 0.18F, -1.4506F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1934F, 0.0317F, -0.451F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.2632F, 0.068F, -0.4825F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 35).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.1871F, 0.198F, -1.0401F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.0851F, 0.2582F, -1.484F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(65, 19).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.0851F, -0.2582F, 1.484F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 35).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.1871F, -0.198F, 1.0401F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(78, 0).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.2632F, -0.068F, 0.4825F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(75, 77).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1934F, -0.0317F, 0.451F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 4).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.0779F, -0.18F, 1.4506F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(49, 33).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1468F, -0.1303F, 1.0117F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6287F, 5.7053F, -4.5249F, 1.0537F, -0.1355F, -0.7022F));

		PartDefinition cube_r151 = upperarm1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(11, 31).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, -0.5205F, -0.2163F, -0.0289F));

		PartDefinition cube_r152 = upperarm1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 52).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8273F, 1.7428F, -1.0126F, 1.1473F, -0.8076F, -0.8628F));

		PartDefinition cube_r153 = upperarm1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6447F, 1.1026F, -0.2664F, 0.6878F, 0.1212F, 0.2493F));

		PartDefinition cube_r154 = upperarm1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(36, 51).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, 0.7013F, -0.2163F, -0.0289F));

		PartDefinition cube_r155 = upperarm1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(46, 79).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8493F, 2.2941F, -1.0402F, 0.0027F, -0.4483F, 1.0612F));

		PartDefinition cube_r156 = upperarm1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(27, 55).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, 0.3958F, -0.2163F, -0.0289F));

		PartDefinition cube_r157 = upperarm1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 12).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, -0.215F, -0.2163F, -0.0289F));

		PartDefinition cube_r158 = upperarm1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(44, 22).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.2098F, 6.2369F, 0.0584F, 0.134F, -0.2163F, -0.0289F));

		PartDefinition cube_r159 = upperarm1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1002F, 5.9921F, 0.5903F, 1.1376F, -0.2163F, -0.0289F));

		PartDefinition cube_r160 = upperarm1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(43, 53).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0775F, 7.5907F, -1.426F, 0.3522F, -0.2163F, -0.0289F));

		PartDefinition cube_r161 = upperarm1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(62, 24).addBox(0.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3797F, 6.9424F, 0.5691F, -0.1714F, -0.2163F, -0.0289F));

		PartDefinition cube_r162 = upperarm1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(50, 57).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 4.9934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0024F, 7.7369F, 0.2664F, -0.5939F, 0.3154F, 0.4471F));

		PartDefinition cube_r163 = lowerarm1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 62).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(20, 80).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4955F, -0.2335F, -0.2897F, -0.3136F, 1.2533F, -0.3373F));

		PartDefinition cube_r164 = lowerarm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(23, 86).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 33).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0329F, 0.4103F, -0.022F, -1.4437F, 1.2578F, -0.246F));

		PartDefinition cube_r165 = lowerarm1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(61, 80).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.814F, 0.5868F, 0.2093F, 0.607F, 1.2578F, -0.246F));

		PartDefinition cube_r166 = lowerarm1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(82, 43).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7381F, -0.4089F, 0.264F, -0.1784F, 1.2578F, -0.246F));

		PartDefinition cube_r167 = lowerarm1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3965F, 1.2578F, -0.246F));

		PartDefinition cube_r168 = lowerarm1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0761F, 4.1855F, -0.6257F, -0.2874F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7865F, 2.9843F, -1.1939F, 0.4811F, -0.0266F, 0.1809F));

		PartDefinition cube_r169 = hand1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(15, 9).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0538F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r170 = hand1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 5).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r171 = hand1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(36, 80).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition cube_r172 = hand1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(68, 44).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6287F, 5.7053F, -4.5249F, 0.2683F, 0.1355F, 0.7022F));

		PartDefinition cube_r173 = upperarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(20, 31).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, -0.5205F, 0.2163F, 0.0289F));

		PartDefinition cube_r174 = upperarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(53, 17).addBox(0.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8273F, 1.7428F, -1.0126F, 1.1473F, 0.8076F, 0.8628F));

		PartDefinition cube_r175 = upperarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(28, 12).addBox(0.0F, -1.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6447F, 1.1026F, -0.2664F, 0.6878F, -0.1212F, -0.2493F));

		PartDefinition cube_r176 = upperarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(52, 47).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, 0.7013F, 0.2163F, 0.0289F));

		PartDefinition cube_r177 = upperarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8493F, 2.2941F, -1.0402F, 0.0027F, 0.4483F, -1.0612F));

		PartDefinition cube_r178 = upperarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(16, 56).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, 0.3958F, 0.2163F, 0.0289F));

		PartDefinition cube_r179 = upperarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, -0.215F, 0.2163F, 0.0289F));

		PartDefinition cube_r180 = upperarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2098F, 6.2369F, 0.0584F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition cube_r181 = upperarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(14, 61).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1002F, 5.9921F, 0.5903F, 1.1376F, 0.2163F, 0.0289F));

		PartDefinition cube_r182 = upperarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0775F, 7.5907F, -1.426F, 0.3522F, 0.2163F, 0.0289F));

		PartDefinition cube_r183 = upperarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(37, 63).addBox(-1.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3797F, 6.9424F, 0.5691F, -0.1714F, 0.2163F, 0.0289F));

		PartDefinition cube_r184 = upperarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1203F, 4.9934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9166F, 7.778F, 0.2354F, -0.5939F, -0.3154F, -0.4471F));

		PartDefinition cube_r185 = lowerarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(25, 80).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4955F, -0.2335F, -0.2897F, -0.3136F, -1.2533F, 0.3373F));

		PartDefinition cube_r186 = lowerarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(87, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0329F, 0.4103F, -0.022F, -1.4437F, -1.2578F, 0.246F));

		PartDefinition cube_r187 = lowerarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(80, 64).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.814F, 0.5868F, 0.2093F, 0.607F, -1.2578F, 0.246F));

		PartDefinition cube_r188 = lowerarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(46, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7381F, -0.4089F, 0.264F, -0.1784F, -1.2578F, 0.246F));

		PartDefinition cube_r189 = lowerarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(69, 21).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3965F, -1.2578F, 0.246F));

		PartDefinition cube_r190 = lowerarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(70, 65).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0761F, 4.1855F, -0.6257F, -0.2874F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7865F, 2.9843F, -1.1939F, 0.955F, 0.1338F, -0.2564F));

		PartDefinition cube_r191 = hand2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 14).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0538F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r192 = hand2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(30, 0).addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r193 = hand2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(80, 37).addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition cube_r194 = hand2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(26, 70).addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.3F, 16.9835F, -3.7304F));

		PartDefinition cube_r195 = bone2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(44, 67).addBox(-1.6F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9057F, -10.8112F, -1.3401F, 1.204F, -0.3203F, -0.6971F));

		PartDefinition cube_r196 = bone2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 79).addBox(0.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5544F, -10.0391F, -1.188F, 1.1733F, 0.4965F, -1.0148F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(26, 73).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5544F, -10.0391F, -1.188F, 1.2163F, -0.1978F, -0.7448F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(71, 47).addBox(-1.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2037F, -10.6844F, -3.5104F, 1.0956F, -0.0216F, -0.1155F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(5, 78).addBox(-0.2F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.349F, -12.7086F, -3.3446F, -1.5551F, -1.1086F, 1.8434F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(65, 76).addBox(-0.4408F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7787F, -11.2844F, -3.3104F, -1.5261F, -1.4139F, 1.8132F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(75, 64).addBox(-0.3149F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7787F, -10.6844F, -3.3104F, 1.492F, -1.3739F, -0.858F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(45, 71).addBox(-0.5F, 0.2F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0992F, -17.6187F, -2.0226F, 0.4567F, 0.0122F, -0.3769F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(65, 88).addBox(-0.4878F, -1.0668F, -0.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1593F, -17.8032F, -0.0416F, -2.8594F, 0.0122F, -0.3769F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, -1.275F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(82, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1234F, -17.7455F, -0.0439F, -2.074F, 0.0122F, -0.3769F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 33).addBox(-0.5F, -1.2F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.7657F, 0.0122F, -0.3769F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(35, 19).addBox(-0.5F, -1.125F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.1549F, 0.0122F, -0.3769F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(13, 83).addBox(-0.45F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1053F, -14.9474F, -1.9244F, -3.1178F, 0.0476F, -0.34F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(86, 27).addBox(-0.6709F, 0.0877F, -0.5934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5056F, -12.3266F, -2.7568F, 0.7309F, 0.1166F, -0.1848F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(31, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6428F, -12.2173F, -2.6105F, 2.5635F, 0.1166F, -0.1848F));

		PartDefinition cube_r210 = bone2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 22).addBox(-0.5F, -1.9F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5963F, -12.8822F, -1.1767F, 2.0399F, 0.1166F, -0.1848F));

		PartDefinition cube_r211 = bone2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 31).addBox(-0.5F, -0.875F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.7899F, -13.8818F, -1.2331F, 1.6909F, 0.1166F, -0.1848F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.3F, 16.9835F, -3.7304F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(-0.4F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9057F, -10.8112F, -1.3401F, 1.204F, 0.3203F, 0.6971F));

		PartDefinition cube_r213 = bone3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-1.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -10.0391F, -1.188F, 1.1733F, -0.4965F, 1.0148F));

		PartDefinition cube_r214 = bone3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -10.0391F, -1.188F, 1.2163F, 0.1978F, 0.7448F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(0.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2037F, -10.6844F, -3.5104F, 1.0956F, 0.0216F, 0.1155F));

		PartDefinition cube_r216 = bone3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.8F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.349F, -12.7086F, -3.3446F, -1.5551F, 1.1086F, -1.8434F));

		PartDefinition cube_r217 = bone3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.5592F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7787F, -11.2844F, -3.3104F, -1.5261F, 1.4139F, -1.8132F));

		PartDefinition cube_r218 = bone3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-0.6851F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7787F, -10.6844F, -3.3104F, 1.492F, 1.3739F, 0.858F));

		PartDefinition cube_r219 = bone3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-0.5F, 0.2F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0992F, -17.6187F, -2.0226F, 0.4567F, -0.0122F, 0.3769F));

		PartDefinition cube_r220 = bone3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(65, 88).mirror().addBox(-0.5122F, -1.0668F, -0.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.1593F, -17.8032F, -0.0416F, -2.8594F, -0.0122F, 0.3769F));

		PartDefinition cube_r221 = bone3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-0.5F, -1.275F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(82, 75).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1234F, -17.7455F, -0.0439F, -2.074F, -0.0122F, 0.3769F));

		PartDefinition cube_r222 = bone3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-0.5F, -1.2F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.7657F, -0.0122F, 0.3769F));

		PartDefinition cube_r223 = bone3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(35, 19).mirror().addBox(-0.5F, -1.125F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.1549F, -0.0122F, 0.3769F));

		PartDefinition cube_r224 = bone3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(13, 83).mirror().addBox(-0.55F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1053F, -14.9474F, -1.9244F, -3.1178F, -0.0476F, 0.34F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.3291F, 0.0877F, -0.5934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -12.3266F, -2.7568F, 0.7309F, -0.1166F, 0.1848F));

		PartDefinition cube_r226 = bone3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(31, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6428F, -12.2173F, -2.6105F, 2.5635F, -0.1166F, 0.1848F));

		PartDefinition cube_r227 = bone3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-0.5F, -1.9F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5963F, -12.8822F, -1.1767F, 2.0399F, -0.1166F, 0.1848F));

		PartDefinition cube_r228 = bone3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(29, 31).mirror().addBox(-0.5F, -0.875F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.7899F, -13.8818F, -1.2331F, 1.6909F, -0.1166F, 0.1848F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2073F, -3.0162F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(78, 2).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.1646F, 0.0116F, -0.5213F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(49, 37).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.133F, 0.098F, -1.083F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(24, 78).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.0791F, 0.1449F, -1.5201F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -3.5F, 0.3251F, 0.1008F, -0.5644F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -3.5F, 0.2231F, 0.2585F, -1.1191F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(24, 78).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.0791F, -0.1449F, 1.5201F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0019F, 0.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7073F, -4.0838F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(84, 32).addBox(0.0F, -2.4906F, -0.1385F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7869F, -3.8754F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(84, 22).addBox(0.0F, -2.3693F, -0.1104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3869F, -1.8754F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(49, 39).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.5F, 0.2231F, -0.2585F, 1.1191F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 51).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.5F, 0.3251F, -0.1008F, 0.5644F));

		PartDefinition cube_r240 = chest2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(49, 37).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.133F, -0.098F, 1.083F));

		PartDefinition cube_r241 = chest2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 2).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.1646F, -0.0116F, 0.5213F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.1067F, -3.7357F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 17).addBox(0.0F, -2.4693F, -0.0854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(30, 66).addBox(-0.5F, 0.0052F, 3.0067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(78, 53).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.516F, 0.2261F, -0.6563F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.3244F, 0.4639F, -1.2062F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(78, 55).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.3244F, -0.4639F, 1.2062F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(78, 53).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.516F, -0.2261F, 0.6563F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0358F, -1.6639F, 0.1806F, -0.2577F, -0.0465F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, -2.378F, -0.2611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(40, 39).addBox(-0.5F, -0.1214F, 0.8322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-3.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0025F, -1.812F, 0.7277F, 0.7614F, -0.8155F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 65).addBox(0.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0025F, -1.812F, 0.7277F, -0.7614F, 0.8155F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4584F, -2.7631F, 0.6324F, -0.2778F, 0.0208F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(61, 83).addBox(0.0F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7418F, -4.2046F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(75, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5197F, -3.5407F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 61).addBox(-0.5F, -2.1F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.7997F, -4.6639F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(64, 47).addBox(-0.5F, -0.075F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4062F, -2.2147F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(37, 12).addBox(-0.5F, -0.075F, -2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.354F, -2.6113F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, -0.625F, -3.2966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2381F, -1.1608F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(64, 55).addBox(-1.0F, -0.825F, -0.1966F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2381F, -1.1608F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(14, 19).addBox(0.0F, -0.825F, -1.4966F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2381F, -1.1608F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, 0.0027F, -2.015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7063F, -3.5272F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, -0.9973F, -2.015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5584F, -2.5382F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 55).addBox(-0.5F, -1.0012F, 0.0119F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8639F, -6.3777F, -2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 52).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.2139F, -5.4527F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -0.9916F, -1.9933F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.5368F, -4.5242F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(38, 8).addBox(0.0F, -0.9916F, -1.9933F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -2.5368F, -4.5242F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(38, 4).addBox(0.0F, -0.9917F, -1.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.6846F, -3.5352F, 1.7179F, -0.0193F, 0.1295F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(39, 4).addBox(-1.0F, -0.9917F, -1.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6846F, -3.5352F, 1.7179F, 0.0193F, -0.1295F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(81, 29).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -2.9954F, -1.9015F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(81, 29).addBox(0.0F, -0.525F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(9, 41).addBox(0.0F, -0.2F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -2.0697F, -4.2346F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1052F, 0.8222F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.1716F, 0.4639F, 2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(67, 32).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.6034F, -0.0984F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 68).addBox(-0.5F, -1.0F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 68).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.1998F, 0.3911F, 2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -2.9715F, -1.8944F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(19, 67).addBox(-1.0F, -1.1F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5234F, -0.5216F, -0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4386F, -1.3126F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(81, 8).mirror().addBox(-0.5F, -1.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2504F, -0.3683F, -0.0345F, -2.4438F, -0.0511F, 0.0113F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(18, 83).mirror().addBox(-0.5F, -0.825F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2604F, -0.2093F, 0.1243F, -2.9677F, -0.03F, 0.0429F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3191F, 1.3171F, -0.1034F, -2.4441F, -0.03F, 0.0429F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(-0.5F, -0.3F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 1.2841F, -0.3928F, -1.6151F, -0.03F, 0.0429F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2653F, 0.9774F, -1.3441F, -1.269F, -0.0998F, 0.0431F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(76, 87).mirror().addBox(-0.0007F, 0.9813F, -0.4647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.543F, -0.9472F, -1.0072F, -0.0998F, 0.0431F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-0.0007F, 1.8204F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.543F, -0.9472F, -0.9199F, -0.0998F, 0.0431F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(0.0134F, -2.0003F, -1.0168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6356F, 2.543F, -2.9472F, 0.1234F, -0.187F, 0.0436F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-0.0583F, -1.0119F, 0.0373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.718F, -3.9222F, 1.2031F, -0.1833F, 0.0393F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(23, 83).mirror().addBox(-0.2203F, -0.1342F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.718F, -3.9222F, 2.5864F, -0.3347F, 0.0904F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-0.257F, -1.1971F, -1.2181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9518F, 1.786F, -5.3189F, -1.5153F, -0.3783F, 0.0905F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.257F, 0.5088F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(86, 3).mirror().addBox(0.143F, 0.5088F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9518F, 1.786F, -5.3189F, -2.3879F, -0.3783F, 0.0905F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(0.3216F, 0.3866F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9518F, 1.786F, -5.3189F, -2.3173F, -0.066F, -0.2235F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(56, 79).mirror().addBox(-0.0007F, -0.3619F, -0.4227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.4872F, -0.0998F, 0.0431F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.0007F, 0.8223F, -0.9254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.543F, -0.9472F, -1.3126F, -0.0998F, 0.0431F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-0.475F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6834F, 1.2258F, -4.88F, -2.6794F, -0.3855F, -0.0831F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(-0.5F, -0.375F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9476F, 0.9948F, -3.7412F, -2.9745F, -0.187F, 0.0131F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-0.5F, -0.575F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1561F, 0.605F, -2.2729F, -1.1817F, -0.0998F, 0.0431F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(0.4728F, 0.0111F, -0.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9518F, 1.786F, -5.3189F, -2.3797F, 0.2917F, -0.088F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(19, 71).mirror().addBox(-0.257F, -0.044F, -0.5946F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.9518F, 1.786F, -5.3189F, -2.2134F, -0.3783F, 0.0905F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(74, 82).addBox(-1.4728F, 0.0111F, -0.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9518F, 1.786F, -5.3189F, -2.3797F, -0.2917F, 0.088F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(31, 74).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1561F, 0.605F, -2.2729F, -1.1817F, 0.0998F, -0.0431F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(51, 82).addBox(-0.5F, -0.375F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9476F, 0.9948F, -3.7412F, -2.9745F, 0.187F, -0.0131F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(87, 43).addBox(-0.525F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6834F, 1.2258F, -4.88F, -2.6794F, 0.3855F, 0.0831F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 21).addBox(-0.9993F, 0.8223F, -0.9254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.7355F, 0.543F, -0.9472F, -1.3126F, 0.0998F, -0.0431F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(56, 79).addBox(-0.9993F, -0.3619F, -0.4227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.4872F, 0.0998F, -0.0431F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(40, 83).addBox(-1.3216F, 0.3866F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9518F, 1.786F, -5.3189F, -2.3173F, 0.066F, 0.2235F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(86, 3).addBox(-1.143F, 0.5088F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 83).addBox(-0.743F, 0.5088F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9518F, 1.786F, -5.3189F, -2.3879F, 0.3783F, -0.0905F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(19, 71).addBox(-1.743F, -0.044F, -0.5946F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.9518F, 1.786F, -5.3189F, -2.2134F, 0.3783F, -0.0905F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(70, 78).addBox(-0.743F, -1.1971F, -1.2181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9518F, 1.786F, -5.3189F, -1.5153F, 0.3783F, -0.0905F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(23, 83).addBox(-0.7797F, -0.1342F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3856F, 2.718F, -3.9222F, 2.5864F, 0.3347F, -0.0904F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(65, 28).addBox(-0.9417F, -1.0119F, 0.0373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3856F, 2.718F, -3.9222F, 1.2031F, 0.1833F, -0.0393F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(60, 75).addBox(-1.0134F, -2.0003F, -1.0168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6356F, 2.543F, -2.9472F, 0.1234F, 0.187F, -0.0436F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(61, 43).addBox(-0.9993F, 1.8204F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7355F, 0.543F, -0.9472F, -0.9199F, 0.0998F, -0.0431F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(76, 87).addBox(-0.9993F, 0.9813F, -0.4647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7355F, 0.543F, -0.9472F, -1.0072F, 0.0998F, -0.0431F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(59, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2653F, 0.9774F, -1.3441F, -1.269F, 0.0998F, -0.0431F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(80, 40).addBox(-0.5F, -0.3F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3089F, 1.2841F, -0.3928F, -1.6151F, 0.03F, -0.0429F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(69, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3191F, 1.3171F, -0.1034F, -2.4441F, 0.03F, -0.0429F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(18, 83).addBox(-0.5F, -0.825F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2604F, -0.2093F, 0.1243F, -2.9677F, 0.03F, -0.0429F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(81, 8).addBox(-0.5F, -1.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(80, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2504F, -0.3683F, -0.0345F, -2.4438F, 0.0511F, -0.0113F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1122F, -2.004F, 0.619F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(30, 82).addBox(-1.0793F, -1.6836F, -0.6507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, -0.5455F, -1.0846F, -0.4176F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(27, 42).addBox(-0.6331F, 0.3618F, -1.7837F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4636F, 1.2686F, -5.906F, -0.738F, 0.3137F, -0.3304F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 40).addBox(1.5836F, -4.1185F, -1.3445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.6597F, 0.3403F, -0.209F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(45, 85).addBox(-0.7176F, -0.2758F, 0.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, 2.4183F, 0.2724F, -0.2389F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 37).addBox(-0.7176F, -0.5767F, -0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, 2.0256F, 0.2724F, -0.2389F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(85, 0).addBox(-0.6331F, -1.4742F, -0.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4636F, 1.2686F, -5.906F, -2.2651F, 0.3137F, -0.3304F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(67, 5).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1978F, 1.0129F, -6.8817F, -2.8475F, 0.1729F, -0.0394F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(66, 4).addBox(-0.9176F, 1.1964F, 0.5527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, -2.8613F, 0.2724F, -0.2389F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(48, 62).addBox(-0.5695F, -1.0129F, -1.4973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.2595F, 1.1541F, -6.3988F, 3.0703F, 0.2507F, -0.1065F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(48, 62).addBox(-0.6331F, -0.884F, -0.9377F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.4636F, 1.2686F, -5.906F, 3.0145F, 0.3137F, -0.3304F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(66, 0).addBox(-0.4331F, 0.3606F, -0.2005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 14).addBox(-0.6331F, -0.3894F, 0.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.4636F, 1.2686F, -5.906F, -1.1307F, 0.3137F, -0.3304F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(9, 51).addBox(-1.8109F, -0.5499F, -0.2392F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, 1.4477F, -0.8194F, 0.1095F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(72, 61).addBox(0.3061F, -2.6558F, 3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.5432F, 0.168F, 0.0684F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(57, 72).addBox(0.3061F, 2.0901F, 2.5727F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -2.5619F, 0.168F, 0.0684F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(50, 72).addBox(0.3061F, 2.9537F, -1.9394F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.3401F, 0.168F, 0.0684F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(72, 27).addBox(-0.2021F, 3.0117F, -1.4903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(72, 14).addBox(-0.2021F, 2.6117F, -1.4903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.4805F, 0.0287F, 0.0675F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(88, 46).addBox(-0.3021F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 88).addBox(-0.0021F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(41, 88).addBox(0.3979F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.0268F, 0.0287F, 0.0675F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(74, 10).addBox(-0.6021F, -0.6588F, -3.4572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 58).addBox(-0.6021F, -1.0588F, -3.4572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 0.0641F, 0.0287F, 0.0675F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(62, 10).addBox(-0.1553F, -1.5435F, -2.1662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.5065F, 0.8405F, -0.5171F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(30, 61).addBox(-0.2545F, -1.2826F, -0.7946F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.315F, 0.7782F, -0.6057F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(75, 41).addBox(-0.269F, -0.5158F, -0.059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.1078F, 0.8515F, -0.5737F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(75, 37).addBox(-0.269F, -0.6049F, -0.362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.8024F, 0.8515F, -0.5737F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(79, 33).addBox(-0.269F, -0.5969F, -1.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.7587F, 0.8515F, -0.5737F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(10, 79).addBox(-0.269F, -0.3519F, -1.0976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.3224F, 0.8515F, -0.5737F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(79, 17).addBox(-0.269F, -0.0836F, -0.9988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 0.8424F, 0.8515F, -0.5737F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(7, 69).addBox(-0.269F, -0.7872F, -2.1087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.9333F, 0.8515F, -0.5737F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(80, 57).addBox(0.8788F, -0.5477F, 2.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(41, 80).addBox(0.8788F, -0.5477F, 2.8483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -2.8318F, 0.1464F, -0.2616F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(64, 51).addBox(1.1264F, -0.5979F, 1.0132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -2.8237F, 0.2462F, -0.285F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(13, 89).addBox(-1.1515F, 0.1736F, 0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.5649F, -0.4554F, -1.6203F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(90, 0).addBox(-1.4593F, -0.5513F, 0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.5613F, -0.979F, -1.6255F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(90, 52).addBox(0.6014F, -1.5999F, 0.0034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.4733F, -0.6884F, 0.4152F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 89).addBox(2.0016F, -3.1948F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.601F, -0.3831F, 1.6287F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(70, 88).addBox(-2.1397F, -3.303F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.8179F, -1.5412F, 0.393F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(74, 30).addBox(-4.1057F, 0.465F, 1.114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.5991F, -0.1402F, -1.4977F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(89, 12).addBox(1.8635F, -2.4877F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.599F, -0.1214F, 1.6366F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5132F, -3.2138F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.619F, -0.95F, 1.6008F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(36, 89).addBox(-2.1695F, -0.64F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.4979F, -0.6296F, -1.6314F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(31, 89).addBox(-2.7505F, -1.1639F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.4771F, -0.8905F, -1.6614F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(23, 89).addBox(-2.8309F, -1.0636F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.4895F, -0.7601F, -1.6445F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(90, 55).addBox(-0.4802F, -2.2999F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F))
				.texOffs(89, 58).addBox(-0.4802F, -1.5999F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.4484F, -1.0677F, 1.6606F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(90, 49).addBox(0.6287F, -0.9872F, -0.1543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.8568F, -0.5799F, 0.1109F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(56, 89).addBox(-0.6915F, -0.9872F, 0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 1.2693F, -1.3221F, 1.8331F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 39).addBox(-0.3952F, 0.3804F, -0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.3894F, -0.2143F, 0.942F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(90, 36).addBox(0.4527F, -0.6966F, -0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.9837F, -0.7634F, -0.179F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 61).addBox(-0.8571F, -0.6966F, 0.6991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 0.517F, -1.3389F, 2.3476F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 83).addBox(0.4706F, 0.1004F, -0.8559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -3.0981F, 0.2767F, -0.1865F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(82, 82).addBox(0.6367F, 0.1004F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -3.0973F, -0.3336F, -0.2129F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(65, 61).addBox(0.7606F, -0.1931F, -0.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -2.823F, -0.0307F, -0.1164F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(82, 67).addBox(0.7606F, -1.7162F, 0.3297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(56, 82).addBox(0.7606F, -1.3162F, 0.3297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 2.1948F, -0.0307F, -0.1164F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(84, 11).addBox(0.7606F, 0.3082F, -0.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -2.5612F, -0.0307F, -0.1164F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(85, 49).addBox(1.6935F, 1.7923F, -1.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(5, 82).addBox(1.6935F, 1.7923F, -1.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.2722F, 0.4008F, 0.1689F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(13, 86).addBox(-1.1665F, 0.1066F, -2.9508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1317F, 1.7744F, -4.5853F, -0.6865F, 0.2353F, -0.2017F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(18, 86).addBox(0.703F, 2.8805F, -1.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -1.3247F, 0.1393F, 0.1328F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(86, 6).addBox(0.703F, 2.1264F, -3.214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, -0.7138F, 0.1393F, 0.1328F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 60).addBox(0.0F, -0.8536F, -0.1618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8664F, 1.7848F, -7.5844F, 0.1484F, -0.0524F, 0.0F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(55, 85).addBox(-0.85F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3949F, 0.9238F, -7.7933F, 1.5962F, 0.7897F, 1.6899F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 55).addBox(-0.85F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0008F, 1.7998F, -7.5541F, 0.2324F, 0.2073F, 0.4019F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(85, 63).addBox(-1.0F, -0.9917F, -0.9933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1047F, -0.6806F, -4.1282F, 1.6951F, 0.0965F, -0.9937F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(66, 85).addBox(-0.4937F, -0.1758F, -0.5175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4193F, 0.2413F, -5.5195F, 1.5904F, 0.2429F, -1.0151F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(71, 85).addBox(-0.495F, -0.8242F, -0.5164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4193F, 0.2413F, -5.5195F, 1.4849F, 0.2776F, -1.0182F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(85, 78).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(82, 85).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2738F, 0.0923F, -5.4373F, 1.778F, 0.2612F, -0.9375F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(36, 86).addBox(-0.55F, -0.7133F, -0.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.315F, 0.4263F, -6.5152F, -1.448F, 0.3075F, -0.9806F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(60, 86).addBox(-0.45F, -0.3834F, -0.6786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.315F, 0.4263F, -6.5152F, -0.4444F, 0.3075F, -0.9806F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(87, 17).addBox(-0.75F, -0.95F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.6445F, 0.45F, -6.5641F, 0.0766F, 0.3812F, -0.808F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 86).addBox(-1.025F, 0.0027F, -1.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4109F, -0.6987F, -4.0958F, 1.6862F, -0.412F, -1.0332F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(65, 71).addBox(-1.025F, -1.0973F, -1.015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1468F, -0.5545F, -3.1587F, 1.948F, -0.412F, -1.0332F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(60, 38).addBox(-0.8F, -1.2973F, -1.815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1468F, -0.5545F, -3.1587F, 1.4143F, -0.5307F, 0.0491F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(50, 85).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0616F, 0.1149F, -6.9646F, -0.836F, 0.1669F, 0.0373F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(87, 20).addBox(-0.4737F, -0.2724F, -0.491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2807F, 0.6458F, -7.089F, 1.5207F, 0.6334F, -1.221F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(67, 32).addBox(-0.7F, -2.0F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5988F, -1.5995F, -0.7498F, 1.4493F, 0.3429F, -2.5407F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(67, 32).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4629F, -1.1221F, -2.7118F, 1.1466F, 0.5437F, -2.6355F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(67, 32).addBox(-0.9F, -2.425F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4629F, -1.1221F, -2.7118F, 0.9458F, 0.9247F, -2.9286F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 23).addBox(-0.491F, -0.7289F, -0.5097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2807F, 0.6458F, -7.089F, 1.4436F, 0.7838F, -1.3306F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 52).addBox(-0.85F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0019F, 1.5968F, -7.8392F, 1.045F, 0.3428F, 0.5117F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(83, 46).addBox(0.0F, -0.1536F, -0.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.8565F, 0.813F, -7.773F, 0.9774F, -0.0524F, 0.0F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(81, 29).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 29).addBox(-0.7F, -0.3F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.779F, -0.9915F, -2.5648F, 0.5857F, -0.2428F, -0.1248F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(87, 73).addBox(1.3134F, -1.7083F, -3.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 66).addBox(1.1884F, -1.7083F, -3.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0683F, 0.3744F, -0.1853F, 0.2949F, 0.1678F, 0.1662F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1122F, -2.004F, 0.619F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(0.0793F, -1.6836F, -0.6507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, -0.5455F, 1.0846F, 0.4176F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(27, 42).mirror().addBox(-0.3669F, 0.3618F, -1.7837F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4636F, 1.2686F, -5.906F, -0.738F, -0.3137F, 0.3304F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(-2.5836F, -4.1185F, -1.3445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.6597F, -0.3403F, 0.209F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(45, 85).mirror().addBox(-0.2824F, -0.2758F, 0.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, 2.4183F, -0.2724F, 0.2389F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-0.2824F, -0.5767F, -0.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, 2.0256F, -0.2724F, 0.2389F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.3669F, -1.4742F, -0.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4636F, 1.2686F, -5.906F, -2.2651F, -0.3137F, 0.3304F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(67, 5).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1978F, 1.0129F, -6.8817F, -2.8475F, -0.1729F, 0.0394F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.0824F, 1.1964F, 0.5527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, -2.8613F, -0.2724F, 0.2389F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(48, 62).mirror().addBox(-0.4305F, -1.0129F, -1.4973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.2595F, 1.1541F, -6.3988F, 3.0703F, -0.2507F, 0.1065F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(48, 62).mirror().addBox(-0.3669F, -0.884F, -0.9377F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.4636F, 1.2686F, -5.906F, 3.0145F, -0.3137F, 0.3304F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5669F, 0.3606F, -0.2005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 14).mirror().addBox(-0.3669F, -0.3894F, 0.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.4636F, 1.2686F, -5.906F, -1.1307F, -0.3137F, 0.3304F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-0.1891F, -0.5499F, -0.2392F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, 1.4477F, 0.8194F, -0.1095F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-2.3061F, -2.6558F, 3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.5432F, -0.168F, -0.0684F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-2.3061F, 2.0901F, 2.5727F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -2.5619F, -0.168F, -0.0684F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-2.3061F, 2.9537F, -1.9394F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.3401F, -0.168F, -0.0684F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-1.7979F, 3.0117F, -1.4903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 14).mirror().addBox(-1.7979F, 2.6117F, -1.4903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.4805F, -0.0287F, -0.0675F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-0.6979F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 88).mirror().addBox(-0.9979F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(41, 88).mirror().addBox(-1.3979F, 1.7953F, -2.6462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.0268F, -0.0287F, -0.0675F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(-1.3979F, -0.6588F, -3.4572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(73, 58).mirror().addBox(-1.3979F, -1.0588F, -3.4572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 0.0641F, -0.0287F, -0.0675F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-0.8447F, -1.5435F, -2.1662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.5065F, -0.8405F, 0.5171F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-0.7455F, -1.2826F, -0.7946F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.315F, -0.7782F, 0.6057F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-0.731F, -0.5158F, -0.059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.1078F, -0.8515F, 0.5737F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-0.731F, -0.6049F, -0.362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.8024F, -0.8515F, 0.5737F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.731F, -0.5969F, -1.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.7587F, -0.8515F, 0.5737F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-0.731F, -0.3519F, -1.0976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.3224F, -0.8515F, 0.5737F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(79, 17).mirror().addBox(-0.731F, -0.0836F, -0.9988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 0.8424F, -0.8515F, 0.5737F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.731F, -0.7872F, -2.1087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.9333F, -0.8515F, 0.5737F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 57).mirror().addBox(-1.8788F, -0.5477F, 2.9983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(41, 80).mirror().addBox(-1.8788F, -0.5477F, 2.8483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -2.8318F, -0.1464F, 0.2616F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-2.1264F, -0.5979F, 1.0132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -2.8237F, -0.2462F, 0.285F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(13, 89).mirror().addBox(0.1515F, 0.1736F, 0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.5649F, 0.4554F, 1.6203F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(0.4593F, -0.5513F, 0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.5613F, 0.979F, 1.6255F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-1.6014F, -1.5999F, 0.0034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.4733F, 0.6884F, -0.4152F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-3.0016F, -3.1948F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.601F, 0.3831F, -1.6287F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(1.1397F, -3.303F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.8179F, 1.5412F, -0.393F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(2.1057F, 0.465F, 1.114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.5991F, 0.1402F, 1.4977F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-2.8635F, -2.4877F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.599F, 0.1214F, -1.6366F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.4868F, -3.2138F, 1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.619F, 0.95F, -1.6008F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(1.1695F, -0.64F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.4979F, 0.6296F, 1.6314F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(31, 89).mirror().addBox(1.7505F, -1.1639F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.4771F, 0.8905F, 1.6614F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(23, 89).mirror().addBox(1.8309F, -1.0636F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.4895F, 0.7601F, 1.6445F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-0.5198F, -2.2999F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false)
				.texOffs(89, 58).mirror().addBox(-0.5198F, -1.5999F, 0.8048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.4484F, 1.0677F, -1.6606F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-1.6287F, -0.9872F, -0.1543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.8568F, 0.5799F, -0.1109F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(-0.3085F, -0.9872F, 0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 1.2693F, 1.3221F, -1.8331F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-0.6048F, 0.3804F, -0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.3894F, 0.2143F, -0.942F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(90, 36).mirror().addBox(-1.4527F, -0.6966F, -0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.9837F, 0.7634F, 0.179F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(90, 61).mirror().addBox(-0.1429F, -0.6966F, 0.6991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 0.517F, 1.3389F, -2.3476F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-1.4706F, 0.1004F, -0.8559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -3.0981F, -0.2767F, 0.1865F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-1.6367F, 0.1004F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -3.0973F, 0.3336F, 0.2129F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(65, 61).mirror().addBox(-1.7606F, -0.1931F, -0.1326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -2.823F, 0.0307F, 0.1164F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-1.7606F, -1.7162F, 0.3297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(56, 82).mirror().addBox(-1.7606F, -1.3162F, 0.3297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 2.1948F, 0.0307F, 0.1164F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-1.7606F, 0.3082F, -0.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -2.5612F, 0.0307F, 0.1164F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-2.6935F, 1.7923F, -1.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(5, 82).mirror().addBox(-2.6935F, 1.7923F, -1.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.2722F, -0.4008F, -0.1689F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(0.1665F, 0.1066F, -2.9508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1317F, 1.7744F, -4.5853F, -0.6865F, -0.2353F, 0.2017F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(18, 86).mirror().addBox(-1.703F, 2.8805F, -1.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -1.3247F, -0.1393F, -0.1328F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-1.703F, 2.1264F, -3.214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, -0.7138F, -0.1393F, -0.1328F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-1.0F, -0.8536F, -0.1618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8664F, 1.7848F, -7.5844F, 0.1484F, 0.0524F, 0.0F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-0.15F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3949F, 0.9238F, -7.7933F, 1.5962F, -0.7897F, -1.6899F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0008F, 1.7998F, -7.5541F, 0.2324F, -0.2073F, -0.4019F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(85, 63).mirror().addBox(0.0F, -0.9917F, -0.9933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1047F, -0.6806F, -4.1282F, 1.6951F, -0.0965F, 0.9937F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-0.5063F, -0.1758F, -0.5175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4193F, 0.2413F, -5.5195F, 1.5904F, -0.2429F, 1.0151F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.505F, -0.8242F, -0.5164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4193F, 0.2413F, -5.5195F, 1.4849F, -0.2776F, 1.0182F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(82, 85).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2738F, 0.0923F, -5.4373F, 1.778F, -0.2612F, 0.9375F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(-0.45F, -0.7133F, -0.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.315F, 0.4263F, -6.5152F, -1.448F, -0.3075F, 0.9806F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-0.55F, -0.3834F, -0.6786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.315F, 0.4263F, -6.5152F, -0.4444F, -0.3075F, 0.9806F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.25F, -0.95F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.6445F, 0.45F, -6.5641F, 0.0766F, -0.3812F, 0.808F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(0.025F, 0.0027F, -1.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4109F, -0.6987F, -4.0958F, 1.6862F, 0.412F, 1.0332F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(0.025F, -1.0973F, -1.015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1468F, -0.5545F, -3.1587F, 1.948F, 0.412F, 1.0332F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-0.2F, -1.2973F, -1.815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1468F, -0.5545F, -3.1587F, 1.4143F, 0.5307F, -0.0491F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0616F, 0.1149F, -6.9646F, -0.836F, -0.1669F, -0.0373F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(87, 20).mirror().addBox(-0.5263F, -0.2724F, -0.491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2807F, 0.6458F, -7.089F, 1.5207F, -0.6334F, 1.221F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-0.3F, -2.0F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5988F, -1.5995F, -0.7498F, 1.4493F, -0.3429F, 2.5407F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4629F, -1.1221F, -2.7118F, 1.1466F, -0.5437F, 2.6355F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-0.1F, -2.425F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4629F, -1.1221F, -2.7118F, 0.9458F, -0.9247F, 2.9286F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-0.509F, -0.7289F, -0.5097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2807F, 0.6458F, -7.089F, 1.4436F, -0.7838F, 1.3306F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0019F, 1.5968F, -7.8392F, 1.045F, -0.3428F, -0.5117F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-1.0F, -0.1536F, -0.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.8565F, 0.813F, -7.773F, 0.9774F, 0.0524F, 0.0F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 29).mirror().addBox(-0.3F, -0.3F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.779F, -0.9915F, -2.5648F, 0.5857F, 0.2428F, 0.1248F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-2.3134F, -1.7083F, -3.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(87, 66).mirror().addBox(-2.1884F, -1.7083F, -3.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0683F, 0.3744F, -0.1853F, 0.2949F, -0.1678F, -0.1662F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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