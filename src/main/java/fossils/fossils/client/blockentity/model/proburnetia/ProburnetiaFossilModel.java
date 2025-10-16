package fossils.fossils.client.blockentity.model.proburnetia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProburnetiaFossilModel extends SkullModelBase {
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

	public ProburnetiaFossilModel(ModelPart root) {
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

		PartDefinition main = proburnetia.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9005F, -3.3113F, -0.2236F, -0.0301F, -0.2161F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 56).addBox(0.0F, -2.0831F, 3.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 70).addBox(0.0F, -1.8831F, 1.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 70).addBox(0.0F, -1.8831F, -0.4056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 43).mirror().addBox(-1.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 43).addBox(0.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-0.5F, -0.6831F, -0.4056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5769F, 7.2014F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0186F, 6.9189F, -0.1312F, -0.0869F, 0.0076F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 52).addBox(0.0F, -1.5156F, 0.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2719F, 0.4778F, -0.0738F, -0.0268F, -0.732F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0082F, 0.003F, -0.6807F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0062F, 0.0062F, -1.117F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0738F, 0.0268F, -0.6273F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0556F, 0.0555F, -1.0631F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2719F, 0.4778F, -0.0738F, 0.0268F, 0.732F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(72, 11).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0062F, -0.0062F, 1.117F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0082F, -0.003F, 0.6807F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0738F, -0.0268F, 0.6273F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 12).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0556F, -0.0555F, 1.0631F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 70).addBox(0.0F, -1.8873F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 13).addBox(-0.5F, -0.7792F, 4.5939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0406F, -4.9571F, 0.0271F, -0.1802F, 0.0748F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 48).addBox(0.0F, -2.1594F, -0.0994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -1.0429F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 44).addBox(0.0F, -2.4792F, 1.5939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 70).addBox(0.0F, -2.4792F, -0.4061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 20).addBox(-0.5F, -0.7792F, -0.4061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -4.6429F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0738F, 0.0268F, -0.4877F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(59, 42).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0556F, 0.0555F, -0.9235F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.017F, 0.0767F, -1.4916F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1395F, 0.0506F, -0.4503F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1053F, 0.1047F, -0.8846F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 57).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.0323F, 0.1448F, -1.455F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 51).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.0519F, 0.2299F, -1.3466F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.1682F, 0.1658F, -0.7714F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.2219F, 0.0799F, -0.3402F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 71).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.017F, -0.0767F, 1.4916F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 42).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0556F, -0.0555F, 0.9235F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(71, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0738F, -0.0268F, 0.4877F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(58, 57).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.0323F, -0.1448F, 1.455F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 59).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1053F, -0.1047F, 0.8846F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1395F, -0.0506F, 0.4503F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(67, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.2219F, -0.0799F, 0.3402F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(58, 55).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.1682F, -0.1658F, 0.7714F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 51).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.0519F, -0.2299F, 1.3466F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -5.0172F, -0.0448F, -0.1701F, 0.0588F));

		PartDefinition cube_r35 = body3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 70).addBox(0.0F, -2.0119F, -0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 37).addBox(0.0F, -1.9037F, 5.0957F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(15, 6).addBox(-0.5F, -0.2037F, 4.0957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8F, -9.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(37, 30).mirror().addBox(-4.2294F, 0.1699F, 0.0119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4419F, 0.6849F, 0.2079F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-3.2295F, 0.1699F, -0.4881F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4332F, 0.2901F, 0.1388F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-2.6806F, 0.1656F, -0.279F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5069F, -0.0696F, 0.088F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(12, 52).mirror().addBox(-3.0107F, 0.1942F, -0.2976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 5.0314F, -1.886F, 0.4641F, 0.0597F, 0.1388F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-3.0F, 0.3F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.5064F, -0.0543F, 0.0965F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.0723F, 0.315F, -1.3411F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.2323F, 0.2263F, -0.7589F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.3046F, 0.1087F, -0.3324F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.1029F, 0.4338F, -1.3823F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.4214F, 0.1478F, -0.3698F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 57).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.3253F, 0.3093F, -0.7866F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.3046F, -0.1087F, 0.3324F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 58).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.2323F, -0.2263F, 0.7589F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 50).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.0723F, -0.315F, 1.3411F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(43, 57).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.3253F, -0.3093F, 0.7866F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.4214F, -0.1478F, 0.3698F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 41).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.1029F, -0.4338F, 1.3823F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -1.0037F, 0.0316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.4314F, -1.386F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 30).addBox(0.2294F, 0.1699F, 0.0119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4419F, -0.6849F, -0.2079F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(28, 18).addBox(0.2294F, 0.1699F, -0.4881F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4332F, -0.2901F, -0.1388F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(12, 52).addBox(0.0107F, 0.1942F, -0.2976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 5.0314F, -1.886F, 0.4641F, -0.0597F, -0.1388F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(53, 25).addBox(-0.3194F, 0.1656F, -0.279F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5069F, 0.0696F, -0.088F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(51, 49).addBox(0.0F, 0.3F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.5064F, 0.0543F, -0.0965F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5202F, -4.8266F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(36, 70).addBox(0.0F, -2.016F, -0.0837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -0.8959F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 33).addBox(0.0F, -1.7282F, 0.0028F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -2.9959F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.3795F, 0.134F, -0.4978F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.2916F, 0.2799F, -0.9186F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(59, 44).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.0916F, 0.3914F, -1.509F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.0702F, 0.3065F, -1.4465F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(43, 59).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2258F, 0.2203F, -0.865F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2963F, 0.1059F, -0.438F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 44).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.0916F, -0.3914F, 1.509F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 59).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.2916F, -0.2799F, 0.9186F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.3795F, -0.134F, 0.4978F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(51, 47).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.0702F, -0.3065F, 1.4465F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(43, 59).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2258F, -0.2203F, 0.865F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2963F, -0.1059F, 0.438F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 38).addBox(-1.5F, -1.0199F, -1.6716F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 3.631F, -5.7642F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(39, 14).addBox(-1.0F, -0.971F, -1.6926F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.331F, -3.8642F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 22).addBox(-0.5F, -0.5617F, -0.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.031F, -2.8642F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.7353F, -1.9788F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.2037F, 0.0957F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -4.0959F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.4499F, -4.3959F));

		PartDefinition cube_r80 = scapula.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(55, 61).addBox(-1.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 1.5037F, 0.1546F, 0.4863F));

		PartDefinition cube_r81 = scapula.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(28, 12).addBox(1.5F, -0.2037F, -2.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r82 = scapula.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(55, 12).addBox(-1.0F, -0.3371F, -1.9508F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 1.1983F, 0.1546F, 0.4863F));

		PartDefinition cube_r83 = scapula.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 2.1582F, 0.1546F, 0.4863F));

		PartDefinition cube_r84 = scapula.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(33, 54).addBox(-1.0F, -0.0407F, -1.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 0.8928F, 0.1546F, 0.4863F));

		PartDefinition cube_r85 = scapula.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(5, 52).addBox(1.5F, -0.1333F, -1.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offset(-0.8F, 0.4499F, -4.3959F));

		PartDefinition cube_r86 = scapula2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(0.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 1.5037F, -0.1546F, -0.4863F));

		PartDefinition cube_r87 = scapula2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(28, 12).mirror().addBox(-2.5F, -0.2037F, -2.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r88 = scapula2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(0.0F, -0.3371F, -1.9508F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 1.1983F, -0.1546F, -0.4863F));

		PartDefinition cube_r89 = scapula2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(0.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 2.1582F, -0.1546F, -0.4863F));

		PartDefinition cube_r90 = scapula2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(0.0F, -0.0407F, -1.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 0.8928F, -0.1546F, -0.4863F));

		PartDefinition cube_r91 = scapula2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-2.5F, -0.1333F, -1.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5237F, -3.9361F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(33, 70).addBox(0.0F, -1.423F, -0.9264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.544F, 0.4946F, -0.6662F));

		PartDefinition cube_r94 = Neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.2747F, 0.6722F, -1.1466F));

		PartDefinition cube_r95 = Neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.544F, -0.4946F, 0.6662F));

		PartDefinition cube_r96 = Neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 60).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.2747F, -0.6722F, 1.1466F));

		PartDefinition cube_r97 = Neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1324F, -1.5559F, 0.2589F, -0.2062F, -0.1269F));

		PartDefinition cube_r98 = Neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 28).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0474F, -0.5293F, 0.3978F, 0.7203F, -1.0043F));

		PartDefinition cube_r100 = Neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0474F, -0.5293F, 0.3978F, -0.7203F, 1.0043F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1636F, -1.984F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r101 = Neck4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 25).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 29).addBox(0.0F, -1.6352F, 0.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-0.5F, -0.3352F, -1.5347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Neck4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0838F, -2.7453F, 0.2989F, 1.0544F, -1.1005F));

		PartDefinition cube_r103 = Neck4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1162F, -0.7453F, 0.2376F, 0.9702F, -1.0979F));

		PartDefinition cube_r104 = Neck4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0838F, -2.7453F, 0.2989F, -1.0544F, 1.1005F));

		PartDefinition cube_r105 = Neck4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(53, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1162F, -0.7453F, 0.2376F, -0.9702F, 1.0979F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, -4.3019F, 0.3515F, -0.2354F, -0.262F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(20, 64).addBox(-1.0F, -1.0282F, -1.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.7679F, -5.6382F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 64).addBox(-1.0F, -0.0043F, -2.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 52).addBox(-1.0F, -0.0043F, -2.0199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7524F, -5.0507F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 17).addBox(-1.0F, -0.2355F, -0.2741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.8897F, -1.9102F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 8).addBox(-1.0F, -0.2249F, -0.1867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5F, -1.6897F, -3.5102F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 64).addBox(-1.0F, -0.2225F, -0.1983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.5647F, -4.0852F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, -0.2223F, -0.2131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5F, -1.3647F, -4.6352F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.2036F, -0.2097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.9645F, -5.3329F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(62, 64).addBox(-1.0F, -0.2194F, -0.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -0.7645F, -5.9329F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 4).addBox(-1.0F, -0.2076F, -0.8069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -0.4895F, -6.4329F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 64).addBox(-1.0F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3395F, -6.0079F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(35, 64).addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.0147F, -4.6352F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(65, 7).addBox(-1.0F, -0.0302F, 0.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0524F, -4.1507F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 61).addBox(-1.0F, 0.9206F, 0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5274F, -5.6257F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 17).addBox(-1.0F, -0.2516F, 1.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 32).addBox(-2.0F, -0.0266F, 0.0348F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5583F, -2.164F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(44, 37).addBox(-2.0F, -0.0479F, 0.0624F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4833F, -3.189F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 9).addBox(-1.5F, -0.725F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6833F, -3.089F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7874F, -0.4107F, 0.2959F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.842F, 1.9614F, -4.2003F, 0.2618F, 0.2269F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 70).addBox(-0.475F, -0.4134F, -0.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1335F, 2.0829F, -5.3517F, 0.1745F, 0.2269F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 20).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.4865F, 1.9957F, -7.3303F, 0.1745F, 0.1396F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(25, 67).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1335F, 2.0829F, -5.3517F, -0.0436F, 0.2269F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.925F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3609F, 1.96F, -6.4367F, 0.1309F, 0.1396F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 64).addBox(-0.4851F, -0.2034F, -0.0759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(65, 14).addBox(-0.4851F, -0.2034F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.5439F, 1.2401F, -6.5646F, -0.1309F, 0.1396F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 21).addBox(-0.4851F, -0.777F, -0.8029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-1.5439F, 1.2401F, -6.5646F, 0.3054F, 0.1396F, 0.0F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 57).addBox(-1.0F, -1.1245F, -0.8673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.4624F, 1.227F, -4.2771F, 0.1222F, 0.2793F, 0.0F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 4).addBox(-1.0F, -0.9912F, -1.6559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-0.4624F, 1.227F, -4.2771F, -0.0524F, 0.2793F, 0.0F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(11, 39).addBox(-1.0F, -1.5062F, -1.1592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-0.4624F, 1.227F, -4.2771F, 0.3054F, 0.2793F, 0.0F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 23).addBox(-0.5F, -0.7854F, 0.052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.9736F, -0.8377F, 0.0604F, 0.5683F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(35, 37).addBox(-0.5F, -1.4527F, -2.6877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.9736F, 1.1258F, 0.0604F, 0.5683F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(24, 57).addBox(-0.5F, -0.963F, -0.1377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.4624F, 0.8262F, -2.1379F, -0.0087F, 0.2182F, 0.0F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.9577F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.4624F, 0.8262F, -2.1379F, -0.2269F, 0.2182F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 70).addBox(-0.525F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3671F, 1.2817F, -7.1935F, -1.7601F, 0.0416F, 0.019F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 6).addBox(-0.3058F, -0.4867F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(60, 67).addBox(-0.4808F, -0.4867F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, -1.5095F, 0.2463F, 0.0315F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(55, 67).addBox(-0.5308F, -0.1348F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 67).addBox(-0.5308F, -0.4348F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, -0.8551F, 0.2463F, 0.0315F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(65, 29).addBox(-0.5308F, -0.9386F, -0.4246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, -0.026F, 0.2463F, 0.0315F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 26).addBox(-0.5308F, -0.5596F, -0.0758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, 0.515F, 0.2463F, 0.0315F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(40, 67).addBox(-0.5308F, -0.0139F, -0.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, 1.0386F, 0.2463F, 0.0315F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.2847F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1813F, 1.137F, -0.6983F, -1.7194F, 0.1539F, -0.6181F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 67).addBox(-0.5F, -0.7181F, -0.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.1813F, 1.137F, -0.6983F, -1.0213F, 0.1539F, -0.6181F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(12, 60).addBox(-0.4887F, -0.8278F, -0.2369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(60, 8).addBox(-0.4887F, -0.5028F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0662F, 0.5251F, -0.4547F, -0.4984F, 0.2505F, -0.0953F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(67, 64).addBox(-0.4887F, -0.7104F, 0.0033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0662F, 0.5251F, -0.4547F, 0.6012F, 0.2505F, -0.0953F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(35, 67).addBox(-0.5308F, -0.0996F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, 0.3405F, 0.2463F, 0.0315F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5308F, -0.0476F, -0.7165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, -0.2355F, 0.2463F, 0.0315F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 23).addBox(-0.5308F, -0.5398F, -1.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.4074F, 0.0166F, -2.6373F, 0.3318F, 0.2463F, 0.0315F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(37, 24).addBox(-0.5963F, -0.6015F, -0.7045F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.7874F, 0.5405F, -3.9653F, 0.3307F, 0.1983F, 0.0094F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(18, 47).addBox(-0.9828F, -1.9839F, -1.8567F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.614F, 1.4166F, -1.6686F, -0.3859F, 0.3142F, -0.6303F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(46, 32).addBox(-0.0201F, -2.0875F, -2.1991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8342F, 2.9001F, 0.016F, -0.6367F, 0.1496F, -0.6153F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, -0.7579F, -0.5723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.9736F, -0.7068F, 0.0604F, 0.5683F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 64).addBox(-0.5F, -0.8126F, -1.1908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.9736F, -0.5759F, 0.0604F, 0.5683F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 14).addBox(-0.5F, -1.3706F, -0.6026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0374F, -1.2996F, -1.9736F, 0.6458F, 0.0604F, 0.5683F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(53, 4).addBox(-0.5F, -0.351F, -1.1744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3558F, -0.8609F, 1.0916F, 0.9172F, 0.4138F, -0.0402F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(52, 43).addBox(-0.5F, -0.7163F, -0.9235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3558F, -0.8609F, 1.0916F, 0.3936F, 0.4138F, -0.0402F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(53, 32).addBox(-0.6874F, -1.0987F, -1.6866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2697F, 0.8983F, 0.2011F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(20, 42).addBox(-0.4874F, -1.0987F, -1.6866F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2793F, 0.24F, -0.0873F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 31).addBox(-0.4874F, -0.8027F, -2.782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.24F, -0.0873F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 41).addBox(-0.4874F, -0.0674F, -1.7733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.24F, -0.0873F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 18).addBox(-0.4874F, 0.5187F, -1.5516F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.24F, -0.0873F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7874F, -0.4107F, 0.2959F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.842F, 1.9614F, -4.2003F, 0.2618F, -0.2269F, 0.0F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.525F, -0.4134F, -0.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1335F, 2.0829F, -5.3517F, 0.1745F, -0.2269F, 0.0F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.4865F, 1.9957F, -7.3303F, 0.1745F, -0.1396F, 0.0F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1335F, 2.0829F, -5.3517F, -0.0436F, -0.2269F, 0.0F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.5F, -0.925F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3609F, 1.96F, -6.4367F, 0.1309F, -0.1396F, 0.0F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-0.5149F, -0.2034F, -0.0759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(65, 14).mirror().addBox(-0.5149F, -0.2034F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(1.5439F, 1.2401F, -6.5646F, -0.1309F, -0.1396F, 0.0F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(53, 21).mirror().addBox(-0.5149F, -0.777F, -0.8029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(1.5439F, 1.2401F, -6.5646F, 0.3054F, -0.1396F, 0.0F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(0.0F, -1.1245F, -0.8673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 1.227F, -4.2771F, 0.1222F, -0.2793F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(0.0F, -0.9912F, -1.6559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 1.227F, -4.2771F, -0.0524F, -0.2793F, 0.0F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(0.0F, -1.5062F, -1.1592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 1.227F, -4.2771F, 0.3054F, -0.2793F, 0.0F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-0.5F, -0.7854F, 0.052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.9736F, -0.8377F, -0.0604F, -0.5683F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 37).mirror().addBox(-0.5F, -1.4527F, -2.6877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.9736F, 1.1258F, -0.0604F, -0.5683F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-0.5F, -0.963F, -0.1377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 0.8262F, -2.1379F, -0.0087F, -0.2182F, 0.0F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-0.5F, -0.9577F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.4624F, 0.8262F, -2.1379F, -0.2269F, -0.2182F, 0.0F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.475F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3671F, 1.2817F, -7.1935F, -1.7601F, -0.0416F, -0.019F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-0.6942F, -0.4867F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(60, 67).mirror().addBox(-0.5192F, -0.4867F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, -1.5095F, -0.2463F, -0.0315F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(55, 67).mirror().addBox(-0.4692F, -0.1348F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(50, 67).mirror().addBox(-0.4692F, -0.4348F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, -0.8551F, -0.2463F, -0.0315F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-0.4692F, -0.9386F, -0.4246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, -0.026F, -0.2463F, -0.0315F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-0.4692F, -0.5596F, -0.0758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, 0.515F, -0.2463F, -0.0315F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-0.4692F, -0.0139F, -0.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, 1.0386F, -0.2463F, -0.0315F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.2847F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1813F, 1.137F, -0.6983F, -1.7194F, -0.1539F, 0.6181F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-0.5F, -0.7181F, -0.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.1813F, 1.137F, -0.6983F, -1.0213F, -0.1539F, 0.6181F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-0.5113F, -0.8278F, -0.2369F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(60, 8).mirror().addBox(-0.5113F, -0.5028F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0662F, 0.5251F, -0.4547F, -0.4984F, -0.2505F, 0.0953F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-0.5113F, -0.7104F, 0.0033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0662F, 0.5251F, -0.4547F, 0.6012F, -0.2505F, 0.0953F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(-0.4692F, -0.0996F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, 0.3405F, -0.2463F, -0.0315F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.4692F, -0.0476F, -0.7165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, -0.2355F, -0.2463F, -0.0315F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(65, 23).mirror().addBox(-0.4692F, -0.5398F, -1.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.4074F, 0.0166F, -2.6373F, 0.3318F, -0.2463F, -0.0315F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-0.4037F, -0.6015F, -0.7045F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.7874F, 0.5405F, -3.9653F, 0.3307F, -0.1983F, -0.0094F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(-0.0172F, -1.9839F, -1.8567F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.614F, 1.4166F, -1.6686F, -0.3859F, -0.3142F, 0.6303F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-0.9799F, -2.0875F, -2.1991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8342F, 2.9001F, 0.016F, -0.6367F, -0.1496F, 0.6153F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-0.5F, -0.7579F, -0.5723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.9736F, -0.7068F, -0.0604F, -0.5683F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.5F, -0.8126F, -1.1908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.9736F, -0.5759F, -0.0604F, -0.5683F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-0.5F, -1.3706F, -0.6026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0374F, -1.2996F, -1.9736F, 0.6458F, -0.0604F, -0.5683F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(53, 4).mirror().addBox(-0.5F, -0.351F, -1.1744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.3558F, -0.8609F, 1.0916F, 0.9172F, -0.4138F, 0.0402F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-0.5F, -0.7163F, -0.9235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3558F, -0.8609F, 1.0916F, 0.3936F, -0.4138F, 0.0402F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-0.3126F, -1.0987F, -1.6866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2697F, -0.8983F, -0.2011F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(20, 42).mirror().addBox(-0.5126F, -1.0987F, -1.6866F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2793F, -0.24F, 0.0873F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.5126F, -0.8027F, -2.782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.24F, 0.0873F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5126F, -0.0674F, -1.7733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, -0.24F, 0.0873F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-0.5126F, 0.5187F, -1.5516F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, -0.24F, 0.0873F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6767F, 0.2173F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 53).mirror().addBox(-0.2F, -0.3346F, 1.3102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5F, -2.975F, -0.0175F, -0.3142F, 0.0F));

		PartDefinition cube_r203 = Jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(39, 53).mirror().addBox(-0.2F, -0.1601F, -0.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5F, -2.975F, 0.0873F, -0.3142F, 0.0F));

		PartDefinition cube_r204 = Jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(65, 61).mirror().addBox(-0.0437F, 0.0803F, -0.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.675F, 0.9031F, -6.4896F, -0.5149F, -0.0611F, 0.0F));

		PartDefinition cube_r205 = Jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(-0.1419F, 0.4987F, -1.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, -0.0785F, -0.2793F, 0.0F));

		PartDefinition cube_r206 = Jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-0.1419F, -0.4562F, -1.8769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.5672F, -0.2793F, 0.0F));

		PartDefinition cube_r207 = Jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-0.1419F, -0.2952F, -1.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.4363F, -0.2793F, 0.0F));

		PartDefinition cube_r208 = Jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.1419F, -0.1557F, -0.5402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.0698F, -0.2793F, 0.0F));

		PartDefinition cube_r209 = Jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-0.1F, 0.7499F, -1.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0969F, -3.0896F, 0.0698F, -0.1396F, 0.0F));

		PartDefinition cube_r210 = Jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.1F, 0.325F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(65, 32).mirror().addBox(-0.1F, 0.525F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0969F, -3.0896F, 0.4189F, -0.1396F, 0.0F));

		PartDefinition cube_r211 = Jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.5F, 0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 67).addBox(1.5F, 0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.0056F, -3.0489F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9255F, 0.2005F, -3.5918F, 0.192F, -0.1396F, 0.0F));

		PartDefinition cube_r213 = Jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-0.1F, -0.4467F, -2.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0969F, -3.0896F, 0.3229F, -0.1396F, 0.0F));

		PartDefinition cube_r214 = Jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.1419F, -1.0266F, -1.2358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.3229F, -0.2793F, 0.0F));

		PartDefinition cube_r215 = Jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4312F, 0.7801F, -5.6844F, 0.1484F, -0.2793F, 0.0F));

		PartDefinition cube_r216 = Jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(-0.0437F, -0.7403F, -0.5396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.675F, 0.9031F, -6.4896F, 0.192F, -0.0611F, 0.0F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(66, 41).mirror().addBox(-0.0437F, -0.6467F, -1.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 49).mirror().addBox(-0.0437F, -0.2717F, -0.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.675F, 0.9031F, -6.4896F, 0.4974F, -0.0611F, 0.0F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(-0.1419F, -0.4752F, -2.412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.1134F, -0.2793F, 0.0F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-0.1419F, -0.7031F, -0.7952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.9031F, -4.3896F, 0.4189F, -0.2793F, 0.0F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 51).mirror().addBox(-0.1F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0969F, -3.0896F, 0.3316F, -0.1396F, 0.0F));

		PartDefinition cube_r221 = Jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-0.2F, -0.7575F, -0.2034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5F, -2.975F, 0.0436F, -0.3142F, 0.0F));

		PartDefinition cube_r222 = Jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-0.2F, -1.3432F, 1.1484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5F, -2.975F, -0.3491F, -0.3142F, 0.0F));

		PartDefinition cube_r223 = Jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(46, 53).addBox(-0.8F, -0.3346F, 1.3102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.3F, 0.5F, -2.975F, -0.0175F, 0.3142F, 0.0F));

		PartDefinition cube_r224 = Jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(39, 53).addBox(-0.8F, -0.1601F, -0.1796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3F, 0.5F, -2.975F, 0.0873F, 0.3142F, 0.0F));

		PartDefinition cube_r225 = Jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 61).addBox(-0.9563F, 0.0803F, -0.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.675F, 0.9031F, -6.4896F, -0.5149F, 0.0611F, 0.0F));

		PartDefinition cube_r226 = Jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(65, 58).addBox(-0.8581F, 0.4987F, -1.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, -0.0785F, 0.2793F, 0.0F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(65, 55).addBox(-0.8581F, -0.4562F, -1.8769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.5672F, 0.2793F, 0.0F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(65, 52).addBox(-0.8581F, -0.2952F, -1.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.4363F, 0.2793F, 0.0F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(65, 38).addBox(-0.8581F, -0.1557F, -0.5402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.0698F, 0.2793F, 0.0F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(65, 35).addBox(-0.9F, 0.7499F, -1.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, -0.0969F, -3.0896F, 0.0698F, 0.1396F, 0.0F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(67, 0).addBox(-0.9F, 0.325F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(65, 32).addBox(-0.9F, 0.525F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.4F, -0.0969F, -3.0896F, 0.4189F, 0.1396F, 0.0F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(20, 67).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9255F, 0.2005F, -3.5918F, 0.192F, 0.1396F, 0.0F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(67, 10).addBox(-0.9F, -0.4467F, -2.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -0.0969F, -3.0896F, 0.3229F, 0.1396F, 0.0F));

		PartDefinition cube_r234 = Jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(10, 67).addBox(-0.8581F, -1.0266F, -1.2358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.3229F, 0.2793F, 0.0F));

		PartDefinition cube_r235 = Jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(5, 67).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4312F, 0.7801F, -5.6844F, 0.1484F, 0.2793F, 0.0F));

		PartDefinition cube_r236 = Jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(45, 66).addBox(-0.9563F, -0.7403F, -0.5396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.675F, 0.9031F, -6.4896F, 0.192F, 0.0611F, 0.0F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(66, 41).addBox(-0.9563F, -0.6467F, -1.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 49).addBox(-0.9563F, -0.2717F, -0.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.675F, 0.9031F, -6.4896F, 0.4974F, 0.0611F, 0.0F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(12, 54).addBox(-0.8581F, -0.4752F, -2.412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.1134F, 0.2793F, 0.0F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(65, 46).addBox(-0.8581F, -0.7031F, -0.7952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.175F, 0.9031F, -4.3896F, 0.4189F, 0.2793F, 0.0F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(53, 51).addBox(-0.9F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.4F, -0.0969F, -3.0896F, 0.3316F, 0.1396F, 0.0F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(53, 36).addBox(-0.8F, -0.7575F, -0.2034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.3F, 0.5F, -2.975F, 0.0436F, 0.3142F, 0.0F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(48, 13).addBox(-0.8F, -1.3432F, 1.1484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(1.3F, 0.5F, -2.975F, -0.3491F, 0.3142F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 3.2877F, -3.5977F, 1.0895F, 0.0197F, 0.0114F));

		PartDefinition cube_r243 = RFrontLeg2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(60, 27).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, -0.48F));

		PartDefinition cube_r244 = RFrontLeg2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(60, 18).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, -0.48F));

		PartDefinition cube_r245 = RFrontLeg2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(17, 60).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, -0.48F));

		PartDefinition cube_r246 = RFrontLeg2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(70, 3).addBox(-0.5F, -0.675F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2612F, -0.4392F, 0.7653F, 0.8378F, 0.0F, -0.48F));

		PartDefinition cube_r247 = RFrontLeg2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2169F, -0.3542F, -0.2301F, 1.6668F, 0.0F, -0.48F));

		PartDefinition cube_r248 = RFrontLeg2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(5, 56).addBox(-1.25F, -2.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, -0.2531F, 0.0F, -0.48F));

		PartDefinition cube_r249 = RFrontLeg2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(55, 0).addBox(-1.25F, -2.5F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, 0.096F, 0.0F, -0.48F));

		PartDefinition cube_r250 = RFrontLeg2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(39, 5).addBox(-1.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, -0.48F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -0.9903F, 0.0419F, -0.1344F));

		PartDefinition cube_r251 = LowerRFrontLeg2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(34, 47).addBox(-1.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 46).addBox(0.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3819F, 3.0225F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r252 = LowerRFrontLeg2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(12, 48).addBox(-0.35F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1513F, -0.7504F, 0.0206F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create().texOffs(0, 37).addBox(-1.7F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1459F, 4.5825F, -1.191F, 0.1114F, 0.0082F, -0.019F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.7F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offset(0.0F, 0.5649F, -0.9039F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 3.2877F, -3.5977F, 0.8238F, 0.0681F, -0.1132F));

		PartDefinition cube_r253 = RFrontLeg3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(60, 27).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, 0.48F));

		PartDefinition cube_r254 = RFrontLeg3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, 0.48F));

		PartDefinition cube_r255 = RFrontLeg3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, 0.48F));

		PartDefinition cube_r256 = RFrontLeg3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(70, 3).mirror().addBox(-0.5F, -0.675F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2612F, -0.4392F, 0.7653F, 0.8378F, 0.0F, 0.48F));

		PartDefinition cube_r257 = RFrontLeg3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2169F, -0.3542F, -0.2301F, 1.6668F, 0.0F, 0.48F));

		PartDefinition cube_r258 = RFrontLeg3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(0.25F, -2.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, -0.2531F, 0.0F, 0.48F));

		PartDefinition cube_r259 = RFrontLeg3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(0.25F, -2.5F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, 0.096F, 0.0F, 0.48F));

		PartDefinition cube_r260 = RFrontLeg3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(39, 5).mirror().addBox(0.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, 0.48F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.9903F, -0.0419F, 0.1344F));

		PartDefinition cube_r261 = LowerRFrontLeg3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(0.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(-1.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3819F, 3.0225F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r262 = LowerRFrontLeg3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(12, 48).mirror().addBox(-0.65F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1513F, -0.7504F, 0.0206F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.3F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, 4.5825F, -1.191F, 0.3296F, -0.0082F, 0.019F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.3F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offset(0.0F, 0.5649F, -0.9039F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.5769F, 7.2014F));

		PartDefinition cube_r263 = sacrum.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(53, 55).addBox(-1.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.2976F, 0.5793F, -1.0384F, 0.3899F, 0.2203F));

		PartDefinition cube_r264 = sacrum.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(70, 22).addBox(-0.9081F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.3506F, -0.3905F, 0.0874F));

		PartDefinition cube_r265 = sacrum.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(20, 70).addBox(-0.9081F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.6997F, -0.3905F, 0.0874F));

		PartDefinition cube_r266 = sacrum.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(25, 70).addBox(-0.9081F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -2.3542F, -0.3905F, 0.0874F));

		PartDefinition cube_r267 = sacrum.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(55, 27).addBox(-0.8611F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.2443F));

		PartDefinition cube_r268 = sacrum.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(70, 19).addBox(-1.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 35).addBox(-1.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.0698F));

		PartDefinition cube_r269 = sacrum.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(10, 64).addBox(1.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r270 = sacrum.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(5, 64).addBox(1.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r271 = sacrum.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 63).addBox(1.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r272 = sacrum.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(60, 31).addBox(1.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r273 = sacrum.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(15, 70).addBox(1.5F, -0.0818F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r274 = sacrum.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 62).addBox(1.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(60, 61).addBox(1.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.1F, 0.5769F, 7.2014F));

		PartDefinition cube_r275 = sacrum2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(53, 55).mirror().addBox(0.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.2976F, 0.5793F, -1.0384F, -0.3899F, -0.2203F));

		PartDefinition cube_r276 = sacrum2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-0.0919F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.3506F, 0.3905F, -0.0874F));

		PartDefinition cube_r277 = sacrum2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.0919F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.6997F, 0.3905F, -0.0874F));

		PartDefinition cube_r278 = sacrum2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.0919F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -2.3542F, 0.3905F, -0.0874F));

		PartDefinition cube_r279 = sacrum2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-0.1389F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.2443F));

		PartDefinition cube_r280 = sacrum2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(0.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 35).mirror().addBox(0.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.0698F));

		PartDefinition cube_r281 = sacrum2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-2.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r282 = sacrum2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-2.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r283 = sacrum2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-2.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r284 = sacrum2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-2.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r285 = sacrum2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-2.5F, -0.0818F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r286 = sacrum2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-2.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(60, 61).mirror().addBox(-2.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1495F, 1.707F, 10.0904F, -1.1579F, -0.3702F, -0.2097F));

		PartDefinition cube_r287 = RBackLeg2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 61).addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(37, 61).addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r288 = RBackLeg2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r289 = RBackLeg2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(60, 49).addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r290 = RBackLeg2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(60, 52).addBox(-0.5F, -1.7066F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(50, 60).addBox(-0.5F, -1.7066F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 46).addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r291 = RBackLeg2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(39, 47).addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, 7.3429F, -0.3685F, 1.8623F, -0.1154F, 0.1229F));

		PartDefinition cube_r292 = LowerRBackLeg2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(60, 39).addBox(-0.4921F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 53).addBox(-0.4921F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.4478F, 1.4845F, -0.3452F));

		PartDefinition cube_r293 = LowerRBackLeg2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(28, 52).addBox(-0.4933F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.2297F, 1.4845F, -0.3016F));

		PartDefinition cube_r294 = LowerRBackLeg2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(29, 42).addBox(-0.4933F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1107F, 3.2952F, 0.1598F, -0.2733F, 1.4845F, -0.3016F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create().texOffs(0, 12).addBox(-2.65F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3426F, 5.5429F, 0.3447F, -0.3701F, 0.0437F, 0.1988F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.65F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1495F, 1.707F, 10.0904F, -1.2087F, 0.674F, 0.163F));

		PartDefinition cube_r295 = RBackLeg3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 61).mirror().addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(37, 61).mirror().addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r296 = RBackLeg3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r297 = RBackLeg3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r298 = RBackLeg3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-0.5F, -1.7066F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(50, 60).mirror().addBox(-0.5F, -1.7066F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 46).mirror().addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r299 = RBackLeg3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(39, 47).mirror().addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, 7.3429F, -0.3685F, 2.5175F, -0.1354F, -0.198F));

		PartDefinition cube_r300 = LowerRBackLeg3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(-0.5079F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-0.5079F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.4478F, -1.4845F, 0.3452F));

		PartDefinition cube_r301 = LowerRBackLeg3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-0.5067F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.2297F, -1.4845F, 0.3016F));

		PartDefinition cube_r302 = LowerRBackLeg3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(29, 42).mirror().addBox(-0.5067F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2952F, 0.1598F, -0.2733F, -1.4845F, 0.3016F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.35F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3426F, 5.5429F, 0.3447F, -1.0702F, 0.0197F, -0.0361F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.35F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2763F, 11.7253F, -0.2082F, 0.0F, 0.0F));

		PartDefinition cube_r303 = Tail.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(70, 60).addBox(0.0F, -1.1117F, -0.0829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 3.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Tail.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(59, 70).addBox(0.0F, -1.4512F, -0.0878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 1.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r305 = Tail.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(43, 43).mirror().addBox(-0.9F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2664F, 0.9238F, -0.0699F, 0.0522F, -0.0037F));

		PartDefinition cube_r306 = Tail.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(43, 43).addBox(-0.1F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2664F, 0.9238F, -0.0699F, -0.0522F, 0.0037F));

		PartDefinition cube_r307 = Tail.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -0.5F, 3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(24, 32).addBox(-1.0F, -0.5412F, 0.1096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, 3.766F, 0.0202F, 0.0F, 0.0F));

		PartDefinition cube_r308 = Tail2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(72, 69).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 3.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r309 = Tail2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(50, 57).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 1.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r310 = Tail2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(-0.9F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.7088F, 1.1096F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r311 = Tail2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(44, 5).addBox(-0.1F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7088F, 1.1096F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 47).addBox(0.0F, -1.1476F, 0.8727F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(28, 6).addBox(-0.5F, -0.5476F, -0.1273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.0447F, 4.1516F, 0.1374F, 0.0F, 0.0F));

		PartDefinition cube_r312 = Tail3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.6F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0476F, 0.9727F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r313 = Tail3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(9, 44).addBox(-0.4F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0476F, 0.9727F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r314 = Tail3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(72, 72).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4476F, 3.3727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.483F, -0.1206F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(0.0F, -0.883F, 0.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 73).addBox(0.0F, -0.783F, 2.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.056F, 3.8517F, 0.2171F, 0.1667F, 0.0521F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(26, 20).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 3.8504F, 0.0243F, 0.2169F, 0.0241F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0131F, 3.9447F, -0.1023F, 0.3469F, 0.0396F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0011F, 3.8982F, 0.0219F, 0.1309F, 0.0029F));

		return LayerDefinition.create(meshdefinition, 76, 76);
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