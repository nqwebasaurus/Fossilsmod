package fossils.fossils.client.blockentity.model.asfaltovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AsfaltovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart jaw;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public AsfaltovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.jaw = this.heads.getChild("jaw");
		this.Leftleg1 = this.hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 26.25F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -32.6F, 4.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-1.4681F, -9.3287F, -4.4361F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 0.288F, 0.1309F, 0.1309F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-1.4681F, -8.7975F, -3.4177F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 0.0698F, 0.1309F, 0.1309F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.5922F, -7.9233F, -3.8108F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.3491F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(-1.5922F, -7.1635F, -2.979F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.1047F, 0.0F, 0.1309F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(-0.3309F, 0.4506F, 0.1357F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 1.1463F, 0.0049F, -0.2463F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.3309F, 2.2926F, 1.1635F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.151F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 0.7972F, 0.0049F, -0.2463F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-0.4675F, -2.7178F, 0.045F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 0.4363F, 0.0F, -0.0873F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 18).mirror().addBox(-0.4675F, 6.5894F, 2.4272F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.8988F, 0.0F, -0.0873F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.4675F, 0.3104F, -4.1448F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.1571F, 0.0F, -0.0873F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(-0.4675F, -2.2754F, -4.2874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.0175F, 0.0F, -0.0873F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 10).mirror().addBox(-0.4675F, -1.948F, -4.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.5236F, 0.0F, -0.0873F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.4675F, -5.3879F, -3.6026F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, -0.1047F, 0.0F, -0.0873F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(-1.4681F, -7.4815F, -3.1025F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1078F, 4.3217F, 1.5723F, 0.4712F, 0.1309F, 0.1309F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 67).addBox(0.4681F, -7.4815F, -3.1025F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 0.4712F, -0.1309F, -0.1309F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(77, 22).addBox(0.4681F, -9.3287F, -4.4361F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 0.288F, -0.1309F, -0.1309F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(31, 77).addBox(0.4681F, -8.7975F, -3.4177F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 0.0698F, -0.1309F, -0.1309F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 18).addBox(0.5922F, -7.9233F, -3.8108F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.3491F, 0.0F, -0.1309F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 18).addBox(-0.5325F, 6.5894F, 2.4272F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.8988F, 0.0F, 0.0873F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(25, 80).addBox(-0.5325F, 0.3104F, -4.1448F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.1571F, 0.0F, 0.0873F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 77).addBox(-0.5325F, -2.2754F, -4.2874F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.0175F, 0.0F, 0.0873F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 10).addBox(-0.5325F, -1.948F, -4.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.5236F, 0.0F, 0.0873F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 35).addBox(-0.6691F, 0.4506F, 0.1357F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 1.1463F, -0.0049F, 0.2463F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 79).addBox(-0.6691F, 2.2926F, 1.1635F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 0.7972F, -0.0049F, 0.2463F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 20).addBox(-0.5325F, -2.7178F, 0.045F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, 0.4363F, 0.0F, 0.0873F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5325F, -5.3879F, -3.6026F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.1047F, 0.0F, 0.0873F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 35).addBox(0.5922F, -7.1635F, -2.979F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1078F, 4.3217F, 1.5723F, -0.1047F, 0.0F, -0.1309F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 0.2F, -1.9F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F))
				.texOffs(23, 54).addBox(0.0F, -2.2F, 0.1F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(86, 91).addBox(0.0F, -2.0F, -1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(91, 39).addBox(0.0F, -2.2532F, 0.0343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 5.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -5.4F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 91).addBox(0.0F, -2.8698F, 6.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 91).addBox(0.0F, -2.6698F, 4.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 91).addBox(0.0F, -2.5698F, 2.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 91).addBox(0.0F, -2.3698F, 0.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -7.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(16, 93).addBox(0.0F, -2.1349F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -9.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(19, 93).addBox(0.0F, -1.8035F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.7F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-4.4836F, -2.9596F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -1.3844F, 0.0097F, -0.0421F, -1.7277F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 19).mirror().addBox(-5.4836F, -2.9596F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -3.3844F, 0.0158F, 0.0274F, -1.5532F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-6.4836F, -2.9596F, -0.4825F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -5.3844F, 0.0235F, 0.1143F, -1.4829F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-7.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -7.3844F, 0.0281F, 0.1665F, -1.4473F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(-9.4836F, -2.9596F, -0.4825F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -9.3844F, 0.0361F, 0.2534F, -1.4282F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(-10.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -11.3844F, 0.0377F, 0.2708F, -1.4103F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -11.3844F, 0.188F, 0.1996F, -0.7857F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -9.3844F, 0.1764F, 0.1864F, -0.8054F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -7.3844F, 0.1189F, 0.1201F, -0.8317F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -5.3844F, 0.0849F, 0.0802F, -0.87F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -3.3844F, 0.0287F, 0.0134F, -0.9424F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -1.3844F, -0.0162F, -0.0401F, -1.1163F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -1.3844F, -0.0318F, -0.0179F, -0.593F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -3.3844F, 0.0339F, 0.006F, -0.4188F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -5.3844F, 0.1159F, 0.0358F, -0.3473F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -7.3844F, 0.1652F, 0.0535F, -0.3102F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -9.3844F, 0.2476F, 0.0828F, -0.2871F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(37, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5911F, -11.3844F, 0.2641F, 0.0886F, -0.2683F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(37, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -11.3844F, 0.2641F, -0.0886F, 0.2683F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(87, 31).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -11.3844F, 0.188F, -0.1996F, 0.7857F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 66).addBox(2.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -11.3844F, 0.0377F, -0.2708F, 1.4103F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(85, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -1.3844F, -0.0318F, 0.0179F, 0.593F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(85, 35).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -1.3844F, -0.0162F, 0.0401F, 1.1163F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 17).addBox(2.4836F, -2.9596F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -1.3844F, 0.0097F, 0.0421F, 1.7277F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(85, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -3.3844F, 0.0339F, -0.006F, 0.4188F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(85, 71).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -3.3844F, 0.0287F, -0.0134F, 0.9424F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(28, 19).addBox(2.4836F, -2.9596F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -3.3844F, 0.0158F, -0.0274F, 1.5532F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 27).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -5.3844F, 0.0849F, -0.0802F, 0.87F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -5.3844F, 0.1159F, -0.0358F, 0.3473F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(38, 30).addBox(2.4836F, -2.9596F, -0.4825F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -5.3844F, 0.0235F, -0.1143F, 1.4829F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(86, 82).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -7.3844F, 0.1652F, -0.0535F, 0.3102F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(86, 45).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -7.3844F, 0.1189F, -0.1201F, 0.8317F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 29).addBox(2.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -7.3844F, 0.0281F, -0.1665F, 1.4473F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(34, 40).addBox(2.4836F, -2.9596F, -0.4825F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -9.3844F, 0.0361F, -0.2534F, 1.4282F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(87, 37).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -9.3844F, 0.1764F, -0.1864F, 0.8054F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5911F, -9.3844F, 0.2476F, -0.0828F, 0.2871F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(2, 0).addBox(-4.0F, -3.1142F, -13.6398F, 8.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.5F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(38, 20).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -12.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 91).addBox(0.0F, -4.4477F, 8.0439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 91).addBox(0.0F, -3.8477F, 6.0439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 65).addBox(0.0F, -3.4477F, 4.0439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 91).addBox(0.0F, -2.8477F, 2.0439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 91).addBox(0.0F, -2.2477F, 0.0439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -9.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-0.0829F, -3.3298F, -3.1438F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 9.0032F, -7.8359F, 1.2111F, -0.7044F, -1.0447F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 49).mirror().addBox(0.0F, -1.928F, -1.9433F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.0032F, -7.8359F, 0.893F, -0.4137F, -0.4632F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.0F, 1.0F, -5.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 50).addBox(8.0F, 1.0F, -5.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.4032F, -5.0359F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(48, 68).addBox(-0.9171F, -3.3298F, -3.1438F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 9.0032F, -7.8359F, 1.2111F, 0.7044F, 1.0447F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 49).addBox(-1.0F, -1.928F, -1.9433F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 7.0032F, -7.8359F, 0.893F, 0.4137F, 0.4632F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-11.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2911F, -1.3844F, 0.0377F, 0.2708F, -1.4278F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2911F, -1.3844F, 0.188F, 0.1996F, -0.8032F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(18, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2911F, -1.3844F, 0.2641F, 0.0886F, -0.2857F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9911F, -3.3844F, 0.2641F, 0.0886F, -0.3032F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4911F, -5.3844F, 0.3138F, 0.1059F, -0.3332F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4911F, -5.3844F, 0.2233F, 0.239F, -0.8479F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 52).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9911F, -3.3844F, 0.188F, 0.1996F, -0.8206F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 29).mirror().addBox(-11.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9911F, -3.3844F, 0.0377F, 0.2708F, -1.4452F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(65, 17).mirror().addBox(-10.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4911F, -5.3844F, 0.0427F, 0.3229F, -1.4787F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(34, 38).mirror().addBox(-9.4836F, -2.9596F, -0.4825F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9911F, -7.3844F, 0.0515F, 0.4098F, -1.5454F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9911F, -7.3844F, 0.397F, 0.134F, -0.3931F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 5).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.9911F, -7.3844F, 0.2838F, 0.304F, -0.9014F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-7.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4911F, -9.0844F, 0.0551F, 0.4446F, -1.5613F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4911F, -9.0844F, 0.3087F, 0.3297F, -0.9112F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4911F, -9.0844F, 0.4304F, 0.1451F, -0.4059F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4911F, -9.0844F, 0.4304F, -0.1451F, 0.4059F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 45).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4911F, -9.0844F, 0.3087F, -0.3297F, 0.9112F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(67, 54).addBox(2.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4911F, -9.0844F, 0.0551F, -0.4446F, 1.5613F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(23, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9911F, -7.3844F, 0.397F, -0.134F, 0.3931F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(52, 5).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9911F, -7.3844F, 0.2838F, -0.304F, 0.9014F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(34, 38).addBox(2.4836F, -2.9596F, -0.4825F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9911F, -7.3844F, 0.0515F, -0.4098F, 1.5454F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4911F, -5.3844F, 0.3138F, -0.1059F, 0.3332F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(33, 66).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4911F, -5.3844F, 0.2233F, -0.239F, 0.8479F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 17).addBox(2.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4911F, -5.3844F, 0.0427F, -0.3229F, 1.4787F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9911F, -3.3844F, 0.2641F, -0.0886F, 0.3032F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 52).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9911F, -3.3844F, 0.188F, -0.1996F, 0.8206F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(55, 29).addBox(2.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9911F, -3.3844F, 0.0377F, -0.2708F, 1.4452F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 63).addBox(2.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2911F, -1.3844F, 0.0377F, -0.2708F, 1.4278F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 15).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2911F, -1.3844F, 0.188F, -0.1996F, 0.8032F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(18, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2911F, -1.3844F, 0.2641F, -0.0886F, 0.2857F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 35).addBox(-1.0F, 0.0599F, -0.0342F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, -10.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7F, 10.1084F, -7.0257F, 0.2282F, 0.2264F, -0.1688F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, -2.3F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1092F, 2.1533F, 0.3346F, 0.117F, -0.022F, -0.0102F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(52, 84).addBox(-0.6158F, -0.8649F, 0.3558F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 18).addBox(-0.6158F, 0.1351F, -1.0442F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2789F, 4.8602F, 0.3544F, -1.0435F, 0.1133F, 0.0657F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(13, 65).addBox(-2.2864F, -0.2951F, -1.263F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 10.1084F, -7.0257F, 0.8391F, -0.2264F, 0.1688F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(44, 5).addBox(-0.5F, -2.3F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1092F, 2.1533F, 0.3346F, 0.117F, 0.022F, 0.0102F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(47, 84).addBox(-0.3842F, -0.8649F, 0.3558F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-0.3842F, 0.1351F, -1.0442F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2789F, 4.8602F, 0.3544F, -1.2654F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(0, 65).addBox(0.2864F, -0.2951F, -1.263F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -10.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r107 = neck3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(83, 91).addBox(0.0F, -2.1256F, 0.0453F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(22, 93).addBox(0.0F, -2.0924F, 0.0781F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -3.5F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(18, 18).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -4.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(80, 71).mirror().addBox(0.0F, -0.4627F, 0.0612F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5262F, -1.7043F, -0.7061F, -0.4432F, 0.3366F));

		PartDefinition cube_r111 = neck3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 44).mirror().addBox(0.0F, -0.4627F, 0.0612F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1262F, -3.9043F, -0.636F, -0.3439F, 0.244F));

		PartDefinition cube_r112 = neck3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(80, 71).addBox(0.0F, -0.4627F, 0.0612F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5262F, -1.7043F, -0.7061F, 0.4432F, -0.3366F));

		PartDefinition cube_r113 = neck3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 44).addBox(0.0F, -0.4627F, 0.0612F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1262F, -3.9043F, -0.636F, 0.3439F, -0.244F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r114 = neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(93, 22).addBox(0.0F, -1.9732F, 0.0849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -1.2F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(93, 26).addBox(0.0F, -1.8327F, -0.0499F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.7F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r116 = neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(28, 93).addBox(0.0F, -1.9509F, -0.063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -4.4F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8216F, -1.5042F, -0.7267F, -0.2779F, 0.2802F));

		PartDefinition cube_r118 = neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(16, 78).mirror().addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8784F, -3.5042F, -0.8812F, -0.1791F, 0.192F));

		PartDefinition cube_r119 = neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 78).mirror().addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4784F, -5.5042F, -0.8289F, -0.1791F, 0.192F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(67, 45).addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8216F, -1.5042F, -0.7267F, 0.2779F, -0.2802F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(16, 78).addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8784F, -3.5042F, -0.8812F, 0.1791F, -0.192F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 78).addBox(0.0F, -0.7308F, -0.0804F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4784F, -5.5042F, -0.8289F, 0.1791F, -0.192F));

		PartDefinition cube_r123 = neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(34, 62).addBox(-1.0F, -0.2117F, -0.1819F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.8F, -4.4F, -0.637F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(80, 31).addBox(-1.0F, -2.0F, -4.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.4F, -4.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(31, 93).addBox(0.0F, -1.9525F, -0.117F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.4F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(67, 37).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.4F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(93, 43).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.4F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(0.0647F, -0.676F, -0.0912F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5798F, -1.5955F, -1.1671F, -0.1236F, 0.2201F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(0.0F, -0.6554F, -0.0042F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0798F, -3.2955F, -0.964F, -0.0749F, 0.1074F));

		PartDefinition cube_r129 = neck.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 82).addBox(-0.0647F, -0.676F, -0.0912F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5798F, -1.5955F, -1.1671F, 0.1236F, -0.2201F));

		PartDefinition cube_r130 = neck.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 82).addBox(0.0F, -0.6554F, -0.0042F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0798F, -3.2955F, -0.964F, 0.0749F, -0.1074F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create().texOffs(0, 92).addBox(1.37F, -1.4654F, -3.3268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 4).addBox(1.2F, -1.4654F, -3.3268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 4).mirror().addBox(-2.2F, -1.4654F, -3.3268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 92).mirror().addBox(-2.37F, -1.4654F, -3.3268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, -0.1995F, -0.1581F, -0.1294F));

		PartDefinition cube_r131 = heads.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 67).addBox(-1.0F, -0.9701F, -0.0011F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -11.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = heads.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-3.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -0.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r133 = heads.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-3.0F, -0.028F, -0.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 84).addBox(0.0F, -0.028F, -0.0604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.2F, -0.1F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r134 = heads.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(10, 27).addBox(0.0F, -0.3649F, -0.2567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.7F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r135 = heads.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, -2.0642F, -0.0091F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -3.7F, -1.597F, 0.0F, 0.0F));

		PartDefinition Rightcrestbase_r1 = heads.addOrReplaceChild("Rightcrestbase_r1", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.2842F, -0.0883F, -3.7379F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7165F, -1.6483F, -5.3249F, 0.5078F, 0.0048F, -0.2747F));

		PartDefinition Rightcrestbase_r2 = heads.addOrReplaceChild("Rightcrestbase_r2", CubeListBuilder.create().texOffs(16, 84).mirror().addBox(-0.2F, -0.7F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.7165F, -1.3483F, -4.7249F, 0.7173F, 0.0048F, -0.2747F));

		PartDefinition Rightcrestorbit_r1 = heads.addOrReplaceChild("Rightcrestorbit_r1", CubeListBuilder.create().texOffs(29, 89).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3632F, -1.0484F, -3.8133F, 0.1549F, -0.0663F, -0.1558F));

		PartDefinition Head_r1 = heads.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 6).addBox(0.84F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.67F, 1.4885F, -9.2182F, 2.3998F, 0.0F, 0.0F));

		PartDefinition Head_r2 = heads.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(-0.5F, -2.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 84).mirror().addBox(-1.0F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(81, 41).addBox(1.84F, -2.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 84).addBox(2.34F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.17F, 1.1885F, -5.6182F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Head_r3 = heads.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(86, 40).addBox(2.84F, -1.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.67F, 0.6216F, -4.4426F, 3.1329F, 0.0F, 0.0F));

		PartDefinition Head_r4 = heads.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-0.5F, -1.9F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 68).addBox(2.84F, -1.9F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.67F, 0.2155F, -5.1391F, 1.5621F, 0.0F, 0.0F));

		PartDefinition Head_r5 = heads.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-0.5F, 0.0787F, -0.7879F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(69, 87).mirror().addBox(-0.5F, 0.5787F, -1.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(69, 87).addBox(2.84F, 0.5787F, -1.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(85, 50).addBox(2.84F, 0.0787F, -0.7879F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-1.67F, 0.9286F, -6.8511F, 2.33F, 0.0F, 0.0F));

		PartDefinition Head_r6 = heads.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(-0.5F, -0.7545F, -0.1466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(82, 87).addBox(2.84F, -0.7545F, -0.1466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.67F, 1.212F, -1.2752F, 1.3003F, 0.0F, 0.0F));

		PartDefinition Head_r7 = heads.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-0.5F, -0.1146F, -0.8459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(87, 87).addBox(2.84F, -0.1146F, -0.8459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.67F, -0.588F, -0.9752F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r8 = heads.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.5F, -1.0781F, -0.5025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(5, 89).addBox(2.84F, -1.0781F, -0.5025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-1.67F, -0.188F, -1.2752F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r9 = heads.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.5F, -1.0966F, -1.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(89, 84).addBox(2.84F, -1.0966F, -1.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.67F, -0.188F, -1.2752F, -0.6196F, 0.0F, 0.0F));

		PartDefinition Head_r10 = heads.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(-0.5F, -1.0809F, -0.7272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 88).addBox(2.84F, -1.0809F, -0.7272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.67F, -0.188F, -1.2752F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r11 = heads.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.5F, -0.161F, -0.2057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(89, 91).addBox(2.84F, -0.161F, -0.2057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.67F, 0.6346F, -3.2268F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Head_r12 = heads.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.5F, -1.8935F, -0.1518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 89).addBox(2.84F, -1.8935F, -0.1518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.67F, 1.2346F, -2.8268F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r13 = heads.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-0.5F, -0.6927F, -0.8637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(91, 10).addBox(2.84F, -0.6927F, -0.8637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.67F, -0.9654F, -2.4268F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r14 = heads.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-0.5F, -0.8851F, -0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 52).addBox(2.84F, -0.8851F, -0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.67F, -0.9654F, -3.4268F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Head_r15 = heads.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(20, 89).addBox(2.84F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-1.67F, -0.4654F, -2.8268F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r16 = heads.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-0.5F, -0.8398F, -0.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(91, 33).addBox(2.84F, -0.8398F, -0.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.67F, -0.5654F, -2.2268F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftcrestbase_r1 = heads.addOrReplaceChild("Leftcrestbase_r1", CubeListBuilder.create().texOffs(71, 10).addBox(-0.7158F, -0.0883F, -3.7379F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7165F, -1.6483F, -5.3249F, 0.5078F, -0.0048F, 0.2747F));

		PartDefinition Leftcrestbase_r2 = heads.addOrReplaceChild("Leftcrestbase_r2", CubeListBuilder.create().texOffs(16, 84).addBox(-0.8F, -0.7F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.7165F, -1.3483F, -4.7249F, 0.7173F, -0.0048F, 0.2747F));

		PartDefinition Head_r17 = heads.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -2.1802F, -0.3367F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.67F, 0.8885F, -8.7182F, 2.6442F, 0.0F, 0.0F));

		PartDefinition Leftcrestorbit_r1 = heads.addOrReplaceChild("Leftcrestorbit_r1", CubeListBuilder.create().texOffs(29, 89).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.3632F, -1.0484F, -3.8133F, 0.1549F, 0.0663F, 0.1558F));

		PartDefinition cube_r136 = heads.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -3.0382F, -0.06F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -5.9F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r137 = heads.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(81, 77).addBox(-1.5F, -1.968F, 0.0158F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.0F, -7.7F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r138 = heads.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(81, 0).addBox(-1.0F, -2.991F, -0.0219F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -10.2F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r139 = heads.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(54, 74).addBox(-1.5F, -2.0517F, -0.0819F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.6F, -11.0F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r140 = heads.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(23, 74).addBox(-1.0F, -1.1F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.001F, -9.4517F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r141 = heads.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(22, 66).mirror().addBox(-0.5F, -0.8698F, -0.1374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(22, 66).addBox(-0.1F, -0.8698F, -0.1374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 3.7F, -9.5F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r142 = heads.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-1.0F, -1.0454F, 0.0369F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(83, 21).addBox(-0.6F, -1.0454F, 0.0369F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 4.5F, -10.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r143 = heads.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(13, 53).addBox(-2.0F, -2.9581F, -0.2356F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3F, -4.5F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r144 = heads.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(34, 42).addBox(-2.0F, -0.4F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.4145F, -4.7101F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r145 = heads.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(32, 53).addBox(-2.0F, -2.9581F, -1.2356F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(-1.5F, -2.9581F, -3.2356F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -4.5F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r146 = heads.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -1.1F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.1062F, -6.8173F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r147 = heads.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 62).addBox(-2.2F, -0.9717F, -0.0316F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 3.7F, -8.6F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r148 = heads.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 19).addBox(-2.0F, -3.0366F, -2.0346F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -1.5F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r149 = heads.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(67, 31).addBox(-2.0F, -2.9454F, -2.0941F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8F, 0.5F, 0.2007F, 0.0F, 0.0F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(1.0F, 1.7F, 1.1F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-0.9F, 0.3351F, 0.1157F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.8115F, -6.9253F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-1.0F, 0.0165F, -3.8056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.5115F, -6.3253F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-1.0F, -1.0468F, -0.0141F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 7.6115F, -8.7253F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 26).mirror().addBox(0.01F, 0.3238F, 3.7416F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5315F, -2.3306F, 0.8116F, -0.2182F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 15).mirror().addBox(0.0F, -0.9672F, -0.0223F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5315F, -2.3306F, 0.48F, -0.2182F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(34, 46).mirror().addBox(-1.0F, -0.5845F, 0.7584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8003F, -0.4869F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(85, 11).mirror().addBox(-1.0F, -0.0314F, -2.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7003F, -0.7869F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(70, 0).mirror().addBox(-1.0F, -0.1F, -4.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2003F, -0.1869F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-1.0F, -0.0147F, -2.9581F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2003F, -2.7869F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-1.0F, 0.0165F, -0.0056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(9, 65).mirror().addBox(-1.0F, 0.6165F, 0.4944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 4.5115F, -6.3253F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-1.0F, -0.8862F, -3.0001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 4.6003F, -2.9869F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 46).addBox(0.0F, -0.5845F, 0.7584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8003F, -0.4869F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(85, 11).addBox(0.0F, -0.0314F, -2.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7003F, -0.7869F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(81, 59).addBox(0.0F, -0.0147F, -2.9581F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2003F, -2.7869F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(79, 54).addBox(0.0F, -0.8862F, -3.0001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 4.6003F, -2.9869F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 71).addBox(0.0F, -1.0468F, -0.0141F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8F, 7.6115F, -8.7253F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(18, 26).addBox(-1.0F, -0.8835F, -3.8056F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 4.5115F, -6.3253F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(84, 64).addBox(-1.2F, 0.0165F, -3.8056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(74, 48).addBox(0.0F, 0.0165F, -3.8056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 4.5115F, -6.3253F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(9, 65).addBox(0.0F, 0.6165F, 0.4944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(67, 10).addBox(0.0F, 0.0165F, -0.0056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, 4.5115F, -6.3253F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(42, 87).addBox(0.9F, 0.3351F, 0.1157F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 3.8115F, -6.9253F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Head_r18 = jaw.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(7, 35).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 35).addBox(2.84F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.67F, 2.9305F, -1.8231F, 2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(27, 26).addBox(-0.01F, 0.3238F, 3.7416F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.5315F, -2.3306F, 0.8116F, 0.2182F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 15).addBox(0.0F, -0.9672F, -0.0223F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.5315F, -2.3306F, 0.48F, 0.2182F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, -0.1F, -4.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(40, 73).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2003F, -0.1869F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(71, 75).addBox(-1.4F, -1.2383F, -0.9543F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4076F, 1.5422F, 0.2219F, 0.0425F, -0.0262F, 0.0832F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(73, 42).addBox(-1.0F, 9.461F, -4.8743F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(78, 35).addBox(-1.0F, 7.161F, -4.6743F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.058F, 0.2521F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, 2.4996F, -0.8061F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, -0.058F, 0.2521F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.197F, -1.149F, 0.9595F, -0.025F, 0.0357F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(73, 69).addBox(-1.0F, 2.754F, 4.3608F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(9, 82).addBox(0.2F, -6.3F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 76).addBox(0.2F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 7.2542F, 0.3431F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -4.6F, -1.4F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(62, 66).addBox(-1.2F, 0.0504F, -1.4511F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 13.2191F, -0.029F, -0.5653F, -0.0617F, -0.0618F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(52, 0).addBox(-3.0F, -0.1708F, -5.3834F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 6.3125F, -0.7244F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(56, 59).addBox(-3.0F, -0.7681F, -2.7989F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5973F, -5.0844F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(11, 75).addBox(-0.6F, -1.2383F, -0.9543F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4073F, 1.5639F, 0.1836F, -1.0389F, 0.2312F, 0.0372F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(71, 56).addBox(-1.0F, 9.461F, -4.8743F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(78, 7).addBox(-1.0F, 7.161F, -4.6743F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.058F, 0.2521F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, 2.4996F, -0.8061F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -0.058F, 0.2521F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.197F, -1.149F, 1.7453F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(73, 63).addBox(-1.0F, 2.754F, 4.3608F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(57, 80).addBox(-1.2F, -6.3F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 0).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 7.2542F, 0.3431F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.6F, -1.4F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(38, 20).addBox(-1.8F, 0.0504F, -1.4511F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 13.2191F, -0.029F, -1.5924F, -0.1725F, 0.1175F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(49, 49).addBox(-2.0F, -0.1708F, -5.3834F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 6.3125F, -0.7244F, 1.789F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(52, 10).addBox(-2.0F, -0.7681F, -2.7989F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.5973F, -5.0844F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, -0.9071F, 0.0078F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.4F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r173 = tail.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(90, 47).addBox(0.0F, -2.9F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 60).addBox(0.0F, -2.6F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 90).addBox(0.0F, -2.6F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 75).addBox(0.0F, -2.4F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 90).addBox(0.0F, -2.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 18).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8071F, 1.0078F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(74, 87).addBox(0.0F, 4.6F, 8.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 89).addBox(0.0F, 3.3F, 6.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 89).addBox(0.0F, 2.0F, 4.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 89).addBox(0.0F, 0.5F, 2.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 0).addBox(0.0F, -1.5F, 0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5173F, 1.2066F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 21).addBox(-1.0F, -0.6981F, -0.2564F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2113F, 12.073F, 0.2184F, -0.0426F, -0.0094F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 92).addBox(0.0F, -4.2F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 79).addBox(0.0F, -3.8F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 87).addBox(0.0F, -3.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 0).addBox(0.0F, -2.9F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 93).addBox(0.0F, -2.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 90).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4981F, 0.7436F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(13, 92).addBox(0.0F, 2.8F, 9.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 13).addBox(0.0F, 2.0F, 7.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 90).addBox(0.0F, 1.2F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 90).addBox(0.0F, 0.3F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 38).addBox(0.0F, -0.7F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 45).addBox(0.0F, -1.4F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1221F, 2.0219F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, -0.4F, -0.0035F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2989F, 13.7261F, -0.1051F, 0.0868F, -0.0091F));

		PartDefinition cube_r177 = tail3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, -2.9F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 79).addBox(0.0F, -3.5F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 82).addBox(0.0F, -3.2F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 25).addBox(0.0F, -2.6F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(0.0F, -2.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 92).addBox(0.0F, -1.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 70).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.669F, -0.0039F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(54, 68).addBox(0.0F, 9.6F, 21.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 26).addBox(0.0F, 7.7F, 19.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(0.0F, 6.7F, 17.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 43).addBox(0.0F, 6.0F, 15.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 10).addBox(0.0F, 5.3F, 13.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(0.0F, 4.7F, 11.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4202F, -11.7251F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 49).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F))
				.texOffs(37, 77).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 37).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 69).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(0.0F, -0.6F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 12.9965F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition cube_r179 = tail4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(13, 50).addBox(0.0F, 12.0F, 27.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 59).addBox(0.0F, 11.3F, 25.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 37).addBox(0.0F, 10.4F, 23.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6202F, -24.7216F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.4572F, -0.1545F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2945F, 11.0572F, -0.3518F, 0.123F, -0.045F));

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