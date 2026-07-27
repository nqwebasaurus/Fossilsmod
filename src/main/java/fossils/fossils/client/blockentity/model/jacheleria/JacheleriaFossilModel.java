package fossils.fossils.client.blockentity.model.jacheleria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JacheleriaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public JacheleriaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
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
		this.bone4 = this.chest.getChild("bone4");
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

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 45).addBox(-2.5F, -1.4337F, 2.9478F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 89).addBox(-2.5F, -1.5522F, 1.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 89).addBox(0.0F, -1.9423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4465F, 1.0888F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 88).addBox(0.0F, -1.8009F, 0.0446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4376F, -0.9906F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(0.5F, 0.4506F, 1.0286F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 47).addBox(2.5F, 0.4506F, 1.0286F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 1.9519F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 5).mirror().addBox(0.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 5).addBox(2.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 3.5519F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 22).addBox(-3.0F, -0.0145F, 0.007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 75).addBox(-0.5067F, -1.7241F, 1.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -0.8601F, -0.1315F, 0.1568F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 74).addBox(-0.5067F, -2.7389F, -0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -1.6891F, -0.1315F, 0.1568F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 49).addBox(-0.5067F, -1.2393F, -2.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -2.5182F, -0.1315F, 0.1568F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5067F, -2.3629F, -1.614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, -1.9946F, -0.1315F, 0.1568F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(75, 56).addBox(-0.5067F, -0.5349F, -0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, 2.9796F, -0.1315F, 0.1568F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5067F, -0.2912F, -1.1707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4619F, -2.8621F, -3.8539F, 0.798F, -0.1315F, 0.1568F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 50).addBox(-0.0171F, -1.9435F, -1.1999F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.2971F, -0.3045F, 0.2053F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 72).addBox(-0.0171F, -1.694F, -2.3364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 0.7298F, -0.3045F, 0.2053F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(80, 56).addBox(-0.0171F, -2.8274F, -0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.4716F, -0.3045F, 0.2053F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 82).addBox(-0.0171F, -1.701F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 2.257F, -0.3045F, 0.2053F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 54).addBox(-0.0171F, -1.8333F, -0.4465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9619F, -2.8621F, -3.8539F, 1.6898F, -0.3045F, 0.2053F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 49).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.994F, -0.9552F, -0.7038F, 1.3317F, -0.0255F, 0.111F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 75).addBox(-0.5F, -1.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8353F, 0.4016F, -0.4129F, 2.5534F, -0.0255F, 0.111F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 63).addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8529F, -0.2062F, 1.5371F, -2.4644F, -0.0255F, 0.111F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6417F, 2.2155F, -0.7495F, -1.8274F, -0.0255F, 0.111F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(39, 54).addBox(-0.5F, -0.775F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5661F, 2.5469F, 0.7573F, -1.2165F, -0.0255F, 0.111F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(63, 60).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5661F, 2.5469F, 0.7573F, -1.7401F, -0.0255F, 0.111F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 50).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6245F, 1.6149F, 2.5259F, -1.0856F, -0.0255F, 0.111F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 54).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8054F, 1.2074F, -2.7437F, 2.4661F, -0.0255F, 0.111F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 75).addBox(-0.5F, -1.0F, 0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9293F, -0.1822F, -1.5371F, -2.8571F, -0.0255F, 0.111F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 27).addBox(-0.475F, -0.45F, -0.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, -1.8692F, -2.5091F, -1.1539F, -0.0203F, 0.0944F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 82).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0435F, -1.3137F, -3.2763F, -2.4208F, -0.0255F, 0.111F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -2.8055F, -1.7663F, -0.0255F, 0.111F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.4933F, -1.7241F, 1.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -0.8601F, 0.1315F, -0.1568F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.4933F, -2.7389F, -0.8288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -1.6891F, 0.1315F, -0.1568F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(80, 49).mirror().addBox(-0.4933F, -1.2393F, -2.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -2.5182F, 0.1315F, -0.1568F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-0.4933F, -2.3629F, -1.614F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, -1.9946F, 0.1315F, -0.1568F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.4933F, -0.5349F, -0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, 2.9796F, 0.1315F, -0.1568F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.4933F, -0.2912F, -1.1707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8621F, -3.8539F, 0.798F, 0.1315F, -0.1568F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 50).mirror().addBox(-0.9829F, -1.9435F, -1.1999F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.2971F, 0.3045F, -0.2053F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.9829F, -1.694F, -2.3364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 0.7298F, 0.3045F, -0.2053F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-0.9829F, -2.8274F, -0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.4716F, 0.3045F, -0.2053F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(67, 82).mirror().addBox(-0.9829F, -1.701F, 1.2976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 2.257F, 0.3045F, -0.2053F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(-0.9829F, -1.8333F, -0.4465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9619F, -2.8621F, -3.8539F, 1.6898F, 0.3045F, -0.2053F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(75, 49).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.994F, -0.9552F, -0.7038F, 1.3317F, 0.0255F, -0.111F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.5F, -1.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8353F, 0.4016F, -0.4129F, 2.5534F, 0.0255F, -0.111F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 20).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8529F, -0.2062F, 1.5371F, -2.4644F, 0.0255F, -0.111F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6417F, 2.2155F, -0.7495F, -1.8274F, 0.0255F, -0.111F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-0.5F, -0.775F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5661F, 2.5469F, 0.7573F, -1.2165F, 0.0255F, -0.111F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5661F, 2.5469F, 0.7573F, -1.7401F, 0.0255F, -0.111F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 50).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6245F, 1.6149F, 2.5259F, -1.0856F, 0.0255F, -0.111F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(32, 54).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8054F, 1.2074F, -2.7437F, 2.4661F, 0.0255F, -0.111F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.5F, -1.0F, 0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, -0.1822F, -1.5371F, -2.8571F, 0.0255F, -0.111F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.525F, -0.45F, -0.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, -1.8692F, -2.5091F, -1.1539F, 0.0203F, -0.0944F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 82).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0435F, -1.3137F, -3.2763F, -2.4208F, 0.0255F, -0.111F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -2.8055F, -1.7663F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9338F, 3.5043F, 2.1903F, -0.5055F, 0.0404F, -0.9233F));

		PartDefinition cube_r54 = upperleg1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 33).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0982F, 4.1944F, 1.6016F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r55 = upperleg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(48, 4).addBox(-1.5F, -1.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 5.5042F, 3.4396F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = upperleg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(37, 13).addBox(-1.5F, -0.8F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.4982F, 7.6709F, 1.6215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r57 = upperleg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(31, 40).addBox(-1.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 6.3197F, 0.1469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r58 = upperleg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 4.3501F, -0.2004F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r59 = upperleg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r60 = upperleg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 28).addBox(-1.5F, -2.0F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r61 = upperleg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0982F, 3.8887F, 0.6977F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r62 = upperleg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 59).addBox(-0.5F, -3.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0982F, 2.7889F, -0.8025F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r63 = upperleg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(21, 70).addBox(-1.5F, -1.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r64 = upperleg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(46, 24).addBox(-1.5F, -0.2F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r65 = upperleg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(39, 5).addBox(-1.5F, -1.15F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 1.0276F, 1.1858F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r66 = upperleg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(39, 0).addBox(-1.5F, -0.325F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 1.0276F, 1.1858F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, 7.807F, 1.2578F, 1.294F, -0.4178F, 0.4542F));

		PartDefinition cube_r67 = leg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 15).addBox(-0.3165F, -4.7286F, 0.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 4.6722F, 0.2489F, -0.0073F, 1.3147F, 0.1794F));

		PartDefinition cube_r68 = leg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 68).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6173F, 2.0145F, -0.2125F, 0.3418F, 1.3147F, 0.2666F));

		PartDefinition cube_r69 = leg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 78).addBox(-0.5F, -2.15F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9074F, 6.1825F, 0.0143F, -0.2691F, 1.3147F, 0.2666F));

		PartDefinition cube_r70 = leg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(75, 60).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1284F, 3.653F, -0.216F, 0.1673F, 1.3147F, 0.2666F));

		PartDefinition cube_r71 = leg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6173F, 2.0145F, -0.2125F, 0.0364F, 1.3147F, 0.2666F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1327F, 4.8498F, -0.174F, -0.3905F, 0.1792F, 0.3833F));

		PartDefinition cube_r72 = feet1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 33).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition cube_r73 = feet1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 17).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9338F, 3.5043F, 2.1903F, -0.3263F, 0.1812F, 0.9081F));

		PartDefinition cube_r74 = upperleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 15).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0982F, 4.1944F, 1.6016F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r75 = upperleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5F, -1.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 5.5042F, 3.4396F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = upperleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(37, 18).addBox(-0.5F, -0.8F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.4982F, 7.6709F, 1.6215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r77 = upperleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(46, 10).addBox(-0.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 6.3197F, 0.1469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r78 = upperleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 4.3501F, -0.2004F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r79 = upperleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(79, 28).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r80 = upperleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(9, 46).addBox(-0.5F, -2.0F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r81 = upperleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(65, 73).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0982F, 3.8887F, 0.6977F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r82 = upperleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(20, 73).addBox(-0.5F, -3.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0982F, 2.7889F, -0.8025F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r83 = upperleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 44).addBox(-0.5F, -1.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r84 = upperleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -0.2F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r85 = upperleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -1.15F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 1.0276F, 1.1858F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r86 = upperleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, -0.325F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 1.0276F, 1.1858F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, 7.807F, 1.2578F, 1.6237F, 0.5434F, -0.4959F));

		PartDefinition cube_r87 = leg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 27).addBox(-0.6835F, -4.7286F, 0.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 4.6722F, 0.2489F, -0.0073F, -1.3147F, -0.1794F));

		PartDefinition cube_r88 = leg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 3).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6173F, 2.0145F, -0.2125F, 0.3418F, -1.3147F, -0.2666F));

		PartDefinition cube_r89 = leg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(86, 34).addBox(-0.5F, -2.15F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9074F, 6.1825F, 0.0143F, -0.2691F, -1.3147F, -0.2666F));

		PartDefinition cube_r90 = leg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(25, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1284F, 3.653F, -0.216F, 0.1673F, -1.3147F, -0.2666F));

		PartDefinition cube_r91 = leg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(60, 72).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6173F, 2.0145F, -0.2125F, 0.0364F, -1.3147F, -0.2666F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1327F, 4.8498F, -0.174F, -0.6744F, -0.06F, -0.1992F));

		PartDefinition cube_r92 = feet2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(11, 37).addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition cube_r93 = feet2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(13, 22).addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.0413F, -0.5234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9744F, 5.6003F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 41).addBox(0.0F, -1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3534F, -0.8371F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(7, 55).addBox(-15.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.9587F, 0.4766F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7957F, 0.4882F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(27, 41).addBox(0.0F, -2.0419F, 0.0206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -1.9557F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, -1.9689F, 0.0191F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -3.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(89, 37).addBox(0.0F, -2.0954F, 0.0063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -5.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.3F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-6.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.0817F, 0.2147F, -1.5022F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.1652F, 0.1601F, -1.0614F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 76).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.2247F, 0.0473F, -0.5021F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.1683F, 0.1978F, -1.1292F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.2473F, 0.0776F, -0.569F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.146F, 0.2067F, -1.2357F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.2336F, 0.0967F, -0.6723F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(77, 22).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.2336F, -0.0967F, 0.6723F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(79, 32).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.146F, -0.2067F, 1.2357F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 76).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.2473F, -0.0776F, 0.569F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 48).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.1683F, -0.1978F, 1.1292F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 76).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.2247F, -0.0473F, 0.5021F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(48, 8).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.1652F, -0.1601F, 1.0614F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(74, 71).addBox(4.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.0817F, -0.2147F, 1.5022F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9617F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(8, 83).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1688F, -5.9579F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(73, 78).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0399F, -3.9593F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.0866F, 0.2405F, -1.4139F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1808F, 0.1814F, -0.9715F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.249F, 0.0571F, -0.4136F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.219F, 0.039F, -0.4153F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(49, 28).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.1648F, 0.1501F, -0.9744F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(11, 51).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.0857F, 0.2055F, -1.4143F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.2351F, 0.046F, -0.4321F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(49, 30).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.1747F, 0.1646F, -0.9903F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.0885F, 0.2228F, -1.4312F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 47).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.0885F, -0.2228F, 1.4312F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(49, 30).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.1747F, -0.1646F, 0.9903F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(40, 77).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.2351F, -0.046F, 0.4321F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(11, 51).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.0857F, -0.2055F, 1.4143F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 28).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.1648F, -0.1501F, 0.9744F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(77, 26).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.219F, -0.039F, 0.4153F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 24).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.249F, -0.0571F, 0.4136F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(47, 48).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1808F, -0.1814F, 0.9715F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 51).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.0866F, -0.2405F, 1.4139F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2097F, -1.962F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.8189F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 11).addBox(0.0F, -2.3693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5433F, -1.0467F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(63, 85).addBox(0.0F, -2.3693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0952F, -2.9677F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(40, 43).addBox(-0.5F, 0.0019F, 4.1302F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.1F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1468F, 0.1303F, -1.0117F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.0779F, 0.18F, -1.4506F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1934F, 0.0317F, -0.451F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 64).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.2632F, 0.068F, -0.4825F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.1871F, 0.198F, -1.0401F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.0851F, 0.2582F, -1.484F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(66, 8).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.0851F, -0.2582F, 1.484F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 34).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.1871F, -0.198F, 1.0401F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(77, 64).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.2632F, -0.068F, 0.4825F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(56, 77).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1934F, -0.0317F, 0.451F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 53).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.0779F, -0.18F, 1.4506F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(49, 32).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1468F, -0.1303F, 1.0117F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6287F, 5.7053F, -4.5249F, 0.4429F, -0.1355F, -0.7022F));

		PartDefinition cube_r151 = upperarm1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, -0.5205F, -0.2163F, -0.0289F));

		PartDefinition cube_r152 = upperarm1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 34).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8273F, 1.7428F, -1.0126F, 1.1473F, -0.8076F, -0.8628F));

		PartDefinition cube_r153 = upperarm1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(22, 28).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6447F, 1.1026F, -0.2664F, 0.6878F, 0.1212F, 0.2493F));

		PartDefinition cube_r154 = upperarm1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 55).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, 0.7013F, -0.2163F, -0.0289F));

		PartDefinition cube_r155 = upperarm1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(40, 83).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8493F, 2.2941F, -1.0402F, 0.0027F, -0.4483F, 1.0612F));

		PartDefinition cube_r156 = upperarm1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 53).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, 0.3958F, -0.2163F, -0.0289F));

		PartDefinition cube_r157 = upperarm1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 58).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, -0.215F, -0.2163F, -0.0289F));

		PartDefinition cube_r158 = upperarm1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.2098F, 6.2369F, 0.0584F, 0.134F, -0.2163F, -0.0289F));

		PartDefinition cube_r159 = upperarm1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1002F, 5.9921F, 0.5903F, 1.1376F, -0.2163F, -0.0289F));

		PartDefinition cube_r160 = upperarm1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(53, 55).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0775F, 7.5907F, -1.426F, 0.3522F, -0.2163F, -0.0289F));

		PartDefinition cube_r161 = upperarm1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(7, 67).addBox(0.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3797F, 6.9424F, 0.5691F, -0.1714F, -0.2163F, -0.0289F));

		PartDefinition cube_r162 = upperarm1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 22).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 4.9934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0024F, 7.7369F, 0.2664F, -1.0739F, 0.3154F, 0.4471F));

		PartDefinition cube_r163 = lowerarm1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(26, 64).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(35, 83).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4955F, -0.2335F, -0.2897F, -0.3136F, 1.2533F, -0.3373F));

		PartDefinition cube_r164 = lowerarm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 83).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 74).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0329F, 0.4103F, -0.022F, -1.4437F, 1.2578F, -0.246F));

		PartDefinition cube_r165 = lowerarm1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.814F, 0.5868F, 0.2093F, 0.607F, 1.2578F, -0.246F));

		PartDefinition cube_r166 = lowerarm1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(11, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7381F, -0.4089F, 0.264F, -0.1784F, 1.2578F, -0.246F));

		PartDefinition cube_r167 = lowerarm1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(21, 64).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3965F, 1.2578F, -0.246F));

		PartDefinition cube_r168 = lowerarm1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0761F, 4.1855F, -0.6257F, -0.2874F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7865F, 2.9843F, -1.1939F, 1.6592F, -0.0266F, 0.1809F));

		PartDefinition cube_r169 = hand1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 0).addBox(7.4F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-8.8793F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r170 = hand1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(11, 33).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r171 = hand1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 59).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition cube_r172 = hand1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(30, 13).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6287F, 5.7053F, -4.5249F, 0.5738F, 0.1355F, 0.7022F));

		PartDefinition cube_r173 = upperarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(31, 28).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, -0.5205F, 0.2163F, 0.0289F));

		PartDefinition cube_r174 = upperarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(49, 60).addBox(0.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8273F, 1.7428F, -1.0126F, 1.1473F, 0.8076F, 0.8628F));

		PartDefinition cube_r175 = upperarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, -1.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6447F, 1.1026F, -0.2664F, 0.6878F, -0.1212F, -0.2493F));

		PartDefinition cube_r176 = upperarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, 0.7013F, 0.2163F, 0.0289F));

		PartDefinition cube_r177 = upperarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(34, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8493F, 2.2941F, -1.0402F, 0.0027F, 0.4483F, -1.0612F));

		PartDefinition cube_r178 = upperarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(18, 53).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, 0.3958F, 0.2163F, 0.0289F));

		PartDefinition cube_r179 = upperarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(60, 15).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, -0.215F, 0.2163F, 0.0289F));

		PartDefinition cube_r180 = upperarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2098F, 6.2369F, 0.0584F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition cube_r181 = upperarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(42, 59).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1002F, 5.9921F, 0.5903F, 1.1376F, 0.2163F, 0.0289F));

		PartDefinition cube_r182 = upperarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(35, 59).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0775F, 7.5907F, -1.426F, 0.3522F, 0.2163F, 0.0289F));

		PartDefinition cube_r183 = upperarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(68, 49).addBox(-1.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3797F, 6.9424F, 0.5691F, -0.1714F, 0.2163F, 0.0289F));

		PartDefinition cube_r184 = upperarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1203F, 4.9934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0024F, 7.7369F, 0.2664F, -0.5939F, -0.3154F, -0.4471F));

		PartDefinition cube_r185 = lowerarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(57, 65).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(86, 31).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4955F, -0.2335F, -0.2897F, -0.3136F, -1.2533F, 0.3373F));

		PartDefinition cube_r186 = lowerarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(29, 86).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 67).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0329F, 0.4103F, -0.022F, -1.4437F, -1.2578F, 0.246F));

		PartDefinition cube_r187 = lowerarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(24, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.814F, 0.5868F, 0.2093F, 0.607F, -1.2578F, 0.246F));

		PartDefinition cube_r188 = lowerarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(86, 17).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7381F, -0.4089F, 0.264F, -0.1784F, -1.2578F, 0.246F));

		PartDefinition cube_r189 = lowerarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3965F, -1.2578F, 0.246F));

		PartDefinition cube_r190 = lowerarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(69, 18).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0761F, 4.1855F, -0.6257F, -0.2874F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7865F, 2.9843F, -1.1939F, 0.7865F, 0.0266F, -0.1809F));

		PartDefinition cube_r191 = hand2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0538F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r192 = hand2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r193 = hand2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(81, 19).addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition cube_r194 = hand2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(69, 10).addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.3F, 16.9835F, -3.7304F));

		PartDefinition cube_r195 = bone2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(14, 67).addBox(-1.6F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9057F, -10.8112F, -1.3401F, 1.204F, -0.3203F, -0.6971F));

		PartDefinition cube_r196 = bone2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 78).addBox(0.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5544F, -10.0391F, -1.188F, 1.1733F, 0.4965F, -1.0148F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 71).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5544F, -10.0391F, -1.188F, 1.2163F, -0.1978F, -0.7448F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(50, 71).addBox(-1.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2037F, -10.6844F, -3.5104F, 1.0956F, -0.0216F, -0.1155F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(77, 77).addBox(-0.2F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.349F, -12.7086F, -3.3446F, -1.5551F, -1.1086F, 1.8434F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(35, 79).addBox(-0.4408F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7787F, -11.2844F, -3.3104F, -1.5261F, -1.4139F, 1.8132F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(77, 73).addBox(-0.3149F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7787F, -10.6844F, -3.3104F, 1.492F, -1.3739F, -0.858F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 71).addBox(-0.5F, 0.2F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0992F, -17.6187F, -2.0226F, 0.4567F, 0.0122F, -0.3769F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(55, 83).addBox(-0.5F, 0.05F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(50, 83).addBox(-0.5F, 0.6F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8985F, -17.2122F, 1.0073F, -1.9431F, 0.0122F, -0.3769F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(58, 40).addBox(-0.5F, -1.2F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.7657F, 0.0122F, -0.3769F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(31, 34).addBox(-0.5F, -1.125F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.1549F, 0.0122F, -0.3769F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 87).addBox(-0.45F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1053F, -14.9474F, -1.9244F, -3.1178F, 0.0476F, -0.34F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(39, 86).addBox(-0.6709F, 0.0877F, -0.5934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5056F, -12.3266F, -2.7568F, 0.7309F, 0.1166F, -0.1848F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6428F, -12.2173F, -2.6105F, 2.5635F, 0.1166F, -0.1848F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(10, 71).addBox(-0.5F, -1.9F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5963F, -12.8822F, -1.1767F, 2.0399F, 0.1166F, -0.1848F));

		PartDefinition cube_r210 = bone2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(28, 16).addBox(-0.5F, -0.875F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.7899F, -13.8818F, -1.2331F, 1.6909F, 0.1166F, -0.1848F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.3F, 16.9835F, -3.7304F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.4F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9057F, -10.8112F, -1.3401F, 1.204F, 0.3203F, 0.6971F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -10.0391F, -1.188F, 1.1733F, -0.4965F, 1.0148F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -10.0391F, -1.188F, 1.2163F, 0.1978F, 0.7448F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(50, 71).mirror().addBox(0.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2037F, -10.6844F, -3.5104F, 1.0956F, 0.0216F, 0.1155F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.8F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.349F, -12.7086F, -3.3446F, -1.5551F, 1.1086F, -1.8434F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.5592F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7787F, -11.2844F, -3.3104F, -1.5261F, 1.4139F, -1.8132F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.6851F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7787F, -10.6844F, -3.3104F, 1.492F, 1.3739F, 0.858F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(-0.5F, 0.2F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0992F, -17.6187F, -2.0226F, 0.4567F, -0.0122F, 0.3769F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-0.5F, 0.05F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(50, 83).mirror().addBox(-0.5F, 0.6F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8985F, -17.2122F, 1.0073F, -1.9431F, -0.0122F, 0.3769F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(58, 40).mirror().addBox(-0.5F, -1.2F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.7657F, -0.0122F, 0.3769F));

		PartDefinition cube_r221 = bone4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(31, 34).mirror().addBox(-0.5F, -1.125F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.1549F, -0.0122F, 0.3769F));

		PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.55F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1053F, -14.9474F, -1.9244F, -3.1178F, -0.0476F, 0.34F));

		PartDefinition cube_r223 = bone4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(39, 86).mirror().addBox(-0.3291F, 0.0877F, -0.5934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -12.3266F, -2.7568F, 0.7309F, -0.1166F, 0.1848F));

		PartDefinition cube_r224 = bone4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6428F, -12.2173F, -2.6105F, 2.5635F, -0.1166F, 0.1848F));

		PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(-0.5F, -1.9F, -1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5963F, -12.8822F, -1.1767F, 2.0399F, -0.1166F, 0.1848F));

		PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-0.5F, -0.875F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.7899F, -13.8818F, -1.2331F, 1.6909F, -0.1166F, 0.1848F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2073F, -3.0162F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r227 = chest2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.1646F, 0.0116F, -0.5213F));

		PartDefinition cube_r228 = chest2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(49, 36).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.133F, 0.098F, -1.083F));

		PartDefinition cube_r229 = chest2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(78, 2).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -3.5F, 0.3251F, 0.1008F, -0.5644F));

		PartDefinition cube_r230 = chest2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, -3.5F, 0.2231F, 0.2585F, -1.1191F));

		PartDefinition cube_r231 = chest2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.5F, 0.0791F, 0.1449F, -1.5201F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(78, 6).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.0791F, -0.1449F, 1.5201F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, 0.0019F, 0.1302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7073F, -4.0838F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(72, 83).addBox(0.0F, -2.4906F, -0.1385F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7869F, -3.8754F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(16, 83).addBox(0.0F, -2.3693F, -0.1104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3869F, -1.8754F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(49, 38).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.5F, 0.2231F, -0.2585F, 1.1191F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 2).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.5F, 0.3251F, -0.1008F, 0.5644F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(49, 36).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.133F, -0.098F, 1.083F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 0).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.5F, 0.1646F, -0.0116F, 0.5213F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.1067F, -3.7357F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(60, 85).addBox(0.0F, -2.4693F, -0.0854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(31, 64).addBox(-0.5F, 0.0052F, 3.0067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.516F, 0.2261F, -0.6563F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.3244F, 0.4639F, -1.2062F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(79, 37).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.3244F, -0.4639F, 1.2062F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 4).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.516F, -0.2261F, 0.6563F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0358F, -1.6639F, -0.2986F, 0.0651F, 0.2084F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(37, 89).addBox(0.0F, -2.378F, -0.2611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(40, 38).addBox(-0.5F, -0.1214F, 0.8322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-3.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0025F, -1.812F, 0.7277F, 0.7614F, -0.8155F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(62, 24).addBox(0.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0025F, -1.812F, 0.7277F, -0.7614F, 0.8155F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4584F, -2.7631F, 0.2699F, 0.5088F, -0.0932F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 84).addBox(0.0F, 0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7418F, -4.2046F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(75, 84).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5197F, -3.5407F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, -2.475F, 1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.7997F, -4.6639F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(18, 41).addBox(-0.5F, 0.225F, -2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.354F, -2.6113F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(15, 9).addBox(-1.0F, -0.825F, -3.1966F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2381F, -1.1608F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(22, 35).addBox(0.0F, -0.825F, -1.4966F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2381F, -1.1608F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(49, 44).addBox(-1.0F, 0.0027F, -2.015F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7063F, -3.5272F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(9, 41).addBox(-1.0F, -0.9973F, -2.015F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5584F, -2.5382F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 85).addBox(-0.7689F, -0.9788F, -0.5991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2689F, -0.8139F, -6.4023F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(85, 58).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0306F, -6.9286F, 2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(84, 62).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5077F, -6.0498F, -2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 64).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.4389F, -5.0527F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -0.8917F, -2.0433F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -2.5368F, -4.5242F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -1.1349F, -2.4756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -2.1823F, -1.631F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(39, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.7052F, 1.0222F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(49, 40).addBox(-1.0F, -0.3F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.1716F, 0.6639F, 2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(63, 78).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2034F, -0.0984F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(47, 78).addBox(0.0F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 64).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.7998F, 0.3911F, 2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(57, 79).addBox(-0.5F, -0.14F, -0.8575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.1823F, -1.631F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(58, 45).addBox(-0.5F, -0.8599F, -0.1243F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.1823F, -1.631F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 16).addBox(-1.0F, -1.1F, -3.325F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5234F, -0.3216F, -0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0371F, -0.8139F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-0.1096F, -0.3707F, -0.5016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(84, 22).mirror().addBox(-0.1096F, -0.6207F, -0.5016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.4443F, -0.1035F, 0.0114F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.1332F, -0.2034F, -0.0844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.97F, -0.0823F, 0.043F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(84, 28).mirror().addBox(-0.1332F, -0.6158F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.4464F, -0.0823F, 0.043F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(66, 88).mirror().addBox(-0.1332F, 0.0321F, -0.1225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.6173F, -0.0823F, 0.043F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(21, 89).mirror().addBox(-0.2241F, 0.9402F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.2713F, -0.1521F, 0.0434F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-0.1714F, 1.8036F, -0.8484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.0095F, -0.1521F, 0.0434F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.1714F, 2.6061F, -1.0933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -0.9222F, -0.1521F, 0.0434F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-0.4676F, 0.4084F, -4.2599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, 0.2108F, -0.2424F, 0.0273F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(75, 87).mirror().addBox(-0.4611F, -4.0865F, -3.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, 1.2906F, -0.2384F, 0.0232F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-1.2441F, -3.4047F, 3.7937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, 2.8169F, -0.3984F, 0.0132F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-1.5369F, 4.3802F, 0.0542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.512F, -0.437F, 0.0568F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-1.6518F, 4.0246F, 3.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.153F, -0.4408F, 0.0023F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(0.5433F, 4.1625F, 3.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.0926F, -0.0675F, -0.2328F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.2241F, 0.915F, -0.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.4895F, -0.1521F, 0.0434F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.5266F, -0.3589F, 3.8244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.8855F, -0.2397F, -0.0035F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.2241F, 1.8621F, -1.3042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(86, 14).mirror().addBox(-0.2241F, 1.5621F, -1.3042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.1491F, -0.1521F, 0.0434F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(2.7215F, 3.2639F, 3.2991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -2.1507F, 0.2513F, -0.0205F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-1.6518F, 4.1528F, 2.9601F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 0.4317F, -0.0345F, -1.9785F, -0.4408F, 0.0023F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(84, 45).addBox(-3.7215F, 3.2639F, 3.2991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.1507F, -0.2513F, 0.0205F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 14).addBox(-0.7759F, 1.5621F, -1.3042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(25, 75).addBox(-0.7759F, 1.8621F, -1.3042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.1491F, 0.1521F, -0.0434F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 52).addBox(-0.4734F, -0.3589F, 3.8244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.8855F, 0.2397F, 0.0035F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(89, 20).addBox(-0.7759F, 0.915F, -0.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.4895F, 0.1521F, -0.0434F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 51).addBox(-1.5433F, 4.1625F, 3.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.0926F, 0.0675F, 0.2328F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(71, 0).addBox(-0.3482F, 4.1528F, 2.9601F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.9785F, 0.4408F, -0.0023F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(81, 34).addBox(0.6518F, 4.0246F, 3.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.153F, 0.4408F, -0.0023F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(20, 78).addBox(0.5369F, 4.3802F, 0.0542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.512F, 0.437F, -0.0568F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(84, 42).addBox(0.2441F, -3.4047F, 3.7937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, 2.8169F, 0.3984F, -0.0132F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5389F, -4.0865F, -3.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, 1.2906F, 0.2384F, -0.0232F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 39).addBox(-0.5324F, 0.4084F, -4.2599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, 0.2108F, 0.2424F, -0.0273F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(89, 9).addBox(-0.8286F, 2.6061F, -1.0933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -0.9222F, 0.1521F, -0.0434F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(50, 86).addBox(-0.8286F, 1.8036F, -0.8484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.0095F, 0.1521F, -0.0434F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(21, 89).addBox(-0.7759F, 0.9402F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.2713F, 0.1521F, -0.0434F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(66, 88).addBox(-0.8668F, 0.0321F, -0.1225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -1.6173F, 0.0823F, -0.043F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(84, 28).addBox(-0.8668F, -0.6158F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.4464F, 0.0823F, -0.043F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(84, 25).addBox(-0.8668F, -0.2034F, -0.0844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.97F, 0.0823F, -0.043F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(84, 22).addBox(-0.8904F, -0.6207F, -0.5016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(84, 11).addBox(-0.8904F, -0.3707F, -0.5016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9504F, 0.4317F, -0.0345F, -2.4443F, 0.1035F, -0.0114F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6129F, -2.004F, 0.6452F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 55).addBox(-1.0793F, -1.6836F, -0.6507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3317F, 1.7744F, -4.5853F, -0.5455F, -1.0846F, -0.4176F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(21, 59).addBox(-0.0794F, -0.6818F, -2.7534F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -0.6741F, 0.1274F, -0.3164F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(45, 65).addBox(-1.8F, -1.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5553F, -1.2428F, -0.3453F, 2.5842F, 0.3737F, -0.4344F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(42, 74).addBox(-0.6397F, 0.8076F, -0.8605F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.3152F, -0.076F, -1.8019F, 2.513F, -0.2158F, -1.2507F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(44, 88).addBox(-0.3628F, 0.6732F, -0.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3152F, -0.076F, -1.8019F, 2.4925F, 0.1283F, -0.7971F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(74, 34).addBox(-1.9005F, 0.1714F, -0.8605F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(2.3152F, -0.076F, -1.8019F, 2.6365F, 0.4445F, -0.3032F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(35, 72).addBox(-1.9005F, -0.7182F, -0.7528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.3152F, -0.076F, -1.8019F, -2.3813F, 0.4445F, -0.3032F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 65).addBox(0.1066F, -1.3627F, 0.7994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3152F, -0.976F, -0.9019F, -2.6112F, 0.326F, -0.2388F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 81).addBox(0.1066F, 2.3462F, 0.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3152F, -0.976F, -0.9019F, -1.084F, 0.326F, -0.2388F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 69).addBox(0.1066F, 1.4741F, -3.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3152F, -0.976F, -0.9019F, 0.1377F, 0.326F, -0.2388F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(65, 26).addBox(0.1066F, -3.625F, 2.3984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3152F, -0.976F, -0.9019F, 2.8866F, 0.326F, -0.2388F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 48).addBox(0.1066F, -3.4781F, -2.9814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3152F, -0.976F, -0.9019F, 1.534F, 0.326F, -0.2388F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(5, 80).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6998F, 0.7214F, -7.0959F, -2.8566F, 0.1878F, -0.0904F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(62, 10).addBox(-0.5035F, 0.9932F, 0.2747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -2.815F, 0.0814F, -0.2307F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(25, 54).addBox(-0.1275F, -0.1791F, -0.0401F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, 3.0897F, 0.2297F, -0.1123F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(59, 5).addBox(-0.0794F, -0.2348F, -0.0865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, 3.0783F, 0.1274F, -0.3164F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(38, 68).addBox(0.1206F, -0.1057F, -0.4217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F))
				.texOffs(31, 68).addBox(0.1206F, -0.4057F, -0.4217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(18, 46).addBox(0.1206F, -0.7057F, -1.4217F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -2.7249F, 0.1274F, -0.3164F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(67, 55).addBox(0.1206F, -0.4772F, -0.5477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -2.2886F, 0.1274F, -0.3164F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(67, 34).addBox(0.1206F, 0.0122F, -0.452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.36F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -1.8086F, 0.1274F, -0.3164F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(67, 14).addBox(0.1206F, 0.7532F, -1.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -1.0232F, 0.1274F, -0.3164F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(40, 79).addBox(-0.7F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4291F, 0.1201F, -5.6373F, -2.968F, 0.5969F, 1.701F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(79, 39).addBox(-0.7F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.4291F, 0.1201F, -5.6373F, 2.8417F, 0.5497F, 0.8642F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(16, 88).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.65F, -0.1651F, -5.4642F, 2.6534F, 0.3966F, 0.4567F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(68, 78).addBox(-0.325F, -1.65F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2721F, -0.4137F, -5.3953F, -2.8626F, -0.5394F, 1.3805F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(45, 85).addBox(1.3061F, 2.0901F, 2.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3317F, 0.1744F, -1.0853F, -2.5619F, 0.168F, 0.0684F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(79, 66).addBox(1.3061F, 2.9537F, -1.9394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3317F, 0.1744F, -1.0853F, -1.3401F, 0.168F, 0.0684F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(85, 84).addBox(0.0F, -0.575F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.069F, -0.4501F, -4.731F, -1.6114F, 0.0287F, 0.0675F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(72, 41).addBox(-1.7F, -0.25F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3879F, -0.6294F, -4.773F, -1.3648F, 0.1029F, -0.0694F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(86, 6).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7813F, -0.5917F, -4.835F, -1.3369F, 0.1556F, 0.0956F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 38).addBox(-1.7F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3939F, -0.6853F, -4.4335F, -1.3985F, 0.0431F, -0.0742F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(19, 85).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7931F, -0.66F, -4.441F, -1.3942F, 0.0189F, 0.0633F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(28, 72).addBox(-1.0F, -0.725F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0591F, -0.1906F, -4.4668F, -0.477F, 0.0287F, 0.0675F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(72, 31).addBox(-1.0F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0204F, 0.65F, -3.8372F, -1.2187F, 0.0287F, 0.0675F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(74, 53).addBox(-1.0F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0074F, 1.022F, -3.4165F, -1.786F, 0.0287F, 0.0675F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(72, 28).addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0279F, 0.6778F, -3.5126F, -1.0878F, 0.0287F, 0.0675F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(74, 19).addBox(-1.0F, -0.575F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0198F, 0.8614F, -3.3626F, -0.5642F, 0.0287F, 0.0675F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(46, 20).addBox(-1.0F, -0.3F, -0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.0804F, -0.2341F, -3.8283F, -1.0006F, 0.0287F, 0.0675F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(11, 86).addBox(-0.6F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0925F, -0.528F, -4.0993F, -1.7423F, 0.0287F, 0.0675F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(70, 73).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0925F, -0.528F, -4.0993F, -0.826F, 0.0287F, 0.0675F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(62, 68).addBox(-0.3F, -0.5F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.3928F, -0.5998F, -4.2856F, -1.465F, 0.4082F, 1.5466F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(85, 3).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.0947F, -0.7119F, -4.4546F, -2.0478F, 0.0287F, 0.0675F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(89, 26).addBox(0.4521F, -1.3685F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.094F, 1.8129F, -0.5035F, 1.601F, -0.3831F, 1.5938F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 23).addBox(-1.0453F, -1.1726F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.094F, 1.8129F, -0.5035F, 2.8179F, -1.5412F, 0.3581F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(74, 13).addBox(-1.8507F, -0.3419F, -0.8218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(2.094F, 1.8129F, -0.5035F, -1.5991F, -0.1402F, -1.5326F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(74, 16).addBox(-1.0F, -0.55F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(1.1935F, 2.0504F, -0.6761F, -1.4532F, -0.2059F, -2.6883F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(10, 89).addBox(-0.1059F, -1.1246F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.094F, 1.8129F, -0.5035F, 1.599F, -0.1214F, 1.6016F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(26, 89).addBox(-0.8387F, -0.841F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.094F, 1.8129F, -0.5035F, 1.619F, -0.95F, 1.5659F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(86, 81).addBox(-0.0528F, -0.4468F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.594F, 1.5129F, -0.5035F, -1.5108F, -0.412F, -1.9101F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(5, 88).addBox(-0.7559F, -0.4295F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.594F, 1.5129F, -0.5035F, -1.5005F, -0.6733F, -1.93F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 88).addBox(-0.7576F, -0.5958F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.594F, 1.5129F, -0.5035F, -1.5066F, -0.5427F, -1.9193F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(86, 68).addBox(-0.3954F, -0.1761F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(1.594F, 1.5129F, -0.5035F, 1.3755F, -1.2838F, 1.443F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(87, 71).addBox(-0.3112F, 1.162F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(55, 86).addBox(-0.3112F, 0.462F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.594F, 1.5129F, -0.5035F, 1.22F, -1.4103F, 1.6021F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(65, 30).addBox(-1.6F, -0.4F, -1.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.0925F, 0.0062F, -1.4057F, 2.3553F, -0.0692F, -1.1424F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(81, 8).addBox(-0.7368F, -0.0116F, -2.6486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7067F, 1.7744F, -4.7853F, -0.6474F, 0.0428F, -0.1962F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(85, 0).addBox(-0.7088F, -0.4413F, -0.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(1.0481F, 0.5283F, -4.4167F, -1.3206F, 0.1667F, 0.1104F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 85).addBox(-0.7088F, -0.4359F, -0.1535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F)), PartPose.offsetAndRotation(1.0481F, 0.5283F, -4.4167F, -0.7097F, 0.1667F, 0.1104F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(72, 23).addBox(-1.025F, -1.0973F, -1.015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0532F, -0.5545F, -3.1587F, 1.948F, -0.412F, -1.0332F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(65, 43).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6784F, -0.3294F, -2.1306F, 0.4338F, 0.1919F, -2.8252F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(65, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2957F, -0.6348F, -2.2319F, 0.5317F, 0.204F, -2.468F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(52, 79).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8144F, -0.1753F, -3.1093F, 1.467F, 0.1794F, -2.8228F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(79, 43).addBox(-0.8956F, -1.9681F, -0.0213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0161F, -0.855F, -2.3424F, 1.5353F, 0.204F, -2.468F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(81, 16).addBox(-1.0F, -1.8192F, -0.4264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9621F, -0.5038F, -6.745F, 2.6791F, 0.1745F, 0.0F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(15, 80).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9062F, 1.7689F, -7.1896F, 0.0581F, 0.084F, -0.0448F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 80).addBox(-0.3294F, -0.8974F, -0.5969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2253F, 1.1901F, -7.0558F, 1.3677F, 0.1711F, -0.0397F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(45, 82).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1484F, -0.6906F, -4.2335F, -2.4041F, 0.1575F, 0.0411F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6346F, -0.1464F, -4.4622F, -2.8914F, 0.0926F, -0.0178F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0126F, -0.4323F, -5.7452F, -3.0223F, 0.0926F, -0.0178F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(66, 4).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.919F, -0.5033F, -6.7383F, 3.0689F, 0.0926F, -0.0178F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(81, 81).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8095F, -0.0266F, -7.6105F, -2.6474F, 0.1362F, -0.021F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(87, 77).addBox(-0.1957F, -0.7301F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(85, 87).addBox(-0.3207F, -0.7301F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0481F, 0.5283F, -4.4167F, 0.2999F, 0.195F, 0.1441F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6129F, -2.004F, 0.6452F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(0.0793F, -1.6836F, -0.6507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3317F, 1.7744F, -4.5853F, -0.5455F, 1.0846F, 0.4176F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(21, 59).mirror().addBox(-0.9206F, -0.6818F, -2.7534F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -0.6741F, -0.1274F, 0.3164F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-0.2F, -1.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5553F, -1.2428F, -0.3453F, 2.5842F, -0.3737F, 0.4344F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-1.3603F, 0.8076F, -0.8605F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.3152F, -0.076F, -1.8019F, 2.513F, 0.2158F, 1.2507F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(44, 88).mirror().addBox(-0.6372F, 0.6732F, -0.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3152F, -0.076F, -1.8019F, 2.4925F, -0.1283F, 0.7971F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-0.0995F, 0.1714F, -0.8605F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.3152F, -0.076F, -1.8019F, 2.6365F, -0.4445F, 0.3032F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.0995F, -0.7182F, -0.7528F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.3152F, -0.076F, -1.8019F, -2.3813F, -0.4445F, 0.3032F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.1066F, -1.3627F, 0.7994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.976F, -0.9019F, -2.6112F, -0.326F, 0.2388F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-1.1066F, 2.3462F, 0.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.976F, -0.9019F, -1.084F, -0.326F, 0.2388F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-1.1066F, 1.4741F, -3.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.976F, -0.9019F, 0.1377F, -0.326F, 0.2388F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-1.1066F, -3.625F, 2.3984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.976F, -0.9019F, 2.8866F, -0.326F, 0.2388F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(85, 48).mirror().addBox(-1.1066F, -3.4781F, -2.9814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3152F, -0.976F, -0.9019F, 1.534F, -0.326F, 0.2388F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6998F, 0.7214F, -7.0959F, -2.8566F, -0.1878F, 0.0904F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-0.4965F, 0.9932F, 0.2747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -2.815F, -0.0814F, 0.2307F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.8725F, -0.1791F, -0.0401F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, 3.0897F, -0.2297F, 0.1123F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-0.9206F, -0.2348F, -0.0865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, 3.0783F, -0.1274F, 0.3164F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(38, 68).mirror().addBox(-1.1206F, -0.1057F, -0.4217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false)
				.texOffs(31, 68).mirror().addBox(-1.1206F, -0.4057F, -0.4217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(18, 46).mirror().addBox(-1.1206F, -0.7057F, -1.4217F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -2.7249F, -0.1274F, 0.3164F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(67, 55).mirror().addBox(-1.1206F, -0.4772F, -0.5477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -2.2886F, -0.1274F, 0.3164F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-1.1206F, 0.0122F, -0.452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.36F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -1.8086F, -0.1274F, 0.3164F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(-1.1206F, 0.7532F, -1.059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -1.0232F, -0.1274F, 0.3164F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.3F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4291F, 0.1201F, -5.6373F, -2.968F, -0.5969F, -1.701F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.3F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.4291F, 0.1201F, -5.6373F, 2.8417F, -0.5497F, -0.8642F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -0.1651F, -5.4642F, 2.6534F, -0.3966F, -0.4567F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(-0.675F, -1.65F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2721F, -0.4137F, -5.3953F, -2.8626F, 0.5394F, -1.3805F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(45, 85).mirror().addBox(-2.3061F, 2.0901F, 2.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3317F, 0.1744F, -1.0853F, -2.5619F, -0.168F, -0.0684F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-2.3061F, 2.9537F, -1.9394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3317F, 0.1744F, -1.0853F, -1.3401F, -0.168F, -0.0684F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-1.0F, -0.575F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.069F, -0.4501F, -4.731F, -1.6114F, -0.0287F, -0.0675F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-0.3F, -0.25F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3879F, -0.6294F, -4.773F, -1.3648F, -0.1029F, 0.0694F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7813F, -0.5917F, -4.835F, -1.3369F, -0.1556F, -0.0956F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-0.3F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3939F, -0.6853F, -4.4335F, -1.3985F, -0.0431F, 0.0742F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(19, 85).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7931F, -0.66F, -4.441F, -1.3942F, -0.0189F, -0.0633F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-1.0F, -0.725F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0591F, -0.1906F, -4.4668F, -0.477F, -0.0287F, -0.0675F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-1.0F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0204F, 0.65F, -3.8372F, -1.2187F, -0.0287F, -0.0675F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-1.0F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0074F, 1.022F, -3.4165F, -1.786F, -0.0287F, -0.0675F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0279F, 0.6778F, -3.5126F, -1.0878F, -0.0287F, -0.0675F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-1.0F, -0.575F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0198F, 0.8614F, -3.3626F, -0.5642F, -0.0287F, -0.0675F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-1.0F, -0.3F, -0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.0804F, -0.2341F, -3.8283F, -1.0006F, -0.0287F, -0.0675F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(11, 86).mirror().addBox(-0.4F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, -0.528F, -4.0993F, -1.7423F, -0.0287F, -0.0675F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, -0.528F, -4.0993F, -0.826F, -0.0287F, -0.0675F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(62, 68).mirror().addBox(-0.7F, -0.5F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3928F, -0.5998F, -4.2856F, -1.465F, -0.4082F, -1.5466F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.0947F, -0.7119F, -4.4546F, -2.0478F, -0.0287F, -0.0675F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-1.4521F, -1.3685F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.8129F, -0.5035F, 1.601F, 0.3831F, -1.5938F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(0.0453F, -1.1726F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.8129F, -0.5035F, 2.8179F, 1.5412F, -0.3581F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-0.1493F, -0.3419F, -0.8218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.8129F, -0.5035F, -1.5991F, 0.1402F, 1.5326F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(74, 16).mirror().addBox(-1.0F, -0.55F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(-1.1935F, 2.0504F, -0.6761F, -1.4532F, 0.2059F, 2.6883F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.8941F, -1.1246F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.8129F, -0.5035F, 1.599F, 0.1214F, -1.6016F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(26, 89).mirror().addBox(-0.1612F, -0.841F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.8129F, -0.5035F, 1.619F, 0.95F, -1.5659F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(86, 81).mirror().addBox(-0.9472F, -0.4468F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.594F, 1.5129F, -0.5035F, -1.5108F, 0.412F, 1.9101F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.2441F, -0.4295F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.594F, 1.5129F, -0.5035F, -1.5005F, 0.6733F, 1.93F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.2424F, -0.5958F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.594F, 1.5129F, -0.5035F, -1.5066F, 0.5427F, 1.9193F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(-0.6046F, -0.1761F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(-1.594F, 1.5129F, -0.5035F, 1.3755F, 1.2838F, -1.443F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-0.6888F, 1.162F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(55, 86).mirror().addBox(-0.6888F, 0.462F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.594F, 1.5129F, -0.5035F, 1.22F, 1.4103F, -1.6021F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-0.4F, -0.4F, -1.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 0.0062F, -1.4057F, 2.3553F, 0.0692F, 1.1424F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-0.2632F, -0.0116F, -2.6486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 1.7744F, -4.7853F, -0.6474F, -0.0428F, 0.1962F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.2912F, -0.4413F, -0.7463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0481F, 0.5283F, -4.4167F, -1.3206F, -0.1667F, -0.1104F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.2912F, -0.4359F, -0.1535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F)).mirror(false), PartPose.offsetAndRotation(-1.0481F, 0.5283F, -4.4167F, -0.7097F, -0.1667F, -0.1104F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(0.025F, -1.0973F, -1.015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0532F, -0.5545F, -3.1587F, 1.948F, 0.412F, 1.0332F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6784F, -0.3294F, -2.1306F, 0.4338F, -0.1919F, 2.8252F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2957F, -0.6348F, -2.2319F, 0.5317F, -0.204F, 2.468F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(52, 79).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8144F, -0.1753F, -3.1093F, 1.467F, -0.1794F, 2.8228F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-0.1044F, -1.9681F, -0.0213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0161F, -0.855F, -2.3424F, 1.5353F, -0.204F, 2.468F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(0.0F, -1.8192F, -0.4264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9621F, -0.5038F, -6.745F, 2.6791F, -0.1745F, 0.0F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, 1.7689F, -7.1896F, 0.0581F, -0.084F, 0.0448F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.6706F, -0.8974F, -0.5969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2253F, 1.1901F, -7.0558F, 1.3677F, -0.1711F, 0.0397F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1484F, -0.6906F, -4.2335F, -2.4041F, -0.1575F, -0.0411F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6346F, -0.1464F, -4.4622F, -2.8914F, -0.0926F, 0.0178F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0126F, -0.4323F, -5.7452F, -3.0223F, -0.0926F, 0.0178F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.919F, -0.5033F, -6.7383F, 3.0689F, -0.0926F, 0.0178F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(81, 81).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8095F, -0.0266F, -7.6105F, -2.6474F, -0.1362F, 0.021F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-0.8043F, -0.7301F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(85, 87).mirror().addBox(-0.6793F, -0.7301F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0481F, 0.5283F, -4.4167F, 0.2999F, -0.195F, -0.1441F));

		return LayerDefinition.create(meshdefinition, 94, 94);
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