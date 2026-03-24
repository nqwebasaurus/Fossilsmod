package fossils.fossils.client.blockentity.model.callawayia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CallawayiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Callawayia;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body16;
	private final ModelPart Body17;
	private final ModelPart Body18;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public CallawayiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Callawayia = this.fossil.getChild("Callawayia");
		this.Body1 = this.Callawayia.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone4 = this.Body2.getChild("bone4");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone3 = this.Body4.getChild("bone3");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body12 = this.Body5.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body16 = this.Body15.getChild("Body16");
		this.Body17 = this.Body16.getChild("Body17");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body6 = this.Body18.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Callawayia.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Callawayia = fossil.addOrReplaceChild("Callawayia", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1181F, 0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Body1 = Callawayia.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8817F, -18.4422F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 44).addBox(0.0F, -1.5411F, 0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4817F, 2.8672F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 40).addBox(0.0F, -1.549F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7817F, 0.9672F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 50).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.2817F, 3.3672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5658F, 1.7526F, 0.1215F, 0.3902F, -0.7458F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5658F, 1.7526F, -0.0625F, 0.3956F, -1.2187F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-4.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2658F, 3.5526F, 0.0413F, 0.3447F, -1.4473F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 87).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2658F, 3.5526F, 0.1998F, 0.2856F, -0.9457F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2658F, 3.5526F, 0.3028F, 0.1828F, -0.5094F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5658F, 1.7526F, 0.1215F, -0.3902F, 0.7458F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 20).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5658F, 1.7526F, -0.0625F, -0.3956F, 1.2187F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 89).addBox(2.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2658F, 3.5526F, 0.0413F, -0.3447F, 1.4473F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 87).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2658F, 3.5526F, 0.1998F, -0.2856F, 0.9457F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2658F, 3.5526F, 0.3028F, -0.1828F, 0.5094F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0987F, 5.298F, 8.1405F, 0.5267F, -0.4059F, -0.0218F));

		PartDefinition cube_r14 = ForelimbL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 35).addBox(-4.7F, 0.0F, -0.4F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3756F, 5.8186F, -0.0116F, 0.0F, -0.2618F, 0.6545F));

		PartDefinition cube_r15 = ForelimbL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(104, 12).addBox(-1.7F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8848F, 3.1401F, 1.1884F, 0.0F, -0.6109F, 0.6545F));

		PartDefinition cube_r16 = ForelimbL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 81).addBox(-1.1F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(63, 23).addBox(-1.1F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8391F, 2.3377F, -0.9919F, 0.0F, 0.2182F, 0.6545F));

		PartDefinition cube_r17 = ForelimbL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(88, 73).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7797F, 0.7574F, -0.6183F, 0.0F, 1.0036F, 0.6545F));

		PartDefinition cube_r18 = ForelimbL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 77).addBox(-0.6F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8221F, 1.5573F, -0.1116F, 0.0F, 0.2618F, 0.6545F));

		PartDefinition cube_r19 = ForelimbL.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 23).addBox(-0.975F, 0.2F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r20 = ForelimbL.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 19).addBox(-1.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5479F, 1.3469F, 0.503F, 0.0F, -0.8596F, 0.6545F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0987F, 5.298F, 8.1405F, 0.4421F, 0.0301F, 0.1194F));

		PartDefinition cube_r21 = ForelimbL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 35).mirror().addBox(-2.3F, 0.0F, -0.4F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3756F, 5.8186F, -0.0116F, 0.0F, 0.2618F, -0.6545F));

		PartDefinition cube_r22 = ForelimbL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(104, 12).mirror().addBox(0.7F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8848F, 3.1401F, 1.1884F, 0.0F, 0.6109F, -0.6545F));

		PartDefinition cube_r23 = ForelimbL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(83, 81).mirror().addBox(-0.9F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(63, 23).mirror().addBox(-0.9F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.8391F, 2.3377F, -0.9919F, 0.0F, -0.2182F, -0.6545F));

		PartDefinition cube_r24 = ForelimbL2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7797F, 0.7574F, -0.6183F, 0.0F, -1.0036F, -0.6545F));

		PartDefinition cube_r25 = ForelimbL2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.4F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.8221F, 1.5573F, -0.1116F, 0.0F, -0.2618F, -0.6545F));

		PartDefinition cube_r26 = ForelimbL2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-1.025F, 0.2F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r27 = ForelimbL2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 19).mirror().addBox(-0.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5479F, 1.3469F, 0.503F, 0.0F, 0.8596F, -0.6545F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.826F, 4.7368F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-12.8435F, -2.0335F, -0.591F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4557F, 8.3054F, 0.0753F, 0.2271F, -1.3019F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-3.4612F, -0.4907F, -0.591F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4557F, 8.3054F, 0.1722F, 0.1666F, -0.8161F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(76, 91).mirror().addBox(-1.531F, 0.1725F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4557F, 8.3054F, 0.2276F, 0.0862F, -0.3836F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 91).mirror().addBox(-1.5415F, 0.2003F, -0.4666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0557F, 6.2054F, 0.2276F, 0.0862F, -0.3836F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 91).mirror().addBox(-3.4815F, -0.4698F, -0.4549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0557F, 6.2054F, 0.1722F, 0.1666F, -0.8161F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-11.8712F, -2.0243F, -0.4549F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0557F, 6.2054F, 0.0753F, 0.2271F, -1.3019F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 91).mirror().addBox(-1.567F, 0.2592F, -0.6146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8557F, 4.3054F, 0.2439F, 0.0927F, -0.3822F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 90).mirror().addBox(-3.5305F, -0.4274F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8557F, 4.3054F, 0.1843F, 0.1793F, -0.814F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-10.9343F, -2.0093F, -0.6026F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8557F, 4.3054F, 0.0801F, 0.2439F, -1.3008F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 33).mirror().addBox(-7.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.048F, 0.2882F, -1.3234F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.1777F, 0.233F, -0.8296F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.2607F, 0.1441F, -0.3944F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.2927F, 0.1121F, -0.3772F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(-9.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.0947F, 0.2943F, -1.2969F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.2211F, 0.2173F, -0.8067F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(36, 40).addBox(2.8435F, -2.0335F, -0.591F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4557F, 8.3054F, 0.0753F, -0.2271F, 1.3019F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 91).addBox(1.4612F, -0.4907F, -0.591F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4557F, 8.3054F, 0.1722F, -0.1666F, 0.8161F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 91).addBox(-0.469F, 0.1725F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4557F, 8.3054F, 0.2276F, -0.0862F, 0.3836F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 91).addBox(-0.4585F, 0.2003F, -0.4666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 6.2054F, 0.2276F, -0.0862F, 0.3836F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 91).addBox(1.4815F, -0.4698F, -0.4549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 6.2054F, 0.1722F, -0.1666F, 0.8161F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 51).addBox(2.8712F, -2.0243F, -0.4549F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 6.2054F, 0.0753F, -0.2271F, 1.3019F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(44, 91).addBox(-0.433F, 0.2592F, -0.6146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 4.3054F, 0.2439F, -0.0927F, 0.3822F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(83, 90).addBox(1.5305F, -0.4274F, -0.6026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 4.3054F, 0.1843F, -0.1793F, 0.814F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 44).addBox(2.9343F, -2.0093F, -0.6026F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 4.3054F, 0.0801F, -0.2439F, 1.3008F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 33).addBox(2.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.048F, -0.2882F, 1.3234F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(91, 24).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.1777F, -0.233F, 0.8296F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(91, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.2607F, -0.1441F, 0.3944F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(91, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.2927F, -0.1121F, 0.3772F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 29).addBox(2.9916F, -2.5101F, -0.4853F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.0947F, -0.2943F, 1.2969F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 91).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.2211F, -0.2173F, 0.8067F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(75, 104).addBox(-1.0F, -1.3712F, 0.0439F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8557F, 7.6054F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 74).addBox(-1.0F, -1.5606F, -0.0186F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5383F, 5.6815F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 104).addBox(-1.0F, -1.7253F, -0.0057F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1949F, 3.6957F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 77).addBox(-0.5F, 0.7F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 27).addBox(-4.5F, -1.9753F, -5.0074F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 11.0218F, 8.8373F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(19, 40).addBox(-1.5F, -0.0753F, -0.0056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 2.7054F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(104, 52).addBox(-1.0F, -1.6495F, 0.0355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 1.7054F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(104, 48).addBox(-1.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 77).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(89, 7).addBox(-0.3379F, -0.8035F, -0.8714F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3382F, 1.6487F, -0.0985F, -0.2111F, -0.9456F, -1.3214F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(65, 77).addBox(-0.3936F, -1.4556F, -2.5272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2397F, 2.4187F, 0.9063F, 0.9905F, 0.3611F, 1.0523F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(89, 4).addBox(0.1076F, -0.8941F, -0.7765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.4F, 2.0761F, -1.8384F, -2.6786F, -0.3042F, 2.5451F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(9, 85).addBox(-0.3924F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4F, 2.0761F, -1.8384F, -0.5834F, -0.4904F, -0.4109F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(11, 73).addBox(-0.3936F, -1.2659F, -2.2415F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.2397F, 2.4187F, 0.9063F, 1.3395F, 0.3611F, 1.0523F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 98).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 1.9867F, -0.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 98).addBox(5.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.106F, 0.9825F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(76, 35).addBox(5.5F, -1.0F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.579F, 1.1844F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(69, 29).addBox(5.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 1.0F, 1.2043F, 0.0F, 0.0F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.5F, 4.7181F, 1.5697F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(89, 7).mirror().addBox(-1.6621F, -0.8035F, -0.8714F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3382F, 1.6487F, -0.0985F, -0.2111F, 0.9456F, 1.3214F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(-0.6064F, -1.4556F, -2.5272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.4187F, 0.9063F, 0.9905F, -0.3611F, -1.0523F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-2.1076F, -0.8941F, -0.7765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.0761F, -1.8384F, -2.6786F, 0.3042F, -2.5451F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(9, 85).mirror().addBox(-2.6076F, -0.8941F, -0.0765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 2.0761F, -1.8384F, -0.5834F, 0.4904F, 0.4109F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(11, 73).mirror().addBox(-0.6064F, -1.2659F, -2.2415F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.2397F, 2.4187F, 0.9063F, 1.3395F, -0.3611F, -1.0523F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 98).mirror().addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.9867F, -0.0947F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(32, 98).mirror().addBox(-6.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.106F, 0.9825F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-6.5F, -1.0F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.579F, 1.1844F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-6.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 1.0F, 1.2043F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5909F, 9.6028F, 0.1226F, 0.0866F, 0.0107F));

		PartDefinition cube_r85 = Body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(100, 104).addBox(-1.0F, -1.55F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6014F, 5.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 94).addBox(-1.0F, -1.6618F, 0.0235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2418F, 3.8854F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(104, 78).addBox(-1.0F, -1.6301F, 0.1086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1626F, 1.8399F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(78, 104).addBox(-1.0F, -1.4F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 27).addBox(-5.5F, -2.0F, 0.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 13.4234F, 1.4649F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 20).addBox(-5.5F, -2.05F, 0.05F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 12.4234F, -2.46F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.1893F, 0.1753F, -0.8124F));

		PartDefinition cube_r92 = Body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.2466F, 0.087F, -0.3812F));

		PartDefinition cube_r93 = Body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(36, 44).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.0865F, 0.2426F, -1.2985F));

		PartDefinition cube_r94 = Body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.1554F, 0.1463F, -0.8184F));

		PartDefinition cube_r95 = Body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.204F, 0.0747F, -0.3852F));

		PartDefinition cube_r96 = Body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.07F, 0.2014F, -1.3027F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.0588F, 0.1682F, -1.3051F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(42, 35).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 0.3503F, 0.0496F, 0.1345F, -1.3065F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 0.3503F, 0.1062F, 0.0964F, -0.8248F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1533F, 0.3503F, 0.1385F, 0.05F, -0.3897F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(21, 92).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.13F, 0.122F, -0.8221F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(7, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.1708F, 0.0632F, -0.3878F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(92, 45).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.1893F, -0.1753F, 0.8124F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.2466F, -0.087F, 0.3812F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 44).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.0865F, -0.2426F, 1.2985F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 41).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.1554F, -0.1463F, 0.8184F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.204F, -0.0747F, 0.3852F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(42, 37).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.07F, -0.2014F, 1.3027F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(36, 42).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.0588F, -0.1682F, 1.3051F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(42, 35).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 0.3503F, 0.0496F, -0.1345F, 1.3065F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(92, 29).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 0.3503F, 0.1062F, -0.0964F, 0.8248F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1533F, 0.3503F, 0.1385F, -0.05F, 0.3897F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 92).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.13F, -0.122F, 0.8221F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.1708F, -0.0632F, 0.3878F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.0358F, 0.1741F, -0.0119F));

		PartDefinition cube_r115 = Body10.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(6, 105).addBox(-1.0F, -1.675F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Body10.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(3, 105).addBox(-1.0F, -1.675F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Body10.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -1.55F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Body10.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(103, 104).addBox(-1.0F, -1.575F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Body10.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Body10.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3043F, 0.309F, -0.8378F));

		PartDefinition cube_r121 = Body10.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(92, 78).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4049F, 0.1624F, -0.4145F));

		PartDefinition cube_r122 = Body10.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1235F, 0.4132F, -1.3396F));

		PartDefinition cube_r123 = Body10.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8034F, 4.2503F, 0.3025F, 0.299F, -0.8384F));

		PartDefinition cube_r124 = Body10.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8034F, 4.2503F, 0.3991F, 0.154F, -0.4154F));

		PartDefinition cube_r125 = Body10.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8034F, 4.2503F, 0.127F, 0.4036F, -1.3382F));

		PartDefinition cube_r126 = Body10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5034F, 2.2503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r127 = Body10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(36, 46).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1072F, 0.3363F, -1.293F));

		PartDefinition cube_r128 = Body10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.2523F, 0.2487F, -0.7996F));

		PartDefinition cube_r129 = Body10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(92, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3336F, 0.1281F, -0.3723F));

		PartDefinition cube_r130 = Body10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(92, 49).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5034F, 2.2503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r131 = Body10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5034F, 2.2503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition cube_r132 = Body10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(92, 80).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3043F, -0.309F, 0.8378F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(92, 78).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4049F, -0.1624F, 0.4145F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(52, 27).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1235F, -0.4132F, 1.3396F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(92, 76).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8034F, 4.2503F, 0.3025F, -0.299F, 0.8384F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8034F, 4.2503F, 0.3991F, -0.154F, 0.4154F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 49).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8034F, 4.2503F, 0.127F, -0.4036F, 1.3382F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(36, 48).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5034F, 2.2503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(36, 46).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1072F, -0.3363F, 1.293F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(92, 53).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.2523F, -0.2487F, 0.7996F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(92, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3336F, -0.1281F, 0.3723F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(92, 49).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5034F, 2.2503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -1.9F, 0.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 12.5219F, -1.3809F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(92, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5034F, 2.2503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5393F, 7.7656F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Body11.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(18, 105).addBox(-1.0F, -1.35F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Body11.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 105).addBox(-1.0F, -1.4F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Body11.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(12, 105).addBox(-1.0F, -1.525F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9031F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Body11.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(9, 105).addBox(-1.0F, -1.65F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Body11.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(35, 10).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Body11.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-5.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4568F, 0.5085F, -0.9875F));

		PartDefinition cube_r151 = Body11.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.6189F, 0.2882F, -0.5771F));

		PartDefinition cube_r152 = Body11.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(44, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8534F, 4.2503F, 0.3907F, 0.3887F, -0.8086F));

		PartDefinition cube_r153 = Body11.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8534F, 4.2503F, 0.5132F, 0.2023F, -0.3952F));

		PartDefinition cube_r154 = Body11.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-6.9916F, -2.5101F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8534F, 4.2503F, 0.1594F, 0.5223F, -1.3237F));

		PartDefinition cube_r155 = Body11.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-8.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.1616F, 0.5037F, -1.2707F));

		PartDefinition cube_r156 = Body11.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1443F, 0.4536F, -1.2787F));

		PartDefinition cube_r157 = Body11.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3424F, 0.3352F, -0.7736F));

		PartDefinition cube_r158 = Body11.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4491F, 0.1716F, -0.355F));

		PartDefinition cube_r159 = Body11.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 92).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.3825F, 0.3715F, -0.7597F));

		PartDefinition cube_r160 = Body11.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5534F, 2.2503F, 0.4991F, 0.1896F, -0.346F));

		PartDefinition cube_r161 = Body11.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(82, 27).addBox(1.8126F, -0.8451F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4568F, -0.5085F, 0.9875F));

		PartDefinition cube_r162 = Body11.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(51, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.6189F, -0.2882F, 0.5771F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 93).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8534F, 4.2503F, 0.3907F, -0.3887F, 0.8086F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8534F, 4.2503F, 0.5132F, -0.2023F, 0.3952F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(80, 10).addBox(2.9916F, -2.5101F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8534F, 4.2503F, 0.1594F, -0.5223F, 1.3237F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 31).addBox(2.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.1616F, -0.5037F, 1.2707F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 46).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1443F, -0.4536F, 1.2787F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(14, 93).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3424F, -0.3352F, 0.7736F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4491F, -0.1716F, 0.355F));

		PartDefinition cube_r170 = Body11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 11).addBox(-5.5F, -2.0F, 0.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 10.7708F, 3.0339F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Body11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 20).addBox(-5.5F, -2.0F, 0.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 11.1542F, -0.9477F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Body11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(83, 92).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.3825F, -0.3715F, 0.7597F));

		PartDefinition cube_r173 = Body11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 82).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5534F, 2.2503F, 0.4991F, -0.1896F, 0.346F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5F, -0.6364F, -0.059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-3.1483F, 0.3895F, 1.1425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, 0.4219F, 0.3996F, -0.9374F));

		PartDefinition cube_r176 = Body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(72, 93).mirror().addBox(-2.4898F, -0.1562F, -0.1399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, 0.4939F, 0.3028F, -0.729F));

		PartDefinition cube_r177 = Body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.5487F, 0.2517F, -0.72F));

		PartDefinition cube_r178 = Body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.2624F, 0.443F, -1.0295F));

		PartDefinition cube_r179 = Body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(58, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.4263F, 0.3004F, -0.5858F));

		PartDefinition cube_r180 = Body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 93).addBox(1.1483F, 0.3895F, 1.1425F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, 0.4219F, -0.3996F, 0.9374F));

		PartDefinition cube_r181 = Body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(72, 93).addBox(0.4898F, -0.1562F, -0.1399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, 0.4939F, -0.3028F, 0.729F));

		PartDefinition cube_r182 = Body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 17).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.5487F, -0.2517F, 0.72F));

		PartDefinition cube_r183 = Body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(31, 15).addBox(0.0F, -1.092F, 0.0613F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7093F, 5.7944F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(17, 95).addBox(0.0F, -1.6286F, -0.1149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(65, 93).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.2624F, -0.443F, 1.0295F));

		PartDefinition cube_r186 = Body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(58, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.4263F, -0.3004F, 0.5858F));

		PartDefinition cube_r187 = Body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(21, 105).addBox(-1.0F, -1.0898F, 2.1356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 33).addBox(-1.5F, -0.0648F, 0.1356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(31, 11).addBox(-1.0F, -1.3398F, 0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3804F, 0.0194F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 4.6638F, 2.6589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(37, 99).addBox(-0.7551F, 0.4655F, -2.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5198F, 1.0053F, -0.168F, 1.9607F, -0.3802F, 0.8935F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(99, 28).addBox(-0.7551F, -1.4399F, -2.8208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5198F, 1.0053F, -0.168F, 2.877F, -0.3802F, 0.8935F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(74, 82).addBox(-0.7551F, -0.5767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5198F, 1.0053F, -0.168F, 2.3534F, -0.3802F, 0.8935F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(78, 51).addBox(-0.7551F, -0.2767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5198F, 1.0053F, -0.168F, 2.4407F, -0.3802F, 0.8935F));

		PartDefinition cube_r193 = bone.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(15, 102).addBox(-0.4611F, -0.3019F, -0.8289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(99, 12).addBox(-0.4611F, -0.3019F, -0.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8834F, 0.7819F, -2.0624F, 1.041F, 0.371F, 1.0806F));

		PartDefinition cube_r194 = bone.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(5, 102).addBox(-0.4611F, -0.6089F, -0.9089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 99).addBox(-0.4611F, -0.6089F, -0.2089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.8834F, 0.7819F, -2.0624F, 0.596F, 0.371F, 1.0806F));

		PartDefinition cube_r195 = bone.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 102).addBox(-0.4611F, -0.1891F, -1.4347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 99).addBox(-0.4611F, -0.7891F, -1.4347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(78, 17).addBox(-0.4611F, -0.4391F, -0.2846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8834F, 0.7819F, -2.0624F, 0.8665F, 0.371F, 1.0806F));

		PartDefinition cube_r196 = bone.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(88, 61).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1345F, -0.0508F, 0.3399F, 1.499F, -0.0607F, -0.2118F));

		PartDefinition cube_r197 = bone.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(81, 98).addBox(-0.6F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1063F, -0.0607F, -0.2118F));

		PartDefinition bone3 = Body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 4.6638F, 2.6589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r198 = bone3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(37, 99).mirror().addBox(-0.2449F, 0.4655F, -2.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.0053F, -0.168F, 1.9607F, 0.3802F, -0.8935F));

		PartDefinition cube_r199 = bone3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 28).mirror().addBox(-0.2449F, -1.4399F, -2.8208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.0053F, -0.168F, 2.877F, 0.3802F, -0.8935F));

		PartDefinition cube_r200 = bone3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(-0.2449F, -0.5767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.0053F, -0.168F, 2.3534F, 0.3802F, -0.8935F));

		PartDefinition cube_r201 = bone3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.2449F, -0.2767F, -2.8277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5198F, 1.0053F, -0.168F, 2.4407F, 0.3802F, -0.8935F));

		PartDefinition cube_r202 = bone3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(-0.5389F, -0.3019F, -0.8289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(99, 12).mirror().addBox(-0.5389F, -0.3019F, -0.1289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8834F, 0.7819F, -2.0624F, 1.041F, -0.371F, -1.0806F));

		PartDefinition cube_r203 = bone3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.5389F, -0.6089F, -0.9089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 99).mirror().addBox(-0.5389F, -0.6089F, -0.2089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.8834F, 0.7819F, -2.0624F, 0.596F, -0.371F, -1.0806F));

		PartDefinition cube_r204 = bone3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.5389F, -0.1891F, -1.4347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 99).mirror().addBox(-0.5389F, -0.7891F, -1.4347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(78, 17).mirror().addBox(-0.5389F, -0.4391F, -0.2846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8834F, 0.7819F, -2.0624F, 0.8665F, -0.371F, -1.0806F));

		PartDefinition cube_r205 = bone3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.1345F, -0.0508F, 0.3399F, 1.499F, 0.0607F, 0.2118F));

		PartDefinition cube_r206 = bone3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(-0.4F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1063F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6574F, 5.0255F, 2.5304F, 0.3286F, -0.3315F, 0.4052F));

		PartDefinition cube_r207 = HindlimbL.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(23, 50).addBox(4.5F, 0.5F, -2.175F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 90).addBox(0.3F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r208 = HindlimbL.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(42, 102).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8512F, 2.0952F, 0.5147F, 0.0F, -0.3927F, 0.6109F));

		PartDefinition cube_r209 = HindlimbL.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(102, 37).addBox(1.525F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(37, 102).addBox(0.025F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4268F, 1.0978F, -0.0073F, 0.0F, 0.6109F, 0.6109F));

		PartDefinition cube_r210 = HindlimbL.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(20, 102).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4268F, 1.0978F, -0.0073F, 0.0F, -0.2618F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6574F, 5.0255F, 2.5304F, 0.3286F, 0.3315F, -0.4052F));

		PartDefinition cube_r211 = HindlimbL2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-11.5F, 0.5F, -2.175F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 90).mirror().addBox(-2.3F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r212 = HindlimbL2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 102).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.8512F, 2.0952F, 0.5147F, 0.0F, 0.3927F, -0.6109F));

		PartDefinition cube_r213 = HindlimbL2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(102, 37).mirror().addBox(-2.525F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(37, 102).mirror().addBox(-1.025F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4268F, 1.0978F, -0.0073F, 0.0F, -0.6109F, -0.6109F));

		PartDefinition cube_r214 = HindlimbL2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(20, 102).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4268F, 1.0978F, -0.0073F, 0.0F, 0.2618F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0617F, 6.7906F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r215 = Body5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(41, 105).addBox(-1.0F, -0.95F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 56).addBox(-1.0F, -0.925F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 65).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Body5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(105, 31).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Body5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(105, 24).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body12 = Body5.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r218 = Body12.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(41, 54).addBox(-1.0F, -1.125F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 105).addBox(-1.0F, -1.025F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 45).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Body12.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 105).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Body12.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(105, 59).addBox(0.0F, 0.0998F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0611F, 3.9796F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r221 = Body13.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(97, 102).addBox(-1.0F, -1.1F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 105).addBox(-1.0F, -1.075F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 65).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Body13.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(65, 105).addBox(0.0F, -0.4002F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Body13.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(105, 62).addBox(0.0F, -0.4002F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition cube_r224 = Body14.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(76, 95).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6018F, 3.4392F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Body14.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3455F, 0.9344F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r226 = Body14.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 65).addBox(0.0F, -0.7001F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7129F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Body14.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(69, 0).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r228 = Body15.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(105, 68).addBox(-1.0F, -0.75F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 105).addBox(-1.0F, -0.775F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 6).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0698F, 3.9994F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r229 = Body16.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 105).addBox(-1.0F, -0.675F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 71).addBox(-1.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 71).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, 4.0F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r230 = Body17.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(87, 105).addBox(-1.0F, -0.55F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 105).addBox(-1.0F, -0.65F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 71).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0797F, 3.977F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition cube_r231 = Body18.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 105).addBox(-1.0F, -0.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 105).addBox(-1.0F, -0.625F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 71).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body18.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0878F, 3.942F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r232 = Body6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 105).addBox(-1.0F, -1.3F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 105).addBox(-1.0F, -1.275F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 65).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0035F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Body9.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 105).addBox(-1.0F, -1.25F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 105).addBox(-1.0F, -1.275F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 65).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.4149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1791F, 4.003F, 0.1676F, 0.1658F, 0.0383F));

		PartDefinition cube_r234 = Body7.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 105).addBox(-1.0F, -0.7162F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Body7.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(56, 105).addBox(-1.0F, -0.8162F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Body7.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(15, 54).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0165F, 5.0478F, 0.2921F, 0.2932F, 0.0867F));

		PartDefinition cube_r237 = Body8.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.3951F, 7.4984F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r238 = Body8.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(78, 56).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.968F, 5.7351F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Body8.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(65, 82).addBox(-1.5F, -0.8112F, -0.3737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5692F, 1.0703F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Body8.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(54, 58).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5265F, 3.4141F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Body8.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(54, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4381F, 3.0859F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Body8.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(45, 87).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.2808F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Callawayia.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition cube_r243 = Head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(67, 53).addBox(-2.0F, -0.0257F, -1.6874F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -1.7926F, 0.6041F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(83, 47).addBox(-2.0F, -0.2507F, -1.6874F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9464F, -1.7926F, 0.6041F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(18, 80).addBox(-2.0F, -0.0257F, 0.0126F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9464F, -2.1774F, -2.3194F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(9, 80).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -2.1956F, -2.2896F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(27, 83).addBox(-1.0F, -0.0002F, -2.008F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -0.7803F, -6.9441F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 87).addBox(-1.0F, -0.0002F, -1.008F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.3751F, -6.1402F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(38, 77).addBox(-1.5F, 0.0002F, -0.9888F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.809F, -5.2582F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(29, 77).addBox(-1.5F, -0.0078F, -1.0004F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -2.084F, -4.2832F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(76, 29).addBox(-1.5F, -0.0181F, -1.0294F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -2.184F, -3.2582F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(39, 88).addBox(-0.5F, -2.825F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7133F, 1.0482F, 6.7349F, 0.1833F, 0.1047F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(83, 35).addBox(-1.0F, -2.0718F, 3.4025F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.65F, 2.5806F, 1.3496F, 0.5934F, 0.1047F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(46, 95).addBox(-1.0F, -0.3758F, 2.5569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 2.5806F, 1.3496F, 0.5061F, 0.1047F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(26, 94).addBox(-1.0F, -1.8716F, 2.0219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.65F, 2.5806F, 1.3496F, -0.0175F, 0.1047F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(87, 12).addBox(-1.0F, -2.0414F, 0.0231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 2.5806F, 1.3496F, -0.1047F, 0.1047F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(21, 94).addBox(-1.4901F, -2.0782F, 5.7506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0711F, 0.1959F, -0.0093F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(97, 84).addBox(-0.575F, -1.0F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 37).addBox(-0.575F, -1.0F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 16).addBox(-0.575F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 4).addBox(-0.575F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 0).addBox(-0.575F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 95).addBox(-0.575F, -1.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(89, 95).addBox(-0.575F, -1.0F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1077F, 1.9343F, -2.0556F, -0.0177F, 0.1437F, 0.0055F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(94, 12).addBox(-1.4609F, -1.0324F, 4.3139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0178F, 0.196F, 0.0045F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(98, 8).addBox(-1.0838F, -1.0322F, 3.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 98).addBox(-1.0838F, -1.0322F, 3.1696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 88).addBox(-1.0838F, -1.0322F, 2.5696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0176F, 0.1262F, 0.0058F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(22, 98).addBox(-0.8296F, -1.1157F, 1.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0698F, 0.0392F, 0.0018F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(30, 104).addBox(-0.8052F, -0.1976F, 1.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(104, 28).addBox(-0.8052F, 0.1024F, 1.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 65).addBox(-0.8052F, -0.1976F, 0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 62).addBox(-0.8052F, 0.1024F, 0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 59).addBox(-0.8052F, 0.1024F, 0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 34).addBox(-0.8052F, -0.1976F, 0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0087F, 0.0392F, -0.0009F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(100, 31).addBox(0.1825F, 0.1699F, -8.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 25).addBox(0.1825F, -0.1301F, -8.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, -0.0087F, 0.0872F, -0.0005F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 99).addBox(0.1821F, 0.2774F, -8.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 95).addBox(0.1821F, -0.0226F, -8.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(91, 99).addBox(0.1821F, 0.3024F, -9.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 99).addBox(0.1821F, 0.0024F, -9.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(67, 99).addBox(0.1821F, 0.2774F, -10.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 99).addBox(0.1821F, -0.0226F, -10.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(57, 99).addBox(0.1821F, 0.0024F, -9.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 56).addBox(0.1821F, 0.3024F, -9.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, -0.0175F, 0.0872F, -0.0012F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 79).addBox(-0.3543F, 0.1246F, -11.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 76).addBox(-0.3543F, 0.4246F, -11.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 53).addBox(-0.3543F, 0.3496F, -11.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(52, 99).addBox(-0.3543F, 0.3496F, -12.3521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 50).addBox(-0.3543F, 0.3496F, -12.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 47).addBox(-0.3543F, 0.3496F, -13.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(47, 99).addBox(-0.3543F, 0.3496F, -14.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 44).addBox(-0.3543F, 0.3496F, -14.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, -0.0305F, 0.0349F, 0.0002F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(62, 87).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1104F, 0.7865F, -0.8181F, -0.1485F, 0.1481F, 0.0008F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(87, 57).addBox(-1.5079F, -0.7793F, 5.715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, -0.0024F, 0.1457F, 0.0232F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 82).addBox(-1.7068F, 2.2646F, 5.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.5164F, 0.1875F, 0.0471F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(42, 99).addBox(-1.1532F, 2.2646F, 6.5967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.5102F, 0.1152F, 0.006F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(73, 22).addBox(-1.0F, -0.3297F, -0.9525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1544F, 4.8394F, -0.1309F, 0.1004F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(7, 94).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4222F, -2.6057F, 4.0914F, -0.0262F, 0.1004F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 86).addBox(-0.95F, -3.2519F, -2.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(20, 73).addBox(-0.975F, -3.7519F, -3.0604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.025F, -1.6544F, 4.8394F, 1.6057F, 0.1004F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(82, 102).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1901F, -1.8138F, 1.5385F, 0.1222F, 0.1004F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0989F, -1.3991F, 0.6331F, -1.1432F, 0.1004F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(95, 61).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0216F, -0.7631F, -0.1347F, -2.4522F, 0.1004F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(62, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0366F, 0.051F, -0.7125F, 2.522F, 0.1004F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(61, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0331F, 1.0504F, -0.6777F, 1.6057F, 0.1004F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(98, 22).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0459F, 1.6661F, 0.1063F, 0.9076F, 0.1004F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(97, 92).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1363F, 2.0966F, 1.0044F, -0.4451F, 0.1004F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4369F, 2.1228F, 3.9892F, -1.5795F, 0.1004F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(95, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5169F, 1.521F, 4.7838F, -2.4958F, 0.1004F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(88, 65).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5639F, 0.638F, 5.2509F, 2.6529F, 0.1004F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(56, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5648F, -0.3619F, 5.2596F, 1.5621F, 0.1004F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(57, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5355F, -1.3182F, 4.9687F, 0.2967F, 0.1004F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(52, 102).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4593F, -1.9677F, 4.2121F, -0.7069F, 0.1004F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(83, 85).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.259F, -1.9328F, 2.2225F, -1.5533F, 0.1004F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(57, 87).addBox(-0.4215F, 0.158F, -1.9182F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1207F, -2.8048F, 1.9316F, 0.4189F, 0.1004F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(52, 87).addBox(-0.4215F, -0.0403F, -0.9973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1402F, -2.5044F, 2.1247F, 0.2618F, 0.1004F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(87, 51).addBox(-0.3113F, -0.0176F, -0.9355F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1228F, -2.5908F, 3.0524F, 0.0698F, 0.1004F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(51, 95).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1445F, -0.713F, -1.3608F, 0.7425F, 0.0805F, 0.0379F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 29).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0298F, -1.8981F, 0.2408F, 0.6378F, 0.0805F, 0.0379F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(69, 12).addBox(-2.5388F, 1.0031F, 5.5774F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.3964F, 0.1334F, 0.09F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(72, 39).addBox(-0.9951F, -1.406F, -5.2124F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, 0.1005F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 5).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7954F, 1.3075F, -5.2376F, 0.0968F, 0.126F, 0.0122F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(24, 67).addBox(-1.5079F, 0.0446F, 3.7217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.2507F, 0.1457F, 0.0232F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(83, 76).addBox(-0.9327F, -0.8621F, -0.2386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.0347F, 0.0394F, -0.0009F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(67, 16).addBox(-1.1328F, -0.7178F, 2.3996F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.0693F, 0.1072F, -0.0258F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.625F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9999F, 2.0617F, -16.2922F, 0.0175F, 0.0349F, 0.0002F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(59, 46).addBox(-0.7171F, -0.2839F, -4.7262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.6299F, 1.3362F, -11.9228F, 0.0698F, 0.0349F, -0.0005F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(41, 58).addBox(-0.3543F, -0.3389F, -15.0741F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, 0.0044F, 0.0349F, 0.0002F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(59, 39).addBox(-0.8701F, -0.0772F, -4.7253F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.6299F, 1.3362F, -11.9228F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 1.6313F, -11.9596F, 0.0873F, 0.0348F, 0.003F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(36, 83).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7254F, 1.1075F, -9.3026F, 0.0873F, 0.0829F, 0.0015F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(79, 71).addBox(0.0479F, -0.5894F, -10.5471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6299F, 1.8362F, -1.5228F, 0.0175F, 0.0829F, 0.0015F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(79, 66).addBox(-0.9373F, -0.4927F, -0.1848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.0259F, 0.0392F, 0.0055F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(47, 102).addBox(-1.0F, -1.0164F, -0.8519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(99, 41).addBox(-1.0F, -1.0164F, -1.1519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.199F, -0.6136F, -0.1166F, 0.1678F, -0.0451F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(59, 53).addBox(-0.425F, -1.0F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3854F, 0.5684F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(79, 61).addBox(-0.8F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.525F, 0.9148F, -6.823F, 0.0524F, 0.0523F, 0.0027F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(13, 67).addBox(-1.1537F, -0.5866F, 2.4532F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3299F, 1.8362F, -9.3228F, 0.0088F, 0.1091F, 0.0015F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(18, 85).addBox(-0.5F, -0.675F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, 0.1309F, 0.0034F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(39, 88).mirror().addBox(-0.5F, -2.825F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7133F, 1.0482F, 6.7349F, 0.1833F, -0.1047F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(0.0F, -2.0718F, 3.4025F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.5806F, 1.3496F, 0.5934F, -0.1047F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(46, 95).mirror().addBox(0.0F, -0.3758F, 2.5569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.5806F, 1.3496F, 0.5061F, -0.1047F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(26, 94).mirror().addBox(0.0F, -1.8716F, 2.0219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.5806F, 1.3496F, -0.0175F, -0.1047F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 12).mirror().addBox(0.0F, -2.0414F, 0.0231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.5806F, 1.3496F, -0.1047F, -0.1047F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(21, 94).mirror().addBox(0.4901F, -2.0782F, 5.7506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0711F, -0.1959F, 0.0093F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 84).mirror().addBox(-0.425F, -1.0F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 37).mirror().addBox(-0.425F, -1.0F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 16).mirror().addBox(-0.425F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 4).mirror().addBox(-0.425F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-0.425F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 95).mirror().addBox(-0.425F, -1.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 95).mirror().addBox(-0.425F, -1.0F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1077F, 1.9343F, -2.0556F, -0.0177F, -0.1437F, -0.0055F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(0.4609F, -1.0324F, 4.3139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0178F, -0.196F, -0.0045F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(0.0838F, -1.0322F, 3.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 98).mirror().addBox(0.0838F, -1.0322F, 3.1696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 88).mirror().addBox(0.0838F, -1.0322F, 2.5696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0176F, -0.1262F, -0.0058F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(22, 98).mirror().addBox(-0.1704F, -1.1157F, 1.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0698F, -0.0392F, -0.0018F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(-0.1948F, -0.1976F, 1.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(104, 28).mirror().addBox(-0.1948F, 0.1024F, 1.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 65).mirror().addBox(-0.1948F, -0.1976F, 0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 62).mirror().addBox(-0.1948F, 0.1024F, 0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 59).mirror().addBox(-0.1948F, 0.1024F, 0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 34).mirror().addBox(-0.1948F, -0.1976F, 0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0087F, -0.0392F, 0.0009F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(100, 31).mirror().addBox(-1.1825F, 0.1699F, -8.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 25).mirror().addBox(-1.1825F, -0.1301F, -8.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, -0.0087F, -0.0872F, 0.0005F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-1.182F, 0.2774F, -8.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 95).mirror().addBox(-1.182F, -0.0226F, -8.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(-1.182F, 0.3024F, -9.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(86, 99).mirror().addBox(-1.182F, 0.0024F, -9.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(67, 99).mirror().addBox(-1.182F, 0.2774F, -10.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 99).mirror().addBox(-1.182F, -0.0226F, -10.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(57, 99).mirror().addBox(-1.182F, 0.0024F, -9.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 56).mirror().addBox(-1.182F, 0.3024F, -9.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, -0.0175F, -0.0872F, 0.0012F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.6457F, 0.1246F, -11.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 76).mirror().addBox(-0.6457F, 0.4246F, -11.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 53).mirror().addBox(-0.6457F, 0.3496F, -11.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(52, 99).mirror().addBox(-0.6457F, 0.3496F, -12.3521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 50).mirror().addBox(-0.6457F, 0.3496F, -12.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 47).mirror().addBox(-0.6457F, 0.3496F, -13.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(47, 99).mirror().addBox(-0.6457F, 0.3496F, -14.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(99, 44).mirror().addBox(-0.6457F, 0.3496F, -14.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, -0.0305F, -0.0349F, -0.0002F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(62, 87).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1104F, 0.7865F, -0.8181F, -0.1485F, -0.1481F, -0.0008F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(0.5079F, -0.7793F, 5.715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, -0.0024F, -0.1457F, -0.0232F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(0.7068F, 2.2646F, 5.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.5164F, -0.1875F, -0.0471F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(0.1532F, 2.2646F, 6.5967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.5102F, -0.1152F, -0.006F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(0.0F, -0.3297F, -0.9525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1544F, 4.8394F, -0.1309F, -0.1004F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(7, 94).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4222F, -2.6057F, 4.0914F, -0.0262F, -0.1004F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.05F, -3.2519F, -2.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(20, 73).mirror().addBox(-0.025F, -3.7519F, -3.0604F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -1.6544F, 4.8394F, 1.6057F, -0.1004F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 102).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1901F, -1.8138F, 1.5385F, 0.1222F, -0.1004F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 102).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0989F, -1.3991F, 0.6331F, -1.1432F, -0.1004F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0216F, -0.7631F, -0.1347F, -2.4522F, -0.1004F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(62, 102).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0366F, 0.051F, -0.7125F, 2.522F, -0.1004F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0331F, 1.0504F, -0.6777F, 1.6057F, -0.1004F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0459F, 1.6661F, 0.1063F, 0.9076F, -0.1004F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(97, 92).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1363F, 2.0966F, 1.0044F, -0.4451F, -0.1004F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4369F, 2.1228F, 3.9892F, -1.5795F, -0.1004F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(95, 73).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5169F, 1.521F, 4.7838F, -2.4958F, -0.1004F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 0.638F, 5.2509F, 2.6529F, -0.1004F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5648F, -0.3619F, 5.2596F, 1.5621F, -0.1004F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5355F, -1.3182F, 4.9687F, 0.2967F, -0.1004F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(52, 102).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4593F, -1.9677F, 4.2121F, -0.7069F, -0.1004F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 85).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.259F, -1.9328F, 2.2225F, -1.5533F, -0.1004F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(57, 87).mirror().addBox(-0.5785F, 0.158F, -1.9182F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1207F, -2.8048F, 1.9316F, 0.4189F, -0.1004F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(52, 87).mirror().addBox(-0.5785F, -0.0403F, -0.9973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1402F, -2.5044F, 2.1247F, 0.2618F, -0.1004F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-0.6887F, -0.0176F, -0.9355F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1228F, -2.5908F, 3.0524F, 0.0698F, -0.1004F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(51, 95).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1445F, -0.713F, -1.3608F, 0.7425F, -0.0805F, -0.0379F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0298F, -1.8981F, 0.2408F, 0.6378F, -0.0805F, -0.0379F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(0.5388F, 1.0031F, 5.5774F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.3964F, -0.1334F, -0.09F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.0049F, -1.406F, -5.2124F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, 0.1005F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7954F, 1.3075F, -5.2376F, 0.0968F, -0.126F, -0.0122F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(24, 67).mirror().addBox(0.5079F, 0.0446F, 3.7217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.2507F, -0.1457F, -0.0232F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.0673F, -0.8621F, -0.2386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.0347F, -0.0394F, 0.0009F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(0.1328F, -0.7178F, 2.3996F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.0693F, -0.1072F, 0.0258F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.625F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9999F, 2.0617F, -16.2922F, 0.0175F, -0.0349F, -0.0002F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-0.2829F, -0.2839F, -4.7262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.3362F, -11.9228F, 0.0698F, -0.0349F, 0.0005F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-0.6457F, -0.3389F, -15.0741F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, 0.0044F, -0.0349F, -0.0002F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(-0.1299F, -0.0772F, -4.7253F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.3362F, -11.9228F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(28, 54).mirror().addBox(-0.1299F, -0.3092F, -4.7374F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.3362F, -11.9228F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.6313F, -11.9596F, 0.0873F, -0.0348F, -0.003F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.7254F, 1.1075F, -9.3026F, 0.0873F, -0.0829F, -0.0015F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(79, 71).mirror().addBox(-1.0479F, -0.5894F, -10.5471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6299F, 1.8362F, -1.5228F, 0.0175F, -0.0829F, -0.0015F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-0.0627F, -0.4927F, -0.1848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.0259F, -0.0392F, -0.0055F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(47, 102).mirror().addBox(0.0F, -1.0164F, -0.8519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(99, 41).mirror().addBox(0.0F, -1.0164F, -1.1519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.199F, -0.6136F, -0.1166F, -0.1678F, 0.0451F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.575F, -1.0F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3854F, 0.5684F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-0.2F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.525F, 0.9148F, -6.823F, 0.0524F, -0.0523F, -0.0027F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(13, 67).mirror().addBox(0.1537F, -0.5866F, 2.4532F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.8362F, -9.3228F, 0.0088F, -0.1091F, -0.0015F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(-0.5F, -0.675F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2009F, -0.1309F, -0.0034F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 2.4445F, 0.8368F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-0.0866F, 0.3704F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 61).mirror().addBox(-0.0866F, 0.3704F, -3.9567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(103, 9).mirror().addBox(-0.0866F, 0.0204F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(13, 61).mirror().addBox(-0.0866F, 0.0204F, -3.9567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6183F, -0.0143F, -14.1765F, -0.0566F, -0.0477F, 0.0084F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(0.0F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(32, 88).mirror().addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.8901F, 2.4616F, -3.9705F, 0.0173F, -0.0349F, 0.0015F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(71, 95).mirror().addBox(-1.2375F, -0.6034F, 6.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(17, 98).mirror().addBox(-1.2375F, -0.6784F, 5.4357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(95, 69).mirror().addBox(-1.2375F, -0.7284F, 4.8357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(66, 95).mirror().addBox(-1.2375F, -0.7284F, 4.2357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(95, 65).mirror().addBox(-1.2375F, -0.7284F, 3.6357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(41, 95).mirror().addBox(-1.2375F, -0.7284F, 3.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(95, 33).mirror().addBox(-1.2375F, -0.7284F, 2.4357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(12, 95).mirror().addBox(-1.2375F, -0.7034F, 1.8357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 95).mirror().addBox(-1.2375F, -0.7034F, 1.2357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 94).mirror().addBox(-1.2375F, -0.7284F, 0.6357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(31, 94).mirror().addBox(-1.2375F, -0.7034F, 0.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(67, 59).mirror().addBox(-0.9898F, -0.0293F, 0.002F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.475F, 0.2051F, -14.1436F, -0.0663F, -0.1347F, 0.0125F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -0.475F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-0.6733F, 1.3573F, -9.4241F, -0.1623F, -0.1347F, 0.0125F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-0.9898F, -0.0293F, 0.077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.0474F, 0.4554F, -10.3121F, -0.1361F, -0.1347F, 0.0125F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-0.2934F, 0.232F, -2.3924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, -0.0742F, -0.0305F, 0.001F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(92, 102).mirror().addBox(-0.2934F, 1.3942F, -5.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(102, 91).mirror().addBox(-0.2934F, 1.3942F, -4.7762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, -0.3534F, -0.0305F, 0.001F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(27, 98).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(29, 73).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(27, 98).addBox(2.5F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(29, 73).addBox(2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.5F, 0.3997F, -1.753F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-0.5F, -2.5F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(90, 34).addBox(2.5F, -2.5F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5F, 1.0033F, 0.7024F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(102, 88).mirror().addBox(-0.2F, -0.275F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(100, 68).mirror().addBox(-0.2F, -0.275F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.7792F, 1.1274F, -0.3816F, 0.4329F, -0.0113F, 0.0515F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(87, 102).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(87, 102).addBox(2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.5F, -0.1786F, 1.6042F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(102, 85).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false)
				.texOffs(102, 85).addBox(2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-1.5F, 0.6601F, 2.1488F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-0.2934F, 0.0541F, -5.5463F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 82).mirror().addBox(-0.2934F, 0.2683F, -4.7758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, -0.0916F, -0.0305F, 0.001F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.0406F, -0.3137F, -5.5552F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, -0.0218F, 0.0175F, 0.0F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.2934F, -0.3137F, -5.5862F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, -0.0218F, -0.0305F, 0.001F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(47, 82).mirror().addBox(-0.1001F, -0.6783F, -2.8369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5301F, -5.9186F, -0.0705F, -0.1349F, 0.0095F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-0.5F, -0.6F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.9096F, 1.741F, -7.6585F, -0.1396F, -0.1353F, 0.0F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.1F, -0.6261F, -5.9854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 1.5301F, -0.2186F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.1509F, 2.416F, -5.8879F, -0.0349F, -0.1222F, 0.0F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.9898F, -0.0078F, 0.0976F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(0.475F, 0.2051F, -14.1436F, -0.1361F, -0.1347F, 0.0125F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.2934F, -0.6926F, -5.5906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 101).mirror().addBox(-0.2934F, -0.6926F, -4.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 98).mirror().addBox(-0.2934F, -0.6926F, -4.3905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(77, 101).mirror().addBox(-0.2934F, -0.6926F, -3.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 101).mirror().addBox(-0.2934F, -0.6926F, -3.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(32, 101).mirror().addBox(-0.2934F, -0.6926F, -2.5906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 101).mirror().addBox(-0.2934F, -0.6926F, -1.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 18).mirror().addBox(-0.2934F, -0.6926F, -1.3905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 15).mirror().addBox(-0.2934F, -0.6676F, -0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.0051F, -18.0436F, 0.0044F, -0.0305F, 0.001F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(-1.2603F, -0.4693F, -4.2618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(101, 0).mirror().addBox(-1.2603F, -0.4693F, -3.6618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 71).mirror().addBox(-1.2603F, -0.4443F, -3.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 94).mirror().addBox(-1.2603F, -0.4943F, -2.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 57).mirror().addBox(-1.2603F, -0.4943F, -1.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 61).mirror().addBox(-1.2603F, -0.4943F, -1.2618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(36, 94).mirror().addBox(-1.2603F, -0.4943F, -0.6618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.475F, 0.0051F, -13.9436F, -0.0478F, -0.0303F, 0.0074F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(7, 88).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0204F)).mirror(false)
				.texOffs(7, 88).addBox(2.508F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0204F)), PartPose.offsetAndRotation(-1.504F, 1.5193F, 1.6766F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(25, 104).mirror().addBox(-2.0F, -1.6208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false)
				.texOffs(25, 104).addBox(1.0F, -1.6208F, -0.6151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.0F, 0.4768F, 1.9267F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(76, 87).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(76, 87).addBox(2.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.5F, 0.6604F, 0.2296F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(54, 8).addBox(-0.7066F, 0.0541F, -5.5463F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 82).addBox(-0.7066F, 0.2683F, -4.7758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, -0.0916F, 0.0305F, -0.001F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(92, 102).addBox(-0.7066F, 1.3942F, -5.1762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(102, 91).addBox(-0.7066F, 1.3942F, -4.7762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, -0.3534F, 0.0305F, -0.001F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(83, 42).addBox(-0.7066F, 0.232F, -2.3924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, -0.0742F, 0.0305F, -0.001F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(54, 0).addBox(-0.9594F, -0.3137F, -5.5552F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, -0.0218F, -0.0175F, 0.0F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 53).addBox(-0.7066F, -0.3137F, -5.5862F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, -0.0218F, 0.0305F, -0.001F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(47, 82).addBox(-0.8999F, -0.6783F, -2.8369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.55F, 1.5301F, -5.9186F, -0.0705F, 0.1349F, -0.0095F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(82, 22).addBox(-0.5F, -0.6F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.9096F, 1.741F, -7.6585F, -0.1396F, 0.1353F, 0.0F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(103, 6).addBox(-1.0F, -1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(32, 88).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.8901F, 2.4616F, -3.9705F, 0.0173F, 0.0349F, -0.0015F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 81).addBox(-0.9F, -0.6261F, -5.9854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.25F, 1.5301F, -0.2186F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.1509F, 2.416F, -5.8879F, -0.0349F, 0.1222F, 0.0F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 68).addBox(-0.0102F, -0.0078F, 0.0976F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.475F, 0.2051F, -14.1436F, -0.1361F, 0.1347F, -0.0125F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(71, 95).addBox(0.2375F, -0.6034F, 6.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(17, 98).addBox(0.2375F, -0.6784F, 5.4357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(95, 69).addBox(0.2375F, -0.7284F, 4.8357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(66, 95).addBox(0.2375F, -0.7284F, 4.2357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(95, 65).addBox(0.2375F, -0.7284F, 3.6357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(41, 95).addBox(0.2375F, -0.7284F, 3.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(95, 33).addBox(0.2375F, -0.7284F, 2.4357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(12, 95).addBox(0.2375F, -0.7034F, 1.8357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 95).addBox(0.2375F, -0.7034F, 1.2357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 94).addBox(0.2375F, -0.7284F, 0.6357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(31, 94).addBox(0.2375F, -0.7034F, 0.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(67, 59).addBox(-0.0102F, -0.0293F, 0.002F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.475F, 0.2051F, -14.1436F, -0.0663F, 0.1347F, -0.0125F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(0, 102).addBox(-0.7066F, -0.6926F, -5.5906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 101).addBox(-0.7066F, -0.6926F, -4.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 98).addBox(-0.7066F, -0.6926F, -4.3905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(77, 101).addBox(-0.7066F, -0.6926F, -3.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 101).addBox(-0.7066F, -0.6926F, -3.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(32, 101).addBox(-0.7066F, -0.6926F, -2.5906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 101).addBox(-0.7066F, -0.6926F, -1.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 18).addBox(-0.7066F, -0.6926F, -1.3905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 15).addBox(-0.7066F, -0.6676F, -0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.325F, 0.0051F, -18.0436F, 0.0044F, 0.0305F, -0.001F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(101, 3).addBox(0.2603F, -0.4693F, -4.2618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 0).addBox(0.2603F, -0.4693F, -3.6618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 71).addBox(0.2603F, -0.4443F, -3.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 94).addBox(0.2603F, -0.4943F, -2.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 57).addBox(0.2603F, -0.4943F, -1.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 61).addBox(0.2603F, -0.4943F, -1.2618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(36, 94).addBox(0.2603F, -0.4943F, -0.6618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.475F, 0.0051F, -13.9436F, -0.0478F, 0.0303F, -0.0074F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -0.475F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(0.6733F, 1.3573F, -9.4241F, -0.1623F, 0.1347F, -0.0125F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(88, 69).addBox(-0.0102F, -0.0293F, 0.077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0474F, 0.4554F, -10.3121F, -0.1361F, 0.1347F, -0.0125F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(24, 61).addBox(-0.9134F, 0.3704F, -3.9567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F))
				.texOffs(103, 21).addBox(-0.9134F, 0.3704F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 9).addBox(-0.9134F, 0.0204F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(13, 61).addBox(-0.9134F, 0.0204F, -3.9567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6183F, -0.0143F, -14.1765F, -0.0566F, 0.0477F, -0.0084F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(102, 88).addBox(-0.8F, -0.275F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(100, 68).addBox(-0.8F, -0.275F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.7792F, 1.1274F, -0.3816F, 0.4329F, 0.0113F, -0.0515F));

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