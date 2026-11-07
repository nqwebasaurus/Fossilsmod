package fossils.fossils.client.blockentity.model.kyhytysuka;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KyhytysukaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Kyhytysuka;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public KyhytysukaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Kyhytysuka = this.fossil.getChild("Kyhytysuka");
		this.Body1 = this.Kyhytysuka.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.Body2.getChild("ForelimbL2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body12 = this.Body5.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body7 = this.Body15.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Kyhytysuka.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Kyhytysuka = fossil.addOrReplaceChild("Kyhytysuka", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.3174F, 0.6575F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body1 = Kyhytysuka.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6842F, -18.4109F, -0.0266F, -0.0867F, 0.0099F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(107, 102).addBox(0.0F, -1.9411F, 0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2842F, 2.8359F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 109).addBox(0.0F, -1.749F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5842F, 0.9359F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 56).addBox(-0.5F, -0.5F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.0842F, 3.3359F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0683F, 3.5213F, 0.4929F, 0.2812F, -0.4655F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0683F, 3.5213F, 0.3356F, 0.4527F, -0.8965F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(58, 8).mirror().addBox(-5.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0683F, 3.5213F, 0.0714F, 0.5524F, -1.4342F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-4.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3683F, 1.7214F, 0.0404F, 0.623F, -1.1682F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(102, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3683F, 1.7214F, 0.3313F, 0.5479F, -0.6504F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3683F, 1.7214F, 0.3313F, -0.5479F, 0.6504F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(89, 54).addBox(1.8126F, -0.8451F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3683F, 1.7214F, 0.0404F, -0.623F, 1.1682F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 8).addBox(2.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0683F, 3.5213F, 0.0714F, -0.5524F, 1.4342F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 0).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0683F, 3.5213F, 0.3356F, -0.4527F, 0.8965F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0683F, 3.5213F, 0.4929F, -0.2812F, 0.4655F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.826F, 4.7368F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(96, 2).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2423F, 2.3846F, 0.349F, 0.3413F, -0.7714F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2423F, 2.3846F, 0.1472F, 0.4619F, -1.2774F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2423F, 2.3846F, 0.4574F, 0.1746F, -0.3536F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1578F, 0.3846F, 0.442F, 0.2152F, -0.3619F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1578F, 0.3846F, 0.3165F, 0.3721F, -0.7881F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1578F, 0.3846F, 0.1005F, 0.4739F, -1.3038F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-14.9343F, -2.0093F, -0.6026F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6582F, 4.2741F, 0.1472F, 0.4619F, -1.2774F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(95, 23).mirror().addBox(-3.5305F, -0.4274F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6582F, 4.2741F, 0.349F, 0.3413F, -0.7714F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 75).mirror().addBox(-1.567F, 0.2592F, -0.6146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6582F, 4.2741F, 0.4574F, 0.1746F, -0.3536F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-16.8712F, -2.0243F, -0.4549F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8582F, 6.1741F, 0.1472F, 0.4619F, -1.2774F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 77).mirror().addBox(-3.4815F, -0.4698F, -0.4549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8582F, 6.1741F, 0.349F, 0.3413F, -0.7714F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(-1.5415F, 0.2003F, -0.4666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8582F, 6.1741F, 0.4574F, 0.1746F, -0.3536F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(96, 81).mirror().addBox(-1.531F, 0.1725F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2582F, 8.2741F, 0.4408F, 0.1686F, -0.3564F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(96, 91).mirror().addBox(-3.4612F, -0.4907F, -0.591F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2582F, 8.2741F, 0.3358F, 0.3291F, -0.7757F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 8).mirror().addBox(-16.8435F, -2.0335F, -0.591F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2582F, 8.2741F, 0.1416F, 0.4452F, -1.2799F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 8).addBox(2.8435F, -2.0335F, -0.591F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2582F, 8.2741F, 0.1416F, -0.4452F, 1.2799F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 10).addBox(-3.5F, -2.0F, -5.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 12.6629F, 9.429F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 91).addBox(1.4612F, -0.4907F, -0.591F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2582F, 8.2741F, 0.3358F, -0.3291F, 0.7757F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(96, 81).addBox(-0.469F, 0.1725F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2582F, 8.2741F, 0.4408F, -0.1686F, 0.3564F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 79).addBox(-0.4585F, 0.2003F, -0.4666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8582F, 6.1741F, 0.4574F, -0.1746F, 0.3536F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(96, 77).addBox(1.4815F, -0.4698F, -0.4549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8582F, 6.1741F, 0.349F, -0.3413F, 0.7714F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 21).addBox(2.8712F, -2.0243F, -0.4549F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8582F, 6.1741F, 0.1472F, -0.4619F, 1.2774F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 75).addBox(-0.433F, 0.2592F, -0.6146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6582F, 4.2741F, 0.4574F, -0.1746F, 0.3536F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(95, 23).addBox(1.5305F, -0.4274F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6582F, 4.2741F, 0.349F, -0.3413F, 0.7714F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 0).addBox(2.9343F, -2.0093F, -0.6026F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6582F, 4.2741F, 0.1472F, -0.4619F, 1.2774F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(70, 32).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1578F, 0.3846F, 0.1005F, -0.4739F, 1.3038F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(96, 73).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1578F, 0.3846F, 0.3165F, -0.3721F, 0.7881F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(96, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1578F, 0.3846F, 0.442F, -0.2152F, 0.3619F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2423F, 2.3846F, 0.4574F, -0.1746F, 0.3536F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 20).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2423F, 2.3846F, 0.1472F, -0.4619F, 1.2774F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(96, 2).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2423F, 2.3846F, 0.349F, -0.3413F, 0.7714F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(26, 57).addBox(-1.0F, -3.2212F, 0.0439F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6582F, 7.5741F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 94).addBox(-1.0F, -3.0607F, -0.0186F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3407F, 5.6502F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 39).addBox(-1.0F, -2.5253F, -0.0056F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9973F, 3.6644F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 79).addBox(-2.3154F, 0.3399F, -0.7098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8154F, 7.8784F, -0.127F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(38, 39).addBox(-1.5F, -0.0753F, -0.0056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.8582F, 2.6741F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 104).addBox(-1.0F, -2.4495F, 0.0355F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6582F, 1.6741F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 70).addBox(-1.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1582F, -0.2259F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 38).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1582F, -0.2259F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0987F, 7.1823F, 3.2788F, 0.4247F, -0.0322F, -0.1188F));

		PartDefinition cube_r53 = ForelimbL.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, 0.0F, -3.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4454F, 3.0004F, 0.2861F, 0.0F, -0.1309F, 0.6545F));

		PartDefinition cube_r54 = ForelimbL.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 103).addBox(-1.4F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(54, 103).addBox(-0.7F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.5828F, 3.1058F, -0.0862F, 0.0F, -1.5272F, 0.6545F));

		PartDefinition cube_r55 = ForelimbL.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 103).addBox(-1.525F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8848F, 3.3376F, 1.1571F, 0.0F, -0.6109F, 0.6545F));

		PartDefinition cube_r56 = ForelimbL.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 91).addBox(-0.6F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6496F, 1.6224F, 0.0489F, 0.0F, 0.2182F, 0.6545F));

		PartDefinition cube_r57 = ForelimbL.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(91, 4).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.3435F, 2.1549F, -0.0084F, 0.0F, -0.0436F, 0.6545F));

		PartDefinition cube_r58 = ForelimbL.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(90, 59).addBox(-0.975F, 0.2F, 1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(90, 42).addBox(-0.975F, 0.2F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8996F, 0.1646F, -2.1429F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r59 = ForelimbL.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 25).addBox(-0.8F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5479F, 1.5445F, 0.4717F, 0.0F, -0.5105F, 0.6545F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0987F, 7.1823F, 3.2788F, 0.4247F, 0.0322F, 0.1188F));

		PartDefinition cube_r60 = ForelimbL2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 23).addBox(-8.0F, 0.0F, -3.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4454F, 3.0004F, 0.2861F, 0.0F, 0.1309F, -0.6545F));

		PartDefinition cube_r61 = ForelimbL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 103).addBox(0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(103, 72).addBox(-0.3F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.5828F, 3.1058F, -0.0862F, 0.0F, 1.5272F, -0.6545F));

		PartDefinition cube_r62 = ForelimbL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 104).addBox(0.525F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.8848F, 3.3376F, 1.1571F, 0.0F, 0.6109F, -0.6545F));

		PartDefinition cube_r63 = ForelimbL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 91).addBox(-1.4F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.6496F, 1.6224F, 0.0489F, 0.0F, -0.2182F, -0.6545F));

		PartDefinition cube_r64 = ForelimbL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 91).addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.3435F, 2.1549F, -0.0084F, 0.0F, 0.0436F, -0.6545F));

		PartDefinition cube_r65 = ForelimbL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(74, 90).addBox(-1.025F, 0.2F, 1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(90, 62).addBox(-1.025F, 0.2F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8996F, 0.1646F, -2.1429F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r66 = ForelimbL2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 28).addBox(-1.2F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.5479F, 1.5445F, 0.4717F, 0.0F, 0.5105F, -0.6545F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 56).addBox(1.5425F, 0.9619F, -0.2766F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3154F, 2.8604F, -2.9967F, -0.1781F, -0.8608F, -1.3474F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(27, 76).addBox(-0.5F, -1.2146F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6926F, 3.4527F, 0.6273F, 0.7418F, 0.691F, 0.9252F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 91).addBox(-0.401F, -0.2761F, 0.4063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.3154F, 3.1604F, -1.6967F, -2.4956F, -0.1774F, 2.5013F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 43).addBox(-0.3613F, -0.8121F, -0.1662F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3154F, 2.8604F, -2.9967F, -0.4944F, -0.4539F, -0.4514F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 72).addBox(-0.5F, -0.7583F, -1.5516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6926F, 3.4527F, 0.6273F, 1.0909F, 0.691F, 0.9252F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(96, 15).addBox(-0.5F, -1.275F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 1.6444F, 0.309F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 89).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.0F, 1.5562F, -0.8419F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(49, 106).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(87, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.0F, 1.1016F, -0.3097F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(86, 46).addBox(5.5F, -0.4F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.7765F, 1.1532F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(103, 99).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.0F, -2.2678F, 1.6168F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(99, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.0F, -3.1249F, 2.1319F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(94, 103).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.0F, -2.0658F, 3.069F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(15, 104).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.0F, -1.4547F, 1.8704F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.1986F, 2.3522F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(89, 15).addBox(5.5F, -1.125F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 87).addBox(5.5F, -0.525F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.8975F, 0.9687F, 0.9425F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-3.5425F, 0.9619F, -0.2766F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3154F, 2.8604F, -2.9967F, -0.1781F, 0.8608F, 1.3474F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(27, 76).mirror().addBox(-0.5F, -1.2146F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6926F, 3.4527F, 0.6273F, 0.7418F, -0.691F, -0.9252F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-1.599F, -0.2761F, 0.4063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.3154F, 3.1604F, -1.6967F, -2.4956F, 0.1774F, -2.5013F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-2.6387F, -0.8121F, -0.1662F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3154F, 2.8604F, -2.9967F, -0.4944F, 0.4539F, 0.4514F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.5F, -0.7583F, -1.5516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6926F, 3.4527F, 0.6273F, 1.0909F, -0.691F, -0.9252F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-0.5F, -1.275F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.6444F, 0.309F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(48, 89).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.5562F, -0.8419F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(49, 106).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(87, 7).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.1016F, -0.3097F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(-6.5F, -0.4F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7765F, 1.1532F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -2.2678F, 1.6168F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 103).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -3.1249F, 2.1319F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(94, 103).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -2.0658F, 3.069F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 104).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -1.4547F, 1.8704F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.1986F, 2.3522F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-6.5F, -1.125F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 87).mirror().addBox(-6.5F, -0.525F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8975F, 0.9687F, 0.9425F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5909F, 9.6028F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(36, 97).addBox(-1.0F, -3.25F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7989F, 5.8965F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -3.6118F, 0.0235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4394F, 3.8541F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0F, -3.5551F, 0.1086F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.035F, 1.8086F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 97).addBox(-1.0F, -3.325F, 0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -0.8941F, -0.0604F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 14.5371F, 1.6615F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 8).addBox(-4.5F, -0.8941F, -3.9396F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 14.5371F, 1.6615F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 29).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.3009F, 0.1153F, -0.3762F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(97, 25).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.2273F, 0.2236F, -0.8054F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.3009F, 0.1153F, -0.3762F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(97, 29).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.2273F, 0.2236F, -0.8054F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(27, 18).mirror().addBox(-16.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.0971F, 0.3027F, -1.2962F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(27, 23).mirror().addBox(-16.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.0971F, 0.3027F, -1.2962F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-16.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0759F, 4.219F, 0.094F, 0.2855F, -1.2969F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0759F, 4.219F, 0.2853F, 0.1072F, -0.3778F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0759F, 4.219F, 0.2163F, 0.2097F, -0.8076F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 27).mirror().addBox(-15.9916F, -2.5101F, -0.4853F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.0913F, 0.2594F, -1.2973F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(97, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.2629F, 0.0935F, -0.3797F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(97, 33).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.2015F, 0.1879F, -0.8102F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(97, 33).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.2015F, -0.1879F, 0.8102F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(97, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.2629F, -0.0935F, 0.3797F));

		PartDefinition cube_r118 = Body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(27, 27).addBox(2.9916F, -2.5101F, -0.4853F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.0913F, -0.2594F, 1.2973F));

		PartDefinition cube_r119 = Body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(98, 53).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0759F, 4.219F, 0.2163F, -0.2097F, 0.8076F));

		PartDefinition cube_r120 = Body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(98, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0759F, 4.219F, 0.2853F, -0.1072F, 0.3778F));

		PartDefinition cube_r121 = Body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(27, 25).addBox(2.9916F, -2.5101F, -0.4852F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0759F, 4.219F, 0.094F, -0.2855F, 1.2969F));

		PartDefinition cube_r122 = Body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(27, 23).addBox(2.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.0971F, -0.3027F, 1.2962F));

		PartDefinition cube_r123 = Body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(27, 18).addBox(2.9916F, -2.5101F, -0.4853F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.0971F, -0.3027F, 1.2962F));

		PartDefinition cube_r124 = Body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(97, 29).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.2273F, -0.2236F, 0.8054F));

		PartDefinition cube_r125 = Body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.3009F, -0.1153F, 0.3762F));

		PartDefinition cube_r126 = Body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(97, 25).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.2273F, -0.2236F, 0.8054F));

		PartDefinition cube_r127 = Body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.3009F, -0.1153F, 0.3762F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.131F, -0.0433F, 0.0057F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(105, 18).addBox(-1.0F, -2.275F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7798F, 5.7984F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(104, 102).addBox(-1.0F, -2.675F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3982F, 3.8351F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(104, 93).addBox(-1.0F, -2.95F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0166F, 1.8719F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(104, 55).addBox(-1.0F, -2.975F, 0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(19, 39).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 97).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7009F, 2.219F, 0.3829F, 0.147F, -0.3655F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(97, 41).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7009F, 2.219F, 0.2903F, 0.286F, -0.7895F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(97, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2509F, 0.319F, 0.3829F, 0.147F, -0.3655F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(46, 97).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2509F, 0.319F, 0.2903F, 0.286F, -0.7895F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-14.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2509F, 0.319F, 0.1227F, 0.3866F, -1.2875F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(29, 4).mirror().addBox(-13.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7009F, 2.219F, 0.1227F, 0.3866F, -1.2875F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(29, 6).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0009F, 4.219F, 0.127F, 0.4036F, -1.3382F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0009F, 4.219F, 0.3991F, 0.154F, -0.4154F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0009F, 4.219F, 0.3025F, 0.299F, -0.8384F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.1235F, 0.4132F, -1.3396F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(97, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.4049F, 0.1624F, -0.4145F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.3043F, 0.309F, -0.8378F));

		PartDefinition cube_r145 = Body10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 97).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.3043F, -0.309F, 0.8378F));

		PartDefinition cube_r146 = Body10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(97, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.4049F, -0.1624F, 0.4145F));

		PartDefinition cube_r147 = Body10.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(52, 6).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.1235F, -0.4132F, 1.3396F));

		PartDefinition cube_r148 = Body10.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 56).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0009F, 4.219F, 0.3025F, -0.299F, 0.8384F));

		PartDefinition cube_r149 = Body10.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(53, 97).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0009F, 4.219F, 0.3991F, -0.154F, 0.4154F));

		PartDefinition cube_r150 = Body10.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(29, 6).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0009F, 4.219F, 0.127F, -0.4036F, 1.3382F));

		PartDefinition cube_r151 = Body10.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(29, 4).addBox(2.9916F, -2.5101F, -0.4852F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7009F, 2.219F, 0.1227F, -0.3866F, 1.2875F));

		PartDefinition cube_r152 = Body10.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(29, 2).addBox(2.9916F, -2.5101F, -0.4852F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2509F, 0.319F, 0.1227F, -0.3866F, 1.2875F));

		PartDefinition cube_r153 = Body10.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(46, 97).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2509F, 0.319F, 0.2903F, -0.286F, 0.7895F));

		PartDefinition cube_r154 = Body10.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(97, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2509F, 0.319F, 0.3829F, -0.147F, 0.3655F));

		PartDefinition cube_r155 = Body10.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(97, 41).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7009F, 2.219F, 0.2903F, -0.286F, 0.7895F));

		PartDefinition cube_r156 = Body10.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(39, 97).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7009F, 2.219F, 0.3829F, -0.147F, 0.3655F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5393F, 7.7656F, -0.1223F, 0.0433F, -0.0053F));

		PartDefinition cube_r157 = Body11.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 109).addBox(-1.0F, -1.95F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7798F, 5.7984F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3982F, 3.8351F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(107, 106).addBox(-1.0F, -1.925F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0166F, 1.8719F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(104, 107).addBox(-1.0F, -1.975F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(97, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.5663F, 0.2128F, -0.3326F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.4379F, 0.4191F, -0.7383F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(3, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.5326F, 0.2013F, -0.3395F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.41F, 0.3955F, -0.7494F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3509F, 0.319F, 0.1736F, 0.537F, -1.2648F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 4).mirror().addBox(-8.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7509F, 2.219F, 0.186F, 0.5702F, -1.2582F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0509F, 4.219F, 0.1909F, 0.6236F, -1.3066F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0509F, 4.219F, 0.6127F, 0.2416F, -0.3733F));

		PartDefinition cube_r170 = Body11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 89).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0509F, 4.219F, 0.4714F, 0.4633F, -0.7752F));

		PartDefinition cube_r171 = Body11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.6806F, 0.3258F, -0.5584F));

		PartDefinition cube_r172 = Body11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(72, 34).mirror().addBox(-6.8126F, -0.8451F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4509F, 6.219F, 0.5024F, 0.5664F, -0.9641F));

		PartDefinition cube_r173 = Body11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(72, 34).addBox(1.8126F, -0.8451F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.5024F, -0.5664F, 0.9641F));

		PartDefinition cube_r174 = Body11.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(10, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4509F, 6.219F, 0.6806F, -0.3258F, 0.5584F));

		PartDefinition cube_r175 = Body11.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(91, 89).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0509F, 4.219F, 0.4714F, -0.4633F, 0.7752F));

		PartDefinition cube_r176 = Body11.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(38, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0509F, 4.219F, 0.6127F, -0.2416F, 0.3733F));

		PartDefinition cube_r177 = Body11.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(68, 44).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0509F, 4.219F, 0.1909F, -0.6236F, 1.3066F));

		PartDefinition cube_r178 = Body11.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(54, 4).addBox(2.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.186F, -0.5702F, 1.2582F));

		PartDefinition cube_r179 = Body11.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 20).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.1736F, -0.537F, 1.2648F));

		PartDefinition cube_r180 = Body11.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(98, 4).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.41F, -0.3955F, 0.7494F));

		PartDefinition cube_r181 = Body11.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(3, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3509F, 0.319F, 0.5326F, -0.2013F, 0.3395F));

		PartDefinition cube_r182 = Body11.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 62).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.4379F, -0.4191F, 0.7383F));

		PartDefinition cube_r183 = Body11.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7509F, 2.219F, 0.5663F, -0.2128F, 0.3326F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0657F, 0.0871F, 0.0057F));

		PartDefinition cube_r184 = Body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5F, -0.6364F, -0.059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(24, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3122F, 0.3007F, 0.5194F, 0.3571F, -0.5557F));

		PartDefinition cube_r186 = Body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-5.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3122F, 0.3007F, 0.3249F, 0.532F, -1.0001F));

		PartDefinition cube_r187 = Body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7122F, 2.3007F, 0.7256F, 0.3912F, -0.6638F));

		PartDefinition cube_r188 = Body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(-3.4898F, -0.1562F, -0.1398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, 0.5777F, 0.3715F, -0.7012F));

		PartDefinition cube_r189 = Body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-3.1483F, 0.3895F, 1.1425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, 0.4219F, 0.3996F, -0.9374F));

		PartDefinition cube_r190 = Body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(98, 45).addBox(1.1483F, 0.3895F, 1.1425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, 0.4219F, -0.3996F, 0.9374F));

		PartDefinition cube_r191 = Body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(58, 18).addBox(0.4898F, -0.1562F, -0.1398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, 0.5777F, -0.3715F, 0.7012F));

		PartDefinition cube_r192 = Body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(72, 36).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7122F, 2.3007F, 0.7256F, -0.3912F, 0.6638F));

		PartDefinition cube_r193 = Body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(109, 22).addBox(0.0F, -1.792F, 0.0613F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9068F, 5.7631F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(108, 18).addBox(0.0F, -2.3286F, -0.1149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 5).addBox(1.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3122F, 0.3007F, 0.3249F, -0.532F, 1.0001F));

		PartDefinition cube_r196 = Body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(24, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3122F, 0.3007F, 0.5194F, -0.3571F, 0.5557F));

		PartDefinition cube_r197 = Body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(109, 30).addBox(-1.0F, -1.7898F, 2.1357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 69).addBox(-1.5F, -0.0648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2037F, -0.1097F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(109, 26).addBox(-1.0F, -1.9398F, 0.0356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1829F, -0.0119F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 4.6983F, 4.405F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(103, 87).addBox(-0.7551F, 0.4655F, -2.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5198F, 1.3028F, 0.1007F, 1.9607F, -0.3802F, 0.8935F));

		PartDefinition cube_r200 = bone.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(5, 104).addBox(-0.7551F, -1.4399F, -2.8208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5198F, 1.3028F, 0.1007F, 2.877F, -0.3802F, 0.8935F));

		PartDefinition cube_r201 = bone.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(9, 82).addBox(-0.7551F, -0.5767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5198F, 1.3028F, 0.1007F, 2.3534F, -0.3802F, 0.8935F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(71, 79).addBox(-0.7551F, -0.2767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5198F, 1.3028F, 0.1007F, 2.4407F, -0.3802F, 0.8935F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(107, 40).addBox(-0.8234F, -0.7801F, -3.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(38, 107).addBox(-0.8234F, -0.7801F, -2.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3834F, 1.4795F, -0.3937F, 1.5393F, -0.0946F, 0.9516F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(28, 107).addBox(-0.8234F, -0.0837F, -3.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 107).addBox(-0.8234F, -0.0837F, -2.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.3834F, 1.4795F, -0.3937F, 1.0942F, -0.0946F, 0.9516F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(104, 31).addBox(-0.8234F, -0.2741F, -3.7065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 84).addBox(-0.8234F, -0.8741F, -3.7065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(79, 70).addBox(-0.8234F, -0.5241F, -2.5565F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3834F, 1.4795F, -0.3937F, 1.3648F, -0.0946F, 0.9516F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(44, 106).addBox(-0.5F, -0.15F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(106, 15).addBox(-0.5F, -0.15F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3721F, -0.7376F, 1.0709F, -0.2463F, -0.0607F, -0.2118F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 11).addBox(-0.5265F, -0.2278F, -0.3993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1345F, -0.1533F, -0.2913F, 0.4082F, -0.0607F, -0.2118F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(103, 49).addBox(-0.6F, -0.525F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.1975F, -0.0313F, 1.7608F, -0.0607F, -0.2118F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(103, 78).addBox(-0.6F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1975F, -0.0313F, 1.1063F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 4.6983F, 4.405F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 87).mirror().addBox(-0.2449F, 0.4655F, -2.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.3028F, 0.1007F, 1.9607F, 0.3802F, -0.8935F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-0.2449F, -1.4399F, -2.8208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.3028F, 0.1007F, 2.877F, 0.3802F, -0.8935F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(9, 82).mirror().addBox(-0.2449F, -0.5767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.3028F, 0.1007F, 2.3534F, 0.3802F, -0.8935F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(71, 79).mirror().addBox(-0.2449F, -0.2767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.3028F, 0.1007F, 2.4407F, 0.3802F, -0.8935F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(107, 40).mirror().addBox(-0.1766F, -0.7801F, -3.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(38, 107).mirror().addBox(-0.1766F, -0.7801F, -2.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3834F, 1.4795F, -0.3937F, 1.5393F, 0.0946F, -0.9516F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(28, 107).mirror().addBox(-0.1766F, -0.0837F, -3.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(20, 107).mirror().addBox(-0.1766F, -0.0837F, -2.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.3834F, 1.4795F, -0.3937F, 1.0942F, 0.0946F, -0.9516F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 31).mirror().addBox(-0.1766F, -0.2741F, -3.7065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 84).mirror().addBox(-0.1766F, -0.8741F, -3.7065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(79, 70).mirror().addBox(-0.1766F, -0.5241F, -2.5565F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.3834F, 1.4795F, -0.3937F, 1.3648F, 0.0946F, -0.9516F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-0.5F, -0.15F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(106, 15).mirror().addBox(-0.5F, -0.15F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3721F, -0.7376F, 1.0709F, -0.2463F, 0.0607F, 0.2118F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 11).mirror().addBox(-0.4735F, -0.2278F, -0.3993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.1345F, -0.1533F, -0.2913F, 0.4082F, 0.0607F, 0.2118F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-0.4F, -0.525F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1975F, -0.0313F, 1.7608F, 0.0607F, 0.2118F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(103, 78).mirror().addBox(-0.4F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1975F, -0.0313F, 1.1063F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4579F, 5.1194F, 4.7612F, 0.7793F, -0.4696F, 0.2265F));

		PartDefinition cube_r221 = HindlimbL.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(56, 0).addBox(3.8F, 0.5F, -2.275F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 81).addBox(0.3F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2391F, -0.1466F, 0.4614F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r222 = HindlimbL.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(33, 107).addBox(-0.7F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8512F, 2.2928F, 0.4834F, 0.0F, -0.3927F, 0.6109F));

		PartDefinition cube_r223 = HindlimbL.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(10, 104).addBox(1.225F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(104, 9).addBox(0.025F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4268F, 1.2954F, -0.0386F, 0.0F, 0.6109F, 0.6109F));

		PartDefinition cube_r224 = HindlimbL.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(104, 6).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4268F, 1.2954F, -0.0386F, 0.0F, -0.2618F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4579F, 5.1194F, 4.7612F, 0.7793F, 0.4696F, -0.2265F));

		PartDefinition cube_r225 = HindlimbL2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(57, 34).addBox(-7.8F, 0.5F, -2.275F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 81).addBox(-2.3F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2391F, -0.1466F, 0.4614F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r226 = HindlimbL2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(107, 37).addBox(-0.3F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8512F, 2.2928F, 0.4834F, 0.0F, 0.3927F, -0.6109F));

		PartDefinition cube_r227 = HindlimbL2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 28).addBox(-2.225F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(104, 25).addBox(-1.025F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4268F, 1.2954F, -0.0386F, 0.0F, -0.6109F, -0.6109F));

		PartDefinition cube_r228 = HindlimbL2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(20, 104).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4268F, 1.2954F, -0.0386F, 0.0F, 0.2618F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0617F, 6.7906F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r229 = Body5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(108, 76).addBox(-1.0F, -1.45F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 72).addBox(-1.0F, -1.425F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 47).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Body5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 108).addBox(0.0F, -0.4002F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9105F, 1.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Body5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(108, 47).addBox(0.0F, -0.3001F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7105F, 3.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body12 = Body5.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r232 = Body12.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(109, 8).addBox(-1.0F, -1.325F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 109).addBox(-1.0F, -1.425F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 70).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Body12.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(108, 80).addBox(0.0F, -0.6002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9105F, 1.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Body12.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 109).addBox(0.0F, 0.3999F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7105F, 3.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0612F, 3.9796F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r235 = Body13.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(108, 88).addBox(-1.0F, -1.2F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 84).addBox(-1.0F, -1.275F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 8).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Body13.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(55, 109).addBox(0.0F, -0.0002F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9105F, 1.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Body13.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(52, 109).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7105F, 3.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r238 = Body14.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(66, 53).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4043F, 3.4079F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Body14.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(109, 4).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1479F, 0.9031F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Body14.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(58, 109).addBox(0.0F, -0.5001F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9105F, 1.3672F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Body14.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r242 = Body15.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 99).addBox(-1.0F, -0.35F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 35).addBox(-1.0F, -0.575F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 38).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1654F, 0.0032F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body15.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1167F, 3.8742F, -0.1232F, -0.1299F, 0.016F));

		PartDefinition cube_r243 = Body7.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(109, 58).addBox(-1.0F, -0.4162F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1667F, 0.0118F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Body7.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1667F, 0.0118F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0165F, 3.0478F, 0.248F, -0.1693F, -0.0426F));

		PartDefinition cube_r245 = Body8.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(86, 85).addBox(-0.5F, -0.3455F, 2.7668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.006F, 12.0659F, 6.3633F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Body8.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(58, 22).addBox(-0.5F, -0.8359F, -0.1616F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.006F, 12.0659F, 6.3633F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Body8.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(78, 7).addBox(-1.5F, -0.8112F, -0.3737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.997F, 1.7549F, 1.0786F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Body8.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(11, 70).addBox(-0.5F, -1.0318F, 0.0346F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, 8.6237F, 3.9943F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Body8.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(30, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, 3.6237F, 3.0942F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Body8.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(89, 77).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.997F, -0.0951F, -0.0964F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Kyhytysuka.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.1196F, -18.8117F, -0.1547F, 0.0272F, 0.1724F));

		PartDefinition cube_r251 = Head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(55, 39).addBox(-1.5F, -4.2F, -2.1F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0536F, 1.0508F, -1.5731F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(13, 57).addBox(-1.5F, -1.3F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0536F, 1.1691F, -2.0984F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(38, 29).addBox(-2.0F, 0.0743F, -5.6874F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -1.7926F, 0.6041F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r254 = Head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 61).addBox(-2.0F, -0.0507F, -1.6874F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9464F, -1.7926F, 0.6041F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(34, 86).addBox(-2.0F, -0.0007F, 0.0126F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9464F, -2.4413F, -1.2939F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(27, 86).addBox(-2.0F, -0.0007F, 0.0126F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9464F, -2.4762F, -2.2933F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(81, 22).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -2.4706F, -2.2872F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(53, 75).addBox(-0.4F, 0.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -0.5701F, -9.0005F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r259 = Head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(48, 69).addBox(-1.0F, 0.0F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.1715F, -7.0931F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(80, 80).addBox(-1.0F, -0.0002F, -1.008F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.5001F, -6.1402F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(18, 76).addBox(-1.5F, 0.0002F, -0.9888F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0506F, -1.8789F, -5.2322F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(9, 76).addBox(-1.5F, -0.0078F, -1.0004F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0506F, -2.1539F, -4.2571F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 76).addBox(-1.5F, -0.0181F, -0.0294F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0506F, -2.1493F, -4.2267F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -3.125F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7133F, 1.0482F, 6.7349F, 0.2269F, 0.1047F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(64, 103).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7952F, 1.9322F, 7.5147F, 1.5359F, 0.1047F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(21, 87).addBox(-0.5F, -2.825F, 0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7133F, 1.0482F, 6.7349F, 0.6196F, 0.1047F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(41, 86).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6505F, 1.9973F, 6.1374F, 0.9425F, 0.1047F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 95).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5569F, 2.4435F, 5.2474F, 0.4625F, 0.1047F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 95).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4597F, 2.81F, 4.3221F, 0.3752F, 0.1047F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(44, 75).addBox(-0.5F, -1.925F, -2.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3635F, 2.7509F, 3.4072F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(95, 65).addBox(-0.575F, -1.0F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1077F, 1.9343F, -2.0556F, -0.0177F, 0.1437F, 0.0055F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(100, 35).addBox(-0.4913F, -1.0552F, 3.3001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(24, 100).addBox(-0.4956F, -1.1026F, 2.9001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 19).addBox(-0.5F, -1.3F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 100).addBox(-0.5044F, -0.9974F, 2.0999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 100).addBox(-0.5091F, -1.2947F, 1.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 100).addBox(-0.5131F, -1.0422F, 1.2998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 107).addBox(-0.5174F, -0.3145F, 0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 95).addBox(-0.5045F, -1.0974F, -0.2988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 95).addBox(-0.5218F, -0.9869F, 0.4997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8215F, 1.812F, -14.2853F, 0.0393F, 0.0218F, 0.002F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(95, 35).addBox(-0.3242F, -1.2779F, 4.8929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(31, 95).addBox(-0.3242F, -1.2779F, 4.2929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(93, 84).addBox(-0.3242F, -1.3779F, 3.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7215F, 1.812F, -6.5853F, -0.0914F, 0.109F, 0.002F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(95, 19).addBox(-0.3242F, -0.7774F, 3.1063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 93).addBox(-0.3242F, -0.8774F, 2.5063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 93).addBox(-0.3242F, -1.0774F, 1.5063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(58, 93).addBox(-0.2698F, -1.0839F, 0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(13, 94).addBox(-0.3242F, -1.1024F, -0.3937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7215F, 1.812F, -6.5853F, 0.0395F, 0.109F, 0.002F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(53, 93).addBox(-0.4112F, -1.028F, 1.7043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(48, 93).addBox(-0.4057F, -1.2793F, 1.0071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(8, 94).addBox(-0.4169F, -1.1767F, 0.6041F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(8, 94).addBox(-0.3944F, -1.4819F, 0.2087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(8, 94).addBox(-0.3659F, -1.1885F, -0.2943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 7).addBox(-0.3717F, -1.4871F, -0.7906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8215F, 1.812F, -9.6853F, 0.0393F, 0.0567F, 0.002F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(10, 107).addBox(-0.638F, -0.4829F, -3.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 107).addBox(-0.6598F, -0.4873F, -2.5652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 100).addBox(-0.6318F, -1.2566F, -4.4657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 10).addBox(-0.636F, -1.1575F, -5.4656F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 95).addBox(-0.6316F, -1.1566F, -6.2653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 6).addBox(-0.6272F, -1.1558F, -7.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(95, 69).addBox(-0.6227F, -1.0299F, -7.8648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 87).addBox(-0.6249F, -0.9803F, -8.3648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 83).addBox(-0.6271F, -0.9807F, -8.8648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.0218F, 0.0218F, 0.002F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(37, 63).addBox(-0.5F, -1.375F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3461F, 1.5727F, -2.532F, -0.0897F, 0.1457F, 0.0232F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(105, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1299F, 0.6842F, -2.0519F, 0.5163F, 0.1128F, 0.055F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(71, 0).addBox(-1.0F, -0.6297F, -0.9525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, -0.1745F, 0.1004F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(73, 97).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4222F, -2.6057F, 4.0914F, 0.1047F, 0.1004F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(36, 76).addBox(-0.95F, -3.2519F, -2.7604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(70, 65).addBox(-0.975F, -3.7519F, -3.2604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.025F, -1.3544F, 4.8394F, 1.6057F, 0.1004F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 107).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 107).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3292F, -1.7518F, 2.9203F, 2.9147F, 0.1004F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(99, 106).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2304F, -1.5868F, 1.939F, 1.7366F, 0.1004F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(94, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1412F, -1.1328F, 1.0525F, 0.4712F, 0.1004F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(89, 106).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -0.4319F, 0.3428F, -0.7941F, 0.1004F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(84, 106).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0429F, 0.5318F, 0.0769F, -1.8413F, 0.1004F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(89, 50).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0764F, 1.4744F, 0.4091F, -2.8013F, 0.1004F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(79, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1466F, 2.1876F, 1.1064F, 2.3475F, 0.1004F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(74, 106).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2388F, 2.5784F, 2.0223F, 1.1694F, 0.1004F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(64, 106).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3389F, 2.6307F, 3.0159F, -0.0524F, 0.1004F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(80, 75).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4369F, 2.4228F, 3.9892F, -1.3614F, 0.1004F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(103, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5169F, 1.821F, 4.7838F, -2.4958F, 0.1004F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(14, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5639F, 0.938F, 5.2509F, 2.6529F, 0.1004F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(29, 103).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5639F, 0.938F, 5.2509F, 1.7802F, 0.1004F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(105, 34).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5258F, -0.8322F, 4.8127F, 0.2967F, 0.1004F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(104, 60).addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4593F, -1.6677F, 4.2121F, -0.7069F, 0.1004F, 0.0F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 49).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.127F, -2.359F, 1.2403F, 0.3491F, 0.1004F, 0.0F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(90, 19).addBox(-0.4215F, -0.0903F, -0.8973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1402F, -2.5044F, 2.1247F, 0.2618F, 0.1004F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(86, 89).addBox(-0.3113F, -0.0176F, -0.9355F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1214F, -2.7903F, 3.0385F, 0.2094F, 0.1004F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 85).addBox(-0.5F, 0.0F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0612F, -1.6962F, -0.635F, 0.3324F, 0.0805F, 0.0379F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 39).addBox(-0.45F, -0.5F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.125F, 1.5059F, -4.7848F, -0.0653F, 0.0435F, -0.0036F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(53, 48).addBox(-0.5F, -0.55F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4977F, -0.1739F, -3.8409F, 0.2157F, 0.1457F, 0.0232F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(63, 84).addBox(-0.5F, 0.125F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 84).addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7176F, 0.4807F, -8.1383F, 0.1045F, 0.0394F, -0.0009F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(26, 63).addBox(-1.1328F, -1.7178F, 2.3996F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.0693F, 0.1072F, -0.0258F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(54, 106).addBox(-0.6331F, -3.0296F, -7.8201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.288F, 0.0218F, -0.0005F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(79, 103).addBox(-0.6331F, 5.0386F, 5.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, -2.4173F, 0.0218F, -0.0005F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(103, 81).addBox(-0.6331F, 6.4511F, -4.5926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, -1.0647F, 0.0218F, -0.0005F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 57).addBox(-0.6331F, -1.2225F, -8.1317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.296F))
				.texOffs(56, 56).addBox(-0.6331F, -1.5225F, -7.8317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.0829F, 0.0218F, -0.0005F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(38, 48).addBox(-0.6337F, -0.8543F, -8.8651F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.0567F, 0.0218F, 0.002F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(59, 106).addBox(-0.7796F, -1.4549F, -0.9439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(69, 53).addBox(-0.7796F, -1.5549F, -4.0439F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.1221F, 0.0041F, 0.0043F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(80, 51).addBox(-0.3742F, -1.9099F, -2.9162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0299F, 1.8362F, -9.1228F, 0.1396F, -0.0003F, 0.0043F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(45, 81).addBox(-0.1876F, -1.3711F, -2.8306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F))
				.texOffs(80, 17).addBox(-0.1876F, -1.8711F, -2.8306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0299F, 1.8362F, -9.1228F, 0.1222F, 0.0479F, 0.0043F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(70, 59).addBox(-0.7108F, -0.9205F, -4.0291F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -11.6228F, 0.0524F, 0.0261F, 0.003F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 82).addBox(-0.1827F, -0.9568F, -2.9413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0299F, 1.8362F, -9.1228F, 0.0175F, 0.048F, 0.0014F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(18, 82).addBox(-0.9373F, -0.7677F, -0.1848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.329F, 1.6363F, -9.328F, -0.1137F, 0.0392F, 0.0055F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(85, 32).addBox(-1.0F, -2.6914F, -1.9519F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.199F, -0.6136F, -0.2038F, 0.1678F, -0.0451F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(72, 84).addBox(-0.425F, -1.675F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3854F, 0.5684F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(69, 20).addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.8926F, 0.3827F, -8.1351F, 0.1048F, 0.0523F, 0.0027F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(48, 63).addBox(-0.5F, -0.8F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2991F, 1.9949F, -3.034F, -0.0261F, 0.1091F, 0.0015F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-0.5F, -3.125F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7133F, 1.0482F, 6.7349F, 0.2269F, -0.1047F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(64, 103).mirror().addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7952F, 1.9322F, 7.5147F, 1.5359F, -0.1047F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-0.5F, -2.825F, 0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7133F, 1.0482F, 6.7349F, 0.6196F, -0.1047F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(41, 86).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6505F, 1.9973F, 6.1374F, 0.9425F, -0.1047F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(89, 95).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5569F, 2.4435F, 5.2474F, 0.4625F, -0.1047F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 95).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4597F, 2.81F, 4.3221F, 0.3752F, -0.1047F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(44, 75).mirror().addBox(-0.5F, -1.925F, -2.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3635F, 2.7509F, 3.4072F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-0.425F, -1.0F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1077F, 1.9343F, -2.0556F, -0.0177F, -0.1437F, -0.0055F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(100, 35).mirror().addBox(-0.5087F, -1.0552F, 3.3001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(24, 100).mirror().addBox(-0.5044F, -1.1026F, 2.9001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 19).mirror().addBox(-0.5F, -1.3F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 100).mirror().addBox(-0.4956F, -0.9974F, 2.0999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 100).mirror().addBox(-0.4909F, -1.2947F, 1.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 100).mirror().addBox(-0.4869F, -1.0422F, 1.2998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 107).mirror().addBox(-0.4826F, -0.3145F, 0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 95).mirror().addBox(-0.4955F, -1.0974F, -0.2988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 95).mirror().addBox(-0.4782F, -0.9869F, 0.4997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8215F, 1.812F, -14.2853F, 0.0393F, -0.0218F, -0.002F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(95, 35).mirror().addBox(-0.6758F, -1.2779F, 4.8929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(31, 95).mirror().addBox(-0.6758F, -1.2779F, 4.2929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 84).mirror().addBox(-0.6758F, -1.3779F, 3.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7215F, 1.812F, -6.5853F, -0.0914F, -0.109F, -0.002F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(95, 19).mirror().addBox(-0.6758F, -0.7774F, 3.1063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 93).mirror().addBox(-0.6758F, -0.8774F, 2.5063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 93).mirror().addBox(-0.6758F, -1.0774F, 1.5063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(58, 93).mirror().addBox(-0.7302F, -1.0839F, 0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(13, 94).mirror().addBox(-0.6758F, -1.1024F, -0.3937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7215F, 1.812F, -6.5853F, 0.0395F, -0.109F, -0.002F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-0.5888F, -1.028F, 1.7043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(48, 93).mirror().addBox(-0.5943F, -1.2793F, 1.0071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(8, 94).mirror().addBox(-0.5831F, -1.1767F, 0.6041F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(8, 94).mirror().addBox(-0.6056F, -1.4819F, 0.2087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(8, 94).mirror().addBox(-0.6341F, -1.1885F, -0.2943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 7).mirror().addBox(-0.6283F, -1.4871F, -0.7906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8215F, 1.812F, -9.6853F, 0.0393F, -0.0567F, -0.002F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(10, 107).mirror().addBox(-0.362F, -0.4829F, -3.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 107).mirror().addBox(-0.3402F, -0.4873F, -2.5652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(-0.3682F, -1.2566F, -4.4657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 10).mirror().addBox(-0.364F, -1.1575F, -5.4656F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 95).mirror().addBox(-0.3684F, -1.1566F, -6.2653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 6).mirror().addBox(-0.3728F, -1.1558F, -7.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(95, 69).mirror().addBox(-0.3772F, -1.0299F, -7.8648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 87).mirror().addBox(-0.3751F, -0.9803F, -8.3648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 83).mirror().addBox(-0.3729F, -0.9807F, -8.8648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.0218F, -0.0218F, -0.002F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(37, 63).mirror().addBox(-0.5F, -1.375F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3461F, 1.5727F, -2.532F, -0.0897F, -0.1457F, -0.0232F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(105, 44).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1299F, 0.6842F, -2.0519F, 0.5163F, -0.1128F, -0.055F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(0.0F, -0.6297F, -0.9525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, -0.1745F, -0.1004F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(73, 97).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4222F, -2.6057F, 4.0914F, 0.1047F, -0.1004F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.05F, -3.2519F, -2.7604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(70, 65).mirror().addBox(-0.025F, -3.7519F, -3.2604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -1.3544F, 4.8394F, 1.6057F, -0.1004F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 107).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3292F, -1.7518F, 2.9203F, 2.9147F, -0.1004F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(99, 106).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2304F, -1.5868F, 1.939F, 1.7366F, -0.1004F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(94, 106).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1412F, -1.1328F, 1.0525F, 0.4712F, -0.1004F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 106).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, -0.4319F, 0.3428F, -0.7941F, -0.1004F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(84, 106).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0429F, 0.5318F, 0.0769F, -1.8413F, -0.1004F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0764F, 1.4744F, 0.4091F, -2.8013F, -0.1004F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(79, 106).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1466F, 2.1876F, 1.1064F, 2.3475F, -0.1004F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(74, 106).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2388F, 2.5784F, 2.0223F, 1.1694F, -0.1004F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(64, 106).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3389F, 2.6307F, 3.0159F, -0.0524F, -0.1004F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4369F, 2.4228F, 3.9892F, -1.3614F, -0.1004F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(103, 75).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5169F, 1.821F, 4.7838F, -2.4958F, -0.1004F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 0.938F, 5.2509F, 2.6529F, -0.1004F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(29, 103).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 0.938F, 5.2509F, 1.7802F, -0.1004F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.8322F, 4.8127F, 0.2967F, -0.1004F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.5F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4593F, -1.6677F, 4.2121F, -0.7069F, -0.1004F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(30, 49).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.127F, -2.359F, 1.2403F, 0.3491F, -0.1004F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(90, 19).mirror().addBox(-0.5785F, -0.0903F, -0.8973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1402F, -2.5044F, 2.1247F, 0.2618F, -0.1004F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-0.6887F, -0.0176F, -0.9355F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1214F, -2.7903F, 3.0385F, 0.2094F, -0.1004F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(-0.5F, 0.0F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0612F, -1.6962F, -0.635F, 0.3324F, -0.0805F, -0.0379F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.55F, -0.5F, -2.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.125F, 1.5059F, -4.7848F, -0.0653F, -0.0435F, 0.0036F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(53, 48).mirror().addBox(-0.5F, -0.55F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4977F, -0.1739F, -3.8409F, 0.2157F, -0.1457F, -0.0232F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-0.5F, 0.125F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(54, 84).mirror().addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7176F, 0.4807F, -8.1383F, 0.1045F, -0.0394F, 0.0009F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(26, 63).mirror().addBox(0.1328F, -1.7178F, 2.3996F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.0693F, -0.1072F, 0.0258F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(54, 106).mirror().addBox(-0.3669F, -3.0296F, -7.8201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.288F, -0.0218F, 0.0005F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(79, 103).mirror().addBox(-0.3669F, 5.0386F, 5.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, -2.4173F, -0.0218F, 0.0005F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(103, 81).mirror().addBox(-0.3669F, 6.4511F, -4.5926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, -1.0647F, -0.0218F, 0.0005F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.3669F, -1.2225F, -8.1317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(56, 56).mirror().addBox(-0.3669F, -1.5225F, -7.8317F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.0829F, -0.0218F, 0.0005F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(-0.3664F, -0.8543F, -8.8651F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.0567F, -0.0218F, -0.002F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(59, 106).mirror().addBox(-0.2204F, -1.4549F, -0.9439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(69, 53).mirror().addBox(-0.2204F, -1.5549F, -4.0439F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.1221F, -0.0041F, -0.0043F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-0.6258F, -1.9099F, -2.9162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0299F, 1.8362F, -9.1228F, 0.1396F, 0.0003F, -0.0043F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.8124F, -1.3711F, -2.8306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(80, 17).mirror().addBox(-0.8124F, -1.8711F, -2.8306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0299F, 1.8362F, -9.1228F, 0.1222F, -0.0479F, -0.0043F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-0.2892F, -0.9205F, -4.0291F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -11.6228F, 0.0524F, -0.0261F, -0.003F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.8173F, -0.9568F, -2.9413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0299F, 1.8362F, -9.1228F, 0.0175F, -0.048F, -0.0014F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(18, 82).mirror().addBox(-0.0627F, -0.7677F, -0.1848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.329F, 1.6363F, -9.328F, -0.1137F, -0.0392F, -0.0055F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(0.0F, -2.6914F, -1.9519F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.199F, -0.6136F, -0.2038F, -0.1678F, 0.0451F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(72, 84).mirror().addBox(-0.575F, -1.675F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3854F, 0.5684F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.8926F, 0.3827F, -8.1351F, 0.1048F, -0.0523F, -0.0027F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-0.5F, -0.8F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2991F, 1.9949F, -3.034F, -0.0261F, -0.1091F, -0.0015F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 2.5699F, 1.4567F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(105, 63).mirror().addBox(-0.2F, -0.275F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(105, 66).mirror().addBox(-0.2F, -0.275F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.7792F, 1.1274F, -0.3816F, 0.1885F, -0.0113F, 0.0515F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(62, 75).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(62, 75).addBox(2.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.5F, 0.3377F, 0.1362F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(107, 55).mirror().addBox(-2.0F, -1.6208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false)
				.texOffs(107, 55).addBox(1.0F, -1.6208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.0F, 0.4768F, 1.9267F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(3, 94).mirror().addBox(-0.5F, -2.025F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3997F, -1.753F, 1.7892F, -0.0426F, -0.0094F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(44, 103).mirror().addBox(-0.5F, -0.575F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(44, 103).addBox(2.5F, -0.575F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.2632F, -1.1662F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(81, 90).mirror().addBox(-0.5F, -1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(81, 90).addBox(2.5F, -1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5F, 0.487F, -0.3022F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(49, 103).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(49, 103).addBox(2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.5F, -0.1786F, 1.6042F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(48, 86).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false)
				.texOffs(48, 86).addBox(2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-1.5F, 0.6601F, 2.1488F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(88, 38).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0204F)).mirror(false)
				.texOffs(88, 38).addBox(2.508F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0204F)), PartPose.offsetAndRotation(-1.504F, 1.5193F, 1.6766F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.692F, -0.6788F, -3.9727F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 96).mirror().addBox(-0.692F, -0.6788F, -0.7727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(107, 93).mirror().addBox(-0.692F, 0.2212F, -0.7727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 27).mirror().addBox(-0.692F, -0.2788F, -4.1727F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.6765F, -0.1087F, -0.0123F, 0.0109F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.6854F, 0.2623F, -4.1821F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.6765F, -0.2133F, -0.0109F, 0.0158F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-0.4292F, -0.0593F, -3.9872F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(38, 93).mirror().addBox(-0.6769F, -0.8084F, -3.3535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(69, 105).mirror().addBox(-0.6769F, -0.5334F, 0.8465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(105, 69).mirror().addBox(-0.6769F, -0.4084F, 1.4465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.9143F, -11.7765F, -0.1191F, -0.1339F, 0.0195F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.4292F, -0.0513F, -0.039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.9143F, -11.7765F, -0.1889F, -0.1339F, 0.0195F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(89, 73).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-0.6445F, 0.5013F, -11.2567F, -0.1802F, -0.1339F, 0.0195F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-0.6769F, -0.7834F, -3.9535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(91, 91).mirror().addBox(-0.6769F, -0.7834F, -2.7535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.8143F, -11.5765F, -0.1191F, -0.1339F, 0.0195F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(39, 103).mirror().addBox(-0.282F, -0.8805F, -4.3794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.9143F, -11.5765F, -0.1002F, -0.0298F, 0.009F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(34, 103).addBox(-0.2346F, -1.292F, -1.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.7143F, -15.2765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-0.7654F, -1.292F, -1.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.7143F, -15.2765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-0.7654F, -1.292F, -1.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 99).mirror().addBox(-0.7654F, -1.467F, -3.4823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.6765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(33, 91).addBox(-0.2346F, -1.342F, -1.6823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.7143F, -15.4765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-0.7654F, -1.342F, -1.6823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.7143F, -15.4765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-0.7654F, -1.342F, -1.6823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.8765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-0.7654F, -1.342F, -2.2823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.7143F, -15.6765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(39, 99).mirror().addBox(-0.7654F, -1.392F, -2.8823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.4765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(44, 99).addBox(-0.2346F, -1.467F, -3.4823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.6143F, -15.2765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(44, 99).mirror().addBox(-0.7654F, -1.467F, -3.4823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.6143F, -15.2765F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(49, 99).addBox(-0.2346F, -1.467F, -4.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.6143F, -15.5015F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(-0.7654F, -1.467F, -4.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.6143F, -15.5015F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(-0.7654F, -1.467F, -4.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0183F, -0.9143F, -15.8515F, -0.0999F, 0.0051F, 0.009F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(54, 99).mirror().addBox(-0.4263F, -1.9501F, -3.9293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.7143F, -18.8765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(59, 99).mirror().addBox(-0.4263F, -1.7001F, -4.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.8143F, -19.0765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(64, 99).mirror().addBox(-0.4263F, -1.8001F, -5.1294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(83, 99).mirror().addBox(-0.4263F, -1.9001F, -6.3293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.8143F, -18.9765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(88, 99).mirror().addBox(-0.4263F, -1.9001F, -6.9294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.8893F, -19.1765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.4263F, -1.9001F, -7.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.2765F, -0.0655F, -0.0435F, 0.0032F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(43, 93).mirror().addBox(-0.6769F, -0.7584F, -1.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.7143F, -10.7765F, -0.1191F, -0.1339F, 0.0195F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(59, 63).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-0.553F, 0.917F, -11.9966F, -0.2064F, -0.1339F, 0.0195F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-0.7978F, -0.4775F, -0.9635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0265F, 1.5515F, -4.8647F, -0.0698F, -0.0698F, 0.0F));

		PartDefinition cube_r414 = Jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-0.8025F, -1.3988F, -1.2578F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.033F)).mirror(false), PartPose.offsetAndRotation(-1.0265F, 1.5515F, -4.8647F, -0.0524F, -0.0697F, 0.0053F));

		PartDefinition cube_r415 = Jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(0.0F, -1.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(106, 12).mirror().addBox(0.0F, -1.325F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(81, 56).mirror().addBox(0.0F, -1.725F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0135F)).mirror(false), PartPose.offsetAndRotation(-1.8901F, 2.4616F, -3.9705F, 0.0173F, -0.0349F, 0.0015F));

		PartDefinition cube_r416 = Jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-0.4356F, 0.8266F, 1.7074F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.9143F, -11.7765F, -0.1925F, -0.1351F, 0.0071F));

		PartDefinition cube_r417 = Jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(77, 46).mirror().addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.9735F, 0.2234F, -8.7431F, -0.1669F, -0.1342F, 0.0166F));

		PartDefinition cube_r418 = Jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(36, 81).mirror().addBox(-0.4263F, -0.561F, -5.5955F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.1266F, -0.0435F, 0.0026F));

		PartDefinition cube_r419 = Jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 95).mirror().addBox(0.004F, -1.8995F, -8.1117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.0654F, 0.0173F, -0.0032F));

		PartDefinition cube_r420 = Jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(98, 99).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0345F, -2.3001F, -27.5225F, -0.0654F, 0.0173F, -0.0032F));

		PartDefinition cube_r421 = Jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(0.004F, -1.1385F, -8.73F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.0916F, 0.0173F, -0.0032F));

		PartDefinition cube_r422 = Jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(15, 49).mirror().addBox(-0.4004F, -1.1385F, -8.7295F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.0917F, -0.0305F, 0.0012F));

		PartDefinition cube_r423 = Jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(0.004F, 1.6378F, -8.0173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(103, 90).mirror().addBox(0.004F, 1.6378F, -8.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.4232F, 0.0173F, -0.0032F));

		PartDefinition cube_r424 = Jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-0.4263F, -0.4685F, -7.9923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.1441F, -0.0435F, 0.0026F));

		PartDefinition cube_r425 = Jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-0.4263F, -0.5484F, -8.7577F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3933F, -0.9143F, -19.3765F, -0.1615F, -0.0435F, 0.0032F));

		PartDefinition cube_r426 = Jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.8025F, -1.275F, -3.2035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.0265F, 1.5515F, -4.8647F, -0.1571F, -0.0697F, 0.0053F));

		PartDefinition cube_r427 = Jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(22, 70).mirror().addBox(-0.2463F, -1.0882F, -3.8497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4183F, -0.9143F, -19.3765F, -0.0739F, -0.0254F, 0.0109F));

		PartDefinition cube_r428 = Jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-0.2463F, -0.5509F, -3.8678F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4183F, -0.9143F, -19.3765F, -0.1612F, -0.0254F, 0.0109F));

		PartDefinition cube_r429 = Jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-0.8025F, -0.4065F, -2.7055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.0265F, 1.5515F, -4.8647F, -0.1397F, -0.0697F, 0.0053F));

		PartDefinition cube_r430 = Jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(100, 64).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -1.947F, -21.7317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r431 = Jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(100, 68).mirror().addBox(-0.5F, -0.975F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -1.747F, -21.9317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r432 = Jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(101, 14).mirror().addBox(-0.5F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -2.047F, -22.1317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r433 = Jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(69, 101).mirror().addBox(-0.5F, -0.975F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -1.747F, -22.3317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r434 = Jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, -0.95F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -1.747F, -22.1317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r435 = Jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.5F, -0.95F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -1.747F, -22.1317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r436 = Jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.5F, -0.95F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -2.047F, -22.5317F, -0.0742F, -0.0261F, 0.0019F));

		PartDefinition cube_r437 = Jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(103, 90).addBox(-1.004F, 1.6378F, -8.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(89, 103).addBox(-1.004F, 1.6378F, -8.0173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.4232F, -0.0173F, 0.0032F));

		PartDefinition cube_r438 = Jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(15, 49).addBox(-0.5996F, -1.1385F, -8.7295F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.0917F, 0.0305F, -0.0012F));

		PartDefinition cube_r439 = Jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 49).addBox(-1.004F, -1.1385F, -8.73F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.0916F, -0.0173F, 0.0032F));

		PartDefinition cube_r440 = Jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(98, 99).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0345F, -2.3001F, -27.5225F, -0.0654F, -0.0173F, 0.0032F));

		PartDefinition cube_r441 = Jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 95).addBox(-1.004F, -1.8995F, -8.1117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.0654F, -0.0173F, 0.0032F));

		PartDefinition cube_r442 = Jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(52, 10).addBox(-0.5737F, -0.5484F, -8.7577F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.1615F, 0.0435F, -0.0032F));

		PartDefinition cube_r443 = Jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5737F, -0.561F, -5.5955F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.1266F, 0.0435F, -0.0026F));

		PartDefinition cube_r444 = Jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5737F, -0.4685F, -7.9923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.1441F, 0.0435F, -0.0026F));

		PartDefinition cube_r445 = Jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(77, 46).addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.9735F, 0.2234F, -8.7431F, -0.1669F, 0.1342F, -0.0166F));

		PartDefinition cube_r446 = Jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(81, 27).addBox(-0.5644F, 0.8266F, 1.7074F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.6183F, -0.9143F, -11.7765F, -0.1925F, 0.1351F, -0.0071F));

		PartDefinition cube_r447 = Jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(81, 56).addBox(-1.0F, -1.725F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0135F))
				.texOffs(106, 12).addBox(-1.0F, -1.325F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(88, 69).addBox(-1.0F, -1.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.8901F, 2.4616F, -3.9705F, 0.0173F, 0.0349F, -0.0015F));

		PartDefinition cube_r448 = Jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(62, 89).addBox(-0.1975F, -0.4065F, -2.7055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.0265F, 1.5515F, -4.8647F, -0.1397F, 0.0697F, -0.0053F));

		PartDefinition cube_r449 = Jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(55, 89).addBox(-0.1975F, -1.275F, -3.2035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.0265F, 1.5515F, -4.8647F, -0.1571F, 0.0697F, -0.0053F));

		PartDefinition cube_r450 = Jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(27, 81).addBox(-0.1975F, -1.3988F, -1.2578F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(1.0265F, 1.5515F, -4.8647F, -0.0524F, 0.0697F, -0.0053F));

		PartDefinition cube_r451 = Jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(88, 65).addBox(-0.2022F, -0.4775F, -0.9635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0265F, 1.5515F, -4.8647F, -0.0698F, 0.0698F, 0.0F));

		PartDefinition cube_r452 = Jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(59, 63).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.553F, 0.917F, -11.9966F, -0.2064F, 0.1339F, -0.0195F));

		PartDefinition cube_r453 = Jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(105, 69).addBox(-0.3231F, -0.4084F, 1.4465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(69, 105).addBox(-0.3231F, -0.5334F, 0.8465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(38, 93).addBox(-0.3231F, -0.8084F, -3.3535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(11, 64).addBox(-0.5708F, -0.0593F, -3.9872F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.6183F, -0.9143F, -11.7765F, -0.1191F, 0.1339F, -0.0195F));

		PartDefinition cube_r454 = Jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(43, 93).addBox(-0.3231F, -0.7584F, -1.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6183F, -0.7143F, -10.7765F, -0.1191F, 0.1339F, -0.0195F));

		PartDefinition cube_r455 = Jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(91, 91).addBox(-0.3231F, -0.7834F, -2.7535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(68, 95).addBox(-0.3231F, -0.7834F, -3.9535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6183F, -0.8143F, -11.5765F, -0.1191F, 0.1339F, -0.0195F));

		PartDefinition cube_r456 = Jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(93, 99).addBox(-0.5737F, -1.9001F, -7.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.2765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r457 = Jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(88, 99).addBox(-0.5737F, -1.9001F, -6.9294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.8893F, -19.1765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(83, 99).addBox(-0.5737F, -1.9001F, -6.3293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.8143F, -18.9765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(64, 99).addBox(-0.5737F, -1.8001F, -5.1294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.9143F, -19.3765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(59, 99).addBox(-0.5737F, -1.7001F, -4.5294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.8143F, -19.0765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, -0.95F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -2.047F, -22.5317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(69, 101).addBox(-0.5F, -0.975F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -1.747F, -22.3317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(101, 14).addBox(-0.5F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -2.047F, -22.1317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(100, 68).addBox(-0.5F, -0.975F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -1.747F, -21.9317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(100, 64).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1961F, -1.947F, -21.7317F, -0.0742F, 0.0261F, -0.0019F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(54, 99).addBox(-0.5737F, -1.9501F, -3.9293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3933F, -0.7143F, -18.8765F, -0.0655F, 0.0435F, -0.0032F));

		PartDefinition cube_r467 = Jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(49, 99).addBox(-0.2346F, -1.467F, -4.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.8515F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r468 = Jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(44, 99).addBox(-0.2346F, -1.467F, -3.4823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(34, 103).addBox(-0.2346F, -1.292F, -1.0823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.6765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r469 = Jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(39, 99).addBox(-0.2346F, -1.392F, -2.8823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.4765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r470 = Jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(93, 45).addBox(-0.2346F, -1.342F, -2.2823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.7143F, -15.6765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r471 = Jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(33, 91).addBox(-0.2346F, -1.342F, -1.6823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.8765F, -0.0999F, -0.0051F, -0.009F));

		PartDefinition cube_r472 = Jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(39, 103).addBox(-0.718F, -0.8805F, -4.3794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6183F, -0.9143F, -11.5765F, -0.1002F, 0.0298F, -0.009F));

		PartDefinition cube_r473 = Jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(89, 73).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(0.6445F, 0.5013F, -11.2567F, -0.1802F, 0.1339F, -0.0195F));

		PartDefinition cube_r474 = Jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5708F, -0.0513F, -0.039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.6183F, -0.9143F, -11.7765F, -0.1889F, 0.1339F, -0.0195F));

		PartDefinition cube_r475 = Jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(0, 64).addBox(-0.3146F, 0.2623F, -4.1821F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.6765F, -0.2133F, 0.0109F, -0.0158F));

		PartDefinition cube_r476 = Jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(107, 93).addBox(-0.308F, 0.2212F, -0.7727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 96).addBox(-0.308F, -0.6788F, -0.7727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(57, 27).addBox(-0.308F, -0.2788F, -4.1727F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F))
				.texOffs(0, 70).addBox(-0.308F, -0.6788F, -3.9727F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0183F, -0.9143F, -15.6765F, -0.1087F, 0.0123F, -0.0109F));

		PartDefinition cube_r477 = Jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(70, 26).addBox(-0.7537F, -0.5509F, -3.8678F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4183F, -0.9143F, -19.3765F, -0.1612F, 0.0254F, -0.0109F));

		PartDefinition cube_r478 = Jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(22, 70).addBox(-0.7537F, -1.0882F, -3.8497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4183F, -0.9143F, -19.3765F, -0.0739F, 0.0254F, -0.0109F));

		PartDefinition cube_r479 = Jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(3, 94).addBox(-0.5F, -2.025F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.5F, 0.3997F, -1.753F, 1.7892F, 0.0426F, 0.0094F));

		PartDefinition cube_r480 = Jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(105, 66).addBox(-0.8F, -0.275F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F))
				.texOffs(105, 63).addBox(-0.8F, -0.275F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.7792F, 1.1274F, -0.3816F, 0.1885F, 0.0113F, -0.0515F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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