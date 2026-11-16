package fossils.fossils.client.blockentity.model.arizonasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArizonasaurusFossilModel extends SkullModelBase {
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
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand4;
	private final ModelPart hand2;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand3;
	private final ModelPart hand5;
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

	public ArizonasaurusFossilModel(ModelPart root) {
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
		this.head1 = this.neck5.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.leftFace = this.head1.getChild("leftFace");
		this.rightFace = this.head1.getChild("rightFace");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.hand2 = this.hand4.getChild("hand2");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand3 = this.lowerarm3.getChild("hand3");
		this.hand5 = this.hand3.getChild("hand5");
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

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -4.3665F, 3.8611F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-3.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 26).addBox(-0.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(19, 36).addBox(-1.2F, -0.0744F, 0.0452F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = basin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(120, 44).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.5348F, 4.1212F, -0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r3 = basin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(118, 129).addBox(0.0F, -4.3932F, -0.7907F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, 0.2203F, 2.6191F, -0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r4 = basin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(132, 120).addBox(-0.003F, -8.0816F, -1.8364F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, 1.9953F, 1.5691F, -0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r5 = basin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(133, 90).addBox(-0.009F, -6.7247F, -5.9508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, 1.9953F, 1.5691F, -1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r6 = basin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 115).addBox(-0.012F, -1.0109F, -1.9877F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -3.9047F, 4.1941F, -2.1773F, 0.0F, 0.0F));

		PartDefinition cube_r7 = basin.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(133, 80).addBox(-0.015F, -0.7544F, -2.7447F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -3.9047F, 4.1941F, -2.3082F, 0.0F, 0.0F));

		PartDefinition cube_r8 = basin.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(133, 73).addBox(-0.003F, -0.4208F, -2.453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, 0.2203F, 2.6191F, -2.0289F, 0.0F, 0.0F));

		PartDefinition cube_r9 = basin.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(114, 121).addBox(-0.006F, -1.5057F, -0.398F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, 0.2203F, 2.6191F, -0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r10 = basin.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(134, 18).addBox(-0.015F, -0.722F, -2.7724F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -6.2797F, 2.9191F, -2.2907F, 0.0F, 0.0F));

		PartDefinition cube_r11 = basin.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 121).addBox(-0.006F, -1.5719F, -0.1054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -0.1797F, 0.6191F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r12 = basin.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 119).addBox(-0.012F, -0.9825F, -2.0193F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -6.2797F, 2.9191F, -2.1598F, 0.0F, 0.0F));

		PartDefinition cube_r13 = basin.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(133, 130).addBox(0.0F, -0.725F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.197F, -7.0383F, 4.6894F, -1.1999F, 0.0F, 0.0F));

		PartDefinition cube_r14 = basin.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(133, 46).addBox(0.0F, -1.0F, -0.375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.209F, -4.8462F, 3.1486F, -0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r15 = basin.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(133, 42).addBox(-0.003F, -1.9797F, 0.5327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -6.2797F, 2.9191F, -0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r16 = basin.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 119).addBox(0.0F, -6.5211F, -0.5194F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -0.1797F, 0.6191F, -0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r17 = basin.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(133, 67).addBox(-0.003F, -0.7023F, -2.5568F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -0.1797F, 0.6191F, -1.9242F, 0.0F, 0.0F));

		PartDefinition cube_r18 = basin.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 121).addBox(-0.006F, -4.7599F, -0.0169F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -0.1797F, 0.6191F, -0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r19 = basin.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 94).addBox(0.0F, -1.8628F, -0.1751F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -0.1797F, 0.6191F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r20 = basin.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(133, 59).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -3.3138F, -0.6291F, -1.8631F, 0.0F, 0.0F));

		PartDefinition cube_r21 = basin.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 79).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -1.9797F, 0.7191F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r22 = basin.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 104).addBox(0.0F, -3.325F, -0.425F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.6849F, 1.1291F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r23 = basin.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 115).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -7.029F, 0.8531F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r24 = basin.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(39, 133).addBox(0.0F, -1.0F, -0.475F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -7.3829F, 2.1971F, -0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r25 = basin.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 126).addBox(0.003F, -0.0407F, 0.8138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -10.4982F, 2.8255F, -0.6763F, 0.0F, 0.0F));

		PartDefinition cube_r26 = basin.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(119, 29).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -8.8275F, 1.7198F, -2.0289F, 0.0F, 0.0F));

		PartDefinition cube_r27 = basin.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(49, 121).addBox(0.009F, -2.151F, -0.7887F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.191F, -0.0982F, -0.4995F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r28 = basin.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 119).addBox(0.0F, -1.0119F, 0.0058F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.191F, -10.4982F, 2.8255F, -2.1598F, 0.0F, 0.0F));

		PartDefinition cube_r29 = basin.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 131).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.206F, -7.5737F, -0.4149F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r30 = basin.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 133).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -9.2523F, 0.4152F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r31 = basin.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(106, 122).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.197F, -10.4941F, 1.0286F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r32 = basin.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(115, 57).addBox(0.0F, -0.894F, -1.8947F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -8.1232F, -0.7995F, -1.994F, 0.0F, 0.0F));

		PartDefinition cube_r33 = basin.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 91).addBox(0.009F, -7.57F, -0.7035F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.6232F, -2.4995F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r34 = basin.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 99).addBox(0.0F, -0.9877F, -2.5365F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -9.8982F, -0.0995F, -1.994F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(50, 16).addBox(-0.3F, -0.5688F, -7.1294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(69, 131).addBox(0.197F, -5.7898F, -5.003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, -0.0088F, -0.1309F, 0.0011F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(101, 40).addBox(0.0F, -1.003F, -3.0103F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -10.4004F, 0.4067F, -1.9853F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(132, 116).addBox(0.003F, -1.6929F, 0.1431F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.9504F, -0.7933F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 123).addBox(0.006F, -3.0026F, -0.0101F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.9504F, -0.7933F, -0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(104, 5).addBox(0.009F, -5.6858F, -0.2575F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 109).addBox(0.003F, -5.3765F, -0.139F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.3004F, -1.3183F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(115, 48).addBox(0.0F, -1.0349F, -1.639F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -8.8504F, -0.0933F, -1.8631F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(133, 70).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -13.4335F, 2.8037F, -1.9417F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 115).addBox(0.0F, -1.6F, -0.45F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.197F, -11.8531F, 2.289F, -0.589F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(133, 32).addBox(0.0F, -1.0F, -0.45F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -9.7966F, 1.141F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(36, 131).addBox(0.012F, -3.3535F, 0.1151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.9504F, -0.7933F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 131).addBox(0.012F, -2.7639F, 0.0583F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -3.5004F, -3.2183F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(133, 4).addBox(0.009F, -2.0039F, 0.2404F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 123).addBox(0.003F, -3.8998F, 0.0719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -0.24F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(117, 6).addBox(0.0F, -0.9972F, -1.6443F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -1.6886F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 127).addBox(0.009F, -6.9027F, -0.0294F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 111).addBox(0.006F, -9.4766F, -0.6546F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(113, 91).addBox(0.003F, -0.1789F, -9.4994F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -1.8457F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 122).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.197F, -1.6526F, -2.6678F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(81, 113).addBox(0.009F, -3.9487F, 0.0552F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, 0.4496F, -3.4933F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(52, 121).addBox(0.006F, -2.7374F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -3.5004F, -3.2183F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(104, 132).addBox(0.003F, -1.6528F, 0.1475F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -3.5004F, -3.2183F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(101, 35).addBox(0.0F, -0.9403F, -4.6427F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -1.7235F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(65, 101).addBox(0.0F, -0.658F, -7.6297F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.2004F, -2.9683F, -1.7846F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 112).addBox(0.006F, -2.7986F, 0.0353F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -4.0754F, -5.1183F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(117, 0).addBox(0.009F, -3.8535F, -0.8952F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.2754F, -4.0933F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 122).addBox(0.003F, -2.8758F, -1.0655F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.2754F, -4.0933F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(113, 61).addBox(0.003F, -0.9949F, -2.0142F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -14.3771F, -5.0187F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 110).addBox(0.0F, -2.35F, -0.45F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -13.8616F, -3.8393F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(106, 127).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.203F, -12.1629F, -4.0418F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(97, 8).addBox(0.0F, -1.0127F, -3.0155F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -11.4754F, -5.1933F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(7, 97).addBox(0.0F, -1.0127F, -3.0155F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -8.4754F, -5.1933F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(115, 44).addBox(0.0F, -0.9936F, -1.6172F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.8754F, -5.1183F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(123, 16).addBox(0.003F, -2.285F, 0.2858F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -8.4754F, -5.1933F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(133, 0).addBox(0.009F, -1.9766F, 0.2381F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -6.8754F, -5.1183F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(30, 131).addBox(0.012F, -1.13F, 0.1868F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.7754F, -5.1183F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(72, 131).addBox(0.003F, -5.5478F, -0.7765F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.2754F, -5.9433F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(28, 112).addBox(0.0F, -2.0F, -0.375F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.8912F, -6.5933F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(98, 117).addBox(0.009F, -3.8535F, -0.8952F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.2754F, -5.9433F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 123).addBox(0.003F, -2.8758F, -1.0655F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -0.2754F, -5.9433F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(36, 113).addBox(0.0F, -0.3F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.197F, -15.5384F, -7.723F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(111, 119).addBox(0.006F, -5.8095F, -0.9191F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -10.8004F, -6.0933F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 131).addBox(0.009F, -2.0111F, -1.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -10.8004F, -6.0933F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, -0.5F, -5.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -10.0272F, -7.0494F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 126).addBox(0.003F, -4.9346F, -0.9051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.8754F, -5.9433F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 132).addBox(0.009F, -2.983F, -1.1392F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.8754F, -5.9433F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 130).addBox(0.012F, -1.9479F, -0.9741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.194F, -5.8754F, -5.9433F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(117, 97).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.5899F, 0.0541F, 0.0787F, -0.1284F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(117, 99).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.5899F, -0.0051F, 0.0953F, -0.7853F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-8.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.5899F, -0.059F, 0.0751F, -1.3981F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-7.0418F, -2.5888F, -0.5365F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -4.5899F, -0.0769F, -0.0103F, -1.4685F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(118, 61).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -4.5899F, -0.069F, 0.0356F, -0.8593F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(118, 63).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -4.5899F, -0.033F, 0.0702F, -0.2047F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 118).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -2.5899F, -0.0678F, 0.0667F, -0.3118F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(118, 90).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -2.5899F, -0.0944F, 0.0117F, -0.9646F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-6.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -2.5899F, -0.0841F, -0.0445F, -1.5731F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(103, 55).mirror().addBox(-4.1574F, -0.9495F, -0.5365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -0.5899F, -0.1325F, -0.0242F, -1.2087F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(118, 92).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -0.5899F, -0.12F, 0.0613F, -0.5595F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(118, 92).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -0.5899F, -0.12F, -0.0613F, 0.5595F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 55).addBox(1.1574F, -0.9495F, -0.5365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -0.5899F, -0.1325F, 0.0242F, 1.2087F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(92, 55).addBox(2.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -2.5899F, -0.0841F, 0.0445F, 1.5731F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(118, 90).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -2.5899F, -0.0944F, -0.0117F, 0.9646F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 118).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -2.5899F, -0.0678F, -0.0667F, 0.3118F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(118, 63).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -4.5899F, -0.033F, -0.0702F, 0.2047F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(118, 61).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -4.5899F, -0.069F, -0.0356F, 0.8593F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(79, 68).addBox(2.0418F, -2.5888F, -0.5365F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -4.5899F, -0.0769F, 0.0103F, 1.4685F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(117, 97).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.5899F, 0.0428F, -0.1652F, 0.1298F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(117, 99).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.5899F, -0.0676F, -0.1568F, 0.7932F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 49).addBox(2.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.5899F, -0.1453F, -0.0898F, 1.4052F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(50, 26).addBox(-0.9F, -0.5374F, -6.8909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, 0.1226F, -0.0866F, -0.0107F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 25).addBox(-2.5F, -0.5383F, 0.7253F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 9.6405F, -4.876F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(75, 130).addBox(0.012F, -7.318F, -0.4062F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.4441F, -0.2798F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(132, 24).addBox(0.009F, -1.0764F, -1.1411F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -7.7441F, -0.3298F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(51, 126).addBox(0.003F, -3.0299F, -0.9901F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -7.7441F, -0.3298F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 75).addBox(0.0F, -0.825F, -1.825F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -9.6272F, -1.487F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(72, 100).addBox(0.006F, 0.1691F, -1.9136F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -12.6941F, -1.0798F, -1.2697F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(63, 131).addBox(0.009F, -5.0214F, -0.7488F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -7.7441F, -0.3298F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(94, 119).addBox(0.006F, -3.8212F, -0.9979F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -12.6941F, -1.0798F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(112, 97).addBox(0.0F, -0.6F, -0.925F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -15.091F, -2.8901F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(42, 123).addBox(0.003F, -2.6761F, -1.1792F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.4441F, -0.2798F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 117).addBox(0.009F, -3.6535F, -0.8926F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.4441F, -0.2798F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 112).addBox(0.0F, -2.0F, -0.575F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -4.8724F, -0.7741F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(84, 131).addBox(0.003F, -5.3479F, -0.7799F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.4441F, -0.2798F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(98, 131).addBox(0.003F, -1.7528F, -0.9684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -4.0441F, -1.9048F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(112, 17).addBox(0.006F, -2.8718F, -1.1355F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -4.0441F, -1.9048F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(66, 117).addBox(0.009F, -3.8323F, -1.0638F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.2691F, -1.7298F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 118).addBox(0.003F, -3.8473F, -1.358F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.2691F, -1.7298F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(112, 87).addBox(0.003F, -0.1041F, -4.9925F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -10.7191F, -2.8798F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(15, 129).addBox(0.006F, -4.9605F, -0.748F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -10.7191F, -2.8798F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 131).addBox(0.009F, -1.9766F, -1.006F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -10.7191F, -2.8798F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 98).addBox(0.006F, 0.4853F, -3.6483F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -10.7191F, -2.8798F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 48).addBox(0.0F, -0.3255F, -5.5375F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -5.7691F, -1.9798F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 126).addBox(0.003F, -5.0F, -0.7711F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -5.7691F, -1.9798F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(132, 112).addBox(0.009F, -3.0483F, -1.0893F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -5.7691F, -1.9798F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(130, 67).addBox(0.012F, -2.0236F, -0.9807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -5.7691F, -1.9798F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(130, 45).addBox(0.012F, -5.8878F, 0.6225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(132, 8).addBox(0.009F, -6.7411F, 0.9769F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(45, 126).addBox(0.003F, -2.959F, -0.9388F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -6.8691F, -4.1798F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 94).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -8.5113F, -5.4855F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(86, 16).addBox(0.0F, -0.45F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -10.6844F, -6.5638F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(53, 131).addBox(0.009F, -4.9267F, -0.5481F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -6.8691F, -4.1798F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 131).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -11.5396F, -5.8117F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(112, 65).addBox(0.0F, -0.225F, -1.05F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -12.1483F, -7.3483F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(114, 4).addBox(0.003F, -2.4765F, -0.3467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(116, 115).addBox(0.009F, -2.4133F, 0.0116F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(78, 113).addBox(0.006F, -5.1663F, -0.0355F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(95, 131).addBox(0.003F, -4.0571F, 0.1365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -0.7691F, -4.5798F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(130, 133).addBox(0.0F, -0.425F, -0.425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -13.0053F, -7.2739F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(130, 32).addBox(0.003F, -0.013F, -0.9847F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -6.8497F, -5.8791F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(133, 127).addBox(0.0F, -1.0F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -6.8544F, -7.0193F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(112, 131).addBox(0.0F, -1.0F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -5.9007F, -6.7186F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(38, 126).addBox(-0.003F, -0.5886F, -0.0504F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -8.3792F, -7.9724F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 96).addBox(-0.006F, -0.3792F, -1.0724F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -8.3792F, -7.9724F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, -0.3218F, -1.5356F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -8.5042F, -8.1474F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(47, 131).addBox(0.003F, -2.252F, 0.0752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 28).addBox(0.0F, -2.652F, 0.0752F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -8.5042F, -8.1474F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(116, 101).addBox(0.0F, 0.375F, -0.675F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(101, 116).addBox(0.003F, -0.125F, -0.675F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -10.1691F, -9.2298F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(81, 131).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -3.2162F, -5.303F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(75, 116).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -1.2F, -5.7329F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(113, 38).addBox(0.6F, -4.025F, -0.075F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.8706F, -6.6981F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(58, 116).addBox(0.6F, -2.825F, 0.425F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.003F, -0.5249F, -7.3299F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-10.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -5.3513F, -0.0481F, 0.1263F, -1.3098F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(117, 54).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -5.3513F, 0.0335F, 0.1309F, -0.6937F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(117, 65).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -5.3513F, 0.1064F, 0.0835F, -0.0369F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(117, 67).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.3513F, 0.0192F, 0.0754F, -0.0962F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(117, 86).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.3513F, -0.0307F, 0.0715F, -0.7525F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.3513F, -0.0662F, 0.0409F, -1.3636F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -3.3513F, -0.0553F, 0.0922F, -1.328F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(117, 88).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -3.3513F, 0.0077F, 0.1072F, -0.7142F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(91, 117).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -3.3513F, 0.0715F, 0.0803F, -0.0572F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(91, 117).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -3.3513F, 0.0715F, -0.0803F, 0.0572F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(117, 88).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -3.3513F, 0.0077F, -0.1072F, 0.7142F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(69, 12).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -3.3513F, -0.0553F, -0.0922F, 1.328F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(67, 34).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.3513F, -0.0662F, -0.0409F, 1.3636F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(117, 86).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.3513F, -0.0307F, -0.0715F, 0.7525F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(117, 67).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.3513F, 0.0192F, -0.0754F, 0.0962F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 18).addBox(2.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -5.3513F, -0.0481F, -0.1263F, 1.3098F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(117, 54).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -5.3513F, 0.0335F, -0.1309F, 0.6937F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(117, 65).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -5.3513F, 0.1064F, -0.0835F, 0.0369F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(67, 20).addBox(-0.9F, -0.5374F, -4.8909F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0084F, -6.945F, 0.1572F, -0.0431F, -0.0068F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 95).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.4064F, 0.0725F, 0.1664F, -0.7752F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-10.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.4064F, -0.0371F, 0.1775F, -1.3954F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(114, 10).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -4.4064F, 0.1587F, 0.088F, -0.1197F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-10.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -2.4064F, -0.0517F, 0.1092F, -1.3626F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(117, 25).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -2.4064F, 0.0206F, 0.1191F, -0.7476F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(117, 27).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -2.4064F, 0.0889F, 0.0819F, -0.0907F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(36, 117).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -0.4064F, 0.0192F, 0.0754F, -0.0613F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(117, 52).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -0.4064F, -0.0307F, 0.0715F, -0.7176F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(-10.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -0.4064F, -0.0662F, 0.0409F, -1.3287F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 16).addBox(2.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -0.4064F, -0.0662F, -0.0409F, 1.3287F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(117, 52).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -0.4064F, -0.0307F, -0.0715F, 0.7176F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(36, 117).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -0.4064F, 0.0192F, -0.0754F, 0.0613F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(117, 27).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -2.4064F, 0.0889F, -0.0819F, 0.0907F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(117, 25).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -2.4064F, 0.0206F, -0.1191F, 0.7476F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 54).addBox(2.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -2.4064F, -0.0517F, -0.1092F, 1.3626F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(114, 10).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.4064F, 0.1587F, -0.088F, 0.1197F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(57, 52).addBox(2.0418F, -2.5888F, -0.5365F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.4064F, -0.0371F, -0.1775F, 1.3954F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(113, 95).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -4.4064F, 0.0725F, -0.1664F, 0.7752F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(25, 13).addBox(-2.0F, -0.64F, -7.0918F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 9.8538F, 0.5341F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(134, 36).addBox(0.0F, -1.0F, 0.175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -3.2633F, -4.6477F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(134, 76).addBox(0.0F, 0.117F, -1.2295F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -4.3441F, -3.5973F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(127, 133).addBox(0.0F, -1.0282F, -0.9471F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -4.3441F, -3.5973F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(133, 124).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -4.3961F, -3.5674F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(81, 119).addBox(-0.003F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -3.4035F, -3.4455F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(23, 116).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -4.1535F, -1.7205F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(124, 133).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -5.1461F, -1.8424F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(121, 133).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -5.9941F, -2.3723F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(118, 133).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -5.9941F, -2.3723F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(115, 133).addBox(0.0F, 0.0F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 109).addBox(0.006F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -5.1993F, -2.1525F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(133, 106).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.394F, -4.0133F, -2.9227F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 115).addBox(0.597F, -3.825F, 0.125F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5165F, -3.385F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(101, 131).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -2.9821F, -1.1991F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(124, 129).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -1.3257F, -1.5815F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(18, 116).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -7.102F, -2.6391F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 18).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.406F, -7.0831F, -1.1526F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(133, 103).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -8.0989F, -2.7176F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(133, 93).addBox(0.0F, -2.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 117).addBox(0.003F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -6.6874F, -0.5341F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(115, 129).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.403F, -4.7748F, 0.0507F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(127, 129).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.394F, -2.776F, 0.1205F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(121, 129).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3257F, -1.5815F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 130).addBox(0.6F, -0.825F, 0.125F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.003F, -0.5165F, -1.785F, -0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.808F, -4.8842F, -0.1402F, -0.0864F, 0.0122F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-0.0802F, -0.1023F, -3.209F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2271F, 8.0288F, 0.213F, -0.4243F, 0.3203F, -0.1413F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.5082F, 0.3056F, -0.6973F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2271F, 8.0288F, 0.213F, -0.7517F, -0.7984F, 0.982F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7837F, 8.5622F, 0.8926F, -0.3651F, -0.8209F, 0.4877F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4428F, 8.5207F, 0.6605F, -0.1826F, -0.7138F, 0.357F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(92, 44).mirror().addBox(-0.4676F, 0.3987F, -1.0436F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8477F, 7.3764F, -1.1897F, -0.2452F, -1.1996F, 0.5824F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(115, 77).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3983F, -5.4222F, 0.4737F, 0.1099F, -0.3501F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(116, 84).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3983F, -5.4222F, 0.3198F, 0.3715F, -0.9706F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-6.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3983F, -5.4222F, 0.0359F, 0.4841F, -1.6332F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-8.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1483F, -3.4222F, 0.0097F, 0.3821F, -1.4871F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(116, 105).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1483F, -3.4222F, 0.2341F, 0.305F, -0.842F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(117, 12).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1483F, -3.4222F, 0.3686F, 0.1037F, -0.2043F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(117, 14).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2017F, -1.4222F, 0.3335F, 0.1014F, -0.1555F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(117, 23).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2017F, -1.4222F, 0.2064F, 0.2823F, -0.7976F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2017F, -1.4222F, 0.0015F, 0.3481F, -1.4377F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(92, 44).addBox(-0.5324F, 0.3987F, -1.0436F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0477F, 7.3764F, -1.1897F, -0.2452F, 1.1996F, -0.5824F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(38, 47).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6428F, 8.5207F, 0.6605F, -0.1826F, 0.7138F, -0.357F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9837F, 8.5622F, 0.8926F, -0.3651F, 0.8209F, -0.4877F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(82, 0).addBox(-0.4918F, 0.3056F, -0.6973F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4271F, 8.0288F, 0.213F, -0.7517F, 0.7984F, -0.982F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 6).addBox(-1.9198F, -0.1023F, -3.209F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4271F, 8.0288F, 0.213F, -0.4243F, -0.3203F, 0.1413F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(67, 28).addBox(-3.8271F, -0.1523F, -4.9881F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(69, 0).addBox(-2.3271F, -0.086F, -3.0986F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4271F, 8.0288F, 0.213F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(32, 126).addBox(-0.003F, -0.5465F, -0.425F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3115F, -5.3363F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(133, 53).addBox(0.0F, -0.0541F, 2.3033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 62).addBox(-0.003F, -0.0541F, 3.1033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3115F, -5.3363F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(134, 50).addBox(0.0F, 0.0604F, 3.6923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 100).addBox(0.003F, 0.0604F, 2.8923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.097F, 0.0885F, -3.7363F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(126, 15).addBox(-0.003F, 0.0533F, -0.4092F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0885F, -3.7363F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(109, 125).addBox(-0.003F, 0.0533F, -0.4092F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3115F, -2.0363F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(86, 96).addBox(0.0F, 0.0604F, 2.8923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 39).addBox(-0.003F, 0.0604F, 3.6923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3115F, -2.0363F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(91, 119).addBox(-0.003F, -0.9467F, -0.4092F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0115F, -0.6613F, -3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(75, 134).addBox(0.0F, 0.0604F, 3.3923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 134).addBox(0.003F, 0.0604F, 2.8923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.097F, -1.0115F, -0.6613F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(67, 32).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2017F, -1.4222F, 0.0015F, -0.3481F, 1.4377F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(117, 23).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2017F, -1.4222F, 0.2064F, -0.2823F, 0.7976F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(117, 14).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2017F, -1.4222F, 0.3335F, -0.1014F, 0.1555F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(117, 12).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1483F, -3.4222F, 0.3686F, -0.1037F, 0.2043F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(116, 105).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1483F, -3.4222F, 0.2341F, -0.305F, 0.842F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(69, 14).addBox(2.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1483F, -3.4222F, 0.0097F, -0.3821F, 1.4871F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(115, 77).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3983F, -5.4222F, 0.4737F, -0.1099F, 0.3501F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(116, 84).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3983F, -5.4222F, 0.3198F, -0.3715F, 0.9706F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(91, 23).addBox(2.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3983F, -5.4222F, 0.0359F, -0.4841F, 1.6332F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 57).addBox(0.1F, -1.0F, 2.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -7.9057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(7, 92).addBox(-0.4F, -0.7056F, -2.9655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1199F, -5.902F, 0.0521F, -0.167F, -0.0977F));

		PartDefinition cube_r249 = neck1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(134, 21).addBox(0.0F, -0.0541F, 3.1033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 56).addBox(0.003F, -0.0541F, 2.3033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.097F, -0.1314F, -1.7344F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(21, 130).addBox(-0.003F, 0.4535F, -0.4249F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1314F, -1.7344F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(84, 14).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3792F, 0.0562F, -1.6339F, 0.6635F, 0.6776F, -0.855F));

		PartDefinition cube_r252 = neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(84, 14).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5792F, 0.0562F, -1.6339F, 0.6635F, -0.6776F, 0.855F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -2.9577F, -0.2956F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(116, 37).addBox(-0.003F, 0.0535F, -0.9249F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4333F, -1.3767F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 62).addBox(0.1F, -0.1F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1808F, -1.6284F, 0.7802F, 1.2207F, -0.6659F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(82, 10).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1808F, -1.6284F, 0.7802F, -1.2207F, 0.6659F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0451F, -3.9942F, 0.0767F, -0.1743F, 0.0094F));

		PartDefinition cube_r257 = neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-4.3F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8217F, -0.7814F, 0.6671F, 1.2408F, -0.8797F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 53).mirror().addBox(-4.1412F, -0.5698F, -0.9279F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6599F, 0.4658F, -2.1267F, 0.7635F, 1.2798F, -0.7689F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(87, 53).addBox(0.1412F, -0.5698F, -0.9279F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5401F, 0.4658F, -2.1267F, 0.7635F, -1.2798F, 0.7689F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(86, 12).addBox(0.3F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8217F, -0.7814F, 0.6671F, -1.2408F, 0.8797F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(41, 128).addBox(-0.003F, 0.6535F, 1.5751F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 128).addBox(-0.003F, 0.5535F, -0.4249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6124F, 0.119F, -2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(22, 79).addBox(0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.4012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 0.4829F, -3.8726F, 0.0471F, -0.2241F, 0.0174F));

		PartDefinition cube_r263 = neck4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(35, 126).addBox(0.0F, -0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1341F, -0.0041F, -0.4517F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(89, 70).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7311F, 1.3784F, -3.179F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(100, 85).mirror().addBox(-2.7877F, 0.171F, -0.253F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8468F, 0.9966F, -0.6467F, 0.5701F, 1.1694F, -0.9898F));

		PartDefinition cube_r266 = neck4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(100, 85).addBox(-0.2123F, 0.171F, -0.253F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5845F, 0.9966F, -0.6467F, 0.5701F, -1.1694F, 0.9898F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7311F, 0.4613F, -2.8101F, 0.0863F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck5.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 111).addBox(0.6F, -0.2094F, -1.593F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2988F, -0.1445F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck5.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(73, 89).addBox(0.1F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(73, 89).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(-1.9052F, 0.1351F, -0.4294F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0457F, 0.6449F, -0.6205F, 0.3316F, 1.1679F, -1.2384F));

		PartDefinition cube_r270 = neck5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(115, 21).addBox(-0.0948F, 0.1351F, -0.4294F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2458F, 0.6449F, -0.6205F, 0.3316F, -1.1679F, 1.2384F));

		PartDefinition head1 = neck5.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.4536F, -2.8297F, 0.7913F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(125, 3).addBox(-0.92F, -0.0196F, -0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.496F, -13.9414F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(114, 80).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.8094F, -7.5991F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(115, 33).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.9141F, -9.5964F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(114, 29).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.9315F, -11.5963F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(120, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.7665F, -12.5826F, -2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head1.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(84, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.3518F, -13.4926F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(120, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -1.4689F, -13.962F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(15, 66).addBox(-1.42F, -0.0465F, -4.0184F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -2.4771F, -2.5106F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(76, 51).addBox(-2.92F, -0.0034F, -0.7763F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, -1.639F, 0.3821F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 25).addBox(-2.92F, 0.0069F, 0.3975F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 5).addBox(-2.92F, 0.0069F, -0.0025F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.4053F, -1.5574F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(80, 20).addBox(-2.92F, 0.0069F, -0.0025F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5185F, -2.551F, -0.1134F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 2.7463F, 0.2422F, 0.2618F, 0.0083F, -0.0026F));

		PartDefinition cube_r282 = jaw1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(105, 13).mirror().addBox(-0.5F, -0.5238F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r283 = jaw1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-0.5F, -0.4213F, -4.4648F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(64, 86).mirror().addBox(-0.5F, 0.1787F, -4.4648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.1571F, -0.1309F, 0.0F));

		PartDefinition cube_r284 = jaw1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-0.5F, -0.7317F, -6.4245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(124, 119).mirror().addBox(-0.625F, -0.1567F, -6.6745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(125, 0).mirror().addBox(-0.625F, -0.1567F, -5.8745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r285 = jaw1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(123, 110).mirror().addBox(-0.5F, 1.5616F, -6.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.2618F, -0.1309F, 0.0F));

		PartDefinition cube_r286 = jaw1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(117, 123).mirror().addBox(-0.5F, 4.4373F, 0.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -1.7017F, -0.1309F, 0.0F));

		PartDefinition cube_r287 = jaw1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(122, 123).mirror().addBox(-0.5F, -1.6725F, 3.5145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 3.0543F, -0.1309F, 0.0F));

		PartDefinition cube_r288 = jaw1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.5F, -3.6469F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r289 = jaw1.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(5, 124).mirror().addBox(-0.5F, -0.1205F, -2.8428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 0.1745F, -0.1309F, 0.0F));

		PartDefinition cube_r290 = jaw1.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(61, 115).mirror().addBox(-0.5F, -0.0105F, -0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -1.1781F, -0.1309F, 0.0F));

		PartDefinition cube_r291 = jaw1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 124).mirror().addBox(-0.5F, -6.9791F, -2.932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(124, 52).mirror().addBox(-0.5F, -6.9791F, -2.632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 1.2479F, -0.1309F, 0.0F));

		PartDefinition cube_r292 = jaw1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(124, 12).mirror().addBox(-0.5F, -4.0994F, 6.3639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 2.6442F, -0.1309F, 0.0F));

		PartDefinition cube_r293 = jaw1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -0.7878F, -10.4179F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(124, 65).mirror().addBox(-0.5F, -1.3378F, -7.4179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.0785F, -0.1309F, 0.0F));

		PartDefinition cube_r294 = jaw1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(124, 21).mirror().addBox(-0.5F, 1.5328F, -9.8145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.3054F, -0.1309F, 0.0F));

		PartDefinition cube_r295 = jaw1.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(124, 24).mirror().addBox(-0.5F, -8.606F, -3.4458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 1.1606F, -0.1309F, 0.0F));

		PartDefinition cube_r296 = jaw1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(110, 75).mirror().addBox(-0.5F, 9.8813F, 1.0171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -1.8239F, -0.1309F, 0.0F));

		PartDefinition cube_r297 = jaw1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(124, 27).mirror().addBox(-0.5F, 2.6812F, -13.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.384F, -0.1309F, 0.0F));

		PartDefinition cube_r298 = jaw1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(124, 30).mirror().addBox(-0.5F, -2.1608F, -13.9522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(124, 116).mirror().addBox(-0.5F, -2.7975F, -14.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.0349F, -0.1309F, 0.0F));

		PartDefinition cube_r299 = jaw1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(124, 36).mirror().addBox(-0.5F, -12.9102F, -3.3994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 1.1868F, -0.1309F, 0.0F));

		PartDefinition cube_r300 = jaw1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(124, 39).mirror().addBox(-0.5F, -4.4283F, 10.6557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, 2.6704F, -0.1309F, 0.0F));

		PartDefinition cube_r301 = jaw1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.5F, 0.5135F, -11.9359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(124, 86).mirror().addBox(-0.5F, -0.3601F, -9.4469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.2094F, -0.1309F, 0.0F));

		PartDefinition cube_r302 = jaw1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(124, 78).mirror().addBox(-0.5F, -1.0915F, -8.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.1222F, -0.1309F, 0.0F));

		PartDefinition cube_r303 = jaw1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(115, 69).mirror().addBox(-0.5F, 0.1103F, -10.4107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 97).mirror().addBox(-0.5F, 0.3103F, -11.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.2531F, -0.1309F, 0.0F));

		PartDefinition cube_r304 = jaw1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(124, 113).mirror().addBox(-0.5F, 3.1972F, -11.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.5149F, -0.1309F, 0.0F));

		PartDefinition cube_r305 = jaw1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(115, 73).mirror().addBox(-0.5F, 0.4372F, -13.3544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.165F, 0.4949F, -0.1158F, -0.2967F, -0.1309F, 0.0F));

		PartDefinition cube_r306 = jaw1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(61, 115).addBox(-0.5F, -0.0105F, -0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -1.1781F, 0.1309F, 0.0F));

		PartDefinition cube_r307 = jaw1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 124).addBox(-0.5F, -0.1205F, -2.8428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 0.1745F, 0.1309F, 0.0F));

		PartDefinition cube_r308 = jaw1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 124).addBox(-0.5F, -3.6469F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r309 = jaw1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(122, 123).addBox(-0.5F, -1.6725F, 3.5145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 3.0543F, 0.1309F, 0.0F));

		PartDefinition cube_r310 = jaw1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(117, 123).addBox(-0.5F, 4.4373F, 0.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -1.7017F, 0.1309F, 0.0F));

		PartDefinition cube_r311 = jaw1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(124, 24).addBox(-0.5F, -8.606F, -3.4458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 1.1606F, 0.1309F, 0.0F));

		PartDefinition cube_r312 = jaw1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(124, 39).addBox(-0.5F, -4.4283F, 10.6557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 2.6704F, 0.1309F, 0.0F));

		PartDefinition cube_r313 = jaw1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(124, 36).addBox(-0.5F, -12.9102F, -3.3994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 1.1868F, 0.1309F, 0.0F));

		PartDefinition cube_r314 = jaw1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(124, 30).addBox(-0.5F, -2.1608F, -13.9522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(124, 116).addBox(-0.5F, -2.7975F, -14.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.0349F, 0.1309F, 0.0F));

		PartDefinition cube_r315 = jaw1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(124, 27).addBox(-0.5F, 2.6812F, -13.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.384F, 0.1309F, 0.0F));

		PartDefinition cube_r316 = jaw1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(110, 75).addBox(-0.5F, 9.8813F, 1.0171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -1.8239F, 0.1309F, 0.0F));

		PartDefinition cube_r317 = jaw1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(124, 21).addBox(-0.5F, 1.5328F, -9.8145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.3054F, 0.1309F, 0.0F));

		PartDefinition cube_r318 = jaw1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(124, 12).addBox(-0.5F, -4.0994F, 6.3639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 2.6442F, 0.1309F, 0.0F));

		PartDefinition cube_r319 = jaw1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(124, 52).addBox(-0.5F, -6.9791F, -2.632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(10, 124).addBox(-0.5F, -6.9791F, -2.932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 1.2479F, 0.1309F, 0.0F));

		PartDefinition cube_r320 = jaw1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(123, 110).addBox(-0.5F, 1.5616F, -6.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.2618F, 0.1309F, 0.0F));

		PartDefinition cube_r321 = jaw1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, 0.5135F, -11.9359F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(124, 86).addBox(-0.5F, -0.3601F, -9.4469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.2094F, 0.1309F, 0.0F));

		PartDefinition cube_r322 = jaw1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(115, 73).addBox(-0.5F, 0.4372F, -13.3544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.2967F, 0.1309F, 0.0F));

		PartDefinition cube_r323 = jaw1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(124, 113).addBox(-0.5F, 3.1972F, -11.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.5149F, 0.1309F, 0.0F));

		PartDefinition cube_r324 = jaw1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(124, 97).addBox(-0.5F, 0.3103F, -11.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(115, 69).addBox(-0.5F, 0.1103F, -10.4107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.2531F, 0.1309F, 0.0F));

		PartDefinition cube_r325 = jaw1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(124, 78).addBox(-0.5F, -1.0915F, -8.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.1222F, 0.1309F, 0.0F));

		PartDefinition cube_r326 = jaw1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(124, 65).addBox(-0.5F, -1.3378F, -7.4179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 79).addBox(-0.5F, -0.7878F, -10.4179F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.0785F, 0.1309F, 0.0F));

		PartDefinition cube_r327 = jaw1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(125, 0).addBox(-0.375F, -0.1567F, -5.8745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(124, 119).addBox(-0.375F, -0.1567F, -6.6745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 88).addBox(-0.5F, -0.7317F, -6.4245F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.0873F, 0.1309F, 0.0F));

		PartDefinition cube_r328 = jaw1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(64, 86).addBox(-0.5F, 0.1787F, -4.4648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F))
				.texOffs(72, 56).addBox(-0.5F, -0.4213F, -4.4648F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -0.1571F, 0.1309F, 0.0F));

		PartDefinition cube_r329 = jaw1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(105, 13).addBox(-0.5F, -0.5238F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 0.0873F, 0.1309F, 0.0F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.846F, -0.2862F, -5.9806F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(13, 120).addBox(-0.5F, -1.45F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.279F, -2.5245F, 6.0166F, 1.0623F, 0.2084F, -0.0181F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(8, 120).addBox(-0.5F, -1.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 97).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.279F, -2.5245F, 6.0166F, 1.455F, 0.2084F, -0.0181F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(101, 120).addBox(-0.5F, -0.454F, 0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.134F, -2.4689F, 4.9345F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(22, 74).addBox(-0.5F, -1.0923F, -0.8197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.134F, -2.4689F, 4.9345F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(18, 120).addBox(-0.5F, -1.227F, -1.247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -0.5417F, 0.1396F, -0.0219F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(107, 8).addBox(-0.5F, 0.0652F, -0.687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -1.7198F, 0.1396F, -0.0219F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(69, 120).addBox(-0.5F, 0.9454F, -0.9484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -0.498F, 0.1396F, -0.0219F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(120, 49).addBox(-0.5F, -0.2246F, 0.785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -1.6325F, 0.1396F, -0.0219F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(120, 33).addBox(-0.5F, -1.7968F, -0.9112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -3.0288F, 0.1396F, -0.0219F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(91, 113).addBox(-0.5F, -1.9777F, -1.32F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -2.7146F, 0.1396F, -0.0219F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(100, 25).addBox(-0.5F, -0.8514F, -1.3258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -3.1073F, 0.1396F, -0.0219F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(101, 112).addBox(-0.5F, -0.2503F, -0.1253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, 2.3905F, 0.1396F, -0.0219F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(119, 41).addBox(-0.5F, 0.7157F, -0.8936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, -2.9328F, 0.1396F, -0.0219F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(41, 113).addBox(-0.5F, -1.7735F, 0.096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.904F, -0.726F, 4.3555F, 2.7832F, 0.1396F, -0.0219F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(70, 128).addBox(-0.4978F, -0.8545F, -1.4778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, 1.5533F, 0.1745F, 0.0349F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(26, 128).addBox(-0.4978F, -1.3666F, -1.427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, 1.9024F, 0.1745F, 0.0349F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(127, 122).addBox(-0.4978F, -1.1132F, -0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, 2.9932F, 0.1745F, 0.0349F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(21, 127).addBox(-0.4978F, -1.1752F, -0.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, 2.4696F, 0.1745F, 0.0349F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(128, 55).addBox(-0.4978F, -0.422F, -0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, 0.9425F, 0.1745F, 0.0349F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(128, 42).addBox(-0.4978F, -1.5173F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -0.2356F, 0.1745F, 0.0349F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(10, 127).addBox(-0.4978F, -0.0645F, -1.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -1.7628F, 0.1745F, 0.0349F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(128, 61).addBox(-0.4978F, -0.0409F, -0.6112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -1.8937F, 0.1745F, 0.0349F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(128, 58).addBox(-0.4978F, -0.7789F, -1.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -1.2828F, 0.1745F, 0.0349F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(127, 9).addBox(-0.4978F, -1.683F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -0.4974F, 0.1745F, 0.0349F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 72).addBox(-0.6228F, 0.2055F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(98, 5).addBox(-0.3978F, 0.2055F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.586F, -1.0509F, 1.9109F, -2.9409F, 0.1745F, 0.0349F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(129, 15).addBox(-0.7481F, -2.2617F, -2.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.7048F, 0.1367F, 0.0019F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(87, 48).addBox(-0.6377F, 0.4013F, 4.2375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F))
				.texOffs(128, 103).addBox(-0.6377F, 0.8013F, 4.6375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.919F, 0.1222F, -0.0529F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(97, 123).addBox(-0.6377F, -6.0772F, 1.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.8807F, 0.1222F, -0.0529F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(101, 128).addBox(-0.6377F, -2.7735F, -6.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.3971F, 0.1222F, -0.0529F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(128, 89).addBox(-0.6377F, 5.8797F, -3.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -1.1038F, 0.1222F, -0.0529F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(128, 81).addBox(-0.6377F, 4.5324F, 4.8213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.2819F, 0.1222F, -0.0529F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(128, 74).addBox(-0.6377F, -0.3285F, 6.9338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 71).addBox(-0.6377F, -0.3285F, 6.4338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.9801F, 0.1222F, -0.0529F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(14, 107).addBox(-0.6377F, -0.9062F, 5.3973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -3.0673F, 0.1222F, -0.0529F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(129, 84).addBox(-0.6377F, -5.8416F, -0.1695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7759F, 0.1222F, -0.0529F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(129, 36).addBox(-0.6377F, -3.7167F, -4.3124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.816F, 0.1222F, -0.0529F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(125, 47).addBox(-0.5607F, -3.6792F, -3.2718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 33).addBox(-0.5607F, -3.6792F, -3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.7999F, 0.1414F, -0.0757F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(103, 76).addBox(-0.6504F, -1.662F, -5.3312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.2011F, 0.1214F, -0.0188F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(92, 40).addBox(-0.3991F, -0.6118F, 0.3115F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2627F, -1.9331F, 1.9252F, 0.1772F, -0.3407F, -0.7438F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(33, 79).addBox(-0.2634F, -0.5F, -3.0547F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3395F, -1.7774F, -0.9311F, -0.0066F, 0.4426F, -0.958F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(92, 36).addBox(-1.4162F, -0.5F, -0.0024F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3395F, -1.7774F, -0.9311F, -0.0073F, 0.6172F, -0.9594F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(78, 77).addBox(-1.0093F, -3.9704F, -3.5011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1835F, 1.7538F, 2.7897F, -1.2147F, 0.1555F, -0.022F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(78, 71).addBox(-1.0093F, -2.9979F, -3.7095F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1835F, 1.7538F, 2.7897F, -1.2845F, 0.1555F, -0.022F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(11, 74).addBox(-1.0093F, -2.0157F, -3.8847F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1835F, 1.7538F, 2.7897F, -1.3718F, 0.1555F, -0.022F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0093F, -1.0221F, -4.0094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1835F, 1.7538F, 2.7897F, -1.494F, 0.1555F, -0.022F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(67, 71).addBox(-0.45F, -1.575F, -2.225F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4077F, -1.2368F, 1.5513F, 0.2625F, 0.1356F, 0.0547F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(66, 79).addBox(-0.5F, -1.575F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4588F, 0.0818F, 1.692F, -0.185F, 0.1555F, -0.022F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(20, 85).addBox(-1.02F, -0.0965F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7691F, -1.2755F, 0.5043F, 0.1903F, 0.1555F, -0.022F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(55, 95).addBox(-0.847F, 0.0298F, -2.2823F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7011F, 0.1222F, -0.035F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(89, 94).addBox(-0.847F, -1.7073F, -2.2838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.832F, 0.1222F, -0.035F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(75, 83).addBox(-0.8496F, 0.0758F, 0.6081F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.8892F, 0.1221F, -0.0359F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 67).addBox(-0.8496F, 0.2312F, 3.5141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.8456F, 0.1221F, -0.0359F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(121, 101).addBox(-0.8496F, -6.2987F, 1.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.9541F, 0.1221F, -0.0359F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(123, 107).addBox(-0.8496F, -3.756F, -6.7336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.5578F, 0.1221F, -0.0359F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 127).addBox(-0.8496F, 4.7836F, -6.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -0.6203F, 0.1221F, -0.0359F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(93, 0).addBox(-0.8496F, 2.3494F, -0.5509F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -1.3621F, 0.1221F, -0.0359F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(123, 104).addBox(-0.8496F, 7.2578F, 1.0608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -1.5017F, 0.1221F, -0.0359F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(49, 105).addBox(-0.8496F, -1.0958F, 5.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -2.9416F, 0.1221F, -0.0359F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(112, 53).addBox(-0.8496F, -6.3919F, 1.2615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 2.1635F, 0.1221F, -0.0359F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(103, 45).addBox(-0.8496F, -5.075F, -4.0856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.2908F, 0.1221F, -0.0359F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(42, 103).addBox(-0.8496F, -4.8354F, -3.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.5003F, 0.1221F, -0.0359F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 127).addBox(-0.8496F, 0.4328F, -2.955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7708F, 0.1221F, -0.0359F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(105, 99).addBox(-0.8496F, -0.7407F, -3.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 87).addBox(-0.8496F, -1.7407F, -3.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.8406F, 0.1221F, -0.0359F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(72, 105).addBox(-0.8496F, -2.6409F, -3.3117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.797F, 0.1221F, -0.0359F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(105, 66).addBox(-0.8496F, -3.4316F, -3.5808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7097F, 0.1221F, -0.0359F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(79, 106).addBox(-0.8496F, -8.4558F, -2.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7533F, 0.1221F, -0.0359F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(63, 106).addBox(-0.8496F, -7.532F, -0.7943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.9715F, 0.1221F, -0.0359F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(103, 72).addBox(-0.8496F, -6.2125F, -3.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 61).addBox(-0.8496F, -5.2125F, -3.7178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.6224F, 0.1221F, -0.0359F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(56, 105).addBox(-0.8496F, -4.3433F, -3.6781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.6748F, 0.1221F, -0.0359F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 103).addBox(-0.8496F, -4.0953F, -2.8028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.5875F, 0.1221F, -0.0359F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(102, 30).addBox(-0.847F, -3.2378F, -2.6373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.64F, 0.1222F, -0.035F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(101, 57).addBox(-0.847F, -2.4163F, -2.4748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7098F, 0.1222F, -0.035F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(92, 67).addBox(-0.7481F, -2.9011F, -2.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.0364F, 0.1367F, 0.0019F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(129, 39).addBox(-0.7481F, -3.0249F, -0.8445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.6909F, 0.1367F, 0.0019F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(129, 77).addBox(-0.7481F, -2.4011F, -1.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.56F, 0.1367F, 0.0019F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(129, 64).addBox(-0.7481F, 0.2314F, -0.7944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.0328F, 0.1367F, 0.0019F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(120, 0).addBox(-0.7481F, -2.4031F, -0.4888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.7345F, 0.1367F, 0.0019F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(129, 50).addBox(-0.7481F, -1.3716F, -1.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.4291F, 0.1367F, 0.0019F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(125, 126).addBox(-0.7481F, -1.6281F, -2.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 0.347F, 0.1367F, 0.0019F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(120, 126).addBox(-0.7481F, -1.2363F, 0.5757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 1.8741F, 0.1367F, 0.0019F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(115, 126).addBox(-0.7481F, -0.2282F, 0.3939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, 2.5286F, 0.1367F, 0.0019F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(126, 100).addBox(-0.7481F, -0.1479F, -0.1573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -3.1F, 0.1367F, 0.0019F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(119, 37).addBox(-0.5F, -1.8432F, -0.4071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.109F, -0.6546F, 5.9498F, 0.166F, 0.1219F, -0.0354F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(111, 115).addBox(-0.5F, -1.9331F, -0.5779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.109F, -0.6546F, 5.9498F, -2.6091F, 0.1219F, -0.0354F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(125, 6).addBox(-0.7481F, -1.1184F, -0.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5602F, -0.454F, 0.2539F, -3.0651F, 0.1367F, 0.0019F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -0.2862F, -5.9806F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(13, 120).mirror().addBox(-0.5F, -1.45F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.279F, -2.5245F, 6.0166F, 1.0623F, -0.2084F, 0.0181F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(8, 120).mirror().addBox(-0.5F, -1.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(129, 97).mirror().addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.279F, -2.5245F, 6.0166F, 1.455F, -0.2084F, 0.0181F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(101, 120).mirror().addBox(-0.5F, -0.454F, 0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.134F, -2.4689F, 4.9345F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(22, 74).mirror().addBox(-0.5F, -1.0923F, -0.8197F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.134F, -2.4689F, 4.9345F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(18, 120).mirror().addBox(-0.5F, -1.227F, -1.247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -0.5417F, -0.1396F, 0.0219F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(107, 8).mirror().addBox(-0.5F, 0.0652F, -0.687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -1.7198F, -0.1396F, 0.0219F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(69, 120).mirror().addBox(-0.5F, 0.9454F, -0.9484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -0.498F, -0.1396F, 0.0219F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(120, 49).mirror().addBox(-0.5F, -0.2246F, 0.785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -1.6325F, -0.1396F, 0.0219F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(-0.5F, -1.7968F, -0.9112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -3.0288F, -0.1396F, 0.0219F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(91, 113).mirror().addBox(-0.5F, -1.9777F, -1.32F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -2.7146F, -0.1396F, 0.0219F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(100, 25).mirror().addBox(-0.5F, -0.8514F, -1.3258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -3.1073F, -0.1396F, 0.0219F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(101, 112).mirror().addBox(-0.5F, -0.2503F, -0.1253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, 2.3905F, -0.1396F, 0.0219F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(119, 41).mirror().addBox(-0.5F, 0.7157F, -0.8936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, -2.9328F, -0.1396F, 0.0219F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(41, 113).mirror().addBox(-0.5F, -1.7735F, 0.096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.726F, 4.3555F, 2.7832F, -0.1396F, 0.0219F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(70, 128).mirror().addBox(-0.5022F, -0.8545F, -1.4778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, 1.5533F, -0.1745F, -0.0349F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(-0.5022F, -1.3666F, -1.427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, 1.9024F, -0.1745F, -0.0349F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(127, 122).mirror().addBox(-0.5022F, -1.1132F, -0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, 2.9932F, -0.1745F, -0.0349F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(21, 127).mirror().addBox(-0.5022F, -1.1752F, -0.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, 2.4696F, -0.1745F, -0.0349F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(128, 55).mirror().addBox(-0.5022F, -0.422F, -0.2007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, 0.9425F, -0.1745F, -0.0349F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(128, 42).mirror().addBox(-0.5022F, -1.5173F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -0.2356F, -0.1745F, -0.0349F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-0.5022F, -0.0645F, -1.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -1.7628F, -0.1745F, -0.0349F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-0.5022F, -0.0409F, -0.6112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -1.8937F, -0.1745F, -0.0349F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(128, 58).mirror().addBox(-0.5022F, -0.7789F, -1.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -1.2828F, -0.1745F, -0.0349F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(127, 9).mirror().addBox(-0.5022F, -1.683F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -0.4974F, -0.1745F, -0.0349F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-0.3772F, 0.2055F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(98, 5).mirror().addBox(-0.6022F, 0.2055F, -0.7184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.586F, -1.0509F, 1.9109F, -2.9409F, -0.1745F, -0.0349F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(129, 15).mirror().addBox(-0.2519F, -2.2617F, -2.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.7048F, -0.1367F, -0.0019F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-0.3623F, 0.4013F, 4.2375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(128, 103).mirror().addBox(-0.3623F, 0.8013F, 4.6375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.919F, -0.1222F, 0.0529F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(97, 123).mirror().addBox(-0.3623F, -6.0772F, 1.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.8807F, -0.1222F, 0.0529F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(101, 128).mirror().addBox(-0.3623F, -2.7735F, -6.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.3971F, -0.1222F, 0.0529F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(128, 89).mirror().addBox(-0.3623F, 5.8797F, -3.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -1.1038F, -0.1222F, 0.0529F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-0.3623F, 4.5324F, 4.8213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.2819F, -0.1222F, 0.0529F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(128, 74).mirror().addBox(-0.3623F, -0.3285F, 6.9338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 71).mirror().addBox(-0.3623F, -0.3285F, 6.4338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.9801F, -0.1222F, 0.0529F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(14, 107).mirror().addBox(-0.3623F, -0.9062F, 5.3973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -3.0673F, -0.1222F, 0.0529F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(129, 84).mirror().addBox(-0.3623F, -5.8416F, -0.1695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7759F, -0.1222F, 0.0529F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(129, 36).mirror().addBox(-0.3623F, -3.7167F, -4.3124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.816F, -0.1222F, 0.0529F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(125, 47).mirror().addBox(-0.4393F, -3.6792F, -3.2718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 33).mirror().addBox(-0.4393F, -3.6792F, -3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.7999F, -0.1414F, 0.0757F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(103, 76).mirror().addBox(-0.3496F, -1.662F, -5.3312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.2011F, -0.1214F, 0.0188F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-1.6009F, -0.6118F, 0.3115F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2627F, -1.9331F, 1.9252F, 0.1772F, 0.3407F, 0.7438F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(33, 79).mirror().addBox(-0.7366F, -0.5F, -3.0547F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.3395F, -1.7774F, -0.9311F, -0.0066F, -0.4426F, 0.958F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-0.5838F, -0.5F, -0.0024F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3395F, -1.7774F, -0.9311F, -0.0073F, -0.6172F, 0.9594F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(0.0093F, -3.9704F, -3.5011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1835F, 1.7538F, 2.7897F, -1.2147F, -0.1555F, 0.022F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(0.0093F, -2.9979F, -3.7095F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1835F, 1.7538F, 2.7897F, -1.2845F, -0.1555F, 0.022F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(11, 74).mirror().addBox(0.0093F, -2.0157F, -3.8847F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1835F, 1.7538F, 2.7897F, -1.3718F, -0.1555F, 0.022F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(0.0093F, -1.0221F, -4.0094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1835F, 1.7538F, 2.7897F, -1.494F, -0.1555F, 0.022F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.55F, -1.575F, -2.225F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4077F, -1.2368F, 1.5513F, 0.2625F, -0.1356F, -0.0547F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(66, 79).mirror().addBox(-0.5F, -1.575F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4588F, 0.0818F, 1.692F, -0.185F, -0.1555F, 0.022F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(0.02F, -0.0965F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7691F, -1.2755F, 0.5043F, 0.1903F, -0.1555F, 0.022F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.153F, 0.0298F, -2.2823F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7011F, -0.1222F, 0.035F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-0.153F, -1.7073F, -2.2838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.832F, -0.1222F, 0.035F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.1504F, 0.0758F, 0.6081F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.8892F, -0.1221F, 0.0359F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(98, 67).mirror().addBox(-0.1504F, 0.2312F, 3.5141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.8456F, -0.1221F, 0.0359F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(121, 101).mirror().addBox(-0.1504F, -6.2987F, 1.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.9541F, -0.1221F, 0.0359F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(123, 107).mirror().addBox(-0.1504F, -3.756F, -6.7336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.5578F, -0.1221F, 0.0359F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.1504F, 4.7836F, -6.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -0.6203F, -0.1221F, 0.0359F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.1504F, 2.3494F, -0.5509F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -1.3621F, -0.1221F, 0.0359F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(123, 104).mirror().addBox(-0.1504F, 7.2578F, 1.0608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -1.5017F, -0.1221F, 0.0359F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(49, 105).mirror().addBox(-0.1504F, -1.0958F, 5.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -2.9416F, -0.1221F, 0.0359F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(112, 53).mirror().addBox(-0.1504F, -6.3919F, 1.2615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 2.1635F, -0.1221F, 0.0359F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-0.1504F, -5.075F, -4.0856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.2908F, -0.1221F, 0.0359F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(42, 103).mirror().addBox(-0.1504F, -4.8354F, -3.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.5003F, -0.1221F, 0.0359F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(-0.1504F, 0.4328F, -2.955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7708F, -0.1221F, 0.0359F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(105, 99).mirror().addBox(-0.1504F, -0.7407F, -3.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 87).mirror().addBox(-0.1504F, -1.7407F, -3.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.8406F, -0.1221F, 0.0359F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(72, 105).mirror().addBox(-0.1504F, -2.6409F, -3.3117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.797F, -0.1221F, 0.0359F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(105, 66).mirror().addBox(-0.1504F, -3.4316F, -3.5808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7097F, -0.1221F, 0.0359F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(79, 106).mirror().addBox(-0.1504F, -8.4558F, -2.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7533F, -0.1221F, 0.0359F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(63, 106).mirror().addBox(-0.1504F, -7.532F, -0.7943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.9715F, -0.1221F, 0.0359F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-0.1504F, -6.2125F, -3.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 61).mirror().addBox(-0.1504F, -5.2125F, -3.7178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.6224F, -0.1221F, 0.0359F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(56, 105).mirror().addBox(-0.1504F, -4.3433F, -3.6781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.6748F, -0.1221F, 0.0359F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.1504F, -4.0953F, -2.8028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.5875F, -0.1221F, 0.0359F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(-0.153F, -3.2378F, -2.6373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.64F, -0.1222F, 0.035F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(101, 57).mirror().addBox(-0.153F, -2.4163F, -2.4748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7098F, -0.1222F, 0.035F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(92, 67).mirror().addBox(-0.2519F, -2.9011F, -2.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.0364F, -0.1367F, -0.0019F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(129, 39).mirror().addBox(-0.2519F, -3.0249F, -0.8445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.6909F, -0.1367F, -0.0019F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-0.2519F, -2.4011F, -1.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.56F, -0.1367F, -0.0019F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(129, 64).mirror().addBox(-0.2519F, 0.2314F, -0.7944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.0328F, -0.1367F, -0.0019F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.2519F, -2.4031F, -0.4888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.7345F, -0.1367F, -0.0019F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(129, 50).mirror().addBox(-0.2519F, -1.3716F, -1.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.4291F, -0.1367F, -0.0019F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(125, 126).mirror().addBox(-0.2519F, -1.6281F, -2.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 0.347F, -0.1367F, -0.0019F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(120, 126).mirror().addBox(-0.2519F, -1.2363F, 0.5757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 1.8741F, -0.1367F, -0.0019F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(115, 126).mirror().addBox(-0.2519F, -0.2282F, 0.3939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, 2.5286F, -0.1367F, -0.0019F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(126, 100).mirror().addBox(-0.2519F, -0.1479F, -0.1573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -3.1F, -0.1367F, -0.0019F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(119, 37).mirror().addBox(-0.5F, -1.8432F, -0.4071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.109F, -0.6546F, 5.9498F, 0.166F, -0.1219F, 0.0354F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(111, 115).mirror().addBox(-0.5F, -1.9331F, -0.5779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.109F, -0.6546F, 5.9498F, -2.6091F, -0.1219F, 0.0354F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.2519F, -1.1184F, -0.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5602F, -0.454F, 0.2539F, -3.0651F, -0.1367F, -0.0019F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(0, 116).addBox(-0.3F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.393F, 5.5624F, -2.2635F, -0.1147F, 0.4724F, 0.1166F));

		PartDefinition cube_r498 = upperarm2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(113, 111).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 5.8669F, 3.1781F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r499 = upperarm2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(113, 107).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.8669F, 3.1781F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r500 = upperarm2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(109, 29).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 3.6375F, 1.1707F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r501 = upperarm2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(119, 115).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r502 = upperarm2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(129, 21).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 3.0324F, 1.1079F, 0.6507F, -0.0209F, 0.0138F));

		PartDefinition cube_r503 = upperarm2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(13, 116).addBox(-0.5F, -1.025F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 1.9188F, 0.2503F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r504 = upperarm2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(8, 116).addBox(-0.5F, -0.425F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.093F, 0.1356F, -0.5082F, -0.0181F, 0.0045F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(103, 93).addBox(-0.4F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3275F, 6.7637F, 5.1003F, 0.349F, 0.922F, 0.1903F));

		PartDefinition cube_r505 = lowerarm2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(32, 90).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r506 = lowerarm2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(38, 85).addBox(-0.5132F, -0.3632F, -0.9638F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.111F, 0.0199F, 0.0047F));

		PartDefinition cube_r507 = lowerarm2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(39, 73).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.4005F, 0.1002F, -0.0848F, 0.0181F, 0.0093F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(79, 101).addBox(-0.8736F, -0.2769F, -1.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.1821F, 10.0057F, -1.1202F, 0.1207F, -0.1358F, -0.9464F));

		PartDefinition hand2 = hand4.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r508 = hand2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(7, 102).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create().texOffs(106, 118).addBox(-0.7F, -0.0851F, 0.1686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.1931F, 5.5624F, -2.2635F, -0.6983F, -0.547F, 0.3595F));

		PartDefinition cube_r509 = upperarm3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(115, 17).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 5.8669F, 3.1781F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r510 = upperarm3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(106, 114).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.8669F, 3.1781F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r511 = upperarm3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(70, 109).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 3.6375F, 1.1707F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r512 = upperarm3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(119, 119).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.8885F, 0.4283F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r513 = upperarm3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(129, 29).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 3.0324F, 1.1079F, 0.6507F, 0.0209F, -0.0138F));

		PartDefinition cube_r514 = upperarm3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(118, 111).addBox(-0.5F, -1.025F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 1.9188F, 0.2503F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r515 = upperarm3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(118, 107).addBox(-0.5F, -0.425F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.093F, 0.1356F, -0.5082F, 0.0181F, -0.0045F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create().texOffs(91, 104).addBox(-0.6F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3275F, 6.7637F, 5.1003F, 0.349F, -0.922F, -0.1903F));

		PartDefinition cube_r516 = lowerarm3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(64, 91).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r517 = lowerarm3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(43, 85).addBox(-0.4868F, -0.3632F, -0.9638F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.111F, -0.0199F, -0.0047F));

		PartDefinition cube_r518 = lowerarm3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(103, 49).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.4005F, 0.1002F, -0.0848F, -0.0181F, -0.0093F));

		PartDefinition hand3 = lowerarm3.addOrReplaceChild("hand3", CubeListBuilder.create().texOffs(14, 102).addBox(-0.1264F, -0.2769F, -1.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.1821F, 10.0057F, -1.1202F, 0.1207F, 0.1358F, 0.9464F));

		PartDefinition hand5 = hand3.addOrReplaceChild("hand5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r519 = hand5.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(21, 102).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5638F, 2.7758F, -1.7741F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r520 = bone.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(84, 83).addBox(-1.0F, -1.95F, 0.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(-0.049F, -3.5642F, 1.1837F, -3.0539F, 0.3013F, -0.1823F));

		PartDefinition cube_r521 = bone.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(0, 85).addBox(-1.0F, -0.7F, -0.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(0.0231F, -3.1694F, 1.1817F, -0.8722F, 0.3013F, -0.1823F));

		PartDefinition cube_r522 = bone.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(84, 30).addBox(-1.0F, -2.525F, -1.65F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2998F, -2.9508F, 0.0323F, -2.0067F, 0.3013F, -0.1823F));

		PartDefinition cube_r523 = bone.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(83, 56).addBox(-0.982F, -0.4763F, 0.2744F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, 0.6203F, 0.4246F, 0.3085F));

		PartDefinition cube_r524 = bone.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(72, 43).addBox(-0.982F, 0.1297F, -1.9623F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, 1.5803F, 0.4246F, 0.3085F));

		PartDefinition cube_r525 = bone.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(83, 36).addBox(-0.982F, -1.7077F, -1.7977F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, 1.3272F, 0.4246F, 0.3085F));

		PartDefinition cube_r526 = bone.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(90, 62).addBox(-0.982F, -1.8373F, -2.2422F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, 0.8036F, 0.4246F, 0.3085F));

		PartDefinition cube_r527 = bone.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(83, 42).addBox(-0.982F, -1.3496F, -1.9693F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, -0.5491F, 0.4246F, 0.3085F));

		PartDefinition cube_r528 = bone.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(72, 36).addBox(-0.982F, -1.6348F, -1.3179F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(-0.5847F, 3.0915F, -1.5718F, -0.1913F, 0.4246F, 0.3085F));

		PartDefinition cube_r529 = bone.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(55, 56).addBox(-1.0003F, -0.8856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0537F, 0.4813F, -0.8526F, 1.2135F, 0.3013F, -0.1823F));

		PartDefinition cube_r530 = bone.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(38, 56).addBox(-1.0003F, -0.9856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.394F)), PartPose.offsetAndRotation(0.0537F, 0.4813F, -0.8526F, 1.3007F, 0.3013F, -0.1823F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3638F, 2.7758F, -1.7741F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r531 = bone3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-1.0F, -1.95F, 0.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(0.049F, -3.5642F, 1.1837F, -3.0539F, -0.3013F, 0.1823F));

		PartDefinition cube_r532 = bone3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-1.0F, -0.7F, -0.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(-0.0231F, -3.1694F, 1.1817F, -0.8722F, -0.3013F, 0.1823F));

		PartDefinition cube_r533 = bone3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-1.0F, -2.525F, -1.65F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2998F, -2.9508F, 0.0323F, -2.0067F, -0.3013F, 0.1823F));

		PartDefinition cube_r534 = bone3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-1.018F, -0.4763F, 0.2744F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, 0.6203F, -0.4246F, -0.3085F));

		PartDefinition cube_r535 = bone3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-1.018F, 0.1297F, -1.9623F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, 1.5803F, -0.4246F, -0.3085F));

		PartDefinition cube_r536 = bone3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(83, 36).mirror().addBox(-1.018F, -1.7077F, -1.7977F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, 1.3272F, -0.4246F, -0.3085F));

		PartDefinition cube_r537 = bone3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-1.018F, -1.8373F, -2.2422F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, 0.8036F, -0.4246F, -0.3085F));

		PartDefinition cube_r538 = bone3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-1.018F, -1.3496F, -1.9693F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, -0.5491F, -0.4246F, -0.3085F));

		PartDefinition cube_r539 = bone3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-1.018F, -1.6348F, -1.3179F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(0.5847F, 3.0915F, -1.5718F, -0.1913F, -0.4246F, -0.3085F));

		PartDefinition cube_r540 = bone3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-0.9997F, -0.8856F, -2.1899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.4813F, -0.8526F, 1.2135F, -0.3013F, 0.1823F));

		PartDefinition cube_r541 = bone3.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(38, 56).mirror().addBox(-0.9997F, -0.9856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.394F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.4813F, -0.8526F, 1.3007F, -0.3013F, 0.1823F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 57).addBox(-0.55F, -0.0521F, -0.0584F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.054F, 4.1231F, -0.3395F, 0.0823F, -0.029F));

		PartDefinition cube_r542 = tail1.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-1.8F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.9479F, 0.8415F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r543 = tail1.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(50, 8).addBox(-0.2F, 0.0F, 0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 0.9479F, 0.8415F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r544 = tail1.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(120, 16).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.053F, -1.4171F, 2.1786F, -0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail1.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(26, 122).addBox(-0.006F, -1.57F, -0.2086F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.044F, 0.1663F, 2.146F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail1.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(122, 4).addBox(-0.006F, -1.57F, -0.2086F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.044F, 0.1663F, 0.296F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r547 = tail1.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(133, 87).addBox(-0.003F, -0.5752F, -2.5164F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.044F, 0.1663F, 0.296F, -1.898F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail1.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(23, 122).addBox(0.0F, -5.0969F, -0.6198F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.044F, 0.1663F, 0.296F, -0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail1.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(120, 56).addBox(-0.006F, -5.0353F, -0.6437F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.044F, 0.1663F, 0.296F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail1.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(113, 101).addBox(0.6F, -3.826F, -0.4916F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, 0.0815F, 4.4817F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail1.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(75, 109).addBox(0.6F, 1.0736F, 1.2874F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, 2.1685F, 2.286F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(38, 36).addBox(-0.55F, -2.0101F, -0.116F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.9319F, 5.9558F, -0.0388F, 0.0434F, -0.0055F));

		PartDefinition cube_r552 = tail2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -1.0101F, 0.884F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r553 = tail2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(50, 0).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -1.0101F, 0.884F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r554 = tail2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(15, 124).addBox(0.6F, -3.1473F, -0.6802F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -1.8248F, 6.5822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r555 = tail2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(102, 123).addBox(0.6F, -2.9373F, -0.9783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -2.0248F, 4.8822F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r556 = tail2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(49, 115).addBox(0.6F, -4.2479F, 23.0171F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -2.9248F, -21.1178F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(69, 114).addBox(0.0F, 1.5778F, 1.695F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 23).addBox(0.0F, -0.0222F, -0.305F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, -0.2166F, 3.6976F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(72, 114).addBox(0.0F, -0.5222F, -0.905F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0427F, 2.1061F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(66, 110).addBox(0.6F, -3.4648F, 0.0708F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -1.8915F, -0.128F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 47).addBox(-0.55F, -0.5203F, -0.2717F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5021F, 7.9978F, 0.0675F, 0.175F, 0.0231F));

		PartDefinition cube_r560 = tail3.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(120, 72).addBox(0.6F, -2.625F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.4574F, 5.8026F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail3.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(92, 125).addBox(0.6F, -2.65F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.5426F, 3.732F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail3.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(125, 89).addBox(0.6F, -2.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.5571F, 1.8113F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail3.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(89, 125).addBox(0.6F, -3.15F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.3203F, -0.2467F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail3.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(67, 126).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.5857F, 6.4402F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail3.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(64, 126).addBox(0.0F, -1.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.8318F, 4.171F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail3.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(125, 59).addBox(0.0F, -0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.8321F, 1.7297F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.55F, -0.4332F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.067F, 7.6106F, 0.0267F, 0.2617F, 0.0331F));

		PartDefinition cube_r567 = tail4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(89, 130).addBox(0.6F, -1.8F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 130).addBox(0.6F, -1.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.523F, 8.1544F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(130, 0).addBox(0.6F, -2.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.4148F, 6.0477F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r569 = tail4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(80, 125).addBox(0.6F, -2.4F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 125).addBox(0.6F, -2.4F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.3331F, 1.0393F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r570 = tail4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(129, 112).addBox(0.6F, -2.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.3724F, 0.1402F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(98, 126).addBox(0.0F, -0.8F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.5846F, 10.0621F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r572 = tail4.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(95, 126).addBox(0.0F, 0.9F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 126).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.4788F, 4.9828F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r573 = tail4.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(129, 24).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.604F, 2.7932F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r574 = tail4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(83, 126).addBox(0.0F, 0.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.6526F, -1.1704F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.55F, -0.4332F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, 0.098F, -0.1749F, 0.014F));

		PartDefinition cube_r575 = tail5.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(92, 130).addBox(0.6F, -1.725F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 130).addBox(0.6F, -1.825F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 130).addBox(0.6F, -1.825F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 130).addBox(0.6F, -1.825F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 4).addBox(0.6F, -1.825F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.2331F, 0.1393F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r576 = tail5.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(27, 131).addBox(0.0F, 3.5F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 131).addBox(0.0F, 2.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 129).addBox(0.0F, 1.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 125).addBox(0.0F, 0.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 126).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.2521F, 1.6364F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(25, 0).addBox(-0.55F, -0.4331F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, 0.0884F, -0.3038F, 0.0068F));

		PartDefinition cube_r577 = tail6.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(6, 134).addBox(0.6F, -1.725F, 20.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 134).addBox(0.6F, -1.725F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 134).addBox(0.6F, -1.725F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 133).addBox(0.6F, -1.725F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 130).addBox(0.6F, -1.725F, 12.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 92).addBox(0.6F, -1.725F, 10.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.1962F, -10.7566F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r578 = tail6.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(134, 15).addBox(0.0F, 6.6F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 134).addBox(0.0F, 5.5F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.2891F, -9.2595F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(57, 36).addBox(-0.55F, -0.4332F, 0.0393F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0373F, 10.9716F, 0.1329F, -0.2146F, -0.0211F));

		PartDefinition cube_r579 = tail7.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(134, 12).addBox(0.6F, -1.725F, 26.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 134).addBox(0.6F, -1.725F, 24.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 134).addBox(0.6F, -1.725F, 22.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, -0.1589F, -21.7282F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 47).addBox(-0.55F, -0.4331F, 0.0393F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.001F, 5.9263F, 0.2047F, -0.2137F, -0.044F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(57, 44).addBox(-0.55F, -0.4332F, 0.0393F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0039F, 8.0025F, 0.1502F, -0.3887F, -0.0573F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 3.1722F, -0.7905F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r580 = upperleg1.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(44, 79).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r581 = upperleg1.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(109, 84).addBox(-1.0F, -1.225F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(72, 62).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.015F, 1.9381F, 0.8145F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r582 = upperleg1.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(107, 25).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.72F, -0.0936F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r583 = upperleg1.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(99, 61).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.414F, -0.7025F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r584 = upperleg1.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(101, 104).addBox(-1.0F, -1.7F, -1.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 7.5673F, -2.4935F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r585 = upperleg1.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(14, 97).addBox(-1.0F, -1.6F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.2747F, -3.5328F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r586 = upperleg1.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(93, 25).addBox(-1.0F, -2.0F, -0.525F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.6018F, -3.4262F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r587 = upperleg1.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(55, 85).addBox(-1.0F, -3.8F, -0.975F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 13.7738F, -4.3181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r588 = upperleg1.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(0, 98).addBox(-1.0F, -0.3736F, -0.0144F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.9914F, -4.7703F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r589 = upperleg1.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(98, 13).addBox(-1.0F, -0.0736F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2526F, -3.5639F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r590 = upperleg1.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(105, 21).addBox(-1.0F, -0.116F, 0.048F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.5428F, -2.6072F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r591 = upperleg1.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(21, 107).addBox(-1.0F, -4.066F, -3.1519F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7776F, -0.6639F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r592 = upperleg1.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(89, 89).addBox(-1.0F, -0.075F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.197F, -0.0355F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r593 = upperleg1.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(105, 17).addBox(-1.0F, 1.0305F, -1.9914F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7434F, 1.2137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create().texOffs(58, 100).addBox(-1.5F, 3.8328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(0, 91).addBox(-1.5F, 1.8328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(92, 57).addBox(-1.5F, 0.8328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(37, 94).addBox(0.9F, 0.8328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 11.8659F, -5.3286F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r594 = lowerleg1.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(8, 111).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 111).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 4.759F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r595 = lowerleg1.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(43, 107).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4F, 8.5594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r596 = lowerleg1.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(86, 106).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 8.5594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r597 = lowerleg1.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(61, 110).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 5.9714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r598 = lowerleg1.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(108, 109).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4F, 6.1708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r599 = lowerleg1.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(108, 103).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4F, 8.3328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r600 = lowerleg1.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(35, 100).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(-0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r601 = lowerleg1.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(82, 89).addBox(1.9F, 0.0F, 0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(89, 75).addBox(1.9F, 0.0F, 0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.4F, 7.0328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create().texOffs(45, 71).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 12.1324F, 0.6641F, -1.8853F, 0.0F, 0.0F));

		PartDefinition cube_r602 = feet1.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(108, 49).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r603 = feet1.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(30, 57).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.1309F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create().texOffs(45, 65).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9702F, 1.4153F, 1.5727F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.1722F, -0.7905F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r604 = upperleg2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(55, 79).addBox(-1.0F, -2.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2391F, 0.1485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r605 = upperleg2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(91, 110).addBox(-1.0F, -1.225F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(78, 110).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.015F, 1.9381F, 0.8145F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r606 = upperleg2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(108, 34).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.72F, -0.0936F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r607 = upperleg2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(91, 99).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.414F, -0.7025F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r608 = upperleg2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(105, 0).addBox(-1.0F, -1.7F, -1.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 7.5673F, -2.4935F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r609 = upperleg2.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(21, 97).addBox(-1.0F, -1.6F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.2747F, -3.5328F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r610 = upperleg2.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(93, 82).addBox(-1.0F, -2.0F, -0.525F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.6018F, -3.4262F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r611 = upperleg2.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(9, 87).addBox(-1.0F, -3.8F, -0.975F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 13.7738F, -4.3181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r612 = upperleg2.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0F, -0.3736F, -0.0144F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.9914F, -4.7703F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r613 = upperleg2.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(28, 99).addBox(-1.0F, -0.0736F, 0.0106F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2526F, -3.5639F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r614 = upperleg2.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(7, 107).addBox(-1.0F, -0.116F, 0.048F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.5428F, -2.6072F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r615 = upperleg2.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(107, 80).addBox(-1.0F, -4.066F, -3.1519F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7776F, -0.6639F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r616 = upperleg2.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(55, 90).addBox(-1.0F, -0.075F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.197F, -0.0355F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r617 = upperleg2.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(107, 4).addBox(-1.0F, 1.0305F, -1.9914F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7434F, 1.2137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(100, 80).addBox(-0.5F, 3.8328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(91, 16).addBox(-0.5F, 1.8328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(93, 31).addBox(-0.5F, 0.8328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(72, 94).addBox(-1.9F, 0.8328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 11.8659F, -5.3286F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r618 = lowerleg2.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(13, 111).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 111).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 4.759F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r619 = lowerleg2.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(108, 38).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4F, 8.5594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r620 = lowerleg2.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(38, 107).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 8.5594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r621 = lowerleg2.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(110, 70).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.4F, 5.9714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r622 = lowerleg2.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(110, 44).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4F, 6.1708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r623 = lowerleg2.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(48, 109).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4F, 8.3328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r624 = lowerleg2.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(51, 100).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(0.5F, 3.0199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r625 = lowerleg2.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(25, 90).addBox(-3.9F, 0.0F, 0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(18, 90).addBox(-3.9F, 0.0F, 0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 7.0328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(56, 71).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 12.1324F, 0.6641F, -1.4926F, 0.0F, 0.0F));

		PartDefinition cube_r626 = feet2.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(101, 108).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r627 = feet2.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(48, 85).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.1309F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(62, 65).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9702F, 1.4153F, 0.7001F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.311F, 5.167F, 0.0452F, 0.0F, -0.0087F, 0.0524F));

		PartDefinition cube_r628 = bone2.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -3.7348F, 2.5558F, -0.0351F, -0.0443F, -0.0542F));

		PartDefinition cube_r629 = bone2.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(66, 123).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, -4.8165F, 3.3558F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r630 = bone2.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(61, 123).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -3.7021F, 4.2265F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r631 = bone2.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(123, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -4.989F, 4.8129F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r632 = bone2.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(123, 44).addBox(-0.5F, -1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(37, 123).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -5.4099F, 3.4777F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r633 = bone2.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(32, 123).addBox(-0.5F, -1.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 83).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -5.2705F, 1.8838F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r634 = bone2.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(84, 123).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -5.1486F, 0.8913F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r635 = bone2.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(125, 94).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -3.9626F, 0.121F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r636 = bone2.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(128, 106).addBox(-0.5F, -0.4695F, -0.0348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.125F, -4.8067F, -1.759F, -2.5395F, -0.3491F, 0.0F));

		PartDefinition cube_r637 = bone2.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(128, 109).addBox(-0.5F, -0.9652F, -0.5305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.125F, -4.8067F, -1.759F, -1.0996F, -0.3491F, 0.0F));

		PartDefinition cube_r638 = bone2.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(125, 68).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -4.4713F, -0.8746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r639 = bone2.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(29, 85).addBox(-0.7086F, 1.0611F, 0.3356F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, -0.8029F, 0.0F, 0.2793F));

		PartDefinition cube_r640 = bone2.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(31, 105).addBox(-0.7086F, 1.2001F, -3.9748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.1134F, 0.0F, 0.2793F));

		PartDefinition cube_r641 = bone2.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(26, 118).addBox(-0.5638F, 2.9386F, -2.5184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.8587F, 0.0405F, 0.2745F));

		PartDefinition cube_r642 = bone2.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5638F, 4.9029F, -1.6559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.7714F, 0.0405F, 0.2745F));

		PartDefinition cube_r643 = bone2.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(108, 57).addBox(-0.1697F, 3.122F, -0.7339F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(112, 12).addBox(-0.1697F, 0.722F, 0.2661F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0017F, 2.5403F, 3.6062F, 0.6318F, 0.0405F, 0.0564F));

		PartDefinition cube_r644 = bone2.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(119, 79).addBox(-0.5638F, 6.5463F, -1.1863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.7016F, 0.0405F, 0.2745F));

		PartDefinition cube_r645 = bone2.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(108, 91).addBox(-0.1697F, -0.2839F, 0.1921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(31, 109).addBox(-0.1697F, -0.2839F, -0.3079F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0017F, 2.5403F, 3.6062F, 0.5445F, 0.0405F, 0.0564F));

		PartDefinition cube_r646 = bone2.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(86, 99).addBox(-0.5638F, 2.9297F, -1.8144F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.719F, 0.0405F, 0.2745F));

		PartDefinition cube_r647 = bone2.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(53, 109).addBox(-0.5638F, 2.9693F, -1.145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.6754F, 0.0405F, 0.2745F));

		PartDefinition cube_r648 = bone2.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(36, 119).addBox(-0.706F, 1.629F, -0.2343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 0.3595F, 0.0197F, 0.2782F));

		PartDefinition cube_r649 = bone2.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(48, 92).addBox(-0.7086F, 0.0207F, -1.0456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, -1.0559F, 0.0F, 0.2793F));

		PartDefinition cube_r650 = bone2.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(11, 80).addBox(-0.7086F, -0.5738F, -1.4462F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, -0.2269F, 0.0F, 0.2793F));

		PartDefinition cube_r651 = bone2.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(129, 18).addBox(-0.0957F, 5.3993F, 0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(123, 72).addBox(-0.0957F, 4.9993F, 0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.1017F, 1.4403F, -6.1938F, -0.4538F, 0.0F, -0.0175F));

		PartDefinition cube_r652 = bone2.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(129, 12).addBox(-0.0957F, 4.7918F, -3.2449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.1017F, 1.4403F, -6.1938F, 0.3316F, 0.0F, -0.0175F));

		PartDefinition cube_r653 = bone2.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(30, 65).addBox(-0.0957F, -0.2893F, -6.0565F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1017F, 1.4403F, -6.1938F, 1.3352F, 0.0F, -0.0175F));

		PartDefinition cube_r654 = bone2.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(123, 75).addBox(-0.7086F, -7.1384F, 3.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, 2.8362F, 0.0F, 0.2793F));

		PartDefinition cube_r655 = bone2.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(122, 9).addBox(-0.7086F, 2.6147F, 5.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, -2.0071F, 0.0F, 0.2793F));

		PartDefinition cube_r656 = bone2.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(96, 104).addBox(-0.7086F, 2.4097F, -2.0247F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0017F, -3.6597F, -0.0938F, -0.6981F, 0.0F, 0.2793F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.911F, 5.167F, 0.0452F, 0.0F, 0.0087F, -0.0524F));

		PartDefinition cube_r657 = bone4.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.7348F, 2.5558F, -0.0351F, 0.0443F, 0.0542F));

		PartDefinition cube_r658 = bone4.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(66, 123).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8165F, 3.3558F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r659 = bone4.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(61, 123).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.7021F, 4.2265F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r660 = bone4.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(123, 56).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.989F, 4.8129F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r661 = bone4.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(123, 44).mirror().addBox(-0.5F, -1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(37, 123).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -5.4099F, 3.4777F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r662 = bone4.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(32, 123).mirror().addBox(-0.5F, -1.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 83).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -5.2705F, 1.8838F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r663 = bone4.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(84, 123).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -5.1486F, 0.8913F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r664 = bone4.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(125, 94).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.9626F, 0.121F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r665 = bone4.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(128, 106).mirror().addBox(-0.5F, -0.4695F, -0.0348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.125F, -4.8067F, -1.759F, -2.5395F, 0.3491F, 0.0F));

		PartDefinition cube_r666 = bone4.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(128, 109).mirror().addBox(-0.5F, -0.9652F, -0.5305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.125F, -4.8067F, -1.759F, -1.0996F, 0.3491F, 0.0F));

		PartDefinition cube_r667 = bone4.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(125, 68).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.4713F, -0.8746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r668 = bone4.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(29, 85).mirror().addBox(-0.2914F, 1.0611F, 0.3356F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, -0.8029F, 0.0F, -0.2793F));

		PartDefinition cube_r669 = bone4.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(31, 105).mirror().addBox(-0.2914F, 1.2001F, -3.9748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.1134F, 0.0F, -0.2793F));

		PartDefinition cube_r670 = bone4.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(26, 118).mirror().addBox(-0.4362F, 2.9386F, -2.5184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.8587F, -0.0405F, -0.2745F));

		PartDefinition cube_r671 = bone4.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.4362F, 4.9029F, -1.6559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.7714F, -0.0405F, -0.2745F));

		PartDefinition cube_r672 = bone4.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(108, 57).mirror().addBox(-0.8303F, 3.122F, -0.7339F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(112, 12).mirror().addBox(-0.8303F, 0.722F, 0.2661F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0017F, 2.5403F, 3.6062F, 0.6318F, -0.0405F, -0.0564F));

		PartDefinition cube_r673 = bone4.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(119, 79).mirror().addBox(-0.4362F, 6.5463F, -1.1863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.7016F, -0.0405F, -0.2745F));

		PartDefinition cube_r674 = bone4.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-0.8303F, -0.2839F, 0.1921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(31, 109).mirror().addBox(-0.8303F, -0.2839F, -0.3079F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0017F, 2.5403F, 3.6062F, 0.5445F, -0.0405F, -0.0564F));

		PartDefinition cube_r675 = bone4.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.4362F, 2.9297F, -1.8144F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.719F, -0.0405F, -0.2745F));

		PartDefinition cube_r676 = bone4.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(53, 109).mirror().addBox(-0.4362F, 2.9693F, -1.145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.6754F, -0.0405F, -0.2745F));

		PartDefinition cube_r677 = bone4.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(36, 119).mirror().addBox(-0.294F, 1.629F, -0.2343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 0.3595F, -0.0197F, -0.2782F));

		PartDefinition cube_r678 = bone4.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-0.2914F, 0.0207F, -1.0456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, -1.0559F, 0.0F, -0.2793F));

		PartDefinition cube_r679 = bone4.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(11, 80).mirror().addBox(-0.2914F, -0.5738F, -1.4462F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, -0.2269F, 0.0F, -0.2793F));

		PartDefinition cube_r680 = bone4.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(129, 18).mirror().addBox(-0.9043F, 5.3993F, 0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(123, 72).mirror().addBox(-0.9043F, 4.9993F, 0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.1017F, 1.4403F, -6.1938F, -0.4538F, 0.0F, 0.0175F));

		PartDefinition cube_r681 = bone4.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(129, 12).mirror().addBox(-0.9043F, 4.7918F, -3.2449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.1017F, 1.4403F, -6.1938F, 0.3316F, 0.0F, 0.0175F));

		PartDefinition cube_r682 = bone4.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.9043F, -0.2893F, -6.0565F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1017F, 1.4403F, -6.1938F, 1.3352F, 0.0F, 0.0175F));

		PartDefinition cube_r683 = bone4.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(123, 75).mirror().addBox(-0.2914F, -7.1384F, 3.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, 2.8362F, 0.0F, -0.2793F));

		PartDefinition cube_r684 = bone4.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(122, 9).mirror().addBox(-0.2914F, 2.6147F, 5.6673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, -2.0071F, 0.0F, -0.2793F));

		PartDefinition cube_r685 = bone4.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(96, 104).mirror().addBox(-0.2914F, 2.4097F, -2.0247F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -3.6597F, -0.0938F, -0.6981F, 0.0F, -0.2793F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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