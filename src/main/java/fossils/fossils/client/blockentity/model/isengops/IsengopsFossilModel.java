package fossils.fossils.client.blockentity.model.isengops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IsengopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart proburnetia;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart scapula;
	private final ModelPart scapula2;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RFrontLeg2;
	private final ModelPart LowerRFrontLeg2;
	private final ModelPart RFrontFoot2;
	private final ModelPart RFrontFoot3;
	private final ModelPart RFrontLeg3;
	private final ModelPart LowerRFrontLeg3;
	private final ModelPart RFrontFoot4;
	private final ModelPart RFrontFoot5;
	private final ModelPart sacrum;
	private final ModelPart sacrum2;
	private final ModelPart RBackLeg2;
	private final ModelPart LowerRBackLeg2;
	private final ModelPart RBackFoot2;
	private final ModelPart RBackFoot3;
	private final ModelPart RBackLeg3;
	private final ModelPart LowerRBackLeg3;
	private final ModelPart RBackFoot4;
	private final ModelPart RBackFoot5;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;

	public IsengopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.proburnetia = this.fossil.getChild("proburnetia");
		this.main = this.proburnetia.getChild("main");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.scapula = this.chest.getChild("scapula");
		this.scapula2 = this.chest.getChild("scapula2");
		this.Neck2 = this.chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RFrontLeg2 = this.chest.getChild("RFrontLeg2");
		this.LowerRFrontLeg2 = this.RFrontLeg2.getChild("LowerRFrontLeg2");
		this.RFrontFoot2 = this.LowerRFrontLeg2.getChild("RFrontFoot2");
		this.RFrontFoot3 = this.RFrontFoot2.getChild("RFrontFoot3");
		this.RFrontLeg3 = this.chest.getChild("RFrontLeg3");
		this.LowerRFrontLeg3 = this.RFrontLeg3.getChild("LowerRFrontLeg3");
		this.RFrontFoot4 = this.LowerRFrontLeg3.getChild("RFrontFoot4");
		this.RFrontFoot5 = this.RFrontFoot4.getChild("RFrontFoot5");
		this.sacrum = this.main.getChild("sacrum");
		this.sacrum2 = this.main.getChild("sacrum2");
		this.RBackLeg2 = this.main.getChild("RBackLeg2");
		this.LowerRBackLeg2 = this.RBackLeg2.getChild("LowerRBackLeg2");
		this.RBackFoot2 = this.LowerRBackLeg2.getChild("RBackFoot2");
		this.RBackFoot3 = this.RBackFoot2.getChild("RBackFoot3");
		this.RBackLeg3 = this.main.getChild("RBackLeg3");
		this.LowerRBackLeg3 = this.RBackLeg3.getChild("LowerRBackLeg3");
		this.RBackFoot4 = this.LowerRBackLeg3.getChild("RBackFoot4");
		this.RBackFoot5 = this.RBackFoot4.getChild("RBackFoot5");
		this.Tail = this.main.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition proburnetia = fossil.addOrReplaceChild("proburnetia", CubeListBuilder.create(), PartPose.offset(0.5F, -12.1F, 3.0F));

		PartDefinition main = proburnetia.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4668F, -3.1567F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 77).addBox(0.0F, -2.0831F, 3.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 77).addBox(0.0F, -1.8831F, 1.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 77).addBox(0.0F, -1.8831F, -0.4056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 28).mirror().addBox(-1.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 28).addBox(0.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(-0.5F, -0.6831F, -0.4056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5769F, 7.2014F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0186F, 6.9189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, -1.5156F, 0.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2719F, 0.4778F, -0.0738F, -0.0268F, -0.732F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0062F, 0.0062F, -1.117F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0082F, 0.003F, -0.6807F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0738F, 0.0268F, -0.6273F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0556F, 0.0555F, -1.0631F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2719F, 0.4778F, -0.0738F, 0.0268F, 0.732F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(74, 60).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0062F, -0.0062F, 1.117F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0082F, -0.003F, 0.6807F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0738F, -0.0268F, 0.6273F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 16).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0556F, -0.0555F, 1.0631F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 48).addBox(0.0F, -1.8873F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.7792F, 4.5939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0406F, -4.9571F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 76).addBox(0.0F, -2.1594F, -0.0994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -1.0429F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 5).addBox(0.0F, -2.4792F, 1.5939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 75).addBox(0.0F, -2.4792F, -0.4061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 12).addBox(-0.5F, -0.7792F, -0.4061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -4.6429F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.017F, 0.0767F, -1.4916F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0556F, 0.0555F, -0.9235F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0738F, 0.0268F, -0.4877F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 61).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.0323F, 0.1448F, -1.455F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 61).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1053F, 0.1047F, -0.8846F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1395F, 0.0506F, -0.4503F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.1724F, 0.0624F, -0.3437F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.1303F, 0.1292F, -0.777F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 30).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.0401F, 0.1789F, -1.349F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 3).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.017F, -0.0767F, 1.4916F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 61).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0556F, -0.0555F, 0.9235F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0738F, -0.0268F, 0.4877F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 61).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.0323F, -0.1448F, 1.455F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 61).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1053F, -0.1047F, 0.8846F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1395F, -0.0506F, 0.4503F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.1724F, -0.0624F, 0.3437F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 18).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.1303F, -0.1292F, 0.777F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 30).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.0401F, -0.1789F, 1.349F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -5.0172F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r35 = body3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 76).addBox(0.0F, -2.0119F, -0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 76).addBox(0.0F, -1.9037F, 5.0957F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(17, 0).addBox(-0.5F, -0.2037F, 4.0957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8F, -9.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.3046F, 0.1087F, -0.3324F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.2323F, 0.2263F, -0.7589F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.0723F, 0.315F, -1.3411F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.3253F, 0.3093F, -0.7866F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.4214F, 0.1478F, -0.3698F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.1029F, 0.4338F, -1.3823F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-4.3141F, 1.131F, -0.2389F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4275F, 0.6453F, 0.1845F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 10).mirror().addBox(-3.5171F, 1.1112F, -0.7064F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4332F, 0.2901F, 0.1388F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 22).mirror().addBox(-3.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4052F, 6.0981F, -1.5421F, 0.4666F, 0.1377F, 0.139F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-2.5883F, 1.0651F, -0.7059F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5039F, 0.1042F, 0.1344F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-3.0002F, 0.1995F, -0.6253F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1103F, 6.0455F, -2.6636F, 0.5075F, 0.0831F, 0.1727F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(30, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.3046F, -0.1087F, 0.3324F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 61).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.2323F, -0.2263F, 0.7589F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 34).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.0723F, -0.315F, 1.3411F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 45).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.3253F, -0.3093F, 0.7866F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.4214F, -0.1478F, 0.3698F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 32).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.1029F, -0.4338F, 1.3823F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5F, -0.0189F, -0.1421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.4314F, -1.386F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(9, 44).addBox(0.3141F, 1.131F, -0.2389F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4275F, -0.6453F, -0.1845F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 10).addBox(-0.4829F, 1.1112F, -0.7064F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4332F, -0.2901F, -0.1388F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(37, 22).addBox(-0.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4052F, 6.0981F, -1.5421F, 0.4666F, -0.1377F, -0.139F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 22).addBox(-0.4117F, 1.0651F, -0.7059F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5039F, -0.1042F, -0.1344F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 24).addBox(0.0003F, 0.1995F, -0.6253F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1103F, 6.0455F, -2.6636F, 0.5075F, -0.0831F, -0.1727F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5202F, -4.8266F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 76).addBox(0.0F, -2.016F, -0.0837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -0.8959F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 76).addBox(0.0F, -1.7282F, 0.0028F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -2.9959F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.0916F, 0.3914F, -1.509F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.2916F, 0.2799F, -0.9186F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.3795F, 0.134F, -0.4978F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(44, 36).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.0702F, 0.3065F, -1.4465F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 61).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2258F, 0.2203F, -0.865F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2963F, 0.1059F, -0.438F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 46).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.0916F, -0.3914F, 1.509F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 0).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.2916F, -0.2799F, 0.9186F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(46, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.3795F, -0.134F, 0.4978F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(44, 36).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.0702F, -0.3065F, 1.4465F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 61).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2258F, -0.2203F, 0.865F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(41, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2963F, -0.1059F, 0.438F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 12).addBox(-1.5F, -0.1538F, -1.1716F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 3.6311F, -5.7642F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 46).addBox(-1.0F, 0.0138F, -1.5189F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.3311F, -3.8642F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(35, 24).addBox(-0.5F, -0.0531F, -3.8215F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 5.1212F, -0.633F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.2037F, 0.0957F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -4.0959F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.4499F, -4.3959F));

		PartDefinition cube_r79 = scapula.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 67).addBox(-1.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 1.5037F, 0.1546F, 0.4863F));

		PartDefinition cube_r80 = scapula.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 18).addBox(1.5F, -0.2037F, -2.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r81 = scapula.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, -0.3371F, -2.9508F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 1.1983F, 0.1546F, 0.4863F));

		PartDefinition cube_r82 = scapula.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 48).addBox(-1.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 2.1582F, 0.1546F, 0.4863F));

		PartDefinition cube_r83 = scapula.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 59).addBox(-1.0F, -0.0407F, -1.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 0.8928F, 0.1546F, 0.4863F));

		PartDefinition cube_r84 = scapula.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(24, 53).addBox(1.5F, -0.1333F, -1.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offset(-0.8F, 0.4499F, -4.3959F));

		PartDefinition cube_r85 = scapula2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(42, 67).mirror().addBox(0.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 1.5037F, -0.1546F, -0.4863F));

		PartDefinition cube_r86 = scapula2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(26, 18).mirror().addBox(-2.5F, -0.2037F, -2.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r87 = scapula2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 16).mirror().addBox(0.0F, -0.3371F, -2.9508F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 1.1983F, -0.1546F, -0.4863F));

		PartDefinition cube_r88 = scapula2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(0.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 2.1582F, -0.1546F, -0.4863F));

		PartDefinition cube_r89 = scapula2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(0.0F, -0.0407F, -1.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 0.8928F, -0.1546F, -0.4863F));

		PartDefinition cube_r90 = scapula2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(24, 53).mirror().addBox(-2.5F, -0.1333F, -1.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5237F, -3.9361F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 76).addBox(0.0F, -1.423F, -0.9264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.544F, 0.4946F, -0.6662F));

		PartDefinition cube_r93 = Neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 2).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.2747F, 0.6722F, -1.1466F));

		PartDefinition cube_r94 = Neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.544F, -0.4946F, 0.6662F));

		PartDefinition cube_r95 = Neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(62, 2).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.2747F, -0.6722F, 1.1466F));

		PartDefinition cube_r96 = Neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(41, 53).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1324F, -1.5559F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition cube_r97 = Neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(76, 64).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 53).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0474F, -0.5293F, 0.3978F, 0.7203F, -1.0043F));

		PartDefinition cube_r99 = Neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0474F, -0.5293F, 0.3978F, -0.7203F, 1.0043F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1636F, -1.984F, 0.2364F, 0.1863F, 0.1547F));

		PartDefinition cube_r100 = Neck4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 74).addBox(0.0F, -1.6352F, 0.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-0.5F, -0.3352F, -1.5347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Neck4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0838F, -2.7453F, 0.2989F, 1.0544F, -1.1005F));

		PartDefinition cube_r102 = Neck4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1162F, -0.7453F, 0.2376F, 0.9702F, -1.0979F));

		PartDefinition cube_r103 = Neck4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(62, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0838F, -2.7453F, 0.2989F, -1.0544F, 1.1005F));

		PartDefinition cube_r104 = Neck4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1162F, -0.7453F, 0.2376F, -0.9702F, 1.0979F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(55, 28).addBox(-0.5F, -1.6121F, -6.1001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.5276F, -3.0519F, 0.4725F, 0.185F, -0.0018F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 72).addBox(-1.0F, 0.0707F, -0.4949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0583F, -8.6178F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 53).addBox(-1.0F, -0.0543F, -1.3699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.3507F, -7.6615F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(55, 32).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, -6.9143F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(64, 56).addBox(-0.5F, -0.1968F, -0.2217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3104F, -1.3198F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(74, 42).addBox(-0.5F, -0.1968F, -0.7967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.1423F, -0.7694F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(74, 45).addBox(-0.5F, -0.5625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 39).addBox(-0.5F, -0.4375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -2.0078F, -1.1107F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 57).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(74, 54).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.4493F, -3.3549F, 0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -2.1556F, -3.4159F, -0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, -0.3F, 0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.1556F, -3.4159F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(74, 36).addBox(-0.5F, -0.2F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.1088F, -4.135F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 48).addBox(-0.5F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -1.5202F, -4.3259F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 43).addBox(-0.5F, -0.2057F, -2.7667F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -1.4346F, -5.7777F, 0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(74, 48).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -1.437F, -5.0F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 57).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.3806F, -4.6789F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 24).addBox(-1.0F, -0.0302F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1889F, -5.2473F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(69, 24).addBox(-1.0F, 0.9206F, 0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.6639F, -6.7223F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(69, 21).addBox(-1.0F, -0.2516F, 1.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.9198F, -3.3606F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -0.0281F, 0.0049F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0035F, -3.1365F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 24).addBox(-2.0F, -0.0006F, 0.0098F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.8948F, -4.1356F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(59, 8).addBox(-1.5F, -0.675F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0448F, -4.0856F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7874F, -0.7722F, -0.9007F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(69, 18).addBox(-0.4486F, -0.0358F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0516F, 1.7681F, -4.878F, 0.4319F, 0.2237F, 0.0381F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(69, 10).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0857F, 2.305F, -5.1691F, 0.1701F, 0.2237F, 0.0381F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 0).addBox(-0.613F, -0.9719F, -2.5703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2211F, 2.098F, -5.877F, 0.1128F, 0.1394F, -0.0086F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2908F, 2.3346F, -5.9522F, -0.0917F, 0.2237F, 0.0381F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(46, 63).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.4286F, 2.0444F, -6.8992F, 0.0256F, 0.1394F, -0.0086F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(41, 63).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.4802F, 1.8007F, -6.1828F, -0.1926F, 0.1394F, -0.0086F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(10, 55).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-1.5089F, 0.7987F, -6.4219F, 0.3403F, 0.1396F, 0.0F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(69, 27).addBox(-0.6199F, -0.4613F, -0.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.5175F, 1.3194F, -7.2408F, -0.263F, 0.1021F, -0.0233F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(68, 33).addBox(-0.7115F, -0.4792F, -1.5896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.2211F, 2.098F, -5.877F, -0.5417F, 0.1394F, -0.0086F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 63).addBox(-0.5998F, -1.4747F, -0.0766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0516F, 1.7681F, -4.878F, 0.2945F, 0.2753F, 0.0124F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(63, 34).addBox(-0.5998F, -1.4733F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.0516F, 1.7681F, -4.878F, 0.12F, 0.2753F, 0.0124F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(20, 43).addBox(-1.0F, -1.6062F, -1.1592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-0.4624F, 1.227F, -4.2771F, 0.3054F, 0.2793F, 0.0F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(17, 52).addBox(-0.05F, -0.85F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.549F, -0.4452F, -1.2012F, -0.9443F, 0.2934F, 0.178F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 7).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5077F, -0.502F, -1.13F, -0.7941F, 0.0604F, 0.5683F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(10, 50).addBox(-0.825F, -0.125F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.7376F, -0.3884F, -2.9738F, 1.5981F, -0.0832F, 1.3122F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(20, 38).addBox(-0.2F, -1.05F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0343F, -1.8598F, -1.9316F, 1.3625F, 0.0272F, 0.9793F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(29, 38).addBox(-0.2F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.0343F, -1.8598F, -1.9316F, 1.6417F, 0.0272F, 0.9793F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(43, 43).addBox(-0.2F, -0.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0343F, -1.8598F, -1.9316F, 1.7726F, 0.0272F, 0.9793F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(11, 38).addBox(-0.5F, -1.4527F, -2.6877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.6736F, 1.1258F, 0.0604F, 0.5683F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5F, -0.963F, -0.1377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.4624F, 0.5511F, -2.1379F, -0.0087F, 0.2182F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 63).addBox(-0.5F, -0.9577F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.4624F, 0.5511F, -2.1379F, -0.2269F, 0.2182F, 0.0F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 68).addBox(-0.3774F, -0.3949F, -0.5499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.5175F, 1.3194F, -7.2408F, -1.7593F, 0.1437F, -0.0041F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(15, 67).addBox(-0.3364F, -0.6057F, -0.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 66).addBox(-0.5114F, -0.6057F, -0.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, -1.2063F, 0.2376F, -0.0039F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(66, 7).addBox(-0.9224F, 0.026F, -0.7296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(66, 4).addBox(-0.9224F, -0.349F, -0.7296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0879F, -0.6765F, -2.1951F, -0.8982F, 0.1458F, 0.4507F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 66).addBox(-0.9224F, -0.7357F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.0879F, -0.6765F, -2.1951F, -0.0727F, 0.1091F, 0.4269F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(34, 52).addBox(-0.5756F, -0.7306F, -0.7468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, 0.5269F, 0.2494F, 0.0652F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(67, 15).addBox(-0.5614F, -0.1725F, -0.3989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(66, 63).addBox(-0.5614F, -0.1725F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, 1.0365F, 0.2376F, -0.0039F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(74, 19).addBox(-0.8315F, 0.3263F, -0.6275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8428F, 1.3606F, 0.032F, -1.9703F, 0.1375F, -0.5735F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(74, 22).addBox(-0.8315F, -0.6656F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8428F, 1.3606F, 0.032F, -1.2022F, 0.1416F, -0.5719F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(74, 16).addBox(-0.8315F, -0.4156F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.8428F, 1.3606F, 0.032F, -1.2024F, 0.1375F, -0.5735F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(62, 52).addBox(-0.459F, -0.8199F, 0.31F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, -0.7166F, 0.2505F, -0.1215F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(62, 30).addBox(-0.459F, -0.3675F, -0.4688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, -0.4963F, 0.2352F, -0.1129F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 73).addBox(-0.459F, 0.4261F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, 1.7269F, 0.2505F, -0.1215F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(70, 72).addBox(-0.459F, 0.114F, 0.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, 1.2382F, 0.2505F, -0.1215F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2173F, -0.2684F, 0.3199F, 0.4944F, 0.2352F, -0.1301F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(64, 42).addBox(-0.5614F, -0.1587F, -0.6299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, 0.3383F, 0.2376F, -0.0039F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(64, 60).addBox(-0.5614F, -0.4928F, -0.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, 0.8096F, 0.2376F, -0.0039F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(27, 65).addBox(-0.5614F, -0.6313F, -0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2871F, -0.1718F, -2.2666F, 0.1114F, 0.2376F, -0.0039F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(37, 16).addBox(-0.5963F, -0.6015F, -0.7045F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.7874F, 0.5405F, -3.9653F, 0.3322F, 0.2535F, 0.01F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 48).addBox(-0.9733F, -1.997F, -0.1388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1658F, 1.2001F, -3.059F, -0.2536F, 0.3167F, -0.5855F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 48).addBox(-0.6599F, -2.3738F, 1.494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1658F, 1.2001F, -3.059F, -0.5095F, 0.1516F, -0.5926F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 68).addBox(-0.5F, -0.6579F, -0.5723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.6736F, -0.8813F, 0.0604F, 0.5683F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(72, 69).addBox(-0.8956F, -0.8086F, -1.3516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(57, 67).addBox(-0.8956F, -0.8086F, -0.6516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4876F, -1.3996F, -2.1486F, -1.0122F, 0.0604F, 0.2629F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(52, 67).addBox(-0.8956F, -0.9156F, -0.1473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.4876F, -1.3996F, -2.1486F, 1.3003F, 0.0604F, 0.2629F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 74).addBox(-0.5F, -0.675F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.464F, -1.7049F, 1.733F, 1.3758F, 0.3886F, -0.1515F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, -0.85F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6615F, 0.263F, 1.4847F, 0.9394F, 0.3886F, -0.1515F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.675F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.5898F, 0.0213F, 1.4005F, 1.2012F, 0.3886F, -0.1515F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(20, 73).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4092F, -0.126F, 1.0188F, 1.6376F, 0.3886F, -0.1515F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(67, 51).addBox(-0.5F, -0.375F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.3655F, -0.6796F, 1.1173F, 1.1576F, 0.3886F, -0.1515F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(47, 67).addBox(-0.5539F, -0.5066F, 0.1945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1275F, -0.7642F, 0.4315F, 0.3722F, 0.3886F, -0.1515F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(55, 0).addBox(-0.6874F, -1.0987F, -1.6866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2697F, 0.8983F, 0.2011F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 42).addBox(-0.575F, -0.4821F, -2.3479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1275F, -0.7642F, 0.4315F, 0.0125F, 0.2092F, -0.147F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 26).addBox(-0.5842F, -0.8114F, -2.8057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, 0.0F, 0.24F, -0.1134F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(41, 5).addBox(-0.4874F, -0.0674F, -1.7733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.24F, -0.0873F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1399F, 0.9639F, -1.1676F, -0.3054F, 0.24F, -0.1134F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5842F, 0.0499F, -1.7746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.125F, 0.0F, 0.0F, -0.3927F, 0.24F, -0.1134F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7874F, -0.7722F, -0.9007F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-0.5514F, -0.0358F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0516F, 1.7681F, -4.878F, 0.4319F, -0.2237F, -0.0381F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0857F, 2.305F, -5.1691F, 0.1701F, -0.2237F, -0.0381F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.387F, -0.9719F, -2.5703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.2211F, 2.098F, -5.877F, 0.1128F, -0.1394F, 0.0086F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.2908F, 2.3346F, -5.9522F, -0.0917F, -0.2237F, -0.0381F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.4286F, 2.0444F, -6.8992F, 0.0256F, -0.1394F, 0.0086F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(41, 63).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.4802F, 1.8007F, -6.1828F, -0.1926F, -0.1394F, 0.0086F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(10, 55).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(1.5089F, 0.7987F, -6.4219F, 0.3403F, -0.1396F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-0.3801F, -0.4613F, -0.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.5175F, 1.3194F, -7.2408F, -0.263F, -0.1021F, 0.0233F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-0.2885F, -0.4792F, -1.5896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(1.2211F, 2.098F, -5.877F, -0.5417F, -0.1394F, 0.0086F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(36, 63).mirror().addBox(-0.4002F, -1.4747F, -0.0766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.0516F, 1.7681F, -4.878F, 0.2945F, -0.2753F, -0.0124F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-0.4002F, -1.4733F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(1.0516F, 1.7681F, -4.878F, 0.12F, -0.2753F, -0.0124F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(20, 43).mirror().addBox(0.0F, -1.6062F, -1.1592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 1.227F, -4.2771F, 0.3054F, -0.2793F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(17, 52).mirror().addBox(-0.95F, -0.85F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.549F, -0.4452F, -1.2012F, -0.9443F, -0.2934F, -0.178F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5077F, -0.502F, -1.13F, -0.7941F, -0.0604F, -0.5683F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.175F, -0.125F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.7376F, -0.3884F, -2.9738F, 1.5981F, 0.0832F, -1.3122F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 38).mirror().addBox(-0.8F, -1.05F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0343F, -1.8598F, -1.9316F, 1.3625F, -0.0272F, -0.9793F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(29, 38).mirror().addBox(-0.8F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.0343F, -1.8598F, -1.9316F, 1.6417F, -0.0272F, -0.9793F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(43, 43).mirror().addBox(-0.8F, -0.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0343F, -1.8598F, -1.9316F, 1.7726F, -0.0272F, -0.9793F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-0.5F, -1.4527F, -2.6877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.6736F, 1.1258F, -0.0604F, -0.5683F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-0.5F, -0.963F, -0.1377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 0.5511F, -2.1379F, -0.0087F, -0.2182F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-0.5F, -0.9577F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 0.5511F, -2.1379F, -0.2269F, -0.2182F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(-0.6226F, -0.3949F, -0.5499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.5175F, 1.3194F, -7.2408F, -1.7593F, -0.1437F, 0.0041F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.6636F, -0.6057F, -0.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 66).mirror().addBox(-0.4886F, -0.6057F, -0.641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, -1.2063F, -0.2376F, 0.0039F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(66, 7).mirror().addBox(-0.0776F, 0.026F, -0.7296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(66, 4).mirror().addBox(-0.0776F, -0.349F, -0.7296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0879F, -0.6765F, -2.1951F, -0.8982F, -0.1458F, -0.4507F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.0776F, -0.7357F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.0879F, -0.6765F, -2.1951F, -0.0727F, -0.1091F, -0.4269F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-0.4244F, -0.7306F, -0.7468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, 0.5269F, -0.2494F, -0.0652F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(67, 15).mirror().addBox(-0.4386F, -0.1725F, -0.3989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(66, 63).mirror().addBox(-0.4386F, -0.1725F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, 1.0365F, -0.2376F, 0.0039F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-0.1686F, 0.3263F, -0.6275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, 1.3606F, 0.032F, -1.9703F, -0.1375F, 0.5735F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-0.1686F, -0.6656F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, 1.3606F, 0.032F, -1.2022F, -0.1416F, 0.5719F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 16).mirror().addBox(-0.1686F, -0.4156F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.8428F, 1.3606F, 0.032F, -1.2024F, -0.1375F, 0.5735F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-0.541F, -0.8199F, 0.31F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, -0.7166F, -0.2505F, 0.1215F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-0.541F, -0.3675F, -0.4688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, -0.4963F, -0.2352F, 0.1129F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.541F, 0.4261F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, 1.7269F, -0.2505F, 0.1215F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.541F, 0.114F, 0.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, 1.2382F, -0.2505F, 0.1215F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2173F, -0.2684F, 0.3199F, 0.4944F, -0.2352F, 0.1301F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(-0.4386F, -0.1587F, -0.6299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, 0.3383F, -0.2376F, 0.0039F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-0.4386F, -0.4928F, -0.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, 0.8096F, -0.2376F, 0.0039F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-0.4386F, -0.6313F, -0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2871F, -0.1718F, -2.2666F, 0.1114F, -0.2376F, 0.0039F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-0.4037F, -0.6015F, -0.7045F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.7874F, 0.5405F, -3.9653F, 0.3322F, -0.2535F, -0.01F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-0.0267F, -1.997F, -0.1388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1658F, 1.2001F, -3.059F, -0.2536F, -0.3167F, 0.5855F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.3401F, -2.3738F, 1.494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1658F, 1.2001F, -3.059F, -0.5095F, -0.1516F, 0.5926F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.5F, -0.6579F, -0.5723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.6736F, -0.8813F, -0.0604F, -0.5683F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-0.1044F, -0.8086F, -1.3516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(57, 67).mirror().addBox(-0.1044F, -0.8086F, -0.6516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, -1.3996F, -2.1486F, -1.0122F, -0.0604F, -0.2629F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-0.1044F, -0.9156F, -0.1473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, -1.3996F, -2.1486F, 1.3003F, -0.0604F, -0.2629F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(25, 74).mirror().addBox(-0.5F, -0.675F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.464F, -1.7049F, 1.733F, 1.3758F, -0.3886F, 0.1515F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(17, 57).mirror().addBox(-0.5F, -0.85F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6615F, 0.263F, 1.4847F, 0.9394F, -0.3886F, 0.1515F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, -0.675F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.5898F, 0.0213F, 1.4005F, 1.2012F, -0.3886F, 0.1515F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4092F, -0.126F, 1.0188F, 1.6376F, -0.3886F, 0.1515F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(67, 51).mirror().addBox(-0.5F, -0.375F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.3655F, -0.6796F, 1.1173F, 1.1576F, -0.3886F, 0.1515F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(-0.4461F, -0.5066F, 0.1945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, -0.7642F, 0.4315F, 0.3722F, -0.3886F, 0.1515F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.3126F, -1.0987F, -1.6866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2697F, -0.8983F, -0.2011F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.425F, -0.4821F, -2.3479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, -0.7642F, 0.4315F, 0.0125F, -0.2092F, 0.147F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(24, 26).mirror().addBox(-0.4159F, -0.8114F, -2.8057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, 0.0F, -0.24F, 0.1134F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(41, 5).mirror().addBox(-0.5126F, -0.0674F, -1.7733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, -0.24F, 0.0873F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1399F, 0.9639F, -1.1676F, -0.3054F, -0.24F, 0.1134F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.4159F, 0.0499F, -1.7746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.0F, -0.3927F, -0.24F, 0.1134F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4149F, -0.9706F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.5F, -1.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(5, 74).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1308F, -0.0842F, -7.0227F, 1.2829F, -0.0244F, 0.0148F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(69, 54).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.164F)).mirror(false), PartPose.offsetAndRotation(-0.9807F, 0.7805F, -3.1992F, 0.0698F, -0.1396F, 0.0F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.7767F, -0.745F, -0.6974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1294F, 0.3701F, -6.6156F, 0.9949F, -0.0244F, 0.0148F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6297F, -0.0352F, -0.9896F, 0.0873F, -0.3142F, 0.0F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-0.2F, -0.7601F, -0.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4F, -2.975F, 0.0873F, -0.3142F, 0.0F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-0.6545F, -0.8692F, -0.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.9239F, -0.7143F, -2.6821F, -2.6683F, -0.227F, 0.0337F));

		PartDefinition cube_r243 = Jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.6545F, -0.8595F, -0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.9177F, -0.6808F, -2.706F, -1.3067F, -0.3032F, 0.0142F));

		PartDefinition cube_r244 = Jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.5564F, -0.6349F, -1.215F, -0.3054F, -0.3142F, 0.0F));

		PartDefinition cube_r245 = Jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.5F, -1.25F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)).mirror(false)
				.texOffs(73, 33).mirror().addBox(-0.5F, -0.65F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.9175F, 1.448F, -0.1036F, -0.3491F, -0.3142F, 0.0F));

		PartDefinition cube_r246 = Jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(31, 56).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-1.7276F, 0.3424F, -0.688F, -0.7418F, -0.3142F, 0.0F));

		PartDefinition cube_r247 = Jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7276F, 0.6057F, -0.6882F, -0.0611F, -0.3142F, 0.0F));

		PartDefinition cube_r248 = Jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.225F, -0.2351F, -0.2296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4F, -2.975F, 0.0868F, -0.2968F, 0.0016F));

		PartDefinition cube_r249 = Jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(67, 69).mirror().addBox(-0.7767F, 0.0606F, -0.2829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.1294F, 0.3701F, -6.6156F, -0.9773F, -0.0244F, 0.0148F));

		PartDefinition cube_r250 = Jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-0.3336F, -0.4272F, -2.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7325F, 0.746F, -5.0511F, 0.0192F, -0.2359F, 0.0686F));

		PartDefinition cube_r251 = Jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(69, 60).mirror().addBox(-0.3336F, -0.4617F, -1.6063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.7325F, 0.746F, -5.0511F, 0.0541F, -0.2359F, 0.0686F));

		PartDefinition cube_r252 = Jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-0.3336F, -0.408F, -0.9349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.7325F, 0.746F, -5.0511F, -0.007F, -0.2359F, 0.0686F));

		PartDefinition cube_r253 = Jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.585F, 0.8324F, -4.9127F, 0.0388F, -0.1979F, 0.0626F));

		PartDefinition cube_r254 = Jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-0.4872F, -0.2587F, -0.2855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8097F, 0.5704F, -3.955F, 0.1686F, -0.2322F, 0.0226F));

		PartDefinition cube_r255 = Jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-0.4966F, -0.2433F, -0.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.8097F, 0.5704F, -3.955F, -0.0069F, -0.2663F, 0.0349F));

		PartDefinition cube_r256 = Jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 48).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5155F, 0.2354F, -5.7523F, -0.2342F, -0.2382F, 0.049F));

		PartDefinition cube_r257 = Jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-0.5514F, -0.8815F, -2.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7325F, 0.746F, -5.0511F, -0.1092F, -0.323F, 0.0704F));

		PartDefinition cube_r258 = Jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.8517F, -1.6398F, -1.2159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1294F, 0.3701F, -6.6156F, -0.1832F, -0.0244F, 0.0148F));

		PartDefinition cube_r259 = Jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1101F, -0.352F, -7.7115F, 0.1223F, -0.0244F, 0.0148F));

		PartDefinition cube_r260 = Jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-0.7767F, -0.9022F, -1.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.1294F, 0.3701F, -6.6156F, 0.6458F, -0.0244F, 0.0148F));

		PartDefinition cube_r261 = Jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.3419F, -0.5729F, -1.9804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.7325F, 0.746F, -5.0511F, -0.0942F, -0.2359F, 0.0686F));

		PartDefinition cube_r262 = Jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(32, 67).mirror().addBox(-0.475F, -0.5063F, 0.4937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.4575F, 0.746F, -5.7511F, 0.1276F, -0.1837F, 0.0679F));

		PartDefinition cube_r263 = Jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(-0.4966F, -0.7763F, -0.851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8097F, 0.5704F, -3.955F, 0.3858F, -0.2663F, 0.0349F));

		PartDefinition cube_r264 = Jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.3722F, -0.5338F, -1.782F, 0.0436F, -0.3142F, 0.0F));

		PartDefinition cube_r265 = Jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7276F, 0.6057F, -0.6882F, -0.0611F, 0.3142F, 0.0F));

		PartDefinition cube_r266 = Jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(55, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6297F, -0.0352F, -0.9896F, 0.0873F, 0.3142F, 0.0F));

		PartDefinition cube_r267 = Jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(24, 57).addBox(-0.8F, -0.7601F, -0.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3F, 0.4F, -2.975F, 0.0873F, 0.3142F, 0.0F));

		PartDefinition cube_r268 = Jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 57).addBox(-0.775F, -0.2351F, -0.2296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.3F, 0.4F, -2.975F, 0.0868F, 0.2968F, -0.0016F));

		PartDefinition cube_r269 = Jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(67, 69).addBox(-0.2233F, 0.0606F, -0.2829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1294F, 0.3701F, -6.6156F, -0.9773F, 0.0244F, -0.0148F));

		PartDefinition cube_r270 = Jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(62, 69).addBox(-0.6664F, -0.4272F, -2.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7325F, 0.746F, -5.0511F, 0.0192F, 0.2359F, -0.0686F));

		PartDefinition cube_r271 = Jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(69, 60).addBox(-0.6664F, -0.4617F, -1.6063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.7325F, 0.746F, -5.0511F, 0.0541F, 0.2359F, -0.0686F));

		PartDefinition cube_r272 = Jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(69, 57).addBox(-0.6664F, -0.408F, -0.9349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.7325F, 0.746F, -5.0511F, -0.007F, 0.2359F, -0.0686F));

		PartDefinition cube_r273 = Jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(37, 67).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.585F, 0.8324F, -4.9127F, 0.0388F, 0.1979F, -0.0626F));

		PartDefinition cube_r274 = Jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(74, 9).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(69, 54).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.164F)), PartPose.offsetAndRotation(0.9807F, 0.7805F, -3.1992F, 0.0698F, 0.1396F, 0.0F));

		PartDefinition cube_r275 = Jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5128F, -0.2587F, -0.2855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8097F, 0.5704F, -3.955F, 0.1686F, 0.2322F, -0.0226F));

		PartDefinition cube_r276 = Jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(20, 67).addBox(-0.5034F, -0.2433F, -0.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.8097F, 0.5704F, -3.955F, -0.0069F, 0.2663F, -0.0349F));

		PartDefinition cube_r277 = Jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5155F, 0.2354F, -5.7523F, -0.2342F, 0.2382F, -0.049F));

		PartDefinition cube_r278 = Jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(69, 45).addBox(-0.4486F, -0.8815F, -2.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7325F, 0.746F, -5.0511F, -0.1092F, 0.323F, -0.0704F));

		PartDefinition cube_r279 = Jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(51, 63).addBox(-0.1483F, -1.6398F, -1.2159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1294F, 0.3701F, -6.6156F, -0.1832F, 0.0244F, -0.0148F));

		PartDefinition cube_r280 = Jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(69, 42).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1101F, -0.352F, -7.7115F, 0.1223F, 0.0244F, -0.0148F));

		PartDefinition cube_r281 = Jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 74).addBox(-0.5F, -1.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(5, 74).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1308F, -0.0842F, -7.0227F, 1.2829F, 0.0244F, -0.0148F));

		PartDefinition cube_r282 = Jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(74, 0).addBox(-0.2233F, -0.745F, -0.6974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1294F, 0.3701F, -6.6156F, 0.9949F, 0.0244F, -0.0148F));

		PartDefinition cube_r283 = Jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 39).addBox(-0.2233F, -0.9022F, -1.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.1294F, 0.3701F, -6.6156F, 0.6458F, 0.0244F, -0.0148F));

		PartDefinition cube_r284 = Jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(56, 36).addBox(-0.6581F, -0.5729F, -1.9804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7325F, 0.746F, -5.0511F, -0.0942F, 0.2359F, -0.0686F));

		PartDefinition cube_r285 = Jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(32, 67).addBox(-0.525F, -0.5063F, 0.4937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.4575F, 0.746F, -5.7511F, 0.1276F, 0.1837F, -0.0679F));

		PartDefinition cube_r286 = Jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(52, 42).addBox(-0.5034F, -0.7763F, -0.851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8097F, 0.5704F, -3.955F, 0.3858F, 0.2663F, -0.0349F));

		PartDefinition cube_r287 = Jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 73).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5564F, -0.6349F, -1.215F, -0.3054F, 0.3142F, 0.0F));

		PartDefinition cube_r288 = Jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(50, 73).addBox(-0.3455F, -0.8692F, -0.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9239F, -0.7143F, -2.6821F, -2.6683F, 0.227F, -0.0337F));

		PartDefinition cube_r289 = Jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(45, 73).addBox(-0.3455F, -0.8595F, -0.1447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9177F, -0.6808F, -2.706F, -1.3067F, 0.3032F, -0.0142F));

		PartDefinition cube_r290 = Jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(69, 36).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.3722F, -0.5338F, -1.782F, 0.0436F, 0.3142F, 0.0F));

		PartDefinition cube_r291 = Jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(35, 73).addBox(-0.5F, -1.25F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F))
				.texOffs(73, 33).addBox(-0.5F, -0.65F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.9175F, 1.448F, -0.1036F, -0.3491F, 0.3142F, 0.0F));

		PartDefinition cube_r292 = Jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(57, 20).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F))
				.texOffs(31, 56).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(1.7276F, 0.3424F, -0.688F, -0.7418F, 0.3142F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 3.2877F, -3.5977F, 1.0003F, -0.0552F, 0.1188F));

		PartDefinition cube_r293 = RFrontLeg2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(64, 11).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, -0.48F));

		PartDefinition cube_r294 = RFrontLeg2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(10, 64).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, -0.48F));

		PartDefinition cube_r295 = RFrontLeg2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 64).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, -0.48F));

		PartDefinition cube_r296 = RFrontLeg2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5F, -0.675F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2612F, -0.4392F, 0.7653F, 0.8378F, 0.0F, -0.48F));

		PartDefinition cube_r297 = RFrontLeg2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(15, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2169F, -0.3542F, -0.2301F, 1.6668F, 0.0F, -0.48F));

		PartDefinition cube_r298 = RFrontLeg2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 63).addBox(-1.25F, -2.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, -0.2531F, 0.0F, -0.48F));

		PartDefinition cube_r299 = RFrontLeg2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(56, 63).addBox(-1.25F, -2.5F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, 0.096F, 0.0F, -0.48F));

		PartDefinition cube_r300 = RFrontLeg2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(38, 43).addBox(-1.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, -0.48F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -1.3776F, 0.0069F, -0.1095F));

		PartDefinition cube_r301 = LowerRFrontLeg2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 50).addBox(-1.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 0).addBox(0.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3819F, 3.0226F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r302 = LowerRFrontLeg2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(64, 20).addBox(-0.35F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1513F, -0.7504F, 0.0206F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create().texOffs(0, 38).addBox(-1.7F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1459F, 4.5825F, -1.191F, 0.7322F, 0.0214F, -0.0583F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.7F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, 0.3927F, 0.0F, 0.0F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 3.2877F, -3.5977F, 0.4767F, 0.0552F, -0.1188F));

		PartDefinition cube_r303 = RFrontLeg3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(64, 11).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, 0.48F));

		PartDefinition cube_r304 = RFrontLeg3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, 0.48F));

		PartDefinition cube_r305 = RFrontLeg3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, 0.48F));

		PartDefinition cube_r306 = RFrontLeg3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.5F, -0.675F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2612F, -0.4392F, 0.7653F, 0.8378F, 0.0F, 0.48F));

		PartDefinition cube_r307 = RFrontLeg3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(61, 63).mirror().addBox(0.25F, -2.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, -0.2531F, 0.0F, 0.48F));

		PartDefinition cube_r308 = RFrontLeg3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(56, 63).mirror().addBox(0.25F, -2.5F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, 0.096F, 0.0F, 0.48F));

		PartDefinition cube_r309 = RFrontLeg3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(0.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, 0.48F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.5486F, -0.0069F, 0.1095F));

		PartDefinition cube_r310 = LowerRFrontLeg3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(0.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 0).mirror().addBox(-1.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3819F, 3.0226F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r311 = LowerRFrontLeg3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-0.65F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1513F, -0.7504F, 0.0206F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.3F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, 4.5825F, -1.191F, 0.0777F, -0.0214F, 0.0583F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.3F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, -0.1309F, 0.0F, 0.0F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.5769F, 7.2014F));

		PartDefinition cube_r312 = sacrum.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(59, 40).addBox(-1.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.2976F, 0.5793F, -1.0384F, 0.3899F, 0.2203F));

		PartDefinition cube_r313 = sacrum.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(71, 6).addBox(-0.9081F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.3506F, -0.3905F, 0.0874F));

		PartDefinition cube_r314 = sacrum.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(5, 71).addBox(-0.9081F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.6997F, -0.3905F, 0.0874F));

		PartDefinition cube_r315 = sacrum.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(71, 3).addBox(-0.9081F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -2.3542F, -0.3905F, 0.0874F));

		PartDefinition cube_r316 = sacrum.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(12, 59).addBox(-0.8611F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.2443F));

		PartDefinition cube_r317 = sacrum.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(55, 70).addBox(-1.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 47).addBox(-1.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.0698F));

		PartDefinition cube_r318 = sacrum.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(50, 70).addBox(1.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r319 = sacrum.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(45, 70).addBox(1.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r320 = sacrum.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(40, 70).addBox(1.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r321 = sacrum.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(64, 38).addBox(1.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r322 = sacrum.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(35, 70).addBox(1.5F, -0.0817F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r323 = sacrum.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(74, 25).addBox(1.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(30, 70).addBox(1.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.1F, 0.5769F, 7.2014F));

		PartDefinition cube_r324 = sacrum2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(0.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.2976F, 0.5793F, -1.0384F, -0.3899F, -0.2203F));

		PartDefinition cube_r325 = sacrum2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-0.0919F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.3506F, 0.3905F, -0.0874F));

		PartDefinition cube_r326 = sacrum2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.0919F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.6997F, 0.3905F, -0.0874F));

		PartDefinition cube_r327 = sacrum2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-0.0919F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -2.3542F, 0.3905F, -0.0874F));

		PartDefinition cube_r328 = sacrum2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(-0.1389F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.2443F));

		PartDefinition cube_r329 = sacrum2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(0.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 47).mirror().addBox(0.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.0698F));

		PartDefinition cube_r330 = sacrum2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-2.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r331 = sacrum2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-2.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r332 = sacrum2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-2.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r333 = sacrum2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(-2.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r334 = sacrum2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-2.5F, -0.0817F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r335 = sacrum2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-2.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(30, 70).mirror().addBox(-2.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1495F, 1.707F, 10.0904F, 0.0502F, -0.1578F, -0.1579F));

		PartDefinition cube_r336 = RBackLeg2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 30).addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(72, 13).addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r337 = RBackLeg2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r338 = RBackLeg2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(71, 66).addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r339 = RBackLeg2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(71, 63).addBox(-0.5F, -1.7067F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(25, 71).addBox(-0.5F, -1.7067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 71).addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r340 = RBackLeg2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(45, 57).addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, 7.3429F, -0.3685F, 1.1255F, 0.0827F, 0.1941F));

		PartDefinition cube_r341 = LowerRBackLeg2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(60, 72).addBox(-0.4921F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 61).addBox(-0.4921F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.4478F, 1.4845F, -0.3452F));

		PartDefinition cube_r342 = LowerRBackLeg2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(31, 60).addBox(-0.4933F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.2297F, 1.4845F, -0.3016F));

		PartDefinition cube_r343 = LowerRBackLeg2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 47).addBox(-0.4933F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.2733F, 1.4845F, -0.3016F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create().texOffs(15, 7).addBox(-2.65F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3426F, 5.5429F, 0.3447F, -0.3721F, -0.0199F, 0.0356F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.65F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.4F, -0.6545F, 0.0F, 0.0F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1495F, 1.707F, 10.0904F, -0.4298F, 0.1578F, 0.1579F));

		PartDefinition cube_r344 = RBackLeg3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 30).mirror().addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(72, 13).mirror().addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r345 = RBackLeg3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r346 = RBackLeg3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r347 = RBackLeg3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-0.5F, -1.7067F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(25, 71).mirror().addBox(-0.5F, -1.7067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 71).mirror().addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r348 = RBackLeg3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, 7.3429F, -0.3685F, 0.6019F, -0.0827F, -0.1941F));

		PartDefinition cube_r349 = LowerRBackLeg3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(60, 72).mirror().addBox(-0.5079F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.5079F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.4478F, -1.4845F, 0.3452F));

		PartDefinition cube_r350 = LowerRBackLeg3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(31, 60).mirror().addBox(-0.5067F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.2297F, -1.4845F, 0.3016F));

		PartDefinition cube_r351 = LowerRBackLeg3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5067F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.2733F, -1.4845F, 0.3016F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create().texOffs(15, 7).mirror().addBox(-1.35F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3426F, 5.5429F, 0.3447F, -0.1103F, 0.0199F, -0.0356F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.35F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2763F, 11.7253F, -0.2082F, 0.0F, 0.0F));

		PartDefinition cube_r352 = Tail.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(77, 12).addBox(0.0F, -1.1117F, -0.0829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 3.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r353 = Tail.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(12, 77).addBox(0.0F, -1.4512F, -0.0878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 1.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Tail.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-0.9F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2664F, 0.9238F, -0.0699F, 0.0522F, -0.0037F));

		PartDefinition cube_r355 = Tail.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(47, 38).addBox(-0.1F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2664F, 0.9238F, -0.0699F, -0.0522F, 0.0037F));

		PartDefinition cube_r356 = Tail.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.5F, 3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 12).addBox(-1.0F, -0.5412F, 0.1096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, 3.766F, -0.1124F, -0.1735F, 0.0195F));

		PartDefinition cube_r357 = Tail2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(31, 53).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 3.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r358 = Tail2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(5, 47).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 1.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(-0.9F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.7088F, 1.1096F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r360 = Tail2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(48, 12).addBox(-0.1F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7088F, 1.1096F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(55, 4).addBox(0.0F, -1.1476F, 0.8727F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(30, 6).addBox(-0.5F, -0.5476F, -0.1273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.0447F, 4.1516F, -0.0808F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Tail3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-0.6F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0476F, 0.9727F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r362 = Tail3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 48).addBox(-0.4F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0476F, 0.9727F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r363 = Tail3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(23, 77).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4476F, 3.3727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.483F, -0.1206F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 77).addBox(0.0F, -0.883F, 0.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 30).addBox(0.0F, -0.783F, 2.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.056F, 3.8517F, -0.1383F, -0.1729F, 0.0239F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 3.8504F, 0.0231F, 0.349F, 0.0079F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(22, 32).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.013F, 3.9447F, 0.1159F, 0.3469F, 0.0396F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0011F, 3.8982F, 0.2119F, 0.3848F, 0.0806F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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