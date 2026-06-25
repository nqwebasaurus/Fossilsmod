package fossils.fossils.client.blockentity.model.desmatochelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DesmatochelysFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart FrontFlipperEndR5;
	private final ModelPart Tail;
	private final ModelPart bone;
	private final ModelPart tail3;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart FrontFlipperEndR4;

	public DesmatochelysFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR5 = this.Hips.getChild("FrontFlipperR5");
		this.FrontFlipperMiddleR5 = this.FrontFlipperR5.getChild("FrontFlipperMiddleR5");
		this.FrontFlipperEndR5 = this.FrontFlipperMiddleR5.getChild("FrontFlipperEndR5");
		this.Tail = this.Hips.getChild("Tail");
		this.bone = this.Tail.getChild("bone");
		this.tail3 = this.Tail.getChild("tail3");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR4 = this.Chest.getChild("FrontFlipperR4");
		this.FrontFlipperMiddleR4 = this.FrontFlipperR4.getChild("FrontFlipperMiddleR4");
		this.FrontFlipperEndR4 = this.FrontFlipperMiddleR4.getChild("FrontFlipperEndR4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5612F, -8.1508F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 34).addBox(-1.0F, -1.0022F, -0.1149F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 21).addBox(-1.5F, -0.1142F, -0.1322F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4F, 3.7F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 12).mirror().addBox(-2.475F, -0.605F, 1.8241F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2779F, 1.7037F, -0.1491F, 0.0096F, -0.1568F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-3.0F, 0.0F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 21).mirror().addBox(-3.6F, 0.0F, -3.7F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8639F, -2.7092F, 7.082F, -0.1472F, -0.0254F, -0.3898F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(-0.9842F, -0.0424F, -1.4165F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 45).mirror().addBox(-1.5842F, -0.0424F, -1.4165F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2656F, -1.6285F, 4.7259F, -0.1364F, -0.0391F, -0.6345F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.677F, -0.932F, 2.9676F, -0.0327F, 0.5005F, -0.4551F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 102).mirror().addBox(-1.4211F, 0.0317F, -1.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4656F, -0.8285F, 4.7259F, -0.2092F, -0.8576F, -0.4283F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 84).mirror().addBox(-1.8437F, 0.0317F, -0.8775F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-7.4656F, -0.8285F, 4.7259F, -0.1664F, 0.6085F, -0.6832F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-0.1851F, 0.0317F, 0.4103F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4656F, -0.8285F, 4.7259F, -2.9492F, -0.7803F, 2.4179F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(1.6769F, 0.0317F, -0.6861F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4656F, -0.8285F, 4.7259F, -3.0004F, -0.2635F, 2.5171F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7387F, 0.3096F, 6.6159F, -0.1365F, 0.0474F, -0.594F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.4826F, 0.2096F, 7.0438F, -0.1427F, -0.2984F, -0.5453F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4826F, 0.2096F, 7.0438F, -0.2361F, 0.9509F, -0.7809F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 79).mirror().addBox(-0.3F, -0.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.9506F, 0.117F, 8.6318F, -0.3775F, -1.1932F, -0.2344F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 58).addBox(-5.6769F, 0.0317F, -0.6861F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.4656F, -0.8285F, 4.7259F, -3.0004F, 0.2635F, -2.5171F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 0).addBox(-1.8149F, 0.0317F, 0.4103F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4656F, -0.8285F, 4.7259F, -2.9492F, 0.7803F, -2.4179F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 102).addBox(0.4211F, 0.0317F, -1.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4656F, -0.8285F, 4.7259F, -0.2092F, 0.8576F, 0.4283F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.677F, -0.932F, 2.9676F, -0.0327F, -0.5005F, 0.4551F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 106).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.4826F, 0.2096F, 7.0438F, -0.2361F, -0.9509F, 0.7809F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 79).addBox(-0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(55, 92).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9506F, 0.117F, 8.6318F, -0.3775F, 1.1932F, 0.2344F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 92).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.4826F, 0.2096F, 7.0438F, -0.1427F, 0.2984F, 0.5453F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 85).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7387F, 0.3096F, 6.6159F, -0.1365F, -0.0474F, 0.594F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 84).addBox(-0.1563F, 0.0317F, -0.8775F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(7.4656F, -0.8285F, 4.7259F, -0.1664F, -0.6085F, 0.6832F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 45).addBox(0.5842F, -0.0424F, -1.4165F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F))
				.texOffs(38, 43).addBox(-0.0158F, -0.0424F, -1.4165F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2656F, -1.6285F, 4.7259F, -0.1364F, 0.0391F, 0.6345F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 21).addBox(0.6F, 0.0F, -3.7F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(0, 12).addBox(0.0F, 0.0F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8639F, -2.7092F, 7.082F, -0.1472F, 0.0254F, 0.3898F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 12).addBox(0.475F, -0.605F, 1.8241F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2779F, 1.7037F, -0.1491F, -0.0096F, 0.1568F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8908F, 2.4001F, 13.5401F, -0.0327F, -0.098F, 0.3324F));

		PartDefinition cube_r27 = FrontFlipperR3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(99, 63).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8741F, -0.1811F, -2.1631F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r28 = FrontFlipperR3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(88, 32).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3695F, -0.1811F, -2.0454F, 0.0F, -0.0785F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1563F, -0.2839F, -1.4716F, 0.1957F, -1.0294F, -0.4292F));

		PartDefinition cube_r29 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 47).addBox(-0.15F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.639F, 0.1028F, 3.9556F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r30 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 103).addBox(3.1F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 103).addBox(3.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 103).addBox(2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 80).addBox(-1.7F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3579F, 0.1028F, 2.3482F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r31 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 88).addBox(-1.65F, -0.5F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4522F, 0.1028F, 3.6285F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r32 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 41).addBox(0.6671F, 0.0072F, 1.5831F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.312F, 0.134F, 2.4246F, -0.0014F, -0.3666F, -0.0904F));

		PartDefinition cube_r33 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 29).addBox(0.0871F, 0.0072F, -1.6738F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.312F, 0.134F, 2.4246F, -0.0013F, 0.1133F, -0.091F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1027F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR5 = Hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8908F, 2.4001F, 13.5401F, -0.0327F, 0.098F, -0.3324F));

		PartDefinition cube_r34 = FrontFlipperR5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(100, 46).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8741F, -0.1811F, -2.1631F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r35 = FrontFlipperR5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 89).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.3695F, -0.1811F, -2.0454F, 0.0F, 0.0785F, 0.0F));

		PartDefinition FrontFlipperMiddleR5 = FrontFlipperR5.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1563F, -0.2839F, -1.4716F, 0.2278F, 1.0075F, 0.4173F));

		PartDefinition cube_r36 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(97, 29).addBox(-1.85F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.639F, 0.1028F, 3.9556F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r37 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(106, 21).addBox(-4.1F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 106).addBox(-4.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(106, 12).addBox(-3.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 0).addBox(-2.3F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3579F, 0.1028F, 2.3482F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r38 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(88, 29).addBox(-1.35F, -0.5F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4522F, 0.1028F, 3.6285F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r39 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 50).addBox(-4.6671F, 0.0072F, 1.5831F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.312F, 0.134F, 2.4246F, -0.0014F, 0.3666F, 0.0904F));

		PartDefinition cube_r40 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 40).addBox(-6.0871F, 0.0072F, -1.6738F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.312F, 0.134F, 2.4246F, -0.0013F, -0.1133F, 0.091F));

		PartDefinition FrontFlipperEndR5 = FrontFlipperMiddleR5.addOrReplaceChild("FrontFlipperEndR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1027F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(31, 102).addBox(-1.6751F, -0.8453F, 3.7412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 1.4835F, -1.1064F, -1.4733F));

		PartDefinition cube_r42 = Tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-2.9F, 1.5314F, 8.4121F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5752F, -8.7253F, 0.1004F, 0.0586F, -0.1458F));

		PartDefinition cube_r43 = Tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(-0.9381F, -1.1923F, -0.2847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0259F, 6.3288F, 0.6478F, 0.3317F, 0.3444F, 0.0294F));

		PartDefinition cube_r44 = Tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(97, 72).mirror().addBox(-1.4F, -0.2F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3972F, 4.5067F, 3.6256F, 0.3607F, -0.4532F, -0.1637F));

		PartDefinition cube_r45 = Tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.65F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2789F, 6.8958F, 0.0172F, 0.003F, -0.1745F));

		PartDefinition cube_r46 = Tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 6).mirror().addBox(-2.5F, 0.05F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 21).mirror().addBox(-3.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 83).mirror().addBox(-4.2F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(13, 61).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.685F, -0.7694F, 1.9398F, 0.0819F, 0.0826F, -0.4072F));

		PartDefinition cube_r47 = Tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-2.0F, 0.0F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6249F, -0.9576F, 4.9011F, 0.016F, 0.007F, -0.4101F));

		PartDefinition cube_r48 = Tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 84).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.4143F, 1.5597F, 0.3406F, 0.1609F, 1.0371F, -0.2751F));

		PartDefinition cube_r49 = Tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-1.0F, -0.5F, -0.725F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4561F, 1.0574F, 1.2513F, 0.0816F, -0.0044F, -0.4143F));

		PartDefinition cube_r50 = Tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 17).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6011F, -0.4521F, 6.5904F, -0.0062F, -0.2553F, -0.3242F));

		PartDefinition cube_r51 = Tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(27, 91).mirror().addBox(-0.3681F, -0.0438F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.9239F, 0.7386F, 1.5232F, 0.0284F, -0.7864F, -0.496F));

		PartDefinition cube_r52 = Tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0986F, 1.8342F, 2.5545F, 0.0253F, -0.6556F, -0.4913F));

		PartDefinition cube_r53 = Tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0073F, 0.1731F, 5.8044F, 0.0218F, 0.7486F, -0.3953F));

		PartDefinition cube_r54 = Tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-3.025F, -0.5F, -1.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3426F, -0.1057F, 5.2161F, 0.0351F, 1.0975F, -0.3789F));

		PartDefinition cube_r55 = Tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(70, 92).mirror().addBox(0.425F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6011F, -0.4521F, 6.5904F, -0.0119F, -1.0406F, -0.3155F));

		PartDefinition cube_r56 = Tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 68).mirror().addBox(2.6064F, -0.8453F, -0.0516F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.7263F, 6.6135F, 0.6597F, 0.7554F, 0.4887F));

		PartDefinition cube_r57 = Tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(77, 92).mirror().addBox(2.4316F, -0.8453F, -2.94F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(29, 79).mirror().addBox(2.708F, -0.8453F, -4.2722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.7263F, 6.6135F, 0.5224F, 0.4639F, 0.2521F));

		PartDefinition cube_r58 = Tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-0.5675F, -1.8695F, -4.8456F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6232F, 8.3513F, 1.67F, 0.3604F, 0.2457F, 0.0914F));

		PartDefinition cube_r59 = Tail.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(2.89F, -0.8453F, -0.7075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.7263F, 6.6135F, 0.577F, 0.6129F, 0.3582F));

		PartDefinition cube_r60 = Tail.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(75, 100).mirror().addBox(-0.4916F, -1.8695F, -0.8919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.6232F, 8.3513F, 1.67F, 0.3695F, 0.3272F, 0.1238F));

		PartDefinition cube_r61 = Tail.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 85).mirror().addBox(-1.2667F, -1.5993F, -0.9125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8668F, 9.8355F, -3.1977F, 0.3568F, 0.2048F, 0.0757F));

		PartDefinition cube_r62 = Tail.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-0.448F, -1.5993F, -2.0383F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.067F, 10.6653F, -5.4776F, 0.3495F, 0.0492F, 0.0179F));

		PartDefinition cube_r63 = Tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(61, 69).mirror().addBox(0.2426F, -2.0456F, -3.0376F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.8102F, 11.8096F, -7.2942F, 0.2619F, -0.0253F, -0.0242F));

		PartDefinition cube_r64 = Tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-1.1874F, -2.0456F, -5.8064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.8102F, 11.8096F, -7.2942F, 0.2973F, -0.4874F, -0.1599F));

		PartDefinition cube_r65 = Tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-3.319F, -2.0456F, -8.9101F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.8102F, 11.8096F, -7.2942F, 0.4065F, -0.8571F, -0.332F));

		PartDefinition cube_r66 = Tail.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(34, 91).mirror().addBox(1.8841F, -0.8453F, -5.3175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.7263F, 6.6135F, 0.4878F, 0.3111F, 0.161F));

		PartDefinition cube_r67 = Tail.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-0.5766F, -1.5993F, 0.1695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8668F, 9.8355F, -3.1977F, 0.4301F, 0.609F, 0.2567F));

		PartDefinition cube_r68 = Tail.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(-2.9618F, -1.5993F, -1.3966F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1493F, 9.2947F, -1.7118F, 1.8058F, 1.2114F, 1.8212F));

		PartDefinition cube_r69 = Tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(97, 32).mirror().addBox(-2.1822F, -2.0316F, -2.261F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8232F, 9.5439F, -1.0227F, 2.6052F, 0.4933F, -3.1402F));

		PartDefinition cube_r70 = Tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(1.3908F, -2.0242F, -1.2661F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(99, 6).mirror().addBox(2.3908F, -2.0242F, 1.2339F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(94, 78).mirror().addBox(4.3908F, -2.0242F, -1.2661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8232F, 9.5439F, -1.0227F, 2.6733F, -0.2935F, -2.6876F));

		PartDefinition cube_r71 = Tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-0.9012F, -1.69F, -0.3894F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-7.1719F, 9.9285F, -3.5297F, 2.3535F, -0.9532F, -2.3141F));

		PartDefinition cube_r72 = Tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-3.0375F, -1.5993F, 0.008F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.2009F, 10.191F, -4.1744F, 2.0898F, -1.1659F, -2.1269F));

		PartDefinition cube_r73 = Tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.6171F, -2.0316F, -2.107F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8232F, 9.5439F, -1.0227F, 2.6747F, -0.0074F, -2.862F));

		PartDefinition cube_r74 = Tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(100, 49).mirror().addBox(-0.3042F, -2.0242F, 2.2064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8232F, 9.5439F, -1.0227F, 2.5564F, -0.6728F, -2.4412F));

		PartDefinition cube_r75 = Tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.1619F, -2.1598F, 0.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 0.679F, -1.3408F, -0.2536F));

		PartDefinition cube_r76 = Tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(1.0572F, -2.1598F, 0.4843F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 2.7755F, -1.1592F, -2.3913F));

		PartDefinition cube_r77 = Tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-0.0217F, -2.1598F, 2.5742F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 1.2423F, -1.4189F, -0.8263F));

		PartDefinition cube_r78 = Tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(91, 92).mirror().addBox(1.1605F, -2.1598F, 2.0918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 2.808F, -1.1183F, -2.427F));

		PartDefinition cube_r79 = Tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-0.098F, -1.5916F, -0.5932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3314F, 12.3718F, -11.2422F, 0.4277F, -0.897F, -0.3597F));

		PartDefinition cube_r80 = Tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 85).mirror().addBox(-1.7338F, -1.5916F, -1.0201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1512F, 12.2962F, -11.037F, 1.5058F, -1.3084F, -1.5209F));

		PartDefinition cube_r81 = Tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-2.3353F, -1.5916F, -1.0025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1512F, 12.2962F, -11.037F, 1.9705F, -1.286F, -2.0029F));

		PartDefinition cube_r82 = Tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-2.3374F, -1.5917F, -0.22F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5135F, 12.579F, -12.134F, 2.877F, -0.1433F, -3.1204F));

		PartDefinition cube_r83 = Tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-1.2506F, -1.5917F, -1.4991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1483F, 12.4641F, -11.7942F, 2.8443F, 0.4874F, 2.9816F));

		PartDefinition cube_r84 = Tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-1.0084F, -1.5917F, -0.69F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1483F, 12.4641F, -11.7942F, 2.8792F, 0.0674F, 3.106F));

		PartDefinition cube_r85 = Tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(2.1173F, -2.1598F, 2.5055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 2.9187F, -0.866F, -2.5582F));

		PartDefinition cube_r86 = Tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(0.5528F, -2.1598F, 4.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 2.2829F, -1.3805F, -1.8795F));

		PartDefinition cube_r87 = Tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 48).mirror().addBox(0.4486F, -2.1598F, 3.7178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 0.8157F, -1.3729F, -0.3934F));

		PartDefinition cube_r88 = Tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-0.3231F, -2.1598F, 3.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0345F, 13.4689F, -12.7436F, 0.357F, -1.1486F, 0.0845F));

		PartDefinition cube_r89 = Tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(0.0378F, -1.5993F, 0.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4682F, 9.0017F, -0.9067F, 2.016F, 1.1821F, 2.0468F));

		PartDefinition cube_r90 = Tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-0.7634F, -1.5993F, -0.3115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4682F, 9.0017F, -0.9067F, 0.8803F, 1.1111F, 0.826F));

		PartDefinition cube_r91 = Tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(102, 35).mirror().addBox(-0.4652F, -1.5993F, -0.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2931F, 8.4807F, 0.5246F, 0.711F, 1.0191F, 0.6328F));

		PartDefinition cube_r92 = Tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.4741F, -1.5993F, -1.5283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8003F, 8.1088F, 1.5465F, 0.4586F, 0.6878F, 0.3037F));

		PartDefinition cube_r93 = Tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 94).mirror().addBox(-0.1353F, -1.5993F, -1.1855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2627F, 8.0175F, 1.7974F, 0.3753F, 0.3678F, 0.1407F));

		PartDefinition cube_r94 = Tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-0.4427F, -1.5544F, -0.3207F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-9.2837F, 6.977F, 0.8F, 2.5564F, -0.6728F, -2.4412F));

		PartDefinition cube_r95 = Tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(97, 69).mirror().addBox(-0.2105F, -1.5543F, -0.6207F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-9.4982F, 8.1278F, -1.6248F, 2.6834F, 0.2167F, -2.9385F));

		PartDefinition cube_r96 = Tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(99, 24).mirror().addBox(-0.7037F, -1.5543F, -1.1472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-9.4982F, 8.1278F, -1.6248F, 2.6053F, 0.5631F, -3.1401F));

		PartDefinition cube_r97 = Tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(99, 66).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2365F, 5.2982F, 1.2392F, 0.737F, -1.0973F, -0.7659F));

		PartDefinition cube_r98 = Tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4209F, 5.9304F, -0.5407F, 2.6216F, -0.906F, -2.8046F));

		PartDefinition cube_r99 = Tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(-0.4021F, -0.4836F, -0.3153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7517F, 5.1333F, 0.6403F, 0.5713F, 0.1448F, 1.1024F));

		PartDefinition cube_r100 = Tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.6515F, -0.4836F, -2.1639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7517F, 5.1333F, 0.6403F, 0.6193F, 0.3984F, 1.2798F));

		PartDefinition cube_r101 = Tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-0.1282F, -0.4836F, -2.2472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7517F, 5.1333F, 0.6403F, 0.5645F, -0.0024F, 1.0084F));

		PartDefinition cube_r102 = Tail.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-0.4461F, -0.4836F, -2.1874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7517F, 5.1333F, 0.6403F, 0.5858F, 0.2545F, 1.1754F));

		PartDefinition cube_r103 = Tail.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0733F, 1.3734F, 2.1108F, 0.0F, -1.5708F, -1.2654F));

		PartDefinition cube_r104 = Tail.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(34, 91).addBox(-2.8841F, -0.8453F, -5.3175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 0.4878F, -0.3111F, -0.161F));

		PartDefinition cube_r105 = Tail.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(75, 100).addBox(-0.5084F, -1.8695F, -0.8919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6232F, 8.3513F, 1.67F, 0.3695F, -0.3272F, -0.1238F));

		PartDefinition cube_r106 = Tail.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 70).addBox(2.319F, -2.0456F, -8.9101F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.8102F, 11.8096F, -7.2942F, 0.4065F, 0.8571F, 0.332F));

		PartDefinition cube_r107 = Tail.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(94, 59).addBox(-0.6769F, -2.1598F, 3.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 0.357F, 1.1486F, -0.0845F));

		PartDefinition cube_r108 = Tail.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(93, 48).addBox(-1.4486F, -2.1598F, 3.7178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 0.8157F, 1.3729F, 0.3934F));

		PartDefinition cube_r109 = Tail.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 106).addBox(-1.5528F, -2.1598F, 4.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 2.2829F, 1.3805F, 1.8795F));

		PartDefinition cube_r110 = Tail.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 93).addBox(-3.1173F, -2.1598F, 2.5055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 2.9187F, 0.866F, 2.5582F));

		PartDefinition cube_r111 = Tail.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(91, 92).addBox(-2.1605F, -2.1598F, 2.0918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 2.808F, 1.1183F, 2.427F));

		PartDefinition cube_r112 = Tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(65, 85).addBox(-1.9783F, -2.1598F, 2.5742F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 1.2423F, 1.4189F, 0.8263F));

		PartDefinition cube_r113 = Tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 61).addBox(-3.0572F, -2.1598F, 0.4843F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 2.7755F, 1.1592F, 2.3913F));

		PartDefinition cube_r114 = Tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(92, 84).addBox(-0.8381F, -2.1598F, 0.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0345F, 13.4689F, -12.7436F, 0.679F, 1.3408F, 0.2536F));

		PartDefinition cube_r115 = Tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(21, 99).addBox(-0.9916F, -1.5917F, -0.69F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1483F, 12.4641F, -11.7942F, 2.8792F, -0.0674F, -3.106F));

		PartDefinition cube_r116 = Tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(99, 12).addBox(-0.7494F, -1.5917F, -1.4991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1483F, 12.4641F, -11.7942F, 2.8443F, -0.4874F, -2.9816F));

		PartDefinition cube_r117 = Tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(99, 9).addBox(0.3374F, -1.5917F, -0.22F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5135F, 12.579F, -12.134F, 2.877F, 0.1433F, 3.1204F));

		PartDefinition cube_r118 = Tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 99).addBox(0.3353F, -1.5916F, -1.0025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.1512F, 12.2962F, -11.037F, 1.9705F, 1.286F, 2.0029F));

		PartDefinition cube_r119 = Tail.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 85).addBox(-0.2662F, -1.5916F, -1.0201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.1512F, 12.2962F, -11.037F, 1.5058F, 1.3084F, 1.5209F));

		PartDefinition cube_r120 = Tail.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(97, 17).addBox(-0.902F, -1.5916F, -0.5932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3314F, 12.3718F, -11.2422F, 0.4277F, 0.897F, 0.3597F));

		PartDefinition cube_r121 = Tail.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(81, 16).addBox(0.1874F, -2.0456F, -5.8064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.8102F, 11.8096F, -7.2942F, 0.2973F, 0.4874F, 0.1599F));

		PartDefinition cube_r122 = Tail.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 69).addBox(-1.2426F, -2.0456F, -3.0376F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.8102F, 11.8096F, -7.2942F, 0.2619F, 0.0253F, 0.0242F));

		PartDefinition cube_r123 = Tail.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(24, 69).addBox(-0.552F, -1.5993F, -2.0383F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.067F, 10.6653F, -5.4776F, 0.3495F, -0.0492F, -0.0179F));

		PartDefinition cube_r124 = Tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(89, 75).addBox(0.0376F, -1.5993F, 0.008F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.2009F, 10.191F, -4.1744F, 2.0898F, 1.1659F, 2.1269F));

		PartDefinition cube_r125 = Tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 3).addBox(-1.0988F, -1.69F, -0.3894F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(7.1719F, 9.9285F, -3.5297F, 2.3535F, 0.9532F, 2.3141F));

		PartDefinition cube_r126 = Tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3829F, -2.0316F, -2.107F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.8232F, 9.5439F, -1.0227F, 2.6747F, 0.0074F, 2.862F));

		PartDefinition cube_r127 = Tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(100, 49).addBox(-1.6958F, -2.0242F, 2.2064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.8232F, 9.5439F, -1.0227F, 2.5564F, 0.6728F, 2.4412F));

		PartDefinition cube_r128 = Tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(99, 24).addBox(-1.2963F, -1.5543F, -1.1472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(9.4982F, 8.1278F, -1.6248F, 2.6053F, -0.5631F, 3.1401F));

		PartDefinition cube_r129 = Tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 69).addBox(-1.7895F, -1.5543F, -0.6207F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.4982F, 8.1278F, -1.6248F, 2.6834F, -0.2167F, 2.9385F));

		PartDefinition cube_r130 = Tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(99, 6).addBox(-4.3908F, -2.0242F, 1.2339F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(94, 78).addBox(-5.3908F, -2.0242F, -1.2661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(0, 65).addBox(-4.3908F, -2.0242F, -1.2661F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.8232F, 9.5439F, -1.0227F, 2.6733F, 0.2935F, 2.6876F));

		PartDefinition cube_r131 = Tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(99, 21).addBox(-1.5573F, -1.5544F, -0.3207F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(9.2837F, 6.977F, 0.8F, 2.5564F, 0.6728F, 2.4412F));

		PartDefinition cube_r132 = Tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(97, 32).addBox(0.1822F, -2.0316F, -2.261F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8232F, 9.5439F, -1.0227F, 2.6052F, -0.4933F, 3.1402F));

		PartDefinition cube_r133 = Tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(62, 94).addBox(-0.8647F, -1.5993F, -1.1855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2627F, 8.0175F, 1.7974F, 0.3753F, -0.3678F, -0.1407F));

		PartDefinition cube_r134 = Tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5259F, -1.5993F, -1.5283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8003F, 8.1088F, 1.5465F, 0.4586F, -0.6878F, -0.3037F));

		PartDefinition cube_r135 = Tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(102, 35).addBox(-0.5348F, -1.5993F, -0.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2931F, 8.4807F, 0.5246F, 0.711F, -1.0191F, -0.6328F));

		PartDefinition cube_r136 = Tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(38, 79).addBox(-0.2366F, -1.5993F, -0.3115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4682F, 9.0017F, -0.9067F, 0.8803F, -1.1111F, -0.826F));

		PartDefinition cube_r137 = Tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(79, 35).addBox(-1.0378F, -1.5993F, 0.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4682F, 9.0017F, -0.9067F, 2.016F, -1.1821F, -2.0468F));

		PartDefinition cube_r138 = Tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 63).addBox(-0.0382F, -1.5993F, -1.3966F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.1493F, 9.2947F, -1.7118F, 1.8058F, -1.2114F, -1.8212F));

		PartDefinition cube_r139 = Tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 30).addBox(-0.4234F, -1.5993F, 0.1695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.8668F, 9.8355F, -3.1977F, 0.4301F, -0.609F, -0.2567F));

		PartDefinition cube_r140 = Tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(56, 85).addBox(-0.7333F, -1.5993F, -0.9125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.8668F, 9.8355F, -3.1977F, 0.3568F, -0.2048F, -0.0757F));

		PartDefinition cube_r141 = Tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 68).addBox(-0.4325F, -1.8695F, -4.8456F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.6232F, 8.3513F, 1.67F, 0.3604F, -0.2457F, -0.0914F));

		PartDefinition cube_r142 = Tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 92).addBox(-3.4316F, -0.8453F, -2.94F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(29, 79).addBox(-3.708F, -0.8453F, -4.2722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 0.5224F, -0.4639F, -0.2521F));

		PartDefinition cube_r143 = Tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(84, 92).addBox(-3.89F, -0.8453F, -0.7075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 0.577F, -0.6129F, -0.3582F));

		PartDefinition cube_r144 = Tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(39, 68).addBox(-3.6064F, -0.8453F, -0.0516F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 0.6597F, -0.7554F, -0.4887F));

		PartDefinition cube_r145 = Tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(30, 47).addBox(-5.7F, -0.8453F, -1.4587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 4.7263F, 6.6135F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0733F, 1.3734F, 2.1108F, 0.0F, 1.5708F, 1.2654F));

		PartDefinition cube_r147 = Tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(41, 91).addBox(-0.5F, 0.4F, -2.3889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4623F, 0.4734F, 2.1108F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r148 = Tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 72).addBox(-0.6F, -0.2F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3972F, 4.5067F, 3.6256F, 0.3607F, 0.4532F, 0.1637F));

		PartDefinition cube_r149 = Tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(103, 52).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4209F, 5.9304F, -0.5407F, 2.6216F, 0.906F, 2.8046F));

		PartDefinition cube_r150 = Tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(99, 66).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2365F, 5.2982F, 1.2392F, 0.737F, 1.0973F, 0.7659F));

		PartDefinition cube_r151 = Tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 103).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4392F, 5.1783F, 1.7912F, 0.3207F, 0.236F, 0.1639F));

		PartDefinition cube_r152 = Tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 95).addBox(-0.5539F, -0.4836F, -2.1874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7517F, 5.1333F, 0.6403F, 0.5858F, -0.2545F, -1.1754F));

		PartDefinition cube_r153 = Tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(80, 75).addBox(-0.8718F, -0.4836F, -2.2472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7517F, 5.1333F, 0.6403F, 0.5645F, 0.0024F, -1.0084F));

		PartDefinition cube_r154 = Tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(67, 80).addBox(-0.3485F, -0.4836F, -2.1639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7517F, 5.1333F, 0.6403F, 0.6193F, -0.3984F, -1.2798F));

		PartDefinition cube_r155 = Tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 80).addBox(-0.5979F, -0.4836F, -0.3153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7517F, 5.1333F, 0.6403F, 0.5713F, -0.1448F, -1.1024F));

		PartDefinition cube_r156 = Tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(83, 96).addBox(-0.0619F, -1.1923F, -0.2847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0259F, 6.3288F, 0.6478F, 0.3317F, -0.3444F, -0.0294F));

		PartDefinition cube_r157 = Tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7386F, 0.1386F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3243F, -0.0106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(70, 92).addBox(-1.425F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6011F, -0.4521F, 6.5904F, -0.0119F, 1.0406F, 0.3155F));

		PartDefinition cube_r159 = Tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(90, 17).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6011F, -0.4521F, 6.5904F, -0.0062F, 0.2553F, 0.3242F));

		PartDefinition cube_r160 = Tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(89, 56).addBox(0.025F, -0.5F, -1.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3426F, -0.1057F, 5.2161F, 0.0351F, -1.0975F, 0.3789F));

		PartDefinition cube_r161 = Tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(27, 88).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0073F, 0.1731F, 5.8044F, 0.0218F, -0.7486F, 0.3953F));

		PartDefinition cube_r162 = Tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(83, 25).addBox(0.0F, 0.0F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6249F, -0.9576F, 4.9011F, 0.016F, -0.007F, 0.4101F));

		PartDefinition cube_r163 = Tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 31).addBox(-0.35F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -1.2789F, 6.8958F, 0.0172F, -0.003F, 0.1745F));

		PartDefinition cube_r164 = Tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -0.049F, -0.3923F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1757F, 3.7894F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.1386F, -0.0614F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6757F, -0.1106F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(9, 84).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.4143F, 1.5597F, 0.3406F, 0.1609F, -1.0371F, 0.2751F));

		PartDefinition cube_r167 = Tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(92, 65).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0986F, 1.8342F, 2.5545F, 0.0253F, 0.6556F, 0.4913F));

		PartDefinition cube_r168 = Tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(27, 91).addBox(-0.6319F, -0.0438F, -0.1834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.9239F, 0.7386F, 1.5232F, 0.0284F, 0.7864F, 0.496F));

		PartDefinition cube_r169 = Tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 26).addBox(-2.0F, -0.5F, -0.725F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.4561F, 1.0574F, 1.2513F, 0.0816F, 0.0044F, 0.4143F));

		PartDefinition cube_r170 = Tail.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(47, 83).addBox(2.2F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(92, 21).addBox(2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 61).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(72, 6).addBox(0.5F, 0.05F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.685F, -0.7694F, 1.9398F, 0.0819F, -0.0826F, 0.4072F));

		PartDefinition cube_r171 = Tail.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(54, 57).addBox(0.9F, 1.5314F, 8.4121F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5752F, -8.7253F, 0.1004F, -0.0586F, 0.1458F));

		PartDefinition bone = Tail.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.4011F, -0.6327F, 5.6838F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, 0.6747F, 0.0275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3658F, 9.6224F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(35, 69).addBox(0.0F, 0.285F, 0.0948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3102F, 1.0327F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(28, 57).addBox(-1.0F, -0.0049F, -0.0549F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-2.425F, -0.5473F, -5.9972F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4567F, -1.9888F, -0.0517F, -0.0082F, -0.1569F));

		PartDefinition cube_r176 = Body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-2.4F, -0.4792F, -2.0149F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4567F, -1.9888F, -0.0866F, -0.0082F, -0.1569F));

		PartDefinition cube_r177 = Body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9808F, -0.8269F, -5.972F, -0.0487F, -0.0192F, -0.3748F));

		PartDefinition cube_r178 = Body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9455F, -0.5545F, -1.9818F, -0.0828F, -0.0267F, -0.3743F));

		PartDefinition cube_r179 = Body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-2.9716F, 0.3144F, -0.6075F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9832F, -0.46F, -7.5859F, -0.0465F, -0.0242F, -0.4794F));

		PartDefinition cube_r180 = Body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(18, 89).mirror().addBox(-2.2512F, 0.3144F, 2.0801F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-4.9832F, -0.46F, -7.5859F, -0.0484F, -0.2857F, -0.4669F));

		PartDefinition cube_r181 = Body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(-1.9621F, 0.1997F, -1.8383F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3852F, 0.1046F, -2.9912F, -0.0828F, -0.0267F, -0.5314F));

		PartDefinition cube_r182 = Body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-2.8916F, 0.1997F, -2.5365F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.3852F, 0.1046F, -2.9912F, -0.092F, 0.4515F, -0.5738F));

		PartDefinition cube_r183 = Body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-3.2589F, 0.1997F, 1.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-5.3852F, 0.1046F, -2.9912F, -0.1064F, -0.6785F, -0.4666F));

		PartDefinition cube_r184 = Body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(58, 98).mirror().addBox(0.0026F, 0.1997F, 1.6099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.3852F, 0.1046F, -2.9912F, -2.6556F, -1.3928F, 2.1285F));

		PartDefinition cube_r185 = Body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-0.6226F, -0.0047F, -0.3942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 41).mirror().addBox(-0.6226F, -0.0047F, 1.6058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4965F, 2.1422F, -3.3904F, -0.3543F, -1.3301F, -0.2585F));

		PartDefinition cube_r186 = Body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(9, 91).mirror().addBox(0.0454F, -0.0047F, 0.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.4965F, 2.1422F, -3.3904F, -1.9754F, -1.4807F, 1.3735F));

		PartDefinition cube_r187 = Body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(87, 52).mirror().addBox(0.1313F, 0.759F, -1.6605F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(106, 61).mirror().addBox(0.1313F, 0.759F, -2.1605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.243F, 0.8569F, -5.3063F, -0.0594F, 0.6731F, -0.5176F));

		PartDefinition cube_r188 = Body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-0.4651F, 0.759F, -2.6799F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-8.243F, 0.8569F, -5.3063F, -0.0478F, 0.2373F, -0.4918F));

		PartDefinition cube_r189 = Body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 9).mirror().addBox(-4.0F, 0.1F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4366F, 1.5923F, -7.394F, -0.0367F, -0.0736F, -0.6172F));

		PartDefinition cube_r190 = Body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(58, 98).addBox(-2.0026F, 0.1997F, 1.6099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.3852F, 0.1046F, -2.9912F, -2.6556F, 1.3928F, -2.1285F));

		PartDefinition cube_r191 = Body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 41).addBox(-0.3774F, -0.0047F, 1.6058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(90, 70).addBox(-0.3774F, -0.0047F, -0.3942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4965F, 2.1422F, -3.3904F, -0.3543F, 1.3301F, 0.2585F));

		PartDefinition cube_r192 = Body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(9, 91).addBox(-1.0454F, -0.0047F, 0.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.4965F, 2.1422F, -3.3904F, -1.9754F, 1.4807F, -1.3735F));

		PartDefinition cube_r193 = Body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(82, 46).addBox(1.2589F, 0.1997F, 1.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(5.3852F, 0.1046F, -2.9912F, -0.1064F, 0.6785F, 0.4666F));

		PartDefinition cube_r194 = Body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(45, 87).addBox(0.8916F, 0.1997F, -2.5365F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.3852F, 0.1046F, -2.9912F, -0.092F, -0.4515F, 0.5738F));

		PartDefinition cube_r195 = Body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(15, 47).addBox(-0.0379F, 0.1997F, -1.8383F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3852F, 0.1046F, -2.9912F, -0.0828F, 0.0267F, 0.5314F));

		PartDefinition cube_r196 = Body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(30, 51).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9455F, -0.5545F, -1.9818F, -0.0828F, 0.0267F, 0.3743F));

		PartDefinition cube_r197 = Body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(41, 57).addBox(0.4F, -0.4792F, -2.0149F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4567F, -1.9888F, -0.0866F, 0.0082F, 0.1569F));

		PartDefinition cube_r198 = Body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(18, 89).addBox(-0.7488F, 0.3144F, 2.0801F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(4.9832F, -0.46F, -7.5859F, -0.0484F, 0.2857F, 0.4669F));

		PartDefinition cube_r199 = Body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(23, 9).addBox(0.0F, 0.1F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4366F, 1.5923F, -7.394F, -0.0367F, 0.0736F, 0.6172F));

		PartDefinition cube_r200 = Body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(98, 75).addBox(-1.5349F, 0.759F, -2.6799F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.243F, 0.8569F, -5.3063F, -0.0478F, -0.2373F, 0.4918F));

		PartDefinition cube_r201 = Body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 61).addBox(-1.1313F, 0.759F, -2.1605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 52).addBox(-2.1313F, 0.759F, -1.6605F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(8.243F, 0.8569F, -5.3063F, -0.0594F, -0.6731F, 0.5176F));

		PartDefinition cube_r202 = Body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(39, 63).addBox(-0.0284F, 0.3144F, -0.6075F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9832F, -0.46F, -7.5859F, -0.0465F, 0.0242F, 0.4794F));

		PartDefinition cube_r203 = Body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(45, 51).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9808F, -0.8269F, -5.972F, -0.0487F, 0.0192F, 0.3748F));

		PartDefinition cube_r204 = Body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 24).addBox(0.425F, -0.5473F, -5.9972F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4567F, -1.9888F, -0.0517F, 0.0082F, 0.1569F));

		PartDefinition cube_r205 = Body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(59, 7).addBox(-1.0F, -0.2142F, -0.0603F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -7.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0367F, -8.0011F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(66, 41).addBox(-0.5F, -0.1F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-2.225F, -2.1826F, -9.7917F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4199F, 6.0124F, 0.2255F, 0.0177F, -0.1561F));

		PartDefinition cube_r208 = Chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(53, 75).mirror().addBox(-0.6948F, -0.5F, -2.7123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 6).mirror().addBox(-1.5688F, -0.5F, -1.212F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5776F, 5.0631F, -5.1377F, 1.1904F, -0.2077F, -0.7948F));

		PartDefinition cube_r209 = Chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-0.9F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.8322F, 4.6506F, -5.065F, 1.1411F, -0.0334F, -0.3914F));

		PartDefinition cube_r210 = Chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(57, 17).mirror().addBox(-0.7582F, -0.5F, -0.224F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5776F, 5.0631F, -5.1377F, 1.2586F, 0.3021F, 0.4261F));

		PartDefinition cube_r211 = Chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(21, 39).mirror().addBox(-0.9F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9425F, 1.4932F, -6.528F, 0.3919F, 0.058F, -0.1394F));

		PartDefinition cube_r212 = Chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9413F, -0.1817F, 16.699F, -2.9202F, -0.7902F, 2.8135F));

		PartDefinition cube_r213 = Chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-2.2678F, -0.5759F, -1.2214F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 2.65F, -9.2F, 0.4747F, -0.1149F, -0.3062F));

		PartDefinition cube_r214 = Chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-0.3842F, -1.2091F, 0.1544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3448F, 2.2836F, 25.2731F, 3.1112F, 0.0625F, 2.8646F));

		PartDefinition cube_r215 = Chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 11).mirror().addBox(-0.9302F, -1.7265F, -3.2447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.909F, 7.866F, -2.3114F, 0.0684F, 0.2378F, 0.2938F));

		PartDefinition cube_r216 = Chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0779F, 2.0444F, 24.9966F, 3.0726F, -1.1146F, 2.9285F));

		PartDefinition cube_r217 = Chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-2.0004F, -0.9187F, -0.9827F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.6745F, 2.958F, 24.1177F, -0.0039F, -0.7286F, -0.159F));

		PartDefinition cube_r218 = Chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(13, 67).mirror().addBox(-0.2609F, -0.9187F, -5.9834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6745F, 2.958F, 24.1177F, -0.0038F, 0.72F, -0.1641F));

		PartDefinition cube_r219 = Chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(90, 96).mirror().addBox(-0.1354F, -1.1056F, -2.1355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0069F, 0.5905F, -0.1578F));

		PartDefinition cube_r220 = Chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-0.6736F, -1.1642F, -7.0271F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0425F, 0.3341F, -0.1478F));

		PartDefinition cube_r221 = Chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-1.8836F, -1.1642F, -10.8034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0407F, 0.1597F, -0.1553F));

		PartDefinition cube_r222 = Chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-3.0026F, -1.1642F, -15.5473F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0402F, 0.0551F, -0.1595F));

		PartDefinition cube_r223 = Chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-5.1371F, -1.1642F, -17.9782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0403F, -0.0845F, -0.1652F));

		PartDefinition cube_r224 = Chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-8.1809F, -1.1642F, -19.813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0416F, -0.2588F, -0.1724F));

		PartDefinition cube_r225 = Chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-9.0374F, -1.1642F, -22.4373F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0421F, -0.3024F, -0.1743F));

		PartDefinition cube_r226 = Chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-14.5366F, -1.1642F, -22.3337F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5487F, 3.7664F, 19.8284F, 0.0475F, -0.564F, -0.1872F));

		PartDefinition cube_r227 = Chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-4.1651F, -0.8921F, 4.3045F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 2.65F, -9.2F, 0.4494F, -0.6631F, -0.6651F));

		PartDefinition cube_r228 = Chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-3.1347F, -0.8921F, 3.1039F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 2.65F, -9.2F, 0.5489F, -0.855F, -0.8088F));

		PartDefinition cube_r229 = Chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-2.2571F, -0.7376F, 1.8476F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 2.65F, -9.2F, 0.9656F, -0.9548F, -1.1947F));

		PartDefinition cube_r230 = Chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(55, 34).mirror().addBox(-0.575F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.4362F, 3.6994F, -7.4636F, 0.6015F, -0.921F, -0.8766F));

		PartDefinition cube_r231 = Chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(16, 92).mirror().addBox(-2.5081F, -0.7376F, -1.489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 2.65F, -9.2F, 0.4954F, 0.0297F, -0.311F));

		PartDefinition cube_r232 = Chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 30).mirror().addBox(-3.0F, 0.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(106, 24).mirror().addBox(-2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8989F, -0.4323F, -2.0295F, 0.2174F, 0.0629F, -0.3563F));

		PartDefinition cube_r233 = Chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.8936F, 0.2019F, -1.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9832F, -0.4233F, 0.4152F, 0.2127F, 0.0738F, -0.4607F));

		PartDefinition cube_r234 = Chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-2.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(70, 17).mirror().addBox(-2.5F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9074F, 0.5834F, -5.2826F, 0.3718F, 0.1396F, -0.3428F));

		PartDefinition cube_r235 = Chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(36, 88).mirror().addBox(-0.8F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-4.5923F, 2.3351F, -6.3928F, 0.3982F, 0.3825F, -0.2413F));

		PartDefinition cube_r236 = Chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 78).mirror().addBox(1.3F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5265F, 1.0896F, -1.8307F, 0.2323F, -0.3628F, -0.454F));

		PartDefinition cube_r237 = Chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5923F, 1.2936F, -3.9017F, 0.6415F, -0.9258F, -0.9351F));

		PartDefinition cube_r238 = Chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(-2.355F, 0.2019F, -1.6374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.9832F, -0.4233F, 0.4152F, 0.2321F, 0.4144F, -0.3817F));

		PartDefinition cube_r239 = Chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(27, 84).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5265F, 1.0896F, -1.8307F, 0.2522F, 0.5303F, -0.2406F));

		PartDefinition cube_r240 = Chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-2.0F, 0.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.8606F, 0.9942F, -3.2016F, 0.2138F, 0.0427F, -0.4681F));

		PartDefinition cube_r241 = Chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(54, 89).mirror().addBox(-3.0F, 0.0F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.6438F, 1.8957F, -3.1162F, 0.2066F, 0.07F, -0.5963F));

		PartDefinition cube_r242 = Chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(0.0F, -0.5F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0587F, 1.6529F, -4.2934F, 0.5073F, 0.737F, -0.0395F));

		PartDefinition cube_r243 = Chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(78, 53).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0933F, 1.7397F, -5.8562F, 1.5589F, 1.202F, 1.1049F));

		PartDefinition cube_r244 = Chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-0.6646F, -1.5816F, -1.1478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.4788F, -3.8408F, -0.0946F, 0.7395F, -0.0638F));

		PartDefinition cube_r245 = Chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(74, 11).addBox(-0.0698F, -1.7265F, -3.2447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.909F, 7.866F, -2.3114F, 0.0684F, -0.2378F, -0.2938F));

		PartDefinition cube_r246 = Chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 63).addBox(-0.5F, 0.1436F, -3.9738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(16, 92).addBox(1.5081F, -0.7376F, -1.489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.925F, 2.65F, -9.2F, 0.4954F, -0.0297F, 0.311F));

		PartDefinition cube_r248 = Chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(83, 21).addBox(0.2571F, -0.7376F, 1.8476F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.925F, 2.65F, -9.2F, 0.9656F, 0.9548F, 1.1947F));

		PartDefinition cube_r249 = Chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(83, 10).addBox(1.1347F, -0.8921F, 3.1039F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.925F, 2.65F, -9.2F, 0.5489F, 0.855F, 0.8088F));

		PartDefinition cube_r250 = Chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(55, 34).addBox(-0.425F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.4362F, 3.6994F, -7.4636F, 0.6015F, 0.921F, 0.8766F));

		PartDefinition cube_r251 = Chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(35, 74).addBox(3.1651F, -0.8921F, 4.3045F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.925F, 2.65F, -9.2F, 0.4494F, 0.6631F, 0.6651F));

		PartDefinition cube_r252 = Chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 62).addBox(13.5366F, -1.1642F, -22.3337F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0475F, 0.564F, 0.1872F));

		PartDefinition cube_r253 = Chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 76).addBox(8.0374F, -1.1642F, -22.4373F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0421F, 0.3024F, 0.1743F));

		PartDefinition cube_r254 = Chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 74).addBox(7.1809F, -1.1642F, -19.813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0416F, 0.2588F, 0.1724F));

		PartDefinition cube_r255 = Chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(71, 75).addBox(4.1371F, -1.1642F, -17.9782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0403F, 0.0845F, 0.1652F));

		PartDefinition cube_r256 = Chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(57, 0).addBox(2.0026F, -1.1642F, -15.5473F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0402F, -0.0551F, 0.1595F));

		PartDefinition cube_r257 = Chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(67, 56).addBox(0.8836F, -1.1642F, -10.8034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0407F, -0.1597F, 0.1553F));

		PartDefinition cube_r258 = Chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(15, 54).addBox(-0.3264F, -1.1642F, -7.0271F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0425F, -0.3341F, 0.1478F));

		PartDefinition cube_r259 = Chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(90, 96).addBox(-0.8646F, -1.1056F, -2.1355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.5487F, 3.7664F, 19.8284F, 0.0069F, -0.5905F, 0.1578F));

		PartDefinition cube_r260 = Chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(13, 67).addBox(-0.7391F, -0.9187F, -5.9834F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6745F, 2.958F, 24.1177F, -0.0038F, -0.72F, 0.1641F));

		PartDefinition cube_r261 = Chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 43).addBox(0.0004F, -0.9187F, -0.9827F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6745F, 2.958F, 24.1177F, -0.0039F, 0.7286F, 0.159F));

		PartDefinition cube_r262 = Chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(92, 8).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0779F, 2.0444F, 24.9966F, 3.0726F, 1.1146F, -2.9285F));

		PartDefinition cube_r263 = Chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(97, 88).addBox(-1.6158F, -1.2091F, 0.1544F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3448F, 2.2836F, 25.2731F, 3.1112F, -0.0625F, -2.8646F));

		PartDefinition cube_r264 = Chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(72, 22).addBox(-0.7322F, -0.5759F, -1.2214F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.925F, 2.65F, -9.2F, 0.4747F, 0.1149F, 0.3062F));

		PartDefinition cube_r265 = Chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(70, 100).addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9413F, -0.1817F, 16.699F, -2.9202F, 0.7902F, -2.8135F));

		PartDefinition cube_r266 = Chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(36, 88).addBox(-2.2F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(4.5923F, 2.3351F, -6.3928F, 0.3982F, -0.3825F, 0.2413F));

		PartDefinition cube_r267 = Chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(78, 53).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0933F, 1.7397F, -5.8562F, 1.5589F, -1.202F, -1.1049F));

		PartDefinition cube_r268 = Chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(92, 25).addBox(-1.0F, -0.5F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0587F, 1.6529F, -4.2934F, 0.5073F, -0.737F, 0.0395F));

		PartDefinition cube_r269 = Chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(70, 17).addBox(0.5F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(68, 36).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9074F, 0.5834F, -5.2826F, 0.3718F, -0.1396F, 0.3428F));

		PartDefinition cube_r270 = Chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5923F, 1.2936F, -3.9017F, 0.6415F, 0.9258F, 0.9351F));

		PartDefinition cube_r271 = Chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(21, 39).addBox(-1.1F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9425F, 1.4932F, -6.528F, 0.3919F, -0.058F, 0.1394F));

		PartDefinition cube_r272 = Chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(80, 100).addBox(-0.3354F, -1.5816F, -1.1478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 8.4788F, -3.8408F, -0.0946F, -0.7395F, 0.0638F));

		PartDefinition cube_r273 = Chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(53, 43).addBox(-4.574F, -1.6435F, 0.5035F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.074F, 8.4217F, -5.5449F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(83, 6).addBox(-0.4312F, -0.5F, -1.212F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(53, 75).addBox(-0.3052F, -0.5F, -2.7123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5776F, 5.0631F, -5.1377F, 1.1904F, 0.2077F, 0.7948F));

		PartDefinition cube_r275 = Chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(57, 17).addBox(-0.2418F, -0.5F, -0.224F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5776F, 5.0631F, -5.1377F, 1.2586F, -0.3021F, -0.4261F));

		PartDefinition cube_r276 = Chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(91, 44).addBox(-0.1F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.8322F, 4.6506F, -5.065F, 1.1411F, 0.0334F, 0.3914F));

		PartDefinition cube_r277 = Chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(19, 30).addBox(-1.0F, -0.2564F, -6.9738F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(101, 78).addBox(-2.3F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(49, 100).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5265F, 1.0896F, -1.8307F, 0.2323F, 0.3628F, 0.454F));

		PartDefinition cube_r279 = Chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(54, 89).addBox(0.0F, 0.0F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6438F, 1.8957F, -3.1162F, 0.2066F, -0.07F, 0.5963F));

		PartDefinition cube_r280 = Chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(98, 91).addBox(0.0F, 0.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.8606F, 0.9942F, -3.2016F, 0.2138F, -0.0427F, 0.4681F));

		PartDefinition cube_r281 = Chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(27, 84).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.5265F, 1.0896F, -1.8307F, 0.2522F, -0.5303F, 0.2406F));

		PartDefinition cube_r282 = Chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(59, 30).addBox(1.0F, 0.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(106, 24).addBox(1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 30).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8989F, -0.4323F, -2.0295F, 0.2174F, -0.0629F, 0.3563F));

		PartDefinition cube_r283 = Chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(98, 56).addBox(0.355F, 0.2019F, -1.6374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.9832F, -0.4233F, 0.4152F, 0.2321F, -0.4144F, 0.3817F));

		PartDefinition cube_r284 = Chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(101, 59).addBox(-0.1064F, 0.2019F, -1.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9832F, -0.4233F, 0.4152F, 0.2127F, -0.0738F, 0.4607F));

		PartDefinition cube_r285 = Chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(60, 50).addBox(0.225F, -2.1826F, -9.7917F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4199F, 6.0124F, 0.2255F, -0.0177F, 0.1561F));

		PartDefinition cube_r286 = Chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, -0.0247F, 0.0884F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -4.1F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0712F, 2.2485F, -6.9064F, 0.9525F, -0.0104F, 0.0027F));

		PartDefinition cube_r287 = Neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(23, 92).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0712F, -0.1174F, -1.5038F, 0.1978F, -0.0452F, -0.0475F));

		PartDefinition cube_r288 = Neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(62, 75).addBox(-1.4288F, -0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3169F, -2.4772F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Neck3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(61, 101).addBox(-0.9288F, -1.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 0).addBox(-1.4288F, -0.9F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0002F, 0.156F, -1.7867F, -0.2705F, 0.0042F, 0.002F));

		PartDefinition cube_r290 = Neck4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(106, 64).addBox(-0.929F, -1.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 104).addBox(-0.929F, -1.4F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(-1.429F, -0.9F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0818F, -3.5058F, 0.4352F, -0.017F, 0.1298F));

		PartDefinition cube_r291 = Head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 103).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.429F, 0.7114F, -8.7022F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(80, 103).addBox(-0.5F, 0.0F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, 0.9607F, -7.397F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(75, 103).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.429F, 0.2546F, -7.434F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(70, 103).addBox(-0.5F, -0.45F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, -0.4725F, -7.0716F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(95, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, -0.7993F, -6.5684F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.429F, -1.2298F, -5.6658F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(23, 95).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, -1.58F, -4.7291F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r298 = Head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 100).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, -1.1102F, -1.4698F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(95, 39).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.429F, -1.444F, -2.4124F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(37, 95).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, -1.6847F, -2.7319F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(88, 35).addBox(-0.429F, 0.5217F, -0.9195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -2.1492F, -3.8382F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4F, 2.0497F, -8.8515F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(96, 52).addBox(-1.0406F, -1.9954F, -0.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(104, 27).addBox(-1.0406F, -1.2954F, -0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, -0.8388F, 0.5882F, 0.0768F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(104, 18).addBox(-1.0406F, -0.4489F, -0.0297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, -0.3152F, 0.5882F, 0.0768F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(50, 106).addBox(-1.0406F, -0.1548F, 0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, 0.0338F, 0.5882F, 0.0768F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(51, 96).addBox(-0.5F, -0.4F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6495F, -0.5737F, 2.3024F, -0.1407F, 0.5882F, 0.0768F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(44, 96).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0493F, -0.6249F, 3.4713F, 0.4221F, 0.4028F, -0.0914F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(104, 88).addBox(-0.5F, 0.05F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(104, 72).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2192F, -0.8957F, 2.771F, -1.8032F, 0.4028F, -0.0914F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(73, 53).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0083F, -1.3385F, 3.3973F, -2.5886F, 0.4028F, -0.0914F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(34, 9).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0785F, -2.0681F, 3.7178F, 2.691F, 0.4028F, -0.0914F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(104, 97).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(104, 94).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3748F, -1.65F, 2.569F, 1.862F, 0.4028F, -0.0914F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(104, 69).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2055F, -2.5671F, 3.1608F, 2.4292F, 0.4028F, -0.0914F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(61, 104).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(56, 104).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6329F, -2.2327F, 2.0905F, 1.8183F, 0.4028F, -0.0914F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(104, 30).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6138F, -1.6724F, 2.0153F, 0.6402F, 0.4028F, -0.0914F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(11, 73).addBox(-2.0628F, 0.063F, -1.8989F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0136F, -3.4055F, 2.778F, 0.5093F, 0.4028F, -0.0914F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(63, 89).addBox(-1.025F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5237F, -1.9789F, 4.0309F, 0.3198F, 0.1882F, -0.1553F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(99, 85).addBox(-0.7494F, 4.1144F, 1.2052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, 1.6189F, 0.2044F, -0.206F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(99, 82).addBox(-0.7494F, 5.0133F, 1.4262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, 1.5753F, 0.2044F, -0.206F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(104, 15).addBox(0.2506F, 4.2772F, -4.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3878F, -0.9611F, 0.1798F, 2.5788F, 0.2044F, -0.206F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 104).addBox(-0.4717F, 0.513F, 0.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 103).addBox(-0.4717F, 0.513F, -0.9328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2853F, -1.9382F, 6.3133F, 2.8006F, 0.1696F, -0.1007F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(14, 96).addBox(-0.4717F, -0.8557F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(85, 100).addBox(-0.4717F, -1.2557F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2853F, -1.8382F, 6.5133F, -2.4267F, 0.1696F, -0.1007F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(72, 69).addBox(-0.518F, -1.3441F, -2.1701F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2853F, -1.8382F, 6.5133F, 0.9597F, 0.1772F, -0.1295F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(73, 47).addBox(-0.575F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1047F, -1.8363F, 4.6805F, 1.6303F, 0.1555F, -0.149F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(29, 75).addBox(-0.518F, 0.1539F, -0.7074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2853F, -1.8382F, 6.5133F, -0.0002F, 0.1772F, -0.1295F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2579F, 2.0497F, -8.8515F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(0.0406F, -1.9954F, -0.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(104, 27).mirror().addBox(0.0406F, -1.2954F, -0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, -0.8388F, -0.5882F, -0.0768F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(0.0406F, -0.4489F, -0.0297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, -0.3152F, -0.5882F, -0.0768F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(0.0406F, -0.1548F, 0.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, 0.0338F, -0.5882F, -0.0768F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-0.5F, -0.4F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6495F, -0.5737F, 2.3024F, -0.1407F, -0.5882F, -0.0768F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(44, 96).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0493F, -0.6249F, 3.4713F, 0.4221F, -0.4028F, 0.0914F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(104, 88).mirror().addBox(-0.5F, 0.05F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(104, 72).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2192F, -0.8957F, 2.771F, -1.8032F, -0.4028F, 0.0914F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.0083F, -1.3385F, 3.3973F, -2.5886F, -0.4028F, 0.0914F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0785F, -2.0681F, 3.7178F, 2.691F, -0.4028F, 0.0914F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(104, 97).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(104, 94).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3748F, -1.65F, 2.569F, 1.862F, -0.4028F, 0.0914F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(104, 69).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2055F, -2.5671F, 3.1608F, 2.4292F, -0.4028F, 0.0914F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(61, 104).mirror().addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(56, 104).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6329F, -2.2327F, 2.0905F, 1.8183F, -0.4028F, 0.0914F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(104, 30).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.6138F, -1.6724F, 2.0153F, 0.6402F, -0.4028F, 0.0914F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.0628F, 0.063F, -1.8989F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0136F, -3.4055F, 2.778F, 0.5093F, -0.4028F, 0.0914F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.975F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5237F, -1.9789F, 4.0309F, 0.3198F, -0.1882F, 0.1553F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(99, 85).mirror().addBox(-1.2506F, 4.1144F, 1.2052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, 1.6189F, -0.2044F, 0.206F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(99, 82).mirror().addBox(-1.2506F, 5.0133F, 1.4262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, 1.5753F, -0.2044F, 0.206F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(104, 15).mirror().addBox(-1.2506F, 4.2772F, -4.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3878F, -0.9611F, 0.1798F, 2.5788F, -0.2044F, 0.206F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5283F, 0.513F, 0.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 103).mirror().addBox(-0.5283F, 0.513F, -0.9328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, -1.9382F, 6.3133F, 2.8006F, -0.1696F, 0.1007F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(14, 96).mirror().addBox(-0.5283F, -0.8557F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(85, 100).mirror().addBox(-0.5283F, -1.2557F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, -1.8382F, 6.5133F, -2.4267F, -0.1696F, 0.1007F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-0.482F, -1.3441F, -2.1701F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, -1.8382F, 6.5133F, 0.9597F, -0.1772F, 0.1295F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.425F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1047F, -1.8363F, 4.6805F, 1.6303F, -0.1555F, 0.149F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-0.482F, 0.1539F, -0.7074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, -1.8382F, 6.5133F, -0.0002F, -0.1772F, 0.1295F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.8418F, -2.9379F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-0.5997F, -0.1974F, -1.8069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, -0.6023F, -0.2339F, -0.0179F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.5997F, -0.1986F, -0.7859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, 0.6063F, -0.2339F, -0.0179F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-0.5997F, -0.7524F, -1.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, 1.3481F, -0.2339F, -0.0179F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(106, 58).mirror().addBox(-0.5997F, -1.1986F, -0.0971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, 2.4389F, -0.2339F, -0.0179F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(69, 96).mirror().addBox(-0.5997F, -0.9279F, 0.5936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, 2.884F, -0.2339F, -0.0179F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(20, 105).mirror().addBox(-0.5997F, 0.1063F, 1.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(25, 105).mirror().addBox(-0.5997F, 0.1063F, 1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(30, 105).mirror().addBox(-0.5997F, -0.2937F, 1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.1708F, 0.1636F, 0.5389F, -3.1374F, -0.2339F, -0.0179F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(81, 70).mirror().addBox(-0.213F, -0.1964F, -0.1761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, 0.2636F, -1.9611F, 2.8883F, -0.452F, 0.0156F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(-0.213F, 0.2045F, -0.2372F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, 0.2636F, -1.9611F, 2.9755F, -0.452F, 0.0156F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(35, 105).mirror().addBox(-0.213F, 1.5753F, 1.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(105, 41).mirror().addBox(-0.213F, 1.9753F, 1.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, 0.2636F, -1.9611F, -2.6532F, -0.452F, 0.0156F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(105, 55).mirror().addBox(-0.213F, 2.2715F, -0.4072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, 0.2636F, -1.9611F, -2.1383F, -0.452F, 0.0156F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(76, 96).mirror().addBox(-0.213F, 0.0792F, 0.6371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.9708F, 0.2636F, -1.9611F, 2.8446F, -0.452F, 0.0156F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(105, 75).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(105, 91).mirror().addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6446F, -1.2601F, -4.6732F, -2.7234F, 0.1279F, 0.0136F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(95, 105).mirror().addBox(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.2829F, -0.7373F, -4.1575F, -2.7053F, 0.0005F, 0.292F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(100, 105).mirror().addBox(-0.525F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2829F, -0.7373F, -4.1575F, -2.7983F, -0.2747F, 0.9421F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(30, 105).addBox(-0.4003F, -0.2937F, 1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(25, 105).addBox(-0.4003F, 0.1063F, 1.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(20, 105).addBox(-0.4003F, 0.1063F, 1.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, -3.1374F, 0.2339F, 0.0179F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(76, 96).addBox(-0.787F, 0.0792F, 0.6371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.1129F, 0.2636F, -1.9611F, 2.8446F, 0.452F, -0.0156F));

		PartDefinition cube_r362 = Jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(76, 80).addBox(-0.787F, 0.2045F, -0.2372F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1129F, 0.2636F, -1.9611F, 2.9755F, 0.452F, -0.0156F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(81, 70).addBox(-0.787F, -0.1964F, -0.1761F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.1129F, 0.2636F, -1.9611F, 2.8883F, 0.452F, -0.0156F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(105, 55).addBox(-0.787F, 2.2715F, -0.4072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1129F, 0.2636F, -1.9611F, -2.1383F, 0.452F, -0.0156F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(105, 91).addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(105, 75).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7866F, -1.2601F, -4.6732F, -2.7234F, -0.1279F, -0.0136F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(100, 105).addBox(-0.475F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.425F, -0.7373F, -4.1575F, -2.7983F, 0.2747F, -0.9421F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(95, 105).addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.425F, -0.7373F, -4.1575F, -2.7053F, -0.0005F, -0.292F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(105, 41).addBox(-0.787F, 1.9753F, 1.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(35, 105).addBox(-0.787F, 1.5753F, 1.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1129F, 0.2636F, -1.9611F, -2.6532F, 0.452F, -0.0156F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(69, 96).addBox(-0.4003F, -0.9279F, 0.5936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, 2.884F, 0.2339F, 0.0179F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(106, 58).addBox(-0.4003F, -1.1986F, -0.0971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, 2.4389F, 0.2339F, 0.0179F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(5, 105).addBox(-0.4003F, -0.7524F, -1.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, 1.3481F, 0.2339F, 0.0179F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(90, 100).addBox(-0.4003F, -0.1986F, -0.7859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, 0.6063F, 0.2339F, 0.0179F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(92, 4).addBox(-0.4003F, -0.1974F, -1.8069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.3129F, 0.1636F, 0.5389F, -0.6023F, 0.2339F, 0.0179F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4684F, 6.5407F, -4.0884F, 0.3322F, 0.6267F, 0.5804F));

		PartDefinition cube_r374 = FrontFlipperR2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(85, 80).addBox(-1.5F, -0.5F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8048F, -0.1811F, -1.419F, 0.0F, 0.2705F, 0.0F));

		PartDefinition cube_r375 = FrontFlipperR2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(18, 80).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.4437F, -0.1811F, -2.9985F, 0.0F, -1.2566F, 0.0F));

		PartDefinition cube_r376 = FrontFlipperR2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(83, 85).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.9768F, -0.1811F, -0.2089F, 0.0F, -0.9512F, 0.0F));

		PartDefinition cube_r377 = FrontFlipperR2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(28, 99).addBox(0.175F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2412F, -0.1811F, -1.7191F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r378 = FrontFlipperR2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(79, 89).addBox(-1.925F, -0.5F, -0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2412F, -0.1811F, -1.7191F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r379 = FrontFlipperR2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(97, 96).addBox(-1.625F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2412F, -0.1811F, -1.7191F, 0.0F, -0.3403F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(81, 3).addBox(0.357F, -0.3972F, 0.7814F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(7.7697F, -0.2839F, -1.9413F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r380 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(95, 102).addBox(-0.2F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(3.857F, 0.1028F, 1.2814F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r381 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(102, 38).addBox(-0.2F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.857F, 0.1028F, 1.2814F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r382 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(10, 103).addBox(-0.55F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(100, 102).addBox(-0.55F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.857F, 0.1028F, 1.2814F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r383 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(36, 102).addBox(1.425F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 99).addBox(-0.175F, -0.5F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.832F, 0.1028F, 2.7749F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r384 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 90).addBox(-2.625F, -0.5F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.657F, 0.1028F, 1.9064F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r385 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(56, 101).addBox(-1.7F, -0.5F, -5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3666F, 0.1028F, 7.0647F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r386 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 101).addBox(-0.2F, -0.5F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3782F, 0.1028F, 1.7961F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r387 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(40, 9).addBox(0.0F, 0.0068F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2294F, 0.1156F, -0.3608F, -0.0014F, -0.323F, -0.0032F));

		PartDefinition cube_r388 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(40, 17).addBox(-4.0F, 0.0F, 0.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2722F, 0.1145F, -1.0595F, -0.0013F, -0.0612F, -0.0035F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR4 = Chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4684F, 6.5407F, -4.0884F, 0.5666F, 0.0943F, -0.0808F));

		PartDefinition cube_r389 = FrontFlipperR4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, -0.5F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.8048F, -0.1811F, -1.419F, 0.0F, -0.2705F, 0.0F));

		PartDefinition cube_r390 = FrontFlipperR4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.4437F, -0.1811F, -2.9985F, 0.0F, 1.2566F, 0.0F));

		PartDefinition cube_r391 = FrontFlipperR4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-4.9768F, -0.1811F, -0.2089F, 0.0F, 0.9512F, 0.0F));

		PartDefinition cube_r392 = FrontFlipperR4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(14, 100).addBox(-2.175F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.2412F, -0.1811F, -1.7191F, 0.0F, 0.384F, 0.0F));

		PartDefinition cube_r393 = FrontFlipperR4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(88, 89).addBox(-1.075F, -0.5F, -0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2412F, -0.1811F, -1.7191F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r394 = FrontFlipperR4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(97, 99).addBox(-0.375F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.2412F, -0.1811F, -1.7191F, 0.0F, 0.3403F, 0.0F));

		PartDefinition FrontFlipperMiddleR4 = FrontFlipperR4.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create().texOffs(81, 67).addBox(-4.357F, -0.3972F, 0.7814F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-7.7697F, -0.2839F, -1.9413F, 0.3587F, 1.0075F, 0.4173F));

		PartDefinition cube_r395 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(10, 106).addBox(-0.8F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-3.857F, 0.1028F, 1.2814F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r396 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(106, 9).addBox(-0.8F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.857F, 0.1028F, 1.2814F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r397 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(106, 6).addBox(-0.45F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(106, 3).addBox(-0.45F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.857F, 0.1028F, 1.2814F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r398 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(106, 0).addBox(-2.425F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 100).addBox(-1.825F, -0.5F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.832F, 0.1028F, 2.7749F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r399 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(90, 14).addBox(-0.375F, -0.5F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.657F, 0.1028F, 1.9064F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r400 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(105, 103).addBox(0.7F, -0.5F, -5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3666F, 0.1028F, 7.0647F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r401 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(105, 100).addBox(-0.8F, -0.5F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3782F, 0.1028F, 1.7961F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r402 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(40, 13).addBox(-6.0F, 0.0068F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2294F, 0.1156F, -0.3608F, -0.0014F, 0.323F, 0.0032F));

		PartDefinition cube_r403 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(59, 13).addBox(0.0F, 0.0F, 0.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2722F, 0.1145F, -1.0595F, -0.0013F, 0.0612F, 0.0035F));

		PartDefinition FrontFlipperEndR4 = FrontFlipperMiddleR4.addOrReplaceChild("FrontFlipperEndR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, 0.0F, 0.1309F, 0.0F));

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