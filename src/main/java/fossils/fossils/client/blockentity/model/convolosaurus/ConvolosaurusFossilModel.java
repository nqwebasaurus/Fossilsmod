package fossils.fossils.client.blockentity.model.convolosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConvolosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ConvolosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.Head = this.neck.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.3F, -4.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.4926F, -3.2694F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2F, 2.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 34).mirror().addBox(-0.4402F, 1.17F, 0.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1414F, 0.7818F, 0.2486F, 0.4455F, 0.0789F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-0.4402F, -0.3451F, -0.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1414F, 0.7818F, -1.2785F, 0.4455F, 0.0789F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(-0.5F, -1.7885F, -0.2797F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.0973F, -1.8178F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 12).mirror().addBox(-0.5F, -0.6885F, -0.1797F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.9973F, -3.6178F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.5F, -1.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 7).addBox(3.5F, -1.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.2544F, -0.5907F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 16).mirror().addBox(-0.5F, -1.002F, -0.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3005F, 1.9867F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1005F, 1.2867F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(-2.0F, 0.0166F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(20, 49).addBox(2.0F, 0.0166F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.7F, 1.4F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(-0.2F, 0.1465F, -1.5501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.5F, -0.4F, -0.4276F, 0.1745F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 29).mirror().addBox(-0.2F, -1.1181F, -2.104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.5F, -0.4F, 0.4363F, 0.1745F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 21).mirror().addBox(-1.0F, -0.2F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.5731F, 0.9722F, -0.192F, 0.0F, 0.1309F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 24).mirror().addBox(-0.4402F, 0.351F, 2.0913F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1414F, 0.7818F, -0.3448F, 0.4455F, 0.0789F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5485F, -0.864F, 1.876F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8188F, -0.528F, -0.3342F, 0.3009F, 0.0838F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 21).mirror().addBox(-0.4402F, -0.1136F, -0.3076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.1414F, 0.7818F, -0.5367F, 0.4455F, 0.0789F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 34).mirror().addBox(-0.4776F, -0.7305F, -0.4937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8188F, -0.528F, -0.2569F, 0.278F, 0.135F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 14).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1973F, -2.6178F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-0.2F, -0.3535F, -1.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.5F, -0.4F, -0.096F, 0.1745F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 35).mirror().addBox(-2.0F, 0.657F, -1.3849F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 35).addBox(2.0F, 0.657F, -1.3849F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 1.2F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 41).mirror().addBox(-2.0F, -0.1519F, -0.1761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 41).addBox(2.0F, -0.1519F, -0.1761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 16).addBox(-0.5F, -1.002F, -0.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, -0.3005F, 1.9867F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 49).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, -0.1005F, 1.2867F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 42).addBox(-0.8F, 0.1465F, -1.5501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(2.5F, -1.5F, -0.4F, -0.4276F, -0.1745F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 28).addBox(-0.8F, -0.3535F, -1.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -1.5F, -0.4F, -0.096F, -0.1745F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(49, 29).addBox(-0.8F, -1.1181F, -2.104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(49, 38).addBox(-0.8F, -1.1181F, -2.704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(2.5F, -1.5F, -0.4F, 0.4363F, -0.1745F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -1.7885F, -0.2797F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.0973F, -1.8178F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -0.6885F, -0.1797F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.0F, 1.9973F, -3.6178F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 14).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 1.1973F, -2.6178F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 34).addBox(-0.5224F, -0.7305F, -0.4937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0F, 2.8188F, -0.528F, -0.2569F, -0.278F, -0.135F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(47, 35).addBox(-0.5598F, -0.3451F, -0.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(2.1F, 1.1414F, 0.7818F, -1.2785F, -0.4455F, -0.0789F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 34).addBox(-0.5598F, 1.17F, 0.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(2.1F, 1.1414F, 0.7818F, 0.2486F, -0.4455F, -0.0789F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 21).addBox(-0.5598F, -0.1136F, -0.3076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1F, 1.1414F, 0.7818F, -0.5367F, -0.4455F, -0.0789F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 21).addBox(-0.4515F, -0.864F, 1.876F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.0F, 2.8188F, -0.528F, -0.3342F, -0.3009F, -0.0838F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5598F, 0.351F, 2.0913F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1F, 1.1414F, 0.7818F, -0.3448F, -0.4455F, -0.0789F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 21).addBox(-1.0F, -0.2F, -1.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.5731F, 0.9722F, -0.192F, 0.0F, -0.1309F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(11, 28).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -1.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 0.5F, -0.6F, -0.4391F, 0.0748F, 0.1578F));

		PartDefinition Femur_r1 = leftLeg.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(0, 0).addBox(1.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, -0.5954F, 0.5854F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = leftLeg.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(34, 47).addBox(-0.5F, 1.4289F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 36).addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3272F, -0.6209F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = leftLeg.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(5, 34).addBox(0.2F, -0.1466F, -0.2783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(0, 34).addBox(-0.9F, -0.1466F, -0.3783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9046F, 0.4854F, 1.5097F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8229F, 0.2046F, -0.393F, -0.0403F, 0.0167F));

		PartDefinition Metatarsals_r1 = leftLeg3.addOrReplaceChild("Metatarsals_r1", CubeListBuilder.create().texOffs(36, 0).addBox(1.5F, 10.0767F, 11.2776F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.5F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.5F, -1.9F, 0.5883F, -0.0968F, -0.0746F));

		PartDefinition Pes_r1 = leftLeg4.addOrReplaceChild("Pes_r1", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 0.5F, -0.6F, -0.0959F, -0.0096F, -0.1352F));

		PartDefinition Femur_r4 = rightLeg.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9F, -0.5954F, 0.5854F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = rightLeg.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.5F, 1.4289F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 36).mirror().addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3272F, -0.6209F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = rightLeg.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(5, 34).mirror().addBox(-1.2F, -0.1466F, -0.2783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(0, 34).mirror().addBox(-0.1F, -0.1466F, -0.3783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9046F, 0.4854F, 1.117F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8229F, 0.2046F, 0.3079F, 0.1248F, 0.0396F));

		PartDefinition Metatarsals_r2 = rightLeg3.addOrReplaceChild("Metatarsals_r2", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-3.5F, 10.0767F, 11.2776F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(2.5F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.5F, -1.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Pes_r2 = rightLeg4.addOrReplaceChild("Pes_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -1.4F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(3, 52).addBox(-0.5F, -0.4F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 39).addBox(-1.0F, 0.0F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -1.2F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 1).addBox(-0.5F, -1.2F, -2.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-1.0F, -0.5F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-3.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -4.4987F, 0.0045F, 0.253F, -1.6051F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(21, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -0.4987F, -0.1118F, -0.1132F, -0.7079F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -2.4987F, 0.0534F, 0.0296F, -0.7148F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-1.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -2.4987F, 0.0315F, 0.0524F, -1.2384F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 7).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -4.4987F, 0.1324F, 0.2163F, -1.0677F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0115F, -4.4987F, 0.2224F, 0.1217F, -0.5449F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(21, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -0.4987F, -0.1118F, 0.1132F, 0.7079F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(48, 0).addBox(0.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -2.4987F, 0.0315F, -0.0524F, 1.2384F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -2.4987F, 0.0534F, -0.0296F, 0.7148F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -4.4987F, 0.2224F, -0.1217F, 0.5449F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(41, 7).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -4.4987F, 0.1324F, -0.2163F, 1.0677F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 50).addBox(2.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0115F, -4.4987F, 0.0045F, -0.253F, 1.6051F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(6, 52).addBox(-0.5F, -0.9F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 52).addBox(-0.5F, -0.9F, -3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 30).addBox(-1.0F, -0.5F, -3.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.2F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(40, 34).mirror().addBox(-4.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, 0.0076F, 0.4101F, -1.5518F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.5F, -0.0123F, -0.2803F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.2418F, -1.2084F, -0.0022F, -0.4735F, 0.1259F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(21, 21).mirror().addBox(-0.5F, -0.0123F, 0.0197F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.2418F, -1.2084F, -0.1698F, -0.6967F, 0.1788F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 30).mirror().addBox(-0.8F, -1.0126F, -0.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 30).addBox(0.8F, -1.0126F, -0.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5F, -2.4F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(0.0F, -0.6143F, -1.9596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.946F, -3.1865F, 1.1524F, -0.5765F, -0.8865F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-0.5F, -0.967F, -0.9317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.2249F, -1.0243F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(38, 40).mirror().addBox(-0.5F, -0.3297F, -1.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.3751F, -0.6243F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-0.5F, -0.3775F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.3751F, -0.6243F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(28, 32).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.3972F, -1.8216F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5885F, -2.4987F, 0.5412F, 0.2782F, -0.5507F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5885F, -2.4987F, 0.3402F, 0.5069F, -1.063F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(29, 14).mirror().addBox(-4.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5885F, -2.4987F, 0.012F, 0.602F, -1.6718F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, 0.3634F, 0.1945F, -0.4703F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, 0.2203F, 0.3488F, -0.9908F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(29, 14).addBox(2.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5885F, -2.4987F, 0.012F, -0.602F, 1.6718F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(29, 0).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5885F, -2.4987F, 0.3402F, -0.5069F, 1.063F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(50, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5885F, -2.4987F, 0.5412F, -0.2782F, 0.5507F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(40, 34).addBox(2.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, 0.0076F, -0.4101F, 1.5518F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(18, 30).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, 0.2203F, -0.3488F, 0.9908F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, 0.3634F, -0.1945F, 0.4703F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 32).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 1.3972F, -1.8216F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 43).addBox(-0.5F, -0.3775F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 0.3751F, -0.6243F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(38, 40).addBox(-0.5F, -0.3297F, -1.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, 0.3751F, -0.6243F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, -0.967F, -0.9317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2249F, -1.0243F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -0.6143F, -1.9596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.946F, -3.1865F, 1.1524F, 0.5765F, 0.8865F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 21).addBox(-0.5F, -0.0123F, 0.0197F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 4.2418F, -1.2084F, -0.1698F, 0.6967F, -0.1788F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.0123F, -0.2803F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 4.2418F, -1.2084F, -0.0022F, 0.4735F, -0.1259F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 3.4011F, -2.2655F, 0.5061F, 0.2182F, 0.0F));

		PartDefinition Humerus_r1 = leftArm.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, 2.5F, 0.5512F, 0.3412F, 0.1906F));

		PartDefinition Radio_Ulna_r1 = leftArm2.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(29, 2).addBox(0.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 8).addBox(0.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r1 = leftArm3.addOrReplaceChild("Manus_r1", CubeListBuilder.create().texOffs(26, 37).addBox(-1.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, 0.1855F, 0.21F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 3.4011F, -2.2655F, 0.3391F, -0.2724F, 0.1028F));

		PartDefinition Humerus_r2 = rightArm.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(22, 6).mirror().addBox(-1.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, 2.5F, 0.9244F, -0.3059F, -0.3663F));

		PartDefinition Radio_Ulna_r2 = rightArm2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-1.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(29, 8).mirror().addBox(-1.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(-0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r2 = rightArm3.addOrReplaceChild("Manus_r2", CubeListBuilder.create().texOffs(26, 37).mirror().addBox(0.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, -0.1855F, -0.21F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -2.8F, -0.4125F, 0.2998F, 0.3466F));

		PartDefinition cube_r79 = neck3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(34, 32).addBox(-0.5F, -0.4F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1885F, -1.6987F, 0.4123F, 0.634F, -0.7336F));

		PartDefinition cube_r81 = neck3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-1.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1885F, -1.6987F, -0.0225F, 0.7401F, -1.4029F));

		PartDefinition cube_r82 = neck3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 11).addBox(0.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1885F, -1.6987F, -0.0225F, -0.7401F, 1.4029F));

		PartDefinition cube_r83 = neck3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1885F, -1.6987F, 0.4123F, -0.634F, 0.7336F));

		PartDefinition cube_r84 = neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 12).addBox(-1.0F, -0.4F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -3.0F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(10, 34).addBox(-0.5F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 27).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.5F, -1.1F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4115F, -0.4987F, 0.4388F, 0.7685F, -1.0287F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(15, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4115F, -0.4987F, 0.4388F, -0.7685F, 1.0287F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -1.6F, -0.1253F, 0.2665F, 0.3626F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(52, 22).addBox(0.0F, -0.9F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 3).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4885F, -0.4987F, 0.5195F, 0.9081F, -0.9204F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4885F, -0.4987F, 0.5195F, -0.9081F, 0.9204F));

		PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4172F, -1.0103F, 0.5018F, 0.142F, 0.1737F));

		PartDefinition Premaxillary_r1 = Head.addOrReplaceChild("Premaxillary_r1", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.6567F, -0.1948F, -0.6624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.1455F, -1.786F, 0.5228F, -0.218F, 0.0077F));

		PartDefinition Premaxillary_r2 = Head.addOrReplaceChild("Premaxillary_r2", CubeListBuilder.create().texOffs(10, 50).addBox(-0.3433F, -0.1948F, -0.6624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8F, -0.1455F, -1.786F, 0.5228F, 0.218F, -0.0077F));

		PartDefinition Premaxillary_r3 = Head.addOrReplaceChild("Premaxillary_r3", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.5717F, -0.1636F, -0.7558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0545F, -2.186F, 0.802F, -0.218F, 0.0077F));

		PartDefinition Premaxillary_r4 = Head.addOrReplaceChild("Premaxillary_r4", CubeListBuilder.create().texOffs(48, 5).addBox(-0.4283F, -0.1636F, -0.7558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.0545F, -2.186F, 0.802F, 0.218F, -0.0077F));

		PartDefinition Premaxillary_r5 = Head.addOrReplaceChild("Premaxillary_r5", CubeListBuilder.create().texOffs(48, 8).addBox(-0.5F, -0.0599F, -0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.5F, 1.9572F, -3.6886F, 1.4137F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r6 = Head.addOrReplaceChild("Premaxillary_r6", CubeListBuilder.create().texOffs(24, 46).addBox(-0.5F, -0.2516F, -0.7815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 1.2572F, -3.1886F, 1.0647F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r7 = Head.addOrReplaceChild("Premaxillary_r7", CubeListBuilder.create().texOffs(25, 49).addBox(-0.8F, -0.2253F, -0.5798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8F, -0.1455F, -1.786F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r8 = Head.addOrReplaceChild("Premaxillary_r8", CubeListBuilder.create().texOffs(47, 26).addBox(-0.8F, -0.2333F, -1.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8F, -0.1455F, -1.786F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r9 = Head.addOrReplaceChild("Premaxillary_r9", CubeListBuilder.create().texOffs(47, 15).addBox(-0.5F, -0.2054F, -0.7817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 0.7572F, -2.8886F, 0.925F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r10 = Head.addOrReplaceChild("Premaxillary_r10", CubeListBuilder.create().texOffs(29, 47).addBox(-0.5F, -0.1433F, -0.7778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.5F, 0.3572F, -2.5886F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r11 = Head.addOrReplaceChild("Premaxillary_r11", CubeListBuilder.create().texOffs(46, 32).addBox(-0.5F, -0.4683F, 0.8948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, 2.4572F, -4.2886F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Squamosal_r1 = Head.addOrReplaceChild("Squamosal_r1", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.1F, -0.1961F, 0.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 43).addBox(-0.3F, -0.1961F, 0.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 47).mirror().addBox(-1.0F, 0.0039F, -0.0523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(10, 47).addBox(-0.4F, 0.0039F, -0.0523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(0.7F, -0.6231F, -0.8791F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Squamosal_r2 = Head.addOrReplaceChild("Squamosal_r2", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 49).addBox(0.66F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, 1.1088F, -0.5057F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Squamosal_r3 = Head.addOrReplaceChild("Squamosal_r3", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-0.5F, -0.2443F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(47, 48).addBox(0.56F, -0.2443F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.03F, 0.1413F, -0.5676F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Squamosal_r4 = Head.addOrReplaceChild("Squamosal_r4", CubeListBuilder.create().texOffs(45, 40).mirror().addBox(-0.5F, -0.7556F, -0.534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 40).addBox(0.56F, -0.7556F, -0.534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.03F, 0.1413F, -0.5676F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Squamosal_r5 = Head.addOrReplaceChild("Squamosal_r5", CubeListBuilder.create().texOffs(14, 45).mirror().addBox(-0.4828F, -0.1566F, -0.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.2218F, -2.1077F, 0.5083F, -0.084F, -0.081F));

		PartDefinition Squamosal_r6 = Head.addOrReplaceChild("Squamosal_r6", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.4935F, -0.881F, -0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.9218F, -1.3077F, 1.0057F, -0.084F, -0.081F));

		PartDefinition Squamosal_r7 = Head.addOrReplaceChild("Squamosal_r7", CubeListBuilder.create().texOffs(48, 45).mirror().addBox(-0.4666F, -0.873F, -0.902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 0.9028F, -1.3086F, 0.0098F, -0.0483F, -0.021F));

		PartDefinition Squamosal_r8 = Head.addOrReplaceChild("Squamosal_r8", CubeListBuilder.create().texOffs(5, 46).mirror().addBox(-0.5812F, -0.2386F, -0.6637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 43).mirror().addBox(-0.6912F, -0.2386F, -0.6637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0112F, 0.1218F, -1.6077F, 0.7267F, -0.1145F, -0.0551F));

		PartDefinition Squamosal_r9 = Head.addOrReplaceChild("Squamosal_r9", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.37F, 1.6968F, -3.2018F, 1.3701F, 0.0F, 0.0F));

		PartDefinition Squamosal_r10 = Head.addOrReplaceChild("Squamosal_r10", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-0.75F, 1.9F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.17F, -1.3918F, -2.7139F, 0.0825F, -0.2201F, -0.1033F));

		PartDefinition Squamosal_r11 = Head.addOrReplaceChild("Squamosal_r11", CubeListBuilder.create().texOffs(14, 45).addBox(-0.5172F, -0.1566F, -0.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.8888F, 0.2218F, -2.1077F, 0.5083F, 0.084F, 0.081F));

		PartDefinition Squamosal_r12 = Head.addOrReplaceChild("Squamosal_r12", CubeListBuilder.create().texOffs(43, 46).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.63F, 1.6968F, -3.2018F, 1.3701F, 0.0F, 0.0F));

		PartDefinition Squamosal_r13 = Head.addOrReplaceChild("Squamosal_r13", CubeListBuilder.create().texOffs(15, 48).addBox(-0.25F, 1.9F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.83F, -1.3918F, -2.7139F, 0.0825F, 0.2201F, 0.1033F));

		PartDefinition Squamosal_r14 = Head.addOrReplaceChild("Squamosal_r14", CubeListBuilder.create().texOffs(48, 45).addBox(-0.5334F, -0.873F, -0.902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.9616F, 0.9028F, -1.3086F, 0.0098F, 0.0483F, 0.021F));

		PartDefinition Squamosal_r15 = Head.addOrReplaceChild("Squamosal_r15", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5065F, -0.881F, -0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.8888F, 0.9218F, -1.3077F, 1.0057F, 0.084F, 0.081F));

		PartDefinition Squamosal_r16 = Head.addOrReplaceChild("Squamosal_r16", CubeListBuilder.create().texOffs(10, 43).addBox(-0.3088F, -0.2386F, -0.6637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 46).addBox(-0.4188F, -0.2386F, -0.6637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9888F, 0.1218F, -1.6077F, 0.7267F, 0.1145F, 0.0551F));

		PartDefinition Squamosal_r17 = Head.addOrReplaceChild("Squamosal_r17", CubeListBuilder.create().texOffs(47, 2).mirror().addBox(-1.09F, -0.0857F, -0.0577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(47, 2).addBox(-0.31F, -0.0857F, -0.0577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.5231F, 0.0209F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Jugal_r1 = Head.addOrReplaceChild("Jugal_r1", CubeListBuilder.create().texOffs(19, 46).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(19, 46).addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.9805F, -1.4195F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Teeth_r1 = Head.addOrReplaceChild("Teeth_r1", CubeListBuilder.create().texOffs(31, 40).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2814F, 1.5136F, -2.197F, 0.4803F, -0.1875F, -0.0937F));

		PartDefinition Quadratojugal_r1 = Head.addOrReplaceChild("Quadratojugal_r1", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(-1.0F, -0.7929F, -1.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 18).addBox(-0.4F, -0.7929F, -1.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 1.3806F, 0.1304F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r2 = Head.addOrReplaceChild("Quadratojugal_r2", CubeListBuilder.create().texOffs(29, 44).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(29, 44).addBox(0.1F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 0.9259F, -0.6356F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Squamosal_r18 = Head.addOrReplaceChild("Squamosal_r18", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-1.0F, 0.0077F, -0.9711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.6231F, -0.8791F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Squamosal_r19 = Head.addOrReplaceChild("Squamosal_r19", CubeListBuilder.create().texOffs(39, 48).addBox(0.0F, 0.0077F, -0.9711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6231F, -0.8791F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r3 = Head.addOrReplaceChild("Quadratojugal_r3", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.99F, 1.4219F, -0.1055F, 0.096F, 0.0F, 0.0F));

		PartDefinition Teeth_r2 = Head.addOrReplaceChild("Teeth_r2", CubeListBuilder.create().texOffs(46, 21).addBox(-0.7F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6982F, 2.4712F, -4.0765F, 0.4712F, 0.0167F, 0.0055F));

		PartDefinition Teeth_r3 = Head.addOrReplaceChild("Teeth_r3", CubeListBuilder.create().texOffs(31, 40).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7186F, 1.5136F, -2.197F, 0.4803F, 0.1875F, 0.0937F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5415F, 1.1145F));

		PartDefinition AntiorbitalAirSinus_r1 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r1", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-0.4F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7396F, 0.6419F, -3.8468F, 0.7729F, -0.1724F, -0.0676F));

		PartDefinition AntiorbitalAirSinus_r2 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r2", CubeListBuilder.create().texOffs(36, 8).mirror().addBox(-0.1869F, -0.5193F, -1.7405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.198F, 0.6782F, -2.9222F, 0.4829F, -0.222F, -0.1027F));

		PartDefinition AntiorbitalAirSinus_r3 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r3", CubeListBuilder.create().texOffs(36, 26).addBox(-0.6F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2604F, 0.6419F, -3.8468F, 0.7729F, 0.1724F, 0.0676F));

		PartDefinition AntiorbitalAirSinus_r4 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r4", CubeListBuilder.create().texOffs(36, 8).addBox(-0.8131F, -0.5193F, -1.7405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.198F, 0.6782F, -2.9222F, 0.4829F, 0.222F, 0.1027F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5415F, 1.1145F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0147F, 0.5239F, -2.5201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Crest_r1 = BrowL.addOrReplaceChild("Crest_r1", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-0.4006F, -0.4643F, -0.5896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1778F, 0.0405F, 0.0618F, 0.8083F, -0.1621F, -0.3491F));

		PartDefinition Crest_r2 = BrowL.addOrReplaceChild("Crest_r2", CubeListBuilder.create().texOffs(41, 23).addBox(-0.5994F, -0.4643F, -0.5896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1483F, 0.0405F, 0.0618F, 0.8083F, 0.1621F, 0.3491F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3415F, -0.1855F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Predentary_r1 = Jaw.addOrReplaceChild("Predentary_r1", CubeListBuilder.create().texOffs(49, 42).addBox(-0.5F, -0.5F, -0.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(0.5F, 1.7552F, -2.3991F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Angular_r1 = Jaw.addOrReplaceChild("Angular_r1", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(-0.5F, -0.7788F, -0.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false)
				.texOffs(43, 9).addBox(0.5F, -0.7788F, -0.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.0F, 0.4991F, 0.3462F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Angular_r2 = Jaw.addOrReplaceChild("Angular_r2", CubeListBuilder.create().texOffs(34, 44).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(34, 44).addBox(0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.3991F, 0.0462F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Teeth_r4 = Jaw.addOrReplaceChild("Teeth_r4", CubeListBuilder.create().texOffs(7, 28).mirror().addBox(-0.7246F, -1.1442F, -1.9948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.3042F, 0.9136F, -0.3652F, 0.7359F, -0.1856F, -0.088F));

		PartDefinition Surangular_r1 = Jaw.addOrReplaceChild("Surangular_r1", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-0.8386F, -1.1058F, -1.4276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.3042F, 0.9136F, -0.3652F, 0.814F, -0.2393F, -0.1337F));

		PartDefinition Surangular_r2 = Jaw.addOrReplaceChild("Surangular_r2", CubeListBuilder.create().texOffs(39, 44).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 44).addBox(0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1396F, -0.6865F, -1.5097F, 0.0F, 0.0F));

		PartDefinition Surangular_r3 = Jaw.addOrReplaceChild("Surangular_r3", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(44, 43).addBox(0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 0.5484F, -0.505F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Teeth_r5 = Jaw.addOrReplaceChild("Teeth_r5", CubeListBuilder.create().texOffs(7, 28).addBox(-0.2754F, -1.1442F, -1.9948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.6958F, 0.9136F, -0.3652F, 0.7359F, 0.1856F, 0.088F));

		PartDefinition Surangular_r4 = Jaw.addOrReplaceChild("Surangular_r4", CubeListBuilder.create().texOffs(39, 19).addBox(-0.1614F, -1.1058F, -1.4276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6958F, 0.9136F, -0.3652F, 0.814F, 0.2393F, 0.1337F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, -0.4284F, 1.5189F));

		PartDefinition Dentary_r1 = JawslopeL.addOrReplaceChild("Dentary_r1", CubeListBuilder.create().texOffs(9, 7).mirror().addBox(-0.7692F, -0.8615F, -2.2704F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6958F, 1.342F, -1.8841F, 0.6364F, -0.201F, -0.1243F));

		PartDefinition Dentary_r2 = JawslopeL.addOrReplaceChild("Dentary_r2", CubeListBuilder.create().texOffs(9, 7).addBox(-0.2308F, -0.8615F, -2.2704F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3042F, 1.342F, -1.8841F, 0.6364F, 0.201F, 0.1243F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4284F, 1.5189F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -2.2284F, 2.2189F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(0, 28).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 12).addBox(0.0F, -1.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.3F, -0.3835F, -0.2028F, 0.0811F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0223F, -0.0849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(50, 51).addBox(0.0F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 52).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 51).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0964F, -0.1307F, -0.0069F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(14, 21).addBox(0.0F, 1.5833F, 3.7043F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 21).addBox(0.0F, 1.052F, 1.9133F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 6).addBox(0.0F, -0.4828F, -0.0777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4151F, -0.0045F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(39, 51).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 32).addBox(0.0F, -0.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 17).addBox(0.0F, -0.6F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, 0.2978F, 0.0834F, 0.0256F));

		PartDefinition cube_r94 = tail3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 7).addBox(0.0F, 3.3122F, 9.3564F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0F, 2.6528F, 7.4446F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 12).addBox(0.0F, 2.0916F, 5.5145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4151F, -4.9045F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.134F, 0.2163F, 0.0289F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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