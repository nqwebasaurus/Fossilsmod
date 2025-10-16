package fossils.fossils.client.blockentity.model.hipposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HipposaurusFossilModel extends SkullModelBase {
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

	public HipposaurusFossilModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition proburnetia = fossil.addOrReplaceChild("proburnetia", CubeListBuilder.create(), PartPose.offset(0.5F, -12.1F, 3.0F));

		PartDefinition main = proburnetia.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1995F, -3.3105F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 21).addBox(0.0F, -2.0831F, 3.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 68).addBox(0.0F, -1.8831F, 1.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 17).addBox(0.0F, -1.8831F, -0.4056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).mirror().addBox(-1.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 38).addBox(0.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-0.5F, -0.6831F, -0.4056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5769F, 7.2014F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0186F, 6.9189F, -0.0701F, -0.0871F, 0.0061F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 33).addBox(0.0F, -1.5156F, 0.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2719F, 0.4778F, -0.0738F, -0.0268F, -0.732F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0062F, 0.0062F, -1.117F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0719F, -1.5222F, 0.0082F, 0.003F, -0.6807F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0738F, 0.0268F, -0.6273F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0281F, -3.5222F, 0.0556F, 0.0555F, -1.0631F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2719F, 0.4778F, -0.0738F, 0.0268F, 0.732F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 36).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0062F, -0.0062F, 1.117F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0719F, -1.5222F, 0.0082F, -0.003F, 0.6807F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0738F, -0.0268F, 0.6273F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 47).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0281F, -3.5222F, 0.0556F, -0.0555F, 1.0631F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 68).addBox(0.0F, -1.8873F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.7792F, 4.5939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0406F, -4.9571F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 42).addBox(0.0F, -2.1594F, -0.0994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -1.0429F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 37).addBox(0.0F, -2.4792F, 1.5939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 40).addBox(0.0F, -2.4792F, -0.4061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(-0.5F, -0.7792F, -0.4061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -4.6429F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.017F, 0.0767F, -1.4916F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0556F, 0.0555F, -0.9235F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1875F, -0.5651F, 0.0738F, 0.0268F, -0.4877F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.0323F, 0.1448F, -1.455F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 13).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1053F, 0.1047F, -0.8846F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(37, 27).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2875F, -2.4651F, 0.1395F, 0.0506F, -0.4503F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.2219F, 0.0799F, -0.3402F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.1682F, 0.1658F, -0.7714F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(42, 35).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3875F, -4.4651F, 0.0519F, 0.2299F, -1.3466F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 69).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.017F, -0.0767F, 1.4916F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(55, 20).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0556F, -0.0555F, 0.9235F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1875F, -0.5651F, 0.0738F, -0.0268F, 0.4877F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 21).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.0323F, -0.1448F, 1.455F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 13).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1053F, -0.1047F, 0.8846F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(37, 27).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2875F, -2.4651F, 0.1395F, -0.0506F, 0.4503F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.2219F, -0.0799F, 0.3402F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 49).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.1682F, -0.1658F, 0.7714F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(42, 35).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -4.4651F, 0.0519F, -0.2299F, 1.3466F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -5.0172F, -0.0175F, -0.0436F, 0.0008F));

		PartDefinition cube_r35 = body3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 68).addBox(0.0F, -2.012F, -0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(68, 9).addBox(0.0F, -1.9037F, 5.0957F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(13, 12).addBox(-0.5F, -0.2037F, 4.0957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8F, -9.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.3046F, -0.1087F, 0.3324F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.3046F, 0.1087F, -0.3324F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.2323F, 0.2263F, -0.7589F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(44, 19).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1641F, -1.4479F, 0.0723F, 0.315F, -1.3411F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.3253F, 0.3093F, -0.7866F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.4214F, 0.1478F, -0.3698F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3641F, -3.4479F, 0.1029F, 0.4338F, -1.3823F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(37, 21).mirror().addBox(-4.2294F, 0.1699F, 0.0119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4419F, 0.6849F, 0.2079F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(16, 44).mirror().addBox(-3.2295F, 0.1699F, -0.4881F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.8314F, -0.986F, 0.4332F, 0.2901F, 0.1388F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(44, 15).mirror().addBox(-3.0107F, 0.1942F, -0.2976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 5.0314F, -1.886F, 0.4641F, 0.0597F, 0.1388F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 43).mirror().addBox(-2.6806F, 0.1656F, -0.279F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5069F, -0.0696F, 0.088F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-3.0F, 0.3F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.5064F, -0.0543F, 0.0965F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 54).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.2323F, -0.2263F, 0.7589F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 19).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1641F, -1.4479F, 0.0723F, -0.315F, 1.3411F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 54).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.3253F, -0.3093F, 0.7866F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.4214F, -0.1478F, 0.3698F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 17).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3641F, -3.4479F, 0.1029F, -0.4338F, 1.3823F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -1.0037F, 0.0316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.4314F, -1.386F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 21).addBox(0.2294F, 0.1699F, 0.0119F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4419F, -0.6849F, -0.2079F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(16, 44).addBox(0.2294F, 0.1699F, -0.4881F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.8314F, -0.986F, 0.4332F, -0.2901F, -0.1388F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(44, 15).addBox(0.0107F, 0.1942F, -0.2976F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 5.0314F, -1.886F, 0.4641F, -0.0597F, -0.1388F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(27, 43).addBox(-0.3194F, 0.1656F, -0.279F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -5.086F, 0.5069F, 0.0696F, -0.088F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(42, 37).addBox(0.0F, 0.3F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.5064F, 0.0543F, -0.0965F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.0314F, -2.886F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5202F, -4.8266F, 0.1496F, -0.1295F, -0.0195F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 13).addBox(0.0F, -2.016F, -0.0837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -0.8959F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 68).addBox(0.0F, -1.7282F, 0.0028F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -2.9959F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.0916F, 0.3914F, -1.509F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.2916F, 0.2799F, -0.9186F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3439F, -2.5213F, 0.3795F, 0.134F, -0.4978F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(5, 46).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.0702F, 0.3065F, -1.4465F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 30).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2258F, 0.2203F, -0.865F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0439F, -0.5213F, 0.2963F, 0.1059F, -0.438F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 0).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.0916F, -0.3914F, 1.509F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(54, 32).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.2916F, -0.2799F, 0.9186F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3439F, -2.5213F, 0.3795F, -0.134F, 0.4978F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 46).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.0702F, -0.3065F, 1.4465F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(54, 30).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2258F, -0.2203F, 0.865F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0439F, -0.5213F, 0.2963F, -0.1059F, 0.438F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(42, 27).addBox(-1.5F, -1.0199F, -0.1716F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(25, 45).addBox(-0.5F, -1.0199F, -1.6716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.6311F, -5.7642F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(37, 23).addBox(-1.0F, -0.971F, -1.6926F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.3311F, -3.8642F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(35, 60).addBox(-0.5F, -0.5617F, -0.7156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.0311F, -2.8642F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(33, 29).addBox(-0.5F, -1.05F, -1.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.7353F, -1.9788F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(26, 11).addBox(-0.5F, -0.2037F, 0.0957F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -4.0959F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.5499F, -3.9959F));

		PartDefinition cube_r80 = scapula.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(40, 60).addBox(-1.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 1.5037F, 0.1546F, 0.4863F));

		PartDefinition cube_r81 = scapula.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 65).addBox(-0.2249F, -0.5162F, -1.3454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9221F, 0.2565F, 0.4769F, 1.5355F, 0.0308F, 0.4011F));

		PartDefinition cube_r82 = scapula.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(33, 34).addBox(-0.4221F, -0.4996F, -0.0143F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9221F, 0.8554F, 0.4403F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r83 = scapula.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(10, 50).addBox(-0.5F, -1.5386F, -0.7655F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1365F, 2.1813F, -0.7436F, 1.3097F, 0.2912F, 0.6855F));

		PartDefinition cube_r84 = scapula.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 30).addBox(-1.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2F, 1.0F, -1.5F, 2.1582F, 0.1546F, 0.4863F));

		PartDefinition cube_r85 = scapula.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 50).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0272F, 1.9988F, -2.294F, -0.6802F, 0.1431F, -0.1149F));

		PartDefinition cube_r86 = scapula.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 65).addBox(0.1F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 2.2562F, -1.9703F, -0.9461F, 0.6959F, -0.7267F));

		PartDefinition cube_r87 = scapula.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 49).addBox(-0.5F, -1.543F, -0.2352F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1365F, 2.1813F, -0.7436F, 1.0043F, 0.2912F, 0.6855F));

		PartDefinition cube_r88 = scapula.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(32, 45).addBox(-0.5F, -0.9146F, -1.0999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.825F, 1.0399F, -0.1445F, 0.6354F, 0.1148F, 0.3864F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offset(-0.8F, 0.5499F, -3.9959F));

		PartDefinition cube_r89 = scapula2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(0.0F, 1.4658F, -1.6873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 1.5037F, -0.1546F, -0.4863F));

		PartDefinition cube_r90 = scapula2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.7751F, -0.5162F, -1.3454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9221F, 0.2565F, 0.4769F, 1.5355F, -0.0308F, -0.4011F));

		PartDefinition cube_r91 = scapula2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(33, 34).mirror().addBox(-0.5779F, -0.4996F, -0.0143F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9221F, 0.8554F, 0.4403F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r92 = scapula2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.5F, -1.5386F, -0.7655F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, 2.1813F, -0.7436F, 1.3097F, -0.2912F, -0.6855F));

		PartDefinition cube_r93 = scapula2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(42, 30).mirror().addBox(0.0F, -0.4299F, -2.0279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.0F, -1.5F, 2.1582F, -0.1546F, -0.4863F));

		PartDefinition cube_r94 = scapula2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0272F, 1.9988F, -2.294F, -0.6802F, -0.1431F, 0.1149F));

		PartDefinition cube_r95 = scapula2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-1.1F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.2562F, -1.9703F, -0.9461F, -0.6959F, 0.7267F));

		PartDefinition cube_r96 = scapula2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(33, 49).mirror().addBox(-0.5F, -1.543F, -0.2352F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1365F, 2.1813F, -0.7436F, 1.0043F, -0.2912F, -0.6855F));

		PartDefinition cube_r97 = scapula2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(32, 45).mirror().addBox(-0.5F, -0.9146F, -1.0999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.825F, 1.0399F, -0.1445F, 0.6354F, -0.1148F, -0.3864F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5237F, -3.9361F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(65, 68).addBox(0.0F, -1.423F, -0.9264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.544F, 0.4946F, -0.6662F));

		PartDefinition cube_r100 = Neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1798F, -0.0852F, 0.2747F, 0.6722F, -1.1466F));

		PartDefinition cube_r101 = Neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.544F, -0.4946F, 0.6662F));

		PartDefinition cube_r102 = Neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(55, 2).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1798F, -0.0852F, 0.2747F, -0.6722F, 1.1466F));

		PartDefinition cube_r103 = Neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(46, 9).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1324F, -1.5559F, 0.0338F, -0.3908F, -0.0972F));

		PartDefinition cube_r104 = Neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(16, 68).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 46).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Neck3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0474F, -0.5293F, 0.3978F, 0.7203F, -1.0043F));

		PartDefinition cube_r106 = Neck3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0474F, -0.5293F, 0.3978F, -0.7203F, 1.0043F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1636F, -1.984F, 0.0632F, -0.2613F, -0.0164F));

		PartDefinition cube_r107 = Neck4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(45, 69).addBox(0.0F, -1.5352F, 2.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 68).addBox(0.0F, -1.6352F, 0.4653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-0.5F, -0.3352F, -0.5347F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Neck4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(55, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0838F, -2.7453F, 0.2989F, 1.0544F, -1.1005F));

		PartDefinition cube_r109 = Neck4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1162F, -0.7453F, 0.2376F, 0.9702F, -1.0979F));

		PartDefinition cube_r110 = Neck4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(55, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0838F, -2.7453F, 0.2989F, -1.0544F, 1.1005F));

		PartDefinition cube_r111 = Neck4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1162F, -0.7453F, 0.2376F, -0.9702F, 1.0979F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, -3.0519F, 0.3031F, -0.2504F, -0.0773F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.0351F, -6.7981F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(20, 62).addBox(-0.5F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2013F, -6.5532F, 0.7898F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(15, 65).addBox(-1.0F, -0.0043F, -0.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8414F, -5.7814F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 62).addBox(-1.0F, -0.0043F, -0.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4291F, -4.9724F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(10, 62).addBox(-1.0F, -0.0044F, -0.9697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9577F, -4.1639F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 3).addBox(-0.5F, -0.2625F, -0.8625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(37, 10).addBox(-1.0F, 0.0625F, -2.0375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0667F, 0.165F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0F, -0.8229F, 0.3874F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8448F, -3.0856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 27).addBox(-1.5F, 0.0F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6588F, -2.7734F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9899F, -1.2722F, 0.0383F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 11).addBox(-0.4306F, 0.5724F, 0.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1547F, 1.8932F, -5.4464F, 0.5837F, 0.2156F, 0.0712F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 62).addBox(-0.4306F, 0.595F, -0.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1547F, 1.8932F, -5.4464F, 0.4964F, 0.2156F, 0.0712F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(21, 49).addBox(-0.05F, 0.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2874F, -1.3866F, -2.8727F, 0.5265F, 0.2661F, 0.1517F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 3).addBox(-0.475F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.4432F, 2.9924F, -6.954F, -0.0336F, 0.1383F, 0.0196F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 0).addBox(-0.4556F, 0.6431F, -0.9567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1547F, 1.9182F, -5.4964F, 0.3672F, 0.2086F, 0.09F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 23).addBox(-0.65F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2053F, 2.9965F, -6.3324F, 0.1795F, 0.2132F, -0.0025F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(61, 34).addBox(-0.5793F, -0.5118F, 0.1989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.4799F, 2.5716F, -6.7748F, -0.0328F, 0.136F, 0.0316F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(61, 31).addBox(-0.5793F, -0.7349F, 0.4503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-1.4799F, 2.5716F, -6.7748F, 0.7955F, 0.1383F, 0.0196F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 61).addBox(-0.5793F, -0.6618F, -0.5761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.4799F, 2.5716F, -6.7748F, -0.5151F, 0.1318F, 0.0081F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(12, 55).addBox(-0.6267F, -0.9045F, 0.2367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.1547F, 1.8932F, -5.4464F, 0.4809F, 0.2856F, 0.0483F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 55).addBox(-0.6517F, -0.9412F, -0.5305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-1.1547F, 1.9182F, -5.4964F, 0.3454F, 0.2808F, 0.0437F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(18, 35).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-1.0075F, 1.1437F, -6.4787F, 0.6341F, 0.2446F, 0.061F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(58, 44).addBox(-0.2006F, -0.2409F, -1.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 41).addBox(-0.2006F, -0.2409F, -0.7756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3179F, 0.7155F, -6.1582F, 0.8847F, 0.0107F, 0.3482F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(46, 47).addBox(-0.2006F, -0.2867F, -1.7402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9964F, -0.1501F, -4.9386F, 0.6709F, 0.0087F, 0.3442F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(24, 29).addBox(-0.2183F, -0.0332F, -2.7595F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.3039F, -1.6115F, -2.7891F, 0.5677F, 0.0687F, 0.3637F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(32, 54).addBox(-0.5208F, -1.0431F, -1.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.364F, 0.258F, -1.79F, 0.1222F, 0.1484F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(37, 15).addBox(-0.9708F, -0.0283F, -0.5952F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.1692F, 0.2105F, -3.5308F, -1.0411F, 0.2694F, 0.0712F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 23).addBox(-0.5208F, 0.4717F, -1.4702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.364F, 0.258F, -1.79F, -1.0559F, 0.1484F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 46).addBox(-0.5F, -0.6486F, -0.5712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.3168F, 2.0365F, -6.7943F, -0.7626F, 0.0608F, 0.0543F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(61, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3257F, 2.1575F, -6.8462F, -1.6185F, 0.0472F, 0.0434F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 38).addBox(-0.3356F, -0.4795F, -0.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 8).addBox(-0.5106F, -0.4795F, -0.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2425F, -0.2879F, -2.2368F, -1.5118F, 0.1765F, 0.0485F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(53, 59).addBox(-0.9372F, 0.1663F, -0.6915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(37, 57).addBox(-0.9372F, -0.1337F, -0.6915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1575F, -0.6379F, -2.2368F, -0.868F, 0.1433F, 0.3086F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(60, 56).addBox(-0.9372F, -0.5622F, -0.4881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1575F, -0.6379F, -2.2368F, -0.039F, 0.1433F, 0.3086F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 53).addBox(-0.9372F, -0.1447F, -0.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1575F, -0.6379F, -2.2368F, 0.7202F, 0.1433F, 0.3086F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(20, 59).addBox(-0.5606F, -0.017F, -0.5792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2425F, -0.2879F, -2.2368F, 1.3802F, 0.0675F, 0.0478F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 50).addBox(-0.5091F, -0.1969F, -0.7862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0628F, 0.4294F, -0.2736F, -0.3161F, 0.1592F, -0.0457F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 59).addBox(-0.5091F, -0.7637F, -0.7872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0628F, 0.4294F, -0.2736F, -0.6215F, 0.1592F, -0.0457F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(20, 65).addBox(-0.5091F, -0.2456F, -0.0934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0628F, 0.4294F, -0.2736F, -0.4819F, 0.1592F, -0.0457F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 59).addBox(-0.5091F, -0.3688F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0628F, 0.4294F, -0.2736F, 0.3908F, 0.1592F, -0.0457F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 47).addBox(-0.5606F, -0.0967F, -0.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2425F, -0.2879F, -2.2368F, 0.333F, 0.0675F, 0.0478F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(5, 59).addBox(-0.5606F, -0.0406F, -0.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2425F, -0.2879F, -2.2368F, -0.2377F, 0.1765F, 0.0485F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(45, 60).addBox(-0.5606F, -0.5368F, -1.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2425F, -0.2879F, -2.2368F, 0.3295F, 0.1765F, 0.0485F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(9, 41).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.7092F, 0.7646F, -3.5371F, 0.6385F, 0.2729F, 0.0263F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 35).addBox(-0.1498F, -0.3236F, 1.5479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.2575F, -1.6467F, -1.985F, -0.4191F, 0.1749F, 0.3797F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(41, 4).addBox(-0.1498F, -0.1639F, -0.1171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2575F, -1.6467F, -1.985F, -0.3318F, 0.1749F, 0.3797F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 53).addBox(-0.1482F, -0.1457F, -0.7958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2575F, -1.6467F, -1.985F, 0.1034F, 0.1125F, 0.3926F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 66).addBox(-0.5035F, -1.4085F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -2.1785F, 0.1453F, -0.0535F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5035F, -0.4976F, -0.0741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -2.3094F, 0.1453F, -0.0535F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(48, 56).addBox(-0.4965F, -0.3096F, -1.2594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -1.8295F, 0.1453F, -0.0535F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(45, 51).addBox(-0.4965F, -1.336F, -0.154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -2.004F, 0.1453F, -0.0535F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 51).addBox(-0.4965F, -1.3F, -0.6588F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -1.6113F, 0.1453F, -0.0535F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(53, 43).addBox(-0.4965F, -1.4421F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.2514F, 0.8042F, -0.6982F, -0.9568F, 0.1453F, -0.0535F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9899F, -1.2722F, 0.0383F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-0.5694F, 0.5724F, 0.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 1.8932F, -5.4464F, 0.5837F, -0.2156F, -0.0712F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.5694F, 0.595F, -0.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 1.8932F, -5.4464F, 0.4964F, -0.2156F, -0.0712F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.95F, 0.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2874F, -1.3866F, -2.8727F, 0.5265F, -0.2661F, -0.1517F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 3).mirror().addBox(-0.525F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.4432F, 2.9924F, -6.954F, -0.0336F, -0.1383F, -0.0196F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.5444F, 0.6431F, -0.9567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 1.9182F, -5.4964F, 0.3672F, -0.2086F, -0.09F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-0.35F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.2053F, 2.9965F, -6.3324F, 0.1795F, -0.2132F, 0.0025F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(61, 34).mirror().addBox(-0.4207F, -0.5118F, 0.1989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.4799F, 2.5716F, -6.7748F, -0.0328F, -0.136F, -0.0316F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(61, 31).mirror().addBox(-0.4207F, -0.7349F, 0.4503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(1.4799F, 2.5716F, -6.7748F, 0.7955F, -0.1383F, -0.0196F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-0.4207F, -0.6618F, -0.5761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(1.4799F, 2.5716F, -6.7748F, -0.5151F, -0.1318F, -0.0081F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(-0.3733F, -0.9045F, 0.2367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 1.8932F, -5.4464F, 0.4809F, -0.2856F, -0.0483F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(-0.3483F, -0.9412F, -0.5305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 1.9182F, -5.4964F, 0.3454F, -0.2808F, -0.0437F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(18, 35).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(1.0075F, 1.1437F, -6.4787F, 0.6341F, -0.2446F, -0.061F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(58, 44).mirror().addBox(-0.7994F, -0.2409F, -1.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 41).mirror().addBox(-0.7994F, -0.2409F, -0.7756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3179F, 0.7155F, -6.1582F, 0.8847F, -0.0107F, -0.3482F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(-0.7994F, -0.2867F, -1.7402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9964F, -0.1501F, -4.9386F, 0.6709F, -0.0087F, -0.3442F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(24, 29).mirror().addBox(-0.7817F, -0.0332F, -2.7595F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.3039F, -1.6115F, -2.7891F, 0.5677F, -0.0687F, -0.3637F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(32, 54).mirror().addBox(-0.4792F, -1.0431F, -1.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.364F, 0.258F, -1.79F, 0.1222F, -0.1484F, 0.0F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(37, 15).mirror().addBox(-0.0292F, -0.0283F, -0.5952F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.1692F, 0.2105F, -3.5308F, -1.0411F, -0.2694F, -0.0712F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-0.4792F, 0.4717F, -1.4702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.364F, 0.258F, -1.79F, -1.0559F, -0.1484F, 0.0F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 46).mirror().addBox(-0.5F, -0.6486F, -0.5712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.3168F, 2.0365F, -6.7943F, -0.7626F, -0.0608F, -0.0543F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3257F, 2.1575F, -6.8462F, -1.6185F, -0.0472F, -0.0434F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(58, 38).mirror().addBox(-0.6644F, -0.4795F, -0.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(58, 8).mirror().addBox(-0.4894F, -0.4795F, -0.4869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2425F, -0.2879F, -2.2368F, -1.5118F, -0.1765F, -0.0485F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-0.0628F, 0.1663F, -0.6915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(37, 57).mirror().addBox(-0.0628F, -0.1337F, -0.6915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1575F, -0.6379F, -2.2368F, -0.868F, -0.1433F, -0.3086F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-0.0628F, -0.5622F, -0.4881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1575F, -0.6379F, -2.2368F, -0.039F, -0.1433F, -0.3086F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.0628F, -0.1447F, -0.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1575F, -0.6379F, -2.2368F, 0.7202F, -0.1433F, -0.3086F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.4394F, -0.017F, -0.5792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2425F, -0.2879F, -2.2368F, 1.3802F, -0.0675F, -0.0478F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-0.4909F, -0.1969F, -0.7862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0628F, 0.4294F, -0.2736F, -0.3161F, -0.1592F, 0.0457F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(15, 59).mirror().addBox(-0.4909F, -0.7637F, -0.7872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0628F, 0.4294F, -0.2736F, -0.6215F, -0.1592F, 0.0457F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-0.4909F, -0.2456F, -0.0934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0628F, 0.4294F, -0.2736F, -0.4819F, -0.1592F, 0.0457F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-0.4909F, -0.3688F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0628F, 0.4294F, -0.2736F, 0.3908F, -0.1592F, 0.0457F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-0.4394F, -0.0967F, -0.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2425F, -0.2879F, -2.2368F, 0.333F, -0.0675F, -0.0478F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-0.4394F, -0.0406F, -0.7218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.2425F, -0.2879F, -2.2368F, -0.2377F, -0.1765F, -0.0485F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(-0.4394F, -0.5368F, -1.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2425F, -0.2879F, -2.2368F, 0.3295F, -0.1765F, -0.0485F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.7092F, 0.7646F, -3.5371F, 0.6385F, -0.2729F, -0.0263F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-0.8502F, -0.3236F, 1.5479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.2575F, -1.6467F, -1.985F, -0.4191F, -0.1749F, -0.3797F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(41, 4).mirror().addBox(-0.8502F, -0.1639F, -0.1171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2575F, -1.6467F, -1.985F, -0.3318F, -0.1749F, -0.3797F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-0.8518F, -0.1457F, -0.7958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.2575F, -1.6467F, -1.985F, 0.1034F, -0.1125F, -0.3926F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(-0.4965F, -1.4085F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -2.1785F, -0.1453F, 0.0535F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.4965F, -0.4976F, -0.0741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -2.3094F, -0.1453F, 0.0535F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.5035F, -0.3096F, -1.2594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -1.8295F, -0.1453F, 0.0535F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-0.5035F, -1.336F, -0.154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -2.004F, -0.1453F, 0.0535F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-0.5035F, -1.3F, -0.6588F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -1.6113F, -0.1453F, 0.0535F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.5035F, -1.4421F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 0.8042F, -0.6982F, -0.9568F, -0.1453F, 0.0535F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9656F, -0.2218F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.7472F, -0.3065F, -1.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, -0.1484F, -0.096F, 0.0F));

		PartDefinition cube_r205 = Jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.7472F, -0.4169F, -1.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, -0.0175F, -0.096F, 0.0F));

		PartDefinition cube_r206 = Jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.7472F, -0.1953F, -3.2934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, -0.2182F, -0.096F, 0.0F));

		PartDefinition cube_r207 = Jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-0.8647F, -0.4008F, -1.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(65, 65).mirror().addBox(-0.8647F, -0.4008F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(66, 27).mirror().addBox(-0.8647F, -0.3258F, -1.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(63, 21).mirror().addBox(-0.8647F, -0.3258F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0129F, 0.7124F, -4.9114F, 0.0436F, -0.2531F, 0.0F));

		PartDefinition cube_r208 = Jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.8636F, -0.4829F, -0.5501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1122F, 0.6906F, -4.4278F, 0.2516F, -0.2011F, 0.0065F));

		PartDefinition cube_r209 = Jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-0.8636F, -0.3526F, -0.5311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1122F, 0.6906F, -4.4278F, 0.1207F, -0.2011F, 0.0065F));

		PartDefinition cube_r210 = Jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-0.1256F, -0.7698F, -1.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.3316F, -0.1833F, 0.0F));

		PartDefinition cube_r211 = Jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.1256F, -0.9967F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.3752F, -0.1833F, 0.0F));

		PartDefinition cube_r212 = Jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-0.0875F, -0.668F, -0.2017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.1134F, -0.0436F, 0.0F));

		PartDefinition cube_r213 = Jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-0.1256F, -0.6743F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.1571F, -0.1833F, 0.0F));

		PartDefinition cube_r214 = Jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.1256F, -1.3569F, -1.104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.3665F, -0.1833F, 0.0F));

		PartDefinition cube_r215 = Jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(25, 66).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 66).addBox(-0.2743F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1128F, 0.3655F, -6.0582F, -0.2126F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 34).addBox(-0.2743F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1128F, 0.3655F, -6.0582F, -0.1254F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.8902F, -0.8998F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1122F, 0.6906F, -4.4278F, 0.1484F, -0.1134F, 0.0F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-0.1256F, -1.0706F, -0.6559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1122F, 0.6906F, -3.2278F, 0.5061F, -0.1833F, 0.0F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-0.7472F, -1.4597F, -2.8461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, 0.1484F, -0.096F, 0.0F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-0.7472F, -2.8999F, -2.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, 0.6283F, -0.096F, 0.0F));

		PartDefinition cube_r221 = Jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-0.7472F, -2.5757F, -2.3059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, 0.4538F, -0.096F, 0.0F));

		PartDefinition cube_r222 = Jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-0.7472F, -2.2112F, -2.1151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, 0.2356F, -0.096F, 0.0F));

		PartDefinition cube_r223 = Jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.7472F, 0.0554F, -1.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(65, 49).mirror().addBox(-0.7472F, 0.0554F, -1.9152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(39, 46).mirror().addBox(-0.7472F, -0.6196F, -1.9152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.164F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, -0.6632F, -0.096F, 0.0F));

		PartDefinition cube_r224 = Jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(25, 56).mirror().addBox(-0.7472F, -1.0958F, -2.3983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.8122F, 0.6906F, -0.0278F, -0.384F, -0.096F, 0.0F));

		PartDefinition cube_r225 = Jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(55, 65).addBox(-0.2528F, -0.3065F, -1.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, -0.1484F, 0.096F, 0.0F));

		PartDefinition cube_r226 = Jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(63, 24).addBox(-0.2528F, -0.4169F, -1.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, -0.0175F, 0.096F, 0.0F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(46, 43).addBox(-0.2528F, -0.1953F, -3.2934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, -0.2182F, 0.096F, 0.0F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 30).addBox(-0.1353F, -0.4008F, -1.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 65).addBox(-0.1353F, -0.4008F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(66, 27).addBox(-0.1353F, -0.3258F, -1.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(63, 21).addBox(-0.1353F, -0.3258F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0129F, 0.7124F, -4.9114F, 0.0436F, 0.2531F, 0.0F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(65, 62).addBox(-0.1364F, -0.4829F, -0.5501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1122F, 0.6906F, -4.4278F, 0.2516F, 0.2011F, -0.0065F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(63, 18).addBox(-0.1364F, -0.3526F, -0.5311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1122F, 0.6906F, -4.4278F, 0.1207F, 0.2011F, -0.0065F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(63, 15).addBox(-0.8744F, -0.7698F, -1.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.3316F, 0.1833F, 0.0F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(63, 12).addBox(-0.8744F, -0.9967F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.3752F, 0.1833F, 0.0F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(63, 9).addBox(-0.9125F, -0.668F, -0.2017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.1134F, 0.0436F, 0.0F));

		PartDefinition cube_r234 = Jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 6).addBox(-0.8744F, -0.6743F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.1571F, 0.1833F, 0.0F));

		PartDefinition cube_r235 = Jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 63).addBox(-0.8744F, -1.3569F, -1.104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.3665F, 0.1833F, 0.0F));

		PartDefinition cube_r236 = Jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(60, 62).addBox(-0.1098F, -0.8998F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1122F, 0.6906F, -4.4278F, 0.1484F, 0.1134F, 0.0F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 68).addBox(-0.5354F, -0.8659F, -0.1253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0402F, 0.6778F, -6.0614F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(58, 59).addBox(-0.5354F, -0.543F, -0.1247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0402F, 0.6778F, -6.0614F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5354F, -0.3406F, -0.2599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0402F, 0.6778F, -6.0614F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5354F, -0.366F, -0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0402F, 0.6778F, -6.0614F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(46, 39).addBox(-0.5354F, -0.4921F, -1.0457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0402F, 0.6778F, -6.0614F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(55, 62).addBox(-0.8744F, -1.0706F, -0.6559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1122F, 0.6906F, -3.2278F, 0.5061F, 0.1833F, 0.0F));

		PartDefinition cube_r243 = Jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 55).addBox(-0.2528F, -1.4597F, -2.8461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, 0.1484F, 0.096F, 0.0F));

		PartDefinition cube_r244 = Jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(60, 65).addBox(-0.2528F, -2.8999F, -2.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, 0.6283F, 0.096F, 0.0F));

		PartDefinition cube_r245 = Jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(65, 52).addBox(-0.2528F, -2.5757F, -2.3059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, 0.4538F, 0.096F, 0.0F));

		PartDefinition cube_r246 = Jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(55, 51).addBox(-0.2528F, -2.2112F, -2.1151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, 0.2356F, 0.096F, 0.0F));

		PartDefinition cube_r247 = Jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(50, 65).addBox(-0.2528F, 0.0554F, -1.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(65, 49).addBox(-0.2528F, 0.0554F, -1.9152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(39, 46).addBox(-0.2528F, -0.6196F, -1.9152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.164F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, -0.6632F, 0.096F, 0.0F));

		PartDefinition cube_r248 = Jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 56).addBox(-0.2528F, -1.0958F, -2.3983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.8122F, 0.6906F, -0.0278F, -0.384F, 0.096F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0205F, 3.4565F, -3.0777F, 0.913F, -0.0552F, 0.1188F));

		PartDefinition cube_r249 = RFrontLeg2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(53, 39).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, -0.48F));

		PartDefinition cube_r250 = RFrontLeg2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(55, 55).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, -0.48F));

		PartDefinition cube_r251 = RFrontLeg2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, -0.48F));

		PartDefinition cube_r252 = RFrontLeg2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5037F, -0.5023F, -0.1245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0235F, 0.0996F, -0.0158F, 0.8378F, 0.0F, -0.48F));

		PartDefinition cube_r253 = RFrontLeg2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(66, 33).addBox(-0.5037F, -0.6641F, 0.0317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0235F, 0.0996F, -0.0158F, 1.6668F, 0.0F, -0.48F));

		PartDefinition cube_r254 = RFrontLeg2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5037F, -0.534F, -0.17F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0235F, 0.0996F, -0.0158F, -0.2531F, 0.0F, -0.48F));

		PartDefinition cube_r255 = RFrontLeg2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(53, 12).addBox(-0.5037F, -0.6679F, -0.6397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0235F, 0.0996F, -0.0158F, 0.096F, 0.0F, -0.48F));

		PartDefinition cube_r256 = RFrontLeg2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(13, 32).addBox(-1.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, -0.48F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -0.75F, -0.053F, -0.0491F));

		PartDefinition cube_r257 = LowerRFrontLeg2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 39).addBox(0.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3819F, 3.0225F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r258 = LowerRFrontLeg2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 56).addBox(-0.35F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1513F, -0.7504F, 0.0206F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create().texOffs(30, 6).addBox(-1.7F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1459F, 4.5825F, -1.191F, 0.3401F, 0.0182F, -0.0487F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.7F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, -0.3927F, 0.0F, 0.0F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0205F, 3.4565F, -3.0777F, -0.1342F, 0.0552F, -0.1188F));

		PartDefinition cube_r259 = RFrontLeg3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 1.4486F, 0.0F, 0.48F));

		PartDefinition cube_r260 = RFrontLeg3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, 0.2269F, 0.0F, 0.48F));

		PartDefinition cube_r261 = RFrontLeg3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5171F, 4.8978F, -0.174F, -0.3403F, 0.0F, 0.48F));

		PartDefinition cube_r262 = RFrontLeg3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.4963F, -0.5023F, -0.1245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0235F, 0.0996F, -0.0158F, 0.8378F, 0.0F, 0.48F));

		PartDefinition cube_r263 = RFrontLeg3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(66, 33).mirror().addBox(-0.4963F, -0.6641F, 0.0317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0235F, 0.0996F, -0.0158F, 1.6668F, 0.0F, 0.48F));

		PartDefinition cube_r264 = RFrontLeg3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-0.4963F, -0.534F, -0.17F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0235F, 0.0996F, -0.0158F, -0.2531F, 0.0F, 0.48F));

		PartDefinition cube_r265 = RFrontLeg3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-0.4963F, -0.6679F, -0.6397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0235F, 0.0996F, -0.0158F, 0.096F, 0.0F, 0.48F));

		PartDefinition cube_r266 = RFrontLeg3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(13, 32).mirror().addBox(0.25F, -2.5F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5592F, 1.4334F, -0.5516F, -0.0349F, 0.0F, 0.48F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.4446F, 0.053F, 0.0491F));

		PartDefinition cube_r267 = LowerRFrontLeg3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(0.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 39).mirror().addBox(-1.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3819F, 3.0225F, -0.8159F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r268 = LowerRFrontLeg3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(43, 56).mirror().addBox(-0.65F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1513F, -0.7504F, 0.0206F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-1.3F, 0.0038F, -1.1071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1459F, 4.5825F, -1.191F, 0.5146F, -0.0182F, 0.0487F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.3F, -0.5441F, -3.8211F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offset(0.0F, 0.5649F, -0.9039F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.4769F, 6.6014F));

		PartDefinition cube_r269 = sacrum.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 49).addBox(-1.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.2976F, 0.5793F, -1.0384F, 0.3899F, 0.2203F));

		PartDefinition cube_r270 = sacrum.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(30, 64).addBox(-0.9081F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.3506F, -0.3905F, 0.0874F));

		PartDefinition cube_r271 = sacrum.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(63, 59).addBox(-0.9081F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -1.6997F, -0.3905F, 0.0874F));

		PartDefinition cube_r272 = sacrum.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(45, 63).addBox(-0.9081F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.2976F, 2.7793F, -2.3542F, -0.3905F, 0.0874F));

		PartDefinition cube_r273 = sacrum.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(15, 50).addBox(-0.8611F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.2443F));

		PartDefinition cube_r274 = sacrum.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(63, 43).addBox(-1.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-1.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, 0.0698F));

		PartDefinition cube_r275 = sacrum.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(63, 40).addBox(1.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r276 = sacrum.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(40, 63).addBox(1.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r277 = sacrum.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 37).addBox(1.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r278 = sacrum.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(53, 8).addBox(1.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r279 = sacrum.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(18, 32).addBox(1.5F, -0.0817F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r280 = sacrum.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(35, 63).addBox(1.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(25, 63).addBox(1.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.1F, 0.4769F, 6.6014F));

		PartDefinition cube_r281 = sacrum2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(0.1F, 0.0304F, -0.253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.2976F, 0.5793F, -1.0384F, -0.3899F, -0.2203F));

		PartDefinition cube_r282 = sacrum2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.0919F, -1.6926F, 0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.3506F, 0.3905F, -0.0874F));

		PartDefinition cube_r283 = sacrum2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(63, 59).mirror().addBox(-0.0919F, -1.1976F, 0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -1.6997F, 0.3905F, -0.0874F));

		PartDefinition cube_r284 = sacrum2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(45, 63).mirror().addBox(-0.0919F, -0.9569F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.2976F, 2.7793F, -2.3542F, 0.3905F, -0.0874F));

		PartDefinition cube_r285 = sacrum2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-0.1389F, -1.5618F, 0.6854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.2443F));

		PartDefinition cube_r286 = sacrum2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(63, 43).mirror().addBox(0.0F, 0.4372F, -0.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 56).mirror().addBox(0.0F, -1.2628F, -0.0025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.6976F, 1.5793F, -1.6493F, 0.0F, -0.0698F));

		PartDefinition cube_r287 = sacrum2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(63, 40).mirror().addBox(-2.5F, -0.0339F, -1.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r288 = sacrum2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-2.5F, -0.0142F, 0.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 3.5F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r289 = sacrum2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(63, 37).mirror().addBox(-2.5F, -0.0264F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r290 = sacrum2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-2.5F, -1.9404F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r291 = sacrum2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(18, 32).mirror().addBox(-2.5F, -0.0817F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r292 = sacrum2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-2.5F, -0.5831F, 0.9944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(25, 63).mirror().addBox(-2.5F, -0.5831F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0321F, 1.935F, 9.1626F, -0.4298F, -0.1578F, -0.1579F));

		PartDefinition cube_r293 = RBackLeg2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(58, 25).addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 60).addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 60).addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r294 = RBackLeg2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r295 = RBackLeg2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 6).addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r296 = RBackLeg2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(58, 22).addBox(-0.5F, -1.7067F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(58, 17).addBox(-0.5F, -1.7067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 14).addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r297 = RBackLeg2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, 7.3429F, -0.3685F, 0.7786F, 0.0706F, 0.194F));

		PartDefinition cube_r298 = LowerRBackLeg2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(30, 58).addBox(-0.4921F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 30).addBox(-0.4921F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1107F, 3.2951F, 0.1598F, -0.4478F, 1.4845F, -0.3452F));

		PartDefinition cube_r299 = LowerRBackLeg2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(28, 49).addBox(-0.4933F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1107F, 3.2951F, 0.1598F, -0.2297F, 1.4845F, -0.3016F));

		PartDefinition cube_r300 = LowerRBackLeg2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(27, 35).addBox(-0.4933F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1107F, 3.2951F, 0.1598F, -0.2733F, 1.4845F, -0.3016F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create().texOffs(15, 6).addBox(-2.65F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3426F, 5.5429F, 0.3447F, -0.3285F, -0.0199F, 0.0356F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.65F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0321F, 1.935F, 9.1626F, 0.2247F, 0.1578F, 0.1579F));

		PartDefinition cube_r301 = RBackLeg3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(-0.5F, 0.4055F, 0.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 60).mirror().addBox(-0.5F, 0.4055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.5F, 0.0055F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r302 = RBackLeg3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.5F, 0.0055F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 5.9167F, -0.9616F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r303 = RBackLeg3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-0.5F, -0.9317F, -0.842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r304 = RBackLeg3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-0.5F, -1.7067F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(58, 17).mirror().addBox(-0.5F, -1.7067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 14).mirror().addBox(-0.5F, -1.0067F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 1.9167F, -0.0616F, 0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r305 = RBackLeg3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(5, 48).mirror().addBox(-0.5F, -1.3F, -0.375F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6229F, 3.2167F, -0.5616F, -0.0305F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, 7.3429F, -0.3685F, 0.9931F, -0.0536F, -0.1916F));

		PartDefinition cube_r306 = LowerRBackLeg3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.5079F, 1.503F, -0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 30).mirror().addBox(-0.5079F, -0.897F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2951F, 0.1598F, -0.4478F, -1.4845F, 0.3452F));

		PartDefinition cube_r307 = LowerRBackLeg3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(28, 49).mirror().addBox(-0.5067F, -3.3589F, 0.0622F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2951F, 0.1598F, -0.2297F, -1.4845F, 0.3016F));

		PartDefinition cube_r308 = LowerRBackLeg3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(27, 35).mirror().addBox(-0.5067F, -3.3317F, -1.1093F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 3.2951F, 0.1598F, -0.2733F, -1.4845F, 0.3016F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create().texOffs(15, 6).mirror().addBox(-1.35F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3426F, 5.5429F, 0.3447F, -0.1976F, 0.0199F, -0.0356F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.35F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.4F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2763F, 11.7253F, -0.2201F, 0.1704F, -0.0379F));

		PartDefinition cube_r309 = Tail.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(25, 69).addBox(0.0F, -1.1117F, -0.0829F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 3.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r310 = Tail.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(70, 52).addBox(0.0F, 0.6488F, 1.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(51, 70).addBox(0.0F, -0.2512F, -0.0878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8076F, 0.8829F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r311 = Tail.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -1.4512F, -0.0878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 1.0393F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r312 = Tail.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.9F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2664F, 0.9238F, -0.0699F, 0.0522F, -0.0037F));

		PartDefinition cube_r313 = Tail.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(39, 0).addBox(-0.1F, -0.1046F, -0.0037F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2664F, 0.9238F, -0.0699F, -0.0522F, 0.0037F));

		PartDefinition cube_r314 = Tail.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.5F, 3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, -0.5412F, 0.1096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, 3.766F, -0.1124F, 0.1735F, -0.0195F));

		PartDefinition cube_r315 = Tail2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(28, 70).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 3.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r316 = Tail2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(21, 46).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4912F, 1.1096F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r317 = Tail2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(70, 55).addBox(0.0F, 1.4488F, 5.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(54, 70).addBox(0.0F, 1.0488F, 3.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.4128F, -2.883F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r318 = Tail2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(-0.9F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.7088F, 1.1096F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r319 = Tail2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(32, 39).addBox(-0.1F, -4.75F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7088F, 1.1096F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(31, 70).addBox(0.0F, -1.1476F, 0.8727F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(26, 17).addBox(-0.5F, -0.5476F, -0.1273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.0447F, 4.1516F, -0.0841F, 0.1817F, 0.071F));

		PartDefinition cube_r320 = Tail3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-0.6F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0476F, 0.9727F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r321 = Tail3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(18, 40).addBox(-0.4F, 0.0F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0476F, 0.9727F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r322 = Tail3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(70, 46).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4476F, 3.3727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Tail3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(57, 70).addBox(0.0F, 1.7488F, 7.9122F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.368F, -7.0347F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 23).addBox(-0.5F, -0.483F, -0.1206F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 70).addBox(0.0F, -0.883F, 0.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 49).addBox(0.0F, -0.783F, 2.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.056F, 3.8517F, -0.1591F, 0.2586F, -0.041F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.4571F, -0.0901F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 3.8504F, 0.0225F, 0.2617F, 0.0058F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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